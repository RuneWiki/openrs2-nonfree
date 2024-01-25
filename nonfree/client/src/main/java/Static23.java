import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!ar", name = "n", descriptor = "[Lclient!cca;")
	public static Class48_Sub1[] aClass48_Sub1Array1;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_3 = new Class287(5, 4);

	@OriginalMember(owner = "client!ar", name = "j", descriptor = "Z")
	public static boolean aBoolean16 = false;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIII)I")
	public static int method224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static111.anInt2675 < 100) {
			return -2;
		}
		@Pc(14) int local14 = -2;
		@Pc(16) int local16 = Integer.MAX_VALUE;
		@Pc(23) int local23 = arg1 - Static157.anInt2670;
		@Pc(28) int local28 = arg0 - Static157.anInt2671;
		for (@Pc(33) Class3_Sub33 local33 = (Class3_Sub33) Static157.aClass244_22.method5572(); local33 != null; local33 = (Class3_Sub33) Static157.aClass244_22.method5576()) {
			if (arg2 == local33.anInt5496) {
				@Pc(46) int local46 = local33.anInt5494;
				@Pc(49) int local49 = local33.anInt5495;
				@Pc(59) int local59 = local46 + Static157.anInt2670 << 14 | Static157.anInt2671 + local49;
				@Pc(79) int local79 = (local28 - local49) * (-local49 + local28) + (local23 - local46) * (-local46 + local23);
				if (local14 < 0 || local16 > local79) {
					local16 = local79;
					local14 = local59;
				}
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "()V")
	public static void method227() {
		if (Static190.anInt4120 == 0 || Static386.aClass63_8 == null) {
			return;
		}
		Static68.aClass31_4.oa(Static88.anIntArray75);
		for (@Pc(12) int local12 = 0; local12 < Static264.anIntArray238.length; local12++) {
			Static68.aClass31_4.method8029(Static264.anIntArray238[local12] + Static396.anIntArray393[local12], Static88.anIntArray75[1], Static88.anIntArray75[3] - Static88.anIntArray75[1], -256);
		}
		for (@Pc(41) int local41 = 0; local41 < Static473.anInt8222; local41++) {
			@Pc(46) Class236 local46 = Static122.aClass236Array3[local41];
			Static68.aClass31_4.MA(local46.anIntArray368[0], local46.anIntArray366[0], local46.anIntArray367[0], Static592.anIntArray395);
			Static68.aClass31_4.MA(local46.anIntArray368[1], local46.anIntArray366[1], local46.anIntArray367[1], Static218.anIntArray520);
			Static68.aClass31_4.MA(local46.anIntArray368[2], local46.anIntArray366[2], local46.anIntArray367[2], Static269.anIntArray240);
			Static68.aClass31_4.MA(local46.anIntArray368[3], local46.anIntArray366[3], local46.anIntArray367[3], Static509.anIntArray371);
			if (Static592.anIntArray395[2] != -1 && Static218.anIntArray520[2] != -1 && Static269.anIntArray240[2] != -1 && Static509.anIntArray371[2] != -1) {
				@Pc(128) int local128 = -65536;
				if (local46.aByte90 == 4) {
					local128 = -16776961;
				}
				Static68.aClass31_4.method8088(local128, Static592.anIntArray395[1], Static218.anIntArray520[1], Static592.anIntArray395[0], Static218.anIntArray520[0]);
				Static68.aClass31_4.method8088(local128, Static218.anIntArray520[1], Static269.anIntArray240[1], Static218.anIntArray520[0], Static269.anIntArray240[0]);
				Static68.aClass31_4.method8088(local128, Static269.anIntArray240[1], Static509.anIntArray371[1], Static269.anIntArray240[0], Static509.anIntArray371[0]);
				Static68.aClass31_4.method8088(local128, Static509.anIntArray371[1], Static592.anIntArray395[1], Static509.anIntArray371[0], Static592.anIntArray395[0]);
				Static68.aClass31_4.method8088(local128, Static592.anIntArray395[1], Static269.anIntArray240[1], Static592.anIntArray395[0], Static269.anIntArray240[0]);
			}
		}
		Static386.aClass63_8.method6881("Static Opaque: OW: " + Static199.anIntArray186[0] + "/" + Static369.anIntArray361[0] + " UW: " + Static199.anIntArray186[1] + "/" + Static369.anIntArray361[1], -16777216, 10, -256, 30);
		Static386.aClass63_8.method6881("Static Trans: OW: " + Static154.anIntArray135[0] + "/" + Static443.anIntArray467[0] + " UW: " + Static154.anIntArray135[1] + "/" + Static443.anIntArray467[1], -16777216, 10, -256, 45);
		Static386.aClass63_8.method6881("Static Anim: OW: " + Static473.anIntArray482[0] + "/" + Static592.anIntArray396[0] + " UW: " + Static473.anIntArray482[1] + "/" + Static592.anIntArray396[1], -16777216, 10, -256, 60);
		Static386.aClass63_8.method6881("Dynamic: " + Static283.anInt5319 + "/" + 5000, -16777216, 10, -256, 75);
		Static386.aClass63_8.method6881("Total Opaque Onscreen: " + Static505.anInt8754 + "/" + 10000, -16777216, 10, -256, 90);
		Static386.aClass63_8.method6881("Total Trans Onscreen: " + Static127.anInt2900 + "/" + 5000, -16777216, 10, -256, 105);
		Static386.aClass63_8.method6881("Occluders: " + (Static259.anInt1154 + Static58.anInt1550) + " Active: " + Static473.anInt8222, -16777216, 10, -256, 120);
		Static386.aClass63_8.method6881("Occluded: Ground:" + Static590.anInt10263 + " Walls: " + Static388.anInt6724 + " CPs: " + Static310.anInt5725 + " Pixels: " + Static325.anInt5933, -16777216, 10, -256, 135);
		Static386.aClass63_8.method6881("Occlude Calc Took: " + Static125.aLong58 / 1000L + "us", -16777216, 10, -256, 150);
		if (Static190.anInt4120 != 2 || Static543.anIntArray544 == null) {
			return;
		}
		for (@Pc(461) int local461 = 0; local461 < Static543.anIntArray544.length; local461++) {
			@Pc(467) float local467 = (float) Static543.anIntArray544[local461];
			local467 /= 4194304.0F;
			if (local467 > 1.0F) {
				local467 = 1.0F;
			}
			local467 *= 255.0F;
			local467 = 255.0F - local467;
			@Pc(488) int local488 = (int) local467;
			Static543.anIntArray544[local461] = local488 | local488 << 8 | local488 << 16 | 0xFF000000;
		}
		@Pc(515) Class73 local515 = Static68.aClass31_4.method8033(Static543.anIntArray544, Static69.anInt6608, Static69.anInt6608, Static510.anInt8799);
		local515.V(10, 170, 1, 0, 0);
	}
}
