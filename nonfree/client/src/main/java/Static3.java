import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "[S")
	public static short[] aShortArray2;

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
	public static int anInt118;

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
	public static int anInt113 = 0;

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
	public static int anInt116 = 0;

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_32 = Static81.method1507("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "Lclient!dj;")
	public static Class24 aClass24_33 = aClass24_32;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
	public static void method93() {
		for (@Pc(3) int local3 = 0; local3 < Static66.anInt1660; local3++) {
			@Pc(18) int local18 = Static66.anIntArray143[local3]--;
			if (Static66.anIntArray143[local3] >= -10) {
				@Pc(87) Class11 local87 = Static20.aClass11Array1[local3];
				if (local87 == null) {
					local87 = Static213.method324(Static57.aClass69_Sub1_49, Static143.anIntArray270[local3], 0);
					if (local87 == null) {
						continue;
					}
					Static66.anIntArray143[local3] += local87.method323();
					Static20.aClass11Array1[local3] = local87;
				}
				if (Static66.anIntArray143[local3] < 0) {
					@Pc(205) int local205;
					if (Static79.anIntArray163[local3] == 0) {
						local205 = Static194.anInt4325;
					} else {
						@Pc(128) int local128 = (Static79.anIntArray163[local3] & 0xFF) * 128;
						@Pc(136) int local136 = Static79.anIntArray163[local3] >> 16 & 0xFF;
						@Pc(144) int local144 = Static79.anIntArray163[local3] >> 8 & 0xFF;
						@Pc(154) int local154 = local136 * 128 + 64 - Static87.aClass5_Sub2_Sub1_1.anInt2501;
						@Pc(163) int local163 = local144 * 128 + 64 - Static87.aClass5_Sub2_Sub1_1.anInt2448;
						if (local154 < 0) {
							local154 = -local154;
						}
						if (local163 < 0) {
							local163 = -local163;
						}
						@Pc(183) int local183 = local154 + local163 - 128;
						if (local183 > local128) {
							Static66.anIntArray143[local3] = -100;
							continue;
						}
						if (local183 < 0) {
							local183 = 0;
						}
						local205 = (local128 - local183) * Static200.anInt4473 / local128;
					}
					if (local205 > 0) {
						@Pc(216) Class1_Sub9_Sub1 local216 = local87.method321().method3204(Static121.aClass4_1);
						@Pc(221) Class1_Sub3_Sub2 local221 = Static215.method1623(local216, local205);
						local221.method1618(Static48.anIntArray102[local3] - 1);
						Static33.aClass1_Sub3_Sub1_1.method275(local221);
					}
					Static66.anIntArray143[local3] = -100;
				}
			} else {
				Static66.anInt1660--;
				for (@Pc(34) int local34 = local3; local34 < Static66.anInt1660; local34++) {
					Static143.anIntArray270[local34] = Static143.anIntArray270[local34 + 1];
					Static20.aClass11Array1[local34] = Static20.aClass11Array1[local34 + 1];
					Static48.anIntArray102[local34] = Static48.anIntArray102[local34 + 1];
					Static66.anIntArray143[local34] = Static66.anIntArray143[local34 + 1];
					Static79.anIntArray163[local34] = Static79.anIntArray163[local34 + 1];
				}
				local3--;
			}
		}
		if (Static173.aBoolean177 && !Static134.method2291()) {
			if (Static79.anInt1892 != 0 && Static66.anInt1656 != -1) {
				Static155.method2245(Static79.anInt1892, Static66.anInt1656, Static186.aClass69_Sub1_26);
			}
			Static173.aBoolean177 = false;
		} else if (Static79.anInt1892 != 0 && Static66.anInt1656 != -1 && !Static134.method2291()) {
			Static176.aClass1_Sub7_Sub1_34.method2808(63);
			Static176.aClass1_Sub7_Sub1_34.method2754(Static66.anInt1656);
			Static66.anInt1656 = -1;
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)V")
	public static void method94() {
		@Pc(9) int local9;
		if (Static121.anInt2693 > 0) {
			for (local9 = 0; local9 < 256; local9++) {
				if (Static121.anInt2693 > 768) {
					Static52.anIntArray114[local9] = Static50.method910(1024 - Static121.anInt2693, Static158.anIntArray298[local9], Static132.anIntArray241[local9]);
				} else if (Static121.anInt2693 > 256) {
					Static52.anIntArray114[local9] = Static132.anIntArray241[local9];
				} else {
					Static52.anIntArray114[local9] = Static50.method910(256 - Static121.anInt2693, Static132.anIntArray241[local9], Static158.anIntArray298[local9]);
				}
			}
		} else if (Static162.anInt3574 <= 0) {
			for (local9 = 0; local9 < 256; local9++) {
				Static52.anIntArray114[local9] = Static158.anIntArray298[local9];
			}
		} else {
			for (local9 = 0; local9 < 256; local9++) {
				if (Static162.anInt3574 > 768) {
					Static52.anIntArray114[local9] = Static50.method910(1024 - Static162.anInt3574, Static158.anIntArray298[local9], Static133.anIntArray242[local9]);
				} else if (Static162.anInt3574 > 256) {
					Static52.anIntArray114[local9] = Static133.anIntArray242[local9];
				} else {
					Static52.anIntArray114[local9] = Static50.method910(256 - Static162.anInt3574, Static133.anIntArray242[local9], Static158.anIntArray298[local9]);
				}
			}
		}
		local9 = 0;
		@Pc(143) int local143 = Static185.aClass1_Sub2_Sub8_Sub3_7.anInt3022 * 9;
		@Pc(145) int local145 = 0;
		@Pc(160) int local160;
		@Pc(170) int local170;
		@Pc(176) int local176;
		@Pc(182) int local182;
		@Pc(196) int local196;
		@Pc(200) int local200;
		for (@Pc(147) int local147 = 1; local147 < 255; local147++) {
			local160 = Static135.anIntArray244[local147] * (256 - local147) / 256 + 22;
			if (local160 < 0) {
				local160 = 0;
			}
			local9 += local160;
			for (local170 = local160; local170 < 128; local170++) {
				local176 = Static63.anIntArray139[local9++];
				local182 = Static185.aClass1_Sub2_Sub8_Sub3_7.anIntArray246[local143++];
				if (local176 == 0) {
					Static183.aClass1_Sub2_Sub8_Sub3_6.anIntArray246[local145++] = local182;
				} else {
					local196 = local176;
					local200 = 256 - local176;
					local176 = Static52.anIntArray114[local176];
					Static183.aClass1_Sub2_Sub8_Sub3_6.anIntArray246[local145++] = (local200 * (local182 & 0xFF00) + (local176 & 0xFF00) * local196 & 0xFF0000) + ((local182 & 0xFF00FF) * local200 + local196 * (local176 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			for (local176 = 0; local176 < local160; local176++) {
				Static183.aClass1_Sub2_Sub8_Sub3_6.anIntArray246[local145++] = Static185.aClass1_Sub2_Sub8_Sub3_7.anIntArray246[local143++];
			}
			local143 += Static185.aClass1_Sub2_Sub8_Sub3_7.anInt3022 - 128;
		}
		local9 = 0;
		Static183.aClass1_Sub2_Sub8_Sub3_6.method2352(0, 9);
		local143 = Static185.aClass1_Sub2_Sub8_Sub3_7.anInt3022 * 9 + 128;
		local145 = 0;
		for (local160 = 1; local160 < 255; local160++) {
			local170 = (256 - local160) * Static135.anIntArray244[local160] / 256 + 22;
			if (local170 < 0) {
				local170 = 0;
			}
			for (local176 = 0; local176 < local170; local176++) {
				@Pc(331) int local331 = local145++;
				local143--;
				Static73.aClass1_Sub2_Sub8_Sub3_2.anIntArray246[local331] = Static185.aClass1_Sub2_Sub8_Sub3_7.anIntArray246[local143];
			}
			for (local182 = local170; local182 < 128; local182++) {
				local143--;
				local200 = Static185.aClass1_Sub2_Sub8_Sub3_7.anIntArray246[local143];
				local196 = Static63.anIntArray139[local9++];
				if (local196 == 0) {
					Static73.aClass1_Sub2_Sub8_Sub3_2.anIntArray246[local145++] = local200;
				} else {
					@Pc(367) int local367 = local196;
					@Pc(371) int local371 = 256 - local196;
					local196 = Static52.anIntArray114[local196];
					Static73.aClass1_Sub2_Sub8_Sub3_2.anIntArray246[local145++] = (local367 * (local196 & 0xFF00FF) + (local200 & 0xFF00FF) * local371 & 0xFF00FF00) + ((local200 & 0xFF00) * local371 + local367 * (local196 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local9 += local170;
			local143 += Static185.aClass1_Sub2_Sub8_Sub3_7.anInt3022 + 128;
		}
		Static73.aClass1_Sub2_Sub8_Sub3_2.method2352(637, 9);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "([BIB)I")
	public static int method95(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Static140.method2434(arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!ve;Lclient!ve;ILclient!ve;Lclient!ve;)V")
	public static void method96(@OriginalArg(0) Class69 arg0, @OriginalArg(1) Class69 arg1, @OriginalArg(3) Class69 arg2, @OriginalArg(4) Class69 arg3) {
		Static133.aClass69_31 = arg1;
		Static79.aClass69_21 = arg2;
		Static41.aClass69_13 = arg0;
		Static166.aClass69_33 = arg3;
		Static4.aClass98ArrayArray3 = new Class98[Static133.aClass69_31.method2220()][];
		Static137.aBooleanArray14 = new boolean[Static133.aClass69_31.method2220()];
	}
}
