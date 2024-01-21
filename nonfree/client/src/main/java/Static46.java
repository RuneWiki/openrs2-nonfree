import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
	public static int anInt1243;

	@OriginalMember(owner = "client!ie", name = "B", descriptor = "[I")
	public static int[] anIntArray179;

	@OriginalMember(owner = "client!ie", name = "C", descriptor = "I")
	public static int anInt1260;

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "Lclient!ke;")
	public static Class39 aClass39_567 = Static2.method66("@gr3@");

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
	public static int anInt1246 = 0;

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "Lclient!ke;")
	private static Class39 aClass39_569 = Static2.method66("To");

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "Lclient!ke;")
	public static Class39 aClass39_568 = aClass39_569;

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
	public static int anInt1247 = -1;

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "[I")
	public static int[] anIntArray178 = new int[25];

	@OriginalMember(owner = "client!ie", name = "F", descriptor = "Lclient!ke;")
	private static Class39 aClass39_574 = Static2.method66("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!ie", name = "l", descriptor = "Lclient!ke;")
	public static Class39 aClass39_570 = aClass39_574;

	@OriginalMember(owner = "client!ie", name = "z", descriptor = "Lclient!ke;")
	private static Class39 aClass39_573 = Static2.method66("Your friendlist is full)3 Max of 100 for free users)1 and 200 for members");

	@OriginalMember(owner = "client!ie", name = "n", descriptor = "Lclient!ke;")
	public static Class39 aClass39_571 = aClass39_573;

	@OriginalMember(owner = "client!ie", name = "r", descriptor = "Lclient!ke;")
	public static Class39 aClass39_572 = Static2.method66("Benutzen");

	@OriginalMember(owner = "client!ie", name = "u", descriptor = "Z")
	public static boolean aBoolean67 = false;

	@OriginalMember(owner = "client!ie", name = "w", descriptor = "I")
	public static int anInt1256 = 0;

	@OriginalMember(owner = "client!ie", name = "G", descriptor = "Lclient!ke;")
	public static Class39 aClass39_575 = Static2.method66("@cr1@");

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)V")
	public static void method867() {
		aClass39_568 = null;
		aClass39_575 = null;
		aClass39_573 = null;
		anIntArray179 = null;
		aClass39_567 = null;
		aClass39_569 = null;
		aClass39_570 = null;
		aClass39_574 = null;
		anIntArray178 = null;
		aClass39_571 = null;
		aClass39_572 = null;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!jd;BLclient!jd;)I")
	public static int method868(@OriginalArg(0) Class36 arg0, @OriginalArg(2) Class36 arg1) {
		@Pc(5) int local5 = 0;
		if (arg0.method1769(Static22.aClass39_295, Static40.aClass39_510)) {
			local5++;
		}
		if (arg1.method1769(Static22.aClass39_295, Static27.aClass39_372)) {
			local5++;
		}
		if (arg1.method1769(Static22.aClass39_295, Static101.aClass39_1255)) {
			local5++;
		}
		if (arg1.method1769(Static22.aClass39_295, Static6.aClass39_1305)) {
			local5++;
		}
		if (arg1.method1769(Static22.aClass39_295, Static35.aClass39_1310)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZIZZI)Lclient!ta;")
	public static Class36_Sub1 method870(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class42 local10 = null;
		if (Static76.aClass53_6 != null) {
			local10 = new Class42(arg3, Static76.aClass53_6, Static7.aClass53Array1[arg3], 1000000);
		}
		return new Class36_Sub1(local10, Static80.aClass42_2, arg3, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIII)V")
	public static void method874(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static40.aClass2_Sub1_Sub4_Sub3Array2[0].method1946(arg3, arg2);
		@Pc(27) int local27 = arg4 * (arg4 - 32) / arg1;
		if (local27 < 8) {
			local27 = 8;
		}
		Static40.aClass2_Sub1_Sub4_Sub3Array2[1].method1946(arg3, arg2 + arg4 - 16);
		Static91.method2013(arg3, arg2 + 16, 16, arg4 - 32, Static63.anInt1851);
		@Pc(67) int local67 = arg0 * (arg4 - local27 - 32) / (arg1 - arg4);
		Static91.method2013(arg3, arg2 + local67 + 16, 16, local27, Static29.anInt837);
		Static91.method2018(arg3, local67 + arg2 + 16, local27, Static40.anInt1178);
		Static91.method2018(arg3 + 1, local67 + arg2 + 16, local27, Static40.anInt1178);
		Static91.method2019(arg3, local67 + arg2 + 16, 16, Static40.anInt1178);
		Static91.method2019(arg3, arg2 + local67 + 17, 16, Static40.anInt1178);
		Static91.method2018(arg3 + 15, local67 + 16 + arg2, local27, Static93.anInt2437);
		Static91.method2018(arg3 + 14, arg2 + 17 - -local67, local27 - 1, Static93.anInt2437);
		Static91.method2019(arg3, local67 + arg2 + local27 + 15, 16, Static93.anInt2437);
		Static91.method2019(arg3 + 1, local27 + (local67 + arg2 - -14), 15, Static93.anInt2437);
	}
}
