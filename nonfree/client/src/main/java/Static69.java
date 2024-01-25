import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!cga", name = "s", descriptor = "Lclient!faa;")
	public static Class97 aClass97_6;

	@OriginalMember(owner = "client!cga", name = "l", descriptor = "I")
	public static int anInt1171 = 0;

	@OriginalMember(owner = "client!cga", name = "v", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_16 = new Class316(71, -1);

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(IIBI)V")
	public static void method969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg1 + Static150.anInt2792;
		@Pc(14) int local14 = Static154.anInt2878 + arg0;
		if (Static113.aClass133ArrayArrayArray1 == null || arg1 < 0 || arg0 < 0 || arg1 >= Static18.anInt5706 || arg0 >= Static80.anInt1367) {
			return;
		}
		@Pc(49) long local49 = (long) (arg2 << 28 | local14 << 14 | local10);
		@Pc(57) Class6_Sub30 local57 = (Class6_Sub30) Static500.aClass234_44.method5464(local49);
		if (local57 == null) {
			Static152.method1762(arg2, arg1, arg0);
			return;
		}
		@Pc(71) Class6_Sub50 local71 = (Class6_Sub50) local57.aClass298_137.method6809();
		if (local71 == null) {
			Static152.method1762(arg2, arg1, arg0);
			return;
		}
		@Pc(85) Class15_Sub5_Sub1 local85 = (Class15_Sub5_Sub1) Static152.method1762(arg2, arg1, arg0);
		if (local85 == null) {
			local85 = new Class15_Sub5_Sub1();
		} else {
			local85.anInt6448 = local85.anInt6443 = -1;
		}
		local85.anInt6435 = local71.anInt9643;
		local85.anInt6442 = local71.anInt9642;
		label46: while (true) {
			@Pc(117) Class6_Sub50 local117 = (Class6_Sub50) local57.aClass298_137.method6821();
			if (local117 == null) {
				break;
			}
			if (local117.anInt9642 != local85.anInt6442) {
				local85.anInt6440 = local117.anInt9643;
				local85.anInt6448 = local117.anInt9642;
				while (true) {
					@Pc(140) Class6_Sub50 local140 = (Class6_Sub50) local57.aClass298_137.method6821();
					if (local140 == null) {
						break label46;
					}
					if (local85.anInt6442 != local140.anInt9642 && local140.anInt9642 != local85.anInt6448) {
						local85.anInt6443 = local140.anInt9642;
						local85.anInt6437 = local140.anInt9643;
					}
				}
			}
		}
		@Pc(184) int local184 = Static37.method631((arg0 << 9) + 256, (arg1 << 9) + 256, arg2);
		Static504.method6967(arg2, arg1, arg0, local184, local85);
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(ILclient!faa;)V")
	public static void method977(@OriginalArg(1) Class97 arg0) {
		if (Static336.anInt6408 != arg0.anInt2625) {
			return;
		}
		if (Static461.aClass15_Sub2_Sub4_Sub2_2.aString82 == null) {
			arg0.anInt2682 = 0;
			arg0.anInt2636 = 0;
			return;
		}
		arg0.anInt2687 = 150;
		arg0.anInt2639 = (int) (Math.sin((double) Static363.anInt6671 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt2636 = Static517.anInt8881;
		arg0.anInt2681 = 5;
		arg0.anInt2682 = Static194.method3294(Static461.aClass15_Sub2_Sub4_Sub2_2.aString82);
		arg0.anInt2620 = Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8985;
		arg0.anInt2626 = Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8934;
		arg0.anInt2601 = Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8954;
		arg0.anInt2685 = 0;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(IB)[[[B")
	public static byte[][][] method978(@OriginalArg(0) int arg0) {
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
		@Pc(77) int local77;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local77 = 0; local77 < arg0; local77++) {
				if (local26 >= local77) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(120) int local120;
		for (local77 = 0; local77 < arg0; local77++) {
			for (local120 = 0; local120 < arg0; local120++) {
				if (local77 <= local120) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(167) int local167;
		for (local120 = arg0 - 1; local120 >= 0; local120--) {
			for (local167 = 0; local167 < arg0; local167++) {
				if (local120 <= local167) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(216) int local216;
		for (local167 = arg0 - 1; local167 >= 0; local167--) {
			for (local216 = 0; local216 < arg0; local216++) {
				if (local216 <= local167 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(254) int local254;
		for (local216 = 0; local216 < arg0; local216++) {
			for (local254 = 0; local254 < arg0; local254++) {
				if (local20 >= 0 && local20 < local18.length) {
					if (local254 >= local216 << 1) {
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
		@Pc(315) int local315;
		for (local254 = 0; local254 < arg0; local254++) {
			for (local315 = arg0 - 1; local315 >= 0; local315--) {
				if (local254 >> 1 >= local315) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(364) int local364;
		for (local315 = arg0 - 1; local315 >= 0; local315--) {
			for (local364 = arg0 - 1; local364 >= 0; local364--) {
				if (local315 << 1 <= local364) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(411) int local411;
		for (local364 = arg0 - 1; local364 >= 0; local364--) {
			for (local411 = arg0 - 1; local411 >= 0; local411--) {
				if (local364 >> 1 >= local411) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(453) int local453;
		for (local411 = arg0 - 1; local411 >= 0; local411--) {
			for (local453 = 0; local453 < arg0; local453++) {
				if (local411 << 1 <= local453) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(495) int local495;
		for (local453 = 0; local453 < arg0; local453++) {
			for (local495 = 0; local495 < arg0; local495++) {
				if (local453 >> 1 >= local495) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(540) int local540;
		for (local495 = 0; local495 < arg0; local495++) {
			for (local540 = arg0 - 1; local540 >= 0; local540--) {
				if (local540 >= local495 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(584) int local584;
		for (local540 = arg0 - 1; local540 >= 0; local540--) {
			for (local584 = 0; local584 < arg0; local584++) {
				if (local584 >= local540 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(626) int local626;
		for (local584 = 0; local584 < arg0; local584++) {
			for (local626 = 0; local626 < arg0; local626++) {
				if (local584 << 1 >= local626) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(667) int local667;
		for (local626 = 0; local626 < arg0; local626++) {
			for (local667 = arg0 - 1; local667 >= 0; local667--) {
				if (local626 >> 1 <= local667) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(716) int local716;
		for (local667 = arg0 - 1; local667 >= 0; local667--) {
			for (local716 = arg0 - 1; local716 >= 0; local716--) {
				if (local716 <= local667 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(764) int local764;
		for (local716 = arg0 - 1; local716 >= 0; local716--) {
			for (local764 = arg0 - 1; local764 >= 0; local764--) {
				if (local764 >= local716 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(809) int local809;
		for (local764 = arg0 - 1; local764 >= 0; local764--) {
			for (local809 = 0; local809 < arg0; local809++) {
				if (local809 <= local764 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(854) int local854;
		for (local809 = 0; local809 < arg0; local809++) {
			for (local854 = 0; local854 < arg0; local854++) {
				if (local809 >> 1 <= local854) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(907) int local907;
		for (local854 = 0; local854 < arg0; local854++) {
			for (local907 = arg0 - 1; local907 >= 0; local907--) {
				if (local907 <= local854 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(956) int local956;
		for (local907 = 0; local907 < arg0; local907++) {
			for (local956 = 0; local956 < arg0; local956++) {
				if (local956 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(999) int local999;
		for (local956 = 0; local956 < arg0; local956++) {
			for (local999 = 0; local999 < arg0; local999++) {
				if (arg0 / 2 >= local956) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1042) int local1042;
		for (local999 = 0; local999 < arg0; local999++) {
			for (local1042 = 0; local1042 < arg0; local1042++) {
				if (local1042 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1085) int local1085;
		for (local1042 = 0; local1042 < arg0; local1042++) {
			for (local1085 = 0; local1085 < arg0; local1085++) {
				if (arg0 / 2 <= local1042) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1132) int local1132;
		for (local1085 = 0; local1085 < arg0; local1085++) {
			for (local1132 = 0; local1132 < arg0; local1132++) {
				if (local1085 - arg0 / 2 >= local1132) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1180) int local1180;
		for (local1132 = arg0 - 1; local1132 >= 0; local1132--) {
			for (local1180 = 0; local1180 < arg0; local1180++) {
				if (local1180 <= local1132 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1236) int local1236;
		for (local1180 = arg0 - 1; local1180 >= 0; local1180--) {
			for (local1236 = arg0 - 1; local1236 >= 0; local1236--) {
				if (local1180 - arg0 / 2 >= local1236) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1292) int local1292;
		for (local1236 = 0; local1236 < arg0; local1236++) {
			for (local1292 = arg0 - 1; local1292 >= 0; local1292--) {
				if (local1236 - arg0 / 2 >= local1292) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1337) int local1337;
		for (local1292 = 0; local1292 < arg0; local1292++) {
			for (local1337 = 0; local1337 < arg0; local1337++) {
				if (local1292 - arg0 / 2 <= local1337) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1389) int local1389;
		for (local1337 = arg0 - 1; local1337 >= 0; local1337--) {
			for (local1389 = 0; local1389 < arg0; local1389++) {
				if (local1389 >= local1337 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1441) int local1441;
		for (local1389 = arg0 - 1; local1389 >= 0; local1389--) {
			for (local1441 = arg0 - 1; local1441 >= 0; local1441--) {
				if (local1441 >= local1389 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1441 = 0; local1441 < arg0; local1441++) {
			for (@Pc(1486) int local1486 = arg0 - 1; local1486 >= 0; local1486--) {
				if (local1441 - arg0 / 2 <= local1486) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(ILclient!uea;)I")
	public static int method979(@OriginalArg(1) Class15_Sub2_Sub4_Sub2 arg0) {
		@Pc(8) int local8 = arg0.anInt9018;
		@Pc(12) Class154 local12 = arg0.method7131();
		if (arg0.aBoolean579) {
			local8 = arg0.anInt9002;
		} else if (arg0.anInt8985 == local12.anInt4538 || local12.anInt4524 == arg0.anInt8985 || local12.anInt4516 == arg0.anInt8985 || arg0.anInt8985 == local12.anInt4507) {
			local8 = arg0.anInt9014;
		} else if (arg0.anInt8985 == local12.anInt4523 || arg0.anInt8985 == local12.anInt4506 || local12.anInt4531 == arg0.anInt8985 || arg0.anInt8985 == local12.anInt4519) {
			local8 = arg0.anInt9005;
		}
		return local8;
	}
}
