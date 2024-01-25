import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static40 {

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "[Lclient!aa;")
	public static Class2[] aClass2Array2;

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "I")
	public static int anInt660 = 0;

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IIIIIB)V")
	public static void method640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 == arg1) {
			Static345.method4830(arg3, arg1, arg0, arg2);
		} else if (Static399.anInt2866 <= arg0 - arg1 && arg0 + arg1 <= Static372.anInt6316 && Static316.anInt5349 <= arg3 - arg4 && Static418.anInt7030 >= arg4 + arg3) {
			Static367.method5114(arg2, arg1, arg3, arg4, arg0);
		} else {
			Static440.method5939(arg0, arg2, arg4, arg3, arg1);
		}
	}
}
