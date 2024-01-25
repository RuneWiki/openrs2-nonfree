import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!tq", name = "n", descriptor = "Lclient!qj;")
	public static Class165 aClass165_93;

	@OriginalMember(owner = "client!tq", name = "q", descriptor = "Lclient!lf;")
	public static Class90 aClass90_17;

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "Lclient!ng;")
	public static final Class140 aClass140_154 = new Class140(8);

	@OriginalMember(owner = "client!tq", name = "m", descriptor = "[I")
	public static final int[] anIntArray742 = new int[14];

	@OriginalMember(owner = "client!tq", name = "o", descriptor = "Lclient!ng;")
	public static final Class140 aClass140_155 = new Class140(64);

	@OriginalMember(owner = "client!tq", name = "p", descriptor = "[Z")
	public static final boolean[] aBooleanArray29 = new boolean[8];

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILclient!sh;II)V")
	public static void method5156(@OriginalArg(0) int arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(3) int arg2) {
		Static152.aClass186ArrayArray1[arg2][arg0] = arg1;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V")
	public static void method5159() {
		Static234.aClass140_122.method3819();
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILclient!sm;)V")
	public static void method5160(@OriginalArg(0) int arg0, @OriginalArg(1) Class41 arg1) {
		Static7.aClass41Array1[arg0] = arg1;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(BILclient!jj;II)V")
	public static void method5161(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub3_Sub3 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class45 local9 = arg1.method4533();
		@Pc(18) int local18 = arg1.anInt4921 - arg1.aClass11_7.anInt264 & 0x3FFF;
		if (arg0 == -1) {
			if (local18 != 0 || arg1.anInt4930 > 25) {
				arg1.aBoolean412 = false;
				if (arg2 < 0 && local9.anInt1471 != -1) {
					arg1.anInt4975 = local9.anInt1471;
				} else if (arg2 <= 0 || local9.anInt1473 == -1) {
					arg1.anInt4975 = local9.anInt1491;
				} else {
					arg1.anInt4975 = local9.anInt1473;
				}
			} else if (!arg1.aBoolean412 || !local9.method1421(arg1.anInt4975)) {
				arg1.anInt4975 = local9.method1429();
				arg1.aBoolean412 = arg1.anInt4975 != -1;
			}
		} else if (arg1.anInt4964 != -1 && (local18 >= 10240 || local18 <= 2048)) {
			@Pc(45) int local45 = Static89.anIntArray219[arg3] - arg1.aClass11_7.anInt264 & 0x3FFF;
			arg1.aBoolean412 = false;
			if (arg0 == 2 && local9.anInt1490 != -1) {
				if (local45 > 2048 && local45 <= 6144 && local9.anInt1481 != -1) {
					arg1.anInt4975 = local9.anInt1481;
				} else if (local45 >= 10240 && local45 < 14336 && local9.anInt1489 != -1) {
					arg1.anInt4975 = local9.anInt1489;
				} else if (local45 <= 6144 || local45 >= 10240 || local9.anInt1494 == -1) {
					arg1.anInt4975 = local9.anInt1490;
				} else {
					arg1.anInt4975 = local9.anInt1494;
				}
			} else if (arg0 == 0 && local9.anInt1504 != -1) {
				if (local45 > 2048 && local45 <= 6144 && local9.anInt1500 != -1) {
					arg1.anInt4975 = local9.anInt1500;
				} else if (local45 >= 10240 && local45 < 14336 && local9.anInt1482 != -1) {
					arg1.anInt4975 = local9.anInt1482;
				} else if (local45 <= 6144 || local45 >= 10240 || local9.anInt1476 == -1) {
					arg1.anInt4975 = local9.anInt1504;
				} else {
					arg1.anInt4975 = local9.anInt1476;
				}
			} else if (local45 > 2048 && local45 <= 6144 && local9.anInt1502 != -1) {
				arg1.anInt4975 = local9.anInt1502;
			} else if (local45 >= 10240 && local45 < 14336 && local9.anInt1468 != -1) {
				arg1.anInt4975 = local9.anInt1468;
			} else if (local45 <= 6144 || local45 >= 10240 || local9.anInt1474 == -1) {
				arg1.anInt4975 = local9.anInt1491;
			} else {
				arg1.anInt4975 = local9.anInt1474;
			}
		} else if (local18 == 0 && arg1.anInt4930 <= 25) {
			if (arg0 == 2 && local9.anInt1490 != -1) {
				arg1.anInt4975 = local9.anInt1490;
			} else if (arg0 == 0 && local9.anInt1504 != -1) {
				arg1.anInt4975 = local9.anInt1504;
			} else {
				arg1.anInt4975 = local9.anInt1491;
			}
			arg1.aBoolean412 = false;
		} else {
			arg1.aBoolean412 = false;
			if (arg0 == 2 && local9.anInt1490 != -1) {
				if (arg2 < 0 && local9.anInt1475 != -1) {
					arg1.anInt4975 = local9.anInt1475;
				} else if (arg2 <= 0 || local9.anInt1463 == -1) {
					arg1.anInt4975 = local9.anInt1490;
				} else {
					arg1.anInt4975 = local9.anInt1463;
				}
			} else if (arg0 == 0 && local9.anInt1504 != -1) {
				if (arg2 < 0 && local9.anInt1496 != -1) {
					arg1.anInt4975 = local9.anInt1496;
				} else if (arg2 <= 0 || local9.anInt1492 == -1) {
					arg1.anInt4975 = local9.anInt1504;
				} else {
					arg1.anInt4975 = local9.anInt1492;
				}
			} else if (arg2 < 0 && local9.anInt1479 != -1) {
				arg1.anInt4975 = local9.anInt1479;
			} else if (arg2 <= 0 || local9.anInt1469 == -1) {
				arg1.anInt4975 = local9.anInt1491;
			} else {
				arg1.anInt4975 = local9.anInt1469;
			}
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)V")
	public static void method5162() {
		if (Static235.anInt4612 > 0) {
			Static55.method1208();
		} else {
			Static268.aClass158_3 = Static153.aClass158_2;
			Static153.aClass158_2 = null;
			Static72.method1427(40);
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZI)V")
	public static void method5164(@OriginalArg(0) boolean arg0) {
		@Pc(9) byte local9;
		@Pc(11) byte[][] local11;
		if (arg0) {
			local11 = Static343.aByteArrayArray17;
			local9 = 1;
		} else {
			local9 = 4;
			local11 = Static28.aByteArrayArray2;
		}
		@Pc(28) int local28 = local11.length;
		@Pc(44) int local44;
		@Pc(57) int local57;
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			@Pc(34) int[] local34 = null;
			@Pc(38) byte[] local38 = local11[local30];
			local44 = Static80.anIntArray184[local30] >> 8;
			@Pc(50) int local50 = Static80.anIntArray184[local30] & 0xFF;
			local57 = local44 * 64 - Static182.anInt3775;
			@Pc(64) int local64 = local50 * 64 - Static161.anInt3315;
			if (local38 != null) {
				Static278.method4804();
				local34 = Static73.method1434(Static34.aClass2_6, local64, local38, arg0, local9, Static24.aClass91Array1, Static182.anInt3775, local57, Static161.anInt3315);
			}
			if (!arg0 && Static58.anInt1291 / 8 == local44 && local50 == Static51.anInt5042 / 8) {
				if (local34 == null) {
					Static92.aClass32_1 = null;
				} else {
					Static92.aClass32_1 = Static305.method5153(local34[1], local34[2], local34[3], local34[0]);
					Static311.anInt5991 = local34[4];
				}
			}
		}
		for (@Pc(127) int local127 = 0; local127 < local28; local127++) {
			@Pc(140) int local140 = (Static80.anIntArray184[local127] >> 8) * 64 - Static182.anInt3775;
			local44 = (Static80.anIntArray184[local127] & 0xFF) * 64 - Static161.anInt3315;
			@Pc(155) byte[] local155 = local11[local127];
			if (local155 == null && Static51.anInt5042 < 800) {
				Static278.method4804();
				for (local57 = 0; local57 < local9; local57++) {
					Static43.method2804(local140, 64, 64, local44, local57);
				}
			}
		}
	}
}
