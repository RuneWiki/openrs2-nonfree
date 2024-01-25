import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public abstract class Class30_Sub1 extends Class30 {

	static {
		new Class182("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
	}

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
	protected Class30_Sub1() {
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)Lclient!dl;")
	public abstract Class4_Sub2 method3802();
}
