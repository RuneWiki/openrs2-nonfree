import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public final class Class3_Sub10_Sub4_Sub1 extends Class3_Sub10_Sub4 {

	@OriginalMember(owner = "client!df", name = "B", descriptor = "Ljava/lang/Object;")
	private final Object anObject2;

	static {
		new Class67("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
	}

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!uk;Ljava/lang/Object;I)V")
	public Class3_Sub10_Sub4_Sub1(@OriginalArg(0) Interface18 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject2 = arg1;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6666() {
		return false;
	}

	@OriginalMember(owner = "client!df", name = "g", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method6668() {
		return this.anObject2;
	}
}
