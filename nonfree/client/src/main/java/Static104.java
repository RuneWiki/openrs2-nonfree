import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!dt", name = "z", descriptor = "I")
	public static int anInt2566;

	@OriginalMember(owner = "client!dt", name = "u", descriptor = "I")
	public static int anInt2561 = 0;

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "([I[II)V")
	public static void method2288(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg1 == null || arg0 == null) {
			Static197.anIntArray390 = null;
			Static371.aByteArrayArrayArray17 = null;
			Static412.anIntArray592 = null;
			return;
		}
		Static412.anIntArray592 = arg1;
		Static197.anIntArray390 = new int[arg1.length];
		Static371.aByteArrayArrayArray17 = new byte[arg1.length][][];
		for (@Pc(28) int local28 = 0; local28 < Static412.anIntArray592.length; local28++) {
			Static371.aByteArrayArrayArray17[local28] = new byte[arg0[local28]][];
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIIIII)V")
	public static void method2289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(13) int local13 = arg2 * arg2;
		@Pc(17) int local17 = arg0 * arg0;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg0 << 1;
		@Pc(38) int local38 = local21 + local13 * (1 - local29);
		@Pc(47) int local47 = local17 - local25 * (local29 - 1);
		@Pc(56) int local56 = local13 << 2;
		@Pc(60) int local60 = local17 << 2;
		@Pc(68) int local68 = local21 * 3;
		@Pc(76) int local76 = local25 * ((arg0 << 1) - 3);
		@Pc(82) int local82 = local60;
		Static336.method5023(arg3, arg4 + arg2, Static383.anIntArrayArray62[arg1], arg4 - arg2);
		@Pc(102) int local102 = (arg0 - 1) * local56;
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local38 += local68;
					local47 += local82;
					local82 += local60;
					local7++;
					local68 += local60;
				}
			}
			if (local47 < 0) {
				local47 += local82;
				local38 += local68;
				local82 += local60;
				local68 += local60;
				local7++;
			}
			local47 += -local76;
			local38 += -local102;
			local76 -= local56;
			local9--;
			local102 -= local56;
			@Pc(176) int local176 = arg1 - local9;
			@Pc(181) int local181 = arg1 + local9;
			@Pc(185) int local185 = local7 + arg4;
			@Pc(190) int local190 = arg4 - local7;
			Static336.method5023(arg3, local185, Static383.anIntArrayArray62[local176], local190);
			Static336.method5023(arg3, local185, Static383.anIntArrayArray62[local181], local190);
		}
	}
}
