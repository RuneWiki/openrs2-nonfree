import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!oo", name = "r", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray53;

	@OriginalMember(owner = "client!oo", name = "k", descriptor = "[Lclient!kp;")
	public static final Class199[] aClass199Array1 = new Class199[6];

	@OriginalMember(owner = "client!oo", name = "m", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray52 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!oo", name = "p", descriptor = "I")
	public static int anInt7133 = 0;

	@OriginalMember(owner = "client!oo", name = "q", descriptor = "[C")
	public static final char[] aCharArray7 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "([Ljava/lang/Object;[JB)V")
	public static void method5992(@OriginalArg(0) Object[] arg0, @OriginalArg(1) long[] arg1) {
		Static619.method8377(arg1, arg0, arg1.length - 1, 0);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "()V")
	public static void method5993() {
		if (Static634.anInt6745 == 0 || Static464.aClass67_10 == null) {
			return;
		}
		Static50.aClass95_1.K(Static55.anIntArray58);
		for (@Pc(12) int local12 = 0; local12 < Static366.anIntArray331.length; local12++) {
			Static50.aClass95_1.method8000(Static366.anIntArray331[local12] + Static141.anIntArray146[local12], -256, Static55.anIntArray58[1], Static55.anIntArray58[3] - Static55.anIntArray58[1]);
		}
		for (@Pc(41) int local41 = 0; local41 < Static232.anInt4115; local41++) {
			@Pc(46) Class272 local46 = Static589.aClass272Array37[local41];
			Static50.aClass95_1.H(local46.anIntArray392[0], local46.anIntArray390[0], local46.anIntArray391[0], Static83.anIntArray82);
			Static50.aClass95_1.H(local46.anIntArray392[1], local46.anIntArray390[1], local46.anIntArray391[1], Static502.anIntArray427);
			Static50.aClass95_1.H(local46.anIntArray392[2], local46.anIntArray390[2], local46.anIntArray391[2], Static191.anIntArray177);
			Static50.aClass95_1.H(local46.anIntArray392[3], local46.anIntArray390[3], local46.anIntArray391[3], Static68.anIntArray76);
			if (Static83.anIntArray82[2] != -1 && Static502.anIntArray427[2] != -1 && Static191.anIntArray177[2] != -1 && Static68.anIntArray76[2] != -1) {
				@Pc(128) int local128 = -65536;
				if (local46.aByte113 == 4) {
					local128 = -16776961;
				}
				Static50.aClass95_1.method7988(Static83.anIntArray82[1], local128, Static502.anIntArray427[0], Static83.anIntArray82[0], Static502.anIntArray427[1]);
				Static50.aClass95_1.method7988(Static502.anIntArray427[1], local128, Static191.anIntArray177[0], Static502.anIntArray427[0], Static191.anIntArray177[1]);
				Static50.aClass95_1.method7988(Static191.anIntArray177[1], local128, Static68.anIntArray76[0], Static191.anIntArray177[0], Static68.anIntArray76[1]);
				Static50.aClass95_1.method7988(Static68.anIntArray76[1], local128, Static83.anIntArray82[0], Static68.anIntArray76[0], Static83.anIntArray82[1]);
				Static50.aClass95_1.method7988(Static83.anIntArray82[1], local128, Static191.anIntArray177[0], Static83.anIntArray82[0], Static191.anIntArray177[1]);
			}
		}
		Static464.aClass67_10.method7684(-256, 10, 75, "Dynamic: " + Static23.anInt559 + "/" + 5000, -16777216);
		Static464.aClass67_10.method7684(-256, 10, 90, "Total Opaque Onscreen: " + Static194.anInt3515 + "/" + 10000, -16777216);
		Static464.aClass67_10.method7684(-256, 10, 105, "Total Trans Onscreen: " + Static313.anInt9097 + "/" + 5000, -16777216);
		Static464.aClass67_10.method7684(-256, 10, 120, "Occluders: " + (Static592.anInt9569 + Static393.anInt6534) + " Active: " + Static232.anInt4115, -16777216);
		Static464.aClass67_10.method7684(-256, 10, 135, "Occluded: Ground:" + Static453.anInt7307 + " Walls: " + Static548.anInt8557 + " CPs: " + Static512.anInt8073 + " Pixels: " + Static304.anInt5127, -16777216);
		Static464.aClass67_10.method7684(-256, 10, 150, "Occlude Calc Took: " + Static145.aLong74 / 1000L + "us", -16777216);
		if (Static634.anInt6745 != 2 || Static260.anIntArray268 == null) {
			return;
		}
		for (@Pc(355) int local355 = 0; local355 < Static260.anIntArray268.length; local355++) {
			@Pc(361) float local361 = (float) Static260.anIntArray268[local355];
			local361 /= 4194304.0F;
			if (local361 > 1.0F) {
				local361 = 1.0F;
			}
			local361 *= 255.0F;
			local361 = 255.0F - local361;
			@Pc(382) int local382 = (int) local361;
			Static260.anIntArray268[local355] = local382 | local382 << 8 | local382 << 16 | 0xFF000000;
		}
		@Pc(410) Class6 local410 = Static50.aClass95_1.method7993(Static260.anIntArray268, Static218.anInt3743, Static483.anInt7683, Static218.anInt3743);
		local410.method5133(10, 170, 1, 0, 0);
	}
}
