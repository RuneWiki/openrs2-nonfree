import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "[I")
	public static int[] anIntArray244;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "[Lclient!fc;")
	public static Class25[] aClass25Array6 = new Class25[5];

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
	public static int anInt1233 = 0;

	@OriginalMember(owner = "client!ib", name = "n", descriptor = "Lclient!fc;")
	private static Class25 aClass25_519 = Static78.method1313("Please enter your password)3");

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "Lclient!fc;")
	public static Class25 aClass25_515 = aClass25_519;

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "Lclient!fc;")
	public static Class25 aClass25_516 = Static78.method1313("<col=ffffff>");

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
	public static int anInt1235 = 0;

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "Lclient!fc;")
	public static Class25 aClass25_517 = Static78.method1313("va");

	@OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
	public static int anInt1239 = -1;

	@OriginalMember(owner = "client!ib", name = "m", descriptor = "Lclient!fc;")
	public static Class25 aClass25_518 = Static78.method1313("runes");

	@OriginalMember(owner = "client!ib", name = "o", descriptor = "Lclient!fc;")
	public static Class25 aClass25_520 = Static78.method1313("Bitte geben Sie Ihren Benutzenamen ein)3");

	@OriginalMember(owner = "client!ib", name = "p", descriptor = "Lclient!fc;")
	private static Class25 aClass25_521 = Static78.method1313("cyan:");

	@OriginalMember(owner = "client!ib", name = "u", descriptor = "Lclient!fc;")
	private static Class25 aClass25_523 = Static78.method1313("Please contact customer support)3");

	@OriginalMember(owner = "client!ib", name = "q", descriptor = "Lclient!fc;")
	public static Class25 aClass25_522 = aClass25_523;

	@OriginalMember(owner = "client!ib", name = "r", descriptor = "I")
	public static int anInt1240 = 0;

	@OriginalMember(owner = "client!ib", name = "t", descriptor = "[I")
	public static int[] anIntArray245 = new int[25];

	@OriginalMember(owner = "client!ib", name = "v", descriptor = "Lclient!fc;")
	public static Class25 aClass25_524 = aClass25_521;

	@OriginalMember(owner = "client!ib", name = "w", descriptor = "Lclient!fc;")
	public static Class25 aClass25_525 = aClass25_521;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
	public static void method985() {
		aClass25_523 = null;
		aClass25_524 = null;
		aClass25_515 = null;
		aClass25_519 = null;
		anIntArray245 = null;
		aClass25_522 = null;
		aClass25_518 = null;
		aClass25_517 = null;
		aClass25Array6 = null;
		aClass25_525 = null;
		anIntArray244 = null;
		aClass25_516 = null;
		aClass25_521 = null;
		aClass25_520 = null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
	public static void method986() {
		@Pc(1) Object local1 = Static30.anObject2;
		synchronized (Static30.anObject2) {
			if (Static127.anInt2946 == 0) {
				Static71.aClass74_2.method1821(5, new Class45());
			}
			Static127.anInt2946 = 600;
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
	public static void method987() {
		Static68.method1140();
		Static7.method132();
		Static120.method1982();
		Static97.method1641();
		Static39.method893();
		Static118.method1903();
		Static33.method735();
		Static27.method602();
		Static101.method1670();
		Static39.method892();
		Static2.method32();
		Static60.method1072();
		((Class54) Static36.anInterface3_1).method1228();
		Static25.aClass63_3.method1513();
		Static38.aClass56_Sub1_5.method1281();
		Static67.aClass56_Sub1_11.method1281();
		Static71.aClass56_Sub1_12.method1281();
		Static45.aClass56_Sub1_6.method1281();
		Static18.aClass56_Sub1_2.method1281();
		Static49.aClass56_Sub1_10.method1281();
		Static96.aClass56_Sub1_19.method1281();
		Static110.aClass56_Sub1_17.method1281();
		Static45.aClass56_Sub1_7.method1281();
		Static1.aClass56_Sub1_1.method1281();
		Static120.aClass56_Sub1_20.method1281();
		Static25.aClass56_Sub1_4.method1281();
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IBI)V")
	public static void method988(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int[] local12 = new int[4];
		local12[0] = arg0;
		@Pc(19) int[] local19 = new int[4];
		local19[0] = arg1;
		@Pc(25) int local25 = 1;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			if (arg0 != Static100.anIntArray401[local27]) {
				local12[local25] = Static100.anIntArray401[local27];
				local19[local25] = Static53.anIntArray429[local27];
				local25++;
			}
		}
		Static53.anIntArray429 = local19;
		Static100.anIntArray401 = local12;
		Static84.method1410(Static53.anIntArray429, Static100.anIntArray401, 0, Static120.aClass11Array1.length - 1, Static120.aClass11Array1);
	}
}
