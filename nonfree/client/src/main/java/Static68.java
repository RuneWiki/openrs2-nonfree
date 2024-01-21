import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
	public static int anInt1942;

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "Lclient!wc;")
	public static Class4 aClass4_44;

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "Lclient!wc;")
	public static Class4 aClass4_45;

	@OriginalMember(owner = "client!nc", name = "u", descriptor = "Lclient!jd;")
	public static Class2_Sub1_Sub2_Sub4 aClass2_Sub1_Sub2_Sub4_4;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "Lclient!a;")
	public static Class1 aClass1_1978 = Static94.method1596(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "Lclient!a;")
	public static Class1 aClass1_1979 = Static94.method1596("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "Lclient!a;")
	private static Class1 aClass1_1980 = Static94.method1596("Ok");

	@OriginalMember(owner = "client!nc", name = "r", descriptor = "Lclient!a;")
	private static Class1 aClass1_1985 = Static94.method1596(" more options");

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "Lclient!a;")
	public static Class1 aClass1_1981 = aClass1_1985;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "Z")
	public static boolean aBoolean105 = false;

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
	public static int anInt1945 = 0;

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "Lclient!a;")
	private static Class1 aClass1_1982 = Static94.method1596(" from your ignore list first");

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "Lclient!a;")
	public static Class1 aClass1_1983 = Static94.method1596("Spiel)2Fenster geladen)3");

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
	public static final int anInt1946 = 20;

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "Lclient!a;")
	public static Class1 aClass1_1984 = Static94.method1596("Stufe)2");

	@OriginalMember(owner = "client!nc", name = "t", descriptor = "Lclient!a;")
	public static Class1 aClass1_1986 = aClass1_1982;

	@OriginalMember(owner = "client!nc", name = "v", descriptor = "Lclient!a;")
	public static Class1 aClass1_1987 = aClass1_1980;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!dc;I)V")
	public static void method1347(@OriginalArg(0) Class2_Sub5 arg0) {
		@Pc(1) int local1 = 0;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (arg0.anInt903 == 0) {
			local1 = Static109.aClass3_1.method154(arg0.anInt897, arg0.anInt914, arg0.anInt913);
		}
		@Pc(23) int local23 = 0;
		if (arg0.anInt903 == 1) {
			local1 = Static109.aClass3_1.method123(arg0.anInt897, arg0.anInt914, arg0.anInt913);
		}
		if (arg0.anInt903 == 2) {
			local1 = Static109.aClass3_1.method142(arg0.anInt897, arg0.anInt914, arg0.anInt913);
		}
		if (arg0.anInt903 == 3) {
			local1 = Static109.aClass3_1.method125(arg0.anInt897, arg0.anInt914, arg0.anInt913);
		}
		if (local1 != 0) {
			@Pc(83) int local83 = Static109.aClass3_1.method173(arg0.anInt897, arg0.anInt914, arg0.anInt913, local1);
			local7 = local1 >> 14 & 0x7FFF;
			local23 = local83 >> 6 & 0x3;
			local9 = local83 & 0x1F;
		}
		arg0.anInt902 = local23;
		arg0.anInt904 = local7;
		arg0.anInt912 = local9;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!lc;BZ)Z")
	public static boolean method1348(@OriginalArg(0) Class34 arg0, @OriginalArg(2) boolean arg1) {
		Static53.anInt1751 = 20;
		try {
			Static8.aClass14_1 = (Class14) Class.forName("Class14_Sub1_Sub1").getDeclaredConstructor().newInstance();
			return true;
		} catch (@Pc(13) Throwable local13) {
			@Pc(17) Interface1 local17 = arg0.method1259();
			if (local17 != null) {
				Static8.aClass14_1 = new Class14_Sub1_Sub2(arg0, local17);
				return true;
			} else if (arg1) {
				Static8.aClass14_1 = new Class14_Sub2(arg0);
				return true;
			} else {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
	public static void method1349() {
		aClass1_1980 = null;
		aClass4_44 = null;
		aClass1_1979 = null;
		aClass1_1986 = null;
		aClass1_1983 = null;
		aClass2_Sub1_Sub2_Sub4_4 = null;
		aClass1_1981 = null;
		aClass1_1987 = null;
		aClass1_1984 = null;
		aClass1_1978 = null;
		aClass4_45 = null;
		aClass1_1982 = null;
		aClass1_1985 = null;
	}
}
