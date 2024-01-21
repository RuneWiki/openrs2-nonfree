import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public abstract class Class1_Sub23 extends Class1 {

	@OriginalMember(owner = "client!u", name = "u", descriptor = "I")
	public int anInt3965;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!ub;)I")
	public abstract int method2787(@OriginalArg(0) Class1_Sub11_Sub3 arg0);

	@OriginalMember(owner = "client!u", name = "a", descriptor = "()V")
	public abstract void method2788();
}
