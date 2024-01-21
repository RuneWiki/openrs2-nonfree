import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "Lclient!rc;")
	public static Class2_Sub4_Sub3_Sub3 aClass2_Sub4_Sub3_Sub3_3;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
	public static int anInt2099 = 0;

	@OriginalMember(owner = "client!jf", name = "m", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1237 = Static107.method1838("Examine");

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1233 = aClass28_1237;

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1234 = Static107.method1838("Titelbild geladen)3");

	@OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
	public static int anInt2102 = 0;

	@OriginalMember(owner = "client!jf", name = "k", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1235 = Static107.method1838("Hidden)2use");

	@OriginalMember(owner = "client!jf", name = "l", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1236 = Static107.method1838("mapfunction");

	@OriginalMember(owner = "client!jf", name = "p", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1238 = Static107.method1838("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!jf", name = "r", descriptor = "Z")
	public static boolean aBoolean103 = false;

	@OriginalMember(owner = "client!jf", name = "s", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1239 = Static107.method1838("Untersuchen");

	@OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
	public static int anInt2104 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
	public static void method1471() {
		aClass28_1233 = null;
		aClass28_1236 = null;
		aClass28_1239 = null;
		aClass28_1234 = null;
		aClass2_Sub4_Sub3_Sub3_3 = null;
		aClass28_1235 = null;
		aClass28_1238 = null;
		aClass28_1237 = null;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)Lclient!a;")
	public static Class1 method1473() {
		try {
			return (Class1) Class.forName("Class1_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class1_Sub2();
		}
	}
}
