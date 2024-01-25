import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "[I")
	public static int[] anIntArray336;

	@OriginalMember(owner = "client!nia", name = "c", descriptor = "Lclient!ni;")
	public static Class223 aClass223_79;

	@OriginalMember(owner = "client!nia", name = "b", descriptor = "[I")
	public static final int[] anIntArray337 = new int[8];

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "()V")
	public static void method5976() {
		if (Static494.anInt8615 == 0 || Static177.aClass34_13 == null) {
			return;
		}
		Static472.aClass5_14.K(Static210.anIntArray203);
		for (@Pc(12) int local12 = 0; local12 < Static509.anIntArray482.length; local12++) {
			Static472.aClass5_14.method6118(Static210.anIntArray203[1], Static509.anIntArray482[local12] + Static30.anIntArray31[local12], -256, Static210.anIntArray203[3] - Static210.anIntArray203[1]);
		}
		for (@Pc(41) int local41 = 0; local41 < Static116.anInt2989; local41++) {
			@Pc(46) Class169 local46 = Static383.aClass169Array3[local41];
			Static472.aClass5_14.H(local46.anIntArray278[0], local46.anIntArray277[0], local46.anIntArray279[0], Static421.anIntArray94);
			Static472.aClass5_14.H(local46.anIntArray278[1], local46.anIntArray277[1], local46.anIntArray279[1], Static544.anIntArray499);
			Static472.aClass5_14.H(local46.anIntArray278[2], local46.anIntArray277[2], local46.anIntArray279[2], Static99.anIntArray92);
			Static472.aClass5_14.H(local46.anIntArray278[3], local46.anIntArray277[3], local46.anIntArray279[3], Static464.anIntArray430);
			if (Static421.anIntArray94[2] != -1 && Static544.anIntArray499[2] != -1 && Static99.anIntArray92[2] != -1 && Static464.anIntArray430[2] != -1) {
				@Pc(128) int local128 = -65536;
				if (local46.aByte70 == 4) {
					local128 = -16776961;
				}
				Static472.aClass5_14.method6152(Static421.anIntArray94[1], local128, Static544.anIntArray499[1], Static544.anIntArray499[0], Static421.anIntArray94[0]);
				Static472.aClass5_14.method6152(Static544.anIntArray499[1], local128, Static99.anIntArray92[1], Static99.anIntArray92[0], Static544.anIntArray499[0]);
				Static472.aClass5_14.method6152(Static99.anIntArray92[1], local128, Static464.anIntArray430[1], Static464.anIntArray430[0], Static99.anIntArray92[0]);
				Static472.aClass5_14.method6152(Static464.anIntArray430[1], local128, Static421.anIntArray94[1], Static421.anIntArray94[0], Static464.anIntArray430[0]);
				Static472.aClass5_14.method6152(Static421.anIntArray94[1], local128, Static99.anIntArray92[1], Static99.anIntArray92[0], Static421.anIntArray94[0]);
			}
		}
		Static177.aClass34_13.method8598(75, "Dynamic: " + Static592.anInt10005 + "/" + 5000, -256, -16777216, 10);
		Static177.aClass34_13.method8598(90, "Total Opaque Onscreen: " + Static525.anInt9179 + "/" + 10000, -256, -16777216, 10);
		Static177.aClass34_13.method8598(105, "Total Trans Onscreen: " + Static604.anInt10261 + "/" + 5000, -256, -16777216, 10);
		Static177.aClass34_13.method8598(120, "Occluders: " + (Static593.anInt10029 + Static574.anInt9809) + " Active: " + Static116.anInt2989, -256, -16777216, 10);
		Static177.aClass34_13.method8598(135, "Occluded: Ground:" + Static525.anInt9175 + " Walls: " + Static210.anInt4555 + " CPs: " + Static528.anInt9204 + " Pixels: " + Static8.anInt519, -256, -16777216, 10);
		Static177.aClass34_13.method8598(150, "Occlude Calc Took: " + Static438.aLong212 / 1000L + "us", -256, -16777216, 10);
		if (Static494.anInt8615 != 2 || Static401.anIntArray371 == null) {
			return;
		}
		for (@Pc(355) int local355 = 0; local355 < Static401.anIntArray371.length; local355++) {
			@Pc(361) float local361 = (float) Static401.anIntArray371[local355];
			local361 /= 4194304.0F;
			if (local361 > 1.0F) {
				local361 = 1.0F;
			}
			local361 *= 255.0F;
			local361 = 255.0F - local361;
			@Pc(382) int local382 = (int) local361;
			Static401.anIntArray371[local355] = local382 | local382 << 8 | local382 << 16 | 0xFF000000;
		}
		@Pc(410) Class4 local410 = Static472.aClass5_14.method6111(Static35.anInt884, Static115.anInt2983, Static401.anIntArray371, Static35.anInt884);
		local410.method7711(10, 170, 1, 0, 0);
	}
}
