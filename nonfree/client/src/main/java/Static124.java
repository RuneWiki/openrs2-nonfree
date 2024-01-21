import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static124 {

	@OriginalMember(owner = "client!wc", name = "r", descriptor = "Lclient!nb;")
	public static Class3_Sub1_Sub5_Sub4 aClass3_Sub1_Sub5_Sub4_38;

	@OriginalMember(owner = "client!wc", name = "F", descriptor = "[I")
	public static int[] anIntArray416;

	@OriginalMember(owner = "client!wc", name = "P", descriptor = "[I")
	public static int[] anIntArray417;

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "Lclient!na;")
	public static Class53 aClass53_1439 = Static109.method1737("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!wc", name = "s", descriptor = "Lclient!na;")
	public static Class53 aClass53_1440 = Static109.method1737("rot:");

	@OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
	public static int anInt2871 = 0;

	@OriginalMember(owner = "client!wc", name = "w", descriptor = "Lclient!na;")
	private static Class53 aClass53_1441 = Static109.method1737("Existing User");

	@OriginalMember(owner = "client!wc", name = "y", descriptor = "Lclient!na;")
	private static Class53 aClass53_1442 = Static109.method1737("flash3:");

	@OriginalMember(owner = "client!wc", name = "I", descriptor = "Lclient!na;")
	public static Class53 aClass53_1443 = aClass53_1442;

	@OriginalMember(owner = "client!wc", name = "J", descriptor = "Lclient!na;")
	public static Class53 aClass53_1444 = aClass53_1442;

	@OriginalMember(owner = "client!wc", name = "K", descriptor = "I")
	public static int anInt2880 = 0;

	@OriginalMember(owner = "client!wc", name = "M", descriptor = "Lclient!te;")
	public static Class75 aClass75_80 = new Class75(260);

	@OriginalMember(owner = "client!wc", name = "Q", descriptor = "Lclient!na;")
	public static Class53 aClass53_1445 = Static109.method1737(" )2> @yel@");

	@OriginalMember(owner = "client!wc", name = "X", descriptor = "Lclient!na;")
	private static Class53 aClass53_1448 = Static109.method1737("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!wc", name = "R", descriptor = "Lclient!na;")
	public static Class53 aClass53_1446 = aClass53_1448;

	@OriginalMember(owner = "client!wc", name = "V", descriptor = "Lclient!na;")
	public static Class53 aClass53_1447 = aClass53_1441;

	@OriginalMember(owner = "client!wc", name = "Z", descriptor = "I")
	public static int anInt2886 = 0;

	@OriginalMember(owner = "client!wc", name = "ab", descriptor = "I")
	public static int anInt2887 = -1;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIBI)V")
	public static void method1966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static54.anInt2848 == 0 || arg1 == 0 || Static40.anInt1185 >= 50) {
			return;
		}
		Static5.anIntArray17[Static40.anInt1185] = arg0;
		Static120.anIntArray404[Static40.anInt1185] = arg1;
		Static69.anIntArray225[Static40.anInt1185] = arg2;
		Static51.aClass72Array1[Static40.anInt1185] = null;
		Static98.anIntArray314[Static40.anInt1185] = 0;
		Static40.anInt1185++;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)V")
	public static void method1967() {
		anIntArray417 = null;
		aClass53_1439 = null;
		aClass53_1447 = null;
		aClass53_1441 = null;
		aClass53_1442 = null;
		aClass3_Sub1_Sub5_Sub4_38 = null;
		anIntArray416 = null;
		aClass53_1448 = null;
		aClass53_1440 = null;
		aClass53_1445 = null;
		aClass53_1443 = null;
		aClass53_1444 = null;
		aClass75_80 = null;
		aClass53_1446 = null;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!we;I)V")
	public static void method1969(@OriginalArg(0) Class62 arg0) {
		Static22.aClass62_5 = arg0;
	}
}
