import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public abstract class Class2_Sub34 extends Class2 {

	@OriginalMember(owner = "client!jh", name = "n", descriptor = "I")
	public int anInt5230;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
	private Class2_Sub34() {
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "()V")
	public abstract void method4753();

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!pj;)I")
	public abstract int method4754(@OriginalArg(0) Class2_Sub26_Sub4 arg0);
}
