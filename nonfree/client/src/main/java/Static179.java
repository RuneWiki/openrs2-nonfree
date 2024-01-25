import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!gh", name = "m", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_36 = new Class46(61, 12);

	@OriginalMember(owner = "client!gh", name = "o", descriptor = "I")
	public static int anInt3165 = 0;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "([BIZ)Ljava/lang/Object;")
	public static Object method2720(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static444.aBoolean543) {
			try {
				@Pc(25) Class37 local25 = (Class37) Class.forName("Class37_Sub1").getDeclaredConstructor().newInstance();
				local25.method769(arg0);
				return local25;
			} catch (@Pc(32) Throwable local32) {
				Static444.aBoolean543 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZLclient!bfa;I)V")
	public static void method2722(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class4_Sub2_Sub1_Sub1_Sub1 arg1) {
		if (Static491.anInt8293 >= 400) {
			return;
		}
		if (Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2 != arg1) {
			@Pc(159) String local159;
			if (arg1.anInt903 == 0) {
				@Pc(66) boolean local66 = true;
				if (Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt924 != -1 && arg1.anInt924 != -1) {
					@Pc(86) int local86 = Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt924 < arg1.anInt924 ? Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt924 : arg1.anInt924;
					@Pc(92) int local92 = Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt905 - arg1.anInt905;
					if (local92 < 0) {
						local92 = -local92;
					}
					if (local92 > local86) {
						local66 = false;
					}
				}
				@Pc(115) String local115 = Static156.aClass63_2 == Static265.aClass63_4 ? Static174.aClass120_30.method2690(Static266.anInt4796) : Static174.aClass120_28.method2690(Static266.anInt4796);
				if (arg1.anInt905 < arg1.anInt900) {
					local159 = arg1.method743() + (local66 ? Static478.method7057(Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt905, arg1.anInt905) : "<col=ffffff>") + " (" + local115 + arg1.anInt905 + "+" + (arg1.anInt900 - arg1.anInt905) + ")";
				} else {
					local159 = arg1.method743() + (local66 ? Static478.method7057(Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt905, arg1.anInt905) : "<col=ffffff>") + " (" + local115 + arg1.anInt905 + ")";
				}
			} else if (arg1.anInt903 == -1) {
				local159 = arg1.method743();
			} else {
				local159 = arg1.method743() + " (" + Static174.aClass120_29.method2690(Static266.anInt4796) + arg1.anInt903 + ")";
			}
			if (Static285.aBoolean378 && !arg0 && (Static427.anInt7391 & 0x8) != 0) {
				Static150.method2214(0, Static92.aString22 + " -> <col=ffffff>" + local159, true, false, Static83.anInt6737, 0, -1, (long) arg1.anInt1225, false, Static493.aString96, 51, (long) arg1.anInt1225);
			}
			if (arg0) {
				Static150.method2214(0, "", false, false, -1, 0, 0, (long) arg1.anInt1225, true, "<col=cccccc>" + local159, -1, 0L);
			} else {
				for (@Pc(270) int local270 = 7; local270 >= 0; local270--) {
					if (Static447.aStringArray60[local270] != null) {
						@Pc(278) short local278 = 0;
						if (Static156.aClass63_2 == Static550.aClass63_6 && Static447.aStringArray60[local270].equalsIgnoreCase(Static174.aClass120_23.method2690(Static266.anInt4796))) {
							if (Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt905 < arg1.anInt905) {
								local278 = 2000;
							}
							if (Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt889 != 0 && arg1.anInt889 != 0) {
								if (Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt889 == arg1.anInt889) {
									local278 = 2000;
								} else {
									local278 = 0;
								}
							}
						} else if (Static564.aBooleanArray27[local270]) {
							local278 = 2000;
						}
						@Pc(339) short local339 = (short) (local278 + Static23.aShortArray7[local270]);
						@Pc(350) int local350 = Static495.anIntArray477[local270] == -1 ? Static113.anInt2114 : Static495.anIntArray477[local270];
						Static150.method2214(0, "<col=ffffff>" + local159, true, false, local350, 0, -1, (long) arg1.anInt1225, false, Static447.aStringArray60[local270], local339, (long) arg1.anInt1225);
					}
				}
			}
			if (!arg0) {
				for (@Pc(414) Class5_Sub5_Sub15 local414 = (Class5_Sub5_Sub15) Static84.aClass330_6.method7908(); local414 != null; local414 = (Class5_Sub5_Sub15) Static84.aClass330_6.method7914()) {
					if (local414.anInt6765 == 16) {
						local414.aString74 = "<col=ffffff>" + local159;
						return;
					}
				}
			}
		} else if (Static285.aBoolean378 && (Static427.anInt7391 & 0x10) != 0) {
			Static150.method2214(0, Static92.aString22 + " -> <col=ffffff>" + Static174.aClass120_37.method2690(Static266.anInt4796), true, false, Static83.anInt6737, 0, -1, (long) arg1.anInt1225, false, Static493.aString96, 20, 0L);
		}
	}
}
