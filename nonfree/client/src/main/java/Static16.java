import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!as", name = "B", descriptor = "I")
	public static int anInt319;

	@OriginalMember(owner = "client!as", name = "D", descriptor = "I")
	public static int anInt320;

	@OriginalMember(owner = "client!as", name = "A", descriptor = "[[I")
	public static final int[][] anIntArrayArray2 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IIIIIFII[FFI)V")
	public static void method273(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float[] arg7, @OriginalArg(9) float arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg1 - arg2;
		@Pc(9) int local9 = arg9 - arg6;
		@Pc(13) int local13 = arg0 - arg5;
		@Pc(38) float local38 = arg7[0] * (float) local5 + (float) local9 * arg7[1] + arg7[2] * (float) local13;
		@Pc(64) float local64 = (float) local5 * arg7[3] + (float) local9 * arg7[4] + arg7[5] * (float) local13;
		@Pc(85) float local85 = (float) local5 * arg7[6] + arg7[7] * (float) local9 + (float) local13 * arg7[8];
		@Pc(96) float local96 = (float) Math.atan2((double) local38, (double) local85) / 6.2831855F + 0.5F;
		if (arg8 != 1.0F) {
			local96 *= arg8;
		}
		@Pc(110) float local110 = arg4 + local64 + 0.5F;
		@Pc(117) float local117;
		if (arg3 == 1) {
			local117 = local96;
			local96 = -local110;
			local110 = local117;
		} else if (arg3 == 2) {
			local96 = -local96;
			local110 = -local110;
		} else if (arg3 == 3) {
			local117 = local96;
			local96 = local110;
			local110 = -local117;
		}
		Static433.aFloat30 = local96;
		Static107.aFloat44 = local110;
	}

	@OriginalMember(owner = "client!as", name = "c", descriptor = "(Z)V")
	public static void method274() {
		for (@Pc(10) Class4_Sub1_Sub15 local10 = (Class4_Sub1_Sub15) Static354.aClass91_42.method2584(); local10 != null; local10 = (Class4_Sub1_Sub15) Static354.aClass91_42.method2586()) {
			@Pc(20) Class11_Sub5_Sub6 local20 = local10.aClass11_Sub5_Sub6_1;
			if (local20.anInt7539 < Static277.anInt2834) {
				local10.method6330();
				local20.method6050();
			} else if (Static277.anInt2834 >= local20.anInt7537) {
				if (local20.anInt7528 > 0) {
					@Pc(49) Class4_Sub44 local49 = (Class4_Sub44) Static80.aClass96_8.method2797((long) (local20.anInt7528 - 1));
					if (local49 != null) {
						@Pc(54) Class11_Sub5_Sub2_Sub2 local54 = local49.aClass11_Sub5_Sub2_Sub2_2;
						if (local54.anInt7514 >= 0 && Static193.anInt3853 * 128 > local54.anInt7514 && local54.anInt7515 >= 0 && Static301.anInt5585 * 128 > local54.anInt7515) {
							local20.method6054(local54.anInt7515, Static21.method356(local54.anInt7514, local54.anInt7515, local20.aByte100) - local20.anInt7545, local54.anInt7514, Static277.anInt2834);
						}
					}
				}
				if (local20.anInt7528 < 0) {
					@Pc(107) int local107 = -local20.anInt7528 - 1;
					@Pc(116) Class11_Sub5_Sub2_Sub1 local116;
					if (Static147.anInt3062 == local107) {
						local116 = Static52.aClass11_Sub5_Sub2_Sub1_2;
					} else {
						local116 = Static39.aClass11_Sub5_Sub2_Sub1Array1[local107];
					}
					if (local116 != null && local116.anInt7514 >= 0 && local116.anInt7514 < Static193.anInt3853 * 128 && local116.anInt7515 >= 0 && Static301.anInt5585 * 128 > local116.anInt7515) {
						local20.method6054(local116.anInt7515, Static21.method356(local116.anInt7514, local116.anInt7515, local20.aByte100) - local20.anInt7545, local116.anInt7514, Static277.anInt2834);
					}
				}
				local20.method6051(Static75.anInt1854);
				Static72.method1589(local20, true);
			}
		}
	}
}
