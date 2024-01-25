import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
	public static int anInt385;

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
	public static final int anInt382 = 0;

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_12 = new Class85("flash2:", "", "", "");

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)Lclient!jk;")
	public static Class4_Sub3 method354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class174 local7 = Static178.aClass174ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass4_Sub3_1;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIZIB)V")
	public static void method355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		if (Static178.aClass174ArrayArrayArray3 == null) {
			Static236.aClass55_9.method5254(arg1, -16777216, arg4, arg2, arg0);
			return;
		}
		Static116.anInt2145++;
		if (Static192.aClass4_Sub5_Sub2_Sub1_2 != null && Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6631 - (Static192.aClass4_Sub5_Sub2_Sub1_2.method4807() - 1) * 64 >> 7 == Static224.anInt4437 && Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6632 + 64 - Static192.aClass4_Sub5_Sub2_Sub1_2.method4807() * 64 >> 7 == Static159.anInt3128) {
			Static159.anInt3128 = -1;
			Static224.anInt4437 = -1;
			Static141.method2510();
		}
		Static57.method5323();
		if (!arg3) {
			Static167.method3039();
		}
		Static296.method5128();
		Static314.method5474(arg4, arg0, arg1, true, arg2);
		@Pc(78) int local78 = Static48.anInt928;
		@Pc(80) int local80 = Static44.anInt748;
		@Pc(82) int local82 = Static267.anInt5264;
		@Pc(84) int local84 = Static177.anInt3505;
		@Pc(90) int local90;
		@Pc(127) int local127;
		if (Static53.anInt992 == 1) {
			local90 = (int) Static29.aFloat7;
			if (local90 < Static239.anInt4812 >> 8) {
				local90 = Static239.anInt4812 >> 8;
			}
			if (Static349.aBooleanArray26[4] && Static274.anIntArray524[4] + 128 > local90) {
				local90 = Static274.anIntArray524[4] + 128;
			}
			local127 = Static298.anInt1898 + (int) Static164.aFloat24 & 0x3FFF;
			Static178.method3198(local90, local127, (local90 >> 3) * 3 + 600, Static311.anInt3611, Static8.anInt184, Static208.method3804(Static239.anInt4811, Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6631, Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6632) - 50, local80);
		} else if (Static53.anInt992 == 4) {
			local90 = (int) Static29.aFloat7;
			if (local90 < Static239.anInt4812 >> 8) {
				local90 = Static239.anInt4812 >> 8;
			}
			if (Static349.aBooleanArray26[4] && Static274.anIntArray524[4] + 128 > local90) {
				local90 = Static274.anIntArray524[4] + 128;
			}
			local127 = (int) Static164.aFloat24 & 0x3FFF;
			Static178.method3198(local90, local127, (local90 >> 3) * 3 + 600, Static311.anInt3611, Static8.anInt184, Static208.method3804(Static239.anInt4811, Static348.anInt6696, Static213.anInt4128) - 50, local80);
		} else if (Static53.anInt992 == 5) {
			Static143.method2568(local80);
		}
		local90 = Static271.anInt5301;
		local127 = Static102.anInt1934;
		@Pc(232) int local232 = Static21.anInt466;
		@Pc(234) int local234 = Static42.anInt731;
		@Pc(236) int local236 = Static258.anInt5088;
		@Pc(280) int local280;
		for (@Pc(238) int local238 = 0; local238 < 5; local238++) {
			if (Static349.aBooleanArray26[local238]) {
				local280 = (int) ((double) -Static176.anIntArray357[local238] + (double) (Static176.anIntArray357[local238] * 2 + 1) * Math.random() + Math.sin((double) Static118.anIntArray208[local238] * ((double) Static154.anIntArray301[local238] / 100.0D)) * (double) Static274.anIntArray524[local238]);
				if (local238 == 4) {
					Static42.anInt731 += local280;
					if (Static42.anInt731 < 1024) {
						Static42.anInt731 = 1024;
					} else if (Static42.anInt731 > 3072) {
						Static42.anInt731 = 3072;
					}
				}
				if (local238 == 2) {
					Static21.anInt466 += local280;
				}
				if (local238 == 0) {
					Static271.anInt5301 += local280;
				}
				if (local238 == 3) {
					Static258.anInt5088 = local280 + Static258.anInt5088 & 0x3FFF;
				}
				if (local238 == 1) {
					Static102.anInt1934 += local280;
				}
			}
		}
		if (Static271.anInt5301 < 0) {
			Static271.anInt5301 = 0;
		}
		if (Static21.anInt466 < 0) {
			Static21.anInt466 = 0;
		}
		if ((Static350.anInt6715 << 7) - 1 < Static271.anInt5301) {
			Static271.anInt5301 = (Static350.anInt6715 << 7) - 1;
		}
		if (Static21.anInt466 > (Static236.anInt4222 << 7) - 1) {
			Static21.anInt466 = (Static236.anInt4222 << 7) - 1;
		}
		Static166.method3026();
		Static86.method1560();
		Static236.aClass55_9.method5258(local82, local78, local82 + local84, local78 - -local80);
		Static236.aClass55_9.method5256();
		local280 = Static233.anInt4655;
		if (Static48.aClass184_1 == null) {
			Static236.aClass55_9.method5226(local280);
		} else {
			Static48.aClass184_1.method5010(local80, Static42.anInt731, local78, Static24.anInt6106 << 3, Static258.anInt5088, local280, Static236.aClass55_9, local84, local82);
		}
		Static315.method5535();
		Static303.aClass66_5.method5828(Static271.anInt5301, Static102.anInt1934, Static21.anInt466, -Static42.anInt731 & 0x3FFF, -Static258.anInt5088 & 0x3FFF, -Static304.anInt5915 & 0x3FFF);
		Static236.aClass55_9.method5252(Static303.aClass66_5);
		Static236.aClass55_9.method5161(local82 + local84 / 2, local78 + local80 / 2, Static110.anInt2075 << 1, Static110.anInt2075 << 1);
		Static183.method3323(local80 / 2 + local78, Static110.anInt2075 << 1, local82 + local84 / 2, Static110.anInt2075 << 1);
		Static169.method5577(Static271.anInt5301, -Static258.anInt5088 & 0x3FFF, -Static304.anInt5915 & 0x3FFF, -Static42.anInt731 & 0x3FFF, Static102.anInt1934, Static21.anInt466);
		@Pc(513) byte local513 = Static219.method4012() == 2 ? (byte) Static116.anInt2145 : 1;
		Static307.method5380(Static236.aClass55_9, Static283.anInt5563, Static79.anInt1486, Static303.aClass66_5, Static271.anInt5301, Static102.anInt1934, Static21.anInt466, Static167.aByteArrayArrayArray8, Static254.anIntArray490, Static119.anIntArray372, Static160.anIntArray327, Static50.anIntArray90, Static85.anIntArray132, Static239.anInt4811 + 1, local513, Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6631 >> 7, Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6632 >> 7, !Static178.aBoolean274);
		Static315.method5535();
		if (Static278.anInt5495 == 30) {
			Static161.method2844(local78, local84, local82, local80);
			Static247.method4423(local82, local80, local78, local84);
			Static123.method2175(local82, local80, local78, local84);
			Static322.method550(local78, local82, local80, local84);
		}
		Static250.method4437();
		Static21.anInt466 = local232;
		Static102.anInt1934 = local127;
		Static42.anInt731 = local234;
		Static271.anInt5301 = local90;
		Static258.anInt5088 = local236;
		if (Static346.aBoolean578 && Static170.aClass162_2.method4440() == 0) {
			Static346.aBoolean578 = false;
		}
		if (Static346.aBoolean578) {
			Static236.aClass55_9.method5254(local84, -16777216, local80, local82, local78);
			Static86.method1557(false, Static204.aClass18_3, Static321.aClass85_134.method2020(Static41.anInt726));
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)Lclient!w;")
	public static Class209 method356(@OriginalArg(1) int arg0) {
		@Pc(10) Class209 local10 = (Class209) Static346.aClass109_62.method2857((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static354.aClass93_136.method2410(arg0, 1);
		local10 = new Class209();
		local10.anInt6611 = arg0;
		if (local20 != null) {
			local10.method5889(new Class5_Sub12(local20));
		}
		local10.method5891();
		if (local10.anInt6614 == 2 && Static335.aClass190_32.method5466((long) arg0) == null) {
			Static335.aClass190_32.method5464(new Class5_Sub15(Static187.anInt3707), (long) arg0);
			Static147.aClass209Array2[Static187.anInt3707++] = local10;
		}
		Static346.aClass109_62.method2855((long) arg0, local10);
		return local10;
	}
}
