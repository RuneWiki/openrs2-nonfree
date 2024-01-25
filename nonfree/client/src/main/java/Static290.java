import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!se", name = "a", descriptor = "Lclient!ij;")
	public static Class93 aClass93_55;

	@OriginalMember(owner = "client!se", name = "c", descriptor = "Lclient!ge;")
	public static Class5_Sub1_Sub6 aClass5_Sub1_Sub6_2;

	@OriginalMember(owner = "client!se", name = "d", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!se", name = "f", descriptor = "F")
	public static float aFloat20;

	@OriginalMember(owner = "client!se", name = "g", descriptor = "Lclient!ep;")
	public static Class64 aClass64_2;

	@OriginalMember(owner = "client!se", name = "i", descriptor = "I")
	public static int anInt2764;

	@OriginalMember(owner = "client!se", name = "k", descriptor = "F")
	public static float aFloat21;

	@OriginalMember(owner = "client!se", name = "n", descriptor = "I")
	public static int anInt2766;

	@OriginalMember(owner = "client!se", name = "o", descriptor = "[B")
	private static byte[] aByteArray31;

	@OriginalMember(owner = "client!se", name = "p", descriptor = "[[[Lclient!cp;")
	private static Class39[][][] aClass39ArrayArrayArray2;

	@OriginalMember(owner = "client!se", name = "q", descriptor = "I")
	public static int anInt2767;

	@OriginalMember(owner = "client!se", name = "r", descriptor = "Lclient!tn;")
	private static Class190 aClass190_15;

	@OriginalMember(owner = "client!se", name = "s", descriptor = "I")
	public static int anInt2768;

	@OriginalMember(owner = "client!se", name = "t", descriptor = "I")
	public static int anInt2769;

	@OriginalMember(owner = "client!se", name = "u", descriptor = "I")
	public static int anInt2770;

	@OriginalMember(owner = "client!se", name = "v", descriptor = "[B")
	private static byte[] aByteArray32;

	@OriginalMember(owner = "client!se", name = "w", descriptor = "[I")
	private static int[] anIntArray267;

	@OriginalMember(owner = "client!se", name = "x", descriptor = "[B")
	private static byte[] aByteArray33;

	@OriginalMember(owner = "client!se", name = "y", descriptor = "I")
	public static int anInt2771;

	@OriginalMember(owner = "client!se", name = "z", descriptor = "[S")
	private static short[] aShortArray26;

	@OriginalMember(owner = "client!se", name = "A", descriptor = "I")
	public static int anInt2772;

	@OriginalMember(owner = "client!se", name = "B", descriptor = "I")
	public static int anInt2773;

	@OriginalMember(owner = "client!se", name = "C", descriptor = "I")
	public static int anInt2774;

	@OriginalMember(owner = "client!se", name = "D", descriptor = "I")
	public static int anInt2775;

	@OriginalMember(owner = "client!se", name = "E", descriptor = "I")
	public static int anInt2776;

	@OriginalMember(owner = "client!se", name = "F", descriptor = "[S")
	private static short[] aShortArray27;

	@OriginalMember(owner = "client!se", name = "G", descriptor = "I")
	public static int anInt2777;

	@OriginalMember(owner = "client!se", name = "H", descriptor = "[B")
	private static byte[] aByteArray34;

	@OriginalMember(owner = "client!se", name = "I", descriptor = "[B")
	private static byte[] aByteArray35;

	@OriginalMember(owner = "client!se", name = "b", descriptor = "Lclient!tn;")
	private static final Class190 aClass190_14 = new Class190(16);

	@OriginalMember(owner = "client!se", name = "e", descriptor = "I")
	public static int anInt2763 = (int) (Math.random() * 11.0D) - 5;

	@OriginalMember(owner = "client!se", name = "h", descriptor = "[B")
	private static final byte[] aByteArray30 = new byte[1];

	@OriginalMember(owner = "client!se", name = "j", descriptor = "[S")
	private static final short[] aShortArray25 = new short[1];

	@OriginalMember(owner = "client!se", name = "l", descriptor = "I")
	public static int anInt2765 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!se", name = "m", descriptor = "Lclient!jm;")
	public static final Class103 aClass103_69 = new Class103();

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!ea;IIII[S[B)V")
	private static void method2543(@OriginalArg(0) Class55 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		if (arg5 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < arg5.length; local4++) {
			@Pc(13) Class156 local13 = Static111.method1967(arg5[local4] & 0xFFFF);
			@Pc(16) int local16 = local13.anInt4766;
			if (local16 != -1) {
				@Pc(23) Class213 local23 = Static346.method5925(local16);
				@Pc(47) Class95 local47 = local23.method5984(local13.aBoolean385 ? arg6[local4] >> 6 & 0x3 : 0, arg0, local13.aBoolean388 ? local13.aBoolean389 : false);
				if (local47 != null) {
					@Pc(56) int local56 = arg3 * local47.method5507() >> 2;
					@Pc(63) int local63 = arg4 * local47.method5494() >> 2;
					if (local23.aBoolean586) {
						@Pc(69) int local69 = local13.anInt4775;
						@Pc(72) int local72 = local13.anInt4769;
						if ((arg6[local4] >> 6 & 0x1) == 1) {
							@Pc(83) int local83 = local69;
							local69 = local72;
							local72 = local83;
						}
						local56 = local69 * arg3;
						local63 = local72 * arg4;
					}
					if (local56 != 0 && local63 != 0) {
						if (local23.anInt6740 == 0) {
							local47.method5490(arg1, arg2 + arg4 - local63, local56, local63);
						} else {
							local47.method5493(arg1, arg2 + arg4 - local63, local56, local63, 1, local23.anInt6740 | 0xFF000000, 1);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(II)Lclient!we;")
	public static Class212 method2544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class212 local3 = new Class212();
		for (@Pc(8) Class5_Sub1_Sub6 local8 = (Class5_Sub1_Sub6) aClass190_14.method5471(); local8 != null; local8 = (Class5_Sub1_Sub6) aClass190_14.method5465()) {
			if (local8.aBoolean143 && local8.method1826(arg1, arg0)) {
				local3.method5936(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)Lclient!ge;")
	public static Class5_Sub1_Sub6 method2545(@OriginalArg(0) int arg0) {
		return (Class5_Sub1_Sub6) aClass190_14.method5466((long) arg0);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!gf;II)V")
	public static void method2546(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static216.anInt4317; local1++) {
			anIntArray267[local1 + 1] = method2565(arg0, local1, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!ij;)V")
	public static void method2547(@OriginalArg(0) Class93 arg0) {
		aClass93_55 = arg0;
		aClass190_14.method5472();
		@Pc(9) int local9 = aClass93_55.method2393("details");
		@Pc(14) int[] local14 = aClass93_55.method2420(local9);
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(25) Class5_Sub1_Sub6 local25 = Static314.method5479(local14[local16], local9, aClass93_55);
			aClass190_14.method5464(local25, (long) local25.anInt1947);
		}
		Static55.method4832(false);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!ea;II)V")
	public static void method2548(@OriginalArg(0) Class55 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class5_Sub12 local9 = new Class5_Sub12(aClass93_55.method2406(aClass5_Sub1_Sub6_2.aString12, "area"));
		@Pc(13) int local13 = local9.method5115();
		@Pc(16) int[] local16 = new int[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			local16[local18] = local9.method5115();
		}
		@Pc(33) int local33 = local9.method5115();
		@Pc(36) int[] local36 = new int[local33];
		for (@Pc(38) int local38 = 0; local38 < local33; local38++) {
			local36[local38] = local9.method5115();
		}
		while (true) {
			@Pc(58) int local58;
			@Pc(64) int local64;
			@Pc(67) int local67;
			@Pc(76) int local76;
			@Pc(148) int local148;
			while (local9.anInt5731 < local9.aByteArray90.length) {
				@Pc(62) int local62;
				@Pc(84) int local84;
				if (local9.method5115() == 0) {
					local58 = local9.method5115();
					local62 = local9.method5115();
					for (local64 = 0; local64 < 64; local64++) {
						for (local67 = 0; local67 < 64; local67++) {
							local76 = local58 * 64 + local64 - anInt2776;
							local84 = local62 * 64 + local67 - anInt2772;
							method2552(arg0, local9, local58, local62, local76, local84, local16, local36);
						}
					}
				} else {
					local58 = local9.method5115();
					local62 = local9.method5115();
					local64 = local9.method5115();
					local67 = local9.method5115();
					for (local76 = 0; local76 < 8; local76++) {
						for (local84 = 0; local84 < 8; local84++) {
							@Pc(136) int local136 = local58 * 64 + local64 * 8 + local76 - anInt2776;
							local148 = local62 * 64 + local67 * 8 + local84 - anInt2772;
							method2552(arg0, local9, local58, local62, local136, local148, local16, local36);
						}
					}
				}
			}
			aByteArray33 = new byte[anInt2777 * anInt2766];
			aShortArray26 = new short[anInt2777 * anInt2766];
			for (local58 = 0; local58 < 3; local58++) {
				@Pc(191) byte[] local191 = new byte[anInt2777 * anInt2766];
				for (local64 = 0; local64 < aClass39ArrayArrayArray2[local58].length; local64++) {
					for (local67 = 0; local67 < aClass39ArrayArrayArray2[local58][0].length; local67++) {
						@Pc(205) Class39 local205 = aClass39ArrayArrayArray2[local58][local64][local67];
						if (local205 != null) {
							for (@Pc(212) Class32_Sub5 local212 = (Class32_Sub5) local205.method806(); local212 != null; local212 = (Class32_Sub5) local205.method808()) {
								local191[local64 * 64 + local212.aByte36 + (local67 * 64 + local212.aByte35) * anInt2777] = (byte) local212.anInt4698;
							}
						}
					}
				}
				method2549(local191, aByteArray33, aShortArray26, arg1, arg2);
				for (local67 = 0; local67 < aClass39ArrayArrayArray2[local58].length; local67++) {
					for (local76 = 0; local76 < aClass39ArrayArrayArray2[local58][0].length; local76++) {
						@Pc(276) Class39 local276 = aClass39ArrayArrayArray2[local58][local67][local76];
						if (local276 != null) {
							for (@Pc(283) Class32_Sub5 local283 = (Class32_Sub5) local276.method806(); local283 != null; local283 = (Class32_Sub5) local276.method808()) {
								local148 = local67 * 64 + local283.aByte36 + (local76 * 64 + local283.aByte35) * anInt2777;
								local283.anInt4698 = (aByteArray33[local148] & 0xFF) << 16 | aShortArray26[local148] & 0xFFFF;
								if (local283.anInt4698 != 0) {
									local283.anInt4698 |= 0xFF000000;
								}
							}
						}
					}
				}
			}
			method2549(aByteArray35, aByteArray33, aShortArray26, arg1, arg2);
			aByteArray35 = null;
			method2555();
			return;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "([B[B[SII)V")
	private static void method2549(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int[] local2 = new int[anInt2766];
		@Pc(5) int[] local5 = new int[anInt2766];
		@Pc(8) int[] local8 = new int[anInt2766];
		@Pc(11) int[] local11 = new int[anInt2766];
		@Pc(14) int[] local14 = new int[anInt2766];
		for (@Pc(16) int local16 = -5; local16 < anInt2777; local16++) {
			@Pc(21) int local21 = local16 + 5;
			@Pc(25) int local25 = local16 - 5;
			@Pc(41) int local41;
			for (@Pc(27) int local27 = 0; local27 < anInt2766; local27++) {
				@Pc(49) Class11 local49;
				@Pc(85) int local85;
				if (local21 < anInt2777) {
					local41 = arg0[local21 + local27 * anInt2777] & 0xFF;
					if (local41 > 0) {
						local49 = Static209.method3853(local41 - 1);
						local2[local27] += local49.anInt312;
						local5[local27] += local49.anInt316;
						local8[local27] += local49.anInt307;
						local11[local27] += local49.anInt310;
						local85 = local14[local27]++;
					}
				}
				if (local25 >= 0) {
					local41 = arg0[local25 + local27 * anInt2777] & 0xFF;
					if (local41 > 0) {
						local49 = Static209.method3853(local41 - 1);
						local2[local27] -= local49.anInt312;
						local5[local27] -= local49.anInt316;
						local8[local27] -= local49.anInt307;
						local11[local27] -= local49.anInt310;
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
				for (@Pc(165) int local165 = -5; local165 < anInt2766; local165++) {
					@Pc(170) int local170 = local165 + 5;
					if (local170 < anInt2766) {
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
						if ((arg0[local16 + local165 * anInt2777] & 0xFF) == 0) {
							local259 = local16 + local165 * anInt2777;
							arg1[local259] = 0;
							arg2[local259] = 0;
						} else {
							local259 = local161 == 0 ? 0 : Static135.method694(local159 / local163, local41 * 256 / local161, local157 / local163);
							@Pc(292) int local292 = (local259 & 0x7F) + arg4;
							if (local292 < 0) {
								local292 = 0;
							} else if (local292 > 127) {
								local292 = 127;
							}
							@Pc(314) int local314 = (local259 + arg3 & 0xFC00) + (local259 & 0x380) + local292;
							@Pc(320) int local320 = local16 + local165 * anInt2777;
							@Pc(331) int local331 = Static230.anIntArray424[Static162.method2852(Static293.method5037(local314)) & 0xFFFF];
							arg1[local320] = (byte) (local331 >> 16 & 0xFF);
							arg2[local320] = (short) (local331 & 0xFFFF);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!ea;)V")
	public static void method2550(@OriginalArg(0) Class55 arg0) {
		@Pc(3) int local3 = anInt2775 - anInt2771;
		@Pc(7) int local7 = anInt2770 - anInt2769;
		@Pc(15) int local15 = (anInt2768 - anInt2767 << 16) / local3;
		@Pc(23) int local23 = (anInt2774 - anInt2773 << 16) / local7;
		method2551(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!ea;IIII)V")
	private static void method2551(@OriginalArg(0) Class55 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = anInt2775 - anInt2771;
		@Pc(7) int local7 = anInt2770 - anInt2769;
		if (anInt2775 < anInt2777) {
			local3++;
		}
		if (anInt2770 < anInt2766) {
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
			local28 = (arg1 * local17 >> 16) + anInt2767;
			local40 = (arg1 * (local17 + 1) >> 16) + anInt2767;
			local44 = local40 - local28;
			if (local44 > 0) {
				local50 = anInt2771 + local17;
				if (local50 >= 0 && local50 < anInt2777) {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt2774 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt2774 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (local84 > 0) {
							local93 = local57 + anInt2769;
							local172 = local50 + local93 * anInt2777;
							local174 = 0;
							local176 = 0;
							local178 = 0;
							if (local93 >= 0 && local93 < anInt2766) {
								local174 = (aByteArray33[local172] & 0xFF) << 16 | aShortArray26[local172] & 0xFFFF;
								if (local174 != 0) {
									local174 |= 0xFF000000;
								}
								local176 = aByteArray34[local172] & 0xFF;
								local178 = aShortArray27[local172] & 0xFFFF;
							}
							if (local174 == 0 && local176 == 0 && local178 == 0) {
								if (aClass5_Sub1_Sub6_2.anInt1933 != -1) {
									local174 = aClass5_Sub1_Sub6_2.anInt1933 | 0xFF000000;
								} else if ((local17 + anInt2771 & 0x4) == (local57 + anInt2770 & 0x4)) {
									local174 = anIntArray267[Static242.anInt4870 + 1];
								} else {
									local174 = -11840664;
								}
								if (local174 == 0) {
									local174 = -16777216;
								}
								arg0.method5205(local28, local70, local44, local84, local174, 0);
							} else if (local178 <= 0) {
								method2563(arg0, local28, local70, local44, local84, local174, local176, aByteArray31[local172], null, null, true);
							} else if (local178 == 65535) {
								@Pc(280) Class5_Sub11 local280 = (Class5_Sub11) aClass190_15.method5466((long) (local50 << 16 | local93));
								if (local280 != null) {
									method2563(arg0, local28, local70, local44, local84, local174, local176, aByteArray31[local172], local280.aShortArray10, local280.aByteArray10, true);
								}
							} else {
								aShortArray25[0] = (short) (local178 - 1);
								aByteArray30[0] = aByteArray32[local172];
								method2563(arg0, local28, local70, local44, local84, local174, local176, aByteArray31[local172], aShortArray25, aByteArray30, true);
							}
						}
					}
				} else {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt2774 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt2774 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (aClass5_Sub1_Sub6_2.anInt1933 != -1) {
							local93 = aClass5_Sub1_Sub6_2.anInt1933 | 0xFF000000;
						} else if ((local17 + anInt2771 & 0x4) == (local57 + anInt2770 & 0x4)) {
							local93 = anIntArray267[Static242.anInt4870 + 1];
						} else {
							local93 = -11840664;
						}
						if (local93 == 0) {
							local93 = -16777216;
						}
						arg0.method5205(local28, local70, local44, local84, local93, 0);
					}
				}
			}
		}
		for (local28 = -16; local28 < local3 + 16; local28++) {
			local40 = (arg1 * local28 >> 16) + anInt2767;
			local44 = (arg1 * (local28 + 1) >> 16) + anInt2767;
			local50 = local44 - local40;
			if (local50 > 0) {
				local57 = local28 + anInt2771;
				if (local57 >= 0 && local57 < anInt2777) {
					for (local70 = -16; local70 < local7 + 16; local70++) {
						local80 = anInt2774 - (arg2 * (local70 + 1) >> 16);
						local84 = anInt2774 - (arg2 * local70 >> 16);
						local93 = local84 - local80;
						if (local93 > 0) {
							local172 = local70 + anInt2769;
							if (local172 >= 0 && local172 < anInt2766) {
								local174 = aShortArray27[local57 + local172 * anInt2777] & 0xFFFF;
								if (local174 <= 0) {
									method2543(arg0, local40, local80, local50, local93, null, null);
								} else if (local174 == 65535) {
									@Pc(457) Class5_Sub11 local457 = (Class5_Sub11) aClass190_15.method5466((long) (local57 << 16 | local172));
									if (local457 != null) {
										method2543(arg0, local40, local80, local50, local93, local457.aShortArray10, local457.aByteArray10);
									}
								} else {
									aShortArray25[0] = (short) (local174 - 1);
									aByteArray30[0] = aByteArray32[local57 + local172 * anInt2777];
									method2543(arg0, local40, local80, local50, local93, aShortArray25, aByteArray30);
								}
							}
						}
					}
				}
			}
		}
		local40 = anInt2771 >> 6;
		local44 = anInt2769 >> 6;
		if (local40 < 0) {
			local40 = 0;
		}
		if (local44 < 0) {
			local44 = 0;
		}
		local50 = anInt2775 >> 6;
		local57 = anInt2770 >> 6;
		if (local50 >= aClass39ArrayArrayArray2[0].length) {
			local50 = aClass39ArrayArrayArray2[0].length - 1;
		}
		if (local57 >= aClass39ArrayArrayArray2[0][0].length) {
			local57 = aClass39ArrayArrayArray2[0][0].length - 1;
		}
		for (local70 = 0; local70 < 3; local70++) {
			@Pc(639) int local639;
			@Pc(651) int local651;
			@Pc(663) int local663;
			@Pc(673) int local673;
			@Pc(629) int local629;
			for (local80 = local40; local80 <= local50; local80++) {
				for (local84 = local44; local84 <= local57; local84++) {
					@Pc(587) Class39 local587 = aClass39ArrayArrayArray2[local70][local80][local84];
					if (local587 != null) {
						local172 = (local80 + (anInt2776 >> 6)) * 64;
						local174 = (local84 + (anInt2772 >> 6)) * 64;
						for (@Pc(610) Class32_Sub5 local610 = (Class32_Sub5) local587.method806(); local610 != null; local610 = (Class32_Sub5) local587.method808()) {
							local178 = local172 + local610.aByte36 - anInt2776 - anInt2771;
							local629 = local174 + local610.aByte35 - anInt2772 - anInt2769;
							local639 = (arg1 * local178 >> 16) + anInt2767;
							local651 = (arg1 * (local178 + 1) >> 16) + anInt2767;
							local663 = anInt2774 - (arg2 * (local629 + 1) >> 16);
							local673 = anInt2774 - (arg2 * local629 >> 16);
							method2563(arg0, local639, local663, local651 - local639, local673 - local663, local610.anInt4698, local610.aByte33 & 0xFF, local610.aByte34, local610.aShortArray72, local610.aByteArray65, false);
						}
					}
				}
			}
			for (local84 = local40; local84 <= local50; local84++) {
				for (local93 = local44; local93 <= local57; local93++) {
					@Pc(725) Class39 local725 = aClass39ArrayArrayArray2[local70][local84][local93];
					if (local725 != null) {
						local174 = (local84 + (anInt2776 >> 6)) * 64;
						local176 = (local93 + (anInt2772 >> 6)) * 64;
						for (@Pc(748) Class32_Sub5 local748 = (Class32_Sub5) local725.method806(); local748 != null; local748 = (Class32_Sub5) local725.method808()) {
							local629 = local174 + local748.aByte36 - anInt2776 - anInt2771;
							local639 = local176 + local748.aByte35 - anInt2772 - anInt2769;
							local651 = (arg1 * local629 >> 16) + anInt2767;
							local663 = (arg1 * (local629 + 1) >> 16) + anInt2767;
							local673 = anInt2774 - (arg2 * (local639 + 1) >> 16);
							@Pc(811) int local811 = anInt2774 - (arg2 * local639 >> 16);
							method2543(arg0, local651, local673, local663 - local651, local811 - local673, local748.aShortArray72, local748.aByteArray65);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!ea;Lclient!rg;IIII[I[I)V")
	private static void method2552(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Class5_Sub12 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		@Pc(3) int local3 = arg1.method5115();
		if ((local3 & 0x1) == 0) {
			@Pc(15) boolean local15 = (local3 & 0x2) == 0;
			@Pc(21) int local21 = local3 >> 2 & 0x3F;
			if (local21 != 62) {
				if (local21 == 63) {
					local21 = arg1.method5115();
				} else if (local15) {
					local21 = arg6[local21];
				} else {
					local21 = arg7[local21];
				}
				if (local15) {
					aByteArray35[arg4 + arg5 * anInt2777] = (byte) local21;
					aByteArray34[arg4 + arg5 * anInt2777] = 0;
				} else {
					aByteArray34[arg4 + arg5 * anInt2777] = (byte) local21;
					aByteArray31[arg4 + arg5 * anInt2777] = 0;
					aByteArray35[arg4 + arg5 * anInt2777] = arg1.method5098();
				}
			}
			return;
		}
		@Pc(100) int local100 = (local3 >> 1 & 0x3) + 1;
		@Pc(108) boolean local108 = (local3 & 0x8) != 0;
		@Pc(116) boolean local116 = (local3 & 0x10) != 0;
		for (@Pc(118) int local118 = 0; local118 < local100; local118++) {
			@Pc(123) int local123 = arg1.method5115();
			@Pc(125) int local125 = 0;
			@Pc(127) int local127 = 0;
			if (local108) {
				local125 = arg1.method5115();
				local127 = arg1.method5115();
			}
			@Pc(139) int local139 = 0;
			if (local116) {
				local139 = arg1.method5115();
			}
			@Pc(215) short[] local215;
			@Pc(218) byte[] local218;
			@Pc(220) int local220;
			if (local118 == 0) {
				aByteArray35[arg4 + arg5 * anInt2777] = (byte) local123;
				aByteArray34[arg4 + arg5 * anInt2777] = (byte) local125;
				aByteArray31[arg4 + arg5 * anInt2777] = (byte) local127;
				if (local139 == 1) {
					aShortArray27[arg4 + arg5 * anInt2777] = (short) (arg1.method5106() + 1);
					aByteArray32[arg4 + arg5 * anInt2777] = arg1.method5098();
				} else if (local139 > 1) {
					aShortArray27[arg4 + arg5 * anInt2777] = -1;
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method5106();
						local218[local220] = arg1.method5098();
					}
					aClass190_15.method5464(new Class5_Sub11(local215, local218), (long) (arg4 << 16 | arg5));
				}
			} else {
				local215 = null;
				local218 = null;
				if (local139 > 0) {
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method5106();
						local218[local220] = arg1.method5098();
					}
				}
				if (aClass39ArrayArrayArray2[local118 - 1][arg2 - (anInt2776 >> 6)][arg3 - (anInt2772 >> 6)] == null) {
					aClass39ArrayArrayArray2[local118 - 1][arg2 - (anInt2776 >> 6)][arg3 - (anInt2772 >> 6)] = new Class39();
				}
				@Pc(338) Class32_Sub5 local338 = new Class32_Sub5(arg4 & 0x3F, arg5 & 0x3F, local123, local125, local127, local215, local218);
				aClass39ArrayArrayArray2[local118 - 1][arg2 - (anInt2776 >> 6)][arg3 - (anInt2772 >> 6)].method809(local338);
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(Lclient!ea;)Lclient!jm;")
	public static Class103 method2554(@OriginalArg(0) Class55 arg0) {
		@Pc(3) int local3 = anInt2775 - anInt2771;
		@Pc(7) int local7 = anInt2770 - anInt2769;
		@Pc(15) int local15 = (anInt2768 - anInt2767 << 16) / local3;
		@Pc(23) int local23 = (anInt2774 - anInt2773 << 16) / local7;
		return method2557(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "()V")
	private static void method2555() {
		@Pc(4) int local4;
		@Pc(15) int local15;
		@Pc(48) int local48;
		for (@Pc(1) int local1 = 0; local1 < anInt2777; local1++) {
			for (local4 = 0; local4 < anInt2766; local4++) {
				local15 = aShortArray27[local1 + local4 * anInt2777] & 0xFFFF;
				if (local15 != 0) {
					@Pc(35) int local35;
					if (local15 == 65535) {
						@Pc(31) Class5_Sub11 local31 = (Class5_Sub11) aClass190_15.method5466((long) (local1 << 16 | local4));
						if (local31 != null) {
							for (local35 = 0; local35 < local31.aShortArray10.length; local35++) {
								@Pc(45) Class156 local45 = Static111.method1967(local31.aShortArray10[local35] & 0xFFFF);
								local48 = local45.anInt4753;
								if (local45.anIntArray437 != null) {
									local45 = local45.method4232();
									if (local45 != null) {
										local48 = local45.anInt4753;
									}
								}
								if (local48 != -1) {
									@Pc(68) Class5_Sub32 local68 = new Class5_Sub32(local48);
									local68.anInt5145 = local1;
									local68.anInt5143 = local4;
									aClass103_69.method2745(local68);
								}
							}
						}
					} else {
						@Pc(91) Class156 local91 = Static111.method1967(local15 - 1);
						local35 = local91.anInt4753;
						if (local91.anIntArray437 != null) {
							local91 = local91.method4232();
							if (local91 != null) {
								local35 = local91.anInt4753;
							}
						}
						if (local35 != -1) {
							@Pc(114) Class5_Sub32 local114 = new Class5_Sub32(local35);
							local114.anInt5145 = local1;
							local114.anInt5143 = local4;
							aClass103_69.method2745(local114);
						}
					}
				}
			}
		}
		for (local4 = 0; local4 < 3; local4++) {
			for (local15 = 0; local15 < aClass39ArrayArrayArray2[0].length; local15++) {
				for (@Pc(140) int local140 = 0; local140 < aClass39ArrayArrayArray2[0][0].length; local140++) {
					@Pc(149) Class39 local149 = aClass39ArrayArrayArray2[local4][local15][local140];
					if (local149 != null) {
						for (@Pc(156) Class32_Sub5 local156 = (Class32_Sub5) local149.method806(); local156 != null; local156 = (Class32_Sub5) local149.method808()) {
							if (local156.aShortArray72 != null) {
								for (local48 = 0; local48 < local156.aShortArray72.length; local48++) {
									@Pc(172) Class156 local172 = Static111.method1967(local156.aShortArray72[local48] & 0xFFFF);
									@Pc(175) int local175 = local172.anInt4753;
									if (local172.anIntArray437 != null) {
										local172 = local172.method4232();
										if (local172 != null) {
											local175 = local172.anInt4753;
										}
									}
									if (local175 != -1) {
										@Pc(195) Class5_Sub32 local195 = new Class5_Sub32(local175);
										local195.anInt5145 = (local15 + (anInt2776 >> 6)) * 64 + local156.aByte36 - anInt2776;
										local195.anInt5143 = (local140 + (anInt2772 >> 6)) * 64 + local156.aByte35 - anInt2772;
										aClass103_69.method2745(local195);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(II)Lclient!ge;")
	public static Class5_Sub1_Sub6 method2556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class5_Sub1_Sub6 local4 = (Class5_Sub1_Sub6) aClass190_14.method5471(); local4 != null; local4 = (Class5_Sub1_Sub6) aClass190_14.method5465()) {
			if (local4.aBoolean143 && local4.method1826(arg1, arg0)) {
				return local4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(Lclient!ea;IIII)Lclient!jm;")
	private static Class103 method2557(@OriginalArg(0) Class55 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(4) Class5_Sub32 local4 = (Class5_Sub32) aClass103_69.method2756(); local4 != null; local4 = (Class5_Sub32) aClass103_69.method2748()) {
			method2558(arg0, local4, arg1, arg2);
		}
		return aClass103_69;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!ea;Lclient!qg;IIII)V")
	private static void method2558(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Class5_Sub32 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1.anInt5144 = anInt2767 + (arg2 * (arg1.anInt5145 - anInt2771) >> 16);
		arg1.anInt5149 = anInt2774 - (arg3 * (arg1.anInt5143 - anInt2769) >> 16);
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "()V")
	public static void method2559() {
		aByteArray35 = new byte[anInt2777 * anInt2766];
		aByteArray34 = new byte[anInt2777 * anInt2766];
		aByteArray31 = new byte[anInt2777 * anInt2766];
		aShortArray27 = new short[anInt2777 * anInt2766];
		aByteArray32 = new byte[anInt2777 * anInt2766];
		aClass190_15 = new Class190(1024);
		aClass39ArrayArrayArray2 = new Class39[3][anInt2777 >> 6][anInt2766 >> 6];
		anIntArray267 = new int[Static216.anInt4317 + 1];
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt2771 = arg0 - anInt2776;
		anInt2770 = arg1 - anInt2772;
		anInt2775 = arg2 - anInt2776;
		anInt2769 = arg3 - anInt2772;
		anInt2767 = arg4;
		anInt2773 = arg5;
		anInt2768 = arg6;
		anInt2774 = arg7;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
	public static void method2561(@OriginalArg(0) int arg0) {
		aClass5_Sub1_Sub6_2 = (Class5_Sub1_Sub6) aClass190_14.method5466((long) arg0);
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "()V")
	public static void method2562() {
		@Pc(2) int[] local2 = new int[3];
		for (@Pc(4) int local4 = 0; local4 < aClass64_2.anInt1473; local4++) {
			@Pc(32) boolean local32 = aClass5_Sub1_Sub6_2.method1829(aClass64_2.anIntArray122[local4] >> 28 & 0x3, aClass64_2.anIntArray122[local4] >> 14 & 0x3FFF, aClass64_2.anIntArray122[local4] & 0x3FFF, local2);
			if (local32) {
				@Pc(42) Class5_Sub32 local42 = new Class5_Sub32(aClass64_2.anIntArray123[local4]);
				local42.anInt5145 = local2[1] - anInt2776;
				local42.anInt5143 = local2[2] - anInt2772;
				aClass103_69.method2745(local42);
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!ea;IIIIIII[S[BZ)V")
	private static void method2563(@OriginalArg(0) Class55 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) boolean arg10) {
		@Pc(20) int local20;
		@Pc(32) int local32;
		if (arg10 || arg5 != 0 || arg6 > 0) {
			if (arg6 == 0) {
				arg0.method5205(arg1, arg2, arg3, arg4, arg5, 0);
			} else {
				local20 = arg7 & 0x3F;
				if (local20 == 0 || arg3 <= 1 || arg4 <= 1) {
					local32 = anIntArray267[arg6];
					if (arg10 || local32 != 0) {
						arg0.method5205(arg1, arg2, arg3, arg4, local32, 0);
					}
				} else {
					local32 = arg10 ? 0 : 1;
					Static196.method3473(arg4, arg7 >> 6 & 0x3, arg2, local20, anInt2764, arg5, arg1, aByteArrayArrayArray6, local32, arg0, arg3, anIntArray267[arg6]);
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
				@Pc(126) Class156 local126 = Static111.method1967(arg8[local100] & 0xFFFF);
				if (local126.anInt4766 == -1) {
					@Pc(132) int local132 = -3355444;
					if (local126.anInt4756 == 1) {
						local132 = -3407872;
					}
					@Pc(146) int local146 = arg9[local100] >> 6 & 0x3;
					if (local107 == 0) {
						if (local146 == 0) {
							arg0.method5192(arg1, arg2, arg4, local132, 0);
						} else if (local146 == 1) {
							arg0.method5176(arg1, arg2, arg3, local132, 0);
						} else if (local146 == 2) {
							arg0.method5192(local20, arg2, arg4, local132, 0);
						} else {
							arg0.method5176(arg1, local32, arg3, local132, 0);
						}
					} else if (local107 == 2) {
						if (local146 == 0) {
							arg0.method5192(arg1, arg2, arg4, -1, 0);
							arg0.method5176(arg1, arg2, arg3, local132, 0);
						} else if (local146 == 1) {
							arg0.method5192(local20, arg2, arg4, -1, 0);
							arg0.method5176(arg1, arg2, arg3, local132, 0);
						} else if (local146 == 2) {
							arg0.method5192(local20, arg2, arg4, -1, 0);
							arg0.method5176(arg1, local32, arg3, local132, 0);
						} else {
							arg0.method5192(arg1, arg2, arg4, -1, 0);
							arg0.method5176(arg1, local32, arg3, local132, 0);
						}
					} else if (local107 == 3) {
						if (local146 == 0) {
							arg0.method5176(arg1, arg2, 1, local132, 0);
						} else if (local146 == 1) {
							arg0.method5176(local20, arg2, 1, local132, 0);
						} else if (local146 == 2) {
							arg0.method5176(local20, local32, 1, local132, 0);
						} else {
							arg0.method5176(arg1, local32, 1, local132, 0);
						}
					} else if (local107 == 9) {
						@Pc(312) int local312;
						if (local146 == 0 || local146 == 2) {
							for (local312 = 0; local312 < arg4; local312++) {
								arg0.method5176(arg1 + local312, local32 - local312, 1, local132, 0);
							}
						} else {
							for (local312 = 0; local312 < arg4; local312++) {
								arg0.method5176(arg1 + local312, arg2 + local312, 1, local132, 0);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "e", descriptor = "()V")
	public static void method2564() {
		aByteArray35 = null;
		aByteArray33 = null;
		aShortArray26 = null;
		aByteArray34 = null;
		aByteArray31 = null;
		aShortArray27 = null;
		aByteArray32 = null;
		aClass190_15 = null;
		aClass39ArrayArrayArray2 = null;
		anIntArray267 = null;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!gf;III)I")
	private static int method2565(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class9 local3 = Static355.method6032(arg1);
		if (local3 == null) {
			return 0;
		}
		@Pc(10) int local10 = local3.anInt202;
		if (local10 >= 0 && arg0.method1511(local10).aBoolean540) {
			local10 = -1;
		}
		@Pc(67) int local67;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(54) int local54;
		if (local3.anInt205 >= 0) {
			local26 = local3.anInt205;
			local32 = (local26 & 0x7F) + arg3;
			if (local32 < 0) {
				local32 = 0;
			} else if (local32 > 127) {
				local32 = 127;
			}
			local54 = (local26 + arg2 & 0xFC00) + (local26 & 0x380) + local32;
			local67 = Static230.anIntArray424[Static162.method2852(Static199.method3519(local54)) & 0xFFFF] | 0xFF000000;
		} else if (local10 >= 0) {
			local67 = Static230.anIntArray424[Static162.method2852(Static199.method3519(arg0.method1511(local10).aShort84)) & 0xFFFF] | 0xFF000000;
		} else if (local3.anInt200 == -1) {
			local67 = 0;
		} else {
			local26 = local3.anInt200;
			local32 = (local26 & 0x7F) + arg3;
			if (local32 < 0) {
				local32 = 0;
			} else if (local32 > 127) {
				local32 = 127;
			}
			local54 = (local26 + arg2 & 0xFC00) + (local26 & 0x380) + local32;
			local67 = Static230.anIntArray424[Static162.method2852(Static199.method3519(local54)) & 0xFFFF] | 0xFF000000;
		}
		return local67;
	}
}
