import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "Lclient!al;")
	public static Class1_Sub4_Sub1 aClass1_Sub4_Sub1_3;

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "Lclient!wo;")
	public static Class216 aClass216_65;

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "Lclient!v;")
	public static Class207 aClass207_2;

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
	public static int anInt4154;

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "F")
	public static float aFloat49;

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "F")
	public static float aFloat50;

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
	public static int anInt4157;

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
	public static int anInt4158;

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "[[[Lclient!wp;")
	private static Class217[][][] aClass217ArrayArrayArray2;

	@OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
	public static int anInt4159;

	@OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
	public static int anInt4160;

	@OriginalMember(owner = "client!fc", name = "s", descriptor = "Lclient!tm;")
	private static Class197 aClass197_19;

	@OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
	public static int anInt4161;

	@OriginalMember(owner = "client!fc", name = "u", descriptor = "[B")
	private static byte[] aByteArray64;

	@OriginalMember(owner = "client!fc", name = "v", descriptor = "[I")
	private static int[] anIntArray376;

	@OriginalMember(owner = "client!fc", name = "w", descriptor = "[B")
	private static byte[] aByteArray65;

	@OriginalMember(owner = "client!fc", name = "x", descriptor = "I")
	public static int anInt4162;

	@OriginalMember(owner = "client!fc", name = "y", descriptor = "[B")
	private static byte[] aByteArray66;

	@OriginalMember(owner = "client!fc", name = "z", descriptor = "[B")
	private static byte[] aByteArray67;

	@OriginalMember(owner = "client!fc", name = "A", descriptor = "[B")
	private static byte[] aByteArray68;

	@OriginalMember(owner = "client!fc", name = "B", descriptor = "I")
	public static int anInt4163;

	@OriginalMember(owner = "client!fc", name = "C", descriptor = "I")
	public static int anInt4164;

	@OriginalMember(owner = "client!fc", name = "D", descriptor = "[S")
	private static short[] aShortArray89;

	@OriginalMember(owner = "client!fc", name = "E", descriptor = "[S")
	private static short[] aShortArray90;

	@OriginalMember(owner = "client!fc", name = "F", descriptor = "I")
	public static int anInt4165;

	@OriginalMember(owner = "client!fc", name = "G", descriptor = "I")
	public static int anInt4166;

	@OriginalMember(owner = "client!fc", name = "H", descriptor = "I")
	public static int anInt4167;

	@OriginalMember(owner = "client!fc", name = "I", descriptor = "I")
	public static int anInt4168;

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "Lclient!tm;")
	private static final Class197 aClass197_18 = new Class197(16);

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "Lclient!bb;")
	public static final Class16 aClass16_24 = new Class16();

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "[S")
	private static final short[] aShortArray88 = new short[1];

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "[B")
	private static final byte[] aByteArray63 = new byte[1];

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
	public static int anInt4155 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
	public static int anInt4156 = (int) (Math.random() * 11.0D) - 5;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!uo;)V")
	public static void method3749(@OriginalArg(0) Class32 arg0) {
		@Pc(3) int local3 = anInt4161 - anInt4159;
		@Pc(7) int local7 = anInt4168 - anInt4166;
		@Pc(15) int local15 = (anInt4164 - anInt4163 << 16) / local3;
		@Pc(23) int local23 = (anInt4160 - anInt4167 << 16) / local7;
		method3768(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!uo;IIII)Lclient!bb;")
	private static Class16 method3750(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(4) Class1_Sub27 local4 = (Class1_Sub27) aClass16_24.method410(); local4 != null; local4 = (Class1_Sub27) aClass16_24.method419()) {
			method3754(arg0, local4, arg1, arg2);
		}
		return aClass16_24;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "()V")
	public static void method3751() {
		aByteArray65 = null;
		aByteArray68 = null;
		aShortArray89 = null;
		aByteArray67 = null;
		aByteArray64 = null;
		aShortArray90 = null;
		aByteArray66 = null;
		aClass197_19 = null;
		aClass217ArrayArrayArray2 = null;
		anIntArray376 = null;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!uo;IIII[S[B)V")
	private static void method3752(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		if (arg5 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < arg5.length; local4++) {
			@Pc(13) Class141 local13 = Static119.method2548(arg5[local4] & 0xFFFF);
			@Pc(16) int local16 = local13.anInt4287;
			if (local16 != -1) {
				@Pc(23) Class151 local23 = Static195.method3774(local16);
				@Pc(47) Class5 local47 = local23.method4146(local13.aBoolean408 ? arg6[local4] >> 6 & 0x3 : 0, local13.aBoolean404 ? local13.aBoolean399 : false, arg0);
				if (local47 != null) {
					@Pc(56) int local56 = arg3 * local47.method3632() >> 2;
					@Pc(63) int local63 = arg4 * local47.method3630() >> 2;
					if (local23.aBoolean434) {
						@Pc(69) int local69 = local13.anInt4297;
						@Pc(72) int local72 = local13.anInt4256;
						if ((arg6[local4] >> 6 & 0x1) == 1) {
							@Pc(83) int local83 = local69;
							local69 = local72;
							local72 = local83;
						}
						local56 = local69 * arg3;
						local63 = local72 * arg4;
					}
					if (local56 != 0 && local63 != 0) {
						if (local23.anInt4611 == 0) {
							local47.method3633(arg1, arg2 + arg4 - local63, local56, local63);
						} else {
							local47.method3634(arg1, arg2 + arg4 - local63, local56, local63, 1, local23.anInt4611 | 0xFF000000, 1);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "()V")
	private static void method3753() {
		@Pc(4) int local4;
		@Pc(15) int local15;
		@Pc(48) int local48;
		for (@Pc(1) int local1 = 0; local1 < anInt4158; local1++) {
			for (local4 = 0; local4 < anInt4165; local4++) {
				local15 = aShortArray90[local1 + local4 * anInt4158] & 0xFFFF;
				if (local15 != 0) {
					@Pc(35) int local35;
					if (local15 == 65535) {
						@Pc(31) Class1_Sub38 local31 = (Class1_Sub38) aClass197_19.method5157((long) (local1 << 16 | local4));
						if (local31 != null) {
							for (local35 = 0; local35 < local31.aShortArray115.length; local35++) {
								@Pc(45) Class141 local45 = Static119.method2548(local31.aShortArray115[local35] & 0xFFFF);
								local48 = local45.anInt4277;
								if (local45.anIntArray391 != null) {
									local45 = local45.method3833();
									if (local45 != null) {
										local48 = local45.anInt4277;
									}
								}
								if (local48 != -1) {
									@Pc(68) Class1_Sub27 local68 = new Class1_Sub27(local48);
									local68.anInt4779 = local1;
									local68.anInt4774 = local4;
									aClass16_24.method416(local68);
								}
							}
						}
					} else {
						@Pc(91) Class141 local91 = Static119.method2548(local15 - 1);
						local35 = local91.anInt4277;
						if (local91.anIntArray391 != null) {
							local91 = local91.method3833();
							if (local91 != null) {
								local35 = local91.anInt4277;
							}
						}
						if (local35 != -1) {
							@Pc(114) Class1_Sub27 local114 = new Class1_Sub27(local35);
							local114.anInt4779 = local1;
							local114.anInt4774 = local4;
							aClass16_24.method416(local114);
						}
					}
				}
			}
		}
		for (local4 = 0; local4 < 3; local4++) {
			for (local15 = 0; local15 < aClass217ArrayArrayArray2[0].length; local15++) {
				for (@Pc(140) int local140 = 0; local140 < aClass217ArrayArrayArray2[0][0].length; local140++) {
					@Pc(149) Class217 local149 = aClass217ArrayArrayArray2[local4][local15][local140];
					if (local149 != null) {
						for (@Pc(156) Class8_Sub8 local156 = (Class8_Sub8) local149.method5683(); local156 != null; local156 = (Class8_Sub8) local149.method5679()) {
							if (local156.aShortArray111 != null) {
								for (local48 = 0; local48 < local156.aShortArray111.length; local48++) {
									@Pc(172) Class141 local172 = Static119.method2548(local156.aShortArray111[local48] & 0xFFFF);
									@Pc(175) int local175 = local172.anInt4277;
									if (local172.anIntArray391 != null) {
										local172 = local172.method3833();
										if (local172 != null) {
											local175 = local172.anInt4277;
										}
									}
									if (local175 != -1) {
										@Pc(195) Class1_Sub27 local195 = new Class1_Sub27(local175);
										local195.anInt4779 = (local15 + (anInt4162 >> 6)) * 64 + local156.aByte58 - anInt4162;
										local195.anInt4774 = (local140 + (anInt4157 >> 6)) * 64 + local156.aByte56 - anInt4157;
										aClass16_24.method416(local195);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!uo;Lclient!pd;IIII)V")
	private static void method3754(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Class1_Sub27 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1.anInt4781 = anInt4163 + (arg2 * (arg1.anInt4779 - anInt4159) >> 16);
		arg1.anInt4782 = anInt4160 - (arg3 * (arg1.anInt4774 - anInt4166) >> 16);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!uo;Lclient!bg;IIII[I[I)V")
	private static void method3755(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Class1_Sub8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		@Pc(3) int local3 = arg1.method4532();
		if ((local3 & 0x1) == 0) {
			@Pc(15) boolean local15 = (local3 & 0x2) == 0;
			@Pc(21) int local21 = local3 >> 2 & 0x3F;
			if (local21 != 62) {
				if (local21 == 63) {
					local21 = arg1.method4532();
				} else if (local15) {
					local21 = arg6[local21];
				} else {
					local21 = arg7[local21];
				}
				if (local15) {
					aByteArray65[arg4 + arg5 * anInt4158] = (byte) local21;
					aByteArray67[arg4 + arg5 * anInt4158] = 0;
				} else {
					aByteArray67[arg4 + arg5 * anInt4158] = (byte) local21;
					aByteArray64[arg4 + arg5 * anInt4158] = 0;
					aByteArray65[arg4 + arg5 * anInt4158] = arg1.method4558();
				}
			}
			return;
		}
		@Pc(100) int local100 = (local3 >> 1 & 0x3) + 1;
		@Pc(108) boolean local108 = (local3 & 0x8) != 0;
		@Pc(116) boolean local116 = (local3 & 0x10) != 0;
		for (@Pc(118) int local118 = 0; local118 < local100; local118++) {
			@Pc(123) int local123 = arg1.method4532();
			@Pc(125) int local125 = 0;
			@Pc(127) int local127 = 0;
			if (local108) {
				local125 = arg1.method4532();
				local127 = arg1.method4532();
			}
			@Pc(139) int local139 = 0;
			if (local116) {
				local139 = arg1.method4532();
			}
			@Pc(215) short[] local215;
			@Pc(218) byte[] local218;
			@Pc(220) int local220;
			if (local118 == 0) {
				aByteArray65[arg4 + arg5 * anInt4158] = (byte) local123;
				aByteArray67[arg4 + arg5 * anInt4158] = (byte) local125;
				aByteArray64[arg4 + arg5 * anInt4158] = (byte) local127;
				if (local139 == 1) {
					aShortArray90[arg4 + arg5 * anInt4158] = (short) (arg1.method4556() + 1);
					aByteArray66[arg4 + arg5 * anInt4158] = arg1.method4558();
				} else if (local139 > 1) {
					aShortArray90[arg4 + arg5 * anInt4158] = -1;
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method4556();
						local218[local220] = arg1.method4558();
					}
					aClass197_19.method5166(new Class1_Sub38(local215, local218), (long) (arg4 << 16 | arg5));
				}
			} else {
				local215 = null;
				local218 = null;
				if (local139 > 0) {
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method4556();
						local218[local220] = arg1.method4558();
					}
				}
				if (aClass217ArrayArrayArray2[local118 - 1][arg2 - (anInt4162 >> 6)][arg3 - (anInt4157 >> 6)] == null) {
					aClass217ArrayArrayArray2[local118 - 1][arg2 - (anInt4162 >> 6)][arg3 - (anInt4157 >> 6)] = new Class217();
				}
				@Pc(338) Class8_Sub8 local338 = new Class8_Sub8(arg4 & 0x3F, arg5 & 0x3F, local123, local125, local127, local215, local218);
				aClass217ArrayArrayArray2[local118 - 1][arg2 - (anInt4162 >> 6)][arg3 - (anInt4157 >> 6)].method5678(local338);
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)Lclient!p;")
	public static Class159 method3756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class159 local3 = new Class159();
		for (@Pc(8) Class1_Sub4_Sub1 local8 = (Class1_Sub4_Sub1) aClass197_18.method5161(); local8 != null; local8 = (Class1_Sub4_Sub1) aClass197_18.method5154()) {
			if (local8.aBoolean32 && local8.method321(arg0, arg1)) {
				local3.method4262(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "([B[B[SII)V")
	private static void method3757(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int[] local2 = new int[anInt4165];
		@Pc(5) int[] local5 = new int[anInt4165];
		@Pc(8) int[] local8 = new int[anInt4165];
		@Pc(11) int[] local11 = new int[anInt4165];
		@Pc(14) int[] local14 = new int[anInt4165];
		for (@Pc(16) int local16 = -5; local16 < anInt4158; local16++) {
			@Pc(21) int local21 = local16 + 5;
			@Pc(25) int local25 = local16 - 5;
			@Pc(41) int local41;
			for (@Pc(27) int local27 = 0; local27 < anInt4165; local27++) {
				@Pc(49) Class181 local49;
				@Pc(85) int local85;
				if (local21 < anInt4158) {
					local41 = arg0[local21 + local27 * anInt4158] & 0xFF;
					if (local41 > 0) {
						local49 = Static269.method4742(local41 - 1);
						local2[local27] += local49.anInt5619;
						local5[local27] += local49.anInt5621;
						local8[local27] += local49.anInt5620;
						local11[local27] += local49.anInt5613;
						local85 = local14[local27]++;
					}
				}
				if (local25 >= 0) {
					local41 = arg0[local25 + local27 * anInt4158] & 0xFF;
					if (local41 > 0) {
						local49 = Static269.method4742(local41 - 1);
						local2[local27] -= local49.anInt5619;
						local5[local27] -= local49.anInt5621;
						local8[local27] -= local49.anInt5620;
						local11[local27] -= local49.anInt5613;
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
				for (@Pc(165) int local165 = -5; local165 < anInt4165; local165++) {
					@Pc(170) int local170 = local165 + 5;
					if (local170 < anInt4165) {
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
						if ((arg0[local16 + local165 * anInt4158] & 0xFF) == 0) {
							local259 = local16 + local165 * anInt4158;
							arg1[local259] = 0;
							arg2[local259] = 0;
						} else {
							local259 = local161 == 0 ? 0 : Static348.method5582(local41 * 256 / local161, local159 / local163, local157 / local163);
							@Pc(292) int local292 = (local259 & 0x7F) + arg4;
							if (local292 < 0) {
								local292 = 0;
							} else if (local292 > 127) {
								local292 = 127;
							}
							@Pc(314) int local314 = (local259 + arg3 & 0xFC00) + (local259 & 0x380) + local292;
							@Pc(320) int local320 = local16 + local165 * anInt4158;
							@Pc(331) int local331 = Static102.anIntArray226[Static64.method1567(Static57.method1495(local314)) & 0xFFFF];
							arg1[local320] = (byte) (local331 >> 16 & 0xFF);
							arg2[local320] = (short) (local331 & 0xFFFF);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!uo;II)V")
	public static void method3758(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class1_Sub8 local9 = new Class1_Sub8(aClass216_65.method5654(aClass1_Sub4_Sub1_3.aString2, "area"));
		@Pc(13) int local13 = local9.method4532();
		@Pc(16) int[] local16 = new int[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			local16[local18] = local9.method4532();
		}
		@Pc(33) int local33 = local9.method4532();
		@Pc(36) int[] local36 = new int[local33];
		for (@Pc(38) int local38 = 0; local38 < local33; local38++) {
			local36[local38] = local9.method4532();
		}
		while (true) {
			@Pc(58) int local58;
			@Pc(64) int local64;
			@Pc(67) int local67;
			@Pc(76) int local76;
			@Pc(148) int local148;
			while (local9.anInt5182 < local9.aByteArray81.length) {
				@Pc(62) int local62;
				@Pc(84) int local84;
				if (local9.method4532() == 0) {
					local58 = local9.method4532();
					local62 = local9.method4532();
					for (local64 = 0; local64 < 64; local64++) {
						for (local67 = 0; local67 < 64; local67++) {
							local76 = local58 * 64 + local64 - anInt4162;
							local84 = local62 * 64 + local67 - anInt4157;
							method3755(arg0, local9, local58, local62, local76, local84, local16, local36);
						}
					}
				} else {
					local58 = local9.method4532();
					local62 = local9.method4532();
					local64 = local9.method4532();
					local67 = local9.method4532();
					for (local76 = 0; local76 < 8; local76++) {
						for (local84 = 0; local84 < 8; local84++) {
							@Pc(136) int local136 = local58 * 64 + local64 * 8 + local76 - anInt4162;
							local148 = local62 * 64 + local67 * 8 + local84 - anInt4157;
							method3755(arg0, local9, local58, local62, local136, local148, local16, local36);
						}
					}
				}
			}
			aByteArray68 = new byte[anInt4158 * anInt4165];
			aShortArray89 = new short[anInt4158 * anInt4165];
			for (local58 = 0; local58 < 3; local58++) {
				@Pc(191) byte[] local191 = new byte[anInt4158 * anInt4165];
				for (local64 = 0; local64 < aClass217ArrayArrayArray2[local58].length; local64++) {
					for (local67 = 0; local67 < aClass217ArrayArrayArray2[local58][0].length; local67++) {
						@Pc(205) Class217 local205 = aClass217ArrayArrayArray2[local58][local64][local67];
						if (local205 != null) {
							for (@Pc(212) Class8_Sub8 local212 = (Class8_Sub8) local205.method5683(); local212 != null; local212 = (Class8_Sub8) local205.method5679()) {
								local191[local64 * 64 + local212.aByte58 + (local67 * 64 + local212.aByte56) * anInt4158] = (byte) local212.anInt5550;
							}
						}
					}
				}
				method3757(local191, aByteArray68, aShortArray89, arg1, arg2);
				for (local67 = 0; local67 < aClass217ArrayArrayArray2[local58].length; local67++) {
					for (local76 = 0; local76 < aClass217ArrayArrayArray2[local58][0].length; local76++) {
						@Pc(276) Class217 local276 = aClass217ArrayArrayArray2[local58][local67][local76];
						if (local276 != null) {
							for (@Pc(283) Class8_Sub8 local283 = (Class8_Sub8) local276.method5683(); local283 != null; local283 = (Class8_Sub8) local276.method5679()) {
								local148 = local67 * 64 + local283.aByte58 + (local76 * 64 + local283.aByte56) * anInt4158;
								local283.anInt5550 = (aByteArray68[local148] & 0xFF) << 16 | aShortArray89[local148] & 0xFFFF;
								if (local283.anInt5550 != 0) {
									local283.anInt5550 |= 0xFF000000;
								}
							}
						}
					}
				}
			}
			method3757(aByteArray65, aByteArray68, aShortArray89, arg1, arg2);
			aByteArray65 = null;
			method3753();
			return;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!gd;II)V")
	public static void method3759(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static356.anInt6808; local1++) {
			anIntArray376[local1 + 1] = method3769(arg0, local1, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)Lclient!al;")
	public static Class1_Sub4_Sub1 method3760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class1_Sub4_Sub1 local4 = (Class1_Sub4_Sub1) aClass197_18.method5161(); local4 != null; local4 = (Class1_Sub4_Sub1) aClass197_18.method5154()) {
			if (local4.aBoolean32 && local4.method321(arg0, arg1)) {
				return local4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(Lclient!uo;)Lclient!bb;")
	public static Class16 method3761(@OriginalArg(0) Class32 arg0) {
		@Pc(3) int local3 = anInt4161 - anInt4159;
		@Pc(7) int local7 = anInt4168 - anInt4166;
		@Pc(15) int local15 = (anInt4164 - anInt4163 << 16) / local3;
		@Pc(23) int local23 = (anInt4160 - anInt4167 << 16) / local7;
		return method3750(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt4159 = arg0 - anInt4162;
		anInt4168 = arg1 - anInt4157;
		anInt4161 = arg2 - anInt4162;
		anInt4166 = arg3 - anInt4157;
		anInt4163 = arg4;
		anInt4167 = arg5;
		anInt4164 = arg6;
		anInt4160 = arg7;
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "()V")
	public static void method3763() {
		aByteArray65 = new byte[anInt4158 * anInt4165];
		aByteArray67 = new byte[anInt4158 * anInt4165];
		aByteArray64 = new byte[anInt4158 * anInt4165];
		aShortArray90 = new short[anInt4158 * anInt4165];
		aByteArray66 = new byte[anInt4158 * anInt4165];
		aClass197_19 = new Class197(1024);
		aClass217ArrayArrayArray2 = new Class217[3][anInt4158 >> 6][anInt4165 >> 6];
		anIntArray376 = new int[Static356.anInt6808 + 1];
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!wo;)V")
	public static void method3764(@OriginalArg(0) Class216 arg0) {
		aClass216_65 = arg0;
		aClass197_18.method5155();
		@Pc(9) int local9 = aClass216_65.method5660("details");
		@Pc(14) int[] local14 = aClass216_65.method5664(local9);
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(25) Class1_Sub4_Sub1 local25 = Static112.method2425(aClass216_65, local14[local16], local9);
			aClass197_18.method5166(local25, (long) local25.anInt361);
		}
		Static140.method2826(false);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!uo;IIIIIII[S[BZ)V")
	private static void method3765(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) boolean arg10) {
		@Pc(20) int local20;
		@Pc(32) int local32;
		if (arg10 || arg5 != 0 || arg6 > 0) {
			if (arg6 == 0) {
				arg0.method2241(arg1, arg2, arg3, arg4, arg5, 0);
			} else {
				local20 = arg7 & 0x3F;
				if (local20 == 0 || arg3 <= 1 || arg4 <= 1) {
					local32 = anIntArray376[arg6];
					if (arg10 || local32 != 0) {
						arg0.method2241(arg1, arg2, arg3, arg4, local32, 0);
					}
				} else {
					local32 = arg10 ? 0 : 1;
					Static54.method1413(local32, anIntArray376[arg6], arg7 >> 6 & 0x3, local20, arg0, arg3, anInt4154, aByteArrayArrayArray7, arg2, arg5, arg4, arg1);
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
				@Pc(126) Class141 local126 = Static119.method2548(arg8[local100] & 0xFFFF);
				if (local126.anInt4287 == -1) {
					@Pc(132) int local132 = -3355444;
					if (local126.anInt4294 == 1) {
						local132 = -3407872;
					}
					@Pc(146) int local146 = arg9[local100] >> 6 & 0x3;
					if (local107 == 0) {
						if (local146 == 0) {
							arg0.method2148(arg1, arg2, arg4, local132, 0);
						} else if (local146 == 1) {
							arg0.method2161(arg1, arg2, arg3, local132, 0);
						} else if (local146 == 2) {
							arg0.method2148(local20, arg2, arg4, local132, 0);
						} else {
							arg0.method2161(arg1, local32, arg3, local132, 0);
						}
					} else if (local107 == 2) {
						if (local146 == 0) {
							arg0.method2148(arg1, arg2, arg4, -1, 0);
							arg0.method2161(arg1, arg2, arg3, local132, 0);
						} else if (local146 == 1) {
							arg0.method2148(local20, arg2, arg4, -1, 0);
							arg0.method2161(arg1, arg2, arg3, local132, 0);
						} else if (local146 == 2) {
							arg0.method2148(local20, arg2, arg4, -1, 0);
							arg0.method2161(arg1, local32, arg3, local132, 0);
						} else {
							arg0.method2148(arg1, arg2, arg4, -1, 0);
							arg0.method2161(arg1, local32, arg3, local132, 0);
						}
					} else if (local107 == 3) {
						if (local146 == 0) {
							arg0.method2161(arg1, arg2, 1, local132, 0);
						} else if (local146 == 1) {
							arg0.method2161(local20, arg2, 1, local132, 0);
						} else if (local146 == 2) {
							arg0.method2161(local20, local32, 1, local132, 0);
						} else {
							arg0.method2161(arg1, local32, 1, local132, 0);
						}
					} else if (local107 == 9) {
						@Pc(312) int local312;
						if (local146 == 0 || local146 == 2) {
							for (local312 = 0; local312 < arg4; local312++) {
								arg0.method2161(arg1 + local312, local32 - local312, 1, local132, 0);
							}
						} else {
							for (local312 = 0; local312 < arg4; local312++) {
								arg0.method2161(arg1 + local312, arg2 + local312, 1, local132, 0);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "()V")
	public static void method3767() {
		@Pc(2) int[] local2 = new int[3];
		for (@Pc(4) int local4 = 0; local4 < aClass207_2.anInt6318; local4++) {
			@Pc(32) boolean local32 = aClass1_Sub4_Sub1_3.method318(aClass207_2.anIntArray511[local4] >> 14 & 0x3FFF, aClass207_2.anIntArray511[local4] & 0x3FFF, local2, aClass207_2.anIntArray511[local4] >> 28 & 0x3);
			if (local32) {
				@Pc(42) Class1_Sub27 local42 = new Class1_Sub27(aClass207_2.anIntArray510[local4]);
				local42.anInt4779 = local2[1] - anInt4162;
				local42.anInt4774 = local2[2] - anInt4157;
				aClass16_24.method416(local42);
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(Lclient!uo;IIII)V")
	private static void method3768(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = anInt4161 - anInt4159;
		@Pc(7) int local7 = anInt4168 - anInt4166;
		if (anInt4161 < anInt4158) {
			local3++;
		}
		if (anInt4168 < anInt4165) {
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
			local28 = (arg1 * local17 >> 16) + anInt4163;
			local40 = (arg1 * (local17 + 1) >> 16) + anInt4163;
			local44 = local40 - local28;
			if (local44 > 0) {
				local50 = anInt4159 + local17;
				if (local50 >= 0 && local50 < anInt4158) {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt4160 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt4160 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (local84 > 0) {
							local93 = local57 + anInt4166;
							local172 = local50 + local93 * anInt4158;
							local174 = 0;
							local176 = 0;
							local178 = 0;
							if (local93 >= 0 && local93 < anInt4165) {
								local174 = (aByteArray68[local172] & 0xFF) << 16 | aShortArray89[local172] & 0xFFFF;
								if (local174 != 0) {
									local174 |= 0xFF000000;
								}
								local176 = aByteArray67[local172] & 0xFF;
								local178 = aShortArray90[local172] & 0xFFFF;
							}
							if (local174 == 0 && local176 == 0 && local178 == 0) {
								if (aClass1_Sub4_Sub1_3.anInt356 != -1) {
									local174 = aClass1_Sub4_Sub1_3.anInt356 | 0xFF000000;
								} else if ((local17 + anInt4159 & 0x4) == (local57 + anInt4168 & 0x4)) {
									local174 = anIntArray376[Static238.anInt4927 + 1];
								} else {
									local174 = -11840664;
								}
								if (local174 == 0) {
									local174 = -16777216;
								}
								arg0.method2241(local28, local70, local44, local84, local174, 0);
							} else if (local178 <= 0) {
								method3765(arg0, local28, local70, local44, local84, local174, local176, aByteArray64[local172], null, null, true);
							} else if (local178 == 65535) {
								@Pc(280) Class1_Sub38 local280 = (Class1_Sub38) aClass197_19.method5157((long) (local50 << 16 | local93));
								if (local280 != null) {
									method3765(arg0, local28, local70, local44, local84, local174, local176, aByteArray64[local172], local280.aShortArray115, local280.aByteArray93, true);
								}
							} else {
								aShortArray88[0] = (short) (local178 - 1);
								aByteArray63[0] = aByteArray66[local172];
								method3765(arg0, local28, local70, local44, local84, local174, local176, aByteArray64[local172], aShortArray88, aByteArray63, true);
							}
						}
					}
				} else {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt4160 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt4160 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (aClass1_Sub4_Sub1_3.anInt356 != -1) {
							local93 = aClass1_Sub4_Sub1_3.anInt356 | 0xFF000000;
						} else if ((local17 + anInt4159 & 0x4) == (local57 + anInt4168 & 0x4)) {
							local93 = anIntArray376[Static238.anInt4927 + 1];
						} else {
							local93 = -11840664;
						}
						if (local93 == 0) {
							local93 = -16777216;
						}
						arg0.method2241(local28, local70, local44, local84, local93, 0);
					}
				}
			}
		}
		for (local28 = -16; local28 < local3 + 16; local28++) {
			local40 = (arg1 * local28 >> 16) + anInt4163;
			local44 = (arg1 * (local28 + 1) >> 16) + anInt4163;
			local50 = local44 - local40;
			if (local50 > 0) {
				local57 = local28 + anInt4159;
				if (local57 >= 0 && local57 < anInt4158) {
					for (local70 = -16; local70 < local7 + 16; local70++) {
						local80 = anInt4160 - (arg2 * (local70 + 1) >> 16);
						local84 = anInt4160 - (arg2 * local70 >> 16);
						local93 = local84 - local80;
						if (local93 > 0) {
							local172 = local70 + anInt4166;
							if (local172 >= 0 && local172 < anInt4165) {
								local174 = aShortArray90[local57 + local172 * anInt4158] & 0xFFFF;
								if (local174 <= 0) {
									method3752(arg0, local40, local80, local50, local93, null, null);
								} else if (local174 == 65535) {
									@Pc(457) Class1_Sub38 local457 = (Class1_Sub38) aClass197_19.method5157((long) (local57 << 16 | local172));
									if (local457 != null) {
										method3752(arg0, local40, local80, local50, local93, local457.aShortArray115, local457.aByteArray93);
									}
								} else {
									aShortArray88[0] = (short) (local174 - 1);
									aByteArray63[0] = aByteArray66[local57 + local172 * anInt4158];
									method3752(arg0, local40, local80, local50, local93, aShortArray88, aByteArray63);
								}
							}
						}
					}
				}
			}
		}
		local40 = anInt4159 >> 6;
		local44 = anInt4166 >> 6;
		if (local40 < 0) {
			local40 = 0;
		}
		if (local44 < 0) {
			local44 = 0;
		}
		local50 = anInt4161 >> 6;
		local57 = anInt4168 >> 6;
		if (local50 >= aClass217ArrayArrayArray2[0].length) {
			local50 = aClass217ArrayArrayArray2[0].length - 1;
		}
		if (local57 >= aClass217ArrayArrayArray2[0][0].length) {
			local57 = aClass217ArrayArrayArray2[0][0].length - 1;
		}
		for (local70 = 0; local70 < 3; local70++) {
			@Pc(639) int local639;
			@Pc(651) int local651;
			@Pc(663) int local663;
			@Pc(673) int local673;
			@Pc(629) int local629;
			for (local80 = local40; local80 <= local50; local80++) {
				for (local84 = local44; local84 <= local57; local84++) {
					@Pc(587) Class217 local587 = aClass217ArrayArrayArray2[local70][local80][local84];
					if (local587 != null) {
						local172 = (local80 + (anInt4162 >> 6)) * 64;
						local174 = (local84 + (anInt4157 >> 6)) * 64;
						for (@Pc(610) Class8_Sub8 local610 = (Class8_Sub8) local587.method5683(); local610 != null; local610 = (Class8_Sub8) local587.method5679()) {
							local178 = local172 + local610.aByte58 - anInt4162 - anInt4159;
							local629 = local174 + local610.aByte56 - anInt4157 - anInt4166;
							local639 = (arg1 * local178 >> 16) + anInt4163;
							local651 = (arg1 * (local178 + 1) >> 16) + anInt4163;
							local663 = anInt4160 - (arg2 * (local629 + 1) >> 16);
							local673 = anInt4160 - (arg2 * local629 >> 16);
							method3765(arg0, local639, local663, local651 - local639, local673 - local663, local610.anInt5550, local610.aByte59 & 0xFF, local610.aByte57, local610.aShortArray111, local610.aByteArray84, false);
						}
					}
				}
			}
			for (local84 = local40; local84 <= local50; local84++) {
				for (local93 = local44; local93 <= local57; local93++) {
					@Pc(725) Class217 local725 = aClass217ArrayArrayArray2[local70][local84][local93];
					if (local725 != null) {
						local174 = (local84 + (anInt4162 >> 6)) * 64;
						local176 = (local93 + (anInt4157 >> 6)) * 64;
						for (@Pc(748) Class8_Sub8 local748 = (Class8_Sub8) local725.method5683(); local748 != null; local748 = (Class8_Sub8) local725.method5679()) {
							local629 = local174 + local748.aByte58 - anInt4162 - anInt4159;
							local639 = local176 + local748.aByte56 - anInt4157 - anInt4166;
							local651 = (arg1 * local629 >> 16) + anInt4163;
							local663 = (arg1 * (local629 + 1) >> 16) + anInt4163;
							local673 = anInt4160 - (arg2 * (local639 + 1) >> 16);
							@Pc(811) int local811 = anInt4160 - (arg2 * local639 >> 16);
							method3752(arg0, local651, local673, local663 - local651, local811 - local673, local748.aShortArray111, local748.aByteArray84);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!gd;III)I")
	private static int method3769(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class108 local3 = Static2.method65(arg1);
		if (local3 == null) {
			return 0;
		}
		@Pc(10) int local10 = local3.anInt3150;
		if (local10 >= 0 && arg0.method4244(local10).aBoolean443) {
			local10 = -1;
		}
		@Pc(67) int local67;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(54) int local54;
		if (local3.anInt3155 >= 0) {
			local26 = local3.anInt3155;
			local32 = (local26 & 0x7F) + arg3;
			if (local32 < 0) {
				local32 = 0;
			} else if (local32 > 127) {
				local32 = 127;
			}
			local54 = (local26 + arg2 & 0xFC00) + (local26 & 0x380) + local32;
			local67 = Static102.anIntArray226[Static64.method1567(Static97.method4760(local54)) & 0xFFFF] | 0xFF000000;
		} else if (local10 >= 0) {
			local67 = Static102.anIntArray226[Static64.method1567(Static97.method4760(arg0.method4244(local10).aShort54)) & 0xFFFF] | 0xFF000000;
		} else if (local3.anInt3153 == -1) {
			local67 = 0;
		} else {
			local26 = local3.anInt3153;
			local32 = (local26 & 0x7F) + arg3;
			if (local32 < 0) {
				local32 = 0;
			} else if (local32 > 127) {
				local32 = 127;
			}
			local54 = (local26 + arg2 & 0xFC00) + (local26 & 0x380) + local32;
			local67 = Static102.anIntArray226[Static64.method1567(Static97.method4760(local54)) & 0xFFFF] | 0xFF000000;
		}
		return local67;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
	public static void method3770(@OriginalArg(0) int arg0) {
		aClass1_Sub4_Sub1_3 = (Class1_Sub4_Sub1) aClass197_18.method5157((long) arg0);
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)Lclient!al;")
	public static Class1_Sub4_Sub1 method3771(@OriginalArg(0) int arg0) {
		return (Class1_Sub4_Sub1) aClass197_18.method5157((long) arg0);
	}
}
