import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!uh", name = "v", descriptor = "Lclient!iq;")
	public static Class4_Sub14_Sub2 aClass4_Sub14_Sub2_2;

	@OriginalMember(owner = "client!uh", name = "x", descriptor = "[Lclient!tm;")
	public static Class241[] aClass241Array1;

	@OriginalMember(owner = "client!uh", name = "G", descriptor = "Lclient!cw;")
	public static Class45 aClass45_9;

	@OriginalMember(owner = "client!uh", name = "S", descriptor = "I")
	public static int anInt6850;

	@OriginalMember(owner = "client!uh", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString70 = "";

	@OriginalMember(owner = "client!uh", name = "K", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray42 = new String[100];

	@OriginalMember(owner = "client!uh", name = "L", descriptor = "I")
	public static int anInt6844 = 0;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILclient!ob;)I")
	public static int method5509(@OriginalArg(1) Class4_Sub30 arg0) {
		@Pc(7) String local7 = Static156.method2205(arg0);
		@Pc(9) int[] local9 = null;
		if (Static176.method2473(arg0.anInt4615)) {
			local9 = Static416.aClass64_2.method1372((int) arg0.aLong136).anIntArray153;
		} else if (arg0.anInt4620 != -1) {
			local9 = Static416.aClass64_2.method1372(arg0.anInt4620).anIntArray153;
		} else if (Static418.method5662(arg0.anInt4615)) {
			@Pc(37) Class8_Sub3_Sub1_Sub2 local37 = Static367.aClass8_Sub3_Sub1_Sub2Array1[(int) arg0.aLong136];
			if (local37 != null) {
				@Pc(42) Class78 local42 = local37.aClass78_1;
				if (local42.anIntArray145 != null) {
					local42 = local42.method1547(Static52.aClass81_1);
				}
				if (local42 != null) {
					local9 = local42.anIntArray146;
				}
			}
		} else if (Static100.method1513(arg0.anInt4615)) {
			@Pc(80) Class114 local80;
			if (arg0.anInt4615 == 1004) {
				local80 = Static51.aClass151_1.method2917((int) arg0.aLong136);
			} else {
				local80 = Static51.aClass151_1.method2917((int) (arg0.aLong136 >>> 32 & 0x7FFFFFFFL));
			}
			if (local80.anIntArray235 != null) {
				local80 = local80.method2181(Static52.aClass81_1);
			}
			if (local80 != null) {
				local9 = local80.anIntArray233;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static24.method335(local9);
		}
		@Pc(129) int local129 = Static363.aClass158_11.method3032(local7, Static243.aClass95Array8);
		if (arg0.aBoolean344) {
			local129 += Static23.aClass95_23.la() + 4;
		}
		return local129;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IZLclient!qn;IIII)V")
	public static void method5510(@OriginalArg(2) Class211 arg0, @OriginalArg(3) int arg1, @OriginalArg(6) int arg2) {
		Static350.anInt5812 = 1;
		Static186.anInt3434 = arg2;
		Static107.anInt2011 = 2;
		Static66.aBoolean66 = false;
		Static403.anInt6562 = 0;
		Static417.anInt7023 = arg1;
		Static252.aClass211_63 = arg0;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIZII)V")
	public static void method5512(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static432.aClass75ArrayArrayArray6 == null) {
			Static39.aClass135_1.method5394(arg4, arg0, arg3, arg1, -16777216);
		} else if (Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7339 >= 0 && Static337.anInt5497 * 128 > Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7339 && Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7343 >= 0 && Static282.anInt4644 * 128 > Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7343) {
			Static129.anInt2333++;
			if (Static401.aClass8_Sub3_Sub1_Sub1_2 != null && Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7339 - (Static401.aClass8_Sub3_Sub1_Sub1_2.method5894() - 1) * 64 >> 7 == Static363.anInt5531 && Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7343 - (Static401.aClass8_Sub3_Sub1_Sub1_2.method5894() - 1) * 64 >> 7 == Static25.anInt375) {
				Static25.anInt375 = -1;
				Static363.anInt5531 = -1;
				Static397.method5243();
			}
			Static257.method3395();
			if (!arg2) {
				Static256.method3375();
			}
			Static246.method3244();
			Static199.method2851(arg0, arg4, true, arg1, arg3);
			@Pc(116) int local116 = Static178.anInt3232;
			@Pc(118) int local118 = Static100.anInt1832;
			@Pc(120) int local120 = Static335.anInt5464;
			@Pc(122) int local122 = Static37.anInt613;
			@Pc(131) int local131;
			@Pc(162) int local162;
			if (Static97.anInt1791 == 1) {
				local131 = (int) Static439.aFloat99;
				if (local131 < Static345.anInt5731 >> 8) {
					local131 = Static345.anInt5731 >> 8;
				}
				if (Static72.aBooleanArray6[4] && Static302.anIntArray394[4] + 128 > local131) {
					local131 = Static302.anIntArray394[4] + 128;
				}
				local162 = (int) Static109.aFloat75 + Static206.anInt4096 & 0x3FFF;
				Static36.method497(Static371.anInt5975, local162, local116, Static94.method4425(Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7343, Static68.anInt1387, Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7339) - 50, local131, (local131 >> 3) * 3 + 600 << 0, Static196.anInt3536);
			} else if (Static97.anInt1791 == 4) {
				local131 = (int) Static439.aFloat99;
				if (Static345.anInt5731 >> 8 > local131) {
					local131 = Static345.anInt5731 >> 8;
				}
				if (Static72.aBooleanArray6[4] && Static302.anIntArray394[4] + 128 > local131) {
					local131 = Static302.anIntArray394[4] + 128;
				}
				local162 = (int) Static109.aFloat75 & 0x3FFF;
				Static36.method497(Static371.anInt5975, local162, local116, Static94.method4425(Static212.anInt3693, Static68.anInt1387, Static190.anInt3490) - 50, local131, (local131 >> 3) * 3 + 600 << 0, Static196.anInt3536);
			} else if (Static97.anInt1791 == 5) {
				Static251.method3315(local116);
			}
			local131 = Static235.anInt4004;
			local162 = Static222.anInt3814;
			@Pc(268) int local268 = Static393.anInt7135;
			@Pc(270) int local270 = Static133.anInt2435;
			@Pc(272) int local272 = Static411.anInt6947;
			@Pc(316) int local316;
			for (@Pc(274) int local274 = 0; local274 < 5; local274++) {
				if (Static72.aBooleanArray6[local274]) {
					local316 = (int) ((double) -Static341.anIntArray446[local274] + (double) (Static341.anIntArray446[local274] * 2 + 1) * Math.random() + Math.sin((double) Static251.anIntArray346[local274] / 100.0D * (double) Static63.anIntArray455[local274]) * (double) Static302.anIntArray394[local274]);
					if (local274 == 4) {
						Static133.anInt2435 += local316;
						if (Static133.anInt2435 < 1024) {
							Static133.anInt2435 = 1024;
						} else if (Static133.anInt2435 > 3072) {
							Static133.anInt2435 = 3072;
						}
					}
					if (local274 == 0) {
						Static235.anInt4004 += local316;
					}
					if (local274 == 3) {
						Static411.anInt6947 = local316 + Static411.anInt6947 & 0x3FFF;
					}
					if (local274 == 1) {
						Static222.anInt3814 += local316;
					}
					if (local274 == 2) {
						Static393.anInt7135 += local316;
					}
				}
			}
			if (Static235.anInt4004 < 0) {
				Static235.anInt4004 = 0;
			}
			if (Static393.anInt7135 < 0) {
				Static393.anInt7135 = 0;
			}
			if (Static235.anInt4004 > (Static81.anInt1606 << 7) - 1) {
				Static235.anInt4004 = (Static81.anInt1606 << 7) - 1;
			}
			if ((Static18.anInt297 << 7) - 1 < Static393.anInt7135) {
				Static393.anInt7135 = (Static18.anInt297 << 7) - 1;
			}
			Static176.method2467();
			Static321.method4250();
			Static39.aClass135_1.OA(local120, local118, local122 + local120, local118 + local116);
			Static39.aClass135_1.method5395();
			local316 = Static450.anInt7528;
			if (Static113.aClass209_1 == null) {
				Static39.aClass135_1.p(local316);
			} else {
				Static113.aClass209_1.method4302(Static39.aClass135_1, Static133.anInt2435, local116, local120, Static412.anInt6984 << 3, local118, local122, Static411.anInt6947, local316);
			}
			Static150.method2112();
			Static423.aClass35_5.s(Static235.anInt4004, Static222.anInt3814, Static393.anInt7135, -Static133.anInt2435 & 0x3FFF, -Static411.anInt6947 & 0x3FFF, -Static226.anInt3896 & 0x3FFF);
			Static39.aClass135_1.ea(Static423.aClass35_5);
			Static39.aClass135_1.H(local120 + local122 / 2, local118 - -(local116 / 2), Static329.anInt5333 << 1, Static329.anInt5333 << 1);
			Static161.method2281(Static329.anInt5333 << 1, local120 + local122 / 2, Static329.anInt5333 << 1, local118 + local116 / 2);
			Static376.method4955(Static393.anInt7135, -Static133.anInt2435 & 0x3FFF, Static235.anInt4004, -Static226.anInt3896 & 0x3FFF, -Static411.anInt6947 & 0x3FFF, Static222.anInt3814);
			@Pc(557) byte local557 = Static413.aClass49_Sub1_1.method2488(Static341.anInt5549) == 2 ? (byte) Static129.anInt2333 : 1;
			Static347.method4608(Static39.aClass135_1, Static265.anInt4371, Static114.anInt2109, Static423.aClass35_5, Static235.anInt4004, Static222.anInt3814, Static393.anInt7135, Static267.aByteArrayArrayArray14, Static54.anIntArray93, Static356.anIntArray466, Static221.anIntArray278, Static249.anIntArray573, Static184.anIntArray259, Static401.aClass8_Sub3_Sub1_Sub1_2.aByte99 + 1, local557, Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7339 >> 7, Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7343 >> 7, !Static413.aClass49_Sub1_1.aBoolean246);
			Static150.method2112();
			if (Static8.anInt119 == 9) {
				Static179.method2498(local120, local122, local116, local118);
				Static170.method5841(local116, local122, local118, local120);
				Static202.method2856(local118, local122, local120, local116);
				Static455.method6030(local120, local122, local118, local116);
			}
			Static29.method178();
			Static133.anInt2435 = local270;
			Static393.anInt7135 = local268;
			Static222.anInt3814 = local162;
			Static235.anInt4004 = local131;
			Static411.anInt6947 = local272;
			if (Static405.aBoolean455 && Static373.aClass54_2.method1238() == 0) {
				Static405.aBoolean455 = false;
			}
			if (Static405.aBoolean455) {
				Static39.aClass135_1.method5394(local122, local120, local116, local118, -16777216);
				Static94.method4424(Static283.aClass123_6, Static243.aClass15_65.method180(Static429.anInt6999), false);
			}
		} else {
			Static39.aClass135_1.method5394(arg4, arg0, arg3, arg1, -16777216);
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIIZZ)V")
	public static void method5513(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) boolean arg4) {
		Static145.anInt2581 = 7;
		Static416.anInt7020 = 0x1 << Static145.anInt2581;
		Static390.anInt7654 = Static416.anInt7020 >> 1;
		Static164.anInt3018 = (int) Math.sqrt((double) (Static390.anInt7654 * Static390.anInt7654 + Static390.anInt7654 * Static390.anInt7654));
		Static36.anInt599 = Static416.anInt7020 >> 2;
		anInt6850 = Static416.anInt7020;
		Static81.anInt1606 = arg0;
		Static18.anInt297 = arg1;
		Static387.anInt6326 = arg2;
		Static458.aClass75ArrayArrayArray5 = new Class75[4][Static81.anInt1606][Static18.anInt297];
		Static228.aClass41Array2 = new Class41[4];
		if (arg3) {
			Static169.anIntArrayArray37 = new int[Static81.anInt1606][Static18.anInt297];
			Static436.aByteArrayArray19 = new byte[Static81.anInt1606][Static18.anInt297];
			Static240.aShortArrayArray4 = new short[Static81.anInt1606][Static18.anInt297];
			Static221.aClass75ArrayArrayArray3 = new Class75[1][Static81.anInt1606][Static18.anInt297];
			Static169.aClass41Array1 = new Class41[1];
		} else {
			Static169.anIntArrayArray37 = null;
			Static436.aByteArrayArray19 = null;
			Static240.aShortArrayArray4 = null;
			Static221.aClass75ArrayArrayArray3 = null;
			Static169.aClass41Array1 = null;
		}
		if (arg4) {
			Static81.aLongArrayArrayArray1 = new long[4][arg0][arg1];
			Static367.aClass154Array1 = new Class154[65535];
			Static371.aBooleanArray28 = new boolean[65535];
			Static440.anInt7325 = 0;
		} else {
			Static81.aLongArrayArrayArray1 = null;
			Static367.aClass154Array1 = null;
			Static371.aBooleanArray28 = null;
			Static440.anInt7325 = 0;
		}
		Static371.method4767(false);
		Static190.aClass145Array1 = new Class145[1000];
		Static349.anInt5769 = 0;
		Static399.aClass145Array2 = new Class145[1000];
		Static264.anInt4365 = 0;
		Static382.anIntArrayArrayArray8 = new int[4][Static81.anInt1606 + 1][Static18.anInt297 + 1];
		Static298.aClass8_Sub3Array3 = new Class8_Sub3[5000];
		Static41.anInt669 = 0;
		Static458.aBooleanArrayArray8 = new boolean[Static387.anInt6326 + Static387.anInt6326 + 1][Static387.anInt6326 + Static387.anInt6326 + 1];
		Static399.aBooleanArrayArray7 = new boolean[Static387.anInt6326 + Static387.anInt6326 + 2][Static387.anInt6326 + Static387.anInt6326 + 2];
		Static146.aClass28_1 = null;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIII)V")
	public static void method5514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static142.anInt2538 = arg1;
		Static288.anInt4738 = arg4;
		Static366.anInt6051 = arg0;
		Static432.anInt7151 = arg3;
		Static392.anInt6418 = arg2;
		if (Static366.anInt6051 >= 100) {
			@Pc(28) int local28 = Static392.anInt6418 * 128 + 64;
			@Pc(34) int local34 = Static288.anInt4738 * 128 + 64;
			@Pc(43) int local43 = Static94.method4425(local34, Static68.anInt1387, local28) - Static142.anInt2538;
			@Pc(48) int local48 = local28 - Static235.anInt4004;
			@Pc(52) int local52 = local43 - Static222.anInt3814;
			@Pc(57) int local57 = local34 - Static393.anInt7135;
			@Pc(68) int local68 = (int) Math.sqrt((double) (local57 * local57 + local48 * local48));
			Static133.anInt2435 = (int) (Math.atan2((double) local52, (double) local68) * 2607.5945876176133D) & 0x3FFF;
			Static411.anInt6947 = (int) (-2607.5945876176133D * Math.atan2((double) local48, (double) local57)) & 0x3FFF;
			if (Static133.anInt2435 < 1024) {
				Static133.anInt2435 = 1024;
			}
			Static226.anInt3896 = 0;
			if (Static133.anInt2435 > 3072) {
				Static133.anInt2435 = 3072;
			}
		}
		Static97.anInt1791 = 2;
	}
}
