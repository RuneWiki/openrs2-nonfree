import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!jg", name = "ab", descriptor = "Lclient!ca;")
	public static Class11 aClass11_5;

	@OriginalMember(owner = "client!jg", name = "eb", descriptor = "I")
	public static int anInt1913;

	@OriginalMember(owner = "client!jg", name = "S", descriptor = "I")
	public static int anInt1906 = 0;

	@OriginalMember(owner = "client!jg", name = "U", descriptor = "Lclient!dd;")
	public static Class17 aClass17_9 = new Class17(64);

	@OriginalMember(owner = "client!jg", name = "Y", descriptor = "Lclient!ai;")
	private static Class6 aClass6_590 = Static38.method685("Choose Option");

	@OriginalMember(owner = "client!jg", name = "X", descriptor = "Lclient!ai;")
	public static Class6 aClass6_589 = aClass6_590;

	@OriginalMember(owner = "client!jg", name = "cb", descriptor = "Lclient!ai;")
	private static Class6 aClass6_591 = Static38.method685("Select");

	@OriginalMember(owner = "client!jg", name = "db", descriptor = "I")
	public static int anInt1912 = 0;

	@OriginalMember(owner = "client!jg", name = "fb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_592 = aClass6_591;

	@OriginalMember(owner = "client!jg", name = "gb", descriptor = "I")
	public static int anInt1914 = 1;

	@OriginalMember(owner = "client!jg", name = "hb", descriptor = "Lclient!ai;")
	private static Class6 aClass6_593 = Static38.method685("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!jg", name = "ib", descriptor = "Lclient!ai;")
	public static Class6 aClass6_594 = aClass6_593;

	@OriginalMember(owner = "client!jg", name = "kb", descriptor = "Lclient!ai;")
	private static Class6 aClass6_596 = Static38.method685("Checking for updates )2 ");

	@OriginalMember(owner = "client!jg", name = "jb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_595 = aClass6_596;

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(III)V")
	public static void method1229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13;
		if (Static120.anInt2812 != arg1) {
			Static69.anIntArray117 = new int[arg1];
			for (local13 = 0; local13 < arg1; local13++) {
				Static69.anIntArray117[local13] = (local13 << 12) / arg1;
			}
			Static120.anInt2812 = arg1;
			Static49.anInt1370 = arg1 - 1;
		}
		if (Static11.anInt283 == arg0) {
			return;
		}
		Static11.anIntArray8 = new int[arg0];
		for (local13 = 0; local13 < arg0; local13++) {
			Static11.anIntArray8[local13] = (local13 << 12) / arg0;
		}
		Static11.anInt283 = arg0;
		Static180.anInt4192 = arg0 - 1;
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(Z)Z")
	public static boolean method1230() {
		if (Static166.aClass43_3 == null) {
			return false;
		}
		@Pc(222) int local222;
		try {
			@Pc(17) int local17 = Static166.aClass43_3.method1235();
			if (local17 == 0) {
				return false;
			}
			if (Static86.anInt2213 == -1) {
				local17--;
				Static166.aClass43_3.method1240(1, Static64.aClass2_Sub13_Sub1_1.aByteArray14, 0);
				Static64.aClass2_Sub13_Sub1_1.anInt2154 = 0;
				Static86.anInt2213 = Static64.aClass2_Sub13_Sub1_1.method1451();
				Static139.anInt3252 = Static135.anIntArray287[Static86.anInt2213];
			}
			if (Static139.anInt3252 == -1) {
				if (local17 <= 0) {
					return false;
				}
				Static166.aClass43_3.method1240(1, Static64.aClass2_Sub13_Sub1_1.aByteArray14, 0);
				Static139.anInt3252 = Static64.aClass2_Sub13_Sub1_1.aByteArray14[0] & 0xFF;
				local17--;
			}
			if (Static139.anInt3252 == -2) {
				if (local17 <= 1) {
					return false;
				}
				Static166.aClass43_3.method1240(2, Static64.aClass2_Sub13_Sub1_1.aByteArray14, 0);
				local17 -= 2;
				Static64.aClass2_Sub13_Sub1_1.anInt2154 = 0;
				Static139.anInt3252 = Static64.aClass2_Sub13_Sub1_1.method1397();
			}
			if (local17 < Static139.anInt3252) {
				return false;
			}
			Static64.aClass2_Sub13_Sub1_1.anInt2154 = 0;
			Static166.aClass43_3.method1240(Static139.anInt3252, Static64.aClass2_Sub13_Sub1_1.aByteArray14, 0);
			Static31.anInt773 = 0;
			Static141.anInt3312 = Static145.anInt3425;
			Static145.anInt3425 = Static89.anInt2261;
			Static89.anInt2261 = Static86.anInt2213;
			if (Static86.anInt2213 == 119) {
				Static158.method2417();
				Static86.anInt2213 = -1;
				return false;
			}
			@Pc(154) int local154;
			@Pc(141) Class6 local141;
			if (Static86.anInt2213 == 106) {
				local141 = Static64.aClass2_Sub13_Sub1_1.method1399();
				@Pc(148) Object[] local148 = new Object[local141.method107() + 1];
				for (local154 = local141.method107() - 1; local154 >= 0; local154--) {
					if (local141.method128(local154) == 115) {
						local148[local154 + 1] = Static64.aClass2_Sub13_Sub1_1.method1399();
					} else {
						local148[local154 + 1] = Integer.valueOf(Static64.aClass2_Sub13_Sub1_1.method1396());
					}
				}
				local148[0] = Integer.valueOf(Static64.aClass2_Sub13_Sub1_1.method1396());
				@Pc(201) Class2_Sub2 local201 = new Class2_Sub2();
				local201.anObjectArray1 = local148;
				Static92.method1505(local201);
				Static86.anInt2213 = -1;
				return true;
			}
			@Pc(226) Class87 local226;
			@Pc(218) int local218;
			if (Static86.anInt2213 == 1) {
				local218 = Static64.aClass2_Sub13_Sub1_1.method1432();
				local222 = Static64.aClass2_Sub13_Sub1_1.method1430();
				local226 = Static57.method940(local218);
				if (local226.anInt4090 != 2 || local226.anInt4071 != local222) {
					local226.anInt4071 = local222;
					local226.anInt4090 = 2;
					Static151.method2327(local226);
				}
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 74) {
				local218 = Static64.aClass2_Sub13_Sub1_1.method1397();
				local222 = Static64.aClass2_Sub13_Sub1_1.method1402();
				local154 = Static64.aClass2_Sub13_Sub1_1.method1397();
				Static117.method1874(local154, local222, local218);
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 159) {
				Static28.anInt726 = Static64.aClass2_Sub13_Sub1_1.method1402();
				Static24.anInt633 = Static64.aClass2_Sub13_Sub1_1.method1402();
				Static92.anInt2281 = Static64.aClass2_Sub13_Sub1_1.method1402();
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 141) {
				Static155.method2677(false);
				Static86.anInt2213 = -1;
				return true;
			}
			@Pc(319) int local319;
			@Pc(327) int local327;
			@Pc(433) int local433;
			@Pc(440) int local440;
			@Pc(524) int local524;
			@Pc(311) long local311;
			@Pc(470) int local470;
			if (Static86.anInt2213 == 150) {
				local311 = Static64.aClass2_Sub13_Sub1_1.method1446();
				local154 = Static64.aClass2_Sub13_Sub1_1.method1397();
				local319 = Static64.aClass2_Sub13_Sub1_1.method1402();
				@Pc(325) Class6 local325 = Static49.method884(local311).method106();
				for (local327 = 0; local327 < Static111.anInt2637; local327++) {
					if (Static102.aLongArray3[local327] == local311) {
						if (Static41.anIntArray62[local327] != local154) {
							Static41.anIntArray62[local327] = local154;
							if (local154 > 0) {
								Static6.method932(5, Static58.method956(new Class6[] { local325, Static152.aClass6_1039 }), Static9.aClass6_71);
							}
							if (local154 == 0) {
								Static6.method932(5, Static58.method956(new Class6[] { local325, Static105.aClass6_727 }), Static9.aClass6_71);
							}
						}
						Static67.anIntArray110[local327] = local319;
						local325 = null;
						break;
					}
				}
				if (local325 != null && Static111.anInt2637 < 200) {
					Static102.aLongArray3[Static111.anInt2637] = local311;
					Static118.aClass6Array16[Static111.anInt2637] = local325;
					Static41.anIntArray62[Static111.anInt2637] = local154;
					Static67.anIntArray110[Static111.anInt2637] = local319;
					Static111.anInt2637++;
				}
				Static86.anInt2209 = Static7.anInt124;
				local433 = Static111.anInt2637;
				while (local433 > 0) {
					@Pc(437) boolean local437 = true;
					local433--;
					for (local440 = 0; local440 < local433; local440++) {
						if (Static169.anInt3981 != Static41.anIntArray62[local440] && Static41.anIntArray62[local440 + 1] == Static169.anInt3981 || Static41.anIntArray62[local440] == 0 && Static41.anIntArray62[local440 + 1] != 0) {
							local437 = false;
							local470 = Static41.anIntArray62[local440];
							Static41.anIntArray62[local440] = Static41.anIntArray62[local440 + 1];
							Static41.anIntArray62[local440 + 1] = local470;
							@Pc(488) Class6 local488 = Static118.aClass6Array16[local440];
							Static118.aClass6Array16[local440] = Static118.aClass6Array16[local440 + 1];
							Static118.aClass6Array16[local440 + 1] = local488;
							@Pc(506) long local506 = Static102.aLongArray3[local440];
							Static102.aLongArray3[local440] = Static102.aLongArray3[local440 + 1];
							Static102.aLongArray3[local440 + 1] = local506;
							local524 = Static67.anIntArray110[local440];
							Static67.anIntArray110[local440] = Static67.anIntArray110[local440 + 1];
							Static67.anIntArray110[local440 + 1] = local524;
						}
					}
					if (local437) {
						break;
					}
				}
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 126) {
				if (Static21.anInt520 != -1) {
					Static63.method1013(0, Static21.anInt520);
				}
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 28) {
				Static113.anInt2752 = Static64.aClass2_Sub13_Sub1_1.method1402();
				Static86.anInt2213 = -1;
				return true;
			}
			@Pc(642) int local642;
			@Pc(662) int local662;
			if (Static86.anInt2213 == 19) {
				Static115.aBoolean113 = true;
				Static2.anInt61 = Static64.aClass2_Sub13_Sub1_1.method1402();
				Static180.anInt4195 = Static64.aClass2_Sub13_Sub1_1.method1402();
				Static165.anInt3872 = Static64.aClass2_Sub13_Sub1_1.method1397();
				Static89.anInt2266 = Static64.aClass2_Sub13_Sub1_1.method1402();
				Static11.anInt279 = Static64.aClass2_Sub13_Sub1_1.method1402();
				if (Static11.anInt279 >= 100) {
					local218 = Static2.anInt61 * 128 + 64;
					local222 = Static180.anInt4195 * 128 + 64;
					local154 = Static131.method2041(local218, local222, Static36.anInt1020) - Static165.anInt3872;
					local642 = local154 - Static12.anInt313;
					local319 = local218 - Static106.anInt4184;
					local327 = local222 - Static28.anInt722;
					local662 = (int) Math.sqrt((double) (local319 * local319 + local327 * local327));
					Static107.anInt2560 = (int) (Math.atan2((double) local642, (double) local662) * 325.949D) & 0x7FF;
					Static182.anInt4201 = (int) (Math.atan2((double) local319, (double) local327) * -325.949D) & 0x7FF;
					if (Static107.anInt2560 < 128) {
						Static107.anInt2560 = 128;
					}
					if (Static107.anInt2560 > 383) {
						Static107.anInt2560 = 383;
					}
				}
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 151) {
				local218 = Static64.aClass2_Sub13_Sub1_1.method1415();
				local222 = Static64.aClass2_Sub13_Sub1_1.method1425();
				local226 = Static57.method940(local222);
				if (local226 != null && local226.anInt4116 == 0) {
					if (local226.anInt4106 - local226.anInt4133 < local218) {
						local218 = local226.anInt4106 - local226.anInt4133;
					}
					if (local218 < 0) {
						local218 = 0;
					}
					if (local218 != local226.anInt4124) {
						local226.anInt4124 = local218;
						Static151.method2327(local226);
					}
				}
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 140) {
				local218 = Static64.aClass2_Sub13_Sub1_1.method1430();
				if (local218 == 65535) {
					local218 = -1;
				}
				local222 = Static64.aClass2_Sub13_Sub1_1.method1410();
				local154 = Static64.aClass2_Sub13_Sub1_1.method1395();
				local319 = Static64.aClass2_Sub13_Sub1_1.method1432();
				if (local222 == 65535) {
					local222 = -1;
				}
				for (local642 = local222; local642 <= local218; local642++) {
					@Pc(799) long local799 = ((long) local154 << 32) + (long) local642;
					@Pc(804) Class2 local804 = Static182.aClass16_13.method479(local799);
					if (local804 != null) {
						local804.method2808();
					}
					Static182.aClass16_13.method480(new Class2_Sub8(local319), local799);
				}
				Static86.anInt2213 = -1;
				return true;
			}
			@Pc(862) long local862;
			@Pc(847) long local847;
			@Pc(842) long local842;
			if (Static86.anInt2213 == 15) {
				local311 = Static64.aClass2_Sub13_Sub1_1.method1446();
				Static64.aClass2_Sub13_Sub1_1.method1394();
				local842 = Static64.aClass2_Sub13_Sub1_1.method1446();
				local847 = Static64.aClass2_Sub13_Sub1_1.method1397();
				@Pc(852) long local852 = (long) Static64.aClass2_Sub13_Sub1_1.method1406();
				local440 = Static64.aClass2_Sub13_Sub1_1.method1402();
				local862 = (local847 << 32) + local852;
				@Pc(864) boolean local864 = false;
				for (@Pc(866) int local866 = 0; local866 < 100; local866++) {
					if (local862 == Static128.aLongArray5[local866]) {
						local864 = true;
						break;
					}
				}
				if (local440 <= 1) {
					for (local524 = 0; local524 < Static68.anInt1729; local524++) {
						if (Static138.aLongArray6[local524] == local311) {
							local864 = true;
							break;
						}
					}
				}
				if (!local864 && Static112.anInt2717 == 0) {
					Static128.aLongArray5[Static163.anInt3840] = local862;
					Static163.anInt3840 = (Static163.anInt3840 + 1) % 100;
					@Pc(933) Class6 local933 = Static175.method2510(Static133.method2091(Static64.aClass2_Sub13_Sub1_1).method110());
					if (local440 == 2 || local440 == 3) {
						Static177.method2771(Static49.method884(local842).method106(), Static58.method956(new Class6[] { Static152.aClass6_1037, Static49.method884(local311).method106() }), local933, 9);
					} else if (local440 == 1) {
						Static177.method2771(Static49.method884(local842).method106(), Static58.method956(new Class6[] { Static76.aClass6_576, Static49.method884(local311).method106() }), local933, 9);
					} else {
						Static177.method2771(Static49.method884(local842).method106(), Static49.method884(local311).method106(), local933, 9);
					}
				}
				Static86.anInt2213 = -1;
				return true;
			}
			@Pc(1151) int local1151;
			if (Static86.anInt2213 == 147) {
				Static7.anInt125 = Static7.anInt124;
				local311 = Static64.aClass2_Sub13_Sub1_1.method1446();
				if (local311 == 0L) {
					Static65.aClass2_Sub5Array1 = null;
					Static171.anInt4014 = 0;
					Static41.aClass6_327 = null;
					Static55.aClass6_409 = null;
					Static86.anInt2213 = -1;
					return true;
				}
				local842 = Static64.aClass2_Sub13_Sub1_1.method1446();
				Static55.aClass6_409 = Static49.method884(local842);
				Static41.aClass6_327 = Static49.method884(local311);
				Static130.aByte6 = Static64.aClass2_Sub13_Sub1_1.method1394();
				local642 = Static64.aClass2_Sub13_Sub1_1.method1402();
				if (local642 == 255) {
					Static86.anInt2213 = -1;
					return true;
				}
				@Pc(1081) Class2_Sub5[] local1081 = new Class2_Sub5[100];
				Static171.anInt4014 = local642;
				for (local662 = 0; local662 < Static171.anInt4014; local662++) {
					local1081[local662] = new Class2_Sub5();
					local1081[local662].aLong241 = Static64.aClass2_Sub13_Sub1_1.method1446();
					local1081[local662].aClass6_70 = Static49.method884(local1081[local662].aLong241);
					local1081[local662].anInt159 = Static64.aClass2_Sub13_Sub1_1.method1397();
					local1081[local662].aByte1 = Static64.aClass2_Sub13_Sub1_1.method1394();
					if (local1081[local662].aLong241 == Static65.aLong93) {
						Static38.aByte2 = local1081[local662].aByte1;
					}
				}
				local470 = Static171.anInt4014;
				while (local470 > 0) {
					local470--;
					@Pc(1149) boolean local1149 = true;
					for (local1151 = 0; local1151 < local470; local1151++) {
						if (local1081[local1151].aClass6_70.method114(local1081[local1151 + 1].aClass6_70) > 0) {
							local1149 = false;
							@Pc(1172) Class2_Sub5 local1172 = local1081[local1151];
							local1081[local1151] = local1081[local1151 + 1];
							local1081[local1151 + 1] = local1172;
						}
					}
					if (local1149) {
						break;
					}
				}
				Static65.aClass2_Sub5Array1 = local1081;
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 9) {
				@Pc(1211) byte local1211 = Static64.aClass2_Sub13_Sub1_1.method1422();
				local222 = Static64.aClass2_Sub13_Sub1_1.method1415();
				Static27.anIntArray31[local222] = local1211;
				if (Static11.anIntArray9[local222] != local1211) {
					Static11.anIntArray9[local222] = local1211;
					Static141.method2183(local222);
				}
				Static115.anIntArray236[Static4.anInt70++ & 0x1F] = local222;
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 41) {
				local218 = Static64.aClass2_Sub13_Sub1_1.method1402();
				local222 = Static64.aClass2_Sub13_Sub1_1.method1402();
				local154 = Static64.aClass2_Sub13_Sub1_1.method1402();
				local319 = Static64.aClass2_Sub13_Sub1_1.method1402();
				local642 = Static64.aClass2_Sub13_Sub1_1.method1397();
				Static117.aBooleanArray8[local218] = true;
				Static15.anIntArray19[local218] = local222;
				Static115.anIntArray235[local218] = local154;
				Static7.anIntArray5[local218] = local319;
				Static68.anIntArray115[local218] = local642;
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 18) {
				local218 = Static64.aClass2_Sub13_Sub1_1.method1430();
				local222 = Static64.aClass2_Sub13_Sub1_1.method1396();
				local226 = Static57.method940(local222);
				if (local226.anInt4090 != 1 || local218 != local226.anInt4071) {
					local226.anInt4071 = local218;
					local226.anInt4090 = 1;
					Static151.method2327(local226);
				}
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 56) {
				Static155.method2677(true);
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 29) {
				local218 = Static64.aClass2_Sub13_Sub1_1.method1396();
				@Pc(1368) Class2_Sub16 local1368 = (Class2_Sub16) Static148.aClass16_10.method479((long) local218);
				if (local1368 != null) {
					Static21.method381(local1368, true);
				}
				if (Static124.aClass87_9 != null) {
					Static151.method2327(Static124.aClass87_9);
					Static124.aClass87_9 = null;
				}
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 78) {
				Static74.anInt1798 = Static64.aClass2_Sub13_Sub1_1.method1441();
				Static115.anInt2777 = Static64.aClass2_Sub13_Sub1_1.method1441();
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 246) {
				Static163.method2605();
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 38) {
				Static105.method1734(Static107.aClass36_4, Static139.anInt3252, Static64.aClass2_Sub13_Sub1_1);
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 88) {
				local218 = Static64.aClass2_Sub13_Sub1_1.method1432();
				local222 = Static64.aClass2_Sub13_Sub1_1.method1410();
				Static27.anIntArray31[local222] = local218;
				if (Static11.anIntArray9[local222] != local218) {
					Static11.anIntArray9[local222] = local218;
					Static141.method2183(local222);
				}
				Static115.anIntArray236[Static4.anInt70++ & 0x1F] = local222;
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 149) {
				Static74.anInt1798 = Static64.aClass2_Sub13_Sub1_1.method1409();
				Static115.anInt2777 = Static64.aClass2_Sub13_Sub1_1.method1441();
				while (Static64.aClass2_Sub13_Sub1_1.anInt2154 < Static139.anInt3252) {
					Static86.anInt2213 = Static64.aClass2_Sub13_Sub1_1.method1402();
					Static3.method47();
				}
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 134) {
				local218 = Static64.aClass2_Sub13_Sub1_1.method1397();
				Static21.anInt520 = local218;
				Static161.method2583(local218);
				Static12.method207(Static21.anInt520);
				for (local222 = 0; local222 < 100; local222++) {
					Static86.aBooleanArray5[local222] = true;
				}
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 7) {
				Static115.anInt2777 = Static64.aClass2_Sub13_Sub1_1.method1409();
				Static74.anInt1798 = Static64.aClass2_Sub13_Sub1_1.method1402();
				for (local218 = Static115.anInt2777; local218 < Static115.anInt2777 + 8; local218++) {
					for (local222 = Static74.anInt1798; local222 < Static74.anInt1798 + 8; local222++) {
						if (Static27.aClass84ArrayArrayArray1[Static36.anInt1020][local218][local222] != null) {
							Static27.aClass84ArrayArrayArray1[Static36.anInt1020][local218][local222] = null;
							Static117.method1873(local222, local218);
						}
					}
				}
				for (@Pc(1594) Class2_Sub22 local1594 = (Class2_Sub22) Static110.aClass84_6.method2694(); local1594 != null; local1594 = (Class2_Sub22) Static110.aClass84_6.method2697()) {
					if (local1594.anInt3545 >= Static115.anInt2777 && Static115.anInt2777 + 8 > local1594.anInt3545 && local1594.anInt3557 >= Static74.anInt1798 && Static74.anInt1798 + 8 > local1594.anInt3557 && Static36.anInt1020 == local1594.anInt3550) {
						local1594.anInt3553 = 0;
					}
				}
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 26) {
				Static152.anInt3513 = 0;
				Static86.anInt2213 = -1;
				return true;
			}
			@Pc(1684) boolean local1684;
			@Pc(1678) Class6 local1678;
			if (Static86.anInt2213 == 182) {
				local141 = Static64.aClass2_Sub13_Sub1_1.method1399();
				if (local141.method124(Static176.aClass6_1225)) {
					local1678 = local141.method111(local141.method120(Static107.aClass6_731), 0);
					local842 = local1678.method129();
					local1684 = false;
					for (local327 = 0; local327 < Static68.anInt1729; local327++) {
						if (local842 == Static138.aLongArray6[local327]) {
							local1684 = true;
							break;
						}
					}
					if (!local1684 && Static112.anInt2717 == 0) {
						Static6.method932(4, Static64.aClass6_463, local1678);
					}
				} else if (local141.method124(Static109.aClass6_1025)) {
					local1678 = local141.method111(local141.method120(Static107.aClass6_731), 0);
					local842 = local1678.method129();
					local1684 = false;
					for (local327 = 0; local327 < Static68.anInt1729; local327++) {
						if (local842 == Static138.aLongArray6[local327]) {
							local1684 = true;
							break;
						}
					}
					if (!local1684 && Static112.anInt2717 == 0) {
						@Pc(1788) Class6 local1788 = local141.method111(local141.method107() - 9, local141.method120(Static107.aClass6_731) + 1);
						Static6.method932(8, local1788, local1678);
					}
				} else if (local141.method124(Static76.aClass6_577)) {
					local1678 = local141.method111(local141.method120(Static107.aClass6_731), 0);
					local1684 = false;
					local842 = local1678.method129();
					for (local327 = 0; local327 < Static68.anInt1729; local327++) {
						if (local842 == Static138.aLongArray6[local327]) {
							local1684 = true;
							break;
						}
					}
					if (!local1684 && Static112.anInt2717 == 0) {
						Static6.method932(10, Static9.aClass6_71, local1678);
					}
				} else if (local141.method124(Static163.aClass6_1142)) {
					local1678 = local141.method111(local141.method120(Static163.aClass6_1142), 0);
					Static6.method932(11, local1678, Static9.aClass6_71);
				} else if (local141.method124(Static127.aClass6_852)) {
					local1678 = local141.method111(local141.method120(Static127.aClass6_852), 0);
					if (Static112.anInt2717 == 0) {
						Static6.method932(12, local1678, Static9.aClass6_71);
					}
				} else if (local141.method124(Static55.aClass6_414)) {
					local1678 = local141.method111(local141.method120(Static55.aClass6_414), 0);
					if (Static112.anInt2717 == 0) {
						Static6.method932(13, local1678, Static9.aClass6_71);
					}
				} else if (local141.method124(Static83.aClass6_617)) {
					local1678 = local141.method111(local141.method120(Static107.aClass6_731), 0);
					local842 = local1678.method129();
					local1684 = false;
					for (local327 = 0; local327 < Static68.anInt1729; local327++) {
						if (Static138.aLongArray6[local327] == local842) {
							local1684 = true;
							break;
						}
					}
					if (!local1684 && Static112.anInt2717 == 0) {
						Static6.method932(14, Static9.aClass6_71, local1678);
					}
				} else if (local141.method124(Static113.aClass6_786)) {
					local1678 = local141.method111(local141.method120(Static107.aClass6_731), 0);
					local842 = local1678.method129();
					local1684 = false;
					for (local327 = 0; local327 < Static68.anInt1729; local327++) {
						if (local842 == Static138.aLongArray6[local327]) {
							local1684 = true;
							break;
						}
					}
					if (!local1684 && Static112.anInt2717 == 0) {
						Static6.method932(15, Static9.aClass6_71, local1678);
					}
				} else if (local141.method124(Static85.aClass6_644)) {
					local1678 = local141.method111(local141.method120(Static107.aClass6_731), 0);
					local842 = local1678.method129();
					local1684 = false;
					for (local327 = 0; local327 < Static68.anInt1729; local327++) {
						if (local842 == Static138.aLongArray6[local327]) {
							local1684 = true;
							break;
						}
					}
					if (!local1684 && Static112.anInt2717 == 0) {
						Static6.method932(16, Static9.aClass6_71, local1678);
					}
				} else {
					Static6.method932(0, local141, Static9.aClass6_71);
				}
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 21 || Static86.anInt2213 == 189 || Static86.anInt2213 == 2 || Static86.anInt2213 == 200 || Static86.anInt2213 == 114 || Static86.anInt2213 == 11 || Static86.anInt2213 == 194 || Static86.anInt2213 == 67 || Static86.anInt2213 == 72 || Static86.anInt2213 == 197 || Static86.anInt2213 == 202) {
				Static3.method47();
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 45) {
				local218 = Static64.aClass2_Sub13_Sub1_1.method1397();
				local222 = Static64.aClass2_Sub13_Sub1_1.method1425();
				local154 = Static64.aClass2_Sub13_Sub1_1.method1415();
				local319 = Static64.aClass2_Sub13_Sub1_1.method1397();
				@Pc(2170) Class87 local2170 = Static57.method940(local222);
				if (local319 != local2170.anInt4081 || local2170.anInt4126 != local154 || local218 != local2170.anInt4078) {
					local2170.anInt4081 = local319;
					local2170.anInt4078 = local218;
					local2170.anInt4126 = local154;
					Static151.method2327(local2170);
				}
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 176) {
				local218 = Static64.aClass2_Sub13_Sub1_1.method1396();
				local1678 = Static64.aClass2_Sub13_Sub1_1.method1399();
				local226 = Static57.method940(local218);
				if (!local1678.method131(local226.aClass6_1242)) {
					local226.aClass6_1242 = local1678;
					Static151.method2327(local226);
				}
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 207) {
				for (local218 = 0; local218 < Static5.anInt88; local218++) {
					@Pc(2254) Class2_Sub3_Sub3 local2254 = Static39.method705(local218);
					if (local2254 != null && local2254.anInt431 == 0) {
						Static27.anIntArray31[local218] = 0;
						Static11.anIntArray9[local218] = 0;
					}
				}
				Static174.method2726();
				Static4.anInt70 += 32;
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 248) {
				Static39.method704(Static64.aClass2_Sub13_Sub1_1);
				Static86.anInt2213 = -1;
				return true;
			}
			@Pc(2322) Class87 local2322;
			if (Static86.anInt2213 == 229) {
				local218 = Static64.aClass2_Sub13_Sub1_1.method1397();
				local222 = Static64.aClass2_Sub13_Sub1_1.method1396();
				local154 = Static64.aClass2_Sub13_Sub1_1.method1415();
				local2322 = Static57.method940(local222);
				Static86.anInt2213 = -1;
				local2322.anInt4077 = local218 + (local154 << 16);
				return true;
			}
			if (Static86.anInt2213 == 25) {
				Static174.method2726();
				Static139.anInt3260 = Static64.aClass2_Sub13_Sub1_1.method1400();
				Static86.anInt2213 = -1;
				Static116.anInt2780 = Static7.anInt124;
				return true;
			}
			if (Static86.anInt2213 == 10) {
				Static115.aBoolean113 = false;
				for (local218 = 0; local218 < 5; local218++) {
					Static117.aBooleanArray8[local218] = false;
				}
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 180) {
				local311 = Static64.aClass2_Sub13_Sub1_1.method1446();
				local842 = Static64.aClass2_Sub13_Sub1_1.method1397();
				local847 = Static64.aClass2_Sub13_Sub1_1.method1406();
				@Pc(2396) long local2396 = local847 + (local842 << 32);
				@Pc(2398) boolean local2398 = false;
				local662 = Static64.aClass2_Sub13_Sub1_1.method1402();
				for (local1151 = 0; local1151 < 100; local1151++) {
					if (local2396 == Static128.aLongArray5[local1151]) {
						local2398 = true;
						break;
					}
				}
				if (local662 <= 1) {
					for (@Pc(2425) int local2425 = 0; local2425 < Static68.anInt1729; local2425++) {
						if (local311 == Static138.aLongArray6[local2425]) {
							local2398 = true;
							break;
						}
					}
				}
				if (!local2398 && Static112.anInt2717 == 0) {
					Static128.aLongArray5[Static163.anInt3840] = local2396;
					Static163.anInt3840 = (Static163.anInt3840 + 1) % 100;
					@Pc(2473) Class6 local2473 = Static175.method2510(Static133.method2091(Static64.aClass2_Sub13_Sub1_1).method110());
					if (local662 == 2 || local662 == 3) {
						Static6.method932(7, local2473, Static58.method956(new Class6[] { Static152.aClass6_1037, Static49.method884(local311).method106() }));
					} else if (local662 == 1) {
						Static6.method932(7, local2473, Static58.method956(new Class6[] { Static76.aClass6_576, Static49.method884(local311).method106() }));
					} else {
						Static6.method932(3, local2473, Static49.method884(local311).method106());
					}
				}
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 107) {
				local218 = Static64.aClass2_Sub13_Sub1_1.method1432();
				local222 = Static64.aClass2_Sub13_Sub1_1.method1410();
				local154 = local222 >> 10 & 0x1F;
				local642 = local222 & 0x1F;
				local319 = local222 >> 5 & 0x1F;
				local327 = (local642 << 3) + (local319 << 11) + (local154 << 19);
				@Pc(2586) Class87 local2586 = Static57.method940(local218);
				if (local327 != local2586.anInt4076) {
					local2586.anInt4076 = local327;
					Static151.method2327(local2586);
				}
				Static86.anInt2213 = -1;
				return true;
			}
			@Pc(2613) Class87 local2613;
			if (Static86.anInt2213 == 162) {
				local218 = Static64.aClass2_Sub13_Sub1_1.method1425();
				local2613 = Static57.method940(local218);
				for (local154 = 0; local154 < local2613.anIntArray396.length; local154++) {
					local2613.anIntArray396[local154] = -1;
					local2613.anIntArray396[local154] = 0;
				}
				Static151.method2327(local2613);
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 252) {
				local218 = Static64.aClass2_Sub13_Sub1_1.method1425();
				Static172.aClass11_7 = Static107.aClass36_4.method1118(local218);
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 235) {
				local218 = Static64.aClass2_Sub13_Sub1_1.method1441();
				local222 = Static64.aClass2_Sub13_Sub1_1.method1441();
				local154 = Static64.aClass2_Sub13_Sub1_1.method1402();
				Static36.anInt1020 = local222 >> 1;
				Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.method1803(local218, (local222 & 0x1) == 1, local154);
				Static86.anInt2213 = -1;
				return true;
			}
			@Pc(2718) Class2_Sub16 local2718;
			if (Static86.anInt2213 == 227) {
				local218 = Static64.aClass2_Sub13_Sub1_1.method1436();
				local222 = Static64.aClass2_Sub13_Sub1_1.method1432();
				local154 = Static64.aClass2_Sub13_Sub1_1.method1415();
				local2718 = (Class2_Sub16) Static148.aClass16_10.method479((long) local222);
				if (local2718 != null) {
					Static21.method381(local2718, local154 != local2718.anInt2551);
				}
				Static28.method507(local218, local222, local154);
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 108) {
				local218 = Static64.aClass2_Sub13_Sub1_1.method1395();
				local222 = Static64.aClass2_Sub13_Sub1_1.method1419();
				local226 = Static57.method940(local218);
				if (local222 != local226.anInt4132 || local222 == -1) {
					local226.anInt4119 = 0;
					local226.anInt4097 = 0;
					local226.anInt4132 = local222;
					Static151.method2327(local226);
				}
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 13) {
				local311 = Static64.aClass2_Sub13_Sub1_1.method1446();
				local154 = Static64.aClass2_Sub13_Sub1_1.method1397();
				@Pc(2802) byte local2802 = Static64.aClass2_Sub13_Sub1_1.method1394();
				local1684 = false;
				if ((Long.MIN_VALUE & local311) != 0L) {
					local1684 = true;
				}
				if (local1684) {
					if (Static171.anInt4014 == 0) {
						Static86.anInt2213 = -1;
						return true;
					}
					local311 &= Long.MAX_VALUE;
					for (local327 = 0; Static171.anInt4014 > local327 && (Static65.aClass2_Sub5Array1[local327].aLong241 != local311 || Static65.aClass2_Sub5Array1[local327].anInt159 != local154); local327++) {
					}
					if (Static171.anInt4014 > local327) {
						while (local327 < Static171.anInt4014 - 1) {
							Static65.aClass2_Sub5Array1[local327] = Static65.aClass2_Sub5Array1[local327 + 1];
							local327++;
						}
						Static171.anInt4014--;
						Static65.aClass2_Sub5Array1[Static171.anInt4014] = null;
					}
				} else {
					@Pc(2820) Class2_Sub5 local2820 = new Class2_Sub5();
					local2820.aLong241 = local311;
					local2820.aClass6_70 = Static49.method884(local2820.aLong241);
					local2820.aByte1 = local2802;
					local2820.anInt159 = local154;
					for (local662 = Static171.anInt4014 - 1; local662 >= 0; local662--) {
						local433 = Static65.aClass2_Sub5Array1[local662].aClass6_70.method114(local2820.aClass6_70);
						if (local433 == 0) {
							Static65.aClass2_Sub5Array1[local662].anInt159 = local154;
							Static65.aClass2_Sub5Array1[local662].aByte1 = local2802;
							if (local311 == Static65.aLong93) {
								Static38.aByte2 = local2802;
							}
							Static7.anInt125 = Static7.anInt124;
							Static86.anInt2213 = -1;
							return true;
						}
						if (local433 < 0) {
							break;
						}
					}
					if (Static171.anInt4014 >= Static65.aClass2_Sub5Array1.length) {
						Static86.anInt2213 = -1;
						return true;
					}
					for (local433 = Static171.anInt4014 - 1; local433 > local662; local433--) {
						Static65.aClass2_Sub5Array1[local433 + 1] = Static65.aClass2_Sub5Array1[local433];
					}
					if (Static171.anInt4014 == 0) {
						Static65.aClass2_Sub5Array1 = new Class2_Sub5[100];
					}
					Static65.aClass2_Sub5Array1[local662 + 1] = local2820;
					if (Static65.aLong93 == local311) {
						Static38.aByte2 = local2802;
					}
					Static171.anInt4014++;
				}
				Static86.anInt2213 = -1;
				Static7.anInt125 = Static7.anInt124;
				return true;
			}
			if (Static86.anInt2213 == 93) {
				local218 = Static64.aClass2_Sub13_Sub1_1.method1430();
				local222 = Static64.aClass2_Sub13_Sub1_1.method1396();
				if (local218 == 65535) {
					local218 = -1;
				}
				local154 = Static64.aClass2_Sub13_Sub1_1.method1432();
				local2322 = Static57.method940(local154);
				@Pc(3079) Class2_Sub3_Sub10 local3079;
				if (local2322.aBoolean174) {
					local2322.anInt4060 = local218;
					local2322.anInt4131 = local222;
					local3079 = Static92.method1502(local218);
					local2322.anInt4099 = local3079.anInt2007;
					local2322.anInt4078 = local3079.anInt2010;
					if (local2322.anInt4092 > 0) {
						local2322.anInt4078 = local2322.anInt4078 * 32 / local2322.anInt4092;
					}
					local2322.anInt4081 = local3079.anInt2035;
					local2322.anInt4126 = local3079.anInt2023;
					local2322.anInt4080 = local3079.anInt2031;
					local2322.anInt4123 = local3079.anInt2004;
					Static151.method2327(local2322);
				} else if (local218 == -1) {
					Static86.anInt2213 = -1;
					local2322.anInt4090 = 0;
					return true;
				} else {
					local3079 = Static92.method1502(local218);
					local2322.anInt4090 = 4;
					local2322.anInt4081 = local3079.anInt2035;
					local2322.anInt4078 = local3079.anInt2010 * 100 / local222;
					local2322.anInt4071 = local218;
					local2322.anInt4126 = local3079.anInt2023;
					Static151.method2327(local2322);
				}
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 98) {
				@Pc(3176) boolean local3176 = Static64.aClass2_Sub13_Sub1_1.method1436() == 1;
				local222 = Static64.aClass2_Sub13_Sub1_1.method1395();
				local226 = Static57.method940(local222);
				if (local3176 != local226.aBoolean163) {
					local226.aBoolean163 = local3176;
					Static151.method2327(local226);
				}
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 32) {
				Static115.aBoolean113 = true;
				Static177.anInt4136 = Static64.aClass2_Sub13_Sub1_1.method1402();
				Static10.anInt236 = Static64.aClass2_Sub13_Sub1_1.method1402();
				Static134.anInt3126 = Static64.aClass2_Sub13_Sub1_1.method1397();
				Static6.anInt1427 = Static64.aClass2_Sub13_Sub1_1.method1402();
				Static180.anInt4191 = Static64.aClass2_Sub13_Sub1_1.method1402();
				if (Static180.anInt4191 >= 100) {
					Static28.anInt722 = Static10.anInt236 * 128 + 64;
					Static106.anInt4184 = Static177.anInt4136 * 128 + 64;
					Static12.anInt313 = Static131.method2041(Static106.anInt4184, Static28.anInt722, Static36.anInt1020) - Static134.anInt3126;
				}
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 50) {
				local311 = Static64.aClass2_Sub13_Sub1_1.method1446();
				@Pc(3269) Class6 local3269 = Static175.method2510(Static133.method2091(Static64.aClass2_Sub13_Sub1_1).method110());
				Static6.method932(6, local3269, Static49.method884(local311).method106());
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 34) {
				Static31.anInt772 = Static64.aClass2_Sub13_Sub1_1.method1415() * 30;
				Static86.anInt2213 = -1;
				Static116.anInt2780 = Static7.anInt124;
				return true;
			}
			if (Static86.anInt2213 == 123) {
				Static116.anInt2786 = Static64.aClass2_Sub13_Sub1_1.method1402();
				Static86.anInt2209 = Static7.anInt124;
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 94) {
				local141 = Static64.aClass2_Sub13_Sub1_1.method1399();
				local222 = Static64.aClass2_Sub13_Sub1_1.method1441();
				local154 = Static64.aClass2_Sub13_Sub1_1.method1441();
				if (local222 >= 1 && local222 <= 8) {
					if (local141.method137(Static33.aClass6_252)) {
						local141 = null;
					}
					Static48.aClass6Array8[local222 - 1] = local141;
					Static127.aBooleanArray11[local222 - 1] = local154 == 0;
				}
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 181) {
				Static174.method2726();
				Static135.anInt3141 = Static64.aClass2_Sub13_Sub1_1.method1402();
				Static116.anInt2780 = Static7.anInt124;
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 154) {
				local218 = Static64.aClass2_Sub13_Sub1_1.method1425();
				local2613 = Static57.method940(local218);
				local2613.anInt4090 = 3;
				local2613.anInt4071 = Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.aClass55_1.method1711();
				Static151.method2327(local2613);
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 110) {
				local218 = Static64.aClass2_Sub13_Sub1_1.method1419();
				local222 = Static64.aClass2_Sub13_Sub1_1.method1419();
				local154 = Static64.aClass2_Sub13_Sub1_1.method1425();
				local2322 = Static57.method940(local154);
				local327 = local218 + local2322.anInt4070;
				local642 = local2322.anInt4087 + local222;
				if (local642 != local2322.anInt4079 || local327 != local2322.anInt4091) {
					local2322.anInt4091 = local327;
					local2322.anInt4079 = local642;
					Static151.method2327(local2322);
				}
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 206) {
				for (local218 = 0; local218 < Static11.anIntArray9.length; local218++) {
					if (Static11.anIntArray9[local218] != Static27.anIntArray31[local218]) {
						Static11.anIntArray9[local218] = Static27.anIntArray31[local218];
						Static141.method2183(local218);
						Static115.anIntArray236[Static4.anInt70++ & 0x1F] = local218;
					}
				}
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 156) {
				Static174.method2726();
				local218 = Static64.aClass2_Sub13_Sub1_1.method1436();
				local222 = Static64.aClass2_Sub13_Sub1_1.method1402();
				local154 = Static64.aClass2_Sub13_Sub1_1.method1425();
				Static56.anIntArray226[local218] = local154;
				Static155.anIntArray385[local218] = local222;
				Static95.anIntArray178[local218] = 1;
				for (local319 = 0; local319 < 98; local319++) {
					if (local154 >= Class56.anIntArray215[local319]) {
						Static95.anIntArray178[local218] = local319 + 2;
					}
				}
				Static103.anIntArray212[Static3.anInt69++ & 0x1F] = local218;
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 175) {
				local218 = Static64.aClass2_Sub13_Sub1_1.anInt2154 + Static139.anInt3252;
				local222 = Static64.aClass2_Sub13_Sub1_1.method1397();
				local154 = Static64.aClass2_Sub13_Sub1_1.method1397();
				if (local222 != Static21.anInt520) {
					Static21.anInt520 = local222;
					Static161.method2583(Static21.anInt520);
					Static12.method207(Static21.anInt520);
					for (local319 = 0; local319 < 100; local319++) {
						Static86.aBooleanArray5[local319] = true;
					}
				}
				while (local154-- > 0) {
					local319 = Static64.aClass2_Sub13_Sub1_1.method1396();
					local642 = Static64.aClass2_Sub13_Sub1_1.method1397();
					local327 = Static64.aClass2_Sub13_Sub1_1.method1402();
					@Pc(3648) Class2_Sub16 local3648 = (Class2_Sub16) Static148.aClass16_10.method479((long) local319);
					if (local3648 != null && local3648.anInt2551 != local642) {
						Static21.method381(local3648, true);
						local3648 = null;
					}
					if (local3648 == null) {
						local3648 = Static28.method507(local327, local319, local642);
					}
					local3648.aBoolean104 = true;
				}
				for (local2718 = (Class2_Sub16) Static148.aClass16_10.method478(); local2718 != null; local2718 = (Class2_Sub16) Static148.aClass16_10.method481()) {
					if (local2718.aBoolean104) {
						local2718.aBoolean104 = false;
					} else {
						Static21.method381(local2718, true);
					}
				}
				Static182.aClass16_13 = new Class16(512);
				while (Static64.aClass2_Sub13_Sub1_1.anInt2154 < local218) {
					local642 = Static64.aClass2_Sub13_Sub1_1.method1396();
					local327 = Static64.aClass2_Sub13_Sub1_1.method1397();
					local662 = Static64.aClass2_Sub13_Sub1_1.method1397();
					local433 = Static64.aClass2_Sub13_Sub1_1.method1396();
					for (local440 = local327; local440 <= local662; local440++) {
						local862 = ((long) local642 << 32) + ((long) local440);
						Static182.aClass16_13.method480(new Class2_Sub8(local433), local862);
					}
				}
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 215) {
				local218 = Static64.aClass2_Sub13_Sub1_1.method1396();
				local222 = Static64.aClass2_Sub13_Sub1_1.method1397();
				if (local218 < -70000) {
					local222 += 32768;
				}
				if (local218 >= 0) {
					local226 = Static57.method940(local218);
				} else {
					local226 = null;
				}
				while (Static139.anInt3252 > Static64.aClass2_Sub13_Sub1_1.anInt2154) {
					local327 = 0;
					local319 = Static64.aClass2_Sub13_Sub1_1.method1439();
					local642 = Static64.aClass2_Sub13_Sub1_1.method1397();
					if (local642 != 0) {
						local327 = Static64.aClass2_Sub13_Sub1_1.method1402();
						if (local327 == 255) {
							local327 = Static64.aClass2_Sub13_Sub1_1.method1396();
						}
					}
					if (local226 != null && local319 >= 0 && local319 < local226.anIntArray396.length) {
						local226.anIntArray396[local319] = local642;
						local226.anIntArray399[local319] = local327;
					}
					Static161.method2580(local327, local642 - 1, local319, local222);
				}
				if (local226 != null) {
					Static151.method2327(local226);
				}
				Static174.method2726();
				Static15.anIntArray18[Static17.anInt2431++ & 0x1F] = local222 & 0x7FFF;
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 69) {
				Static42.method839();
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 53) {
				local218 = Static64.aClass2_Sub13_Sub1_1.method1410();
				if (local218 == 65535) {
					local218 = -1;
				}
				Static94.method1530(local218);
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 83) {
				local218 = Static64.aClass2_Sub13_Sub1_1.method1405();
				local222 = Static64.aClass2_Sub13_Sub1_1.method1410();
				if (local222 == 65535) {
					local222 = -1;
				}
				Static86.method1465(local222, local218);
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 205) {
				local218 = Static64.aClass2_Sub13_Sub1_1.method1396();
				local222 = Static64.aClass2_Sub13_Sub1_1.method1397();
				if (local218 < -70000) {
					local222 += 32768;
				}
				if (local218 >= 0) {
					local226 = Static57.method940(local218);
				} else {
					local226 = null;
				}
				if (local226 != null) {
					for (local319 = 0; local319 < local226.anIntArray396.length; local319++) {
						local226.anIntArray396[local319] = 0;
						local226.anIntArray399[local319] = 0;
					}
				}
				Static170.method2691(local222);
				local319 = Static64.aClass2_Sub13_Sub1_1.method1397();
				for (local642 = 0; local642 < local319; local642++) {
					local327 = Static64.aClass2_Sub13_Sub1_1.method1415();
					local662 = Static64.aClass2_Sub13_Sub1_1.method1441();
					if (local662 == 255) {
						local662 = Static64.aClass2_Sub13_Sub1_1.method1395();
					}
					if (local226 != null && local642 < local226.anIntArray396.length) {
						local226.anIntArray396[local642] = local327;
						local226.anIntArray399[local642] = local662;
					}
					Static161.method2580(local662, local327 - 1, local642, local222);
				}
				if (local226 != null) {
					Static151.method2327(local226);
				}
				Static174.method2726();
				Static15.anIntArray18[Static17.anInt2431++ & 0x1F] = local222 & 0x7FFF;
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 111) {
				local218 = Static64.aClass2_Sub13_Sub1_1.method1402();
				if (Static64.aClass2_Sub13_Sub1_1.method1402() == 0) {
					Static41.aClass54Array1[local218] = new Class54();
				} else {
					Static64.aClass2_Sub13_Sub1_1.anInt2154--;
					Static41.aClass54Array1[local218] = new Class54(Static64.aClass2_Sub13_Sub1_1);
				}
				Static117.anInt2798 = Static7.anInt124;
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 36) {
				Static64.anInt1578 = Static64.aClass2_Sub13_Sub1_1.method1402();
				if (Static64.anInt1578 == 1) {
					Static157.anInt3643 = Static64.aClass2_Sub13_Sub1_1.method1397();
				}
				if (Static64.anInt1578 >= 2 && Static64.anInt1578 <= 6) {
					if (Static64.anInt1578 == 2) {
						Static176.anInt4102 = 64;
						Static167.anInt3924 = 64;
					}
					if (Static64.anInt1578 == 3) {
						Static176.anInt4102 = 64;
						Static167.anInt3924 = 0;
					}
					if (Static64.anInt1578 == 4) {
						Static167.anInt3924 = 128;
						Static176.anInt4102 = 64;
					}
					if (Static64.anInt1578 == 5) {
						Static167.anInt3924 = 64;
						Static176.anInt4102 = 0;
					}
					if (Static64.anInt1578 == 6) {
						Static167.anInt3924 = 64;
						Static176.anInt4102 = 128;
					}
					Static64.anInt1578 = 2;
					Static61.anInt1526 = Static64.aClass2_Sub13_Sub1_1.method1397();
					Static179.anInt4170 = Static64.aClass2_Sub13_Sub1_1.method1397();
					Static89.anInt2268 = Static64.aClass2_Sub13_Sub1_1.method1402();
				}
				if (Static64.anInt1578 == 10) {
					Static5.anInt90 = Static64.aClass2_Sub13_Sub1_1.method1397();
				}
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 46) {
				for (local218 = 0; local218 < Static2.aClass2_Sub3_Sub5_Sub1_Sub1Array1.length; local218++) {
					if (Static2.aClass2_Sub3_Sub5_Sub1_Sub1Array1[local218] != null) {
						Static2.aClass2_Sub3_Sub5_Sub1_Sub1Array1[local218].anInt2658 = -1;
					}
				}
				for (local222 = 0; local222 < Static151.aClass2_Sub3_Sub5_Sub1_Sub2Array1.length; local222++) {
					if (Static151.aClass2_Sub3_Sub5_Sub1_Sub2Array1[local222] != null) {
						Static151.aClass2_Sub3_Sub5_Sub1_Sub2Array1[local222].anInt2658 = -1;
					}
				}
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 169) {
				Static68.anInt1729 = Static139.anInt3252 / 8;
				for (local218 = 0; local218 < Static68.anInt1729; local218++) {
					Static138.aLongArray6[local218] = Static64.aClass2_Sub13_Sub1_1.method1446();
					Static10.aClass6Array2[local218] = Static49.method884(Static138.aLongArray6[local218]);
				}
				Static86.anInt2209 = Static7.anInt124;
				Static86.anInt2213 = -1;
				return true;
			}
			if (Static86.anInt2213 == 244) {
				local218 = Static64.aClass2_Sub13_Sub1_1.method1415();
				Static76.method1170(local218);
				Static15.anIntArray18[Static17.anInt2431++ & 0x1F] = local218 & 0x7FFF;
				Static86.anInt2213 = -1;
				return true;
			}
			Static97.method1572(null, "T1 - " + Static86.anInt2213 + "," + Static145.anInt3425 + "," + Static141.anInt3312 + " - " + Static139.anInt3252);
			Static158.method2417();
		} catch (@Pc(4345) IOException local4345) {
			Static157.method2413();
		} catch (@Pc(4349) Exception local4349) {
			@Pc(4390) String local4390 = "T2 - " + Static86.anInt2213 + "," + Static145.anInt3425 + "," + Static141.anInt3312 + " - " + Static139.anInt3252 + "," + (Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray221[0] + Static2.anInt66) + "," + (Static176.anInt4061 + Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray223[0]) + " - ";
			for (local222 = 0; Static139.anInt3252 > local222 && local222 < 50; local222++) {
				local4390 = local4390 + Static64.aClass2_Sub13_Sub1_1.aByteArray14[local222] + ",";
			}
			Static97.method1572(local4349, local4390);
			Static158.method2417();
		}
		return true;
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(B)V")
	public static void method1231() {
		aClass6_591 = null;
		aClass6_595 = null;
		aClass6_594 = null;
		aClass6_593 = null;
		aClass6_592 = null;
		aClass6_589 = null;
		aClass6_596 = null;
		aClass11_5 = null;
		aClass6_590 = null;
		aClass17_9 = null;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILjava/util/Random;B)I")
	public static int method1232(@OriginalArg(0) int arg0, @OriginalArg(1) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static124.method1931(arg0)) {
			return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
		} else {
			@Pc(42) int local42 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(45) int local45;
			do {
				local45 = arg1.nextInt();
			} while (local45 >= local42);
			return Static156.method2408(local45, arg0);
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ljava/lang/Object;ZLclient!ih;)V")
	public static void method1233(@OriginalArg(0) Object arg0, @OriginalArg(2) Class36 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 50 && arg1.anEventQueue1.peekEvent() != null; local16++) {
			Static155.method2675(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}
}
