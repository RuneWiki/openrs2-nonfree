import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "Lclient!wd;")
	private static Class80 aClass80_710 = Static2.method59("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
	public static int anInt1865 = -1;

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "Lclient!i;")
	public static Class32 aClass32_36 = new Class32(30);

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "Lclient!wd;")
	private static Class80 aClass80_714 = Static2.method59("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "Lclient!wd;")
	public static Class80 aClass80_711 = aClass80_714;

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "[Lclient!b;")
	public static Class6[] aClass6Array1 = new Class6[16];

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "Lclient!wd;")
	public static Class80 aClass80_712 = null;

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "Lclient!wd;")
	public static Class80 aClass80_713 = aClass80_710;

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "Lclient!wd;")
	public static Class80 aClass80_715 = Static2.method59("Handel akzeptieren");

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "Lclient!wd;")
	public static Class80 aClass80_716 = Static2.method59("redstone1");

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "Lclient!wd;")
	public static Class80 aClass80_717 = Static2.method59("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
	public static void method1111() {
		aClass6Array1 = null;
		aClass32_36 = null;
		aClass80_716 = null;
		aClass80_715 = null;
		aClass80_712 = null;
		aClass80_710 = null;
		aClass80_713 = null;
		aClass80_717 = null;
		aClass80_711 = null;
		aClass80_714 = null;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!ff;I)V")
	public static void method1112(@OriginalArg(0) Class11 arg0) {
		Static11.aClass11_5 = arg0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V")
	public static void method1113() {
		if (Static39.anInt699 != 0 && Static39.anInt699 != 3 || Static20.anInt906 != 1) {
			return;
		}
		@Pc(24) int local24 = Static13.anInt365 - 550 - 25;
		@Pc(30) int local30 = Static108.anInt2880 - 5 - 4;
		if (local24 < 0 || local30 < 0 || local24 >= 146 || local30 >= 151) {
			return;
		}
		@Pc(54) int local54 = Static92.anInt2272 + Static124.anInt3139 & 0x7FF;
		@Pc(58) int local58 = Class2_Sub1_Sub9_Sub2.anIntArray202[local54];
		@Pc(66) int local66 = (Static108.anInt2879 + 256) * local58 >> 8;
		local30 -= 75;
		@Pc(71) int local71 = Class2_Sub1_Sub9_Sub2.anIntArray198[local54];
		@Pc(79) int local79 = (Static108.anInt2879 + 256) * local71 >> 8;
		local24 -= 73;
		@Pc(91) int local91 = local79 * local30 - local66 * local24 >> 11;
		@Pc(99) int local99 = Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2324 - local91 >> 7;
		@Pc(110) int local110 = local66 * local30 + local79 * local24 >> 11;
		@Pc(117) int local117 = local110 + Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2370 >> 7;
		@Pc(137) boolean local137 = Static16.method258(Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray309[0], 0, 1, 0, 0, 0, 0, local99, local117, true, Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray312[0]);
		if (!local137) {
			return;
		}
		Static120.aClass2_Sub17_Sub1_3.method1769(local24);
		Static120.aClass2_Sub17_Sub1_3.method1769(local30);
		Static120.aClass2_Sub17_Sub1_3.method1757(Static124.anInt3139);
		Static120.aClass2_Sub17_Sub1_3.method1769(57);
		Static120.aClass2_Sub17_Sub1_3.method1769(Static92.anInt2272);
		Static120.aClass2_Sub17_Sub1_3.method1769(Static108.anInt2879);
		Static120.aClass2_Sub17_Sub1_3.method1769(89);
		Static120.aClass2_Sub17_Sub1_3.method1757(Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2370);
		Static120.aClass2_Sub17_Sub1_3.method1757(Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2324);
		Static120.aClass2_Sub17_Sub1_3.method1769(Static59.anInt1767);
		Static120.aClass2_Sub17_Sub1_3.method1769(63);
		return;
	}
}
