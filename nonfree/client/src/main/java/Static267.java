import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static267 {

	@OriginalMember(owner = "client!jm", name = "o", descriptor = "Lclient!rf;")
	public static Class303 aClass303_1;

	@OriginalMember(owner = "client!jm", name = "u", descriptor = "[[I")
	public static int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "Z")
	public static volatile boolean aBoolean362 = true;

	@OriginalMember(owner = "client!jm", name = "t", descriptor = "I")
	public static int anInt4433 = 0;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIB)V")
	public static void method4042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < arg2) {
			Static260.method3979(arg3, arg1, anIntArrayArray20[arg0], arg2);
		} else {
			Static260.method3979(arg3, arg2, anIntArrayArray20[arg0], arg1);
		}
	}
}
