import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "Lclient!vc;")
	public static Class349 aClass349_2;

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "Lclient!sl;")
	private static Class310 aClass310_2;

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "Lclient!go;")
	public static Class115 aClass115_3;

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "Lclient!ng;")
	public static Class3_Sub1_Sub16 aClass3_Sub1_Sub16_2;

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "Lclient!ln;")
	public static Class204 aClass204_2;

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "Lclient!dk;")
	public static Interface6 anInterface6_2;

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "Lclient!kha;")
	public static Class181 aClass181_16;

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "Lclient!pe;")
	private static Class258 aClass258_2;

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "F")
	public static float aFloat88;

	@OriginalMember(owner = "client!nb", name = "k", descriptor = "F")
	public static float aFloat89;

	@OriginalMember(owner = "client!nb", name = "m", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!nb", name = "n", descriptor = "Lclient!dca;")
	public static Class57 aClass57_2;

	@OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
	public static int anInt2219;

	@OriginalMember(owner = "client!nb", name = "t", descriptor = "[B")
	private static byte[] aByteArray17;

	@OriginalMember(owner = "client!nb", name = "u", descriptor = "[B")
	private static byte[] aByteArray18;

	@OriginalMember(owner = "client!nb", name = "v", descriptor = "[I")
	private static int[] anIntArray82;

	@OriginalMember(owner = "client!nb", name = "w", descriptor = "[B")
	private static byte[] aByteArray19;

	@OriginalMember(owner = "client!nb", name = "x", descriptor = "[B")
	private static byte[] aByteArray20;

	@OriginalMember(owner = "client!nb", name = "y", descriptor = "I")
	public static int anInt2220;

	@OriginalMember(owner = "client!nb", name = "z", descriptor = "I")
	public static int anInt2221;

	@OriginalMember(owner = "client!nb", name = "A", descriptor = "I")
	public static int anInt2222;

	@OriginalMember(owner = "client!nb", name = "B", descriptor = "[S")
	private static short[] aShortArray23;

	@OriginalMember(owner = "client!nb", name = "C", descriptor = "I")
	public static int anInt2223;

	@OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
	public static int anInt2224;

	@OriginalMember(owner = "client!nb", name = "E", descriptor = "Lclient!sga;")
	private static Class307 aClass307_12;

	@OriginalMember(owner = "client!nb", name = "F", descriptor = "I")
	public static int anInt2225;

	@OriginalMember(owner = "client!nb", name = "G", descriptor = "[S")
	private static short[] aShortArray24;

	@OriginalMember(owner = "client!nb", name = "H", descriptor = "I")
	public static int anInt2226;

	@OriginalMember(owner = "client!nb", name = "I", descriptor = "I")
	public static int anInt2227;

	@OriginalMember(owner = "client!nb", name = "J", descriptor = "I")
	public static int anInt2228;

	@OriginalMember(owner = "client!nb", name = "K", descriptor = "[[[Lclient!wo;")
	private static Class375[][][] aClass375ArrayArrayArray2;

	@OriginalMember(owner = "client!nb", name = "L", descriptor = "I")
	public static int anInt2229;

	@OriginalMember(owner = "client!nb", name = "M", descriptor = "I")
	public static int anInt2230;

	@OriginalMember(owner = "client!nb", name = "N", descriptor = "[B")
	private static byte[] aByteArray21;

	@OriginalMember(owner = "client!nb", name = "O", descriptor = "I")
	public static int anInt2231;

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "Lclient!sga;")
	private static final Class307 aClass307_11 = new Class307(16);

	@OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
	public static int anInt2217 = (int) (Math.random() * 11.0D) - 5;

	@OriginalMember(owner = "client!nb", name = "o", descriptor = "[B")
	private static final byte[] aByteArray16 = new byte[1];

	@OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
	public static int anInt2218 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!nb", name = "r", descriptor = "Lclient!qia;")
	public static final Class276 aClass276_14 = new Class276();

	@OriginalMember(owner = "client!nb", name = "s", descriptor = "[S")
	private static final short[] aShortArray22 = new short[1];

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!ha;IIII[S[B)V")
	private static void method2155(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		if (arg5 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < arg5.length; local4++) {
			@Pc(14) Class272 local14 = aClass349_2.method8123(arg5[local4] & 0xFFFF);
			@Pc(17) int local17 = local14.anInt8268;
			if (local17 != -1) {
				@Pc(25) Class164 local25 = aClass204_2.method5447(local17);
				@Pc(49) Class5 local49 = local25.method4907(local14.aBoolean700 ? local14.aBoolean711 : false, local14.aBoolean703 ? arg6[local4] >> 6 & 0x3 : 0, arg0);
				if (local49 != null) {
					@Pc(58) int local58 = arg3 * local49.method7589() >> 2;
					@Pc(65) int local65 = arg4 * local49.method7585() >> 2;
					if (local25.aBoolean504) {
						@Pc(71) int local71 = local14.anInt8263;
						@Pc(74) int local74 = local14.anInt8284;
						if ((arg6[local4] >> 6 & 0x1) == 1) {
							@Pc(85) int local85 = local71;
							local71 = local74;
							local74 = local85;
						}
						local58 = local71 * arg3;
						local65 = local74 * arg4;
					}
					if (local58 != 0 && local65 != 0) {
						if (local25.anInt5791 == 0) {
							local49.method7590(arg1, arg2 + arg4 - local65, local58, local65);
						} else {
							local49.method7596(arg1, arg2 + arg4 - local65, local58, local65, 0, local25.anInt5791 | 0xFF000000, 1);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)Lclient!ng;")
	public static Class3_Sub1_Sub16 method2156(@OriginalArg(0) int arg0) {
		return (Class3_Sub1_Sub16) aClass307_11.method7424((long) arg0);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "()V")
	public static void method2157() {
		@Pc(2) int[] local2 = new int[3];
		for (@Pc(4) int local4 = 0; local4 < aClass57_2.anInt2284; local4++) {
			@Pc(32) boolean local32 = aClass3_Sub1_Sub16_2.method5926(local2, aClass57_2.anIntArray92[local4] >> 28 & 0x3, aClass57_2.anIntArray92[local4] & 0x3FFF, aClass57_2.anIntArray92[local4] >> 14 & 0x3FFF);
			if (local32) {
				@Pc(42) Class3_Sub22 local42 = new Class3_Sub22(aClass57_2.anIntArray93[local4]);
				local42.anInt4124 = local2[1] - anInt2229;
				local42.anInt4117 = local2[2] - anInt2230;
				aClass276_14.method6906(local42);
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "([B[B[SII)V")
	private static void method2158(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int[] local2 = new int[anInt2226];
		@Pc(5) int[] local5 = new int[anInt2226];
		@Pc(8) int[] local8 = new int[anInt2226];
		@Pc(11) int[] local11 = new int[anInt2226];
		@Pc(14) int[] local14 = new int[anInt2226];
		for (@Pc(16) int local16 = -5; local16 < anInt2228; local16++) {
			@Pc(21) int local21 = local16 + 5;
			@Pc(25) int local25 = local16 - 5;
			@Pc(41) int local41;
			for (@Pc(27) int local27 = 0; local27 < anInt2226; local27++) {
				@Pc(50) Class69 local50;
				@Pc(86) int local86;
				if (local21 < anInt2228) {
					local41 = arg0[local21 + local27 * anInt2228] & 0xFF;
					if (local41 > 0) {
						local50 = aClass310_2.method7464(local41 - 1);
						local2[local27] += local50.anInt2624;
						local5[local27] += local50.anInt2629;
						local8[local27] += local50.anInt2621;
						local11[local27] += local50.anInt2620;
						local86 = local14[local27]++;
					}
				}
				if (local25 >= 0) {
					local41 = arg0[local25 + local27 * anInt2228] & 0xFF;
					if (local41 > 0) {
						local50 = aClass310_2.method7464(local41 - 1);
						local2[local27] -= local50.anInt2624;
						local5[local27] -= local50.anInt2629;
						local8[local27] -= local50.anInt2621;
						local11[local27] -= local50.anInt2620;
						local86 = local14[local27]--;
					}
				}
			}
			if (local16 >= 0) {
				local41 = 0;
				@Pc(159) int local159 = 0;
				@Pc(161) int local161 = 0;
				@Pc(163) int local163 = 0;
				@Pc(165) int local165 = 0;
				for (@Pc(167) int local167 = -5; local167 < anInt2226; local167++) {
					@Pc(172) int local172 = local167 + 5;
					if (local172 < anInt2226) {
						local41 += local2[local172];
						local159 += local5[local172];
						local161 += local8[local172];
						local163 += local11[local172];
						local165 += local14[local172];
					}
					@Pc(209) int local209 = local167 - 5;
					if (local209 >= 0) {
						local41 -= local2[local209];
						local159 -= local5[local209];
						local161 -= local8[local209];
						local163 -= local11[local209];
						local165 -= local14[local209];
					}
					if (local167 >= 0 && local165 > 0) {
						@Pc(261) int local261;
						if ((arg0[local16 + local167 * anInt2228] & 0xFF) == 0) {
							local261 = local16 + local167 * anInt2228;
							arg1[local261] = 0;
							arg2[local261] = 0;
						} else {
							local261 = local163 == 0 ? 0 : Static370.method5910(local41 * 256 / local163, local161 / local165, local159 / local165);
							@Pc(294) int local294 = (local261 & 0x7F) + arg4;
							if (local294 < 0) {
								local294 = 0;
							} else if (local294 > 127) {
								local294 = 127;
							}
							@Pc(316) int local316 = (local261 + arg3 & 0xFC00) + (local261 & 0x380) + local294;
							@Pc(322) int local322 = local16 + local167 * anInt2228;
							@Pc(333) int local333 = Static474.anIntArray530[Static551.method8398(Static319.method5426(local316)) & 0xFFFF];
							arg1[local322] = (byte) (local333 >> 16 & 0xFF);
							arg2[local322] = (short) (local333 & 0xFFFF);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt2224 = arg0 - anInt2229;
		anInt2223 = arg1 - anInt2230;
		anInt2221 = arg2 - anInt2229;
		anInt2225 = arg3 - anInt2230;
		anInt2220 = arg4;
		anInt2222 = arg5;
		anInt2231 = arg6;
		anInt2227 = arg7;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!d;III)I")
	private static int method2160(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class374 local4 = aClass258_2.method6555(arg1);
		if (local4 == null) {
			return 0;
		}
		@Pc(11) int local11 = local4.anInt10478;
		if (local11 >= 0 && arg0.method6869(local11).aBoolean497) {
			local11 = -1;
		}
		@Pc(68) int local68;
		@Pc(27) int local27;
		@Pc(33) int local33;
		@Pc(55) int local55;
		if (local4.anInt10472 >= 0) {
			local27 = local4.anInt10472;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static474.anIntArray530[Static551.method8398(Static427.method6576(local55)) & 0xFFFF] | 0xFF000000;
		} else if (local11 >= 0) {
			local68 = Static474.anIntArray530[Static551.method8398(Static427.method6576(arg0.method6869(local11).aShort82)) & 0xFFFF] | 0xFF000000;
		} else if (local4.anInt10477 == -1) {
			local68 = 0;
		} else {
			local27 = local4.anInt10477;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static474.anIntArray530[Static551.method8398(Static427.method6576(local55)) & 0xFFFF] | 0xFF000000;
		}
		return local68;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!ha;II)V")
	public static void method2161(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class3_Sub15 local9 = new Class3_Sub15(aClass181_16.method5026(aClass3_Sub1_Sub16_2.aString75, "area"));
		@Pc(13) int local13 = local9.method8401();
		@Pc(16) int[] local16 = new int[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			local16[local18] = local9.method8401();
		}
		@Pc(33) int local33 = local9.method8401();
		@Pc(36) int[] local36 = new int[local33];
		for (@Pc(38) int local38 = 0; local38 < local33; local38++) {
			local36[local38] = local9.method8401();
		}
		while (true) {
			@Pc(58) int local58;
			@Pc(64) int local64;
			@Pc(67) int local67;
			@Pc(76) int local76;
			@Pc(148) int local148;
			while (local9.anInt10282 < local9.aByteArray106.length) {
				@Pc(62) int local62;
				@Pc(84) int local84;
				if (local9.method8401() == 0) {
					local58 = local9.method8401();
					local62 = local9.method8401();
					for (local64 = 0; local64 < 64; local64++) {
						for (local67 = 0; local67 < 64; local67++) {
							local76 = local58 * 64 + local64 - anInt2229;
							local84 = local62 * 64 + local67 - anInt2230;
							method2166(arg0, local9, local58, local62, local76, local84, local16, local36);
						}
					}
				} else {
					local58 = local9.method8401();
					local62 = local9.method8401();
					local64 = local9.method8401();
					local67 = local9.method8401();
					for (local76 = 0; local76 < 8; local76++) {
						for (local84 = 0; local84 < 8; local84++) {
							@Pc(136) int local136 = local58 * 64 + local64 * 8 + local76 - anInt2229;
							local148 = local62 * 64 + local67 * 8 + local84 - anInt2230;
							method2166(arg0, local9, local58, local62, local136, local148, local16, local36);
						}
					}
				}
			}
			aByteArray21 = new byte[anInt2228 * anInt2226];
			aShortArray24 = new short[anInt2228 * anInt2226];
			for (local58 = 0; local58 < 3; local58++) {
				@Pc(191) byte[] local191 = new byte[anInt2228 * anInt2226];
				for (local64 = 0; local64 < aClass375ArrayArrayArray2[local58].length; local64++) {
					for (local67 = 0; local67 < aClass375ArrayArrayArray2[local58][0].length; local67++) {
						@Pc(205) Class375 local205 = aClass375ArrayArrayArray2[local58][local64][local67];
						if (local205 != null) {
							for (@Pc(212) Class2_Sub10 local212 = (Class2_Sub10) local205.method8638(); local212 != null; local212 = (Class2_Sub10) local205.method8635()) {
								local191[local64 * 64 + local212.aByte118 + (local67 * 64 + local212.aByte117) * anInt2228] = (byte) local212.anInt9639;
							}
						}
					}
				}
				method2158(local191, aByteArray21, aShortArray24, arg1, arg2);
				for (local67 = 0; local67 < aClass375ArrayArrayArray2[local58].length; local67++) {
					for (local76 = 0; local76 < aClass375ArrayArrayArray2[local58][0].length; local76++) {
						@Pc(276) Class375 local276 = aClass375ArrayArrayArray2[local58][local67][local76];
						if (local276 != null) {
							for (@Pc(283) Class2_Sub10 local283 = (Class2_Sub10) local276.method8638(); local283 != null; local283 = (Class2_Sub10) local276.method8635()) {
								local148 = local67 * 64 + local283.aByte118 + (local76 * 64 + local283.aByte117) * anInt2228;
								local283.anInt9639 = (aByteArray21[local148] & 0xFF) << 16 | aShortArray24[local148] & 0xFFFF;
								if (local283.anInt9639 != 0) {
									local283.anInt9639 |= 0xFF000000;
								}
							}
						}
					}
				}
			}
			method2158(aByteArray20, aByteArray21, aShortArray24, arg1, arg2);
			aByteArray20 = null;
			method2177();
			return;
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
	public static void method2162(@OriginalArg(0) int arg0) {
		aClass3_Sub1_Sub16_2 = (Class3_Sub1_Sub16) aClass307_11.method7424((long) arg0);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!ha;IIII)V")
	private static void method2163(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = anInt2221 - anInt2224;
		@Pc(7) int local7 = anInt2223 - anInt2225;
		if (anInt2221 < anInt2228) {
			local3++;
		}
		if (anInt2223 < anInt2226) {
			local7++;
		}
		@Pc(28) int local28;
		@Pc(40) int local40;
		@Pc(44) int local44;
		@Pc(50) int local50;
		@Pc(57) int local57;
		@Pc(70) int local70;
		@Pc(80) int local80;
		@Pc(84) int local84;
		@Pc(93) int local93;
		@Pc(173) int local173;
		@Pc(175) int local175;
		@Pc(177) int local177;
		@Pc(179) int local179;
		for (@Pc(17) int local17 = 0; local17 < local3; local17++) {
			local28 = (arg1 * local17 >> 16) + anInt2220;
			local40 = (arg1 * (local17 + 1) >> 16) + anInt2220;
			local44 = local40 - local28;
			if (local44 > 0) {
				local50 = anInt2224 + local17;
				if (local50 >= 0 && local50 < anInt2228) {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt2227 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt2227 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (local84 > 0) {
							local93 = local57 + anInt2225;
							local173 = local50 + local93 * anInt2228;
							local175 = 0;
							local177 = 0;
							local179 = 0;
							if (local93 >= 0 && local93 < anInt2226) {
								local175 = (aByteArray21[local173] & 0xFF) << 16 | aShortArray24[local173] & 0xFFFF;
								if (local175 != 0) {
									local175 |= 0xFF000000;
								}
								local177 = aByteArray17[local173] & 0xFF;
								local179 = aShortArray23[local173] & 0xFFFF;
							}
							if (local175 == 0 && local177 == 0 && local179 == 0) {
								if (aClass3_Sub1_Sub16_2.anInt7067 != -1) {
									local175 = aClass3_Sub1_Sub16_2.anInt7067 | 0xFF000000;
								} else if ((local17 + anInt2224 & 0x4) == (local57 + anInt2223 & 0x4)) {
									local175 = anIntArray82[aClass258_2.anInt7836 + 1];
								} else {
									local175 = -11840664;
								}
								if (local175 == 0) {
									local175 = -16777216;
								}
								arg0.aa(local28, local70, local44, local84, local175, 0);
							} else if (local179 <= 0) {
								method2168(arg0, local28, local70, local44, local84, local175, local177, aByteArray18[local173], null, null, true);
							} else if (local179 == 65535) {
								@Pc(282) Class3_Sub36 local282 = (Class3_Sub36) aClass307_12.method7424((long) (local50 << 16 | local93));
								if (local282 != null) {
									method2168(arg0, local28, local70, local44, local84, local175, local177, aByteArray18[local173], local282.aShortArray124, local282.aByteArray84, true);
								}
							} else {
								aShortArray22[0] = (short) (local179 - 1);
								aByteArray16[0] = aByteArray19[local173];
								method2168(arg0, local28, local70, local44, local84, local175, local177, aByteArray18[local173], aShortArray22, aByteArray16, true);
							}
						}
					}
				} else {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt2227 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt2227 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (aClass3_Sub1_Sub16_2.anInt7067 != -1) {
							local93 = aClass3_Sub1_Sub16_2.anInt7067 | 0xFF000000;
						} else if ((local17 + anInt2224 & 0x4) == (local57 + anInt2223 & 0x4)) {
							local93 = anIntArray82[aClass258_2.anInt7836 + 1];
						} else {
							local93 = -11840664;
						}
						if (local93 == 0) {
							local93 = -16777216;
						}
						arg0.aa(local28, local70, local44, local84, local93, 0);
					}
				}
			}
		}
		for (local28 = -16; local28 < local3 + 16; local28++) {
			local40 = (arg1 * local28 >> 16) + anInt2220;
			local44 = (arg1 * (local28 + 1) >> 16) + anInt2220;
			local50 = local44 - local40;
			if (local50 > 0) {
				local57 = local28 + anInt2224;
				if (local57 >= 0 && local57 < anInt2228) {
					for (local70 = -16; local70 < local7 + 16; local70++) {
						local80 = anInt2227 - (arg2 * (local70 + 1) >> 16);
						local84 = anInt2227 - (arg2 * local70 >> 16);
						local93 = local84 - local80;
						if (local93 > 0) {
							local173 = local70 + anInt2225;
							if (local173 >= 0 && local173 < anInt2226) {
								local175 = aShortArray23[local57 + local173 * anInt2228] & 0xFFFF;
								if (local175 <= 0) {
									method2155(arg0, local40, local80, local50, local93, null, null);
								} else if (local175 == 65535) {
									@Pc(459) Class3_Sub36 local459 = (Class3_Sub36) aClass307_12.method7424((long) (local57 << 16 | local173));
									if (local459 != null) {
										method2155(arg0, local40, local80, local50, local93, local459.aShortArray124, local459.aByteArray84);
									}
								} else {
									aShortArray22[0] = (short) (local175 - 1);
									aByteArray16[0] = aByteArray19[local57 + local173 * anInt2228];
									method2155(arg0, local40, local80, local50, local93, aShortArray22, aByteArray16);
								}
							}
						}
					}
				}
			}
		}
		local40 = anInt2224 >> 6;
		local44 = anInt2225 >> 6;
		if (local40 < 0) {
			local40 = 0;
		}
		if (local44 < 0) {
			local44 = 0;
		}
		local50 = anInt2221 >> 6;
		local57 = anInt2223 >> 6;
		if (local50 >= aClass375ArrayArrayArray2[0].length) {
			local50 = aClass375ArrayArrayArray2[0].length - 1;
		}
		if (local57 >= aClass375ArrayArrayArray2[0][0].length) {
			local57 = aClass375ArrayArrayArray2[0][0].length - 1;
		}
		for (local70 = 0; local70 < 3; local70++) {
			@Pc(641) int local641;
			@Pc(653) int local653;
			@Pc(665) int local665;
			@Pc(675) int local675;
			@Pc(631) int local631;
			for (local80 = local40; local80 <= local50; local80++) {
				for (local84 = local44; local84 <= local57; local84++) {
					@Pc(589) Class375 local589 = aClass375ArrayArrayArray2[local70][local80][local84];
					if (local589 != null) {
						local173 = (local80 + (anInt2229 >> 6)) * 64;
						local175 = (local84 + (anInt2230 >> 6)) * 64;
						for (@Pc(612) Class2_Sub10 local612 = (Class2_Sub10) local589.method8638(); local612 != null; local612 = (Class2_Sub10) local589.method8635()) {
							local179 = local173 + local612.aByte118 - anInt2229 - anInt2224;
							local631 = local175 + local612.aByte117 - anInt2230 - anInt2225;
							local641 = (arg1 * local179 >> 16) + anInt2220;
							local653 = (arg1 * (local179 + 1) >> 16) + anInt2220;
							local665 = anInt2227 - (arg2 * (local631 + 1) >> 16);
							local675 = anInt2227 - (arg2 * local631 >> 16);
							method2168(arg0, local641, local665, local653 - local641, local675 - local665, local612.anInt9639, local612.aByte120 & 0xFF, local612.aByte119, local612.aShortArray135, local612.aByteArray95, false);
						}
					}
				}
			}
			for (local84 = local40; local84 <= local50; local84++) {
				for (local93 = local44; local93 <= local57; local93++) {
					@Pc(727) Class375 local727 = aClass375ArrayArrayArray2[local70][local84][local93];
					if (local727 != null) {
						local175 = (local84 + (anInt2229 >> 6)) * 64;
						local177 = (local93 + (anInt2230 >> 6)) * 64;
						for (@Pc(750) Class2_Sub10 local750 = (Class2_Sub10) local727.method8638(); local750 != null; local750 = (Class2_Sub10) local727.method8635()) {
							local631 = local175 + local750.aByte118 - anInt2229 - anInt2224;
							local641 = local177 + local750.aByte117 - anInt2230 - anInt2225;
							local653 = (arg1 * local631 >> 16) + anInt2220;
							local665 = (arg1 * (local631 + 1) >> 16) + anInt2220;
							local675 = anInt2227 - (arg2 * (local641 + 1) >> 16);
							@Pc(813) int local813 = anInt2227 - (arg2 * local641 >> 16);
							method2155(arg0, local653, local675, local665 - local653, local813 - local675, local750.aShortArray135, local750.aByteArray95);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!kha;Lclient!pe;Lclient!sl;Lclient!vc;Lclient!go;Lclient!ln;Lclient!dk;)V")
	public static void method2164(@OriginalArg(0) Class181 arg0, @OriginalArg(1) Class258 arg1, @OriginalArg(2) Class310 arg2, @OriginalArg(3) Class349 arg3, @OriginalArg(4) Class115 arg4, @OriginalArg(5) Class204 arg5, @OriginalArg(6) Interface6 arg6) {
		aClass181_16 = arg0;
		aClass258_2 = arg1;
		aClass310_2 = arg2;
		aClass349_2 = arg3;
		aClass115_3 = arg4;
		aClass204_2 = arg5;
		anInterface6_2 = arg6;
		aClass307_11.method7427();
		@Pc(21) int local21 = aClass181_16.method5033("details");
		@Pc(26) int[] local26 = aClass181_16.method5030(local21);
		if (local26 != null) {
			for (@Pc(30) int local30 = 0; local30 < local26.length; local30++) {
				@Pc(39) Class3_Sub1_Sub16 local39 = Static74.method1851(local26[local30], aClass181_16, local21);
				aClass307_11.method7425((long) local39.anInt7071, local39);
			}
		}
		Static146.method3249(true, false);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!ha;Lclient!gba;IIII)V")
	private static void method2165(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class3_Sub22 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1.anInt4119 = anInt2220 + (arg2 * (arg1.anInt4124 - anInt2224) >> 16);
		arg1.anInt4116 = anInt2227 - (arg3 * (arg1.anInt4117 - anInt2225) >> 16);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!ha;Lclient!tn;IIII[I[I)V")
	private static void method2166(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class3_Sub15 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		@Pc(3) int local3 = arg1.method8401();
		if ((local3 & 0x1) == 0) {
			@Pc(15) boolean local15 = (local3 & 0x2) == 0;
			@Pc(21) int local21 = local3 >> 2 & 0x3F;
			if (local21 != 62) {
				if (local21 == 63) {
					local21 = arg1.method8401();
				} else if (local15) {
					local21 = arg6[local21];
				} else {
					local21 = arg7[local21];
				}
				if (local15) {
					aByteArray20[arg4 + arg5 * anInt2228] = (byte) local21;
					aByteArray17[arg4 + arg5 * anInt2228] = 0;
				} else {
					aByteArray17[arg4 + arg5 * anInt2228] = (byte) local21;
					aByteArray18[arg4 + arg5 * anInt2228] = 0;
					aByteArray20[arg4 + arg5 * anInt2228] = arg1.method8440();
				}
			}
			return;
		}
		@Pc(100) int local100 = (local3 >> 1 & 0x3) + 1;
		@Pc(108) boolean local108 = (local3 & 0x8) != 0;
		@Pc(116) boolean local116 = (local3 & 0x10) != 0;
		for (@Pc(118) int local118 = 0; local118 < local100; local118++) {
			@Pc(123) int local123 = arg1.method8401();
			@Pc(125) int local125 = 0;
			@Pc(127) int local127 = 0;
			if (local108) {
				local125 = arg1.method8401();
				local127 = arg1.method8401();
			}
			@Pc(139) int local139 = 0;
			if (local116) {
				local139 = arg1.method8401();
			}
			@Pc(215) short[] local215;
			@Pc(218) byte[] local218;
			@Pc(220) int local220;
			if (local118 == 0) {
				aByteArray20[arg4 + arg5 * anInt2228] = (byte) local123;
				aByteArray17[arg4 + arg5 * anInt2228] = (byte) local125;
				aByteArray18[arg4 + arg5 * anInt2228] = (byte) local127;
				if (local139 == 1) {
					aShortArray23[arg4 + arg5 * anInt2228] = (short) (arg1.method8414() + 1);
					aByteArray19[arg4 + arg5 * anInt2228] = arg1.method8440();
				} else if (local139 > 1) {
					aShortArray23[arg4 + arg5 * anInt2228] = -1;
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method8414();
						local218[local220] = arg1.method8440();
					}
					aClass307_12.method7425((long) (arg4 << 16 | arg5), new Class3_Sub36(local215, local218));
				}
			} else {
				local215 = null;
				local218 = null;
				if (local139 > 0) {
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method8414();
						local218[local220] = arg1.method8440();
					}
				}
				if (aClass375ArrayArrayArray2[local118 - 1][arg2 - (anInt2229 >> 6)][arg3 - (anInt2230 >> 6)] == null) {
					aClass375ArrayArrayArray2[local118 - 1][arg2 - (anInt2229 >> 6)][arg3 - (anInt2230 >> 6)] = new Class375();
				}
				@Pc(338) Class2_Sub10 local338 = new Class2_Sub10(arg4 & 0x3F, arg5 & 0x3F, local123, local125, local127, local215, local218);
				aClass375ArrayArrayArray2[local118 - 1][arg2 - (anInt2229 >> 6)][arg3 - (anInt2230 >> 6)].method8639(local338);
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)Lclient!ng;")
	public static Class3_Sub1_Sub16 method2167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class3_Sub1_Sub16 local4 = (Class3_Sub1_Sub16) aClass307_11.method7421(); local4 != null; local4 = (Class3_Sub1_Sub16) aClass307_11.method7428()) {
			if (local4.aBoolean612 && local4.method5922(arg1, arg0)) {
				return local4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!ha;IIIIIII[S[BZ)V")
	private static void method2168(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) boolean arg10) {
		@Pc(20) int local20;
		@Pc(32) int local32;
		if (arg10 || arg5 != 0 || arg6 > 0) {
			if (arg6 == 0) {
				arg0.aa(arg1, arg2, arg3, arg4, arg5, 0);
			} else {
				local20 = arg7 & 0x3F;
				if (local20 == 0 || arg3 <= 1 || arg4 <= 1) {
					local32 = anIntArray82[arg6];
					if (arg10 || local32 != 0) {
						arg0.aa(arg1, arg2, arg3, arg4, local32, 0);
					}
				} else {
					local32 = arg10 ? 0 : 1;
					Static542.method7685(anIntArray82[arg6], arg7 >> 6 & 0x3, aByteArrayArrayArray2, local32, anInt2219, arg0, arg4, local20, arg1, arg5, arg3, arg2);
				}
			}
		}
		if (arg8 == null) {
			return;
		}
		if (arg3 == 1) {
			local20 = arg1;
		} else {
			local20 = arg1 + arg3 - 1;
		}
		if (arg4 == 1) {
			local32 = arg2;
		} else {
			local32 = arg2 + arg4 - 1;
		}
		for (@Pc(100) int local100 = 0; local100 < arg8.length; local100++) {
			@Pc(107) int local107 = arg9[local100] & 0x3F;
			if (local107 == 0 || local107 == 2 || local107 == 3 || local107 == 9) {
				@Pc(127) Class272 local127 = aClass349_2.method8123(arg8[local100] & 0xFFFF);
				if (local127.anInt8268 == -1) {
					@Pc(133) int local133 = -3355444;
					if (local127.anInt8270 == 1) {
						local133 = -3407872;
					}
					@Pc(147) int local147 = arg9[local100] >> 6 & 0x3;
					if (local107 == 0) {
						if (local147 == 0) {
							arg0.P(arg1, arg2, arg4, local133, 0);
						} else if (local147 == 1) {
							arg0.U(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 2) {
							arg0.P(local20, arg2, arg4, local133, 0);
						} else {
							arg0.U(arg1, local32, arg3, local133, 0);
						}
					} else if (local107 == 2) {
						if (local147 == 0) {
							arg0.P(arg1, arg2, arg4, -1, 0);
							arg0.U(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 1) {
							arg0.P(local20, arg2, arg4, -1, 0);
							arg0.U(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 2) {
							arg0.P(local20, arg2, arg4, -1, 0);
							arg0.U(arg1, local32, arg3, local133, 0);
						} else {
							arg0.P(arg1, arg2, arg4, -1, 0);
							arg0.U(arg1, local32, arg3, local133, 0);
						}
					} else if (local107 == 3) {
						if (local147 == 0) {
							arg0.U(arg1, arg2, 1, local133, 0);
						} else if (local147 == 1) {
							arg0.U(local20, arg2, 1, local133, 0);
						} else if (local147 == 2) {
							arg0.U(local20, local32, 1, local133, 0);
						} else {
							arg0.U(arg1, local32, 1, local133, 0);
						}
					} else if (local107 == 9) {
						@Pc(313) int local313;
						if (local147 == 0 || local147 == 2) {
							for (local313 = 0; local313 < arg4; local313++) {
								arg0.U(arg1 + local313, local32 - local313, 1, local133, 0);
							}
						} else {
							for (local313 = 0; local313 < arg4; local313++) {
								arg0.U(arg1 + local313, arg2 + local313, 1, local133, 0);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(Lclient!ha;IIII)Lclient!qia;")
	private static Class276 method2169(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(4) Class3_Sub22 local4 = (Class3_Sub22) aClass276_14.method6907(); local4 != null; local4 = (Class3_Sub22) aClass276_14.method6912()) {
			method2165(arg0, local4, arg1, arg2);
		}
		return aClass276_14;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!ha;)Lclient!qia;")
	public static Class276 method2170(@OriginalArg(0) Class33 arg0) {
		@Pc(3) int local3 = anInt2221 - anInt2224;
		@Pc(7) int local7 = anInt2223 - anInt2225;
		@Pc(15) int local15 = (anInt2231 - anInt2220 << 16) / local3;
		@Pc(23) int local23 = (anInt2227 - anInt2222 << 16) / local7;
		return method2169(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!d;II)V")
	public static void method2171(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < aClass258_2.anInt7834; local1++) {
			anIntArray82[local1 + 1] = method2160(arg0, local1, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(Lclient!ha;)V")
	public static void method2172(@OriginalArg(0) Class33 arg0) {
		@Pc(3) int local3 = anInt2221 - anInt2224;
		@Pc(7) int local7 = anInt2223 - anInt2225;
		@Pc(15) int local15 = (anInt2231 - anInt2220 << 16) / local3;
		@Pc(23) int local23 = (anInt2227 - anInt2222 << 16) / local7;
		method2163(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "()V")
	public static void method2173() {
		aByteArray20 = new byte[anInt2228 * anInt2226];
		aByteArray17 = new byte[anInt2228 * anInt2226];
		aByteArray18 = new byte[anInt2228 * anInt2226];
		aShortArray23 = new short[anInt2228 * anInt2226];
		aByteArray19 = new byte[anInt2228 * anInt2226];
		aClass307_12 = new Class307(1024);
		aClass375ArrayArrayArray2 = new Class375[3][anInt2228 >> 6][anInt2226 >> 6];
		anIntArray82 = new int[aClass258_2.anInt7834 + 1];
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!ha;Lclient!gba;Lclient!qca;)V")
	public static void method2174(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class3_Sub22 arg1, @OriginalArg(2) Class269 arg2) {
		if (arg2.anIntArray511 == null) {
			return;
		}
		@Pc(7) int[] local7 = new int[arg2.anIntArray511.length];
		@Pc(20) int local20;
		@Pc(32) int local32;
		for (@Pc(9) int local9 = 0; local9 < local7.length / 2; local9++) {
			local20 = arg2.anIntArray511[local9 * 2] + arg1.anInt4124;
			local32 = arg2.anIntArray511[local9 * 2 + 1] + arg1.anInt4117;
			local7[local9 * 2] = anInt2220 + (anInt2231 - anInt2220) * (local20 - anInt2224) / (anInt2221 - anInt2224);
			local7[local9 * 2 + 1] = anInt2227 - (anInt2227 - anInt2222) * (local32 - anInt2225) / (anInt2223 - anInt2225);
		}
		Static616.method8376(arg0, local7, arg2.anInt8156);
		if (arg2.anInt8150 > 0) {
			@Pc(102) int local102;
			@Pc(110) int local110;
			@Pc(120) int local120;
			@Pc(125) int local125;
			@Pc(127) int local127;
			for (local20 = 0; local20 < local7.length / 2 - 1; local20++) {
				local32 = local7[local20 * 2];
				local102 = local7[local20 * 2 + 1];
				local110 = local7[(local20 + 1) * 2];
				local120 = local7[(local20 + 1) * 2 + 1];
				if (local110 < local32) {
					local125 = local32;
					local127 = local102;
					local32 = local110;
					local102 = local120;
					local110 = local125;
					local120 = local127;
				} else if (local110 == local32 && local120 < local102) {
					local125 = local102;
					local102 = local120;
					local120 = local125;
				}
				arg0.method6171(local32, local102, local110, local120, arg2.anIntArray512[arg2.aByteArray87[local20] & 0xFF], arg2.anInt8150, arg2.anInt8152, arg2.anInt8149);
			}
			local32 = local7[local7.length - 2];
			local102 = local7[local7.length - 1];
			local110 = local7[0];
			local120 = local7[1];
			if (local110 < local32) {
				local125 = local32;
				local127 = local102;
				local32 = local110;
				local102 = local120;
				local110 = local125;
				local120 = local127;
			} else if (local110 == local32 && local120 < local102) {
				local125 = local102;
				local102 = local120;
				local120 = local125;
			}
			arg0.method6171(local32, local102, local110, local120, arg2.anIntArray512[arg2.aByteArray87[arg2.aByteArray87.length - 1] & 0xFF], arg2.anInt8150, arg2.anInt8152, arg2.anInt8149);
			return;
		}
		for (local20 = 0; local20 < local7.length / 2 - 1; local20++) {
			arg0.method6236(local7[(local20 + 1) * 2 + 1], local7[(local20 + 1) * 2], local7[local20 * 2 + 1], arg2.anIntArray512[arg2.aByteArray87[local20] & 0xFF], local7[local20 * 2]);
		}
		arg0.method6236(local7[1], local7[0], local7[local7.length - 1], arg2.anIntArray512[arg2.aByteArray87[arg2.aByteArray87.length - 1] & 0xFF], local7[local7.length - 2]);
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "()V")
	public static void method2175() {
		aByteArray20 = null;
		aByteArray21 = null;
		aShortArray24 = null;
		aByteArray17 = null;
		aByteArray18 = null;
		aShortArray23 = null;
		aByteArray19 = null;
		aClass307_12 = null;
		aClass375ArrayArrayArray2 = null;
		anIntArray82 = null;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)Lclient!bj;")
	public static Class30 method2176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class30 local3 = new Class30();
		for (@Pc(8) Class3_Sub1_Sub16 local8 = (Class3_Sub1_Sub16) aClass307_11.method7421(); local8 != null; local8 = (Class3_Sub1_Sub16) aClass307_11.method7428()) {
			if (local8.aBoolean612 && local8.method5922(arg1, arg0)) {
				local3.method779(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "()V")
	private static void method2177() {
		@Pc(4) int local4;
		@Pc(15) int local15;
		@Pc(49) int local49;
		for (@Pc(1) int local1 = 0; local1 < anInt2228; local1++) {
			for (local4 = 0; local4 < anInt2226; local4++) {
				local15 = aShortArray23[local1 + local4 * anInt2228] & 0xFFFF;
				if (local15 != 0) {
					@Pc(35) int local35;
					if (local15 == 65535) {
						@Pc(31) Class3_Sub36 local31 = (Class3_Sub36) aClass307_12.method7424((long) (local1 << 16 | local4));
						if (local31 != null) {
							for (local35 = 0; local35 < local31.aShortArray124.length; local35++) {
								@Pc(46) Class272 local46 = aClass349_2.method8123(local31.aShortArray124[local35] & 0xFFFF);
								local49 = local46.anInt8291;
								if (local46.anIntArray523 != null) {
									local46 = local46.method6856(anInterface6_2);
									if (local46 != null) {
										local49 = local46.anInt8291;
									}
								}
								if (local49 != -1) {
									@Pc(70) Class3_Sub22 local70 = new Class3_Sub22(local49);
									local70.anInt4124 = local1;
									local70.anInt4117 = local4;
									aClass276_14.method6906(local70);
								}
							}
						}
					} else {
						@Pc(94) Class272 local94 = aClass349_2.method8123(local15 - 1);
						local35 = local94.anInt8291;
						if (local94.anIntArray523 != null) {
							local94 = local94.method6856(anInterface6_2);
							if (local94 != null) {
								local35 = local94.anInt8291;
							}
						}
						if (local35 != -1) {
							@Pc(118) Class3_Sub22 local118 = new Class3_Sub22(local35);
							local118.anInt4124 = local1;
							local118.anInt4117 = local4;
							aClass276_14.method6906(local118);
						}
					}
				}
			}
		}
		for (local4 = 0; local4 < 3; local4++) {
			for (local15 = 0; local15 < aClass375ArrayArrayArray2[0].length; local15++) {
				for (@Pc(144) int local144 = 0; local144 < aClass375ArrayArrayArray2[0][0].length; local144++) {
					@Pc(153) Class375 local153 = aClass375ArrayArrayArray2[local4][local15][local144];
					if (local153 != null) {
						for (@Pc(160) Class2_Sub10 local160 = (Class2_Sub10) local153.method8638(); local160 != null; local160 = (Class2_Sub10) local153.method8635()) {
							if (local160.aShortArray135 != null) {
								for (local49 = 0; local49 < local160.aShortArray135.length; local49++) {
									@Pc(177) Class272 local177 = aClass349_2.method8123(local160.aShortArray135[local49] & 0xFFFF);
									@Pc(180) int local180 = local177.anInt8291;
									if (local177.anIntArray523 != null) {
										local177 = local177.method6856(anInterface6_2);
										if (local177 != null) {
											local180 = local177.anInt8291;
										}
									}
									if (local180 != -1) {
										@Pc(201) Class3_Sub22 local201 = new Class3_Sub22(local180);
										local201.anInt4124 = (local15 + (anInt2229 >> 6)) * 64 + local160.aByte118 - anInt2229;
										local201.anInt4117 = (local144 + (anInt2230 >> 6)) * 64 + local160.aByte117 - anInt2230;
										aClass276_14.method6906(local201);
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
