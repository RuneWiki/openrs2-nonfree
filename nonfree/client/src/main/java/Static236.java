import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!qn", name = "p", descriptor = "I")
	public static int anInt4291;

	@OriginalMember(owner = "client!qn", name = "k", descriptor = "Lclient!vh;")
	public static Class187 aClass187_119 = new Class187(64);

	@OriginalMember(owner = "client!qn", name = "o", descriptor = "I")
	public static int anInt4290 = 0;

	@OriginalMember(owner = "client!qn", name = "t", descriptor = "[I")
	public static int[] anIntArray367 = new int[2];

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(BI)V")
	public static void method3647() {
		Static183.aClass187_94.method4534(5);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "([[II)V")
	public static void method3648(@OriginalArg(0) int[][] arg0) {
		Static183.anIntArrayArray26 = arg0;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IILclient!hi;IBIII)V")
	public static void method3650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class66 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(17) int local17 = arg1 * arg1 + arg5 * arg5;
		if (local17 > arg6) {
			return;
		}
		@Pc(36) int local36 = Math.min(arg2.anInt2204 / 2, arg2.anInt2207 / 2);
		if (local36 * local36 >= local17) {
			Static17.method244(arg0, arg3, arg2, arg1, Static64.aClass1_Sub2_Sub1Array4[arg4], arg5);
			return;
		}
		local36 -= 10;
		@Pc(53) int local53 = Static189.anInt3613 + (int) Static49.aFloat32 & 0x7FF;
		@Pc(57) int local57 = Class135.anIntArray338[local53];
		@Pc(61) int local61 = Class135.anIntArray335[local53];
		@Pc(69) int local69 = local61 * 256 / (Static309.anInt5618 + 256);
		@Pc(77) int local77 = local57 * 256 / (Static309.anInt5618 + 256);
		@Pc(88) int local88 = arg1 * local77 - local69 * arg5 >> 16;
		@Pc(98) int local98 = arg5 * local77 + local69 * arg1 >> 16;
		@Pc(104) double local104 = Math.atan2((double) local98, (double) local88);
		@Pc(111) int local111 = (int) (Math.sin(local104) * (double) local36);
		@Pc(118) int local118 = (int) (Math.cos(local104) * (double) local36);
		if (Static156.aBoolean211) {
			((Class1_Sub2_Sub1_Sub1) Static41.aClass1_Sub2_Sub1Array3[arg4]).method2606((arg3 + arg2.anInt2204 / 2 + local111) * 16, (arg0 + arg2.anInt2207 / 2 - local118) * 16, (int) (local104 * 10430.378D));
		} else {
			((Class1_Sub2_Sub1_Sub2) Static41.aClass1_Sub2_Sub1Array3[arg4]).method3858(arg3 + arg2.anInt2204 / 2 + local111 - 10, arg2.anInt2207 / 2 + -10 + (arg0 - local118), local104);
		}
	}
}
