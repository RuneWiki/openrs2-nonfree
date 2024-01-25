import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "Lclient!kd;")
	public static Interface6 anInterface6_2;

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "Lclient!ta;")
	private static Class231 aClass231_2;

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "Lclient!ji;")
	public static Class3_Sub3_Sub13 aClass3_Sub3_Sub13_2;

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "Lclient!dg;")
	public static Class45 aClass45_2;

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "Lclient!mf;")
	public static Class149 aClass149_3;

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "Lclient!uu;")
	public static Class250 aClass250_8;

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "Lclient!p;")
	public static Class182 aClass182_2;

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "Lclient!tj;")
	private static Class237 aClass237_2;

	@OriginalMember(owner = "client!kh", name = "k", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!kh", name = "m", descriptor = "Lclient!jf;")
	public static Class118 aClass118_2;

	@OriginalMember(owner = "client!kh", name = "p", descriptor = "I")
	public static int anInt266;

	@OriginalMember(owner = "client!kh", name = "q", descriptor = "F")
	public static float aFloat3;

	@OriginalMember(owner = "client!kh", name = "r", descriptor = "F")
	public static float aFloat4;

	@OriginalMember(owner = "client!kh", name = "t", descriptor = "[I")
	private static int[] anIntArray5;

	@OriginalMember(owner = "client!kh", name = "u", descriptor = "I")
	public static int anInt267;

	@OriginalMember(owner = "client!kh", name = "v", descriptor = "I")
	public static int anInt268;

	@OriginalMember(owner = "client!kh", name = "w", descriptor = "I")
	public static int anInt269;

	@OriginalMember(owner = "client!kh", name = "x", descriptor = "I")
	public static int anInt270;

	@OriginalMember(owner = "client!kh", name = "y", descriptor = "I")
	public static int anInt271;

	@OriginalMember(owner = "client!kh", name = "z", descriptor = "[S")
	private static short[] aShortArray7;

	@OriginalMember(owner = "client!kh", name = "A", descriptor = "[B")
	private static byte[] aByteArray13;

	@OriginalMember(owner = "client!kh", name = "B", descriptor = "[B")
	private static byte[] aByteArray14;

	@OriginalMember(owner = "client!kh", name = "C", descriptor = "I")
	public static int anInt272;

	@OriginalMember(owner = "client!kh", name = "D", descriptor = "Lclient!lp;")
	private static Class140 aClass140_4;

	@OriginalMember(owner = "client!kh", name = "E", descriptor = "[[[Lclient!pw;")
	private static Class194[][][] aClass194ArrayArrayArray2;

	@OriginalMember(owner = "client!kh", name = "F", descriptor = "I")
	public static int anInt273;

	@OriginalMember(owner = "client!kh", name = "G", descriptor = "I")
	public static int anInt274;

	@OriginalMember(owner = "client!kh", name = "H", descriptor = "[B")
	private static byte[] aByteArray15;

	@OriginalMember(owner = "client!kh", name = "I", descriptor = "[S")
	private static short[] aShortArray8;

	@OriginalMember(owner = "client!kh", name = "J", descriptor = "I")
	public static int anInt275;

	@OriginalMember(owner = "client!kh", name = "K", descriptor = "[B")
	private static byte[] aByteArray16;

	@OriginalMember(owner = "client!kh", name = "L", descriptor = "[B")
	private static byte[] aByteArray17;

	@OriginalMember(owner = "client!kh", name = "M", descriptor = "I")
	public static int anInt276;

	@OriginalMember(owner = "client!kh", name = "N", descriptor = "I")
	public static int anInt277;

	@OriginalMember(owner = "client!kh", name = "O", descriptor = "I")
	public static int anInt278;

	@OriginalMember(owner = "client!kh", name = "i", descriptor = "Lclient!lp;")
	private static final Class140 aClass140_3 = new Class140(16);

	@OriginalMember(owner = "client!kh", name = "j", descriptor = "Lclient!ps;")
	public static final Class193 aClass193_3 = new Class193();

	@OriginalMember(owner = "client!kh", name = "l", descriptor = "I")
	public static int anInt264 = (int) (Math.random() * 11.0D) - 5;

	@OriginalMember(owner = "client!kh", name = "n", descriptor = "I")
	public static int anInt265 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!kh", name = "o", descriptor = "[S")
	private static final short[] aShortArray6 = new short[1];

	@OriginalMember(owner = "client!kh", name = "s", descriptor = "[B")
	private static final byte[] aByteArray12 = new byte[1];

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "()V")
	public static void method291() {
		@Pc(2) int[] local2 = new int[3];
		for (@Pc(4) int local4 = 0; local4 < aClass118_2.anInt3450; local4++) {
			@Pc(32) boolean local32 = aClass3_Sub3_Sub13_2.method3004(local2, aClass118_2.anIntArray216[local4] >> 28 & 0x3, aClass118_2.anIntArray216[local4] & 0x3FFF, aClass118_2.anIntArray216[local4] >> 14 & 0x3FFF);
			if (local32) {
				@Pc(42) Class3_Sub16 local42 = new Class3_Sub16(aClass118_2.anIntArray215[local4]);
				local42.anInt1893 = local2[1] - anInt278;
				local42.anInt1897 = local2[2] - anInt276;
				aClass193_3.method4527(local42);
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "()V")
	public static void method292() {
		aByteArray15 = null;
		aByteArray17 = null;
		aShortArray7 = null;
		aByteArray16 = null;
		aByteArray14 = null;
		aShortArray8 = null;
		aByteArray13 = null;
		aClass140_4 = null;
		aClass194ArrayArrayArray2 = null;
		anIntArray5 = null;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!uu;Lclient!tj;Lclient!ta;Lclient!mf;Lclient!dg;Lclient!p;Lclient!kd;)V")
	public static void method293(@OriginalArg(0) Class250 arg0, @OriginalArg(1) Class237 arg1, @OriginalArg(2) Class231 arg2, @OriginalArg(3) Class149 arg3, @OriginalArg(4) Class45 arg4, @OriginalArg(5) Class182 arg5, @OriginalArg(6) Interface6 arg6) {
		aClass250_8 = arg0;
		aClass237_2 = arg1;
		aClass231_2 = arg2;
		aClass149_3 = arg3;
		aClass45_2 = arg4;
		aClass182_2 = arg5;
		anInterface6_2 = arg6;
		aClass140_3.method3488();
		@Pc(21) int local21 = aClass250_8.method5790("details");
		@Pc(26) int[] local26 = aClass250_8.method5818(local21);
		if (local26 != null) {
			for (@Pc(30) int local30 = 0; local30 < local26.length; local30++) {
				@Pc(39) Class3_Sub3_Sub13 local39 = Static166.method2554(local21, local26[local30], aClass250_8);
				aClass140_3.method3494((long) local39.anInt3495, local39);
			}
		}
		Static176.method2835(true, false);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
	public static void method294(@OriginalArg(0) int arg0) {
		aClass3_Sub3_Sub13_2 = (Class3_Sub3_Sub13) aClass140_3.method3490((long) arg0);
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "()V")
	private static void method295() {
		@Pc(4) int local4;
		@Pc(15) int local15;
		@Pc(49) int local49;
		for (@Pc(1) int local1 = 0; local1 < anInt273; local1++) {
			for (local4 = 0; local4 < anInt277; local4++) {
				local15 = aShortArray8[local1 + local4 * anInt273] & 0xFFFF;
				if (local15 != 0) {
					@Pc(35) int local35;
					if (local15 == 65535) {
						@Pc(31) Class3_Sub11 local31 = (Class3_Sub11) aClass140_4.method3490((long) (local1 << 16 | local4));
						if (local31 != null) {
							for (local35 = 0; local35 < local31.aShortArray15.length; local35++) {
								@Pc(46) Class31 local46 = aClass149_3.method3573(local31.aShortArray15[local35] & 0xFFFF);
								local49 = local46.anInt796;
								if (local46.anIntArray44 != null) {
									local46 = local46.method863(anInterface6_2);
									if (local46 != null) {
										local49 = local46.anInt796;
									}
								}
								if (local49 != -1) {
									@Pc(70) Class3_Sub16 local70 = new Class3_Sub16(local49);
									local70.anInt1893 = local1;
									local70.anInt1897 = local4;
									aClass193_3.method4527(local70);
								}
							}
						}
					} else {
						@Pc(94) Class31 local94 = aClass149_3.method3573(local15 - 1);
						local35 = local94.anInt796;
						if (local94.anIntArray44 != null) {
							local94 = local94.method863(anInterface6_2);
							if (local94 != null) {
								local35 = local94.anInt796;
							}
						}
						if (local35 != -1) {
							@Pc(118) Class3_Sub16 local118 = new Class3_Sub16(local35);
							local118.anInt1893 = local1;
							local118.anInt1897 = local4;
							aClass193_3.method4527(local118);
						}
					}
				}
			}
		}
		for (local4 = 0; local4 < 3; local4++) {
			for (local15 = 0; local15 < aClass194ArrayArrayArray2[0].length; local15++) {
				for (@Pc(144) int local144 = 0; local144 < aClass194ArrayArrayArray2[0][0].length; local144++) {
					@Pc(153) Class194 local153 = aClass194ArrayArrayArray2[local4][local15][local144];
					if (local153 != null) {
						for (@Pc(160) Class23_Sub4 local160 = (Class23_Sub4) local153.method4577(); local160 != null; local160 = (Class23_Sub4) local153.method4580()) {
							if (local160.aShortArray69 != null) {
								for (local49 = 0; local49 < local160.aShortArray69.length; local49++) {
									@Pc(177) Class31 local177 = aClass149_3.method3573(local160.aShortArray69[local49] & 0xFFFF);
									@Pc(180) int local180 = local177.anInt796;
									if (local177.anIntArray44 != null) {
										local177 = local177.method863(anInterface6_2);
										if (local177 != null) {
											local180 = local177.anInt796;
										}
									}
									if (local180 != -1) {
										@Pc(201) Class3_Sub16 local201 = new Class3_Sub16(local180);
										local201.anInt1893 = (local15 + (anInt278 >> 6)) * 64 + local160.aByte69 - anInt278;
										local201.anInt1897 = (local144 + (anInt276 >> 6)) * 64 + local160.aByte68 - anInt276;
										aClass193_3.method4527(local201);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!l;II)V")
	public static void method296(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < aClass237_2.anInt6573; local1++) {
			anIntArray5[local1 + 1] = method303(arg0, local1, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!qa;IIIIIII[S[BZ)V")
	private static void method297(@OriginalArg(0) Class167 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) boolean arg10) {
		@Pc(20) int local20;
		@Pc(32) int local32;
		if (arg10 || arg5 != 0 || arg6 > 0) {
			if (arg6 == 0) {
				arg0.M(arg1, arg2, arg3, arg4, arg5, 0);
			} else {
				local20 = arg7 & 0x3F;
				if (local20 == 0 || arg3 <= 1 || arg4 <= 1) {
					local32 = anIntArray5[arg6];
					if (arg10 || local32 != 0) {
						arg0.M(arg1, arg2, arg3, arg4, local32, 0);
					}
				} else {
					local32 = arg10 ? 0 : 1;
					Static168.method2585(arg4, aByteArrayArrayArray3, local20, arg1, arg0, arg5, arg3, arg2, arg7 >> 6 & 0x3, local32, anInt266, anIntArray5[arg6]);
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
				@Pc(127) Class31 local127 = aClass149_3.method3573(arg8[local100] & 0xFFFF);
				if (local127.anInt793 == -1) {
					@Pc(133) int local133 = -3355444;
					if (local127.anInt788 == 1) {
						local133 = -3407872;
					}
					@Pc(147) int local147 = arg9[local100] >> 6 & 0x3;
					if (local107 == 0) {
						if (local147 == 0) {
							arg0.BA(arg1, arg2, arg4, local133, 0);
						} else if (local147 == 1) {
							arg0.d(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 2) {
							arg0.BA(local20, arg2, arg4, local133, 0);
						} else {
							arg0.d(arg1, local32, arg3, local133, 0);
						}
					} else if (local107 == 2) {
						if (local147 == 0) {
							arg0.BA(arg1, arg2, arg4, -1, 0);
							arg0.d(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 1) {
							arg0.BA(local20, arg2, arg4, -1, 0);
							arg0.d(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 2) {
							arg0.BA(local20, arg2, arg4, -1, 0);
							arg0.d(arg1, local32, arg3, local133, 0);
						} else {
							arg0.BA(arg1, arg2, arg4, -1, 0);
							arg0.d(arg1, local32, arg3, local133, 0);
						}
					} else if (local107 == 3) {
						if (local147 == 0) {
							arg0.d(arg1, arg2, 1, local133, 0);
						} else if (local147 == 1) {
							arg0.d(local20, arg2, 1, local133, 0);
						} else if (local147 == 2) {
							arg0.d(local20, local32, 1, local133, 0);
						} else {
							arg0.d(arg1, local32, 1, local133, 0);
						}
					} else if (local107 == 9) {
						@Pc(313) int local313;
						if (local147 == 0 || local147 == 2) {
							for (local313 = 0; local313 < arg4; local313++) {
								arg0.d(arg1 + local313, local32 - local313, 1, local133, 0);
							}
						} else {
							for (local313 = 0; local313 < arg4; local313++) {
								arg0.d(arg1 + local313, arg2 + local313, 1, local133, 0);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!qa;)V")
	public static void method298(@OriginalArg(0) Class167 arg0) {
		@Pc(3) int local3 = anInt272 - anInt270;
		@Pc(7) int local7 = anInt268 - anInt271;
		@Pc(15) int local15 = (anInt275 - anInt274 << 16) / local3;
		@Pc(23) int local23 = (anInt269 - anInt267 << 16) / local7;
		method309(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "([B[B[SII)V")
	private static void method299(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int[] local2 = new int[anInt277];
		@Pc(5) int[] local5 = new int[anInt277];
		@Pc(8) int[] local8 = new int[anInt277];
		@Pc(11) int[] local11 = new int[anInt277];
		@Pc(14) int[] local14 = new int[anInt277];
		for (@Pc(16) int local16 = -5; local16 < anInt273; local16++) {
			@Pc(21) int local21 = local16 + 5;
			@Pc(25) int local25 = local16 - 5;
			@Pc(41) int local41;
			for (@Pc(27) int local27 = 0; local27 < anInt277; local27++) {
				@Pc(50) Class20 local50;
				@Pc(86) int local86;
				if (local21 < anInt273) {
					local41 = arg0[local21 + local27 * anInt273] & 0xFF;
					if (local41 > 0) {
						local50 = aClass231_2.method5384(local41 - 1);
						local2[local27] += local50.anInt456;
						local5[local27] += local50.anInt462;
						local8[local27] += local50.anInt455;
						local11[local27] += local50.anInt450;
						local86 = local14[local27]++;
					}
				}
				if (local25 >= 0) {
					local41 = arg0[local25 + local27 * anInt273] & 0xFF;
					if (local41 > 0) {
						local50 = aClass231_2.method5384(local41 - 1);
						local2[local27] -= local50.anInt456;
						local5[local27] -= local50.anInt462;
						local8[local27] -= local50.anInt455;
						local11[local27] -= local50.anInt450;
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
				for (@Pc(167) int local167 = -5; local167 < anInt277; local167++) {
					@Pc(172) int local172 = local167 + 5;
					if (local172 < anInt277) {
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
						if ((arg0[local16 + local167 * anInt273] & 0xFF) == 0) {
							local261 = local16 + local167 * anInt273;
							arg1[local261] = 0;
							arg2[local261] = 0;
						} else {
							local261 = local163 == 0 ? 0 : Static250.method3550(local161 / local165, local159 / local165, local41 * 256 / local163);
							@Pc(294) int local294 = (local261 & 0x7F) + arg4;
							if (local294 < 0) {
								local294 = 0;
							} else if (local294 > 127) {
								local294 = 127;
							}
							@Pc(316) int local316 = (local261 + arg3 & 0xFC00) + (local261 & 0x380) + local294;
							@Pc(322) int local322 = local16 + local167 * anInt273;
							@Pc(333) int local333 = Static225.anIntArray253[Static332.method4597(Static403.method5515(local316)) & 0xFFFF];
							arg1[local322] = (byte) (local333 >> 16 & 0xFF);
							arg2[local322] = (short) (local333 & 0xFFFF);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(Lclient!qa;)Lclient!ps;")
	public static Class193 method300(@OriginalArg(0) Class167 arg0) {
		@Pc(3) int local3 = anInt272 - anInt270;
		@Pc(7) int local7 = anInt268 - anInt271;
		@Pc(15) int local15 = (anInt275 - anInt274 << 16) / local3;
		@Pc(23) int local23 = (anInt269 - anInt267 << 16) / local7;
		return method313(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)Lclient!ji;")
	public static Class3_Sub3_Sub13 method301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class3_Sub3_Sub13 local4 = (Class3_Sub3_Sub13) aClass140_3.method3486(); local4 != null; local4 = (Class3_Sub3_Sub13) aClass140_3.method3485()) {
			if (local4.aBoolean267 && local4.method3010(arg0, arg1)) {
				return local4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!l;III)I")
	private static int method303(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class16 local4 = aClass237_2.method5431(arg1);
		if (local4 == null) {
			return 0;
		}
		@Pc(11) int local11 = local4.anInt299;
		if (local11 >= 0 && arg0.method4417(local11).aBoolean231) {
			local11 = -1;
		}
		@Pc(68) int local68;
		@Pc(27) int local27;
		@Pc(33) int local33;
		@Pc(55) int local55;
		if (local4.anInt304 >= 0) {
			local27 = local4.anInt304;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static225.anIntArray253[Static332.method4597(Static110.method1807(local55)) & 0xFFFF] | 0xFF000000;
		} else if (local11 >= 0) {
			local68 = Static225.anIntArray253[Static332.method4597(Static110.method1807(arg0.method4417(local11).aShort40)) & 0xFFFF] | 0xFF000000;
		} else if (local4.anInt293 == -1) {
			local68 = 0;
		} else {
			local27 = local4.anInt293;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static225.anIntArray253[Static332.method4597(Static110.method1807(local55)) & 0xFFFF] | 0xFF000000;
		}
		return local68;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!qa;IIII[S[B)V")
	private static void method304(@OriginalArg(0) Class167 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		if (arg5 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < arg5.length; local4++) {
			@Pc(14) Class31 local14 = aClass149_3.method3573(arg5[local4] & 0xFFFF);
			@Pc(17) int local17 = local14.anInt793;
			if (local17 != -1) {
				@Pc(25) Class17 local25 = aClass182_2.method4369(local17);
				@Pc(49) Class2 local49 = local25.method336(local14.aBoolean45 ? arg6[local4] >> 6 & 0x3 : 0, arg0, local14.aBoolean53 ? local14.aBoolean54 : false);
				if (local49 != null) {
					@Pc(58) int local58 = arg3 * local49.d() >> 2;
					@Pc(65) int local65 = arg4 * local49.ga() >> 2;
					if (local25.aBoolean18) {
						@Pc(71) int local71 = local14.anInt786;
						@Pc(74) int local74 = local14.anInt784;
						if ((arg6[local4] >> 6 & 0x1) == 1) {
							@Pc(85) int local85 = local71;
							local71 = local74;
							local74 = local85;
						}
						local58 = local71 * arg3;
						local65 = local74 * arg4;
					}
					if (local58 != 0 && local65 != 0) {
						if (local25.anInt314 == 0) {
							local49.method5835(arg1, arg2 + arg4 - local65, local58, local65);
						} else {
							local49.XA(arg1, arg2 + arg4 - local65, local58, local65, 0, local25.anInt314 | 0xFF000000, 1);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!qa;Lclient!nj;IIII[I[I)V")
	private static void method305(@OriginalArg(0) Class167 arg0, @OriginalArg(1) Class3_Sub25 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		@Pc(3) int local3 = arg1.method4096();
		if ((local3 & 0x1) == 0) {
			@Pc(15) boolean local15 = (local3 & 0x2) == 0;
			@Pc(21) int local21 = local3 >> 2 & 0x3F;
			if (local21 != 62) {
				if (local21 == 63) {
					local21 = arg1.method4096();
				} else if (local15) {
					local21 = arg6[local21];
				} else {
					local21 = arg7[local21];
				}
				if (local15) {
					aByteArray15[arg4 + arg5 * anInt273] = (byte) local21;
					aByteArray16[arg4 + arg5 * anInt273] = 0;
				} else {
					aByteArray16[arg4 + arg5 * anInt273] = (byte) local21;
					aByteArray14[arg4 + arg5 * anInt273] = 0;
					aByteArray15[arg4 + arg5 * anInt273] = arg1.method4097();
				}
			}
			return;
		}
		@Pc(100) int local100 = (local3 >> 1 & 0x3) + 1;
		@Pc(108) boolean local108 = (local3 & 0x8) != 0;
		@Pc(116) boolean local116 = (local3 & 0x10) != 0;
		for (@Pc(118) int local118 = 0; local118 < local100; local118++) {
			@Pc(123) int local123 = arg1.method4096();
			@Pc(125) int local125 = 0;
			@Pc(127) int local127 = 0;
			if (local108) {
				local125 = arg1.method4096();
				local127 = arg1.method4096();
			}
			@Pc(139) int local139 = 0;
			if (local116) {
				local139 = arg1.method4096();
			}
			@Pc(215) short[] local215;
			@Pc(218) byte[] local218;
			@Pc(220) int local220;
			if (local118 == 0) {
				aByteArray15[arg4 + arg5 * anInt273] = (byte) local123;
				aByteArray16[arg4 + arg5 * anInt273] = (byte) local125;
				aByteArray14[arg4 + arg5 * anInt273] = (byte) local127;
				if (local139 == 1) {
					aShortArray8[arg4 + arg5 * anInt273] = (short) (arg1.method4083() + 1);
					aByteArray13[arg4 + arg5 * anInt273] = arg1.method4097();
				} else if (local139 > 1) {
					aShortArray8[arg4 + arg5 * anInt273] = -1;
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method4083();
						local218[local220] = arg1.method4097();
					}
					aClass140_4.method3494((long) (arg4 << 16 | arg5), new Class3_Sub11(local215, local218));
				}
			} else {
				local215 = null;
				local218 = null;
				if (local139 > 0) {
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method4083();
						local218[local220] = arg1.method4097();
					}
				}
				if (aClass194ArrayArrayArray2[local118 - 1][arg2 - (anInt278 >> 6)][arg3 - (anInt276 >> 6)] == null) {
					aClass194ArrayArrayArray2[local118 - 1][arg2 - (anInt278 >> 6)][arg3 - (anInt276 >> 6)] = new Class194();
				}
				@Pc(338) Class23_Sub4 local338 = new Class23_Sub4(arg4 & 0x3F, arg5 & 0x3F, local123, local125, local127, local215, local218);
				aClass194ArrayArrayArray2[local118 - 1][arg2 - (anInt278 >> 6)][arg3 - (anInt276 >> 6)].method4582(local338);
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIIII)V")
	public static void method306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt270 = arg0 - anInt278;
		anInt268 = arg1 - anInt276;
		anInt272 = arg2 - anInt278;
		anInt271 = arg3 - anInt276;
		anInt274 = arg4;
		anInt267 = arg5;
		anInt275 = arg6;
		anInt269 = arg7;
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(II)Lclient!et;")
	public static Class65 method307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class65 local3 = new Class65();
		for (@Pc(8) Class3_Sub3_Sub13 local8 = (Class3_Sub3_Sub13) aClass140_3.method3486(); local8 != null; local8 = (Class3_Sub3_Sub13) aClass140_3.method3485()) {
			if (local8.aBoolean267 && local8.method3010(arg0, arg1)) {
				local3.method1686(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!qa;Lclient!fb;IIII)V")
	private static void method308(@OriginalArg(0) Class167 arg0, @OriginalArg(1) Class3_Sub16 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1.anInt1899 = anInt274 + (arg2 * (arg1.anInt1893 - anInt270) >> 16);
		arg1.anInt1894 = anInt269 - (arg3 * (arg1.anInt1897 - anInt271) >> 16);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!qa;IIII)V")
	private static void method309(@OriginalArg(0) Class167 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = anInt272 - anInt270;
		@Pc(7) int local7 = anInt268 - anInt271;
		if (anInt272 < anInt273) {
			local3++;
		}
		if (anInt268 < anInt277) {
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
			local28 = (arg1 * local17 >> 16) + anInt274;
			local40 = (arg1 * (local17 + 1) >> 16) + anInt274;
			local44 = local40 - local28;
			if (local44 > 0) {
				local50 = anInt270 + local17;
				if (local50 >= 0 && local50 < anInt273) {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt269 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt269 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (local84 > 0) {
							local93 = local57 + anInt271;
							local173 = local50 + local93 * anInt273;
							local175 = 0;
							local177 = 0;
							local179 = 0;
							if (local93 >= 0 && local93 < anInt277) {
								local175 = (aByteArray17[local173] & 0xFF) << 16 | aShortArray7[local173] & 0xFFFF;
								if (local175 != 0) {
									local175 |= 0xFF000000;
								}
								local177 = aByteArray16[local173] & 0xFF;
								local179 = aShortArray8[local173] & 0xFFFF;
							}
							if (local175 == 0 && local177 == 0 && local179 == 0) {
								if (aClass3_Sub3_Sub13_2.anInt3504 != -1) {
									local175 = aClass3_Sub3_Sub13_2.anInt3504 | 0xFF000000;
								} else if ((local17 + anInt270 & 0x4) == (local57 + anInt268 & 0x4)) {
									local175 = anIntArray5[aClass237_2.anInt6575 + 1];
								} else {
									local175 = -11840664;
								}
								if (local175 == 0) {
									local175 = -16777216;
								}
								arg0.M(local28, local70, local44, local84, local175, 0);
							} else if (local179 <= 0) {
								method297(arg0, local28, local70, local44, local84, local175, local177, aByteArray14[local173], null, null, true);
							} else if (local179 == 65535) {
								@Pc(282) Class3_Sub11 local282 = (Class3_Sub11) aClass140_4.method3490((long) (local50 << 16 | local93));
								if (local282 != null) {
									method297(arg0, local28, local70, local44, local84, local175, local177, aByteArray14[local173], local282.aShortArray15, local282.aByteArray25, true);
								}
							} else {
								aShortArray6[0] = (short) (local179 - 1);
								aByteArray12[0] = aByteArray13[local173];
								method297(arg0, local28, local70, local44, local84, local175, local177, aByteArray14[local173], aShortArray6, aByteArray12, true);
							}
						}
					}
				} else {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt269 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt269 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (aClass3_Sub3_Sub13_2.anInt3504 != -1) {
							local93 = aClass3_Sub3_Sub13_2.anInt3504 | 0xFF000000;
						} else if ((local17 + anInt270 & 0x4) == (local57 + anInt268 & 0x4)) {
							local93 = anIntArray5[aClass237_2.anInt6575 + 1];
						} else {
							local93 = -11840664;
						}
						if (local93 == 0) {
							local93 = -16777216;
						}
						arg0.M(local28, local70, local44, local84, local93, 0);
					}
				}
			}
		}
		for (local28 = -16; local28 < local3 + 16; local28++) {
			local40 = (arg1 * local28 >> 16) + anInt274;
			local44 = (arg1 * (local28 + 1) >> 16) + anInt274;
			local50 = local44 - local40;
			if (local50 > 0) {
				local57 = local28 + anInt270;
				if (local57 >= 0 && local57 < anInt273) {
					for (local70 = -16; local70 < local7 + 16; local70++) {
						local80 = anInt269 - (arg2 * (local70 + 1) >> 16);
						local84 = anInt269 - (arg2 * local70 >> 16);
						local93 = local84 - local80;
						if (local93 > 0) {
							local173 = local70 + anInt271;
							if (local173 >= 0 && local173 < anInt277) {
								local175 = aShortArray8[local57 + local173 * anInt273] & 0xFFFF;
								if (local175 <= 0) {
									method304(arg0, local40, local80, local50, local93, null, null);
								} else if (local175 == 65535) {
									@Pc(459) Class3_Sub11 local459 = (Class3_Sub11) aClass140_4.method3490((long) (local57 << 16 | local173));
									if (local459 != null) {
										method304(arg0, local40, local80, local50, local93, local459.aShortArray15, local459.aByteArray25);
									}
								} else {
									aShortArray6[0] = (short) (local175 - 1);
									aByteArray12[0] = aByteArray13[local57 + local173 * anInt273];
									method304(arg0, local40, local80, local50, local93, aShortArray6, aByteArray12);
								}
							}
						}
					}
				}
			}
		}
		local40 = anInt270 >> 6;
		local44 = anInt271 >> 6;
		if (local40 < 0) {
			local40 = 0;
		}
		if (local44 < 0) {
			local44 = 0;
		}
		local50 = anInt272 >> 6;
		local57 = anInt268 >> 6;
		if (local50 >= aClass194ArrayArrayArray2[0].length) {
			local50 = aClass194ArrayArrayArray2[0].length - 1;
		}
		if (local57 >= aClass194ArrayArrayArray2[0][0].length) {
			local57 = aClass194ArrayArrayArray2[0][0].length - 1;
		}
		for (local70 = 0; local70 < 3; local70++) {
			@Pc(641) int local641;
			@Pc(653) int local653;
			@Pc(665) int local665;
			@Pc(675) int local675;
			@Pc(631) int local631;
			for (local80 = local40; local80 <= local50; local80++) {
				for (local84 = local44; local84 <= local57; local84++) {
					@Pc(589) Class194 local589 = aClass194ArrayArrayArray2[local70][local80][local84];
					if (local589 != null) {
						local173 = (local80 + (anInt278 >> 6)) * 64;
						local175 = (local84 + (anInt276 >> 6)) * 64;
						for (@Pc(612) Class23_Sub4 local612 = (Class23_Sub4) local589.method4577(); local612 != null; local612 = (Class23_Sub4) local589.method4580()) {
							local179 = local173 + local612.aByte69 - anInt278 - anInt270;
							local631 = local175 + local612.aByte68 - anInt276 - anInt271;
							local641 = (arg1 * local179 >> 16) + anInt274;
							local653 = (arg1 * (local179 + 1) >> 16) + anInt274;
							local665 = anInt269 - (arg2 * (local631 + 1) >> 16);
							local675 = anInt269 - (arg2 * local631 >> 16);
							method297(arg0, local641, local665, local653 - local641, local675 - local665, local612.anInt5182, local612.aByte70 & 0xFF, local612.aByte67, local612.aShortArray69, local612.aByteArray91, false);
						}
					}
				}
			}
			for (local84 = local40; local84 <= local50; local84++) {
				for (local93 = local44; local93 <= local57; local93++) {
					@Pc(727) Class194 local727 = aClass194ArrayArrayArray2[local70][local84][local93];
					if (local727 != null) {
						local175 = (local84 + (anInt278 >> 6)) * 64;
						local177 = (local93 + (anInt276 >> 6)) * 64;
						for (@Pc(750) Class23_Sub4 local750 = (Class23_Sub4) local727.method4577(); local750 != null; local750 = (Class23_Sub4) local727.method4580()) {
							local631 = local175 + local750.aByte69 - anInt278 - anInt270;
							local641 = local177 + local750.aByte68 - anInt276 - anInt271;
							local653 = (arg1 * local631 >> 16) + anInt274;
							local665 = (arg1 * (local631 + 1) >> 16) + anInt274;
							local675 = anInt269 - (arg2 * (local641 + 1) >> 16);
							@Pc(813) int local813 = anInt269 - (arg2 * local641 >> 16);
							method304(arg0, local653, local675, local665 - local653, local813 - local675, local750.aShortArray69, local750.aByteArray91);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)Lclient!ji;")
	public static Class3_Sub3_Sub13 method310(@OriginalArg(0) int arg0) {
		return (Class3_Sub3_Sub13) aClass140_3.method3490((long) arg0);
	}

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "()V")
	public static void method311() {
		aByteArray15 = new byte[anInt273 * anInt277];
		aByteArray16 = new byte[anInt273 * anInt277];
		aByteArray14 = new byte[anInt273 * anInt277];
		aShortArray8 = new short[anInt273 * anInt277];
		aByteArray13 = new byte[anInt273 * anInt277];
		aClass140_4 = new Class140(1024);
		aClass194ArrayArrayArray2 = new Class194[3][anInt273 >> 6][anInt277 >> 6];
		anIntArray5 = new int[aClass237_2.anInt6573 + 1];
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!qa;II)V")
	public static void method312(@OriginalArg(0) Class167 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class3_Sub25 local9 = new Class3_Sub25(aClass250_8.method5795("area", aClass3_Sub3_Sub13_2.aString44));
		@Pc(13) int local13 = local9.method4096();
		@Pc(16) int[] local16 = new int[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			local16[local18] = local9.method4096();
		}
		@Pc(33) int local33 = local9.method4096();
		@Pc(36) int[] local36 = new int[local33];
		for (@Pc(38) int local38 = 0; local38 < local33; local38++) {
			local36[local38] = local9.method4096();
		}
		while (true) {
			@Pc(58) int local58;
			@Pc(64) int local64;
			@Pc(67) int local67;
			@Pc(76) int local76;
			@Pc(148) int local148;
			while (local9.anInt4974 < local9.aByteArray88.length) {
				@Pc(62) int local62;
				@Pc(84) int local84;
				if (local9.method4096() == 0) {
					local58 = local9.method4096();
					local62 = local9.method4096();
					for (local64 = 0; local64 < 64; local64++) {
						for (local67 = 0; local67 < 64; local67++) {
							local76 = local58 * 64 + local64 - anInt278;
							local84 = local62 * 64 + local67 - anInt276;
							method305(arg0, local9, local58, local62, local76, local84, local16, local36);
						}
					}
				} else {
					local58 = local9.method4096();
					local62 = local9.method4096();
					local64 = local9.method4096();
					local67 = local9.method4096();
					for (local76 = 0; local76 < 8; local76++) {
						for (local84 = 0; local84 < 8; local84++) {
							@Pc(136) int local136 = local58 * 64 + local64 * 8 + local76 - anInt278;
							local148 = local62 * 64 + local67 * 8 + local84 - anInt276;
							method305(arg0, local9, local58, local62, local136, local148, local16, local36);
						}
					}
				}
			}
			aByteArray17 = new byte[anInt273 * anInt277];
			aShortArray7 = new short[anInt273 * anInt277];
			for (local58 = 0; local58 < 3; local58++) {
				@Pc(191) byte[] local191 = new byte[anInt273 * anInt277];
				for (local64 = 0; local64 < aClass194ArrayArrayArray2[local58].length; local64++) {
					for (local67 = 0; local67 < aClass194ArrayArrayArray2[local58][0].length; local67++) {
						@Pc(205) Class194 local205 = aClass194ArrayArrayArray2[local58][local64][local67];
						if (local205 != null) {
							for (@Pc(212) Class23_Sub4 local212 = (Class23_Sub4) local205.method4577(); local212 != null; local212 = (Class23_Sub4) local205.method4580()) {
								local191[local64 * 64 + local212.aByte69 + (local67 * 64 + local212.aByte68) * anInt273] = (byte) local212.anInt5182;
							}
						}
					}
				}
				method299(local191, aByteArray17, aShortArray7, arg1, arg2);
				for (local67 = 0; local67 < aClass194ArrayArrayArray2[local58].length; local67++) {
					for (local76 = 0; local76 < aClass194ArrayArrayArray2[local58][0].length; local76++) {
						@Pc(276) Class194 local276 = aClass194ArrayArrayArray2[local58][local67][local76];
						if (local276 != null) {
							for (@Pc(283) Class23_Sub4 local283 = (Class23_Sub4) local276.method4577(); local283 != null; local283 = (Class23_Sub4) local276.method4580()) {
								local148 = local67 * 64 + local283.aByte69 + (local76 * 64 + local283.aByte68) * anInt273;
								local283.anInt5182 = (aByteArray17[local148] & 0xFF) << 16 | aShortArray7[local148] & 0xFFFF;
								if (local283.anInt5182 != 0) {
									local283.anInt5182 |= 0xFF000000;
								}
							}
						}
					}
				}
			}
			method299(aByteArray15, aByteArray17, aShortArray7, arg1, arg2);
			aByteArray15 = null;
			method295();
			return;
		}
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(Lclient!qa;IIII)Lclient!ps;")
	private static Class193 method313(@OriginalArg(0) Class167 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(4) Class3_Sub16 local4 = (Class3_Sub16) aClass193_3.method4519(); local4 != null; local4 = (Class3_Sub16) aClass193_3.method4525()) {
			method308(arg0, local4, arg1, arg2);
		}
		return aClass193_3;
	}
}
