import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static524 {

	@OriginalMember(owner = "client!vt", name = "n", descriptor = "I")
	public static int anInt9120;

	@OriginalMember(owner = "client!vt", name = "l", descriptor = "Lclient!vt;")
	public static final Class310 aClass310_20 = new Class310(4);

	@OriginalMember(owner = "client!vt", name = "h", descriptor = "Lclient!vt;")
	public static final Class310 aClass310_16 = new Class310(1);

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "Lclient!vt;")
	public static final Class310 aClass310_13 = new Class310(1);

	@OriginalMember(owner = "client!vt", name = "d", descriptor = "Lclient!vt;")
	public static final Class310 aClass310_14 = new Class310(2);

	@OriginalMember(owner = "client!vt", name = "f", descriptor = "Lclient!vt;")
	public static final Class310 aClass310_15 = new Class310(4);

	@OriginalMember(owner = "client!vt", name = "i", descriptor = "Lclient!vt;")
	public static final Class310 aClass310_17 = new Class310(2);

	@OriginalMember(owner = "client!vt", name = "j", descriptor = "Lclient!vt;")
	public static final Class310 aClass310_18 = new Class310(4);

	@OriginalMember(owner = "client!vt", name = "k", descriptor = "Lclient!vt;")
	public static final Class310 aClass310_19 = new Class310(2);

	@OriginalMember(owner = "client!vt", name = "m", descriptor = "Lclient!fea;")
	public static final Class87 aClass87_7 = new Class87();

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(II)[[[B")
	public static byte[][][] method7520(@OriginalArg(0) int arg0) {
		@Pc(9) byte[][][] local9 = new byte[8][4][];
		@Pc(18) byte[] local18 = new byte[arg0 * arg0];
		@Pc(20) int local20 = 0;
		@Pc(26) int local26;
		for (@Pc(22) int local22 = 0; local22 < arg0; local22++) {
			for (local26 = 0; local26 < arg0; local26++) {
				if (local22 >= local26) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(73) int local73;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local73 = 0; local73 < arg0; local73++) {
				if (local73 <= local26) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(109) int local109;
		for (local73 = 0; local73 < arg0; local73++) {
			for (local109 = 0; local109 < arg0; local109++) {
				if (local73 <= local109) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(152) int local152;
		for (local109 = arg0 - 1; local109 >= 0; local109--) {
			for (local152 = 0; local152 < arg0; local152++) {
				if (local109 <= local152) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(193) int local193;
		for (local152 = arg0 - 1; local152 >= 0; local152--) {
			for (local193 = 0; local193 < arg0; local193++) {
				if (local152 >> 1 >= local193) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(231) int local231;
		for (local193 = 0; local193 < arg0; local193++) {
			for (local231 = 0; local231 < arg0; local231++) {
				if (local20 >= 0 && local20 < local18.length) {
					if (local193 << 1 <= local231) {
						local18[local20] = -1;
					}
					local20++;
				} else {
					local20++;
				}
			}
		}
		local9[1][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(284) int local284;
		for (local231 = 0; local231 < arg0; local231++) {
			for (local284 = arg0 - 1; local284 >= 0; local284--) {
				if (local231 >> 1 >= local284) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(334) int local334;
		for (local284 = arg0 - 1; local284 >= 0; local284--) {
			for (local334 = arg0 - 1; local334 >= 0; local334--) {
				if (local284 << 1 <= local334) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(378) int local378;
		for (local334 = arg0 - 1; local334 >= 0; local334--) {
			for (local378 = arg0 - 1; local378 >= 0; local378--) {
				if (local378 <= local334 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(417) int local417;
		for (local378 = arg0 - 1; local378 >= 0; local378--) {
			for (local417 = 0; local417 < arg0; local417++) {
				if (local417 >= local378 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(458) int local458;
		for (local417 = 0; local417 < arg0; local417++) {
			for (local458 = 0; local458 < arg0; local458++) {
				if (local417 >> 1 >= local458) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(503) int local503;
		for (local458 = 0; local458 < arg0; local458++) {
			for (local503 = arg0 - 1; local503 >= 0; local503--) {
				if (local503 >= local458 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(546) int local546;
		for (local503 = arg0 - 1; local503 >= 0; local503--) {
			for (local546 = 0; local546 < arg0; local546++) {
				if (local546 >= local503 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(591) int local591;
		for (local546 = 0; local546 < arg0; local546++) {
			for (local591 = 0; local591 < arg0; local591++) {
				if (local546 << 1 >= local591) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(640) int local640;
		for (local591 = 0; local591 < arg0; local591++) {
			for (local640 = arg0 - 1; local640 >= 0; local640--) {
				if (local591 >> 1 <= local640) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(693) int local693;
		for (local640 = arg0 - 1; local640 >= 0; local640--) {
			for (local693 = arg0 - 1; local693 >= 0; local693--) {
				if (local693 <= local640 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(737) int local737;
		for (local693 = arg0 - 1; local693 >= 0; local693--) {
			for (local737 = arg0 - 1; local737 >= 0; local737--) {
				if (local737 >= local693 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(776) int local776;
		for (local737 = arg0 - 1; local737 >= 0; local737--) {
			for (local776 = 0; local776 < arg0; local776++) {
				if (local776 <= local737 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(821) int local821;
		for (local776 = 0; local776 < arg0; local776++) {
			for (local821 = 0; local821 < arg0; local821++) {
				if (local776 >> 1 <= local821) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(866) int local866;
		for (local821 = 0; local821 < arg0; local821++) {
			for (local866 = arg0 - 1; local866 >= 0; local866--) {
				if (local821 << 1 >= local866) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(904) int local904;
		for (local866 = 0; local866 < arg0; local866++) {
			for (local904 = 0; local904 < arg0; local904++) {
				if (local904 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(951) int local951;
		for (local904 = 0; local904 < arg0; local904++) {
			for (local951 = 0; local951 < arg0; local951++) {
				if (arg0 / 2 >= local904) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(998) int local998;
		for (local951 = 0; local951 < arg0; local951++) {
			for (local998 = 0; local998 < arg0; local998++) {
				if (arg0 / 2 <= local998) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1045) int local1045;
		for (local998 = 0; local998 < arg0; local998++) {
			for (local1045 = 0; local1045 < arg0; local1045++) {
				if (local998 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1092) int local1092;
		for (local1045 = 0; local1045 < arg0; local1045++) {
			for (local1092 = 0; local1092 < arg0; local1092++) {
				if (local1092 <= local1045 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1148) int local1148;
		for (local1092 = arg0 - 1; local1092 >= 0; local1092--) {
			for (local1148 = 0; local1148 < arg0; local1148++) {
				if (local1092 - arg0 / 2 >= local1148) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1197) int local1197;
		for (local1148 = arg0 - 1; local1148 >= 0; local1148--) {
			for (local1197 = arg0 - 1; local1197 >= 0; local1197--) {
				if (local1148 - arg0 / 2 >= local1197) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1242) int local1242;
		for (local1197 = 0; local1197 < arg0; local1197++) {
			for (local1242 = arg0 - 1; local1242 >= 0; local1242--) {
				if (local1242 <= local1197 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1290) int local1290;
		for (local1242 = 0; local1242 < arg0; local1242++) {
			for (local1290 = 0; local1290 < arg0; local1290++) {
				if (local1290 >= local1242 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1337) int local1337;
		for (local1290 = arg0 - 1; local1290 >= 0; local1290--) {
			for (local1337 = 0; local1337 < arg0; local1337++) {
				if (local1290 - arg0 / 2 <= local1337) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1386) int local1386;
		for (local1337 = arg0 - 1; local1337 >= 0; local1337--) {
			for (local1386 = arg0 - 1; local1386 >= 0; local1386--) {
				if (local1337 - arg0 / 2 <= local1386) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1386 = 0; local1386 < arg0; local1386++) {
			for (@Pc(1431) int local1431 = arg0 - 1; local1431 >= 0; local1431--) {
				if (local1431 >= local1386 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method7521(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static178.anInt4133; local16++) {
			if (arg0.equalsIgnoreCase(Static520.aStringArray49[local16])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static111.aClass6_Sub1_Sub2_Sub1_3.aString27);
	}
}
