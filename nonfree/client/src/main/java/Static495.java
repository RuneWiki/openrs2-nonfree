import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static495 {

	@OriginalMember(owner = "client!un", name = "x", descriptor = "[[B")
	public static byte[][] aByteArrayArray26;

	@OriginalMember(owner = "client!un", name = "n", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_428 = new Class305(84, 28);

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(III)Z")
	public static boolean method7591(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IB)Z")
	public static boolean method7593(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIFIBI[FII)V")
	public static void method7594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(5) int local5 = arg5 - arg2;
		@Pc(21) int local21 = arg4 - arg1;
		@Pc(25) int local25 = arg8 - arg7;
		@Pc(46) float local46 = (float) local21 * arg6[2] + (float) local5 * arg6[0] + arg6[1] * (float) local25;
		@Pc(67) float local67 = arg6[5] * (float) local21 + arg6[4] * (float) local25 + arg6[3] * (float) local5;
		@Pc(88) float local88 = arg6[8] * (float) local21 + (float) local5 * arg6[6] + arg6[7] * (float) local25;
		@Pc(103) float local103 = (float) Math.sqrt((double) (local67 * local67 + local46 * local46 + local88 * local88));
		@Pc(114) float local114 = (float) Math.atan2((double) local46, (double) local88) / 6.2831855F + 0.5F;
		@Pc(127) float local127 = arg3 + (float) Math.asin((double) (local67 / local103)) / 3.1415927F + 0.5F;
		@Pc(142) float local142;
		if (arg0 == 1) {
			local142 = local114;
			local114 = -local127;
			local127 = local142;
		} else if (arg0 == 2) {
			local114 = -local114;
			local127 = -local127;
		} else if (arg0 == 3) {
			local142 = local114;
			local114 = local127;
			local127 = -local142;
		}
		Static425.aFloat147 = local127;
		Static440.aFloat148 = local114;
	}
}
