import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public abstract class Class14 {

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(III)Lclient!dn;")
	public Class14 method4088() {
		return this;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!dn;IIIZ)V")
	public void method4090(@OriginalArg(0) Class14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "()I")
	public abstract int method4091();

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "()Z")
	public boolean method4093() {
		return false;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIII)V")
	public abstract void method4094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIIIIIIJILclient!sa;)V")
	public abstract void method4097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class86_Sub1 arg10);
}
