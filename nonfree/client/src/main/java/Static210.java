import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static210 {

	@OriginalMember(owner = "client!kl", name = "V", descriptor = "[Lclient!cr;")
	public static Class41[] aClass41Array2;

	@OriginalMember(owner = "client!kl", name = "z", descriptor = "[F")
	public static final float[] aFloatArray24 = new float[16];

	@OriginalMember(owner = "client!kl", name = "F", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_92 = new Class81(23, -2);

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method3242(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		Static1.method1(arg0, arg3, arg1, arg5, arg4, 0, arg2);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIII)V")
	public static void method3243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static72.anIntArrayArray29 != null) {
			Static72.anIntArrayArray29[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static280.aByteArrayArray15 != null) {
			Static280.aByteArrayArray15[arg0][arg1] = (byte) (arg3 >> 3);
		}
		if (Static87.aByteArrayArray6 != null) {
			Static87.aByteArrayArray6[arg0][arg1] = (byte) arg4;
		}
	}

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "(B)V")
	public static void method3244() {
		client.lb = null;
		Static292.anInt5291 = -1;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IZ)Z")
	public static boolean method3247(@OriginalArg(0) int arg0) {
		if (arg0 == 16 || arg0 == 10 || arg0 == 20 || arg0 == 22 || arg0 == 2) {
			return true;
		} else {
			return arg0 == 51 || arg0 == 1009;
		}
	}
}
