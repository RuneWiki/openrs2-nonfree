import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!td", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString5;

	@OriginalMember(owner = "client!td", name = "r", descriptor = "[[Lclient!vb;")
	public static Class3_Sub1_Sub15[][] aClass3_Sub1_Sub15ArrayArray1;

	@OriginalMember(owner = "client!td", name = "V", descriptor = "Lclient!we;")
	public static Class62 aClass62_24;

	@OriginalMember(owner = "client!td", name = "ab", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray18;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "Lclient!na;")
	public static Class53 aClass53_1232 = Static109.method1737(" loggt sich ein)3");

	@OriginalMember(owner = "client!td", name = "d", descriptor = "[Lclient!pc;")
	public static Class59[] aClass59Array1 = new Class59[50];

	@OriginalMember(owner = "client!td", name = "z", descriptor = "Lclient!na;")
	private static Class53 aClass53_1234 = Static109.method1737("Loaded textures");

	@OriginalMember(owner = "client!td", name = "o", descriptor = "Lclient!na;")
	public static Class53 aClass53_1233 = aClass53_1234;

	@OriginalMember(owner = "client!td", name = "t", descriptor = "I")
	public static int anInt2462 = 0;

	@OriginalMember(owner = "client!td", name = "v", descriptor = "[Lclient!na;")
	public static Class53[] aClass53Array18 = new Class53[20];

	@OriginalMember(owner = "client!td", name = "C", descriptor = "I")
	public static int anInt2468 = 0;

	@OriginalMember(owner = "client!td", name = "E", descriptor = "Lclient!na;")
	public static Class53 aClass53_1235 = Static109.method1737(":");

	@OriginalMember(owner = "client!td", name = "F", descriptor = "Lclient!na;")
	private static Class53 aClass53_1236 = Static109.method1737("To");

	@OriginalMember(owner = "client!td", name = "M", descriptor = "Lclient!te;")
	public static Class75 aClass75_67 = new Class75(64);

	@OriginalMember(owner = "client!td", name = "R", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray7 = new int[4][105][105];

	@OriginalMember(owner = "client!td", name = "X", descriptor = "Lclient!na;")
	public static Class53 aClass53_1237 = aClass53_1236;

	@OriginalMember(owner = "client!td", name = "bb", descriptor = "Lclient!na;")
	private static Class53 aClass53_1239 = Static109.method1737("Enter amount:");

	@OriginalMember(owner = "client!td", name = "Z", descriptor = "Lclient!na;")
	public static Class53 aClass53_1238 = aClass53_1239;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
	public static void method1718() {
		aClass53_1238 = null;
		aString5 = null;
		aClass53_1239 = null;
		aClass53_1233 = null;
		aClass75_67 = null;
		aClass62_24 = null;
		aClass53Array18 = null;
		aByteArrayArrayArray18 = null;
		aClass53_1235 = null;
		aClass53_1236 = null;
		aClass53_1232 = null;
		aClass3_Sub1_Sub15ArrayArray1 = null;
		anIntArrayArrayArray7 = null;
		aClass59Array1 = null;
		aClass53_1237 = null;
		aClass53_1234 = null;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ZZ)V")
	public static void method1719(@OriginalArg(1) boolean arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static20.anInt693; local12++) {
			@Pc(20) Class3_Sub1_Sub4_Sub1_Sub1 local20 = Static44.aClass3_Sub1_Sub4_Sub1_Sub1Array1[Static18.anIntArray49[local12]];
			@Pc(29) int local29 = (Static18.anIntArray49[local12] << 14) + 536870912;
			if (local20 != null && local20.method1036() && arg0 == local20.aClass3_Sub1_Sub1_1.aBoolean3 && local20.aClass3_Sub1_Sub1_1.method82()) {
				@Pc(58) int local58 = local20.anInt1424 >> 7;
				@Pc(63) int local63 = local20.anInt1427 >> 7;
				if (local58 >= 0 && local58 < 104 && local63 >= 0 && local63 < 104) {
					if (local20.anInt1453 == 1 && (local20.anInt1424 & 0x7F) == 64 && (local20.anInt1427 & 0x7F) == 64) {
						if (Static72.anIntArrayArray14[local58][local63] == Static43.anInt1233) {
							continue;
						}
						Static72.anIntArrayArray14[local58][local63] = Static43.anInt1233;
					}
					if (!local20.aClass3_Sub1_Sub1_1.aBoolean6) {
						local29 += Integer.MIN_VALUE;
					}
					Static120.aClass39_1.method987(Static72.anInt1813, local20.anInt1424, local20.anInt1427, Static77.method1355(local20.anInt1427 + local20.anInt1453 * 64 - 64, Static72.anInt1813, local20.anInt1424 + (local20.anInt1453 - 1) * 64), (local20.anInt1453 - 1) * 64 + 60, local20, local20.anInt1426, local29, local20.aBoolean54);
				}
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
	public static void method1720() {
		if (Static20.anInt702 == 104) {
			@Pc(13) int local13;
			if (Static76.anInt1896 == -1) {
				local13 = Static100.anInt2360;
			} else {
				local13 = Static76.anInt1896;
			}
			if (Static76.anInt1896 != Static100.anInt2360) {
				local13--;
				if (local13 < 0) {
					local13 = 19;
				}
				if (aClass53Array18[local13] != null) {
					Static35.aClass53_469 = aClass53Array18[local13];
					Static76.anInt1896 = local13;
					Static52.aBoolean50 = true;
				}
			}
		}
		if (Static20.anInt702 != 105 || Static76.anInt1896 == -1) {
			return;
		}
		Static76.anInt1896++;
		if (Static76.anInt1896 >= 20) {
			Static76.anInt1896 = 0;
		}
		if (Static76.anInt1896 == Static100.anInt2360) {
			Static76.anInt1896 = -1;
			Static52.aBoolean50 = true;
			Static35.aClass53_469 = Static35.aClass53_476;
			return;
		}
		if (aClass53Array18[Static76.anInt1896] != null) {
			Static35.aClass53_469 = aClass53Array18[Static76.anInt1896];
			Static52.aBoolean50 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BZ)V")
	public static void method1721(@OriginalArg(1) boolean arg0) {
		if (Static68.anInt1730 == Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1424 >> 7 && Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1427 >> 7 == Static59.anInt1551) {
			Static68.anInt1730 = 0;
		}
		@Pc(25) int local25 = Static72.anInt1820;
		if (arg0) {
			local25 = 1;
		}
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(47) Class3_Sub1_Sub4_Sub1_Sub2 local47;
			@Pc(53) int local53;
			if (arg0) {
				local47 = Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1;
				local53 = 33538048;
			} else {
				local47 = Static10.aClass3_Sub1_Sub4_Sub1_Sub2Array1[Static71.anIntArray228[local37]];
				local53 = Static71.anIntArray228[local37] << 14;
			}
			if (local47 != null && local47.method1036()) {
				local47.aBoolean55 = false;
				if ((Static45.aBoolean47 && Static72.anInt1820 > 50 || Static72.anInt1820 > 200) && !arg0 && local47.anInt1449 == local47.anInt1436) {
					local47.aBoolean55 = true;
				}
				@Pc(93) int local93 = local47.anInt1427 >> 7;
				@Pc(98) int local98 = local47.anInt1424 >> 7;
				if (local98 >= 0 && local98 < 104 && local93 >= 0 && local93 < 104) {
					if (local47.aClass3_Sub1_Sub4_Sub7_1 == null || local47.anInt1491 > Static27.anInt843 || local47.anInt1492 <= Static27.anInt843) {
						if ((local47.anInt1424 & 0x7F) == 64 && (local47.anInt1427 & 0x7F) == 64) {
							if (Static43.anInt1233 == Static72.anIntArrayArray14[local98][local93]) {
								continue;
							}
							Static72.anIntArrayArray14[local98][local93] = Static43.anInt1233;
						}
						local47.anInt1482 = Static77.method1355(local47.anInt1427, Static72.anInt1813, local47.anInt1424);
						Static120.aClass39_1.method987(Static72.anInt1813, local47.anInt1424, local47.anInt1427, local47.anInt1482, 60, local47, local47.anInt1426, local53, local47.aBoolean54);
					} else {
						local47.aBoolean55 = false;
						local47.anInt1482 = Static77.method1355(local47.anInt1427, Static72.anInt1813, local47.anInt1424);
						Static120.aClass39_1.method999(Static72.anInt1813, local47.anInt1424, local47.anInt1427, local47.anInt1482, local47, local47.anInt1426, local53, local47.anInt1500, local47.anInt1499, local47.anInt1496, local47.anInt1495);
					}
				}
			}
		}
	}
}
