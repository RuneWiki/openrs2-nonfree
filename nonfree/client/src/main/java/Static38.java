import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!dg", name = "V", descriptor = "I")
	public static int anInt818;

	@OriginalMember(owner = "client!dg", name = "jb", descriptor = "Z")
	public static boolean aBoolean50;

	@OriginalMember(owner = "client!dg", name = "nb", descriptor = "Lclient!dc;")
	public static Class20 aClass20_287;

	@OriginalMember(owner = "client!dg", name = "ob", descriptor = "I")
	public static int anInt828;

	@OriginalMember(owner = "client!dg", name = "pb", descriptor = "Lclient!dj;")
	public static Class23_Sub1 aClass23_Sub1_4;

	@OriginalMember(owner = "client!dg", name = "rb", descriptor = "I")
	public static int anInt830;

	@OriginalMember(owner = "client!dg", name = "O", descriptor = "Lclient!oa;")
	public static Class75 aClass75_5 = new Class75(32);

	@OriginalMember(owner = "client!dg", name = "Y", descriptor = "Lclient!dc;")
	public static Class20 aClass20_281 = null;

	@OriginalMember(owner = "client!dg", name = "gb", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_283 = Static161.method2452("Please use a different world)3");

	@OriginalMember(owner = "client!dg", name = "ab", descriptor = "Lclient!dc;")
	public static Class20 aClass20_282 = aClass20_283;

	@OriginalMember(owner = "client!dg", name = "cb", descriptor = "I")
	public static int anInt823 = 0;

	@OriginalMember(owner = "client!dg", name = "db", descriptor = "Z")
	public static boolean aBoolean49 = false;

	@OriginalMember(owner = "client!dg", name = "hb", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_284 = Static161.method2452("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!dg", name = "lb", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_285 = Static161.method2452("Weiter");

	@OriginalMember(owner = "client!dg", name = "mb", descriptor = "Lclient!dc;")
	public static Class20 aClass20_286 = aClass20_283;

	@OriginalMember(owner = "client!dg", name = "qb", descriptor = "I")
	public static int anInt829 = 0;

	@OriginalMember(owner = "client!dg", name = "sb", descriptor = "I")
	public static int anInt831 = -1;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!dc;Lclient!wa;Lclient!dc;Z)[Lclient!jc;")
	public static Class47[] method642(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(2) Class20 arg2) {
		@Pc(4) int local4 = arg1.method734(arg0);
		@Pc(14) int local14 = arg1.method737(arg2, local4);
		return Static129.method2007(arg1, local14, local4);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(BIZ)Lclient!dc;")
	public static Class20 method643(@OriginalArg(1) int arg0) {
		return Static157.method2390(true, arg0);
	}

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "(B)V")
	public static void method644() {
		if (Static29.aDouble1 > Static216.aDouble11) {
			Static216.aDouble11 += Static216.aDouble11 / 30.0D;
			if (Static216.aDouble11 > Static29.aDouble1) {
				Static216.aDouble11 = Static29.aDouble1;
			}
			Static117.method1868();
		} else if (Static29.aDouble1 < Static216.aDouble11) {
			Static216.aDouble11 -= Static216.aDouble11 / 30.0D;
			if (Static216.aDouble11 < Static29.aDouble1) {
				Static216.aDouble11 = Static29.aDouble1;
			}
			Static117.method1868();
		}
		if (Static129.anInt2701 == -1 || Static148.anInt3057 == -1) {
			return;
		}
		@Pc(57) int local57 = Static129.anInt2701 - Static212.anInt4113;
		@Pc(62) int local62 = Static148.anInt3057 - Static18.anInt354;
		if (local57 < 2 || local57 > 2) {
			local57 >>= 0x4;
		}
		if (local62 < 2 || local62 > 2) {
			local62 >>= 0x4;
		}
		Static212.anInt4113 += local57;
		if (local57 == 0 && local62 == 0) {
			Static148.anInt3057 = -1;
			Static129.anInt2701 = -1;
		}
		Static18.anInt354 += local62;
		Static117.method1868();
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIIII)V")
	public static void method645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 >= Static27.anInt493 && arg3 <= Static72.anInt1572 && arg5 >= Static173.anInt3464 && arg6 <= Static174.anInt3493) {
			Static217.method3203(arg5, arg4, arg2, arg0, arg1, arg3, arg6);
		} else {
			Static123.method1945(arg4, arg3, arg1, arg6, arg2, arg0, arg5);
		}
	}
}
