import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
	public static int anInt2892;

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "Lclient!kh;")
	public static Class29 aClass29_56;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1249 = Static51.method932("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "J")
	public static long aLong97 = 0L;

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
	public static int anInt2890 = 0;

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
	public static int anInt2891 = 0;

	@OriginalMember(owner = "client!qb", name = "i", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1250 = Static51.method932("_");

	@OriginalMember(owner = "client!qb", name = "o", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1253 = Static51.method932("World");

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1251 = aClass10_1253;

	@OriginalMember(owner = "client!qb", name = "m", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1252 = aClass10_1253;

	@OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
	public static volatile int anInt2897 = 0;

	@OriginalMember(owner = "client!qb", name = "p", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1254 = Static51.method932("Sorry invited players only)3");

	@OriginalMember(owner = "client!qb", name = "q", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1255 = aClass10_1249;

	@OriginalMember(owner = "client!qb", name = "s", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1256 = aClass10_1254;

	@OriginalMember(owner = "client!qb", name = "u", descriptor = "I")
	public static int anInt2900 = 0;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
	public static void method2081() {
		@Pc(5) Object local5 = Static57.anObject3;
		synchronized (Static57.anObject3) {
			if (Static129.anInt2882 == 0) {
				Static57.aClass63_4.method1956(new Class66(), 5);
			}
			Static129.anInt2882 = 600;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[B)[B")
	public static byte[] method2082(@OriginalArg(1) byte[] arg0) {
		@Pc(7) int local7 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local7];
		Static182.method1348(arg0, 0, local14, 0, local7);
		return local14;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)Z")
	public static boolean method2083(@OriginalArg(0) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
	public static void method2084() {
		aClass29_56 = null;
		aClass10_1253 = null;
		aClass10_1255 = null;
		aClass10_1252 = null;
		aClass10_1250 = null;
		aClass10_1251 = null;
		aClass10_1249 = null;
		aClass10_1256 = null;
		aClass10_1254 = null;
	}
}
