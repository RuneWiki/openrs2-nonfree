import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static714 {

	@OriginalMember(owner = "client!wja", name = "E", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_208 = new Class225(49, 11);

	@OriginalMember(owner = "client!wja", name = "c", descriptor = "(II)Z")
	public static boolean method9499(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(IB)Lclient!gja;")
	public static Class139 method9500(@OriginalArg(0) int arg0) {
		@Pc(8) Class139[] local8 = Static274.method3834();
		for (@Pc(17) int local17 = 0; local17 < local8.length; local17++) {
			@Pc(23) Class139 local23 = local8[local17];
			if (arg0 == local23.anInt3378) {
				return local23;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wja", name = "f", descriptor = "(I)V")
	public static void method9502() {
		Static713.method9477(false);
		Static458.anInt7470 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static671.aByteArrayArray26.length; local14++) {
			if (Static398.anIntArray452[local14] != -1 && Static671.aByteArrayArray26[local14] == null) {
				Static671.aByteArrayArray26[local14] = Static311.aClass254_96.method6087(0, Static398.anIntArray452[local14]);
				if (Static671.aByteArrayArray26[local14] == null) {
					Static458.anInt7470++;
					local12 = false;
				}
			}
			if (Static9.anIntArray32[local14] != -1 && Static100.aByteArrayArray1[local14] == null) {
				Static100.aByteArrayArray1[local14] = Static311.aClass254_96.method6099(Static152.anIntArrayArray15[local14], Static9.anIntArray32[local14], 0);
				if (Static100.aByteArrayArray1[local14] == null) {
					Static458.anInt7470++;
					local12 = false;
				}
			}
			if (Static523.anIntArray462[local14] != -1 && Static453.aByteArrayArray13[local14] == null) {
				Static453.aByteArrayArray13[local14] = Static311.aClass254_96.method6087(0, Static523.anIntArray462[local14]);
				if (Static453.aByteArrayArray13[local14] == null) {
					Static458.anInt7470++;
					local12 = false;
				}
			}
			if (Static453.anIntArray534[local14] != -1 && Static336.aByteArrayArray10[local14] == null) {
				Static336.aByteArrayArray10[local14] = Static311.aClass254_96.method6087(0, Static453.anIntArray534[local14]);
				if (Static336.aByteArrayArray10[local14] == null) {
					local12 = false;
					Static458.anInt7470++;
				}
			}
			if (Static608.anIntArray687 != null && Static495.aByteArrayArray17[local14] == null && Static608.anIntArray687[local14] != -1) {
				Static495.aByteArrayArray17[local14] = Static311.aClass254_96.method6099(Static152.anIntArrayArray15[local14], Static608.anIntArray687[local14], 0);
				if (Static495.aByteArrayArray17[local14] == null) {
					Static458.anInt7470++;
					local12 = false;
				}
			}
		}
		if (Static8.aClass372_1 == null) {
			if (Static310.aClass2_Sub6_Sub21_3 == null || !Static394.aClass254_113.method6070(Static310.aClass2_Sub6_Sub21_3.aString110 + "_staticelements")) {
				Static8.aClass372_1 = new Class372(0);
			} else if (Static394.aClass254_113.method6069(Static310.aClass2_Sub6_Sub21_3.aString110 + "_staticelements")) {
				Static8.aClass372_1 = Static30.method434(Static102.aBoolean202, Static310.aClass2_Sub6_Sub21_3.aString110 + "_staticelements", Static394.aClass254_113);
			} else {
				local12 = false;
				Static458.anInt7470++;
			}
		}
		if (!local12) {
			Static367.anInt5880 = 1;
			return;
		}
		local12 = true;
		Static512.anInt8137 = 0;
		@Pc(314) int local314;
		@Pc(325) int local325;
		for (@Pc(295) int local295 = 0; local295 < Static671.aByteArrayArray26.length; local295++) {
			@Pc(301) byte[] local301 = Static100.aByteArrayArray1[local295];
			if (local301 != null) {
				local314 = (Static148.anIntArray187[local295] >> 8) * 64 - Static243.anInt3820;
				local325 = (Static148.anIntArray187[local295] & 0xFF) * 64 - Static224.anInt11062;
				if (Static718.anInt10954 != 0) {
					local325 = 10;
					local314 = 10;
				}
				local12 &= Static213.method2984(local314, local301, local325, Static280.anInt6752, Static426.anInt6942);
			}
			local301 = Static336.aByteArrayArray10[local295];
			if (local301 != null) {
				local314 = (Static148.anIntArray187[local295] >> 8) * 64 - Static243.anInt3820;
				local325 = (Static148.anIntArray187[local295] & 0xFF) * 64 - Static224.anInt11062;
				if (Static718.anInt10954 != 0) {
					local314 = 10;
					local325 = 10;
				}
				local12 &= Static213.method2984(local314, local301, local325, Static280.anInt6752, Static426.anInt6942);
			}
		}
		if (!local12) {
			Static367.anInt5880 = 2;
			return;
		}
		if (Static367.anInt5880 != 0) {
			Static271.method3803(Static289.aClass191_12.method4067(Static414.anInt9485) + "<br>(100%)", true, Static396.aClass145_6, Static61.aClass68_1, Static175.aClass289_18);
		}
		Static165.method2505();
		Static248.method3462();
		Static7.method97();
		@Pc(436) boolean local436 = false;
		if (Static396.aClass145_6.method9710() && Static650.aClass2_Sub30_29.aClass11_Sub26_1.method8618() == 2) {
			for (local314 = 0; local314 < Static671.aByteArrayArray26.length; local314++) {
				if (Static336.aByteArrayArray10[local314] != null || Static453.aByteArrayArray13[local314] != null) {
					local436 = true;
					break;
				}
			}
		}
		if (Static650.aClass2_Sub30_29.aClass11_Sub7_1.method2014() == 1) {
			local314 = Static350.anIntArray376[Static311.anInt4777];
		} else {
			local314 = Static562.anIntArray637[Static311.anInt4777];
		}
		if (Static396.aClass145_6.method9698()) {
			local314++;
		}
		Static69.method1061(Static396.aClass145_6, Static329.anInt5041, Static426.anInt6942, Static280.anInt6752, local314, local436, Static396.aClass145_6.method9694() > 0);
		Static202.method2858(Static430.anInt7017);
		if (Static430.anInt7017 == 0) {
			Static506.method7165((Class68) null);
		} else {
			Static506.method7165(Static435.aClass68_11);
		}
		for (local325 = 0; local325 < 4; local325++) {
			Static626.aClass226Array1[local325].method5280();
		}
		Static51.method742();
		Static436.method6343(false);
		Static8.method116();
		Static8.aBoolean11 = false;
		Static165.method2505();
		System.gc();
		Static713.method9477(true);
		Static325.method4555();
		Static329.anInt5040 = Static650.aClass2_Sub30_29.aClass11_Sub16_1.method4292();
		Static12.aBoolean27 = Static510.anInt8117 >= 96;
		Static705.aBoolean927 = Static650.aClass2_Sub30_29.aClass11_Sub26_1.method8618() == 2;
		Static233.aBoolean332 = Static650.aClass2_Sub30_29.aClass11_Sub29_1.method9323() == 1;
		Static519.anInt8270 = Static650.aClass2_Sub30_29.aClass11_Sub12_1.method2753() == 1 ? -1 : Static597.anInt9295;
		Static34.aBoolean734 = Static650.aClass2_Sub30_29.aClass11_Sub10_1.method2652() == 1;
		Static175.aBoolean928 = Static650.aClass2_Sub30_29.aClass11_Sub4_1.method1189() == 1;
		Static717.aClass199_Sub1_2 = new Class199_Sub1(4, Static426.anInt6942, Static280.anInt6752, false);
		if (Static718.anInt10954 == 0) {
			Static582.method8092(Static717.aClass199_Sub1_2, Static671.aByteArrayArray26);
		} else {
			Static579.method8071(Static717.aClass199_Sub1_2, Static671.aByteArrayArray26, -1221);
		}
		Static45.method591(Static426.anInt6942 >> 4, Static280.anInt6752 >> 4);
		Static134.method1977();
		if (local436) {
			Static463.method6693(true);
			Static611.aClass199_Sub1_1 = new Class199_Sub1(1, Static426.anInt6942, Static280.anInt6752, true);
			if (Static718.anInt10954 == 0) {
				Static582.method8092(Static611.aClass199_Sub1_1, Static453.aByteArrayArray13);
				Static713.method9477(true);
			} else {
				Static579.method8071(Static611.aClass199_Sub1_1, Static453.aByteArrayArray13, -1221);
				Static713.method9477(true);
			}
			Static611.aClass199_Sub1_1.method4271(Static717.aClass199_Sub1_2.anIntArrayArrayArray17[0]);
			Static611.aClass199_Sub1_1.method4269(Static396.aClass145_6, (Class226[]) null, (int[][][]) null);
			Static463.method6693(false);
		}
		Static717.aClass199_Sub1_2.method4269(Static396.aClass145_6, Static626.aClass226Array1, local436 ? Static611.aClass199_Sub1_1.anIntArrayArrayArray17 : null);
		if (Static718.anInt10954 == 0) {
			Static713.method9477(true);
			Static169.method2530(Static100.aByteArrayArray1, Static717.aClass199_Sub1_2);
			if (Static495.aByteArrayArray17 != null) {
				Static37.method8168();
			}
		} else {
			Static713.method9477(true);
			Static248.method3459(Static717.aClass199_Sub1_2, Static100.aByteArrayArray1);
		}
		Static248.method3462();
		if (Static510.anInt8117 < 96) {
			Static436.method6342();
		}
		Static713.method9477(true);
		Static717.aClass199_Sub1_2.method4260(local436 ? Static685.aClass133Array5[0] : null, Static396.aClass145_6, (Class133) null);
		Static717.aClass199_Sub1_2.method4276(Static396.aClass145_6, false);
		Static713.method9477(true);
		if (local436) {
			Static463.method6693(true);
			Static713.method9477(true);
			if (Static718.anInt10954 == 0) {
				Static169.method2530(Static336.aByteArrayArray10, Static611.aClass199_Sub1_1);
			} else {
				Static248.method3459(Static611.aClass199_Sub1_1, Static336.aByteArrayArray10);
			}
			Static248.method3462();
			Static713.method9477(true);
			Static611.aClass199_Sub1_1.method4260((Class133) null, Static396.aClass145_6, Static126.aClass133Array1[0]);
			Static611.aClass199_Sub1_1.method4276(Static396.aClass145_6, true);
			Static713.method9477(true);
			Static463.method6693(false);
		}
		Static295.method4162();
		@Pc(872) int local872 = Static717.aClass199_Sub1_2.anInt4700;
		if (local872 > Static684.anInt10516) {
			local872 = Static684.anInt10516;
		}
		if (Static684.anInt10516 - 1 > local872) {
			local872 = Static684.anInt10516 - 1;
		}
		if (Static650.aClass2_Sub30_29.aClass11_Sub12_1.method2753() == 0) {
			Static695.method9350(local872);
		} else {
			Static695.method9350(0);
		}
		@Pc(920) int local920;
		@Pc(924) int local924;
		for (@Pc(914) int local914 = 0; local914 < 4; local914++) {
			for (local920 = 0; local920 < Static426.anInt6942; local920++) {
				for (local924 = 0; local924 < Static280.anInt6752; local924++) {
					Static246.method3454(local914, local924, local920);
				}
			}
		}
		Static21.method280();
		Static165.method2505();
		Static650.method8942();
		Static248.method3462();
		Static139.method2016();
		@Pc(997) Class2_Sub33 local997;
		if (Static516.aFrame2 != null && Static487.aClass221_2.aClass5_2 != null && Static357.anInt5722 == 12) {
			local997 = Static592.method8154(Static429.aClass349_29, Static487.aClass221_2.aClass48_1);
			local997.aClass2_Sub20_Sub2_1.method8577(1057001181);
			Static487.aClass221_2.method5173(local997);
		}
		if (Static718.anInt10954 == 0) {
			local920 = (Static719.anInt10965 - (Static426.anInt6942 >> 4)) / 8;
			local924 = ((Static426.anInt6942 >> 4) + Static719.anInt10965) / 8;
			@Pc(1034) int local1034 = (Static663.anInt9247 - (Static280.anInt6752 >> 4)) / 8;
			@Pc(1042) int local1042 = (Static663.anInt9247 + (Static280.anInt6752 >> 4)) / 8;
			for (@Pc(1046) int local1046 = local920 - 1; local1046 <= local924 + 1; local1046++) {
				for (@Pc(1052) int local1052 = local1034 - 1; local1052 <= local1042 + 1; local1052++) {
					if (local1046 < local920 || local1046 > local924 || local1034 > local1052 || local1052 > local1042) {
						Static311.aClass254_96.method6078("m" + local1046 + "_" + local1052);
						Static311.aClass254_96.method6078("l" + local1046 + "_" + local1052);
					}
				}
			}
		}
		if (Static357.anInt5722 == 4) {
			Static261.method9374(-125, 3);
		} else if (Static357.anInt5722 == 8) {
			Static261.method9374(-102, 7);
		} else if (Static357.anInt5722 == 10) {
			Static261.method9374(-98, 9);
		} else {
			Static261.method9374(-100, 11);
			if (Static487.aClass221_2.aClass5_2 != null) {
				local997 = Static592.method8154(Static44.aClass349_16, Static487.aClass221_2.aClass48_1);
				Static487.aClass221_2.method5173(local997);
			}
		}
		Static384.method5509();
		Static165.method2505();
		Static534.method7497();
		Static415.aBoolean615 = true;
		if (Static458.aBoolean644) {
			Static180.method5442("Took: " + (Static567.method7863() - Static71.aLong147) + "ms");
			Static458.aBoolean644 = false;
		}
	}
}
