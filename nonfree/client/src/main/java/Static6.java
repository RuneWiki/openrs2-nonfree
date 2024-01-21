import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!af", name = "t", descriptor = "[I")
	public static int[] anIntArray8;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "I")
	public static int anInt71 = 0;

	@OriginalMember(owner = "client!af", name = "f", descriptor = "Lclient!qc;")
	public static Class60 aClass60_34 = Static121.method2047("Null");

	@OriginalMember(owner = "client!af", name = "m", descriptor = "[I")
	public static int[] anIntArray7 = new int[5];

	@OriginalMember(owner = "client!af", name = "n", descriptor = "Lclient!qc;")
	public static Class60 aClass60_35 = Static121.method2047("headicons_prayer");

	@OriginalMember(owner = "client!af", name = "o", descriptor = "Lclient!qc;")
	public static Class60 aClass60_36 = Static121.method2047("leuchten3:");

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIII)V")
	public static void method39(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static26.anInt724 == 0 && !Static71.aBoolean70) {
			Static41.method698(arg1 - arg0, arg2 - arg3, Static22.aClass60_241, 4, 0, Static24.aClass60_283);
		}
		@Pc(36) int local36 = -1;
		for (@Pc(38) int local38 = 0; local38 < Static100.anInt2458; local38++) {
			@Pc(44) int local44 = Static100.anIntArray258[local38];
			@Pc(48) int local48 = local44 & 0x7F;
			@Pc(54) int local54 = local44 >> 7 & 0x7F;
			@Pc(60) int local60 = local44 >> 14 & 0x7FFF;
			@Pc(66) int local66 = local44 >> 29 & 0x3;
			if (local36 != local44) {
				local36 = local44;
				@Pc(121) int local121;
				if (local66 == 2 && Static7.aClass28_3.method760(Static129.anInt3003, local48, local54, local44) >= 0) {
					@Pc(90) Class4_Sub4_Sub5 local90 = Static24.method477(local60);
					if (local90.anIntArray94 != null) {
						local90 = local90.method727();
					}
					if (local90 == null) {
						continue;
					}
					if (Static26.anInt724 == 1) {
						Static41.method698(local48, local54, Static125.method2072(new Class60[] { Static90.aClass60_874, Static29.aClass60_327, local90.aClass60_451 }), 33, local44, Static34.aClass60_372);
					} else if (!Static71.aBoolean70) {
						@Pc(111) Class60[] local111 = local90.aClass60Array7;
						if (Static2.aBoolean49) {
							local111 = Static28.method558(local111);
						}
						if (local111 != null) {
							for (local121 = 4; local121 >= 0; local121--) {
								if (local111[local121] != null) {
									@Pc(133) short local133 = 0;
									if (local121 == 0) {
										local133 = 46;
									}
									if (local121 == 1) {
										local133 = 1;
									}
									if (local121 == 2) {
										local133 = 58;
									}
									if (local121 == 3) {
										local133 = 23;
									}
									if (local121 == 4) {
										local133 = 1006;
									}
									Static41.method698(local48, local54, Static125.method2072(new Class60[] { Static57.aClass60_185, local90.aClass60_451 }), local133, local44, local111[local121]);
								}
							}
						}
						Static41.method698(local48, local54, Static125.method2072(new Class60[] { Static57.aClass60_185, local90.aClass60_451 }), 1001, local90.anInt1083 << 14, Static10.aClass60_97);
					} else if ((Static85.anInt2034 & 0x4) == 4) {
						Static41.method698(local48, local54, Static125.method2072(new Class60[] { Static94.aClass60_916, Static29.aClass60_327, local90.aClass60_451 }), 41, local44, Static92.aClass60_891);
					}
				}
				@Pc(305) int local305;
				@Pc(313) Class4_Sub4_Sub1_Sub2_Sub1 local313;
				@Pc(366) Class4_Sub4_Sub1_Sub2_Sub2 local366;
				if (local66 == 1) {
					@Pc(284) Class4_Sub4_Sub1_Sub2_Sub1 local284 = Static120.aClass4_Sub4_Sub1_Sub2_Sub1Array2[local60];
					if (local284.aClass4_Sub4_Sub11_1.anInt2008 == 1 && (local284.anInt2620 & 0x7F) == 64 && (local284.anInt2601 & 0x7F) == 64) {
						for (local305 = 0; local305 < Static114.anInt2750; local305++) {
							local313 = Static120.aClass4_Sub4_Sub1_Sub2_Sub1Array2[Static38.anIntArray72[local305]];
							if (local313 != null && local313 != local284 && local313.aClass4_Sub4_Sub11_1.anInt2008 == 1 && local284.anInt2620 == local313.anInt2620 && local313.anInt2601 == local284.anInt2601) {
								Static22.method450(local313.aClass4_Sub4_Sub11_1, local48, Static38.anIntArray72[local305], local54);
							}
						}
						for (local121 = 0; local121 < Static43.anInt1107; local121++) {
							local366 = Static59.aClass4_Sub4_Sub1_Sub2_Sub2Array1[Static94.anIntArray231[local121]];
							if (local366 != null && local366.anInt2620 == local284.anInt2620 && local366.anInt2601 == local284.anInt2601) {
								Static38.method648(local366, Static94.anIntArray231[local121], local54, local48);
							}
						}
					}
					Static22.method450(local284.aClass4_Sub4_Sub11_1, local48, local60, local54);
				}
				if (local66 == 0) {
					@Pc(415) Class4_Sub4_Sub1_Sub2_Sub2 local415 = Static59.aClass4_Sub4_Sub1_Sub2_Sub2Array1[local60];
					if ((local415.anInt2620 & 0x7F) == 64 && (local415.anInt2601 & 0x7F) == 64) {
						for (local305 = 0; local305 < Static114.anInt2750; local305++) {
							local313 = Static120.aClass4_Sub4_Sub1_Sub2_Sub1Array2[Static38.anIntArray72[local305]];
							if (local313 != null && local313.aClass4_Sub4_Sub11_1.anInt2008 == 1 && local415.anInt2620 == local313.anInt2620 && local415.anInt2601 == local313.anInt2601) {
								Static22.method450(local313.aClass4_Sub4_Sub11_1, local48, Static38.anIntArray72[local305], local54);
							}
						}
						for (local121 = 0; local121 < Static43.anInt1107; local121++) {
							local366 = Static59.aClass4_Sub4_Sub1_Sub2_Sub2Array1[Static94.anIntArray231[local121]];
							if (local366 != null && local366 != local415 && local366.anInt2620 == local415.anInt2620 && local415.anInt2601 == local366.anInt2601) {
								Static38.method648(local366, Static94.anIntArray231[local121], local54, local48);
							}
						}
					}
					Static38.method648(local415, local60, local54, local48);
				}
				if (local66 == 3) {
					@Pc(549) Class70 local549 = Static74.aClass70ArrayArrayArray1[Static129.anInt3003][local48][local54];
					if (local549 != null) {
						for (@Pc(558) Class4_Sub4_Sub1_Sub5 local558 = (Class4_Sub4_Sub1_Sub5) local549.method1930(); local558 != null; local558 = (Class4_Sub4_Sub1_Sub5) local549.method1937()) {
							@Pc(565) Class4_Sub4_Sub13 local565 = Static24.method475(local558.anInt1411);
							if (Static26.anInt724 == 1) {
								Static41.method698(local48, local54, Static125.method2072(new Class60[] { Static90.aClass60_874, Static81.aClass60_792, local565.aClass60_870 }), 57, local558.anInt1411, Static34.aClass60_372);
							} else if (!Static71.aBoolean70) {
								@Pc(579) Class60[] local579 = local565.aClass60Array18;
								if (Static2.aBoolean49) {
									local579 = Static28.method558(local579);
								}
								for (@Pc(587) int local587 = 4; local587 >= 0; local587--) {
									if (local579 != null && local579[local587] != null) {
										@Pc(635) byte local635 = 0;
										if (local587 == 0) {
											local635 = 19;
										}
										if (local587 == 1) {
											local635 = 8;
										}
										if (local587 == 2) {
											local635 = 7;
										}
										if (local587 == 3) {
											local635 = 21;
										}
										if (local587 == 4) {
											local635 = 6;
										}
										Static41.method698(local48, local54, Static125.method2072(new Class60[] { Static125.aClass60_1173, local565.aClass60_870 }), local635, local558.anInt1411, local579[local587]);
									} else if (local587 == 2) {
										Static41.method698(local48, local54, Static125.method2072(new Class60[] { Static125.aClass60_1173, local565.aClass60_870 }), 7, local558.anInt1411, Static59.aClass60_549);
									}
								}
								Static41.method698(local48, local54, Static125.method2072(new Class60[] { Static125.aClass60_1173, local565.aClass60_870 }), 1005, local558.anInt1411, Static10.aClass60_97);
							} else if ((Static85.anInt2034 & 0x1) == 1) {
								Static41.method698(local48, local54, Static125.method2072(new Class60[] { Static94.aClass60_916, Static81.aClass60_792, local565.aClass60_870 }), 36, local558.anInt1411, Static92.aClass60_891);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(B)Z")
	public static boolean method40() {
		return Static30.anInt836 == 0 ? Static59.aClass4_Sub2_Sub2_2.method560() : true;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!jb;Ljava/awt/Component;III)Lclient!kc;")
	public static Class39 method41(@OriginalArg(0) Class35 arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static31.anInt846 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(38) Class39 local38 = (Class39) Class.forName("Class39_Sub1").getDeclaredConstructor().newInstance();
			local38.anIntArray234 = new int[(Static70.aBoolean68 ? 2 : 1) * 256];
			local38.anInt2353 = arg2;
			local38.method1680(arg1);
			local38.anInt2348 = (arg2 & 0xFFFFFC00) + 1024;
			if (local38.anInt2348 > 16384) {
				local38.anInt2348 = 16384;
			}
			local38.method1677(local38.anInt2348);
			if (Static37.anInt930 > 0 && Static99.aClass81_1 == null) {
				Static99.aClass81_1 = new Class81();
				Static99.aClass81_1.aClass35_4 = arg0;
				arg0.method981(Static37.anInt930, Static99.aClass81_1);
			}
			if (Static99.aClass81_1 != null) {
				if (Static99.aClass81_1.aClass39Array1[arg3] != null) {
					throw new IllegalArgumentException();
				}
				Static99.aClass81_1.aClass39Array1[arg3] = local38;
			}
			return local38;
		} catch (@Pc(113) Throwable local113) {
			try {
				@Pc(119) Class39_Sub2 local119 = new Class39_Sub2(arg0, arg3);
				local119.anInt2353 = arg2;
				local119.anIntArray234 = new int[(Static70.aBoolean68 ? 2 : 1) * 256];
				local119.method1680(arg1);
				local119.anInt2348 = 16384;
				local119.method1677(local119.anInt2348);
				if (Static37.anInt930 > 0 && Static99.aClass81_1 == null) {
					Static99.aClass81_1 = new Class81();
					Static99.aClass81_1.aClass35_4 = arg0;
					arg0.method981(Static37.anInt930, Static99.aClass81_1);
				}
				if (Static99.aClass81_1 != null) {
					if (Static99.aClass81_1.aClass39Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					Static99.aClass81_1.aClass39Array1[arg3] = local119;
				}
				return local119;
			} catch (@Pc(178) Throwable local178) {
				return new Class39();
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(B)V")
	public static void method42() {
		anIntArray8 = null;
		aClass60_35 = null;
		aClass60_36 = null;
		anIntArray7 = null;
		aClass60_34 = null;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(III)I")
	public static int method43(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = arg0 * 57 + arg1;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(29) int local29 = Integer.MAX_VALUE & (local11 * 15731 * local11 + 789221) * local11 + 1376312589;
		return local29 >> 19 & 0xFF;
	}
}
