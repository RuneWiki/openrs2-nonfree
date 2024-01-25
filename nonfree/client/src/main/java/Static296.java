import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "Lclient!wq;")
	public static Class362 aClass362_2;

	@OriginalMember(owner = "client!lg", name = "g", descriptor = "Lclient!ga;")
	public static Class111 aClass111_69;

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "Lclient!tl;")
	public static final Class314 aClass314_6 = new Class314();

	@OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
	public static int anInt5477 = 0;

	@OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
	public static int anInt5478 = 0;

	@OriginalMember(owner = "client!lg", name = "n", descriptor = "I")
	public static int anInt5480 = 0;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZLclient!kba;I)V")
	public static void method4672(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class20_Sub2_Sub4_Sub1_Sub1 arg1) {
		if (Static135.anInt2684 >= 400) {
			return;
		}
		if (arg1 != Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2) {
			@Pc(82) String local82;
			@Pc(135) int local135;
			if (arg1.anInt4923 == 0) {
				@Pc(93) boolean local93 = true;
				if (Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt4928 != -1 && arg1.anInt4928 != -1) {
					@Pc(114) int local114 = Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt4922 > arg1.anInt4922 ? Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt4922 : arg1.anInt4922;
					@Pc(125) int local125 = arg1.anInt4928 > Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt4928 ? Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt4928 : arg1.anInt4928;
					local135 = local125 + local114 * 10 / 100 + 5;
					@Pc(141) int local141 = Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt4922 - arg1.anInt4922;
					if (local141 < 0) {
						local141 = -local141;
					}
					if (local135 < local141) {
						local93 = false;
					}
				}
				@Pc(167) String local167 = Static275.aClass230_2 == Static353.aClass230_3 ? Static103.aClass77_32.method1864(Static562.anInt9127) : Static103.aClass77_30.method1864(Static562.anInt9127);
				if (arg1.anInt4930 > arg1.anInt4922) {
					local82 = arg1.method4153() + (local93 ? Static246.method7222(arg1.anInt4922, Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt4922) : "<col=ffffff>") + " (" + local167 + arg1.anInt4922 + "+" + (arg1.anInt4930 - arg1.anInt4922) + ")";
				} else {
					local82 = arg1.method4153() + (local93 ? Static246.method7222(arg1.anInt4922, Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt4922) : "<col=ffffff>") + " (" + local167 + arg1.anInt4922 + ")";
				}
			} else if (arg1.anInt4923 == -1) {
				local82 = arg1.method4153();
			} else {
				local82 = arg1.method4153() + " (" + Static103.aClass77_31.method1864(Static562.anInt9127) + arg1.anInt4923 + ")";
			}
			if (Static22.aBoolean43 && !arg0 && (Static434.anInt7646 & 0x8) != 0) {
				Static374.method5440(true, -1, 22, Static559.aString92, false, (long) arg1.anInt6407, Static3.anInt71, 0, 0, Static264.aString51 + " -> <col=ffffff>" + local82);
			}
			if (arg0) {
				Static374.method5440(false, 0, -1, "<col=cccccc>" + local82, true, 0L, -1, 0, 0, "");
			} else {
				for (@Pc(289) int local289 = 7; local289 >= 0; local289--) {
					if (Static472.aStringArray41[local289] != null) {
						@Pc(297) short local297 = 0;
						if (Static275.aClass230_2 == Static433.aClass230_4 && Static472.aStringArray41[local289].equalsIgnoreCase(Static103.aClass77_25.method1864(Static562.anInt9127))) {
							if (arg1.anInt4922 > Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt4922) {
								local297 = 2000;
							}
							if (Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt4933 != 0 && arg1.anInt4933 != 0) {
								if (Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt4933 == arg1.anInt4933) {
									local297 = 2000;
								} else {
									local297 = 0;
								}
							}
						} else if (Static511.aBooleanArray27[local289]) {
							local297 = 2000;
						}
						@Pc(358) short local358 = (short) (Static557.aShortArray113[local289] + local297);
						local135 = Static311.anIntArray359[local289] == -1 ? Static183.anInt3713 : Static311.anIntArray359[local289];
						Static374.method5440(true, -1, local358, Static472.aStringArray41[local289], false, (long) arg1.anInt6407, local135, 0, 0, "<col=ffffff>" + local82);
					}
				}
			}
			if (!arg0) {
				for (@Pc(432) Class1_Sub23 local432 = (Class1_Sub23) Static3.aClass361_1.method7854(); local432 != null; local432 = (Class1_Sub23) Static3.aClass361_1.method7853()) {
					if (local432.anInt5147 == 12) {
						local432.aString55 = "<col=ffffff>" + local82;
						return;
					}
				}
			}
		} else if (Static22.aBoolean43 && (Static434.anInt7646 & 0x10) != 0) {
			Static374.method5440(true, -1, 57, Static559.aString92, false, 0L, Static3.anInt71, 0, 0, Static264.aString51 + " -> <col=ffffff>" + Static103.aClass77_39.method1864(Static562.anInt9127));
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZILjava/lang/String;Ljava/lang/String;)V")
	public static void method4673(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		Static77.aString86 = arg2;
		Static365.aBoolean462 = arg0;
		Static315.aString63 = arg1;
		if (!Static365.aBoolean462 && Static590.anInt9527 != 3 && (Static315.aString63.equals("") || Static77.aString86.equals(""))) {
			Static298.method4694(3);
			return;
		}
		Static533.aBoolean650 = false;
		if (Static590.anInt9527 != 1) {
			Static413.anInt7039 = -1;
			Static321.anInt5786 = 0;
		}
		Static298.method4694(-3);
		Static73.anInt1814 = 0;
		Static316.anInt5682 = 1;
		Static188.anInt3883 = 0;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method4675(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(12) Class1_Sub48 local12 = Static320.method4867(Static442.aClass170_2, Static581.aClass319_170);
		local12.aClass1_Sub20_Sub1_2.method4378(Static419.method5867(arg1) + 1);
		local12.aClass1_Sub20_Sub1_2.method4399(arg1);
		local12.aClass1_Sub20_Sub1_2.method4377(arg0);
		Static34.method813(local12);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(DB)V")
	public static void method4676(@OriginalArg(0) double arg0) {
		if (arg0 == Static426.aDouble1) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(19) int local19 = (int) (Math.pow((double) local7 / 255.0D, arg0) * 255.0D);
			Static485.anIntArray542[local7] = local19 > 255 ? 255 : local19;
		}
		Static426.aDouble1 = arg0;
	}
}
