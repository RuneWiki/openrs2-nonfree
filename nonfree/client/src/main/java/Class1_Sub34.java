import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public final class Class1_Sub34 extends Class1 {

	@OriginalMember(owner = "client!pj", name = "t", descriptor = "I")
	public final int anInt5280;

	@OriginalMember(owner = "client!pj", name = "o", descriptor = "Z")
	public final boolean aBoolean475;

	@OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
	public final int anInt5276;

	@OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
	public final int anInt5275;

	@OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
	public final int anInt5277;

	@OriginalMember(owner = "client!pj", name = "u", descriptor = "I")
	public final int anInt5281;

	static {
		new Class142("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
		new Class142("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class1_Sub34(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt5280 = arg4;
		this.aBoolean475 = arg5;
		this.anInt5276 = arg1;
		this.anInt5275 = arg3;
		this.anInt5277 = arg0;
		this.anInt5281 = arg2;
	}
}
