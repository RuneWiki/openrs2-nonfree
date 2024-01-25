import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!fl", name = "k", descriptor = "Lclient!qw;")
	public static Class302 aClass302_16 = new Class302();

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIBI)Z")
	public static boolean method2755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (!Static355.aBoolean420 || !Static296.aBoolean335) {
			return false;
		} else if (Static304.anInt5127 < 100) {
			return false;
		} else if (Static674.method8987(arg0, arg1, arg3)) {
			@Pc(28) int local28 = arg1 << Static571.anInt9216;
			@Pc(37) int local37 = arg3 << Static571.anInt9216;
			if (Static320.method4599(local37, arg2, Static582.aClass35Array3[arg0].method7461(arg3, arg1), Static599.anInt7773, local28, Static599.anInt7773)) {
				Static512.anInt8073++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
