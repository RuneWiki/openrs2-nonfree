import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!wf", name = "n", descriptor = "Z")
	public static boolean aBoolean590 = false;

	@OriginalMember(owner = "client!wf", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString250 = "Continue";

	@OriginalMember(owner = "client!wf", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString251 = "Loaded defaults";

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	public static void method5631(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static173.anInt3827 >= 100) {
			Static159.method3073(Static233.aString175);
			return;
		}
		@Pc(21) String local21 = Static164.method3147(arg0);
		if (local21 == null) {
			return;
		}
		@Pc(66) String local66;
		for (@Pc(31) int local31 = 0; local31 < Static173.anInt3827; local31++) {
			@Pc(39) String local39 = Static164.method3147(Static202.aStringArray33[local31]);
			if (local39 != null && local39.equals(local21)) {
				Static159.method3073(arg0 + Static48.aString32);
				return;
			}
			if (Static80.aStringArray16[local31] != null) {
				local66 = Static164.method3147(Static80.aStringArray16[local31]);
				if (local66 != null && local66.equals(local21)) {
					Static159.method3073(arg0 + Static48.aString32);
					return;
				}
			}
		}
		for (@Pc(89) int local89 = 0; local89 < Static164.anInt3686; local89++) {
			local66 = Static164.method3147(Static284.aStringArray41[local89]);
			if (local66 != null && local66.equals(local21)) {
				Static159.method3073(Static211.aString162 + arg0 + Static292.aString221);
				return;
			}
			if (Static116.aStringArray6[local89] != null) {
				@Pc(128) String local128 = Static164.method3147(Static116.aStringArray6[local89]);
				if (local128 != null && local128.equals(local21)) {
					Static159.method3073(Static211.aString162 + arg0 + Static292.aString221);
					return;
				}
			}
		}
		if (Static164.method3147(Static110.aClass2_Sub2_Sub1_Sub1_1.aString22).equals(local21)) {
			Static159.method3073(Static337.aString216);
		} else {
			Static320.aClass4_Sub7_Sub1_3.method1237(110);
			Static320.aClass4_Sub7_Sub1_3.method2416(Static204.method3620(arg0) + 1);
			Static320.aClass4_Sub7_Sub1_3.method2373(arg0);
			Static320.aClass4_Sub7_Sub1_3.method2416(arg1 ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "(I)V")
	public static void method5632() {
		Static200.aClass4_Sub7_Sub1_2.method1239();
		@Pc(13) int local13 = Static200.aClass4_Sub7_Sub1_2.method1247(8);
		@Pc(22) int local22;
		if (local13 < Static282.anInt5712) {
			for (local22 = local13; local22 < Static282.anInt5712; local22++) {
				Static19.anIntArray539[Static52.anInt1189++] = Static332.anIntArray523[local22];
			}
		}
		if (local13 > Static282.anInt5712) {
			throw new RuntimeException("gnpov1");
		}
		Static282.anInt5712 = 0;
		for (local22 = 0; local22 < local13; local22++) {
			@Pc(60) int local60 = Static332.anIntArray523[local22];
			@Pc(64) Class2_Sub2_Sub1_Sub2 local64 = Static101.aClass2_Sub2_Sub1_Sub2Array6[local60];
			@Pc(69) int local69 = Static200.aClass4_Sub7_Sub1_2.method1247(1);
			if (local69 == 0) {
				Static332.anIntArray523[Static282.anInt5712++] = local60;
				local64.anInt6515 = Static342.anInt6706;
			} else {
				@Pc(92) int local92 = Static200.aClass4_Sub7_Sub1_2.method1247(2);
				if (local92 == 0) {
					Static332.anIntArray523[Static282.anInt5712++] = local60;
					local64.anInt6515 = Static342.anInt6706;
					Static49.anIntArray122[Static104.anInt6829++] = local60;
				} else {
					@Pc(137) int local137;
					@Pc(147) int local147;
					if (local92 == 1) {
						Static332.anIntArray523[Static282.anInt5712++] = local60;
						local64.anInt6515 = Static342.anInt6706;
						local137 = Static200.aClass4_Sub7_Sub1_2.method1247(3);
						local64.method5438(1, local137);
						local147 = Static200.aClass4_Sub7_Sub1_2.method1247(1);
						if (local147 == 1) {
							Static49.anIntArray122[Static104.anInt6829++] = local60;
						}
					} else if (local92 == 2) {
						Static332.anIntArray523[Static282.anInt5712++] = local60;
						local64.anInt6515 = Static342.anInt6706;
						if (Static200.aClass4_Sub7_Sub1_2.method1247(1) == 1) {
							local137 = Static200.aClass4_Sub7_Sub1_2.method1247(3);
							local64.method5438(2, local137);
							local147 = Static200.aClass4_Sub7_Sub1_2.method1247(3);
							local64.method5438(2, local147);
						} else {
							local137 = Static200.aClass4_Sub7_Sub1_2.method1247(3);
							local64.method5438(0, local137);
						}
						local137 = Static200.aClass4_Sub7_Sub1_2.method1247(1);
						if (local137 == 1) {
							Static49.anIntArray122[Static104.anInt6829++] = local60;
						}
					} else if (local92 == 3) {
						Static19.anIntArray539[Static52.anInt1189++] = local60;
					}
				}
			}
		}
	}
}
