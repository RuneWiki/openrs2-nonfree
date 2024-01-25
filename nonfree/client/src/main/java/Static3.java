import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ac", name = "v", descriptor = "I")
	public static int anInt5811;

	@OriginalMember(owner = "client!ac", name = "z", descriptor = "Lclient!o;")
	public static Class6 aClass6_46;

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
	public static int anInt5806 = 0;

	@OriginalMember(owner = "client!ac", name = "r", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_147 = new Class12(87, 16);

	@OriginalMember(owner = "client!ac", name = "s", descriptor = "[I")
	public static final int[] anIntArray399 = new int[5];

	@OriginalMember(owner = "client!ac", name = "t", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray39 = new String[200];

	@OriginalMember(owner = "client!ac", name = "u", descriptor = "J")
	public static long aLong174 = 0L;

	@OriginalMember(owner = "client!ac", name = "w", descriptor = "Lclient!sr;")
	public static final Class227 aClass227_36 = new Class227();

	@OriginalMember(owner = "client!ac", name = "x", descriptor = "[I")
	public static final int[] anIntArray400 = new int[1];

	@OriginalMember(owner = "client!ac", name = "y", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray40 = new String[100];

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "([ILclient!ur;IIZI)Lclient!al;")
	public static Class10_Sub1_Sub1 method4548(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class34_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1.aBoolean768 || Static90.method1429(arg3) && Static90.method1429(arg2)) {
			return new Class10_Sub1_Sub1(arg1, 3553, arg3, arg2, false, arg0);
		} else if (arg1.aBoolean759) {
			return new Class10_Sub1_Sub1(arg1, 34037, arg3, arg2, false, arg0);
		} else {
			return new Class10_Sub1_Sub1(arg1, arg3, arg2, Static191.method2740(arg3), Static191.method2740(arg2), arg0);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I[B)[B")
	public static byte[] method4549(@OriginalArg(1) byte[] arg0) {
		@Pc(11) int local11 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local11];
		Static468.method5036(arg0, 0, local14, 0, local11);
		return local14;
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
	public static void method4550() {
		Static423.aClass227_39 = new Class227();
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZLclient!jk;III)V")
	public static void method4551(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class124 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = arg1.anInt3376;
		@Pc(11) int local11 = arg1.anInt3356;
		if (arg1.aByte48 == 0) {
			arg1.anInt3376 = arg1.anInt3377;
		} else if (arg1.aByte48 == 1) {
			arg1.anInt3376 = arg3 - arg1.anInt3377;
		} else if (arg1.aByte48 == 2) {
			arg1.anInt3376 = arg1.anInt3377 * arg3 >> 14;
		}
		if (arg1.aByte47 == 0) {
			arg1.anInt3356 = arg1.anInt3346;
		} else if (arg1.aByte47 == 1) {
			arg1.anInt3356 = arg2 - arg1.anInt3346;
		} else if (arg1.aByte47 == 2) {
			arg1.anInt3356 = arg1.anInt3346 * arg2 >> 14;
		}
		if (arg1.aByte48 == 4) {
			arg1.anInt3376 = arg1.anInt3356 * arg1.lb / arg1.anInt3362;
		}
		if (arg1.aByte47 == 4) {
			arg1.anInt3356 = arg1.anInt3362 * arg1.anInt3376 / arg1.lb;
		}
		if (Static239.aBoolean665 && (Static55.method970(arg1).anInt3464 != 0 || arg1.anInt3417 == 0)) {
			if (arg1.anInt3356 < 5 && arg1.anInt3376 < 5) {
				arg1.anInt3376 = 5;
				arg1.anInt3356 = 5;
			} else {
				if (arg1.anInt3356 <= 0) {
					arg1.anInt3356 = 5;
				}
				if (arg1.anInt3376 <= 0) {
					arg1.anInt3376 = 5;
				}
			}
		}
		if (Static4.anInt67 == arg1.anInt3413) {
			Static210.aClass124_4 = arg1;
		}
		if (arg0 && arg1.anObjectArray5 != null && (arg1.anInt3376 != local8 || arg1.anInt3356 != local11)) {
			@Pc(186) Class1_Sub40 local186 = new Class1_Sub40();
			local186.anObjectArray36 = arg1.anObjectArray5;
			local186.aClass124_14 = arg1;
			Static254.aClass227_28.method4972(local186);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
	public static void method4552() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static34.aBooleanArray2[local7] = false;
		}
		Static283.anInt4984 = -1;
		Static223.anInt5857 = 0;
		Static333.anInt5693 = 1;
		Static383.anInt6391 = 0;
		Static142.anInt2499 = -1;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLclient!kh;)V")
	public static void method4553(@OriginalArg(1) Class1_Sub28_Sub1 arg0) {
		@Pc(7) int local7 = 0;
		arg0.method3077();
		@Pc(18) int local18;
		@Pc(49) int local49;
		for (@Pc(12) int local12 = 0; local12 < Static285.anInt5015; local12++) {
			local18 = Static103.anIntArray135[local12];
			if ((Static349.aByteArray74[local18] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static349.aByteArray74[local18] = (byte) (Static349.aByteArray74[local18] | 0x2);
				} else {
					local49 = arg0.method3084(1);
					if (local49 == 0) {
						local7 = Static159.method2301(arg0);
						Static349.aByteArray74[local18] = (byte) (Static349.aByteArray74[local18] | 0x2);
					} else {
						Static454.method5917(arg0, local18);
					}
				}
			}
		}
		arg0.method3083();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method3077();
		@Pc(128) int local128;
		for (local18 = 0; local18 < Static285.anInt5015; local18++) {
			local49 = Static103.anIntArray135[local18];
			if ((Static349.aByteArray74[local49] & 0x1) != 0) {
				if (local7 > 0) {
					Static349.aByteArray74[local49] = (byte) (Static349.aByteArray74[local49] | 0x2);
					local7--;
				} else {
					local128 = arg0.method3084(1);
					if (local128 == 0) {
						local7 = Static159.method2301(arg0);
						Static349.aByteArray74[local49] = (byte) (Static349.aByteArray74[local49] | 0x2);
					} else {
						Static454.method5917(arg0, local49);
					}
				}
			}
		}
		arg0.method3083();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method3077();
		@Pc(202) int local202;
		for (local49 = 0; local49 < Static145.anInt1965; local49++) {
			local128 = Static308.anIntArray354[local49];
			if ((Static349.aByteArray74[local128] & 0x1) != 0) {
				if (local7 > 0) {
					Static349.aByteArray74[local128] = (byte) (Static349.aByteArray74[local128] | 0x2);
					local7--;
				} else {
					local202 = arg0.method3084(1);
					if (local202 == 0) {
						local7 = Static159.method2301(arg0);
						Static349.aByteArray74[local128] = (byte) (Static349.aByteArray74[local128] | 0x2);
					} else if (Static147.method5938(local128, arg0)) {
						Static349.aByteArray74[local128] = (byte) (Static349.aByteArray74[local128] | 0x2);
					}
				}
			}
		}
		arg0.method3083();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method3077();
		for (local128 = 0; local128 < Static145.anInt1965; local128++) {
			local202 = Static308.anIntArray354[local128];
			if ((Static349.aByteArray74[local202] & 0x1) == 0) {
				if (local7 > 0) {
					Static349.aByteArray74[local202] = (byte) (Static349.aByteArray74[local202] | 0x2);
					local7--;
				} else {
					@Pc(290) int local290 = arg0.method3084(1);
					if (local290 == 0) {
						local7 = Static159.method2301(arg0);
						Static349.aByteArray74[local202] = (byte) (Static349.aByteArray74[local202] | 0x2);
					} else if (Static147.method5938(local202, arg0)) {
						Static349.aByteArray74[local202] = (byte) (Static349.aByteArray74[local202] | 0x2);
					}
				}
			}
		}
		arg0.method3083();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static285.anInt5015 = 0;
		Static145.anInt1965 = 0;
		for (local202 = 1; local202 < 2048; local202++) {
			Static349.aByteArray74[local202] = (byte) (Static349.aByteArray74[local202] >> 1);
			@Pc(363) Class25_Sub5_Sub1_Sub2 local363 = Static28.aClass25_Sub5_Sub1_Sub2Array1[local202];
			if (local363 == null) {
				Static308.anIntArray354[Static145.anInt1965++] = local202;
			} else {
				Static103.anIntArray135[Static285.anInt5015++] = local202;
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!wk;I)V")
	public static void method4556(@OriginalArg(0) Class25_Sub5_Sub1 arg0) {
		@Pc(9) int local9 = arg0.anInt4285 - Static236.anInt4213;
		@Pc(20) int local20 = arg0.anInt4286 * 128 + arg0.method3427() * 64;
		@Pc(32) int local32 = arg0.anInt4282 * 128 + arg0.method3427() * 64;
		arg0.anInt5518 += (local20 - arg0.anInt5518) / local9;
		arg0.anInt5514 += (local32 - arg0.anInt5514) / local9;
		arg0.anInt4315 = 0;
		if (arg0.anInt4273 == 0) {
			arg0.method3416(8192);
		}
		if (arg0.anInt4273 == 1) {
			arg0.method3416(12288);
		}
		if (arg0.anInt4273 == 2) {
			arg0.method3416(0);
		}
		if (arg0.anInt4273 == 3) {
			arg0.method3416(4096);
		}
	}
}
