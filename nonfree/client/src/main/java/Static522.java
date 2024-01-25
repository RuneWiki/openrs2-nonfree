import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static522 {

	@OriginalMember(owner = "client!u", name = "a", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_138 = new Class47(24, -1);

	@OriginalMember(owner = "client!u", name = "c", descriptor = "Lclient!hm;")
	public static final Class136 aClass136_101 = new Class136(64);

	@OriginalMember(owner = "client!u", name = "d", descriptor = "Z")
	public static boolean aBoolean636 = false;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILclient!qf;)V")
	public static void method7161(@OriginalArg(1) Class6_Sub21_Sub2 arg0) {
		@Pc(7) int local7 = 0;
		arg0.method6082();
		@Pc(18) int local18;
		@Pc(46) int local46;
		for (@Pc(12) int local12 = 0; local12 < Static231.anInt4727; local12++) {
			local18 = Static249.anIntArray372[local12];
			if ((Static294.aByteArray65[local18] & 0x1) == 0) {
				if (local7 > 0) {
					Static294.aByteArray65[local18] = (byte) (Static294.aByteArray65[local18] | 0x2);
					local7--;
				} else {
					local46 = arg0.method6078(1);
					if (local46 == 0) {
						local7 = Static300.method4761(arg0);
						Static294.aByteArray65[local18] = (byte) (Static294.aByteArray65[local18] | 0x2);
					} else {
						Static57.method1220(local18, arg0);
					}
				}
			}
		}
		arg0.method6076();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method6082();
		@Pc(127) int local127;
		for (local18 = 0; local18 < Static231.anInt4727; local18++) {
			local46 = Static249.anIntArray372[local18];
			if ((Static294.aByteArray65[local46] & 0x1) != 0) {
				if (local7 > 0) {
					Static294.aByteArray65[local46] = (byte) (Static294.aByteArray65[local46] | 0x2);
					local7--;
				} else {
					local127 = arg0.method6078(1);
					if (local127 == 0) {
						local7 = Static300.method4761(arg0);
						Static294.aByteArray65[local46] = (byte) (Static294.aByteArray65[local46] | 0x2);
					} else {
						Static57.method1220(local46, arg0);
					}
				}
			}
		}
		arg0.method6076();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method6082();
		@Pc(204) int local204;
		for (local46 = 0; local46 < Static17.anInt507; local46++) {
			local127 = Static86.anIntArray144[local46];
			if ((Static294.aByteArray65[local127] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					Static294.aByteArray65[local127] = (byte) (Static294.aByteArray65[local127] | 0x2);
				} else {
					local204 = arg0.method6078(1);
					if (local204 == 0) {
						local7 = Static300.method4761(arg0);
						Static294.aByteArray65[local127] = (byte) (Static294.aByteArray65[local127] | 0x2);
					} else if (Static449.method6348(arg0, local127)) {
						Static294.aByteArray65[local127] = (byte) (Static294.aByteArray65[local127] | 0x2);
					}
				}
			}
		}
		arg0.method6076();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method6082();
		for (local127 = 0; local127 < Static17.anInt507; local127++) {
			local204 = Static86.anIntArray144[local127];
			if ((Static294.aByteArray65[local204] & 0x1) == 0) {
				if (local7 > 0) {
					Static294.aByteArray65[local204] = (byte) (Static294.aByteArray65[local204] | 0x2);
					local7--;
				} else {
					@Pc(298) int local298 = arg0.method6078(1);
					if (local298 == 0) {
						local7 = Static300.method4761(arg0);
						Static294.aByteArray65[local204] = (byte) (Static294.aByteArray65[local204] | 0x2);
					} else if (Static449.method6348(arg0, local204)) {
						Static294.aByteArray65[local204] = (byte) (Static294.aByteArray65[local204] | 0x2);
					}
				}
			}
		}
		arg0.method6076();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static231.anInt4727 = 0;
		Static17.anInt507 = 0;
		for (local204 = 1; local204 < 2048; local204++) {
			Static294.aByteArray65[local204] = (byte) (Static294.aByteArray65[local204] >> 1);
			@Pc(363) Class4_Sub1_Sub1_Sub2 local363 = Static588.aClass4_Sub1_Sub1_Sub2Array3[local204];
			if (local363 == null) {
				Static86.anIntArray144[Static17.anInt507++] = local204;
			} else {
				Static249.anIntArray372[Static231.anInt4727++] = local204;
			}
		}
	}
}
