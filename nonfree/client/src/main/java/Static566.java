import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static566 {

	@OriginalMember(owner = "client!vp", name = "i", descriptor = "I")
	public static int anInt9917 = 0;

	@OriginalMember(owner = "client!vp", name = "k", descriptor = "Lclient!gfa;")
	public static final Class116 aClass116_13 = new Class116(7, 0, 1, 1);

	@OriginalMember(owner = "client!vp", name = "l", descriptor = "I")
	public static int anInt9919 = 0;

	@OriginalMember(owner = "client!vp", name = "m", descriptor = "[I")
	public static int[] anIntArray532 = null;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIIIII)V")
	public static void method8099(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 >= Static486.anInt8866 && Static214.anInt3975 >= arg4 && arg3 >= Static290.anInt5903 && Static530.anInt9437 >= arg2) {
			Static402.method6327(arg2, arg4, arg3, arg1, arg0);
		} else {
			Static500.method7378(arg1, arg3, arg4, arg0, arg2);
		}
	}
}
