import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!vb", name = "Z", descriptor = "Lclient!kh;")
	public static Class29 aClass29_69;

	@OriginalMember(owner = "client!vb", name = "X", descriptor = "I")
	public static int anInt3652 = 0;

	@OriginalMember(owner = "client!vb", name = "ab", descriptor = "Z")
	public static boolean aBoolean161 = false;

	@OriginalMember(owner = "client!vb", name = "cb", descriptor = "I")
	public static int anInt3655 = 0;

	@OriginalMember(owner = "client!vb", name = "eb", descriptor = "Lclient!sa;")
	public static Class72 aClass72_26 = new Class72(64);

	@OriginalMember(owner = "client!vb", name = "jb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1561 = Static51.method932("gr-Un:");

	@OriginalMember(owner = "client!vb", name = "kb", descriptor = "I")
	public static int anInt3660 = 0;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!cd;I)V")
	public static void method2585(@OriginalArg(0) Class10 arg0) {
		if (Static92.anInt2191 >= 2) {
			if (arg0.method343(Static22.aClass10_259)) {
				System.gc();
			}
			if (arg0.method343(Static151.aClass10_1424)) {
				Static106.method1721();
			}
			if (arg0.method343(Static26.aClass10_341)) {
				Static90.aBoolean88 = true;
			}
			if (arg0.method343(Static18.aClass10_220)) {
				Static90.aBoolean88 = false;
			}
			if (arg0.method343(Static111.aClass10_1096)) {
				for (@Pc(46) int local46 = 0; local46 < 4; local46++) {
					for (@Pc(50) int local50 = 1; local50 < 103; local50++) {
						for (@Pc(54) int local54 = 1; local54 < 103; local54++) {
							Static59.aClass27Array1[local46].anIntArrayArray16[local50][local54] = 0;
						}
					}
				}
			}
			if (arg0.method343(Static58.aClass10_645) && Static174.anInt3740 == 2) {
				throw new RuntimeException();
			}
			if (arg0.method341(Static40.aClass10_483)) {
				Static24.anInt566 = arg0.method333(12).method336().method332();
				Static96.method2627(null, 0, Static3.method36(new Class10[] { Static2.aClass10_28, Static164.method2485(Static24.anInt566) }));
			}
			if (arg0.method343(Static175.aClass10_1598)) {
				Static54.aBoolean55 = true;
			}
		}
		Static141.aClass2_Sub11_Sub1_3.method1495(104);
		Static141.aClass2_Sub11_Sub1_3.method1439(arg0.method340() - 1);
		Static141.aClass2_Sub11_Sub1_3.method1450(arg0.method333(2));
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(B)V")
	public static void method2586() {
		aClass10_1561 = null;
		aClass72_26 = null;
		aClass29_69 = null;
	}

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "(I)V")
	public static void method2587() {
		Static133.method2123(false);
		Static152.anInt3301 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static52.aByteArrayArray6.length; local14++) {
			if (Static120.anIntArray294[local14] != -1 && Static52.aByteArrayArray6[local14] == null) {
				Static52.aByteArrayArray6[local14] = Static76.aClass29_Sub1_27.method1030(0, Static120.anIntArray294[local14]);
				if (Static52.aByteArrayArray6[local14] == null) {
					Static152.anInt3301++;
					local12 = false;
				}
			}
			if (Static32.anIntArray64[local14] != -1 && Static15.aByteArrayArray3[local14] == null) {
				Static15.aByteArrayArray3[local14] = Static76.aClass29_Sub1_27.method1017(Static64.anIntArrayArray22[local14], Static32.anIntArray64[local14], 0);
				if (Static15.aByteArrayArray3[local14] == null) {
					local12 = false;
					Static152.anInt3301++;
				}
			}
		}
		if (!local12) {
			Static91.anInt2156 = 1;
			return;
		}
		local12 = true;
		Static156.anInt3342 = 0;
		@Pc(113) int local113;
		@Pc(123) int local123;
		for (@Pc(94) int local94 = 0; local94 < Static52.aByteArrayArray6.length; local94++) {
			@Pc(100) byte[] local100 = Static15.aByteArrayArray3[local94];
			if (local100 != null) {
				local113 = (Static106.anIntArray249[local94] >> 8) * 64 - Static137.anInt3049;
				local123 = (Static106.anIntArray249[local94] & 0xFF) * 64 - Static85.anInt1937;
				if (Static165.aBoolean158) {
					local113 = 10;
					local123 = 10;
				}
				local12 &= Static44.method846(local113, local100, local123);
			}
		}
		if (!local12) {
			Static91.anInt2156 = 2;
			return;
		}
		if (Static91.anInt2156 != 0) {
			Static170.method2617(true, Static3.method36(new Class10[] { Static20.aClass10_244, Static161.aClass10_1493 }));
		}
		Static155.method2390();
		Static22.method342();
		Static155.method2390();
		Static180.aClass60_1.method1821();
		Static155.method2390();
		System.gc();
		for (local113 = 0; local113 < 4; local113++) {
			Static59.aClass27Array1[local113].method943();
		}
		@Pc(204) int local204;
		@Pc(208) int local208;
		for (local123 = 0; local123 < 4; local123++) {
			for (local204 = 0; local204 < 104; local204++) {
				for (local208 = 0; local208 < 104; local208++) {
					Static50.aByteArrayArrayArray3[local123][local204][local208] = 0;
				}
			}
		}
		Static155.method2390();
		Static135.method2150();
		local204 = Static52.aByteArrayArray6.length;
		Static60.method1089();
		Static133.method2123(true);
		@Pc(259) int local259;
		@Pc(274) int local274;
		@Pc(374) int local374;
		@Pc(331) int local331;
		@Pc(384) int local384;
		if (!Static165.aBoolean158) {
			@Pc(263) byte[] local263;
			for (local208 = 0; local208 < local204; local208++) {
				local259 = (Static106.anIntArray249[local208] >> 8) * 64 - Static137.anInt3049;
				local263 = Static52.aByteArrayArray6[local208];
				local274 = (Static106.anIntArray249[local208] & 0xFF) * 64 - Static85.anInt1937;
				if (local263 != null) {
					Static155.method2390();
					Static44.method851(local263, Static55.anInt1413 * 8 - 48, Static77.anInt1800 * 8 + -48, local274, Static59.aClass27Array1, local259);
				}
			}
			for (local259 = 0; local259 < local204; local259++) {
				@Pc(310) byte[] local310 = Static52.aByteArrayArray6[local259];
				local274 = (Static106.anIntArray249[local259] >> 8) * 64 - Static137.anInt3049;
				local331 = (Static106.anIntArray249[local259] & 0xFF) * 64 - Static85.anInt1937;
				if (local310 == null && Static77.anInt1800 < 800) {
					Static155.method2390();
					Static88.method1028(local274, 64, local331, 64);
				}
			}
			Static133.method2123(true);
			for (local274 = 0; local274 < local204; local274++) {
				local263 = Static15.aByteArrayArray3[local274];
				if (local263 != null) {
					local374 = (Static106.anIntArray249[local274] & 0xFF) * 64 - Static85.anInt1937;
					local384 = (Static106.anIntArray249[local274] >> 8) * 64 - Static137.anInt3049;
					Static155.method2390();
					Static126.method2067(Static59.aClass27Array1, local374, local263, Static180.aClass60_1, local384);
				}
			}
		}
		@Pc(439) int local439;
		@Pc(445) int local445;
		if (Static165.aBoolean158) {
			@Pc(451) int local451;
			@Pc(461) int local461;
			@Pc(463) int local463;
			for (local208 = 0; local208 < 4; local208++) {
				Static155.method2390();
				for (local259 = 0; local259 < 13; local259++) {
					for (local274 = 0; local274 < 13; local274++) {
						local384 = Static91.anIntArrayArrayArray4[local208][local259][local274];
						@Pc(423) boolean local423 = false;
						if (local384 != -1) {
							local374 = local384 >> 24 & 0x3;
							local439 = local384 >> 1 & 0x3;
							local445 = local384 >> 14 & 0x3FF;
							local451 = local384 >> 3 & 0x7FF;
							local461 = local451 / 8 + (local445 / 8 << 8);
							for (local463 = 0; local463 < Static106.anIntArray249.length; local463++) {
								if (local461 == Static106.anIntArray249[local463] && Static52.aByteArrayArray6[local463] != null) {
									Static140.method2216(Static52.aByteArrayArray6[local463], local374, (local445 & 0x7) * 8, local259 * 8, Static59.aClass27Array1, local274 * 8, (local451 & 0x7) * 8, local439, local208);
									local423 = true;
									break;
								}
							}
						}
						if (!local423) {
							Static103.method1679(local274 * 8, local259 * 8, local208);
						}
					}
				}
			}
			for (local259 = 0; local259 < 13; local259++) {
				for (local274 = 0; local274 < 13; local274++) {
					local331 = Static91.anIntArrayArrayArray4[0][local259][local274];
					if (local331 == -1) {
						Static88.method1028(local259 * 8, 8, local274 * 8, 8);
					}
				}
			}
			Static133.method2123(true);
			for (local274 = 0; local274 < 4; local274++) {
				Static155.method2390();
				for (local331 = 0; local331 < 13; local331++) {
					for (local384 = 0; local384 < 13; local384++) {
						local374 = Static91.anIntArrayArrayArray4[local274][local331][local384];
						if (local374 != -1) {
							local451 = local374 >> 14 & 0x3FF;
							local439 = local374 >> 24 & 0x3;
							local445 = local374 >> 1 & 0x3;
							local461 = local374 >> 3 & 0x7FF;
							local463 = local461 / 8 + (local451 / 8 << 8);
							for (@Pc(647) int local647 = 0; local647 < Static106.anIntArray249.length; local647++) {
								if (local463 == Static106.anIntArray249[local647] && Static15.aByteArrayArray3[local647] != null) {
									Static102.method2539((local451 & 0x7) * 8, local331 * 8, local384 * 8, Static59.aClass27Array1, (local461 & 0x7) * 8, local439, Static180.aClass60_1, Static15.aByteArrayArray3[local647], local445, local274);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static133.method2123(true);
		Static22.method342();
		Static155.method2390();
		Static164.method2484(Static59.aClass27Array1, Static180.aClass60_1);
		Static133.method2123(true);
		local208 = Static20.anInt500;
		if (local208 > Static56.anInt1432) {
			local208 = Static56.anInt1432;
		}
		if (Static56.anInt1432 - 1 > local208) {
		}
		if (Static170.aBoolean163) {
			Static180.aClass60_1.method1822(Static20.anInt500);
		} else {
			Static180.aClass60_1.method1822(0);
		}
		for (local259 = 0; local259 < 104; local259++) {
			for (local274 = 0; local274 < 104; local274++) {
				Static149.method2286(local274, local259);
			}
		}
		Static155.method2390();
		Static174.method2661();
		Static24.aClass72_3.method2261();
		if (Static11.aFrame3 != null) {
			Static141.aClass2_Sub11_Sub1_3.method1495(180);
			Static141.aClass2_Sub11_Sub1_3.method1445(1057001181);
		}
		if (!Static165.aBoolean158) {
			local274 = (Static55.anInt1413 - 6) / 8;
			local331 = (Static55.anInt1413 + 6) / 8;
			local384 = (Static77.anInt1800 - 6) / 8;
			local374 = (Static77.anInt1800 + 6) / 8;
			for (local439 = local274 - 1; local439 <= local331 + 1; local439++) {
				for (local445 = local384 - 1; local445 <= local374 + 1; local445++) {
					if (local439 < local274 || local331 < local439 || local445 < local384 || local374 < local445) {
						Static76.aClass29_Sub1_27.method1021(Static3.method36(new Class10[] { Static52.aClass10_566, Static164.method2485(local439), Static130.aClass10_1250, Static164.method2485(local445) }));
						Static76.aClass29_Sub1_27.method1021(Static3.method36(new Class10[] { Static44.aClass10_502, Static164.method2485(local439), Static130.aClass10_1250, Static164.method2485(local445) }));
					}
				}
			}
		}
		Static45.method870(30);
		Static155.method2390();
		Static27.method595();
		Static141.aClass2_Sub11_Sub1_3.method1495(185);
		Static14.method226();
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILjava/awt/Component;II)Lclient!j;")
	public static Class40 method2588(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(11) Class local11 = Class.forName("Class40_Sub2");
			@Pc(15) Class40 local15 = (Class40) local11.getDeclaredConstructor().newInstance();
			local15.method2107(arg1, arg2, arg0);
			return local15;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class40_Sub1 local28 = new Class40_Sub1();
			local28.method2107(arg1, arg2, arg0);
			return local28;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IB)V")
	public static void method2589(@OriginalArg(0) int arg0) {
		@Pc(8) int[] local8 = Static128.aClass2_Sub1_Sub4_Sub2_34.anIntArray71;
		@Pc(11) int local11 = local8.length;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			local8[local13] = 0;
		}
		@Pc(37) int local37;
		@Pc(39) int local39;
		for (@Pc(25) int local25 = 1; local25 < 103; local25++) {
			local37 = (52736 - local25 * 512) * 4 + 24628;
			for (local39 = 1; local39 < 103; local39++) {
				if ((Static50.aByteArrayArrayArray3[arg0][local39][local25] & 0x18) == 0) {
					Static180.aClass60_1.method1780(local8, local37, arg0, local39, local25);
				}
				if (arg0 < 3 && (Static50.aByteArrayArrayArray3[arg0 + 1][local39][local25] & 0x8) != 0) {
					Static180.aClass60_1.method1780(local8, local37, arg0 + 1, local39, local25);
				}
				local37 += 4;
			}
		}
		Static128.aClass2_Sub1_Sub4_Sub2_34.method721();
		local37 = ((int) (Math.random() * 20.0D) + 228 << 8) + (238 - (10 - ((int) (Math.random() * 20.0D))) << 16) + (int) (Math.random() * 20.0D) + 238 - 10;
		local39 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		@Pc(151) int local151;
		for (@Pc(147) int local147 = 1; local147 < 103; local147++) {
			for (local151 = 1; local151 < 103; local151++) {
				if ((Static50.aByteArrayArrayArray3[arg0][local151][local147] & 0x18) == 0) {
					Static57.method1068(local147, arg0, local37, local151, local39);
				}
				if (arg0 < 3 && (Static50.aByteArrayArrayArray3[arg0 + 1][local151][local147] & 0x8) != 0) {
					Static57.method1068(local147, arg0 + 1, local37, local151, local39);
				}
			}
		}
		Static128.anInt2876 = 0;
		for (local151 = 0; local151 < 104; local151++) {
			for (@Pc(217) int local217 = 0; local217 < 104; local217++) {
				@Pc(225) int local225 = Static180.aClass60_1.method1784(Static56.anInt1432, local151, local217);
				if (local225 != 0) {
					local225 = local225 >> 14 & 0x7FFF;
					@Pc(241) int local241 = Static62.method1106(local225).anInt2218;
					if (local241 >= 0) {
						@Pc(248) int local248 = local151;
						@Pc(250) int local250 = local217;
						if (local241 != 22 && local241 != 29 && local241 != 34 && local241 != 36 && local241 != 46 && local241 != 47 && local241 != 48) {
							@Pc(286) int[][] local286 = Static59.aClass27Array1[Static56.anInt1432].anIntArrayArray16;
							for (@Pc(288) int local288 = 0; local288 < 10; local288++) {
								@Pc(295) int local295 = (int) (Math.random() * 4.0D);
								if (local295 == 0 && local248 > 0 && local248 > local151 - 3 && (local286[local248 - 1][local250] & 0x12C0108) == 0) {
									local248--;
								}
								if (local295 == 1 && local248 < 103 && local151 + 3 > local248 && (local286[local248 + 1][local250] & 0x12C0180) == 0) {
									local248++;
								}
								if (local295 == 2 && local250 > 0 && local217 - 3 < local250 && (local286[local248][local250 - 1] & 0x12C0102) == 0) {
									local250--;
								}
								if (local295 == 3 && local250 < 103 && local250 < local217 + 3 && (local286[local248][local250 + 1] & 0x12C0120) == 0) {
									local250++;
								}
							}
						}
						Static85.aClass2_Sub1_Sub4_Sub2Array6[Static128.anInt2876] = Static21.aClass2_Sub1_Sub4_Sub2Array2[local241];
						Static58.anIntArray167[Static128.anInt2876] = local248;
						Static156.anIntArray358[Static128.anInt2876] = local250;
						Static128.anInt2876++;
					}
				}
			}
		}
		Static133.aClass40_1.method2103();
	}
}
