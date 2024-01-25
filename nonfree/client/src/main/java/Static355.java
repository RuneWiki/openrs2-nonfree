import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static355 {

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "I")
	public static int anInt6510;

	@OriginalMember(owner = "client!ru", name = "d", descriptor = "I")
	public static int anInt6511 = 0;

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIIIII)V")
	public static void method5055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static2.aClass148_Sub1_1.anInt3778 != 0 && arg1 != 0 && Static208.anInt3488 < 50 && arg4 != -1) {
			Static147.aClass64Array1[Static208.anInt3488++] = new Class64((byte) 1, arg4, arg1, arg3, arg0, arg2);
		}
	}
}
