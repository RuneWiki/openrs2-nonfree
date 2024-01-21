import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!u", name = "h", descriptor = "Lclient!oc;")
	public static Class56 aClass56_85;

	@OriginalMember(owner = "client!u", name = "B", descriptor = "Lclient!ue;")
	public static Class1_Sub2_Sub2_Sub4 aClass1_Sub2_Sub2_Sub4_19;

	@OriginalMember(owner = "client!u", name = "c", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1288 = Static78.method1313(" )2>");

	@OriginalMember(owner = "client!u", name = "d", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1289 = null;

	@OriginalMember(owner = "client!u", name = "f", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1290 = Static78.method1313("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!u", name = "n", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1293 = Static78.method1313("Off");

	@OriginalMember(owner = "client!u", name = "k", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1291 = aClass25_1293;

	@OriginalMember(owner = "client!u", name = "l", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1292 = Static78.method1313("invback");

	@OriginalMember(owner = "client!u", name = "o", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1294 = Static78.method1313("redstone2");

	@OriginalMember(owner = "client!u", name = "y", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1295 = Static78.method1313("scape main");

	@OriginalMember(owner = "client!u", name = "z", descriptor = "I")
	public static int anInt2667 = 0;

	@OriginalMember(owner = "client!u", name = "A", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1296 = Static78.method1313("headicons_prayer");

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIZ)Lclient!fc;")
	public static Class25 method1849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg1 - arg0;
		if (local16 < -9) {
			return Static94.aClass25_1020;
		} else if (local16 < -6) {
			return Static94.aClass25_1028;
		} else if (local16 < -3) {
			return Static7.aClass25_88;
		} else if (local16 < 0) {
			return Static114.aClass25_1283;
		} else if (local16 > 9) {
			return Static103.aClass25_1362;
		} else if (local16 > 6) {
			return Static90.aClass25_958;
		} else if (local16 > 3) {
			return Static14.aClass25_207;
		} else if (local16 > 0) {
			return Static56.aClass25_566;
		} else {
			return Static95.aClass25_1032;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
	public static void method1852() {
		aClass25_1295 = null;
		aClass25_1288 = null;
		aClass25_1294 = null;
		aClass1_Sub2_Sub2_Sub4_19 = null;
		aClass25_1292 = null;
		aClass25_1296 = null;
		aClass25_1293 = null;
		aClass25_1289 = null;
		aClass56_85 = null;
		aClass25_1291 = null;
		aClass25_1290 = null;
	}
}
