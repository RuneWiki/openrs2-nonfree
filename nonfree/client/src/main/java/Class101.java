import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public final class Class101 {

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
	public int anInt2413;

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "I")
	public int anInt2414;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "Lclient!gd;")
	public final Class95 aClass95_1 = new Class95();

	@OriginalMember(owner = "client!gn", name = "i", descriptor = "Z")
	public boolean aBoolean192 = false;

	static {
		new Class96("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
	}
}
