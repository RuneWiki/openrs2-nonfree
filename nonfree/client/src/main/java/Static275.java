import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!nt", name = "hb", descriptor = "Lclient!ia;")
	public static Class106 aClass106_3;

	@OriginalMember(owner = "client!nt", name = "jb", descriptor = "[I")
	public static final int[] anIntArray396 = new int[13];

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIILclient!dn;)Lclient!uu;")
	public static Class242 method4093(@OriginalArg(1) int arg0, @OriginalArg(3) Class56 arg1) {
		@Pc(9) byte[] local9 = arg1.method1384(arg0, 0);
		return local9 == null ? null : new Class242(local9);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IB)[[[B")
	public static byte[][][] method4094(@OriginalArg(0) int arg0) {
		@Pc(7) byte[][][] local7 = new byte[8][4][];
		@Pc(16) byte[] local16 = new byte[arg0 * arg0];
		@Pc(18) int local18 = 0;
		@Pc(23) int local23;
		for (@Pc(20) int local20 = 0; local20 < arg0; local20++) {
			for (local23 = 0; local23 < arg0; local23++) {
				if (local23 <= local20) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[0][0] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(68) int local68;
		for (local23 = arg0 - 1; local23 >= 0; local23--) {
			for (local68 = 0; local68 < arg0; local68++) {
				if (local68 <= local23) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[0][1] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(109) int local109;
		for (local68 = 0; local68 < arg0; local68++) {
			for (local109 = 0; local109 < arg0; local109++) {
				if (local109 >= local68) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[0][2] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(154) int local154;
		for (local109 = arg0 - 1; local109 >= 0; local109--) {
			for (local154 = 0; local154 < arg0; local154++) {
				if (local154 >= local109) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[0][3] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(194) int local194;
		for (local154 = arg0 - 1; local154 >= 0; local154--) {
			for (local194 = 0; local194 < arg0; local194++) {
				if (local154 >> 1 >= local194) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[1][0] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(233) int local233;
		for (local194 = 0; local194 < arg0; local194++) {
			for (local233 = 0; local233 < arg0; local233++) {
				if (local18 >= 0 && local16.length > local18) {
					if (local233 >= local194 << 1) {
						local16[local18] = -1;
					}
					local18++;
				} else {
					local18++;
				}
			}
		}
		local7[1][1] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(287) int local287;
		for (local233 = 0; local233 < arg0; local233++) {
			for (local287 = arg0 - 1; local287 >= 0; local287--) {
				if (local233 >> 1 >= local287) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[1][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(338) int local338;
		for (local287 = arg0 - 1; local287 >= 0; local287--) {
			for (local338 = arg0 - 1; local338 >= 0; local338--) {
				if (local338 >= local287 << 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[1][3] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(377) int local377;
		for (local338 = arg0 - 1; local338 >= 0; local338--) {
			for (local377 = arg0 - 1; local377 >= 0; local377--) {
				if (local377 <= local338 >> 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[2][0] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(414) int local414;
		for (local377 = arg0 - 1; local377 >= 0; local377--) {
			for (local414 = 0; local414 < arg0; local414++) {
				if (local414 >= local377 << 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[2][1] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(458) int local458;
		for (local414 = 0; local414 < arg0; local414++) {
			for (local458 = 0; local458 < arg0; local458++) {
				if (local458 <= local414 >> 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[2][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(505) int local505;
		for (local458 = 0; local458 < arg0; local458++) {
			for (local505 = arg0 - 1; local505 >= 0; local505--) {
				if (local505 >= local458 << 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[2][3] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(547) int local547;
		for (local505 = arg0 - 1; local505 >= 0; local505--) {
			for (local547 = 0; local547 < arg0; local547++) {
				if (local505 >> 1 <= local547) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[3][0] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(587) int local587;
		for (local547 = 0; local547 < arg0; local547++) {
			for (local587 = 0; local587 < arg0; local587++) {
				if (local587 <= local547 << 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[3][1] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(634) int local634;
		for (local587 = 0; local587 < arg0; local587++) {
			for (local634 = arg0 - 1; local634 >= 0; local634--) {
				if (local634 >= local587 >> 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[3][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(686) int local686;
		for (local634 = arg0 - 1; local634 >= 0; local634--) {
			for (local686 = arg0 - 1; local686 >= 0; local686--) {
				if (local686 <= local634 << 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[3][3] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(725) int local725;
		for (local686 = arg0 - 1; local686 >= 0; local686--) {
			for (local725 = arg0 - 1; local725 >= 0; local725--) {
				if (local686 >> 1 <= local725) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[4][0] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(769) int local769;
		for (local725 = arg0 - 1; local725 >= 0; local725--) {
			for (local769 = 0; local769 < arg0; local769++) {
				if (local769 <= local725 << 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[4][1] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(805) int local805;
		for (local769 = 0; local769 < arg0; local769++) {
			for (local805 = 0; local805 < arg0; local805++) {
				if (local769 >> 1 <= local805) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[4][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(844) int local844;
		for (local805 = 0; local805 < arg0; local805++) {
			for (local844 = arg0 - 1; local844 >= 0; local844--) {
				if (local844 <= local805 << 1) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[4][3] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(884) int local884;
		for (local844 = 0; local844 < arg0; local844++) {
			for (local884 = 0; local884 < arg0; local884++) {
				if (local884 <= arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[5][0] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(925) int local925;
		for (local884 = 0; local884 < arg0; local884++) {
			for (local925 = 0; local925 < arg0; local925++) {
				if (arg0 / 2 >= local884) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[5][1] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(970) int local970;
		for (local925 = 0; local925 < arg0; local925++) {
			for (local970 = 0; local970 < arg0; local970++) {
				if (local970 >= arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[5][2] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(1019) int local1019;
		for (local970 = 0; local970 < arg0; local970++) {
			for (local1019 = 0; local1019 < arg0; local1019++) {
				if (arg0 / 2 <= local970) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[5][3] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(1064) int local1064;
		for (local1019 = 0; local1019 < arg0; local1019++) {
			for (local1064 = 0; local1064 < arg0; local1064++) {
				if (local1019 - arg0 / 2 >= local1064) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[6][0] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(1118) int local1118;
		for (local1064 = arg0 - 1; local1064 >= 0; local1064--) {
			for (local1118 = 0; local1118 < arg0; local1118++) {
				if (local1118 <= local1064 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[6][1] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1169) int local1169;
		for (local1118 = arg0 - 1; local1118 >= 0; local1118--) {
			for (local1169 = arg0 - 1; local1169 >= 0; local1169--) {
				if (local1169 <= local1118 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[6][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		@Pc(1216) int local1216;
		for (local1169 = 0; local1169 < arg0; local1169++) {
			for (local1216 = arg0 - 1; local1216 >= 0; local1216--) {
				if (local1169 - arg0 / 2 >= local1216) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[6][3] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(1257) int local1257;
		for (local1216 = 0; local1216 < arg0; local1216++) {
			for (local1257 = 0; local1257 < arg0; local1257++) {
				if (local1257 >= local1216 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[7][0] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(1311) int local1311;
		for (local1257 = arg0 - 1; local1257 >= 0; local1257--) {
			for (local1311 = 0; local1311 < arg0; local1311++) {
				if (local1311 >= local1257 - arg0 / 2) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[7][1] = local16;
		local16 = new byte[arg0 * arg0];
		local18 = 0;
		@Pc(1362) int local1362;
		for (local1311 = arg0 - 1; local1311 >= 0; local1311--) {
			for (local1362 = arg0 - 1; local1362 >= 0; local1362--) {
				if (local1311 - arg0 / 2 <= local1362) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[7][2] = local16;
		local18 = 0;
		local16 = new byte[arg0 * arg0];
		for (local1362 = 0; local1362 < arg0; local1362++) {
			for (@Pc(1412) int local1412 = arg0 - 1; local1412 >= 0; local1412--) {
				if (local1362 - arg0 / 2 <= local1412) {
					local16[local18] = -1;
				}
				local18++;
			}
		}
		local7[7][3] = local16;
		return local7;
	}

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "(IB)I")
	public static int method4096(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIII)V")
	public static void method4097(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 > arg2) {
			Static15.method463(arg1, Static376.anIntArrayArray64[arg0], arg2, arg3);
		} else {
			Static15.method463(arg1, Static376.anIntArrayArray64[arg0], arg3, arg2);
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lclient!bt;I)V")
	public static void method4098(@OriginalArg(0) Class3_Sub2 arg0) {
		for (@Pc(5) int local5 = 0; local5 < Static391.anInt6742; local5++) {
			@Pc(10) int local10 = arg0.method6040();
			@Pc(14) int local14 = arg0.method6004();
			if (local14 == 65535) {
				local14 = -1;
			}
			if (Static35.aClass145_Sub1Array7[local10] != null) {
				Static35.aClass145_Sub1Array7[local10].anInt4478 = local14;
			}
		}
	}
}
