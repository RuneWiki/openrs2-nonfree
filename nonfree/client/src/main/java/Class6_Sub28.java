import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public abstract class Class6_Sub28 extends Class6 {

	@OriginalMember(owner = "client!od", name = "o", descriptor = "I")
	public int anInt5098;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
	private Class6_Sub28() {
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!uh;)I")
	public abstract int method4270(@OriginalArg(0) Class6_Sub4_Sub4 arg0);

	@OriginalMember(owner = "client!od", name = "a", descriptor = "()V")
	public abstract void method4271();
}
