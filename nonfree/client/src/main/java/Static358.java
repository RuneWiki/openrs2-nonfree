import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!nw", name = "o", descriptor = "Lclient!ug;")
	public static Class320 aClass320_3;

	@OriginalMember(owner = "client!nw", name = "n", descriptor = "[I")
	public static final int[] anIntArray466 = new int[14];

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIIIFIII[FIF)V")
	public static void method5359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float arg9) {
		@Pc(5) int local5 = arg0 - arg8;
		@Pc(9) int local9 = arg6 - arg3;
		@Pc(17) int local17 = arg1 - arg5;
		@Pc(38) float local38 = (float) local17 * arg7[1] + (float) local9 * arg7[0] + (float) local5 * arg7[2];
		@Pc(59) float local59 = arg7[5] * (float) local5 + (float) local9 * arg7[3] + (float) local17 * arg7[4];
		@Pc(80) float local80 = (float) local9 * arg7[6] + arg7[7] * (float) local17 + arg7[8] * (float) local5;
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg4 != 1.0F) {
			local91 *= arg4;
		}
		@Pc(105) float local105 = arg9 + local59 + 0.5F;
		@Pc(120) float local120;
		if (arg2 == 1) {
			local120 = local91;
			local91 = -local105;
			local105 = local120;
		} else if (arg2 == 2) {
			local105 = -local105;
			local91 = -local91;
		} else if (arg2 == 3) {
			local120 = local91;
			local91 = local105;
			local105 = -local120;
		}
		Static3.aFloat163 = local105;
		Static142.aFloat62 = local91;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(JZ)V")
	public static void method5361(@OriginalArg(0) long arg0) {
		@Pc(16) int local16 = Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8911 + Static157.anInt6625;
		@Pc(22) int local22 = Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8913 + Static288.anInt8064;
		if (Static480.anInt8528 - local16 < -2000 || Static480.anInt8528 - local16 > 2000 || Static168.anInt3085 - local22 < -2000 || Static168.anInt3085 - local22 > 2000) {
			Static480.anInt8528 = local16;
			Static168.anInt3085 = local22;
		}
		@Pc(66) int local66;
		@Pc(74) int local74;
		if (local16 != Static480.anInt8528) {
			local66 = local16 - Static480.anInt8528;
			local74 = (int) (arg0 * (long) local66 / 320L);
			if (local66 <= 0) {
				if (local74 == 0) {
					local74 = -1;
				} else if (local74 < local66) {
					local74 = local66;
				}
			} else if (local74 == 0) {
				local74 = 1;
			} else if (local66 < local74) {
				local74 = local66;
			}
			Static480.anInt8528 += local74;
		}
		if (local22 != Static168.anInt3085) {
			local66 = local22 - Static168.anInt3085;
			local74 = (int) ((long) local66 * arg0 / 320L);
			if (local66 > 0) {
				if (local74 == 0) {
					local74 = 1;
				} else if (local74 > local66) {
					local74 = local66;
				}
			} else if (local74 == 0) {
				local74 = -1;
			} else if (local74 < local66) {
				local74 = local66;
			}
			Static168.anInt3085 += local74;
		}
		if (!Static58.aClass6_Sub17_Sub1_1.aBoolean598) {
			Static562.aFloat14 += (float) arg0 * Static7.aFloat12 / 6.0F;
			Static532.aFloat185 += (float) arg0 * Static256.aFloat120 / 6.0F;
		}
		Static48.method7038();
	}
}
