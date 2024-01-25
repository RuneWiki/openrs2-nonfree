import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public abstract class Class4_Sub31 extends Class4 {

	@OriginalMember(owner = "client!ol", name = "o", descriptor = "I")
	public int anInt4638;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V")
	private Class4_Sub31() {
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!lk;)I")
	public abstract int method4099(@OriginalArg(0) Class4_Sub1_Sub3 arg0);

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "()V")
	public abstract void method4100();
}
