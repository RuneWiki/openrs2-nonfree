import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
	public static int anInt56;

	@OriginalMember(owner = "client!ac", name = "y", descriptor = "[[I")
	public static final int[][] anIntArrayArray1 = new int[128][128];

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_1 = new Class251(21, 8);

	@OriginalMember(owner = "client!ac", name = "v", descriptor = "Lclient!nv;")
	public static final Class258 aClass258_1 = new Class258();

	@OriginalMember(owner = "client!ac", name = "u", descriptor = "J")
	public static long aLong5 = -1L;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIII[FIII[FFI)V")
	public static void method77(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float[] arg7, @OriginalArg(9) float arg8, @OriginalArg(10) int arg9) {
		@Pc(3) int local3 = arg2 - arg1;
		@Pc(7) int local7 = arg9 - arg0;
		@Pc(15) int local15 = arg4 - arg5;
		@Pc(36) float local36 = arg3[0] * (float) local15 + arg3[1] * (float) local7 + (float) local3 * arg3[2];
		@Pc(57) float local57 = (float) local15 * arg3[3] + (float) local7 * arg3[4] + (float) local3 * arg3[5];
		@Pc(78) float local78 = arg3[8] * (float) local3 + arg3[7] * (float) local7 + arg3[6] * (float) local15;
		@Pc(93) float local93 = (float) Math.sqrt((double) (local78 * local78 + local57 * local57 + local36 * local36));
		@Pc(104) float local104 = (float) Math.atan2((double) local36, (double) local78) / 6.2831855F + 0.5F;
		@Pc(123) float local123 = (float) Math.asin((double) (local57 / local93)) / 3.1415927F + arg8 + 0.5F;
		@Pc(130) float local130;
		if (arg6 == 1) {
			local130 = local104;
			local104 = -local123;
			local123 = local130;
		} else if (arg6 == 2) {
			local104 = -local104;
			local123 = -local123;
		} else if (arg6 == 3) {
			local130 = local104;
			local104 = local123;
			local123 = -local130;
		}
		arg7[1] = local123;
		arg7[0] = local104;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIBIIII)V")
	public static void method78(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(22) int local22;
		if (Static558.method8063(arg5)) {
			local22 = 0;
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = 0;
			@Pc(49) int local49 = 0;
			@Pc(51) int local51 = 0;
			if (Static656.aBoolean741) {
				local45 = Static636.anInt10412;
				local49 = Static321.anInt5589;
				local47 = Static494.anInt8561;
				local22 = Static607.anInt9965;
				local51 = Static323.anInt5615;
				Static323.anInt5615 = 1;
			}
			if (Static359.aClass299ArrayArray2[arg5] == null) {
				Static591.method8402(arg3, arg4 < 0, arg0, Static339.aClass299ArrayArray1[arg5], arg6, arg4, arg2, -1, arg7, arg1);
			} else {
				Static591.method8402(arg3, arg4 < 0, arg0, Static359.aClass299ArrayArray2[arg5], arg6, arg4, arg2, -1, arg7, arg1);
			}
			if (Static656.aBoolean741) {
				if (arg4 >= 0 && Static323.anInt5615 == 2) {
					Static140.method2127(Static494.anInt8561, Static607.anInt9965, Static321.anInt5589, Static636.anInt10412);
				}
				Static636.anInt10412 = local45;
				Static494.anInt8561 = local47;
				Static321.anInt5589 = local49;
				Static607.anInt9965 = local22;
				Static323.anInt5615 = local51;
			}
		} else if (arg4 == -1) {
			for (local22 = 0; local22 < 100; local22++) {
				Static415.aBooleanArray17[local22] = true;
			}
		} else {
			Static415.aBooleanArray17[arg4] = true;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZBLclient!gg;)V")
	public static void method79(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class4_Sub3_Sub3_Sub3_Sub2 arg1) {
		if (Static638.anInt10454 >= 400) {
			return;
		}
		if (arg1 != Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1) {
			@Pc(168) String local168;
			if (arg1.anInt3324 == 0) {
				@Pc(71) boolean local71 = true;
				if (Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt3303 != -1 && arg1.anInt3303 != -1) {
					@Pc(95) int local95 = arg1.anInt3303 <= Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt3303 ? arg1.anInt3303 : Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt3303;
					@Pc(102) int local102 = Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt3338 - arg1.anInt3338;
					if (local102 < 0) {
						local102 = -local102;
					}
					if (local102 > local95) {
						local71 = false;
					}
				}
				@Pc(126) String local126 = Static480.aClass80_10 == Static161.aClass80_6 ? Static21.aClass21_29.method324(Static26.anInt352) : Static21.aClass21_27.method324(Static26.anInt352);
				if (arg1.anInt3304 <= arg1.anInt3338) {
					local168 = arg1.method2888() + (local71 ? Static153.method2229(Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt3338, arg1.anInt3338) : "<col=ffffff>") + " (" + local126 + arg1.anInt3338 + ")";
				} else {
					local168 = arg1.method2888() + (local71 ? Static153.method2229(Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt3338, arg1.anInt3338) : "<col=ffffff>") + " (" + local126 + arg1.anInt3338 + "+" + (arg1.anInt3304 - arg1.anInt3338) + ")";
				}
			} else if (arg1.anInt3324 == -1) {
				local168 = arg1.method2888();
			} else {
				local168 = arg1.method2888() + " (" + Static21.aClass21_28.method324(Static26.anInt352) + arg1.anInt3324 + ")";
			}
			if (Static546.aBoolean727 && !arg0 && (Static655.anInt10731 & 0x8) != 0) {
				Static258.method4326(Static621.aString117 + " -> <col=ffffff>" + local168, Static529.aString102, false, Static217.anInt4240, (long) arg1.anInt3238, 0, false, true, 13, -1, 0, (long) arg1.anInt3238);
			}
			if (arg0) {
				Static258.method4326("", "<col=cccccc>" + local168, true, -1, 0L, 0, false, false, -1, 0, 0, (long) arg1.anInt3238);
			} else {
				for (@Pc(316) int local316 = 7; local316 >= 0; local316--) {
					if (Static480.aStringArray35[local316] != null) {
						@Pc(326) short local326 = 0;
						if (Static344.aClass80_7 == Static161.aClass80_6 && Static480.aStringArray35[local316].equalsIgnoreCase(Static21.aClass21_22.method324(Static26.anInt352))) {
							if (Static524.aBoolean667 && arg1.anInt3338 > Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt3338) {
								local326 = 2000;
							}
							if (Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt3302 == 0 || arg1.anInt3302 == 0) {
								if (arg1.aBoolean246) {
									local326 = 2000;
								}
							} else if (Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt3302 == arg1.anInt3302) {
								local326 = 2000;
							} else {
								local326 = 0;
							}
						} else if (Static348.aBooleanArray16[local316]) {
							local326 = 2000;
						}
						@Pc(407) short local407 = (short) (local326 + Static12.aShortArray5[local316]);
						@Pc(420) int local420 = Static534.anIntArray473[local316] == -1 ? Static179.anInt2917 : Static534.anIntArray473[local316];
						Static258.method4326("<col=ffffff>" + local168, Static480.aStringArray35[local316], false, local420, (long) arg1.anInt3238, 0, false, true, local407, -1, 0, (long) arg1.anInt3238);
					}
				}
			}
			if (!arg0) {
				for (@Pc(494) Class14_Sub2_Sub20 local494 = (Class14_Sub2_Sub20) Static111.aClass32_7.method584(); local494 != null; local494 = (Class14_Sub2_Sub20) Static111.aClass32_7.method577()) {
					if (local494.anInt10001 == 16) {
						local494.aString112 = "<col=ffffff>" + local168;
						return;
					}
				}
			}
		} else if (Static546.aBoolean727 && (Static655.anInt10731 & 0x10) != 0) {
			Static258.method4326(Static621.aString117 + " -> <col=ffffff>" + Static21.aClass21_36.method324(Static26.anInt352), Static529.aString102, false, Static217.anInt4240, 0L, 0, false, true, 50, -1, 0, (long) arg1.anInt3238);
		}
	}
}
