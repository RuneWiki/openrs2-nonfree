import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "Lclient!dc;")
	public static Class17 aClass17_3;

	@OriginalMember(owner = "client!mc", name = "v", descriptor = "I")
	public static int anInt1923;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "Lclient!ec;")
	private static Class22 aClass22_524 = Static60.method1113("Continue");

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
	public static int anInt1914 = 0;

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "Lclient!ec;")
	public static Class22 aClass22_525 = aClass22_524;

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "Lclient!ec;")
	public static Class22 aClass22_526 = Static60.method1113("Welt");

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
	public static int anInt1915 = 0;

	@OriginalMember(owner = "client!mc", name = "s", descriptor = "Lclient!ec;")
	private static Class22 aClass22_533 = Static60.method1113("Please wait )2 attempting to reestablish");

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "Lclient!ec;")
	public static Class22 aClass22_527 = aClass22_533;

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "Lclient!ec;")
	public static Class22 aClass22_528 = Static60.method1113("sch-Utteln:");

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "Lclient!ec;")
	public static Class22 aClass22_529 = Static60.method1113("Abbrechen");

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
	public static int anInt1918 = 0;

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "Lclient!ec;")
	private static Class22 aClass22_530 = Static60.method1113("Create a free account");

	@OriginalMember(owner = "client!mc", name = "n", descriptor = "Lclient!ec;")
	public static Class22 aClass22_531 = Static60.method1113("::clientdrop");

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
	public static int anInt1919 = 1;

	@OriginalMember(owner = "client!mc", name = "w", descriptor = "Lclient!ec;")
	private static Class22 aClass22_535 = Static60.method1113("Service unavailable)3");

	@OriginalMember(owner = "client!mc", name = "p", descriptor = "Lclient!ec;")
	public static Class22 aClass22_532 = aClass22_535;

	@OriginalMember(owner = "client!mc", name = "q", descriptor = "I")
	public static int anInt1920 = 0;

	@OriginalMember(owner = "client!mc", name = "u", descriptor = "Lclient!ec;")
	public static Class22 aClass22_534 = aClass22_530;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIII)V")
	public static void method1183(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static104.anInt2636 == 0 && !Static128.aBoolean274) {
			Static48.method905(0, Static41.aClass22_284, arg3 - arg1, 3, Static64.aClass22_485, arg0 - arg2);
		}
		@Pc(29) int local29 = -1;
		for (@Pc(31) int local31 = 0; local31 < Static83.anInt2245; local31++) {
			@Pc(37) int local37 = Static83.anIntArray249[local31];
			@Pc(43) int local43 = local37 >> 29 & 0x3;
			@Pc(47) int local47 = local37 & 0x7F;
			@Pc(53) int local53 = local37 >> 14 & 0x7FFF;
			@Pc(59) int local59 = local37 >> 7 & 0x7F;
			if (local37 != local29) {
				local29 = local37;
				@Pc(185) int local185;
				if (local43 == 2 && Static134.aClass77_1.method1925(Static37.anInt895, local47, local59, local37) >= 0) {
					@Pc(85) Class4_Sub1_Sub5 local85 = Static5.method45(local53);
					if (local85.anIntArray137 != null) {
						local85 = local85.method885();
					}
					if (local85 == null) {
						continue;
					}
					if (Static104.anInt2636 == 1) {
						Static48.method905(local37, Static35.aClass22_246, local59, 49, Static44.method856(new Class22[] { Static43.aClass22_290, Static75.aClass22_552, local85.aClass22_309 }), local47);
					} else if (!Static128.aBoolean274) {
						@Pc(173) Class22[] local173 = local85.aClass22Array8;
						if (Static78.aBoolean179) {
							local173 = Static104.method1728(local173);
						}
						if (local173 != null) {
							for (local185 = 4; local185 >= 0; local185--) {
								if (local173[local185] != null) {
									@Pc(197) short local197 = 0;
									if (local185 == 0) {
										local197 = 37;
									}
									if (local185 == 1) {
										local197 = 11;
									}
									if (local185 == 2) {
										local197 = 32;
									}
									if (local185 == 3) {
										local197 = 1;
									}
									if (local185 == 4) {
										local197 = 1003;
									}
									Static48.method905(local37, local173[local185], local59, local197, Static44.method856(new Class22[] { Static111.aClass22_827, local85.aClass22_309 }), local47);
								}
							}
						}
						Static48.method905(local85.anInt1255 << 14, Static113.aClass22_870, local59, 1002, Static44.method856(new Class22[] { Static111.aClass22_827, local85.aClass22_309 }), local47);
					} else if ((Static73.anInt1961 & 0x4) == 4) {
						Static48.method905(local37, Static124.aClass22_927, local59, 2, Static44.method856(new Class22[] { Static12.aClass22_80, Static75.aClass22_552, local85.aClass22_309 }), local47);
					}
				}
				@Pc(303) int local303;
				@Pc(311) Class4_Sub1_Sub3_Sub2_Sub2 local311;
				@Pc(364) Class4_Sub1_Sub3_Sub2_Sub1 local364;
				if (local43 == 1) {
					@Pc(278) Class4_Sub1_Sub3_Sub2_Sub2 local278 = Static12.aClass4_Sub1_Sub3_Sub2_Sub2Array1[local53];
					if (local278.aClass4_Sub1_Sub10_1.anInt2153 == 1 && (local278.anInt2500 & 0x7F) == 64 && (local278.anInt2462 & 0x7F) == 64) {
						for (local303 = 0; local303 < Static84.anInt2255; local303++) {
							local311 = Static12.aClass4_Sub1_Sub3_Sub2_Sub2Array1[Static13.anIntArray33[local303]];
							if (local311 != null && local311 != local278 && local311.aClass4_Sub1_Sub10_1.anInt2153 == 1 && local278.anInt2500 == local311.anInt2500 && local278.anInt2462 == local311.anInt2462) {
								Static28.method460(local47, local311.aClass4_Sub1_Sub10_1, Static13.anIntArray33[local303], local59);
							}
						}
						for (local185 = 0; local185 < Static51.anInt1461; local185++) {
							local364 = Static44.aClass4_Sub1_Sub3_Sub2_Sub1Array1[Static115.anIntArray310[local185]];
							if (local364 != null && local278.anInt2500 == local364.anInt2500 && local278.anInt2462 == local364.anInt2462) {
								Static50.method968(Static115.anIntArray310[local185], local59, local364, local47);
							}
						}
					}
					Static28.method460(local47, local278.aClass4_Sub1_Sub10_1, local53, local59);
				}
				if (local43 == 0) {
					@Pc(412) Class4_Sub1_Sub3_Sub2_Sub1 local412 = Static44.aClass4_Sub1_Sub3_Sub2_Sub1Array1[local53];
					if ((local412.anInt2500 & 0x7F) == 64 && (local412.anInt2462 & 0x7F) == 64) {
						for (local303 = 0; local303 < Static84.anInt2255; local303++) {
							local311 = Static12.aClass4_Sub1_Sub3_Sub2_Sub2Array1[Static13.anIntArray33[local303]];
							if (local311 != null && local311.aClass4_Sub1_Sub10_1.anInt2153 == 1 && local311.anInt2500 == local412.anInt2500 && local412.anInt2462 == local311.anInt2462) {
								Static28.method460(local47, local311.aClass4_Sub1_Sub10_1, Static13.anIntArray33[local303], local59);
							}
						}
						for (local185 = 0; local185 < Static51.anInt1461; local185++) {
							local364 = Static44.aClass4_Sub1_Sub3_Sub2_Sub1Array1[Static115.anIntArray310[local185]];
							if (local364 != null && local412 != local364 && local364.anInt2500 == local412.anInt2500 && local412.anInt2462 == local364.anInt2462) {
								Static50.method968(Static115.anIntArray310[local185], local59, local364, local47);
							}
						}
					}
					Static50.method968(local53, local59, local412, local47);
				}
				if (local43 == 3) {
					@Pc(526) Class82 local526 = Static19.aClass82ArrayArrayArray1[Static37.anInt895][local47][local59];
					if (local526 != null) {
						for (@Pc(535) Class4_Sub1_Sub3_Sub1 local535 = (Class4_Sub1_Sub3_Sub1) local526.method2034(); local535 != null; local535 = (Class4_Sub1_Sub3_Sub1) local526.method2022()) {
							@Pc(544) Class4_Sub1_Sub8 local544 = Static123.method2000(local535.anInt361);
							if (Static104.anInt2636 == 1) {
								Static48.method905(local535.anInt361, Static35.aClass22_246, local59, 20, Static44.method856(new Class22[] { Static43.aClass22_290, Static42.aClass22_250, local544.aClass22_359 }), local47);
							} else if (!Static128.aBoolean274) {
								@Pc(556) Class22[] local556 = local544.aClass22Array11;
								if (Static78.aBoolean179) {
									local556 = Static104.method1728(local556);
								}
								for (@Pc(564) int local564 = 4; local564 >= 0; local564--) {
									if (local556 != null && local556[local564] != null) {
										@Pc(604) byte local604 = 0;
										if (local564 == 0) {
											local604 = 57;
										}
										if (local564 == 1) {
											local604 = 47;
										}
										if (local564 == 2) {
											local604 = 31;
										}
										if (local564 == 3) {
											local604 = 13;
										}
										if (local564 == 4) {
											local604 = 36;
										}
										Static48.method905(local535.anInt361, local556[local564], local59, local604, Static44.method856(new Class22[] { Static33.aClass22_221, local544.aClass22_359 }), local47);
									} else if (local564 == 2) {
										Static48.method905(local535.anInt361, Static24.aClass22_163, local59, 31, Static44.method856(new Class22[] { Static33.aClass22_221, local544.aClass22_359 }), local47);
									}
								}
								Static48.method905(local535.anInt361, Static113.aClass22_870, local59, 1001, Static44.method856(new Class22[] { Static33.aClass22_221, local544.aClass22_359 }), local47);
							} else if ((Static73.anInt1961 & 0x1) == 1) {
								Static48.method905(local535.anInt361, Static124.aClass22_927, local59, 33, Static44.method856(new Class22[] { Static12.aClass22_80, Static42.aClass22_250, local544.aClass22_359 }), local47);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILclient!f;IIIIII)V")
	public static void method1184(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static19.aBoolean52) {
			Static59.anInt1771 = 32;
		} else {
			Static59.anInt1771 = 0;
		}
		Static19.aBoolean52 = false;
		@Pc(127) int local127;
		if (anInt1920 != 0) {
			if (arg5 >= arg3 && arg3 + 16 > arg5 && arg2 >= arg0 && arg0 + 16 > arg2) {
				arg1.anInt806 -= 4;
				Static110.method1772(arg1);
			} else if (arg3 <= arg5 && arg5 < arg3 + 16 && arg2 >= arg0 + arg4 - 16 && arg0 + arg4 > arg2) {
				arg1.anInt806 += 4;
				Static110.method1772(arg1);
			} else if (arg5 >= arg3 - Static59.anInt1771 && arg5 < Static59.anInt1771 + arg3 + 16 && arg0 + 16 <= arg2 && arg2 < arg0 + arg4 - 16) {
				local127 = (arg4 - 32) * arg4 / arg6;
				if (local127 < 8) {
					local127 = 8;
				}
				@Pc(146) int local146 = arg2 - arg0 - local127 / 2 - 16;
				@Pc(153) int local153 = arg4 - local127 - 32;
				arg1.anInt806 = (arg6 - arg4) * local146 / local153;
				Static110.method1772(arg1);
				Static19.aBoolean52 = true;
			}
		}
		if (Static59.anInt1766 == 0) {
			return;
		}
		local127 = arg1.anInt773;
		if (arg5 >= arg3 - local127 && arg0 <= arg2 && arg3 + 16 > arg5 && arg0 + arg4 >= arg2) {
			arg1.anInt806 += Static59.anInt1766 * 45;
			Static110.method1772(arg1);
			return;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
	public static void method1185() {
		aClass22_532 = null;
		aClass17_3 = null;
		aClass22_530 = null;
		aClass22_524 = null;
		aClass22_529 = null;
		aClass22_525 = null;
		aClass22_528 = null;
		aClass22_534 = null;
		aClass22_535 = null;
		aClass22_527 = null;
		aClass22_533 = null;
		aClass22_531 = null;
		aClass22_526 = null;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BI)Lclient!rc;")
	public static Class4_Sub1_Sub12 method1186(@OriginalArg(1) int arg0) {
		@Pc(6) Class4_Sub1_Sub12 local6 = (Class4_Sub1_Sub12) Static53.aClass33_20.method998((long) arg0);
		if (local6 != null) {
			return local6;
		}
		local6 = Static29.method495(Static115.aClass20_55, Static3.aClass20_1, arg0);
		if (local6 != null) {
			Static53.aClass33_20.method997((long) arg0, local6);
		}
		return local6;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZLclient!ea;IZIII)V")
	public static void method1187(@OriginalArg(1) Class20 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		Static60.anInt1790 = 2;
		Static30.aClass20_17 = arg0;
		Static132.anInt3135 = arg3;
		Static101.aBoolean232 = false;
		Static49.anInt1330 = arg1;
		Static80.anInt2197 = 1;
		Static105.anInt2640 = arg2;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[B)[B")
	public static byte[] method1188(@OriginalArg(1) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static139.method952(arg0, 0, local9, 0, local6);
		return local9;
	}
}
