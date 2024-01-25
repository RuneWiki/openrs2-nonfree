import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public final class Class81 {

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
	public final int anInt2629;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString20;

	static {
		new Class106("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
	}

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class81(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt2629 = arg1;
		this.aString20 = arg0;
	}

	@OriginalMember(owner = "client!hj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
