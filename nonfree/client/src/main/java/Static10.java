import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "[B")
	public static byte[] aByteArray20;

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!ca", name = "m", descriptor = "Lclient!v;")
	private static Class62 aClass62_973 = Static45.method753("Continue");

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "Lclient!v;")
	public static Class62 aClass62_969 = aClass62_973;

	@OriginalMember(owner = "client!ca", name = "i", descriptor = "Lclient!v;")
	private static Class62 aClass62_971 = Static45.method753("wishes to duel with you)3");

	@OriginalMember(owner = "client!ca", name = "h", descriptor = "Lclient!v;")
	public static Class62 aClass62_970 = aClass62_971;

	@OriginalMember(owner = "client!ca", name = "j", descriptor = "Lclient!v;")
	public static Class62 aClass62_972 = Static45.method753("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
	public static volatile int anInt2190 = 0;

	@OriginalMember(owner = "client!ca", name = "n", descriptor = "Lclient!v;")
	public static Class62 aClass62_974 = Static45.method753("(U5");

	@OriginalMember(owner = "client!ca", name = "p", descriptor = "Lclient!vc;")
	public static Class3_Sub8_Sub1 aClass3_Sub8_Sub1_5 = new Class3_Sub8_Sub1(5000);

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BI)Lclient!h;")
	public static Class3_Sub1_Sub9 method1322(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub1_Sub9 local10 = (Class3_Sub1_Sub9) Static44.aClass34_15.method764((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27 = Static4.aClass42_7.method1504(6, arg0);
		local10 = new Class3_Sub1_Sub9();
		local10.anInt1083 = arg0;
		if (local27 != null) {
			local10.method654(new Class3_Sub8(local27));
		}
		local10.method651();
		if (local10.aBoolean55) {
			local10.aBoolean54 = false;
			local10.aBoolean60 = false;
		}
		Static44.aClass34_15.method765((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
	public static void method1323() {
		@Pc(17) int local17 = Static86.aClass3_Sub1_Sub1_Sub3_11.method1484(Static63.aClass62_1080);
		@Pc(27) int local27;
		for (@Pc(19) int local19 = 0; local19 < Static41.anInt1209; local19++) {
			local27 = Static86.aClass3_Sub1_Sub1_Sub3_11.method1483(Static18.aClass62Array6[local19]);
			if (local17 < local27) {
				local17 = local27;
			}
		}
		local27 = Static41.anInt1209 * 15 + 21;
		local17 += 8;
		@Pc(82) int local82;
		@Pc(108) int local108;
		if (Static104.anInt2769 > 4 && Static27.anInt825 > 4 && Static104.anInt2769 < 516 && Static27.anInt825 < 338) {
			Static40.aBoolean66 = true;
			Static45.anInt1339 = Static41.anInt1209 * 15 + 22;
			Static6.anInt211 = 0;
			Static30.anInt979 = local17;
			local82 = Static104.anInt2769 - local17 / 2 - 4;
			if (local82 + local17 > 512) {
				local82 = 512 - local17;
			}
			if (local82 < 0) {
				local82 = 0;
			}
			Static12.anInt461 = local82;
			local108 = Static27.anInt825 - 4;
			if (local27 + local108 > 334) {
				local108 = 334 - local27;
			}
			if (local108 < 0) {
				local108 = 0;
			}
			Static2.anInt62 = local108;
		}
		if (Static104.anInt2769 > 553 && Static27.anInt825 > 205 && Static104.anInt2769 < 743 && Static27.anInt825 < 466) {
			Static30.anInt979 = local17;
			Static45.anInt1339 = Static41.anInt1209 * 15 + 22;
			Static6.anInt211 = 1;
			Static40.aBoolean66 = true;
			local82 = Static104.anInt2769 - local17 / 2 - 553;
			if (local82 < 0) {
				local82 = 0;
			} else if (local82 + local17 > 190) {
				local82 = 190 - local17;
			}
			Static12.anInt461 = local82;
			local108 = Static27.anInt825 - 205;
			if (local108 < 0) {
				local108 = 0;
			} else if (local27 + local108 > 261) {
				local108 = 261 - local27;
			}
			Static2.anInt62 = local108;
		}
		if (Static104.anInt2769 <= 17 || Static27.anInt825 <= 357 || Static104.anInt2769 >= 496 || Static27.anInt825 >= 453) {
			return;
		}
		Static40.aBoolean66 = true;
		Static30.anInt979 = local17;
		local82 = Static104.anInt2769 - local17 / 2 - 17;
		if (local82 < 0) {
			local82 = 0;
		} else if (local82 + local17 > 479) {
			local82 = 479 - local17;
		}
		Static12.anInt461 = local82;
		Static45.anInt1339 = Static41.anInt1209 * 15 + 22;
		local108 = Static27.anInt825 - 357;
		if (local108 < 0) {
			local108 = 0;
		} else if (local108 + local27 > 96) {
			local108 = 96 - local27;
		}
		Static6.anInt211 = 2;
		Static2.anInt62 = local108;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)V")
	public static void method1325() {
		aClass62_970 = null;
		aClass62_974 = null;
		aClass62_969 = null;
		aClass62_973 = null;
		aClass62_971 = null;
		aClass62_972 = null;
		aClass3_Sub8_Sub1_5 = null;
		aByteArray20 = null;
		aByteArrayArrayArray11 = null;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IB)Lclient!ge;")
	public static Class3_Sub1_Sub8 method1328(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub1_Sub8 local10 = (Class3_Sub1_Sub8) Static89.aClass34_29.method764((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static20.aClass42_19.method1504(1, arg0);
		local10 = new Class3_Sub1_Sub8();
		if (local20 != null) {
			local10.method629(new Class3_Sub8(local20), arg0);
		}
		local10.method624();
		Static89.aClass34_29.method765((long) arg0, local10);
		return local10;
	}
}
