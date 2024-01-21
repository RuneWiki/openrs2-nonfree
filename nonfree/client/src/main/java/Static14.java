import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!cd", name = "u", descriptor = "Lclient!oa;")
	public static Class7 aClass7_20;

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
	public static int anInt485 = 0;

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "Lclient!pb;")
	public static Class52 aClass52_3 = new Class52();

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "Lclient!vc;")
	private static Class71 aClass71_299 = Static38.method736("Loaded textures");

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "Lclient!vc;")
	public static Class71 aClass71_300 = Static38.method736("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!cd", name = "n", descriptor = "Lclient!vc;")
	public static Class71 aClass71_301 = aClass71_299;

	@OriginalMember(owner = "client!cd", name = "t", descriptor = "Lclient!vc;")
	public static Class71 aClass71_302 = Static38.method736(":chalreq:");

	@OriginalMember(owner = "client!cd", name = "v", descriptor = "I")
	public static int anInt496 = -1;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BLclient!me;)V")
	public static void method405(@OriginalArg(1) Class5_Sub1_Sub11 arg0) {
		@Pc(15) int local15 = arg0.anInt1760 >> 16;
		if (Static62.anInt1577 == local15 || local15 == Static7.anInt275) {
			Static68.aBoolean72 = true;
		}
		if (Static95.anInt2286 == local15 || Static26.anIntArray168[Static64.anInt2489] == local15) {
			Static28.aBoolean33 = true;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZB)V")
	public static void method406(@OriginalArg(0) boolean arg0) {
		Static33.aBoolean41 = arg0;
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(33) int local33;
		@Pc(39) int local39;
		@Pc(43) int local43;
		@Pc(75) int local75;
		@Pc(135) int local135;
		@Pc(143) int local143;
		@Pc(151) int local151;
		if (!Static33.aBoolean41) {
			local17 = Static86.aClass5_Sub11_Sub1_12.method1543();
			local21 = Static86.aClass5_Sub11_Sub1_12.method1502();
			local25 = Static86.aClass5_Sub11_Sub1_12.method1543();
			local33 = (Static57.anInt1482 - Static86.aClass5_Sub11_Sub1_12.anInt2233) / 16;
			Static17.anIntArrayArray7 = new int[local33][4];
			for (local39 = 0; local39 < local33; local39++) {
				for (local43 = 0; local43 < 4; local43++) {
					Static17.anIntArrayArray7[local39][local43] = Static86.aClass5_Sub11_Sub1_12.method1540();
				}
			}
			local43 = Static86.aClass5_Sub11_Sub1_12.method1543();
			local75 = Static86.aClass5_Sub11_Sub1_12.method1539();
			Static2.anIntArray230 = new int[local33];
			Static114.anIntArray278 = new int[local33];
			Static83.aByteArrayArray8 = new byte[local33][];
			Static111.aByteArrayArray4 = new byte[local33][];
			@Pc(89) boolean local89 = false;
			Static30.anIntArray98 = new int[local33];
			local33 = 0;
			if ((local43 / 8 == 48 || local43 / 8 == 49) && local17 / 8 == 48) {
				local89 = true;
			}
			if (local43 / 8 == 48 && local17 / 8 == 148) {
				local89 = true;
			}
			for (local135 = (local43 - 6) / 8; local135 <= (local43 + 6) / 8; local135++) {
				for (local143 = (local17 - 6) / 8; local143 <= (local17 + 6) / 8; local143++) {
					local151 = local143 + (local135 << 8);
					if (!local89 || local143 != 49 && local143 != 149 && local143 != 147 && local135 != 50 && (local135 != 49 || local143 != 47)) {
						Static114.anIntArray278[local33] = local151;
						Static2.anIntArray230[local33] = Static18.aClass24_Sub1_5.method650(Static74.method677(new Class71[] { Static107.aClass71_1252, Static51.method962(local135), Static8.aClass71_208, Static51.method962(local143) }));
						Static30.anIntArray98[local33] = Static18.aClass24_Sub1_5.method650(Static74.method677(new Class71[] { Static59.aClass71_774, Static51.method962(local135), Static8.aClass71_208, Static51.method962(local143) }));
						local33++;
					}
				}
			}
			Static17.method483(local25, local17, local21, local43, local75);
			return;
		}
		Static86.aClass5_Sub11_Sub1_12.method1556();
		for (local17 = 0; local17 < 4; local17++) {
			for (local21 = 0; local21 < 13; local21++) {
				for (local25 = 0; local25 < 13; local25++) {
					local33 = Static86.aClass5_Sub11_Sub1_12.method1555(1);
					if (local33 == 1) {
						Static77.anIntArrayArrayArray6[local17][local21][local25] = Static86.aClass5_Sub11_Sub1_12.method1555(26);
					} else {
						Static77.anIntArrayArrayArray6[local17][local21][local25] = -1;
					}
				}
			}
		}
		Static86.aClass5_Sub11_Sub1_12.method1562();
		local21 = (Static57.anInt1482 - Static86.aClass5_Sub11_Sub1_12.anInt2233) / 16;
		Static17.anIntArrayArray7 = new int[local21][4];
		for (local25 = 0; local25 < local21; local25++) {
			for (local33 = 0; local33 < 4; local33++) {
				Static17.anIntArrayArray7[local25][local33] = Static86.aClass5_Sub11_Sub1_12.method1513();
			}
		}
		local33 = Static86.aClass5_Sub11_Sub1_12.method1539();
		local39 = Static86.aClass5_Sub11_Sub1_12.method1539();
		local43 = Static86.aClass5_Sub11_Sub1_12.method1549();
		local75 = Static86.aClass5_Sub11_Sub1_12.method1543();
		@Pc(398) int local398 = Static86.aClass5_Sub11_Sub1_12.method1502();
		Static30.anIntArray98 = new int[local21];
		Static2.anIntArray230 = new int[local21];
		Static114.anIntArray278 = new int[local21];
		Static111.aByteArrayArray4 = new byte[local21][];
		Static83.aByteArrayArray8 = new byte[local21][];
		local21 = 0;
		for (local135 = 0; local135 < 4; local135++) {
			for (local143 = 0; local143 < 13; local143++) {
				for (local151 = 0; local151 < 13; local151++) {
					@Pc(435) int local435 = Static77.anIntArrayArrayArray6[local135][local143][local151];
					if (local435 != -1) {
						@Pc(445) int local445 = local435 >> 14 & 0x3FF;
						@Pc(451) int local451 = local435 >> 3 & 0x7FF;
						@Pc(462) int local462 = (local445 / 8 << 8) + (local451 / 8);
						for (@Pc(464) int local464 = 0; local464 < local21; local464++) {
							if (Static114.anIntArray278[local464] == local462) {
								local462 = -1;
								break;
							}
						}
						if (local462 != -1) {
							@Pc(492) int local492 = local462 >> 8 & 0xFF;
							Static114.anIntArray278[local21] = local462;
							@Pc(500) int local500 = local462 & 0xFF;
							Static2.anIntArray230[local21] = Static18.aClass24_Sub1_5.method650(Static74.method677(new Class71[] { Static107.aClass71_1252, Static51.method962(local492), Static8.aClass71_208, Static51.method962(local500) }));
							Static30.anIntArray98[local21] = Static18.aClass24_Sub1_5.method650(Static74.method677(new Class71[] { Static59.aClass71_774, Static51.method962(local492), Static8.aClass71_208, Static51.method962(local500) }));
							local21++;
						}
					}
				}
			}
		}
		Static17.method483(local39, local43, local398, local75, local33);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZLclient!nb;Lclient!nb;)I")
	public static int method407(@OriginalArg(1) Class24 arg0, @OriginalArg(2) Class24 arg1) {
		@Pc(12) int local12 = 0;
		if (arg1.method670(Static118.aClass71_1378, Static98.aClass71_947)) {
			local12++;
		}
		if (arg0.method670(Static87.aClass71_1025, Static98.aClass71_947)) {
			local12++;
		}
		if (arg0.method670(Static117.aClass71_1358, Static98.aClass71_947)) {
			local12++;
		}
		if (arg0.method670(Static100.aClass71_1172, Static98.aClass71_947)) {
			local12++;
		}
		if (arg0.method670(Static71.aClass71_857, Static98.aClass71_947)) {
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIIII)V")
	public static void method408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < 1 || arg6 < 1 || arg0 > 102 || arg6 > 102) {
			return;
		}
		if (Static21.aBoolean28 && arg5 != Static23.anInt728) {
			return;
		}
		@Pc(27) int local27 = 0;
		if (arg1 == 0) {
			local27 = Static7.aClass43_1.method1072(arg5, arg0, arg6);
		}
		if (arg1 == 1) {
			local27 = Static7.aClass43_1.method1068(arg5, arg0, arg6);
		}
		if (arg1 == 2) {
			local27 = Static7.aClass43_1.method1079(arg5, arg0, arg6);
		}
		if (arg1 == 3) {
			local27 = Static7.aClass43_1.method1098(arg5, arg0, arg6);
		}
		@Pc(93) int local93;
		if (local27 != 0) {
			@Pc(86) int local86 = local27 >> 14 & 0x7FFF;
			local93 = Static7.aClass43_1.method1059(arg5, arg0, arg6, local27);
			@Pc(97) int local97 = local93 & 0x1F;
			@Pc(103) int local103 = local93 >> 6 & 0x3;
			@Pc(114) Class5_Sub1_Sub15 local114;
			if (arg1 == 0) {
				Static7.aClass43_1.method1093(arg5, arg0, arg6);
				local114 = Static97.method1606(local86);
				if (local114.aBoolean111) {
					Static111.aClass33Array3[arg5].method941(arg6, local114.aBoolean109, local97, local103, arg0);
				}
			}
			if (arg1 == 1) {
				Static7.aClass43_1.method1073(arg5, arg0, arg6);
			}
			if (arg1 == 2) {
				Static7.aClass43_1.method1102(arg5, arg0, arg6);
				local114 = Static97.method1606(local86);
				if (local114.anInt2559 + arg0 > 103 || local114.anInt2559 + arg6 > 103 || local114.anInt2572 + arg0 > 103 || arg6 + local114.anInt2572 > 103) {
					return;
				}
				if (local114.aBoolean111) {
					Static111.aClass33Array3[arg5].method947(arg6, local114.anInt2572, arg0, local114.aBoolean109, local103, local114.anInt2559);
				}
			}
			if (arg1 == 3) {
				Static7.aClass43_1.method1076(arg5, arg0, arg6);
				local114 = Static97.method1606(local86);
				if (local114.aBoolean111 && local114.anInt2576 == 1) {
					Static111.aClass33Array3[arg5].method945(arg0, arg6);
				}
			}
		}
		if (arg2 < 0) {
			return;
		}
		local93 = arg5;
		if (arg5 < 3 && (Static59.aByteArrayArrayArray2[1][arg0][arg6] & 0x2) == 2) {
			local93 = arg5 + 1;
		}
		Static103.method1652(arg0, arg4, Static7.aClass43_1, arg3, Static111.aClass33Array3[arg5], arg2, arg6, local93, arg5);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILclient!vc;)Z")
	public static boolean method409(@OriginalArg(1) Class71 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static68.anInt1685; local16++) {
			if (arg0.method1785(Static81.aClass71Array13[local16])) {
				return true;
			}
		}
		return arg0.method1785(Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.aClass71_1236);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
	public static void method410() {
		aClass71_302 = null;
		aClass71_299 = null;
		aClass71_301 = null;
		aClass7_20 = null;
		aClass71_300 = null;
		aClass52_3 = null;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V")
	public static void method411() {
		Static42.anInt1083 = 0;
		Static66.anInt1647 = 0;
		Static57.anInt1482 = 0;
		Static61.aClass5_Sub11_Sub1_8.anInt2233 = 0;
		Static40.anInt716 = 0;
		Static8.anInt283 = -1;
		Static86.aClass5_Sub11_Sub1_12.anInt2233 = 0;
		Static41.anInt1068 = 0;
		Static38.anInt1019 = -1;
		Static49.anInt1394 = 0;
		Static65.aBoolean71 = false;
		Static51.anInt1421 = -1;
		Static92.anInt2246 = -1;
		for (@Pc(42) int local42 = 0; local42 < Static85.aClass5_Sub1_Sub1_Sub3_Sub2Array1.length; local42++) {
			if (Static85.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local42] != null) {
				Static85.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local42].anInt2436 = -1;
			}
		}
		for (@Pc(64) int local64 = 0; local64 < Static106.aClass5_Sub1_Sub1_Sub3_Sub1Array1.length; local64++) {
			if (Static106.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local64] != null) {
				Static106.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local64].anInt2436 = -1;
			}
		}
		Static50.method956();
		Static27.method571(30);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZ)V")
	public static void method412(@OriginalArg(0) int arg0) {
		Static64.anInt2488 += arg0;
		while (Static72.anInt1825 <= Static64.anInt2488) {
			Static64.anInt2488 -= Static72.anInt1825;
			Static94.anInt2271 -= Static94.anInt2271 >> 2;
		}
		Static94.anInt2271 -= arg0 * 1000;
		if (Static94.anInt2271 < 0) {
			Static94.anInt2271 = 0;
		}
	}
}
