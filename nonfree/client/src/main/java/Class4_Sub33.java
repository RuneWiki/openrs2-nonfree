import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public abstract class Class4_Sub33 extends Class4 {

	@OriginalMember(owner = "client!pba", name = "j", descriptor = "I")
	public int anInt7523;

	@OriginalMember(owner = "client!pba", name = "<init>", descriptor = "()V")
	private Class4_Sub33() {
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(Lclient!bb;)I")
	public abstract int method6215(@OriginalArg(0) Class4_Sub7_Sub1 arg0);

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "()V")
	public abstract void method6216();
}
