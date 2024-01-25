import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!uc", name = "u", descriptor = "Lclient!vh;")
	public static Class7 aClass7_4;

	@OriginalMember(owner = "client!uc", name = "A", descriptor = "Lclient!oa;")
	public static Class65 aClass65_7;

	@OriginalMember(owner = "client!uc", name = "s", descriptor = "S")
	public static short aShort211 = 256;

	@OriginalMember(owner = "client!uc", name = "E", descriptor = "I")
	public static int anInt6923 = 104;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLjava/lang/String;Z)V")
	public static void method5376(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static363.anInt6512 >= 100) {
			Static206.method3380(Static148.aClass175_101.method4201(Static216.anInt4257));
			return;
		}
		@Pc(24) String local24 = Static274.method4071(arg0);
		if (local24 == null) {
			return;
		}
		@Pc(66) String local66;
		for (@Pc(29) int local29 = 0; local29 < Static363.anInt6512; local29++) {
			@Pc(36) String local36 = Static274.method4071(Static169.aStringArray76[local29]);
			if (local36 != null && local36.equals(local24)) {
				Static206.method3380(arg0 + Static332.aClass175_197.method4201(Static216.anInt4257));
				return;
			}
			if (Static352.aStringArray127[local29] != null) {
				local66 = Static274.method4071(Static352.aStringArray127[local29]);
				if (local66 != null && local66.equals(local24)) {
					Static206.method3380(arg0 + Static332.aClass175_197.method4201(Static216.anInt4257));
					return;
				}
			}
		}
		for (@Pc(98) int local98 = 0; local98 < Static317.anInt5757; local98++) {
			local66 = Static274.method4071(Static170.aStringArray78[local98]);
			if (local66 != null && local66.equals(local24)) {
				Static206.method3380(Static135.aClass175_93.method4201(Static216.anInt4257) + arg0 + Static175.aClass175_152.method4201(Static216.anInt4257));
				return;
			}
			if (Static436.aStringArray172[local98] != null) {
				@Pc(150) String local150 = Static274.method4071(Static436.aStringArray172[local98]);
				if (local150 != null && local150.equals(local24)) {
					Static206.method3380(Static135.aClass175_93.method4201(Static216.anInt4257) + arg0 + Static175.aClass175_152.method4201(Static216.anInt4257));
					return;
				}
			}
		}
		if (Static274.method4071(Static113.aClass1_Sub3_Sub3_Sub1_4.aString47).equals(local24)) {
			Static206.method3380(Static314.aClass175_188.method4201(Static216.anInt4257));
		} else {
			Static414.method5552(Static197.aClass92_135);
			Static302.aClass3_Sub2_Sub2_2.method6001(Static442.method5901(arg0) + 1);
			Static302.aClass3_Sub2_Sub2_2.method6033(arg0);
			Static302.aClass3_Sub2_Sub2_2.method6001(arg1 ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I[BB)I")
	public static int method5379(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		return Static35.method4616(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)I")
	public static int method5381() {
		return 6;
	}
}
