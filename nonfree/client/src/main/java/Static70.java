import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!gd", name = "S", descriptor = "Lclient!gd;")
	public static Class2_Sub3_Sub8 aClass2_Sub3_Sub8_6;

	@OriginalMember(owner = "client!gd", name = "I", descriptor = "Lclient!jh;")
	public static Class53 aClass53_11 = new Class53(32);

	@OriginalMember(owner = "client!gd", name = "V", descriptor = "Lclient!qe;")
	public static Class78 aClass78_576 = Static199.method3560("(U");

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!oe;I)V")
	public static void method2254(@OriginalArg(0) Class72 arg0) {
		Static137.aClass72_188 = arg0;
		Static14.anInt3439 = Static137.aClass72_188.method3177(16);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!mj;I)V")
	public static void method2259(@OriginalArg(0) Class64 arg0) {
		if (arg0.anInt3042 == Static16.anInt4869) {
			Static165.aBooleanArray111[arg0.anInt3005] = true;
		}
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(II)V")
	public static void method2260(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(13) int local13 = Static117.anIntArray450[arg0];
		@Pc(17) int local17 = Static120.anIntArray460[arg0];
		@Pc(22) int local22 = (int) Static14.aLongArray8[arg0];
		@Pc(26) long local26 = Static14.aLongArray8[arg0];
		@Pc(30) int local30 = Static79.aShortArray53[arg0];
		if (local30 >= 2000) {
			local30 -= 2000;
		}
		@Pc(65) boolean local65;
		if (local30 == 33) {
			local65 = Static107.method1849(2, 0, local13, 0, 0, 0, Static31.aClass5_Sub2_Sub2_1.anIntArray333[0], false, Static31.aClass5_Sub2_Sub2_1.anIntArray334[0], local17, 0);
			if (!local65) {
				Static107.method1849(2, 0, local13, 0, 0, 1, Static31.aClass5_Sub2_Sub2_1.anIntArray333[0], false, Static31.aClass5_Sub2_Sub2_1.anIntArray334[0], local17, 1);
			}
			Static8.anInt262 = 2;
			Static206.anInt4570 = Static205.anInt740;
			Static2.anInt42 = 0;
			Static46.anInt847 = Static55.anInt981;
			Static161.aClass2_Sub23_Sub1_5.method2155(164);
			Static161.aClass2_Sub23_Sub1_5.method2099(local22);
			Static161.aClass2_Sub23_Sub1_5.method2117(Static28.anInt497 + local13);
			Static161.aClass2_Sub23_Sub1_5.method2099(Static57.anInt628 + local17);
		}
		if (local30 == 11 && Static119.aClass64_9 == null) {
			Static121.method3978(local13, local17);
			Static119.aClass64_9 = Static3.method79(local13, local17);
			method2259(Static119.aClass64_9);
		}
		@Pc(143) Class5_Sub2_Sub1 local143;
		if (local30 == 13) {
			local143 = Static95.aClass5_Sub2_Sub1Array1[local22];
			if (local143 != null) {
				Static107.method1849(2, 0, local143.anIntArray333[0], 0, 0, 1, Static31.aClass5_Sub2_Sub2_1.anIntArray333[0], false, Static31.aClass5_Sub2_Sub2_1.anIntArray334[0], local143.anIntArray334[0], 1);
				Static2.anInt42 = 0;
				Static206.anInt4570 = Static205.anInt740;
				Static8.anInt262 = 2;
				Static46.anInt847 = Static55.anInt981;
				Static161.aClass2_Sub23_Sub1_5.method2155(182);
				Static161.aClass2_Sub23_Sub1_5.method2090(local22);
			}
		}
		if (local30 == 41) {
			local143 = Static95.aClass5_Sub2_Sub1Array1[local22];
			if (local143 != null) {
				Static107.method1849(2, 0, local143.anIntArray333[0], 0, 0, 1, Static31.aClass5_Sub2_Sub2_1.anIntArray333[0], false, Static31.aClass5_Sub2_Sub2_1.anIntArray334[0], local143.anIntArray334[0], 1);
				Static2.anInt42 = 0;
				Static46.anInt847 = Static55.anInt981;
				Static8.anInt262 = 2;
				Static206.anInt4570 = Static205.anInt740;
				Static161.aClass2_Sub23_Sub1_5.method2155(45);
				Static161.aClass2_Sub23_Sub1_5.method2119(Static132.anInt3049);
				Static161.aClass2_Sub23_Sub1_5.method2102(Static73.anInt1574);
				Static161.aClass2_Sub23_Sub1_5.method2099(local22);
				Static161.aClass2_Sub23_Sub1_5.method2119(Static213.anInt2031);
			}
		}
		if (local30 == 50) {
			Static161.aClass2_Sub23_Sub1_5.method2155(189);
			Static161.aClass2_Sub23_Sub1_5.method2099(local13);
			Static161.aClass2_Sub23_Sub1_5.method2090(local22);
			Static161.aClass2_Sub23_Sub1_5.method2102(local17);
			Static123.anInt2811 = 0;
			Static68.aClass64_7 = Static204.method3618(local17);
			Static69.anInt1366 = local13;
		}
		if (local30 == 38) {
			Static16.method3956(local13, local17, local26);
			Static161.aClass2_Sub23_Sub1_5.method2155(191);
			Static161.aClass2_Sub23_Sub1_5.method2119(Static28.anInt497 + local13);
			Static161.aClass2_Sub23_Sub1_5.method2099((int) (local26 >>> 32) & Integer.MAX_VALUE);
			Static161.aClass2_Sub23_Sub1_5.method2119(local17 + Static57.anInt628);
		}
		if (local30 == 2) {
			local65 = Static107.method1849(2, 0, local13, 0, 0, 0, Static31.aClass5_Sub2_Sub2_1.anIntArray333[0], false, Static31.aClass5_Sub2_Sub2_1.anIntArray334[0], local17, 0);
			if (!local65) {
				Static107.method1849(2, 0, local13, 0, 0, 1, Static31.aClass5_Sub2_Sub2_1.anIntArray333[0], false, Static31.aClass5_Sub2_Sub2_1.anIntArray334[0], local17, 1);
			}
			Static2.anInt42 = 0;
			Static8.anInt262 = 2;
			Static46.anInt847 = Static55.anInt981;
			Static206.anInt4570 = Static205.anInt740;
			Static161.aClass2_Sub23_Sub1_5.method2155(108);
			Static161.aClass2_Sub23_Sub1_5.method2117(local13 + Static28.anInt497);
			Static161.aClass2_Sub23_Sub1_5.method2090(local17 + Static57.anInt628);
			Static161.aClass2_Sub23_Sub1_5.method2099(local22);
		}
		if (local30 == 1) {
			Static161.aClass2_Sub23_Sub1_5.method2155(52);
			Static161.aClass2_Sub23_Sub1_5.method2134(local17);
			Static161.aClass2_Sub23_Sub1_5.method2119(local22);
			Static161.aClass2_Sub23_Sub1_5.method2117(local13);
			Static123.anInt2811 = 0;
			Static68.aClass64_7 = Static204.method3618(local17);
			Static69.anInt1366 = local13;
		}
		if (local30 == 7 || local30 == 1007) {
			Static30.method406(local22, local17, Static57.aClass78Array6[arg0], local13);
		}
		if (local30 == 47) {
			local143 = Static95.aClass5_Sub2_Sub1Array1[local22];
			if (local143 != null) {
				Static107.method1849(2, 0, local143.anIntArray333[0], 0, 0, 1, Static31.aClass5_Sub2_Sub2_1.anIntArray333[0], false, Static31.aClass5_Sub2_Sub2_1.anIntArray334[0], local143.anIntArray334[0], 1);
				Static8.anInt262 = 2;
				Static46.anInt847 = Static55.anInt981;
				Static2.anInt42 = 0;
				Static206.anInt4570 = Static205.anInt740;
				Static161.aClass2_Sub23_Sub1_5.method2155(62);
				Static161.aClass2_Sub23_Sub1_5.method2090(local22);
			}
		}
		if (local30 == 9) {
			local65 = Static107.method1849(2, 0, local13, 0, 0, 0, Static31.aClass5_Sub2_Sub2_1.anIntArray333[0], false, Static31.aClass5_Sub2_Sub2_1.anIntArray334[0], local17, 0);
			if (!local65) {
				Static107.method1849(2, 0, local13, 0, 0, 1, Static31.aClass5_Sub2_Sub2_1.anIntArray333[0], false, Static31.aClass5_Sub2_Sub2_1.anIntArray334[0], local17, 1);
			}
			Static2.anInt42 = 0;
			Static46.anInt847 = Static55.anInt981;
			Static206.anInt4570 = Static205.anInt740;
			Static8.anInt262 = 2;
			Static161.aClass2_Sub23_Sub1_5.method2155(5);
			Static161.aClass2_Sub23_Sub1_5.method2102(Static43.anInt794);
			Static161.aClass2_Sub23_Sub1_5.method2119(local22);
			Static161.aClass2_Sub23_Sub1_5.method2099(local17 + Static57.anInt628);
			Static161.aClass2_Sub23_Sub1_5.method2090(Static170.anInt3942);
			Static161.aClass2_Sub23_Sub1_5.method2099(Static28.anInt497 + local13);
		}
		if (local30 == 42) {
			Static161.aClass2_Sub23_Sub1_5.method2155(212);
			Static161.aClass2_Sub23_Sub1_5.method2099(local22);
			Static161.aClass2_Sub23_Sub1_5.method2099(local13);
			Static161.aClass2_Sub23_Sub1_5.method2134(local17);
			Static123.anInt2811 = 0;
			Static68.aClass64_7 = Static204.method3618(local17);
			Static69.anInt1366 = local13;
		}
		@Pc(643) Class64 local643;
		if (local30 == 46) {
			Static38.method507();
			local643 = Static204.method3618(local17);
			Static73.anInt1574 = local17;
			Static121.anInt4906 = 1;
			Static213.anInt2031 = local13;
			Static132.anInt3049 = local22;
			method2259(local643);
			Static203.aClass78_808 = Static94.method1640(new Class78[] { Static113.aClass78_532, Static32.method3209(local22).aClass78_640, Static27.aClass78_93 });
			if (Static203.aClass78_808 == null) {
				Static203.aClass78_808 = Static100.aClass78_482;
			}
			return;
		}
		if (local30 == 22) {
			Static16.method3956(local13, local17, local26);
			Static161.aClass2_Sub23_Sub1_5.method2155(36);
			Static161.aClass2_Sub23_Sub1_5.method2117(Integer.MAX_VALUE & (int) (local26 >>> 32));
			Static161.aClass2_Sub23_Sub1_5.method2119(local17 + Static57.anInt628);
			Static161.aClass2_Sub23_Sub1_5.method2099(local13 + Static28.anInt497);
		}
		if (local30 == 16) {
			local143 = Static95.aClass5_Sub2_Sub1Array1[local22];
			if (local143 != null) {
				Static107.method1849(2, 0, local143.anIntArray333[0], 0, 0, 1, Static31.aClass5_Sub2_Sub2_1.anIntArray333[0], false, Static31.aClass5_Sub2_Sub2_1.anIntArray334[0], local143.anIntArray334[0], 1);
				Static8.anInt262 = 2;
				Static2.anInt42 = 0;
				Static206.anInt4570 = Static205.anInt740;
				Static46.anInt847 = Static55.anInt981;
				Static161.aClass2_Sub23_Sub1_5.method2155(173);
				Static161.aClass2_Sub23_Sub1_5.method2119(local22);
			}
		}
		if (local30 == 51) {
			Static16.method3959(Static137.anInt3136, local13, local17);
		}
		if (local30 == 48) {
			local143 = Static95.aClass5_Sub2_Sub1Array1[local22];
			if (local143 != null) {
				Static107.method1849(2, 0, local143.anIntArray333[0], 0, 0, 1, Static31.aClass5_Sub2_Sub2_1.anIntArray333[0], false, Static31.aClass5_Sub2_Sub2_1.anIntArray334[0], local143.anIntArray334[0], 1);
				Static2.anInt42 = 0;
				Static206.anInt4570 = Static205.anInt740;
				Static8.anInt262 = 2;
				Static46.anInt847 = Static55.anInt981;
				Static161.aClass2_Sub23_Sub1_5.method2155(131);
				Static161.aClass2_Sub23_Sub1_5.method2099(Static170.anInt3942);
				Static161.aClass2_Sub23_Sub1_5.method2139(Static43.anInt794);
				Static161.aClass2_Sub23_Sub1_5.method2090(local22);
			}
		}
		if (local30 == 25) {
			local143 = Static95.aClass5_Sub2_Sub1Array1[local22];
			if (local143 != null) {
				Static107.method1849(2, 0, local143.anIntArray333[0], 0, 0, 1, Static31.aClass5_Sub2_Sub2_1.anIntArray333[0], false, Static31.aClass5_Sub2_Sub2_1.anIntArray334[0], local143.anIntArray334[0], 1);
				Static206.anInt4570 = Static205.anInt740;
				Static8.anInt262 = 2;
				Static2.anInt42 = 0;
				Static46.anInt847 = Static55.anInt981;
				Static161.aClass2_Sub23_Sub1_5.method2155(172);
				Static161.aClass2_Sub23_Sub1_5.method2090(local22);
			}
		}
		@Pc(915) Class5_Sub2_Sub2 local915;
		if (local30 == 12) {
			local915 = Static213.aClass5_Sub2_Sub2Array3[local22];
			if (local915 != null) {
				Static107.method1849(2, 0, local915.anIntArray333[0], 0, 0, 1, Static31.aClass5_Sub2_Sub2_1.anIntArray333[0], false, Static31.aClass5_Sub2_Sub2_1.anIntArray334[0], local915.anIntArray334[0], 1);
				Static206.anInt4570 = Static205.anInt740;
				Static8.anInt262 = 2;
				Static46.anInt847 = Static55.anInt981;
				Static2.anInt42 = 0;
				Static161.aClass2_Sub23_Sub1_5.method2155(206);
				Static161.aClass2_Sub23_Sub1_5.method2090(local22);
			}
		}
		if (local30 == 32) {
			local915 = Static213.aClass5_Sub2_Sub2Array3[local22];
			if (local915 != null) {
				Static107.method1849(2, 0, local915.anIntArray333[0], 0, 0, 1, Static31.aClass5_Sub2_Sub2_1.anIntArray333[0], false, Static31.aClass5_Sub2_Sub2_1.anIntArray334[0], local915.anIntArray334[0], 1);
				Static46.anInt847 = Static55.anInt981;
				Static8.anInt262 = 2;
				Static2.anInt42 = 0;
				Static206.anInt4570 = Static205.anInt740;
				Static161.aClass2_Sub23_Sub1_5.method2155(19);
				Static161.aClass2_Sub23_Sub1_5.method2134(Static43.anInt794);
				Static161.aClass2_Sub23_Sub1_5.method2090(local22);
				Static161.aClass2_Sub23_Sub1_5.method2099(Static170.anInt3942);
			}
		}
		if (local30 == 28) {
			Static161.aClass2_Sub23_Sub1_5.method2155(133);
			Static161.aClass2_Sub23_Sub1_5.method2117(local13);
			Static161.aClass2_Sub23_Sub1_5.method2117(local22);
			Static161.aClass2_Sub23_Sub1_5.method2134(local17);
			Static123.anInt2811 = 0;
			Static68.aClass64_7 = Static204.method3618(local17);
			Static69.anInt1366 = local13;
		}
		if (local30 == 37) {
			local65 = Static107.method1849(2, 0, local13, 0, 0, 0, Static31.aClass5_Sub2_Sub2_1.anIntArray333[0], false, Static31.aClass5_Sub2_Sub2_1.anIntArray334[0], local17, 0);
			if (!local65) {
				Static107.method1849(2, 0, local13, 0, 0, 1, Static31.aClass5_Sub2_Sub2_1.anIntArray333[0], false, Static31.aClass5_Sub2_Sub2_1.anIntArray334[0], local17, 1);
			}
			Static8.anInt262 = 2;
			Static46.anInt847 = Static55.anInt981;
			Static2.anInt42 = 0;
			Static206.anInt4570 = Static205.anInt740;
			Static161.aClass2_Sub23_Sub1_5.method2155(143);
			Static161.aClass2_Sub23_Sub1_5.method2099(Static57.anInt628 + local17);
			Static161.aClass2_Sub23_Sub1_5.method2099(Static28.anInt497 + local13);
			Static161.aClass2_Sub23_Sub1_5.method2090(local22);
		}
		if (local30 == 26) {
			local915 = Static213.aClass5_Sub2_Sub2Array3[local22];
			if (local915 != null) {
				Static107.method1849(2, 0, local915.anIntArray333[0], 0, 0, 1, Static31.aClass5_Sub2_Sub2_1.anIntArray333[0], false, Static31.aClass5_Sub2_Sub2_1.anIntArray334[0], local915.anIntArray334[0], 1);
				Static2.anInt42 = 0;
				Static206.anInt4570 = Static205.anInt740;
				Static8.anInt262 = 2;
				Static46.anInt847 = Static55.anInt981;
				Static161.aClass2_Sub23_Sub1_5.method2155(127);
				Static161.aClass2_Sub23_Sub1_5.method2119(local22);
			}
		}
		if (local30 == 3) {
			local65 = Static107.method1849(2, 0, local13, 0, 0, 0, Static31.aClass5_Sub2_Sub2_1.anIntArray333[0], false, Static31.aClass5_Sub2_Sub2_1.anIntArray334[0], local17, 0);
			if (!local65) {
				Static107.method1849(2, 0, local13, 0, 0, 1, Static31.aClass5_Sub2_Sub2_1.anIntArray333[0], false, Static31.aClass5_Sub2_Sub2_1.anIntArray334[0], local17, 1);
			}
			Static46.anInt847 = Static55.anInt981;
			Static206.anInt4570 = Static205.anInt740;
			Static8.anInt262 = 2;
			Static2.anInt42 = 0;
			Static161.aClass2_Sub23_Sub1_5.method2155(56);
			Static161.aClass2_Sub23_Sub1_5.method2119(Static132.anInt3049);
			Static161.aClass2_Sub23_Sub1_5.method2117(Static213.anInt2031);
			Static161.aClass2_Sub23_Sub1_5.method2119(local17 + Static57.anInt628);
			Static161.aClass2_Sub23_Sub1_5.method2090(local13 + Static28.anInt497);
			Static161.aClass2_Sub23_Sub1_5.method2117(local22);
			Static161.aClass2_Sub23_Sub1_5.method2134(Static73.anInt1574);
		}
		if (local30 == 58) {
			Static161.aClass2_Sub23_Sub1_5.method2155(250);
			Static161.aClass2_Sub23_Sub1_5.method2139(Static43.anInt794);
			Static161.aClass2_Sub23_Sub1_5.method2102(local17);
			Static161.aClass2_Sub23_Sub1_5.method2117(local13);
			Static161.aClass2_Sub23_Sub1_5.method2119(Static170.anInt3942);
		}
		if (local30 == 17) {
			Static12.method229();
		}
		if (local30 == 21 && Static16.method3956(local13, local17, local26)) {
			Static161.aClass2_Sub23_Sub1_5.method2155(111);
			Static161.aClass2_Sub23_Sub1_5.method2109(Static43.anInt794);
			Static161.aClass2_Sub23_Sub1_5.method2117(local17 + Static57.anInt628);
			Static161.aClass2_Sub23_Sub1_5.method2099((int) (local26 >>> 32) & Integer.MAX_VALUE);
			Static161.aClass2_Sub23_Sub1_5.method2119(Static170.anInt3942);
			Static161.aClass2_Sub23_Sub1_5.method2119(local13 + Static28.anInt497);
		}
		if (local30 == 15) {
			local143 = Static95.aClass5_Sub2_Sub1Array1[local22];
			if (local143 != null) {
				Static107.method1849(2, 0, local143.anIntArray333[0], 0, 0, 1, Static31.aClass5_Sub2_Sub2_1.anIntArray333[0], false, Static31.aClass5_Sub2_Sub2_1.anIntArray334[0], local143.anIntArray334[0], 1);
				Static8.anInt262 = 2;
				Static206.anInt4570 = Static205.anInt740;
				Static2.anInt42 = 0;
				Static46.anInt847 = Static55.anInt981;
				Static161.aClass2_Sub23_Sub1_5.method2155(28);
				Static161.aClass2_Sub23_Sub1_5.method2117(local22);
			}
		}
		if (local30 == 40) {
			Static16.method3956(local13, local17, local26);
			Static161.aClass2_Sub23_Sub1_5.method2155(35);
			Static161.aClass2_Sub23_Sub1_5.method2119(Static28.anInt497 + local13);
			Static161.aClass2_Sub23_Sub1_5.method2090(Static57.anInt628 + local17);
			Static161.aClass2_Sub23_Sub1_5.method2117(Integer.MAX_VALUE & (int) (local26 >>> 32));
		}
		if (local30 == 20) {
			Static161.aClass2_Sub23_Sub1_5.method2155(174);
			Static161.aClass2_Sub23_Sub1_5.method2134(local17);
			local643 = Static204.method3618(local17);
			if (local643.anIntArrayArray29 != null && local643.anIntArrayArray29[0][0] == 5) {
				@Pc(1499) int local1499 = local643.anIntArrayArray29[0][1];
				Static198.anIntArray724[local1499] = 1 - Static198.anIntArray724[local1499];
				Static69.method1122(local1499);
			}
		}
		if (local30 == 24) {
			Static161.aClass2_Sub23_Sub1_5.method2155(98);
			Static161.aClass2_Sub23_Sub1_5.method2090(local13);
			Static161.aClass2_Sub23_Sub1_5.method2139(local17);
			Static161.aClass2_Sub23_Sub1_5.method2090(local22);
			Static123.anInt2811 = 0;
			Static68.aClass64_7 = Static204.method3618(local17);
			Static69.anInt1366 = local13;
		}
		if (local30 == 6 && Static16.method3956(local13, local17, local26)) {
			Static161.aClass2_Sub23_Sub1_5.method2155(204);
			Static161.aClass2_Sub23_Sub1_5.method2119(Static28.anInt497 + local13);
			Static161.aClass2_Sub23_Sub1_5.method2099(Static213.anInt2031);
			Static161.aClass2_Sub23_Sub1_5.method2109(Static73.anInt1574);
			Static161.aClass2_Sub23_Sub1_5.method2090(Static132.anInt3049);
			Static161.aClass2_Sub23_Sub1_5.method2117(Static57.anInt628 + local17);
			Static161.aClass2_Sub23_Sub1_5.method2090(Integer.MAX_VALUE & (int) (local26 >>> 32));
		}
		if (local30 == 35) {
			Static16.method3956(local13, local17, local26);
			Static161.aClass2_Sub23_Sub1_5.method2155(193);
			Static161.aClass2_Sub23_Sub1_5.method2117(local13 + Static28.anInt497);
			Static161.aClass2_Sub23_Sub1_5.method2117(local17 + Static57.anInt628);
			Static161.aClass2_Sub23_Sub1_5.method2119((int) (local26 >>> 32) & Integer.MAX_VALUE);
		}
		if (local30 == 44) {
			local915 = Static213.aClass5_Sub2_Sub2Array3[local22];
			if (local915 != null) {
				Static107.method1849(2, 0, local915.anIntArray333[0], 0, 0, 1, Static31.aClass5_Sub2_Sub2_1.anIntArray333[0], false, Static31.aClass5_Sub2_Sub2_1.anIntArray334[0], local915.anIntArray334[0], 1);
				Static2.anInt42 = 0;
				Static206.anInt4570 = Static205.anInt740;
				Static8.anInt262 = 2;
				Static46.anInt847 = Static55.anInt981;
				Static161.aClass2_Sub23_Sub1_5.method2155(148);
				Static161.aClass2_Sub23_Sub1_5.method2090(local22);
			}
		}
		if (local30 == 5) {
			local915 = Static213.aClass5_Sub2_Sub2Array3[local22];
			if (local915 != null) {
				Static107.method1849(2, 0, local915.anIntArray333[0], 0, 0, 1, Static31.aClass5_Sub2_Sub2_1.anIntArray333[0], false, Static31.aClass5_Sub2_Sub2_1.anIntArray334[0], local915.anIntArray334[0], 1);
				Static8.anInt262 = 2;
				Static46.anInt847 = Static55.anInt981;
				Static2.anInt42 = 0;
				Static206.anInt4570 = Static205.anInt740;
				Static161.aClass2_Sub23_Sub1_5.method2155(125);
				Static161.aClass2_Sub23_Sub1_5.method2119(local22);
				Static161.aClass2_Sub23_Sub1_5.method2102(Static73.anInt1574);
				Static161.aClass2_Sub23_Sub1_5.method2119(Static213.anInt2031);
				Static161.aClass2_Sub23_Sub1_5.method2119(Static132.anInt3049);
			}
		}
		if (local30 == 4) {
			local915 = Static213.aClass5_Sub2_Sub2Array3[local22];
			if (local915 != null) {
				Static107.method1849(2, 0, local915.anIntArray333[0], 0, 0, 1, Static31.aClass5_Sub2_Sub2_1.anIntArray333[0], false, Static31.aClass5_Sub2_Sub2_1.anIntArray334[0], local915.anIntArray334[0], 1);
				Static46.anInt847 = Static55.anInt981;
				Static2.anInt42 = 0;
				Static206.anInt4570 = Static205.anInt740;
				Static8.anInt262 = 2;
				Static161.aClass2_Sub23_Sub1_5.method2155(21);
				Static161.aClass2_Sub23_Sub1_5.method2099(local22);
			}
		}
		if (local30 == 23) {
			Static161.aClass2_Sub23_Sub1_5.method2155(94);
			Static161.aClass2_Sub23_Sub1_5.method2090(Static170.anInt3942);
			Static161.aClass2_Sub23_Sub1_5.method2117(local13);
			Static161.aClass2_Sub23_Sub1_5.method2139(local17);
			Static161.aClass2_Sub23_Sub1_5.method2134(Static43.anInt794);
			Static161.aClass2_Sub23_Sub1_5.method2099(local22);
			Static123.anInt2811 = 0;
			Static68.aClass64_7 = Static204.method3618(local17);
			Static69.anInt1366 = local13;
		}
		if (local30 == 45) {
			Static161.aClass2_Sub23_Sub1_5.method2155(81);
			Static161.aClass2_Sub23_Sub1_5.method2119(local13);
			Static161.aClass2_Sub23_Sub1_5.method2134(local17);
			Static161.aClass2_Sub23_Sub1_5.method2090(local22);
			Static123.anInt2811 = 0;
			Static68.aClass64_7 = Static204.method3618(local17);
			Static69.anInt1366 = local13;
		}
		if (local30 == 34) {
			local915 = Static213.aClass5_Sub2_Sub2Array3[local22];
			if (local915 != null) {
				Static107.method1849(2, 0, local915.anIntArray333[0], 0, 0, 1, Static31.aClass5_Sub2_Sub2_1.anIntArray333[0], false, Static31.aClass5_Sub2_Sub2_1.anIntArray334[0], local915.anIntArray334[0], 1);
				Static8.anInt262 = 2;
				Static206.anInt4570 = Static205.anInt740;
				Static46.anInt847 = Static55.anInt981;
				Static2.anInt42 = 0;
				Static161.aClass2_Sub23_Sub1_5.method2155(239);
				Static161.aClass2_Sub23_Sub1_5.method2117(local22);
			}
		}
		if (local30 == 19) {
			Static161.aClass2_Sub23_Sub1_5.method2155(42);
			Static161.aClass2_Sub23_Sub1_5.method2134(local17);
			Static161.aClass2_Sub23_Sub1_5.method2119(local13);
			Static161.aClass2_Sub23_Sub1_5.method2119(local22);
			Static123.anInt2811 = 0;
			Static68.aClass64_7 = Static204.method3618(local17);
			Static69.anInt1366 = local13;
		}
		if (local30 == 8) {
			Static161.aClass2_Sub23_Sub1_5.method2155(29);
			Static161.aClass2_Sub23_Sub1_5.method2117(local22);
			Static161.aClass2_Sub23_Sub1_5.method2109(Static73.anInt1574);
			Static161.aClass2_Sub23_Sub1_5.method2099(Static132.anInt3049);
			Static161.aClass2_Sub23_Sub1_5.method2117(Static213.anInt2031);
			Static161.aClass2_Sub23_Sub1_5.method2117(local13);
			Static161.aClass2_Sub23_Sub1_5.method2102(local17);
			Static123.anInt2811 = 0;
			Static68.aClass64_7 = Static204.method3618(local17);
			Static69.anInt1366 = local13;
		}
		if (local30 == 1005) {
			Static16.method3956(local13, local17, local26);
			Static161.aClass2_Sub23_Sub1_5.method2155(75);
			Static161.aClass2_Sub23_Sub1_5.method2119(Static28.anInt497 + local13);
			Static161.aClass2_Sub23_Sub1_5.method2090(Static57.anInt628 + local17);
			Static161.aClass2_Sub23_Sub1_5.method2119((int) (local26 >>> 32) & Integer.MAX_VALUE);
		}
		if (local30 == 36) {
			local915 = Static213.aClass5_Sub2_Sub2Array3[local22];
			if (local915 != null) {
				Static107.method1849(2, 0, local915.anIntArray333[0], 0, 0, 1, Static31.aClass5_Sub2_Sub2_1.anIntArray333[0], false, Static31.aClass5_Sub2_Sub2_1.anIntArray334[0], local915.anIntArray334[0], 1);
				Static8.anInt262 = 2;
				Static206.anInt4570 = Static205.anInt740;
				Static46.anInt847 = Static55.anInt981;
				Static2.anInt42 = 0;
				Static161.aClass2_Sub23_Sub1_5.method2155(130);
				Static161.aClass2_Sub23_Sub1_5.method2090(local22);
			}
		}
		if (local30 == 18) {
			Static161.aClass2_Sub23_Sub1_5.method2155(158);
			Static161.aClass2_Sub23_Sub1_5.method2117(local13);
			Static161.aClass2_Sub23_Sub1_5.method2139(local17);
			Static161.aClass2_Sub23_Sub1_5.method2119(local22);
			Static123.anInt2811 = 0;
			Static68.aClass64_7 = Static204.method3618(local17);
			Static69.anInt1366 = local13;
		}
		if (local30 == 1001) {
			Static8.anInt262 = 2;
			Static46.anInt847 = Static55.anInt981;
			Static2.anInt42 = 0;
			Static206.anInt4570 = Static205.anInt740;
			local143 = Static95.aClass5_Sub2_Sub1Array1[local22];
			if (local143 != null) {
				@Pc(2170) Class2_Sub3_Sub9 local2170 = local143.aClass2_Sub3_Sub9_1;
				if (local2170.anIntArray230 != null) {
					local2170 = local2170.method1059();
				}
				if (local2170 != null) {
					Static161.aClass2_Sub23_Sub1_5.method2155(90);
					Static161.aClass2_Sub23_Sub1_5.method2117(local2170.anInt1274);
				}
			}
		}
		if (local30 == 57) {
			local643 = Static3.method79(local13, local17);
			if (local643 != null) {
				Static38.method507();
				Static45.method594(Static164.method2978(Static36.method473(local643)), local17, local13);
				Static121.anInt4906 = 0;
				Static69.aClass78_317 = Static126.method2302(local643);
				if (Static69.aClass78_317 == null) {
					Static69.aClass78_317 = Static99.aClass78_478;
				}
				if (local643.aBoolean132) {
					Static19.aClass78_60 = Static94.method1640(new Class78[] { local643.aClass78_587, Static27.aClass78_93 });
					return;
				}
				Static19.aClass78_60 = Static94.method1640(new Class78[] { Static174.aClass78_700, local643.aClass78_594, Static27.aClass78_93 });
			}
			return;
		}
		if (local30 == 29) {
			local65 = Static107.method1849(2, 0, local13, 0, 0, 0, Static31.aClass5_Sub2_Sub2_1.anIntArray333[0], false, Static31.aClass5_Sub2_Sub2_1.anIntArray334[0], local17, 0);
			if (!local65) {
				Static107.method1849(2, 0, local13, 0, 0, 1, Static31.aClass5_Sub2_Sub2_1.anIntArray333[0], false, Static31.aClass5_Sub2_Sub2_1.anIntArray334[0], local17, 1);
			}
			Static8.anInt262 = 2;
			Static2.anInt42 = 0;
			Static46.anInt847 = Static55.anInt981;
			Static206.anInt4570 = Static205.anInt740;
			Static161.aClass2_Sub23_Sub1_5.method2155(138);
			Static161.aClass2_Sub23_Sub1_5.method2117(local22);
			Static161.aClass2_Sub23_Sub1_5.method2117(local17 + Static57.anInt628);
			Static161.aClass2_Sub23_Sub1_5.method2117(Static28.anInt497 + local13);
		}
		if (local30 == 39) {
			Static161.aClass2_Sub23_Sub1_5.method2155(245);
			Static161.aClass2_Sub23_Sub1_5.method2109(local17);
			Static161.aClass2_Sub23_Sub1_5.method2117(local13);
			Static161.aClass2_Sub23_Sub1_5.method2099(local22);
			Static123.anInt2811 = 0;
			Static68.aClass64_7 = Static204.method3618(local17);
			Static69.anInt1366 = local13;
		}
		if (local30 == 1004) {
			Static2.anInt42 = 0;
			Static8.anInt262 = 2;
			Static206.anInt4570 = Static205.anInt740;
			Static46.anInt847 = Static55.anInt981;
			Static161.aClass2_Sub23_Sub1_5.method2155(225);
			Static161.aClass2_Sub23_Sub1_5.method2099(local22);
		}
		if (local30 == 43) {
			Static161.aClass2_Sub23_Sub1_5.method2155(214);
			Static161.aClass2_Sub23_Sub1_5.method2139(local17);
			Static161.aClass2_Sub23_Sub1_5.method2119(local13);
			Static161.aClass2_Sub23_Sub1_5.method2117(local22);
			Static123.anInt2811 = 0;
			Static68.aClass64_7 = Static204.method3618(local17);
			Static69.anInt1366 = local13;
		}
		if (local30 == 31) {
			local65 = Static107.method1849(2, 0, local13, 0, 0, 0, Static31.aClass5_Sub2_Sub2_1.anIntArray333[0], false, Static31.aClass5_Sub2_Sub2_1.anIntArray334[0], local17, 0);
			if (!local65) {
				Static107.method1849(2, 0, local13, 0, 0, 1, Static31.aClass5_Sub2_Sub2_1.anIntArray333[0], false, Static31.aClass5_Sub2_Sub2_1.anIntArray334[0], local17, 1);
			}
			Static2.anInt42 = 0;
			Static206.anInt4570 = Static205.anInt740;
			Static46.anInt847 = Static55.anInt981;
			Static8.anInt262 = 2;
			Static161.aClass2_Sub23_Sub1_5.method2155(93);
			Static161.aClass2_Sub23_Sub1_5.method2117(Static57.anInt628 + local17);
			Static161.aClass2_Sub23_Sub1_5.method2117(local22);
			Static161.aClass2_Sub23_Sub1_5.method2117(local13 + Static28.anInt497);
		}
		if (local30 == 1002) {
			Static2.anInt42 = 0;
			Static206.anInt4570 = Static205.anInt740;
			Static8.anInt262 = 2;
			Static46.anInt847 = Static55.anInt981;
			Static161.aClass2_Sub23_Sub1_5.method2155(82);
			Static161.aClass2_Sub23_Sub1_5.method2090(local22);
		}
		if (local30 == 1003) {
			local643 = Static204.method3618(local17);
			if (local643 == null || local643.anIntArray496[local13] < 100000) {
				Static161.aClass2_Sub23_Sub1_5.method2155(82);
				Static161.aClass2_Sub23_Sub1_5.method2090(local22);
			} else {
				Static95.method1663(Static73.aClass78_352, Static94.method1640(new Class78[] { Static19.method268(local643.anIntArray496[local13]), Static151.aClass78_632, Static32.method3209(local22).aClass78_640 }), 0);
			}
			Static123.anInt2811 = 0;
			Static68.aClass64_7 = Static204.method3618(local17);
			Static69.anInt1366 = local13;
		}
		if (local30 == 30) {
			local915 = Static213.aClass5_Sub2_Sub2Array3[local22];
			if (local915 != null) {
				Static107.method1849(2, 0, local915.anIntArray333[0], 0, 0, 1, Static31.aClass5_Sub2_Sub2_1.anIntArray333[0], false, Static31.aClass5_Sub2_Sub2_1.anIntArray334[0], local915.anIntArray334[0], 1);
				Static46.anInt847 = Static55.anInt981;
				Static2.anInt42 = 0;
				Static8.anInt262 = 2;
				Static206.anInt4570 = Static205.anInt740;
				Static161.aClass2_Sub23_Sub1_5.method2155(6);
				Static161.aClass2_Sub23_Sub1_5.method2119(local22);
			}
		}
		if (local30 == 49) {
			local643 = Static204.method3618(local17);
			@Pc(2662) boolean local2662 = true;
			if (local643.anInt3002 > 0) {
				local2662 = Static34.method426(local643);
			}
			if (local2662) {
				Static161.aClass2_Sub23_Sub1_5.method2155(174);
				Static161.aClass2_Sub23_Sub1_5.method2134(local17);
			}
		}
		if (local30 == 14) {
			local915 = Static213.aClass5_Sub2_Sub2Array3[local22];
			if (local915 != null) {
				Static107.method1849(2, 0, local915.anIntArray333[0], 0, 0, 1, Static31.aClass5_Sub2_Sub2_1.anIntArray333[0], false, Static31.aClass5_Sub2_Sub2_1.anIntArray334[0], local915.anIntArray334[0], 1);
				Static206.anInt4570 = Static205.anInt740;
				Static46.anInt847 = Static55.anInt981;
				Static8.anInt262 = 2;
				Static2.anInt42 = 0;
				Static161.aClass2_Sub23_Sub1_5.method2155(10);
				Static161.aClass2_Sub23_Sub1_5.method2119(local22);
			}
		}
		if (local30 == 10) {
			Static161.aClass2_Sub23_Sub1_5.method2155(174);
			Static161.aClass2_Sub23_Sub1_5.method2134(local17);
			@Pc(2763) Class64 local2763 = Static204.method3618(local17);
			if (local2763.anIntArrayArray29 != null && local2763.anIntArrayArray29[0][0] == 5) {
				@Pc(2787) int local2787 = local2763.anIntArrayArray29[0][1];
				if (Static198.anIntArray724[local2787] != local2763.anIntArray504[0]) {
					Static198.anIntArray724[local2787] = local2763.anIntArray504[0];
					Static69.method1122(local2787);
				}
			}
		}
		if (Static121.anInt4906 != 0) {
			Static121.anInt4906 = 0;
			method2259(Static204.method3618(Static73.anInt1574));
		}
		if (Static125.aBoolean60) {
			Static38.method507();
		}
		if (Static68.aClass64_7 != null && Static123.anInt2811 == 0) {
			method2259(Static68.aClass64_7);
		}
	}
}
