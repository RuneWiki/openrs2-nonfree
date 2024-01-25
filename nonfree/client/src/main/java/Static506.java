import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static506 {

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "I")
	public static int anInt8625 = 0;

	@OriginalMember(owner = "client!qaa", name = "b", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_85 = new Class286(25, 12);

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method7239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg0 + arg4;
		@Pc(12) int local12 = arg2 + arg1;
		@Pc(22) int local22 = arg3 + arg5;
		if (!Static264.method3689(local8, local12, local22, arg0, arg3, arg0, local12, local12, local22)) {
			return false;
		} else if (Static264.method3689(local8, local12, arg3, arg0, arg3, local8, local12, local12, local22)) {
			if (arg0 < Static148.anInt2796) {
				if (!Static264.method3689(arg0, arg1, arg3, arg0, local22, arg0, local12, local12, local22)) {
					return false;
				}
				if (!Static264.method3689(arg0, arg1, arg3, arg0, local22, arg0, arg1, local12, arg3)) {
					return false;
				}
			} else if (!Static264.method3689(local8, arg1, arg3, local8, local22, local8, local12, local12, local22)) {
				return false;
			} else if (!Static264.method3689(local8, arg1, arg3, local8, local22, local8, arg1, local12, arg3)) {
				return false;
			}
			if (Static355.anInt6022 > arg3) {
				if (!Static264.method3689(local8, arg1, arg3, arg0, arg3, arg0, local12, local12, arg3)) {
					return false;
				}
				if (!Static264.method3689(local8, arg1, arg3, arg0, arg3, local8, arg1, local12, arg3)) {
					return false;
				}
			} else if (!Static264.method3689(local8, arg1, local22, arg0, local22, arg0, local12, local12, local22)) {
				return false;
			} else if (!Static264.method3689(local8, arg1, local22, arg0, local22, local8, arg1, local12, local22)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(III)Z")
	public static boolean method7242(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static1.method7205(arg0, arg1) & Static390.method5896(arg0, arg1);
	}
}
