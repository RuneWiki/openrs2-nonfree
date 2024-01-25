import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public abstract class Class4_Sub26 extends Class4 {

	@OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
	public int anInt4745;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V")
	private Class4_Sub26() {
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "()V")
	public abstract void method4039();

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!tc;)I")
	public abstract int method4040(@OriginalArg(0) Class4_Sub7_Sub4 arg0);
}
