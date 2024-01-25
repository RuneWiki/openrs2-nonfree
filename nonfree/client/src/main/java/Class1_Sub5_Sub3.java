import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public abstract class Class1_Sub5_Sub3 extends Class1_Sub5 {

	@OriginalMember(owner = "client!hc", name = "C", descriptor = "Lclient!fr;")
	public final Interface3 anInterface3_3;

	@OriginalMember(owner = "client!hc", name = "y", descriptor = "I")
	public final int anInt1963;

	static {
		new Class119("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
	}

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lclient!fr;I)V")
	protected Class1_Sub5_Sub3(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1) {
		this.anInterface3_3 = arg0;
		this.anInt1963 = arg1;
	}

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method1628();

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "(I)Z")
	public abstract boolean method1629();
}
