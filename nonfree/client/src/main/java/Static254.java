import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!qh", name = "p", descriptor = "F")
	public static float aFloat69;

	@OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
	public static int anInt5029 = 1;

	@OriginalMember(owner = "client!qh", name = "m", descriptor = "I")
	public static int anInt5030 = 0;

	@OriginalMember(owner = "client!qh", name = "n", descriptor = "J")
	public static long aLong152 = 0L;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BII)I")
	public static int method4613(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(47) int local47 = Static185.method3338(arg0 + 91923, 4, arg1 + 45365) + (Static185.method3338(arg0 + 37821, 2, arg1 + 10294) - 128 >> 1) + (Static185.method3338(arg0, 1, arg1) + -128 >> 2) - 128;
		local47 = (int) ((double) local47 * 0.3D) + 35;
		if (local47 < 10) {
			local47 = 10;
		} else if (local47 > 60) {
			local47 = 60;
		}
		return local47;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIII)V")
	public static void method4614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 >= Static124.anInt4221 && arg3 <= Static96.anInt2180 && Static228.anInt920 <= arg4 && arg5 <= Static307.anInt6214) {
			if (arg2 == 1) {
				Static158.method2982(arg3, arg0, arg5, arg1, arg4);
			} else {
				Static91.method2096(arg5, arg3, arg4, arg0, arg2, arg1);
			}
		} else if (arg2 == 1) {
			Static88.method1959(arg5, arg1, arg3, arg4, arg0);
		} else {
			Static191.method3433(arg5, arg2, arg4, arg3, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZI)V")
	public static void method4615(@OriginalArg(1) int arg0) {
		Static52.anInt1119 = arg0;
		Static20.anInt434 = -1;
		Static203.anInt3379 = 100;
		Static104.anInt5551 = 3;
	}
}
