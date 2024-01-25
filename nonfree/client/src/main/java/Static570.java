import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static570 {

	@OriginalMember(owner = "client!wh", name = "E", descriptor = "I")
	public static int anInt9637;

	@OriginalMember(owner = "client!wh", name = "D", descriptor = "[I")
	public static final int[] anIntArray828 = new int[8];

	@OriginalMember(owner = "client!wh", name = "J", descriptor = "I")
	public static int anInt9640 = 0;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILclient!lt;)V")
	public static void method8039(@OriginalArg(1) Class6_Sub26_Sub2 arg0) {
		arg0.method5002();
		@Pc(10) int local10 = 0;
		@Pc(18) int local18;
		@Pc(49) int local49;
		for (@Pc(12) int local12 = 0; local12 < Static81.anInt1953; local12++) {
			local18 = Static227.anIntArray309[local12];
			if ((Static375.aByteArray80[local18] & 0x1) == 0) {
				if (local10 > 0) {
					Static375.aByteArray80[local18] = (byte) (Static375.aByteArray80[local18] | 0x2);
					local10--;
				} else {
					local49 = arg0.method5008(1);
					if (local49 == 0) {
						local10 = Static138.method2590(arg0);
						Static375.aByteArray80[local18] = (byte) (Static375.aByteArray80[local18] | 0x2);
					} else {
						Static291.method4785(local18, arg0);
					}
				}
			}
		}
		arg0.method5006();
		if (local10 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method5002();
		@Pc(130) int local130;
		for (local18 = 0; local18 < Static81.anInt1953; local18++) {
			local49 = Static227.anIntArray309[local18];
			if ((Static375.aByteArray80[local49] & 0x1) != 0) {
				if (local10 > 0) {
					local10--;
					Static375.aByteArray80[local49] = (byte) (Static375.aByteArray80[local49] | 0x2);
				} else {
					local130 = arg0.method5008(1);
					if (local130 == 0) {
						local10 = Static138.method2590(arg0);
						Static375.aByteArray80[local49] = (byte) (Static375.aByteArray80[local49] | 0x2);
					} else {
						Static291.method4785(local49, arg0);
					}
				}
			}
		}
		arg0.method5006();
		if (local10 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method5002();
		@Pc(210) int local210;
		for (local49 = 0; local49 < Static439.anInt8018; local49++) {
			local130 = Static36.anIntArray76[local49];
			if ((Static375.aByteArray80[local130] & 0x1) != 0) {
				if (local10 > 0) {
					Static375.aByteArray80[local130] = (byte) (Static375.aByteArray80[local130] | 0x2);
					local10--;
				} else {
					local210 = arg0.method5008(1);
					if (local210 == 0) {
						local10 = Static138.method2590(arg0);
						Static375.aByteArray80[local130] = (byte) (Static375.aByteArray80[local130] | 0x2);
					} else if (Static196.method3725(local130, arg0)) {
						Static375.aByteArray80[local130] = (byte) (Static375.aByteArray80[local130] | 0x2);
					}
				}
			}
		}
		arg0.method5006();
		if (local10 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method5002();
		for (local130 = 0; local130 < Static439.anInt8018; local130++) {
			local210 = Static36.anIntArray76[local130];
			if ((Static375.aByteArray80[local210] & 0x1) == 0) {
				if (local10 > 0) {
					local10--;
					Static375.aByteArray80[local210] = (byte) (Static375.aByteArray80[local210] | 0x2);
				} else {
					@Pc(306) int local306 = arg0.method5008(1);
					if (local306 == 0) {
						local10 = Static138.method2590(arg0);
						Static375.aByteArray80[local210] = (byte) (Static375.aByteArray80[local210] | 0x2);
					} else if (Static196.method3725(local210, arg0)) {
						Static375.aByteArray80[local210] = (byte) (Static375.aByteArray80[local210] | 0x2);
					}
				}
			}
		}
		arg0.method5006();
		if (local10 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static439.anInt8018 = 0;
		Static81.anInt1953 = 0;
		for (local210 = 1; local210 < 2048; local210++) {
			Static375.aByteArray80[local210] = (byte) (Static375.aByteArray80[local210] >> 1);
			@Pc(374) Class11_Sub1_Sub1_Sub2 local374 = Static239.aClass11_Sub1_Sub1_Sub2Array1[local210];
			if (local374 == null) {
				Static36.anIntArray76[Static439.anInt8018++] = local210;
			} else {
				Static227.anIntArray309[Static81.anInt1953++] = local210;
			}
		}
	}
}
