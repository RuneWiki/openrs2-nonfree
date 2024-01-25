import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!mha", name = "I", descriptor = "[B")
	public static byte[] aByteArray101;

	@OriginalMember(owner = "client!mha", name = "G", descriptor = "Lclient!ip;")
	public static Class4_Sub1_Sub1_Sub2_Sub1 aClass4_Sub1_Sub1_Sub2_Sub1_4;

	@OriginalMember(owner = "client!mha", name = "K", descriptor = "I")
	public static int anInt9811 = -1;

	@OriginalMember(owner = "client!mha", name = "D", descriptor = "I")
	public static int anInt9812 = 0;

	@OriginalMember(owner = "client!mha", name = "y", descriptor = "I")
	public static int anInt9813 = 0;

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(IB)[[[B")
	public static byte[][][] method8359(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
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
		@Pc(79) int local79;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local79 = 0; local79 < arg0; local79++) {
				if (local26 >= local79) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(129) int local129;
		for (local79 = 0; local79 < arg0; local79++) {
			for (local129 = 0; local129 < arg0; local129++) {
				if (local129 >= local79) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(182) int local182;
		for (local129 = arg0 - 1; local129 >= 0; local129--) {
			for (local182 = 0; local182 < arg0; local182++) {
				if (local129 <= local182) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(238) int local238;
		for (local182 = arg0 - 1; local182 >= 0; local182--) {
			for (local238 = 0; local238 < arg0; local238++) {
				if (local238 <= local182 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(294) int local294;
		for (local238 = 0; local238 < arg0; local238++) {
			for (local294 = 0; local294 < arg0; local294++) {
				if (local20 >= 0 && local20 < local18.length) {
					if (local238 << 1 <= local294) {
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
		@Pc(364) int local364;
		for (local294 = 0; local294 < arg0; local294++) {
			for (local364 = arg0 - 1; local364 >= 0; local364--) {
				if (local364 <= local294 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(423) int local423;
		for (local364 = arg0 - 1; local364 >= 0; local364--) {
			for (local423 = arg0 - 1; local423 >= 0; local423--) {
				if (local364 << 1 <= local423) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(484) int local484;
		for (local423 = arg0 - 1; local423 >= 0; local423--) {
			for (local484 = arg0 - 1; local484 >= 0; local484--) {
				if (local423 >> 1 >= local484) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(536) int local536;
		for (local484 = arg0 - 1; local484 >= 0; local484--) {
			for (local536 = 0; local536 < arg0; local536++) {
				if (local484 << 1 <= local536) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(590) int local590;
		for (local536 = 0; local536 < arg0; local536++) {
			for (local590 = 0; local590 < arg0; local590++) {
				if (local590 <= local536 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		if (arg1 < 104) {
			return null;
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(657) int local657;
		for (local590 = 0; local590 < arg0; local590++) {
			for (local657 = arg0 - 1; local657 >= 0; local657--) {
				if (local590 << 1 <= local657) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(710) int local710;
		for (local657 = arg0 - 1; local657 >= 0; local657--) {
			for (local710 = 0; local710 < arg0; local710++) {
				if (local710 >= local657 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(761) int local761;
		for (local710 = 0; local710 < arg0; local710++) {
			for (local761 = 0; local761 < arg0; local761++) {
				if (local761 <= local710 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(812) int local812;
		for (local761 = 0; local761 < arg0; local761++) {
			for (local812 = arg0 - 1; local812 >= 0; local812--) {
				if (local761 >> 1 <= local812) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(872) int local872;
		for (local812 = arg0 - 1; local812 >= 0; local812--) {
			for (local872 = arg0 - 1; local872 >= 0; local872--) {
				if (local872 <= local812 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(930) int local930;
		for (local872 = arg0 - 1; local872 >= 0; local872--) {
			for (local930 = arg0 - 1; local930 >= 0; local930--) {
				if (local872 >> 1 <= local930) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(983) int local983;
		for (local930 = arg0 - 1; local930 >= 0; local930--) {
			for (local983 = 0; local983 < arg0; local983++) {
				if (local930 << 1 >= local983) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1035) int local1035;
		for (local983 = 0; local983 < arg0; local983++) {
			for (local1035 = 0; local1035 < arg0; local1035++) {
				if (local983 >> 1 <= local1035) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1090) int local1090;
		for (local1035 = 0; local1035 < arg0; local1035++) {
			for (local1090 = arg0 - 1; local1090 >= 0; local1090--) {
				if (local1035 << 1 >= local1090) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1146) int local1146;
		for (local1090 = 0; local1090 < arg0; local1090++) {
			for (local1146 = 0; local1146 < arg0; local1146++) {
				if (local1146 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1195) int local1195;
		for (local1146 = 0; local1146 < arg0; local1146++) {
			for (local1195 = 0; local1195 < arg0; local1195++) {
				if (arg0 / 2 >= local1146) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1252) int local1252;
		for (local1195 = 0; local1195 < arg0; local1195++) {
			for (local1252 = 0; local1252 < arg0; local1252++) {
				if (arg0 / 2 <= local1252) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1305) int local1305;
		for (local1252 = 0; local1252 < arg0; local1252++) {
			for (local1305 = 0; local1305 < arg0; local1305++) {
				if (local1252 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1358) int local1358;
		for (local1305 = 0; local1305 < arg0; local1305++) {
			for (local1358 = 0; local1358 < arg0; local1358++) {
				if (local1358 <= local1305 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1420) int local1420;
		for (local1358 = arg0 - 1; local1358 >= 0; local1358--) {
			for (local1420 = 0; local1420 < arg0; local1420++) {
				if (local1420 <= local1358 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1478) int local1478;
		for (local1420 = arg0 - 1; local1420 >= 0; local1420--) {
			for (local1478 = arg0 - 1; local1478 >= 0; local1478--) {
				if (local1478 <= local1420 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1540) int local1540;
		for (local1478 = 0; local1478 < arg0; local1478++) {
			for (local1540 = arg0 - 1; local1540 >= 0; local1540--) {
				if (local1478 - arg0 / 2 >= local1540) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1595) int local1595;
		for (local1540 = 0; local1540 < arg0; local1540++) {
			for (local1595 = 0; local1595 < arg0; local1595++) {
				if (local1540 - arg0 / 2 <= local1595) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1656) int local1656;
		for (local1595 = arg0 - 1; local1595 >= 0; local1595--) {
			for (local1656 = 0; local1656 < arg0; local1656++) {
				if (local1595 - arg0 / 2 <= local1656) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1714) int local1714;
		for (local1656 = arg0 - 1; local1656 >= 0; local1656--) {
			for (local1714 = arg0 - 1; local1714 >= 0; local1714--) {
				if (local1656 - arg0 / 2 <= local1714) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		for (local1714 = 0; local1714 < arg0; local1714++) {
			for (@Pc(1769) int local1769 = arg0 - 1; local1769 >= 0; local1769--) {
				if (local1714 - arg0 / 2 <= local1769) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!mha", name = "c", descriptor = "(III)Lclient!gf;")
	public static Class128 method8360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static283.aClass128ArrayArrayArray1[arg0][arg1][arg2] == null) {
			@Pc(33) boolean local33 = Static283.aClass128ArrayArrayArray1[0][arg1][arg2] != null && Static283.aClass128ArrayArrayArray1[0][arg1][arg2].aClass128_1 != null;
			if (local33 && arg0 >= Static237.anInt4100 - 1) {
				return null;
			}
			Static241.method3845(arg0, arg1, arg2);
		}
		return Static283.aClass128ArrayArrayArray1[arg0][arg1][arg2];
	}
}
