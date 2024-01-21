import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!j", name = "X", descriptor = "I")
	public static int anInt1922;

	@OriginalMember(owner = "client!j", name = "Z", descriptor = "I")
	public static int anInt1924;

	@OriginalMember(owner = "client!j", name = "cb", descriptor = "[I")
	public static int[] anIntArray319;

	@OriginalMember(owner = "client!j", name = "Q", descriptor = "Lclient!sg;")
	private static Class77 aClass77_768 = Static146.method2172("Loaded wordpack");

	@OriginalMember(owner = "client!j", name = "P", descriptor = "Lclient!sg;")
	public static Class77 aClass77_767 = aClass77_768;

	@OriginalMember(owner = "client!j", name = "V", descriptor = "Lclient!sg;")
	public static Class77 aClass77_769 = Static146.method2172("event_opbase");

	@OriginalMember(owner = "client!j", name = "ab", descriptor = "Lclient!sg;")
	public static Class77 aClass77_770 = Static146.method2172("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!j", name = "bb", descriptor = "[I")
	public static int[] anIntArray318 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!j", name = "db", descriptor = "Lclient!sg;")
	public static Class77 aClass77_771 = Static146.method2172("blinken3:");

	@OriginalMember(owner = "client!j", name = "eb", descriptor = "I")
	public static int anInt1925 = 0;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIII)V")
	public static void method1383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static34.method700();
		Static113.method1244(arg0, arg1, Static100.aClass2_Sub2_Sub3_Sub3_2.anInt1451 + arg0, Static100.aClass2_Sub2_Sub3_Sub3_2.anInt1449 + arg1);
		if (Static84.anInt3146 == 2 || Static84.anInt3146 == 5) {
			Static113.method1241(arg0 + 25, arg1 - -5, Static25.anIntArray99, Static114.anIntArray432);
		} else {
			@Pc(28) int local28 = Static160.anInt4572 + Static28.anInt832 & 0x7FF;
			@Pc(35) int local35 = Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4400 / 32 + 48;
			@Pc(43) int local43 = 464 - Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4385 / 32;
			Static76.aClass2_Sub2_Sub3_Sub2_4.method409(arg0 + 25, arg1 + 5, 146, 151, local35, local43, local28, Static130.anInt3166 + 256, Static25.anIntArray99, Static114.anIntArray432);
			@Pc(79) int local79;
			@Pc(92) int local92;
			for (@Pc(64) int local64 = 0; local64 < Static77.anInt2029; local64++) {
				local79 = Static178.anIntArray638[local64] * 4 + 2 - Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4400 / 32;
				local92 = Static97.anIntArray391[local64] * 4 + 2 - Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4385 / 32;
				Static61.method1147(local79, Static181.aClass2_Sub2_Sub3_Sub2Array13[local64], arg0, arg1, local92);
			}
			@Pc(133) int local133;
			@Pc(145) int local145;
			for (local79 = 0; local79 < 104; local79++) {
				for (local92 = 0; local92 < 104; local92++) {
					@Pc(119) Class10 local119 = Static53.aClass10ArrayArrayArray1[Static54.anInt1472][local79][local92];
					if (local119 != null) {
						local133 = local79 * 4 + 2 - Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4400 / 32;
						local145 = local92 * 4 + 2 - Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4385 / 32;
						Static61.method1147(local133, Static107.aClass2_Sub2_Sub3_Sub2Array8[0], arg0, arg1, local145);
					}
				}
			}
			@Pc(223) int local223;
			for (local92 = 0; local92 < Static145.anInt3533; local92++) {
				@Pc(175) Class2_Sub2_Sub1_Sub6_Sub2 local175 = Static48.aClass2_Sub2_Sub1_Sub6_Sub2Array1[Static160.anIntArray643[local92]];
				if (local175 != null && local175.method2916()) {
					@Pc(184) Class2_Sub2_Sub16 local184 = local175.aClass2_Sub2_Sub16_1;
					if (local184 != null && local184.anIntArray555 != null) {
						local184 = local184.method2613();
					}
					if (local184 != null && local184.aBoolean152 && local184.aBoolean155) {
						local145 = local175.anInt4400 / 32 - Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4400 / 32;
						local223 = local175.anInt4385 / 32 - Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4385 / 32;
						Static61.method1147(local145, Static107.aClass2_Sub2_Sub3_Sub2Array8[1], arg0, arg1, local223);
					}
				}
			}
			@Pc(249) Class2_Sub2_Sub1_Sub6_Sub1 local249;
			for (@Pc(242) int local242 = 0; local242 < Static124.anInt3042; local242++) {
				local249 = Static58.aClass2_Sub2_Sub1_Sub6_Sub1Array1[Static177.anIntArray632[local242]];
				if (local249 != null && local249.method2916()) {
					local145 = local249.anInt4400 / 32 - Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4400 / 32;
					local223 = local249.anInt4385 / 32 - Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4385 / 32;
					@Pc(279) boolean local279 = false;
					@Pc(284) long local284 = local249.aClass77_1482.method2531();
					for (@Pc(286) int local286 = 0; local286 < Static51.anInt1395; local286++) {
						if (Static125.aLongArray6[local286] == local284 && Static11.anIntArray41[local286] != 0) {
							local279 = true;
							break;
						}
					}
					@Pc(310) boolean local310 = false;
					if (Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4327 != 0 && local249.anInt4327 != 0 && Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4327 == local249.anInt4327) {
						local310 = true;
					}
					if (local279) {
						Static61.method1147(local145, Static107.aClass2_Sub2_Sub3_Sub2Array8[3], arg0, arg1, local223);
					} else if (local310) {
						Static61.method1147(local145, Static107.aClass2_Sub2_Sub3_Sub2Array8[4], arg0, arg1, local223);
					} else {
						Static61.method1147(local145, Static107.aClass2_Sub2_Sub3_Sub2Array8[2], arg0, arg1, local223);
					}
				}
			}
			if (Static119.anInt2968 != 0 && Static143.anInt3513 % 20 < 10) {
				if (Static119.anInt2968 == 1 && Static148.anInt3613 >= 0 && Static148.anInt3613 < Static48.aClass2_Sub2_Sub1_Sub6_Sub2Array1.length) {
					@Pc(402) Class2_Sub2_Sub1_Sub6_Sub2 local402 = Static48.aClass2_Sub2_Sub1_Sub6_Sub2Array1[Static148.anInt3613];
					if (local402 != null) {
						local145 = local402.anInt4400 / 32 - Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4400 / 32;
						local223 = local402.anInt4385 / 32 - Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4385 / 32;
						Static96.method1754(local223, arg1, Static98.aClass2_Sub2_Sub3_Sub2Array7[1], local145, arg0);
					}
				}
				if (Static119.anInt2968 == 2) {
					local133 = (Static101.anInt2501 - Static157.anInt3889) * 4 + 2 - Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4400 / 32;
					local145 = (Static152.anInt3739 - Static168.anInt4143) * 4 + 2 - Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4385 / 32;
					Static96.method1754(local145, arg1, Static98.aClass2_Sub2_Sub3_Sub2Array7[1], local133, arg0);
				}
				if (Static119.anInt2968 == 10 && Static140.anInt3376 >= 0 && Static140.anInt3376 < Static58.aClass2_Sub2_Sub1_Sub6_Sub1Array1.length) {
					local249 = Static58.aClass2_Sub2_Sub1_Sub6_Sub1Array1[Static140.anInt3376];
					if (local249 != null) {
						local145 = local249.anInt4400 / 32 - Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4400 / 32;
						local223 = local249.anInt4385 / 32 - Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4385 / 32;
						Static96.method1754(local223, arg1, Static98.aClass2_Sub2_Sub3_Sub2Array7[1], local145, arg0);
					}
				}
			}
			if (Static136.anInt3295 != 0) {
				local133 = Static136.anInt3295 * 4 + 2 - Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4400 / 32;
				local145 = Static85.anInt2206 * 4 + 2 - Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4385 / 32;
				Static61.method1147(local133, Static98.aClass2_Sub2_Sub3_Sub2Array7[0], arg0, arg1, local145);
			}
			Static113.method1243(arg0 + 93 + 4, arg1 - -82 - 4, 3, 3, 16777215);
		}
		if (Static84.anInt3146 >= 3) {
			Static113.method1241(arg0, arg1, Static78.anIntArray345, Static171.anIntArray604);
		} else {
			Static58.aClass2_Sub2_Sub3_Sub2_3.method409(arg0, arg1, 33, 33, 25, 25, Static28.anInt832, 256, Static78.anIntArray345, Static171.anIntArray604);
		}
		if (Static152.aBooleanArray16[arg2]) {
			Static100.aClass2_Sub2_Sub3_Sub3_2.method1019(arg0, arg1);
		}
		Static154.aBooleanArray17[arg2] = true;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(B)V")
	public static void method1385() {
		aClass77_768 = null;
		aClass77_767 = null;
		aClass77_769 = null;
		aClass77_770 = null;
		anIntArray318 = null;
		anIntArray319 = null;
		aClass77_771 = null;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ILclient!oa;)Lclient!sg;")
	public static Class77 method1387(@OriginalArg(1) Class2_Sub18 arg0) {
		return Static122.method322(arg0);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIII)V")
	public static void method1388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static6.anInt181 == arg2 && Static82.anInt2149 == arg1 && (arg0 == Static24.anInt724 || !Static92.aBoolean101)) {
			return;
		}
		Static24.anInt724 = arg0;
		Static82.anInt2149 = arg1;
		if (!Static92.aBoolean101) {
			Static24.anInt724 = 0;
		}
		Static6.anInt181 = arg2;
		Static123.method2155(25);
		Static91.method1669(Static131.aClass77_1491, true);
		@Pc(42) int local42 = Static157.anInt3889;
		@Pc(44) int local44 = Static168.anInt4143;
		Static157.anInt3889 = (arg2 - 6) * 8;
		Static168.anInt4143 = arg1 * 8 - 48;
		@Pc(61) int local61 = Static157.anInt3889 - local42;
		@Pc(68) int local68 = Static168.anInt4143 - local44;
		for (@Pc(76) int local76 = 0; local76 < 32768; local76++) {
			@Pc(81) Class2_Sub2_Sub1_Sub6_Sub2 local81 = Static48.aClass2_Sub2_Sub1_Sub6_Sub2Array1[local76];
			if (local81 != null) {
				for (@Pc(85) int local85 = 0; local85 < 10; local85++) {
					local81.anIntArray622[local85] -= local61;
					local81.anIntArray620[local85] -= local68;
				}
				local81.anInt4400 -= local61 * 128;
				local81.anInt4385 -= local68 * 128;
			}
		}
		for (@Pc(130) int local130 = 0; local130 < 2048; local130++) {
			@Pc(135) Class2_Sub2_Sub1_Sub6_Sub1 local135 = Static58.aClass2_Sub2_Sub1_Sub6_Sub1Array1[local130];
			if (local135 != null) {
				for (@Pc(139) int local139 = 0; local139 < 10; local139++) {
					local135.anIntArray622[local139] -= local61;
					local135.anIntArray620[local139] -= local68;
				}
				local135.anInt4385 -= local68 * 128;
				local135.anInt4400 -= local61 * 128;
			}
		}
		@Pc(186) byte local186 = 104;
		Static54.anInt1472 = arg0;
		@Pc(190) byte local190 = 0;
		@Pc(192) byte local192 = 1;
		if (local61 < 0) {
			local192 = -1;
			local186 = -1;
			local190 = 103;
		}
		Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.method2913(arg3, false, arg4);
		@Pc(208) byte local208 = 0;
		@Pc(210) byte local210 = 104;
		@Pc(212) byte local212 = 1;
		if (local68 < 0) {
			local210 = -1;
			local212 = -1;
			local208 = 103;
		}
		for (@Pc(222) int local222 = local190; local222 != local186; local222 += local192) {
			for (@Pc(225) int local225 = local208; local225 != local210; local225 += local212) {
				@Pc(230) int local230 = local68 + local225;
				@Pc(234) int local234 = local61 + local222;
				for (@Pc(236) int local236 = 0; local236 < 4; local236++) {
					if (local234 >= 0 && local230 >= 0 && local234 < 104 && local230 < 104) {
						Static53.aClass10ArrayArrayArray1[local236][local222][local225] = Static53.aClass10ArrayArrayArray1[local236][local234][local230];
					} else {
						Static53.aClass10ArrayArrayArray1[local236][local222][local225] = null;
					}
				}
			}
		}
		for (@Pc(310) Class2_Sub16 local310 = (Class2_Sub16) Static51.aClass10_37.method444(); local310 != null; local310 = (Class2_Sub16) Static51.aClass10_37.method451()) {
			local310.anInt2376 -= local61;
			local310.anInt2386 -= local68;
			if (local310.anInt2376 < 0 || local310.anInt2386 < 0 || local310.anInt2376 >= 104 || local310.anInt2386 >= 104) {
				local310.method3004();
			}
		}
		Static16.aBoolean29 = false;
		Static14.anInt476 = -1;
		if (Static136.anInt3295 != 0) {
			Static85.anInt2206 -= local68;
			Static136.anInt3295 -= local61;
		}
		Static90.anInt2345 = 0;
		Static160.aClass10_120.method454();
		Static144.aClass10_93.method454();
	}
}
