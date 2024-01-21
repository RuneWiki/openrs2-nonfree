import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ag", name = "M", descriptor = "Lclient!da;")
	public static Class18 aClass18_1;

	@OriginalMember(owner = "client!ag", name = "U", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_76 = Static161.method2452("To create a new account you need to");

	@OriginalMember(owner = "client!ag", name = "O", descriptor = "Lclient!dc;")
	public static Class20 aClass20_73 = aClass20_76;

	@OriginalMember(owner = "client!ag", name = "R", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_74 = Static161.method2452("cross");

	@OriginalMember(owner = "client!ag", name = "S", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_75 = Static161.method2452("mapfunction");

	@OriginalMember(owner = "client!ag", name = "V", descriptor = "I")
	public static int anInt151 = 127;

	@OriginalMember(owner = "client!ag", name = "W", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_77 = Static161.method2452("sl_flags");

	@OriginalMember(owner = "client!ag", name = "Y", descriptor = "I")
	public static int anInt153 = 0;

	@OriginalMember(owner = "client!ag", name = "ab", descriptor = "I")
	public static int anInt155 = 0;

	@OriginalMember(owner = "client!ag", name = "gb", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_79 = Static161.method2452("Loaded config");

	@OriginalMember(owner = "client!ag", name = "eb", descriptor = "Lclient!dc;")
	public static Class20 aClass20_78 = aClass20_79;

	@OriginalMember(owner = "client!ag", name = "hb", descriptor = "[Lclient!ld;")
	public static final Class1_Sub2_Sub2[] aClass1_Sub2_Sub2Array1 = new Class1_Sub2_Sub2[2048];

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIBII)V")
	public static void method152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(23) int local23;
		@Pc(53) int local53;
		if (Static57.anInt1307 == 0 && !Static28.aBoolean32) {
			@Pc(19) int local19 = Static92.anInt1966;
			@Pc(21) int local21 = Static46.anInt1033;
			local23 = Static200.anInt3942;
			@Pc(25) int local25 = Static38.anInt828;
			@Pc(40) int local40 = (arg2 - arg3) * (local21 - local19) / arg4 + local19;
			local53 = local23 + (local25 - local23) * (arg5 - arg0) / arg1;
			Static175.method2670(0L, (short) 5, local40, Static215.aClass20_1545, Static38.aClass20_287, local53);
		}
		@Pc(67) long local67 = -1L;
		for (local23 = 0; local23 < Static134.anInt2785; local23++) {
			@Pc(75) long local75 = Static21.aLongArray49[local23];
			local53 = (int) local75 & 0x7F;
			@Pc(87) int local87 = (int) local75 >> 7 & 0x7F;
			@Pc(94) int local94 = Integer.MAX_VALUE & (int) (local75 >>> 32);
			@Pc(101) int local101 = (int) local75 >> 29 & 0x3;
			if (local75 != local67) {
				local67 = local75;
				@Pc(228) int local228;
				if (local101 == 2 && Static52.method912(Static111.anInt2327, local53, local87, local75)) {
					@Pc(124) Class5_Sub2_Sub7 local124 = Static63.method1046(local94);
					if (local124.anIntArray35 != null) {
						local124 = local124.method431();
					}
					if (local124 == null) {
						continue;
					}
					if (Static57.anInt1307 == 1) {
						Static175.method2670(local75, (short) 14, local53, Static70.method1166(new Class20[] { Static196.aClass20_1443, Static72.aClass20_527, local124.aClass20_211 }), Static180.aClass20_1324, local87);
					} else if (!Static28.aBoolean32) {
						@Pc(216) Class20[] local216 = local124.aClass20Array2;
						if (Static32.aBoolean44) {
							local216 = Static170.method2599(local216);
						}
						if (local216 != null) {
							for (local228 = 4; local228 >= 0; local228--) {
								if (local216[local228] != null) {
									@Pc(236) short local236 = 0;
									if (local228 == 0) {
										local236 = 29;
									}
									if (local228 == 1) {
										local236 = 39;
									}
									if (local228 == 2) {
										local236 = 37;
									}
									if (local228 == 3) {
										local236 = 10;
									}
									if (local228 == 4) {
										local236 = 1001;
									}
									Static175.method2670(local75, local236, local53, Static70.method1166(new Class20[] { Static120.aClass20_932, local124.aClass20_211 }), local216[local228], local87);
								}
							}
						}
						Static175.method2670((long) local124.anInt542, (short) 1005, local53, Static70.method1166(new Class20[] { Static120.aClass20_932, local124.aClass20_211 }), Static136.aClass20_1075, local87);
					} else if ((Static22.anInt2837 & 0x4) == 4) {
						Static175.method2670(local75, (short) 42, local53, Static70.method1166(new Class20[] { Static10.aClass20_115, Static72.aClass20_527, local124.aClass20_211 }), Static96.aClass20_754, local87);
					}
				}
				@Pc(347) int local347;
				@Pc(355) Class1_Sub2_Sub1 local355;
				@Pc(404) Class1_Sub2_Sub2 local404;
				if (local101 == 1) {
					@Pc(326) Class1_Sub2_Sub1 local326 = Static61.aClass1_Sub2_Sub1Array1[local94];
					if (local326.aClass5_Sub2_Sub20_1.anInt3610 == 1 && (local326.anInt2241 & 0x7F) == 64 && (local326.anInt2234 & 0x7F) == 64) {
						for (local347 = 0; local347 < Static83.anInt1850; local347++) {
							local355 = Static61.aClass1_Sub2_Sub1Array1[Static80.anIntArray175[local347]];
							if (local355 != null && local355 != local326 && local355.aClass5_Sub2_Sub20_1.anInt3610 == 1 && local326.anInt2241 == local355.anInt2241 && local355.anInt2234 == local326.anInt2234) {
								method153(local53, local87, local355.aClass5_Sub2_Sub20_1, Static80.anIntArray175[local347]);
							}
						}
						for (local228 = 0; local228 < Static66.anInt1444; local228++) {
							local404 = aClass1_Sub2_Sub2Array1[Static7.anIntArray13[local228]];
							if (local404 != null && local404.anInt2241 == local326.anInt2241 && local326.anInt2234 == local404.anInt2234) {
								Static62.method1029(local87, local53, Static7.anIntArray13[local228], local404);
							}
						}
					}
					method153(local53, local87, local326.aClass5_Sub2_Sub20_1, local94);
				}
				if (local101 == 0) {
					@Pc(453) Class1_Sub2_Sub2 local453 = aClass1_Sub2_Sub2Array1[local94];
					if ((local453.anInt2241 & 0x7F) == 64 && (local453.anInt2234 & 0x7F) == 64) {
						for (local347 = 0; local347 < Static83.anInt1850; local347++) {
							local355 = Static61.aClass1_Sub2_Sub1Array1[Static80.anIntArray175[local347]];
							if (local355 != null && local355.aClass5_Sub2_Sub20_1.anInt3610 == 1 && local453.anInt2241 == local355.anInt2241 && local453.anInt2234 == local355.anInt2234) {
								method153(local53, local87, local355.aClass5_Sub2_Sub20_1, Static80.anIntArray175[local347]);
							}
						}
						for (local228 = 0; local228 < Static66.anInt1444; local228++) {
							local404 = aClass1_Sub2_Sub2Array1[Static7.anIntArray13[local228]];
							if (local404 != null && local453 != local404 && local404.anInt2241 == local453.anInt2241 && local404.anInt2234 == local453.anInt2234) {
								Static62.method1029(local87, local53, Static7.anIntArray13[local228], local404);
							}
						}
					}
					Static62.method1029(local87, local53, local94, local453);
				}
				if (local101 == 3) {
					@Pc(577) Class91 local577 = Static159.aClass91ArrayArrayArray1[Static111.anInt2327][local53][local87];
					if (local577 != null) {
						for (@Pc(586) Class5_Sub2_Sub1 local586 = (Class5_Sub2_Sub1) local577.method2687(); local586 != null; local586 = (Class5_Sub2_Sub1) local577.method2685()) {
							local228 = local586.aClass1_Sub3_1.anInt1380;
							@Pc(596) Class5_Sub2_Sub11 local596 = Static196.method2908(local228);
							if (Static57.anInt1307 == 1) {
								Static175.method2670((long) local228, (short) 43, local53, Static70.method1166(new Class20[] { Static196.aClass20_1443, Static33.aClass20_258, local596.aClass20_861 }), Static180.aClass20_1324, local87);
							} else if (!Static28.aBoolean32) {
								@Pc(608) Class20[] local608 = local596.aClass20Array18;
								if (Static32.aBoolean44) {
									local608 = Static170.method2599(local608);
								}
								for (@Pc(616) int local616 = 4; local616 >= 0; local616--) {
									if (local608 != null && local608[local616] != null) {
										@Pc(630) byte local630 = 0;
										if (local616 == 0) {
											local630 = 17;
										}
										if (local616 == 1) {
											local630 = 12;
										}
										if (local616 == 2) {
											local630 = 46;
										}
										if (local616 == 3) {
											local630 = 34;
										}
										if (local616 == 4) {
											local630 = 33;
										}
										Static175.method2670((long) local228, local630, local53, Static70.method1166(new Class20[] { Static171.aClass20_1270, local596.aClass20_861 }), local608[local616], local87);
									} else if (local616 == 2) {
										Static175.method2670((long) local228, (short) 46, local53, Static70.method1166(new Class20[] { Static171.aClass20_1270, local596.aClass20_861 }), Static37.aClass20_470, local87);
									}
								}
								Static175.method2670((long) local228, (short) 1003, local53, Static70.method1166(new Class20[] { Static171.aClass20_1270, local596.aClass20_861 }), Static136.aClass20_1075, local87);
							} else if ((Static22.anInt2837 & 0x1) == 1) {
								Static175.method2670((long) local228, (short) 35, local53, Static70.method1166(new Class20[] { Static10.aClass20_115, Static33.aClass20_258, local596.aClass20_861 }), Static96.aClass20_754, local87);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILclient!sj;ZI)V")
	private static void method153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub2_Sub20 arg2, @OriginalArg(4) int arg3) {
		if (Static85.anInt1879 >= 400) {
			return;
		}
		if (arg2.anIntArray373 != null) {
			arg2 = arg2.method2717();
		}
		if (arg2 == null || !arg2.aBoolean165) {
			return;
		}
		@Pc(37) Class20 local37 = arg2.aClass20_1325;
		if (arg2.anInt3605 != 0) {
			local37 = Static70.method1166(new Class20[] { local37, Static3.method97(Static210.aClass1_Sub2_Sub2_2.anInt2275, arg2.anInt3605), Static186.aClass20_1373, Static116.aClass20_900, Static132.method2805(arg2.anInt3605), Static65.aClass20_489 });
		}
		if (Static57.anInt1307 == 1) {
			Static175.method2670((long) arg3, (short) 32, arg0, Static70.method1166(new Class20[] { Static196.aClass20_1443, Static115.aClass20_889, local37 }), Static180.aClass20_1324, arg1);
		} else if (!Static28.aBoolean32) {
			@Pc(91) Class20[] local91 = arg2.aClass20Array28;
			if (Static32.aBoolean44) {
				local91 = Static170.method2599(local91);
			}
			@Pc(101) int local101;
			if (local91 != null) {
				for (local101 = 4; local101 >= 0; local101--) {
					if (local91[local101] != null && (Static167.anInt3347 != 0 || !local91[local101].method551(Static61.aClass20_464))) {
						@Pc(118) byte local118 = 0;
						if (local101 == 0) {
							local118 = 58;
						}
						if (local101 == 1) {
							local118 = 45;
						}
						if (local101 == 2) {
							local118 = 31;
						}
						if (local101 == 3) {
							local118 = 1;
						}
						if (local101 == 4) {
							local118 = 48;
						}
						Static175.method2670((long) arg3, local118, arg0, Static70.method1166(new Class20[] { Static43.aClass20_330, local37 }), local91[local101], arg1);
					}
				}
			}
			if (Static167.anInt3347 == 0 && local91 != null) {
				for (local101 = 4; local101 >= 0; local101--) {
					if (local91[local101] != null && local91[local101].method551(Static61.aClass20_464)) {
						@Pc(203) short local203 = 0;
						@Pc(205) short local205 = 0;
						if (local101 == 0) {
							local205 = 58;
						}
						if (Static210.aClass1_Sub2_Sub2_2.anInt2275 < arg2.anInt3605) {
							local203 = 2000;
						}
						if (local101 == 1) {
							local205 = 45;
						}
						if (local101 == 2) {
							local205 = 31;
						}
						if (local101 == 3) {
							local205 = 1;
						}
						if (local101 == 4) {
							local205 = 48;
						}
						if (local205 != 0) {
							local205 += local203;
						}
						Static175.method2670((long) arg3, local205, arg0, Static70.method1166(new Class20[] { Static43.aClass20_330, local37 }), local91[local101], arg1);
					}
				}
			}
			Static175.method2670((long) arg3, (short) 1004, arg0, Static70.method1166(new Class20[] { Static43.aClass20_330, local37 }), Static136.aClass20_1075, arg1);
			return;
		} else if ((Static22.anInt2837 & 0x2) == 2) {
			Static175.method2670((long) arg3, (short) 21, arg0, Static70.method1166(new Class20[] { Static10.aClass20_115, Static115.aClass20_889, local37 }), Static96.aClass20_754, arg1);
			return;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I[BIB)Z")
	public static boolean method154(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(11) boolean local11 = true;
		@Pc(16) Class5_Sub6 local16 = new Class5_Sub6(arg1);
		@Pc(22) int local22 = -1;
		label56: while (true) {
			@Pc(26) int local26 = local16.method3048();
			if (local26 == 0) {
				return local11;
			}
			local22 += local26;
			@Pc(37) int local37 = 0;
			@Pc(39) boolean local39 = false;
			while (true) {
				@Pc(45) int local45;
				while (!local39) {
					local45 = local16.method3033();
					if (local45 == 0) {
						continue label56;
					}
					local37 += local45 - 1;
					@Pc(77) int local77 = local16.method3062() >> 2;
					@Pc(83) int local83 = local37 >> 6 & 0x3F;
					@Pc(87) int local87 = arg2 + local83;
					@Pc(91) int local91 = local37 & 0x3F;
					@Pc(95) int local95 = arg0 + local91;
					if (local87 > 0 && local95 > 0 && local87 < 103 && local95 < 103) {
						@Pc(114) Class5_Sub2_Sub7 local114 = Static63.method1046(local22);
						if (local77 != 22 || !Static14.aBoolean14 || local114.anInt543 != 0 || local114.anInt548 == 1 || local114.aBoolean31) {
							if (!local114.method427()) {
								local11 = false;
								Static52.anInt1112++;
							}
							local39 = true;
						}
					}
				}
				local45 = local16.method3033();
				if (local45 == 0) {
					break;
				}
				local16.method3062();
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(JB)V")
	public static void method155(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < Static91.anInt1957; local12++) {
			if (arg0 == Static129.aLongArray29[local12]) {
				Static91.anInt1957--;
				for (@Pc(34) int local34 = local12; local34 < Static91.anInt1957; local34++) {
					Static70.aClass20Array7[local34] = Static70.aClass20Array7[local34 + 1];
					Static142.anIntArray315[local34] = Static142.anIntArray315[local34 + 1];
					Static178.aClass20Array27[local34] = Static178.aClass20Array27[local34 + 1];
					Static129.aLongArray29[local34] = Static129.aLongArray29[local34 + 1];
					Static24.anIntArray31[local34] = Static24.anIntArray31[local34 + 1];
					Static209.aBooleanArray50[local34] = Static209.aBooleanArray50[local34 + 1];
				}
				Static148.anInt3054 = Static98.anInt2085;
				Static43.aClass5_Sub6_Sub1_2.method3087(47);
				Static43.aClass5_Sub6_Sub1_2.method3037(arg0);
				break;
			}
		}
	}
}
