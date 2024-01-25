import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static334 {

	@OriginalMember(owner = "client!qv", name = "c", descriptor = "(I)Z")
	public static boolean method5632() {
		return Static142.anInt2689 == 0 ? Static67.aClass4_Sub18_Sub4_2.method5774() : true;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIIIIIZI)V")
	public static void method5635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 == arg6) {
			Static444.method5719(arg0, arg5, arg1, arg3, arg6, arg4);
		} else if (Static414.anInt7043 <= arg4 - arg6 && arg4 + arg6 <= Static198.anInt3778 && arg1 - arg2 >= Static388.anInt6740 && Static387.anInt6727 >= arg2 + arg1) {
			Static406.method5367(arg1, arg2, arg5, arg6, arg3, arg0, arg4);
		} else {
			Static59.method1174(arg1, arg6, arg4, arg5, arg0, arg3, arg2);
		}
	}
}
