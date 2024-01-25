import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static230 {

	@OriginalMember(owner = "client!nm", name = "t", descriptor = "Lclient!hi;")
	public static Class96 aClass96_4;

	@OriginalMember(owner = "client!nm", name = "x", descriptor = "Lclient!eu;")
	public static Class71 aClass71_1;

	@OriginalMember(owner = "client!nm", name = "o", descriptor = "Lclient!co;")
	public static final Class41 aClass41_53 = new Class41(8);

	@OriginalMember(owner = "client!nm", name = "q", descriptor = "I")
	public static int anInt4626 = 0;

	@OriginalMember(owner = "client!nm", name = "s", descriptor = "Z")
	public static boolean aBoolean333 = false;

	@OriginalMember(owner = "client!nm", name = "u", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_162 = new Class62("M", "M", "M", "M");

	@OriginalMember(owner = "client!nm", name = "v", descriptor = "I")
	public static int anInt4628 = 0;

	@OriginalMember(owner = "client!nm", name = "w", descriptor = "[I")
	public static int[] anIntArray383 = new int[2];

	@OriginalMember(owner = "client!nm", name = "y", descriptor = "Lclient!vf;")
	public static final Class238 aClass238_23 = new Class238();

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILclient!oj;IIIIIIBII[[[BI)V")
	public static void method4175(@OriginalArg(0) int arg0, @OriginalArg(1) Class48 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) byte[][][] arg10, @OriginalArg(12) int arg11) {
		if (arg2 == 0 || arg0 == 0) {
			return;
		}
		if (arg2 == 9) {
			arg2 = 1;
			arg9 = arg9 + 1 & 0x3;
		}
		if (arg2 == 10) {
			arg2 = 1;
			arg9 = arg9 + 3 & 0x3;
		}
		if (arg2 == 11) {
			arg2 = 8;
			arg9 = arg9 + 3 & 0x3;
		}
		arg1.method2522(arg3, arg5, arg8, arg7, arg4, arg6, arg10[arg2 - 1][arg9], arg0, arg11);
	}
}
