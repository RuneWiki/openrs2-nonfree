import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!jv", name = "j", descriptor = "D")
	public static double aDouble18;

	@OriginalMember(owner = "client!jv", name = "k", descriptor = "Lclient!m;")
	public static final Class235 aClass235_32 = new Class235(16);

	@OriginalMember(owner = "client!jv", name = "u", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray19 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IZLclient!oba;)V")
	public static void method4775(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class19_Sub1_Sub3_Sub2_Sub2 arg1) {
		if (Static285.anInt5168 >= 400) {
			return;
		}
		if (Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2 != arg1) {
			@Pc(184) String local184;
			if (arg1.anInt7849 == 0) {
				@Pc(77) boolean local77 = true;
				if (Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt7834 != -1 && arg1.anInt7834 != -1) {
					@Pc(107) int local107 = Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt7834 >= arg1.anInt7834 ? arg1.anInt7834 : Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt7834;
					@Pc(114) int local114 = Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt7841 - arg1.anInt7841;
					if (local114 < 0) {
						local114 = -local114;
					}
					if (local114 > local107) {
						local77 = false;
					}
				}
				@Pc(138) String local138 = Static726.aClass169_12 == Static667.aClass169_8 ? Static476.aClass279_30.method6992(Static141.anInt2658) : Static476.aClass279_28.method6992(Static141.anInt2658);
				if (arg1.anInt7837 <= arg1.anInt7841) {
					local184 = arg1.method6622() + (local77 ? Static5.method83(arg1.anInt7841, Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt7841) : "<col=ffffff>") + " (" + local138 + arg1.anInt7841 + ")";
				} else {
					local184 = arg1.method6622() + (local77 ? Static5.method83(arg1.anInt7841, Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt7841) : "<col=ffffff>") + " (" + local138 + arg1.anInt7841 + "+" + (arg1.anInt7837 - arg1.anInt7841) + ")";
				}
			} else if (arg1.anInt7849 == -1) {
				local184 = arg1.method6622();
			} else {
				local184 = arg1.method6622() + " (" + Static476.aClass279_29.method6992(Static141.anInt2658) + arg1.anInt7849 + ")";
			}
			if (Static212.aBoolean297 && !arg0 && (Static718.anInt11231 & 0x8) != 0) {
				Static91.method1249(Static27.anInt421, Static177.aString97, (long) arg1.anInt7796, (long) arg1.anInt7796, 47, 0, false, false, 0, Static90.aString28 + " -> <col=ffffff>" + local184, true, -1);
			}
			if (arg0) {
				Static91.method1249(-1, "<col=cccccc>" + local184, 0L, (long) arg1.anInt7796, -1, 0, true, false, 0, "", false, 0);
			} else {
				for (@Pc(351) int local351 = 7; local351 >= 0; local351--) {
					if (Static426.aStringArray28[local351] != null) {
						@Pc(361) short local361 = 0;
						if (Static667.aClass169_8 == Static615.aClass169_7 && Static426.aStringArray28[local351].equalsIgnoreCase(Static476.aClass279_23.method6992(Static141.anInt2658))) {
							if (Static327.aBoolean469 && Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt7841 < arg1.anInt7841) {
								local361 = 2000;
							}
							if (Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt7836 == 0 || arg1.anInt7836 == 0) {
								if (arg1.aBoolean599) {
									local361 = 2000;
								}
							} else if (arg1.anInt7836 == Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt7836) {
								local361 = 2000;
							} else {
								local361 = 0;
							}
						} else if (Static96.aBooleanArray2[local351]) {
							local361 = 2000;
						}
						@Pc(442) short local442 = (short) (Static100.aShortArray147[local351] + local361);
						@Pc(454) int local454 = Static169.anIntArray154[local351] == -1 ? Static103.anInt1659 : Static169.anIntArray154[local351];
						Static91.method1249(local454, Static426.aStringArray28[local351], (long) arg1.anInt7796, (long) arg1.anInt7796, local442, 0, false, false, 0, "<col=ffffff>" + local184, true, -1);
					}
				}
			}
			if (!arg0) {
				for (@Pc(501) Class3_Sub4_Sub5 local501 = (Class3_Sub4_Sub5) Static562.aClass357_54.method8391(); local501 != null; local501 = (Class3_Sub4_Sub5) Static562.aClass357_54.method8392()) {
					if (local501.anInt2775 == 45) {
						local501.aString49 = "<col=ffffff>" + local184;
						return;
					}
				}
			}
		} else if (Static212.aBoolean297 && (Static718.anInt11231 & 0x10) != 0) {
			Static91.method1249(Static27.anInt421, Static177.aString97, 0L, (long) arg1.anInt7796, 17, 0, false, false, 0, Static90.aString28 + " -> <col=ffffff>" + Static476.aClass279_37.method6992(Static141.anInt2658), true, -1);
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(BIZZLclient!ha;)Lclient!da;")
	public static Class44 method4777(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class67 arg3) {
		@Pc(10) Class288 local10 = Static247.method3753(arg1, arg3, arg0, arg2);
		return local10 == null ? null : local10.aClass44_38;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lclient!av;B)V")
	public static void method4780(@OriginalArg(0) Class20 arg0) {
		if (arg0.anInt532 == 5 && arg0.anInt595 != -1) {
			Static193.method2927(arg0, Static488.aClass67_12);
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IBI)Z")
	public static boolean method4781(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static632.method8567(arg1, arg0) || Static161.method2562(arg0, arg1);
	}
}
