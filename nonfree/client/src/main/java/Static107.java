import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!s", name = "h", descriptor = "I")
	public static int anInt2488;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1184 = Static78.method1313("Freie Welt");

	@OriginalMember(owner = "client!s", name = "c", descriptor = "I")
	public static int anInt2487 = 0;

	@OriginalMember(owner = "client!s", name = "k", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1189 = Static78.method1313("Welcome to RuneScape");

	@OriginalMember(owner = "client!s", name = "d", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1185 = aClass25_1189;

	@OriginalMember(owner = "client!s", name = "f", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1187 = Static78.method1313("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!s", name = "e", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1186 = aClass25_1187;

	@OriginalMember(owner = "client!s", name = "g", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1188 = Static78.method1313("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!s", name = "l", descriptor = "[J")
	public static long[] aLongArray4 = new long[32];

	@OriginalMember(owner = "client!s", name = "n", descriptor = "Z")
	public static final boolean aBoolean112 = false;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ZI)Lclient!fc;")
	public static Class25 method1730() {
		@Pc(7) Class25 local7 = new Class25();
		local7.aByteArray15 = new byte[100];
		local7.anInt956 = 0;
		return local7;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ZLclient!oc;)V")
	public static void method1731(@OriginalArg(1) Class56 arg0) {
		Static110.aClass56_77 = arg0;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
	public static void method1732() {
		aLongArray4 = null;
		aClass25_1186 = null;
		aClass25_1188 = null;
		aClass25_1187 = null;
		aClass25_1189 = null;
		aClass25_1185 = null;
		aClass25_1184 = null;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIII)V")
	public static void method1733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 < 128 || arg2 < 128 || arg0 > 13056 || arg2 > 13056) {
			Static12.anInt333 = -1;
			Static53.anInt2569 = -1;
			return;
		}
		@Pc(35) int local35 = Static129.method2048(arg2, Static21.anInt596, arg0) - arg1;
		@Pc(39) int local39 = arg0 - Static75.anInt1566;
		@Pc(43) int local43 = arg2 - Static67.anInt1471;
		@Pc(47) int local47 = local35 - Static90.anInt2026;
		@Pc(51) int local51 = Class1_Sub2_Sub2_Sub2.anIntArray189[Static35.anInt1003];
		@Pc(55) int local55 = Class1_Sub2_Sub2_Sub2.anIntArray185[Static35.anInt1003];
		@Pc(59) int local59 = Class1_Sub2_Sub2_Sub2.anIntArray189[Static106.anInt2477];
		@Pc(63) int local63 = Class1_Sub2_Sub2_Sub2.anIntArray185[Static106.anInt2477];
		@Pc(73) int local73 = local63 * local39 + local59 * local43 >> 16;
		@Pc(84) int local84 = local63 * local43 - local59 * local39 >> 16;
		@Pc(86) int local86 = local73;
		@Pc(97) int local97 = local55 * local47 - local84 * local51 >> 16;
		@Pc(107) int local107 = local55 * local84 + local47 * local51 >> 16;
		if (local107 < 50) {
			Static12.anInt333 = -1;
			Static53.anInt2569 = -1;
		} else {
			Static12.anInt333 = (local86 << 9) / local107 + 256;
			Static53.anInt2569 = (local97 << 9) / local107 + 167;
		}
	}
}
