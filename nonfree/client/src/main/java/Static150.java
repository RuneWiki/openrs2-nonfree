import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "Lclient!ln;")
	public static Class1_Sub2_Sub8 aClass1_Sub2_Sub8_2;

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "Lclient!lm;")
	public static Class134 aClass134_63;

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "F")
	public static float aFloat19;

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "Lclient!le;")
	public static Class129 aClass129_3;

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "F")
	public static float aFloat20;

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
	public static int anInt2632;

	@OriginalMember(owner = "client!kf", name = "n", descriptor = "[B")
	private static byte[] aByteArray31;

	@OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
	public static int anInt2633;

	@OriginalMember(owner = "client!kf", name = "p", descriptor = "[B")
	private static byte[] aByteArray32;

	@OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
	public static int anInt2634;

	@OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
	public static int anInt2635;

	@OriginalMember(owner = "client!kf", name = "s", descriptor = "[B")
	private static byte[] aByteArray33;

	@OriginalMember(owner = "client!kf", name = "t", descriptor = "I")
	public static int anInt2636;

	@OriginalMember(owner = "client!kf", name = "u", descriptor = "[S")
	private static short[] aShortArray44;

	@OriginalMember(owner = "client!kf", name = "v", descriptor = "[B")
	private static byte[] aByteArray34;

	@OriginalMember(owner = "client!kf", name = "w", descriptor = "[B")
	private static byte[] aByteArray35;

	@OriginalMember(owner = "client!kf", name = "x", descriptor = "I")
	public static int anInt2637;

	@OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
	public static int anInt2638;

	@OriginalMember(owner = "client!kf", name = "z", descriptor = "Lclient!vk;")
	private static Class207 aClass207_20;

	@OriginalMember(owner = "client!kf", name = "A", descriptor = "I")
	public static int anInt2639;

	@OriginalMember(owner = "client!kf", name = "B", descriptor = "I")
	public static int anInt2640;

	@OriginalMember(owner = "client!kf", name = "C", descriptor = "I")
	public static int anInt2641;

	@OriginalMember(owner = "client!kf", name = "D", descriptor = "I")
	public static int anInt2642;

	@OriginalMember(owner = "client!kf", name = "E", descriptor = "[[[Lclient!ke;")
	private static Class122[][][] aClass122ArrayArrayArray2;

	@OriginalMember(owner = "client!kf", name = "F", descriptor = "[S")
	private static short[] aShortArray45;

	@OriginalMember(owner = "client!kf", name = "G", descriptor = "I")
	public static int anInt2643;

	@OriginalMember(owner = "client!kf", name = "H", descriptor = "I")
	public static int anInt2644;

	@OriginalMember(owner = "client!kf", name = "I", descriptor = "[I")
	private static int[] anIntArray268;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "Lclient!vk;")
	private static final Class207 aClass207_19 = new Class207(16);

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "[B")
	private static final byte[] aByteArray30 = new byte[1];

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "Lclient!ar;")
	public static final Class14 aClass14_10 = new Class14();

	@OriginalMember(owner = "client!kf", name = "i", descriptor = "[S")
	private static final short[] aShortArray43 = new short[1];

	@OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
	public static int anInt2630 = (int) (Math.random() * 11.0D) - 5;

	@OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
	public static int anInt2631 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!ii;IIII[S[B)V")
	private static void method2243(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		if (arg5 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < arg5.length; local4++) {
			@Pc(13) Class79 local13 = Static129.method2097(arg5[local4] & 0xFFFF);
			@Pc(16) int local16 = local13.lb;
			if (local16 != -1) {
				@Pc(23) Class69 local23 = Static307.method5320(local16);
				@Pc(47) Class8 local47 = local23.method1396(local13.aBoolean141 ? local13.aBoolean139 : false, arg0, local13.aBoolean149 ? arg6[local4] >> 6 & 0x3 : 0);
				if (local47 != null) {
					@Pc(56) int local56 = arg3 * local47.method4381() >> 2;
					@Pc(63) int local63 = arg4 * local47.method4395() >> 2;
					if (local23.aBoolean116) {
						@Pc(69) int local69 = local13.anInt1884;
						@Pc(72) int local72 = local13.anInt1897;
						if ((arg6[local4] >> 6 & 0x1) == 1) {
							@Pc(83) int local83 = local69;
							local69 = local72;
							local72 = local83;
						}
						local56 = local69 * arg3;
						local63 = local72 * arg4;
					}
					if (local56 != 0 && local63 != 0) {
						if (local23.anInt1653 == 0) {
							local47.method4390(arg1, arg2 + arg4 - local63, local56, local63);
						} else {
							local47.method4391(arg1, arg2 + arg4 - local63, local56, local63, 1, local23.anInt1653 | 0xFF000000, 1);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "([B[B[SII)V")
	private static void method2244(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int[] local2 = new int[anInt2636];
		@Pc(5) int[] local5 = new int[anInt2636];
		@Pc(8) int[] local8 = new int[anInt2636];
		@Pc(11) int[] local11 = new int[anInt2636];
		@Pc(14) int[] local14 = new int[anInt2636];
		for (@Pc(16) int local16 = -5; local16 < anInt2639; local16++) {
			@Pc(21) int local21 = local16 + 5;
			@Pc(25) int local25 = local16 - 5;
			@Pc(41) int local41;
			for (@Pc(27) int local27 = 0; local27 < anInt2636; local27++) {
				@Pc(49) Class107 local49;
				@Pc(85) int local85;
				if (local21 < anInt2639) {
					local41 = arg0[local21 + local27 * anInt2639] & 0xFF;
					if (local41 > 0) {
						local49 = Static1.method14(local41 - 1);
						local2[local27] += local49.anInt2595;
						local5[local27] += local49.anInt2597;
						local8[local27] += local49.anInt2606;
						local11[local27] += local49.anInt2600;
						local85 = local14[local27]++;
					}
				}
				if (local25 >= 0) {
					local41 = arg0[local25 + local27 * anInt2639] & 0xFF;
					if (local41 > 0) {
						local49 = Static1.method14(local41 - 1);
						local2[local27] -= local49.anInt2595;
						local5[local27] -= local49.anInt2597;
						local8[local27] -= local49.anInt2606;
						local11[local27] -= local49.anInt2600;
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
				for (@Pc(165) int local165 = -5; local165 < anInt2636; local165++) {
					@Pc(170) int local170 = local165 + 5;
					if (local170 < anInt2636) {
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
						if ((arg0[local16 + local165 * anInt2639] & 0xFF) == 0) {
							local259 = local16 + local165 * anInt2639;
							arg1[local259] = 0;
							arg2[local259] = 0;
						} else {
							local259 = local161 == 0 ? 0 : Static24.method406(local41 * 256 / local161, local157 / local163, local159 / local163);
							@Pc(292) int local292 = (local259 & 0x7F) + arg4;
							if (local292 < 0) {
								local292 = 0;
							} else if (local292 > 127) {
								local292 = 127;
							}
							@Pc(314) int local314 = (local259 + arg3 & 0xFC00) + (local259 & 0x380) + local292;
							@Pc(320) int local320 = local16 + local165 * anInt2639;
							@Pc(331) int local331 = Static94.anIntArray150[Static173.method3114(Static245.method823(local314)) & 0xFFFF];
							arg1[local320] = (byte) (local331 >> 16 & 0xFF);
							arg2[local320] = (short) (local331 & 0xFFFF);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!lm;)V")
	public static void method2245(@OriginalArg(0) Class134 arg0) {
		aClass134_63 = arg0;
		aClass207_19.method5562();
		@Pc(9) int local9 = aClass134_63.method3018("details");
		@Pc(14) int[] local14 = aClass134_63.method3001(local9);
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(25) Class1_Sub2_Sub8 local25 = Static182.method3230(local9, aClass134_63, local14[local16]);
			aClass207_19.method5552(local25, (long) local25.anInt3611);
		}
		Static91.method1443(false);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!ii;II)V")
	public static void method2246(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class1_Sub21 local9 = new Class1_Sub21(aClass134_63.method3029("area", aClass1_Sub2_Sub8_2.aString131));
		@Pc(13) int local13 = local9.method5720();
		@Pc(16) int[] local16 = new int[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			local16[local18] = local9.method5720();
		}
		@Pc(33) int local33 = local9.method5720();
		@Pc(36) int[] local36 = new int[local33];
		for (@Pc(38) int local38 = 0; local38 < local33; local38++) {
			local36[local38] = local9.method5720();
		}
		while (true) {
			@Pc(58) int local58;
			@Pc(64) int local64;
			@Pc(67) int local67;
			@Pc(76) int local76;
			@Pc(148) int local148;
			while (local9.anInt6611 < local9.aByteArray82.length) {
				@Pc(62) int local62;
				@Pc(84) int local84;
				if (local9.method5720() == 0) {
					local58 = local9.method5720();
					local62 = local9.method5720();
					for (local64 = 0; local64 < 64; local64++) {
						for (local67 = 0; local67 < 64; local67++) {
							local76 = local58 * 64 + local64 - anInt2643;
							local84 = local62 * 64 + local67 - anInt2638;
							method2261(arg0, local9, local58, local62, local76, local84, local16, local36);
						}
					}
				} else {
					local58 = local9.method5720();
					local62 = local9.method5720();
					local64 = local9.method5720();
					local67 = local9.method5720();
					for (local76 = 0; local76 < 8; local76++) {
						for (local84 = 0; local84 < 8; local84++) {
							@Pc(136) int local136 = local58 * 64 + local64 * 8 + local76 - anInt2643;
							local148 = local62 * 64 + local67 * 8 + local84 - anInt2638;
							method2261(arg0, local9, local58, local62, local136, local148, local16, local36);
						}
					}
				}
			}
			aByteArray32 = new byte[anInt2639 * anInt2636];
			aShortArray45 = new short[anInt2639 * anInt2636];
			for (local58 = 0; local58 < 3; local58++) {
				@Pc(191) byte[] local191 = new byte[anInt2639 * anInt2636];
				for (local64 = 0; local64 < aClass122ArrayArrayArray2[local58].length; local64++) {
					for (local67 = 0; local67 < aClass122ArrayArrayArray2[local58][0].length; local67++) {
						@Pc(205) Class122 local205 = aClass122ArrayArrayArray2[local58][local64][local67];
						if (local205 != null) {
							for (@Pc(212) Class7_Sub4 local212 = (Class7_Sub4) local205.method2626(); local212 != null; local212 = (Class7_Sub4) local205.method2630()) {
								local191[local64 * 64 + local212.aByte21 + (local67 * 64 + local212.aByte22) * anInt2639] = (byte) local212.anInt1842;
							}
						}
					}
				}
				method2244(local191, aByteArray32, aShortArray45, arg1, arg2);
				for (local67 = 0; local67 < aClass122ArrayArrayArray2[local58].length; local67++) {
					for (local76 = 0; local76 < aClass122ArrayArrayArray2[local58][0].length; local76++) {
						@Pc(276) Class122 local276 = aClass122ArrayArrayArray2[local58][local67][local76];
						if (local276 != null) {
							for (@Pc(283) Class7_Sub4 local283 = (Class7_Sub4) local276.method2626(); local283 != null; local283 = (Class7_Sub4) local276.method2630()) {
								local148 = local67 * 64 + local283.aByte21 + (local76 * 64 + local283.aByte22) * anInt2639;
								local283.anInt1842 = (aByteArray32[local148] & 0xFF) << 16 | aShortArray45[local148] & 0xFFFF;
								if (local283.anInt1842 != 0) {
									local283.anInt1842 |= 0xFF000000;
								}
							}
						}
					}
				}
			}
			method2244(aByteArray34, aByteArray32, aShortArray45, arg1, arg2);
			aByteArray34 = null;
			method2260();
			return;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "()V")
	public static void method2247() {
		aByteArray34 = new byte[anInt2639 * anInt2636];
		aByteArray35 = new byte[anInt2639 * anInt2636];
		aByteArray31 = new byte[anInt2639 * anInt2636];
		aShortArray44 = new short[anInt2639 * anInt2636];
		aByteArray33 = new byte[anInt2639 * anInt2636];
		aClass207_20 = new Class207(1024);
		aClass122ArrayArrayArray2 = new Class122[3][anInt2639 >> 6][anInt2636 >> 6];
		anIntArray268 = new int[Static192.anInt3987 + 1];
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
	public static void method2248(@OriginalArg(0) int arg0) {
		aClass1_Sub2_Sub8_2 = (Class1_Sub2_Sub8) aClass207_19.method5555((long) arg0);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!fh;II)V")
	public static void method2249(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static192.anInt3987; local1++) {
			anIntArray268[local1 + 1] = method2256(arg0, local1, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!ii;Lclient!ni;IIII)V")
	private static void method2251(@OriginalArg(0) Class105 arg0, @OriginalArg(1) Class1_Sub29 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1.anInt4240 = anInt2642 + (arg2 * (arg1.anInt4238 - anInt2644) >> 16);
		arg1.anInt4244 = anInt2641 - (arg3 * (arg1.anInt4245 - anInt2634) >> 16);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!ii;IIII)V")
	private static void method2252(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = anInt2637 - anInt2644;
		@Pc(7) int local7 = anInt2633 - anInt2634;
		if (anInt2637 < anInt2639) {
			local3++;
		}
		if (anInt2633 < anInt2636) {
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
			local28 = (arg1 * local17 >> 16) + anInt2642;
			local40 = (arg1 * (local17 + 1) >> 16) + anInt2642;
			local44 = local40 - local28;
			if (local44 > 0) {
				local50 = anInt2644 + local17;
				if (local50 >= 0 && local50 < anInt2639) {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt2641 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt2641 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (local84 > 0) {
							local93 = local57 + anInt2634;
							local172 = local50 + local93 * anInt2639;
							local174 = 0;
							local176 = 0;
							local178 = 0;
							if (local93 >= 0 && local93 < anInt2636) {
								local174 = (aByteArray32[local172] & 0xFF) << 16 | aShortArray45[local172] & 0xFFFF;
								if (local174 != 0) {
									local174 |= 0xFF000000;
								}
								local176 = aByteArray35[local172] & 0xFF;
								local178 = aShortArray44[local172] & 0xFFFF;
							}
							if (local174 == 0 && local176 == 0 && local178 == 0) {
								if (aClass1_Sub2_Sub8_2.anInt3605 != -1) {
									local174 = aClass1_Sub2_Sub8_2.anInt3605 | 0xFF000000;
								} else if ((local17 + anInt2644 & 0x4) == (local57 + anInt2633 & 0x4)) {
									local174 = anIntArray268[Static159.anInt6380 + 1];
								} else {
									local174 = -11840664;
								}
								if (local174 == 0) {
									local174 = -16777216;
								}
								arg0.method4249(local28, local70, local44, local84, local174, 0);
							} else if (local178 <= 0) {
								method2253(arg0, local28, local70, local44, local84, local174, local176, aByteArray31[local172], null, null, true);
							} else if (local178 == 65535) {
								@Pc(280) Class1_Sub13 local280 = (Class1_Sub13) aClass207_20.method5555((long) (local50 << 16 | local93));
								if (local280 != null) {
									method2253(arg0, local28, local70, local44, local84, local174, local176, aByteArray31[local172], local280.aShortArray3, local280.aByteArray8, true);
								}
							} else {
								aShortArray43[0] = (short) (local178 - 1);
								aByteArray30[0] = aByteArray33[local172];
								method2253(arg0, local28, local70, local44, local84, local174, local176, aByteArray31[local172], aShortArray43, aByteArray30, true);
							}
						}
					}
				} else {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt2641 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt2641 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (aClass1_Sub2_Sub8_2.anInt3605 != -1) {
							local93 = aClass1_Sub2_Sub8_2.anInt3605 | 0xFF000000;
						} else if ((local17 + anInt2644 & 0x4) == (local57 + anInt2633 & 0x4)) {
							local93 = anIntArray268[Static159.anInt6380 + 1];
						} else {
							local93 = -11840664;
						}
						if (local93 == 0) {
							local93 = -16777216;
						}
						arg0.method4249(local28, local70, local44, local84, local93, 0);
					}
				}
			}
		}
		for (local28 = -16; local28 < local3 + 16; local28++) {
			local40 = (arg1 * local28 >> 16) + anInt2642;
			local44 = (arg1 * (local28 + 1) >> 16) + anInt2642;
			local50 = local44 - local40;
			if (local50 > 0) {
				local57 = local28 + anInt2644;
				if (local57 >= 0 && local57 < anInt2639) {
					for (local70 = -16; local70 < local7 + 16; local70++) {
						local80 = anInt2641 - (arg2 * (local70 + 1) >> 16);
						local84 = anInt2641 - (arg2 * local70 >> 16);
						local93 = local84 - local80;
						if (local93 > 0) {
							local172 = local70 + anInt2634;
							if (local172 >= 0 && local172 < anInt2636) {
								local174 = aShortArray44[local57 + local172 * anInt2639] & 0xFFFF;
								if (local174 <= 0) {
									method2243(arg0, local40, local80, local50, local93, null, null);
								} else if (local174 == 65535) {
									@Pc(457) Class1_Sub13 local457 = (Class1_Sub13) aClass207_20.method5555((long) (local57 << 16 | local172));
									if (local457 != null) {
										method2243(arg0, local40, local80, local50, local93, local457.aShortArray3, local457.aByteArray8);
									}
								} else {
									aShortArray43[0] = (short) (local174 - 1);
									aByteArray30[0] = aByteArray33[local57 + local172 * anInt2639];
									method2243(arg0, local40, local80, local50, local93, aShortArray43, aByteArray30);
								}
							}
						}
					}
				}
			}
		}
		local40 = anInt2644 >> 6;
		local44 = anInt2634 >> 6;
		if (local40 < 0) {
			local40 = 0;
		}
		if (local44 < 0) {
			local44 = 0;
		}
		local50 = anInt2637 >> 6;
		local57 = anInt2633 >> 6;
		if (local50 >= aClass122ArrayArrayArray2[0].length) {
			local50 = aClass122ArrayArrayArray2[0].length - 1;
		}
		if (local57 >= aClass122ArrayArrayArray2[0][0].length) {
			local57 = aClass122ArrayArrayArray2[0][0].length - 1;
		}
		for (local70 = 0; local70 < 3; local70++) {
			@Pc(639) int local639;
			@Pc(651) int local651;
			@Pc(663) int local663;
			@Pc(673) int local673;
			@Pc(629) int local629;
			for (local80 = local40; local80 <= local50; local80++) {
				for (local84 = local44; local84 <= local57; local84++) {
					@Pc(587) Class122 local587 = aClass122ArrayArrayArray2[local70][local80][local84];
					if (local587 != null) {
						local172 = (local80 + (anInt2643 >> 6)) * 64;
						local174 = (local84 + (anInt2638 >> 6)) * 64;
						for (@Pc(610) Class7_Sub4 local610 = (Class7_Sub4) local587.method2626(); local610 != null; local610 = (Class7_Sub4) local587.method2630()) {
							local178 = local172 + local610.aByte21 - anInt2643 - anInt2644;
							local629 = local174 + local610.aByte22 - anInt2638 - anInt2634;
							local639 = (arg1 * local178 >> 16) + anInt2642;
							local651 = (arg1 * (local178 + 1) >> 16) + anInt2642;
							local663 = anInt2641 - (arg2 * (local629 + 1) >> 16);
							local673 = anInt2641 - (arg2 * local629 >> 16);
							method2253(arg0, local639, local663, local651 - local639, local673 - local663, local610.anInt1842, local610.aByte23 & 0xFF, local610.aByte24, local610.aShortArray10, local610.aByteArray13, false);
						}
					}
				}
			}
			for (local84 = local40; local84 <= local50; local84++) {
				for (local93 = local44; local93 <= local57; local93++) {
					@Pc(725) Class122 local725 = aClass122ArrayArrayArray2[local70][local84][local93];
					if (local725 != null) {
						local174 = (local84 + (anInt2643 >> 6)) * 64;
						local176 = (local93 + (anInt2638 >> 6)) * 64;
						for (@Pc(748) Class7_Sub4 local748 = (Class7_Sub4) local725.method2626(); local748 != null; local748 = (Class7_Sub4) local725.method2630()) {
							local629 = local174 + local748.aByte21 - anInt2643 - anInt2644;
							local639 = local176 + local748.aByte22 - anInt2638 - anInt2634;
							local651 = (arg1 * local629 >> 16) + anInt2642;
							local663 = (arg1 * (local629 + 1) >> 16) + anInt2642;
							local673 = anInt2641 - (arg2 * (local639 + 1) >> 16);
							@Pc(811) int local811 = anInt2641 - (arg2 * local639 >> 16);
							method2243(arg0, local651, local673, local663 - local651, local811 - local673, local748.aShortArray10, local748.aByteArray13);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!ii;IIIIIII[S[BZ)V")
	private static void method2253(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) boolean arg10) {
		@Pc(20) int local20;
		@Pc(32) int local32;
		if (arg10 || arg5 != 0 || arg6 > 0) {
			if (arg6 == 0) {
				arg0.method4249(arg1, arg2, arg3, arg4, arg5, 0);
			} else {
				local20 = arg7 & 0x3F;
				if (local20 == 0 || arg3 <= 1 || arg4 <= 1) {
					local32 = anIntArray268[arg6];
					if (arg10 || local32 != 0) {
						arg0.method4249(arg1, arg2, arg3, arg4, local32, 0);
					}
				} else {
					local32 = arg10 ? 0 : 1;
					Static311.method5343(arg7 >> 6 & 0x3, anInt2632, anIntArray268[arg6], arg1, arg2, arg0, local32, arg5, local20, arg4, arg3, aByteArrayArrayArray6);
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
				@Pc(126) Class79 local126 = Static129.method2097(arg8[local100] & 0xFFFF);
				if (local126.lb == -1) {
					@Pc(132) int local132 = -3355444;
					if (local126.anInt1863 == 1) {
						local132 = -3407872;
					}
					@Pc(146) int local146 = arg9[local100] >> 6 & 0x3;
					if (local107 == 0) {
						if (local146 == 0) {
							arg0.method4212(arg1, arg2, arg4, local132, 0);
						} else if (local146 == 1) {
							arg0.method4270(arg1, arg2, arg3, local132, 0);
						} else if (local146 == 2) {
							arg0.method4212(local20, arg2, arg4, local132, 0);
						} else {
							arg0.method4270(arg1, local32, arg3, local132, 0);
						}
					} else if (local107 == 2) {
						if (local146 == 0) {
							arg0.method4212(arg1, arg2, arg4, -1, 0);
							arg0.method4270(arg1, arg2, arg3, local132, 0);
						} else if (local146 == 1) {
							arg0.method4212(local20, arg2, arg4, -1, 0);
							arg0.method4270(arg1, arg2, arg3, local132, 0);
						} else if (local146 == 2) {
							arg0.method4212(local20, arg2, arg4, -1, 0);
							arg0.method4270(arg1, local32, arg3, local132, 0);
						} else {
							arg0.method4212(arg1, arg2, arg4, -1, 0);
							arg0.method4270(arg1, local32, arg3, local132, 0);
						}
					} else if (local107 == 3) {
						if (local146 == 0) {
							arg0.method4270(arg1, arg2, 1, local132, 0);
						} else if (local146 == 1) {
							arg0.method4270(local20, arg2, 1, local132, 0);
						} else if (local146 == 2) {
							arg0.method4270(local20, local32, 1, local132, 0);
						} else {
							arg0.method4270(arg1, local32, 1, local132, 0);
						}
					} else if (local107 == 9) {
						@Pc(312) int local312;
						if (local146 == 0 || local146 == 2) {
							for (local312 = 0; local312 < arg4; local312++) {
								arg0.method4270(arg1 + local312, local32 - local312, 1, local132, 0);
							}
						} else {
							for (local312 = 0; local312 < arg4; local312++) {
								arg0.method4270(arg1 + local312, arg2 + local312, 1, local132, 0);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!ii;)V")
	public static void method2254(@OriginalArg(0) Class105 arg0) {
		@Pc(3) int local3 = anInt2637 - anInt2644;
		@Pc(7) int local7 = anInt2633 - anInt2634;
		@Pc(15) int local15 = (anInt2640 - anInt2642 << 16) / local3;
		@Pc(23) int local23 = (anInt2641 - anInt2635 << 16) / local7;
		method2252(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "()V")
	public static void method2255() {
		aByteArray34 = null;
		aByteArray32 = null;
		aShortArray45 = null;
		aByteArray35 = null;
		aByteArray31 = null;
		aShortArray44 = null;
		aByteArray33 = null;
		aClass207_20 = null;
		aClass122ArrayArrayArray2 = null;
		anIntArray268 = null;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!fh;III)I")
	private static int method2256(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class175 local3 = Static338.method5610(arg1);
		if (local3 == null) {
			return 0;
		}
		@Pc(10) int local10 = local3.anInt5275;
		if (local10 >= 0 && arg0.method951(local10).aBoolean217) {
			local10 = -1;
		}
		@Pc(67) int local67;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(54) int local54;
		if (local3.anInt5273 >= 0) {
			local26 = local3.anInt5273;
			local32 = (local26 & 0x7F) + arg3;
			if (local32 < 0) {
				local32 = 0;
			} else if (local32 > 127) {
				local32 = 127;
			}
			local54 = (local26 + arg2 & 0xFC00) + (local26 & 0x380) + local32;
			local67 = Static94.anIntArray150[Static173.method3114(Static189.method5291(local54)) & 0xFFFF] | 0xFF000000;
		} else if (local10 >= 0) {
			local67 = Static94.anIntArray150[Static173.method3114(Static189.method5291(arg0.method951(local10).aShort56)) & 0xFFFF] | 0xFF000000;
		} else if (local3.anInt5263 == -1) {
			local67 = 0;
		} else {
			local26 = local3.anInt5263;
			local32 = (local26 & 0x7F) + arg3;
			if (local32 < 0) {
				local32 = 0;
			} else if (local32 > 127) {
				local32 = 127;
			}
			local54 = (local26 + arg2 & 0xFC00) + (local26 & 0x380) + local32;
			local67 = Static94.anIntArray150[Static173.method3114(Static189.method5291(local54)) & 0xFFFF] | 0xFF000000;
		}
		return local67;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(Lclient!ii;)Lclient!ar;")
	public static Class14 method2257(@OriginalArg(0) Class105 arg0) {
		@Pc(3) int local3 = anInt2637 - anInt2644;
		@Pc(7) int local7 = anInt2633 - anInt2634;
		@Pc(15) int local15 = (anInt2640 - anInt2642 << 16) / local3;
		@Pc(23) int local23 = (anInt2641 - anInt2635 << 16) / local7;
		return method2263(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "()V")
	public static void method2258() {
		@Pc(2) int[] local2 = new int[3];
		for (@Pc(4) int local4 = 0; local4 < aClass129_3.anInt3453; local4++) {
			@Pc(32) boolean local32 = aClass1_Sub2_Sub8_2.method3055(aClass129_3.anIntArray337[local4] >> 14 & 0x3FFF, aClass129_3.anIntArray337[local4] >> 28 & 0x3, aClass129_3.anIntArray337[local4] & 0x3FFF, local2);
			if (local32) {
				@Pc(42) Class1_Sub29 local42 = new Class1_Sub29(aClass129_3.anIntArray336[local4]);
				local42.anInt4238 = local2[1] - anInt2643;
				local42.anInt4245 = local2[2] - anInt2638;
				aClass14_10.method300(local42);
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)Lclient!ln;")
	public static Class1_Sub2_Sub8 method2259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class1_Sub2_Sub8 local4 = (Class1_Sub2_Sub8) aClass207_19.method5560(); local4 != null; local4 = (Class1_Sub2_Sub8) aClass207_19.method5559()) {
			if (local4.aBoolean275 && local4.method3053(arg0, arg1)) {
				return local4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "()V")
	private static void method2260() {
		@Pc(4) int local4;
		@Pc(15) int local15;
		@Pc(48) int local48;
		for (@Pc(1) int local1 = 0; local1 < anInt2639; local1++) {
			for (local4 = 0; local4 < anInt2636; local4++) {
				local15 = aShortArray44[local1 + local4 * anInt2639] & 0xFFFF;
				if (local15 != 0) {
					@Pc(35) int local35;
					if (local15 == 65535) {
						@Pc(31) Class1_Sub13 local31 = (Class1_Sub13) aClass207_20.method5555((long) (local1 << 16 | local4));
						if (local31 != null) {
							for (local35 = 0; local35 < local31.aShortArray3.length; local35++) {
								@Pc(45) Class79 local45 = Static129.method2097(local31.aShortArray3[local35] & 0xFFFF);
								local48 = local45.anInt1895;
								if (local45.anIntArray161 != null) {
									local45 = local45.method1567();
									if (local45 != null) {
										local48 = local45.anInt1895;
									}
								}
								if (local48 != -1) {
									@Pc(68) Class1_Sub29 local68 = new Class1_Sub29(local48);
									local68.anInt4238 = local1;
									local68.anInt4245 = local4;
									aClass14_10.method300(local68);
								}
							}
						}
					} else {
						@Pc(91) Class79 local91 = Static129.method2097(local15 - 1);
						local35 = local91.anInt1895;
						if (local91.anIntArray161 != null) {
							local91 = local91.method1567();
							if (local91 != null) {
								local35 = local91.anInt1895;
							}
						}
						if (local35 != -1) {
							@Pc(114) Class1_Sub29 local114 = new Class1_Sub29(local35);
							local114.anInt4238 = local1;
							local114.anInt4245 = local4;
							aClass14_10.method300(local114);
						}
					}
				}
			}
		}
		for (local4 = 0; local4 < 3; local4++) {
			for (local15 = 0; local15 < aClass122ArrayArrayArray2[0].length; local15++) {
				for (@Pc(140) int local140 = 0; local140 < aClass122ArrayArrayArray2[0][0].length; local140++) {
					@Pc(149) Class122 local149 = aClass122ArrayArrayArray2[local4][local15][local140];
					if (local149 != null) {
						for (@Pc(156) Class7_Sub4 local156 = (Class7_Sub4) local149.method2626(); local156 != null; local156 = (Class7_Sub4) local149.method2630()) {
							if (local156.aShortArray10 != null) {
								for (local48 = 0; local48 < local156.aShortArray10.length; local48++) {
									@Pc(172) Class79 local172 = Static129.method2097(local156.aShortArray10[local48] & 0xFFFF);
									@Pc(175) int local175 = local172.anInt1895;
									if (local172.anIntArray161 != null) {
										local172 = local172.method1567();
										if (local172 != null) {
											local175 = local172.anInt1895;
										}
									}
									if (local175 != -1) {
										@Pc(195) Class1_Sub29 local195 = new Class1_Sub29(local175);
										local195.anInt4238 = (local15 + (anInt2643 >> 6)) * 64 + local156.aByte21 - anInt2643;
										local195.anInt4245 = (local140 + (anInt2638 >> 6)) * 64 + local156.aByte22 - anInt2638;
										aClass14_10.method300(local195);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!ii;Lclient!nj;IIII[I[I)V")
	private static void method2261(@OriginalArg(0) Class105 arg0, @OriginalArg(1) Class1_Sub21 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		@Pc(3) int local3 = arg1.method5720();
		if ((local3 & 0x1) == 0) {
			@Pc(15) boolean local15 = (local3 & 0x2) == 0;
			@Pc(21) int local21 = local3 >> 2 & 0x3F;
			if (local21 != 62) {
				if (local21 == 63) {
					local21 = arg1.method5720();
				} else if (local15) {
					local21 = arg6[local21];
				} else {
					local21 = arg7[local21];
				}
				if (local15) {
					aByteArray34[arg4 + arg5 * anInt2639] = (byte) local21;
					aByteArray35[arg4 + arg5 * anInt2639] = 0;
				} else {
					aByteArray35[arg4 + arg5 * anInt2639] = (byte) local21;
					aByteArray31[arg4 + arg5 * anInt2639] = 0;
					aByteArray34[arg4 + arg5 * anInt2639] = arg1.method5721();
				}
			}
			return;
		}
		@Pc(100) int local100 = (local3 >> 1 & 0x3) + 1;
		@Pc(108) boolean local108 = (local3 & 0x8) != 0;
		@Pc(116) boolean local116 = (local3 & 0x10) != 0;
		for (@Pc(118) int local118 = 0; local118 < local100; local118++) {
			@Pc(123) int local123 = arg1.method5720();
			@Pc(125) int local125 = 0;
			@Pc(127) int local127 = 0;
			if (local108) {
				local125 = arg1.method5720();
				local127 = arg1.method5720();
			}
			@Pc(139) int local139 = 0;
			if (local116) {
				local139 = arg1.method5720();
			}
			@Pc(215) short[] local215;
			@Pc(218) byte[] local218;
			@Pc(220) int local220;
			if (local118 == 0) {
				aByteArray34[arg4 + arg5 * anInt2639] = (byte) local123;
				aByteArray35[arg4 + arg5 * anInt2639] = (byte) local125;
				aByteArray31[arg4 + arg5 * anInt2639] = (byte) local127;
				if (local139 == 1) {
					aShortArray44[arg4 + arg5 * anInt2639] = (short) (arg1.method5715() + 1);
					aByteArray33[arg4 + arg5 * anInt2639] = arg1.method5721();
				} else if (local139 > 1) {
					aShortArray44[arg4 + arg5 * anInt2639] = -1;
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method5715();
						local218[local220] = arg1.method5721();
					}
					aClass207_20.method5552(new Class1_Sub13(local215, local218), (long) (arg4 << 16 | arg5));
				}
			} else {
				local215 = null;
				local218 = null;
				if (local139 > 0) {
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method5715();
						local218[local220] = arg1.method5721();
					}
				}
				if (aClass122ArrayArrayArray2[local118 - 1][arg2 - (anInt2643 >> 6)][arg3 - (anInt2638 >> 6)] == null) {
					aClass122ArrayArrayArray2[local118 - 1][arg2 - (anInt2643 >> 6)][arg3 - (anInt2638 >> 6)] = new Class122();
				}
				@Pc(338) Class7_Sub4 local338 = new Class7_Sub4(arg4 & 0x3F, arg5 & 0x3F, local123, local125, local127, local215, local218);
				aClass122ArrayArrayArray2[local118 - 1][arg2 - (anInt2643 >> 6)][arg3 - (anInt2638 >> 6)].method2624(local338);
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(II)Lclient!ql;")
	public static Class169 method2262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class169 local3 = new Class169();
		for (@Pc(8) Class1_Sub2_Sub8 local8 = (Class1_Sub2_Sub8) aClass207_19.method5560(); local8 != null; local8 = (Class1_Sub2_Sub8) aClass207_19.method5559()) {
			if (local8.aBoolean275 && local8.method3053(arg0, arg1)) {
				local3.method4475(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(Lclient!ii;IIII)Lclient!ar;")
	private static Class14 method2263(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(4) Class1_Sub29 local4 = (Class1_Sub29) aClass14_10.method302(); local4 != null; local4 = (Class1_Sub29) aClass14_10.method313()) {
			method2251(arg0, local4, arg1, arg2);
		}
		return aClass14_10;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt2644 = arg0 - anInt2643;
		anInt2633 = arg1 - anInt2638;
		anInt2637 = arg2 - anInt2643;
		anInt2634 = arg3 - anInt2638;
		anInt2642 = arg4;
		anInt2635 = arg5;
		anInt2640 = arg6;
		anInt2641 = arg7;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)Lclient!ln;")
	public static Class1_Sub2_Sub8 method2265(@OriginalArg(0) int arg0) {
		return (Class1_Sub2_Sub8) aClass207_19.method5555((long) arg0);
	}
}
