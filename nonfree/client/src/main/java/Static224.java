import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!ik", name = "q", descriptor = "F")
	public static float aFloat128;

	@OriginalMember(owner = "client!ik", name = "s", descriptor = "I")
	public static int anInt4204;

	@OriginalMember(owner = "client!ik", name = "t", descriptor = "I")
	public static int anInt4205;

	@OriginalMember(owner = "client!ik", name = "n", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_70 = new Class286(28, -1);

	@OriginalMember(owner = "client!ik", name = "o", descriptor = "Lclient!gb;")
	public static final Class119 aClass119_18 = new Class119();

	@OriginalMember(owner = "client!ik", name = "r", descriptor = "I")
	public static int anInt4203 = 0;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIII)Z")
	public static boolean method3512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static225.aBoolean343) {
			return false;
		} else if (Static228.anInt4256 < 100) {
			return false;
		} else if (Static563.method7642(arg1, arg3, arg2)) {
			@Pc(31) int local31 = arg3 << Static134.anInt2822;
			@Pc(35) int local35 = arg2 << Static134.anInt2822;
			if (Static84.method1347(Static33.anInt857, arg0, local35, Static421.aClass67Array7[arg1].method6707(arg2, arg3), local31, Static33.anInt857)) {
				Static301.anInt5412++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)I")
	public static int method3513() {
		@Pc(6) int local6;
		if (!Static72.aClass2_Sub12_Sub1_1.aBoolean158) {
			for (local6 = 0; local6 < Static398.anInt8718; local6++) {
				if (Static577.anInterface2Array2[local6].method5044() == 's' || Static577.anInterface2Array2[local6].method5044() == 'S') {
					Static72.aClass2_Sub12_Sub1_1.aBoolean158 = true;
					break;
				}
			}
		}
		@Pc(51) int local51;
		if (Static372.aClass204_24 == Static302.aClass204_2) {
			@Pc(42) Runtime local42 = Runtime.getRuntime();
			local51 = (int) ((local42.totalMemory() - local42.freeMemory()) / 1024L);
			@Pc(54) long local54 = Static548.method7437();
			if (Static100.aLong59 == 0L) {
				Static100.aLong59 = local54;
			}
			if (local51 > 16384 && local54 - Static100.aLong59 < 5000L) {
				if (local54 - Static533.aLong253 > 1000L) {
					System.gc();
					Static533.aLong253 = local54;
				}
				return 0;
			}
		}
		if (Static372.aClass204_24 == Static302.aClass204_3) {
			if (Static55.aClass176_2 == null) {
				Static55.aClass176_2 = new Class176(Static42.aClass327_1, Static282.aClass319_2, Static238.aBigInteger2, Static106.aBigInteger8);
			}
			if (!Static55.aClass176_2.method3948()) {
				return 0;
			}
			Static385.method5666(0, null);
			Static571.aBoolean713 = !Static565.method7680();
			Static50.aClass259_26 = Static205.method3316(false, Static571.aBoolean713 ? 34 : 32);
			Static123.aClass259_47 = Static205.method3316(false, 33);
			Static72.aClass259_33 = Static205.method3316(false, 13);
		}
		if (Static372.aClass204_24 == Static302.aClass204_4) {
			Static123.aClass259_47.method5976();
			local6 = Static443.aClass251_Sub1Array2[33].method5863();
			local6 += Static443.aClass251_Sub1Array2[Static571.aBoolean713 ? 34 : 32].method5863();
			local6 += Static443.aClass251_Sub1Array2[13].method5863();
			local6 += Static123.aClass259_47.method5977();
			if (local6 != 400) {
				return local6 / 4;
			}
			Static56.anInt1299 = Static50.aClass259_26.method5960();
			Static438.anInt7733 = Static123.aClass259_47.method5960();
			Static329.method5052(Static50.aClass259_26);
			local51 = Static72.aClass2_Sub12_Sub1_1.anInt1910;
			Static305.aClass65_1 = new Class65(Static328.aClass284_2, Static52.anInt1264, Static123.aClass259_47);
			@Pc(208) int[] local208 = Static305.aClass65_1.method1198(local51);
			@Pc(214) Class141 local214 = new Class141(Static50.aClass259_26, Static72.aClass259_33);
			if (local208.length > 0) {
				Static276.anInterface1Array2 = new Interface1[local208.length];
				for (@Pc(223) int local223 = 0; local223 < Static276.anInterface1Array2.length; local223++) {
					Static276.anInterface1Array2[local223] = new Class244(Static305.aClass65_1.method1196(local208[local223]), local214);
				}
			}
		}
		if (Static302.aClass204_5 == Static372.aClass204_24) {
			Static288.method4276(Static72.aClass259_33, Static77.method7967(), Static50.aClass259_26);
		}
		if (Static302.aClass204_6 == Static372.aClass204_24) {
			local6 = Static187.method3179();
			local51 = Static290.method4364();
			if (local6 < local51) {
				return local6 * 100 / local51;
			}
		}
		if (Static372.aClass204_24 == Static302.aClass204_7) {
			if (Static276.anInterface1Array2 != null && Static276.anInterface1Array2.length > 0) {
				if (Static276.anInterface1Array2[0].method5716() < 100) {
					return 0;
				}
				if (Static276.anInterface1Array2.length > 1 && Static305.aClass65_1.method1197() && Static276.anInterface1Array2[1].method5716() < 100) {
					return 0;
				}
			}
			Static206.method3319(Static307.aClass100_6);
			Static44.method724(Static307.aClass100_6);
			Static121.method1780(1);
		}
		if (Static302.aClass204_8 == Static372.aClass204_24) {
			for (local6 = 0; local6 < 4; local6++) {
				Static495.aClass355Array1[local6] = Static71.method1165(Static49.anInt1174, Static188.anInt3850);
			}
		}
		if (Static372.aClass204_24 == Static302.aClass204_9) {
			Static490.aClass259_153 = Static205.method3316(false, 8);
			Static461.aClass259_143 = Static205.method3316(false, 0);
			Static7.aClass259_10 = Static205.method3316(false, 1);
			Static156.aClass259_158 = Static205.method3316(false, 2);
			Static538.aClass259_165 = Static205.method3316(false, 3);
			Static261.aClass259_146 = Static205.method3316(false, 4);
			Static525.aClass259_170 = Static205.method3316(true, 5);
			Static343.aClass259_88 = Static205.method3316(true, 6);
			Static22.aClass259_16 = Static205.method3316(false, 7);
			Static369.aClass259_119 = Static205.method3316(false, 9);
			Static356.aClass259_115 = Static205.method3316(false, 10);
			Static338.aClass259_107 = Static205.method3316(false, 11);
			Static355.aClass259_113 = Static205.method3316(false, 12);
			Static493.aClass259_155 = Static205.method3316(false, 14);
			Static223.aClass259_67 = Static205.method3316(false, 15);
			Static216.aClass259_65 = Static205.method3316(false, 16);
			Static377.aClass259_123 = Static205.method3316(false, 17);
			Static363.aClass259_117 = Static205.method3316(false, 18);
			Static485.aClass259_150 = Static205.method3316(false, 19);
			Static287.aClass259_86 = Static205.method3316(false, 20);
			Static568.aClass259_167 = Static205.method3316(false, 21);
			Static407.aClass259_128 = Static205.method3316(false, 22);
			Static59.aClass259_29 = Static205.method3316(true, 23);
			Static515.aClass259_159 = Static205.method3316(false, 24);
			Static535.aClass259_162 = Static205.method3316(false, 25);
			Static212.aClass259_64 = Static205.method3316(true, 26);
			Static395.aClass259_127 = Static205.method3316(false, 27);
			Static446.aClass259_140 = Static205.method3316(true, 28);
			Static314.aClass259_163 = Static205.method3316(false, 29);
			Static591.aClass259_169 = Static205.method3316(true, 30);
			Static355.aClass259_114 = Static205.method3316(true, 31);
		}
		if (Static372.aClass204_24 == Static302.aClass204_10) {
			local6 = 0;
			for (local51 = 0; local51 < 35; local51++) {
				if (Static443.aClass251_Sub1Array2[local51] != null) {
					local6 += Static443.aClass251_Sub1Array2[local51].method5863() * Static172.anIntArray200[local51] / 100;
				}
			}
			if (local6 != 100) {
				if (Static539.anInt8819 < 0) {
					Static539.anInt8819 = local6;
				}
				return (local6 - Static539.anInt8819) * 100 / (100 - Static539.anInt8819);
			}
			Static233.method3628(Static490.aClass259_153);
			Static288.method4276(Static72.aClass259_33, Static77.method7967(), Static490.aClass259_153);
		}
		if (Static302.aClass204_11 == Static372.aClass204_24) {
			Static45.method785();
			Static121.method1780(2);
		}
		if (Static372.aClass204_24 == Static302.aClass204_12) {
			Static48.method815(Static356.aClass287_5, Static591.aClass259_169);
		}
		if (Static372.aClass204_24 == Static302.aClass204_13) {
			local6 = Static83.method1328();
			if (local6 < 100) {
				return local6;
			}
			Static274.method4149(Static446.aClass259_140.method5964(1));
			Static460.method7775(Static446.aClass259_140.method5964(3));
		}
		if (Static372.aClass204_24 == Static302.aClass204_14) {
			if (Static18.anInt503 != -1 && !Static22.aClass259_16.method5990(0, Static18.anInt503)) {
				return 99;
			}
			Static391.anInterface5_8 = new Class48(Static212.aClass259_64, Static369.aClass259_119, Static490.aClass259_153);
			Static241.aClass82_1 = new Class82(Static328.aClass284_2, Static52.anInt1264, Static156.aClass259_158);
			Static207.aClass354_1 = new Class354(Static328.aClass284_2, Static52.anInt1264, Static156.aClass259_158);
			Static156.aClass273_6 = new Class273(Static328.aClass284_2, Static52.anInt1264, Static156.aClass259_158, Static490.aClass259_153);
			Static522.aClass217_1 = new Class217(Static328.aClass284_2, Static52.anInt1264, Static377.aClass259_123);
			Static109.aClass59_4 = new Class59(Static328.aClass284_2, Static52.anInt1264, Static156.aClass259_158);
			Static116.aClass173_4 = new Class173(Static328.aClass284_2, Static52.anInt1264, Static156.aClass259_158);
			Static8.aClass57_1 = new Class57(Static328.aClass284_2, Static52.anInt1264, Static156.aClass259_158, Static22.aClass259_16);
			Static557.aClass307_1 = new Class307(Static328.aClass284_2, Static52.anInt1264, Static156.aClass259_158);
			Static317.aClass41_1 = new Class41(Static328.aClass284_2, Static52.anInt1264, Static156.aClass259_158);
			Static541.aClass97_4 = new Class97(Static328.aClass284_2, Static52.anInt1264, true, Static216.aClass259_65, Static22.aClass259_16);
			Static205.aClass25_3 = new Class25(Static328.aClass284_2, Static52.anInt1264, Static156.aClass259_158, Static490.aClass259_153);
			Static165.aClass306_3 = new Class306(Static328.aClass284_2, Static52.anInt1264, Static156.aClass259_158, Static490.aClass259_153);
			Static254.aClass202_2 = new Class202(Static328.aClass284_2, Static52.anInt1264, true, Static363.aClass259_117, Static22.aClass259_16);
			Static296.aClass218_1 = new Class218(Static328.aClass284_2, Static52.anInt1264, true, Static241.aClass82_1, Static485.aClass259_150, Static22.aClass259_16);
			Static590.aClass158_1 = new Class158(Static328.aClass284_2, Static52.anInt1264, Static156.aClass259_158);
			Static116.aClass140_2 = new Class140(Static328.aClass284_2, Static52.anInt1264, Static287.aClass259_86, Static461.aClass259_143, Static7.aClass259_10);
			Static197.aClass147_1 = new Class147(Static328.aClass284_2, Static52.anInt1264, Static156.aClass259_158);
			Static416.aClass232_1 = new Class232(Static328.aClass284_2, Static52.anInt1264, Static156.aClass259_158);
			Static215.aClass33_1 = new Class33(Static328.aClass284_2, Static52.anInt1264, Static568.aClass259_167, Static22.aClass259_16);
			Static23.aClass24_1 = new Class24(Static328.aClass284_2, Static52.anInt1264, Static156.aClass259_158);
			Static209.aClass134_1 = new Class134(Static328.aClass284_2, Static52.anInt1264, Static156.aClass259_158);
			Static172.aClass262_1 = new Class262(Static328.aClass284_2, Static52.anInt1264, Static156.aClass259_158);
			Static49.aClass282_1 = new Class282(Static328.aClass284_2, Static52.anInt1264, Static407.aClass259_128);
			Static146.aClass7_1 = new Class7(Static328.aClass284_2, Static52.anInt1264, Static156.aClass259_158);
			Static57.method945(Static72.aClass259_33, Static538.aClass259_165, Static490.aClass259_153, Static22.aClass259_16);
			Static103.method1546(Static314.aClass259_163);
			Static336.aClass248_1 = new Class248(Static52.anInt1264, Static515.aClass259_159, Static535.aClass259_162);
			Static541.aClass304_2 = new Class304(Static52.anInt1264, Static515.aClass259_159, Static535.aClass259_162, new Class77());
			Static262.method4043();
			Static541.aClass97_4.method1800(!Static72.aClass2_Sub12_Sub1_1.method1422(Static391.anInt6846));
			Static70.aClass78_1 = new Class78();
			Static29.method539();
			Static494.method6894(Static395.aClass259_127);
			Static586.method7933(Static22.aClass259_16, Static391.anInterface5_8);
			@Pc(895) Class92 local895 = new Class92(Static356.aClass259_115.method5965("huffman", ""));
			Static526.method7229(local895);
			try {
				jagmisc.init();
			} catch (@Pc(902) Throwable local902) {
			}
			Static9.aClass15_1 = Static227.method3534();
		}
		if (Static372.aClass204_24 == Static302.aClass204_16) {
			local6 = Static42.method708(Static490.aClass259_153) + Static453.method6461(true);
			local51 = Static99.method1494() + Static290.method4364();
			if (local6 < local51) {
				return local6 * 100 / local51;
			}
		}
		if (Static302.aClass204_17 == Static372.aClass204_24) {
			Static270.method1315(Static59.aClass259_29, Static109.aClass59_4, Static116.aClass173_4, Static541.aClass97_4, Static205.aClass25_3, Static165.aClass306_3, Static70.aClass78_1);
		}
		if (Static302.aClass204_18 == Static372.aClass204_24) {
			Static67.aStringArray25 = new String[Static209.aClass134_1.anInt3849];
			Static470.anIntArray532 = new int[Static172.aClass262_1.anInt7191];
			Static254.aBooleanArray23 = new boolean[Static172.aClass262_1.anInt7191];
			for (local51 = 0; local51 < Static172.aClass262_1.anInt7191; local51++) {
				if (Static172.aClass262_1.method6032(local51).anInt4174 == 0) {
					Static254.aBooleanArray23[local51] = true;
					Static235.anInt4371++;
				}
				Static470.anIntArray532[local51] = -1;
			}
			Static264.method4066();
			Static360.anInt6452 = Static538.aClass259_165.method5961("loginscreen");
			Static321.anInt5973 = Static538.aClass259_165.method5961("lobbyscreen");
			Static525.aClass259_170.method5963(false);
			Static343.aClass259_88.method5963(true);
			Static490.aClass259_153.method5963(true);
			Static72.aClass259_33.method5963(true);
			Static356.aClass259_115.method5963(true);
			Static538.aClass259_165.method5963(true);
			Static441.aBoolean613 = true;
			Static156.aClass259_158.anInt7135 = 2;
			Static377.aClass259_123.anInt7135 = 2;
			Static216.aClass259_65.anInt7135 = 2;
			Static363.aClass259_117.anInt7135 = 2;
			Static485.aClass259_150.anInt7135 = 2;
			Static287.aClass259_86.anInt7135 = 2;
			Static568.aClass259_167.anInt7135 = 2;
		}
		@Pc(1084) Class196 local1084;
		if (Static302.aClass204_19 == Static372.aClass204_24) {
			if (!Static168.method2918(Static360.anInt6452)) {
				return 0;
			}
			for (local51 = 0; local51 < Static2.aClass196ArrayArray1[Static360.anInt6452].length; local51++) {
				local1084 = Static2.aClass196ArrayArray1[Static360.anInt6452][local51];
				if (local1084.anInt5098 == 5 && local1084.anInt5124 != -1) {
					local1084.method4245(Static307.aClass100_6);
				}
			}
		}
		if (Static302.aClass204_20 == Static372.aClass204_24) {
			for (local51 = 0; local51 < Static2.aClass196ArrayArray1[Static360.anInt6452].length; local51++) {
				local1084 = Static2.aClass196ArrayArray1[Static360.anInt6452][local51];
				if (local1084.anInt5098 == 5 && local1084.anInt5124 != -1 && local1084.method4245(Static307.aClass100_6) == null && Static150.aBoolean243) {
					return 0;
				}
			}
		}
		if (Static302.aClass204_21 == Static372.aClass204_24) {
			Static378.method5602(true);
		}
		if (Static372.aClass204_24 == Static302.aClass204_22) {
			Static527.aClass175_1.method3943();
			try {
				Static462.aThread5.join();
			} catch (@Pc(1162) InterruptedException local1162) {
				return 0;
			}
			Static50.aClass259_26 = null;
			Static527.aClass175_1 = null;
			Static462.aThread5 = null;
			Static123.aClass259_47 = null;
			Static276.anInterface1Array2 = null;
			Static305.aClass65_1 = null;
			Static208.method3343();
			Static366.aBoolean508 = Static72.aClass2_Sub12_Sub1_1.aBoolean158;
			Static72.aClass2_Sub12_Sub1_1.aBoolean158 = true;
			Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
			if (Static366.aBoolean508) {
				Static547.method5859(0);
			} else {
				Static547.method5859(Static72.aClass2_Sub12_Sub1_1.anInt1917);
			}
			Static273.method4136(false, -1, -1, Static72.aClass2_Sub12_Sub1_1.anInt1908);
			Static206.method3319(Static307.aClass100_6);
			Static44.method724(Static307.aClass100_6);
			Static542.method7381(Static490.aClass259_153, Static307.aClass100_6);
			Static218.method4199(Static491.aClass39Array13);
		}
		return Static157.method2576();
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IZ)Z")
	public static boolean method3515(@OriginalArg(1) boolean arg0) {
		@Pc(6) boolean local6 = Static307.aClass100_6.method6248();
		if (local6 == arg0) {
			return true;
		}
		if (!arg0) {
			Static307.aClass100_6.method6184();
		} else if (!Static307.aClass100_6.method6197()) {
			arg0 = false;
		}
		if (arg0 == local6) {
			return false;
		} else {
			Static72.aClass2_Sub12_Sub1_1.aBoolean168 = arg0;
			Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
			return true;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!qda;")
	public static Class6_Sub1_Sub1 method3516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class346 local7 = Static389.aClass346ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class153 local14 = local7.aClass153_3; local14 != null; local14 = local14.aClass153_1) {
			@Pc(18) Class6_Sub1_Sub1 local18 = local14.aClass6_Sub1_Sub1_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort85 == arg1 && local18.aShort83 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZZIIZ)I")
	public static int method3517(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class2_Sub23 local10 = Static124.method1801(false, arg2);
		if (local10 == null) {
			return 0;
		}
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < local10.anIntArray234.length; local23++) {
			if (local10.anIntArray234[local23] >= 0 && local10.anIntArray234[local23] < Static296.aClass218_1.anInt6086) {
				@Pc(49) Class339 local49 = Static296.aClass218_1.method5067(local10.anIntArray234[local23]);
				@Pc(59) int local59 = local49.method7471(arg1, Static241.aClass82_1.method1498(arg1).anInt9310);
				if (arg0) {
					local21 += local59 * local10.anIntArray233[local23];
				} else {
					local21 += local59;
				}
			}
		}
		return local21;
	}
}
