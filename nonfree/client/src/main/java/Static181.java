import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!fm", name = "p", descriptor = "D")
	public static double aDouble17;

	@OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
	public static int anInt3030;

	@OriginalMember(owner = "client!fm", name = "l", descriptor = "Ljava/lang/Thread;")
	public static Thread aThread4;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!it;IIIIII)Z")
	public static boolean method2649(@OriginalArg(0) Class187 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (!Static334.aBoolean436 || !Static11.aBoolean26) {
			return false;
		} else if (Static170.anInt2918 < 100) {
			return false;
		} else if (arg4 != arg2 || arg5 != arg3) {
			for (@Pc(66) int local66 = arg4; local66 <= arg2; local66++) {
				for (@Pc(72) int local72 = arg3; local72 <= arg5; local72++) {
					if (Static613.anIntArrayArrayArray18[arg1][local66][local72] == -Static9.anInt163) {
						return false;
					}
				}
			}
			if (Static381.method5504(arg0)) {
				Static558.anInt8804++;
				return true;
			} else {
				return false;
			}
		} else if (!Static471.method6762(arg4, arg1, arg3)) {
			return false;
		} else if (Static381.method5504(arg0)) {
			Static558.anInt8804++;
			return true;
		} else {
			return false;
		}
	}
}
