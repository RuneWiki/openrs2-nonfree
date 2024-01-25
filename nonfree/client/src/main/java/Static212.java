import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!mc", name = "U", descriptor = "Lclient!b;")
	public static Class20 aClass20_51;

	@OriginalMember(owner = "client!mc", name = "V", descriptor = "Lclient!ku;")
	public static final Class139 aClass139_45 = new Class139(8);

	@OriginalMember(owner = "client!mc", name = "W", descriptor = "I")
	public static int anInt3743 = 0;

	@OriginalMember(owner = "client!mc", name = "X", descriptor = "I")
	public static int anInt3744 = 10;

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(Z)V")
	public static void method3301() {
		if (Static139.anInt2636 > 1) {
			Static139.anInt2636--;
			Static239.anInt5772 = Static28.anInt360;
		}
		if (Static29.anInt4374 > 0) {
			Static29.anInt4374--;
		}
		if (Static227.aBoolean319) {
			Static227.aBoolean319 = false;
			Static244.method3987();
			return;
		}
		if (!Static287.aBoolean397) {
			Static213.method3315();
		}
		for (@Pc(36) int local36 = 0; local36 < 100 && Static132.method2090(); local36++) {
		}
		if (Static348.anInt4439 != 30) {
			return;
		}
		Static207.method1892(Static381.aClass244_95.method5675(), Static23.aClass3_Sub5_Sub1_1);
		if (Static127.aClass3_Sub2_2 == null) {
			if (Static369.aLong219 <= Static288.method4512()) {
				Static127.aClass3_Sub2_2 = Static335.aClass72_1.method1542(Static200.aString35);
			}
		} else if (Static127.aClass3_Sub2_2.anInt353 != -1) {
			Static229.method3783(Static93.aClass244_30);
			Static23.aClass3_Sub5_Sub1_1.method2749(Static127.aClass3_Sub2_2.anInt353);
			Static127.aClass3_Sub2_2 = null;
			Static369.aLong219 = Static288.method4512() + 30000L;
		}
		@Pc(115) int local115;
		@Pc(137) int local137;
		@Pc(157) int local157;
		@Pc(170) boolean local170;
		@Pc(220) int local220;
		@Pc(227) int local227;
		@Pc(238) int local238;
		if (Static46.aClass3_Sub33_1 != null || Static288.method4512() - 2000L > Static98.aLong71) {
			@Pc(112) boolean local112 = false;
			local115 = Static23.aClass3_Sub5_Sub1_1.anInt3121;
			for (@Pc(120) Class3_Sub33 local120 = (Class3_Sub33) Static392.aClass138_47.method3051(); local120 != null && Static23.aClass3_Sub5_Sub1_1.anInt3121 - local115 < 240; local120 = (Class3_Sub33) Static392.aClass138_47.method3050()) {
				local120.method5700();
				local137 = local120.method5157();
				if (local137 < 0) {
					local137 = 0;
				} else if (local137 > 65534) {
					local137 = 65534;
				}
				local157 = local120.method5156();
				if (local157 < 0) {
					local157 = 0;
				} else if (local157 > 65534) {
					local157 = 65534;
				}
				local170 = false;
				if (local120.method5157() == -1 && local120.method5156() == -1) {
					local137 = -1;
					local170 = true;
					local157 = -1;
				}
				if (local157 != Static314.anInt5407 || local137 != Static69.anInt1370) {
					if (!local112) {
						Static229.method3783(Static200.aClass244_51);
						Static23.aClass3_Sub5_Sub1_1.method2791(0);
						local115 = Static23.aClass3_Sub5_Sub1_1.anInt3121;
						local112 = true;
					}
					local220 = local157 - Static314.anInt5407;
					Static314.anInt5407 = local157;
					local227 = local137 - Static69.anInt1370;
					Static69.anInt1370 = local137;
					local238 = (int) ((local120.method5162() - Static98.aLong71) / 20L);
					if (local238 < 8 && local220 >= -32 && local220 <= 31 && local227 >= -32 && local227 <= 31) {
						local220 += 32;
						local227 += 32;
						Static23.aClass3_Sub5_Sub1_1.method2749((local220 << 6) + (local238 << 12) + local227);
					} else if (local238 < 32 && local220 >= -128 && local220 <= 127 && local227 >= -128 && local227 <= 127) {
						local227 += 128;
						local220 += 128;
						Static23.aClass3_Sub5_Sub1_1.method2791(local238 + 128);
						Static23.aClass3_Sub5_Sub1_1.method2749(local227 + (local220 << 8));
					} else if (local238 < 32) {
						Static23.aClass3_Sub5_Sub1_1.method2791(local238 + 192);
						if (local170) {
							Static23.aClass3_Sub5_Sub1_1.method2782(Integer.MIN_VALUE);
						} else {
							Static23.aClass3_Sub5_Sub1_1.method2782(local157 | local137 << 16);
						}
					} else {
						Static23.aClass3_Sub5_Sub1_1.method2749(local238 + 57344);
						if (local170) {
							Static23.aClass3_Sub5_Sub1_1.method2782(Integer.MIN_VALUE);
						} else {
							Static23.aClass3_Sub5_Sub1_1.method2782(local137 << 16 | local157);
						}
					}
					Static98.aLong71 = local120.method5162();
				}
			}
			if (local112) {
				Static23.aClass3_Sub5_Sub1_1.method2771(Static23.aClass3_Sub5_Sub1_1.anInt3121 - local115);
			}
		}
		@Pc(412) int local412;
		@Pc(464) int local464;
		if (Static46.aClass3_Sub33_1 != null) {
			@Pc(398) long local398 = (Static46.aClass3_Sub33_1.method5162() - Static322.aLong232) / 50L;
			Static322.aLong232 = Static46.aClass3_Sub33_1.method5162();
			if (local398 > 32767L) {
				local398 = 32767L;
			}
			local412 = Static46.aClass3_Sub33_1.method5157();
			if (local412 < 0) {
				local412 = 0;
			} else if (local412 > 65535) {
				local412 = 65535;
			}
			local137 = Static46.aClass3_Sub33_1.method5156();
			if (local137 < 0) {
				local137 = 0;
			} else if (local137 > 65535) {
				local137 = 65535;
			}
			@Pc(445) byte local445 = 0;
			if (Static46.aClass3_Sub33_1.method5158() == 2) {
				local445 = 1;
			}
			Static229.method3783(Static352.aClass244_87);
			local464 = (int) local398;
			Static23.aClass3_Sub5_Sub1_1.method2749(local445 << 15 | local464);
			Static23.aClass3_Sub5_Sub1_1.method2790(local412 << 16 | local137);
		}
		@Pc(488) int local488;
		if (Static153.anInt2778 > 0) {
			local488 = 0;
			for (local115 = 0; local115 < Static153.anInt2778; local115++) {
				if (Static251.aClass70Array1[local115].method1429()) {
					local488++;
				}
			}
			if (local488 > 0) {
				if (local488 > 75) {
					local488 = 75;
				}
				Static229.method3783(Static246.aClass244_59);
				Static23.aClass3_Sub5_Sub1_1.method2791(local488 * 3);
				for (local412 = 0; local412 < Static153.anInt2778; local412++) {
					@Pc(535) Class70 local535 = Static251.aClass70Array1[local412];
					if (local535.method1429()) {
						@Pc(547) long local547 = (local535.method1435() - Static231.aLong158) / 50L;
						if (local547 > 65535L) {
							local547 = 65535L;
						}
						Static231.aLong158 = local535.method1435();
						Static23.aClass3_Sub5_Sub1_1.method2791(local535.method1432());
						Static23.aClass3_Sub5_Sub1_1.method2749((int) local547);
					}
				}
			}
		}
		if (Static358.anInt6006 > 0) {
			Static358.anInt6006--;
		}
		if (Static55.aBoolean64 && Static358.anInt6006 <= 0) {
			Static358.anInt6006 = 20;
			Static55.aBoolean64 = false;
			Static229.method3783(Static119.aClass244_37);
			Static23.aClass3_Sub5_Sub1_1.method2727((int) Static352.aFloat68 >> 3);
			Static23.aClass3_Sub5_Sub1_1.method2732((int) Static279.aFloat67 >> 3);
		}
		if (Static245.aBoolean344 && !Static258.aBoolean359) {
			Static258.aBoolean359 = true;
			Static229.method3783(Static190.aClass244_49);
			Static23.aClass3_Sub5_Sub1_1.method2791(1);
		}
		if (!Static245.aBoolean344 && Static258.aBoolean359) {
			Static258.aBoolean359 = false;
			Static229.method3783(Static190.aClass244_49);
			Static23.aClass3_Sub5_Sub1_1.method2791(0);
		}
		if (!Static47.aBoolean45) {
			Static229.method3783(Static392.aClass244_97);
			Static23.aClass3_Sub5_Sub1_1.method2791(0);
			local488 = Static23.aClass3_Sub5_Sub1_1.anInt3121;
			@Pc(680) Class3_Sub5 local680 = Static164.aClass154_Sub1_1.method5399();
			Static23.aClass3_Sub5_Sub1_1.method2742(local680.aByteArray42, local680.anInt3121);
			Static23.aClass3_Sub5_Sub1_1.method2771(Static23.aClass3_Sub5_Sub1_1.anInt3121 - local488);
			Static47.aBoolean45 = true;
		}
		if (Static69.aClass48ArrayArrayArray1 != null) {
			if (Static88.anInt1815 == 2) {
				Static47.method863();
			} else if (Static88.anInt1815 == 3) {
				Static126.method2019();
			}
		}
		if (Static389.aBoolean501) {
			Static389.aBoolean501 = false;
		} else {
			Static37.aFloat7 /= 2.0F;
		}
		if (Static239.aBoolean441) {
			Static239.aBoolean441 = false;
		} else {
			Static75.aFloat11 /= 2.0F;
		}
		Static13.method4664();
		if (Static348.anInt4439 != 30) {
			return;
		}
		Static197.method3103();
		Static90.method1497();
		Static242.method3971();
		Static108.method1776();
		Static152.anInt2774++;
		if (Static152.anInt2774 > 750) {
			Static244.method3987();
			return;
		}
		Static332.method5075();
		Static153.method2390();
		Static202.method3159();
		for (local488 = Static331.aClass115_1.method2404(true); local488 != -1; local488 = Static331.aClass115_1.method2404(false)) {
			Static345.method5228(local488);
			Static322.anIntArray700[Static136.anInt2615++ & 0x1F] = local488;
		}
		@Pc(847) Class62 local847;
		for (@Pc(797) Class3_Sub7_Sub8 local797 = Static125.method2010(); local797 != null; local797 = Static125.method2010()) {
			local412 = local797.method3220();
			local137 = local797.method3222();
			if (local412 == 1) {
				Static97.anIntArray196[local137] = local797.anInt3670;
				Static363.aBoolean483 |= Static29.aBooleanArray105[local137];
				Static38.anIntArray65[Static295.anInt5095++ & 0x1F] = local137;
			} else if (local412 == 2) {
				Static138.aStringArray22[local137] = local797.aString37;
				Static328.anIntArray606[Static264.anInt4696++ & 0x1F] = local137;
			} else if (local412 == 3) {
				local847 = Static115.method1862(local137);
				if (!local797.aString37.equals(local847.aString21)) {
					local847.aString21 = local797.aString37;
					Static158.method2441(local847);
				}
			} else if (local412 == 4) {
				local847 = Static115.method1862(local137);
				local464 = local797.anInt3670;
				local220 = local797.anInt3669;
				local227 = local797.anInt3667;
				if (local464 != local847.anInt1571 || local220 != local847.anInt1515 || local227 != local847.anInt1548) {
					local847.anInt1515 = local220;
					local847.anInt1548 = local227;
					local847.anInt1571 = local464;
					Static158.method2441(local847);
				}
			} else if (local412 == 5) {
				local847 = Static115.method1862(local137);
				if (local847.anInt1520 != local797.anInt3670 || local797.anInt3670 == -1) {
					local847.anInt1547 = 0;
					local847.anInt1566 = 1;
					local847.anInt1520 = local797.anInt3670;
					local847.anInt1535 = 0;
					Static158.method2441(local847);
				}
			} else if (local412 == 6) {
				local157 = local797.anInt3670;
				local464 = local157 >> 10 & 0x1F;
				local220 = local157 >> 5 & 0x1F;
				local227 = local157 & 0x1F;
				local238 = (local227 << 3) + (local464 << 19) + (local220 << 11);
				@Pc(1244) Class62 local1244 = Static115.method1862(local137);
				if (local238 != local1244.anInt1542) {
					local1244.anInt1542 = local238;
					Static158.method2441(local1244);
				}
			} else if (local412 == 7) {
				local847 = Static115.method1862(local137);
				local170 = local797.anInt3670 == 1;
				if (local847.aBoolean115 != local170) {
					local847.aBoolean115 = local170;
					Static158.method2441(local847);
				}
			} else if (local412 == 8) {
				local847 = Static115.method1862(local137);
				if (local847.anInt1567 != local797.anInt3670 || local847.anInt1538 != local797.anInt3669 || local847.anInt1550 != local797.anInt3667) {
					local847.anInt1538 = local797.anInt3669;
					local847.anInt1567 = local797.anInt3670;
					local847.anInt1550 = local797.anInt3667;
					if (local847.anInt1549 != -1) {
						if (local847.anInt1531 > 0) {
							local847.anInt1550 = local847.anInt1550 * 32 / local847.anInt1531;
						} else if (local847.anInt1541 > 0) {
							local847.anInt1550 = local847.anInt1550 * 32 / local847.anInt1541;
						}
					}
					Static158.method2441(local847);
				}
			} else if (local412 == 9) {
				local847 = Static115.method1862(local137);
				if (local847.anInt1549 != local797.anInt3670 || local847.anInt1507 != local797.anInt3669) {
					local847.anInt1549 = local797.anInt3670;
					local847.anInt1507 = local797.anInt3669;
					Static158.method2441(local847);
				}
			} else if (local412 == 10) {
				local847 = Static115.method1862(local137);
				if (local847.anInt1553 != local797.anInt3670 || local797.anInt3669 != local847.anInt1527 || local797.anInt3667 != local847.anInt1513) {
					local847.anInt1527 = local797.anInt3669;
					local847.anInt1513 = local797.anInt3667;
					local847.anInt1553 = local797.anInt3670;
					Static158.method2441(local847);
				}
			} else if (local412 == 11) {
				local847 = Static115.method1862(local137);
				local847.aByte23 = 0;
				local847.anInt1523 = local847.anInt1529 = local797.anInt3670;
				local847.anInt1559 = local847.anInt1532 = local797.anInt3669;
				local847.aByte25 = 0;
				Static158.method2441(local847);
			} else if (local412 == 12) {
				local847 = Static115.method1862(local137);
				local464 = local797.anInt3670;
				if (local847 != null && local847.anInt1575 == 0) {
					if (local847.anInt1537 - local847.anInt1551 < local464) {
						local464 = local847.anInt1537 - local847.anInt1551;
					}
					if (local464 < 0) {
						local464 = 0;
					}
					if (local847.anInt1504 != local464) {
						local847.anInt1504 = local464;
						Static158.method2441(local847);
					}
				}
			} else if (local412 == 14) {
				local847 = Static115.method1862(local137);
				local847.anInt1526 = local797.anInt3670;
			} else if (local412 == 15) {
				Static361.anInt6050 = local797.anInt3670;
				Static66.aBoolean72 = true;
				Static109.anInt2145 = local797.anInt3669;
			} else if (local412 == 16) {
				local847 = Static115.method1862(local137);
				local847.anInt1514 = local797.anInt3670;
			}
		}
		Static38.anInt702++;
		if (Static174.anInt3035 != 0) {
			Static144.anInt2710 += 20;
			if (Static144.anInt2710 >= 400) {
				Static174.anInt3035 = 0;
			}
		}
		if (Static393.aClass62_20 != null) {
			Static285.anInt4992++;
			if (Static285.anInt4992 >= 15) {
				Static158.method2441(Static393.aClass62_20);
				Static393.aClass62_20 = null;
			}
		}
		Static16.aClass62_1 = null;
		Static206.aBoolean264 = false;
		Static51.aBoolean57 = false;
		Static337.aClass62_16 = null;
		Static55.method1001(-1, null, -1);
		Static239.method5185(null, -1, -1);
		Static85.method1418();
		Static28.anInt360++;
		if (Static72.aBoolean99) {
			Static229.method3783(Static80.aClass244_23);
			Static23.aClass3_Sub5_Sub1_1.method2758(Static238.anInt4224 << 14 | Static179.anInt3178 << 28 | Static37.anInt645);
			Static72.aBoolean99 = false;
		}
		while (true) {
			@Pc(1433) Class3_Sub23 local1433;
			@Pc(1438) Class62 local1438;
			do {
				local1433 = (Class3_Sub23) Static255.aClass138_35.method3047();
				if (local1433 == null) {
					while (true) {
						do {
							local1433 = (Class3_Sub23) Static345.aClass138_41.method3047();
							if (local1433 == null) {
								while (true) {
									do {
										local1433 = (Class3_Sub23) Static352.aClass138_44.method3047();
										if (local1433 == null) {
											if (Static16.aClass62_1 == null) {
												Static43.anInt778 = 0;
											}
											if (Static313.aClass62_18 != null) {
												Static342.method5173();
											}
											if (Static315.anInt5429 > 0 && Static322.aClass89_25.method1847(82) && Static322.aClass89_25.method1847(81) && Static115.anInt2219 != 0) {
												local412 = Static226.aClass28_Sub1_Sub1_Sub2_2.aByte73 - Static115.anInt2219;
												if (local412 < 0) {
													local412 = 0;
												} else if (local412 > 3) {
													local412 = 3;
												}
												Static203.method3172(local412, Static21.anInt265 + Static226.aClass28_Sub1_Sub1_Sub2_2.anIntArray491[0], Static103.anInt2044 + Static226.aClass28_Sub1_Sub1_Sub2_2.anIntArray490[0]);
											}
											Static391.method1846();
											for (local412 = 0; local412 < 5; local412++) {
												@Pc(1629) int local1629 = Static160.anIntArray604[local412]++;
											}
											if (Static363.aBoolean483 && Static150.aLong165 < Static288.method4512() - 60000L) {
												Static314.method4813();
											}
											Static29.anInt4312++;
											if (Static29.anInt4312 > 500) {
												Static29.anInt4312 = 0;
												local137 = (int) (Math.random() * 8.0D);
												if ((local137 & 0x1) == 1) {
													Static347.anInt5875 += Static12.anInt172;
												}
												if ((local137 & 0x2) == 2) {
													Static157.anInt2808 += Static65.anInt1297;
												}
												if ((local137 & 0x4) == 4) {
													Static231.anInt4140 += Static378.anInt6295;
												}
											}
											if (Static347.anInt5875 < -50) {
												Static12.anInt172 = 2;
											}
											if (Static347.anInt5875 > 50) {
												Static12.anInt172 = -2;
											}
											if (Static157.anInt2808 < -55) {
												Static65.anInt1297 = 2;
											}
											if (Static231.anInt4140 < -40) {
												Static378.anInt6295 = 1;
											}
											if (Static157.anInt2808 > 55) {
												Static65.anInt1297 = -2;
											}
											Static93.anInt1912++;
											if (Static231.anInt4140 > 40) {
												Static378.anInt6295 = -1;
											}
											if (Static93.anInt1912 > 500) {
												Static93.anInt1912 = 0;
												local137 = (int) (Math.random() * 8.0D);
												if ((local137 & 0x2) == 2) {
													Static187.anInt3396 += Static305.anInt5274;
												}
												if ((local137 & 0x1) == 1) {
													Static129.anInt2435 += Static290.anInt5035;
												}
											}
											if (Static129.anInt2435 < -60) {
												Static290.anInt5035 = 2;
											}
											if (Static187.anInt3396 < -20) {
												Static305.anInt5274 = 1;
											}
											if (Static129.anInt2435 > 60) {
												Static290.anInt5035 = -2;
											}
											if (Static187.anInt3396 > 10) {
												Static305.anInt5274 = -1;
											}
											Static17.anInt215++;
											if (Static17.anInt215 > 50) {
												Static229.method3783(Static275.aClass244_65);
											}
											if (Static219.aBoolean316) {
												Static53.method987();
												Static219.aBoolean316 = false;
											}
											try {
												if (Static12.aClass145_2 != null && Static23.aClass3_Sub5_Sub1_1.anInt3121 > 0) {
													Static133.anInt2514 += Static23.aClass3_Sub5_Sub1_1.anInt3121;
													Static12.aClass145_2.method3143(Static23.aClass3_Sub5_Sub1_1.anInt3121, Static23.aClass3_Sub5_Sub1_1.aByteArray42);
													Static23.aClass3_Sub5_Sub1_1.anInt3121 = 0;
													Static17.anInt215 = 0;
													return;
												}
												return;
											} catch (@Pc(1838) IOException local1838) {
												Static244.method3987();
												return;
											}
										}
										local1438 = local1433.aClass62_11;
										if (local1438.anInt1510 < 0) {
											break;
										}
										local847 = Static115.method1862(local1438.anInt1506);
									} while (local847 == null || local847.aClass62Array1 == null || local847.aClass62Array1.length <= local1438.anInt1510 || local847.aClass62Array1[local1438.anInt1510] != local1438);
									Static124.method2006(local1433);
								}
							}
							local1438 = local1433.aClass62_11;
							if (local1438.anInt1510 < 0) {
								break;
							}
							local847 = Static115.method1862(local1438.anInt1506);
						} while (local847 == null || local847.aClass62Array1 == null || local1438.anInt1510 >= local847.aClass62Array1.length || local847.aClass62Array1[local1438.anInt1510] != local1438);
						Static124.method2006(local1433);
					}
				}
				local1438 = local1433.aClass62_11;
				if (local1438.anInt1510 < 0) {
					break;
				}
				local847 = Static115.method1862(local1438.anInt1506);
			} while (local847 == null || local847.aClass62Array1 == null || local1438.anInt1510 >= local847.aClass62Array1.length || local847.aClass62Array1[local1438.anInt1510] != local1438);
			Static124.method2006(local1433);
		}
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(II)Z")
	public static boolean method3305(@OriginalArg(0) int arg0) {
		if (Static188.aBooleanArray82[arg0]) {
			return true;
		} else if (Static131.aClass20_37.method244(arg0)) {
			@Pc(23) int local23 = Static131.aClass20_37.method231(arg0);
			if (local23 == 0) {
				Static188.aBooleanArray82[arg0] = true;
				return true;
			}
			if (Static375.aClass62ArrayArray2[arg0] == null) {
				Static375.aClass62ArrayArray2[arg0] = new Class62[local23];
			}
			for (@Pc(45) int local45 = 0; local45 < local23; local45++) {
				if (Static375.aClass62ArrayArray2[arg0][local45] == null) {
					@Pc(61) byte[] local61 = Static131.aClass20_37.method253(local45, arg0);
					if (local61 != null) {
						@Pc(73) Class62 local73 = Static375.aClass62ArrayArray2[arg0][local45] = new Class62();
						local73.anInt1500 = (arg0 << 16) + local45;
						if (local61[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local73.method1281(new Class3_Sub5(local61));
					}
				}
			}
			Static188.aBooleanArray82[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
