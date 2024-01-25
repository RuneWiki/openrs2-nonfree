import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public final class Class153_Sub2_Sub1 extends Class153_Sub2 {

	@OriginalMember(owner = "client!vt", name = "y", descriptor = "I")
	public final int anInt9328;

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lclient!tca;Lclient!vea;IIIIIIIIIIIIII)V")
	public Class153_Sub2_Sub1(@OriginalArg(0) Class322 arg0, @OriginalArg(1) Class347 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
		this.anInt9328 = arg15;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)Lclient!mh;")
	@Override
	public Class225 method7443() {
		return Static208.aClass225_12;
	}
}
