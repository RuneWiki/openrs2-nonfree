import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!fc", name = "Ng", descriptor = "I")
	public static int anInt3290;

	@OriginalMember(owner = "client!fc", name = "Gh", descriptor = "I")
	public static int anInt3335;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIILclient!mg;II)Z")
	public static boolean method3140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class232 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (!Static351.aBoolean516 || !Static175.aBoolean283) {
			return false;
		} else if (Static22.anInt390 < 100) {
			return false;
		} else if (arg4 != arg1 || arg0 != arg5) {
			for (@Pc(48) int local48 = arg4; local48 <= arg1; local48++) {
				for (@Pc(52) int local52 = arg0; local52 <= arg5; local52++) {
					if (-Static314.anInt5668 == Static414.anIntArrayArrayArray13[arg2][local48][local52]) {
						return false;
					}
				}
			}
			if (Static286.method4774(arg3)) {
				Static640.anInt11082++;
				return true;
			} else {
				return false;
			}
		} else if (!Static328.method5423(arg0, arg4, arg2)) {
			return false;
		} else if (Static286.method4774(arg3)) {
			Static640.anInt11082++;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIBIII)V")
	public static void method3145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		Static612.aClass348Array4[Static594.anInt10306++] = new Class348(4, arg4, arg5, arg1, arg1, arg5, arg6, arg0, arg0, arg6, arg2, arg2, arg3, arg3);
	}
}
