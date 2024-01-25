import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_123 = new Class265(47, -2);

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_124 = new Class265(106, 16);

	@OriginalMember(owner = "client!qg", name = "g", descriptor = "Lclient!al;")
	public static Class10 aClass10_28 = null;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZI)Z")
	public static boolean method4495(@OriginalArg(0) boolean arg0) {
		@Pc(13) boolean local13 = Static33.aClass49_1.method4431();
		if (arg0 == local13) {
			return true;
		}
		if (!arg0) {
			Static33.aClass49_1.method4475();
		} else if (!Static33.aClass49_1.method4457()) {
			arg0 = false;
		}
		if (arg0 == local13) {
			return false;
		} else {
			Static12.aClass79_Sub1_1.aBoolean364 = arg0;
			Static12.aClass79_Sub1_1.method3969(Static43.aClass59_5);
			return true;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILclient!em;IB)V")
	public static void method4496(@OriginalArg(0) int arg0, @OriginalArg(1) Class68 arg1, @OriginalArg(2) int arg2) {
		if (Static385.aBoolean441) {
			@Pc(179) Class132 local179 = Static404.anInt6738 == -1 ? null : Static186.aClass161_1.method3729(Static404.anInt6738);
			if (Static47.method787(arg1).method5397() && (Static201.anInt3539 & 0x20) != 0 && (local179 == null || arg1.method1735(Static404.anInt6738, local179.anInt3608) != local179.anInt3608)) {
				Static172.method2802(57, Static323.anInt5618, true, 0L, Static118.aString34, arg1.anInt2215, Static254.aString46 + " -> " + arg1.aString23, arg1.anInt2208, false, arg1.anInt2229);
			}
			return;
		}
		@Pc(12) String local12;
		for (@Pc(5) int local5 = 9; local5 >= 5; local5--) {
			local12 = Static143.method2406(arg1, local5);
			if (local12 != null) {
				Static172.method2802(1003, Static158.method2583(local5, arg1), true, (long) (local5 + 1), local12, arg1.anInt2215, arg1.aString23, arg1.anInt2208, false, arg1.anInt2229);
			}
		}
		local12 = Static209.method3317(arg1);
		if (local12 != null) {
			Static172.method2802(15, arg1.anInt2247, true, 0L, local12, arg1.anInt2215, arg1.aString23, arg1.anInt2208, false, arg1.anInt2229);
		}
		for (@Pc(77) int local77 = 4; local77 >= 0; local77--) {
			@Pc(86) String local86 = Static143.method2406(arg1, local77);
			if (local86 != null) {
				Static172.method2802(9, Static158.method2583(local77, arg1), true, (long) (local77 + 1), local86, arg1.anInt2215, arg1.aString23, arg1.anInt2208, false, arg1.anInt2229);
			}
		}
		if (!Static47.method787(arg1).method5402()) {
			return;
		}
		if (arg1.aString25 == null) {
			Static172.method2802(4, -1, true, 0L, Static41.aClass209_24.method4562(Static388.anInt6533), arg1.anInt2215, "", arg1.anInt2208, false, arg1.anInt2229);
		} else {
			Static172.method2802(4, -1, true, 0L, arg1.aString25, arg1.anInt2215, "", arg1.anInt2208, false, arg1.anInt2229);
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIZ)V")
	public static void method4498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = Static172.aClass58_5.method1340(Static360.aClass209_156.method4562(Static388.anInt6533));
		@Pc(24) int local24;
		for (@Pc(18) Class2_Sub22 local18 = (Class2_Sub22) Static248.aClass14_35.method309(); local18 != null; local18 = (Class2_Sub22) Static248.aClass14_35.method311()) {
			local24 = Static286.method4125(local18);
			if (local13 < local24) {
				local13 = local24;
			}
		}
		local13 += 8;
		local24 = Static373.anInt4900 * 16 + 21;
		@Pc(58) int local58 = arg1 - local13 / 2;
		if (Static86.anInt4394 < local58 + local13) {
			local58 = Static86.anInt4394 - local13;
		}
		if (local58 < 0) {
			local58 = 0;
		}
		@Pc(81) int local81 = arg0;
		if (Static395.anInt6582 < arg0 + local24) {
			local81 = Static395.anInt6582 - local24;
		}
		if (local81 < 0) {
			local81 = 0;
		}
		Static237.anInt4550 = local58;
		Static123.aBoolean212 = true;
		Static296.anInt5305 = local13;
		Static372.anInt2931 = (Static82.aBoolean109 ? 26 : 22) + Static373.anInt4900 * 16;
		Static19.anInt5290 = local81;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)[[[B")
	public static byte[][][] method4499(@OriginalArg(1) int arg0) {
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
		@Pc(112) int local112;
		for (local73 = 0; local73 < arg0; local73++) {
			for (local112 = 0; local112 < arg0; local112++) {
				if (local112 >= local73) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(166) int local166;
		for (local112 = arg0 - 1; local112 >= 0; local112--) {
			for (local166 = 0; local166 < arg0; local166++) {
				if (local112 <= local166) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(212) int local212;
		for (local166 = arg0 - 1; local166 >= 0; local166--) {
			for (local212 = 0; local212 < arg0; local212++) {
				if (local212 <= local166 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(257) int local257;
		for (local212 = 0; local212 < arg0; local212++) {
			for (local257 = 0; local257 < arg0; local257++) {
				if (local20 >= 0 && local20 < local18.length) {
					if (local212 << 1 <= local257) {
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
		@Pc(323) int local323;
		for (local257 = 0; local257 < arg0; local257++) {
			for (local323 = arg0 - 1; local323 >= 0; local323--) {
				if (local323 <= local257 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(365) int local365;
		for (local323 = arg0 - 1; local323 >= 0; local323--) {
			for (local365 = arg0 - 1; local365 >= 0; local365--) {
				if (local323 << 1 <= local365) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(409) int local409;
		for (local365 = arg0 - 1; local365 >= 0; local365--) {
			for (local409 = arg0 - 1; local409 >= 0; local409--) {
				if (local409 <= local365 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(448) int local448;
		for (local409 = arg0 - 1; local409 >= 0; local409--) {
			for (local448 = 0; local448 < arg0; local448++) {
				if (local409 << 1 <= local448) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(497) int local497;
		for (local448 = 0; local448 < arg0; local448++) {
			for (local497 = 0; local497 < arg0; local497++) {
				if (local448 >> 1 >= local497) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(546) int local546;
		for (local497 = 0; local497 < arg0; local497++) {
			for (local546 = arg0 - 1; local546 >= 0; local546--) {
				if (local546 >= local497 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(597) int local597;
		for (local546 = arg0 - 1; local546 >= 0; local546--) {
			for (local597 = 0; local597 < arg0; local597++) {
				if (local597 >= local546 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(642) int local642;
		for (local597 = 0; local597 < arg0; local597++) {
			for (local642 = 0; local642 < arg0; local642++) {
				if (local642 <= local597 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(687) int local687;
		for (local642 = 0; local642 < arg0; local642++) {
			for (local687 = arg0 - 1; local687 >= 0; local687--) {
				if (local642 >> 1 <= local687) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(733) int local733;
		for (local687 = arg0 - 1; local687 >= 0; local687--) {
			for (local733 = arg0 - 1; local733 >= 0; local733--) {
				if (local733 <= local687 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(781) int local781;
		for (local733 = arg0 - 1; local733 >= 0; local733--) {
			for (local781 = arg0 - 1; local781 >= 0; local781--) {
				if (local781 >= local733 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(827) int local827;
		for (local781 = arg0 - 1; local781 >= 0; local781--) {
			for (local827 = 0; local827 < arg0; local827++) {
				if (local827 <= local781 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(865) int local865;
		for (local827 = 0; local827 < arg0; local827++) {
			for (local865 = 0; local865 < arg0; local865++) {
				if (local865 >= local827 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(914) int local914;
		for (local865 = 0; local865 < arg0; local865++) {
			for (local914 = arg0 - 1; local914 >= 0; local914--) {
				if (local914 <= local865 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(956) int local956;
		for (local914 = 0; local914 < arg0; local914++) {
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
				if (local956 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1046) int local1046;
		for (local999 = 0; local999 < arg0; local999++) {
			for (local1046 = 0; local1046 < arg0; local1046++) {
				if (local1046 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1085) int local1085;
		for (local1046 = 0; local1046 < arg0; local1046++) {
			for (local1085 = 0; local1085 < arg0; local1085++) {
				if (arg0 / 2 <= local1046) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1128) int local1128;
		for (local1085 = 0; local1085 < arg0; local1085++) {
			for (local1128 = 0; local1128 < arg0; local1128++) {
				if (local1128 <= local1085 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1180) int local1180;
		for (local1128 = arg0 - 1; local1128 >= 0; local1128--) {
			for (local1180 = 0; local1180 < arg0; local1180++) {
				if (local1180 <= local1128 - arg0 / 2) {
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
				if (local1236 <= local1180 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1284) int local1284;
		for (local1236 = 0; local1236 < arg0; local1236++) {
			for (local1284 = arg0 - 1; local1284 >= 0; local1284--) {
				if (local1236 - arg0 / 2 >= local1284) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1335) int local1335;
		for (local1284 = 0; local1284 < arg0; local1284++) {
			for (local1335 = 0; local1335 < arg0; local1335++) {
				if (local1284 - arg0 / 2 <= local1335) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1386) int local1386;
		for (local1335 = arg0 - 1; local1335 >= 0; local1335--) {
			for (local1386 = 0; local1386 < arg0; local1386++) {
				if (local1386 >= local1335 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1435) int local1435;
		for (local1386 = arg0 - 1; local1386 >= 0; local1386--) {
			for (local1435 = arg0 - 1; local1435 >= 0; local1435--) {
				if (local1386 - arg0 / 2 <= local1435) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1435 = 0; local1435 < arg0; local1435++) {
			for (@Pc(1484) int local1484 = arg0 - 1; local1484 >= 0; local1484--) {
				if (local1435 - arg0 / 2 <= local1484) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}
}
