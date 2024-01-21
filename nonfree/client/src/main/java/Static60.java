import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "[Lclient!b;")
	public static Class1_Sub2_Sub2_Sub1[] aClass1_Sub2_Sub2_Sub1Array5;

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "Lclient!b;")
	public static Class1_Sub2_Sub2_Sub1 aClass1_Sub2_Sub2_Sub1_6;

	@OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
	public static int anInt1363;

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "Lclient!fc;")
	private static Class25 aClass25_593 = Static78.method1313("Invalid username or password)3");

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "Lclient!fc;")
	public static Class25 aClass25_594 = Static78.method1313("Passwort: ");

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "Lclient!fc;")
	public static Class25 aClass25_595 = Static78.method1313("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "Lclient!fc;")
	public static Class25 aClass25_596 = aClass25_593;

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "Lclient!fc;")
	private static Class25 aClass25_597 = Static78.method1313("Please reload this page)3");

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "Lclient!fc;")
	public static Class25 aClass25_598 = aClass25_597;

	@OriginalMember(owner = "client!ka", name = "l", descriptor = "Lclient!fc;")
	public static Class25 aClass25_599 = Static78.method1313(" loggt sich aus)3");

	@OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
	public static int anInt1364 = 0;

	@OriginalMember(owner = "client!ka", name = "q", descriptor = "Lclient!fc;")
	public static Class25 aClass25_600 = Static78.method1313("Okay");

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
	public static int anInt1366 = 0;

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "Z")
	public static volatile boolean aBoolean54 = true;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public static void method1070() {
		aClass25_596 = null;
		aClass25_597 = null;
		aClass1_Sub2_Sub2_Sub1_6 = null;
		aClass25_594 = null;
		aClass25_593 = null;
		aClass1_Sub2_Sub2_Sub1Array5 = null;
		aClass25_595 = null;
		aClass25_600 = null;
		aClass25_598 = null;
		aClass25_599 = null;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)V")
	public static void method1071() {
		@Pc(9) int local9 = Static83.aClass1_Sub2_Sub2_Sub3_3.method1187(Static111.aClass25_1251);
		@Pc(19) int local19;
		for (@Pc(11) int local11 = 0; local11 < Static108.anInt2503; local11++) {
			local19 = Static83.aClass1_Sub2_Sub2_Sub3_3.method1187(Static84.aClass25Array14[local11]);
			if (local19 > local9) {
				local9 = local19;
			}
		}
		local19 = Static108.anInt2503 * 15 + 21;
		local9 += 8;
		@Pc(63) int local63;
		@Pc(56) int local56;
		if (Static67.anInt1470 != -1) {
			Static123.anInt2888 = local9;
			Static42.anInt1133 = 0;
			Static101.anInt2344 = Static108.anInt2503 * 15 + 22;
			Static82.aBoolean77 = true;
			local56 = Static23.anInt675;
			local63 = Static30.anInt815 - local9 / 2;
			if (local63 + local9 > 765) {
				local63 = 765 - local9;
			}
			if (local56 + local19 > 503) {
				local56 = 503 - local19;
			}
			if (local63 < 0) {
				local63 = 0;
			}
			Static39.anInt1094 = local63;
			if (local56 < 0) {
				local56 = 0;
			}
			Static81.anInt1798 = local56;
		} else if (Static30.anInt815 > 4 && Static23.anInt675 > 4 && Static30.anInt815 < 516 && Static23.anInt675 < 338) {
			Static82.aBoolean77 = true;
			Static42.anInt1133 = 0;
			Static123.anInt2888 = local9;
			Static101.anInt2344 = Static108.anInt2503 * 15 + 22;
			local63 = Static30.anInt815 - local9 / 2 - 4;
			if (local63 + local9 > 512) {
				local63 = 512 - local9;
			}
			local56 = Static23.anInt675 - 4;
			if (local63 < 0) {
				local63 = 0;
			}
			if (local56 + local19 > 334) {
				local56 = 334 - local19;
			}
			Static39.anInt1094 = local63;
			if (local56 < 0) {
				local56 = 0;
			}
			Static81.anInt1798 = local56;
		} else if (Static30.anInt815 > 553 && Static23.anInt675 > 205 && Static30.anInt815 < 743 && Static23.anInt675 < 466) {
			Static101.anInt2344 = Static108.anInt2503 * 15 + 22;
			Static123.anInt2888 = local9;
			Static42.anInt1133 = 1;
			Static82.aBoolean77 = true;
			local63 = Static30.anInt815 - local9 / 2 - 553;
			if (local63 < 0) {
				local63 = 0;
			} else if (local9 + local63 > 190) {
				local63 = 190 - local9;
			}
			Static39.anInt1094 = local63;
			local56 = Static23.anInt675 - 205;
			if (local56 < 0) {
				local56 = 0;
			} else if (local56 + local19 > 261) {
				local56 = 261 - local19;
			}
			Static81.anInt1798 = local56;
		} else if (Static30.anInt815 > 17 && Static23.anInt675 > 357 && Static30.anInt815 < 496 && Static23.anInt675 < 453) {
			Static82.aBoolean77 = true;
			Static42.anInt1133 = 2;
			Static101.anInt2344 = Static108.anInt2503 * 15 + 22;
			Static123.anInt2888 = local9;
			local56 = Static23.anInt675 - 357;
			local63 = Static30.anInt815 - local9 / 2 - 17;
			if (local56 < 0) {
				local56 = 0;
			} else if (local56 + local19 > 96) {
				local56 = 96 - local19;
			}
			if (local63 < 0) {
				local63 = 0;
			} else if (local9 + local63 > 479) {
				local63 = 479 - local9;
			}
			Static81.anInt1798 = local56;
			Static39.anInt1094 = local63;
		}
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V")
	public static void method1072() {
		Static111.aClass63_23.method1513();
		Static76.aClass63_12.method1513();
		Static58.aClass63_7.method1513();
	}
}
