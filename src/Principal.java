import java.util.Scanner;

public class Principal {

    public static void main(String[] args){

        Scanner scanner = new Scanner (System.in);
        Calculus ca = new Calculus();

        System.out.println("Escolha a opção entre 1-4");
        int escolha = scanner.nextInt();

        if (escolha > 0 && escolha < 5) {

            System.out.println("Digite o primeiro Número");
        int n1= scanner.nextInt();
        ca.setNum1(n1);

        System.out.println("Digite o segundo Número");
        int n2= scanner.nextInt();
        ca.setNum2(n2);
        
        }

        


     

        //Laço case - escolha entao

        switch (escolha) {
            case 1 : System.out.println("Voce escolheu somar: " + ca.soma(ca.getNum1(),ca.getNum2()));
                 break;

            case 2 : System.out.println("Voce escolheu subtrair: " + ca.subtracao(ca.getNum1(), ca.getNum2()));
                 break;  
                 
            case 3 : System.out.println("Voce escolheu dividir: " + ca.divisao(ca.getNum1(), ca.getNum2()));
                 break;  
                 
            case 4 : System.out.println("Voce escolheu multiplicar: " + ca.multiplicacao(ca.getNum1(), ca.getNum2()));
                 break;     
        
        
        
            default:System.out.println("Nenhuma das opções");
                break;
        }
    }
}