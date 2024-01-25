import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIFIIII[FIFIFI)V")
	public static void method3822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8, @OriginalArg(10) int arg9, @OriginalArg(11) float arg10, @OriginalArg(12) int arg11) {
		@Pc(9) int local9 = arg0 - arg9;
		@Pc(13) int local13 = arg7 - arg4;
		@Pc(17) int local17 = arg1 - arg5;
		@Pc(38) float local38 = (float) local17 * arg6[0] + (float) local9 * arg6[1] + arg6[2] * (float) local13;
		@Pc(76) float local76 = (float) local13 * arg6[5] + arg6[4] * (float) local9 + arg6[3] * (float) local17;
		@Pc(97) float local97 = arg6[8] * (float) local13 + arg6[7] * (float) local9 + arg6[6] * (float) local17;
		@Pc(113) float local113;
		@Pc(119) float local119;
		if (arg11 == 0) {
			local113 = arg8 + local38 + 0.5F;
			local119 = arg10 + 0.5F - local97;
		} else if (arg11 == 1) {
			local113 = local38 + arg8 + 0.5F;
			local119 = arg10 + local97 + 0.5F;
		} else if (arg11 == 2) {
			local119 = arg2 + 0.5F - local76;
			local113 = arg8 + 0.5F - local38;
		} else if (arg11 == 3) {
			local119 = arg2 + 0.5F - local76;
			local113 = local38 + arg8 + 0.5F;
		} else if (arg11 == 4) {
			local113 = arg10 + local97 + 0.5F;
			local119 = arg2 + 0.5F - local76;
		} else {
			local119 = arg2 + 0.5F - local76;
			local113 = arg10 + 0.5F - local97;
		}
		@Pc(216) float local216;
		if (arg3 == 1) {
			local216 = local113;
			local113 = -local119;
			local119 = local216;
		} else if (arg3 == 2) {
			local113 = -local113;
			local119 = -local119;
		} else if (arg3 == 3) {
			local216 = local113;
			local113 = local119;
			local119 = -local216;
		}
		Static84.aFloat38 = local113;
		Static87.aFloat39 = local119;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V")
	public static void method3823() {
		Static76.anInt1848 = -1;
		Static243.aClass10_15 = null;
	}
}
