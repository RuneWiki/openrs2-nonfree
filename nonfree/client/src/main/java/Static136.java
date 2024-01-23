import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!oa", name = "R", descriptor = "I")
	public static int anInt2985;

	@OriginalMember(owner = "client!oa", name = "nb", descriptor = "Lclient!mc;")
	public static Class65 aClass65_5;

	@OriginalMember(owner = "client!oa", name = "hb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1042 = Static200.method3116("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!oa", name = "Qb", descriptor = "Z")
	public static boolean aBoolean165 = false;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)Z")
	public static boolean method2292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static139.method2382(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(24) int local24 = Static138.anIntArrayArrayArray17[arg0][arg1][arg2] - 1;
		@Pc(28) int local28 = local24 - 120;
		@Pc(32) int local32 = local24 - 230;
		@Pc(36) int local36 = local24 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static201.anInt4280) {
					if (!Static125.method2122(local10, local24, local14)) {
						return false;
					}
					if (!Static125.method2122(local10, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static125.method2122(local10, local28, local14)) {
						return false;
					}
					if (!Static125.method2122(local10, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static125.method2122(local10, local32, local14)) {
					return false;
				}
				if (!Static125.method2122(local10, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static155.anInt3455) {
					if (!Static125.method2122(local10, local24, local14 + 128)) {
						return false;
					}
					if (!Static125.method2122(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static125.method2122(local10, local28, local14 + 128)) {
						return false;
					}
					if (!Static125.method2122(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static125.method2122(local10, local32, local14 + 128)) {
					return false;
				}
				if (!Static125.method2122(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static201.anInt4280) {
					if (!Static125.method2122(local10 + 128, local24, local14)) {
						return false;
					}
					if (!Static125.method2122(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static125.method2122(local10 + 128, local28, local14)) {
						return false;
					}
					if (!Static125.method2122(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static125.method2122(local10 + 128, local32, local14)) {
					return false;
				}
				if (!Static125.method2122(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static155.anInt3455) {
					if (!Static125.method2122(local10, local24, local14)) {
						return false;
					}
					if (!Static125.method2122(local10 + 128, local24, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static125.method2122(local10, local28, local14)) {
						return false;
					}
					if (!Static125.method2122(local10 + 128, local28, local14)) {
						return false;
					}
				}
				if (!Static125.method2122(local10, local32, local14)) {
					return false;
				}
				if (!Static125.method2122(local10 + 128, local32, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static125.method2122(local10 + 64, local36, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static125.method2122(local10, local32, local14 + 128);
		} else if (arg3 == 32) {
			return Static125.method2122(local10 + 128, local32, local14 + 128);
		} else if (arg3 == 64) {
			return Static125.method2122(local10 + 128, local32, local14);
		} else if (arg3 == 128) {
			return Static125.method2122(local10, local32, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BILclient!ah;I)V")
	public static void method2300(@OriginalArg(1) int arg0, @OriginalArg(2) Class6 arg1, @OriginalArg(3) int arg2) {
		if (arg1.anInt226 == 1) {
			Static56.method1061(0L, arg1.aClass60_77, arg1.anInt229, (short) 3, 0, Static149.aClass60_1155);
		}
		if (arg1.anInt226 == 2 && !Static75.aBoolean98) {
			@Pc(38) Class60 local38 = Static149.method2552(arg1);
			if (local38 != null) {
				Static56.method1061(0L, local38, arg1.anInt229, (short) 20, -1, Static34.method611(new Class60[] { Static194.aClass60_1399, arg1.aClass60_80 }));
			}
		}
		if (arg1.anInt226 == 3) {
			Static56.method1061(0L, Static75.aClass60_585, arg1.anInt229, (short) 12, 0, Static149.aClass60_1155);
		}
		if (arg1.anInt226 == 4) {
			Static56.method1061(0L, arg1.aClass60_77, arg1.anInt229, (short) 31, 0, Static149.aClass60_1155);
		}
		if (arg1.anInt226 == 5) {
			Static56.method1061(0L, arg1.aClass60_77, arg1.anInt229, (short) 21, 0, Static149.aClass60_1155);
		}
		if (arg1.anInt226 == 6 && Static168.aClass6_14 == null) {
			Static56.method1061(0L, arg1.aClass60_77, arg1.anInt229, (short) 26, -1, Static149.aClass60_1155);
		}
		@Pc(154) int local154;
		@Pc(148) int local148;
		if (arg1.anInt233 == 2) {
			local148 = 0;
			for (@Pc(150) int local150 = 0; local150 < arg1.anInt271; local150++) {
				for (local154 = 0; local154 < arg1.anInt232; local154++) {
					@Pc(163) int local163 = local150 * (arg1.anInt260 + 32);
					@Pc(171) int local171 = local154 * (arg1.anInt238 + 32);
					if (local148 < 20) {
						local163 += arg1.anIntArray36[local148];
						local171 += arg1.anIntArray34[local148];
					}
					if (local171 <= arg0 && local163 <= arg2 && arg0 < local171 + 32 && local163 + 32 > arg2) {
						Static214.aClass6_16 = arg1;
						Static100.anInt2332 = local148;
						if (arg1.anIntArray31[local148] > 0) {
							@Pc(231) Class1_Sub1_Sub18 local231 = Static191.method2990(arg1.anIntArray31[local148] - 1);
							if (Static79.anInt1905 == 1 && Static94.method1629(Static166.method2717(arg1))) {
								if (arg1.anInt229 != Static55.anInt1474 || Static163.anInt3585 != local148) {
									Static56.method1061((long) local231.anInt3010, Static9.aClass60_1510, arg1.anInt229, (short) 7, local148, Static34.method611(new Class60[] { Static108.aClass60_809, Static189.aClass60_1370, local231.aClass60_1043 }));
								}
							} else if (!Static75.aBoolean98 || !Static94.method1629(Static166.method2717(arg1))) {
								@Pc(295) Class60[] local295 = local231.aClass60Array21;
								if (Static141.aBoolean172) {
									local295 = Static133.method2216(local295);
								}
								@Pc(309) int local309;
								@Pc(326) byte local326;
								if (Static94.method1629(Static166.method2717(arg1))) {
									for (local309 = 4; local309 >= 3; local309--) {
										if (local295 != null && local295[local309] != null) {
											if (local309 == 3) {
												local326 = 2;
											} else {
												local326 = 51;
											}
											Static56.method1061((long) local231.anInt3010, local295[local309], arg1.anInt229, local326, local148, Static34.method611(new Class60[] { Static211.aClass60_1198, local231.aClass60_1043 }));
										} else if (local309 == 4) {
											Static56.method1061((long) local231.anInt3010, Static104.aClass60_764, arg1.anInt229, (short) 51, local148, Static34.method611(new Class60[] { Static211.aClass60_1198, local231.aClass60_1043 }));
										}
									}
								}
								if (Static39.method664(Static166.method2717(arg1))) {
									Static56.method1061((long) local231.anInt3010, Static9.aClass60_1510, arg1.anInt229, (short) 18, local148, Static34.method611(new Class60[] { Static211.aClass60_1198, local231.aClass60_1043 }));
								}
								if (Static94.method1629(Static166.method2717(arg1)) && local295 != null) {
									for (local309 = 2; local309 >= 0; local309--) {
										if (local295[local309] != null) {
											local326 = 0;
											if (local309 == 0) {
												local326 = 1;
											}
											if (local309 == 1) {
												local326 = 58;
											}
											if (local309 == 2) {
												local326 = 22;
											}
											Static56.method1061((long) local231.anInt3010, local295[local309], arg1.anInt229, local326, local148, Static34.method611(new Class60[] { Static211.aClass60_1198, local231.aClass60_1043 }));
										}
									}
								}
								local295 = arg1.aClass60Array4;
								if (Static141.aBoolean172) {
									local295 = Static133.method2216(local295);
								}
								if (local295 != null) {
									for (local309 = 4; local309 >= 0; local309--) {
										if (local295[local309] != null) {
											local326 = 0;
											if (local309 == 0) {
												local326 = 5;
											}
											if (local309 == 1) {
												local326 = 35;
											}
											if (local309 == 2) {
												local326 = 24;
											}
											if (local309 == 3) {
												local326 = 38;
											}
											if (local309 == 4) {
												local326 = 25;
											}
											Static56.method1061((long) local231.anInt3010, local295[local309], arg1.anInt229, local326, local148, Static34.method611(new Class60[] { Static211.aClass60_1198, local231.aClass60_1043 }));
										}
									}
								}
								Static56.method1061((long) local231.anInt3010, Static34.aClass60_271, arg1.anInt229, (short) 1003, local148, Static34.method611(new Class60[] { Static211.aClass60_1198, local231.aClass60_1043 }));
							} else if ((Static210.anInt3912 & 0x10) == 16) {
								Static56.method1061((long) local231.anInt3010, Static36.aClass60_1324, arg1.anInt229, (short) 28, local148, Static34.method611(new Class60[] { Static73.aClass60_561, Static189.aClass60_1370, local231.aClass60_1043 }));
							}
						}
					}
					local148++;
				}
			}
		}
		if (!arg1.aBoolean13) {
			return;
		}
		if (Static75.aBoolean98) {
			if (Static156.method2635(Static166.method2717(arg1)) && (Static210.anInt3912 & 0x20) == 32) {
				Static56.method1061(0L, Static36.aClass60_1324, arg1.anInt229, (short) 33, arg1.anInt242, Static34.method611(new Class60[] { Static73.aClass60_561, Static110.aClass60_825, arg1.aClass60_79 }));
				return;
			}
			return;
		}
		@Pc(717) Class60 local717;
		for (local148 = 9; local148 >= 5; local148--) {
			local717 = Static22.method374(arg1, local148);
			if (local717 != null) {
				Static56.method1061((long) (local148 + 1), local717, arg1.anInt229, (short) 1001, arg1.anInt242, arg1.aClass60_79);
			}
		}
		local717 = Static149.method2552(arg1);
		if (local717 != null) {
			Static56.method1061(0L, local717, arg1.anInt229, (short) 20, arg1.anInt242, arg1.aClass60_79);
		}
		for (local154 = 4; local154 >= 0; local154--) {
			@Pc(771) Class60 local771 = Static22.method374(arg1, local154);
			if (local771 != null) {
				Static56.method1061((long) (local154 + 1), local771, arg1.anInt229, (short) 49, arg1.anInt242, arg1.aClass60_79);
			}
		}
		if (Static103.method1760(Static166.method2717(arg1))) {
			Static56.method1061(0L, Static74.aClass60_571, arg1.anInt229, (short) 26, arg1.anInt242, Static149.aClass60_1155);
			return;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZLclient!ai;II)[Lclient!nb;")
	public static Class1_Sub1_Sub6_Sub1[] method2302(@OriginalArg(1) Class7 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static87.method1515(arg2, arg1, arg0) ? Static124.method2107() : null;
	}
}
