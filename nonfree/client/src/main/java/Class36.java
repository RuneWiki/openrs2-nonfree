import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public abstract class Class36 {

	static {
		new Class15("Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)I")
	public abstract int method573();

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(B)I")
	public abstract int method576();

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Z)C")
	public abstract char method577();

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(Z)J")
	public abstract long method578();

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)Z")
	public abstract boolean method579();
}
