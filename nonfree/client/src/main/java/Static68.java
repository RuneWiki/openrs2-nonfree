import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!m", name = "bb", descriptor = "[Lclient!ia;")
	public static Class5_Sub1_Sub10_Sub1[] aClass5_Sub1_Sub10_Sub1Array7;

	@OriginalMember(owner = "client!m", name = "b", descriptor = "I")
	public static int anInt1659 = -1;

	@OriginalMember(owner = "client!m", name = "c", descriptor = "Lclient!vc;")
	public static Class71 aClass71_824 = Static38.method736("@whi@");

	@OriginalMember(owner = "client!m", name = "Z", descriptor = "Lclient!vc;")
	private static Class71 aClass71_833 = Static38.method736("Enter name of player to delete from list");

	@OriginalMember(owner = "client!m", name = "o", descriptor = "Lclient!vc;")
	public static Class71 aClass71_825 = aClass71_833;

	@OriginalMember(owner = "client!m", name = "r", descriptor = "Lclient!vc;")
	public static Class71 aClass71_826 = Static38.method736(":duelreq:");

	@OriginalMember(owner = "client!m", name = "x", descriptor = "Lclient!vc;")
	public static Class71 aClass71_827 = Static38.method736("Hierhin gehen");

	@OriginalMember(owner = "client!m", name = "I", descriptor = "[I")
	public static int[] anIntArray206 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!m", name = "M", descriptor = "Lclient!vc;")
	public static Class71 aClass71_828 = Static38.method736("cross");

	@OriginalMember(owner = "client!m", name = "W", descriptor = "Lclient!vc;")
	private static Class71 aClass71_832 = Static38.method736("Loading sprites )2 ");

	@OriginalMember(owner = "client!m", name = "Q", descriptor = "Lclient!vc;")
	public static Class71 aClass71_829 = aClass71_832;

	@OriginalMember(owner = "client!m", name = "S", descriptor = "Lclient!vc;")
	public static Class71 aClass71_830 = Static38.method736("Lade Ignorieren)2Liste)3)3)3");

	@OriginalMember(owner = "client!m", name = "T", descriptor = "Lclient!vc;")
	public static Class71 aClass71_831 = Static38.method736("Die Verbindung konnte");

	@OriginalMember(owner = "client!m", name = "X", descriptor = "Z")
	public static boolean aBoolean72 = false;

	@OriginalMember(owner = "client!m", name = "eb", descriptor = "I")
	public static int anInt1685 = 0;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
	public static void method1139() {
		@Pc(11) int local11;
		if (Static23.anInt729 > 0) {
			for (local11 = 0; local11 < 256; local11++) {
				if (Static23.anInt729 > 768) {
					Static46.anIntArray139[local11] = Static19.method490(1024 - Static23.anInt729, Static75.anIntArray228[local11], Static73.anIntArray225[local11]);
				} else if (Static23.anInt729 > 256) {
					Static46.anIntArray139[local11] = Static75.anIntArray228[local11];
				} else {
					Static46.anIntArray139[local11] = Static19.method490(256 - Static23.anInt729, Static73.anIntArray225[local11], Static75.anIntArray228[local11]);
				}
			}
		} else if (Static91.anInt2116 <= 0) {
			for (local11 = 0; local11 < 256; local11++) {
				Static46.anIntArray139[local11] = Static73.anIntArray225[local11];
			}
		} else {
			for (local11 = 0; local11 < 256; local11++) {
				if (Static91.anInt2116 > 768) {
					Static46.anIntArray139[local11] = Static19.method490(1024 - Static91.anInt2116, Static114.anIntArray279[local11], Static73.anIntArray225[local11]);
				} else if (Static91.anInt2116 <= 256) {
					Static46.anIntArray139[local11] = Static19.method490(256 - Static91.anInt2116, Static73.anIntArray225[local11], Static114.anIntArray279[local11]);
				} else {
					Static46.anIntArray139[local11] = Static114.anIntArray279[local11];
				}
			}
		}
		for (local11 = 0; local11 < 33920; local11++) {
			Static6.aClass7_10.anIntArray116[local11] = Static90.aClass5_Sub1_Sub10_Sub3_57.anIntArray281[local11];
		}
		@Pc(157) int local157 = 0;
		@Pc(161) int local161 = 1152;
		@Pc(181) int local181;
		@Pc(185) int local185;
		@Pc(195) int local195;
		@Pc(202) int local202;
		@Pc(217) int local217;
		@Pc(215) int local215;
		@Pc(226) int local226;
		for (@Pc(168) int local168 = 1; local168 < 255; local168++) {
			local181 = Static39.anIntArray121[local168] * (256 - local168) / 256;
			local185 = local181 + 22;
			if (local185 < 0) {
				local185 = 0;
			}
			local157 += local185;
			for (local195 = local185; local195 < 128; local195++) {
				local202 = Static5.anIntArray9[local157++];
				if (local202 == 0) {
					local161++;
				} else {
					local215 = 256 - local202;
					local217 = local202;
					local202 = Static46.anIntArray139[local202];
					local226 = Static6.aClass7_10.anIntArray116[local161];
					Static6.aClass7_10.anIntArray116[local161++] = ((local202 & 0xFF00FF) * local217 + (local226 & 0xFF00FF) * local215 & 0xFF00FF00) + (local215 * (local226 & 0xFF00) + (local202 & 0xFF00) * local217 & 0xFF0000) >> 8;
				}
			}
			local161 += local185;
		}
		for (local181 = 0; local181 < 33920; local181++) {
			Static82.aClass7_61.anIntArray116[local181] = Static48.aClass5_Sub1_Sub10_Sub3_25.anIntArray281[local181];
		}
		local157 = 0;
		local161 = 1176;
		for (local185 = 1; local185 < 255; local185++) {
			local195 = (256 - local185) * Static39.anIntArray121[local185] / 256;
			local161 += local195;
			local202 = 103 - local195;
			for (local217 = 0; local217 < local202; local217++) {
				local215 = Static5.anIntArray9[local157++];
				if (local215 == 0) {
					local161++;
				} else {
					local226 = local215;
					@Pc(345) int local345 = Static82.aClass7_61.anIntArray116[local161];
					@Pc(349) int local349 = 256 - local215;
					local215 = Static46.anIntArray139[local215];
					Static82.aClass7_61.anIntArray116[local161++] = ((local345 & 0xFF00FF) * local349 + local226 * (local215 & 0xFF00FF) & 0xFF00FF00) + ((local215 & 0xFF00) * local226 + (local349 * (local345 & 0xFF00)) & 0xFF0000) >> 8;
				}
			}
			local157 += 128 - local202;
			local161 += 128 - local195 - local202;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZLclient!me;)Z")
	public static boolean method1140(@OriginalArg(1) Class5_Sub1_Sub11 arg0) {
		@Pc(9) int local9 = arg0.anInt1764;
		if (local9 >= 1 && local9 <= 200 || !(local9 < 701 || local9 > 900)) {
			if (local9 >= 801) {
				local9 -= 701;
			} else if (local9 >= 701) {
				local9 -= 601;
			} else if (local9 >= 101) {
				local9 -= 101;
			} else {
				local9--;
			}
			Static60.method1040(21, Static74.method677(new Class71[] { aClass71_824, Static81.aClass71Array13[local9] }), 0, 0, 0, Static1.aClass71_3);
			Static60.method1040(15, Static74.method677(new Class71[] { aClass71_824, Static81.aClass71Array13[local9] }), 0, 0, 0, Static60.aClass71_786);
			return true;
		} else if (local9 >= 401 && local9 <= 500) {
			Static60.method1040(24, Static74.method677(new Class71[] { aClass71_824, arg0.aClass71_879 }), 0, 0, 0, Static1.aClass71_3);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)Lclient!vd;")
	public static Class5_Sub1_Sub10_Sub3 method1141() {
		@Pc(9) Class5_Sub1_Sub10_Sub3 local9 = new Class5_Sub1_Sub10_Sub3();
		local9.anInt2771 = Static118.anInt2914;
		local9.anInt2773 = Static66.anIntArray192[0];
		local9.anInt2774 = Static29.anInt778;
		local9.anInt2772 = Static5.anIntArray8[0];
		local9.anInt2769 = Static48.anIntArray157[0];
		local9.anInt2770 = Static40.anIntArray85[0];
		@Pc(48) int local48 = local9.anInt2769 * local9.anInt2772;
		local9.anIntArray281 = new int[local48];
		@Pc(56) byte[] local56 = Static116.aByteArrayArray10[0];
		for (@Pc(58) int local58 = 0; local58 < local48; local58++) {
			local9.anIntArray281[local58] = Static40.anIntArray84[local56[local58] & 0xFF];
		}
		Static74.method676();
		return local9;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IB)Z")
	public static boolean method1142(@OriginalArg(0) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BILclient!nb;I)Lclient!we;")
	public static Class5_Sub1_Sub10_Sub4 method1143(@OriginalArg(1) int arg0, @OriginalArg(2) Class24 arg1, @OriginalArg(3) int arg2) {
		return Static6.method156(arg1, arg0, arg2) ? Static19.method489() : null;
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V")
	public static void method1144() {
		aClass71_833 = null;
		aClass71_832 = null;
		aClass71_824 = null;
		aClass71_831 = null;
		aClass71_830 = null;
		aClass5_Sub1_Sub10_Sub1Array7 = null;
		aClass71_828 = null;
		aClass71_825 = null;
		aClass71_826 = null;
		anIntArray206 = null;
		aClass71_827 = null;
		aClass71_829 = null;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IZ)V")
	public static void method1145(@OriginalArg(1) boolean arg0) {
		@Pc(7) int local7 = Static37.anInt594;
		if (arg0) {
			local7 = 1;
		}
		if (Static41.anInt1068 == Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2474 >> 7 && Static61.anInt1564 == Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.anInt2452 >> 7) {
			Static41.anInt1068 = 0;
		}
		for (@Pc(36) int local36 = 0; local36 < local7; local36++) {
			@Pc(46) Class5_Sub1_Sub1_Sub3_Sub2 local46;
			@Pc(52) int local52;
			if (arg0) {
				local52 = 33538048;
				local46 = Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1;
			} else {
				local46 = Static85.aClass5_Sub1_Sub1_Sub3_Sub2Array1[Static116.anIntArray285[local36]];
				local52 = Static116.anIntArray285[local36] << 14;
			}
			if (local46 != null && local46.method1680()) {
				local46.aBoolean106 = false;
				@Pc(72) int local72 = local46.anInt2474 >> 7;
				if ((Static21.aBoolean28 && Static37.anInt594 > 50 || Static37.anInt594 > 200) && !arg0 && local46.anInt2470 == local46.anInt2487) {
					local46.aBoolean106 = true;
				}
				@Pc(99) int local99 = local46.anInt2452 >> 7;
				if (local72 >= 0 && local72 < 104 && local99 >= 0 && local99 < 104) {
					if (local46.aClass5_Sub1_Sub1_Sub2_3 == null || local46.anInt2497 > Static95.anInt2285 || Static95.anInt2285 >= local46.anInt2516) {
						if ((local46.anInt2474 & 0x7F) == 64 && (local46.anInt2452 & 0x7F) == 64) {
							if (Static2.anIntArrayArray23[local72][local99] == Static91.anInt2117) {
								continue;
							}
							Static2.anIntArrayArray23[local72][local99] = Static91.anInt2117;
						}
						local46.anInt2509 = Static26.method989(local46.anInt2474, Static23.anInt728, local46.anInt2452);
						Static7.aClass43_1.method1094(Static23.anInt728, local46.anInt2474, local46.anInt2452, local46.anInt2509, 60, local46, local46.anInt2456, local52, local46.aBoolean105);
					} else {
						local46.aBoolean106 = false;
						local46.anInt2509 = Static26.method989(local46.anInt2474, Static23.anInt728, local46.anInt2452);
						Static7.aClass43_1.method1055(Static23.anInt728, local46.anInt2474, local46.anInt2452, local46.anInt2509, local46, local46.anInt2456, local52, local46.anInt2501, local46.anInt2519, local46.anInt2512, local46.anInt2499);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(III[B)Z")
	public static boolean method1146(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(14) int local14 = -1;
		@Pc(19) Class5_Sub11 local19 = new Class5_Sub11(arg2);
		label54: while (true) {
			@Pc(23) int local23 = local19.method1535();
			if (local23 == 0) {
				return local7;
			}
			local14 += local23;
			@Pc(34) int local34 = 0;
			@Pc(36) boolean local36 = false;
			while (true) {
				@Pc(44) int local44;
				while (!local36) {
					local44 = local19.method1535();
					if (local44 == 0) {
						continue label54;
					}
					local34 += local44 - 1;
					@Pc(75) int local75 = local34 >> 6 & 0x3F;
					@Pc(79) int local79 = arg1 + local75;
					@Pc(85) int local85 = local19.method1546() >> 2;
					@Pc(89) int local89 = local34 & 0x3F;
					@Pc(93) int local93 = arg0 + local89;
					if (local79 > 0 && local93 > 0 && local79 < 103 && local93 < 103) {
						@Pc(114) Class5_Sub1_Sub15 local114 = Static97.method1606(local14);
						if (local85 != 22 || !Static21.aBoolean28 || local114.anInt2576 != 0 || local114.aBoolean112) {
							if (!local114.method1704()) {
								local7 = false;
								Static97.anInt2317++;
							}
							local36 = true;
						}
					}
				}
				local44 = local19.method1535();
				if (local44 == 0) {
					break;
				}
				local19.method1546();
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "([Lclient!vc;Z)[Lclient!vc;")
	public static Class71[] method1147(@OriginalArg(0) Class71[] arg0) {
		@Pc(8) Class71[] local8 = new Class71[5];
		for (@Pc(19) int local19 = 0; local19 < 5; local19++) {
			local8[local19] = Static74.method677(new Class71[] { Static51.method962(local19), Static66.aClass71_822 });
			if (arg0 != null && arg0[local19] != null) {
				local8[local19] = Static74.method677(new Class71[] { local8[local19], arg0[local19] });
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(I)V")
	public static void method1148() {
		Static47.anInt1293 = 0;
		Static57.anInt1493 = 0;
		Static19.method488();
		Static85.method1393();
		Static5.method150();
		@Pc(23) int local23;
		for (@Pc(17) int local17 = 0; local17 < Static47.anInt1293; local17++) {
			local23 = Static27.anIntArray95[local17];
			if (Static106.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local23].anInt2469 != Static95.anInt2285) {
				Static106.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local23].aClass5_Sub1_Sub16_1 = null;
				Static106.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local23] = null;
			}
		}
		if (Static86.aClass5_Sub11_Sub1_12.anInt2233 != Static57.anInt1482) {
			throw new RuntimeException("gnp1 pos:" + Static86.aClass5_Sub11_Sub1_12.anInt2233 + " psize:" + Static57.anInt1482);
		}
		for (local23 = 0; local23 < Static90.anInt3005; local23++) {
			if (Static106.aClass5_Sub1_Sub1_Sub3_Sub1Array1[Static61.anIntArray175[local23]] == null) {
				throw new RuntimeException("gnp2 pos:" + local23 + " size:" + Static90.anInt3005);
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II)Lclient!vc;")
	public static Class71 method1149() {
		@Pc(7) Class71 local7 = new Class71();
		local7.aByteArray28 = new byte[100];
		local7.anInt2736 = 0;
		return local7;
	}
}
