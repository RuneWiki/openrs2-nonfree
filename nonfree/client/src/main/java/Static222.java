import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!kr", name = "R", descriptor = "Lclient!oi;")
	public static Class185 aClass185_62;

	@OriginalMember(owner = "client!kr", name = "I", descriptor = "Z")
	public static boolean aBoolean369 = false;

	@OriginalMember(owner = "client!kr", name = "Q", descriptor = "[I")
	public static final int[] anIntArray287 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(BLjava/lang/String;)V")
	public static void method3200(@OriginalArg(1) String arg0) {
		if (!Static290.aBoolean449) {
			return;
		}
		@Pc(15) boolean local15 = false;
		@Pc(17) int local17 = Static103.anInt6434;
		@Pc(19) int[] local19 = Static56.anIntArray110;
		for (@Pc(21) int local21 = 0; local21 < local17; local21++) {
			@Pc(29) Class11_Sub1_Sub3_Sub2 local29 = Static399.aClass11_Sub1_Sub3_Sub2Array1[local19[local21]];
			if (local29 != null && local29 != Static94.aClass11_Sub1_Sub3_Sub2_1 && local29.aString32 != null && local29.aString32.equalsIgnoreCase(arg0)) {
				Static178.method2589(Static29.aClass242_6);
				Static426.aClass1_Sub19_Sub2_2.method2879(0);
				Static426.aClass1_Sub19_Sub2_2.method2930(local19[local21]);
				Static426.aClass1_Sub19_Sub2_2.method2894(Static2.anInt29);
				Static426.aClass1_Sub19_Sub2_2.method2894(Static403.anInt6355);
				Static426.aClass1_Sub19_Sub2_2.method2885(Static276.anInt4734);
				Static224.method3210(-2, local29.method2635(), true, 0, 0, local29.anIntArray247[0], local29.method2635(), local29.anIntArray246[0]);
				local15 = true;
				break;
			}
		}
		if (!local15) {
			Static246.method3498(Static207.aClass142_50.method3118(Static63.anInt981) + arg0);
		}
		if (Static290.aBoolean449) {
			Static403.method5125();
		}
	}

	@OriginalMember(owner = "client!kr", name = "g", descriptor = "(I)I")
	public static int method3203() {
		return 16;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lclient!ir;ZB)V")
	public static void method3205(@OriginalArg(0) Class11_Sub1_Sub3_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		if (Static76.anInt1078 >= 400) {
			return;
		}
		if (Static94.aClass11_Sub1_Sub3_Sub2_1 != arg0) {
			@Pc(184) String local184;
			@Pc(106) int local106;
			if (arg0.anInt3351 == 0) {
				@Pc(66) boolean local66 = true;
				if (Static94.aClass11_Sub1_Sub3_Sub2_1.anInt3347 != -1 && arg0.anInt3347 != -1) {
					@Pc(85) int local85 = Static94.aClass11_Sub1_Sub3_Sub2_1.anInt3369 <= arg0.anInt3369 ? arg0.anInt3369 : Static94.aClass11_Sub1_Sub3_Sub2_1.anInt3369;
					@Pc(96) int local96 = arg0.anInt3347 <= Static94.aClass11_Sub1_Sub3_Sub2_1.anInt3347 ? arg0.anInt3347 : Static94.aClass11_Sub1_Sub3_Sub2_1.anInt3347;
					local106 = local96 + local85 * 10 / 100 + 5;
					@Pc(113) int local113 = Static94.aClass11_Sub1_Sub3_Sub2_1.anInt3369 - arg0.anInt3369;
					if (local113 < 0) {
						local113 = -local113;
					}
					if (local106 < local113) {
						local66 = false;
					}
				}
				@Pc(140) String local140 = Static94.aClass148_3 == Static93.aClass148_2 ? Static286.aClass142_71.method3118(Static63.anInt981) : Static304.aClass142_12.method3118(Static63.anInt981);
				if (arg0.anInt3379 > arg0.anInt3369) {
					local184 = arg0.method2654() + (local66 ? Static20.method310(arg0.anInt3369, Static94.aClass11_Sub1_Sub3_Sub2_1.anInt3369) : "<col=ffffff>") + " (" + local140 + arg0.anInt3369 + "+" + (arg0.anInt3379 - arg0.anInt3369) + ")";
				} else {
					local184 = arg0.method2654() + (local66 ? Static20.method310(arg0.anInt3369, Static94.aClass11_Sub1_Sub3_Sub2_1.anInt3369) : "<col=ffffff>") + " (" + local140 + arg0.anInt3369 + ")";
				}
			} else {
				local184 = arg0.method2654() + " (" + Static45.aClass142_9.method3118(Static63.anInt981) + arg0.anInt3351 + ")";
			}
			if (Static290.aBoolean449) {
				if (!arg1 && (Static226.anInt4102 & 0x8) != 0) {
					Static213.method3090((long) arg0.anInt3279, Static28.aString5, Static392.aString62 + " -> <col=ffffff>" + local184, 0, Static313.anInt5165, false, 0, 12, true, -1);
				}
			} else if (arg1) {
				Static213.method3090(0L, "<col=cccccc>" + local184, "", 0, -1, true, 0, -1, false, 0);
			} else {
				for (@Pc(246) int local246 = 7; local246 >= 0; local246--) {
					if (Static298.aStringArray36[local246] != null) {
						@Pc(254) short local254 = 0;
						if (Static94.aClass148_3 == Static59.aClass148_1 && Static298.aStringArray36[local246].equalsIgnoreCase(Static268.aClass142_67.method3118(Static63.anInt981))) {
							if (Static94.aClass11_Sub1_Sub3_Sub2_1.anInt3369 < arg0.anInt3369) {
								local254 = 2000;
							}
							if (Static94.aClass11_Sub1_Sub3_Sub2_1.anInt3370 != 0 && arg0.anInt3370 != 0) {
								if (arg0.anInt3370 == Static94.aClass11_Sub1_Sub3_Sub2_1.anInt3370) {
									local254 = 2000;
								} else {
									local254 = 0;
								}
							}
						} else if (Static70.aBooleanArray111[local246]) {
							local254 = 2000;
						}
						@Pc(316) short local316 = (short) (Static71.aShortArray23[local246] + local254);
						local106 = Static435.anIntArray455[local246] == -1 ? Static93.anInt1257 : Static435.anIntArray455[local246];
						Static213.method3090((long) arg0.anInt3279, Static298.aStringArray36[local246], "<col=ffffff>" + local184, 0, local106, false, 0, local316, true, -1);
					}
				}
			}
			if (!arg1) {
				for (@Pc(422) Class1_Sub10 local422 = (Class1_Sub10) Static57.aClass14_3.method203(); local422 != null; local422 = (Class1_Sub10) Static57.aClass14_3.method208()) {
					if (local422.anInt1057 == 6) {
						local422.aString9 = "<col=ffffff>" + local184;
						return;
					}
				}
			}
		} else if (Static290.aBoolean449 && (Static226.anInt4102 & 0x10) != 0) {
			Static213.method3090(0L, Static28.aString5, Static392.aString62 + " -> <col=ffffff>" + Static214.aClass142_52.method3118(Static63.anInt981), 0, Static313.anInt5165, false, 0, 44, true, -1);
		}
	}
}
