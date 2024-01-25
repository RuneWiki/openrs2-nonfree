import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!lf", name = "J", descriptor = "I")
	public static int anInt3567;

	@OriginalMember(owner = "client!lf", name = "M", descriptor = "I")
	public static int anInt3570;

	@OriginalMember(owner = "client!lf", name = "O", descriptor = "[I")
	public static int[] anIntArray388;

	@OriginalMember(owner = "client!lf", name = "T", descriptor = "Z")
	public static boolean aBoolean259 = false;

	@OriginalMember(owner = "client!lf", name = "V", descriptor = "Lclient!o;")
	public static final Class171 aClass171_3 = new Class171("WTRC", 1);

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIZIBI)V")
	public static void method3130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static69.aClass48ArrayArrayArray1 == null) {
			Static347.aClass155_9.method4954(arg3, arg0, arg4, arg1, -16777216);
		} else if (Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5774 >= 0 && Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5774 < Static12.anInt161 * 128 && Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5766 >= 0 && Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5766 < Static44.anInt787 * 128) {
			Static226.anInt3990++;
			if (Static226.aClass28_Sub1_Sub1_Sub2_2 != null && Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5774 + 64 - Static226.aClass28_Sub1_Sub1_Sub2_2.method4009() * 64 >> 7 == Static361.anInt6050 && Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5766 + 64 - Static226.aClass28_Sub1_Sub1_Sub2_2.method4009() * 64 >> 7 == Static109.anInt2145) {
				Static109.anInt2145 = -1;
				Static361.anInt6050 = -1;
				Static329.method5024();
			}
			Static150.method3924();
			if (!arg2) {
				Static20.method239();
			}
			Static173.method2678();
			Static344.method5212(arg3, arg0, arg1, true, arg4);
			@Pc(117) int local117 = Static312.anInt5392;
			@Pc(119) int local119 = Static74.anInt1593;
			@Pc(121) int local121 = Static357.anInt5995;
			@Pc(123) int local123 = Static333.anInt5649;
			@Pc(131) int local131;
			@Pc(172) int local172;
			if (Static88.anInt1815 == 1) {
				local131 = (int) Static279.aFloat67;
				if (Static234.anInt4195 >> 8 > local131) {
					local131 = Static234.anInt4195 >> 8;
				}
				if (Static8.aBooleanArray148[4] && local131 < Static345.anIntArray635[4] + 128) {
					local131 = Static345.anIntArray635[4] + 128;
				}
				local172 = Static231.anInt4140 + (int) Static352.aFloat68 & 0x3FFF;
				Static69.method1181(Static76.anInt1623, Static55.method1005(Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5766, Static363.anInt6170, Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5774) - 50, (local131 >> 3) * 3 + 600, local131, local172, local123, Static104.anInt2066);
			} else if (Static88.anInt1815 == 4) {
				local131 = (int) Static279.aFloat67;
				if (Static234.anInt4195 >> 8 > local131) {
					local131 = Static234.anInt4195 >> 8;
				}
				if (Static8.aBooleanArray148[4] && local131 < Static345.anIntArray635[4] + 128) {
					local131 = Static345.anIntArray635[4] + 128;
				}
				local172 = (int) Static352.aFloat68 & 0x3FFF;
				Static69.method1181(Static76.anInt1623, Static55.method1005(Static268.anInt4726, Static363.anInt6170, Static71.anInt1429) - 50, (local131 >> 3) * 3 + 600, local131, local172, local123, Static104.anInt2066);
			} else if (Static88.anInt1815 == 5) {
				Static49.method4692(local123);
			}
			local131 = Static206.anInt3639;
			local172 = Static243.anInt4289;
			@Pc(283) int local283 = Static339.anInt5726;
			@Pc(285) int local285 = Static327.anInt5556;
			@Pc(287) int local287 = Static145.anInt2716;
			@Pc(330) int local330;
			for (@Pc(289) int local289 = 0; local289 < 5; local289++) {
				if (Static8.aBooleanArray148[local289]) {
					local330 = (int) ((double) (Static77.anIntArray161[local289] * 2 + 1) * Math.random() - (double) Static77.anIntArray161[local289] + Math.sin((double) Static66.anIntArray126[local289] / 100.0D * (double) Static160.anIntArray604[local289]) * (double) Static345.anIntArray635[local289]);
					if (local289 == 3) {
						Static145.anInt2716 = local330 + Static145.anInt2716 & 0x3FFF;
					}
					if (local289 == 2) {
						Static339.anInt5726 += local330;
					}
					if (local289 == 4) {
						Static327.anInt5556 += local330;
						if (Static327.anInt5556 < 1024) {
							Static327.anInt5556 = 1024;
						} else if (Static327.anInt5556 > 3072) {
							Static327.anInt5556 = 3072;
						}
					}
					if (local289 == 1) {
						Static243.anInt4289 += local330;
					}
					if (local289 == 0) {
						Static206.anInt3639 += local330;
					}
				}
			}
			if (Static206.anInt3639 < 0) {
				Static206.anInt3639 = 0;
			}
			if (Static206.anInt3639 > (Static44.anInt791 << 7) - 1) {
				Static206.anInt3639 = (Static44.anInt791 << 7) - 1;
			}
			if (Static339.anInt5726 < 0) {
				Static339.anInt5726 = 0;
			}
			if (Static339.anInt5726 > (Static103.anInt2050 << 7) - 1) {
				Static339.anInt5726 = (Static103.anInt2050 << 7) - 1;
			}
			Static23.method288();
			Static197.method3103();
			Static347.aClass155_9.method4867(local117, local121, local119 + local117, local121 - -local123);
			Static347.aClass155_9.method4877();
			local330 = Static136.anInt2618;
			if (Static29.aClass101_3 == null) {
				Static347.aClass155_9.method4921(local330);
			} else {
				Static29.aClass101_3.method2069(Static145.anInt2716, local123, Static347.aClass155_9, local117, local121, local330, local119, Static327.anInt5556, Static251.anInt4519 << 3);
			}
			Static381.method5665();
			Static19.aClass118_1.method2663(Static206.anInt3639, Static243.anInt4289, Static339.anInt5726, -Static327.anInt5556 & 0x3FFF, -Static145.anInt2716 & 0x3FFF, -Static331.anInt5600 & 0x3FFF);
			Static347.aClass155_9.method4904(Static19.aClass118_1);
			Static347.aClass155_9.method4880(local119 / 2 + local117, local121 - -(local123 / 2), Static253.anInt4567 << 1, Static253.anInt4567 << 1);
			Static371.method5534(Static253.anInt4567 << 1, local123 / 2 + local121, Static253.anInt4567 << 1, local119 / 2 + local117);
			Static79.method1319(-Static145.anInt2716 & 0x3FFF, -Static327.anInt5556 & 0x3FFF, Static339.anInt5726, Static206.anInt3639, -Static331.anInt5600 & 0x3FFF, Static243.anInt4289);
			@Pc(561) byte local561 = Static164.aClass154_Sub1_1.method5402(Static2.anInt68) == 2 ? (byte) Static226.anInt3990 : 1;
			Static25.method315(Static347.aClass155_9, Static76.anInt1617, Static307.anInt5415, Static19.aClass118_1, Static206.anInt3639, Static243.anInt4289, Static339.anInt5726, Static330.aByteArrayArrayArray18, Static85.anIntArray170, Static364.anIntArray651, Static230.anIntArray433, Static267.anIntArray620, Static145.anIntArray289, Static226.aClass28_Sub1_Sub1_Sub2_2.aByte73 + 1, local561, Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5774 >> 7, Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5766 >> 7, !Static164.aClass154_Sub1_1.aBoolean467);
			Static381.method5665();
			if (Static348.anInt4439 == 30) {
				Static340.method5149(local121, local123, local117, local119);
				Static236.method3900(local121, local119, local123, local117);
				Static302.method4683(local123, local121, local119, local117);
				Static157.method2413(local123, local117, local119, local121);
			}
			Static131.method2065();
			Static339.anInt5726 = local283;
			Static243.anInt4289 = local172;
			Static145.anInt2716 = local287;
			Static206.anInt3639 = local131;
			Static327.anInt5556 = local285;
			if (Static350.aBoolean451 && Static328.aClass11_3.method165() == 0) {
				Static350.aBoolean451 = false;
			}
			if (Static350.aBoolean451) {
				Static347.aClass155_9.method4954(local123, local121, local119, local117, -16777216);
				Static289.method4519(Static140.aClass150_3, Static28.aClass57_13.method1122(Static66.anInt1307), false);
			}
		} else {
			Static347.aClass155_9.method4954(arg3, arg0, arg4, arg1, -16777216);
		}
	}
}
