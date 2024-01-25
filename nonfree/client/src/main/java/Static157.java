import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "Lclient!dp;")
	private static Class71 aClass71_2;

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "Lclient!ri;")
	public static Class284 aClass284_35;

	@OriginalMember(owner = "client!fr", name = "d", descriptor = "Lclient!sb;")
	public static Class296 aClass296_3;

	@OriginalMember(owner = "client!fr", name = "e", descriptor = "Lclient!hfa;")
	public static Interface7 anInterface7_2;

	@OriginalMember(owner = "client!fr", name = "f", descriptor = "Lclient!kca;")
	private static Class171 aClass171_3;

	@OriginalMember(owner = "client!fr", name = "g", descriptor = "Lclient!ba;")
	public static Class3_Sub7_Sub1 aClass3_Sub7_Sub1_3;

	@OriginalMember(owner = "client!fr", name = "h", descriptor = "Lclient!lk;")
	public static Class189 aClass189_2;

	@OriginalMember(owner = "client!fr", name = "i", descriptor = "Lclient!il;")
	public static Class146 aClass146_2;

	@OriginalMember(owner = "client!fr", name = "k", descriptor = "I")
	public static int anInt2659;

	@OriginalMember(owner = "client!fr", name = "l", descriptor = "F")
	public static float aFloat71;

	@OriginalMember(owner = "client!fr", name = "m", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!fr", name = "o", descriptor = "Lclient!ck;")
	public static Class57 aClass57_2;

	@OriginalMember(owner = "client!fr", name = "s", descriptor = "F")
	public static float aFloat72;

	@OriginalMember(owner = "client!fr", name = "t", descriptor = "[B")
	private static byte[] aByteArray51;

	@OriginalMember(owner = "client!fr", name = "u", descriptor = "[B")
	private static byte[] aByteArray52;

	@OriginalMember(owner = "client!fr", name = "v", descriptor = "I")
	public static int anInt2662;

	@OriginalMember(owner = "client!fr", name = "w", descriptor = "I")
	public static int anInt2663;

	@OriginalMember(owner = "client!fr", name = "x", descriptor = "[S")
	private static short[] aShortArray45;

	@OriginalMember(owner = "client!fr", name = "y", descriptor = "I")
	public static int anInt2664;

	@OriginalMember(owner = "client!fr", name = "z", descriptor = "[B")
	private static byte[] aByteArray53;

	@OriginalMember(owner = "client!fr", name = "A", descriptor = "I")
	public static int anInt2665;

	@OriginalMember(owner = "client!fr", name = "B", descriptor = "I")
	public static int anInt2666;

	@OriginalMember(owner = "client!fr", name = "C", descriptor = "[I")
	private static int[] anIntArray91;

	@OriginalMember(owner = "client!fr", name = "D", descriptor = "[B")
	private static byte[] aByteArray54;

	@OriginalMember(owner = "client!fr", name = "E", descriptor = "[B")
	private static byte[] aByteArray55;

	@OriginalMember(owner = "client!fr", name = "F", descriptor = "I")
	public static int anInt2667;

	@OriginalMember(owner = "client!fr", name = "G", descriptor = "[S")
	private static short[] aShortArray46;

	@OriginalMember(owner = "client!fr", name = "H", descriptor = "I")
	public static int anInt2668;

	@OriginalMember(owner = "client!fr", name = "I", descriptor = "I")
	public static int anInt2669;

	@OriginalMember(owner = "client!fr", name = "J", descriptor = "I")
	public static int anInt2670;

	@OriginalMember(owner = "client!fr", name = "K", descriptor = "I")
	public static int anInt2671;

	@OriginalMember(owner = "client!fr", name = "L", descriptor = "I")
	public static int anInt2672;

	@OriginalMember(owner = "client!fr", name = "M", descriptor = "Lclient!sba;")
	private static Class297 aClass297_9;

	@OriginalMember(owner = "client!fr", name = "N", descriptor = "I")
	public static int anInt2673;

	@OriginalMember(owner = "client!fr", name = "O", descriptor = "[[[Lclient!qe;")
	private static Class269[][][] aClass269ArrayArrayArray2;

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "Lclient!sba;")
	private static final Class297 aClass297_8 = new Class297(16);

	@OriginalMember(owner = "client!fr", name = "j", descriptor = "[S")
	private static final short[] aShortArray44 = new short[1];

	@OriginalMember(owner = "client!fr", name = "n", descriptor = "I")
	public static int anInt2660 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!fr", name = "p", descriptor = "I")
	public static int anInt2661 = (int) (Math.random() * 11.0D) - 5;

	@OriginalMember(owner = "client!fr", name = "q", descriptor = "[B")
	private static final byte[] aByteArray50 = new byte[1];

	@OriginalMember(owner = "client!fr", name = "r", descriptor = "Lclient!or;")
	public static final Class244 aClass244_22 = new Class244();

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!r;Lclient!ie;IIII[I[I)V")
	private static void method2233(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class3_Sub26 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		@Pc(3) int local3 = arg1.method6814();
		if ((local3 & 0x1) == 0) {
			@Pc(15) boolean local15 = (local3 & 0x2) == 0;
			@Pc(21) int local21 = local3 >> 2 & 0x3F;
			if (local21 != 62) {
				if (local21 == 63) {
					local21 = arg1.method6814();
				} else if (local15) {
					local21 = arg6[local21];
				} else {
					local21 = arg7[local21];
				}
				if (local15) {
					aByteArray55[arg4 + arg5 * anInt2673] = (byte) local21;
					aByteArray51[arg4 + arg5 * anInt2673] = 0;
				} else {
					aByteArray51[arg4 + arg5 * anInt2673] = (byte) local21;
					aByteArray53[arg4 + arg5 * anInt2673] = 0;
					aByteArray55[arg4 + arg5 * anInt2673] = arg1.method6825();
				}
			}
			return;
		}
		@Pc(100) int local100 = (local3 >> 1 & 0x3) + 1;
		@Pc(108) boolean local108 = (local3 & 0x8) != 0;
		@Pc(116) boolean local116 = (local3 & 0x10) != 0;
		for (@Pc(118) int local118 = 0; local118 < local100; local118++) {
			@Pc(123) int local123 = arg1.method6814();
			@Pc(125) int local125 = 0;
			@Pc(127) int local127 = 0;
			if (local108) {
				local125 = arg1.method6814();
				local127 = arg1.method6814();
			}
			@Pc(139) int local139 = 0;
			if (local116) {
				local139 = arg1.method6814();
			}
			@Pc(215) short[] local215;
			@Pc(218) byte[] local218;
			@Pc(220) int local220;
			if (local118 == 0) {
				aByteArray55[arg4 + arg5 * anInt2673] = (byte) local123;
				aByteArray51[arg4 + arg5 * anInt2673] = (byte) local125;
				aByteArray53[arg4 + arg5 * anInt2673] = (byte) local127;
				if (local139 == 1) {
					aShortArray45[arg4 + arg5 * anInt2673] = (short) (arg1.method6811() + 1);
					aByteArray52[arg4 + arg5 * anInt2673] = arg1.method6825();
				} else if (local139 > 1) {
					aShortArray45[arg4 + arg5 * anInt2673] = -1;
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method6811();
						local218[local220] = arg1.method6825();
					}
					aClass297_9.method6537((long) (arg4 << 16 | arg5), new Class3_Sub45(local215, local218));
				}
			} else {
				local215 = null;
				local218 = null;
				if (local139 > 0) {
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method6811();
						local218[local220] = arg1.method6825();
					}
				}
				if (aClass269ArrayArrayArray2[local118 - 1][arg2 - (anInt2670 >> 6)][arg3 - (anInt2671 >> 6)] == null) {
					aClass269ArrayArrayArray2[local118 - 1][arg2 - (anInt2670 >> 6)][arg3 - (anInt2671 >> 6)] = new Class269();
				}
				@Pc(338) Class25_Sub9 local338 = new Class25_Sub9(arg4 & 0x3F, arg5 & 0x3F, local123, local125, local127, local215, local218);
				aClass269ArrayArrayArray2[local118 - 1][arg2 - (anInt2670 >> 6)][arg3 - (anInt2671 >> 6)].method5977(local338);
			}
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "([B[B[SII)V")
	private static void method2234(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int[] local2 = new int[anInt2663];
		@Pc(5) int[] local5 = new int[anInt2663];
		@Pc(8) int[] local8 = new int[anInt2663];
		@Pc(11) int[] local11 = new int[anInt2663];
		@Pc(14) int[] local14 = new int[anInt2663];
		for (@Pc(16) int local16 = -5; local16 < anInt2673; local16++) {
			@Pc(21) int local21 = local16 + 5;
			@Pc(25) int local25 = local16 - 5;
			@Pc(41) int local41;
			for (@Pc(27) int local27 = 0; local27 < anInt2663; local27++) {
				@Pc(50) Class188 local50;
				@Pc(86) int local86;
				if (local21 < anInt2673) {
					local41 = arg0[local21 + local27 * anInt2673] & 0xFF;
					if (local41 > 0) {
						local50 = aClass71_2.method2109(local41 - 1);
						local2[local27] += local50.anInt5716;
						local5[local27] += local50.anInt5718;
						local8[local27] += local50.anInt5717;
						local11[local27] += local50.anInt5714;
						local86 = local14[local27]++;
					}
				}
				if (local25 >= 0) {
					local41 = arg0[local25 + local27 * anInt2673] & 0xFF;
					if (local41 > 0) {
						local50 = aClass71_2.method2109(local41 - 1);
						local2[local27] -= local50.anInt5716;
						local5[local27] -= local50.anInt5718;
						local8[local27] -= local50.anInt5717;
						local11[local27] -= local50.anInt5714;
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
				for (@Pc(167) int local167 = -5; local167 < anInt2663; local167++) {
					@Pc(172) int local172 = local167 + 5;
					if (local172 < anInt2663) {
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
						if ((arg0[local16 + local167 * anInt2673] & 0xFF) == 0) {
							local261 = local16 + local167 * anInt2673;
							arg1[local261] = 0;
							arg2[local261] = 0;
						} else {
							local261 = local163 == 0 ? 0 : Static142.method2743(local41 * 256 / local163, local161 / local165, local159 / local165);
							@Pc(294) int local294 = (local261 & 0x7F) + arg4;
							if (local294 < 0) {
								local294 = 0;
							} else if (local294 > 127) {
								local294 = 127;
							}
							@Pc(316) int local316 = (local261 + arg3 & 0xFC00) + (local261 & 0x380) + local294;
							@Pc(322) int local322 = local16 + local167 * anInt2673;
							@Pc(333) int local333 = Static133.anIntArray113[Static386.method5380(Static554.method7606(local316)) & 0xFFFF];
							arg1[local322] = (byte) (local333 >> 16 & 0xFF);
							arg2[local322] = (short) (local333 & 0xFFFF);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt2672 = arg0 - anInt2670;
		anInt2669 = arg1 - anInt2671;
		anInt2665 = arg2 - anInt2670;
		anInt2666 = arg3 - anInt2671;
		anInt2662 = arg4;
		anInt2664 = arg5;
		anInt2668 = arg6;
		anInt2667 = arg7;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "()V")
	public static void method2236() {
		aByteArray55 = new byte[anInt2673 * anInt2663];
		aByteArray51 = new byte[anInt2673 * anInt2663];
		aByteArray53 = new byte[anInt2673 * anInt2663];
		aShortArray45 = new short[anInt2673 * anInt2663];
		aByteArray52 = new byte[anInt2673 * anInt2663];
		aClass297_9 = new Class297(1024);
		aClass269ArrayArrayArray2 = new Class269[3][anInt2673 >> 6][anInt2663 >> 6];
		anIntArray91 = new int[aClass171_3.anInt5199 + 1];
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!r;IIIIIII[S[BZ)V")
	private static void method2237(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) boolean arg10) {
		@Pc(20) int local20;
		@Pc(32) int local32;
		if (arg10 || arg5 != 0 || arg6 > 0) {
			if (arg6 == 0) {
				arg0.J(arg1, arg2, arg3, arg4, arg5, 0);
			} else {
				local20 = arg7 & 0x3F;
				if (local20 == 0 || arg3 <= 1 || arg4 <= 1) {
					local32 = anIntArray91[arg6];
					if (arg10 || local32 != 0) {
						arg0.J(arg1, arg2, arg3, arg4, local32, 0);
					}
				} else {
					local32 = arg10 ? 0 : 1;
					Static265.method4051(local20, arg7 >> 6 & 0x3, arg2, arg5, arg3, arg1, local32, arg0, aByteArrayArrayArray3, anInt2659, arg4, anIntArray91[arg6]);
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
				@Pc(127) Class194 local127 = aClass146_2.method3721(arg8[local100] & 0xFFFF);
				if (local127.anInt5810 == -1) {
					@Pc(133) int local133 = -3355444;
					if (local127.anInt5831 == 1) {
						local133 = -3407872;
					}
					@Pc(147) int local147 = arg9[local100] >> 6 & 0x3;
					if (local107 == 0) {
						if (local147 == 0) {
							arg0.m(arg1, arg2, arg4, local133, 0);
						} else if (local147 == 1) {
							arg0.XA(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 2) {
							arg0.m(local20, arg2, arg4, local133, 0);
						} else {
							arg0.XA(arg1, local32, arg3, local133, 0);
						}
					} else if (local107 == 2) {
						if (local147 == 0) {
							arg0.m(arg1, arg2, arg4, -1, 0);
							arg0.XA(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 1) {
							arg0.m(local20, arg2, arg4, -1, 0);
							arg0.XA(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 2) {
							arg0.m(local20, arg2, arg4, -1, 0);
							arg0.XA(arg1, local32, arg3, local133, 0);
						} else {
							arg0.m(arg1, arg2, arg4, -1, 0);
							arg0.XA(arg1, local32, arg3, local133, 0);
						}
					} else if (local107 == 3) {
						if (local147 == 0) {
							arg0.XA(arg1, arg2, 1, local133, 0);
						} else if (local147 == 1) {
							arg0.XA(local20, arg2, 1, local133, 0);
						} else if (local147 == 2) {
							arg0.XA(local20, local32, 1, local133, 0);
						} else {
							arg0.XA(arg1, local32, 1, local133, 0);
						}
					} else if (local107 == 9) {
						@Pc(313) int local313;
						if (local147 == 0 || local147 == 2) {
							for (local313 = 0; local313 < arg4; local313++) {
								arg0.XA(arg1 + local313, local32 - local313, 1, local133, 0);
							}
						} else {
							for (local313 = 0; local313 < arg4; local313++) {
								arg0.XA(arg1 + local313, arg2 + local313, 1, local133, 0);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!r;IIII)V")
	private static void method2238(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = anInt2665 - anInt2672;
		@Pc(7) int local7 = anInt2669 - anInt2666;
		if (anInt2665 < anInt2673) {
			local3++;
		}
		if (anInt2669 < anInt2663) {
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
			local28 = (arg1 * local17 >> 16) + anInt2662;
			local40 = (arg1 * (local17 + 1) >> 16) + anInt2662;
			local44 = local40 - local28;
			if (local44 > 0) {
				local50 = anInt2672 + local17;
				if (local50 >= 0 && local50 < anInt2673) {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt2667 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt2667 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (local84 > 0) {
							local93 = local57 + anInt2666;
							local173 = local50 + local93 * anInt2673;
							local175 = 0;
							local177 = 0;
							local179 = 0;
							if (local93 >= 0 && local93 < anInt2663) {
								local175 = (aByteArray54[local173] & 0xFF) << 16 | aShortArray46[local173] & 0xFFFF;
								if (local175 != 0) {
									local175 |= 0xFF000000;
								}
								local177 = aByteArray51[local173] & 0xFF;
								local179 = aShortArray45[local173] & 0xFFFF;
							}
							if (local175 == 0 && local177 == 0 && local179 == 0) {
								if (aClass3_Sub7_Sub1_3.anInt354 != -1) {
									local175 = aClass3_Sub7_Sub1_3.anInt354 | 0xFF000000;
								} else if ((local17 + anInt2672 & 0x4) == (local57 + anInt2669 & 0x4)) {
									local175 = anIntArray91[aClass171_3.anInt5200 + 1];
								} else {
									local175 = -11840664;
								}
								if (local175 == 0) {
									local175 = -16777216;
								}
								arg0.J(local28, local70, local44, local84, local175, 0);
							} else if (local179 <= 0) {
								method2237(arg0, local28, local70, local44, local84, local175, local177, aByteArray53[local173], null, null, true);
							} else if (local179 == 65535) {
								@Pc(282) Class3_Sub45 local282 = (Class3_Sub45) aClass297_9.method6531((long) (local50 << 16 | local93));
								if (local282 != null) {
									method2237(arg0, local28, local70, local44, local84, local175, local177, aByteArray53[local173], local282.aShortArray113, local282.aByteArray193, true);
								}
							} else {
								aShortArray44[0] = (short) (local179 - 1);
								aByteArray50[0] = aByteArray52[local173];
								method2237(arg0, local28, local70, local44, local84, local175, local177, aByteArray53[local173], aShortArray44, aByteArray50, true);
							}
						}
					}
				} else {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt2667 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt2667 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (aClass3_Sub7_Sub1_3.anInt354 != -1) {
							local93 = aClass3_Sub7_Sub1_3.anInt354 | 0xFF000000;
						} else if ((local17 + anInt2672 & 0x4) == (local57 + anInt2669 & 0x4)) {
							local93 = anIntArray91[aClass171_3.anInt5200 + 1];
						} else {
							local93 = -11840664;
						}
						if (local93 == 0) {
							local93 = -16777216;
						}
						arg0.J(local28, local70, local44, local84, local93, 0);
					}
				}
			}
		}
		for (local28 = -16; local28 < local3 + 16; local28++) {
			local40 = (arg1 * local28 >> 16) + anInt2662;
			local44 = (arg1 * (local28 + 1) >> 16) + anInt2662;
			local50 = local44 - local40;
			if (local50 > 0) {
				local57 = local28 + anInt2672;
				if (local57 >= 0 && local57 < anInt2673) {
					for (local70 = -16; local70 < local7 + 16; local70++) {
						local80 = anInt2667 - (arg2 * (local70 + 1) >> 16);
						local84 = anInt2667 - (arg2 * local70 >> 16);
						local93 = local84 - local80;
						if (local93 > 0) {
							local173 = local70 + anInt2666;
							if (local173 >= 0 && local173 < anInt2663) {
								local175 = aShortArray45[local57 + local173 * anInt2673] & 0xFFFF;
								if (local175 <= 0) {
									method2243(arg0, local40, local80, local50, local93, null, null);
								} else if (local175 == 65535) {
									@Pc(459) Class3_Sub45 local459 = (Class3_Sub45) aClass297_9.method6531((long) (local57 << 16 | local173));
									if (local459 != null) {
										method2243(arg0, local40, local80, local50, local93, local459.aShortArray113, local459.aByteArray193);
									}
								} else {
									aShortArray44[0] = (short) (local175 - 1);
									aByteArray50[0] = aByteArray52[local57 + local173 * anInt2673];
									method2243(arg0, local40, local80, local50, local93, aShortArray44, aByteArray50);
								}
							}
						}
					}
				}
			}
		}
		local40 = anInt2672 >> 6;
		local44 = anInt2666 >> 6;
		if (local40 < 0) {
			local40 = 0;
		}
		if (local44 < 0) {
			local44 = 0;
		}
		local50 = anInt2665 >> 6;
		local57 = anInt2669 >> 6;
		if (local50 >= aClass269ArrayArrayArray2[0].length) {
			local50 = aClass269ArrayArrayArray2[0].length - 1;
		}
		if (local57 >= aClass269ArrayArrayArray2[0][0].length) {
			local57 = aClass269ArrayArrayArray2[0][0].length - 1;
		}
		for (local70 = 0; local70 < 3; local70++) {
			@Pc(641) int local641;
			@Pc(653) int local653;
			@Pc(665) int local665;
			@Pc(675) int local675;
			@Pc(631) int local631;
			for (local80 = local40; local80 <= local50; local80++) {
				for (local84 = local44; local84 <= local57; local84++) {
					@Pc(589) Class269 local589 = aClass269ArrayArrayArray2[local70][local80][local84];
					if (local589 != null) {
						local173 = (local80 + (anInt2670 >> 6)) * 64;
						local175 = (local84 + (anInt2671 >> 6)) * 64;
						for (@Pc(612) Class25_Sub9 local612 = (Class25_Sub9) local589.method5974(); local612 != null; local612 = (Class25_Sub9) local589.method5979()) {
							local179 = local173 + local612.aByte84 - anInt2670 - anInt2672;
							local631 = local175 + local612.aByte85 - anInt2671 - anInt2666;
							local641 = (arg1 * local179 >> 16) + anInt2662;
							local653 = (arg1 * (local179 + 1) >> 16) + anInt2662;
							local665 = anInt2667 - (arg2 * (local631 + 1) >> 16);
							local675 = anInt2667 - (arg2 * local631 >> 16);
							method2237(arg0, local641, local665, local653 - local641, local675 - local665, local612.anInt6315, local612.aByte86 & 0xFF, local612.aByte87, local612.aShortArray93, local612.aByteArray158, false);
						}
					}
				}
			}
			for (local84 = local40; local84 <= local50; local84++) {
				for (local93 = local44; local93 <= local57; local93++) {
					@Pc(727) Class269 local727 = aClass269ArrayArrayArray2[local70][local84][local93];
					if (local727 != null) {
						local175 = (local84 + (anInt2670 >> 6)) * 64;
						local177 = (local93 + (anInt2671 >> 6)) * 64;
						for (@Pc(750) Class25_Sub9 local750 = (Class25_Sub9) local727.method5974(); local750 != null; local750 = (Class25_Sub9) local727.method5979()) {
							local631 = local175 + local750.aByte84 - anInt2670 - anInt2672;
							local641 = local177 + local750.aByte85 - anInt2671 - anInt2666;
							local653 = (arg1 * local631 >> 16) + anInt2662;
							local665 = (arg1 * (local631 + 1) >> 16) + anInt2662;
							local675 = anInt2667 - (arg2 * (local641 + 1) >> 16);
							@Pc(813) int local813 = anInt2667 - (arg2 * local641 >> 16);
							method2243(arg0, local653, local675, local665 - local653, local813 - local675, local750.aShortArray93, local750.aByteArray158);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)Lclient!ba;")
	public static Class3_Sub7_Sub1 method2239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class3_Sub7_Sub1 local4 = (Class3_Sub7_Sub1) aClass297_8.method6529(); local4 != null; local4 = (Class3_Sub7_Sub1) aClass297_8.method6532()) {
			if (local4.aBoolean22 && local4.method332(arg1, arg0)) {
				return local4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!fa;II)V")
	public static void method2240(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < aClass171_3.anInt5199; local1++) {
			anIntArray91[local1 + 1] = method2244(arg0, local1, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(II)Lclient!ce;")
	public static Class49 method2241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class49 local3 = new Class49();
		for (@Pc(8) Class3_Sub7_Sub1 local8 = (Class3_Sub7_Sub1) aClass297_8.method6529(); local8 != null; local8 = (Class3_Sub7_Sub1) aClass297_8.method6532()) {
			if (local8.aBoolean22 && local8.method332(arg1, arg0)) {
				local3.method1455(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(Lclient!r;IIII)Lclient!or;")
	private static Class244 method2242(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(4) Class3_Sub33 local4 = (Class3_Sub33) aClass244_22.method5572(); local4 != null; local4 = (Class3_Sub33) aClass244_22.method5576()) {
			method2248(arg0, local4, arg1, arg2);
		}
		return aClass244_22;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!r;IIII[S[B)V")
	private static void method2243(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		if (arg5 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < arg5.length; local4++) {
			@Pc(14) Class194 local14 = aClass146_2.method3721(arg5[local4] & 0xFFFF);
			@Pc(17) int local17 = local14.anInt5810;
			if (local17 != -1) {
				@Pc(25) Class40 local25 = aClass296_3.method6523(local17);
				@Pc(49) Class73 local49 = local25.method1181(local14.aBoolean404 ? arg6[local4] >> 6 & 0x3 : 0, local14.aBoolean407 ? local14.aBoolean402 : false, arg0);
				if (local49 != null) {
					@Pc(58) int local58 = arg3 * local49.A() >> 2;
					@Pc(65) int local65 = arg4 * local49.ca() >> 2;
					if (local25.aBoolean106) {
						@Pc(71) int local71 = local14.anInt5845;
						@Pc(74) int local74 = local14.anInt5830;
						if ((arg6[local4] >> 6 & 0x1) == 1) {
							@Pc(85) int local85 = local71;
							local71 = local74;
							local74 = local85;
						}
						local58 = local71 * arg3;
						local65 = local74 * arg4;
					}
					if (local58 != 0 && local65 != 0) {
						if (local25.anInt1277 == 0) {
							local49.method7955(arg1, arg2 + arg4 - local65, local58, local65);
						} else {
							local49.method7949(arg1, arg2 + arg4 - local65, local58, local65, 0, local25.anInt1277 | 0xFF000000, 1);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!fa;III)I")
	private static int method2244(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class88 local4 = aClass171_3.method4161(arg1);
		if (local4 == null) {
			return 0;
		}
		@Pc(11) int local11 = local4.anInt2807;
		if (local11 >= 0 && arg0.method7229(local11).aBoolean349) {
			local11 = -1;
		}
		@Pc(68) int local68;
		@Pc(27) int local27;
		@Pc(33) int local33;
		@Pc(55) int local55;
		if (local4.anInt2815 >= 0) {
			local27 = local4.anInt2815;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static133.anIntArray113[Static386.method5380(Static476.method6518(local55)) & 0xFFFF] | 0xFF000000;
		} else if (local11 >= 0) {
			local68 = Static133.anIntArray113[Static386.method5380(Static476.method6518(arg0.method7229(local11).aShort66)) & 0xFFFF] | 0xFF000000;
		} else if (local4.anInt2812 == -1) {
			local68 = 0;
		} else {
			local27 = local4.anInt2812;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static133.anIntArray113[Static386.method5380(Static476.method6518(local55)) & 0xFFFF] | 0xFF000000;
		}
		return local68;
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "()V")
	public static void method2245() {
		@Pc(2) int[] local2 = new int[3];
		for (@Pc(4) int local4 = 0; local4 < aClass57_2.anInt1840; local4++) {
			@Pc(32) boolean local32 = aClass3_Sub7_Sub1_3.method330(aClass57_2.anIntArray61[local4] >> 14 & 0x3FFF, local2, aClass57_2.anIntArray61[local4] & 0x3FFF, aClass57_2.anIntArray61[local4] >> 28 & 0x3);
			if (local32) {
				@Pc(42) Class3_Sub33 local42 = new Class3_Sub33(aClass57_2.anIntArray60[local4]);
				local42.anInt5494 = local2[1] - anInt2670;
				local42.anInt5495 = local2[2] - anInt2671;
				aClass244_22.method5570(local42);
			}
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!r;)Lclient!or;")
	public static Class244 method2246(@OriginalArg(0) Class31 arg0) {
		@Pc(3) int local3 = anInt2665 - anInt2672;
		@Pc(7) int local7 = anInt2669 - anInt2666;
		@Pc(15) int local15 = (anInt2668 - anInt2662 << 16) / local3;
		@Pc(23) int local23 = (anInt2667 - anInt2664 << 16) / local7;
		return method2242(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!r;II)V")
	public static void method2247(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class3_Sub26 local9 = new Class3_Sub26(aClass284_35.method6328(aClass3_Sub7_Sub1_3.aString21, "area"));
		@Pc(13) int local13 = local9.method6814();
		@Pc(16) int[] local16 = new int[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			local16[local18] = local9.method6814();
		}
		@Pc(33) int local33 = local9.method6814();
		@Pc(36) int[] local36 = new int[local33];
		for (@Pc(38) int local38 = 0; local38 < local33; local38++) {
			local36[local38] = local9.method6814();
		}
		while (true) {
			@Pc(58) int local58;
			@Pc(64) int local64;
			@Pc(67) int local67;
			@Pc(76) int local76;
			@Pc(148) int local148;
			while (local9.anInt8703 < local9.aByteArray213.length) {
				@Pc(62) int local62;
				@Pc(84) int local84;
				if (local9.method6814() == 0) {
					local58 = local9.method6814();
					local62 = local9.method6814();
					for (local64 = 0; local64 < 64; local64++) {
						for (local67 = 0; local67 < 64; local67++) {
							local76 = local58 * 64 + local64 - anInt2670;
							local84 = local62 * 64 + local67 - anInt2671;
							method2233(arg0, local9, local58, local62, local76, local84, local16, local36);
						}
					}
				} else {
					local58 = local9.method6814();
					local62 = local9.method6814();
					local64 = local9.method6814();
					local67 = local9.method6814();
					for (local76 = 0; local76 < 8; local76++) {
						for (local84 = 0; local84 < 8; local84++) {
							@Pc(136) int local136 = local58 * 64 + local64 * 8 + local76 - anInt2670;
							local148 = local62 * 64 + local67 * 8 + local84 - anInt2671;
							method2233(arg0, local9, local58, local62, local136, local148, local16, local36);
						}
					}
				}
			}
			aByteArray54 = new byte[anInt2673 * anInt2663];
			aShortArray46 = new short[anInt2673 * anInt2663];
			for (local58 = 0; local58 < 3; local58++) {
				@Pc(191) byte[] local191 = new byte[anInt2673 * anInt2663];
				for (local64 = 0; local64 < aClass269ArrayArrayArray2[local58].length; local64++) {
					for (local67 = 0; local67 < aClass269ArrayArrayArray2[local58][0].length; local67++) {
						@Pc(205) Class269 local205 = aClass269ArrayArrayArray2[local58][local64][local67];
						if (local205 != null) {
							for (@Pc(212) Class25_Sub9 local212 = (Class25_Sub9) local205.method5974(); local212 != null; local212 = (Class25_Sub9) local205.method5979()) {
								local191[local64 * 64 + local212.aByte84 + (local67 * 64 + local212.aByte85) * anInt2673] = (byte) local212.anInt6315;
							}
						}
					}
				}
				method2234(local191, aByteArray54, aShortArray46, arg1, arg2);
				for (local67 = 0; local67 < aClass269ArrayArrayArray2[local58].length; local67++) {
					for (local76 = 0; local76 < aClass269ArrayArrayArray2[local58][0].length; local76++) {
						@Pc(276) Class269 local276 = aClass269ArrayArrayArray2[local58][local67][local76];
						if (local276 != null) {
							for (@Pc(283) Class25_Sub9 local283 = (Class25_Sub9) local276.method5974(); local283 != null; local283 = (Class25_Sub9) local276.method5979()) {
								local148 = local67 * 64 + local283.aByte84 + (local76 * 64 + local283.aByte85) * anInt2673;
								local283.anInt6315 = (aByteArray54[local148] & 0xFF) << 16 | aShortArray46[local148] & 0xFFFF;
								if (local283.anInt6315 != 0) {
									local283.anInt6315 |= 0xFF000000;
								}
							}
						}
					}
				}
			}
			method2234(aByteArray55, aByteArray54, aShortArray46, arg1, arg2);
			aByteArray55 = null;
			method2253();
			return;
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!r;Lclient!kt;IIII)V")
	private static void method2248(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class3_Sub33 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1.anInt5489 = anInt2662 + (arg2 * (arg1.anInt5494 - anInt2672) >> 16);
		arg1.anInt5488 = anInt2667 - (arg3 * (arg1.anInt5495 - anInt2666) >> 16);
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V")
	public static void method2249(@OriginalArg(0) int arg0) {
		aClass3_Sub7_Sub1_3 = (Class3_Sub7_Sub1) aClass297_8.method6531((long) arg0);
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(I)Lclient!ba;")
	public static Class3_Sub7_Sub1 method2250(@OriginalArg(0) int arg0) {
		return (Class3_Sub7_Sub1) aClass297_8.method6531((long) arg0);
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(Lclient!r;)V")
	public static void method2251(@OriginalArg(0) Class31 arg0) {
		@Pc(3) int local3 = anInt2665 - anInt2672;
		@Pc(7) int local7 = anInt2669 - anInt2666;
		@Pc(15) int local15 = (anInt2668 - anInt2662 << 16) / local3;
		@Pc(23) int local23 = (anInt2667 - anInt2664 << 16) / local7;
		method2238(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!fr", name = "d", descriptor = "()V")
	private static void method2253() {
		@Pc(4) int local4;
		@Pc(15) int local15;
		@Pc(49) int local49;
		for (@Pc(1) int local1 = 0; local1 < anInt2673; local1++) {
			for (local4 = 0; local4 < anInt2663; local4++) {
				local15 = aShortArray45[local1 + local4 * anInt2673] & 0xFFFF;
				if (local15 != 0) {
					@Pc(35) int local35;
					if (local15 == 65535) {
						@Pc(31) Class3_Sub45 local31 = (Class3_Sub45) aClass297_9.method6531((long) (local1 << 16 | local4));
						if (local31 != null) {
							for (local35 = 0; local35 < local31.aShortArray113.length; local35++) {
								@Pc(46) Class194 local46 = aClass146_2.method3721(local31.aShortArray113[local35] & 0xFFFF);
								local49 = local46.anInt5842;
								if (local46.anIntArray286 != null) {
									local46 = local46.method4696(anInterface7_2);
									if (local46 != null) {
										local49 = local46.anInt5842;
									}
								}
								if (local49 != -1) {
									@Pc(70) Class3_Sub33 local70 = new Class3_Sub33(local49);
									local70.anInt5494 = local1;
									local70.anInt5495 = local4;
									aClass244_22.method5570(local70);
								}
							}
						}
					} else {
						@Pc(94) Class194 local94 = aClass146_2.method3721(local15 - 1);
						local35 = local94.anInt5842;
						if (local94.anIntArray286 != null) {
							local94 = local94.method4696(anInterface7_2);
							if (local94 != null) {
								local35 = local94.anInt5842;
							}
						}
						if (local35 != -1) {
							@Pc(118) Class3_Sub33 local118 = new Class3_Sub33(local35);
							local118.anInt5494 = local1;
							local118.anInt5495 = local4;
							aClass244_22.method5570(local118);
						}
					}
				}
			}
		}
		for (local4 = 0; local4 < 3; local4++) {
			for (local15 = 0; local15 < aClass269ArrayArrayArray2[0].length; local15++) {
				for (@Pc(144) int local144 = 0; local144 < aClass269ArrayArrayArray2[0][0].length; local144++) {
					@Pc(153) Class269 local153 = aClass269ArrayArrayArray2[local4][local15][local144];
					if (local153 != null) {
						for (@Pc(160) Class25_Sub9 local160 = (Class25_Sub9) local153.method5974(); local160 != null; local160 = (Class25_Sub9) local153.method5979()) {
							if (local160.aShortArray93 != null) {
								for (local49 = 0; local49 < local160.aShortArray93.length; local49++) {
									@Pc(177) Class194 local177 = aClass146_2.method3721(local160.aShortArray93[local49] & 0xFFFF);
									@Pc(180) int local180 = local177.anInt5842;
									if (local177.anIntArray286 != null) {
										local177 = local177.method4696(anInterface7_2);
										if (local177 != null) {
											local180 = local177.anInt5842;
										}
									}
									if (local180 != -1) {
										@Pc(201) Class3_Sub33 local201 = new Class3_Sub33(local180);
										local201.anInt5494 = (local15 + (anInt2670 >> 6)) * 64 + local160.aByte84 - anInt2670;
										local201.anInt5495 = (local144 + (anInt2671 >> 6)) * 64 + local160.aByte85 - anInt2671;
										aClass244_22.method5570(local201);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!ri;Lclient!kca;Lclient!dp;Lclient!il;Lclient!lk;Lclient!sb;Lclient!hfa;)V")
	public static void method2254(@OriginalArg(0) Class284 arg0, @OriginalArg(1) Class171 arg1, @OriginalArg(2) Class71 arg2, @OriginalArg(3) Class146 arg3, @OriginalArg(4) Class189 arg4, @OriginalArg(5) Class296 arg5, @OriginalArg(6) Interface7 arg6) {
		aClass284_35 = arg0;
		aClass171_3 = arg1;
		aClass71_2 = arg2;
		aClass146_2 = arg3;
		aClass189_2 = arg4;
		aClass296_3 = arg5;
		anInterface7_2 = arg6;
		aClass297_8.method6535();
		@Pc(21) int local21 = aClass284_35.method6333("details");
		@Pc(26) int[] local26 = aClass284_35.method6324(local21);
		if (local26 != null) {
			for (@Pc(30) int local30 = 0; local30 < local26.length; local30++) {
				@Pc(39) Class3_Sub7_Sub1 local39 = Static560.method7669(local21, local26[local30], aClass284_35);
				aClass297_8.method6537((long) local39.anInt351, local39);
			}
		}
		Static410.method5761(false, true);
	}

	@OriginalMember(owner = "client!fr", name = "e", descriptor = "()V")
	public static void method2255() {
		aByteArray55 = null;
		aByteArray54 = null;
		aShortArray46 = null;
		aByteArray51 = null;
		aByteArray53 = null;
		aShortArray45 = null;
		aByteArray52 = null;
		aClass297_9 = null;
		aClass269ArrayArrayArray2 = null;
		anIntArray91 = null;
	}
}
