import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!sb", name = "t", descriptor = "Z")
	public static boolean aBoolean447 = false;

	@OriginalMember(owner = "client!sb", name = "N", descriptor = "I")
	public static int anInt6422 = 0;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILclient!eo;Lclient!eo;)V")
	public static void method5081(@OriginalArg(1) Class68 arg0, @OriginalArg(2) Class68 arg1) {
		Static414.method5552(Static21.aClass92_23);
		Static302.aClass3_Sub2_Sub2_2.method6008(arg0.anInt2177);
		Static302.aClass3_Sub2_Sub2_2.method5998(arg1.anInt2177);
		Static302.aClass3_Sub2_Sub2_2.method6045(arg1.anInt2187);
		Static302.aClass3_Sub2_Sub2_2.method5996(arg0.anInt2187);
		Static302.aClass3_Sub2_Sub2_2.method6045(arg1.anInt2192);
		Static302.aClass3_Sub2_Sub2_2.method6045(arg0.anInt2192);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method5083(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static317.anInt5757 >= 100 && !Static17.aBoolean22 || Static317.anInt5757 >= 200) {
			Static206.method3380(Static154.aClass175_105.method4201(Static216.anInt4257));
			return;
		}
		@Pc(29) String local29 = Static274.method4071(arg0);
		if (local29 == null) {
			return;
		}
		@Pc(71) String local71;
		for (@Pc(34) int local34 = 0; local34 < Static317.anInt5757; local34++) {
			@Pc(41) String local41 = Static274.method4071(Static170.aStringArray78[local34]);
			if (local41 != null && local41.equals(local29)) {
				Static206.method3380(arg0 + Static382.aClass175_218.method4201(Static216.anInt4257));
				return;
			}
			if (Static436.aStringArray172[local34] != null) {
				local71 = Static274.method4071(Static436.aStringArray172[local34]);
				if (local71 != null && local71.equals(local29)) {
					Static206.method3380(arg0 + Static382.aClass175_218.method4201(Static216.anInt4257));
					return;
				}
			}
		}
		for (@Pc(101) int local101 = 0; local101 < Static363.anInt6512; local101++) {
			local71 = Static274.method4071(Static169.aStringArray76[local101]);
			if (local71 != null && local71.equals(local29)) {
				Static206.method3380(Static136.aClass175_76.method4201(Static216.anInt4257) + arg0 + Static311.aClass175_187.method4201(Static216.anInt4257));
				return;
			}
			if (Static352.aStringArray127[local101] != null) {
				@Pc(143) String local143 = Static274.method4071(Static352.aStringArray127[local101]);
				if (local143 != null && local143.equals(local29)) {
					Static206.method3380(Static136.aClass175_76.method4201(Static216.anInt4257) + arg0 + Static311.aClass175_187.method4201(Static216.anInt4257));
					return;
				}
			}
		}
		if (Static274.method4071(Static113.aClass1_Sub3_Sub3_Sub1_4.aString47).equals(local29)) {
			Static206.method3380(Static125.aClass175_38.method4201(Static216.anInt4257));
		} else {
			Static414.method5552(Static186.aClass92_115);
			Static302.aClass3_Sub2_Sub2_2.method6001(Static442.method5901(arg0));
			Static302.aClass3_Sub2_Sub2_2.method6033(arg0);
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V")
	public static void method5085() {
		for (@Pc(5) int local5 = 0; local5 < 100; local5++) {
			Static308.aBooleanArray18[local5] = true;
		}
	}
}
