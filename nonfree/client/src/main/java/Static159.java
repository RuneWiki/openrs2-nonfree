import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "F")
	public static float aFloat33;

	@OriginalMember(owner = "client!iu", name = "c", descriptor = "[I")
	public static final int[] anIntArray327 = new int[13];

	@OriginalMember(owner = "client!iu", name = "d", descriptor = "I")
	public static int anInt2909 = -1;

	@OriginalMember(owner = "client!iu", name = "e", descriptor = "[I")
	public static final int[] anIntArray328 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(III)Lclient!we;")
	public static Class12_Sub4 method2667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class227 local7 = Static297.aClass227ArrayArrayArray7[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass12_Sub4_2;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lclient!km;BII)V")
	public static void method2668(@OriginalArg(0) Class82 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static362.aClass251ArrayArray1 = new Class251[arg1][arg2];
		Static267.aClass82_6 = arg0;
		if (Static145.anIntArray301 != null) {
			Static321.aClass21_2 = Static153.method2578(Static145.anIntArray301[2], Static145.anIntArray301[4], Static145.anIntArray301[1], Static145.anIntArray301[0], Static145.anIntArray301[3], Static145.anIntArray301[5]);
		}
		Static125.aClass251_2 = new Class251();
		Static71.method1291();
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIIIIZIII)Z")
	public static boolean method2669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 < arg5 + arg7 && arg0 + arg4 > arg5) {
			return arg6 < arg3 + arg2 && arg3 < arg6 + arg1;
		} else {
			return false;
		}
	}
}
