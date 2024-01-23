import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
	public static int anInt4563;

	@OriginalMember(owner = "client!uf", name = "q", descriptor = "Lclient!jb;")
	public static Class28 aClass28_73;

	@OriginalMember(owner = "client!uf", name = "w", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!uf", name = "j", descriptor = "Lclient!vb;")
	public static Class120 aClass120_21 = new Class120();

	@OriginalMember(owner = "client!uf", name = "m", descriptor = "[I")
	public static int[] anIntArray368 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
	public static int anInt4564 = 0;

	@OriginalMember(owner = "client!uf", name = "u", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1239 = Static231.method3737("; Expires=");

	@OriginalMember(owner = "client!uf", name = "v", descriptor = "Lclient!ak;")
	public static Class8 aClass8_9 = new Class8(128);

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!vf;I)V")
	public static void method3404(@OriginalArg(0) Class1_Sub26 arg0) {
		if (Static151.aClass13_4 != null) {
			try {
				Static151.aClass13_4.method357(0L);
				Static151.aClass13_4.method349(24, arg0.aByteArray52, arg0.anInt4021);
			} catch (@Pc(19) Exception local19) {
			}
		}
		arg0.anInt4021 += 24;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILclient!sc;)Lclient!sc;")
	public static Class107 method3405(@OriginalArg(1) Class107 arg0) {
		@Pc(3) int local3 = Static21.method393(arg0);
		return local3 == -1 ? Static107.aClass107_633 : Static83.aClass119_2.aClass107Array29[local3];
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIZII)V")
	public static void method3406(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static157.anInt3451++;
		if (!arg2) {
			Static63.method1195(true);
			Static117.method2012(true);
			Static63.method1195(false);
		}
		Static117.method2012(false);
		if (!arg2) {
			Static116.method2010();
		}
		Static215.method3498();
		@Pc(38) int local38;
		@Pc(44) int local44;
		if (Static61.anInt1480 == 1) {
			local38 = Static88.anInt1924;
			local44 = Static143.anInt3135 + Static79.anInt1741 & 0x7FF;
			if (local38 < Static42.anInt940 / 256) {
				local38 = Static42.anInt940 / 256;
			}
			if (Static23.aBooleanArray2[4] && Static174.anIntArray332[4] + 128 > local38) {
				local38 = Static174.anIntArray332[4] + 128;
			}
			Static153.method2508(local38, Static77.anInt1730, arg1, Static130.method2174(Static191.anInt4237, Static204.aClass5_Sub5_Sub1_2.anInt3044, Static204.aClass5_Sub5_Sub1_2.anInt3021) - 50, Static21.anInt411, local38 * 3 + 600, local44);
		}
		local38 = Static22.anInt435;
		@Pc(103) int local103 = Static29.anInt577;
		local44 = Static69.anInt1578;
		@Pc(107) int local107 = Static6.anInt2981;
		@Pc(109) int local109 = Static122.anInt2671;
		@Pc(152) int local152;
		for (@Pc(111) int local111 = 0; local111 < 5; local111++) {
			if (Static23.aBooleanArray2[local111]) {
				local152 = (int) (Math.random() * (double) (Static14.anIntArray36[local111] * 2 + 1) - (double) Static14.anIntArray36[local111] + Math.sin((double) Static100.anIntArray217[local111] / 100.0D * (double) Static86.anIntArray197[local111]) * (double) Static174.anIntArray332[local111]);
				if (local111 == 4) {
					Static6.anInt2981 += local152;
					if (Static6.anInt2981 < 128) {
						Static6.anInt2981 = 128;
					}
					if (Static6.anInt2981 > 383) {
						Static6.anInt2981 = 383;
					}
				}
				if (local111 == 2) {
					Static29.anInt577 += local152;
				}
				if (local111 == 1) {
					Static69.anInt1578 += local152;
				}
				if (local111 == 0) {
					Static22.anInt435 += local152;
				}
				if (local111 == 3) {
					Static122.anInt2671 = Static122.anInt2671 + local152 & 0x7FF;
				}
			}
		}
		Static60.method1158();
		Static205.method3251(arg0, arg3, arg4 + arg0, arg3 - -arg1);
		Static74.method1327();
		local152 = Static32.anInt604;
		@Pc(230) int local230 = Static11.anInt298;
		if (arg0 <= local152 && arg0 + arg4 > local152 && local230 >= arg3 && local230 < arg3 + arg1) {
			Static19.anInt394 = 0;
			@Pc(255) int local255 = Static146.anInt3164;
			Static140.aBoolean62 = true;
			@Pc(259) int local259 = Static232.anInt4367;
			Static208.anInt4453 = (local152 - arg0) * (local259 - local255) / arg4 + local255;
			@Pc(274) int local274 = Static177.anInt3841;
			@Pc(276) int local276 = Static75.anInt1690;
			Static1.anInt69 = local274 + (local276 - local274) * (local230 - arg3) / arg1;
		} else {
			Static19.anInt394 = 0;
			Static140.aBoolean62 = false;
		}
		Static30.method587();
		@Pc(309) byte local309 = Static25.method453() == 2 ? (byte) Static157.anInt3451 : 1;
		Static205.method3250(arg0, arg3, arg4, arg1, 0);
		Static130.method2169(Static22.anInt435, Static69.anInt1578, Static29.anInt577, Static6.anInt2981, Static122.anInt2671, Static186.aByteArrayArrayArray11, Static165.anIntArray226, Static158.anIntArray304, Static230.anIntArray381, Static191.anIntArray348, Static96.anIntArray211, Static191.anInt4237 + 1, local309, Static204.aClass5_Sub5_Sub1_2.anInt3021 >> 7, Static204.aClass5_Sub5_Sub1_2.anInt3044 >> 7);
		Static30.method587();
		Static64.method1206();
		Static155.method413(arg4, arg3, arg1, arg0);
		Static101.method1690(arg3, arg0, arg1, arg4);
		((Class59) Static74.anInterface4_1).method1644(Static204.anInt2498);
		Static76.method1343(arg1, arg3, arg0, arg4);
		Static6.anInt2981 = local107;
		Static29.anInt577 = local103;
		Static22.anInt435 = local38;
		Static122.anInt2671 = local109;
		Static69.anInt1578 = local44;
		if (Static200.aBoolean310 && Static207.method3290() == 0) {
			Static200.aBoolean310 = false;
		}
		if (Static200.aBoolean310) {
			Static205.method3250(arg0, arg3, arg4, arg1, 0);
			Static172.method2741(false, Static26.aClass107_179);
		}
		if (!arg2 && !Static200.aBoolean310 && !Static40.aBoolean81 && arg0 <= Static32.anInt604 && Static32.anInt604 < arg4 + arg0 && arg3 <= Static11.anInt298 && Static11.anInt298 < arg3 + arg1) {
			Static6.method2303(arg1, arg3, Static32.anInt604, Static11.anInt298, arg0, arg4);
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!pe;Lclient!o;IIIZILclient!pe;)V")
	public static void method3408(@OriginalArg(0) Class1_Sub2_Sub15 arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class1_Sub2_Sub15 arg6) {
		Static30.anInt583 = arg4;
		Static213.anInt4596 = arg5;
		Static141.anInt3120 = arg3;
		Static5.anInt224 = arg2;
		Static160.aClass86_12 = arg1;
		if (Static71.aClass65_1 != null) {
			return;
		}
		Static196.aBoolean380 = true;
		if (Static221.aClass1_Sub2_Sub2Array11 == null) {
			Static221.aClass1_Sub2_Sub2Array11 = Static80.method1380(Static218.anInt4762, Static169.aClass28_Sub1_97);
		}
		if (Static186.aClass64Array7 == null) {
			Static186.aClass64Array7 = Static48.method937(Static47.anInt1068, Static169.aClass28_Sub1_97);
		}
		if (Static168.aClass64Array6 == null) {
			Static168.aClass64Array6 = Static48.method937(Static77.anInt1731, Static169.aClass28_Sub1_97);
		}
		if (Static120.aClass64Array3 == null) {
			Static120.aClass64Array3 = Static48.method937(Static90.anInt1965, Static169.aClass28_Sub1_97);
		}
		@Pc(56) int local56 = Static141.anInt3120 / 5;
		@Pc(62) int local62 = Static141.anInt3120 / 5 * 4;
		Static205.method3258(Static30.anInt583, Static5.anInt224, Static141.anInt3120, Static213.anInt4596, 0, 168);
		Static205.method3240(Static30.anInt583, Static5.anInt224, local56, 23, 12425273, 9135624);
		Static205.method3240(local56 + Static30.anInt583, Static5.anInt224, local62, 23, 5197647, 2697513);
		arg0.method3327(Static221.aClass107_1306, Static30.anInt583 + local56 / 2, Static5.anInt224 + 15, 0, -1);
		if (Static120.aClass64Array3 != null) {
			Static120.aClass64Array3[1].method1870(Static30.anInt583 + local56 + 2, Static5.anInt224 + 1);
			arg6.method3331(Static3.aClass107_1061, Static30.anInt583 + local56 + 12, Static5.anInt224 + 10, 16777215, -1);
			Static120.aClass64Array3[0].method1870(Static30.anInt583 + local56 + 2, Static5.anInt224 + 12);
			arg6.method3331(Static225.aClass107_1324, Static30.anInt583 + local56 + 12, Static5.anInt224 + 21, 16777215, -1);
		}
		@Pc(323) int local323;
		@Pc(405) int local405;
		if (Static168.aClass64Array6 != null) {
			@Pc(160) int local160 = local56 + Static30.anInt583 + 140;
			if (Static44.anIntArray101[0] == 0 && Static40.anIntArray85[0] == 0) {
				Static168.aClass64Array6[2].method1870(local160, Static5.anInt224 + 4);
			} else {
				Static168.aClass64Array6[0].method1870(local160, Static5.anInt224 + 4);
			}
			if (Static44.anIntArray101[0] == 0 && Static40.anIntArray85[0] == 1) {
				Static168.aClass64Array6[3].method1870(local160 + 15, Static5.anInt224 + 4);
			} else {
				Static168.aClass64Array6[1].method1870(local160 + 15, Static5.anInt224 + 4);
			}
			arg0.method3331(Static197.aClass107_1129, local160 + 32, Static5.anInt224 + 17, 16777215, -1);
			@Pc(243) int local243 = Static30.anInt583 + local56 + 250;
			if (Static44.anIntArray101[0] == 1 && Static40.anIntArray85[0] == 0) {
				Static168.aClass64Array6[2].method1870(local243, Static5.anInt224 + 4);
			} else {
				Static168.aClass64Array6[0].method1870(local243, Static5.anInt224 + 4);
			}
			if (Static44.anIntArray101[0] == 1 && Static40.anIntArray85[0] == 1) {
				Static168.aClass64Array6[3].method1870(local243 + 15, Static5.anInt224 + 4);
			} else {
				Static168.aClass64Array6[1].method1870(local243 + 15, Static5.anInt224 + 4);
			}
			arg0.method3331(Static82.aClass107_518, local243 + 32, Static5.anInt224 - -17, 16777215, -1);
			local323 = Static30.anInt583 + local56 + 360;
			if (Static44.anIntArray101[0] == 2 && Static40.anIntArray85[0] == 0) {
				Static168.aClass64Array6[2].method1870(local323, Static5.anInt224 + 4);
			} else {
				Static168.aClass64Array6[0].method1870(local323, Static5.anInt224 + 4);
			}
			if (Static44.anIntArray101[0] == 2 && Static40.anIntArray85[0] == 1) {
				Static168.aClass64Array6[3].method1870(local323 + 15, Static5.anInt224 - -4);
			} else {
				Static168.aClass64Array6[1].method1870(local323 + 15, Static5.anInt224 - -4);
			}
			arg0.method3331(Static175.aClass107_1037, local323 + 32, Static5.anInt224 + 17, 16777215, -1);
			local405 = Static30.anInt583 + local56 + 470;
			if (Static44.anIntArray101[0] == 3 && Static40.anIntArray85[0] == 0) {
				Static168.aClass64Array6[2].method1870(local405, Static5.anInt224 + 4);
			} else {
				Static168.aClass64Array6[0].method1870(local405, Static5.anInt224 + 4);
			}
			if (Static44.anIntArray101[0] == 3 && Static40.anIntArray85[0] == 1) {
				Static168.aClass64Array6[3].method1870(local405 + 15, Static5.anInt224 + 4);
			} else {
				Static168.aClass64Array6[1].method1870(local405 + 15, Static5.anInt224 - -4);
			}
			arg0.method3331(Static194.aClass107_1121, local405 + 32, Static5.anInt224 - -17, 16777215, -1);
		}
		Static205.method3250(Static141.anInt3120 - 58 - 10, Static5.anInt224 + 4, 58, 16, 0);
		Static61.anInt1490 = -1;
		if (Static221.aClass1_Sub2_Sub2Array11 == null) {
			return;
		}
		local323 = Static141.anInt3120 / 89;
		local405 = (Static213.anInt4596 - 23) / 20;
		@Pc(526) int local526;
		@Pc(516) int local516;
		do {
			local516 = local323;
			if (local405 * (local323 - 1) >= Static179.anInt3927) {
				local323--;
			}
			local526 = local405;
			if (local323 * (local405 - 1) >= Static179.anInt3927) {
				local405--;
			}
			if (Static179.anInt3927 <= local323 * (local405 - 1)) {
				local405--;
			}
		} while (local405 != local526 || local323 != local516);
		local526 = (Static141.anInt3120 - local323 * 88) / (local323 - -1);
		if (local526 > 5) {
			local526 = 5;
		}
		@Pc(594) int local594 = (Static141.anInt3120 - local526 * (local323 - 1) - local323 * 88) / 2;
		@Pc(596) int local596 = local594;
		@Pc(598) int local598 = 0;
		local516 = (Static213.anInt4596 - local405 * 19 - 23) / (local405 - -1);
		if (local516 > 5) {
			local516 = 5;
		}
		@Pc(634) int local634 = (Static213.anInt4596 - local405 * 19 - (local405 - 1) * local516 - 23) / 2;
		@Pc(638) int local638 = local634 + 23;
		for (@Pc(640) int local640 = 0; local640 < Static179.anInt3927; local640++) {
			@Pc(646) Class54 local646 = Static8.aClass54Array1[local640];
			@Pc(651) Class107 local651 = Static115.method2001(local646.anInt1911);
			@Pc(653) boolean local653 = true;
			if (local646.anInt1911 == -1) {
				local653 = false;
				local651 = Static59.aClass107_401;
			} else if (local646.anInt1911 > 1980) {
				local653 = false;
				local651 = Static180.aClass107_1345;
			}
			if (Static220.anInt4822 >= local596 && Static181.anInt4311 >= local638 && Static220.anInt4822 < local596 + 88 && local638 + 19 > Static181.anInt4311 && local653) {
				Static61.anInt1490 = local640;
				Static221.aClass1_Sub2_Sub2Array11[local646.aBoolean173 ? 1 : 0].method190(Static30.anInt583 + local596, Static5.anInt224 + local638);
			} else {
				Static221.aClass1_Sub2_Sub2Array11[local646.aBoolean173 ? 1 : 0].method189(local596 + Static30.anInt583, Static5.anInt224 + local638);
			}
			if (Static186.aClass64Array7 != null) {
				Static186.aClass64Array7[(local646.aBoolean173 ? Static186.aClass64Array7.length / 2 : 0) + local646.anInt1912].method1870(Static30.anInt583 + local596 + 29, Static5.anInt224 + local638);
			}
			arg0.method3327(Static115.method2001(local646.anInt1917), local596 + Static30.anInt583 + 15, Static5.anInt224 + 9 - (-local638 + -5), 0, -1);
			arg6.method3327(local651, Static30.anInt583 + local596 + 60, Static5.anInt224 + 5 - (-local638 - 9), 268435455, -1);
			local638 += local516 + 19;
			local598++;
			if (local598 >= local405) {
				local638 = local634 + 23;
				local596 += local526 + 88;
				local598 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V")
	public static void method3409() {
		for (@Pc(11) int local11 = 0; local11 < Static189.anInt4168; local11++) {
			@Pc(17) int local17 = Static37.anIntArray82[local11];
			@Pc(21) Class5_Sub5_Sub2 local21 = Static33.aClass5_Sub5_Sub2Array1[local17];
			if (local21 != null) {
				Static179.method2850(local21, local21.aClass30_1.anInt961);
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
	public static void method3410() {
		@Pc(7) boolean local7 = true;
		Static140.method666(false);
		Static58.anInt1425 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static85.aByteArrayArray3.length; local14++) {
			if (Static35.anIntArray79[local14] != -1 && Static85.aByteArrayArray3[local14] == null) {
				Static85.aByteArrayArray3[local14] = Static42.aClass28_Sub1_24.method819(0, Static35.anIntArray79[local14]);
				if (Static85.aByteArrayArray3[local14] == null) {
					Static58.anInt1425++;
					local7 = false;
				}
			}
			if (Static33.anIntArray76[local14] != -1 && Static172.aByteArrayArray9[local14] == null) {
				Static172.aByteArrayArray9[local14] = Static42.aClass28_Sub1_24.method820(Static1.anIntArrayArray1[local14], 0, Static33.anIntArray76[local14]);
				if (Static172.aByteArrayArray9[local14] == null) {
					local7 = false;
					Static58.anInt1425++;
				}
			}
			if (Static122.anIntArray237 != null && Static156.aByteArrayArray6[local14] == null && Static122.anIntArray237[local14] != -1) {
				Static156.aByteArrayArray6[local14] = Static42.aClass28_Sub1_24.method820(Static1.anIntArrayArray1[local14], 0, Static122.anIntArray237[local14]);
				if (Static156.aByteArrayArray6[local14] == null) {
					local7 = false;
					Static58.anInt1425++;
				}
			}
		}
		if (Static97.aClass1_Sub2_Sub6_16 == null || !Static217.aClass28_Sub1_126.method847(Static149.method2437(new Class107[] { Static97.aClass1_Sub2_Sub6_16.aClass107_252, Static213.aClass107_1247 }))) {
			Static59.aClass119_1 = null;
		} else if (Static217.aClass28_Sub1_126.method817(Static149.method2437(new Class107[] { Static97.aClass1_Sub2_Sub6_16.aClass107_252, Static213.aClass107_1247 }))) {
			Static59.aClass119_1 = Static219.method3599(Static217.aClass28_Sub1_126, Static149.method2437(new Class107[] { Static97.aClass1_Sub2_Sub6_16.aClass107_252, Static213.aClass107_1247 }));
		} else {
			local7 = false;
			Static58.anInt1425++;
		}
		if (!local7) {
			Static151.anInt3334 = 1;
			return;
		}
		Static65.anInt1532 = 0;
		local7 = true;
		@Pc(214) int local214;
		@Pc(224) int local224;
		for (@Pc(195) int local195 = 0; local195 < Static85.aByteArrayArray3.length; local195++) {
			@Pc(201) byte[] local201 = Static172.aByteArrayArray9[local195];
			if (local201 != null) {
				local214 = (Static182.anIntArray343[local195] >> 8) * 64 - Static36.anInt764;
				local224 = (Static182.anIntArray343[local195] & 0xFF) * 64 - Static152.anInt3377;
				if (Static181.aBoolean381) {
					local214 = 10;
					local224 = 10;
				}
				local7 &= Static8.method253(local224, local214, local201);
			}
		}
		if (!local7) {
			Static151.anInt3334 = 2;
			return;
		}
		if (Static151.anInt3334 != 0) {
			Static172.method2741(true, Static149.method2437(new Class107[] { Static26.aClass107_179, Static174.aClass107_1030 }));
		}
		Static30.method587();
		Static62.method1192();
		Static201.method3227();
		for (@Pc(279) int local279 = 0; local279 < 4; local279++) {
			Static107.aClass60Array1[local279].method1686();
		}
		@Pc(304) int local304;
		for (local214 = 0; local214 < 4; local214++) {
			for (local224 = 0; local224 < 104; local224++) {
				for (local304 = 0; local304 < 104; local304++) {
					Static221.aByteArrayArrayArray14[local214][local224][local304] = 0;
				}
			}
		}
		Static29.method583(false);
		Static30.method587();
		System.gc();
		Static140.method666(true);
		Static193.method3153();
		if (!Static181.aBoolean381) {
			Static66.method1215();
			Static140.method666(true);
			Static81.method1383();
			if (Static156.aByteArrayArray6 != null) {
				Static66.method1219();
			}
		}
		if (Static181.aBoolean381) {
			Static115.method2000();
			Static140.method666(true);
			Static36.method705();
		}
		Static62.method1192();
		Static140.method666(true);
		Static19.method379(Static107.aClass60Array1);
		Static140.method666(true);
		local224 = Static203.anInt207;
		if (Static191.anInt4237 < local224) {
			local224 = Static191.anInt4237;
		}
		if (local224 < Static191.anInt4237 - 1) {
		}
		if (Static155.method412()) {
			Static127.method2119(0);
		} else {
			Static127.method2119(Static203.anInt207);
		}
		Static111.method1944();
		@Pc(425) int local425;
		for (local304 = 0; local304 < 104; local304++) {
			for (local425 = 0; local425 < 104; local425++) {
				Static182.method3009(local304, local425);
			}
		}
		Static182.method2999();
		Static30.method587();
		Static185.method3681();
		Static62.method1192();
		if (Static125.aFrame2 != null && Static167.aClass82_3 != null && Static178.anInt3884 == 25) {
			Static193.aClass1_Sub26_Sub1_2.method3000(180);
			Static193.aClass1_Sub26_Sub1_2.method2973(1057001181);
		}
		if (!Static181.aBoolean381) {
			local425 = (Static123.anInt2686 - 6) / 8;
			@Pc(482) int local482 = (Static123.anInt2686 + 6) / 8;
			@Pc(488) int local488 = (Static220.anInt4826 + 6) / 8;
			@Pc(494) int local494 = (Static220.anInt4826 - 6) / 8;
			for (@Pc(498) int local498 = local425 - 1; local498 <= local482 + 1; local498++) {
				for (@Pc(504) int local504 = local494 - 1; local504 <= local488 + 1; local504++) {
					if (local498 < local425 || local482 < local498 || local494 > local504 || local504 > local488) {
						Static42.aClass28_Sub1_24.method833(Static149.method2437(new Class107[] { Static34.aClass107_236, Static115.method2001(local498), Static224.aClass107_1321, Static115.method2001(local504) }));
						Static42.aClass28_Sub1_24.method833(Static149.method2437(new Class107[] { Static211.aClass107_1238, Static115.method2001(local498), Static224.aClass107_1321, Static115.method2001(local504) }));
					}
				}
			}
		}
		if (Static178.anInt3884 == 28) {
			Static52.method1046(10);
		} else {
			Static52.method1046(30);
			if (Static167.aClass82_3 != null) {
				Static193.aClass1_Sub26_Sub1_2.method3000(157);
			}
		}
		Static30.method587();
		Static29.method582();
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)Lclient!lc;")
	public static Class1_Sub2_Sub11 method3413(@OriginalArg(0) int arg0) {
		@Pc(17) Class1_Sub2_Sub11 local17 = (Class1_Sub2_Sub11) aClass8_9.method312((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(27) byte[] local27 = Static65.aClass28_Sub1_38.method819(0, arg0);
		if (local27 == null) {
			return null;
		}
		local17 = new Class1_Sub2_Sub11();
		@Pc(40) Class1_Sub26 local40 = new Class1_Sub26(local27);
		local40.anInt4021 = local40.aByteArray52.length - 2;
		@Pc(51) int local51 = local40.method2964();
		@Pc(59) int local59 = local40.aByteArray52.length - local51 - 14;
		local40.anInt4021 = local59;
		@Pc(66) int local66 = local40.method2958();
		local17.anInt2651 = local40.method2964();
		local17.anInt2649 = local40.method2964();
		local17.anInt2647 = local40.method2964();
		local17.anInt2652 = local40.method2964();
		@Pc(92) int local92 = local40.method2945();
		@Pc(100) int local100;
		@Pc(106) int local106;
		if (local92 > 0) {
			local17.aClass50Array1 = new Class50[local92];
			for (local100 = 0; local100 < local92; local100++) {
				local106 = local40.method2964();
				@Pc(113) Class50 local113 = new Class50(Static156.method2529(local106));
				local17.aClass50Array1[local100] = local113;
				while (local106-- > 0) {
					@Pc(124) int local124 = local40.method2958();
					@Pc(128) int local128 = local40.method2958();
					local113.method1362((long) local124, new Class1_Sub5(local128));
				}
			}
		}
		local40.anInt4021 = 0;
		local100 = 0;
		local17.aClass107_716 = local40.method2975();
		local17.anIntArray236 = new int[local66];
		local17.aClass107Array12 = new Class107[local66];
		local17.anIntArray235 = new int[local66];
		while (local59 > local40.anInt4021) {
			local106 = local40.method2964();
			if (local106 == 3) {
				local17.aClass107Array12[local100] = local40.method2978();
			} else if (local106 >= 100 || local106 == 21 || local106 == 38 || local106 == 39) {
				local17.anIntArray236[local100] = local40.method2945();
			} else {
				local17.anIntArray236[local100] = local40.method2958();
			}
			local17.anIntArray235[local100++] = local106;
		}
		aClass8_9.method304(local17, (long) arg0);
		return local17;
	}
}
