import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public abstract class Class9 {

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "[I")
	public static int[] anIntArray385 = new int[4096];

	static {
		for (@Pc(4) int local4 = 0; local4 < 4096; local4++) {
			anIntArray385[local4] = Static59.method1141(local4);
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "()I")
	public abstract int method3587();

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIIIJILclient!nl;)V")
	public abstract void method3588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class96_Sub1 arg10);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIII)V")
	public abstract void method3593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)Lclient!sa;")
	public Class9 method3595() {
		return this;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!sa;IIIZ)V")
	public void method3596(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "()Z")
	public boolean method3597() {
		return false;
	}
}
