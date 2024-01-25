import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!ow", name = "c", descriptor = "I")
	public static int anInt8022 = 0;

	@OriginalMember(owner = "client!ow", name = "h", descriptor = "Lclient!mca;")
	public static final Class229 aClass229_12 = new Class229("game3", 2);

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(IIIBZI)V")
	public static void method7176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (Static193.aClass291ArrayArrayArray2 == null) {
			Static607.aClass101_15.method8061(arg0, arg2, -16777216, arg1, arg4);
		} else if (Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11022 >= 0 && Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11022 < Static222.anInt4533 * 512 && Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11024 >= 0 && Static668.anInt11370 * 512 > Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11024) {
			Static125.anInt2441++;
			if (Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2 != null && Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11022 - (Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.method3690() - 1) * 256 >> 9 == Static587.anInt10248 && Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11024 - (Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.method3690() - 1) * 256 >> 9 == Static472.anInt8440) {
				Static472.anInt8440 = -1;
				Static587.anInt10248 = -1;
				Static277.method9739();
			}
			Static358.method6133();
			if (!arg3) {
				Static318.method5255();
			}
			Static35.method594();
			Static127.method2286(arg1, arg4, true, arg0, arg2);
			Static165.anInt3552 = Static165.anInt3548;
			@Pc(119) int local119 = Static656.anInt11250;
			@Pc(121) int local121 = Static666.anInt11368;
			@Pc(123) int local123 = Static598.anInt10388;
			@Pc(125) int local125 = Static314.anInt5667;
			@Pc(148) int local148;
			@Pc(183) int local183;
			if (Static484.anInt8685 == 1) {
				local148 = (int) Static320.aFloat118;
				if (Static612.anInt10754 >> 8 > local148) {
					local148 = Static612.anInt10754 >> 8;
				}
				if (Static488.aBooleanArray50[4] && Static103.anIntArray95[4] + 128 > local148) {
					local148 = Static103.anIntArray95[4] + 128;
				}
				local183 = (int) Static278.aFloat108 + Static25.anInt454 & 0x3FFF;
				Static217.method4043((local148 >> 3) * 3 + 600 << 2, local183, Static10.method154(Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11024, Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11022, Static547.anInt9550) - 200, local148, Static461.anInt8253, local119, Static386.anInt7301);
			} else if (Static484.anInt8685 == 4) {
				local148 = (int) Static320.aFloat118;
				if (Static612.anInt10754 >> 8 > local148) {
					local148 = Static612.anInt10754 >> 8;
				}
				if (Static488.aBooleanArray50[4] && Static103.anIntArray95[4] + 128 > local148) {
					local148 = Static103.anIntArray95[4] + 128;
				}
				local183 = (int) Static278.aFloat108 & 0x3FFF;
				Static217.method4043((local148 >> 3) * 3 + 600 << 2, local183, Static10.method154(Static106.anInt1972, Static293.anInt7589, Static547.anInt9550) - 200, local148, Static461.anInt8253, local119, Static386.anInt7301);
			} else if (Static484.anInt8685 == 5) {
				Static198.method3807(local119);
			}
			local148 = Static108.anInt1987;
			local183 = Static229.anInt4615;
			@Pc(275) int local275 = Static598.anInt10387;
			@Pc(277) int local277 = Static550.anInt9633;
			@Pc(279) int local279 = Static152.anInt3290;
			@Pc(323) int local323;
			for (@Pc(281) int local281 = 0; local281 < 5; local281++) {
				if (Static488.aBooleanArray50[local281]) {
					local323 = (int) ((double) -Static130.anIntArray149[local281] + (double) (Static130.anIntArray149[local281] * 2 + 1) * Math.random() + Math.sin((double) Static487.anIntArray440[local281] * ((double) Static194.anIntArray191[local281] / 100.0D)) * (double) Static103.anIntArray95[local281]);
					if (local281 == 4) {
						Static550.anInt9633 += local323;
						if (Static550.anInt9633 < 1024) {
							Static550.anInt9633 = 1024;
						} else if (Static550.anInt9633 > 3072) {
							Static550.anInt9633 = 3072;
						}
					}
					if (local281 == 0) {
						Static108.anInt1987 += local323 << 2;
					}
					if (local281 == 3) {
						Static152.anInt3290 = local323 + Static152.anInt3290 & 0x3FFF;
					}
					if (local281 == 2) {
						Static598.anInt10387 += local323 << 2;
					}
					if (local281 == 1) {
						Static229.anInt4615 += local323 << 2;
					}
				}
			}
			if (Static108.anInt1987 < 0) {
				Static108.anInt1987 = 0;
			}
			if (Static598.anInt10387 < 0) {
				Static598.anInt10387 = 0;
			}
			if (Static108.anInt1987 > (Static585.anInt10170 << 9) - 1) {
				Static108.anInt1987 = (Static585.anInt10170 << 9) - 1;
			}
			if ((Static202.anInt4238 << 9) - 1 < Static598.anInt10387) {
				Static598.anInt10387 = (Static202.anInt4238 << 9) - 1;
			}
			Static51.method1033();
			Static673.method9445();
			Static607.aClass101_15.KA(local125, local121, local123 + local125, local121 + local119);
			Static102.method1769(true);
			if (Static450.aBoolean606) {
				Static140.method7795(Static383.anInt7254);
				if (Static165.anInt3552 != Static144.anInt2708) {
					Static207.aBoolean327 = true;
				}
				Static144.anInt2708 = Static165.anInt3552;
			} else {
				Static607.aClass101_15.ya();
				local323 = Static383.anInt7254;
				if (Static32.aClass251_1 == null) {
					Static607.aClass101_15.GA(local323);
				} else {
					Static32.aClass251_1.method6717(local119, local121, Static607.aClass101_15, Static550.anInt9633, Static152.anInt3290, local123, local125, Static279.anInt5178 << 3, local323);
				}
			}
			Static25.method456();
			Static435.aClass76_13.method9628(Static108.anInt1987, Static229.anInt4615, Static598.anInt10387, -Static550.anInt9633 & 0x3FFF, -Static152.anInt3290 & 0x3FFF, -Static297.anInt5413 & 0x3FFF);
			Static607.aClass101_15.method8067(Static435.aClass76_13);
			Static607.aClass101_15.DA(local123 / 2 + local125, local119 / 2 + local121, Static439.anInt7996 << 1, Static439.anInt7996 << 1);
			Static165.method3317(Static439.anInt7996 << 1, local119 / 2 + local121, Static439.anInt7996 << 1, local123 / 2 + local125);
			Static234.method4233(-Static550.anInt9633 & 0x3FFF, Static229.anInt4615, -Static152.anInt3290 & 0x3FFF, -Static297.anInt5413 & 0x3FFF, Static108.anInt1987, Static598.anInt10387);
			@Pc(571) byte local571 = Static230.aClass2_Sub54_15.aClass4_Sub17_1.method6114() == 2 ? (byte) Static125.anInt2441 : 1;
			if (Static450.aBoolean606) {
				Static20.method381(-Static550.anInt9633 & 0x3FFF, -Static152.anInt3290 & 0x3FFF, -Static297.anInt5413 & 0x3FFF);
				Static340.method5713(Static165.anInt3552, Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aByte142 + 1, Static598.anInt10387, Static433.anIntArray397, Static108.anInt1987, Static17.anIntArray439, Static630.anIntArray400, Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11022 >> 9, Static516.aByteArrayArrayArray18, local571, Static229.anInt4615, Static62.anInt1184, Static574.anIntArray509, Static525.anIntArray472, Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11024 >> 9, Static230.aClass2_Sub54_15.aClass4_Sub23_1.method7664() == 0);
			} else {
				Static398.method6583(Static62.anInt1184, Static108.anInt1987, Static229.anInt4615, Static598.anInt10387, Static516.aByteArrayArrayArray18, Static574.anIntArray509, Static525.anIntArray472, Static630.anIntArray400, Static17.anIntArray439, Static433.anIntArray397, Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aByte142 + 1, local571, Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11022 >> 9, Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11024 >> 9, Static230.aClass2_Sub54_15.aClass4_Sub23_1.method7664() == 0, Static110.aBoolean800 ? Static165.anInt3552 : -1, 0, false);
			}
			Static25.method456();
			if (Static579.anInt10049 == 10) {
				Static599.method8985(local119, local125, local121, local123);
				Static651.method9224(local123, local121, local125, local119);
				Static322.method5331(local119, local125, local123, local121);
				Static506.method7900(local121, local123, local119, local125);
			}
			Static143.method2487();
			Static550.anInt9633 = local277;
			Static229.anInt4615 = local183;
			Static598.anInt10387 = local275;
			Static108.anInt1987 = local148;
			Static152.anInt3290 = local279;
			if (Static45.aBoolean55 && Static396.aClass206_1.method5418() == 0) {
				Static45.aBoolean55 = false;
			}
			if (Static45.aBoolean55) {
				Static607.aClass101_15.method8061(local121, local119, -16777216, local125, local123);
				Static543.method8319(Static205.aClass134_12.method3906(Static204.anInt8130), Static607.aClass101_15, Static455.aClass324_11, Static230.aClass59_3, false);
			}
			Static102.method1769(false);
		} else {
			Static607.aClass101_15.method8061(arg0, arg2, -16777216, arg1, arg4);
		}
	}
}
