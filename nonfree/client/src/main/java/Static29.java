import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
	public static int anInt1007;

	@OriginalMember(owner = "client!ee", name = "u", descriptor = "Lclient!eb;")
	public static Class16_Sub1 aClass16_Sub1_4;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "[Lclient!he;")
	public static Class26[] aClass26Array7 = new Class26[500];

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "Lclient!se;")
	public static Class65 aClass65_22 = new Class65();

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "Lclient!he;")
	public static Class26 aClass26_477 = Static6.method100("Wir vermuten)1 dass Ihr Konto gestohlen wurde");

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "Lclient!he;")
	private static Class26 aClass26_478 = Static6.method100("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "Lclient!he;")
	public static Class26 aClass26_479 = aClass26_478;

	@OriginalMember(owner = "client!ee", name = "k", descriptor = "Lclient!he;")
	public static Class26 aClass26_480 = Static6.method100("k");

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "[I")
	public static int[] anIntArray101 = new int[100];

	@OriginalMember(owner = "client!ee", name = "m", descriptor = "Lclient!he;")
	public static Class26 aClass26_481 = Static6.method100("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
	public static int anInt1008 = 0;

	@OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
	public static int anInt1009 = 127;

	@OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
	public static int anInt1010 = -1;

	@OriginalMember(owner = "client!ee", name = "q", descriptor = "Lclient!he;")
	public static Class26 aClass26_482 = Static6.method100(":tradereq:");

	@OriginalMember(owner = "client!ee", name = "v", descriptor = "[J")
	public static long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!ee", name = "w", descriptor = "Lclient!he;")
	public static Class26 aClass26_483 = Static6.method100("<)4col> x");

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
	public static void method605() {
		aClass26_478 = null;
		aClass26Array7 = null;
		aClass16_Sub1_4 = null;
		aClass26_481 = null;
		aLongArray3 = null;
		aClass26_482 = null;
		aClass26_480 = null;
		aClass26_477 = null;
		aClass65_22 = null;
		aClass26_483 = null;
		aClass26_479 = null;
		anIntArray101 = null;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IBII)I")
	public static int method607(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg2 & 0x3;
		if (local12 == 0) {
			return arg0;
		} else if (local12 == 1) {
			return arg1;
		} else if (local12 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/Class;")
	public static Class method608(@OriginalArg(1) String arg0) throws ClassNotFoundException {
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
