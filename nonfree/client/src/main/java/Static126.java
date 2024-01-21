import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "[[I")
	public static int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!ve", name = "s", descriptor = "B")
	public static byte aByte10;

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "[Lclient!pa;")
	public static Class35_Sub1[] aClass35_Sub1Array1 = new Class35_Sub1[256];

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "[I")
	public static int[] anIntArray368 = new int[500];

	@OriginalMember(owner = "client!ve", name = "j", descriptor = "Lclient!id;")
	private static Class34 aClass34_1536 = Static9.method266("skill)2");

	@OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
	public static int anInt2995 = -1;

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "Lclient!id;")
	public static Class34 aClass34_1537 = aClass34_1536;

	@OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
	public static int anInt2997 = 0;

	@OriginalMember(owner = "client!ve", name = "r", descriptor = "I")
	public static int anInt2999 = 0;

	@OriginalMember(owner = "client!ve", name = "t", descriptor = "I")
	public static int anInt3000 = 0;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!bf;BLclient!ie;Lclient!ie;Lclient!ie;)Z")
	public static boolean method1980(@OriginalArg(0) Class1_Sub4_Sub1 arg0, @OriginalArg(2) Class35 arg1, @OriginalArg(3) Class35 arg2, @OriginalArg(4) Class35 arg3) {
		Static22.aClass1_Sub4_Sub1_1 = arg0;
		Static130.aClass35_12 = arg1;
		Static119.aClass35_30 = arg2;
		Static67.aClass35_18 = arg3;
		return true;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)I")
	public static int method1982() {
		@Pc(12) int local12 = 3;
		if (Static58.anInt1617 < 310) {
			@Pc(21) int local21 = Static119.anInt2839 >> 7;
			@Pc(26) int local26 = Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1428 >> 7;
			@Pc(30) int local30 = Static109.anInt3091 >> 7;
			if ((Static105.aByteArrayArrayArray9[Static42.anInt1208][local21][local30] & 0x4) != 0) {
				local12 = Static42.anInt1208;
			}
			@Pc(47) int local47 = Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1405 >> 7;
			@Pc(59) int local59;
			if (local21 >= local26) {
				local59 = local21 - local26;
			} else {
				local59 = local26 - local21;
			}
			@Pc(76) int local76;
			if (local47 > local30) {
				local76 = local47 - local30;
			} else {
				local76 = local30 - local47;
			}
			@Pc(92) int local92;
			@Pc(94) int local94;
			if (local76 < local59) {
				local92 = local76 * 65536 / local59;
				local94 = 32768;
				while (local21 != local26) {
					if (local21 < local26) {
						local21++;
					} else if (local26 < local21) {
						local21--;
					}
					if ((Static105.aByteArrayArrayArray9[Static42.anInt1208][local21][local30] & 0x4) != 0) {
						local12 = Static42.anInt1208;
					}
					local94 += local92;
					if (local94 >= 65536) {
						local94 -= 65536;
						if (local47 > local30) {
							local30++;
						} else if (local30 > local47) {
							local30--;
						}
						if ((Static105.aByteArrayArrayArray9[Static42.anInt1208][local21][local30] & 0x4) != 0) {
							local12 = Static42.anInt1208;
						}
					}
				}
			} else {
				local92 = local59 * 65536 / local76;
				local94 = 32768;
				while (local47 != local30) {
					local94 += local92;
					if (local30 < local47) {
						local30++;
					} else if (local47 < local30) {
						local30--;
					}
					if ((Static105.aByteArrayArrayArray9[Static42.anInt1208][local21][local30] & 0x4) != 0) {
						local12 = Static42.anInt1208;
					}
					if (local94 >= 65536) {
						if (local21 < local26) {
							local21++;
						} else if (local21 > local26) {
							local21--;
						}
						if ((Static105.aByteArrayArrayArray9[Static42.anInt1208][local21][local30] & 0x4) != 0) {
							local12 = Static42.anInt1208;
						}
						local94 -= 65536;
					}
				}
			}
		}
		if ((Static105.aByteArrayArrayArray9[Static42.anInt1208][Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1428 >> 7][Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1405 >> 7] & 0x4) != 0) {
			local12 = Static42.anInt1208;
		}
		return local12;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
	public static void method1985() {
		for (@Pc(18) Class1_Sub3 local18 = (Class1_Sub3) Static48.aClass38_10.method1034(); local18 != null; local18 = (Class1_Sub3) Static48.aClass38_10.method1038()) {
			if (local18.anInt481 == -1) {
				local18.anInt471 = 0;
				Static32.method905(local18);
			} else {
				local18.method2039();
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!a;III)V")
	public static void method1986(@OriginalArg(0) Class1_Sub1_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(20) int local20;
		if ((arg1 & 0x200) != 0) {
			arg0.anInt1414 = Static51.aClass1_Sub19_Sub1_4.method2051();
			local20 = Static51.aClass1_Sub19_Sub1_4.method2052();
			arg0.anInt1433 = 0;
			arg0.anInt1420 = (local20 & 0xFFFF) + Static73.anInt1947;
			arg0.anInt1407 = local20 >> 16;
			arg0.anInt1424 = 0;
			if (arg0.anInt1420 > Static73.anInt1947) {
				arg0.anInt1424 = -1;
			}
			if (arg0.anInt1414 == 65535) {
				arg0.anInt1414 = -1;
			}
		}
		if ((arg1 & 0x1) != 0) {
			arg0.aClass34_701 = Static51.aClass1_Sub19_Sub1_4.method2084();
			if (arg0.aClass34_701.method953(0) == 126) {
				arg0.aClass34_701 = arg0.aClass34_701.method956(1);
				Static39.method685(arg0.aClass34_97, 2, arg0.aClass34_701);
			} else if (Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1 == arg0) {
				Static39.method685(arg0.aClass34_97, 2, arg0.aClass34_701);
			}
			arg0.anInt1406 = 0;
			arg0.anInt1408 = 150;
			arg0.anInt1410 = 0;
		}
		if ((arg1 & 0x4) != 0) {
			arg0.anInt1455 = Static51.aClass1_Sub19_Sub1_4.method2076();
			arg0.anInt1422 = Static51.aClass1_Sub19_Sub1_4.method2093();
		}
		@Pc(139) int local139;
		if ((arg1 & 0x400) != 0) {
			local20 = Static51.aClass1_Sub19_Sub1_4.method2092();
			local139 = Static51.aClass1_Sub19_Sub1_4.method2066();
			arg0.method906(local139, local20, Static73.anInt1947);
			arg0.anInt1397 = Static73.anInt1947 + 300;
			arg0.anInt1413 = Static51.aClass1_Sub19_Sub1_4.method2092();
			arg0.anInt1450 = Static51.aClass1_Sub19_Sub1_4.method2072();
		}
		if ((arg1 & 0x8) != 0) {
			local20 = Static51.aClass1_Sub19_Sub1_4.method2051();
			local139 = Static51.aClass1_Sub19_Sub1_4.method2092();
			@Pc(179) int local179 = Static51.aClass1_Sub19_Sub1_4.method2092();
			@Pc(182) int local182 = Static51.aClass1_Sub19_Sub1_4.anInt3111;
			if (arg0.aClass34_97 != null && arg0.aClass10_1 != null) {
				@Pc(195) long local195 = arg0.aClass34_97.method965();
				@Pc(197) boolean local197 = false;
				if (local139 <= 1) {
					for (@Pc(202) int local202 = 0; local202 < Static114.anInt2736; local202++) {
						if (local195 == Static40.aLongArray3[local202]) {
							local197 = true;
							break;
						}
					}
				}
				if (!local197 && Static97.anInt2495 == 0) {
					Static115.aClass1_Sub19_5.anInt3111 = 0;
					Static51.aClass1_Sub19_Sub1_4.method2056(local179, Static115.aClass1_Sub19_5.aByteArray42);
					Static115.aClass1_Sub19_5.anInt3111 = 0;
					@Pc(249) Class34 local249 = Static103.method856(Static69.method1191(Static115.aClass1_Sub19_5).method979());
					arg0.aClass34_701 = local249.method957();
					arg0.anInt1410 = local20 >> 8;
					arg0.anInt1406 = local20 & 0xFF;
					arg0.anInt1408 = 150;
					if (local139 == 2 || local139 == 3) {
						Static39.method685(Static91.method1554(new Class34[] { Static3.aClass34_122, arg0.aClass34_97 }), 1, local249);
					} else if (local139 == 1) {
						Static39.method685(Static91.method1554(new Class34[] { Static114.aClass34_1378, arg0.aClass34_97 }), 1, local249);
					} else {
						Static39.method685(arg0.aClass34_97, 2, local249);
					}
				}
			}
			Static51.aClass1_Sub19_Sub1_4.anInt3111 = local179 + local182;
		}
		if ((arg1 & 0x2) != 0) {
			local20 = Static51.aClass1_Sub19_Sub1_4.method2072();
			local139 = Static51.aClass1_Sub19_Sub1_4.method2066();
			arg0.method906(local139, local20, Static73.anInt1947);
			arg0.anInt1397 = Static73.anInt1947 + 300;
			arg0.anInt1413 = Static51.aClass1_Sub19_Sub1_4.method2074();
			arg0.anInt1450 = Static51.aClass1_Sub19_Sub1_4.method2074();
		}
		if ((arg1 & 0x20) != 0) {
			local20 = Static51.aClass1_Sub19_Sub1_4.method2053();
			local139 = Static51.aClass1_Sub19_Sub1_4.method2092();
			if (local20 == 65535) {
				local20 = -1;
			}
			Static119.method1881(local20, local139, arg0);
		}
		if ((arg1 & 0x100) != 0) {
			arg0.anInt1399 = Static51.aClass1_Sub19_Sub1_4.method2074();
			arg0.anInt1411 = Static51.aClass1_Sub19_Sub1_4.method2066();
			arg0.anInt1452 = Static51.aClass1_Sub19_Sub1_4.method2074();
			arg0.anInt1400 = Static51.aClass1_Sub19_Sub1_4.method2092();
			arg0.anInt1425 = Static51.aClass1_Sub19_Sub1_4.method2093() + Static73.anInt1947;
			arg0.anInt1419 = Static51.aClass1_Sub19_Sub1_4.method2076() + Static73.anInt1947;
			arg0.anInt1434 = Static51.aClass1_Sub19_Sub1_4.method2092();
			arg0.anInt1418 = 0;
			arg0.anInt1417 = 1;
		}
		if ((arg1 & 0x40) != 0) {
			arg0.anInt1389 = Static51.aClass1_Sub19_Sub1_4.method2093();
			if (arg0.anInt1389 == 65535) {
				arg0.anInt1389 = -1;
			}
		}
		if ((arg1 & 0x80) == 0) {
			return;
		}
		local20 = Static51.aClass1_Sub19_Sub1_4.method2066();
		@Pc(478) byte[] local478 = new byte[local20];
		@Pc(483) Class1_Sub19 local483 = new Class1_Sub19(local478);
		Static51.aClass1_Sub19_Sub1_4.method2065(local20, local478);
		Static93.aClass1_Sub19Array1[arg2] = local483;
		arg0.method95(local483);
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(Z)V")
	public static void method1987() {
		if (Static44.aClass51_2 != null) {
			Static44.aClass51_2.method1361();
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
	public static void method1988() {
		anIntArray368 = null;
		aClass35_Sub1Array1 = null;
		anIntArrayArray29 = null;
		aClass34_1536 = null;
		aClass34_1537 = null;
	}
}
