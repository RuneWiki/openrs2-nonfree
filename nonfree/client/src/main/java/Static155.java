import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!t", name = "db", descriptor = "Z")
	public static boolean aBoolean161;

	@OriginalMember(owner = "client!t", name = "Q", descriptor = "[I")
	public static int[] anIntArray385 = new int[25];

	@OriginalMember(owner = "client!t", name = "T", descriptor = "Z")
	public static boolean aBoolean160 = false;

	@OriginalMember(owner = "client!t", name = "V", descriptor = "I")
	public static int anInt3954 = 0;

	@OriginalMember(owner = "client!t", name = "bb", descriptor = "I")
	public static int anInt3959 = 0;

	@OriginalMember(owner = "client!t", name = "hb", descriptor = "[Z")
	public static boolean[] aBooleanArray20 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

	@OriginalMember(owner = "client!t", name = "f", descriptor = "(I)V")
	public static void method2674() {
		for (@Pc(15) int local15 = 0; local15 < Static28.anInt732; local15++) {
			@Pc(21) int local21 = Static144.anIntArray300[local15];
			@Pc(25) Class2_Sub3_Sub5_Sub1_Sub1 local25 = Static2.aClass2_Sub3_Sub5_Sub1_Sub1Array1[local21];
			@Pc(29) int local29 = Static64.aClass2_Sub13_Sub1_1.method1402();
			if ((local29 & 0x10) != 0) {
				local29 += Static64.aClass2_Sub13_Sub1_1.method1402() << 8;
			}
			Static112.method1808(local29, local25, local21);
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(JB)V")
	public static void method2675(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static65.method1034(arg0 - 1L);
			Static65.method1034(1L);
		} else {
			Static65.method1034(arg0);
		}
	}

	@OriginalMember(owner = "client!t", name = "g", descriptor = "(I)V")
	public static void method2676() {
		anIntArray385 = null;
		aBooleanArray20 = null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(BZ)V")
	public static void method2677(@OriginalArg(1) boolean arg0) {
		Static29.aBoolean31 = arg0;
		@Pc(19) int local19;
		@Pc(23) int local23;
		@Pc(27) int local27;
		@Pc(35) int local35;
		@Pc(41) int local41;
		@Pc(45) int local45;
		@Pc(73) int local73;
		@Pc(133) int local133;
		@Pc(141) int local141;
		@Pc(149) int local149;
		if (!Static29.aBoolean31) {
			local19 = Static64.aClass2_Sub13_Sub1_1.method1415();
			local23 = Static64.aClass2_Sub13_Sub1_1.method1430();
			local27 = Static64.aClass2_Sub13_Sub1_1.method1397();
			local35 = (Static139.anInt3252 - Static64.aClass2_Sub13_Sub1_1.anInt2154) / 16;
			Static129.anIntArrayArray75 = new int[local35][4];
			for (local41 = 0; local41 < local35; local41++) {
				for (local45 = 0; local45 < 4; local45++) {
					Static129.anIntArrayArray75[local41][local45] = Static64.aClass2_Sub13_Sub1_1.method1395();
				}
			}
			local45 = Static64.aClass2_Sub13_Sub1_1.method1410();
			local73 = Static64.aClass2_Sub13_Sub1_1.method1436();
			Static179.anIntArray403 = new int[local35];
			Static127.anIntArray257 = new int[local35];
			@Pc(81) boolean local81 = false;
			if ((local27 / 8 == 48 || local27 / 8 == 49) && local23 / 8 == 48) {
				local81 = true;
			}
			Static58.aByteArrayArray4 = new byte[local35][];
			Static25.anIntArray29 = new int[local35];
			Static18.aByteArrayArray1 = new byte[local35][];
			local35 = 0;
			if (local27 / 8 == 48 && local23 / 8 == 148) {
				local81 = true;
			}
			for (local133 = (local27 - 6) / 8; local133 <= (local27 + 6) / 8; local133++) {
				for (local141 = (local23 - 6) / 8; local141 <= (local23 + 6) / 8; local141++) {
					local149 = local141 + (local133 << 8);
					if (!local81 || local141 != 49 && local141 != 149 && local141 != 147 && local133 != 50 && (local133 != 49 || local141 != 47)) {
						Static127.anIntArray257[local35] = local149;
						Static179.anIntArray403[local35] = Static165.aClass10_Sub1_17.method1602(Static58.method956(new Class6[] { Static41.aClass6_328, Static106.method2806(local133), Static108.aClass6_742, Static106.method2806(local141) }));
						Static25.anIntArray29[local35] = Static165.aClass10_Sub1_17.method1602(Static58.method956(new Class6[] { Static63.aClass6_456, Static106.method2806(local133), Static108.aClass6_742, Static106.method2806(local141) }));
						local35++;
					}
				}
			}
			Static25.method465(local45, local19, local73, local23, local27);
			return;
		}
		local19 = Static64.aClass2_Sub13_Sub1_1.method1415();
		local23 = Static64.aClass2_Sub13_Sub1_1.method1415();
		local27 = Static64.aClass2_Sub13_Sub1_1.method1397();
		local35 = Static64.aClass2_Sub13_Sub1_1.method1397();
		local41 = Static64.aClass2_Sub13_Sub1_1.method1441();
		Static64.aClass2_Sub13_Sub1_1.method1454();
		@Pc(299) int local299;
		for (local45 = 0; local45 < 4; local45++) {
			for (local73 = 0; local73 < 13; local73++) {
				for (local299 = 0; local299 < 13; local299++) {
					local133 = Static64.aClass2_Sub13_Sub1_1.method1458(1);
					if (local133 == 1) {
						Static42.anIntArrayArrayArray1[local45][local73][local299] = Static64.aClass2_Sub13_Sub1_1.method1458(26);
					} else {
						Static42.anIntArrayArrayArray1[local45][local73][local299] = -1;
					}
				}
			}
		}
		Static64.aClass2_Sub13_Sub1_1.method1457();
		local73 = (Static139.anInt3252 - Static64.aClass2_Sub13_Sub1_1.anInt2154) / 16;
		Static129.anIntArrayArray75 = new int[local73][4];
		for (local299 = 0; local299 < local73; local299++) {
			for (local133 = 0; local133 < 4; local133++) {
				Static129.anIntArrayArray75[local299][local133] = Static64.aClass2_Sub13_Sub1_1.method1425();
			}
		}
		Static127.anIntArray257 = new int[local73];
		Static58.aByteArrayArray4 = new byte[local73][];
		Static179.anIntArray403 = new int[local73];
		Static18.aByteArrayArray1 = new byte[local73][];
		Static25.anIntArray29 = new int[local73];
		local73 = 0;
		for (local133 = 0; local133 < 4; local133++) {
			for (local141 = 0; local141 < 13; local141++) {
				for (local149 = 0; local149 < 13; local149++) {
					@Pc(422) int local422 = Static42.anIntArrayArrayArray1[local133][local141][local149];
					if (local422 != -1) {
						@Pc(431) int local431 = local422 >> 14 & 0x3FF;
						@Pc(437) int local437 = local422 >> 3 & 0x7FF;
						@Pc(447) int local447 = local437 / 8 + (local431 / 8 << 8);
						for (@Pc(449) int local449 = 0; local449 < local73; local449++) {
							if (Static127.anIntArray257[local449] == local447) {
								local447 = -1;
								break;
							}
						}
						if (local447 != -1) {
							Static127.anIntArray257[local73] = local447;
							@Pc(481) int local481 = local447 >> 8 & 0xFF;
							@Pc(485) int local485 = local447 & 0xFF;
							Static179.anIntArray403[local73] = Static165.aClass10_Sub1_17.method1602(Static58.method956(new Class6[] { Static41.aClass6_328, Static106.method2806(local481), Static108.aClass6_742, Static106.method2806(local485) }));
							Static25.anIntArray29[local73] = Static165.aClass10_Sub1_17.method1602(Static58.method956(new Class6[] { Static63.aClass6_456, Static106.method2806(local481), Static108.aClass6_742, Static106.method2806(local485) }));
							local73++;
						}
					}
				}
			}
		}
		Static25.method465(local35, local19, local41, local23, local27);
	}

	@OriginalMember(owner = "client!t", name = "c", descriptor = "(B)I")
	public static int method2678() {
		return Static90.anInt3878++;
	}
}
