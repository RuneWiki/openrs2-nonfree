import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static22 {

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Z)J")
	public static long method321() {
		return Static190.aClass19_1.method7650();
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IIIII)V")
	public static void method326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 >= arg1) {
			Static437.method5735(arg1, Static238.anIntArrayArray36[arg2], arg0, arg3);
		} else {
			Static437.method5735(arg0, Static238.anIntArrayArray36[arg2], arg1, arg3);
		}
	}
}
