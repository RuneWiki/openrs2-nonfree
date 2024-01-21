import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public abstract class Class4_Sub23 extends Class4 {

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
	public int anInt3012;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!h;)I")
	public abstract int method2130(@OriginalArg(0) Class4_Sub2_Sub3 arg0);

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "()V")
	public abstract void method2131();
}
