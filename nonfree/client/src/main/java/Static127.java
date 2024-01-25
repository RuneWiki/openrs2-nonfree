import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!eha", name = "e", descriptor = "Lclient!sca;")
	public static Class304 aClass304_1;

	@OriginalMember(owner = "client!eha", name = "b", descriptor = "I")
	public static int anInt2678 = 0;

	@OriginalMember(owner = "client!eha", name = "d", descriptor = "Lclient!bw;")
	public static Class42 aClass42_1 = new Class42(8);

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(Lclient!jc;B)V")
	public static void method2500(@OriginalArg(0) Class3_Sub3_Sub2 arg0) {
		@Pc(7) int local7 = 0;
		arg0.method4273();
		@Pc(18) int local18;
		@Pc(49) int local49;
		for (@Pc(12) int local12 = 0; local12 < Static274.anInt4964; local12++) {
			local18 = Static70.anIntArray392[local12];
			if ((Static289.aByteArray95[local18] & 0x1) == 0) {
				if (local7 > 0) {
					Static289.aByteArray95[local18] = (byte) (Static289.aByteArray95[local18] | 0x2);
					local7--;
				} else {
					local49 = arg0.method4276(1);
					if (local49 == 0) {
						local7 = Static550.method6468(arg0);
						Static289.aByteArray95[local18] = (byte) (Static289.aByteArray95[local18] | 0x2);
					} else {
						Static409.method6496(local18, arg0);
					}
				}
			}
		}
		arg0.method4278();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method4273();
		@Pc(130) int local130;
		for (local18 = 0; local18 < Static274.anInt4964; local18++) {
			local49 = Static70.anIntArray392[local18];
			if ((Static289.aByteArray95[local49] & 0x1) != 0) {
				if (local7 > 0) {
					Static289.aByteArray95[local49] = (byte) (Static289.aByteArray95[local49] | 0x2);
					local7--;
				} else {
					local130 = arg0.method4276(1);
					if (local130 == 0) {
						local7 = Static550.method6468(arg0);
						Static289.aByteArray95[local49] = (byte) (Static289.aByteArray95[local49] | 0x2);
					} else {
						Static409.method6496(local49, arg0);
					}
				}
			}
		}
		arg0.method4278();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method4273();
		@Pc(191) int local191;
		@Pc(216) int local216;
		for (local130 = 0; local130 < Static327.anInt6118; local130++) {
			local191 = Static446.anIntArray493[local130];
			if ((Static289.aByteArray95[local191] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					Static289.aByteArray95[local191] = (byte) (Static289.aByteArray95[local191] | 0x2);
				} else {
					local216 = arg0.method4276(1);
					if (local216 == 0) {
						local7 = Static550.method6468(arg0);
						Static289.aByteArray95[local191] = (byte) (Static289.aByteArray95[local191] | 0x2);
					} else if (Static494.method7323(arg0, local191)) {
						Static289.aByteArray95[local191] = (byte) (Static289.aByteArray95[local191] | 0x2);
					}
				}
			}
		}
		arg0.method4278();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method4273();
		for (local191 = 0; local191 < Static327.anInt6118; local191++) {
			local216 = Static446.anIntArray493[local191];
			if ((Static289.aByteArray95[local216] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static289.aByteArray95[local216] = (byte) (Static289.aByteArray95[local216] | 0x2);
				} else {
					@Pc(300) int local300 = arg0.method4276(1);
					if (local300 == 0) {
						local7 = Static550.method6468(arg0);
						Static289.aByteArray95[local216] = (byte) (Static289.aByteArray95[local216] | 0x2);
					} else if (Static494.method7323(arg0, local216)) {
						Static289.aByteArray95[local216] = (byte) (Static289.aByteArray95[local216] | 0x2);
					}
				}
			}
		}
		arg0.method4278();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static274.anInt4964 = 0;
		Static327.anInt6118 = 0;
		for (local216 = 1; local216 < 2048; local216++) {
			Static289.aByteArray95[local216] = (byte) (Static289.aByteArray95[local216] >> 1);
			@Pc(368) Class4_Sub1_Sub2_Sub1_Sub2 local368 = Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local216];
			if (local368 == null) {
				Static446.anIntArray493[Static327.anInt6118++] = local216;
			} else {
				Static70.anIntArray392[Static274.anInt4964++] = local216;
			}
		}
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(IBI)Z")
	public static boolean method2501(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x22) != 0;
	}
}
