import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public abstract class Class87 {

	static {
		new Class209("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
	}

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V")
	protected Class87() {
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIF[FFIIFF)V")
	public abstract void method2089(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) float[] arg3, @OriginalArg(6) float arg4, @OriginalArg(9) float arg5, @OriginalArg(10) float arg6);
}
