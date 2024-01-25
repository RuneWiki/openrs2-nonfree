import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!fu", name = "i", descriptor = "Lclient!qn;")
	public static Class211 aClass211_32;

	@OriginalMember(owner = "client!fu", name = "p", descriptor = "Lclient!rk;")
	public static Class220 aClass220_2;

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(ILclient!dt;BLclient!ya;ILclient!gp;)Z")
	public static boolean method1729(@OriginalArg(1) Class4_Sub12 arg0, @OriginalArg(3) Class135 arg1, @OriginalArg(5) Class100 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg2.anIntArray207 != null) {
			local9 = Static292.anInt6151 + (Static292.anInt6147 - Static292.anInt6151) * (arg2.anInt2477 + arg0.anInt1572 - Static292.anInt6144) / (Static292.anInt6143 - Static292.anInt6144);
			local11 = Static292.anInt6141 - (Static292.anInt6141 - Static292.anInt6149) * (arg0.anInt1567 + arg2.anInt2472 - Static292.anInt6150) / (Static292.anInt6152 - Static292.anInt6150);
			local7 = Static292.anInt6151 + (arg2.anInt2461 + arg0.anInt1572 - Static292.anInt6144) * (Static292.anInt6147 - Static292.anInt6151) / (Static292.anInt6143 - Static292.anInt6144);
			local13 = Static292.anInt6141 - (arg0.anInt1567 + arg2.anInt2465 - Static292.anInt6150) * (Static292.anInt6141 - Static292.anInt6149) / (Static292.anInt6152 - Static292.anInt6150);
		}
		@Pc(102) Class95 local102 = null;
		@Pc(104) int local104 = 0;
		@Pc(106) int local106 = 0;
		@Pc(108) int local108 = 0;
		@Pc(110) int local110 = 0;
		if (arg2.anInt2483 != -1) {
			if (arg0.aBoolean104 && arg2.anInt2467 != -1) {
				local102 = arg2.method1953(true, arg1);
			} else {
				local102 = arg2.method1953(false, arg1);
			}
			if (local102 != null) {
				local104 = arg0.anInt1563 - (local102.j() + 1 >> 1);
				if (local104 < local7) {
					local7 = local104;
				}
				local106 = arg0.anInt1563 + (local102.j() + 1 >> 1);
				if (local9 < local106) {
					local9 = local106;
				}
				local108 = arg0.anInt1570 - (local102.T() + 1 >> 1);
				if (local108 < local11) {
					local11 = local108;
				}
				local110 = arg0.anInt1570 + (local102.T() + 1 >> 1);
				if (local13 < local110) {
					local13 = local110;
				}
			}
		}
		@Pc(214) Class223 local214 = null;
		@Pc(216) int local216 = 0;
		@Pc(218) int local218 = 0;
		@Pc(220) int local220 = 0;
		@Pc(222) int local222 = 0;
		@Pc(224) int local224 = 0;
		@Pc(226) int local226 = 0;
		@Pc(228) int local228 = 0;
		@Pc(277) int local277;
		@Pc(304) int local304;
		if (arg2.aString15 != null) {
			local214 = Static281.method3694(arg2.anInt2486);
			if (local214 != null) {
				local216 = Static261.aClass158_9.method3029(arg2.aString15, null, null, Static51.aStringArray6);
				local218 = arg0.anInt1570;
				if (local102 == null) {
					local218 -= local216 * local214.method4666() / 2;
				} else {
					local218 -= (local102.T() >> 1) + local214.method4669() * local216;
				}
				for (local277 = 0; local277 < local216; local277++) {
					@Pc(283) String local283 = Static51.aStringArray6[local277];
					if (local216 - 1 > local277) {
						local283 = local283.substring(0, local283.length() - 4);
					}
					local304 = local214.method4664(local283);
					if (local220 < local304) {
						local220 = local304;
					}
				}
				local222 = arg0.anInt1563 - local220 / 2;
				local224 = arg0.anInt1563 + local220 / 2;
				if (local222 < local7) {
					local7 = local222;
				}
				local226 = local218;
				if (local224 > local9) {
					local9 = local224;
				}
				if (local226 < local11) {
					local11 = local226;
				}
				local228 = local216 * local214.method4669() + local218;
				if (local13 < local228) {
					local13 = local228;
				}
			}
		}
		if (Static292.anInt6151 > local9 || local7 > Static292.anInt6147 || Static292.anInt6149 > local13 || local11 > Static292.anInt6141) {
			return true;
		}
		@Pc(394) int local394;
		if (arg2.anIntArray207 != null) {
			@Pc(392) int[] local392 = new int[arg2.anIntArray207.length];
			for (local394 = 0; local394 < local392.length / 2; local394++) {
				local304 = arg2.anIntArray207[local394 * 2] + arg0.anInt1572;
				@Pc(420) int local420 = arg2.anIntArray207[local394 * 2 + 1] + arg0.anInt1567;
				local392[local394 * 2] = (Static292.anInt6147 - Static292.anInt6151) * (local304 + -Static292.anInt6144) / (Static292.anInt6143 - Static292.anInt6144) + Static292.anInt6151;
				local392[local394 * 2 + 1] = Static292.anInt6141 - (Static292.anInt6141 - Static292.anInt6149) * (local420 - Static292.anInt6150) / (Static292.anInt6152 - Static292.anInt6150);
			}
			Static42.method561(arg1, local392, arg2.anInt2459);
			for (local304 = 0; local304 < local392.length / 2 - 1; local304++) {
				arg1.method5388(arg2.anInt2481, local392[(local304 + 1) * 2 + 1], local392[local304 * 2], local392[local304 * 2 + 1], local392[(local304 + 1) * 2]);
			}
			arg1.method5388(arg2.anInt2481, local392[1], local392[local392.length - 2], local392[local392.length - 1], local392[0]);
		}
		if (local102 != null) {
			if (Static90.anInt1730 > 0 && (Static325.anInt5269 != -1 && arg0.anInt1566 == Static325.anInt5269 || Static276.anInt4603 != -1 && Static276.anInt4603 == arg2.anInt2488)) {
				if (Static373.anInt6112 > 50) {
					local277 = (100 - Static373.anInt6112) * 2;
				} else {
					local277 = Static373.anInt6112 * 2;
				}
				local394 = local277 << 24 | 0xFFFF00;
				arg1.method5383(arg0.anInt1570, arg0.anInt1563, local102.la() / 2 + 7, local394);
				arg1.method5383(arg0.anInt1570, arg0.anInt1563, local102.la() / 2 + 5, local394);
				arg1.method5383(arg0.anInt1570, arg0.anInt1563, local102.la() / 2 + 3, local394);
				arg1.method5383(arg0.anInt1570, arg0.anInt1563, local102.la() / 2 + 1, local394);
				arg1.method5383(arg0.anInt1570, arg0.anInt1563, local102.la() / 2, local394);
			}
			local102.method5821(arg0.anInt1563 - (local102.j() >> 1), arg0.anInt1570 - (local102.T() >> 1));
		}
		if (arg2.aString15 != null && local214 != null) {
			Static95.method1453(arg1, local220, arg0, local216, local218, local214, arg2);
		}
		if (arg2.anInt2483 != -1 || arg2.aString15 != null) {
			@Pc(711) Class4_Sub32 local711 = new Class4_Sub32(arg0);
			local711.anInt4682 = local106;
			local711.anInt4675 = local222;
			local711.anInt4677 = local104;
			local711.anInt4685 = local228;
			local711.anInt4684 = local224;
			local711.anInt4678 = local226;
			local711.anInt4683 = local108;
			local711.anInt4676 = local110;
			Static100.aClass244_9.method5273(local711);
		}
		return false;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Z)[Lclient!pp;")
	public static Class201[] method1730() {
		return new Class201[] { Static427.aClass201_5, Static37.aClass201_2, Static1.aClass201_1 };
	}
}
