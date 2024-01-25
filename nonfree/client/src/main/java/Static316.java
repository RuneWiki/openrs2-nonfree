import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!pt", name = "e", descriptor = "Lclient!ok;")
	public static Class178 aClass178_93;

	@OriginalMember(owner = "client!pt", name = "p", descriptor = "I")
	public static int anInt5193;

	@OriginalMember(owner = "client!pt", name = "q", descriptor = "I")
	public static int anInt5194;

	@OriginalMember(owner = "client!pt", name = "f", descriptor = "Lclient!uv;")
	public static Class253 aClass253_117 = null;

	@OriginalMember(owner = "client!pt", name = "h", descriptor = "I")
	public static int anInt5188 = 0;

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IILclient!b;ZLclient!ya;Lclient!cs;)Z")
	public static boolean method4107(@OriginalArg(2) Class20 arg0, @OriginalArg(4) Class51 arg1, @OriginalArg(5) Class7_Sub11 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(16) int local16 = Integer.MAX_VALUE;
		@Pc(18) int local18 = Integer.MIN_VALUE;
		if (arg0.anIntArray29 != null) {
			local9 = Static93.anInt4328 + (Static93.anInt4331 - Static93.anInt4328) * (arg2.anInt1059 + (arg0.anInt317 - Static93.anInt4321)) / (Static93.anInt4327 - Static93.anInt4321);
			local18 = Static93.anInt4325 - (Static93.anInt4325 - Static93.anInt4324) * (arg0.anInt310 - (-arg2.anInt1058 + Static93.anInt4329)) / (Static93.anInt4326 - Static93.anInt4329);
			local16 = Static93.anInt4325 - (arg0.anInt316 + arg2.anInt1058 - Static93.anInt4329) * (Static93.anInt4325 + -Static93.anInt4324) / (Static93.anInt4326 - Static93.anInt4329);
			local7 = (arg0.anInt302 + arg2.anInt1059 - Static93.anInt4321) * (Static93.anInt4331 - Static93.anInt4328) / (Static93.anInt4327 - Static93.anInt4321) + Static93.anInt4328;
		}
		@Pc(106) Class11 local106 = null;
		@Pc(108) int local108 = 0;
		@Pc(110) int local110 = 0;
		@Pc(112) int local112 = 0;
		@Pc(114) int local114 = 0;
		if (arg0.anInt295 != -1) {
			if (arg2.aBoolean65 && arg0.anInt307 != -1) {
				local106 = arg0.method220(arg1, true);
			} else {
				local106 = arg0.method220(arg1, false);
			}
			if (local106 != null) {
				local108 = arg2.anInt1057 - (local106.j() + 1 >> 1);
				local110 = arg2.anInt1057 + (local106.j() + 1 >> 1);
				if (local7 > local108) {
					local7 = local108;
				}
				local112 = arg2.anInt1063 - (local106.T() + 1 >> 1);
				if (local110 > local9) {
					local9 = local110;
				}
				local114 = arg2.anInt1063 + (local106.T() + 1 >> 1);
				if (local16 > local112) {
					local16 = local112;
				}
				if (local114 > local18) {
					local18 = local114;
				}
			}
		}
		@Pc(206) Class241 local206 = null;
		@Pc(208) int local208 = 0;
		@Pc(210) int local210 = 0;
		@Pc(212) int local212 = 0;
		@Pc(214) int local214 = 0;
		@Pc(216) int local216 = 0;
		@Pc(218) int local218 = 0;
		@Pc(220) int local220 = 0;
		@Pc(270) int local270;
		@Pc(293) int local293;
		if (arg0.aString2 != null) {
			local206 = Static111.method1912(arg0.anInt287);
			if (local206 != null) {
				local208 = Static189.aClass57_14.method1389(Static165.aStringArray25, null, null, arg0.aString2);
				local210 = arg2.anInt1063;
				if (local106 == null) {
					local210 -= local208 * local206.method5054() / 2;
				} else {
					local210 -= (local106.T() >> 1) + (local206.method5055() * local208);
				}
				for (local270 = 0; local270 < local208; local270++) {
					@Pc(276) String local276 = Static165.aStringArray25[local270];
					if (local208 - 1 > local270) {
						local276 = local276.substring(0, local276.length() - 4);
					}
					local293 = local206.method5057(local276);
					if (local293 > local212) {
						local212 = local293;
					}
				}
				local214 = arg2.anInt1057 - local212 / 2;
				if (local214 < local7) {
					local7 = local214;
				}
				local216 = arg2.anInt1057 + local212 / 2;
				local218 = local210;
				if (local216 > local9) {
					local9 = local216;
				}
				local220 = local210 + local206.method5055() * local208;
				if (local218 < local16) {
					local16 = local218;
				}
				if (local18 < local220) {
					local18 = local220;
				}
			}
		}
		if (Static93.anInt4328 > local9 || local7 > Static93.anInt4331 || local18 < Static93.anInt4324 || local16 > Static93.anInt4325) {
			return true;
		}
		@Pc(403) int local403;
		if (arg0.anIntArray29 != null) {
			@Pc(401) int[] local401 = new int[arg0.anIntArray29.length];
			for (local403 = 0; local403 < local401.length / 2; local403++) {
				local293 = arg0.anIntArray29[local403 * 2] + arg2.anInt1059;
				@Pc(427) int local427 = arg2.anInt1058 + arg0.anIntArray29[local403 * 2 + 1];
				local401[local403 * 2] = Static93.anInt4328 + (local293 - Static93.anInt4321) * (-Static93.anInt4328 + Static93.anInt4331) / (Static93.anInt4327 - Static93.anInt4321);
				local401[local403 * 2 + 1] = Static93.anInt4325 - (local427 - Static93.anInt4329) * (Static93.anInt4325 - Static93.anInt4324) / (Static93.anInt4326 - Static93.anInt4329);
			}
			Static241.method3268(arg1, local401, arg0.anInt288);
			for (local293 = 0; local293 < local401.length / 2 - 1; local293++) {
				arg1.method5304(local401[(local293 + 1) * 2], local401[local293 * 2], local401[local293 * 2 + 1], arg0.anInt299, local401[(local293 + 1) * 2 + 1]);
			}
			arg1.method5304(local401[0], local401[local401.length - 2], local401[local401.length - 1], arg0.anInt299, local401[1]);
		}
		if (local106 != null) {
			if (Static339.anInt5508 > 0 && (Static237.anInt4069 != -1 && Static237.anInt4069 == arg2.anInt1062 || Static54.anInt935 != -1 && Static54.anInt935 == arg0.anInt314)) {
				if (Static129.anInt2479 <= 50) {
					local270 = Static129.anInt2479 * 2;
				} else {
					local270 = 200 - Static129.anInt2479 * 2;
				}
				local403 = local270 << 24 | 0xFFFF00;
				arg1.method5303(arg2.anInt1057, local106.la() / 2 + 7, local403, arg2.anInt1063);
				arg1.method5303(arg2.anInt1057, local106.la() / 2 + 5, local403, arg2.anInt1063);
				arg1.method5303(arg2.anInt1057, local106.la() / 2 + 3, local403, arg2.anInt1063);
				arg1.method5303(arg2.anInt1057, local106.la() / 2 + 1, local403, arg2.anInt1063);
				arg1.method5303(arg2.anInt1057, local106.la() / 2, local403, arg2.anInt1063);
			}
			local106.method4394(arg2.anInt1057 - (local106.j() >> 1), arg2.anInt1063 + -(local106.T() >> 1));
		}
		if (arg0.aString2 != null && local206 != null) {
			Static6.method26(arg2, local206, local208, arg1, arg0, local210, local212);
		}
		if (arg0.anInt295 != -1 || arg0.aString2 != null) {
			@Pc(713) Class7_Sub33 local713 = new Class7_Sub33(arg2);
			local713.anInt4897 = local112;
			local713.anInt4896 = local114;
			local713.anInt4905 = local214;
			local713.anInt4903 = local216;
			local713.anInt4900 = local220;
			local713.anInt4895 = local218;
			local713.anInt4901 = local108;
			local713.anInt4898 = local110;
			Static238.aClass85_27.method2011(local713);
		}
		return false;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(II)V")
	public static void method4108(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = Static274.anInt4617 - Static48.anInt751;
		if (local7 >= 100) {
			Static9.anInt60 = 1;
			return;
		}
		@Pc(18) int local18 = (int) Static67.aFloat36;
		if (Static290.anInt4840 >> 8 > local18) {
			local18 = Static290.anInt4840 >> 8;
		}
		if (Static172.aBooleanArray15[4] && Static388.anIntArray562[4] + 128 > local18) {
			local18 = Static388.anIntArray562[4] + 128;
		}
		@Pc(59) int local59 = Static243.anInt4160 + (int) Static97.aFloat52 & 0x3FFF;
		Static412.method5181(Static87.anInt1714, (local18 >> 3) * 3 + 600 << 0, Static333.method2748(Static268.anInt4539, Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7383, Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7388) - 50, Static335.anInt5453, local59, local18, arg0);
		@Pc(103) float local103 = 1.0F - (float) ((100 - local7) * (100 - local7) * (100 - local7)) / 1000000.0F;
		Static181.anInt3254 = (int) ((float) Static119.anInt2395 + local103 * (float) (Static181.anInt3254 - Static119.anInt2395));
		Static212.anInt3801 = (int) ((float) Static194.anInt3448 + (float) (Static212.anInt3801 - Static194.anInt3448) * local103);
		Static9.anInt55 = (int) ((float) Static397.anInt6335 + (float) (Static9.anInt55 - Static397.anInt6335) * local103);
		Static46.anInt737 = (int) ((float) (Static46.anInt737 - anInt5193) * local103 + (float) anInt5193);
		@Pc(156) int local156 = Static92.anInt1897 - Static90.anInt1869;
		if (local156 > 8192) {
			local156 -= 16384;
		} else if (local156 < -8192) {
			local156 += 16384;
		}
		Static92.anInt1897 = (int) (local103 * (float) local156 + (float) Static90.anInt1869);
		Static92.anInt1897 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(CB)Z")
	public static boolean method4110(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}
}
