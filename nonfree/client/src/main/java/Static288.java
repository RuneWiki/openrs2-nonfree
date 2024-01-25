import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!jja", name = "P", descriptor = "Lclient!jt;")
	public static Class187 aClass187_1;

	@OriginalMember(owner = "client!jja", name = "F", descriptor = "Lclient!in;")
	public static final Class169 aClass169_139 = new Class169(71, 1);

	@OriginalMember(owner = "client!jja", name = "N", descriptor = "[I")
	public static final int[] anIntArray268 = new int[250];

	@OriginalMember(owner = "client!jja", name = "O", descriptor = "[I")
	public static final int[] anIntArray269 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!jja", name = "Q", descriptor = "Lclient!si;")
	public static final Class335 aClass335_15 = new Class335(16);

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "()V")
	public static void method4804() {
		if (Static220.anInt4513 == 0 || Static394.aClass59_9 == null) {
			return;
		}
		Static64.aClass101_1.K(Static264.anIntArray254);
		for (@Pc(12) int local12 = 0; local12 < Static668.anIntArray596.length; local12++) {
			Static64.aClass101_1.method8113(Static264.anIntArray254[3] - Static264.anIntArray254[1], Static668.anIntArray596[local12] + Static654.anIntArray589[local12], -256, Static264.anIntArray254[1]);
		}
		for (@Pc(41) int local41 = 0; local41 < Static90.anInt1654; local41++) {
			@Pc(46) Class348 local46 = Static45.aClass348Array1[local41];
			Static64.aClass101_1.H(local46.anIntArray508[0], local46.anIntArray506[0], local46.anIntArray507[0], Static471.anIntArray431);
			Static64.aClass101_1.H(local46.anIntArray508[1], local46.anIntArray506[1], local46.anIntArray507[1], Static162.anIntArray167);
			Static64.aClass101_1.H(local46.anIntArray508[2], local46.anIntArray506[2], local46.anIntArray507[2], Static145.anIntArray152);
			Static64.aClass101_1.H(local46.anIntArray508[3], local46.anIntArray506[3], local46.anIntArray507[3], Static260.anIntArray253);
			if (Static471.anIntArray431[2] != -1 && Static162.anIntArray167[2] != -1 && Static145.anIntArray152[2] != -1 && Static260.anIntArray253[2] != -1) {
				@Pc(128) int local128 = -65536;
				if (local46.aByte132 == 4) {
					local128 = -16776961;
				}
				Static64.aClass101_1.method8096(Static471.anIntArray431[0], local128, Static162.anIntArray167[0], Static162.anIntArray167[1], Static471.anIntArray431[1]);
				Static64.aClass101_1.method8096(Static162.anIntArray167[0], local128, Static145.anIntArray152[0], Static145.anIntArray152[1], Static162.anIntArray167[1]);
				Static64.aClass101_1.method8096(Static145.anIntArray152[0], local128, Static260.anIntArray253[0], Static260.anIntArray253[1], Static145.anIntArray152[1]);
				Static64.aClass101_1.method8096(Static260.anIntArray253[0], local128, Static471.anIntArray431[0], Static471.anIntArray431[1], Static260.anIntArray253[1]);
				Static64.aClass101_1.method8096(Static471.anIntArray431[0], local128, Static145.anIntArray152[0], Static145.anIntArray152[1], Static471.anIntArray431[1]);
			}
		}
		Static394.aClass59_9.method9577(-256, "Dynamic: " + Static533.anInt9353 + "/" + 5000, 10, 75, -16777216);
		Static394.aClass59_9.method9577(-256, "Total Opaque Onscreen: " + Static43.anInt8881 + "/" + 10000, 10, 90, -16777216);
		Static394.aClass59_9.method9577(-256, "Total Trans Onscreen: " + Static644.anInt11134 + "/" + 5000, 10, 105, -16777216);
		Static394.aClass59_9.method9577(-256, "Occluders: " + (Static594.anInt10306 + Static398.anInt7403) + " Active: " + Static90.anInt1654, 10, 120, -16777216);
		Static394.aClass59_9.method9577(-256, "Occluded: Ground:" + Static20.anInt361 + " Walls: " + Static383.anInt7255 + " CPs: " + Static640.anInt11082 + " Pixels: " + Static22.anInt390, 10, 135, -16777216);
		Static394.aClass59_9.method9577(-256, "Occlude Calc Took: " + Static561.aLong268 / 1000L + "us", 10, 150, -16777216);
		if (Static220.anInt4513 != 2 || Static553.anIntArray490 == null) {
			return;
		}
		for (@Pc(355) int local355 = 0; local355 < Static553.anIntArray490.length; local355++) {
			@Pc(361) float local361 = (float) Static553.anIntArray490[local355];
			local361 /= 4194304.0F;
			if (local361 > 1.0F) {
				local361 = 1.0F;
			}
			local361 *= 255.0F;
			local361 = 255.0F - local361;
			@Pc(382) int local382 = (int) local361;
			Static553.anIntArray490[local355] = local382 | local382 << 8 | local382 << 16 | 0xFF000000;
		}
		@Pc(410) Class71 local410 = Static64.aClass101_1.method8111(Static171.anInt3607, Static553.anIntArray490, Static167.anInt3590, Static171.anInt3607);
		local410.method7697(10, 170, 1, 0, 0);
	}
}
