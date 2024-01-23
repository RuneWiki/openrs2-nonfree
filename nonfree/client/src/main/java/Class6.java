import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public abstract class Class6 {

	@OriginalMember(owner = "client!j", name = "a", descriptor = "()I")
	public abstract int method3833();

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(III)Lclient!j;")
	public Class6 method3834() {
		return this;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "()Z")
	public boolean method3835() {
		return false;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIIIIJILclient!pe;)V")
	public abstract void method3838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class91_Sub1 arg10);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V")
	public abstract void method3839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!j;IIIZ)V")
	public void method3840(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
	}
}
