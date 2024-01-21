import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static25 {

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "[Lclient!he;")
	public static Class1_Sub10[] aClass1_Sub10Array1;

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "Lclient!sc;")
	public static Class66 aClass66_429 = Static106.method1849("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
	public static int anInt691 = -1;

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "Lclient!sc;")
	private static Class66 aClass66_430 = Static106.method1849("Please use a different world)3");

	@OriginalMember(owner = "client!ed", name = "r", descriptor = "Lclient!sc;")
	private static Class66 aClass66_438 = Static106.method1849(" has logged in)3");

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "Lclient!sc;")
	public static Class66 aClass66_431 = aClass66_438;

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "Lclient!sc;")
	private static Class66 aClass66_432 = Static106.method1849("Drop");

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
	public static int anInt694 = -1;

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "Lclient!sc;")
	public static Class66 aClass66_433 = aClass66_430;

	@OriginalMember(owner = "client!ed", name = "m", descriptor = "Lclient!sc;")
	public static Class66 aClass66_434 = Static106.method1849("::rect_debug");

	@OriginalMember(owner = "client!ed", name = "n", descriptor = "[I")
	public static int[] anIntArray101 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!ed", name = "o", descriptor = "Lclient!sc;")
	public static Class66 aClass66_435 = aClass66_432;

	@OriginalMember(owner = "client!ed", name = "p", descriptor = "Lclient!sc;")
	public static Class66 aClass66_436 = Static106.method1849("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!ed", name = "q", descriptor = "Lclient!sc;")
	public static Class66 aClass66_437 = aClass66_430;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILclient!he;)Lclient!sc;")
	public static Class66 method529(@OriginalArg(1) Class1_Sub10 arg0) {
		if (Static5.method162(Static61.method1301(arg0)) == 0) {
			return null;
		} else if (arg0.aClass66_730 == null || arg0.aClass66_730.method1808().method1847() == 0) {
			return Static3.aBoolean2 ? Static17.aClass66_331 : null;
		} else {
			return arg0.aClass66_730;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
	public static void method530() {
		aClass66_433 = null;
		aClass66_435 = null;
		aClass66_437 = null;
		aClass1_Sub10Array1 = null;
		aClass66_432 = null;
		aClass66_430 = null;
		aClass66_431 = null;
		aClass66_436 = null;
		aClass66_434 = null;
		anIntArray101 = null;
		aClass66_438 = null;
		aClass66_429 = null;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)V")
	public static void method531(@OriginalArg(0) int arg0) {
		if (Static51.method1090(arg0)) {
			Static129.method2039(Static100.aClass1_Sub10ArrayArray1[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
	public static void method532() {
		Static38.aClass65_43 = new Class65(32);
	}
}
