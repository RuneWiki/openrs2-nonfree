import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static568 {

	@OriginalMember(owner = "client!vv", name = "p", descriptor = "I")
	public static int anInt8904;

	@OriginalMember(owner = "client!vv", name = "v", descriptor = "[[[Lclient!wg;")
	public static Class360[][][] aClass360ArrayArrayArray22;

	@OriginalMember(owner = "client!vv", name = "k", descriptor = "[I")
	public static final int[] anIntArray548 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!vv", name = "n", descriptor = "[F")
	public static final float[] aFloatArray78 = new float[16];

	@OriginalMember(owner = "client!vv", name = "y", descriptor = "[I")
	public static int[] anIntArray549 = new int[1];

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(BII)V")
	public static void method7207(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static67.method1102(arg0)) {
			Static594.method7978(Static115.aClass160ArrayArray1[arg0], arg1);
		}
	}

	@OriginalMember(owner = "client!vv", name = "e", descriptor = "(I)I")
	public static int method7211() {
		if ((double) Static287.aFloat106 == 3.0D) {
			return 37;
		} else if ((double) Static287.aFloat106 == 4.0D) {
			return 50;
		} else if ((double) Static287.aFloat106 == 6.0D) {
			return 75;
		} else if ((double) Static287.aFloat106 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "(ZI)I")
	public static int method7218(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(IIIIIIB)V")
	public static void method7220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16 = Static57.method966(Static71.anInt1350, Static120.anInt2491, arg0);
		@Pc(22) int local22 = Static57.method966(Static71.anInt1350, Static120.anInt2491, arg2);
		@Pc(28) int local28 = Static57.method966(Static194.anInt3788, Static330.anInt6025, arg1);
		@Pc(34) int local34 = Static57.method966(Static194.anInt3788, Static330.anInt6025, arg4);
		@Pc(42) int local42 = Static57.method966(Static71.anInt1350, Static120.anInt2491, arg0 + arg5);
		@Pc(51) int local51 = Static57.method966(Static71.anInt1350, Static120.anInt2491, arg2 - arg5);
		for (@Pc(53) int local53 = local16; local53 < local42; local53++) {
			Static329.method4871(local28, local34, Static280.anIntArrayArray25[local53], arg3);
		}
		for (@Pc(73) int local73 = local22; local73 > local51; local73--) {
			Static329.method4871(local28, local34, Static280.anIntArrayArray25[local73], arg3);
		}
		@Pc(95) int local95 = Static57.method966(Static194.anInt3788, Static330.anInt6025, arg5 + arg1);
		@Pc(104) int local104 = Static57.method966(Static194.anInt3788, Static330.anInt6025, arg4 - arg5);
		for (@Pc(106) int local106 = local42; local106 <= local51; local106++) {
			@Pc(112) int[] local112 = Static280.anIntArrayArray25[local106];
			Static329.method4871(local28, local95, local112, arg3);
			Static329.method4871(local104, local34, local112, arg3);
		}
	}
}
