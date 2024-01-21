import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!se", name = "d", descriptor = "[I")
	public static int[] anIntArray400;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1392 = Static56.method816("<col=ffff00>");

	@OriginalMember(owner = "client!se", name = "m", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1399 = Static56.method816("Unexpected server response)3");

	@OriginalMember(owner = "client!se", name = "c", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1393 = aClass34_1399;

	@OriginalMember(owner = "client!se", name = "e", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1394 = Static56.method816("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!se", name = "h", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1396 = Static56.method816("Please enter your password)3");

	@OriginalMember(owner = "client!se", name = "g", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1395 = aClass34_1396;

	@OriginalMember(owner = "client!se", name = "u", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1401 = Static56.method816("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!se", name = "j", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1397 = aClass34_1401;

	@OriginalMember(owner = "client!se", name = "k", descriptor = "[I")
	public static int[] anIntArray401 = new int[5];

	@OriginalMember(owner = "client!se", name = "l", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1398 = Static56.method816("<col=ff9040>");

	@OriginalMember(owner = "client!se", name = "o", descriptor = "I")
	public static int anInt3027 = 0;

	@OriginalMember(owner = "client!se", name = "p", descriptor = "[J")
	public static long[] aLongArray8 = new long[32];

	@OriginalMember(owner = "client!se", name = "q", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1400 = aClass34_1401;

	@OriginalMember(owner = "client!se", name = "s", descriptor = "I")
	public static int anInt3029 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
	public static void method1988() {
		aClass34_1394 = null;
		anIntArray400 = null;
		aClass34_1397 = null;
		aClass34_1398 = null;
		anIntArray401 = null;
		aLongArray8 = null;
		aClass34_1399 = null;
		aClass34_1396 = null;
		aClass34_1393 = null;
		aClass34_1400 = null;
		aClass34_1395 = null;
		aClass34_1401 = null;
		aClass34_1392 = null;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BLclient!ic;)Z")
	public static boolean method1993(@OriginalArg(1) Class34 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static62.anInt1593; local11++) {
			if (arg0.method806(Static93.aClass34Array16[local11])) {
				return true;
			}
		}
		return arg0.method806(Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.aClass34_638);
	}
}
