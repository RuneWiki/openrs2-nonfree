import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "Lclient!lf;")
	private static Class201 aClass201_4;

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "Lclient!jk;")
	public static Class168 aClass168_4;

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "Lclient!ve;")
	public static Class348 aClass348_4;

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "Lclient!om;")
	public static Class246 aClass246_230;

	@OriginalMember(owner = "client!ks", name = "f", descriptor = "Lclient!sfa;")
	private static Class305 aClass305_6;

	@OriginalMember(owner = "client!ks", name = "g", descriptor = "Lclient!dv;")
	public static Class69 aClass69_4;

	@OriginalMember(owner = "client!ks", name = "h", descriptor = "Lclient!qs;")
	public static Interface21 anInterface21_2;

	@OriginalMember(owner = "client!ks", name = "i", descriptor = "Lclient!ai;")
	public static Class3_Sub3_Sub3 aClass3_Sub3_Sub3_3;

	@OriginalMember(owner = "client!ks", name = "l", descriptor = "F")
	public static float aFloat160;

	@OriginalMember(owner = "client!ks", name = "m", descriptor = "Lclient!ik;")
	public static Class149 aClass149_3;

	@OriginalMember(owner = "client!ks", name = "n", descriptor = "F")
	public static float aFloat161;

	@OriginalMember(owner = "client!ks", name = "p", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!ks", name = "s", descriptor = "I")
	public static int anInt7854;

	@OriginalMember(owner = "client!ks", name = "t", descriptor = "I")
	public static int anInt7855;

	@OriginalMember(owner = "client!ks", name = "u", descriptor = "I")
	public static int anInt7856;

	@OriginalMember(owner = "client!ks", name = "v", descriptor = "Lclient!sl;")
	private static Class310 aClass310_31;

	@OriginalMember(owner = "client!ks", name = "w", descriptor = "[S")
	private static short[] aShortArray254;

	@OriginalMember(owner = "client!ks", name = "x", descriptor = "[I")
	private static int[] anIntArray607;

	@OriginalMember(owner = "client!ks", name = "y", descriptor = "[B")
	private static byte[] aByteArray91;

	@OriginalMember(owner = "client!ks", name = "z", descriptor = "I")
	public static int anInt7857;

	@OriginalMember(owner = "client!ks", name = "A", descriptor = "[B")
	private static byte[] aByteArray92;

	@OriginalMember(owner = "client!ks", name = "B", descriptor = "[B")
	private static byte[] aByteArray93;

	@OriginalMember(owner = "client!ks", name = "C", descriptor = "[S")
	private static short[] aShortArray255;

	@OriginalMember(owner = "client!ks", name = "D", descriptor = "I")
	public static int anInt7858;

	@OriginalMember(owner = "client!ks", name = "E", descriptor = "[B")
	private static byte[] aByteArray94;

	@OriginalMember(owner = "client!ks", name = "F", descriptor = "I")
	public static int anInt7859;

	@OriginalMember(owner = "client!ks", name = "G", descriptor = "I")
	public static int anInt7860;

	@OriginalMember(owner = "client!ks", name = "H", descriptor = "[B")
	private static byte[] aByteArray95;

	@OriginalMember(owner = "client!ks", name = "I", descriptor = "I")
	public static int anInt7861;

	@OriginalMember(owner = "client!ks", name = "J", descriptor = "I")
	public static int anInt7862;

	@OriginalMember(owner = "client!ks", name = "K", descriptor = "I")
	public static int anInt7863;

	@OriginalMember(owner = "client!ks", name = "L", descriptor = "I")
	public static int anInt7864;

	@OriginalMember(owner = "client!ks", name = "M", descriptor = "[[[Lclient!sk;")
	private static Class309[][][] aClass309ArrayArrayArray2;

	@OriginalMember(owner = "client!ks", name = "O", descriptor = "I")
	public static int anInt7865;

	@OriginalMember(owner = "client!ks", name = "P", descriptor = "I")
	public static int anInt7866;

	@OriginalMember(owner = "client!ks", name = "e", descriptor = "Lclient!sl;")
	private static final Class310 aClass310_30 = new Class310(16);

	@OriginalMember(owner = "client!ks", name = "j", descriptor = "[S")
	private static final short[] aShortArray253 = new short[1];

	@OriginalMember(owner = "client!ks", name = "k", descriptor = "I")
	public static int anInt7852 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!ks", name = "o", descriptor = "I")
	public static int anInt7853 = (int) (Math.random() * 11.0D) - 5;

	@OriginalMember(owner = "client!ks", name = "q", descriptor = "[B")
	private static final byte[] aByteArray90 = new byte[1];

	@OriginalMember(owner = "client!ks", name = "r", descriptor = "Lclient!hga;")
	public static final Class130 aClass130_49 = new Class130();

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "()V")
	public static void method6624() {
		@Pc(2) int[] local2 = new int[3];
		for (@Pc(4) int local4 = 0; local4 < aClass149_3.anInt4386; local4++) {
			@Pc(32) boolean local32 = aClass3_Sub3_Sub3_3.method249(aClass149_3.anIntArray352[local4] >> 14 & 0x3FFF, aClass149_3.anIntArray352[local4] & 0x3FFF, local2, aClass149_3.anIntArray352[local4] >> 28 & 0x3);
			if (local32) {
				@Pc(42) Class3_Sub41 local42 = new Class3_Sub41(aClass149_3.anIntArray351[local4]);
				local42.anInt7165 = local2[1] - anInt7863;
				local42.anInt7161 = local2[2] - anInt7865;
				aClass130_49.method3548(local42);
			}
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(II)Lclient!ai;")
	public static Class3_Sub3_Sub3 method6625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class3_Sub3_Sub3 local4 = (Class3_Sub3_Sub3) aClass310_30.method6602(); local4 != null; local4 = (Class3_Sub3_Sub3) aClass310_30.method6599()) {
			if (local4.aBoolean21 && local4.method245(arg0, arg1)) {
				return local4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!r;IIIIIII[S[BZ)V")
	private static void method6626(@OriginalArg(0) Class43 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) boolean arg10) {
		@Pc(20) int local20;
		@Pc(32) int local32;
		if (arg10 || arg5 != 0 || arg6 > 0) {
			if (arg6 == 0) {
				arg0.J(arg1, arg2, arg3, arg4, arg5, 0);
			} else {
				local20 = arg7 & 0x3F;
				if (local20 == 0 || arg3 <= 1 || arg4 <= 1) {
					local32 = anIntArray607[arg6];
					if (arg10 || local32 != 0) {
						arg0.J(arg1, arg2, arg3, arg4, local32, 0);
					}
				} else {
					local32 = arg10 ? 0 : 1;
					Static446.method6258(aByteArrayArrayArray17, arg2, arg1, arg4, arg3, arg7 >> 6 & 0x3, arg5, anIntArray607[arg6], local20, local32, arg0, anInt7854);
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
				@Pc(127) Class23 local127 = aClass69_4.method2181(arg8[local100] & 0xFFFF);
				if (local127.anInt735 == -1) {
					@Pc(133) int local133 = -3355444;
					if (local127.anInt772 == 1) {
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

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)V")
	public static void method6627(@OriginalArg(0) int arg0) {
		aClass3_Sub3_Sub3_3 = (Class3_Sub3_Sub3) aClass310_30.method6601((long) arg0);
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "()V")
	public static void method6628() {
		aByteArray93 = null;
		aByteArray95 = null;
		aShortArray255 = null;
		aByteArray92 = null;
		aByteArray91 = null;
		aShortArray254 = null;
		aByteArray94 = null;
		aClass310_31 = null;
		aClass309ArrayArrayArray2 = null;
		anIntArray607 = null;
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(II)Lclient!cba;")
	public static Class38 method6629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class38 local3 = new Class38();
		for (@Pc(8) Class3_Sub3_Sub3 local8 = (Class3_Sub3_Sub3) aClass310_30.method6602(); local8 != null; local8 = (Class3_Sub3_Sub3) aClass310_30.method6599()) {
			if (local8.aBoolean21 && local8.method245(arg0, arg1)) {
				local3.method1069(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "()V")
	private static void method6630() {
		@Pc(4) int local4;
		@Pc(15) int local15;
		@Pc(49) int local49;
		for (@Pc(1) int local1 = 0; local1 < anInt7858; local1++) {
			for (local4 = 0; local4 < anInt7855; local4++) {
				local15 = aShortArray254[local1 + local4 * anInt7858] & 0xFFFF;
				if (local15 != 0) {
					@Pc(35) int local35;
					if (local15 == 65535) {
						@Pc(31) Class3_Sub31 local31 = (Class3_Sub31) aClass310_31.method6601((long) (local1 << 16 | local4));
						if (local31 != null) {
							for (local35 = 0; local35 < local31.aShortArray156.length; local35++) {
								@Pc(46) Class23 local46 = aClass69_4.method2181(local31.aShortArray156[local35] & 0xFFFF);
								local49 = local46.anInt776;
								if (local46.anIntArray78 != null) {
									local46 = local46.method587(anInterface21_2);
									if (local46 != null) {
										local49 = local46.anInt776;
									}
								}
								if (local49 != -1) {
									@Pc(70) Class3_Sub41 local70 = new Class3_Sub41(local49);
									local70.anInt7165 = local1;
									local70.anInt7161 = local4;
									aClass130_49.method3548(local70);
								}
							}
						}
					} else {
						@Pc(94) Class23 local94 = aClass69_4.method2181(local15 - 1);
						local35 = local94.anInt776;
						if (local94.anIntArray78 != null) {
							local94 = local94.method587(anInterface21_2);
							if (local94 != null) {
								local35 = local94.anInt776;
							}
						}
						if (local35 != -1) {
							@Pc(118) Class3_Sub41 local118 = new Class3_Sub41(local35);
							local118.anInt7165 = local1;
							local118.anInt7161 = local4;
							aClass130_49.method3548(local118);
						}
					}
				}
			}
		}
		for (local4 = 0; local4 < 3; local4++) {
			for (local15 = 0; local15 < aClass309ArrayArrayArray2[0].length; local15++) {
				for (@Pc(144) int local144 = 0; local144 < aClass309ArrayArrayArray2[0][0].length; local144++) {
					@Pc(153) Class309 local153 = aClass309ArrayArrayArray2[local4][local15][local144];
					if (local153 != null) {
						for (@Pc(160) Class9_Sub4 local160 = (Class9_Sub4) local153.method6590(); local160 != null; local160 = (Class9_Sub4) local153.method6594()) {
							if (local160.aShortArray75 != null) {
								for (local49 = 0; local49 < local160.aShortArray75.length; local49++) {
									@Pc(177) Class23 local177 = aClass69_4.method2181(local160.aShortArray75[local49] & 0xFFFF);
									@Pc(180) int local180 = local177.anInt776;
									if (local177.anIntArray78 != null) {
										local177 = local177.method587(anInterface21_2);
										if (local177 != null) {
											local180 = local177.anInt776;
										}
									}
									if (local180 != -1) {
										@Pc(201) Class3_Sub41 local201 = new Class3_Sub41(local180);
										local201.anInt7165 = (local15 + (anInt7863 >> 6)) * 64 + local160.aByte49 - anInt7863;
										local201.anInt7161 = (local144 + (anInt7865 >> 6)) * 64 + local160.aByte48 - anInt7865;
										aClass130_49.method3548(local201);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!r;II)V")
	public static void method6631(@OriginalArg(0) Class43 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class3_Sub11 local9 = new Class3_Sub11(aClass246_230.method5648(aClass3_Sub3_Sub3_3.aString8, "area"));
		@Pc(13) int local13 = local9.method3118();
		@Pc(16) int[] local16 = new int[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			local16[local18] = local9.method3118();
		}
		@Pc(33) int local33 = local9.method3118();
		@Pc(36) int[] local36 = new int[local33];
		for (@Pc(38) int local38 = 0; local38 < local33; local38++) {
			local36[local38] = local9.method3118();
		}
		while (true) {
			@Pc(58) int local58;
			@Pc(64) int local64;
			@Pc(67) int local67;
			@Pc(76) int local76;
			@Pc(148) int local148;
			while (local9.anInt3520 < local9.aByteArray36.length) {
				@Pc(62) int local62;
				@Pc(84) int local84;
				if (local9.method3118() == 0) {
					local58 = local9.method3118();
					local62 = local9.method3118();
					for (local64 = 0; local64 < 64; local64++) {
						for (local67 = 0; local67 < 64; local67++) {
							local76 = local58 * 64 + local64 - anInt7863;
							local84 = local62 * 64 + local67 - anInt7865;
							method6641(arg0, local9, local58, local62, local76, local84, local16, local36);
						}
					}
				} else {
					local58 = local9.method3118();
					local62 = local9.method3118();
					local64 = local9.method3118();
					local67 = local9.method3118();
					for (local76 = 0; local76 < 8; local76++) {
						for (local84 = 0; local84 < 8; local84++) {
							@Pc(136) int local136 = local58 * 64 + local64 * 8 + local76 - anInt7863;
							local148 = local62 * 64 + local67 * 8 + local84 - anInt7865;
							method6641(arg0, local9, local58, local62, local136, local148, local16, local36);
						}
					}
				}
			}
			aByteArray95 = new byte[anInt7858 * anInt7855];
			aShortArray255 = new short[anInt7858 * anInt7855];
			for (local58 = 0; local58 < 3; local58++) {
				@Pc(191) byte[] local191 = new byte[anInt7858 * anInt7855];
				for (local64 = 0; local64 < aClass309ArrayArrayArray2[local58].length; local64++) {
					for (local67 = 0; local67 < aClass309ArrayArrayArray2[local58][0].length; local67++) {
						@Pc(205) Class309 local205 = aClass309ArrayArrayArray2[local58][local64][local67];
						if (local205 != null) {
							for (@Pc(212) Class9_Sub4 local212 = (Class9_Sub4) local205.method6590(); local212 != null; local212 = (Class9_Sub4) local205.method6594()) {
								local191[local64 * 64 + local212.aByte49 + (local67 * 64 + local212.aByte48) * anInt7858] = (byte) local212.anInt3263;
							}
						}
					}
				}
				method6642(local191, aByteArray95, aShortArray255, arg1, arg2);
				for (local67 = 0; local67 < aClass309ArrayArrayArray2[local58].length; local67++) {
					for (local76 = 0; local76 < aClass309ArrayArrayArray2[local58][0].length; local76++) {
						@Pc(276) Class309 local276 = aClass309ArrayArrayArray2[local58][local67][local76];
						if (local276 != null) {
							for (@Pc(283) Class9_Sub4 local283 = (Class9_Sub4) local276.method6590(); local283 != null; local283 = (Class9_Sub4) local276.method6594()) {
								local148 = local67 * 64 + local283.aByte49 + (local76 * 64 + local283.aByte48) * anInt7858;
								local283.anInt3263 = (aByteArray95[local148] & 0xFF) << 16 | aShortArray255[local148] & 0xFFFF;
								if (local283.anInt3263 != 0) {
									local283.anInt3263 |= 0xFF000000;
								}
							}
						}
					}
				}
			}
			method6642(aByteArray93, aByteArray95, aShortArray255, arg1, arg2);
			aByteArray93 = null;
			method6630();
			return;
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!r;)Lclient!hga;")
	public static Class130 method6632(@OriginalArg(0) Class43 arg0) {
		@Pc(3) int local3 = anInt7860 - anInt7861;
		@Pc(7) int local7 = anInt7864 - anInt7856;
		@Pc(15) int local15 = (anInt7866 - anInt7857 << 16) / local3;
		@Pc(23) int local23 = (anInt7862 - anInt7859 << 16) / local7;
		return method6639(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!fa;II)V")
	public static void method6634(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < aClass305_6.anInt7782; local1++) {
			anIntArray607[local1 + 1] = method6640(arg0, local1, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!om;Lclient!sfa;Lclient!lf;Lclient!dv;Lclient!jk;Lclient!ve;Lclient!qs;)V")
	public static void method6635(@OriginalArg(0) Class246 arg0, @OriginalArg(1) Class305 arg1, @OriginalArg(2) Class201 arg2, @OriginalArg(3) Class69 arg3, @OriginalArg(4) Class168 arg4, @OriginalArg(5) Class348 arg5, @OriginalArg(6) Interface21 arg6) {
		aClass246_230 = arg0;
		aClass305_6 = arg1;
		aClass201_4 = arg2;
		aClass69_4 = arg3;
		aClass168_4 = arg4;
		aClass348_4 = arg5;
		anInterface21_2 = arg6;
		aClass310_30.method6605();
		@Pc(21) int local21 = aClass246_230.method5665("details");
		@Pc(26) int[] local26 = aClass246_230.method5668(local21);
		if (local26 != null) {
			for (@Pc(30) int local30 = 0; local30 < local26.length; local30++) {
				@Pc(39) Class3_Sub3_Sub3 local39 = Static92.method2053(local21, aClass246_230, local26[local30]);
				aClass310_30.method6603(local39, (long) local39.anInt241);
			}
		}
		Static497.method6706(true, false);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!r;Lclient!qj;IIII)V")
	private static void method6636(@OriginalArg(0) Class43 arg0, @OriginalArg(1) Class3_Sub41 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1.anInt7157 = anInt7857 + (arg2 * (arg1.anInt7165 - anInt7861) >> 16);
		arg1.anInt7158 = anInt7862 - (arg3 * (arg1.anInt7161 - anInt7856) >> 16);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!r;IIII)V")
	private static void method6637(@OriginalArg(0) Class43 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = anInt7860 - anInt7861;
		@Pc(7) int local7 = anInt7864 - anInt7856;
		if (anInt7860 < anInt7858) {
			local3++;
		}
		if (anInt7864 < anInt7855) {
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
			local28 = (arg1 * local17 >> 16) + anInt7857;
			local40 = (arg1 * (local17 + 1) >> 16) + anInt7857;
			local44 = local40 - local28;
			if (local44 > 0) {
				local50 = anInt7861 + local17;
				if (local50 >= 0 && local50 < anInt7858) {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt7862 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt7862 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (local84 > 0) {
							local93 = local57 + anInt7856;
							local173 = local50 + local93 * anInt7858;
							local175 = 0;
							local177 = 0;
							local179 = 0;
							if (local93 >= 0 && local93 < anInt7855) {
								local175 = (aByteArray95[local173] & 0xFF) << 16 | aShortArray255[local173] & 0xFFFF;
								if (local175 != 0) {
									local175 |= 0xFF000000;
								}
								local177 = aByteArray92[local173] & 0xFF;
								local179 = aShortArray254[local173] & 0xFFFF;
							}
							if (local175 == 0 && local177 == 0 && local179 == 0) {
								if (aClass3_Sub3_Sub3_3.anInt236 != -1) {
									local175 = aClass3_Sub3_Sub3_3.anInt236 | 0xFF000000;
								} else if ((local17 + anInt7861 & 0x4) == (local57 + anInt7864 & 0x4)) {
									local175 = anIntArray607[aClass305_6.anInt7787 + 1];
								} else {
									local175 = -11840664;
								}
								if (local175 == 0) {
									local175 = -16777216;
								}
								arg0.J(local28, local70, local44, local84, local175, 0);
							} else if (local179 <= 0) {
								method6626(arg0, local28, local70, local44, local84, local175, local177, aByteArray91[local173], null, null, true);
							} else if (local179 == 65535) {
								@Pc(282) Class3_Sub31 local282 = (Class3_Sub31) aClass310_31.method6601((long) (local50 << 16 | local93));
								if (local282 != null) {
									method6626(arg0, local28, local70, local44, local84, local175, local177, aByteArray91[local173], local282.aShortArray156, local282.aByteArray66, true);
								}
							} else {
								aShortArray253[0] = (short) (local179 - 1);
								aByteArray90[0] = aByteArray94[local173];
								method6626(arg0, local28, local70, local44, local84, local175, local177, aByteArray91[local173], aShortArray253, aByteArray90, true);
							}
						}
					}
				} else {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt7862 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt7862 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (aClass3_Sub3_Sub3_3.anInt236 != -1) {
							local93 = aClass3_Sub3_Sub3_3.anInt236 | 0xFF000000;
						} else if ((local17 + anInt7861 & 0x4) == (local57 + anInt7864 & 0x4)) {
							local93 = anIntArray607[aClass305_6.anInt7787 + 1];
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
			local40 = (arg1 * local28 >> 16) + anInt7857;
			local44 = (arg1 * (local28 + 1) >> 16) + anInt7857;
			local50 = local44 - local40;
			if (local50 > 0) {
				local57 = local28 + anInt7861;
				if (local57 >= 0 && local57 < anInt7858) {
					for (local70 = -16; local70 < local7 + 16; local70++) {
						local80 = anInt7862 - (arg2 * (local70 + 1) >> 16);
						local84 = anInt7862 - (arg2 * local70 >> 16);
						local93 = local84 - local80;
						if (local93 > 0) {
							local173 = local70 + anInt7856;
							if (local173 >= 0 && local173 < anInt7855) {
								local175 = aShortArray254[local57 + local173 * anInt7858] & 0xFFFF;
								if (local175 <= 0) {
									method6638(arg0, local40, local80, local50, local93, null, null);
								} else if (local175 == 65535) {
									@Pc(459) Class3_Sub31 local459 = (Class3_Sub31) aClass310_31.method6601((long) (local57 << 16 | local173));
									if (local459 != null) {
										method6638(arg0, local40, local80, local50, local93, local459.aShortArray156, local459.aByteArray66);
									}
								} else {
									aShortArray253[0] = (short) (local175 - 1);
									aByteArray90[0] = aByteArray94[local57 + local173 * anInt7858];
									method6638(arg0, local40, local80, local50, local93, aShortArray253, aByteArray90);
								}
							}
						}
					}
				}
			}
		}
		local40 = anInt7861 >> 6;
		local44 = anInt7856 >> 6;
		if (local40 < 0) {
			local40 = 0;
		}
		if (local44 < 0) {
			local44 = 0;
		}
		local50 = anInt7860 >> 6;
		local57 = anInt7864 >> 6;
		if (local50 >= aClass309ArrayArrayArray2[0].length) {
			local50 = aClass309ArrayArrayArray2[0].length - 1;
		}
		if (local57 >= aClass309ArrayArrayArray2[0][0].length) {
			local57 = aClass309ArrayArrayArray2[0][0].length - 1;
		}
		for (local70 = 0; local70 < 3; local70++) {
			@Pc(641) int local641;
			@Pc(653) int local653;
			@Pc(665) int local665;
			@Pc(675) int local675;
			@Pc(631) int local631;
			for (local80 = local40; local80 <= local50; local80++) {
				for (local84 = local44; local84 <= local57; local84++) {
					@Pc(589) Class309 local589 = aClass309ArrayArrayArray2[local70][local80][local84];
					if (local589 != null) {
						local173 = (local80 + (anInt7863 >> 6)) * 64;
						local175 = (local84 + (anInt7865 >> 6)) * 64;
						for (@Pc(612) Class9_Sub4 local612 = (Class9_Sub4) local589.method6590(); local612 != null; local612 = (Class9_Sub4) local589.method6594()) {
							local179 = local173 + local612.aByte49 - anInt7863 - anInt7861;
							local631 = local175 + local612.aByte48 - anInt7865 - anInt7856;
							local641 = (arg1 * local179 >> 16) + anInt7857;
							local653 = (arg1 * (local179 + 1) >> 16) + anInt7857;
							local665 = anInt7862 - (arg2 * (local631 + 1) >> 16);
							local675 = anInt7862 - (arg2 * local631 >> 16);
							method6626(arg0, local641, local665, local653 - local641, local675 - local665, local612.anInt3263, local612.aByte47 & 0xFF, local612.aByte46, local612.aShortArray75, local612.aByteArray34, false);
						}
					}
				}
			}
			for (local84 = local40; local84 <= local50; local84++) {
				for (local93 = local44; local93 <= local57; local93++) {
					@Pc(727) Class309 local727 = aClass309ArrayArrayArray2[local70][local84][local93];
					if (local727 != null) {
						local175 = (local84 + (anInt7863 >> 6)) * 64;
						local177 = (local93 + (anInt7865 >> 6)) * 64;
						for (@Pc(750) Class9_Sub4 local750 = (Class9_Sub4) local727.method6590(); local750 != null; local750 = (Class9_Sub4) local727.method6594()) {
							local631 = local175 + local750.aByte49 - anInt7863 - anInt7861;
							local641 = local177 + local750.aByte48 - anInt7865 - anInt7856;
							local653 = (arg1 * local631 >> 16) + anInt7857;
							local665 = (arg1 * (local631 + 1) >> 16) + anInt7857;
							local675 = anInt7862 - (arg2 * (local641 + 1) >> 16);
							@Pc(813) int local813 = anInt7862 - (arg2 * local641 >> 16);
							method6638(arg0, local653, local675, local665 - local653, local813 - local675, local750.aShortArray75, local750.aByteArray34);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!r;IIII[S[B)V")
	private static void method6638(@OriginalArg(0) Class43 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		if (arg5 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < arg5.length; local4++) {
			@Pc(14) Class23 local14 = aClass69_4.method2181(arg5[local4] & 0xFFFF);
			@Pc(17) int local17 = local14.anInt735;
			if (local17 != -1) {
				@Pc(25) Class113 local25 = aClass348_4.method7407(local17);
				@Pc(49) Class46 local49 = local25.method2914(arg0, local14.aBoolean68 ? local14.aBoolean61 : false, local14.aBoolean59 ? arg6[local4] >> 6 & 0x3 : 0);
				if (local49 != null) {
					@Pc(58) int local58 = arg3 * local49.A() >> 2;
					@Pc(65) int local65 = arg4 * local49.ca() >> 2;
					if (local25.aBoolean269) {
						@Pc(71) int local71 = local14.anInt739;
						@Pc(74) int local74 = local14.anInt744;
						if ((arg6[local4] >> 6 & 0x1) == 1) {
							@Pc(85) int local85 = local71;
							local71 = local74;
							local74 = local85;
						}
						local58 = local71 * arg3;
						local65 = local74 * arg4;
					}
					if (local58 != 0 && local65 != 0) {
						if (local25.anInt3297 == 0) {
							local49.method7616(arg1, arg2 + arg4 - local65, local58, local65);
						} else {
							local49.method7613(arg1, arg2 + arg4 - local65, local58, local65, 0, local25.anInt3297 | 0xFF000000, 1);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(Lclient!r;IIII)Lclient!hga;")
	private static Class130 method6639(@OriginalArg(0) Class43 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(4) Class3_Sub41 local4 = (Class3_Sub41) aClass130_49.method3543(); local4 != null; local4 = (Class3_Sub41) aClass130_49.method3551()) {
			method6636(arg0, local4, arg1, arg2);
		}
		return aClass130_49;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!fa;III)I")
	private static int method6640(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class83 local4 = aClass305_6.method6565(arg1);
		if (local4 == null) {
			return 0;
		}
		@Pc(11) int local11 = local4.anInt2794;
		if (local11 >= 0 && arg0.method6560(local11).aBoolean493) {
			local11 = -1;
		}
		@Pc(68) int local68;
		@Pc(27) int local27;
		@Pc(33) int local33;
		@Pc(55) int local55;
		if (local4.anInt2791 >= 0) {
			local27 = local4.anInt2791;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static563.anIntArray661[Static440.method3643(Static347.method5278(local55)) & 0xFFFF] | 0xFF000000;
		} else if (local11 >= 0) {
			local68 = Static563.anIntArray661[Static440.method3643(Static347.method5278(arg0.method6560(local11).aShort76)) & 0xFFFF] | 0xFF000000;
		} else if (local4.anInt2798 == -1) {
			local68 = 0;
		} else {
			local27 = local4.anInt2798;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static563.anIntArray661[Static440.method3643(Static347.method5278(local55)) & 0xFFFF] | 0xFF000000;
		}
		return local68;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!r;Lclient!qh;IIII[I[I)V")
	private static void method6641(@OriginalArg(0) Class43 arg0, @OriginalArg(1) Class3_Sub11 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		@Pc(3) int local3 = arg1.method3118();
		if ((local3 & 0x1) == 0) {
			@Pc(15) boolean local15 = (local3 & 0x2) == 0;
			@Pc(21) int local21 = local3 >> 2 & 0x3F;
			if (local21 != 62) {
				if (local21 == 63) {
					local21 = arg1.method3118();
				} else if (local15) {
					local21 = arg6[local21];
				} else {
					local21 = arg7[local21];
				}
				if (local15) {
					aByteArray93[arg4 + arg5 * anInt7858] = (byte) local21;
					aByteArray92[arg4 + arg5 * anInt7858] = 0;
				} else {
					aByteArray92[arg4 + arg5 * anInt7858] = (byte) local21;
					aByteArray91[arg4 + arg5 * anInt7858] = 0;
					aByteArray93[arg4 + arg5 * anInt7858] = arg1.method3096();
				}
			}
			return;
		}
		@Pc(100) int local100 = (local3 >> 1 & 0x3) + 1;
		@Pc(108) boolean local108 = (local3 & 0x8) != 0;
		@Pc(116) boolean local116 = (local3 & 0x10) != 0;
		for (@Pc(118) int local118 = 0; local118 < local100; local118++) {
			@Pc(123) int local123 = arg1.method3118();
			@Pc(125) int local125 = 0;
			@Pc(127) int local127 = 0;
			if (local108) {
				local125 = arg1.method3118();
				local127 = arg1.method3118();
			}
			@Pc(139) int local139 = 0;
			if (local116) {
				local139 = arg1.method3118();
			}
			@Pc(215) short[] local215;
			@Pc(218) byte[] local218;
			@Pc(220) int local220;
			if (local118 == 0) {
				aByteArray93[arg4 + arg5 * anInt7858] = (byte) local123;
				aByteArray92[arg4 + arg5 * anInt7858] = (byte) local125;
				aByteArray91[arg4 + arg5 * anInt7858] = (byte) local127;
				if (local139 == 1) {
					aShortArray254[arg4 + arg5 * anInt7858] = (short) (arg1.method3109() + 1);
					aByteArray94[arg4 + arg5 * anInt7858] = arg1.method3096();
				} else if (local139 > 1) {
					aShortArray254[arg4 + arg5 * anInt7858] = -1;
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method3109();
						local218[local220] = arg1.method3096();
					}
					aClass310_31.method6603(new Class3_Sub31(local215, local218), (long) (arg4 << 16 | arg5));
				}
			} else {
				local215 = null;
				local218 = null;
				if (local139 > 0) {
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method3109();
						local218[local220] = arg1.method3096();
					}
				}
				if (aClass309ArrayArrayArray2[local118 - 1][arg2 - (anInt7863 >> 6)][arg3 - (anInt7865 >> 6)] == null) {
					aClass309ArrayArrayArray2[local118 - 1][arg2 - (anInt7863 >> 6)][arg3 - (anInt7865 >> 6)] = new Class309();
				}
				@Pc(338) Class9_Sub4 local338 = new Class9_Sub4(arg4 & 0x3F, arg5 & 0x3F, local123, local125, local127, local215, local218);
				aClass309ArrayArrayArray2[local118 - 1][arg2 - (anInt7863 >> 6)][arg3 - (anInt7865 >> 6)].method6595(local338);
			}
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "([B[B[SII)V")
	private static void method6642(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int[] local2 = new int[anInt7855];
		@Pc(5) int[] local5 = new int[anInt7855];
		@Pc(8) int[] local8 = new int[anInt7855];
		@Pc(11) int[] local11 = new int[anInt7855];
		@Pc(14) int[] local14 = new int[anInt7855];
		for (@Pc(16) int local16 = -5; local16 < anInt7858; local16++) {
			@Pc(21) int local21 = local16 + 5;
			@Pc(25) int local25 = local16 - 5;
			@Pc(41) int local41;
			for (@Pc(27) int local27 = 0; local27 < anInt7855; local27++) {
				@Pc(50) Class183 local50;
				@Pc(86) int local86;
				if (local21 < anInt7858) {
					local41 = arg0[local21 + local27 * anInt7858] & 0xFF;
					if (local41 > 0) {
						local50 = aClass201_4.method4715(local41 - 1);
						local2[local27] += local50.anInt5062;
						local5[local27] += local50.anInt5053;
						local8[local27] += local50.anInt5051;
						local11[local27] += local50.anInt5056;
						local86 = local14[local27]++;
					}
				}
				if (local25 >= 0) {
					local41 = arg0[local25 + local27 * anInt7858] & 0xFF;
					if (local41 > 0) {
						local50 = aClass201_4.method4715(local41 - 1);
						local2[local27] -= local50.anInt5062;
						local5[local27] -= local50.anInt5053;
						local8[local27] -= local50.anInt5051;
						local11[local27] -= local50.anInt5056;
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
				for (@Pc(167) int local167 = -5; local167 < anInt7855; local167++) {
					@Pc(172) int local172 = local167 + 5;
					if (local172 < anInt7855) {
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
						if ((arg0[local16 + local167 * anInt7858] & 0xFF) == 0) {
							local261 = local16 + local167 * anInt7858;
							arg1[local261] = 0;
							arg2[local261] = 0;
						} else {
							local261 = local163 == 0 ? 0 : Static146.method2756(local41 * 256 / local163, local161 / local165, local159 / local165);
							@Pc(294) int local294 = (local261 & 0x7F) + arg4;
							if (local294 < 0) {
								local294 = 0;
							} else if (local294 > 127) {
								local294 = 127;
							}
							@Pc(316) int local316 = (local261 + arg3 & 0xFC00) + (local261 & 0x380) + local294;
							@Pc(322) int local322 = local16 + local167 * anInt7858;
							@Pc(333) int local333 = Static563.anIntArray661[Static440.method3643(Static333.method5133(local316)) & 0xFFFF];
							arg1[local322] = (byte) (local333 >> 16 & 0xFF);
							arg2[local322] = (short) (local333 & 0xFFFF);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ks", name = "e", descriptor = "()V")
	public static void method6643() {
		aByteArray93 = new byte[anInt7858 * anInt7855];
		aByteArray92 = new byte[anInt7858 * anInt7855];
		aByteArray91 = new byte[anInt7858 * anInt7855];
		aShortArray254 = new short[anInt7858 * anInt7855];
		aByteArray94 = new byte[anInt7858 * anInt7855];
		aClass310_31 = new Class310(1024);
		aClass309ArrayArrayArray2 = new Class309[3][anInt7858 >> 6][anInt7855 >> 6];
		anIntArray607 = new int[aClass305_6.anInt7782 + 1];
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(Lclient!r;)V")
	public static void method6644(@OriginalArg(0) Class43 arg0) {
		@Pc(3) int local3 = anInt7860 - anInt7861;
		@Pc(7) int local7 = anInt7864 - anInt7856;
		@Pc(15) int local15 = (anInt7866 - anInt7857 << 16) / local3;
		@Pc(23) int local23 = (anInt7862 - anInt7859 << 16) / local7;
		method6637(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIIIIIII)V")
	public static void method6645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt7861 = arg0 - anInt7863;
		anInt7864 = arg1 - anInt7865;
		anInt7860 = arg2 - anInt7863;
		anInt7856 = arg3 - anInt7865;
		anInt7857 = arg4;
		anInt7859 = arg5;
		anInt7866 = arg6;
		anInt7862 = arg7;
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)Lclient!ai;")
	public static Class3_Sub3_Sub3 method6646(@OriginalArg(0) int arg0) {
		return (Class3_Sub3_Sub3) aClass310_30.method6601((long) arg0);
	}
}
