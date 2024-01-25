import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static618 {

	@OriginalMember(owner = "client!uq", name = "M", descriptor = "Lclient!g;")
	public static final Class122 aClass122_19 = new Class122(1);

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(II)I")
	public static int method8342(@OriginalArg(1) int arg0) {
		@Pc(21) int local21 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(27) int local27 = arg0 * 6 - 61440;
		@Pc(36) int local36 = (arg0 * local27 >> 12) + 40960;
		return local36 * local21 >> 12;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(II[FIIFF[FIIII)V")
	public static void method8344(@OriginalArg(0) int arg0, @OriginalArg(2) float[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(5) int local5 = arg9 - arg8;
		@Pc(9) int local9 = arg0 - arg7;
		@Pc(17) int local17 = arg2 - arg10;
		@Pc(38) float local38 = arg1[0] * (float) local17 + (float) local9 * arg1[1] + arg1[2] * (float) local5;
		@Pc(59) float local59 = (float) local5 * arg1[5] + arg1[4] * (float) local9 + (float) local17 * arg1[3];
		@Pc(80) float local80 = (float) local17 * arg1[6] + (float) local9 * arg1[7] + arg1[8] * (float) local5;
		@Pc(96) float local96 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg5 != 1.0F) {
			local96 *= arg5;
		}
		@Pc(110) float local110 = local59 + arg4 + 0.5F;
		@Pc(115) float local115;
		if (arg3 == 1) {
			local115 = local96;
			local96 = -local110;
			local110 = local115;
		} else if (arg3 == 2) {
			local110 = -local110;
			local96 = -local96;
		} else if (arg3 == 3) {
			local115 = local96;
			local96 = local110;
			local110 = -local115;
		}
		arg6[1] = local110;
		arg6[0] = local96;
	}

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "(II)I")
	public static int method8347(@OriginalArg(1) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIIIII)V")
	public static void method8348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (Static336.aClass3_Sub41_18.aClass14_Sub9_4.method2998() != 0 && arg4 != 0 && Static217.anInt10315 < 50 && arg3 != -1) {
			Static2.aClass51Array1[Static217.anInt10315++] = new Class51((byte) 1, arg3, arg4, arg0, arg1, arg5, arg2, (Class34_Sub1) null);
		}
	}
}
