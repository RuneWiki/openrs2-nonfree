import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public abstract class Class5_Sub21 extends Class5 {

	@OriginalMember(owner = "client!efa", name = "i", descriptor = "I")
	public int anInt2187;

	@OriginalMember(owner = "client!efa", name = "<init>", descriptor = "()V")
	private Class5_Sub21() {
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(Lclient!fe;)I")
	public abstract int method1983(@OriginalArg(0) Class5_Sub14_Sub3 arg0);

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "()V")
	public abstract void method1984();
}
