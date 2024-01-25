import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!lu", name = "V", descriptor = "I")
	public static int anInt6091;

	@OriginalMember(owner = "client!lu", name = "ab", descriptor = "[I")
	public static int[] anIntArray358 = new int[1];

	@OriginalMember(owner = "client!lu", name = "R", descriptor = "I")
	public static int anInt6079 = 0;

	@OriginalMember(owner = "client!lu", name = "bb", descriptor = "[I")
	public static final int[] anIntArray359 = new int[1000];

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "()V")
	public static void method5484() {
		if (Static679.anInt6105 == 0 || Static456.aClass67_11 == null) {
			return;
		}
		Static277.aClass75_7.K(Static295.anIntArray291);
		for (@Pc(14) int local14 = 0; local14 < Static7.anIntArray6.length; local14++) {
			Static277.aClass75_7.method6691(Static295.anIntArray291[1], Static295.anIntArray291[3] - Static295.anIntArray291[1], Static7.anIntArray6[local14] + Static394.anIntArray409[local14], -256);
		}
		for (@Pc(43) int local43 = 0; local43 < Static141.anInt8738; local43++) {
			@Pc(48) Class230 local48 = Static322.aClass230Array3[local43];
			Static277.aClass75_7.H(local48.anIntArray356[0], local48.anIntArray354[0], local48.anIntArray355[0], Static194.anIntArray209);
			Static277.aClass75_7.H(local48.anIntArray356[1], local48.anIntArray354[1], local48.anIntArray355[1], Static309.anIntArray310);
			Static277.aClass75_7.H(local48.anIntArray356[2], local48.anIntArray354[2], local48.anIntArray355[2], Static470.anIntArray504);
			Static277.aClass75_7.H(local48.anIntArray356[3], local48.anIntArray354[3], local48.anIntArray355[3], Static631.anIntArray649);
			if (Static194.anIntArray209[2] != -1 && Static309.anIntArray310[2] != -1 && Static470.anIntArray504[2] != -1 && Static631.anIntArray649[2] != -1) {
				@Pc(136) int local136 = -65536;
				if (local48.aByte89 == 4) {
					local136 = -16776961;
				}
				Static277.aClass75_7.method6719(Static194.anIntArray209[1], Static309.anIntArray310[0], local136, Static194.anIntArray209[0], Static309.anIntArray310[1]);
				Static277.aClass75_7.method6719(Static309.anIntArray310[1], Static470.anIntArray504[0], local136, Static309.anIntArray310[0], Static470.anIntArray504[1]);
				Static277.aClass75_7.method6719(Static470.anIntArray504[1], Static631.anIntArray649[0], local136, Static470.anIntArray504[0], Static631.anIntArray649[1]);
				Static277.aClass75_7.method6719(Static631.anIntArray649[1], Static194.anIntArray209[0], local136, Static631.anIntArray649[0], Static194.anIntArray209[1]);
				Static277.aClass75_7.method6719(Static194.anIntArray209[1], Static470.anIntArray504[0], local136, Static194.anIntArray209[0], Static470.anIntArray504[1]);
			}
		}
		Static456.aClass67_11.method8294(75, "Dynamic: " + Static243.anInt4671 + "/" + 5000, -16777216, 10, -256);
		Static456.aClass67_11.method8294(90, "Total Opaque Onscreen: " + Static261.anInt5002 + "/" + 10000, -16777216, 10, -256);
		Static456.aClass67_11.method8294(105, "Total Trans Onscreen: " + Static676.anInt10367 + "/" + 5000, -16777216, 10, -256);
		Static456.aClass67_11.method8294(120, "Occluders: " + (Static318.anInt5491 + Static496.anInt8367) + " Active: " + Static141.anInt8738, -16777216, 10, -256);
		Static456.aClass67_11.method8294(135, "Occluded: Ground:" + Static188.anInt3782 + " Walls: " + Static407.anInt7099 + " CPs: " + Static512.anInt8472 + " Pixels: " + Static14.anInt211, -16777216, 10, -256);
		Static456.aClass67_11.method8294(150, "Occlude Calc Took: " + Static258.aLong155 / 1000L + "us", -16777216, 10, -256);
		if (Static679.anInt6105 != 2 || Static251.anIntArray252 == null) {
			return;
		}
		for (@Pc(389) int local389 = 0; local389 < Static251.anIntArray252.length; local389++) {
			@Pc(395) float local395 = (float) Static251.anIntArray252[local389];
			local395 /= 4194304.0F;
			if (local395 > 1.0F) {
				local395 = 1.0F;
			}
			local395 *= 255.0F;
			local395 = 255.0F - local395;
			@Pc(416) int local416 = (int) local395;
			Static251.anIntArray252[local389] = local416 | local416 << 8 | local416 << 16 | 0xFF000000;
		}
		@Pc(444) Class49 local444 = Static277.aClass75_7.method6692(Static487.anInt10362, Static3.anInt17, Static251.anIntArray252, Static3.anInt17);
		local444.method8981(10, 170, 1, 0, 0);
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(Lclient!ha;I)V")
	public static void method5485(@OriginalArg(0) Class75 arg0) {
		Static23.aClass67_1 = Static539.method7689(arg0, Static607.anInt9575, true);
		Static574.aClass53_13 = Static234.method4144(arg0, Static607.anInt9575);
		Static180.aClass67_5 = Static539.method7689(arg0, Static254.anInt4888, true);
		Static507.aClass53_16 = Static234.method4144(arg0, Static254.anInt4888);
		Static205.aClass67_6 = Static539.method7689(arg0, anInt6091, true);
		Static228.aClass53_7 = Static234.method4144(arg0, anInt6091);
	}
}
