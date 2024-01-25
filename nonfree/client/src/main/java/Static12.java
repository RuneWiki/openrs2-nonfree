import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ai", name = "t", descriptor = "I")
	public static int anInt335 = 0;

	@OriginalMember(owner = "client!ai", name = "y", descriptor = "[I")
	public static final int[] anIntArray29 = new int[32];

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLjava/lang/String;Lclient!ji;)I")
	public static int method248(@OriginalArg(1) String arg0, @OriginalArg(2) Class6_Sub21 arg1) {
		@Pc(6) int local6 = arg1.anInt7338;
		@Pc(10) byte[] local10 = Static209.method3710(arg0);
		arg1.method6009(local10.length);
		arg1.anInt7338 += Static458.aClass356_1.method7812(local10.length, arg1.aByteArray93, 0, local10, arg1.anInt7338);
		return arg1.anInt7338 - local6;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
	public static void method252() {
		@Pc(9) int local9 = Static526.anInt8805 * 512 + 256;
		@Pc(15) int local15 = Static109.anInt2112 * 512 + 256;
		@Pc(24) int local24 = Static160.method2951(local15, local9, Static97.anInt1863) - Static25.anInt764;
		if (Static130.anInt2957 < 100) {
			if (Static371.anInt6572 < local9) {
				Static371.anInt6572 += Static489.anInt8245 + (local9 - Static371.anInt6572) * Static130.anInt2957 / 1000;
				if (local9 < Static371.anInt6572) {
					Static371.anInt6572 = local9;
				}
			}
			if (Static371.anInt6572 > local9) {
				Static371.anInt6572 -= Static489.anInt8245 + (Static371.anInt6572 - local9) * Static130.anInt2957 / 1000;
				if (local9 > Static371.anInt6572) {
					Static371.anInt6572 = local9;
				}
			}
			if (Static111.anInt2160 < local24) {
				Static111.anInt2160 += Static130.anInt2957 * (local24 - Static111.anInt2160) / 1000 + Static489.anInt8245;
				if (local24 < Static111.anInt2160) {
					Static111.anInt2160 = local24;
				}
			}
			if (Static322.anInt5904 < local15) {
				Static322.anInt5904 += (local15 - Static322.anInt5904) * Static130.anInt2957 / 1000 + Static489.anInt8245;
				if (local15 < Static322.anInt5904) {
					Static322.anInt5904 = local15;
				}
			}
			if (local24 < Static111.anInt2160) {
				Static111.anInt2160 -= Static130.anInt2957 * (Static111.anInt2160 - local24) / 1000 + Static489.anInt8245;
				if (local24 > Static111.anInt2160) {
					Static111.anInt2160 = local24;
				}
			}
			if (Static322.anInt5904 > local15) {
				Static322.anInt5904 -= (Static322.anInt5904 - local15) * Static130.anInt2957 / 1000 + Static489.anInt8245;
				if (local15 > Static322.anInt5904) {
					Static322.anInt5904 = local15;
				}
			}
		} else {
			Static371.anInt6572 = Static526.anInt8805 * 512 + 256;
			Static322.anInt5904 = Static109.anInt2112 * 512 + 256;
			Static111.anInt2160 = Static160.method2951(Static322.anInt5904, Static371.anInt6572, Static97.anInt1863) - Static25.anInt764;
		}
		local15 = Static42.anInt1021 * 512 + 256;
		local9 = Static190.anInt3955 * 512 + 256;
		local24 = Static160.method2951(local15, local9, Static97.anInt1863) - Static48.anInt1087;
		@Pc(233) int local233 = local9 - Static371.anInt6572;
		@Pc(237) int local237 = local24 - Static111.anInt2160;
		@Pc(242) int local242 = local15 - Static322.anInt5904;
		@Pc(253) int local253 = (int) Math.sqrt((double) (local233 * local233 + local242 * local242));
		@Pc(264) int local264 = (int) (Math.atan2((double) local237, (double) local253) * 2607.5945876176133D) & 0x3FFF;
		if (local264 < 1024) {
			local264 = 1024;
		}
		@Pc(282) int local282 = (int) (-2607.5945876176133D * Math.atan2((double) local233, (double) local242)) & 0x3FFF;
		if (local264 > 3072) {
			local264 = 3072;
		}
		if (local264 > Static67.anInt1407) {
			Static67.anInt1407 += Static397.anInt6953 * (local264 - Static67.anInt1407 >> 3) / 1000 + Static340.anInt6138 << 3;
			if (local264 < Static67.anInt1407) {
				Static67.anInt1407 = local264;
			}
		}
		if (local264 < Static67.anInt1407) {
			Static67.anInt1407 -= (Static67.anInt1407 - local264 >> 3) * Static397.anInt6953 / 1000 + Static340.anInt6138 << 3;
			if (Static67.anInt1407 < local264) {
				Static67.anInt1407 = local264;
			}
		}
		@Pc(356) int local356 = local282 - Static570.anInt9340;
		if (local356 > 8192) {
			local356 -= 16384;
		}
		if (local356 < -8192) {
			local356 += 16384;
		}
		local356 >>= 0x3;
		if (local356 > 0) {
			Static570.anInt9340 += Static340.anInt6138 + Static397.anInt6953 * local356 / 1000 << 3;
			Static570.anInt9340 &= 0x3FFF;
		}
		if (local356 < 0) {
			Static570.anInt9340 -= -local356 * Static397.anInt6953 / 1000 + Static340.anInt6138 << 3;
			Static570.anInt9340 &= 0x3FFF;
		}
		@Pc(414) int local414 = local282 - Static570.anInt9340;
		if (local414 > 8192) {
			local414 -= 16384;
		}
		if (local414 < -8192) {
			local414 += 16384;
		}
		if (local414 < 0 && local356 > 0 || local414 > 0 && local356 < 0) {
			Static570.anInt9340 = local282;
		}
		Static385.anInt6775 = 0;
	}
}
