import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!re", name = "a", descriptor = "Lclient!pe;")
	public static Class26_Sub1 aClass26_Sub1_63;

	@OriginalMember(owner = "client!re", name = "h", descriptor = "[I")
	public static int[] anIntArray327;

	@OriginalMember(owner = "client!re", name = "t", descriptor = "Lclient!u;")
	private static Class74 aClass74_1482 = Static72.method1077("flash1:");

	@OriginalMember(owner = "client!re", name = "b", descriptor = "Lclient!u;")
	public static Class74 aClass74_1474 = aClass74_1482;

	@OriginalMember(owner = "client!re", name = "j", descriptor = "Lclient!u;")
	private static Class74 aClass74_1475 = Static72.method1077("Private chat");

	@OriginalMember(owner = "client!re", name = "k", descriptor = "Lclient!u;")
	private static Class74 aClass74_1476 = Static72.method1077("Loaded update list");

	@OriginalMember(owner = "client!re", name = "m", descriptor = "Lclient!u;")
	public static Class74 aClass74_1477 = aClass74_1476;

	@OriginalMember(owner = "client!re", name = "o", descriptor = "Lclient!u;")
	public static Class74 aClass74_1478 = aClass74_1475;

	@OriginalMember(owner = "client!re", name = "r", descriptor = "Lclient!u;")
	private static Class74 aClass74_1481 = Static72.method1077("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!re", name = "p", descriptor = "Lclient!u;")
	public static Class74 aClass74_1479 = aClass74_1481;

	@OriginalMember(owner = "client!re", name = "q", descriptor = "Lclient!u;")
	public static Class74 aClass74_1480 = aClass74_1482;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
	public static void method1584() {
		aClass26_Sub1_63 = null;
		aClass74_1481 = null;
		aClass74_1477 = null;
		aClass74_1482 = null;
		aClass74_1475 = null;
		aClass74_1480 = null;
		aClass74_1474 = null;
		aClass74_1476 = null;
		aClass74_1479 = null;
		anIntArray327 = null;
		aClass74_1478 = null;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
	public static void method1586() {
		@Pc(9) int local9 = Static54.aClass2_Sub2_Sub1_Sub3_7.method302(Static75.aClass74_1111);
		@Pc(19) int local19;
		for (@Pc(11) int local11 = 0; local11 < Static112.anInt2421; local11++) {
			local19 = Static54.aClass2_Sub2_Sub1_Sub3_7.method307(Static92.aClass74Array14[local11]);
			if (local9 < local19) {
				local9 = local19;
			}
		}
		local9 += 8;
		local19 = Static112.anInt2421 * 15 + 21;
		@Pc(74) int local74;
		@Pc(50) int local50;
		if (Static14.anInt401 != -1) {
			Static109.aBoolean103 = true;
			Static9.anInt299 = local9;
			Static23.anInt642 = Static112.anInt2421 * 15 + 22;
			local50 = Static15.anInt442;
			if (local19 + local50 > 503) {
				local50 = 503 - local19;
			}
			if (local50 < 0) {
				local50 = 0;
			}
			local74 = Static120.anInt2565 - local9 / 2;
			Static78.anInt1701 = 0;
			if (local9 + local74 > 765) {
				local74 = 765 - local9;
			}
			Static10.anInt321 = local50;
			if (local74 < 0) {
				local74 = 0;
			}
			Static66.anInt1462 = local74;
		} else if (Static120.anInt2565 > 4 && Static15.anInt442 > 4 && Static120.anInt2565 < 516 && Static15.anInt442 < 338) {
			Static109.aBoolean103 = true;
			Static9.anInt299 = local9;
			local74 = Static120.anInt2565 - local9 / 2 - 4;
			Static78.anInt1701 = 0;
			Static23.anInt642 = Static112.anInt2421 * 15 + 22;
			if (local74 + local9 > 512) {
				local74 = 512 - local9;
			}
			local50 = Static15.anInt442 - 4;
			if (local19 + local50 > 334) {
				local50 = 334 - local19;
			}
			if (local50 < 0) {
				local50 = 0;
			}
			Static10.anInt321 = local50;
			if (local74 < 0) {
				local74 = 0;
			}
			Static66.anInt1462 = local74;
		} else if (Static120.anInt2565 > 553 && Static15.anInt442 > 205 && Static120.anInt2565 < 743 && Static15.anInt442 < 466) {
			Static109.aBoolean103 = true;
			Static9.anInt299 = local9;
			Static23.anInt642 = Static112.anInt2421 * 15 + 22;
			local50 = Static15.anInt442 - 205;
			Static78.anInt1701 = 1;
			if (local50 < 0) {
				local50 = 0;
			} else if (local19 + local50 > 261) {
				local50 = 261 - local19;
			}
			Static10.anInt321 = local50;
			local74 = Static120.anInt2565 - local9 / 2 - 553;
			if (local74 < 0) {
				local74 = 0;
			} else if (local74 + local9 > 190) {
				local74 = 190 - local9;
			}
			Static66.anInt1462 = local74;
		} else if (Static120.anInt2565 > 17 && Static15.anInt442 > 357 && Static120.anInt2565 < 496 && Static15.anInt442 < 453) {
			local74 = Static120.anInt2565 - local9 / 2 - 17;
			Static109.aBoolean103 = true;
			Static9.anInt299 = local9;
			Static23.anInt642 = Static112.anInt2421 * 15 + 22;
			Static78.anInt1701 = 2;
			local50 = Static15.anInt442 - 357;
			if (local74 < 0) {
				local74 = 0;
			} else if (local9 + local74 > 479) {
				local74 = 479 - local9;
			}
			Static66.anInt1462 = local74;
			if (local50 < 0) {
				local50 = 0;
			} else if (local50 + local19 > 96) {
				local50 = 96 - local19;
			}
			Static10.anInt321 = local50;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(III)V")
	public static void method1587(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static69.anInt1519 != 0 && arg1 != -1) {
			Static4.method26(0, Static56.aClass26_Sub1_41, arg1, Static69.anInt1519);
			Static57.aBoolean52 = true;
		}
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(I)Z")
	public static boolean method1588() {
		@Pc(13) Class42 local13 = Static39.aClass42_1;
		synchronized (Static39.aClass42_1) {
			if (Static3.anInt47 == Static1.anInt2101) {
				return false;
			} else {
				Static39.anInt951 = Static112.anIntArray352[Static1.anInt2101];
				Static27.anInt676 = Static2.anIntArray6[Static1.anInt2101];
				Static1.anInt2101 = Static1.anInt2101 + 1 & 0x7F;
				return true;
			}
		}
	}
}
