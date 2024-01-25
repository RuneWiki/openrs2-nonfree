import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static455 {

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "Lclient!aa;")
	public static Class2 aClass2_28;

	@OriginalMember(owner = "client!wh", name = "h", descriptor = "Lclient!pr;")
	public static Class199 aClass199_3;

	@OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
	public static int anInt7784;

	@OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
	public static int anInt7776 = -1;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BI)V")
	public static void method6191(@OriginalArg(1) int arg0) {
		if (Static147.anInt3063 == 1) {
			Static465.anInt7963 = arg0;
		} else if (Static147.anInt3063 == 2 || Static147.anInt3063 == 3) {
			Static22.anInt424 = arg0;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)I")
	public static int method6192(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static76.anIntArray129[arg0 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BZIIII)V")
	public static void method6193(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static294.aClass162ArrayArrayArray2 == null) {
			Static30.aClass30_3.method2072(arg4, arg3, arg1, arg2, -16777216);
		} else if (Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7514 >= 0 && Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7514 < Static193.anInt3853 * 128 && Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7515 >= 0 && Static301.anInt5585 * 128 > Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7515) {
			Static213.anInt4343++;
			if (Static52.aClass11_Sub5_Sub2_Sub1_2 != null && Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7514 + 64 - Static52.aClass11_Sub5_Sub2_Sub1_2.method5302() * 64 >> 7 == Static38.anInt906 && Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7515 + 64 - Static52.aClass11_Sub5_Sub2_Sub1_2.method5302() * 64 >> 7 == Static184.anInt3729) {
				Static184.anInt3729 = -1;
				Static38.anInt906 = -1;
				Static47.method1043();
			}
			Static20.method5763();
			if (!arg0) {
				Static16.method274();
			}
			Static133.method2459();
			Static29.method6228(arg1, arg4, arg3, true, arg2);
			@Pc(117) int local117 = Static401.anInt7082;
			@Pc(123) int local123 = Static10.anInt197;
			@Pc(125) int local125 = Static147.anInt3075;
			@Pc(127) int local127 = Static58.anInt1387;
			@Pc(144) int local144;
			@Pc(183) int local183;
			if (Static275.anInt5173 == 1) {
				local144 = (int) Static43.aFloat26;
				if (Static349.anInt6186 >> 8 > local144) {
					local144 = Static349.anInt6186 >> 8;
				}
				if (Static287.aBooleanArray109[4] && Static186.anIntArray294[4] + 128 > local144) {
					local144 = Static186.anIntArray294[4] + 128;
				}
				local183 = (int) Static322.aFloat82 + Static270.anInt5902 & 0x3FFF;
				Static186.method3389(Static233.anInt4616, Static53.anInt4623, Static21.method356(Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7514, Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7515, Static59.anInt1472) - 50, local125, local144, local183, (local144 >> 3) * 3 + 600 << 0);
			} else if (Static275.anInt5173 == 4) {
				local144 = (int) Static43.aFloat26;
				if (Static349.anInt6186 >> 8 > local144) {
					local144 = Static349.anInt6186 >> 8;
				}
				if (Static287.aBooleanArray109[4] && local144 < Static186.anIntArray294[4] + 128) {
					local144 = Static186.anIntArray294[4] + 128;
				}
				local183 = (int) Static322.aFloat82 & 0x3FFF;
				Static186.method3389(Static233.anInt4616, Static53.anInt4623, Static21.method356(Static3.anInt1340, Static373.anInt6559, Static59.anInt1472) - 50, local125, local144, local183, (local144 >> 3) * 3 + 600 << 0);
			} else if (Static275.anInt5173 == 5) {
				Static169.method4394(local125);
			}
			local144 = Static235.anInt4645;
			local183 = Static405.anInt7103;
			@Pc(289) int local289 = Static108.anInt2350;
			@Pc(291) int local291 = Static439.anInt7477;
			@Pc(293) int local293 = Static200.anInt3936;
			@Pc(337) int local337;
			for (@Pc(295) int local295 = 0; local295 < 5; local295++) {
				if (Static287.aBooleanArray109[local295]) {
					local337 = (int) ((double) -Static150.anIntArray257[local295] + (double) (Static150.anIntArray257[local295] * 2 + 1) * Math.random() + Math.sin((double) Static406.anIntArray528[local295] / 100.0D * (double) Static368.anIntArray514[local295]) * (double) Static186.anIntArray294[local295]);
					if (local295 == 3) {
						Static200.anInt3936 = Static200.anInt3936 + local337 & 0x3FFF;
					}
					if (local295 == 1) {
						Static405.anInt7103 += local337;
					}
					if (local295 == 2) {
						Static108.anInt2350 += local337;
					}
					if (local295 == 0) {
						Static235.anInt4645 += local337;
					}
					if (local295 == 4) {
						Static439.anInt7477 += local337;
						if (Static439.anInt7477 < 1024) {
							Static439.anInt7477 = 1024;
						} else if (Static439.anInt7477 > 3072) {
							Static439.anInt7477 = 3072;
						}
					}
				}
			}
			if (Static235.anInt4645 < 0) {
				Static235.anInt4645 = 0;
			}
			if (Static108.anInt2350 < 0) {
				Static108.anInt2350 = 0;
			}
			if (Static235.anInt4645 > (Static230.anInt4581 << 7) - 1) {
				Static235.anInt4645 = (Static230.anInt4581 << 7) - 1;
			}
			if ((Static268.anInt5106 << 7) - 1 < Static108.anInt2350) {
				Static108.anInt2350 = (Static268.anInt5106 << 7) - 1;
			}
			Static143.method2621();
			Static143.method2618();
			Static30.aClass30_3.w(local127, local117, local127 + local123, local125 + local117);
			Static30.aClass30_3.method2083();
			local337 = Static229.anInt4569;
			if (Static91.aClass265_1 == null) {
				Static30.aClass30_3.l(local337);
			} else {
				Static91.aClass265_1.method6063(Static439.anInt7477, Static90.anInt6146 << 3, local337, Static200.anInt3936, local127, Static30.aClass30_3, local125, local123, local117);
			}
			Static256.method4185();
			Static117.aClass72_5.IA(Static235.anInt4645, Static405.anInt7103, Static108.anInt2350, -Static439.anInt7477 & 0x3FFF, -Static200.anInt3936 & 0x3FFF, -Static246.anInt4786 & 0x3FFF);
			Static30.aClass30_3.method2064(Static117.aClass72_5);
			Static30.aClass30_3.b(local127 + local123 / 2, local117 + local125 / 2, Static404.anInt7098 << 1, Static404.anInt7098 << 1);
			Static347.method5057(Static404.anInt7098 << 1, Static404.anInt7098 << 1, local117 + local125 / 2, local127 - -(local123 / 2));
			Static176.method3079(-Static246.anInt4786 & 0x3FFF, Static108.anInt2350, -Static439.anInt7477 & 0x3FFF, Static405.anInt7103, -Static200.anInt3936 & 0x3FFF, Static235.anInt4645);
			@Pc(568) byte local568 = Static157.aClass185_Sub1_1.method4641(Static192.anInt3828) == 2 ? (byte) Static213.anInt4343 : 1;
			Static456.method6197(Static30.aClass30_3, Static277.anInt2834, Static271.anInt5145, Static117.aClass72_5, Static235.anInt4645, Static405.anInt7103, Static108.anInt2350, Static180.aByteArrayArrayArray3, Static103.anIntArray192, Static326.anIntArray474, Static150.anIntArray256, Static171.anIntArray274, Static77.anIntArray130, Static52.aClass11_Sub5_Sub2_Sub1_2.aByte100 + 1, local568, Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7514 >> 7, Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7515 >> 7, !Static157.aClass185_Sub1_1.aBoolean402);
			Static256.method4185();
			if (Static70.anInt1726 == 9) {
				Static92.method1821(local125, local117, local123, local127);
				Static189.method3417(local127, local123, local117, local125);
				Static133.method2464(local127, local125, local117, local123);
				Static439.method6007(local123, local117, local125, local127);
			}
			Static257.method4209();
			Static439.anInt7477 = local291;
			Static108.anInt2350 = local289;
			Static235.anInt4645 = local144;
			Static405.anInt7103 = local183;
			Static200.anInt3936 = local293;
			if (Static367.aBoolean547 && Static236.aClass184_2.method4436() == 0) {
				Static367.aBoolean547 = false;
			}
			if (Static367.aBoolean547) {
				Static30.aClass30_3.method2072(local117, local127, local123, local125, -16777216);
				Static122.method2305(false, Static330.aClass18_3, Static299.aClass21_87.method362(Static168.anInt3290));
			}
		} else {
			Static30.aClass30_3.method2072(arg4, arg3, arg1, arg2, -16777216);
		}
	}
}
