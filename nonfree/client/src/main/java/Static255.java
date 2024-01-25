import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!ql", name = "Dc", descriptor = "I")
	public static int anInt4994 = 0;

	@OriginalMember(owner = "client!ql", name = "Sc", descriptor = "I")
	public static int anInt5009 = 0;

	@OriginalMember(owner = "client!ql", name = "h", descriptor = "(I)I")
	public static int method4551() {
		if (Static179.aBoolean310 || Static277.anInt6207 <= 0) {
			@Pc(11) int local11 = Static179.anInt3693;
			@Pc(13) int local13 = Static295.anInt5742;
			@Pc(15) int local15 = Static13.anInt269;
			@Pc(17) int local17 = Static288.anInt6178;
			@Pc(19) int local19 = Static139.anInt2759;
			if (local11 > local15 && local11 < local15 + local19) {
				@Pc(37) int local37 = -1;
				@Pc(55) int local55;
				for (@Pc(39) int local39 = 0; local39 < Static277.anInt6207; local39++) {
					if (Static273.aBoolean458) {
						local55 = (Static277.anInt6207 - local39 - 1) * 16 + local17 + 33;
						if (local13 > local55 - 13 && local55 + 3 >= local13) {
							local37 = local39;
						}
					} else {
						local55 = (Static277.anInt6207 - local39 - 1) * 16 + local17 + 31;
						if (local13 > local55 - 13 && local55 + 3 >= local13) {
							local37 = local39;
						}
					}
				}
				if (local37 != -1) {
					local55 = 0;
					@Pc(120) Class76 local120 = new Class76(Static175.aClass195_36);
					for (@Pc(125) Class1_Sub41 local125 = (Class1_Sub41) local120.method2087(); local125 != null; local125 = (Class1_Sub41) local120.method2085()) {
						if (local37 == local55++) {
							return local125.anInt6345;
						}
					}
				}
			}
			return -1;
		} else if (Static93.aBoolean161 && Static220.aBooleanArray24[81] && Static277.anInt6207 > 2) {
			return ((Class1_Sub41) Static175.aClass195_36.aClass1_207.aClass1_248.aClass1_248).anInt6345;
		} else {
			return ((Class1_Sub41) Static175.aClass195_36.aClass1_207.aClass1_248).anInt6345;
		}
	}

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "(B)V")
	public static void method4553() {
		if (Static198.aClass216_1 == null) {
			return;
		}
		while (true) {
			while (Static54.anInt3492 < Static296.aClass74_Sub1Array2.length) {
				@Pc(26) Class74_Sub1 local26 = Static296.aClass74_Sub1Array2[Static54.anInt3492];
				if (local26 != null && local26.anInt2266 == -1) {
					if (Static2.aClass1_Sub15_3 == null) {
						Static2.aClass1_Sub15_3 = Static198.aClass216_1.method5613(local26.aString91);
					}
					@Pc(49) int local49 = Static2.aClass1_Sub15_3.anInt2305;
					if (local49 == -1) {
						return;
					}
					Static2.aClass1_Sub15_3 = null;
					Static54.anInt3492++;
					local26.anInt2266 = local49;
				} else {
					Static54.anInt3492++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ql", name = "j", descriptor = "(I)V")
	public static void method4554() {
		Static232.aClass1_Sub7_Sub1_4.method729();
		@Pc(13) int local13 = Static232.aClass1_Sub7_Sub1_4.method733(8);
		@Pc(26) int local26;
		if (Static338.anInt6419 > local13) {
			for (local26 = local13; local26 < Static338.anInt6419; local26++) {
				Static192.anIntArray812[Static253.anInt4863++] = Static25.anIntArray83[local26];
			}
		}
		if (Static338.anInt6419 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static338.anInt6419 = 0;
		for (local26 = 0; local26 < local13; local26++) {
			@Pc(64) int local64 = Static25.anIntArray83[local26];
			@Pc(68) Class5_Sub3_Sub3_Sub2 local68 = Static169.aClass5_Sub3_Sub3_Sub2Array2[local64];
			@Pc(73) int local73 = Static232.aClass1_Sub7_Sub1_4.method733(1);
			if (local73 == 0) {
				Static25.anIntArray83[Static338.anInt6419++] = local64;
				local68.anInt4932 = Static215.anInt4246;
			} else {
				@Pc(93) int local93 = Static232.aClass1_Sub7_Sub1_4.method733(2);
				if (local93 == 0) {
					Static25.anIntArray83[Static338.anInt6419++] = local64;
					local68.anInt4932 = Static215.anInt4246;
					Static320.anIntArray768[Static125.anInt2470++] = local64;
				} else {
					@Pc(137) int local137;
					@Pc(147) int local147;
					if (local93 == 1) {
						Static25.anIntArray83[Static338.anInt6419++] = local64;
						local68.anInt4932 = Static215.anInt4246;
						local137 = Static232.aClass1_Sub7_Sub1_4.method733(3);
						local68.method4532(local137, 1);
						local147 = Static232.aClass1_Sub7_Sub1_4.method733(1);
						if (local147 == 1) {
							Static320.anIntArray768[Static125.anInt2470++] = local64;
						}
					} else if (local93 == 2) {
						Static25.anIntArray83[Static338.anInt6419++] = local64;
						local68.anInt4932 = Static215.anInt4246;
						if (Static232.aClass1_Sub7_Sub1_4.method733(1) == 1) {
							local137 = Static232.aClass1_Sub7_Sub1_4.method733(3);
							local68.method4532(local137, 2);
							local147 = Static232.aClass1_Sub7_Sub1_4.method733(3);
							local68.method4532(local147, 2);
						} else {
							local137 = Static232.aClass1_Sub7_Sub1_4.method733(3);
							local68.method4532(local137, 0);
						}
						local137 = Static232.aClass1_Sub7_Sub1_4.method733(1);
						if (local137 == 1) {
							Static320.anIntArray768[Static125.anInt2470++] = local64;
						}
					} else if (local93 == 3) {
						Static192.anIntArray812[Static253.anInt4863++] = local64;
					}
				}
			}
		}
	}
}
