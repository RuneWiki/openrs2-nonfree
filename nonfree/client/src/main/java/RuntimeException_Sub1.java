import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public final class RuntimeException_Sub1 extends RuntimeException {

	@OriginalMember(owner = "client!fba", name = "c", descriptor = "Ljava/lang/String;")
	public String aString60;

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "Ljava/lang/Throwable;")
	public final Throwable aThrowable1;

	static {
		new Class202("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
		new Class202("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
	}

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	public RuntimeException_Sub1(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString60 = arg1;
		this.aThrowable1 = arg0;
	}
}
