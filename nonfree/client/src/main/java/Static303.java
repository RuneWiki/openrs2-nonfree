import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "Lclient!in;")
	public static Class157 aClass157_4;

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "Lclient!on;")
	public static Class248 aClass248_2;

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "Lclient!cb;")
	private static Class49 aClass49_2;

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "Lclient!qe;")
	private static Class275 aClass275_2;

	@OriginalMember(owner = "client!kp", name = "f", descriptor = "Lclient!oda;")
	public static Class237 aClass237_2;

	@OriginalMember(owner = "client!kp", name = "g", descriptor = "Lclient!dfa;")
	public static Class2_Sub6_Sub4 aClass2_Sub6_Sub4_2;

	@OriginalMember(owner = "client!kp", name = "h", descriptor = "Lclient!dd;")
	public static Interface6 anInterface6_2;

	@OriginalMember(owner = "client!kp", name = "i", descriptor = "Lclient!uha;")
	public static Class342 aClass342_2;

	@OriginalMember(owner = "client!kp", name = "j", descriptor = "Lclient!tu;")
	public static Class333 aClass333_2;

	@OriginalMember(owner = "client!kp", name = "k", descriptor = "F")
	public static float aFloat5;

	@OriginalMember(owner = "client!kp", name = "m", descriptor = "F")
	public static float aFloat6;

	@OriginalMember(owner = "client!kp", name = "o", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!kp", name = "s", descriptor = "I")
	public static int anInt104;

	@OriginalMember(owner = "client!kp", name = "t", descriptor = "[B")
	private static byte[] aByteArray8;

	@OriginalMember(owner = "client!kp", name = "u", descriptor = "I")
	public static int anInt105;

	@OriginalMember(owner = "client!kp", name = "v", descriptor = "[B")
	private static byte[] aByteArray9;

	@OriginalMember(owner = "client!kp", name = "w", descriptor = "I")
	public static int anInt106;

	@OriginalMember(owner = "client!kp", name = "x", descriptor = "[I")
	private static int[] anIntArray9;

	@OriginalMember(owner = "client!kp", name = "y", descriptor = "[S")
	private static short[] aShortArray5;

	@OriginalMember(owner = "client!kp", name = "z", descriptor = "I")
	public static int anInt107;

	@OriginalMember(owner = "client!kp", name = "A", descriptor = "I")
	public static int anInt108;

	@OriginalMember(owner = "client!kp", name = "B", descriptor = "[B")
	private static byte[] aByteArray10;

	@OriginalMember(owner = "client!kp", name = "C", descriptor = "I")
	public static int anInt109;

	@OriginalMember(owner = "client!kp", name = "D", descriptor = "I")
	public static int anInt110;

	@OriginalMember(owner = "client!kp", name = "E", descriptor = "I")
	public static int anInt111;

	@OriginalMember(owner = "client!kp", name = "F", descriptor = "I")
	public static int anInt112;

	@OriginalMember(owner = "client!kp", name = "G", descriptor = "[[[Lclient!tca;")
	private static Class325[][][] aClass325ArrayArrayArray2;

	@OriginalMember(owner = "client!kp", name = "H", descriptor = "[S")
	private static short[] aShortArray6;

	@OriginalMember(owner = "client!kp", name = "I", descriptor = "Lclient!eq;")
	private static Class99 aClass99_4;

	@OriginalMember(owner = "client!kp", name = "J", descriptor = "I")
	public static int anInt113;

	@OriginalMember(owner = "client!kp", name = "K", descriptor = "[B")
	private static byte[] aByteArray11;

	@OriginalMember(owner = "client!kp", name = "L", descriptor = "I")
	public static int anInt114;

	@OriginalMember(owner = "client!kp", name = "M", descriptor = "[B")
	private static byte[] aByteArray12;

	@OriginalMember(owner = "client!kp", name = "N", descriptor = "I")
	public static int anInt115;

	@OriginalMember(owner = "client!kp", name = "O", descriptor = "I")
	public static int anInt116;

	@OriginalMember(owner = "client!kp", name = "e", descriptor = "Lclient!eq;")
	private static final Class99 aClass99_3 = new Class99(16);

	@OriginalMember(owner = "client!kp", name = "l", descriptor = "[B")
	private static final byte[] aByteArray7 = new byte[1];

	@OriginalMember(owner = "client!kp", name = "n", descriptor = "I")
	public static int anInt102 = (int) (Math.random() * 11.0D) - 5;

	@OriginalMember(owner = "client!kp", name = "p", descriptor = "[S")
	private static final short[] aShortArray4 = new short[1];

	@OriginalMember(owner = "client!kp", name = "q", descriptor = "I")
	public static int anInt103 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!kp", name = "r", descriptor = "Lclient!uh;")
	public static final Class341 aClass341_2 = new Class341();

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!ha;Lclient!lga;Lclient!ii;)V")
	public static void method142(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class2_Sub32 arg1, @OriginalArg(2) Class153 arg2) {
		if (arg2.anIntArray273 == null) {
			return;
		}
		@Pc(7) int[] local7 = new int[arg2.anIntArray273.length];
		@Pc(20) int local20;
		@Pc(32) int local32;
		for (@Pc(9) int local9 = 0; local9 < local7.length / 2; local9++) {
			local20 = arg2.anIntArray273[local9 * 2] + arg1.anInt6572;
			local32 = arg2.anIntArray273[local9 * 2 + 1] + arg1.anInt6571;
			local7[local9 * 2] = anInt113 + (anInt115 - anInt113) * (local20 - anInt114) / (anInt109 - anInt114);
			local7[local9 * 2 + 1] = anInt112 - (anInt112 - anInt107) * (local32 - anInt105) / (anInt116 - anInt105);
		}
		Static95.method2537(arg0, local7, arg2.anInt5228);
		if (arg2.anInt5230 > 0) {
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
				arg0.method7277(local32, local102, local110, local120, arg2.anIntArray272[arg2.aByteArray69[local20] & 0xFF], arg2.anInt5230, arg2.anInt5222, arg2.anInt5242);
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
			arg0.method7277(local32, local102, local110, local120, arg2.anIntArray272[arg2.aByteArray69[arg2.aByteArray69.length - 1] & 0xFF], arg2.anInt5230, arg2.anInt5222, arg2.anInt5242);
			return;
		}
		for (local20 = 0; local20 < local7.length / 2 - 1; local20++) {
			arg0.method7248(local7[local20 * 2 + 1], local7[local20 * 2], local7[(local20 + 1) * 2], arg2.anIntArray272[arg2.aByteArray69[local20] & 0xFF], local7[(local20 + 1) * 2 + 1]);
		}
		arg0.method7248(local7[local7.length - 1], local7[local7.length - 2], local7[0], arg2.anIntArray272[arg2.aByteArray69[arg2.aByteArray69.length - 1] & 0xFF], local7[1]);
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!ha;Lclient!lga;IIII)V")
	private static void method144(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class2_Sub32 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1.anInt6573 = anInt113 + (arg2 * (arg1.anInt6572 - anInt114) >> 16);
		arg1.anInt6574 = anInt112 - (arg3 * (arg1.anInt6571 - anInt105) >> 16);
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!ha;)V")
	public static void method145(@OriginalArg(0) Class20 arg0) {
		@Pc(3) int local3 = anInt109 - anInt114;
		@Pc(7) int local7 = anInt116 - anInt105;
		@Pc(15) int local15 = (anInt115 - anInt113 << 16) / local3;
		@Pc(23) int local23 = (anInt112 - anInt107 << 16) / local7;
		method162(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "()V")
	public static void method146() {
		aByteArray11 = null;
		aByteArray10 = null;
		aShortArray6 = null;
		aByteArray8 = null;
		aByteArray12 = null;
		aShortArray5 = null;
		aByteArray9 = null;
		aClass99_4 = null;
		aClass325ArrayArrayArray2 = null;
		anIntArray9 = null;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!ha;Lclient!cea;IIII[I[I)V")
	private static void method147(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class2_Sub11 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		@Pc(3) int local3 = arg1.method8383();
		if ((local3 & 0x1) == 0) {
			@Pc(15) boolean local15 = (local3 & 0x2) == 0;
			@Pc(21) int local21 = local3 >> 2 & 0x3F;
			if (local21 != 62) {
				if (local21 == 63) {
					local21 = arg1.method8383();
				} else if (local15) {
					local21 = arg6[local21];
				} else {
					local21 = arg7[local21];
				}
				if (local15) {
					aByteArray11[arg4 + arg5 * anInt106] = (byte) local21;
					aByteArray8[arg4 + arg5 * anInt106] = 0;
				} else {
					aByteArray8[arg4 + arg5 * anInt106] = (byte) local21;
					aByteArray12[arg4 + arg5 * anInt106] = 0;
					aByteArray11[arg4 + arg5 * anInt106] = arg1.method8384();
				}
			}
			return;
		}
		@Pc(100) int local100 = (local3 >> 1 & 0x3) + 1;
		@Pc(108) boolean local108 = (local3 & 0x8) != 0;
		@Pc(116) boolean local116 = (local3 & 0x10) != 0;
		for (@Pc(118) int local118 = 0; local118 < local100; local118++) {
			@Pc(123) int local123 = arg1.method8383();
			@Pc(125) int local125 = 0;
			@Pc(127) int local127 = 0;
			if (local108) {
				local125 = arg1.method8383();
				local127 = arg1.method8383();
			}
			@Pc(139) int local139 = 0;
			if (local116) {
				local139 = arg1.method8383();
			}
			@Pc(215) short[] local215;
			@Pc(218) byte[] local218;
			@Pc(220) int local220;
			if (local118 == 0) {
				aByteArray11[arg4 + arg5 * anInt106] = (byte) local123;
				aByteArray8[arg4 + arg5 * anInt106] = (byte) local125;
				aByteArray12[arg4 + arg5 * anInt106] = (byte) local127;
				if (local139 == 1) {
					aShortArray5[arg4 + arg5 * anInt106] = (short) (arg1.method8326() + 1);
					aByteArray9[arg4 + arg5 * anInt106] = arg1.method8384();
				} else if (local139 > 1) {
					aShortArray5[arg4 + arg5 * anInt106] = -1;
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method8326();
						local218[local220] = arg1.method8384();
					}
					aClass99_4.method3059((long) (arg4 << 16 | arg5), new Class2_Sub47(local215, local218));
				}
			} else {
				local215 = null;
				local218 = null;
				if (local139 > 0) {
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method8326();
						local218[local220] = arg1.method8384();
					}
				}
				if (aClass325ArrayArrayArray2[local118 - 1][arg2 - (anInt110 >> 6)][arg3 - (anInt108 >> 6)] == null) {
					aClass325ArrayArrayArray2[local118 - 1][arg2 - (anInt110 >> 6)][arg3 - (anInt108 >> 6)] = new Class325();
				}
				@Pc(338) Class3_Sub8 local338 = new Class3_Sub8(arg4 & 0x3F, arg5 & 0x3F, local123, local125, local127, local215, local218);
				aClass325ArrayArrayArray2[local118 - 1][arg2 - (anInt110 >> 6)][arg3 - (anInt108 >> 6)].method8013(local338);
			}
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIIIIII)V")
	public static void method148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt114 = arg0 - anInt110;
		anInt116 = arg1 - anInt108;
		anInt109 = arg2 - anInt110;
		anInt105 = arg3 - anInt108;
		anInt113 = arg4;
		anInt107 = arg5;
		anInt115 = arg6;
		anInt112 = arg7;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!in;Lclient!cb;Lclient!qe;Lclient!uha;Lclient!on;Lclient!oda;Lclient!dd;)V")
	public static void method149(@OriginalArg(0) Class157 arg0, @OriginalArg(1) Class49 arg1, @OriginalArg(2) Class275 arg2, @OriginalArg(3) Class342 arg3, @OriginalArg(4) Class248 arg4, @OriginalArg(5) Class237 arg5, @OriginalArg(6) Interface6 arg6) {
		aClass157_4 = arg0;
		aClass49_2 = arg1;
		aClass275_2 = arg2;
		aClass342_2 = arg3;
		aClass248_2 = arg4;
		aClass237_2 = arg5;
		anInterface6_2 = arg6;
		aClass99_3.method3057();
		@Pc(21) int local21 = aClass157_4.method4571("details");
		@Pc(26) int[] local26 = aClass157_4.method4550(local21);
		if (local26 != null) {
			for (@Pc(30) int local30 = 0; local30 < local26.length; local30++) {
				@Pc(39) Class2_Sub6_Sub4 local39 = Static398.method6500(local26[local30], aClass157_4, local21);
				aClass99_3.method3059((long) local39.anInt2711, local39);
			}
		}
		Static100.method2647(true, false);
	}

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "()V")
	private static void method150() {
		@Pc(4) int local4;
		@Pc(15) int local15;
		@Pc(49) int local49;
		for (@Pc(1) int local1 = 0; local1 < anInt106; local1++) {
			for (local4 = 0; local4 < anInt111; local4++) {
				local15 = aShortArray5[local1 + local4 * anInt106] & 0xFFFF;
				if (local15 != 0) {
					@Pc(35) int local35;
					if (local15 == 65535) {
						@Pc(31) Class2_Sub47 local31 = (Class2_Sub47) aClass99_4.method3056((long) (local1 << 16 | local4));
						if (local31 != null) {
							for (local35 = 0; local35 < local31.aShortArray129.length; local35++) {
								@Pc(46) Class161 local46 = aClass342_2.method8534(local31.aShortArray129[local35] & 0xFFFF);
								local49 = local46.anInt5387;
								if (local46.anIntArray288 != null) {
									local46 = local46.method4606(anInterface6_2);
									if (local46 != null) {
										local49 = local46.anInt5387;
									}
								}
								if (local49 != -1) {
									@Pc(70) Class2_Sub32 local70 = new Class2_Sub32(local49);
									local70.anInt6572 = local1;
									local70.anInt6571 = local4;
									aClass341_2.method8528(local70);
								}
							}
						}
					} else {
						@Pc(94) Class161 local94 = aClass342_2.method8534(local15 - 1);
						local35 = local94.anInt5387;
						if (local94.anIntArray288 != null) {
							local94 = local94.method4606(anInterface6_2);
							if (local94 != null) {
								local35 = local94.anInt5387;
							}
						}
						if (local35 != -1) {
							@Pc(118) Class2_Sub32 local118 = new Class2_Sub32(local35);
							local118.anInt6572 = local1;
							local118.anInt6571 = local4;
							aClass341_2.method8528(local118);
						}
					}
				}
			}
		}
		for (local4 = 0; local4 < 3; local4++) {
			for (local15 = 0; local15 < aClass325ArrayArrayArray2[0].length; local15++) {
				for (@Pc(144) int local144 = 0; local144 < aClass325ArrayArrayArray2[0][0].length; local144++) {
					@Pc(153) Class325 local153 = aClass325ArrayArrayArray2[local4][local15][local144];
					if (local153 != null) {
						for (@Pc(160) Class3_Sub8 local160 = (Class3_Sub8) local153.method8016(); local160 != null; local160 = (Class3_Sub8) local153.method8022()) {
							if (local160.aShortArray128 != null) {
								for (local49 = 0; local49 < local160.aShortArray128.length; local49++) {
									@Pc(177) Class161 local177 = aClass342_2.method8534(local160.aShortArray128[local49] & 0xFFFF);
									@Pc(180) int local180 = local177.anInt5387;
									if (local177.anIntArray288 != null) {
										local177 = local177.method4606(anInterface6_2);
										if (local177 != null) {
											local180 = local177.anInt5387;
										}
									}
									if (local180 != -1) {
										@Pc(201) Class2_Sub32 local201 = new Class2_Sub32(local180);
										local201.anInt6572 = (local15 + (anInt110 >> 6)) * 64 + local160.aByte121 - anInt110;
										local201.anInt6571 = (local144 + (anInt108 >> 6)) * 64 + local160.aByte120 - anInt108;
										aClass341_2.method8528(local201);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V")
	public static void method151(@OriginalArg(0) int arg0) {
		aClass2_Sub6_Sub4_2 = (Class2_Sub6_Sub4) aClass99_3.method3056((long) arg0);
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!ha;IIIIIII[S[BZ)V")
	private static void method152(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) boolean arg10) {
		@Pc(20) int local20;
		@Pc(32) int local32;
		if (arg10 || arg5 != 0 || arg6 > 0) {
			if (arg6 == 0) {
				arg0.aa(arg1, arg2, arg3, arg4, arg5, 0);
			} else {
				local20 = arg7 & 0x3F;
				if (local20 == 0 || arg3 <= 1 || arg4 <= 1) {
					local32 = anIntArray9[arg6];
					if (arg10 || local32 != 0) {
						arg0.aa(arg1, arg2, arg3, arg4, local32, 0);
					}
				} else {
					local32 = arg10 ? 0 : 1;
					Static24.method610(anIntArray9[arg6], arg5, arg0, local32, anInt104, arg7 >> 6 & 0x3, aByteArrayArrayArray2, arg3, arg1, local20, arg4, arg2);
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
				@Pc(127) Class161 local127 = aClass342_2.method8534(arg8[local100] & 0xFFFF);
				if (local127.anInt5364 == -1) {
					@Pc(133) int local133 = -3355444;
					if (local127.anInt5363 == 1) {
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

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!ha;II)V")
	public static void method153(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class2_Sub11 local9 = new Class2_Sub11(aClass157_4.method4545(aClass2_Sub6_Sub4_2.aString22, "area"));
		@Pc(13) int local13 = local9.method8383();
		@Pc(16) int[] local16 = new int[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			local16[local18] = local9.method8383();
		}
		@Pc(33) int local33 = local9.method8383();
		@Pc(36) int[] local36 = new int[local33];
		for (@Pc(38) int local38 = 0; local38 < local33; local38++) {
			local36[local38] = local9.method8383();
		}
		while (true) {
			@Pc(58) int local58;
			@Pc(64) int local64;
			@Pc(67) int local67;
			@Pc(76) int local76;
			@Pc(148) int local148;
			while (local9.anInt10066 < local9.aByteArray128.length) {
				@Pc(62) int local62;
				@Pc(84) int local84;
				if (local9.method8383() == 0) {
					local58 = local9.method8383();
					local62 = local9.method8383();
					for (local64 = 0; local64 < 64; local64++) {
						for (local67 = 0; local67 < 64; local67++) {
							local76 = local58 * 64 + local64 - anInt110;
							local84 = local62 * 64 + local67 - anInt108;
							method147(arg0, local9, local58, local62, local76, local84, local16, local36);
						}
					}
				} else {
					local58 = local9.method8383();
					local62 = local9.method8383();
					local64 = local9.method8383();
					local67 = local9.method8383();
					for (local76 = 0; local76 < 8; local76++) {
						for (local84 = 0; local84 < 8; local84++) {
							@Pc(136) int local136 = local58 * 64 + local64 * 8 + local76 - anInt110;
							local148 = local62 * 64 + local67 * 8 + local84 - anInt108;
							method147(arg0, local9, local58, local62, local136, local148, local16, local36);
						}
					}
				}
			}
			aByteArray10 = new byte[anInt106 * anInt111];
			aShortArray6 = new short[anInt106 * anInt111];
			for (local58 = 0; local58 < 3; local58++) {
				@Pc(191) byte[] local191 = new byte[anInt106 * anInt111];
				for (local64 = 0; local64 < aClass325ArrayArrayArray2[local58].length; local64++) {
					for (local67 = 0; local67 < aClass325ArrayArrayArray2[local58][0].length; local67++) {
						@Pc(205) Class325 local205 = aClass325ArrayArrayArray2[local58][local64][local67];
						if (local205 != null) {
							for (@Pc(212) Class3_Sub8 local212 = (Class3_Sub8) local205.method8016(); local212 != null; local212 = (Class3_Sub8) local205.method8022()) {
								local191[local64 * 64 + local212.aByte121 + (local67 * 64 + local212.aByte120) * anInt106] = (byte) local212.anInt9240;
							}
						}
					}
				}
				method165(local191, aByteArray10, aShortArray6, arg1, arg2);
				for (local67 = 0; local67 < aClass325ArrayArrayArray2[local58].length; local67++) {
					for (local76 = 0; local76 < aClass325ArrayArrayArray2[local58][0].length; local76++) {
						@Pc(276) Class325 local276 = aClass325ArrayArrayArray2[local58][local67][local76];
						if (local276 != null) {
							for (@Pc(283) Class3_Sub8 local283 = (Class3_Sub8) local276.method8016(); local283 != null; local283 = (Class3_Sub8) local276.method8022()) {
								local148 = local67 * 64 + local283.aByte121 + (local76 * 64 + local283.aByte120) * anInt106;
								local283.anInt9240 = (aByteArray10[local148] & 0xFF) << 16 | aShortArray6[local148] & 0xFFFF;
								if (local283.anInt9240 != 0) {
									local283.anInt9240 |= 0xFF000000;
								}
							}
						}
					}
				}
			}
			method165(aByteArray11, aByteArray10, aShortArray6, arg1, arg2);
			aByteArray11 = null;
			method150();
			return;
		}
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(I)Lclient!dfa;")
	public static Class2_Sub6_Sub4 method154(@OriginalArg(0) int arg0) {
		return (Class2_Sub6_Sub4) aClass99_3.method3056((long) arg0);
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(Lclient!ha;)Lclient!uh;")
	public static Class341 method155(@OriginalArg(0) Class20 arg0) {
		@Pc(3) int local3 = anInt109 - anInt114;
		@Pc(7) int local7 = anInt116 - anInt105;
		@Pc(15) int local15 = (anInt115 - anInt113 << 16) / local3;
		@Pc(23) int local23 = (anInt112 - anInt107 << 16) / local7;
		return method159(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!d;III)I")
	private static int method156(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class354 local4 = aClass49_2.method1919(arg1);
		if (local4 == null) {
			return 0;
		}
		@Pc(11) int local11 = local4.anInt10468;
		if (local11 >= 0 && arg0.method8048(local11).aBoolean338) {
			local11 = -1;
		}
		@Pc(68) int local68;
		@Pc(27) int local27;
		@Pc(33) int local33;
		@Pc(55) int local55;
		if (local4.anInt10463 >= 0) {
			local27 = local4.anInt10463;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static373.anIntArray464[Static221.method4259(Static23.method609(local55)) & 0xFFFF] | 0xFF000000;
		} else if (local11 >= 0) {
			local68 = Static373.anIntArray464[Static221.method4259(Static23.method609(arg0.method8048(local11).aShort52)) & 0xFFFF] | 0xFF000000;
		} else if (local4.anInt10459 == -1) {
			local68 = 0;
		} else {
			local27 = local4.anInt10459;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static373.anIntArray464[Static221.method4259(Static23.method609(local55)) & 0xFFFF] | 0xFF000000;
		}
		return local68;
	}

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "()V")
	public static void method157() {
		aByteArray11 = new byte[anInt106 * anInt111];
		aByteArray8 = new byte[anInt106 * anInt111];
		aByteArray12 = new byte[anInt106 * anInt111];
		aShortArray5 = new short[anInt106 * anInt111];
		aByteArray9 = new byte[anInt106 * anInt111];
		aClass99_4 = new Class99(1024);
		aClass325ArrayArrayArray2 = new Class325[3][anInt106 >> 6][anInt111 >> 6];
		anIntArray9 = new int[aClass49_2.anInt1998 + 1];
	}

	@OriginalMember(owner = "client!kp", name = "e", descriptor = "()V")
	public static void method158() {
		@Pc(2) int[] local2 = new int[3];
		for (@Pc(4) int local4 = 0; local4 < aClass333_2.anInt9955; local4++) {
			@Pc(32) boolean local32 = aClass2_Sub6_Sub4_2.method2556(local2, aClass333_2.anIntArray646[local4] >> 14 & 0x3FFF, aClass333_2.anIntArray646[local4] & 0x3FFF, aClass333_2.anIntArray646[local4] >> 28 & 0x3);
			if (local32) {
				@Pc(42) Class2_Sub32 local42 = new Class2_Sub32(aClass333_2.anIntArray647[local4]);
				local42.anInt6572 = local2[1] - anInt110;
				local42.anInt6571 = local2[2] - anInt108;
				aClass341_2.method8528(local42);
			}
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!ha;IIII)Lclient!uh;")
	private static Class341 method159(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(4) Class2_Sub32 local4 = (Class2_Sub32) aClass341_2.method8524(); local4 != null; local4 = (Class2_Sub32) aClass341_2.method8519()) {
			method144(arg0, local4, arg1, arg2);
		}
		return aClass341_2;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!ha;IIII[S[B)V")
	private static void method160(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		if (arg5 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < arg5.length; local4++) {
			@Pc(14) Class161 local14 = aClass342_2.method8534(arg5[local4] & 0xFFFF);
			@Pc(17) int local17 = local14.anInt5364;
			if (local17 != -1) {
				@Pc(25) Class306 local25 = aClass237_2.method6466(local17);
				@Pc(49) Class46 local49 = local25.method7745(local14.aBoolean403 ? arg6[local4] >> 6 & 0x3 : 0, local14.aBoolean406 ? local14.aBoolean400 : false, arg0);
				if (local49 != null) {
					@Pc(58) int local58 = arg3 * local49.method6205() >> 2;
					@Pc(65) int local65 = arg4 * local49.method6219() >> 2;
					if (local25.aBoolean662) {
						@Pc(71) int local71 = local14.anInt5411;
						@Pc(74) int local74 = local14.anInt5389;
						if ((arg6[local4] >> 6 & 0x1) == 1) {
							@Pc(85) int local85 = local71;
							local71 = local74;
							local74 = local85;
						}
						local58 = local71 * arg3;
						local65 = local74 * arg4;
					}
					if (local58 != 0 && local65 != 0) {
						if (local25.anInt9257 == 0) {
							local49.method6212(arg1, arg2 + arg4 - local65, local58, local65);
						} else {
							local49.method6209(arg1, arg2 + arg4 - local65, local58, local65, 0, local25.anInt9257 | 0xFF000000, 1);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!d;II)V")
	public static void method161(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < aClass49_2.anInt1998; local1++) {
			anIntArray9[local1 + 1] = method156(arg0, local1, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(Lclient!ha;IIII)V")
	private static void method162(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = anInt109 - anInt114;
		@Pc(7) int local7 = anInt116 - anInt105;
		if (anInt109 < anInt106) {
			local3++;
		}
		if (anInt116 < anInt111) {
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
			local28 = (arg1 * local17 >> 16) + anInt113;
			local40 = (arg1 * (local17 + 1) >> 16) + anInt113;
			local44 = local40 - local28;
			if (local44 > 0) {
				local50 = anInt114 + local17;
				if (local50 >= 0 && local50 < anInt106) {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt112 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt112 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (local84 > 0) {
							local93 = local57 + anInt105;
							local173 = local50 + local93 * anInt106;
							local175 = 0;
							local177 = 0;
							local179 = 0;
							if (local93 >= 0 && local93 < anInt111) {
								local175 = (aByteArray10[local173] & 0xFF) << 16 | aShortArray6[local173] & 0xFFFF;
								if (local175 != 0) {
									local175 |= 0xFF000000;
								}
								local177 = aByteArray8[local173] & 0xFF;
								local179 = aShortArray5[local173] & 0xFFFF;
							}
							if (local175 == 0 && local177 == 0 && local179 == 0) {
								if (aClass2_Sub6_Sub4_2.anInt2715 != -1) {
									local175 = aClass2_Sub6_Sub4_2.anInt2715 | 0xFF000000;
								} else if ((local17 + anInt114 & 0x4) == (local57 + anInt116 & 0x4)) {
									local175 = anIntArray9[aClass49_2.anInt2009 + 1];
								} else {
									local175 = -11840664;
								}
								if (local175 == 0) {
									local175 = -16777216;
								}
								arg0.aa(local28, local70, local44, local84, local175, 0);
							} else if (local179 <= 0) {
								method152(arg0, local28, local70, local44, local84, local175, local177, aByteArray12[local173], null, null, true);
							} else if (local179 == 65535) {
								@Pc(282) Class2_Sub47 local282 = (Class2_Sub47) aClass99_4.method3056((long) (local50 << 16 | local93));
								if (local282 != null) {
									method152(arg0, local28, local70, local44, local84, local175, local177, aByteArray12[local173], local282.aShortArray129, local282.aByteArray122, true);
								}
							} else {
								aShortArray4[0] = (short) (local179 - 1);
								aByteArray7[0] = aByteArray9[local173];
								method152(arg0, local28, local70, local44, local84, local175, local177, aByteArray12[local173], aShortArray4, aByteArray7, true);
							}
						}
					}
				} else {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt112 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt112 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (aClass2_Sub6_Sub4_2.anInt2715 != -1) {
							local93 = aClass2_Sub6_Sub4_2.anInt2715 | 0xFF000000;
						} else if ((local17 + anInt114 & 0x4) == (local57 + anInt116 & 0x4)) {
							local93 = anIntArray9[aClass49_2.anInt2009 + 1];
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
			local40 = (arg1 * local28 >> 16) + anInt113;
			local44 = (arg1 * (local28 + 1) >> 16) + anInt113;
			local50 = local44 - local40;
			if (local50 > 0) {
				local57 = local28 + anInt114;
				if (local57 >= 0 && local57 < anInt106) {
					for (local70 = -16; local70 < local7 + 16; local70++) {
						local80 = anInt112 - (arg2 * (local70 + 1) >> 16);
						local84 = anInt112 - (arg2 * local70 >> 16);
						local93 = local84 - local80;
						if (local93 > 0) {
							local173 = local70 + anInt105;
							if (local173 >= 0 && local173 < anInt111) {
								local175 = aShortArray5[local57 + local173 * anInt106] & 0xFFFF;
								if (local175 <= 0) {
									method160(arg0, local40, local80, local50, local93, null, null);
								} else if (local175 == 65535) {
									@Pc(459) Class2_Sub47 local459 = (Class2_Sub47) aClass99_4.method3056((long) (local57 << 16 | local173));
									if (local459 != null) {
										method160(arg0, local40, local80, local50, local93, local459.aShortArray129, local459.aByteArray122);
									}
								} else {
									aShortArray4[0] = (short) (local175 - 1);
									aByteArray7[0] = aByteArray9[local57 + local173 * anInt106];
									method160(arg0, local40, local80, local50, local93, aShortArray4, aByteArray7);
								}
							}
						}
					}
				}
			}
		}
		local40 = anInt114 >> 6;
		local44 = anInt105 >> 6;
		if (local40 < 0) {
			local40 = 0;
		}
		if (local44 < 0) {
			local44 = 0;
		}
		local50 = anInt109 >> 6;
		local57 = anInt116 >> 6;
		if (local50 >= aClass325ArrayArrayArray2[0].length) {
			local50 = aClass325ArrayArrayArray2[0].length - 1;
		}
		if (local57 >= aClass325ArrayArrayArray2[0][0].length) {
			local57 = aClass325ArrayArrayArray2[0][0].length - 1;
		}
		for (local70 = 0; local70 < 3; local70++) {
			@Pc(641) int local641;
			@Pc(653) int local653;
			@Pc(665) int local665;
			@Pc(675) int local675;
			@Pc(631) int local631;
			for (local80 = local40; local80 <= local50; local80++) {
				for (local84 = local44; local84 <= local57; local84++) {
					@Pc(589) Class325 local589 = aClass325ArrayArrayArray2[local70][local80][local84];
					if (local589 != null) {
						local173 = (local80 + (anInt110 >> 6)) * 64;
						local175 = (local84 + (anInt108 >> 6)) * 64;
						for (@Pc(612) Class3_Sub8 local612 = (Class3_Sub8) local589.method8016(); local612 != null; local612 = (Class3_Sub8) local589.method8022()) {
							local179 = local173 + local612.aByte121 - anInt110 - anInt114;
							local631 = local175 + local612.aByte120 - anInt108 - anInt105;
							local641 = (arg1 * local179 >> 16) + anInt113;
							local653 = (arg1 * (local179 + 1) >> 16) + anInt113;
							local665 = anInt112 - (arg2 * (local631 + 1) >> 16);
							local675 = anInt112 - (arg2 * local631 >> 16);
							method152(arg0, local641, local665, local653 - local641, local675 - local665, local612.anInt9240, local612.aByte118 & 0xFF, local612.aByte119, local612.aShortArray128, local612.aByteArray120, false);
						}
					}
				}
			}
			for (local84 = local40; local84 <= local50; local84++) {
				for (local93 = local44; local93 <= local57; local93++) {
					@Pc(727) Class325 local727 = aClass325ArrayArrayArray2[local70][local84][local93];
					if (local727 != null) {
						local175 = (local84 + (anInt110 >> 6)) * 64;
						local177 = (local93 + (anInt108 >> 6)) * 64;
						for (@Pc(750) Class3_Sub8 local750 = (Class3_Sub8) local727.method8016(); local750 != null; local750 = (Class3_Sub8) local727.method8022()) {
							local631 = local175 + local750.aByte121 - anInt110 - anInt114;
							local641 = local177 + local750.aByte120 - anInt108 - anInt105;
							local653 = (arg1 * local631 >> 16) + anInt113;
							local665 = (arg1 * (local631 + 1) >> 16) + anInt113;
							local675 = anInt112 - (arg2 * (local641 + 1) >> 16);
							@Pc(813) int local813 = anInt112 - (arg2 * local641 >> 16);
							method160(arg0, local653, local675, local665 - local653, local813 - local675, local750.aShortArray128, local750.aByteArray120);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)Lclient!dfa;")
	public static Class2_Sub6_Sub4 method163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class2_Sub6_Sub4 local4 = (Class2_Sub6_Sub4) aClass99_3.method3060(); local4 != null; local4 = (Class2_Sub6_Sub4) aClass99_3.method3058()) {
			if (local4.aBoolean222 && local4.method2558(arg0, arg1)) {
				return local4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(II)Lclient!mn;")
	public static Class211 method164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class211 local3 = new Class211();
		for (@Pc(8) Class2_Sub6_Sub4 local8 = (Class2_Sub6_Sub4) aClass99_3.method3060(); local8 != null; local8 = (Class2_Sub6_Sub4) aClass99_3.method3058()) {
			if (local8.aBoolean222 && local8.method2558(arg0, arg1)) {
				local3.method6002(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "([B[B[SII)V")
	private static void method165(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int[] local2 = new int[anInt111];
		@Pc(5) int[] local5 = new int[anInt111];
		@Pc(8) int[] local8 = new int[anInt111];
		@Pc(11) int[] local11 = new int[anInt111];
		@Pc(14) int[] local14 = new int[anInt111];
		for (@Pc(16) int local16 = -5; local16 < anInt106; local16++) {
			@Pc(21) int local21 = local16 + 5;
			@Pc(25) int local25 = local16 - 5;
			@Pc(41) int local41;
			for (@Pc(27) int local27 = 0; local27 < anInt111; local27++) {
				@Pc(50) Class135 local50;
				@Pc(86) int local86;
				if (local21 < anInt106) {
					local41 = arg0[local21 + local27 * anInt106] & 0xFF;
					if (local41 > 0) {
						local50 = aClass275_2.method7104(local41 - 1);
						local2[local27] += local50.anInt4850;
						local5[local27] += local50.anInt4842;
						local8[local27] += local50.anInt4844;
						local11[local27] += local50.anInt4851;
						local86 = local14[local27]++;
					}
				}
				if (local25 >= 0) {
					local41 = arg0[local25 + local27 * anInt106] & 0xFF;
					if (local41 > 0) {
						local50 = aClass275_2.method7104(local41 - 1);
						local2[local27] -= local50.anInt4850;
						local5[local27] -= local50.anInt4842;
						local8[local27] -= local50.anInt4844;
						local11[local27] -= local50.anInt4851;
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
				for (@Pc(167) int local167 = -5; local167 < anInt111; local167++) {
					@Pc(172) int local172 = local167 + 5;
					if (local172 < anInt111) {
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
						if ((arg0[local16 + local167 * anInt106] & 0xFF) == 0) {
							local261 = local16 + local167 * anInt106;
							arg1[local261] = 0;
							arg2[local261] = 0;
						} else {
							local261 = local163 == 0 ? 0 : Static539.method8073(local161 / local165, local159 / local165, local41 * 256 / local163);
							@Pc(294) int local294 = (local261 & 0x7F) + arg4;
							if (local294 < 0) {
								local294 = 0;
							} else if (local294 > 127) {
								local294 = 127;
							}
							@Pc(316) int local316 = (local261 + arg3 & 0xFC00) + (local261 & 0x380) + local294;
							@Pc(322) int local322 = local16 + local167 * anInt106;
							@Pc(333) int local333 = Static373.anIntArray464[Static221.method4259(Static183.method3863(local316)) & 0xFFFF];
							arg1[local322] = (byte) (local333 >> 16 & 0xFF);
							arg2[local322] = (short) (local333 & 0xFFFF);
						}
					}
				}
			}
		}
	}
}
