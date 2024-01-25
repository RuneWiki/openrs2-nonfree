import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_19 = new Class397(116, 4);

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "Z")
	public static boolean aBoolean96 = false;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZIIIIIII)V")
	public static void method1300(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == arg4) {
			Static610.method6271(arg2, arg0, arg3, arg5, arg1, arg6);
		} else if (arg2 - arg1 >= Static82.anInt1902 && Static77.anInt1737 >= arg2 + arg1 && arg6 - arg4 >= Static549.anInt5294 && arg6 + arg4 <= Static334.anInt5381) {
			Static105.method2100(arg3, arg2, arg6, arg4, arg1, arg0, arg5);
		} else {
			Static604.method7756(arg3, arg2, arg4, arg5, arg6, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "([Lclient!kw;I)V")
	public static void method1301(@OriginalArg(0) Class178[] arg0, @OriginalArg(1) int arg1) {
		Static519.anInt8147 = arg0.length;
		Static218.anIntArray249 = new int[Static519.anInt8147 + 10];
		Static413.aClass178Array13 = new Class178[Static519.anInt8147 + 10];
		Static732.method6316(arg0, 0, Static413.aClass178Array13, 0, Static519.anInt8147);
		for (@Pc(26) int local26 = 0; local26 < Static519.anInt8147; local26++) {
			Static218.anIntArray249[local26] = Static413.aClass178Array13[local26].method7632();
		}
		if (arg1 >= -120) {
			aBoolean96 = false;
		}
		for (@Pc(54) int local54 = Static519.anInt8147; local54 < Static413.aClass178Array13.length; local54++) {
			Static218.anIntArray249[local54] = 12;
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)V")
	public static void method1303() {
		Static231.method3379();
		Static530.aBoolean556 = false;
		Static216.method3227(Static177.anInt3132, Static332.anInt5338, Static284.anInt4357, Static123.anInt2492);
	}
}
