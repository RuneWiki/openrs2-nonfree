import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!dt", name = "h", descriptor = "B")
	public static byte aByte44;

	@OriginalMember(owner = "client!dt", name = "n", descriptor = "[Lclient!ria;")
	public static Class303[] aClass303Array1;

	@OriginalMember(owner = "client!dt", name = "p", descriptor = "I")
	public static int anInt2410;

	@OriginalMember(owner = "client!dt", name = "g", descriptor = "Lclient!fia;")
	public static final Class117 aClass117_6 = new Class117(10, 2, 2, 0);

	@OriginalMember(owner = "client!dt", name = "m", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_45 = new Class200(59, 6);

	@OriginalMember(owner = "client!dt", name = "o", descriptor = "J")
	public static final long aLong68 = (long) (Math.random() * 9.999999999E9D);

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IILclient!ha;BLclient!ria;)V")
	public static void method2021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class13 arg2, @OriginalArg(4) Class303 arg3) {
		@Pc(12) Class1 local12 = arg3.method6948(arg2);
		if (local12 == null) {
			return;
		}
		arg2.KA(arg1, arg0, arg3.anInt7914 + arg1, arg3.anInt7971 + arg0);
		if (Static502.anInt9931 == 2 || Static502.anInt9931 == 5 || Static196.aClass31_9 == null) {
			arg2.A(-16777216, local12, arg1, arg0);
			return;
		}
		@Pc(46) int local46;
		@Pc(50) int local50;
		@Pc(56) int local56;
		@Pc(48) int local48;
		if (Static407.anInt6909 == 4) {
			local46 = Static595.anInt9886;
			local48 = 4096;
			local50 = Static33.anInt661;
			local56 = (int) -Static225.aFloat85 & 0x3FFF;
		} else {
			local50 = Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8034;
			local56 = Static463.anInt7491 + (int) -Static225.aFloat85 & 0x3FFF;
			local48 = 4096 - Static594.anInt9866 * 16;
			local46 = Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8037;
		}
		@Pc(91) int local91 = local46 / 128 + 48 + 208 - Static456.anInt7428 * 2;
		@Pc(109) int local109 = Static5.anInt112 * 4 + 48 - (Static5.anInt112 - 104) * 2 - local50 / 128;
		Static196.aClass31_9.method8804((float) arg3.anInt7914 / 2.0F + (float) arg1, (float) arg0 + (float) arg3.anInt7971 / 2.0F, (float) local91, (float) local109, local48, local56 << 2, local12, arg1, arg0);
		@Pc(160) int local160;
		@Pc(170) int local170;
		@Pc(181) int local181;
		@Pc(192) int local192;
		for (@Pc(143) Class2_Sub41 local143 = (Class2_Sub41) Static200.aClass114_21.method2772(); local143 != null; local143 = (Class2_Sub41) Static200.aClass114_21.method2762()) {
			@Pc(148) int local148 = local143.anInt9197;
			local160 = (Static223.aClass129_3.anIntArray232[local148] >> 14 & 0x3FFF) - Static406.anInt6899;
			local170 = (Static223.aClass129_3.anIntArray232[local148] & 0x3FFF) - Static338.anInt5885;
			local181 = local160 * 4 + 2 - local46 / 128;
			local192 = local170 * 4 + 2 - local50 / 128;
			Static55.method1294(local181, arg0, arg2, local192, local12, arg3, arg1, Static223.aClass129_3.anIntArray233[local148]);
		}
		for (local160 = 0; local160 < Static641.anInt10385; local160++) {
			local170 = Static585.anIntArray686[local160] * 4 + 2 - local46 / 128;
			local181 = Static559.anIntArray664[local160] * 4 + 2 - local50 / 128;
			@Pc(249) Class5 local249 = Static79.aClass304_2.method6956(Static169.anIntArray224[local160]);
			if (local249.anIntArray9 != null) {
				local249 = local249.method77(Static382.aClass282_1);
				if (local249 == null || local249.anInt78 == -1) {
					continue;
				}
			}
			Static55.method1294(local170, arg0, arg2, local181, local12, arg3, arg1, local249.anInt78);
		}
		@Pc(335) int local335;
		@Pc(345) int local345;
		for (@Pc(287) Class2_Sub23 local287 = (Class2_Sub23) Static263.aClass323_18.method7480(); local287 != null; local287 = (Class2_Sub23) Static263.aClass323_18.method7482()) {
			local181 = (int) (local287.aLong278 >> 28 & 0x3L);
			if (Static248.anInt4780 == local181) {
				local192 = (int) (local287.aLong278 & 0x3FFFL) - Static406.anInt6899;
				@Pc(324) int local324 = (int) (local287.aLong278 >> 14 & 0x3FFFL) - Static338.anInt5885;
				local335 = local192 * 4 + 2 - local46 / 128;
				local345 = local324 * 4 + 2 - local50 / 128;
				Static579.method8033(local335, local12, Static287.aClass31Array20[0], arg1, local345, arg3, arg0);
			}
		}
		@Pc(437) int local437;
		for (local181 = 0; local181 < Static317.anInt5602; local181++) {
			@Pc(378) Class2_Sub32 local378 = (Class2_Sub32) Static514.aClass323_32.method7484((long) Static363.anIntArray409[local181]);
			if (local378 != null) {
				@Pc(383) Class16_Sub1_Sub1_Sub3_Sub1 local383 = local378.aClass16_Sub1_Sub1_Sub3_Sub1_2;
				if (local383.method1414() && local383.aByte109 == Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aByte109) {
					@Pc(399) Class113 local399 = local383.aClass113_1;
					if (local399 != null && local399.anIntArray213 != null) {
						local399 = local399.method2752(Static382.aClass282_1);
					}
					if (local399 != null && local399.aBoolean250 && local399.aBoolean254) {
						local345 = local383.anInt8037 / 128 - local46 / 128;
						local437 = local383.anInt8034 / 128 - local50 / 128;
						if (local399.anInt3231 == -1) {
							Static579.method8033(local345, local12, Static287.aClass31Array20[1], arg1, local437, arg3, arg0);
						} else {
							Static55.method1294(local345, arg0, arg2, local437, local12, arg3, arg1, local399.anInt3231);
						}
					}
				}
			}
		}
		local192 = Static649.anInt10495;
		@Pc(474) int[] local474 = Static426.anIntArray476;
		@Pc(525) int local525;
		@Pc(529) int local529;
		@Pc(561) int local561;
		for (local335 = 0; local335 < local192; local335++) {
			@Pc(484) Class16_Sub1_Sub1_Sub3_Sub2 local484 = Static91.aClass16_Sub1_Sub1_Sub3_Sub2Array1[local474[local335]];
			if (local484 != null && local484.method7021() && !local484.aBoolean595 && local484 != Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1 && local484.aByte109 == Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aByte109) {
				local437 = local484.anInt8037 / 128 - local46 / 128;
				local525 = local484.anInt8034 / 128 - local50 / 128;
				@Pc(527) boolean local527 = false;
				for (local529 = 0; local529 < Static289.anInt5236; local529++) {
					if (local484.aString82.equals(Static514.aStringArray44[local529]) && Static521.anIntArray622[local529] != 0) {
						local527 = true;
						break;
					}
				}
				@Pc(559) boolean local559 = false;
				for (local561 = 0; local561 < Static340.anInt5975; local561++) {
					if (local484.aString82.equals(Static58.aClass75Array1[local561].aString18)) {
						local559 = true;
						break;
					}
				}
				@Pc(585) boolean local585 = false;
				if (Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8163 != 0 && local484.anInt8163 != 0 && local484.anInt8163 == Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8163) {
					local585 = true;
				}
				if (local484.aBoolean592) {
					Static579.method8033(local437, local12, Static287.aClass31Array20[6], arg1, local525, arg3, arg0);
				} else if (local527) {
					Static579.method8033(local437, local12, Static287.aClass31Array20[3], arg1, local525, arg3, arg0);
				} else if (local559) {
					Static579.method8033(local437, local12, Static287.aClass31Array20[5], arg1, local525, arg3, arg0);
				} else if (local585) {
					Static579.method8033(local437, local12, Static287.aClass31Array20[4], arg1, local525, arg3, arg0);
				} else {
					Static579.method8033(local437, local12, Static287.aClass31Array20[2], arg1, local525, arg3, arg0);
				}
			}
		}
		@Pc(680) Class110[] local680 = Static448.aClass110Array1;
		@Pc(766) int local766;
		for (local437 = 0; local437 < local680.length; local437++) {
			@Pc(688) Class110 local688 = local680[local437];
			if (local688 != null && local688.anInt3142 != 0 && Static389.anInt6694 % 20 < 10) {
				@Pc(729) int local729;
				if (local688.anInt3142 == 1) {
					@Pc(714) Class2_Sub32 local714 = (Class2_Sub32) Static514.aClass323_32.method7484((long) local688.anInt3136);
					if (local714 != null) {
						@Pc(719) Class16_Sub1_Sub1_Sub3_Sub1 local719 = local714.aClass16_Sub1_Sub1_Sub3_Sub1_2;
						local729 = local719.anInt8037 / 128 - local46 / 128;
						local561 = local719.anInt8034 / 128 - local50 / 128;
						Static212.method3539(local729, arg0, local12, arg1, 360000L, local561, local688.anInt3135, arg3);
					}
				}
				if (local688.anInt3142 == 2) {
					local766 = local688.anInt3139 / 128 - local46 / 128;
					local529 = local688.anInt3143 / 128 - local50 / 128;
					@Pc(782) long local782 = (long) (local688.anInt3145 << 7);
					@Pc(786) long local786 = local782 * local782;
					Static212.method3539(local766, arg0, local12, arg1, local786, local529, local688.anInt3135, arg3);
				}
				if (local688.anInt3142 == 10 && local688.anInt3136 >= 0 && local688.anInt3136 < Static91.aClass16_Sub1_Sub1_Sub3_Sub2Array1.length) {
					@Pc(823) Class16_Sub1_Sub1_Sub3_Sub2 local823 = Static91.aClass16_Sub1_Sub1_Sub3_Sub2Array1[local688.anInt3136];
					if (local823 != null) {
						local529 = local823.anInt8037 / 128 - local46 / 128;
						local729 = local823.anInt8034 / 128 - local50 / 128;
						Static212.method3539(local529, arg0, local12, arg1, 360000L, local729, local688.anInt3135, arg3);
					}
				}
			}
		}
		if (Static407.anInt6909 == 4) {
			return;
		}
		if (Static375.anInt6459 != 0) {
			local525 = Static375.anInt6459 * 4 + Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.method6999() * 2 + 2 - local46 / 128 - 2;
			local766 = Static583.anInt9512 * 4 + Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.method6999() * 2 + 2 - local50 / 128 - 2;
			Static579.method8033(local525, local12, Static158.aClass31Array5[Static520.aBoolean607 ? 1 : 0], arg1, local766, arg3, arg0);
		}
		if (!Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aBoolean595) {
			arg2.method8164(-1, 3, arg3.anInt7914 / 2 + arg1 - 1, 3, arg3.anInt7971 / 2 + arg0 - 1);
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIIILclient!ha;III)V")
	public static void method2023(@OriginalArg(2) int arg0, @OriginalArg(4) Class13 arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4) {
		Static613.aClass13_82 = arg1;
		Static605.aClass51_10 = Static613.aClass13_82.method8137();
		Static432.aClass51_9 = Static613.aClass13_82.method8137();
		Static626.aClass51_11 = Static613.aClass13_82.method8137();
		Static456.anInt7437 = arg0;
		Static518.anInt8368 = 1;
		Static259.anInt4871 = 0;
		Static178.anInterface18_12 = null;
		Static5.anInt108 = arg2;
		Static211.anInt4053 = 2;
		Static173.anInt3502 = 0;
		Static389.anInt6695 = 2;
		Static492.method6903(arg4, arg3);
	}
}
