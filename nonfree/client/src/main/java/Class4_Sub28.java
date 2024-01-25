import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public abstract class Class4_Sub28 extends Class4 {

	@OriginalMember(owner = "client!no", name = "j", descriptor = "I")
	public int anInt4442;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "()V")
	private Class4_Sub28() {
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "()V")
	public abstract void method3541();

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!iq;)I")
	public abstract int method3542(@OriginalArg(0) Class4_Sub14_Sub2 arg0);
}
