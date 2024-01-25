import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static112 {

	@OriginalMember(owner = "client!ff", name = "k", descriptor = "[Lclient!f;")
	public static Class76[] aClass76Array10;

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
	public static int anInt2294 = -1;

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "Lclient!gj;")
	public static final Class96 aClass96_1 = new Class96();

	@OriginalMember(owner = "client!ff", name = "j", descriptor = "Z")
	public static boolean aBoolean194 = false;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!cr;III)V")
	public static void method1693(@OriginalArg(0) Class41 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static296.anInt5334 = arg1;
		Static34.aClass41_2 = arg0;
		Static141.anInt2705 = arg2;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIBII)V")
	public static void method1694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 >= Static331.anInt5894 && Static351.anInt6176 >= arg4 && Static75.anInt1858 <= arg3 && arg2 <= Static175.anInt3399) {
			Static163.method2593(arg2, arg4, arg3, arg1, arg0);
		} else {
			Static119.method1742(arg2, arg0, arg1, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
	public static void method1695() {
		Static428.aClass52_1.method1345();
		Static304.aClass40_1.method1161();
		if (Static6.aClass170_1 != null) {
			Static6.aClass170_1.method5631(Static118.aCanvas3);
		}
		Static405.aClient1.method1099();
		Static118.aCanvas3.setBackground(Color.black);
		Static111.anInt2289 = -1;
		Static428.aClass52_1 = Static375.method5258(Static118.aCanvas3);
		Static304.aClass40_1 = Static396.method5441(Static118.aCanvas3);
		if (Static6.aClass170_1 != null) {
			Static6.aClass170_1.method5632(Static118.aCanvas3);
		}
	}
}
