import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public abstract class Class22 {

	@OriginalMember(owner = "client!h", name = "a", descriptor = "()I")
	public abstract int method4071();

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!h;IIIZ)V")
	public void method4072(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIIIJILclient!ko;)V")
	public abstract void method4073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class45_Sub2 arg10);

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(III)Lclient!h;")
	public Class22 method4074() {
		return this;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIII)V")
	public abstract void method4075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!h", name = "b", descriptor = "()Z")
	public boolean method4076() {
		return false;
	}
}
