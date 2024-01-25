import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static536 {

	@OriginalMember(owner = "client!te", name = "b", descriptor = "I")
	public static int anInt9677;

	@OriginalMember(owner = "client!te", name = "d", descriptor = "F")
	public static float aFloat204;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "[I")
	private static final int[] anIntArray637 = new int[3];

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!cm;Lclient!cm;Z)V")
	public static void method8055(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1) {
		if (arg1.aClass3_68 != null) {
			arg1.method8909();
		}
		arg1.aClass3_67 = arg0;
		arg1.aClass3_68 = arg0.aClass3_68;
		arg1.aClass3_68.aClass3_67 = arg1;
		arg1.aClass3_67.aClass3_68 = arg1;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "()V")
	public static void method8056() {
		if (Static261.anInt5567 == 0 || Static151.aClass68_6 == null) {
			return;
		}
		Static194.aClass20_5.K(Static304.anIntArray369);
		for (@Pc(12) int local12 = 0; local12 < Static208.anIntArray239.length; local12++) {
			Static194.aClass20_5.method7263(Static208.anIntArray239[local12] + Static121.anIntArray631[local12], -256, Static304.anIntArray369[3] - Static304.anIntArray369[1], Static304.anIntArray369[1]);
		}
		for (@Pc(41) int local41 = 0; local41 < Static534.anInt9664; local41++) {
			@Pc(46) Class82 local46 = Static266.aClass82Array1[local41];
			Static194.aClass20_5.H(local46.anIntArray150[0], local46.anIntArray151[0], local46.anIntArray149[0], Static440.anIntArray538);
			Static194.aClass20_5.H(local46.anIntArray150[1], local46.anIntArray151[1], local46.anIntArray149[1], Static18.anIntArray17);
			Static194.aClass20_5.H(local46.anIntArray150[2], local46.anIntArray151[2], local46.anIntArray149[2], anIntArray637);
			Static194.aClass20_5.H(local46.anIntArray150[3], local46.anIntArray151[3], local46.anIntArray149[3], Static342.anIntArray430);
			if (Static440.anIntArray538[2] != -1 && Static18.anIntArray17[2] != -1 && anIntArray637[2] != -1 && Static342.anIntArray430[2] != -1) {
				@Pc(128) int local128 = -65536;
				if (local46.aByte39 == 4) {
					local128 = -16776961;
				}
				Static194.aClass20_5.method7248(Static440.anIntArray538[1], Static440.anIntArray538[0], Static18.anIntArray17[0], local128, Static18.anIntArray17[1]);
				Static194.aClass20_5.method7248(Static18.anIntArray17[1], Static18.anIntArray17[0], anIntArray637[0], local128, anIntArray637[1]);
				Static194.aClass20_5.method7248(anIntArray637[1], anIntArray637[0], Static342.anIntArray430[0], local128, Static342.anIntArray430[1]);
				Static194.aClass20_5.method7248(Static342.anIntArray430[1], Static342.anIntArray430[0], Static440.anIntArray538[0], local128, Static440.anIntArray538[1]);
				Static194.aClass20_5.method7248(Static440.anIntArray538[1], Static440.anIntArray538[0], anIntArray637[0], local128, anIntArray637[1]);
			}
		}
		Static151.aClass68_6.method8107("Dynamic: " + Static319.anInt6492 + "/" + 5000, -256, 75, 10, -16777216);
		Static151.aClass68_6.method8107("Total Opaque Onscreen: " + Static644.anInt11085 + "/" + 10000, -256, 90, 10, -16777216);
		Static151.aClass68_6.method8107("Total Trans Onscreen: " + Static328.anInt6627 + "/" + 5000, -256, 105, 10, -16777216);
		Static151.aClass68_6.method8107("Occluders: " + (Static145.anInt3525 + Static288.anInt6150) + " Active: " + Static534.anInt9664, -256, 120, 10, -16777216);
		Static151.aClass68_6.method8107("Occluded: Ground:" + Static361.anInt7190 + " Walls: " + Static241.anInt5214 + " CPs: " + Static216.anInt4874 + " Pixels: " + Static513.anInt9411, -256, 135, 10, -16777216);
		Static151.aClass68_6.method8107("Occlude Calc Took: " + Static544.aLong244 / 1000L + "us", -256, 150, 10, -16777216);
		if (Static261.anInt5567 != 2 || Static204.anIntArray648 == null) {
			return;
		}
		for (@Pc(355) int local355 = 0; local355 < Static204.anIntArray648.length; local355++) {
			@Pc(361) float local361 = (float) Static204.anIntArray648[local355];
			local361 /= 4194304.0F;
			if (local361 > 1.0F) {
				local361 = 1.0F;
			}
			local361 *= 255.0F;
			local361 = 255.0F - local361;
			@Pc(382) int local382 = (int) local361;
			Static204.anIntArray648[local355] = local382 | local382 << 8 | local382 << 16 | 0xFF000000;
		}
		@Pc(410) Class46 local410 = Static194.aClass20_5.method7265(Static640.anInt11044, Static204.anIntArray648, Static640.anInt11044, Static319.anInt6494);
		local410.method6203(10, 170, 1, 0, 0);
	}
}
