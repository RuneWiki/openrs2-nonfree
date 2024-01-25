import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!he", name = "a", descriptor = "[Lclient!fd;")
	public static Class103[] aClass103Array22;

	@OriginalMember(owner = "client!he", name = "b", descriptor = "I")
	public static int anInt8400;

	@OriginalMember(owner = "client!he", name = "c", descriptor = "[I")
	public static int[] anIntArray530;

	@OriginalMember(owner = "client!he", name = "d", descriptor = "Z")
	public static boolean aBoolean609 = false;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILjava/awt/Canvas;Lclient!uu;Lclient!d;II)Lclient!ha;")
	public static Class82 method7240(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Class343 arg2, @OriginalArg(3) Interface5 arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		if (arg1 != null) {
			@Pc(16) Dimension local16 = arg1.getSize();
			local9 = local16.width;
			local11 = local16.height;
		}
		return Static198.method6172(arg4, arg1, arg2, local11, arg0, local9, arg3);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "()V")
	public static void method7242() {
		if (Static576.anInt9421 == 0 || Static303.aClass63_13 == null) {
			return;
		}
		Static568.aClass82_14.K(Static90.anIntArray527);
		for (@Pc(12) int local12 = 0; local12 < Static127.anIntArray170.length; local12++) {
			Static568.aClass82_14.method6154(Static90.anIntArray527[3] - Static90.anIntArray527[1], -256, Static90.anIntArray527[1], Static127.anIntArray170[local12] + Static48.anIntArray589[local12]);
		}
		for (@Pc(41) int local41 = 0; local41 < Static292.anInt5626; local41++) {
			@Pc(46) Class153 local46 = Static291.aClass153Array2[local41];
			Static568.aClass82_14.H(local46.anIntArray248[0], local46.anIntArray249[0], local46.anIntArray247[0], Static269.anIntArray289);
			Static568.aClass82_14.H(local46.anIntArray248[1], local46.anIntArray249[1], local46.anIntArray247[1], Static299.anIntArray316);
			Static568.aClass82_14.H(local46.anIntArray248[2], local46.anIntArray249[2], local46.anIntArray247[2], Static638.anIntArray661);
			Static568.aClass82_14.H(local46.anIntArray248[3], local46.anIntArray249[3], local46.anIntArray247[3], Static415.anIntArray434);
			if (Static269.anIntArray289[2] != -1 && Static299.anIntArray316[2] != -1 && Static638.anIntArray661[2] != -1 && Static415.anIntArray434[2] != -1) {
				@Pc(128) int local128 = -65536;
				if (local46.aByte61 == 4) {
					local128 = -16776961;
				}
				Static568.aClass82_14.method6097(Static299.anIntArray316[1], Static299.anIntArray316[0], Static269.anIntArray289[1], Static269.anIntArray289[0], local128);
				Static568.aClass82_14.method6097(Static638.anIntArray661[1], Static638.anIntArray661[0], Static299.anIntArray316[1], Static299.anIntArray316[0], local128);
				Static568.aClass82_14.method6097(Static415.anIntArray434[1], Static415.anIntArray434[0], Static638.anIntArray661[1], Static638.anIntArray661[0], local128);
				Static568.aClass82_14.method6097(Static269.anIntArray289[1], Static269.anIntArray289[0], Static415.anIntArray434[1], Static415.anIntArray434[0], local128);
				Static568.aClass82_14.method6097(Static638.anIntArray661[1], Static638.anIntArray661[0], Static269.anIntArray289[1], Static269.anIntArray289[0], local128);
			}
		}
		Static303.aClass63_13.method7751(10, -16777216, "Dynamic: " + Static135.anInt2825 + "/" + 5000, -256, 75);
		Static303.aClass63_13.method7751(10, -16777216, "Total Opaque Onscreen: " + Static141.anInt2883 + "/" + 10000, -256, 90);
		Static303.aClass63_13.method7751(10, -16777216, "Total Trans Onscreen: " + Static521.anInt8817 + "/" + 5000, -256, 105);
		Static303.aClass63_13.method7751(10, -16777216, "Occluders: " + (Static414.anInt7270 + Static576.anInt9431) + " Active: " + Static292.anInt5626, -256, 120);
		Static303.aClass63_13.method7751(10, -16777216, "Occluded: Ground:" + Static419.anInt7336 + " Walls: " + Static608.anInt9802 + " CPs: " + Static74.anInt1446 + " Pixels: " + Static560.anInt9310, -256, 135);
		Static303.aClass63_13.method7751(10, -16777216, "Occlude Calc Took: " + Static330.aLong163 / 1000L + "us", -256, 150);
		if (Static576.anInt9421 != 2 || Static443.anIntArray463 == null) {
			return;
		}
		for (@Pc(355) int local355 = 0; local355 < Static443.anIntArray463.length; local355++) {
			@Pc(361) float local361 = (float) Static443.anIntArray463[local355];
			local361 /= 4194304.0F;
			if (local361 > 1.0F) {
				local361 = 1.0F;
			}
			local361 *= 255.0F;
			local361 = 255.0F - local361;
			@Pc(382) int local382 = (int) local361;
			Static443.anIntArray463[local355] = local382 | local382 << 8 | local382 << 16 | 0xFF000000;
		}
		@Pc(410) Class103 local410 = Static568.aClass82_14.method6112(Static157.anInt3195, Static443.anIntArray463, Static196.anInt3665, Static196.anInt3665);
		local410.method7444(10, 170, 1, 0, 0);
	}
}
