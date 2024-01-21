import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!w", name = "yb", descriptor = "Lclient!kc;")
	public static Class37 aClass37_28 = new Class37(50);

	@OriginalMember(owner = "client!w", name = "Bb", descriptor = "Z")
	public static final boolean aBoolean148 = false;

	@OriginalMember(owner = "client!w", name = "Cb", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1439 = Static23.method501("Error connecting to server)3");

	@OriginalMember(owner = "client!w", name = "Db", descriptor = "I")
	public static int anInt2732 = 0;

	@OriginalMember(owner = "client!w", name = "Eb", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1440 = Static23.method501("No reply from loginserver)3");

	@OriginalMember(owner = "client!w", name = "Fb", descriptor = "I")
	public static int anInt2733 = 0;

	@OriginalMember(owner = "client!w", name = "Gb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1441 = aClass42_1440;

	@OriginalMember(owner = "client!w", name = "Hb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1442 = aClass42_1439;

	@OriginalMember(owner = "client!w", name = "Ib", descriptor = "[I")
	public static int[] anIntArray404 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!w", name = "g", descriptor = "(I)V")
	public static void method1841() {
		if (Static79.anInt2016 != 0 || Static80.anInt2104 != 1) {
			return;
		}
		@Pc(24) int local24 = Static8.anInt247 - 575;
		@Pc(30) int local30 = Static59.anInt1998 - 5 - 4;
		if (local24 < 0 || local30 < 0 || local24 >= 146 || local30 >= 151) {
			return;
		}
		local30 -= 75;
		local24 -= 73;
		@Pc(51) int local51 = Static80.anInt2116 + Static36.anInt897 & 0x7FF;
		@Pc(55) int local55 = Class1_Sub1_Sub1_Sub2.anIntArray143[local51];
		@Pc(59) int local59 = Class1_Sub1_Sub1_Sub2.anIntArray144[local51];
		@Pc(67) int local67 = (Static74.anInt1894 + 256) * local55 >> 8;
		@Pc(75) int local75 = local59 * (Static74.anInt1894 + 256) >> 8;
		@Pc(85) int local85 = local75 * local30 + local67 * local24 >> 11;
		@Pc(96) int local96 = local30 * local67 - local75 * local24 >> 11;
		@Pc(103) int local103 = local85 + Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anInt2576 >> 7;
		@Pc(111) int local111 = Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anInt2583 - local96 >> 7;
		@Pc(131) boolean local131 = Static92.method1680(0, 0, local103, 0, 0, true, 1, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray393[0], 0, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray395[0], local111);
		if (!local131) {
			return;
		}
		Static98.aClass1_Sub8_Sub1_3.method1185(local24);
		Static98.aClass1_Sub8_Sub1_3.method1185(local30);
		Static98.aClass1_Sub8_Sub1_3.method1222(Static36.anInt897);
		Static98.aClass1_Sub8_Sub1_3.method1185(57);
		Static98.aClass1_Sub8_Sub1_3.method1185(Static80.anInt2116);
		Static98.aClass1_Sub8_Sub1_3.method1185(Static74.anInt1894);
		Static98.aClass1_Sub8_Sub1_3.method1185(89);
		Static98.aClass1_Sub8_Sub1_3.method1222(Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anInt2576);
		Static98.aClass1_Sub8_Sub1_3.method1222(Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anInt2583);
		Static98.aClass1_Sub8_Sub1_3.method1185(Static56.anInt1428);
		Static98.aClass1_Sub8_Sub1_3.method1185(63);
		return;
	}

	@OriginalMember(owner = "client!w", name = "h", descriptor = "(I)V")
	public static void method1842() {
		anIntArray404 = null;
		aClass42_1442 = null;
		aClass42_1439 = null;
		aClass42_1440 = null;
		aClass37_28 = null;
		aClass42_1441 = null;
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(Z)[Lclient!nc;")
	public static Class1_Sub1_Sub1_Sub4[] method1843() {
		@Pc(2) Class1_Sub1_Sub1_Sub4[] local2 = new Class1_Sub1_Sub1_Sub4[Static3.anInt118];
		for (@Pc(13) int local13 = 0; local13 < Static3.anInt118; local13++) {
			@Pc(22) Class1_Sub1_Sub1_Sub4 local22 = local2[local13] = new Class1_Sub1_Sub1_Sub4();
			local22.anInt1626 = Static45.anInt1859;
			local22.anInt1623 = Static108.anInt2749;
			local22.anInt1625 = Static39.anIntArray37[local13];
			local22.anInt1624 = Static36.anIntArray124[local13];
			local22.anInt1627 = Static83.anIntArray340[local13];
			local22.anInt1628 = Static29.anIntArray98[local13];
			local22.anIntArray238 = Static69.anIntArray243;
			local22.aByteArray23 = Static98.aByteArrayArray10[local13];
		}
		Static34.method590();
		return local2;
	}
}
