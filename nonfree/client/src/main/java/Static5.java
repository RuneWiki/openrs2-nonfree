import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "eb", descriptor = "Lclient!ld;")
	public static Class67 aClass67_6;

	@OriginalMember(owner = "client!ad", name = "Eb", descriptor = "Lclient!me;")
	public static Class71 aClass71_29;

	@OriginalMember(owner = "client!ad", name = "Fb", descriptor = "[Lclient!te;")
	public static Class1_Sub2_Sub1[] aClass1_Sub2_Sub1Array12;

	@OriginalMember(owner = "client!ad", name = "ab", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1248 = Static64.method1101("null");

	@OriginalMember(owner = "client!ad", name = "qb", descriptor = "[I")
	public static int[] anIntArray237 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!ad", name = "Ab", descriptor = "Lclient!sf;")
	public static Class105 aClass105_18 = new Class105();

	@OriginalMember(owner = "client!ad", name = "Db", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1250 = Static64.method1101("VOLL");

	@OriginalMember(owner = "client!ad", name = "Gb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1251 = Static64.method1101("scrollen:");

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
	public static void method2789() {
		@Pc(9) int local9 = Static194.anInt4189 * 128 + 64;
		@Pc(15) int local15 = Static118.anInt2545 * 128 + 64;
		@Pc(23) int local23 = Static26.method2454(Static197.anInt2422, local15, local9) - Static129.anInt2900;
		if (Static4.anInt76 >= 100) {
			Static118.anInt2544 = Static118.anInt2545 * 128 + 64;
			Static122.anInt2706 = Static194.anInt4189 * 128 + 64;
			Static191.anInt4119 = Static26.method2454(Static197.anInt2422, Static118.anInt2544, Static122.anInt2706) - Static129.anInt2900;
		} else {
			if (local15 > Static118.anInt2544) {
				Static118.anInt2544 += Static120.anInt2656 + Static4.anInt76 * (local15 - Static118.anInt2544) / 1000;
				if (Static118.anInt2544 > local15) {
					Static118.anInt2544 = local15;
				}
			}
			if (local23 > Static191.anInt4119) {
				Static191.anInt4119 += Static120.anInt2656 + Static4.anInt76 * (local23 - Static191.anInt4119) / 1000;
				if (Static191.anInt4119 > local23) {
					Static191.anInt4119 = local23;
				}
			}
			if (Static118.anInt2544 > local15) {
				Static118.anInt2544 -= Static4.anInt76 * (Static118.anInt2544 - local15) / 1000 + Static120.anInt2656;
				if (local15 > Static118.anInt2544) {
					Static118.anInt2544 = local15;
				}
			}
			if (local23 < Static191.anInt4119) {
				Static191.anInt4119 -= Static120.anInt2656 + (Static191.anInt4119 - local23) * Static4.anInt76 / 1000;
				if (local23 > Static191.anInt4119) {
					Static191.anInt4119 = local23;
				}
			}
			if (Static122.anInt2706 < local9) {
				Static122.anInt2706 += Static120.anInt2656 + Static4.anInt76 * (local9 - Static122.anInt2706) / 1000;
				if (local9 < Static122.anInt2706) {
					Static122.anInt2706 = local9;
				}
			}
			if (Static122.anInt2706 > local9) {
				Static122.anInt2706 -= Static120.anInt2656 + (Static122.anInt2706 - local9) * Static4.anInt76 / 1000;
				if (Static122.anInt2706 < local9) {
					Static122.anInt2706 = local9;
				}
			}
		}
		local9 = Static82.anInt1852 * 128 + 64;
		local15 = Static194.anInt4192 * 128 + 64;
		local23 = Static26.method2454(Static197.anInt2422, local15, local9) - Static25.anInt633;
		@Pc(220) int local220 = local23 - Static191.anInt4119;
		@Pc(225) int local225 = local15 - Static118.anInt2544;
		@Pc(230) int local230 = local9 - Static122.anInt2706;
		@Pc(241) int local241 = (int) Math.sqrt((double) (local225 * local225 + local230 * local230));
		@Pc(252) int local252 = (int) (Math.atan2((double) local220, (double) local241) * 325.949D) & 0x7FF;
		if (local252 < 128) {
			local252 = 128;
		}
		if (local252 > 383) {
			local252 = 383;
		}
		@Pc(275) int local275 = (int) (Math.atan2((double) local230, (double) local225) * -325.949D) & 0x7FF;
		@Pc(280) int local280 = local275 - Static207.anInt4426;
		if (Static228.anInt4792 < local252) {
			Static228.anInt4792 += (local252 - Static228.anInt4792) * Static124.anInt4551 / 1000 + Static108.anInt2397;
			if (Static228.anInt4792 > local252) {
				Static228.anInt4792 = local252;
			}
		}
		if (Static228.anInt4792 > local252) {
			Static228.anInt4792 -= (Static228.anInt4792 - local252) * Static124.anInt4551 / 1000 + Static108.anInt2397;
			if (Static228.anInt4792 < local252) {
				Static228.anInt4792 = local252;
			}
		}
		if (local280 > 1024) {
			local280 -= 2048;
		}
		if (local280 < -1024) {
			local280 += 2048;
		}
		if (local280 > 0) {
			Static207.anInt4426 += Static124.anInt4551 * local280 / 1000 + Static108.anInt2397;
			Static207.anInt4426 &= 0x7FF;
		}
		if (local280 < 0) {
			Static207.anInt4426 -= -local280 * Static124.anInt4551 / 1000 + Static108.anInt2397;
			Static207.anInt4426 &= 0x7FF;
		}
		@Pc(383) int local383 = local275 - Static207.anInt4426;
		if (local383 > 1024) {
			local383 -= 2048;
		}
		if (local383 < -1024) {
			local383 += 2048;
		}
		if (local383 < 0 && local280 > 0 || local383 > 0 && local280 < 0) {
			Static207.anInt4426 = local275;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!mb;)V")
	public static void method2792(@OriginalArg(1) Class70 arg0) {
		Static30.aClass70_24 = arg0;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIII)V")
	public static void method2796(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(12) int local12 = -arg0;
		@Pc(14) int local14 = -1;
		@Pc(22) int local22 = Static28.method525(Static149.anInt3252, arg0 + arg3, Static160.anInt3454);
		@Pc(31) int local31 = Static28.method525(Static149.anInt3252, arg3 - arg0, Static160.anInt3454);
		Static71.method1261(Static113.anIntArrayArray10[arg2], local31, arg1, local22);
		while (local7 < local9) {
			local14 += 2;
			local12 += local14;
			@Pc(70) int local70;
			@Pc(65) int local65;
			@Pc(93) int local93;
			@Pc(102) int local102;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local65 = local9 + arg2;
				local70 = arg2 - local9;
				if (local65 >= Static225.anInt4729 && local70 <= Static122.anInt2710) {
					local93 = Static28.method525(Static149.anInt3252, arg3 + local7, Static160.anInt3454);
					local102 = Static28.method525(Static149.anInt3252, arg3 - local7, Static160.anInt3454);
					if (local65 <= Static122.anInt2710) {
						Static71.method1261(Static113.anIntArrayArray10[local65], local102, arg1, local93);
					}
					if (Static225.anInt4729 <= local70) {
						Static71.method1261(Static113.anIntArrayArray10[local70], local102, arg1, local93);
					}
				}
			}
			local7++;
			local70 = arg2 - local7;
			local65 = local7 + arg2;
			if (Static225.anInt4729 <= local65 && Static122.anInt2710 >= local70) {
				local93 = Static28.method525(Static149.anInt3252, arg3 + local9, Static160.anInt3454);
				local102 = Static28.method525(Static149.anInt3252, arg3 - local9, Static160.anInt3454);
				if (Static122.anInt2710 >= local65) {
					Static71.method1261(Static113.anIntArrayArray10[local65], local102, arg1, local93);
				}
				if (Static225.anInt4729 <= local70) {
					Static71.method1261(Static113.anIntArrayArray10[local70], local102, arg1, local93);
				}
			}
		}
	}
}
