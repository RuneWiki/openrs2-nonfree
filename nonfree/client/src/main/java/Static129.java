import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!wa", name = "x", descriptor = "Lclient!ub;")
	public static Class2_Sub5_Sub4 aClass2_Sub5_Sub4_2;

	@OriginalMember(owner = "client!wa", name = "C", descriptor = "Lclient!ua;")
	public static Class24_Sub1 aClass24_Sub1_21;

	@OriginalMember(owner = "client!wa", name = "N", descriptor = "Lclient!pc;")
	public static Class57 aClass57_4;

	@OriginalMember(owner = "client!wa", name = "R", descriptor = "Lclient!q;")
	public static Class59 aClass59_5;

	@OriginalMember(owner = "client!wa", name = "v", descriptor = "Lclient!je;")
	private static Class40 aClass40_1606 = Static69.method1231("OFF");

	@OriginalMember(owner = "client!wa", name = "z", descriptor = "[I")
	public static int[] anIntArray354 = new int[500];

	@OriginalMember(owner = "client!wa", name = "Q", descriptor = "Lclient!je;")
	public static Class40 aClass40_1607 = aClass40_1606;

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)V")
	public static void method2135(@OriginalArg(0) int arg0) {
		@Pc(4) int[] local4 = Static50.aClass2_Sub1_Sub2_Sub4_2.anIntArray259;
		@Pc(11) int local11 = local4.length;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			local4[local13] = 0;
		}
		@Pc(37) int local37;
		@Pc(39) int local39;
		for (@Pc(25) int local25 = 1; local25 < 103; local25++) {
			local37 = 4 * 512 * (103 - local25) + 24628;
			for (local39 = 1; local39 < 103; local39++) {
				if ((Static66.aByteArrayArrayArray10[arg0][local39][local25] & 0x18) == 0) {
					Static111.aClass30_1.method766(local4, local37, arg0, local39, local25);
				}
				if (arg0 < 3 && (Static66.aByteArrayArrayArray10[arg0 + 1][local39][local25] & 0x8) != 0) {
					Static111.aClass30_1.method766(local4, local37, arg0 + 1, local39, local25);
				}
				local37 += 4;
			}
		}
		Static50.aClass2_Sub1_Sub2_Sub4_2.method1704();
		local37 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 16) + ((int) (Math.random() * 20.0D) + -10 + 238 << 8) + 238 - 10;
		local39 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		@Pc(151) int local151;
		for (@Pc(147) int local147 = 1; local147 < 103; local147++) {
			for (local151 = 1; local151 < 103; local151++) {
				if ((Static66.aByteArrayArrayArray10[arg0][local151][local147] & 0x18) == 0) {
					Static15.method242(arg0, local151, local37, local147, local39);
				}
				if (arg0 < 3 && (Static66.aByteArrayArrayArray10[arg0 + 1][local151][local147] & 0x8) != 0) {
					Static15.method242(arg0 + 1, local151, local37, local147, local39);
				}
			}
		}
		Static28.anInt685 = 0;
		for (local151 = 0; local151 < 104; local151++) {
			for (@Pc(220) int local220 = 0; local220 < 104; local220++) {
				@Pc(228) int local228 = Static111.aClass30_1.method760(Static105.anInt2531, local151, local220);
				if (local228 != 0) {
					local228 = local228 >> 14 & 0x7FFF;
					@Pc(241) int local241 = Static107.method1839(local228).anInt1040;
					if (local241 >= 0) {
						@Pc(248) int local248 = local151;
						@Pc(250) int local250 = local220;
						if (local241 != 22 && local241 != 29 && local241 != 34 && local241 != 36 && local241 != 46 && local241 != 47 && local241 != 48) {
							@Pc(284) int[][] local284 = Static70.aClass20Array1[Static105.anInt2531].anIntArrayArray8;
							for (@Pc(286) int local286 = 0; local286 < 10; local286++) {
								@Pc(293) int local293 = (int) (Math.random() * 4.0D);
								if (local293 == 0 && local248 > 0 && local151 - 3 < local248 && (local284[local248 - 1][local250] & 0x12C0108) == 0) {
									local248--;
								}
								if (local293 == 1 && local248 < 103 && local248 < local151 + 3 && (local284[local248 + 1][local250] & 0x12C0180) == 0) {
									local248++;
								}
								if (local293 == 2 && local250 > 0 && local250 > local220 - 3 && (local284[local248][local250 - 1] & 0x12C0102) == 0) {
									local250--;
								}
								if (local293 == 3 && local250 < 103 && local250 < local220 + 3 && (local284[local248][local250 + 1] & 0x12C0120) == 0) {
									local250++;
								}
							}
						}
						Static47.aClass2_Sub1_Sub2_Sub4Array7[Static28.anInt685] = Static10.aClass2_Sub1_Sub2_Sub4Array14[local241];
						Static30.anIntArray85[Static28.anInt685] = local248;
						Static77.anIntArray216[Static28.anInt685] = local250;
						Static28.anInt685++;
					}
				}
			}
		}
		Static65.aClass7_1.method2133();
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
	public static void method2138() {
		anIntArray354 = null;
		aClass40_1606 = null;
		aClass59_5 = null;
		aClass2_Sub5_Sub4_2 = null;
		aClass24_Sub1_21 = null;
		aClass40_1607 = null;
		aClass57_4 = null;
	}

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "(B)V")
	public static void method2139() {
		Static63.aClass55_18.method1413();
		Static88.aClass55_70.method1413();
		Static116.aClass55_81.method1413();
		Static15.aClass55_16.method1413();
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZZ)V")
	public static void method2140(@OriginalArg(0) boolean arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static102.anInt2484; local3++) {
			@Pc(11) Class2_Sub1_Sub1_Sub3_Sub1 local11 = Static127.aClass2_Sub1_Sub1_Sub3_Sub1Array1[Static37.anIntArray97[local3]];
			@Pc(19) int local19 = (Static37.anIntArray97[local3] << 14) + 536870912;
			if (local11 != null && local11.method1174() && arg0 == local11.aClass2_Sub1_Sub11_1.aBoolean187 && local11.aClass2_Sub1_Sub11_1.method1664()) {
				@Pc(48) int local48 = local11.anInt1788 >> 7;
				@Pc(53) int local53 = local11.anInt1792 >> 7;
				if (local48 >= 0 && local48 < 104 && local53 >= 0 && local53 < 104) {
					if (local11.anInt1789 == 1 && (local11.anInt1788 & 0x7F) == 64 && (local11.anInt1792 & 0x7F) == 64) {
						if (Static96.anInt2435 == Static108.anIntArrayArray24[local48][local53]) {
							continue;
						}
						Static108.anIntArrayArray24[local48][local53] = Static96.anInt2435;
					}
					if (!local11.aClass2_Sub1_Sub11_1.aBoolean185) {
						local19 += Integer.MIN_VALUE;
					}
					Static111.aClass30_1.method768(Static105.anInt2531, local11.anInt1788, local11.anInt1792, Static93.method1730(local11.anInt1788 + (local11.anInt1789 - 1) * 64, Static105.anInt2531, local11.anInt1792 + local11.anInt1789 * 64 - 64), (local11.anInt1789 - 1) * 64 + 60, local11, local11.anInt1818, local19, local11.aBoolean134);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIII)Z")
	public static boolean method2141(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = arg1 >> 14 & 0x7FFF;
		@Pc(18) int local18 = Static111.aClass30_1.method779(Static105.anInt2531, arg0, arg2, arg1);
		if (local18 == -1) {
			return false;
		}
		@Pc(30) int local30 = local18 >> 6 & 0x3;
		@Pc(34) int local34 = local18 & 0x1F;
		if (local34 == 10 || local34 == 11 || local34 == 22) {
			@Pc(71) Class2_Sub1_Sub4 local71 = Static107.method1839(local11);
			@Pc(84) int local84;
			@Pc(87) int local87;
			if (local30 == 0 || local30 == 2) {
				local84 = local71.anInt1036;
				local87 = local71.anInt1066;
			} else {
				local84 = local71.anInt1066;
				local87 = local71.anInt1036;
			}
			@Pc(98) int local98 = local71.anInt1055;
			if (local30 != 0) {
				local98 = (local98 << local30 & 0xF) + (local98 >> 4 - local30);
			}
			Static99.method1788(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray180[0], local98, 2, true, local84, local87, 0, arg2, arg0, Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray177[0], 0);
		} else {
			Static99.method1788(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray180[0], 0, 2, true, 0, 0, local30, arg2, arg0, Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray177[0], local34 + 1);
		}
		Static12.anInt3049 = Static41.anInt1096;
		Static124.anInt2881 = 0;
		Static65.anInt1730 = Static103.anInt2511;
		Static74.anInt920 = 2;
		return true;
	}
}
