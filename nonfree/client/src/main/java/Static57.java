import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
	public static int anInt6304;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
	public static int anInt6308;

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "Lclient!th;")
	public static Class168 aClass168_212;

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString451 = "red:";

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
	public static int anInt6309 = 127;

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString452 = "flash1:";

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIILclient!wf;II)V")
	public static void method4769(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class191 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg1 * arg1 + arg2 * arg2;
		if (local10 > arg6) {
			return;
		}
		@Pc(41) int local41 = Math.min(arg4.anInt6088 / 2, arg4.anInt6128 / 2);
		if (local10 <= local41 * local41) {
			Static204.method3254(arg4, arg5, arg1, arg2, arg3, Static181.aClass1_Sub3_Sub13Array9[arg0]);
			return;
		}
		@Pc(72) int local72;
		if (Static106.anInt2378 == 4) {
			local72 = (int) Static62.aFloat16 & 0x7FF;
		} else {
			local72 = (int) Static62.aFloat16 + Static220.anInt4691 & 0x7FF;
		}
		local41 -= 10;
		@Pc(86) int local86 = Class146.anIntArray463[local72];
		@Pc(90) int local90 = Class146.anIntArray461[local72];
		if (Static106.anInt2378 != 4) {
			local86 = local86 * 256 / (Static253.anInt5117 + 256);
			local90 = local90 * 256 / (Static253.anInt5117 + 256);
		}
		@Pc(119) int local119 = arg2 * local90 + local86 * arg1 >> 16;
		@Pc(130) int local130 = arg2 * local86 - local90 * arg1 >> 16;
		@Pc(136) double local136 = Math.atan2((double) local119, (double) local130);
		@Pc(143) int local143 = (int) ((double) local41 * Math.sin(local136));
		@Pc(150) int local150 = (int) (Math.cos(local136) * (double) local41);
		if (Static294.aBoolean367) {
			((Class1_Sub3_Sub13_Sub1) Static23.aClass1_Sub3_Sub13Array2[arg0]).method2668((arg4.anInt6088 / 2 + arg3 + local143) * 16, (arg5 + arg4.anInt6128 / 2 - local150) * 16, (int) (local136 * 10430.378D));
		} else {
			((Class1_Sub3_Sub13_Sub2) Static23.aClass1_Sub3_Sub13Array2[arg0]).method4219(local143 + arg4.anInt6088 / 2 + arg3 - 10, arg5 + -10 - (-(arg4.anInt6128 / 2) - -local150), local136);
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BLclient!th;I)Z")
	public static boolean method4770(@OriginalArg(1) Class168 arg0, @OriginalArg(2) int arg1) {
		@Pc(16) byte[] local16 = arg0.method4062(arg1);
		if (local16 == null) {
			return false;
		} else {
			Static251.method4179(local16);
			return true;
		}
	}
}
