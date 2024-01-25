import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "Lclient!nl;")
	public static Class171 aClass171_44;

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "Lclient!qr;")
	public static Interface8 anInterface8_2;

	@OriginalMember(owner = "client!tt", name = "c", descriptor = "Lclient!af;")
	private static Class5 aClass5_5;

	@OriginalMember(owner = "client!tt", name = "e", descriptor = "Lclient!di;")
	private static Class47 aClass47_4;

	@OriginalMember(owner = "client!tt", name = "f", descriptor = "Lclient!je;")
	public static Class118 aClass118_4;

	@OriginalMember(owner = "client!tt", name = "g", descriptor = "Lclient!rf;")
	public static Class206 aClass206_62;

	@OriginalMember(owner = "client!tt", name = "h", descriptor = "Lclient!tm;")
	public static Class226 aClass226_3;

	@OriginalMember(owner = "client!tt", name = "i", descriptor = "Lclient!fl;")
	public static Class2_Sub10_Sub8 aClass2_Sub10_Sub8_3;

	@OriginalMember(owner = "client!tt", name = "j", descriptor = "Lclient!rj;")
	public static Class209 aClass209_3;

	@OriginalMember(owner = "client!tt", name = "m", descriptor = "F")
	public static float aFloat52;

	@OriginalMember(owner = "client!tt", name = "o", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!tt", name = "p", descriptor = "F")
	public static float aFloat53;

	@OriginalMember(owner = "client!tt", name = "r", descriptor = "I")
	public static int anInt3294;

	@OriginalMember(owner = "client!tt", name = "t", descriptor = "I")
	public static int anInt3296;

	@OriginalMember(owner = "client!tt", name = "u", descriptor = "I")
	public static int anInt3297;

	@OriginalMember(owner = "client!tt", name = "v", descriptor = "[S")
	private static short[] aShortArray58;

	@OriginalMember(owner = "client!tt", name = "w", descriptor = "I")
	public static int anInt3298;

	@OriginalMember(owner = "client!tt", name = "x", descriptor = "I")
	public static int anInt3299;

	@OriginalMember(owner = "client!tt", name = "y", descriptor = "I")
	public static int anInt3300;

	@OriginalMember(owner = "client!tt", name = "z", descriptor = "I")
	public static int anInt3301;

	@OriginalMember(owner = "client!tt", name = "A", descriptor = "[S")
	private static short[] aShortArray59;

	@OriginalMember(owner = "client!tt", name = "B", descriptor = "[B")
	private static byte[] aByteArray56;

	@OriginalMember(owner = "client!tt", name = "C", descriptor = "[B")
	private static byte[] aByteArray57;

	@OriginalMember(owner = "client!tt", name = "D", descriptor = "[B")
	private static byte[] aByteArray58;

	@OriginalMember(owner = "client!tt", name = "E", descriptor = "I")
	public static int anInt3302;

	@OriginalMember(owner = "client!tt", name = "F", descriptor = "Lclient!wk;")
	private static Class246 aClass246_13;

	@OriginalMember(owner = "client!tt", name = "G", descriptor = "I")
	public static int anInt3303;

	@OriginalMember(owner = "client!tt", name = "H", descriptor = "I")
	public static int anInt3304;

	@OriginalMember(owner = "client!tt", name = "I", descriptor = "I")
	public static int anInt3305;

	@OriginalMember(owner = "client!tt", name = "J", descriptor = "[B")
	private static byte[] aByteArray59;

	@OriginalMember(owner = "client!tt", name = "K", descriptor = "[I")
	private static int[] anIntArray644;

	@OriginalMember(owner = "client!tt", name = "L", descriptor = "[[[Lclient!mb;")
	private static Class154[][][] aClass154ArrayArrayArray2;

	@OriginalMember(owner = "client!tt", name = "M", descriptor = "I")
	public static int anInt3306;

	@OriginalMember(owner = "client!tt", name = "N", descriptor = "[B")
	private static byte[] aByteArray60;

	@OriginalMember(owner = "client!tt", name = "O", descriptor = "I")
	public static int anInt3307;

	@OriginalMember(owner = "client!tt", name = "d", descriptor = "Lclient!wk;")
	private static final Class246 aClass246_12 = new Class246(16);

	@OriginalMember(owner = "client!tt", name = "k", descriptor = "Lclient!cf;")
	public static final Class30 aClass30_23 = new Class30();

	@OriginalMember(owner = "client!tt", name = "l", descriptor = "I")
	public static int anInt3293 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!tt", name = "n", descriptor = "[B")
	private static final byte[] aByteArray55 = new byte[1];

	@OriginalMember(owner = "client!tt", name = "q", descriptor = "[S")
	private static final short[] aShortArray57 = new short[1];

	@OriginalMember(owner = "client!tt", name = "s", descriptor = "I")
	public static int anInt3295 = (int) (Math.random() * 11.0D) - 5;

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "()V")
	private static void method3035() {
		@Pc(4) int local4;
		@Pc(15) int local15;
		@Pc(49) int local49;
		for (@Pc(1) int local1 = 0; local1 < anInt3306; local1++) {
			for (local4 = 0; local4 < anInt3296; local4++) {
				local15 = aShortArray59[local1 + local4 * anInt3306] & 0xFFFF;
				if (local15 != 0) {
					@Pc(35) int local35;
					if (local15 == 65535) {
						@Pc(31) Class2_Sub37 local31 = (Class2_Sub37) aClass246_13.method5613((long) (local1 << 16 | local4));
						if (local31 != null) {
							for (local35 = 0; local35 < local31.aShortArray98.length; local35++) {
								@Pc(46) Class172 local46 = aClass118_4.method2858(local31.aShortArray98[local35] & 0xFFFF);
								local49 = local46.anInt4105;
								if (local46.anIntArray801 != null) {
									local46 = local46.method3775(anInterface8_2);
									if (local46 != null) {
										local49 = local46.anInt4105;
									}
								}
								if (local49 != -1) {
									@Pc(70) Class2_Sub23 local70 = new Class2_Sub23(local49);
									local70.anInt2800 = local1;
									local70.anInt2803 = local4;
									aClass30_23.method685(local70);
								}
							}
						}
					} else {
						@Pc(94) Class172 local94 = aClass118_4.method2858(local15 - 1);
						local35 = local94.anInt4105;
						if (local94.anIntArray801 != null) {
							local94 = local94.method3775(anInterface8_2);
							if (local94 != null) {
								local35 = local94.anInt4105;
							}
						}
						if (local35 != -1) {
							@Pc(118) Class2_Sub23 local118 = new Class2_Sub23(local35);
							local118.anInt2800 = local1;
							local118.anInt2803 = local4;
							aClass30_23.method685(local118);
						}
					}
				}
			}
		}
		for (local4 = 0; local4 < 3; local4++) {
			for (local15 = 0; local15 < aClass154ArrayArrayArray2[0].length; local15++) {
				for (@Pc(144) int local144 = 0; local144 < aClass154ArrayArrayArray2[0][0].length; local144++) {
					@Pc(153) Class154 local153 = aClass154ArrayArrayArray2[local4][local15][local144];
					if (local153 != null) {
						for (@Pc(160) Class10_Sub6 local160 = (Class10_Sub6) local153.method3479(); local160 != null; local160 = (Class10_Sub6) local153.method3483()) {
							if (local160.aShortArray76 != null) {
								for (local49 = 0; local49 < local160.aShortArray76.length; local49++) {
									@Pc(177) Class172 local177 = aClass118_4.method2858(local160.aShortArray76[local49] & 0xFFFF);
									@Pc(180) int local180 = local177.anInt4105;
									if (local177.anIntArray801 != null) {
										local177 = local177.method3775(anInterface8_2);
										if (local177 != null) {
											local180 = local177.anInt4105;
										}
									}
									if (local180 != -1) {
										@Pc(201) Class2_Sub23 local201 = new Class2_Sub23(local180);
										local201.anInt2800 = (local15 + (anInt3305 >> 6)) * 64 + local160.aByte42 - anInt3305;
										local201.anInt2803 = (local144 + (anInt3307 >> 6)) * 64 + local160.aByte43 - anInt3307;
										aClass30_23.method685(local201);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "()V")
	public static void method3036() {
		@Pc(2) int[] local2 = new int[3];
		for (@Pc(4) int local4 = 0; local4 < aClass209_3.anInt5088; local4++) {
			@Pc(32) boolean local32 = aClass2_Sub10_Sub8_3.method1860(aClass209_3.anIntArray1006[local4] & 0x3FFF, aClass209_3.anIntArray1006[local4] >> 28 & 0x3, aClass209_3.anIntArray1006[local4] >> 14 & 0x3FFF, local2);
			if (local32) {
				@Pc(42) Class2_Sub23 local42 = new Class2_Sub23(aClass209_3.anIntArray1007[local4]);
				local42.anInt2800 = local2[1] - anInt3305;
				local42.anInt2803 = local2[2] - anInt3307;
				aClass30_23.method685(local42);
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!tq;II)V")
	public static void method3038(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < aClass5_5.anInt143; local1++) {
			anIntArray644[local1 + 1] = method3056(arg0, local1, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt3299 = arg0 - anInt3305;
		anInt3300 = arg1 - anInt3307;
		anInt3297 = arg2 - anInt3305;
		anInt3298 = arg3 - anInt3307;
		anInt3302 = arg4;
		anInt3301 = arg5;
		anInt3303 = arg6;
		anInt3304 = arg7;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!vc;IIII)Lclient!cf;")
	private static Class30 method3040(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(4) Class2_Sub23 local4 = (Class2_Sub23) aClass30_23.method694(); local4 != null; local4 = (Class2_Sub23) aClass30_23.method682()) {
			method3047(arg0, local4, arg1, arg2);
		}
		return aClass30_23;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(II)Lclient!go;")
	public static Class87 method3041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class87 local3 = new Class87();
		for (@Pc(8) Class2_Sub10_Sub8 local8 = (Class2_Sub10_Sub8) aClass246_12.method5606(); local8 != null; local8 = (Class2_Sub10_Sub8) aClass246_12.method5614()) {
			if (local8.aBoolean132 && local8.method1861(arg1, arg0)) {
				local3.method2360(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!tt", name = "d", descriptor = "()V")
	public static void method3042() {
		aByteArray56 = new byte[anInt3306 * anInt3296];
		aByteArray60 = new byte[anInt3306 * anInt3296];
		aByteArray58 = new byte[anInt3306 * anInt3296];
		aShortArray59 = new short[anInt3306 * anInt3296];
		aByteArray57 = new byte[anInt3306 * anInt3296];
		aClass246_13 = new Class246(1024);
		aClass154ArrayArrayArray2 = new Class154[3][anInt3306 >> 6][anInt3296 >> 6];
		anIntArray644 = new int[aClass5_5.anInt143 + 1];
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "([B[B[SII)V")
	private static void method3043(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int[] local2 = new int[anInt3296];
		@Pc(5) int[] local5 = new int[anInt3296];
		@Pc(8) int[] local8 = new int[anInt3296];
		@Pc(11) int[] local11 = new int[anInt3296];
		@Pc(14) int[] local14 = new int[anInt3296];
		for (@Pc(16) int local16 = -5; local16 < anInt3306; local16++) {
			@Pc(21) int local21 = local16 + 5;
			@Pc(25) int local25 = local16 - 5;
			@Pc(41) int local41;
			for (@Pc(27) int local27 = 0; local27 < anInt3296; local27++) {
				@Pc(50) Class58 local50;
				@Pc(86) int local86;
				if (local21 < anInt3306) {
					local41 = arg0[local21 + local27 * anInt3306] & 0xFF;
					if (local41 > 0) {
						local50 = aClass47_4.method946(local41 - 1);
						local2[local27] += local50.anInt1447;
						local5[local27] += local50.anInt1448;
						local8[local27] += local50.anInt1441;
						local11[local27] += local50.anInt1440;
						local86 = local14[local27]++;
					}
				}
				if (local25 >= 0) {
					local41 = arg0[local25 + local27 * anInt3306] & 0xFF;
					if (local41 > 0) {
						local50 = aClass47_4.method946(local41 - 1);
						local2[local27] -= local50.anInt1447;
						local5[local27] -= local50.anInt1448;
						local8[local27] -= local50.anInt1441;
						local11[local27] -= local50.anInt1440;
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
				for (@Pc(167) int local167 = -5; local167 < anInt3296; local167++) {
					@Pc(172) int local172 = local167 + 5;
					if (local172 < anInt3296) {
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
						if ((arg0[local16 + local167 * anInt3306] & 0xFF) == 0) {
							local261 = local16 + local167 * anInt3306;
							arg1[local261] = 0;
							arg2[local261] = 0;
						} else {
							local261 = local163 == 0 ? 0 : Static332.method4904(local161 / local165, local159 / local165, local41 * 256 / local163);
							@Pc(294) int local294 = (local261 & 0x7F) + arg4;
							if (local294 < 0) {
								local294 = 0;
							} else if (local294 > 127) {
								local294 = 127;
							}
							@Pc(316) int local316 = (local261 + arg3 & 0xFC00) + (local261 & 0x380) + local294;
							@Pc(322) int local322 = local16 + local167 * anInt3306;
							@Pc(333) int local333 = Static214.anIntArray762[Static264.method4082(Static140.method2664(local316)) & 0xFFFF];
							arg1[local322] = (byte) (local333 >> 16 & 0xFF);
							arg2[local322] = (short) (local333 & 0xFFFF);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!vc;IIII[S[B)V")
	private static void method3044(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		if (arg5 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < arg5.length; local4++) {
			@Pc(14) Class172 local14 = aClass118_4.method2858(arg5[local4] & 0xFFFF);
			@Pc(17) int local17 = local14.anInt4116;
			if (local17 != -1) {
				@Pc(25) Class199 local25 = aClass206_62.method4414(local17);
				@Pc(49) Class18 local49 = local25.method4208(arg0, local14.aBoolean322 ? local14.aBoolean312 : false, local14.aBoolean313 ? arg6[local4] >> 6 & 0x3 : 0);
				if (local49 != null) {
					@Pc(58) int local58 = arg3 * local49.method4564() >> 2;
					@Pc(65) int local65 = arg4 * local49.method4560() >> 2;
					if (local25.aBoolean356) {
						@Pc(71) int local71 = local14.anInt4106;
						@Pc(74) int local74 = local14.anInt4113;
						if ((arg6[local4] >> 6 & 0x1) == 1) {
							@Pc(85) int local85 = local71;
							local71 = local74;
							local74 = local85;
						}
						local58 = local71 * arg3;
						local65 = local74 * arg4;
					}
					if (local58 != 0 && local65 != 0) {
						if (local25.anInt4769 == 0) {
							local49.method4570(arg1, arg2 + arg4 - local65, local58, local65);
						} else {
							local49.method4569(arg1, arg2 + arg4 - local65, local58, local65, 1, local25.anInt4769 | 0xFF000000, 1);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!nl;Lclient!af;Lclient!di;Lclient!je;Lclient!tm;Lclient!rf;Lclient!qr;)V")
	public static void method3045(@OriginalArg(0) Class171 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) Class47 arg2, @OriginalArg(3) Class118 arg3, @OriginalArg(4) Class226 arg4, @OriginalArg(5) Class206 arg5, @OriginalArg(6) Interface8 arg6) {
		aClass171_44 = arg0;
		aClass5_5 = arg1;
		aClass47_4 = arg2;
		aClass118_4 = arg3;
		aClass226_3 = arg4;
		aClass206_62 = arg5;
		anInterface8_2 = arg6;
		aClass246_12.method5610();
		@Pc(21) int local21 = aClass171_44.method3769("details");
		@Pc(26) int[] local26 = aClass171_44.method3767(local21);
		for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
			@Pc(37) Class2_Sub10_Sub8 local37 = Static219.method3623(local26[local28], local21, aClass171_44);
			aClass246_12.method5609(local37, (long) local37.anInt1903);
		}
		Static342.method5006(false);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)Lclient!fl;")
	public static Class2_Sub10_Sub8 method3046(@OriginalArg(0) int arg0) {
		return (Class2_Sub10_Sub8) aClass246_12.method5613((long) arg0);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!vc;Lclient!id;IIII)V")
	private static void method3047(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class2_Sub23 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1.anInt2804 = anInt3302 + (arg2 * (arg1.anInt2800 - anInt3299) >> 16);
		arg1.anInt2802 = anInt3304 - (arg3 * (arg1.anInt2803 - anInt3298) >> 16);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!vc;IIIIIII[S[BZ)V")
	private static void method3048(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) boolean arg10) {
		@Pc(20) int local20;
		@Pc(32) int local32;
		if (arg10 || arg5 != 0 || arg6 > 0) {
			if (arg6 == 0) {
				arg0.method1982(arg1, arg2, arg3, arg4, arg5, 0);
			} else {
				local20 = arg7 & 0x3F;
				if (local20 == 0 || arg3 <= 1 || arg4 <= 1) {
					local32 = anIntArray644[arg6];
					if (arg10 || local32 != 0) {
						arg0.method1982(arg1, arg2, arg3, arg4, local32, 0);
					}
				} else {
					local32 = arg10 ? 0 : 1;
					Static356.method5231(arg1, anIntArray644[arg6], local20, arg3, local32, arg4, anInt3294, arg7 >> 6 & 0x3, arg0, arg2, aByteArrayArrayArray10, arg5);
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
				@Pc(127) Class172 local127 = aClass118_4.method2858(arg8[local100] & 0xFFFF);
				if (local127.anInt4116 == -1) {
					@Pc(133) int local133 = -3355444;
					if (local127.anInt4140 == 1) {
						local133 = -3407872;
					}
					@Pc(147) int local147 = arg9[local100] >> 6 & 0x3;
					if (local107 == 0) {
						if (local147 == 0) {
							arg0.method1960(arg1, arg2, arg4, local133, 0);
						} else if (local147 == 1) {
							arg0.method2015(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 2) {
							arg0.method1960(local20, arg2, arg4, local133, 0);
						} else {
							arg0.method2015(arg1, local32, arg3, local133, 0);
						}
					} else if (local107 == 2) {
						if (local147 == 0) {
							arg0.method1960(arg1, arg2, arg4, -1, 0);
							arg0.method2015(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 1) {
							arg0.method1960(local20, arg2, arg4, -1, 0);
							arg0.method2015(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 2) {
							arg0.method1960(local20, arg2, arg4, -1, 0);
							arg0.method2015(arg1, local32, arg3, local133, 0);
						} else {
							arg0.method1960(arg1, arg2, arg4, -1, 0);
							arg0.method2015(arg1, local32, arg3, local133, 0);
						}
					} else if (local107 == 3) {
						if (local147 == 0) {
							arg0.method2015(arg1, arg2, 1, local133, 0);
						} else if (local147 == 1) {
							arg0.method2015(local20, arg2, 1, local133, 0);
						} else if (local147 == 2) {
							arg0.method2015(local20, local32, 1, local133, 0);
						} else {
							arg0.method2015(arg1, local32, 1, local133, 0);
						}
					} else if (local107 == 9) {
						@Pc(313) int local313;
						if (local147 == 0 || local147 == 2) {
							for (local313 = 0; local313 < arg4; local313++) {
								arg0.method2015(arg1 + local313, local32 - local313, 1, local133, 0);
							}
						} else {
							for (local313 = 0; local313 < arg4; local313++) {
								arg0.method2015(arg1 + local313, arg2 + local313, 1, local133, 0);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(Lclient!vc;IIII)V")
	private static void method3049(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = anInt3297 - anInt3299;
		@Pc(7) int local7 = anInt3300 - anInt3298;
		if (anInt3297 < anInt3306) {
			local3++;
		}
		if (anInt3300 < anInt3296) {
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
			local28 = (arg1 * local17 >> 16) + anInt3302;
			local40 = (arg1 * (local17 + 1) >> 16) + anInt3302;
			local44 = local40 - local28;
			if (local44 > 0) {
				local50 = anInt3299 + local17;
				if (local50 >= 0 && local50 < anInt3306) {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt3304 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt3304 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (local84 > 0) {
							local93 = local57 + anInt3298;
							local173 = local50 + local93 * anInt3306;
							local175 = 0;
							local177 = 0;
							local179 = 0;
							if (local93 >= 0 && local93 < anInt3296) {
								local175 = (aByteArray59[local173] & 0xFF) << 16 | aShortArray58[local173] & 0xFFFF;
								if (local175 != 0) {
									local175 |= 0xFF000000;
								}
								local177 = aByteArray60[local173] & 0xFF;
								local179 = aShortArray59[local173] & 0xFFFF;
							}
							if (local175 == 0 && local177 == 0 && local179 == 0) {
								if (aClass2_Sub10_Sub8_3.anInt1905 != -1) {
									local175 = aClass2_Sub10_Sub8_3.anInt1905 | 0xFF000000;
								} else if ((local17 + anInt3299 & 0x4) == (local57 + anInt3300 & 0x4)) {
									local175 = anIntArray644[aClass5_5.anInt146 + 1];
								} else {
									local175 = -11840664;
								}
								if (local175 == 0) {
									local175 = -16777216;
								}
								arg0.method1982(local28, local70, local44, local84, local175, 0);
							} else if (local179 <= 0) {
								method3048(arg0, local28, local70, local44, local84, local175, local177, aByteArray58[local173], null, null, true);
							} else if (local179 == 65535) {
								@Pc(282) Class2_Sub37 local282 = (Class2_Sub37) aClass246_13.method5613((long) (local50 << 16 | local93));
								if (local282 != null) {
									method3048(arg0, local28, local70, local44, local84, local175, local177, aByteArray58[local173], local282.aShortArray98, local282.aByteArray98, true);
								}
							} else {
								aShortArray57[0] = (short) (local179 - 1);
								aByteArray55[0] = aByteArray57[local173];
								method3048(arg0, local28, local70, local44, local84, local175, local177, aByteArray58[local173], aShortArray57, aByteArray55, true);
							}
						}
					}
				} else {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt3304 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt3304 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (aClass2_Sub10_Sub8_3.anInt1905 != -1) {
							local93 = aClass2_Sub10_Sub8_3.anInt1905 | 0xFF000000;
						} else if ((local17 + anInt3299 & 0x4) == (local57 + anInt3300 & 0x4)) {
							local93 = anIntArray644[aClass5_5.anInt146 + 1];
						} else {
							local93 = -11840664;
						}
						if (local93 == 0) {
							local93 = -16777216;
						}
						arg0.method1982(local28, local70, local44, local84, local93, 0);
					}
				}
			}
		}
		for (local28 = -16; local28 < local3 + 16; local28++) {
			local40 = (arg1 * local28 >> 16) + anInt3302;
			local44 = (arg1 * (local28 + 1) >> 16) + anInt3302;
			local50 = local44 - local40;
			if (local50 > 0) {
				local57 = local28 + anInt3299;
				if (local57 >= 0 && local57 < anInt3306) {
					for (local70 = -16; local70 < local7 + 16; local70++) {
						local80 = anInt3304 - (arg2 * (local70 + 1) >> 16);
						local84 = anInt3304 - (arg2 * local70 >> 16);
						local93 = local84 - local80;
						if (local93 > 0) {
							local173 = local70 + anInt3298;
							if (local173 >= 0 && local173 < anInt3296) {
								local175 = aShortArray59[local57 + local173 * anInt3306] & 0xFFFF;
								if (local175 <= 0) {
									method3044(arg0, local40, local80, local50, local93, null, null);
								} else if (local175 == 65535) {
									@Pc(459) Class2_Sub37 local459 = (Class2_Sub37) aClass246_13.method5613((long) (local57 << 16 | local173));
									if (local459 != null) {
										method3044(arg0, local40, local80, local50, local93, local459.aShortArray98, local459.aByteArray98);
									}
								} else {
									aShortArray57[0] = (short) (local175 - 1);
									aByteArray55[0] = aByteArray57[local57 + local173 * anInt3306];
									method3044(arg0, local40, local80, local50, local93, aShortArray57, aByteArray55);
								}
							}
						}
					}
				}
			}
		}
		local40 = anInt3299 >> 6;
		local44 = anInt3298 >> 6;
		if (local40 < 0) {
			local40 = 0;
		}
		if (local44 < 0) {
			local44 = 0;
		}
		local50 = anInt3297 >> 6;
		local57 = anInt3300 >> 6;
		if (local50 >= aClass154ArrayArrayArray2[0].length) {
			local50 = aClass154ArrayArrayArray2[0].length - 1;
		}
		if (local57 >= aClass154ArrayArrayArray2[0][0].length) {
			local57 = aClass154ArrayArrayArray2[0][0].length - 1;
		}
		for (local70 = 0; local70 < 3; local70++) {
			@Pc(641) int local641;
			@Pc(653) int local653;
			@Pc(665) int local665;
			@Pc(675) int local675;
			@Pc(631) int local631;
			for (local80 = local40; local80 <= local50; local80++) {
				for (local84 = local44; local84 <= local57; local84++) {
					@Pc(589) Class154 local589 = aClass154ArrayArrayArray2[local70][local80][local84];
					if (local589 != null) {
						local173 = (local80 + (anInt3305 >> 6)) * 64;
						local175 = (local84 + (anInt3307 >> 6)) * 64;
						for (@Pc(612) Class10_Sub6 local612 = (Class10_Sub6) local589.method3479(); local612 != null; local612 = (Class10_Sub6) local589.method3483()) {
							local179 = local173 + local612.aByte42 - anInt3305 - anInt3299;
							local631 = local175 + local612.aByte43 - anInt3307 - anInt3298;
							local641 = (arg1 * local179 >> 16) + anInt3302;
							local653 = (arg1 * (local179 + 1) >> 16) + anInt3302;
							local665 = anInt3304 - (arg2 * (local631 + 1) >> 16);
							local675 = anInt3304 - (arg2 * local631 >> 16);
							method3048(arg0, local641, local665, local653 - local641, local675 - local665, local612.anInt4290, local612.aByte45 & 0xFF, local612.aByte44, local612.aShortArray76, local612.aByteArray74, false);
						}
					}
				}
			}
			for (local84 = local40; local84 <= local50; local84++) {
				for (local93 = local44; local93 <= local57; local93++) {
					@Pc(727) Class154 local727 = aClass154ArrayArrayArray2[local70][local84][local93];
					if (local727 != null) {
						local175 = (local84 + (anInt3305 >> 6)) * 64;
						local177 = (local93 + (anInt3307 >> 6)) * 64;
						for (@Pc(750) Class10_Sub6 local750 = (Class10_Sub6) local727.method3479(); local750 != null; local750 = (Class10_Sub6) local727.method3483()) {
							local631 = local175 + local750.aByte42 - anInt3305 - anInt3299;
							local641 = local177 + local750.aByte43 - anInt3307 - anInt3298;
							local653 = (arg1 * local631 >> 16) + anInt3302;
							local665 = (arg1 * (local631 + 1) >> 16) + anInt3302;
							local675 = anInt3304 - (arg2 * (local641 + 1) >> 16);
							@Pc(813) int local813 = anInt3304 - (arg2 * local641 >> 16);
							method3044(arg0, local653, local675, local665 - local653, local813 - local675, local750.aShortArray76, local750.aByteArray74);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "e", descriptor = "()V")
	public static void method3050() {
		aByteArray56 = null;
		aByteArray59 = null;
		aShortArray58 = null;
		aByteArray60 = null;
		aByteArray58 = null;
		aShortArray59 = null;
		aByteArray57 = null;
		aClass246_13 = null;
		aClass154ArrayArrayArray2 = null;
		anIntArray644 = null;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!vc;)V")
	public static void method3051(@OriginalArg(0) Class63 arg0) {
		@Pc(3) int local3 = anInt3297 - anInt3299;
		@Pc(7) int local7 = anInt3300 - anInt3298;
		@Pc(15) int local15 = (anInt3303 - anInt3302 << 16) / local3;
		@Pc(23) int local23 = (anInt3304 - anInt3301 << 16) / local7;
		method3049(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(Lclient!vc;)Lclient!cf;")
	public static Class30 method3052(@OriginalArg(0) Class63 arg0) {
		@Pc(3) int local3 = anInt3297 - anInt3299;
		@Pc(7) int local7 = anInt3300 - anInt3298;
		@Pc(15) int local15 = (anInt3303 - anInt3302 << 16) / local3;
		@Pc(23) int local23 = (anInt3304 - anInt3301 << 16) / local7;
		return method3040(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(I)V")
	public static void method3053(@OriginalArg(0) int arg0) {
		aClass2_Sub10_Sub8_3 = (Class2_Sub10_Sub8) aClass246_12.method5613((long) arg0);
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(II)Lclient!fl;")
	public static Class2_Sub10_Sub8 method3054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class2_Sub10_Sub8 local4 = (Class2_Sub10_Sub8) aClass246_12.method5606(); local4 != null; local4 = (Class2_Sub10_Sub8) aClass246_12.method5614()) {
			if (local4.aBoolean132 && local4.method1861(arg1, arg0)) {
				return local4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!vc;II)V")
	public static void method3055(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class2_Sub16 local9 = new Class2_Sub16(aClass171_44.method3738("area", aClass2_Sub10_Sub8_3.aString19));
		@Pc(13) int local13 = local9.method5350();
		@Pc(16) int[] local16 = new int[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			local16[local18] = local9.method5350();
		}
		@Pc(33) int local33 = local9.method5350();
		@Pc(36) int[] local36 = new int[local33];
		for (@Pc(38) int local38 = 0; local38 < local33; local38++) {
			local36[local38] = local9.method5350();
		}
		while (true) {
			@Pc(58) int local58;
			@Pc(64) int local64;
			@Pc(67) int local67;
			@Pc(76) int local76;
			@Pc(148) int local148;
			while (local9.anInt6145 < local9.aByteArray112.length) {
				@Pc(62) int local62;
				@Pc(84) int local84;
				if (local9.method5350() == 0) {
					local58 = local9.method5350();
					local62 = local9.method5350();
					for (local64 = 0; local64 < 64; local64++) {
						for (local67 = 0; local67 < 64; local67++) {
							local76 = local58 * 64 + local64 - anInt3305;
							local84 = local62 * 64 + local67 - anInt3307;
							method3057(arg0, local9, local58, local62, local76, local84, local16, local36);
						}
					}
				} else {
					local58 = local9.method5350();
					local62 = local9.method5350();
					local64 = local9.method5350();
					local67 = local9.method5350();
					for (local76 = 0; local76 < 8; local76++) {
						for (local84 = 0; local84 < 8; local84++) {
							@Pc(136) int local136 = local58 * 64 + local64 * 8 + local76 - anInt3305;
							local148 = local62 * 64 + local67 * 8 + local84 - anInt3307;
							method3057(arg0, local9, local58, local62, local136, local148, local16, local36);
						}
					}
				}
			}
			aByteArray59 = new byte[anInt3306 * anInt3296];
			aShortArray58 = new short[anInt3306 * anInt3296];
			for (local58 = 0; local58 < 3; local58++) {
				@Pc(191) byte[] local191 = new byte[anInt3306 * anInt3296];
				for (local64 = 0; local64 < aClass154ArrayArrayArray2[local58].length; local64++) {
					for (local67 = 0; local67 < aClass154ArrayArrayArray2[local58][0].length; local67++) {
						@Pc(205) Class154 local205 = aClass154ArrayArrayArray2[local58][local64][local67];
						if (local205 != null) {
							for (@Pc(212) Class10_Sub6 local212 = (Class10_Sub6) local205.method3479(); local212 != null; local212 = (Class10_Sub6) local205.method3483()) {
								local191[local64 * 64 + local212.aByte42 + (local67 * 64 + local212.aByte43) * anInt3306] = (byte) local212.anInt4290;
							}
						}
					}
				}
				method3043(local191, aByteArray59, aShortArray58, arg1, arg2);
				for (local67 = 0; local67 < aClass154ArrayArrayArray2[local58].length; local67++) {
					for (local76 = 0; local76 < aClass154ArrayArrayArray2[local58][0].length; local76++) {
						@Pc(276) Class154 local276 = aClass154ArrayArrayArray2[local58][local67][local76];
						if (local276 != null) {
							for (@Pc(283) Class10_Sub6 local283 = (Class10_Sub6) local276.method3479(); local283 != null; local283 = (Class10_Sub6) local276.method3483()) {
								local148 = local67 * 64 + local283.aByte42 + (local76 * 64 + local283.aByte43) * anInt3306;
								local283.anInt4290 = (aByteArray59[local148] & 0xFF) << 16 | aShortArray58[local148] & 0xFFFF;
								if (local283.anInt4290 != 0) {
									local283.anInt4290 |= 0xFF000000;
								}
							}
						}
					}
				}
			}
			method3043(aByteArray56, aByteArray59, aShortArray58, arg1, arg2);
			aByteArray56 = null;
			method3035();
			return;
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!tq;III)I")
	private static int method3056(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class55 local4 = aClass5_5.method86(arg1);
		if (local4 == null) {
			return 0;
		}
		@Pc(11) int local11 = local4.anInt1288;
		if (local11 >= 0 && arg0.method139(local11).aBoolean255) {
			local11 = -1;
		}
		@Pc(68) int local68;
		@Pc(27) int local27;
		@Pc(33) int local33;
		@Pc(55) int local55;
		if (local4.anInt1283 >= 0) {
			local27 = local4.anInt1283;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static214.anIntArray762[Static264.method4082(Static330.method4878(local55)) & 0xFFFF] | 0xFF000000;
		} else if (local11 >= 0) {
			local68 = Static214.anIntArray762[Static264.method4082(Static330.method4878(arg0.method139(local11).aShort52)) & 0xFFFF] | 0xFF000000;
		} else if (local4.anInt1294 == -1) {
			local68 = 0;
		} else {
			local27 = local4.anInt1294;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static214.anIntArray762[Static264.method4082(Static330.method4878(local55)) & 0xFFFF] | 0xFF000000;
		}
		return local68;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!vc;Lclient!kk;IIII[I[I)V")
	private static void method3057(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class2_Sub16 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		@Pc(3) int local3 = arg1.method5350();
		if ((local3 & 0x1) == 0) {
			@Pc(15) boolean local15 = (local3 & 0x2) == 0;
			@Pc(21) int local21 = local3 >> 2 & 0x3F;
			if (local21 != 62) {
				if (local21 == 63) {
					local21 = arg1.method5350();
				} else if (local15) {
					local21 = arg6[local21];
				} else {
					local21 = arg7[local21];
				}
				if (local15) {
					aByteArray56[arg4 + arg5 * anInt3306] = (byte) local21;
					aByteArray60[arg4 + arg5 * anInt3306] = 0;
				} else {
					aByteArray60[arg4 + arg5 * anInt3306] = (byte) local21;
					aByteArray58[arg4 + arg5 * anInt3306] = 0;
					aByteArray56[arg4 + arg5 * anInt3306] = arg1.method5330();
				}
			}
			return;
		}
		@Pc(100) int local100 = (local3 >> 1 & 0x3) + 1;
		@Pc(108) boolean local108 = (local3 & 0x8) != 0;
		@Pc(116) boolean local116 = (local3 & 0x10) != 0;
		for (@Pc(118) int local118 = 0; local118 < local100; local118++) {
			@Pc(123) int local123 = arg1.method5350();
			@Pc(125) int local125 = 0;
			@Pc(127) int local127 = 0;
			if (local108) {
				local125 = arg1.method5350();
				local127 = arg1.method5350();
			}
			@Pc(139) int local139 = 0;
			if (local116) {
				local139 = arg1.method5350();
			}
			@Pc(215) short[] local215;
			@Pc(218) byte[] local218;
			@Pc(220) int local220;
			if (local118 == 0) {
				aByteArray56[arg4 + arg5 * anInt3306] = (byte) local123;
				aByteArray60[arg4 + arg5 * anInt3306] = (byte) local125;
				aByteArray58[arg4 + arg5 * anInt3306] = (byte) local127;
				if (local139 == 1) {
					aShortArray59[arg4 + arg5 * anInt3306] = (short) (arg1.method5312() + 1);
					aByteArray57[arg4 + arg5 * anInt3306] = arg1.method5330();
				} else if (local139 > 1) {
					aShortArray59[arg4 + arg5 * anInt3306] = -1;
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method5312();
						local218[local220] = arg1.method5330();
					}
					aClass246_13.method5609(new Class2_Sub37(local215, local218), (long) (arg4 << 16 | arg5));
				}
			} else {
				local215 = null;
				local218 = null;
				if (local139 > 0) {
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method5312();
						local218[local220] = arg1.method5330();
					}
				}
				if (aClass154ArrayArrayArray2[local118 - 1][arg2 - (anInt3305 >> 6)][arg3 - (anInt3307 >> 6)] == null) {
					aClass154ArrayArrayArray2[local118 - 1][arg2 - (anInt3305 >> 6)][arg3 - (anInt3307 >> 6)] = new Class154();
				}
				@Pc(338) Class10_Sub6 local338 = new Class10_Sub6(arg4 & 0x3F, arg5 & 0x3F, local123, local125, local127, local215, local218);
				aClass154ArrayArrayArray2[local118 - 1][arg2 - (anInt3305 >> 6)][arg3 - (anInt3307 >> 6)].method3481(local338);
			}
		}
	}
}
