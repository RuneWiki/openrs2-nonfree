import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!p", name = "F", descriptor = "Lclient!ia;")
	public static Class5_Sub1_Sub10_Sub1 aClass5_Sub1_Sub10_Sub1_19;

	@OriginalMember(owner = "client!p", name = "I", descriptor = "Lclient!fc;")
	public static Class24_Sub1 aClass24_Sub1_17;

	@OriginalMember(owner = "client!p", name = "X", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!p", name = "t", descriptor = "[Lclient!vc;")
	public static Class71[] aClass71Array13 = new Class71[200];

	@OriginalMember(owner = "client!p", name = "v", descriptor = "Lclient!me;")
	public static Class5_Sub1_Sub11 aClass5_Sub1_Sub11_4 = null;

	@OriginalMember(owner = "client!p", name = "w", descriptor = "Lclient!vc;")
	public static Class71 aClass71_976 = Static38.method736("Nehmen");

	@OriginalMember(owner = "client!p", name = "x", descriptor = "Lclient!vc;")
	public static Class71 aClass71_977 = Static38.method736("Name eingeben:");

	@OriginalMember(owner = "client!p", name = "B", descriptor = "Lclient!vc;")
	private static Class71 aClass71_978 = Static38.method736("Friends");

	@OriginalMember(owner = "client!p", name = "E", descriptor = "Lclient!vc;")
	public static Class71 aClass71_979 = Static38.method736("mapedge");

	@OriginalMember(owner = "client!p", name = "H", descriptor = "Lclient!vc;")
	public static Class71 aClass71_980 = aClass71_978;

	@OriginalMember(owner = "client!p", name = "J", descriptor = "Lclient!vc;")
	private static Class71 aClass71_981 = Static38.method736("Please close the interface you have open before using (Wreport abuse(W");

	@OriginalMember(owner = "client!p", name = "M", descriptor = "Lclient!vc;")
	private static Class71 aClass71_983 = Static38.method736("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!p", name = "K", descriptor = "Lclient!vc;")
	public static Class71 aClass71_982 = aClass71_983;

	@OriginalMember(owner = "client!p", name = "L", descriptor = "I")
	public static int anInt1990 = 0;

	@OriginalMember(owner = "client!p", name = "N", descriptor = "Lclient!vc;")
	public static Class71 aClass71_984 = aClass71_981;

	@OriginalMember(owner = "client!p", name = "O", descriptor = "I")
	public static int anInt1991 = 0;

	@OriginalMember(owner = "client!p", name = "P", descriptor = "Lclient!vc;")
	public static Class71 aClass71_985 = aClass71_983;

	@OriginalMember(owner = "client!p", name = "Q", descriptor = "I")
	public static int anInt1992 = 0;

	@OriginalMember(owner = "client!p", name = "R", descriptor = "Lclient!vc;")
	public static Class71 aClass71_986 = Static38.method736("(U1");

	@OriginalMember(owner = "client!p", name = "T", descriptor = "Lclient!vc;")
	private static Class71 aClass71_987 = Static38.method736("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!p", name = "U", descriptor = "Lclient!vc;")
	public static Class71 aClass71_988 = aClass71_987;

	@OriginalMember(owner = "client!p", name = "V", descriptor = "Lclient!vc;")
	public static Class71 aClass71_989 = Static38.method736("Mem:");

	@OriginalMember(owner = "client!p", name = "W", descriptor = "[I")
	public static int[] anIntArray246 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!vc;Lclient!vc;Lclient!nb;Z)Lclient!vd;")
	public static Class5_Sub1_Sub10_Sub3 method1340(@OriginalArg(0) Class71 arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) Class24 arg2) {
		@Pc(9) int local9 = arg2.method650(arg1);
		@Pc(19) int local19 = arg2.method664(arg0, local9);
		return Static97.method1608(local19, arg2, local9);
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(B)V")
	public static void method1341() {
		Static66.aByteArrayArrayArray3 = new byte[4][104][104];
		Static71.aByteArrayArrayArray4 = new byte[4][104][104];
		Static64.anIntArrayArrayArray9 = new int[4][105][105];
		Static9.anIntArrayArray2 = new int[105][105];
		Static77.anInt1920 = 99;
		Static114.aByteArrayArrayArray7 = new byte[4][104][104];
		Static30.anIntArray99 = new int[104];
		Static97.anIntArray256 = new int[104];
		Static108.anIntArray272 = new int[104];
		aByteArrayArrayArray6 = new byte[4][104][104];
		Static23.aByteArrayArrayArray1 = new byte[4][105][105];
		Static31.anIntArray103 = new int[104];
		Static8.anIntArray17 = new int[104];
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ILclient!la;)V")
	public static void method1342(@OriginalArg(1) Class5_Sub1_Sub1_Sub3 arg0) {
		arg0.aBoolean105 = false;
		@Pc(13) Class5_Sub1_Sub18 local13;
		if (arg0.anInt2470 != -1) {
			local13 = Static57.method1017(arg0.anInt2470);
			if (local13 == null || local13.anIntArray294 == null) {
				arg0.anInt2470 = -1;
			} else {
				arg0.anInt2490++;
				if (local13.anIntArray294.length > arg0.anInt2446 && arg0.anInt2490 > local13.anIntArray290[arg0.anInt2446]) {
					arg0.anInt2446++;
					arg0.anInt2490 = 1;
					Static36.method716(arg0.anInt2474, arg0.anInt2452, arg0.anInt2446, local13);
				}
				if (local13.anIntArray294.length <= arg0.anInt2446) {
					arg0.anInt2446 = 0;
					arg0.anInt2490 = 0;
					Static36.method716(arg0.anInt2474, arg0.anInt2452, arg0.anInt2446, local13);
				}
			}
		}
		if (arg0.anInt2459 != -1 && arg0.anInt2476 <= Static95.anInt2285) {
			if (arg0.anInt2464 < 0) {
				arg0.anInt2464 = 0;
			}
			@Pc(116) int local116 = Static109.method1740(arg0.anInt2459).anInt2101;
			if (local116 == -1) {
				arg0.anInt2459 = -1;
			} else {
				@Pc(123) Class5_Sub1_Sub18 local123 = Static57.method1017(local116);
				if (local123 == null || local123.anIntArray294 == null) {
					arg0.anInt2459 = -1;
				} else {
					arg0.anInt2433++;
					if (arg0.anInt2464 < local123.anIntArray294.length && arg0.anInt2433 > local123.anIntArray290[arg0.anInt2464]) {
						arg0.anInt2433 = 1;
						arg0.anInt2464++;
						Static36.method716(arg0.anInt2474, arg0.anInt2452, arg0.anInt2464, local123);
					}
					if (local123.anIntArray294.length <= arg0.anInt2464 && (arg0.anInt2464 < 0 || local123.anIntArray294.length <= arg0.anInt2464)) {
						arg0.anInt2459 = -1;
					}
				}
			}
		}
		if (arg0.anInt2458 != -1 && arg0.anInt2471 <= 1) {
			local13 = Static57.method1017(arg0.anInt2458);
			if (local13.anInt2953 == 1 && arg0.anInt2435 > 0 && arg0.anInt2447 <= Static95.anInt2285 && arg0.anInt2460 < Static95.anInt2285) {
				arg0.anInt2471 = 1;
				return;
			}
		}
		if (arg0.anInt2458 != -1 && arg0.anInt2471 == 0) {
			local13 = Static57.method1017(arg0.anInt2458);
			if (local13 == null || local13.anIntArray294 == null) {
				arg0.anInt2458 = -1;
			} else {
				arg0.anInt2438++;
				if (arg0.anInt2482 < local13.anIntArray294.length && local13.anIntArray290[arg0.anInt2482] < arg0.anInt2438) {
					arg0.anInt2438 = 1;
					arg0.anInt2482++;
					Static36.method716(arg0.anInt2474, arg0.anInt2452, arg0.anInt2482, local13);
				}
				if (local13.anIntArray294.length <= arg0.anInt2482) {
					arg0.anInt2450++;
					arg0.anInt2482 -= local13.anInt2945;
					if (local13.anInt2952 <= arg0.anInt2450) {
						arg0.anInt2458 = -1;
					} else if (arg0.anInt2482 >= 0 && arg0.anInt2482 < local13.anIntArray294.length) {
						Static36.method716(arg0.anInt2474, arg0.anInt2452, arg0.anInt2482, local13);
					} else {
						arg0.anInt2458 = -1;
					}
				}
				arg0.aBoolean105 = local13.aBoolean129;
			}
		}
		if (arg0.anInt2471 > 0) {
			arg0.anInt2471--;
		}
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
	public static void method1343() {
		for (@Pc(12) Class5_Sub4 local12 = (Class5_Sub4) Static14.aClass52_3.method1358(); local12 != null; local12 = (Class5_Sub4) Static14.aClass52_3.method1363()) {
			if (local12.aClass5_Sub1_Sub15_1 != null) {
				local12.method603();
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "d", descriptor = "(B)V")
	public static void method1344() {
		aClass71_976 = null;
		aClass71_989 = null;
		aClass71_987 = null;
		aClass71_981 = null;
		aClass71_983 = null;
		aClass5_Sub1_Sub11_4 = null;
		aClass71_984 = null;
		aClass71_977 = null;
		aClass71Array13 = null;
		aClass71_980 = null;
		aClass71_988 = null;
		aClass71_979 = null;
		aClass71_982 = null;
		aClass24_Sub1_17 = null;
		aClass71_985 = null;
		aClass5_Sub1_Sub10_Sub1_19 = null;
		aClass71_978 = null;
		aClass71_986 = null;
		anIntArray246 = null;
		aByteArrayArrayArray6 = null;
	}
}
