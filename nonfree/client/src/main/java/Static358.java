import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static358 {

	@OriginalMember(owner = "client!up", name = "d", descriptor = "I")
	public static int anInt6525;

	@OriginalMember(owner = "client!up", name = "b", descriptor = "[I")
	public static final int[] anIntArray558 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!up", name = "e", descriptor = "Z")
	public static boolean aBoolean467 = false;

	@OriginalMember(owner = "client!up", name = "r", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray42 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(ZZ)Z")
	public static boolean method5630(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IZZIIII)V")
	public static void method5631(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static177.anInt3750 = arg0;
		Static141.anInt3014 = arg3;
		Static311.anInt3023 = arg4;
		Static78.anInt1721 = arg2;
		Static178.anInt3759 = arg5;
		if (arg1 && Static177.anInt3750 >= 100) {
			Static145.anInt5345 = Static141.anInt3014 * 128 + 64;
			Static27.anInt2842 = Static178.anInt3759 * 128 + 64;
			Static266.anInt5034 = Static36.method2335(Static27.anInt2842, Static241.anInt2711, Static145.anInt5345) - Static311.anInt3023;
		}
		Static198.anInt4108 = 2;
	}
}
