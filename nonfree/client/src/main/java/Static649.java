import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static649 {

	@OriginalMember(owner = "client!vw", name = "t", descriptor = "[Lclient!cn;")
	public static Class73[] aClass73Array3;

	@OriginalMember(owner = "client!vw", name = "o", descriptor = "I")
	public static int anInt5976;

	@OriginalMember(owner = "client!vw", name = "q", descriptor = "I")
	public static int anInt5978;

	@OriginalMember(owner = "client!vw", name = "s", descriptor = "I")
	public static int anInt5979;

	@OriginalMember(owner = "client!vw", name = "n", descriptor = "I")
	public static int anInt5975 = 0;

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method5107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (Static642.anInt10429 <= arg1 && Static456.anInt7806 >= arg4 && arg6 >= Static456.anInt7815 && arg0 <= Static604.anInt10083) {
			Static462.method6755(arg5, arg1, arg4, arg0, arg2, arg6, arg3);
		} else {
			Static408.method6015(arg6, arg0, arg1, arg3, arg5, arg2, arg4);
		}
	}
}
