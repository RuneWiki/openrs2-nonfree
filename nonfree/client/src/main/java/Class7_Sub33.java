import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public abstract class Class7_Sub33 extends Class7 {

	@OriginalMember(owner = "client!rm", name = "l", descriptor = "I")
	public int anInt5455;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "()V")
	private Class7_Sub33() {
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "()V")
	public abstract void method4605();

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!np;)I")
	public abstract int method4606(@OriginalArg(0) Class7_Sub8_Sub3 arg0);
}
