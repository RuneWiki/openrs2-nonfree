import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!ti", name = "jb", descriptor = "I")
	public static int anInt5701;

	@OriginalMember(owner = "client!ti", name = "tb", descriptor = "I")
	public static int anInt5709;

	@OriginalMember(owner = "client!ti", name = "nb", descriptor = "J")
	public static long aLong167 = 0L;

	@OriginalMember(owner = "client!ti", name = "wb", descriptor = "S")
	public static short aShort93 = 205;

	@OriginalMember(owner = "client!ti", name = "Gb", descriptor = "I")
	public static int anInt5721 = 0;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIFFIIFIII[FI)V")
	public static void method4523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) float[] arg10, @OriginalArg(12) int arg11) {
		@Pc(13) int local13 = arg4 - arg0;
		@Pc(17) int local17 = arg9 - arg8;
		@Pc(21) int local21 = arg7 - arg11;
		@Pc(42) float local42 = arg10[2] * (float) local21 + arg10[1] * (float) local13 + arg10[0] * (float) local17;
		@Pc(63) float local63 = (float) local17 * arg10[3] + (float) local13 * arg10[4] + (float) local21 * arg10[5];
		@Pc(84) float local84 = (float) local21 * arg10[8] + (float) local13 * arg10[7] + arg10[6] * (float) local17;
		@Pc(106) float local106;
		@Pc(100) float local100;
		if (arg1 == 0) {
			local100 = arg2 + 0.5F - local84;
			local106 = local42 + arg6 + 0.5F;
		} else if (arg1 == 1) {
			local100 = local84 + arg2 + 0.5F;
			local106 = local42 + arg6 + 0.5F;
		} else if (arg1 == 2) {
			local100 = arg3 + 0.5F - local63;
			local106 = arg6 + 0.5F - local42;
		} else if (arg1 == 3) {
			local100 = arg3 + 0.5F - local63;
			local106 = local42 + arg6 + 0.5F;
		} else if (arg1 == 4) {
			local106 = local84 + arg2 + 0.5F;
			local100 = arg3 + 0.5F - local63;
		} else {
			local100 = arg3 + 0.5F - local63;
			local106 = arg2 + 0.5F - local84;
		}
		@Pc(207) float local207;
		if (arg5 == 1) {
			local207 = local106;
			local106 = -local100;
			local100 = local207;
		} else if (arg5 == 2) {
			local106 = -local106;
			local100 = -local100;
		} else if (arg5 == 3) {
			local207 = local106;
			local106 = local100;
			local100 = -local207;
		}
		Static163.aFloat52 = local106;
		Static442.aFloat124 = local100;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIII)V")
	public static void method4539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class1_Sub1_Sub1 local12 = Static190.method3007(arg0, 11);
		local12.method32();
		local12.anInt35 = arg1;
		local12.anInt39 = arg2;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIZIZII)Z")
	public static boolean method4555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static255.aClass47_Sub1_Sub5_Sub2_2.anIntArray407[0];
		@Pc(18) int local18 = Static255.aClass47_Sub1_Sub5_Sub2_2.anIntArray408[0];
		if (local8 < 0 || Static80.anInt6558 <= local8 || local18 < 0 || local18 >= Static104.anInt2048) {
			return false;
		} else if (arg0 >= 0 && arg0 < Static80.anInt6558 && arg1 >= 0 && arg1 < Static104.anInt2048) {
			@Pc(82) int local82 = Static272.method3778(arg7, Static299.anIntArray382, arg6, local18, arg2, arg4, arg0, arg1, arg3, Static255.aClass47_Sub1_Sub5_Sub2_2.method4317(), arg5, Static429.anIntArray191, local8, Static20.aClass181Array2[Static255.aClass47_Sub1_Sub5_Sub2_2.aByte97]);
			if (local82 < 1) {
				return false;
			}
			Static57.anInt866 = Static429.anIntArray191[local82 - 1];
			Static326.anInt5983 = Static299.anIntArray382[local82 - 1];
			Static334.aBoolean489 = false;
			Static111.method1742();
			return true;
		} else {
			return false;
		}
	}
}
