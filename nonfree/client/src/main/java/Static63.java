import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static63 {

	@OriginalMember(owner = "client!gb", name = "Y", descriptor = "[I")
	public static int[] anIntArray104;

	@OriginalMember(owner = "client!gb", name = "hb", descriptor = "I")
	public static int anInt1336;

	@OriginalMember(owner = "client!gb", name = "ib", descriptor = "Lclient!oc;")
	public static Class71_Sub1 aClass71_Sub1_5;

	@OriginalMember(owner = "client!gb", name = "T", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_445 = Static151.method2243(" )2> <col=ff9040>");

	@OriginalMember(owner = "client!gb", name = "U", descriptor = "Lclient!be;")
	public static Class12 aClass12_1 = new Class12();

	@OriginalMember(owner = "client!gb", name = "ab", descriptor = "[S")
	public static final short[] aShortArray36 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!gb", name = "db", descriptor = "Z")
	public static boolean aBoolean56 = false;

	@OriginalMember(owner = "client!gb", name = "gb", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_447 = Static151.method2243("Loading fonts )2 ");

	@OriginalMember(owner = "client!gb", name = "fb", descriptor = "Lclient!mb;")
	public static Class62 aClass62_446 = aClass62_447;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIBIII)V")
	public static void method884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == arg1) {
			Static154.method2290(arg0, arg4, arg2, arg1);
		} else if (Static122.anInt2718 <= arg0 - arg1 && arg0 + arg1 <= Static153.anInt3279 && arg2 - arg3 >= Static154.anInt3307 && Static15.anInt353 >= arg3 + arg2) {
			Static89.method1268(arg4, arg2, arg1, arg0, arg3);
		} else {
			Static191.method2740(arg3, arg2, arg1, arg0, arg4);
		}
	}
}
