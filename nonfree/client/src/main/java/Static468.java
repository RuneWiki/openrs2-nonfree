import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static468 {

	@OriginalMember(owner = "client!qm", name = "f", descriptor = "I")
	public static int anInt10228;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "()V")
	public static void method8768() {
		if (Static30.anInt1014 == 0 || Static553.aClass62_11 == null) {
			return;
		}
		Static232.aClass5_8.K(Static422.anIntArray466);
		for (@Pc(12) int local12 = 0; local12 < Static89.anIntArray77.length; local12++) {
			Static232.aClass5_8.method7484(-256, Static422.anIntArray466[1], Static422.anIntArray466[3] - Static422.anIntArray466[1], Static89.anIntArray77[local12] + Static511.anIntArray547[local12]);
		}
		for (@Pc(41) int local41 = 0; local41 < Static280.anInt5017; local41++) {
			@Pc(46) Class309 local46 = Static287.aClass309Array1[local41];
			Static232.aClass5_8.H(local46.anIntArray568[0], local46.anIntArray569[0], local46.anIntArray567[0], Static108.anIntArray93);
			Static232.aClass5_8.H(local46.anIntArray568[1], local46.anIntArray569[1], local46.anIntArray567[1], Static115.anIntArray102);
			Static232.aClass5_8.H(local46.anIntArray568[2], local46.anIntArray569[2], local46.anIntArray567[2], Static276.anIntArray265);
			Static232.aClass5_8.H(local46.anIntArray568[3], local46.anIntArray569[3], local46.anIntArray567[3], Static417.anIntArray462);
			if (Static108.anIntArray93[2] != -1 && Static115.anIntArray102[2] != -1 && Static276.anIntArray265[2] != -1 && Static417.anIntArray462[2] != -1) {
				@Pc(128) int local128 = -65536;
				if (local46.aByte126 == 4) {
					local128 = -16776961;
				}
				Static232.aClass5_8.method7487(Static115.anIntArray102[1], local128, Static108.anIntArray93[0], Static115.anIntArray102[0], Static108.anIntArray93[1]);
				Static232.aClass5_8.method7487(Static276.anIntArray265[1], local128, Static115.anIntArray102[0], Static276.anIntArray265[0], Static115.anIntArray102[1]);
				Static232.aClass5_8.method7487(Static417.anIntArray462[1], local128, Static276.anIntArray265[0], Static417.anIntArray462[0], Static276.anIntArray265[1]);
				Static232.aClass5_8.method7487(Static108.anIntArray93[1], local128, Static417.anIntArray462[0], Static108.anIntArray93[0], Static417.anIntArray462[1]);
				Static232.aClass5_8.method7487(Static276.anIntArray265[1], local128, Static108.anIntArray93[0], Static276.anIntArray265[0], Static108.anIntArray93[1]);
			}
		}
		Static553.aClass62_11.method8373(-16777216, -256, 10, "Static Opaque: OW: " + Static93.anIntArray83[0] + "/" + Static35.anIntArray28[0] + " UW: " + Static93.anIntArray83[1] + "/" + Static35.anIntArray28[1], 30);
		Static553.aClass62_11.method8373(-16777216, -256, 10, "Static Trans: OW: " + Static62.anIntArray650[0] + "/" + Static591.anIntArray628[0] + " UW: " + Static62.anIntArray650[1] + "/" + Static591.anIntArray628[1], 45);
		Static553.aClass62_11.method8373(-16777216, -256, 10, "Static Anim: OW: " + Static582.anIntArray612[0] + "/" + Static455.anIntArray500[0] + " UW: " + Static582.anIntArray612[1] + "/" + Static455.anIntArray500[1], 60);
		Static553.aClass62_11.method8373(-16777216, -256, 10, "Dynamic: " + Static270.anInt4932 + "/" + 5000, 75);
		Static553.aClass62_11.method8373(-16777216, -256, 10, "Total Opaque Onscreen: " + Static309.anInt5850 + "/" + 10000, 90);
		Static553.aClass62_11.method8373(-16777216, -256, 10, "Total Trans Onscreen: " + Static115.anInt2494 + "/" + 5000, 105);
		Static553.aClass62_11.method8373(-16777216, -256, 10, "Occluders: " + (Static402.anInt7434 + Static199.anInt3923) + " Active: " + Static280.anInt5017, 120);
		Static553.aClass62_11.method8373(-16777216, -256, 10, "Occluded: Ground:" + Static178.anInt10121 + " Walls: " + Static301.anInt5347 + " CPs: " + Static343.anInt6701 + " Pixels: " + Static127.anInt2678, 135);
		Static553.aClass62_11.method8373(-16777216, -256, 10, "Occlude Calc Took: " + Static116.aLong52 / 1000L + "us", 150);
		if (Static30.anInt1014 != 2 || Static101.anIntArray89 == null) {
			return;
		}
		for (@Pc(461) int local461 = 0; local461 < Static101.anIntArray89.length; local461++) {
			@Pc(467) float local467 = (float) Static101.anIntArray89[local461];
			local467 /= 4194304.0F;
			if (local467 > 1.0F) {
				local467 = 1.0F;
			}
			local467 *= 255.0F;
			local467 = 255.0F - local467;
			@Pc(488) int local488 = (int) local467;
			Static101.anIntArray89[local461] = local488 | local488 << 8 | local488 << 16 | 0xFF000000;
		}
		@Pc(516) Class24 local516 = Static232.aClass5_8.method7536(Static101.anIntArray89, Static93.anInt2201, Static305.anInt5423, Static305.anInt5423);
		local516.method8570(10, 170, 1, 0, 0);
	}
}
