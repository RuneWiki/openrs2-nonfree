import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!d", name = "d", descriptor = "[Lclient!he;")
	public static Class1_Sub1_Sub5_Sub2[] aClass1_Sub1_Sub5_Sub2Array2;

	@OriginalMember(owner = "client!d", name = "g", descriptor = "I")
	public static int anInt582;

	@OriginalMember(owner = "client!d", name = "n", descriptor = "Lclient!rd;")
	private static Class64 aClass64_350 = Static69.method1153("Connecting to friendserver");

	@OriginalMember(owner = "client!d", name = "c", descriptor = "Lclient!rd;")
	public static Class64 aClass64_347 = aClass64_350;

	@OriginalMember(owner = "client!d", name = "e", descriptor = "Lclient!rd;")
	public static Class64 aClass64_348 = Static69.method1153(":0");

	@OriginalMember(owner = "client!d", name = "j", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2 = new byte[4][104][104];

	@OriginalMember(owner = "client!d", name = "k", descriptor = "I")
	public static int anInt585 = 0;

	@OriginalMember(owner = "client!d", name = "l", descriptor = "Lclient!rd;")
	public static Class64 aClass64_349 = Static69.method1153("backbase1");

	@OriginalMember(owner = "client!d", name = "r", descriptor = "Lclient!rd;")
	public static Class64 aClass64_351 = Static69.method1153("blaugr-Un:");

	@OriginalMember(owner = "client!d", name = "s", descriptor = "Lclient!rd;")
	public static Class64 aClass64_352 = Static69.method1153("Weiter");

	@OriginalMember(owner = "client!d", name = "x", descriptor = "Lclient!rd;")
	public static Class64 aClass64_353 = Static69.method1153("mapmarker");

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
	public static void method354() {
		aClass64_353 = null;
		aClass64_349 = null;
		aClass64_350 = null;
		aClass64_352 = null;
		aClass1_Sub1_Sub5_Sub2Array2 = null;
		aClass64_351 = null;
		aByteArrayArrayArray2 = null;
		aClass64_347 = null;
		aClass64_348 = null;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!f;Z)V")
	public static void method356(@OriginalArg(0) Class1_Sub1_Sub2_Sub1 arg0) {
		arg0.aBoolean146 = false;
		@Pc(17) Class1_Sub1_Sub4 local17;
		if (arg0.anInt2396 != -1) {
			local17 = Static10.method254(arg0.anInt2396);
			if (local17 == null || local17.anIntArray97 == null) {
				arg0.anInt2396 = -1;
			} else {
				arg0.anInt2381++;
				if (local17.anIntArray97.length > arg0.anInt2367 && arg0.anInt2381 > local17.anIntArray96[arg0.anInt2367]) {
					arg0.anInt2367++;
					arg0.anInt2381 = 1;
					Static21.method413(arg0.anInt2367, arg0.anInt2375, local17, arg0.anInt2412);
				}
				if (arg0.anInt2367 >= local17.anIntArray97.length) {
					arg0.anInt2367 = 0;
					arg0.anInt2381 = 0;
					Static21.method413(arg0.anInt2367, arg0.anInt2375, local17, arg0.anInt2412);
				}
			}
		}
		if (arg0.anInt2382 != -1 && Static15.anInt471 >= arg0.anInt2369) {
			if (arg0.anInt2402 < 0) {
				arg0.anInt2402 = 0;
			}
			@Pc(121) int local121 = Static62.method1091(arg0.anInt2382).anInt1200;
			if (local121 == -1) {
				arg0.anInt2382 = -1;
			} else {
				@Pc(133) Class1_Sub1_Sub4 local133 = Static10.method254(local121);
				if (local133 == null || local133.anIntArray97 == null) {
					arg0.anInt2382 = -1;
				} else {
					arg0.anInt2379++;
					if (local133.anIntArray97.length > arg0.anInt2402 && arg0.anInt2379 > local133.anIntArray96[arg0.anInt2402]) {
						arg0.anInt2402++;
						arg0.anInt2379 = 1;
						Static21.method413(arg0.anInt2402, arg0.anInt2375, local133, arg0.anInt2412);
					}
					if (arg0.anInt2402 >= local133.anIntArray97.length && (arg0.anInt2402 < 0 || arg0.anInt2402 >= local133.anIntArray97.length)) {
						arg0.anInt2382 = -1;
					}
				}
			}
		}
		if (arg0.anInt2407 != -1 && arg0.anInt2368 <= 1) {
			local17 = Static10.method254(arg0.anInt2407);
			if (local17.anInt716 == 1 && arg0.anInt2400 > 0 && Static15.anInt471 >= arg0.anInt2403 && Static15.anInt471 > arg0.anInt2370) {
				arg0.anInt2368 = 1;
				return;
			}
		}
		if (arg0.anInt2407 != -1 && arg0.anInt2368 == 0) {
			local17 = Static10.method254(arg0.anInt2407);
			if (local17 == null || local17.anIntArray97 == null) {
				arg0.anInt2407 = -1;
			} else {
				arg0.anInt2411++;
				if (arg0.anInt2357 < local17.anIntArray97.length && arg0.anInt2411 > local17.anIntArray96[arg0.anInt2357]) {
					arg0.anInt2357++;
					arg0.anInt2411 = 1;
					Static21.method413(arg0.anInt2357, arg0.anInt2375, local17, arg0.anInt2412);
				}
				if (local17.anIntArray97.length <= arg0.anInt2357) {
					arg0.anInt2359++;
					arg0.anInt2357 -= local17.anInt707;
					if (arg0.anInt2359 >= local17.anInt696) {
						arg0.anInt2407 = -1;
					} else if (arg0.anInt2357 >= 0 && arg0.anInt2357 < local17.anIntArray97.length) {
						Static21.method413(arg0.anInt2357, arg0.anInt2375, local17, arg0.anInt2412);
					} else {
						arg0.anInt2407 = -1;
					}
				}
				arg0.aBoolean146 = local17.aBoolean47;
			}
		}
		if (arg0.anInt2368 > 0) {
			arg0.anInt2368--;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIII[Lclient!nd;III)V")
	public static void method357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class1_Sub1_Sub11[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		for (@Pc(3) int local3 = 0; local3 < arg5.length; local3++) {
			@Pc(9) Class1_Sub1_Sub11 local9 = arg5[local3];
			if (local9 != null && (local9.anInt1697 == 0 || local9.aBoolean96) && local9 != null && local9.anInt1739 == arg1 && !Static99.method1605(local9)) {
				@Pc(40) int local40 = arg8 + local9.anInt1690 - arg2;
				@Pc(46) int local46 = local40 + local9.anInt1700;
				@Pc(53) int local53 = arg8 < local40 ? local40 : arg8;
				@Pc(60) int local60 = arg4 > local46 ? local46 : arg4;
				@Pc(67) int local67 = local9.anInt1702 + arg0 - arg6;
				@Pc(73) int local73 = local67 + local9.anInt1707;
				@Pc(80) int local80 = local67 <= arg0 ? arg0 : local67;
				@Pc(91) int local91 = local73 >= arg3 ? arg3 : local73;
				if (local9.anInt1697 == 0) {
					method357(local80, local9.anInt1717, local9.anInt1706 + local53 - local40, local91, local60, arg5, local80 + local9.anInt1689 - local67, arg7, local53);
					if (local9.aClass1_Sub1_Sub11Array2 != null) {
						method357(local80, local9.anInt1717, local9.anInt1706 + local53 - local40, local91, local60, local9.aClass1_Sub1_Sub11Array2, local9.anInt1689 + local80 - local67, arg7, local53);
					}
				}
				if (local9.aBoolean96) {
					@Pc(167) boolean local167;
					if (local53 <= Static81.anInt1404 && local80 <= Static63.anInt1474 && Static81.anInt1404 < local60 && Static63.anInt1474 < local91) {
						local167 = true;
					} else {
						local167 = false;
					}
					@Pc(173) boolean local173 = false;
					if (Static94.anInt2145 == 1 && local167) {
						local173 = true;
					}
					@Pc(182) boolean local182 = false;
					if (Static17.anInt576 == 1 && Static118.anInt2842 >= local53 && local80 <= Static96.anInt2745 && local60 > Static118.anInt2842 && local91 > Static96.anInt2745) {
						local182 = true;
					}
					if (local182 && Static11.aClass1_Sub1_Sub11_1 == null && (arg7 & 0x200) != 0 && !Static94.aBoolean132 && Static100.method1609(local9) != null) {
						Static11.aClass1_Sub1_Sub11_1 = local9;
						Static51.anInt1205 = Static81.anInt1404;
						Static13.aBoolean33 = false;
						Static108.anInt2550 = 0;
						Static63.anInt1475 = Static63.anInt1474;
					}
					if (Static11.aClass1_Sub1_Sub11_1 != null || Static94.aBoolean132) {
						local167 = false;
						local182 = false;
						local173 = false;
					}
					if (!local9.aBoolean102 && local182 && (arg7 & 0x1) != 0) {
						local9.aBoolean102 = true;
						if (local9.anObjectArray7 != null) {
							Static67.method1134(local9.anObjectArray7, Static118.anInt2842 - local40, 0, Static96.anInt2745 - local67, null, local9);
						}
					}
					if (local9.aBoolean102 && local173 && (arg7 & 0x4) != 0 && local9.anObjectArray8 != null) {
						Static67.method1134(local9.anObjectArray8, Static81.anInt1404 - local40, 0, Static63.anInt1474 - local67, null, local9);
					}
					if (local9.aBoolean102 && !local173 && (arg7 & 0x2) != 0) {
						local9.aBoolean102 = false;
						if (local9.anObjectArray13 != null) {
							Static67.method1134(local9.anObjectArray13, Static81.anInt1404 - local40, 0, Static63.anInt1474 - local67, null, local9);
						}
					}
					if (local173 && (arg7 & 0x8) != 0 && local9.anObjectArray18 != null) {
						Static67.method1134(local9.anObjectArray18, Static81.anInt1404 - local40, 0, Static63.anInt1474 - local67, null, local9);
					}
					if (!local9.aBoolean103 && local167 && (arg7 & 0x10) != 0) {
						local9.aBoolean103 = true;
						if (local9.anObjectArray5 != null) {
							Static67.method1134(local9.anObjectArray5, Static81.anInt1404 - local40, 0, Static63.anInt1474 - local67, null, local9);
						}
					}
					if (local9.aBoolean103 && local167 && (arg7 & 0x40) != 0 && local9.anObjectArray21 != null) {
						Static67.method1134(local9.anObjectArray21, Static81.anInt1404 - local40, 0, Static63.anInt1474 - local67, null, local9);
					}
					if (local9.aBoolean103 && !local167 && (arg7 & 0x20) != 0) {
						local9.aBoolean103 = false;
						if (local9.anObjectArray16 != null) {
							Static67.method1134(local9.anObjectArray16, Static81.anInt1404 - local40, 0, Static63.anInt1474 - local67, null, local9);
						}
					}
					if (local9.anObjectArray6 != null && (arg7 & 0x80) != 0) {
						Static67.method1134(local9.anObjectArray6, 0, 0, 0, null, local9);
					}
					if (local167 && Static15.anInt465 != 0 && local9.anObjectArray12 != null && (arg7 & 0x400) != 0) {
						Static67.method1134(local9.anObjectArray12, 0, 0, Static15.anInt465, null, local9);
					}
					if ((arg7 & 0x100) != 0) {
						if (local9.anInt1732 < Static26.anInt762 && local9.anObjectArray19 != null) {
							Static67.method1134(local9.anObjectArray19, 0, 0, 0, null, local9);
						}
						if (local9.anInt1732 < Static82.anInt1904 && local9.anObjectArray9 != null) {
							Static67.method1134(local9.anObjectArray9, 0, 0, 0, null, local9);
						}
						if (local9.anInt1732 < Static61.anInt1435 && local9.anObjectArray17 != null) {
							Static67.method1134(local9.anObjectArray17, 0, 0, 0, null, local9);
						}
						local9.anInt1732 = Static15.anInt471;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIII)V")
	public static void method358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			Static49.aClass1_Sub6_Sub1_1.method1877(149);
			Static49.aClass1_Sub6_Sub1_1.method1851(arg1);
			Static49.aClass1_Sub6_Sub1_1.method1839(arg0);
		}
		if (arg2 == 2) {
			Static49.aClass1_Sub6_Sub1_1.method1877(116);
			Static49.aClass1_Sub6_Sub1_1.method1851(arg1);
			Static49.aClass1_Sub6_Sub1_1.method1839(arg0);
		}
		if (arg2 == 3) {
			Static49.aClass1_Sub6_Sub1_1.method1877(1);
			Static49.aClass1_Sub6_Sub1_1.method1851(arg1);
			Static49.aClass1_Sub6_Sub1_1.method1839(arg0);
		}
		if (arg2 == 4) {
			Static49.aClass1_Sub6_Sub1_1.method1877(3);
			Static49.aClass1_Sub6_Sub1_1.method1851(arg1);
			Static49.aClass1_Sub6_Sub1_1.method1839(arg0);
		}
		if (arg2 == 5) {
			Static49.aClass1_Sub6_Sub1_1.method1877(12);
			Static49.aClass1_Sub6_Sub1_1.method1851(arg1);
			Static49.aClass1_Sub6_Sub1_1.method1839(arg0);
		}
		if (arg2 == 6) {
			Static49.aClass1_Sub6_Sub1_1.method1877(173);
			Static49.aClass1_Sub6_Sub1_1.method1851(arg1);
			Static49.aClass1_Sub6_Sub1_1.method1839(arg0);
		}
		if (arg2 == 7) {
			Static49.aClass1_Sub6_Sub1_1.method1877(112);
			Static49.aClass1_Sub6_Sub1_1.method1851(arg1);
			Static49.aClass1_Sub6_Sub1_1.method1839(arg0);
		}
		if (arg2 == 8) {
			Static49.aClass1_Sub6_Sub1_1.method1877(111);
			Static49.aClass1_Sub6_Sub1_1.method1851(arg1);
			Static49.aClass1_Sub6_Sub1_1.method1839(arg0);
		}
		if (arg2 == 9) {
			Static49.aClass1_Sub6_Sub1_1.method1877(232);
			Static49.aClass1_Sub6_Sub1_1.method1851(arg1);
			Static49.aClass1_Sub6_Sub1_1.method1839(arg0);
		}
		if (arg2 == 10) {
			Static49.aClass1_Sub6_Sub1_1.method1877(64);
			Static49.aClass1_Sub6_Sub1_1.method1851(arg1);
			Static49.aClass1_Sub6_Sub1_1.method1839(arg0);
		}
		@Pc(222) Class1_Sub1_Sub11 local222 = Static75.method1258(arg1, arg0);
		if (local222 != null && local222.anObjectArray20 != null) {
			Static67.method1134(local222.anObjectArray20, 0, arg2, 0, null, local222);
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BIII)Z")
	public static boolean method359(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 >> 14 & 0x7FFF;
		@Pc(18) int local18 = Static82.aClass68_1.method1760(Static15.anInt463, arg2, arg0, arg1);
		if (local18 == -1) {
			return false;
		}
		@Pc(28) int local28 = local18 & 0x1F;
		@Pc(34) int local34 = local18 >> 6 & 0x3;
		if (local28 == 10 || local28 == 11 || local28 == 22) {
			@Pc(49) Class1_Sub1_Sub3 local49 = Static108.method1807(local7);
			@Pc(62) int local62;
			@Pc(65) int local65;
			if (local34 == 0 || local34 == 2) {
				local62 = local49.anInt420;
				local65 = local49.anInt411;
			} else {
				local62 = local49.anInt411;
				local65 = local49.anInt420;
			}
			@Pc(76) int local76 = local49.anInt376;
			if (local34 != 0) {
				local76 = (local76 >> 4 - local34) + (local76 << local34 & 0xF);
			}
			Static8.method224(arg2, Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray355[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray354[0], 2, true, arg0, local65, local76, 0, 0, local62);
		} else {
			Static8.method224(arg2, Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray355[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray354[0], 2, true, arg0, 0, 0, local34, local28 + 1, 0);
		}
		Static6.anInt318 = 0;
		Static51.anInt1210 = Static96.anInt2745;
		Static85.anInt2752 = 2;
		Static57.anInt1293 = Static118.anInt2842;
		return true;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(I)I")
	public static int method360() {
		@Pc(9) int local9 = Static114.method1996(Static15.anInt463, Static119.anInt2846, Static80.anInt1899);
		return local9 - Static106.anInt2503 >= 800 || (aByteArrayArrayArray2[Static15.anInt463][Static119.anInt2846 >> 7][Static80.anInt1899 >> 7] & 0x4) == 0 ? 3 : Static15.anInt463;
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V")
	public static void method361() {
		Static26.aClass19_26.method416();
		Static39.aClass19_35.method416();
	}
}
