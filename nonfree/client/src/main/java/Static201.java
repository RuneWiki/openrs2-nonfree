import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!gp", name = "g", descriptor = "Lclient!fia;")
	public static Class45 aClass45_12;

	@OriginalMember(owner = "client!gp", name = "h", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_95 = new Class251(24, 2);

	@OriginalMember(owner = "client!gp", name = "o", descriptor = "I")
	public static int anInt3493 = 0;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;II)V")
	public static void method3011(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3) {
		Static114.method1815(arg3, true, arg2, arg0, -1, arg1);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(I[FI)[F")
	public static float[] method3012(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1) {
		@Pc(6) float[] local6 = new float[arg0];
		Static691.method88(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IFFFFFFI)F")
	public static float method3014(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(7) float local7 = 0.0F;
		@Pc(12) float local12 = arg4 - arg2;
		@Pc(17) float local17 = arg6 - arg5;
		@Pc(21) float local21 = arg1 - arg3;
		@Pc(23) float local23 = 0.0F;
		@Pc(25) float local25 = 0.0F;
		@Pc(27) float local27 = 0.0F;
		while (local7 < 1.1F) {
			@Pc(45) float local45 = local7 * local12 + arg2;
			@Pc(51) float local51 = arg5 + local17 * local7;
			@Pc(57) float local57 = local7 * local21 + arg3;
			@Pc(62) int local62 = (int) local45 >> 9;
			@Pc(67) int local67 = (int) local57 >> 9;
			if (local62 > 0 && local67 > 0 && Static380.anInt6689 > local62 && Static542.anInt9214 > local67) {
				@Pc(94) int local94 = Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aByte146;
				if (local94 < 3 && (Static446.aByteArrayArrayArray12[1][local62][local67] & 0x2) != 0) {
					local94++;
				}
				@Pc(127) int local127 = Static445.aClass159Array3[local94].method8209((int) local45, (int) local57);
				if (local51 > (float) local127) {
					if (arg0 < 2) {
						return local7;
					}
					return local7 + method3014(arg0 + -1, local57, local23, local27, local45, local25, local51) * 0.1F - 0.1F;
				}
			}
			local23 = local45;
			local27 = local57;
			local25 = local51;
			local7 += 0.1F;
		}
		return -1.0F;
	}
}
