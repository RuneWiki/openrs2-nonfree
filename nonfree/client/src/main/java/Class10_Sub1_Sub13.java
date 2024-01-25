import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public abstract class Class10_Sub1_Sub13 extends Class10_Sub1 {

	@OriginalMember(owner = "client!nr", name = "x", descriptor = "Z")
	public boolean aBoolean381;

	@OriginalMember(owner = "client!nr", name = "y", descriptor = "Z")
	public boolean aBoolean382;

	@OriginalMember(owner = "client!nr", name = "z", descriptor = "Z")
	public volatile boolean aBoolean383 = true;

	static {
		new Class182("clan_chat", "clanchat", "conversation_clan", "clan_chat");
		new Class182("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "(I)I")
	public abstract int method4708();

	@OriginalMember(owner = "client!nr", name = "e", descriptor = "(I)[B")
	public abstract byte[] method4709();
}
