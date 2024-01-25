import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public final class Class11_Sub31 extends Class11 {

	@OriginalMember(owner = "client!p", name = "m", descriptor = "I")
	public final int anInt4716;

	@OriginalMember(owner = "client!p", name = "l", descriptor = "I")
	public final int anInt4715;

	static {
		new Class117("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
		new Class117("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
	}

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(II)V")
	public Class11_Sub31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4716 = arg0;
		this.anInt4715 = arg1;
	}
}
