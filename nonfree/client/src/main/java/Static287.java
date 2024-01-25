import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "Lclient!gq;")
	public static Class122 aClass122_2;

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "Lclient!sea;")
	public static Class308 aClass308_84;

	@OriginalMember(owner = "client!lba", name = "c", descriptor = "Lclient!fb;")
	private static Class92 aClass92_2;

	@OriginalMember(owner = "client!lba", name = "d", descriptor = "Lclient!bt;")
	public static Class33 aClass33_4;

	@OriginalMember(owner = "client!lba", name = "e", descriptor = "Lclient!nf;")
	public static Interface17 anInterface17_2;

	@OriginalMember(owner = "client!lba", name = "f", descriptor = "Lclient!qea;")
	public static Class1_Sub8_Sub11 aClass1_Sub8_Sub11_2;

	@OriginalMember(owner = "client!lba", name = "g", descriptor = "Lclient!ew;")
	private static Class90 aClass90_3;

	@OriginalMember(owner = "client!lba", name = "h", descriptor = "Lclient!ge;")
	public static Class113 aClass113_3;

	@OriginalMember(owner = "client!lba", name = "j", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!lba", name = "m", descriptor = "I")
	public static int anInt3850;

	@OriginalMember(owner = "client!lba", name = "q", descriptor = "F")
	public static float aFloat105;

	@OriginalMember(owner = "client!lba", name = "r", descriptor = "F")
	public static float aFloat106;

	@OriginalMember(owner = "client!lba", name = "s", descriptor = "Lclient!pga;")
	public static Class267 aClass267_3;

	@OriginalMember(owner = "client!lba", name = "t", descriptor = "I")
	public static int anInt3853;

	@OriginalMember(owner = "client!lba", name = "u", descriptor = "I")
	public static int anInt3854;

	@OriginalMember(owner = "client!lba", name = "v", descriptor = "Lclient!faa;")
	private static Class91 aClass91_12;

	@OriginalMember(owner = "client!lba", name = "w", descriptor = "I")
	public static int anInt3855;

	@OriginalMember(owner = "client!lba", name = "x", descriptor = "I")
	public static int anInt3856;

	@OriginalMember(owner = "client!lba", name = "y", descriptor = "I")
	public static int anInt3857;

	@OriginalMember(owner = "client!lba", name = "z", descriptor = "I")
	public static int anInt3858;

	@OriginalMember(owner = "client!lba", name = "A", descriptor = "[B")
	private static byte[] aByteArray27;

	@OriginalMember(owner = "client!lba", name = "B", descriptor = "[S")
	private static short[] aShortArray34;

	@OriginalMember(owner = "client!lba", name = "C", descriptor = "[I")
	private static int[] anIntArray189;

	@OriginalMember(owner = "client!lba", name = "D", descriptor = "I")
	public static int anInt3859;

	@OriginalMember(owner = "client!lba", name = "E", descriptor = "[B")
	private static byte[] aByteArray28;

	@OriginalMember(owner = "client!lba", name = "F", descriptor = "[B")
	private static byte[] aByteArray29;

	@OriginalMember(owner = "client!lba", name = "G", descriptor = "[S")
	private static short[] aShortArray35;

	@OriginalMember(owner = "client!lba", name = "H", descriptor = "[B")
	private static byte[] aByteArray30;

	@OriginalMember(owner = "client!lba", name = "I", descriptor = "I")
	public static int anInt3860;

	@OriginalMember(owner = "client!lba", name = "J", descriptor = "I")
	public static int anInt3861;

	@OriginalMember(owner = "client!lba", name = "K", descriptor = "[B")
	private static byte[] aByteArray31;

	@OriginalMember(owner = "client!lba", name = "L", descriptor = "[[[Lclient!kr;")
	private static Class196[][][] aClass196ArrayArrayArray2;

	@OriginalMember(owner = "client!lba", name = "M", descriptor = "I")
	public static int anInt3862;

	@OriginalMember(owner = "client!lba", name = "N", descriptor = "I")
	public static int anInt3863;

	@OriginalMember(owner = "client!lba", name = "O", descriptor = "I")
	public static int anInt3864;

	@OriginalMember(owner = "client!lba", name = "i", descriptor = "Lclient!faa;")
	private static final Class91 aClass91_11 = new Class91(16);

	@OriginalMember(owner = "client!lba", name = "k", descriptor = "[S")
	private static final short[] aShortArray33 = new short[1];

	@OriginalMember(owner = "client!lba", name = "l", descriptor = "Lclient!gca;")
	public static final Class111 aClass111_18 = new Class111();

	@OriginalMember(owner = "client!lba", name = "n", descriptor = "I")
	public static int anInt3851 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!lba", name = "o", descriptor = "I")
	public static int anInt3852 = (int) (Math.random() * 11.0D) - 5;

	@OriginalMember(owner = "client!lba", name = "p", descriptor = "[B")
	private static final byte[] aByteArray26 = new byte[1];

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "()V")
	private static void method3140() {
		@Pc(4) int local4;
		@Pc(15) int local15;
		@Pc(49) int local49;
		for (@Pc(1) int local1 = 0; local1 < anInt3861; local1++) {
			for (local4 = 0; local4 < anInt3863; local4++) {
				local15 = aShortArray34[local1 + local4 * anInt3861] & 0xFFFF;
				if (local15 != 0) {
					@Pc(35) int local35;
					if (local15 == 65535) {
						@Pc(31) Class1_Sub14 local31 = (Class1_Sub14) aClass91_12.method2271((long) (local1 << 16 | local4));
						if (local31 != null) {
							for (local35 = 0; local35 < local31.aShortArray9.length; local35++) {
								@Pc(46) Class178 local46 = aClass122_2.method2770(local31.aShortArray9[local35] & 0xFFFF);
								local49 = local46.anInt4646;
								if (local46.anIntArray252 != null) {
									local46 = local46.method3713(anInterface17_2);
									if (local46 != null) {
										local49 = local46.anInt4646;
									}
								}
								if (local49 != -1) {
									@Pc(70) Class1_Sub51 local70 = new Class1_Sub51(local49);
									local70.anInt9680 = local1;
									local70.anInt9679 = local4;
									aClass111_18.method2552(local70);
								}
							}
						}
					} else {
						@Pc(94) Class178 local94 = aClass122_2.method2770(local15 - 1);
						local35 = local94.anInt4646;
						if (local94.anIntArray252 != null) {
							local94 = local94.method3713(anInterface17_2);
							if (local94 != null) {
								local35 = local94.anInt4646;
							}
						}
						if (local35 != -1) {
							@Pc(118) Class1_Sub51 local118 = new Class1_Sub51(local35);
							local118.anInt9680 = local1;
							local118.anInt9679 = local4;
							aClass111_18.method2552(local118);
						}
					}
				}
			}
		}
		for (local4 = 0; local4 < 3; local4++) {
			for (local15 = 0; local15 < aClass196ArrayArrayArray2[0].length; local15++) {
				for (@Pc(144) int local144 = 0; local144 < aClass196ArrayArrayArray2[0][0].length; local144++) {
					@Pc(153) Class196 local153 = aClass196ArrayArrayArray2[local4][local15][local144];
					if (local153 != null) {
						for (@Pc(160) Class11_Sub10 local160 = (Class11_Sub10) local153.method4024(); local160 != null; local160 = (Class11_Sub10) local153.method4028()) {
							if (local160.aShortArray90 != null) {
								for (local49 = 0; local49 < local160.aShortArray90.length; local49++) {
									@Pc(177) Class178 local177 = aClass122_2.method2770(local160.aShortArray90[local49] & 0xFFFF);
									@Pc(180) int local180 = local177.anInt4646;
									if (local177.anIntArray252 != null) {
										local177 = local177.method3713(anInterface17_2);
										if (local177 != null) {
											local180 = local177.anInt4646;
										}
									}
									if (local180 != -1) {
										@Pc(201) Class1_Sub51 local201 = new Class1_Sub51(local180);
										local201.anInt9680 = (local15 + (anInt3859 >> 6)) * 64 + local160.aByte98 - anInt3859;
										local201.anInt9679 = (local144 + (anInt3862 >> 6)) * 64 + local160.aByte97 - anInt3862;
										aClass111_18.method2552(local201);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "()V")
	public static void method3141() {
		aByteArray31 = new byte[anInt3861 * anInt3863];
		aByteArray29 = new byte[anInt3861 * anInt3863];
		aByteArray30 = new byte[anInt3861 * anInt3863];
		aShortArray34 = new short[anInt3861 * anInt3863];
		aByteArray27 = new byte[anInt3861 * anInt3863];
		aClass91_12 = new Class91(1024);
		aClass196ArrayArrayArray2 = new Class196[3][anInt3861 >> 6][anInt3863 >> 6];
		anIntArray189 = new int[aClass90_3.anInt2568 + 1];
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt3853 = arg0 - anInt3859;
		anInt3857 = arg1 - anInt3862;
		anInt3860 = arg2 - anInt3859;
		anInt3856 = arg3 - anInt3862;
		anInt3855 = arg4;
		anInt3858 = arg5;
		anInt3854 = arg6;
		anInt3864 = arg7;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(II)Lclient!qea;")
	public static Class1_Sub8_Sub11 method3143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class1_Sub8_Sub11 local4 = (Class1_Sub8_Sub11) aClass91_11.method2278(); local4 != null; local4 = (Class1_Sub8_Sub11) aClass91_11.method2276()) {
			if (local4.aBoolean572 && local4.method5980(arg1, arg0)) {
				return local4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(I)V")
	public static void method3144(@OriginalArg(0) int arg0) {
		aClass1_Sub8_Sub11_2 = (Class1_Sub8_Sub11) aClass91_11.method2271((long) arg0);
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "([B[B[SII)V")
	private static void method3145(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int[] local2 = new int[anInt3863];
		@Pc(5) int[] local5 = new int[anInt3863];
		@Pc(8) int[] local8 = new int[anInt3863];
		@Pc(11) int[] local11 = new int[anInt3863];
		@Pc(14) int[] local14 = new int[anInt3863];
		for (@Pc(16) int local16 = -5; local16 < anInt3861; local16++) {
			@Pc(21) int local21 = local16 + 5;
			@Pc(25) int local25 = local16 - 5;
			@Pc(41) int local41;
			for (@Pc(27) int local27 = 0; local27 < anInt3863; local27++) {
				@Pc(50) Class157 local50;
				@Pc(86) int local86;
				if (local21 < anInt3861) {
					local41 = arg0[local21 + local27 * anInt3861] & 0xFF;
					if (local41 > 0) {
						local50 = aClass92_2.method2279(local41 - 1);
						local2[local27] += local50.anInt4111;
						local5[local27] += local50.anInt4100;
						local8[local27] += local50.anInt4104;
						local11[local27] += local50.anInt4105;
						local86 = local14[local27]++;
					}
				}
				if (local25 >= 0) {
					local41 = arg0[local25 + local27 * anInt3861] & 0xFF;
					if (local41 > 0) {
						local50 = aClass92_2.method2279(local41 - 1);
						local2[local27] -= local50.anInt4111;
						local5[local27] -= local50.anInt4100;
						local8[local27] -= local50.anInt4104;
						local11[local27] -= local50.anInt4105;
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
				for (@Pc(167) int local167 = -5; local167 < anInt3863; local167++) {
					@Pc(172) int local172 = local167 + 5;
					if (local172 < anInt3863) {
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
						if ((arg0[local16 + local167 * anInt3861] & 0xFF) == 0) {
							local261 = local16 + local167 * anInt3861;
							arg1[local261] = 0;
							arg2[local261] = 0;
						} else {
							local261 = local163 == 0 ? 0 : Static309.method4631(local41 * 256 / local163, local161 / local165, local159 / local165);
							@Pc(294) int local294 = (local261 & 0x7F) + arg4;
							if (local294 < 0) {
								local294 = 0;
							} else if (local294 > 127) {
								local294 = 127;
							}
							@Pc(316) int local316 = (local261 + arg3 & 0xFC00) + (local261 & 0x380) + local294;
							@Pc(322) int local322 = local16 + local167 * anInt3861;
							@Pc(333) int local333 = Static281.anIntArray289[Static469.method6496(Static140.method2405(local316)) & 0xFFFF];
							arg1[local322] = (byte) (local333 >> 16 & 0xFF);
							arg2[local322] = (short) (local333 & 0xFFFF);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lclient!fa;III)I")
	private static int method3146(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class193 local4 = aClass90_3.method2262(arg1);
		if (local4 == null) {
			return 0;
		}
		@Pc(11) int local11 = local4.anInt5019;
		if (local11 >= 0 && arg0.method947(local11).aBoolean32) {
			local11 = -1;
		}
		@Pc(68) int local68;
		@Pc(27) int local27;
		@Pc(33) int local33;
		@Pc(55) int local55;
		if (local4.anInt5032 >= 0) {
			local27 = local4.anInt5032;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static281.anIntArray289[Static469.method6496(Static430.method6142(local55)) & 0xFFFF] | 0xFF000000;
		} else if (local11 >= 0) {
			local68 = Static281.anIntArray289[Static469.method6496(Static430.method6142(arg0.method947(local11).aShort19)) & 0xFFFF] | 0xFF000000;
		} else if (local4.anInt5023 == -1) {
			local68 = 0;
		} else {
			local27 = local4.anInt5023;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static281.anIntArray289[Static469.method6496(Static430.method6142(local55)) & 0xFFFF] | 0xFF000000;
		}
		return local68;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lclient!r;IIII)Lclient!gca;")
	private static Class111 method3147(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(4) Class1_Sub51 local4 = (Class1_Sub51) aClass111_18.method2547(); local4 != null; local4 = (Class1_Sub51) aClass111_18.method2554()) {
			method3161(arg0, local4, arg1, arg2);
		}
		return aClass111_18;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lclient!r;)V")
	public static void method3149(@OriginalArg(0) Class78 arg0) {
		@Pc(3) int local3 = anInt3860 - anInt3853;
		@Pc(7) int local7 = anInt3857 - anInt3856;
		@Pc(15) int local15 = (anInt3854 - anInt3855 << 16) / local3;
		@Pc(23) int local23 = (anInt3864 - anInt3858 << 16) / local7;
		method3158(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!lba", name = "d", descriptor = "()V")
	public static void method3150() {
		@Pc(2) int[] local2 = new int[3];
		for (@Pc(4) int local4 = 0; local4 < aClass267_3.anInt7184; local4++) {
			@Pc(32) boolean local32 = aClass1_Sub8_Sub11_2.method5981(aClass267_3.anIntArray424[local4] & 0x3FFF, aClass267_3.anIntArray424[local4] >> 28 & 0x3, local2, aClass267_3.anIntArray424[local4] >> 14 & 0x3FFF);
			if (local32) {
				@Pc(42) Class1_Sub51 local42 = new Class1_Sub51(aClass267_3.anIntArray425[local4]);
				local42.anInt9680 = local2[1] - anInt3859;
				local42.anInt9679 = local2[2] - anInt3862;
				aClass111_18.method2552(local42);
			}
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lclient!fa;II)V")
	public static void method3151(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < aClass90_3.anInt2568; local1++) {
			anIntArray189[local1 + 1] = method3146(arg0, local1, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lclient!r;IIIIIII[S[BZ)V")
	private static void method3152(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) boolean arg10) {
		@Pc(20) int local20;
		@Pc(32) int local32;
		if (arg10 || arg5 != 0 || arg6 > 0) {
			if (arg6 == 0) {
				arg0.J(arg1, arg2, arg3, arg4, arg5, 0);
			} else {
				local20 = arg7 & 0x3F;
				if (local20 == 0 || arg3 <= 1 || arg4 <= 1) {
					local32 = anIntArray189[arg6];
					if (arg10 || local32 != 0) {
						arg0.J(arg1, arg2, arg3, arg4, local32, 0);
					}
				} else {
					local32 = arg10 ? 0 : 1;
					Static118.method2141(arg4, arg2, anInt3850, local32, local20, arg1, anIntArray189[arg6], arg5, arg3, arg0, aByteArrayArrayArray3, arg7 >> 6 & 0x3);
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
				@Pc(127) Class178 local127 = aClass122_2.method2770(arg8[local100] & 0xFFFF);
				if (local127.anInt4633 == -1) {
					@Pc(133) int local133 = -3355444;
					if (local127.anInt4662 == 1) {
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

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lclient!r;IIII[S[B)V")
	private static void method3153(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		if (arg5 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < arg5.length; local4++) {
			@Pc(14) Class178 local14 = aClass122_2.method2770(arg5[local4] & 0xFFFF);
			@Pc(17) int local17 = local14.anInt4633;
			if (local17 != -1) {
				@Pc(25) Class40 local25 = aClass33_4.method794(local17);
				@Pc(49) Class5 local49 = local25.method1002(local14.aBoolean349 ? arg6[local4] >> 6 & 0x3 : 0, arg0, local14.aBoolean345 ? local14.aBoolean347 : false);
				if (local49 != null) {
					@Pc(58) int local58 = arg3 * local49.A() >> 2;
					@Pc(65) int local65 = arg4 * local49.ca() >> 2;
					if (local25.aBoolean57) {
						@Pc(71) int local71 = local14.anInt4627;
						@Pc(74) int local74 = local14.anInt4634;
						if ((arg6[local4] >> 6 & 0x1) == 1) {
							@Pc(85) int local85 = local71;
							local71 = local74;
							local74 = local85;
						}
						local58 = local71 * arg3;
						local65 = local74 * arg4;
					}
					if (local58 != 0 && local65 != 0) {
						if (local25.anInt1135 == 0) {
							local49.method7801(arg1, arg2 + arg4 - local65, local58, local65);
						} else {
							local49.method7804(arg1, arg2 + arg4 - local65, local58, local65, 0, local25.anInt1135 | 0xFF000000, 1);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lba", name = "e", descriptor = "()V")
	public static void method3154() {
		aByteArray31 = null;
		aByteArray28 = null;
		aShortArray35 = null;
		aByteArray29 = null;
		aByteArray30 = null;
		aShortArray34 = null;
		aByteArray27 = null;
		aClass91_12 = null;
		aClass196ArrayArrayArray2 = null;
		anIntArray189 = null;
	}

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "(Lclient!r;)Lclient!gca;")
	public static Class111 method3155(@OriginalArg(0) Class78 arg0) {
		@Pc(3) int local3 = anInt3860 - anInt3853;
		@Pc(7) int local7 = anInt3857 - anInt3856;
		@Pc(15) int local15 = (anInt3854 - anInt3855 << 16) / local3;
		@Pc(23) int local23 = (anInt3864 - anInt3858 << 16) / local7;
		return method3147(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lclient!r;Lclient!ac;IIII[I[I)V")
	private static void method3156(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class1_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		@Pc(3) int local3 = arg1.method7974();
		if ((local3 & 0x1) == 0) {
			@Pc(15) boolean local15 = (local3 & 0x2) == 0;
			@Pc(21) int local21 = local3 >> 2 & 0x3F;
			if (local21 != 62) {
				if (local21 == 63) {
					local21 = arg1.method7974();
				} else if (local15) {
					local21 = arg6[local21];
				} else {
					local21 = arg7[local21];
				}
				if (local15) {
					aByteArray31[arg4 + arg5 * anInt3861] = (byte) local21;
					aByteArray29[arg4 + arg5 * anInt3861] = 0;
				} else {
					aByteArray29[arg4 + arg5 * anInt3861] = (byte) local21;
					aByteArray30[arg4 + arg5 * anInt3861] = 0;
					aByteArray31[arg4 + arg5 * anInt3861] = arg1.method7963();
				}
			}
			return;
		}
		@Pc(100) int local100 = (local3 >> 1 & 0x3) + 1;
		@Pc(108) boolean local108 = (local3 & 0x8) != 0;
		@Pc(116) boolean local116 = (local3 & 0x10) != 0;
		for (@Pc(118) int local118 = 0; local118 < local100; local118++) {
			@Pc(123) int local123 = arg1.method7974();
			@Pc(125) int local125 = 0;
			@Pc(127) int local127 = 0;
			if (local108) {
				local125 = arg1.method7974();
				local127 = arg1.method7974();
			}
			@Pc(139) int local139 = 0;
			if (local116) {
				local139 = arg1.method7974();
			}
			@Pc(215) short[] local215;
			@Pc(218) byte[] local218;
			@Pc(220) int local220;
			if (local118 == 0) {
				aByteArray31[arg4 + arg5 * anInt3861] = (byte) local123;
				aByteArray29[arg4 + arg5 * anInt3861] = (byte) local125;
				aByteArray30[arg4 + arg5 * anInt3861] = (byte) local127;
				if (local139 == 1) {
					aShortArray34[arg4 + arg5 * anInt3861] = (short) (arg1.method7945() + 1);
					aByteArray27[arg4 + arg5 * anInt3861] = arg1.method7963();
				} else if (local139 > 1) {
					aShortArray34[arg4 + arg5 * anInt3861] = -1;
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method7945();
						local218[local220] = arg1.method7963();
					}
					aClass91_12.method2269((long) (arg4 << 16 | arg5), new Class1_Sub14(local215, local218));
				}
			} else {
				local215 = null;
				local218 = null;
				if (local139 > 0) {
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method7945();
						local218[local220] = arg1.method7963();
					}
				}
				if (aClass196ArrayArrayArray2[local118 - 1][arg2 - (anInt3859 >> 6)][arg3 - (anInt3862 >> 6)] == null) {
					aClass196ArrayArrayArray2[local118 - 1][arg2 - (anInt3859 >> 6)][arg3 - (anInt3862 >> 6)] = new Class196();
				}
				@Pc(338) Class11_Sub10 local338 = new Class11_Sub10(arg4 & 0x3F, arg5 & 0x3F, local123, local125, local127, local215, local218);
				aClass196ArrayArrayArray2[local118 - 1][arg2 - (anInt3859 >> 6)][arg3 - (anInt3862 >> 6)].method4032(local338);
			}
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lclient!r;II)V")
	public static void method3157(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class1_Sub3 local9 = new Class1_Sub3(aClass308_84.method6557("area", aClass1_Sub8_Sub11_2.aString84));
		@Pc(13) int local13 = local9.method7974();
		@Pc(16) int[] local16 = new int[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			local16[local18] = local9.method7974();
		}
		@Pc(33) int local33 = local9.method7974();
		@Pc(36) int[] local36 = new int[local33];
		for (@Pc(38) int local38 = 0; local38 < local33; local38++) {
			local36[local38] = local9.method7974();
		}
		while (true) {
			@Pc(58) int local58;
			@Pc(64) int local64;
			@Pc(67) int local67;
			@Pc(76) int local76;
			@Pc(148) int local148;
			while (local9.anInt9802 < local9.aByteArray104.length) {
				@Pc(62) int local62;
				@Pc(84) int local84;
				if (local9.method7974() == 0) {
					local58 = local9.method7974();
					local62 = local9.method7974();
					for (local64 = 0; local64 < 64; local64++) {
						for (local67 = 0; local67 < 64; local67++) {
							local76 = local58 * 64 + local64 - anInt3859;
							local84 = local62 * 64 + local67 - anInt3862;
							method3156(arg0, local9, local58, local62, local76, local84, local16, local36);
						}
					}
				} else {
					local58 = local9.method7974();
					local62 = local9.method7974();
					local64 = local9.method7974();
					local67 = local9.method7974();
					for (local76 = 0; local76 < 8; local76++) {
						for (local84 = 0; local84 < 8; local84++) {
							@Pc(136) int local136 = local58 * 64 + local64 * 8 + local76 - anInt3859;
							local148 = local62 * 64 + local67 * 8 + local84 - anInt3862;
							method3156(arg0, local9, local58, local62, local136, local148, local16, local36);
						}
					}
				}
			}
			aByteArray28 = new byte[anInt3861 * anInt3863];
			aShortArray35 = new short[anInt3861 * anInt3863];
			for (local58 = 0; local58 < 3; local58++) {
				@Pc(191) byte[] local191 = new byte[anInt3861 * anInt3863];
				for (local64 = 0; local64 < aClass196ArrayArrayArray2[local58].length; local64++) {
					for (local67 = 0; local67 < aClass196ArrayArrayArray2[local58][0].length; local67++) {
						@Pc(205) Class196 local205 = aClass196ArrayArrayArray2[local58][local64][local67];
						if (local205 != null) {
							for (@Pc(212) Class11_Sub10 local212 = (Class11_Sub10) local205.method4024(); local212 != null; local212 = (Class11_Sub10) local205.method4028()) {
								local191[local64 * 64 + local212.aByte98 + (local67 * 64 + local212.aByte97) * anInt3861] = (byte) local212.anInt7280;
							}
						}
					}
				}
				method3145(local191, aByteArray28, aShortArray35, arg1, arg2);
				for (local67 = 0; local67 < aClass196ArrayArrayArray2[local58].length; local67++) {
					for (local76 = 0; local76 < aClass196ArrayArrayArray2[local58][0].length; local76++) {
						@Pc(276) Class196 local276 = aClass196ArrayArrayArray2[local58][local67][local76];
						if (local276 != null) {
							for (@Pc(283) Class11_Sub10 local283 = (Class11_Sub10) local276.method4024(); local283 != null; local283 = (Class11_Sub10) local276.method4028()) {
								local148 = local67 * 64 + local283.aByte98 + (local76 * 64 + local283.aByte97) * anInt3861;
								local283.anInt7280 = (aByteArray28[local148] & 0xFF) << 16 | aShortArray35[local148] & 0xFFFF;
								if (local283.anInt7280 != 0) {
									local283.anInt7280 |= 0xFF000000;
								}
							}
						}
					}
				}
			}
			method3145(aByteArray31, aByteArray28, aShortArray35, arg1, arg2);
			aByteArray31 = null;
			method3140();
			return;
		}
	}

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "(Lclient!r;IIII)V")
	private static void method3158(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = anInt3860 - anInt3853;
		@Pc(7) int local7 = anInt3857 - anInt3856;
		if (anInt3860 < anInt3861) {
			local3++;
		}
		if (anInt3857 < anInt3863) {
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
			local28 = (arg1 * local17 >> 16) + anInt3855;
			local40 = (arg1 * (local17 + 1) >> 16) + anInt3855;
			local44 = local40 - local28;
			if (local44 > 0) {
				local50 = anInt3853 + local17;
				if (local50 >= 0 && local50 < anInt3861) {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt3864 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt3864 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (local84 > 0) {
							local93 = local57 + anInt3856;
							local173 = local50 + local93 * anInt3861;
							local175 = 0;
							local177 = 0;
							local179 = 0;
							if (local93 >= 0 && local93 < anInt3863) {
								local175 = (aByteArray28[local173] & 0xFF) << 16 | aShortArray35[local173] & 0xFFFF;
								if (local175 != 0) {
									local175 |= 0xFF000000;
								}
								local177 = aByteArray29[local173] & 0xFF;
								local179 = aShortArray34[local173] & 0xFFFF;
							}
							if (local175 == 0 && local177 == 0 && local179 == 0) {
								if (aClass1_Sub8_Sub11_2.anInt7419 != -1) {
									local175 = aClass1_Sub8_Sub11_2.anInt7419 | 0xFF000000;
								} else if ((local17 + anInt3853 & 0x4) == (local57 + anInt3857 & 0x4)) {
									local175 = anIntArray189[aClass90_3.anInt2574 + 1];
								} else {
									local175 = -11840664;
								}
								if (local175 == 0) {
									local175 = -16777216;
								}
								arg0.J(local28, local70, local44, local84, local175, 0);
							} else if (local179 <= 0) {
								method3152(arg0, local28, local70, local44, local84, local175, local177, aByteArray30[local173], null, null, true);
							} else if (local179 == 65535) {
								@Pc(282) Class1_Sub14 local282 = (Class1_Sub14) aClass91_12.method2271((long) (local50 << 16 | local93));
								if (local282 != null) {
									method3152(arg0, local28, local70, local44, local84, local175, local177, aByteArray30[local173], local282.aShortArray9, local282.aByteArray9, true);
								}
							} else {
								aShortArray33[0] = (short) (local179 - 1);
								aByteArray26[0] = aByteArray27[local173];
								method3152(arg0, local28, local70, local44, local84, local175, local177, aByteArray30[local173], aShortArray33, aByteArray26, true);
							}
						}
					}
				} else {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt3864 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt3864 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (aClass1_Sub8_Sub11_2.anInt7419 != -1) {
							local93 = aClass1_Sub8_Sub11_2.anInt7419 | 0xFF000000;
						} else if ((local17 + anInt3853 & 0x4) == (local57 + anInt3857 & 0x4)) {
							local93 = anIntArray189[aClass90_3.anInt2574 + 1];
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
			local40 = (arg1 * local28 >> 16) + anInt3855;
			local44 = (arg1 * (local28 + 1) >> 16) + anInt3855;
			local50 = local44 - local40;
			if (local50 > 0) {
				local57 = local28 + anInt3853;
				if (local57 >= 0 && local57 < anInt3861) {
					for (local70 = -16; local70 < local7 + 16; local70++) {
						local80 = anInt3864 - (arg2 * (local70 + 1) >> 16);
						local84 = anInt3864 - (arg2 * local70 >> 16);
						local93 = local84 - local80;
						if (local93 > 0) {
							local173 = local70 + anInt3856;
							if (local173 >= 0 && local173 < anInt3863) {
								local175 = aShortArray34[local57 + local173 * anInt3861] & 0xFFFF;
								if (local175 <= 0) {
									method3153(arg0, local40, local80, local50, local93, null, null);
								} else if (local175 == 65535) {
									@Pc(459) Class1_Sub14 local459 = (Class1_Sub14) aClass91_12.method2271((long) (local57 << 16 | local173));
									if (local459 != null) {
										method3153(arg0, local40, local80, local50, local93, local459.aShortArray9, local459.aByteArray9);
									}
								} else {
									aShortArray33[0] = (short) (local175 - 1);
									aByteArray26[0] = aByteArray27[local57 + local173 * anInt3861];
									method3153(arg0, local40, local80, local50, local93, aShortArray33, aByteArray26);
								}
							}
						}
					}
				}
			}
		}
		local40 = anInt3853 >> 6;
		local44 = anInt3856 >> 6;
		if (local40 < 0) {
			local40 = 0;
		}
		if (local44 < 0) {
			local44 = 0;
		}
		local50 = anInt3860 >> 6;
		local57 = anInt3857 >> 6;
		if (local50 >= aClass196ArrayArrayArray2[0].length) {
			local50 = aClass196ArrayArrayArray2[0].length - 1;
		}
		if (local57 >= aClass196ArrayArrayArray2[0][0].length) {
			local57 = aClass196ArrayArrayArray2[0][0].length - 1;
		}
		for (local70 = 0; local70 < 3; local70++) {
			@Pc(641) int local641;
			@Pc(653) int local653;
			@Pc(665) int local665;
			@Pc(675) int local675;
			@Pc(631) int local631;
			for (local80 = local40; local80 <= local50; local80++) {
				for (local84 = local44; local84 <= local57; local84++) {
					@Pc(589) Class196 local589 = aClass196ArrayArrayArray2[local70][local80][local84];
					if (local589 != null) {
						local173 = (local80 + (anInt3859 >> 6)) * 64;
						local175 = (local84 + (anInt3862 >> 6)) * 64;
						for (@Pc(612) Class11_Sub10 local612 = (Class11_Sub10) local589.method4024(); local612 != null; local612 = (Class11_Sub10) local589.method4028()) {
							local179 = local173 + local612.aByte98 - anInt3859 - anInt3853;
							local631 = local175 + local612.aByte97 - anInt3862 - anInt3856;
							local641 = (arg1 * local179 >> 16) + anInt3855;
							local653 = (arg1 * (local179 + 1) >> 16) + anInt3855;
							local665 = anInt3864 - (arg2 * (local631 + 1) >> 16);
							local675 = anInt3864 - (arg2 * local631 >> 16);
							method3152(arg0, local641, local665, local653 - local641, local675 - local665, local612.anInt7280, local612.aByte96 & 0xFF, local612.aByte95, local612.aShortArray90, local612.aByteArray71, false);
						}
					}
				}
			}
			for (local84 = local40; local84 <= local50; local84++) {
				for (local93 = local44; local93 <= local57; local93++) {
					@Pc(727) Class196 local727 = aClass196ArrayArrayArray2[local70][local84][local93];
					if (local727 != null) {
						local175 = (local84 + (anInt3859 >> 6)) * 64;
						local177 = (local93 + (anInt3862 >> 6)) * 64;
						for (@Pc(750) Class11_Sub10 local750 = (Class11_Sub10) local727.method4024(); local750 != null; local750 = (Class11_Sub10) local727.method4028()) {
							local631 = local175 + local750.aByte98 - anInt3859 - anInt3853;
							local641 = local177 + local750.aByte97 - anInt3862 - anInt3856;
							local653 = (arg1 * local631 >> 16) + anInt3855;
							local665 = (arg1 * (local631 + 1) >> 16) + anInt3855;
							local675 = anInt3864 - (arg2 * (local641 + 1) >> 16);
							@Pc(813) int local813 = anInt3864 - (arg2 * local641 >> 16);
							method3153(arg0, local653, local675, local665 - local653, local813 - local675, local750.aShortArray90, local750.aByteArray71);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "(II)Lclient!je;")
	public static Class170 method3159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class170 local3 = new Class170();
		for (@Pc(8) Class1_Sub8_Sub11 local8 = (Class1_Sub8_Sub11) aClass91_11.method2278(); local8 != null; local8 = (Class1_Sub8_Sub11) aClass91_11.method2276()) {
			if (local8.aBoolean572 && local8.method5980(arg1, arg0)) {
				local3.method3550(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lclient!sea;Lclient!ew;Lclient!fb;Lclient!gq;Lclient!ge;Lclient!bt;Lclient!nf;)V")
	public static void method3160(@OriginalArg(0) Class308 arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(2) Class92 arg2, @OriginalArg(3) Class122 arg3, @OriginalArg(4) Class113 arg4, @OriginalArg(5) Class33 arg5, @OriginalArg(6) Interface17 arg6) {
		aClass308_84 = arg0;
		aClass90_3 = arg1;
		aClass92_2 = arg2;
		aClass122_2 = arg3;
		aClass113_3 = arg4;
		aClass33_4 = arg5;
		anInterface17_2 = arg6;
		aClass91_11.method2275();
		@Pc(21) int local21 = aClass308_84.method6558("details");
		@Pc(26) int[] local26 = aClass308_84.method6570(local21);
		if (local26 != null) {
			for (@Pc(30) int local30 = 0; local30 < local26.length; local30++) {
				@Pc(39) Class1_Sub8_Sub11 local39 = Static488.method6721(aClass308_84, local21, local26[local30]);
				aClass91_11.method2269((long) local39.anInt7421, local39);
			}
		}
		Static171.method2748(false, true);
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lclient!r;Lclient!wp;IIII)V")
	private static void method3161(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class1_Sub51 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1.anInt9676 = anInt3855 + (arg2 * (arg1.anInt9680 - anInt3853) >> 16);
		arg1.anInt9677 = anInt3864 - (arg3 * (arg1.anInt9679 - anInt3856) >> 16);
	}

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "(I)Lclient!qea;")
	public static Class1_Sub8_Sub11 method3162(@OriginalArg(0) int arg0) {
		return (Class1_Sub8_Sub11) aClass91_11.method2271((long) arg0);
	}
}
