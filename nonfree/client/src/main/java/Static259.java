import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!kaa", name = "k", descriptor = "F")
	public static float aFloat115;

	@OriginalMember(owner = "client!kaa", name = "n", descriptor = "Lclient!f;")
	public static Class22 aClass22_24;

	@OriginalMember(owner = "client!kaa", name = "p", descriptor = "[I")
	public static int[] anIntArray367;

	@OriginalMember(owner = "client!kaa", name = "l", descriptor = "I")
	public static int anInt4650 = 0;

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "()V")
	public static void method3766() {
		if (Static162.aClass64_6 == null) {
			return;
		}
		Static402.aClass134_11.oa(Static316.anIntArray424);
		for (@Pc(10) int local10 = 0; local10 < Static397.anIntArray736.length; local10++) {
			Static402.aClass134_11.method6948(Static316.anIntArray424[3] - Static316.anIntArray424[1], Static397.anIntArray736[local10] + Static592.anIntArray737[local10], Static316.anIntArray424[1], -256);
		}
		for (@Pc(39) int local39 = 0; local39 < Static117.anInt2295; local39++) {
			@Pc(44) Class342 local44 = Static312.aClass342Array3[local39];
			Static402.aClass134_11.MA(local44.anIntArray706[0], local44.anIntArray704[0], local44.anIntArray705[0], Static146.anIntArray733);
			Static402.aClass134_11.MA(local44.anIntArray706[1], local44.anIntArray704[1], local44.anIntArray705[1], Static62.anIntArray109);
			Static402.aClass134_11.MA(local44.anIntArray706[2], local44.anIntArray704[2], local44.anIntArray705[2], Static111.anIntArray193);
			Static402.aClass134_11.MA(local44.anIntArray706[3], local44.anIntArray704[3], local44.anIntArray705[3], Static448.anIntArray597);
			if (Static146.anIntArray733[2] != -1 && Static62.anIntArray109[2] != -1 && Static111.anIntArray193[2] != -1 && Static448.anIntArray597[2] != -1) {
				@Pc(126) int local126 = -65536;
				if (local44.aByte122 == 4) {
					local126 = -16776961;
				}
				Static402.aClass134_11.method6933(Static146.anIntArray733[0], Static62.anIntArray109[1], local126, Static146.anIntArray733[1], Static62.anIntArray109[0]);
				Static402.aClass134_11.method6933(Static62.anIntArray109[0], Static111.anIntArray193[1], local126, Static62.anIntArray109[1], Static111.anIntArray193[0]);
				Static402.aClass134_11.method6933(Static111.anIntArray193[0], Static448.anIntArray597[1], local126, Static111.anIntArray193[1], Static448.anIntArray597[0]);
				Static402.aClass134_11.method6933(Static448.anIntArray597[0], Static146.anIntArray733[1], local126, Static448.anIntArray597[1], Static146.anIntArray733[0]);
				Static402.aClass134_11.method6933(Static146.anIntArray733[0], Static111.anIntArray193[1], local126, Static146.anIntArray733[1], Static111.anIntArray193[0]);
			}
		}
		Static162.aClass64_6.method6602(-256, "Static Opaque: OW: " + Static11.anIntArray12[0] + "/" + Static274.anIntArray38[0] + " UW: " + Static11.anIntArray12[1] + "/" + Static274.anIntArray38[1], 10, -16777216, 30);
		Static162.aClass64_6.method6602(-256, "Static Trans: OW: " + Static437.anIntArray588[0] + "/" + Static484.anIntArray627[0] + " UW: " + Static437.anIntArray588[1] + "/" + Static484.anIntArray627[1], 10, -16777216, 45);
		Static162.aClass64_6.method6602(-256, "Static Anim: OW: " + Static583.anIntArray731[0] + "/" + Static196.anIntArray316[0] + " UW: " + Static583.anIntArray731[1] + "/" + Static196.anIntArray316[1], 10, -16777216, 60);
		Static162.aClass64_6.method6602(-256, "Dynamic: " + Static16.anInt203 + "/" + 5000, 10, -16777216, 75);
		Static162.aClass64_6.method6602(-256, "Total Opaque Onscreen: " + Static157.anInt2854 + "/" + 10000, 10, -16777216, 90);
		Static162.aClass64_6.method6602(-256, "Total Trans Onscreen: " + Static404.anInt7075 + "/" + 5000, 10, -16777216, 105);
		Static162.aClass64_6.method6602(-256, "Occluders: " + (Static372.anInt6224 + Static134.anInt2588) + " Active: " + Static117.anInt2295, 10, -16777216, 120);
		Static162.aClass64_6.method6602(-256, "Occluded: Ground:" + Static31.anInt507 + " Walls: " + Static83.anInt1792 + " CPs: " + Static541.anInt9055 + " Pixels: " + Static286.anInt8220, 10, -16777216, 135);
		Static162.aClass64_6.method6602(-256, "Occlude Calc Took: " + Static227.aLong121 / 1000L + "us", 10, -16777216, 150);
		if (Static105.anIntArray185 == null) {
			return;
		}
		for (@Pc(456) int local456 = 0; local456 < Static105.anIntArray185.length; local456++) {
			@Pc(462) float local462 = (float) Static105.anIntArray185[local456];
			local462 /= 4194304.0F;
			if (local462 > 1.0F) {
				local462 = 1.0F;
			}
			local462 *= 255.0F;
			local462 = 255.0F - local462;
			@Pc(483) int local483 = (int) local462;
			Static105.anIntArray185[local456] = local483 | local483 << 8 | local483 << 16 | 0xFF000000;
		}
		@Pc(510) Class22 local510 = Static402.aClass134_11.method6970(Static105.anIntArray185, Static371.anInt6168, Static371.anInt6168, Static558.anInt9341);
		local510.V(10, 170, 1, 0, 0);
	}
}
