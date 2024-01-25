import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString228 = "Cancel";

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(II)V")
	public static void method3519(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = Static180.anInt3606 - Static323.anInt6108;
		if (local7 >= 100) {
			Static215.anInt4279 = 1;
			return;
		}
		@Pc(18) int local18 = (int) Static5.aFloat2;
		if (local18 < Static288.anInt5540 >> 8) {
			local18 = Static288.anInt5540 >> 8;
		}
		if (Static183.aBooleanArray16[4] && local18 < Static76.anIntArray410[4] + 128) {
			local18 = Static76.anIntArray410[4] + 128;
		}
		@Pc(60) int local60 = (int) Static155.aFloat64 + Static293.anInt5615 & 0x3FFF;
		Static72.method1583(Static64.anInt1546, Static66.method1393(Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5773, Static156.anInt3123, Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5769) - 50, local60, (local18 >> 3) * 3 + 600, arg0, local18, Static259.anInt3210);
		@Pc(103) float local103 = 1.0F - (float) ((100 - local7) * (-local7 + 100) * (100 - local7)) / 1000000.0F;
		Static347.anInt6471 = (int) ((float) Static319.anInt6050 + (float) (Static347.anInt6471 - Static319.anInt6050) * local103);
		Static339.anInt6354 = (int) ((float) Static83.anInt2053 + local103 * (float) (Static339.anInt6354 - Static83.anInt2053));
		Static311.anInt6461 = (int) ((float) Static90.anInt4331 + local103 * (float) (Static311.anInt6461 - Static90.anInt4331));
		Static347.anInt6472 = (int) ((float) (Static347.anInt6472 - Static84.anInt2088) * local103 + (float) Static84.anInt2088);
		@Pc(155) int local155 = Static199.anInt3858 - Static135.anInt2753;
		if (local155 > 8192) {
			local155 -= 16384;
		} else if (local155 < -8192) {
			local155 += 16384;
		}
		Static199.anInt3858 = (int) ((float) local155 * local103 + (float) Static135.anInt2753);
		Static199.anInt3858 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(B[[[Lclient!dn;)V")
	public static void method3520(@OriginalArg(1) Class51[][][] arg0) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			@Pc(18) Class51[][] local18 = arg0[local12];
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				for (@Pc(24) int local24 = 0; local24 < local18[local20].length; local24++) {
					@Pc(32) Class51 local32 = local18[local20][local24];
					if (local32 != null) {
						if (local32.aClass25_Sub4_1 instanceof Interface8) {
							((Interface8) local32.aClass25_Sub4_1).method5553();
						}
						if (local32.aClass25_Sub3_2 instanceof Interface8) {
							((Interface8) local32.aClass25_Sub3_2).method5553();
						}
						if (local32.aClass25_Sub3_1 instanceof Interface8) {
							((Interface8) local32.aClass25_Sub3_1).method5553();
						}
						if (local32.aClass25_Sub2_1 instanceof Interface8) {
							((Interface8) local32.aClass25_Sub2_1).method5553();
						}
						if (local32.aClass25_Sub2_2 instanceof Interface8) {
							((Interface8) local32.aClass25_Sub2_2).method5553();
						}
						for (@Pc(82) Class103 local82 = local32.aClass103_1; local82 != null; local82 = local82.aClass103_2) {
							@Pc(87) Class25_Sub1 local87 = local82.aClass25_Sub1_1;
							if (local87 instanceof Interface8) {
								((Interface8) local87).method5553();
							}
						}
					}
				}
			}
		}
	}
}
