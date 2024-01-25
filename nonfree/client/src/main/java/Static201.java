import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static201 {

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "[I")
	public static final int[] anIntArray260 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "Z")
	public static boolean aBoolean285 = true;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZI)V")
	public static void method3632(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static508.method7071(arg0)) {
			Static11.method240(Static14.aClass292ArrayArray1[arg0], arg1);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIII)I")
	public static int method3634(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 >= arg2) {
			return arg0 <= arg1 ? arg0 : arg1;
		} else {
			return arg2;
		}
	}
}
