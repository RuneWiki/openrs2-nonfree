import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "[Lclient!sc;")
	public static Class5_Sub2_Sub6_Sub4[] aClass5_Sub2_Sub6_Sub4Array1;

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "Lclient!jd;")
	public static Class11 aClass11_21;

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "Z")
	public static boolean aBoolean15;

	@OriginalMember(owner = "client!ce", name = "p", descriptor = "Lclient!jd;")
	public static Class11 aClass11_22;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "Lclient!mb;")
	public static Class45 aClass45_203 = Static63.method1251("mapfunction");

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "Z")
	public static boolean aBoolean13 = false;

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "Z")
	public static boolean aBoolean14 = false;

	@OriginalMember(owner = "client!ce", name = "s", descriptor = "Lclient!mb;")
	private static Class45 aClass45_209 = Static63.method1251("Enter your username (V password)3");

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "Lclient!mb;")
	public static Class45 aClass45_204 = aClass45_209;

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
	public static int anInt421 = 0;

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "Lclient!mb;")
	public static Class45 aClass45_205 = Static63.method1251("headicons_hint");

	@OriginalMember(owner = "client!ce", name = "k", descriptor = "[Lclient!mb;")
	public static Class45[] aClass45Array4 = new Class45[1000];

	@OriginalMember(owner = "client!ce", name = "l", descriptor = "Lclient!mb;")
	public static Class45 aClass45_206 = Static63.method1251("Fertigkeit)2");

	@OriginalMember(owner = "client!ce", name = "o", descriptor = "Lclient!mb;")
	public static Class45 aClass45_207 = Static63.method1251("scrollen:");

	@OriginalMember(owner = "client!ce", name = "q", descriptor = "Lclient!mb;")
	public static Class45 aClass45_208 = Static63.method1251("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
	public static int anInt425 = 0;

	@OriginalMember(owner = "client!ce", name = "t", descriptor = "I")
	public static int anInt426 = 0;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
	public static void method270() {
		aClass5_Sub2_Sub6_Sub4Array1 = null;
		aClass45_205 = null;
		aClass45_208 = null;
		aClass11_21 = null;
		aClass45Array4 = null;
		aClass45_209 = null;
		aClass45_203 = null;
		aClass45_207 = null;
		aClass45_204 = null;
		aClass45_206 = null;
		aClass11_22 = null;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
	public static void method271() {
		@Pc(7) int local7 = Static90.anInt2532;
		@Pc(9) int local9 = Static40.anInt1178;
		@Pc(11) int local11 = Static102.anInt2742;
		@Pc(13) int local13 = Static74.anInt2511;
		Static118.method1858(local7, local9, local11, local13, 6116423);
		Static118.method1858(local7 + 1, local9 + 1, local11 - 2, 16, 0);
		Static118.method1867(local7 + 1, local9 + 18, local11 - 2, local13 + -19, 0);
		Static8.aClass5_Sub2_Sub6_Sub1_1.method506(Static2.aClass45_8, local7 + 3, local9 + 14, 6116423);
		@Pc(59) int local59 = Static47.anInt1354;
		@Pc(61) int local61 = anInt425;
		if (Static97.anInt2635 == 0) {
			local61 -= 4;
			local59 -= 4;
		}
		if (Static97.anInt2635 == 1) {
			local59 -= 205;
			local61 -= 553;
		}
		if (Static97.anInt2635 == 2) {
			local59 -= 357;
			local61 -= 17;
		}
		for (@Pc(83) int local83 = 0; local83 < anInt426; local83++) {
			@Pc(98) int local98 = local9 + (anInt426 - (1 - -local83)) * 15 + 31;
			@Pc(100) int local100 = 16777215;
			if (local7 < local61 && local61 < local7 + local11 && local59 > local98 - 13 && local59 < local98 + 3) {
				local100 = 16776960;
			}
			Static8.aClass5_Sub2_Sub6_Sub1_1.method524(Static35.aClass45Array10[local83], local7 + 3, local98, local100, true);
		}
	}
}
