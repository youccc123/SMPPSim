import com.seleniumsoftware.SMPPSim.SMPPSim;

public class IniciarSimulador {
	public static void main(String[] arg) {
		System.out.println("INICIAMOS EL SIMULADOR SMPP");

		//TOMAMOS LOS PARAMETROS
		String[] smppArgs = new String[1];
		smppArgs[0]= "conf\\smppsim.props";
		
		try {
			SMPPSim.main(smppArgs);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
