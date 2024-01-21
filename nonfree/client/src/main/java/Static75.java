import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!od", name = "fb", descriptor = "I")
	public static int anInt2122;

	@OriginalMember(owner = "client!od", name = "vb", descriptor = "Lclient!pc;")
	public static Class12 aClass12_64;

	@OriginalMember(owner = "client!od", name = "zb", descriptor = "Lclient!r;")
	public static Class55 aClass55_1;

	@OriginalMember(owner = "client!od", name = "U", descriptor = "Lclient!hb;")
	public static Class27 aClass27_990 = Static87.method1648(":tradereq:");

	@OriginalMember(owner = "client!od", name = "Y", descriptor = "[[B")
	public static byte[][] aByteArrayArray11 = new byte[1000][];

	@OriginalMember(owner = "client!od", name = "Z", descriptor = "[B")
	public static byte[] aByteArray18 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!od", name = "db", descriptor = "Lclient!hb;")
	public static Class27 aClass27_991 = Static87.method1648("Stufe)2");

	@OriginalMember(owner = "client!od", name = "xb", descriptor = "Lclient!hb;")
	private static Class27 aClass27_997 = Static87.method1648("To");

	@OriginalMember(owner = "client!od", name = "kb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_992 = aClass27_997;

	@OriginalMember(owner = "client!od", name = "nb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_993 = Static87.method1648("Privater Chat");

	@OriginalMember(owner = "client!od", name = "qb", descriptor = "Z")
	public static boolean aBoolean100 = false;

	@OriginalMember(owner = "client!od", name = "yb", descriptor = "Lclient!hb;")
	private static Class27 aClass27_998 = Static87.method1648("No response from server)3");

	@OriginalMember(owner = "client!od", name = "rb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_994 = aClass27_998;

	@OriginalMember(owner = "client!od", name = "tb", descriptor = "Lclient!hb;")
	private static Class27 aClass27_996 = Static87.method1648("flash3:");

	@OriginalMember(owner = "client!od", name = "sb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_995 = aClass27_996;

	@OriginalMember(owner = "client!od", name = "ub", descriptor = "Z")
	public static boolean aBoolean101 = false;

	@OriginalMember(owner = "client!od", name = "Ab", descriptor = "Lclient!hb;")
	public static Class27 aClass27_999 = Static87.method1648("cross");

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BI)V")
	public static void method1502(@OriginalArg(1) int arg0) {
		Static18.anInt431 += arg0;
		while (Static80.anInt2188 <= Static18.anInt431) {
			Static18.anInt431 -= Static80.anInt2188;
			Static106.anInt837 -= Static106.anInt837 >> 2;
		}
		Static106.anInt837 -= arg0 * 1000;
		if (Static106.anInt837 < 0) {
			Static106.anInt837 = 0;
		}
	}

	@OriginalMember(owner = "client!od", name = "g", descriptor = "(I)V")
	public static void method1503() {
		Static39.aClass21_16.method663();
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(B)V")
	public static void method1506() {
		aClass27_999 = null;
		aClass27_990 = null;
		aClass27_997 = null;
		aClass27_993 = null;
		aClass27_995 = null;
		aClass27_992 = null;
		aClass27_998 = null;
		aByteArray18 = null;
		aByteArrayArray11 = null;
		aClass55_1 = null;
		aClass27_991 = null;
		aClass12_64 = null;
		aClass27_994 = null;
		aClass27_996 = null;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)Lclient!ud;")
	public static Class3_Sub3_Sub15 method1507(@OriginalArg(1) int arg0) {
		@Pc(6) Class3_Sub3_Sub15 local6 = (Class3_Sub3_Sub15) Static80.aClass21_26.method658((long) arg0);
		if (local6 != null) {
			return local6;
		}
		local6 = Static72.method1337(arg0, Static108.aClass54_35, Static76.aClass54_27);
		if (local6 != null) {
			Static80.aClass21_26.method660(local6, (long) arg0);
		}
		return local6;
	}
}
