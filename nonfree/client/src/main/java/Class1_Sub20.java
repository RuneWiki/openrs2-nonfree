import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public abstract class Class1_Sub20 extends Class1 {

	@OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
	public int anInt2456;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!uc;)I")
	public abstract int method1624(@OriginalArg(0) Class1_Sub4_Sub4 arg0);

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "()V")
	public abstract void method1625();
}
