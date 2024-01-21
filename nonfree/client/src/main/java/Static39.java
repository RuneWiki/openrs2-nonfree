import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "Lclient!ke;")
	public static Class41_Sub1 aClass41_Sub1_8;

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "Lclient!rd;")
	private static Class64 aClass64_595 = Static69.method1153("To create a new account you need to");

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "Lclient!rd;")
	public static Class64 aClass64_594 = aClass64_595;

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "Lclient!rd;")
	public static Class64 aClass64_596 = Static69.method1153("welle2:");

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
	public static int anInt909 = -1;

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "Lclient!dd;")
	public static Class19 aClass19_35 = new Class19(50);

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
	public static int anInt912 = 0;

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "Lclient!rd;")
	private static Class64 aClass64_598 = Static69.method1153("shake:");

	@OriginalMember(owner = "client!gf", name = "l", descriptor = "Lclient!rd;")
	public static Class64 aClass64_597 = aClass64_598;

	@OriginalMember(owner = "client!gf", name = "s", descriptor = "Lclient!rd;")
	private static Class64 aClass64_602 = Static69.method1153("Loading friend list");

	@OriginalMember(owner = "client!gf", name = "n", descriptor = "Lclient!rd;")
	public static Class64 aClass64_599 = aClass64_602;

	@OriginalMember(owner = "client!gf", name = "o", descriptor = "Lclient!rd;")
	private static Class64 aClass64_600 = Static69.method1153("Classic");

	@OriginalMember(owner = "client!gf", name = "p", descriptor = "Lclient!rd;")
	public static Class64 aClass64_601 = aClass64_600;

	@OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
	public static int anInt914 = 0;

	@OriginalMember(owner = "client!gf", name = "r", descriptor = "I")
	public static int anInt915 = 0;

	@OriginalMember(owner = "client!gf", name = "t", descriptor = "Lclient!rd;")
	private static Class64 aClass64_603 = Static69.method1153("The server is being updated)3");

	@OriginalMember(owner = "client!gf", name = "u", descriptor = "I")
	public static int anInt916 = 0;

	@OriginalMember(owner = "client!gf", name = "v", descriptor = "Lclient!rd;")
	public static Class64 aClass64_604 = aClass64_603;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
	public static void method686() {
		Static54.anInt2055 = -1;
		Static72.anInt1641 = 0;
		Static49.aClass1_Sub6_Sub1_1.anInt2574 = 0;
		Static19.anInt613 = -1;
		Static94.aBoolean132 = false;
		Static48.anInt2603 = 0;
		Static114.anInt2742 = -1;
		Static52.anInt2832 = 0;
		Static66.anInt1526 = 0;
		Static101.anInt2258 = -1;
		Static81.anInt1387 = 0;
		Static62.anInt1454 = 0;
		Static64.aClass1_Sub6_Sub1_2.anInt2574 = 0;
		for (@Pc(43) int local43 = 0; local43 < Static28.aClass1_Sub1_Sub2_Sub1_Sub2Array3.length; local43++) {
			if (Static28.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local43] != null) {
				Static28.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local43].anInt2372 = -1;
			}
		}
		for (@Pc(65) int local65 = 0; local65 < Static101.aClass1_Sub1_Sub2_Sub1_Sub1Array1.length; local65++) {
			if (Static101.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local65] != null) {
				Static101.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local65].anInt2372 = -1;
			}
		}
		Static96.method1999();
		Static10.method258(30);
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)V")
	public static void method687() {
		aClass64_594 = null;
		aClass64_600 = null;
		aClass64_598 = null;
		aClass64_595 = null;
		aClass64_597 = null;
		aClass41_Sub1_8 = null;
		aClass64_601 = null;
		aClass64_599 = null;
		aClass64_596 = null;
		aClass64_603 = null;
		aClass64_604 = null;
		aClass19_35 = null;
		aClass64_602 = null;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/lang/Object;ZB)[B")
	public static byte[] method688(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg0;
			return arg1 ? Static99.method1604(local13) : local13;
		} else if (arg0 instanceof Class11) {
			@Pc(27) Class11 local27 = (Class11) arg0;
			return local27.method1399();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
