import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!jb", name = "ab", descriptor = "Lclient!ta;")
	public static Class36_Sub1 aClass36_Sub1_11;

	@OriginalMember(owner = "client!jb", name = "gb", descriptor = "I")
	public static int anInt1375;

	@OriginalMember(owner = "client!jb", name = "nb", descriptor = "Lclient!c;")
	public static Class2_Sub1_Sub4_Sub1 aClass2_Sub1_Sub4_Sub1_2;

	@OriginalMember(owner = "client!jb", name = "Fb", descriptor = "I")
	public static int anInt1390;

	@OriginalMember(owner = "client!jb", name = "V", descriptor = "Lclient!ke;")
	public static Class39 aClass39_618 = Static2.method66("welle2:");

	@OriginalMember(owner = "client!jb", name = "db", descriptor = "I")
	public static int anInt1373 = 0;

	@OriginalMember(owner = "client!jb", name = "fb", descriptor = "Z")
	public static volatile boolean aBoolean71 = true;

	@OriginalMember(owner = "client!jb", name = "jb", descriptor = "J")
	public static long aLong36 = 0L;

	@OriginalMember(owner = "client!jb", name = "wb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_620 = Static2.method66("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!jb", name = "Mb", descriptor = "Lclient!ke;")
	private static Class39 aClass39_622 = Static2.method66("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!jb", name = "Db", descriptor = "Lclient!ke;")
	public static Class39 aClass39_621 = aClass39_622;

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "(B)V")
	public static void method945() {
		aClass2_Sub1_Sub4_Sub1_2 = null;
		aClass39_621 = null;
		aClass39_618 = null;
		aClass39_622 = null;
		aClass39_620 = null;
		aClass36_Sub1_11 = null;
	}

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "(I)V")
	public static void method947() {
		@Pc(7) Class39 local7 = null;
		for (@Pc(9) int local9 = 0; local9 < Static101.anInt2753; local9++) {
			if (Static26.aClass39Array7[local9].method1100(Static51.aClass39_1126) != -1) {
				local7 = Static26.aClass39Array7[local9].method1099(Static26.aClass39Array7[local9].method1100(Static51.aClass39_1126));
				break;
			}
		}
		if (local7 == null) {
			Static23.method444();
			return;
		}
		@Pc(50) int local50 = Static82.anInt2219;
		@Pc(52) int local52 = Static46.anInt1260;
		@Pc(54) int local54 = Static19.anInt568;
		if (local52 < 0) {
			local52 = 0;
		}
		@Pc(62) int local62 = Static92.anInt2405;
		if (local54 > 190) {
			local54 = 190;
		}
		Static91.method2013(local52, local50, local54, local62, 6116423);
		Static91.method2013(local52 + 1, local50 + 1, local54 - 2, 16, 0);
		Static91.method2011(local52 + 1, local50 + 18, local54 - 2, local62 + -19, 0);
		Static25.aClass2_Sub1_Sub4_Sub1_1.method235(local7, local52 + 3, local50 - -14, 6116423, false);
		@Pc(112) int local112 = Static45.anInt1237;
		@Pc(114) int local114 = Static80.anInt2188;
		if (Static7.anInt162 == 0) {
			local112 -= 4;
			local114 -= 4;
		}
		if (Static7.anInt162 == 1) {
			local112 -= 205;
			local114 -= 553;
		}
		if (Static7.anInt162 == 2) {
			local114 -= 17;
			local112 -= 357;
		}
		for (@Pc(135) int local135 = 0; local135 < Static101.anInt2753; local135++) {
			@Pc(141) Class39 local141 = Static26.aClass39Array7[local135];
			@Pc(154) int local154 = local50 + (Static101.anInt2753 + -1 - local135) * 15 + 31;
			@Pc(156) int local156 = 16777215;
			if (local52 < local114 && local54 + local52 > local114 && local112 > local154 - 13 && local112 < local154 + 3) {
				local156 = 16776960;
			}
			if (local141.method1116(local7)) {
				local141 = local141.method1115(0, local141.method1088() - local7.method1088());
				if (local141.method1116(Static107.aClass39_1194)) {
					local141 = local141.method1115(0, local141.method1088() - Static107.aClass39_1194.method1088());
				}
			}
			Static25.aClass2_Sub1_Sub4_Sub1_1.method235(local141, local52 + 3, local154, local156, true);
		}
	}
}
