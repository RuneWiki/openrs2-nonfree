import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static602 {

	@OriginalMember(owner = "client!uha", name = "e", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_116 = new Class387(4, 18);

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(BI)Lclient!jd;")
	public static Class184 method8655(@OriginalArg(1) int arg0) {
		@Pc(10) Class184 local10 = (Class184) Static461.aClass391_59.method9275((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static28.aClass208_122.method4991(0, arg0, 84);
		local10 = new Class184();
		if (local28 != null) {
			local10.method4028(new Class5_Sub23(local28));
		}
		local10.method4029();
		Static461.aClass391_59.method9273((long) arg0, local10, 1);
		return local10;
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(IIII)I")
	public static int method8656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static270.anInt4694 < 100) {
			return -2;
		}
		@Pc(13) int local13 = -2;
		@Pc(21) int local21 = Integer.MAX_VALUE;
		@Pc(26) int local26 = arg2 - Static629.anInt9765;
		@Pc(31) int local31 = arg0 - Static629.anInt9763;
		for (@Pc(36) Class5_Sub8 local36 = (Class5_Sub8) Static629.aClass102_69.method1916(); local36 != null; local36 = (Class5_Sub8) Static629.aClass102_69.method1915()) {
			if (arg1 == local36.anInt1429) {
				@Pc(47) int local47 = local36.anInt1430;
				@Pc(50) int local50 = local36.anInt1432;
				@Pc(61) int local61 = local50 + Static629.anInt9763 | Static629.anInt9765 + local47 << 14;
				@Pc(82) int local82 = (local26 - local47) * (-local47 + local26) + (local31 - local50) * (-local50 + local31);
				if (local13 < 0 || local21 > local82) {
					local13 = local61;
					local21 = local82;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(I)V")
	public static void method8657() {
		for (@Pc(21) Class5_Sub9 local21 = (Class5_Sub9) Static134.aClass291_12.method6987(); local21 != null; local21 = (Class5_Sub9) Static134.aClass291_12.method6989()) {
			if (local21.aClass272_Sub1_1.method6461()) {
				Static441.method6513(local21.anInt1440);
			} else {
				local21.aClass272_Sub1_1.method6475();
				try {
					local21.aClass272_Sub1_1.method6458();
				} catch (@Pc(40) Exception local40) {
					Static405.method5934("TV: " + local21.anInt1440, local40);
					Static441.method6513(local21.anInt1440);
				}
				if (!local21.aBoolean144 && !local21.aBoolean143) {
					@Pc(70) Class5_Sub12_Sub2 local70 = local21.aClass272_Sub1_1.method6459();
					if (local70 != null) {
						@Pc(76) Class5_Sub16_Sub2 local76 = local70.method4969();
						if (local76 != null) {
							local76.method3104(local21.anInt1438);
							Static91.aClass5_Sub16_Sub1_1.method2555(local76);
							local21.aBoolean144 = true;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uha", name = "b", descriptor = "(II)[[[B")
	public static byte[][][] method8659(@OriginalArg(0) int arg0) {
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
		local18 = new byte[arg0 * arg0];
		local20 = 0;
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
				if (local79 <= local129) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
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
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(230) int local230;
		for (local182 = arg0 - 1; local182 >= 0; local182--) {
			for (local230 = 0; local230 < arg0; local230++) {
				if (local230 <= local182 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(289) int local289;
		for (local230 = 0; local230 < arg0; local230++) {
			for (local289 = 0; local289 < arg0; local289++) {
				if (local20 >= 0 && local18.length > local20) {
					if (local230 << 1 <= local289) {
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
		@Pc(359) int local359;
		for (local289 = 0; local289 < arg0; local289++) {
			for (local359 = arg0 - 1; local359 >= 0; local359--) {
				if (local359 <= local289 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(415) int local415;
		for (local359 = arg0 - 1; local359 >= 0; local359--) {
			for (local415 = arg0 - 1; local415 >= 0; local415--) {
				if (local415 >= local359 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(473) int local473;
		for (local415 = arg0 - 1; local415 >= 0; local415--) {
			for (local473 = arg0 - 1; local473 >= 0; local473--) {
				if (local473 <= local415 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(529) int local529;
		for (local473 = arg0 - 1; local473 >= 0; local473--) {
			for (local529 = 0; local529 < arg0; local529++) {
				if (local473 << 1 <= local529) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(577) int local577;
		for (local529 = 0; local529 < arg0; local529++) {
			for (local577 = 0; local577 < arg0; local577++) {
				if (local529 >> 1 >= local577) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(632) int local632;
		for (local577 = 0; local577 < arg0; local577++) {
			for (local632 = arg0 - 1; local632 >= 0; local632--) {
				if (local577 << 1 <= local632) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(686) int local686;
		for (local632 = arg0 - 1; local632 >= 0; local632--) {
			for (local686 = 0; local686 < arg0; local686++) {
				if (local686 >= local632 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(738) int local738;
		for (local686 = 0; local686 < arg0; local686++) {
			for (local738 = 0; local738 < arg0; local738++) {
				if (local738 <= local686 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(797) int local797;
		for (local738 = 0; local738 < arg0; local738++) {
			for (local797 = arg0 - 1; local797 >= 0; local797--) {
				if (local797 >= local738 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(856) int local856;
		for (local797 = arg0 - 1; local797 >= 0; local797--) {
			for (local856 = arg0 - 1; local856 >= 0; local856--) {
				if (local856 <= local797 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(910) int local910;
		for (local856 = arg0 - 1; local856 >= 0; local856--) {
			for (local910 = arg0 - 1; local910 >= 0; local910--) {
				if (local910 >= local856 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(965) int local965;
		for (local910 = arg0 - 1; local910 >= 0; local910--) {
			for (local965 = 0; local965 < arg0; local965++) {
				if (local965 <= local910 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1020) int local1020;
		for (local965 = 0; local965 < arg0; local965++) {
			for (local1020 = 0; local1020 < arg0; local1020++) {
				if (local965 >> 1 <= local1020) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1079) int local1079;
		for (local1020 = 0; local1020 < arg0; local1020++) {
			for (local1079 = arg0 - 1; local1079 >= 0; local1079--) {
				if (local1020 << 1 >= local1079) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1131) int local1131;
		for (local1079 = 0; local1079 < arg0; local1079++) {
			for (local1131 = 0; local1131 < arg0; local1131++) {
				if (arg0 / 2 >= local1131) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1184) int local1184;
		for (local1131 = 0; local1131 < arg0; local1131++) {
			for (local1184 = 0; local1184 < arg0; local1184++) {
				if (local1131 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1233) int local1233;
		for (local1184 = 0; local1184 < arg0; local1184++) {
			for (local1233 = 0; local1233 < arg0; local1233++) {
				if (local1233 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1290) int local1290;
		for (local1233 = 0; local1233 < arg0; local1233++) {
			for (local1290 = 0; local1290 < arg0; local1290++) {
				if (arg0 / 2 <= local1233) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1343) int local1343;
		for (local1290 = 0; local1290 < arg0; local1290++) {
			for (local1343 = 0; local1343 < arg0; local1343++) {
				if (local1290 - arg0 / 2 >= local1343) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1401) int local1401;
		for (local1343 = arg0 - 1; local1343 >= 0; local1343--) {
			for (local1401 = 0; local1401 < arg0; local1401++) {
				if (local1343 - arg0 / 2 >= local1401) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1463) int local1463;
		for (local1401 = arg0 - 1; local1401 >= 0; local1401--) {
			for (local1463 = arg0 - 1; local1463 >= 0; local1463--) {
				if (local1401 - arg0 / 2 >= local1463) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1521) int local1521;
		for (local1463 = 0; local1463 < arg0; local1463++) {
			for (local1521 = arg0 - 1; local1521 >= 0; local1521--) {
				if (local1521 <= local1463 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1580) int local1580;
		for (local1521 = 0; local1521 < arg0; local1521++) {
			for (local1580 = 0; local1580 < arg0; local1580++) {
				if (local1521 - arg0 / 2 <= local1580) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1642) int local1642;
		for (local1580 = arg0 - 1; local1580 >= 0; local1580--) {
			for (local1642 = 0; local1642 < arg0; local1642++) {
				if (local1642 >= local1580 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1708) int local1708;
		for (local1642 = arg0 - 1; local1642 >= 0; local1642--) {
			for (local1708 = arg0 - 1; local1708 >= 0; local1708--) {
				if (local1642 - arg0 / 2 <= local1708) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		for (local1708 = 0; local1708 < arg0; local1708++) {
			for (@Pc(1767) int local1767 = arg0 - 1; local1767 >= 0; local1767--) {
				if (local1767 >= local1708 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(IIIII)Z")
	public static boolean method8660(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static220.aByteArrayArrayArray14[0][arg3][arg1] & 0x2) != 0) {
			return true;
		} else if ((Static220.aByteArrayArrayArray14[arg0][arg3][arg1] & 0x10) == 0) {
			return arg2 == Static97.method1415(arg0, arg3, arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(II)I")
	public static int method8661(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
