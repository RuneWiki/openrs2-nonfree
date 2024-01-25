import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static572 {

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "Lclient!rw;")
	public static Class298 aClass298_4;

	@OriginalMember(owner = "client!waa", name = "b", descriptor = "Lclient!ok;")
	public static Class249 aClass249_4;

	@OriginalMember(owner = "client!waa", name = "c", descriptor = "Lclient!ud;")
	private static Class324 aClass324_6;

	@OriginalMember(owner = "client!waa", name = "d", descriptor = "Lclient!us;")
	private static Class335 aClass335_5;

	@OriginalMember(owner = "client!waa", name = "e", descriptor = "Lclient!qba;")
	public static Class4_Sub6_Sub16 aClass4_Sub6_Sub16_3;

	@OriginalMember(owner = "client!waa", name = "f", descriptor = "Lclient!vo;")
	public static Class348 aClass348_128;

	@OriginalMember(owner = "client!waa", name = "g", descriptor = "Lclient!gda;")
	public static Class121 aClass121_4;

	@OriginalMember(owner = "client!waa", name = "i", descriptor = "Lclient!of;")
	public static Interface17 anInterface17_2;

	@OriginalMember(owner = "client!waa", name = "j", descriptor = "Lclient!bs;")
	public static Class42 aClass42_3;

	@OriginalMember(owner = "client!waa", name = "k", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray18;

	@OriginalMember(owner = "client!waa", name = "l", descriptor = "F")
	public static float aFloat201;

	@OriginalMember(owner = "client!waa", name = "n", descriptor = "F")
	public static float aFloat202;

	@OriginalMember(owner = "client!waa", name = "o", descriptor = "I")
	public static int anInt10050;

	@OriginalMember(owner = "client!waa", name = "t", descriptor = "I")
	public static int anInt10053;

	@OriginalMember(owner = "client!waa", name = "u", descriptor = "I")
	public static int anInt10054;

	@OriginalMember(owner = "client!waa", name = "v", descriptor = "[B")
	private static byte[] aByteArray99;

	@OriginalMember(owner = "client!waa", name = "w", descriptor = "[B")
	private static byte[] aByteArray100;

	@OriginalMember(owner = "client!waa", name = "x", descriptor = "I")
	public static int anInt10055;

	@OriginalMember(owner = "client!waa", name = "y", descriptor = "[B")
	private static byte[] aByteArray101;

	@OriginalMember(owner = "client!waa", name = "z", descriptor = "I")
	public static int anInt10056;

	@OriginalMember(owner = "client!waa", name = "A", descriptor = "[I")
	private static int[] anIntArray568;

	@OriginalMember(owner = "client!waa", name = "B", descriptor = "[S")
	private static short[] aShortArray135;

	@OriginalMember(owner = "client!waa", name = "C", descriptor = "I")
	public static int anInt10057;

	@OriginalMember(owner = "client!waa", name = "D", descriptor = "[B")
	private static byte[] aByteArray102;

	@OriginalMember(owner = "client!waa", name = "E", descriptor = "[S")
	private static short[] aShortArray136;

	@OriginalMember(owner = "client!waa", name = "F", descriptor = "I")
	public static int anInt10058;

	@OriginalMember(owner = "client!waa", name = "G", descriptor = "[B")
	private static byte[] aByteArray103;

	@OriginalMember(owner = "client!waa", name = "H", descriptor = "I")
	public static int anInt10059;

	@OriginalMember(owner = "client!waa", name = "I", descriptor = "I")
	public static int anInt10060;

	@OriginalMember(owner = "client!waa", name = "J", descriptor = "I")
	public static int anInt10061;

	@OriginalMember(owner = "client!waa", name = "K", descriptor = "Lclient!mo;")
	private static Class221 aClass221_39;

	@OriginalMember(owner = "client!waa", name = "L", descriptor = "I")
	public static int anInt10062;

	@OriginalMember(owner = "client!waa", name = "M", descriptor = "[[[Lclient!iv;")
	private static Class158[][][] aClass158ArrayArrayArray2;

	@OriginalMember(owner = "client!waa", name = "N", descriptor = "I")
	public static int anInt10063;

	@OriginalMember(owner = "client!waa", name = "O", descriptor = "I")
	public static int anInt10064;

	@OriginalMember(owner = "client!waa", name = "h", descriptor = "Lclient!mo;")
	private static final Class221 aClass221_38 = new Class221(16);

	@OriginalMember(owner = "client!waa", name = "m", descriptor = "[B")
	private static final byte[] aByteArray98 = new byte[1];

	@OriginalMember(owner = "client!waa", name = "p", descriptor = "[S")
	private static final short[] aShortArray134 = new short[1];

	@OriginalMember(owner = "client!waa", name = "q", descriptor = "I")
	public static int anInt10051 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!waa", name = "r", descriptor = "I")
	public static int anInt10052 = (int) (Math.random() * 11.0D) - 5;

	@OriginalMember(owner = "client!waa", name = "s", descriptor = "Lclient!au;")
	public static final Class22 aClass22_64 = new Class22();

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "()V")
	private static void method7748() {
		@Pc(4) int local4;
		@Pc(15) int local15;
		@Pc(49) int local49;
		for (@Pc(1) int local1 = 0; local1 < anInt10062; local1++) {
			for (local4 = 0; local4 < anInt10057; local4++) {
				local15 = aShortArray135[local1 + local4 * anInt10062] & 0xFFFF;
				if (local15 != 0) {
					@Pc(35) int local35;
					if (local15 == 65535) {
						@Pc(31) Class4_Sub7 local31 = (Class4_Sub7) aClass221_39.method5075((long) (local1 << 16 | local4));
						if (local31 != null) {
							for (local35 = 0; local35 < local31.aShortArray9.length; local35++) {
								@Pc(46) Class233 local46 = aClass298_4.method6822(local31.aShortArray9[local35] & 0xFFFF);
								local49 = local46.anInt6674;
								if (local46.anIntArray374 != null) {
									local46 = local46.method5295(anInterface17_2);
									if (local46 != null) {
										local49 = local46.anInt6674;
									}
								}
								if (local49 != -1) {
									@Pc(70) Class4_Sub20 local70 = new Class4_Sub20(local49);
									local70.anInt3263 = local1;
									local70.anInt3264 = local4;
									aClass22_64.method894(local70);
								}
							}
						}
					} else {
						@Pc(94) Class233 local94 = aClass298_4.method6822(local15 - 1);
						local35 = local94.anInt6674;
						if (local94.anIntArray374 != null) {
							local94 = local94.method5295(anInterface17_2);
							if (local94 != null) {
								local35 = local94.anInt6674;
							}
						}
						if (local35 != -1) {
							@Pc(118) Class4_Sub20 local118 = new Class4_Sub20(local35);
							local118.anInt3263 = local1;
							local118.anInt3264 = local4;
							aClass22_64.method894(local118);
						}
					}
				}
			}
		}
		for (local4 = 0; local4 < 3; local4++) {
			for (local15 = 0; local15 < aClass158ArrayArrayArray2[0].length; local15++) {
				for (@Pc(144) int local144 = 0; local144 < aClass158ArrayArrayArray2[0][0].length; local144++) {
					@Pc(153) Class158 local153 = aClass158ArrayArrayArray2[local4][local15][local144];
					if (local153 != null) {
						for (@Pc(160) Class21_Sub10 local160 = (Class21_Sub10) local153.method3726(); local160 != null; local160 = (Class21_Sub10) local153.method3721()) {
							if (local160.aShortArray127 != null) {
								for (local49 = 0; local49 < local160.aShortArray127.length; local49++) {
									@Pc(177) Class233 local177 = aClass298_4.method6822(local160.aShortArray127[local49] & 0xFFFF);
									@Pc(180) int local180 = local177.anInt6674;
									if (local177.anIntArray374 != null) {
										local177 = local177.method5295(anInterface17_2);
										if (local177 != null) {
											local180 = local177.anInt6674;
										}
									}
									if (local180 != -1) {
										@Pc(201) Class4_Sub20 local201 = new Class4_Sub20(local180);
										local201.anInt3263 = (local15 + (anInt10056 >> 6)) * 64 + local160.aByte119 - anInt10056;
										local201.anInt3264 = (local144 + (anInt10059 >> 6)) * 64 + local160.aByte117 - anInt10059;
										aClass22_64.method894(local201);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lclient!fa;II)V")
	public static void method7749(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < aClass324_6.anInt9644; local1++) {
			anIntArray568[local1 + 1] = method7760(arg0, local1, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!waa", name = "b", descriptor = "()V")
	public static void method7750() {
		aByteArray99 = new byte[anInt10062 * anInt10057];
		aByteArray103 = new byte[anInt10062 * anInt10057];
		aByteArray100 = new byte[anInt10062 * anInt10057];
		aShortArray135 = new short[anInt10062 * anInt10057];
		aByteArray101 = new byte[anInt10062 * anInt10057];
		aClass221_39 = new Class221(1024);
		aClass158ArrayArrayArray2 = new Class158[3][anInt10062 >> 6][anInt10057 >> 6];
		anIntArray568 = new int[aClass324_6.anInt9644 + 1];
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lclient!r;)V")
	public static void method7751(@OriginalArg(0) Class7 arg0) {
		@Pc(3) int local3 = anInt10058 - anInt10064;
		@Pc(7) int local7 = anInt10061 - anInt10054;
		@Pc(15) int local15 = (anInt10055 - anInt10060 << 16) / local3;
		@Pc(23) int local23 = (anInt10063 - anInt10053 << 16) / local7;
		method7765(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(I)Lclient!qba;")
	public static Class4_Sub6_Sub16 method7752(@OriginalArg(0) int arg0) {
		return (Class4_Sub6_Sub16) aClass221_38.method5075((long) arg0);
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(IIIIIIII)V")
	public static void method7753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt10064 = arg0 - anInt10056;
		anInt10061 = arg1 - anInt10059;
		anInt10058 = arg2 - anInt10056;
		anInt10054 = arg3 - anInt10059;
		anInt10060 = arg4;
		anInt10053 = arg5;
		anInt10055 = arg6;
		anInt10063 = arg7;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lclient!r;Lclient!ek;IIII[I[I)V")
	private static void method7754(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class4_Sub13 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		@Pc(3) int local3 = arg1.method7004();
		if ((local3 & 0x1) == 0) {
			@Pc(15) boolean local15 = (local3 & 0x2) == 0;
			@Pc(21) int local21 = local3 >> 2 & 0x3F;
			if (local21 != 62) {
				if (local21 == 63) {
					local21 = arg1.method7004();
				} else if (local15) {
					local21 = arg6[local21];
				} else {
					local21 = arg7[local21];
				}
				if (local15) {
					aByteArray99[arg4 + arg5 * anInt10062] = (byte) local21;
					aByteArray103[arg4 + arg5 * anInt10062] = 0;
				} else {
					aByteArray103[arg4 + arg5 * anInt10062] = (byte) local21;
					aByteArray100[arg4 + arg5 * anInt10062] = 0;
					aByteArray99[arg4 + arg5 * anInt10062] = arg1.method7011();
				}
			}
			return;
		}
		@Pc(100) int local100 = (local3 >> 1 & 0x3) + 1;
		@Pc(108) boolean local108 = (local3 & 0x8) != 0;
		@Pc(116) boolean local116 = (local3 & 0x10) != 0;
		for (@Pc(118) int local118 = 0; local118 < local100; local118++) {
			@Pc(123) int local123 = arg1.method7004();
			@Pc(125) int local125 = 0;
			@Pc(127) int local127 = 0;
			if (local108) {
				local125 = arg1.method7004();
				local127 = arg1.method7004();
			}
			@Pc(139) int local139 = 0;
			if (local116) {
				local139 = arg1.method7004();
			}
			@Pc(215) short[] local215;
			@Pc(218) byte[] local218;
			@Pc(220) int local220;
			if (local118 == 0) {
				aByteArray99[arg4 + arg5 * anInt10062] = (byte) local123;
				aByteArray103[arg4 + arg5 * anInt10062] = (byte) local125;
				aByteArray100[arg4 + arg5 * anInt10062] = (byte) local127;
				if (local139 == 1) {
					aShortArray135[arg4 + arg5 * anInt10062] = (short) (arg1.method7054() + 1);
					aByteArray101[arg4 + arg5 * anInt10062] = arg1.method7011();
				} else if (local139 > 1) {
					aShortArray135[arg4 + arg5 * anInt10062] = -1;
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method7054();
						local218[local220] = arg1.method7011();
					}
					aClass221_39.method5073(new Class4_Sub7(local215, local218), (long) (arg4 << 16 | arg5));
				}
			} else {
				local215 = null;
				local218 = null;
				if (local139 > 0) {
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method7054();
						local218[local220] = arg1.method7011();
					}
				}
				if (aClass158ArrayArrayArray2[local118 - 1][arg2 - (anInt10056 >> 6)][arg3 - (anInt10059 >> 6)] == null) {
					aClass158ArrayArrayArray2[local118 - 1][arg2 - (anInt10056 >> 6)][arg3 - (anInt10059 >> 6)] = new Class158();
				}
				@Pc(338) Class21_Sub10 local338 = new Class21_Sub10(arg4 & 0x3F, arg5 & 0x3F, local123, local125, local127, local215, local218);
				aClass158ArrayArrayArray2[local118 - 1][arg2 - (anInt10056 >> 6)][arg3 - (anInt10059 >> 6)].method3720(local338);
			}
		}
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "([B[B[SII)V")
	private static void method7756(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int[] local2 = new int[anInt10057];
		@Pc(5) int[] local5 = new int[anInt10057];
		@Pc(8) int[] local8 = new int[anInt10057];
		@Pc(11) int[] local11 = new int[anInt10057];
		@Pc(14) int[] local14 = new int[anInt10057];
		for (@Pc(16) int local16 = -5; local16 < anInt10062; local16++) {
			@Pc(21) int local21 = local16 + 5;
			@Pc(25) int local25 = local16 - 5;
			@Pc(41) int local41;
			for (@Pc(27) int local27 = 0; local27 < anInt10057; local27++) {
				@Pc(50) Class25 local50;
				@Pc(86) int local86;
				if (local21 < anInt10062) {
					local41 = arg0[local21 + local27 * anInt10062] & 0xFF;
					if (local41 > 0) {
						local50 = aClass335_5.method7602(local41 - 1);
						local2[local27] += local50.anInt1028;
						local5[local27] += local50.anInt1034;
						local8[local27] += local50.anInt1032;
						local11[local27] += local50.anInt1037;
						local86 = local14[local27]++;
					}
				}
				if (local25 >= 0) {
					local41 = arg0[local25 + local27 * anInt10062] & 0xFF;
					if (local41 > 0) {
						local50 = aClass335_5.method7602(local41 - 1);
						local2[local27] -= local50.anInt1028;
						local5[local27] -= local50.anInt1034;
						local8[local27] -= local50.anInt1032;
						local11[local27] -= local50.anInt1037;
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
				for (@Pc(167) int local167 = -5; local167 < anInt10057; local167++) {
					@Pc(172) int local172 = local167 + 5;
					if (local172 < anInt10057) {
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
						if ((arg0[local16 + local167 * anInt10062] & 0xFF) == 0) {
							local261 = local16 + local167 * anInt10062;
							arg1[local261] = 0;
							arg2[local261] = 0;
						} else {
							local261 = local163 == 0 ? 0 : Static177.method2938(local159 / local165, local41 * 256 / local163, local161 / local165);
							@Pc(294) int local294 = (local261 & 0x7F) + arg4;
							if (local294 < 0) {
								local294 = 0;
							} else if (local294 > 127) {
								local294 = 127;
							}
							@Pc(316) int local316 = (local261 + arg3 & 0xFC00) + (local261 & 0x380) + local294;
							@Pc(322) int local322 = local16 + local167 * anInt10062;
							@Pc(333) int local333 = Static117.anIntArray125[Static369.method7613(Static262.method4137(local316)) & 0xFFFF];
							arg1[local322] = (byte) (local333 >> 16 & 0xFF);
							arg2[local322] = (short) (local333 & 0xFFFF);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!waa", name = "b", descriptor = "(I)V")
	public static void method7757(@OriginalArg(0) int arg0) {
		aClass4_Sub6_Sub16_3 = (Class4_Sub6_Sub16) aClass221_38.method5075((long) arg0);
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lclient!r;IIIIIII[S[BZ)V")
	private static void method7758(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) boolean arg10) {
		@Pc(20) int local20;
		@Pc(32) int local32;
		if (arg10 || arg5 != 0 || arg6 > 0) {
			if (arg6 == 0) {
				arg0.J(arg1, arg2, arg3, arg4, arg5, 0);
			} else {
				local20 = arg7 & 0x3F;
				if (local20 == 0 || arg3 <= 1 || arg4 <= 1) {
					local32 = anIntArray568[arg6];
					if (arg10 || local32 != 0) {
						arg0.J(arg1, arg2, arg3, arg4, local32, 0);
					}
				} else {
					local32 = arg10 ? 0 : 1;
					Static420.method6287(aByteArrayArrayArray18, anIntArray568[arg6], arg1, local20, arg0, arg2, anInt10050, arg3, arg5, arg4, local32, arg7 >> 6 & 0x3);
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
				@Pc(127) Class233 local127 = aClass298_4.method6822(arg8[local100] & 0xFFFF);
				if (local127.anInt6701 == -1) {
					@Pc(133) int local133 = -3355444;
					if (local127.anInt6681 == 1) {
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

	@OriginalMember(owner = "client!waa", name = "d", descriptor = "()V")
	public static void method7759() {
		@Pc(2) int[] local2 = new int[3];
		for (@Pc(4) int local4 = 0; local4 < aClass42_3.anInt1335; local4++) {
			@Pc(32) boolean local32 = aClass4_Sub6_Sub16_3.method6311(aClass42_3.anIntArray37[local4] & 0x3FFF, aClass42_3.anIntArray37[local4] >> 28 & 0x3, aClass42_3.anIntArray37[local4] >> 14 & 0x3FFF, local2);
			if (local32) {
				@Pc(42) Class4_Sub20 local42 = new Class4_Sub20(aClass42_3.anIntArray36[local4]);
				local42.anInt3263 = local2[1] - anInt10056;
				local42.anInt3264 = local2[2] - anInt10059;
				aClass22_64.method894(local42);
			}
		}
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lclient!fa;III)I")
	private static int method7760(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class54 local4 = aClass324_6.method7429(arg1);
		if (local4 == null) {
			return 0;
		}
		@Pc(11) int local11 = local4.anInt1740;
		if (local11 >= 0 && arg0.method4460(local11).aBoolean182) {
			local11 = -1;
		}
		@Pc(68) int local68;
		@Pc(27) int local27;
		@Pc(33) int local33;
		@Pc(55) int local55;
		if (local4.anInt1739 >= 0) {
			local27 = local4.anInt1739;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static117.anIntArray125[Static369.method7613(Static31.method979(local55)) & 0xFFFF] | 0xFF000000;
		} else if (local11 >= 0) {
			local68 = Static117.anIntArray125[Static369.method7613(Static31.method979(arg0.method4460(local11).aShort21)) & 0xFFFF] | 0xFF000000;
		} else if (local4.anInt1744 == -1) {
			local68 = 0;
		} else {
			local27 = local4.anInt1744;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static117.anIntArray125[Static369.method7613(Static31.method979(local55)) & 0xFFFF] | 0xFF000000;
		}
		return local68;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lclient!r;Lclient!fu;IIII)V")
	private static void method7761(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class4_Sub20 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1.anInt3259 = anInt10060 + (arg2 * (arg1.anInt3263 - anInt10064) >> 16);
		arg1.anInt3260 = anInt10063 - (arg3 * (arg1.anInt3264 - anInt10054) >> 16);
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lclient!r;II)V")
	public static void method7762(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class4_Sub13 local9 = new Class4_Sub13(aClass348_128.method7956("area", aClass4_Sub6_Sub16_3.aString167));
		@Pc(13) int local13 = local9.method7004();
		@Pc(16) int[] local16 = new int[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			local16[local18] = local9.method7004();
		}
		@Pc(33) int local33 = local9.method7004();
		@Pc(36) int[] local36 = new int[local33];
		for (@Pc(38) int local38 = 0; local38 < local33; local38++) {
			local36[local38] = local9.method7004();
		}
		while (true) {
			@Pc(58) int local58;
			@Pc(64) int local64;
			@Pc(67) int local67;
			@Pc(76) int local76;
			@Pc(148) int local148;
			while (local9.anInt9170 < local9.aByteArray88.length) {
				@Pc(62) int local62;
				@Pc(84) int local84;
				if (local9.method7004() == 0) {
					local58 = local9.method7004();
					local62 = local9.method7004();
					for (local64 = 0; local64 < 64; local64++) {
						for (local67 = 0; local67 < 64; local67++) {
							local76 = local58 * 64 + local64 - anInt10056;
							local84 = local62 * 64 + local67 - anInt10059;
							method7754(arg0, local9, local58, local62, local76, local84, local16, local36);
						}
					}
				} else {
					local58 = local9.method7004();
					local62 = local9.method7004();
					local64 = local9.method7004();
					local67 = local9.method7004();
					for (local76 = 0; local76 < 8; local76++) {
						for (local84 = 0; local84 < 8; local84++) {
							@Pc(136) int local136 = local58 * 64 + local64 * 8 + local76 - anInt10056;
							local148 = local62 * 64 + local67 * 8 + local84 - anInt10059;
							method7754(arg0, local9, local58, local62, local136, local148, local16, local36);
						}
					}
				}
			}
			aByteArray102 = new byte[anInt10062 * anInt10057];
			aShortArray136 = new short[anInt10062 * anInt10057];
			for (local58 = 0; local58 < 3; local58++) {
				@Pc(191) byte[] local191 = new byte[anInt10062 * anInt10057];
				for (local64 = 0; local64 < aClass158ArrayArrayArray2[local58].length; local64++) {
					for (local67 = 0; local67 < aClass158ArrayArrayArray2[local58][0].length; local67++) {
						@Pc(205) Class158 local205 = aClass158ArrayArrayArray2[local58][local64][local67];
						if (local205 != null) {
							for (@Pc(212) Class21_Sub10 local212 = (Class21_Sub10) local205.method3726(); local212 != null; local212 = (Class21_Sub10) local205.method3721()) {
								local191[local64 * 64 + local212.aByte119 + (local67 * 64 + local212.aByte117) * anInt10062] = (byte) local212.anInt8879;
							}
						}
					}
				}
				method7756(local191, aByteArray102, aShortArray136, arg1, arg2);
				for (local67 = 0; local67 < aClass158ArrayArrayArray2[local58].length; local67++) {
					for (local76 = 0; local76 < aClass158ArrayArrayArray2[local58][0].length; local76++) {
						@Pc(276) Class158 local276 = aClass158ArrayArrayArray2[local58][local67][local76];
						if (local276 != null) {
							for (@Pc(283) Class21_Sub10 local283 = (Class21_Sub10) local276.method3726(); local283 != null; local283 = (Class21_Sub10) local276.method3721()) {
								local148 = local67 * 64 + local283.aByte119 + (local76 * 64 + local283.aByte117) * anInt10062;
								local283.anInt8879 = (aByteArray102[local148] & 0xFF) << 16 | aShortArray136[local148] & 0xFFFF;
								if (local283.anInt8879 != 0) {
									local283.anInt8879 |= 0xFF000000;
								}
							}
						}
					}
				}
			}
			method7756(aByteArray99, aByteArray102, aShortArray136, arg1, arg2);
			aByteArray99 = null;
			method7748();
			return;
		}
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lclient!r;IIII)Lclient!au;")
	private static Class22 method7763(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(4) Class4_Sub20 local4 = (Class4_Sub20) aClass22_64.method895(); local4 != null; local4 = (Class4_Sub20) aClass22_64.method889()) {
			method7761(arg0, local4, arg1, arg2);
		}
		return aClass22_64;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(II)Lclient!qba;")
	public static Class4_Sub6_Sub16 method7764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class4_Sub6_Sub16 local4 = (Class4_Sub6_Sub16) aClass221_38.method5072(); local4 != null; local4 = (Class4_Sub6_Sub16) aClass221_38.method5071()) {
			if (local4.aBoolean580 && local4.method6313(arg0, arg1)) {
				return local4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!waa", name = "b", descriptor = "(Lclient!r;IIII)V")
	private static void method7765(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = anInt10058 - anInt10064;
		@Pc(7) int local7 = anInt10061 - anInt10054;
		if (anInt10058 < anInt10062) {
			local3++;
		}
		if (anInt10061 < anInt10057) {
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
			local28 = (arg1 * local17 >> 16) + anInt10060;
			local40 = (arg1 * (local17 + 1) >> 16) + anInt10060;
			local44 = local40 - local28;
			if (local44 > 0) {
				local50 = anInt10064 + local17;
				if (local50 >= 0 && local50 < anInt10062) {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt10063 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt10063 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (local84 > 0) {
							local93 = local57 + anInt10054;
							local173 = local50 + local93 * anInt10062;
							local175 = 0;
							local177 = 0;
							local179 = 0;
							if (local93 >= 0 && local93 < anInt10057) {
								local175 = (aByteArray102[local173] & 0xFF) << 16 | aShortArray136[local173] & 0xFFFF;
								if (local175 != 0) {
									local175 |= 0xFF000000;
								}
								local177 = aByteArray103[local173] & 0xFF;
								local179 = aShortArray135[local173] & 0xFFFF;
							}
							if (local175 == 0 && local177 == 0 && local179 == 0) {
								if (aClass4_Sub6_Sub16_3.anInt8092 != -1) {
									local175 = aClass4_Sub6_Sub16_3.anInt8092 | 0xFF000000;
								} else if ((local17 + anInt10064 & 0x4) == (local57 + anInt10061 & 0x4)) {
									local175 = anIntArray568[aClass324_6.anInt9646 + 1];
								} else {
									local175 = -11840664;
								}
								if (local175 == 0) {
									local175 = -16777216;
								}
								arg0.J(local28, local70, local44, local84, local175, 0);
							} else if (local179 <= 0) {
								method7758(arg0, local28, local70, local44, local84, local175, local177, aByteArray100[local173], null, null, true);
							} else if (local179 == 65535) {
								@Pc(282) Class4_Sub7 local282 = (Class4_Sub7) aClass221_39.method5075((long) (local50 << 16 | local93));
								if (local282 != null) {
									method7758(arg0, local28, local70, local44, local84, local175, local177, aByteArray100[local173], local282.aShortArray9, local282.aByteArray6, true);
								}
							} else {
								aShortArray134[0] = (short) (local179 - 1);
								aByteArray98[0] = aByteArray101[local173];
								method7758(arg0, local28, local70, local44, local84, local175, local177, aByteArray100[local173], aShortArray134, aByteArray98, true);
							}
						}
					}
				} else {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt10063 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt10063 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (aClass4_Sub6_Sub16_3.anInt8092 != -1) {
							local93 = aClass4_Sub6_Sub16_3.anInt8092 | 0xFF000000;
						} else if ((local17 + anInt10064 & 0x4) == (local57 + anInt10061 & 0x4)) {
							local93 = anIntArray568[aClass324_6.anInt9646 + 1];
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
			local40 = (arg1 * local28 >> 16) + anInt10060;
			local44 = (arg1 * (local28 + 1) >> 16) + anInt10060;
			local50 = local44 - local40;
			if (local50 > 0) {
				local57 = local28 + anInt10064;
				if (local57 >= 0 && local57 < anInt10062) {
					for (local70 = -16; local70 < local7 + 16; local70++) {
						local80 = anInt10063 - (arg2 * (local70 + 1) >> 16);
						local84 = anInt10063 - (arg2 * local70 >> 16);
						local93 = local84 - local80;
						if (local93 > 0) {
							local173 = local70 + anInt10054;
							if (local173 >= 0 && local173 < anInt10057) {
								local175 = aShortArray135[local57 + local173 * anInt10062] & 0xFFFF;
								if (local175 <= 0) {
									method7767(arg0, local40, local80, local50, local93, null, null);
								} else if (local175 == 65535) {
									@Pc(459) Class4_Sub7 local459 = (Class4_Sub7) aClass221_39.method5075((long) (local57 << 16 | local173));
									if (local459 != null) {
										method7767(arg0, local40, local80, local50, local93, local459.aShortArray9, local459.aByteArray6);
									}
								} else {
									aShortArray134[0] = (short) (local175 - 1);
									aByteArray98[0] = aByteArray101[local57 + local173 * anInt10062];
									method7767(arg0, local40, local80, local50, local93, aShortArray134, aByteArray98);
								}
							}
						}
					}
				}
			}
		}
		local40 = anInt10064 >> 6;
		local44 = anInt10054 >> 6;
		if (local40 < 0) {
			local40 = 0;
		}
		if (local44 < 0) {
			local44 = 0;
		}
		local50 = anInt10058 >> 6;
		local57 = anInt10061 >> 6;
		if (local50 >= aClass158ArrayArrayArray2[0].length) {
			local50 = aClass158ArrayArrayArray2[0].length - 1;
		}
		if (local57 >= aClass158ArrayArrayArray2[0][0].length) {
			local57 = aClass158ArrayArrayArray2[0][0].length - 1;
		}
		for (local70 = 0; local70 < 3; local70++) {
			@Pc(641) int local641;
			@Pc(653) int local653;
			@Pc(665) int local665;
			@Pc(675) int local675;
			@Pc(631) int local631;
			for (local80 = local40; local80 <= local50; local80++) {
				for (local84 = local44; local84 <= local57; local84++) {
					@Pc(589) Class158 local589 = aClass158ArrayArrayArray2[local70][local80][local84];
					if (local589 != null) {
						local173 = (local80 + (anInt10056 >> 6)) * 64;
						local175 = (local84 + (anInt10059 >> 6)) * 64;
						for (@Pc(612) Class21_Sub10 local612 = (Class21_Sub10) local589.method3726(); local612 != null; local612 = (Class21_Sub10) local589.method3721()) {
							local179 = local173 + local612.aByte119 - anInt10056 - anInt10064;
							local631 = local175 + local612.aByte117 - anInt10059 - anInt10054;
							local641 = (arg1 * local179 >> 16) + anInt10060;
							local653 = (arg1 * (local179 + 1) >> 16) + anInt10060;
							local665 = anInt10063 - (arg2 * (local631 + 1) >> 16);
							local675 = anInt10063 - (arg2 * local631 >> 16);
							method7758(arg0, local641, local665, local653 - local641, local675 - local665, local612.anInt8879, local612.aByte120 & 0xFF, local612.aByte118, local612.aShortArray127, local612.aByteArray87, false);
						}
					}
				}
			}
			for (local84 = local40; local84 <= local50; local84++) {
				for (local93 = local44; local93 <= local57; local93++) {
					@Pc(727) Class158 local727 = aClass158ArrayArrayArray2[local70][local84][local93];
					if (local727 != null) {
						local175 = (local84 + (anInt10056 >> 6)) * 64;
						local177 = (local93 + (anInt10059 >> 6)) * 64;
						for (@Pc(750) Class21_Sub10 local750 = (Class21_Sub10) local727.method3726(); local750 != null; local750 = (Class21_Sub10) local727.method3721()) {
							local631 = local175 + local750.aByte119 - anInt10056 - anInt10064;
							local641 = local177 + local750.aByte117 - anInt10059 - anInt10054;
							local653 = (arg1 * local631 >> 16) + anInt10060;
							local665 = (arg1 * (local631 + 1) >> 16) + anInt10060;
							local675 = anInt10063 - (arg2 * (local641 + 1) >> 16);
							@Pc(813) int local813 = anInt10063 - (arg2 * local641 >> 16);
							method7767(arg0, local653, local675, local665 - local653, local813 - local675, local750.aShortArray127, local750.aByteArray87);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!waa", name = "b", descriptor = "(II)Lclient!gd;")
	public static Class120 method7766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class120 local3 = new Class120();
		for (@Pc(8) Class4_Sub6_Sub16 local8 = (Class4_Sub6_Sub16) aClass221_38.method5072(); local8 != null; local8 = (Class4_Sub6_Sub16) aClass221_38.method5071()) {
			if (local8.aBoolean580 && local8.method6313(arg0, arg1)) {
				local3.method2669(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lclient!r;IIII[S[B)V")
	private static void method7767(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		if (arg5 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < arg5.length; local4++) {
			@Pc(14) Class233 local14 = aClass298_4.method6822(arg5[local4] & 0xFFFF);
			@Pc(17) int local17 = local14.anInt6701;
			if (local17 != -1) {
				@Pc(25) Class23 local25 = aClass249_4.method5889(local17);
				@Pc(49) Class88 local49 = local25.method900(local14.aBoolean461 ? local14.aBoolean463 : false, local14.aBoolean455 ? arg6[local4] >> 6 & 0x3 : 0, arg0);
				if (local49 != null) {
					@Pc(58) int local58 = arg3 * local49.A() >> 2;
					@Pc(65) int local65 = arg4 * local49.ca() >> 2;
					if (local25.aBoolean93) {
						@Pc(71) int local71 = local14.anInt6718;
						@Pc(74) int local74 = local14.anInt6665;
						if ((arg6[local4] >> 6 & 0x1) == 1) {
							@Pc(85) int local85 = local71;
							local71 = local74;
							local74 = local85;
						}
						local58 = local71 * arg3;
						local65 = local74 * arg4;
					}
					if (local58 != 0 && local65 != 0) {
						if (local25.anInt1015 == 0) {
							local49.method8046(arg1, arg2 + arg4 - local65, local58, local65);
						} else {
							local49.method8049(arg1, arg2 + arg4 - local65, local58, local65, 0, local25.anInt1015 | 0xFF000000, 1);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!waa", name = "e", descriptor = "()V")
	public static void method7768() {
		aByteArray99 = null;
		aByteArray102 = null;
		aShortArray136 = null;
		aByteArray103 = null;
		aByteArray100 = null;
		aShortArray135 = null;
		aByteArray101 = null;
		aClass221_39 = null;
		aClass158ArrayArrayArray2 = null;
		anIntArray568 = null;
	}

	@OriginalMember(owner = "client!waa", name = "b", descriptor = "(Lclient!r;)Lclient!au;")
	public static Class22 method7769(@OriginalArg(0) Class7 arg0) {
		@Pc(3) int local3 = anInt10058 - anInt10064;
		@Pc(7) int local7 = anInt10061 - anInt10054;
		@Pc(15) int local15 = (anInt10055 - anInt10060 << 16) / local3;
		@Pc(23) int local23 = (anInt10063 - anInt10053 << 16) / local7;
		return method7763(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lclient!vo;Lclient!ud;Lclient!us;Lclient!rw;Lclient!gda;Lclient!ok;Lclient!of;)V")
	public static void method7770(@OriginalArg(0) Class348 arg0, @OriginalArg(1) Class324 arg1, @OriginalArg(2) Class335 arg2, @OriginalArg(3) Class298 arg3, @OriginalArg(4) Class121 arg4, @OriginalArg(5) Class249 arg5, @OriginalArg(6) Interface17 arg6) {
		aClass348_128 = arg0;
		aClass324_6 = arg1;
		aClass335_5 = arg2;
		aClass298_4 = arg3;
		aClass121_4 = arg4;
		aClass249_4 = arg5;
		anInterface17_2 = arg6;
		aClass221_38.method5078();
		@Pc(21) int local21 = aClass348_128.method7966("details");
		@Pc(26) int[] local26 = aClass348_128.method7976(local21);
		if (local26 != null) {
			for (@Pc(30) int local30 = 0; local30 < local26.length; local30++) {
				@Pc(39) Class4_Sub6_Sub16 local39 = Static41.method1091(local26[local30], aClass348_128, local21);
				aClass221_38.method5073(local39, (long) local39.anInt8098);
			}
		}
		Static547.method7662(false, true);
	}
}
