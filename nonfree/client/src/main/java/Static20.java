import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!an", name = "l", descriptor = "I")
	public static int anInt544;

	@OriginalMember(owner = "client!an", name = "m", descriptor = "Lclient!pl;")
	public static Class123 aClass123_1;

	@OriginalMember(owner = "client!an", name = "n", descriptor = "F")
	public static float aFloat7;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "()V")
	public static void method418() {
		if (Static61.anInt1164 == 0 || Static483.aClass62_17 == null) {
			return;
		}
		Static207.aClass95_6.K(Static471.anIntArray545);
		for (@Pc(12) int local12 = 0; local12 < Static154.anIntArray188.length; local12++) {
			Static207.aClass95_6.method6965(Static154.anIntArray188[local12] + Static584.anIntArray649[local12], -256, Static471.anIntArray545[3] - Static471.anIntArray545[1], Static471.anIntArray545[1]);
		}
		for (@Pc(41) int local41 = 0; local41 < Static605.anInt9754; local41++) {
			@Pc(46) Class327 local46 = Static160.aClass327Array2[local41];
			Static207.aClass95_6.H(local46.anIntArray595[0], local46.anIntArray596[0], local46.anIntArray594[0], Static140.anIntArray169);
			Static207.aClass95_6.H(local46.anIntArray595[1], local46.anIntArray596[1], local46.anIntArray594[1], Static565.anIntArray631);
			Static207.aClass95_6.H(local46.anIntArray595[2], local46.anIntArray596[2], local46.anIntArray594[2], Static122.anIntArray154);
			Static207.aClass95_6.H(local46.anIntArray595[3], local46.anIntArray596[3], local46.anIntArray594[3], Static105.anIntArray137);
			if (Static140.anIntArray169[2] != -1 && Static565.anIntArray631[2] != -1 && Static122.anIntArray154[2] != -1 && Static105.anIntArray137[2] != -1) {
				@Pc(128) int local128 = -65536;
				if (local46.aByte114 == 4) {
					local128 = -16776961;
				}
				Static207.aClass95_6.method6955(Static140.anIntArray169[1], Static565.anIntArray631[1], Static140.anIntArray169[0], Static565.anIntArray631[0], local128);
				Static207.aClass95_6.method6955(Static565.anIntArray631[1], Static122.anIntArray154[1], Static565.anIntArray631[0], Static122.anIntArray154[0], local128);
				Static207.aClass95_6.method6955(Static122.anIntArray154[1], Static105.anIntArray137[1], Static122.anIntArray154[0], Static105.anIntArray137[0], local128);
				Static207.aClass95_6.method6955(Static105.anIntArray137[1], Static140.anIntArray169[1], Static105.anIntArray137[0], Static140.anIntArray169[0], local128);
				Static207.aClass95_6.method6955(Static140.anIntArray169[1], Static122.anIntArray154[1], Static140.anIntArray169[0], Static122.anIntArray154[0], local128);
			}
		}
		Static483.aClass62_17.method5684(10, "Static Opaque: OW: " + Static369.anIntArray426[0] + "/" + Static608.anIntArray672[0] + " UW: " + Static369.anIntArray426[1] + "/" + Static608.anIntArray672[1], 30, -256, -16777216);
		Static483.aClass62_17.method5684(10, "Static Trans: OW: " + Static28.anIntArray63[0] + "/" + Static116.anIntArray145[0] + " UW: " + Static28.anIntArray63[1] + "/" + Static116.anIntArray145[1], 45, -256, -16777216);
		Static483.aClass62_17.method5684(10, "Static Anim: OW: " + Static497.anIntArray571[0] + "/" + Static217.anIntArray239[0] + " UW: " + Static497.anIntArray571[1] + "/" + Static217.anIntArray239[1], 60, -256, -16777216);
		Static483.aClass62_17.method5684(10, "Dynamic: " + Static332.anInt5259 + "/" + 5000, 75, -256, -16777216);
		Static483.aClass62_17.method5684(10, "Total Opaque Onscreen: " + Static508.anInt8493 + "/" + 10000, 90, -256, -16777216);
		Static483.aClass62_17.method5684(10, "Total Trans Onscreen: " + Static478.anInt9923 + "/" + 5000, 105, -256, -16777216);
		Static483.aClass62_17.method5684(10, "Occluders: " + (Static631.anInt9614 + Static238.anInt3898) + " Active: " + Static605.anInt9754, 120, -256, -16777216);
		Static483.aClass62_17.method5684(10, "Occluded: Ground:" + Static536.anInt8797 + " Walls: " + Static64.anInt1176 + " CPs: " + Static49.anInt8547 + " Pixels: " + Static29.anInt690, 135, -256, -16777216);
		Static483.aClass62_17.method5684(10, "Occlude Calc Took: " + Static576.aLong252 / 1000L + "us", 150, -256, -16777216);
		if (Static61.anInt1164 != 2 || Static269.anIntArray287 == null) {
			return;
		}
		for (@Pc(461) int local461 = 0; local461 < Static269.anIntArray287.length; local461++) {
			@Pc(467) float local467 = (float) Static269.anIntArray287[local461];
			local467 /= 4194304.0F;
			if (local467 > 1.0F) {
				local467 = 1.0F;
			}
			local467 *= 255.0F;
			local467 = 255.0F - local467;
			@Pc(488) int local488 = (int) local467;
			Static269.anIntArray287[local461] = local488 | local488 << 8 | local488 << 16 | 0xFF000000;
		}
		@Pc(516) Class61 local516 = Static207.aClass95_6.method6953(Static269.anIntArray287, Static278.anInt4447, Static278.anInt4447, Static585.anInt9543);
		local516.method6434(10, 170, 1, 0, 0);
	}
}
