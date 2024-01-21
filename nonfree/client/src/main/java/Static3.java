import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "Sb", descriptor = "I")
	public static int anInt183;

	@OriginalMember(owner = "client!ab", name = "lc", descriptor = "[Lclient!ec;")
	public static Class2_Sub1_Sub4_Sub2[] aClass2_Sub1_Sub4_Sub2Array2;

	@OriginalMember(owner = "client!ab", name = "vc", descriptor = "[I")
	public static int[] anIntArray27;

	@OriginalMember(owner = "client!ab", name = "cb", descriptor = "[I")
	public static int[] anIntArray20 = new int[500];

	@OriginalMember(owner = "client!ab", name = "hb", descriptor = "I")
	public static int anInt158 = 256;

	@OriginalMember(owner = "client!ab", name = "jb", descriptor = "I")
	public static int anInt160 = 0;

	@OriginalMember(owner = "client!ab", name = "qb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_83 = Static24.method441("(X");

	@OriginalMember(owner = "client!ab", name = "Wb", descriptor = "Lclient!wb;")
	private static Class65 aClass65_87 = Static24.method441("Accept trade");

	@OriginalMember(owner = "client!ab", name = "qc", descriptor = "I")
	public static int anInt199 = -1;

	@OriginalMember(owner = "client!ab", name = "Cc", descriptor = "Lclient!wb;")
	public static Class65 aClass65_90 = aClass65_87;

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(Z)Z")
	public static boolean method79() {
		if (Static41.aClass13_3 == null) {
			return false;
		}
		@Pc(130) int local130;
		try {
			@Pc(13) int local13 = Static41.aClass13_3.method323();
			if (local13 == 0) {
				return false;
			}
			if (Static8.anInt307 == -1) {
				local13--;
				Static41.aClass13_3.method317(1, 0, Static59.aClass2_Sub8_Sub1_19.aByteArray59);
				Static59.aClass2_Sub8_Sub1_19.anInt2342 = 0;
				Static8.anInt307 = Static59.aClass2_Sub8_Sub1_19.method1429();
				Static57.anInt1718 = Static92.anIntArray379[Static8.anInt307];
			}
			if (Static57.anInt1718 == -1) {
				if (local13 <= 0) {
					return false;
				}
				local13--;
				Static41.aClass13_3.method317(1, 0, Static59.aClass2_Sub8_Sub1_19.aByteArray59);
				Static57.anInt1718 = Static59.aClass2_Sub8_Sub1_19.aByteArray59[0] & 0xFF;
			}
			if (Static57.anInt1718 == -2) {
				if (local13 <= 1) {
					return false;
				}
				local13 -= 2;
				Static41.aClass13_3.method317(2, 0, Static59.aClass2_Sub8_Sub1_19.aByteArray59);
				Static59.aClass2_Sub8_Sub1_19.anInt2342 = 0;
				Static57.anInt1718 = Static59.aClass2_Sub8_Sub1_19.method1396();
			}
			if (Static57.anInt1718 > local13) {
				return false;
			}
			Static59.aClass2_Sub8_Sub1_19.anInt2342 = 0;
			Static41.aClass13_3.method317(Static57.anInt1718, 0, Static59.aClass2_Sub8_Sub1_19.aByteArray59);
			Static56.anInt1693 = Static41.anInt1302;
			Static41.anInt1302 = Static57.anInt1714;
			Static57.anInt1714 = Static8.anInt307;
			Static108.anInt2897 = 0;
			@Pc(136) int local136;
			@Pc(146) int local146;
			@Pc(140) int local140;
			@Pc(126) int local126;
			if (Static8.anInt307 == 39) {
				local126 = Static59.aClass2_Sub8_Sub1_19.method1393();
				local130 = Static59.aClass2_Sub8_Sub1_19.method1391();
				local136 = local130 >> 10 & 0x1F;
				local140 = local130 & 0x1F;
				local146 = local130 >> 5 & 0x1F;
				@Pc(150) Class2_Sub1_Sub2 local150 = Static28.method503(local126);
				Static8.anInt307 = -1;
				local150.anInt205 = (local140 << 3) + (local146 << 11) + (local136 << 19);
				return true;
			}
			if (Static8.anInt307 == 152) {
				local126 = Static59.aClass2_Sub8_Sub1_19.method1382();
				Static28.method504(local126);
				if (Static89.anInt2549 != -1) {
					Static98.method1695(Static89.anInt2549);
					Static89.anInt2549 = -1;
					Static19.aBoolean99 = true;
					Static22.aBoolean46 = true;
				}
				if (Static21.anInt2494 != -1) {
					Static98.method1695(Static21.anInt2494);
					Static21.anInt2494 = -1;
					Static107.aBoolean156 = true;
				}
				if (Static96.anInt2688 != -1) {
					Static98.method1695(Static96.anInt2688);
					Static96.anInt2688 = -1;
					Static76.method1307(30);
				}
				if (Static46.anInt1375 != -1) {
					Static98.method1695(Static46.anInt1375);
					Static46.anInt1375 = -1;
				}
				if (Static98.anInt2770 != local126) {
					Static98.method1695(Static98.anInt2770);
					Static98.anInt2770 = local126;
				}
				Static85.anInt2453 = -1;
				if (Static55.anInt1673 != 0) {
					Static107.aBoolean156 = true;
					Static55.anInt1673 = 0;
				}
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 237) {
				local126 = Static59.aClass2_Sub8_Sub1_19.method1411();
				Static4.aClass20_1 = Static97.aClass53_3.method1622(local126);
				Static8.anInt307 = -1;
				return true;
			}
			@Pc(281) Class2_Sub1_Sub2 local281;
			if (Static8.anInt307 == 26) {
				local126 = Static59.aClass2_Sub8_Sub1_19.method1411();
				local130 = Static59.aClass2_Sub8_Sub1_19.method1371();
				local136 = Static59.aClass2_Sub8_Sub1_19.method1409();
				local281 = Static28.method503(local126);
				local281.anInt166 = local130 + local281.anInt168;
				local281.anInt203 = local281.anInt169 + local136;
				Static8.anInt307 = -1;
				return true;
			}
			@Pc(314) Class2_Sub1_Sub2 local314;
			@Pc(310) Class65 local310;
			if (Static8.anInt307 == 107) {
				local126 = Static59.aClass2_Sub8_Sub1_19.method1406();
				local310 = Static59.aClass2_Sub8_Sub1_19.method1400();
				local314 = Static28.method503(local126);
				local314.aClass65_89 = local310;
				if (local126 >> 16 == Static62.anIntArray253[Static37.anInt1223]) {
					Static19.aBoolean99 = true;
				}
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 17) {
				local126 = Static59.aClass2_Sub8_Sub1_19.method1393();
				local130 = Static59.aClass2_Sub8_Sub1_19.method1391();
				local136 = Static59.aClass2_Sub8_Sub1_19.method1391();
				local281 = Static28.method503(local126);
				Static8.anInt307 = -1;
				local281.anInt182 = local130 + (local136 << 16);
				return true;
			}
			if (Static8.anInt307 == 195) {
				local126 = Static59.aClass2_Sub8_Sub1_19.method1406();
				@Pc(380) boolean local380 = Static59.aClass2_Sub8_Sub1_19.method1395() == 1;
				local314 = Static28.method503(local126);
				local314.aBoolean8 = local380;
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 194) {
				Static93.anInt2629 = Static57.anInt1718 / 8;
				for (local126 = 0; local126 < Static93.anInt2629; local126++) {
					Static52.aLongArray6[local126] = Static59.aClass2_Sub8_Sub1_19.method1405();
				}
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 157) {
				Static9.method160();
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 175) {
				local126 = Static59.aClass2_Sub8_Sub1_19.method1401();
				local130 = Static59.aClass2_Sub8_Sub1_19.method1382();
				Static20.anIntArray86[local130] = local126;
				if (local126 != Static26.anIntArray416[local130]) {
					Static26.anIntArray416[local130] = local126;
					Static98.method1698(local130);
					if (Static5.anInt237 != -1) {
						Static107.aBoolean156 = true;
					}
					Static19.aBoolean99 = true;
				}
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 202) {
				local126 = Static59.aClass2_Sub8_Sub1_19.method1411();
				local130 = Static59.aClass2_Sub8_Sub1_19.method1391();
				local314 = Static28.method503(local126);
				Static8.anInt307 = -1;
				local314.anInt152 = local130;
				local314.anInt194 = 2;
				return true;
			}
			if (Static8.anInt307 == 4) {
				local126 = Static59.aClass2_Sub8_Sub1_19.method1396();
				local130 = Static59.aClass2_Sub8_Sub1_19.method1391();
				if (Static21.anInt2494 != -1) {
					Static98.method1695(Static21.anInt2494);
					Static107.aBoolean156 = true;
					Static21.anInt2494 = -1;
				}
				if (Static96.anInt2688 != -1) {
					Static98.method1695(Static96.anInt2688);
					Static96.anInt2688 = -1;
					Static76.method1307(30);
				}
				if (Static46.anInt1375 != -1) {
					Static98.method1695(Static46.anInt1375);
					Static46.anInt1375 = -1;
				}
				if (local126 != Static98.anInt2770) {
					Static98.method1695(Static98.anInt2770);
					Static98.anInt2770 = local126;
				}
				if (Static89.anInt2549 != local130) {
					Static98.method1695(Static89.anInt2549);
					Static89.anInt2549 = local130;
				}
				Static22.aBoolean46 = true;
				Static19.aBoolean99 = true;
				Static8.anInt307 = -1;
				Static85.anInt2453 = -1;
				if (Static55.anInt1673 != 0) {
					Static107.aBoolean156 = true;
					Static55.anInt1673 = 0;
				}
				return true;
			}
			if (Static8.anInt307 == 176) {
				Static102.anInt2800 = Static59.aClass2_Sub8_Sub1_19.method1410();
				Static74.anInt1538 = Static59.aClass2_Sub8_Sub1_19.method1412();
				Static8.anInt307 = -1;
				return true;
			}
			@Pc(607) Class2_Sub1_Sub2 local607;
			if (Static8.anInt307 == 50) {
				local126 = Static59.aClass2_Sub8_Sub1_19.method1411();
				local607 = Static28.method503(local126);
				for (local136 = 0; local136 < local607.anIntArray19.length; local136++) {
					local607.anIntArray19[local136] = -1;
					local607.anIntArray19[local136] = 0;
				}
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 122) {
				local126 = Static59.aClass2_Sub8_Sub1_19.method1371();
				if (local126 != Static5.anInt237) {
					Static98.method1695(Static5.anInt237);
					Static5.anInt237 = local126;
				}
				Static107.aBoolean156 = true;
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 45) {
				Static24.anInt717 = Static59.aClass2_Sub8_Sub1_19.method1410();
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 188) {
				Static103.anInt2811 = Static59.aClass2_Sub8_Sub1_19.method1410();
				Static42.anInt1350 = Static59.aClass2_Sub8_Sub1_19.method1410();
				Static85.anInt2454 = Static59.aClass2_Sub8_Sub1_19.method1410();
				Static81.aBoolean158 = true;
				Static8.anInt307 = -1;
				Static107.aBoolean156 = true;
				return true;
			}
			@Pc(755) int local755;
			@Pc(767) int local767;
			if (Static8.anInt307 == 244) {
				Static35.aBoolean73 = true;
				Static61.anInt1855 = Static59.aClass2_Sub8_Sub1_19.method1410();
				Static99.anInt2541 = Static59.aClass2_Sub8_Sub1_19.method1410();
				Static89.anInt2554 = Static59.aClass2_Sub8_Sub1_19.method1396();
				Static21.anInt2493 = Static59.aClass2_Sub8_Sub1_19.method1410();
				Static33.anInt2338 = Static59.aClass2_Sub8_Sub1_19.method1410();
				if (Static33.anInt2338 >= 100) {
					local130 = Static99.anInt2541 * 128 + 64;
					local126 = Static61.anInt1855 * 128 + 64;
					local136 = Static25.method447(Static62.anInt1879, local130, local126) - Static89.anInt2554;
					local140 = local136 - Static26.anInt2923;
					local146 = local126 - Static87.anInt2520;
					local755 = local130 - Static51.anInt1481;
					local767 = (int) Math.sqrt((double) (local146 * local146 + local755 * local755));
					Static9.anInt318 = (int) (Math.atan2((double) local140, (double) local767) * 325.949D) & 0x7FF;
					Static97.anInt2699 = (int) (Math.atan2((double) local146, (double) local755) * -325.949D) & 0x7FF;
					if (Static9.anInt318 < 128) {
						Static9.anInt318 = 128;
					}
					if (Static9.anInt318 > 383) {
						Static9.anInt318 = 383;
					}
				}
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 160) {
				local126 = Static59.aClass2_Sub8_Sub1_19.method1412();
				local130 = Static59.aClass2_Sub8_Sub1_19.method1391();
				if (local130 == 65535) {
					local130 = -1;
				}
				if (Static62.anIntArray253[local126] != local130) {
					Static98.method1695(Static62.anIntArray253[local126]);
					Static62.anIntArray253[local126] = local130;
				}
				Static22.aBoolean46 = true;
				Static19.aBoolean99 = true;
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 14) {
				for (local126 = 0; local126 < Static26.anIntArray416.length; local126++) {
					if (Static26.anIntArray416[local126] != Static20.anIntArray86[local126]) {
						Static26.anIntArray416[local126] = Static20.anIntArray86[local126];
						Static98.method1698(local126);
						Static19.aBoolean99 = true;
					}
				}
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 7) {
				local126 = Static59.aClass2_Sub8_Sub1_19.method1396();
				local130 = Static59.aClass2_Sub8_Sub1_19.method1401();
				local314 = Static28.method503(local130);
				if (local314 != null && local314.anInt179 == 0) {
					if (local126 < 0) {
						local126 = 0;
					}
					if (local314.anInt153 - local314.anInt170 < local126) {
						local126 = local314.anInt153 - local314.anInt170;
					}
					local314.anInt192 = local126;
				}
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 48) {
				Static48.method841(Static57.anInt1718, Static59.aClass2_Sub8_Sub1_19, Static97.aClass53_3);
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 226) {
				local126 = Static59.aClass2_Sub8_Sub1_19.method1391();
				Static28.method504(local126);
				if (Static89.anInt2549 != -1) {
					Static98.method1695(Static89.anInt2549);
					Static19.aBoolean99 = true;
					Static22.aBoolean46 = true;
					Static89.anInt2549 = -1;
				}
				if (Static96.anInt2688 != -1) {
					Static98.method1695(Static96.anInt2688);
					Static96.anInt2688 = -1;
					Static76.method1307(30);
				}
				if (Static46.anInt1375 != -1) {
					Static98.method1695(Static46.anInt1375);
					Static46.anInt1375 = -1;
				}
				if (Static98.anInt2770 != -1) {
					Static98.method1695(Static98.anInt2770);
					Static98.anInt2770 = -1;
				}
				if (local126 != Static21.anInt2494) {
					Static98.method1695(Static21.anInt2494);
					Static21.anInt2494 = local126;
				}
				Static107.aBoolean156 = true;
				Static85.anInt2453 = -1;
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 225) {
				Static33.anInt2359 = Static59.aClass2_Sub8_Sub1_19.method1382() * 30;
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 18) {
				local126 = Static59.aClass2_Sub8_Sub1_19.method1396();
				local130 = Static59.aClass2_Sub8_Sub1_19.method1410();
				local136 = Static59.aClass2_Sub8_Sub1_19.method1396();
				if (Static21.anInt2499 != 0 && local130 != 0 && Static98.anInt2765 < 50) {
					Static85.anIntArray320[Static98.anInt2765] = local126;
					Static104.anIntArray409[Static98.anInt2765] = local130;
					Static19.anIntArray256[Static98.anInt2765] = local136;
					Static30.aClass35Array1[Static98.anInt2765] = null;
					Static105.anIntArray410[Static98.anInt2765] = 0;
					Static98.anInt2765++;
				}
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 56) {
				local126 = Static59.aClass2_Sub8_Sub1_19.method1409();
				if (local126 >= 0) {
					Static28.method504(local126);
				}
				if (anInt199 != local126) {
					Static98.method1695(anInt199);
					anInt199 = local126;
				}
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 128) {
				if (Static89.anInt2549 != -1) {
					Static98.method1695(Static89.anInt2549);
					Static19.aBoolean99 = true;
					Static89.anInt2549 = -1;
					Static22.aBoolean46 = true;
				}
				if (Static21.anInt2494 != -1) {
					Static98.method1695(Static21.anInt2494);
					Static107.aBoolean156 = true;
					Static21.anInt2494 = -1;
				}
				if (Static96.anInt2688 != -1) {
					Static98.method1695(Static96.anInt2688);
					Static96.anInt2688 = -1;
					Static76.method1307(30);
				}
				if (Static46.anInt1375 != -1) {
					Static98.method1695(Static46.anInt1375);
					Static46.anInt1375 = -1;
				}
				if (Static98.anInt2770 != -1) {
					Static98.method1695(Static98.anInt2770);
					Static98.anInt2770 = -1;
				}
				if (Static55.anInt1673 != 0) {
					Static107.aBoolean156 = true;
					Static55.anInt1673 = 0;
				}
				Static85.anInt2453 = -1;
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 99) {
				Static35.aBoolean73 = false;
				for (local126 = 0; local126 < 5; local126++) {
					Static70.aBooleanArray20[local126] = false;
				}
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 12) {
				local126 = Static59.aClass2_Sub8_Sub1_19.method1391();
				if (local126 == 65535) {
					local126 = -1;
				}
				if (local126 == -1 && Static71.anInt2165 == 0) {
					Static57.method998();
				} else if (local126 != -1 && Static15.anInt478 != local126 && Static97.anInt2711 != 0 && Static71.anInt2165 == 0) {
					Static57.method1002(0, local126, Static26.aClass33_Sub1_50, Static97.anInt2711);
				}
				Static8.anInt307 = -1;
				Static15.anInt478 = local126;
				return true;
			}
			if (Static8.anInt307 == 28) {
				local126 = Static59.aClass2_Sub8_Sub1_19.method1388();
				local130 = Static59.aClass2_Sub8_Sub1_19.method1382();
				if (local130 == 65535) {
					local130 = -1;
				}
				if (Static97.anInt2711 != 0 && local130 != -1) {
					Static57.method1003(local130, Static99.aClass33_Sub1_44, 1, Static97.anInt2711);
					Static71.anInt2165 = local126;
				}
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 148) {
				Static99.anInt2533 = 0;
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 11) {
				Static37.anInt1223 = Static59.aClass2_Sub8_Sub1_19.method1410();
				Static19.aBoolean99 = true;
				Static8.anInt307 = -1;
				Static22.aBoolean46 = true;
				return true;
			}
			@Pc(1335) long local1335;
			if (Static8.anInt307 == 20) {
				local1335 = Static59.aClass2_Sub8_Sub1_19.method1405();
				@Pc(1341) Class65 local1341 = Static106.method1746(Static59.aClass2_Sub8_Sub1_19).method1771();
				Static36.method742(Static24.method442(local1335).method1787(), local1341, 6);
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 33) {
				local126 = Static59.aClass2_Sub8_Sub1_19.method1382();
				local130 = Static59.aClass2_Sub8_Sub1_19.method1391();
				local136 = Static59.aClass2_Sub8_Sub1_19.method1406();
				local281 = Static28.method503(local136);
				if (local130 == 65535) {
					Static8.anInt307 = -1;
					local281.anInt194 = 0;
					return true;
				}
				@Pc(1389) Class2_Sub1_Sub8 local1389 = Static70.method1263(local130);
				local281.anInt165 = local1389.anInt1815;
				Static8.anInt307 = -1;
				local281.anInt152 = local130;
				local281.anInt194 = 4;
				local281.anInt195 = local1389.anInt1823;
				local281.anInt181 = local1389.anInt1808 * 100 / local126;
				return true;
			}
			if (Static8.anInt307 == 151) {
				Static19.aBoolean99 = true;
				local126 = Static59.aClass2_Sub8_Sub1_19.method1410();
				local130 = Static59.aClass2_Sub8_Sub1_19.method1406();
				local136 = Static59.aClass2_Sub8_Sub1_19.method1410();
				Static81.anIntArray414[local136] = local130;
				Static63.anIntArray258[local136] = local126;
				Static18.anIntArray367[local136] = 1;
				for (local146 = 0; local146 < 98; local146++) {
					if (Class14.anIntArray366[local146] <= local130) {
						Static18.anIntArray367[local136] = local146 + 2;
					}
				}
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 216) {
				Static95.anInt1977 = Static59.aClass2_Sub8_Sub1_19.method1410();
				Static8.anInt307 = -1;
				if (Static95.anInt1977 == Static37.anInt1223) {
					Static19.aBoolean99 = true;
					if (Static95.anInt1977 == 3) {
						Static37.anInt1223 = 1;
					} else {
						Static37.anInt1223 = 3;
					}
				}
				return true;
			}
			if (Static8.anInt307 == 115) {
				local126 = Static59.aClass2_Sub8_Sub1_19.method1406();
				local130 = Static59.aClass2_Sub8_Sub1_19.method1381();
				local314 = Static28.method503(local126);
				if (local314.anInt154 != local130 || local130 == -1) {
					local314.anInt190 = 0;
					local314.anInt196 = 0;
					local314.anInt154 = local130;
				}
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 185) {
				local126 = Static59.aClass2_Sub8_Sub1_19.method1396();
				local130 = Static59.aClass2_Sub8_Sub1_19.method1396();
				local136 = Static59.aClass2_Sub8_Sub1_19.method1393();
				local146 = Static59.aClass2_Sub8_Sub1_19.method1382();
				@Pc(1558) Class2_Sub1_Sub2 local1558 = Static28.method503(local136);
				local1558.anInt195 = local146;
				local1558.anInt181 = local126;
				Static8.anInt307 = -1;
				local1558.anInt165 = local130;
				return true;
			}
			if (Static8.anInt307 == 117) {
				Static37.anInt1225 = Static59.aClass2_Sub8_Sub1_19.method1410();
				Static19.aBoolean99 = true;
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 182) {
				if (Static37.anInt1223 == 12) {
					Static19.aBoolean99 = true;
				}
				Static24.anInt723 = Static59.aClass2_Sub8_Sub1_19.method1381();
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 208) {
				local126 = Static59.aClass2_Sub8_Sub1_19.method1382();
				local130 = Static59.aClass2_Sub8_Sub1_19.method1394();
				Static28.method504(local126);
				if (local130 != -1) {
					Static28.method504(local130);
				}
				if (Static98.anInt2770 != -1) {
					Static98.method1695(Static98.anInt2770);
					Static98.anInt2770 = -1;
				}
				if (Static89.anInt2549 != -1) {
					Static98.method1695(Static89.anInt2549);
					Static89.anInt2549 = -1;
				}
				if (Static21.anInt2494 != -1) {
					Static98.method1695(Static21.anInt2494);
					Static21.anInt2494 = -1;
				}
				if (local126 != Static96.anInt2688) {
					Static98.method1695(Static96.anInt2688);
					Static96.anInt2688 = local126;
					Static76.method1307(35);
				}
				if (local126 != Static46.anInt1375) {
					Static98.method1695(Static46.anInt1375);
					Static46.anInt1375 = local130;
				}
				Static55.anInt1673 = 0;
				Static85.anInt2453 = -1;
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 190) {
				for (local126 = 0; local126 < Static56.anInt1694; local126++) {
					@Pc(1696) Class2_Sub1_Sub16 local1696 = Static39.method764(local126);
					if (local1696 != null && local1696.anInt2755 == 0) {
						Static20.anIntArray86[local126] = 0;
						Static26.anIntArray416[local126] = 0;
					}
				}
				Static19.aBoolean99 = true;
				Static8.anInt307 = -1;
				if (Static5.anInt237 != -1) {
					Static107.aBoolean156 = true;
				}
				return true;
			}
			if (Static8.anInt307 == 235) {
				local126 = Static59.aClass2_Sub8_Sub1_19.method1410();
				local130 = Static59.aClass2_Sub8_Sub1_19.method1410();
				local136 = Static59.aClass2_Sub8_Sub1_19.method1410();
				local146 = Static59.aClass2_Sub8_Sub1_19.method1410();
				Static70.aBooleanArray20[local126] = true;
				Static39.anIntArray164[local126] = local130;
				Static96.anIntArray395[local126] = local136;
				Static28.anIntArray111[local126] = local146;
				Static106.anIntArray413[local126] = 0;
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 139) {
				local126 = Static59.aClass2_Sub8_Sub1_19.method1382();
				local130 = Static59.aClass2_Sub8_Sub1_19.method1393();
				local314 = Static28.method503(local130);
				local314.anInt152 = local126;
				local314.anInt194 = 1;
				Static8.anInt307 = -1;
				return true;
			}
			@Pc(1814) long local1814;
			if (Static8.anInt307 == 120) {
				local1335 = Static59.aClass2_Sub8_Sub1_19.method1405();
				local1814 = Static59.aClass2_Sub8_Sub1_19.method1396();
				@Pc(1819) long local1819 = (long) Static59.aClass2_Sub8_Sub1_19.method1388();
				local767 = Static59.aClass2_Sub8_Sub1_19.method1410();
				@Pc(1829) long local1829 = (local1814 << 32) + local1819;
				@Pc(1831) boolean local1831 = false;
				for (@Pc(1833) int local1833 = 0; local1833 < 100; local1833++) {
					if (Static18.aLongArray10[local1833] == local1829) {
						local1831 = true;
						break;
					}
				}
				if (local767 <= 1) {
					for (@Pc(1854) int local1854 = 0; local1854 < Static93.anInt2629; local1854++) {
						if (Static52.aLongArray6[local1854] == local1335) {
							local1831 = true;
							break;
						}
					}
				}
				if (!local1831 && Static12.anInt419 == 0) {
					Static18.aLongArray10[Static18.anInt2528] = local1829;
					Static18.anInt2528 = (Static18.anInt2528 + 1) % 100;
					@Pc(1897) Class65 local1897 = Static106.method1746(Static59.aClass2_Sub8_Sub1_19).method1771();
					if (local767 == 2 || local767 == 3) {
						Static36.method742(Static13.method282(new Class65[] { Static6.aClass65_117, Static24.method442(local1335).method1787() }), local1897, 7);
					} else if (local767 == 1) {
						Static36.method742(Static13.method282(new Class65[] { Static69.aClass65_954, Static24.method442(local1335).method1787() }), local1897, 7);
					} else {
						Static36.method742(Static24.method442(local1335).method1787(), local1897, 3);
					}
				}
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 22) {
				Static19.aBoolean99 = true;
				local126 = Static59.aClass2_Sub8_Sub1_19.method1406();
				local607 = Static28.method503(local126);
				while (Static59.aClass2_Sub8_Sub1_19.anInt2342 < Static57.anInt1718) {
					local140 = 0;
					local136 = Static59.aClass2_Sub8_Sub1_19.method1376();
					local146 = Static59.aClass2_Sub8_Sub1_19.method1396();
					if (local146 != 0) {
						local140 = Static59.aClass2_Sub8_Sub1_19.method1410();
						if (local140 == 255) {
							local140 = Static59.aClass2_Sub8_Sub1_19.method1406();
						}
					}
					if (local136 >= 0 && local136 < local607.anIntArray19.length) {
						local607.anIntArray19[local136] = local146;
						local607.anIntArray26[local136] = local140;
					}
				}
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 80) {
				Static56.method993(true);
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 246) {
				local126 = Static59.aClass2_Sub8_Sub1_19.method1406();
				local607 = Static28.method503(local126);
				local607.anInt194 = 3;
				local607.anInt152 = Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.aClass49_1.method1495();
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 143) {
				if (Static37.anInt1223 == 12) {
					Static19.aBoolean99 = true;
				}
				Static39.anInt1247 = Static59.aClass2_Sub8_Sub1_19.method1410();
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 103) {
				Static56.method993(false);
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 52) {
				Static47.method827();
				Static8.anInt307 = -1;
				return false;
			}
			if (Static8.anInt307 == 13) {
				Static108.anInt2865 = Static59.aClass2_Sub8_Sub1_19.method1410();
				if (Static108.anInt2865 == 1) {
					Static99.anInt2539 = Static59.aClass2_Sub8_Sub1_19.method1396();
				}
				if (Static108.anInt2865 >= 2 && Static108.anInt2865 <= 6) {
					if (Static108.anInt2865 == 2) {
						Static103.anInt2809 = 64;
						Static54.anInt1637 = 64;
					}
					if (Static108.anInt2865 == 3) {
						Static54.anInt1637 = 64;
						Static103.anInt2809 = 0;
					}
					if (Static108.anInt2865 == 4) {
						Static103.anInt2809 = 128;
						Static54.anInt1637 = 64;
					}
					if (Static108.anInt2865 == 5) {
						Static54.anInt1637 = 0;
						Static103.anInt2809 = 64;
					}
					if (Static108.anInt2865 == 6) {
						Static54.anInt1637 = 128;
						Static103.anInt2809 = 64;
					}
					Static108.anInt2865 = 2;
					Static55.anInt1678 = Static59.aClass2_Sub8_Sub1_19.method1396();
					Static77.anInt2245 = Static59.aClass2_Sub8_Sub1_19.method1396();
					Static53.anInt1941 = Static59.aClass2_Sub8_Sub1_19.method1410();
				}
				if (Static108.anInt2865 == 10) {
					Static25.anInt729 = Static59.aClass2_Sub8_Sub1_19.method1396();
				}
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 75 || Static8.anInt307 == 214 || Static8.anInt307 == 141 || Static8.anInt307 == 135 || Static8.anInt307 == 61 || Static8.anInt307 == 35 || Static8.anInt307 == 123 || Static8.anInt307 == 114 || Static8.anInt307 == 96 || Static8.anInt307 == 0 || Static8.anInt307 == 144) {
				Static53.method1148();
				Static8.anInt307 = -1;
				return true;
			}
			@Pc(2252) Class65 local2252;
			if (Static8.anInt307 == 94) {
				local2252 = Static59.aClass2_Sub8_Sub1_19.method1400();
				@Pc(2289) boolean local2289;
				if (local2252.method1784(Static82.aClass65_1059)) {
					local310 = local2252.method1772(local2252.method1775(Static13.aClass65_239), 0);
					local1814 = local310.method1790();
					local2289 = false;
					for (local755 = 0; local755 < Static93.anInt2629; local755++) {
						if (local1814 == Static52.aLongArray6[local755]) {
							local2289 = true;
							break;
						}
					}
					if (!local2289 && Static12.anInt419 == 0) {
						Static36.method742(local310, Static28.aClass65_377, 4);
					}
				} else if (local2252.method1784(Static15.aClass65_248)) {
					local310 = local2252.method1772(local2252.method1775(Static13.aClass65_239), 0);
					local2289 = false;
					local1814 = local310.method1790();
					for (local755 = 0; local755 < Static93.anInt2629; local755++) {
						if (local1814 == Static52.aLongArray6[local755]) {
							local2289 = true;
							break;
						}
					}
					if (!local2289 && Static12.anInt419 == 0) {
						Static36.method742(local310, Static61.aClass65_838, 8);
					}
				} else if (local2252.method1784(Static50.aClass65_640)) {
					local310 = local2252.method1772(local2252.method1775(Static13.aClass65_239), 0);
					local1814 = local310.method1790();
					local2289 = false;
					for (local755 = 0; local755 < Static93.anInt2629; local755++) {
						if (local1814 == Static52.aLongArray6[local755]) {
							local2289 = true;
							break;
						}
					}
					if (!local2289 && Static12.anInt419 == 0) {
						@Pc(2329) Class65 local2329 = local2252.method1772(local2252.method1760() - 9, local2252.method1775(Static13.aClass65_239) + 1);
						Static36.method742(local310, local2329, 8);
					}
				} else {
					Static36.method742(Static8.aClass65_145, local2252, 0);
				}
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 215) {
				Static19.method1100();
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 189) {
				local1335 = Static59.aClass2_Sub8_Sub1_19.method1405();
				local136 = Static59.aClass2_Sub8_Sub1_19.method1396();
				@Pc(2472) Class65 local2472 = Static24.method442(local1335).method1787();
				for (local140 = 0; local140 < Static32.anInt1047; local140++) {
					if (local1335 == Static4.aLongArray2[local140]) {
						if (Static12.anIntArray71[local140] != local136) {
							Static12.anIntArray71[local140] = local136;
							Static19.aBoolean99 = true;
							if (local136 > 0) {
								Static36.method742(Static8.aClass65_145, Static13.method282(new Class65[] { local2472, Static35.aClass65_505 }), 5);
							}
							if (local136 == 0) {
								Static36.method742(Static8.aClass65_145, Static13.method282(new Class65[] { local2472, Static8.aClass65_155 }), 5);
							}
						}
						local2472 = null;
						break;
					}
				}
				@Pc(2546) boolean local2546 = false;
				if (local2472 != null && Static32.anInt1047 < 200) {
					Static4.aLongArray2[Static32.anInt1047] = local1335;
					Static67.aClass65Array9[Static32.anInt1047] = local2472;
					Static12.anIntArray71[Static32.anInt1047] = local136;
					Static19.aBoolean99 = true;
					Static32.anInt1047++;
				}
				while (!local2546) {
					local2546 = true;
					for (local767 = 0; local767 < Static32.anInt1047 - 1; local767++) {
						if (Static12.anIntArray71[local767] != Static41.anInt1300 && Static12.anIntArray71[local767 + 1] == Static41.anInt1300 || Static12.anIntArray71[local767] == 0 && Static12.anIntArray71[local767 + 1] != 0) {
							local2546 = false;
							@Pc(2619) int local2619 = Static12.anIntArray71[local767];
							Static12.anIntArray71[local767] = Static12.anIntArray71[local767 + 1];
							Static12.anIntArray71[local767 + 1] = local2619;
							@Pc(2637) Class65 local2637 = Static67.aClass65Array9[local767];
							Static67.aClass65Array9[local767] = Static67.aClass65Array9[local767 + 1];
							Static67.aClass65Array9[local767 + 1] = local2637;
							@Pc(2655) long local2655 = Static4.aLongArray2[local767];
							Static4.aLongArray2[local767] = Static4.aLongArray2[local767 + 1];
							Static4.aLongArray2[local767 + 1] = local2655;
							Static19.aBoolean99 = true;
						}
					}
				}
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 255) {
				if (Static21.anInt2494 != -1) {
					Static98.method1695(Static21.anInt2494);
					Static21.anInt2494 = -1;
				}
				Static55.anInt1673 = 1;
				Static107.aBoolean156 = true;
				Static8.anInt307 = -1;
				Static8.aClass65_144 = Static8.aClass65_145;
				Static85.aBoolean125 = false;
				return true;
			}
			if (Static8.anInt307 == 47) {
				Static84.anInt2416 = Static59.aClass2_Sub8_Sub1_19.method1382();
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 76) {
				local2252 = Static59.aClass2_Sub8_Sub1_19.method1400();
				local130 = Static59.aClass2_Sub8_Sub1_19.method1410();
				local136 = Static59.aClass2_Sub8_Sub1_19.method1412();
				if (local130 >= 1 && local130 <= 5) {
					if (local2252.method1788(Static63.aClass65_857)) {
						local2252 = null;
					}
					Static1.aClass65Array1[local130 - 1] = local2252;
					Static21.aBooleanArray22[local130 - 1] = local136 == 0;
				}
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 254) {
				Static35.aBoolean73 = true;
				Static47.anInt1385 = Static59.aClass2_Sub8_Sub1_19.method1410();
				Static61.anInt1850 = Static59.aClass2_Sub8_Sub1_19.method1410();
				Static84.anInt2417 = Static59.aClass2_Sub8_Sub1_19.method1396();
				Static57.anInt1723 = Static59.aClass2_Sub8_Sub1_19.method1410();
				Static54.anInt1639 = Static59.aClass2_Sub8_Sub1_19.method1410();
				if (Static54.anInt1639 >= 100) {
					Static51.anInt1481 = Static61.anInt1850 * 128 + 64;
					Static87.anInt2520 = Static47.anInt1385 * 128 + 64;
					Static26.anInt2923 = Static25.method447(Static62.anInt1879, Static51.anInt1481, Static87.anInt2520) - Static84.anInt2417;
				}
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 196) {
				local126 = Static59.aClass2_Sub8_Sub1_19.method1396();
				Static28.method504(local126);
				if (Static21.anInt2494 != -1) {
					Static98.method1695(Static21.anInt2494);
					Static107.aBoolean156 = true;
					Static21.anInt2494 = -1;
				}
				if (Static96.anInt2688 != -1) {
					Static98.method1695(Static96.anInt2688);
					Static96.anInt2688 = -1;
					Static76.method1307(30);
				}
				if (Static46.anInt1375 != -1) {
					Static98.method1695(Static46.anInt1375);
					Static46.anInt1375 = -1;
				}
				if (Static98.anInt2770 != -1) {
					Static98.method1695(Static98.anInt2770);
					Static98.anInt2770 = -1;
				}
				if (Static89.anInt2549 != local126) {
					Static98.method1695(Static89.anInt2549);
					Static89.anInt2549 = local126;
				}
				if (Static55.anInt1673 != 0) {
					Static107.aBoolean156 = true;
					Static55.anInt1673 = 0;
				}
				Static19.aBoolean99 = true;
				Static22.aBoolean46 = true;
				Static8.anInt307 = -1;
				Static85.anInt2453 = -1;
				return true;
			}
			if (Static8.anInt307 == 5) {
				Static102.anInt2800 = Static59.aClass2_Sub8_Sub1_19.method1412();
				Static74.anInt1538 = Static59.aClass2_Sub8_Sub1_19.method1395();
				while (Static59.aClass2_Sub8_Sub1_19.anInt2342 < Static57.anInt1718) {
					Static8.anInt307 = Static59.aClass2_Sub8_Sub1_19.method1410();
					Static53.method1148();
				}
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 229) {
				@Pc(2949) byte local2949 = Static59.aClass2_Sub8_Sub1_19.method1368();
				local130 = Static59.aClass2_Sub8_Sub1_19.method1396();
				Static20.anIntArray86[local130] = local2949;
				if (Static26.anIntArray416[local130] != local2949) {
					Static26.anIntArray416[local130] = local2949;
					Static98.method1698(local130);
					if (Static5.anInt237 != -1) {
						Static107.aBoolean156 = true;
					}
					Static19.aBoolean99 = true;
				}
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 82) {
				for (local126 = 0; local126 < Static89.aClass2_Sub1_Sub1_Sub2_Sub2Array1.length; local126++) {
					if (Static89.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local126] != null) {
						Static89.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local126].anInt1552 = -1;
					}
				}
				for (local130 = 0; local130 < Static24.aClass2_Sub1_Sub1_Sub2_Sub1Array1.length; local130++) {
					if (Static24.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local130] != null) {
						Static24.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local130].anInt1552 = -1;
					}
				}
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 19) {
				Static19.aBoolean99 = true;
				local126 = Static59.aClass2_Sub8_Sub1_19.method1406();
				local607 = Static28.method503(local126);
				local136 = Static59.aClass2_Sub8_Sub1_19.method1396();
				for (local146 = 0; local146 < local136; local146++) {
					local140 = Static59.aClass2_Sub8_Sub1_19.method1396();
					local755 = Static59.aClass2_Sub8_Sub1_19.method1395();
					if (local755 == 255) {
						local755 = Static59.aClass2_Sub8_Sub1_19.method1393();
					}
					if (local146 < local607.anIntArray19.length) {
						local607.anIntArray19[local146] = local140;
						local607.anIntArray26[local146] = local755;
					}
				}
				for (local140 = local136; local140 < local607.anIntArray19.length; local140++) {
					local607.anIntArray19[local140] = 0;
					local607.anIntArray26[local140] = 0;
				}
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 68) {
				Static74.anInt1538 = Static59.aClass2_Sub8_Sub1_19.method1410();
				Static102.anInt2800 = Static59.aClass2_Sub8_Sub1_19.method1412();
				for (local126 = Static74.anInt1538; local126 < Static74.anInt1538 + 8; local126++) {
					for (local130 = Static102.anInt2800; local130 < Static102.anInt2800 + 8; local130++) {
						if (Static22.aClass52ArrayArrayArray1[Static62.anInt1879][local126][local130] != null) {
							Static22.aClass52ArrayArrayArray1[Static62.anInt1879][local126][local130] = null;
							Static69.method1241(local130, local126);
						}
					}
				}
				for (@Pc(3171) Class2_Sub12 local3171 = (Class2_Sub12) Static13.aClass52_3.method1587(); local3171 != null; local3171 = (Class2_Sub12) Static13.aClass52_3.method1588()) {
					if (Static74.anInt1538 <= local3171.anInt1709 && Static74.anInt1538 + 8 > local3171.anInt1709 && local3171.anInt1698 >= Static102.anInt2800 && Static102.anInt2800 + 8 > local3171.anInt1698 && Static62.anInt1879 == local3171.anInt1702) {
						local3171.anInt1690 = 0;
					}
				}
				Static8.anInt307 = -1;
				return true;
			}
			if (Static8.anInt307 == 203) {
				if (Static21.anInt2494 != -1) {
					Static98.method1695(Static21.anInt2494);
					Static21.anInt2494 = -1;
				}
				Static107.aBoolean156 = true;
				Static8.aClass65_144 = Static8.aClass65_145;
				Static55.anInt1673 = 2;
				Static8.anInt307 = -1;
				Static85.aBoolean125 = false;
				return true;
			}
			if (Static8.anInt307 == 92) {
				Static1.anInt1 = Static59.aClass2_Sub8_Sub1_19.method1410();
				Static8.anInt307 = -1;
				return true;
			}
			Static30.method573("T1 - " + Static8.anInt307 + "," + Static41.anInt1302 + "," + Static56.anInt1693 + " - " + Static57.anInt1718, null);
			Static47.method827();
		} catch (@Pc(3283) IOException local3283) {
			Static7.method151();
		} catch (@Pc(3287) Exception local3287) {
			@Pc(3327) String local3327 = "T2 - " + Static8.anInt307 + "," + Static41.anInt1302 + "," + Static56.anInt1693 + " - " + Static57.anInt1718 + "," + (Static107.anInt2849 + Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray209[0]) + "," + (Static37.anInt1220 + Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray208[0]) + " - ";
			for (local130 = 0; local130 < Static57.anInt1718 && local130 < 50; local130++) {
				local3327 = local3327 + Static59.aClass2_Sub8_Sub1_19.aByteArray59[local130] + ",";
			}
			Static30.method573(local3327, local3287);
			Static47.method827();
		}
		return true;
	}

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "(I)V")
	public static void method82() {
		aClass2_Sub1_Sub4_Sub2Array2 = null;
		aClass65_83 = null;
		aClass65_87 = null;
		aClass65_90 = null;
		anIntArray20 = null;
		anIntArray27 = null;
	}

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "(I)V")
	public static void method84() {
		Static67.aClass15_46.method1098();
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!k;I)V")
	public static void method87(@OriginalArg(0) Class33 arg0) {
		Static95.aClass33_33 = arg0;
	}
}
