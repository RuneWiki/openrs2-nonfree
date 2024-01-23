import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public abstract class Class11 {

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!km;IIIZ)V")
	public void method4296(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "()I")
	public abstract int method4297();

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(III)Lclient!km;")
	public Class11 method4298() {
		return this;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIIIIIJILclient!dh;)V")
	public abstract void method4299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class22_Sub3 arg10);

	@OriginalMember(owner = "client!km", name = "b", descriptor = "()Z")
	public boolean method4301() {
		return false;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIII)V")
	public abstract void method4302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);
}
