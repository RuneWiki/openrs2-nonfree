import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!qj", name = "i", descriptor = "Lclient!dga;")
	public static Class72 aClass72_3;

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "Lclient!el;")
	public static final Class95 aClass95_2 = new Class95();

	@OriginalMember(owner = "client!qj", name = "f", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_111 = new Class90(78, -1);

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
	public static int anInt8342 = -1;

	@OriginalMember(owner = "client!qj", name = "h", descriptor = "[F")
	public static final float[] aFloatArray65 = new float[4];

	@OriginalMember(owner = "client!qj", name = "j", descriptor = "Lclient!mo;")
	public static final Class221 aClass221_29 = new Class221(512);

	@OriginalMember(owner = "client!qj", name = "k", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_112 = new Class90(110, 5);

	@OriginalMember(owner = "client!qj", name = "l", descriptor = "Z")
	public static boolean aBoolean593 = false;

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(JLclient!r;Z)V")
	public static void method6463(@OriginalArg(0) long arg0, @OriginalArg(1) Class7 arg1) {
		Static158.anInt3338 = 0;
		Static319.anInt6347 = 0;
		Static343.anInt6620 = Static430.anInt8212;
		Static430.anInt8212 = 0;
		@Pc(16) long local16 = Static112.method2047();
		for (@Pc(21) Class21_Sub5 local21 = (Class21_Sub5) Static109.aClass158_8.method3726(); local21 != null; local21 = (Class21_Sub5) Static109.aClass158_8.method3721()) {
			if (local21.method3055(arg1, arg0)) {
				Static158.anInt3338++;
			}
		}
		if (Static228.aBoolean339 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static109.aClass158_8.method3725() + ", running: " + Static158.anInt3338);
			System.out.println("Emitters: " + Static319.anInt6347 + " Particles: " + Static430.anInt8212 + ". Time taken: " + (Static112.method2047() - local16) + "ms");
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "()V")
	public static void method6465() {
		if (Static118.anInt2705 == 0 || Static386.aClass45_6 == null) {
			return;
		}
		Static299.aClass7_12.oa(Static500.anIntArray534);
		for (@Pc(12) int local12 = 0; local12 < Static13.anIntArray13.length; local12++) {
			Static299.aClass7_12.method7789(Static500.anIntArray534[1], Static13.anIntArray13[local12] + Static427.anIntArray456[local12], Static500.anIntArray534[3] - Static500.anIntArray534[1], -256);
		}
		for (@Pc(41) int local41 = 0; local41 < Static407.anInt7866; local41++) {
			@Pc(46) Class262 local46 = Static218.aClass262Array1[local41];
			Static299.aClass7_12.MA(local46.anIntArray419[0], local46.anIntArray417[0], local46.anIntArray418[0], Static393.anIntArray412);
			Static299.aClass7_12.MA(local46.anIntArray419[1], local46.anIntArray417[1], local46.anIntArray418[1], Static547.anIntArray560);
			Static299.aClass7_12.MA(local46.anIntArray419[2], local46.anIntArray417[2], local46.anIntArray418[2], Static452.anIntArray500);
			Static299.aClass7_12.MA(local46.anIntArray419[3], local46.anIntArray417[3], local46.anIntArray418[3], Static192.anIntArray189);
			if (Static393.anIntArray412[2] != -1 && Static547.anIntArray560[2] != -1 && Static452.anIntArray500[2] != -1 && Static192.anIntArray189[2] != -1) {
				@Pc(128) int local128 = -65536;
				if (local46.aByte112 == 4) {
					local128 = -16776961;
				}
				Static299.aClass7_12.method7844(Static547.anIntArray560[0], local128, Static393.anIntArray412[1], Static547.anIntArray560[1], Static393.anIntArray412[0]);
				Static299.aClass7_12.method7844(Static452.anIntArray500[0], local128, Static547.anIntArray560[1], Static452.anIntArray500[1], Static547.anIntArray560[0]);
				Static299.aClass7_12.method7844(Static192.anIntArray189[0], local128, Static452.anIntArray500[1], Static192.anIntArray189[1], Static452.anIntArray500[0]);
				Static299.aClass7_12.method7844(Static393.anIntArray412[0], local128, Static192.anIntArray189[1], Static393.anIntArray412[1], Static192.anIntArray189[0]);
				Static299.aClass7_12.method7844(Static452.anIntArray500[0], local128, Static393.anIntArray412[1], Static452.anIntArray500[1], Static393.anIntArray412[0]);
			}
		}
		Static386.aClass45_6.method4843(10, "Static Opaque: OW: " + Static137.anIntArray143[0] + "/" + Static98.anIntArray115[0] + " UW: " + Static137.anIntArray143[1] + "/" + Static98.anIntArray115[1], -16777216, -256, 30);
		Static386.aClass45_6.method4843(10, "Static Trans: OW: " + Static254.anIntArray281[0] + "/" + Static57.anIntArray57[0] + " UW: " + Static254.anIntArray281[1] + "/" + Static57.anIntArray57[1], -16777216, -256, 45);
		Static386.aClass45_6.method4843(10, "Static Anim: OW: " + Static27.anIntArray195[0] + "/" + Static54.anIntArray55[0] + " UW: " + Static27.anIntArray195[1] + "/" + Static54.anIntArray55[1], -16777216, -256, 60);
		Static386.aClass45_6.method4843(10, "Dynamic: " + Static496.anInt9339 + "/" + 5000, -16777216, -256, 75);
		Static386.aClass45_6.method4843(10, "Total Opaque Onscreen: " + Static277.anInt5771 + "/" + 10000, -16777216, -256, 90);
		Static386.aClass45_6.method4843(10, "Total Trans Onscreen: " + Static459.anInt8207 + "/" + 5000, -16777216, -256, 105);
		Static386.aClass45_6.method4843(10, "Occluders: " + (Static28.anInt1048 + Static123.anInt9178) + " Active: " + Static407.anInt7866, -16777216, -256, 120);
		Static386.aClass45_6.method4843(10, "Occluded: Ground:" + Static348.anInt6732 + " Walls: " + Static119.anInt2720 + " CPs: " + Static217.anInt8618 + " Pixels: " + Static350.anInt7294, -16777216, -256, 135);
		Static386.aClass45_6.method4843(10, "Occlude Calc Took: " + Static242.aLong285 / 1000L + "us", -16777216, -256, 150);
		if (Static118.anInt2705 != 2 || Static333.anIntArray353 == null) {
			return;
		}
		for (@Pc(461) int local461 = 0; local461 < Static333.anIntArray353.length; local461++) {
			@Pc(467) float local467 = (float) Static333.anIntArray353[local461];
			local467 /= 4194304.0F;
			if (local467 > 1.0F) {
				local467 = 1.0F;
			}
			local467 *= 255.0F;
			local467 = 255.0F - local467;
			@Pc(488) int local488 = (int) local467;
			Static333.anIntArray353[local461] = local488 | local488 << 8 | local488 << 16 | 0xFF000000;
		}
		@Pc(515) Class88 local515 = Static299.aClass7_12.method7838(Static333.anIntArray353, Static161.anInt3354, Static161.anInt3354, Static251.anInt5137);
		local515.V(10, 170, 1, 0, 0);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(III)B")
	public static byte method6466(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!vo;Lclient!vo;Lclient!vo;Lclient!vo;B)V")
	public static void method6467(@OriginalArg(0) Class348 arg0, @OriginalArg(1) Class348 arg1, @OriginalArg(2) Class348 arg2, @OriginalArg(3) Class348 arg3) {
		Static225.aClass348_52 = arg2;
		Static9.aClass348_7 = arg0;
		Static295.aClass348_121 = arg3;
		Static535.aClass155ArrayArray2 = new Class155[Static9.aClass348_7.method7985()][];
		Static172.aBooleanArray7 = new boolean[Static9.aClass348_7.method7985()];
	}
}
