import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!wc", name = "C", descriptor = "I")
	public static int anInt4694;

	@OriginalMember(owner = "client!wc", name = "u", descriptor = "Lclient!ie;")
	public static Class53 aClass53_31 = new Class53(64);

	@OriginalMember(owner = "client!wc", name = "v", descriptor = "[Lclient!ia;")
	public static Class51[] aClass51Array31 = new Class51[100];

	@OriginalMember(owner = "client!wc", name = "A", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1607 = Static64.method1101("Take");

	@OriginalMember(owner = "client!wc", name = "y", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1606 = aClass51_1607;

	@OriginalMember(owner = "client!wc", name = "B", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1608 = Static64.method1101("settings");

	@OriginalMember(owner = "client!wc", name = "E", descriptor = "I")
	public static int anInt4695 = 0;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZ)I")
	public static int method3672(@OriginalArg(1) boolean arg0) {
		@Pc(8) long local8 = Static144.method2489();
		for (@Pc(20) Class1_Sub24 local20 = arg0 ? (Class1_Sub24) Static22.aClass102_2.method3086() : (Class1_Sub24) Static22.aClass102_2.method3087(); local20 != null; local20 = (Class1_Sub24) Static22.aClass102_2.method3087()) {
			if ((local20.aLong145 & 0x3FFFFFFFFFFFFFFFL) < local8) {
				if ((local20.aLong145 & 0x4000000000000000L) != 0L) {
					@Pc(49) int local49 = (int) local20.aLong170;
					Static86.anIntArray125[local49] = Static230.anIntArray379[local49];
					local20.method3758();
					return local49;
				}
				local20.method3758();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIBII)V")
	public static void method3673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static68.anInt1547 == 1) {
			Static122.aClass1_Sub2_Sub1Array11[Static12.anInt320 / 100].method2064(Static160.anInt3453 - 8, Static83.anInt1948 + -8);
		}
		if (Static68.anInt1547 == 2) {
			Static122.aClass1_Sub2_Sub1Array11[Static12.anInt320 / 100 + 4].method2064(Static160.anInt3453 - 8, Static83.anInt1948 + -8);
		}
		Static70.method1252();
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)J")
	public static long method3674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub7 local7 = Static22.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass119_1 == null ? 0L : local7.aClass119_1.aLong163;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILclient!me;BI)V")
	public static void method3675(@OriginalArg(0) int arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(3) int arg2) {
		if (arg1.anInt2852 == 1) {
			Static151.method2611(Static81.aClass51_607, arg1.aClass51_987, 0, arg1.anInt2807, (short) 9, 0L);
		}
		if (arg1.anInt2852 == 2 && !Static82.aBoolean82) {
			@Pc(37) Class51 local37 = Static112.method1884(arg1);
			if (local37 != null) {
				Static151.method2611(Static150.method2574(new Class51[] { Static161.aClass51_1226, arg1.aClass51_981 }), local37, -1, arg1.anInt2807, (short) 15, 0L);
			}
		}
		if (arg1.anInt2852 == 3) {
			Static151.method2611(Static81.aClass51_607, Static61.aClass51_436, 0, arg1.anInt2807, (short) 11, 0L);
		}
		if (arg1.anInt2852 == 4) {
			Static151.method2611(Static81.aClass51_607, arg1.aClass51_987, 0, arg1.anInt2807, (short) 50, 0L);
		}
		if (arg1.anInt2852 == 5) {
			Static151.method2611(Static81.aClass51_607, arg1.aClass51_987, 0, arg1.anInt2807, (short) 46, 0L);
		}
		if (arg1.anInt2852 == 6 && Static172.aClass71_30 == null) {
			Static151.method2611(Static81.aClass51_607, arg1.aClass51_987, -1, arg1.anInt2807, (short) 19, 0L);
		}
		@Pc(160) int local160;
		@Pc(154) int local154;
		if (arg1.anInt2777 == 2) {
			local154 = 0;
			for (@Pc(156) int local156 = 0; local156 < arg1.anInt2797; local156++) {
				for (local160 = 0; local160 < arg1.anInt2855; local160++) {
					@Pc(169) int local169 = (arg1.anInt2803 + 32) * local160;
					@Pc(176) int local176 = local156 * (arg1.anInt2826 + 32);
					if (local154 < 20) {
						local176 += arg1.anIntArray181[local154];
						local169 += arg1.anIntArray175[local154];
					}
					if (arg2 >= local169 && arg0 >= local176 && arg2 < local169 + 32 && local176 + 32 > arg0) {
						Static5.aClass71_29 = arg1;
						Static71.anInt1631 = local154;
						if (arg1.anIntArray177[local154] > 0) {
							@Pc(240) Class92 local240 = Static36.method637(arg1.anIntArray177[local154] - 1);
							if (Static54.anInt1264 == 1 && Static124.method3507(Static33.method587(arg1))) {
								if (arg1.anInt2807 != Static143.anInt3141 || local154 != Static52.anInt1233) {
									Static151.method2611(Static150.method2574(new Class51[] { Static87.aClass51_640, Static204.aClass51_1484, local240.aClass51_1254 }), Static25.aClass51_198, local154, arg1.anInt2807, (short) 25, (long) local240.anInt3665);
								}
							} else if (!Static82.aBoolean82 || !Static124.method3507(Static33.method587(arg1))) {
								@Pc(264) Class51[] local264 = local240.aClass51Array26;
								if (Static138.aBoolean138) {
									local264 = Static212.method3504(local264);
								}
								@Pc(277) int local277;
								@Pc(290) byte local290;
								if (Static124.method3507(Static33.method587(arg1))) {
									for (local277 = 4; local277 >= 3; local277--) {
										if (local264 != null && local264[local277] != null) {
											if (local277 == 3) {
												local290 = 42;
											} else {
												local290 = 17;
											}
											Static151.method2611(Static150.method2574(new Class51[] { Static134.aClass51_1061, local240.aClass51_1254 }), local264[local277], local154, arg1.anInt2807, local290, (long) local240.anInt3665);
										} else if (local277 == 4) {
											Static151.method2611(Static150.method2574(new Class51[] { Static134.aClass51_1061, local240.aClass51_1254 }), Static73.aClass51_557, local154, arg1.anInt2807, (short) 17, (long) local240.anInt3665);
										}
									}
								}
								if (Static36.method639(Static33.method587(arg1))) {
									Static151.method2611(Static150.method2574(new Class51[] { Static134.aClass51_1061, local240.aClass51_1254 }), Static25.aClass51_198, local154, arg1.anInt2807, (short) 32, (long) local240.anInt3665);
								}
								if (Static124.method3507(Static33.method587(arg1)) && local264 != null) {
									for (local277 = 2; local277 >= 0; local277--) {
										if (local264[local277] != null) {
											local290 = 0;
											if (local277 == 0) {
												local290 = 41;
											}
											if (local277 == 1) {
												local290 = 29;
											}
											if (local277 == 2) {
												local290 = 13;
											}
											Static151.method2611(Static150.method2574(new Class51[] { Static134.aClass51_1061, local240.aClass51_1254 }), local264[local277], local154, arg1.anInt2807, local290, (long) local240.anInt3665);
										}
									}
								}
								local264 = arg1.aClass51Array19;
								if (Static138.aBoolean138) {
									local264 = Static212.method3504(local264);
								}
								if (local264 != null) {
									for (local277 = 4; local277 >= 0; local277--) {
										if (local264[local277] != null) {
											local290 = 0;
											if (local277 == 0) {
												local290 = 38;
											}
											if (local277 == 1) {
												local290 = 40;
											}
											if (local277 == 2) {
												local290 = 23;
											}
											if (local277 == 3) {
												local290 = 57;
											}
											if (local277 == 4) {
												local290 = 36;
											}
											Static151.method2611(Static150.method2574(new Class51[] { Static134.aClass51_1061, local240.aClass51_1254 }), local264[local277], local154, arg1.anInt2807, local290, (long) local240.anInt3665);
										}
									}
								}
								Static151.method2611(Static150.method2574(new Class51[] { Static134.aClass51_1061, local240.aClass51_1254 }), Static168.aClass51_1282, local154, arg1.anInt2807, (short) 1003, (long) local240.anInt3665);
							} else if ((Static128.anInt4775 & 0x10) == 16) {
								Static151.method2611(Static150.method2574(new Class51[] { Static51.aClass51_374, Static204.aClass51_1484, local240.aClass51_1254 }), Static87.aClass51_641, local154, arg1.anInt2807, (short) 24, (long) local240.anInt3665);
							}
						}
					}
					local154++;
				}
			}
		}
		if (!arg1.aBoolean122) {
			return;
		}
		if (Static82.aBoolean82) {
			if (Static169.method2896(Static33.method587(arg1)) && (Static128.anInt4775 & 0x20) == 32) {
				Static151.method2611(Static150.method2574(new Class51[] { Static51.aClass51_374, Static108.aClass51_790, arg1.aClass51_984 }), Static87.aClass51_641, arg1.anInt2788, arg1.anInt2807, (short) 34, 0L);
				return;
			}
			return;
		}
		@Pc(741) Class51 local741;
		for (local154 = 9; local154 >= 5; local154--) {
			local741 = Static180.method3041(arg1, local154);
			if (local741 != null) {
				Static151.method2611(arg1.aClass51_984, local741, arg1.anInt2788, arg1.anInt2807, (short) 1005, (long) (local154 + 1));
			}
		}
		local741 = Static112.method1884(arg1);
		if (local741 != null) {
			Static151.method2611(arg1.aClass51_984, local741, arg1.anInt2788, arg1.anInt2807, (short) 15, 0L);
		}
		for (local160 = 4; local160 >= 0; local160--) {
			@Pc(797) Class51 local797 = Static180.method3041(arg1, local160);
			if (local797 != null) {
				Static151.method2611(arg1.aClass51_984, local797, arg1.anInt2788, arg1.anInt2807, (short) 35, (long) (local160 + 1));
			}
		}
		if (Static27.method513(Static33.method587(arg1))) {
			Static151.method2611(Static81.aClass51_607, Static164.aClass51_1253, arg1.anInt2788, arg1.anInt2807, (short) 19, 0L);
			return;
		}
	}
}
