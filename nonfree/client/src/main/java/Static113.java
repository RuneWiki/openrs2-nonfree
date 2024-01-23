import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "Lclient!fe;")
	public static Class54 aClass54_1;

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "[I")
	public static int[] anIntArray166 = new int[100];

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
	public static int anInt2429 = 0;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(BI)V")
	public static void method2084(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub3_Sub16 local12 = Static119.method2204(arg0, 6);
		local12.method2719();
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method2085(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static108.method2003("%0a", arg0, "\n"));
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)Z")
	public static boolean method2086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static21.anInt518; local1++) {
			@Pc(8) Class58 local8 = Static47.aClass58Array1[local1];
			@Pc(17) int local17;
			@Pc(29) int local29;
			@Pc(39) int local39;
			@Pc(49) int local49;
			@Pc(59) int local59;
			if (local8.anInt1643 == 1) {
				local17 = local8.anInt1639 - arg0;
				if (local17 > 0) {
					local29 = local8.anInt1626 + (local8.anInt1631 * local17 >> 8);
					local39 = local8.anInt1637 + (local8.anInt1623 * local17 >> 8);
					local49 = local8.anInt1642 + (local8.anInt1634 * local17 >> 8);
					local59 = local8.anInt1633 + (local8.anInt1636 * local17 >> 8);
					if (arg2 >= local29 && arg2 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt1643 == 2) {
				local17 = arg0 - local8.anInt1639;
				if (local17 > 0) {
					local29 = local8.anInt1626 + (local8.anInt1631 * local17 >> 8);
					local39 = local8.anInt1637 + (local8.anInt1623 * local17 >> 8);
					local49 = local8.anInt1642 + (local8.anInt1634 * local17 >> 8);
					local59 = local8.anInt1633 + (local8.anInt1636 * local17 >> 8);
					if (arg2 >= local29 && arg2 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt1643 == 3) {
				local17 = local8.anInt1626 - arg2;
				if (local17 > 0) {
					local29 = local8.anInt1639 + (local8.anInt1630 * local17 >> 8);
					local39 = local8.anInt1635 + (local8.anInt1632 * local17 >> 8);
					local49 = local8.anInt1642 + (local8.anInt1634 * local17 >> 8);
					local59 = local8.anInt1633 + (local8.anInt1636 * local17 >> 8);
					if (arg0 >= local29 && arg0 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt1643 == 4) {
				local17 = arg2 - local8.anInt1626;
				if (local17 > 0) {
					local29 = local8.anInt1639 + (local8.anInt1630 * local17 >> 8);
					local39 = local8.anInt1635 + (local8.anInt1632 * local17 >> 8);
					local49 = local8.anInt1642 + (local8.anInt1634 * local17 >> 8);
					local59 = local8.anInt1633 + (local8.anInt1636 * local17 >> 8);
					if (arg0 >= local29 && arg0 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt1643 == 5) {
				local17 = arg1 - local8.anInt1642;
				if (local17 > 0) {
					local29 = local8.anInt1639 + (local8.anInt1630 * local17 >> 8);
					local39 = local8.anInt1635 + (local8.anInt1632 * local17 >> 8);
					local49 = local8.anInt1626 + (local8.anInt1631 * local17 >> 8);
					local59 = local8.anInt1637 + (local8.anInt1623 * local17 >> 8);
					if (arg0 >= local29 && arg0 <= local39 && arg2 >= local49 && arg2 <= local59) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V")
	public static void method2088() {
		if (Static277.anInt5762 > 1) {
			Static277.anInt5762--;
			Static250.anInt4981 = Static13.anInt334;
		}
		if (Static161.anInt3399 > 0) {
			Static161.anInt3399--;
		}
		if (Static47.aBoolean83) {
			Static47.aBoolean83 = false;
			Static75.method1375();
			return;
		}
		@Pc(34) int local34;
		for (local34 = 0; local34 < 100 && Static134.method2327(); local34++) {
		}
		if (Static236.anInt4804 != 30) {
			return;
		}
		Static37.method723(Static95.aClass2_Sub26_Sub1_1);
		@Pc(59) Object local59 = aClass54_1.anObject3;
		@Pc(75) int local75;
		@Pc(88) int local88;
		@Pc(113) int local113;
		@Pc(118) int local118;
		@Pc(195) int local195;
		@Pc(202) int local202;
		synchronized (aClass54_1.anObject3) {
			if (!Static233.aBoolean406) {
				aClass54_1.anInt1512 = 0;
			} else if (Static246.anInt5126 != 0 || aClass54_1.anInt1512 >= 40) {
				local75 = 0;
				Static95.aClass2_Sub26_Sub1_1.method4287(130);
				Static95.aClass2_Sub26_Sub1_1.method4239(0);
				@Pc(86) int local86 = Static95.aClass2_Sub26_Sub1_1.anInt5328;
				for (local88 = 0; aClass54_1.anInt1512 > local88 && Static95.aClass2_Sub26_Sub1_1.anInt5328 - local86 < 240; local88++) {
					local75++;
					local113 = aClass54_1.anIntArray113[local88];
					local118 = aClass54_1.anIntArray112[local88];
					if (local118 < 0) {
						local118 = 0;
					} else if (local118 > 65534) {
						local118 = 65534;
					}
					if (local113 < 0) {
						local113 = 0;
					} else if (local113 > 65534) {
						local113 = 65534;
					}
					@Pc(147) boolean local147 = false;
					if (aClass54_1.anIntArray113[local88] == -1 && aClass54_1.anIntArray112[local88] == -1) {
						local118 = -1;
						local113 = -1;
						local147 = true;
					}
					if (Static51.anInt1199 != local118 || local113 != Static27.anInt580) {
						local195 = local118 - Static51.anInt1199;
						Static51.anInt1199 = local118;
						local202 = local113 - Static27.anInt580;
						Static27.anInt580 = local113;
						if (Static253.anInt5047 < 8 && local195 >= -32 && local195 <= 31 && local202 >= -32 && local202 <= 31) {
							local195 += 32;
							local202 += 32;
							Static95.aClass2_Sub26_Sub1_1.method4231((Static253.anInt5047 << 12) + ((local195 << 6) + local202));
							Static253.anInt5047 = 0;
						} else if (Static253.anInt5047 < 32 && local195 >= -128 && local195 <= 127 && local202 >= -128 && local202 <= 127) {
							Static95.aClass2_Sub26_Sub1_1.method4239(Static253.anInt5047 + 128);
							local202 += 128;
							local195 += 128;
							Static95.aClass2_Sub26_Sub1_1.method4231(local202 + (local195 << 8));
							Static253.anInt5047 = 0;
						} else if (Static253.anInt5047 < 32) {
							Static95.aClass2_Sub26_Sub1_1.method4239(Static253.anInt5047 + 192);
							if (local147) {
								Static95.aClass2_Sub26_Sub1_1.method4260(Integer.MIN_VALUE);
							} else {
								Static95.aClass2_Sub26_Sub1_1.method4260(local118 | local113 << 16);
							}
							Static253.anInt5047 = 0;
						} else {
							Static95.aClass2_Sub26_Sub1_1.method4231(Static253.anInt5047 + 57344);
							if (local147) {
								Static95.aClass2_Sub26_Sub1_1.method4260(Integer.MIN_VALUE);
							} else {
								Static95.aClass2_Sub26_Sub1_1.method4260(local113 << 16 | local118);
							}
							Static253.anInt5047 = 0;
						}
					} else if (Static253.anInt5047 < 2047) {
						Static253.anInt5047++;
					}
				}
				Static95.aClass2_Sub26_Sub1_1.method4254(Static95.aClass2_Sub26_Sub1_1.anInt5328 - local86);
				if (local75 >= aClass54_1.anInt1512) {
					aClass54_1.anInt1512 = 0;
				} else {
					aClass54_1.anInt1512 -= local75;
					for (local88 = 0; local88 < aClass54_1.anInt1512; local88++) {
						aClass54_1.anIntArray112[local88] = aClass54_1.anIntArray112[local75 + local88];
						aClass54_1.anIntArray113[local88] = aClass54_1.anIntArray113[local88 + local75];
					}
				}
			}
		}
		if (Static246.anInt5126 != 0) {
			@Pc(441) long local441 = (Static277.aLong296 - Static164.aLong179) / 50L;
			Static164.aLong179 = Static277.aLong296;
			local75 = Static122.anInt2587;
			if (local441 > 32767L) {
				local441 = 32767L;
			}
			if (local75 < 0) {
				local75 = 0;
			} else if (local75 > 65535) {
				local75 = 65535;
			}
			local88 = Static199.anInt4139;
			@Pc(475) byte local475 = 0;
			if (Static246.anInt5126 == 2) {
				local475 = 1;
			}
			if (local88 < 0) {
				local88 = 0;
			} else if (local88 > 65535) {
				local88 = 65535;
			}
			Static95.aClass2_Sub26_Sub1_1.method4287(191);
			local118 = (int) local441;
			Static95.aClass2_Sub26_Sub1_1.method4231(local475 << 15 | local118);
			Static95.aClass2_Sub26_Sub1_1.method4252(local88 | local75 << 16);
		}
		if (Static32.anInt730 > 0) {
			Static32.anInt730--;
		}
		if (Static230.aBoolean329 && Static32.anInt730 <= 0) {
			Static230.aBoolean329 = false;
			Static32.anInt730 = 20;
			Static95.aClass2_Sub26_Sub1_1.method4287(240);
			Static95.aClass2_Sub26_Sub1_1.method4272((int) Static198.aFloat41);
			Static95.aClass2_Sub26_Sub1_1.method4272((int) Static142.aFloat31);
		}
		if (Static283.aBoolean474 && !Static140.aBoolean241) {
			Static140.aBoolean241 = true;
			Static95.aClass2_Sub26_Sub1_1.method4287(160);
			Static95.aClass2_Sub26_Sub1_1.method4239(1);
		}
		if (!Static283.aBoolean474 && Static140.aBoolean241) {
			Static140.aBoolean241 = false;
			Static95.aClass2_Sub26_Sub1_1.method4287(160);
			Static95.aClass2_Sub26_Sub1_1.method4239(0);
		}
		if (!Static278.aBoolean468) {
			Static95.aClass2_Sub26_Sub1_1.method4287(101);
			Static95.aClass2_Sub26_Sub1_1.method4256(Static198.method3357());
			Static278.aBoolean468 = true;
		}
		if (Static43.aBoolean75) {
			Static43.aBoolean75 = false;
		} else {
			Static188.aFloat39 /= 2.0F;
		}
		if (Static219.aBoolean385) {
			Static219.aBoolean385 = false;
		} else {
			Static21.aFloat3 /= 2.0F;
		}
		Static77.method1384();
		if (Static236.anInt4804 != 30) {
			return;
		}
		Static17.method353();
		Static225.method3778();
		Static248.method3968();
		Static294.anInt6108++;
		if (Static294.anInt6108 > 750) {
			Static75.method1375();
			return;
		}
		Static183.method3139();
		Static103.method1929();
		Static188.method3185();
		if (Static269.aClass115_16 != null) {
			Static105.method1948();
		}
		for (local34 = Static88.method3795(true); local34 != -1; local34 = Static88.method3795(false)) {
			Static153.method2649(local34);
			Static243.anIntArray302[Static261.anInt5432++ & 0x1F] = local34;
		}
		@Pc(1118) int local1118;
		for (@Pc(708) Class2_Sub3_Sub16 local708 = Static70.method1312(); local708 != null; local708 = Static70.method1312()) {
			local75 = local708.method2717();
			local88 = local708.method2716();
			if (local75 == 1) {
				Static148.anIntArray229[local88] = local708.anInt3327;
				Static163.anIntArray263[Static19.anInt472++ & 0x1F] = local88;
			} else if (local75 == 2) {
				Static33.aStringArray3[local88] = local708.aString162;
				Static270.anIntArray494[Static287.anInt5948++ & 0x1F] = local88;
			} else {
				@Pc(780) Class115 local780;
				if (local75 == 3) {
					local780 = Static90.method1692(local88);
					if (!local708.aString162.equals(local780.aString171)) {
						local780.aString171 = local708.aString162;
						Static298.method4263(local780);
					}
				} else if (local75 == 4) {
					local780 = Static90.method1692(local88);
					local1118 = local708.anInt3323;
					local118 = local708.anInt3327;
					local195 = local708.anInt3324;
					if (local118 != local780.anInt3483 || local1118 != local780.anInt3465 || local780.anInt3491 != local195) {
						local780.anInt3483 = local118;
						local780.anInt3491 = local195;
						local780.anInt3465 = local1118;
						Static298.method4263(local780);
					}
				} else if (local75 == 5) {
					local780 = Static90.method1692(local88);
					if (local780.anInt3490 != local708.anInt3327 || local708.anInt3327 == -1) {
						local780.anInt3490 = local708.anInt3327;
						local780.anInt3474 = 0;
						local780.anInt3478 = 0;
						local780.anInt3507 = 1;
						Static298.method4263(local780);
					}
				} else if (local75 == 6) {
					local113 = local708.anInt3327;
					local1118 = local113 >> 5 & 0x1F;
					local195 = local113 & 0x1F;
					local118 = local113 >> 10 & 0x1F;
					local202 = (local1118 << 11) + (local118 << 19) + (local195 << 3);
					@Pc(1145) Class115 local1145 = Static90.method1692(local88);
					if (local202 != local1145.anInt3543) {
						local1145.anInt3543 = local202;
						Static298.method4263(local1145);
					}
				} else if (local75 == 7) {
					local780 = Static90.method1692(local88);
					@Pc(1092) boolean local1092 = local708.anInt3327 == 1;
					if (local780.aBoolean292 != local1092) {
						local780.aBoolean292 = local1092;
						Static298.method4263(local780);
					}
				} else if (local75 == 8) {
					local780 = Static90.method1692(local88);
					if (local780.anInt3557 != local708.anInt3327 || local780.anInt3480 != local708.anInt3323 || local780.anInt3524 != local708.anInt3324) {
						local780.anInt3557 = local708.anInt3327;
						local780.anInt3524 = local708.anInt3324;
						if (local780.anInt3504 != -1) {
							if (local780.anInt3476 > 0) {
								local780.anInt3524 = local780.anInt3524 * 32 / local780.anInt3476;
							} else if (local780.anInt3530 > 0) {
								local780.anInt3524 = local780.anInt3524 * 32 / local780.anInt3530;
							}
						}
						local780.anInt3480 = local708.anInt3323;
						Static298.method4263(local780);
					}
				} else if (local75 == 9) {
					local780 = Static90.method1692(local88);
					if (local708.anInt3327 != local780.anInt3504 || local708.anInt3323 != local780.anInt3470) {
						local780.anInt3504 = local708.anInt3327;
						local780.anInt3470 = local708.anInt3323;
						Static298.method4263(local780);
					}
				} else if (local75 == 10) {
					local780 = Static90.method1692(local88);
					if (local708.anInt3327 != local780.anInt3546 || local708.anInt3323 != local780.anInt3550 || local780.anInt3481 != local708.anInt3324) {
						local780.anInt3481 = local708.anInt3324;
						local780.anInt3550 = local708.anInt3323;
						local780.anInt3546 = local708.anInt3327;
						Static298.method4263(local780);
					}
				} else if (local75 == 11) {
					local780 = Static90.method1692(local88);
					local780.anInt3536 = local780.anInt3519 = local708.anInt3323;
					local780.anInt3556 = local780.anInt3501 = local708.anInt3327;
					local780.aByte18 = 0;
					local780.aByte15 = 0;
					Static298.method4263(local780);
				} else if (local75 == 12) {
					local780 = Static90.method1692(local88);
					local118 = local708.anInt3327;
					if (local780 != null && local780.anInt3538 == 0) {
						if (local118 > local780.anInt3464 - local780.anInt3487) {
							local118 = local780.anInt3464 - local780.anInt3487;
						}
						if (local118 < 0) {
							local118 = 0;
						}
						if (local118 != local780.anInt3514) {
							local780.anInt3514 = local118;
							Static298.method4263(local780);
						}
					}
				} else if (local75 == 13) {
					local780 = Static90.method1692(local88);
					local780.anInt3554 = local708.anInt3327;
				}
			}
		}
		Static37.anInt906++;
		if (Static63.anInt1429 != 0) {
			Static118.anInt2536 += 20;
			if (Static118.anInt2536 >= 400) {
				Static63.anInt1429 = 0;
			}
		}
		if (Static198.aClass115_13 != null) {
			Static137.anInt2985++;
			if (Static137.anInt2985 >= 15) {
				Static298.method4263(Static198.aClass115_13);
				Static198.aClass115_13 = null;
			}
		}
		@Pc(1350) Class115 local1350;
		if (Static292.aClass115_17 != null) {
			Static298.method4263(Static292.aClass115_17);
			Static221.anInt4606++;
			if (Static86.anInt1911 > Static173.anInt3684 + 5 || Static86.anInt1911 < Static173.anInt3684 - 5 || Static140.anInt3024 + 5 < Static238.anInt4852 || Static140.anInt3024 - 5 > Static238.anInt4852) {
				Static219.aBoolean384 = true;
			}
			if (Static279.anInt5824 == 0) {
				if (Static219.aBoolean384 && Static221.anInt4606 >= 5) {
					if (Static43.aClass115_5 == Static292.aClass115_17 && Static91.anInt2033 != Static222.anInt4609) {
						local1350 = Static292.aClass115_17;
						@Pc(1356) byte local1356 = 0;
						if (Static87.anInt1922 == 1 && local1350.anInt3544 == 206) {
							local1356 = 1;
						}
						if (local1350.anIntArray271[Static222.anInt4609] <= 0) {
							local1356 = 0;
						}
						if (Static35.method708(local1350).method1314()) {
							local113 = Static91.anInt2033;
							local118 = Static222.anInt4609;
							local1350.anIntArray271[local118] = local1350.anIntArray271[local113];
							local1350.anIntArray270[local118] = local1350.anIntArray270[local113];
							local1350.anIntArray271[local113] = -1;
							local1350.anIntArray270[local113] = 0;
						} else if (local1356 == 1) {
							local118 = Static222.anInt4609;
							local113 = Static91.anInt2033;
							while (local118 != local113) {
								if (local113 > local118) {
									local1350.method2858(local113 - 1, local113);
									local113--;
								} else if (local118 > local113) {
									local1350.method2858(local113 + 1, local113);
									local113++;
								}
							}
						} else {
							local1350.method2858(Static222.anInt4609, Static91.anInt2033);
						}
						Static95.aClass2_Sub26_Sub1_1.method4287(47);
						Static95.aClass2_Sub26_Sub1_1.method4260(Static292.aClass115_17.anInt3552);
						Static95.aClass2_Sub26_Sub1_1.method4272(Static222.anInt4609);
						Static95.aClass2_Sub26_Sub1_1.method4239(local1356);
						Static95.aClass2_Sub26_Sub1_1.method4271(Static91.anInt2033);
					}
				} else if ((Static109.anInt2341 == 1 || Static146.method2585(Static216.anInt4481 - 1)) && Static216.anInt4481 > 2) {
					Static119.method2205();
				} else if (Static216.anInt4481 > 0) {
					Static34.method1664();
				}
				Static137.anInt2985 = 10;
				Static292.aClass115_17 = null;
				Static246.anInt5126 = 0;
			}
		}
		Static189.aClass115_12 = null;
		Static263.anInt5394 = 0;
		Static29.aBoolean56 = false;
		Static197.aBoolean343 = false;
		@Pc(1508) Class115 local1508 = Static238.aClass115_15;
		local1350 = Static109.aClass115_10;
		Static109.aClass115_10 = null;
		Static238.aClass115_15 = null;
		while (Static73.method1366() && Static263.anInt5394 < 128) {
			Static196.anIntArray337[Static263.anInt5394] = Static213.anInt4465;
			Static290.anIntArray515[Static263.anInt5394] = Static251.aChar4;
			Static263.anInt5394++;
		}
		Static269.aClass115_16 = null;
		if (Static17.anInt427 != -1) {
			Static243.method3056(Static17.anInt427, 0, 0, Static20.anInt1235, 0, Static257.anInt5343, 0);
		}
		Static13.anInt334++;
		while (true) {
			@Pc(1578) Class115 local1578;
			@Pc(1568) Class115 local1568;
			@Pc(1561) Class2_Sub6 local1561;
			do {
				local1561 = (Class2_Sub6) Static221.aClass1_19.method3();
				if (local1561 == null) {
					while (true) {
						do {
							local1561 = (Class2_Sub6) Static219.aClass1_17.method3();
							if (local1561 == null) {
								while (true) {
									do {
										local1561 = (Class2_Sub6) Static225.aClass1_20.method3();
										if (local1561 == null) {
											if (Static269.aClass115_16 == null) {
												Static296.anInt6182 = 0;
											}
											if (Static23.aClass115_3 != null) {
												Static150.method2611();
											}
											if (Static189.anInt3958 > 0 && Static79.aBooleanArray8[82] && Static79.aBooleanArray8[81] && Static205.anInt4276 != 0) {
												local113 = Static208.anInt4335 - Static205.anInt4276;
												if (local113 < 0) {
													local113 = 0;
												} else if (local113 > 3) {
													local113 = 3;
												}
												Static131.method2288(local113, Static111.aClass36_Sub3_Sub2_1.anIntArray468[0] + Static203.anInt4236, Static111.aClass36_Sub3_Sub2_1.anIntArray465[0] + Static125.anInt5772);
											}
											if (Static189.anInt3958 > 0 && Static79.aBooleanArray8[82] && Static79.aBooleanArray8[81]) {
												if (Static217.anInt4542 != -1) {
													Static131.method2288(Static208.anInt4335, Static203.anInt4236 + Static201.anInt4207, Static217.anInt4542 + Static125.anInt5772);
												}
												Static2.anInt5935 = 0;
												Static262.anInt6194 = 0;
											} else if (Static262.anInt6194 == 2) {
												if (Static217.anInt4542 != -1) {
													Static95.aClass2_Sub26_Sub1_1.method4287(206);
													Static95.aClass2_Sub26_Sub1_1.method4272(Static297.anInt6213);
													Static95.aClass2_Sub26_Sub1_1.method4271(Static125.anInt5772 + Static217.anInt4542);
													Static95.aClass2_Sub26_Sub1_1.method4231(Static201.anInt4207 + Static203.anInt4236);
													Static95.aClass2_Sub26_Sub1_1.method4252(Static25.anInt5783);
													Static277.anInt5757 = Static122.anInt2587;
													Static118.anInt2536 = 0;
													Static63.anInt1429 = 1;
													Static268.anInt5547 = Static199.anInt4139;
												}
												Static262.anInt6194 = 0;
											} else if (Static2.anInt5935 == 2) {
												if (Static217.anInt4542 != -1) {
													Static95.aClass2_Sub26_Sub1_1.method4287(29);
													Static95.aClass2_Sub26_Sub1_1.method4271(Static203.anInt4236 + Static201.anInt4207);
													Static95.aClass2_Sub26_Sub1_1.method4231(Static217.anInt4542 + Static125.anInt5772);
													Static118.anInt2536 = 0;
													Static63.anInt1429 = 1;
													Static277.anInt5757 = Static122.anInt2587;
													Static268.anInt5547 = Static199.anInt4139;
												}
												Static2.anInt5935 = 0;
											} else if (Static217.anInt4542 != -1 && Static262.anInt6194 == 0 && Static2.anInt5935 == 0) {
												Static198.method3358(0, (Static201.anInt4207 << 1) + 1 - Static111.aClass36_Sub3_Sub2_1.method4097() >> 1, (Static217.anInt4542 << 1) + (1 - Static111.aClass36_Sub3_Sub2_1.method4097()) >> 1);
												Static63.anInt1429 = 1;
												Static277.anInt5757 = Static122.anInt2587;
												Static118.anInt2536 = 0;
												Static268.anInt5547 = Static199.anInt4139;
											}
											Static217.anInt4542 = -1;
											Static141.method2471();
											if (local1350 != Static109.aClass115_10) {
												if (local1350 != null) {
													Static298.method4263(local1350);
												}
												if (Static109.aClass115_10 != null) {
													Static298.method4263(Static109.aClass115_10);
												}
											}
											if (local1508 != Static238.aClass115_15 && Static201.anInt4204 == Static51.anInt1197) {
												if (local1508 != null) {
													Static298.method4263(local1508);
												}
												if (Static238.aClass115_15 != null) {
													Static298.method4263(Static238.aClass115_15);
												}
											}
											if (Static238.aClass115_15 == null) {
												if (Static51.anInt1197 > 0) {
													Static51.anInt1197--;
												}
											} else if (Static51.anInt1197 < Static201.anInt4204) {
												Static51.anInt1197++;
												if (Static51.anInt1197 == Static201.anInt4204) {
													Static298.method4263(Static238.aClass115_15);
												}
											}
											for (local113 = 0; local113 < 5; local113++) {
												@Pc(2016) int local2016 = Static57.anIntArray146[local113]++;
											}
											local113 = Static198.method3356();
											local118 = Static231.method3889();
											if (local113 > 15000 && local118 > 15000) {
												Static161.anInt3399 = 250;
												Static169.method2900(14500);
												Static95.aClass2_Sub26_Sub1_1.method4287(120);
											}
											if (Static77.aClass28_6 != null && Static77.aClass28_6.anInt726 == 1) {
												if (Static77.aClass28_6.anObject2 != null) {
													Static247.method3966(Static53.aBoolean91, Static192.aString200);
												}
												Static192.aString200 = null;
												Static77.aClass28_6 = null;
												Static53.aBoolean91 = false;
											}
											Static279.anInt5822++;
											Static136.anInt2973++;
											Static185.anInt3925++;
											if (Static136.anInt2973 > 500) {
												Static136.anInt2973 = 0;
												local1118 = (int) (Math.random() * 8.0D);
												if ((local1118 & 0x4) == 4) {
													Static83.anInt1889 += Static144.anInt3118;
												}
												if ((local1118 & 0x1) == 1) {
													Static52.anInt1206 += Static185.anInt3922;
												}
												if ((local1118 & 0x2) == 2) {
													Static247.anInt4921 += Static106.anInt2317;
												}
											}
											if (Static279.anInt5822 > 500) {
												Static279.anInt5822 = 0;
												local1118 = (int) (Math.random() * 8.0D);
												if ((local1118 & 0x2) == 2) {
													Static266.anInt5527 += Static110.anInt2381;
												}
												if ((local1118 & 0x1) == 1) {
													Static293.anInt6086 += Static293.anInt6090;
												}
											}
											if (Static266.anInt5527 < -20) {
												Static110.anInt2381 = 1;
											}
											if (Static83.anInt1889 < -40) {
												Static144.anInt3118 = 1;
											}
											if (Static247.anInt4921 < -55) {
												Static106.anInt2317 = 2;
											}
											if (Static266.anInt5527 > 10) {
												Static110.anInt2381 = -1;
											}
											if (Static83.anInt1889 > 40) {
												Static144.anInt3118 = -1;
											}
											if (Static247.anInt4921 > 55) {
												Static106.anInt2317 = -2;
											}
											if (Static293.anInt6086 < -60) {
												Static293.anInt6090 = 2;
											}
											if (Static52.anInt1206 < -50) {
												Static185.anInt3922 = 2;
											}
											if (Static293.anInt6086 > 60) {
												Static293.anInt6090 = -2;
											}
											if (Static52.anInt1206 > 50) {
												Static185.anInt3922 = -2;
											}
											if (Static185.anInt3925 > 50) {
												Static95.aClass2_Sub26_Sub1_1.method4287(84);
											}
											if (Static156.aBoolean443) {
												Static26.method496();
												Static156.aBoolean443 = false;
											}
											try {
												if (Static42.aClass45_1 != null && Static95.aClass2_Sub26_Sub1_1.anInt5328 > 0) {
													Static42.aClass45_1.method1043(Static95.aClass2_Sub26_Sub1_1.anInt5328, Static95.aClass2_Sub26_Sub1_1.aByteArray72);
													Static185.anInt3925 = 0;
													Static95.aClass2_Sub26_Sub1_1.anInt5328 = 0;
												}
											} catch (@Pc(2268) IOException local2268) {
												Static75.method1375();
											}
											return;
										}
										local1568 = local1561.aClass115_4;
										if (local1568.anInt3499 < 0) {
											break;
										}
										local1578 = Static90.method1692(local1568.anInt3525);
									} while (local1578 == null || local1578.aClass115Array1 == null || local1568.anInt3499 >= local1578.aClass115Array1.length || local1578.aClass115Array1[local1568.anInt3499] != local1568);
									Static73.method1363(local1561);
								}
							}
							local1568 = local1561.aClass115_4;
							if (local1568.anInt3499 < 0) {
								break;
							}
							local1578 = Static90.method1692(local1568.anInt3525);
						} while (local1578 == null || local1578.aClass115Array1 == null || local1568.anInt3499 >= local1578.aClass115Array1.length || local1578.aClass115Array1[local1568.anInt3499] != local1568);
						Static73.method1363(local1561);
					}
				}
				local1568 = local1561.aClass115_4;
				if (local1568.anInt3499 < 0) {
					break;
				}
				local1578 = Static90.method1692(local1568.anInt3525);
			} while (local1578 == null || local1578.aClass115Array1 == null || local1568.anInt3499 >= local1578.aClass115Array1.length || local1578.aClass115Array1[local1568.anInt3499] != local1568);
			Static73.method1363(local1561);
		}
	}
}
