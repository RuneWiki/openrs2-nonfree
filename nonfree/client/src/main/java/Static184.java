import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static184 {

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)V")
	public static void method5420(@OriginalArg(1) int arg0) {
		if (Static332.anInt6296 == 0) {
			Static290.aClass5_Sub15_Sub4_1.method6528(arg0);
		} else {
			Static296.anInt5926 = arg0;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "([I[JI)V")
	public static void method5423(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1) {
		Static175.method3051(0, arg1.length - 1, arg0, arg1);
	}
}
