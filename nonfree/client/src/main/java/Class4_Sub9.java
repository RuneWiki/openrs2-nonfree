import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public abstract class Class4_Sub9 extends Class4 {

	@OriginalMember(owner = "client!es", name = "n", descriptor = "I")
	public int anInt2146;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "()V")
	private Class4_Sub9() {
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "()V")
	public abstract void method1608();

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Lclient!jj;)I")
	public abstract int method1609(@OriginalArg(0) Class4_Sub18_Sub1 arg0);
}
