import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!gga", name = "c", descriptor = "[Lclient!xa;")
	public static Class13[] aClass13Array11;

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "I")
	public static int anInt3607 = 0;

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(ILclient!eh;)V")
	public static void method3209(@OriginalArg(1) Class4_Sub9 arg0) {
		if (arg0.aByteArray97.length - arg0.anInt7219 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method6015();
		if (local21 < 0 || local21 > 1 || arg0.aByteArray97.length - arg0.anInt7219 < 2) {
			return;
		}
		@Pc(47) int local47 = arg0.method5982();
		if (arg0.aByteArray97.length - arg0.anInt7219 < local47 * 6) {
			return;
		}
		for (@Pc(65) int local65 = 0; local65 < local47; local65++) {
			@Pc(71) int local71 = arg0.method5982();
			@Pc(75) int local75 = arg0.method6026();
			if (Static435.anIntArray612.length > local71 && Static23.aBooleanArray6[local71] && (Static73.aClass96_1.method2741(local71).aChar5 != '1' || local75 >= -1 && local75 <= 1)) {
				Static435.anIntArray612[local71] = local75;
			}
		}
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(BIIIF[FIIII)V")
	public static void method3210(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg5 - arg1;
		@Pc(13) int local13 = arg8 - arg6;
		@Pc(17) int local17 = arg2 - arg7;
		@Pc(38) float local38 = arg4[2] * (float) local13 + (float) local9 * arg4[0] + (float) local17 * arg4[1];
		@Pc(59) float local59 = (float) local13 * arg4[5] + arg4[4] * (float) local17 + (float) local9 * arg4[3];
		@Pc(85) float local85 = arg4[7] * (float) local17 + (float) local9 * arg4[6] + arg4[8] * (float) local13;
		@Pc(100) float local100 = (float) Math.sqrt((double) (local38 * local38 + local59 * local59 + local85 * local85));
		@Pc(111) float local111 = (float) Math.atan2((double) local38, (double) local85) / 6.2831855F + 0.5F;
		@Pc(124) float local124 = (float) Math.asin((double) (local59 / local100)) / 3.1415927F + arg3 + 0.5F;
		@Pc(135) float local135;
		if (arg0 == 1) {
			local135 = local111;
			local111 = -local124;
			local124 = local135;
		} else if (arg0 == 2) {
			local111 = -local111;
			local124 = -local124;
		} else if (arg0 == 3) {
			local135 = local111;
			local111 = local124;
			local124 = -local135;
		}
		Static99.aFloat49 = local124;
		Static395.aFloat140 = local111;
	}
}
