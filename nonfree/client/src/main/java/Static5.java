import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ae", name = "z", descriptor = "Z")
	public static boolean aBoolean18;

	@OriginalMember(owner = "client!ae", name = "E", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!ae", name = "F", descriptor = "J")
	public static long aLong15;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "Lclient!wb;")
	private static Class65 aClass65_107 = Static24.method441("Private chat");

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
	public static int anInt237 = -1;

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "Lclient!wb;")
	private static Class65 aClass65_110 = Static24.method441("Click to continue");

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "Lclient!wb;")
	public static Class65 aClass65_108 = aClass65_110;

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "Lclient!wb;")
	public static Class65 aClass65_109 = Static24.method441("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "Lclient!wb;")
	public static Class65 aClass65_111 = Static24.method441(" )2> @lre@");

	@OriginalMember(owner = "client!ae", name = "m", descriptor = "Lclient!wb;")
	public static Class65 aClass65_112 = Static24.method441("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
	public static int anInt242 = 0;

	@OriginalMember(owner = "client!ae", name = "p", descriptor = "[I")
	public static int[] anIntArray30 = new int[128];

	@OriginalMember(owner = "client!ae", name = "r", descriptor = "Lclient!wb;")
	private static Class65 aClass65_113 = Static24.method441("yellow:");

	@OriginalMember(owner = "client!ae", name = "t", descriptor = "Lclient!wb;")
	public static Class65 aClass65_114 = aClass65_113;

	@OriginalMember(owner = "client!ae", name = "w", descriptor = "I")
	public static volatile int anInt247 = 0;

	@OriginalMember(owner = "client!ae", name = "y", descriptor = "Lclient!wb;")
	public static Class65 aClass65_115 = aClass65_107;

	@OriginalMember(owner = "client!ae", name = "B", descriptor = "Lclient!wb;")
	public static Class65 aClass65_116 = Static24.method441("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
	public static void method121() {
		aClass65_115 = null;
		aClass65_116 = null;
		aClass65_107 = null;
		aClass65_114 = null;
		aClass65_108 = null;
		anIntArray30 = null;
		aClass65_113 = null;
		aClass65_109 = null;
		aClass65_110 = null;
		aByteArrayArrayArray1 = null;
		aClass65_111 = null;
		aClass65_112 = null;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIII)Z")
	public static boolean method122(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = arg0 >> 14 & 0x7FFF;
		@Pc(18) int local18 = Static67.aClass18_1.method620(Static62.anInt1879, arg1, arg2, arg0);
		if (local18 == -1) {
			return false;
		}
		@Pc(32) int local32 = local18 & 0x1F;
		@Pc(38) int local38 = local18 >> 6 & 0x3;
		if (local32 == 10 || local32 == 11 || local32 == 22) {
			@Pc(57) Class2_Sub1_Sub14 local57 = Static29.method518(local11);
			@Pc(68) int local68;
			@Pc(71) int local71;
			if (local38 == 0 || local38 == 2) {
				local71 = local57.anInt2634;
				local68 = local57.anInt2621;
			} else {
				local68 = local57.anInt2634;
				local71 = local57.anInt2621;
			}
			@Pc(82) int local82 = local57.anInt2618;
			if (local38 != 0) {
				local82 = (local82 << local38 & 0xF) + (local82 >> 4 - local38);
			}
			Static16.method315(0, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray209[0], local71, local68, local82, 2, 0, true, arg1, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray208[0], arg2);
		} else {
			Static16.method315(local38, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray209[0], 0, 0, 0, 2, local32 + 1, true, arg1, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray208[0], arg2);
		}
		Static83.anInt2381 = 0;
		Static19.anInt1890 = Static32.anInt1044;
		Static85.anInt2457 = 2;
		Static71.anInt2166 = Static89.anInt2559;
		return true;
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V")
	public static void method125() {
		Static31.aBoolean65 = false;
		Static4.aBoolean16 = false;
	}
}
