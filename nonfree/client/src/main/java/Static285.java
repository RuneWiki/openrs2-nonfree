import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static285 {

	@OriginalMember(owner = "client!lh", name = "j", descriptor = "Lclient!pq;")
	public static Class251 aClass251_84;

	@OriginalMember(owner = "client!lh", name = "l", descriptor = "[Lclient!d;")
	public static Class60[] aClass60Array8;

	@OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
	public static int anInt4695;

	@OriginalMember(owner = "client!lh", name = "n", descriptor = "Lclient!eo;")
	public static Class89 aClass89_1;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(BLclient!vu;)V")
	public static void method4043(@OriginalArg(1) Class102_Sub8 arg0) {
		arg0.aClass29_Sub2_Sub1_1 = null;
		if (Static559.anInt9370 < 20) {
			Static89.aClass249_2.method5809(arg0);
			Static559.anInt9370++;
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZIZ)V")
	public static void method4044(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			Static431.anInt7551++;
			Static448.method6429();
		}
		if (arg0) {
			Static566.anInt9481++;
			Static440.method6322();
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4046(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static235.anInt3970 <= arg0 && arg6 <= Static151.anInt2683 && Static134.anInt2364 <= arg1 && Static60.anInt971 >= arg4) {
			Static220.method3225(arg1, arg2, arg4, arg5, arg3, arg6, arg0);
		} else {
			Static154.method2271(arg5, arg4, arg6, arg0, arg1, arg2, arg3);
		}
	}
}
