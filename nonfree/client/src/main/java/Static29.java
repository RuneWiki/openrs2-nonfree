import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!fc", name = "wb", descriptor = "I")
	public static int anInt1085;

	@OriginalMember(owner = "client!fc", name = "Cb", descriptor = "[I")
	public static int[] anIntArray118;

	@OriginalMember(owner = "client!fc", name = "Nb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!fc", name = "Sb", descriptor = "I")
	public static int anInt1100;

	@OriginalMember(owner = "client!fc", name = "Ub", descriptor = "I")
	public static int anInt1102;

	@OriginalMember(owner = "client!fc", name = "sb", descriptor = "Lclient!a;")
	private static Class1 aClass1_1107 = Static94.method1596("Malformed login packet)3");

	@OriginalMember(owner = "client!fc", name = "tb", descriptor = "Lclient!a;")
	public static Class1 aClass1_1108 = Static94.method1596("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!fc", name = "xb", descriptor = "I")
	public static int anInt1086 = 0;

	@OriginalMember(owner = "client!fc", name = "zb", descriptor = "I")
	public static int anInt1088 = 0;

	@OriginalMember(owner = "client!fc", name = "Bb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2 = new byte[4][104][104];

	@OriginalMember(owner = "client!fc", name = "Db", descriptor = "Lclient!a;")
	public static Class1 aClass1_1109 = aClass1_1107;

	@OriginalMember(owner = "client!fc", name = "Fb", descriptor = "Lclient!a;")
	public static Class1 aClass1_1110 = Static94.method1596("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!fc", name = "Gb", descriptor = "I")
	public static int anInt1091 = -1;

	@OriginalMember(owner = "client!fc", name = "Lb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray6 = new int[4][13][13];

	@OriginalMember(owner = "client!fc", name = "Wb", descriptor = "J")
	public static volatile long aLong28 = 0L;

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V")
	public static void method754() {
		aByteArrayArrayArray3 = null;
		aByteArrayArrayArray2 = null;
		anIntArrayArrayArray6 = null;
		aClass1_1108 = null;
		aClass1_1107 = null;
		aClass1_1110 = null;
		aClass1_1109 = null;
		anIntArray118 = null;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V")
	public static void method757() {
		Static71.method1363(0, false, null, 10);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!a;IIIILclient!a;)V")
	public static void method758(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class1 arg5) {
		if (Static37.anInt1346 >= 500) {
			return;
		}
		if (arg5.method10() <= 0) {
			Static84.aClass1Array20[Static37.anInt1346] = arg1;
		} else {
			Static84.aClass1Array20[Static37.anInt1346] = Static97.method1655(new Class1[] { arg1, Static77.aClass1_2166, arg5 });
		}
		Static66.anIntArray290[Static37.anInt1346] = arg4;
		Static60.anIntArray196[Static37.anInt1346] = arg0;
		Static32.anIntArray123[Static37.anInt1346] = arg3;
		Static98.anIntArray311[Static37.anInt1346] = arg2;
		Static37.anInt1346++;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)V")
	public static void method759(@OriginalArg(0) int arg0) {
		if (Static85.anInt2262 == arg0) {
			return;
		}
		if (Static85.anInt2262 == 0) {
			Static5.method196();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static17.anInt771 = 0;
			anInt1088 = 0;
			Static20.anInt908 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static57.aClass65_3 != null) {
			Static57.aClass65_3.method1758();
			Static57.aClass65_3 = null;
		}
		if (Static85.anInt2262 == 25 || Static85.anInt2262 == 40) {
			Static110.method1795();
			Static92.method1127();
		}
		if (Static85.anInt2262 == 25) {
			Static65.anInt1940 = 0;
			Static31.anInt1206 = 1;
			Static79.anInt2096 = 0;
			Static48.anInt1608 = 1;
			Static113.anInt2242 = 0;
		}
		if (arg0 == 35) {
			Static46.method1046();
			Static66.method1587();
			if (Static4.aClass4_8 == null) {
				Static4.aClass4_8 = Static86.method1550(503, 765, Static103.aCanvas1);
			}
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static4.aClass4_8 = null;
			Static46.method1046();
			Static51.method1171(Static103.aCanvas1, Static53.aClass8_Sub1_13, Static37.aClass8_Sub1_8);
		}
		if (arg0 == 25 || arg0 == 30 || arg0 == 40) {
			Static4.aClass4_8 = null;
			Static66.method1587();
			Static18.method524(Static103.aCanvas1, Static37.aClass8_Sub1_8);
		}
		Static85.anInt2262 = arg0;
		Static80.aBoolean119 = true;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!jd;II)V")
	public static void method760(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub2_Sub4 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg0 * arg0 + arg2 * arg2;
		if (local12 <= 4225 || local12 >= 90000) {
			Static28.method737(arg2, arg0, arg1);
			return;
		}
		@Pc(26) int local26 = Static94.anInt2376 + Static72.anInt1975 & 0x7FF;
		@Pc(30) int local30 = Static75.anIntArray254[local26];
		@Pc(34) int local34 = Static75.anIntArray256[local26];
		@Pc(42) int local42 = local30 * 256 / (Static85.anInt2254 + 256);
		@Pc(50) int local50 = local34 * 256 / (Static85.anInt2254 + 256);
		@Pc(60) int local60 = local50 * arg2 - local42 * arg0 >> 16;
		@Pc(70) int local70 = arg0 * local50 + arg2 * local42 >> 16;
		@Pc(76) double local76 = Math.atan2((double) local70, (double) local60);
		@Pc(82) int local82 = (int) (Math.sin(local76) * 63.0D);
		@Pc(88) int local88 = (int) (Math.cos(local76) * 57.0D);
		Static25.aClass2_Sub1_Sub2_Sub4_1.method1148(local82 + 94 + 4 - 10, -local88 + 83 + -20, local76);
	}
}
