import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!of", name = "b", descriptor = "I")
	public static int anInt4577;

	@OriginalMember(owner = "client!of", name = "f", descriptor = "[I")
	public static int[] anIntArray388 = new int[2];

	@OriginalMember(owner = "client!of", name = "k", descriptor = "I")
	public static int anInt4584 = -2;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
	public static void method4048() {
		if (Static139.anInt3199 == 10) {
			Static243.method5095(28);
		}
		if (Static139.anInt3199 == 30) {
			Static243.method5095(25);
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIBIIIIIIIIII)V")
	public static void method4050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(7) Class4_Sub21 local7 = new Class4_Sub21();
		local7.anInt3248 = arg0;
		local7.anInt3246 = arg2;
		local7.anInt3249 = arg8;
		local7.anInt3241 = arg10;
		local7.anInt3251 = arg9;
		local7.anInt3250 = arg11;
		local7.anInt3254 = arg4;
		local7.anInt3252 = arg7;
		local7.anInt3242 = arg3;
		local7.anInt3244 = arg5;
		local7.anInt3245 = arg6;
		local7.anInt3243 = arg1;
		Static136.aClass116_27.method3274(local7);
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
	public static void method4051() {
		if (Static186.anInt3918 != -1) {
			Static330.method5341(-1, false, Static186.anInt3918, -1);
			Static186.anInt3918 = -1;
		}
	}
}
