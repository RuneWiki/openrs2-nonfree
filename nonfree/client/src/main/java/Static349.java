import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "Lclient!um;")
	private static Class318 aClass318_5;

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "Lclient!vb;")
	private static Class327 aClass327_4;

	@OriginalMember(owner = "client!oaa", name = "c", descriptor = "Lclient!fe;")
	public static Class100 aClass100_3;

	@OriginalMember(owner = "client!oaa", name = "e", descriptor = "Lclient!dd;")
	public static Interface5 anInterface5_2;

	@OriginalMember(owner = "client!oaa", name = "f", descriptor = "Lclient!pg;")
	public static Class245 aClass245_4;

	@OriginalMember(owner = "client!oaa", name = "g", descriptor = "Lclient!he;")
	public static Class6_Sub1_Sub9 aClass6_Sub1_Sub9_3;

	@OriginalMember(owner = "client!oaa", name = "h", descriptor = "Lclient!pq;")
	public static Class251 aClass251_123;

	@OriginalMember(owner = "client!oaa", name = "i", descriptor = "Lclient!rj;")
	public static Class276 aClass276_3;

	@OriginalMember(owner = "client!oaa", name = "j", descriptor = "F")
	public static float aFloat169;

	@OriginalMember(owner = "client!oaa", name = "k", descriptor = "F")
	public static float aFloat170;

	@OriginalMember(owner = "client!oaa", name = "p", descriptor = "Lclient!ps;")
	public static Class252 aClass252_5;

	@OriginalMember(owner = "client!oaa", name = "q", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!oaa", name = "s", descriptor = "I")
	public static int anInt7455;

	@OriginalMember(owner = "client!oaa", name = "t", descriptor = "I")
	public static int anInt7456;

	@OriginalMember(owner = "client!oaa", name = "u", descriptor = "I")
	public static int anInt7457;

	@OriginalMember(owner = "client!oaa", name = "v", descriptor = "I")
	public static int anInt7458;

	@OriginalMember(owner = "client!oaa", name = "w", descriptor = "I")
	public static int anInt7459;

	@OriginalMember(owner = "client!oaa", name = "x", descriptor = "I")
	public static int anInt7460;

	@OriginalMember(owner = "client!oaa", name = "y", descriptor = "I")
	public static int anInt7461;

	@OriginalMember(owner = "client!oaa", name = "z", descriptor = "I")
	public static int anInt7462;

	@OriginalMember(owner = "client!oaa", name = "A", descriptor = "I")
	public static int anInt7463;

	@OriginalMember(owner = "client!oaa", name = "B", descriptor = "[B")
	private static byte[] aByteArray91;

	@OriginalMember(owner = "client!oaa", name = "C", descriptor = "[B")
	private static byte[] aByteArray92;

	@OriginalMember(owner = "client!oaa", name = "D", descriptor = "I")
	public static int anInt7464;

	@OriginalMember(owner = "client!oaa", name = "E", descriptor = "[S")
	private static short[] aShortArray119;

	@OriginalMember(owner = "client!oaa", name = "F", descriptor = "[B")
	private static byte[] aByteArray93;

	@OriginalMember(owner = "client!oaa", name = "G", descriptor = "[B")
	private static byte[] aByteArray94;

	@OriginalMember(owner = "client!oaa", name = "H", descriptor = "[S")
	private static short[] aShortArray120;

	@OriginalMember(owner = "client!oaa", name = "I", descriptor = "I")
	public static int anInt7465;

	@OriginalMember(owner = "client!oaa", name = "J", descriptor = "I")
	public static int anInt7466;

	@OriginalMember(owner = "client!oaa", name = "K", descriptor = "Lclient!nj;")
	private static Class212 aClass212_32;

	@OriginalMember(owner = "client!oaa", name = "L", descriptor = "I")
	public static int anInt7467;

	@OriginalMember(owner = "client!oaa", name = "M", descriptor = "[I")
	private static int[] anIntArray582;

	@OriginalMember(owner = "client!oaa", name = "N", descriptor = "[B")
	private static byte[] aByteArray95;

	@OriginalMember(owner = "client!oaa", name = "O", descriptor = "[[[Lclient!pn;")
	private static Class249[][][] aClass249ArrayArrayArray2;

	@OriginalMember(owner = "client!oaa", name = "d", descriptor = "Lclient!nj;")
	private static final Class212 aClass212_31 = new Class212(16);

	@OriginalMember(owner = "client!oaa", name = "l", descriptor = "[B")
	private static final byte[] aByteArray90 = new byte[1];

	@OriginalMember(owner = "client!oaa", name = "m", descriptor = "[S")
	private static final short[] aShortArray118 = new short[1];

	@OriginalMember(owner = "client!oaa", name = "n", descriptor = "I")
	public static int anInt7453 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!oaa", name = "o", descriptor = "I")
	public static int anInt7454 = (int) (Math.random() * 11.0D) - 5;

	@OriginalMember(owner = "client!oaa", name = "r", descriptor = "Lclient!rh;")
	public static final Class275 aClass275_155 = new Class275();

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lclient!oa;IIII[S[B)V")
	private static void method6174(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		if (arg5 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < arg5.length; local4++) {
			@Pc(14) Class313 local14 = aClass100_3.method2008(arg5[local4] & 0xFFFF);
			@Pc(17) int local17 = local14.anInt8446;
			if (local17 != -1) {
				@Pc(25) Class111 local25 = aClass245_4.method5768(local17);
				@Pc(49) Class4 local49 = local25.method2216(local14.aBoolean593 ? local14.aBoolean579 : false, arg0, local14.aBoolean584 ? arg6[local4] >> 6 & 0x3 : 0);
				if (local49 != null) {
					@Pc(58) int local58 = arg3 * local49.AA() >> 2;
					@Pc(65) int local65 = arg4 * local49.a() >> 2;
					if (local25.aBoolean181) {
						@Pc(71) int local71 = local14.anInt8478;
						@Pc(74) int local74 = local14.anInt8463;
						if ((arg6[local4] >> 6 & 0x1) == 1) {
							@Pc(85) int local85 = local71;
							local71 = local74;
							local74 = local85;
						}
						local58 = local71 * arg3;
						local65 = local74 * arg4;
					}
					if (local58 != 0 && local65 != 0) {
						if (local25.anInt2680 == 0) {
							local49.method6509(arg1, arg2 + arg4 - local65, local58, local65);
						} else {
							local49.KA(arg1, arg2 + arg4 - local65, local58, local65, 0, local25.anInt2680 | 0xFF000000, 1);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(II)Lclient!he;")
	public static Class6_Sub1_Sub9 method6175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class6_Sub1_Sub9 local4 = (Class6_Sub1_Sub9) aClass212_31.method5099(); local4 != null; local4 = (Class6_Sub1_Sub9) aClass212_31.method5103()) {
			if (local4.aBoolean217 && local4.method2746(arg1, arg0)) {
				return local4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "()V")
	public static void method6176() {
		aByteArray93 = null;
		aByteArray91 = null;
		aShortArray120 = null;
		aByteArray92 = null;
		aByteArray95 = null;
		aShortArray119 = null;
		aByteArray94 = null;
		aClass212_32 = null;
		aClass249ArrayArrayArray2 = null;
		anIntArray582 = null;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lclient!pq;Lclient!vb;Lclient!um;Lclient!fe;Lclient!rj;Lclient!pg;Lclient!dd;)V")
	public static void method6177(@OriginalArg(0) Class251 arg0, @OriginalArg(1) Class327 arg1, @OriginalArg(2) Class318 arg2, @OriginalArg(3) Class100 arg3, @OriginalArg(4) Class276 arg4, @OriginalArg(5) Class245 arg5, @OriginalArg(6) Interface5 arg6) {
		aClass251_123 = arg0;
		aClass327_4 = arg1;
		aClass318_5 = arg2;
		aClass100_3 = arg3;
		aClass276_3 = arg4;
		aClass245_4 = arg5;
		anInterface5_2 = arg6;
		aClass212_31.method5110();
		@Pc(21) int local21 = aClass251_123.method5863("details");
		@Pc(26) int[] local26 = aClass251_123.method5857(local21);
		if (local26 != null) {
			for (@Pc(30) int local30 = 0; local30 < local26.length; local30++) {
				@Pc(39) Class6_Sub1_Sub9 local39 = Static167.method2615(aClass251_123, local26[local30], local21);
				aClass212_31.method5104((long) local39.anInt3232, local39);
			}
		}
		Static285.method4044(false, true);
	}

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "(II)Lclient!ifa;")
	public static Class144 method6178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class144 local3 = new Class144();
		for (@Pc(8) Class6_Sub1_Sub9 local8 = (Class6_Sub1_Sub9) aClass212_31.method5099(); local8 != null; local8 = (Class6_Sub1_Sub9) aClass212_31.method5103()) {
			if (local8.aBoolean217 && local8.method2746(arg1, arg0)) {
				local3.method3114(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lclient!oa;)Lclient!rh;")
	public static Class275 method6179(@OriginalArg(0) Class121 arg0) {
		@Pc(3) int local3 = anInt7462 - anInt7461;
		@Pc(7) int local7 = anInt7458 - anInt7467;
		@Pc(15) int local15 = (anInt7460 - anInt7459 << 16) / local3;
		@Pc(23) int local23 = (anInt7456 - anInt7464 << 16) / local7;
		return method6193(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lclient!oa;II)V")
	public static void method6180(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class6_Sub14 local9 = new Class6_Sub14(aClass251_123.method5836(aClass6_Sub1_Sub9_3.aString47, "area"));
		@Pc(13) int local13 = local9.method6041();
		@Pc(16) int[] local16 = new int[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			local16[local18] = local9.method6041();
		}
		@Pc(33) int local33 = local9.method6041();
		@Pc(36) int[] local36 = new int[local33];
		for (@Pc(38) int local38 = 0; local38 < local33; local38++) {
			local36[local38] = local9.method6041();
		}
		while (true) {
			@Pc(58) int local58;
			@Pc(64) int local64;
			@Pc(67) int local67;
			@Pc(76) int local76;
			@Pc(148) int local148;
			while (local9.anInt7244 < local9.aByteArray88.length) {
				@Pc(62) int local62;
				@Pc(84) int local84;
				if (local9.method6041() == 0) {
					local58 = local9.method6041();
					local62 = local9.method6041();
					for (local64 = 0; local64 < 64; local64++) {
						for (local67 = 0; local67 < 64; local67++) {
							local76 = local58 * 64 + local64 - anInt7457;
							local84 = local62 * 64 + local67 - anInt7465;
							method6189(arg0, local9, local58, local62, local76, local84, local16, local36);
						}
					}
				} else {
					local58 = local9.method6041();
					local62 = local9.method6041();
					local64 = local9.method6041();
					local67 = local9.method6041();
					for (local76 = 0; local76 < 8; local76++) {
						for (local84 = 0; local84 < 8; local84++) {
							@Pc(136) int local136 = local58 * 64 + local64 * 8 + local76 - anInt7457;
							local148 = local62 * 64 + local67 * 8 + local84 - anInt7465;
							method6189(arg0, local9, local58, local62, local136, local148, local16, local36);
						}
					}
				}
			}
			aByteArray91 = new byte[anInt7466 * anInt7463];
			aShortArray120 = new short[anInt7466 * anInt7463];
			for (local58 = 0; local58 < 3; local58++) {
				@Pc(191) byte[] local191 = new byte[anInt7466 * anInt7463];
				for (local64 = 0; local64 < aClass249ArrayArrayArray2[local58].length; local64++) {
					for (local67 = 0; local67 < aClass249ArrayArrayArray2[local58][0].length; local67++) {
						@Pc(205) Class249 local205 = aClass249ArrayArrayArray2[local58][local64][local67];
						if (local205 != null) {
							for (@Pc(212) Class102_Sub4 local212 = (Class102_Sub4) local205.method5817(); local212 != null; local212 = (Class102_Sub4) local205.method5815()) {
								local191[local64 * 64 + local212.aByte72 + (local67 * 64 + local212.aByte73) * anInt7466] = (byte) local212.anInt7396;
							}
						}
					}
				}
				method6183(local191, aByteArray91, aShortArray120, arg1, arg2);
				for (local67 = 0; local67 < aClass249ArrayArrayArray2[local58].length; local67++) {
					for (local76 = 0; local76 < aClass249ArrayArrayArray2[local58][0].length; local76++) {
						@Pc(276) Class249 local276 = aClass249ArrayArrayArray2[local58][local67][local76];
						if (local276 != null) {
							for (@Pc(283) Class102_Sub4 local283 = (Class102_Sub4) local276.method5817(); local283 != null; local283 = (Class102_Sub4) local276.method5815()) {
								local148 = local67 * 64 + local283.aByte72 + (local76 * 64 + local283.aByte73) * anInt7466;
								local283.anInt7396 = (aByteArray91[local148] & 0xFF) << 16 | aShortArray120[local148] & 0xFFFF;
								if (local283.anInt7396 != 0) {
									local283.anInt7396 |= 0xFF000000;
								}
							}
						}
					}
				}
			}
			method6183(aByteArray93, aByteArray91, aShortArray120, arg1, arg2);
			aByteArray93 = null;
			method6185();
			return;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIIIIIII)V")
	public static void method6181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt7461 = arg0 - anInt7457;
		anInt7458 = arg1 - anInt7465;
		anInt7462 = arg2 - anInt7457;
		anInt7467 = arg3 - anInt7465;
		anInt7459 = arg4;
		anInt7464 = arg5;
		anInt7460 = arg6;
		anInt7456 = arg7;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lclient!oa;Lclient!maa;IIII)V")
	private static void method6182(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class6_Sub34 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1.anInt4908 = anInt7459 + (arg2 * (arg1.anInt4906 - anInt7461) >> 16);
		arg1.anInt4911 = anInt7456 - (arg3 * (arg1.anInt4905 - anInt7467) >> 16);
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "([B[B[SII)V")
	private static void method6183(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int[] local2 = new int[anInt7463];
		@Pc(5) int[] local5 = new int[anInt7463];
		@Pc(8) int[] local8 = new int[anInt7463];
		@Pc(11) int[] local11 = new int[anInt7463];
		@Pc(14) int[] local14 = new int[anInt7463];
		for (@Pc(16) int local16 = -5; local16 < anInt7466; local16++) {
			@Pc(21) int local21 = local16 + 5;
			@Pc(25) int local25 = local16 - 5;
			@Pc(41) int local41;
			for (@Pc(27) int local27 = 0; local27 < anInt7463; local27++) {
				@Pc(50) Class79 local50;
				@Pc(86) int local86;
				if (local21 < anInt7466) {
					local41 = arg0[local21 + local27 * anInt7466] & 0xFF;
					if (local41 > 0) {
						local50 = aClass318_5.method7322(local41 - 1);
						local2[local27] += local50.anInt1882;
						local5[local27] += local50.anInt1887;
						local8[local27] += local50.anInt1884;
						local11[local27] += local50.anInt1885;
						local86 = local14[local27]++;
					}
				}
				if (local25 >= 0) {
					local41 = arg0[local25 + local27 * anInt7466] & 0xFF;
					if (local41 > 0) {
						local50 = aClass318_5.method7322(local41 - 1);
						local2[local27] -= local50.anInt1882;
						local5[local27] -= local50.anInt1887;
						local8[local27] -= local50.anInt1884;
						local11[local27] -= local50.anInt1885;
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
				for (@Pc(167) int local167 = -5; local167 < anInt7463; local167++) {
					@Pc(172) int local172 = local167 + 5;
					if (local172 < anInt7463) {
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
						if ((arg0[local16 + local167 * anInt7466] & 0xFF) == 0) {
							local261 = local16 + local167 * anInt7466;
							arg1[local261] = 0;
							arg2[local261] = 0;
						} else {
							local261 = local163 == 0 ? 0 : Static134.method2002(local41 * 256 / local163, local159 / local165, local161 / local165);
							@Pc(294) int local294 = (local261 & 0x7F) + arg4;
							if (local294 < 0) {
								local294 = 0;
							} else if (local294 > 127) {
								local294 = 127;
							}
							@Pc(316) int local316 = (local261 + arg3 & 0xFC00) + (local261 & 0x380) + local294;
							@Pc(322) int local322 = local16 + local167 * anInt7466;
							@Pc(333) int local333 = Static6.anIntArray272[Static516.method7312(Static155.method2281(local316)) & 0xFFFF];
							arg1[local322] = (byte) (local333 >> 16 & 0xFF);
							arg2[local322] = (short) (local333 & 0xFFFF);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lclient!oa;IIII)V")
	private static void method6184(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = anInt7462 - anInt7461;
		@Pc(7) int local7 = anInt7458 - anInt7467;
		if (anInt7462 < anInt7466) {
			local3++;
		}
		if (anInt7458 < anInt7463) {
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
			local28 = (arg1 * local17 >> 16) + anInt7459;
			local40 = (arg1 * (local17 + 1) >> 16) + anInt7459;
			local44 = local40 - local28;
			if (local44 > 0) {
				local50 = anInt7461 + local17;
				if (local50 >= 0 && local50 < anInt7466) {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt7456 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt7456 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (local84 > 0) {
							local93 = local57 + anInt7467;
							local173 = local50 + local93 * anInt7466;
							local175 = 0;
							local177 = 0;
							local179 = 0;
							if (local93 >= 0 && local93 < anInt7463) {
								local175 = (aByteArray91[local173] & 0xFF) << 16 | aShortArray120[local173] & 0xFFFF;
								if (local175 != 0) {
									local175 |= 0xFF000000;
								}
								local177 = aByteArray92[local173] & 0xFF;
								local179 = aShortArray119[local173] & 0xFFFF;
							}
							if (local175 == 0 && local177 == 0 && local179 == 0) {
								if (aClass6_Sub1_Sub9_3.anInt3221 != -1) {
									local175 = aClass6_Sub1_Sub9_3.anInt3221 | 0xFF000000;
								} else if ((local17 + anInt7461 & 0x4) == (local57 + anInt7458 & 0x4)) {
									local175 = anIntArray582[aClass327_4.anInt9056 + 1];
								} else {
									local175 = -11840664;
								}
								if (local175 == 0) {
									local175 = -16777216;
								}
								arg0.C(local28, local70, local44, local84, local175, 0);
							} else if (local179 <= 0) {
								method6192(arg0, local28, local70, local44, local84, local175, local177, aByteArray95[local173], null, null, true);
							} else if (local179 == 65535) {
								@Pc(282) Class6_Sub5 local282 = (Class6_Sub5) aClass212_32.method5106((long) (local50 << 16 | local93));
								if (local282 != null) {
									method6192(arg0, local28, local70, local44, local84, local175, local177, aByteArray95[local173], local282.aShortArray10, local282.aByteArray14, true);
								}
							} else {
								aShortArray118[0] = (short) (local179 - 1);
								aByteArray90[0] = aByteArray94[local173];
								method6192(arg0, local28, local70, local44, local84, local175, local177, aByteArray95[local173], aShortArray118, aByteArray90, true);
							}
						}
					}
				} else {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt7456 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt7456 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (aClass6_Sub1_Sub9_3.anInt3221 != -1) {
							local93 = aClass6_Sub1_Sub9_3.anInt3221 | 0xFF000000;
						} else if ((local17 + anInt7461 & 0x4) == (local57 + anInt7458 & 0x4)) {
							local93 = anIntArray582[aClass327_4.anInt9056 + 1];
						} else {
							local93 = -11840664;
						}
						if (local93 == 0) {
							local93 = -16777216;
						}
						arg0.C(local28, local70, local44, local84, local93, 0);
					}
				}
			}
		}
		for (local28 = -16; local28 < local3 + 16; local28++) {
			local40 = (arg1 * local28 >> 16) + anInt7459;
			local44 = (arg1 * (local28 + 1) >> 16) + anInt7459;
			local50 = local44 - local40;
			if (local50 > 0) {
				local57 = local28 + anInt7461;
				if (local57 >= 0 && local57 < anInt7466) {
					for (local70 = -16; local70 < local7 + 16; local70++) {
						local80 = anInt7456 - (arg2 * (local70 + 1) >> 16);
						local84 = anInt7456 - (arg2 * local70 >> 16);
						local93 = local84 - local80;
						if (local93 > 0) {
							local173 = local70 + anInt7467;
							if (local173 >= 0 && local173 < anInt7463) {
								local175 = aShortArray119[local57 + local173 * anInt7466] & 0xFFFF;
								if (local175 <= 0) {
									method6174(arg0, local40, local80, local50, local93, null, null);
								} else if (local175 == 65535) {
									@Pc(459) Class6_Sub5 local459 = (Class6_Sub5) aClass212_32.method5106((long) (local57 << 16 | local173));
									if (local459 != null) {
										method6174(arg0, local40, local80, local50, local93, local459.aShortArray10, local459.aByteArray14);
									}
								} else {
									aShortArray118[0] = (short) (local175 - 1);
									aByteArray90[0] = aByteArray94[local57 + local173 * anInt7466];
									method6174(arg0, local40, local80, local50, local93, aShortArray118, aByteArray90);
								}
							}
						}
					}
				}
			}
		}
		local40 = anInt7461 >> 6;
		local44 = anInt7467 >> 6;
		if (local40 < 0) {
			local40 = 0;
		}
		if (local44 < 0) {
			local44 = 0;
		}
		local50 = anInt7462 >> 6;
		local57 = anInt7458 >> 6;
		if (local50 >= aClass249ArrayArrayArray2[0].length) {
			local50 = aClass249ArrayArrayArray2[0].length - 1;
		}
		if (local57 >= aClass249ArrayArrayArray2[0][0].length) {
			local57 = aClass249ArrayArrayArray2[0][0].length - 1;
		}
		for (local70 = 0; local70 < 3; local70++) {
			@Pc(641) int local641;
			@Pc(653) int local653;
			@Pc(665) int local665;
			@Pc(675) int local675;
			@Pc(631) int local631;
			for (local80 = local40; local80 <= local50; local80++) {
				for (local84 = local44; local84 <= local57; local84++) {
					@Pc(589) Class249 local589 = aClass249ArrayArrayArray2[local70][local80][local84];
					if (local589 != null) {
						local173 = (local80 + (anInt7457 >> 6)) * 64;
						local175 = (local84 + (anInt7465 >> 6)) * 64;
						for (@Pc(612) Class102_Sub4 local612 = (Class102_Sub4) local589.method5817(); local612 != null; local612 = (Class102_Sub4) local589.method5815()) {
							local179 = local173 + local612.aByte72 - anInt7457 - anInt7461;
							local631 = local175 + local612.aByte73 - anInt7465 - anInt7467;
							local641 = (arg1 * local179 >> 16) + anInt7459;
							local653 = (arg1 * (local179 + 1) >> 16) + anInt7459;
							local665 = anInt7456 - (arg2 * (local631 + 1) >> 16);
							local675 = anInt7456 - (arg2 * local631 >> 16);
							method6192(arg0, local641, local665, local653 - local641, local675 - local665, local612.anInt7396, local612.aByte74 & 0xFF, local612.aByte75, local612.aShortArray116, local612.aByteArray89, false);
						}
					}
				}
			}
			for (local84 = local40; local84 <= local50; local84++) {
				for (local93 = local44; local93 <= local57; local93++) {
					@Pc(727) Class249 local727 = aClass249ArrayArrayArray2[local70][local84][local93];
					if (local727 != null) {
						local175 = (local84 + (anInt7457 >> 6)) * 64;
						local177 = (local93 + (anInt7465 >> 6)) * 64;
						for (@Pc(750) Class102_Sub4 local750 = (Class102_Sub4) local727.method5817(); local750 != null; local750 = (Class102_Sub4) local727.method5815()) {
							local631 = local175 + local750.aByte72 - anInt7457 - anInt7461;
							local641 = local177 + local750.aByte73 - anInt7465 - anInt7467;
							local653 = (arg1 * local631 >> 16) + anInt7459;
							local665 = (arg1 * (local631 + 1) >> 16) + anInt7459;
							local675 = anInt7456 - (arg2 * (local641 + 1) >> 16);
							@Pc(813) int local813 = anInt7456 - (arg2 * local641 >> 16);
							method6174(arg0, local653, local675, local665 - local653, local813 - local675, local750.aShortArray116, local750.aByteArray89);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "()V")
	private static void method6185() {
		@Pc(4) int local4;
		@Pc(15) int local15;
		@Pc(49) int local49;
		for (@Pc(1) int local1 = 0; local1 < anInt7466; local1++) {
			for (local4 = 0; local4 < anInt7463; local4++) {
				local15 = aShortArray119[local1 + local4 * anInt7466] & 0xFFFF;
				if (local15 != 0) {
					@Pc(35) int local35;
					if (local15 == 65535) {
						@Pc(31) Class6_Sub5 local31 = (Class6_Sub5) aClass212_32.method5106((long) (local1 << 16 | local4));
						if (local31 != null) {
							for (local35 = 0; local35 < local31.aShortArray10.length; local35++) {
								@Pc(46) Class313 local46 = aClass100_3.method2008(local31.aShortArray10[local35] & 0xFFFF);
								local49 = local46.anInt8455;
								if (local46.anIntArray650 != null) {
									local46 = local46.method6967(anInterface5_2);
									if (local46 != null) {
										local49 = local46.anInt8455;
									}
								}
								if (local49 != -1) {
									@Pc(70) Class6_Sub34 local70 = new Class6_Sub34(local49);
									local70.anInt4906 = local1;
									local70.anInt4905 = local4;
									aClass275_155.method6370(local70);
								}
							}
						}
					} else {
						@Pc(94) Class313 local94 = aClass100_3.method2008(local15 - 1);
						local35 = local94.anInt8455;
						if (local94.anIntArray650 != null) {
							local94 = local94.method6967(anInterface5_2);
							if (local94 != null) {
								local35 = local94.anInt8455;
							}
						}
						if (local35 != -1) {
							@Pc(118) Class6_Sub34 local118 = new Class6_Sub34(local35);
							local118.anInt4906 = local1;
							local118.anInt4905 = local4;
							aClass275_155.method6370(local118);
						}
					}
				}
			}
		}
		for (local4 = 0; local4 < 3; local4++) {
			for (local15 = 0; local15 < aClass249ArrayArrayArray2[0].length; local15++) {
				for (@Pc(144) int local144 = 0; local144 < aClass249ArrayArrayArray2[0][0].length; local144++) {
					@Pc(153) Class249 local153 = aClass249ArrayArrayArray2[local4][local15][local144];
					if (local153 != null) {
						for (@Pc(160) Class102_Sub4 local160 = (Class102_Sub4) local153.method5817(); local160 != null; local160 = (Class102_Sub4) local153.method5815()) {
							if (local160.aShortArray116 != null) {
								for (local49 = 0; local49 < local160.aShortArray116.length; local49++) {
									@Pc(177) Class313 local177 = aClass100_3.method2008(local160.aShortArray116[local49] & 0xFFFF);
									@Pc(180) int local180 = local177.anInt8455;
									if (local177.anIntArray650 != null) {
										local177 = local177.method6967(anInterface5_2);
										if (local177 != null) {
											local180 = local177.anInt8455;
										}
									}
									if (local180 != -1) {
										@Pc(201) Class6_Sub34 local201 = new Class6_Sub34(local180);
										local201.anInt4906 = (local15 + (anInt7457 >> 6)) * 64 + local160.aByte72 - anInt7457;
										local201.anInt4905 = (local144 + (anInt7465 >> 6)) * 64 + local160.aByte73 - anInt7465;
										aClass275_155.method6370(local201);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lclient!e;III)I")
	private static int method6186(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class298 local4 = aClass327_4.method7411(arg1);
		if (local4 == null) {
			return 0;
		}
		@Pc(11) int local11 = local4.anInt8016;
		if (local11 >= 0 && arg0.method5209(local11).aBoolean107) {
			local11 = -1;
		}
		@Pc(68) int local68;
		@Pc(27) int local27;
		@Pc(33) int local33;
		@Pc(55) int local55;
		if (local4.anInt8012 >= 0) {
			local27 = local4.anInt8012;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static6.anIntArray272[Static516.method7312(Static263.method3728(local55)) & 0xFFFF] | 0xFF000000;
		} else if (local11 >= 0) {
			local68 = Static6.anIntArray272[Static516.method7312(Static263.method3728(arg0.method5209(local11).aShort30)) & 0xFFFF] | 0xFF000000;
		} else if (local4.anInt8014 == -1) {
			local68 = 0;
		} else {
			local27 = local4.anInt8014;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static6.anIntArray272[Static516.method7312(Static263.method3728(local55)) & 0xFFFF] | 0xFF000000;
		}
		return local68;
	}

	@OriginalMember(owner = "client!oaa", name = "d", descriptor = "()V")
	public static void method6188() {
		@Pc(2) int[] local2 = new int[3];
		for (@Pc(4) int local4 = 0; local4 < aClass252_5.anInt7034; local4++) {
			@Pc(32) boolean local32 = aClass6_Sub1_Sub9_3.method2748(aClass252_5.anIntArray566[local4] >> 14 & 0x3FFF, aClass252_5.anIntArray566[local4] >> 28 & 0x3, aClass252_5.anIntArray566[local4] & 0x3FFF, local2);
			if (local32) {
				@Pc(42) Class6_Sub34 local42 = new Class6_Sub34(aClass252_5.anIntArray567[local4]);
				local42.anInt4906 = local2[1] - anInt7457;
				local42.anInt4905 = local2[2] - anInt7465;
				aClass275_155.method6370(local42);
			}
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lclient!oa;Lclient!dga;IIII[I[I)V")
	private static void method6189(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class6_Sub14 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		@Pc(3) int local3 = arg1.method6041();
		if ((local3 & 0x1) == 0) {
			@Pc(15) boolean local15 = (local3 & 0x2) == 0;
			@Pc(21) int local21 = local3 >> 2 & 0x3F;
			if (local21 != 62) {
				if (local21 == 63) {
					local21 = arg1.method6041();
				} else if (local15) {
					local21 = arg6[local21];
				} else {
					local21 = arg7[local21];
				}
				if (local15) {
					aByteArray93[arg4 + arg5 * anInt7466] = (byte) local21;
					aByteArray92[arg4 + arg5 * anInt7466] = 0;
				} else {
					aByteArray92[arg4 + arg5 * anInt7466] = (byte) local21;
					aByteArray95[arg4 + arg5 * anInt7466] = 0;
					aByteArray93[arg4 + arg5 * anInt7466] = arg1.method6034();
				}
			}
			return;
		}
		@Pc(100) int local100 = (local3 >> 1 & 0x3) + 1;
		@Pc(108) boolean local108 = (local3 & 0x8) != 0;
		@Pc(116) boolean local116 = (local3 & 0x10) != 0;
		for (@Pc(118) int local118 = 0; local118 < local100; local118++) {
			@Pc(123) int local123 = arg1.method6041();
			@Pc(125) int local125 = 0;
			@Pc(127) int local127 = 0;
			if (local108) {
				local125 = arg1.method6041();
				local127 = arg1.method6041();
			}
			@Pc(139) int local139 = 0;
			if (local116) {
				local139 = arg1.method6041();
			}
			@Pc(215) short[] local215;
			@Pc(218) byte[] local218;
			@Pc(220) int local220;
			if (local118 == 0) {
				aByteArray93[arg4 + arg5 * anInt7466] = (byte) local123;
				aByteArray92[arg4 + arg5 * anInt7466] = (byte) local125;
				aByteArray95[arg4 + arg5 * anInt7466] = (byte) local127;
				if (local139 == 1) {
					aShortArray119[arg4 + arg5 * anInt7466] = (short) (arg1.method6006() + 1);
					aByteArray94[arg4 + arg5 * anInt7466] = arg1.method6034();
				} else if (local139 > 1) {
					aShortArray119[arg4 + arg5 * anInt7466] = -1;
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method6006();
						local218[local220] = arg1.method6034();
					}
					aClass212_32.method5104((long) (arg4 << 16 | arg5), new Class6_Sub5(local215, local218));
				}
			} else {
				local215 = null;
				local218 = null;
				if (local139 > 0) {
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method6006();
						local218[local220] = arg1.method6034();
					}
				}
				if (aClass249ArrayArrayArray2[local118 - 1][arg2 - (anInt7457 >> 6)][arg3 - (anInt7465 >> 6)] == null) {
					aClass249ArrayArrayArray2[local118 - 1][arg2 - (anInt7457 >> 6)][arg3 - (anInt7465 >> 6)] = new Class249();
				}
				@Pc(338) Class102_Sub4 local338 = new Class102_Sub4(arg4 & 0x3F, arg5 & 0x3F, local123, local125, local127, local215, local218);
				aClass249ArrayArrayArray2[local118 - 1][arg2 - (anInt7457 >> 6)][arg3 - (anInt7465 >> 6)].method5809(local338);
			}
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)Lclient!he;")
	public static Class6_Sub1_Sub9 method6190(@OriginalArg(0) int arg0) {
		return (Class6_Sub1_Sub9) aClass212_31.method5106((long) arg0);
	}

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "(Lclient!oa;)V")
	public static void method6191(@OriginalArg(0) Class121 arg0) {
		@Pc(3) int local3 = anInt7462 - anInt7461;
		@Pc(7) int local7 = anInt7458 - anInt7467;
		@Pc(15) int local15 = (anInt7460 - anInt7459 << 16) / local3;
		@Pc(23) int local23 = (anInt7456 - anInt7464 << 16) / local7;
		method6184(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lclient!oa;IIIIIII[S[BZ)V")
	private static void method6192(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) boolean arg10) {
		@Pc(20) int local20;
		@Pc(32) int local32;
		if (arg10 || arg5 != 0 || arg6 > 0) {
			if (arg6 == 0) {
				arg0.C(arg1, arg2, arg3, arg4, arg5, 0);
			} else {
				local20 = arg7 & 0x3F;
				if (local20 == 0 || arg3 <= 1 || arg4 <= 1) {
					local32 = anIntArray582[arg6];
					if (arg10 || local32 != 0) {
						arg0.C(arg1, arg2, arg3, arg4, local32, 0);
					}
				} else {
					local32 = arg10 ? 0 : 1;
					Static503.method843(anIntArray582[arg6], local20, arg5, arg4, anInt7455, local32, arg2, arg0, arg3, arg7 >> 6 & 0x3, arg1, aByteArrayArrayArray17);
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
				@Pc(127) Class313 local127 = aClass100_3.method2008(arg8[local100] & 0xFFFF);
				if (local127.anInt8446 == -1) {
					@Pc(133) int local133 = -3355444;
					if (local127.lb == 1) {
						local133 = -3407872;
					}
					@Pc(147) int local147 = arg9[local100] >> 6 & 0x3;
					if (local107 == 0) {
						if (local147 == 0) {
							arg0.ya(arg1, arg2, arg4, local133, 0);
						} else if (local147 == 1) {
							arg0.e(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 2) {
							arg0.ya(local20, arg2, arg4, local133, 0);
						} else {
							arg0.e(arg1, local32, arg3, local133, 0);
						}
					} else if (local107 == 2) {
						if (local147 == 0) {
							arg0.ya(arg1, arg2, arg4, -1, 0);
							arg0.e(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 1) {
							arg0.ya(local20, arg2, arg4, -1, 0);
							arg0.e(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 2) {
							arg0.ya(local20, arg2, arg4, -1, 0);
							arg0.e(arg1, local32, arg3, local133, 0);
						} else {
							arg0.ya(arg1, arg2, arg4, -1, 0);
							arg0.e(arg1, local32, arg3, local133, 0);
						}
					} else if (local107 == 3) {
						if (local147 == 0) {
							arg0.e(arg1, arg2, 1, local133, 0);
						} else if (local147 == 1) {
							arg0.e(local20, arg2, 1, local133, 0);
						} else if (local147 == 2) {
							arg0.e(local20, local32, 1, local133, 0);
						} else {
							arg0.e(arg1, local32, 1, local133, 0);
						}
					} else if (local107 == 9) {
						@Pc(313) int local313;
						if (local147 == 0 || local147 == 2) {
							for (local313 = 0; local313 < arg4; local313++) {
								arg0.e(arg1 + local313, local32 - local313, 1, local133, 0);
							}
						} else {
							for (local313 = 0; local313 < arg4; local313++) {
								arg0.e(arg1 + local313, arg2 + local313, 1, local133, 0);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "(Lclient!oa;IIII)Lclient!rh;")
	private static Class275 method6193(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(4) Class6_Sub34 local4 = (Class6_Sub34) aClass275_155.method6366(); local4 != null; local4 = (Class6_Sub34) aClass275_155.method6364()) {
			method6182(arg0, local4, arg1, arg2);
		}
		return aClass275_155;
	}

	@OriginalMember(owner = "client!oaa", name = "e", descriptor = "()V")
	public static void method6194() {
		aByteArray93 = new byte[anInt7466 * anInt7463];
		aByteArray92 = new byte[anInt7466 * anInt7463];
		aByteArray95 = new byte[anInt7466 * anInt7463];
		aShortArray119 = new short[anInt7466 * anInt7463];
		aByteArray94 = new byte[anInt7466 * anInt7463];
		aClass212_32 = new Class212(1024);
		aClass249ArrayArrayArray2 = new Class249[3][anInt7466 >> 6][anInt7463 >> 6];
		anIntArray582 = new int[aClass327_4.anInt9055 + 1];
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lclient!e;II)V")
	public static void method6195(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < aClass327_4.anInt9055; local1++) {
			anIntArray582[local1 + 1] = method6186(arg0, local1, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "(I)V")
	public static void method6196(@OriginalArg(0) int arg0) {
		aClass6_Sub1_Sub9_3 = (Class6_Sub1_Sub9) aClass212_31.method5106((long) arg0);
	}
}
