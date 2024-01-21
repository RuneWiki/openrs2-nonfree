import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static51 {

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "Lclient!pg;")
	public static Class2_Sub23 aClass2_Sub23_3 = new Class2_Sub23(0, 0);

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1144 = Static107.method1838("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!fc", name = "B", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1145 = Static107.method1838("Ausw-=hlen");

	@OriginalMember(owner = "client!fc", name = "D", descriptor = "I")
	public static int anInt1940 = 0;

	@OriginalMember(owner = "client!fc", name = "E", descriptor = "[Lclient!oc;")
	public static Class57[] aClass57Array3 = new Class57[50];

	@OriginalMember(owner = "client!fc", name = "I", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1146 = Static107.method1838("You have only just left another world)3");

	@OriginalMember(owner = "client!fc", name = "O", descriptor = "[Lclient!gg;")
	public static Class28[] aClass28Array25 = new Class28[1000];

	@OriginalMember(owner = "client!fc", name = "P", descriptor = "Z")
	public static boolean aBoolean96 = false;

	@OriginalMember(owner = "client!fc", name = "Q", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1147 = Static107.method1838("Bitte geben Sie Ihren Benutzenamen ein)3");

	@OriginalMember(owner = "client!fc", name = "R", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1148 = aClass28_1146;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BI)V")
	public static void method1337(@OriginalArg(1) int arg0) {
		Static89.anInt2276 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V")
	public static void method1344() {
		aClass28_1148 = null;
		aClass28Array25 = null;
		aClass57Array3 = null;
		aClass28_1147 = null;
		aClass28_1145 = null;
		aClass28_1144 = null;
		aClass28_1146 = null;
		aClass2_Sub23_3 = null;
	}
}
