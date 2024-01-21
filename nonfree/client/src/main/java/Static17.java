import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!client", name = "X", descriptor = "Lclient!k;")
	public static Class33 aClass33_6;

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "[I")
	public static int[] anIntArray79;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "Lclient!ge;")
	public static Class21 aClass21_6 = new Class21(100);

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
	public static int anInt575 = -1;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "Lclient!wb;")
	private static Class65 aClass65_269 = Static24.method441("Choose Option");

	@OriginalMember(owner = "client!client", name = "db", descriptor = "Lclient!wb;")
	public static Class65 aClass65_268 = aClass65_269;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_270 = Static24.method441(" )2> @cya@");

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_271 = Static24.method441("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "Z")
	public static boolean aBoolean39 = false;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_272 = Static24.method441("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "Lclient!wb;")
	private static Class65 aClass65_275 = Static24.method441("Cancel");

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_273 = aClass65_275;

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "Z")
	public static boolean aBoolean40 = false;

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_274 = Static24.method441(": ");

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_276 = Static24.method441(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
	public static int anInt588 = 0;

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	public static void method362() {
		@Pc(7) Class65 local7 = null;
		for (@Pc(9) int local9 = 0; local9 < Static24.anInt719; local9++) {
			if (Static89.aClass65Array12[local9].method1775(Static42.aClass65_597) != -1) {
				local7 = Static89.aClass65Array12[local9].method1779(Static89.aClass65Array12[local9].method1775(Static42.aClass65_597));
				break;
			}
		}
		if (local7 == null) {
			Static7.method153();
			return;
		}
		@Pc(43) int local43 = Static16.anInt489;
		@Pc(45) int local45 = Static61.anInt1849;
		if (local43 < 0) {
			local43 = 0;
		}
		@Pc(51) int local51 = Static101.anInt2788;
		@Pc(53) int local53 = Static32.anInt1055;
		if (local51 > 190) {
			local51 = 190;
		}
		Static43.method1815(local43, local45, local51, local53, 6116423);
		Static43.method1815(local43 + 1, local45 - -1, local51 - 2, 16, 0);
		Static43.method1806(local43 + 1, local45 + 18, local51 - 2, local53 + -19, 0);
		Static38.aClass2_Sub1_Sub4_Sub4_1.method1826(local7, local43 + 3, local45 + 14, 6116423, false);
		@Pc(110) int local110 = Static85.anInt2459;
		@Pc(112) int local112 = Static16.anInt480;
		if (Static99.anInt2540 == 0) {
			local112 -= 4;
			local110 -= 4;
		}
		if (Static99.anInt2540 == 1) {
			local110 -= 205;
			local112 -= 553;
		}
		if (Static99.anInt2540 == 2) {
			local112 -= 17;
			local110 -= 357;
		}
		for (@Pc(128) int local128 = 0; local128 < Static24.anInt719; local128++) {
			@Pc(132) int local132 = 16777215;
			@Pc(145) int local145 = (Static24.anInt719 - local128 - 1) * 15 + local45 + 31;
			if (local112 > local43 && local112 < local43 + local51 && local110 > local145 - 13 && local110 < local145 + 3) {
				local132 = 16776960;
			}
			@Pc(178) Class65 local178 = Static89.aClass65Array12[local128];
			if (local178.method1784(local7)) {
				local178 = local178.method1772(local178.method1760() - local7.method1760(), 0);
				if (local178.method1784(Static36.aClass65_517)) {
					local178 = local178.method1772(local178.method1760() - Static36.aClass65_517.method1760(), 0);
				}
			}
			Static38.aClass2_Sub1_Sub4_Sub4_1.method1826(local178, local43 + 3, local145, local132, true);
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
	public static void method363() {
		aClass33_6 = null;
		anIntArray79 = null;
		aClass21_6 = null;
		aClass65_270 = null;
		aClass65_273 = null;
		aClass65_275 = null;
		aClass65_274 = null;
		aClass65_276 = null;
		aClass65_271 = null;
		aClass65_269 = null;
		aClass65_272 = null;
		aClass65_268 = null;
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)Lclient!rd;")
	public static Class8 method364() {
		try {
			return (Class8) Class.forName("Class8_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class8_Sub2();
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	public static void method367() {
		for (@Pc(6) Class2_Sub3 local6 = (Class2_Sub3) Static22.aClass52_4.method1587(); local6 != null; local6 = (Class2_Sub3) Static22.aClass52_4.method1588()) {
			if (local6.aClass2_Sub10_Sub1_1 != null) {
				Static8.aClass2_Sub10_Sub2_1.method1674(local6.aClass2_Sub10_Sub1_1);
				local6.aClass2_Sub10_Sub1_1 = null;
			}
			if (local6.aClass2_Sub10_Sub1_2 != null) {
				Static8.aClass2_Sub10_Sub2_1.method1674(local6.aClass2_Sub10_Sub1_2);
				local6.aClass2_Sub10_Sub1_2 = null;
			}
		}
		Static22.aClass52_4.method1590();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!wb;ILclient!wb;Lclient!k;)Lclient!wc;")
	public static Class2_Sub1_Sub4_Sub4 method369(@OriginalArg(0) Class65 arg0, @OriginalArg(2) Class65 arg1, @OriginalArg(3) Class33 arg2) {
		@Pc(4) int local4 = arg2.method1149(arg1);
		@Pc(19) int local19 = arg2.method1144(arg0, local4);
		return Static84.method1450(arg2, local19, local4);
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
	public static void method370() {
		Static95.aClass21_29.method743();
	}
}
