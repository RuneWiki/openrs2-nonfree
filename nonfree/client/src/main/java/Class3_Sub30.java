import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public final class Class3_Sub30 extends Class3 {

	@OriginalMember(owner = "client!ni", name = "l", descriptor = "[B")
	public final byte[] aByteArray55;

	static {
		new Class57("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "([B)V")
	public Class3_Sub30(@OriginalArg(0) byte[] arg0) {
		this.aByteArray55 = arg0;
	}
}
