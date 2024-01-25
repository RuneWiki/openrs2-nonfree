import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "[I")
	public static final int[] anIntArray571 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

	@OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
	public static int anInt7252 = 0;

	@OriginalMember(owner = "client!rl", name = "j", descriptor = "Z")
	public static boolean aBoolean479 = false;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(FFZIF)F")
	public static float method6209(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		@Pc(7) float[] local7 = Static166.aFloatArrayArray2[arg2];
		return arg3 * local7[0] + local7[1] * arg0 + arg1 * local7[2];
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!kda;Lclient!kda;ILclient!kda;Lclient!kda;)V")
	public static void method6210(@OriginalArg(0) Class160 arg0, @OriginalArg(1) Class160 arg1, @OriginalArg(3) Class160 arg2, @OriginalArg(4) Class160 arg3) {
		Static30.aClass160_4 = arg3;
		Static46.aClass160_11 = arg0;
		Static350.aClass160_73 = arg2;
		Static503.aClass160_97 = arg1;
		Static352.aClass309ArrayArray2 = new Class309[Static503.aClass160_97.method4206()][];
		Static236.aBooleanArray18 = new boolean[Static503.aClass160_97.method4206()];
	}
}
