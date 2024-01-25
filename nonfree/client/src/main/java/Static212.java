import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!nl", name = "j", descriptor = "[I")
	public static int[] anIntArray453;

	@OriginalMember(owner = "client!nl", name = "h", descriptor = "[C")
	public static final char[] aCharArray3 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!nl", name = "i", descriptor = "[S")
	public static short[] aShortArray70 = new short[256];

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)[[[B")
	public static byte[][][] method3767(@OriginalArg(1) int arg0) {
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
		@Pc(74) int local74;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local74 = 0; local74 < arg0; local74++) {
				if (local74 <= local26) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(114) int local114;
		for (local74 = 0; local74 < arg0; local74++) {
			for (local114 = 0; local114 < arg0; local114++) {
				if (local114 >= local74) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(157) int local157;
		for (local114 = arg0 - 1; local114 >= 0; local114--) {
			for (local157 = 0; local157 < arg0; local157++) {
				if (local114 <= local157) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(202) int local202;
		for (local157 = arg0 - 1; local157 >= 0; local157--) {
			for (local202 = 0; local202 < arg0; local202++) {
				if (local202 <= local157 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(244) int local244;
		for (local202 = 0; local202 < arg0; local202++) {
			for (local244 = 0; local244 < arg0; local244++) {
				if (local20 >= 0 && local20 < local18.length) {
					if (local244 >= local202 << 1) {
						local18[local20] = -1;
					}
					local20++;
				} else {
					local20++;
				}
			}
		}
		local9[1][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(305) int local305;
		for (local244 = 0; local244 < arg0; local244++) {
			for (local305 = arg0 - 1; local305 >= 0; local305--) {
				if (local244 >> 1 >= local305) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(358) int local358;
		for (local305 = arg0 - 1; local305 >= 0; local305--) {
			for (local358 = arg0 - 1; local358 >= 0; local358--) {
				if (local358 >= local305 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(399) int local399;
		for (local358 = arg0 - 1; local358 >= 0; local358--) {
			for (local399 = arg0 - 1; local399 >= 0; local399--) {
				if (local358 >> 1 >= local399) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(441) int local441;
		for (local399 = arg0 - 1; local399 >= 0; local399--) {
			for (local441 = 0; local441 < arg0; local441++) {
				if (local399 << 1 <= local441) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(490) int local490;
		for (local441 = 0; local441 < arg0; local441++) {
			for (local490 = 0; local490 < arg0; local490++) {
				if (local441 >> 1 >= local490) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(535) int local535;
		for (local490 = 0; local490 < arg0; local490++) {
			for (local535 = arg0 - 1; local535 >= 0; local535--) {
				if (local490 << 1 <= local535) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(579) int local579;
		for (local535 = arg0 - 1; local535 >= 0; local535--) {
			for (local579 = 0; local579 < arg0; local579++) {
				if (local535 >> 1 <= local579) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(625) int local625;
		for (local579 = 0; local579 < arg0; local579++) {
			for (local625 = 0; local625 < arg0; local625++) {
				if (local579 << 1 >= local625) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(670) int local670;
		for (local625 = 0; local625 < arg0; local625++) {
			for (local670 = arg0 - 1; local670 >= 0; local670--) {
				if (local625 >> 1 <= local670) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(720) int local720;
		for (local670 = arg0 - 1; local670 >= 0; local670--) {
			for (local720 = arg0 - 1; local720 >= 0; local720--) {
				if (local670 << 1 >= local720) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(764) int local764;
		for (local720 = arg0 - 1; local720 >= 0; local720--) {
			for (local764 = arg0 - 1; local764 >= 0; local764--) {
				if (local764 >= local720 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(810) int local810;
		for (local764 = arg0 - 1; local764 >= 0; local764--) {
			for (local810 = 0; local810 < arg0; local810++) {
				if (local810 <= local764 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(848) int local848;
		for (local810 = 0; local810 < arg0; local810++) {
			for (local848 = 0; local848 < arg0; local848++) {
				if (local810 >> 1 <= local848) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(897) int local897;
		for (local848 = 0; local848 < arg0; local848++) {
			for (local897 = arg0 - 1; local897 >= 0; local897--) {
				if (local848 << 1 >= local897) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(939) int local939;
		for (local897 = 0; local897 < arg0; local897++) {
			for (local939 = 0; local939 < arg0; local939++) {
				if (arg0 / 2 >= local939) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(982) int local982;
		for (local939 = 0; local939 < arg0; local939++) {
			for (local982 = 0; local982 < arg0; local982++) {
				if (local939 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1025) int local1025;
		for (local982 = 0; local982 < arg0; local982++) {
			for (local1025 = 0; local1025 < arg0; local1025++) {
				if (arg0 / 2 <= local1025) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1072) int local1072;
		for (local1025 = 0; local1025 < arg0; local1025++) {
			for (local1072 = 0; local1072 < arg0; local1072++) {
				if (arg0 / 2 <= local1025) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1119) int local1119;
		for (local1072 = 0; local1072 < arg0; local1072++) {
			for (local1119 = 0; local1119 < arg0; local1119++) {
				if (local1119 <= local1072 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1170) int local1170;
		for (local1119 = arg0 - 1; local1119 >= 0; local1119--) {
			for (local1170 = 0; local1170 < arg0; local1170++) {
				if (local1119 - arg0 / 2 >= local1170) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1219) int local1219;
		for (local1170 = arg0 - 1; local1170 >= 0; local1170--) {
			for (local1219 = arg0 - 1; local1219 >= 0; local1219--) {
				if (local1170 - arg0 / 2 >= local1219) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1261) int local1261;
		for (local1219 = 0; local1219 < arg0; local1219++) {
			for (local1261 = arg0 - 1; local1261 >= 0; local1261--) {
				if (local1261 <= local1219 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1309) int local1309;
		for (local1261 = 0; local1261 < arg0; local1261++) {
			for (local1309 = 0; local1309 < arg0; local1309++) {
				if (local1309 >= local1261 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1357) int local1357;
		for (local1309 = arg0 - 1; local1309 >= 0; local1309--) {
			for (local1357 = 0; local1357 < arg0; local1357++) {
				if (local1357 >= local1309 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1402) int local1402;
		for (local1357 = arg0 - 1; local1357 >= 0; local1357--) {
			for (local1402 = arg0 - 1; local1402 >= 0; local1402--) {
				if (local1357 - arg0 / 2 <= local1402) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1402 = 0; local1402 < arg0; local1402++) {
			for (@Pc(1454) int local1454 = arg0 - 1; local1454 >= 0; local1454--) {
				if (local1454 >= local1402 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(II)Lclient!me;")
	public static Class133 method3768(@OriginalArg(0) int arg0) {
		@Pc(12) Class133 local12 = (Class133) Static232.aClass70_77.method1396((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static326.aClass53_148.method1033(arg0, 30);
		local12 = new Class133();
		if (local22 != null) {
			local12.method3557(new Class6_Sub10(local22), arg0);
		}
		Static232.aClass70_77.method1406(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILclient!qp;)I")
	public static int method3770(@OriginalArg(1) Class6_Sub32 arg0) {
		@Pc(12) String local12 = Static196.method3623(arg0);
		@Pc(14) int[] local14 = null;
		if (Static153.method3085(arg0.anInt4932)) {
			local14 = Static211.method3762((int) arg0.aLong156).anIntArray465;
		} else if (Static166.method3284(arg0.anInt4932)) {
			@Pc(38) Class44_Sub4_Sub4_Sub2 local38 = Static239.aClass44_Sub4_Sub4_Sub2Array8[(int) arg0.aLong156];
			if (local38 != null) {
				local14 = local38.aClass18_1.anIntArray38;
			}
		} else if (Static341.method5621(arg0.anInt4932)) {
			if (arg0.anInt4932 == 1004) {
				local14 = Static196.method3622((int) arg0.aLong156).anIntArray163;
			} else {
				local14 = Static196.method3622((int) (arg0.aLong156 >>> 32 & 0x7FFFFFFFL)).anIntArray163;
			}
		}
		if (local14 != null) {
			local12 = local12 + Static276.method4748(local14);
		}
		return Static220.aClass26_6.method505(local12, Static291.aClass40Array35);
	}

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "(II)I")
	public static int method3771(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(BI)V")
	public static void method3772() {
		Static47.aClass70_23.method1397(5);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V")
	public static void method3773() {
		for (@Pc(15) Class6_Sub2_Sub4 local15 = (Class6_Sub2_Sub4) Static280.aClass211_32.method5594(); local15 != null; local15 = (Class6_Sub2_Sub4) Static280.aClass211_32.method5582()) {
			@Pc(20) Class44_Sub4_Sub2 local20 = local15.aClass44_Sub4_Sub2_1;
			if (Static343.anInt6225 != local20.aByte90 || local20.aBoolean234) {
				local15.method5756();
				local20.method3389();
			} else if (Static76.anInt2853 >= local20.anInt3274) {
				local20.method3390(Static133.anInt2448);
				if (local20.aBoolean234) {
					local15.method5756();
				} else {
					Static73.method1271(local20, true);
				}
			}
		}
	}
}
