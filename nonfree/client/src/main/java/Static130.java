import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "[I")
	public static int[] anIntArray404;

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "[[I")
	public static int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "[I")
	public static int[] anIntArray407;

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1406 = Static56.method816("mapscene");

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "Lclient!lf;")
	public static Class48 aClass48_58 = new Class48(260);

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1407 = Static56.method816("(U(Y");

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1408 = Static56.method816("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "[S")
	public static short[] aShortArray40 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "[I")
	public static int[] anIntArray405 = new int[128];

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1409 = Static56.method816("Login server offline)3");

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "[I")
	public static int[] anIntArray406 = new int[256];

	@OriginalMember(owner = "client!wb", name = "n", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1410 = Static56.method816("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1411 = Static56.method816("Service unavailable)3");

	@OriginalMember(owner = "client!wb", name = "u", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1416 = Static56.method816("Enter your username (V password)3");

	@OriginalMember(owner = "client!wb", name = "q", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1412 = aClass34_1416;

	@OriginalMember(owner = "client!wb", name = "r", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1413 = aClass34_1411;

	@OriginalMember(owner = "client!wb", name = "s", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1414 = aClass34_1409;

	@OriginalMember(owner = "client!wb", name = "t", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1415 = Static56.method816("cross");

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
	public static void method1999() {
		anIntArray404 = null;
		aClass34_1413 = null;
		aClass34_1414 = null;
		aClass34_1416 = null;
		aClass34_1408 = null;
		aShortArray40 = null;
		anIntArray407 = null;
		aClass34_1409 = null;
		anIntArray405 = null;
		aClass34_1407 = null;
		aClass34_1411 = null;
		aClass34_1406 = null;
		aClass34_1415 = null;
		aClass34_1410 = null;
		anIntArrayArray28 = null;
		aClass34_1412 = null;
		anIntArray406 = null;
		aClass48_58 = null;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)V")
	public static void method2000() {
		for (@Pc(18) Class8_Sub18 local18 = (Class8_Sub18) Static20.aClass49_2.method1107(); local18 != null; local18 = (Class8_Sub18) Static20.aClass49_2.method1109()) {
			if (local18.anInt2369 > 0) {
				local18.anInt2369--;
			}
			if (local18.anInt2369 != 0) {
				if (local18.anInt2372 > 0) {
					local18.anInt2372--;
				}
				if (local18.anInt2372 == 0 && local18.anInt2367 >= 1 && local18.anInt2377 >= 1 && local18.anInt2367 <= 102 && local18.anInt2377 <= 102 && (local18.anInt2379 < 0 || Static2.method11(local18.anInt2379, local18.anInt2368))) {
					Static84.method1249(local18.anInt2377, local18.anInt2366, local18.anInt2367, local18.anInt2373, local18.anInt2378, local18.anInt2379, local18.anInt2368);
					local18.anInt2372 = -1;
					if (local18.anInt2381 == local18.anInt2379 && local18.anInt2381 == -1) {
						local18.method2013();
					} else if (local18.anInt2381 == local18.anInt2379 && local18.anInt2371 == local18.anInt2366 && local18.anInt2368 == local18.anInt2382) {
						local18.method2013();
					}
				}
			} else if (local18.anInt2381 < 0 || Static2.method11(local18.anInt2381, local18.anInt2382)) {
				Static84.method1249(local18.anInt2377, local18.anInt2371, local18.anInt2367, local18.anInt2373, local18.anInt2378, local18.anInt2381, local18.anInt2382);
				local18.method2013();
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(JZ)V")
	public static void method2001(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < Static69.anInt1679; local19++) {
			if (arg0 == Static5.aLongArray2[local19]) {
				Static69.anInt1679--;
				for (@Pc(41) int local41 = local19; local41 < Static69.anInt1679; local41++) {
					Static5.aLongArray2[local41] = Static5.aLongArray2[local41 + 1];
					Static80.aClass34Array15[local41] = Static80.aClass34Array15[local41 + 1];
				}
				Static108.anInt2491 = Static86.anInt2177;
				Static106.aClass8_Sub20_Sub1_3.method1907(253);
				Static106.aClass8_Sub20_Sub1_3.method1879(arg0);
				return;
			}
		}
	}
}
