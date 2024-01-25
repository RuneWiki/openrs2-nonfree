import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!wl", name = "h", descriptor = "Lclient!fo;")
	public static Class82 aClass82_104;

	@OriginalMember(owner = "client!wl", name = "o", descriptor = "Lclient!sr;")
	public static final Class227 aClass227_54 = new Class227();

	@OriginalMember(owner = "client!wl", name = "p", descriptor = "I")
	public static int anInt7429 = 0;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(III)I")
	public static int method5873(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 >>> 31;
		return (arg0 + local12) / arg1 - local12;
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V")
	public static void method5874() {
		Static392.method5127(Static453.aClass136_Sub1_1.anInt4446);
		@Pc(18) int local18 = (Static213.anInt258 >> 10) + (Static199.anInt3480 >> 3);
		Static265.anInt4807 = Static447.aClass25_Sub5_Sub1_Sub2_4.aByte94 = 0;
		@Pc(31) int local31 = (Static164.anInt2731 >> 3) + (Static360.anInt6145 >> 10);
		Static447.aClass25_Sub5_Sub1_Sub2_4.method3441(8, 8);
		Static354.anIntArray417 = new int[18];
		Static385.anIntArray429 = new int[18];
		Static337.anIntArrayArray50 = new int[18][4];
		Static208.anIntArray226 = new int[18];
		Static118.anIntArray145 = new int[18];
		Static151.aByteArrayArray9 = new byte[18][];
		Static333.aByteArrayArray22 = new byte[18][];
		Static139.anIntArray166 = new int[18];
		Static248.anIntArray298 = new int[18];
		Static266.aByteArrayArray18 = new byte[18][];
		Static407.aByteArrayArray29 = new byte[18][];
		Static163.aByteArrayArray24 = new byte[18][];
		@Pc(77) int local77 = 0;
		@Pc(103) int local103;
		for (@Pc(93) int local93 = (local18 - (Static296.anInt5187 >> 4)) / 8; local93 <= (local18 + (Static296.anInt5187 >> 4)) / 8; local93++) {
			for (local103 = (local31 - (Static206.anInt3607 >> 4)) / 8; local103 <= ((Static206.anInt3607 >> 4) + local31) / 8; local103++) {
				@Pc(111) int local111 = (local93 << 8) + local103;
				Static248.anIntArray298[local77] = local111;
				Static139.anIntArray166[local77] = Static206.aClass82_50.method1835("m" + local93 + "_" + local103);
				Static118.anIntArray145[local77] = Static206.aClass82_50.method1835("l" + local93 + "_" + local103);
				Static208.anIntArray226[local77] = Static206.aClass82_50.method1835("n" + local93 + "_" + local103);
				Static354.anIntArray417[local77] = Static206.aClass82_50.method1835("um" + local93 + "_" + local103);
				Static385.anIntArray429[local77] = Static206.aClass82_50.method1835("ul" + local93 + "_" + local103);
				if (Static208.anIntArray226[local77] == -1) {
					Static139.anIntArray166[local77] = -1;
					Static118.anIntArray145[local77] = -1;
					Static354.anIntArray417[local77] = -1;
					Static385.anIntArray429[local77] = -1;
				}
				local77++;
			}
		}
		for (local103 = local77; local103 < Static208.anIntArray226.length; local103++) {
			Static208.anIntArray226[local103] = -1;
			Static139.anIntArray166[local103] = -1;
			Static118.anIntArray145[local103] = -1;
			Static354.anIntArray417[local103] = -1;
			Static385.anIntArray429[local103] = -1;
		}
		@Pc(286) byte local286;
		if (Static312.anInt5414 == 1 || Static312.anInt5414 == 2) {
			local286 = 3;
		} else {
			local286 = 7;
		}
		Static56.method981(local286, local18, false, local31);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!qr;ILclient!za;ILclient!ql;I)Z")
	public static boolean method5875(@OriginalArg(0) Class205 arg0, @OriginalArg(2) Class34 arg1, @OriginalArg(4) Class1_Sub36 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg0.anIntArray394 != null) {
			local7 = (Static167.anInt2096 - Static167.anInt2095) * (arg2.anInt5636 + arg0.anInt5760 - Static167.anInt2097) / (Static167.anInt2098 - Static167.anInt2097) + Static167.anInt2095;
			local9 = Static167.anInt2095 + (arg0.anInt5741 + arg2.anInt5636 - Static167.anInt2097) * (Static167.anInt2096 - Static167.anInt2095) / (Static167.anInt2098 - Static167.anInt2097);
			local11 = Static167.anInt2088 - (arg2.anInt5634 + arg0.anInt5767 - Static167.anInt2090) * (Static167.anInt2088 - Static167.anInt2091) / (Static167.anInt2092 - Static167.anInt2090);
			local13 = Static167.anInt2088 - (Static167.anInt2088 - Static167.anInt2091) * (arg0.anInt5764 - -arg2.anInt5634 - Static167.anInt2090) / (Static167.anInt2092 - Static167.anInt2090);
		}
		@Pc(100) Class6 local100 = null;
		@Pc(102) int local102 = 0;
		@Pc(104) int local104 = 0;
		@Pc(106) int local106 = 0;
		@Pc(108) int local108 = 0;
		if (arg0.anInt5765 != -1) {
			if (arg2.aBoolean642 && arg0.anInt5766 != -1) {
				local100 = arg0.method4522(true, arg1);
			} else {
				local100 = arg0.method4522(false, arg1);
			}
			if (local100 != null) {
				local102 = arg2.anInt5631 - (local100.RA() + 1 >> 1);
				if (local102 < local7) {
					local7 = local102;
				}
				local104 = arg2.anInt5631 + (local100.RA() + 1 >> 1);
				local106 = arg2.anInt5635 - (local100.Q() + 1 >> 1);
				if (local104 > local9) {
					local9 = local104;
				}
				if (local106 < local11) {
					local11 = local106;
				}
				local108 = arg2.anInt5635 + (local100.Q() + 1 >> 1);
				if (local108 > local13) {
					local13 = local108;
				}
			}
		}
		@Pc(202) Class88 local202 = null;
		@Pc(204) int local204 = 0;
		@Pc(206) int local206 = 0;
		@Pc(208) int local208 = 0;
		@Pc(210) int local210 = 0;
		@Pc(212) int local212 = 0;
		@Pc(214) int local214 = 0;
		@Pc(216) int local216 = 0;
		@Pc(268) int local268;
		@Pc(295) int local295;
		if (arg0.aString65 != null) {
			local202 = Static45.method4313(arg0.anInt5745);
			if (local202 != null) {
				local204 = Static58.aClass89_1.method1993(null, null, Static29.aStringArray7, arg0.aString65);
				local206 = arg2.anInt5635;
				if (local100 == null) {
					local206 -= local202.method1955() * local204 / 2;
				} else {
					local206 -= (local100.Q() >> 1) + (local204 * local202.method1959());
				}
				for (local268 = 0; local268 < local204; local268++) {
					@Pc(274) String local274 = Static29.aStringArray7[local268];
					if (local268 < local204 - 1) {
						local274 = local274.substring(0, local274.length() - 4);
					}
					local295 = local202.method1956(local274);
					if (local295 > local208) {
						local208 = local295;
					}
				}
				local210 = arg2.anInt5631 - local208 / 2;
				if (local210 < local7) {
					local7 = local210;
				}
				local212 = arg2.anInt5631 + local208 / 2;
				local214 = local206;
				if (local9 < local212) {
					local9 = local212;
				}
				if (local11 > local214) {
					local11 = local214;
				}
				local216 = local204 * local202.method1959() + local206;
				if (local13 < local216) {
					local13 = local216;
				}
			}
		}
		if (Static167.anInt2095 > local9 || local7 > Static167.anInt2096 || Static167.anInt2091 > local13 || Static167.anInt2088 < local11) {
			return true;
		}
		@Pc(389) int local389;
		if (arg0.anIntArray394 != null) {
			@Pc(387) int[] local387 = new int[arg0.anIntArray394.length];
			for (local389 = 0; local389 < local387.length / 2; local389++) {
				local295 = arg0.anIntArray394[local389 * 2] + arg2.anInt5636;
				@Pc(414) int local414 = arg2.anInt5634 + arg0.anIntArray394[local389 * 2 + 1];
				local387[local389 * 2] = (Static167.anInt2096 - Static167.anInt2095) * (-Static167.anInt2097 + local295) / (Static167.anInt2098 - Static167.anInt2097) + Static167.anInt2095;
				local387[local389 * 2 + 1] = Static167.anInt2088 - (Static167.anInt2088 - Static167.anInt2091) * (local414 - Static167.anInt2090) / (Static167.anInt2092 - Static167.anInt2090);
			}
			Static375.method4960(arg1, local387, arg0.anInt5748);
			for (local295 = 0; local295 < local387.length / 2 - 1; local295++) {
				arg1.method5773(local387[local295 * 2 + 2], local387[local295 * 2 + 1], arg0.anInt5758, local387[local295 * 2], local387[local295 * 2 + 3]);
			}
			arg1.method5773(local387[0], local387[local387.length - 1], arg0.anInt5758, local387[local387.length - 2], local387[1]);
		}
		if (local100 != null) {
			if (Static154.anInt2613 > 0 && (Static125.anInt2319 != -1 && arg2.anInt5632 == Static125.anInt2319 || Static427.anInt7220 != -1 && Static427.anInt7220 == arg0.anInt5747)) {
				if (Static287.anInt5028 <= 50) {
					local268 = Static287.anInt5028 * 2;
				} else {
					local268 = (100 - Static287.anInt5028) * 2;
				}
				local389 = local268 << 24 | 0xFFFF00;
				arg1.method5748(arg2.anInt5635, arg2.anInt5631, local100.YA() / 2 + 7, local389);
				arg1.method5748(arg2.anInt5635, arg2.anInt5631, local100.YA() / 2 + 5, local389);
				arg1.method5748(arg2.anInt5635, arg2.anInt5631, local100.YA() / 2 + 3, local389);
				arg1.method5748(arg2.anInt5635, arg2.anInt5631, local100.YA() / 2 + 1, local389);
				arg1.method5748(arg2.anInt5635, arg2.anInt5631, local100.YA() / 2, local389);
			}
			local100.method5894(arg2.anInt5631 - (local100.RA() >> 1), arg2.anInt5635 - (local100.Q() >> 1));
		}
		if (arg0.aString65 != null && local202 != null) {
			Static384.method5032(local202, local206, arg1, arg0, arg2, local208, local204);
		}
		if (arg0.anInt5765 != -1 || arg0.aString65 != null) {
			@Pc(703) Class1_Sub38 local703 = new Class1_Sub38(arg2);
			local703.anInt6243 = local212;
			local703.anInt6239 = local102;
			local703.anInt6238 = local216;
			local703.anInt6237 = local210;
			local703.anInt6242 = local108;
			local703.anInt6245 = local104;
			local703.anInt6244 = local214;
			local703.anInt6241 = local106;
			Static103.aClass227_8.method4972(local703);
		}
		return false;
	}
}
