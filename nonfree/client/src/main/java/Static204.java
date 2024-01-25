import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!mn", name = "G", descriptor = "[I")
	public static final int[] anIntArray557 = new int[25];

	@OriginalMember(owner = "client!mn", name = "M", descriptor = "I")
	public static int anInt4042 = 0;

	@OriginalMember(owner = "client!mn", name = "V", descriptor = "Z")
	public static boolean aBoolean315 = false;

	@OriginalMember(owner = "client!mn", name = "f", descriptor = "(B)V")
	public static void method3620() {
		Static218.method3853(false);
		Static254.anInt4941 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static75.aByteArrayArray7.length; local14++) {
			if (Static54.anIntArray214[local14] != -1 && Static75.aByteArrayArray7[local14] == null) {
				Static75.aByteArrayArray7[local14] = Static87.aClass180_80.method4560(0, Static54.anIntArray214[local14]);
				if (Static75.aByteArrayArray7[local14] == null) {
					Static254.anInt4941++;
					local12 = false;
				}
			}
			if (Static222.anIntArray601[local14] != -1 && Static58.aByteArrayArray6[local14] == null) {
				Static58.aByteArrayArray6[local14] = Static87.aClass180_80.method4566(0, Static154.anIntArrayArray25[local14], Static222.anIntArray601[local14]);
				if (Static58.aByteArrayArray6[local14] == null) {
					Static254.anInt4941++;
					local12 = false;
				}
			}
			if (Static321.anIntArray779[local14] != -1 && Static248.aByteArrayArray16[local14] == null) {
				Static248.aByteArrayArray16[local14] = Static87.aClass180_80.method4560(0, Static321.anIntArray779[local14]);
				if (Static248.aByteArrayArray16[local14] == null) {
					Static254.anInt4941++;
					local12 = false;
				}
			}
			if (Static228.anIntArray614[local14] != -1 && Static121.aByteArrayArray8[local14] == null) {
				Static121.aByteArrayArray8[local14] = Static87.aClass180_80.method4560(0, Static228.anIntArray614[local14]);
				if (Static121.aByteArrayArray8[local14] == null) {
					local12 = false;
					Static254.anInt4941++;
				}
			}
			if (Static65.anIntArray235 != null && Static5.aByteArrayArray3[local14] == null && Static65.anIntArray235[local14] != -1) {
				Static5.aByteArrayArray3[local14] = Static87.aClass180_80.method4566(0, Static154.anIntArrayArray25[local14], Static65.anIntArray235[local14]);
				if (Static5.aByteArrayArray3[local14] == null) {
					Static254.anInt4941++;
					local12 = false;
				}
			}
		}
		if (Static275.aClass134_3 == null) {
			if (Static207.aClass7_Sub1_Sub10_3 == null || !Static87.aClass180_81.method4574(Static207.aClass7_Sub1_Sub10_3.aString174 + "_staticelements")) {
				Static275.aClass134_3 = new Class134(0);
			} else if (Static87.aClass180_81.method4559(Static207.aClass7_Sub1_Sub10_3.aString174 + "_staticelements")) {
				Static275.aClass134_3 = Static225.method3957(Static207.aClass7_Sub1_Sub10_3.aString174 + "_staticelements", aBoolean315, Static87.aClass180_81);
			} else {
				local12 = false;
				Static254.anInt4941++;
			}
		}
		if (!local12) {
			Static309.anInt5898 = 1;
			return;
		}
		local12 = true;
		Static323.anInt6142 = 0;
		@Pc(268) int local268;
		@Pc(279) int local279;
		for (@Pc(249) int local249 = 0; local249 < Static75.aByteArrayArray7.length; local249++) {
			@Pc(255) byte[] local255 = Static58.aByteArrayArray6[local249];
			if (local255 != null) {
				local268 = (Static94.anIntArray311[local249] >> 8) * 64 - Static350.anInt6609;
				local279 = (Static94.anIntArray311[local249] & 0xFF) * 64 - Static237.anInt4696;
				if (Static336.aBoolean324) {
					local279 = 10;
					local268 = 10;
				}
				local12 &= Static327.method5240(local279, local255, local268);
			}
			local255 = Static121.aByteArrayArray8[local249];
			if (local255 != null) {
				local268 = (Static94.anIntArray311[local249] >> 8) * 64 - Static350.anInt6609;
				local279 = (Static94.anIntArray311[local249] & 0xFF) * 64 - Static237.anInt4696;
				if (Static336.aBoolean324) {
					local279 = 10;
					local268 = 10;
				}
				local12 &= Static327.method5240(local279, local255, local268);
			}
		}
		if (!local12) {
			Static309.anInt5898 = 2;
			return;
		}
		if (Static309.anInt5898 != 0) {
			Static227.method5321(Static341.aClass94_32, Static35.aString79 + "<br>(100%)", true);
		}
		Static263.method4429();
		Static143.method3641();
		@Pc(368) boolean local368 = false;
		if (Static128.aClass89_3.method5445() && Static140.aBoolean228) {
			for (local268 = 0; local268 < Static75.aByteArrayArray7.length; local268++) {
				if (Static121.aByteArrayArray8[local268] != null || Static248.aByteArrayArray16[local268] != null) {
					local368 = true;
					break;
				}
			}
		}
		if (Static296.aBoolean432) {
			local268 = Static336.anIntArray571[Static343.anInt6504];
		} else {
			local268 = Static61.anIntArray230[Static343.anInt6504];
		}
		if (Static128.aClass89_3.method5476()) {
			local268++;
		}
		Static301.method4874(Static15.anInt287, Static325.anInt6173, local268, local368, Static128.aClass89_3.method5419() > 0);
		for (local279 = 0; local279 < 4; local279++) {
			Static327.aClass149Array1[local279].method3954();
		}
		Static125.method2597();
		Static163.method3111(false);
		Static29.method512();
		Static263.method4429();
		System.gc();
		Static218.method3853(true);
		Static239.method4107(4);
		@Pc(456) int[][] local456 = null;
		if (!Static336.aBoolean324) {
			Static258.method4343(false);
			Static128.method2627(Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray665[0] >> 3, Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray666[0] >> 3);
			Static212.method3771();
			Static307.method4977(null, 4, Static128.aClass89_3, false);
			local456 = Static23.anIntArrayArrayArray15[0];
			Static218.method3853(true);
			Static116.method2470(false);
			if (Static5.aByteArrayArray3 != null) {
				Static286.method4741();
			}
		}
		if (Static336.aBoolean324) {
			Static255.method3333(false);
			Static128.method2627(Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray665[0] >> 3, Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray666[0] >> 3);
			Static212.method3771();
			Static307.method4977(null, 4, Static128.aClass89_3, false);
			local456 = Static23.anIntArrayArrayArray15[0];
			Static218.method3853(true);
			Static308.method5000(false);
		}
		Static143.method3641();
		Static218.method3853(true);
		Static24.method420(Static327.aClass149Array1, Static128.aClass89_3, 4, false, null);
		Static259.method4354(Static128.aClass89_3, 4);
		Static218.method3853(true);
		@Pc(555) int local555 = Static45.anInt1289;
		if (local555 > Static168.anInt3508) {
			local555 = Static168.anInt3508;
		}
		if (Static168.anInt3508 - 1 > local555) {
			local555 = Static168.anInt3508 - 1;
		}
		if (Static105.method5089()) {
			Static113.method2183(0);
		} else {
			Static113.method2183(local555);
		}
		Static189.method3442();
		if (local368) {
			Static143.method3640(true);
			Static239.method4107(1);
			if (!Static336.aBoolean324) {
				Static258.method4343(true);
				Static307.method4977(local456, 1, Static128.aClass89_3, true);
				Static218.method3853(true);
				Static116.method2470(true);
				Static259.method4354(Static128.aClass89_3, 1);
			}
			if (Static336.aBoolean324) {
				Static255.method3333(true);
				Static307.method4977(local456, 1, Static128.aClass89_3, true);
				Static218.method3853(true);
				Static308.method5000(true);
			}
			Static143.method3641();
			Static218.method3853(true);
			Static24.method420(Static327.aClass149Array1, Static128.aClass89_3, 1, true, Static136.aClass8Array3[0]);
			Static259.method4354(Static128.aClass89_3, 1);
			Static218.method3853(true);
			Static189.method3442();
			Static143.method3640(false);
		}
		@Pc(672) int local672;
		@Pc(676) int local676;
		for (@Pc(668) int local668 = 0; local668 < 3; local668++) {
			for (local672 = 0; local672 < Static15.anInt287; local672++) {
				for (local676 = 0; local676 < Static325.anInt6173; local676++) {
					Static154.method2995(local676, local668, local672);
				}
			}
		}
		Static268.method4484();
		Static263.method4429();
		Static55.method1159();
		Static143.method3641();
		Static62.aBoolean119 = false;
		Static77.method1573();
		if (Static212.aFrame1 != null && Static193.aClass61_1 != null && Static85.anInt2215 == 25) {
			Static29.aClass7_Sub3_Sub2_1.method2799(102);
			Static29.aClass7_Sub3_Sub2_1.method2765(1057001181);
		}
		if (!Static336.aBoolean324) {
			local672 = (Static101.anInt2445 - (Static15.anInt287 >> 4)) / 8;
			local676 = ((Static15.anInt287 >> 4) + Static101.anInt2445) / 8;
			@Pc(760) int local760 = (Static237.anInt4697 - (Static325.anInt6173 >> 4)) / 8;
			@Pc(768) int local768 = ((Static325.anInt6173 >> 4) + Static237.anInt4697) / 8;
			for (@Pc(772) int local772 = local672 - 1; local772 <= local676 + 1; local772++) {
				for (@Pc(778) int local778 = local760 - 1; local778 <= local768 + 1; local778++) {
					if (local772 < local672 || local772 > local676 || local760 > local778 || local778 > local768) {
						Static87.aClass180_80.method4585("m" + local772 + "_" + local778);
						Static87.aClass180_80.method4585("l" + local772 + "_" + local778);
					}
				}
			}
		}
		if (Static85.anInt2215 == 28) {
			Static82.method1759(10);
		} else {
			Static82.method1759(30);
			if (Static193.aClass61_1 != null) {
				Static29.aClass7_Sub3_Sub2_1.method2799(156);
			}
		}
		Static55.method1164();
		Static263.method4429();
		Static57.method1170();
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IZ)Lclient!tp;")
	public static Class195 method3621(@OriginalArg(0) int arg0) {
		@Pc(10) Class195 local10 = (Class195) Static69.aClass103_17.method2682((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(29) byte[] local29 = Static157.aClass180_43.method4560(arg0, 29);
		local10 = new Class195();
		if (local29 != null) {
			local10.method5006(arg0, new Class7_Sub3(local29));
		}
		Static69.aClass103_17.method2687(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method3622(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			Static29.aClass7_Sub3_Sub2_1.method2799(175);
			Static29.aClass7_Sub3_Sub2_1.method2735(Static344.method5559(arg0));
			Static29.aClass7_Sub3_Sub2_1.method2738(arg0);
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IBIII)V")
	public static void method3623(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1) {
		Static142.anInt3103 = 0;
		Static61.anInt1534 = 0;
		Static168.anInt3509 = arg1;
		Static314.anInt6030 = arg0;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(II[BB)I")
	public static int method3624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(5) int local5 = -1;
		for (@Pc(12) int local12 = arg1; local12 < arg0; local12++) {
			local5 = Class113.anIntArray429[(local5 ^ arg2[local12]) & 0xFF] ^ local5 >>> 8;
		}
		return ~local5;
	}
}
