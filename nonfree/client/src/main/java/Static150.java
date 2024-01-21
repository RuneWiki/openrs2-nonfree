import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!r", name = "S", descriptor = "Z")
	public static boolean aBoolean137;

	@OriginalMember(owner = "client!r", name = "eb", descriptor = "I")
	public static int anInt3388;

	@OriginalMember(owner = "client!r", name = "nb", descriptor = "Lclient!bc;")
	public static Class1 aClass1_27;

	@OriginalMember(owner = "client!r", name = "U", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1321 = Static120.method1824("K");

	@OriginalMember(owner = "client!r", name = "T", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1320 = aClass80_1321;

	@OriginalMember(owner = "client!r", name = "W", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1322 = aClass80_1321;

	@OriginalMember(owner = "client!r", name = "ab", descriptor = "I")
	public static int anInt3386 = 0;

	@OriginalMember(owner = "client!r", name = "db", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1323 = Static120.method1824("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!r", name = "jb", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1325 = Static120.method1824("OFF");

	@OriginalMember(owner = "client!r", name = "gb", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1324 = aClass80_1325;

	@OriginalMember(owner = "client!r", name = "kb", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1326 = Static120.method1824("flash2:");

	@OriginalMember(owner = "client!r", name = "qb", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1327 = aClass80_1326;

	@OriginalMember(owner = "client!r", name = "rb", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1328 = aClass80_1326;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIII)V")
	public static void method2409(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1) {
		Static17.anInt440 = arg1;
		Static34.anInt790 = 0;
		Static172.anInt3861 = 0;
		Static85.anInt1779 = arg0;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IBIII)V")
	public static void method2411(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static60.anInt1321; local7++) {
			if (arg2 < Static148.anIntArray427[local7] + Static160.anIntArray444[local7] && Static160.anIntArray444[local7] < arg2 + arg0 && arg3 < Static33.anIntArray99[local7] + Static130.anIntArray379[local7] && Static33.anIntArray99[local7] < arg3 + arg1) {
				Static158.aBooleanArray18[local7] = true;
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(III)V")
	public static void method2413(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static146.aClass3_Sub17_Sub1_3.method2146(225);
		Static146.aClass3_Sub17_Sub1_3.method2110(arg1);
		Static146.aClass3_Sub17_Sub1_3.method2125(arg0);
	}
}
