import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public abstract class Class3_Sub51 extends Class3 {

	@OriginalMember(owner = "client!st", name = "n", descriptor = "I")
	public int anInt9095;

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "()V")
	private Class3_Sub51() {
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Lclient!bd;)I")
	public abstract int method7945(@OriginalArg(0) Class3_Sub1_Sub2 arg0);

	@OriginalMember(owner = "client!st", name = "a", descriptor = "()V")
	public abstract void method7946();
}
