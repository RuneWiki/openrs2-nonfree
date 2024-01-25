import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!ff", name = "j", descriptor = "[Lclient!ui;")
	public static Class333[] aClass333Array1;

	@OriginalMember(owner = "client!ff", name = "x", descriptor = "Lclient!go;")
	public static final Class121 aClass121_3 = new Class121(4, 1, 1, 1);

	@OriginalMember(owner = "client!ff", name = "B", descriptor = "Z")
	public static boolean aBoolean203 = false;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BZ)V")
	public static void method2372(@OriginalArg(1) boolean arg0) {
		if (Static485.aClass43_1 != null) {
			Static485.aClass43_1.method1044();
			Static485.aClass43_1 = null;
		}
		Static517.anInt8881 = 0;
		Static412.method5871();
		Static482.method6676();
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			Static590.aClass240Array1[local19].method5260();
		}
		Static59.method996(false);
		System.gc();
		Static505.method7086();
		Static11.aBoolean8 = false;
		Static106.anInt1789 = -1;
		Static115.method1625();
		Static267.method3889(true);
		Static276.anInt5046 = 0;
		Static339.anInt6245 = 0;
		Static533.anInt8982 = 0;
		Static539.anInt9045 = 0;
		Static518.anInt9329 = 0;
		Static311.anInt5708 = 0;
		for (@Pc(60) int local60 = 0; local60 < Static243.aClass358Array1.length; local60++) {
			Static243.aClass358Array1[local60] = null;
		}
		Static478.method3880();
		for (@Pc(75) int local75 = 0; local75 < 2048; local75++) {
			Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local75] = null;
		}
		Static306.anInt4911 = 0;
		Static372.aClass91_30.method2275();
		Static547.anInt9151 = 0;
		Static365.aClass91_29.method2275();
		Static88.method1393();
		Static218.anInt3983 = 0;
		Static390.aClass353_29.method7621();
		Static390.method7708();
		Static115.method1623();
		Static328.aLong147 = 0L;
		Static169.aClass1_Sub46_1 = null;
		if (arg0) {
			Static318.method4726(12);
			return;
		}
		Static318.method4726(3);
		try {
			Static597.method645(Static433.anApplet2, "loggedout");
		} catch (@Pc(132) Throwable local132) {
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIIII)V")
	public static void method2378(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static315.anInt5766 = arg3;
		Static55.anInt1064 = arg2;
		Static270.anInt4946 = arg4;
		Static39.anInt811 = arg1;
		Static245.anInt4527 = arg5;
		Static262.anInt4773 = arg0;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IBIII)V")
	public static void method2380(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(6) Class1_Sub9 local6 = Static266.method3886();
		local6.aClass1_Sub3_Sub1_1.method7917(Static122.aClass325_7.anInt8863);
		local6.aClass1_Sub3_Sub1_1.method7917(arg3);
		local6.aClass1_Sub3_Sub1_1.method7917(arg0);
		local6.aClass1_Sub3_Sub1_1.method7937(arg2);
		local6.aClass1_Sub3_Sub1_1.method7937(arg1);
		Static42.method746(local6);
		Static429.anInt7684 = 0;
		Static432.anInt7738 = -3;
		Static468.anInt8074 = 1;
		Static198.anInt3805 = 0;
	}
}
