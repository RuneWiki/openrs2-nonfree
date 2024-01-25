import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
	public static void method555() {
		Static213.method3214(false);
		Static128.anInt2572 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(18) int local18 = 0; local18 < Static145.aByteArrayArray5.length; local18++) {
			if (Static506.anIntArray529[local18] != -1 && Static145.aByteArrayArray5[local18] == null) {
				Static145.aByteArrayArray5[local18] = Static141.aClass308_56.method6569(Static506.anIntArray529[local18], 0);
				if (Static145.aByteArrayArray5[local18] == null) {
					local12 = false;
					Static128.anInt2572++;
				}
			}
			if (Static505.anIntArray528[local18] != -1 && Static344.aByteArrayArray17[local18] == null) {
				Static344.aByteArrayArray17[local18] = Static141.aClass308_56.method6549(0, Static526.anIntArrayArray53[local18], Static505.anIntArray528[local18]);
				if (Static344.aByteArrayArray17[local18] == null) {
					local12 = false;
					Static128.anInt2572++;
				}
			}
			if (Static342.anIntArray376[local18] != -1 && Static393.aByteArrayArray21[local18] == null) {
				Static393.aByteArrayArray21[local18] = Static141.aClass308_56.method6569(Static342.anIntArray376[local18], 0);
				if (Static393.aByteArrayArray21[local18] == null) {
					local12 = false;
					Static128.anInt2572++;
				}
			}
			if (Static408.anIntArray434[local18] != -1 && Static578.aByteArrayArray27[local18] == null) {
				Static578.aByteArrayArray27[local18] = Static141.aClass308_56.method6569(Static408.anIntArray434[local18], 0);
				if (Static578.aByteArrayArray27[local18] == null) {
					Static128.anInt2572++;
					local12 = false;
				}
			}
			if (Static526.anIntArray550 != null && Static380.aByteArrayArray18[local18] == null && Static526.anIntArray550[local18] != -1) {
				Static380.aByteArrayArray18[local18] = Static141.aClass308_56.method6549(0, Static526.anIntArrayArray53[local18], Static526.anIntArray550[local18]);
				if (Static380.aByteArrayArray18[local18] == null) {
					Static128.anInt2572++;
					local12 = false;
				}
			}
		}
		if (Static114.aClass267_1 == null) {
			if (Static225.aClass1_Sub8_Sub11_3 == null || !Static193.aClass308_80.method6539(Static225.aClass1_Sub8_Sub11_3.aString84 + "_staticelements")) {
				Static114.aClass267_1 = new Class267(0);
			} else if (Static193.aClass308_80.method6540(Static225.aClass1_Sub8_Sub11_3.aString84 + "_staticelements")) {
				Static114.aClass267_1 = Static361.method5317(Static193.aClass308_80, Static431.aBoolean583, Static225.aClass1_Sub8_Sub11_3.aString84 + "_staticelements");
			} else {
				Static128.anInt2572++;
				local12 = false;
			}
		}
		if (!local12) {
			Static421.anInt7406 = 1;
			return;
		}
		Static104.anInt1782 = 0;
		local12 = true;
		@Pc(267) int local267;
		@Pc(278) int local278;
		for (@Pc(249) int local249 = 0; local249 < Static145.aByteArrayArray5.length; local249++) {
			@Pc(255) byte[] local255 = Static344.aByteArrayArray17[local249];
			if (local255 != null) {
				local267 = (Static91.anIntArray519[local249] >> 8) * 64 - Static539.anInt9045;
				local278 = (Static91.anIntArray519[local249] & 0xFF) * 64 - Static311.anInt5708;
				if (Static339.anInt6245 != 0) {
					local278 = 10;
					local267 = 10;
				}
				local12 &= Static279.method4038(local278, Static458.anInt9736, Static378.anInt6747, local255, local267);
			}
			local255 = Static578.aByteArrayArray27[local249];
			if (local255 != null) {
				local267 = (Static91.anIntArray519[local249] >> 8) * 64 - Static539.anInt9045;
				local278 = (Static91.anIntArray519[local249] & 0xFF) * 64 - Static311.anInt5708;
				if (Static339.anInt6245 != 0) {
					local278 = 10;
					local267 = 10;
				}
				local12 &= Static279.method4038(local278, Static458.anInt9736, Static378.anInt6747, local255, local267);
			}
		}
		if (!local12) {
			Static421.anInt7406 = 2;
			return;
		}
		if (Static421.anInt7406 != 0) {
			Static307.method6069(Static375.aClass253_16.method5453(Static161.anInt3095) + "<br>(100%)", Static339.aClass96_9, true, Static31.aClass78_18, Static552.aClass352_20);
		}
		Static275.method4012();
		Static412.method5871();
		@Pc(375) boolean local375 = false;
		if (Static31.aClass78_18.method6851() && Static86.aClass1_Sub30_Sub1_1.aBoolean478) {
			for (local267 = 0; local267 < Static145.aByteArrayArray5.length; local267++) {
				if (Static578.aByteArrayArray27[local267] != null || Static393.aByteArrayArray21[local267] != null) {
					local375 = true;
					break;
				}
			}
		}
		if (Static86.aClass1_Sub30_Sub1_1.aBoolean476) {
			local267 = Static31.anIntArray29[Static152.anInt2864];
		} else {
			local267 = Static138.anIntArray116[Static152.anInt2864];
		}
		if (Static31.aClass78_18.method6831()) {
			local267++;
		}
		Static40.method715(Static31.aClass78_18, Static23.anInt574, Static458.anInt9736, Static378.anInt6747, local267, local375, Static31.aClass78_18.method6777() > 0);
		Static273.method1046(Static402.anInt7196);
		if (Static402.anInt7196 == 0) {
			Static246.method3618(null);
		} else {
			Static246.method3618(Static442.aClass96_12);
		}
		for (local278 = 0; local278 < 4; local278++) {
			Static590.aClass240Array1[local278].method5260();
		}
		Static164.method2700();
		Static267.method3889(false);
		Static142.method2416();
		Static242.aClass289_1 = null;
		Static100.aBoolean116 = false;
		Static275.method4012();
		System.gc();
		Static213.method3214(true);
		Static410.method5853();
		Static542.anInt9094 = Static86.aClass1_Sub30_Sub1_1.method5023(Static286.anInt5239);
		Static388.aBoolean532 = Static221.anInt4095 >= 96;
		Static232.aBoolean310 = Static86.aClass1_Sub30_Sub1_1.aBoolean478;
		Static166.aBoolean588 = Static86.aClass1_Sub30_Sub1_1.method5019(Static286.anInt5239);
		Static438.aBoolean587 = !Static86.aClass1_Sub30_Sub1_1.aBoolean484;
		Static438.anInt7785 = Static86.aClass1_Sub30_Sub1_1.method5029(Static286.anInt5239) ? -1 : Static398.anInt7155;
		Static522.aBoolean669 = Static224.method3332(Static286.anInt5239) || Static86.aClass1_Sub30_Sub1_1.aBoolean480;
		Static110.aBoolean122 = Static86.aClass1_Sub30_Sub1_1.aBoolean475;
		Static211.aClass234_Sub1_1 = new Class234_Sub1(4, Static458.anInt9736, Static378.anInt6747, false);
		if (Static339.anInt6245 == 0) {
			Static486.method6701(Static145.aByteArrayArray5, Static211.aClass234_Sub1_1);
		} else {
			Static567.method5567(Static145.aByteArrayArray5, Static211.aClass234_Sub1_1);
		}
		Static459.method6432(Static378.anInt6747 >> 4, Static458.anInt9736 >> 4);
		Static205.method3164();
		if (local375) {
			Static286.method4305(true);
			Static306.aClass234_Sub1_5 = new Class234_Sub1(1, Static458.anInt9736, Static378.anInt6747, true);
			if (Static339.anInt6245 == 0) {
				Static486.method6701(Static393.aByteArrayArray21, Static306.aClass234_Sub1_5);
				Static213.method3214(true);
			} else {
				Static567.method5567(Static393.aByteArrayArray21, Static306.aClass234_Sub1_5);
				Static213.method3214(true);
			}
			Static306.aClass234_Sub1_5.method7733(Static211.aClass234_Sub1_1.anIntArrayArrayArray19[0]);
			Static306.aClass234_Sub1_5.method7741(null, null, Static31.aClass78_18);
			Static286.method4305(false);
		}
		Static211.aClass234_Sub1_1.method7741(Static590.aClass240Array1, local375 ? Static306.aClass234_Sub1_5.anIntArrayArrayArray19 : null, Static31.aClass78_18);
		if (Static339.anInt6245 == 0) {
			Static213.method3214(true);
			Static527.method7266(Static344.aByteArrayArray17, Static211.aClass234_Sub1_1);
			if (Static380.aByteArrayArray18 != null) {
				Static567.method5559();
			}
		} else {
			Static213.method3214(true);
			Static70.method1166(Static211.aClass234_Sub1_1, Static344.aByteArrayArray17);
		}
		Static412.method5871();
		if (Static221.anInt4095 < 96) {
			Static264.method3875();
		}
		Static213.method3214(true);
		Static211.aClass234_Sub1_1.method7734(null, local375 ? Static150.aClass129Array4[0] : null, Static31.aClass78_18);
		Static211.aClass234_Sub1_1.method7751(Static31.aClass78_18, false);
		Static213.method3214(true);
		if (local375) {
			Static286.method4305(true);
			Static213.method3214(true);
			if (Static339.anInt6245 == 0) {
				Static527.method7266(Static578.aByteArrayArray27, Static306.aClass234_Sub1_5);
			} else {
				Static70.method1166(Static306.aClass234_Sub1_5, Static578.aByteArrayArray27);
			}
			Static412.method5871();
			Static213.method3214(true);
			Static306.aClass234_Sub1_5.method7734(Static36.aClass129Array7[0], null, Static31.aClass78_18);
			Static306.aClass234_Sub1_5.method7751(Static31.aClass78_18, true);
			Static213.method3214(true);
			Static286.method4305(false);
		}
		Static571.method7702();
		@Pc(725) int local725 = Static211.aClass234_Sub1_1.anInt9519;
		if (Static240.anInt4414 < local725) {
			local725 = Static240.anInt4414;
		}
		if (Static240.anInt4414 - 1 > local725) {
			local725 = Static240.anInt4414 - 1;
		}
		if (Static86.aClass1_Sub30_Sub1_1.method5029(Static286.anInt5239)) {
			Static362.method5324(0);
		} else {
			Static362.method5324(local725);
		}
		@Pc(756) int local756;
		@Pc(760) int local760;
		for (@Pc(752) int local752 = 0; local752 < 4; local752++) {
			for (local756 = 0; local756 < Static458.anInt9736; local756++) {
				for (local760 = 0; local760 < Static378.anInt6747; local760++) {
					Static198.method3089(local760, local752, local756);
				}
			}
		}
		Static405.method5819();
		Static275.method4012();
		Static190.method5362();
		Static412.method5871();
		Static585.method7839();
		@Pc(809) Class1_Sub9 local809;
		if (Static73.aFrame1 != null && Static485.aClass43_1 != null && Static55.anInt1068 == 11) {
			local809 = Static123.method2194(Static469.aClass235_2, Static242.aClass208_54);
			local809.aClass1_Sub3_Sub1_1.method7936(1057001181);
			Static42.method746(local809);
		}
		if (Static339.anInt6245 == 0) {
			local756 = (Static276.anInt5046 - (Static458.anInt9736 >> 4)) / 8;
			local760 = ((Static458.anInt9736 >> 4) + Static276.anInt5046) / 8;
			@Pc(848) int local848 = (Static518.anInt9329 - (Static378.anInt6747 >> 4)) / 8;
			@Pc(856) int local856 = ((Static378.anInt6747 >> 4) + Static518.anInt9329) / 8;
			for (@Pc(860) int local860 = local756 - 1; local860 <= local760 + 1; local860++) {
				for (@Pc(866) int local866 = local848 - 1; local866 <= local856 + 1; local866++) {
					if (local756 > local860 || local860 > local760 || local866 < local848 || local866 > local856) {
						Static141.aClass308_56.method6559("m" + local860 + "_" + local866);
						Static141.aClass308_56.method6559("l" + local860 + "_" + local866);
					}
				}
			}
		}
		if (Static55.anInt1068 == 4) {
			Static318.method4726(3);
		} else if (Static55.anInt1068 == 8) {
			Static318.method4726(7);
		} else {
			Static318.method4726(10);
			if (Static485.aClass43_1 != null) {
				local809 = Static123.method2194(Static469.aClass235_2, Static430.aClass208_94);
				Static42.method746(local809);
			}
		}
		Static99.method1469();
		Static275.method4012();
		Static583.method7812();
		if (Static330.aBoolean466) {
			Static415.method5896("Took: " + (Static480.method6650() - Static196.aLong98) + "ms");
			Static330.aBoolean466 = false;
		}
	}
}
