import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static59 {

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "Lclient!fe;")
	public static Class26 aClass26_2;

	@OriginalMember(owner = "client!gh", name = "o", descriptor = "Lclient!fa;")
	public static Class23 aClass23_4;

	@OriginalMember(owner = "client!gh", name = "j", descriptor = "Lclient!cd;")
	private static Class10 aClass10_648 = Static51.method932("Loaded wordpack");

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "Lclient!cd;")
	public static Class10 aClass10_646 = aClass10_648;

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "Lclient!cd;")
	private static Class10 aClass10_647 = Static51.method932("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

	@OriginalMember(owner = "client!gh", name = "f", descriptor = "[I")
	public static int[] anIntArray168 = new int[256];

	@OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
	public static int anInt1475 = 0;

	@OriginalMember(owner = "client!gh", name = "h", descriptor = "[Lclient!fh;")
	public static Class27[] aClass27Array1 = new Class27[4];

	@OriginalMember(owner = "client!gh", name = "i", descriptor = "Lclient!cf;")
	public static Class12 aClass12_5 = new Class12();

	@OriginalMember(owner = "client!gh", name = "k", descriptor = "Lclient!cd;")
	public static Class10 aClass10_649 = aClass10_647;

	@OriginalMember(owner = "client!gh", name = "l", descriptor = "[Lclient!cd;")
	public static Class10[] aClass10Array9 = new Class10[1000];

	@OriginalMember(owner = "client!gh", name = "m", descriptor = "Lclient!cd;")
	public static Class10 aClass10_650 = Static51.method932("Benutzername: ");

	@OriginalMember(owner = "client!gh", name = "n", descriptor = "[I")
	public static int[] anIntArray169 = new int[50];

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)Lclient!i;")
	public static Class2_Sub1_Sub7 method1076() {
		if (Static9.aClass2_Sub1_Sub7_1 == null) {
			Static9.aClass2_Sub1_Sub7_1 = new Class2_Sub1_Sub7();
		}
		return Static9.aClass2_Sub1_Sub7_1;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
	public static void method1077() {
		aClass26_2 = null;
		anIntArray169 = null;
		aClass12_5 = null;
		aClass10_650 = null;
		aClass10_648 = null;
		aClass10_647 = null;
		aClass23_4 = null;
		aClass10_646 = null;
		anIntArray168 = null;
		aClass10_649 = null;
		aClass27Array1 = null;
		aClass10Array9 = null;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IZI)Lclient!cd;")
	public static Class10 method1078(@OriginalArg(2) int arg0) {
		return Static138.method2178(arg0, true);
	}
}
