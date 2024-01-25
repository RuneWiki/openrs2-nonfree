import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!mh", name = "k", descriptor = "I")
	public static int anInt6168;

	@OriginalMember(owner = "client!mh", name = "m", descriptor = "I")
	public static int anInt6169;

	@OriginalMember(owner = "client!mh", name = "j", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_166 = new Class363(13, -1);

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZI)[[[B")
	public static byte[][][] method5123(@OriginalArg(1) int arg0) {
		@Pc(9) byte[][][] local9 = new byte[8][4][];
		@Pc(18) byte[] local18 = new byte[arg0 * arg0];
		@Pc(20) int local20 = 0;
		@Pc(26) int local26;
		for (@Pc(22) int local22 = 0; local22 < arg0; local22++) {
			for (local26 = 0; local26 < arg0; local26++) {
				if (local26 <= local22) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(69) int local69;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local69 = 0; local69 < arg0; local69++) {
				if (local26 >= local69) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(108) int local108;
		for (local69 = 0; local69 < arg0; local69++) {
			for (local108 = 0; local108 < arg0; local108++) {
				if (local69 <= local108) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(151) int local151;
		for (local108 = arg0 - 1; local108 >= 0; local108--) {
			for (local151 = 0; local151 < arg0; local151++) {
				if (local108 <= local151) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(196) int local196;
		for (local151 = arg0 - 1; local151 >= 0; local151--) {
			for (local196 = 0; local196 < arg0; local196++) {
				if (local196 <= local151 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(242) int local242;
		for (local196 = 0; local196 < arg0; local196++) {
			for (local242 = 0; local242 < arg0; local242++) {
				if (local20 >= 0 && local20 < local18.length) {
					if (local196 << 1 <= local242) {
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
		@Pc(307) int local307;
		for (local242 = 0; local242 < arg0; local242++) {
			for (local307 = arg0 - 1; local307 >= 0; local307--) {
				if (local307 <= local242 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(353) int local353;
		for (local307 = arg0 - 1; local307 >= 0; local307--) {
			for (local353 = arg0 - 1; local353 >= 0; local353--) {
				if (local353 >= local307 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(401) int local401;
		for (local353 = arg0 - 1; local353 >= 0; local353--) {
			for (local401 = arg0 - 1; local401 >= 0; local401--) {
				if (local353 >> 1 >= local401) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(443) int local443;
		for (local401 = arg0 - 1; local401 >= 0; local401--) {
			for (local443 = 0; local443 < arg0; local443++) {
				if (local443 >= local401 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(489) int local489;
		for (local443 = 0; local443 < arg0; local443++) {
			for (local489 = 0; local489 < arg0; local489++) {
				if (local443 >> 1 >= local489) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(534) int local534;
		for (local489 = 0; local489 < arg0; local489++) {
			for (local534 = arg0 - 1; local534 >= 0; local534--) {
				if (local534 >= local489 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(574) int local574;
		for (local534 = arg0 - 1; local534 >= 0; local534--) {
			for (local574 = 0; local574 < arg0; local574++) {
				if (local574 >= local534 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(616) int local616;
		for (local574 = 0; local574 < arg0; local574++) {
			for (local616 = 0; local616 < arg0; local616++) {
				if (local574 << 1 >= local616) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(661) int local661;
		for (local616 = 0; local616 < arg0; local616++) {
			for (local661 = arg0 - 1; local661 >= 0; local661--) {
				if (local616 >> 1 <= local661) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(710) int local710;
		for (local661 = arg0 - 1; local661 >= 0; local661--) {
			for (local710 = arg0 - 1; local710 >= 0; local710--) {
				if (local661 << 1 >= local710) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(757) int local757;
		for (local710 = arg0 - 1; local710 >= 0; local710--) {
			for (local757 = arg0 - 1; local757 >= 0; local757--) {
				if (local710 >> 1 <= local757) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(800) int local800;
		for (local757 = arg0 - 1; local757 >= 0; local757--) {
			for (local800 = 0; local800 < arg0; local800++) {
				if (local757 << 1 >= local800) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(842) int local842;
		for (local800 = 0; local800 < arg0; local800++) {
			for (local842 = 0; local842 < arg0; local842++) {
				if (local800 >> 1 <= local842) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(887) int local887;
		for (local842 = 0; local842 < arg0; local842++) {
			for (local887 = arg0 - 1; local887 >= 0; local887--) {
				if (local842 << 1 >= local887) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(933) int local933;
		for (local887 = 0; local887 < arg0; local887++) {
			for (local933 = 0; local933 < arg0; local933++) {
				if (local933 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(976) int local976;
		for (local933 = 0; local933 < arg0; local933++) {
			for (local976 = 0; local976 < arg0; local976++) {
				if (local933 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1019) int local1019;
		for (local976 = 0; local976 < arg0; local976++) {
			for (local1019 = 0; local1019 < arg0; local1019++) {
				if (local1019 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1062) int local1062;
		for (local1019 = 0; local1019 < arg0; local1019++) {
			for (local1062 = 0; local1062 < arg0; local1062++) {
				if (arg0 / 2 <= local1019) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1113) int local1113;
		for (local1062 = 0; local1062 < arg0; local1062++) {
			for (local1113 = 0; local1113 < arg0; local1113++) {
				if (local1113 <= local1062 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1164) int local1164;
		for (local1113 = arg0 - 1; local1113 >= 0; local1113--) {
			for (local1164 = 0; local1164 < arg0; local1164++) {
				if (local1113 - arg0 / 2 >= local1164) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1217) int local1217;
		for (local1164 = arg0 - 1; local1164 >= 0; local1164--) {
			for (local1217 = arg0 - 1; local1217 >= 0; local1217--) {
				if (local1217 <= local1164 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1262) int local1262;
		for (local1217 = 0; local1217 < arg0; local1217++) {
			for (local1262 = arg0 - 1; local1262 >= 0; local1262--) {
				if (local1217 - arg0 / 2 >= local1262) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1310) int local1310;
		for (local1262 = 0; local1262 < arg0; local1262++) {
			for (local1310 = 0; local1310 < arg0; local1310++) {
				if (local1262 - arg0 / 2 <= local1310) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1365) int local1365;
		for (local1310 = arg0 - 1; local1310 >= 0; local1310--) {
			for (local1365 = 0; local1365 < arg0; local1365++) {
				if (local1310 - arg0 / 2 <= local1365) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1418) int local1418;
		for (local1365 = arg0 - 1; local1365 >= 0; local1365--) {
			for (local1418 = arg0 - 1; local1418 >= 0; local1418--) {
				if (local1365 - arg0 / 2 <= local1418) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1418 = 0; local1418 < arg0; local1418++) {
			for (@Pc(1464) int local1464 = arg0 - 1; local1464 >= 0; local1464--) {
				if (local1464 >= local1418 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZZ)V")
	public static void method5125(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static554.anInt9121 != -1) {
				Static309.method4628(Static554.anInt9121);
			}
			for (@Pc(22) Class2_Sub44 local22 = (Class2_Sub44) Static217.aClass162_20.method3527(); local22 != null; local22 = (Class2_Sub44) Static217.aClass162_20.method3523()) {
				if (!local22.method7968()) {
					local22 = (Class2_Sub44) Static217.aClass162_20.method3527();
					if (local22 == null) {
						break;
					}
				}
				Static564.method7655(false, true, local22);
			}
			Static554.anInt9121 = -1;
			Static217.aClass162_20 = new Class162(8);
			Static308.method4597();
			Static554.anInt9121 = Static321.anInt5973;
			Static75.method1189(false);
			Static139.method2348();
			Static552.method7488(Static554.anInt9121);
		}
		Static527.aBoolean670 = true;
	}
}
