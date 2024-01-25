import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!fw", name = "ab", descriptor = "I")
	public static int anInt3581;

	@OriginalMember(owner = "client!fw", name = "v", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray14;

	@OriginalMember(owner = "client!fw", name = "M", descriptor = "Lclient!vo;")
	public static Class381 aClass381_3 = null;

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(I[I[I)V")
	public static void method3371(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1) {
		if (arg0 == null || arg1 == null) {
			Static600.anIntArray615 = null;
			Static520.anIntArray564 = null;
			Static345.aByteArrayArrayArray16 = null;
			return;
		}
		Static600.anIntArray615 = arg0;
		Static520.anIntArray564 = new int[arg0.length];
		Static345.aByteArrayArrayArray16 = new byte[arg0.length][][];
		for (@Pc(31) int local31 = 0; local31 < Static600.anIntArray615.length; local31++) {
			Static345.aByteArrayArrayArray16[local31] = new byte[arg1[local31]][];
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg1 - arg6;
		@Pc(21) int local21 = arg3 - arg6;
		@Pc(25) int local25 = arg1 * arg1;
		@Pc(29) int local29 = arg3 * arg3;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(53) int local53 = local25 << 1;
		@Pc(57) int local57 = local37 << 1;
		@Pc(61) int local61 = local33 << 1;
		@Pc(65) int local65 = arg3 << 1;
		@Pc(69) int local69 = local21 << 1;
		@Pc(79) int local79 = local25 * (1 - local65) + local41;
		@Pc(88) int local88 = local29 - (local65 - 1) * local53;
		@Pc(98) int local98 = local33 * (1 - local69) + local57;
		@Pc(107) int local107 = local37 - local61 * (local69 - 1);
		@Pc(111) int local111 = local25 << 2;
		@Pc(115) int local115 = local29 << 2;
		@Pc(119) int local119 = local33 << 2;
		@Pc(123) int local123 = local37 << 2;
		@Pc(127) int local127 = local41 * 3;
		@Pc(133) int local133 = local53 * (local65 - 3);
		@Pc(137) int local137 = local57 * 3;
		@Pc(143) int local143 = local61 * (local69 - 3);
		@Pc(145) int local145 = local115;
		@Pc(151) int local151 = local111 * (arg3 - 1);
		@Pc(153) int local153 = local123;
		@Pc(177) int local177;
		@Pc(185) int local185;
		@Pc(193) int local193;
		@Pc(202) int local202;
		if (Static605.anInt9561 <= arg0 && arg0 <= Static223.anInt4380) {
			@Pc(169) int[] local169 = Static36.anIntArrayArray4[arg0];
			local177 = Static9.method118(Static8.anInt136, Static398.anInt6878, arg4 - arg1);
			local185 = Static9.method118(Static8.anInt136, Static398.anInt6878, arg4 + arg1);
			local193 = Static9.method118(Static8.anInt136, Static398.anInt6878, arg4 - local16);
			local202 = Static9.method118(Static8.anInt136, Static398.anInt6878, arg4 + local16);
			Static367.method5559(-7, local177, arg2, local169, local193);
			Static367.method5559(-7, local193, arg5, local169, local202);
			Static367.method5559(-7, local202, arg2, local169, local185);
		}
		@Pc(226) int local226 = local119 * (local21 - 1);
		while (local9 > 0) {
			@Pc(237) boolean local237 = local21 >= local9;
			if (local237) {
				if (local98 < 0) {
					while (local98 < 0) {
						local98 += local137;
						local107 += local153;
						local153 += local123;
						local137 += local123;
						local11++;
					}
				}
				if (local107 < 0) {
					local107 += local153;
					local98 += local137;
					local11++;
					local137 += local123;
					local153 += local123;
				}
				local98 += -local226;
				local107 += -local143;
				local226 -= local119;
				local143 -= local119;
			}
			if (local79 < 0) {
				while (local79 < 0) {
					local79 += local127;
					local88 += local145;
					local7++;
					local127 += local115;
					local145 += local115;
				}
			}
			if (local88 < 0) {
				local88 += local145;
				local79 += local127;
				local145 += local115;
				local127 += local115;
				local7++;
			}
			local88 += -local133;
			local79 += -local151;
			local151 -= local111;
			local9--;
			local133 -= local111;
			local177 = arg0 - local9;
			local185 = local9 + arg0;
			if (Static605.anInt9561 <= local185 && local177 <= Static223.anInt4380) {
				local193 = Static9.method118(Static8.anInt136, Static398.anInt6878, local7 + arg4);
				local202 = Static9.method118(Static8.anInt136, Static398.anInt6878, arg4 - local7);
				if (local237) {
					@Pc(426) int local426 = Static9.method118(Static8.anInt136, Static398.anInt6878, local11 + arg4);
					@Pc(435) int local435 = Static9.method118(Static8.anInt136, Static398.anInt6878, arg4 - local11);
					@Pc(442) int[] local442;
					if (Static605.anInt9561 <= local177) {
						local442 = Static36.anIntArrayArray4[local177];
						Static367.method5559(-7, local202, arg2, local442, local435);
						Static367.method5559(-7, local435, arg5, local442, local426);
						Static367.method5559(-7, local426, arg2, local442, local193);
					}
					if (local185 <= Static223.anInt4380) {
						local442 = Static36.anIntArrayArray4[local185];
						Static367.method5559(-7, local202, arg2, local442, local435);
						Static367.method5559(-7, local435, arg5, local442, local426);
						Static367.method5559(-7, local426, arg2, local442, local193);
					}
				} else {
					if (Static605.anInt9561 <= local177) {
						Static367.method5559(-7, local202, arg2, Static36.anIntArrayArray4[local177], local193);
					}
					if (Static223.anInt4380 >= local185) {
						Static367.method5559(-7, local202, arg2, Static36.anIntArrayArray4[local185], local193);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lclient!lga;B[ILclient!lga;)V")
	public static void method3380(@OriginalArg(0) Class223 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class223 arg2) {
		if (arg1 != null) {
			Static512.anIntArray533 = arg1;
		}
		Static173.aClass223_35 = arg2;
		Static57.aClass223_12 = arg0;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(CI)C")
	public static char method3391(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}
}
