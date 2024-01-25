import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static479 {

	@OriginalMember(owner = "client!pda", name = "e", descriptor = "Lclient!hia;")
	public static Class70 aClass70_2;

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "S")
	public static short aShort103;

	@OriginalMember(owner = "client!pda", name = "b", descriptor = "I")
	public static int anInt7692 = -1;

	@OriginalMember(owner = "client!pda", name = "g", descriptor = "Z")
	public static final boolean aBoolean670 = false;

	@OriginalMember(owner = "client!pda", name = "c", descriptor = "I")
	public static int anInt7695 = 0;

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method6878(@OriginalArg(0) Class145 arg0) {
		if (Static535.anInt8486 < 2 && !Static581.aBoolean787 || Static650.aClass273_17 != null) {
			return;
		}
		@Pc(45) String local45;
		if (Static581.aBoolean787 && Static535.anInt8486 < 2) {
			local45 = Static175.aString127 + Static289.aClass191_31.method4067(Static414.anInt9485) + Static701.aString94 + " ->";
		} else if (Static129.aBoolean238 && Static102.aClass184_1.method6058(81) && Static535.anInt8486 > 2) {
			local45 = Static275.method3840(Static91.aClass2_Sub6_Sub20_2);
		} else {
			@Pc(67) Class2_Sub6_Sub20 local67 = Static91.aClass2_Sub6_Sub20_2;
			if (local67 == null) {
				return;
			}
			local45 = Static275.method3840(local67);
			@Pc(77) int[] local77 = null;
			if (Static284.method3981(local67.anInt9603)) {
				local77 = Static543.aClass37_2.method605((int) local67.aLong302).anIntArray350;
			} else if (local67.anInt9601 != -1) {
				local77 = Static543.aClass37_2.method605(local67.anInt9601).anIntArray350;
			} else if (Static690.method9315(local67.anInt9603)) {
				@Pc(111) Class2_Sub49 local111 = (Class2_Sub49) Static467.aClass218_37.method5095((long) (int) local67.aLong302, 0);
				if (local111 != null) {
					@Pc(116) Class4_Sub2_Sub1_Sub2_Sub2 local116 = local111.aClass4_Sub2_Sub1_Sub2_Sub2_3;
					@Pc(119) Class261 local119 = local116.aClass261_1;
					if (local119.anIntArray499 != null) {
						local119 = local119.method6272(Static396.aClass107_1);
					}
					if (local119 != null) {
						local77 = local119.anIntArray502;
					}
				}
			} else if (Static575.method7994(local67.anInt9603)) {
				@Pc(149) Class81 local149 = Static148.aClass153_3.method3342((int) (local67.aLong302 >>> 32 & 0x7FFFFFFFL));
				if (local149.anIntArray143 != null) {
					local149 = local149.method1629(Static396.aClass107_1);
				}
				if (local149 != null) {
					local77 = local149.anIntArray144;
				}
			}
			if (local77 != null) {
				local45 = local45 + Static657.method9030(local77);
			}
		}
		if (Static535.anInt8486 > 2) {
			local45 = local45 + "<col=ffffff> / " + (Static535.anInt8486 - 2) + Static289.aClass191_25.method4067(Static414.anInt9485);
		}
		if (Static171.aClass273_3 != null) {
			@Pc(262) Class68 local262 = Static171.aClass273_3.method6610(arg0);
			if (local262 == null) {
				local262 = Static387.aClass68_12;
			}
			local262.method7899(anInt7692, Static464.anIntArray538, Static171.aClass273_3.anInt7402, local45, Static171.aClass273_3.anInt7397, Static102.anInt1785, Static171.aClass273_3.anInt7396, Static587.anInt8114, Static467.aClass43Array17, Static651.anIntArray721, Static388.aRandom1, Static171.aClass273_3.anInt7369, Static171.aClass273_3.anInt7385, Static171.aClass273_3.anInt7353);
			Static642.method8685(Static651.anIntArray721[3], Static651.anIntArray721[0], Static651.anIntArray721[1], Static651.anIntArray721[2]);
		} else if (Static564.aClass273_16 != null && Static249.aClass150_6 == Static395.aClass150_8) {
			@Pc(242) int local242 = Static387.aClass68_12.method7892(Static388.aRandom1, Static445.anInt7222 + 16, local45, Static335.anInt5132 + 4, Static102.anInt1785, Static464.anIntArray538, Static467.aClass43Array17);
			Static642.method8685(16, Static335.anInt5132 + 4, Static445.anInt7222, local242 + Static277.aClass289_8.method6935(local45));
		}
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "()V")
	public static void method6880() {
		if (Static559.anInt8812 == 0 || Static116.aClass68_5 == null) {
			return;
		}
		Static689.aClass145_16.K(Static290.anIntArray355);
		for (@Pc(14) int local14 = 0; local14 < Static314.anIntArray345.length; local14++) {
			Static689.aClass145_16.method9634(Static314.anIntArray345[local14] + Static708.anIntArray750[local14], Static290.anIntArray355[3] - Static290.anIntArray355[1], Static290.anIntArray355[1], -256);
		}
		for (@Pc(43) int local43 = 0; local43 < Static339.anInt5253; local43++) {
			@Pc(48) Class252 local48 = Static371.aClass252Array2[local43];
			Static689.aClass145_16.H(local48.anIntArray474[0], local48.anIntArray473[0], local48.anIntArray472[0], Static182.anIntArray756);
			Static689.aClass145_16.H(local48.anIntArray474[1], local48.anIntArray473[1], local48.anIntArray472[1], Static28.anIntArray42);
			Static689.aClass145_16.H(local48.anIntArray474[2], local48.anIntArray473[2], local48.anIntArray472[2], Static451.anIntArray523);
			Static689.aClass145_16.H(local48.anIntArray474[3], local48.anIntArray473[3], local48.anIntArray472[3], Static649.anIntArray717);
			if (Static182.anIntArray756[2] != -1 && Static28.anIntArray42[2] != -1 && Static451.anIntArray523[2] != -1 && Static649.anIntArray717[2] != -1) {
				@Pc(136) int local136 = -65536;
				if (local48.aByte84 == 4) {
					local136 = -16776961;
				}
				Static689.aClass145_16.method9688(local136, Static28.anIntArray42[1], Static182.anIntArray756[1], Static182.anIntArray756[0], Static28.anIntArray42[0]);
				Static689.aClass145_16.method9688(local136, Static451.anIntArray523[1], Static28.anIntArray42[1], Static28.anIntArray42[0], Static451.anIntArray523[0]);
				Static689.aClass145_16.method9688(local136, Static649.anIntArray717[1], Static451.anIntArray523[1], Static451.anIntArray523[0], Static649.anIntArray717[0]);
				Static689.aClass145_16.method9688(local136, Static182.anIntArray756[1], Static649.anIntArray717[1], Static649.anIntArray717[0], Static182.anIntArray756[0]);
				Static689.aClass145_16.method9688(local136, Static451.anIntArray523[1], Static182.anIntArray756[1], Static182.anIntArray756[0], Static451.anIntArray523[0]);
			}
		}
		Static116.aClass68_5.method7882(10, -256, "Dynamic: " + Static240.anInt10693 + "/" + 5000, 75, -16777216);
		Static116.aClass68_5.method7882(10, -256, "Total Opaque Onscreen: " + Static457.anInt7457 + "/" + 10000, 90, -16777216);
		Static116.aClass68_5.method7882(10, -256, "Total Trans Onscreen: " + Static689.anInt10611 + "/" + 5000, 105, -16777216);
		Static116.aClass68_5.method7882(10, -256, "Occluders: " + (Static219.anInt3509 + Static672.anInt10469) + " Active: " + Static339.anInt5253, 120, -16777216);
		Static116.aClass68_5.method7882(10, -256, "Occluded: Ground:" + Static373.anInt5942 + " Walls: " + Static437.anInt7125 + " CPs: " + Static558.anInt8804 + " Pixels: " + Static170.anInt2918, 135, -16777216);
		Static116.aClass68_5.method7882(10, -256, "Occlude Calc Took: " + Static18.aLong15 / 1000L + "us", 150, -16777216);
		if (Static559.anInt8812 != 2 || Static146.anIntArray186 == null) {
			return;
		}
		for (@Pc(389) int local389 = 0; local389 < Static146.anIntArray186.length; local389++) {
			@Pc(395) float local395 = (float) Static146.anIntArray186[local389];
			local395 /= 4194304.0F;
			if (local395 > 1.0F) {
				local395 = 1.0F;
			}
			local395 *= 255.0F;
			local395 = 255.0F - local395;
			@Pc(416) int local416 = (int) local395;
			Static146.anIntArray186[local389] = local416 | local416 << 8 | local416 << 16 | 0xFF000000;
		}
		@Pc(444) Class43 local444 = Static689.aClass145_16.method9711(Static451.anInt7308, Static451.anInt7308, Static627.anInt9602, Static146.anIntArray186);
		local444.method9583(10, 170, 1, 0, 0);
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(IIZLjava/lang/String;Ljava/lang/String;)V")
	public static void method6881(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3) {
		@Pc(6) Class2_Sub33 local6 = Static522.method7382();
		local6.aClass2_Sub20_Sub2_1.method8584(Static630.aClass396_6.anInt10768);
		local6.aClass2_Sub20_Sub2_1.method8551(0);
		@Pc(21) int local21 = local6.aClass2_Sub20_Sub2_1.anInt9723;
		local6.aClass2_Sub20_Sub2_1.method8551(664);
		@Pc(30) int[] local30 = Static708.method9451(86, local6);
		@Pc(34) int local34 = local6.aClass2_Sub20_Sub2_1.anInt9723;
		local6.aClass2_Sub20_Sub2_1.method8541(arg3);
		local6.aClass2_Sub20_Sub2_1.method8551(Static175.anInt10800);
		local6.aClass2_Sub20_Sub2_1.method8541(arg2);
		local6.aClass2_Sub20_Sub2_1.method8580(Static170.aLong103);
		local6.aClass2_Sub20_Sub2_1.method8584(Static414.anInt9485);
		local6.aClass2_Sub20_Sub2_1.method8584(Static249.aClass150_6.anInt3649);
		Static602.method9219(local6.aClass2_Sub20_Sub2_1);
		@Pc(75) String local75 = Static425.aString72;
		local6.aClass2_Sub20_Sub2_1.method8584(local75 == null ? 0 : 1);
		if (local75 != null) {
			local6.aClass2_Sub20_Sub2_1.method8541(local75);
		}
		local6.aClass2_Sub20_Sub2_1.method8584(arg0);
		local6.aClass2_Sub20_Sub2_1.method8584(arg1 ? 1 : 0);
		local6.aClass2_Sub20_Sub2_1.anInt9723 += 7;
		local6.aClass2_Sub20_Sub2_1.method8544(local34, local6.aClass2_Sub20_Sub2_1.anInt9723, local30);
		local6.aClass2_Sub20_Sub2_1.method8564(local6.aClass2_Sub20_Sub2_1.anInt9723 - local21);
		Static487.aClass221_1.method5173(local6);
		Static128.anInt2134 = 0;
		Static563.anInt8850 = -3;
		Static122.anInt2071 = 0;
		Static306.anInt4661 = 1;
		if (arg0 < 13) {
			Static80.aBoolean149 = true;
			Static605.method8287();
		}
	}
}
