import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!haa", name = "m", descriptor = "Lclient!gs;")
	public static Class123 aClass123_6;

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "I")
	public static int anInt4082 = 1;

	@OriginalMember(owner = "client!haa", name = "g", descriptor = "I")
	public static int anInt4087 = 0;

	@OriginalMember(owner = "client!haa", name = "n", descriptor = "Z")
	public static boolean aBoolean328 = false;

	@OriginalMember(owner = "client!haa", name = "q", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_47 = new Class181(7, -1);

	@OriginalMember(owner = "client!haa", name = "t", descriptor = "I")
	public static final int anInt4096 = 1406;

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IIIIIIIBI)V")
	public static void method3601(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(8) int arg5) {
		Static167.method3393(arg1, arg0, arg2, arg5, arg3, 0, arg4);
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(III)I")
	public static int method3603(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static6.anIntArray23[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "([FIFIIIIIBI)V")
	public static void method3606(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(5) int local5 = arg8 - arg7;
		@Pc(9) int local9 = arg5 - arg3;
		@Pc(21) int local21 = arg4 - arg6;
		@Pc(42) float local42 = arg0[2] * (float) local9 + arg0[0] * (float) local21 + arg0[1] * (float) local5;
		@Pc(63) float local63 = arg0[3] * (float) local21 + arg0[4] * (float) local5 + arg0[5] * (float) local9;
		@Pc(84) float local84 = arg0[8] * (float) local9 + (float) local5 * arg0[7] + (float) local21 * arg0[6];
		@Pc(99) float local99 = (float) Math.sqrt((double) (local63 * local63 + local42 * local42 + local84 * local84));
		@Pc(110) float local110 = (float) Math.atan2((double) local42, (double) local84) / 6.2831855F + 0.5F;
		@Pc(123) float local123 = arg2 + (float) Math.asin((double) (local63 / local99)) / 3.1415927F + 0.5F;
		@Pc(136) float local136;
		if (arg1 == 1) {
			local136 = local110;
			local110 = -local123;
			local123 = local136;
		} else if (arg1 == 2) {
			local123 = -local123;
			local110 = -local110;
		} else if (arg1 == 3) {
			local136 = local110;
			local110 = local123;
			local123 = -local136;
		}
		Static233.aFloat107 = local123;
		Static462.aFloat181 = local110;
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(B)V")
	public static void method3607() {
		if (Static581.aClass196_2 != null) {
			Static581.aClass196_2.method6403();
		}
		if (Static423.aClass196_1 != null) {
			Static423.aClass196_1.method6403();
		}
	}
}
