import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public abstract class Class12 {

	@OriginalMember(owner = "client!en", name = "a", descriptor = "()Z")
	public boolean method3351() {
		return false;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIII)V")
	public abstract void method3353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!en", name = "b", descriptor = "()I")
	public abstract int method3355();

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!en;IIIZ)V")
	public void method3356(@OriginalArg(0) Class12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIIIIJILclient!id;)V")
	public abstract void method3357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class67_Sub1 arg10);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(III)Lclient!en;")
	public Class12 method3359() {
		return this;
	}
}
