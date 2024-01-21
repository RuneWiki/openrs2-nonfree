import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!s", name = "f", descriptor = "Lclient!a;")
	public static Class1_Sub1 aClass1_Sub1_25;

	@OriginalMember(owner = "client!s", name = "b", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1372 = Static120.method1824("Tue");

	@OriginalMember(owner = "client!s", name = "c", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1373 = Static120.method1824("Wed");

	@OriginalMember(owner = "client!s", name = "d", descriptor = "[I")
	public static final int[] anIntArray444 = new int[100];

	@OriginalMember(owner = "client!s", name = "e", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1374 = Static120.method1824("Sun");

	@OriginalMember(owner = "client!s", name = "g", descriptor = "I")
	public static final int anInt3565 = 5063219;

	@OriginalMember(owner = "client!s", name = "h", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1375 = Static120.method1824("Thu");

	@OriginalMember(owner = "client!s", name = "j", descriptor = "[S")
	public static final short[] aShortArray46 = new short[500];

	@OriginalMember(owner = "client!s", name = "n", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1376 = Static120.method1824("Mon");

	@OriginalMember(owner = "client!s", name = "o", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1377 = Static120.method1824("Sat");

	@OriginalMember(owner = "client!s", name = "s", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1378 = Static120.method1824("Einloggen");

	@OriginalMember(owner = "client!s", name = "w", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1379 = Static120.method1824("Fri");

	@OriginalMember(owner = "client!s", name = "t", descriptor = "[Lclient!rd;")
	public static final Class80[] aClass80Array26 = new Class80[] { aClass80_1374, aClass80_1376, aClass80_1372, aClass80_1373, aClass80_1375, aClass80_1379, aClass80_1377 };

	@OriginalMember(owner = "client!s", name = "x", descriptor = "[Lclient!rd;")
	public static final Class80[] aClass80Array27 = new Class80[100];

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IBIIIII)V")
	public static void method2547(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static172.anInt3861 <= arg1 && arg4 <= Static85.anInt1779 && arg0 >= Static34.anInt790 && Static17.anInt440 >= arg5) {
			if (arg2 == 1) {
				Static7.method159(arg0, arg4, arg5, arg3, arg1);
			} else {
				Static75.method1109(arg3, arg2, arg5, arg4, arg1, arg0);
			}
		} else if (arg2 == 1) {
			Static71.method1064(arg3, arg4, arg0, arg1, arg5);
		} else {
			Static164.method2644(arg3, arg1, arg0, arg2, arg5, arg4);
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IBI)I")
	public static int method2548(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class3_Sub7 local15 = (Class3_Sub7) Static6.aClass54_2.method1496((long) arg0);
		if (local15 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local15.anIntArray102.length) {
			return local15.anIntArray102[arg1];
		} else {
			return 0;
		}
	}
}
