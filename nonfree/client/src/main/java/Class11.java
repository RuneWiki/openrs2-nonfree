import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public final class Class11 {

	@OriginalMember(owner = "client!ap", name = "f", descriptor = "I")
	private final int anInt310;

	static {
		new Class32("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
	}

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(II)V")
	public Class11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt310 = arg0;
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(B)I")
	public int method258() {
		return this.anInt310;
	}

	@OriginalMember(owner = "client!ap", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
