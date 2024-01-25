import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!hfa", name = "y", descriptor = "I")
	public static int anInt3516;

	@OriginalMember(owner = "client!hfa", name = "A", descriptor = "[Lclient!eda;")
	public static Class85[] aClass85Array1;

	@OriginalMember(owner = "client!hfa", name = "B", descriptor = "Lclient!tf;")
	public static Class17 aClass17_32;

	@OriginalMember(owner = "client!hfa", name = "E", descriptor = "I")
	public static int anInt3520 = 0;

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "()V")
	public static void method3241() {
		if (Static476.anInt7524 == 0 || Static436.aClass56_14 == null) {
			return;
		}
		Static246.aClass33_6.K(Static105.anIntArray143);
		for (@Pc(12) int local12 = 0; local12 < Static562.anIntArray614.length; local12++) {
			Static246.aClass33_6.method8097(-256, Static562.anIntArray614[local12] + Static405.anIntArray446[local12], Static105.anIntArray143[1], Static105.anIntArray143[3] - Static105.anIntArray143[1]);
		}
		for (@Pc(41) int local41 = 0; local41 < Static604.anInt9296; local41++) {
			@Pc(46) Class292 local46 = Static441.aClass292Array170[local41];
			Static246.aClass33_6.H(local46.anIntArray507[0], local46.anIntArray508[0], local46.anIntArray506[0], Static337.anIntArray410);
			Static246.aClass33_6.H(local46.anIntArray507[1], local46.anIntArray508[1], local46.anIntArray506[1], Static566.anIntArray618);
			Static246.aClass33_6.H(local46.anIntArray507[2], local46.anIntArray508[2], local46.anIntArray506[2], Static499.anIntArray536);
			Static246.aClass33_6.H(local46.anIntArray507[3], local46.anIntArray508[3], local46.anIntArray506[3], Static557.anIntArray611);
			if (Static337.anIntArray410[2] != -1 && Static566.anIntArray618[2] != -1 && Static499.anIntArray536[2] != -1 && Static557.anIntArray611[2] != -1) {
				@Pc(128) int local128 = -65536;
				if (local46.aByte107 == 4) {
					local128 = -16776961;
				}
				Static246.aClass33_6.method8139(Static337.anIntArray410[1], Static566.anIntArray618[0], Static566.anIntArray618[1], Static337.anIntArray410[0], local128);
				Static246.aClass33_6.method8139(Static566.anIntArray618[1], Static499.anIntArray536[0], Static499.anIntArray536[1], Static566.anIntArray618[0], local128);
				Static246.aClass33_6.method8139(Static499.anIntArray536[1], Static557.anIntArray611[0], Static557.anIntArray611[1], Static499.anIntArray536[0], local128);
				Static246.aClass33_6.method8139(Static557.anIntArray611[1], Static337.anIntArray410[0], Static337.anIntArray410[1], Static557.anIntArray611[0], local128);
				Static246.aClass33_6.method8139(Static337.anIntArray410[1], Static499.anIntArray536[0], Static499.anIntArray536[1], Static337.anIntArray410[0], local128);
			}
		}
		Static436.aClass56_14.method8052(10, "Dynamic: " + Static239.anInt3959 + "/" + 5000, 75, -256, -16777216);
		Static436.aClass56_14.method8052(10, "Total Opaque Onscreen: " + Static215.anInt3488 + "/" + 10000, 90, -256, -16777216);
		Static436.aClass56_14.method8052(10, "Total Trans Onscreen: " + Static522.anInt8084 + "/" + 5000, 105, -256, -16777216);
		Static436.aClass56_14.method8052(10, "Occluders: " + (Static530.anInt8208 + Static658.anInt10393) + " Active: " + Static604.anInt9296, 120, -256, -16777216);
		Static436.aClass56_14.method8052(10, "Occluded: Ground:" + Static106.anInt2135 + " Walls: " + Static596.anInt9159 + " CPs: " + Static679.anInt10636 + " Pixels: " + Static267.anInt4311, 135, -256, -16777216);
		Static436.aClass56_14.method8052(10, "Occlude Calc Took: " + Static352.aLong163 / 1000L + "us", 150, -256, -16777216);
		if (Static476.anInt7524 != 2 || Static581.anIntArray637 == null) {
			return;
		}
		for (@Pc(355) int local355 = 0; local355 < Static581.anIntArray637.length; local355++) {
			@Pc(361) float local361 = (float) Static581.anIntArray637[local355];
			local361 /= 4194304.0F;
			if (local361 > 1.0F) {
				local361 = 1.0F;
			}
			local361 *= 255.0F;
			local361 = 255.0F - local361;
			@Pc(382) int local382 = (int) local361;
			Static581.anIntArray637[local355] = local382 | local382 << 8 | local382 << 16 | 0xFF000000;
		}
		@Pc(410) Class17 local410 = Static246.aClass33_6.method8128(Static581.anIntArray637, Static148.anInt2693, Static491.anInt7688, Static491.anInt7688);
		local410.method5260(10, 170, 1, 0, 0);
	}

	@OriginalMember(owner = "client!hfa", name = "f", descriptor = "(I)V")
	public static void method3242() {
		Static238.aLong116 = 0L;
		Static1.aString83 = "";
		Static53.anInt1190 = -1;
	}

	@OriginalMember(owner = "client!hfa", name = "h", descriptor = "(I)I")
	public static int method3244() {
		return Static167.anInt3007++;
	}

	@OriginalMember(owner = "client!hfa", name = "i", descriptor = "(I)V")
	public static void method3246() {
		for (@Pc(4) Class4_Sub5_Sub12 local4 = (Class4_Sub5_Sub12) Static256.aClass367_3.method8308(); local4 != null; local4 = (Class4_Sub5_Sub12) Static256.aClass367_3.method8309()) {
			if (local4.anInt4687 > 1) {
				local4.anInt4687 = 0;
				Static487.aClass352_11.method7655(((Class4_Sub5_Sub17) local4.aClass367_5.aClass4_Sub5_58.aClass4_Sub5_67).aLong225, local4);
				local4.aClass367_5.method8305();
			}
		}
		Static579.anInt8938 = 0;
		Static574.anInt8895 = 0;
		Static87.aClass163_14.method3643();
		Static205.aClass66_16.method1988();
		Static256.aClass367_3.method8305();
		Static171.method2839(Static352.aClass4_Sub5_Sub17_4);
	}
}
