import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "Lclient!jf;")
	public static Class127 aClass127_3;

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "Lclient!mn;")
	private static Class169 aClass169_2;

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "Lclient!dr;")
	public static Interface4 anInterface4_2;

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "Lclient!co;")
	public static Class6_Sub1_Sub4 aClass6_Sub1_Sub4_2;

	@OriginalMember(owner = "client!bo", name = "f", descriptor = "Lclient!ku;")
	private static Class146 aClass146_2;

	@OriginalMember(owner = "client!bo", name = "g", descriptor = "Lclient!lt;")
	public static Class158 aClass158_28;

	@OriginalMember(owner = "client!bo", name = "h", descriptor = "Lclient!ok;")
	public static Class190 aClass190_2;

	@OriginalMember(owner = "client!bo", name = "i", descriptor = "Lclient!vq;")
	public static Class254 aClass254_5;

	@OriginalMember(owner = "client!bo", name = "j", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!bo", name = "k", descriptor = "Lclient!ws;")
	public static Class267 aClass267_3;

	@OriginalMember(owner = "client!bo", name = "o", descriptor = "F")
	public static float aFloat46;

	@OriginalMember(owner = "client!bo", name = "q", descriptor = "F")
	public static float aFloat47;

	@OriginalMember(owner = "client!bo", name = "r", descriptor = "I")
	public static int anInt2237;

	@OriginalMember(owner = "client!bo", name = "t", descriptor = "I")
	public static int anInt2239;

	@OriginalMember(owner = "client!bo", name = "u", descriptor = "I")
	public static int anInt2240;

	@OriginalMember(owner = "client!bo", name = "v", descriptor = "I")
	public static int anInt2241;

	@OriginalMember(owner = "client!bo", name = "w", descriptor = "I")
	public static int anInt2242;

	@OriginalMember(owner = "client!bo", name = "x", descriptor = "Lclient!ke;")
	private static Class137 aClass137_13;

	@OriginalMember(owner = "client!bo", name = "y", descriptor = "[B")
	private static byte[] aByteArray29;

	@OriginalMember(owner = "client!bo", name = "z", descriptor = "[B")
	private static byte[] aByteArray30;

	@OriginalMember(owner = "client!bo", name = "A", descriptor = "[B")
	private static byte[] aByteArray31;

	@OriginalMember(owner = "client!bo", name = "B", descriptor = "[I")
	private static int[] anIntArray235;

	@OriginalMember(owner = "client!bo", name = "C", descriptor = "[[[Lclient!jg;")
	private static Class128[][][] aClass128ArrayArrayArray2;

	@OriginalMember(owner = "client!bo", name = "D", descriptor = "[S")
	private static short[] aShortArray36;

	@OriginalMember(owner = "client!bo", name = "E", descriptor = "I")
	public static int anInt2243;

	@OriginalMember(owner = "client!bo", name = "F", descriptor = "I")
	public static int anInt2244;

	@OriginalMember(owner = "client!bo", name = "G", descriptor = "I")
	public static int anInt2245;

	@OriginalMember(owner = "client!bo", name = "H", descriptor = "I")
	public static int anInt2246;

	@OriginalMember(owner = "client!bo", name = "I", descriptor = "I")
	public static int anInt2247;

	@OriginalMember(owner = "client!bo", name = "J", descriptor = "[B")
	private static byte[] aByteArray32;

	@OriginalMember(owner = "client!bo", name = "K", descriptor = "I")
	public static int anInt2248;

	@OriginalMember(owner = "client!bo", name = "L", descriptor = "I")
	public static int anInt2249;

	@OriginalMember(owner = "client!bo", name = "M", descriptor = "[S")
	private static short[] aShortArray37;

	@OriginalMember(owner = "client!bo", name = "N", descriptor = "[B")
	private static byte[] aByteArray33;

	@OriginalMember(owner = "client!bo", name = "O", descriptor = "I")
	public static int anInt2250;

	@OriginalMember(owner = "client!bo", name = "e", descriptor = "Lclient!ke;")
	private static final Class137 aClass137_12 = new Class137(16);

	@OriginalMember(owner = "client!bo", name = "l", descriptor = "[B")
	private static final byte[] aByteArray28 = new byte[1];

	@OriginalMember(owner = "client!bo", name = "m", descriptor = "[S")
	private static final short[] aShortArray35 = new short[1];

	@OriginalMember(owner = "client!bo", name = "n", descriptor = "Lclient!ft;")
	public static final Class88 aClass88_24 = new Class88();

	@OriginalMember(owner = "client!bo", name = "p", descriptor = "I")
	public static int anInt2236 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!bo", name = "s", descriptor = "I")
	public static int anInt2238 = (int) (Math.random() * 11.0D) - 5;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)Lclient!po;")
	public static Class202 method2045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class202 local3 = new Class202();
		for (@Pc(8) Class6_Sub1_Sub4 local8 = (Class6_Sub1_Sub4) aClass137_12.method3181(); local8 != null; local8 = (Class6_Sub1_Sub4) aClass137_12.method3182()) {
			if (local8.aBoolean104 && local8.method1070(arg1, arg0)) {
				local3.method4472(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt2242 = arg0 - anInt2246;
		anInt2240 = arg1 - anInt2243;
		anInt2247 = arg2 - anInt2246;
		anInt2250 = arg3 - anInt2243;
		anInt2239 = arg4;
		anInt2244 = arg5;
		anInt2249 = arg6;
		anInt2245 = arg7;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!qq;Lclient!od;IIII)V")
	private static void method2047(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class6_Sub24 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1.anInt4801 = anInt2239 + (arg2 * (arg1.anInt4798 - anInt2242) >> 16);
		arg1.anInt4808 = anInt2245 - (arg3 * (arg1.anInt4805 - anInt2250) >> 16);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V")
	public static void method2048(@OriginalArg(0) int arg0) {
		aClass6_Sub1_Sub4_2 = (Class6_Sub1_Sub4) aClass137_12.method3175((long) arg0);
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)Lclient!co;")
	public static Class6_Sub1_Sub4 method2049(@OriginalArg(0) int arg0) {
		return (Class6_Sub1_Sub4) aClass137_12.method3175((long) arg0);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!qq;II)V")
	public static void method2050(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class6_Sub15 local9 = new Class6_Sub15(aClass158_28.method3680("area", aClass6_Sub1_Sub4_2.aString11));
		@Pc(13) int local13 = local9.method3111();
		@Pc(16) int[] local16 = new int[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			local16[local18] = local9.method3111();
		}
		@Pc(33) int local33 = local9.method3111();
		@Pc(36) int[] local36 = new int[local33];
		for (@Pc(38) int local38 = 0; local38 < local33; local38++) {
			local36[local38] = local9.method3111();
		}
		while (true) {
			@Pc(58) int local58;
			@Pc(64) int local64;
			@Pc(67) int local67;
			@Pc(76) int local76;
			@Pc(148) int local148;
			while (local9.anInt3487 < local9.aByteArray51.length) {
				@Pc(62) int local62;
				@Pc(84) int local84;
				if (local9.method3111() == 0) {
					local58 = local9.method3111();
					local62 = local9.method3111();
					for (local64 = 0; local64 < 64; local64++) {
						for (local67 = 0; local67 < 64; local67++) {
							local76 = local58 * 64 + local64 - anInt2246;
							local84 = local62 * 64 + local67 - anInt2243;
							method2055(arg0, local9, local58, local62, local76, local84, local16, local36);
						}
					}
				} else {
					local58 = local9.method3111();
					local62 = local9.method3111();
					local64 = local9.method3111();
					local67 = local9.method3111();
					for (local76 = 0; local76 < 8; local76++) {
						for (local84 = 0; local84 < 8; local84++) {
							@Pc(136) int local136 = local58 * 64 + local64 * 8 + local76 - anInt2246;
							local148 = local62 * 64 + local67 * 8 + local84 - anInt2243;
							method2055(arg0, local9, local58, local62, local136, local148, local16, local36);
						}
					}
				}
			}
			aByteArray30 = new byte[anInt2248 * anInt2241];
			aShortArray37 = new short[anInt2248 * anInt2241];
			for (local58 = 0; local58 < 3; local58++) {
				@Pc(191) byte[] local191 = new byte[anInt2248 * anInt2241];
				for (local64 = 0; local64 < aClass128ArrayArrayArray2[local58].length; local64++) {
					for (local67 = 0; local67 < aClass128ArrayArrayArray2[local58][0].length; local67++) {
						@Pc(205) Class128 local205 = aClass128ArrayArrayArray2[local58][local64][local67];
						if (local205 != null) {
							for (@Pc(212) Class48_Sub5 local212 = (Class48_Sub5) local205.method2831(); local212 != null; local212 = (Class48_Sub5) local205.method2832()) {
								local191[local64 * 64 + local212.aByte37 + (local67 * 64 + local212.aByte38) * anInt2248] = (byte) local212.anInt3068;
							}
						}
					}
				}
				method2057(local191, aByteArray30, aShortArray37, arg1, arg2);
				for (local67 = 0; local67 < aClass128ArrayArrayArray2[local58].length; local67++) {
					for (local76 = 0; local76 < aClass128ArrayArrayArray2[local58][0].length; local76++) {
						@Pc(276) Class128 local276 = aClass128ArrayArrayArray2[local58][local67][local76];
						if (local276 != null) {
							for (@Pc(283) Class48_Sub5 local283 = (Class48_Sub5) local276.method2831(); local283 != null; local283 = (Class48_Sub5) local276.method2832()) {
								local148 = local67 * 64 + local283.aByte37 + (local76 * 64 + local283.aByte38) * anInt2248;
								local283.anInt3068 = (aByteArray30[local148] & 0xFF) << 16 | aShortArray37[local148] & 0xFFFF;
								if (local283.anInt3068 != 0) {
									local283.anInt3068 |= 0xFF000000;
								}
							}
						}
					}
				}
			}
			method2057(aByteArray29, aByteArray30, aShortArray37, arg1, arg2);
			aByteArray29 = null;
			method2052();
			return;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "()V")
	public static void method2051() {
		aByteArray29 = null;
		aByteArray30 = null;
		aShortArray37 = null;
		aByteArray31 = null;
		aByteArray33 = null;
		aShortArray36 = null;
		aByteArray32 = null;
		aClass137_13 = null;
		aClass128ArrayArrayArray2 = null;
		anIntArray235 = null;
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "()V")
	private static void method2052() {
		@Pc(4) int local4;
		@Pc(15) int local15;
		@Pc(49) int local49;
		for (@Pc(1) int local1 = 0; local1 < anInt2248; local1++) {
			for (local4 = 0; local4 < anInt2241; local4++) {
				local15 = aShortArray36[local1 + local4 * anInt2248] & 0xFFFF;
				if (local15 != 0) {
					@Pc(35) int local35;
					if (local15 == 65535) {
						@Pc(31) Class6_Sub20 local31 = (Class6_Sub20) aClass137_13.method3175((long) (local1 << 16 | local4));
						if (local31 != null) {
							for (local35 = 0; local35 < local31.aShortArray62.length; local35++) {
								@Pc(46) Class118 local46 = aClass127_3.method2820(local31.aShortArray62[local35] & 0xFFFF);
								local49 = local46.anInt3024;
								if (local46.anIntArray273 != null) {
									local46 = local46.method2718(anInterface4_2);
									if (local46 != null) {
										local49 = local46.anInt3024;
									}
								}
								if (local49 != -1) {
									@Pc(70) Class6_Sub24 local70 = new Class6_Sub24(local49);
									local70.anInt4798 = local1;
									local70.anInt4805 = local4;
									aClass88_24.method1878(local70);
								}
							}
						}
					} else {
						@Pc(94) Class118 local94 = aClass127_3.method2820(local15 - 1);
						local35 = local94.anInt3024;
						if (local94.anIntArray273 != null) {
							local94 = local94.method2718(anInterface4_2);
							if (local94 != null) {
								local35 = local94.anInt3024;
							}
						}
						if (local35 != -1) {
							@Pc(118) Class6_Sub24 local118 = new Class6_Sub24(local35);
							local118.anInt4798 = local1;
							local118.anInt4805 = local4;
							aClass88_24.method1878(local118);
						}
					}
				}
			}
		}
		for (local4 = 0; local4 < 3; local4++) {
			for (local15 = 0; local15 < aClass128ArrayArrayArray2[0].length; local15++) {
				for (@Pc(144) int local144 = 0; local144 < aClass128ArrayArrayArray2[0][0].length; local144++) {
					@Pc(153) Class128 local153 = aClass128ArrayArrayArray2[local4][local15][local144];
					if (local153 != null) {
						for (@Pc(160) Class48_Sub5 local160 = (Class48_Sub5) local153.method2831(); local160 != null; local160 = (Class48_Sub5) local153.method2832()) {
							if (local160.aShortArray56 != null) {
								for (local49 = 0; local49 < local160.aShortArray56.length; local49++) {
									@Pc(177) Class118 local177 = aClass127_3.method2820(local160.aShortArray56[local49] & 0xFFFF);
									@Pc(180) int local180 = local177.anInt3024;
									if (local177.anIntArray273 != null) {
										local177 = local177.method2718(anInterface4_2);
										if (local177 != null) {
											local180 = local177.anInt3024;
										}
									}
									if (local180 != -1) {
										@Pc(201) Class6_Sub24 local201 = new Class6_Sub24(local180);
										local201.anInt4798 = (local15 + (anInt2246 >> 6)) * 64 + local160.aByte37 - anInt2246;
										local201.anInt4805 = (local144 + (anInt2243 >> 6)) * 64 + local160.aByte38 - anInt2243;
										aClass88_24.method1878(local201);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!lt;Lclient!ku;Lclient!mn;Lclient!jf;Lclient!vq;Lclient!ok;Lclient!dr;)V")
	public static void method2053(@OriginalArg(0) Class158 arg0, @OriginalArg(1) Class146 arg1, @OriginalArg(2) Class169 arg2, @OriginalArg(3) Class127 arg3, @OriginalArg(4) Class254 arg4, @OriginalArg(5) Class190 arg5, @OriginalArg(6) Interface4 arg6) {
		aClass158_28 = arg0;
		aClass146_2 = arg1;
		aClass169_2 = arg2;
		aClass127_3 = arg3;
		aClass254_5 = arg4;
		aClass190_2 = arg5;
		anInterface4_2 = arg6;
		aClass137_12.method3178();
		@Pc(21) int local21 = aClass158_28.method3677("details");
		@Pc(26) int[] local26 = aClass158_28.method3687(local21);
		for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
			@Pc(37) Class6_Sub1_Sub4 local37 = Static45.method827(aClass158_28, local21, local26[local28]);
			aClass137_12.method3179((long) local37.anInt1189, local37);
		}
		Static301.method2520(false);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!vl;III)I")
	private static int method2054(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class196 local4 = aClass146_2.method3337(arg1);
		if (local4 == null) {
			return 0;
		}
		@Pc(11) int local11 = local4.anInt4971;
		if (local11 >= 0 && arg0.method2466(local11).aBoolean403) {
			local11 = -1;
		}
		@Pc(68) int local68;
		@Pc(27) int local27;
		@Pc(33) int local33;
		@Pc(55) int local55;
		if (local4.anInt4978 >= 0) {
			local27 = local4.anInt4978;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static92.anIntArray184[Static126.method4051(Static29.method364(local55)) & 0xFFFF] | 0xFF000000;
		} else if (local11 >= 0) {
			local68 = Static92.anIntArray184[Static126.method4051(Static29.method364(arg0.method2466(local11).aShort93)) & 0xFFFF] | 0xFF000000;
		} else if (local4.anInt4968 == -1) {
			local68 = 0;
		} else {
			local27 = local4.anInt4968;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static92.anIntArray184[Static126.method4051(Static29.method364(local55)) & 0xFFFF] | 0xFF000000;
		}
		return local68;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!qq;Lclient!ha;IIII[I[I)V")
	private static void method2055(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class6_Sub15 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		@Pc(3) int local3 = arg1.method3111();
		if ((local3 & 0x1) == 0) {
			@Pc(15) boolean local15 = (local3 & 0x2) == 0;
			@Pc(21) int local21 = local3 >> 2 & 0x3F;
			if (local21 != 62) {
				if (local21 == 63) {
					local21 = arg1.method3111();
				} else if (local15) {
					local21 = arg6[local21];
				} else {
					local21 = arg7[local21];
				}
				if (local15) {
					aByteArray29[arg4 + arg5 * anInt2248] = (byte) local21;
					aByteArray31[arg4 + arg5 * anInt2248] = 0;
				} else {
					aByteArray31[arg4 + arg5 * anInt2248] = (byte) local21;
					aByteArray33[arg4 + arg5 * anInt2248] = 0;
					aByteArray29[arg4 + arg5 * anInt2248] = arg1.method3116();
				}
			}
			return;
		}
		@Pc(100) int local100 = (local3 >> 1 & 0x3) + 1;
		@Pc(108) boolean local108 = (local3 & 0x8) != 0;
		@Pc(116) boolean local116 = (local3 & 0x10) != 0;
		for (@Pc(118) int local118 = 0; local118 < local100; local118++) {
			@Pc(123) int local123 = arg1.method3111();
			@Pc(125) int local125 = 0;
			@Pc(127) int local127 = 0;
			if (local108) {
				local125 = arg1.method3111();
				local127 = arg1.method3111();
			}
			@Pc(139) int local139 = 0;
			if (local116) {
				local139 = arg1.method3111();
			}
			@Pc(215) short[] local215;
			@Pc(218) byte[] local218;
			@Pc(220) int local220;
			if (local118 == 0) {
				aByteArray29[arg4 + arg5 * anInt2248] = (byte) local123;
				aByteArray31[arg4 + arg5 * anInt2248] = (byte) local125;
				aByteArray33[arg4 + arg5 * anInt2248] = (byte) local127;
				if (local139 == 1) {
					aShortArray36[arg4 + arg5 * anInt2248] = (short) (arg1.method3108() + 1);
					aByteArray32[arg4 + arg5 * anInt2248] = arg1.method3116();
				} else if (local139 > 1) {
					aShortArray36[arg4 + arg5 * anInt2248] = -1;
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method3108();
						local218[local220] = arg1.method3116();
					}
					aClass137_13.method3179((long) (arg4 << 16 | arg5), new Class6_Sub20(local215, local218));
				}
			} else {
				local215 = null;
				local218 = null;
				if (local139 > 0) {
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method3108();
						local218[local220] = arg1.method3116();
					}
				}
				if (aClass128ArrayArrayArray2[local118 - 1][arg2 - (anInt2246 >> 6)][arg3 - (anInt2243 >> 6)] == null) {
					aClass128ArrayArrayArray2[local118 - 1][arg2 - (anInt2246 >> 6)][arg3 - (anInt2243 >> 6)] = new Class128();
				}
				@Pc(338) Class48_Sub5 local338 = new Class48_Sub5(arg4 & 0x3F, arg5 & 0x3F, local123, local125, local127, local215, local218);
				aClass128ArrayArrayArray2[local118 - 1][arg2 - (anInt2246 >> 6)][arg3 - (anInt2243 >> 6)].method2833(local338);
			}
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!qq;IIII)Lclient!ft;")
	private static Class88 method2056(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(4) Class6_Sub24 local4 = (Class6_Sub24) aClass88_24.method1882(); local4 != null; local4 = (Class6_Sub24) aClass88_24.method1891()) {
			method2047(arg0, local4, arg1, arg2);
		}
		return aClass88_24;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "([B[B[SII)V")
	private static void method2057(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int[] local2 = new int[anInt2241];
		@Pc(5) int[] local5 = new int[anInt2241];
		@Pc(8) int[] local8 = new int[anInt2241];
		@Pc(11) int[] local11 = new int[anInt2241];
		@Pc(14) int[] local14 = new int[anInt2241];
		for (@Pc(16) int local16 = -5; local16 < anInt2248; local16++) {
			@Pc(21) int local21 = local16 + 5;
			@Pc(25) int local25 = local16 - 5;
			@Pc(41) int local41;
			for (@Pc(27) int local27 = 0; local27 < anInt2241; local27++) {
				@Pc(50) Class234 local50;
				@Pc(86) int local86;
				if (local21 < anInt2248) {
					local41 = arg0[local21 + local27 * anInt2248] & 0xFF;
					if (local41 > 0) {
						local50 = aClass169_2.method3857(local41 - 1);
						local2[local27] += local50.anInt6270;
						local5[local27] += local50.anInt6281;
						local8[local27] += local50.anInt6280;
						local11[local27] += local50.anInt6276;
						local86 = local14[local27]++;
					}
				}
				if (local25 >= 0) {
					local41 = arg0[local25 + local27 * anInt2248] & 0xFF;
					if (local41 > 0) {
						local50 = aClass169_2.method3857(local41 - 1);
						local2[local27] -= local50.anInt6270;
						local5[local27] -= local50.anInt6281;
						local8[local27] -= local50.anInt6280;
						local11[local27] -= local50.anInt6276;
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
				for (@Pc(167) int local167 = -5; local167 < anInt2241; local167++) {
					@Pc(172) int local172 = local167 + 5;
					if (local172 < anInt2241) {
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
						if ((arg0[local16 + local167 * anInt2248] & 0xFF) == 0) {
							local261 = local16 + local167 * anInt2248;
							arg1[local261] = 0;
							arg2[local261] = 0;
						} else {
							local261 = local163 == 0 ? 0 : Static210.method3263(local161 / local165, local41 * 256 / local163, local159 / local165);
							@Pc(294) int local294 = (local261 & 0x7F) + arg4;
							if (local294 < 0) {
								local294 = 0;
							} else if (local294 > 127) {
								local294 = 127;
							}
							@Pc(316) int local316 = (local261 + arg3 & 0xFC00) + (local261 & 0x380) + local294;
							@Pc(322) int local322 = local16 + local167 * anInt2248;
							@Pc(333) int local333 = Static92.anIntArray184[Static126.method4051(Static19.method278(local316)) & 0xFFFF];
							arg1[local322] = (byte) (local333 >> 16 & 0xFF);
							arg2[local322] = (short) (local333 & 0xFFFF);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(II)Lclient!co;")
	public static Class6_Sub1_Sub4 method2058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class6_Sub1_Sub4 local4 = (Class6_Sub1_Sub4) aClass137_12.method3181(); local4 != null; local4 = (Class6_Sub1_Sub4) aClass137_12.method3182()) {
			if (local4.aBoolean104 && local4.method1070(arg1, arg0)) {
				return local4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "()V")
	public static void method2059() {
		aByteArray29 = new byte[anInt2248 * anInt2241];
		aByteArray31 = new byte[anInt2248 * anInt2241];
		aByteArray33 = new byte[anInt2248 * anInt2241];
		aShortArray36 = new short[anInt2248 * anInt2241];
		aByteArray32 = new byte[anInt2248 * anInt2241];
		aClass137_13 = new Class137(1024);
		aClass128ArrayArrayArray2 = new Class128[3][anInt2248 >> 6][anInt2241 >> 6];
		anIntArray235 = new int[aClass146_2.anInt3743 + 1];
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!qq;)Lclient!ft;")
	public static Class88 method2060(@OriginalArg(0) Class28 arg0) {
		@Pc(3) int local3 = anInt2247 - anInt2242;
		@Pc(7) int local7 = anInt2240 - anInt2250;
		@Pc(15) int local15 = (anInt2249 - anInt2239 << 16) / local3;
		@Pc(23) int local23 = (anInt2245 - anInt2244 << 16) / local7;
		return method2056(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(Lclient!qq;IIII)V")
	private static void method2061(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = anInt2247 - anInt2242;
		@Pc(7) int local7 = anInt2240 - anInt2250;
		if (anInt2247 < anInt2248) {
			local3++;
		}
		if (anInt2240 < anInt2241) {
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
			local28 = (arg1 * local17 >> 16) + anInt2239;
			local40 = (arg1 * (local17 + 1) >> 16) + anInt2239;
			local44 = local40 - local28;
			if (local44 > 0) {
				local50 = anInt2242 + local17;
				if (local50 >= 0 && local50 < anInt2248) {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt2245 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt2245 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (local84 > 0) {
							local93 = local57 + anInt2250;
							local173 = local50 + local93 * anInt2248;
							local175 = 0;
							local177 = 0;
							local179 = 0;
							if (local93 >= 0 && local93 < anInt2241) {
								local175 = (aByteArray30[local173] & 0xFF) << 16 | aShortArray37[local173] & 0xFFFF;
								if (local175 != 0) {
									local175 |= 0xFF000000;
								}
								local177 = aByteArray31[local173] & 0xFF;
								local179 = aShortArray36[local173] & 0xFFFF;
							}
							if (local175 == 0 && local177 == 0 && local179 == 0) {
								if (aClass6_Sub1_Sub4_2.anInt1197 != -1) {
									local175 = aClass6_Sub1_Sub4_2.anInt1197 | 0xFF000000;
								} else if ((local17 + anInt2242 & 0x4) == (local57 + anInt2240 & 0x4)) {
									local175 = anIntArray235[aClass146_2.anInt3747 + 1];
								} else {
									local175 = -11840664;
								}
								if (local175 == 0) {
									local175 = -16777216;
								}
								arg0.method3559(local28, local70, local44, local84, local175, 0);
							} else if (local179 <= 0) {
								method2062(arg0, local28, local70, local44, local84, local175, local177, aByteArray33[local173], null, null, true);
							} else if (local179 == 65535) {
								@Pc(282) Class6_Sub20 local282 = (Class6_Sub20) aClass137_13.method3175((long) (local50 << 16 | local93));
								if (local282 != null) {
									method2062(arg0, local28, local70, local44, local84, local175, local177, aByteArray33[local173], local282.aShortArray62, local282.aByteArray55, true);
								}
							} else {
								aShortArray35[0] = (short) (local179 - 1);
								aByteArray28[0] = aByteArray32[local173];
								method2062(arg0, local28, local70, local44, local84, local175, local177, aByteArray33[local173], aShortArray35, aByteArray28, true);
							}
						}
					}
				} else {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt2245 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt2245 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (aClass6_Sub1_Sub4_2.anInt1197 != -1) {
							local93 = aClass6_Sub1_Sub4_2.anInt1197 | 0xFF000000;
						} else if ((local17 + anInt2242 & 0x4) == (local57 + anInt2240 & 0x4)) {
							local93 = anIntArray235[aClass146_2.anInt3747 + 1];
						} else {
							local93 = -11840664;
						}
						if (local93 == 0) {
							local93 = -16777216;
						}
						arg0.method3559(local28, local70, local44, local84, local93, 0);
					}
				}
			}
		}
		for (local28 = -16; local28 < local3 + 16; local28++) {
			local40 = (arg1 * local28 >> 16) + anInt2239;
			local44 = (arg1 * (local28 + 1) >> 16) + anInt2239;
			local50 = local44 - local40;
			if (local50 > 0) {
				local57 = local28 + anInt2242;
				if (local57 >= 0 && local57 < anInt2248) {
					for (local70 = -16; local70 < local7 + 16; local70++) {
						local80 = anInt2245 - (arg2 * (local70 + 1) >> 16);
						local84 = anInt2245 - (arg2 * local70 >> 16);
						local93 = local84 - local80;
						if (local93 > 0) {
							local173 = local70 + anInt2250;
							if (local173 >= 0 && local173 < anInt2241) {
								local175 = aShortArray36[local57 + local173 * anInt2248] & 0xFFFF;
								if (local175 <= 0) {
									method2065(arg0, local40, local80, local50, local93, null, null);
								} else if (local175 == 65535) {
									@Pc(459) Class6_Sub20 local459 = (Class6_Sub20) aClass137_13.method3175((long) (local57 << 16 | local173));
									if (local459 != null) {
										method2065(arg0, local40, local80, local50, local93, local459.aShortArray62, local459.aByteArray55);
									}
								} else {
									aShortArray35[0] = (short) (local175 - 1);
									aByteArray28[0] = aByteArray32[local57 + local173 * anInt2248];
									method2065(arg0, local40, local80, local50, local93, aShortArray35, aByteArray28);
								}
							}
						}
					}
				}
			}
		}
		local40 = anInt2242 >> 6;
		local44 = anInt2250 >> 6;
		if (local40 < 0) {
			local40 = 0;
		}
		if (local44 < 0) {
			local44 = 0;
		}
		local50 = anInt2247 >> 6;
		local57 = anInt2240 >> 6;
		if (local50 >= aClass128ArrayArrayArray2[0].length) {
			local50 = aClass128ArrayArrayArray2[0].length - 1;
		}
		if (local57 >= aClass128ArrayArrayArray2[0][0].length) {
			local57 = aClass128ArrayArrayArray2[0][0].length - 1;
		}
		for (local70 = 0; local70 < 3; local70++) {
			@Pc(641) int local641;
			@Pc(653) int local653;
			@Pc(665) int local665;
			@Pc(675) int local675;
			@Pc(631) int local631;
			for (local80 = local40; local80 <= local50; local80++) {
				for (local84 = local44; local84 <= local57; local84++) {
					@Pc(589) Class128 local589 = aClass128ArrayArrayArray2[local70][local80][local84];
					if (local589 != null) {
						local173 = (local80 + (anInt2246 >> 6)) * 64;
						local175 = (local84 + (anInt2243 >> 6)) * 64;
						for (@Pc(612) Class48_Sub5 local612 = (Class48_Sub5) local589.method2831(); local612 != null; local612 = (Class48_Sub5) local589.method2832()) {
							local179 = local173 + local612.aByte37 - anInt2246 - anInt2242;
							local631 = local175 + local612.aByte38 - anInt2243 - anInt2250;
							local641 = (arg1 * local179 >> 16) + anInt2239;
							local653 = (arg1 * (local179 + 1) >> 16) + anInt2239;
							local665 = anInt2245 - (arg2 * (local631 + 1) >> 16);
							local675 = anInt2245 - (arg2 * local631 >> 16);
							method2062(arg0, local641, local665, local653 - local641, local675 - local665, local612.anInt3068, local612.aByte36 & 0xFF, local612.aByte39, local612.aShortArray56, local612.aByteArray41, false);
						}
					}
				}
			}
			for (local84 = local40; local84 <= local50; local84++) {
				for (local93 = local44; local93 <= local57; local93++) {
					@Pc(727) Class128 local727 = aClass128ArrayArrayArray2[local70][local84][local93];
					if (local727 != null) {
						local175 = (local84 + (anInt2246 >> 6)) * 64;
						local177 = (local93 + (anInt2243 >> 6)) * 64;
						for (@Pc(750) Class48_Sub5 local750 = (Class48_Sub5) local727.method2831(); local750 != null; local750 = (Class48_Sub5) local727.method2832()) {
							local631 = local175 + local750.aByte37 - anInt2246 - anInt2242;
							local641 = local177 + local750.aByte38 - anInt2243 - anInt2250;
							local653 = (arg1 * local631 >> 16) + anInt2239;
							local665 = (arg1 * (local631 + 1) >> 16) + anInt2239;
							local675 = anInt2245 - (arg2 * (local641 + 1) >> 16);
							@Pc(813) int local813 = anInt2245 - (arg2 * local641 >> 16);
							method2065(arg0, local653, local675, local665 - local653, local813 - local675, local750.aShortArray56, local750.aByteArray41);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!qq;IIIIIII[S[BZ)V")
	private static void method2062(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) boolean arg10) {
		@Pc(20) int local20;
		@Pc(32) int local32;
		if (arg10 || arg5 != 0 || arg6 > 0) {
			if (arg6 == 0) {
				arg0.method3559(arg1, arg2, arg3, arg4, arg5, 0);
			} else {
				local20 = arg7 & 0x3F;
				if (local20 == 0 || arg3 <= 1 || arg4 <= 1) {
					local32 = anIntArray235[arg6];
					if (arg10 || local32 != 0) {
						arg0.method3559(arg1, arg2, arg3, arg4, local32, 0);
					}
				} else {
					local32 = arg10 ? 0 : 1;
					Static247.method3806(aByteArrayArrayArray2, arg7 >> 6 & 0x3, local20, anInt2237, local32, arg2, arg5, arg0, anIntArray235[arg6], arg3, arg4, arg1);
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
				@Pc(127) Class118 local127 = aClass127_3.method2820(arg8[local100] & 0xFFFF);
				if (local127.anInt2988 == -1) {
					@Pc(133) int local133 = -3355444;
					if (local127.anInt2984 == 1) {
						local133 = -3407872;
					}
					@Pc(147) int local147 = arg9[local100] >> 6 & 0x3;
					if (local107 == 0) {
						if (local147 == 0) {
							arg0.method3547(arg1, arg2, arg4, local133, 0);
						} else if (local147 == 1) {
							arg0.method3551(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 2) {
							arg0.method3547(local20, arg2, arg4, local133, 0);
						} else {
							arg0.method3551(arg1, local32, arg3, local133, 0);
						}
					} else if (local107 == 2) {
						if (local147 == 0) {
							arg0.method3547(arg1, arg2, arg4, -1, 0);
							arg0.method3551(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 1) {
							arg0.method3547(local20, arg2, arg4, -1, 0);
							arg0.method3551(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 2) {
							arg0.method3547(local20, arg2, arg4, -1, 0);
							arg0.method3551(arg1, local32, arg3, local133, 0);
						} else {
							arg0.method3547(arg1, arg2, arg4, -1, 0);
							arg0.method3551(arg1, local32, arg3, local133, 0);
						}
					} else if (local107 == 3) {
						if (local147 == 0) {
							arg0.method3551(arg1, arg2, 1, local133, 0);
						} else if (local147 == 1) {
							arg0.method3551(local20, arg2, 1, local133, 0);
						} else if (local147 == 2) {
							arg0.method3551(local20, local32, 1, local133, 0);
						} else {
							arg0.method3551(arg1, local32, 1, local133, 0);
						}
					} else if (local107 == 9) {
						@Pc(313) int local313;
						if (local147 == 0 || local147 == 2) {
							for (local313 = 0; local313 < arg4; local313++) {
								arg0.method3551(arg1 + local313, local32 - local313, 1, local133, 0);
							}
						} else {
							for (local313 = 0; local313 < arg4; local313++) {
								arg0.method3551(arg1 + local313, arg2 + local313, 1, local133, 0);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(Lclient!qq;)V")
	public static void method2063(@OriginalArg(0) Class28 arg0) {
		@Pc(3) int local3 = anInt2247 - anInt2242;
		@Pc(7) int local7 = anInt2240 - anInt2250;
		@Pc(15) int local15 = (anInt2249 - anInt2239 << 16) / local3;
		@Pc(23) int local23 = (anInt2245 - anInt2244 << 16) / local7;
		method2061(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!vl;II)V")
	public static void method2064(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < aClass146_2.anInt3743; local1++) {
			anIntArray235[local1 + 1] = method2054(arg0, local1, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!qq;IIII[S[B)V")
	private static void method2065(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		if (arg5 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < arg5.length; local4++) {
			@Pc(14) Class118 local14 = aClass127_3.method2820(arg5[local4] & 0xFFFF);
			@Pc(17) int local17 = local14.anInt2988;
			if (local17 != -1) {
				@Pc(25) Class110 local25 = aClass190_2.method4316(local17);
				@Pc(49) Class12 local49 = local25.method2477(arg0, local14.aBoolean218 ? local14.aBoolean210 : false, local14.aBoolean207 ? arg6[local4] >> 6 & 0x3 : 0);
				if (local49 != null) {
					@Pc(58) int local58 = arg3 * local49.method5654() >> 2;
					@Pc(65) int local65 = arg4 * local49.method5655() >> 2;
					if (local25.aBoolean195) {
						@Pc(71) int local71 = local14.anInt2997;
						@Pc(74) int local74 = local14.anInt3025;
						if ((arg6[local4] >> 6 & 0x1) == 1) {
							@Pc(85) int local85 = local71;
							local71 = local74;
							local74 = local85;
						}
						local58 = local71 * arg3;
						local65 = local74 * arg4;
					}
					if (local58 != 0 && local65 != 0) {
						if (local25.anInt2708 == 0) {
							local49.method5667(arg1, arg2 + arg4 - local65, local58, local65);
						} else {
							local49.method5659(arg1, arg2 + arg4 - local65, local58, local65, 0, local25.anInt2708 | 0xFF000000, 1);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bo", name = "e", descriptor = "()V")
	public static void method2067() {
		@Pc(2) int[] local2 = new int[3];
		for (@Pc(4) int local4 = 0; local4 < aClass267_3.anInt7259; local4++) {
			@Pc(32) boolean local32 = aClass6_Sub1_Sub4_2.method1066(aClass267_3.anIntArray636[local4] >> 14 & 0x3FFF, aClass267_3.anIntArray636[local4] & 0x3FFF, local2, aClass267_3.anIntArray636[local4] >> 28 & 0x3);
			if (local32) {
				@Pc(42) Class6_Sub24 local42 = new Class6_Sub24(aClass267_3.anIntArray637[local4]);
				local42.anInt4798 = local2[1] - anInt2246;
				local42.anInt4805 = local2[2] - anInt2243;
				aClass88_24.method1878(local42);
			}
		}
	}
}
