import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!iq", name = "G", descriptor = "J")
	public static long aLong116 = 0L;

	@OriginalMember(owner = "client!iq", name = "I", descriptor = "[[S")
	public static final short[][] aShortArrayArray4 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!rf;")
	public static RuntimeException_Sub1 method3851(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString62 = local9.aString62 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IBIZII)V")
	public static void method3852(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static279.aClass290ArrayArrayArray7 == null) {
			Static121.aClass5_7.method7459(arg0, arg1, -16777216, arg3, arg4);
		} else if (Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8811 >= 0 && Static118.anInt2527 * 512 > Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8811 && Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8813 >= 0 && Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8813 < Static549.anInt9482 * 512) {
			Static127.anInt2665++;
			if (Static111.aClass6_Sub1_Sub2_Sub1_3 != null && Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8811 - (Static111.aClass6_Sub1_Sub2_Sub1_3.method7083() - 1) * 256 >> 9 == Static407.anInt7473 && Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8813 - (Static111.aClass6_Sub1_Sub2_Sub1_3.method7083() - 1) * 256 >> 9 == Static303.anInt5982) {
				Static407.anInt7473 = -1;
				Static303.anInt5982 = -1;
				Static514.method7353();
			}
			Static190.method3586();
			if (!arg2) {
				Static83.method1706();
			}
			Static242.method4200();
			Static402.method7153(true, arg4, arg0, arg1, arg3);
			@Pc(108) int local108 = Static188.anInt4292;
			@Pc(110) int local110 = Static18.anInt679;
			@Pc(112) int local112 = Static220.anInt4797;
			@Pc(114) int local114 = Static163.anInt9272;
			@Pc(120) int local120;
			@Pc(158) int local158;
			if (Static305.anInt5998 == 1) {
				local120 = (int) Static343.aFloat198;
				if (Static70.anInt577 >> 8 > local120) {
					local120 = Static70.anInt577 >> 8;
				}
				if (Static400.aBooleanArray34[4] && local120 < Static204.anIntArray581[4] + 128) {
					local120 = Static204.anIntArray581[4] + 128;
				}
				local158 = (int) Static487.aFloat258 + Static148.anInt2973 & 0x3FFF;
				Static266.method4662(Static366.anInt6836, (local120 >> 3) * 3 + 600 << 2, local120, local158, Static58.method1166(Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8813, Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8811, Static420.anInt7829) - 200, Static8.anInt583, local110);
			} else if (Static305.anInt5998 == 4) {
				local120 = (int) Static343.aFloat198;
				if (Static70.anInt577 >> 8 > local120) {
					local120 = Static70.anInt577 >> 8;
				}
				if (Static400.aBooleanArray34[4] && Static204.anIntArray581[4] + 128 > local120) {
					local120 = Static204.anIntArray581[4] + 128;
				}
				local158 = (int) Static487.aFloat258 & 0x3FFF;
				Static266.method4662(Static366.anInt6836, (local120 >> 3) * 3 + 600 << 2, local120, local158, Static58.method1166(Static157.anInt3699, Static40.anInt1002, Static420.anInt7829) - 200, Static8.anInt583, local110);
			} else if (Static305.anInt5998 == 5) {
				Static295.method4944(local110);
			}
			local120 = Static311.anInt6050;
			local158 = Static347.anInt6620;
			@Pc(269) int local269 = Static329.anInt6297;
			@Pc(271) int local271 = Static27.anInt778;
			@Pc(273) int local273 = Static262.anInt5491;
			for (@Pc(275) int local275 = 0; local275 < 5; local275++) {
				if (Static400.aBooleanArray34[local275]) {
					@Pc(317) int local317 = (int) ((double) -Static98.anIntArray216[local275] + (double) (Static98.anIntArray216[local275] * 2 + 1) * Math.random() + Math.sin((double) Static545.anIntArray780[local275] / 100.0D * (double) Static267.anIntArray473[local275]) * (double) Static204.anIntArray581[local275]);
					if (local275 == 3) {
						Static262.anInt5491 = local317 + Static262.anInt5491 & 0x3FFF;
					}
					if (local275 == 1) {
						Static347.anInt6620 += local317 << 2;
					}
					if (local275 == 0) {
						Static311.anInt6050 += local317 << 2;
					}
					if (local275 == 4) {
						Static27.anInt778 += local317;
						if (Static27.anInt778 < 1024) {
							Static27.anInt778 = 1024;
						} else if (Static27.anInt778 > 3072) {
							Static27.anInt778 = 3072;
						}
					}
					if (local275 == 2) {
						Static329.anInt6297 += local317 << 2;
					}
				}
			}
			if (Static311.anInt6050 < 0) {
				Static311.anInt6050 = 0;
			}
			if (Static329.anInt6297 < 0) {
				Static329.anInt6297 = 0;
			}
			if ((Static126.anInt2626 << 9) - 1 < Static311.anInt6050) {
				Static311.anInt6050 = (Static126.anInt2626 << 9) - 1;
			}
			if ((Static108.anInt2385 << 9) - 1 < Static329.anInt6297) {
				Static329.anInt6297 = (Static108.anInt2385 << 9) - 1;
			}
			Static527.method7614();
			Static135.method2316();
			Static121.aClass5_7.ca(local112, local114, local112 + local108, local114 - -local110);
			Static121.aClass5_7.method7444();
			@Pc(458) int local458 = Static293.anInt8472;
			if (Static87.aClass178_1 == null) {
				Static121.aClass5_7.D(local458);
			} else {
				Static87.aClass178_1.method4793(local108, local112, local114, Static262.anInt5491, Static27.anInt778, local110, local458, Static121.aClass5_7, Static500.anInt8793 << 3);
			}
			Static442.method6680();
			Static181.aClass205_5.pa(Static311.anInt6050, Static347.anInt6620, Static329.anInt6297, -Static27.anInt778 & 0x3FFF, -Static262.anInt5491 & 0x3FFF, -Static100.anInt2054 & 0x3FFF);
			Static121.aClass5_7.method7469(Static181.aClass205_5);
			Static121.aClass5_7.m(local108 / 2 + local112, local114 + local110 / 2, Static57.anInt1221 << 1, Static57.anInt1221 << 1);
			Static519.method7388(Static57.anInt1221 << 1, local108 / 2 + local112, local114 + local110 / 2, Static57.anInt1221 << 1);
			Static92.method1827(-Static27.anInt778 & 0x3FFF, Static311.anInt6050, -Static262.anInt5491 & 0x3FFF, Static347.anInt6620, Static329.anInt6297, -Static100.anInt2054 & 0x3FFF);
			@Pc(567) byte local567 = Static7.aClass3_Sub15_Sub1_1.method6964(Static382.anInt7091) == 2 ? (byte) Static127.anInt2665 : 1;
			Static38.method932(Static121.aClass5_7, Static223.anInt4829, Static172.anInt3951, Static181.aClass205_5, Static311.anInt6050, Static347.anInt6620, Static329.anInt6297, Static58.aByteArrayArrayArray2, Static42.anIntArray135, Static526.anIntArray769, Static188.anIntArray401, Static142.anIntArray281, Static227.anIntArray437, Static111.aClass6_Sub1_Sub2_Sub1_3.aByte100 + 1, local567, Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8811 >> 9, Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8813 >> 9, !Static7.aClass3_Sub15_Sub1_1.aBoolean598);
			Static442.method6680();
			if (Static512.anInt8932 == 9) {
				Static269.method4697(local114, local108, local110, local112);
				Static546.method7793(local112, local108, local110, local114);
				Static374.method5884(local114, local108, local110, local112);
				Static295.method4943(local112, local108, local110, local114);
			}
			Static233.method4154();
			Static347.anInt6620 = local158;
			Static27.anInt778 = local271;
			Static329.anInt6297 = local269;
			Static262.anInt5491 = local273;
			Static311.anInt6050 = local120;
			if (Static220.aBoolean338 && Static349.aClass153_2.method4122() == 0) {
				Static220.aBoolean338 = false;
			}
			if (Static220.aBoolean338) {
				Static121.aClass5_7.method7459(local108, local114, -16777216, local110, local112);
				Static141.method2464(false, Static164.aClass59_1, Static157.aClass67_50.method1934(Static193.anInt7803));
			}
		} else {
			Static121.aClass5_7.method7459(arg0, arg1, -16777216, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(III)I")
	public static int method3854(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static466.anIntArray714[arg0 & 0x3] : Static156.anIntArray362[arg0 & 0x3];
	}
}
