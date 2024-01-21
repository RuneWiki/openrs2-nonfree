import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "Z")
	public static boolean aBoolean94;

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "Lclient!he;")
	public static Class4_Sub5 aClass4_Sub5_37;

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "[I")
	public static int[] anIntArray177;

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "[[B")
	public static byte[][] aByteArrayArray5 = new byte[250][];

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "Lclient!ja;")
	public static Class39 aClass39_878 = Static28.method504("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "Lclient!ja;")
	private static Class39 aClass39_879 = Static28.method504("Please contact customer support)3");

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
	public static int anInt1659 = 0;

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "Lclient!ja;")
	public static Class39 aClass39_880 = Static28.method504("Standort");

	@OriginalMember(owner = "client!kf", name = "l", descriptor = "Lclient!ja;")
	public static Class39 aClass39_881 = aClass39_879;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!he;)Z")
	public static boolean method1146(@OriginalArg(1) Class4_Sub5 arg0) {
		@Pc(6) int local6 = arg0.anInt1241;
		if (local6 == 205) {
			Static44.anInt1128 = 250;
			return true;
		}
		@Pc(34) int local34;
		@Pc(38) int local38;
		if (local6 >= 300 && local6 <= 313) {
			local34 = (local6 - 300) / 2;
			local38 = local6 & 0x1;
			Static58.aClass63_1.method1693(local34, local38 == 1);
		}
		if (local6 >= 314 && local6 <= 323) {
			local34 = (local6 - 314) / 2;
			local38 = local6 & 0x1;
			Static58.aClass63_1.method1694(local38 == 1, local34);
		}
		if (local6 == 324) {
			Static58.aClass63_1.method1702(false);
		}
		if (local6 == 325) {
			Static58.aClass63_1.method1702(true);
		}
		if (local6 == 326) {
			Static114.aClass4_Sub16_Sub1_3.method1499(86);
			Static58.aClass63_1.method1705(Static114.aClass4_Sub16_Sub1_3);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIBIIZIIIII)Z")
	public static boolean method1147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 104; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				Static122.anIntArrayArray24[local3][local7] = 0;
				Static102.anIntArrayArray21[local3][local7] = 99999999;
			}
		}
		Static122.anIntArrayArray24[arg0][arg8] = 99;
		local7 = arg0;
		Static102.anIntArrayArray21[arg0][arg8] = 0;
		@Pc(49) int local49 = arg8;
		@Pc(51) byte local51 = 0;
		@Pc(53) boolean local53 = false;
		Static43.anIntArray119[0] = arg0;
		@Pc(60) int local60 = local51 + 1;
		Static58.anIntArray159[0] = arg8;
		@Pc(65) int local65 = Static43.anIntArray119.length;
		@Pc(67) int local67 = 0;
		@Pc(72) int[][] local72 = Static109.aClass81Array1[Static131.anInt3202].anIntArrayArray29;
		@Pc(184) int local184;
		while (local67 != local60) {
			local7 = Static43.anIntArray119[local67];
			local49 = Static58.anIntArray159[local67];
			local67 = (local67 + 1) % local65;
			if (local7 == arg2 && arg1 == local49) {
				local53 = true;
				break;
			}
			if (arg7 != 0) {
				if ((arg7 < 5 || arg7 == 10) && Static109.aClass81Array1[Static131.anInt3202].method2228(arg2, local49, local7, arg7 - 1, arg1, arg6)) {
					local53 = true;
					break;
				}
				if (arg7 < 10 && Static109.aClass81Array1[Static131.anInt3202].method2227(arg7 - 1, arg1, arg2, local49, arg6, local7)) {
					local53 = true;
					break;
				}
			}
			if (arg10 != 0 && arg9 != 0 && Static109.aClass81Array1[Static131.anInt3202].method2232(arg1, arg9, local49, arg3, arg10, local7, arg2)) {
				local53 = true;
				break;
			}
			local184 = Static102.anIntArrayArray21[local7][local49] + 1;
			if (local7 > 0 && Static122.anIntArrayArray24[local7 - 1][local49] == 0 && (local72[local7 - 1][local49] & 0x12C0108) == 0) {
				Static43.anIntArray119[local60] = local7 - 1;
				Static58.anIntArray159[local60] = local49;
				local60 = (local60 + 1) % local65;
				Static122.anIntArrayArray24[local7 - 1][local49] = 2;
				Static102.anIntArrayArray21[local7 - 1][local49] = local184;
			}
			if (local7 < 103 && Static122.anIntArrayArray24[local7 + 1][local49] == 0 && (local72[local7 + 1][local49] & 0x12C0180) == 0) {
				Static43.anIntArray119[local60] = local7 + 1;
				Static58.anIntArray159[local60] = local49;
				local60 = (local60 + 1) % local65;
				Static122.anIntArrayArray24[local7 + 1][local49] = 8;
				Static102.anIntArrayArray21[local7 + 1][local49] = local184;
			}
			if (local49 > 0 && Static122.anIntArrayArray24[local7][local49 - 1] == 0 && (local72[local7][local49 - 1] & 0x12C0102) == 0) {
				Static43.anIntArray119[local60] = local7;
				Static58.anIntArray159[local60] = local49 - 1;
				Static122.anIntArrayArray24[local7][local49 - 1] = 1;
				local60 = (local60 + 1) % local65;
				Static102.anIntArrayArray21[local7][local49 - 1] = local184;
			}
			if (local49 < 103 && Static122.anIntArrayArray24[local7][local49 + 1] == 0 && (local72[local7][local49 + 1] & 0x12C0120) == 0) {
				Static43.anIntArray119[local60] = local7;
				Static58.anIntArray159[local60] = local49 + 1;
				local60 = (local60 + 1) % local65;
				Static122.anIntArrayArray24[local7][local49 + 1] = 4;
				Static102.anIntArrayArray21[local7][local49 + 1] = local184;
			}
			if (local7 > 0 && local49 > 0 && Static122.anIntArrayArray24[local7 - 1][local49 - 1] == 0 && (local72[local7 - 1][local49 - 1] & 0x12C010E) == 0 && (local72[local7 - 1][local49] & 0x12C0108) == 0 && (local72[local7][local49 - 1] & 0x12C0102) == 0) {
				Static43.anIntArray119[local60] = local7 - 1;
				Static58.anIntArray159[local60] = local49 - 1;
				Static122.anIntArrayArray24[local7 - 1][local49 - 1] = 3;
				Static102.anIntArrayArray21[local7 - 1][local49 - 1] = local184;
				local60 = (local60 + 1) % local65;
			}
			if (local7 < 103 && local49 > 0 && Static122.anIntArrayArray24[local7 + 1][local49 - 1] == 0 && (local72[local7 + 1][local49 - 1] & 0x12C0183) == 0 && (local72[local7 + 1][local49] & 0x12C0180) == 0 && (local72[local7][local49 - 1] & 0x12C0102) == 0) {
				Static43.anIntArray119[local60] = local7 + 1;
				Static58.anIntArray159[local60] = local49 - 1;
				Static122.anIntArrayArray24[local7 + 1][local49 - 1] = 9;
				Static102.anIntArrayArray21[local7 + 1][local49 - 1] = local184;
				local60 = (local60 + 1) % local65;
			}
			if (local7 > 0 && local49 < 103 && Static122.anIntArrayArray24[local7 - 1][local49 + 1] == 0 && (local72[local7 - 1][local49 + 1] & 0x12C0138) == 0 && (local72[local7 - 1][local49] & 0x12C0108) == 0 && (local72[local7][local49 + 1] & 0x12C0120) == 0) {
				Static43.anIntArray119[local60] = local7 - 1;
				Static58.anIntArray159[local60] = local49 + 1;
				Static122.anIntArrayArray24[local7 - 1][local49 + 1] = 6;
				Static102.anIntArrayArray21[local7 - 1][local49 + 1] = local184;
				local60 = (local60 + 1) % local65;
			}
			if (local7 < 103 && local49 < 103 && Static122.anIntArrayArray24[local7 + 1][local49 + 1] == 0 && (local72[local7 + 1][local49 + 1] & 0x12C01E0) == 0 && (local72[local7 + 1][local49] & 0x12C0180) == 0 && (local72[local7][local49 + 1] & 0x12C0120) == 0) {
				Static43.anIntArray119[local60] = local7 + 1;
				Static58.anIntArray159[local60] = local49 + 1;
				local60 = (local60 + 1) % local65;
				Static122.anIntArrayArray24[local7 + 1][local49 + 1] = 12;
				Static102.anIntArrayArray21[local7 + 1][local49 + 1] = local184;
			}
		}
		Static40.anInt997 = 0;
		@Pc(819) int local819;
		@Pc(826) int local826;
		@Pc(857) int local857;
		if (!local53) {
			if (!arg5) {
				return false;
			}
			@Pc(811) int local811 = 100;
			local184 = 1000;
			for (local819 = arg2 - 10; local819 <= arg2 + 10; local819++) {
				for (local826 = arg1 - 10; local826 <= arg1 + 10; local826++) {
					if (local819 >= 0 && local826 >= 0 && local819 < 104 && local826 < 104 && Static102.anIntArrayArray21[local819][local826] < 100) {
						@Pc(855) int local855 = 0;
						local857 = 0;
						if (local826 < arg1) {
							local855 = arg1 - local826;
						} else if (arg1 + arg9 - 1 < local826) {
							local855 = local826 + 1 - arg1 - arg9;
						}
						if (local819 < arg2) {
							local857 = arg2 - local819;
						} else if (arg2 + arg10 - 1 < local819) {
							local857 = local819 + 1 - arg10 - arg2;
						}
						@Pc(931) int local931 = local855 * local855 + local857 * local857;
						if (local184 > local931 || local931 == local184 && Static102.anIntArrayArray21[local819][local826] < local811) {
							local49 = local826;
							local184 = local931;
							local7 = local819;
							local811 = Static102.anIntArrayArray21[local819][local826];
						}
					}
				}
			}
			if (local184 == 1000) {
				return false;
			}
			if (local7 == arg0 && local49 == arg8) {
				return false;
			}
			Static40.anInt997 = 1;
		}
		@Pc(1002) byte local1002 = 0;
		Static43.anIntArray119[0] = local7;
		local67 = local1002 + 1;
		Static58.anIntArray159[0] = local49;
		@Pc(1026) int local1026;
		local184 = local1026 = Static122.anIntArrayArray24[local7][local49];
		while (local7 != arg0 || local49 != arg8) {
			if (local1026 != local184) {
				local1026 = local184;
				Static43.anIntArray119[local67] = local7;
				Static58.anIntArray159[local67++] = local49;
			}
			if ((local184 & 0x2) != 0) {
				local7++;
			} else if ((local184 & 0x8) != 0) {
				local7--;
			}
			if ((local184 & 0x1) != 0) {
				local49++;
			} else if ((local184 & 0x4) != 0) {
				local49--;
			}
			local184 = Static122.anIntArrayArray24[local7][local49];
		}
		if (local67 > 0) {
			local65 = local67--;
			if (local65 > 25) {
				local65 = 25;
			}
			local826 = Static58.anIntArray159[local67];
			local819 = Static43.anIntArray119[local67];
			if (arg4 == 0) {
				Static114.aClass4_Sub16_Sub1_3.method1499(129);
				Static114.aClass4_Sub16_Sub1_3.method1459(local65 + local65 + 3);
			}
			if (arg4 == 1) {
				Static114.aClass4_Sub16_Sub1_3.method1499(135);
				Static114.aClass4_Sub16_Sub1_3.method1459(local65 + local65 + 14 + 3);
			}
			if (arg4 == 2) {
				Static114.aClass4_Sub16_Sub1_3.method1499(217);
				Static114.aClass4_Sub16_Sub1_3.method1459(local65 + local65 + 3);
			}
			Static114.aClass4_Sub16_Sub1_3.method1473(local819 + Static36.anInt909);
			Static125.anInt3127 = Static43.anIntArray119[0];
			Static22.anInt642 = Static58.anIntArray159[0];
			for (local857 = 1; local857 < local65; local857++) {
				local67--;
				Static114.aClass4_Sub16_Sub1_3.method1456(Static43.anIntArray119[local67] - local819);
				Static114.aClass4_Sub16_Sub1_3.method1459(Static58.anIntArray159[local67] - local826);
			}
			Static114.aClass4_Sub16_Sub1_3.method1448(Static96.aBooleanArray11[82] ? 1 : 0);
			Static114.aClass4_Sub16_Sub1_3.method1473(Static24.anInt503 + local826);
			return true;
		} else if (arg4 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
	public static void method1148() {
		aByteArrayArray5 = null;
		aClass39_878 = null;
		anIntArray177 = null;
		aClass4_Sub5_37 = null;
		aClass39_879 = null;
		aClass39_880 = null;
		aClass39_881 = null;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IILclient!ja;)V")
	public static void method1149(@OriginalArg(0) int arg0, @OriginalArg(2) Class39 arg1) {
		@Pc(10) boolean local10 = false;
		@Pc(16) Class39 local16 = arg1.method937().method955();
		for (@Pc(22) int local22 = 0; local22 < Static122.anInt3021; local22++) {
			@Pc(30) Class4_Sub2_Sub1_Sub1_Sub1 local30 = Static44.aClass4_Sub2_Sub1_Sub1_Sub1Array1[Static116.anIntArray312[local22]];
			if (local30 != null && local30.aClass39_1279 != null && local30.aClass39_1279.method954(local16)) {
				method1147(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray300[0], local30.anIntArray296[0], local30.anIntArray300[0], 0, 2, false, 0, 0, Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray296[0], 1, 1);
				local10 = true;
				if (arg0 == 1) {
					Static114.aClass4_Sub16_Sub1_3.method1499(98);
					Static114.aClass4_Sub16_Sub1_3.method1441(Static116.anIntArray312[local22]);
				}
				if (arg0 == 4) {
					Static114.aClass4_Sub16_Sub1_3.method1499(161);
					Static114.aClass4_Sub16_Sub1_3.method1473(Static116.anIntArray312[local22]);
				}
				break;
			}
		}
		if (!local10) {
			Static40.method672(0, Static62.method1123(new Class39[] { Static29.aClass39_409, local16 }), Static72.aClass39_423);
		}
	}
}
