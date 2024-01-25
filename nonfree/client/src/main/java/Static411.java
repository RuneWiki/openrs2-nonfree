import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!pq", name = "p", descriptor = "[I")
	public static int[] anIntArray499;

	@OriginalMember(owner = "client!pq", name = "t", descriptor = "I")
	public static int anInt8066 = 0;

	@OriginalMember(owner = "client!pq", name = "u", descriptor = "I")
	public static int anInt8067 = -1;

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "(I)V")
	public static void method6650() {
		for (@Pc(13) Class3_Sub4_Sub17 local13 = (Class3_Sub4_Sub17) Static542.aClass183_60.method4795(); local13 != null; local13 = (Class3_Sub4_Sub17) Static542.aClass183_60.method4793()) {
			@Pc(17) Class2_Sub2_Sub3 local17 = local13.aClass2_Sub2_Sub3_1;
			if (local17.aBoolean532) {
				local13.method8412();
				local17.method5167();
			} else if (local17.anInt6205 <= Static129.anInt10429) {
				local17.method5165(Static377.anInt7320);
				if (local17.aBoolean532) {
					local13.method8412();
				} else {
					Static319.method5520(local17, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZLclient!dg;I)V")
	public static void method6653(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub2_Sub1_Sub1 arg1) {
		if (Static309.anInt6170 >= 400) {
			return;
		}
		if (arg1 != Static443.aClass2_Sub2_Sub1_Sub1_2) {
			@Pc(189) String local189;
			@Pc(106) int local106;
			if (arg1.anInt2188 == 0) {
				@Pc(62) boolean local62 = true;
				if (Static443.aClass2_Sub2_Sub1_Sub1_2.anInt2215 != -1 && arg1.anInt2215 != -1) {
					@Pc(85) int local85 = arg1.anInt2212 >= Static443.aClass2_Sub2_Sub1_Sub1_2.anInt2212 ? arg1.anInt2212 : Static443.aClass2_Sub2_Sub1_Sub1_2.anInt2212;
					@Pc(96) int local96 = arg1.anInt2215 <= Static443.aClass2_Sub2_Sub1_Sub1_2.anInt2215 ? arg1.anInt2215 : Static443.aClass2_Sub2_Sub1_Sub1_2.anInt2215;
					local106 = local85 * 10 / 100 + local96 + 5;
					@Pc(112) int local112 = Static443.aClass2_Sub2_Sub1_Sub1_2.anInt2212 - arg1.anInt2212;
					if (local112 < 0) {
						local112 = -local112;
					}
					if (local106 < local112) {
						local62 = false;
					}
				}
				@Pc(142) String local142 = Static581.aClass335_4 == Static329.aClass335_3 ? Static139.aClass101_29.method2841(Static126.anInt2904) : Static139.aClass101_27.method2841(Static126.anInt2904);
				if (arg1.anInt2211 > arg1.anInt2212) {
					local189 = arg1.method2038() + (local62 ? Static399.method6435(arg1.anInt2212, Static443.aClass2_Sub2_Sub1_Sub1_2.anInt2212) : "<col=ffffff>") + " (" + local142 + arg1.anInt2212 + "+" + (arg1.anInt2211 - arg1.anInt2212) + ")";
				} else {
					local189 = arg1.method2038() + (local62 ? Static399.method6435(arg1.anInt2212, Static443.aClass2_Sub2_Sub1_Sub1_2.anInt2212) : "<col=ffffff>") + " (" + local142 + arg1.anInt2212 + ")";
				}
			} else if (arg1.anInt2188 == -1) {
				local189 = arg1.method2038();
			} else {
				local189 = arg1.method2038() + " (" + Static139.aClass101_28.method2841(Static126.anInt2904) + arg1.anInt2188 + ")";
			}
			if (Static594.aBoolean851 && !arg0 && (Static564.anInt10012 & 0x8) != 0) {
				Static200.method3365(0, Static569.aString131 + " -> <col=ffffff>" + local189, (long) arg1.anInt7603, Static590.aString133, 6, -1, false, Static120.anInt2749, 0, true);
			}
			if (arg0) {
				Static200.method3365(0, "", 0L, "<col=cccccc>" + local189, -1, 0, true, -1, 0, false);
			} else {
				for (@Pc(315) int local315 = 7; local315 >= 0; local315--) {
					if (Static372.aStringArray27[local315] != null) {
						@Pc(322) short local322 = 0;
						if (Static318.aClass335_2 == Static581.aClass335_4 && Static372.aStringArray27[local315].equalsIgnoreCase(Static139.aClass101_22.method2841(Static126.anInt2904))) {
							if (Static443.aClass2_Sub2_Sub1_Sub1_2.anInt2212 < arg1.anInt2212) {
								local322 = 2000;
							}
							if (Static443.aClass2_Sub2_Sub1_Sub1_2.anInt2199 != 0 && arg1.anInt2199 != 0) {
								if (arg1.anInt2199 == Static443.aClass2_Sub2_Sub1_Sub1_2.anInt2199) {
									local322 = 2000;
								} else {
									local322 = 0;
								}
							}
						} else if (Static248.aBooleanArray17[local315]) {
							local322 = 2000;
						}
						@Pc(375) short local375 = (short) (local322 + Static235.aShortArray68[local315]);
						local106 = Static267.anIntArray342[local315] == -1 ? Static64.anInt1638 : Static267.anIntArray342[local315];
						Static200.method3365(0, "<col=ffffff>" + local189, (long) arg1.anInt7603, Static372.aStringArray27[local315], local375, -1, false, local106, 0, true);
					}
				}
			}
			if (!arg0) {
				for (@Pc(423) Class3_Sub40 local423 = (Class3_Sub40) Static342.aClass183_44.method4795(); local423 != null; local423 = (Class3_Sub40) Static342.aClass183_44.method4793()) {
					if (local423.anInt7324 == 30) {
						local423.aString88 = "<col=ffffff>" + local189;
						return;
					}
				}
			}
		} else if (Static594.aBoolean851 && (Static564.anInt10012 & 0x10) != 0) {
			Static200.method3365(0, Static569.aString131 + " -> <col=ffffff>" + Static139.aClass101_36.method2841(Static126.anInt2904), 0L, Static590.aString133, 17, -1, false, Static120.anInt2749, 0, true);
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIII)I")
	public static int method6655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16 = 65536 - Class2_Sub3.anIntArray621[arg3 * 8192 / arg0] >> 1;
		return (local16 * arg1 >> 16) + (arg2 * (65536 - local16) >> 16);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method6656(@OriginalArg(0) String arg0) {
		if (Static535.aClass34Array1 != null) {
			@Pc(19) Class3_Sub9 local19 = Static587.method8316(Static187.aClass40_2, Static424.aClass230_84);
			local19.aClass3_Sub7_Sub1_1.method6494(Static85.method1894(arg0));
			local19.aClass3_Sub7_Sub1_1.method6516(arg0);
			Static230.method3933(local19);
		}
	}
}
