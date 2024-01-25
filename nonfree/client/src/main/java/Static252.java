import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!jq", name = "f", descriptor = "[[S")
	public static short[][] aShortArrayArray18;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "[Lclient!eaa;")
	public static final Class83[] aClass83Array1 = new Class83[2048];

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "Z")
	public static boolean aBoolean341 = true;

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "I")
	public static int anInt4624 = 0;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)V")
	public static void method3928() {
		Static393.method5724(false);
		Static6.anInt93 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static287.aByteArrayArray13.length; local14++) {
			if (Static345.anIntArray457[local14] != -1 && Static287.aByteArrayArray13[local14] == null) {
				Static287.aByteArrayArray13[local14] = Static88.aClass248_15.method5797(Static345.anIntArray457[local14], 0);
				if (Static287.aByteArrayArray13[local14] == null) {
					Static6.anInt93++;
					local12 = false;
				}
			}
			if (Static185.anIntArray306[local14] != -1 && Static492.aByteArrayArray27[local14] == null) {
				Static492.aByteArrayArray27[local14] = Static88.aClass248_15.method5799(Static185.anIntArray306[local14], Static16.anIntArrayArray3[local14], 0);
				if (Static492.aByteArrayArray27[local14] == null) {
					local12 = false;
					Static6.anInt93++;
				}
			}
			if (Static401.anIntArray504[local14] != -1 && Static501.aByteArrayArray28[local14] == null) {
				Static501.aByteArrayArray28[local14] = Static88.aClass248_15.method5797(Static401.anIntArray504[local14], 0);
				if (Static501.aByteArrayArray28[local14] == null) {
					local12 = false;
					Static6.anInt93++;
				}
			}
			if (Static187.anIntArray312[local14] != -1 && Static98.aByteArrayArray6[local14] == null) {
				Static98.aByteArrayArray6[local14] = Static88.aClass248_15.method5797(Static187.anIntArray312[local14], 0);
				if (Static98.aByteArrayArray6[local14] == null) {
					local12 = false;
					Static6.anInt93++;
				}
			}
			if (Static77.anIntArray115 != null && Static369.aByteArrayArray19[local14] == null && Static77.anIntArray115[local14] != -1) {
				Static369.aByteArrayArray19[local14] = Static88.aClass248_15.method5799(Static77.anIntArray115[local14], Static16.anIntArrayArray3[local14], 0);
				if (Static369.aByteArrayArray19[local14] == null) {
					Static6.anInt93++;
					local12 = false;
				}
			}
		}
		if (Static577.aClass170_3 == null) {
			if (Static364.aClass6_Sub5_Sub2_3 == null || !Static302.aClass248_45.method5791(Static364.aClass6_Sub5_Sub2_3.aString12 + "_staticelements")) {
				Static577.aClass170_3 = new Class170(0);
			} else if (Static302.aClass248_45.method5803(Static364.aClass6_Sub5_Sub2_3.aString12 + "_staticelements")) {
				Static577.aClass170_3 = Static458.method6414(Static364.aClass6_Sub5_Sub2_3.aString12 + "_staticelements", Static485.aBoolean557, Static302.aClass248_45);
			} else {
				local12 = false;
				Static6.anInt93++;
			}
		}
		if (!local12) {
			Static46.anInt864 = 1;
			return;
		}
		Static39.anInt748 = 0;
		local12 = true;
		@Pc(268) int local268;
		@Pc(279) int local279;
		for (@Pc(249) int local249 = 0; local249 < Static287.aByteArrayArray13.length; local249++) {
			@Pc(255) byte[] local255 = Static492.aByteArrayArray27[local249];
			if (local255 != null) {
				local268 = (Static468.anIntArray577[local249] >> 8) * 64 - Static150.anInt2792;
				local279 = (Static468.anIntArray577[local249] & 0xFF) * 64 - Static154.anInt2878;
				if (Static126.anInt2172 != 0) {
					local268 = 10;
					local279 = 10;
				}
				local12 &= Static384.method5631(Static80.anInt1367, local268, local279, Static18.anInt5706, local255);
			}
			local255 = Static98.aByteArrayArray6[local249];
			if (local255 != null) {
				local268 = (Static468.anIntArray577[local249] >> 8) * 64 - Static150.anInt2792;
				local279 = (Static468.anIntArray577[local249] & 0xFF) * 64 - Static154.anInt2878;
				if (Static126.anInt2172 != 0) {
					local279 = 10;
					local268 = 10;
				}
				local12 &= Static384.method5631(Static80.anInt1367, local268, local279, Static18.anInt5706, local255);
			}
		}
		if (!local12) {
			Static46.anInt864 = 2;
			return;
		}
		if (Static46.anInt864 != 0) {
			Static237.method3695(Static146.aClass103_13.method2355(Static188.anInt28) + "<br>(100%)", Static75.aClass82_1, true);
		}
		Static262.method3999();
		Static113.method1759();
		@Pc(383) boolean local383 = false;
		if (Static554.aClass90_12.method7502() && Static58.aClass6_Sub17_Sub1_1.aBoolean604) {
			for (local268 = 0; local268 < Static287.aByteArrayArray13.length; local268++) {
				if (Static98.aByteArrayArray6[local268] != null || Static501.aByteArrayArray28[local268] != null) {
					local383 = true;
					break;
				}
			}
		}
		if (Static58.aClass6_Sub17_Sub1_1.aBoolean610) {
			local268 = Static47.anIntArray38[Static417.anInt7437];
		} else {
			local268 = Static208.anIntArray343[Static417.anInt7437];
		}
		if (Static554.aClass90_12.method7499()) {
			local268++;
		}
		Static198.method3313(Static18.anInt5706, Static80.anInt1367, local268, local383, Static554.aClass90_12.method7458() > 0);
		for (local279 = 0; local279 < 4; local279++) {
			Static30.aClass138Array1[local279].method3441();
		}
		Static377.method5516();
		Static521.method7109(false);
		Static391.method5697();
		Static145.aClass141_1 = null;
		Static250.aBoolean336 = false;
		Static262.method3999();
		System.gc();
		Static393.method5724(true);
		Static244.method3822();
		Static33.anInt615 = Static58.aClass6_Sub17_Sub1_1.method7348(Static79.anInt2700);
		Static111.aBoolean128 = Static355.anInt6598 >= 96;
		Static178.aBoolean280 = Static58.aClass6_Sub17_Sub1_1.aBoolean604;
		Static552.aBoolean657 = Static58.aClass6_Sub17_Sub1_1.method7351(Static79.anInt2700);
		Static43.aBoolean54 = !Static58.aClass6_Sub17_Sub1_1.aBoolean606;
		Static308.anInt5671 = Static58.aClass6_Sub17_Sub1_1.method7353(Static79.anInt2700) ? -1 : Static558.anInt9704;
		Static323.aBoolean443 = Static462.method6470(Static79.anInt2700) || Static58.aClass6_Sub17_Sub1_1.aBoolean599;
		Static113.aBoolean129 = Static58.aClass6_Sub17_Sub1_1.aBoolean605;
		Static375.aClass238_Sub1_5 = new Class238_Sub1(4, Static18.anInt5706, Static80.anInt1367, false);
		if (Static126.anInt2172 == 0) {
			Static202.method3336(Static287.aByteArrayArray13, Static375.aClass238_Sub1_5);
		} else {
			Static419.method6383(Static287.aByteArrayArray13, Static375.aClass238_Sub1_5);
		}
		Static123.method1914(Static18.anInt5706 >> 4, Static80.anInt1367 >> 4);
		Static378.method5548();
		if (local383) {
			Static54.method805(true);
			Static305.aClass238_Sub1_2 = new Class238_Sub1(1, Static18.anInt5706, Static80.anInt1367, true);
			if (Static126.anInt2172 == 0) {
				Static202.method3336(Static501.aByteArrayArray28, Static305.aClass238_Sub1_2);
				Static393.method5724(true);
			} else {
				Static419.method6383(Static501.aByteArrayArray28, Static305.aClass238_Sub1_2);
				Static393.method5724(true);
			}
			Static305.aClass238_Sub1_2.method5547(Static375.aClass238_Sub1_5.anIntArrayArrayArray12[0]);
			Static305.aClass238_Sub1_2.method5536(null, null, Static554.aClass90_12);
			Static54.method805(false);
		}
		Static375.aClass238_Sub1_5.method5536(Static30.aClass138Array1, local383 ? Static305.aClass238_Sub1_2.anIntArrayArrayArray12 : null, Static554.aClass90_12);
		if (Static126.anInt2172 == 0) {
			Static393.method5724(true);
			Static337.method5192(Static492.aByteArrayArray27, Static375.aClass238_Sub1_5);
			if (Static369.aByteArrayArray19 != null) {
				Static125.method1933();
			}
		} else {
			Static393.method5724(true);
			Static124.method1930(Static492.aByteArrayArray27, Static375.aClass238_Sub1_5);
		}
		Static113.method1759();
		if (Static355.anInt6598 < 96) {
			Static456.method6373();
		}
		Static393.method5724(true);
		Static375.aClass238_Sub1_5.method5544(null, Static554.aClass90_12, local383 ? Static480.aClass46Array2[0] : null);
		Static375.aClass238_Sub1_5.method5558(Static554.aClass90_12);
		Static393.method5724(true);
		if (local383) {
			Static54.method805(true);
			Static393.method5724(true);
			if (Static126.anInt2172 == 0) {
				Static337.method5192(Static98.aByteArrayArray6, Static305.aClass238_Sub1_2);
			} else {
				Static124.method1930(Static98.aByteArrayArray6, Static305.aClass238_Sub1_2);
			}
			Static113.method1759();
			Static393.method5724(true);
			Static305.aClass238_Sub1_2.method5544(Static496.aClass46Array4[0], Static554.aClass90_12, null);
			Static305.aClass238_Sub1_2.method5558(Static554.aClass90_12);
			Static393.method5724(true);
			Static54.method805(false);
		}
		Static214.method5691();
		@Pc(725) int local725 = Static375.aClass238_Sub1_5.anInt6931;
		if (local725 > Static391.anInt7128) {
			local725 = Static391.anInt7128;
		}
		if (local725 < Static391.anInt7128 - 1) {
			local725 = Static391.anInt7128 - 1;
		}
		if (Static58.aClass6_Sub17_Sub1_1.method7353(Static79.anInt2700)) {
			Static580.method7914(0);
		} else {
			Static580.method7914(local725);
		}
		@Pc(760) int local760;
		@Pc(764) int local764;
		for (@Pc(756) int local756 = 0; local756 < 4; local756++) {
			for (local760 = 0; local760 < Static18.anInt5706; local760++) {
				for (local764 = 0; local764 < Static80.anInt1367; local764++) {
					Static69.method969(local764, local760, local756);
				}
			}
		}
		Static470.method6544();
		Static262.method3999();
		Static58.method835();
		Static113.method1759();
		Static18.method4655();
		if (Static435.aFrame2 != null && Static354.aClass1_1 != null && Static375.anInt9162 == 11) {
			Static534.method7063(Static337.aClass316_77);
			Static340.aClass6_Sub12_Sub2_1.method6042(1057001181);
		}
		if (Static126.anInt2172 == 0) {
			local760 = (Static300.anInt5494 - (Static18.anInt5706 >> 4)) / 8;
			local764 = (Static300.anInt5494 + (Static18.anInt5706 >> 4)) / 8;
			@Pc(852) int local852 = (Static582.anInt8003 - (Static80.anInt1367 >> 4)) / 8;
			@Pc(860) int local860 = ((Static80.anInt1367 >> 4) + Static582.anInt8003) / 8;
			for (@Pc(864) int local864 = local760 - 1; local864 <= local764 + 1; local864++) {
				for (@Pc(870) int local870 = local852 - 1; local870 <= local860 + 1; local870++) {
					if (local864 < local760 || local764 < local864 || local870 < local852 || local870 > local860) {
						Static88.aClass248_15.method5789("m" + local864 + "_" + local870);
						Static88.aClass248_15.method5789("l" + local864 + "_" + local870);
					}
				}
			}
		}
		if (Static375.anInt9162 == 4) {
			Static436.method6188(3);
		} else if (Static375.anInt9162 == 8) {
			Static436.method6188(7);
		} else {
			Static436.method6188(10);
			if (Static354.aClass1_1 != null) {
				Static534.method7063(Static336.aClass316_76);
			}
		}
		Static256.method3970();
		Static262.method3999();
		Static320.method4969();
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(II)Z")
	public static boolean method3929(@OriginalArg(0) int arg0) {
		if (arg0 == 45 || arg0 == 13 || arg0 == 20 || arg0 == 47 || arg0 == 1008) {
			return true;
		} else {
			return arg0 == 18 || arg0 == 1007;
		}
	}
}
