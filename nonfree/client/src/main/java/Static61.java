import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!gh", name = "l", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!gh", name = "p", descriptor = "Lclient!ae;")
	public static Class1_Sub2_Sub1_Sub1_Sub1 aClass1_Sub2_Sub1_Sub1_Sub1_4;

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "Lclient!ld;")
	public static Class47 aClass47_14 = new Class47(64);

	@OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
	public static int anInt1892 = -1;

	@OriginalMember(owner = "client!gh", name = "m", descriptor = "Lclient!dd;")
	public static Class13 aClass13_640 = Static161.method2971("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!gh", name = "o", descriptor = "[[B")
	public static byte[][] aByteArrayArray4 = new byte[1000][];

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IB)Lclient!f;")
	public static Class1_Sub2_Sub7 method1406(@OriginalArg(0) int arg0) {
		@Pc(15) Class1_Sub2_Sub7 local15 = (Class1_Sub2_Sub7) Static29.aClass47_7.method1999((long) arg0);
		if (local15 != null) {
			return local15;
		}
		local15 = Static118.method2228(Static122.aClass4_76, arg0, Static82.aClass4_54);
		if (local15 != null) {
			Static29.aClass47_7.method1998(local15, (long) arg0);
		}
		return local15;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(BILclient!fd;)I")
	public static int method1407(@OriginalArg(1) int arg0, @OriginalArg(2) Class20 arg1) {
		if (arg1.anIntArrayArray9 == null || arg0 >= arg1.anIntArrayArray9.length) {
			return -2;
		}
		try {
			@Pc(29) int[] local29 = arg1.anIntArrayArray9[arg0];
			@Pc(31) int local31 = 0;
			@Pc(33) int local33 = 0;
			@Pc(35) byte local35 = 0;
			while (true) {
				@Pc(37) int local37 = 0;
				@Pc(39) byte local39 = 0;
				@Pc(44) int local44 = local29[local33++];
				if (local44 == 0) {
					return local31;
				}
				if (local44 == 1) {
					local37 = Static141.anIntArray337[local29[local33++]];
				}
				if (local44 == 15) {
					local39 = 1;
				}
				if (local44 == 16) {
					local39 = 2;
				}
				if (local44 == 17) {
					local39 = 3;
				}
				if (local44 == 2) {
					local37 = Static117.anIntArray299[local29[local33++]];
				}
				if (local44 == 3) {
					local37 = Static153.anIntArray365[local29[local33++]];
				}
				@Pc(111) int local111;
				@Pc(124) Class20 local124;
				@Pc(129) int local129;
				@Pc(142) int local142;
				if (local44 == 4) {
					local111 = local29[local33++] << 16;
					@Pc(118) int local118 = local111 + local29[local33++];
					local124 = Static119.method2230(local118);
					local129 = local29[local33++];
					if (local129 != -1 && (!Static184.method2994(local129).aBoolean88 || Static18.aBoolean52)) {
						for (local142 = 0; local142 < local124.anIntArray168.length; local142++) {
							if (local129 + 1 == local124.anIntArray168[local142]) {
								local37 += local124.anIntArray163[local142];
							}
						}
					}
				}
				if (local44 == 5) {
					local37 = Static103.anIntArray266[local29[local33++]];
				}
				if (local44 == 6) {
					local37 = Class79.anIntArray381[Static117.anIntArray299[local29[local33++]] - 1];
				}
				if (local44 == 7) {
					local37 = Static103.anIntArray266[local29[local33++]] * 100 / 46875;
				}
				if (local44 == 8) {
					local37 = Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2615;
				}
				if (local44 == 9) {
					for (local111 = 0; local111 < 25; local111++) {
						if (Static64.aBooleanArray26[local111]) {
							local37 += Static117.anIntArray299[local111];
						}
					}
				}
				if (local44 == 10) {
					local111 = local29[local33++] << 16;
					local111 += local29[local33++];
					local124 = Static119.method2230(local111);
					local129 = local29[local33++];
					if (local129 != -1 && (!Static184.method2994(local129).aBoolean88 || Static18.aBoolean52)) {
						for (local142 = 0; local142 < local124.anIntArray168.length; local142++) {
							if (local129 + 1 == local124.anIntArray168[local142]) {
								local37 = 999999999;
								break;
							}
						}
					}
				}
				if (local44 == 11) {
					local37 = Static103.anInt2871;
				}
				if (local44 == 12) {
					local37 = Static20.anInt773;
				}
				if (local44 == 13) {
					local111 = Static103.anIntArray266[local29[local33++]];
					@Pc(335) int local335 = local29[local33++];
					local37 = (local111 & 0x1 << local335) == 0 ? 0 : 1;
				}
				if (local44 == 14) {
					local111 = local29[local33++];
					local37 = Static108.method2112(local111);
				}
				if (local44 == 18) {
					local37 = Static153.anInt3629 + (Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2596 >> 7);
				}
				if (local44 == 19) {
					local37 = Static60.anInt1864 + (Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2606 >> 7);
				}
				if (local44 == 20) {
					local37 = local29[local33++];
				}
				if (local39 == 0) {
					if (local35 == 0) {
						local31 += local37;
					}
					if (local35 == 1) {
						local31 -= local37;
					}
					if (local35 == 2 && local37 != 0) {
						local31 /= local37;
					}
					if (local35 == 3) {
						local31 *= local37;
					}
					local35 = 0;
				} else {
					local35 = local39;
				}
			}
		} catch (@Pc(433) Exception local433) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
	public static void method1408() {
		aClass1_Sub2_Sub1_Sub1_Sub1_4 = null;
		aFontMetrics1 = null;
		aClass47_14 = null;
		aByteArrayArray4 = null;
		aClass13_640 = null;
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V")
	public static void method1409() {
		Static137.method2454(false);
		Static27.anInt979 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static117.aByteArrayArray9.length; local14++) {
			if (Static98.anIntArray391[local14] != -1 && Static117.aByteArrayArray9[local14] == null) {
				Static117.aByteArrayArray9[local14] = Static42.aClass4_Sub1_21.method2243(Static98.anIntArray391[local14], 0);
				if (Static117.aByteArrayArray9[local14] == null) {
					local12 = false;
					Static27.anInt979++;
				}
			}
			if (Static66.anIntArray201[local14] != -1 && Static106.aByteArrayArray8[local14] == null) {
				Static106.aByteArrayArray8[local14] = Static42.aClass4_Sub1_21.method2251(Static121.anIntArrayArray25[local14], Static66.anIntArray201[local14], 0);
				if (Static106.aByteArrayArray8[local14] == null) {
					local12 = false;
					Static27.anInt979++;
				}
			}
		}
		if (!local12) {
			Static102.anInt2853 = 1;
			return;
		}
		local12 = true;
		Static22.anInt2237 = 0;
		@Pc(113) int local113;
		@Pc(124) int local124;
		for (@Pc(94) int local94 = 0; local94 < Static117.aByteArrayArray9.length; local94++) {
			@Pc(100) byte[] local100 = Static106.aByteArrayArray8[local94];
			if (local100 != null) {
				local113 = (Static149.anIntArray352[local94] >> 8) * 64 - Static153.anInt3629;
				local124 = (Static149.anIntArray352[local94] & 0xFF) * 64 - Static60.anInt1864;
				if (Static90.aBoolean192) {
					local113 = 10;
					local124 = 10;
				}
				local12 &= Static124.method2290(local113, local100, local124);
			}
		}
		if (!local12) {
			Static102.anInt2853 = 2;
			return;
		}
		if (Static102.anInt2853 != 0) {
			Static144.method2550(Static57.method1349(new Class13[] { Static153.aClass13_1250, Static134.aClass13_1135 }), true);
		}
		Static131.method2376();
		Static37.method991();
		Static131.method2376();
		Static168.method2879();
		Static131.method2376();
		System.gc();
		for (@Pc(184) int local184 = 0; local184 < 4; local184++) {
			Static149.aClass12Array1[local184].method819();
		}
		@Pc(207) int local207;
		for (local113 = 0; local113 < 4; local113++) {
			for (local124 = 0; local124 < 104; local124++) {
				for (local207 = 0; local207 < 104; local207++) {
					Static35.aByteArrayArrayArray20[local113][local124][local207] = 0;
				}
			}
		}
		Static131.method2376();
		Static159.method2737();
		local124 = Static117.aByteArrayArray9.length;
		Static14.method538();
		Static137.method2454(true);
		@Pc(274) int local274;
		@Pc(263) int local263;
		@Pc(385) int local385;
		@Pc(324) int local324;
		@Pc(374) int local374;
		if (!Static90.aBoolean192) {
			@Pc(253) byte[] local253;
			for (local207 = 0; local207 < local124; local207++) {
				local253 = Static117.aByteArrayArray9[local207];
				local263 = (Static149.anIntArray352[local207] & 0xFF) * 64 - Static60.anInt1864;
				local274 = (Static149.anIntArray352[local207] >> 8) * 64 - Static153.anInt3629;
				if (local253 != null) {
					Static131.method2376();
					Static88.method1853(local263, (Static26.anInt960 - 6) * 8, Static149.aClass12Array1, local274, local253, Static82.anInt2315 * 8 - 48);
				}
			}
			for (local274 = 0; local274 < local124; local274++) {
				local263 = (Static149.anIntArray352[local274] >> 8) * 64 - Static153.anInt3629;
				local324 = (Static149.anIntArray352[local274] & 0xFF) * 64 - Static60.anInt1864;
				@Pc(328) byte[] local328 = Static117.aByteArrayArray9[local274];
				if (local328 == null && Static82.anInt2315 < 800) {
					Static131.method2376();
					Static87.method1848(local324, 64, local263, 64);
				}
			}
			Static137.method2454(true);
			for (local263 = 0; local263 < local124; local263++) {
				local253 = Static106.aByteArrayArray8[local263];
				if (local253 != null) {
					local374 = (Static149.anIntArray352[local263] >> 8) * 64 - Static153.anInt3629;
					local385 = (Static149.anIntArray352[local263] & 0xFF) * 64 - Static60.anInt1864;
					Static131.method2376();
					Static175.method2925(local374, local253, local385, Static149.aClass12Array1);
				}
			}
		}
		@Pc(433) int local433;
		@Pc(439) int local439;
		if (Static90.aBoolean192) {
			@Pc(451) int local451;
			@Pc(461) int local461;
			@Pc(463) int local463;
			for (local207 = 0; local207 < 4; local207++) {
				Static131.method2376();
				for (local274 = 0; local274 < 13; local274++) {
					for (local263 = 0; local263 < 13; local263++) {
						@Pc(415) boolean local415 = false;
						local374 = Static39.anIntArrayArrayArray1[local207][local274][local263];
						if (local374 != -1) {
							local433 = local374 >> 1 & 0x3;
							local439 = local374 >> 14 & 0x3FF;
							local385 = local374 >> 24 & 0x3;
							local451 = local374 >> 3 & 0x7FF;
							local461 = local451 / 8 + (local439 / 8 << 8);
							for (local463 = 0; local463 < Static149.anIntArray352.length; local463++) {
								if (Static149.anIntArray352[local463] == local461 && Static117.aByteArrayArray9[local463] != null) {
									Static83.method1777(local274 * 8, (local451 & 0x7) * 8, Static117.aByteArrayArray9[local463], local263 * 8, (local439 & 0x7) * 8, local385, local207, local433, Static149.aClass12Array1);
									local415 = true;
									break;
								}
							}
						}
						if (!local415) {
							Static112.method2185(local207, local274 * 8, local263 * 8);
						}
					}
				}
			}
			for (local274 = 0; local274 < 13; local274++) {
				for (local263 = 0; local263 < 13; local263++) {
					local324 = Static39.anIntArrayArrayArray1[0][local274][local263];
					if (local324 == -1) {
						Static87.method1848(local263 * 8, 8, local274 * 8, 8);
					}
				}
			}
			Static137.method2454(true);
			for (local263 = 0; local263 < 4; local263++) {
				Static131.method2376();
				for (local324 = 0; local324 < 13; local324++) {
					for (local374 = 0; local374 < 13; local374++) {
						local385 = Static39.anIntArrayArrayArray1[local263][local324][local374];
						if (local385 != -1) {
							local433 = local385 >> 24 & 0x3;
							local439 = local385 >> 1 & 0x3;
							local451 = local385 >> 14 & 0x3FF;
							local461 = local385 >> 3 & 0x7FF;
							local463 = (local451 / 8 << 8) + local461 / 8;
							for (@Pc(651) int local651 = 0; local651 < Static149.anIntArray352.length; local651++) {
								if (local463 == Static149.anIntArray352[local651] && Static106.aByteArrayArray8[local651] != null) {
									Static142.method2530((local461 & 0x7) * 8, local374 * 8, (local451 & 0x7) * 8, Static106.aByteArrayArray8[local651], local324 * 8, local439, Static149.aClass12Array1, local263, local433);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static137.method2454(true);
		Static37.method991();
		Static131.method2376();
		Static134.method2404(Static149.aClass12Array1);
		Static137.method2454(true);
		local207 = Static21.anInt782;
		if (Static156.anInt3696 < local207) {
			local207 = Static156.anInt3696;
		}
		if (local207 < Static156.anInt3696 - 1) {
		}
		if (Static30.aBoolean72) {
			Static162.method2781(Static21.anInt782);
		} else {
			Static162.method2781(0);
		}
		for (local274 = 0; local274 < 104; local274++) {
			for (local263 = 0; local263 < 104; local263++) {
				Static162.method2778(local263, local274);
			}
		}
		Static131.method2376();
		Static162.method2780();
		Static37.method991();
		if (Static97.aFrame106 != null) {
			Static1.aClass1_Sub8_Sub1_1.method1654(152);
			Static1.aClass1_Sub8_Sub1_1.method1635(1057001181);
		}
		if (!Static90.aBoolean192) {
			local324 = (Static26.anInt960 + 6) / 8;
			local374 = (Static82.anInt2315 - 6) / 8;
			local263 = (Static26.anInt960 - 6) / 8;
			local385 = (Static82.anInt2315 + 6) / 8;
			for (local433 = local263 - 1; local433 <= local324 + 1; local433++) {
				for (local439 = local374 - 1; local439 <= local385 + 1; local439++) {
					if (local433 < local263 || local433 > local324 || local374 > local439 || local385 < local439) {
						Static42.aClass4_Sub1_21.method2267(Static57.method1349(new Class13[] { Static16.aClass13_254, Static3.method75(local433), Static95.aClass13_880, Static3.method75(local439) }));
						Static42.aClass4_Sub1_21.method2267(Static57.method1349(new Class13[] { Static98.aClass13_1289, Static3.method75(local433), Static95.aClass13_880, Static3.method75(local439) }));
					}
				}
			}
		}
		Static53.method1293(30);
		Static131.method2376();
		Static147.method2582();
		Static1.aClass1_Sub8_Sub1_1.method1654(64);
		Static49.method1235();
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!ae;ILclient!ae;)V")
	public static void method1410(@OriginalArg(0) Class1_Sub2_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) Class1_Sub2_Sub1_Sub1_Sub1 arg1) {
		if (Static63.aClass1_Sub2_Sub1_Sub3Array8 == null) {
			Static63.aClass1_Sub2_Sub1_Sub3Array8 = Static77.method1584(Static121.anInt3152, 0, Static69.aClass4_Sub1_25);
		}
		if (Static87.aClass1_Sub2_Sub1_Sub4Array9 == null) {
			Static87.aClass1_Sub2_Sub1_Sub4Array9 = Static117.method2224(Static96.anInt2774, Static69.aClass4_Sub1_25, 0);
		}
		if (Static131.aClass1_Sub2_Sub1_Sub4Array12 == null) {
			Static131.aClass1_Sub2_Sub1_Sub4Array12 = Static117.method2224(Static157.anInt3726, Static69.aClass4_Sub1_25, 0);
		}
		if (Static89.aClass1_Sub2_Sub1_Sub4Array10 == null) {
			Static89.aClass1_Sub2_Sub1_Sub4Array10 = Static117.method2224(Static187.anInt4124, Static69.aClass4_Sub1_25, 0);
		}
		Static128.method565(0, 23, 765, 480, 0);
		Static128.method555(0, 0, 125, 23, 12425273, 9135624);
		Static128.method555(125, 0, 640, 23, 5197647, 2697513);
		arg0.method258(Static173.aClass13_1377, 62, 15, 0, -1);
		if (Static89.aClass1_Sub2_Sub1_Sub4Array10 != null) {
			Static89.aClass1_Sub2_Sub1_Sub4Array10[1].method570(140, 1);
			arg1.method254(Static79.aClass13_750, 152, 10, 16777215, -1);
			Static89.aClass1_Sub2_Sub1_Sub4Array10[0].method570(140, 12);
			arg1.method254(Static37.aClass13_419, 152, 21, 16777215, -1);
		}
		if (Static131.aClass1_Sub2_Sub1_Sub4Array12 != null) {
			if (Static88.anIntArray241[0] == 0 && Static108.anIntArray290[0] == 0) {
				Static131.aClass1_Sub2_Sub1_Sub4Array12[2].method570(280, 4);
			} else {
				Static131.aClass1_Sub2_Sub1_Sub4Array12[0].method570(280, 4);
			}
			if (Static88.anIntArray241[0] == 0 && Static108.anIntArray290[0] == 1) {
				Static131.aClass1_Sub2_Sub1_Sub4Array12[3].method570(295, 4);
			} else {
				Static131.aClass1_Sub2_Sub1_Sub4Array12[1].method570(295, 4);
			}
			arg0.method254(Static130.aClass13_1101, 312, 17, 16777215, -1);
			if (Static88.anIntArray241[0] == 1 && Static108.anIntArray290[0] == 0) {
				Static131.aClass1_Sub2_Sub1_Sub4Array12[2].method570(390, 4);
			} else {
				Static131.aClass1_Sub2_Sub1_Sub4Array12[0].method570(390, 4);
			}
			if (Static88.anIntArray241[0] == 1 && Static108.anIntArray290[0] == 1) {
				Static131.aClass1_Sub2_Sub1_Sub4Array12[3].method570(405, 4);
			} else {
				Static131.aClass1_Sub2_Sub1_Sub4Array12[1].method570(405, 4);
			}
			arg0.method254(Static33.aClass13_391, 422, 17, 16777215, -1);
			if (Static88.anIntArray241[0] == 2 && Static108.anIntArray290[0] == 0) {
				Static131.aClass1_Sub2_Sub1_Sub4Array12[2].method570(500, 4);
			} else {
				Static131.aClass1_Sub2_Sub1_Sub4Array12[0].method570(500, 4);
			}
			if (Static88.anIntArray241[0] == 2 && Static108.anIntArray290[0] == 1) {
				Static131.aClass1_Sub2_Sub1_Sub4Array12[3].method570(515, 4);
			} else {
				Static131.aClass1_Sub2_Sub1_Sub4Array12[1].method570(515, 4);
			}
			arg0.method254(Static87.aClass13_821, 532, 17, 16777215, -1);
			if (Static88.anIntArray241[0] == 3 && Static108.anIntArray290[0] == 0) {
				Static131.aClass1_Sub2_Sub1_Sub4Array12[2].method570(610, 4);
			} else {
				Static131.aClass1_Sub2_Sub1_Sub4Array12[0].method570(610, 4);
			}
			if (Static88.anIntArray241[0] == 3 && Static108.anIntArray290[0] == 1) {
				Static131.aClass1_Sub2_Sub1_Sub4Array12[3].method570(625, 4);
			} else {
				Static131.aClass1_Sub2_Sub1_Sub4Array12[1].method570(625, 4);
			}
			arg0.method254(Static163.aClass13_1323, 642, 17, 16777215, -1);
		}
		Static128.method565(708, 4, 50, 16, 0);
		arg1.method258(Static133.aClass13_1125, 733, 16, 16777215, -1);
		Static148.anInt3589 = -1;
		if (Static63.aClass1_Sub2_Sub1_Sub3Array8 == null) {
			return;
		}
		@Pc(390) int local390 = 8;
		@Pc(396) int local396 = 24;
		@Pc(400) int local400;
		@Pc(398) int local398;
		do {
			local398 = local390;
			local400 = local396;
			if (Static119.anInt3131 <= (local390 - 1) * local396) {
				local390--;
			}
			if (local390 * (local396 - 1) >= Static119.anInt3131) {
				local396--;
			}
			if (Static119.anInt3131 <= local390 * (local396 - 1)) {
				local396--;
			}
		} while (local400 != local396 || local390 != local398);
		local400 = (765 - local390 * 88) / (local390 + 1);
		if (local400 > 5) {
			local400 = 5;
		}
		@Pc(473) int local473 = (765 - local390 * 88 - local400 * (local390 + -1)) / 2;
		local398 = (480 - local396 * 19) / (local396 + 1);
		if (local398 > 5) {
			local398 = 5;
		}
		@Pc(505) int local505 = (480 - local396 * 19 - (local396 + -1) * local398) / 2;
		@Pc(507) int local507 = local473;
		@Pc(512) int local512 = local505 + 23;
		@Pc(514) int local514 = 0;
		for (@Pc(516) int local516 = 0; local516 < Static119.anInt3131; local516++) {
			@Pc(520) boolean local520 = true;
			@Pc(524) Class36 local524 = Static16.aClass36Array1[local516];
			@Pc(529) Class13 local529 = Static3.method75(local524.anInt2133);
			if (local524.anInt2133 == -1) {
				local520 = false;
				local529 = Static58.aClass13_620;
			} else if (local524.anInt2133 > 1980) {
				local520 = false;
				local529 = Static58.aClass13_621;
			}
			if (local507 <= Static14.anInt481 && Static86.anInt2447 >= local512 && local507 + 88 > Static14.anInt481 && local512 + 19 > Static86.anInt2447 && local520) {
				Static148.anInt3589 = local516;
				Static63.aClass1_Sub2_Sub1_Sub3Array8[local524.aBoolean167 ? 1 : 0].method419(local507, local512);
			} else {
				Static63.aClass1_Sub2_Sub1_Sub3Array8[local524.aBoolean167 ? 1 : 0].method400(local507, local512);
			}
			if (Static87.aClass1_Sub2_Sub1_Sub4Array9 != null) {
				Static87.aClass1_Sub2_Sub1_Sub4Array9[local524.anInt2132 + (local524.aBoolean167 ? 8 : 0)].method570(local507 + 29, local512);
			}
			arg0.method258(Static3.method75(local524.anInt2134), local507 + 15, local512 + 5 - -9, 0, -1);
			arg1.method258(local529, local507 + 60, local512 + 14, 268435455, -1);
			local512 += local398 + 19;
			local514++;
			if (local514 >= local396) {
				local507 += local400 + 88;
				local514 = 0;
				local512 = local505 + 23;
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)[Lclient!bg;")
	public static Class1_Sub2_Sub1_Sub4[] method1411() {
		@Pc(16) Class1_Sub2_Sub1_Sub4[] local16 = new Class1_Sub2_Sub1_Sub4[Static123.anInt3217];
		for (@Pc(18) int local18 = 0; local18 < Static123.anInt3217; local18++) {
			@Pc(24) Class1_Sub2_Sub1_Sub4 local24 = new Class1_Sub2_Sub1_Sub4();
			local24.anInt513 = Static32.anInt4094;
			local24.anInt515 = Static51.anInt1673;
			local24.anInt511 = Static184.anIntArray449[local18];
			local24.anInt516 = Static130.anIntArray324[local18];
			local24.anInt514 = Static12.anIntArray51[local18];
			local24.anInt512 = Static106.anIntArray285[local18];
			local24.anIntArray76 = Static104.anIntArray268;
			local24.aByteArray17 = Static180.aByteArrayArray10[local18];
			local16[local18] = local24;
		}
		Static111.method2163();
		return local16;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)I")
	public static int method1412(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub24 local12 = (Class1_Sub24) Static30.aClass45_6.method1988((long) arg0);
		if (local12 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(28) int local28 = 0;
			for (@Pc(30) int local30 = 0; local30 < local12.anIntArray452.length; local30++) {
				if (arg1 == local12.anIntArray453[local30]) {
					local28 += local12.anIntArray452[local30];
				}
			}
			return local28;
		}
	}
}
