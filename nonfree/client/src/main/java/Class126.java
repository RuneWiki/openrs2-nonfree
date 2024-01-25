import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public abstract class Class126 {

	static {
		new Class57("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Z)[B")
	public abstract byte[] method3095();

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "([BB)V")
	public abstract void method3097(@OriginalArg(0) byte[] arg0);
}
