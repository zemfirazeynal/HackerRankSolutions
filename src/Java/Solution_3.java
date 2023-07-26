package Java;

import java.util.Scanner;

public class Solution_3 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();

        scanner.close();
        if(N%2!=0){
            System.out.println("Weird");
        }
        if(N%2==0){
            if((N>=2 && N<=5) || (N>20)){
                System.out.println("Not Weird");
            } if(N>=6 && N<=20){
                System.out.println("Weird");
            }
        }
    }
}
