import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!fn", name = "o", descriptor = "J")
	public static long aLong65;

	@OriginalMember(owner = "client!fn", name = "i", descriptor = "I")
	public static int anInt2187 = 0;

	@OriginalMember(owner = "client!fn", name = "p", descriptor = "Lclient!nl;")
	public static final Class173 aClass173_1 = new Class173();

	@OriginalMember(owner = "client!fn", name = "r", descriptor = "[I")
	public static final int[] anIntArray121 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!fn", name = "t", descriptor = "[[I")
	public static final int[][] anIntArrayArray12 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!fn", name = "d", descriptor = "(I)Lclient!dk;")
	public static Class50_Sub1 method1750() {
		Static9.anInt205 = 0;
		return Static239.method4850();
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IFZIIIFI[FFIII)V")
	public static void method1751(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float[] arg7, @OriginalArg(9) float arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(5) int local5 = arg3 - arg11;
		@Pc(13) int local13 = arg9 - arg6;
		@Pc(17) int local17 = arg0 - arg10;
		@Pc(38) float local38 = arg7[1] * (float) local17 + (float) local5 * arg7[0] + arg7[2] * (float) local13;
		@Pc(59) float local59 = (float) local5 * arg7[3] + arg7[4] * (float) local17 + arg7[5] * (float) local13;
		@Pc(80) float local80 = (float) local17 * arg7[7] + arg7[6] * (float) local5 + (float) local13 * arg7[8];
		@Pc(98) float local98;
		@Pc(92) float local92;
		if (arg2 == 0) {
			local92 = arg5 + 0.5F - local80;
			local98 = arg1 + local38 + 0.5F;
		} else if (arg2 == 1) {
			local92 = arg5 + local80 + 0.5F;
			local98 = local38 + arg1 + 0.5F;
		} else if (arg2 == 2) {
			local92 = arg8 + 0.5F - local59;
			local98 = arg1 + 0.5F - local38;
		} else if (arg2 == 3) {
			local98 = arg1 + local38 + 0.5F;
			local92 = arg8 + 0.5F - local59;
		} else if (arg2 == 4) {
			local98 = arg5 + local80 + 0.5F;
			local92 = arg8 + 0.5F - local59;
		} else {
			local98 = arg5 + 0.5F - local80;
			local92 = arg8 + 0.5F - local59;
		}
		@Pc(197) float local197;
		if (arg4 == 1) {
			local197 = local98;
			local98 = -local92;
			local92 = local197;
		} else if (arg4 == 2) {
			local92 = -local92;
			local98 = -local98;
		} else if (arg4 == 3) {
			local197 = local98;
			local98 = local92;
			local92 = -local197;
		}
		Static373.aFloat147 = local98;
		Static215.aFloat89 = local92;
	}
}
