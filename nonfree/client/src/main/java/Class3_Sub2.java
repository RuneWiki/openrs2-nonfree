import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public abstract class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
	protected int anInt6421;

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
	protected final int anInt6424;

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
	public final int anInt6427;

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
	protected int anInt6426;

	static {
		new Class134("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(IIII)V")
	protected Class3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6421 = arg2;
		this.anInt6424 = arg1;
		this.anInt6427 = arg3;
		this.anInt6426 = arg0;
	}
}
