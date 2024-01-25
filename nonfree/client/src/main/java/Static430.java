import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
	public static int anInt7144;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZZIII)I")
	public static int method6078(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		@Pc(10) Class3_Sub48 local10 = Static144.method2729(false, arg1);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(23) int local23 = 0; local23 < local10.anIntArray674.length; local23++) {
			if (local10.anIntArray674[local23] >= 0 && local10.anIntArray674[local23] < Static517.aClass145_1.anInt4294) {
				@Pc(52) Class339 local52 = Static517.aClass145_1.method3798(local10.anIntArray674[local23]);
				@Pc(62) int local62 = local52.method7305(Static69.aClass118_1.method3019(arg2).anInt534, arg2);
				if (arg0) {
					local16 += local10.anIntArray675[local23] * local62;
				} else {
					local16 += local62;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IFIII[FIFIII)V")
	public static void method6080(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		@Pc(9) int local9 = arg4 - arg0;
		@Pc(13) int local13 = arg6 - arg3;
		@Pc(17) int local17 = arg8 - arg2;
		@Pc(38) float local38 = arg5[0] * (float) local13 + arg5[1] * (float) local17 + arg5[2] * (float) local9;
		@Pc(59) float local59 = arg5[3] * (float) local13 + arg5[4] * (float) local17 + arg5[5] * (float) local9;
		@Pc(80) float local80 = arg5[8] * (float) local9 + (float) local13 * arg5[6] + (float) local17 * arg5[7];
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg7 != 1.0F) {
			local91 *= arg7;
		}
		@Pc(105) float local105 = arg1 + local59 + 0.5F;
		@Pc(118) float local118;
		if (arg9 == 1) {
			local118 = local91;
			local91 = -local105;
			local105 = local118;
		} else if (arg9 == 2) {
			local105 = -local105;
			local91 = -local91;
		} else if (arg9 == 3) {
			local118 = local91;
			local91 = local105;
			local105 = -local118;
		}
		Static367.aFloat130 = local105;
		Static328.aFloat118 = local91;
	}
}
