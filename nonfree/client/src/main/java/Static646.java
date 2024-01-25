import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static646 {

	@OriginalMember(owner = "client!uga", name = "e", descriptor = "Lclient!fc;")
	public static Class106 aClass106_1;

	@OriginalMember(owner = "client!uga", name = "c", descriptor = "Lclient!si;")
	public static final Class338 aClass338_59 = new Class338(64);

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(I)V")
	public static void method8719() {
		Static550.method3528(false);
		Static553.anInt9240 = 0;
		@Pc(14) boolean local14 = true;
		for (@Pc(23) int local23 = 0; local23 < Static423.aByteArrayArray9.length; local23++) {
			if (Static718.anIntArray638[local23] != -1 && Static423.aByteArrayArray9[local23] == null) {
				Static423.aByteArrayArray9[local23] = Static397.aClass221_113.method5089(0, Static718.anIntArray638[local23]);
				if (Static423.aByteArrayArray9[local23] == null) {
					Static553.anInt9240++;
					local14 = false;
				}
			}
			if (Static504.anIntArray469[local23] != -1 && Static257.aByteArrayArray8[local23] == null) {
				Static257.aByteArrayArray8[local23] = Static397.aClass221_113.method5063(Static101.anIntArrayArray10[local23], 0, Static504.anIntArray469[local23]);
				if (Static257.aByteArrayArray8[local23] == null) {
					Static553.anInt9240++;
					local14 = false;
				}
			}
			if (Static23.anIntArray13[local23] != -1 && Static484.aByteArrayArray13[local23] == null) {
				Static484.aByteArrayArray13[local23] = Static397.aClass221_113.method5089(0, Static23.anIntArray13[local23]);
				if (Static484.aByteArrayArray13[local23] == null) {
					local14 = false;
					Static553.anInt9240++;
				}
			}
			if (Static83.anIntArray86[local23] != -1 && Static74.aByteArrayArray2[local23] == null) {
				Static74.aByteArrayArray2[local23] = Static397.aClass221_113.method5089(0, Static83.anIntArray86[local23]);
				if (Static74.aByteArrayArray2[local23] == null) {
					Static553.anInt9240++;
					local14 = false;
				}
			}
			if (Static423.anIntArray399 != null && Static551.aByteArrayArray18[local23] == null && Static423.anIntArray399[local23] != -1) {
				Static551.aByteArrayArray18[local23] = Static397.aClass221_113.method5063(Static101.anIntArrayArray10[local23], 0, Static423.anIntArray399[local23]);
				if (Static551.aByteArrayArray18[local23] == null) {
					local14 = false;
					Static553.anInt9240++;
				}
			}
		}
		if (Static254.aClass108_1 == null) {
			if (Static614.aClass3_Sub4_Sub19_3 == null || !Static556.aClass221_140.method5079(Static614.aClass3_Sub4_Sub19_3.aString118 + "_staticelements")) {
				Static254.aClass108_1 = new Class108(0);
			} else if (Static556.aClass221_140.method5094(Static614.aClass3_Sub4_Sub19_3.aString118 + "_staticelements")) {
				Static254.aClass108_1 = Static705.method9211(Static556.aClass221_140, Static312.aBoolean458, Static614.aClass3_Sub4_Sub19_3.aString118 + "_staticelements");
			} else {
				local14 = false;
				Static553.anInt9240++;
			}
		}
		if (!local14) {
			Static400.anInt7156 = 1;
			return;
		}
		local14 = true;
		Static339.anInt5858 = 0;
		@Pc(324) int local324;
		@Pc(335) int local335;
		for (@Pc(305) int local305 = 0; local305 < Static423.aByteArrayArray9.length; local305++) {
			@Pc(311) byte[] local311 = Static257.aByteArrayArray8[local305];
			if (local311 != null) {
				local324 = (Static46.anIntArray54[local305] >> 8) * 64 - Static714.anInt11156;
				local335 = (Static46.anIntArray54[local305] & 0xFF) * 64 - Static339.anInt5859;
				if (Static231.anInt4426 != 0) {
					local335 = 10;
					local324 = 10;
				}
				local14 &= Static148.method2426(local311, Static206.anInt11291, local324, Static362.anInt8653, local335);
			}
			local311 = Static74.aByteArrayArray2[local305];
			if (local311 != null) {
				local324 = (Static46.anIntArray54[local305] >> 8) * 64 - Static714.anInt11156;
				local335 = (Static46.anIntArray54[local305] & 0xFF) * 64 - Static339.anInt5859;
				if (Static231.anInt4426 != 0) {
					local324 = 10;
					local335 = 10;
				}
				local14 &= Static148.method2426(local311, Static206.anInt11291, local324, Static362.anInt8653, local335);
			}
		}
		if (!local14) {
			Static400.anInt7156 = 2;
			return;
		}
		if (Static400.anInt7156 != 0) {
			Static52.method679(Static488.aClass67_12, Static687.aClass330_13, Static476.aClass279_12.method6992(Static141.anInt2658) + "<br>(100%)", true, Static418.aClass44_32);
		}
		Static140.method2345();
		Static299.method5787();
		Static610.method8345((byte) -80);
		@Pc(443) boolean local443 = false;
		if (Static488.aClass67_12.method7651() && Static713.aClass3_Sub55_31.aClass15_Sub30_1.method9427() == 2) {
			for (local324 = 0; local324 < Static423.aByteArrayArray9.length; local324++) {
				if (Static74.aByteArrayArray2[local324] != null || Static484.aByteArrayArray13[local324] != null) {
					local443 = true;
					break;
				}
			}
		}
		if (Static713.aClass3_Sub55_31.aClass15_Sub11_1.method4066() == 1) {
			local324 = Static567.anIntArray518[Static129.anInt2430];
		} else {
			local324 = Static726.anIntArray641[Static129.anInt2430];
		}
		if (Static488.aClass67_12.method7712()) {
			local324++;
		}
		Static572.method7942(Static488.aClass67_12, Static460.anInt8099, Static362.anInt8653, Static206.anInt11291, local324, local443, Static488.aClass67_12.method7634() > 0);
		Static326.method4879(Static132.anInt2471);
		if (Static132.anInt2471 == 0) {
			Static332.method4974((Class44) null);
		} else {
			Static332.method4974(Static705.aClass44_53);
		}
		for (local335 = 0; local335 < 4; local335++) {
			Static678.aClass360Array5[local335].method8481();
		}
		Static224.method3525();
		Static587.method8079(false);
		Static482.method7041();
		Static259.aBoolean418 = false;
		Static140.method2345();
		System.gc();
		Static550.method3528(true);
		Static248.method3765();
		Static12.anInt155 = Static713.aClass3_Sub55_31.aClass15_Sub18_1.method6987();
		Static116.aBoolean186 = Static719.anInt11246 >= 96;
		Static342.aBoolean751 = Static713.aClass3_Sub55_31.aClass15_Sub30_1.method9427() == 2;
		Static197.aBoolean282 = Static713.aClass3_Sub55_31.aClass15_Sub28_1.method9169() == 1;
		Static477.anInt8337 = Static713.aClass3_Sub55_31.aClass15_Sub25_1.method8268() == 1 ? -1 : Static715.anInt7793;
		Static210.aBoolean296 = Static713.aClass3_Sub55_31.aClass15_Sub16_1.method6384() == 1;
		Static657.aBoolean758 = Static713.aClass3_Sub55_31.aClass15_Sub26_1.method8908() == 1;
		Static462.aClass131_Sub1_2 = new Class131_Sub1(4, Static362.anInt8653, Static206.anInt11291, false);
		if (Static231.anInt4426 == 0) {
			Static595.method8199(Static462.aClass131_Sub1_2, Static423.aByteArrayArray9);
		} else {
			Static680.method8981(Static462.aClass131_Sub1_2, Static423.aByteArrayArray9);
		}
		Static37.method558(Static206.anInt11291 >> 4, Static362.anInt8653 >> 4);
		Static359.method5141();
		if (local443) {
			Static665.method8868(true);
			Static251.aClass131_Sub1_1 = new Class131_Sub1(1, Static362.anInt8653, Static206.anInt11291, true);
			if (Static231.anInt4426 == 0) {
				Static595.method8199(Static251.aClass131_Sub1_1, Static484.aByteArrayArray13);
				Static550.method3528(true);
			} else {
				Static680.method8981(Static251.aClass131_Sub1_1, Static484.aByteArrayArray13);
				Static550.method3528(true);
			}
			Static251.aClass131_Sub1_1.method3078(Static462.aClass131_Sub1_2.anIntArrayArrayArray4[0]);
			Static251.aClass131_Sub1_1.method3068((Class360[]) null, Static488.aClass67_12, (int[][][]) null);
			Static665.method8868(false);
		}
		Static462.aClass131_Sub1_2.method3068(Static678.aClass360Array5, Static488.aClass67_12, local443 ? Static251.aClass131_Sub1_1.anIntArrayArrayArray4 : null);
		if (Static231.anInt4426 == 0) {
			Static550.method3528(true);
			Static8.method111(Static462.aClass131_Sub1_2, Static257.aByteArrayArray8);
			if (Static551.aByteArrayArray18 != null) {
				Static638.method8656();
			}
		} else {
			Static550.method3528(true);
			Static626.method8477(Static462.aClass131_Sub1_2, Static257.aByteArrayArray8);
		}
		Static299.method5787();
		if (Static719.anInt11246 < 96) {
			Static700.method9157();
		}
		Static550.method3528(true);
		Static462.aClass131_Sub1_2.method3076(Static488.aClass67_12, local443 ? Static711.aClass313Array3[0] : null, (Class313) null);
		Static462.aClass131_Sub1_2.method3082(Static488.aClass67_12, false);
		Static550.method3528(true);
		if (local443) {
			Static665.method8868(true);
			Static550.method3528(true);
			if (Static231.anInt4426 == 0) {
				Static8.method111(Static251.aClass131_Sub1_1, Static74.aByteArrayArray2);
			} else {
				Static626.method8477(Static251.aClass131_Sub1_1, Static74.aByteArrayArray2);
			}
			Static299.method5787();
			Static550.method3528(true);
			Static251.aClass131_Sub1_1.method3076(Static488.aClass67_12, (Class313) null, Static167.aClass313Array1[0]);
			Static251.aClass131_Sub1_1.method3082(Static488.aClass67_12, true);
			Static550.method3528(true);
			Static665.method8868(false);
		}
		Static423.method6237();
		@Pc(887) int local887 = Static462.aClass131_Sub1_2.anInt3602;
		if (local887 > Static712.anInt11117) {
			local887 = Static712.anInt11117;
		}
		if (local887 < Static712.anInt11117 - 1) {
			local887 = Static712.anInt11117 - 1;
		}
		if (Static713.aClass3_Sub55_31.aClass15_Sub25_1.method8268() == 0) {
			Static408.method6081(local887);
		} else {
			Static408.method6081(0);
		}
		@Pc(927) int local927;
		@Pc(931) int local931;
		for (@Pc(921) int local921 = 0; local921 < 4; local921++) {
			for (local927 = 0; local927 < Static362.anInt8653; local927++) {
				for (local931 = 0; local931 < Static206.anInt11291; local931++) {
					Static535.method7523(local931, local921, local927);
				}
			}
		}
		Static7.method109();
		Static140.method2345();
		Static184.method2803();
		Static299.method5787();
		Static501.method7209();
		@Pc(1002) Class3_Sub48 local1002;
		if (Static131.aFrame1 != null && Static532.aClass400_3.aClass255_2 != null && Static178.anInt3225 == 12) {
			local1002 = Static89.method1200(Static168.aClass286_123, Static532.aClass400_3.aClass399_2);
			local1002.aClass3_Sub28_Sub2_1.method5311(1057001181);
			Static532.aClass400_3.method9223(local1002);
		}
		if (Static231.anInt4426 == 0) {
			local927 = (Static82.anInt1266 - (Static362.anInt8653 >> 4)) / 8;
			local931 = ((Static362.anInt8653 >> 4) + Static82.anInt1266) / 8;
			@Pc(1043) int local1043 = (Static650.anInt10443 - (Static206.anInt11291 >> 4)) / 8;
			@Pc(1052) int local1052 = (Static650.anInt10443 + (Static206.anInt11291 >> 4)) / 8;
			for (@Pc(1056) int local1056 = local927 - 1; local1056 <= local931 + 1; local1056++) {
				for (@Pc(1062) int local1062 = local1043 - 1; local1062 <= local1052 + 1; local1062++) {
					if (local927 > local1056 || local1056 > local931 || local1062 < local1043 || local1052 < local1062) {
						Static397.aClass221_113.method5073("m" + local1056 + "_" + local1062);
						Static397.aClass221_113.method5073("l" + local1056 + "_" + local1062);
					}
				}
			}
		}
		if (Static178.anInt3225 == 4) {
			Static638.method8657(3);
		} else if (Static178.anInt3225 == 8) {
			Static638.method8657(7);
		} else if (Static178.anInt3225 == 10) {
			Static638.method8657(9);
		} else {
			Static638.method8657(11);
			if (Static532.aClass400_3.aClass255_2 != null) {
				local1002 = Static89.method1200(Static48.aClass286_14, Static532.aClass400_3.aClass399_2);
				Static532.aClass400_3.method9223(local1002);
			}
		}
		Static517.method7378();
		Static140.method2345();
		Static588.method8089();
		Static70.aBoolean89 = true;
		if (Static198.aBoolean283) {
			Static269.method4123("Took: " + (Static626.method8479() - Static570.aLong320) + "ms");
			Static198.aBoolean283 = false;
		}
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(Z)V")
	public static void method8721() {
		if (Static488.aClass67_12.method7661()) {
			Static488.aClass67_12.method7636(Static67.aCanvas1);
			Static404.method6050();
			if (Static178.aBoolean264) {
				Static701.method9171(Static67.aCanvas1);
			} else {
				@Pc(23) Dimension local23 = Static67.aCanvas1.getSize();
				Static488.aClass67_12.method7669(Static67.aCanvas1, local23.width, local23.height);
			}
			Static488.aClass67_12.method7668(Static67.aCanvas1);
		} else {
			Static718.method9389(Static713.aClass3_Sub55_31.aClass15_Sub4_1.method1071(), false);
		}
		Static693.method9085();
		Static70.aBoolean89 = true;
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(IIIIZIIB)V")
	public static void method8722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static713.aClass3_Sub55_31.aClass15_Sub8_4.method2888() != 0 && arg4 != 0 && Static581.anInt9508 < 50 && arg0 != -1) {
			Static326.aClass239Array1[Static581.anInt9508++] = new Class239((byte) 2, arg0, arg4, arg2, arg1, arg5, arg3, (Class19_Sub1) null);
		}
	}
}
