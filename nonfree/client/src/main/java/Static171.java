import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!l", name = "e", descriptor = "[[I")
	public static int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!l", name = "b", descriptor = "I")
	public static int anInt3577 = 0;

	@OriginalMember(owner = "client!l", name = "f", descriptor = "I")
	public static volatile int anInt3580 = 0;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BI)Z")
	public static boolean method3408(@OriginalArg(1) int arg0) {
		if (arg0 == 33 || arg0 == 50 || arg0 == 49 || arg0 == 28 || arg0 == 1) {
			return true;
		} else {
			return arg0 == 16 || arg0 == 31 || arg0 == 1010;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IB)V")
	public static void method3410(@OriginalArg(0) int arg0) {
		if (arg0 == Static312.anInt6516) {
			return;
		}
		Static48.anInt1107 = Static337.anInt6402 = Static187.anIntArray461[arg0];
		Static34.aClass2_6.method3280(50, (int) ((double) Static48.anInt1107 * 34.46D));
		Static21.anIntArrayArrayArray1 = new int[4][Static48.anInt1107 >> 3][Static337.anInt6402 >> 3];
		Static172.anIntArrayArray60 = new int[Static48.anInt1107][Static337.anInt6402];
		anIntArrayArray35 = new int[Static48.anInt1107][Static337.anInt6402];
		for (@Pc(46) int local46 = 0; local46 < 4; local46++) {
			Static24.aClass91Array1[local46] = Static249.method4440(Static48.anInt1107, Static337.anInt6402);
		}
		Static186.aByteArrayArrayArray8 = new byte[4][Static48.anInt1107][Static337.anInt6402];
		Static159.method2992(Static48.anInt1107, Static337.anInt6402);
		Static317.method5334(Static337.anInt6402 >> 3, Static48.anInt1107 >> 3, Static34.aClass2_6);
		Static312.anInt6516 = arg0;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIII)V")
	public static void method3411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class204 local7 = Static138.aClass204ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class5_Sub4 local13 = local7.aClass5_Sub4_2;
		@Pc(16) Class5_Sub4 local16 = local7.aClass5_Sub4_1;
		if (local13 != null) {
			local13.anInt3174 = local13.anInt3174 * arg3 / 16;
			local13.anInt3173 = local13.anInt3173 * arg3 / 16;
		}
		if (local16 != null) {
			local16.anInt3174 = local16.anInt3174 * arg3 / 16;
			local16.anInt3173 = local16.anInt3173 * arg3 / 16;
		}
	}
}
