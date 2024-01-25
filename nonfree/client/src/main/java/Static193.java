import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "Lclient!ka;")
	public static Class3_Sub7_Sub13 aClass3_Sub7_Sub13_4;

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "Lclient!ir;")
	public static Class100 aClass100_47;

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
	public static int anInt2342;

	@OriginalMember(owner = "client!mf", name = "i", descriptor = "F")
	public static float aFloat14;

	@OriginalMember(owner = "client!mf", name = "j", descriptor = "Lclient!nr;")
	public static Class146 aClass146_2;

	@OriginalMember(owner = "client!mf", name = "m", descriptor = "F")
	public static float aFloat15;

	@OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
	public static int anInt2345;

	@OriginalMember(owner = "client!mf", name = "o", descriptor = "Lclient!bo;")
	private static Class24 aClass24_15;

	@OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
	public static int anInt2346;

	@OriginalMember(owner = "client!mf", name = "q", descriptor = "[S")
	private static short[] aShortArray66;

	@OriginalMember(owner = "client!mf", name = "r", descriptor = "[B")
	private static byte[] aByteArray42;

	@OriginalMember(owner = "client!mf", name = "s", descriptor = "[B")
	private static byte[] aByteArray43;

	@OriginalMember(owner = "client!mf", name = "t", descriptor = "[I")
	private static int[] anIntArray138;

	@OriginalMember(owner = "client!mf", name = "u", descriptor = "[B")
	private static byte[] aByteArray44;

	@OriginalMember(owner = "client!mf", name = "v", descriptor = "[B")
	private static byte[] aByteArray45;

	@OriginalMember(owner = "client!mf", name = "w", descriptor = "I")
	public static int anInt2347;

	@OriginalMember(owner = "client!mf", name = "x", descriptor = "I")
	public static int anInt2348;

	@OriginalMember(owner = "client!mf", name = "y", descriptor = "[B")
	private static byte[] aByteArray46;

	@OriginalMember(owner = "client!mf", name = "z", descriptor = "I")
	public static int anInt2349;

	@OriginalMember(owner = "client!mf", name = "A", descriptor = "[S")
	private static short[] aShortArray67;

	@OriginalMember(owner = "client!mf", name = "B", descriptor = "I")
	public static int anInt2350;

	@OriginalMember(owner = "client!mf", name = "C", descriptor = "I")
	public static int anInt2351;

	@OriginalMember(owner = "client!mf", name = "D", descriptor = "I")
	public static int anInt2352;

	@OriginalMember(owner = "client!mf", name = "E", descriptor = "I")
	public static int anInt2353;

	@OriginalMember(owner = "client!mf", name = "F", descriptor = "[[[Lclient!fi;")
	private static Class65[][][] aClass65ArrayArrayArray2;

	@OriginalMember(owner = "client!mf", name = "G", descriptor = "I")
	public static int anInt2354;

	@OriginalMember(owner = "client!mf", name = "H", descriptor = "I")
	public static int anInt2355;

	@OriginalMember(owner = "client!mf", name = "I", descriptor = "I")
	public static int anInt2356;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "Lclient!bo;")
	private static final Class24 aClass24_14 = new Class24(16);

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "[B")
	private static final byte[] aByteArray41 = new byte[1];

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "Lclient!m;")
	public static final Class127 aClass127_11 = new Class127();

	@OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
	public static int anInt2343 = (int) (Math.random() * 11.0D) - 5;

	@OriginalMember(owner = "client!mf", name = "k", descriptor = "[S")
	private static final short[] aShortArray65 = new short[1];

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
	public static int anInt2344 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "()V")
	public static void method1907() {
		aByteArray45 = null;
		aByteArray42 = null;
		aShortArray66 = null;
		aByteArray46 = null;
		aByteArray43 = null;
		aShortArray67 = null;
		aByteArray44 = null;
		aClass24_15 = null;
		aClass65ArrayArrayArray2 = null;
		anIntArray138 = null;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
	public static void method1908(@OriginalArg(0) int arg0) {
		aClass3_Sub7_Sub13_4 = (Class3_Sub7_Sub13) aClass24_14.method609((long) arg0);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!tj;Lclient!fb;IIII[I[I)V")
	private static void method1909(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class3_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		@Pc(3) int local3 = arg1.method3643();
		if ((local3 & 0x1) == 0) {
			@Pc(15) boolean local15 = (local3 & 0x2) == 0;
			@Pc(21) int local21 = local3 >> 2 & 0x3F;
			if (local21 != 62) {
				if (local21 == 63) {
					local21 = arg1.method3643();
				} else if (local15) {
					local21 = arg6[local21];
				} else {
					local21 = arg7[local21];
				}
				if (local15) {
					aByteArray45[arg4 + arg5 * anInt2347] = (byte) local21;
					aByteArray46[arg4 + arg5 * anInt2347] = 0;
				} else {
					aByteArray46[arg4 + arg5 * anInt2347] = (byte) local21;
					aByteArray43[arg4 + arg5 * anInt2347] = 0;
					aByteArray45[arg4 + arg5 * anInt2347] = arg1.method3621();
				}
			}
			return;
		}
		@Pc(100) int local100 = (local3 >> 1 & 0x3) + 1;
		@Pc(108) boolean local108 = (local3 & 0x8) != 0;
		@Pc(116) boolean local116 = (local3 & 0x10) != 0;
		for (@Pc(118) int local118 = 0; local118 < local100; local118++) {
			@Pc(123) int local123 = arg1.method3643();
			@Pc(125) int local125 = 0;
			@Pc(127) int local127 = 0;
			if (local108) {
				local125 = arg1.method3643();
				local127 = arg1.method3643();
			}
			@Pc(139) int local139 = 0;
			if (local116) {
				local139 = arg1.method3643();
			}
			@Pc(215) short[] local215;
			@Pc(218) byte[] local218;
			@Pc(220) int local220;
			if (local118 == 0) {
				aByteArray45[arg4 + arg5 * anInt2347] = (byte) local123;
				aByteArray46[arg4 + arg5 * anInt2347] = (byte) local125;
				aByteArray43[arg4 + arg5 * anInt2347] = (byte) local127;
				if (local139 == 1) {
					aShortArray67[arg4 + arg5 * anInt2347] = (short) (arg1.method3649() + 1);
					aByteArray44[arg4 + arg5 * anInt2347] = arg1.method3621();
				} else if (local139 > 1) {
					aShortArray67[arg4 + arg5 * anInt2347] = -1;
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method3649();
						local218[local220] = arg1.method3621();
					}
					aClass24_15.method598((long) (arg4 << 16 | arg5), new Class3_Sub27(local215, local218));
				}
			} else {
				local215 = null;
				local218 = null;
				if (local139 > 0) {
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method3649();
						local218[local220] = arg1.method3621();
					}
				}
				if (aClass65ArrayArrayArray2[local118 - 1][arg2 - (anInt2349 >> 6)][arg3 - (anInt2354 >> 6)] == null) {
					aClass65ArrayArrayArray2[local118 - 1][arg2 - (anInt2349 >> 6)][arg3 - (anInt2354 >> 6)] = new Class65();
				}
				@Pc(338) Class8_Sub8 local338 = new Class8_Sub8(arg4 & 0x3F, arg5 & 0x3F, local123, local125, local127, local215, local218);
				aClass65ArrayArrayArray2[local118 - 1][arg2 - (anInt2349 >> 6)][arg3 - (anInt2354 >> 6)].method1458(local338);
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!tj;Lclient!bd;IIII)V")
	private static void method1910(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class3_Sub5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1.anInt541 = anInt2350 + (arg2 * (arg1.anInt545 - anInt2346) >> 16);
		arg1.anInt551 = anInt2353 - (arg3 * (arg1.anInt548 - anInt2351) >> 16);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)Lclient!ka;")
	public static Class3_Sub7_Sub13 method1911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class3_Sub7_Sub13 local4 = (Class3_Sub7_Sub13) aClass24_14.method595(); local4 != null; local4 = (Class3_Sub7_Sub13) aClass24_14.method602()) {
			if (local4.aBoolean169 && local4.method2566(arg0, arg1)) {
				return local4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "([B[B[SII)V")
	private static void method1912(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int[] local2 = new int[anInt2345];
		@Pc(5) int[] local5 = new int[anInt2345];
		@Pc(8) int[] local8 = new int[anInt2345];
		@Pc(11) int[] local11 = new int[anInt2345];
		@Pc(14) int[] local14 = new int[anInt2345];
		for (@Pc(16) int local16 = -5; local16 < anInt2347; local16++) {
			@Pc(21) int local21 = local16 + 5;
			@Pc(25) int local25 = local16 - 5;
			@Pc(41) int local41;
			for (@Pc(27) int local27 = 0; local27 < anInt2345; local27++) {
				@Pc(49) Class155 local49;
				@Pc(85) int local85;
				if (local21 < anInt2347) {
					local41 = arg0[local21 + local27 * anInt2347] & 0xFF;
					if (local41 > 0) {
						local49 = Static106.method1817(local41 - 1);
						local2[local27] += local49.anInt4706;
						local5[local27] += local49.anInt4708;
						local8[local27] += local49.anInt4707;
						local11[local27] += local49.anInt4696;
						local85 = local14[local27]++;
					}
				}
				if (local25 >= 0) {
					local41 = arg0[local25 + local27 * anInt2347] & 0xFF;
					if (local41 > 0) {
						local49 = Static106.method1817(local41 - 1);
						local2[local27] -= local49.anInt4706;
						local5[local27] -= local49.anInt4708;
						local8[local27] -= local49.anInt4707;
						local11[local27] -= local49.anInt4696;
						local85 = local14[local27]--;
					}
				}
			}
			if (local16 >= 0) {
				local41 = 0;
				@Pc(157) int local157 = 0;
				@Pc(159) int local159 = 0;
				@Pc(161) int local161 = 0;
				@Pc(163) int local163 = 0;
				for (@Pc(165) int local165 = -5; local165 < anInt2345; local165++) {
					@Pc(170) int local170 = local165 + 5;
					if (local170 < anInt2345) {
						local41 += local2[local170];
						local157 += local5[local170];
						local159 += local8[local170];
						local161 += local11[local170];
						local163 += local14[local170];
					}
					@Pc(207) int local207 = local165 - 5;
					if (local207 >= 0) {
						local41 -= local2[local207];
						local157 -= local5[local207];
						local159 -= local8[local207];
						local161 -= local11[local207];
						local163 -= local14[local207];
					}
					if (local165 >= 0 && local163 > 0) {
						@Pc(259) int local259;
						if ((arg0[local16 + local165 * anInt2347] & 0xFF) == 0) {
							local259 = local16 + local165 * anInt2347;
							arg1[local259] = 0;
							arg2[local259] = 0;
						} else {
							local259 = local161 == 0 ? 0 : Static111.method1930(local41 * 256 / local161, local157 / local163, local159 / local163);
							@Pc(292) int local292 = (local259 & 0x7F) + arg4;
							if (local292 < 0) {
								local292 = 0;
							} else if (local292 > 127) {
								local292 = 127;
							}
							@Pc(314) int local314 = (local259 + arg3 & 0xFC00) + (local259 & 0x380) + local292;
							@Pc(320) int local320 = local16 + local165 * anInt2347;
							@Pc(331) int local331 = Static113.anIntArray533[Static298.method5060(Static296.method5020(local314)) & 0xFFFF];
							arg1[local320] = (byte) (local331 >> 16 & 0xFF);
							arg2[local320] = (short) (local331 & 0xFFFF);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!tj;IIII[S[B)V")
	private static void method1913(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		if (arg5 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < arg5.length; local4++) {
			@Pc(13) Class170 local13 = Static268.method4553(arg5[local4] & 0xFFFF);
			@Pc(16) int local16 = local13.anInt5258;
			if (local16 != -1) {
				@Pc(23) Class154 local23 = Static296.method5021(local16);
				@Pc(47) Class57 local47 = local23.method3999(arg0, local13.aBoolean315 ? arg6[local4] >> 6 & 0x3 : 0, local13.aBoolean309 ? local13.aBoolean313 : false);
				if (local47 != null) {
					@Pc(56) int local56 = arg3 * local47.method5433() >> 2;
					@Pc(63) int local63 = arg4 * local47.method5441() >> 2;
					if (local23.aBoolean268) {
						@Pc(69) int local69 = local13.anInt5235;
						@Pc(72) int local72 = local13.anInt5251;
						if ((arg6[local4] >> 6 & 0x1) == 1) {
							@Pc(83) int local83 = local69;
							local69 = local72;
							local72 = local83;
						}
						local56 = local69 * arg3;
						local63 = local72 * arg4;
					}
					if (local56 != 0 && local63 != 0) {
						if (local23.anInt4688 == 0) {
							local47.method5431(arg1, arg2 + arg4 - local63, local56, local63);
						} else {
							local47.method5449(arg1, arg2 + arg4 - local63, local56, local63, 1, local23.anInt4688 | 0xFF000000, 1);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!tj;IIII)V")
	private static void method1914(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = anInt2348 - anInt2346;
		@Pc(7) int local7 = anInt2352 - anInt2351;
		if (anInt2348 < anInt2347) {
			local3++;
		}
		if (anInt2352 < anInt2345) {
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
		@Pc(172) int local172;
		@Pc(174) int local174;
		@Pc(176) int local176;
		@Pc(178) int local178;
		for (@Pc(17) int local17 = 0; local17 < local3; local17++) {
			local28 = (arg1 * local17 >> 16) + anInt2350;
			local40 = (arg1 * (local17 + 1) >> 16) + anInt2350;
			local44 = local40 - local28;
			if (local44 > 0) {
				local50 = anInt2346 + local17;
				if (local50 >= 0 && local50 < anInt2347) {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt2353 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt2353 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (local84 > 0) {
							local93 = local57 + anInt2351;
							local172 = local50 + local93 * anInt2347;
							local174 = 0;
							local176 = 0;
							local178 = 0;
							if (local93 >= 0 && local93 < anInt2345) {
								local174 = (aByteArray42[local172] & 0xFF) << 16 | aShortArray66[local172] & 0xFFFF;
								if (local174 != 0) {
									local174 |= 0xFF000000;
								}
								local176 = aByteArray46[local172] & 0xFF;
								local178 = aShortArray67[local172] & 0xFFFF;
							}
							if (local174 == 0 && local176 == 0 && local178 == 0) {
								if (aClass3_Sub7_Sub13_4.anInt3134 != -1) {
									local174 = aClass3_Sub7_Sub13_4.anInt3134 | 0xFF000000;
								} else if ((local17 + anInt2346 & 0x4) == (local57 + anInt2352 & 0x4)) {
									local174 = anIntArray138[Static303.anInt5606 + 1];
								} else {
									local174 = -11840664;
								}
								if (local174 == 0) {
									local174 = -16777216;
								}
								arg0.method4732(local28, local70, local44, local84, local174, 0);
							} else if (local178 <= 0) {
								method1920(arg0, local28, local70, local44, local84, local174, local176, aByteArray43[local172], null, null, true);
							} else if (local178 == 65535) {
								@Pc(280) Class3_Sub27 local280 = (Class3_Sub27) aClass24_15.method609((long) (local50 << 16 | local93));
								if (local280 != null) {
									method1920(arg0, local28, local70, local44, local84, local174, local176, aByteArray43[local172], local280.aShortArray72, local280.aByteArray59, true);
								}
							} else {
								aShortArray65[0] = (short) (local178 - 1);
								aByteArray41[0] = aByteArray44[local172];
								method1920(arg0, local28, local70, local44, local84, local174, local176, aByteArray43[local172], aShortArray65, aByteArray41, true);
							}
						}
					}
				} else {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt2353 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt2353 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (aClass3_Sub7_Sub13_4.anInt3134 != -1) {
							local93 = aClass3_Sub7_Sub13_4.anInt3134 | 0xFF000000;
						} else if ((local17 + anInt2346 & 0x4) == (local57 + anInt2352 & 0x4)) {
							local93 = anIntArray138[Static303.anInt5606 + 1];
						} else {
							local93 = -11840664;
						}
						if (local93 == 0) {
							local93 = -16777216;
						}
						arg0.method4732(local28, local70, local44, local84, local93, 0);
					}
				}
			}
		}
		for (local28 = -16; local28 < local3 + 16; local28++) {
			local40 = (arg1 * local28 >> 16) + anInt2350;
			local44 = (arg1 * (local28 + 1) >> 16) + anInt2350;
			local50 = local44 - local40;
			if (local50 > 0) {
				local57 = local28 + anInt2346;
				if (local57 >= 0 && local57 < anInt2347) {
					for (local70 = -16; local70 < local7 + 16; local70++) {
						local80 = anInt2353 - (arg2 * (local70 + 1) >> 16);
						local84 = anInt2353 - (arg2 * local70 >> 16);
						local93 = local84 - local80;
						if (local93 > 0) {
							local172 = local70 + anInt2351;
							if (local172 >= 0 && local172 < anInt2345) {
								local174 = aShortArray67[local57 + local172 * anInt2347] & 0xFFFF;
								if (local174 <= 0) {
									method1913(arg0, local40, local80, local50, local93, null, null);
								} else if (local174 == 65535) {
									@Pc(457) Class3_Sub27 local457 = (Class3_Sub27) aClass24_15.method609((long) (local57 << 16 | local172));
									if (local457 != null) {
										method1913(arg0, local40, local80, local50, local93, local457.aShortArray72, local457.aByteArray59);
									}
								} else {
									aShortArray65[0] = (short) (local174 - 1);
									aByteArray41[0] = aByteArray44[local57 + local172 * anInt2347];
									method1913(arg0, local40, local80, local50, local93, aShortArray65, aByteArray41);
								}
							}
						}
					}
				}
			}
		}
		local40 = anInt2346 >> 6;
		local44 = anInt2351 >> 6;
		if (local40 < 0) {
			local40 = 0;
		}
		if (local44 < 0) {
			local44 = 0;
		}
		local50 = anInt2348 >> 6;
		local57 = anInt2352 >> 6;
		if (local50 >= aClass65ArrayArrayArray2[0].length) {
			local50 = aClass65ArrayArrayArray2[0].length - 1;
		}
		if (local57 >= aClass65ArrayArrayArray2[0][0].length) {
			local57 = aClass65ArrayArrayArray2[0][0].length - 1;
		}
		for (local70 = 0; local70 < 3; local70++) {
			@Pc(639) int local639;
			@Pc(651) int local651;
			@Pc(663) int local663;
			@Pc(673) int local673;
			@Pc(629) int local629;
			for (local80 = local40; local80 <= local50; local80++) {
				for (local84 = local44; local84 <= local57; local84++) {
					@Pc(587) Class65 local587 = aClass65ArrayArrayArray2[local70][local80][local84];
					if (local587 != null) {
						local172 = (local80 + (anInt2349 >> 6)) * 64;
						local174 = (local84 + (anInt2354 >> 6)) * 64;
						for (@Pc(610) Class8_Sub8 local610 = (Class8_Sub8) local587.method1462(); local610 != null; local610 = (Class8_Sub8) local587.method1461()) {
							local178 = local172 + local610.aByte61 - anInt2349 - anInt2346;
							local629 = local174 + local610.aByte62 - anInt2354 - anInt2351;
							local639 = (arg1 * local178 >> 16) + anInt2350;
							local651 = (arg1 * (local178 + 1) >> 16) + anInt2350;
							local663 = anInt2353 - (arg2 * (local629 + 1) >> 16);
							local673 = anInt2353 - (arg2 * local629 >> 16);
							method1920(arg0, local639, local663, local651 - local639, local673 - local663, local610.anInt5545, local610.aByte64 & 0xFF, local610.aByte63, local610.aShortArray104, local610.aByteArray84, false);
						}
					}
				}
			}
			for (local84 = local40; local84 <= local50; local84++) {
				for (local93 = local44; local93 <= local57; local93++) {
					@Pc(725) Class65 local725 = aClass65ArrayArrayArray2[local70][local84][local93];
					if (local725 != null) {
						local174 = (local84 + (anInt2349 >> 6)) * 64;
						local176 = (local93 + (anInt2354 >> 6)) * 64;
						for (@Pc(748) Class8_Sub8 local748 = (Class8_Sub8) local725.method1462(); local748 != null; local748 = (Class8_Sub8) local725.method1461()) {
							local629 = local174 + local748.aByte61 - anInt2349 - anInt2346;
							local639 = local176 + local748.aByte62 - anInt2354 - anInt2351;
							local651 = (arg1 * local629 >> 16) + anInt2350;
							local663 = (arg1 * (local629 + 1) >> 16) + anInt2350;
							local673 = anInt2353 - (arg2 * (local639 + 1) >> 16);
							@Pc(811) int local811 = anInt2353 - (arg2 * local639 >> 16);
							method1913(arg0, local651, local673, local663 - local651, local811 - local673, local748.aShortArray104, local748.aByteArray84);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!tj;)V")
	public static void method1915(@OriginalArg(0) Class122 arg0) {
		@Pc(3) int local3 = anInt2348 - anInt2346;
		@Pc(7) int local7 = anInt2352 - anInt2351;
		@Pc(15) int local15 = (anInt2355 - anInt2350 << 16) / local3;
		@Pc(23) int local23 = (anInt2353 - anInt2356 << 16) / local7;
		method1914(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!wh;II)V")
	public static void method1916(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static127.anInt2722; local1++) {
			anIntArray138[local1 + 1] = method1924(arg0, local1, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)Lclient!ka;")
	public static Class3_Sub7_Sub13 method1917(@OriginalArg(0) int arg0) {
		return (Class3_Sub7_Sub13) aClass24_14.method609((long) arg0);
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "()V")
	public static void method1918() {
		aByteArray45 = new byte[anInt2347 * anInt2345];
		aByteArray46 = new byte[anInt2347 * anInt2345];
		aByteArray43 = new byte[anInt2347 * anInt2345];
		aShortArray67 = new short[anInt2347 * anInt2345];
		aByteArray44 = new byte[anInt2347 * anInt2345];
		aClass24_15 = new Class24(1024);
		aClass65ArrayArrayArray2 = new Class65[3][anInt2347 >> 6][anInt2345 >> 6];
		anIntArray138 = new int[Static127.anInt2722 + 1];
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!ir;)V")
	public static void method1919(@OriginalArg(0) Class100 arg0) {
		aClass100_47 = arg0;
		aClass24_14.method608();
		@Pc(9) int local9 = aClass100_47.method2304("details");
		@Pc(14) int[] local14 = aClass100_47.method2292(local9);
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(25) Class3_Sub7_Sub13 local25 = Static103.method1735(aClass100_47, local9, local14[local16]);
			aClass24_14.method598((long) local25.anInt3143, local25);
		}
		Static88.method1409(false);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!tj;IIIIIII[S[BZ)V")
	private static void method1920(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) boolean arg10) {
		@Pc(20) int local20;
		@Pc(32) int local32;
		if (arg10 || arg5 != 0 || arg6 > 0) {
			if (arg6 == 0) {
				arg0.method4732(arg1, arg2, arg3, arg4, arg5, 0);
			} else {
				local20 = arg7 & 0x3F;
				if (local20 == 0 || arg3 <= 1 || arg4 <= 1) {
					local32 = anIntArray138[arg6];
					if (arg10 || local32 != 0) {
						arg0.method4732(arg1, arg2, arg3, arg4, local32, 0);
					}
				} else {
					local32 = arg10 ? 0 : 1;
					Static84.method1337(aByteArrayArrayArray5, arg0, arg2, anIntArray138[arg6], local20, arg5, arg1, anInt2342, arg7 >> 6 & 0x3, local32, arg3, arg4);
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
				@Pc(126) Class170 local126 = Static268.method4553(arg8[local100] & 0xFFFF);
				if (local126.anInt5258 == -1) {
					@Pc(132) int local132 = -3355444;
					if (local126.anInt5227 == 1) {
						local132 = -3407872;
					}
					@Pc(146) int local146 = arg9[local100] >> 6 & 0x3;
					if (local107 == 0) {
						if (local146 == 0) {
							arg0.method4754(arg1, arg2, arg4, local132, 0);
						} else if (local146 == 1) {
							arg0.method4790(arg1, arg2, arg3, local132, 0);
						} else if (local146 == 2) {
							arg0.method4754(local20, arg2, arg4, local132, 0);
						} else {
							arg0.method4790(arg1, local32, arg3, local132, 0);
						}
					} else if (local107 == 2) {
						if (local146 == 0) {
							arg0.method4754(arg1, arg2, arg4, -1, 0);
							arg0.method4790(arg1, arg2, arg3, local132, 0);
						} else if (local146 == 1) {
							arg0.method4754(local20, arg2, arg4, -1, 0);
							arg0.method4790(arg1, arg2, arg3, local132, 0);
						} else if (local146 == 2) {
							arg0.method4754(local20, arg2, arg4, -1, 0);
							arg0.method4790(arg1, local32, arg3, local132, 0);
						} else {
							arg0.method4754(arg1, arg2, arg4, -1, 0);
							arg0.method4790(arg1, local32, arg3, local132, 0);
						}
					} else if (local107 == 3) {
						if (local146 == 0) {
							arg0.method4790(arg1, arg2, 1, local132, 0);
						} else if (local146 == 1) {
							arg0.method4790(local20, arg2, 1, local132, 0);
						} else if (local146 == 2) {
							arg0.method4790(local20, local32, 1, local132, 0);
						} else {
							arg0.method4790(arg1, local32, 1, local132, 0);
						}
					} else if (local107 == 9) {
						@Pc(312) int local312;
						if (local146 == 0 || local146 == 2) {
							for (local312 = 0; local312 < arg4; local312++) {
								arg0.method4790(arg1 + local312, local32 - local312, 1, local132, 0);
							}
						} else {
							for (local312 = 0; local312 < arg4; local312++) {
								arg0.method4790(arg1 + local312, arg2 + local312, 1, local132, 0);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!tj;II)V")
	public static void method1921(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class3_Sub4 local9 = new Class3_Sub4(aClass100_47.method2290("area", aClass3_Sub7_Sub13_4.aString119));
		@Pc(13) int local13 = local9.method3643();
		@Pc(16) int[] local16 = new int[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			local16[local18] = local9.method3643();
		}
		@Pc(33) int local33 = local9.method3643();
		@Pc(36) int[] local36 = new int[local33];
		for (@Pc(38) int local38 = 0; local38 < local33; local38++) {
			local36[local38] = local9.method3643();
		}
		while (true) {
			@Pc(58) int local58;
			@Pc(64) int local64;
			@Pc(67) int local67;
			@Pc(76) int local76;
			@Pc(148) int local148;
			while (local9.anInt4268 < local9.aByteArray70.length) {
				@Pc(62) int local62;
				@Pc(84) int local84;
				if (local9.method3643() == 0) {
					local58 = local9.method3643();
					local62 = local9.method3643();
					for (local64 = 0; local64 < 64; local64++) {
						for (local67 = 0; local67 < 64; local67++) {
							local76 = local58 * 64 + local64 - anInt2349;
							local84 = local62 * 64 + local67 - anInt2354;
							method1909(arg0, local9, local58, local62, local76, local84, local16, local36);
						}
					}
				} else {
					local58 = local9.method3643();
					local62 = local9.method3643();
					local64 = local9.method3643();
					local67 = local9.method3643();
					for (local76 = 0; local76 < 8; local76++) {
						for (local84 = 0; local84 < 8; local84++) {
							@Pc(136) int local136 = local58 * 64 + local64 * 8 + local76 - anInt2349;
							local148 = local62 * 64 + local67 * 8 + local84 - anInt2354;
							method1909(arg0, local9, local58, local62, local136, local148, local16, local36);
						}
					}
				}
			}
			aByteArray42 = new byte[anInt2347 * anInt2345];
			aShortArray66 = new short[anInt2347 * anInt2345];
			for (local58 = 0; local58 < 3; local58++) {
				@Pc(191) byte[] local191 = new byte[anInt2347 * anInt2345];
				for (local64 = 0; local64 < aClass65ArrayArrayArray2[local58].length; local64++) {
					for (local67 = 0; local67 < aClass65ArrayArrayArray2[local58][0].length; local67++) {
						@Pc(205) Class65 local205 = aClass65ArrayArrayArray2[local58][local64][local67];
						if (local205 != null) {
							for (@Pc(212) Class8_Sub8 local212 = (Class8_Sub8) local205.method1462(); local212 != null; local212 = (Class8_Sub8) local205.method1461()) {
								local191[local64 * 64 + local212.aByte61 + (local67 * 64 + local212.aByte62) * anInt2347] = (byte) local212.anInt5545;
							}
						}
					}
				}
				method1912(local191, aByteArray42, aShortArray66, arg1, arg2);
				for (local67 = 0; local67 < aClass65ArrayArrayArray2[local58].length; local67++) {
					for (local76 = 0; local76 < aClass65ArrayArrayArray2[local58][0].length; local76++) {
						@Pc(276) Class65 local276 = aClass65ArrayArrayArray2[local58][local67][local76];
						if (local276 != null) {
							for (@Pc(283) Class8_Sub8 local283 = (Class8_Sub8) local276.method1462(); local283 != null; local283 = (Class8_Sub8) local276.method1461()) {
								local148 = local67 * 64 + local283.aByte61 + (local76 * 64 + local283.aByte62) * anInt2347;
								local283.anInt5545 = (aByteArray42[local148] & 0xFF) << 16 | aShortArray66[local148] & 0xFFFF;
								if (local283.anInt5545 != 0) {
									local283.anInt5545 |= 0xFF000000;
								}
							}
						}
					}
				}
			}
			method1912(aByteArray45, aByteArray42, aShortArray66, arg1, arg2);
			aByteArray45 = null;
			method1922();
			return;
		}
	}

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "()V")
	private static void method1922() {
		@Pc(4) int local4;
		@Pc(15) int local15;
		for (@Pc(1) int local1 = 0; local1 < anInt2347; local1++) {
			for (local4 = 0; local4 < anInt2345; local4++) {
				local15 = aShortArray67[local1 + local4 * anInt2347] & 0xFFFF;
				if (local15 != 0) {
					if (local15 == 65535) {
						@Pc(31) Class3_Sub27 local31 = (Class3_Sub27) aClass24_15.method609((long) (local1 << 16 | local4));
						if (local31 != null) {
							for (@Pc(35) int local35 = 0; local35 < local31.aShortArray72.length; local35++) {
								@Pc(45) Class170 local45 = Static268.method4553(local31.aShortArray72[local35] & 0xFFFF);
								if (local45.anInt5231 != -1) {
									@Pc(55) Class3_Sub5 local55 = new Class3_Sub5(local45.anInt5231);
									local55.anInt545 = local1;
									local55.anInt548 = local4;
									aClass127_11.method3387(local55);
								}
							}
						}
					} else {
						@Pc(78) Class170 local78 = Static268.method4553(local15 - 1);
						if (local78.anInt5231 != -1) {
							@Pc(88) Class3_Sub5 local88 = new Class3_Sub5(local78.anInt5231);
							local88.anInt545 = local1;
							local88.anInt548 = local4;
							aClass127_11.method3387(local88);
						}
					}
				}
			}
		}
		for (local4 = 0; local4 < 3; local4++) {
			for (local15 = 0; local15 < aClass65ArrayArrayArray2[0].length; local15++) {
				for (@Pc(114) int local114 = 0; local114 < aClass65ArrayArrayArray2[0][0].length; local114++) {
					@Pc(123) Class65 local123 = aClass65ArrayArrayArray2[local4][local15][local114];
					if (local123 != null) {
						for (@Pc(130) Class8_Sub8 local130 = (Class8_Sub8) local123.method1462(); local130 != null; local130 = (Class8_Sub8) local123.method1461()) {
							if (local130.aShortArray104 != null) {
								for (@Pc(136) int local136 = 0; local136 < local130.aShortArray104.length; local136++) {
									@Pc(146) Class170 local146 = Static268.method4553(local130.aShortArray104[local136] & 0xFFFF);
									if (local146.anInt5231 != -1) {
										@Pc(156) Class3_Sub5 local156 = new Class3_Sub5(local146.anInt5231);
										local156.anInt545 = (local15 + (anInt2349 >> 6)) * 64 + local130.aByte61 - anInt2349;
										local156.anInt548 = (local114 + (anInt2354 >> 6)) * 64 + local130.aByte62 - anInt2354;
										aClass127_11.method3387(local156);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(II)Lclient!tr;")
	public static Class195 method1923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class195 local3 = new Class195();
		for (@Pc(8) Class3_Sub7_Sub13 local8 = (Class3_Sub7_Sub13) aClass24_14.method595(); local8 != null; local8 = (Class3_Sub7_Sub13) aClass24_14.method602()) {
			if (local8.aBoolean169 && local8.method2566(arg0, arg1)) {
				local3.method5213(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!wh;III)I")
	private static int method1924(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class1 local3 = Static216.method3748(arg1);
		if (local3 == null) {
			return 0;
		}
		@Pc(10) int local10 = local3.anInt15;
		if (local10 >= 0 && arg0.method2396(local10).aBoolean318) {
			local10 = -1;
		}
		@Pc(67) int local67;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(54) int local54;
		if (local3.anInt14 >= 0) {
			local26 = local3.anInt14;
			local32 = (local26 & 0x7F) + arg3;
			if (local32 < 0) {
				local32 = 0;
			} else if (local32 > 127) {
				local32 = 127;
			}
			local54 = (local26 + arg2 & 0xFC00) + (local26 & 0x380) + local32;
			local67 = Static113.anIntArray533[Static298.method5060(Static15.method389(local54)) & 0xFFFF] | 0xFF000000;
		} else if (local10 >= 0) {
			local67 = Static113.anIntArray533[Static298.method5060(Static15.method389(arg0.method2396(local10).aShort83)) & 0xFFFF] | 0xFF000000;
		} else if (local3.anInt11 == -1) {
			local67 = 0;
		} else {
			local26 = local3.anInt11;
			local32 = (local26 & 0x7F) + arg3;
			if (local32 < 0) {
				local32 = 0;
			} else if (local32 > 127) {
				local32 = 127;
			}
			local54 = (local26 + arg2 & 0xFC00) + (local26 & 0x380) + local32;
			local67 = Static113.anIntArray533[Static298.method5060(Static15.method389(local54)) & 0xFFFF] | 0xFF000000;
		}
		return local67;
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(Lclient!tj;)Lclient!m;")
	public static Class127 method1925(@OriginalArg(0) Class122 arg0) {
		@Pc(3) int local3 = anInt2348 - anInt2346;
		@Pc(7) int local7 = anInt2352 - anInt2351;
		@Pc(15) int local15 = (anInt2355 - anInt2350 << 16) / local3;
		@Pc(23) int local23 = (anInt2353 - anInt2356 << 16) / local7;
		return method1926(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(Lclient!tj;IIII)Lclient!m;")
	private static Class127 method1926(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(4) Class3_Sub5 local4 = (Class3_Sub5) aClass127_11.method3402(); local4 != null; local4 = (Class3_Sub5) aClass127_11.method3400()) {
			method1910(arg0, local4, arg1, arg2);
		}
		return aClass127_11;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt2346 = arg0 - anInt2349;
		anInt2352 = arg1 - anInt2354;
		anInt2348 = arg2 - anInt2349;
		anInt2351 = arg3 - anInt2354;
		anInt2350 = arg4;
		anInt2356 = arg5;
		anInt2355 = arg6;
		anInt2353 = arg7;
	}

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "()V")
	public static void method1928() {
		@Pc(2) int[] local2 = new int[3];
		for (@Pc(4) int local4 = 0; local4 < aClass146_2.anInt4414; local4++) {
			@Pc(32) boolean local32 = aClass3_Sub7_Sub13_4.method2565(aClass146_2.anIntArray357[local4] >> 14 & 0x3FFF, aClass146_2.anIntArray357[local4] & 0x3FFF, local2, aClass146_2.anIntArray357[local4] >> 28 & 0x3);
			if (local32) {
				@Pc(42) Class3_Sub5 local42 = new Class3_Sub5(aClass146_2.anIntArray356[local4]);
				local42.anInt545 = local2[1] - anInt2349;
				local42.anInt548 = local2[2] - anInt2354;
				aClass127_11.method3387(local42);
			}
		}
	}
}
