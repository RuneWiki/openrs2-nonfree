import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public abstract class Class6_Sub36 extends Class6 {

	@OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
	public int anInt5618;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
	private Class6_Sub36() {
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!sd;)I")
	public abstract int method5096(@OriginalArg(0) Class6_Sub12_Sub3 arg0);

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "()V")
	public abstract void method5097();
}
