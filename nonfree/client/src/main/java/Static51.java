import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!ch", name = "q", descriptor = "Lclient!ou;")
	public static Class141 aClass141_1;

	@OriginalMember(owner = "client!ch", name = "z", descriptor = "I")
	public static final int anInt1384 = 1;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZILclient!ql;)V")
	public static void method1003(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class4_Sub2_Sub2_Sub1 arg1) {
		if (Static168.anInt3255 >= 400) {
			return;
		}
		if (arg1 != Static231.aClass4_Sub2_Sub2_Sub1_2) {
			@Pc(187) String local187;
			@Pc(107) int local107;
			if (arg1.anInt5750 == 0) {
				@Pc(62) boolean local62 = true;
				if (Static231.aClass4_Sub2_Sub2_Sub1_2.anInt5746 != -1 && arg1.anInt5746 != -1) {
					@Pc(86) int local86 = arg1.anInt5730 >= Static231.aClass4_Sub2_Sub2_Sub1_2.anInt5730 ? arg1.anInt5730 : Static231.aClass4_Sub2_Sub2_Sub1_2.anInt5730;
					@Pc(97) int local97 = arg1.anInt5746 <= Static231.aClass4_Sub2_Sub2_Sub1_2.anInt5746 ? arg1.anInt5746 : Static231.aClass4_Sub2_Sub2_Sub1_2.anInt5746;
					local107 = local86 * 10 / 100 + local97 + 5;
					@Pc(113) int local113 = Static231.aClass4_Sub2_Sub2_Sub1_2.anInt5730 - arg1.anInt5730;
					if (local113 < 0) {
						local113 = -local113;
					}
					if (local113 > local107) {
						local62 = false;
					}
				}
				@Pc(139) String local139 = Static107.aClass209_1 == Static389.aClass209_2 ? Static337.aClass256_119.method5720(Static272.anInt7537) : Static156.aClass256_54.method5720(Static272.anInt7537);
				if (arg1.anInt5730 < arg1.anInt5743) {
					local187 = arg1.method4600() + (local62 ? Static206.method3174(arg1.anInt5730, Static231.aClass4_Sub2_Sub2_Sub1_2.anInt5730) : "<col=ffffff>") + " (" + local139 + arg1.anInt5730 + "+" + (arg1.anInt5743 - arg1.anInt5730) + ")";
				} else {
					local187 = arg1.method4600() + (local62 ? Static206.method3174(arg1.anInt5730, Static231.aClass4_Sub2_Sub2_Sub1_2.anInt5730) : "<col=ffffff>") + " (" + local139 + arg1.anInt5730 + ")";
				}
			} else {
				local187 = arg1.method4600() + " (" + Static17.aClass256_9.method5720(Static272.anInt7537) + arg1.anInt5750 + ")";
			}
			if (Static428.aBoolean637) {
				if (!arg0 && (Static248.anInt4731 & 0x8) != 0) {
					Static333.method4738(-1, Static179.aString56 + " -> <col=ffffff>" + local187, true, 0, 57, Static174.aString23, Static445.anInt7767, (long) arg1.anInt6456, 0, false);
				}
			} else if (arg0) {
				Static333.method4738(0, "", false, 0, -1, "<col=cccccc>" + local187, -1, 0L, 0, true);
			} else {
				for (@Pc(309) int local309 = 7; local309 >= 0; local309--) {
					if (Static39.aStringArray1[local309] != null) {
						@Pc(317) short local317 = 0;
						if (Static407.aClass209_3 == Static107.aClass209_1 && Static39.aStringArray1[local309].equalsIgnoreCase(Static389.aClass256_140.method5720(Static272.anInt7537))) {
							if (Static231.aClass4_Sub2_Sub2_Sub1_2.anInt5730 < arg1.anInt5730) {
								local317 = 2000;
							}
							if (Static231.aClass4_Sub2_Sub2_Sub1_2.anInt5734 != 0 && arg1.anInt5734 != 0) {
								if (Static231.aClass4_Sub2_Sub2_Sub1_2.anInt5734 == arg1.anInt5734) {
									local317 = 2000;
								} else {
									local317 = 0;
								}
							}
						} else if (Static405.aBooleanArray49[local309]) {
							local317 = 2000;
						}
						@Pc(375) short local375 = (short) (Static2.aShortArray1[local309] + local317);
						local107 = Static4.anIntArray4[local309] == -1 ? Static340.anInt5988 : Static4.anIntArray4[local309];
						Static333.method4738(-1, "<col=ffffff>" + local187, true, 0, local375, Static39.aStringArray1[local309], local107, (long) arg1.anInt6456, 0, false);
					}
				}
			}
			if (!arg0) {
				for (@Pc(422) Class2_Sub26 local422 = (Class2_Sub26) Static288.aClass265_41.method6005(); local422 != null; local422 = (Class2_Sub26) Static288.aClass265_41.method6001()) {
					if (local422.anInt4529 == 6) {
						local422.aString41 = "<col=ffffff>" + local187;
						return;
					}
				}
			}
		} else if (Static428.aBoolean637 && (Static248.anInt4731 & 0x10) != 0) {
			Static333.method4738(-1, Static179.aString56 + " -> <col=ffffff>" + Static67.aClass256_33.method5720(Static272.anInt7537), true, 0, 18, Static174.aString23, Static445.anInt7767, 0L, 0, false);
		}
	}
}
