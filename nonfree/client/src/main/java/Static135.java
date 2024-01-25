import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!fca", name = "f", descriptor = "Lclient!dj;")
	public static Class75 aClass75_5;

	@OriginalMember(owner = "client!fca", name = "g", descriptor = "[I")
	public static int[] anIntArray552;

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_116 = new Class154(49, 6);

	@OriginalMember(owner = "client!fca", name = "b", descriptor = "I")
	public static int anInt8199 = 0;

	@OriginalMember(owner = "client!fca", name = "d", descriptor = "[F")
	public static final float[] aFloatArray66 = new float[4];

	@OriginalMember(owner = "client!fca", name = "h", descriptor = "I")
	public static int anInt8202 = 0;

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IIIIIIIIIZ)V")
	public static void method6627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (!Static453.method5906(arg2)) {
			return;
		}
		if (Static183.aClass273ArrayArray1[arg2] == null) {
			Static70.method1165(Static509.aClass273ArrayArray2[arg2], -1, arg6, arg1, arg8, arg3, arg0, arg5, arg4, arg7);
		} else {
			Static70.method1165(Static183.aClass273ArrayArray1[arg2], -1, arg6, arg1, arg8, arg3, arg0, arg5, arg4, arg7);
		}
	}

	@OriginalMember(owner = "client!fca", name = "b", descriptor = "(BI)V")
	public static void method6632(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub2_Sub18 local8 = Static508.method6607(arg0, 5);
		local8.method6229();
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "()V")
	public static void method6634() {
		if (Static143.anInt7437 == 0 || Static562.aClass37_19 == null) {
			return;
		}
		Static337.aClass162_13.oa(Static321.anIntArray369);
		for (@Pc(12) int local12 = 0; local12 < Static435.anIntArray474.length; local12++) {
			Static337.aClass162_13.method6834(-256, Static321.anIntArray369[3] - Static321.anIntArray369[1], Static321.anIntArray369[1], Static435.anIntArray474[local12] + Static305.anIntArray353[local12]);
		}
		for (@Pc(41) int local41 = 0; local41 < Static475.anInt5125; local41++) {
			@Pc(46) Class91 local46 = Static370.aClass91Array4[local41];
			Static337.aClass162_13.MA(local46.anIntArray173[0], local46.anIntArray175[0], local46.anIntArray174[0], Static527.anIntArray567);
			Static337.aClass162_13.MA(local46.anIntArray173[1], local46.anIntArray175[1], local46.anIntArray174[1], Static283.anIntArray589);
			Static337.aClass162_13.MA(local46.anIntArray173[2], local46.anIntArray175[2], local46.anIntArray174[2], Static58.anIntArray106);
			Static337.aClass162_13.MA(local46.anIntArray173[3], local46.anIntArray175[3], local46.anIntArray174[3], Static318.anIntArray366);
			if (Static527.anIntArray567[2] != -1 && Static283.anIntArray589[2] != -1 && Static58.anIntArray106[2] != -1 && Static318.anIntArray366[2] != -1) {
				@Pc(128) int local128 = -65536;
				if (local46.aByte25 == 4) {
					local128 = -16776961;
				}
				Static337.aClass162_13.method6849(Static527.anIntArray567[0], Static283.anIntArray589[1], Static527.anIntArray567[1], Static283.anIntArray589[0], local128);
				Static337.aClass162_13.method6849(Static283.anIntArray589[0], Static58.anIntArray106[1], Static283.anIntArray589[1], Static58.anIntArray106[0], local128);
				Static337.aClass162_13.method6849(Static58.anIntArray106[0], Static318.anIntArray366[1], Static58.anIntArray106[1], Static318.anIntArray366[0], local128);
				Static337.aClass162_13.method6849(Static318.anIntArray366[0], Static527.anIntArray567[1], Static318.anIntArray366[1], Static527.anIntArray567[0], local128);
				Static337.aClass162_13.method6849(Static527.anIntArray567[0], Static58.anIntArray106[1], Static527.anIntArray567[1], Static58.anIntArray106[0], local128);
			}
		}
		Static562.aClass37_19.method7723(10, "Static Opaque: OW: " + Static313.anIntArray359[0] + "/" + Static537.anIntArray578[0] + " UW: " + Static313.anIntArray359[1] + "/" + Static537.anIntArray578[1], -256, 30, -16777216);
		Static562.aClass37_19.method7723(10, "Static Trans: OW: " + Static503.anIntArray540[0] + "/" + Static73.anIntArray129[0] + " UW: " + Static503.anIntArray540[1] + "/" + Static73.anIntArray129[1], -256, 45, -16777216);
		Static562.aClass37_19.method7723(10, "Static Anim: OW: " + Static535.anIntArray577[0] + "/" + Static69.anIntArray352[0] + " UW: " + Static535.anIntArray577[1] + "/" + Static69.anIntArray352[1], -256, 60, -16777216);
		Static562.aClass37_19.method7723(10, "Dynamic: " + Static153.anInt2452 + "/" + 5000, -256, 75, -16777216);
		Static562.aClass37_19.method7723(10, "Total Opaque Onscreen: " + Static159.anInt2496 + "/" + 10000, -256, 90, -16777216);
		Static562.aClass37_19.method7723(10, "Total Trans Onscreen: " + Static537.anInt8833 + "/" + 5000, -256, 105, -16777216);
		Static562.aClass37_19.method7723(10, "Occluders: " + (Static211.anInt3064 + Static540.anInt8911) + " Active: " + Static475.anInt5125, -256, 120, -16777216);
		Static562.aClass37_19.method7723(10, "Occluded: Ground:" + Static5.anInt96 + " Walls: " + Static583.anInt9471 + " CPs: " + Static471.anInt7543 + " Pixels: " + Static427.anInt6937, -256, 135, -16777216);
		Static562.aClass37_19.method7723(10, "Occlude Calc Took: " + Static43.aLong28 / 1000L + "us", -256, 150, -16777216);
		if (Static143.anInt7437 != 2 || Static390.anIntArray412 == null) {
			return;
		}
		for (@Pc(461) int local461 = 0; local461 < Static390.anIntArray412.length; local461++) {
			@Pc(467) float local467 = (float) Static390.anIntArray412[local461];
			local467 /= 4194304.0F;
			if (local467 > 1.0F) {
				local467 = 1.0F;
			}
			local467 *= 255.0F;
			local467 = 255.0F - local467;
			@Pc(488) int local488 = (int) local467;
			Static390.anIntArray412[local461] = local488 | local488 << 8 | local488 << 16 | 0xFF000000;
		}
		@Pc(515) Class38 local515 = Static337.aClass162_13.method6879(Static390.anIntArray412, Static457.anInt7352, Static457.anInt7352, Static197.anInt2876);
		local515.V(10, 170, 1, 0, 0);
	}
}
