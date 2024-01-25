import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!dt", name = "v", descriptor = "[[B")
	public static byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IBILclient!ng;I)V")
	public static void method2173(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub35 arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) (arg0 << 14 | arg1 << 28 | arg3);
		@Pc(22) Class3_Sub46 local22 = (Class3_Sub46) Static508.aClass310_33.method6601(local16);
		if (local22 == null) {
			local22 = new Class3_Sub46();
			Static508.aClass310_33.method6603(local22, local16);
			local22.aClass130_64.method3548(arg2);
			return;
		}
		@Pc(50) Class339 local50 = Static517.aClass145_1.method3798(arg2.anInt6129);
		@Pc(53) int local53 = local50.anInt8828;
		if (local50.anInt8789 == 1) {
			local53 *= arg2.anInt6127 + 1;
		}
		for (@Pc(72) Class3_Sub35 local72 = (Class3_Sub35) local22.aClass130_64.method3543(); local72 != null; local72 = (Class3_Sub35) local22.aClass130_64.method3551()) {
			local50 = Static517.aClass145_1.method3798(local72.anInt6129);
			@Pc(83) int local83 = local50.anInt8828;
			if (local50.anInt8789 == 1) {
				local83 *= local72.anInt6127 + 1;
			}
			if (local53 > local83) {
				Static452.method6294(arg2, local72);
				return;
			}
		}
		local22.aClass130_64.method3548(arg2);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IFII[FIIIBI)V")
	public static void method2174(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg0 - arg6;
		@Pc(13) int local13 = arg2 - arg7;
		@Pc(17) int local17 = arg8 - arg3;
		@Pc(38) float local38 = arg4[2] * (float) local17 + arg4[0] * (float) local9 + (float) local13 * arg4[1];
		@Pc(59) float local59 = (float) local13 * arg4[4] + (float) local9 * arg4[3] + (float) local17 * arg4[5];
		@Pc(80) float local80 = (float) local17 * arg4[8] + (float) local13 * arg4[7] + arg4[6] * (float) local9;
		@Pc(95) float local95 = (float) Math.sqrt((double) (local38 * local38 + local59 * local59 + local80 * local80));
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(119) float local119 = (float) Math.asin((double) (local59 / local95)) / 3.1415927F + arg1 + 0.5F;
		@Pc(126) float local126;
		if (arg5 == 1) {
			local126 = local106;
			local106 = -local119;
			local119 = local126;
		} else if (arg5 == 2) {
			local106 = -local106;
			local119 = -local119;
		} else if (arg5 == 3) {
			local126 = local106;
			local106 = local119;
			local119 = -local126;
		}
		Static468.aFloat155 = local119;
		Static357.aFloat127 = local106;
	}
}
