import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static586 {

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
	public static int anInt9622;

	@OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
	public static int anInt9626;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZZ)V")
	public static void method7995(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Class5_Sub48 local8 = Static386.method5663(arg1, arg0);
		if (local8 != null) {
			local8.method8829();
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "()V")
	public static void method7997() {
		if (Static307.anInt5476 == 0 || Static140.aClass72_6 == null) {
			return;
		}
		Static267.aClass143_6.K(Static556.anIntArray498);
		for (@Pc(12) int local12 = 0; local12 < Static439.anIntArray432.length; local12++) {
			Static267.aClass143_6.method6245(Static556.anIntArray498[3] - Static556.anIntArray498[1], -256, Static556.anIntArray498[1], Static439.anIntArray432[local12] + Static224.anIntArray200[local12]);
		}
		for (@Pc(41) int local41 = 0; local41 < Static32.anInt447; local41++) {
			@Pc(46) Class180 local46 = Static41.aClass180Array1[local41];
			Static267.aClass143_6.H(local46.anIntArray257[0], local46.anIntArray255[0], local46.anIntArray258[0], Static174.anIntArray166);
			Static267.aClass143_6.H(local46.anIntArray257[1], local46.anIntArray255[1], local46.anIntArray258[1], Static186.anIntArray173);
			Static267.aClass143_6.H(local46.anIntArray257[2], local46.anIntArray255[2], local46.anIntArray258[2], Static623.anIntArray570);
			Static267.aClass143_6.H(local46.anIntArray257[3], local46.anIntArray255[3], local46.anIntArray258[3], Static635.anIntArray580);
			if (Static174.anIntArray166[2] != -1 && Static186.anIntArray173[2] != -1 && Static623.anIntArray570[2] != -1 && Static635.anIntArray580[2] != -1) {
				@Pc(128) int local128 = -65536;
				if (local46.aByte48 == 4) {
					local128 = -16776961;
				}
				Static267.aClass143_6.method6202(Static186.anIntArray173[0], local128, Static174.anIntArray166[0], Static186.anIntArray173[1], Static174.anIntArray166[1]);
				Static267.aClass143_6.method6202(Static623.anIntArray570[0], local128, Static186.anIntArray173[0], Static623.anIntArray570[1], Static186.anIntArray173[1]);
				Static267.aClass143_6.method6202(Static635.anIntArray580[0], local128, Static623.anIntArray570[0], Static635.anIntArray580[1], Static623.anIntArray570[1]);
				Static267.aClass143_6.method6202(Static174.anIntArray166[0], local128, Static635.anIntArray580[0], Static174.anIntArray166[1], Static635.anIntArray580[1]);
				Static267.aClass143_6.method6202(Static623.anIntArray570[0], local128, Static174.anIntArray166[0], Static623.anIntArray570[1], Static174.anIntArray166[1]);
			}
		}
		Static140.aClass72_6.method6925(75, "Dynamic: " + Static89.anInt1482 + "/" + 5000, 10, -16777216, -256);
		Static140.aClass72_6.method6925(90, "Total Opaque Onscreen: " + Static26.anInt350 + "/" + 10000, 10, -16777216, -256);
		Static140.aClass72_6.method6925(105, "Total Trans Onscreen: " + Static676.anInt9313 + "/" + 5000, 10, -16777216, -256);
		Static140.aClass72_6.method6925(120, "Occluders: " + (Static28.anInt387 + Static509.anInt5962) + " Active: " + Static32.anInt447, 10, -16777216, -256);
		Static140.aClass72_6.method6925(135, "Occluded: Ground:" + Static224.anInt3589 + " Walls: " + Static336.anInt6092 + " CPs: " + Static423.anInt7531 + " Pixels: " + Static309.anInt5508, 10, -16777216, -256);
		Static140.aClass72_6.method6925(150, "Occlude Calc Took: " + Static78.aLong53 / 1000L + "us", 10, -16777216, -256);
		if (Static307.anInt5476 != 2 || Static92.anIntArray87 == null) {
			return;
		}
		for (@Pc(355) int local355 = 0; local355 < Static92.anIntArray87.length; local355++) {
			@Pc(361) float local361 = (float) Static92.anIntArray87[local355];
			local361 /= 4194304.0F;
			if (local361 > 1.0F) {
				local361 = 1.0F;
			}
			local361 *= 255.0F;
			local361 = 255.0F - local361;
			@Pc(382) int local382 = (int) local361;
			Static92.anIntArray87[local355] = local382 | local382 << 8 | local382 << 16 | 0xFF000000;
		}
		@Pc(410) Class59 local410 = Static267.aClass143_6.method6241(Static220.anInt3498, Static626.anInt10033, Static626.anInt10033, Static92.anIntArray87);
		local410.method8067(10, 170, 1, 0, 0);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
	public static void method8000() {
		if (Static308.aString50.toLowerCase().indexOf("microsoft") != -1) {
			Static649.anIntArray593[191] = 73;
			Static649.anIntArray593[190] = 72;
			Static649.anIntArray593[188] = 71;
			Static649.anIntArray593[186] = 57;
			Static649.anIntArray593[192] = 58;
			Static649.anIntArray593[219] = 42;
			Static649.anIntArray593[222] = 59;
			Static649.anIntArray593[223] = 28;
			Static649.anIntArray593[189] = 26;
			Static649.anIntArray593[220] = 74;
			Static649.anIntArray593[221] = 43;
			Static649.anIntArray593[187] = 27;
			return;
		}
		if (Static308.aMethod1 == null) {
			Static649.anIntArray593[222] = 59;
			Static649.anIntArray593[192] = 58;
		} else {
			Static649.anIntArray593[520] = 59;
			Static649.anIntArray593[222] = 58;
			Static649.anIntArray593[192] = 28;
		}
		Static649.anIntArray593[47] = 73;
		Static649.anIntArray593[45] = 26;
		Static649.anIntArray593[91] = 42;
		Static649.anIntArray593[61] = 27;
		Static649.anIntArray593[93] = 43;
		Static649.anIntArray593[46] = 72;
		Static649.anIntArray593[92] = 74;
		Static649.anIntArray593[44] = 71;
		Static649.anIntArray593[59] = 57;
	}
}
