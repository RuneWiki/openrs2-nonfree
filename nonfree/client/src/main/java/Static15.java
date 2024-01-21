import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "[I")
	public static int[] anIntArray32;

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
	public static int anInt339;

	@OriginalMember(owner = "client!cd", name = "l", descriptor = "Z")
	public static boolean aBoolean19;

	@OriginalMember(owner = "client!cd", name = "n", descriptor = "[Z")
	public static boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!cd", name = "r", descriptor = "[I")
	public static int[] anIntArray33;

	@OriginalMember(owner = "client!cd", name = "w", descriptor = "I")
	public static int anInt344;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "Lclient!na;")
	private static Class53 aClass53_127 = Static109.method1737("Your account has been disabled)3");

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "Lclient!na;")
	public static Class53 aClass53_128 = Static109.method1737("scrollbar");

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
	public static int anInt335 = 0;

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "Lclient!na;")
	private static Class53 aClass53_129 = Static109.method1737("Choose Option");

	@OriginalMember(owner = "client!cd", name = "m", descriptor = "Lclient!na;")
	public static Class53 aClass53_130 = aClass53_129;

	@OriginalMember(owner = "client!cd", name = "o", descriptor = "Lclient!na;")
	public static Class53 aClass53_131 = aClass53_127;

	@OriginalMember(owner = "client!cd", name = "p", descriptor = "Lclient!na;")
	public static Class53 aClass53_132 = Static109.method1737("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!cd", name = "q", descriptor = "[Lclient!na;")
	public static Class53[] aClass53Array4 = new Class53[100];

	@OriginalMember(owner = "client!cd", name = "s", descriptor = "Lclient!na;")
	public static Class53 aClass53_133 = Static109.method1737("@gr2@");

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIZ)V")
	public static void method223(@OriginalArg(3) boolean arg0) {
		Static96.anInt1447 = 2;
		Static38.anInt1141 = 22050;
		Static49.aBoolean48 = arg0;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
	public static void method224() {
		aClass53_128 = null;
		aClass53_130 = null;
		aBooleanArray1 = null;
		aClass53_127 = null;
		aClass53_131 = null;
		aClass53_132 = null;
		anIntArray33 = null;
		anIntArray32 = null;
		aClass53_133 = null;
		aClass53_129 = null;
		aClass53Array4 = null;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)Lclient!j;")
	public static Class4 method225() {
		try {
			return (Class4) Class.forName("Class4_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class4_Sub2();
		}
	}
}
