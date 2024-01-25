import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!qk", name = "g", descriptor = "Lclient!ot;")
	public static Class191 aClass191_5;

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "Z")
	public static boolean aBoolean383 = false;

	@OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
	public static int anInt6090 = -1;

	@OriginalMember(owner = "client!qk", name = "k", descriptor = "[F")
	public static final float[] aFloatArray25 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IF[FIIFIIIIIFI)V")
	public static void method4673(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) float arg10, @OriginalArg(12) int arg11) {
		@Pc(7) int local7 = arg4 - arg0;
		@Pc(11) int local11 = arg8 - arg11;
		@Pc(15) int local15 = arg3 - arg9;
		@Pc(42) float local42 = (float) local11 * arg2[1] + (float) local15 * arg2[0] + arg2[2] * (float) local7;
		@Pc(63) float local63 = (float) local7 * arg2[5] + arg2[4] * (float) local11 + arg2[3] * (float) local15;
		@Pc(84) float local84 = (float) local11 * arg2[7] + (float) local15 * arg2[6] + (float) local7 * arg2[8];
		@Pc(104) float local104;
		@Pc(98) float local98;
		if (arg6 == 0) {
			local104 = local42 + arg10 + 0.5F;
			local98 = arg1 + 0.5F - local84;
		} else if (arg6 == 1) {
			local98 = local84 + arg1 + 0.5F;
			local104 = arg10 + local42 + 0.5F;
		} else if (arg6 == 2) {
			local98 = arg5 + 0.5F - local63;
			local104 = arg10 + 0.5F - local42;
		} else if (arg6 == 3) {
			local98 = arg5 + 0.5F - local63;
			local104 = arg10 + local42 + 0.5F;
		} else if (arg6 == 4) {
			local104 = arg1 + local84 + 0.5F;
			local98 = arg5 + 0.5F - local63;
		} else {
			local104 = arg1 + 0.5F - local84;
			local98 = arg5 + 0.5F - local63;
		}
		@Pc(196) float local196;
		if (arg7 == 1) {
			local196 = local104;
			local104 = -local98;
			local98 = local196;
		} else if (arg7 == 2) {
			local104 = -local104;
			local98 = -local98;
		} else if (arg7 == 3) {
			local196 = local104;
			local104 = local98;
			local98 = -local196;
		}
		Static387.aFloat100 = local98;
		Static361.aFloat94 = local104;
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)Z")
	public static boolean method4676() {
		@Pc(7) Class1 local7 = Static401.aClass203_47.aClass1_195.aClass1_263;
		if (local7 == null || local7 == Static401.aClass203_47.aClass1_195) {
			return false;
		}
		@Pc(18) Class1_Sub35 local18 = (Class1_Sub35) local7;
		if (local18.anInt5839 >= 2000) {
			local18.anInt5839 -= 2000;
		}
		return local18.anInt5839 == 1009;
	}
}
