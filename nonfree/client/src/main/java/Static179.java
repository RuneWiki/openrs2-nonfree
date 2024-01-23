import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!rj", name = "z", descriptor = "[I")
	public static int[] anIntArray298;

	@OriginalMember(owner = "client!rj", name = "u", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1347 = Static64.method1101(" )2>");

	@OriginalMember(owner = "client!rj", name = "A", descriptor = "[I")
	public static int[] anIntArray299 = new int[500];

	@OriginalMember(owner = "client!rj", name = "E", descriptor = "I")
	public static int anInt3918 = 0;

	@OriginalMember(owner = "client!rj", name = "F", descriptor = "I")
	public static int anInt3919 = 0;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILclient!ia;IIJIB)V")
	public static void method3038(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) long arg4, @OriginalArg(5) int arg5) {
		Static165.method2812();
		@Pc(10) Class1_Sub16 local10 = new Class1_Sub16(128);
		local10.method3765(10);
		local10.method3807((int) (Math.random() * 99999.0D));
		local10.method3807(503);
		local10.method3786(arg4);
		local10.method3808((int) (Math.random() * 9.9999999E7D));
		local10.method3810(arg1);
		local10.method3808((int) (Math.random() * 9.9999999E7D));
		local10.method3807(Static14.anInt340);
		local10.method3765(arg0);
		local10.method3765(arg5);
		local10.method3808((int) (Math.random() * 9.9999999E7D));
		local10.method3807(arg3);
		local10.method3807(arg2);
		local10.method3808((int) (Math.random() * 9.9999999E7D));
		local10.method3780(Static66.aBigInteger4, Static58.aBigInteger3);
		Static167.aClass1_Sub16_Sub1_2.anInt4860 = 0;
		Static167.aClass1_Sub16_Sub1_2.method3765(216);
		Static167.aClass1_Sub16_Sub1_2.method3765(local10.anInt4860);
		Static167.aClass1_Sub16_Sub1_2.method3774(local10.anInt4860, local10.aByteArray62);
		Static107.anInt2390 = 1;
		Static176.anInt3867 = 3;
	}

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "(II)V")
	public static void method3039(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(13) int local13 = Static185.anIntArray302[arg0];
		@Pc(17) int local17 = anIntArray299[arg0];
		@Pc(21) int local21 = Static227.aShortArray59[arg0];
		@Pc(26) int local26 = (int) Static19.aLongArray12[arg0];
		@Pc(30) long local30 = Static19.aLongArray12[arg0];
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(65) boolean local65;
		if (local21 == 48) {
			local65 = Static124.method3511(Static73.aClass5_Sub1_Sub1_1.anIntArray233[0], local13, 0, 0, 0, local17, Static73.aClass5_Sub1_Sub1_1.anIntArray238[0], 0, false, 2, 0);
			if (!local65) {
				Static124.method3511(Static73.aClass5_Sub1_Sub1_1.anIntArray233[0], local13, 0, 1, 0, local17, Static73.aClass5_Sub1_Sub1_1.anIntArray238[0], 0, false, 2, 1);
			}
			Static160.anInt3453 = Static148.anInt3214;
			Static68.anInt1547 = 2;
			Static12.anInt320 = 0;
			Static83.anInt1948 = Static106.anInt2346;
			Static167.aClass1_Sub16_Sub1_2.method3823(48);
			Static167.aClass1_Sub16_Sub1_2.method3807(Static198.anInt4217 + local13);
			Static167.aClass1_Sub16_Sub1_2.method3807(local17 + Static118.anInt2541);
			Static167.aClass1_Sub16_Sub1_2.method3760(local26);
		}
		if (local21 == 47) {
			Static75.method884(local13, local30, local17);
			Static167.aClass1_Sub16_Sub1_2.method3823(23);
			Static167.aClass1_Sub16_Sub1_2.method3760(Static198.anInt4217 + local13);
			Static167.aClass1_Sub16_Sub1_2.method3760(Static118.anInt2541 + local17);
			Static167.aClass1_Sub16_Sub1_2.method3807((int) (local30 >>> 32) & Integer.MAX_VALUE);
		}
		if (local21 == 57) {
			Static167.aClass1_Sub16_Sub1_2.method3823(240);
			Static167.aClass1_Sub16_Sub1_2.method3808(local17);
			Static167.aClass1_Sub16_Sub1_2.method3807(local13);
			Static167.aClass1_Sub16_Sub1_2.method3796(local26);
			Static61.anInt1427 = 0;
			Static61.aClass71_13 = Static7.method102(local17);
			Static202.anInt4286 = local13;
		}
		if (local21 == 24) {
			Static167.aClass1_Sub16_Sub1_2.method3823(127);
			Static167.aClass1_Sub16_Sub1_2.method3772(Static76.anInt1699);
			Static167.aClass1_Sub16_Sub1_2.method3760(Static211.anInt4507);
			Static167.aClass1_Sub16_Sub1_2.method3760(local13);
			Static167.aClass1_Sub16_Sub1_2.method3760(local26);
			Static167.aClass1_Sub16_Sub1_2.method3813(local17);
			Static61.anInt1427 = 0;
			Static61.aClass71_13 = Static7.method102(local17);
			Static202.anInt4286 = local13;
		}
		@Pc(236) Class5_Sub1_Sub1 local236;
		if (local21 == 18) {
			local236 = Static191.aClass5_Sub1_Sub1Array1[local26];
			if (local236 != null) {
				Static124.method3511(Static73.aClass5_Sub1_Sub1_1.anIntArray233[0], local236.anIntArray238[0], 0, 1, 0, local236.anIntArray233[0], Static73.aClass5_Sub1_Sub1_1.anIntArray238[0], 0, false, 2, 1);
				Static12.anInt320 = 0;
				Static68.anInt1547 = 2;
				Static160.anInt3453 = Static148.anInt3214;
				Static83.anInt1948 = Static106.anInt2346;
				Static167.aClass1_Sub16_Sub1_2.method3823(205);
				Static167.aClass1_Sub16_Sub1_2.method3807(local26);
			}
		}
		@Pc(295) Class71 local295;
		if (local21 == 32) {
			Static118.method1949();
			local295 = Static7.method102(local17);
			Static54.anInt1264 = 1;
			Static52.anInt1233 = local13;
			Static123.anInt2714 = local26;
			Static143.anInt3141 = local17;
			Static82.method1438(local295);
			Static87.aClass51_640 = Static150.method2574(new Class51[] { Static134.aClass51_1061, Static36.method637(local26).aClass51_1254, Static42.aClass51_1653 });
			if (Static87.aClass51_640 == null) {
				Static87.aClass51_640 = Static110.aClass51_423;
			}
			return;
		}
		if (local21 == 1003) {
			local295 = Static7.method102(local17);
			if (local295 == null || local295.anIntArray184[local13] < 100000) {
				Static167.aClass1_Sub16_Sub1_2.method3823(193);
				Static167.aClass1_Sub16_Sub1_2.method3807(local26);
			} else {
				Static164.method2798(0, Static150.method2574(new Class51[] { Static27.method511(local295.anIntArray184[local13]), Static105.aClass51_768, Static36.method637(local26).aClass51_1254 }), Static81.aClass51_607);
			}
			Static61.anInt1427 = 0;
			Static61.aClass71_13 = Static7.method102(local17);
			Static202.anInt4286 = local13;
		}
		if (local21 == 2) {
			local65 = Static124.method3511(Static73.aClass5_Sub1_Sub1_1.anIntArray233[0], local13, 0, 0, 0, local17, Static73.aClass5_Sub1_Sub1_1.anIntArray238[0], 0, false, 2, 0);
			if (!local65) {
				Static124.method3511(Static73.aClass5_Sub1_Sub1_1.anIntArray233[0], local13, 0, 1, 0, local17, Static73.aClass5_Sub1_Sub1_1.anIntArray238[0], 0, false, 2, 1);
			}
			Static68.anInt1547 = 2;
			Static160.anInt3453 = Static148.anInt3214;
			Static83.anInt1948 = Static106.anInt2346;
			Static12.anInt320 = 0;
			Static167.aClass1_Sub16_Sub1_2.method3823(144);
			Static167.aClass1_Sub16_Sub1_2.method3796(local26);
			Static167.aClass1_Sub16_Sub1_2.method3789(Static198.anInt4217 + local13);
			Static167.aClass1_Sub16_Sub1_2.method3789(Static118.anInt2541 + local17);
		}
		if (local21 == 26) {
			local236 = Static191.aClass5_Sub1_Sub1Array1[local26];
			if (local236 != null) {
				Static124.method3511(Static73.aClass5_Sub1_Sub1_1.anIntArray233[0], local236.anIntArray238[0], 0, 1, 0, local236.anIntArray233[0], Static73.aClass5_Sub1_Sub1_1.anIntArray238[0], 0, false, 2, 1);
				Static68.anInt1547 = 2;
				Static83.anInt1948 = Static106.anInt2346;
				Static160.anInt3453 = Static148.anInt3214;
				Static12.anInt320 = 0;
				Static167.aClass1_Sub16_Sub1_2.method3823(95);
				Static167.aClass1_Sub16_Sub1_2.method3796(local26);
			}
		}
		@Pc(571) int local571;
		if (local21 == 50) {
			Static167.aClass1_Sub16_Sub1_2.method3823(147);
			Static167.aClass1_Sub16_Sub1_2.method3808(local17);
			local295 = Static7.method102(local17);
			if (local295.anIntArrayArray16 != null && local295.anIntArrayArray16[0][0] == 5) {
				local571 = local295.anIntArrayArray16[0][1];
				Static86.anIntArray125[local571] = 1 - Static86.anIntArray125[local571];
				Static99.method1646(local571);
			}
		}
		if (local21 == 20 && Static75.method884(local13, local30, local17)) {
			Static167.aClass1_Sub16_Sub1_2.method3823(254);
			Static167.aClass1_Sub16_Sub1_2.method3796(Static211.anInt4507);
			Static167.aClass1_Sub16_Sub1_2.method3789(local17 + Static118.anInt2541);
			Static167.aClass1_Sub16_Sub1_2.method3789((int) (local30 >>> 32) & Integer.MAX_VALUE);
			Static167.aClass1_Sub16_Sub1_2.method3807(local13 + Static198.anInt4217);
			Static167.aClass1_Sub16_Sub1_2.method3815(Static76.anInt1699);
		}
		if (local21 == 33) {
			local236 = Static191.aClass5_Sub1_Sub1Array1[local26];
			if (local236 != null) {
				Static124.method3511(Static73.aClass5_Sub1_Sub1_1.anIntArray233[0], local236.anIntArray238[0], 0, 1, 0, local236.anIntArray233[0], Static73.aClass5_Sub1_Sub1_1.anIntArray238[0], 0, false, 2, 1);
				Static160.anInt3453 = Static148.anInt3214;
				Static68.anInt1547 = 2;
				Static83.anInt1948 = Static106.anInt2346;
				Static12.anInt320 = 0;
				Static167.aClass1_Sub16_Sub1_2.method3823(198);
				Static167.aClass1_Sub16_Sub1_2.method3807(local26);
				Static167.aClass1_Sub16_Sub1_2.method3789(Static123.anInt2714);
				Static167.aClass1_Sub16_Sub1_2.method3789(Static52.anInt1233);
				Static167.aClass1_Sub16_Sub1_2.method3813(Static143.anInt3141);
			}
		}
		if (local21 == 49) {
			local236 = Static191.aClass5_Sub1_Sub1Array1[local26];
			if (local236 != null) {
				Static124.method3511(Static73.aClass5_Sub1_Sub1_1.anIntArray233[0], local236.anIntArray238[0], 0, 1, 0, local236.anIntArray233[0], Static73.aClass5_Sub1_Sub1_1.anIntArray238[0], 0, false, 2, 1);
				Static83.anInt1948 = Static106.anInt2346;
				Static12.anInt320 = 0;
				Static160.anInt3453 = Static148.anInt3214;
				Static68.anInt1547 = 2;
				Static167.aClass1_Sub16_Sub1_2.method3823(224);
				Static167.aClass1_Sub16_Sub1_2.method3760(local26);
			}
		}
		if (local21 == 28) {
			Static75.method884(local13, local30, local17);
			Static167.aClass1_Sub16_Sub1_2.method3823(27);
			Static167.aClass1_Sub16_Sub1_2.method3807((int) (local30 >>> 32) & Integer.MAX_VALUE);
			Static167.aClass1_Sub16_Sub1_2.method3789(local17 + Static118.anInt2541);
			Static167.aClass1_Sub16_Sub1_2.method3807(local13 + Static198.anInt4217);
		}
		if (local21 == 29) {
			Static167.aClass1_Sub16_Sub1_2.method3823(164);
			Static167.aClass1_Sub16_Sub1_2.method3813(local17);
			Static167.aClass1_Sub16_Sub1_2.method3807(local26);
			Static167.aClass1_Sub16_Sub1_2.method3760(local13);
			Static61.anInt1427 = 0;
			Static61.aClass71_13 = Static7.method102(local17);
			Static202.anInt4286 = local13;
		}
		if (local21 == 21) {
			local236 = Static191.aClass5_Sub1_Sub1Array1[local26];
			if (local236 != null) {
				Static124.method3511(Static73.aClass5_Sub1_Sub1_1.anIntArray233[0], local236.anIntArray238[0], 0, 1, 0, local236.anIntArray233[0], Static73.aClass5_Sub1_Sub1_1.anIntArray238[0], 0, false, 2, 1);
				Static83.anInt1948 = Static106.anInt2346;
				Static160.anInt3453 = Static148.anInt3214;
				Static68.anInt1547 = 2;
				Static12.anInt320 = 0;
				Static167.aClass1_Sub16_Sub1_2.method3823(170);
				Static167.aClass1_Sub16_Sub1_2.method3796(local26);
			}
		}
		if (local21 == 14) {
			local65 = Static124.method3511(Static73.aClass5_Sub1_Sub1_1.anIntArray233[0], local13, 0, 0, 0, local17, Static73.aClass5_Sub1_Sub1_1.anIntArray238[0], 0, false, 2, 0);
			if (!local65) {
				Static124.method3511(Static73.aClass5_Sub1_Sub1_1.anIntArray233[0], local13, 0, 1, 0, local17, Static73.aClass5_Sub1_Sub1_1.anIntArray238[0], 0, false, 2, 1);
			}
			Static160.anInt3453 = Static148.anInt3214;
			Static12.anInt320 = 0;
			Static83.anInt1948 = Static106.anInt2346;
			Static68.anInt1547 = 2;
			Static167.aClass1_Sub16_Sub1_2.method3823(231);
			Static167.aClass1_Sub16_Sub1_2.method3760(local17 + Static118.anInt2541);
			Static167.aClass1_Sub16_Sub1_2.method3807(local26);
			Static167.aClass1_Sub16_Sub1_2.method3807(Static198.anInt4217 + local13);
		}
		@Pc(975) Class5_Sub1_Sub2 local975;
		if (local21 == 10) {
			local975 = Static168.aClass5_Sub1_Sub2Array1[local26];
			if (local975 != null) {
				Static124.method3511(Static73.aClass5_Sub1_Sub1_1.anIntArray233[0], local975.anIntArray238[0], 0, 1, 0, local975.anIntArray233[0], Static73.aClass5_Sub1_Sub1_1.anIntArray238[0], 0, false, 2, 1);
				Static68.anInt1547 = 2;
				Static83.anInt1948 = Static106.anInt2346;
				Static12.anInt320 = 0;
				Static160.anInt3453 = Static148.anInt3214;
				Static167.aClass1_Sub16_Sub1_2.method3823(238);
				Static167.aClass1_Sub16_Sub1_2.method3796(local26);
			}
		}
		if (local21 == 36) {
			Static167.aClass1_Sub16_Sub1_2.method3823(135);
			Static167.aClass1_Sub16_Sub1_2.method3813(local17);
			Static167.aClass1_Sub16_Sub1_2.method3760(local13);
			Static167.aClass1_Sub16_Sub1_2.method3760(local26);
			Static61.anInt1427 = 0;
			Static61.aClass71_13 = Static7.method102(local17);
			Static202.anInt4286 = local13;
		}
		if (local21 == 7) {
			Static75.method884(local13, local30, local17);
			Static167.aClass1_Sub16_Sub1_2.method3823(129);
			Static167.aClass1_Sub16_Sub1_2.method3789(Integer.MAX_VALUE & (int) (local30 >>> 32));
			Static167.aClass1_Sub16_Sub1_2.method3796(local13 + Static198.anInt4217);
			Static167.aClass1_Sub16_Sub1_2.method3789(local17 + Static118.anInt2541);
		}
		if (local21 == 13) {
			Static167.aClass1_Sub16_Sub1_2.method3823(181);
			Static167.aClass1_Sub16_Sub1_2.method3772(local17);
			Static167.aClass1_Sub16_Sub1_2.method3796(local13);
			Static167.aClass1_Sub16_Sub1_2.method3807(local26);
			Static61.anInt1427 = 0;
			Static61.aClass71_13 = Static7.method102(local17);
			Static202.anInt4286 = local13;
		}
		if (local21 == 42) {
			Static167.aClass1_Sub16_Sub1_2.method3823(210);
			Static167.aClass1_Sub16_Sub1_2.method3807(local13);
			Static167.aClass1_Sub16_Sub1_2.method3815(local17);
			Static167.aClass1_Sub16_Sub1_2.method3796(local26);
			Static61.anInt1427 = 0;
			Static61.aClass71_13 = Static7.method102(local17);
			Static202.anInt4286 = local13;
		}
		if (local21 == 5) {
			local975 = Static168.aClass5_Sub1_Sub2Array1[local26];
			if (local975 != null) {
				Static124.method3511(Static73.aClass5_Sub1_Sub1_1.anIntArray233[0], local975.anIntArray238[0], 0, 1, 0, local975.anIntArray233[0], Static73.aClass5_Sub1_Sub1_1.anIntArray238[0], 0, false, 2, 1);
				Static83.anInt1948 = Static106.anInt2346;
				Static68.anInt1547 = 2;
				Static12.anInt320 = 0;
				Static160.anInt3453 = Static148.anInt3214;
				Static167.aClass1_Sub16_Sub1_2.method3823(52);
				Static167.aClass1_Sub16_Sub1_2.method3796(local26);
				Static167.aClass1_Sub16_Sub1_2.method3772(Static143.anInt3141);
				Static167.aClass1_Sub16_Sub1_2.method3807(Static123.anInt2714);
				Static167.aClass1_Sub16_Sub1_2.method3796(Static52.anInt1233);
			}
		}
		if (local21 == 34) {
			Static167.aClass1_Sub16_Sub1_2.method3823(136);
			Static167.aClass1_Sub16_Sub1_2.method3813(Static76.anInt1699);
			Static167.aClass1_Sub16_Sub1_2.method3796(local13);
			Static167.aClass1_Sub16_Sub1_2.method3807(Static211.anInt4507);
			Static167.aClass1_Sub16_Sub1_2.method3815(local17);
		}
		if (local21 == 12 && Static75.method884(local13, local30, local17)) {
			Static167.aClass1_Sub16_Sub1_2.method3823(105);
			Static167.aClass1_Sub16_Sub1_2.method3789(local13 + Static198.anInt4217);
			Static167.aClass1_Sub16_Sub1_2.method3807(Static118.anInt2541 + local17);
			Static167.aClass1_Sub16_Sub1_2.method3789(Integer.MAX_VALUE & (int) (local30 >>> 32));
			Static167.aClass1_Sub16_Sub1_2.method3796(Static123.anInt2714);
			Static167.aClass1_Sub16_Sub1_2.method3808(Static143.anInt3141);
			Static167.aClass1_Sub16_Sub1_2.method3807(Static52.anInt1233);
		}
		if (local21 == 4) {
			local236 = Static191.aClass5_Sub1_Sub1Array1[local26];
			if (local236 != null) {
				Static124.method3511(Static73.aClass5_Sub1_Sub1_1.anIntArray233[0], local236.anIntArray238[0], 0, 1, 0, local236.anIntArray233[0], Static73.aClass5_Sub1_Sub1_1.anIntArray238[0], 0, false, 2, 1);
				Static12.anInt320 = 0;
				Static160.anInt3453 = Static148.anInt3214;
				Static83.anInt1948 = Static106.anInt2346;
				Static68.anInt1547 = 2;
				Static167.aClass1_Sub16_Sub1_2.method3823(255);
				Static167.aClass1_Sub16_Sub1_2.method3760(local26);
			}
		}
		if (local21 == 37) {
			local65 = Static124.method3511(Static73.aClass5_Sub1_Sub1_1.anIntArray233[0], local13, 0, 0, 0, local17, Static73.aClass5_Sub1_Sub1_1.anIntArray238[0], 0, false, 2, 0);
			if (!local65) {
				Static124.method3511(Static73.aClass5_Sub1_Sub1_1.anIntArray233[0], local13, 0, 1, 0, local17, Static73.aClass5_Sub1_Sub1_1.anIntArray238[0], 0, false, 2, 1);
			}
			Static12.anInt320 = 0;
			Static83.anInt1948 = Static106.anInt2346;
			Static68.anInt1547 = 2;
			Static160.anInt3453 = Static148.anInt3214;
			Static167.aClass1_Sub16_Sub1_2.method3823(106);
			Static167.aClass1_Sub16_Sub1_2.method3760(local13 + Static198.anInt4217);
			Static167.aClass1_Sub16_Sub1_2.method3807(local26);
			Static167.aClass1_Sub16_Sub1_2.method3796(local17 + Static118.anInt2541);
		}
		if (local21 == 1) {
			local975 = Static168.aClass5_Sub1_Sub2Array1[local26];
			if (local975 != null) {
				Static124.method3511(Static73.aClass5_Sub1_Sub1_1.anIntArray233[0], local975.anIntArray238[0], 0, 1, 0, local975.anIntArray233[0], Static73.aClass5_Sub1_Sub1_1.anIntArray238[0], 0, false, 2, 1);
				Static160.anInt3453 = Static148.anInt3214;
				Static68.anInt1547 = 2;
				Static83.anInt1948 = Static106.anInt2346;
				Static12.anInt320 = 0;
				Static167.aClass1_Sub16_Sub1_2.method3823(122);
				Static167.aClass1_Sub16_Sub1_2.method3760(local26);
			}
		}
		if (local21 == 31) {
			local236 = Static191.aClass5_Sub1_Sub1Array1[local26];
			if (local236 != null) {
				Static124.method3511(Static73.aClass5_Sub1_Sub1_1.anIntArray233[0], local236.anIntArray238[0], 0, 1, 0, local236.anIntArray233[0], Static73.aClass5_Sub1_Sub1_1.anIntArray238[0], 0, false, 2, 1);
				Static12.anInt320 = 0;
				Static160.anInt3453 = Static148.anInt3214;
				Static68.anInt1547 = 2;
				Static83.anInt1948 = Static106.anInt2346;
				Static167.aClass1_Sub16_Sub1_2.method3823(142);
				Static167.aClass1_Sub16_Sub1_2.method3796(local26);
			}
		}
		if (local21 == 23) {
			Static167.aClass1_Sub16_Sub1_2.method3823(96);
			Static167.aClass1_Sub16_Sub1_2.method3807(local26);
			Static167.aClass1_Sub16_Sub1_2.method3807(local13);
			Static167.aClass1_Sub16_Sub1_2.method3772(local17);
			Static61.anInt1427 = 0;
			Static61.aClass71_13 = Static7.method102(local17);
			Static202.anInt4286 = local13;
		}
		if (local21 == 30) {
			Static75.method884(local13, local30, local17);
			Static167.aClass1_Sub16_Sub1_2.method3823(67);
			Static167.aClass1_Sub16_Sub1_2.method3796(Static198.anInt4217 + local13);
			Static167.aClass1_Sub16_Sub1_2.method3807((int) (local30 >>> 32) & Integer.MAX_VALUE);
			Static167.aClass1_Sub16_Sub1_2.method3807(local17 + Static118.anInt2541);
		}
		if (local21 == 58) {
			local236 = Static191.aClass5_Sub1_Sub1Array1[local26];
			if (local236 != null) {
				Static124.method3511(Static73.aClass5_Sub1_Sub1_1.anIntArray233[0], local236.anIntArray238[0], 0, 1, 0, local236.anIntArray233[0], Static73.aClass5_Sub1_Sub1_1.anIntArray238[0], 0, false, 2, 1);
				Static83.anInt1948 = Static106.anInt2346;
				Static12.anInt320 = 0;
				Static160.anInt3453 = Static148.anInt3214;
				Static68.anInt1547 = 2;
				Static167.aClass1_Sub16_Sub1_2.method3823(156);
				Static167.aClass1_Sub16_Sub1_2.method3796(Static211.anInt4507);
				Static167.aClass1_Sub16_Sub1_2.method3808(Static76.anInt1699);
				Static167.aClass1_Sub16_Sub1_2.method3807(local26);
			}
		}
		if (local21 == 41) {
			Static167.aClass1_Sub16_Sub1_2.method3823(42);
			Static167.aClass1_Sub16_Sub1_2.method3807(local13);
			Static167.aClass1_Sub16_Sub1_2.method3796(local26);
			Static167.aClass1_Sub16_Sub1_2.method3772(local17);
			Static61.anInt1427 = 0;
			Static61.aClass71_13 = Static7.method102(local17);
			Static202.anInt4286 = local13;
		}
		if (local21 == 43) {
			local236 = Static191.aClass5_Sub1_Sub1Array1[local26];
			if (local236 != null) {
				Static124.method3511(Static73.aClass5_Sub1_Sub1_1.anIntArray233[0], local236.anIntArray238[0], 0, 1, 0, local236.anIntArray233[0], Static73.aClass5_Sub1_Sub1_1.anIntArray238[0], 0, false, 2, 1);
				Static12.anInt320 = 0;
				Static83.anInt1948 = Static106.anInt2346;
				Static160.anInt3453 = Static148.anInt3214;
				Static68.anInt1547 = 2;
				Static167.aClass1_Sub16_Sub1_2.method3823(46);
				Static167.aClass1_Sub16_Sub1_2.method3807(local26);
			}
		}
		if (local21 == 16) {
			local65 = Static124.method3511(Static73.aClass5_Sub1_Sub1_1.anIntArray233[0], local13, 0, 0, 0, local17, Static73.aClass5_Sub1_Sub1_1.anIntArray238[0], 0, false, 2, 0);
			if (!local65) {
				Static124.method3511(Static73.aClass5_Sub1_Sub1_1.anIntArray233[0], local13, 0, 1, 0, local17, Static73.aClass5_Sub1_Sub1_1.anIntArray238[0], 0, false, 2, 1);
			}
			Static68.anInt1547 = 2;
			Static83.anInt1948 = Static106.anInt2346;
			Static160.anInt3453 = Static148.anInt3214;
			Static12.anInt320 = 0;
			Static167.aClass1_Sub16_Sub1_2.method3823(91);
			Static167.aClass1_Sub16_Sub1_2.method3760(Static118.anInt2541 + local17);
			Static167.aClass1_Sub16_Sub1_2.method3760(local26);
			Static167.aClass1_Sub16_Sub1_2.method3807(Static52.anInt1233);
			Static167.aClass1_Sub16_Sub1_2.method3813(Static143.anInt3141);
			Static167.aClass1_Sub16_Sub1_2.method3796(Static198.anInt4217 + local13);
			Static167.aClass1_Sub16_Sub1_2.method3760(Static123.anInt2714);
		}
		if (local21 == 3) {
			Static43.method760(Static197.anInt2422, local13, local17);
		}
		if (local21 == 1002) {
			Static160.anInt3453 = Static148.anInt3214;
			Static83.anInt1948 = Static106.anInt2346;
			Static68.anInt1547 = 2;
			Static12.anInt320 = 0;
			local975 = Static168.aClass5_Sub1_Sub2Array1[local26];
			if (local975 != null) {
				@Pc(1895) Class27 local1895 = local975.aClass27_1;
				if (local1895.anIntArray51 != null) {
					local1895 = local1895.method594();
				}
				if (local1895 != null) {
					Static167.aClass1_Sub16_Sub1_2.method3823(63);
					Static167.aClass1_Sub16_Sub1_2.method3789(local1895.anInt799);
				}
			}
		}
		if (local21 == 22) {
			local975 = Static168.aClass5_Sub1_Sub2Array1[local26];
			if (local975 != null) {
				Static124.method3511(Static73.aClass5_Sub1_Sub1_1.anIntArray233[0], local975.anIntArray238[0], 0, 1, 0, local975.anIntArray233[0], Static73.aClass5_Sub1_Sub1_1.anIntArray238[0], 0, false, 2, 1);
				Static160.anInt3453 = Static148.anInt3214;
				Static12.anInt320 = 0;
				Static83.anInt1948 = Static106.anInt2346;
				Static68.anInt1547 = 2;
				Static167.aClass1_Sub16_Sub1_2.method3823(124);
				Static167.aClass1_Sub16_Sub1_2.method3796(local26);
			}
		}
		if (local21 == 40) {
			Static167.aClass1_Sub16_Sub1_2.method3823(89);
			Static167.aClass1_Sub16_Sub1_2.method3760(local13);
			Static167.aClass1_Sub16_Sub1_2.method3760(local26);
			Static167.aClass1_Sub16_Sub1_2.method3772(local17);
			Static61.anInt1427 = 0;
			Static61.aClass71_13 = Static7.method102(local17);
			Static202.anInt4286 = local13;
		}
		if (local21 == 8) {
			local975 = Static168.aClass5_Sub1_Sub2Array1[local26];
			if (local975 != null) {
				Static124.method3511(Static73.aClass5_Sub1_Sub1_1.anIntArray233[0], local975.anIntArray238[0], 0, 1, 0, local975.anIntArray233[0], Static73.aClass5_Sub1_Sub1_1.anIntArray238[0], 0, false, 2, 1);
				Static68.anInt1547 = 2;
				Static83.anInt1948 = Static106.anInt2346;
				Static12.anInt320 = 0;
				Static160.anInt3453 = Static148.anInt3214;
				Static167.aClass1_Sub16_Sub1_2.method3823(211);
				Static167.aClass1_Sub16_Sub1_2.method3796(local26);
			}
		}
		if (local21 == 19 && Static172.aClass71_30 == null) {
			Static116.method964(local13, local17);
			Static172.aClass71_30 = Static29.method527(local17, local13);
			Static82.method1438(Static172.aClass71_30);
		}
		if (local21 == 39) {
			local236 = Static191.aClass5_Sub1_Sub1Array1[local26];
			if (local236 != null) {
				Static124.method3511(Static73.aClass5_Sub1_Sub1_1.anIntArray233[0], local236.anIntArray238[0], 0, 1, 0, local236.anIntArray233[0], Static73.aClass5_Sub1_Sub1_1.anIntArray238[0], 0, false, 2, 1);
				Static83.anInt1948 = Static106.anInt2346;
				Static68.anInt1547 = 2;
				Static12.anInt320 = 0;
				Static160.anInt3453 = Static148.anInt3214;
				Static167.aClass1_Sub16_Sub1_2.method3823(251);
				Static167.aClass1_Sub16_Sub1_2.method3807(local26);
			}
		}
		if (local21 == 46) {
			Static167.aClass1_Sub16_Sub1_2.method3823(147);
			Static167.aClass1_Sub16_Sub1_2.method3808(local17);
			local295 = Static7.method102(local17);
			if (local295.anIntArrayArray16 != null && local295.anIntArrayArray16[0][0] == 5) {
				local571 = local295.anIntArrayArray16[0][1];
				if (local295.anIntArray174[0] != Static86.anIntArray125[local571]) {
					Static86.anIntArray125[local571] = local295.anIntArray174[0];
					Static99.method1646(local571);
				}
			}
		}
		if (local21 == 38) {
			Static167.aClass1_Sub16_Sub1_2.method3823(223);
			Static167.aClass1_Sub16_Sub1_2.method3772(local17);
			Static167.aClass1_Sub16_Sub1_2.method3760(local13);
			Static167.aClass1_Sub16_Sub1_2.method3760(local26);
			Static61.anInt1427 = 0;
			Static61.aClass71_13 = Static7.method102(local17);
			Static202.anInt4286 = local13;
		}
		if (local21 == 45) {
			local65 = Static124.method3511(Static73.aClass5_Sub1_Sub1_1.anIntArray233[0], local13, 0, 0, 0, local17, Static73.aClass5_Sub1_Sub1_1.anIntArray238[0], 0, false, 2, 0);
			if (!local65) {
				Static124.method3511(Static73.aClass5_Sub1_Sub1_1.anIntArray233[0], local13, 0, 1, 0, local17, Static73.aClass5_Sub1_Sub1_1.anIntArray238[0], 0, false, 2, 1);
			}
			Static68.anInt1547 = 2;
			Static160.anInt3453 = Static148.anInt3214;
			Static12.anInt320 = 0;
			Static83.anInt1948 = Static106.anInt2346;
			Static167.aClass1_Sub16_Sub1_2.method3823(183);
			Static167.aClass1_Sub16_Sub1_2.method3789(local13 + Static198.anInt4217);
			Static167.aClass1_Sub16_Sub1_2.method3796(Static118.anInt2541 + local17);
			Static167.aClass1_Sub16_Sub1_2.method3760(Static211.anInt4507);
			Static167.aClass1_Sub16_Sub1_2.method3760(local26);
			Static167.aClass1_Sub16_Sub1_2.method3808(Static76.anInt1699);
		}
		if (local21 == 25) {
			Static167.aClass1_Sub16_Sub1_2.method3823(220);
			Static167.aClass1_Sub16_Sub1_2.method3789(local26);
			Static167.aClass1_Sub16_Sub1_2.method3789(Static123.anInt2714);
			Static167.aClass1_Sub16_Sub1_2.method3789(Static52.anInt1233);
			Static167.aClass1_Sub16_Sub1_2.method3772(Static143.anInt3141);
			Static167.aClass1_Sub16_Sub1_2.method3808(local17);
			Static167.aClass1_Sub16_Sub1_2.method3789(local13);
			Static61.anInt1427 = 0;
			Static61.aClass71_13 = Static7.method102(local17);
			Static202.anInt4286 = local13;
		}
		if (local21 == 51) {
			local65 = Static124.method3511(Static73.aClass5_Sub1_Sub1_1.anIntArray233[0], local13, 0, 0, 0, local17, Static73.aClass5_Sub1_Sub1_1.anIntArray238[0], 0, false, 2, 0);
			if (!local65) {
				Static124.method3511(Static73.aClass5_Sub1_Sub1_1.anIntArray233[0], local13, 0, 1, 0, local17, Static73.aClass5_Sub1_Sub1_1.anIntArray238[0], 0, false, 2, 1);
			}
			Static160.anInt3453 = Static148.anInt3214;
			Static83.anInt1948 = Static106.anInt2346;
			Static68.anInt1547 = 2;
			Static12.anInt320 = 0;
			Static167.aClass1_Sub16_Sub1_2.method3823(97);
			Static167.aClass1_Sub16_Sub1_2.method3789(local26);
			Static167.aClass1_Sub16_Sub1_2.method3789(Static198.anInt4217 + local13);
			Static167.aClass1_Sub16_Sub1_2.method3760(Static118.anInt2541 + local17);
		}
		if (local21 == 6) {
			local975 = Static168.aClass5_Sub1_Sub2Array1[local26];
			if (local975 != null) {
				Static124.method3511(Static73.aClass5_Sub1_Sub1_1.anIntArray233[0], local975.anIntArray238[0], 0, 1, 0, local975.anIntArray233[0], Static73.aClass5_Sub1_Sub1_1.anIntArray238[0], 0, false, 2, 1);
				Static83.anInt1948 = Static106.anInt2346;
				Static12.anInt320 = 0;
				Static160.anInt3453 = Static148.anInt3214;
				Static68.anInt1547 = 2;
				Static167.aClass1_Sub16_Sub1_2.method3823(177);
				Static167.aClass1_Sub16_Sub1_2.method3796(local26);
			}
		}
		if (local21 == 9) {
			local295 = Static7.method102(local17);
			@Pc(2498) boolean local2498 = true;
			if (local295.anInt2815 > 0) {
				local2498 = Static159.method2693(local295);
			}
			if (local2498) {
				Static167.aClass1_Sub16_Sub1_2.method3823(147);
				Static167.aClass1_Sub16_Sub1_2.method3808(local17);
			}
		}
		if (local21 == 1007) {
			Static68.anInt1547 = 2;
			Static12.anInt320 = 0;
			Static83.anInt1948 = Static106.anInt2346;
			Static160.anInt3453 = Static148.anInt3214;
			Static167.aClass1_Sub16_Sub1_2.method3823(207);
			Static167.aClass1_Sub16_Sub1_2.method3760(local26);
		}
		if (local21 == 15) {
			local295 = Static29.method527(local17, local13);
			if (local295 != null) {
				Static118.method1949();
				Static14.method279(local17, local13, Static73.method1284(Static33.method587(local295)));
				Static54.anInt1264 = 0;
				Static87.aClass51_641 = Static112.method1884(local295);
				if (Static87.aClass51_641 == null) {
					Static87.aClass51_641 = Static120.aClass51_949;
				}
				if (local295.aBoolean122) {
					Static51.aClass51_374 = Static150.method2574(new Class51[] { local295.aClass51_984, Static42.aClass51_1653 });
					return;
				}
				Static51.aClass51_374 = Static150.method2574(new Class51[] { Static161.aClass51_1226, local295.aClass51_981, Static42.aClass51_1653 });
			}
			return;
		}
		if (local21 == 1004) {
			Static75.method884(local13, local30, local17);
			Static167.aClass1_Sub16_Sub1_2.method3823(73);
			Static167.aClass1_Sub16_Sub1_2.method3760((int) (local30 >>> 32) & Integer.MAX_VALUE);
			Static167.aClass1_Sub16_Sub1_2.method3789(local13 + Static198.anInt4217);
			Static167.aClass1_Sub16_Sub1_2.method3807(local17 + Static118.anInt2541);
		}
		if (local21 == 11) {
			Static197.method1855();
		}
		if (local21 == 1006) {
			Static160.anInt3453 = Static148.anInt3214;
			Static12.anInt320 = 0;
			Static68.anInt1547 = 2;
			Static83.anInt1948 = Static106.anInt2346;
			Static167.aClass1_Sub16_Sub1_2.method3823(193);
			Static167.aClass1_Sub16_Sub1_2.method3807(local26);
		}
		if (local21 == 35 || local21 == 1005) {
			Static203.method3259(local17, local13, Static168.aClass51Array27[arg0], local26);
		}
		if (local21 == 44) {
			local975 = Static168.aClass5_Sub1_Sub2Array1[local26];
			if (local975 != null) {
				Static124.method3511(Static73.aClass5_Sub1_Sub1_1.anIntArray233[0], local975.anIntArray238[0], 0, 1, 0, local975.anIntArray233[0], Static73.aClass5_Sub1_Sub1_1.anIntArray238[0], 0, false, 2, 1);
				Static83.anInt1948 = Static106.anInt2346;
				Static12.anInt320 = 0;
				Static160.anInt3453 = Static148.anInt3214;
				Static68.anInt1547 = 2;
				Static167.aClass1_Sub16_Sub1_2.method3823(40);
				Static167.aClass1_Sub16_Sub1_2.method3808(Static76.anInt1699);
				Static167.aClass1_Sub16_Sub1_2.method3760(Static211.anInt4507);
				Static167.aClass1_Sub16_Sub1_2.method3760(local26);
			}
		}
		if (local21 == 17) {
			Static167.aClass1_Sub16_Sub1_2.method3823(130);
			Static167.aClass1_Sub16_Sub1_2.method3760(local26);
			Static167.aClass1_Sub16_Sub1_2.method3789(local13);
			Static167.aClass1_Sub16_Sub1_2.method3772(local17);
			Static61.anInt1427 = 0;
			Static61.aClass71_13 = Static7.method102(local17);
			Static202.anInt4286 = local13;
		}
		if (Static54.anInt1264 != 0) {
			Static54.anInt1264 = 0;
			Static82.method1438(Static7.method102(Static143.anInt3141));
		}
		if (Static82.aBoolean82) {
			Static118.method1949();
		}
		if (Static61.aClass71_13 != null && Static61.anInt1427 == 0) {
			Static82.method1438(Static61.aClass71_13);
		}
	}
}
