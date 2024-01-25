import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "Lclient!uq;")
	public static Class1_Sub1_Sub17 aClass1_Sub1_Sub17_2;

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "Lclient!ls;")
	public static Class161 aClass161_2;

	@OriginalMember(owner = "client!ss", name = "d", descriptor = "Lclient!uo;")
	private static Class251 aClass251_5;

	@OriginalMember(owner = "client!ss", name = "e", descriptor = "Lclient!qs;")
	public static Class211 aClass211_68;

	@OriginalMember(owner = "client!ss", name = "f", descriptor = "Lclient!im;")
	public static Interface4 anInterface4_2;

	@OriginalMember(owner = "client!ss", name = "g", descriptor = "Lclient!ot;")
	private static Class191 aClass191_4;

	@OriginalMember(owner = "client!ss", name = "h", descriptor = "Lclient!fd;")
	public static Class84 aClass84_4;

	@OriginalMember(owner = "client!ss", name = "i", descriptor = "Lclient!mj;")
	public static Class170 aClass170_4;

	@OriginalMember(owner = "client!ss", name = "k", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray18;

	@OriginalMember(owner = "client!ss", name = "m", descriptor = "Lclient!is;")
	public static Class121 aClass121_3;

	@OriginalMember(owner = "client!ss", name = "o", descriptor = "F")
	public static float aFloat69;

	@OriginalMember(owner = "client!ss", name = "p", descriptor = "I")
	public static int anInt5028;

	@OriginalMember(owner = "client!ss", name = "s", descriptor = "F")
	public static float aFloat70;

	@OriginalMember(owner = "client!ss", name = "t", descriptor = "I")
	public static int anInt5030;

	@OriginalMember(owner = "client!ss", name = "u", descriptor = "[B")
	private static byte[] aByteArray64;

	@OriginalMember(owner = "client!ss", name = "v", descriptor = "I")
	public static int anInt5031;

	@OriginalMember(owner = "client!ss", name = "w", descriptor = "I")
	public static int anInt5032;

	@OriginalMember(owner = "client!ss", name = "x", descriptor = "I")
	public static int anInt5033;

	@OriginalMember(owner = "client!ss", name = "y", descriptor = "[I")
	private static int[] anIntArray476;

	@OriginalMember(owner = "client!ss", name = "z", descriptor = "I")
	public static int anInt5034;

	@OriginalMember(owner = "client!ss", name = "B", descriptor = "[[[Lclient!ik;")
	private static Class117[][][] aClass117ArrayArrayArray2;

	@OriginalMember(owner = "client!ss", name = "C", descriptor = "I")
	public static int anInt5035;

	@OriginalMember(owner = "client!ss", name = "D", descriptor = "I")
	public static int anInt5036;

	@OriginalMember(owner = "client!ss", name = "E", descriptor = "[B")
	private static byte[] aByteArray65;

	@OriginalMember(owner = "client!ss", name = "F", descriptor = "[S")
	private static short[] aShortArray90;

	@OriginalMember(owner = "client!ss", name = "G", descriptor = "[S")
	private static short[] aShortArray91;

	@OriginalMember(owner = "client!ss", name = "H", descriptor = "Lclient!bu;")
	private static Class38 aClass38_25;

	@OriginalMember(owner = "client!ss", name = "I", descriptor = "I")
	public static int anInt5037;

	@OriginalMember(owner = "client!ss", name = "J", descriptor = "I")
	public static int anInt5038;

	@OriginalMember(owner = "client!ss", name = "K", descriptor = "I")
	public static int anInt5039;

	@OriginalMember(owner = "client!ss", name = "L", descriptor = "I")
	public static int anInt5040;

	@OriginalMember(owner = "client!ss", name = "M", descriptor = "[B")
	private static byte[] aByteArray66;

	@OriginalMember(owner = "client!ss", name = "N", descriptor = "[B")
	private static byte[] aByteArray67;

	@OriginalMember(owner = "client!ss", name = "O", descriptor = "[B")
	private static byte[] aByteArray68;

	@OriginalMember(owner = "client!ss", name = "P", descriptor = "I")
	public static int anInt5041;

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "Lclient!bu;")
	private static final Class38 aClass38_24 = new Class38(16);

	@OriginalMember(owner = "client!ss", name = "j", descriptor = "[S")
	private static final short[] aShortArray89 = new short[1];

	@OriginalMember(owner = "client!ss", name = "l", descriptor = "Lclient!pu;")
	public static final Class203 aClass203_40 = new Class203();

	@OriginalMember(owner = "client!ss", name = "n", descriptor = "I")
	public static int anInt5027 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!ss", name = "q", descriptor = "I")
	public static int anInt5029 = (int) (Math.random() * 11.0D) - 5;

	@OriginalMember(owner = "client!ss", name = "r", descriptor = "[B")
	private static final byte[] aByteArray63 = new byte[1];

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V")
	public static void method3850(@OriginalArg(0) int arg0) {
		aClass1_Sub1_Sub17_2 = (Class1_Sub1_Sub17) aClass38_24.method765((long) arg0);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!za;IIII[S[B)V")
	private static void method3851(@OriginalArg(0) Class106 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		if (arg5 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < arg5.length; local4++) {
			@Pc(14) Class192 local14 = aClass161_2.method3628(arg5[local4] & 0xFFFF);
			@Pc(17) int local17 = local14.anInt5683;
			if (local17 != -1) {
				@Pc(25) Class231 local25 = aClass84_4.method1802(local17);
				@Pc(49) Class137 local49 = local25.method5129(arg0, local14.aBoolean353 ? local14.aBoolean350 : false, local14.aBoolean361 ? arg6[local4] >> 6 & 0x3 : 0);
				if (local49 != null) {
					@Pc(58) int local58 = arg3 * local49.RA() >> 2;
					@Pc(65) int local65 = arg4 * local49.Q() >> 2;
					if (local25.aBoolean424) {
						@Pc(71) int local71 = local14.anInt5661;
						@Pc(74) int local74 = local14.anInt5679;
						if ((arg6[local4] >> 6 & 0x1) == 1) {
							@Pc(85) int local85 = local71;
							local71 = local74;
							local74 = local85;
						}
						local58 = local71 * arg3;
						local65 = local74 * arg4;
					}
					if (local58 != 0 && local65 != 0) {
						if (local25.anInt6730 == 0) {
							local49.method5700(arg1, arg2 + arg4 - local65, local58, local65);
						} else {
							local49.ya(arg1, arg2 + arg4 - local65, local58, local65, 0, local25.anInt6730 | 0xFF000000, 1);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(I)Lclient!uq;")
	public static Class1_Sub1_Sub17 method3852(@OriginalArg(0) int arg0) {
		return (Class1_Sub1_Sub17) aClass38_24.method765((long) arg0);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "()V")
	public static void method3853() {
		@Pc(2) int[] local2 = new int[3];
		for (@Pc(4) int local4 = 0; local4 < aClass121_3.anInt3940; local4++) {
			@Pc(32) boolean local32 = aClass1_Sub1_Sub17_2.method5649(aClass121_3.anIntArray378[local4] >> 28 & 0x3, local2, aClass121_3.anIntArray378[local4] >> 14 & 0x3FFF, aClass121_3.anIntArray378[local4] & 0x3FFF);
			if (local32) {
				@Pc(42) Class1_Sub28 local42 = new Class1_Sub28(aClass121_3.anIntArray379[local4]);
				local42.anInt4938 = local2[1] - anInt5040;
				local42.anInt4936 = local2[2] - anInt5030;
				aClass203_40.method4551(local42);
			}
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)Lclient!uq;")
	public static Class1_Sub1_Sub17 method3854(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class1_Sub1_Sub17 local4 = (Class1_Sub1_Sub17) aClass38_24.method767(); local4 != null; local4 = (Class1_Sub1_Sub17) aClass38_24.method773()) {
			if (local4.aBoolean475 && local4.method5651(arg0, arg1)) {
				return local4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!za;Lclient!ia;IIII[I[I)V")
	private static void method3855(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class1_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		@Pc(3) int local3 = arg1.method1171();
		if ((local3 & 0x1) == 0) {
			@Pc(15) boolean local15 = (local3 & 0x2) == 0;
			@Pc(21) int local21 = local3 >> 2 & 0x3F;
			if (local21 != 62) {
				if (local21 == 63) {
					local21 = arg1.method1171();
				} else if (local15) {
					local21 = arg6[local21];
				} else {
					local21 = arg7[local21];
				}
				if (local15) {
					aByteArray68[arg4 + arg5 * anInt5032] = (byte) local21;
					aByteArray65[arg4 + arg5 * anInt5032] = 0;
				} else {
					aByteArray65[arg4 + arg5 * anInt5032] = (byte) local21;
					aByteArray64[arg4 + arg5 * anInt5032] = 0;
					aByteArray68[arg4 + arg5 * anInt5032] = arg1.method1212();
				}
			}
			return;
		}
		@Pc(100) int local100 = (local3 >> 1 & 0x3) + 1;
		@Pc(108) boolean local108 = (local3 & 0x8) != 0;
		@Pc(116) boolean local116 = (local3 & 0x10) != 0;
		for (@Pc(118) int local118 = 0; local118 < local100; local118++) {
			@Pc(123) int local123 = arg1.method1171();
			@Pc(125) int local125 = 0;
			@Pc(127) int local127 = 0;
			if (local108) {
				local125 = arg1.method1171();
				local127 = arg1.method1171();
			}
			@Pc(139) int local139 = 0;
			if (local116) {
				local139 = arg1.method1171();
			}
			@Pc(215) short[] local215;
			@Pc(218) byte[] local218;
			@Pc(220) int local220;
			if (local118 == 0) {
				aByteArray68[arg4 + arg5 * anInt5032] = (byte) local123;
				aByteArray65[arg4 + arg5 * anInt5032] = (byte) local125;
				aByteArray64[arg4 + arg5 * anInt5032] = (byte) local127;
				if (local139 == 1) {
					aShortArray91[arg4 + arg5 * anInt5032] = (short) (arg1.method1177() + 1);
					aByteArray67[arg4 + arg5 * anInt5032] = arg1.method1212();
				} else if (local139 > 1) {
					aShortArray91[arg4 + arg5 * anInt5032] = -1;
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method1177();
						local218[local220] = arg1.method1212();
					}
					aClass38_25.method766(new Class1_Sub26(local215, local218), (long) (arg4 << 16 | arg5));
				}
			} else {
				local215 = null;
				local218 = null;
				if (local139 > 0) {
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method1177();
						local218[local220] = arg1.method1212();
					}
				}
				if (aClass117ArrayArrayArray2[local118 - 1][arg2 - (anInt5040 >> 6)][arg3 - (anInt5030 >> 6)] == null) {
					aClass117ArrayArrayArray2[local118 - 1][arg2 - (anInt5040 >> 6)][arg3 - (anInt5030 >> 6)] = new Class117();
				}
				@Pc(338) Class41_Sub6 local338 = new Class41_Sub6(arg4 & 0x3F, arg5 & 0x3F, local123, local125, local127, local215, local218);
				aClass117ArrayArrayArray2[local118 - 1][arg2 - (anInt5040 >> 6)][arg3 - (anInt5030 >> 6)].method2961(local338);
			}
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "([B[B[SII)V")
	private static void method3856(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int[] local2 = new int[anInt5031];
		@Pc(5) int[] local5 = new int[anInt5031];
		@Pc(8) int[] local8 = new int[anInt5031];
		@Pc(11) int[] local11 = new int[anInt5031];
		@Pc(14) int[] local14 = new int[anInt5031];
		for (@Pc(16) int local16 = -5; local16 < anInt5032; local16++) {
			@Pc(21) int local21 = local16 + 5;
			@Pc(25) int local25 = local16 - 5;
			@Pc(41) int local41;
			for (@Pc(27) int local27 = 0; local27 < anInt5031; local27++) {
				@Pc(50) Class217 local50;
				@Pc(86) int local86;
				if (local21 < anInt5032) {
					local41 = arg0[local21 + local27 * anInt5032] & 0xFF;
					if (local41 > 0) {
						local50 = aClass191_4.method4336(local41 - 1);
						local2[local27] += local50.anInt6518;
						local5[local27] += local50.anInt6516;
						local8[local27] += local50.anInt6522;
						local11[local27] += local50.anInt6521;
						local86 = local14[local27]++;
					}
				}
				if (local25 >= 0) {
					local41 = arg0[local25 + local27 * anInt5032] & 0xFF;
					if (local41 > 0) {
						local50 = aClass191_4.method4336(local41 - 1);
						local2[local27] -= local50.anInt6518;
						local5[local27] -= local50.anInt6516;
						local8[local27] -= local50.anInt6522;
						local11[local27] -= local50.anInt6521;
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
				for (@Pc(167) int local167 = -5; local167 < anInt5031; local167++) {
					@Pc(172) int local172 = local167 + 5;
					if (local172 < anInt5031) {
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
						if ((arg0[local16 + local167 * anInt5032] & 0xFF) == 0) {
							local261 = local16 + local167 * anInt5032;
							arg1[local261] = 0;
							arg2[local261] = 0;
						} else {
							local261 = local163 == 0 ? 0 : Static123.method1992(local41 * 256 / local163, local159 / local165, local161 / local165);
							@Pc(294) int local294 = (local261 & 0x7F) + arg4;
							if (local294 < 0) {
								local294 = 0;
							} else if (local294 > 127) {
								local294 = 127;
							}
							@Pc(316) int local316 = (local261 + arg3 & 0xFC00) + (local261 & 0x380) + local294;
							@Pc(322) int local322 = local16 + local167 * anInt5032;
							@Pc(333) int local333 = Static238.anIntArray440[Static285.method4173(Static91.method1564(local316)) & 0xFFFF];
							arg1[local322] = (byte) (local333 >> 16 & 0xFF);
							arg2[local322] = (short) (local333 & 0xFFFF);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!za;IIII)V")
	private static void method3857(@OriginalArg(0) Class106 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = anInt5035 - anInt5037;
		@Pc(7) int local7 = anInt5038 - anInt5036;
		if (anInt5035 < anInt5032) {
			local3++;
		}
		if (anInt5038 < anInt5031) {
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
			local28 = (arg1 * local17 >> 16) + anInt5033;
			local40 = (arg1 * (local17 + 1) >> 16) + anInt5033;
			local44 = local40 - local28;
			if (local44 > 0) {
				local50 = anInt5037 + local17;
				if (local50 >= 0 && local50 < anInt5032) {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt5034 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt5034 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (local84 > 0) {
							local93 = local57 + anInt5036;
							local173 = local50 + local93 * anInt5032;
							local175 = 0;
							local177 = 0;
							local179 = 0;
							if (local93 >= 0 && local93 < anInt5031) {
								local175 = (aByteArray66[local173] & 0xFF) << 16 | aShortArray90[local173] & 0xFFFF;
								if (local175 != 0) {
									local175 |= 0xFF000000;
								}
								local177 = aByteArray65[local173] & 0xFF;
								local179 = aShortArray91[local173] & 0xFFFF;
							}
							if (local175 == 0 && local177 == 0 && local179 == 0) {
								if (aClass1_Sub1_Sub17_2.anInt7421 != -1) {
									local175 = aClass1_Sub1_Sub17_2.anInt7421 | 0xFF000000;
								} else if ((local17 + anInt5037 & 0x4) == (local57 + anInt5038 & 0x4)) {
									local175 = anIntArray476[aClass251_5.anInt7374 + 1];
								} else {
									local175 = -11840664;
								}
								if (local175 == 0) {
									local175 = -16777216;
								}
								arg0.P(local28, local70, local44, local84, local175, 0);
							} else if (local179 <= 0) {
								method3868(arg0, local28, local70, local44, local84, local175, local177, aByteArray64[local173], null, null, true);
							} else if (local179 == 65535) {
								@Pc(282) Class1_Sub26 local282 = (Class1_Sub26) aClass38_25.method765((long) (local50 << 16 | local93));
								if (local282 != null) {
									method3868(arg0, local28, local70, local44, local84, local175, local177, aByteArray64[local173], local282.aShortArray77, local282.aByteArray53, true);
								}
							} else {
								aShortArray89[0] = (short) (local179 - 1);
								aByteArray63[0] = aByteArray67[local173];
								method3868(arg0, local28, local70, local44, local84, local175, local177, aByteArray64[local173], aShortArray89, aByteArray63, true);
							}
						}
					}
				} else {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt5034 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt5034 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (aClass1_Sub1_Sub17_2.anInt7421 != -1) {
							local93 = aClass1_Sub1_Sub17_2.anInt7421 | 0xFF000000;
						} else if ((local17 + anInt5037 & 0x4) == (local57 + anInt5038 & 0x4)) {
							local93 = anIntArray476[aClass251_5.anInt7374 + 1];
						} else {
							local93 = -11840664;
						}
						if (local93 == 0) {
							local93 = -16777216;
						}
						arg0.P(local28, local70, local44, local84, local93, 0);
					}
				}
			}
		}
		for (local28 = -16; local28 < local3 + 16; local28++) {
			local40 = (arg1 * local28 >> 16) + anInt5033;
			local44 = (arg1 * (local28 + 1) >> 16) + anInt5033;
			local50 = local44 - local40;
			if (local50 > 0) {
				local57 = local28 + anInt5037;
				if (local57 >= 0 && local57 < anInt5032) {
					for (local70 = -16; local70 < local7 + 16; local70++) {
						local80 = anInt5034 - (arg2 * (local70 + 1) >> 16);
						local84 = anInt5034 - (arg2 * local70 >> 16);
						local93 = local84 - local80;
						if (local93 > 0) {
							local173 = local70 + anInt5036;
							if (local173 >= 0 && local173 < anInt5031) {
								local175 = aShortArray91[local57 + local173 * anInt5032] & 0xFFFF;
								if (local175 <= 0) {
									method3851(arg0, local40, local80, local50, local93, null, null);
								} else if (local175 == 65535) {
									@Pc(459) Class1_Sub26 local459 = (Class1_Sub26) aClass38_25.method765((long) (local57 << 16 | local173));
									if (local459 != null) {
										method3851(arg0, local40, local80, local50, local93, local459.aShortArray77, local459.aByteArray53);
									}
								} else {
									aShortArray89[0] = (short) (local175 - 1);
									aByteArray63[0] = aByteArray67[local57 + local173 * anInt5032];
									method3851(arg0, local40, local80, local50, local93, aShortArray89, aByteArray63);
								}
							}
						}
					}
				}
			}
		}
		local40 = anInt5037 >> 6;
		local44 = anInt5036 >> 6;
		if (local40 < 0) {
			local40 = 0;
		}
		if (local44 < 0) {
			local44 = 0;
		}
		local50 = anInt5035 >> 6;
		local57 = anInt5038 >> 6;
		if (local50 >= aClass117ArrayArrayArray2[0].length) {
			local50 = aClass117ArrayArrayArray2[0].length - 1;
		}
		if (local57 >= aClass117ArrayArrayArray2[0][0].length) {
			local57 = aClass117ArrayArrayArray2[0][0].length - 1;
		}
		for (local70 = 0; local70 < 3; local70++) {
			@Pc(641) int local641;
			@Pc(653) int local653;
			@Pc(665) int local665;
			@Pc(675) int local675;
			@Pc(631) int local631;
			for (local80 = local40; local80 <= local50; local80++) {
				for (local84 = local44; local84 <= local57; local84++) {
					@Pc(589) Class117 local589 = aClass117ArrayArrayArray2[local70][local80][local84];
					if (local589 != null) {
						local173 = (local80 + (anInt5040 >> 6)) * 64;
						local175 = (local84 + (anInt5030 >> 6)) * 64;
						for (@Pc(612) Class41_Sub6 local612 = (Class41_Sub6) local589.method2967(); local612 != null; local612 = (Class41_Sub6) local589.method2970()) {
							local179 = local173 + local612.aByte86 - anInt5040 - anInt5037;
							local631 = local175 + local612.aByte87 - anInt5030 - anInt5036;
							local641 = (arg1 * local179 >> 16) + anInt5033;
							local653 = (arg1 * (local179 + 1) >> 16) + anInt5033;
							local665 = anInt5034 - (arg2 * (local631 + 1) >> 16);
							local675 = anInt5034 - (arg2 * local631 >> 16);
							method3868(arg0, local641, local665, local653 - local641, local675 - local665, local612.anInt6430, local612.aByte88 & 0xFF, local612.aByte85, local612.aShortArray116, local612.aByteArray78, false);
						}
					}
				}
			}
			for (local84 = local40; local84 <= local50; local84++) {
				for (local93 = local44; local93 <= local57; local93++) {
					@Pc(727) Class117 local727 = aClass117ArrayArrayArray2[local70][local84][local93];
					if (local727 != null) {
						local175 = (local84 + (anInt5040 >> 6)) * 64;
						local177 = (local93 + (anInt5030 >> 6)) * 64;
						for (@Pc(750) Class41_Sub6 local750 = (Class41_Sub6) local727.method2967(); local750 != null; local750 = (Class41_Sub6) local727.method2970()) {
							local631 = local175 + local750.aByte86 - anInt5040 - anInt5037;
							local641 = local177 + local750.aByte87 - anInt5030 - anInt5036;
							local653 = (arg1 * local631 >> 16) + anInt5033;
							local665 = (arg1 * (local631 + 1) >> 16) + anInt5033;
							local675 = anInt5034 - (arg2 * (local641 + 1) >> 16);
							@Pc(813) int local813 = anInt5034 - (arg2 * local641 >> 16);
							method3851(arg0, local653, local675, local665 - local653, local813 - local675, local750.aShortArray116, local750.aByteArray78);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "()V")
	private static void method3858() {
		@Pc(4) int local4;
		@Pc(15) int local15;
		@Pc(49) int local49;
		for (@Pc(1) int local1 = 0; local1 < anInt5032; local1++) {
			for (local4 = 0; local4 < anInt5031; local4++) {
				local15 = aShortArray91[local1 + local4 * anInt5032] & 0xFFFF;
				if (local15 != 0) {
					@Pc(35) int local35;
					if (local15 == 65535) {
						@Pc(31) Class1_Sub26 local31 = (Class1_Sub26) aClass38_25.method765((long) (local1 << 16 | local4));
						if (local31 != null) {
							for (local35 = 0; local35 < local31.aShortArray77.length; local35++) {
								@Pc(46) Class192 local46 = aClass161_2.method3628(local31.aShortArray77[local35] & 0xFFFF);
								local49 = local46.anInt5687;
								if (local46.anIntArray532 != null) {
									local46 = local46.method4369(anInterface4_2);
									if (local46 != null) {
										local49 = local46.anInt5687;
									}
								}
								if (local49 != -1) {
									@Pc(70) Class1_Sub28 local70 = new Class1_Sub28(local49);
									local70.anInt4938 = local1;
									local70.anInt4936 = local4;
									aClass203_40.method4551(local70);
								}
							}
						}
					} else {
						@Pc(94) Class192 local94 = aClass161_2.method3628(local15 - 1);
						local35 = local94.anInt5687;
						if (local94.anIntArray532 != null) {
							local94 = local94.method4369(anInterface4_2);
							if (local94 != null) {
								local35 = local94.anInt5687;
							}
						}
						if (local35 != -1) {
							@Pc(118) Class1_Sub28 local118 = new Class1_Sub28(local35);
							local118.anInt4938 = local1;
							local118.anInt4936 = local4;
							aClass203_40.method4551(local118);
						}
					}
				}
			}
		}
		for (local4 = 0; local4 < 3; local4++) {
			for (local15 = 0; local15 < aClass117ArrayArrayArray2[0].length; local15++) {
				for (@Pc(144) int local144 = 0; local144 < aClass117ArrayArrayArray2[0][0].length; local144++) {
					@Pc(153) Class117 local153 = aClass117ArrayArrayArray2[local4][local15][local144];
					if (local153 != null) {
						for (@Pc(160) Class41_Sub6 local160 = (Class41_Sub6) local153.method2967(); local160 != null; local160 = (Class41_Sub6) local153.method2970()) {
							if (local160.aShortArray116 != null) {
								for (local49 = 0; local49 < local160.aShortArray116.length; local49++) {
									@Pc(177) Class192 local177 = aClass161_2.method3628(local160.aShortArray116[local49] & 0xFFFF);
									@Pc(180) int local180 = local177.anInt5687;
									if (local177.anIntArray532 != null) {
										local177 = local177.method4369(anInterface4_2);
										if (local177 != null) {
											local180 = local177.anInt5687;
										}
									}
									if (local180 != -1) {
										@Pc(201) Class1_Sub28 local201 = new Class1_Sub28(local180);
										local201.anInt4938 = (local15 + (anInt5040 >> 6)) * 64 + local160.aByte86 - anInt5040;
										local201.anInt4936 = (local144 + (anInt5030 >> 6)) * 64 + local160.aByte87 - anInt5030;
										aClass203_40.method4551(local201);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(Lclient!za;IIII)Lclient!pu;")
	private static Class203 method3860(@OriginalArg(0) Class106 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(4) Class1_Sub28 local4 = (Class1_Sub28) aClass203_40.method4548(); local4 != null; local4 = (Class1_Sub28) aClass203_40.method4545()) {
			method3869(arg0, local4, arg1, arg2);
		}
		return aClass203_40;
	}

	@OriginalMember(owner = "client!ss", name = "d", descriptor = "()V")
	public static void method3861() {
		aByteArray68 = null;
		aByteArray66 = null;
		aShortArray90 = null;
		aByteArray65 = null;
		aByteArray64 = null;
		aShortArray91 = null;
		aByteArray67 = null;
		aClass38_25 = null;
		aClass117ArrayArrayArray2 = null;
		anIntArray476 = null;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!za;)Lclient!pu;")
	public static Class203 method3862(@OriginalArg(0) Class106 arg0) {
		@Pc(3) int local3 = anInt5035 - anInt5037;
		@Pc(7) int local7 = anInt5038 - anInt5036;
		@Pc(15) int local15 = (anInt5041 - anInt5033 << 16) / local3;
		@Pc(23) int local23 = (anInt5034 - anInt5039 << 16) / local7;
		return method3860(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(II)Lclient!vt;")
	public static Class262 method3863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class262 local3 = new Class262();
		for (@Pc(8) Class1_Sub1_Sub17 local8 = (Class1_Sub1_Sub17) aClass38_24.method767(); local8 != null; local8 = (Class1_Sub1_Sub17) aClass38_24.method773()) {
			if (local8.aBoolean475 && local8.method5651(arg0, arg1)) {
				local3.method5876(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!ss", name = "e", descriptor = "()V")
	public static void method3864() {
		aByteArray68 = new byte[anInt5032 * anInt5031];
		aByteArray65 = new byte[anInt5032 * anInt5031];
		aByteArray64 = new byte[anInt5032 * anInt5031];
		aShortArray91 = new short[anInt5032 * anInt5031];
		aByteArray67 = new byte[anInt5032 * anInt5031];
		aClass38_25 = new Class38(1024);
		aClass117ArrayArrayArray2 = new Class117[3][anInt5032 >> 6][anInt5031 >> 6];
		anIntArray476 = new int[aClass251_5.anInt7367 + 1];
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!qs;Lclient!uo;Lclient!ot;Lclient!ls;Lclient!mj;Lclient!fd;Lclient!im;)V")
	public static void method3865(@OriginalArg(0) Class211 arg0, @OriginalArg(1) Class251 arg1, @OriginalArg(2) Class191 arg2, @OriginalArg(3) Class161 arg3, @OriginalArg(4) Class170 arg4, @OriginalArg(5) Class84 arg5, @OriginalArg(6) Interface4 arg6) {
		aClass211_68 = arg0;
		aClass251_5 = arg1;
		aClass191_4 = arg2;
		aClass161_2 = arg3;
		aClass170_4 = arg4;
		aClass84_4 = arg5;
		anInterface4_2 = arg6;
		aClass38_24.method774();
		@Pc(21) int local21 = aClass211_68.method4759("details");
		@Pc(26) int[] local26 = aClass211_68.method4755(local21);
		if (local26 != null) {
			for (@Pc(30) int local30 = 0; local30 < local26.length; local30++) {
				@Pc(39) Class1_Sub1_Sub17 local39 = Static114.method1850(aClass211_68, local26[local30], local21);
				aClass38_24.method766(local39, (long) local39.anInt7427);
			}
		}
		Static53.method996(false, true);
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(Lclient!za;)V")
	public static void method3866(@OriginalArg(0) Class106 arg0) {
		@Pc(3) int local3 = anInt5035 - anInt5037;
		@Pc(7) int local7 = anInt5038 - anInt5036;
		@Pc(15) int local15 = (anInt5041 - anInt5033 << 16) / local3;
		@Pc(23) int local23 = (anInt5034 - anInt5039 << 16) / local7;
		method3857(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt5037 = arg0 - anInt5040;
		anInt5038 = arg1 - anInt5030;
		anInt5035 = arg2 - anInt5040;
		anInt5036 = arg3 - anInt5030;
		anInt5033 = arg4;
		anInt5039 = arg5;
		anInt5041 = arg6;
		anInt5034 = arg7;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!za;IIIIIII[S[BZ)V")
	private static void method3868(@OriginalArg(0) Class106 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) boolean arg10) {
		@Pc(20) int local20;
		@Pc(32) int local32;
		if (arg10 || arg5 != 0 || arg6 > 0) {
			if (arg6 == 0) {
				arg0.P(arg1, arg2, arg3, arg4, arg5, 0);
			} else {
				local20 = arg7 & 0x3F;
				if (local20 == 0 || arg3 <= 1 || arg4 <= 1) {
					local32 = anIntArray476[arg6];
					if (arg10 || local32 != 0) {
						arg0.P(arg1, arg2, arg3, arg4, local32, 0);
					}
				} else {
					local32 = arg10 ? 0 : 1;
					Static436.method5871(anIntArray476[arg6], arg1, arg5, arg0, local32, arg7 >> 6 & 0x3, arg2, arg4, aByteArrayArrayArray18, local20, anInt5028, arg3);
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
				@Pc(127) Class192 local127 = aClass161_2.method3628(arg8[local100] & 0xFFFF);
				if (local127.anInt5683 == -1) {
					@Pc(133) int local133 = -3355444;
					if (local127.anInt5666 == 1) {
						local133 = -3407872;
					}
					@Pc(147) int local147 = arg9[local100] >> 6 & 0x3;
					if (local107 == 0) {
						if (local147 == 0) {
							arg0.IA(arg1, arg2, arg4, local133, 0);
						} else if (local147 == 1) {
							arg0.ma(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 2) {
							arg0.IA(local20, arg2, arg4, local133, 0);
						} else {
							arg0.ma(arg1, local32, arg3, local133, 0);
						}
					} else if (local107 == 2) {
						if (local147 == 0) {
							arg0.IA(arg1, arg2, arg4, -1, 0);
							arg0.ma(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 1) {
							arg0.IA(local20, arg2, arg4, -1, 0);
							arg0.ma(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 2) {
							arg0.IA(local20, arg2, arg4, -1, 0);
							arg0.ma(arg1, local32, arg3, local133, 0);
						} else {
							arg0.IA(arg1, arg2, arg4, -1, 0);
							arg0.ma(arg1, local32, arg3, local133, 0);
						}
					} else if (local107 == 3) {
						if (local147 == 0) {
							arg0.ma(arg1, arg2, 1, local133, 0);
						} else if (local147 == 1) {
							arg0.ma(local20, arg2, 1, local133, 0);
						} else if (local147 == 2) {
							arg0.ma(local20, local32, 1, local133, 0);
						} else {
							arg0.ma(arg1, local32, 1, local133, 0);
						}
					} else if (local107 == 9) {
						@Pc(313) int local313;
						if (local147 == 0 || local147 == 2) {
							for (local313 = 0; local313 < arg4; local313++) {
								arg0.ma(arg1 + local313, local32 - local313, 1, local133, 0);
							}
						} else {
							for (local313 = 0; local313 < arg4; local313++) {
								arg0.ma(arg1 + local313, arg2 + local313, 1, local133, 0);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!za;Lclient!mo;IIII)V")
	private static void method3869(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class1_Sub28 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1.anInt4941 = anInt5033 + (arg2 * (arg1.anInt4938 - anInt5037) >> 16);
		arg1.anInt4934 = anInt5034 - (arg3 * (arg1.anInt4936 - anInt5036) >> 16);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!za;II)V")
	public static void method3870(@OriginalArg(0) Class106 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class1_Sub3 local9 = new Class1_Sub3(aClass211_68.method4749("area", aClass1_Sub1_Sub17_2.aString65));
		@Pc(13) int local13 = local9.method1171();
		@Pc(16) int[] local16 = new int[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			local16[local18] = local9.method1171();
		}
		@Pc(33) int local33 = local9.method1171();
		@Pc(36) int[] local36 = new int[local33];
		for (@Pc(38) int local38 = 0; local38 < local33; local38++) {
			local36[local38] = local9.method1171();
		}
		while (true) {
			@Pc(58) int local58;
			@Pc(64) int local64;
			@Pc(67) int local67;
			@Pc(76) int local76;
			@Pc(148) int local148;
			while (local9.anInt1710 < local9.aByteArray14.length) {
				@Pc(62) int local62;
				@Pc(84) int local84;
				if (local9.method1171() == 0) {
					local58 = local9.method1171();
					local62 = local9.method1171();
					for (local64 = 0; local64 < 64; local64++) {
						for (local67 = 0; local67 < 64; local67++) {
							local76 = local58 * 64 + local64 - anInt5040;
							local84 = local62 * 64 + local67 - anInt5030;
							method3855(arg0, local9, local58, local62, local76, local84, local16, local36);
						}
					}
				} else {
					local58 = local9.method1171();
					local62 = local9.method1171();
					local64 = local9.method1171();
					local67 = local9.method1171();
					for (local76 = 0; local76 < 8; local76++) {
						for (local84 = 0; local84 < 8; local84++) {
							@Pc(136) int local136 = local58 * 64 + local64 * 8 + local76 - anInt5040;
							local148 = local62 * 64 + local67 * 8 + local84 - anInt5030;
							method3855(arg0, local9, local58, local62, local136, local148, local16, local36);
						}
					}
				}
			}
			aByteArray66 = new byte[anInt5032 * anInt5031];
			aShortArray90 = new short[anInt5032 * anInt5031];
			for (local58 = 0; local58 < 3; local58++) {
				@Pc(191) byte[] local191 = new byte[anInt5032 * anInt5031];
				for (local64 = 0; local64 < aClass117ArrayArrayArray2[local58].length; local64++) {
					for (local67 = 0; local67 < aClass117ArrayArrayArray2[local58][0].length; local67++) {
						@Pc(205) Class117 local205 = aClass117ArrayArrayArray2[local58][local64][local67];
						if (local205 != null) {
							for (@Pc(212) Class41_Sub6 local212 = (Class41_Sub6) local205.method2967(); local212 != null; local212 = (Class41_Sub6) local205.method2970()) {
								local191[local64 * 64 + local212.aByte86 + (local67 * 64 + local212.aByte87) * anInt5032] = (byte) local212.anInt6430;
							}
						}
					}
				}
				method3856(local191, aByteArray66, aShortArray90, arg1, arg2);
				for (local67 = 0; local67 < aClass117ArrayArrayArray2[local58].length; local67++) {
					for (local76 = 0; local76 < aClass117ArrayArrayArray2[local58][0].length; local76++) {
						@Pc(276) Class117 local276 = aClass117ArrayArrayArray2[local58][local67][local76];
						if (local276 != null) {
							for (@Pc(283) Class41_Sub6 local283 = (Class41_Sub6) local276.method2967(); local283 != null; local283 = (Class41_Sub6) local276.method2970()) {
								local148 = local67 * 64 + local283.aByte86 + (local76 * 64 + local283.aByte87) * anInt5032;
								local283.anInt6430 = (aByteArray66[local148] & 0xFF) << 16 | aShortArray90[local148] & 0xFFFF;
								if (local283.anInt6430 != 0) {
									local283.anInt6430 |= 0xFF000000;
								}
							}
						}
					}
				}
			}
			method3856(aByteArray68, aByteArray66, aShortArray90, arg1, arg2);
			aByteArray68 = null;
			method3858();
			return;
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!l;III)I")
	private static int method3871(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class92 local4 = aClass251_5.method5608(arg1);
		if (local4 == null) {
			return 0;
		}
		@Pc(11) int local11 = local4.anInt2784;
		if (local11 >= 0 && arg0.method78(local11).aBoolean274) {
			local11 = -1;
		}
		@Pc(68) int local68;
		@Pc(27) int local27;
		@Pc(33) int local33;
		@Pc(55) int local55;
		if (local4.anInt2778 >= 0) {
			local27 = local4.anInt2778;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static238.anIntArray440[Static285.method4173(Static316.method4526(local55)) & 0xFFFF] | 0xFF000000;
		} else if (local11 >= 0) {
			local68 = Static238.anIntArray440[Static285.method4173(Static316.method4526(arg0.method78(local11).aShort59)) & 0xFFFF] | 0xFF000000;
		} else if (local4.anInt2775 == -1) {
			local68 = 0;
		} else {
			local27 = local4.anInt2775;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static238.anIntArray440[Static285.method4173(Static316.method4526(local55)) & 0xFFFF] | 0xFF000000;
		}
		return local68;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!l;II)V")
	public static void method3872(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < aClass251_5.anInt7367; local1++) {
			anIntArray476[local1 + 1] = method3871(arg0, local1, arg1, arg2);
		}
	}
}
