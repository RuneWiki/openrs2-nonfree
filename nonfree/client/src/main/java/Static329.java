import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!v", name = "o", descriptor = "I")
	public static int anInt6225;

	@OriginalMember(owner = "client!v", name = "b", descriptor = "I")
	public static final int anInt6213 = -11713997;

	@OriginalMember(owner = "client!v", name = "e", descriptor = "I")
	public static int anInt6216 = 0;

	@OriginalMember(owner = "client!v", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString408 = "Loaded update list";

	@OriginalMember(owner = "client!v", name = "j", descriptor = "I")
	public static int anInt6220 = 0;

	@OriginalMember(owner = "client!v", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString409 = "red:";

	@OriginalMember(owner = "client!v", name = "q", descriptor = "Lclient!ik;")
	public static final Class103 aClass103_65 = new Class103(64);

	@OriginalMember(owner = "client!v", name = "r", descriptor = "Z")
	public static boolean aBoolean456 = false;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V")
	public static void method5250() {
		if (Static138.anInt3018 == -1 || Static82.anInt2148 == -1) {
			return;
		}
		@Pc(22) int local22 = (Static10.anInt178 * (Static133.anInt2885 - Static108.anInt1314) >> 16) + Static108.anInt1314;
		Static10.anInt178 += local22;
		if (Static10.anInt178 < 65535) {
			Static299.aBoolean424 = false;
			Static191.aBoolean294 = false;
		} else {
			if (Static191.aBoolean294) {
				Static299.aBoolean424 = false;
			} else {
				Static299.aBoolean424 = true;
			}
			Static10.anInt178 = 65535;
			Static191.aBoolean294 = true;
		}
		@Pc(55) float local55 = (float) Static10.anInt178 / 65535.0F;
		@Pc(58) float[] local58 = new float[3];
		@Pc(62) int local62 = Static207.anInt4143 * 2;
		@Pc(87) int local87;
		@Pc(120) int local120;
		@Pc(128) int local128;
		@Pc(132) int local132;
		@Pc(140) int local140;
		@Pc(158) int local158;
		for (@Pc(64) int local64 = 0; local64 < 3; local64++) {
			@Pc(75) int local75 = Static138.anIntArrayArrayArray8[Static138.anInt3018][local62][local64] * 3;
			local87 = Static138.anIntArrayArrayArray8[Static138.anInt3018][local62 + 1][local64] * 3;
			local120 = (Static138.anIntArrayArrayArray8[Static138.anInt3018][local62 + 2][local64] + Static138.anIntArrayArrayArray8[Static138.anInt3018][local62 + 2][local64] - Static138.anIntArrayArrayArray8[Static138.anInt3018][local62 + 3][local64]) * 3;
			local128 = Static138.anIntArrayArrayArray8[Static138.anInt3018][local62][local64];
			local132 = local87 - local75;
			local140 = local75 + local120 - local87 * 2;
			local158 = local87 + Static138.anIntArrayArrayArray8[Static138.anInt3018][local62 + 2][local64] - local120 - local128;
			local58[local64] = (float) local128 + local55 * ((local55 * (float) local158 + (float) local140) * local55 + (float) local132);
		}
		Static203.anInt4014 = (int) local58[0] - Static350.anInt6609 * 128;
		Static271.anInt5361 = (int) local58[1] * -1;
		Static24.anInt478 = (int) local58[2] - Static237.anInt4696 * 128;
		@Pc(214) float[] local214 = new float[3];
		local87 = Static283.anInt5564 * 2;
		for (local120 = 0; local120 < 3; local120++) {
			local128 = Static138.anIntArrayArrayArray8[Static82.anInt2148][local87][local120] * 3;
			local132 = Static138.anIntArrayArrayArray8[Static82.anInt2148][local87 + 1][local120] * 3;
			local140 = (Static138.anIntArrayArrayArray8[Static82.anInt2148][local87 + 2][local120] + Static138.anIntArrayArrayArray8[Static82.anInt2148][local87 + 2][local120] - Static138.anIntArrayArrayArray8[Static82.anInt2148][local87 + 3][local120]) * 3;
			local158 = Static138.anIntArrayArrayArray8[Static82.anInt2148][local87][local120];
			@Pc(288) int local288 = local132 - local128;
			@Pc(296) int local296 = local140 + local128 - local132 * 2;
			@Pc(313) int local313 = local132 + Static138.anIntArrayArrayArray8[Static82.anInt2148][local87 + 2][local120] - local140 - local158;
			local214[local120] = (float) local158 + local55 * (local55 * (local55 * (float) local313 + (float) local296) + (float) local288);
		}
		@Pc(348) float local348 = local214[0] - local58[0];
		@Pc(358) float local358 = -1.0F * (local214[1] - local58[1]);
		@Pc(367) float local367 = local214[2] - local58[2];
		@Pc(377) double local377 = Math.sqrt((double) (local367 * local367 + local348 * local348));
		Static179.anInt3660 = (int) (Math.atan2((double) local358, local377) * 2607.5945876176133D) & 0x3FFF;
		Static138.anInt3022 = (int) (-Math.atan2((double) local348, (double) local367) * 2607.5945876176133D) & 0x3FFF;
		Static292.anInt5691 = ((Static138.anIntArrayArrayArray8[Static138.anInt3018][local62 + 2][3] - Static138.anIntArrayArrayArray8[Static138.anInt3018][local62][3]) * Static10.anInt178 >> 16) + Static138.anIntArrayArrayArray8[Static138.anInt3018][local62][3];
	}
}
