import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!h", name = "D", descriptor = "Lclient!oc;")
	public static Class71_Sub1 aClass71_Sub1_7;

	@OriginalMember(owner = "client!h", name = "N", descriptor = "I")
	public static int anInt1469;

	@OriginalMember(owner = "client!h", name = "Q", descriptor = "I")
	public static int anInt1471;

	@OriginalMember(owner = "client!h", name = "u", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_494 = Static151.method2243("cyan:");

	@OriginalMember(owner = "client!h", name = "t", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_493 = aClass62_494;

	@OriginalMember(owner = "client!h", name = "v", descriptor = "[I")
	public static final int[] anIntArray123 = new int[2000];

	@OriginalMember(owner = "client!h", name = "w", descriptor = "Lclient!mb;")
	public static Class62 aClass62_495 = aClass62_494;

	@OriginalMember(owner = "client!h", name = "O", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_499 = Static151.method2243("Close");

	@OriginalMember(owner = "client!h", name = "x", descriptor = "Lclient!mb;")
	public static Class62 aClass62_496 = aClass62_499;

	@OriginalMember(owner = "client!h", name = "y", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_497 = Static151.method2243("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!h", name = "B", descriptor = "[I")
	public static final int[] anIntArray124 = new int[4000];

	@OriginalMember(owner = "client!h", name = "I", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_498 = Static151.method2243(" <col=ffffff>");

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IBLclient!ii;I)V")
	public static void method989(@OriginalArg(0) int arg0, @OriginalArg(2) Class47 arg1, @OriginalArg(3) int arg2) {
		if (arg1.anInt1847 == 1) {
			Static99.method1601(Static69.aClass62_484, arg1.aClass62_612, 0L, (short) 14, arg1.anInt1886, 0);
		}
		if (arg1.anInt1847 == 2 && !Static8.aBoolean12) {
			@Pc(40) Class62 local40 = Static22.method394(arg1);
			if (local40 != null) {
				Static99.method1601(Static169.method2460(new Class62[] { Static176.aClass62_1311, arg1.aClass62_617 }), local40, 0L, (short) 31, arg1.anInt1886, -1);
			}
		}
		if (arg1.anInt1847 == 3) {
			Static99.method1601(Static69.aClass62_484, aClass62_496, 0L, (short) 11, arg1.anInt1886, 0);
		}
		if (arg1.anInt1847 == 4) {
			Static99.method1601(Static69.aClass62_484, arg1.aClass62_612, 0L, (short) 36, arg1.anInt1886, 0);
		}
		if (arg1.anInt1847 == 5) {
			Static99.method1601(Static69.aClass62_484, arg1.aClass62_612, 0L, (short) 58, arg1.anInt1886, 0);
		}
		if (arg1.anInt1847 == 6 && Static154.aClass47_14 == null) {
			Static99.method1601(Static69.aClass62_484, arg1.aClass62_612, 0L, (short) 3, arg1.anInt1886, -1);
		}
		@Pc(162) int local162;
		@Pc(156) int local156;
		if (arg1.anInt1870 == 2) {
			local156 = 0;
			for (@Pc(158) int local158 = 0; local158 < arg1.anInt1837; local158++) {
				for (local162 = 0; local162 < arg1.anInt1845; local162++) {
					@Pc(171) int local171 = (arg1.anInt1903 + 32) * local158;
					@Pc(178) int local178 = (arg1.anInt1843 + 32) * local162;
					if (local156 < 20) {
						local171 += arg1.anIntArray165[local156];
						local178 += arg1.anIntArray163[local156];
					}
					if (local178 <= arg2 && arg0 >= local171 && local178 + 32 > arg2 && arg0 < local171 + 32) {
						Static102.aClass47_10 = arg1;
						Static43.anInt983 = local156;
						if (arg1.anIntArray169[local156] > 0) {
							@Pc(244) Class2_Sub1_Sub26 local244 = Static52.method774(arg1.anIntArray169[local156] - 1);
							if (Static97.anInt2284 == 1 && Static124.method1932(Static155.method2304(arg1))) {
								if (Static103.anInt2276 != arg1.anInt1886 || local156 != Static61.anInt1288) {
									Static99.method1601(Static169.method2460(new Class62[] { Static155.aClass62_1179, Static63.aClass62_445, local244.aClass62_1540 }), Static169.aClass62_1261, (long) local244.anInt4521, (short) 28, arg1.anInt1886, local156);
								}
							} else if (!Static8.aBoolean12 || !Static124.method1932(Static155.method2304(arg1))) {
								@Pc(304) Class62[] local304 = local244.aClass62Array137;
								if (Static180.aBoolean166) {
									local304 = Static16.method310(local304);
								}
								@Pc(318) int local318;
								@Pc(367) byte local367;
								if (Static124.method1932(Static155.method2304(arg1))) {
									for (local318 = 4; local318 >= 3; local318--) {
										if (local304 != null && local304[local318] != null) {
											if (local318 == 3) {
												local367 = 5;
											} else {
												local367 = 34;
											}
											Static99.method1601(Static169.method2460(new Class62[] { Static209.aClass62_1504, local244.aClass62_1540 }), local304[local318], (long) local244.anInt4521, local367, arg1.anInt1886, local156);
										} else if (local318 == 4) {
											Static99.method1601(Static169.method2460(new Class62[] { Static209.aClass62_1504, local244.aClass62_1540 }), Static133.aClass62_1008, (long) local244.anInt4521, (short) 34, arg1.anInt1886, local156);
										}
									}
								}
								if (Static11.method218(Static155.method2304(arg1))) {
									Static99.method1601(Static169.method2460(new Class62[] { Static209.aClass62_1504, local244.aClass62_1540 }), Static169.aClass62_1261, (long) local244.anInt4521, (short) 42, arg1.anInt1886, local156);
								}
								if (Static124.method1932(Static155.method2304(arg1)) && local304 != null) {
									for (local318 = 2; local318 >= 0; local318--) {
										if (local304[local318] != null) {
											local367 = 0;
											if (local318 == 0) {
												local367 = 19;
											}
											if (local318 == 1) {
												local367 = 6;
											}
											if (local318 == 2) {
												local367 = 1;
											}
											Static99.method1601(Static169.method2460(new Class62[] { Static209.aClass62_1504, local244.aClass62_1540 }), local304[local318], (long) local244.anInt4521, local367, arg1.anInt1886, local156);
										}
									}
								}
								local304 = arg1.aClass62Array54;
								if (Static180.aBoolean166) {
									local304 = Static16.method310(local304);
								}
								if (local304 != null) {
									for (local318 = 4; local318 >= 0; local318--) {
										if (local304[local318] != null) {
											local367 = 0;
											if (local318 == 0) {
												local367 = 57;
											}
											if (local318 == 1) {
												local367 = 4;
											}
											if (local318 == 2) {
												local367 = 9;
											}
											if (local318 == 3) {
												local367 = 35;
											}
											if (local318 == 4) {
												local367 = 25;
											}
											Static99.method1601(Static169.method2460(new Class62[] { Static209.aClass62_1504, local244.aClass62_1540 }), local304[local318], (long) local244.anInt4521, local367, arg1.anInt1886, local156);
										}
									}
								}
								Static99.method1601(Static169.method2460(new Class62[] { Static209.aClass62_1504, local244.aClass62_1540 }), Static76.aClass62_542, (long) local244.anInt4521, (short) 1001, arg1.anInt1886, local156);
							} else if ((Static34.anInt818 & 0x10) == 16) {
								Static99.method1601(Static169.method2460(new Class62[] { Static145.aClass62_1077, Static63.aClass62_445, local244.aClass62_1540 }), Static125.aClass62_970, (long) local244.anInt4521, (short) 23, arg1.anInt1886, local156);
							}
						}
					}
					local156++;
				}
			}
		}
		if (!arg1.aBoolean95) {
			return;
		}
		if (!Static8.aBoolean12) {
			@Pc(689) Class62 local689;
			for (local156 = 9; local156 >= 5; local156--) {
				local689 = Static134.method2039(arg1, local156);
				if (local689 != null) {
					Static99.method1601(arg1.aClass62_614, local689, (long) (local156 + 1), (short) 1003, arg1.anInt1886, arg1.anInt1860);
				}
			}
			local689 = Static22.method394(arg1);
			if (local689 != null) {
				Static99.method1601(arg1.aClass62_614, local689, 0L, (short) 31, arg1.anInt1886, arg1.anInt1860);
			}
			for (local162 = 4; local162 >= 0; local162--) {
				@Pc(743) Class62 local743 = Static134.method2039(arg1, local162);
				if (local743 != null) {
					Static99.method1601(arg1.aClass62_614, local743, (long) (local162 + 1), (short) 22, arg1.anInt1886, arg1.anInt1860);
				}
			}
			if (Static22.method396(Static155.method2304(arg1))) {
				Static99.method1601(Static69.aClass62_484, Static33.aClass62_254, 0L, (short) 3, arg1.anInt1886, arg1.anInt1860);
				return;
			}
			return;
		}
		if (Static116.method1789(Static155.method2304(arg1)) && (Static34.anInt818 & 0x20) == 32) {
			Static99.method1601(Static169.method2460(new Class62[] { Static145.aClass62_1077, Static128.aClass62_41, arg1.aClass62_614 }), Static125.aClass62_970, 0L, (short) 17, arg1.anInt1886, arg1.anInt1860);
			return;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIII)V")
	public static void method991(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(3) int local3 = 0;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = arg3;
		@Pc(16) int local16 = arg4 - arg0;
		@Pc(21) int local21 = arg3 - arg0;
		@Pc(25) int local25 = arg4 * arg4;
		@Pc(29) int local29 = arg3 * arg3;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local33 << 1;
		@Pc(53) int local53 = local37 << 1;
		@Pc(57) int local57 = arg3 << 1;
		@Pc(66) int local66 = local21 << 1;
		@Pc(75) int local75 = local29 - (local57 - 1) * local45;
		@Pc(83) int local83 = local41 + (1 - local57) * local25;
		@Pc(91) int local91 = local33 * (1 - local66) + local53;
		@Pc(100) int local100 = local37 - local49 * (local66 - 1);
		@Pc(104) int local104 = local25 << 2;
		@Pc(108) int local108 = local33 << 2;
		@Pc(112) int local112 = local37 << 2;
		@Pc(116) int local116 = local29 << 2;
		@Pc(120) int local120 = local41 * 3;
		@Pc(124) int local124 = local53 * 3;
		@Pc(130) int local130 = local49 * (local66 - 3);
		@Pc(136) int local136 = local45 * (local57 - 3);
		@Pc(142) int local142 = local104 * (arg3 - 1);
		@Pc(144) int local144 = local116;
		@Pc(146) int local146 = local112;
		@Pc(173) int local173;
		@Pc(182) int local182;
		@Pc(191) int local191;
		@Pc(199) int local199;
		if (Static154.anInt3307 <= arg1 && Static15.anInt353 >= arg1) {
			@Pc(164) int[] local164 = Static55.anIntArrayArray8[arg1];
			local173 = Static144.method2183(arg6 - arg4, Static122.anInt2718, Static153.anInt3279);
			local182 = Static144.method2183(arg6 + arg4, Static122.anInt2718, Static153.anInt3279);
			local191 = Static144.method2183(arg6 - local16, Static122.anInt2718, Static153.anInt3279);
			local199 = Static144.method2183(arg6 + local16, Static122.anInt2718, Static153.anInt3279);
			Static19.method345(arg5, local164, local173, local191);
			Static19.method345(arg2, local164, local191, local199);
			Static19.method345(arg5, local164, local199, local182);
		}
		@Pc(223) int local223 = local108 * (local21 - 1);
		while (local11 > 0) {
			if (local83 < 0) {
				while (local83 < 0) {
					local75 += local144;
					local3++;
					local83 += local120;
					local144 += local116;
					local120 += local116;
				}
			}
			if (local75 < 0) {
				local83 += local120;
				local75 += local144;
				local144 += local116;
				local120 += local116;
				local3++;
			}
			@Pc(277) boolean local277 = local11 <= local21;
			local83 += -local142;
			local11--;
			if (local277) {
				if (local91 < 0) {
					while (local91 < 0) {
						local91 += local124;
						local124 += local112;
						local9++;
						local100 += local146;
						local146 += local112;
					}
				}
				if (local100 < 0) {
					local91 += local124;
					local100 += local146;
					local9++;
					local146 += local112;
					local124 += local112;
				}
				local91 += -local223;
				local223 -= local108;
				local100 += -local130;
				local130 -= local108;
			}
			local75 += -local136;
			local136 -= local104;
			local142 -= local104;
			local173 = arg1 - local11;
			local182 = local11 + arg1;
			if (Static154.anInt3307 <= local182 && local173 <= Static15.anInt353) {
				local191 = Static144.method2183(local3 + arg6, Static122.anInt2718, Static153.anInt3279);
				local199 = Static144.method2183(arg6 - local3, Static122.anInt2718, Static153.anInt3279);
				if (local277) {
					@Pc(435) int local435 = Static144.method2183(local9 + arg6, Static122.anInt2718, Static153.anInt3279);
					@Pc(444) int local444 = Static144.method2183(arg6 - local9, Static122.anInt2718, Static153.anInt3279);
					@Pc(455) int[] local455;
					if (Static154.anInt3307 <= local173) {
						local455 = Static55.anIntArrayArray8[local173];
						Static19.method345(arg5, local455, local199, local444);
						Static19.method345(arg2, local455, local444, local435);
						Static19.method345(arg5, local455, local435, local191);
					}
					if (local182 <= Static15.anInt353) {
						local455 = Static55.anIntArrayArray8[local182];
						Static19.method345(arg5, local455, local199, local444);
						Static19.method345(arg2, local455, local444, local435);
						Static19.method345(arg5, local455, local435, local191);
					}
				} else {
					if (Static154.anInt3307 <= local173) {
						Static19.method345(arg5, Static55.anIntArrayArray8[local173], local199, local191);
					}
					if (local182 <= Static15.anInt353) {
						Static19.method345(arg5, Static55.anIntArrayArray8[local182], local199, local191);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIII)I")
	public static int method992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((Static133.aByteArrayArrayArray11[arg1][arg0][arg2] & 0x8) == 0) {
			return arg1 <= 0 || (Static133.aByteArrayArrayArray11[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}
}
