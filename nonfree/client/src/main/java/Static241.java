import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!jaa", name = "d", descriptor = "I")
	public static int anInt5385;

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(BIII)V")
	public static void method4436(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class8_Sub5_Sub8 local8 = Static509.method7344(11, arg0);
		local8.method3509();
		local8.anInt4321 = arg2;
		local8.anInt4324 = arg1;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lclient!rr;III)V")
	public static void method4437(@OriginalArg(0) Class15_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class56 local12;
		if (arg2 < Static489.anInt8688) {
			local12 = Static405.aClass56ArrayArrayArray2[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass15_Sub1_Sub3_1 != null && local12.aClass15_Sub1_Sub3_1.method8332()) {
				arg0.method8322(true, Static269.aClass16_11, local12.aClass15_Sub1_Sub3_1, Static572.anInt9827, 0, 0);
			}
		}
		if (arg3 < Static489.anInt8688) {
			local12 = Static405.aClass56ArrayArrayArray2[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass15_Sub1_Sub3_1 != null && local12.aClass15_Sub1_Sub3_1.method8332()) {
				arg0.method8322(true, Static269.aClass16_11, local12.aClass15_Sub1_Sub3_1, 0, Static572.anInt9827, 0);
			}
		}
		if (arg2 < Static489.anInt8688 && arg3 < Static596.anInt10195) {
			local12 = Static405.aClass56ArrayArrayArray2[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass15_Sub1_Sub3_1 != null && local12.aClass15_Sub1_Sub3_1.method8332()) {
				arg0.method8322(true, Static269.aClass16_11, local12.aClass15_Sub1_Sub3_1, Static572.anInt9827, Static572.anInt9827, 0);
			}
		}
		if (arg2 < Static489.anInt8688 && arg3 > 0) {
			local12 = Static405.aClass56ArrayArrayArray2[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass15_Sub1_Sub3_1 != null && local12.aClass15_Sub1_Sub3_1.method8332()) {
				arg0.method8322(true, Static269.aClass16_11, local12.aClass15_Sub1_Sub3_1, Static572.anInt9827, -Static572.anInt9827, 0);
			}
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(III)Z")
	public static boolean method4438(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static436.method6739(arg0, arg1) || Static377.method5849(arg1, arg0);
	}
}
