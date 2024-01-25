import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public abstract class Class14_Sub21 extends Class14 {

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
	public int anInt3024;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
	private Class14_Sub21() {
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "()V")
	public abstract void method2469();

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!nr;)I")
	public abstract int method2470(@OriginalArg(0) Class14_Sub5_Sub3 arg0);
}
