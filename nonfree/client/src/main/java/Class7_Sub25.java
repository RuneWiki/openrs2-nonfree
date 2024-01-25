import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public abstract class Class7_Sub25 extends Class7 {

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
	public int anInt3091;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V")
	private Class7_Sub25() {
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "()V")
	public abstract void method2500();

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!hw;)I")
	public abstract int method2501(@OriginalArg(0) Class7_Sub8_Sub1 arg0);
}
