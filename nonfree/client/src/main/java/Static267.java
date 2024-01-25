import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static267 {

	@OriginalMember(owner = "client!iv", name = "x", descriptor = "D")
	public static double aDouble15;

	@OriginalMember(owner = "client!iv", name = "B", descriptor = "Lclient!kia;")
	public static Class196 aClass196_1;

	@OriginalMember(owner = "client!iv", name = "F", descriptor = "Lclient!bm;")
	public static Class37 aClass37_3;

	@OriginalMember(owner = "client!iv", name = "w", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_44 = new Class240(77, 3);

	@OriginalMember(owner = "client!iv", name = "C", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_45 = new Class240(81, 3);

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIILclient!ha;IIII)V")
	public static void method3941(@OriginalArg(2) int arg0, @OriginalArg(3) Class95 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		Static565.aClass95_13 = arg1;
		Static457.aClass17_6 = Static565.aClass95_13.method8063();
		Static565.aClass17_8 = Static565.aClass95_13.method8063();
		Static70.aClass17_1 = Static565.aClass95_13.method8063();
		Static491.anInterface10_1 = null;
		Static471.anInt7481 = 1;
		Static521.anInt8234 = 0;
		Static240.anInt4257 = 2;
		Static9.anInt133 = 2;
		Static342.anInt5876 = 0;
		Static141.anInt2656 = arg2;
		Static456.anInt7325 = arg4;
		Static57.method1069(arg0, arg3);
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(BI)Z")
	public static boolean method3942(@OriginalArg(1) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}
}
