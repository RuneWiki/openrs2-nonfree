import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
	public static int anInt4569;

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
	public static int anInt4570;

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "[I")
	public static int[] anIntArray410;

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "Lclient!ki;")
	public static Class14 aClass14_1;

	@OriginalMember(owner = "client!pg", name = "i", descriptor = "Z")
	public static boolean aBoolean285;

	@OriginalMember(owner = "client!pg", name = "k", descriptor = "[[S")
	public static short[][] aShortArrayArray9;

	@OriginalMember(owner = "client!pg", name = "o", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!pg", name = "h", descriptor = "[I")
	public static int[] anIntArray411 = new int[5];

	@OriginalMember(owner = "client!pg", name = "m", descriptor = "Z")
	public static boolean aBoolean286 = true;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IBIIII)V")
	public static void method3375(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(13) int local13 = arg4 * arg4;
		@Pc(17) int local17 = arg1 * arg1;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = arg1 << 1;
		@Pc(34) int local34 = local13 * (1 - local25) + local21;
		@Pc(38) int local38 = local13 << 1;
		@Pc(42) int local42 = local17 << 2;
		@Pc(50) int local50 = local17 - (local25 - 1) * local38;
		@Pc(54) int local54 = local13 << 2;
		@Pc(62) int local62 = local21 * 3;
		@Pc(70) int local70 = local38 * ((arg1 << 1) - 3);
		@Pc(76) int local76 = local42;
		@Pc(89) int local89 = (arg1 - 1) * local54;
		@Pc(107) int local107;
		@Pc(116) int local116;
		if (arg0 >= Static206.anInt4449 && Static90.anInt2088 >= arg0) {
			local107 = Static131.method2259(Static310.anInt6206, arg4 + arg2, Static170.anInt3814);
			local116 = Static131.method2259(Static310.anInt6206, arg2 - arg4, Static170.anInt3814);
			Static98.method3942(local107, Static121.anIntArrayArray33[arg0], arg3, local116);
		}
		while (local9 > 0) {
			local9--;
			local107 = arg0 - local9;
			local116 = local9 + arg0;
			if (local34 < 0) {
				while (local34 < 0) {
					local34 += local62;
					local50 += local76;
					local76 += local42;
					local62 += local42;
					local7++;
				}
			}
			if (local50 < 0) {
				local34 += local62;
				local50 += local76;
				local76 += local42;
				local7++;
				local62 += local42;
			}
			if (local116 >= Static206.anInt4449 && Static90.anInt2088 >= local107) {
				@Pc(206) int local206 = Static131.method2259(Static310.anInt6206, local7 + arg2, Static170.anInt3814);
				@Pc(214) int local214 = Static131.method2259(Static310.anInt6206, arg2 - local7, Static170.anInt3814);
				if (Static206.anInt4449 <= local107) {
					Static98.method3942(local206, Static121.anIntArrayArray33[local107], arg3, local214);
				}
				if (local116 <= Static90.anInt2088) {
					Static98.method3942(local206, Static121.anIntArrayArray33[local116], arg3, local214);
				}
			}
			local34 += -local89;
			local89 -= local54;
			local50 += -local70;
			local70 -= local54;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)I")
	public static int method3376(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZI)V")
	public static void method3377(@OriginalArg(1) int arg0) {
		if (!Static99.method1656(arg0)) {
			return;
		}
		@Pc(15) Class191[] local15 = Static34.aClass191ArrayArray1[arg0];
		for (@Pc(22) int local22 = 0; local22 < local15.length; local22++) {
			@Pc(30) Class191 local30 = local15[local22];
			if (local30 != null) {
				local30.anInt6103 = 0;
				local30.anInt6116 = 1;
				local30.anInt6104 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(BI)V")
	public static void method3378(@OriginalArg(1) int arg0) {
		@Pc(4) Class1_Sub3_Sub22 local4 = Static271.method4108(8, arg0);
		local4.method4464();
	}
}
