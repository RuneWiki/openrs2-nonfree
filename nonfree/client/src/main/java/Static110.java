import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "Z")
	public static boolean aBoolean160;

	@OriginalMember(owner = "client!wd", name = "r", descriptor = "Lclient!qd;")
	public static Class2_Sub1_Sub4_Sub3 aClass2_Sub1_Sub4_Sub3_23;

	@OriginalMember(owner = "client!wd", name = "t", descriptor = "[[I")
	public static int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!wd", name = "u", descriptor = "Lclient!wc;")
	public static Class2_Sub1_Sub4_Sub4 aClass2_Sub1_Sub4_Sub4_3;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "Lclient!wb;")
	private static Class65 aClass65_1376 = Static24.method441("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
	public static int anInt2937 = 0;

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1377 = Static24.method441("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
	public static int anInt2938 = 0;

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1378 = aClass65_1376;

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1379 = Static24.method441("weiss:");

	@OriginalMember(owner = "client!wd", name = "j", descriptor = "[Lclient!mc;")
	public static Class33_Sub1[] aClass33_Sub1Array1 = new Class33_Sub1[256];

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
	public static int anInt2943 = 0;

	@OriginalMember(owner = "client!wd", name = "q", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1380 = Static24.method441("leuchten3:");

	@OriginalMember(owner = "client!wd", name = "s", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1381 = Static24.method441("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)Z")
	public static boolean method1840(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0 && arg1 == Static107.anInt2853) {
			return true;
		} else if (arg0 == 1 && Static54.anInt1629 == arg1) {
			return true;
		} else {
			return (arg0 == 2 || arg0 == 3) && Static46.anInt1376 == arg1;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)Lclient!na;")
	public static Class2_Sub1_Sub9 method1841(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub1_Sub9 local12 = (Class2_Sub1_Sub9) Static17.aClass21_6.method744((long) arg0);
		if (local12 != null) {
			return local12;
		}
		local12 = Static98.method1691(arg0, Static22.aClass33_7, Static38.aClass33_15);
		if (local12 != null) {
			Static17.aClass21_6.method745((long) arg0, local12);
		}
		return local12;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
	public static void method1842() {
		aClass65_1378 = null;
		anIntArrayArray26 = null;
		aClass65_1377 = null;
		aClass65_1379 = null;
		aClass2_Sub1_Sub4_Sub4_3 = null;
		aClass65_1381 = null;
		aClass65_1376 = null;
		aClass33_Sub1Array1 = null;
		aClass2_Sub1_Sub4_Sub3_23 = null;
		aClass65_1380 = null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I[BB)I")
	public static int method1843(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		return Static22.method416(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!k;B)I")
	public static int method1844(@OriginalArg(0) Class33 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method1152(Static30.aClass65_453, Static56.aClass65_768)) {
			local5++;
		}
		if (arg0.method1152(Static30.aClass65_453, Static46.aClass65_610)) {
			local5++;
		}
		if (arg0.method1152(Static30.aClass65_453, Static82.aClass65_1061)) {
			local5++;
		}
		if (arg0.method1152(Static30.aClass65_453, Static35.aClass65_511)) {
			local5++;
		}
		if (arg0.method1152(Static30.aClass65_453, Static84.aClass65_1087)) {
			local5++;
		}
		if (arg0.method1152(Static30.aClass65_453, Static71.aClass65_1001)) {
			local5++;
		}
		if (arg0.method1152(Static30.aClass65_453, Static79.aClass65_1037)) {
			local5++;
		}
		if (arg0.method1152(Static30.aClass65_453, Static34.aClass65_483)) {
			local5++;
		}
		if (arg0.method1152(Static30.aClass65_453, Static60.aClass65_831)) {
			local5++;
		}
		if (arg0.method1152(Static30.aClass65_453, Static81.aClass65_1349)) {
			local5++;
		}
		if (arg0.method1152(Static30.aClass65_453, Static32.aClass65_459)) {
			local5++;
		}
		if (arg0.method1152(Static30.aClass65_453, Static85.aClass65_1108)) {
			local5++;
		}
		if (arg0.method1152(Static30.aClass65_453, Static25.aClass65_352)) {
			local5++;
		}
		if (arg0.method1152(Static30.aClass65_453, Static59.aClass65_824)) {
			local5++;
		}
		if (arg0.method1152(Static30.aClass65_453, Static47.aClass65_613)) {
			local5++;
		}
		if (arg0.method1152(Static30.aClass65_453, Static20.aClass65_296)) {
			local5++;
		}
		if (arg0.method1152(Static30.aClass65_453, Static33.aClass65_1053)) {
			local5++;
		}
		if (arg0.method1152(Static30.aClass65_453, Static51.aClass65_687)) {
			local5++;
		}
		if (arg0.method1152(Static30.aClass65_453, Static47.aClass65_616)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IBLclient!ab;)I")
	public static int method1845(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub1_Sub2 arg1) {
		if (arg1.anIntArrayArray2 == null || arg1.anIntArrayArray2.length <= arg0) {
			return -2;
		}
		try {
			@Pc(20) int[] local20 = arg1.anIntArrayArray2[arg0];
			@Pc(22) int local22 = 0;
			@Pc(24) byte local24 = 0;
			@Pc(26) int local26 = 0;
			while (true) {
				@Pc(36) int local36 = local20[local26++];
				@Pc(38) int local38 = 0;
				@Pc(40) byte local40 = 0;
				if (local36 == 0) {
					return local22;
				}
				if (local36 == 15) {
					local40 = 1;
				}
				if (local36 == 1) {
					local38 = Static63.anIntArray258[local20[local26++]];
				}
				if (local36 == 2) {
					local38 = Static18.anIntArray367[local20[local26++]];
				}
				if (local36 == 3) {
					local38 = Static81.anIntArray414[local20[local26++]];
				}
				if (local36 == 16) {
					local40 = 2;
				}
				if (local36 == 17) {
					local40 = 3;
				}
				@Pc(105) int local105;
				@Pc(116) Class2_Sub1_Sub2 local116;
				@Pc(121) int local121;
				@Pc(134) int local134;
				if (local36 == 4) {
					local105 = local20[local26++] << 16;
					@Pc(112) int local112 = local105 + local20[local26++];
					local116 = Static28.method503(local112);
					local121 = local20[local26++];
					if (local121 != -1 && (!Static70.method1263(local121).aBoolean97 || Static105.aBoolean152)) {
						for (local134 = 0; local134 < local116.anIntArray19.length; local134++) {
							if (local121 + 1 == local116.anIntArray19[local134]) {
								local38 += local116.anIntArray26[local134];
							}
						}
					}
				}
				if (local36 == 5) {
					local38 = Static26.anIntArray416[local20[local26++]];
				}
				if (local36 == 6) {
					local38 = Class14.anIntArray366[Static18.anIntArray367[local20[local26++]] - 1];
				}
				if (local36 == 7) {
					local38 = Static26.anIntArray416[local20[local26++]] * 100 / 46875;
				}
				if (local36 == 8) {
					local38 = Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1583;
				}
				if (local36 == 9) {
					for (local105 = 0; local105 < 25; local105++) {
						if (Static18.aBooleanArray25[local105]) {
							local38 += Static18.anIntArray367[local105];
						}
					}
				}
				if (local36 == 10) {
					local105 = local20[local26++] << 16;
					local105 += local20[local26++];
					local116 = Static28.method503(local105);
					local121 = local20[local26++];
					if (local121 != -1 && (!Static70.method1263(local121).aBoolean97 || Static105.aBoolean152)) {
						for (local134 = 0; local134 < local116.anIntArray19.length; local134++) {
							if (local121 + 1 == local116.anIntArray19[local134]) {
								local38 = 999999999;
								break;
							}
						}
					}
				}
				if (local36 == 11) {
					local38 = Static39.anInt1247;
				}
				if (local36 == 12) {
					local38 = Static24.anInt723;
				}
				if (local36 == 13) {
					local105 = Static26.anIntArray416[local20[local26++]];
					@Pc(322) int local322 = local20[local26++];
					local38 = (0x1 << local322 & local105) == 0 ? 0 : 1;
				}
				if (local36 == 14) {
					local105 = local20[local26++];
					local38 = Static36.method741(local105);
				}
				if (local36 == 18) {
					local38 = (Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1518 >> 7) + Static107.anInt2849;
				}
				if (local36 == 19) {
					local38 = Static37.anInt1220 + (Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1562 >> 7);
				}
				if (local36 == 20) {
					local38 = local20[local26++];
				}
				if (local40 == 0) {
					if (local24 == 0) {
						local22 += local38;
					}
					if (local24 == 1) {
						local22 -= local38;
					}
					if (local24 == 2 && local38 != 0) {
						local22 /= local38;
					}
					if (local24 == 3) {
						local22 *= local38;
					}
					local24 = 0;
				} else {
					local24 = local40;
				}
			}
		} catch (@Pc(417) Exception local417) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IILclient!od;)V")
	public static void method1846(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub1_Sub2 arg1) {
		if (arg1.anInt1518 < 128 || arg1.anInt1562 < 128 || arg1.anInt1518 >= 13184 || arg1.anInt1562 >= 13184) {
			arg1.anInt1565 = 0;
			arg1.anInt1552 = -1;
			arg1.anInt1554 = -1;
			arg1.anInt1517 = 0;
			arg1.anInt1518 = arg1.anInt1521 * 64 + arg1.anIntArray209[0] * 128;
			arg1.anInt1562 = arg1.anInt1521 * 64 + arg1.anIntArray208[0] * 128;
			arg1.method926();
		}
		if (arg1 == Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1 && (arg1.anInt1518 < 1536 || arg1.anInt1562 < 1536 || arg1.anInt1518 >= 11776 || arg1.anInt1562 >= 11776)) {
			arg1.anInt1517 = 0;
			arg1.anInt1554 = -1;
			arg1.anInt1565 = 0;
			arg1.anInt1552 = -1;
			arg1.anInt1518 = arg1.anInt1521 * 64 + arg1.anIntArray209[0] * 128;
			arg1.anInt1562 = arg1.anIntArray208[0] * 128 + arg1.anInt1521 * 64;
			arg1.method926();
		}
		if (arg1.anInt1565 > Static108.anInt2902) {
			Static29.method520(arg1);
		} else if (Static108.anInt2902 <= arg1.anInt1517) {
			Static65.method1161(arg1);
		} else {
			Static80.method1358(arg1);
		}
		Static71.method1293(arg1);
		Static54.method960(arg1);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IBII)I")
	public static int method1847(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static50.aByteArrayArrayArray6[arg2][arg0][arg1] & 0x8) == 0) {
			return arg2 <= 0 || (Static50.aByteArrayArrayArray6[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}
}
