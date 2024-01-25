import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static267 {

	@OriginalMember(owner = "client!qr", name = "C", descriptor = "I")
	public static int anInt5127;

	@OriginalMember(owner = "client!qr", name = "S", descriptor = "[[I")
	public static int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!qr", name = "w", descriptor = "I")
	public static int anInt5121 = 0;

	@OriginalMember(owner = "client!qr", name = "Y", descriptor = "Z")
	public static boolean aBoolean391 = true;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIIIBI)V")
	public static void method4543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == arg0) {
			Static278.method4727(arg1, arg3, arg4, arg2);
		} else if (arg4 - arg1 >= Static184.anInt6250 && arg1 + arg4 <= Static80.anInt4809 && arg2 - arg0 >= Static314.anInt6018 && Static334.anInt6315 >= arg0 + arg2) {
			Static35.method848(arg0, arg3, arg4, arg2, arg1);
		} else {
			Static230.method3962(arg4, arg3, arg0, arg1, arg2);
		}
	}
}
