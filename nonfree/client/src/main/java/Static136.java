import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!r", name = "h", descriptor = "Lclient!rh;")
	public static Interface3 anInterface3_2;

	@OriginalMember(owner = "client!r", name = "q", descriptor = "I")
	public static int anInt3193;

	@OriginalMember(owner = "client!r", name = "c", descriptor = "Lclient!kb;")
	private static Class46 aClass46_1095 = Static65.method1172("Use");

	@OriginalMember(owner = "client!r", name = "e", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1096 = aClass46_1095;

	@OriginalMember(owner = "client!r", name = "g", descriptor = "Lclient!kb;")
	private static Class46 aClass46_1097 = Static65.method1172(":clan:");

	@OriginalMember(owner = "client!r", name = "m", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1098 = Static65.method1172("scrollbar");

	@OriginalMember(owner = "client!r", name = "o", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1099 = Static65.method1172("(U0a )2 non)2existant gosub script)2num: ");

	@OriginalMember(owner = "client!r", name = "r", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1100 = Static65.method1172("<col=ff0000>");

	@OriginalMember(owner = "client!r", name = "s", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1101 = Static65.method1172("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
	public static void method2318() {
		aClass46_1100 = null;
		aClass46_1096 = null;
		aClass46_1097 = null;
		anInterface3_2 = null;
		aClass46_1095 = null;
		aClass46_1098 = null;
		aClass46_1101 = null;
		aClass46_1099 = null;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IZ)Lclient!ih;")
	public static Class3_Sub2_Sub9 method2319(@OriginalArg(0) int arg0) {
		@Pc(6) Class3_Sub2_Sub9 local6 = (Class3_Sub2_Sub9) Static143.aClass57_23.method1719((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static102.aClass44_19.method1624(6, arg0);
		local6 = new Class3_Sub2_Sub9();
		local6.anInt1826 = arg0;
		if (local20 != null) {
			local6.method1206(new Class3_Sub4(local20));
		}
		local6.method1208();
		if (local6.aBoolean75) {
			local6.aBoolean69 = false;
			local6.anInt1820 = 0;
		}
		Static143.aClass57_23.method1717(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)Z")
	public static boolean method2320() {
		if (Static129.aClass1_3 == null) {
			return false;
		}
		@Pc(176) int local176;
		try {
			@Pc(13) int local13 = Static129.aClass1_3.method4();
			if (local13 == 0) {
				return false;
			}
			if (Static57.anInt1552 == -1) {
				Static129.aClass1_3.method3(Static49.aClass3_Sub4_Sub1_2.aByteArray5, 1, 0);
				Static49.aClass3_Sub4_Sub1_2.anInt232 = 0;
				Static57.anInt1552 = Static49.aClass3_Sub4_Sub1_2.method226();
				local13--;
				Static139.anInt3221 = Static167.anIntArray50[Static57.anInt1552];
			}
			if (Static139.anInt3221 == -1) {
				if (local13 <= 0) {
					return false;
				}
				Static129.aClass1_3.method3(Static49.aClass3_Sub4_Sub1_2.aByteArray5, 1, 0);
				local13--;
				Static139.anInt3221 = Static49.aClass3_Sub4_Sub1_2.aByteArray5[0] & 0xFF;
			}
			if (Static139.anInt3221 == -2) {
				if (local13 <= 1) {
					return false;
				}
				Static129.aClass1_3.method3(Static49.aClass3_Sub4_Sub1_2.aByteArray5, 2, 0);
				local13 -= 2;
				Static49.aClass3_Sub4_Sub1_2.anInt232 = 0;
				Static139.anInt3221 = Static49.aClass3_Sub4_Sub1_2.method208();
			}
			if (Static139.anInt3221 > local13) {
				return false;
			}
			Static49.aClass3_Sub4_Sub1_2.anInt232 = 0;
			Static129.aClass1_3.method3(Static49.aClass3_Sub4_Sub1_2.aByteArray5, Static139.anInt3221, 0);
			Static42.anInt1174 = 0;
			Static124.anInt2964 = Static156.anInt3496;
			Static156.anInt3496 = Static72.anInt1850;
			Static72.anInt1850 = Static57.anInt1552;
			if (Static57.anInt1552 == 123) {
				Static34.anInt954 = Static49.aClass3_Sub4_Sub1_2.method191();
				Static16.anInt418 = Static178.anInt3928;
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 14) {
				Static71.method1215();
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 140) {
				Static163.anInt3623 = Static49.aClass3_Sub4_Sub1_2.method174() * 30;
				Static57.anInt1552 = -1;
				Static108.anInt2582 = Static178.anInt3928;
				return true;
			}
			@Pc(180) int local180;
			@Pc(172) int local172;
			@Pc(184) int local184;
			if (Static57.anInt1552 == 75) {
				local172 = Static49.aClass3_Sub4_Sub1_2.method174();
				local176 = Static49.aClass3_Sub4_Sub1_2.method213();
				local180 = Static49.aClass3_Sub4_Sub1_2.method174();
				local184 = Static49.aClass3_Sub4_Sub1_2.method184();
				@Pc(188) Class33 local188 = Static179.method2873(local176);
				if (local180 != local188.anInt1460 || local188.anInt1485 != local172 || local184 != local188.anInt1444) {
					local188.anInt1460 = local180;
					local188.anInt1485 = local172;
					local188.anInt1444 = local184;
					Static142.method2373(local188);
				}
				Static57.anInt1552 = -1;
				return true;
			}
			@Pc(233) long local233;
			if (Static57.anInt1552 == 252) {
				local233 = Static49.aClass3_Sub4_Sub1_2.method185();
				@Pc(240) Class46 local240 = Static138.method815(Static130.method2188(Static49.aClass3_Sub4_Sub1_2).method1364());
				Static168.method2686(6, Static116.method1961(local233).method1371(), local240);
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 52) {
				for (local172 = 0; local172 < Static41.anIntArray419.length; local172++) {
					if (Static173.anIntArray424[local172] != Static41.anIntArray419[local172]) {
						Static41.anIntArray419[local172] = Static173.anIntArray424[local172];
						Static124.method2124(local172);
						Static57.anIntArray149[Static143.anInt3278++ & 0x1F] = local172;
					}
				}
				Static57.anInt1552 = -1;
				return true;
			}
			@Pc(324) Class33 local324;
			if (Static57.anInt1552 == 98) {
				local172 = Static49.aClass3_Sub4_Sub1_2.method179();
				local176 = Static49.aClass3_Sub4_Sub1_2.method207();
				local324 = Static179.method2873(local176);
				if (local324.anInt1493 != local172 || local172 == -1) {
					local324.anInt1423 = 0;
					local324.anInt1483 = 0;
					local324.anInt1493 = local172;
					Static142.method2373(local324);
				}
				Static57.anInt1552 = -1;
				return true;
			}
			@Pc(377) Class33 local377;
			if (Static57.anInt1552 == 176) {
				local172 = Static49.aClass3_Sub4_Sub1_2.method207();
				local176 = Static49.aClass3_Sub4_Sub1_2.method207();
				local180 = Static49.aClass3_Sub4_Sub1_2.method208();
				local377 = Static179.method2873(local172);
				if (local180 == 65535) {
					local180 = -1;
				}
				@Pc(395) Class3_Sub2_Sub14 local395;
				if (local377.aBoolean50) {
					local377.anInt1471 = local176;
					local377.anInt1419 = local180;
					local395 = Static146.method2432(local180);
					local377.anInt1430 = local395.anInt3314;
					local377.anInt1496 = local395.anInt3316;
					local377.anInt1477 = local395.anInt3346;
					local377.anInt1460 = local395.anInt3323;
					local377.anInt1485 = local395.anInt3322;
					local377.anInt1444 = local395.anInt3309;
					if (local377.anInt1424 > 0) {
						local377.anInt1444 = local377.anInt1444 * 32 / local377.anInt1424;
					}
					Static142.method2373(local377);
				} else if (local180 == -1) {
					Static57.anInt1552 = -1;
					local377.anInt1494 = 0;
					return true;
				} else {
					local395 = Static146.method2432(local180);
					local377.anInt1418 = local180;
					local377.anInt1460 = local395.anInt3323;
					local377.anInt1485 = local395.anInt3322;
					local377.anInt1444 = local395.anInt3309 * 100 / local176;
					local377.anInt1494 = 4;
					Static142.method2373(local377);
				}
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 33) {
				Static83.method1399();
				Static16.anInt413 = Static49.aClass3_Sub4_Sub1_2.method191();
				Static108.anInt2582 = Static178.anInt3928;
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 1) {
				Static106.method1735();
				Static57.anInt1552 = -1;
				return false;
			}
			@Pc(565) int local565;
			@Pc(569) int local569;
			@Pc(659) int local659;
			@Pc(611) Class3_Sub12 local611;
			@Pc(653) int local653;
			@Pc(657) int local657;
			@Pc(669) long local669;
			if (Static57.anInt1552 == 65) {
				local172 = Static139.anInt3221 + Static49.aClass3_Sub4_Sub1_2.anInt232;
				local176 = Static49.aClass3_Sub4_Sub1_2.method208();
				local180 = Static49.aClass3_Sub4_Sub1_2.method208();
				if (Static85.anInt674 != local176) {
					Static85.anInt674 = local176;
					Static172.method2727(Static85.anInt674);
					Static170.method2713(Static85.anInt674);
					for (local184 = 0; local184 < 100; local184++) {
						Static178.aBooleanArray20[local184] = true;
					}
				}
				while (local180-- > 0) {
					local184 = Static49.aClass3_Sub4_Sub1_2.method213();
					local565 = Static49.aClass3_Sub4_Sub1_2.method208();
					local569 = Static49.aClass3_Sub4_Sub1_2.method191();
					@Pc(576) Class3_Sub12 local576 = (Class3_Sub12) Static129.aClass54_10.method1602((long) local184);
					if (local576 != null && local576.anInt1766 != local565) {
						Static18.method336(true, local576);
						local576 = null;
					}
					if (local576 == null) {
						local576 = Static32.method575(local565, local184, local569);
					}
					local576.aBoolean66 = true;
				}
				for (local611 = (Class3_Sub12) Static129.aClass54_10.method1598(); local611 != null; local611 = (Class3_Sub12) Static129.aClass54_10.method1609()) {
					if (local611.aBoolean66) {
						local611.aBoolean66 = false;
					} else {
						Static18.method336(true, local611);
					}
				}
				Static34.aClass54_3 = new Class54(512);
				while (Static49.aClass3_Sub4_Sub1_2.anInt232 < local172) {
					local565 = Static49.aClass3_Sub4_Sub1_2.method213();
					local569 = Static49.aClass3_Sub4_Sub1_2.method208();
					local653 = Static49.aClass3_Sub4_Sub1_2.method208();
					local657 = Static49.aClass3_Sub4_Sub1_2.method213();
					for (local659 = local569; local659 <= local653; local659++) {
						local669 = (long) local659 + ((long) local565 << 32);
						Static34.aClass54_3.method1603(local669, new Class3_Sub25(local657));
					}
				}
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 221) {
				Static123.aBoolean122 = true;
				Static77.anInt1926 = Static49.aClass3_Sub4_Sub1_2.method191();
				Static33.anInt925 = Static49.aClass3_Sub4_Sub1_2.method191();
				Static142.anInt3264 = Static49.aClass3_Sub4_Sub1_2.method208();
				Static71.anInt1835 = Static49.aClass3_Sub4_Sub1_2.method191();
				Static26.anInt596 = Static49.aClass3_Sub4_Sub1_2.method191();
				if (Static26.anInt596 >= 100) {
					Static70.anInt1833 = Static33.anInt925 * 128 + 64;
					Static134.anInt3130 = Static77.anInt1926 * 128 + 64;
					Static94.anInt2298 = Static168.method2689(Static70.anInt1833, Static134.anInt3130, Static99.anInt2422) - Static142.anInt3264;
				}
				Static57.anInt1552 = -1;
				return true;
			}
			@Pc(878) int local878;
			@Pc(778) long local778;
			@Pc(871) int local871;
			if (Static57.anInt1552 == 248) {
				Static154.anInt3471 = Static178.anInt3928;
				local233 = Static49.aClass3_Sub4_Sub1_2.method185();
				if (local233 == 0L) {
					Static22.aClass46_149 = null;
					Static86.aClass3_Sub17Array1 = null;
					Static173.aClass46_1358 = null;
					Static57.anInt1552 = -1;
					Static90.anInt2207 = 0;
					return true;
				}
				local778 = Static49.aClass3_Sub4_Sub1_2.method185();
				Static173.aClass46_1358 = Static116.method1961(local778);
				Static22.aClass46_149 = Static116.method1961(local233);
				Static160.aByte9 = Static49.aClass3_Sub4_Sub1_2.method203();
				local565 = Static49.aClass3_Sub4_Sub1_2.method191();
				if (local565 == 255) {
					Static57.anInt1552 = -1;
					return true;
				}
				Static90.anInt2207 = local565;
				@Pc(810) Class3_Sub17[] local810 = new Class3_Sub17[100];
				for (local653 = 0; local653 < Static90.anInt2207; local653++) {
					local810[local653] = new Class3_Sub17();
					local810[local653].aLong143 = Static49.aClass3_Sub4_Sub1_2.method185();
					local810[local653].aClass46_974 = Static116.method1961(local810[local653].aLong143);
					local810[local653].anInt2819 = Static49.aClass3_Sub4_Sub1_2.method208();
					local810[local653].aByte6 = Static49.aClass3_Sub4_Sub1_2.method203();
					if (Static40.aLong43 == local810[local653].aLong143) {
						Static119.aByte7 = local810[local653].aByte6;
					}
				}
				local871 = Static90.anInt2207;
				while (local871 > 0) {
					@Pc(875) boolean local875 = true;
					local871--;
					for (local878 = 0; local878 < local871; local878++) {
						if (local810[local878].aClass46_974.method1378(local810[local878 + 1].aClass46_974) > 0) {
							local875 = false;
							@Pc(902) Class3_Sub17 local902 = local810[local878];
							local810[local878] = local810[local878 + 1];
							local810[local878 + 1] = local902;
						}
					}
					if (local875) {
						break;
					}
				}
				Static86.aClass3_Sub17Array1 = local810;
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 189) {
				Static108.method1769(true);
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 105) {
				Static108.method1769(false);
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 222) {
				local172 = Static49.aClass3_Sub4_Sub1_2.method208();
				Static16.method321(local172);
				Static176.anIntArray434[Static14.anInt376++ & 0x1F] = local172 & 0x7FFF;
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 148) {
				Static83.method1399();
				local172 = Static49.aClass3_Sub4_Sub1_2.method212();
				local176 = Static49.aClass3_Sub4_Sub1_2.method205();
				local180 = Static49.aClass3_Sub4_Sub1_2.method223();
				Static163.anIntArray409[local176] = local172;
				Static159.anIntArray403[local176] = local180;
				Static12.anIntArray440[local176] = 1;
				for (local184 = 0; local184 < 98; local184++) {
					if (local172 >= Class34.anIntArray156[local184]) {
						Static12.anIntArray440[local176] = local184 + 2;
					}
				}
				Static9.anIntArray12[Static111.anInt2630++ & 0x1F] = local176;
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 218) {
				local172 = Static49.aClass3_Sub4_Sub1_2.method171();
				Static85.anInt674 = local172;
				Static172.method2727(local172);
				Static170.method2713(Static85.anInt674);
				for (local176 = 0; local176 < 100; local176++) {
					Static178.aBooleanArray20[local176] = true;
				}
				Static57.anInt1552 = -1;
				return true;
			}
			@Pc(1101) boolean local1101;
			if (Static57.anInt1552 == 46) {
				local233 = Static49.aClass3_Sub4_Sub1_2.method185();
				local1101 = false;
				if ((Long.MIN_VALUE & local233) != 0L) {
					local1101 = true;
				}
				local180 = Static49.aClass3_Sub4_Sub1_2.method208();
				@Pc(1119) byte local1119 = Static49.aClass3_Sub4_Sub1_2.method203();
				if (local1101) {
					if (Static90.anInt2207 == 0) {
						Static57.anInt1552 = -1;
						return true;
					}
					local233 &= Long.MAX_VALUE;
					for (local569 = 0; local569 < Static90.anInt2207 && (local233 != Static86.aClass3_Sub17Array1[local569].aLong143 || Static86.aClass3_Sub17Array1[local569].anInt2819 != local180); local569++) {
					}
					if (local569 < Static90.anInt2207) {
						while (Static90.anInt2207 - 1 > local569) {
							Static86.aClass3_Sub17Array1[local569] = Static86.aClass3_Sub17Array1[local569 + 1];
							local569++;
						}
						Static90.anInt2207--;
						Static86.aClass3_Sub17Array1[Static90.anInt2207] = null;
					}
				} else {
					@Pc(1201) Class3_Sub17 local1201 = new Class3_Sub17();
					local1201.aLong143 = local233;
					local1201.aClass46_974 = Static116.method1961(local1201.aLong143);
					local1201.aByte6 = local1119;
					local1201.anInt2819 = local180;
					for (local653 = Static90.anInt2207 - 1; local653 >= 0; local653--) {
						local657 = Static86.aClass3_Sub17Array1[local653].aClass46_974.method1378(local1201.aClass46_974);
						if (local657 == 0) {
							Static86.aClass3_Sub17Array1[local653].anInt2819 = local180;
							Static86.aClass3_Sub17Array1[local653].aByte6 = local1119;
							Static57.anInt1552 = -1;
							Static154.anInt3471 = Static178.anInt3928;
							if (Static40.aLong43 == local233) {
								Static119.aByte7 = local1119;
							}
							return true;
						}
						if (local657 < 0) {
							break;
						}
					}
					if (Static86.aClass3_Sub17Array1.length <= Static90.anInt2207) {
						Static57.anInt1552 = -1;
						return true;
					}
					for (local657 = Static90.anInt2207 - 1; local657 > local653; local657--) {
						Static86.aClass3_Sub17Array1[local657 + 1] = Static86.aClass3_Sub17Array1[local657];
					}
					if (Static90.anInt2207 == 0) {
						Static86.aClass3_Sub17Array1 = new Class3_Sub17[100];
					}
					Static86.aClass3_Sub17Array1[local653 + 1] = local1201;
					Static90.anInt2207++;
					if (Static40.aLong43 == local233) {
						Static119.aByte7 = local1119;
					}
				}
				Static57.anInt1552 = -1;
				Static154.anInt3471 = Static178.anInt3928;
				return true;
			}
			@Pc(1344) Class33 local1344;
			if (Static57.anInt1552 == 238) {
				local172 = Static49.aClass3_Sub4_Sub1_2.method214();
				local1344 = Static179.method2873(local172);
				for (local180 = 0; local180 < local1344.anIntArray142.length; local180++) {
					local1344.anIntArray142[local180] = -1;
					local1344.anIntArray142[local180] = 0;
				}
				Static142.method2373(local1344);
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 124) {
				local172 = Static49.aClass3_Sub4_Sub1_2.method213();
				local176 = Static49.aClass3_Sub4_Sub1_2.method208();
				if (local172 < -70000) {
					local176 += 32768;
				}
				if (local172 < 0) {
					local324 = null;
				} else {
					local324 = Static179.method2873(local172);
				}
				while (Static49.aClass3_Sub4_Sub1_2.anInt232 < Static139.anInt3221) {
					local184 = Static49.aClass3_Sub4_Sub1_2.method209();
					local565 = Static49.aClass3_Sub4_Sub1_2.method208();
					local569 = 0;
					if (local565 != 0) {
						local569 = Static49.aClass3_Sub4_Sub1_2.method191();
						if (local569 == 255) {
							local569 = Static49.aClass3_Sub4_Sub1_2.method213();
						}
					}
					if (local324 != null && local184 >= 0 && local324.anIntArray142.length > local184) {
						local324.anIntArray142[local184] = local565;
						local324.anIntArray138[local184] = local569;
					}
					Static148.method2572(local184, local176, local565 - 1, local569);
				}
				if (local324 != null) {
					Static142.method2373(local324);
				}
				Static83.method1399();
				Static176.anIntArray434[Static14.anInt376++ & 0x1F] = local176 & 0x7FFF;
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 153) {
				if (Static85.anInt674 != -1) {
					Static169.method2711(Static85.anInt674, 0);
				}
				Static57.anInt1552 = -1;
				return true;
			}
			@Pc(1529) Class46 local1529;
			if (Static57.anInt1552 == 142) {
				local1529 = Static49.aClass3_Sub4_Sub1_2.method172();
				@Pc(1536) Object[] local1536 = new Object[local1529.method1376() + 1];
				for (local180 = local1529.method1376() - 1; local180 >= 0; local180--) {
					if (local1529.method1357(local180) == 115) {
						local1536[local180 + 1] = Static49.aClass3_Sub4_Sub1_2.method172();
					} else {
						local1536[local180 + 1] = Integer.valueOf(Static49.aClass3_Sub4_Sub1_2.method213());
					}
				}
				local1536[0] = Integer.valueOf(Static49.aClass3_Sub4_Sub1_2.method213());
				@Pc(1591) Class3_Sub14 local1591 = new Class3_Sub14();
				local1591.anObjectArray28 = local1536;
				Static71.method1217(local1591);
				Static57.anInt1552 = -1;
				return true;
			}
			@Pc(1631) Class46 local1631;
			if (Static57.anInt1552 == 13) {
				local1529 = Static49.aClass3_Sub4_Sub1_2.method172();
				if (local1529.method1385(Static81.aClass46_692)) {
					local1101 = false;
					local1631 = local1529.method1363(local1529.method1355(Static35.aClass46_272), 0);
					local778 = local1631.method1348();
					for (local569 = 0; local569 < Static25.anInt3983; local569++) {
						if (Static146.aLongArray3[local569] == local778) {
							local1101 = true;
							break;
						}
					}
					if (!local1101 && Static153.anInt3469 == 0) {
						Static168.method2686(4, local1631, Static114.aClass46_933);
					}
				} else if (local1529.method1385(Static172.aClass46_1356)) {
					local1631 = local1529.method1363(local1529.method1355(Static35.aClass46_272), 0);
					local778 = local1631.method1348();
					local1101 = false;
					for (local569 = 0; local569 < Static25.anInt3983; local569++) {
						if (local778 == Static146.aLongArray3[local569]) {
							local1101 = true;
							break;
						}
					}
					if (!local1101 && Static153.anInt3469 == 0) {
						@Pc(1682) Class46 local1682 = local1529.method1363(local1529.method1376() - 9, local1529.method1355(Static35.aClass46_272) + 1);
						Static168.method2686(8, local1631, local1682);
					}
				} else if (local1529.method1385(Static72.aClass46_639)) {
					local1631 = local1529.method1363(local1529.method1355(Static35.aClass46_272), 0);
					local778 = local1631.method1348();
					local1101 = false;
					for (local569 = 0; local569 < Static25.anInt3983; local569++) {
						if (local778 == Static146.aLongArray3[local569]) {
							local1101 = true;
							break;
						}
					}
					if (!local1101 && Static153.anInt3469 == 0) {
						Static168.method2686(10, local1631, Static38.aClass46_298);
					}
				} else if (local1529.method1385(aClass46_1097)) {
					local1631 = local1529.method1363(local1529.method1355(aClass46_1097), 0);
					Static168.method2686(11, Static38.aClass46_298, local1631);
				} else if (local1529.method1385(Static52.aClass46_454)) {
					local1631 = local1529.method1363(local1529.method1355(Static52.aClass46_454), 0);
					if (Static153.anInt3469 == 0) {
						Static168.method2686(12, Static38.aClass46_298, local1631);
					}
				} else if (local1529.method1385(Static168.aClass46_1340)) {
					local1631 = local1529.method1363(local1529.method1355(Static168.aClass46_1340), 0);
					if (Static153.anInt3469 == 0) {
						Static168.method2686(13, Static38.aClass46_298, local1631);
					}
				} else if (local1529.method1385(Static35.aClass46_274)) {
					local1631 = local1529.method1363(local1529.method1355(Static35.aClass46_272), 0);
					local778 = local1631.method1348();
					local1101 = false;
					for (local569 = 0; local569 < Static25.anInt3983; local569++) {
						if (local778 == Static146.aLongArray3[local569]) {
							local1101 = true;
							break;
						}
					}
					if (!local1101 && Static153.anInt3469 == 0) {
						Static168.method2686(14, local1631, Static38.aClass46_298);
					}
				} else if (local1529.method1385(Static168.aClass46_1339)) {
					local1101 = false;
					local1631 = local1529.method1363(local1529.method1355(Static35.aClass46_272), 0);
					local778 = local1631.method1348();
					for (local569 = 0; local569 < Static25.anInt3983; local569++) {
						if (Static146.aLongArray3[local569] == local778) {
							local1101 = true;
							break;
						}
					}
					if (!local1101 && Static153.anInt3469 == 0) {
						Static168.method2686(15, local1631, Static38.aClass46_298);
					}
				} else if (local1529.method1385(Static7.aClass46_48)) {
					local1631 = local1529.method1363(local1529.method1355(Static35.aClass46_272), 0);
					local778 = local1631.method1348();
					local1101 = false;
					for (local569 = 0; local569 < Static25.anInt3983; local569++) {
						if (Static146.aLongArray3[local569] == local778) {
							local1101 = true;
							break;
						}
					}
					if (!local1101 && Static153.anInt3469 == 0) {
						Static168.method2686(16, local1631, Static38.aClass46_298);
					}
				} else {
					Static168.method2686(0, Static38.aClass46_298, local1529);
				}
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 246) {
				Static161.method2580();
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 118 || Static57.anInt1552 == 23 || Static57.anInt1552 == 207 || Static57.anInt1552 == 88 || Static57.anInt1552 == 109 || Static57.anInt1552 == 30 || Static57.anInt1552 == 172 || Static57.anInt1552 == 167 || Static57.anInt1552 == 188 || Static57.anInt1552 == 100 || Static57.anInt1552 == 242) {
				Static81.method1360();
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 163) {
				local172 = Static49.aClass3_Sub4_Sub1_2.method191();
				local176 = Static49.aClass3_Sub4_Sub1_2.method191();
				local180 = Static49.aClass3_Sub4_Sub1_2.method191();
				local184 = Static49.aClass3_Sub4_Sub1_2.method191();
				local565 = Static49.aClass3_Sub4_Sub1_2.method208();
				Static168.aBooleanArray19[local172] = true;
				Static42.anIntArray105[local172] = local176;
				Static34.anIntArray76[local172] = local180;
				Static22.anIntArray36[local172] = local184;
				Static81.anIntArray203[local172] = local565;
				Static57.anInt1552 = -1;
				return true;
			}
			@Pc(2386) int local2386;
			if (Static57.anInt1552 == 44) {
				local233 = Static49.aClass3_Sub4_Sub1_2.method185();
				local180 = Static49.aClass3_Sub4_Sub1_2.method208();
				local184 = Static49.aClass3_Sub4_Sub1_2.method191();
				@Pc(2177) Class46 local2177 = Static116.method1961(local233).method1371();
				for (local569 = 0; local569 < Static52.anInt1391; local569++) {
					if (local233 == Static133.aLongArray2[local569]) {
						if (Static99.anIntArray246[local569] != local180) {
							Static99.anIntArray246[local569] = local180;
							if (local180 > 0) {
								Static168.method2686(5, Static38.aClass46_298, Static178.method2860(new Class46[] { local2177, Static143.aClass46_1141 }));
							}
							if (local180 == 0) {
								Static168.method2686(5, Static38.aClass46_298, Static178.method2860(new Class46[] { local2177, Static72.aClass46_640 }));
							}
						}
						Static180.anIntArray441[local569] = local184;
						local2177 = null;
						break;
					}
				}
				if (local2177 != null && Static52.anInt1391 < 200) {
					Static133.aLongArray2[Static52.anInt1391] = local233;
					Static158.aClass46Array23[Static52.anInt1391] = local2177;
					Static99.anIntArray246[Static52.anInt1391] = local180;
					Static180.anIntArray441[Static52.anInt1391] = local184;
					Static52.anInt1391++;
				}
				Static16.anInt418 = Static178.anInt3928;
				local657 = Static52.anInt1391;
				while (local657 > 0) {
					@Pc(2295) boolean local2295 = true;
					local657--;
					for (local659 = 0; local659 < local657; local659++) {
						if (Static179.anInt3950 != Static99.anIntArray246[local659] && Static179.anInt3950 == Static99.anIntArray246[local659 + 1] || Static99.anIntArray246[local659] == 0 && Static99.anIntArray246[local659 + 1] != 0) {
							local2295 = false;
							local871 = Static99.anIntArray246[local659];
							Static99.anIntArray246[local659] = Static99.anIntArray246[local659 + 1];
							Static99.anIntArray246[local659 + 1] = local871;
							@Pc(2350) Class46 local2350 = Static158.aClass46Array23[local659];
							Static158.aClass46Array23[local659] = Static158.aClass46Array23[local659 + 1];
							Static158.aClass46Array23[local659 + 1] = local2350;
							@Pc(2368) long local2368 = Static133.aLongArray2[local659];
							Static133.aLongArray2[local659] = Static133.aLongArray2[local659 + 1];
							Static133.aLongArray2[local659 + 1] = local2368;
							local2386 = Static180.anIntArray441[local659];
							Static180.anIntArray441[local659] = Static180.anIntArray441[local659 + 1];
							Static180.anIntArray441[local659 + 1] = local2386;
						}
					}
					if (local2295) {
						break;
					}
				}
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 198) {
				local172 = Static49.aClass3_Sub4_Sub1_2.method208();
				local176 = Static49.aClass3_Sub4_Sub1_2.method213();
				local180 = Static49.aClass3_Sub4_Sub1_2.method184();
				local377 = Static179.method2873(local176);
				local377.anInt1443 = (local172 << 16) + local180;
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 64) {
				Static83.method1399();
				Static26.anInt600 = Static49.aClass3_Sub4_Sub1_2.method220();
				Static57.anInt1552 = -1;
				Static108.anInt2582 = Static178.anInt3928;
				return true;
			}
			if (Static57.anInt1552 == 104) {
				Static97.anInt1739 = Static49.aClass3_Sub4_Sub1_2.method191();
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 122) {
				local172 = Static49.aClass3_Sub4_Sub1_2.method208();
				local176 = Static49.aClass3_Sub4_Sub1_2.method207();
				local324 = Static179.method2873(local176);
				if (local324 != null && local324.anInt1441 == 0) {
					if (local324.anInt1455 - local324.anInt1428 < local172) {
						local172 = local324.anInt1455 - local324.anInt1428;
					}
					if (local172 < 0) {
						local172 = 0;
					}
					if (local172 != local324.anInt1486) {
						local324.anInt1486 = local172;
						Static142.method2373(local324);
					}
				}
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 38) {
				Static123.aBoolean122 = true;
				Static46.anInt1264 = Static49.aClass3_Sub4_Sub1_2.method191();
				Static119.anInt2824 = Static49.aClass3_Sub4_Sub1_2.method191();
				Static44.anInt1229 = Static49.aClass3_Sub4_Sub1_2.method208();
				Static71.anInt1842 = Static49.aClass3_Sub4_Sub1_2.method191();
				Static1.anInt9 = Static49.aClass3_Sub4_Sub1_2.method191();
				if (Static1.anInt9 >= 100) {
					local172 = Static46.anInt1264 * 128 + 64;
					local176 = Static119.anInt2824 * 128 + 64;
					local180 = Static168.method2689(local176, local172, Static99.anInt2422) - Static44.anInt1229;
					local565 = local180 - Static94.anInt2298;
					local184 = local172 - Static134.anInt3130;
					local569 = local176 - Static70.anInt1833;
					local653 = (int) Math.sqrt((double) (local184 * local184 + local569 * local569));
					Static163.anInt3624 = (int) (Math.atan2((double) local565, (double) local653) * 325.949D) & 0x7FF;
					Static124.anInt2967 = (int) (Math.atan2((double) local184, (double) local569) * -325.949D) & 0x7FF;
					if (Static163.anInt3624 < 128) {
						Static163.anInt3624 = 128;
					}
					if (Static163.anInt3624 > 383) {
						Static163.anInt3624 = 383;
					}
				}
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 24) {
				Static173.anInt3781 = Static49.aClass3_Sub4_Sub1_2.method223();
				Static137.anInt3206 = Static49.aClass3_Sub4_Sub1_2.method192();
				while (Static139.anInt3221 > Static49.aClass3_Sub4_Sub1_2.anInt232) {
					Static57.anInt1552 = Static49.aClass3_Sub4_Sub1_2.method191();
					Static81.method1360();
				}
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 63) {
				local1529 = Static49.aClass3_Sub4_Sub1_2.method172();
				local176 = Static49.aClass3_Sub4_Sub1_2.method192();
				local180 = Static49.aClass3_Sub4_Sub1_2.method191();
				if (local180 >= 1 && local180 <= 8) {
					if (local1529.method1389(Static63.aClass46_566)) {
						local1529 = null;
					}
					Static130.aClass46Array18[local180 - 1] = local1529;
					Static179.aBooleanArray21[local180 - 1] = local176 == 0;
				}
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 133) {
				local172 = Static49.aClass3_Sub4_Sub1_2.method213();
				@Pc(2759) boolean local2759 = Static49.aClass3_Sub4_Sub1_2.method192() == 1;
				local324 = Static179.method2873(local172);
				if (local324.aBoolean46 != local2759) {
					local324.aBoolean46 = local2759;
					Static142.method2373(local324);
				}
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 79) {
				local172 = Static49.aClass3_Sub4_Sub1_2.method213();
				local176 = Static49.aClass3_Sub4_Sub1_2.method208();
				if (local172 < -70000) {
					local176 += 32768;
				}
				if (local172 >= 0) {
					local324 = Static179.method2873(local172);
				} else {
					local324 = null;
				}
				if (local324 != null) {
					for (local184 = 0; local184 < local324.anIntArray142.length; local184++) {
						local324.anIntArray142[local184] = 0;
						local324.anIntArray138[local184] = 0;
					}
				}
				Static182.method2923(local176);
				local184 = Static49.aClass3_Sub4_Sub1_2.method208();
				for (local565 = 0; local565 < local184; local565++) {
					local569 = Static49.aClass3_Sub4_Sub1_2.method192();
					if (local569 == 255) {
						local569 = Static49.aClass3_Sub4_Sub1_2.method207();
					}
					local653 = Static49.aClass3_Sub4_Sub1_2.method174();
					if (local324 != null && local324.anIntArray142.length > local565) {
						local324.anIntArray142[local565] = local653;
						local324.anIntArray138[local565] = local569;
					}
					Static148.method2572(local565, local176, local653 - 1, local569);
				}
				if (local324 != null) {
					Static142.method2373(local324);
				}
				Static83.method1399();
				Static176.anIntArray434[Static14.anInt376++ & 0x1F] = local176 & 0x7FFF;
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 126) {
				local172 = Static49.aClass3_Sub4_Sub1_2.method208();
				if (local172 == 65535) {
					local172 = -1;
				}
				Static60.method1125(local172);
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 48) {
				local172 = Static49.aClass3_Sub4_Sub1_2.method190();
				local176 = Static49.aClass3_Sub4_Sub1_2.method174();
				if (local176 == 65535) {
					local176 = -1;
				}
				Static21.method2166(local176, local172);
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 95) {
				local172 = Static49.aClass3_Sub4_Sub1_2.method192();
				local176 = Static49.aClass3_Sub4_Sub1_2.method207();
				local180 = Static49.aClass3_Sub4_Sub1_2.method174();
				local611 = (Class3_Sub12) Static129.aClass54_10.method1602((long) local176);
				if (local611 != null) {
					Static18.method336(local180 != local611.anInt1766, local611);
				}
				Static32.method575(local180, local176, local172);
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 168) {
				local172 = Static49.aClass3_Sub4_Sub1_2.method213();
				@Pc(3034) Class3_Sub12 local3034 = (Class3_Sub12) Static129.aClass54_10.method1602((long) local172);
				if (local3034 != null) {
					Static18.method336(true, local3034);
				}
				if (Static71.aClass33_7 != null) {
					Static142.method2373(Static71.aClass33_7);
					Static71.aClass33_7 = null;
				}
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 53) {
				local172 = Static49.aClass3_Sub4_Sub1_2.method212();
				Static29.aClass14_3 = Static66.aClass68_4.method2200(local172);
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 170) {
				local172 = Static49.aClass3_Sub4_Sub1_2.method214();
				local1631 = Static49.aClass3_Sub4_Sub1_2.method172();
				local324 = Static179.method2873(local172);
				if (!local1631.method1351(local324.aClass46_486)) {
					local324.aClass46_486 = local1631;
					Static142.method2373(local324);
				}
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 199) {
				Static34.anInt955 = Static49.aClass3_Sub4_Sub1_2.method191();
				if (Static34.anInt955 == 1) {
					Static133.anInt3123 = Static49.aClass3_Sub4_Sub1_2.method208();
				}
				if (Static34.anInt955 >= 2 && Static34.anInt955 <= 6) {
					if (Static34.anInt955 == 2) {
						Static154.anInt3470 = 64;
						Static58.anInt1583 = 64;
					}
					if (Static34.anInt955 == 3) {
						Static154.anInt3470 = 0;
						Static58.anInt1583 = 64;
					}
					if (Static34.anInt955 == 4) {
						Static154.anInt3470 = 128;
						Static58.anInt1583 = 64;
					}
					if (Static34.anInt955 == 5) {
						Static154.anInt3470 = 64;
						Static58.anInt1583 = 0;
					}
					if (Static34.anInt955 == 6) {
						Static154.anInt3470 = 64;
						Static58.anInt1583 = 128;
					}
					Static34.anInt955 = 2;
					Static18.anInt432 = Static49.aClass3_Sub4_Sub1_2.method208();
					Static35.anInt987 = Static49.aClass3_Sub4_Sub1_2.method208();
					Static37.anInt1034 = Static49.aClass3_Sub4_Sub1_2.method191();
				}
				if (Static34.anInt955 == 10) {
					Static56.anInt1517 = Static49.aClass3_Sub4_Sub1_2.method208();
				}
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 226) {
				for (local172 = 0; local172 < Static181.aClass3_Sub2_Sub1_Sub1_Sub1Array1.length; local172++) {
					if (Static181.aClass3_Sub2_Sub1_Sub1_Sub1Array1[local172] != null) {
						Static181.aClass3_Sub2_Sub1_Sub1_Sub1Array1[local172].anInt1738 = -1;
					}
				}
				for (local176 = 0; local176 < Static126.aClass3_Sub2_Sub1_Sub1_Sub2Array1.length; local176++) {
					if (Static126.aClass3_Sub2_Sub1_Sub1_Sub2Array1[local176] != null) {
						Static126.aClass3_Sub2_Sub1_Sub1_Sub2Array1[local176].anInt1738 = -1;
					}
				}
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 161) {
				Static25.anInt3983 = Static139.anInt3221 / 8;
				for (local172 = 0; local172 < Static25.anInt3983; local172++) {
					Static146.aLongArray3[local172] = Static49.aClass3_Sub4_Sub1_2.method185();
					Static120.aClass46Array17[local172] = Static116.method1961(Static146.aLongArray3[local172]);
				}
				Static57.anInt1552 = -1;
				Static16.anInt418 = Static178.anInt3928;
				return true;
			}
			if (Static57.anInt1552 == 149) {
				@Pc(3279) byte local3279 = Static49.aClass3_Sub4_Sub1_2.method177();
				local176 = Static49.aClass3_Sub4_Sub1_2.method184();
				Static173.anIntArray424[local176] = local3279;
				if (Static41.anIntArray419[local176] != local3279) {
					Static41.anIntArray419[local176] = local3279;
					Static124.method2124(local176);
				}
				Static57.anIntArray149[Static143.anInt3278++ & 0x1F] = local176;
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 117) {
				Static123.aBoolean122 = false;
				for (local172 = 0; local172 < 5; local172++) {
					Static168.aBooleanArray19[local172] = false;
				}
				Static57.anInt1552 = -1;
				return true;
			}
			@Pc(3358) long local3358;
			if (Static57.anInt1552 == 28) {
				local233 = Static49.aClass3_Sub4_Sub1_2.method185();
				Static49.aClass3_Sub4_Sub1_2.method203();
				local778 = Static49.aClass3_Sub4_Sub1_2.method185();
				local3358 = Static49.aClass3_Sub4_Sub1_2.method208();
				@Pc(3363) long local3363 = (long) Static49.aClass3_Sub4_Sub1_2.method197();
				local669 = (local3358 << 32) + local3363;
				local659 = Static49.aClass3_Sub4_Sub1_2.method191();
				@Pc(3376) boolean local3376 = false;
				for (@Pc(3378) int local3378 = 0; local3378 < 100; local3378++) {
					if (local669 == Static51.aLongArray1[local3378]) {
						local3376 = true;
						break;
					}
				}
				if (local659 <= 1) {
					for (local2386 = 0; local2386 < Static25.anInt3983; local2386++) {
						if (Static146.aLongArray3[local2386] == local233) {
							local3376 = true;
							break;
						}
					}
				}
				if (!local3376 && Static153.anInt3469 == 0) {
					Static51.aLongArray1[Static121.anInt2867] = local669;
					Static121.anInt2867 = (Static121.anInt2867 + 1) % 100;
					@Pc(3447) Class46 local3447 = Static138.method815(Static130.method2188(Static49.aClass3_Sub4_Sub1_2).method1364());
					if (local659 == 2 || local659 == 3) {
						Static177.method2830(9, Static178.method2860(new Class46[] { Static157.aClass46_1266, Static116.method1961(local233).method1371() }), local3447, Static116.method1961(local778).method1371());
					} else if (local659 == 1) {
						Static177.method2830(9, Static178.method2860(new Class46[] { Static148.aClass46_1289, Static116.method1961(local233).method1371() }), local3447, Static116.method1961(local778).method1371());
					} else {
						Static177.method2830(9, Static116.method1961(local233).method1371(), local3447, Static116.method1961(local778).method1371());
					}
				}
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 103) {
				local172 = Static49.aClass3_Sub4_Sub1_2.method214();
				local1344 = Static179.method2873(local172);
				local1344.anInt1494 = 3;
				local1344.anInt1418 = Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.aClass64_1.method2118();
				Static142.method2373(local1344);
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 17) {
				Static137.anInt3206 = Static49.aClass3_Sub4_Sub1_2.method205();
				Static173.anInt3781 = Static49.aClass3_Sub4_Sub1_2.method192();
				for (local172 = Static137.anInt3206; local172 < Static137.anInt3206 + 8; local172++) {
					for (local176 = Static173.anInt3781; local176 < Static173.anInt3781 + 8; local176++) {
						if (Static148.aClass59ArrayArrayArray2[Static99.anInt2422][local172][local176] != null) {
							Static148.aClass59ArrayArrayArray2[Static99.anInt2422][local172][local176] = null;
							Static129.method2168(local176, local172);
						}
					}
				}
				for (@Pc(3631) Class3_Sub24 local3631 = (Class3_Sub24) Static1.aClass59_1.method1731(); local3631 != null; local3631 = (Class3_Sub24) Static1.aClass59_1.method1734()) {
					if (local3631.anInt3513 >= Static137.anInt3206 && Static137.anInt3206 + 8 > local3631.anInt3513 && local3631.anInt3514 >= Static173.anInt3781 && local3631.anInt3514 < Static173.anInt3781 + 8 && Static99.anInt2422 == local3631.anInt3523) {
						local3631.anInt3524 = 0;
					}
				}
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 255) {
				Static151.anInt3416 = Static49.aClass3_Sub4_Sub1_2.method191();
				Static69.anInt1778 = Static49.aClass3_Sub4_Sub1_2.method191();
				Static140.anInt217 = Static49.aClass3_Sub4_Sub1_2.method191();
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 70) {
				local172 = Static49.aClass3_Sub4_Sub1_2.method191();
				if (Static49.aClass3_Sub4_Sub1_2.method191() == 0) {
					Static53.aClass29Array1[local172] = new Class29();
				} else {
					Static49.aClass3_Sub4_Sub1_2.anInt232--;
					Static53.aClass29Array1[local172] = new Class29(Static49.aClass3_Sub4_Sub1_2);
				}
				Static57.anInt1552 = -1;
				Static98.anInt2362 = Static178.anInt3928;
				return true;
			}
			if (Static57.anInt1552 == 206) {
				local172 = Static49.aClass3_Sub4_Sub1_2.method171();
				local176 = Static49.aClass3_Sub4_Sub1_2.method212();
				local324 = Static179.method2873(local176);
				if (local324.anInt1494 != 2 || local172 != local324.anInt1418) {
					local324.anInt1418 = local172;
					local324.anInt1494 = 2;
					Static142.method2373(local324);
				}
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 229) {
				local172 = Static49.aClass3_Sub4_Sub1_2.method191();
				local176 = Static49.aClass3_Sub4_Sub1_2.method223();
				local180 = Static49.aClass3_Sub4_Sub1_2.method223();
				Static99.anInt2422 = local180 >> 1;
				Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.method1168((local180 & 0x1) == 1, local176, local172);
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 11) {
				Static124.method2111(Static49.aClass3_Sub4_Sub1_2, Static139.anInt3221, Static66.aClass68_4);
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 73) {
				local172 = Static49.aClass3_Sub4_Sub1_2.method208();
				local176 = Static49.aClass3_Sub4_Sub1_2.method191();
				local180 = Static49.aClass3_Sub4_Sub1_2.method208();
				Static13.method292(local176, local180, local172);
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 174) {
				local233 = Static49.aClass3_Sub4_Sub1_2.method185();
				local778 = Static49.aClass3_Sub4_Sub1_2.method208();
				@Pc(3882) boolean local3882 = false;
				local3358 = Static49.aClass3_Sub4_Sub1_2.method197();
				local653 = Static49.aClass3_Sub4_Sub1_2.method191();
				@Pc(3900) long local3900 = (local778 << 32) + local3358;
				for (local878 = 0; local878 < 100; local878++) {
					if (Static51.aLongArray1[local878] == local3900) {
						local3882 = true;
						break;
					}
				}
				if (local653 <= 1) {
					for (@Pc(3927) int local3927 = 0; local3927 < Static25.anInt3983; local3927++) {
						if (local233 == Static146.aLongArray3[local3927]) {
							local3882 = true;
							break;
						}
					}
				}
				if (!local3882 && Static153.anInt3469 == 0) {
					Static51.aLongArray1[Static121.anInt2867] = local3900;
					Static121.anInt2867 = (Static121.anInt2867 + 1) % 100;
					@Pc(3964) Class46 local3964 = Static138.method815(Static130.method2188(Static49.aClass3_Sub4_Sub1_2).method1364());
					if (local653 == 2 || local653 == 3) {
						Static168.method2686(7, Static178.method2860(new Class46[] { Static157.aClass46_1266, Static116.method1961(local233).method1371() }), local3964);
					} else if (local653 == 1) {
						Static168.method2686(7, Static178.method2860(new Class46[] { Static148.aClass46_1289, Static116.method1961(local233).method1371() }), local3964);
					} else {
						Static168.method2686(3, Static116.method1961(local233).method1371(), local3964);
					}
				}
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 208) {
				local172 = Static49.aClass3_Sub4_Sub1_2.method184();
				if (local172 == 65535) {
					local172 = -1;
				}
				local176 = Static49.aClass3_Sub4_Sub1_2.method207();
				local180 = Static49.aClass3_Sub4_Sub1_2.method171();
				if (local180 == 65535) {
					local180 = -1;
				}
				local184 = Static49.aClass3_Sub4_Sub1_2.method213();
				for (local565 = local172; local565 <= local180; local565++) {
					@Pc(4080) long local4080 = ((long) local184 << 32) + ((long) local565);
					@Pc(4087) Class3 local4087 = Static34.aClass54_3.method1602(local4080);
					if (local4087 != null) {
						local4087.method2900();
					}
					Static34.aClass54_3.method1603(local4080, new Class3_Sub25(local176));
				}
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 96) {
				local172 = Static49.aClass3_Sub4_Sub1_2.method208();
				local176 = Static49.aClass3_Sub4_Sub1_2.method213();
				local324 = Static179.method2873(local176);
				if (local324.anInt1494 != 1 || local324.anInt1418 != local172) {
					local324.anInt1494 = 1;
					local324.anInt1418 = local172;
					Static142.method2373(local324);
				}
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 21) {
				Static57.anInt1552 = -1;
				Static32.anInt911 = 0;
				return true;
			}
			if (Static57.anInt1552 == 90) {
				Static108.method1768(Static49.aClass3_Sub4_Sub1_2);
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 152) {
				local172 = Static49.aClass3_Sub4_Sub1_2.method207();
				local176 = Static49.aClass3_Sub4_Sub1_2.method174();
				Static173.anIntArray424[local176] = local172;
				if (local172 != Static41.anIntArray419[local176]) {
					Static41.anIntArray419[local176] = local172;
					Static124.method2124(local176);
				}
				Static57.anIntArray149[Static143.anInt3278++ & 0x1F] = local176;
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 225) {
				local172 = Static49.aClass3_Sub4_Sub1_2.method184();
				local176 = Static49.aClass3_Sub4_Sub1_2.method207();
				local565 = local172 & 0x1F;
				local184 = local172 >> 5 & 0x1F;
				local180 = local172 >> 10 & 0x1F;
				local569 = (local180 << 19) - (-(local184 << 11) - (local565 << 3));
				@Pc(4268) Class33 local4268 = Static179.method2873(local176);
				if (local4268.anInt1488 != local569) {
					local4268.anInt1488 = local569;
					Static142.method2373(local4268);
				}
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 87) {
				Static137.anInt3206 = Static49.aClass3_Sub4_Sub1_2.method191();
				Static173.anInt3781 = Static49.aClass3_Sub4_Sub1_2.method205();
				Static57.anInt1552 = -1;
				return true;
			}
			if (Static57.anInt1552 == 101) {
				for (local172 = 0; local172 < Static135.anInt3166; local172++) {
					@Pc(4310) Class3_Sub2_Sub17 local4310 = Static114.method1918(local172);
					if (local4310 != null && local4310.anInt3952 == 0) {
						Static173.anIntArray424[local172] = 0;
						Static41.anIntArray419[local172] = 0;
					}
				}
				Static83.method1399();
				Static57.anInt1552 = -1;
				Static143.anInt3278 += 32;
				return true;
			}
			if (Static57.anInt1552 == 60) {
				local172 = Static49.aClass3_Sub4_Sub1_2.method179();
				local176 = Static49.aClass3_Sub4_Sub1_2.method175();
				local180 = Static49.aClass3_Sub4_Sub1_2.method214();
				local377 = Static179.method2873(local180);
				local565 = local176 + local377.anInt1476;
				local569 = local172 + local377.anInt1480;
				if (local377.anInt1461 != local565 || local569 != local377.anInt1449) {
					local377.anInt1461 = local565;
					local377.anInt1449 = local569;
					Static142.method2373(local377);
				}
				Static57.anInt1552 = -1;
				return true;
			}
			Static124.method2117("T1 - " + Static57.anInt1552 + "," + Static156.anInt3496 + "," + Static124.anInt2964 + " - " + Static139.anInt3221, null);
			Static106.method1735();
		} catch (@Pc(4430) IOException local4430) {
			Static119.method2035();
		} catch (@Pc(4434) Exception local4434) {
			@Pc(4474) String local4474 = "T2 - " + Static57.anInt1552 + "," + Static156.anInt3496 + "," + Static124.anInt2964 + " - " + Static139.anInt3221 + "," + (Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray160[0] + Static42.anInt1173) + "," + (Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray163[0] + Static58.anInt1578) + " - ";
			for (local176 = 0; local176 < Static139.anInt3221 && local176 < 50; local176++) {
				local4474 = local4474 + Static49.aClass3_Sub4_Sub1_2.aByteArray5[local176] + ",";
			}
			Static124.method2117(local4474, local4434);
			Static106.method1735();
		}
		return true;
	}
}
