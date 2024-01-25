import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!kh", name = "l", descriptor = "Z")
	public static boolean aBoolean429 = false;

	@OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
	public static int anInt5040 = 0;

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "I")
	public static int anInt5041 = 1;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Throwable;)V")
	public static void method4572(@OriginalArg(0) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(15) String local15 = "";
			if (arg1 != null) {
				local15 = Static546.method7629(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local15 = local15 + " | ";
				}
				local15 = local15 + arg0;
			}
			Static331.method4597(local15);
			local15 = Static353.method9848(":", local15, "%3a");
			local15 = Static353.method9848("@", local15, "%40");
			local15 = Static353.method9848("&", local15, "%26");
			local15 = Static353.method9848("#", local15, "%23");
			if (Static675.anApplet2 != null) {
				@Pc(134) Class163 local134 = Static29.aClass389_1.method9268(new URL(Static675.anApplet2.getCodeBase(), "clienterror.ws?c=" + Static592.anInt9252 + "&u=" + (Static247.aString47 == null ? String.valueOf(Static508.aLong251) : Static247.aString47) + "&v1=" + Static688.aString118 + "&v2=" + Static688.aString121 + "&e=" + local15));
				while (local134.anInt3843 == 0) {
					Static570.method7907(1L);
				}
				if (local134.anInt3843 == 1) {
					@Pc(157) DataInputStream local157 = (DataInputStream) local134.anObject5;
					local157.read();
					local157.close();
				}
			}
		} catch (@Pc(164) Exception local164) {
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!et;I)Lclient!gh;")
	public static Class136 method4574(@OriginalArg(0) Class2_Sub20 arg0) {
		@Pc(15) int local15 = arg0.method8575();
		return new Class136(local15);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILclient!ha;ILclient!oh;I)V")
	public static void method4575(@OriginalArg(0) int arg0, @OriginalArg(1) Class145 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class273 arg3) {
		@Pc(10) Class114 local10 = arg3.method6608(arg1);
		if (local10 == null) {
			return;
		}
		@Pc(22) Class1 local22 = local10.aClass1_1;
		arg1.KA(arg0, arg2, arg0 + arg3.anInt7402, arg2 + arg3.anInt7385);
		if (Static238.anInt3745 == 2 || Static238.anInt3745 == 5 || Static73.aClass43_2 == null) {
			arg1.A(-16777216, local22, arg0, arg2);
			return;
		}
		@Pc(61) int local61;
		@Pc(69) int local69;
		@Pc(67) int local67;
		@Pc(71) int local71;
		if (Static60.anInt1040 == 4) {
			local61 = Static670.anInt10429;
			local67 = (int) -Static213.aFloat46 & 0x3FFF;
			local69 = Static712.anInt10863;
			local71 = 4096;
		} else {
			local61 = Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10229;
			local67 = (int) -Static213.aFloat46 + Static91.anInt1623 & 0x3FFF;
			local69 = Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10228;
			local71 = 4096 - Static505.anInt8017 * 16;
		}
		@Pc(107) int local107 = local61 / 128 + 208 + 48 - Static426.anInt6942 * 2;
		@Pc(125) int local125 = Static280.anInt6752 * 4 + 48 - local69 / 128 - (Static280.anInt6752 + -104) * 2;
		Static73.aClass43_2.method9607((float) arg3.anInt7402 / 2.0F + (float) arg0, (float) arg3.anInt7385 / 2.0F + (float) arg2, (float) local107, (float) local125, local71, local67 << 2, local22, arg0, arg2);
		@Pc(178) int local178;
		@Pc(188) int local188;
		@Pc(199) int local199;
		@Pc(210) int local210;
		for (@Pc(159) Class2_Sub2 local159 = (Class2_Sub2) Static39.aClass60_15.method1226(7); local159 != null; local159 = (Class2_Sub2) Static39.aClass60_15.method1228()) {
			@Pc(166) int local166 = local159.anInt41;
			local178 = (Static8.aClass372_1.anIntArray722[local166] >> 14 & 0x3FFF) - Static243.anInt3820;
			local188 = (Static8.aClass372_1.anIntArray722[local166] & 0x3FFF) - Static224.anInt11062;
			local199 = local178 * 4 + 2 - local61 / 128;
			local210 = local188 * 4 + 2 - local69 / 128;
			Static124.method1844(arg1, Static8.aClass372_1.anIntArray723[local166], local199, arg3, arg2, arg0, local22, local210);
		}
		for (local178 = 0; local178 < Static416.anInt6806; local178++) {
			local188 = Static336.anIntArray367[local178] * 4 + 2 - local61 / 128;
			local199 = Static403.anIntArray465[local178] * 4 + 2 - local69 / 128;
			@Pc(270) Class81 local270 = Static148.aClass153_3.method3342(Static408.anIntArray470[local178]);
			if (local270.anIntArray143 != null) {
				local270 = local270.method1629(Static396.aClass107_1);
				if (local270 == null || local270.anInt1853 == -1) {
					continue;
				}
			}
			Static124.method1844(arg1, local270.anInt1853, local188, arg3, arg2, arg0, local22, local199);
		}
		@Pc(364) int local364;
		@Pc(375) int local375;
		for (@Pc(316) Class2_Sub53 local316 = (Class2_Sub53) Static596.aClass218_41.method5092(); local316 != null; local316 = (Class2_Sub53) Static596.aClass218_41.method5096()) {
			local199 = (int) (local316.aLong352 >> 28 & 0x3L);
			if (Static685.anInt10550 == local199) {
				local210 = (int) (local316.aLong352 & 0x3FFFL) - Static243.anInt3820;
				@Pc(353) int local353 = (int) (local316.aLong352 >> 14 & 0x3FFFL) - Static224.anInt11062;
				local364 = local210 * 4 + 2 - local61 / 128;
				local375 = local353 * 4 + 2 - local69 / 128;
				Static433.method8699(local22, arg0, arg2, arg3, local364, Static294.aClass43Array16[0], local375);
			}
		}
		@Pc(471) int local471;
		for (local199 = 0; local199 < Static217.anInt3445; local199++) {
			@Pc(408) Class2_Sub49 local408 = (Class2_Sub49) Static467.aClass218_37.method5095((long) Static266.anIntArray305[local199], 0);
			if (local408 != null) {
				@Pc(413) Class4_Sub2_Sub1_Sub2_Sub2 local413 = local408.aClass4_Sub2_Sub1_Sub2_Sub2_3;
				if (local413.method2073() && local413.aByte133 == Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aByte133) {
					@Pc(427) Class261 local427 = local413.aClass261_1;
					if (local427 != null && local427.anIntArray499 != null) {
						local427 = local427.method6272(Static396.aClass107_1);
					}
					if (local427 != null && local427.aBoolean586 && local427.aBoolean585) {
						local375 = local413.anInt10229 / 128 - local61 / 128;
						local471 = local413.anInt10228 / 128 - local69 / 128;
						if (local427.anInt7013 == -1) {
							Static433.method8699(local22, arg0, arg2, arg3, local375, Static294.aClass43Array16[1], local471);
						} else {
							Static124.method1844(arg1, local427.anInt7013, local375, arg3, arg2, arg0, local22, local471);
						}
					}
				}
			}
		}
		local210 = Static268.anInt4162;
		@Pc(515) int[] local515 = Static597.anIntArray677;
		@Pc(574) int local574;
		@Pc(578) int local578;
		@Pc(614) int local614;
		for (local364 = 0; local364 < local210; local364++) {
			@Pc(525) Class4_Sub2_Sub1_Sub2_Sub1 local525 = Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1[local515[local364]];
			if (local525 != null && local525.method739() && !local525.aBoolean104 && Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2 != local525 && Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aByte133 == local525.aByte133) {
				local471 = local525.anInt10229 / 128 - local61 / 128;
				local574 = local525.anInt10228 / 128 - local69 / 128;
				@Pc(576) boolean local576 = false;
				for (local578 = 0; local578 < Static143.anInt2455; local578++) {
					if (local525.aString4.equals(Static80.aStringArray8[local578]) && Static59.anIntArray91[local578] != 0) {
						local576 = true;
						break;
					}
				}
				@Pc(612) boolean local612 = false;
				for (local614 = 0; local614 < Static664.anInt10333; local614++) {
					if (local525.aString4.equals(Static56.aClass143Array1[local614].aString41)) {
						local612 = true;
						break;
					}
				}
				@Pc(644) boolean local644 = false;
				if (Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt840 != 0 && local525.anInt840 != 0 && local525.anInt840 == Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt840) {
					local644 = true;
				}
				if (local525.aBoolean102) {
					Static433.method8699(local22, arg0, arg2, arg3, local471, Static294.aClass43Array16[6], local574);
				} else if (local644) {
					Static433.method8699(local22, arg0, arg2, arg3, local471, Static294.aClass43Array16[4], local574);
				} else if (local525.aBoolean99) {
					Static433.method8699(local22, arg0, arg2, arg3, local471, Static294.aClass43Array16[7], local574);
				} else if (local576) {
					Static433.method8699(local22, arg0, arg2, arg3, local471, Static294.aClass43Array16[3], local574);
				} else if (local612) {
					Static433.method8699(local22, arg0, arg2, arg3, local471, Static294.aClass43Array16[5], local574);
				} else {
					Static433.method8699(local22, arg0, arg2, arg3, local471, Static294.aClass43Array16[2], local574);
				}
			}
		}
		@Pc(781) Class350[] local781 = Static690.aClass350Array1;
		@Pc(876) int local876;
		for (local471 = 0; local471 < local781.length; local471++) {
			@Pc(789) Class350 local789 = local781[local471];
			if (local789 != null && local789.anInt9441 != 0 && Static528.anInt8386 % 20 < 10) {
				@Pc(839) int local839;
				if (local789.anInt9441 == 1) {
					@Pc(824) Class2_Sub49 local824 = (Class2_Sub49) Static467.aClass218_37.method5095((long) local789.anInt9439, 0);
					if (local824 != null) {
						@Pc(829) Class4_Sub2_Sub1_Sub2_Sub2 local829 = local824.aClass4_Sub2_Sub1_Sub2_Sub2_3;
						local839 = local829.anInt10229 / 128 - local61 / 128;
						local614 = local829.anInt10228 / 128 - local69 / 128;
						Static3.method50(360000L, arg0, arg2, local614, local839, local789.anInt9437, arg3, local22);
					}
				}
				if (local789.anInt9441 == 2) {
					local876 = local789.anInt9443 / 128 - local61 / 128;
					local578 = local789.anInt9434 / 128 - local69 / 128;
					@Pc(892) long local892 = (long) (local789.anInt9442 << 7);
					@Pc(896) long local896 = local892 * local892;
					Static3.method50(local896, arg0, arg2, local578, local876, local789.anInt9437, arg3, local22);
				}
				if (local789.anInt9441 == 10 && local789.anInt9439 >= 0 && Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1.length > local789.anInt9439) {
					@Pc(930) Class4_Sub2_Sub1_Sub2_Sub1 local930 = Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1[local789.anInt9439];
					if (local930 != null) {
						local578 = local930.anInt10229 / 128 - local61 / 128;
						local839 = local930.anInt10228 / 128 - local69 / 128;
						Static3.method50(360000L, arg0, arg2, local839, local578, local789.anInt9437, arg3, local22);
					}
				}
			}
		}
		if (Static60.anInt1040 == 4) {
			return;
		}
		if (Static392.anInt6487 != 0) {
			local574 = Static392.anInt6487 * 4 + (Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.method2046() + -1) * 2 + 2 - local61 / 128;
			local876 = Static371.anInt5924 * 4 + (Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.method2046() + -1) * 2 + 2 - local69 / 128;
			Static433.method8699(local22, arg0, arg2, arg3, local574, Static142.aClass43Array13[Static397.aBoolean554 ? 1 : 0], local876);
		}
		if (!Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aBoolean104) {
			arg1.method9637(3, 3, arg3.anInt7385 / 2 + arg2 - 1, -1, arg3.anInt7402 / 2 + arg0 - 1);
			return;
		}
	}
}
