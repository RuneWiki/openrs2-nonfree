import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!to", name = "a", descriptor = "Lclient!tg;")
	public static Class6_Sub2_Sub19 aClass6_Sub2_Sub19_2;

	@OriginalMember(owner = "client!to", name = "b", descriptor = "Lclient!dp;")
	public static Class53 aClass53_34;

	@OriginalMember(owner = "client!to", name = "e", descriptor = "Lclient!d;")
	public static Class41 aClass41_3;

	@OriginalMember(owner = "client!to", name = "h", descriptor = "I")
	public static int anInt1191;

	@OriginalMember(owner = "client!to", name = "i", descriptor = "F")
	public static float aFloat17;

	@OriginalMember(owner = "client!to", name = "k", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!to", name = "m", descriptor = "F")
	public static float aFloat18;

	@OriginalMember(owner = "client!to", name = "n", descriptor = "[S")
	private static short[] aShortArray11;

	@OriginalMember(owner = "client!to", name = "o", descriptor = "Lclient!jj;")
	private static Class108 aClass108_12;

	@OriginalMember(owner = "client!to", name = "p", descriptor = "[B")
	private static byte[] aByteArray16;

	@OriginalMember(owner = "client!to", name = "q", descriptor = "I")
	public static int anInt1193;

	@OriginalMember(owner = "client!to", name = "r", descriptor = "I")
	public static int anInt1194;

	@OriginalMember(owner = "client!to", name = "s", descriptor = "I")
	public static int anInt1195;

	@OriginalMember(owner = "client!to", name = "t", descriptor = "[B")
	private static byte[] aByteArray17;

	@OriginalMember(owner = "client!to", name = "u", descriptor = "I")
	public static int anInt1196;

	@OriginalMember(owner = "client!to", name = "v", descriptor = "I")
	public static int anInt1197;

	@OriginalMember(owner = "client!to", name = "w", descriptor = "[[[Lclient!jl;")
	private static Class109[][][] aClass109ArrayArrayArray2;

	@OriginalMember(owner = "client!to", name = "x", descriptor = "I")
	public static int anInt1198;

	@OriginalMember(owner = "client!to", name = "y", descriptor = "[I")
	private static int[] anIntArray129;

	@OriginalMember(owner = "client!to", name = "z", descriptor = "I")
	public static int anInt1199;

	@OriginalMember(owner = "client!to", name = "A", descriptor = "I")
	public static int anInt1200;

	@OriginalMember(owner = "client!to", name = "B", descriptor = "[B")
	private static byte[] aByteArray18;

	@OriginalMember(owner = "client!to", name = "C", descriptor = "I")
	public static int anInt1201;

	@OriginalMember(owner = "client!to", name = "D", descriptor = "I")
	public static int anInt1202;

	@OriginalMember(owner = "client!to", name = "E", descriptor = "[S")
	private static short[] aShortArray12;

	@OriginalMember(owner = "client!to", name = "F", descriptor = "I")
	public static int anInt1203;

	@OriginalMember(owner = "client!to", name = "G", descriptor = "[B")
	private static byte[] aByteArray19;

	@OriginalMember(owner = "client!to", name = "H", descriptor = "[B")
	private static byte[] aByteArray20;

	@OriginalMember(owner = "client!to", name = "I", descriptor = "I")
	public static int anInt1204;

	@OriginalMember(owner = "client!to", name = "c", descriptor = "Lclient!jj;")
	private static final Class108 aClass108_11 = new Class108(16);

	@OriginalMember(owner = "client!to", name = "d", descriptor = "I")
	public static int anInt1190 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!to", name = "f", descriptor = "Lclient!vq;")
	public static final Class211 aClass211_7 = new Class211();

	@OriginalMember(owner = "client!to", name = "g", descriptor = "[B")
	private static final byte[] aByteArray15 = new byte[1];

	@OriginalMember(owner = "client!to", name = "j", descriptor = "I")
	public static int anInt1192 = (int) (Math.random() * 11.0D) - 5;

	@OriginalMember(owner = "client!to", name = "l", descriptor = "[S")
	private static final short[] aShortArray10 = new short[1];

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(II)Lclient!nk;")
	public static Class143 method1089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class143 local3 = new Class143();
		for (@Pc(8) Class6_Sub2_Sub19 local8 = (Class6_Sub2_Sub19) aClass108_11.method2903(); local8 != null; local8 = (Class6_Sub2_Sub19) aClass108_11.method2905()) {
			if (local8.aBoolean385 && local8.method5158(arg1, arg0)) {
				local3.method3765(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!ja;Lclient!rr;IIII)V")
	private static void method1090(@OriginalArg(0) Class81 arg0, @OriginalArg(1) Class6_Sub35 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1.anInt5322 = anInt1196 + (arg2 * (arg1.anInt5320 - anInt1201) >> 16);
		arg1.anInt5323 = anInt1203 - (arg3 * (arg1.anInt5324 - anInt1204) >> 16);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!ja;II)V")
	public static void method1091(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class6_Sub10 local9 = new Class6_Sub10(aClass53_34.method1006("area", aClass6_Sub2_Sub19_2.aString257));
		@Pc(13) int local13 = local9.method3972();
		@Pc(16) int[] local16 = new int[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			local16[local18] = local9.method3972();
		}
		@Pc(33) int local33 = local9.method3972();
		@Pc(36) int[] local36 = new int[local33];
		for (@Pc(38) int local38 = 0; local38 < local33; local38++) {
			local36[local38] = local9.method3972();
		}
		while (true) {
			@Pc(58) int local58;
			@Pc(64) int local64;
			@Pc(67) int local67;
			@Pc(76) int local76;
			@Pc(148) int local148;
			while (local9.anInt4188 < local9.aByteArray67.length) {
				@Pc(62) int local62;
				@Pc(84) int local84;
				if (local9.method3972() == 0) {
					local58 = local9.method3972();
					local62 = local9.method3972();
					for (local64 = 0; local64 < 64; local64++) {
						for (local67 = 0; local67 < 64; local67++) {
							local76 = local58 * 64 + local64 - anInt1200;
							local84 = local62 * 64 + local67 - anInt1195;
							method1096(arg0, local9, local58, local62, local76, local84, local16, local36);
						}
					}
				} else {
					local58 = local9.method3972();
					local62 = local9.method3972();
					local64 = local9.method3972();
					local67 = local9.method3972();
					for (local76 = 0; local76 < 8; local76++) {
						for (local84 = 0; local84 < 8; local84++) {
							@Pc(136) int local136 = local58 * 64 + local64 * 8 + local76 - anInt1200;
							local148 = local62 * 64 + local67 * 8 + local84 - anInt1195;
							method1096(arg0, local9, local58, local62, local136, local148, local16, local36);
						}
					}
				}
			}
			aByteArray18 = new byte[anInt1202 * anInt1198];
			aShortArray11 = new short[anInt1202 * anInt1198];
			for (local58 = 0; local58 < 3; local58++) {
				@Pc(191) byte[] local191 = new byte[anInt1202 * anInt1198];
				for (local64 = 0; local64 < aClass109ArrayArrayArray2[local58].length; local64++) {
					for (local67 = 0; local67 < aClass109ArrayArrayArray2[local58][0].length; local67++) {
						@Pc(205) Class109 local205 = aClass109ArrayArrayArray2[local58][local64][local67];
						if (local205 != null) {
							for (@Pc(212) Class20_Sub3 local212 = (Class20_Sub3) local205.method2948(); local212 != null; local212 = (Class20_Sub3) local205.method2939()) {
								local191[local64 * 64 + local212.aByte12 + (local67 * 64 + local212.aByte13) * anInt1202] = (byte) local212.anInt1084;
							}
						}
					}
				}
				method1108(local191, aByteArray18, aShortArray11, arg1, arg2);
				for (local67 = 0; local67 < aClass109ArrayArrayArray2[local58].length; local67++) {
					for (local76 = 0; local76 < aClass109ArrayArrayArray2[local58][0].length; local76++) {
						@Pc(276) Class109 local276 = aClass109ArrayArrayArray2[local58][local67][local76];
						if (local276 != null) {
							for (@Pc(283) Class20_Sub3 local283 = (Class20_Sub3) local276.method2948(); local283 != null; local283 = (Class20_Sub3) local276.method2939()) {
								local148 = local67 * 64 + local283.aByte12 + (local76 * 64 + local283.aByte13) * anInt1202;
								local283.anInt1084 = (aByteArray18[local148] & 0xFF) << 16 | aShortArray11[local148] & 0xFFFF;
								if (local283.anInt1084 != 0) {
									local283.anInt1084 |= 0xFF000000;
								}
							}
						}
					}
				}
			}
			method1108(aByteArray17, aByteArray18, aShortArray11, arg1, arg2);
			aByteArray17 = null;
			method1111();
			return;
		}
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(II)Lclient!tg;")
	public static Class6_Sub2_Sub19 method1092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class6_Sub2_Sub19 local4 = (Class6_Sub2_Sub19) aClass108_11.method2903(); local4 != null; local4 = (Class6_Sub2_Sub19) aClass108_11.method2905()) {
			if (local4.aBoolean385 && local4.method5158(arg1, arg0)) {
				return local4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!ja;IIII)V")
	private static void method1093(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = anInt1193 - anInt1201;
		@Pc(7) int local7 = anInt1197 - anInt1204;
		if (anInt1193 < anInt1202) {
			local3++;
		}
		if (anInt1197 < anInt1198) {
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
			local28 = (arg1 * local17 >> 16) + anInt1196;
			local40 = (arg1 * (local17 + 1) >> 16) + anInt1196;
			local44 = local40 - local28;
			if (local44 > 0) {
				local50 = anInt1201 + local17;
				if (local50 >= 0 && local50 < anInt1202) {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt1203 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt1203 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (local84 > 0) {
							local93 = local57 + anInt1204;
							local172 = local50 + local93 * anInt1202;
							local174 = 0;
							local176 = 0;
							local178 = 0;
							if (local93 >= 0 && local93 < anInt1198) {
								local174 = (aByteArray18[local172] & 0xFF) << 16 | aShortArray11[local172] & 0xFFFF;
								if (local174 != 0) {
									local174 |= 0xFF000000;
								}
								local176 = aByteArray19[local172] & 0xFF;
								local178 = aShortArray12[local172] & 0xFFFF;
							}
							if (local174 == 0 && local176 == 0 && local178 == 0) {
								if (aClass6_Sub2_Sub19_2.anInt5684 != -1) {
									local174 = aClass6_Sub2_Sub19_2.anInt5684 | 0xFF000000;
								} else if ((local17 + anInt1201 & 0x4) == (local57 + anInt1197 & 0x4)) {
									local174 = anIntArray129[Static309.anInt5825 + 1];
								} else {
									local174 = -11840664;
								}
								if (local174 == 0) {
									local174 = -16777216;
								}
								arg0.method2962(local28, local70, local44, local84, local174, 0);
							} else if (local178 <= 0) {
								method1106(arg0, local28, local70, local44, local84, local174, local176, aByteArray16[local172], null, null, true);
							} else if (local178 == 65535) {
								@Pc(280) Class6_Sub19 local280 = (Class6_Sub19) aClass108_12.method2900((long) (local50 << 16 | local93));
								if (local280 != null) {
									method1106(arg0, local28, local70, local44, local84, local174, local176, aByteArray16[local172], local280.aShortArray55, local280.aByteArray48, true);
								}
							} else {
								aShortArray10[0] = (short) (local178 - 1);
								aByteArray15[0] = aByteArray20[local172];
								method1106(arg0, local28, local70, local44, local84, local174, local176, aByteArray16[local172], aShortArray10, aByteArray15, true);
							}
						}
					}
				} else {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt1203 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt1203 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (aClass6_Sub2_Sub19_2.anInt5684 != -1) {
							local93 = aClass6_Sub2_Sub19_2.anInt5684 | 0xFF000000;
						} else if ((local17 + anInt1201 & 0x4) == (local57 + anInt1197 & 0x4)) {
							local93 = anIntArray129[Static309.anInt5825 + 1];
						} else {
							local93 = -11840664;
						}
						if (local93 == 0) {
							local93 = -16777216;
						}
						arg0.method2962(local28, local70, local44, local84, local93, 0);
					}
				}
			}
		}
		for (local28 = -16; local28 < local3 + 16; local28++) {
			local40 = (arg1 * local28 >> 16) + anInt1196;
			local44 = (arg1 * (local28 + 1) >> 16) + anInt1196;
			local50 = local44 - local40;
			if (local50 > 0) {
				local57 = local28 + anInt1201;
				if (local57 >= 0 && local57 < anInt1202) {
					for (local70 = -16; local70 < local7 + 16; local70++) {
						local80 = anInt1203 - (arg2 * (local70 + 1) >> 16);
						local84 = anInt1203 - (arg2 * local70 >> 16);
						local93 = local84 - local80;
						if (local93 > 0) {
							local172 = local70 + anInt1204;
							if (local172 >= 0 && local172 < anInt1198) {
								local174 = aShortArray12[local57 + local172 * anInt1202] & 0xFFFF;
								if (local174 <= 0) {
									method1100(arg0, local40, local80, local50, local93, null, null);
								} else if (local174 == 65535) {
									@Pc(457) Class6_Sub19 local457 = (Class6_Sub19) aClass108_12.method2900((long) (local57 << 16 | local172));
									if (local457 != null) {
										method1100(arg0, local40, local80, local50, local93, local457.aShortArray55, local457.aByteArray48);
									}
								} else {
									aShortArray10[0] = (short) (local174 - 1);
									aByteArray15[0] = aByteArray20[local57 + local172 * anInt1202];
									method1100(arg0, local40, local80, local50, local93, aShortArray10, aByteArray15);
								}
							}
						}
					}
				}
			}
		}
		local40 = anInt1201 >> 6;
		local44 = anInt1204 >> 6;
		if (local40 < 0) {
			local40 = 0;
		}
		if (local44 < 0) {
			local44 = 0;
		}
		local50 = anInt1193 >> 6;
		local57 = anInt1197 >> 6;
		if (local50 >= aClass109ArrayArrayArray2[0].length) {
			local50 = aClass109ArrayArrayArray2[0].length - 1;
		}
		if (local57 >= aClass109ArrayArrayArray2[0][0].length) {
			local57 = aClass109ArrayArrayArray2[0][0].length - 1;
		}
		for (local70 = 0; local70 < 3; local70++) {
			@Pc(639) int local639;
			@Pc(651) int local651;
			@Pc(663) int local663;
			@Pc(673) int local673;
			@Pc(629) int local629;
			for (local80 = local40; local80 <= local50; local80++) {
				for (local84 = local44; local84 <= local57; local84++) {
					@Pc(587) Class109 local587 = aClass109ArrayArrayArray2[local70][local80][local84];
					if (local587 != null) {
						local172 = (local80 + (anInt1200 >> 6)) * 64;
						local174 = (local84 + (anInt1195 >> 6)) * 64;
						for (@Pc(610) Class20_Sub3 local610 = (Class20_Sub3) local587.method2948(); local610 != null; local610 = (Class20_Sub3) local587.method2939()) {
							local178 = local172 + local610.aByte12 - anInt1200 - anInt1201;
							local629 = local174 + local610.aByte13 - anInt1195 - anInt1204;
							local639 = (arg1 * local178 >> 16) + anInt1196;
							local651 = (arg1 * (local178 + 1) >> 16) + anInt1196;
							local663 = anInt1203 - (arg2 * (local629 + 1) >> 16);
							local673 = anInt1203 - (arg2 * local629 >> 16);
							method1106(arg0, local639, local663, local651 - local639, local673 - local663, local610.anInt1084, local610.aByte15 & 0xFF, local610.aByte14, local610.aShortArray6, local610.aByteArray8, false);
						}
					}
				}
			}
			for (local84 = local40; local84 <= local50; local84++) {
				for (local93 = local44; local93 <= local57; local93++) {
					@Pc(725) Class109 local725 = aClass109ArrayArrayArray2[local70][local84][local93];
					if (local725 != null) {
						local174 = (local84 + (anInt1200 >> 6)) * 64;
						local176 = (local93 + (anInt1195 >> 6)) * 64;
						for (@Pc(748) Class20_Sub3 local748 = (Class20_Sub3) local725.method2948(); local748 != null; local748 = (Class20_Sub3) local725.method2939()) {
							local629 = local174 + local748.aByte12 - anInt1200 - anInt1201;
							local639 = local176 + local748.aByte13 - anInt1195 - anInt1204;
							local651 = (arg1 * local629 >> 16) + anInt1196;
							local663 = (arg1 * (local629 + 1) >> 16) + anInt1196;
							local673 = anInt1203 - (arg2 * (local639 + 1) >> 16);
							@Pc(811) int local811 = anInt1203 - (arg2 * local639 >> 16);
							method1100(arg0, local651, local673, local663 - local651, local811 - local673, local748.aShortArray6, local748.aByteArray8);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V")
	public static void method1094(@OriginalArg(0) int arg0) {
		aClass6_Sub2_Sub19_2 = (Class6_Sub2_Sub19) aClass108_11.method2900((long) arg0);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt1201 = arg0 - anInt1200;
		anInt1197 = arg1 - anInt1195;
		anInt1193 = arg2 - anInt1200;
		anInt1204 = arg3 - anInt1195;
		anInt1196 = arg4;
		anInt1194 = arg5;
		anInt1199 = arg6;
		anInt1203 = arg7;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!ja;Lclient!ec;IIII[I[I)V")
	private static void method1096(@OriginalArg(0) Class81 arg0, @OriginalArg(1) Class6_Sub10 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		@Pc(3) int local3 = arg1.method3972();
		if ((local3 & 0x1) == 0) {
			@Pc(15) boolean local15 = (local3 & 0x2) == 0;
			@Pc(21) int local21 = local3 >> 2 & 0x3F;
			if (local21 != 62) {
				if (local21 == 63) {
					local21 = arg1.method3972();
				} else if (local15) {
					local21 = arg6[local21];
				} else {
					local21 = arg7[local21];
				}
				if (local15) {
					aByteArray17[arg4 + arg5 * anInt1202] = (byte) local21;
					aByteArray19[arg4 + arg5 * anInt1202] = 0;
				} else {
					aByteArray19[arg4 + arg5 * anInt1202] = (byte) local21;
					aByteArray16[arg4 + arg5 * anInt1202] = 0;
					aByteArray17[arg4 + arg5 * anInt1202] = arg1.method3992();
				}
			}
			return;
		}
		@Pc(100) int local100 = (local3 >> 1 & 0x3) + 1;
		@Pc(108) boolean local108 = (local3 & 0x8) != 0;
		@Pc(116) boolean local116 = (local3 & 0x10) != 0;
		for (@Pc(118) int local118 = 0; local118 < local100; local118++) {
			@Pc(123) int local123 = arg1.method3972();
			@Pc(125) int local125 = 0;
			@Pc(127) int local127 = 0;
			if (local108) {
				local125 = arg1.method3972();
				local127 = arg1.method3972();
			}
			@Pc(139) int local139 = 0;
			if (local116) {
				local139 = arg1.method3972();
			}
			@Pc(215) short[] local215;
			@Pc(218) byte[] local218;
			@Pc(220) int local220;
			if (local118 == 0) {
				aByteArray17[arg4 + arg5 * anInt1202] = (byte) local123;
				aByteArray19[arg4 + arg5 * anInt1202] = (byte) local125;
				aByteArray16[arg4 + arg5 * anInt1202] = (byte) local127;
				if (local139 == 1) {
					aShortArray12[arg4 + arg5 * anInt1202] = (short) (arg1.method4021() + 1);
					aByteArray20[arg4 + arg5 * anInt1202] = arg1.method3992();
				} else if (local139 > 1) {
					aShortArray12[arg4 + arg5 * anInt1202] = -1;
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method4021();
						local218[local220] = arg1.method3992();
					}
					aClass108_12.method2898((long) (arg4 << 16 | arg5), new Class6_Sub19(local215, local218));
				}
			} else {
				local215 = null;
				local218 = null;
				if (local139 > 0) {
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method4021();
						local218[local220] = arg1.method3992();
					}
				}
				if (aClass109ArrayArrayArray2[local118 - 1][arg2 - (anInt1200 >> 6)][arg3 - (anInt1195 >> 6)] == null) {
					aClass109ArrayArrayArray2[local118 - 1][arg2 - (anInt1200 >> 6)][arg3 - (anInt1195 >> 6)] = new Class109();
				}
				@Pc(338) Class20_Sub3 local338 = new Class20_Sub3(arg4 & 0x3F, arg5 & 0x3F, local123, local125, local127, local215, local218);
				aClass109ArrayArrayArray2[local118 - 1][arg2 - (anInt1200 >> 6)][arg3 - (anInt1195 >> 6)].method2935(local338);
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!ja;)V")
	public static void method1097(@OriginalArg(0) Class81 arg0) {
		@Pc(3) int local3 = anInt1193 - anInt1201;
		@Pc(7) int local7 = anInt1197 - anInt1204;
		@Pc(15) int local15 = (anInt1199 - anInt1196 << 16) / local3;
		@Pc(23) int local23 = (anInt1203 - anInt1194 << 16) / local7;
		method1093(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!dp;)V")
	public static void method1098(@OriginalArg(0) Class53 arg0) {
		aClass53_34 = arg0;
		aClass108_11.method2909();
		@Pc(9) int local9 = aClass53_34.method1037("details");
		@Pc(14) int[] local14 = aClass53_34.method1027(local9);
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(25) Class6_Sub2_Sub19 local25 = Static318.method5323(local9, local14[local16], aClass53_34);
			aClass108_11.method2898((long) local25.anInt5674, local25);
		}
		Static10.method192(false);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "()V")
	public static void method1099() {
		aByteArray17 = null;
		aByteArray18 = null;
		aShortArray11 = null;
		aByteArray19 = null;
		aByteArray16 = null;
		aShortArray12 = null;
		aByteArray20 = null;
		aClass108_12 = null;
		aClass109ArrayArrayArray2 = null;
		anIntArray129 = null;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!ja;IIII[S[B)V")
	private static void method1100(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		if (arg5 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < arg5.length; local4++) {
			@Pc(13) Class66 local13 = Static196.method3622(arg5[local4] & 0xFFFF);
			@Pc(16) int local16 = local13.anInt1478;
			if (local16 != -1) {
				@Pc(23) Class80 local23 = Static152.method3077(local16);
				@Pc(47) Class40 local47 = local23.method1721(local13.aBoolean109 ? local13.aBoolean105 : false, local13.aBoolean98 ? arg6[local4] >> 6 & 0x3 : 0, arg0);
				if (local47 != null) {
					@Pc(56) int local56 = arg3 * local47.method5083() >> 2;
					@Pc(63) int local63 = arg4 * local47.method5084() >> 2;
					if (local23.aBoolean128) {
						@Pc(69) int local69 = local13.anInt1489;
						@Pc(72) int local72 = local13.lb;
						if ((arg6[local4] >> 6 & 0x1) == 1) {
							@Pc(83) int local83 = local69;
							local69 = local72;
							local72 = local83;
						}
						local56 = local69 * arg3;
						local63 = local72 * arg4;
					}
					if (local56 != 0 && local63 != 0) {
						if (local23.anInt1743 == 0) {
							local47.method5073(arg1, arg2 + arg4 - local63, local56, local63);
						} else {
							local47.method5082(arg1, arg2 + arg4 - local63, local56, local63, 1, local23.anInt1743 | 0xFF000000, 1);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(I)Lclient!tg;")
	public static Class6_Sub2_Sub19 method1101(@OriginalArg(0) int arg0) {
		return (Class6_Sub2_Sub19) aClass108_11.method2900((long) arg0);
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(Lclient!ja;IIII)Lclient!vq;")
	private static Class211 method1102(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(4) Class6_Sub35 local4 = (Class6_Sub35) aClass211_7.method5594(); local4 != null; local4 = (Class6_Sub35) aClass211_7.method5582()) {
			method1090(arg0, local4, arg1, arg2);
		}
		return aClass211_7;
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "()V")
	public static void method1103() {
		aByteArray17 = new byte[anInt1202 * anInt1198];
		aByteArray19 = new byte[anInt1202 * anInt1198];
		aByteArray16 = new byte[anInt1202 * anInt1198];
		aShortArray12 = new short[anInt1202 * anInt1198];
		aByteArray20 = new byte[anInt1202 * anInt1198];
		aClass108_12 = new Class108(1024);
		aClass109ArrayArrayArray2 = new Class109[3][anInt1202 >> 6][anInt1198 >> 6];
		anIntArray129 = new int[Static226.anInt4220 + 1];
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(Lclient!ja;)Lclient!vq;")
	public static Class211 method1104(@OriginalArg(0) Class81 arg0) {
		@Pc(3) int local3 = anInt1193 - anInt1201;
		@Pc(7) int local7 = anInt1197 - anInt1204;
		@Pc(15) int local15 = (anInt1199 - anInt1196 << 16) / local3;
		@Pc(23) int local23 = (anInt1203 - anInt1194 << 16) / local7;
		return method1102(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!ja;IIIIIII[S[BZ)V")
	private static void method1106(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) boolean arg10) {
		@Pc(20) int local20;
		@Pc(32) int local32;
		if (arg10 || arg5 != 0 || arg6 > 0) {
			if (arg6 == 0) {
				arg0.method2962(arg1, arg2, arg3, arg4, arg5, 0);
			} else {
				local20 = arg7 & 0x3F;
				if (local20 == 0 || arg3 <= 1 || arg4 <= 1) {
					local32 = anIntArray129[arg6];
					if (arg10 || local32 != 0) {
						arg0.method2962(arg1, arg2, arg3, arg4, local32, 0);
					}
				} else {
					local32 = arg10 ? 0 : 1;
					Static317.method5314(local32, arg7 >> 6 & 0x3, arg0, anInt1191, anIntArray129[arg6], arg1, arg2, local20, arg3, aByteArrayArrayArray6, arg5, arg4);
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
				@Pc(126) Class66 local126 = Static196.method3622(arg8[local100] & 0xFFFF);
				if (local126.anInt1478 == -1) {
					@Pc(132) int local132 = -3355444;
					if (local126.anInt1476 == 1) {
						local132 = -3407872;
					}
					@Pc(146) int local146 = arg9[local100] >> 6 & 0x3;
					if (local107 == 0) {
						if (local146 == 0) {
							arg0.method2956(arg1, arg2, arg4, local132, 0);
						} else if (local146 == 1) {
							arg0.method3010(arg1, arg2, arg3, local132, 0);
						} else if (local146 == 2) {
							arg0.method2956(local20, arg2, arg4, local132, 0);
						} else {
							arg0.method3010(arg1, local32, arg3, local132, 0);
						}
					} else if (local107 == 2) {
						if (local146 == 0) {
							arg0.method2956(arg1, arg2, arg4, -1, 0);
							arg0.method3010(arg1, arg2, arg3, local132, 0);
						} else if (local146 == 1) {
							arg0.method2956(local20, arg2, arg4, -1, 0);
							arg0.method3010(arg1, arg2, arg3, local132, 0);
						} else if (local146 == 2) {
							arg0.method2956(local20, arg2, arg4, -1, 0);
							arg0.method3010(arg1, local32, arg3, local132, 0);
						} else {
							arg0.method2956(arg1, arg2, arg4, -1, 0);
							arg0.method3010(arg1, local32, arg3, local132, 0);
						}
					} else if (local107 == 3) {
						if (local146 == 0) {
							arg0.method3010(arg1, arg2, 1, local132, 0);
						} else if (local146 == 1) {
							arg0.method3010(local20, arg2, 1, local132, 0);
						} else if (local146 == 2) {
							arg0.method3010(local20, local32, 1, local132, 0);
						} else {
							arg0.method3010(arg1, local32, 1, local132, 0);
						}
					} else if (local107 == 9) {
						@Pc(312) int local312;
						if (local146 == 0 || local146 == 2) {
							for (local312 = 0; local312 < arg4; local312++) {
								arg0.method3010(arg1 + local312, local32 - local312, 1, local132, 0);
							}
						} else {
							for (local312 = 0; local312 < arg4; local312++) {
								arg0.method3010(arg1 + local312, arg2 + local312, 1, local132, 0);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "d", descriptor = "()V")
	public static void method1107() {
		@Pc(2) int[] local2 = new int[3];
		for (@Pc(4) int local4 = 0; local4 < aClass41_3.anInt969; local4++) {
			@Pc(32) boolean local32 = aClass6_Sub2_Sub19_2.method5160(aClass41_3.anIntArray111[local4] >> 14 & 0x3FFF, aClass41_3.anIntArray111[local4] >> 28 & 0x3, aClass41_3.anIntArray111[local4] & 0x3FFF, local2);
			if (local32) {
				@Pc(42) Class6_Sub35 local42 = new Class6_Sub35(aClass41_3.anIntArray110[local4]);
				local42.anInt5320 = local2[1] - anInt1200;
				local42.anInt5324 = local2[2] - anInt1195;
				aClass211_7.method5585(local42);
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "([B[B[SII)V")
	private static void method1108(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int[] local2 = new int[anInt1198];
		@Pc(5) int[] local5 = new int[anInt1198];
		@Pc(8) int[] local8 = new int[anInt1198];
		@Pc(11) int[] local11 = new int[anInt1198];
		@Pc(14) int[] local14 = new int[anInt1198];
		for (@Pc(16) int local16 = -5; local16 < anInt1202; local16++) {
			@Pc(21) int local21 = local16 + 5;
			@Pc(25) int local25 = local16 - 5;
			@Pc(41) int local41;
			for (@Pc(27) int local27 = 0; local27 < anInt1198; local27++) {
				@Pc(49) Class181 local49;
				@Pc(85) int local85;
				if (local21 < anInt1202) {
					local41 = arg0[local21 + local27 * anInt1202] & 0xFF;
					if (local41 > 0) {
						local49 = Static60.method983(local41 - 1);
						local2[local27] += local49.anInt5369;
						local5[local27] += local49.anInt5379;
						local8[local27] += local49.anInt5371;
						local11[local27] += local49.anInt5368;
						local85 = local14[local27]++;
					}
				}
				if (local25 >= 0) {
					local41 = arg0[local25 + local27 * anInt1202] & 0xFF;
					if (local41 > 0) {
						local49 = Static60.method983(local41 - 1);
						local2[local27] -= local49.anInt5369;
						local5[local27] -= local49.anInt5379;
						local8[local27] -= local49.anInt5371;
						local11[local27] -= local49.anInt5368;
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
				for (@Pc(165) int local165 = -5; local165 < anInt1198; local165++) {
					@Pc(170) int local170 = local165 + 5;
					if (local170 < anInt1198) {
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
						if ((arg0[local16 + local165 * anInt1202] & 0xFF) == 0) {
							local259 = local16 + local165 * anInt1202;
							arg1[local259] = 0;
							arg2[local259] = 0;
						} else {
							local259 = local161 == 0 ? 0 : Static136.method2606(local41 * 256 / local161, local157 / local163, local159 / local163);
							@Pc(292) int local292 = (local259 & 0x7F) + arg4;
							if (local292 < 0) {
								local292 = 0;
							} else if (local292 > 127) {
								local292 = 127;
							}
							@Pc(314) int local314 = (local259 + arg3 & 0xFC00) + (local259 & 0x380) + local292;
							@Pc(320) int local320 = local16 + local165 * anInt1202;
							@Pc(331) int local331 = Static158.anIntArray634[Static154.method3114(Static108.method2192(local314)) & 0xFFFF];
							arg1[local320] = (byte) (local331 >> 16 & 0xFF);
							arg2[local320] = (short) (local331 & 0xFFFF);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!cj;III)I")
	private static int method1109(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class136 local3 = Static211.method3756(arg1);
		if (local3 == null) {
			return 0;
		}
		@Pc(10) int local10 = local3.anInt3688;
		if (local10 >= 0 && arg0.method346(local10).aBoolean162) {
			local10 = -1;
		}
		@Pc(67) int local67;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(54) int local54;
		if (local3.anInt3673 >= 0) {
			local26 = local3.anInt3673;
			local32 = (local26 & 0x7F) + arg3;
			if (local32 < 0) {
				local32 = 0;
			} else if (local32 > 127) {
				local32 = 127;
			}
			local54 = (local26 + arg2 & 0xFC00) + (local26 & 0x380) + local32;
			local67 = Static158.anIntArray634[Static154.method3114(Static63.method1010(local54)) & 0xFFFF] | 0xFF000000;
		} else if (local10 >= 0) {
			local67 = Static158.anIntArray634[Static154.method3114(Static63.method1010(arg0.method346(local10).aShort23)) & 0xFFFF] | 0xFF000000;
		} else if (local3.anInt3679 == -1) {
			local67 = 0;
		} else {
			local26 = local3.anInt3679;
			local32 = (local26 & 0x7F) + arg3;
			if (local32 < 0) {
				local32 = 0;
			} else if (local32 > 127) {
				local32 = 127;
			}
			local54 = (local26 + arg2 & 0xFC00) + (local26 & 0x380) + local32;
			local67 = Static158.anIntArray634[Static154.method3114(Static63.method1010(local54)) & 0xFFFF] | 0xFF000000;
		}
		return local67;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!cj;II)V")
	public static void method1110(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static226.anInt4220; local1++) {
			anIntArray129[local1 + 1] = method1109(arg0, local1, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!to", name = "e", descriptor = "()V")
	private static void method1111() {
		@Pc(4) int local4;
		@Pc(15) int local15;
		for (@Pc(1) int local1 = 0; local1 < anInt1202; local1++) {
			for (local4 = 0; local4 < anInt1198; local4++) {
				local15 = aShortArray12[local1 + local4 * anInt1202] & 0xFFFF;
				if (local15 != 0) {
					if (local15 == 65535) {
						@Pc(31) Class6_Sub19 local31 = (Class6_Sub19) aClass108_12.method2900((long) (local1 << 16 | local4));
						if (local31 != null) {
							for (@Pc(35) int local35 = 0; local35 < local31.aShortArray55.length; local35++) {
								@Pc(45) Class66 local45 = Static196.method3622(local31.aShortArray55[local35] & 0xFFFF);
								if (local45.anInt1458 != -1) {
									@Pc(55) Class6_Sub35 local55 = new Class6_Sub35(local45.anInt1458);
									local55.anInt5320 = local1;
									local55.anInt5324 = local4;
									aClass211_7.method5585(local55);
								}
							}
						}
					} else {
						@Pc(78) Class66 local78 = Static196.method3622(local15 - 1);
						if (local78.anInt1458 != -1) {
							@Pc(88) Class6_Sub35 local88 = new Class6_Sub35(local78.anInt1458);
							local88.anInt5320 = local1;
							local88.anInt5324 = local4;
							aClass211_7.method5585(local88);
						}
					}
				}
			}
		}
		for (local4 = 0; local4 < 3; local4++) {
			for (local15 = 0; local15 < aClass109ArrayArrayArray2[0].length; local15++) {
				for (@Pc(114) int local114 = 0; local114 < aClass109ArrayArrayArray2[0][0].length; local114++) {
					@Pc(123) Class109 local123 = aClass109ArrayArrayArray2[local4][local15][local114];
					if (local123 != null) {
						for (@Pc(130) Class20_Sub3 local130 = (Class20_Sub3) local123.method2948(); local130 != null; local130 = (Class20_Sub3) local123.method2939()) {
							if (local130.aShortArray6 != null) {
								for (@Pc(136) int local136 = 0; local136 < local130.aShortArray6.length; local136++) {
									@Pc(146) Class66 local146 = Static196.method3622(local130.aShortArray6[local136] & 0xFFFF);
									if (local146.anInt1458 != -1) {
										@Pc(156) Class6_Sub35 local156 = new Class6_Sub35(local146.anInt1458);
										local156.anInt5320 = (local15 + (anInt1200 >> 6)) * 64 + local130.aByte12 - anInt1200;
										local156.anInt5324 = (local114 + (anInt1195 >> 6)) * 64 + local130.aByte13 - anInt1195;
										aClass211_7.method5585(local156);
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
