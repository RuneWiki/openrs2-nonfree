import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static42 {

	@OriginalMember(owner = "client!bm", name = "g", descriptor = "I")
	public static int anInt1012;

	@OriginalMember(owner = "client!bm", name = "r", descriptor = "I")
	public static int anInt1021;

	@OriginalMember(owner = "client!bm", name = "t", descriptor = "[I")
	public static int[] anIntArray47 = new int[2];

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IBIIIIII)V")
	public static void method1043(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 >= Static13.anInt7634 && Static461.anInt7899 >= arg4 && arg6 >= Static583.anInt9478 && arg2 <= Static415.anInt9494) {
			Static441.method6273(arg1, arg5, arg3, arg2, arg0, arg4, arg6);
		} else {
			Static414.method5970(arg5, arg6, arg1, arg2, arg0, arg3, arg4);
		}
	}
}
