import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!e", name = "k", descriptor = "[Lclient!gj;")
	public static Class31[] aClass31Array3;

	@OriginalMember(owner = "client!e", name = "ub", descriptor = "I")
	public static int anInt1428;

	@OriginalMember(owner = "client!e", name = "vb", descriptor = "I")
	public static int anInt1429;

	@OriginalMember(owner = "client!e", name = "f", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_22 = new Class93("Take", "Nehmen", "Prendre", "Pegar");

	@OriginalMember(owner = "client!e", name = "hb", descriptor = "I")
	public static int anInt1419 = 0;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IB)Lclient!vb;")
	public static Class200 method1485(@OriginalArg(0) int arg0) {
		@Pc(10) Class200 local10 = (Class200) Static330.aClass119_203.method3311((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static197.aClass191_128.method5459(35, arg0);
		local10 = new Class200();
		if (local25 != null) {
			local10.method5756(new Class2_Sub10(local25));
		}
		local10.method5759();
		Static330.aClass119_203.method3308(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V")
	public static void method1486() {
		if (Static147.aClass4_2 == null) {
			return;
		}
		Static5.aClass67_7.method2097();
		Static312.method5482();
		Static10.method373();
		Static93.method2110();
		Static252.method4566();
		Static282.method5079();
		if (Static89.aClass18_1 != null) {
			Static89.aClass18_1.method694();
		}
		Static295.method5205();
		Static224.method3940();
		Static238.method4106();
		Static12.method424(false);
		Static32.method796();
		for (@Pc(33) int local33 = 0; local33 < 2048; local33++) {
			@Pc(39) Class62_Sub1_Sub2_Sub2 local39 = Static129.aClass62_Sub1_Sub2_Sub2Array1[local33];
			if (local39 != null) {
				local39.anInterface9_3 = null;
				for (@Pc(46) int local46 = 0; local46 < local39.aClass7Array3.length; local46++) {
					local39.aClass7Array3[local46] = null;
				}
			}
		}
		for (@Pc(65) int local65 = 0; local65 < Static37.aClass62_Sub1_Sub2_Sub1Array1.length; local65++) {
			@Pc(71) Class62_Sub1_Sub2_Sub1 local71 = Static37.aClass62_Sub1_Sub2_Sub1Array1[local65];
			if (local71 != null) {
				for (@Pc(75) int local75 = 0; local75 < local71.aClass7Array3.length; local75++) {
					local71.aClass7Array3[local75] = null;
				}
			}
		}
		Static147.aClass4_2.method4238();
		Static147.aClass4_2 = null;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!tq;Lclient!tq;Z)I")
	public static int method1488(@OriginalArg(0) Class191 arg0, @OriginalArg(1) Class191 arg1) {
		@Pc(10) int local10 = 0;
		if (arg0.method5440(Static2.anInt73)) {
			local10++;
		}
		if (arg0.method5440(Static106.anInt2392)) {
			local10++;
		}
		if (arg0.method5440(Static90.anInt5299)) {
			local10++;
		}
		if (arg1.method5440(Static2.anInt73)) {
			local10++;
		}
		if (arg1.method5440(Static106.anInt2392)) {
			local10++;
		}
		if (arg1.method5440(Static90.anInt5299)) {
			local10++;
		}
		return local10;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ILclient!gh;Lclient!gh;[[I[[BZLclient!ae;II[[BI[[B[[B)V")
	public static void method1489(@OriginalArg(1) Class73 arg0, @OriginalArg(2) Class73 arg1, @OriginalArg(3) int[][] arg2, @OriginalArg(4) byte[][] arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class4 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[][] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) byte[][] arg10, @OriginalArg(12) byte[][] arg11) {
		if (Static129.anInt2728 == 0 && !Static32.aBoolean70) {
			Static165.method3081(arg1, arg2, arg9, arg4, arg11, arg5, arg6, arg8, arg3, arg10, arg0, arg7);
		} else {
			Static219.method3897(arg8, arg5, arg11, arg1, arg0, arg4, arg2, arg9, arg6, arg7, arg3, arg10);
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II)I")
	public static int method1491(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V")
	public static void method1492() {
		if (Static216.anInt4151 > 1) {
			Static164.anInt3284 = Static157.anInt3179;
			Static216.anInt4151--;
		}
		if (Static207.anInt6401 > 0) {
			Static207.anInt6401--;
		}
		if (Static210.aBoolean362) {
			Static210.aBoolean362 = false;
			Static55.method4438();
			return;
		}
		if (!Static29.aBoolean66) {
			Static300.method5153();
		}
		for (@Pc(37) int local37 = 0; local37 < 100 && Static291.method5163(); local37++) {
		}
		if (Static263.anInt5396 != 30) {
			return;
		}
		Static256.method4644(Static74.aClass2_Sub10_Sub1_2);
		@Pc(74) int local74;
		@Pc(97) int local97;
		@Pc(117) int local117;
		@Pc(132) boolean local132;
		@Pc(185) int local185;
		@Pc(192) int local192;
		@Pc(203) int local203;
		if (Static187.aClass2_Sub16_1 != null || Static147.aLong9 < Static51.method1197() - 2000L) {
			@Pc(71) boolean local71 = false;
			local74 = Static74.aClass2_Sub10_Sub1_2.anInt4807;
			for (@Pc(79) Class2_Sub16 local79 = (Class2_Sub16) Static178.aClass216_33.method5992(); local79 != null && Static74.aClass2_Sub10_Sub1_2.anInt4807 - local74 < 240; local79 = (Class2_Sub16) Static178.aClass216_33.method6000()) {
				local79.method5945();
				local97 = local79.method1564();
				if (local97 < 0) {
					local97 = 0;
				} else if (local97 > 65534) {
					local97 = 65534;
				}
				local117 = local79.method1557();
				if (local117 < 0) {
					local117 = 0;
				} else if (local117 > 65534) {
					local117 = 65534;
				}
				local132 = false;
				if (local79.method1564() == -1 && local79.method1557() == -1) {
					local117 = -1;
					local97 = -1;
					local132 = true;
				}
				if (local117 != Static158.anInt3193 || Static136.anInt2827 != local97) {
					if (!local71) {
						Static74.aClass2_Sub10_Sub1_2.method2049(107);
						Static74.aClass2_Sub10_Sub1_2.method4430(0);
						local74 = Static74.aClass2_Sub10_Sub1_2.anInt4807;
						local71 = true;
					}
					local185 = local117 - Static158.anInt3193;
					Static158.anInt3193 = local117;
					local192 = local97 - Static136.anInt2827;
					Static136.anInt2827 = local97;
					local203 = (int) ((local79.method1559() - Static147.aLong9) / 20L);
					if (local203 < 8 && local185 >= -32 && local185 <= 31 && local192 >= -32 && local192 <= 31) {
						local185 += 32;
						local192 += 32;
						Static74.aClass2_Sub10_Sub1_2.method4452(local192 + (local185 << 6) + (local203 << 12));
					} else if (local203 < 32 && local185 >= -128 && local185 <= 127 && local192 >= -128 && local192 <= 127) {
						local192 += 128;
						local185 += 128;
						Static74.aClass2_Sub10_Sub1_2.method4430(local203 + 128);
						Static74.aClass2_Sub10_Sub1_2.method4452(local192 + (local185 << 8));
					} else if (local203 >= 32) {
						Static74.aClass2_Sub10_Sub1_2.method4452(local203 + 57344);
						if (local132) {
							Static74.aClass2_Sub10_Sub1_2.method4450(Integer.MIN_VALUE);
						} else {
							Static74.aClass2_Sub10_Sub1_2.method4450(local117 | local97 << 16);
						}
					} else {
						Static74.aClass2_Sub10_Sub1_2.method4430(local203 + 192);
						if (local132) {
							Static74.aClass2_Sub10_Sub1_2.method4450(Integer.MIN_VALUE);
						} else {
							Static74.aClass2_Sub10_Sub1_2.method4450(local97 << 16 | local117);
						}
					}
					Static147.aLong9 = local79.method1559();
				}
			}
			if (local71) {
				Static74.aClass2_Sub10_Sub1_2.method4431(Static74.aClass2_Sub10_Sub1_2.anInt4807 - local74);
			}
		}
		@Pc(374) int local374;
		@Pc(422) int local422;
		if (Static187.aClass2_Sub16_1 != null) {
			@Pc(358) long local358 = (Static187.aClass2_Sub16_1.method1559() - Static175.aLong104) / 50L;
			Static175.aLong104 = Static187.aClass2_Sub16_1.method1559();
			if (local358 > 32767L) {
				local358 = 32767L;
			}
			local374 = Static187.aClass2_Sub16_1.method1564();
			if (local374 < 0) {
				local374 = 0;
			} else if (local374 > 65535) {
				local374 = 65535;
			}
			local97 = Static187.aClass2_Sub16_1.method1557();
			if (local97 < 0) {
				local97 = 0;
			} else if (local97 > 65535) {
				local97 = 65535;
			}
			@Pc(402) byte local402 = 0;
			if (Static187.aClass2_Sub16_1.method1562() == 2) {
				local402 = 1;
			}
			Static74.aClass2_Sub10_Sub1_2.method2049(80);
			local422 = (int) local358;
			Static74.aClass2_Sub10_Sub1_2.method4457(local374 << 16 | local97);
			Static74.aClass2_Sub10_Sub1_2.method4459(local422 | local402 << 15);
		}
		@Pc(445) int local445;
		if (Static49.anInt1100 > 0) {
			local445 = 0;
			for (local74 = 0; local74 < Static49.anInt1100; local74++) {
				if (Static138.aClass69Array1[local74].method5552()) {
					local445++;
				}
			}
			if (local445 > 0) {
				Static74.aClass2_Sub10_Sub1_2.method2049(13);
				if (local445 > 75) {
					local445 = 75;
				}
				Static74.aClass2_Sub10_Sub1_2.method4430(local445 * 3);
				for (local374 = 0; local374 < Static49.anInt1100; local374++) {
					@Pc(489) Class69 local489 = Static138.aClass69Array1[local374];
					if (local489.method5552()) {
						@Pc(503) long local503 = (local489.method5550() - Static325.aLong200) / 50L;
						Static325.aLong200 = local489.method5550();
						if (local503 > 65535L) {
							local503 = 65535L;
						}
						Static74.aClass2_Sub10_Sub1_2.method4430(local489.method5553());
						Static74.aClass2_Sub10_Sub1_2.method4452((int) local503);
					}
				}
			}
		}
		if (Static116.anInt2580 > 0) {
			Static116.anInt2580--;
		}
		if (Static285.aBoolean515 && Static116.anInt2580 <= 0) {
			Static116.anInt2580 = 20;
			Static285.aBoolean515 = false;
			Static74.aClass2_Sub10_Sub1_2.method2049(233);
			Static74.aClass2_Sub10_Sub1_2.method4459((int) Static331.aFloat43 >> 3);
			Static74.aClass2_Sub10_Sub1_2.method4435((int) Static92.aFloat28 >> 3);
		}
		if (Static81.aBoolean158 && !Static252.aBoolean454) {
			Static252.aBoolean454 = true;
			Static74.aClass2_Sub10_Sub1_2.method2049(45);
			Static74.aClass2_Sub10_Sub1_2.method4430(1);
		}
		if (!Static81.aBoolean158 && Static252.aBoolean454) {
			Static252.aBoolean454 = false;
			Static74.aClass2_Sub10_Sub1_2.method2049(45);
			Static74.aClass2_Sub10_Sub1_2.method4430(0);
		}
		if (!Static235.aBoolean413) {
			Static74.aClass2_Sub10_Sub1_2.method2049(221);
			Static74.aClass2_Sub10_Sub1_2.method4434(Static269.method4868());
			Static235.aBoolean413 = true;
		}
		if (Static275.aClass8ArrayArrayArray4 != null) {
			if (Static182.anInt3602 == 2) {
				Static212.method3772();
			} else if (Static182.anInt3602 == 3) {
				Static293.method5194();
			}
		}
		if (Static114.aBoolean578) {
			Static114.aBoolean578 = false;
		} else {
			Static100.aFloat37 /= 2.0F;
		}
		if (Static32.aBoolean71) {
			Static32.aBoolean71 = false;
		} else {
			Static148.aFloat41 /= 2.0F;
		}
		Static331.method2986();
		if (Static263.anInt5396 != 30) {
			return;
		}
		Static249.method4523();
		Static71.method1638();
		Static138.method2749();
		Static351.anInt5290++;
		if (Static351.anInt5290 > 750) {
			Static55.method4438();
			return;
		}
		Static96.method2172();
		Static139.method2755();
		Static125.method2610();
		for (local445 = Static89.method2047(true); local445 != -1; local445 = Static89.method2047(false)) {
			Static249.method4527(local445);
			Static221.anIntArray336[Static215.anInt4141++ & 0x1F] = local445;
		}
		@Pc(771) Class146 local771;
		for (@Pc(746) Class2_Sub11_Sub19 local746 = Static330.method5774(); local746 != null; local746 = Static330.method5774()) {
			local374 = local746.method5538();
			local97 = local746.method5544();
			if (local374 == 1) {
				Static31.anIntArray37[local97] = local746.anInt6362;
				Static288.aBoolean540 |= Static5.aBooleanArray23[local97];
				Static218.anIntArray331[Static84.anInt1824++ & 0x1F] = local97;
			} else if (local374 == 2) {
				Static102.aStringArray14[local97] = local746.aString59;
				Static177.anIntArray292[Static156.anInt3173++ & 0x1F] = local97;
			} else if (local374 == 3) {
				local771 = Static1.method16(local97);
				if (!local746.aString59.equals(local771.aString42)) {
					local771.aString42 = local746.aString59;
					Static152.method2932(local771);
				}
			} else if (local374 == 4) {
				local771 = Static1.method16(local97);
				local422 = local746.anInt6362;
				local185 = local746.anInt6365;
				local192 = local746.anInt6368;
				if (local771.anInt4426 != local422 || local771.anInt4415 != local185 || local771.anInt4439 != local192) {
					local771.anInt4439 = local192;
					local771.anInt4426 = local422;
					local771.anInt4415 = local185;
					Static152.method2932(local771);
				}
			} else if (local374 == 5) {
				local771 = Static1.method16(local97);
				if (local746.anInt6362 != local771.anInt4429 || local746.anInt6362 == -1) {
					local771.anInt4429 = local746.anInt6362;
					local771.anInt4433 = 0;
					local771.anInt4441 = 0;
					local771.anInt4427 = 1;
					Static152.method2932(local771);
				}
			} else if (local374 == 6) {
				local117 = local746.anInt6362;
				local422 = local117 >> 10 & 0x1F;
				local185 = local117 >> 5 & 0x1F;
				local192 = local117 & 0x1F;
				local203 = (local192 << 3) + (local422 << 19) + (local185 << 11);
				@Pc(882) Class146 local882 = Static1.method16(local97);
				if (local203 != local882.anInt4431) {
					local882.anInt4431 = local203;
					Static152.method2932(local882);
				}
			} else if (local374 == 7) {
				local771 = Static1.method16(local97);
				local132 = local746.anInt6362 == 1;
				if (local771.aBoolean404 != local132) {
					local771.aBoolean404 = local132;
					Static152.method2932(local771);
				}
			} else if (local374 == 8) {
				local771 = Static1.method16(local97);
				if (local746.anInt6362 != local771.anInt4424 || local746.anInt6365 != local771.anInt4461 || local771.anInt4437 != local746.anInt6368) {
					local771.anInt4461 = local746.anInt6365;
					local771.anInt4437 = local746.anInt6368;
					local771.anInt4424 = local746.anInt6362;
					if (local771.anInt4478 != -1) {
						if (local771.anInt4418 > 0) {
							local771.anInt4437 = local771.anInt4437 * 32 / local771.anInt4418;
						} else if (local771.anInt4451 > 0) {
							local771.anInt4437 = local771.anInt4437 * 32 / local771.anInt4451;
						}
					}
					Static152.method2932(local771);
				}
			} else if (local374 == 9) {
				local771 = Static1.method16(local97);
				if (local746.anInt6362 != local771.anInt4478 || local771.anInt4489 != local746.anInt6365) {
					local771.anInt4489 = local746.anInt6365;
					local771.anInt4478 = local746.anInt6362;
					Static152.method2932(local771);
				}
			} else if (local374 == 10) {
				local771 = Static1.method16(local97);
				if (local746.anInt6362 != local771.anInt4463 || local771.anInt4452 != local746.anInt6365 || local746.anInt6368 != local771.anInt4413) {
					local771.anInt4413 = local746.anInt6368;
					local771.anInt4463 = local746.anInt6362;
					local771.anInt4452 = local746.anInt6365;
					Static152.method2932(local771);
				}
			} else if (local374 == 11) {
				local771 = Static1.method16(local97);
				local771.anInt4442 = local771.anInt4411 = local746.anInt6362;
				local771.anInt4460 = local771.anInt4438 = local746.anInt6365;
				local771.aByte39 = 0;
				local771.aByte38 = 0;
				Static152.method2932(local771);
			} else if (local374 == 12) {
				local771 = Static1.method16(local97);
				local422 = local746.anInt6362;
				if (local771 != null && local771.anInt4419 == 0) {
					if (local771.anInt4482 - local771.anInt4414 < local422) {
						local422 = local771.anInt4482 - local771.anInt4414;
					}
					if (local422 < 0) {
						local422 = 0;
					}
					if (local771.anInt4483 != local422) {
						local771.anInt4483 = local422;
						Static152.method2932(local771);
					}
				}
			} else if (local374 == 14) {
				local771 = Static1.method16(local97);
				local771.anInt4434 = local746.anInt6362;
			} else if (local374 == 15) {
				Static264.aBoolean487 = true;
				Static201.anInt3909 = local746.anInt6362;
				Static116.anInt2576 = local746.anInt6365;
			} else if (local374 == 16) {
				local771 = Static1.method16(local97);
				local771.anInt4435 = local746.anInt6362;
			}
		}
		if (Static70.anInt1524 != 0) {
			Static164.anInt3283 += 20;
			if (Static164.anInt3283 >= 400) {
				Static70.anInt1524 = 0;
			}
		}
		Static220.anInt4246++;
		if (Static313.aClass146_15 != null) {
			Static282.anInt5706++;
			if (Static282.anInt5706 >= 15) {
				Static152.method2932(Static313.aClass146_15);
				Static313.aClass146_15 = null;
			}
		}
		Static304.aBoolean546 = false;
		Static162.aClass146_10 = null;
		Static236.aClass146_13 = null;
		Static305.aBoolean549 = false;
		Static177.method3262(-1, null, -1);
		Static161.method3039(null, -1, -1);
		Static5.method4296();
		Static157.anInt3179++;
		if (Static301.aBoolean460) {
			Static74.aClass2_Sub10_Sub1_2.method2049(158);
			Static74.aClass2_Sub10_Sub1_2.method4411(Static35.anInt625 << 14 | Static304.anInt6121 << 28 | Static164.anInt3291);
			Static301.aBoolean460 = false;
		}
		while (true) {
			@Pc(1384) Class2_Sub44 local1384;
			@Pc(1389) Class146 local1389;
			do {
				local1384 = (Class2_Sub44) Static23.aClass216_16.method5999();
				if (local1384 == null) {
					while (true) {
						do {
							local1384 = (Class2_Sub44) Static164.aClass216_32.method5999();
							if (local1384 == null) {
								while (true) {
									do {
										local1384 = (Class2_Sub44) Static356.aClass216_46.method5999();
										if (local1384 == null) {
											if (Static162.aClass146_10 == null) {
												Static61.anInt1330 = 0;
											}
											if (Static285.aClass146_14 != null) {
												Static346.method5940();
											}
											if (Static295.anInt5969 > 0 && Static92.aClass97_2.method5672(82) && Static92.aClass97_2.method5672(81) && Static333.anInt6673 != 0) {
												local374 = Static182.anInt3603 - Static333.anInt6673;
												if (local374 < 0) {
													local374 = 0;
												} else if (local374 > 3) {
													local374 = 3;
												}
												Static302.method5307(Static138.anInt2879 + Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray397[0], Static342.anInt6864 + Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray396[0], local374);
											}
											Static347.method3868();
											for (local374 = 0; local374 < 5; local374++) {
												@Pc(1588) int local1588 = Static154.anIntArray477[local374]++;
											}
											if (Static288.aBoolean540 && Static51.method1197() - 60000L > Static223.aLong133) {
												Static153.method2951();
											}
											Static201.anInt3910++;
											if (Static201.anInt3910 > 500) {
												Static201.anInt3910 = 0;
												local97 = (int) (Math.random() * 8.0D);
												if ((local97 & 0x1) == 1) {
													Static97.anInt6854 += Static312.anInt6295;
												}
												if ((local97 & 0x2) == 2) {
													Static79.anInt1747 += Static200.anInt6407;
												}
												if ((local97 & 0x4) == 4) {
													Static102.anInt2330 += Static254.anInt5029;
												}
											}
											if (Static97.anInt6854 < -50) {
												Static312.anInt6295 = 2;
											}
											if (Static97.anInt6854 > 50) {
												Static312.anInt6295 = -2;
											}
											if (Static79.anInt1747 < -55) {
												Static200.anInt6407 = 2;
											}
											if (Static79.anInt1747 > 55) {
												Static200.anInt6407 = -2;
											}
											if (Static102.anInt2330 < -40) {
												Static254.anInt5029 = 1;
											}
											if (Static102.anInt2330 > 40) {
												Static254.anInt5029 = -1;
											}
											Static4.anInt106++;
											if (Static4.anInt106 > 500) {
												Static4.anInt106 = 0;
												local97 = (int) (Math.random() * 8.0D);
												if ((local97 & 0x1) == 1) {
													Static256.anInt5068 += Static332.anInt3536;
												}
												if ((local97 & 0x2) == 2) {
													Static331.anInt3201 += Static286.anInt5806;
												}
											}
											if (Static256.anInt5068 < -60) {
												Static332.anInt3536 = 2;
											}
											if (Static256.anInt5068 > 60) {
												Static332.anInt3536 = -2;
											}
											if (Static331.anInt3201 < -20) {
												Static286.anInt5806 = 1;
											}
											Static114.anInt6589++;
											if (Static331.anInt3201 > 10) {
												Static286.anInt5806 = -1;
											}
											if (Static114.anInt6589 > 50) {
												Static74.aClass2_Sub10_Sub1_2.method2049(243);
											}
											if (Static241.aBoolean425) {
												Static312.method5483();
												Static241.aBoolean425 = false;
											}
											try {
												if (Static157.aClass173_1 != null && Static74.aClass2_Sub10_Sub1_2.anInt4807 > 0) {
													Static157.aClass173_1.method5021(Static74.aClass2_Sub10_Sub1_2.anInt4807, Static74.aClass2_Sub10_Sub1_2.aByteArray57);
													Static114.anInt6589 = 0;
													Static74.aClass2_Sub10_Sub1_2.anInt4807 = 0;
													return;
												}
												return;
											} catch (@Pc(1793) IOException local1793) {
												Static55.method4438();
												return;
											}
										}
										local1389 = local1384.aClass146_18;
										if (local1389.anInt4493 < 0) {
											break;
										}
										local771 = Static1.method16(local1389.anInt4458);
									} while (local771 == null || local771.aClass146Array2 == null || local771.aClass146Array2.length <= local1389.anInt4493 || local1389 != local771.aClass146Array2[local1389.anInt4493]);
									Static72.method1646(local1384);
								}
							}
							local1389 = local1384.aClass146_18;
							if (local1389.anInt4493 < 0) {
								break;
							}
							local771 = Static1.method16(local1389.anInt4458);
						} while (local771 == null || local771.aClass146Array2 == null || local1389.anInt4493 >= local771.aClass146Array2.length || local771.aClass146Array2[local1389.anInt4493] != local1389);
						Static72.method1646(local1384);
					}
				}
				local1389 = local1384.aClass146_18;
				if (local1389.anInt4493 < 0) {
					break;
				}
				local771 = Static1.method16(local1389.anInt4458);
			} while (local771 == null || local771.aClass146Array2 == null || local771.aClass146Array2.length <= local1389.anInt4493 || local771.aClass146Array2[local1389.anInt4493] != local1389);
			Static72.method1646(local1384);
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(III)V")
	public static void method1493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static275.aClass8ArrayArrayArray4[0][arg1][arg2] != null && Static275.aClass8ArrayArrayArray4[0][arg1][arg2].aClass8_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static275.aClass8ArrayArrayArray4[local22][arg1][arg2] == null) {
				@Pc(46) Class8 local46 = Static275.aClass8ArrayArrayArray4[local22][arg1][arg2] = new Class8(local22, arg1, arg2);
				if (local20) {
					local46.aByte7++;
				}
			}
		}
	}
}
