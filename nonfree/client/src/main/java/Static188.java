import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!ng", name = "s", descriptor = "[I")
	public static int[] anIntArray567;

	@OriginalMember(owner = "client!ng", name = "k", descriptor = "[Lclient!th;")
	public static Class15_Sub2_Sub2[] aClass15_Sub2_Sub2Array41 = new Class15_Sub2_Sub2[2048];

	@OriginalMember(owner = "client!ng", name = "o", descriptor = "S")
	public static short aShort86 = 320;

	@OriginalMember(owner = "client!ng", name = "v", descriptor = "[I")
	public static int[] anIntArray568 = new int[32];

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(BJ)V")
	public static void method4588(@OriginalArg(1) long arg0) {
		if (Static16.anInt342 == 1 || Static16.anInt342 == 5) {
			Static24.method481(arg0);
		} else if (Static16.anInt342 == 2) {
			Static248.method1595();
		} else if (Static16.anInt342 == 4) {
			Static215.method3579(arg0);
		} else {
			Static31.method634();
		}
		if (!Static196.aBoolean281) {
			Static290.aShortArray85[0] = 1004;
			Static68.anInt1741 = 1;
			Static131.anIntArray297[0] = Static203.anInt4260;
			Static56.aStringArray8[0] = Static68.aString65;
			Static175.aStringArray28[0] = "";
			if (Static6.anInt113 != 0) {
				Static75.anInt1867 = Static132.anInt3027;
				Static169.anInt3744 = Static273.anInt5425;
			} else if (Static98.anInt2337 == 0) {
				Static75.anInt1867 = Static281.anInt5551;
				Static169.anInt3744 = Static131.anInt3016;
			} else {
				Static169.anInt3744 = Static86.anInt2010;
				Static75.anInt1867 = Static252.anInt4933;
			}
		}
		Static97.method1700((long) Static268.anInt5236);
		if (Static303.anInt5868 != -1) {
			Static25.method487(Static303.anInt5868);
		}
		@Pc(100) int local100;
		for (local100 = 0; local100 < Static148.anInt3247; local100++) {
			if (Static293.aBooleanArray23[local100]) {
				Static214.aBooleanArray19[local100] = true;
			}
			Static55.aBooleanArray2[local100] = Static293.aBooleanArray23[local100];
			Static293.aBooleanArray23[local100] = false;
		}
		Static34.aClass56_5 = null;
		Static52.anInt1303 = -1;
		Static42.anInt1111 = Static268.anInt5236;
		Static269.anInt5269 = -1;
		if (Static116.aBoolean184) {
			Static257.aBoolean334 = true;
		}
		Static219.aClass56_20 = null;
		if (Static303.anInt5868 != -1) {
			Static148.anInt3247 = 0;
			Static24.method479();
		}
		if (Static116.aBoolean184) {
			Static111.method1884();
		} else {
			Static77.method1463();
		}
		Static251.method3953();
		if (Static196.aBoolean281) {
			if (Static54.aBoolean90) {
				Static71.method1385();
			} else {
				Static45.method1409();
			}
		} else if (Static219.aClass56_20 != null) {
			Static91.method1628(Static56.anInt1436, Static219.aClass56_20, Static165.anInt3651);
		} else if (Static269.anInt5269 != -1) {
			Static91.method1628(Static52.anInt1303, null, Static269.anInt5269);
		}
		local100 = Static196.aBoolean281 ? -1 : Static86.method1544();
		if (local100 == -1) {
			local100 = Static41.anInt1010;
		}
		Static127.method2293(local100);
		if (Static197.anInt4175 == 1) {
			Static197.anInt4175 = 2;
		}
		if (Static223.anInt4546 == 1) {
			Static223.anInt4546 = 2;
		}
		if (Static270.anInt4253 == 3) {
			for (@Pc(230) int local230 = 0; local230 < Static148.anInt3247; local230++) {
				if (Static55.aBooleanArray2[local230]) {
					if (Static116.aBoolean184) {
						Static111.method1890(Static153.anIntArray344[local230], Static83.anIntArray171[local230], Static155.anIntArray352[local230], Static291.anIntArray537[local230], 16711935, 128);
					} else {
						Static77.method1443(Static153.anIntArray344[local230], Static83.anIntArray171[local230], Static155.anIntArray352[local230], Static291.anIntArray537[local230], 16711935, 128);
					}
				} else if (Static214.aBooleanArray19[local230]) {
					if (Static116.aBoolean184) {
						Static111.method1890(Static153.anIntArray344[local230], Static83.anIntArray171[local230], Static155.anIntArray352[local230], Static291.anIntArray537[local230], 16711680, 128);
					} else {
						Static77.method1443(Static153.anIntArray344[local230], Static83.anIntArray171[local230], Static155.anIntArray352[local230], Static291.anIntArray537[local230], 16711680, 128);
					}
				}
			}
		}
		Static263.method4155(Static22.aClass15_Sub2_Sub2_1.anInt5358, Static32.anInt876, Static247.anInt1733, Static22.aClass15_Sub2_Sub2_1.anInt5371);
		Static247.anInt1733 = 0;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIBI)V")
	public static void method4590(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1) {
		Static81.anInt1915 = arg1;
		Static53.anInt1319 = 0;
		Static148.anInt3245 = 0;
		Static166.anInt3675 = arg0;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(BII)V")
	public static void method4592(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub8_Sub10 local8 = Static92.method1633(6, arg1);
		local8.method2052();
		local8.anInt2698 = arg0;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IILclient!aj;Lclient!sb;I)V")
	public static void method4598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class10 arg2, @OriginalArg(3) Class2_Sub8_Sub21 arg3) {
		@Pc(22) int local22;
		if (arg2.anIntArray25 != null) {
			@Pc(15) boolean local15 = false;
			@Pc(20) int[] local20 = new int[arg2.anIntArray25.length];
			for (local22 = 0; local22 < local20.length / 2; local22++) {
				@Pc(38) int local38 = arg2.anIntArray25[local22 * 2] + arg3.anInt4967;
				@Pc(52) int local52 = arg3.anInt4968 - arg2.anIntArray25[local22 * 2 + 1];
				@Pc(74) int local74 = local20[local22 * 2] = Static250.anInt3124 + (Static250.anInt3130 - Static250.anInt3124) * (local38 + -Static250.anInt3129) / (Static250.anInt3128 - Static250.anInt3129);
				@Pc(99) int local99 = local20[local22 * 2 + 1] = (Static250.anInt3123 - Static250.anInt3126) * (-Static250.anInt3127 + local52) / (Static250.anInt3125 - Static250.anInt3127) + Static250.anInt3126;
				if (local74 > Static250.anInt3124 && local74 < Static250.anInt3130 && local99 > Static250.anInt3126 && Static250.anInt3123 > local99) {
					local15 = true;
				}
			}
			if (!local15) {
				return;
			}
			Static147.method2604(local20, arg2.anInt164, arg2.anInt164 >>> 24);
			for (local22 = 0; local22 < local20.length / 2 - 1; local22++) {
				Static77.method1456(local20[local22 * 2], local20[local22 * 2 + 1], local20[(local22 + 1) * 2], local20[(local22 + 1) * 2 + 1], arg2.anInt159, arg2.anInt159 >>> 24);
			}
			Static77.method1456(local20[local20.length - 2], local20[local20.length - 1], local20[0], local20[1], arg2.anInt159, arg2.anInt159 >>> 24);
		} else if (arg3.aBoolean327) {
			return;
		}
		@Pc(215) Class2_Sub24 local215 = new Class2_Sub24(arg3);
		@Pc(217) Class93_Sub1 local217 = null;
		if (arg2.anInt157 != -1) {
			if (arg3.aBoolean326 && arg2.anInt173 != -1) {
				local217 = (Class93_Sub1) arg2.method155(true, true);
			} else {
				local217 = (Class93_Sub1) arg2.method155(false, true);
			}
			if (local217 != null) {
				if (Static10.anInt171 > 0 && (Static122.anInt2705 != -1 && Static122.anInt2705 == arg3.anInt4970 || Static166.anInt3676 != -1 && arg2.anInt155 == Static166.anInt3676)) {
					if (Static225.anInt5333 <= 50) {
						local22 = Static225.anInt5333 * 3;
					} else {
						local22 = 300 - Static225.anInt5333 * 3;
					}
					Static77.method1461(arg3.anInt4973, arg3.anInt4976, local217.anInt4355 / 2 + 7, 16776960, local22);
					Static77.method1461(arg3.anInt4973, arg3.anInt4976, local217.anInt4355 / 2 + 5, 16776960, local22);
					Static77.method1461(arg3.anInt4973, arg3.anInt4976, local217.anInt4355 / 2 + 3, 16776960, local22);
					Static77.method1461(arg3.anInt4973, arg3.anInt4976, local217.anInt4355 / 2 + 1, 16776960, local22);
					Static77.method1461(arg3.anInt4973, arg3.anInt4976, local217.anInt4355 / 2, 16776960, local22);
				}
				local217.method3562(arg3.anInt4973 - (local217.anInt4355 >> 1), arg3.anInt4976 + -(local217.anInt4359 >> 1));
				local215.anInt4679 = (local217.anInt4355 >> 1) + (arg0 + arg3.anInt4973);
				local215.anInt4671 = arg1 + arg3.anInt4976 - (local217.anInt4359 >> 1);
				local215.anInt4670 = arg3.anInt4973 + arg0 - (local217.anInt4355 >> 1);
				local215.anInt4676 = (local217.anInt4359 >> 1) + arg3.anInt4976 + arg1;
			}
		}
		if (arg2.aString9 != null) {
			if (local217 == null) {
				Static152.method2797(arg3, 0, true, arg2, arg0, arg1, local215);
			} else {
				Static152.method2797(arg3, (local217.anInt4359 >> 1) + 5, false, arg2, arg0, arg1, local215);
			}
		}
		if (local215.method3770(Static131.anInt3016, Static281.anInt5551) && arg2.aStringArray1 != null) {
			if (arg2.aStringArray1[4] != null) {
				Static206.method3478(arg2.aString10, (long) arg3.anInt4970, 0, (short) 1009, arg2.aStringArray1[4], arg2.anInt155, -1);
			}
			if (arg2.aStringArray1[3] != null) {
				Static206.method3478(arg2.aString10, (long) arg3.anInt4970, 0, (short) 1003, arg2.aStringArray1[3], arg2.anInt155, -1);
			}
			if (arg2.aStringArray1[2] != null) {
				Static206.method3478(arg2.aString10, (long) arg3.anInt4970, 0, (short) 1005, arg2.aStringArray1[2], arg2.anInt155, -1);
			}
			if (arg2.aStringArray1[1] != null) {
				Static206.method3478(arg2.aString10, (long) arg3.anInt4970, 0, (short) 1006, arg2.aStringArray1[1], arg2.anInt155, -1);
			}
			if (arg2.aStringArray1[0] != null) {
				Static206.method3478(arg2.aString10, (long) arg3.anInt4970, 0, (short) 1008, arg2.aStringArray1[0], arg2.anInt155, -1);
			}
		}
		Static94.aClass44_9.method1358(local215);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4599(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			Static211.aClass2_Sub16_Sub1_2.method2198(28);
			Static211.aClass2_Sub16_Sub1_2.method2168(Static223.method3684(arg0));
			Static211.aClass2_Sub16_Sub1_2.method2153(arg0);
		}
	}
}
