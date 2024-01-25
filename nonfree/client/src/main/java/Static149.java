import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!fp", name = "F", descriptor = "[B")
	public static byte[] aByteArray27;

	@OriginalMember(owner = "client!fp", name = "A", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_50 = new Class90(104, -1);

	@OriginalMember(owner = "client!fp", name = "I", descriptor = "[I")
	public static final int[] anIntArray156 = new int[256];

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIIIII)V")
	public static void method2564(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(13) int local13 = arg2 * arg2;
		@Pc(17) int local17 = arg4 * arg4;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg4 << 1;
		@Pc(38) int local38 = local21 + (1 - local29) * local13;
		@Pc(52) int local52 = local17 - (local29 - 1) * local25;
		@Pc(56) int local56 = local13 << 2;
		@Pc(60) int local60 = local17 << 2;
		@Pc(68) int local68 = local21 * 3;
		@Pc(76) int local76 = ((arg4 << 1) - 3) * local25;
		@Pc(82) int local82 = local60;
		@Pc(100) int local100;
		@Pc(109) int local109;
		if (arg0 >= Static289.anInt5872 && arg0 <= Static160.anInt3347) {
			local100 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, arg3 + arg2);
			local109 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, arg3 - arg2);
			Static238.method3886(Static442.anIntArrayArray48[arg0], local100, arg1, local109);
		}
		@Pc(125) int local125 = local56 * (arg4 - 1);
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local52 += local82;
					local38 += local68;
					local7++;
					local82 += local60;
					local68 += local60;
				}
			}
			if (local52 < 0) {
				local38 += local68;
				local52 += local82;
				local68 += local60;
				local82 += local60;
				local7++;
			}
			local38 += -local125;
			local52 += -local76;
			local76 -= local56;
			local9--;
			local125 -= local56;
			local100 = arg0 - local9;
			local109 = arg0 + local9;
			if (local109 >= Static289.anInt5872 && Static160.anInt3347 >= local100) {
				@Pc(225) int local225 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, local7 + arg3);
				@Pc(234) int local234 = Static87.method1817(Static292.anInt5983, Static61.anInt1627, arg3 - local7);
				if (Static289.anInt5872 <= local100) {
					Static238.method3886(Static442.anIntArrayArray48[local100], local225, arg1, local234);
				}
				if (Static160.anInt3347 >= local109) {
					Static238.method3886(Static442.anIntArrayArray48[local109], local225, arg1, local234);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "(B)V")
	public static void method2566() {
		if (Static523.anInt9612 < 0) {
			return;
		}
		@Pc(7) long local7 = Static112.method2047();
		Static523.anInt9612 = (int) ((long) Static523.anInt9612 + Static322.aLong170 - local7);
		if (Static523.anInt9612 <= 0) {
			Static226.anInt4723 = Static251.aClass116_1.anInt3325;
			Static61.aFloat48 = Static251.aClass116_1.aFloat75;
			Static337.anInt6492 = Static251.aClass116_1.anInt3319;
			Static388.aFloat183 = Static251.aClass116_1.aFloat77;
			Static489.anInt6943 = Static251.aClass116_1.anInt3318;
			Static523.anInt9612 = -1;
			Static4.aFloat51 = Static251.aClass116_1.aFloat78;
			Static557.aClass112_4 = Static251.aClass116_1.aClass112_1;
			Static492.aFloat195 = Static251.aClass116_1.aFloat80;
			Static231.aFloat106 = Static251.aClass116_1.aFloat76;
			Static145.aFloat72 = Static251.aClass116_1.aFloat79;
		} else {
			@Pc(61) int local61 = (Static523.anInt9612 << 8) / Static480.anInt10344;
			@Pc(66) int local66 = 255 - local61;
			@Pc(71) float local71 = (float) local61 / 255.0F;
			@Pc(76) float local76 = 1.0F - local71;
			Static489.anInt6943 = (local66 * (Static251.aClass116_1.anInt3318 & 0xFF00FF) + local61 * (Static465.anInt8864 & 0xFF00FF) & 0xFF00FF00) + (local61 * (Static465.anInt8864 & 0xFF00) + (Static251.aClass116_1.anInt3318 & 0xFF00) * local66 & 0xFF0000) >>> 8;
			Static492.aFloat195 = local76 * (Static251.aClass116_1.aFloat80 - Static44.aFloat46) + Static44.aFloat46;
			Static231.aFloat106 = Static450.aFloat190 + local76 * (Static251.aClass116_1.aFloat76 - Static450.aFloat190);
			Static388.aFloat183 = Static370.aFloat164 + (Static251.aClass116_1.aFloat77 - Static370.aFloat164) * local76;
			Static226.anInt4723 = Static251.aClass116_1.anInt3325 * local66 + local61 * Static346.anInt6641 >> 8;
			Static61.aFloat48 = local76 * (Static251.aClass116_1.aFloat75 - Static376.aFloat181) + Static376.aFloat181;
			Static145.aFloat72 = Static27.aFloat98 + (Static251.aClass116_1.aFloat79 - Static27.aFloat98) * local76;
			Static4.aFloat51 = Static317.aFloat155 + (Static251.aClass116_1.aFloat78 - Static317.aFloat155) * local76;
			Static337.anInt6492 = (local66 * (Static251.aClass116_1.anInt3319 & 0xFF00FF) + (Static168.anInt3485 & 0xFF00FF) * local61 & 0xFF00FF00) + (local66 * (Static251.aClass116_1.anInt3319 & 0xFF00) + local61 * (Static168.anInt3485 & 0xFF00) & 0xFF0000) >>> 8;
			if (Static265.aClass112_2 != Static251.aClass116_1.aClass112_1) {
				Static557.aClass112_4 = Static25.aClass7_1.method7816(Static265.aClass112_2, Static251.aClass116_1.aClass112_1, local76, Static557.aClass112_4);
			}
		}
		Static322.aLong170 = local7;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!fu;IILclient!rca;Lclient!r;B)Z")
	public static boolean method2567(@OriginalArg(0) Class4_Sub20 arg0, @OriginalArg(3) Class288 arg1, @OriginalArg(4) Class7 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg1.anIntArray498 != null) {
			local9 = (arg1.anInt8590 + arg0.anInt3263 - Static572.anInt10064) * (Static572.anInt10055 - Static572.anInt10060) / (Static572.anInt10058 - Static572.anInt10064) + Static572.anInt10060;
			local11 = Static572.anInt10063 - (arg0.anInt3264 + arg1.anInt8581 - Static572.anInt10054) * (-Static572.anInt10053 + Static572.anInt10063) / (Static572.anInt10061 - Static572.anInt10054);
			local13 = Static572.anInt10063 - (Static572.anInt10063 - Static572.anInt10053) * (-Static572.anInt10054 + arg0.anInt3264 + arg1.anInt8573) / (Static572.anInt10061 - Static572.anInt10054);
			local7 = (arg1.anInt8596 + arg0.anInt3263 - Static572.anInt10064) * (Static572.anInt10055 - Static572.anInt10060) / (Static572.anInt10058 - Static572.anInt10064) + Static572.anInt10060;
		}
		@Pc(102) Class88 local102 = null;
		@Pc(104) int local104 = 0;
		@Pc(106) int local106 = 0;
		@Pc(108) int local108 = 0;
		@Pc(110) int local110 = 0;
		if (arg1.anInt8577 != -1) {
			if (arg0.aBoolean239 && arg1.anInt8597 != -1) {
				local102 = arg1.method6629(true, arg2);
			} else {
				local102 = arg1.method6629(false, arg2);
			}
			if (local102 != null) {
				local104 = arg0.anInt3259 - (local102.A() + 1 >> 1);
				if (local104 < local7) {
					local7 = local104;
				}
				local106 = arg0.anInt3259 + (local102.A() + 1 >> 1);
				local108 = arg0.anInt3260 - (local102.ca() + 1 >> 1);
				if (local9 < local106) {
					local9 = local106;
				}
				local110 = arg0.anInt3260 + (local102.ca() + 1 >> 1);
				if (local11 > local108) {
					local11 = local108;
				}
				if (local13 < local110) {
					local13 = local110;
				}
			}
		}
		@Pc(214) Class202 local214 = null;
		@Pc(216) int local216 = 0;
		@Pc(218) int local218 = 0;
		@Pc(220) int local220 = 0;
		@Pc(222) int local222 = 0;
		@Pc(224) int local224 = 0;
		@Pc(226) int local226 = 0;
		@Pc(228) int local228 = 0;
		@Pc(277) int local277;
		@Pc(300) int local300;
		if (arg1.aString177 != null) {
			local214 = Static203.method3297(arg1.anInt8603);
			if (local214 != null) {
				local216 = Static174.aClass198_8.method4763(null, Static86.aStringArray6, null, arg1.aString177);
				local218 = arg0.anInt3260;
				if (local102 == null) {
					local218 -= local214.method4814() * local216 / 2;
				} else {
					local218 -= (local102.ca() >> 1) + local216 * local214.method4811();
				}
				for (local277 = 0; local277 < local216; local277++) {
					@Pc(283) String local283 = Static86.aStringArray6[local277];
					if (local216 - 1 > local277) {
						local283 = local283.substring(0, local283.length() - 4);
					}
					local300 = local214.method4810(local283);
					if (local220 < local300) {
						local220 = local300;
					}
				}
				local222 = arg0.anInt3259 - local220 / 2;
				if (local222 < local7) {
					local7 = local222;
				}
				local224 = local220 / 2 + arg0.anInt3259;
				if (local224 > local9) {
					local9 = local224;
				}
				local226 = local218;
				local228 = local218 + local214.method4811() * local216;
				if (local226 < local11) {
					local11 = local226;
				}
				if (local228 > local13) {
					local13 = local228;
				}
			}
		}
		if (local9 < Static572.anInt10060 || local7 > Static572.anInt10055 || local13 < Static572.anInt10053 || local11 > Static572.anInt10063) {
			return true;
		}
		@Pc(410) int local410;
		if (arg1.anIntArray498 != null) {
			@Pc(408) int[] local408 = new int[arg1.anIntArray498.length];
			for (local410 = 0; local410 < local408.length / 2; local410++) {
				local300 = arg0.anInt3263 + arg1.anIntArray498[local410 * 2];
				@Pc(434) int local434 = arg0.anInt3264 + arg1.anIntArray498[local410 * 2 + 1];
				local408[local410 * 2] = Static572.anInt10060 + (Static572.anInt10055 - Static572.anInt10060) * (-Static572.anInt10064 + local300) / (Static572.anInt10058 - Static572.anInt10064);
				local408[local410 * 2 + 1] = Static572.anInt10063 - (Static572.anInt10063 - Static572.anInt10053) * (-Static572.anInt10054 + local434) / (Static572.anInt10061 - Static572.anInt10054);
			}
			Static133.method2403(arg2, local408, arg1.anInt8602);
			for (local300 = 0; local300 < local408.length / 2 - 1; local300++) {
				arg2.method7844(local408[local300 * 2 + 2], arg1.anInt8600, local408[local300 * 2 + 1], local408[(local300 + 1) * 2 + 1], local408[local300 * 2]);
			}
			arg2.method7844(local408[0], arg1.anInt8600, local408[local408.length - 1], local408[1], local408[local408.length - 2]);
		}
		if (local102 != null) {
			if (Static536.anInt9797 > 0 && (Static139.anInt3063 != -1 && arg0.anInt3266 == Static139.anInt3063 || Static537.anInt9803 != -1 && Static537.anInt9803 == arg1.anInt8601)) {
				if (Static44.anInt1296 > 50) {
					local277 = (100 - Static44.anInt1296) * 2;
				} else {
					local277 = Static44.anInt1296 * 2;
				}
				local410 = local277 << 24 | 0xFFFF00;
				arg2.method7846(arg0.anInt3260, local410, arg0.anInt3259, local102.E() / 2 + 7);
				arg2.method7846(arg0.anInt3260, local410, arg0.anInt3259, local102.E() / 2 + 5);
				arg2.method7846(arg0.anInt3260, local410, arg0.anInt3259, local102.E() / 2 + 3);
				arg2.method7846(arg0.anInt3260, local410, arg0.anInt3259, local102.E() / 2 + 1);
				arg2.method7846(arg0.anInt3260, local410, arg0.anInt3259, local102.E() / 2);
			}
			local102.method8051(arg0.anInt3259 - (local102.A() >> 1), arg0.anInt3260 + -(local102.ca() >> 1));
		}
		if (arg1.aString177 != null && local214 != null) {
			Static9.method675(arg0, local220, local216, arg1, arg2, local214, local218);
		}
		if (arg1.anInt8577 != -1 || arg1.aString177 != null) {
			@Pc(719) Class4_Sub4 local719 = new Class4_Sub4(arg0);
			local719.anInt1193 = local104;
			local719.anInt1191 = local222;
			local719.anInt1195 = local224;
			local719.anInt1200 = local108;
			local719.anInt1194 = local110;
			local719.anInt1196 = local226;
			local719.anInt1192 = local228;
			local719.anInt1190 = local106;
			Static308.aClass22_40.method894(local719);
		}
		return false;
	}

	@OriginalMember(owner = "client!fp", name = "d", descriptor = "(B)V")
	public static void method2568() {
		Static268.anIntArray292 = null;
		Static60.anIntArray58 = null;
		Static574.anIntArray580 = null;
		Static233.anIntArray241 = null;
		Static492.anIntArray532 = null;
		Static174.aBoolean269 = false;
	}
}
