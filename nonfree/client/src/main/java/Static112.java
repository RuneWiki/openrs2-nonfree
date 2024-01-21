import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!ud", name = "w", descriptor = "I")
	public static int anInt2649;

	@OriginalMember(owner = "client!ud", name = "y", descriptor = "Lclient!nb;")
	public static Class24 aClass24_24;

	@OriginalMember(owner = "client!ud", name = "J", descriptor = "I")
	public static int anInt2660;

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1290 = Static38.method736("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!ud", name = "k", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1291 = Static38.method736("backhmid2");

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1292 = Static38.method736(")3");

	@OriginalMember(owner = "client!ud", name = "o", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1293 = Static38.method736("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!ud", name = "r", descriptor = "[J")
	public static long[] aLongArray8 = new long[32];

	@OriginalMember(owner = "client!ud", name = "z", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1294 = aClass71_1293;

	@OriginalMember(owner = "client!ud", name = "C", descriptor = "I")
	public static int anInt2653 = 0;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!nb;I)I")
	public static int method1746(@OriginalArg(0) Class24 arg0) {
		@Pc(1) int local1 = 0;
		if (arg0.method670(Static89.aClass71_1043, Static119.aClass71_1402)) {
			local1++;
		}
		if (arg0.method670(Static9.aClass71_216, Static119.aClass71_1402)) {
			local1++;
		}
		if (arg0.method670(Static2.aClass71_904, Static119.aClass71_1402)) {
			local1++;
		}
		if (arg0.method670(Static74.aClass71_511, Static119.aClass71_1402)) {
			local1++;
		}
		if (arg0.method670(Static75.aClass71_897, Static119.aClass71_1402)) {
			local1++;
		}
		if (arg0.method670(Static118.aClass71_1382, Static119.aClass71_1402)) {
			local1++;
		}
		if (arg0.method670(Static41.aClass71_603, Static119.aClass71_1402)) {
			local1++;
		}
		if (arg0.method670(Static92.aClass71_1085, Static119.aClass71_1402)) {
			local1++;
		}
		if (arg0.method670(Static33.aClass71_516, Static119.aClass71_1402)) {
			local1++;
		}
		if (arg0.method670(Static53.aClass71_729, Static119.aClass71_1402)) {
			local1++;
		}
		if (arg0.method670(Static87.aClass71_1031, Static119.aClass71_1402)) {
			local1++;
		}
		if (arg0.method670(Static92.aClass71_1090, Static119.aClass71_1402)) {
			local1++;
		}
		if (arg0.method670(Static50.aClass71_718, Static119.aClass71_1402)) {
			local1++;
		}
		if (arg0.method670(Static100.aClass71_1176, Static119.aClass71_1402)) {
			local1++;
		}
		if (arg0.method670(aClass71_1291, Static119.aClass71_1402)) {
			local1++;
		}
		if (arg0.method670(Static53.aClass71_727, Static119.aClass71_1402)) {
			local1++;
		}
		if (arg0.method670(Static78.aClass71_523, Static119.aClass71_1402)) {
			local1++;
		}
		if (arg0.method670(Static38.aClass71_574, Static119.aClass71_1402)) {
			local1++;
		}
		if (arg0.method670(Static66.aClass71_815, Static119.aClass71_1402)) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)Lclient!uc;")
	public static Class4 method1747() {
		try {
			return (Class4) Class.forName("Class4_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return new Class4_Sub1();
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BII)V")
	public static void method1748(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class52 local11 = Static34.aClass52ArrayArrayArray1[Static23.anInt728][arg1][arg0];
		if (local11 == null) {
			Static7.aClass43_1.method1070(Static23.anInt728, arg1, arg0);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class5_Sub1_Sub1_Sub5 local23 = null;
		@Pc(30) Class5_Sub1_Sub1_Sub5 local30;
		for (local30 = (Class5_Sub1_Sub1_Sub5) local11.method1358(); local30 != null; local30 = (Class5_Sub1_Sub1_Sub5) local11.method1363()) {
			@Pc(36) Class5_Sub1_Sub17 local36 = Static33.method691(local30.anInt1918);
			@Pc(39) int local39 = local36.anInt2880;
			if (local36.anInt2870 == 1) {
				local39 *= local30.anInt1915 + 1;
			}
			if (local39 > local21) {
				local21 = local39;
				local23 = local30;
			}
		}
		if (local23 == null) {
			Static7.aClass43_1.method1070(Static23.anInt728, arg1, arg0);
			return;
		}
		local11.method1354(local23);
		@Pc(87) Class5_Sub1_Sub1_Sub5 local87 = null;
		@Pc(89) Class5_Sub1_Sub1_Sub5 local89 = null;
		for (local30 = (Class5_Sub1_Sub1_Sub5) local11.method1358(); local30 != null; local30 = (Class5_Sub1_Sub1_Sub5) local11.method1363()) {
			if (local23.anInt1918 != local30.anInt1918) {
				if (local87 == null) {
					local87 = local30;
				}
				if (local30.anInt1918 != local87.anInt1918 && local89 == null) {
					local89 = local30;
				}
			}
		}
		@Pc(138) int local138 = arg1 + (arg0 << 7) + 1610612736;
		Static7.aClass43_1.method1056(Static23.anInt728, arg1, arg0, Static26.method989(arg1 * 128 + 64, Static23.anInt728, arg0 * 128 + 64), local23, local138, local87, local89);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IBI)Lclient!vc;")
	public static Class71 method1749(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 - arg0;
		if (local12 < -9) {
			return Static24.aClass71_423;
		} else if (local12 < -6) {
			return Static51.aClass71_723;
		} else if (local12 < -3) {
			return Static89.aClass71_1042;
		} else if (local12 < 0) {
			return Static90.aClass71_1422;
		} else if (local12 > 9) {
			return Static28.aClass71_448;
		} else if (local12 > 6) {
			return Static99.aClass71_1150;
		} else if (local12 > 3) {
			return Static8.aClass71_212;
		} else if (local12 > 0) {
			return Static69.aClass71_842;
		} else {
			return Static104.aClass71_1426;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
	public static void method1750() {
		aClass71_1294 = null;
		aClass71_1291 = null;
		aClass24_24 = null;
		aClass71_1293 = null;
		aLongArray8 = null;
		aClass71_1290 = null;
		aClass71_1292 = null;
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
	public static void method1751() {
		if (Static81.anInt1990 == 0 && !Static33.aBoolean40) {
			Static60.method1040(39, Static38.aClass71_568, 0, Static107.anInt2563, Static26.anInt1440, Static117.aClass71_1362);
		}
		@Pc(23) int local23 = -1;
		for (@Pc(25) int local25 = 0; local25 < Static11.anInt353; local25++) {
			@Pc(33) int local33 = Static11.anIntArray34[local25];
			@Pc(39) int local39 = local33 >> 14 & 0x7FFF;
			@Pc(43) int local43 = local33 & 0x7F;
			@Pc(49) int local49 = local33 >> 29 & 0x3;
			@Pc(55) int local55 = local33 >> 7 & 0x7F;
			if (local33 != local23) {
				local23 = local33;
				@Pc(140) int local140;
				if (local49 == 2 && Static7.aClass43_1.method1059(Static23.anInt728, local43, local55, local33) >= 0) {
					@Pc(77) Class5_Sub1_Sub15 local77 = Static97.method1606(local39);
					if (local77.anIntArray267 != null) {
						local77 = local77.method1712();
					}
					if (local77 == null) {
						continue;
					}
					if (Static81.anInt1990 == 1) {
						Static60.method1040(51, Static74.method677(new Class71[] { Static94.aClass71_1106, Static51.aClass71_720, local77.aClass71_1255 }), local33, local43, local55, Static31.aClass71_480);
					} else if (!Static33.aBoolean40) {
						@Pc(130) Class71[] local130 = local77.aClass71Array14;
						if (Static110.aBoolean119) {
							local130 = Static68.method1147(local130);
						}
						if (local130 != null) {
							for (local140 = 4; local140 >= 0; local140--) {
								if (local130[local140] != null) {
									@Pc(148) short local148 = 0;
									if (local140 == 0) {
										local148 = 4;
									}
									if (local140 == 1) {
										local148 = 20;
									}
									if (local140 == 2) {
										local148 = 46;
									}
									if (local140 == 3) {
										local148 = 58;
									}
									if (local140 == 4) {
										local148 = 1001;
									}
									Static60.method1040(local148, Static74.method677(new Class71[] { Static103.aClass71_1202, local77.aClass71_1255 }), local33, local43, local55, local130[local140]);
								}
							}
						}
						Static60.method1040(1003, Static74.method677(new Class71[] { Static103.aClass71_1202, local77.aClass71_1255 }), local77.anInt2568 << 14, local43, local55, Static73.aClass71_893);
					} else if ((Static24.anInt741 & 0x4) == 4) {
						Static60.method1040(8, Static74.method677(new Class71[] { Static10.aClass71_222, Static51.aClass71_720, local77.aClass71_1255 }), local33, local43, local55, Static82.aClass71_991);
					}
				}
				@Pc(304) int local304;
				@Pc(312) Class5_Sub1_Sub1_Sub3_Sub1 local312;
				@Pc(369) Class5_Sub1_Sub1_Sub3_Sub2 local369;
				if (local49 == 1) {
					@Pc(281) Class5_Sub1_Sub1_Sub3_Sub1 local281 = Static106.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local39];
					if (local281.aClass5_Sub1_Sub16_1.anInt2819 == 1 && (local281.anInt2474 & 0x7F) == 64 && (local281.anInt2452 & 0x7F) == 64) {
						for (local304 = 0; local304 < Static90.anInt3005; local304++) {
							local312 = Static106.aClass5_Sub1_Sub1_Sub3_Sub1Array1[Static61.anIntArray175[local304]];
							if (local312 != null && local281 != local312 && local312.aClass5_Sub1_Sub16_1.anInt2819 == 1 && local312.anInt2474 == local281.anInt2474 && local312.anInt2452 == local281.anInt2452) {
								Static115.method1795(local43, local55, local312.aClass5_Sub1_Sub16_1, Static61.anIntArray175[local304]);
							}
						}
						for (local140 = 0; local140 < Static37.anInt594; local140++) {
							local369 = Static85.aClass5_Sub1_Sub1_Sub3_Sub2Array1[Static116.anIntArray285[local140]];
							if (local369 != null && local281.anInt2474 == local369.anInt2474 && local281.anInt2452 == local369.anInt2452) {
								Static30.method587(local43, Static116.anIntArray285[local140], local369, local55);
							}
						}
					}
					Static115.method1795(local43, local55, local281.aClass5_Sub1_Sub16_1, local39);
				}
				if (local49 == 0) {
					@Pc(414) Class5_Sub1_Sub1_Sub3_Sub2 local414 = Static85.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local39];
					if ((local414.anInt2474 & 0x7F) == 64 && (local414.anInt2452 & 0x7F) == 64) {
						for (local304 = 0; local304 < Static90.anInt3005; local304++) {
							local312 = Static106.aClass5_Sub1_Sub1_Sub3_Sub1Array1[Static61.anIntArray175[local304]];
							if (local312 != null && local312.aClass5_Sub1_Sub16_1.anInt2819 == 1 && local414.anInt2474 == local312.anInt2474 && local414.anInt2452 == local312.anInt2452) {
								Static115.method1795(local43, local55, local312.aClass5_Sub1_Sub16_1, Static61.anIntArray175[local304]);
							}
						}
						for (local140 = 0; local140 < Static37.anInt594; local140++) {
							local369 = Static85.aClass5_Sub1_Sub1_Sub3_Sub2Array1[Static116.anIntArray285[local140]];
							if (local369 != null && local369 != local414 && local369.anInt2474 == local414.anInt2474 && local369.anInt2452 == local414.anInt2452) {
								Static30.method587(local43, Static116.anIntArray285[local140], local369, local55);
							}
						}
					}
					Static30.method587(local43, local39, local414, local55);
				}
				if (local49 == 3) {
					@Pc(532) Class52 local532 = Static34.aClass52ArrayArrayArray1[Static23.anInt728][local43][local55];
					if (local532 != null) {
						for (@Pc(541) Class5_Sub1_Sub1_Sub5 local541 = (Class5_Sub1_Sub1_Sub5) local532.method1353(); local541 != null; local541 = (Class5_Sub1_Sub1_Sub5) local532.method1357()) {
							@Pc(548) Class5_Sub1_Sub17 local548 = Static33.method691(local541.anInt1918);
							if (Static81.anInt1990 == 1) {
								Static60.method1040(57, Static74.method677(new Class71[] { Static94.aClass71_1106, Static6.aClass71_160, local548.aClass71_1359 }), local541.anInt1918, local43, local55, Static31.aClass71_480);
							} else if (!Static33.aBoolean40) {
								@Pc(600) Class71[] local600 = local548.aClass71Array17;
								if (Static110.aBoolean119) {
									local600 = Static68.method1147(local600);
								}
								for (@Pc(608) int local608 = 4; local608 >= 0; local608--) {
									if (local600 != null && local600[local608] != null) {
										@Pc(650) byte local650 = 0;
										if (local608 == 0) {
											local650 = 30;
										}
										if (local608 == 1) {
											local650 = 55;
										}
										if (local608 == 2) {
											local650 = 48;
										}
										if (local608 == 3) {
											local650 = 10;
										}
										if (local608 == 4) {
											local650 = 3;
										}
										Static60.method1040(local650, Static74.method677(new Class71[] { Static82.aClass71_990, local548.aClass71_1359 }), local541.anInt1918, local43, local55, local600[local608]);
									} else if (local608 == 2) {
										Static60.method1040(48, Static74.method677(new Class71[] { Static82.aClass71_990, local548.aClass71_1359 }), local541.anInt1918, local43, local55, Static100.aClass71_1166);
									}
								}
								Static60.method1040(1006, Static74.method677(new Class71[] { Static82.aClass71_990, local548.aClass71_1359 }), local541.anInt1918, local43, local55, Static73.aClass71_893);
							} else if ((Static24.anInt741 & 0x1) == 1) {
								Static60.method1040(52, Static74.method677(new Class71[] { Static10.aClass71_222, Static6.aClass71_160, local548.aClass71_1359 }), local541.anInt1918, local43, local55, Static82.aClass71_991);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZII)Lclient!vc;")
	public static Class71 method1752(@OriginalArg(2) int arg0) {
		return Static104.method2011(arg0, true);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIII)I")
	public static int method1753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 > 179) {
			arg1 /= 2;
		}
		if (arg0 > 192) {
			arg1 /= 2;
		}
		if (arg0 > 217) {
			arg1 /= 2;
		}
		if (arg0 > 243) {
			arg1 /= 2;
		}
		return (arg2 / 4 << 10) + (arg1 / 32 << 7) + arg0 / 2;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static106.method1689(arg3)) {
			Static85.method1387(arg6, arg2, arg1, 0, 0, arg5, -1, Static30.aClass5_Sub1_Sub11ArrayArray1[arg3], arg0, arg7, arg4);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V")
	public static void method1755() {
		Static54.aBoolean56 = true;
		Static38.method730();
		@Pc(28) boolean local28;
		if (Static95.anInt2286 != -1) {
			local28 = Static23.method549(190, 261, 1, Static95.anInt2286);
			if (!local28) {
				Static28.aBoolean33 = true;
			}
		} else if (Static26.anIntArray168[Static64.anInt2489] != -1) {
			local28 = Static23.method549(190, 261, 1, Static26.anIntArray168[Static64.anInt2489]);
			if (!local28) {
				Static28.aBoolean33 = true;
			}
		}
		if (Static65.aBoolean71 && Static90.anInt2998 == 1) {
			if (Static10.anInt317 == 1) {
				Static8.method192();
			} else {
				Static89.method1412();
			}
		}
		Static70.method1172();
	}
}
