import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
	public static int anInt98;

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "Lclient!mc;")
	public static Class42 aClass42_66 = Static23.method501("headicons_prayer");

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "Z")
	public static boolean aBoolean5 = false;

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "Lclient!kc;")
	public static Class37 aClass37_1 = new Class37(30);

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "[I")
	public static int[] anIntArray13 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!ab", name = "q", descriptor = "Lclient!kc;")
	public static Class37 aClass37_2 = new Class37(64);

	@OriginalMember(owner = "client!ab", name = "r", descriptor = "Lclient!mc;")
	private static Class42 aClass42_67 = Static23.method501("Continue");

	@OriginalMember(owner = "client!ab", name = "s", descriptor = "[J")
	public static long[] aLongArray1 = new long[32];

	@OriginalMember(owner = "client!ab", name = "t", descriptor = "I")
	public static int anInt100 = 2;

	@OriginalMember(owner = "client!ab", name = "u", descriptor = "Lclient!mc;")
	private static Class42 aClass42_68 = Static23.method501("Loading fonts )2 ");

	@OriginalMember(owner = "client!ab", name = "v", descriptor = "Lclient!mc;")
	public static Class42 aClass42_69 = Static23.method501("Wir vermuten ihr Spielkonto wurde gestohlen");

	@OriginalMember(owner = "client!ab", name = "w", descriptor = "Lclient!mc;")
	public static Class42 aClass42_70 = aClass42_68;

	@OriginalMember(owner = "client!ab", name = "x", descriptor = "Lclient!mc;")
	public static Class42 aClass42_71 = aClass42_67;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
	public static void method86() {
		@Pc(9) int local9 = Static3.aClass1_Sub1_Sub1_Sub3_1.method805(Static61.aClass42_793);
		@Pc(24) int local24;
		for (@Pc(11) int local11 = 0; local11 < Static83.anInt2216; local11++) {
			local24 = Static3.aClass1_Sub1_Sub1_Sub3_1.method816(Static36.aClass42Array6[local11]);
			if (local24 > local9) {
				local9 = local24;
			}
		}
		local9 += 8;
		local24 = Static83.anInt2216 * 15 + 21;
		@Pc(85) int local85;
		@Pc(103) int local103;
		if (Static8.anInt247 > 4 && Static59.anInt1998 > 4 && Static8.anInt247 < 516 && Static59.anInt1998 < 338) {
			Static73.anInt1891 = 0;
			Static81.anInt2119 = local9;
			Static27.anInt792 = Static83.anInt2216 * 15 + 22;
			Static10.aBoolean13 = true;
			local85 = Static8.anInt247 - local9 / 2 - 4;
			if (local85 + local9 > 512) {
				local85 = 512 - local9;
			}
			if (local85 < 0) {
				local85 = 0;
			}
			local103 = Static59.anInt1998 - 4;
			Static91.anInt2407 = local85;
			if (local24 + local103 > 334) {
				local103 = 334 - local24;
			}
			if (local103 < 0) {
				local103 = 0;
			}
			Static50.anInt1724 = local103;
		}
		if (Static8.anInt247 > 553 && Static59.anInt1998 > 205 && Static8.anInt247 < 743 && Static59.anInt1998 < 466) {
			Static27.anInt792 = Static83.anInt2216 * 15 + 22;
			Static81.anInt2119 = local9;
			Static10.aBoolean13 = true;
			Static73.anInt1891 = 1;
			local103 = Static59.anInt1998 - 205;
			local85 = Static8.anInt247 - local9 / 2 - 553;
			if (local103 < 0) {
				local103 = 0;
			} else if (local24 + local103 > 261) {
				local103 = 261 - local24;
			}
			if (local85 < 0) {
				local85 = 0;
			} else if (local9 + local85 > 190) {
				local85 = 190 - local9;
			}
			Static91.anInt2407 = local85;
			Static50.anInt1724 = local103;
		}
		if (Static8.anInt247 <= 17 || Static59.anInt1998 <= 357 || Static8.anInt247 >= 496 || Static59.anInt1998 >= 453) {
			return;
		}
		Static73.anInt1891 = 2;
		Static27.anInt792 = Static83.anInt2216 * 15 + 22;
		Static10.aBoolean13 = true;
		local85 = Static8.anInt247 - local9 / 2 - 17;
		local103 = Static59.anInt1998 - 357;
		if (local85 < 0) {
			local85 = 0;
		} else if (local9 + local85 > 479) {
			local85 = 479 - local9;
		}
		Static81.anInt2119 = local9;
		Static91.anInt2407 = local85;
		if (local103 < 0) {
			local103 = 0;
		} else if (local103 + local24 > 96) {
			local103 = 96 - local24;
		}
		Static50.anInt1724 = local103;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
	public static void method87() {
		aLongArray1 = null;
		aClass37_2 = null;
		aClass42_69 = null;
		aClass42_67 = null;
		aClass42_66 = null;
		aClass42_71 = null;
		aClass37_1 = null;
		anIntArray13 = null;
		aClass42_68 = null;
		aClass42_70 = null;
	}
}
