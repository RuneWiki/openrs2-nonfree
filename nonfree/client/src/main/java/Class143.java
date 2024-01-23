import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public abstract class Class143 {

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V")
	protected Class143() {
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)I")
	public abstract int method3813(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(II)V")
	public abstract void method3815(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Z)Lclient!wm;")
	public abstract Class181 method3816();

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "(II)[B")
	public abstract byte[] method3820(@OriginalArg(1) int arg0);
}
