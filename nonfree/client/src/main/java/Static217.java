import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static217 {

	@OriginalMember(owner = "client!kh", name = "F", descriptor = "[Lclient!o;")
	public static Class49[] aClass49Array7;

	@OriginalMember(owner = "client!kh", name = "G", descriptor = "F")
	public static float aFloat90;

	@OriginalMember(owner = "client!kh", name = "p", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_61 = new Class194(49, 3);

	@OriginalMember(owner = "client!kh", name = "L", descriptor = "I")
	public static int anInt3644 = 0;

	@OriginalMember(owner = "client!kh", name = "O", descriptor = "Lclient!pt;")
	public static Class197 aClass197_2 = null;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIIILclient!za;III[[[BI)V")
	public static void method2885(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class200 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) byte[][][] arg10, @OriginalArg(12) int arg11) {
		if (arg11 == 0 || arg0 == 0) {
			return;
		}
		if (arg11 == 9) {
			arg11 = 1;
			arg4 = arg4 + 1 & 0x3;
		}
		if (arg11 == 10) {
			arg11 = 1;
			arg4 = arg4 + 3 & 0x3;
		}
		if (arg11 == 11) {
			arg11 = 8;
			arg4 = arg4 + 3 & 0x3;
		}
		arg6.K(arg3, arg9, arg2, arg5, arg8, arg7, arg10[arg11 - 1][arg4], arg0, arg1);
	}
}
