import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public final class Class1_Sub30 extends Class1 {

	@OriginalMember(owner = "client!lt", name = "t", descriptor = "I")
	public final int anInt4398;

	@OriginalMember(owner = "client!lt", name = "r", descriptor = "I")
	public final int anInt4396;

	static {
		new Class142("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(II)V")
	public Class1_Sub30(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4398 = arg1;
		this.anInt4396 = arg0;
	}
}
