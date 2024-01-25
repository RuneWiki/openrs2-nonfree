import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static487 {

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "Lclient!vd;")
	public static Class353 aClass353_72;

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "Lclient!hl;")
	private static Class136 aClass136_4;

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "Lclient!tfa;")
	private static Class321 aClass321_5;

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "Lclient!mk;")
	public static Class210 aClass210_4;

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "Lclient!sha;")
	public static Class304 aClass304_2;

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "Lclient!uaa;")
	public static Class337 aClass337_4;

	@OriginalMember(owner = "client!rf", name = "h", descriptor = "Lclient!vi;")
	public static Interface25 anInterface25_2;

	@OriginalMember(owner = "client!rf", name = "i", descriptor = "Lclient!jj;")
	public static Class6_Sub2_Sub11 aClass6_Sub2_Sub11_2;

	@OriginalMember(owner = "client!rf", name = "j", descriptor = "F")
	public static float aFloat144;

	@OriginalMember(owner = "client!rf", name = "k", descriptor = "F")
	public static float aFloat145;

	@OriginalMember(owner = "client!rf", name = "m", descriptor = "Lclient!vf;")
	public static Class356 aClass356_3;

	@OriginalMember(owner = "client!rf", name = "q", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray21;

	@OriginalMember(owner = "client!rf", name = "r", descriptor = "I")
	public static int anInt7451;

	@OriginalMember(owner = "client!rf", name = "t", descriptor = "[B")
	private static byte[] aByteArray80;

	@OriginalMember(owner = "client!rf", name = "u", descriptor = "I")
	public static int anInt7452;

	@OriginalMember(owner = "client!rf", name = "v", descriptor = "I")
	public static int anInt7453;

	@OriginalMember(owner = "client!rf", name = "w", descriptor = "I")
	public static int anInt7454;

	@OriginalMember(owner = "client!rf", name = "x", descriptor = "I")
	public static int anInt7455;

	@OriginalMember(owner = "client!rf", name = "y", descriptor = "[I")
	private static int[] anIntArray445;

	@OriginalMember(owner = "client!rf", name = "z", descriptor = "[[[Lclient!eia;")
	private static Class81[][][] aClass81ArrayArrayArray2;

	@OriginalMember(owner = "client!rf", name = "A", descriptor = "I")
	public static int anInt7456;

	@OriginalMember(owner = "client!rf", name = "B", descriptor = "[B")
	private static byte[] aByteArray81;

	@OriginalMember(owner = "client!rf", name = "C", descriptor = "[B")
	private static byte[] aByteArray82;

	@OriginalMember(owner = "client!rf", name = "D", descriptor = "I")
	public static int anInt7457;

	@OriginalMember(owner = "client!rf", name = "E", descriptor = "I")
	public static int anInt7458;

	@OriginalMember(owner = "client!rf", name = "F", descriptor = "[B")
	private static byte[] aByteArray83;

	@OriginalMember(owner = "client!rf", name = "G", descriptor = "I")
	public static int anInt7459;

	@OriginalMember(owner = "client!rf", name = "H", descriptor = "I")
	public static int anInt7460;

	@OriginalMember(owner = "client!rf", name = "I", descriptor = "I")
	public static int anInt7461;

	@OriginalMember(owner = "client!rf", name = "J", descriptor = "I")
	public static int anInt7462;

	@OriginalMember(owner = "client!rf", name = "K", descriptor = "Lclient!he;")
	private static Class128 aClass128_29;

	@OriginalMember(owner = "client!rf", name = "L", descriptor = "[S")
	private static short[] aShortArray91;

	@OriginalMember(owner = "client!rf", name = "N", descriptor = "[B")
	private static byte[] aByteArray84;

	@OriginalMember(owner = "client!rf", name = "O", descriptor = "[S")
	private static short[] aShortArray92;

	@OriginalMember(owner = "client!rf", name = "P", descriptor = "I")
	public static int anInt7463;

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "Lclient!he;")
	private static final Class128 aClass128_28 = new Class128(16);

	@OriginalMember(owner = "client!rf", name = "l", descriptor = "Lclient!ada;")
	public static final Class8 aClass8_51 = new Class8();

	@OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
	public static int anInt7449 = (int) (Math.random() * 11.0D) - 5;

	@OriginalMember(owner = "client!rf", name = "o", descriptor = "I")
	public static int anInt7450 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!rf", name = "p", descriptor = "[S")
	private static final short[] aShortArray90 = new short[1];

	@OriginalMember(owner = "client!rf", name = "s", descriptor = "[B")
	private static final byte[] aByteArray79 = new byte[1];

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "()V")
	public static void method6419() {
		@Pc(2) int[] local2 = new int[3];
		for (@Pc(4) int local4 = 0; local4 < aClass356_3.anInt10029; local4++) {
			@Pc(32) boolean local32 = aClass6_Sub2_Sub11_2.method4682(aClass356_3.anIntArray608[local4] >> 28 & 0x3, aClass356_3.anIntArray608[local4] & 0x3FFF, aClass356_3.anIntArray608[local4] >> 14 & 0x3FFF, local2);
			if (local32) {
				@Pc(42) Class6_Sub45 local42 = new Class6_Sub45(aClass356_3.anIntArray607[local4]);
				local42.anInt9419 = local2[1] - anInt7459;
				local42.anInt9422 = local2[2] - anInt7453;
				aClass8_51.method157(local42);
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!ha;Lclient!tl;IIII)V")
	private static void method6420(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class6_Sub45 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1.anInt9418 = anInt7458 + (arg2 * (arg1.anInt9419 - anInt7455) >> 16);
		arg1.anInt9416 = anInt7454 - (arg3 * (arg1.anInt9422 - anInt7461) >> 16);
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "()V")
	public static void method6422() {
		aByteArray84 = null;
		aByteArray83 = null;
		aShortArray92 = null;
		aByteArray81 = null;
		aByteArray80 = null;
		aShortArray91 = null;
		aByteArray82 = null;
		aClass128_29 = null;
		aClass81ArrayArrayArray2 = null;
		anIntArray445 = null;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)Lclient!jj;")
	public static Class6_Sub2_Sub11 method6423(@OriginalArg(0) int arg0) {
		return (Class6_Sub2_Sub11) aClass128_28.method3560((long) arg0);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!vd;Lclient!hl;Lclient!tfa;Lclient!mk;Lclient!uaa;Lclient!sha;Lclient!vi;)V")
	public static void method6424(@OriginalArg(0) Class353 arg0, @OriginalArg(1) Class136 arg1, @OriginalArg(2) Class321 arg2, @OriginalArg(3) Class210 arg3, @OriginalArg(4) Class337 arg4, @OriginalArg(5) Class304 arg5, @OriginalArg(6) Interface25 arg6) {
		aClass353_72 = arg0;
		aClass136_4 = arg1;
		aClass321_5 = arg2;
		aClass210_4 = arg3;
		aClass337_4 = arg4;
		aClass304_2 = arg5;
		anInterface25_2 = arg6;
		aClass128_28.method3562();
		@Pc(21) int local21 = aClass353_72.method8410("details");
		@Pc(26) int[] local26 = aClass353_72.method8416(local21);
		if (local26 != null) {
			for (@Pc(30) int local30 = 0; local30 < local26.length; local30++) {
				@Pc(39) Class6_Sub2_Sub11 local39 = Static220.method3753(local26[local30], local21, aClass353_72);
				aClass128_28.method3551((long) local39.anInt5230, local39);
			}
		}
		Static125.method9040(true, false);
	}

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "()V")
	public static void method6425() {
		aByteArray84 = new byte[anInt7462 * anInt7457];
		aByteArray81 = new byte[anInt7462 * anInt7457];
		aByteArray80 = new byte[anInt7462 * anInt7457];
		aShortArray91 = new short[anInt7462 * anInt7457];
		aByteArray82 = new byte[anInt7462 * anInt7457];
		aClass128_29 = new Class128(1024);
		aClass81ArrayArrayArray2 = new Class81[3][anInt7462 >> 6][anInt7457 >> 6];
		anIntArray445 = new int[aClass136_4.anInt4229 + 1];
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!ha;IIII)Lclient!ada;")
	private static Class8 method6426(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(4) Class6_Sub45 local4 = (Class6_Sub45) aClass8_51.method149(); local4 != null; local4 = (Class6_Sub45) aClass8_51.method155()) {
			method6420(arg0, local4, arg1, arg2);
		}
		return aClass8_51;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V")
	public static void method6427(@OriginalArg(0) int arg0) {
		aClass6_Sub2_Sub11_2 = (Class6_Sub2_Sub11) aClass128_28.method3560((long) arg0);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!ha;IIIIIII[S[BZ)V")
	private static void method6428(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) boolean arg10) {
		@Pc(20) int local20;
		@Pc(32) int local32;
		if (arg10 || arg5 != 0 || arg6 > 0) {
			if (arg6 == 0) {
				arg0.aa(arg1, arg2, arg3, arg4, arg5, 0);
			} else {
				local20 = arg7 & 0x3F;
				if (local20 == 0 || arg3 <= 1 || arg4 <= 1) {
					local32 = anIntArray445[arg6];
					if (arg10 || local32 != 0) {
						arg0.aa(arg1, arg2, arg3, arg4, local32, 0);
					}
				} else {
					local32 = arg10 ? 0 : 1;
					Static486.method7257(anInt7451, local32, aByteArrayArrayArray21, anIntArray445[arg6], arg7 >> 6 & 0x3, arg3, arg2, arg0, local20, arg4, arg5, arg1);
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
				@Pc(127) Class312 local127 = aClass210_4.method5629(arg8[local100] & 0xFFFF);
				if (local127.anInt9222 == -1) {
					@Pc(133) int local133 = -3355444;
					if (local127.anInt9207 == 1) {
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

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!d;III)I")
	private static int method6429(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class283 local4 = aClass136_4.method3665(arg1);
		if (local4 == null) {
			return 0;
		}
		@Pc(11) int local11 = local4.anInt8363;
		if (local11 >= 0 && arg0.method895(local11).aBoolean636) {
			local11 = -1;
		}
		@Pc(68) int local68;
		@Pc(27) int local27;
		@Pc(33) int local33;
		@Pc(55) int local55;
		if (local4.anInt8358 >= 0) {
			local27 = local4.anInt8358;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static152.anIntArray292[Static163.method3033(Static116.method1911(local55)) & 0xFFFF] | 0xFF000000;
		} else if (local11 >= 0) {
			local68 = Static152.anIntArray292[Static163.method3033(Static116.method1911(arg0.method895(local11).aShort111)) & 0xFFFF] | 0xFF000000;
		} else if (local4.anInt8353 == -1) {
			local68 = 0;
		} else {
			local27 = local4.anInt8353;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static152.anIntArray292[Static163.method3033(Static116.method1911(local55)) & 0xFFFF] | 0xFF000000;
		}
		return local68;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(Lclient!ha;IIII)V")
	private static void method6430(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = anInt7460 - anInt7455;
		@Pc(7) int local7 = anInt7463 - anInt7461;
		if (anInt7460 < anInt7462) {
			local3++;
		}
		if (anInt7463 < anInt7457) {
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
			local28 = (arg1 * local17 >> 16) + anInt7458;
			local40 = (arg1 * (local17 + 1) >> 16) + anInt7458;
			local44 = local40 - local28;
			if (local44 > 0) {
				local50 = anInt7455 + local17;
				if (local50 >= 0 && local50 < anInt7462) {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt7454 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt7454 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (local84 > 0) {
							local93 = local57 + anInt7461;
							local173 = local50 + local93 * anInt7462;
							local175 = 0;
							local177 = 0;
							local179 = 0;
							if (local93 >= 0 && local93 < anInt7457) {
								local175 = (aByteArray83[local173] & 0xFF) << 16 | aShortArray92[local173] & 0xFFFF;
								if (local175 != 0) {
									local175 |= 0xFF000000;
								}
								local177 = aByteArray81[local173] & 0xFF;
								local179 = aShortArray91[local173] & 0xFFFF;
							}
							if (local175 == 0 && local177 == 0 && local179 == 0) {
								if (aClass6_Sub2_Sub11_2.anInt5224 != -1) {
									local175 = aClass6_Sub2_Sub11_2.anInt5224 | 0xFF000000;
								} else if ((local17 + anInt7455 & 0x4) == (local57 + anInt7463 & 0x4)) {
									local175 = anIntArray445[aClass136_4.anInt4231 + 1];
								} else {
									local175 = -11840664;
								}
								if (local175 == 0) {
									local175 = -16777216;
								}
								arg0.aa(local28, local70, local44, local84, local175, 0);
							} else if (local179 <= 0) {
								method6428(arg0, local28, local70, local44, local84, local175, local177, aByteArray80[local173], (short[]) null, (byte[]) null, true);
							} else if (local179 == 65535) {
								@Pc(282) Class6_Sub12 local282 = (Class6_Sub12) aClass128_29.method3560((long) (local50 << 16 | local93));
								if (local282 != null) {
									method6428(arg0, local28, local70, local44, local84, local175, local177, aByteArray80[local173], local282.aShortArray48, local282.aByteArray38, true);
								}
							} else {
								aShortArray90[0] = (short) (local179 - 1);
								aByteArray79[0] = aByteArray82[local173];
								method6428(arg0, local28, local70, local44, local84, local175, local177, aByteArray80[local173], aShortArray90, aByteArray79, true);
							}
						}
					}
				} else {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt7454 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt7454 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (aClass6_Sub2_Sub11_2.anInt5224 != -1) {
							local93 = aClass6_Sub2_Sub11_2.anInt5224 | 0xFF000000;
						} else if ((local17 + anInt7455 & 0x4) == (local57 + anInt7463 & 0x4)) {
							local93 = anIntArray445[aClass136_4.anInt4231 + 1];
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
			local40 = (arg1 * local28 >> 16) + anInt7458;
			local44 = (arg1 * (local28 + 1) >> 16) + anInt7458;
			local50 = local44 - local40;
			if (local50 > 0) {
				local57 = local28 + anInt7455;
				if (local57 >= 0 && local57 < anInt7462) {
					for (local70 = -16; local70 < local7 + 16; local70++) {
						local80 = anInt7454 - (arg2 * (local70 + 1) >> 16);
						local84 = anInt7454 - (arg2 * local70 >> 16);
						local93 = local84 - local80;
						if (local93 > 0) {
							local173 = local70 + anInt7461;
							if (local173 >= 0 && local173 < anInt7457) {
								local175 = aShortArray91[local57 + local173 * anInt7462] & 0xFFFF;
								if (local175 <= 0) {
									method6436(arg0, local40, local80, local50, local93, (short[]) null, (byte[]) null);
								} else if (local175 == 65535) {
									@Pc(459) Class6_Sub12 local459 = (Class6_Sub12) aClass128_29.method3560((long) (local57 << 16 | local173));
									if (local459 != null) {
										method6436(arg0, local40, local80, local50, local93, local459.aShortArray48, local459.aByteArray38);
									}
								} else {
									aShortArray90[0] = (short) (local175 - 1);
									aByteArray79[0] = aByteArray82[local57 + local173 * anInt7462];
									method6436(arg0, local40, local80, local50, local93, aShortArray90, aByteArray79);
								}
							}
						}
					}
				}
			}
		}
		local40 = anInt7455 >> 6;
		local44 = anInt7461 >> 6;
		if (local40 < 0) {
			local40 = 0;
		}
		if (local44 < 0) {
			local44 = 0;
		}
		local50 = anInt7460 >> 6;
		local57 = anInt7463 >> 6;
		if (local50 >= aClass81ArrayArrayArray2[0].length) {
			local50 = aClass81ArrayArrayArray2[0].length - 1;
		}
		if (local57 >= aClass81ArrayArrayArray2[0][0].length) {
			local57 = aClass81ArrayArrayArray2[0][0].length - 1;
		}
		for (local70 = 0; local70 < 3; local70++) {
			@Pc(641) int local641;
			@Pc(653) int local653;
			@Pc(665) int local665;
			@Pc(675) int local675;
			@Pc(631) int local631;
			for (local80 = local40; local80 <= local50; local80++) {
				for (local84 = local44; local84 <= local57; local84++) {
					@Pc(589) Class81 local589 = aClass81ArrayArrayArray2[local70][local80][local84];
					if (local589 != null) {
						local173 = (local80 + (anInt7459 >> 6)) * 64;
						local175 = (local84 + (anInt7453 >> 6)) * 64;
						for (@Pc(612) Class20_Sub1 local612 = (Class20_Sub1) local589.method2118(); local612 != null; local612 = (Class20_Sub1) local589.method2128()) {
							local179 = local173 + local612.aByte4 - anInt7459 - anInt7455;
							local631 = local175 + local612.aByte2 - anInt7453 - anInt7461;
							local641 = (arg1 * local179 >> 16) + anInt7458;
							local653 = (arg1 * (local179 + 1) >> 16) + anInt7458;
							local665 = anInt7454 - (arg2 * (local631 + 1) >> 16);
							local675 = anInt7454 - (arg2 * local631 >> 16);
							method6428(arg0, local641, local665, local653 - local641, local675 - local665, local612.anInt345, local612.aByte5 & 0xFF, local612.aByte3, local612.aShortArray1, local612.aByteArray2, false);
						}
					}
				}
			}
			for (local84 = local40; local84 <= local50; local84++) {
				for (local93 = local44; local93 <= local57; local93++) {
					@Pc(727) Class81 local727 = aClass81ArrayArrayArray2[local70][local84][local93];
					if (local727 != null) {
						local175 = (local84 + (anInt7459 >> 6)) * 64;
						local177 = (local93 + (anInt7453 >> 6)) * 64;
						for (@Pc(750) Class20_Sub1 local750 = (Class20_Sub1) local727.method2118(); local750 != null; local750 = (Class20_Sub1) local727.method2128()) {
							local631 = local175 + local750.aByte4 - anInt7459 - anInt7455;
							local641 = local177 + local750.aByte2 - anInt7453 - anInt7461;
							local653 = (arg1 * local631 >> 16) + anInt7458;
							local665 = (arg1 * (local631 + 1) >> 16) + anInt7458;
							local675 = anInt7454 - (arg2 * (local641 + 1) >> 16);
							@Pc(813) int local813 = anInt7454 - (arg2 * local641 >> 16);
							method6436(arg0, local653, local675, local665 - local653, local813 - local675, local750.aShortArray1, local750.aByteArray2);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "([B[B[SII)V")
	private static void method6431(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int[] local2 = new int[anInt7457];
		@Pc(5) int[] local5 = new int[anInt7457];
		@Pc(8) int[] local8 = new int[anInt7457];
		@Pc(11) int[] local11 = new int[anInt7457];
		@Pc(14) int[] local14 = new int[anInt7457];
		for (@Pc(16) int local16 = -5; local16 < anInt7462; local16++) {
			@Pc(21) int local21 = local16 + 5;
			@Pc(25) int local25 = local16 - 5;
			@Pc(41) int local41;
			for (@Pc(27) int local27 = 0; local27 < anInt7457; local27++) {
				@Pc(50) Class76 local50;
				@Pc(86) int local86;
				if (local21 < anInt7462) {
					local41 = arg0[local21 + local27 * anInt7462] & 0xFF;
					if (local41 > 0) {
						local50 = aClass321_5.method7948(local41 - 1);
						local2[local27] += local50.anInt2358;
						local5[local27] += local50.anInt2354;
						local8[local27] += local50.anInt2360;
						local11[local27] += local50.anInt2362;
						local86 = local14[local27]++;
					}
				}
				if (local25 >= 0) {
					local41 = arg0[local25 + local27 * anInt7462] & 0xFF;
					if (local41 > 0) {
						local50 = aClass321_5.method7948(local41 - 1);
						local2[local27] -= local50.anInt2358;
						local5[local27] -= local50.anInt2354;
						local8[local27] -= local50.anInt2360;
						local11[local27] -= local50.anInt2362;
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
				for (@Pc(167) int local167 = -5; local167 < anInt7457; local167++) {
					@Pc(172) int local172 = local167 + 5;
					if (local172 < anInt7457) {
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
						if ((arg0[local16 + local167 * anInt7462] & 0xFF) == 0) {
							local261 = local16 + local167 * anInt7462;
							arg1[local261] = 0;
							arg2[local261] = 0;
						} else {
							local261 = local163 == 0 ? 0 : Static98.method1584(local41 * 256 / local163, local161 / local165, local159 / local165);
							@Pc(294) int local294 = (local261 & 0x7F) + arg4;
							if (local294 < 0) {
								local294 = 0;
							} else if (local294 > 127) {
								local294 = 127;
							}
							@Pc(316) int local316 = (local261 + arg3 & 0xFC00) + (local261 & 0x380) + local294;
							@Pc(322) int local322 = local16 + local167 * anInt7462;
							@Pc(333) int local333 = Static152.anIntArray292[Static163.method3033(Static8.method153(local316)) & 0xFFFF];
							arg1[local322] = (byte) (local333 >> 16 & 0xFF);
							arg2[local322] = (short) (local333 & 0xFFFF);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)Lclient!jj;")
	public static Class6_Sub2_Sub11 method6432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class6_Sub2_Sub11 local4 = (Class6_Sub2_Sub11) aClass128_28.method3556(); local4 != null; local4 = (Class6_Sub2_Sub11) aClass128_28.method3555()) {
			if (local4.aBoolean357 && local4.method4679(arg1, arg0)) {
				return local4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!ha;II)V")
	public static void method6433(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class6_Sub40 local9 = new Class6_Sub40(aClass353_72.method8426(aClass6_Sub2_Sub11_2.aString57, "area"));
		@Pc(13) int local13 = local9.method8604();
		@Pc(16) int[] local16 = new int[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			local16[local18] = local9.method8604();
		}
		@Pc(33) int local33 = local9.method8604();
		@Pc(36) int[] local36 = new int[local33];
		for (@Pc(38) int local38 = 0; local38 < local33; local38++) {
			local36[local38] = local9.method8604();
		}
		while (true) {
			@Pc(58) int local58;
			@Pc(64) int local64;
			@Pc(67) int local67;
			@Pc(76) int local76;
			@Pc(148) int local148;
			while (local9.anInt10169 < local9.aByteArray113.length) {
				@Pc(62) int local62;
				@Pc(84) int local84;
				if (local9.method8604() == 0) {
					local58 = local9.method8604();
					local62 = local9.method8604();
					for (local64 = 0; local64 < 64; local64++) {
						for (local67 = 0; local67 < 64; local67++) {
							local76 = local58 * 64 + local64 - anInt7459;
							local84 = local62 * 64 + local67 - anInt7453;
							method6437(arg0, local9, local58, local62, local76, local84, local16, local36);
						}
					}
				} else {
					local58 = local9.method8604();
					local62 = local9.method8604();
					local64 = local9.method8604();
					local67 = local9.method8604();
					for (local76 = 0; local76 < 8; local76++) {
						for (local84 = 0; local84 < 8; local84++) {
							@Pc(136) int local136 = local58 * 64 + local64 * 8 + local76 - anInt7459;
							local148 = local62 * 64 + local67 * 8 + local84 - anInt7453;
							method6437(arg0, local9, local58, local62, local136, local148, local16, local36);
						}
					}
				}
			}
			aByteArray83 = new byte[anInt7462 * anInt7457];
			aShortArray92 = new short[anInt7462 * anInt7457];
			for (local58 = 0; local58 < 3; local58++) {
				@Pc(191) byte[] local191 = new byte[anInt7462 * anInt7457];
				for (local64 = 0; local64 < aClass81ArrayArrayArray2[local58].length; local64++) {
					for (local67 = 0; local67 < aClass81ArrayArrayArray2[local58][0].length; local67++) {
						@Pc(205) Class81 local205 = aClass81ArrayArrayArray2[local58][local64][local67];
						if (local205 != null) {
							for (@Pc(212) Class20_Sub1 local212 = (Class20_Sub1) local205.method2118(); local212 != null; local212 = (Class20_Sub1) local205.method2128()) {
								local191[local64 * 64 + local212.aByte4 + (local67 * 64 + local212.aByte2) * anInt7462] = (byte) local212.anInt345;
							}
						}
					}
				}
				method6431(local191, aByteArray83, aShortArray92, arg1, arg2);
				for (local67 = 0; local67 < aClass81ArrayArrayArray2[local58].length; local67++) {
					for (local76 = 0; local76 < aClass81ArrayArrayArray2[local58][0].length; local76++) {
						@Pc(276) Class81 local276 = aClass81ArrayArrayArray2[local58][local67][local76];
						if (local276 != null) {
							for (@Pc(283) Class20_Sub1 local283 = (Class20_Sub1) local276.method2118(); local283 != null; local283 = (Class20_Sub1) local276.method2128()) {
								local148 = local67 * 64 + local283.aByte4 + (local76 * 64 + local283.aByte2) * anInt7462;
								local283.anInt345 = (aByteArray83[local148] & 0xFF) << 16 | aShortArray92[local148] & 0xFFFF;
								if (local283.anInt345 != 0) {
									local283.anInt345 |= 0xFF000000;
								}
							}
						}
					}
				}
			}
			method6431(aByteArray84, aByteArray83, aShortArray92, arg1, arg2);
			aByteArray84 = null;
			method6442();
			return;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!ha;)V")
	public static void method6434(@OriginalArg(0) Class100 arg0) {
		@Pc(3) int local3 = anInt7460 - anInt7455;
		@Pc(7) int local7 = anInt7463 - anInt7461;
		@Pc(15) int local15 = (anInt7452 - anInt7458 << 16) / local3;
		@Pc(23) int local23 = (anInt7454 - anInt7456 << 16) / local7;
		method6430(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!d;II)V")
	public static void method6435(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < aClass136_4.anInt4229; local1++) {
			anIntArray445[local1 + 1] = method6429(arg0, local1, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!ha;IIII[S[B)V")
	private static void method6436(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		if (arg5 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < arg5.length; local4++) {
			@Pc(14) Class312 local14 = aClass210_4.method5629(arg5[local4] & 0xFFFF);
			@Pc(17) int local17 = local14.anInt9222;
			if (local17 != -1) {
				@Pc(25) Class246 local25 = aClass304_2.method7759(local17);
				@Pc(49) Class32 local49 = local25.method6524(arg0, local14.aBoolean624 ? arg6[local4] >> 6 & 0x3 : 0, local14.aBoolean620 ? local14.lb : false);
				if (local49 != null) {
					@Pc(58) int local58 = arg3 * local49.method5080() >> 2;
					@Pc(65) int local65 = arg4 * local49.method5079() >> 2;
					if (local25.aBoolean507) {
						@Pc(71) int local71 = local14.anInt9244;
						@Pc(74) int local74 = local14.anInt9235;
						if ((arg6[local4] >> 6 & 0x1) == 1) {
							@Pc(85) int local85 = local71;
							local71 = local74;
							local74 = local85;
						}
						local58 = local71 * arg3;
						local65 = local74 * arg4;
					}
					if (local58 != 0 && local65 != 0) {
						if (local25.anInt7565 == 0) {
							local49.method5090(arg1, arg2 + arg4 - local65, local58, local65);
						} else {
							local49.method5076(arg1, arg2 + arg4 - local65, local58, local65, 0, local25.anInt7565 | 0xFF000000, 1);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!ha;Lclient!rg;IIII[I[I)V")
	private static void method6437(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class6_Sub40 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		@Pc(3) int local3 = arg1.method8604();
		if ((local3 & 0x1) == 0) {
			@Pc(15) boolean local15 = (local3 & 0x2) == 0;
			@Pc(21) int local21 = local3 >> 2 & 0x3F;
			if (local21 != 62) {
				if (local21 == 63) {
					local21 = arg1.method8604();
				} else if (local15) {
					local21 = arg6[local21];
				} else {
					local21 = arg7[local21];
				}
				if (local15) {
					aByteArray84[arg4 + arg5 * anInt7462] = (byte) local21;
					aByteArray81[arg4 + arg5 * anInt7462] = 0;
				} else {
					aByteArray81[arg4 + arg5 * anInt7462] = (byte) local21;
					aByteArray80[arg4 + arg5 * anInt7462] = 0;
					aByteArray84[arg4 + arg5 * anInt7462] = arg1.method8602();
				}
			}
			return;
		}
		@Pc(100) int local100 = (local3 >> 1 & 0x3) + 1;
		@Pc(108) boolean local108 = (local3 & 0x8) != 0;
		@Pc(116) boolean local116 = (local3 & 0x10) != 0;
		for (@Pc(118) int local118 = 0; local118 < local100; local118++) {
			@Pc(123) int local123 = arg1.method8604();
			@Pc(125) int local125 = 0;
			@Pc(127) int local127 = 0;
			if (local108) {
				local125 = arg1.method8604();
				local127 = arg1.method8604();
			}
			@Pc(139) int local139 = 0;
			if (local116) {
				local139 = arg1.method8604();
			}
			@Pc(215) short[] local215;
			@Pc(218) byte[] local218;
			@Pc(220) int local220;
			if (local118 == 0) {
				aByteArray84[arg4 + arg5 * anInt7462] = (byte) local123;
				aByteArray81[arg4 + arg5 * anInt7462] = (byte) local125;
				aByteArray80[arg4 + arg5 * anInt7462] = (byte) local127;
				if (local139 == 1) {
					aShortArray91[arg4 + arg5 * anInt7462] = (short) (arg1.method8571() + 1);
					aByteArray82[arg4 + arg5 * anInt7462] = arg1.method8602();
				} else if (local139 > 1) {
					aShortArray91[arg4 + arg5 * anInt7462] = -1;
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method8571();
						local218[local220] = arg1.method8602();
					}
					aClass128_29.method3551((long) (arg4 << 16 | arg5), new Class6_Sub12(local215, local218));
				}
			} else {
				local215 = null;
				local218 = null;
				if (local139 > 0) {
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method8571();
						local218[local220] = arg1.method8602();
					}
				}
				if (aClass81ArrayArrayArray2[local118 - 1][arg2 - (anInt7459 >> 6)][arg3 - (anInt7453 >> 6)] == null) {
					aClass81ArrayArrayArray2[local118 - 1][arg2 - (anInt7459 >> 6)][arg3 - (anInt7453 >> 6)] = new Class81();
				}
				@Pc(338) Class20_Sub1 local338 = new Class20_Sub1(arg4 & 0x3F, arg5 & 0x3F, local123, local125, local127, local215, local218);
				aClass81ArrayArrayArray2[local118 - 1][arg2 - (anInt7459 >> 6)][arg3 - (anInt7453 >> 6)].method2119(local338);
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIIIII)V")
	public static void method6438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt7455 = arg0 - anInt7459;
		anInt7463 = arg1 - anInt7453;
		anInt7460 = arg2 - anInt7459;
		anInt7461 = arg3 - anInt7453;
		anInt7458 = arg4;
		anInt7456 = arg5;
		anInt7452 = arg6;
		anInt7454 = arg7;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(Lclient!ha;)Lclient!ada;")
	public static Class8 method6439(@OriginalArg(0) Class100 arg0) {
		@Pc(3) int local3 = anInt7460 - anInt7455;
		@Pc(7) int local7 = anInt7463 - anInt7461;
		@Pc(15) int local15 = (anInt7452 - anInt7458 << 16) / local3;
		@Pc(23) int local23 = (anInt7454 - anInt7456 << 16) / local7;
		return method6426(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)Lclient!re;")
	public static Class286 method6440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class286 local3 = new Class286();
		for (@Pc(8) Class6_Sub2_Sub11 local8 = (Class6_Sub2_Sub11) aClass128_28.method3556(); local8 != null; local8 = (Class6_Sub2_Sub11) aClass128_28.method3555()) {
			if (local8.aBoolean357 && local8.method4679(arg1, arg0)) {
				local3.method7239(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!ha;Lclient!tl;Lclient!fo;)V")
	public static void method6441(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class6_Sub45 arg1, @OriginalArg(2) Class105 arg2) {
		if (arg2.anIntArray205 == null) {
			return;
		}
		@Pc(7) int[] local7 = new int[arg2.anIntArray205.length];
		@Pc(20) int local20;
		@Pc(32) int local32;
		for (@Pc(9) int local9 = 0; local9 < local7.length / 2; local9++) {
			local20 = arg2.anIntArray205[local9 * 2] + arg1.anInt9419;
			local32 = arg2.anIntArray205[local9 * 2 + 1] + arg1.anInt9422;
			local7[local9 * 2] = anInt7458 + (anInt7452 - anInt7458) * (local20 - anInt7455) / (anInt7460 - anInt7455);
			local7[local9 * 2 + 1] = anInt7454 - (anInt7454 - anInt7456) * (local32 - anInt7461) / (anInt7463 - anInt7461);
		}
		Static468.method7096(arg0, local7, arg2.anInt3382);
		if (arg2.anInt3381 > 0) {
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
				arg0.method8843(local32, local102, local110, local120, arg2.anIntArray206[arg2.aByteArray46[local20] & 0xFF], arg2.anInt3381, arg2.anInt3386, arg2.anInt3406);
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
			arg0.method8843(local32, local102, local110, local120, arg2.anIntArray206[arg2.aByteArray46[arg2.aByteArray46.length - 1] & 0xFF], arg2.anInt3381, arg2.anInt3386, arg2.anInt3406);
			return;
		}
		for (local20 = 0; local20 < local7.length / 2 - 1; local20++) {
			arg0.method8832(local7[local20 * 2 + 1], local7[(local20 + 1) * 2 + 1], local7[local20 * 2], arg2.anIntArray206[arg2.aByteArray46[local20] & 0xFF], local7[(local20 + 1) * 2]);
		}
		arg0.method8832(local7[local7.length - 1], local7[1], local7[local7.length - 2], arg2.anIntArray206[arg2.aByteArray46[arg2.aByteArray46.length - 1] & 0xFF], local7[0]);
	}

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "()V")
	private static void method6442() {
		@Pc(4) int local4;
		@Pc(15) int local15;
		@Pc(49) int local49;
		for (@Pc(1) int local1 = 0; local1 < anInt7462; local1++) {
			for (local4 = 0; local4 < anInt7457; local4++) {
				local15 = aShortArray91[local1 + local4 * anInt7462] & 0xFFFF;
				if (local15 != 0) {
					@Pc(35) int local35;
					if (local15 == 65535) {
						@Pc(31) Class6_Sub12 local31 = (Class6_Sub12) aClass128_29.method3560((long) (local1 << 16 | local4));
						if (local31 != null) {
							for (local35 = 0; local35 < local31.aShortArray48.length; local35++) {
								@Pc(46) Class312 local46 = aClass210_4.method5629(local31.aShortArray48[local35] & 0xFFFF);
								local49 = local46.anInt9211;
								if (local46.anIntArray565 != null) {
									local46 = local46.method7866(anInterface25_2);
									if (local46 != null) {
										local49 = local46.anInt9211;
									}
								}
								if (local49 != -1) {
									@Pc(70) Class6_Sub45 local70 = new Class6_Sub45(local49);
									local70.anInt9419 = local1;
									local70.anInt9422 = local4;
									aClass8_51.method157(local70);
								}
							}
						}
					} else {
						@Pc(94) Class312 local94 = aClass210_4.method5629(local15 - 1);
						local35 = local94.anInt9211;
						if (local94.anIntArray565 != null) {
							local94 = local94.method7866(anInterface25_2);
							if (local94 != null) {
								local35 = local94.anInt9211;
							}
						}
						if (local35 != -1) {
							@Pc(118) Class6_Sub45 local118 = new Class6_Sub45(local35);
							local118.anInt9419 = local1;
							local118.anInt9422 = local4;
							aClass8_51.method157(local118);
						}
					}
				}
			}
		}
		for (local4 = 0; local4 < 3; local4++) {
			for (local15 = 0; local15 < aClass81ArrayArrayArray2[0].length; local15++) {
				for (@Pc(144) int local144 = 0; local144 < aClass81ArrayArrayArray2[0][0].length; local144++) {
					@Pc(153) Class81 local153 = aClass81ArrayArrayArray2[local4][local15][local144];
					if (local153 != null) {
						for (@Pc(160) Class20_Sub1 local160 = (Class20_Sub1) local153.method2118(); local160 != null; local160 = (Class20_Sub1) local153.method2128()) {
							if (local160.aShortArray1 != null) {
								for (local49 = 0; local49 < local160.aShortArray1.length; local49++) {
									@Pc(177) Class312 local177 = aClass210_4.method5629(local160.aShortArray1[local49] & 0xFFFF);
									@Pc(180) int local180 = local177.anInt9211;
									if (local177.anIntArray565 != null) {
										local177 = local177.method7866(anInterface25_2);
										if (local177 != null) {
											local180 = local177.anInt9211;
										}
									}
									if (local180 != -1) {
										@Pc(201) Class6_Sub45 local201 = new Class6_Sub45(local180);
										local201.anInt9419 = (local15 + (anInt7459 >> 6)) * 64 + local160.aByte4 - anInt7459;
										local201.anInt9422 = (local144 + (anInt7453 >> 6)) * 64 + local160.aByte2 - anInt7453;
										aClass8_51.method157(local201);
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
