import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!i", name = "xb", descriptor = "[Lclient!ae;")
	public static Class2_Sub2_Sub1_Sub1[] aClass2_Sub2_Sub1_Sub1Array6;

	@OriginalMember(owner = "client!i", name = "Cb", descriptor = "[I")
	public static int[] anIntArray136;

	@OriginalMember(owner = "client!i", name = "Hb", descriptor = "I")
	public static int anInt1147;

	@OriginalMember(owner = "client!i", name = "Kb", descriptor = "Lclient!u;")
	private static Class74 aClass74_837 = Static72.method1077(" ");

	@OriginalMember(owner = "client!i", name = "tb", descriptor = "Lclient!u;")
	public static Class74 aClass74_834 = aClass74_837;

	@OriginalMember(owner = "client!i", name = "zb", descriptor = "Lclient!u;")
	public static Class74 aClass74_835 = Static72.method1077("@gr1@");

	@OriginalMember(owner = "client!i", name = "Db", descriptor = "I")
	public static volatile int anInt1145 = 0;

	@OriginalMember(owner = "client!i", name = "Fb", descriptor = "Lclient!u;")
	public static Class74 aClass74_836 = Static72.method1077("Konfig geladen)3");

	@OriginalMember(owner = "client!i", name = "Ob", descriptor = "Lclient!u;")
	public static Class74 aClass74_838 = Static72.method1077("@cr1@");

	@OriginalMember(owner = "client!i", name = "Qb", descriptor = "Lclient!u;")
	public static Class74 aClass74_839 = Static72.method1077("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <AUS>");

	@OriginalMember(owner = "client!i", name = "Rb", descriptor = "Lclient!u;")
	public static Class74 aClass74_840 = Static72.method1077("Chat panel redrawn");

	@OriginalMember(owner = "client!i", name = "Yb", descriptor = "I")
	public static int anInt1154 = 1;

	@OriginalMember(owner = "client!i", name = "bc", descriptor = "I")
	public static int anInt1157 = 0;

	@OriginalMember(owner = "client!i", name = "ec", descriptor = "Lclient!u;")
	public static Class74 aClass74_841 = Static72.method1077(")4lang)4de");

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII[BII[Lclient!ob;Lclient!sd;II)V")
	public static void method789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class55[] arg6, @OriginalArg(8) Class69 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(15) Class2_Sub10 local15 = new Class2_Sub10(arg4);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local15.method1484();
			if (local21 == 0) {
				return;
			}
			@Pc(28) int local28 = 0;
			local17 += local21;
			while (true) {
				@Pc(36) int local36 = local15.method1484();
				if (local36 == 0) {
					break;
				}
				local28 += local36 - 1;
				@Pc(53) int local53 = local28 >> 6 & 0x3F;
				@Pc(57) int local57 = local28 >> 12;
				@Pc(63) int local63 = local15.method1514();
				@Pc(67) int local67 = local63 & 0x3;
				@Pc(71) int local71 = local28 & 0x3F;
				@Pc(75) int local75 = local63 >> 2;
				if (local57 == arg8 && local53 >= arg9 && arg9 + 8 > local53 && local71 >= arg5 && local71 < arg5 + 8) {
					@Pc(114) Class2_Sub2_Sub14 local114 = Static2.method19(local17);
					@Pc(131) int local131 = Static12.method275(local67, arg0, local114.anInt2279, local71 & 0x7, local53 & 0x7, local114.anInt2259) + arg1;
					@Pc(150) int local150 = arg3 + Static119.method1757(local114.anInt2259, local53 & 0x7, arg0, local114.anInt2279, local67, local71 & 0x7);
					if (local131 > 0 && local150 > 0 && local131 < 103 && local150 < 103) {
						@Pc(170) Class55 local170 = null;
						@Pc(172) int local172 = arg2;
						if ((Static17.aByteArrayArrayArray1[1][local131][local150] & 0x2) == 2) {
							local172 = arg2 - 1;
						}
						if (local172 >= 0) {
							local170 = arg6[local172];
						}
						Static88.method1309(arg7, arg0 + local67 & 0x3, local150, arg2, local131, local170, local75, local17);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "f", descriptor = "(I)V")
	public static void method791() {
		anIntArray136 = null;
		aClass2_Sub2_Sub1_Sub1Array6 = null;
		aClass74_840 = null;
		aClass74_837 = null;
		aClass74_836 = null;
		aClass74_838 = null;
		aClass74_841 = null;
		aClass74_839 = null;
		aClass74_835 = null;
		aClass74_834 = null;
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(II)Z")
	public static boolean method792(@OriginalArg(0) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IZ)V")
	public static void method793(@OriginalArg(1) boolean arg0) {
		Static38.aBoolean33 = arg0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(43) int local43;
		@Pc(49) int local49;
		@Pc(53) int local53;
		@Pc(133) int local133;
		@Pc(141) int local141;
		@Pc(150) int local150;
		if (!Static38.aBoolean33) {
			local21 = Static19.aClass2_Sub10_Sub1_1.method1503();
			local25 = Static19.aClass2_Sub10_Sub1_1.method1506();
			local31 = Static19.aClass2_Sub10_Sub1_1.method1522();
			local35 = Static19.aClass2_Sub10_Sub1_1.method1517();
			local43 = (Static16.anInt463 - Static19.aClass2_Sub10_Sub1_1.anInt2187) / 16;
			Static3.anIntArrayArray1 = new int[local43][4];
			for (local49 = 0; local49 < local43; local49++) {
				for (local53 = 0; local53 < 4; local53++) {
					Static3.anIntArrayArray1[local49][local53] = Static19.aClass2_Sub10_Sub1_1.method1502();
				}
			}
			local53 = Static19.aClass2_Sub10_Sub1_1.method1525();
			Static56.aByteArrayArray4 = new byte[local43][];
			Static120.anIntArray370 = new int[local43];
			Static57.aByteArrayArray5 = new byte[local43][];
			Static93.anIntArray274 = new int[local43];
			@Pc(91) boolean local91 = false;
			if ((local53 / 8 == 48 || local53 / 8 == 49) && local31 / 8 == 48) {
				local91 = true;
			}
			if (local53 / 8 == 48 && local31 / 8 == 148) {
				local91 = true;
			}
			Static57.anIntArray158 = new int[local43];
			local43 = 0;
			for (local133 = (local53 - 6) / 8; local133 <= (local53 + 6) / 8; local133++) {
				for (local141 = (local31 - 6) / 8; local141 <= (local31 + 6) / 8; local141++) {
					local150 = (local133 << 8) + local141;
					if (!local91 || local141 != 49 && local141 != 149 && local141 != 147 && local133 != 50 && (local133 != 49 || local141 != 47)) {
						Static120.anIntArray370[local43] = local150;
						Static93.anIntArray274[local43] = Static121.aClass26_Sub1_71.method1351(Static91.method1340(new Class74[] { Static29.aClass74_533, Static56.method940(local133), Static112.aClass74_1542, Static56.method940(local141) }));
						Static57.anIntArray158[local43] = Static121.aClass26_Sub1_71.method1351(Static91.method1340(new Class74[] { Static23.aClass74_503, Static56.method940(local133), Static112.aClass74_1542, Static56.method940(local141) }));
						local43++;
					}
				}
			}
			Static15.method353(local21, local35, local53, local31, local25);
			return;
		}
		local21 = Static19.aClass2_Sub10_Sub1_1.method1525();
		local25 = Static19.aClass2_Sub10_Sub1_1.method1522();
		local31 = Static19.aClass2_Sub10_Sub1_1.method1506();
		local35 = Static19.aClass2_Sub10_Sub1_1.method1503();
		Static19.aClass2_Sub10_Sub1_1.method1540();
		@Pc(317) int local317;
		for (local43 = 0; local43 < 4; local43++) {
			for (local49 = 0; local49 < 13; local49++) {
				for (local53 = 0; local53 < 13; local53++) {
					local317 = Static19.aClass2_Sub10_Sub1_1.method1538(1);
					if (local317 == 1) {
						Static46.anIntArrayArrayArray1[local43][local49][local53] = Static19.aClass2_Sub10_Sub1_1.method1538(26);
					} else {
						Static46.anIntArrayArrayArray1[local43][local49][local53] = -1;
					}
				}
			}
		}
		Static19.aClass2_Sub10_Sub1_1.method1537();
		local49 = (Static16.anInt463 - Static19.aClass2_Sub10_Sub1_1.anInt2187) / 16;
		Static3.anIntArrayArray1 = new int[local49][4];
		for (local53 = 0; local53 < local49; local53++) {
			for (local317 = 0; local317 < 4; local317++) {
				Static3.anIntArrayArray1[local53][local317] = Static19.aClass2_Sub10_Sub1_1.method1527();
			}
		}
		local317 = Static19.aClass2_Sub10_Sub1_1.method1525();
		Static93.anIntArray274 = new int[local49];
		Static120.anIntArray370 = new int[local49];
		Static57.aByteArrayArray5 = new byte[local49][];
		Static57.anIntArray158 = new int[local49];
		Static56.aByteArrayArray4 = new byte[local49][];
		local49 = 0;
		for (local133 = 0; local133 < 4; local133++) {
			for (local141 = 0; local141 < 13; local141++) {
				for (local150 = 0; local150 < 13; local150++) {
					@Pc(440) int local440 = Static46.anIntArrayArrayArray1[local133][local141][local150];
					if (local440 != -1) {
						@Pc(450) int local450 = local440 >> 14 & 0x3FF;
						@Pc(456) int local456 = local440 >> 3 & 0x7FF;
						@Pc(466) int local466 = local456 / 8 + (local450 / 8 << 8);
						for (@Pc(468) int local468 = 0; local468 < local49; local468++) {
							if (local466 == Static120.anIntArray370[local468]) {
								local466 = -1;
								break;
							}
						}
						if (local466 != -1) {
							@Pc(497) int local497 = local466 >> 8 & 0xFF;
							Static120.anIntArray370[local49] = local466;
							@Pc(505) int local505 = local466 & 0xFF;
							Static93.anIntArray274[local49] = Static121.aClass26_Sub1_71.method1351(Static91.method1340(new Class74[] { Static29.aClass74_533, Static56.method940(local497), Static112.aClass74_1542, Static56.method940(local505) }));
							Static57.anIntArray158[local49] = Static121.aClass26_Sub1_71.method1351(Static91.method1340(new Class74[] { Static23.aClass74_503, Static56.method940(local497), Static112.aClass74_1542, Static56.method940(local505) }));
							local49++;
						}
					}
				}
			}
		}
		Static15.method353(local35, local317, local21, local31, local25);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIZIIIIIIIZI)Z")
	public static boolean method794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				Static63.anIntArrayArray11[local7][local11] = 0;
				Static5.anIntArrayArray2[local7][local11] = 99999999;
			}
		}
		local11 = arg10;
		@Pc(39) int local39 = arg9;
		@Pc(41) byte local41 = 0;
		Static63.anIntArrayArray11[arg10][arg9] = 99;
		Static5.anIntArrayArray2[arg10][arg9] = 0;
		Static119.anIntArray368[0] = arg10;
		@Pc(59) int local59 = 0;
		@Pc(62) int local62 = local41 + 1;
		Static85.anIntArray258[0] = arg9;
		@Pc(69) int[][] local69 = Static50.aClass55Array1[Static117.anInt2529].anIntArrayArray18;
		@Pc(71) boolean local71 = false;
		@Pc(74) int local74 = Static119.anIntArray368.length;
		@Pc(188) int local188;
		while (local59 != local62) {
			local11 = Static119.anIntArray368[local59];
			local39 = Static85.anIntArray258[local59];
			local59 = (local59 + 1) % local74;
			if (local11 == arg6 && arg4 == local39) {
				local71 = true;
				break;
			}
			if (arg3 != 0) {
				if ((arg3 < 5 || arg3 == 10) && Static50.aClass55Array1[Static117.anInt2529].method1279(arg4, local39, arg5, local11, arg3 - 1, arg6)) {
					local71 = true;
					break;
				}
				if (arg3 < 10 && Static50.aClass55Array1[Static117.anInt2529].method1273(arg5, local39, arg4, local11, arg3 - 1, arg6)) {
					local71 = true;
					break;
				}
			}
			if (arg8 != 0 && arg1 != 0 && Static50.aClass55Array1[Static117.anInt2529].method1281(arg4, local11, arg6, arg1, arg7, arg8, local39)) {
				local71 = true;
				break;
			}
			local188 = Static5.anIntArrayArray2[local11][local39] + 1;
			if (local11 > 0 && Static63.anIntArrayArray11[local11 - 1][local39] == 0 && (local69[local11 - 1][local39] & 0x12C0108) == 0) {
				Static119.anIntArray368[local62] = local11 - 1;
				Static85.anIntArray258[local62] = local39;
				Static63.anIntArrayArray11[local11 - 1][local39] = 2;
				local62 = (local62 + 1) % local74;
				Static5.anIntArrayArray2[local11 - 1][local39] = local188;
			}
			if (local11 < 103 && Static63.anIntArrayArray11[local11 + 1][local39] == 0 && (local69[local11 + 1][local39] & 0x12C0180) == 0) {
				Static119.anIntArray368[local62] = local11 + 1;
				Static85.anIntArray258[local62] = local39;
				local62 = (local62 + 1) % local74;
				Static63.anIntArrayArray11[local11 + 1][local39] = 8;
				Static5.anIntArrayArray2[local11 + 1][local39] = local188;
			}
			if (local39 > 0 && Static63.anIntArrayArray11[local11][local39 - 1] == 0 && (local69[local11][local39 - 1] & 0x12C0102) == 0) {
				Static119.anIntArray368[local62] = local11;
				Static85.anIntArray258[local62] = local39 - 1;
				Static63.anIntArrayArray11[local11][local39 - 1] = 1;
				Static5.anIntArrayArray2[local11][local39 - 1] = local188;
				local62 = (local62 + 1) % local74;
			}
			if (local39 < 103 && Static63.anIntArrayArray11[local11][local39 + 1] == 0 && (local69[local11][local39 + 1] & 0x12C0120) == 0) {
				Static119.anIntArray368[local62] = local11;
				Static85.anIntArray258[local62] = local39 + 1;
				Static63.anIntArrayArray11[local11][local39 + 1] = 4;
				local62 = (local62 + 1) % local74;
				Static5.anIntArrayArray2[local11][local39 + 1] = local188;
			}
			if (local11 > 0 && local39 > 0 && Static63.anIntArrayArray11[local11 - 1][local39 - 1] == 0 && (local69[local11 - 1][local39 - 1] & 0x12C010E) == 0 && (local69[local11 - 1][local39] & 0x12C0108) == 0 && (local69[local11][local39 - 1] & 0x12C0102) == 0) {
				Static119.anIntArray368[local62] = local11 - 1;
				Static85.anIntArray258[local62] = local39 - 1;
				local62 = (local62 + 1) % local74;
				Static63.anIntArrayArray11[local11 - 1][local39 - 1] = 3;
				Static5.anIntArrayArray2[local11 - 1][local39 - 1] = local188;
			}
			if (local11 < 103 && local39 > 0 && Static63.anIntArrayArray11[local11 + 1][local39 - 1] == 0 && (local69[local11 + 1][local39 - 1] & 0x12C0183) == 0 && (local69[local11 + 1][local39] & 0x12C0180) == 0 && (local69[local11][local39 - 1] & 0x12C0102) == 0) {
				Static119.anIntArray368[local62] = local11 + 1;
				Static85.anIntArray258[local62] = local39 - 1;
				local62 = (local62 + 1) % local74;
				Static63.anIntArrayArray11[local11 + 1][local39 - 1] = 9;
				Static5.anIntArrayArray2[local11 + 1][local39 - 1] = local188;
			}
			if (local11 > 0 && local39 < 103 && Static63.anIntArrayArray11[local11 - 1][local39 + 1] == 0 && (local69[local11 - 1][local39 + 1] & 0x12C0138) == 0 && (local69[local11 - 1][local39] & 0x12C0108) == 0 && (local69[local11][local39 + 1] & 0x12C0120) == 0) {
				Static119.anIntArray368[local62] = local11 - 1;
				Static85.anIntArray258[local62] = local39 + 1;
				local62 = (local62 + 1) % local74;
				Static63.anIntArrayArray11[local11 - 1][local39 + 1] = 6;
				Static5.anIntArrayArray2[local11 - 1][local39 + 1] = local188;
			}
			if (local11 < 103 && local39 < 103 && Static63.anIntArrayArray11[local11 + 1][local39 + 1] == 0 && (local69[local11 + 1][local39 + 1] & 0x12C01E0) == 0 && (local69[local11 + 1][local39] & 0x12C0180) == 0 && (local69[local11][local39 + 1] & 0x12C0120) == 0) {
				Static119.anIntArray368[local62] = local11 + 1;
				Static85.anIntArray258[local62] = local39 + 1;
				Static63.anIntArrayArray11[local11 + 1][local39 + 1] = 12;
				Static5.anIntArrayArray2[local11 + 1][local39 + 1] = local188;
				local62 = (local62 + 1) % local74;
			}
		}
		Static85.anInt1830 = 0;
		@Pc(803) int local803;
		@Pc(808) int local808;
		@Pc(815) int local815;
		if (!local71) {
			if (!arg2) {
				return false;
			}
			local188 = 1000;
			local803 = 100;
			for (local808 = arg6 - 10; local808 <= arg6 + 10; local808++) {
				for (local815 = arg4 - 10; local815 <= arg4 + 10; local815++) {
					if (local808 >= 0 && local815 >= 0 && local808 < 104 && local815 < 104 && Static5.anIntArrayArray2[local808][local815] < 100) {
						@Pc(839) int local839 = 0;
						if (arg4 > local815) {
							local839 = arg4 - local815;
						} else if (local815 > arg1 + arg4 - 1) {
							local839 = local815 + 1 - arg4 - arg1;
						}
						@Pc(866) int local866 = 0;
						if (local808 < arg6) {
							local866 = arg6 - local808;
						} else if (local808 > arg8 + arg6 - 1) {
							local866 = local808 + 1 - arg6 - arg8;
						}
						@Pc(904) int local904 = local839 * local839 + local866 * local866;
						if (local904 < local188 || local904 == local188 && Static5.anIntArrayArray2[local808][local815] < local803) {
							local11 = local808;
							local803 = Static5.anIntArrayArray2[local808][local815];
							local39 = local815;
							local188 = local904;
						}
					}
				}
			}
			if (local188 == 1000) {
				return false;
			}
			if (local11 == arg10 && local39 == arg9) {
				return false;
			}
			Static85.anInt1830 = 1;
		}
		@Pc(970) byte local970 = 0;
		Static119.anIntArray368[0] = local11;
		local59 = local970 + 1;
		Static85.anIntArray258[0] = local39;
		local188 = local803 = Static63.anIntArrayArray11[local11][local39];
		while (local11 != arg10 || arg9 != local39) {
			if (local188 != local803) {
				local803 = local188;
				Static119.anIntArray368[local59] = local11;
				Static85.anIntArray258[local59++] = local39;
			}
			if ((local188 & 0x1) != 0) {
				local39++;
			} else if ((local188 & 0x4) != 0) {
				local39--;
			}
			if ((local188 & 0x2) != 0) {
				local11++;
			} else if ((local188 & 0x8) != 0) {
				local11--;
			}
			local188 = Static63.anIntArrayArray11[local11][local39];
		}
		if (local59 > 0) {
			local74 = local59;
			if (local59 > 25) {
				local74 = 25;
			}
			local59--;
			@Pc(1070) int local1070 = Static119.anIntArray368[local59];
			local808 = Static85.anIntArray258[local59];
			if (arg0 == 0) {
				Static128.aClass2_Sub10_Sub1_3.method1533(193);
				Static128.aClass2_Sub10_Sub1_3.method1486(local74 + local74 + 3);
			}
			if (arg0 == 1) {
				Static128.aClass2_Sub10_Sub1_3.method1533(41);
				Static128.aClass2_Sub10_Sub1_3.method1486(local74 + local74 + 14 + 3);
			}
			if (arg0 == 2) {
				Static128.aClass2_Sub10_Sub1_3.method1533(240);
				Static128.aClass2_Sub10_Sub1_3.method1486(local74 + local74 + 3);
			}
			Static109.anInt2398 = Static85.anIntArray258[0];
			Static71.anInt1556 = Static119.anIntArray368[0];
			for (local815 = 1; local815 < local74; local815++) {
				local59--;
				Static128.aClass2_Sub10_Sub1_3.method1486(Static119.anIntArray368[local59] - local1070);
				Static128.aClass2_Sub10_Sub1_3.method1486(Static85.anIntArray258[local59] - local808);
			}
			Static128.aClass2_Sub10_Sub1_3.method1485(Static107.anInt2343 + local1070);
			Static128.aClass2_Sub10_Sub1_3.method1500(Static78.aBooleanArray5[82] ? 1 : 0);
			Static128.aClass2_Sub10_Sub1_3.method1511(local808 + Static62.anInt1413);
			return true;
		} else if (arg0 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
	public static void method795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static33.anInt827 == 0 || arg2 == 0 || anInt1157 >= 50) {
			return;
		}
		Static63.anIntArray173[anInt1157] = arg0;
		Static20.anIntArray59[anInt1157] = arg2;
		Static32.anIntArray97[anInt1157] = arg1;
		Static21.aClass36Array1[anInt1157] = null;
		Static1.anIntArray307[anInt1157] = 0;
		anInt1157++;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ZIIIBI)Lclient!bc;")
	public static Class2_Sub2_Sub1_Sub2 method797(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(23) long local23 = ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg3;
		@Pc(31) Class2_Sub2_Sub1_Sub2 local31;
		if (!arg0) {
			local31 = (Class2_Sub2_Sub1_Sub2) Static49.aClass16_39.method490(local23);
			if (local31 != null) {
				return local31;
			}
		}
		@Pc(39) Class2_Sub2_Sub12 local39 = Static35.method1934(arg3);
		if (arg1 > 1 && local39.anIntArray250 != null) {
			@Pc(47) int local47 = -1;
			for (@Pc(49) int local49 = 0; local49 < 10; local49++) {
				if (arg1 >= local39.anIntArray249[local49] && local39.anIntArray249[local49] != 0) {
					local47 = local39.anIntArray250[local49];
				}
			}
			if (local47 != -1) {
				local39 = Static35.method1934(local47);
			}
		}
		@Pc(89) Class2_Sub2_Sub2_Sub5 local89 = local39.method1231(1);
		if (local89 == null) {
			return null;
		}
		@Pc(95) Class2_Sub2_Sub1_Sub2 local95 = null;
		if (local39.anInt1725 != -1) {
			local95 = method797(true, 10, 1, local39.anInt1719, 0);
			if (local95 == null) {
				return null;
			}
		}
		@Pc(120) int[] local120 = Static58.anIntArray117;
		@Pc(122) int local122 = Static58.anInt1010;
		@Pc(124) int local124 = Static58.anInt1008;
		@Pc(127) int[] local127 = new int[4];
		Static58.method709(local127);
		local31 = new Class2_Sub2_Sub1_Sub2(36, 32);
		Static58.method696(local31.anIntArray31, 36, 32);
		Static58.method698();
		Static44.method728();
		Static44.method729(16, 16);
		@Pc(148) int local148 = local39.anInt1705;
		Static44.aBoolean39 = false;
		if (arg0) {
			local148 = (int) ((double) local148 * 1.5D);
		} else if (arg2 == 2) {
			local148 = (int) ((double) local148 * 1.04D);
		}
		@Pc(178) int local178 = local148 * Class2_Sub2_Sub1_Sub4.anIntArray119[local39.anInt1696] >> 16;
		@Pc(187) int local187 = local148 * Class2_Sub2_Sub1_Sub4.anIntArray122[local39.anInt1696] >> 16;
		local89.method1133();
		local89.method1130(local39.anInt1690, local39.anInt1691, local39.anInt1696, local39.anInt1710, local39.anInt1714 + local89.anInt2656 / 2 + local187, local39.anInt1714 + local178);
		if (arg2 >= 1) {
			local31.method222(1);
		}
		if (arg2 >= 2) {
			local31.method222(16777215);
		}
		if (arg4 != 0) {
			local31.method215(arg4);
		}
		Static58.method696(local31.anIntArray31, 36, 32);
		if (local39.anInt1725 != -1) {
			local95.method213(0, 0);
		}
		if (!arg0 && (local39.anInt1727 == 1 || arg1 != 1) && arg1 != -1) {
			Static47.aClass2_Sub2_Sub1_Sub3_4.method308(Static63.method1004(arg1), 1, 10, 1);
			Static47.aClass2_Sub2_Sub1_Sub3_4.method308(Static63.method1004(arg1), 0, 9, 16776960);
		}
		if (!arg0) {
			Static49.aClass16_39.method492(local31, local23);
		}
		Static58.method696(local120, local122, local124);
		Static58.method703(local127);
		Static44.method728();
		Static44.aBoolean39 = true;
		return local31;
	}
}
