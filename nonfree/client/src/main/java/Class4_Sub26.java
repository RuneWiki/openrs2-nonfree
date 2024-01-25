import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public abstract class Class4_Sub26 extends Class4 {

	@OriginalMember(owner = "client!ih", name = "q", descriptor = "I")
	public int anInt4557;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V")
	private Class4_Sub26() {
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!op;)I")
	public abstract int method3525(@OriginalArg(0) Class4_Sub21_Sub3 arg0);

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "()V")
	public abstract void method3526();
}
