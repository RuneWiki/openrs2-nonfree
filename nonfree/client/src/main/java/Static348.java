import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!np", name = "c", descriptor = "I")
	public static int anInt6222;

	@OriginalMember(owner = "client!np", name = "d", descriptor = "[Lclient!tn;")
	public static final Class6_Sub2_Sub19[] aClass6_Sub2_Sub19Array5 = new Class6_Sub2_Sub19[14];

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(II)Lclient!ww;")
	public static Class98_Sub8 method5326(@OriginalArg(1) int arg0) {
		@Pc(7) Class40[] local7 = Class128.aClass40Array1;
		synchronized (Class128.aClass40Array1) {
			@Pc(33) Class98_Sub8 local33;
			if (Class128.aClass40Array1.length <= arg0 || Class128.aClass40Array1[arg0].method1136()) {
				local33 = new Class98_Sub8();
				local33.aClass98_Sub5Array1 = new Class98_Sub5[arg0];
				for (@Pc(39) int local39 = 0; local39 < arg0; local39++) {
					local33.aClass98_Sub5Array1[local39] = new Class98_Sub5();
				}
			} else {
				local33 = (Class98_Sub8) Class128.aClass40Array1[arg0].method1130();
				local33.method7855();
				@Pc(68) int local68 = Static541.anIntArray496[arg0]--;
			}
			return local33;
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(B)V")
	public static void method5327() {
		Static392.method6486(false);
		Static233.anInt4738 = 0;
		@Pc(17) boolean local17 = true;
		for (@Pc(19) int local19 = 0; local19 < Static380.aByteArrayArray22.length; local19++) {
			if (Static220.anIntArray273[local19] != -1 && Static380.aByteArrayArray22[local19] == null) {
				Static380.aByteArrayArray22[local19] = Static70.aClass251_58.method5772(0, Static220.anIntArray273[local19]);
				if (Static380.aByteArrayArray22[local19] == null) {
					Static233.anInt4738++;
					local17 = false;
				}
			}
			if (Static228.anIntArray281[local19] != -1 && Static334.aByteArrayArray19[local19] == null) {
				Static334.aByteArrayArray19[local19] = Static70.aClass251_58.method5783(0, Static228.anIntArray281[local19], Static486.anIntArrayArray73[local19]);
				if (Static334.aByteArrayArray19[local19] == null) {
					local17 = false;
					Static233.anInt4738++;
				}
			}
			if (Static98.anIntArray154[local19] != -1 && Static30.aByteArrayArray2[local19] == null) {
				Static30.aByteArrayArray2[local19] = Static70.aClass251_58.method5772(0, Static98.anIntArray154[local19]);
				if (Static30.aByteArrayArray2[local19] == null) {
					local17 = false;
					Static233.anInt4738++;
				}
			}
			if (Static347.anIntArray461[local19] != -1 && Static64.aByteArrayArray18[local19] == null) {
				Static64.aByteArrayArray18[local19] = Static70.aClass251_58.method5772(0, Static347.anIntArray461[local19]);
				if (Static64.aByteArrayArray18[local19] == null) {
					local17 = false;
					Static233.anInt4738++;
				}
			}
			if (Static378.anIntArray493 != null && Static542.aByteArrayArray30[local19] == null && Static378.anIntArray493[local19] != -1) {
				Static542.aByteArrayArray30[local19] = Static70.aClass251_58.method5783(0, Static378.anIntArray493[local19], Static486.anIntArrayArray73[local19]);
				if (Static542.aByteArrayArray30[local19] == null) {
					local17 = false;
					Static233.anInt4738++;
				}
			}
		}
		if (Static216.aClass303_3 == null) {
			if (Static407.aClass6_Sub2_Sub6_3 == null || !Static4.aClass251_4.method5774(Static407.aClass6_Sub2_Sub6_3.aString18 + "_staticelements")) {
				Static216.aClass303_3 = new Class303(0);
			} else if (Static4.aClass251_4.method5753(Static407.aClass6_Sub2_Sub6_3.aString18 + "_staticelements")) {
				Static216.aClass303_3 = Static209.method3707(Static4.aClass251_4, Static407.aClass6_Sub2_Sub6_3.aString18 + "_staticelements", Static448.aBoolean544);
			} else {
				Static233.anInt4738++;
				local17 = false;
			}
		}
		if (!local17) {
			Static36.anInt951 = 1;
			return;
		}
		local17 = true;
		Static47.anInt1067 = 0;
		@Pc(272) int local272;
		@Pc(283) int local283;
		for (@Pc(253) int local253 = 0; local253 < Static380.aByteArrayArray22.length; local253++) {
			@Pc(259) byte[] local259 = Static334.aByteArrayArray19[local253];
			if (local259 != null) {
				local272 = (Static365.anIntArray477[local253] >> 8) * 64 - Static39.anInt4952;
				local283 = (Static365.anIntArray477[local253] & 0xFF) * 64 - Static138.anInt3088;
				if (Static367.anInt6493 != 0) {
					local272 = 10;
					local283 = 10;
				}
				local17 &= Static109.method1945(Static165.anInt6749, Static473.anInt8075, local272, local283, local259);
			}
			local259 = Static64.aByteArrayArray18[local253];
			if (local259 != null) {
				local272 = (Static365.anIntArray477[local253] >> 8) * 64 - Static39.anInt4952;
				local283 = (Static365.anIntArray477[local253] & 0xFF) * 64 - Static138.anInt3088;
				if (Static367.anInt6493 != 0) {
					local283 = 10;
					local272 = 10;
				}
				local17 &= Static109.method1945(Static165.anInt6749, Static473.anInt8075, local272, local283, local259);
			}
		}
		if (!local17) {
			Static36.anInt951 = 2;
			return;
		}
		if (Static36.anInt951 != 0) {
			Static30.method892(Static230.aClass156_11.method4065(Static25.anInt769) + "<br>(100%)", Static8.aClass327_1, Static101.aClass92_9, Static240.aClass14_7, true);
		}
		Static482.method6632();
		Static226.method4024();
		@Pc(381) boolean local381 = false;
		if (Static240.aClass14_7.method6838() && Static140.aClass6_Sub48_Sub1_1.aBoolean679) {
			for (local272 = 0; local272 < Static380.aByteArrayArray22.length; local272++) {
				if (Static64.aByteArrayArray18[local272] != null || Static30.aByteArrayArray2[local272] != null) {
					local381 = true;
					break;
				}
			}
		}
		if (Static140.aClass6_Sub48_Sub1_1.aBoolean681) {
			local272 = Static430.anIntArray541[Static287.anInt5401];
		} else {
			local272 = Static259.anIntArray384[Static287.anInt5401];
		}
		if (Static240.aClass14_7.method6832()) {
			local272++;
		}
		Static167.method3165(Static473.anInt8075, Static165.anInt6749, local272, local381, Static240.aClass14_7.method6847() > 0);
		for (local283 = 0; local283 < 4; local283++) {
			Static579.aClass189Array4[local283].method4600();
		}
		Static14.method322();
		Static303.method4807(false);
		Static89.method1675();
		Static423.aBoolean509 = false;
		Static385.aClass268_1 = null;
		Static482.method6632();
		System.gc();
		Static392.method6486(true);
		Static50.method1121();
		Static13.anInt7623 = Static140.aClass6_Sub48_Sub1_1.method7374(Static560.anInt9242);
		Static324.aBoolean522 = Static11.anInt321 >= 96;
		Static461.aBoolean571 = Static140.aClass6_Sub48_Sub1_1.aBoolean679;
		Static20.aBoolean44 = Static140.aClass6_Sub48_Sub1_1.method7369(Static560.anInt9242);
		Static201.aBoolean285 = !Static140.aClass6_Sub48_Sub1_1.aBoolean684;
		Static501.anInt8347 = Static140.aClass6_Sub48_Sub1_1.method7389(Static560.anInt9242) ? -1 : Static294.anInt5492;
		Static507.aBoolean629 = Static17.method409(Static560.anInt9242) || Static140.aClass6_Sub48_Sub1_1.aBoolean690;
		Static109.aBoolean148 = Static140.aClass6_Sub48_Sub1_1.aBoolean676;
		Static20.aClass115_Sub1_1 = new Class115_Sub1(4, Static473.anInt8075, Static165.anInt6749, false);
		if (Static367.anInt6493 == 0) {
			Static39.method4287(Static380.aByteArrayArray22, Static20.aClass115_Sub1_1);
		} else {
			Static487.method6671(Static20.aClass115_Sub1_1, Static380.aByteArrayArray22);
		}
		Static419.method5992(Static165.anInt6749 >> 4, Static473.anInt8075 >> 4);
		Static211.method3732();
		if (local381) {
			Static428.method6156(true);
			Static527.aClass115_Sub1_2 = new Class115_Sub1(1, Static473.anInt8075, Static165.anInt6749, true);
			if (Static367.anInt6493 == 0) {
				Static39.method4287(Static30.aByteArrayArray2, Static527.aClass115_Sub1_2);
				Static392.method6486(true);
			} else {
				Static487.method6671(Static527.aClass115_Sub1_2, Static30.aByteArrayArray2);
				Static392.method6486(true);
			}
			Static527.aClass115_Sub1_2.method3144(Static20.aClass115_Sub1_1.anIntArrayArrayArray5[0]);
			Static527.aClass115_Sub1_2.method3148(null, null, Static240.aClass14_7);
			Static428.method6156(false);
		}
		Static20.aClass115_Sub1_1.method3148(local381 ? Static527.aClass115_Sub1_2.anIntArrayArrayArray5 : null, Static579.aClass189Array4, Static240.aClass14_7);
		if (Static367.anInt6493 == 0) {
			Static392.method6486(true);
			Static144.method2806(Static334.aByteArrayArray19, Static20.aClass115_Sub1_1);
			if (Static542.aByteArrayArray30 != null) {
				Static488.method4436();
			}
		} else {
			Static392.method6486(true);
			Static171.method3189(Static20.aClass115_Sub1_1, Static334.aByteArrayArray19);
		}
		Static226.method4024();
		if (Static11.anInt321 < 96) {
			Static66.method1306();
		}
		Static392.method6486(true);
		Static20.aClass115_Sub1_1.method3149(Static240.aClass14_7, null, local381 ? Static49.aClass59Array2[0] : null);
		Static20.aClass115_Sub1_1.method3160(Static240.aClass14_7);
		Static392.method6486(true);
		if (local381) {
			Static428.method6156(true);
			Static392.method6486(true);
			if (Static367.anInt6493 == 0) {
				Static144.method2806(Static64.aByteArrayArray18, Static527.aClass115_Sub1_2);
			} else {
				Static171.method3189(Static527.aClass115_Sub1_2, Static64.aByteArrayArray18);
			}
			Static226.method4024();
			Static392.method6486(true);
			Static527.aClass115_Sub1_2.method3149(Static240.aClass14_7, Static273.aClass59Array4[0], null);
			Static527.aClass115_Sub1_2.method3160(Static240.aClass14_7);
			Static392.method6486(true);
			Static428.method6156(false);
		}
		Static68.method6773();
		@Pc(716) int local716 = Static20.aClass115_Sub1_1.anInt3560;
		if (Static97.anInt1863 < local716) {
			local716 = Static97.anInt1863;
		}
		if (Static97.anInt1863 - 1 > local716) {
			local716 = Static97.anInt1863 - 1;
		}
		if (Static140.aClass6_Sub48_Sub1_1.method7389(Static560.anInt9242)) {
			Static145.method2814(0);
		} else {
			Static145.method2814(local716);
		}
		@Pc(747) int local747;
		@Pc(751) int local751;
		for (@Pc(743) int local743 = 0; local743 < 4; local743++) {
			for (local747 = 0; local747 < Static473.anInt8075; local747++) {
				for (local751 = 0; local751 < Static165.anInt6749; local751++) {
					Static540.method3555(local751, local747, local743);
				}
			}
		}
		Static422.method6091();
		Static482.method6632();
		Static60.method1247();
		Static226.method4024();
		Static85.method1644();
		@Pc(808) Class6_Sub31 local808;
		if (Static547.aFrame2 != null && Static563.aClass127_2 != null && Static557.anInt9206 == 11) {
			local808 = Static114.method2007(Static306.aClass47_91, Static337.aClass324_1);
			local808.aClass6_Sub21_Sub2_2.method6033(1057001181);
			Static534.method7251(local808);
		}
		if (Static367.anInt6493 == 0) {
			local747 = (Static447.anInt7737 - (Static473.anInt8075 >> 4)) / 8;
			local751 = ((Static473.anInt8075 >> 4) + Static447.anInt7737) / 8;
			@Pc(844) int local844 = (Static455.anInt7847 - (Static165.anInt6749 >> 4)) / 8;
			@Pc(852) int local852 = ((Static165.anInt6749 >> 4) + Static455.anInt7847) / 8;
			for (@Pc(856) int local856 = local747 - 1; local856 <= local751 + 1; local856++) {
				for (@Pc(862) int local862 = local844 - 1; local862 <= local852 + 1; local862++) {
					if (local856 < local747 || local751 < local856 || local862 < local844 || local852 < local862) {
						Static70.aClass251_58.method5781("m" + local856 + "_" + local862);
						Static70.aClass251_58.method5781("l" + local856 + "_" + local862);
					}
				}
			}
		}
		if (Static557.anInt9206 == 4) {
			Static449.method6350(3);
		} else if (Static557.anInt9206 == 8) {
			Static449.method6350(7);
		} else {
			Static449.method6350(10);
			if (Static563.aClass127_2 != null) {
				local808 = Static114.method2007(Static402.aClass47_112, Static337.aClass324_1);
				Static534.method7251(local808);
			}
		}
		Static197.method3551();
		Static482.method6632();
		Static500.method6767();
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IZIIII)V")
	public static void method5328(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static270.aClass276ArrayArrayArray2 == null) {
			Static240.aClass14_7.method6859(arg4, arg2, arg3, -16777216, arg0);
		} else if (Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9542 >= 0 && Static473.anInt8075 * 512 > Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9542 && Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9540 >= 0 && Static165.anInt6749 * 512 > Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9540) {
			Static534.anInt8855++;
			if (Static328.aClass4_Sub1_Sub1_Sub2_2 != null && Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9542 - (Static328.aClass4_Sub1_Sub1_Sub2_2.method5892() - 1) * 256 >> 9 == Static530.anInt8828 && Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9540 - (Static328.aClass4_Sub1_Sub1_Sub2_2.method5892() - 1) * 256 >> 9 == Static210.anInt4254) {
				Static530.anInt8828 = -1;
				Static210.anInt4254 = -1;
				Static494.method6740();
			}
			Static490.method6712();
			if (!arg1) {
				Static390.method5736();
			}
			Static595.method7834();
			Static134.method2630(arg4, arg3, arg0, true, arg2);
			@Pc(124) int local124 = Static122.anInt2872;
			@Pc(126) int local126 = Static306.anInt5622;
			@Pc(128) int local128 = Static536.anInt8904;
			@Pc(130) int local130 = Static216.anInt4316;
			@Pc(138) int local138;
			@Pc(175) int local175;
			if (Static346.anInt6215 == 1) {
				local138 = (int) Static331.aFloat140;
				if (local138 < Static90.anInt9289 >> 8) {
					local138 = Static90.anInt9289 >> 8;
				}
				if (Static567.aBooleanArray41[4] && Static196.anIntArray252[4] + 128 > local138) {
					local138 = Static196.anIntArray252[4] + 128;
				}
				local175 = Static196.anInt4058 + (int) Static428.aFloat160 & 0x3FFF;
				Static419.method5993(Static160.method2951(Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9540, Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9542, Static97.anInt1863) - 200, local128, (local138 >> 3) * 3 + 600 << 2, local138, Static468.anInt8032, Static405.anInt7184, local175);
			} else if (Static346.anInt6215 == 4) {
				local138 = (int) Static331.aFloat140;
				if (local138 < Static90.anInt9289 >> 8) {
					local138 = Static90.anInt9289 >> 8;
				}
				if (Static567.aBooleanArray41[4] && local138 < Static196.anIntArray252[4] + 128) {
					local138 = Static196.anIntArray252[4] + 128;
				}
				local175 = (int) Static428.aFloat160 & 0x3FFF;
				Static419.method5993(Static160.method2951(Static220.anInt4550, Static157.anInt3359, Static97.anInt1863) - 200, local128, (local138 >> 3) * 3 + 600 << 2, local138, Static468.anInt8032, Static405.anInt7184, local175);
			} else if (Static346.anInt6215 == 5) {
				Static474.method7120(local128);
			}
			local138 = Static371.anInt6572;
			local175 = Static111.anInt2160;
			@Pc(283) int local283 = Static322.anInt5904;
			@Pc(285) int local285 = Static67.anInt1407;
			@Pc(287) int local287 = Static570.anInt9340;
			@Pc(330) int local330;
			for (@Pc(289) int local289 = 0; local289 < 5; local289++) {
				if (Static567.aBooleanArray41[local289]) {
					local330 = (int) (Math.random() * (double) (Static389.anIntArray504[local289] * 2 + 1) - (double) Static389.anIntArray504[local289] + Math.sin((double) Static215.anIntArray271[local289] / 100.0D * (double) Static6.anIntArray251[local289]) * (double) Static196.anIntArray252[local289]);
					if (local289 == 2) {
						Static322.anInt5904 += local330 << 2;
					}
					if (local289 == 3) {
						Static570.anInt9340 = Static570.anInt9340 + local330 & 0x3FFF;
					}
					if (local289 == 0) {
						Static371.anInt6572 += local330 << 2;
					}
					if (local289 == 1) {
						Static111.anInt2160 += local330 << 2;
					}
					if (local289 == 4) {
						Static67.anInt1407 += local330;
						if (Static67.anInt1407 < 1024) {
							Static67.anInt1407 = 1024;
						} else if (Static67.anInt1407 > 3072) {
							Static67.anInt1407 = 3072;
						}
					}
				}
			}
			if (Static371.anInt6572 < 0) {
				Static371.anInt6572 = 0;
			}
			if ((Static401.anInt7022 << 9) - 1 < Static371.anInt6572) {
				Static371.anInt6572 = (Static401.anInt7022 << 9) - 1;
			}
			if (Static322.anInt5904 < 0) {
				Static322.anInt5904 = 0;
			}
			if ((Static555.anInt9182 << 9) - 1 < Static322.anInt5904) {
				Static322.anInt5904 = (Static555.anInt9182 << 9) - 1;
			}
			Static187.method3405();
			Static211.method3732();
			Static240.aClass14_7.ca(local126, local124, local130 + local126, local124 + local128);
			Static240.aClass14_7.method6892();
			local330 = Static427.anInt7433;
			if (Static385.aClass268_1 == null) {
				Static240.aClass14_7.D(local330);
			} else {
				Static385.aClass268_1.method5996(local126, local124, local130, Static570.anInt9340, local128, Static596.anInt9622 << 3, Static240.aClass14_7, Static67.anInt1407, local330);
			}
			Static482.method6632();
			Static21.aClass54_1.pa(Static371.anInt6572, Static111.anInt2160, Static322.anInt5904, -Static67.anInt1407 & 0x3FFF, -Static570.anInt9340 & 0x3FFF, -Static385.anInt6775 & 0x3FFF);
			Static240.aClass14_7.method6829(Static21.aClass54_1);
			Static240.aClass14_7.m(local130 / 2 + local126, local128 / 2 + local124, Static239.anInt4851 << 1, Static239.anInt4851 << 1);
			Static495.method6391(Static239.anInt4851 << 1, local124 + local128 / 2, local130 / 2 + local126, Static239.anInt4851 << 1);
			Static37.method2532(-Static385.anInt6775 & 0x3FFF, Static322.anInt5904, -Static570.anInt9340 & 0x3FFF, Static111.anInt2160, Static371.anInt6572, -Static67.anInt1407 & 0x3FFF);
			@Pc(568) byte local568 = Static140.aClass6_Sub48_Sub1_1.method7391(Static560.anInt9242) == 2 ? (byte) Static534.anInt8855 : 1;
			Static502.method6790(Static240.aClass14_7, Static312.anInt5688, Static495.anInt7806, Static21.aClass54_1, Static371.anInt6572, Static111.anInt2160, Static322.anInt5904, Static273.aByteArrayArrayArray19, Static238.anIntArray561, Static319.anIntArray434, Static42.anIntArray47, Static206.anIntArray263, Static357.anIntArray471, Static328.aClass4_Sub1_Sub1_Sub2_2.aByte108 + 1, local568, Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9542 >> 9, Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9540 >> 9, !Static140.aClass6_Sub48_Sub1_1.aBoolean680);
			Static482.method6632();
			if (Static557.anInt9206 == 10) {
				Static360.method5432(local128, local124, local126, local130);
				Static500.method6765(local130, local124, local126, local128);
				Static69.method1378(local128, local130, local126, local124);
				Static421.method6085(local124, local126, local128, local130);
			}
			Static564.method7584();
			Static67.anInt1407 = local285;
			Static111.anInt2160 = local175;
			Static371.anInt6572 = local138;
			Static570.anInt9340 = local287;
			Static322.anInt5904 = local283;
			if (Static63.aBoolean69 && Static489.aClass163_3.method4207() == 0) {
				Static63.aBoolean69 = false;
			}
			if (Static63.aBoolean69) {
				Static240.aClass14_7.method6859(local130, local124, local126, -16777216, local128);
				Static30.method892(Static230.aClass156_11.method4065(Static25.anInt769), Static8.aClass327_1, Static101.aClass92_9, Static240.aClass14_7, false);
			}
		} else {
			Static240.aClass14_7.method6859(arg4, arg2, arg3, -16777216, arg0);
		}
	}
}
