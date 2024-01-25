import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ada", name = "T", descriptor = "Lclient!wu;")
	public static Class384 aClass384_3;

	@OriginalMember(owner = "client!ada", name = "P", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_4 = new Class181(50, 0);

	@OriginalMember(owner = "client!ada", name = "R", descriptor = "B")
	public static byte aByte4 = -1;

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(Lclient!wu;II)Lclient!rc;")
	public static Class298 method166(@OriginalArg(0) Class384 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte[] local13 = arg0.method8893(arg1);
		return local13 == null ? null : new Class298(local13);
	}

	@OriginalMember(owner = "client!ada", name = "f", descriptor = "()V")
	public static void method167() {
		if (Static46.anInt746 == 0 || Static154.aClass6_6 == null) {
			return;
		}
		Static480.aClass126_12.K(Static272.anIntArray370);
		for (@Pc(12) int local12 = 0; local12 < Static466.anIntArray626.length; local12++) {
			Static480.aClass126_12.method7059(-256, Static272.anIntArray370[3] - Static272.anIntArray370[1], Static272.anIntArray370[1], Static466.anIntArray626[local12] + Static613.anIntArray806[local12]);
		}
		for (@Pc(41) int local41 = 0; local41 < Static510.anInt8556; local41++) {
			@Pc(46) Class4 local46 = Static195.aClass4Array1[local41];
			Static480.aClass126_12.H(local46.anIntArray5[0], local46.anIntArray4[0], local46.anIntArray3[0], Static312.anIntArray397);
			Static480.aClass126_12.H(local46.anIntArray5[1], local46.anIntArray4[1], local46.anIntArray3[1], Static408.anIntArray550);
			Static480.aClass126_12.H(local46.anIntArray5[2], local46.anIntArray4[2], local46.anIntArray3[2], Static594.anIntArray786);
			Static480.aClass126_12.H(local46.anIntArray5[3], local46.anIntArray4[3], local46.anIntArray3[3], Static400.anIntArray549);
			if (Static312.anIntArray397[2] != -1 && Static408.anIntArray550[2] != -1 && Static594.anIntArray786[2] != -1 && Static400.anIntArray549[2] != -1) {
				@Pc(128) int local128 = -65536;
				if (local46.aByte2 == 4) {
					local128 = -16776961;
				}
				Static480.aClass126_12.method7002(Static408.anIntArray550[0], Static408.anIntArray550[1], Static312.anIntArray397[1], local128, Static312.anIntArray397[0]);
				Static480.aClass126_12.method7002(Static594.anIntArray786[0], Static594.anIntArray786[1], Static408.anIntArray550[1], local128, Static408.anIntArray550[0]);
				Static480.aClass126_12.method7002(Static400.anIntArray549[0], Static400.anIntArray549[1], Static594.anIntArray786[1], local128, Static594.anIntArray786[0]);
				Static480.aClass126_12.method7002(Static312.anIntArray397[0], Static312.anIntArray397[1], Static400.anIntArray549[1], local128, Static400.anIntArray549[0]);
				Static480.aClass126_12.method7002(Static594.anIntArray786[0], Static594.anIntArray786[1], Static312.anIntArray397[1], local128, Static312.anIntArray397[0]);
			}
		}
		Static154.aClass6_6.method7214(10, "Dynamic: " + Static594.anInt9723 + "/" + 5000, 75, -16777216, -256);
		Static154.aClass6_6.method7214(10, "Total Opaque Onscreen: " + Static229.anInt3963 + "/" + 10000, 90, -16777216, -256);
		Static154.aClass6_6.method7214(10, "Total Trans Onscreen: " + Static113.anInt1784 + "/" + 5000, 105, -16777216, -256);
		Static154.aClass6_6.method7214(10, "Occluders: " + (Static541.anInt8998 + Static278.anInt4554) + " Active: " + Static510.anInt8556, 120, -16777216, -256);
		Static154.aClass6_6.method7214(10, "Occluded: Ground:" + Static148.anInt4147 + " Walls: " + Static434.anInt7350 + " CPs: " + Static115.anInt1792 + " Pixels: " + Static525.anInt8753, 135, -16777216, -256);
		Static154.aClass6_6.method7214(10, "Occlude Calc Took: " + Static538.aLong236 / 1000L + "us", 150, -16777216, -256);
		if (Static46.anInt746 != 2 || Static174.anIntArray272 == null) {
			return;
		}
		for (@Pc(355) int local355 = 0; local355 < Static174.anIntArray272.length; local355++) {
			@Pc(361) float local361 = (float) Static174.anIntArray272[local355];
			local361 /= 4194304.0F;
			if (local361 > 1.0F) {
				local361 = 1.0F;
			}
			local361 *= 255.0F;
			local361 = 255.0F - local361;
			@Pc(382) int local382 = (int) local361;
			Static174.anIntArray272[local355] = local382 | local382 << 8 | local382 << 16 | 0xFF000000;
		}
		@Pc(410) Class44 local410 = Static480.aClass126_12.method7017(Static106.anInt1658, Static536.anInt8903, Static174.anIntArray272, Static536.anInt8903);
		local410.method5322(10, 170, 1, 0, 0);
	}
}
