import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public final class Class2_Sub1_Sub16 extends Class2_Sub1 {

	@OriginalMember(owner = "client!um", name = "F", descriptor = "Lclient!us;")
	public final Class12_Sub1_Sub6 aClass12_Sub1_Sub6_1;

	static {
		new Class221("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
	}

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lclient!us;)V")
	public Class2_Sub1_Sub16(@OriginalArg(0) Class12_Sub1_Sub6 arg0) {
		this.aClass12_Sub1_Sub6_1 = arg0;
	}
}
