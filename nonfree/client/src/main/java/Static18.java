import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
	public static int anInt458;

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "[[B")
	public static byte[][] aByteArrayArray13;

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
	public static int anInt464;

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "S")
	public static short aShort1 = 205;

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "[I")
	public static int[] anIntArray29 = new int[200];

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "([BI)[B")
	public static byte[] method408(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local6];
		Static301.method302(arg0, 0, local14, 0, local6);
		return local14;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
	public static void method409() {
		Static293.anInt6087 = 0;
		@Pc(18) int local18 = Static125.anInt5772 + (Static111.aClass36_Sub3_Sub2_1.anInt5093 >> 7);
		@Pc(26) int local26 = (Static111.aClass36_Sub3_Sub2_1.anInt5109 >> 7) + Static203.anInt4236;
		if (local18 >= 3053 && local18 <= 3156 && local26 >= 3056 && local26 <= 3136) {
			Static293.anInt6087 = 1;
		}
		if (local18 >= 3072 && local18 <= 3118 && local26 >= 9492 && local26 <= 9535) {
			Static293.anInt6087 = 1;
		}
		if (Static293.anInt6087 == 1 && local18 >= 3139 && local18 <= 3199 && local26 >= 3008 && local26 <= 3062) {
			Static293.anInt6087 = 0;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
	public static void method410() {
		Static201.method3398(false);
		@Pc(10) boolean local10 = true;
		Static268.anInt5542 = 0;
		@Pc(14) int local14;
		for (local14 = 0; local14 < Static275.aByteArrayArray117.length; local14++) {
			if (Static293.anIntArray520[local14] != -1 && Static275.aByteArrayArray117[local14] == null) {
				Static275.aByteArrayArray117[local14] = Static11.aClass84_8.method2127(0, Static293.anIntArray520[local14]);
				if (Static275.aByteArrayArray117[local14] == null) {
					Static268.anInt5542++;
					local10 = false;
				}
			}
			if (Static47.anIntArray91[local14] != -1 && Static75.aByteArrayArray34[local14] == null) {
				Static75.aByteArrayArray34[local14] = Static11.aClass84_8.method2126(Static47.anIntArray91[local14], 0, Static181.anIntArrayArray33[local14]);
				if (Static75.aByteArrayArray34[local14] == null) {
					local10 = false;
					Static268.anInt5542++;
				}
			}
			if (Static60.aBoolean106) {
				if (Static90.anIntArray147[local14] != -1 && Static155.aByteArrayArray126[local14] == null) {
					Static155.aByteArrayArray126[local14] = Static11.aClass84_8.method2127(0, Static90.anIntArray147[local14]);
					if (Static155.aByteArrayArray126[local14] == null) {
						Static268.anInt5542++;
						local10 = false;
					}
				}
				if (Static218.anIntArray377[local14] != -1 && Static43.aByteArrayArray23[local14] == null) {
					Static43.aByteArrayArray23[local14] = Static11.aClass84_8.method2127(0, Static218.anIntArray377[local14]);
					if (Static43.aByteArrayArray23[local14] == null) {
						Static268.anInt5542++;
						local10 = false;
					}
				}
			}
			if (Static67.anIntArray522 != null && aByteArrayArray13[local14] == null && Static67.anIntArray522[local14] != -1) {
				aByteArrayArray13[local14] = Static11.aClass84_8.method2126(Static67.anIntArray522[local14], 0, Static181.anIntArrayArray33[local14]);
				if (aByteArrayArray13[local14] == null) {
					local10 = false;
					Static268.anInt5542++;
				}
			}
		}
		if (Static104.aClass113_2 == null) {
			if (Static56.aClass2_Sub3_Sub18_1 == null || !Static164.aClass84_65.method2143(Static56.aClass2_Sub3_Sub18_1.aString183 + "_labels")) {
				Static104.aClass113_2 = new Class113(0);
			} else if (Static164.aClass84_65.method2117(Static56.aClass2_Sub3_Sub18_1.aString183 + "_labels")) {
				Static104.aClass113_2 = Static266.method4445(Static164.aClass84_65, Static56.aClass2_Sub3_Sub18_1.aString183 + "_labels");
			} else {
				Static268.anInt5542++;
				local10 = false;
			}
		}
		if (!local10) {
			Static44.anInt1074 = 1;
			return;
		}
		local10 = true;
		Static148.anInt3167 = 0;
		@Pc(293) int local293;
		@Pc(304) int local304;
		for (local14 = 0; local14 < Static275.aByteArrayArray117.length; local14++) {
			@Pc(279) byte[] local279 = Static75.aByteArrayArray34[local14];
			if (local279 != null) {
				local293 = (Static63.anIntArray105[local14] >> 8) * 64 - Static125.anInt5772;
				local304 = (Static63.anIntArray105[local14] & 0xFF) * 64 - Static203.anInt4236;
				if (Static136.aBoolean237) {
					local293 = 10;
					local304 = 10;
				}
				local10 &= Static70.method1322(local304, local293, local279);
			}
			if (Static60.aBoolean106) {
				local279 = Static43.aByteArrayArray23[local14];
				if (local279 != null) {
					local293 = (Static63.anIntArray105[local14] >> 8) * 64 - Static125.anInt5772;
					local304 = (Static63.anIntArray105[local14] & 0xFF) * 64 - Static203.anInt4236;
					if (Static136.aBoolean237) {
						local304 = 10;
						local293 = 10;
					}
					local10 &= Static70.method1322(local304, local293, local279);
				}
			}
		}
		if (!local10) {
			Static44.anInt1074 = 2;
			return;
		}
		if (Static44.anInt1074 != 0) {
			Static264.method4420(true, Static245.aString256 + "<br>(100%)");
		}
		Static203.method3422();
		Static150.method2608();
		@Pc(394) boolean local394 = false;
		@Pc(400) int local400;
		if (Static60.aBoolean106 && Static233.aBoolean407) {
			for (local400 = 0; local400 < Static275.aByteArrayArray117.length; local400++) {
				if (Static43.aByteArrayArray23[local400] != null || Static155.aByteArrayArray126[local400] != null) {
					local394 = true;
					break;
				}
			}
		}
		Static100.method1915(Static60.aBoolean106 ? 28 : 25, local394);
		for (local400 = 0; local400 < 4; local400++) {
			Static98.aClass52Array1[local400].method1243();
		}
		for (local400 = 0; local400 < 4; local400++) {
			for (local293 = 0; local293 < 104; local293++) {
				for (local304 = 0; local304 < 104; local304++) {
					Static134.aByteArrayArrayArray9[local400][local293][local304] = 0;
				}
			}
		}
		Static151.method2612(false);
		if (Static60.aBoolean106) {
			Static194.aClass71_Sub1_2.method1859();
			for (local400 = 0; local400 < 13; local400++) {
				for (local293 = 0; local293 < 13; local293++) {
					Static194.aClass88ArrayArray1[local400][local293].aBoolean206 = true;
				}
			}
		}
		if (Static60.aBoolean106) {
			Static128.method2273();
		}
		if (Static60.aBoolean106) {
			Static191.method631();
		}
		Static203.method3422();
		System.gc();
		Static201.method3398(true);
		Static143.method2543(false);
		if (!Static136.aBoolean237) {
			Static157.method2694(false);
			Static201.method3398(true);
			if (Static60.aBoolean106) {
				local293 = Static111.aClass36_Sub3_Sub2_1.anIntArray468[0] >> 3;
				local400 = Static111.aClass36_Sub3_Sub2_1.anIntArray465[0] >> 3;
				Static289.method4812(local400, local293);
			}
			Static118.method2183(false);
			if (aByteArrayArray13 != null) {
				Static208.method3527();
			}
		}
		if (Static136.aBoolean237) {
			Static172.method2958(false);
			Static201.method3398(true);
			if (Static60.aBoolean106) {
				local400 = Static111.aClass36_Sub3_Sub2_1.anIntArray465[0] >> 3;
				local293 = Static111.aClass36_Sub3_Sub2_1.anIntArray468[0] >> 3;
				Static289.method4812(local400, local293);
			}
			Static237.method3918(false);
		}
		Static150.method2608();
		Static201.method3398(true);
		Static124.method2247(Static98.aClass52Array1, false, Static136.aBoolean237 ? Static173.anIntArrayArrayArray8 : (int[][][]) null);
		if (Static60.aBoolean106) {
			Static128.method2281();
		}
		Static201.method3398(true);
		local400 = Static295.anInt6152;
		if (Static208.anInt4335 < local400) {
			local400 = Static208.anInt4335;
		}
		if (Static208.anInt4335 - 1 > local400) {
		}
		if (Static67.method4885()) {
			Static274.method4580(0);
		} else {
			Static274.method4580(Static295.anInt6152);
		}
		Static133.method2319();
		if (Static60.aBoolean106 && local394) {
			Static219.method3700(true);
			Static143.method2543(true);
			if (!Static136.aBoolean237) {
				Static157.method2694(true);
				Static201.method3398(true);
				Static118.method2183(true);
			}
			if (Static136.aBoolean237) {
				Static172.method2958(true);
				Static201.method3398(true);
				Static237.method3918(true);
			}
			Static150.method2608();
			Static201.method3398(true);
			Static124.method2247(Static98.aClass52Array1, true, Static136.aBoolean237 ? Static173.anIntArrayArrayArray8 : (int[][][]) null);
			Static201.method3398(true);
			Static133.method2319();
			Static219.method3700(false);
		}
		if (Static60.aBoolean106) {
			for (local293 = 0; local293 < 13; local293++) {
				for (local304 = 0; local304 < 13; local304++) {
					Static194.aClass88ArrayArray1[local293][local304].method2246(Static141.anIntArrayArrayArray4[0], local293 * 8, local304 * 8);
				}
			}
		}
		for (local293 = 0; local293 < 104; local293++) {
			for (local304 = 0; local304 < 104; local304++) {
				Static40.method770(local304, local293);
			}
		}
		Static296.method4924();
		Static203.method3422();
		Static198.method3361();
		Static150.method2608();
		Static122.aBoolean200 = false;
		if (Static60.aBoolean106) {
			Static143.method2540(true);
		}
		if (Static298.aFrame3 != null && Static42.aClass45_1 != null && Static236.anInt4804 == 25) {
			Static95.aClass2_Sub26_Sub1_1.method4287(12);
			Static95.aClass2_Sub26_Sub1_1.method4260(1057001181);
		}
		if (!Static136.aBoolean237) {
			local304 = (Static246.anInt5145 + 6) / 8;
			local293 = (Static246.anInt5145 - 6) / 8;
			@Pc(829) int local829 = (Static68.anInt1503 - 6) / 8;
			@Pc(835) int local835 = (Static68.anInt1503 + 6) / 8;
			for (@Pc(839) int local839 = local293 - 1; local839 <= local304 + 1; local839++) {
				for (@Pc(848) int local848 = local829 - 1; local848 <= local835 + 1; local848++) {
					if (local293 > local839 || local839 > local304 || local829 > local848 || local835 < local848) {
						Static11.aClass84_8.method2130("m" + local839 + "_" + local848);
						Static11.aClass84_8.method2130("l" + local839 + "_" + local848);
					}
				}
			}
		}
		if (Static236.anInt4804 == 28) {
			Static21.method453(10);
		} else {
			Static21.method453(30);
			if (Static42.aClass45_1 != null) {
				Static95.aClass2_Sub26_Sub1_1.method4287(172);
			}
		}
		Static288.method4796();
		Static203.method3422();
		Static192.method3212();
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)I")
	public static int method411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local13 *= arg1;
			}
			arg0 >>= 0x1;
			arg1 *= arg1;
		}
		if (arg0 == 1) {
			return arg1 * local13;
		} else {
			return local13;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IC)Z")
	public static boolean method412(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}
}
