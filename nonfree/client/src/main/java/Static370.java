import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_85 = new Class212(41, 4);

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
	public static int anInt6428 = 0;

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray46 = new int[6][];

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "[I")
	public static final int[] anIntArray518 = new int[6];

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLclient!wn;)V")
	public static void method5244(@OriginalArg(1) Class4_Sub20 arg0) {
		@Pc(9) int local9 = arg0.method4575();
		Static238.aClass215Array1 = new Class215[local9];
		for (@Pc(18) int local18 = 0; local18 < local9; local18++) {
			Static238.aClass215Array1[local18] = new Class215();
			Static238.aClass215Array1[local18].anInt6106 = arg0.method4575();
			Static238.aClass215Array1[local18].aString52 = arg0.method4612();
		}
		Static11.anInt210 = arg0.method4575();
		Static174.anInt3434 = arg0.method4575();
		Static406.anInt6632 = arg0.method4575();
		Static128.aClass82_Sub1Array5 = new Class82_Sub1[Static174.anInt3434 + 1 - Static11.anInt210];
		for (@Pc(66) int local66 = 0; local66 < Static406.anInt6632; local66++) {
			@Pc(72) int local72 = arg0.method4575();
			@Pc(80) Class82_Sub1 local80 = Static128.aClass82_Sub1Array5[local72] = new Class82_Sub1();
			local80.anInt7695 = arg0.method4614();
			local80.anInt7699 = arg0.method4595();
			local80.anInt7704 = local72 + Static11.anInt210;
			local80.aString80 = arg0.method4612();
			local80.aString79 = arg0.method4612();
		}
		Static436.anInt7466 = arg0.method4595();
		Static445.aBoolean559 = true;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
	public static void method5246() {
		Static247.method4077(false);
		Static330.anInt5880 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static353.aByteArrayArray18.length; local14++) {
			if (Static431.anIntArray600[local14] != -1 && Static353.aByteArrayArray18[local14] == null) {
				Static353.aByteArrayArray18[local14] = Static30.aClass38_8.method1039(0, Static431.anIntArray600[local14]);
				if (Static353.aByteArrayArray18[local14] == null) {
					local12 = false;
					Static330.anInt5880++;
				}
			}
			if (Static55.anIntArray82[local14] != -1 && Static8.aByteArrayArray2[local14] == null) {
				Static8.aByteArrayArray2[local14] = Static30.aClass38_8.method1041(0, Static423.anIntArrayArray57[local14], Static55.anIntArray82[local14]);
				if (Static8.aByteArrayArray2[local14] == null) {
					Static330.anInt5880++;
					local12 = false;
				}
			}
			if (Static129.anIntArray233[local14] != -1 && Static164.aByteArrayArray14[local14] == null) {
				Static164.aByteArrayArray14[local14] = Static30.aClass38_8.method1039(0, Static129.anIntArray233[local14]);
				if (Static164.aByteArrayArray14[local14] == null) {
					Static330.anInt5880++;
					local12 = false;
				}
			}
			if (Static402.anIntArray574[local14] != -1 && Static256.aByteArrayArray15[local14] == null) {
				Static256.aByteArrayArray15[local14] = Static30.aClass38_8.method1039(0, Static402.anIntArray574[local14]);
				if (Static256.aByteArrayArray15[local14] == null) {
					local12 = false;
					Static330.anInt5880++;
				}
			}
			if (Static4.anIntArray6 != null && Static125.aByteArrayArray9[local14] == null && Static4.anIntArray6[local14] != -1) {
				Static125.aByteArrayArray9[local14] = Static30.aClass38_8.method1041(0, Static423.anIntArrayArray57[local14], Static4.anIntArray6[local14]);
				if (Static125.aByteArrayArray9[local14] == null) {
					local12 = false;
					Static330.anInt5880++;
				}
			}
		}
		if (Static311.aClass189_3 == null) {
			if (Static130.aClass4_Sub1_Sub18_1 == null || !Static438.aClass38_91.method1014(Static130.aClass4_Sub1_Sub18_1.aString64 + "_staticelements")) {
				Static311.aClass189_3 = new Class189(0);
			} else if (Static438.aClass38_91.method1048(Static130.aClass4_Sub1_Sub18_1.aString64 + "_staticelements")) {
				Static311.aClass189_3 = Static124.method2330(Static130.aClass4_Sub1_Sub18_1.aString64 + "_staticelements", Static438.aClass38_91, Static289.aBoolean384);
			} else {
				local12 = false;
				Static330.anInt5880++;
			}
		}
		if (!local12) {
			Static77.anInt1869 = 1;
			return;
		}
		local12 = true;
		Static93.anInt2062 = 0;
		@Pc(266) int local266;
		@Pc(277) int local277;
		for (@Pc(247) int local247 = 0; local247 < Static353.aByteArrayArray18.length; local247++) {
			@Pc(253) byte[] local253 = Static8.aByteArrayArray2[local247];
			if (local253 != null) {
				local266 = (Static109.anIntArray203[local247] >> 8) * 64 - Static426.anInt7325;
				local277 = (Static109.anIntArray203[local247] & 0xFF) * 64 - Static72.anInt1776;
				if (Static227.anInt4510 != 0) {
					local266 = 10;
					local277 = 10;
				}
				local12 &= Static239.method4009(Static301.anInt5585, local277, Static193.anInt3853, local253, local266);
			}
			local253 = Static256.aByteArrayArray15[local247];
			if (local253 != null) {
				local266 = (Static109.anIntArray203[local247] >> 8) * 64 - Static426.anInt7325;
				local277 = (Static109.anIntArray203[local247] & 0xFF) * 64 - Static72.anInt1776;
				if (Static227.anInt4510 != 0) {
					local277 = 10;
					local266 = 10;
				}
				local12 &= Static239.method4009(Static301.anInt5585, local277, Static193.anInt3853, local253, local266);
			}
		}
		if (!local12) {
			Static77.anInt1869 = 2;
			return;
		}
		if (Static77.anInt1869 != 0) {
			Static122.method2305(true, Static330.aClass18_3, Static299.aClass21_87.method362(Static168.anInt3290) + "<br>(100%)");
		}
		Static256.method4185();
		Static72.method1587();
		@Pc(381) boolean local381 = false;
		if (Static30.aClass30_3.method2101() && Static157.aClass185_Sub1_1.aBoolean397) {
			for (local266 = 0; local266 < Static353.aByteArrayArray18.length; local266++) {
				if (Static256.aByteArrayArray15[local266] != null || Static164.aByteArrayArray14[local266] != null) {
					local381 = true;
					break;
				}
			}
		}
		if (Static157.aClass185_Sub1_1.aBoolean398) {
			local266 = Static330.anIntArray479[Static77.anInt1863];
		} else {
			local266 = Static336.anIntArray487[Static77.anInt1863];
		}
		if (Static30.aClass30_3.method2096()) {
			local266++;
		}
		Static254.method4163(Static193.anInt3853, Static301.anInt5585, local266, local381, Static30.aClass30_3.method2104() > 0);
		for (local277 = 0; local277 < 4; local277++) {
			Static335.aClass253Array1[local277].method5745();
		}
		Static412.method5723();
		Static383.method5404(false);
		Static437.method6004();
		Static91.aClass265_1 = null;
		Static256.method4185();
		System.gc();
		Static247.method4077(true);
		Static108.method2147();
		Static422.anInt7302 = Static157.aClass185_Sub1_1.method4630(Static192.anInt3828);
		Static290.aBoolean385 = Static157.aClass185_Sub1_1.aBoolean397;
		Static418.aBoolean196 = Static263.anInt5007 >= 96;
		Static25.aBoolean21 = Static157.aClass185_Sub1_1.method4632(Static192.anInt3828);
		Static231.aBoolean299 = !Static157.aClass185_Sub1_1.aBoolean404;
		Static462.anInt7858 = Static157.aClass185_Sub1_1.method4639(Static192.anInt3828) ? -1 : Static238.anInt4697;
		Static127.aBoolean176 = Static192.anInt3828 == 1 || Static157.aClass185_Sub1_1.aBoolean407;
		Static178.aBoolean230 = Static157.aClass185_Sub1_1.aBoolean405;
		Static272.aClass191_Sub1_1 = new Class191_Sub1(4, Static193.anInt3853, Static301.anInt5585, false);
		if (Static227.anInt4510 == 0) {
			Static270.method4893(Static272.aClass191_Sub1_1, Static353.aByteArrayArray18);
		} else {
			Static456.method6202(Static272.aClass191_Sub1_1, Static353.aByteArrayArray18);
		}
		Static347.method5058(Static193.anInt3853 >> 4, Static301.anInt5585 >> 4);
		Static143.method2618();
		if (local381) {
			Static427.method5891(true);
			Static343.aClass191_Sub1_3 = new Class191_Sub1(1, Static193.anInt3853, Static301.anInt5585, true);
			if (Static227.anInt4510 == 0) {
				Static270.method4893(Static343.aClass191_Sub1_3, Static164.aByteArrayArray14);
				Static247.method4077(true);
			} else {
				Static456.method6202(Static343.aClass191_Sub1_3, Static164.aByteArrayArray14);
				Static247.method4077(true);
			}
			Static343.aClass191_Sub1_3.method5569(Static272.aClass191_Sub1_1.anIntArrayArrayArray12[0]);
			Static343.aClass191_Sub1_3.method5571(Static30.aClass30_3, null, null);
			Static427.method5891(false);
		}
		Static272.aClass191_Sub1_1.method5571(Static30.aClass30_3, Static335.aClass253Array1, local381 ? Static343.aClass191_Sub1_3.anIntArrayArrayArray12 : null);
		if (Static227.anInt4510 == 0) {
			Static247.method4077(true);
			Static109.method2169(Static8.aByteArrayArray2, Static272.aClass191_Sub1_1);
			if (Static125.aByteArrayArray9 != null) {
				Static89.method1785();
			}
		} else {
			Static247.method4077(true);
			Static226.method3854(Static8.aByteArrayArray2, Static272.aClass191_Sub1_1);
		}
		Static72.method1587();
		Static247.method4077(true);
		Static272.aClass191_Sub1_1.method5575(local381 ? Static77.aClass14Array1[0] : null, null, Static30.aClass30_3);
		Static272.aClass191_Sub1_1.method5584(Static30.aClass30_3);
		Static247.method4077(true);
		if (local381) {
			Static427.method5891(true);
			Static247.method4077(true);
			if (Static227.anInt4510 == 0) {
				Static109.method2169(Static256.aByteArrayArray15, Static343.aClass191_Sub1_3);
			} else {
				Static226.method3854(Static256.aByteArrayArray15, Static343.aClass191_Sub1_3);
			}
			Static72.method1587();
			Static247.method4077(true);
			Static343.aClass191_Sub1_3.method5575(null, Static267.aClass14Array2[0], Static30.aClass30_3);
			Static343.aClass191_Sub1_3.method5584(Static30.aClass30_3);
			Static247.method4077(true);
			Static427.method5891(false);
		}
		Static267.method4288();
		@Pc(717) int local717 = Static272.aClass191_Sub1_1.anInt6986;
		if (Static59.anInt1472 < local717) {
			local717 = Static59.anInt1472;
		}
		if (local717 < Static59.anInt1472 - 1) {
			local717 = Static59.anInt1472 - 1;
		}
		if (Static157.aClass185_Sub1_1.method4639(Static192.anInt3828)) {
			Static63.method1458(0);
		} else {
			Static63.method1458(local717);
		}
		@Pc(752) int local752;
		@Pc(756) int local756;
		for (@Pc(748) int local748 = 0; local748 < 4; local748++) {
			for (local752 = 0; local752 < Static193.anInt3853; local752++) {
				for (local756 = 0; local756 < Static301.anInt5585; local756++) {
					Static365.method5225(local752, local748, local756);
				}
			}
		}
		Static396.method5596();
		Static256.method4185();
		Static349.method5088();
		Static72.method1587();
		Static427.aBoolean539 = false;
		Static323.method2077();
		if (Static97.aFrame1 != null && Static172.aClass13_1 != null && Static70.anInt1726 == 10) {
			Static448.method6134(Static74.aClass212_18);
			Static457.aClass4_Sub20_Sub1_5.method4561(1057001181);
		}
		if (Static227.anInt4510 == 0) {
			local752 = (Static245.anInt4783 - (Static193.anInt3853 >> 4)) / 8;
			local756 = (Static245.anInt4783 + (Static193.anInt3853 >> 4)) / 8;
			@Pc(845) int local845 = (Static462.anInt7854 - (Static301.anInt5585 >> 4)) / 8;
			@Pc(853) int local853 = (Static462.anInt7854 + (Static301.anInt5585 >> 4)) / 8;
			for (@Pc(857) int local857 = local752 - 1; local857 <= local756 + 1; local857++) {
				for (@Pc(863) int local863 = local845 - 1; local863 <= local853 + 1; local863++) {
					if (local752 > local857 || local857 > local756 || local845 > local863 || local863 > local853) {
						Static30.aClass38_8.method1017("m" + local857 + "_" + local863);
						Static30.aClass38_8.method1017("l" + local857 + "_" + local863);
					}
				}
			}
		}
		if (Static70.anInt1726 == 3) {
			Static382.method3540(2);
		} else if (Static70.anInt1726 == 7) {
			Static382.method3540(6);
		} else {
			Static382.method3540(9);
			if (Static172.aClass13_1 != null) {
				Static448.method6134(Static291.aClass212_70);
			}
		}
		Static35.method513();
		Static256.method4185();
		Static32.method454();
	}
}
