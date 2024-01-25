import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!cea", name = "C", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_21 = new Class337(6, 6);

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(ILclient!cca;)I")
	public static int method1091(@OriginalArg(1) Class4_Sub2_Sub1_Sub1_Sub2 arg0) {
		@Pc(8) Class225 local8 = arg0.aClass225_1;
		if (local8.anIntArray304 != null) {
			local8 = local8.method4990(Static301.aClass59_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(31) int local31 = local8.anInt5640;
		@Pc(35) Class269 local35 = arg0.method1025();
		if (arg0.anInt1264 == -1 || arg0.aBoolean70) {
			local31 = local8.anInt5621;
		} else if (local35.anInt7255 == arg0.anInt1264 || local35.anInt7248 == arg0.anInt1264 || arg0.anInt1264 == local35.anInt7264 || arg0.anInt1264 == local35.anInt7257) {
			local31 = local8.anInt5650;
		} else if (local35.anInt7256 == arg0.anInt1264 || local35.anInt7251 == arg0.anInt1264 || arg0.anInt1264 == local35.anInt7277 || arg0.anInt1264 == local35.anInt7287) {
			local31 = local8.anInt5614;
		}
		return local31;
	}

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "(Z)Lclient!sr;")
	public static Class5_Sub48 method1093() {
		@Pc(6) Class5_Sub48 local6 = Static78.method1355();
		local6.anInt8985 = 0;
		local6.aClass46_97 = null;
		local6.aClass5_Sub22_Sub1_2 = new Class5_Sub22_Sub1(5000);
		return local6;
	}

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "(ILclient!gba;)V")
	public static void method1094(@OriginalArg(1) Class5_Sub22_Sub1 arg0) {
		@Pc(7) int local7 = 0;
		arg0.method2658();
		@Pc(18) int local18;
		@Pc(46) int local46;
		for (@Pc(12) int local12 = 0; local12 < Static320.anInt5442; local12++) {
			local18 = Static278.anIntArray264[local12];
			if ((Static466.aByteArray75[local18] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static466.aByteArray75[local18] = (byte) (Static466.aByteArray75[local18] | 0x2);
				} else {
					local46 = arg0.method2655(1);
					if (local46 == 0) {
						local7 = Static611.method8100(arg0);
						Static466.aByteArray75[local18] = (byte) (Static466.aByteArray75[local18] | 0x2);
					} else {
						Static345.method5169(local18, arg0);
					}
				}
			}
		}
		arg0.method2659();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method2658();
		@Pc(127) int local127;
		for (local18 = 0; local18 < Static320.anInt5442; local18++) {
			local46 = Static278.anIntArray264[local18];
			if ((Static466.aByteArray75[local46] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					Static466.aByteArray75[local46] = (byte) (Static466.aByteArray75[local46] | 0x2);
				} else {
					local127 = arg0.method2655(1);
					if (local127 == 0) {
						local7 = Static611.method8100(arg0);
						Static466.aByteArray75[local46] = (byte) (Static466.aByteArray75[local46] | 0x2);
					} else {
						Static345.method5169(local46, arg0);
					}
				}
			}
		}
		arg0.method2659();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method2658();
		@Pc(207) int local207;
		for (local46 = 0; local46 < Static188.anInt9410; local46++) {
			local127 = Static289.anIntArray272[local46];
			if ((Static466.aByteArray75[local127] & 0x1) != 0) {
				if (local7 > 0) {
					Static466.aByteArray75[local127] = (byte) (Static466.aByteArray75[local127] | 0x2);
					local7--;
				} else {
					local207 = arg0.method2655(1);
					if (local207 == 0) {
						local7 = Static611.method8100(arg0);
						Static466.aByteArray75[local127] = (byte) (Static466.aByteArray75[local127] | 0x2);
					} else if (Static72.method1222(local127, arg0)) {
						Static466.aByteArray75[local127] = (byte) (Static466.aByteArray75[local127] | 0x2);
					}
				}
			}
		}
		arg0.method2659();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method2658();
		for (local127 = 0; local127 < Static188.anInt9410; local127++) {
			local207 = Static289.anIntArray272[local127];
			if ((Static466.aByteArray75[local207] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static466.aByteArray75[local207] = (byte) (Static466.aByteArray75[local207] | 0x2);
				} else {
					@Pc(301) int local301 = arg0.method2655(1);
					if (local301 == 0) {
						local7 = Static611.method8100(arg0);
						Static466.aByteArray75[local207] = (byte) (Static466.aByteArray75[local207] | 0x2);
					} else if (Static72.method1222(local207, arg0)) {
						Static466.aByteArray75[local207] = (byte) (Static466.aByteArray75[local207] | 0x2);
					}
				}
			}
		}
		arg0.method2659();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static320.anInt5442 = 0;
		Static188.anInt9410 = 0;
		for (local207 = 1; local207 < 2048; local207++) {
			Static466.aByteArray75[local207] = (byte) (Static466.aByteArray75[local207] >> 1);
			@Pc(370) Class4_Sub2_Sub1_Sub1_Sub1 local370 = Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[local207];
			if (local370 == null) {
				Static289.anIntArray272[Static188.anInt9410++] = local207;
			} else {
				Static278.anIntArray264[Static320.anInt5442++] = local207;
			}
		}
	}
}
