import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!qe", name = "N", descriptor = "Lclient!ps;")
	public static Class163 aClass163_16;

	@OriginalMember(owner = "client!qe", name = "R", descriptor = "[[B")
	public static byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!qe", name = "L", descriptor = "[I")
	public static final int[] anIntArray475 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(CB)Z")
	public static boolean method4427(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg2 - arg4;
		@Pc(21) int local21 = arg1 - arg4;
		@Pc(25) int local25 = arg2 * arg2;
		@Pc(29) int local29 = arg1 * arg1;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg1 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(71) int local71 = local25 * (1 - local57) + local41;
		@Pc(80) int local80 = local29 - local45 * (local57 - 1);
		@Pc(89) int local89 = local49 + (1 - local61) * local33;
		@Pc(98) int local98 = local37 - (local61 - 1) * local53;
		@Pc(102) int local102 = local25 << 2;
		@Pc(110) int local110 = local29 << 2;
		@Pc(114) int local114 = local33 << 2;
		@Pc(118) int local118 = local37 << 2;
		@Pc(122) int local122 = local41 * 3;
		@Pc(128) int local128 = (local57 - 3) * local45;
		@Pc(132) int local132 = local49 * 3;
		@Pc(138) int local138 = (local61 - 3) * local53;
		@Pc(140) int local140 = local110;
		@Pc(146) int local146 = local102 * (arg1 - 1);
		@Pc(148) int local148 = local118;
		@Pc(154) int local154 = local114 * (local21 - 1);
		@Pc(158) int[] local158 = Static319.anIntArrayArray31[arg6];
		Static244.method5351(arg0 - arg2, arg0 + -local16, local158, arg3);
		Static244.method5351(arg0 - local16, local16 + arg0, local158, arg5);
		Static244.method5351(local16 + arg0, arg2 + arg0, local158, arg3);
		while (local9 > 0) {
			@Pc(203) boolean local203 = local21 >= local9;
			if (local71 < 0) {
				while (local71 < 0) {
					local80 += local140;
					local71 += local122;
					local7++;
					local122 += local110;
					local140 += local110;
				}
			}
			if (local203) {
				if (local89 < 0) {
					while (local89 < 0) {
						local98 += local148;
						local89 += local132;
						local11++;
						local148 += local118;
						local132 += local118;
					}
				}
				if (local98 < 0) {
					local98 += local148;
					local89 += local132;
					local148 += local118;
					local11++;
					local132 += local118;
				}
				local89 += -local154;
				local98 += -local138;
				local154 -= local114;
				local138 -= local114;
			}
			if (local80 < 0) {
				local80 += local140;
				local71 += local122;
				local7++;
				local122 += local110;
				local140 += local110;
			}
			local71 += -local146;
			local80 += -local128;
			local128 -= local102;
			local9--;
			local146 -= local102;
			@Pc(334) int local334 = arg6 - local9;
			@Pc(338) int local338 = local9 + arg6;
			@Pc(342) int local342 = local7 + arg0;
			@Pc(347) int local347 = arg0 - local7;
			if (local203) {
				@Pc(371) int local371 = local11 + arg0;
				@Pc(375) int local375 = arg0 - local11;
				Static244.method5351(local347, local375, Static319.anIntArrayArray31[local334], arg3);
				Static244.method5351(local375, local371, Static319.anIntArrayArray31[local334], arg5);
				Static244.method5351(local371, local342, Static319.anIntArrayArray31[local334], arg3);
				Static244.method5351(local347, local375, Static319.anIntArrayArray31[local338], arg3);
				Static244.method5351(local375, local371, Static319.anIntArrayArray31[local338], arg5);
				Static244.method5351(local371, local342, Static319.anIntArrayArray31[local338], arg3);
			} else {
				Static244.method5351(local347, local342, Static319.anIntArrayArray31[local334], arg3);
				Static244.method5351(local347, local342, Static319.anIntArrayArray31[local338], arg3);
			}
		}
	}
}
