import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!lc", name = "I", descriptor = "Lclient!dv;")
	public static final Class63 aClass63_3 = new Class63();

	@OriginalMember(owner = "client!lc", name = "L", descriptor = "[I")
	public static final int[] anIntArray295 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!lc", name = "N", descriptor = "[[I")
	public static final int[][] anIntArrayArray34 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!lc", name = "O", descriptor = "[I")
	public static final int[] anIntArray296 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZBLjava/lang/String;)V")
	public static void method3292(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static316.anInt5221 >= 100) {
			Static246.method3498(Static377.aClass142_96.method3118(Static63.anInt981));
			return;
		}
		@Pc(24) String local24 = Static91.method1066(arg1);
		if (local24 == null) {
			return;
		}
		@Pc(67) String local67;
		for (@Pc(29) int local29 = 0; local29 < Static316.anInt5221; local29++) {
			@Pc(37) String local37 = Static91.method1066(Static167.aStringArray18[local29]);
			if (local37 != null && local37.equals(local24)) {
				Static246.method3498(arg1 + Static363.aClass142_93.method3118(Static63.anInt981));
				return;
			}
			if (Static100.aStringArray9[local29] != null) {
				local67 = Static91.method1066(Static100.aStringArray9[local29]);
				if (local67 != null && local67.equals(local24)) {
					Static246.method3498(arg1 + Static363.aClass142_93.method3118(Static63.anInt981));
					return;
				}
			}
		}
		for (@Pc(93) int local93 = 0; local93 < Static148.anInt2307; local93++) {
			local67 = Static91.method1066(Static108.aStringArray10[local93]);
			if (local67 != null && local67.equals(local24)) {
				Static246.method3498(Static318.aClass142_83.method3118(Static63.anInt981) + arg1 + Static39.aClass142_8.method3118(Static63.anInt981));
				return;
			}
			if (Static313.aStringArray41[local93] != null) {
				@Pc(136) String local136 = Static91.method1066(Static313.aStringArray41[local93]);
				if (local136 != null && local136.equals(local24)) {
					Static246.method3498(Static318.aClass142_83.method3118(Static63.anInt981) + arg1 + Static39.aClass142_8.method3118(Static63.anInt981));
					return;
				}
			}
		}
		if (Static91.method1066(Static94.aClass11_Sub1_Sub3_Sub2_1.aString32).equals(local24)) {
			Static246.method3498(Static401.aClass142_100.method3118(Static63.anInt981));
		} else {
			Static178.method2589(Static229.aClass242_63);
			Static426.aClass1_Sub19_Sub2_2.method2934(Static108.method1349(arg1) + 1);
			Static426.aClass1_Sub19_Sub2_2.method2935(arg1);
			Static426.aClass1_Sub19_Sub2_2.method2934(arg0 ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!nd;[[B)V")
	public static void method3293(@OriginalArg(1) Class104_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(14) int local14 = 0; local14 < arg0.anInt4713; local14++) {
			Static459.method5910();
			for (@Pc(22) int local22 = 0; local22 < Static147.anInt2300 >> 3; local22++) {
				for (@Pc(26) int local26 = 0; local26 < Static293.anInt4886 >> 3; local26++) {
					@Pc(36) int local36 = Static291.anIntArrayArrayArray6[local14][local22][local26];
					if (local36 != -1) {
						@Pc(46) int local46 = local36 >> 24 & 0x3;
						if (!arg0.aBoolean425 || local46 == 0) {
							@Pc(57) int local57 = local36 >> 1 & 0x3;
							@Pc(63) int local63 = local36 >> 14 & 0x3FF;
							@Pc(69) int local69 = local36 >> 3 & 0x7FF;
							@Pc(79) int local79 = (local63 / 8 << 8) + local69 / 8;
							for (@Pc(81) int local81 = 0; local81 < Static334.anIntArray397.length; local81++) {
								if (Static334.anIntArray397[local81] == local79 && arg1[local81] != null) {
									@Pc(99) Class1_Sub19 local99 = new Class1_Sub19(arg1[local81]);
									arg0.method3723(local22 * 8, local26 * 8, local14, local69, local99, local46, Static385.aClass158Array1, local57, local63);
									arg0.method3729(local69, local46, local99, local12[0] == -1 ? local12 : null, local22 * 8, local57, Static186.aClass117_3, local63, local14, local26 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static203.aClass197_1 = Static202.aClass237_27.method5077(local12[1], local12[3], Static429.aClass126_1, local12[2], local12[0]);
			Static331.anInt5431 = local12[4];
		}
	}

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "(I)V")
	public static void method3294() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static147.anInt2300; local9++) {
			for (@Pc(13) int local13 = 0; local13 < Static293.anInt4886; local13++) {
				if (Static403.method5127(true, local13, local7, local9, Static259.aClass216ArrayArrayArray3)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}
}
