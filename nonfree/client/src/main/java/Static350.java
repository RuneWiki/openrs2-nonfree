import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!rn", name = "Y", descriptor = "Lclient!ei;")
	public static Class66 aClass66_1;

	@OriginalMember(owner = "client!rn", name = "N", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_107 = new Class15(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

	@OriginalMember(owner = "client!rn", name = "pb", descriptor = "I")
	public static int anInt5812 = 0;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIBII)V")
	public static void method4631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static62.anInt1114 <= arg3 - arg1 && arg1 + arg3 <= Static207.anInt3632 && Static254.anInt4211 <= arg0 - arg1 && Static275.anInt4594 >= arg0 + arg1) {
			Static410.method5573(arg1, arg0, arg3, arg2);
		} else {
			Static353.method4677(arg2, arg3, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZBLclient!wg;)V")
	public static void method4632(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class8_Sub3_Sub1_Sub2 arg1) {
		if (Static351.anInt5841 >= 400) {
			return;
		}
		@Pc(14) Class78 local14 = arg1.aClass78_1;
		if (local14.anIntArray145 != null) {
			local14 = local14.method1547(Static52.aClass81_1);
			if (local14 == null) {
				return;
			}
		}
		if (!local14.lb) {
			return;
		}
		@Pc(36) String local36 = local14.aString9;
		if (local14.anInt1919 != 0) {
			@Pc(55) String local55 = Static231.aClass6_7 == Static15.aClass6_1 ? Static12.aClass15_6.method180(Static429.anInt6999) : Static88.aClass15_31.method180(Static429.anInt6999);
			local36 = local36 + Static89.method1409(local14.anInt1919, Static401.aClass8_Sub3_Sub1_Sub1_2.anInt5682) + " (" + local55 + local14.anInt1919 + ")";
		}
		if (!Static70.aBoolean94) {
			if (!arg0) {
				@Pc(85) String[] local85 = local14.aStringArray15;
				if (Static456.aBoolean537) {
					local85 = Static258.method3441(local85);
				}
				@Pc(95) int local95;
				if (local85 != null) {
					for (local95 = 4; local95 >= 0; local95--) {
						if (local85[local95] != null && (local14.aByte42 == 0 || !local85[local95].equalsIgnoreCase(Static246.aClass15_67.method180(Static429.anInt6999)))) {
							@Pc(115) byte local115 = 0;
							@Pc(117) int local117 = Static211.anInt3677;
							if (local95 == 0) {
								local115 = 25;
							}
							if (local95 == 1) {
								local115 = 13;
							}
							if (local95 == 2) {
								local115 = 19;
							}
							if (local95 == 3) {
								local115 = 8;
							}
							if (local95 == 4) {
								local115 = 22;
							}
							if (local95 == local14.anInt1889) {
								local117 = local14.anInt1891;
							}
							if (local95 == local14.anInt1894) {
								local117 = local14.anInt1902;
							}
							Static391.method5158((long) arg1.anInt7391, -1, 0, 0, local117, "<col=ffff00>" + local36, local115, false, local85[local95], true);
						}
					}
				}
				if (local14.aByte42 == 1 && local85 != null) {
					for (local95 = 4; local95 >= 0; local95--) {
						if (local85[local95] != null && local85[local95].equalsIgnoreCase(Static246.aClass15_67.method180(Static429.anInt6999))) {
							@Pc(228) short local228 = 0;
							if (local14.anInt1919 > Static401.aClass8_Sub3_Sub1_Sub1_2.anInt5682) {
								local228 = 2000;
							}
							@Pc(237) short local237 = 0;
							if (local95 == 0) {
								local237 = 25;
							}
							if (local95 == 1) {
								local237 = 13;
							}
							if (local95 == 2) {
								local237 = 19;
							}
							if (local95 == 3) {
								local237 = 8;
							}
							if (local95 == 4) {
								local237 = 22;
							}
							if (local237 != 0) {
								local237 += local228;
							}
							Static391.method5158((long) arg1.anInt7391, -1, 0, 0, local14.anInt1892, "<col=ffff00>" + local36, local237, false, local85[local95], true);
						}
					}
				}
			}
			Static391.method5158((long) arg1.anInt7391, -1, 0, 0, Static204.anInt3608, "<col=ffff00>" + local36, 1008, arg0, Static308.aClass15_89.method180(Static429.anInt6999), true);
		} else if (!arg0) {
			@Pc(347) Class247 local347 = Static134.anInt2452 == -1 ? null : Static435.aClass240_2.method5128(Static134.anInt2452);
			if ((Static115.anInt2115 & 0x2) != 0) {
				if (local347 == null || local14.method1554(Static134.anInt2452, local347.anInt6901) != local347.anInt6901) {
					Static391.method5158((long) arg1.anInt7391, -1, 0, 0, Static111.anInt2085, Static368.aString66 + " -> <col=ffff00>" + local36, 16, false, Static304.aString54, true);
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)I")
	public static int method4637(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg1.length();
		@Pc(11) int local11 = arg2.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local13 - local17 < local8 || local11 > local15 - local19) {
			if (local13 - local17 >= local8) {
				return -1;
			}
			if (local11 <= local15 - local19) {
				return 1;
			}
			@Pc(61) char local61;
			if (local17 == '\u0000') {
				local61 = arg1.charAt(local13++);
			} else {
				local61 = local17;
			}
			@Pc(77) char local77;
			if (local19 == '\u0000') {
				local77 = arg2.charAt(local15++);
			} else {
				local77 = local19;
			}
			local17 = Static370.method4887(local61);
			local19 = Static370.method4887(local77);
			local61 = Static307.method4005(arg0, local61);
			local77 = Static307.method4005(arg0, local77);
			if (local77 != local61 && Character.toUpperCase(local61) != Character.toUpperCase(local77)) {
				local61 = Character.toLowerCase(local61);
				local77 = Character.toLowerCase(local77);
				if (local61 != local77) {
					return Static215.method4452(local61, arg0) - Static215.method4452(local77, arg0);
				}
			}
		}
		@Pc(140) int local140 = Math.min(local8, local11);
		for (@Pc(142) int local142 = 0; local142 < local140; local142++) {
			if (arg0 == 2) {
				local15 = local11 - local142 - 1;
				local13 = local8 - local142 - 1;
			} else {
				local15 = local142;
				local13 = local142;
			}
			@Pc(173) char local173 = arg1.charAt(local13);
			@Pc(177) char local177 = arg2.charAt(local15);
			if (local173 != local177 && Character.toUpperCase(local173) != Character.toUpperCase(local177)) {
				local173 = Character.toLowerCase(local173);
				local177 = Character.toLowerCase(local177);
				if (local177 != local173) {
					return Static215.method4452(local173, arg0) - Static215.method4452(local177, arg0);
				}
			}
		}
		@Pc(221) int local221 = local8 - local11;
		if (local221 != 0) {
			return local221;
		}
		for (@Pc(230) int local230 = 0; local230 < local140; local230++) {
			@Pc(236) char local236 = arg1.charAt(local230);
			@Pc(240) char local240 = arg2.charAt(local230);
			if (local240 != local236) {
				return Static215.method4452(local236, arg0) - Static215.method4452(local240, arg0);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZI)Z")
	public static boolean method4638(@OriginalArg(0) boolean arg0) {
		@Pc(6) boolean local6 = Static39.aClass135_1.method5355();
		if (local6 == arg0) {
			return true;
		}
		if (!arg0) {
			Static39.aClass135_1.method5353();
		} else if (!Static39.aClass135_1.method5403()) {
			arg0 = false;
		}
		if (arg0 == local6) {
			return false;
		} else {
			Static413.aClass49_Sub1_1.aBoolean245 = arg0;
			Static413.aClass49_Sub1_1.method2483(Static24.aClass196_1);
			return true;
		}
	}
}
