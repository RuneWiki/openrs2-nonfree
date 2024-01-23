import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!vn", name = "L", descriptor = "I")
	public static int anInt5469;

	@OriginalMember(owner = "client!vn", name = "S", descriptor = "[[I")
	public static int[][] anIntArrayArray43 = new int[5][5000];

	@OriginalMember(owner = "client!vn", name = "V", descriptor = "I")
	public static int anInt5477 = 0;

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "(III)V")
	public static void method4311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static241.anInt4772 > 0) {
			Static147.method2579(Static241.anInt4772);
			Static241.anInt4772 = 0;
		}
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg0 * Static50.anInt1138;
		@Pc(33) int local33 = 0;
		for (@Pc(35) int local35 = 1; local35 < 255; local35++) {
			@Pc(55) int local55 = (256 - local35) * Static266.anIntArray348[local35] / 256;
			if (local55 < 0) {
				local55 = 0;
			}
			local33 += local55;
			@Pc(69) int local69;
			for (local69 = local55; local69 < 128; local69++) {
				@Pc(79) int local79 = Static233.anIntArray408[local33++];
				@Pc(87) int local87 = Static50.anIntArray107[arg1 + local31++];
				if (local79 == 0) {
					Static278.aClass1_Sub2_Sub11_Sub2_5.anIntArray426[local27++] = local87;
				} else {
					@Pc(94) int local94 = local79 + 18;
					@Pc(98) int local98 = 238 - local79;
					if (local94 > 255) {
						local94 = 255;
					}
					local79 = Static14.anIntArray32[local79];
					if (local98 > 255) {
						local98 = 255;
					}
					Static278.aClass1_Sub2_Sub11_Sub2_5.anIntArray426[local27++] = (local94 * (local79 & 0xFF00FF) + local98 * (local87 & 0xFF00FF) & 0xFF00FF00) + (local94 * (local79 & 0xFF00) + ((local87 & 0xFF00) * local98) & 0xFF0000) >> 8;
				}
			}
			for (local69 = 0; local69 < local55; local69++) {
				Static278.aClass1_Sub2_Sub11_Sub2_5.anIntArray426[local27++] = Static50.anIntArray107[arg1 + local31++];
			}
			local31 += Static50.anInt1138 - 128;
		}
		if (Static277.aBoolean412) {
			Static41.method838(Static278.aClass1_Sub2_Sub11_Sub2_5.anIntArray426, arg1, arg0, Static278.aClass1_Sub2_Sub11_Sub2_5.anInt4874, Static278.aClass1_Sub2_Sub11_Sub2_5.anInt4869);
		} else {
			Static278.aClass1_Sub2_Sub11_Sub2_5.method3775(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(BIIIII)V")
	public static void method4312(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static126.method1523(Static22.anIntArrayArray3[arg4], arg3 + arg2, arg1, arg2 - arg3);
		@Pc(20) int local20 = 0;
		@Pc(24) int local24 = arg3 * arg3;
		@Pc(28) int local28 = arg0 * arg0;
		@Pc(30) int local30 = arg0;
		@Pc(34) int local34 = local24 << 1;
		@Pc(38) int local38 = arg0 << 1;
		@Pc(55) int local55 = local28 - (local38 - 1) * local34;
		@Pc(59) int local59 = local28 << 1;
		@Pc(68) int local68 = (1 - local38) * local24 + local59;
		@Pc(72) int local72 = local24 << 2;
		@Pc(76) int local76 = local28 << 2;
		@Pc(84) int local84 = local34 * ((arg0 << 1) - 3);
		@Pc(92) int local92 = local59 * 3;
		@Pc(98) int local98 = local76;
		@Pc(104) int local104 = (arg0 - 1) * local72;
		while (local30 > 0) {
			if (local68 < 0) {
				while (local68 < 0) {
					local55 += local98;
					local98 += local76;
					local20++;
					local68 += local92;
					local92 += local76;
				}
			}
			local30--;
			if (local55 < 0) {
				local68 += local92;
				local92 += local76;
				local20++;
				local55 += local98;
				local98 += local76;
			}
			local68 += -local104;
			local55 += -local84;
			local104 -= local72;
			@Pc(176) int local176 = arg4 - local30;
			@Pc(180) int local180 = arg4 + local30;
			local84 -= local72;
			@Pc(188) int local188 = local20 + arg2;
			@Pc(193) int local193 = arg2 - local20;
			Static126.method1523(Static22.anIntArrayArray3[local176], local188, arg1, local193);
			Static126.method1523(Static22.anIntArrayArray3[local180], local188, arg1, local193);
		}
	}

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "(B)V")
	public static void method4313() {
		Static254.aClass135_33.method3324();
	}

	@OriginalMember(owner = "client!vn", name = "f", descriptor = "(I)V")
	public static void method4315() {
		if (Static69.anInt1506 == 0 || Static69.anInt1506 == 5) {
			return;
		}
		try {
			if (++Static218.anInt4313 > 2000) {
				if (Static87.aClass113_1 != null) {
					Static87.aClass113_1.method3019();
					Static87.aClass113_1 = null;
				}
				if (Static243.anInt4820 >= 1) {
					Static113.anInt2602 = -5;
					Static69.anInt1506 = 0;
					return;
				}
				if (Static240.anInt4769 == Static61.anInt1297) {
					Static240.anInt4769 = Static101.anInt2402;
				} else {
					Static240.anInt4769 = Static61.anInt1297;
				}
				Static218.anInt4313 = 0;
				Static243.anInt4820++;
				Static69.anInt1506 = 1;
			}
			if (Static69.anInt1506 == 1) {
				Static192.aClass116_3 = Static253.aClass175_4.method4326(Static240.anInt4769, Static1.aString252);
				Static69.anInt1506 = 2;
			}
			if (Static69.anInt1506 == 2) {
				if (Static192.aClass116_3.anInt3812 == 2) {
					throw new IOException();
				}
				if (Static192.aClass116_3.anInt3812 != 1) {
					return;
				}
				Static87.aClass113_1 = new Class113((Socket) Static192.aClass116_3.anObject5, Static253.aClass175_4);
				Static192.aClass116_3 = null;
				@Pc(102) long local102 = Static189.aLong146 = Static93.method1658(Static221.aString261);
				Static283.aClass1_Sub11_Sub1_3.anInt3264 = 0;
				@Pc(112) int local112 = (int) (local102 >> 16 & 0x1FL);
				Static283.aClass1_Sub11_Sub1_3.method2655(14);
				Static283.aClass1_Sub11_Sub1_3.method2655(local112);
				Static87.aClass113_1.method3017(2, Static283.aClass1_Sub11_Sub1_3.aByteArray47);
				if (Static214.aClass52_2 != null) {
					Static214.aClass52_2.method4080();
				}
				if (Static117.aClass52_1 != null) {
					Static117.aClass52_1.method4080();
				}
				@Pc(141) int local141 = Static87.aClass113_1.method3012();
				if (Static214.aClass52_2 != null) {
					Static214.aClass52_2.method4080();
				}
				if (Static117.aClass52_1 != null) {
					Static117.aClass52_1.method4080();
				}
				if (local141 != 0) {
					Static69.anInt1506 = 0;
					Static113.anInt2602 = local141;
					Static87.aClass113_1.method3019();
					Static87.aClass113_1 = null;
					return;
				}
				Static69.anInt1506 = 3;
			}
			if (Static69.anInt1506 == 3) {
				if (Static87.aClass113_1.method3014() < 8) {
					return;
				}
				@Pc(188) int[] local188 = new int[4];
				Static87.aClass113_1.method3015(Static187.aClass1_Sub11_Sub1_2.aByteArray47, 8, 0);
				Static187.aClass1_Sub11_Sub1_2.anInt3264 = 0;
				Static189.aLong147 = Static187.aClass1_Sub11_Sub1_2.method2646();
				local188[1] = (int) (Math.random() * 9.9999999E7D);
				Static283.aClass1_Sub11_Sub1_3.anInt3264 = 0;
				local188[0] = (int) (Math.random() * 9.9999999E7D);
				local188[3] = (int) Static189.aLong147;
				local188[2] = (int) (Static189.aLong147 >> 32);
				Static283.aClass1_Sub11_Sub1_3.method2655(10);
				Static283.aClass1_Sub11_Sub1_3.method2659(local188[0]);
				Static283.aClass1_Sub11_Sub1_3.method2659(local188[1]);
				Static283.aClass1_Sub11_Sub1_3.method2659(local188[2]);
				Static283.aClass1_Sub11_Sub1_3.method2659(local188[3]);
				Static283.aClass1_Sub11_Sub1_3.method2673(Static93.method1658(Static221.aString261));
				Static283.aClass1_Sub11_Sub1_3.method2628(Static236.aString271);
				Static283.aClass1_Sub11_Sub1_3.method2687(Static233.aBigInteger2, Static87.aBigInteger1);
				Static88.aClass1_Sub11_Sub1_1.anInt3264 = 0;
				if (Static194.anInt4017 == 40) {
					Static88.aClass1_Sub11_Sub1_1.method2655(18);
				} else {
					Static88.aClass1_Sub11_Sub1_1.method2655(16);
				}
				Static88.aClass1_Sub11_Sub1_1.method2660(Static283.aClass1_Sub11_Sub1_3.anInt3264 + Static88.method1533(Static253.aString292) + 163);
				Static88.aClass1_Sub11_Sub1_1.method2659(541);
				Static88.aClass1_Sub11_Sub1_1.method2655(Static74.anInt1597);
				Static88.aClass1_Sub11_Sub1_1.method2655(Static87.aBoolean139 ? 1 : 0);
				Static88.aClass1_Sub11_Sub1_1.method2655(1);
				Static88.aClass1_Sub11_Sub1_1.method2655(Static31.method647());
				Static88.aClass1_Sub11_Sub1_1.method2660(Static3.anInt122);
				Static88.aClass1_Sub11_Sub1_1.method2660(Static148.anInt3206);
				Static88.aClass1_Sub11_Sub1_1.method2655(Static63.anInt1347);
				Static62.method1120(Static88.aClass1_Sub11_Sub1_1);
				Static88.aClass1_Sub11_Sub1_1.method2628(Static253.aString292);
				Static88.aClass1_Sub11_Sub1_1.method2659(Static98.anInt2315);
				Static88.aClass1_Sub11_Sub1_1.method2659(Static209.method3325());
				Static21.aBoolean32 = true;
				Static88.aClass1_Sub11_Sub1_1.method2660(Static61.anInt1305);
				Static88.aClass1_Sub11_Sub1_1.method2659(Static230.aClass91_72.method2503());
				Static88.aClass1_Sub11_Sub1_1.method2659(Static232.aClass91_168.method2503());
				Static88.aClass1_Sub11_Sub1_1.method2659(Static85.aClass91_67.method2503());
				Static88.aClass1_Sub11_Sub1_1.method2659(Static246.aClass91_176.method2503());
				Static88.aClass1_Sub11_Sub1_1.method2659(Static68.aClass91_56.method2503());
				Static88.aClass1_Sub11_Sub1_1.method2659(Static203.aClass91_157.method2503());
				Static88.aClass1_Sub11_Sub1_1.method2659(Static197.aClass91_152.method2503());
				Static88.aClass1_Sub11_Sub1_1.method2659(Static230.aClass91_73.method2503());
				Static88.aClass1_Sub11_Sub1_1.method2659(Static134.aClass91_110.method2503());
				Static88.aClass1_Sub11_Sub1_1.method2659(Static191.aClass91_150.method2503());
				Static88.aClass1_Sub11_Sub1_1.method2659(Static211.aClass91_158.method2503());
				Static88.aClass1_Sub11_Sub1_1.method2659(Static49.aClass91_45.method2503());
				Static88.aClass1_Sub11_Sub1_1.method2659(Static164.aClass91_129.method2503());
				Static88.aClass1_Sub11_Sub1_1.method2659(Static24.aClass91_169.method2503());
				Static88.aClass1_Sub11_Sub1_1.method2659(Static201.aClass91_154.method2503());
				Static88.aClass1_Sub11_Sub1_1.method2659(Static61.aClass91_52.method2503());
				Static88.aClass1_Sub11_Sub1_1.method2659(Static43.aClass91_37.method2503());
				Static88.aClass1_Sub11_Sub1_1.method2659(Static221.aClass91_164.method2503());
				Static88.aClass1_Sub11_Sub1_1.method2659(Static281.aClass91_194.method2503());
				Static88.aClass1_Sub11_Sub1_1.method2659(Static296.aClass91_204.method2503());
				Static88.aClass1_Sub11_Sub1_1.method2659(Static130.aClass91_102.method2503());
				Static88.aClass1_Sub11_Sub1_1.method2659(Static165.aClass91_132.method2503());
				Static88.aClass1_Sub11_Sub1_1.method2659(Static134.aClass91_107.method2503());
				Static88.aClass1_Sub11_Sub1_1.method2659(Static106.aClass91_88.method2503());
				Static88.aClass1_Sub11_Sub1_1.method2659(Static61.aClass91_51.method2503());
				Static88.aClass1_Sub11_Sub1_1.method2659(Static102.aClass91_85.method2503());
				Static88.aClass1_Sub11_Sub1_1.method2659(Static49.aClass91_44.method2503());
				Static88.aClass1_Sub11_Sub1_1.method2659(Static268.aClass91_193.method2503());
				Static88.aClass1_Sub11_Sub1_1.method2659(Static109.aClass91_91.method2503());
				Static88.aClass1_Sub11_Sub1_1.method2689(Static283.aClass1_Sub11_Sub1_3.anInt3264, Static283.aClass1_Sub11_Sub1_3.aByteArray47);
				Static87.aClass113_1.method3017(Static88.aClass1_Sub11_Sub1_1.anInt3264, Static88.aClass1_Sub11_Sub1_1.aByteArray47);
				Static283.aClass1_Sub11_Sub1_3.method2694(local188);
				for (@Pc(579) int local579 = 0; local579 < 4; local579++) {
					local188[local579] += 50;
				}
				Static187.aClass1_Sub11_Sub1_2.method2694(local188);
				Static69.anInt1506 = 4;
			}
			if (Static69.anInt1506 == 4) {
				if (Static87.aClass113_1.method3014() < 1) {
					return;
				}
				@Pc(613) int local613 = Static87.aClass113_1.method3012();
				if (local613 == 21) {
					Static69.anInt1506 = 7;
				} else if (local613 == 29) {
					Static69.anInt1506 = 10;
				} else if (local613 == 1) {
					Static113.anInt2602 = local613;
					Static69.anInt1506 = 5;
					return;
				} else if (local613 == 2) {
					Static69.anInt1506 = 8;
				} else if (local613 == 15) {
					Static69.anInt1506 = 0;
					Static113.anInt2602 = local613;
					return;
				} else if (local613 == 23 && Static243.anInt4820 < 1) {
					Static218.anInt4313 = 0;
					Static69.anInt1506 = 1;
					Static243.anInt4820++;
					Static87.aClass113_1.method3019();
					Static87.aClass113_1 = null;
					return;
				} else {
					Static113.anInt2602 = local613;
					Static69.anInt1506 = 0;
					Static87.aClass113_1.method3019();
					Static87.aClass113_1 = null;
					return;
				}
			}
			if (Static69.anInt1506 == 6) {
				Static283.aClass1_Sub11_Sub1_3.anInt3264 = 0;
				Static283.aClass1_Sub11_Sub1_3.method2697(17);
				Static87.aClass113_1.method3017(Static283.aClass1_Sub11_Sub1_3.anInt3264, Static283.aClass1_Sub11_Sub1_3.aByteArray47);
				Static69.anInt1506 = 4;
				return;
			}
			label295: {
				if (Static69.anInt1506 != 7) {
					if (Static69.anInt1506 == 10) {
						if (Static87.aClass113_1.method3014() < 1) {
							return;
						}
						Static149.anInt3220 = Static87.aClass113_1.method3012();
						Static69.anInt1506 = 0;
						Static113.anInt2602 = 29;
						Static87.aClass113_1.method3019();
						Static87.aClass113_1 = null;
						return;
					}
					if (Static69.anInt1506 != 8) {
						break label295;
					}
					if (Static87.aClass113_1.method3014() >= 14) {
						Static87.aClass113_1.method3015(Static187.aClass1_Sub11_Sub1_2.aByteArray47, 14, 0);
						Static187.aClass1_Sub11_Sub1_2.anInt3264 = 0;
						Static31.anInt745 = Static187.aClass1_Sub11_Sub1_2.method2690();
						Static276.anInt2915 = Static187.aClass1_Sub11_Sub1_2.method2690();
						Static127.aBoolean211 = Static187.aClass1_Sub11_Sub1_2.method2690() == 1;
						Static296.aBoolean449 = Static187.aClass1_Sub11_Sub1_2.method2690() == 1;
						Static232.aBoolean352 = Static187.aClass1_Sub11_Sub1_2.method2690() == 1;
						Static147.aBoolean235 = Static187.aClass1_Sub11_Sub1_2.method2690() == 1;
						Static3.aBoolean8 = Static187.aClass1_Sub11_Sub1_2.method2690() == 1;
						Static71.anInt1526 = Static187.aClass1_Sub11_Sub1_2.method2691();
						Static33.aBoolean56 = Static187.aClass1_Sub11_Sub1_2.method2690() == 1;
						Static189.aBoolean296 = Static187.aClass1_Sub11_Sub1_2.method2690() == 1;
						Static296.method4434(Static189.aBoolean296);
						Static102.method1902(Static189.aBoolean296);
						if (!Static87.aBoolean139) {
							if (Static127.aBoolean211 && !Static232.aBoolean352 || Static33.aBoolean56) {
								try {
									Static309.method3982(Static253.aClass175_4.anApplet1, "zap");
								} catch (@Pc(895) Throwable local895) {
								}
							} else {
								try {
									Static309.method3982(Static253.aClass175_4.anApplet1, "unzap");
								} catch (@Pc(907) Throwable local907) {
								}
							}
						}
						try {
							Static309.method3982(Static253.aClass175_4.anApplet1, "loggedin");
						} catch (@Pc(915) Throwable local915) {
						}
						Static201.anInt4077 = Static187.aClass1_Sub11_Sub1_2.method2702();
						Static33.anInt762 = Static187.aClass1_Sub11_Sub1_2.method2691();
						Static69.anInt1506 = 9;
						break label295;
					}
					return;
				}
				if (Static87.aClass113_1.method3014() >= 1) {
					Static256.anInt5016 = Static87.aClass113_1.method3012() * 60 + 180;
					Static113.anInt2602 = 21;
					Static69.anInt1506 = 0;
					Static87.aClass113_1.method3019();
					Static87.aClass113_1 = null;
					return;
				}
				return;
			}
			if (Static69.anInt1506 == 9) {
				if (Static87.aClass113_1.method3014() < Static33.anInt762) {
					return;
				}
				Static187.aClass1_Sub11_Sub1_2.anInt3264 = 0;
				Static87.aClass113_1.method3015(Static187.aClass1_Sub11_Sub1_2.aByteArray47, Static33.anInt762, 0);
				Static69.anInt1506 = 0;
				Static113.anInt2602 = 2;
				Static141.method2343();
				Static181.anInt3792 = -1;
				Static6.method207(false);
				Static201.anInt4077 = -1;
				return;
			}
		} catch (@Pc(962) IOException local962) {
			if (Static87.aClass113_1 != null) {
				Static87.aClass113_1.method3019();
				Static87.aClass113_1 = null;
			}
			if (Static243.anInt4820 >= 1) {
				Static69.anInt1506 = 0;
				Static113.anInt2602 = -4;
			} else {
				if (Static61.anInt1297 == Static240.anInt4769) {
					Static240.anInt4769 = Static101.anInt2402;
				} else {
					Static240.anInt4769 = Static61.anInt1297;
				}
				Static243.anInt4820++;
				Static218.anInt4313 = 0;
				Static69.anInt1506 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lclient!in;I)Ljava/lang/String;")
	public static String method4316(@OriginalArg(0) Class71 arg0) {
		if (Static36.method769(arg0).method1375() == 0) {
			return null;
		} else if (arg0.aString155 == null || arg0.aString155.trim().length() == 0) {
			return Static178.aBoolean303 ? "Hidden-use" : null;
		} else {
			return arg0.aString155;
		}
	}

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "(III)I")
	public static int method4317(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1;
		} else {
			arg1 = (arg0 & 0x7F) * arg1 >> 7;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return (arg0 & 0xFF80) + arg1;
		}
	}
}
