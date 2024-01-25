import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!ot", name = "d", descriptor = "Lclient!la;")
	public static final Class136 aClass136_154 = new Class136(52, 1);

	@OriginalMember(owner = "client!ot", name = "e", descriptor = "Lclient!lp;")
	public static final Class140 aClass140_32 = new Class140(16);

	@OriginalMember(owner = "client!ot", name = "j", descriptor = "[[I")
	public static final int[][] anIntArrayArray47 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lclient!ni;I)V")
	public static void method4633(@OriginalArg(0) Class163 arg0) {
		Static243.aClass3_Sub25_Sub1_7.method2781(arg0.method3810());
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ILclient!qa;ILclient!mk;ILclient!fb;)Z")
	public static boolean method4634(@OriginalArg(1) Class167 arg0, @OriginalArg(3) Class152 arg1, @OriginalArg(5) Class3_Sub16 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(14) int local14 = Integer.MIN_VALUE;
		@Pc(16) int local16 = Integer.MAX_VALUE;
		@Pc(18) int local18 = Integer.MIN_VALUE;
		if (arg1.anIntArray285 != null) {
			local7 = (arg2.anInt1893 + arg1.anInt4338 - Static211.anInt270) * (Static211.anInt275 - Static211.anInt274) / (Static211.anInt272 - Static211.anInt270) + Static211.anInt274;
			local16 = Static211.anInt269 - (arg1.anInt4348 + arg2.anInt1897 - Static211.anInt271) * (-Static211.anInt267 + Static211.anInt269) / (Static211.anInt268 - Static211.anInt271);
			local14 = (Static211.anInt275 - Static211.anInt274) * (arg1.anInt4320 + arg2.anInt1893 - Static211.anInt270) / (Static211.anInt272 - Static211.anInt270) + Static211.anInt274;
			local18 = Static211.anInt269 - (Static211.anInt269 - Static211.anInt267) * (arg1.anInt4346 + arg2.anInt1897 - Static211.anInt271) / (Static211.anInt268 - Static211.anInt271);
		}
		@Pc(108) Class2 local108 = null;
		@Pc(110) int local110 = 0;
		@Pc(112) int local112 = 0;
		@Pc(114) int local114 = 0;
		@Pc(116) int local116 = 0;
		if (arg1.anInt4321 != -1) {
			if (arg2.aBoolean115 && arg1.anInt4344 != -1) {
				local108 = arg1.method3609(true, arg0);
			} else {
				local108 = arg1.method3609(false, arg0);
			}
			if (local108 != null) {
				local110 = arg2.anInt1899 - (local108.d() + 1 >> 1);
				if (local7 > local110) {
					local7 = local110;
				}
				local112 = arg2.anInt1899 + (local108.d() + 1 >> 1);
				if (local112 > local14) {
					local14 = local112;
				}
				local114 = arg2.anInt1894 - (local108.ga() + 1 >> 1);
				if (local114 < local16) {
					local16 = local114;
				}
				local116 = arg2.anInt1894 + (local108.ga() + 1 >> 1);
				if (local116 > local18) {
					local18 = local116;
				}
			}
		}
		@Pc(214) Class93 local214 = null;
		@Pc(216) int local216 = 0;
		@Pc(218) int local218 = 0;
		@Pc(220) int local220 = 0;
		@Pc(222) int local222 = 0;
		@Pc(224) int local224 = 0;
		@Pc(226) int local226 = 0;
		@Pc(228) int local228 = 0;
		@Pc(277) int local277;
		@Pc(304) int local304;
		if (arg1.aString49 != null) {
			local214 = Static225.method3257(arg1.anInt4332);
			if (local214 != null) {
				local216 = Static215.aClass124_10.method3100(null, Static178.aStringArray17, arg1.aString49, null);
				local218 = arg2.anInt1894;
				if (local108 == null) {
					local218 -= local216 * local214.method2210() / 2;
				} else {
					local218 -= (local108.ga() >> 1) + local214.method2211() * local216;
				}
				for (local277 = 0; local277 < local216; local277++) {
					@Pc(283) String local283 = Static178.aStringArray17[local277];
					if (local216 - 1 > local277) {
						local283 = local283.substring(0, local283.length() - 4);
					}
					local304 = local214.method2213(local283);
					if (local304 > local220) {
						local220 = local304;
					}
				}
				local222 = arg2.anInt1899 - local220 / 2;
				local224 = arg2.anInt1899 + local220 / 2;
				if (local222 < local7) {
					local7 = local222;
				}
				local226 = local218;
				if (local14 < local224) {
					local14 = local224;
				}
				if (local226 < local16) {
					local16 = local226;
				}
				local228 = local216 * local214.method2211() + local218;
				if (local228 > local18) {
					local18 = local228;
				}
			}
		}
		if (local14 < Static211.anInt274 || local7 > Static211.anInt275 || local18 < Static211.anInt267 || Static211.anInt269 < local16) {
			return true;
		}
		@Pc(415) int local415;
		if (arg1.anIntArray285 != null) {
			@Pc(413) int[] local413 = new int[arg1.anIntArray285.length];
			for (local415 = 0; local415 < local413.length / 2; local415++) {
				local304 = arg2.anInt1893 + arg1.anIntArray285[local415 * 2];
				@Pc(439) int local439 = arg2.anInt1897 + arg1.anIntArray285[local415 * 2 + 1];
				local413[local415 * 2] = Static211.anInt274 + (Static211.anInt275 - Static211.anInt274) * (-Static211.anInt270 + local304) / (Static211.anInt272 - Static211.anInt270);
				local413[local415 * 2 + 1] = Static211.anInt269 - (Static211.anInt269 - Static211.anInt267) * (local439 + -Static211.anInt271) / (Static211.anInt268 - Static211.anInt271);
			}
			Static449.method6124(arg0, local413, arg1.anInt4349);
			for (local304 = 0; local304 < local413.length / 2 - 1; local304++) {
				arg0.method5979(local413[local304 * 2 + 1], local413[local304 * 2], arg1.anInt4327, local413[(local304 + 1) * 2 + 1], local413[local304 * 2 + 2]);
			}
			arg0.method5979(local413[local413.length - 1], local413[local413.length - 2], arg1.anInt4327, local413[1], local413[0]);
		}
		if (local108 != null) {
			if (Static110.anInt1953 > 0 && (Static235.anInt4023 != -1 && Static235.anInt4023 == arg2.anInt1896 || Static130.anInt2354 != -1 && Static130.anInt2354 == arg1.anInt4347)) {
				if (Static285.anInt5015 > 50) {
					local277 = 200 - Static285.anInt5015 * 2;
				} else {
					local277 = Static285.anInt5015 * 2;
				}
				local415 = local277 << 24 | 0xFFFF00;
				arg0.method6003(local108.TA() / 2 + 7, arg2.anInt1899, local415, arg2.anInt1894);
				arg0.method6003(local108.TA() / 2 + 5, arg2.anInt1899, local415, arg2.anInt1894);
				arg0.method6003(local108.TA() / 2 + 3, arg2.anInt1899, local415, arg2.anInt1894);
				arg0.method6003(local108.TA() / 2 + 1, arg2.anInt1899, local415, arg2.anInt1894);
				arg0.method6003(local108.TA() / 2, arg2.anInt1899, local415, arg2.anInt1894);
			}
			local108.method5829(arg2.anInt1899 - (local108.d() >> 1), arg2.anInt1894 - (local108.ga() >> 1));
		}
		if (arg1.aString49 != null && local214 != null) {
			Static282.method3979(local216, arg1, arg2, arg0, local214, local218, local220);
		}
		if (arg1.anInt4321 != -1 || arg1.aString49 != null) {
			@Pc(721) Class3_Sub17 local721 = new Class3_Sub17(arg2);
			local721.anInt1929 = local222;
			local721.anInt1926 = local112;
			local721.anInt1927 = local114;
			local721.anInt1925 = local110;
			local721.anInt1930 = local226;
			local721.anInt1933 = local224;
			local721.anInt1931 = local228;
			local721.anInt1924 = local116;
			Static107.aClass193_23.method4527(local721);
		}
		return false;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIIII[B)V")
	public static void method4638(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5) {
		if (arg0 > 0 && !Static94.method1600(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static94.method1600(arg1)) {
			@Pc(34) int local34 = Static358.method5008(arg3);
			@Pc(36) int local36 = 0;
			@Pc(47) int local47 = arg0 < arg1 ? arg0 : arg1;
			@Pc(51) int local51 = arg0 >> 1;
			@Pc(55) int local55 = arg1 >> 1;
			@Pc(57) byte[] local57 = arg5;
			@Pc(64) byte[] local64 = new byte[local34 * local55 * local51];
			while (true) {
				OpenGL.glTexImage2Dub(arg4, local36, arg2, arg0, arg1, 0, arg3, 5121, local57, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(82) int local82 = arg0 * local34;
				for (@Pc(84) int local84 = 0; local84 < local34; local84++) {
					@Pc(88) int local88 = local84;
					@Pc(90) int local90 = local84;
					@Pc(95) int local95 = local84 + local82;
					for (@Pc(97) int local97 = 0; local97 < local55; local97++) {
						for (@Pc(101) int local101 = 0; local101 < local51; local101++) {
							@Pc(107) byte local107 = local57[local90];
							local90 += local34;
							@Pc(117) int local117 = local107 + local57[local90];
							local90 += local34;
							@Pc(127) int local127 = local117 + local57[local95];
							local95 += local34;
							@Pc(137) int local137 = local127 + local57[local95];
							local95 += local34;
							local64[local88] = (byte) (local137 >> 2);
							local88 += local34;
						}
						local90 += local82;
						local95 += local82;
					}
				}
				@Pc(178) byte[] local178 = local64;
				local64 = local57;
				local57 = local178;
				arg0 = local51;
				arg1 = local55;
				local55 >>= 0x1;
				local47 >>= 0x1;
				local36++;
				local51 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZI)Lclient!un;")
	public static Class248 method4639(@OriginalArg(1) int arg0) {
		@Pc(10) Class248 local10 = (Class248) Static368.aClass268_52.method6166((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static314.aClass250_76.method5806(0, arg0);
		local10 = new Class248();
		if (local20 != null) {
			local10.method5741(new Class3_Sub25(local20));
		}
		local10.method5739();
		Static368.aClass268_52.method6164(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(BZLjava/lang/String;)V")
	public static void method4640(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static79.anInt1430 >= 100) {
			Static370.method5160(Static456.aClass174_213.method4208(Static300.anInt5192));
			return;
		}
		@Pc(24) String local24 = Static30.method547(arg1);
		if (local24 == null) {
			return;
		}
		@Pc(67) String local67;
		for (@Pc(29) int local29 = 0; local29 < Static79.anInt1430; local29++) {
			@Pc(37) String local37 = Static30.method547(Static47.aStringArray7[local29]);
			if (local37 != null && local37.equals(local24)) {
				Static370.method5160(arg1 + Static194.aClass174_107.method4208(Static300.anInt5192));
				return;
			}
			if (Static334.aStringArray34[local29] != null) {
				local67 = Static30.method547(Static334.aStringArray34[local29]);
				if (local67 != null && local67.equals(local24)) {
					Static370.method5160(arg1 + Static194.aClass174_107.method4208(Static300.anInt5192));
					return;
				}
			}
		}
		for (@Pc(97) int local97 = 0; local97 < Static12.anInt180; local97++) {
			local67 = Static30.method547(Static296.aStringArray32[local97]);
			if (local67 != null && local67.equals(local24)) {
				Static370.method5160(Static134.aClass174_70.method4208(Static300.anInt5192) + arg1 + Static287.aClass174_186.method4208(Static300.anInt5192));
				return;
			}
			if (Static347.aStringArray35[local97] != null) {
				@Pc(140) String local140 = Static30.method547(Static347.aStringArray35[local97]);
				if (local140 != null && local140.equals(local24)) {
					Static370.method5160(Static134.aClass174_70.method4208(Static300.anInt5192) + arg1 + Static287.aClass174_186.method4208(Static300.anInt5192));
					return;
				}
			}
		}
		if (Static30.method547(Static203.aClass1_Sub2_Sub6_Sub2_1.aString69).equals(local24)) {
			Static370.method5160(Static463.aClass174_218.method4208(Static300.anInt5192));
		} else {
			method4633(Static117.aClass163_59);
			Static243.aClass3_Sub25_Sub1_7.method4081(Static47.method891(arg1) + 1);
			Static243.aClass3_Sub25_Sub1_7.method4080(arg1);
			Static243.aClass3_Sub25_Sub1_7.method4081(arg0 ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(B)V")
	public static void method4641() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static373.anInt6324; local9++) {
			for (@Pc(13) int local13 = 0; local13 < Static291.anInt5062; local13++) {
				if (Static363.method5077(local7, Static389.aClass227ArrayArrayArray3, local13, local9, true)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(BII)Z")
	public static boolean method4642(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static201.method3086(arg1, arg0) & Static459.method4921(arg1, arg0);
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(II)I")
	public static int method4644(@OriginalArg(1) int arg0) {
		@Pc(18) int local18 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(33) int local33 = (local24 * arg0 >> 12) + 40960;
		return local18 * local33 >> 12;
	}
}
