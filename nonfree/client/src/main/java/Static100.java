import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!rb", name = "x", descriptor = "I")
	public static int anInt2289;

	@OriginalMember(owner = "client!rb", name = "M", descriptor = "I")
	public static int anInt2292;

	@OriginalMember(owner = "client!rb", name = "R", descriptor = "[Lclient!ue;")
	public static Class4_Sub4_Sub5_Sub4[] aClass4_Sub4_Sub5_Sub4Array11;

	@OriginalMember(owner = "client!rb", name = "t", descriptor = "Lclient!v;")
	private static Class76 aClass76_1050 = Static134.method2017("Malformed login packet)3");

	@OriginalMember(owner = "client!rb", name = "v", descriptor = "[J")
	public static long[] aLongArray55 = new long[200];

	@OriginalMember(owner = "client!rb", name = "y", descriptor = "Lclient!v;")
	public static Class76 aClass76_1051 = Static134.method2017("T");

	@OriginalMember(owner = "client!rb", name = "z", descriptor = "Lclient!v;")
	public static Class76 aClass76_1052 = Static134.method2017("Hidden)2use");

	@OriginalMember(owner = "client!rb", name = "B", descriptor = "Lclient!v;")
	private static Class76 aClass76_1053 = Static134.method2017("Loaded textures");

	@OriginalMember(owner = "client!rb", name = "C", descriptor = "J")
	public static long aLong79 = 0L;

	@OriginalMember(owner = "client!rb", name = "D", descriptor = "Lclient!v;")
	public static Class76 aClass76_1054 = aClass76_1053;

	@OriginalMember(owner = "client!rb", name = "H", descriptor = "Lclient!v;")
	public static Class76 aClass76_1055 = Static134.method2017("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!rb", name = "I", descriptor = "Lclient!v;")
	public static Class76 aClass76_1056 = Static134.method2017("");

	@OriginalMember(owner = "client!rb", name = "K", descriptor = "Lclient!v;")
	public static Class76 aClass76_1057 = aClass76_1050;

	@OriginalMember(owner = "client!rb", name = "N", descriptor = "I")
	public static int anInt2293 = 0;

	@OriginalMember(owner = "client!rb", name = "O", descriptor = "Lclient!v;")
	public static Class76 aClass76_1059 = Static134.method2017("<col=ff0000>");

	@OriginalMember(owner = "client!rb", name = "P", descriptor = "Lclient!v;")
	public static Class76 aClass76_1060 = Static134.method2017("und haben es deaktiviert)3 Klicken Sie auf der");

	@OriginalMember(owner = "client!rb", name = "V", descriptor = "Lclient!v;")
	public static Class76 aClass76_1061 = Static134.method2017("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "(I)V")
	public static void method1582() {
		aClass76_1061 = null;
		aClass76_1051 = null;
		aClass76_1060 = null;
		aClass4_Sub4_Sub5_Sub4Array11 = null;
		aClass76_1059 = null;
		aClass76_1054 = null;
		aClass76_1055 = null;
		aClass76_1056 = null;
		aClass76_1052 = null;
		aClass76_1057 = null;
		aLongArray55 = null;
		aClass76_1050 = null;
		aClass76_1053 = null;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IBI)V")
	public static void method1583(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static34.anInt965 == 2) {
			Static29.method385((Static69.anInt1764 - Static64.anInt1649 << 7) + Static52.anInt1352, Static124.anInt2713 + (Static69.anInt1766 - Static51.anInt2080 << 7), Static134.anInt2842 * 2);
			if (Static122.anInt2674 > -1 && Static78.anInt1981 % 20 < 10) {
				Static99.aClass4_Sub4_Sub5_Sub2Array50[0].method903(Static122.anInt2674 + arg0 - 12, Static91.anInt2121 + -28 + arg1);
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!ef;I)V")
	public static void method1584(@OriginalArg(0) Class4_Sub4_Sub3_Sub1 arg0) {
		if (arg0.anInt1427 == Static78.anInt1981 || arg0.anInt1390 == -1 || arg0.anInt1417 != 0 || arg0.anInt1415 + 1 > Static118.method1796(arg0.anInt1390).anIntArray200[arg0.anInt1385]) {
			@Pc(39) int local39 = arg0.anInt1436 * 128 + arg0.anInt1382 * 64;
			@Pc(50) int local50 = arg0.anInt1408 * 128 + arg0.anInt1382 * 64;
			@Pc(57) int local57 = arg0.anInt1427 - arg0.anInt1397;
			@Pc(63) int local63 = Static78.anInt1981 - arg0.anInt1397;
			@Pc(73) int local73 = arg0.anInt1382 * 64 + arg0.anInt1413 * 128;
			@Pc(84) int local84 = arg0.anInt1398 * 128 + arg0.anInt1382 * 64;
			arg0.anInt1393 = (local39 * (local57 - local63) + local73 * local63) / local57;
			arg0.anInt1416 = ((local57 - local63) * local50 + local84 * local63) / local57;
		}
		arg0.anInt1421 = 0;
		if (arg0.anInt1407 == 0) {
			arg0.anInt1409 = 1024;
		}
		if (arg0.anInt1407 == 1) {
			arg0.anInt1409 = 1536;
		}
		if (arg0.anInt1407 == 2) {
			arg0.anInt1409 = 0;
		}
		if (arg0.anInt1407 == 3) {
			arg0.anInt1409 = 512;
		}
		arg0.anInt1395 = arg0.anInt1409;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)Z")
	public static boolean method1585(@OriginalArg(0) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILclient!la;Lclient!la;Lclient!la;Lclient!la;)V")
	public static void method1586(@OriginalArg(1) Class17 arg0, @OriginalArg(2) Class17 arg1, @OriginalArg(3) Class17 arg2, @OriginalArg(4) Class17 arg3) {
		Static91.aClass17_28 = arg1;
		Static31.aClass17_10 = arg3;
		Static102.aClass17_30 = arg0;
		Static5.aClass17_3 = arg2;
		Static29.aClass4_Sub8ArrayArray1 = new Class4_Sub8[Static31.aClass17_10.method285()][];
		Static92.aBooleanArray13 = new boolean[Static31.aClass17_10.method285()];
	}
}
