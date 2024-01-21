import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
	public static int anInt2825;

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "Lclient!ga;")
	public static Class30 aClass30_39;

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
	public static int anInt2829;

	@OriginalMember(owner = "client!nd", name = "n", descriptor = "[I")
	public static int[] anIntArray379;

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
	public static int anInt2830;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1073 = Static169.method2903("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "Z")
	public static boolean aBoolean137 = false;

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "Ljava/lang/Object;")
	public static Object anObject1 = new Object();

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1075 = Static169.method2903("Loaded interfaces");

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1074 = aClass23_1075;

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "[Z")
	public static boolean[] aBooleanArray16 = new boolean[8];

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
	public static void method1952() {
		Static52.aClass79_11.method2659();
		Static103.aClass79_14.method2659();
		Static164.aClass79_26.method2659();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
	public static void method1953() {
		aBooleanArray16 = null;
		aClass23_1074 = null;
		aClass30_39 = null;
		aClass23_1073 = null;
		anObject1 = null;
		anIntArray379 = null;
		aClass23_1075 = null;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IBI)V")
	public static void method1954(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class56 local15 = Static41.aClass56ArrayArrayArray1[Static85.anInt2267][arg1][arg0];
		if (local15 == null) {
			Static123.aClass80_1.method2701(Static85.anInt2267, arg1, arg0);
			return;
		}
		@Pc(25) Class1_Sub1_Sub1_Sub7 local25 = null;
		@Pc(30) Class1_Sub1_Sub1_Sub7 local30 = (Class1_Sub1_Sub1_Sub7) local15.method1853();
		@Pc(32) int local32 = -99999999;
		while (local30 != null) {
			@Pc(38) Class1_Sub1_Sub7 local38 = Static2.method118(local30.anInt4373);
			@Pc(41) int local41 = local38.anInt1142;
			if (local38.anInt1155 == 1) {
				local41 *= local30.anInt4377 + 1;
			}
			if (local32 < local41) {
				local25 = local30;
				local32 = local41;
			}
			local30 = (Class1_Sub1_Sub1_Sub7) local15.method1855();
		}
		if (local25 == null) {
			Static123.aClass80_1.method2701(Static85.anInt2267, arg1, arg0);
			return;
		}
		local15.method1852(local25);
		local30 = (Class1_Sub1_Sub1_Sub7) local15.method1853();
		@Pc(85) Class1_Sub1_Sub1_Sub7 local85 = null;
		@Pc(93) int local93 = (arg0 << 7) + arg1 + 1610612736;
		@Pc(95) Class1_Sub1_Sub1_Sub7 local95 = null;
		while (local30 != null) {
			if (local25.anInt4373 != local30.anInt4373) {
				if (local95 == null) {
					local95 = local30;
				}
				if (local95.anInt4373 != local30.anInt4373 && local85 == null) {
					local85 = local30;
				}
			}
			local30 = (Class1_Sub1_Sub1_Sub7) local15.method1855();
		}
		Static123.aClass80_1.method2670(Static85.anInt2267, arg1, arg0, Static99.method1680(arg0 * 128 + 64, arg1 * 128 + 64, Static85.anInt2267), local25, local93, local95, local85);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!ob;IIB)V")
	public static void method1955(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0.anInt2981 == 1) {
			Static134.method2312(Static101.aClass23_1001, arg0.aClass23_1146, 0, 51, 0, arg0.anInt3019);
		}
		if (arg0.anInt2981 == 2 && !Static156.aBoolean195) {
			@Pc(31) Class23 local31 = Static93.method1620(arg0);
			if (local31 != null) {
				Static134.method2312(Static149.method2571(new Class23[] { Static154.aClass23_1451, arg0.aClass23_1139 }), local31, -1, 5, 0, arg0.anInt3019);
			}
		}
		if (arg0.anInt2981 == 3) {
			Static134.method2312(Static101.aClass23_1001, Static42.aClass23_439, 0, 9, 0, arg0.anInt3019);
		}
		if (arg0.anInt2981 == 4) {
			Static134.method2312(Static101.aClass23_1001, arg0.aClass23_1146, 0, 39, 0, arg0.anInt3019);
		}
		if (arg0.anInt2981 == 5) {
			Static134.method2312(Static101.aClass23_1001, arg0.aClass23_1146, 0, 15, 0, arg0.anInt3019);
		}
		if (arg0.anInt2981 == 6 && Static98.aClass60_5 == null) {
			Static134.method2312(Static101.aClass23_1001, arg0.aClass23_1146, -1, 10, 0, arg0.anInt3019);
		}
		@Pc(151) int local151;
		@Pc(145) int local145;
		if (arg0.anInt3032 == 2) {
			local145 = 0;
			for (@Pc(147) int local147 = 0; local147 < arg0.anInt3017; local147++) {
				for (local151 = 0; local151 < arg0.anInt3014; local151++) {
					@Pc(160) int local160 = (arg0.anInt3009 + 32) * local151;
					@Pc(167) int local167 = (arg0.anInt3003 + 32) * local147;
					if (local145 < 20) {
						local167 += arg0.anIntArray404[local145];
						local160 += arg0.anIntArray402[local145];
					}
					if (local160 <= arg1 && local167 <= arg2 && arg1 < local160 + 32 && local167 + 32 > arg2) {
						Static13.anInt453 = local145;
						Static149.aClass60_14 = arg0;
						if (arg0.anIntArray397[local145] > 0) {
							@Pc(237) Class1_Sub1_Sub7 local237 = Static2.method118(arg0.anIntArray397[local145] - 1);
							if (Static144.anInt3643 == 1 && Static170.method461(Static170.method475(arg0))) {
								if (Static16.anInt493 != arg0.anInt3019 || local145 != Static66.anInt1741) {
									Static134.method2312(Static149.method2571(new Class23[] { Static170.aClass23_284, Static61.aClass23_609, local237.aClass23_431 }), Static176.aClass23_1596, local145, 31, local237.anInt1165, arg0.anInt3019);
								}
							} else if (!Static156.aBoolean195 || !Static170.method461(Static170.method475(arg0))) {
								@Pc(259) Class23[] local259 = local237.aClass23Array3;
								if (Static49.aBoolean59) {
									local259 = Static111.method1966(local259);
								}
								@Pc(277) int local277;
								@Pc(325) byte local325;
								if (Static170.method461(Static170.method475(arg0))) {
									for (local277 = 4; local277 >= 3; local277--) {
										if (local259 != null && local259[local277] != null) {
											if (local277 == 3) {
												local325 = 44;
											} else {
												local325 = 25;
											}
											Static134.method2312(Static149.method2571(new Class23[] { Static45.aClass23_477, local237.aClass23_431 }), local259[local277], local145, local325, local237.anInt1165, arg0.anInt3019);
										} else if (local277 == 4) {
											Static134.method2312(Static149.method2571(new Class23[] { Static45.aClass23_477, local237.aClass23_431 }), Static108.aClass23_678, local145, 25, local237.anInt1165, arg0.anInt3019);
										}
									}
								}
								if (Static92.method1614(Static170.method475(arg0))) {
									Static134.method2312(Static149.method2571(new Class23[] { Static45.aClass23_477, local237.aClass23_431 }), Static176.aClass23_1596, local145, 23, local237.anInt1165, arg0.anInt3019);
								}
								if (Static170.method461(Static170.method475(arg0)) && local259 != null) {
									for (local277 = 2; local277 >= 0; local277--) {
										if (local259[local277] != null) {
											local325 = 0;
											if (local277 == 0) {
												local325 = 2;
											}
											if (local277 == 1) {
												local325 = 8;
											}
											if (local277 == 2) {
												local325 = 35;
											}
											Static134.method2312(Static149.method2571(new Class23[] { Static45.aClass23_477, local237.aClass23_431 }), local259[local277], local145, local325, local237.anInt1165, arg0.anInt3019);
										}
									}
								}
								local259 = arg0.aClass23Array16;
								if (Static49.aBoolean59) {
									local259 = Static111.method1966(local259);
								}
								if (local259 != null) {
									for (local277 = 4; local277 >= 0; local277--) {
										if (local259[local277] != null) {
											local325 = 0;
											if (local277 == 0) {
												local325 = 37;
											}
											if (local277 == 1) {
												local325 = 21;
											}
											if (local277 == 2) {
												local325 = 22;
											}
											if (local277 == 3) {
												local325 = 47;
											}
											if (local277 == 4) {
												local325 = 16;
											}
											Static134.method2312(Static149.method2571(new Class23[] { Static45.aClass23_477, local237.aClass23_431 }), local259[local277], local145, local325, local237.anInt1165, arg0.anInt3019);
										}
									}
								}
								Static134.method2312(Static149.method2571(new Class23[] { Static45.aClass23_477, local237.aClass23_431 }), Static111.aClass23_1080, local145, 1006, local237.anInt1165, arg0.anInt3019);
							} else if ((Static23.anInt701 & 0x10) == 16) {
								Static134.method2312(Static149.method2571(new Class23[] { Static25.aClass23_277, Static61.aClass23_609, local237.aClass23_431 }), Static123.aClass23_1195, local145, 48, local237.anInt1165, arg0.anInt3019);
							}
						}
					}
					local145++;
				}
			}
		}
		if (!arg0.aBoolean155) {
			return;
		}
		if (!Static156.aBoolean195) {
			@Pc(711) Class23 local711;
			for (local145 = 9; local145 >= 5; local145--) {
				local711 = Static90.method1592(local145, arg0);
				if (local711 != null) {
					Static134.method2312(arg0.aClass23_1140, local711, arg0.anInt3016, 1004, local145 + 1, arg0.anInt3019);
				}
			}
			local711 = Static93.method1620(arg0);
			if (local711 != null) {
				Static134.method2312(arg0.aClass23_1140, local711, arg0.anInt3016, 5, 0, arg0.anInt3019);
			}
			for (local151 = 4; local151 >= 0; local151--) {
				@Pc(766) Class23 local766 = Static90.method1592(local151, arg0);
				if (local766 != null) {
					Static134.method2312(arg0.aClass23_1140, local766, arg0.anInt3016, 29, local151 + 1, arg0.anInt3019);
				}
			}
			if (Static170.method465(Static170.method475(arg0))) {
				Static134.method2312(Static101.aClass23_1001, Static112.aClass23_1107, arg0.anInt3016, 10, 0, arg0.anInt3019);
			}
		} else if (Static125.method2224(Static170.method475(arg0)) && (Static23.anInt701 & 0x20) == 32) {
			Static134.method2312(Static149.method2571(new Class23[] { Static25.aClass23_277, Static92.aClass23_917, arg0.aClass23_1140 }), Static123.aClass23_1195, arg0.anInt3016, 58, 0, arg0.anInt3019);
		}
	}
}
