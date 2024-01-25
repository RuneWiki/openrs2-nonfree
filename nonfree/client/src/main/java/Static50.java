import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "Z")
	public static boolean aBoolean68 = false;

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(III)Z")
	public static boolean method784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static489.method7066(arg1, arg0) | (arg1 & 0x40000) != 0 || Static552.method7996(arg1, arg0);
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "()V")
	public static void method785() {
		if (Static316.anInt5608 == 0 || Static660.aClass80_13 == null) {
			return;
		}
		Static205.aClass57_5.K(Static490.anIntArray539);
		for (@Pc(14) int local14 = 0; local14 < Static464.anIntArray473.length; local14++) {
			Static205.aClass57_5.method7647(Static490.anIntArray539[3] - Static490.anIntArray539[1], Static490.anIntArray539[1], Static464.anIntArray473[local14] + Static106.anIntArray92[local14], -256);
		}
		for (@Pc(43) int local43 = 0; local43 < Static443.anInt7616; local43++) {
			@Pc(48) Class337 local48 = Static128.aClass337Array6[local43];
			Static205.aClass57_5.H(local48.anIntArray546[0], local48.anIntArray547[0], local48.anIntArray545[0], Static200.anIntArray191);
			Static205.aClass57_5.H(local48.anIntArray546[1], local48.anIntArray547[1], local48.anIntArray545[1], Static38.anIntArray36);
			Static205.aClass57_5.H(local48.anIntArray546[2], local48.anIntArray547[2], local48.anIntArray545[2], Static188.anIntArray170);
			Static205.aClass57_5.H(local48.anIntArray546[3], local48.anIntArray547[3], local48.anIntArray545[3], Static570.anIntArray536);
			if (Static200.anIntArray191[2] != -1 && Static38.anIntArray36[2] != -1 && Static188.anIntArray170[2] != -1 && Static570.anIntArray536[2] != -1) {
				@Pc(136) int local136 = -65536;
				if (local48.aByte140 == 4) {
					local136 = -16776961;
				}
				Static205.aClass57_5.method7655(Static38.anIntArray36[1], Static200.anIntArray191[1], Static200.anIntArray191[0], Static38.anIntArray36[0], local136);
				Static205.aClass57_5.method7655(Static188.anIntArray170[1], Static38.anIntArray36[1], Static38.anIntArray36[0], Static188.anIntArray170[0], local136);
				Static205.aClass57_5.method7655(Static570.anIntArray536[1], Static188.anIntArray170[1], Static188.anIntArray170[0], Static570.anIntArray536[0], local136);
				Static205.aClass57_5.method7655(Static200.anIntArray191[1], Static570.anIntArray536[1], Static570.anIntArray536[0], Static200.anIntArray191[0], local136);
				Static205.aClass57_5.method7655(Static188.anIntArray170[1], Static200.anIntArray191[1], Static200.anIntArray191[0], Static188.anIntArray170[0], local136);
			}
		}
		Static660.aClass80_13.method8780(-16777216, "Dynamic: " + Static158.anInt2473 + "/" + 5000, 75, -256, 10);
		Static660.aClass80_13.method8780(-16777216, "Total Opaque Onscreen: " + Static379.anInt6501 + "/" + 10000, 90, -256, 10);
		Static660.aClass80_13.method8780(-16777216, "Total Trans Onscreen: " + Static513.anInt8747 + "/" + 5000, 105, -256, 10);
		Static660.aClass80_13.method8780(-16777216, "Occluders: " + (Static57.anInt865 + Static372.anInt8186) + " Active: " + Static443.anInt7616, 120, -256, 10);
		Static660.aClass80_13.method8780(-16777216, "Occluded: Ground:" + Static331.anInt5924 + " Walls: " + Static386.anInt6607 + " CPs: " + Static267.anInt4664 + " Pixels: " + Static224.anInt3656, 135, -256, 10);
		Static660.aClass80_13.method8780(-16777216, "Occlude Calc Took: " + Static46.aLong23 / 1000L + "us", 150, -256, 10);
		if (Static316.anInt5608 != 2 || Static58.anIntArray45 == null) {
			return;
		}
		for (@Pc(389) int local389 = 0; local389 < Static58.anIntArray45.length; local389++) {
			@Pc(395) float local395 = (float) Static58.anIntArray45[local389];
			local395 /= 4194304.0F;
			if (local395 > 1.0F) {
				local395 = 1.0F;
			}
			local395 *= 255.0F;
			local395 = 255.0F - local395;
			@Pc(416) int local416 = (int) local395;
			Static58.anIntArray45[local389] = local416 | local416 << 8 | local416 << 16 | 0xFF000000;
		}
		@Pc(444) Class134 local444 = Static205.aClass57_5.method7679(Static5.anInt9541, Static58.anIntArray45, Static5.anInt9541, Static114.anInt1831);
		local444.method9230(10, 170, 1, 0, 0);
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(I)V")
	public static void method786() {
		while (true) {
			if (Static515.aClass5_Sub23_Sub2_1.method8552(Static327.anInt5853) >= 15) {
				@Pc(16) int local16 = Static515.aClass5_Sub23_Sub2_1.method8550(15);
				if (local16 != 32767) {
					@Pc(23) boolean local23 = false;
					@Pc(30) Class5_Sub35 local30 = (Class5_Sub35) Static623.aClass291_43.method6993((long) local16, 1);
					@Pc(36) Class8_Sub1_Sub3_Sub2_Sub2 local36;
					if (local30 == null) {
						local36 = new Class8_Sub1_Sub3_Sub2_Sub2();
						local36.anInt6994 = local16;
						local30 = new Class5_Sub35(local36);
						Static623.aClass291_43.method6984((long) local16, local30);
						local23 = true;
						Static85.aClass5_Sub35Array1[Static230.anInt3776++] = local30;
					}
					local36 = local30.aClass8_Sub1_Sub3_Sub2_Sub2_2;
					Static671.anIntArray620[Static247.anInt4256++] = local16;
					local36.anInt7040 = Static550.anInt9297;
					if (local36.aClass227_1 != null && local36.aClass227_1.method5327(27420)) {
						Static616.method8741(local36);
					}
					local36.method6004(Static325.aClass231_1.method5363(Static515.aClass5_Sub23_Sub2_1.method8550(14), 2));
					@Pc(108) int local108 = Static515.aClass5_Sub23_Sub2_1.method8550(1);
					if (local108 == 1) {
						Static222.anIntArray207[Static560.anInt9473++] = local16;
					}
					@Pc(134) int local134 = (Static515.aClass5_Sub23_Sub2_1.method8550(3) + 4 & 0x72200007) << 11;
					@Pc(139) int local139 = Static515.aClass5_Sub23_Sub2_1.method8550(1);
					@Pc(146) int local146 = Static515.aClass5_Sub23_Sub2_1.method8550(2);
					@Pc(153) int local153 = Static515.aClass5_Sub23_Sub2_1.method8550(5);
					if (local153 > 15) {
						local153 -= 32;
					}
					@Pc(166) int local166 = Static515.aClass5_Sub23_Sub2_1.method8550(5);
					if (local166 > 15) {
						local166 -= 32;
					}
					local36.method5987(local36.aClass227_1.anInt6248);
					local36.anInt7020 = local36.aClass227_1.anInt6262 << 3;
					if (local23) {
						local36.method5995(local134, true);
					}
					local36.method6012(Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anIntArray415[0] + local153, local139 == 1, Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anIntArray414[0] + local166, local36.method5993(), local146);
					if (local36.aClass227_1.method5327(27420)) {
						Static545.method7956(local36.anIntArray414[0], 0, local36, local36.aByte145, (Class8_Sub1_Sub3_Sub2_Sub1) null, local36.anIntArray415[0], (Class55) null);
					}
					continue;
				}
			}
			Static515.aClass5_Sub23_Sub2_1.method8548();
			return;
		}
	}
}
