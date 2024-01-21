import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ad", name = "P", descriptor = "Lclient!qd;")
	public static Class54_Sub1 aClass54_Sub1_50;

	@OriginalMember(owner = "client!ad", name = "y", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1329 = Static87.method1648(")3");

	@OriginalMember(owner = "client!ad", name = "z", descriptor = "I")
	public static int anInt2753 = -1;

	@OriginalMember(owner = "client!ad", name = "A", descriptor = "I")
	public static int anInt2754 = -1;

	@OriginalMember(owner = "client!ad", name = "E", descriptor = "I")
	public static int anInt2757 = 0;

	@OriginalMember(owner = "client!ad", name = "F", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1330 = Static87.method1648("@cr1@");

	@OriginalMember(owner = "client!ad", name = "G", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1331 = Static87.method1648(" hat sich eingeloggt)3");

	@OriginalMember(owner = "client!ad", name = "H", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1332 = Static87.method1648("button near the top of that page)3");

	@OriginalMember(owner = "client!ad", name = "I", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1333 = Static87.method1648("m");

	@OriginalMember(owner = "client!ad", name = "J", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1334 = aClass27_1332;

	@OriginalMember(owner = "client!ad", name = "M", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1335 = Static87.method1648("(Z");

	@OriginalMember(owner = "client!ad", name = "N", descriptor = "[I")
	public static int[] anIntArray399 = new int[1000];

	@OriginalMember(owner = "client!ad", name = "O", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1336 = Static87.method1648("Ihre Nachricht an: ");

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)V")
	public static void method1891() {
		@Pc(13) int local13 = Static31.aClass3_Sub3_Sub2_Sub1_1.method606(Static17.aClass27_222);
		@Pc(23) int local23;
		for (@Pc(15) int local15 = 0; local15 < Static61.anInt1553; local15++) {
			local23 = Static31.aClass3_Sub3_Sub2_Sub1_1.method613(Static55.aClass27Array9[local15]);
			if (local13 < local23) {
				local13 = local23;
			}
		}
		local13 += 8;
		local23 = Static61.anInt1553 * 15 + 21;
		@Pc(80) int local80;
		@Pc(102) int local102;
		if (Static50.anInt1341 > 4 && Static35.anInt850 > 4 && Static50.anInt1341 < 516 && Static35.anInt850 < 338) {
			Static12.aBoolean16 = true;
			Static67.anInt1724 = Static61.anInt1553 * 15 + 22;
			Static71.anInt1864 = local13;
			Static22.anInt582 = 0;
			local80 = Static50.anInt1341 - local13 / 2 - 4;
			if (local80 + local13 > 512) {
				local80 = 512 - local13;
			}
			if (local80 < 0) {
				local80 = 0;
			}
			Static91.anInt2517 = local80;
			local102 = Static35.anInt850 - 4;
			if (local102 + local23 > 334) {
				local102 = 334 - local23;
			}
			if (local102 < 0) {
				local102 = 0;
			}
			Static40.anInt1206 = local102;
		}
		if (Static50.anInt1341 > 553 && Static35.anInt850 > 205 && Static50.anInt1341 < 743 && Static35.anInt850 < 466) {
			Static12.aBoolean16 = true;
			Static71.anInt1864 = local13;
			Static67.anInt1724 = Static61.anInt1553 * 15 + 22;
			local80 = Static50.anInt1341 - local13 / 2 - 553;
			if (local80 < 0) {
				local80 = 0;
			} else if (local80 + local13 > 190) {
				local80 = 190 - local13;
			}
			Static91.anInt2517 = local80;
			Static22.anInt582 = 1;
			local102 = Static35.anInt850 - 205;
			if (local102 < 0) {
				local102 = 0;
			} else if (local102 + local23 > 261) {
				local102 = 261 - local23;
			}
			Static40.anInt1206 = local102;
		}
		if (Static50.anInt1341 <= 17 || Static35.anInt850 <= 357 || Static50.anInt1341 >= 496 || Static35.anInt850 >= 453) {
			return;
		}
		Static71.anInt1864 = local13;
		Static67.anInt1724 = Static61.anInt1553 * 15 + 22;
		Static22.anInt582 = 2;
		Static12.aBoolean16 = true;
		local102 = Static35.anInt850 - 357;
		if (local102 < 0) {
			local102 = 0;
		} else if (local23 + local102 > 96) {
			local102 = 96 - local23;
		}
		local80 = Static50.anInt1341 - local13 / 2 - 17;
		Static40.anInt1206 = local102;
		if (local80 < 0) {
			local80 = 0;
		} else if (local13 + local80 > 479) {
			local80 = 479 - local13;
		}
		Static91.anInt2517 = local80;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(JB)V")
	public static void method1893(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < Static38.anInt910; local18++) {
			if (arg0 == Static45.aLongArray5[local18]) {
				Static75.aBoolean101 = true;
				Static38.anInt910--;
				for (@Pc(38) int local38 = local18; local38 < Static38.anInt910; local38++) {
					Static45.aLongArray5[local38] = Static45.aLongArray5[local38 + 1];
				}
				Static78.aClass3_Sub11_Sub1_3.method1478(10);
				Static78.aClass3_Sub11_Sub1_3.method1468(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)V")
	public static void method1894() {
		if (Static13.aClass9_3 == null) {
			return;
		}
		@Pc(8) long local8 = System.currentTimeMillis();
		if (local8 <= Static92.aLong70) {
			return;
		}
		Static13.aClass9_3.method1867(local8);
		@Pc(21) int local21 = (int) (local8 - Static92.aLong70);
		Static92.aLong70 = local8;
		@Pc(40) Class local40 = ca.class;
		synchronized (ca.class) {
			Static106.anInt837 += Static80.anInt2188 * local21;
			@Pc(57) int local57 = (Static106.anInt837 - Static80.anInt2188 * 2000) / 1000;
			if (local57 > 0) {
				if (Static62.aClass3_Sub1_1 != null) {
					Static62.aClass3_Sub1_1.method145(local57);
				}
				Static106.anInt837 -= local57 * 1000;
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "(I)V")
	public static void method1895() {
		aClass27_1329 = null;
		anIntArray399 = null;
		aClass27_1331 = null;
		aClass27_1333 = null;
		aClass27_1332 = null;
		aClass27_1335 = null;
		aClass54_Sub1_50 = null;
		aClass27_1334 = null;
		aClass27_1330 = null;
		aClass27_1336 = null;
	}
}
