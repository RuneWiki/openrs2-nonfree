import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!ff", name = "S", descriptor = "I")
	public static int anInt1125 = 0;

	@OriginalMember(owner = "client!ff", name = "ob", descriptor = "Lclient!id;")
	private static Class34 aClass34_531 = Static9.method266("You have only just left another world)3");

	@OriginalMember(owner = "client!ff", name = "Y", descriptor = "Lclient!id;")
	public static Class34 aClass34_527 = aClass34_531;

	@OriginalMember(owner = "client!ff", name = "Z", descriptor = "I")
	public static int anInt1129 = 0;

	@OriginalMember(owner = "client!ff", name = "ab", descriptor = "[Lclient!ae;")
	public static Class1_Sub1_Sub2_Sub1[] aClass1_Sub1_Sub2_Sub1Array5 = new Class1_Sub1_Sub2_Sub1[1000];

	@OriginalMember(owner = "client!ff", name = "bb", descriptor = "Lclient!id;")
	public static Class34 aClass34_528 = Static9.method266("Texturen geladen)3");

	@OriginalMember(owner = "client!ff", name = "db", descriptor = "I")
	public static int anInt1131 = 0;

	@OriginalMember(owner = "client!ff", name = "fb", descriptor = "Lclient!id;")
	public static Class34 aClass34_529 = Static9.method266("(U1");

	@OriginalMember(owner = "client!ff", name = "ib", descriptor = "Lclient!id;")
	private static Class34 aClass34_530 = Static9.method266("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!ff", name = "pb", descriptor = "Lclient!id;")
	public static Class34 aClass34_532 = aClass34_530;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIILclient!id;)V")
	public static void method671(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class34 arg3) {
		@Pc(8) Class1_Sub9 local8 = Static133.method2109(arg1, arg0);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray16 != null) {
			@Pc(18) Class1_Sub5 local18 = new Class1_Sub5();
			local18.aClass1_Sub9_3 = local8;
			local18.aClass34_300 = arg3;
			local18.anObjectArray1 = local8.anObjectArray16;
			local18.anInt567 = arg2;
			Static56.method1567(local18);
		}
		@Pc(36) boolean local36 = true;
		if (local8.anInt1030 > 0) {
			local36 = Static127.method1354(local8);
		}
		if (!local36 || !Static64.method1109(arg2 - 1, Static84.method1448(local8))) {
			return;
		}
		if (arg2 == 1) {
			Static21.aClass1_Sub19_Sub1_1.method2105(90);
			Static21.aClass1_Sub19_Sub1_1.method2062(arg0);
			Static21.aClass1_Sub19_Sub1_1.method2054(arg1);
		}
		if (arg2 == 2) {
			Static21.aClass1_Sub19_Sub1_1.method2105(33);
			Static21.aClass1_Sub19_Sub1_1.method2062(arg0);
			Static21.aClass1_Sub19_Sub1_1.method2054(arg1);
		}
		if (arg2 == 3) {
			Static21.aClass1_Sub19_Sub1_1.method2105(5);
			Static21.aClass1_Sub19_Sub1_1.method2062(arg0);
			Static21.aClass1_Sub19_Sub1_1.method2054(arg1);
		}
		if (arg2 == 4) {
			Static21.aClass1_Sub19_Sub1_1.method2105(47);
			Static21.aClass1_Sub19_Sub1_1.method2062(arg0);
			Static21.aClass1_Sub19_Sub1_1.method2054(arg1);
		}
		if (arg2 == 5) {
			Static21.aClass1_Sub19_Sub1_1.method2105(84);
			Static21.aClass1_Sub19_Sub1_1.method2062(arg0);
			Static21.aClass1_Sub19_Sub1_1.method2054(arg1);
		}
		if (arg2 == 6) {
			Static21.aClass1_Sub19_Sub1_1.method2105(184);
			Static21.aClass1_Sub19_Sub1_1.method2062(arg0);
			Static21.aClass1_Sub19_Sub1_1.method2054(arg1);
		}
		if (arg2 == 7) {
			Static21.aClass1_Sub19_Sub1_1.method2105(192);
			Static21.aClass1_Sub19_Sub1_1.method2062(arg0);
			Static21.aClass1_Sub19_Sub1_1.method2054(arg1);
		}
		if (arg2 == 8) {
			Static21.aClass1_Sub19_Sub1_1.method2105(80);
			Static21.aClass1_Sub19_Sub1_1.method2062(arg0);
			Static21.aClass1_Sub19_Sub1_1.method2054(arg1);
		}
		if (arg2 == 9) {
			Static21.aClass1_Sub19_Sub1_1.method2105(101);
			Static21.aClass1_Sub19_Sub1_1.method2062(arg0);
			Static21.aClass1_Sub19_Sub1_1.method2054(arg1);
		}
		if (arg2 == 10) {
			Static21.aClass1_Sub19_Sub1_1.method2105(171);
			Static21.aClass1_Sub19_Sub1_1.method2062(arg0);
			Static21.aClass1_Sub19_Sub1_1.method2054(arg1);
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IB)V")
	public static void method674(@OriginalArg(0) int arg0) {
		if (Static26.method496(arg0)) {
			Static21.method449(Static41.aClass1_Sub9ArrayArray1[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(B)V")
	public static void method675() {
		aClass34_529 = null;
		aClass1_Sub1_Sub2_Sub1Array5 = null;
		aClass34_531 = null;
		aClass34_530 = null;
		aClass34_532 = null;
		aClass34_528 = null;
		aClass34_527 = null;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZZ)V")
	public static void method679(@OriginalArg(1) boolean arg0) {
		Static32.aBoolean81 = arg0;
		@Pc(13) int local13;
		@Pc(17) int local17;
		@Pc(25) int local25;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(67) int local67;
		@Pc(125) int local125;
		@Pc(133) int local133;
		@Pc(141) int local141;
		if (!Static32.aBoolean81) {
			local13 = Static51.aClass1_Sub19_Sub1_4.method2074();
			local17 = Static51.aClass1_Sub19_Sub1_4.method2076();
			local25 = (Static81.anInt2134 - Static51.aClass1_Sub19_Sub1_4.anInt3111) / 16;
			Static126.anIntArrayArray29 = new int[local25][4];
			for (local31 = 0; local31 < local25; local31++) {
				for (local35 = 0; local35 < 4; local35++) {
					Static126.anIntArrayArray29[local31][local35] = Static51.aClass1_Sub19_Sub1_4.method2046();
				}
			}
			local35 = Static51.aClass1_Sub19_Sub1_4.method2053();
			@Pc(59) boolean local59 = false;
			local63 = Static51.aClass1_Sub19_Sub1_4.method2076();
			local67 = Static51.aClass1_Sub19_Sub1_4.method2093();
			Static28.anIntArray372 = new int[local25];
			Static112.aByteArrayArray9 = new byte[local25][];
			if ((local67 / 8 == 48 || local67 / 8 == 49) && local35 / 8 == 48) {
				local59 = true;
			}
			Static78.anIntArray247 = new int[local25];
			Static105.anIntArray325 = new int[local25];
			Static57.aByteArrayArray6 = new byte[local25][];
			if (local67 / 8 == 48 && local35 / 8 == 148) {
				local59 = true;
			}
			local25 = 0;
			for (local125 = (local67 - 6) / 8; local125 <= (local67 + 6) / 8; local125++) {
				for (local133 = (local35 - 6) / 8; local133 <= (local35 + 6) / 8; local133++) {
					local141 = local133 + (local125 << 8);
					if (!local59 || local133 != 49 && local133 != 149 && local133 != 147 && local125 != 50 && (local125 != 49 || local133 != 47)) {
						Static28.anIntArray372[local25] = local141;
						Static78.anIntArray247[local25] = Static10.aClass35_Sub1_8.method1582(Static91.method1554(new Class34[] { Static15.aClass34_309, Static85.method1456(local125), Static2.aClass34_105, Static85.method1456(local133) }));
						Static105.anIntArray325[local25] = Static10.aClass35_Sub1_8.method1582(Static91.method1554(new Class34[] { Static6.aClass34_198, Static85.method1456(local125), Static2.aClass34_105, Static85.method1456(local133) }));
						local25++;
					}
				}
			}
			Static34.method624(local63, local67, local13, local17, local35);
			return;
		}
		local13 = Static51.aClass1_Sub19_Sub1_4.method2093();
		local17 = Static51.aClass1_Sub19_Sub1_4.method2076();
		local25 = Static51.aClass1_Sub19_Sub1_4.method2066();
		local31 = Static51.aClass1_Sub19_Sub1_4.method2093();
		Static51.aClass1_Sub19_Sub1_4.method2102();
		@Pc(293) int local293;
		for (local35 = 0; local35 < 4; local35++) {
			for (local63 = 0; local63 < 13; local63++) {
				for (local67 = 0; local67 < 13; local67++) {
					local293 = Static51.aClass1_Sub19_Sub1_4.method2096(1);
					if (local293 == 1) {
						Static133.anIntArrayArrayArray7[local35][local63][local67] = Static51.aClass1_Sub19_Sub1_4.method2096(26);
					} else {
						Static133.anIntArrayArrayArray7[local35][local63][local67] = -1;
					}
				}
			}
		}
		Static51.aClass1_Sub19_Sub1_4.method2095();
		local63 = (Static81.anInt2134 - Static51.aClass1_Sub19_Sub1_4.anInt3111) / 16;
		Static126.anIntArrayArray29 = new int[local63][4];
		for (local67 = 0; local67 < local63; local67++) {
			for (local293 = 0; local293 < 4; local293++) {
				Static126.anIntArrayArray29[local67][local293] = Static51.aClass1_Sub19_Sub1_4.method2052();
			}
		}
		local293 = Static51.aClass1_Sub19_Sub1_4.method2051();
		Static57.aByteArrayArray6 = new byte[local63][];
		Static78.anIntArray247 = new int[local63];
		Static112.aByteArrayArray9 = new byte[local63][];
		Static105.anIntArray325 = new int[local63];
		Static28.anIntArray372 = new int[local63];
		local63 = 0;
		for (local125 = 0; local125 < 4; local125++) {
			for (local133 = 0; local133 < 13; local133++) {
				for (local141 = 0; local141 < 13; local141++) {
					@Pc(413) int local413 = Static133.anIntArrayArrayArray7[local125][local133][local141];
					if (local413 != -1) {
						@Pc(423) int local423 = local413 >> 14 & 0x3FF;
						@Pc(429) int local429 = local413 >> 3 & 0x7FF;
						@Pc(439) int local439 = local429 / 8 + (local423 / 8 << 8);
						for (@Pc(441) int local441 = 0; local441 < local63; local441++) {
							if (local439 == Static28.anIntArray372[local441]) {
								local439 = -1;
								break;
							}
						}
						if (local439 != -1) {
							Static28.anIntArray372[local63] = local439;
							@Pc(472) int local472 = local439 & 0xFF;
							@Pc(478) int local478 = local439 >> 8 & 0xFF;
							Static78.anIntArray247[local63] = Static10.aClass35_Sub1_8.method1582(Static91.method1554(new Class34[] { Static15.aClass34_309, Static85.method1456(local478), Static2.aClass34_105, Static85.method1456(local472) }));
							Static105.anIntArray325[local63] = Static10.aClass35_Sub1_8.method1582(Static91.method1554(new Class34[] { Static6.aClass34_198, Static85.method1456(local478), Static2.aClass34_105, Static85.method1456(local472) }));
							local63++;
						}
					}
				}
			}
		}
		Static34.method624(local13, local17, local25, local293, local31);
	}
}
