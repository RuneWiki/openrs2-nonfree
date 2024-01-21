import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!ve", name = "j", descriptor = "Lclient!id;")
	public static Class3_Sub1_Sub1_Sub2 aClass3_Sub1_Sub1_Sub2_6;

	@OriginalMember(owner = "client!ve", name = "E", descriptor = "Lclient!gb;")
	public static Class3_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_5;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1628 = Static33.method650("Nehmen");

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1633 = Static33.method650("");

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1629 = aClass56_1633;

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1630 = Static33.method650("Accept challenge");

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1631 = aClass56_1633;

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1632 = aClass56_1633;

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1634 = aClass56_1633;

	@OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
	public static int anInt3002 = 0;

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1635 = aClass56_1630;

	@OriginalMember(owner = "client!ve", name = "t", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1638 = Static33.method650("cyan:");

	@OriginalMember(owner = "client!ve", name = "q", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1636 = aClass56_1638;

	@OriginalMember(owner = "client!ve", name = "s", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1637 = aClass56_1638;

	@OriginalMember(owner = "client!ve", name = "v", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1639 = aClass56_1633;

	@OriginalMember(owner = "client!ve", name = "x", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1640 = aClass56_1633;

	@OriginalMember(owner = "client!ve", name = "z", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1641 = Static33.method650("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!ve", name = "A", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1642 = aClass56_1633;

	@OriginalMember(owner = "client!ve", name = "B", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1643 = Static33.method650("Moderator option: Mute player for 48 hours: <ON>");

	@OriginalMember(owner = "client!ve", name = "F", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1644 = Static33.method650("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!ve", name = "H", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1645 = aClass56_1643;

	@OriginalMember(owner = "client!ve", name = "J", descriptor = "Z")
	public static boolean aBoolean163 = false;

	@OriginalMember(owner = "client!ve", name = "K", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1646 = aClass56_1633;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
	public static void method1956() {
		aClass3_Sub1_Sub1_Sub1_5 = null;
		aClass56_1640 = null;
		aClass56_1636 = null;
		aClass56_1633 = null;
		aClass56_1629 = null;
		aClass56_1638 = null;
		aClass56_1631 = null;
		aClass56_1637 = null;
		aClass56_1634 = null;
		aClass56_1641 = null;
		aClass56_1632 = null;
		aClass56_1645 = null;
		aClass56_1646 = null;
		aClass56_1642 = null;
		aClass56_1635 = null;
		aClass56_1644 = null;
		aClass56_1639 = null;
		aClass56_1643 = null;
		aClass56_1628 = null;
		aClass3_Sub1_Sub1_Sub2_6 = null;
		aClass56_1630 = null;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)Lclient!id;")
	public static Class3_Sub1_Sub1_Sub2 method1957() {
		@Pc(14) Class3_Sub1_Sub1_Sub2 local14 = new Class3_Sub1_Sub1_Sub2();
		local14.anInt1487 = Static47.anIntArray96[0];
		local14.anInt1486 = Static64.anInt1829;
		local14.anInt1483 = Static69.anIntArray161[0];
		local14.anInt1482 = Static84.anInt2277;
		@Pc(34) byte[] local34 = Static116.aByteArrayArray10[0];
		local14.anInt1484 = Static76.anIntArray179[0];
		local14.anInt1485 = Static51.anIntArray103[0];
		@Pc(50) int local50 = local14.anInt1484 * local14.anInt1485;
		local14.anIntArray101 = new int[local50];
		for (@Pc(56) int local56 = 0; local56 < local50; local56++) {
			local14.anIntArray101[local56] = Static69.anIntArray163[local34[local56] & 0xFF];
		}
		Static127.method2040();
		return local14;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!td;B)V")
	public static void method1958(@OriginalArg(0) Class3_Sub1_Sub16 arg0) {
		@Pc(8) int local8 = arg0.anInt2817 >> 16;
		if (local8 == Static57.anInt1609 || Static69.anInt1918 == local8) {
			Static12.aBoolean17 = true;
		}
		if (local8 == Static111.anInt2804 || local8 == Static44.anIntArray79[Static27.anInt798]) {
			Static115.aBoolean157 = true;
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(II)Lclient!ta;")
	public static Class3_Sub1_Sub15 method1962(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub1_Sub15 local10 = (Class3_Sub1_Sub15) Static87.aClass52_47.method1342((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static46.aClass44_51.method1146(6, arg0);
		local10 = new Class3_Sub1_Sub15();
		local10.anInt2737 = arg0;
		if (local25 != null) {
			local10.method1818(new Class3_Sub2(local25));
		}
		local10.method1829();
		if (local10.aBoolean133) {
			local10.anInt2717 = 0;
			local10.aBoolean136 = false;
		}
		Static87.aClass52_47.method1344(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!gb;Lclient!gb;)V")
	public static void method1963(@OriginalArg(1) Class3_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) Class3_Sub1_Sub1_Sub1 arg1) {
		if (Static29.aBoolean46) {
			Static115.method1900(arg0, arg1);
			return;
		}
		if (Static44.anInt1156 == 0 || Static44.anInt1156 == 5) {
			arg1.method735(Static29.aClass56_452, 382, 225, 16777215);
			Static6.method1495(230, 233, 304, 34, 9179409);
			Static6.method1495(231, 234, 302, 32, 0);
			Static6.method1487(232, 235, Static67.anInt2309 * 3, 30, 9179409);
			Static6.method1487(Static67.anInt2309 * 3 + 232, 235, 300 - Static67.anInt2309 * 3, 30, 0);
			arg1.method735(Static66.aClass56_265, 382, 256, 16777215);
		}
		@Pc(107) short local107;
		@Pc(115) int local115;
		if (Static44.anInt1156 == 20) {
			Static19.aClass3_Sub1_Sub1_Sub4_12.method1504(382 - Static19.aClass3_Sub1_Sub1_Sub4_12.anInt2250 / 2, -(Static19.aClass3_Sub1_Sub1_Sub4_12.anInt2252 / 2) + 271);
			local107 = 211;
			arg1.method728(Static66.aClass56_263, 382, 211, 16776960, true);
			local115 = local107 + 15;
			arg1.method728(Static66.aClass56_270, 382, 226, 16776960, true);
			@Pc(123) int local123 = local115 + 15;
			arg1.method728(Static66.aClass56_267, 382, 241, 16776960, true);
			@Pc(131) int local131 = local123 + 15;
			@Pc(132) int local132 = local131 + 10;
			arg1.method733(Static84.method1524(new Class56[] { Static36.aClass56_573, Static66.aClass56_262 }), 292, 266, 16777215, true);
			@Pc(151) int local151 = local132 + 15;
			arg1.method733(Static84.method1524(new Class56[] { Static62.aClass56_963, Static66.aClass56_271.method1442() }), 294, 281, 16777215, true);
			@Pc(172) int local172 = local151 + 15;
		}
		if (Static44.anInt1156 == 10) {
			Static19.aClass3_Sub1_Sub1_Sub4_12.method1504(202, 171);
			if (Static97.anInt2545 == 0) {
				local107 = 251;
				arg1.method728(Static73.aClass56_1075, 382, 251, 16776960, true);
				Static23.aClass3_Sub1_Sub1_Sub4_15.method1504(229, 271);
				local115 = local107 + 30;
				arg1.method734(Static9.aClass56_118, 229, 271, 144, 40, 16777215, true, 1, 1, 0);
				Static23.aClass3_Sub1_Sub1_Sub4_15.method1504(389, 271);
				arg1.method734(Static113.aClass56_1556, 389, 271, 144, 40, 16777215, true, 1, 1, 0);
			} else if (Static97.anInt2545 == 2) {
				local107 = 211;
				arg1.method728(Static66.aClass56_263, 382, 211, 16776960, true);
				local115 = local107 + 15;
				arg1.method728(Static66.aClass56_270, 382, 226, 16776960, true);
				local115 += 15;
				arg1.method728(Static66.aClass56_267, 382, 241, 16776960, true);
				local115 += 15;
				local115 += 10;
				arg1.method733(Static84.method1524(new Class56[] { Static36.aClass56_573, Static66.aClass56_262, Static98.anInt2566 % 40 < 20 & Static60.anInt1748 == 0 ? Static25.aClass56_369 : Static66.aClass56_266 }), 292, 266, 16777215, true);
				local115 += 15;
				arg1.method733(Static84.method1524(new Class56[] { Static62.aClass56_963, Static66.aClass56_271.method1442(), Static60.anInt1748 == 1 & Static98.anInt2566 % 40 < 20 ? Static25.aClass56_369 : Static66.aClass56_266 }), 294, 281, 16777215, true);
				local115 += 15;
				Static23.aClass3_Sub1_Sub1_Sub4_15.method1504(229, 301);
				arg1.method728(Static95.aClass56_1344, 302, 326, 16777215, true);
				Static23.aClass3_Sub1_Sub1_Sub4_15.method1504(389, 301);
				arg1.method728(Static21.aClass56_299, 462, 326, 16777215, true);
			} else if (Static97.anInt2545 == 3) {
				arg1.method728(Static73.aClass56_1074, 382, 211, 16776960, true);
				local107 = 236;
				arg1.method728(Static24.aClass56_349, 382, 236, 16777215, true);
				local115 = local107 + 15;
				arg1.method728(Static97.aClass56_1391, 382, 251, 16777215, true);
				local115 += 15;
				arg1.method728(Static100.aClass56_1413, 382, 266, 16777215, true);
				local115 += 15;
				arg1.method728(Static109.aClass56_908, 382, 281, 16777215, true);
				Static23.aClass3_Sub1_Sub1_Sub4_15.method1504(309, 301);
				arg1.method728(Static21.aClass56_299, 382, 326, 16777215, true);
				local115 += 15;
			}
		}
		if (Static71.anInt1966 > 0) {
			Static42.method788(Static71.anInt1966);
			Static71.anInt1966 = 0;
		}
		Static99.method615();
		Static44.aClass3_Sub1_Sub1_Sub4Array26[Static76.aBoolean92 ? 1 : 0].method1504(725, 463);
		if (Static44.anInt1156 > 5 && Static124.anInt3089 != 2 && Static117.anInt2965 == 0) {
			if (Static32.aClass3_Sub1_Sub1_Sub4_22 == null) {
				Static32.aClass3_Sub1_Sub1_Sub4_22 = Static17.method347(Static114.aClass56_1567, Static114.aClass44_Sub1_75, Static66.aClass56_266);
			} else {
				Static32.aClass3_Sub1_Sub1_Sub4_22.method1504(5, 463);
				arg1.method728(Static84.method1524(new Class56[] { Static59.aClass56_924, Static3.aClass56_1721, Static111.method1851(Static4.anInt54) }), 55, 478, 16777215, true);
				if (Static30.aClass46_1 == null) {
					arg0.method728(Static22.aClass56_328, 55, 492, 16777215, true);
				} else {
					arg0.method728(Static19.aClass56_285, 55, 492, 16777215, true);
				}
			}
		}
		try {
			@Pc(608) Graphics local608 = Static59.aCanvas1.getGraphics();
			Static50.aClass30_8.method811(0, 0, local608);
		} catch (@Pc(616) Exception local616) {
			Static59.aCanvas1.repaint();
		}
	}
}
