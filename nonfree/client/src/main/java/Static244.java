import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!sg", name = "k", descriptor = "Lclient!lc;")
	public static Class98 aClass98_140;

	@OriginalMember(owner = "client!sg", name = "i", descriptor = "[Z")
	public static boolean[] aBooleanArray23 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

	@OriginalMember(owner = "client!sg", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString159 = "cyan:";

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IZIIIB)V")
	public static void method3719(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static32.anInt641++;
		Static60.method950();
		@Pc(26) int local26;
		if (arg1) {
			Static276.method4107(0, false, false);
		} else {
			Static61.method952(0);
			Static276.method4107(0, false, true);
			if (Static98.anInt2077 == 0) {
				for (local26 = 1; local26 <= 5; local26++) {
					Static276.method4107(local26, false, false);
					Static276.method4107(local26, true, false);
					Static61.method952(local26);
				}
			} else {
				for (local26 = 1; local26 <= 5; local26++) {
					Static61.method952(local26);
					Static276.method4107(local26, false, false);
					Static276.method4107(local26, true, false);
				}
			}
		}
		if (!arg1) {
			Static105.method1729();
		}
		Static176.method654();
		if (Static178.aBoolean216) {
			Static145.method2343(arg0, arg4, arg3, true, arg2);
			arg2 = Static272.anInt5103;
			arg0 = Static84.anInt1698;
			arg3 = Static92.anInt1910;
			arg4 = Static272.anInt5104;
		}
		@Pc(119) int local119;
		if (Static239.anInt4616 == 1) {
			local119 = (int) Static270.aFloat49 + Static73.anInt1335 & 0x7FF;
			local26 = (int) Static96.aFloat16;
			if (local26 < Static40.anInt850 / 256) {
				local26 = Static40.anInt850 / 256;
			}
			if (Static231.aBooleanArray21[4] && local26 < Static201.anIntArray337[4] + 128) {
				local26 = Static201.anIntArray337[4] + 128;
			}
			Static287.method1966(Static96.method1559(Static210.anInt4103, Static239.aClass12_Sub3_Sub2_2.anInt4113, Static239.aClass12_Sub3_Sub2_2.anInt4141) - 50, Static127.anInt2702, local26 * 3 + 600, local119, arg0, Static295.anInt5480, local26);
		} else if (Static239.anInt4616 == 5) {
			Static265.method3983(arg0);
		}
		local26 = Static149.anInt3032;
		local119 = Static160.anInt3185;
		@Pc(179) int local179 = Static211.anInt4210;
		@Pc(181) int local181 = Static299.anInt5560;
		@Pc(183) int local183 = Static279.anInt5259;
		@Pc(185) int local185;
		@Pc(229) int local229;
		for (local185 = 0; local185 < 5; local185++) {
			if (Static231.aBooleanArray21[local185]) {
				local229 = (int) ((double) -Static279.anIntArray464[local185] + (double) (Static279.anIntArray464[local185] * 2 + 1) * Math.random() + Math.sin((double) Static93.anIntArray206[local185] / 100.0D * (double) Static89.anIntArray196[local185]) * (double) Static201.anIntArray337[local185]);
				if (local185 == 4) {
					Static299.anInt5560 += local229;
					if (Static299.anInt5560 < 128) {
						Static299.anInt5560 = 128;
					}
					if (Static299.anInt5560 > 383) {
						Static299.anInt5560 = 383;
					}
				}
				if (local185 == 3) {
					Static279.anInt5259 = Static279.anInt5259 + local229 & 0x7FF;
				}
				if (local185 == 1) {
					Static160.anInt3185 += local229;
				}
				if (local185 == 2) {
					Static211.anInt4210 += local229;
				}
				if (local185 == 0) {
					Static149.anInt3032 += local229;
				}
			}
		}
		Static213.method3409();
		@Pc(364) int local364;
		if (Static178.aBoolean216) {
			Static186.method2963(arg3, arg2, arg3 + arg4, arg2 - -arg0);
			@Pc(317) float local317 = (float) Static279.anInt5259 * 0.17578125F;
			@Pc(322) float local322 = (float) Static299.anInt5560 * 0.17578125F;
			if (Static239.anInt4616 == 3) {
				local317 = Static213.aFloat44 * 360.0F / 6.2831855F;
				local322 = Static125.aFloat23 * 360.0F / 6.2831855F;
			}
			if (Static267.anInt3573 == 10) {
				local364 = Static148.method2371(Static211.anInt4210 >> 10, Static165.anInt3301, Static149.anInt3032 >> 10, Static16.anInt307);
			} else {
				local364 = Static148.method2371(Static239.aClass12_Sub3_Sub2_2.anIntArray379[0] >> 3, Static165.anInt3301, Static239.aClass12_Sub3_Sub2_2.anIntArray376[0] >> 3, Static16.anInt307);
			}
			if (Static1.anInt4 >= 0) {
				Static178.method2781();
				@Pc(388) Class178 local388 = Static243.method3713(Static1.anInt4, Static231.anInt4521, Static49.anInt1022, Static185.anInt3643);
				local388.method4285(Static11.anInt205, arg3, arg2, arg4, arg0, Static299.anInt5560, Static279.anInt5259, local364);
			} else {
				Static178.method2750(local364);
			}
			Static178.method2767(arg3, arg2, arg4, arg0, arg3 + arg4 / 2, arg2 - -(arg0 / 2), local322, local317, Static126.anInt2699, Static126.anInt2699);
			Static193.method3018(false);
			Static178.method2757();
			Static178.method2751(true);
			Static178.method2772(true);
		} else {
			Static166.method2622(arg3, arg2, arg3 + arg4, arg0 + arg2);
			Static204.method3238();
			if (Static1.anInt4 >= 0) {
				@Pc(452) Class178 local452 = Static243.method3713(Static1.anInt4, Static231.anInt4521, Static49.anInt1022, Static185.anInt3643);
				local452.method4287(Static11.anInt205, arg3, arg2, arg4, arg0, Static299.anInt5560, Static279.anInt5259);
			} else {
				Static166.method2627(arg3, arg2, arg4, arg0, 0);
			}
		}
		if (Static142.aBoolean192 || arg3 > Static273.anInt1118 || Static273.anInt1118 >= arg4 + arg3 || Static105.anInt2256 < arg2 || Static105.anInt2256 >= arg0 + arg2) {
			Static81.anInt4025 = 0;
			Static241.aBoolean301 = false;
		} else {
			Static81.anInt4025 = 0;
			local185 = Static61.anInt1159;
			Static241.aBoolean301 = true;
			local364 = Static93.anInt1922;
			@Pc(515) int local515 = Static26.anInt481;
			local229 = Static60.anInt1151;
			Static238.anInt4596 = local364 + (Static105.anInt2256 - arg2) * (local515 - local364) / arg0;
			Static202.anInt3932 = (local229 - local185) * (-arg3 + Static273.anInt1118) / arg4 + local185;
		}
		Static81.method3275();
		@Pc(557) byte local557 = Static286.method4296() == 2 ? (byte) Static32.anInt641 : 1;
		if (Static178.aBoolean216) {
			Static12.method201(Static104.anInt2226, !Static268.aBoolean333);
			Static222.method3561(Static211.anInt4210, Static299.anInt5560, Static279.anInt5259, Static160.anInt3185, Static149.anInt3032);
			Static178.anInt3492 = Static104.anInt2226;
			Static23.method376(Static149.anInt3032, Static160.anInt3185, Static211.anInt4210, Static299.anInt5560, Static279.anInt5259, Static275.aByteArrayArrayArray18, Static16.anIntArray33, Static127.anIntArray244, Static150.anIntArray278, Static255.anIntArray434, Static120.anIntArray238, Static210.anInt4103 + 1, local557, Static239.aClass12_Sub3_Sub2_2.anInt4141 >> 7, Static239.aClass12_Sub3_Sub2_2.anInt4113 >> 7);
			Static272.aBoolean337 = true;
			Static12.method206();
			Static222.method3561(0, 0, 0, 0, 0);
			Static81.method3275();
			Static280.method4225(Static126.anInt2699, Static126.anInt2699, arg4, arg2, arg3, arg0);
			Static104.method1702(arg4, arg0, Static126.anInt2699, Static126.anInt2699, arg3, arg2);
			Static210.method3348();
		} else {
			Static23.method376(Static149.anInt3032, Static160.anInt3185, Static211.anInt4210, Static299.anInt5560, Static279.anInt5259, Static275.aByteArrayArrayArray18, Static16.anIntArray33, Static127.anIntArray244, Static150.anIntArray278, Static255.anIntArray434, Static120.anIntArray238, Static210.anInt4103 + 1, local557, Static239.aClass12_Sub3_Sub2_2.anInt4141 >> 7, Static239.aClass12_Sub3_Sub2_2.anInt4113 >> 7);
			Static81.method3275();
			Static210.method3348();
			Static280.method4225(256, 256, arg4, arg2, arg3, arg0);
			Static104.method1702(arg4, arg0, 256, 256, arg3, arg2);
		}
		((Class71_Sub1) Static204.anInterface2_1).method1985(Static16.anInt307);
		Static132.method2161(arg0, arg2, arg3, arg4);
		Static160.anInt3185 = local119;
		Static279.anInt5259 = local183;
		Static211.anInt4210 = local179;
		Static149.anInt3032 = local26;
		Static299.anInt5560 = local181;
		if (Static167.aBoolean207 && Static103.aClass113_1.method2681() == 0) {
			Static167.aBoolean207 = false;
		}
		if (Static167.aBoolean207) {
			if (Static178.aBoolean216) {
				Static186.method2968(arg3, arg2, arg4, arg0, 0);
			} else {
				Static166.method2627(arg3, arg2, arg4, arg0, 0);
			}
			Static265.method3986(Static86.aString50, false);
		}
		if (!arg1 && !Static167.aBoolean207 && !Static142.aBoolean192 && Static273.anInt1118 >= arg3 && Static273.anInt1118 < arg4 + arg3 && Static105.anInt2256 >= arg2 && arg0 + arg2 > Static105.anInt2256) {
			Static259.method3917(arg0, arg2, Static273.anInt1118, arg3, Static105.anInt2256, arg4);
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
	public static void method3720() {
		aClass98_140 = null;
		Class154.anIntArray428 = null;
		aString159 = null;
		aBooleanArray23 = null;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Throwable;)V")
	public static void method3721(@OriginalArg(0) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static73.method1084(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			Static190.method3012(local7);
			local7 = Static154.method2468(local7, ":", "%3a");
			local7 = Static154.method2468(local7, "@", "%40");
			local7 = Static154.method2468(local7, "&", "%26");
			local7 = Static154.method2468(local7, "#", "%23");
			if (Static59.aClass164_4.anApplet1 == null) {
				return;
			}
			@Pc(106) Class123 local106 = Static59.aClass164_4.method3948(new URL(Static59.aClass164_4.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static206.anInt4049 + "&u=" + Static217.aLong158 + "&v1=" + Static260.aString175 + "&v2=" + Static260.aString171 + "&e=" + local7));
			while (local106.anInt3791 == 0) {
				Static122.method2061(1L);
			}
			if (local106.anInt3791 == 1) {
				@Pc(125) DataInputStream local125 = (DataInputStream) local106.anObject4;
				local125.read();
				local125.close();
			}
		} catch (@Pc(132) Exception local132) {
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIIIIIZI)V")
	public static void method3722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = arg3 - arg0;
		@Pc(12) int local12 = arg4 - arg1;
		@Pc(21) int local21 = (arg2 - arg5 << 16) / local7;
		@Pc(30) int local30 = (arg8 - arg6 << 16) / local12;
		Static147.method2366(arg3, local21, arg1, arg7, arg5, arg4, local30, arg6, arg0);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)I")
	public static int method3723(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 + arg1 * 57;
		@Pc(16) int local16 = local10 ^ local10 << 13;
		@Pc(30) int local30 = (local16 * 15731 * local16 + 789221) * local16 + 1376312589 & Integer.MAX_VALUE;
		return local30 >> 19 & 0xFF;
	}
}
