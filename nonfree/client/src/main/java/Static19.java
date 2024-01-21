import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!ea", name = "db", descriptor = "[Lclient!nc;")
	public static Class1_Sub1_Sub1_Sub4[] aClass1_Sub1_Sub1_Sub4Array1;

	@OriginalMember(owner = "client!ea", name = "jb", descriptor = "I")
	public static int anInt640;

	@OriginalMember(owner = "client!ea", name = "R", descriptor = "Lclient!mc;")
	public static Class42 aClass42_345 = Static23.method501("mapdots");

	@OriginalMember(owner = "client!ea", name = "U", descriptor = "Lclient!mb;")
	public static Class41 aClass41_2 = new Class41(4096);

	@OriginalMember(owner = "client!ea", name = "W", descriptor = "Lclient!mc;")
	public static Class42 aClass42_346 = Static23.method501("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!ea", name = "Z", descriptor = "Lclient!mc;")
	public static Class42 aClass42_347 = Static23.method501("Entfernen");

	@OriginalMember(owner = "client!ea", name = "ab", descriptor = "Lclient!mc;")
	public static Class42 aClass42_348 = Static23.method501("b12_full");

	@OriginalMember(owner = "client!ea", name = "bb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_349 = Static23.method501("::fpsoff");

	@OriginalMember(owner = "client!ea", name = "cb", descriptor = "I")
	public static int anInt638 = 0;

	@OriginalMember(owner = "client!ea", name = "fb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_350 = Static23.method501("@whi@");

	@OriginalMember(owner = "client!ea", name = "gb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_351 = Static23.method501("Lade Texturen )2 ");

	@OriginalMember(owner = "client!ea", name = "hb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_352 = Static23.method501("Side panel redrawn");

	@OriginalMember(owner = "client!ea", name = "ib", descriptor = "Lclient!mc;")
	public static Class42 aClass42_353 = Static23.method501(":duelreq:");

	@OriginalMember(owner = "client!ea", name = "kb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_354 = Static23.method501("weiss:");

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "(I)[Lclient!aa;")
	public static Class1_Sub1_Sub1_Sub1[] method439() {
		@Pc(8) Class1_Sub1_Sub1_Sub1[] local8 = new Class1_Sub1_Sub1_Sub1[Static3.anInt118];
		for (@Pc(15) int local15 = 0; local15 < Static3.anInt118; local15++) {
			@Pc(25) Class1_Sub1_Sub1_Sub1 local25 = local8[local15] = new Class1_Sub1_Sub1_Sub1();
			local25.anInt89 = Static108.anInt2749;
			local25.anInt88 = Static45.anInt1859;
			local25.anInt86 = Static39.anIntArray37[local15];
			local25.anInt84 = Static36.anIntArray124[local15];
			local25.anInt87 = Static83.anIntArray340[local15];
			local25.anInt85 = Static29.anIntArray98[local15];
			@Pc(57) int local57 = local25.anInt87 * local25.anInt85;
			@Pc(61) byte[] local61 = Static98.aByteArrayArray10[local15];
			local25.anIntArray12 = new int[local57];
			for (@Pc(67) int local67 = 0; local67 < local57; local67++) {
				local25.anIntArray12[local67] = Static69.anIntArray243[local61[local67] & 0xFF];
			}
		}
		Static34.method590();
		return local8;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZLclient!mc;ILclient!mc;)V")
	public static void method440(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(3) Class42 arg2) {
		if (Static91.aBoolean134) {
			Static91.aBoolean134 = false;
			Static63.method1076();
			Static15.method397();
			Static58.method1005();
			Static33.method583();
			Static106.method1845(Static59.anInt1999, Static30.anInt834, Static95.aClass1_Sub1_Sub1_Sub3_3, Static63.anInt1526);
			Static104.method1820(Static29.anInt819 == -1, -1, Static10.anIntArray33, Static108.anInt2748);
			Static48.aBoolean68 = true;
			Static67.aBoolean95 = true;
			Static16.aBoolean26 = true;
		}
		@Pc(40) short local40 = 151;
		Static6.method120();
		@Pc(43) int local43 = local40 - 3;
		Static95.aClass1_Sub1_Sub1_Sub3_3.method822(arg2, 257, 148, 0);
		Static95.aClass1_Sub1_Sub1_Sub3_3.method822(arg2, 256, 147, 16777215);
		if (arg1 != null) {
			local43 += 15;
			if (arg0) {
				@Pc(68) int local68 = Static95.aClass1_Sub1_Sub1_Sub3_3.method805(arg1) + 4;
				Static55.method1129(257 - local68 / 2, 152, local68, 11, 0);
			}
			Static95.aClass1_Sub1_Sub1_Sub3_3.method822(arg1, 257, 163, 0);
			Static95.aClass1_Sub1_Sub1_Sub3_3.method822(arg1, 256, 162, 16777215);
		}
		Static69.method1233();
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!j;Lclient!j;B)V")
	public static void method441(@OriginalArg(0) Class1_Sub1_Sub1_Sub3 arg0, @OriginalArg(1) Class1_Sub1_Sub1_Sub3 arg1) {
		Static48.aClass31_20.method996();
		if (Static91.anInt2400 == 0 || Static91.anInt2400 == 5) {
			arg0.method822(Static88.aClass42_1252, 180, 54, 16777215);
			Static55.method1138(28, 62, 304, 34, 9179409);
			Static55.method1138(29, 63, 302, 32, 0);
			Static55.method1129(30, 64, Static51.anInt1376 * 3, 30, 9179409);
			Static55.method1129(Static51.anInt1376 * 3 + 30, 64, 300 - Static51.anInt1376 * 3, 30, 0);
			arg0.method822(Static39.aClass42_230, 180, 85, 16777215);
		}
		@Pc(98) byte local98;
		@Pc(106) int local106;
		if (Static91.anInt2400 == 20) {
			Static65.aClass1_Sub1_Sub1_Sub4_16.method1147(0, 0);
			local98 = 40;
			arg0.method819(Static39.aClass42_242, 180, 40, 16776960, true);
			local106 = local98 + 15;
			arg0.method819(Static39.aClass42_236, 180, 55, 16776960, true);
			@Pc(114) int local114 = local106 + 15;
			arg0.method819(Static39.aClass42_240, 180, 70, 16776960, true);
			@Pc(122) int local122 = local114 + 15;
			@Pc(123) int local123 = local122 + 10;
			arg0.method807(Static57.method1822(new Class42[] { Static29.aClass42_440, Static39.aClass42_238 }), 90, 95, 16777215, true);
			@Pc(142) int local142 = local123 + 15;
			arg0.method807(Static57.method1822(new Class42[] { Static69.aClass42_899, Static39.aClass42_233.method1037() }), 92, 110, 16777215, true);
			@Pc(163) int local163 = local142 + 15;
		}
		if (Static91.anInt2400 == 10) {
			Static65.aClass1_Sub1_Sub1_Sub4_16.method1147(0, 0);
			if (Static74.anInt1897 == 0) {
				local98 = 80;
				arg0.method819(Static68.aClass42_883, 180, 80, 16776960, true);
				local106 = local98 + 30;
				Static36.aClass1_Sub1_Sub1_Sub4_10.method1147(27, 100);
				arg0.method803(Static28.aClass42_437, 27, 100, 144, 40, 16777215, true, 1, 1, 0);
				Static36.aClass1_Sub1_Sub1_Sub4_10.method1147(187, 100);
				arg0.method803(Static91.aClass42_1290, 187, 100, 144, 40, 16777215, true, 1, 1, 0);
			} else if (Static74.anInt1897 == 2) {
				local98 = 40;
				arg0.method819(Static39.aClass42_242, 180, 40, 16776960, true);
				local106 = local98 + 15;
				arg0.method819(Static39.aClass42_236, 180, 55, 16776960, true);
				local106 += 15;
				arg0.method819(Static39.aClass42_240, 180, 70, 16776960, true);
				local106 += 15;
				local106 += 10;
				arg0.method807(Static57.method1822(new Class42[] { Static29.aClass42_440, Static39.aClass42_238, Static27.anInt768 % 40 < 20 & Static20.anInt646 == 0 ? Static42.aClass42_1383 : Static39.aClass42_239 }), 90, 95, 16777215, true);
				local106 += 15;
				arg0.method807(Static57.method1822(new Class42[] { Static69.aClass42_899, Static39.aClass42_233.method1037(), Static20.anInt646 == 1 & Static27.anInt768 % 40 < 20 ? Static42.aClass42_1383 : Static39.aClass42_239 }), 92, 110, 16777215, true);
				local106 += 15;
				Static36.aClass1_Sub1_Sub1_Sub4_10.method1147(27, 130);
				arg0.method819(Static81.aClass42_1139, 100, 155, 16777215, true);
				Static36.aClass1_Sub1_Sub1_Sub4_10.method1147(187, 130);
				arg0.method819(Static49.aClass42_695, 260, 155, 16777215, true);
			} else if (Static74.anInt1897 == 3) {
				arg0.method819(Static80.aClass42_1132, 180, 40, 16776960, true);
				local98 = 65;
				arg0.method819(Static49.aClass42_690, 180, 65, 16777215, true);
				local106 = local98 + 15;
				arg0.method819(Static89.aClass42_1281, 180, 80, 16777215, true);
				local106 += 15;
				arg0.method819(Static1.aClass42_11, 180, 95, 16777215, true);
				local106 += 15;
				arg0.method819(Static18.aClass42_330, 180, 110, 16777215, true);
				local106 += 15;
				Static36.aClass1_Sub1_Sub1_Sub4_10.method1147(107, 130);
				arg0.method819(Static49.aClass42_695, 180, 155, 16777215, true);
			}
		}
		Static36.method616();
		try {
			@Pc(472) Graphics local472 = Static89.aCanvas1.getGraphics();
			Static48.aClass31_20.method993(202, local472, 171);
			Static34.aClass31_17.method993(0, local472, 0);
			Static109.aClass31_38.method993(637, local472, 0);
			if (Static91.aBoolean134) {
				Static91.aBoolean134 = false;
				Static58.aClass31_23.method993(128, local472, 0);
				Static51.aClass31_21.method993(202, local472, 371);
				Static58.aClass31_22.method993(0, local472, 265);
				Static77.aClass31_28.method993(562, local472, 265);
				Static72.aClass31_29.method993(128, local472, 171);
				Static31.aClass31_32.method993(562, local472, 171);
			}
		} catch (@Pc(532) Exception local532) {
			Static89.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "(I)V")
	public static void method442() {
		aClass42_353 = null;
		aClass42_350 = null;
		aClass1_Sub1_Sub1_Sub4Array1 = null;
		aClass42_345 = null;
		aClass42_351 = null;
		aClass41_2 = null;
		aClass42_348 = null;
		aClass42_352 = null;
		aClass42_346 = null;
		aClass42_347 = null;
		aClass42_354 = null;
		aClass42_349 = null;
	}
}
