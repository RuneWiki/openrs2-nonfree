import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "Lclient!ed;")
	public static Class1_Sub7 aClass1_Sub7_1;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "Lclient!rf;")
	private static Class70 aClass70_333 = Static49.method1293("K");

	@OriginalMember(owner = "client!client", name = "N", descriptor = "Lclient!rf;")
	public static Class70 aClass70_325 = aClass70_333;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "Lclient!rf;")
	public static Class70 aClass70_326 = Static49.method1293("logo");

	@OriginalMember(owner = "client!client", name = "P", descriptor = "Lclient!rf;")
	public static Class70 aClass70_327 = aClass70_333;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "Lclient!rf;")
	private static Class70 aClass70_330 = Static49.method1293("Loading interfaces )2 ");

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "Lclient!rf;")
	public static Class70 aClass70_328 = aClass70_330;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "Lclient!rf;")
	public static Class70 aClass70_329 = Static49.method1293("leuchten3:");

	@OriginalMember(owner = "client!client", name = "U", descriptor = "Lclient!rf;")
	public static Class70 aClass70_331 = Static49.method1293("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!client", name = "V", descriptor = "[I")
	public static int[] anIntArray98 = new int[50];

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "Lclient!rf;")
	public static Class70 aClass70_332 = Static49.method1293("Bitte geben Sie Ihr Passwort ein)3");

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
	public static int anInt995 = 0;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "[Lclient!rf;")
	public static Class70[] aClass70Array6 = new Class70[500];

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!rf;)I")
	private static int method782(@OriginalArg(1) Class70 arg0) {
		if (Static123.anInt3345 == 1) {
			return 7;
		} else if (arg0.method2891(Static19.aClass70_188)) {
			return 1;
		} else if (arg0.method2891(Static151.aClass70_1363)) {
			return 1;
		} else if (arg0.method2891(Static37.aClass70_418)) {
			return 2;
		} else if (arg0.method2891(Static168.aClass70_722)) {
			return 2;
		} else if (arg0.method2891(Static49.aClass70_528)) {
			return 3;
		} else if (arg0.method2891(Static61.aClass70_605)) {
			return 4;
		} else if (arg0.method2891(Static18.aClass70_175)) {
			return 4;
		} else if (arg0.method2891(Static130.aClass70_1158)) {
			return 5;
		} else if (arg0.method2891(Static68.aClass70_661)) {
			return 6;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	public static void method783() {
		try {
			if (Static181.aClass5_1 == null) {
				Static181.aClass5_1 = new Class5(Static9.aClass32_1, Static160.method3210(new Class70[] { Static4.aClass70_55, Static35.aClass70_630, Static41.aClass70_454 }).method2897());
			} else {
				@Pc(37) byte[] local37 = Static181.aClass5_1.method184();
				if (local37 != null) {
					@Pc(44) Class1_Sub9 local44 = new Class1_Sub9(local37);
					Static151.anInt4019 = local44.method1280();
					Static24.aClass12Array1 = new Class12[Static151.anInt4019];
					for (@Pc(53) int local53 = 0; local53 < Static151.anInt4019; local53++) {
						@Pc(63) Class12 local63 = Static24.aClass12Array1[local53] = new Class12();
						@Pc(67) int local67 = local44.method1280();
						local63.anInt595 = local67 & 0x7FFF;
						local63.aBoolean22 = (local67 & 0x8000) != 0;
						local63.aClass70_209 = local44.method1253();
						local63.anInt598 = local44.method1279();
						local63.anInt599 = local53;
						local63.anInt593 = method782(local63.aClass70_209);
					}
					Static183.method3506(Static124.anIntArray326, Static24.aClass12Array1, Static22.anIntArray35, 0, Static24.aClass12Array1.length - 1);
					Static181.aClass5_1 = null;
					Static89.aBoolean102 = true;
				}
			}
		} catch (@Pc(123) Exception local123) {
			local123.printStackTrace();
			Static181.aClass5_1 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	public static void method785() {
		if (Static172.aClass2_2 != null) {
			Static172.aClass2_2.method1980();
		}
		if (Static110.aClass2_1 != null) {
			Static110.aClass2_1.method1980();
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	public static void method786() {
		aClass70_326 = null;
		aClass70_327 = null;
		aClass70_330 = null;
		aClass70_325 = null;
		aClass70Array6 = null;
		aClass70_333 = null;
		aClass1_Sub7_1 = null;
		aClass70_328 = null;
		aClass70_329 = null;
		aClass70_331 = null;
		aClass70_332 = null;
		anIntArray98 = null;
	}
}
