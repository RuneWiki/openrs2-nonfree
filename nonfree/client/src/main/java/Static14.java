import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "Lclient!la;")
	public static Class58 aClass58_1;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_8 = new Class362(66, 12);

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "()V")
	public static void method188() {
		if (Static440.aClass58_12 == null) {
			return;
		}
		Static468.aClass44_7.oa(Static498.anIntArray485);
		for (@Pc(10) int local10 = 0; local10 < Static113.anIntArray122.length; local10++) {
			Static468.aClass44_7.method5021(Static113.anIntArray122[local10] + Static339.anIntArray335[local10], Static498.anIntArray485[3] - Static498.anIntArray485[1], -256, Static498.anIntArray485[1]);
		}
		for (@Pc(39) int local39 = 0; local39 < Static518.anInt9302; local39++) {
			@Pc(44) Class314 local44 = Static70.aClass314Array2[local39];
			Static468.aClass44_7.MA(local44.anIntArray487[0], local44.anIntArray486[0], local44.anIntArray488[0], Static255.anIntArray240);
			Static468.aClass44_7.MA(local44.anIntArray487[1], local44.anIntArray486[1], local44.anIntArray488[1], Static231.anIntArray203);
			Static468.aClass44_7.MA(local44.anIntArray487[2], local44.anIntArray486[2], local44.anIntArray488[2], Static422.anIntArray417);
			Static468.aClass44_7.MA(local44.anIntArray487[3], local44.anIntArray486[3], local44.anIntArray488[3], Static336.anIntArray322);
			if (Static255.anIntArray240[2] != -1 && Static231.anIntArray203[2] != -1 && Static422.anIntArray417[2] != -1 && Static336.anIntArray322[2] != -1) {
				@Pc(126) int local126 = -65536;
				if (local44.aByte113 == 4) {
					local126 = -16776961;
				}
				Static468.aClass44_7.method5040(local126, Static231.anIntArray203[0], Static255.anIntArray240[1], Static255.anIntArray240[0], Static231.anIntArray203[1]);
				Static468.aClass44_7.method5040(local126, Static422.anIntArray417[0], Static231.anIntArray203[1], Static231.anIntArray203[0], Static422.anIntArray417[1]);
				Static468.aClass44_7.method5040(local126, Static336.anIntArray322[0], Static422.anIntArray417[1], Static422.anIntArray417[0], Static336.anIntArray322[1]);
				Static468.aClass44_7.method5040(local126, Static255.anIntArray240[0], Static336.anIntArray322[1], Static336.anIntArray322[0], Static255.anIntArray240[1]);
				Static468.aClass44_7.method5040(local126, Static422.anIntArray417[0], Static255.anIntArray240[1], Static255.anIntArray240[0], Static422.anIntArray417[1]);
			}
		}
		Static440.aClass58_12.method8156(-16777216, -256, "Static Opaque: OW: " + Static156.anIntArray148[0] + "/" + Static561.anIntArray289[0] + " UW: " + Static156.anIntArray148[1] + "/" + Static561.anIntArray289[1], 30, 10);
		Static440.aClass58_12.method8156(-16777216, -256, "Static Trans: OW: " + Static291.anIntArray291[0] + "/" + Static478.anIntArray478[0] + " UW: " + Static291.anIntArray291[1] + "/" + Static478.anIntArray478[1], 45, 10);
		Static440.aClass58_12.method8156(-16777216, -256, "Static Anim: OW: " + Static2.anIntArray3[0] + "/" + Static47.anIntArray24[0] + " UW: " + Static2.anIntArray3[1] + "/" + Static47.anIntArray24[1], 60, 10);
		Static440.aClass58_12.method8156(-16777216, -256, "Dynamic: " + Static375.anInt7259 + "/" + 5000, 75, 10);
		Static440.aClass58_12.method8156(-16777216, -256, "Total Opaque Onscreen: " + Static422.anInt7927 + "/" + 10000, 90, 10);
		Static440.aClass58_12.method8156(-16777216, -256, "Total Trans Onscreen: " + Static106.anInt2410 + "/" + 5000, 105, 10);
		Static440.aClass58_12.method8156(-16777216, -256, "Occluders: " + (Static343.anInt6653 + Static180.anInt3623) + " Active: " + Static518.anInt9302, 120, 10);
		Static440.aClass58_12.method8156(-16777216, -256, "Occluded: Ground:" + Static105.anInt2400 + " Walls: " + Static110.anInt2623 + " CPs: " + Static561.anInt5883 + " Pixels: " + Static192.anInt3745, 135, 10);
		Static440.aClass58_12.method8156(-16777216, -256, "Occlude Calc Took: " + Static438.aLong214 / 1000L + "us", 150, 10);
		if (Static5.anIntArray5 == null) {
			return;
		}
		for (@Pc(456) int local456 = 0; local456 < Static5.anIntArray5.length; local456++) {
			@Pc(462) float local462 = (float) Static5.anIntArray5[local456];
			local462 /= 4194304.0F;
			if (local462 > 1.0F) {
				local462 = 1.0F;
			}
			local462 *= 255.0F;
			local462 = 255.0F - local462;
			@Pc(483) int local483 = (int) local462;
			Static5.anIntArray5[local456] = local483 | local483 << 8 | local483 << 16 | 0xFF000000;
		}
		@Pc(510) Class78 local510 = Static468.aClass44_7.method4969(Static5.anIntArray5, Static47.anInt645, Static47.anInt645, Static582.anInt10109);
		local510.V(10, 170, 1, 0, 0);
	}
}
