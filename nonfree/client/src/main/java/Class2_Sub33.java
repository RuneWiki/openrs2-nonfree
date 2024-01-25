import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public abstract class Class2_Sub33 extends Class2 {

	@OriginalMember(owner = "client!os", name = "p", descriptor = "I")
	public int anInt4554;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "()V")
	private Class2_Sub33() {
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "()V")
	public abstract void method4090();

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!aj;)I")
	public abstract int method4091(@OriginalArg(0) Class2_Sub3_Sub1 arg0);
}
