import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public final class Class33_Sub2_Sub1 extends Class33_Sub2 {

	@OriginalMember(owner = "client!oca", name = "z", descriptor = "I")
	public final int anInt7265;

	@OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Lclient!al;Lclient!mfa;IIIIIIIIIIIIII)V")
	public Class33_Sub2_Sub1(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class239 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
		this.anInt7265 = arg15;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)Lclient!hfa;")
	@Override
	public Class152 method9627() {
		return Static711.aClass152_10;
	}
}
