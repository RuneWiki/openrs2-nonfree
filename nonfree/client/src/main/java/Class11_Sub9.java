import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class Class11_Sub9 extends Class11 {

	@OriginalMember(owner = "client!da", name = "j", descriptor = "I")
	public int anInt951;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
	private Class11_Sub9() {
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "()V")
	public abstract void method718();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!nh;)I")
	public abstract int method719(@OriginalArg(0) Class11_Sub10_Sub3 arg0);
}
