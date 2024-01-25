import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!cw", name = "k", descriptor = "Lclient!qr;")
	public static Class152 aClass152_2;

	@OriginalMember(owner = "client!cw", name = "g", descriptor = "I")
	public static int anInt3020 = 0;

	@OriginalMember(owner = "client!cw", name = "i", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_58 = new Class298(12, 8);

	@OriginalMember(owner = "client!cw", name = "j", descriptor = "Lclient!ph;")
	public static final Class260 aClass260_3 = new Class260(9, 2);

	@OriginalMember(owner = "client!cw", name = "l", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_59 = new Class298(8, 3);

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lclient!og;ZZ)V")
	public static void method2719(@OriginalArg(0) Class9_Sub1_Sub1_Sub2_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		if (Static151.anInt3123 >= 400) {
			return;
		}
		if (Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2 != arg0) {
			@Pc(70) String local70;
			@Pc(150) int local150;
			if (arg0.anInt6473 == 0) {
				@Pc(102) boolean local102 = true;
				if (Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt6509 != -1 && arg0.anInt6509 != -1) {
					@Pc(125) int local125 = Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt6503 > arg0.anInt6503 ? Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt6503 : arg0.anInt6503;
					@Pc(140) int local140 = Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt6509 >= arg0.anInt6509 ? arg0.anInt6509 : Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt6509;
					local150 = local140 + local125 * 10 / 100 + 5;
					@Pc(157) int local157 = Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt6503 - arg0.anInt6503;
					if (local157 < 0) {
						local157 = -local157;
					}
					if (local157 > local150) {
						local102 = false;
					}
				}
				@Pc(183) String local183 = Static560.aClass211_4 == Static227.aClass211_1 ? Static48.aClass33_32.method797(Static131.anInt2839) : Static48.aClass33_30.method797(Static131.anInt2839);
				if (arg0.anInt6503 < arg0.anInt6495) {
					local70 = arg0.method5577() + (local102 ? Static518.method6899(Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt6503, arg0.anInt6503) : "<col=ffffff>") + " (" + local183 + arg0.anInt6503 + "+" + (arg0.anInt6495 - arg0.anInt6503) + ")";
				} else {
					local70 = arg0.method5577() + (local102 ? Static518.method6899(Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt6503, arg0.anInt6503) : "<col=ffffff>") + " (" + local183 + arg0.anInt6503 + ")";
				}
			} else if (arg0.anInt6473 == -1) {
				local70 = arg0.method5577();
			} else {
				local70 = arg0.method5577() + " (" + Static48.aClass33_31.method797(Static131.anInt2839) + arg0.anInt6473 + ")";
			}
			if (Static380.aBoolean537 && !arg1 && (Static301.anInt5410 & 0x8) != 0) {
				Static577.method3272(12, 0, -1, (long) arg0.anInt6429, Static484.aString107, 0, true, Static466.aString125 + " -> <col=ffffff>" + local70, Static456.anInt8051, false);
			}
			if (arg1) {
				Static577.method3272(-1, 0, 0, 0L, "<col=cccccc>" + local70, 0, false, "", -1, true);
			} else {
				for (@Pc(322) int local322 = 7; local322 >= 0; local322--) {
					if (Static431.aStringArray22[local322] != null) {
						@Pc(330) short local330 = 0;
						if (Static227.aClass211_1 == Static250.aClass211_2 && Static431.aStringArray22[local322].equalsIgnoreCase(Static48.aClass33_25.method797(Static131.anInt2839))) {
							if (arg0.anInt6503 > Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt6503) {
								local330 = 2000;
							}
							if (Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt6500 != 0 && arg0.anInt6500 != 0) {
								if (arg0.anInt6500 == Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt6500) {
									local330 = 2000;
								} else {
									local330 = 0;
								}
							}
						} else if (Static9.aBooleanArray1[local322]) {
							local330 = 2000;
						}
						@Pc(385) short local385 = (short) (Static512.aShortArray262[local322] + local330);
						local150 = Static169.anIntArray286[local322] == -1 ? Static245.anInt4537 : Static169.anIntArray286[local322];
						Static577.method3272(local385, 0, -1, (long) arg0.anInt6429, Static431.aStringArray22[local322], 0, true, "<col=ffffff>" + local70, local150, false);
					}
				}
			}
			if (!arg1) {
				for (@Pc(435) Class3_Sub44 local435 = (Class3_Sub44) Static187.aClass130_15.method3543(); local435 != null; local435 = (Class3_Sub44) Static187.aClass130_15.method3551()) {
					if (local435.anInt7685 == 11) {
						local435.aString106 = "<col=ffffff>" + local70;
						return;
					}
				}
			}
		} else if (Static380.aBoolean537 && (Static301.anInt5410 & 0x10) != 0) {
			Static577.method3272(5, 0, -1, 0L, Static484.aString107, 0, true, Static466.aString125 + " -> <col=ffffff>" + Static48.aClass33_39.method797(Static131.anInt2839), Static456.anInt8051, false);
		}
	}
}
