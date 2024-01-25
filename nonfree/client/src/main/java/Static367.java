import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!sr", name = "e", descriptor = "I")
	public static int anInt6303 = -1;

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "[Z")
	public static final boolean[] aBooleanArray23 = new boolean[100];

	@OriginalMember(owner = "client!sr", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray45 = new String[100];

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIII)V")
	public static void method4995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static217.anInt4191 = arg0;
		Static12.anInt292 = arg1;
		Static95.anInt2335 = arg3;
		Static124.anInt6124 = arg2;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!vc;Z)V")
	public static void method4997(@OriginalArg(0) Class2_Sub23_Sub2 arg0) {
		arg0.method5515();
		@Pc(10) int local10 = 0;
		@Pc(18) int local18;
		@Pc(46) int local46;
		for (@Pc(12) int local12 = 0; local12 < Static337.anInt5822; local12++) {
			local18 = Static203.anIntArray384[local12];
			if ((Static361.aByteArray118[local18] & 0x1) == 0) {
				if (local10 > 0) {
					Static361.aByteArray118[local18] = (byte) (Static361.aByteArray118[local18] | 0x2);
					local10--;
				} else {
					local46 = arg0.method5519(1);
					if (local46 == 0) {
						local10 = Static218.method3413(arg0);
						Static361.aByteArray118[local18] = (byte) (Static361.aByteArray118[local18] | 0x2);
					} else {
						Static428.method5623(local18, arg0);
					}
				}
			}
		}
		arg0.method5513();
		if (local10 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method5515();
		@Pc(126) int local126;
		for (local18 = 0; local18 < Static337.anInt5822; local18++) {
			local46 = Static203.anIntArray384[local18];
			if ((Static361.aByteArray118[local46] & 0x1) != 0) {
				if (local10 > 0) {
					Static361.aByteArray118[local46] = (byte) (Static361.aByteArray118[local46] | 0x2);
					local10--;
				} else {
					local126 = arg0.method5519(1);
					if (local126 == 0) {
						local10 = Static218.method3413(arg0);
						Static361.aByteArray118[local46] = (byte) (Static361.aByteArray118[local46] | 0x2);
					} else {
						Static428.method5623(local46, arg0);
					}
				}
			}
		}
		arg0.method5513();
		if (local10 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method5515();
		@Pc(197) int local197;
		for (local46 = 0; local46 < Static117.anInt2663; local46++) {
			local126 = Static376.anIntArray543[local46];
			if ((Static361.aByteArray118[local126] & 0x1) != 0) {
				if (local10 > 0) {
					local10--;
					Static361.aByteArray118[local126] = (byte) (Static361.aByteArray118[local126] | 0x2);
				} else {
					local197 = arg0.method5519(1);
					if (local197 == 0) {
						local10 = Static218.method3413(arg0);
						Static361.aByteArray118[local126] = (byte) (Static361.aByteArray118[local126] | 0x2);
					} else if (Static239.method3692(arg0, local126)) {
						Static361.aByteArray118[local126] = (byte) (Static361.aByteArray118[local126] | 0x2);
					}
				}
			}
		}
		arg0.method5513();
		if (local10 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method5515();
		for (local126 = 0; local126 < Static117.anInt2663; local126++) {
			local197 = Static376.anIntArray543[local126];
			if ((Static361.aByteArray118[local197] & 0x1) == 0) {
				if (local10 > 0) {
					local10--;
					Static361.aByteArray118[local197] = (byte) (Static361.aByteArray118[local197] | 0x2);
				} else {
					@Pc(284) int local284 = arg0.method5519(1);
					if (local284 == 0) {
						local10 = Static218.method3413(arg0);
						Static361.aByteArray118[local197] = (byte) (Static361.aByteArray118[local197] | 0x2);
					} else if (Static239.method3692(arg0, local197)) {
						Static361.aByteArray118[local197] = (byte) (Static361.aByteArray118[local197] | 0x2);
					}
				}
			}
		}
		arg0.method5513();
		if (local10 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static337.anInt5822 = 0;
		Static117.anInt2663 = 0;
		for (local197 = 1; local197 < 2048; local197++) {
			Static361.aByteArray118[local197] = (byte) (Static361.aByteArray118[local197] >> 1);
			@Pc(352) Class3_Sub2_Sub1_Sub2 local352 = Static74.aClass3_Sub2_Sub1_Sub2Array1[local197];
			if (local352 == null) {
				Static376.anIntArray543[Static117.anInt2663++] = local197;
			} else {
				Static203.anIntArray384[Static337.anInt5822++] = local197;
			}
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(ZI)Lclient!mf;")
	public static Class8_Sub5 method4998(@OriginalArg(1) int arg0) {
		@Pc(7) Class112[] local7 = Class267.aClass112Array1;
		synchronized (Class267.aClass112Array1) {
			@Pc(28) Class8_Sub5 local28;
			if (arg0 >= Class267.aClass112Array1.length || Class267.aClass112Array1[arg0].method2545()) {
				local28 = new Class8_Sub5();
				local28.aClass8_Sub4Array1 = new Class8_Sub4[arg0];
				for (@Pc(34) int local34 = 0; local34 < arg0; local34++) {
					local28.aClass8_Sub4Array1[local34] = new Class8_Sub4();
				}
			} else {
				local28 = (Class8_Sub5) Class267.aClass112Array1[arg0].method2547();
				local28.method5780();
				@Pc(67) int local67 = Static98.anIntArray184[arg0]--;
			}
			return local28;
		}
	}
}
