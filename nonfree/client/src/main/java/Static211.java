import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!iba", name = "n", descriptor = "Lclient!pm;")
	public static Class259 aClass259_3;

	@OriginalMember(owner = "client!iba", name = "r", descriptor = "I")
	public static int anInt4153;

	@OriginalMember(owner = "client!iba", name = "t", descriptor = "Lclient!wv;")
	public static Class365 aClass365_8 = null;

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(IILjava/lang/String;II)V")
	public static void method3546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) {
		@Pc(10) Class365 local10 = Static583.method7803(arg0, arg1);
		if (local10 == null) {
			return;
		}
		if (local10.anObjectArray15 != null) {
			@Pc(20) Class1_Sub2 local20 = new Class1_Sub2();
			local20.anInt154 = arg3;
			local20.anObjectArray1 = local10.anObjectArray15;
			local20.aString6 = arg2;
			local20.aClass365_1 = local10;
			Static145.method2353(local20);
		}
		if (Static177.anInt2101 != 10 || !Static72.method1565(local10).method4810(arg3 - 1)) {
			return;
		}
		@Pc(64) Class1_Sub48 local64;
		if (arg3 == 1) {
			local64 = Static320.method4867(Static442.aClass170_2, Static257.aClass319_84);
			Static148.method2388(arg1, arg0, local10.anInt9573, local64);
			Static34.method813(local64);
		}
		if (arg3 == 2) {
			local64 = Static320.method4867(Static442.aClass170_2, Static353.aClass319_112);
			Static148.method2388(arg1, arg0, local10.anInt9573, local64);
			Static34.method813(local64);
		}
		if (arg3 == 3) {
			local64 = Static320.method4867(Static442.aClass170_2, Static476.aClass319_146);
			Static148.method2388(arg1, arg0, local10.anInt9573, local64);
			Static34.method813(local64);
		}
		if (arg3 == 4) {
			local64 = Static320.method4867(Static442.aClass170_2, Static231.aClass319_78);
			Static148.method2388(arg1, arg0, local10.anInt9573, local64);
			Static34.method813(local64);
		}
		if (arg3 == 5) {
			local64 = Static320.method4867(Static442.aClass170_2, Static336.aClass319_108);
			Static148.method2388(arg1, arg0, local10.anInt9573, local64);
			Static34.method813(local64);
		}
		if (arg3 == 6) {
			local64 = Static320.method4867(Static442.aClass170_2, Static330.aClass319_104);
			Static148.method2388(arg1, arg0, local10.anInt9573, local64);
			Static34.method813(local64);
		}
		if (arg3 == 7) {
			local64 = Static320.method4867(Static442.aClass170_2, Static590.aClass319_172);
			Static148.method2388(arg1, arg0, local10.anInt9573, local64);
			Static34.method813(local64);
		}
		if (arg3 == 8) {
			local64 = Static320.method4867(Static442.aClass170_2, Static566.aClass319_164);
			Static148.method2388(arg1, arg0, local10.anInt9573, local64);
			Static34.method813(local64);
		}
		if (arg3 == 9) {
			local64 = Static320.method4867(Static442.aClass170_2, Static452.aClass319_143);
			Static148.method2388(arg1, arg0, local10.anInt9573, local64);
			Static34.method813(local64);
		}
		if (arg3 == 10) {
			local64 = Static320.method4867(Static442.aClass170_2, Static149.aClass319_58);
			Static148.method2388(arg1, arg0, local10.anInt9573, local64);
			Static34.method813(local64);
		}
	}
}
