import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static490 {

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
	public static int anInt8763;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "Lclient!in;")
	public static final Class169 aClass169_213 = new Class169(62, 0);

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "[I")
	public static final int[] anIntArray442 = new int[5];

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILclient!cea;Ljava/lang/Object;)V")
	public static void method7749(@OriginalArg(1) Class48 arg0, @OriginalArg(2) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 50 && arg0.anEventQueue1.peekEvent() != null; local16++) {
			Static650.method9565(1L);
		}
		try {
			if (arg1 != null) {
				arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
			}
		} catch (@Pc(44) Exception local44) {
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V")
	public static void method7750() {
		Static67.method1234(false);
		Static147.anInt2736 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static617.aByteArrayArray24.length; local14++) {
			if (Static191.anIntArray190[local14] != -1 && Static617.aByteArrayArray24[local14] == null) {
				Static617.aByteArrayArray24[local14] = Static52.aClass124_14.method3641(Static191.anIntArray190[local14], 0);
				if (Static617.aByteArrayArray24[local14] == null) {
					local12 = false;
					Static147.anInt2736++;
				}
			}
			if (Static446.anIntArray403[local14] != -1 && Static71.aByteArrayArray4[local14] == null) {
				Static71.aByteArrayArray4[local14] = Static52.aClass124_14.method3616(Static446.anIntArray403[local14], Static172.anIntArrayArray11[local14], 0);
				if (Static71.aByteArrayArray4[local14] == null) {
					local12 = false;
					Static147.anInt2736++;
				}
			}
			if (Static448.anIntArray407[local14] != -1 && Static37.aByteArrayArray3[local14] == null) {
				Static37.aByteArrayArray3[local14] = Static52.aClass124_14.method3641(Static448.anIntArray407[local14], 0);
				if (Static37.aByteArrayArray3[local14] == null) {
					local12 = false;
					Static147.anInt2736++;
				}
			}
			if (Static533.anIntArray479[local14] != -1 && Static424.aByteArrayArray16[local14] == null) {
				Static424.aByteArrayArray16[local14] = Static52.aClass124_14.method3641(Static533.anIntArray479[local14], 0);
				if (Static424.aByteArrayArray16[local14] == null) {
					Static147.anInt2736++;
					local12 = false;
				}
			}
			if (Static375.anIntArray312 != null && Static101.aByteArrayArray7[local14] == null && Static375.anIntArray312[local14] != -1) {
				Static101.aByteArrayArray7[local14] = Static52.aClass124_14.method3616(Static375.anIntArray312[local14], Static172.anIntArrayArray11[local14], 0);
				if (Static101.aByteArrayArray7[local14] == null) {
					Static147.anInt2736++;
					local12 = false;
				}
			}
		}
		if (Static638.aClass75_3 == null) {
			if (Static465.aClass2_Sub1_Sub9_2 == null || !Static480.aClass124_102.method3637(Static465.aClass2_Sub1_Sub9_2.aString63 + "_staticelements")) {
				Static638.aClass75_3 = new Class75(0);
			} else if (Static480.aClass124_102.method3612(Static465.aClass2_Sub1_Sub9_2.aString63 + "_staticelements")) {
				Static638.aClass75_3 = Static201.method3844(Static100.aBoolean97, Static480.aClass124_102, Static465.aClass2_Sub1_Sub9_2.aString63 + "_staticelements");
			} else {
				Static147.anInt2736++;
				local12 = false;
			}
		}
		if (!local12) {
			Static94.anInt1685 = 1;
			return;
		}
		local12 = true;
		Static524.anInt9259 = 0;
		@Pc(268) int local268;
		@Pc(278) int local278;
		for (@Pc(249) int local249 = 0; local249 < Static617.aByteArrayArray24.length; local249++) {
			@Pc(255) byte[] local255 = Static71.aByteArrayArray4[local249];
			if (local255 != null) {
				local268 = (Static437.anIntArray399[local249] >> 8) * 64 - Static640.anInt11085;
				local278 = (Static437.anIntArray399[local249] & 0xFF) * 64 - anInt8763;
				if (Static389.anInt7373 != 0) {
					local268 = 10;
					local278 = 10;
				}
				local12 &= Static256.method9211(Static222.anInt4533, local278, local268, local255, Static668.anInt11370);
			}
			local255 = Static424.aByteArrayArray16[local249];
			if (local255 != null) {
				local268 = (Static437.anIntArray399[local249] >> 8) * 64 - Static640.anInt11085;
				local278 = (Static437.anIntArray399[local249] & 0xFF) * 64 - anInt8763;
				if (Static389.anInt7373 != 0) {
					local268 = 10;
					local278 = 10;
				}
				local12 &= Static256.method9211(Static222.anInt4533, local278, local268, local255, Static668.anInt11370);
			}
		}
		if (!local12) {
			Static94.anInt1685 = 2;
			return;
		}
		if (Static94.anInt1685 != 0) {
			Static543.method8319(Static205.aClass134_12.method3906(Static204.anInt8130) + "<br>(100%)", Static607.aClass101_15, Static455.aClass324_11, Static230.aClass59_3, true);
		}
		Static25.method456();
		Static58.method1113();
		Static382.method9029();
		@Pc(381) boolean local381 = false;
		if (Static607.aClass101_15.method8102() && Static230.aClass2_Sub54_15.aClass4_Sub24_1.method7684() == 2) {
			for (local268 = 0; local268 < Static617.aByteArrayArray24.length; local268++) {
				if (Static424.aByteArrayArray16[local268] != null || Static37.aByteArrayArray3[local268] != null) {
					local381 = true;
					break;
				}
			}
		}
		if (Static230.aClass2_Sub54_15.aClass4_Sub3_1.method498() == 1) {
			local268 = Static615.anIntArray560[Static565.anInt9782];
		} else {
			local268 = Static297.anIntArray274[Static565.anInt9782];
		}
		if (Static607.aClass101_15.method8123()) {
			local268++;
		}
		Static429.method7034(Static607.aClass101_15, Static589.anInt10284, Static222.anInt4533, Static668.anInt11370, local268, local381, Static607.aClass101_15.method8109() > 0);
		Static105.method1883(Static204.anInt8127);
		if (Static204.anInt8127 == 0) {
			Static125.method2256((Class59) null);
		} else {
			Static125.method2256(Static514.aClass59_13);
		}
		for (local278 = 0; local278 < 4; local278++) {
			Static196.aClass200Array1[local278].method5299();
		}
		Static376.method6371();
		Static13.method7477(false);
		Static169.method3350();
		Static32.aClass251_1 = null;
		Static117.aBoolean145 = false;
		Static25.method456();
		System.gc();
		Static67.method1234(true);
		Static99.method1703();
		Static443.anInt8022 = Static230.aClass2_Sub54_15.aClass4_Sub18_1.method6164();
		Static425.aBoolean581 = Static65.anInt1229 >= 96;
		Static548.aBoolean708 = Static230.aClass2_Sub54_15.aClass4_Sub24_1.method7684() == 2;
		Static169.aBoolean274 = Static230.aClass2_Sub54_15.aClass4_Sub28_1.method8732() == 1;
		Static293.anInt7588 = Static230.aClass2_Sub54_15.aClass4_Sub9_1.method2556() == 1 ? -1 : Static578.anInt6963;
		Static235.aBoolean365 = Static230.aClass2_Sub54_15.aClass4_Sub8_1.method2456() == 1;
		Static563.aBoolean717 = Static230.aClass2_Sub54_15.aClass4_Sub21_1.method6610() == 1;
		Static223.aClass29_Sub1_1 = new Class29_Sub1(4, Static222.anInt4533, Static668.anInt11370, false);
		if (Static389.anInt7373 == 0) {
			Static290.method6762(Static617.aByteArrayArray24, Static223.aClass29_Sub1_1);
		} else {
			Static540.method8299(Static617.aByteArrayArray24, Static223.aClass29_Sub1_1);
		}
		Static376.method6372(Static668.anInt11370 >> 4, Static222.anInt4533 >> 4);
		Static673.method9445();
		if (local381) {
			Static312.method5104(true);
			Static463.aClass29_Sub1_2 = new Class29_Sub1(1, Static222.anInt4533, Static668.anInt11370, true);
			if (Static389.anInt7373 == 0) {
				Static290.method6762(Static37.aByteArrayArray3, Static463.aClass29_Sub1_2);
				Static67.method1234(true);
			} else {
				Static540.method8299(Static37.aByteArrayArray3, Static463.aClass29_Sub1_2);
				Static67.method1234(true);
			}
			Static463.aClass29_Sub1_2.method7858(Static223.aClass29_Sub1_1.anIntArrayArrayArray14[0]);
			Static463.aClass29_Sub1_2.method7855((int[][][]) null, Static607.aClass101_15, (Class200[]) null);
			Static312.method5104(false);
		}
		Static223.aClass29_Sub1_1.method7855(local381 ? Static463.aClass29_Sub1_2.anIntArrayArrayArray14 : null, Static607.aClass101_15, Static196.aClass200Array1);
		if (Static389.anInt7373 == 0) {
			Static67.method1234(true);
			Static575.method8733(Static71.aByteArrayArray4, Static223.aClass29_Sub1_1);
			if (Static101.aByteArrayArray7 != null) {
				Static107.method1937();
			}
		} else {
			Static67.method1234(true);
			Static14.method7646(Static71.aByteArrayArray4, Static223.aClass29_Sub1_1);
		}
		Static58.method1113();
		if (Static65.anInt1229 < 96) {
			Static437.method7115();
		}
		Static67.method1234(true);
		Static223.aClass29_Sub1_1.method7850((Class18) null, Static607.aClass101_15, local381 ? Static93.aClass18Array33[0] : null);
		Static223.aClass29_Sub1_1.method7864(Static607.aClass101_15, false);
		Static67.method1234(true);
		if (local381) {
			Static312.method5104(true);
			Static67.method1234(true);
			if (Static389.anInt7373 == 0) {
				Static575.method8733(Static424.aByteArrayArray16, Static463.aClass29_Sub1_2);
			} else {
				Static14.method7646(Static424.aByteArrayArray16, Static463.aClass29_Sub1_2);
			}
			Static58.method1113();
			Static67.method1234(true);
			Static463.aClass29_Sub1_2.method7850(Static549.aClass18Array30[0], Static607.aClass101_15, (Class18) null);
			Static463.aClass29_Sub1_2.method7864(Static607.aClass101_15, true);
			Static67.method1234(true);
			Static312.method5104(false);
		}
		Static210.method3978();
		@Pc(768) int local768 = Static223.aClass29_Sub1_1.anInt8901;
		if (Static547.anInt9550 < local768) {
			local768 = Static547.anInt9550;
		}
		if (local768 < Static547.anInt9550 - 1) {
			local768 = Static547.anInt9550 - 1;
		}
		if (Static230.aClass2_Sub54_15.aClass4_Sub9_1.method2556() == 0) {
			Static462.method7431(local768);
		} else {
			Static462.method7431(0);
		}
		@Pc(810) int local810;
		@Pc(814) int local814;
		for (@Pc(806) int local806 = 0; local806 < 4; local806++) {
			for (local810 = 0; local810 < Static222.anInt4533; local810++) {
				for (local814 = 0; local814 < Static668.anInt11370; local814++) {
					Static639.method9457(local814, local806, local810);
				}
			}
		}
		Static597.method8974();
		Static25.method456();
		Static475.method7569();
		Static58.method1113();
		Static509.method7939();
		@Pc(865) Class2_Sub52 local865;
		if (Static46.aFrame1 != null && Static395.aClass207_2 != null && Static579.anInt10049 == 11) {
			local865 = Static311.method5098(Static170.aClass341_41, Static125.aClass179_1);
			local865.aClass2_Sub8_Sub2_2.method5194(1057001181);
			Static38.method791(local865);
		}
		if (Static389.anInt7373 == 0) {
			local810 = (Static194.anInt4134 - (Static222.anInt4533 >> 4)) / 8;
			local814 = ((Static222.anInt4533 >> 4) + Static194.anInt4134) / 8;
			@Pc(901) int local901 = (Static587.anInt10249 - (Static668.anInt11370 >> 4)) / 8;
			@Pc(910) int local910 = (Static587.anInt10249 + (Static668.anInt11370 >> 4)) / 8;
			for (@Pc(914) int local914 = local810 - 1; local914 <= local814 + 1; local914++) {
				for (@Pc(920) int local920 = local901 - 1; local920 <= local910 + 1; local920++) {
					if (local810 > local914 || local914 > local814 || local920 < local901 || local910 < local920) {
						Static52.aClass124_14.method3628("m" + local914 + "_" + local920);
						Static52.aClass124_14.method3628("l" + local914 + "_" + local920);
					}
				}
			}
		}
		if (Static579.anInt10049 == 4) {
			Static248.method4408(3);
		} else if (Static579.anInt10049 == 8) {
			Static248.method4408(7);
		} else {
			Static248.method4408(10);
			if (Static395.aClass207_2 != null) {
				local865 = Static311.method5098(Static671.aClass341_116, Static125.aClass179_1);
				Static38.method791(local865);
			}
		}
		Static121.method2243();
		Static25.method456();
		Static149.method2585();
		Static207.aBoolean327 = true;
		if (Static376.aBoolean539) {
			Static455.method7295("Took: " + (Static99.method1701() - Static31.aLong18) + "ms");
			Static376.aBoolean539 = false;
		}
	}
}
