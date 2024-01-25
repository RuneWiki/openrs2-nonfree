import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!pc", name = "jb", descriptor = "Lclient!aga;")
	public static Class9 aClass9_1;

	@OriginalMember(owner = "client!pc", name = "K", descriptor = "Lclient!mf;")
	public static final Class222 aClass222_42 = new Class222(5);

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "(I)V")
	public static void method5491() {
		if (Static61.anInt1176 == 0) {
			return;
		}
		try {
			if (++Static112.anInt2212 > 2000) {
				if (Static568.aClass149_2 != null) {
					Static568.aClass149_2.method3281();
					Static568.aClass149_2 = null;
				}
				if (Static156.anInt2835 >= 2) {
					Static61.anInt1176 = 0;
					Static218.anInt4197 = -5;
					return;
				}
				Static536.aClass227_4.method4534();
				Static112.anInt2212 = 0;
				Static156.anInt2835++;
				Static61.anInt1176 = 1;
			}
			if (Static61.anInt1176 == 1) {
				Static216.aClass260_7 = Static536.aClass227_4.method4535(Static362.aClass109_5);
				Static61.anInt1176 = 2;
			}
			if (Static61.anInt1176 == 2) {
				if (Static216.aClass260_7.anInt7041 == 2) {
					throw new IOException();
				}
				if (Static216.aClass260_7.anInt7041 != 1) {
					return;
				}
				Static568.aClass149_2 = Static303.method4269((Socket) Static216.aClass260_7.anObject16);
				Static216.aClass260_7 = null;
				Static173.method2438();
				Static61.anInt1176 = 4;
			}
			@Pc(119) int local119;
			if (Static61.anInt1176 == 4) {
				if (!Static568.aClass149_2.method3280(1)) {
					return;
				}
				Static568.aClass149_2.method3278(1, Static585.aClass1_Sub35_Sub2_2.aByteArray85, 0);
				local119 = Static585.aClass1_Sub35_Sub2_2.aByteArray85[0] & 0xFF;
				if (local119 != 21) {
					Static218.anInt4197 = local119;
					Static61.anInt1176 = 0;
					Static568.aClass149_2.method3281();
					Static568.aClass149_2 = null;
					return;
				}
				Static61.anInt1176 = 5;
			}
			if (Static61.anInt1176 == 5) {
				if (!Static568.aClass149_2.method3280(1)) {
					return;
				}
				Static568.aClass149_2.method3278(1, Static585.aClass1_Sub35_Sub2_2.aByteArray85, 0);
				Static463.aStringArray33 = new String[Static585.aClass1_Sub35_Sub2_2.aByteArray85[0] & 0xFF];
				Static61.anInt1176 = 6;
			}
			if (Static61.anInt1176 == 6 && Static568.aClass149_2.method3280(Static463.aStringArray33.length * 8)) {
				Static585.aClass1_Sub35_Sub2_2.anInt7214 = 0;
				Static568.aClass149_2.method3278(Static463.aStringArray33.length * 8, Static585.aClass1_Sub35_Sub2_2.aByteArray85, 0);
				for (local119 = 0; local119 < Static463.aStringArray33.length; local119++) {
					Static463.aStringArray33[local119] = Static91.method1613(Static585.aClass1_Sub35_Sub2_2.method5778());
				}
				Static61.anInt1176 = 0;
				Static218.anInt4197 = 21;
				Static568.aClass149_2.method3281();
				Static568.aClass149_2 = null;
			}
		} catch (@Pc(231) IOException local231) {
			if (Static568.aClass149_2 != null) {
				Static568.aClass149_2.method3281();
				Static568.aClass149_2 = null;
			}
			if (Static156.anInt2835 < 2) {
				Static536.aClass227_4.method4534();
				Static112.anInt2212 = 0;
				Static61.anInt1176 = 1;
				Static156.anInt2835++;
			} else {
				Static218.anInt4197 = -4;
				Static61.anInt1176 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BII)V")
	public static void method5494(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static373.aClass334_13.method7354(Static568.aClass351_28.method7651(Static307.anInt5279));
		@Pc(24) int local24;
		for (@Pc(18) Class1_Sub51 local18 = (Class1_Sub51) Static310.aClass353_32.method7677(); local18 != null; local18 = (Class1_Sub51) Static310.aClass353_32.method7687()) {
			local24 = Static385.method5301(local18);
			if (local13 < local24) {
				local13 = local24;
			}
		}
		local13 += 8;
		local24 = Static337.anInt8004 * 16 + 21;
		@Pc(54) int local54 = arg0 - local13 / 2;
		if (local54 + local13 > Static130.anInt2566) {
			local54 = Static130.anInt2566 - local13;
		}
		if (local54 < 0) {
			local54 = 0;
		}
		@Pc(79) int local79 = arg1;
		if (Static499.anInt4149 < arg1 + local24) {
			local79 = Static499.anInt4149 - local24;
		}
		Static330.anInt5532 = local54;
		if (local79 < 0) {
			local79 = 0;
		}
		Static110.anInt2169 = Static337.anInt8004 * 16 + (Static244.aBoolean336 ? 26 : 22);
		Static518.anInt8770 = local79;
		Static554.aBoolean708 = true;
		Static274.anInt307 = local13;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZIIIII)V")
	public static void method5495(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static292.aClass39ArrayArrayArray2 == null) {
			Static16.aClass134_1.method6929(arg1, arg2, arg3, -16777216, arg4);
		} else if (Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9365 >= 0 && Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9365 < Static71.anInt1410 * 512 && Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9370 >= 0 && Static471.anInt8012 * 512 > Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9370) {
			Static350.anInt5818++;
			if (Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1 != null && Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9365 + 256 - Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.method5434() * 256 >> 9 == Static228.anInt4297 && Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9370 + 256 - Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.method5434() * 256 >> 9 == Static66.anInt1351) {
				Static66.anInt1351 = -1;
				Static228.anInt4297 = -1;
				Static248.method3688();
			}
			Static112.method1783();
			if (!arg0) {
				Static244.method3655();
			}
			Static163.method2383();
			Static308.method4291(true, arg3, arg4, arg1, arg2);
			@Pc(120) int local120 = Static126.anInt2508;
			@Pc(122) int local122 = Static31.anInt508;
			@Pc(124) int local124 = Static447.anInt7726;
			@Pc(126) int local126 = Static535.anInt8945;
			@Pc(132) int local132;
			@Pc(165) int local165;
			if (Static340.anInt5707 == 1) {
				local132 = (int) Static287.aFloat117;
				if (local132 < Static348.anInt5785 >> 8) {
					local132 = Static348.anInt5785 >> 8;
				}
				if (Static227.aBooleanArray6[4] && local132 < Static513.anIntArray659[4] + 128) {
					local132 = Static513.anIntArray659[4] + 128;
				}
				local165 = (int) Static167.aFloat59 + Static482.anInt8102 & 0x3FFF;
				Static39.method545(Static66.method1191(Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9365, Static433.anInt7592, Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9370) - 200, local122, local165, (local132 >> 3) * 3 + 600 << 2, Static301.anInt5198, Static417.anInt7669, local132);
			} else if (Static340.anInt5707 == 4) {
				local132 = (int) Static287.aFloat117;
				if (Static348.anInt5785 >> 8 > local132) {
					local132 = Static348.anInt5785 >> 8;
				}
				if (Static227.aBooleanArray6[4] && Static513.anIntArray659[4] + 128 > local132) {
					local132 = Static513.anIntArray659[4] + 128;
				}
				local165 = (int) Static167.aFloat59 & 0x3FFF;
				Static39.method545(Static66.method1191(Static177.anInt3135, Static433.anInt7592, Static308.anInt5286) - 200, local122, local165, (local132 >> 3) * 3 + 600 << 2, Static301.anInt5198, Static417.anInt7669, local132);
			} else if (Static340.anInt5707 == 5) {
				Static398.method5569(local122);
			}
			local132 = Static405.anInt7085;
			local165 = Static295.anInt5077;
			@Pc(272) int local272 = Static59.anInt1132;
			@Pc(274) int local274 = Static103.anInt2093;
			@Pc(276) int local276 = Static561.anInt9344;
			@Pc(320) int local320;
			for (@Pc(278) int local278 = 0; local278 < 5; local278++) {
				if (Static227.aBooleanArray6[local278]) {
					local320 = (int) ((double) -Static557.anIntArray709[local278] + Math.random() * (double) (Static557.anIntArray709[local278] * 2 + 1) + Math.sin((double) Static342.anIntArray465[local278] * ((double) Static594.anIntArray739[local278] / 100.0D)) * (double) Static513.anIntArray659[local278]);
					if (local278 == 3) {
						Static561.anInt9344 = local320 + Static561.anInt9344 & 0x3FFF;
					}
					if (local278 == 0) {
						Static405.anInt7085 += local320 << 2;
					}
					if (local278 == 1) {
						Static295.anInt5077 += local320 << 2;
					}
					if (local278 == 2) {
						Static59.anInt1132 += local320 << 2;
					}
					if (local278 == 4) {
						Static103.anInt2093 += local320;
						if (Static103.anInt2093 < 1024) {
							Static103.anInt2093 = 1024;
						} else if (Static103.anInt2093 > 3072) {
							Static103.anInt2093 = 3072;
						}
					}
				}
			}
			if (Static405.anInt7085 < 0) {
				Static405.anInt7085 = 0;
			}
			if (Static59.anInt1132 < 0) {
				Static59.anInt1132 = 0;
			}
			if (Static405.anInt7085 > (Static27.anInt373 << 9) - 1) {
				Static405.anInt7085 = (Static27.anInt373 << 9) - 1;
			}
			if ((Static507.anInt8645 << 9) - 1 < Static59.anInt1132) {
				Static59.anInt1132 = (Static507.anInt8645 << 9) - 1;
			}
			Static65.method1180();
			Static360.method4786();
			Static16.aClass134_1.da(local126, local124, local120 + local126, local122 + local124);
			Static16.aClass134_1.ya();
			local320 = Static561.anInt9348;
			if (Static544.aClass197_1 == null) {
				Static16.aClass134_1.ja(local320);
			} else {
				Static544.aClass197_1.method3944(local122, Static198.anInt3676 << 3, local120, Static103.anInt2093, local320, Static561.anInt9344, Static16.aClass134_1, local124, local126);
			}
			Static510.method7089();
			Static458.aClass113_6.na(Static405.anInt7085, Static295.anInt5077, Static59.anInt1132, -Static103.anInt2093 & 0x3FFF, -Static561.anInt9344 & 0x3FFF, -Static395.anInt6894 & 0x3FFF);
			Static16.aClass134_1.method6919(Static458.aClass113_6);
			Static16.aClass134_1.la(local120 / 2 + local126, local122 / 2 + local124, Static488.anInt2823 << 1, Static488.anInt2823 << 1);
			Static197.method5027(local120 / 2 + local126, Static488.anInt2823 << 1, Static488.anInt2823 << 1, local122 / 2 + local124);
			Static158.method2287(-Static103.anInt2093 & 0x3FFF, -Static395.anInt6894 & 0x3FFF, Static405.anInt7085, Static295.anInt5077, -Static561.anInt9344 & 0x3FFF, Static59.anInt1132);
			@Pc(556) byte local556 = Static348.aClass1_Sub30_Sub1_1.method3916(Static113.anInt2222) == 2 ? (byte) Static350.anInt5818 : 1;
			Static306.method3651(Static301.anInt5197, Static405.anInt7085, Static295.anInt5077, Static59.anInt1132, Static165.aByteArrayArrayArray13, Static441.anIntArray644, Static401.anIntArray539, Static164.anIntArray688, Static409.anIntArray543, Static109.anIntArray265, Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aByte123 + 1, local556, Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9365 >> 9, Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9370 >> 9, !Static348.aClass1_Sub30_Sub1_1.aBoolean396);
			Static510.method7089();
			if (Static216.anInt4135 == 10) {
				Static471.method6442(local124, local122, local126, local120);
				Static235.method3563(local124, local120, local122, local126);
				Static365.method4941(local126, local124, local122, local120);
				Static499.method3356(local120, local122, local126, local124);
			}
			Static287.method4060();
			Static405.anInt7085 = local132;
			Static103.anInt2093 = local274;
			Static561.anInt9344 = local276;
			Static295.anInt5077 = local165;
			Static59.anInt1132 = local272;
			if (Static314.aBoolean429 && aClass9_1.method129() == 0) {
				Static314.aBoolean429 = false;
			}
			if (Static314.aBoolean429) {
				Static16.aClass134_1.method6929(local120, local124, local126, -16777216, local122);
				Static152.method2206(Static442.aClass64_12, false, Static268.aClass334_14, Static16.aClass134_1, Static568.aClass351_16.method7651(Static307.anInt5279));
			}
		} else {
			Static16.aClass134_1.method6929(arg1, arg2, arg3, -16777216, arg4);
		}
	}
}
