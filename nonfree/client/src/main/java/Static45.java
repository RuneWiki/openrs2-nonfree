import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "Lclient!dca;")
	public static Class75 aClass75_1;

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "Lclient!mp;")
	public static final Class242 aClass242_1 = new Class242("WTRC", "office", "_rc", 1);

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIIIZI)V")
	public static void method786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (Static283.aClass128ArrayArrayArray1 == null) {
			Static273.aClass100_6.method8644(arg0, -16777216, arg2, arg1, arg3);
		} else if (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9805 >= 0 && Static271.anInt4910 * 512 > Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9805 && Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9803 >= 0 && Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9803 < Static613.anInt9909 * 512) {
			Static154.anInt3001++;
			if (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4 != null && Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9805 - (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.method5932() - 1) * 256 >> 9 == Static19.anInt250 && Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9803 - (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.method5932() - 1) * 256 >> 9 == Static405.anInt10904) {
				Static405.anInt10904 = -1;
				Static19.anInt250 = -1;
				Static102.method1577();
			}
			Static392.method5787();
			if (!arg4) {
				Static469.method6629();
			}
			Static334.method8473();
			Static294.method4650(arg2, true, arg0, arg3, arg1);
			@Pc(129) int local129 = Static455.anInt7373;
			@Pc(136) int local136 = Static418.anInt7052;
			@Pc(138) int local138 = Static391.anInt6612;
			Static216.anInt1170 = Static216.anInt1166;
			@Pc(142) int local142 = Static98.anInt1631;
			@Pc(148) int local148;
			@Pc(187) int local187;
			if (Static426.anInt7111 == 1) {
				local148 = (int) Static211.aFloat113;
				if (Static464.anInt7536 >> 8 > local148) {
					local148 = Static464.anInt7536 >> 8;
				}
				if (Static322.aBooleanArray14[4] && local148 < Static328.anIntArray322[4] + 128) {
					local148 = Static328.anIntArray322[4] + 128;
				}
				local187 = Static285.anInt5040 + (int) Static243.aFloat117 & 0x3FFF;
				Static320.method4906(local129, local148, Static461.method6500(Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9805, Static324.anInt5529, Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9803) - 200, (local148 >> 3) * 3 + 600 << 2, Static343.anInt5712, local187, Static620.anInt8145);
			} else if (Static426.anInt7111 == 4) {
				local148 = (int) Static211.aFloat113;
				if (local148 < Static464.anInt7536 >> 8) {
					local148 = Static464.anInt7536 >> 8;
				}
				if (Static322.aBooleanArray14[4] && Static328.anIntArray322[4] + 128 > local148) {
					local148 = Static328.anIntArray322[4] + 128;
				}
				local187 = (int) Static243.aFloat117 & 0x3FFF;
				Static320.method4906(local129, local148, Static461.method6500(Static488.anInt7900, Static324.anInt5529, Static334.anInt9969) - 200, (local148 >> 3) * 3 + 600 << 2, Static343.anInt5712, local187, Static620.anInt8145);
			} else if (Static426.anInt7111 == 5) {
				Static296.method4671(local129);
			}
			local148 = Static141.anInt2764;
			local187 = Static42.anInt703;
			@Pc(298) int local298 = Static282.anInt5025;
			@Pc(300) int local300 = Static96.anInt10862;
			@Pc(302) int local302 = Static542.anInt8612;
			@Pc(347) int local347;
			for (@Pc(304) int local304 = 0; local304 < 5; local304++) {
				if (Static322.aBooleanArray14[local304]) {
					local347 = (int) (Math.random() * (double) (Static656.anIntArray611[local304] * 2 + 1) - (double) Static656.anIntArray611[local304] + Math.sin((double) Static41.anIntArray50[local304] * ((double) Static564.anIntArray509[local304] / 100.0D)) * (double) Static328.anIntArray322[local304]);
					if (local304 == 2) {
						Static282.anInt5025 += local347 << 2;
					}
					if (local304 == 4) {
						Static96.anInt10862 += local347;
						if (Static96.anInt10862 < 1024) {
							Static96.anInt10862 = 1024;
						} else if (Static96.anInt10862 > 3072) {
							Static96.anInt10862 = 3072;
						}
					}
					if (local304 == 0) {
						Static141.anInt2764 += local347 << 2;
					}
					if (local304 == 3) {
						Static542.anInt8612 = local347 + Static542.anInt8612 & 0x3FFF;
					}
					if (local304 == 1) {
						Static42.anInt703 += local347 << 2;
					}
				}
			}
			if (Static141.anInt2764 < 0) {
				Static141.anInt2764 = 0;
			}
			if ((Static672.anInt10829 << 9) - 1 < Static141.anInt2764) {
				Static141.anInt2764 = (Static672.anInt10829 << 9) - 1;
			}
			if (Static282.anInt5025 < 0) {
				Static282.anInt5025 = 0;
			}
			if (Static282.anInt5025 > (Static532.anInt8517 << 9) - 1) {
				Static282.anInt5025 = (Static532.anInt8517 << 9) - 1;
			}
			Static499.method6954();
			Static231.method3636();
			Static273.aClass100_6.KA(local138, local136, local138 + local142, local129 + local136);
			Static529.method7243(true);
			if (Static377.aBoolean419) {
				Static589.method8128(Static602.anInt9697);
				if (Static216.anInt1170 != Static543.anInt8641) {
					Static597.aBoolean675 = true;
				}
				Static543.anInt8641 = Static216.anInt1170;
			} else {
				Static273.aClass100_6.ya();
				local347 = Static602.anInt9697;
				if (Static572.aClass173_1 == null) {
					Static273.aClass100_6.GA(local347);
				} else {
					Static572.aClass173_1.method3975(local129, Static273.aClass100_6, Static96.anInt10862, local347, local136, Static443.anInt7298 << 3, local142, Static542.anInt8612, local138);
				}
			}
			Static455.method6423();
			Static155.aClass10_2.method4220(Static141.anInt2764, Static42.anInt703, Static282.anInt5025, -Static96.anInt10862 & 0x3FFF, -Static542.anInt8612 & 0x3FFF, -Static331.anInt5582 & 0x3FFF);
			Static273.aClass100_6.method8590(Static155.aClass10_2);
			Static273.aClass100_6.DA(local142 / 2 + local138, local129 / 2 + local136, Static167.anInt3248 << 1, Static167.anInt3248 << 1);
			Static562.method7597(Static167.anInt3248 << 1, Static167.anInt3248 << 1, local138 + local142 / 2, local129 / 2 + local136);
			Static272.method4457(Static282.anInt5025, Static42.anInt703, Static141.anInt2764, -Static331.anInt5582 & 0x3FFF, -Static542.anInt8612 & 0x3FFF, -Static96.anInt10862 & 0x3FFF);
			@Pc(640) byte local640 = Static577.aClass5_Sub19_25.aClass17_Sub19_2.method6648() == 2 ? (byte) Static154.anInt3001 : 1;
			if (Static377.aBoolean419) {
				Static332.method5022(-Static331.anInt5582 & 0x3FFF, -Static542.anInt8612 & 0x3FFF, -Static96.anInt10862 & 0x3FFF);
				Static317.method4847(Static42.anInt703, Static216.anInt1170, Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9805 >> 9, Static524.aByteArrayArrayArray22, Static282.anInt5025, Static250.anIntArray249, Static565.anInt8921, local640, Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aByte139 + 1, Static371.anIntArray362, Static577.aClass5_Sub19_25.aClass17_Sub14_1.method5118() == 0, Static497.anIntArray462, Static442.anIntArray434, Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9803 >> 9, Static553.anIntArray497, Static141.anInt2764);
			} else {
				Static2.method20(Static565.anInt8921, Static141.anInt2764, Static42.anInt703, Static282.anInt5025, Static524.aByteArrayArrayArray22, Static371.anIntArray362, Static250.anIntArray249, Static553.anIntArray497, Static442.anIntArray434, Static497.anIntArray462, Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aByte139 + 1, local640, Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9805 >> 9, Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9803 >> 9, Static577.aClass5_Sub19_25.aClass17_Sub14_1.method5118() == 0, Static305.aBoolean339 ? Static216.anInt1170 : -1, 0, false);
			}
			Static455.method6423();
			if (Static652.anInt10664 == 11) {
				Static553.method7512(local136, 2, 256, local129, local138, 256, local142);
				Static304.method4755(local142, local129, local136, local138);
				Static653.method8999(local138, local142, local129, local136);
				Static403.method5894(local129, local138, local142, local136);
			}
			Static110.method8139();
			Static96.anInt10862 = local300;
			Static282.anInt5025 = local298;
			Static141.anInt2764 = local148;
			Static542.anInt8612 = local302;
			Static42.anInt703 = local187;
			if (Static524.aBoolean552 && Static93.aClass241_1.method5541() == 0) {
				Static524.aBoolean552 = false;
			}
			if (Static524.aBoolean552) {
				Static273.aClass100_6.method8644(local136, -16777216, local142, local138, local129);
				Static636.method8809(false, Static273.aClass100_6, Static85.aClass196_38, Static184.aClass131_13.method3168(Static375.anInt7800), Static414.aClass70_6);
			}
			Static529.method7243(false);
		} else {
			Static273.aClass100_6.method8644(arg0, -16777216, arg2, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(III)Z")
	public static boolean method787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x84080) != 0;
	}
}
