import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!mu", name = "i", descriptor = "Lclient!em;")
	public static final Class82 aClass82_12 = new Class82(3);

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "()V")
	public static void method5829() {
		if (Static262.anInt5743 == 0 || Static259.aClass25_9 == null) {
			return;
		}
		Static185.aClass33_8.K(Static116.anIntArray146);
		for (@Pc(12) int local12 = 0; local12 < Static585.anIntArray616.length; local12++) {
			Static185.aClass33_8.method6208(Static585.anIntArray616[local12] + Static324.anIntArray381[local12], Static116.anIntArray146[1], -256, Static116.anIntArray146[3] - Static116.anIntArray146[1]);
		}
		for (@Pc(41) int local41 = 0; local41 < Static476.anInt9172; local41++) {
			@Pc(46) Class92 local46 = Static14.aClass92Array16[local41];
			Static185.aClass33_8.H(local46.anIntArray188[0], local46.anIntArray189[0], local46.anIntArray187[0], Static309.anIntArray363);
			Static185.aClass33_8.H(local46.anIntArray188[1], local46.anIntArray189[1], local46.anIntArray187[1], Static177.anIntArray231);
			Static185.aClass33_8.H(local46.anIntArray188[2], local46.anIntArray189[2], local46.anIntArray187[2], Static99.anIntArray102);
			Static185.aClass33_8.H(local46.anIntArray188[3], local46.anIntArray189[3], local46.anIntArray187[3], Static277.anIntArray341);
			if (Static309.anIntArray363[2] != -1 && Static177.anIntArray231[2] != -1 && Static99.anIntArray102[2] != -1 && Static277.anIntArray341[2] != -1) {
				@Pc(128) int local128 = -65536;
				if (local46.aByte38 == 4) {
					local128 = -16776961;
				}
				Static185.aClass33_8.method6236(Static177.anIntArray231[1], Static177.anIntArray231[0], Static309.anIntArray363[1], local128, Static309.anIntArray363[0]);
				Static185.aClass33_8.method6236(Static99.anIntArray102[1], Static99.anIntArray102[0], Static177.anIntArray231[1], local128, Static177.anIntArray231[0]);
				Static185.aClass33_8.method6236(Static277.anIntArray341[1], Static277.anIntArray341[0], Static99.anIntArray102[1], local128, Static99.anIntArray102[0]);
				Static185.aClass33_8.method6236(Static309.anIntArray363[1], Static309.anIntArray363[0], Static277.anIntArray341[1], local128, Static277.anIntArray341[0]);
				Static185.aClass33_8.method6236(Static99.anIntArray102[1], Static99.anIntArray102[0], Static309.anIntArray363[1], local128, Static309.anIntArray363[0]);
			}
		}
		Static259.aClass25_9.method5838(-256, -16777216, "Dynamic: " + Static185.anInt4396 + "/" + 5000, 10, 75);
		Static259.aClass25_9.method5838(-256, -16777216, "Total Opaque Onscreen: " + Static161.anInt3884 + "/" + 10000, 10, 90);
		Static259.aClass25_9.method5838(-256, -16777216, "Total Trans Onscreen: " + Static592.anInt9872 + "/" + 5000, 10, 105);
		Static259.aClass25_9.method5838(-256, -16777216, "Occluders: " + (Static322.anInt6491 + Static244.anInt5486) + " Active: " + Static476.anInt9172, 10, 120);
		Static259.aClass25_9.method5838(-256, -16777216, "Occluded: Ground:" + Static106.anInt2655 + " Walls: " + Static323.anInt6498 + " CPs: " + Static104.anInt2625 + " Pixels: " + Static314.anInt6404, 10, 135);
		Static259.aClass25_9.method5838(-256, -16777216, "Occlude Calc Took: " + Static630.aLong273 / 1000L + "us", 10, 150);
		if (Static262.anInt5743 != 2 || Static475.anIntArray532 == null) {
			return;
		}
		for (@Pc(355) int local355 = 0; local355 < Static475.anIntArray532.length; local355++) {
			@Pc(361) float local361 = (float) Static475.anIntArray532[local355];
			local361 /= 4194304.0F;
			if (local361 > 1.0F) {
				local361 = 1.0F;
			}
			local361 *= 255.0F;
			local361 = 255.0F - local361;
			@Pc(382) int local382 = (int) local361;
			Static475.anIntArray532[local355] = local382 | local382 << 8 | local382 << 16 | 0xFF000000;
		}
		@Pc(410) Class5 local410 = Static185.aClass33_8.method6204(Static255.anInt5651, Static582.anInt9741, Static475.anIntArray532, Static582.anInt9741);
		local410.method7595(10, 170, 1, 0, 0);
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(II)V")
	public static void method5830() {
		@Pc(5) Class112 local5 = Static107.aClass112_13;
		synchronized (Static107.aClass112_13) {
			Static107.aClass112_13.method3637(5);
		}
		local5 = Static254.aClass112_31;
		synchronized (Static254.aClass112_31) {
			Static254.aClass112_31.method3637(5);
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "([BIIBII)V")
	public static void method5832(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		if (arg2 >= arg1) {
			return;
		}
		arg3 += arg2;
		@Pc(20) int local20 = arg1 - arg2 >> 2;
		while (true) {
			local20--;
			if (local20 < 0) {
				local20 = arg1 - arg2 & 0x3;
				while (true) {
					local20--;
					if (local20 < 0) {
						return;
					}
					arg0[arg3++] = 1;
				}
			}
			@Pc(25) int local25 = arg3 + 1;
			arg0[arg3] = 1;
			@Pc(30) int local30 = local25 + 1;
			arg0[local25] = 1;
			@Pc(35) int local35 = local30 + 1;
			arg0[local30] = 1;
			arg3 = local35 + 1;
			arg0[local35] = 1;
		}
	}
}
