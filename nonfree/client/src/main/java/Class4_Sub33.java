import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public abstract class Class4_Sub33 extends Class4 {

	@OriginalMember(owner = "client!wm", name = "o", descriptor = "I")
	public int anInt6075;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "()V")
	public abstract void method4847();

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!lo;)I")
	public abstract int method4848(@OriginalArg(0) Class4_Sub6_Sub3 arg0);
}
