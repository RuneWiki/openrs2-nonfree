import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!mf", name = "ub", descriptor = "Lclient!q;")
	public static Class62 aClass62_28;

	@OriginalMember(owner = "client!mf", name = "Tb", descriptor = "Lclient!de;")
	public static Class1_Sub1_Sub4_Sub1 aClass1_Sub1_Sub4_Sub1_47;

	@OriginalMember(owner = "client!mf", name = "jc", descriptor = "I")
	public static int anInt2512;

	@OriginalMember(owner = "client!mf", name = "Jc", descriptor = "Lclient!bc;")
	public static Class6 aClass6_17;

	@OriginalMember(owner = "client!mf", name = "Kc", descriptor = "[Lclient!pb;")
	public static Class1_Sub1_Sub4_Sub4[] aClass1_Sub1_Sub4_Sub4Array11;

	@OriginalMember(owner = "client!mf", name = "Mc", descriptor = "Lclient!bc;")
	public static Class6 aClass6_18;

	@OriginalMember(owner = "client!mf", name = "sb", descriptor = "I")
	public static int anInt2480 = 0;

	@OriginalMember(owner = "client!mf", name = "Cb", descriptor = "Lclient!wb;")
	public static Class1_Sub18_Sub1 aClass1_Sub18_Sub1_3 = new Class1_Sub18_Sub1(5000);

	@OriginalMember(owner = "client!mf", name = "Hb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1221 = Static108.method1915("backvmid1");

	@OriginalMember(owner = "client!mf", name = "Ub", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1224 = Static108.method1915("Please remove ");

	@OriginalMember(owner = "client!mf", name = "Jb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1222 = aClass39_1224;

	@OriginalMember(owner = "client!mf", name = "Nb", descriptor = "[I")
	public static int[] anIntArray384 = new int[1000];

	@OriginalMember(owner = "client!mf", name = "Qb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1223 = aClass39_1224;

	@OriginalMember(owner = "client!mf", name = "Vb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1225 = Static108.method1915("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!mf", name = "Nc", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1227 = null;

	@OriginalMember(owner = "client!mf", name = "Rc", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1230 = Static108.method1915("Hidden");

	@OriginalMember(owner = "client!mf", name = "Oc", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1228 = aClass39_1230;

	@OriginalMember(owner = "client!mf", name = "Pc", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1229 = Static108.method1915("blinken3:");

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "(I)Z")
	public static boolean method1796() {
		@Pc(8) long local8 = Static124.method2079();
		@Pc(14) int local14 = (int) (local8 - Static26.aLong19);
		Static26.aLong19 = local8;
		if (local14 > 200) {
			local14 = 200;
		}
		Static12.anInt503 += local14;
		if (Static55.anInt1502 == 0 && Static122.anInt2977 == 0 && Static88.anInt2088 == 0 && Static52.anInt1452 == 0) {
			return true;
		} else if (Static71.aClass74_3 == null) {
			return false;
		} else {
			try {
				if (Static12.anInt503 > 30000) {
					throw new IOException();
				}
				@Pc(66) Class1_Sub1_Sub15 local66;
				@Pc(71) Class1_Sub18 local71;
				while (Static122.anInt2977 < 20 && Static52.anInt1452 > 0) {
					local66 = (Class1_Sub1_Sub15) Static70.aClass70_8.method1958();
					local71 = new Class1_Sub18(4);
					local71.method2168(1);
					local71.method2188((int) local66.aLong98);
					Static71.aClass74_3.method2055(local71.aByteArray96, 4);
					Static35.aClass70_1.method1955(local66, local66.aLong98);
					Static52.anInt1452--;
					Static122.anInt2977++;
				}
				while (Static55.anInt1502 < 20 && Static88.anInt2088 > 0) {
					local66 = (Class1_Sub1_Sub15) Static71.aClass42_2.method1199();
					local71 = new Class1_Sub18(4);
					local71.method2168(0);
					local71.method2188((int) local66.aLong98);
					Static71.aClass74_3.method2055(local71.aByteArray96, 4);
					local66.method2110();
					Static66.aClass70_7.method1955(local66, local66.aLong98);
					Static55.anInt1502++;
					Static88.anInt2088--;
				}
				for (@Pc(167) int local167 = 0; local167 < 100; local167++) {
					@Pc(173) int local173 = Static71.aClass74_3.method2048();
					if (local173 < 0) {
						throw new IOException();
					}
					if (local173 == 0) {
						break;
					}
					Static12.anInt503 = 0;
					@Pc(185) byte local185 = 0;
					if (Static72.aClass1_Sub1_Sub15_1 == null) {
						local185 = 8;
					} else if (Static89.anInt2105 == 0) {
						local185 = 1;
					}
					@Pc(206) int local206;
					@Pc(227) int local227;
					@Pc(277) int local277;
					@Pc(292) int local292;
					if (local185 > 0) {
						local206 = local185 - Static99.aClass1_Sub18_3.anInt3078;
						if (local173 < local206) {
							local206 = local173;
						}
						Static71.aClass74_3.method2049(Static99.aClass1_Sub18_3.anInt3078, Static99.aClass1_Sub18_3.aByteArray96, local206);
						if (Static118.aByte6 != 0) {
							for (local227 = 0; local227 < local206; local227++) {
								Static99.aClass1_Sub18_3.aByteArray96[Static99.aClass1_Sub18_3.anInt3078 + local227] ^= Static118.aByte6;
							}
						}
						Static99.aClass1_Sub18_3.anInt3078 += local206;
						if (local185 > Static99.aClass1_Sub18_3.anInt3078) {
							break;
						}
						if (Static72.aClass1_Sub1_Sub15_1 == null) {
							Static99.aClass1_Sub18_3.anInt3078 = 0;
							local227 = Static99.aClass1_Sub18_3.method2169();
							local277 = Static99.aClass1_Sub18_3.method2156();
							@Pc(281) int local281 = Static99.aClass1_Sub18_3.method2169();
							@Pc(288) long local288 = (long) (local277 + (local227 << 16));
							local292 = Static99.aClass1_Sub18_3.method2185();
							@Pc(298) Class1_Sub1_Sub15 local298 = (Class1_Sub1_Sub15) Static35.aClass70_1.method1961(local288);
							Static101.aBoolean206 = true;
							if (local298 == null) {
								local298 = (Class1_Sub1_Sub15) Static66.aClass70_7.method1961(local288);
								Static101.aBoolean206 = false;
							}
							if (local298 == null) {
								throw new IOException();
							}
							Static72.aClass1_Sub1_Sub15_1 = local298;
							@Pc(327) int local327 = local281 == 0 ? 5 : 9;
							Static59.aClass1_Sub18_1 = new Class1_Sub18(Static72.aClass1_Sub1_Sub15_1.aByte5 + local292 + local327);
							Static59.aClass1_Sub18_1.method2168(local281);
							Static59.aClass1_Sub18_1.method2149(local292);
							Static99.aClass1_Sub18_3.anInt3078 = 0;
							Static89.anInt2105 = 8;
						} else if (Static89.anInt2105 == 0) {
							if (Static99.aClass1_Sub18_3.aByteArray96[0] == -1) {
								Static99.aClass1_Sub18_3.anInt3078 = 0;
								Static89.anInt2105 = 1;
							} else {
								Static72.aClass1_Sub1_Sub15_1 = null;
							}
						}
					} else {
						local206 = Static59.aClass1_Sub18_1.aByteArray96.length - Static72.aClass1_Sub1_Sub15_1.aByte5;
						local227 = 512 - Static89.anInt2105;
						if (local206 - Static59.aClass1_Sub18_1.anInt3078 < local227) {
							local227 = local206 - Static59.aClass1_Sub18_1.anInt3078;
						}
						if (local227 > local173) {
							local227 = local173;
						}
						Static71.aClass74_3.method2049(Static59.aClass1_Sub18_1.anInt3078, Static59.aClass1_Sub18_1.aByteArray96, local227);
						if (Static118.aByte6 != 0) {
							for (local277 = 0; local277 < local227; local277++) {
								Static59.aClass1_Sub18_1.aByteArray96[Static59.aClass1_Sub18_1.anInt3078 + local277] = (byte) (Static59.aClass1_Sub18_1.aByteArray96[Static59.aClass1_Sub18_1.anInt3078 + local277] ^ Static118.aByte6);
							}
						}
						Static89.anInt2105 += local227;
						Static59.aClass1_Sub18_1.anInt3078 += local227;
						if (Static59.aClass1_Sub18_1.anInt3078 == local206) {
							if (Static72.aClass1_Sub1_Sub15_1.aLong98 == 16711935L) {
								Static114.aClass1_Sub18_4 = Static59.aClass1_Sub18_1;
								for (local277 = 0; local277 < 256; local277++) {
									@Pc(479) Class62_Sub1 local479 = Static122.aClass62_Sub1Array1[local277];
									if (local479 != null) {
										Static114.aClass1_Sub18_4.anInt3078 = local277 * 8 + 5;
										local292 = Static114.aClass1_Sub18_4.method2185();
										@Pc(496) int local496 = Static114.aClass1_Sub18_4.method2185();
										local479.method2030(local292, local496);
									}
								}
							} else {
								Static38.aCRC32_1.reset();
								Static38.aCRC32_1.update(Static59.aClass1_Sub18_1.aByteArray96, 0, local206);
								local277 = (int) Static38.aCRC32_1.getValue();
								if (Static72.aClass1_Sub1_Sub15_1.anInt2638 != local277) {
									try {
										Static71.aClass74_3.method2047();
									} catch (@Pc(532) Exception local532) {
									}
									Static71.aClass74_3 = null;
									Static118.aByte6 = (byte) (Math.random() * 255.0D + 1.0D);
									Static28.anInt2563++;
									return false;
								}
								Static28.anInt2563 = 0;
								Static90.anInt2124 = 0;
								Static72.aClass1_Sub1_Sub15_1.aClass62_Sub1_68.method2026(Static59.aClass1_Sub18_1.aByteArray96, (Static72.aClass1_Sub1_Sub15_1.aLong98 & 0xFF0000L) == 16711680L, Static101.aBoolean206, (int) (Static72.aClass1_Sub1_Sub15_1.aLong98 & 0xFFFFL));
							}
							Static72.aClass1_Sub1_Sub15_1.method2128();
							Static59.aClass1_Sub18_1 = null;
							Static72.aClass1_Sub1_Sub15_1 = null;
							if (Static101.aBoolean206) {
								Static122.anInt2977--;
							} else {
								Static55.anInt1502--;
							}
							Static89.anInt2105 = 0;
						} else {
							if (Static89.anInt2105 != 512) {
								break;
							}
							Static89.anInt2105 = 0;
						}
					}
				}
				return true;
			} catch (@Pc(613) IOException local613) {
				try {
					Static71.aClass74_3.method2047();
				} catch (@Pc(618) Exception local618) {
				}
				Static90.anInt2124++;
				Static71.aClass74_3 = null;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "(B)V")
	public static void method1798() {
		Static81.aClass6_15.method2069();
		Static71.aClass1_Sub1_Sub4_Sub1_34.method492(0, 0);
		Static27.method566();
	}

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "(B)V")
	public static void method1800() {
		for (@Pc(11) int local11 = 0; local11 < Static94.anInt2224; local11++) {
			@Pc(17) int local17 = Static117.anIntArray460[local11];
			@Pc(21) Class1_Sub1_Sub2_Sub1_Sub1 local21 = Static114.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local17];
			@Pc(25) int local25 = aClass1_Sub18_Sub1_3.method2169();
			if ((local25 & 0x8) != 0) {
				local21.anInt2530 = aClass1_Sub18_Sub1_3.method2156();
				local21.anInt2479 = aClass1_Sub18_Sub1_3.method2146();
			}
			if ((local25 & 0x2) != 0) {
				local21.anInt2510 = aClass1_Sub18_Sub1_3.method2141();
				if (local21.anInt2510 == 65535) {
					local21.anInt2510 = -1;
				}
			}
			@Pc(68) int local68;
			@Pc(72) int local72;
			if ((local25 & 0x10) != 0) {
				local68 = aClass1_Sub18_Sub1_3.method2150();
				local72 = aClass1_Sub18_Sub1_3.method2171();
				local21.method1795(Static45.anInt1256, local72, local68);
				local21.anInt2477 = Static45.anInt1256 + 300;
				local21.anInt2484 = aClass1_Sub18_Sub1_3.method2169();
				local21.anInt2476 = aClass1_Sub18_Sub1_3.method2171();
			}
			if ((local25 & 0x40) != 0) {
				local21.aClass1_Sub1_Sub5_1 = Static120.method2132(aClass1_Sub18_Sub1_3.method2146());
				local21.anInt2504 = local21.aClass1_Sub1_Sub5_1.anInt902;
				local21.anInt2503 = local21.aClass1_Sub1_Sub5_1.anInt918;
				local21.anInt2487 = local21.aClass1_Sub1_Sub5_1.anInt911;
				local21.anInt2491 = local21.aClass1_Sub1_Sub5_1.anInt913;
				local21.anInt2496 = local21.aClass1_Sub1_Sub5_1.anInt925;
				local21.anInt2520 = local21.aClass1_Sub1_Sub5_1.anInt905;
				local21.anInt2505 = local21.aClass1_Sub1_Sub5_1.anInt899;
				local21.anInt2478 = local21.aClass1_Sub1_Sub5_1.anInt912;
				local21.anInt2486 = local21.aClass1_Sub1_Sub5_1.anInt910;
			}
			if ((local25 & 0x80) != 0) {
				local68 = aClass1_Sub18_Sub1_3.method2170();
				local72 = aClass1_Sub18_Sub1_3.method2150();
				if (local68 == 65535) {
					local68 = -1;
				}
				if (local21.anInt2526 == local68 && local68 != -1) {
					@Pc(190) int local190 = Static82.method1398(local68).anInt1049;
					if (local190 == 1) {
						local21.anInt2518 = 0;
						local21.anInt2492 = local72;
						local21.anInt2485 = 0;
						local21.anInt2534 = 0;
					}
					if (local190 == 2) {
						local21.anInt2518 = 0;
					}
				} else if (local68 == -1 || local21.anInt2526 == -1 || Static82.method1398(local68).anInt1038 >= Static82.method1398(local21.anInt2526).anInt1038) {
					local21.anInt2482 = local21.anInt2527;
					local21.anInt2492 = local72;
					local21.anInt2526 = local68;
					local21.anInt2485 = 0;
					local21.anInt2534 = 0;
					local21.anInt2518 = 0;
				}
			}
			if ((local25 & 0x4) != 0) {
				local68 = aClass1_Sub18_Sub1_3.method2150();
				local72 = aClass1_Sub18_Sub1_3.method2174();
				local21.method1795(Static45.anInt1256, local72, local68);
				local21.anInt2477 = Static45.anInt1256 + 300;
				local21.anInt2484 = aClass1_Sub18_Sub1_3.method2169();
				local21.anInt2476 = aClass1_Sub18_Sub1_3.method2169();
			}
			if ((local25 & 0x1) != 0) {
				local21.anInt2535 = aClass1_Sub18_Sub1_3.method2146();
				local68 = aClass1_Sub18_Sub1_3.method2137();
				local21.anInt2497 = local68 >> 16;
				if (local21.anInt2535 == 65535) {
					local21.anInt2535 = -1;
				}
				local21.anInt2519 = 0;
				local21.anInt2506 = 0;
				local21.anInt2493 = Static45.anInt1256 + (local68 & 0xFFFF);
				if (Static45.anInt1256 < local21.anInt2493) {
					local21.anInt2506 = -1;
				}
			}
			if ((local25 & 0x20) != 0) {
				local21.aClass39_1226 = aClass1_Sub18_Sub1_3.method2139();
				local21.anInt2498 = 100;
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "(I)V")
	public static void method1802() {
		aClass39_1225 = null;
		aClass62_28 = null;
		aClass1_Sub1_Sub4_Sub4Array11 = null;
		aClass39_1230 = null;
		aClass39_1228 = null;
		aClass39_1222 = null;
		aClass39_1224 = null;
		aClass39_1223 = null;
		aClass1_Sub1_Sub4_Sub1_47 = null;
		aClass6_18 = null;
		aClass39_1221 = null;
		anIntArray384 = null;
		aClass1_Sub18_Sub1_3 = null;
		aClass39_1229 = null;
		aClass6_17 = null;
		aClass39_1227 = null;
	}
}
