import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!ka", name = "ob", descriptor = "I")
	public static int anInt1520;

	@OriginalMember(owner = "client!ka", name = "gb", descriptor = "Lclient!rc;")
	private static Class55 aClass55_583 = Static34.method846("flash3:");

	@OriginalMember(owner = "client!ka", name = "ab", descriptor = "Lclient!rc;")
	public static Class55 aClass55_582 = aClass55_583;

	@OriginalMember(owner = "client!ka", name = "db", descriptor = "I")
	public static int anInt1512 = 0;

	@OriginalMember(owner = "client!ka", name = "eb", descriptor = "I")
	public static int anInt1513 = 0;

	@OriginalMember(owner = "client!ka", name = "fb", descriptor = "I")
	public static int anInt1514 = 0;

	@OriginalMember(owner = "client!ka", name = "lb", descriptor = "Lclient!le;")
	public static Class36 aClass36_19 = new Class36(64);

	@OriginalMember(owner = "client!ka", name = "nb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_584 = Static34.method846("Nehmen");

	@OriginalMember(owner = "client!ka", name = "sb", descriptor = "Lclient!rc;")
	private static Class55 aClass55_588 = Static34.method846("Loaded gamescreen");

	@OriginalMember(owner = "client!ka", name = "pb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_585 = aClass55_588;

	@OriginalMember(owner = "client!ka", name = "qb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_586 = Static34.method846("Classic");

	@OriginalMember(owner = "client!ka", name = "rb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_587 = Static34.method846(": ");

	@OriginalMember(owner = "client!ka", name = "tb", descriptor = "Z")
	public static boolean aBoolean69 = false;

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(Z)V")
	public static void method1012() {
		Static26.method1444();
		Static67.method1362();
		Static29.method746();
		Static21.method648();
		Static28.method740();
		Static14.method513();
		Static55.method1172();
		Static22.method660();
		Static72.method1431();
		Static13.method500();
		Static9.method354();
		Static41.method923();
		((Class18) Static30.anInterface4_1).method673();
		Static46.aClass36_38.method1155();
		Static87.aClass40_Sub1_29.method1239();
		Static41.aClass40_Sub1_17.method1239();
		Static24.aClass40_Sub1_12.method1239();
		Static55.aClass40_Sub1_24.method1239();
		Static9.aClass40_Sub1_5.method1239();
		Static43.aClass40_Sub1_19.method1239();
		Static51.aClass40_Sub1_22.method1239();
		Static92.aClass40_Sub1_33.method1239();
		Static33.aClass40_Sub1_15.method1239();
		Static72.aClass40_Sub1_27.method1239();
		Static109.aClass40_Sub1_42.method1239();
		Static105.aClass40_Sub1_40.method1239();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!pb;)V")
	public static void method1013(@OriginalArg(1) Class40 arg0) {
		Static28.aClass40_17 = arg0;
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(Z)V")
	public static void method1014() {
		aClass55_585 = null;
		aClass55_588 = null;
		aClass55_587 = null;
		aClass55_584 = null;
		aClass36_19 = null;
		aClass55_582 = null;
		aClass55_583 = null;
		aClass55_586 = null;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!pb;Lclient!rc;Lclient!rc;I)[Lclient!bd;")
	public static Class6_Sub2_Sub2_Sub1[] method1016(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class55 arg1, @OriginalArg(2) Class55 arg2) {
		@Pc(8) int local8 = arg0.method1229(arg2);
		@Pc(14) int local14 = arg0.method1242(local8, arg1);
		return Static81.method1564(local14, local8, arg0);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!rc;Lclient!rc;ILclient!pb;)[Lclient!eb;")
	public static Class6_Sub2_Sub2_Sub2[] method1017(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Class55 arg1, @OriginalArg(3) Class40 arg2) {
		@Pc(10) int local10 = arg2.method1229(arg1);
		@Pc(16) int local16 = arg2.method1242(local10, arg0);
		return Static68.method1378(local10, arg2, local16);
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(II)V")
	public static void method1018(@OriginalArg(0) int arg0) {
		Static63.method1321();
		@Pc(12) int local12 = Static43.method985(arg0).anInt1315;
		if (local12 == 0) {
			return;
		}
		@Pc(19) int local19 = Static11.anIntArray44[arg0];
		if (local12 == 1) {
			if (local19 == 1) {
				Static30.method792(0.9D);
				((Class18) Static30.anInterface4_1).method672(0.9D);
			}
			if (local19 == 2) {
				Static30.method792(0.8D);
				((Class18) Static30.anInterface4_1).method672(0.8D);
			}
			if (local19 == 3) {
				Static30.method792(0.7D);
				((Class18) Static30.anInterface4_1).method672(0.7D);
			}
			if (local19 == 4) {
				Static30.method792(0.6D);
				((Class18) Static30.anInterface4_1).method672(0.6D);
			}
			Static110.method2040();
			Static52.aBoolean74 = true;
		}
		if (local12 == 3) {
			@Pc(81) short local81 = 0;
			if (local19 == 0) {
				local81 = 255;
			}
			if (local19 == 1) {
				local81 = 192;
			}
			if (local19 == 2) {
				local81 = 128;
			}
			if (local19 == 3) {
				local81 = 64;
			}
			if (local19 == 4) {
				local81 = 0;
			}
			if (Static96.anInt2811 != local81) {
				if (Static96.anInt2811 == 0 && Static6.anInt268 != -1) {
					Static77.method1531(local81, 0, Static6.anInt268, Static43.aClass40_Sub1_19);
					Static46.anInt3212 = 0;
				} else if (local81 == 0) {
					Static77.method1532();
					Static46.anInt3212 = 0;
				} else {
					Static76.method1516(local81);
				}
				Static96.anInt2811 = local81;
			}
		}
		if (local12 == 4) {
			if (local19 == 0) {
				Static46.anInt3215 = 127;
			}
			if (local19 == 1) {
				Static46.anInt3215 = 96;
			}
			if (local19 == 2) {
				Static46.anInt3215 = 64;
			}
			if (local19 == 3) {
				Static46.anInt3215 = 32;
			}
			if (local19 == 4) {
				Static46.anInt3215 = 0;
			}
		}
		if (local12 == 10) {
			if (local19 == 0) {
				Static74.anInt1807 = 127;
			}
			if (local19 == 1) {
				Static74.anInt1807 = 96;
			}
			if (local19 == 2) {
				Static74.anInt1807 = 64;
			}
			if (local19 == 3) {
				Static74.anInt1807 = 32;
			}
			if (local19 == 4) {
				Static74.anInt1807 = 0;
			}
		}
		if (local12 == 9) {
			Static101.anInt3016 = local19;
		}
		if (local12 == 8) {
			Static31.anInt1201 = local19;
			Static72.aBoolean99 = true;
		}
		if (local12 == 5) {
			Static1.anInt5 = local19;
		}
		if (local12 == 6) {
			Static68.anInt2017 = local19;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZZ)V")
	public static void method1019(@OriginalArg(1) boolean arg0) {
		Static26.aBoolean102 = arg0;
		@Pc(9) int local9;
		@Pc(13) int local13;
		@Pc(17) int local17;
		@Pc(25) int local25;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(61) int local61;
		@Pc(117) int local117;
		@Pc(125) int local125;
		@Pc(134) int local134;
		if (!Static26.aBoolean102) {
			local9 = Static13.aClass6_Sub1_Sub1_2.method1466();
			local13 = Static13.aClass6_Sub1_Sub1_2.method1507();
			local17 = Static13.aClass6_Sub1_Sub1_2.method1464();
			local25 = (Static63.anInt1889 - Static13.aClass6_Sub1_Sub1_2.anInt2209) / 16;
			Static85.anIntArrayArray19 = new int[local25][4];
			for (local31 = 0; local31 < local25; local31++) {
				for (local35 = 0; local35 < 4; local35++) {
					Static85.anIntArrayArray19[local31][local35] = Static13.aClass6_Sub1_Sub1_2.method1486();
				}
			}
			local35 = Static13.aClass6_Sub1_Sub1_2.method1502();
			local61 = Static13.aClass6_Sub1_Sub1_2.method1466();
			Static18.aByteArrayArray1 = new byte[local25][];
			Static35.anIntArray82 = new int[local25];
			Static104.anIntArray289 = new int[local25];
			Static56.anIntArray164 = new int[local25];
			@Pc(75) boolean local75 = false;
			if ((local9 / 8 == 48 || local9 / 8 == 49) && local35 / 8 == 48) {
				local75 = true;
			}
			Static96.aByteArrayArray8 = new byte[local25][];
			if (local9 / 8 == 48 && local35 / 8 == 148) {
				local75 = true;
			}
			local25 = 0;
			for (local117 = (local9 - 6) / 8; local117 <= (local9 + 6) / 8; local117++) {
				for (local125 = (local35 - 6) / 8; local125 <= (local35 + 6) / 8; local125++) {
					local134 = (local117 << 8) + local125;
					if (!local75 || local125 != 49 && local125 != 149 && local125 != 147 && local117 != 50 && (local117 != 49 || local125 != 47)) {
						Static56.anIntArray164[local25] = local134;
						Static104.anIntArray289[local25] = Static9.aClass40_Sub1_5.method1229(Static89.method1698(new Class55[] { Static27.aClass55_527, Static58.method1196(local117), Static46.aClass55_1344, Static58.method1196(local125) }));
						Static35.anIntArray82[local25] = Static9.aClass40_Sub1_5.method1229(Static89.method1698(new Class55[] { Static55.aClass55_665, Static58.method1196(local117), Static46.aClass55_1344, Static58.method1196(local125) }));
						local25++;
					}
				}
			}
			Static44.method1834(local35, local9, local13, local61, local17);
			return;
		}
		local9 = Static13.aClass6_Sub1_Sub1_2.method1466();
		local13 = Static13.aClass6_Sub1_Sub1_2.method1505();
		local17 = Static13.aClass6_Sub1_Sub1_2.method1466();
		local25 = Static13.aClass6_Sub1_Sub1_2.method1500();
		Static13.aClass6_Sub1_Sub1_2.method1524();
		@Pc(296) int local296;
		for (local31 = 0; local31 < 4; local31++) {
			for (local35 = 0; local35 < 13; local35++) {
				for (local61 = 0; local61 < 13; local61++) {
					local296 = Static13.aClass6_Sub1_Sub1_2.method1519(1);
					if (local296 == 1) {
						Static104.anIntArrayArrayArray7[local31][local35][local61] = Static13.aClass6_Sub1_Sub1_2.method1519(26);
					} else {
						Static104.anIntArrayArrayArray7[local31][local35][local61] = -1;
					}
				}
			}
		}
		Static13.aClass6_Sub1_Sub1_2.method1523();
		local35 = (Static63.anInt1889 - Static13.aClass6_Sub1_Sub1_2.anInt2209) / 16;
		Static85.anIntArrayArray19 = new int[local35][4];
		for (local61 = 0; local61 < local35; local61++) {
			for (local296 = 0; local296 < 4; local296++) {
				Static85.anIntArrayArray19[local61][local296] = Static13.aClass6_Sub1_Sub1_2.method1462();
			}
		}
		local296 = Static13.aClass6_Sub1_Sub1_2.method1502();
		Static96.aByteArrayArray8 = new byte[local35][];
		Static104.anIntArray289 = new int[local35];
		Static56.anIntArray164 = new int[local35];
		Static18.aByteArrayArray1 = new byte[local35][];
		Static35.anIntArray82 = new int[local35];
		local35 = 0;
		for (local117 = 0; local117 < 4; local117++) {
			for (local125 = 0; local125 < 13; local125++) {
				for (local134 = 0; local134 < 13; local134++) {
					@Pc(416) int local416 = Static104.anIntArrayArrayArray7[local117][local125][local134];
					if (local416 != -1) {
						@Pc(426) int local426 = local416 >> 14 & 0x3FF;
						@Pc(432) int local432 = local416 >> 3 & 0x7FF;
						@Pc(442) int local442 = local432 / 8 + (local426 / 8 << 8);
						for (@Pc(444) int local444 = 0; local444 < local35; local444++) {
							if (Static56.anIntArray164[local444] == local442) {
								local442 = -1;
								break;
							}
						}
						if (local442 != -1) {
							Static56.anIntArray164[local35] = local442;
							@Pc(477) int local477 = local442 >> 8 & 0xFF;
							@Pc(481) int local481 = local442 & 0xFF;
							Static104.anIntArray289[local35] = Static9.aClass40_Sub1_5.method1229(Static89.method1698(new Class55[] { Static27.aClass55_527, Static58.method1196(local477), Static46.aClass55_1344, Static58.method1196(local481) }));
							Static35.anIntArray82[local35] = Static9.aClass40_Sub1_5.method1229(Static89.method1698(new Class55[] { Static55.aClass55_665, Static58.method1196(local477), Static46.aClass55_1344, Static58.method1196(local481) }));
							local35++;
						}
					}
				}
			}
		}
		Static44.method1834(local9, local17, local25, local296, local13);
	}
}
