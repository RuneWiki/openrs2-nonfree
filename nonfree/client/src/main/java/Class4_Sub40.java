import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public abstract class Class4_Sub40 extends Class4 {

	@OriginalMember(owner = "client!qu", name = "i", descriptor = "I")
	public int anInt7583;

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "()V")
	private Class4_Sub40() {
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "()V")
	public abstract void method6276();

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lclient!ds;)I")
	public abstract int method6277(@OriginalArg(0) Class4_Sub13_Sub1 arg0);
}
