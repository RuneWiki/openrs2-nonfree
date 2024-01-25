import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!pl", name = "wc", descriptor = "I")
	public static int anInt6458;

	@OriginalMember(owner = "client!pl", name = "Ic", descriptor = "Lclient!n;")
	public static Class221 aClass221_6;

	@OriginalMember(owner = "client!pl", name = "mc", descriptor = "Lclient!hga;")
	public static final Class130 aClass130_38 = new Class130();

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIF[FIFIIIII)V")
	public static void method5560(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(9) int local9 = arg7 - arg3;
		@Pc(13) int local13 = arg9 - arg5;
		@Pc(25) int local25 = arg8 - arg6;
		@Pc(46) float local46 = arg2[2] * (float) local13 + (float) local9 * arg2[0] + arg2[1] * (float) local25;
		@Pc(67) float local67 = arg2[5] * (float) local13 + arg2[4] * (float) local25 + arg2[3] * (float) local9;
		@Pc(88) float local88 = (float) local13 * arg2[8] + arg2[6] * (float) local9 + (float) local25 * arg2[7];
		@Pc(99) float local99 = (float) Math.atan2((double) local46, (double) local88) / 6.2831855F + 0.5F;
		if (arg4 != 1.0F) {
			local99 *= arg4;
		}
		@Pc(113) float local113 = local67 + arg1 + 0.5F;
		@Pc(118) float local118;
		if (arg0 == 1) {
			local118 = local99;
			local99 = -local113;
			local113 = local118;
		} else if (arg0 == 2) {
			local113 = -local113;
			local99 = -local99;
		} else if (arg0 == 3) {
			local118 = local99;
			local99 = local113;
			local113 = -local118;
		}
		Static445.aFloat153 = local99;
		Static89.aFloat37 = local113;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method5562(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		Static501.method6756(arg1, -1, arg0, -1);
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(B)V")
	public static void method5563() {
		@Pc(12) int local12 = Static476.anInt8277;
		@Pc(14) int[] local14 = Static10.anIntArray19;
		for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
			@Pc(24) Class9_Sub1_Sub1_Sub2_Sub2 local24 = Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[local14[local16]];
			if (local24 != null) {
				Static321.method4999(local24.method5569(), local24);
			}
		}
	}

	@OriginalMember(owner = "client!pl", name = "j", descriptor = "(I)[I")
	public static int[] method5567() {
		return new int[] { Static40.anInt4550, Static304.anInt5516, Static356.anInt6158 };
	}
}
