import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!lf", name = "U", descriptor = "[I")
	public static int[] anIntArray243;

	@OriginalMember(owner = "client!lf", name = "ab", descriptor = "Lclient!nb;")
	public static Class2_Sub2_Sub17 aClass2_Sub2_Sub17_3;

	@OriginalMember(owner = "client!lf", name = "W", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_722 = Static181.method2795(" from your friend list first)3");

	@OriginalMember(owner = "client!lf", name = "R", descriptor = "Lclient!qe;")
	public static Class83 aClass83_720 = aClass83_722;

	@OriginalMember(owner = "client!lf", name = "T", descriptor = "[I")
	public static final int[] anIntArray242 = new int[2000];

	@OriginalMember(owner = "client!lf", name = "V", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_721 = Static181.method2795("mod_icons");

	@OriginalMember(owner = "client!lf", name = "Z", descriptor = "Lclient!sg;")
	public static final Class91 aClass91_9 = new Class91(30);

	@OriginalMember(owner = "client!lf", name = "cb", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_723 = Static181.method2795("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!lf", name = "db", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_724 = Static181.method2795(")3runescape)3com");

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIII)V")
	public static void method1870(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static139.anInt2948; local3++) {
			if (Static71.anIntArray167[local3] + Static86.anIntArray181[local3] > arg1 && Static86.anIntArray181[local3] < arg0 + arg1 && Static15.anIntArray27[local3] + Static101.anIntArray226[local3] > arg3 && arg3 + arg2 > Static101.anIntArray226[local3]) {
				Static162.aBooleanArray28[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(B)V")
	public static void method1871() {
		@Pc(7) int local7 = Static160.anInt3230;
		@Pc(9) int local9 = Static177.anInt3624;
		@Pc(11) int local11 = Static43.anInt1134;
		@Pc(15) int local15 = Static162.anInt3931;
		Static126.method2138(local9, local11, local15, local7, 6116423);
		Static126.method2138(local9 + 1, local11 + 1, local15 - 2, 16, 0);
		Static126.method2120(local9 + 1, local11 - -18, local15 - 2, local7 + -19, 0);
		Static62.aClass2_Sub2_Sub5_1.method1100(Static118.aClass83_801, local9 + 3, local11 + 14, 6116423, -1);
		@Pc(64) int local64 = Static4.anInt95;
		@Pc(66) int local66 = Static121.anInt2740;
		for (@Pc(68) int local68 = 0; local68 < Static98.anInt2124; local68++) {
			@Pc(83) int local83 = (Static98.anInt2124 - local68 - 1) * 15 + local11 + 31;
			@Pc(85) int local85 = 16777215;
			if (local64 > local9 && local15 + local9 > local64 && local66 > local83 - 13 && local66 < local83 + 3) {
				local85 = 16776960;
			}
			Static62.aClass2_Sub2_Sub5_1.method1100(Static189.method2861(local68), local9 + 3, local83, local85, 0);
		}
		method1870(Static162.anInt3931, Static177.anInt3624, Static160.anInt3230, Static43.anInt1134);
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)I")
	public static int method1872(@OriginalArg(1) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(10) int local10 = local0 | local0 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(28) int local28 = local22 | local22 >>> 8;
		@Pc(39) int local39 = local28 | local28 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZZB)I")
	public static int method1875() {
		return Static68.anInt1623 + Static41.anInt1039;
	}
}
