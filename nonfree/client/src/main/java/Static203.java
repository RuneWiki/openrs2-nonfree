import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static203 {

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIB)V")
	public static void method4070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < arg3) {
			Static280.method5108(arg3, Static208.anIntArrayArray20[arg2], arg0, arg1);
		} else {
			Static280.method5108(arg0, Static208.anIntArrayArray20[arg2], arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B[[I)V")
	public static void method4071(@OriginalArg(1) int[][] arg0) {
		Static208.anIntArrayArray20 = arg0;
	}
}
