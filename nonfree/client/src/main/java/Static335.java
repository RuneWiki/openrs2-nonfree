import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static335 {

	@OriginalMember(owner = "client!qf", name = "p", descriptor = "Lclient!ht;")
	public static Class112 aClass112_9;

	@OriginalMember(owner = "client!qf", name = "q", descriptor = "Lclient!fw;")
	public static Class89 aClass89_1;

	@OriginalMember(owner = "client!qf", name = "r", descriptor = "Lclient!za;")
	public static Class117 aClass117_6;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V")
	public static void method4397() {
		Static464.method5361(Static126.aClass19_Sub1_1.aBoolean380);
		Static170.aClass1_Sub9_Sub3_1 = new Class1_Sub9_Sub3();
		Static170.aClass1_Sub9_Sub3_1.method4650();
		Static114.aClass101_1 = Static154.method1924(Static259.aClass177_2, 22050, Static91.aCanvas2, 0);
		Static114.aClass101_1.method4846(Static170.aClass1_Sub9_Sub3_1);
		Static136.method1740(Static170.aClass1_Sub9_Sub3_1, Static317.aClass185_84, Static429.aClass185_114, Static84.aClass185_26);
		Static457.aClass101_2 = Static154.method1924(Static259.aClass177_2, 2048, Static91.aCanvas2, 1);
		Static123.aClass1_Sub9_Sub1_1 = new Class1_Sub9_Sub1();
		Static457.aClass101_2.method4846(Static123.aClass1_Sub9_Sub1_1);
		Static14.aClass35_1 = new Class35(22050, Static234.anInt4244);
		Static91.anInt1224 = Static355.aClass185_89.method4005("scape main");
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIII)V")
	public static void method4398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 >= Static281.anInt4757 && Static457.anInt7264 >= arg2 && arg1 >= Static142.anInt2163 && Static182.anInt3402 >= arg3) {
			if (arg4 == 1) {
				Static234.method3347(arg3, arg0, arg1, arg5, arg2);
			} else {
				Static271.method3869(arg4, arg3, arg5, arg2, arg1, arg0);
			}
		} else if (arg4 == 1) {
			Static221.method3182(arg0, arg1, arg5, arg2, arg3);
		} else {
			Static4.method43(arg2, arg5, arg0, arg3, arg1, arg4);
		}
	}
}
