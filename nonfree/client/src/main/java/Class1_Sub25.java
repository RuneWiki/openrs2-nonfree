import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public final class Class1_Sub25 extends Class1 {

	@OriginalMember(owner = "client!jq", name = "q", descriptor = "S")
	public short aShort46;

	static {
		new Class106("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
		new Class106("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
	}

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "()V")
	private Class1_Sub25() {
	}

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(S)V")
	public Class1_Sub25(@OriginalArg(0) short arg0) {
		this.aShort46 = arg0;
	}
}
