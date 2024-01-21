import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!qi", name = "p", descriptor = "[I")
	public static int[] anIntArray349;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "Lclient!kg;")
	public static final Class56 aClass56_2 = new Class56();

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "Z")
	public static boolean aBoolean141 = false;

	@OriginalMember(owner = "client!qi", name = "n", descriptor = "[[[Lclient!sg;")
	public static final Class91[][][] aClass91ArrayArrayArray1 = new Class91[4][104][104];

	@OriginalMember(owner = "client!qi", name = "o", descriptor = "[I")
	public static final int[] anIntArray348 = new int[32];

	@OriginalMember(owner = "client!qi", name = "q", descriptor = "[J")
	public static final long[] aLongArray36 = new long[500];

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!dc;B)I")
	public static int method2434(@OriginalArg(0) Class20 arg0) {
		return arg0.method582() + 1;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method2435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(14) Class5_Sub23 local14 = (Class5_Sub23) Static18.aClass91_3.method2684();
		@Pc(16) Class5_Sub23 local16 = null;
		while (local14 != null) {
			if (arg3 == local14.anInt3025 && arg8 == local14.anInt3031 && local14.anInt3033 == arg0 && arg4 == local14.anInt3038) {
				local16 = local14;
				break;
			}
			local14 = (Class5_Sub23) Static18.aClass91_3.method2678();
		}
		if (local16 == null) {
			local16 = new Class5_Sub23();
			local16.anInt3025 = arg3;
			local16.anInt3033 = arg0;
			local16.anInt3038 = arg4;
			local16.anInt3031 = arg8;
			Static99.method1684(local16);
			Static18.aClass91_3.method2686(local16);
		}
		local16.anInt3036 = arg6;
		local16.anInt3029 = arg7;
		local16.anInt3021 = arg1;
		local16.anInt3037 = arg5;
		local16.anInt3030 = arg2;
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
	public static void method2437() {
		for (@Pc(10) Class5_Sub23 local10 = (Class5_Sub23) Static18.aClass91_3.method2684(); local10 != null; local10 = (Class5_Sub23) Static18.aClass91_3.method2678()) {
			if (local10.anInt3037 > 0) {
				local10.anInt3037--;
			}
			if (local10.anInt3037 != 0) {
				if (local10.anInt3030 > 0) {
					local10.anInt3030--;
				}
				if (local10.anInt3030 == 0 && local10.anInt3031 >= 1 && local10.anInt3033 >= 1 && local10.anInt3031 <= 102 && local10.anInt3033 <= 102 && (local10.anInt3021 < 0 || Static114.method499(local10.anInt3021, local10.anInt3029))) {
					Static124.method1953(local10.anInt3031, local10.anInt3021, local10.anInt3033, local10.anInt3029, local10.anInt3038, local10.anInt3025, local10.anInt3036);
					local10.anInt3030 = -1;
					if (local10.anInt3021 == local10.anInt3020 && local10.anInt3020 == -1) {
						local10.method3207();
					} else if (local10.anInt3021 == local10.anInt3020 && local10.anInt3032 == local10.anInt3036 && local10.anInt3029 == local10.anInt3034) {
						local10.method3207();
					}
				}
			} else if (local10.anInt3020 < 0 || Static114.method499(local10.anInt3020, local10.anInt3034)) {
				Static124.method1953(local10.anInt3031, local10.anInt3020, local10.anInt3033, local10.anInt3034, local10.anInt3038, local10.anInt3025, local10.anInt3032);
				local10.method3207();
			}
		}
	}
}
