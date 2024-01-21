import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public abstract class Class6 {

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "()I")
	public abstract int method2984();

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "()Z")
	public boolean method2986() {
		return false;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)Lclient!wg;")
	public Class6 method2988() {
		return this;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIIIIJ)V")
	public abstract void method2989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8);

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!wg;IIIZ)V")
	public void method2990(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
	}
}
