import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "F")
	public static float aFloat121;

	@OriginalMember(owner = "client!ln", name = "e", descriptor = "I")
	public static int anInt6360 = 0;

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(B)V")
	public static void method5305() {
		for (@Pc(4) Class5_Sub52 local4 = (Class5_Sub52) Static573.aClass114_64.method2805(); local4 != null; local4 = (Class5_Sub52) Static573.aClass114_64.method2814()) {
			if (local4.aBoolean784) {
				local4.method7757();
			}
		}
		for (@Pc(27) Class5_Sub52 local27 = (Class5_Sub52) Static195.aClass114_21.method2805(); local27 != null; local27 = (Class5_Sub52) Static195.aClass114_21.method2814()) {
			if (local27.aBoolean784) {
				local27.method7757();
			}
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "()V")
	public static void method5306() {
		if (Static375.anInt6743 == 0 || Static635.aClass73_16 == null) {
			return;
		}
		Static10.aClass65_1.K(Static358.anIntArray372);
		for (@Pc(12) int local12 = 0; local12 < Static481.anIntArray450.length; local12++) {
			Static10.aClass65_1.method6879(Static358.anIntArray372[1], -256, Static358.anIntArray372[3] - Static358.anIntArray372[1], Static481.anIntArray450[local12] + Static661.anIntArray603[local12]);
		}
		for (@Pc(41) int local41 = 0; local41 < Static530.anInt8752; local41++) {
			@Pc(46) Class38 local46 = Static390.aClass38Array2[local41];
			Static10.aClass65_1.H(local46.anIntArray32[0], local46.anIntArray31[0], local46.anIntArray33[0], Static607.anIntArray457);
			Static10.aClass65_1.H(local46.anIntArray32[1], local46.anIntArray31[1], local46.anIntArray33[1], Static344.anIntArray366);
			Static10.aClass65_1.H(local46.anIntArray32[2], local46.anIntArray31[2], local46.anIntArray33[2], Static4.anIntArray3);
			Static10.aClass65_1.H(local46.anIntArray32[3], local46.anIntArray31[3], local46.anIntArray33[3], Static261.anIntArray254);
			if (Static607.anIntArray457[2] != -1 && Static344.anIntArray366[2] != -1 && Static4.anIntArray3[2] != -1 && Static261.anIntArray254[2] != -1) {
				@Pc(128) int local128 = -65536;
				if (local46.aByte9 == 4) {
					local128 = -16776961;
				}
				Static10.aClass65_1.method6880(local128, Static344.anIntArray366[1], Static607.anIntArray457[0], Static344.anIntArray366[0], Static607.anIntArray457[1]);
				Static10.aClass65_1.method6880(local128, Static4.anIntArray3[1], Static344.anIntArray366[0], Static4.anIntArray3[0], Static344.anIntArray366[1]);
				Static10.aClass65_1.method6880(local128, Static261.anIntArray254[1], Static4.anIntArray3[0], Static261.anIntArray254[0], Static4.anIntArray3[1]);
				Static10.aClass65_1.method6880(local128, Static607.anIntArray457[1], Static261.anIntArray254[0], Static607.anIntArray457[0], Static261.anIntArray254[1]);
				Static10.aClass65_1.method6880(local128, Static4.anIntArray3[1], Static607.anIntArray457[0], Static4.anIntArray3[0], Static607.anIntArray457[1]);
			}
		}
		Static635.aClass73_16.method5773(75, -256, "Dynamic: " + Static518.anInt8629 + "/" + 5000, 10, -16777216);
		Static635.aClass73_16.method5773(90, -256, "Total Opaque Onscreen: " + Static679.anInt10885 + "/" + 10000, 10, -16777216);
		Static635.aClass73_16.method5773(105, -256, "Total Trans Onscreen: " + Static195.anInt3757 + "/" + 5000, 10, -16777216);
		Static635.aClass73_16.method5773(120, -256, "Occluders: " + (Static364.anInt6622 + Static272.anInt5008) + " Active: " + Static530.anInt8752, 10, -16777216);
		Static635.aClass73_16.method5773(135, -256, "Occluded: Ground:" + Static156.anInt3155 + " Walls: " + Static464.anInt7835 + " CPs: " + Static291.anInt9486 + " Pixels: " + Static383.anInt6814, 10, -16777216);
		Static635.aClass73_16.method5773(150, -256, "Occlude Calc Took: " + Static287.aLong135 / 1000L + "us", 10, -16777216);
		if (Static375.anInt6743 != 2 || Static595.anIntArray540 == null) {
			return;
		}
		for (@Pc(355) int local355 = 0; local355 < Static595.anIntArray540.length; local355++) {
			@Pc(361) float local361 = (float) Static595.anIntArray540[local355];
			local361 /= 4194304.0F;
			if (local361 > 1.0F) {
				local361 = 1.0F;
			}
			local361 *= 255.0F;
			local361 = 255.0F - local361;
			@Pc(382) int local382 = (int) local361;
			Static595.anIntArray540[local355] = local382 | local382 << 8 | local382 << 16 | 0xFF000000;
		}
		@Pc(410) Class50 local410 = Static10.aClass65_1.method6952(Static150.anInt3079, Static552.anInt9017, Static595.anIntArray540, Static552.anInt9017);
		local410.method5987(10, 170, 1, 0, 0);
	}
}
