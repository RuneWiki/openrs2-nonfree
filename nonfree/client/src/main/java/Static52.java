import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static52 {

	@OriginalMember(owner = "client!gb", name = "S", descriptor = "Lclient!sg;")
	public static Class77 aClass77_561 = Static146.method2172(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!gb", name = "X", descriptor = "I")
	public static int anInt1417 = 1;

	@OriginalMember(owner = "client!gb", name = "ab", descriptor = "Lclient!sg;")
	public static Class77 aClass77_562 = Static146.method2172("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!gb", name = "db", descriptor = "[Lclient!sg;")
	public static Class77[] aClass77Array9 = new Class77[1000];

	@OriginalMember(owner = "client!gb", name = "eb", descriptor = "Lclient!sg;")
	private static Class77 aClass77_563 = Static146.method2172("Too many incorrect logins from your address)3");

	@OriginalMember(owner = "client!gb", name = "jb", descriptor = "[I")
	public static int[] anIntArray222 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!gb", name = "lb", descriptor = "[I")
	public static int[] anIntArray224 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!gb", name = "nb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_564 = aClass77_563;

	@OriginalMember(owner = "client!gb", name = "ob", descriptor = "Lclient!sg;")
	public static Class77 aClass77_565 = Static146.method2172("welle:");

	@OriginalMember(owner = "client!gb", name = "qb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_566 = Static146.method2172("headicons_hint");

	@OriginalMember(owner = "client!gb", name = "rb", descriptor = "I")
	public static int anInt1424 = -1;

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "(I)V")
	public static void method986() {
		aClass77_565 = null;
		anIntArray224 = null;
		aClass77_562 = null;
		aClass77Array9 = null;
		aClass77_561 = null;
		aClass77_564 = null;
		aClass77_566 = null;
		anIntArray222 = null;
		aClass77_563 = null;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method987(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}
}
