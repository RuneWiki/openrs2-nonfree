import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static620 {

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "Lclient!ko;")
	public static Interface12 anInterface12_2;

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "Lclient!pha;")
	public static Class5_Sub5_Sub16 aClass5_Sub5_Sub16_2;

	@OriginalMember(owner = "client!wca", name = "c", descriptor = "Lclient!au;")
	private static Class23 aClass23_4;

	@OriginalMember(owner = "client!wca", name = "e", descriptor = "Lclient!ni;")
	public static Class246 aClass246_6;

	@OriginalMember(owner = "client!wca", name = "f", descriptor = "Lclient!la;")
	public static Class207 aClass207_103;

	@OriginalMember(owner = "client!wca", name = "g", descriptor = "Lclient!bt;")
	public static Class42 aClass42_4;

	@OriginalMember(owner = "client!wca", name = "h", descriptor = "Lclient!qha;")
	private static Class289 aClass289_6;

	@OriginalMember(owner = "client!wca", name = "i", descriptor = "Lclient!ti;")
	public static Class333 aClass333_2;

	@OriginalMember(owner = "client!wca", name = "j", descriptor = "Lclient!wq;")
	public static Class378 aClass378_4;

	@OriginalMember(owner = "client!wca", name = "l", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray20;

	@OriginalMember(owner = "client!wca", name = "n", descriptor = "I")
	public static int anInt8198;

	@OriginalMember(owner = "client!wca", name = "r", descriptor = "F")
	public static float aFloat146;

	@OriginalMember(owner = "client!wca", name = "s", descriptor = "F")
	public static float aFloat147;

	@OriginalMember(owner = "client!wca", name = "t", descriptor = "I")
	public static int anInt8200;

	@OriginalMember(owner = "client!wca", name = "u", descriptor = "[B")
	private static byte[] aByteArray86;

	@OriginalMember(owner = "client!wca", name = "v", descriptor = "I")
	public static int anInt8201;

	@OriginalMember(owner = "client!wca", name = "w", descriptor = "I")
	public static int anInt8202;

	@OriginalMember(owner = "client!wca", name = "x", descriptor = "[[[Lclient!fa;")
	private static Class99[][][] aClass99ArrayArrayArray2;

	@OriginalMember(owner = "client!wca", name = "y", descriptor = "Lclient!pl;")
	private static Class273 aClass273_36;

	@OriginalMember(owner = "client!wca", name = "z", descriptor = "I")
	public static int anInt8203;

	@OriginalMember(owner = "client!wca", name = "A", descriptor = "I")
	public static int anInt8204;

	@OriginalMember(owner = "client!wca", name = "B", descriptor = "I")
	public static int anInt8205;

	@OriginalMember(owner = "client!wca", name = "C", descriptor = "I")
	public static int anInt8206;

	@OriginalMember(owner = "client!wca", name = "D", descriptor = "[B")
	private static byte[] aByteArray87;

	@OriginalMember(owner = "client!wca", name = "E", descriptor = "I")
	public static int anInt8207;

	@OriginalMember(owner = "client!wca", name = "F", descriptor = "[B")
	private static byte[] aByteArray88;

	@OriginalMember(owner = "client!wca", name = "G", descriptor = "[I")
	private static int[] anIntArray462;

	@OriginalMember(owner = "client!wca", name = "H", descriptor = "I")
	public static int anInt8208;

	@OriginalMember(owner = "client!wca", name = "I", descriptor = "[B")
	private static byte[] aByteArray89;

	@OriginalMember(owner = "client!wca", name = "J", descriptor = "[B")
	private static byte[] aByteArray90;

	@OriginalMember(owner = "client!wca", name = "K", descriptor = "[S")
	private static short[] aShortArray112;

	@OriginalMember(owner = "client!wca", name = "L", descriptor = "I")
	public static int anInt8209;

	@OriginalMember(owner = "client!wca", name = "M", descriptor = "[S")
	private static short[] aShortArray113;

	@OriginalMember(owner = "client!wca", name = "N", descriptor = "I")
	public static int anInt8210;

	@OriginalMember(owner = "client!wca", name = "O", descriptor = "I")
	public static int anInt8211;

	@OriginalMember(owner = "client!wca", name = "d", descriptor = "Lclient!pl;")
	private static final Class273 aClass273_35 = new Class273(16);

	@OriginalMember(owner = "client!wca", name = "k", descriptor = "Lclient!tg;")
	public static final Class330 aClass330_46 = new Class330();

	@OriginalMember(owner = "client!wca", name = "m", descriptor = "I")
	public static int anInt8197 = (int) (Math.random() * 11.0D) - 5;

	@OriginalMember(owner = "client!wca", name = "o", descriptor = "I")
	public static int anInt8199 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!wca", name = "p", descriptor = "[S")
	private static final short[] aShortArray111 = new short[1];

	@OriginalMember(owner = "client!wca", name = "q", descriptor = "[B")
	private static final byte[] aByteArray85 = new byte[1];

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(II)Lclient!pha;")
	public static Class5_Sub5_Sub16 method7118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class5_Sub5_Sub16 local4 = (Class5_Sub5_Sub16) aClass273_35.method6577(); local4 != null; local4 = (Class5_Sub5_Sub16) aClass273_35.method6589()) {
			if (local4.aBoolean525 && local4.method6561(arg0, arg1)) {
				return local4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "()V")
	private static void method7119() {
		@Pc(4) int local4;
		@Pc(15) int local15;
		@Pc(49) int local49;
		for (@Pc(1) int local1 = 0; local1 < anInt8201; local1++) {
			for (local4 = 0; local4 < anInt8204; local4++) {
				local15 = aShortArray113[local1 + local4 * anInt8201] & 0xFFFF;
				if (local15 != 0) {
					@Pc(35) int local35;
					if (local15 == 65535) {
						@Pc(31) Class5_Sub17 local31 = (Class5_Sub17) aClass273_36.method6581((long) (local1 << 16 | local4));
						if (local31 != null) {
							for (local35 = 0; local35 < local31.aShortArray40.length; local35++) {
								@Pc(46) Class181 local46 = aClass246_6.method5497(local31.aShortArray40[local35] & 0xFFFF);
								local49 = local46.anInt4766;
								if (local46.anIntArray235 != null) {
									local46 = local46.method4279(anInterface12_2);
									if (local46 != null) {
										local49 = local46.anInt4766;
									}
								}
								if (local49 != -1) {
									@Pc(70) Class5_Sub26 local70 = new Class5_Sub26(local49);
									local70.anInt4153 = local1;
									local70.anInt4154 = local4;
									aClass330_46.method7917(local70);
								}
							}
						}
					} else {
						@Pc(94) Class181 local94 = aClass246_6.method5497(local15 - 1);
						local35 = local94.anInt4766;
						if (local94.anIntArray235 != null) {
							local94 = local94.method4279(anInterface12_2);
							if (local94 != null) {
								local35 = local94.anInt4766;
							}
						}
						if (local35 != -1) {
							@Pc(118) Class5_Sub26 local118 = new Class5_Sub26(local35);
							local118.anInt4153 = local1;
							local118.anInt4154 = local4;
							aClass330_46.method7917(local118);
						}
					}
				}
			}
		}
		for (local4 = 0; local4 < 3; local4++) {
			for (local15 = 0; local15 < aClass99ArrayArrayArray2[0].length; local15++) {
				for (@Pc(144) int local144 = 0; local144 < aClass99ArrayArrayArray2[0][0].length; local144++) {
					@Pc(153) Class99 local153 = aClass99ArrayArrayArray2[local4][local15][local144];
					if (local153 != null) {
						for (@Pc(160) Class4_Sub8 local160 = (Class4_Sub8) local153.method2045(); local160 != null; local160 = (Class4_Sub8) local153.method2047()) {
							if (local160.aShortArray107 != null) {
								for (local49 = 0; local49 < local160.aShortArray107.length; local49++) {
									@Pc(177) Class181 local177 = aClass246_6.method5497(local160.aShortArray107[local49] & 0xFFFF);
									@Pc(180) int local180 = local177.anInt4766;
									if (local177.anIntArray235 != null) {
										local177 = local177.method4279(anInterface12_2);
										if (local177 != null) {
											local180 = local177.anInt4766;
										}
									}
									if (local180 != -1) {
										@Pc(201) Class5_Sub26 local201 = new Class5_Sub26(local180);
										local201.anInt4153 = (local15 + (anInt8206 >> 6)) * 64 + local160.aByte112 - anInt8206;
										local201.anInt4154 = (local144 + (anInt8210 >> 6)) * 64 + local160.aByte109 - anInt8210;
										aClass330_46.method7917(local201);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lclient!ha;Lclient!iba;Lclient!re;)V")
	public static void method7120(@OriginalArg(0) Class133 arg0, @OriginalArg(1) Class5_Sub26 arg1, @OriginalArg(2) Class299 arg2) {
		if (arg2.anIntArray458 == null) {
			return;
		}
		@Pc(7) int[] local7 = new int[arg2.anIntArray458.length];
		@Pc(20) int local20;
		@Pc(32) int local32;
		for (@Pc(9) int local9 = 0; local9 < local7.length / 2; local9++) {
			local20 = arg2.anIntArray458[local9 * 2] + arg1.anInt4153;
			local32 = arg2.anIntArray458[local9 * 2 + 1] + arg1.anInt4154;
			local7[local9 * 2] = anInt8211 + (anInt8203 - anInt8211) * (local20 - anInt8205) / (anInt8208 - anInt8205);
			local7[local9 * 2 + 1] = anInt8200 - (anInt8200 - anInt8202) * (local32 - anInt8209) / (anInt8207 - anInt8209);
		}
		Static153.method2237(arg0, local7, arg2.anInt8120);
		if (arg2.anInt8143 > 0) {
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
				arg0.method7260(local32, local102, local110, local120, arg2.anIntArray459[arg2.aByteArray78[local20] & 0xFF], arg2.anInt8143, arg2.anInt8138, arg2.anInt8125);
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
			arg0.method7260(local32, local102, local110, local120, arg2.anIntArray459[arg2.aByteArray78[arg2.aByteArray78.length - 1] & 0xFF], arg2.anInt8143, arg2.anInt8138, arg2.anInt8125);
			return;
		}
		for (local20 = 0; local20 < local7.length / 2 - 1; local20++) {
			arg0.method7285(local7[local20 * 2 + 1], local7[(local20 + 1) * 2], local7[local20 * 2], arg2.anIntArray459[arg2.aByteArray78[local20] & 0xFF], local7[(local20 + 1) * 2 + 1]);
		}
		arg0.method7285(local7[local7.length - 1], local7[0], local7[local7.length - 2], arg2.anIntArray459[arg2.aByteArray78[arg2.aByteArray78.length - 1] & 0xFF], local7[1]);
	}

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "()V")
	public static void method7121() {
		@Pc(2) int[] local2 = new int[3];
		for (@Pc(4) int local4 = 0; local4 < aClass378_4.anInt10597; local4++) {
			@Pc(32) boolean local32 = aClass5_Sub5_Sub16_2.method6558(local2, aClass378_4.anIntArray603[local4] & 0x3FFF, aClass378_4.anIntArray603[local4] >> 28 & 0x3, aClass378_4.anIntArray603[local4] >> 14 & 0x3FFF);
			if (local32) {
				@Pc(42) Class5_Sub26 local42 = new Class5_Sub26(aClass378_4.anIntArray602[local4]);
				local42.anInt4153 = local2[1] - anInt8206;
				local42.anInt4154 = local2[2] - anInt8210;
				aClass330_46.method7917(local42);
			}
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(I)Lclient!pha;")
	public static Class5_Sub5_Sub16 method7122(@OriginalArg(0) int arg0) {
		return (Class5_Sub5_Sub16) aClass273_35.method6581((long) arg0);
	}

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "(I)V")
	public static void method7123(@OriginalArg(0) int arg0) {
		aClass5_Sub5_Sub16_2 = (Class5_Sub5_Sub16) aClass273_35.method6581((long) arg0);
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lclient!ha;IIII)Lclient!tg;")
	private static Class330 method7124(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(4) Class5_Sub26 local4 = (Class5_Sub26) aClass330_46.method7908(); local4 != null; local4 = (Class5_Sub26) aClass330_46.method7914()) {
			method7128(arg0, local4, arg1, arg2);
		}
		return aClass330_46;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lclient!ha;IIII[S[B)V")
	private static void method7125(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		if (arg5 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < arg5.length; local4++) {
			@Pc(14) Class181 local14 = aClass246_6.method5497(arg5[local4] & 0xFFFF);
			@Pc(17) int local17 = local14.anInt4789;
			if (local17 != -1) {
				@Pc(25) Class348 local25 = aClass333_2.method7937(local17);
				@Pc(49) Class28 local49 = local25.method8242(local14.aBoolean350 ? arg6[local4] >> 6 & 0x3 : 0, local14.aBoolean349 ? local14.aBoolean354 : false, arg0);
				if (local49 != null) {
					@Pc(58) int local58 = arg3 * local49.method4035() >> 2;
					@Pc(65) int local65 = arg4 * local49.method4042() >> 2;
					if (local25.aBoolean691) {
						@Pc(71) int local71 = local14.anInt4756;
						@Pc(74) int local74 = local14.anInt4781;
						if ((arg6[local4] >> 6 & 0x1) == 1) {
							@Pc(85) int local85 = local71;
							local71 = local74;
							local74 = local85;
						}
						local58 = local71 * arg3;
						local65 = local74 * arg4;
					}
					if (local58 != 0 && local65 != 0) {
						if (local25.anInt9595 == 0) {
							local49.method4046(arg1, arg2 + arg4 - local65, local58, local65);
						} else {
							local49.method4051(arg1, arg2 + arg4 - local65, local58, local65, 0, local25.anInt9595 | 0xFF000000, 1);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lclient!d;II)V")
	public static void method7126(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < aClass289_6.anInt7727; local1++) {
			anIntArray462[local1 + 1] = method7131(arg0, local1, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "(II)Lclient!vu;")
	public static Class368 method7127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class368 local3 = new Class368();
		for (@Pc(8) Class5_Sub5_Sub16 local8 = (Class5_Sub5_Sub16) aClass273_35.method6577(); local8 != null; local8 = (Class5_Sub5_Sub16) aClass273_35.method6589()) {
			if (local8.aBoolean525 && local8.method6561(arg0, arg1)) {
				local3.method8709(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lclient!ha;Lclient!iba;IIII)V")
	private static void method7128(@OriginalArg(0) Class133 arg0, @OriginalArg(1) Class5_Sub26 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1.anInt4150 = anInt8211 + (arg2 * (arg1.anInt4153 - anInt8205) >> 16);
		arg1.anInt4152 = anInt8200 - (arg3 * (arg1.anInt4154 - anInt8209) >> 16);
	}

	@OriginalMember(owner = "client!wca", name = "c", descriptor = "()V")
	public static void method7129() {
		aByteArray88 = null;
		aByteArray86 = null;
		aShortArray112 = null;
		aByteArray90 = null;
		aByteArray87 = null;
		aShortArray113 = null;
		aByteArray89 = null;
		aClass273_36 = null;
		aClass99ArrayArrayArray2 = null;
		anIntArray462 = null;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "([B[B[SII)V")
	private static void method7130(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int[] local2 = new int[anInt8204];
		@Pc(5) int[] local5 = new int[anInt8204];
		@Pc(8) int[] local8 = new int[anInt8204];
		@Pc(11) int[] local11 = new int[anInt8204];
		@Pc(14) int[] local14 = new int[anInt8204];
		for (@Pc(16) int local16 = -5; local16 < anInt8201; local16++) {
			@Pc(21) int local21 = local16 + 5;
			@Pc(25) int local25 = local16 - 5;
			@Pc(41) int local41;
			for (@Pc(27) int local27 = 0; local27 < anInt8204; local27++) {
				@Pc(50) Class297 local50;
				@Pc(86) int local86;
				if (local21 < anInt8201) {
					local41 = arg0[local21 + local27 * anInt8201] & 0xFF;
					if (local41 > 0) {
						local50 = aClass23_4.method312(local41 - 1);
						local2[local27] += local50.anInt8075;
						local5[local27] += local50.anInt8070;
						local8[local27] += local50.anInt8067;
						local11[local27] += local50.anInt8074;
						local86 = local14[local27]++;
					}
				}
				if (local25 >= 0) {
					local41 = arg0[local25 + local27 * anInt8201] & 0xFF;
					if (local41 > 0) {
						local50 = aClass23_4.method312(local41 - 1);
						local2[local27] -= local50.anInt8075;
						local5[local27] -= local50.anInt8070;
						local8[local27] -= local50.anInt8067;
						local11[local27] -= local50.anInt8074;
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
				for (@Pc(167) int local167 = -5; local167 < anInt8204; local167++) {
					@Pc(172) int local172 = local167 + 5;
					if (local172 < anInt8204) {
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
						if ((arg0[local16 + local167 * anInt8201] & 0xFF) == 0) {
							local261 = local16 + local167 * anInt8201;
							arg1[local261] = 0;
							arg2[local261] = 0;
						} else {
							local261 = local163 == 0 ? 0 : Static553.method8055(local41 * 256 / local163, local159 / local165, local161 / local165);
							@Pc(294) int local294 = (local261 & 0x7F) + arg4;
							if (local294 < 0) {
								local294 = 0;
							} else if (local294 > 127) {
								local294 = 127;
							}
							@Pc(316) int local316 = (local261 + arg3 & 0xFC00) + (local261 & 0x380) + local294;
							@Pc(322) int local322 = local16 + local167 * anInt8201;
							@Pc(333) int local333 = Static66.anIntArray97[Static547.method7982(Static28.method314(local316)) & 0xFFFF];
							arg1[local322] = (byte) (local333 >> 16 & 0xFF);
							arg2[local322] = (short) (local333 & 0xFFFF);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lclient!d;III)I")
	private static int method7131(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class239 local4 = aClass289_6.method6822(arg1);
		if (local4 == null) {
			return 0;
		}
		@Pc(11) int local11 = local4.anInt5979;
		if (local11 >= 0 && arg0.method4656(local11).aBoolean291) {
			local11 = -1;
		}
		@Pc(68) int local68;
		@Pc(27) int local27;
		@Pc(33) int local33;
		@Pc(55) int local55;
		if (local4.anInt5970 >= 0) {
			local27 = local4.anInt5970;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static66.anIntArray97[Static547.method7982(Static514.method7636(local55)) & 0xFFFF] | 0xFF000000;
		} else if (local11 >= 0) {
			local68 = Static66.anIntArray97[Static547.method7982(Static514.method7636(arg0.method4656(local11).aShort61)) & 0xFFFF] | 0xFF000000;
		} else if (local4.anInt5977 == -1) {
			local68 = 0;
		} else {
			local27 = local4.anInt5977;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static66.anIntArray97[Static547.method7982(Static514.method7636(local55)) & 0xFFFF] | 0xFF000000;
		}
		return local68;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lclient!la;Lclient!qha;Lclient!au;Lclient!ni;Lclient!bt;Lclient!ti;Lclient!ko;)V")
	public static void method7132(@OriginalArg(0) Class207 arg0, @OriginalArg(1) Class289 arg1, @OriginalArg(2) Class23 arg2, @OriginalArg(3) Class246 arg3, @OriginalArg(4) Class42 arg4, @OriginalArg(5) Class333 arg5, @OriginalArg(6) Interface12 arg6) {
		aClass207_103 = arg0;
		aClass289_6 = arg1;
		aClass23_4 = arg2;
		aClass246_6 = arg3;
		aClass42_4 = arg4;
		aClass333_2 = arg5;
		anInterface12_2 = arg6;
		aClass273_35.method6586();
		@Pc(21) int local21 = aClass207_103.method4686("details");
		@Pc(26) int[] local26 = aClass207_103.method4676(local21);
		if (local26 != null) {
			for (@Pc(30) int local30 = 0; local30 < local26.length; local30++) {
				@Pc(39) Class5_Sub5_Sub16 local39 = Static53.method912(aClass207_103, local21, local26[local30]);
				aClass273_35.method6585((long) local39.anInt7401, local39);
			}
		}
		Static627.method8869(false, true);
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lclient!ha;)V")
	public static void method7133(@OriginalArg(0) Class133 arg0) {
		@Pc(3) int local3 = anInt8208 - anInt8205;
		@Pc(7) int local7 = anInt8207 - anInt8209;
		@Pc(15) int local15 = (anInt8203 - anInt8211 << 16) / local3;
		@Pc(23) int local23 = (anInt8200 - anInt8202 << 16) / local7;
		method7139(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!wca", name = "d", descriptor = "()V")
	public static void method7134() {
		aByteArray88 = new byte[anInt8201 * anInt8204];
		aByteArray90 = new byte[anInt8201 * anInt8204];
		aByteArray87 = new byte[anInt8201 * anInt8204];
		aShortArray113 = new short[anInt8201 * anInt8204];
		aByteArray89 = new byte[anInt8201 * anInt8204];
		aClass273_36 = new Class273(1024);
		aClass99ArrayArrayArray2 = new Class99[3][anInt8201 >> 6][anInt8204 >> 6];
		anIntArray462 = new int[aClass289_6.anInt7727 + 1];
	}

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "(Lclient!ha;)Lclient!tg;")
	public static Class330 method7135(@OriginalArg(0) Class133 arg0) {
		@Pc(3) int local3 = anInt8208 - anInt8205;
		@Pc(7) int local7 = anInt8207 - anInt8209;
		@Pc(15) int local15 = (anInt8203 - anInt8211 << 16) / local3;
		@Pc(23) int local23 = (anInt8200 - anInt8202 << 16) / local7;
		return method7124(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lclient!ha;II)V")
	public static void method7137(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class5_Sub22 local9 = new Class5_Sub22(aClass207_103.method4695("area", aClass5_Sub5_Sub16_2.aString80));
		@Pc(13) int local13 = local9.method5966();
		@Pc(16) int[] local16 = new int[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			local16[local18] = local9.method5966();
		}
		@Pc(33) int local33 = local9.method5966();
		@Pc(36) int[] local36 = new int[local33];
		for (@Pc(38) int local38 = 0; local38 < local33; local38++) {
			local36[local38] = local9.method5966();
		}
		while (true) {
			@Pc(58) int local58;
			@Pc(64) int local64;
			@Pc(67) int local67;
			@Pc(76) int local76;
			@Pc(148) int local148;
			while (local9.anInt6629 < local9.aByteArray71.length) {
				@Pc(62) int local62;
				@Pc(84) int local84;
				if (local9.method5966() == 0) {
					local58 = local9.method5966();
					local62 = local9.method5966();
					for (local64 = 0; local64 < 64; local64++) {
						for (local67 = 0; local67 < 64; local67++) {
							local76 = local58 * 64 + local64 - anInt8206;
							local84 = local62 * 64 + local67 - anInt8210;
							method7140(arg0, local9, local58, local62, local76, local84, local16, local36);
						}
					}
				} else {
					local58 = local9.method5966();
					local62 = local9.method5966();
					local64 = local9.method5966();
					local67 = local9.method5966();
					for (local76 = 0; local76 < 8; local76++) {
						for (local84 = 0; local84 < 8; local84++) {
							@Pc(136) int local136 = local58 * 64 + local64 * 8 + local76 - anInt8206;
							local148 = local62 * 64 + local67 * 8 + local84 - anInt8210;
							method7140(arg0, local9, local58, local62, local136, local148, local16, local36);
						}
					}
				}
			}
			aByteArray86 = new byte[anInt8201 * anInt8204];
			aShortArray112 = new short[anInt8201 * anInt8204];
			for (local58 = 0; local58 < 3; local58++) {
				@Pc(191) byte[] local191 = new byte[anInt8201 * anInt8204];
				for (local64 = 0; local64 < aClass99ArrayArrayArray2[local58].length; local64++) {
					for (local67 = 0; local67 < aClass99ArrayArrayArray2[local58][0].length; local67++) {
						@Pc(205) Class99 local205 = aClass99ArrayArrayArray2[local58][local64][local67];
						if (local205 != null) {
							for (@Pc(212) Class4_Sub8 local212 = (Class4_Sub8) local205.method2045(); local212 != null; local212 = (Class4_Sub8) local205.method2047()) {
								local191[local64 * 64 + local212.aByte112 + (local67 * 64 + local212.aByte109) * anInt8201] = (byte) local212.anInt7706;
							}
						}
					}
				}
				method7130(local191, aByteArray86, aShortArray112, arg1, arg2);
				for (local67 = 0; local67 < aClass99ArrayArrayArray2[local58].length; local67++) {
					for (local76 = 0; local76 < aClass99ArrayArrayArray2[local58][0].length; local76++) {
						@Pc(276) Class99 local276 = aClass99ArrayArrayArray2[local58][local67][local76];
						if (local276 != null) {
							for (@Pc(283) Class4_Sub8 local283 = (Class4_Sub8) local276.method2045(); local283 != null; local283 = (Class4_Sub8) local276.method2047()) {
								local148 = local67 * 64 + local283.aByte112 + (local76 * 64 + local283.aByte109) * anInt8201;
								local283.anInt7706 = (aByteArray86[local148] & 0xFF) << 16 | aShortArray112[local148] & 0xFFFF;
								if (local283.anInt7706 != 0) {
									local283.anInt7706 |= 0xFF000000;
								}
							}
						}
					}
				}
			}
			method7130(aByteArray88, aByteArray86, aShortArray112, arg1, arg2);
			aByteArray88 = null;
			method7119();
			return;
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lclient!ha;IIIIIII[S[BZ)V")
	private static void method7138(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) boolean arg10) {
		@Pc(20) int local20;
		@Pc(32) int local32;
		if (arg10 || arg5 != 0 || arg6 > 0) {
			if (arg6 == 0) {
				arg0.aa(arg1, arg2, arg3, arg4, arg5, 0);
			} else {
				local20 = arg7 & 0x3F;
				if (local20 == 0 || arg3 <= 1 || arg4 <= 1) {
					local32 = anIntArray462[arg6];
					if (arg10 || local32 != 0) {
						arg0.aa(arg1, arg2, arg3, arg4, local32, 0);
					}
				} else {
					local32 = arg10 ? 0 : 1;
					Static637.method7526(local20, arg4, arg7 >> 6 & 0x3, arg2, local32, anInt8198, arg3, arg5, arg0, anIntArray462[arg6], arg1, aByteArrayArrayArray20);
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
				@Pc(127) Class181 local127 = aClass246_6.method5497(arg8[local100] & 0xFFFF);
				if (local127.anInt4789 == -1) {
					@Pc(133) int local133 = -3355444;
					if (local127.anInt4779 == 1) {
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

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "(Lclient!ha;IIII)V")
	private static void method7139(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = anInt8208 - anInt8205;
		@Pc(7) int local7 = anInt8207 - anInt8209;
		if (anInt8208 < anInt8201) {
			local3++;
		}
		if (anInt8207 < anInt8204) {
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
			local28 = (arg1 * local17 >> 16) + anInt8211;
			local40 = (arg1 * (local17 + 1) >> 16) + anInt8211;
			local44 = local40 - local28;
			if (local44 > 0) {
				local50 = anInt8205 + local17;
				if (local50 >= 0 && local50 < anInt8201) {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt8200 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt8200 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (local84 > 0) {
							local93 = local57 + anInt8209;
							local173 = local50 + local93 * anInt8201;
							local175 = 0;
							local177 = 0;
							local179 = 0;
							if (local93 >= 0 && local93 < anInt8204) {
								local175 = (aByteArray86[local173] & 0xFF) << 16 | aShortArray112[local173] & 0xFFFF;
								if (local175 != 0) {
									local175 |= 0xFF000000;
								}
								local177 = aByteArray90[local173] & 0xFF;
								local179 = aShortArray113[local173] & 0xFFFF;
							}
							if (local175 == 0 && local177 == 0 && local179 == 0) {
								if (aClass5_Sub5_Sub16_2.anInt7395 != -1) {
									local175 = aClass5_Sub5_Sub16_2.anInt7395 | 0xFF000000;
								} else if ((local17 + anInt8205 & 0x4) == (local57 + anInt8207 & 0x4)) {
									local175 = anIntArray462[aClass289_6.anInt7734 + 1];
								} else {
									local175 = -11840664;
								}
								if (local175 == 0) {
									local175 = -16777216;
								}
								arg0.aa(local28, local70, local44, local84, local175, 0);
							} else if (local179 <= 0) {
								method7138(arg0, local28, local70, local44, local84, local175, local177, aByteArray87[local173], null, null, true);
							} else if (local179 == 65535) {
								@Pc(282) Class5_Sub17 local282 = (Class5_Sub17) aClass273_36.method6581((long) (local50 << 16 | local93));
								if (local282 != null) {
									method7138(arg0, local28, local70, local44, local84, local175, local177, aByteArray87[local173], local282.aShortArray40, local282.aByteArray19, true);
								}
							} else {
								aShortArray111[0] = (short) (local179 - 1);
								aByteArray85[0] = aByteArray89[local173];
								method7138(arg0, local28, local70, local44, local84, local175, local177, aByteArray87[local173], aShortArray111, aByteArray85, true);
							}
						}
					}
				} else {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt8200 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt8200 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (aClass5_Sub5_Sub16_2.anInt7395 != -1) {
							local93 = aClass5_Sub5_Sub16_2.anInt7395 | 0xFF000000;
						} else if ((local17 + anInt8205 & 0x4) == (local57 + anInt8207 & 0x4)) {
							local93 = anIntArray462[aClass289_6.anInt7734 + 1];
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
			local40 = (arg1 * local28 >> 16) + anInt8211;
			local44 = (arg1 * (local28 + 1) >> 16) + anInt8211;
			local50 = local44 - local40;
			if (local50 > 0) {
				local57 = local28 + anInt8205;
				if (local57 >= 0 && local57 < anInt8201) {
					for (local70 = -16; local70 < local7 + 16; local70++) {
						local80 = anInt8200 - (arg2 * (local70 + 1) >> 16);
						local84 = anInt8200 - (arg2 * local70 >> 16);
						local93 = local84 - local80;
						if (local93 > 0) {
							local173 = local70 + anInt8209;
							if (local173 >= 0 && local173 < anInt8204) {
								local175 = aShortArray113[local57 + local173 * anInt8201] & 0xFFFF;
								if (local175 <= 0) {
									method7125(arg0, local40, local80, local50, local93, null, null);
								} else if (local175 == 65535) {
									@Pc(459) Class5_Sub17 local459 = (Class5_Sub17) aClass273_36.method6581((long) (local57 << 16 | local173));
									if (local459 != null) {
										method7125(arg0, local40, local80, local50, local93, local459.aShortArray40, local459.aByteArray19);
									}
								} else {
									aShortArray111[0] = (short) (local175 - 1);
									aByteArray85[0] = aByteArray89[local57 + local173 * anInt8201];
									method7125(arg0, local40, local80, local50, local93, aShortArray111, aByteArray85);
								}
							}
						}
					}
				}
			}
		}
		local40 = anInt8205 >> 6;
		local44 = anInt8209 >> 6;
		if (local40 < 0) {
			local40 = 0;
		}
		if (local44 < 0) {
			local44 = 0;
		}
		local50 = anInt8208 >> 6;
		local57 = anInt8207 >> 6;
		if (local50 >= aClass99ArrayArrayArray2[0].length) {
			local50 = aClass99ArrayArrayArray2[0].length - 1;
		}
		if (local57 >= aClass99ArrayArrayArray2[0][0].length) {
			local57 = aClass99ArrayArrayArray2[0][0].length - 1;
		}
		for (local70 = 0; local70 < 3; local70++) {
			@Pc(641) int local641;
			@Pc(653) int local653;
			@Pc(665) int local665;
			@Pc(675) int local675;
			@Pc(631) int local631;
			for (local80 = local40; local80 <= local50; local80++) {
				for (local84 = local44; local84 <= local57; local84++) {
					@Pc(589) Class99 local589 = aClass99ArrayArrayArray2[local70][local80][local84];
					if (local589 != null) {
						local173 = (local80 + (anInt8206 >> 6)) * 64;
						local175 = (local84 + (anInt8210 >> 6)) * 64;
						for (@Pc(612) Class4_Sub8 local612 = (Class4_Sub8) local589.method2045(); local612 != null; local612 = (Class4_Sub8) local589.method2047()) {
							local179 = local173 + local612.aByte112 - anInt8206 - anInt8205;
							local631 = local175 + local612.aByte109 - anInt8210 - anInt8209;
							local641 = (arg1 * local179 >> 16) + anInt8211;
							local653 = (arg1 * (local179 + 1) >> 16) + anInt8211;
							local665 = anInt8200 - (arg2 * (local631 + 1) >> 16);
							local675 = anInt8200 - (arg2 * local631 >> 16);
							method7138(arg0, local641, local665, local653 - local641, local675 - local665, local612.anInt7706, local612.aByte110 & 0xFF, local612.aByte111, local612.aShortArray107, local612.aByteArray74, false);
						}
					}
				}
			}
			for (local84 = local40; local84 <= local50; local84++) {
				for (local93 = local44; local93 <= local57; local93++) {
					@Pc(727) Class99 local727 = aClass99ArrayArrayArray2[local70][local84][local93];
					if (local727 != null) {
						local175 = (local84 + (anInt8206 >> 6)) * 64;
						local177 = (local93 + (anInt8210 >> 6)) * 64;
						for (@Pc(750) Class4_Sub8 local750 = (Class4_Sub8) local727.method2045(); local750 != null; local750 = (Class4_Sub8) local727.method2047()) {
							local631 = local175 + local750.aByte112 - anInt8206 - anInt8205;
							local641 = local177 + local750.aByte109 - anInt8210 - anInt8209;
							local653 = (arg1 * local631 >> 16) + anInt8211;
							local665 = (arg1 * (local631 + 1) >> 16) + anInt8211;
							local675 = anInt8200 - (arg2 * (local641 + 1) >> 16);
							@Pc(813) int local813 = anInt8200 - (arg2 * local641 >> 16);
							method7125(arg0, local653, local675, local665 - local653, local813 - local675, local750.aShortArray107, local750.aByteArray74);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lclient!ha;Lclient!ofa;IIII[I[I)V")
	private static void method7140(@OriginalArg(0) Class133 arg0, @OriginalArg(1) Class5_Sub22 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		@Pc(3) int local3 = arg1.method5966();
		if ((local3 & 0x1) == 0) {
			@Pc(15) boolean local15 = (local3 & 0x2) == 0;
			@Pc(21) int local21 = local3 >> 2 & 0x3F;
			if (local21 != 62) {
				if (local21 == 63) {
					local21 = arg1.method5966();
				} else if (local15) {
					local21 = arg6[local21];
				} else {
					local21 = arg7[local21];
				}
				if (local15) {
					aByteArray88[arg4 + arg5 * anInt8201] = (byte) local21;
					aByteArray90[arg4 + arg5 * anInt8201] = 0;
				} else {
					aByteArray90[arg4 + arg5 * anInt8201] = (byte) local21;
					aByteArray87[arg4 + arg5 * anInt8201] = 0;
					aByteArray88[arg4 + arg5 * anInt8201] = arg1.method5963();
				}
			}
			return;
		}
		@Pc(100) int local100 = (local3 >> 1 & 0x3) + 1;
		@Pc(108) boolean local108 = (local3 & 0x8) != 0;
		@Pc(116) boolean local116 = (local3 & 0x10) != 0;
		for (@Pc(118) int local118 = 0; local118 < local100; local118++) {
			@Pc(123) int local123 = arg1.method5966();
			@Pc(125) int local125 = 0;
			@Pc(127) int local127 = 0;
			if (local108) {
				local125 = arg1.method5966();
				local127 = arg1.method5966();
			}
			@Pc(139) int local139 = 0;
			if (local116) {
				local139 = arg1.method5966();
			}
			@Pc(215) short[] local215;
			@Pc(218) byte[] local218;
			@Pc(220) int local220;
			if (local118 == 0) {
				aByteArray88[arg4 + arg5 * anInt8201] = (byte) local123;
				aByteArray90[arg4 + arg5 * anInt8201] = (byte) local125;
				aByteArray87[arg4 + arg5 * anInt8201] = (byte) local127;
				if (local139 == 1) {
					aShortArray113[arg4 + arg5 * anInt8201] = (short) (arg1.method5968() + 1);
					aByteArray89[arg4 + arg5 * anInt8201] = arg1.method5963();
				} else if (local139 > 1) {
					aShortArray113[arg4 + arg5 * anInt8201] = -1;
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method5968();
						local218[local220] = arg1.method5963();
					}
					aClass273_36.method6585((long) (arg4 << 16 | arg5), new Class5_Sub17(local215, local218));
				}
			} else {
				local215 = null;
				local218 = null;
				if (local139 > 0) {
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method5968();
						local218[local220] = arg1.method5963();
					}
				}
				if (aClass99ArrayArrayArray2[local118 - 1][arg2 - (anInt8206 >> 6)][arg3 - (anInt8210 >> 6)] == null) {
					aClass99ArrayArrayArray2[local118 - 1][arg2 - (anInt8206 >> 6)][arg3 - (anInt8210 >> 6)] = new Class99();
				}
				@Pc(338) Class4_Sub8 local338 = new Class4_Sub8(arg4 & 0x3F, arg5 & 0x3F, local123, local125, local127, local215, local218);
				aClass99ArrayArrayArray2[local118 - 1][arg2 - (anInt8206 >> 6)][arg3 - (anInt8210 >> 6)].method2039(local338);
			}
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(IIIIIIII)V")
	public static void method7141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt8205 = arg0 - anInt8206;
		anInt8207 = arg1 - anInt8210;
		anInt8208 = arg2 - anInt8206;
		anInt8209 = arg3 - anInt8210;
		anInt8211 = arg4;
		anInt8202 = arg5;
		anInt8203 = arg6;
		anInt8200 = arg7;
	}
}
