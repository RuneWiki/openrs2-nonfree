import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public final class Class4_Sub21_Sub2 extends Class4_Sub21 {

	static {
		new Class83("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(IIIIIF)V")
	public Class4_Sub21_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIB)V")
	@Override
	public void method3163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.anInt3866 = arg1;
		super.anInt3856 = arg2;
		super.anInt3860 = arg0;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IF)V")
	@Override
	public void method3158(@OriginalArg(1) float arg0) {
		super.aFloat125 = arg0;
	}
}
