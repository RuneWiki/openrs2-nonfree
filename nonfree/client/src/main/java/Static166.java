import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
	public static int anInt3318;

	@OriginalMember(owner = "client!kg", name = "y", descriptor = "I")
	public static int anInt3323;

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
	public static int anInt3304 = -1;

	@OriginalMember(owner = "client!kg", name = "v", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_76 = new Class85("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!kg", name = "x", descriptor = "[I")
	public static final int[] anIntArray350 = new int[32];

	@OriginalMember(owner = "client!kg", name = "z", descriptor = "Z")
	public static boolean aBoolean259 = false;

	@OriginalMember(owner = "client!kg", name = "A", descriptor = "I")
	public static int anInt3324 = 0;

	@OriginalMember(owner = "client!kg", name = "B", descriptor = "I")
	public static int anInt3325 = 0;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!ae;IBZILclient!ae;Z)I")
	public static int method3022(@OriginalArg(0) Class6_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class6_Sub1 arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) int local10 = Static346.method5926(arg0, arg4, arg2, arg1);
		if (local10 != 0) {
			return arg2 ? -local10 : local10;
		} else if (arg3 == -1) {
			return 0;
		} else {
			@Pc(40) int local40 = Static346.method5926(arg0, arg4, arg5, arg3);
			return arg5 ? -local40 : local40;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)V")
	public static void method3023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class174 local7 = Static178.aClass174ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass4_Sub1_2 != null) {
			local7.aClass4_Sub1_2 = null;
		}
		if (local7.aClass4_Sub1_1 != null) {
			local7.aClass4_Sub1_1 = null;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(BLclient!rg;)Ljava/lang/String;")
	public static String method3024(@OriginalArg(1) Class5_Sub12 arg0) {
		return Static350.method5958(arg0);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
	public static void method3025() {
		Static111.method1966();
		Static96.method1762();
		Static136.method2408();
		Static137.method2430();
		Static37.method585();
		Static181.method3301();
		Static344.method5890();
		Static224.method4078();
		Static122.method2147();
		Static188.method3360();
		Static88.method1590();
		Static37.method584();
		Static227.method4122();
		Static284.method4947();
		Static297.method5148();
		Static24.method5488();
		Static202.method3711();
		Static184.method5035();
		Static159.method2821();
		Static190.method423();
		Static176.method3175();
		Static171.method3124();
		if (Static125.anInt2409 != 0) {
			for (@Pc(51) int local51 = 0; local51 < Static94.aByteArrayArray7.length; local51++) {
				Static94.aByteArrayArray7[local51] = null;
			}
			Static193.anInt3688 = 0;
		}
		Static38.method601();
		Static330.method5728();
		Static200.method3524();
		Static182.method3318();
		Static242.method4302();
		Static108.aClass109_24.method2858();
		Static236.aClass55_9.method5199();
		Static4.aClass122_1.method3179();
		Static159.method2835();
		Static183.aClass93_69.method2396();
		Static55.aClass93_106.method2396();
		Static200.aClass93_77.method2396();
		Static346.aClass93_130.method2396();
		Static186.aClass93_72.method2396();
		Static351.aClass93_134.method2396();
		Static319.aClass93_121.method2396();
		Static161.aClass93_63.method2396();
		Static244.aClass93_93.method2396();
		Static242.aClass93_90.method2396();
		Static177.aClass93_65.method2396();
		Static270.aClass93_104.method2396();
		Static1.aClass93_1.method2396();
		Static294.aClass93_133.method2396();
		Static134.aClass93_43.method2396();
		Static134.aClass93_42.method2396();
		Static29.aClass93_11.method2396();
		Static253.aClass93_96.method2396();
		Static254.aClass93_97.method2396();
		Static233.aClass93_88.method2396();
		Static1.aClass93_2.method2396();
		Static180.aClass93_66.method2396();
		Static288.aClass93_112.method2396();
		Static48.aClass93_15.method2396();
		Static159.aClass93_62.method2396();
		Static307.aClass93_118.method2396();
		Static191.aClass93_75.method2396();
		Static353.aClass93_135.method2396();
		Static93.aClass93_37.method2396();
		Static150.aClass109_35.method2858();
		Static35.aClass109_9.method2858();
		Static329.aClass109_59.method2858();
		Static286.aClass109_50.method2858();
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
	public static void method3026() {
		if (Static219.method4012() != 2) {
			return;
		}
		@Pc(26) byte local26 = (byte) (Static116.anInt2145 - 4 & 0xFF);
		@Pc(30) int local30 = Static116.anInt2145 % Static22.anInt481;
		@Pc(36) int local36;
		for (@Pc(32) int local32 = 0; local32 < 4; local32++) {
			for (local36 = 0; local36 < Static269.anInt5281; local36++) {
				Static167.aByteArrayArrayArray8[local32][local30][local36] = local26;
			}
		}
		if (Static239.anInt4811 == 3) {
			return;
		}
		for (local36 = 0; local36 < 2; local36++) {
			Static254.anIntArray490[local36] = -1000000;
			Static119.anIntArray372[local36] = 1000000;
			Static160.anIntArray327[local36] = 0;
			Static85.anIntArray132[local36] = 1000000;
			Static50.anIntArray90[local36] = 0;
		}
		@Pc(101) int local101;
		if (Static53.anInt992 != 1) {
			local101 = Static208.method3804(Static239.anInt4811, Static271.anInt5301, Static21.anInt466);
			if (local101 - Static102.anInt1934 < 800 && (Static255.aByteArrayArrayArray13[Static239.anInt4811][Static271.anInt5301 >> 7][Static21.anInt466 >> 7] & 0x4) != 0) {
				Static99.method1780(Static178.aClass174ArrayArrayArray3, Static21.anInt466 >> 7, Static271.anInt5301 >> 7, 1, false);
				return;
			}
			return;
		}
		if ((Static255.aByteArrayArrayArray13[Static239.anInt4811][Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6631 >> 7][Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6632 >> 7] & 0x4) != 0) {
			Static99.method1780(Static178.aClass174ArrayArrayArray3, Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6632 >> 7, Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6631 >> 7, 0, false);
		}
		if (Static42.anInt731 >= 2560) {
			return;
		}
		local101 = Static271.anInt5301 >> 7;
		@Pc(175) int local175 = Static21.anInt466 >> 7;
		@Pc(180) int local180 = Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6631 >> 7;
		@Pc(185) int local185 = Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6632 >> 7;
		@Pc(197) int local197;
		if (local101 < local180) {
			local197 = local180 - local101;
		} else {
			local197 = local101 - local180;
		}
		@Pc(212) int local212;
		if (local185 <= local175) {
			local212 = local175 - local185;
		} else {
			local212 = local185 - local175;
		}
		if (local197 == 0 && local212 == 0 || -Static22.anInt481 >= local197 || local197 >= Static22.anInt481 || local212 <= -Static269.anInt5281 || local212 >= Static269.anInt5281) {
			Static114.method1992(null, "RC: " + local101 + "," + local175 + " " + local180 + "," + local185 + " " + Static172.anInt4394 + "," + Static12.anInt3797);
			return;
		}
		@Pc(284) int local284;
		@Pc(286) int local286;
		if (local197 <= local212) {
			local284 = local197 * 65536 / local212;
			local286 = 32768;
			while (local185 != local175) {
				if (local175 < local185) {
					local175++;
				} else if (local175 > local185) {
					local175--;
				}
				if ((Static255.aByteArrayArrayArray13[Static239.anInt4811][local101][local175] & 0x4) != 0) {
					Static99.method1780(Static178.aClass174ArrayArrayArray3, local175, local101, 1, false);
					return;
				}
				local286 += local284;
				if (local286 >= 65536) {
					local286 -= 65536;
					if (local180 > local101) {
						local101++;
					} else if (local180 < local101) {
						local101--;
					}
					if ((Static255.aByteArrayArrayArray13[Static239.anInt4811][local101][local175] & 0x4) != 0) {
						Static99.method1780(Static178.aClass174ArrayArrayArray3, local175, local101, 1, false);
						return;
					}
				}
			}
			return;
		}
		local284 = local212 * 65536 / local197;
		local286 = 32768;
		while (local101 != local180) {
			if (local180 > local101) {
				local101++;
			} else if (local101 > local180) {
				local101--;
			}
			if ((Static255.aByteArrayArrayArray13[Static239.anInt4811][local101][local175] & 0x4) != 0) {
				Static99.method1780(Static178.aClass174ArrayArrayArray3, local175, local101, 1, false);
				return;
			}
			local286 += local284;
			if (local286 >= 65536) {
				if (local175 < local185) {
					local175++;
				} else if (local185 < local175) {
					local175--;
				}
				local286 -= 65536;
				if ((Static255.aByteArrayArrayArray13[Static239.anInt4811][local101][local175] & 0x4) != 0) {
					Static99.method1780(Static178.aClass174ArrayArrayArray3, local175, local101, 1, false);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZII)Lclient!db;")
	public static Class5_Sub1_Sub2 method3027(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(23) Class5_Sub1_Sub2 local23 = (Class5_Sub1_Sub2) Static233.aClass190_26.method5466((long) arg1 << 32 | (long) arg0);
		if (local23 == null) {
			local23 = new Class5_Sub1_Sub2(arg1, arg0);
			Static233.aClass190_26.method5464(local23, local23.aLong235);
		}
		return local23;
	}
}
