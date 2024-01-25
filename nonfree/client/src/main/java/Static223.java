import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
	public static int anInt4198;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "()V")
	public static void method3828() {
		if (Static47.anInt1077 == 0 || Static2.aClass69_13 == null) {
			return;
		}
		Static671.aClass13_21.K(Static584.anIntArray810);
		for (@Pc(12) int local12 = 0; local12 < Static219.anIntArray374.length; local12++) {
			Static671.aClass13_21.method8482(Static584.anIntArray810[3] - Static584.anIntArray810[1], Static219.anIntArray374[local12] + Static589.anIntArray820[local12], Static584.anIntArray810[1], -256);
		}
		for (@Pc(41) int local41 = 0; local41 < Static331.anInt5493; local41++) {
			@Pc(46) Class60 local46 = Static433.aClass60Array10[local41];
			Static671.aClass13_21.H(local46.anIntArray122[0], local46.anIntArray123[0], local46.anIntArray121[0], Static219.anIntArray375);
			Static671.aClass13_21.H(local46.anIntArray122[1], local46.anIntArray123[1], local46.anIntArray121[1], Static605.anIntArray841);
			Static671.aClass13_21.H(local46.anIntArray122[2], local46.anIntArray123[2], local46.anIntArray121[2], Static313.anIntArray470);
			Static671.aClass13_21.H(local46.anIntArray122[3], local46.anIntArray123[3], local46.anIntArray121[3], Static528.anIntArray744);
			if (Static219.anIntArray375[2] != -1 && Static605.anIntArray841[2] != -1 && Static313.anIntArray470[2] != -1 && Static528.anIntArray744[2] != -1) {
				@Pc(128) int local128 = -65536;
				if (local46.aByte26 == 4) {
					local128 = -16776961;
				}
				Static671.aClass13_21.method8467(local128, Static219.anIntArray375[1], Static605.anIntArray841[0], Static605.anIntArray841[1], Static219.anIntArray375[0]);
				Static671.aClass13_21.method8467(local128, Static605.anIntArray841[1], Static313.anIntArray470[0], Static313.anIntArray470[1], Static605.anIntArray841[0]);
				Static671.aClass13_21.method8467(local128, Static313.anIntArray470[1], Static528.anIntArray744[0], Static528.anIntArray744[1], Static313.anIntArray470[0]);
				Static671.aClass13_21.method8467(local128, Static528.anIntArray744[1], Static219.anIntArray375[0], Static219.anIntArray375[1], Static528.anIntArray744[0]);
				Static671.aClass13_21.method8467(local128, Static219.anIntArray375[1], Static313.anIntArray470[0], Static313.anIntArray470[1], Static219.anIntArray375[0]);
			}
		}
		Static2.aClass69_13.method8862(75, -16777216, "Dynamic: " + Static77.anInt1423 + "/" + 5000, -256, 10);
		Static2.aClass69_13.method8862(90, -16777216, "Total Opaque Onscreen: " + Static116.anInt2393 + "/" + 10000, -256, 10);
		Static2.aClass69_13.method8862(105, -16777216, "Total Trans Onscreen: " + Static367.anInt5935 + "/" + 5000, -256, 10);
		Static2.aClass69_13.method8862(120, -16777216, "Occluders: " + (Static618.anInt9907 + Static569.anInt9199) + " Active: " + Static331.anInt5493, -256, 10);
		Static2.aClass69_13.method8862(135, -16777216, "Occluded: Ground:" + Static327.anInt5443 + " Walls: " + Static336.anInt5540 + " CPs: " + Static627.anInt10013 + " Pixels: " + Static293.anInt4968, -256, 10);
		Static2.aClass69_13.method8862(150, -16777216, "Occlude Calc Took: " + Static540.aLong256 / 1000L + "us", -256, 10);
		if (Static47.anInt1077 != 2 || Static78.anIntArray318 == null) {
			return;
		}
		for (@Pc(355) int local355 = 0; local355 < Static78.anIntArray318.length; local355++) {
			@Pc(361) float local361 = (float) Static78.anIntArray318[local355];
			local361 /= 4194304.0F;
			if (local361 > 1.0F) {
				local361 = 1.0F;
			}
			local361 *= 255.0F;
			local361 = 255.0F - local361;
			@Pc(382) int local382 = (int) local361;
			Static78.anIntArray318[local355] = local382 | local382 << 8 | local382 << 16 | 0xFF000000;
		}
		@Pc(410) Class33 local410 = Static671.aClass13_21.method8479(Static39.anInt907, Static78.anIntArray318, Static254.anInt4533, Static39.anInt907);
		local410.method7644(10, 170, 1, 0, 0);
	}
}
