import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static81 {

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "Lclient!v;")
	public static Class75 aClass75_1;

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "Lclient!q;")
	public static Class62 aClass62_25;

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "Lclient!bc;")
	public static Class6 aClass6_14;

	@OriginalMember(owner = "client!nb", name = "l", descriptor = "Lclient!bc;")
	public static Class6 aClass6_15;

	@OriginalMember(owner = "client!nb", name = "o", descriptor = "[[B")
	public static byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
	public static int anInt1992;

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "Lclient!ie;")
	public static Class31 aClass31_47 = new Class31();

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "Z")
	public static boolean aBoolean164 = false;

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
	public static int anInt1991 = 1;

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "Z")
	public static boolean aBoolean165 = false;

	@OriginalMember(owner = "client!nb", name = "k", descriptor = "Z")
	public static boolean aBoolean166 = false;

	@OriginalMember(owner = "client!nb", name = "m", descriptor = "J")
	public static volatile long aLong57 = 0L;

	@OriginalMember(owner = "client!nb", name = "n", descriptor = "Lclient!kd;")
	public static Class39 aClass39_984 = Static108.method1915("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!nb", name = "p", descriptor = "Lclient!kd;")
	public static Class39 aClass39_985 = Static108.method1915("Abbrechen");

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V")
	public static void method1387() {
		if (Static19.aClass26_1 != null) {
			Static19.aClass26_1.method1930();
		}
		if (Static65.aClass26_2 != null) {
			Static65.aClass26_2.method1930();
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IBI)Z")
	public static boolean method1388(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0 && Static92.anInt2167 == arg1) {
			return true;
		} else if (arg0 == 1 && Static22.anInt765 == arg1) {
			return true;
		} else {
			return (arg0 == 2 || arg0 == 3) && arg1 == Static16.anInt2469;
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)V")
	public static void method1389() {
		aByteArrayArray8 = null;
		aClass39_984 = null;
		aClass6_14 = null;
		aClass6_15 = null;
		aClass62_25 = null;
		aClass31_47 = null;
		aClass75_1 = null;
		aClass39_985 = null;
	}
}
