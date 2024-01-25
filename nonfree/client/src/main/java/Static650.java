import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static650 {

	@OriginalMember(owner = "client!w", name = "D", descriptor = "I")
	public static int anInt2304;

	@OriginalMember(owner = "client!w", name = "v", descriptor = "I")
	public static int anInt2312;

	@OriginalMember(owner = "client!w", name = "C", descriptor = "Lclient!la;")
	public static Class208 aClass208_32;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IZI)Z")
	public static boolean method2003(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 1000 && arg0 < 1000) {
			return true;
		} else if (arg1 >= 1000 || arg0 >= 1000) {
			return arg1 >= 1000 && arg0 >= 1000;
		} else if (Static411.method6196(arg0)) {
			return true;
		} else {
			return !Static411.method6196(arg1);
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIFIIIFIBI[F[F)V")
	public static void method2004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float[] arg9, @OriginalArg(11) float[] arg10) {
		@Pc(5) int local5 = arg7 - arg3;
		@Pc(9) int local9 = arg5 - arg8;
		@Pc(13) int local13 = arg0 - arg4;
		@Pc(38) float local38 = (float) local5 * arg9[2] + (float) local13 * arg9[1] + (float) local9 * arg9[0];
		@Pc(59) float local59 = arg9[5] * (float) local5 + (float) local13 * arg9[4] + arg9[3] * (float) local9;
		@Pc(80) float local80 = arg9[8] * (float) local5 + (float) local9 * arg9[6] + (float) local13 * arg9[7];
		@Pc(98) float local98 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg6 != 1.0F) {
			local98 *= arg6;
		}
		@Pc(112) float local112 = local59 + arg2 + 0.5F;
		@Pc(135) float local135;
		if (arg1 == 1) {
			local135 = local98;
			local98 = -local112;
			local112 = local135;
		} else if (arg1 == 2) {
			local112 = -local112;
			local98 = -local98;
		} else if (arg1 == 3) {
			local135 = local98;
			local98 = local112;
			local112 = -local135;
		}
		arg10[0] = local98;
		arg10[1] = local112;
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(I)V")
	public static void method2006() {
		Static296.aClass203_15 = null;
		Static615.anIntArray561 = null;
		Static422.aClass203_12 = null;
		Static314.anInt5581 = -1;
		Static651.anInterface6_1 = null;
		Static417.anInt7207 = -1;
		Static612.aClass203_14 = null;
		Static376.anInterface6Array1 = null;
		Static617.aClass57_14 = null;
		Static659.anInt10597 = -1;
		Static522.anInt8830 = -1;
		Static496.aClass339_3.method8425();
	}
}
