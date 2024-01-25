import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!tv", name = "f", descriptor = "I")
	public static int anInt6632;

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "[I")
	public static final int[] anIntArray528 = new int[5];

	@OriginalMember(owner = "client!tv", name = "d", descriptor = "[F")
	public static final float[] aFloatArray37 = new float[4];

	@OriginalMember(owner = "client!tv", name = "e", descriptor = "Z")
	public static boolean aBoolean480 = false;

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(BIIIII)V")
	public static void method5344(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg0; local7 <= arg4; local7++) {
			Static236.method3990(arg3, arg2, Static400.anIntArrayArray54[local7], arg1);
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(ZI)I")
	public static int method5347(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}
}
