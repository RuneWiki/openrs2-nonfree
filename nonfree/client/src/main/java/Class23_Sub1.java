import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public abstract class Class23_Sub1 extends Class23 {

	static {
		new Class189("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
		new Class189("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
	}

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
	protected Class23_Sub1() {
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)Lclient!rd;")
	public abstract Class112_Sub4 method4740();
}
