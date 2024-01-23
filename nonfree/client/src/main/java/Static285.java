import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!ug", name = "r", descriptor = "Z")
	public static boolean aBoolean387 = true;

	@OriginalMember(owner = "client!ug", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString179 = "Loaded world list data";

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method4240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = arg4; local12 < arg3; local12++) {
			for (@Pc(21) int local21 = arg2; local21 < arg1; local21++) {
				if (arg0 == Static204.anIntArrayArray29[local12][local21] && Static101.anIntArrayArray10[local12][local21] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIII)V")
	public static void method4245(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg1) {
			Static109.method1795(arg1, Static51.anIntArrayArray1[arg2], arg3, arg0);
		} else {
			Static109.method1795(arg3, Static51.anIntArrayArray1[arg2], arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "(I)[F")
	public static float[] method4250() {
		@Pc(7) float local7 = Static96.method1389() + Static96.method1394();
		@Pc(9) int local9 = Static96.method1398();
		@Pc(18) float local18 = (float) (local9 >> 16 & 0xFF) / 255.0F;
		Static9.aFloatArray19[3] = 1;
		@Pc(32) float local32 = (float) (local9 >> 8 & 0xFF) / 255.0F;
		@Pc(34) float local34 = 0.58823526F;
		Static9.aFloatArray19[1] = local7 * Static246.aFloatArray28[1] * local32 * local34;
		@Pc(53) float local53 = (float) (local9 & 0xFF) / 255.0F;
		Static9.aFloatArray19[2] = local34 * local53 * Static246.aFloatArray28[2] * local7;
		Static9.aFloatArray19[0] = local7 * local34 * local18 * Static246.aFloatArray28[0];
		return Static9.aFloatArray19;
	}
}
