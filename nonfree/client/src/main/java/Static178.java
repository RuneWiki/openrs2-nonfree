import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!gda", name = "c", descriptor = "Lclient!nd;")
	public static Class238 aClass238_289;

	@OriginalMember(owner = "client!gda", name = "f", descriptor = "Lclient!nl;")
	public static Interface18 anInterface18_12;

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(III[J[I)V")
	public static void method8633(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(10) int local10 = (arg0 + arg1) / 2;
		@Pc(12) int local12 = arg0;
		@Pc(16) long local16 = arg2[local10];
		arg2[local10] = arg2[arg1];
		arg2[arg1] = local16;
		@Pc(30) int local30 = arg3[local10];
		arg3[local10] = arg3[arg1];
		arg3[arg1] = local30;
		@Pc(50) int local50 = ~local16 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(52) int local52 = arg0; local52 < arg1; local52++) {
			if (arg2[local52] < (long) (local52 & local50) + local16) {
				@Pc(73) long local73 = arg2[local52];
				arg2[local52] = arg2[local12];
				arg2[local12] = local73;
				@Pc(87) int local87 = arg3[local52];
				arg3[local52] = arg3[local12];
				arg3[local12++] = local87;
			}
		}
		arg2[arg1] = arg2[local12];
		arg2[local12] = local16;
		arg3[arg1] = arg3[local12];
		arg3[local12] = local30;
		method8633(arg0, local12 - 1, arg2, arg3);
		method8633(local12 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(II[FIIIF[FIII)V")
	public static void method8646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(9) int local9 = arg3 - arg8;
		@Pc(13) int local13 = arg7 - arg9;
		@Pc(17) int local17 = arg0 - arg4;
		@Pc(38) float local38 = arg2[1] * (float) local9 + (float) local13 * arg2[0] + arg2[2] * (float) local17;
		@Pc(59) float local59 = arg2[5] * (float) local17 + (float) local9 * arg2[4] + (float) local13 * arg2[3];
		@Pc(80) float local80 = (float) local13 * arg2[6] + arg2[7] * (float) local9 + arg2[8] * (float) local17;
		@Pc(95) float local95 = (float) Math.sqrt((double) (local59 * local59 + local38 * local38 + local80 * local80));
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(119) float local119 = (float) Math.asin((double) (local59 / local95)) / 3.1415927F + arg5 + 0.5F;
		@Pc(124) float local124;
		if (arg1 == 1) {
			local124 = local106;
			local106 = -local119;
			local119 = local124;
		} else if (arg1 == 2) {
			local119 = -local119;
			local106 = -local106;
		} else if (arg1 == 3) {
			local124 = local106;
			local106 = local119;
			local119 = -local124;
		}
		arg6[1] = local119;
		arg6[0] = local106;
	}
}
