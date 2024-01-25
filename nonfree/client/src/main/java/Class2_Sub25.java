import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public abstract class Class2_Sub25 extends Class2 {

	@OriginalMember(owner = "client!km", name = "q", descriptor = "I")
	public int anInt3424;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "()V")
	private Class2_Sub25() {
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "()V")
	public abstract void method3147();

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!ab;)I")
	public abstract int method3148(@OriginalArg(0) Class2_Sub2_Sub1 arg0);
}
