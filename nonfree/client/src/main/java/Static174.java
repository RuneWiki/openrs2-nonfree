import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!mi", name = "J", descriptor = "[I")
	public static int[] anIntArray284;

	@OriginalMember(owner = "client!mi", name = "L", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!mi", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString195 = "cyan:";

	@OriginalMember(owner = "client!mi", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString196 = "Allocating memory";

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(BLclient!lf;I)Lclient!uc;")
	public static Class1_Sub2_Sub21 method2938(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		@Pc(31) Class1_Sub2_Sub21 local31 = new Class1_Sub2_Sub21(arg1, arg0.method1375(), arg0.method1375(), arg0.method1392(), arg0.method1392(), arg0.method1378() == 1, arg0.method1378());
		@Pc(39) int local39 = arg0.method1378();
		for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
			local31.aClass59_36.method1706(new Class1_Sub19(arg0.method1378(), arg0.method1378(), arg0.method1386(), arg0.method1386(), arg0.method1386(), arg0.method1386(), arg0.method1386(), arg0.method1386(), arg0.method1386(), arg0.method1386()));
		}
		local31.method4339();
		return local31;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(BLclient!nk;)I")
	public static int method2939(@OriginalArg(1) Class121 arg0) {
		@Pc(11) int local11 = 0;
		if (arg0.method3140(Static76.anInt1571)) {
			local11++;
		}
		if (arg0.method3140(Static26.anInt443)) {
			local11++;
		}
		return local11;
	}

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "(I)V")
	public static void method2940() {
		for (@Pc(13) int local13 = 0; local13 < Static224.anInt4118; local13++) {
			@Pc(24) int local24 = Static263.anIntArray425[local13];
			@Pc(28) Class15_Sub5_Sub2 local28 = Static17.aClass15_Sub5_Sub2Array1[local24];
			@Pc(32) int local32 = Static13.aClass1_Sub14_Sub1_1.method1378();
			if ((local32 & 0x40) != 0) {
				local32 += Static13.aClass1_Sub14_Sub1_1.method1378() << 8;
			}
			Static210.method3346(local24, local32, local28);
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IZIIIIIIIIII)V")
	public static void method2941(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9) {
		@Pc(3) int local3;
		@Pc(8) int local8;
		for (local3 = 0; local3 < 104; local3++) {
			for (local8 = 0; local8 < 104; local8++) {
				Static57.anIntArrayArray8[local3][local8] = 0;
				Static123.anIntArrayArray18[local3][local8] = 99999999;
			}
		}
		local3 = arg0;
		local8 = arg7;
		@Pc(41) int local41 = 0;
		@Pc(43) byte local43 = 0;
		Static57.anIntArrayArray8[arg0][arg7] = 99;
		Static123.anIntArrayArray18[arg0][arg7] = 0;
		@Pc(57) boolean local57 = false;
		Static296.anIntArray469[0] = arg0;
		@Pc(64) int local64 = local43 + 1;
		Static293.anIntArray466[0] = arg7;
		@Pc(71) int[][] local71 = Static240.aClass118Array1[Static65.anInt1300].anIntArrayArray28;
		@Pc(240) int local240;
		label327: while (local41 != local64) {
			local3 = Static296.anIntArray469[local41];
			local8 = Static293.anIntArray466[local41];
			local41 = local41 + 1 & 0xFFF;
			if (local3 == arg1 && local8 == arg5) {
				local57 = true;
				break;
			}
			if (arg9 != 0) {
				if ((arg9 < 5 || arg9 == 10) && Static240.aClass118Array1[Static65.anInt1300].method3043(arg6, arg5, local3, arg9 - 1, arg4, local8, arg1)) {
					local57 = true;
					break;
				}
				if (arg9 < 10 && Static240.aClass118Array1[Static65.anInt1300].method3039(arg9 - 1, arg4, arg5, local8, arg6, local3, arg1)) {
					local57 = true;
					break;
				}
			}
			if (arg3 != 0 && arg2 != 0 && Static240.aClass118Array1[Static65.anInt1300].method3034(arg8, arg5, local3, arg3, local8, arg2, arg1, arg6)) {
				local57 = true;
				break;
			}
			@Pc(190) int local190 = Static123.anIntArrayArray18[local3][local8] + 1;
			if (local3 > 0 && Static57.anIntArrayArray8[local3 - 1][local8] == 0 && (local71[local3 - 1][local8] & 0x2C010E) == 0 && (local71[local3 - 1][local8 + arg6 - 1] & 0x2C0138) == 0) {
				local240 = 1;
				while (true) {
					if (local240 >= arg6 - 1) {
						Static296.anIntArray469[local64] = local3 - 1;
						Static293.anIntArray466[local64] = local8;
						local64 = local64 + 1 & 0xFFF;
						Static57.anIntArrayArray8[local3 - 1][local8] = 2;
						Static123.anIntArrayArray18[local3 - 1][local8] = local190;
						break;
					}
					if ((local71[local3 - 1][local240 + local8] & 0x2C013E) != 0) {
						break;
					}
					local240++;
				}
			}
			if (local3 < 102 && Static57.anIntArrayArray8[local3 + 1][local8] == 0 && (local71[local3 + arg6][local8] & 0x2C0183) == 0 && (local71[local3 + arg6][arg6 + local8 - 1] & 0x2C01E0) == 0) {
				local240 = 1;
				while (true) {
					if (local240 >= arg6 - 1) {
						Static296.anIntArray469[local64] = local3 + 1;
						Static293.anIntArray466[local64] = local8;
						local64 = local64 + 1 & 0xFFF;
						Static57.anIntArrayArray8[local3 + 1][local8] = 8;
						Static123.anIntArrayArray18[local3 + 1][local8] = local190;
						break;
					}
					if ((local71[arg6 + local3][local8 + local240] & 0x2C01E3) != 0) {
						break;
					}
					local240++;
				}
			}
			if (local8 > 0 && Static57.anIntArrayArray8[local3][local8 - 1] == 0 && (local71[local3][local8 - 1] & 0x2C010E) == 0 && (local71[local3 + arg6 - 1][local8 - 1] & 0x2C0183) == 0) {
				local240 = 1;
				while (true) {
					if (arg6 - 1 <= local240) {
						Static296.anIntArray469[local64] = local3;
						Static293.anIntArray466[local64] = local8 - 1;
						local64 = local64 + 1 & 0xFFF;
						Static57.anIntArrayArray8[local3][local8 - 1] = 1;
						Static123.anIntArrayArray18[local3][local8 - 1] = local190;
						break;
					}
					if ((local71[local240 + local3][local8 - 1] & 0x2C018F) != 0) {
						break;
					}
					local240++;
				}
			}
			if (local8 < 102 && Static57.anIntArrayArray8[local3][local8 + 1] == 0 && (local71[local3][local8 + arg6] & 0x2C0138) == 0 && (local71[local3 + arg6 - 1][local8 + arg6] & 0x2C01E0) == 0) {
				local240 = 1;
				while (true) {
					if (arg6 - 1 <= local240) {
						Static296.anIntArray469[local64] = local3;
						Static293.anIntArray466[local64] = local8 + 1;
						Static57.anIntArrayArray8[local3][local8 + 1] = 4;
						Static123.anIntArrayArray18[local3][local8 + 1] = local190;
						local64 = local64 + 1 & 0xFFF;
						break;
					}
					if ((local71[local240 + local3][local8 + arg6] & 0x2C01F8) != 0) {
						break;
					}
					local240++;
				}
			}
			if (local3 > 0 && local8 > 0 && Static57.anIntArrayArray8[local3 - 1][local8 - 1] == 0 && (local71[local3 - 1][local8 - 1] & 0x2C010E) == 0) {
				local240 = 1;
				while (true) {
					if (local240 >= arg6) {
						Static296.anIntArray469[local64] = local3 - 1;
						Static293.anIntArray466[local64] = local8 - 1;
						Static57.anIntArrayArray8[local3 - 1][local8 - 1] = 3;
						local64 = local64 + 1 & 0xFFF;
						Static123.anIntArrayArray18[local3 - 1][local8 - 1] = local190;
						break;
					}
					if ((local71[local3 - 1][local8 + local240 - 1] & 0x2C013E) != 0 || (local71[local3 + local240 - 1][local8 - 1] & 0x2C018F) != 0) {
						break;
					}
					local240++;
				}
			}
			if (local3 < 102 && local8 > 0 && Static57.anIntArrayArray8[local3 + 1][local8 - 1] == 0 && (local71[arg6 + local3][local8 - 1] & 0x2C0183) == 0) {
				local240 = 1;
				while (true) {
					if (arg6 <= local240) {
						Static296.anIntArray469[local64] = local3 + 1;
						Static293.anIntArray466[local64] = local8 - 1;
						Static57.anIntArrayArray8[local3 + 1][local8 - 1] = 9;
						Static123.anIntArrayArray18[local3 + 1][local8 - 1] = local190;
						local64 = local64 + 1 & 0xFFF;
						break;
					}
					if ((local71[local3 + arg6][local8 + local240 - 1] & 0x2C01E3) != 0 || (local71[local3 + local240][local8 - 1] & 0x2C018F) != 0) {
						break;
					}
					local240++;
				}
			}
			if (local3 > 0 && local8 < 102 && Static57.anIntArrayArray8[local3 - 1][local8 + 1] == 0 && (local71[local3 - 1][arg6 + local8] & 0x2C0138) == 0) {
				local240 = 1;
				while (true) {
					if (arg6 <= local240) {
						Static296.anIntArray469[local64] = local3 - 1;
						Static293.anIntArray466[local64] = local8 + 1;
						Static57.anIntArrayArray8[local3 - 1][local8 + 1] = 6;
						local64 = local64 + 1 & 0xFFF;
						Static123.anIntArrayArray18[local3 - 1][local8 + 1] = local190;
						break;
					}
					if ((local71[local3 - 1][local8 + local240] & 0x2C013E) != 0 || (local71[local240 + local3 - 1][arg6 + local8] & 0x2C01F8) != 0) {
						break;
					}
					local240++;
				}
			}
			if (local3 < 102 && local8 < 102 && Static57.anIntArrayArray8[local3 + 1][local8 + 1] == 0 && (local71[arg6 + local3][arg6 + local8] & 0x2C01E0) == 0) {
				for (local240 = 1; local240 < arg6; local240++) {
					if ((local71[local3 + local240][local8 + arg6] & 0x2C01F8) != 0 || (local71[arg6 + local3][local8 + local240] & 0x2C01E3) != 0) {
						continue label327;
					}
				}
				Static296.anIntArray469[local64] = local3 + 1;
				Static293.anIntArray466[local64] = local8 + 1;
				Static57.anIntArrayArray8[local3 + 1][local8 + 1] = 12;
				Static123.anIntArrayArray18[local3 + 1][local8 + 1] = local190;
				local64 = local64 + 1 & 0xFFF;
			}
		}
		if (!local57) {
			local240 = 1000;
			@Pc(1077) int local1077 = 100;
			for (@Pc(1082) int local1082 = arg1 - 10; local1082 <= arg1 + 10; local1082++) {
				for (@Pc(1092) int local1092 = arg5 - 10; local1092 <= arg5 + 10; local1092++) {
					if (local1082 >= 0 && local1092 >= 0 && local1082 < 104 && local1092 < 104 && Static123.anIntArrayArray18[local1082][local1092] < 100) {
						@Pc(1116) int local1116 = 0;
						if (local1082 < arg1) {
							local1116 = arg1 - local1082;
						} else if (arg3 + arg1 - 1 < local1082) {
							local1116 = local1082 + 1 - arg1 - arg3;
						}
						@Pc(1149) int local1149 = 0;
						if (local1092 < arg5) {
							local1149 = arg5 - local1092;
						} else if (local1092 > arg5 + arg2 - 1) {
							local1149 = local1092 + 1 - arg5 - arg2;
						}
						@Pc(1185) int local1185 = local1149 * local1149 + local1116 * local1116;
						if (local240 > local1185 || local240 == local1185 && Static123.anIntArrayArray18[local1082][local1092] < local1077) {
							local240 = local1185;
							local8 = local1092;
							local3 = local1082;
							local1077 = Static123.anIntArrayArray18[local1082][local1092];
						}
					}
				}
			}
			if (local240 == 1000) {
				return;
			}
			if (local3 == arg0 && local8 == arg7) {
				return;
			}
		}
		Static196.anInt3703 = local8;
		Static52.aBoolean381 = false;
		Static162.anInt3171 = local3;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(BC)B")
	public static byte method2942(@OriginalArg(1) char arg0) {
		@Pc(36) byte local36;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local36 = (byte) arg0;
		} else if (arg0 == '€') {
			local36 = -128;
		} else if (arg0 == '‚') {
			local36 = -126;
		} else if (arg0 == 'ƒ') {
			local36 = -125;
		} else if (arg0 == '„') {
			local36 = -124;
		} else if (arg0 == '…') {
			local36 = -123;
		} else if (arg0 == '†') {
			local36 = -122;
		} else if (arg0 == '‡') {
			local36 = -121;
		} else if (arg0 == 'ˆ') {
			local36 = -120;
		} else if (arg0 == '‰') {
			local36 = -119;
		} else if (arg0 == 'Š') {
			local36 = -118;
		} else if (arg0 == '‹') {
			local36 = -117;
		} else if (arg0 == 'Œ') {
			local36 = -116;
		} else if (arg0 == 'Ž') {
			local36 = -114;
		} else if (arg0 == '‘') {
			local36 = -111;
		} else if (arg0 == '’') {
			local36 = -110;
		} else if (arg0 == '“') {
			local36 = -109;
		} else if (arg0 == '”') {
			local36 = -108;
		} else if (arg0 == '•') {
			local36 = -107;
		} else if (arg0 == '–') {
			local36 = -106;
		} else if (arg0 == '—') {
			local36 = -105;
		} else if (arg0 == '˜') {
			local36 = -104;
		} else if (arg0 == '™') {
			local36 = -103;
		} else if (arg0 == 'š') {
			local36 = -102;
		} else if (arg0 == '›') {
			local36 = -101;
		} else if (arg0 == 'œ') {
			local36 = -100;
		} else if (arg0 == 'ž') {
			local36 = -98;
		} else if (arg0 == 'Ÿ') {
			local36 = -97;
		} else {
			local36 = 63;
		}
		return local36;
	}
}
