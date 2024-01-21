import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!c", name = "G", descriptor = "[Lclient!vd;")
	public static Class5_Sub2_Sub1_Sub4[] aClass5_Sub2_Sub1_Sub4Array2;

	@OriginalMember(owner = "client!c", name = "x", descriptor = "Lclient!ge;")
	public static Class29 aClass29_5 = new Class29(50);

	@OriginalMember(owner = "client!c", name = "C", descriptor = "[I")
	public static int[] anIntArray74 = new int[32];

	@OriginalMember(owner = "client!c", name = "D", descriptor = "Lclient!r;")
	public static Class61 aClass61_119 = Static129.method2060("weiss:");

	@OriginalMember(owner = "client!c", name = "F", descriptor = "I")
	public static int anInt367 = 0;

	@OriginalMember(owner = "client!c", name = "H", descriptor = "I")
	public static final int anInt368 = 3353893;

	@OriginalMember(owner = "client!c", name = "I", descriptor = "I")
	public static int anInt369 = -1;

	@OriginalMember(owner = "client!c", name = "J", descriptor = "Lclient!r;")
	public static Class61 aClass61_120 = Static129.method2060("Sprites geladen)3");

	@OriginalMember(owner = "client!c", name = "M", descriptor = "Lclient!r;")
	private static Class61 aClass61_123 = Static129.method2060("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!c", name = "K", descriptor = "Lclient!r;")
	public static Class61 aClass61_121 = aClass61_123;

	@OriginalMember(owner = "client!c", name = "L", descriptor = "Lclient!r;")
	private static Class61 aClass61_122 = Static129.method2060("Loading textures )2 ");

	@OriginalMember(owner = "client!c", name = "N", descriptor = "Lclient!r;")
	public static Class61 aClass61_124 = aClass61_122;

	@OriginalMember(owner = "client!c", name = "O", descriptor = "Lclient!r;")
	public static Class61 aClass61_125 = Static129.method2060("leuchten3:");

	@OriginalMember(owner = "client!c", name = "P", descriptor = "Lclient!r;")
	public static Class61 aClass61_126 = Static129.method2060("headicons_prayer");

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
	public static void method272() {
		Static24.method505(Static86.aClass5_Sub11_8);
		Static110.anInt2830++;
		if (Static114.aBoolean104 && Static99.aBoolean95) {
			@Pc(24) int local24 = Static30.anInt917;
			local24 -= Static132.anInt3373;
			if (Static30.anInt926 > local24) {
				local24 = Static30.anInt926;
			}
			@Pc(39) int local39 = Static40.anInt1073;
			local39 -= Static129.anInt3233;
			if (local39 < Static118.anInt3021) {
				local39 = Static118.anInt3021;
			}
			if (local24 + Static86.aClass5_Sub11_8.anInt1653 > Static68.aClass5_Sub11_6.anInt1653 + Static30.anInt926) {
				local24 = Static30.anInt926 + Static68.aClass5_Sub11_6.anInt1653 - Static86.aClass5_Sub11_8.anInt1653;
			}
			@Pc(70) int local70 = local24 - Static74.anInt1769;
			@Pc(78) int local78 = local24 + Static68.aClass5_Sub11_6.anInt1640 - Static30.anInt926;
			if (local39 + Static86.aClass5_Sub11_8.anInt1636 > Static68.aClass5_Sub11_6.anInt1636 + Static118.anInt3021) {
				local39 = Static118.anInt3021 + Static68.aClass5_Sub11_6.anInt1636 - Static86.aClass5_Sub11_8.anInt1636;
			}
			@Pc(106) int local106 = local39 - Static2.anInt19;
			@Pc(113) int local113 = Static68.aClass5_Sub11_6.anInt1660 + local39 - Static118.anInt3021;
			@Pc(116) int local116 = Static86.aClass5_Sub11_8.anInt1643;
			if (Static110.anInt2830 > Static86.aClass5_Sub11_8.anInt1620 && (local70 > local116 || -local116 > local70 || local116 < local106 || -local116 > local106)) {
				Static91.aBoolean84 = true;
			}
			@Pc(157) Class5_Sub22 local157;
			if (Static86.aClass5_Sub11_8.anObjectArray5 != null && Static91.aBoolean84) {
				local157 = new Class5_Sub22();
				local157.anInt2980 = local113;
				local157.aClass5_Sub11_12 = Static86.aClass5_Sub11_8;
				local157.anInt2981 = local78;
				local157.anObjectArray28 = Static86.aClass5_Sub11_8.anObjectArray5;
				Static76.method1228(local157);
			}
			if (Static8.anInt190 == 0) {
				if (Static91.aBoolean84) {
					if (Static86.aClass5_Sub11_8.anObjectArray4 != null) {
						local157 = new Class5_Sub22();
						local157.anInt2980 = local113;
						local157.aClass5_Sub11_12 = Static86.aClass5_Sub11_8;
						local157.anObjectArray28 = Static86.aClass5_Sub11_8.anObjectArray4;
						local157.aClass5_Sub11_11 = Static4.aClass5_Sub11_10;
						local157.anInt2981 = local78;
						Static76.method1228(local157);
					}
					if (Static4.aClass5_Sub11_10 != null && Static31.method643(Static86.aClass5_Sub11_8) != null) {
						Static1.aClass5_Sub14_Sub1_1.method1489(105);
						Static1.aClass5_Sub14_Sub1_1.method1481(Static4.aClass5_Sub11_10.anInt1645);
						Static1.aClass5_Sub14_Sub1_1.method1446(Static4.aClass5_Sub11_10.anInt1614);
						Static1.aClass5_Sub14_Sub1_1.method1451(Static86.aClass5_Sub11_8.anInt1614);
						Static1.aClass5_Sub14_Sub1_1.method1482(Static86.aClass5_Sub11_8.anInt1645);
					}
				} else if ((Static125.anInt3132 == 1 || Static83.method1501(Static36.anInt1015 - 1)) && Static36.anInt1015 > 2) {
					Static10.method191();
				} else if (Static36.anInt1015 > 0) {
					Static20.method458(Static36.anInt1015 - 1);
				}
				Static86.aClass5_Sub11_8 = null;
			}
		} else if (Static110.anInt2830 > 1) {
			Static86.aClass5_Sub11_8 = null;
		}
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
	public static void method273() {
		Static110.anIntArray342 = new int[33];
		Static55.anIntArray207 = new int[33];
		Static34.anIntArray158 = new int[151];
		Static98.anIntArray324 = new int[151];
		@Pc(23) int local23;
		@Pc(25) int local25;
		@Pc(27) int local27;
		for (@Pc(19) int local19 = 0; local19 < 33; local19++) {
			local23 = 999;
			local25 = 0;
			for (local27 = 0; local27 < 34; local27++) {
				if (Static79.aClass5_Sub2_Sub1_Sub3_4.aByteArray31[local19 * Static79.aClass5_Sub2_Sub1_Sub3_4.anInt2091 + local27] == 0) {
					if (local23 == 999) {
						local23 = local27;
					}
				} else if (local23 != 999) {
					local25 = local27;
					break;
				}
			}
			Static55.anIntArray207[local19] = local23;
			Static110.anIntArray342[local19] = local25 - local23;
		}
		for (local23 = 5; local23 < 156; local23++) {
			local25 = 999;
			local27 = 0;
			for (@Pc(89) int local89 = 25; local89 < 172; local89++) {
				if (Static79.aClass5_Sub2_Sub1_Sub3_4.aByteArray31[local89 + local23 * Static79.aClass5_Sub2_Sub1_Sub3_4.anInt2091] == 0 && (local89 > 34 || local23 > 34)) {
					if (local25 == 999) {
						local25 = local89;
					}
				} else if (local25 != 999) {
					local27 = local89;
					break;
				}
			}
			Static98.anIntArray324[local23 - 5] = local25 - 25;
			Static34.anIntArray158[local23 - 5] = local27 - local25;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V")
	public static void method274() {
		aClass61_122 = null;
		aClass61_126 = null;
		aClass5_Sub2_Sub1_Sub4Array2 = null;
		anIntArray74 = null;
		aClass61_121 = null;
		aClass61_125 = null;
		aClass61_124 = null;
		aClass61_120 = null;
		aClass29_5 = null;
		aClass61_119 = null;
		aClass61_123 = null;
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(I)I")
	public static int method275() {
		@Pc(13) int local13 = Static42.method757(Static93.anInt2428, Static22.anInt683, Static40.anInt1074);
		return local13 - Static78.anInt1986 >= 800 || (Static30.aByteArrayArrayArray2[Static93.anInt2428][Static22.anInt683 >> 7][Static40.anInt1074 >> 7] & 0x4) == 0 ? 3 : Static93.anInt2428;
	}
}
