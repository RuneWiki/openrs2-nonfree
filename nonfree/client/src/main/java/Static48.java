import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!ja", name = "xc", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!ja", name = "Ub", descriptor = "I")
	public static final int anInt2394 = 50;

	@OriginalMember(owner = "client!ja", name = "sb", descriptor = "[Lclient!hb;")
	public static Class27[] aClass27Array14 = new Class27[anInt2394];

	@OriginalMember(owner = "client!ja", name = "tb", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1132 = Static87.method1648("System update in: ");

	@OriginalMember(owner = "client!ja", name = "yb", descriptor = "[I")
	public static int[] anIntArray355 = new int[anInt2394];

	@OriginalMember(owner = "client!ja", name = "Bb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1133 = Static87.method1648("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!ja", name = "Eb", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1134 = Static87.method1648(" more options");

	@OriginalMember(owner = "client!ja", name = "Hb", descriptor = "[I")
	public static int[] anIntArray358 = new int[anInt2394];

	@OriginalMember(owner = "client!ja", name = "Jb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1135 = Static87.method1648(" )2> @whi@");

	@OriginalMember(owner = "client!ja", name = "Nb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1136 = Static87.method1648("overlay_multiway");

	@OriginalMember(owner = "client!ja", name = "Tb", descriptor = "I")
	public static int anInt2393 = 0;

	@OriginalMember(owner = "client!ja", name = "Xb", descriptor = "[I")
	public static int[] anIntArray360 = new int[anInt2394];

	@OriginalMember(owner = "client!ja", name = "fc", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1137 = Static87.method1648("Schlie-8en");

	@OriginalMember(owner = "client!ja", name = "ic", descriptor = "[I")
	public static int[] anIntArray361 = new int[anInt2394];

	@OriginalMember(owner = "client!ja", name = "kc", descriptor = "[I")
	public static int[] anIntArray362 = new int[anInt2394];

	@OriginalMember(owner = "client!ja", name = "lc", descriptor = "[I")
	public static int[] anIntArray363 = new int[anInt2394];

	@OriginalMember(owner = "client!ja", name = "yc", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1139 = Static87.method1648("Einloggen");

	@OriginalMember(owner = "client!ja", name = "Cc", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1140 = Static87.method1648("backbase2");

	@OriginalMember(owner = "client!ja", name = "Gc", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1141 = aClass27_1134;

	@OriginalMember(owner = "client!ja", name = "Ic", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1142 = aClass27_1132;

	@OriginalMember(owner = "client!ja", name = "Jc", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1143 = Static87.method1648("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!ja", name = "Tc", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1144 = Static87.method1648("mapedge");

	@OriginalMember(owner = "client!ja", name = "Vc", descriptor = "[I")
	public static int[] anIntArray365 = new int[anInt2394];

	@OriginalMember(owner = "client!ja", name = "j", descriptor = "(I)V")
	public static void method1672() {
		@Pc(3) int local3 = Static40.anInt1206;
		@Pc(5) int local5 = Static91.anInt2517;
		@Pc(16) int local16 = Static71.anInt1864;
		@Pc(18) int local18 = Static67.anInt1724;
		Static95.method1322(local5, local3, local16, local18, 6116423);
		Static95.method1322(local5 + 1, local3 + 1, local16 - 2, 16, 0);
		Static95.method1328(local5 + 1, local3 + 18, local16 - 2, local18 - 19, 0);
		Static31.aClass3_Sub3_Sub2_Sub1_1.method610(Static17.aClass27_222, local5 + 3, local3 + 14, 6116423);
		@Pc(64) int local64 = Static85.anInt2297;
		@Pc(66) int local66 = Static93.anInt2546;
		if (Static22.anInt582 == 0) {
			local64 -= 4;
			local66 -= 4;
		}
		if (Static22.anInt582 == 1) {
			local64 -= 553;
			local66 -= 205;
		}
		if (Static22.anInt582 == 2) {
			local66 -= 357;
			local64 -= 17;
		}
		for (@Pc(82) int local82 = 0; local82 < Static61.anInt1553; local82++) {
			@Pc(97) int local97 = local3 + (Static61.anInt1553 + -1 + -local82) * 15 + 31;
			@Pc(99) int local99 = 16777215;
			if (local5 < local64 && local64 < local16 + local5 && local66 > local97 - 13 && local66 < local97 + 3) {
				local99 = 16776960;
			}
			Static31.aClass3_Sub3_Sub2_Sub1_1.method604(Static55.aClass27Array9[local82], local5 + 3, local97, local99, true);
		}
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(IIII)I")
	public static int method1675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 >> 7;
		@Pc(7) int local7 = arg0 >> 7;
		if (local3 < 0 || local7 < 0 || local3 > 103 || local7 > 103) {
			return 0;
		}
		@Pc(33) int local33 = arg1;
		if (arg1 < 3 && (Static89.aByteArrayArrayArray11[1][local3][local7] & 0x2) == 2) {
			local33 = arg1 + 1;
		}
		@Pc(52) int local52 = arg0 & 0x7F;
		@Pc(56) int local56 = arg2 & 0x7F;
		@Pc(83) int local83 = Static55.anIntArrayArrayArray4[local33][local3 + 1][local7] * local56 + (128 - local56) * Static55.anIntArrayArrayArray4[local33][local3][local7] >> 7;
		@Pc(113) int local113 = Static55.anIntArrayArrayArray4[local33][local3 + 1][local7 + 1] * local56 + Static55.anIntArrayArrayArray4[local33][local3][local7 + 1] * (128 - local56) >> 7;
		return local113 * local52 + (128 - local52) * local83 >> 7;
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(III)Z")
	public static boolean method1676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0 && Static53.anInt1424 == arg1) {
			return true;
		} else if (arg0 == 1 && Static15.anInt302 == arg1) {
			return true;
		} else {
			return (arg0 == 2 || arg0 == 3) && arg1 == Static53.anInt1425;
		}
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(II)Z")
	public static boolean method1680(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!ja", name = "l", descriptor = "(I)V")
	public static void method1681() {
		aClass27Array14 = null;
		aClass27_1140 = null;
		aClass27_1141 = null;
		aClass27_1136 = null;
		aClass27_1144 = null;
		aClass27_1133 = null;
		aClass27_1142 = null;
		anIntArray358 = null;
		anIntArray365 = null;
		aClass27_1135 = null;
		anIntArray360 = null;
		anIntArray355 = null;
		anIntArray362 = null;
		anIntArray361 = null;
		aClass27_1132 = null;
		aClass27_1139 = null;
		aClass27_1134 = null;
		anIntArray363 = null;
		aClass27_1143 = null;
		aByteArrayArrayArray10 = null;
		aClass27_1137 = null;
	}

	@OriginalMember(owner = "client!ja", name = "m", descriptor = "(I)V")
	public static void method1682() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german]");
		System.exit(1);
	}
}
