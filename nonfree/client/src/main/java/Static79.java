import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!d", name = "c", descriptor = "I")
	public static int anInt9882 = 0;

	@OriginalMember(owner = "client!d", name = "h", descriptor = "Lclient!gs;")
	public static final Class123 aClass123_16 = new Class123("LOCAL", 4);

	@OriginalMember(owner = "client!d", name = "j", descriptor = "[Lclient!ro;")
	public static final Class6_Sub4_Sub15[] aClass6_Sub4_Sub15Array10 = new Class6_Sub4_Sub15[14];

	@OriginalMember(owner = "client!d", name = "k", descriptor = "I")
	public static int anInt9888 = 503;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
	public static void method8200() {
		Static144.method2663(false);
		Static454.anInt8396 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static61.aByteArrayArray4.length; local14++) {
			if (Static106.anIntArray185[local14] != -1 && Static61.aByteArrayArray4[local14] == null) {
				Static61.aByteArrayArray4[local14] = Static257.aClass168_64.method4435(0, Static106.anIntArray185[local14]);
				if (Static61.aByteArrayArray4[local14] == null) {
					Static454.anInt8396++;
					local12 = false;
				}
			}
			if (Static204.anIntArray282[local14] != -1 && Static22.aByteArrayArray1[local14] == null) {
				Static22.aByteArrayArray1[local14] = Static257.aClass168_64.method4425(Static204.anIntArray282[local14], 0, Static388.anIntArrayArray49[local14]);
				if (Static22.aByteArrayArray1[local14] == null) {
					local12 = false;
					Static454.anInt8396++;
				}
			}
			if (Static224.anIntArray302[local14] != -1 && Static74.aByteArrayArray30[local14] == null) {
				Static74.aByteArrayArray30[local14] = Static257.aClass168_64.method4435(0, Static224.anIntArray302[local14]);
				if (Static74.aByteArrayArray30[local14] == null) {
					local12 = false;
					Static454.anInt8396++;
				}
			}
			if (Static422.anIntArray560[local14] != -1 && Static325.aByteArrayArray21[local14] == null) {
				Static325.aByteArrayArray21[local14] = Static257.aClass168_64.method4435(0, Static422.anIntArray560[local14]);
				if (Static325.aByteArrayArray21[local14] == null) {
					Static454.anInt8396++;
					local12 = false;
				}
			}
			if (Static150.anIntArray523 != null && Static69.aByteArrayArray5[local14] == null && Static150.anIntArray523[local14] != -1) {
				Static69.aByteArrayArray5[local14] = Static257.aClass168_64.method4425(Static150.anIntArray523[local14], 0, Static388.anIntArrayArray49[local14]);
				if (Static69.aByteArrayArray5[local14] == null) {
					Static454.anInt8396++;
					local12 = false;
				}
			}
		}
		if (Static335.aClass183_3 == null) {
			if (Static428.aClass6_Sub4_Sub12_5 == null || !Static168.aClass168_41.method4429(Static428.aClass6_Sub4_Sub12_5.aString78 + "_staticelements")) {
				Static335.aClass183_3 = new Class183(0);
			} else if (Static168.aClass168_41.method4437(Static428.aClass6_Sub4_Sub12_5.aString78 + "_staticelements")) {
				Static335.aClass183_3 = Static554.method7902(Static156.aBoolean272, Static168.aClass168_41, Static428.aClass6_Sub4_Sub12_5.aString78 + "_staticelements");
			} else {
				local12 = false;
				Static454.anInt8396++;
			}
		}
		if (!local12) {
			Static553.anInt9422 = 1;
			return;
		}
		Static483.anInt8763 = 0;
		local12 = true;
		@Pc(270) int local270;
		@Pc(281) int local281;
		for (@Pc(251) int local251 = 0; local251 < Static61.aByteArrayArray4.length; local251++) {
			@Pc(257) byte[] local257 = Static22.aByteArrayArray1[local251];
			if (local257 != null) {
				local270 = (Static341.anIntArray470[local251] >> 8) * 64 - Static191.anInt4147;
				local281 = (Static341.anIntArray470[local251] & 0xFF) * 64 - Static247.anInt5049;
				if (Static314.anInt8010 != 0) {
					local270 = 10;
					local281 = 10;
				}
				local12 &= Static577.method8132(Static44.anInt1275, local281, Static228.anInt4746, local257, local270);
			}
			local257 = Static325.aByteArrayArray21[local251];
			if (local257 != null) {
				local270 = (Static341.anIntArray470[local251] >> 8) * 64 - Static191.anInt4147;
				local281 = (Static341.anIntArray470[local251] & 0xFF) * 64 - Static247.anInt5049;
				if (Static314.anInt8010 != 0) {
					local270 = 10;
					local281 = 10;
				}
				local12 &= Static577.method8132(Static44.anInt1275, local281, Static228.anInt4746, local257, local270);
			}
		}
		if (!local12) {
			Static553.anInt9422 = 2;
			return;
		}
		if (Static553.anInt9422 != 0) {
			Static526.method7658(Static222.aClass152_11.method4002(Static286.anInt5468) + "<br>(100%)", true, Static42.aClass73_1);
		}
		Static186.method3607();
		Static41.method1127();
		@Pc(381) boolean local381 = false;
		if (Static323.aClass9_8.method5462() && Static104.aClass6_Sub6_Sub1_4.aBoolean129) {
			for (local270 = 0; local270 < Static61.aByteArrayArray4.length; local270++) {
				if (Static325.aByteArrayArray21[local270] != null || Static74.aByteArrayArray30[local270] != null) {
					local381 = true;
					break;
				}
			}
		}
		if (Static104.aClass6_Sub6_Sub1_4.aBoolean128) {
			local270 = Static191.anIntArray273[Static171.anInt3918];
		} else {
			local270 = Static85.anIntArray148[Static171.anInt3918];
		}
		if (Static323.aClass9_8.method5407()) {
			local270++;
		}
		Static415.method6494(Static228.anInt4746, Static44.anInt1275, local270, local381, Static323.aClass9_8.method5427() > 0);
		for (local281 = 0; local281 < 4; local281++) {
			Static55.aClass194Array1[local281].method4812();
		}
		Static178.method3535();
		Static114.method2312(false);
		Static321.method5186();
		Static74.aClass38_3 = null;
		Static217.aBoolean323 = false;
		Static186.method3607();
		System.gc();
		Static144.method2663(true);
		Static566.method8000();
		Static58.anInt1473 = Static104.aClass6_Sub6_Sub1_4.method1061(Static5.anInt145);
		Static505.aBoolean677 = Static205.anInt4372 >= 96;
		Static490.aBoolean664 = Static104.aClass6_Sub6_Sub1_4.aBoolean129;
		Static126.aBoolean220 = Static104.aClass6_Sub6_Sub1_4.method1064(Static5.anInt145);
		Static475.aBoolean647 = !Static104.aClass6_Sub6_Sub1_4.aBoolean124;
		Static538.anInt9266 = Static104.aClass6_Sub6_Sub1_4.method1075(Static5.anInt145) ? -1 : Static410.anInt7667;
		Static16.aBoolean42 = Static197.method3727(Static5.anInt145) || Static104.aClass6_Sub6_Sub1_4.aBoolean130;
		Static269.aBoolean398 = Static104.aClass6_Sub6_Sub1_4.aBoolean135;
		Static173.aClass202_Sub1_1 = new Class202_Sub1(4, Static228.anInt4746, Static44.anInt1275, false);
		if (Static314.anInt8010 == 0) {
			Static247.method4364(Static61.aByteArrayArray4, Static173.aClass202_Sub1_1);
		} else {
			Static217.method3468(Static173.aClass202_Sub1_1, Static61.aByteArrayArray4);
		}
		Static465.method7166(Static44.anInt1275 >> 4, Static228.anInt4746 >> 4);
		Static307.method1301();
		if (local381) {
			Static498.method7455(true);
			Static571.aClass202_Sub1_2 = new Class202_Sub1(1, Static228.anInt4746, Static44.anInt1275, true);
			if (Static314.anInt8010 == 0) {
				Static247.method4364(Static74.aByteArrayArray30, Static571.aClass202_Sub1_2);
				Static144.method2663(true);
			} else {
				Static217.method3468(Static571.aClass202_Sub1_2, Static74.aByteArrayArray30);
				Static144.method2663(true);
			}
			Static571.aClass202_Sub1_2.method5723(Static173.aClass202_Sub1_1.anIntArrayArrayArray15[0]);
			Static571.aClass202_Sub1_2.method5727(null, Static323.aClass9_8, null);
			Static498.method7455(false);
		}
		Static173.aClass202_Sub1_1.method5727(local381 ? Static571.aClass202_Sub1_2.anIntArrayArrayArray15 : null, Static323.aClass9_8, Static55.aClass194Array1);
		if (Static314.anInt8010 == 0) {
			Static144.method2663(true);
			Static183.method3591(Static22.aByteArrayArray1, Static173.aClass202_Sub1_1);
			if (Static69.aByteArrayArray5 != null) {
				Static27.method985();
			}
		} else {
			Static144.method2663(true);
			Static137.method2577(Static173.aClass202_Sub1_1, Static22.aByteArrayArray1);
		}
		Static41.method1127();
		if (Static205.anInt4372 < 96) {
			Static451.method6908();
		}
		Static144.method2663(true);
		Static173.aClass202_Sub1_1.method5724(Static323.aClass9_8, local381 ? Static369.aClass62Array3[0] : null, null);
		Static173.aClass202_Sub1_1.method5741(Static323.aClass9_8);
		Static144.method2663(true);
		if (local381) {
			Static498.method7455(true);
			Static144.method2663(true);
			if (Static314.anInt8010 == 0) {
				Static183.method3591(Static325.aByteArrayArray21, Static571.aClass202_Sub1_2);
			} else {
				Static137.method2577(Static571.aClass202_Sub1_2, Static325.aByteArrayArray21);
			}
			Static41.method1127();
			Static144.method2663(true);
			Static571.aClass202_Sub1_2.method5724(Static323.aClass9_8, null, Static53.aClass62Array2[0]);
			Static571.aClass202_Sub1_2.method5741(Static323.aClass9_8);
			Static144.method2663(true);
			Static498.method7455(false);
		}
		Static341.method5377();
		@Pc(715) int local715 = Static173.aClass202_Sub1_1.anInt6810;
		if (Static493.anInt8836 < local715) {
			local715 = Static493.anInt8836;
		}
		if (local715 < Static493.anInt8836 - 1) {
			local715 = Static493.anInt8836 - 1;
		}
		if (Static104.aClass6_Sub6_Sub1_4.method1075(Static5.anInt145)) {
			Static51.method1218(0);
		} else {
			Static51.method1218(local715);
		}
		@Pc(755) int local755;
		@Pc(759) int local759;
		for (@Pc(751) int local751 = 0; local751 < 4; local751++) {
			for (local755 = 0; local755 < Static228.anInt4746; local755++) {
				for (local759 = 0; local759 < Static44.anInt1275; local759++) {
					Static337.method5317(local755, local751, local759);
				}
			}
		}
		Static579.method6614();
		Static186.method3607();
		Static246.method4280();
		Static41.method1127();
		Static320.method5181();
		if (Static138.aFrame1 != null && Static52.aClass64_1 != null && Static325.anInt6149 == 11) {
			Static298.method4854(Static398.aClass181_85);
			Static547.aClass6_Sub26_Sub2_2.method4979(1057001181);
		}
		if (Static314.anInt8010 == 0) {
			local755 = (Static335.anInt6221 - (Static228.anInt4746 >> 4)) / 8;
			local759 = ((Static228.anInt4746 >> 4) + Static335.anInt6221) / 8;
			@Pc(846) int local846 = (Static94.anInt2266 - (Static44.anInt1275 >> 4)) / 8;
			@Pc(854) int local854 = ((Static44.anInt1275 >> 4) + Static94.anInt2266) / 8;
			for (@Pc(858) int local858 = local755 - 1; local858 <= local759 + 1; local858++) {
				for (@Pc(864) int local864 = local846 - 1; local864 <= local854 + 1; local864++) {
					if (local858 < local755 || local858 > local759 || local846 > local864 || local864 > local854) {
						Static257.aClass168_64.method4436("m" + local858 + "_" + local864);
						Static257.aClass168_64.method4436("l" + local858 + "_" + local864);
					}
				}
			}
		}
		if (Static325.anInt6149 == 4) {
			Static145.method2683(3);
		} else if (Static325.anInt6149 == 8) {
			Static145.method2683(7);
		} else {
			Static145.method2683(10);
			if (Static52.aClass64_1 != null) {
				Static298.method4854(Static416.aClass181_87);
			}
		}
		Static93.method2046();
		Static186.method3607();
		Static349.method5693();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IZIZ)Ljava/lang/String;")
	public static String method8202(@OriginalArg(2) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(34) int local34 = 2;
		for (@Pc(38) int local38 = arg0 / 10; local38 != 0; local38 /= 10) {
			local34++;
		}
		@Pc(50) char[] local50 = new char[local34];
		local50[0] = '+';
		for (@Pc(58) int local58 = local34 - 1; local58 > 0; local58--) {
			@Pc(62) int local62 = arg0;
			arg0 /= 10;
			@Pc(73) int local73 = local62 - arg0 * 10;
			if (local73 >= 10) {
				local50[local58] = (char) (local73 + 87);
			} else {
				local50[local58] = (char) (local73 + 48);
			}
		}
		return new String(local50);
	}
}
