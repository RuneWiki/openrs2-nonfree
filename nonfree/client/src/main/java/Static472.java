import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static472 {

	@OriginalMember(owner = "client!tm", name = "Ph", descriptor = "I")
	public static int anInt8397;

	@OriginalMember(owner = "client!tm", name = "Vg", descriptor = "J")
	public static volatile long aLong225 = 0L;

	@OriginalMember(owner = "client!tm", name = "g", descriptor = "(II)V")
	public static void method7362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class64 local7 = Static263.aClass64ArrayArrayArray3[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class64 local28 = Static263.aClass64ArrayArrayArray3[local9][arg0][arg1] = Static263.aClass64ArrayArrayArray3[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte33--;
				for (@Pc(40) Class232 local40 = local28.aClass232_2; local40 != null; local40 = local40.aClass232_3) {
					@Pc(44) Class20_Sub1 local44 = local40.aClass20_Sub1_2;
					if (local44.aShort124 == arg0 && local44.aShort123 == arg1) {
						local44.aByte108--;
					}
				}
			}
		}
		if (Static263.aClass64ArrayArrayArray3[0][arg0][arg1] == null) {
			Static263.aClass64ArrayArrayArray3[0][arg0][arg1] = new Class64(0, arg0, arg1);
			Static263.aClass64ArrayArrayArray3[0][arg0][arg1].aByte27 = 1;
		}
		Static263.aClass64ArrayArrayArray3[0][arg0][arg1].aClass64_1 = local7;
		Static263.aClass64ArrayArrayArray3[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "(IIIII)V")
	public static void method7363(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class1_Sub2_Sub16 local8 = Static422.method6588(8, arg3);
		local8.method6693();
		local8.anInt7491 = arg2;
		local8.anInt7487 = arg1;
		local8.anInt7482 = arg0;
	}

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "(IIIIII)V")
	public static void method7364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(13) int local13 = arg0 * arg0;
		@Pc(17) int local17 = arg3 * arg3;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg3 << 1;
		@Pc(38) int local38 = local13 * (1 - local29) + local21;
		@Pc(47) int local47 = local17 - (local29 - 1) * local25;
		@Pc(51) int local51 = local13 << 2;
		@Pc(55) int local55 = local17 << 2;
		@Pc(63) int local63 = local21 * 3;
		@Pc(71) int local71 = ((arg3 << 1) - 3) * local25;
		@Pc(77) int local77 = local55;
		@Pc(83) int local83 = (arg3 - 1) * local51;
		Static313.method5430(arg0 + arg4, arg2, Static143.anIntArrayArray33[arg1], arg4 - arg0);
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local47 += local77;
					local38 += local63;
					local63 += local55;
					local7++;
					local77 += local55;
				}
			}
			if (local47 < 0) {
				local38 += local63;
				local47 += local77;
				local77 += local55;
				local63 += local55;
				local7++;
			}
			local47 += -local71;
			local38 += -local83;
			local9--;
			local71 -= local51;
			local83 -= local51;
			@Pc(170) int local170 = arg1 - local9;
			@Pc(174) int local174 = local9 + arg1;
			@Pc(178) int local178 = local7 + arg4;
			@Pc(183) int local183 = arg4 - local7;
			Static313.method5430(local178, arg2, Static143.anIntArrayArray33[local170], local183);
			Static313.method5430(local178, arg2, Static143.anIntArrayArray33[local174], local183);
		}
	}
}
