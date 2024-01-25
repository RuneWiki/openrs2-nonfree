import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!aq", name = "x", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray1 = new String[200];

	@OriginalMember(owner = "client!aq", name = "D", descriptor = "[I")
	public static final int[] anIntArray20 = new int[3];

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "(II)V")
	public static void method388(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub7_Sub18 local8 = Static543.method7218(5, arg0);
		local8.method7329();
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIIII)V")
	public static void method389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static469.anInt4270 <= arg3 && Static325.anInt5516 >= arg4 && Static395.anInt6904 <= arg0 && Static561.anInt2703 >= arg2) {
			if (arg1 == 1) {
				Static110.method1922(arg0, arg2, arg3, arg4, arg5);
			} else {
				Static296.method4391(arg1, arg4, arg5, arg0, arg3, arg2);
			}
		} else if (arg1 == 1) {
			Static24.method431(arg0, arg4, arg2, arg5, arg3);
		} else {
			Static240.method3729(arg4, arg3, arg0, arg1, arg2, arg5);
		}
	}
}
