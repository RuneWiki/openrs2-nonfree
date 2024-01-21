import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public abstract class Class1_Sub18 extends Class1 {

	@OriginalMember(owner = "client!te", name = "x", descriptor = "I")
	public int anInt2654;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "()V")
	public abstract void method1844();

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!ge;)I")
	public abstract int method1845(@OriginalArg(0) Class1_Sub3_Sub2 arg0);
}
