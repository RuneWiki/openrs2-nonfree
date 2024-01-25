import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "Lclient!nc;")
	public static Interface10 anInterface10_2;

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "Lclient!lo;")
	public static Class1_Sub1_Sub12 aClass1_Sub1_Sub12_2;

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "Lclient!re;")
	public static Class250 aClass250_3;

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "Lclient!mm;")
	public static Class194 aClass194_4;

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "Lclient!er;")
	private static Class81 aClass81_2;

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "Lclient!caa;")
	private static Class40 aClass40_3;

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "Lclient!kl;")
	public static Class165 aClass165_2;

	@OriginalMember(owner = "client!tb", name = "i", descriptor = "Lclient!kda;")
	public static Class160 aClass160_36;

	@OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
	public static int anInt3548;

	@OriginalMember(owner = "client!tb", name = "m", descriptor = "F")
	public static float aFloat84;

	@OriginalMember(owner = "client!tb", name = "n", descriptor = "Lclient!lk;")
	public static Class179 aClass179_2;

	@OriginalMember(owner = "client!tb", name = "p", descriptor = "F")
	public static float aFloat85;

	@OriginalMember(owner = "client!tb", name = "r", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
	public static int anInt3551;

	@OriginalMember(owner = "client!tb", name = "u", descriptor = "[S")
	private static short[] aShortArray57;

	@OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
	public static int anInt3552;

	@OriginalMember(owner = "client!tb", name = "w", descriptor = "I")
	public static int anInt3553;

	@OriginalMember(owner = "client!tb", name = "x", descriptor = "[B")
	private static byte[] aByteArray53;

	@OriginalMember(owner = "client!tb", name = "y", descriptor = "I")
	public static int anInt3554;

	@OriginalMember(owner = "client!tb", name = "z", descriptor = "[B")
	private static byte[] aByteArray54;

	@OriginalMember(owner = "client!tb", name = "A", descriptor = "[B")
	private static byte[] aByteArray55;

	@OriginalMember(owner = "client!tb", name = "B", descriptor = "I")
	public static int anInt3555;

	@OriginalMember(owner = "client!tb", name = "C", descriptor = "I")
	public static int anInt3556;

	@OriginalMember(owner = "client!tb", name = "D", descriptor = "[B")
	private static byte[] aByteArray56;

	@OriginalMember(owner = "client!tb", name = "E", descriptor = "[[[Lclient!jc;")
	private static Class145[][][] aClass145ArrayArrayArray2;

	@OriginalMember(owner = "client!tb", name = "F", descriptor = "I")
	public static int anInt3557;

	@OriginalMember(owner = "client!tb", name = "G", descriptor = "[S")
	private static short[] aShortArray58;

	@OriginalMember(owner = "client!tb", name = "H", descriptor = "I")
	public static int anInt3558;

	@OriginalMember(owner = "client!tb", name = "I", descriptor = "[I")
	private static int[] anIntArray280;

	@OriginalMember(owner = "client!tb", name = "J", descriptor = "[B")
	private static byte[] aByteArray57;

	@OriginalMember(owner = "client!tb", name = "K", descriptor = "I")
	public static int anInt3559;

	@OriginalMember(owner = "client!tb", name = "L", descriptor = "I")
	public static int anInt3560;

	@OriginalMember(owner = "client!tb", name = "M", descriptor = "I")
	public static int anInt3561;

	@OriginalMember(owner = "client!tb", name = "N", descriptor = "Lclient!lb;")
	private static Class174 aClass174_10;

	@OriginalMember(owner = "client!tb", name = "P", descriptor = "I")
	public static int anInt3562;

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "Lclient!lb;")
	private static final Class174 aClass174_9 = new Class174(16);

	@OriginalMember(owner = "client!tb", name = "j", descriptor = "[S")
	private static final short[] aShortArray56 = new short[1];

	@OriginalMember(owner = "client!tb", name = "k", descriptor = "[B")
	private static final byte[] aByteArray52 = new byte[1];

	@OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
	public static int anInt3549 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
	public static int anInt3550 = (int) (Math.random() * 11.0D) - 5;

	@OriginalMember(owner = "client!tb", name = "s", descriptor = "Lclient!bu;")
	public static final Class38 aClass38_28 = new Class38();

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!qa;IIII[S[B)V")
	private static void method3211(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6) {
		if (arg5 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < arg5.length; local4++) {
			@Pc(14) Class288 local14 = aClass194_4.method5084(arg5[local4] & 0xFFFF);
			@Pc(17) int local17 = local14.anInt8366;
			if (local17 != -1) {
				@Pc(25) Class140 local25 = aClass165_2.method4290(local17);
				@Pc(49) Class12 local49 = local25.method3857(local14.aBoolean580 ? arg6[local4] >> 6 & 0x3 : 0, local14.aBoolean570 ? local14.aBoolean571 : false, arg0);
				if (local49 != null) {
					@Pc(58) int local58 = arg3 * local49.EA() >> 2;
					@Pc(65) int local65 = arg4 * local49.ma() >> 2;
					if (local25.aBoolean271) {
						@Pc(71) int local71 = local14.anInt8365;
						@Pc(74) int local74 = local14.anInt8343;
						if ((arg6[local4] >> 6 & 0x1) == 1) {
							@Pc(85) int local85 = local71;
							local71 = local74;
							local74 = local85;
						}
						local58 = local71 * arg3;
						local65 = local74 * arg4;
					}
					if (local58 != 0 && local65 != 0) {
						if (local25.anInt4432 == 0) {
							local49.method7192(arg1, arg2 + arg4 - local65, local58, local65);
						} else {
							local49.ra(arg1, arg2 + arg4 - local65, local58, local65, 0, local25.anInt4432 | 0xFF000000, 1);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!qa;Lclient!jj;IIII)V")
	private static void method3212(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class1_Sub25 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1.anInt4559 = anInt3556 + (arg2 * (arg1.anInt4561 - anInt3561) >> 16);
		arg1.anInt4558 = anInt3554 - (arg3 * (arg1.anInt4557 - anInt3559) >> 16);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)Lclient!lo;")
	public static Class1_Sub1_Sub12 method3213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(4) Class1_Sub1_Sub12 local4 = (Class1_Sub1_Sub12) aClass174_9.method4421(); local4 != null; local4 = (Class1_Sub1_Sub12) aClass174_9.method4429()) {
			if (local4.aBoolean385 && local4.method4789(arg0, arg1)) {
				return local4;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!qa;IIII)Lclient!bu;")
	private static Class38 method3214(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(4) Class1_Sub25 local4 = (Class1_Sub25) aClass38_28.method1419(); local4 != null; local4 = (Class1_Sub25) aClass38_28.method1415()) {
			method3212(arg0, local4, arg1, arg2);
		}
		return aClass38_28;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!n;II)V")
	public static void method3215(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < aClass81_2.anInt2812; local1++) {
			anIntArray280[local1 + 1] = method3217(arg0, local1, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)Lclient!lo;")
	public static Class1_Sub1_Sub12 method3216(@OriginalArg(0) int arg0) {
		return (Class1_Sub1_Sub12) aClass174_9.method4422((long) arg0);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!n;III)I")
	private static int method3217(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class184 local4 = aClass81_2.method2640(arg1);
		if (local4 == null) {
			return 0;
		}
		@Pc(11) int local11 = local4.anInt5595;
		if (local11 >= 0 && arg0.method7085(local11).aBoolean356) {
			local11 = -1;
		}
		@Pc(68) int local68;
		@Pc(27) int local27;
		@Pc(33) int local33;
		@Pc(55) int local55;
		if (local4.anInt5600 >= 0) {
			local27 = local4.anInt5600;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static180.anIntArray297[Static257.method7982(Static105.method2290(local55)) & 0xFFFF] | 0xFF000000;
		} else if (local11 >= 0) {
			local68 = Static180.anIntArray297[Static257.method7982(Static105.method2290(arg0.method7085(local11).aShort81)) & 0xFFFF] | 0xFF000000;
		} else if (local4.anInt5596 == -1) {
			local68 = 0;
		} else {
			local27 = local4.anInt5596;
			local33 = (local27 & 0x7F) + arg3;
			if (local33 < 0) {
				local33 = 0;
			} else if (local33 > 127) {
				local33 = 127;
			}
			local55 = (local27 + arg2 & 0xFC00) + (local27 & 0x380) + local33;
			local68 = Static180.anIntArray297[Static257.method7982(Static105.method2290(local55)) & 0xFFFF] | 0xFF000000;
		}
		return local68;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!qa;IIIIIII[S[BZ)V")
	private static void method3218(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) short[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) boolean arg10) {
		@Pc(20) int local20;
		@Pc(32) int local32;
		if (arg10 || arg5 != 0 || arg6 > 0) {
			if (arg6 == 0) {
				arg0.f(arg1, arg2, arg3, arg4, arg5, 0);
			} else {
				local20 = arg7 & 0x3F;
				if (local20 == 0 || arg3 <= 1 || arg4 <= 1) {
					local32 = anIntArray280[arg6];
					if (arg10 || local32 != 0) {
						arg0.f(arg1, arg2, arg3, arg4, local32, 0);
					}
				} else {
					local32 = arg10 ? 0 : 1;
					Static29.method1220(arg4, anInt3548, arg1, anIntArray280[arg6], local20, arg3, arg0, local32, arg5, arg7 >> 6 & 0x3, aByteArrayArrayArray3, arg2);
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
				@Pc(127) Class288 local127 = aClass194_4.method5084(arg8[local100] & 0xFFFF);
				if (local127.anInt8366 == -1) {
					@Pc(133) int local133 = -3355444;
					if (local127.anInt8338 == 1) {
						local133 = -3407872;
					}
					@Pc(147) int local147 = arg9[local100] >> 6 & 0x3;
					if (local107 == 0) {
						if (local147 == 0) {
							arg0.e(arg1, arg2, arg4, local133, 0);
						} else if (local147 == 1) {
							arg0.UA(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 2) {
							arg0.e(local20, arg2, arg4, local133, 0);
						} else {
							arg0.UA(arg1, local32, arg3, local133, 0);
						}
					} else if (local107 == 2) {
						if (local147 == 0) {
							arg0.e(arg1, arg2, arg4, -1, 0);
							arg0.UA(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 1) {
							arg0.e(local20, arg2, arg4, -1, 0);
							arg0.UA(arg1, arg2, arg3, local133, 0);
						} else if (local147 == 2) {
							arg0.e(local20, arg2, arg4, -1, 0);
							arg0.UA(arg1, local32, arg3, local133, 0);
						} else {
							arg0.e(arg1, arg2, arg4, -1, 0);
							arg0.UA(arg1, local32, arg3, local133, 0);
						}
					} else if (local107 == 3) {
						if (local147 == 0) {
							arg0.UA(arg1, arg2, 1, local133, 0);
						} else if (local147 == 1) {
							arg0.UA(local20, arg2, 1, local133, 0);
						} else if (local147 == 2) {
							arg0.UA(local20, local32, 1, local133, 0);
						} else {
							arg0.UA(arg1, local32, 1, local133, 0);
						}
					} else if (local107 == 9) {
						@Pc(313) int local313;
						if (local147 == 0 || local147 == 2) {
							for (local313 = 0; local313 < arg4; local313++) {
								arg0.UA(arg1 + local313, local32 - local313, 1, local133, 0);
							}
						} else {
							for (local313 = 0; local313 < arg4; local313++) {
								arg0.UA(arg1 + local313, arg2 + local313, 1, local133, 0);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!qa;)Lclient!bu;")
	public static Class38 method3219(@OriginalArg(0) Class9 arg0) {
		@Pc(3) int local3 = anInt3560 - anInt3561;
		@Pc(7) int local7 = anInt3562 - anInt3559;
		@Pc(15) int local15 = (anInt3557 - anInt3556 << 16) / local3;
		@Pc(23) int local23 = (anInt3554 - anInt3552 << 16) / local7;
		return method3214(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(Lclient!qa;)V")
	public static void method3220(@OriginalArg(0) Class9 arg0) {
		@Pc(3) int local3 = anInt3560 - anInt3561;
		@Pc(7) int local7 = anInt3562 - anInt3559;
		@Pc(15) int local15 = (anInt3557 - anInt3556 << 16) / local3;
		@Pc(23) int local23 = (anInt3554 - anInt3552 << 16) / local7;
		method3231(arg0, local15, local23);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "()V")
	public static void method3221() {
		aByteArray53 = null;
		aByteArray56 = null;
		aShortArray58 = null;
		aByteArray54 = null;
		aByteArray57 = null;
		aShortArray57 = null;
		aByteArray55 = null;
		aClass174_10 = null;
		aClass145ArrayArrayArray2 = null;
		anIntArray280 = null;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)Lclient!vm;")
	public static Class307 method3223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class307 local3 = new Class307();
		for (@Pc(8) Class1_Sub1_Sub12 local8 = (Class1_Sub1_Sub12) aClass174_9.method4421(); local8 != null; local8 = (Class1_Sub1_Sub12) aClass174_9.method4429()) {
			if (local8.aBoolean385 && local8.method4789(arg0, arg1)) {
				local3.method7354(local8);
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "()V")
	private static void method3224() {
		@Pc(4) int local4;
		@Pc(15) int local15;
		@Pc(49) int local49;
		for (@Pc(1) int local1 = 0; local1 < anInt3555; local1++) {
			for (local4 = 0; local4 < anInt3551; local4++) {
				local15 = aShortArray57[local1 + local4 * anInt3555] & 0xFFFF;
				if (local15 != 0) {
					@Pc(35) int local35;
					if (local15 == 65535) {
						@Pc(31) Class1_Sub44 local31 = (Class1_Sub44) aClass174_10.method4422((long) (local1 << 16 | local4));
						if (local31 != null) {
							for (local35 = 0; local35 < local31.aShortArray135.length; local35++) {
								@Pc(46) Class288 local46 = aClass194_4.method5084(local31.aShortArray135[local35] & 0xFFFF);
								local49 = local46.anInt8346;
								if (local46.anIntArray650 != null) {
									local46 = local46.method7065(anInterface10_2);
									if (local46 != null) {
										local49 = local46.anInt8346;
									}
								}
								if (local49 != -1) {
									@Pc(70) Class1_Sub25 local70 = new Class1_Sub25(local49);
									local70.anInt4561 = local1;
									local70.anInt4557 = local4;
									aClass38_28.method1426(local70);
								}
							}
						}
					} else {
						@Pc(94) Class288 local94 = aClass194_4.method5084(local15 - 1);
						local35 = local94.anInt8346;
						if (local94.anIntArray650 != null) {
							local94 = local94.method7065(anInterface10_2);
							if (local94 != null) {
								local35 = local94.anInt8346;
							}
						}
						if (local35 != -1) {
							@Pc(118) Class1_Sub25 local118 = new Class1_Sub25(local35);
							local118.anInt4561 = local1;
							local118.anInt4557 = local4;
							aClass38_28.method1426(local118);
						}
					}
				}
			}
		}
		for (local4 = 0; local4 < 3; local4++) {
			for (local15 = 0; local15 < aClass145ArrayArrayArray2[0].length; local15++) {
				for (@Pc(144) int local144 = 0; local144 < aClass145ArrayArrayArray2[0][0].length; local144++) {
					@Pc(153) Class145 local153 = aClass145ArrayArrayArray2[local4][local15][local144];
					if (local153 != null) {
						for (@Pc(160) Class2_Sub5 local160 = (Class2_Sub5) local153.method3919(); local160 != null; local160 = (Class2_Sub5) local153.method3926()) {
							if (local160.aShortArray65 != null) {
								for (local49 = 0; local49 < local160.aShortArray65.length; local49++) {
									@Pc(177) Class288 local177 = aClass194_4.method5084(local160.aShortArray65[local49] & 0xFFFF);
									@Pc(180) int local180 = local177.anInt8346;
									if (local177.anIntArray650 != null) {
										local177 = local177.method7065(anInterface10_2);
										if (local177 != null) {
											local180 = local177.anInt8346;
										}
									}
									if (local180 != -1) {
										@Pc(201) Class1_Sub25 local201 = new Class1_Sub25(local180);
										local201.anInt4561 = (local15 + (anInt3553 >> 6)) * 64 + local160.aByte34 - anInt3553;
										local201.anInt4557 = (local144 + (anInt3558 >> 6)) * 64 + local160.aByte32 - anInt3558;
										aClass38_28.method1426(local201);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!qa;Lclient!gw;IIII[I[I)V")
	private static void method3225(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class1_Sub13 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		@Pc(3) int local3 = arg1.method3043();
		if ((local3 & 0x1) == 0) {
			@Pc(15) boolean local15 = (local3 & 0x2) == 0;
			@Pc(21) int local21 = local3 >> 2 & 0x3F;
			if (local21 != 62) {
				if (local21 == 63) {
					local21 = arg1.method3043();
				} else if (local15) {
					local21 = arg6[local21];
				} else {
					local21 = arg7[local21];
				}
				if (local15) {
					aByteArray53[arg4 + arg5 * anInt3555] = (byte) local21;
					aByteArray54[arg4 + arg5 * anInt3555] = 0;
				} else {
					aByteArray54[arg4 + arg5 * anInt3555] = (byte) local21;
					aByteArray57[arg4 + arg5 * anInt3555] = 0;
					aByteArray53[arg4 + arg5 * anInt3555] = arg1.method3073();
				}
			}
			return;
		}
		@Pc(100) int local100 = (local3 >> 1 & 0x3) + 1;
		@Pc(108) boolean local108 = (local3 & 0x8) != 0;
		@Pc(116) boolean local116 = (local3 & 0x10) != 0;
		for (@Pc(118) int local118 = 0; local118 < local100; local118++) {
			@Pc(123) int local123 = arg1.method3043();
			@Pc(125) int local125 = 0;
			@Pc(127) int local127 = 0;
			if (local108) {
				local125 = arg1.method3043();
				local127 = arg1.method3043();
			}
			@Pc(139) int local139 = 0;
			if (local116) {
				local139 = arg1.method3043();
			}
			@Pc(215) short[] local215;
			@Pc(218) byte[] local218;
			@Pc(220) int local220;
			if (local118 == 0) {
				aByteArray53[arg4 + arg5 * anInt3555] = (byte) local123;
				aByteArray54[arg4 + arg5 * anInt3555] = (byte) local125;
				aByteArray57[arg4 + arg5 * anInt3555] = (byte) local127;
				if (local139 == 1) {
					aShortArray57[arg4 + arg5 * anInt3555] = (short) (arg1.method3056() + 1);
					aByteArray55[arg4 + arg5 * anInt3555] = arg1.method3073();
				} else if (local139 > 1) {
					aShortArray57[arg4 + arg5 * anInt3555] = -1;
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method3056();
						local218[local220] = arg1.method3073();
					}
					aClass174_10.method4420(new Class1_Sub44(local215, local218), (long) (arg4 << 16 | arg5));
				}
			} else {
				local215 = null;
				local218 = null;
				if (local139 > 0) {
					local215 = new short[local139];
					local218 = new byte[local139];
					for (local220 = 0; local220 < local139; local220++) {
						local215[local220] = (short) arg1.method3056();
						local218[local220] = arg1.method3073();
					}
				}
				if (aClass145ArrayArrayArray2[local118 - 1][arg2 - (anInt3553 >> 6)][arg3 - (anInt3558 >> 6)] == null) {
					aClass145ArrayArrayArray2[local118 - 1][arg2 - (anInt3553 >> 6)][arg3 - (anInt3558 >> 6)] = new Class145();
				}
				@Pc(338) Class2_Sub5 local338 = new Class2_Sub5(arg4 & 0x3F, arg5 & 0x3F, local123, local125, local127, local215, local218);
				aClass145ArrayArrayArray2[local118 - 1][arg2 - (anInt3553 >> 6)][arg3 - (anInt3558 >> 6)].method3927(local338);
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!qa;II)V")
	public static void method3226(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class1_Sub13 local9 = new Class1_Sub13(aClass160_36.method4222("area", aClass1_Sub1_Sub12_2.aString45));
		@Pc(13) int local13 = local9.method3043();
		@Pc(16) int[] local16 = new int[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			local16[local18] = local9.method3043();
		}
		@Pc(33) int local33 = local9.method3043();
		@Pc(36) int[] local36 = new int[local33];
		for (@Pc(38) int local38 = 0; local38 < local33; local38++) {
			local36[local38] = local9.method3043();
		}
		while (true) {
			@Pc(58) int local58;
			@Pc(64) int local64;
			@Pc(67) int local67;
			@Pc(76) int local76;
			@Pc(148) int local148;
			while (local9.anInt3400 < local9.aByteArray45.length) {
				@Pc(62) int local62;
				@Pc(84) int local84;
				if (local9.method3043() == 0) {
					local58 = local9.method3043();
					local62 = local9.method3043();
					for (local64 = 0; local64 < 64; local64++) {
						for (local67 = 0; local67 < 64; local67++) {
							local76 = local58 * 64 + local64 - anInt3553;
							local84 = local62 * 64 + local67 - anInt3558;
							method3225(arg0, local9, local58, local62, local76, local84, local16, local36);
						}
					}
				} else {
					local58 = local9.method3043();
					local62 = local9.method3043();
					local64 = local9.method3043();
					local67 = local9.method3043();
					for (local76 = 0; local76 < 8; local76++) {
						for (local84 = 0; local84 < 8; local84++) {
							@Pc(136) int local136 = local58 * 64 + local64 * 8 + local76 - anInt3553;
							local148 = local62 * 64 + local67 * 8 + local84 - anInt3558;
							method3225(arg0, local9, local58, local62, local136, local148, local16, local36);
						}
					}
				}
			}
			aByteArray56 = new byte[anInt3555 * anInt3551];
			aShortArray58 = new short[anInt3555 * anInt3551];
			for (local58 = 0; local58 < 3; local58++) {
				@Pc(191) byte[] local191 = new byte[anInt3555 * anInt3551];
				for (local64 = 0; local64 < aClass145ArrayArrayArray2[local58].length; local64++) {
					for (local67 = 0; local67 < aClass145ArrayArrayArray2[local58][0].length; local67++) {
						@Pc(205) Class145 local205 = aClass145ArrayArrayArray2[local58][local64][local67];
						if (local205 != null) {
							for (@Pc(212) Class2_Sub5 local212 = (Class2_Sub5) local205.method3919(); local212 != null; local212 = (Class2_Sub5) local205.method3926()) {
								local191[local64 * 64 + local212.aByte34 + (local67 * 64 + local212.aByte32) * anInt3555] = (byte) local212.anInt3873;
							}
						}
					}
				}
				method3228(local191, aByteArray56, aShortArray58, arg1, arg2);
				for (local67 = 0; local67 < aClass145ArrayArrayArray2[local58].length; local67++) {
					for (local76 = 0; local76 < aClass145ArrayArrayArray2[local58][0].length; local76++) {
						@Pc(276) Class145 local276 = aClass145ArrayArrayArray2[local58][local67][local76];
						if (local276 != null) {
							for (@Pc(283) Class2_Sub5 local283 = (Class2_Sub5) local276.method3919(); local283 != null; local283 = (Class2_Sub5) local276.method3926()) {
								local148 = local67 * 64 + local283.aByte34 + (local76 * 64 + local283.aByte32) * anInt3555;
								local283.anInt3873 = (aByteArray56[local148] & 0xFF) << 16 | aShortArray58[local148] & 0xFFFF;
								if (local283.anInt3873 != 0) {
									local283.anInt3873 |= 0xFF000000;
								}
							}
						}
					}
				}
			}
			method3228(aByteArray53, aByteArray56, aShortArray58, arg1, arg2);
			aByteArray53 = null;
			method3224();
			return;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		anInt3561 = arg0 - anInt3553;
		anInt3562 = arg1 - anInt3558;
		anInt3560 = arg2 - anInt3553;
		anInt3559 = arg3 - anInt3558;
		anInt3556 = arg4;
		anInt3552 = arg5;
		anInt3557 = arg6;
		anInt3554 = arg7;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "([B[B[SII)V")
	private static void method3228(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int[] local2 = new int[anInt3551];
		@Pc(5) int[] local5 = new int[anInt3551];
		@Pc(8) int[] local8 = new int[anInt3551];
		@Pc(11) int[] local11 = new int[anInt3551];
		@Pc(14) int[] local14 = new int[anInt3551];
		for (@Pc(16) int local16 = -5; local16 < anInt3555; local16++) {
			@Pc(21) int local21 = local16 + 5;
			@Pc(25) int local25 = local16 - 5;
			@Pc(41) int local41;
			for (@Pc(27) int local27 = 0; local27 < anInt3551; local27++) {
				@Pc(50) Class63 local50;
				@Pc(86) int local86;
				if (local21 < anInt3555) {
					local41 = arg0[local21 + local27 * anInt3555] & 0xFF;
					if (local41 > 0) {
						local50 = aClass40_3.method1495(local41 - 1);
						local2[local27] += local50.anInt2336;
						local5[local27] += local50.anInt2339;
						local8[local27] += local50.anInt2330;
						local11[local27] += local50.anInt2331;
						local86 = local14[local27]++;
					}
				}
				if (local25 >= 0) {
					local41 = arg0[local25 + local27 * anInt3555] & 0xFF;
					if (local41 > 0) {
						local50 = aClass40_3.method1495(local41 - 1);
						local2[local27] -= local50.anInt2336;
						local5[local27] -= local50.anInt2339;
						local8[local27] -= local50.anInt2330;
						local11[local27] -= local50.anInt2331;
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
				for (@Pc(167) int local167 = -5; local167 < anInt3551; local167++) {
					@Pc(172) int local172 = local167 + 5;
					if (local172 < anInt3551) {
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
						if ((arg0[local16 + local167 * anInt3555] & 0xFF) == 0) {
							local261 = local16 + local167 * anInt3555;
							arg1[local261] = 0;
							arg2[local261] = 0;
						} else {
							local261 = local163 == 0 ? 0 : Static195.method3627(local41 * 256 / local163, local159 / local165, local161 / local165);
							@Pc(294) int local294 = (local261 & 0x7F) + arg4;
							if (local294 < 0) {
								local294 = 0;
							} else if (local294 > 127) {
								local294 = 127;
							}
							@Pc(316) int local316 = (local261 + arg3 & 0xFC00) + (local261 & 0x380) + local294;
							@Pc(322) int local322 = local16 + local167 * anInt3555;
							@Pc(333) int local333 = Static180.anIntArray297[Static257.method7982(Static155.method3120(local316)) & 0xFFFF];
							arg1[local322] = (byte) (local333 >> 16 & 0xFF);
							arg2[local322] = (short) (local333 & 0xFFFF);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "()V")
	public static void method3229() {
		aByteArray53 = new byte[anInt3555 * anInt3551];
		aByteArray54 = new byte[anInt3555 * anInt3551];
		aByteArray57 = new byte[anInt3555 * anInt3551];
		aShortArray57 = new short[anInt3555 * anInt3551];
		aByteArray55 = new byte[anInt3555 * anInt3551];
		aClass174_10 = new Class174(1024);
		aClass145ArrayArrayArray2 = new Class145[3][anInt3555 >> 6][anInt3551 >> 6];
		anIntArray280 = new int[aClass81_2.anInt2812 + 1];
	}

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "()V")
	public static void method3230() {
		@Pc(2) int[] local2 = new int[3];
		for (@Pc(4) int local4 = 0; local4 < aClass179_2.anInt5505; local4++) {
			@Pc(32) boolean local32 = aClass1_Sub1_Sub12_2.method4790(aClass179_2.anIntArray392[local4] >> 28 & 0x3, aClass179_2.anIntArray392[local4] >> 14 & 0x3FFF, local2, aClass179_2.anIntArray392[local4] & 0x3FFF);
			if (local32) {
				@Pc(42) Class1_Sub25 local42 = new Class1_Sub25(aClass179_2.anIntArray393[local4]);
				local42.anInt4561 = local2[1] - anInt3553;
				local42.anInt4557 = local2[2] - anInt3558;
				aClass38_28.method1426(local42);
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(Lclient!qa;IIII)V")
	private static void method3231(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = anInt3560 - anInt3561;
		@Pc(7) int local7 = anInt3562 - anInt3559;
		if (anInt3560 < anInt3555) {
			local3++;
		}
		if (anInt3562 < anInt3551) {
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
			local28 = (arg1 * local17 >> 16) + anInt3556;
			local40 = (arg1 * (local17 + 1) >> 16) + anInt3556;
			local44 = local40 - local28;
			if (local44 > 0) {
				local50 = anInt3561 + local17;
				if (local50 >= 0 && local50 < anInt3555) {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt3554 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt3554 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (local84 > 0) {
							local93 = local57 + anInt3559;
							local173 = local50 + local93 * anInt3555;
							local175 = 0;
							local177 = 0;
							local179 = 0;
							if (local93 >= 0 && local93 < anInt3551) {
								local175 = (aByteArray56[local173] & 0xFF) << 16 | aShortArray58[local173] & 0xFFFF;
								if (local175 != 0) {
									local175 |= 0xFF000000;
								}
								local177 = aByteArray54[local173] & 0xFF;
								local179 = aShortArray57[local173] & 0xFFFF;
							}
							if (local175 == 0 && local177 == 0 && local179 == 0) {
								if (aClass1_Sub1_Sub12_2.anInt5572 != -1) {
									local175 = aClass1_Sub1_Sub12_2.anInt5572 | 0xFF000000;
								} else if ((local17 + anInt3561 & 0x4) == (local57 + anInt3562 & 0x4)) {
									local175 = anIntArray280[aClass81_2.anInt2816 + 1];
								} else {
									local175 = -11840664;
								}
								if (local175 == 0) {
									local175 = -16777216;
								}
								arg0.f(local28, local70, local44, local84, local175, 0);
							} else if (local179 <= 0) {
								method3218(arg0, local28, local70, local44, local84, local175, local177, aByteArray57[local173], null, null, true);
							} else if (local179 == 65535) {
								@Pc(282) Class1_Sub44 local282 = (Class1_Sub44) aClass174_10.method4422((long) (local50 << 16 | local93));
								if (local282 != null) {
									method3218(arg0, local28, local70, local44, local84, local175, local177, aByteArray57[local173], local282.aShortArray135, local282.aByteArray94, true);
								}
							} else {
								aShortArray56[0] = (short) (local179 - 1);
								aByteArray52[0] = aByteArray55[local173];
								method3218(arg0, local28, local70, local44, local84, local175, local177, aByteArray57[local173], aShortArray56, aByteArray52, true);
							}
						}
					}
				} else {
					for (local57 = 0; local57 < local7; local57++) {
						local70 = anInt3554 - (arg2 * (local57 + 1) >> 16);
						local80 = anInt3554 - (arg2 * local57 >> 16);
						local84 = local80 - local70;
						if (aClass1_Sub1_Sub12_2.anInt5572 != -1) {
							local93 = aClass1_Sub1_Sub12_2.anInt5572 | 0xFF000000;
						} else if ((local17 + anInt3561 & 0x4) == (local57 + anInt3562 & 0x4)) {
							local93 = anIntArray280[aClass81_2.anInt2816 + 1];
						} else {
							local93 = -11840664;
						}
						if (local93 == 0) {
							local93 = -16777216;
						}
						arg0.f(local28, local70, local44, local84, local93, 0);
					}
				}
			}
		}
		for (local28 = -16; local28 < local3 + 16; local28++) {
			local40 = (arg1 * local28 >> 16) + anInt3556;
			local44 = (arg1 * (local28 + 1) >> 16) + anInt3556;
			local50 = local44 - local40;
			if (local50 > 0) {
				local57 = local28 + anInt3561;
				if (local57 >= 0 && local57 < anInt3555) {
					for (local70 = -16; local70 < local7 + 16; local70++) {
						local80 = anInt3554 - (arg2 * (local70 + 1) >> 16);
						local84 = anInt3554 - (arg2 * local70 >> 16);
						local93 = local84 - local80;
						if (local93 > 0) {
							local173 = local70 + anInt3559;
							if (local173 >= 0 && local173 < anInt3551) {
								local175 = aShortArray57[local57 + local173 * anInt3555] & 0xFFFF;
								if (local175 <= 0) {
									method3211(arg0, local40, local80, local50, local93, null, null);
								} else if (local175 == 65535) {
									@Pc(459) Class1_Sub44 local459 = (Class1_Sub44) aClass174_10.method4422((long) (local57 << 16 | local173));
									if (local459 != null) {
										method3211(arg0, local40, local80, local50, local93, local459.aShortArray135, local459.aByteArray94);
									}
								} else {
									aShortArray56[0] = (short) (local175 - 1);
									aByteArray52[0] = aByteArray55[local57 + local173 * anInt3555];
									method3211(arg0, local40, local80, local50, local93, aShortArray56, aByteArray52);
								}
							}
						}
					}
				}
			}
		}
		local40 = anInt3561 >> 6;
		local44 = anInt3559 >> 6;
		if (local40 < 0) {
			local40 = 0;
		}
		if (local44 < 0) {
			local44 = 0;
		}
		local50 = anInt3560 >> 6;
		local57 = anInt3562 >> 6;
		if (local50 >= aClass145ArrayArrayArray2[0].length) {
			local50 = aClass145ArrayArrayArray2[0].length - 1;
		}
		if (local57 >= aClass145ArrayArrayArray2[0][0].length) {
			local57 = aClass145ArrayArrayArray2[0][0].length - 1;
		}
		for (local70 = 0; local70 < 3; local70++) {
			@Pc(641) int local641;
			@Pc(653) int local653;
			@Pc(665) int local665;
			@Pc(675) int local675;
			@Pc(631) int local631;
			for (local80 = local40; local80 <= local50; local80++) {
				for (local84 = local44; local84 <= local57; local84++) {
					@Pc(589) Class145 local589 = aClass145ArrayArrayArray2[local70][local80][local84];
					if (local589 != null) {
						local173 = (local80 + (anInt3553 >> 6)) * 64;
						local175 = (local84 + (anInt3558 >> 6)) * 64;
						for (@Pc(612) Class2_Sub5 local612 = (Class2_Sub5) local589.method3919(); local612 != null; local612 = (Class2_Sub5) local589.method3926()) {
							local179 = local173 + local612.aByte34 - anInt3553 - anInt3561;
							local631 = local175 + local612.aByte32 - anInt3558 - anInt3559;
							local641 = (arg1 * local179 >> 16) + anInt3556;
							local653 = (arg1 * (local179 + 1) >> 16) + anInt3556;
							local665 = anInt3554 - (arg2 * (local631 + 1) >> 16);
							local675 = anInt3554 - (arg2 * local631 >> 16);
							method3218(arg0, local641, local665, local653 - local641, local675 - local665, local612.anInt3873, local612.aByte31 & 0xFF, local612.aByte33, local612.aShortArray65, local612.aByteArray61, false);
						}
					}
				}
			}
			for (local84 = local40; local84 <= local50; local84++) {
				for (local93 = local44; local93 <= local57; local93++) {
					@Pc(727) Class145 local727 = aClass145ArrayArrayArray2[local70][local84][local93];
					if (local727 != null) {
						local175 = (local84 + (anInt3553 >> 6)) * 64;
						local177 = (local93 + (anInt3558 >> 6)) * 64;
						for (@Pc(750) Class2_Sub5 local750 = (Class2_Sub5) local727.method3919(); local750 != null; local750 = (Class2_Sub5) local727.method3926()) {
							local631 = local175 + local750.aByte34 - anInt3553 - anInt3561;
							local641 = local177 + local750.aByte32 - anInt3558 - anInt3559;
							local653 = (arg1 * local631 >> 16) + anInt3556;
							local665 = (arg1 * (local631 + 1) >> 16) + anInt3556;
							local675 = anInt3554 - (arg2 * (local641 + 1) >> 16);
							@Pc(813) int local813 = anInt3554 - (arg2 * local641 >> 16);
							method3211(arg0, local653, local675, local665 - local653, local813 - local675, local750.aShortArray65, local750.aByteArray61);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!kda;Lclient!er;Lclient!caa;Lclient!mm;Lclient!re;Lclient!kl;Lclient!nc;)V")
	public static void method3232(@OriginalArg(0) Class160 arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(3) Class194 arg3, @OriginalArg(4) Class250 arg4, @OriginalArg(5) Class165 arg5, @OriginalArg(6) Interface10 arg6) {
		aClass160_36 = arg0;
		aClass81_2 = arg1;
		aClass40_3 = arg2;
		aClass194_4 = arg3;
		aClass250_3 = arg4;
		aClass165_2 = arg5;
		anInterface10_2 = arg6;
		aClass174_9.method4423();
		@Pc(21) int local21 = aClass160_36.method4199("details");
		@Pc(26) int[] local26 = aClass160_36.method4226(local21);
		if (local26 != null) {
			for (@Pc(30) int local30 = 0; local30 < local26.length; local30++) {
				@Pc(39) Class1_Sub1_Sub12 local39 = Static501.method7185(aClass160_36, local26[local30], local21);
				aClass174_9.method4420(local39, (long) local39.anInt5567);
			}
		}
		Static105.method2288(true, false);
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
	public static void method3233(@OriginalArg(0) int arg0) {
		aClass1_Sub1_Sub12_2 = (Class1_Sub1_Sub12) aClass174_9.method4422((long) arg0);
	}
}
