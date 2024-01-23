import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "Lclient!gn;")
	public static Class66 aClass66_1;

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
	public static int anInt1255;

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "[I")
	public static int[] anIntArray117 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString43 = null;

	@OriginalMember(owner = "client!dd", name = "j", descriptor = "[I")
	public static int[] anIntArray118 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI)Lclient!rj;")
	public static Class139 method942(@OriginalArg(1) int arg0) {
		@Pc(10) Class139 local10 = (Class139) Static263.aClass155_43.method4358((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(30) byte[] local30 = Static189.aClass83_130.method2306(Static252.method4307(arg0), Static178.method3239(arg0));
		local10 = new Class139();
		local10.anInt5098 = arg0;
		if (local30 != null) {
			local10.method4028(new Class1_Sub16(local30));
		}
		Static263.aClass155_43.method4360((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIZII)V")
	public static void method943(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 < 128 || arg4 < 128 || arg5 > 13056 || arg4 > 13056) {
			Static25.anInt512 = -1;
			Static22.anInt480 = -1;
			return;
		}
		@Pc(36) int local36 = Static220.method3905(arg5, arg4, Static145.anInt3477) - arg0;
		@Pc(40) int local40 = arg5 - Static229.anInt5072;
		@Pc(44) int local44 = arg4 - Static157.anInt3612;
		@Pc(48) int local48 = Class91.anIntArray319[Static38.anInt1151];
		@Pc(52) int local52 = Class91.anIntArray319[Static97.anInt6055];
		@Pc(56) int local56 = Class91.anIntArray320[Static38.anInt1151];
		@Pc(60) int local60 = local36 - Static48.anInt1350;
		@Pc(64) int local64 = Class91.anIntArray320[Static97.anInt6055];
		@Pc(79) int local79 = local40 * local64 + local52 * local44 >> 16;
		@Pc(89) int local89 = local44 * local64 - local52 * local40 >> 16;
		@Pc(91) int local91 = local79;
		@Pc(102) int local102 = local56 * local60 - local48 * local89 >> 16;
		@Pc(112) int local112 = local48 * local60 + local89 * local56 >> 16;
		if (local112 < 50) {
			Static22.anInt480 = -1;
			Static25.anInt512 = -1;
		} else if (Static296.aBoolean335) {
			@Pc(143) int local143 = arg1 * 512 >> 8;
			Static22.anInt480 = arg6 + local91 * local143 / local112;
			@Pc(158) int local158 = arg3 * 512 >> 8;
			Static25.anInt512 = local158 * local102 / local112 + arg2;
		} else {
			Static25.anInt512 = arg2 + (local102 << 9) / local112;
			Static22.anInt480 = (local91 << 9) / local112 + arg6;
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
	public static void method945() {
		if (Static179.anInt4031 > 0) {
			Static179.anInt4031--;
		}
		if (Static59.anInt1532 > 1) {
			Static80.anInt1915 = Static27.anInt754;
			Static59.anInt1532--;
		}
		if (Static208.aBoolean245) {
			Static208.aBoolean245 = false;
			Static104.method835();
			return;
		}
		@Pc(33) int local33;
		for (local33 = 0; local33 < 100 && Static264.method4488(); local33++) {
		}
		if (Static279.anInt5968 != 30) {
			return;
		}
		Static95.method1641(Static81.aClass1_Sub16_Sub1_1);
		@Pc(57) Object local57 = Static173.aClass115_1.anObject6;
		@Pc(83) int local83;
		@Pc(92) int local92;
		@Pc(111) int local111;
		@Pc(116) int local116;
		@Pc(133) boolean local133;
		@Pc(194) int local194;
		@Pc(201) int local201;
		synchronized (Static173.aClass115_1.anObject6) {
			if (!Static209.aBoolean247) {
				Static173.aClass115_1.anInt4252 = 0;
			} else if (Static242.anInt5298 != 0 || Static173.aClass115_1.anInt4252 >= 40) {
				Static81.aClass1_Sub16_Sub1_1.method2676(95);
				local83 = 0;
				Static81.aClass1_Sub16_Sub1_1.method2621(0);
				@Pc(90) int local90 = Static81.aClass1_Sub16_Sub1_1.anInt3328;
				for (local92 = 0; Static173.aClass115_1.anInt4252 > local92 && Static81.aClass1_Sub16_Sub1_1.anInt3328 - local90 < 240; local92++) {
					local83++;
					local111 = Static173.aClass115_1.anIntArray384[local92];
					local116 = Static173.aClass115_1.anIntArray385[local92];
					if (local116 < 0) {
						local116 = 0;
					} else if (local116 > 65534) {
						local116 = 65534;
					}
					local133 = false;
					if (local111 < 0) {
						local111 = 0;
					} else if (local111 > 65534) {
						local111 = 65534;
					}
					if (Static173.aClass115_1.anIntArray384[local92] == -1 && Static173.aClass115_1.anIntArray385[local92] == -1) {
						local116 = -1;
						local111 = -1;
						local133 = true;
					}
					if (Static165.anInt3787 != local116 || local111 != Static179.anInt4034) {
						local194 = local116 - Static165.anInt3787;
						Static165.anInt3787 = local116;
						local201 = local111 - Static179.anInt4034;
						Static179.anInt4034 = local111;
						if (Static62.anInt1585 < 8 && local194 >= -32 && local194 <= 31 && local201 >= -32 && local201 <= 31) {
							local201 += 32;
							local194 += 32;
							Static81.aClass1_Sub16_Sub1_1.method2624((local194 << 6) + (Static62.anInt1585 << 12) + local201);
							Static62.anInt1585 = 0;
						} else if (Static62.anInt1585 < 32 && local194 >= -128 && local194 <= 127 && local201 >= -128 && local201 <= 127) {
							Static81.aClass1_Sub16_Sub1_1.method2621(Static62.anInt1585 + 128);
							local201 += 128;
							local194 += 128;
							Static81.aClass1_Sub16_Sub1_1.method2624(local201 + (local194 << 8));
							Static62.anInt1585 = 0;
						} else if (Static62.anInt1585 >= 32) {
							Static81.aClass1_Sub16_Sub1_1.method2624(Static62.anInt1585 + 57344);
							if (local133) {
								Static81.aClass1_Sub16_Sub1_1.method2606(Integer.MIN_VALUE);
							} else {
								Static81.aClass1_Sub16_Sub1_1.method2606(local116 | local111 << 16);
							}
							Static62.anInt1585 = 0;
						} else {
							Static81.aClass1_Sub16_Sub1_1.method2621(Static62.anInt1585 + 192);
							if (local133) {
								Static81.aClass1_Sub16_Sub1_1.method2606(Integer.MIN_VALUE);
							} else {
								Static81.aClass1_Sub16_Sub1_1.method2606(local111 << 16 | local116);
							}
							Static62.anInt1585 = 0;
						}
					} else if (Static62.anInt1585 < 2047) {
						Static62.anInt1585++;
					}
				}
				Static81.aClass1_Sub16_Sub1_1.method2627(Static81.aClass1_Sub16_Sub1_1.anInt3328 - local90);
				if (local83 >= Static173.aClass115_1.anInt4252) {
					Static173.aClass115_1.anInt4252 = 0;
				} else {
					Static173.aClass115_1.anInt4252 -= local83;
					for (local92 = 0; local92 < Static173.aClass115_1.anInt4252; local92++) {
						Static173.aClass115_1.anIntArray385[local92] = Static173.aClass115_1.anIntArray385[local83 + local92];
						Static173.aClass115_1.anIntArray384[local92] = Static173.aClass115_1.anIntArray384[local83 + local92];
					}
				}
			}
		}
		@Pc(471) byte local471;
		if (Static242.anInt5298 != 0) {
			@Pc(423) long local423 = (Static181.aLong142 - Static165.aLong133) / 50L;
			local83 = Static279.anInt5967;
			if (local83 < 0) {
				local83 = 0;
			} else if (local83 > 65535) {
				local83 = 65535;
			}
			Static165.aLong133 = Static181.aLong142;
			local92 = Static182.anInt4419;
			if (local423 > 32767L) {
				local423 = 32767L;
			}
			if (local92 < 0) {
				local92 = 0;
			} else if (local92 > 65535) {
				local92 = 65535;
			}
			local116 = (int) local423;
			local471 = 0;
			if (Static242.anInt5298 == 2) {
				local471 = 1;
			}
			Static81.aClass1_Sub16_Sub1_1.method2676(81);
			Static81.aClass1_Sub16_Sub1_1.method2651(local83 << 16 | local92);
			Static81.aClass1_Sub16_Sub1_1.method2657(local116 | local471 << 15);
		}
		if (Static106.anInt2271 > 0) {
			Static106.anInt2271--;
		}
		if (Static37.aBoolean69 && Static106.anInt2271 <= 0) {
			Static37.aBoolean69 = false;
			Static106.anInt2271 = 20;
			Static81.aClass1_Sub16_Sub1_1.method2676(61);
			Static81.aClass1_Sub16_Sub1_1.method2617((int) Static25.aFloat19);
			Static81.aClass1_Sub16_Sub1_1.method2657((int) Static125.aFloat97);
		}
		if (Static76.aBoolean290 && !Static73.aBoolean98) {
			Static73.aBoolean98 = true;
			Static81.aClass1_Sub16_Sub1_1.method2676(122);
			Static81.aClass1_Sub16_Sub1_1.method2621(1);
		}
		if (!Static76.aBoolean290 && Static73.aBoolean98) {
			Static73.aBoolean98 = false;
			Static81.aClass1_Sub16_Sub1_1.method2676(122);
			Static81.aClass1_Sub16_Sub1_1.method2621(0);
		}
		if (!Static134.aBoolean153) {
			Static81.aClass1_Sub16_Sub1_1.method2676(77);
			Static81.aClass1_Sub16_Sub1_1.method2651(Static107.method1746());
			Static134.aBoolean153 = true;
		}
		if (Static102.aBoolean119) {
			Static102.aBoolean119 = false;
		} else {
			Static18.aFloat18 /= 2.0F;
		}
		if (Static283.aBoolean322) {
			Static283.aBoolean322 = false;
		} else {
			Static279.aFloat196 /= 2.0F;
		}
		Static35.method729();
		if (Static279.anInt5968 != 30) {
			return;
		}
		Static190.method3395();
		Static189.method3382();
		Static77.method1529();
		Static270.anInt5842++;
		if (Static270.anInt5842 > 750) {
			Static104.method835();
			return;
		}
		Static259.method4402();
		Static94.method4777();
		Static50.method1053();
		if (Static236.aClass116_15 != null) {
			Static62.method1209();
		}
		for (local33 = Static188.method3368(true); local33 != -1; local33 = Static188.method3368(false)) {
			Static75.method1380(local33);
			Static252.anIntArray557[Static141.anInt3237++ & 0x1F] = local33;
		}
		@Pc(877) int local877;
		for (@Pc(688) Class1_Sub2_Sub6 local688 = Static78.method1414(); local688 != null; local688 = Static78.method1414()) {
			local92 = local688.method1196();
			local111 = local688.method1195();
			if (local92 == 1) {
				Static152.anIntArray325[local111] = local688.anInt1565;
				Static156.anIntArray329[Static258.anInt5644++ & 0x1F] = local111;
			} else if (local92 == 2) {
				Static4.aStringArray1[local111] = local688.aString50;
				Static238.anIntArray540[Static289.anInt6095++ & 0x1F] = local111;
			} else {
				@Pc(757) Class116 local757;
				if (local92 == 3) {
					local757 = Static115.method1897(local111);
					if (!local688.aString50.equals(local757.aString127)) {
						local757.aString127 = local688.aString50;
						Static189.method3378(local757);
					}
				} else if (local92 == 4) {
					local757 = Static115.method1897(local111);
					local877 = local688.anInt1565;
					local194 = local688.anInt1558;
					local201 = local688.anInt1557;
					if (local757.anInt4382 != local877 || local194 != local757.anInt4385 || local201 != local757.anInt4343) {
						local757.anInt4343 = local201;
						local757.anInt4382 = local877;
						local757.anInt4385 = local194;
						Static189.method3378(local757);
					}
				} else if (local92 == 5) {
					local757 = Static115.method1897(local111);
					if (local688.anInt1565 != local757.anInt4367 || local688.anInt1565 == -1) {
						local757.anInt4369 = 0;
						local757.anInt4367 = local688.anInt1565;
						local757.anInt4374 = 0;
						local757.anInt4380 = 1;
						Static189.method3378(local757);
					}
				} else if (local92 == 6) {
					local116 = local688.anInt1565;
					local877 = local116 >> 10 & 0x1F;
					local194 = local116 >> 5 & 0x1F;
					local201 = local116 & 0x1F;
					@Pc(1108) Class116 local1108 = Static115.method1897(local111);
					@Pc(1120) int local1120 = (local201 << 3) + (local194 << 11) + (local877 << 19);
					if (local1108.anInt4294 != local1120) {
						local1108.anInt4294 = local1120;
						Static189.method3378(local1108);
					}
				} else if (local92 == 7) {
					local757 = Static115.method1897(local111);
					local133 = local688.anInt1565 == 1;
					if (local133 != local757.aBoolean228) {
						local757.aBoolean228 = local133;
						Static189.method3378(local757);
					}
				} else if (local92 == 8) {
					local757 = Static115.method1897(local111);
					if (local757.anInt4362 != local688.anInt1565 || local688.anInt1558 != local757.anInt4361 || local688.anInt1557 != local757.anInt4291) {
						local757.anInt4361 = local688.anInt1558;
						local757.anInt4291 = local688.anInt1557;
						if (local757.anInt4356 != -1) {
							if (local757.anInt4353 > 0) {
								local757.anInt4291 = local757.anInt4291 * 32 / local757.anInt4353;
							} else if (local757.anInt4292 > 0) {
								local757.anInt4291 = local757.anInt4291 * 32 / local757.anInt4292;
							}
						}
						local757.anInt4362 = local688.anInt1565;
						Static189.method3378(local757);
					}
				} else if (local92 == 9) {
					local757 = Static115.method1897(local111);
					if (local688.anInt1565 != local757.anInt4356 || local688.anInt1558 != local757.anInt4338) {
						local757.anInt4356 = local688.anInt1565;
						local757.anInt4338 = local688.anInt1558;
						Static189.method3378(local757);
					}
				} else if (local92 == 10) {
					local757 = Static115.method1897(local111);
					if (local757.anInt4350 != local688.anInt1565 || local688.anInt1558 != local757.anInt4331 || local688.anInt1557 != local757.anInt4330) {
						local757.anInt4350 = local688.anInt1565;
						local757.anInt4331 = local688.anInt1558;
						local757.anInt4330 = local688.anInt1557;
						Static189.method3378(local757);
					}
				} else if (local92 == 11) {
					local757 = Static115.method1897(local111);
					local757.anInt4371 = local757.anInt4325 = local688.anInt1558;
					local757.aByte12 = 0;
					local757.aByte14 = 0;
					local757.anInt4366 = local757.anInt4329 = local688.anInt1565;
					Static189.method3378(local757);
				} else if (local92 == 12) {
					local757 = Static115.method1897(local111);
					local877 = local688.anInt1565;
					if (local757 != null && local757.anInt4376 == 0) {
						if (local877 > local757.anInt4320 - local757.anInt4363) {
							local877 = local757.anInt4320 - local757.anInt4363;
						}
						if (local877 < 0) {
							local877 = 0;
						}
						if (local877 != local757.anInt4307) {
							local757.anInt4307 = local877;
							Static189.method3378(local757);
						}
					}
				} else if (local92 == 13) {
					local757 = Static115.method1897(local111);
					local757.anInt4354 = local688.anInt1565;
				}
			}
		}
		if (Static71.anInt1771 != 0) {
			Static152.anInt3537 += 20;
			if (Static152.anInt3537 >= 400) {
				Static71.anInt1771 = 0;
			}
		}
		Static112.anInt2417++;
		if (Static63.aClass116_3 != null) {
			Static37.anInt1132++;
			if (Static37.anInt1132 >= 15) {
				Static189.method3378(Static63.aClass116_3);
				Static63.aClass116_3 = null;
			}
		}
		@Pc(1322) Class116 local1322;
		if (Static117.aClass116_7 != null) {
			Static189.method3378(Static117.aClass116_7);
			Static169.anInt3855++;
			if (Static213.anInt4721 + 5 < Static84.anInt1989 || Static213.anInt4721 - 5 > Static84.anInt1989 || Static212.anInt4711 > Static1.anInt74 + 5 || Static1.anInt74 - 5 > Static212.anInt4711) {
				Static128.aBoolean147 = true;
			}
			if (Static224.anInt4947 == 0) {
				if (Static128.aBoolean147 && Static169.anInt3855 >= 5) {
					if (Static227.aClass116_14 == Static117.aClass116_7 && Static289.anInt6097 != Static219.anInt4895) {
						local1322 = Static117.aClass116_7;
						local471 = 0;
						if (Static148.anInt3503 == 1 && local1322.anInt4301 == 206) {
							local471 = 1;
						}
						if (local1322.anIntArray404[Static289.anInt6097] <= 0) {
							local471 = 0;
						}
						if (Static37.method866(local1322).method1100()) {
							local877 = Static289.anInt6097;
							local116 = Static219.anInt4895;
							local1322.anIntArray404[local877] = local1322.anIntArray404[local116];
							local1322.anIntArray397[local877] = local1322.anIntArray397[local116];
							local1322.anIntArray404[local116] = -1;
							local1322.anIntArray397[local116] = 0;
						} else if (local471 == 1) {
							local116 = Static219.anInt4895;
							local877 = Static289.anInt6097;
							while (local116 != local877) {
								if (local877 < local116) {
									local1322.method3423(local116, local116 - 1);
									local116--;
								} else if (local116 < local877) {
									local1322.method3423(local116, local116 + 1);
									local116++;
								}
							}
						} else {
							local1322.method3423(Static219.anInt4895, Static289.anInt6097);
						}
						Static81.aClass1_Sub16_Sub1_1.method2676(11);
						Static81.aClass1_Sub16_Sub1_1.method2624(Static219.anInt4895);
						Static81.aClass1_Sub16_Sub1_1.method2626(local471);
						Static81.aClass1_Sub16_Sub1_1.method2638(Static117.aClass116_7.anInt4290);
						Static81.aClass1_Sub16_Sub1_1.method2624(Static289.anInt6097);
					}
				} else if ((Static82.anInt1966 == 1 || Static161.method3006(Static111.anInt2398 - 1)) && Static111.anInt2398 > 2) {
					Static35.method730();
				} else if (Static111.anInt2398 > 0) {
					Static259.method4399();
				}
				Static242.anInt5298 = 0;
				Static117.aClass116_7 = null;
				Static37.anInt1132 = 10;
			}
		}
		Static14.anInt379 = 0;
		local1322 = Static110.aClass116_6;
		Static110.aClass116_6 = null;
		Static157.aClass116_9 = null;
		@Pc(1486) Class116 local1486 = Static87.aClass116_4;
		Static87.aClass116_4 = null;
		Static228.aBoolean273 = false;
		Static270.aBoolean307 = false;
		while (Static223.method935() && Static14.anInt379 < 128) {
			Static292.anIntArray610[Static14.anInt379] = Static1.anInt77;
			Static101.anIntArray272[Static14.anInt379] = Static81.aChar1;
			Static14.anInt379++;
		}
		Static236.aClass116_15 = null;
		if (Static194.anInt4389 != -1) {
			Static181.method3282(0, 0, Static144.anInt3368, Static194.anInt4389, 0, Static193.anInt4370, 0);
		}
		Static27.anInt754++;
		while (true) {
			@Pc(1553) Class116 local1553;
			@Pc(1543) Class116 local1543;
			@Pc(1535) Class1_Sub27 local1535;
			do {
				local1535 = (Class1_Sub27) Static281.aClass131_26.method3798();
				if (local1535 == null) {
					while (true) {
						do {
							local1535 = (Class1_Sub27) Static227.aClass131_15.method3798();
							if (local1535 == null) {
								while (true) {
									do {
										local1535 = (Class1_Sub27) Static131.aClass131_7.method3798();
										if (local1535 == null) {
											if (Static236.aClass116_15 == null) {
												Static176.anInt3982 = 0;
											}
											if (Static204.aClass116_11 != null) {
												Static65.method324();
											}
											if (Static76.anInt5428 > 0 && Static35.aBooleanArray2[82] && Static35.aBooleanArray2[81] && Static161.anInt3716 != 0) {
												local116 = Static145.anInt3477 - Static161.anInt3716;
												if (local116 < 0) {
													local116 = 0;
												} else if (local116 > 3) {
													local116 = 3;
												}
												Static200.method2870(local116, Static82.anInt1972 + Static239.aClass25_Sub1_Sub1_2.anIntArray172[0], Static239.aClass25_Sub1_Sub1_2.anIntArray173[0] + Static266.anInt5790);
											}
											if (Static76.anInt5428 > 0 && Static35.aBooleanArray2[82] && Static35.aBooleanArray2[81]) {
												if (Static62.anInt1579 != -1) {
													Static200.method2870(Static145.anInt3477, Static82.anInt1972 + Static62.anInt1579, Static32.anInt822 + Static266.anInt5790);
												}
												Static177.anInt3987 = 0;
												Static112.anInt2415 = 0;
											} else if (Static112.anInt2415 == 2) {
												if (Static62.anInt1579 != -1) {
													Static81.aClass1_Sub16_Sub1_1.method2676(147);
													Static81.aClass1_Sub16_Sub1_1.method2624(Static62.anInt1579 + Static82.anInt1972);
													Static81.aClass1_Sub16_Sub1_1.method2651(Static148.anInt3504);
													Static81.aClass1_Sub16_Sub1_1.method2657(Static19.anInt461);
													Static81.aClass1_Sub16_Sub1_1.method2657(Static32.anInt822 + Static266.anInt5790);
													Static90.anInt2099 = Static279.anInt5967;
													Static88.anInt2054 = Static182.anInt4419;
													Static71.anInt1771 = 1;
													Static152.anInt3537 = 0;
												}
												Static112.anInt2415 = 0;
											} else if (Static177.anInt3987 == 2) {
												if (Static62.anInt1579 != -1) {
													Static81.aClass1_Sub16_Sub1_1.method2676(161);
													Static81.aClass1_Sub16_Sub1_1.method2615(Static82.anInt1972 + Static62.anInt1579);
													Static81.aClass1_Sub16_Sub1_1.method2615(Static32.anInt822 + Static266.anInt5790);
													Static90.anInt2099 = Static279.anInt5967;
													Static152.anInt3537 = 0;
													Static88.anInt2054 = Static182.anInt4419;
													Static71.anInt1771 = 1;
												}
												Static177.anInt3987 = 0;
											} else if (Static62.anInt1579 != -1 && Static112.anInt2415 == 0 && Static177.anInt3987 == 0) {
												Static101.method2280(0, (Static32.anInt822 << 1) + 1 - Static239.aClass25_Sub1_Sub1_2.method1243() >> 1, (Static62.anInt1579 << 1) + 1 - Static239.aClass25_Sub1_Sub1_2.method1243() >> 1);
												Static90.anInt2099 = Static279.anInt5967;
												Static88.anInt2054 = Static182.anInt4419;
												Static152.anInt3537 = 0;
												Static71.anInt1771 = 1;
											}
											Static62.anInt1579 = -1;
											Static290.method4733();
											if (local1322 != Static110.aClass116_6) {
												if (local1322 != null) {
													Static189.method3378(local1322);
												}
												if (Static110.aClass116_6 != null) {
													Static189.method3378(Static110.aClass116_6);
												}
											}
											if (Static87.aClass116_4 != local1486 && Static15.anInt401 == Static98.anInt2196) {
												if (local1486 != null) {
													Static189.method3378(local1486);
												}
												if (Static87.aClass116_4 != null) {
													Static189.method3378(Static87.aClass116_4);
												}
											}
											if (Static87.aClass116_4 == null) {
												if (Static15.anInt401 > 0) {
													Static15.anInt401--;
												}
											} else if (Static98.anInt2196 > Static15.anInt401) {
												Static15.anInt401++;
												if (Static15.anInt401 == Static98.anInt2196) {
													Static189.method3378(Static87.aClass116_4);
												}
											}
											for (local116 = 0; local116 < 5; local116++) {
												@Pc(1984) int local1984 = Static261.anIntArray568[local116]++;
											}
											local116 = Static150.method1230();
											local877 = Static77.method1527();
											if (local116 > 15000 && local877 > 15000) {
												Static179.anInt4031 = 250;
												Static79.method1419(14500);
												Static81.aClass1_Sub16_Sub1_1.method2676(106);
											}
											if (Static178.aClass43_6 != null && Static178.aClass43_6.anInt1456 == 1) {
												if (Static178.aClass43_6.anObject3 != null) {
													Static277.method4609(Static241.aString166, Static107.aBoolean124);
												}
												Static241.aString166 = null;
												Static107.aBoolean124 = false;
												Static178.aClass43_6 = null;
											}
											Static219.anInt4902++;
											Static282.anInt6026++;
											if (Static282.anInt6026 > 500) {
												Static282.anInt6026 = 0;
												local194 = (int) (Math.random() * 8.0D);
												if ((local194 & 0x2) == 2) {
													Static23.anInt483 += Static204.anInt4542;
												}
												if ((local194 & 0x4) == 4) {
													Static136.anInt3074 += Static232.anInt5141;
												}
												if ((local194 & 0x1) == 1) {
													Static52.anInt1393 += Static142.anInt3248;
												}
											}
											if (Static136.anInt3074 < -40) {
												Static232.anInt5141 = 1;
											}
											if (Static136.anInt3074 > 40) {
												Static232.anInt5141 = -1;
											}
											Static136.anInt3082++;
											if (Static23.anInt483 < -55) {
												Static204.anInt4542 = 2;
											}
											if (Static23.anInt483 > 55) {
												Static204.anInt4542 = -2;
											}
											if (Static52.anInt1393 < -50) {
												Static142.anInt3248 = 2;
											}
											if (Static52.anInt1393 > 50) {
												Static142.anInt3248 = -2;
											}
											if (Static219.anInt4902 > 500) {
												local194 = (int) (Math.random() * 8.0D);
												Static219.anInt4902 = 0;
												if ((local194 & 0x1) == 1) {
													Static59.anInt1529 += Static146.anInt3483;
												}
												if ((local194 & 0x2) == 2) {
													Static16.anInt453 += Static65.anInt405;
												}
											}
											if (Static16.anInt453 < -20) {
												Static65.anInt405 = 1;
											}
											if (Static16.anInt453 > 10) {
												Static65.anInt405 = -1;
											}
											if (Static59.anInt1529 < -60) {
												Static146.anInt3483 = 2;
											}
											if (Static59.anInt1529 > 60) {
												Static146.anInt3483 = -2;
											}
											if (Static136.anInt3082 > 50) {
												Static81.aClass1_Sub16_Sub1_1.method2676(251);
											}
											if (Static163.aBoolean249) {
												Static97.method4688();
												Static163.aBoolean249 = false;
											}
											try {
												if (Static22.aClass41_1 != null && Static81.aClass1_Sub16_Sub1_1.anInt3328 > 0) {
													Static22.aClass41_1.method1068(Static81.aClass1_Sub16_Sub1_1.aByteArray39, Static81.aClass1_Sub16_Sub1_1.anInt3328);
													Static81.aClass1_Sub16_Sub1_1.anInt3328 = 0;
													Static136.anInt3082 = 0;
												}
											} catch (@Pc(2237) IOException local2237) {
												Static104.method835();
											}
											return;
										}
										local1543 = local1535.aClass116_13;
										if (local1543.anInt4297 < 0) {
											break;
										}
										local1553 = Static115.method1897(local1543.anInt4344);
									} while (local1553 == null || local1553.aClass116Array1 == null || local1553.aClass116Array1.length <= local1543.anInt4297 || local1553.aClass116Array1[local1543.anInt4297] != local1543);
									Static22.method392(local1535);
								}
							}
							local1543 = local1535.aClass116_13;
							if (local1543.anInt4297 < 0) {
								break;
							}
							local1553 = Static115.method1897(local1543.anInt4344);
						} while (local1553 == null || local1553.aClass116Array1 == null || local1553.aClass116Array1.length <= local1543.anInt4297 || local1543 != local1553.aClass116Array1[local1543.anInt4297]);
						Static22.method392(local1535);
					}
				}
				local1543 = local1535.aClass116_13;
				if (local1543.anInt4297 < 0) {
					break;
				}
				local1553 = Static115.method1897(local1543.anInt4344);
			} while (local1553 == null || local1553.aClass116Array1 == null || local1543.anInt4297 >= local1553.aClass116Array1.length || local1543 != local1553.aClass116Array1[local1543.anInt4297]);
			Static22.method392(local1535);
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)V")
	public static void method946(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static229.anInt5072;
		@Pc(3) int local3 = Static48.anInt1350;
		@Pc(9) int local9 = Static157.anInt3612;
		@Pc(11) int local11 = Static97.anInt6055;
		@Pc(13) int local13 = Static38.anInt1151;
		@Pc(20) int local20 = Static136.anInt3074 + (int) Static125.aFloat97 & 0x7FF;
		@Pc(23) int local23 = (int) Static25.aFloat19;
		if (local23 < Static130.anInt2885 / 256) {
			local23 = Static130.anInt2885 / 256;
		}
		if (Static233.aBooleanArray22[4] && local23 < Static255.anIntArray559[4] + 128) {
			local23 = Static255.anIntArray559[4] + 128;
		}
		Static32.method662(local20, Static148.anInt3505, Static220.method3905(Static239.aClass25_Sub1_Sub1_2.anInt1635, Static239.aClass25_Sub1_Sub1_2.anInt1604, Static145.anInt3477) - 50, local23 * 3 + 600, local23, arg0, Static251.anInt5460);
		if (Static229.anInt5072 == local1 && Static48.anInt1350 == local3 && Static157.anInt3612 == local9 && Static38.anInt1151 == local13 && Static97.anInt6055 == local11) {
			Static280.anInt5999 = 1;
			return;
		}
		Static254.anInt5407 = 10;
		Static243.anInt5324 = 10;
		Static289.anInt6096 = 10;
		if (local13 < Static38.anInt1151) {
			local13 += Static289.anInt6096 + (Static38.anInt1151 - local13) * Static254.anInt5407 / 1000;
			if (local13 < Static38.anInt1151) {
				Static38.anInt1151 = local13;
			}
		}
		Static178.anInt4008 = 10;
		if (local13 > Static38.anInt1151) {
			local13 -= (local13 - Static38.anInt1151) * Static254.anInt5407 / 1000 + Static289.anInt6096;
			if (Static38.anInt1151 < local13) {
				Static38.anInt1151 = local13;
			}
		}
		if (local3 < Static48.anInt1350) {
			local3 += (Static48.anInt1350 - local3) * Static243.anInt5324 / 1000 + Static178.anInt4008;
			if (Static48.anInt1350 > local3) {
				Static48.anInt1350 = local3;
			}
		}
		if (local3 > Static48.anInt1350) {
			local3 -= (local3 - Static48.anInt1350) * Static243.anInt5324 / 1000 + Static178.anInt4008;
			if (local3 > Static48.anInt1350) {
				Static48.anInt1350 = local3;
			}
		}
		if (Static157.anInt3612 > local9) {
			local9 += Static243.anInt5324 * (Static157.anInt3612 - local9) / 1000 + Static178.anInt4008;
			if (local9 < Static157.anInt3612) {
				Static157.anInt3612 = local9;
			}
		}
		@Pc(250) int local250 = Static97.anInt6055 - local11;
		if (local250 > 1024) {
			local250 -= 2048;
		}
		if (local9 > Static157.anInt3612) {
			local9 -= Static178.anInt4008 + (local9 - Static157.anInt3612) * Static243.anInt5324 / 1000;
			if (Static157.anInt3612 < local9) {
				Static157.anInt3612 = local9;
			}
		}
		if (local250 < -1024) {
			local250 += 2048;
		}
		if (local250 > 0) {
			local11 += Static289.anInt6096 + local250 * Static254.anInt5407 / 1000;
			local11 &= 0x7FF;
		}
		if (local250 < 0) {
			local11 -= Static289.anInt6096 + Static254.anInt5407 * -local250 / 1000;
			local11 &= 0x7FF;
		}
		@Pc(332) int local332 = Static97.anInt6055 - local11;
		if (Static229.anInt5072 > local1) {
			local1 += (Static229.anInt5072 - local1) * Static243.anInt5324 / 1000 + Static178.anInt4008;
			if (local1 < Static229.anInt5072) {
				Static229.anInt5072 = local1;
			}
		}
		if (local1 > Static229.anInt5072) {
			local1 -= Static178.anInt4008 + Static243.anInt5324 * (local1 - Static229.anInt5072) / 1000;
			if (Static229.anInt5072 < local1) {
				Static229.anInt5072 = local1;
			}
		}
		if (local332 > 1024) {
			local332 -= 2048;
		}
		if (local332 < -1024) {
			local332 += 2048;
		}
		if (local332 >= 0 || local250 <= 0 || local332 > 0 && local250 < 0) {
			Static97.anInt6055 = local11;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
	public static void method947() {
		Static280.aClass116Array2 = null;
		Static257.method4355(0, 0, Static193.anInt4370, -1, Static144.anInt3368, 0, Static194.anInt4389, 0);
		if (Static280.aClass116Array2 != null) {
			Static189.method3384(Static63.anInt1591, Static280.aClass116Array2, Static193.anInt4370, Static143.aClass116_8.anInt4357, Static218.anInt4883, 0, -1412584499, Static144.anInt3368, 0);
			Static280.aClass116Array2 = null;
		}
	}
}
