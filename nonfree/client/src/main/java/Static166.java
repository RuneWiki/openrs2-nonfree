import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
	public static int anInt3419;

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "Z")
	public static boolean aBoolean283 = false;

	@OriginalMember(owner = "client!gj", name = "k", descriptor = "[I")
	public static final int[] anIntArray153 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(FII[FIIIIII)V")
	public static void method3032(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(5) int local5 = arg1 - arg8;
		@Pc(13) int local13 = arg5 - arg6;
		@Pc(17) int local17 = arg3 - arg4;
		@Pc(38) float local38 = arg2[2] * (float) local13 + arg2[0] * (float) local5 + (float) local17 * arg2[1];
		@Pc(64) float local64 = arg2[3] * (float) local5 + (float) local17 * arg2[4] + (float) local13 * arg2[5];
		@Pc(85) float local85 = arg2[6] * (float) local5 + (float) local17 * arg2[7] + (float) local13 * arg2[8];
		@Pc(100) float local100 = (float) Math.sqrt((double) (local85 * local85 + local64 * local64 + local38 * local38));
		@Pc(111) float local111 = (float) Math.atan2((double) local38, (double) local85) / 6.2831855F + 0.5F;
		@Pc(124) float local124 = (float) Math.asin((double) (local64 / local100)) / 3.1415927F + arg0 + 0.5F;
		@Pc(137) float local137;
		if (arg7 == 1) {
			local137 = local111;
			local111 = -local124;
			local124 = local137;
		} else if (arg7 == 2) {
			local124 = -local124;
			local111 = -local111;
		} else if (arg7 == 3) {
			local137 = local111;
			local111 = local124;
			local124 = -local137;
		}
		Static522.aFloat231 = local111;
		Static438.aFloat211 = local124;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)Lclient!hq;")
	public static Class145 method3033(@OriginalArg(0) int arg0) {
		@Pc(8) Class145[] local8 = Static305.method5222();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class145 local16 = local8[local10];
			if (arg0 == local16.anInt3787) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIZ)Z")
	public static boolean method3034(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static215.aClass8_2.method6811(arg1, arg2, arg0, Static518.anIntArray501);
		@Pc(18) int local18 = Static518.anIntArray501[2];
		if (local18 < 50) {
			return false;
		} else {
			Static518.anIntArray501[0] = Static518.anIntArray501[0] * Static375.anInt7258 / local18 + Static297.anInt6004;
			Static518.anIntArray501[1] = Static518.anIntArray501[1] * Static445.anInt8291 / local18 + Static308.anInt6172;
			Static518.anIntArray501[2] = local18;
			return true;
		}
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(II)V")
	public static void method3035(@OriginalArg(1) int arg0) {
		if (arg0 == 37) {
			Static455.aFloat120 = 3.0F;
		} else if (arg0 == 50) {
			Static455.aFloat120 = 4.0F;
		} else if (arg0 == 75) {
			Static455.aFloat120 = 6.0F;
		} else if (arg0 == 100) {
			Static455.aFloat120 = 8.0F;
		} else if (arg0 == 200) {
			Static455.aFloat120 = 16.0F;
		}
		Class1_Sub4_Sub4_Sub2.lb = -1;
		Class1_Sub4_Sub4_Sub2.lb = -1;
	}
}
