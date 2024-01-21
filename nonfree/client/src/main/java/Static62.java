import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
	public static int anInt1511;

	@OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
	public static int anInt1512;

	@OriginalMember(owner = "client!gf", name = "i", descriptor = "Lclient!od;")
	public static Class2_Sub2_Sub5 aClass2_Sub2_Sub5_1;

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
	public static int anInt1513;

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
	public static int anInt1509 = -1;

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "[I")
	public static final int[] anIntArray123 = new int[4000];

	@OriginalMember(owner = "client!gf", name = "k", descriptor = "[I")
	public static final int[] anIntArray124 = new int[5];

	@OriginalMember(owner = "client!gf", name = "n", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_478 = Static181.method2795("Stufe)2");

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!kg;IBI)V")
	public static void method1181(@OriginalArg(0) int arg0, @OriginalArg(1) Class24_Sub4_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 == Static54.aClass24_Sub4_Sub1_1 || Static98.anInt2124 >= 400) {
			return;
		}
		@Pc(45) Class83 local45;
		if (arg1.anInt2300 == 0) {
			local45 = Static67.method1268(new Class83[] { arg1.aClass83_664, Static114.method2020(arg1.anInt2299, Static54.aClass24_Sub4_Sub1_1.anInt2299), Static55.aClass83_417, Static197.aClass83_1129, Static129.method2179(arg1.anInt2299), Static203.aClass83_1153 });
		} else {
			local45 = Static67.method1268(new Class83[] { arg1.aClass83_664, Static55.aClass83_417, Static182.aClass83_1065, Static129.method2179(arg1.anInt2300), Static203.aClass83_1153 });
		}
		@Pc(124) int local124;
		if (Static150.anInt3074 == 1) {
			Static43.method884(Static206.aClass83_1171, arg0, arg3, Static67.method1268(new Class83[] { Static99.aClass83_646, Static39.aClass83_330, local45 }), (short) 23, (long) arg2);
		} else if (!Static142.aBoolean141) {
			for (local124 = 7; local124 >= 0; local124--) {
				if (Static146.aClass83Array51[local124] != null) {
					@Pc(138) short local138 = 0;
					if (Static180.anInt3675 == 0 && Static146.aClass83Array51[local124].method2398(Static184.aClass83_1074)) {
						if (arg1.anInt2299 > Static54.aClass24_Sub4_Sub1_1.anInt2299) {
							local138 = 2000;
						}
						if (Static54.aClass24_Sub4_Sub1_1.anInt2307 != 0 && arg1.anInt2307 != 0) {
							if (Static54.aClass24_Sub4_Sub1_1.anInt2307 == arg1.anInt2307) {
								local138 = 2000;
							} else {
								local138 = 0;
							}
						}
					} else if (Static154.aBooleanArray19[local124]) {
						local138 = 2000;
					}
					@Pc(193) short local193 = Static206.aShortArray59[local124];
					@Pc(198) short local198 = (short) (local193 + local138);
					Static43.method884(Static146.aClass83Array51[local124], arg0, arg3, Static67.method1268(new Class83[] { Static2.aClass83_8, local45 }), local198, (long) arg2);
				}
			}
		} else if ((Static75.anInt1757 & 0x8) == 8) {
			Static43.method884(Static171.aClass83_1013, arg0, arg3, Static67.method1268(new Class83[] { Static163.aClass83_962, Static39.aClass83_330, local45 }), (short) 6, (long) arg2);
		}
		for (local124 = 0; local124 < Static98.anInt2124; local124++) {
			if (Static22.aShortArray9[local124] == 10) {
				Static22.aClass83Array12[local124] = Static67.method1268(new Class83[] { Static2.aClass83_8, local45 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIII)V")
	public static void method1182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= Static35.anInt916 * 128) {
			arg0 = Static35.anInt916 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= Static31.anInt825 * 128) {
			arg2 = Static31.anInt825 * 128 - 1;
		}
		Static18.anInt2019++;
		Static163.anInt3267 = Class16.anIntArray44[arg3];
		Static48.anInt1235 = Class16.anIntArray39[arg3];
		Static112.anInt1951 = Class16.anIntArray44[arg4];
		Static213.anInt4239 = Class16.anIntArray39[arg4];
		Static87.anInt1883 = arg0;
		Static57.anInt1428 = arg1;
		Static95.anInt2024 = arg2;
		Static206.anInt4069 = arg0 / 128;
		Static4.anInt96 = arg2 / 128;
		Static16.anInt2436 = arg5;
		Static144.anInt3014 = Static206.anInt4069 - Static80.anInt1786;
		if (Static144.anInt3014 < 0) {
			Static144.anInt3014 = 0;
		}
		Static197.anInt3926 = Static4.anInt96 - Static80.anInt1786;
		if (Static197.anInt3926 < 0) {
			Static197.anInt3926 = 0;
		}
		Static119.anInt2712 = Static206.anInt4069 + Static80.anInt1786;
		if (Static119.anInt2712 > Static35.anInt916) {
			Static119.anInt2712 = Static35.anInt916;
		}
		Static153.anInt3348 = Static4.anInt96 + Static80.anInt1786;
		if (Static153.anInt3348 > Static31.anInt825) {
			Static153.anInt3348 = Static31.anInt825;
		}
		@Pc(108) int local108;
		@Pc(119) int local119;
		@Pc(129) int local129;
		@Pc(135) int local135;
		@Pc(141) int local141;
		@Pc(163) int local163;
		@Pc(175) int local175;
		for (@Pc(105) int local105 = 0; local105 < Static80.anInt1786 + Static80.anInt1786 + 2; local105++) {
			for (local108 = 0; local108 < Static80.anInt1786 + Static80.anInt1786 + 2; local108++) {
				local119 = (local105 - Static80.anInt1786 << 7) - (arg0 & 0x7F);
				local129 = (local108 - Static80.anInt1786 << 7) - (arg2 & 0x7F);
				local135 = Static206.anInt4069 + local105 - Static80.anInt1786;
				local141 = Static4.anInt96 + local108 - Static80.anInt1786;
				if (local135 >= 0 && local141 >= 0 && local135 < Static35.anInt916 && local141 < Static31.anInt825) {
					local163 = Static27.anIntArrayArrayArray3[0][local135][local141] + 128 - arg1;
					local175 = Static27.anIntArrayArrayArray3[3][local135][local141] - arg1 - 1000;
					Static190.aBooleanArrayArray2[local105][local108] = Static48.method953(local119, local175, local163, local129);
				} else {
					Static190.aBooleanArrayArray2[local105][local108] = false;
				}
			}
		}
		for (local108 = 0; local108 < Static80.anInt1786 + Static80.anInt1786 + 1; local108++) {
			for (local119 = 0; local119 < Static80.anInt1786 + Static80.anInt1786 + 1; local119++) {
				Static58.aBooleanArrayArray1[local108][local119] = Static190.aBooleanArrayArray2[local108][local119] || Static190.aBooleanArrayArray2[local108 + 1][local119] || Static190.aBooleanArrayArray2[local108][local119 + 1] || Static190.aBooleanArrayArray2[local108 + 1][local119 + 1];
			}
		}
		Static125.method2112();
		Static192.anInt3806 = 0;
		for (local119 = Static74.anInt1724; local119 < Static135.anInt2895; local119++) {
			@Pc(281) Class2_Sub23[][] local281 = Static203.aClass2_Sub23ArrayArrayArray1[local119];
			for (local135 = Static144.anInt3014; local135 < Static119.anInt2712; local135++) {
				for (local141 = Static197.anInt3926; local141 < Static153.anInt3348; local141++) {
					@Pc(293) Class2_Sub23 local293 = local281[local135][local141];
					if (local293 != null) {
						if (local293.anInt3552 <= arg5 && Static58.aBooleanArrayArray1[local135 + Static80.anInt1786 - Static206.anInt4069][local141 + Static80.anInt1786 - Static4.anInt96]) {
							local293.aBoolean166 = true;
							local293.aBoolean165 = true;
							if (local293.anInt3554 > 0) {
								local293.aBoolean167 = true;
							} else {
								local293.aBoolean167 = false;
							}
							Static192.anInt3806++;
						} else {
							local293.aBoolean166 = false;
							local293.aBoolean165 = false;
							local293.anInt3562 = 0;
						}
					}
				}
			}
		}
		@Pc(383) int local383;
		@Pc(388) int local388;
		@Pc(392) int local392;
		for (local129 = Static74.anInt1724; local129 < Static135.anInt2895; local129++) {
			@Pc(362) Class2_Sub23[][] local362 = Static203.aClass2_Sub23ArrayArrayArray1[local129];
			for (local141 = -Static80.anInt1786; local141 <= 0; local141++) {
				local163 = Static206.anInt4069 + local141;
				local175 = Static206.anInt4069 - local141;
				if (local163 >= Static144.anInt3014 || local175 < Static119.anInt2712) {
					for (local383 = -Static80.anInt1786; local383 <= 0; local383++) {
						local388 = Static4.anInt96 + local383;
						local392 = Static4.anInt96 - local383;
						@Pc(404) Class2_Sub23 local404;
						if (local163 >= Static144.anInt3014) {
							if (local388 >= Static197.anInt3926) {
								local404 = local362[local163][local388];
								if (local404 != null && local404.aBoolean166) {
									Static127.method2162(local404, true);
								}
							}
							if (local392 < Static153.anInt3348) {
								local404 = local362[local163][local392];
								if (local404 != null && local404.aBoolean166) {
									Static127.method2162(local404, true);
								}
							}
						}
						if (local175 < Static119.anInt2712) {
							if (local388 >= Static197.anInt3926) {
								local404 = local362[local175][local388];
								if (local404 != null && local404.aBoolean166) {
									Static127.method2162(local404, true);
								}
							}
							if (local392 < Static153.anInt3348) {
								local404 = local362[local175][local392];
								if (local404 != null && local404.aBoolean166) {
									Static127.method2162(local404, true);
								}
							}
						}
						if (Static192.anInt3806 == 0) {
							Static192.aBoolean178 = false;
							return;
						}
					}
				}
			}
		}
		for (local135 = Static74.anInt1724; local135 < Static135.anInt2895; local135++) {
			@Pc(488) Class2_Sub23[][] local488 = Static203.aClass2_Sub23ArrayArrayArray1[local135];
			for (local163 = -Static80.anInt1786; local163 <= 0; local163++) {
				local175 = Static206.anInt4069 + local163;
				local383 = Static206.anInt4069 - local163;
				if (local175 >= Static144.anInt3014 || local383 < Static119.anInt2712) {
					for (local388 = -Static80.anInt1786; local388 <= 0; local388++) {
						local392 = Static4.anInt96 + local388;
						@Pc(518) int local518 = Static4.anInt96 - local388;
						@Pc(530) Class2_Sub23 local530;
						if (local175 >= Static144.anInt3014) {
							if (local392 >= Static197.anInt3926) {
								local530 = local488[local175][local392];
								if (local530 != null && local530.aBoolean166) {
									Static127.method2162(local530, false);
								}
							}
							if (local518 < Static153.anInt3348) {
								local530 = local488[local175][local518];
								if (local530 != null && local530.aBoolean166) {
									Static127.method2162(local530, false);
								}
							}
						}
						if (local383 < Static119.anInt2712) {
							if (local392 >= Static197.anInt3926) {
								local530 = local488[local383][local392];
								if (local530 != null && local530.aBoolean166) {
									Static127.method2162(local530, false);
								}
							}
							if (local518 < Static153.anInt3348) {
								local530 = local488[local383][local518];
								if (local530 != null && local530.aBoolean166) {
									Static127.method2162(local530, false);
								}
							}
						}
						if (Static192.anInt3806 == 0) {
							Static192.aBoolean178 = false;
							return;
						}
					}
				}
			}
		}
		Static192.aBoolean178 = false;
	}
}
