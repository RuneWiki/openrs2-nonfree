import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!nca", name = "l", descriptor = "[Lclient!kq;")
	public static Class8_Sub5[] aClass8_Sub5Array1;

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(III)I")
	public static int method5646(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local7 *= arg1;
			}
			arg0 >>= 0x1;
			arg1 *= arg1;
		}
		if (arg0 == 1) {
			return arg1 * local7;
		} else {
			return local7;
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(BLclient!ub;)V")
	public static void method5647(@OriginalArg(1) Class5_Sub23_Sub2 arg0) {
		@Pc(7) int local7 = 0;
		arg0.method8549();
		@Pc(25) int local25;
		@Pc(60) int local60;
		for (@Pc(17) int local17 = 0; local17 < Static116.anInt3318; local17++) {
			local25 = Static88.anIntArray464[local17];
			if ((Static98.aByteArray8[local25] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static98.aByteArray8[local25] = (byte) (Static98.aByteArray8[local25] | 0x2);
				} else {
					local60 = arg0.method8550(1);
					if (local60 == 0) {
						local7 = Static167.method2410(arg0);
						Static98.aByteArray8[local25] = (byte) (Static98.aByteArray8[local25] | 0x2);
					} else {
						Static357.method5336(arg0, local25);
					}
				}
			}
		}
		arg0.method8548();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method8549();
		@Pc(153) int local153;
		for (local25 = 0; local25 < Static116.anInt3318; local25++) {
			local60 = Static88.anIntArray464[local25];
			if ((Static98.aByteArray8[local60] & 0x1) != 0) {
				if (local7 > 0) {
					Static98.aByteArray8[local60] = (byte) (Static98.aByteArray8[local60] | 0x2);
					local7--;
				} else {
					local153 = arg0.method8550(1);
					if (local153 == 0) {
						local7 = Static167.method2410(arg0);
						Static98.aByteArray8[local60] = (byte) (Static98.aByteArray8[local60] | 0x2);
					} else {
						Static357.method5336(arg0, local60);
					}
				}
			}
		}
		arg0.method8548();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method8549();
		@Pc(252) int local252;
		for (local60 = 0; local60 < Static106.anInt1728; local60++) {
			local153 = Static377.anIntArray372[local60];
			if ((Static98.aByteArray8[local153] & 0x1) != 0) {
				if (local7 > 0) {
					Static98.aByteArray8[local153] = (byte) (Static98.aByteArray8[local153] | 0x2);
					local7--;
				} else {
					local252 = arg0.method8550(1);
					if (local252 == 0) {
						local7 = Static167.method2410(arg0);
						Static98.aByteArray8[local153] = (byte) (Static98.aByteArray8[local153] | 0x2);
					} else if (Static403.method5924(local153, arg0)) {
						Static98.aByteArray8[local153] = (byte) (Static98.aByteArray8[local153] | 0x2);
					}
				}
			}
		}
		arg0.method8548();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method8549();
		for (local153 = 0; local153 < Static106.anInt1728; local153++) {
			local252 = Static377.anIntArray372[local153];
			if ((Static98.aByteArray8[local252] & 0x1) == 0) {
				if (local7 > 0) {
					Static98.aByteArray8[local252] = (byte) (Static98.aByteArray8[local252] | 0x2);
					local7--;
				} else {
					@Pc(366) int local366 = arg0.method8550(1);
					if (local366 == 0) {
						local7 = Static167.method2410(arg0);
						Static98.aByteArray8[local252] = (byte) (Static98.aByteArray8[local252] | 0x2);
					} else if (Static403.method5924(local252, arg0)) {
						Static98.aByteArray8[local252] = (byte) (Static98.aByteArray8[local252] | 0x2);
					}
				}
			}
		}
		arg0.method8548();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static116.anInt3318 = 0;
		Static106.anInt1728 = 0;
		for (local252 = 1; local252 < 2048; local252++) {
			Static98.aByteArray8[local252] = (byte) (Static98.aByteArray8[local252] >> 1);
			@Pc(451) Class8_Sub1_Sub3_Sub2_Sub1 local451 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local252];
			if (local451 == null) {
				Static377.anIntArray372[Static106.anInt1728++] = local252;
			} else {
				Static88.anIntArray464[Static116.anInt3318++] = local252;
			}
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIILjava/lang/String;Z)V")
	public static void method5648(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) boolean arg3) {
		Static429.method6351(arg1, (String) null, false, arg2, arg3, arg0);
	}
}
