import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!db", name = "ob", descriptor = "[I")
	public static int[] anIntArray116;

	@OriginalMember(owner = "client!db", name = "sb", descriptor = "I")
	public static int anInt801;

	@OriginalMember(owner = "client!db", name = "pb", descriptor = "[I")
	public static int[] anIntArray117 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!db", name = "ub", descriptor = "Lclient!kd;")
	private static Class39 aClass39_400 = Static108.method1915("Your friendlist is full)3 Max of 100 for free users)1 and 200 for members");

	@OriginalMember(owner = "client!db", name = "qb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_399 = aClass39_400;

	@OriginalMember(owner = "client!db", name = "xb", descriptor = "I")
	public static int anInt805 = -1;

	@OriginalMember(owner = "client!db", name = "Ab", descriptor = "Lclient!kd;")
	public static Class39 aClass39_401 = Static108.method1915("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!db", name = "Bb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_402 = null;

	@OriginalMember(owner = "client!db", name = "Eb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_403 = Static108.method1915("AUS");

	@OriginalMember(owner = "client!db", name = "Fb", descriptor = "I")
	public static int anInt810 = 0;

	@OriginalMember(owner = "client!db", name = "Gb", descriptor = "I")
	public static int anInt811 = -1;

	@OriginalMember(owner = "client!db", name = "Hb", descriptor = "I")
	public static int anInt812 = 0;

	@OriginalMember(owner = "client!db", name = "Ib", descriptor = "I")
	public static int anInt813 = -1;

	@OriginalMember(owner = "client!db", name = "d", descriptor = "(B)V")
	public static void method447() {
		@Pc(9) int local9 = Static53.aClass1_Sub1_Sub4_Sub3_1.method755(Static36.aClass39_503);
		@Pc(24) int local24;
		for (@Pc(16) int local16 = 0; local16 < Static110.anInt2795; local16++) {
			local24 = Static53.aClass1_Sub1_Sub4_Sub3_1.method755(Static50.aClass39Array13[local16]);
			if (local9 < local24) {
				local9 = local24;
			}
		}
		local9 += 8;
		local24 = Static110.anInt2795 * 15 + 21;
		@Pc(60) int local60;
		@Pc(53) int local53;
		if (Static72.anInt1798 != -1) {
			Static46.anInt2774 = 0;
			Static13.aBoolean47 = true;
			local53 = Static38.anInt1157;
			local60 = Static89.anInt2109 - local9 / 2;
			if (local9 + local60 > 765) {
				local60 = 765 - local9;
			}
			Static108.anInt2712 = local9;
			if (local60 < 0) {
				local60 = 0;
			}
			if (local24 + local53 > 503) {
				local53 = 503 - local24;
			}
			if (local53 < 0) {
				local53 = 0;
			}
			Static122.anInt2971 = Static110.anInt2795 * 15 + 22;
			Static36.anInt1081 = local60;
			Static89.anInt2108 = local53;
		} else if (Static89.anInt2109 > 4 && Static38.anInt1157 > 4 && Static89.anInt2109 < 516 && Static38.anInt1157 < 338) {
			Static108.anInt2712 = local9;
			local60 = Static89.anInt2109 - local9 / 2 - 4;
			local53 = Static38.anInt1157 - 4;
			if (local9 + local60 > 512) {
				local60 = 512 - local9;
			}
			Static13.aBoolean47 = true;
			Static46.anInt2774 = 0;
			if (local24 + local53 > 334) {
				local53 = 334 - local24;
			}
			if (local60 < 0) {
				local60 = 0;
			}
			Static36.anInt1081 = local60;
			Static122.anInt2971 = Static110.anInt2795 * 15 + 22;
			if (local53 < 0) {
				local53 = 0;
			}
			Static89.anInt2108 = local53;
		} else if (Static89.anInt2109 > 553 && Static38.anInt1157 > 205 && Static89.anInt2109 < 743 && Static38.anInt1157 < 466) {
			Static46.anInt2774 = 1;
			Static122.anInt2971 = Static110.anInt2795 * 15 + 22;
			Static108.anInt2712 = local9;
			Static13.aBoolean47 = true;
			local60 = Static89.anInt2109 - local9 / 2 - 553;
			if (local60 < 0) {
				local60 = 0;
			} else if (local9 + local60 > 190) {
				local60 = 190 - local9;
			}
			local53 = Static38.anInt1157 - 205;
			Static36.anInt1081 = local60;
			if (local53 < 0) {
				local53 = 0;
			} else if (local53 + local24 > 261) {
				local53 = 261 - local24;
			}
			Static89.anInt2108 = local53;
		} else if (Static89.anInt2109 > 17 && Static38.anInt1157 > 357 && Static89.anInt2109 < 496 && Static38.anInt1157 < 453) {
			Static13.aBoolean47 = true;
			local60 = Static89.anInt2109 - local9 / 2 - 17;
			Static108.anInt2712 = local9;
			if (local60 < 0) {
				local60 = 0;
			} else if (local60 + local9 > 479) {
				local60 = 479 - local9;
			}
			Static46.anInt2774 = 2;
			Static122.anInt2971 = Static110.anInt2795 * 15 + 22;
			local53 = Static38.anInt1157 - 357;
			if (local53 < 0) {
				local53 = 0;
			} else if (local24 + local53 > 96) {
				local53 = 96 - local24;
			}
			Static36.anInt1081 = local60;
			Static89.anInt2108 = local53;
		}
	}

	@OriginalMember(owner = "client!db", name = "e", descriptor = "(B)V")
	public static void method448() {
		Static94.anInt2224 = 0;
		Static53.anInt1465 = 0;
		Static32.method401();
		Static37.method671();
		Static68.method1217();
		Static51.method881();
		@Pc(27) int local27;
		for (@Pc(21) int local21 = 0; local21 < Static53.anInt1465; local21++) {
			local27 = Static79.anIntArray384[local21];
			if (Static45.anInt1256 != Static38.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local27].anInt2514) {
				Static38.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local27] = null;
			}
		}
		if (Static72.anInt1801 != Static79.aClass1_Sub18_Sub1_3.anInt3078) {
			throw new RuntimeException("gpp1 pos:" + Static79.aClass1_Sub18_Sub1_3.anInt3078 + " psize:" + Static72.anInt1801);
		}
		for (local27 = 0; local27 < Static57.anInt1547; local27++) {
			if (Static38.aClass1_Sub1_Sub2_Sub1_Sub2Array1[Static12.anIntArray91[local27]] == null) {
				throw new RuntimeException("gpp2 pos:" + local27 + " size:" + Static57.anInt1547);
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "([I[IIII[Lclient!wc;)V")
	public static void method449(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class80[] arg4) {
		if (arg2 <= arg3) {
			return;
		}
		@Pc(8) int local8 = arg3 - 1;
		@Pc(12) int local12 = arg2 + 1;
		@Pc(18) int local18 = (arg3 + arg2) / 2;
		@Pc(22) Class80 local22 = arg4[local18];
		arg4[local18] = arg4[arg3];
		arg4[arg3] = local22;
		while (local8 < local12) {
			@Pc(36) boolean local36 = true;
			@Pc(39) int local39;
			@Pc(56) int local56;
			@Pc(51) int local51;
			do {
				local12--;
				for (local39 = 0; local39 < 4; local39++) {
					if (arg1[local39] == 2) {
						local51 = local22.anInt3154;
						local56 = arg4[local12].anInt3154;
					} else if (arg1[local39] == 1) {
						local51 = local22.anInt3149;
						if (local51 == -1 && arg0[local39] == 1) {
							local51 = 2001;
						}
						local56 = arg4[local12].anInt3149;
						if (local56 == -1 && arg0[local39] == 1) {
							local56 = 2001;
						}
					} else if (arg1[local39] == 3) {
						local56 = arg4[local12].aBoolean253 ? 1 : 0;
						local51 = local22.aBoolean253 ? 1 : 0;
					} else {
						local51 = local22.anInt3153;
						local56 = arg4[local12].anInt3153;
					}
					if (local51 != local56) {
						if ((arg0[local39] != 1 || local56 <= local51) && (arg0[local39] != 0 || local56 >= local51)) {
							local36 = false;
						}
						break;
					}
					if (local39 == 3) {
						local36 = false;
					}
				}
			} while (local36);
			local36 = true;
			do {
				local8++;
				for (local39 = 0; local39 < 4; local39++) {
					if (arg1[local39] == 2) {
						local56 = arg4[local8].anInt3154;
						local51 = local22.anInt3154;
					} else if (arg1[local39] == 1) {
						local56 = arg4[local8].anInt3149;
						if (local56 == -1 && arg0[local39] == 1) {
							local56 = 2001;
						}
						local51 = local22.anInt3149;
						if (local51 == -1 && arg0[local39] == 1) {
							local51 = 2001;
						}
					} else if (arg1[local39] == 3) {
						local51 = local22.aBoolean253 ? 1 : 0;
						local56 = arg4[local8].aBoolean253 ? 1 : 0;
					} else {
						local51 = local22.anInt3153;
						local56 = arg4[local8].anInt3153;
					}
					if (local56 != local51) {
						if ((arg0[local39] != 1 || local56 >= local51) && (arg0[local39] != 0 || local56 <= local51)) {
							local36 = false;
						}
						break;
					}
					if (local39 == 3) {
						local36 = false;
					}
				}
			} while (local36);
			if (local12 > local8) {
				@Pc(329) Class80 local329 = arg4[local8];
				arg4[local8] = arg4[local12];
				arg4[local12] = local329;
			}
		}
		method449(arg0, arg1, local12, arg3, arg4);
		method449(arg0, arg1, arg2, local12 + 1, arg4);
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(Z)V")
	public static void method450() {
		Static94.aClass33_33.method1034();
	}

	@OriginalMember(owner = "client!db", name = "e", descriptor = "(I)V")
	public static void method451() {
		anIntArray117 = null;
		aClass39_401 = null;
		aClass39_402 = null;
		aClass39_400 = null;
		aClass39_403 = null;
		anIntArray116 = null;
		aClass39_399 = null;
	}
}
