import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!nc", name = "z", descriptor = "I")
	public static int anInt1798;

	@OriginalMember(owner = "client!nc", name = "J", descriptor = "I")
	public static int anInt1802;

	@OriginalMember(owner = "client!nc", name = "B", descriptor = "I")
	public static int anInt1800 = 0;

	@OriginalMember(owner = "client!nc", name = "D", descriptor = "Lclient!fc;")
	public static Class25 aClass25_858 = Static78.method1313("");

	@OriginalMember(owner = "client!nc", name = "C", descriptor = "Lclient!fc;")
	public static Class25 aClass25_857 = aClass25_858;

	@OriginalMember(owner = "client!nc", name = "E", descriptor = "Lclient!fc;")
	public static Class25 aClass25_859 = Static78.method1313(")4l");

	@OriginalMember(owner = "client!nc", name = "F", descriptor = "Lclient!fc;")
	private static Class25 aClass25_860 = Static78.method1313("To create a new account you need to");

	@OriginalMember(owner = "client!nc", name = "G", descriptor = "Lclient!fc;")
	public static Class25 aClass25_861 = aClass25_858;

	@OriginalMember(owner = "client!nc", name = "I", descriptor = "Lclient!fc;")
	public static Class25 aClass25_862 = aClass25_858;

	@OriginalMember(owner = "client!nc", name = "K", descriptor = "Lclient!fc;")
	public static Class25 aClass25_863 = aClass25_858;

	@OriginalMember(owner = "client!nc", name = "M", descriptor = "Lclient!fc;")
	private static Class25 aClass25_864 = Static78.method1313("On");

	@OriginalMember(owner = "client!nc", name = "N", descriptor = "Lclient!fc;")
	public static Class25 aClass25_865 = aClass25_864;

	@OriginalMember(owner = "client!nc", name = "O", descriptor = "Lclient!fc;")
	public static Class25 aClass25_866 = aClass25_858;

	@OriginalMember(owner = "client!nc", name = "P", descriptor = "Lclient!fc;")
	public static Class25 aClass25_867 = aClass25_858;

	@OriginalMember(owner = "client!nc", name = "Q", descriptor = "Lclient!fc;")
	public static Class25 aClass25_868 = aClass25_860;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZIIIIIIIIIII)Z")
	public static boolean method1376(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				Static118.anIntArrayArray29[local7][local11] = 0;
				Static53.anIntArrayArray26[local7][local11] = 99999999;
			}
		}
		Static118.anIntArrayArray29[arg9][arg6] = 99;
		Static53.anIntArrayArray26[arg9][arg6] = 0;
		local11 = arg9;
		@Pc(51) int local51 = 0;
		@Pc(53) int local53 = arg6;
		@Pc(55) byte local55 = 0;
		Static126.anIntArray498[0] = arg9;
		@Pc(61) boolean local61 = false;
		@Pc(64) int local64 = local55 + 1;
		Static123.anIntArray492[0] = arg6;
		@Pc(71) int[][] local71 = Static102.aClass62Array1[Static21.anInt596].anIntArrayArray22;
		@Pc(74) int local74 = Static126.anIntArray498.length;
		@Pc(190) int local190;
		while (local51 != local64) {
			local53 = Static123.anIntArray492[local51];
			local11 = Static126.anIntArray498[local51];
			local51 = (local51 + 1) % local74;
			if (local11 == arg10 && local53 == arg5) {
				local61 = true;
				break;
			}
			if (arg7 != 0) {
				if ((arg7 < 5 || arg7 == 10) && Static102.aClass62Array1[Static21.anInt596].method1443(arg10, local11, arg5, arg1, local53, arg7 - 1)) {
					local61 = true;
					break;
				}
				if (arg7 < 10 && Static102.aClass62Array1[Static21.anInt596].method1440(arg7 - 1, arg5, arg1, local53, arg10, local11)) {
					local61 = true;
					break;
				}
			}
			if (arg8 != 0 && arg3 != 0 && Static102.aClass62Array1[Static21.anInt596].method1450(arg8, arg4, arg10, local53, arg3, local11, arg5)) {
				local61 = true;
				break;
			}
			local190 = Static53.anIntArrayArray26[local11][local53] + 1;
			if (local11 > 0 && Static118.anIntArrayArray29[local11 - 1][local53] == 0 && (local71[local11 - 1][local53] & 0x12C0108) == 0) {
				Static126.anIntArray498[local64] = local11 - 1;
				Static123.anIntArray492[local64] = local53;
				local64 = (local64 + 1) % local74;
				Static118.anIntArrayArray29[local11 - 1][local53] = 2;
				Static53.anIntArrayArray26[local11 - 1][local53] = local190;
			}
			if (local11 < 103 && Static118.anIntArrayArray29[local11 + 1][local53] == 0 && (local71[local11 + 1][local53] & 0x12C0180) == 0) {
				Static126.anIntArray498[local64] = local11 + 1;
				Static123.anIntArray492[local64] = local53;
				Static118.anIntArrayArray29[local11 + 1][local53] = 8;
				Static53.anIntArrayArray26[local11 + 1][local53] = local190;
				local64 = (local64 + 1) % local74;
			}
			if (local53 > 0 && Static118.anIntArrayArray29[local11][local53 - 1] == 0 && (local71[local11][local53 - 1] & 0x12C0102) == 0) {
				Static126.anIntArray498[local64] = local11;
				Static123.anIntArray492[local64] = local53 - 1;
				local64 = (local64 + 1) % local74;
				Static118.anIntArrayArray29[local11][local53 - 1] = 1;
				Static53.anIntArrayArray26[local11][local53 - 1] = local190;
			}
			if (local53 < 103 && Static118.anIntArrayArray29[local11][local53 + 1] == 0 && (local71[local11][local53 + 1] & 0x12C0120) == 0) {
				Static126.anIntArray498[local64] = local11;
				Static123.anIntArray492[local64] = local53 + 1;
				Static118.anIntArrayArray29[local11][local53 + 1] = 4;
				Static53.anIntArrayArray26[local11][local53 + 1] = local190;
				local64 = (local64 + 1) % local74;
			}
			if (local11 > 0 && local53 > 0 && Static118.anIntArrayArray29[local11 - 1][local53 - 1] == 0 && (local71[local11 - 1][local53 - 1] & 0x12C010E) == 0 && (local71[local11 - 1][local53] & 0x12C0108) == 0 && (local71[local11][local53 - 1] & 0x12C0102) == 0) {
				Static126.anIntArray498[local64] = local11 - 1;
				Static123.anIntArray492[local64] = local53 - 1;
				Static118.anIntArrayArray29[local11 - 1][local53 - 1] = 3;
				Static53.anIntArrayArray26[local11 - 1][local53 - 1] = local190;
				local64 = (local64 + 1) % local74;
			}
			if (local11 < 103 && local53 > 0 && Static118.anIntArrayArray29[local11 + 1][local53 - 1] == 0 && (local71[local11 + 1][local53 - 1] & 0x12C0183) == 0 && (local71[local11 + 1][local53] & 0x12C0180) == 0 && (local71[local11][local53 - 1] & 0x12C0102) == 0) {
				Static126.anIntArray498[local64] = local11 + 1;
				Static123.anIntArray492[local64] = local53 - 1;
				Static118.anIntArrayArray29[local11 + 1][local53 - 1] = 9;
				local64 = (local64 + 1) % local74;
				Static53.anIntArrayArray26[local11 + 1][local53 - 1] = local190;
			}
			if (local11 > 0 && local53 < 103 && Static118.anIntArrayArray29[local11 - 1][local53 + 1] == 0 && (local71[local11 - 1][local53 + 1] & 0x12C0138) == 0 && (local71[local11 - 1][local53] & 0x12C0108) == 0 && (local71[local11][local53 + 1] & 0x12C0120) == 0) {
				Static126.anIntArray498[local64] = local11 - 1;
				Static123.anIntArray492[local64] = local53 + 1;
				Static118.anIntArrayArray29[local11 - 1][local53 + 1] = 6;
				local64 = (local64 + 1) % local74;
				Static53.anIntArrayArray26[local11 - 1][local53 + 1] = local190;
			}
			if (local11 < 103 && local53 < 103 && Static118.anIntArrayArray29[local11 + 1][local53 + 1] == 0 && (local71[local11 + 1][local53 + 1] & 0x12C01E0) == 0 && (local71[local11 + 1][local53] & 0x12C0180) == 0 && (local71[local11][local53 + 1] & 0x12C0120) == 0) {
				Static126.anIntArray498[local64] = local11 + 1;
				Static123.anIntArray492[local64] = local53 + 1;
				local64 = (local64 + 1) % local74;
				Static118.anIntArrayArray29[local11 + 1][local53 + 1] = 12;
				Static53.anIntArrayArray26[local11 + 1][local53 + 1] = local190;
			}
		}
		Static106.anInt2479 = 0;
		@Pc(806) int local806;
		@Pc(813) int local813;
		@Pc(820) int local820;
		if (!local61) {
			if (!arg0) {
				return false;
			}
			local190 = 1000;
			local806 = 100;
			for (local813 = arg10 - 10; local813 <= arg10 + 10; local813++) {
				for (local820 = arg5 - 10; local820 <= arg5 + 10; local820++) {
					if (local813 >= 0 && local820 >= 0 && local813 < 104 && local820 < 104 && Static53.anIntArrayArray26[local813][local820] < 100) {
						@Pc(845) int local845 = 0;
						if (arg10 > local813) {
							local845 = arg10 - local813;
						} else if (local813 > arg10 + arg8 - 1) {
							local845 = local813 + 1 - arg10 - arg8;
						}
						@Pc(881) int local881 = 0;
						if (arg5 > local820) {
							local881 = arg5 - local820;
						} else if (local820 > arg5 + arg3 - 1) {
							local881 = local820 + 1 - arg5 - arg3;
						}
						@Pc(921) int local921 = local845 * local845 + local881 * local881;
						if (local921 < local190 || local190 == local921 && local806 > Static53.anIntArrayArray26[local813][local820]) {
							local53 = local820;
							local190 = local921;
							local806 = Static53.anIntArrayArray26[local813][local820];
							local11 = local813;
						}
					}
				}
			}
			if (local190 == 1000) {
				return false;
			}
			if (arg9 == local11 && local53 == arg6) {
				return false;
			}
			Static106.anInt2479 = 1;
		}
		@Pc(984) byte local984 = 0;
		Static126.anIntArray498[0] = local11;
		local51 = local984 + 1;
		Static123.anIntArray492[0] = local53;
		local190 = local806 = Static118.anIntArrayArray29[local11][local53];
		while (local11 != arg9 || arg6 != local53) {
			if (local806 != local190) {
				Static126.anIntArray498[local51] = local11;
				local806 = local190;
				Static123.anIntArray492[local51++] = local53;
			}
			if ((local190 & 0x2) != 0) {
				local11++;
			} else if ((local190 & 0x8) != 0) {
				local11--;
			}
			if ((local190 & 0x1) != 0) {
				local53++;
			} else if ((local190 & 0x4) != 0) {
				local53--;
			}
			local190 = Static118.anIntArrayArray29[local11][local53];
		}
		if (local51 > 0) {
			local74 = local51;
			if (local51 > 25) {
				local74 = 25;
			}
			local51--;
			local813 = Static123.anIntArray492[local51];
			@Pc(1085) int local1085 = Static126.anIntArray498[local51];
			if (arg2 == 0) {
				Static68.aClass1_Sub5_Sub1_2.method688(241);
				Static68.aClass1_Sub5_Sub1_2.method676(local74 + local74 + 3);
			}
			if (arg2 == 1) {
				Static68.aClass1_Sub5_Sub1_2.method688(156);
				Static68.aClass1_Sub5_Sub1_2.method676(local74 + local74 + 3 + 14);
			}
			if (arg2 == 2) {
				Static68.aClass1_Sub5_Sub1_2.method688(216);
				Static68.aClass1_Sub5_Sub1_2.method676(local74 + local74 + 3);
			}
			Static68.aClass1_Sub5_Sub1_2.method631(local813 + Static47.anInt1211);
			Static68.aClass1_Sub5_Sub1_2.method631(Static46.anInt1190 + local1085);
			Static62.anInt1391 = Static126.anIntArray498[0];
			Static110.anInt2547 = Static123.anIntArray492[0];
			for (local820 = 1; local820 < local74; local820++) {
				local51--;
				Static68.aClass1_Sub5_Sub1_2.method666(Static126.anIntArray498[local51] - local1085);
				Static68.aClass1_Sub5_Sub1_2.method667(Static123.anIntArray492[local51] - local813);
			}
			Static68.aClass1_Sub5_Sub1_2.method676(Static99.aBooleanArray11[82] ? 1 : 0);
			return true;
		} else if (arg2 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIILclient!od;Lclient!ac;I)V")
	public static void method1377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class62 arg5, @OriginalArg(7) Class4 arg6, @OriginalArg(8) int arg7) {
		if (Static63.aBoolean55 && (Static116.aByteArrayArrayArray7[0][arg2][arg0] & 0x2) == 0) {
			if ((Static116.aByteArrayArrayArray7[arg4][arg2][arg0] & 0x10) != 0) {
				return;
			}
			if (Static61.method1085(arg2, arg0, arg4) != Static82.anInt1812) {
				return;
			}
		}
		if (Static121.anInt2875 > arg4) {
			Static121.anInt2875 = arg4;
		}
		@Pc(59) int local59 = Static7.anIntArrayArrayArray3[arg4][arg2][arg0];
		@Pc(69) int local69 = Static7.anIntArrayArrayArray3[arg4][arg2 + 1][arg0];
		@Pc(81) int local81 = Static7.anIntArrayArrayArray3[arg4][arg2 + 1][arg0 + 1];
		@Pc(91) int local91 = Static7.anIntArrayArrayArray3[arg4][arg2][arg0 + 1];
		@Pc(95) Class1_Sub2_Sub6 local95 = Static78.method1315(arg7);
		@Pc(101) int local101 = arg1 + (arg3 << 6);
		if (local95.anInt849 == 1) {
			local101 += 256;
		}
		@Pc(121) int local121 = arg2 + (arg0 << 7) + (arg7 << 14) + 1073741824;
		if (local95.anInt877 == 0) {
			local121 += Integer.MIN_VALUE;
		}
		@Pc(146) int local146 = local81 + local59 + local69 + local91 >> 2;
		if (local95.method706()) {
			Static23.method553(arg4, arg3, arg0, arg2, local95);
		}
		@Pc(198) Class1_Sub2_Sub3 local198;
		if (arg1 != 22) {
			@Pc(294) int local294;
			if (arg1 == 10 || arg1 == 11) {
				if (local95.anInt847 == -1 && local95.anIntArray171 == null) {
					local198 = local95.method717(local81, local69, local91, arg3, local59, 10);
				} else {
					local198 = new Class1_Sub2_Sub3_Sub5(arg7, 10, arg3, local59, local69, local81, local91, local95.anInt847, true, null);
				}
				if (local198 != null) {
					@Pc(291) int local291;
					if (arg3 == 1 || arg3 == 3) {
						local291 = local95.anInt845;
						local294 = local95.anInt857;
					} else {
						local294 = local95.anInt845;
						local291 = local95.anInt857;
					}
					@Pc(304) int local304 = 0;
					if (arg1 == 11) {
						local304 += 256;
					}
					if (arg6.method86(arg4, arg2, arg0, local146, local294, local291, local198, local304, local121, local101) && local95.aBoolean29) {
						@Pc(326) int local326 = 15;
						if (local198 instanceof Class1_Sub2_Sub3_Sub2) {
							local326 = ((Class1_Sub2_Sub3_Sub2) local198).method475() / 4;
							if (local326 > 30) {
								local326 = 30;
							}
						}
						for (@Pc(342) int local342 = 0; local342 <= local294; local342++) {
							for (@Pc(346) int local346 = 0; local346 <= local291; local346++) {
								if (Static28.aByteArrayArrayArray2[arg4][arg2 + local342][local346 + arg0] < local326) {
									Static28.aByteArrayArrayArray2[arg4][arg2 + local342][arg0 + local346] = (byte) local326;
								}
							}
						}
					}
				}
				if (local95.anInt871 != 0 && arg5 != null) {
					arg5.method1455(local95.aBoolean34, arg0, local95.anInt845, arg2, local95.anInt857, arg3);
				}
			} else if (arg1 >= 12) {
				if (local95.anInt847 == -1 && local95.anIntArray171 == null) {
					local198 = local95.method717(local81, local69, local91, arg3, local59, arg1);
				} else {
					local198 = new Class1_Sub2_Sub3_Sub5(arg7, arg1, arg3, local59, local69, local81, local91, local95.anInt847, true, null);
				}
				arg6.method86(arg4, arg2, arg0, local146, 1, 1, local198, 0, local121, local101);
				if (arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg4 > 0) {
					Static97.anIntArrayArrayArray7[arg4][arg2][arg0] |= 0x924;
				}
				if (local95.anInt871 != 0 && arg5 != null) {
					arg5.method1455(local95.aBoolean34, arg0, local95.anInt845, arg2, local95.anInt857, arg3);
				}
			} else if (arg1 == 0) {
				if (local95.anInt847 == -1 && local95.anIntArray171 == null) {
					local198 = local95.method717(local81, local69, local91, arg3, local59, 0);
				} else {
					local198 = new Class1_Sub2_Sub3_Sub5(arg7, 0, arg3, local59, local69, local81, local91, local95.anInt847, true, null);
				}
				arg6.method82(arg4, arg2, arg0, local146, local198, null, Static46.anIntArray240[arg3], 0, local121, local101);
				if (arg3 == 0) {
					if (local95.aBoolean29) {
						Static28.aByteArrayArrayArray2[arg4][arg2][arg0] = 50;
						Static28.aByteArrayArrayArray2[arg4][arg2][arg0 + 1] = 50;
					}
					if (local95.aBoolean31) {
						Static97.anIntArrayArrayArray7[arg4][arg2][arg0] |= 0x249;
					}
				} else if (arg3 == 1) {
					if (local95.aBoolean29) {
						Static28.aByteArrayArrayArray2[arg4][arg2][arg0 + 1] = 50;
						Static28.aByteArrayArrayArray2[arg4][arg2 + 1][arg0 + 1] = 50;
					}
					if (local95.aBoolean31) {
						Static97.anIntArrayArrayArray7[arg4][arg2][arg0 + 1] |= 0x492;
					}
				} else if (arg3 == 2) {
					if (local95.aBoolean29) {
						Static28.aByteArrayArrayArray2[arg4][arg2 + 1][arg0] = 50;
						Static28.aByteArrayArrayArray2[arg4][arg2 + 1][arg0 + 1] = 50;
					}
					if (local95.aBoolean31) {
						Static97.anIntArrayArrayArray7[arg4][arg2 + 1][arg0] |= 0x249;
					}
				} else if (arg3 == 3) {
					if (local95.aBoolean29) {
						Static28.aByteArrayArrayArray2[arg4][arg2][arg0] = 50;
						Static28.aByteArrayArrayArray2[arg4][arg2 + 1][arg0] = 50;
					}
					if (local95.aBoolean31) {
						Static97.anIntArrayArrayArray7[arg4][arg2][arg0] |= 0x492;
					}
				}
				if (local95.anInt871 != 0 && arg5 != null) {
					arg5.method1452(arg0, arg2, arg1, local95.aBoolean34, arg3);
				}
				if (local95.anInt873 != 16) {
					arg6.method44(arg4, arg2, arg0, local95.anInt873);
				}
			} else if (arg1 == 1) {
				if (local95.anInt847 == -1 && local95.anIntArray171 == null) {
					local198 = local95.method717(local81, local69, local91, arg3, local59, 1);
				} else {
					local198 = new Class1_Sub2_Sub3_Sub5(arg7, 1, arg3, local59, local69, local81, local91, local95.anInt847, true, null);
				}
				arg6.method82(arg4, arg2, arg0, local146, local198, null, Static1.anIntArray8[arg3], 0, local121, local101);
				if (local95.aBoolean29) {
					if (arg3 == 0) {
						Static28.aByteArrayArrayArray2[arg4][arg2][arg0 + 1] = 50;
					} else if (arg3 == 1) {
						Static28.aByteArrayArrayArray2[arg4][arg2 + 1][arg0 + 1] = 50;
					} else if (arg3 == 2) {
						Static28.aByteArrayArrayArray2[arg4][arg2 + 1][arg0] = 50;
					} else if (arg3 == 3) {
						Static28.aByteArrayArrayArray2[arg4][arg2][arg0] = 50;
					}
				}
				if (local95.anInt871 != 0 && arg5 != null) {
					arg5.method1452(arg0, arg2, arg1, local95.aBoolean34, arg3);
				}
			} else {
				@Pc(941) int local941;
				@Pc(981) Class1_Sub2_Sub3 local981;
				if (arg1 == 2) {
					local941 = arg3 + 1 & 0x3;
					@Pc(966) Class1_Sub2_Sub3 local966;
					if (local95.anInt847 == -1 && local95.anIntArray171 == null) {
						local966 = local95.method717(local81, local69, local91, arg3 + 4, local59, 2);
						local981 = local95.method717(local81, local69, local91, local941, local59, 2);
					} else {
						local966 = new Class1_Sub2_Sub3_Sub5(arg7, 2, arg3 + 4, local59, local69, local81, local91, local95.anInt847, true, null);
						local981 = new Class1_Sub2_Sub3_Sub5(arg7, 2, local941, local59, local69, local81, local91, local95.anInt847, true, null);
					}
					arg6.method82(arg4, arg2, arg0, local146, local966, local981, Static46.anIntArray240[arg3], Static46.anIntArray240[local941], local121, local101);
					if (local95.aBoolean31) {
						if (arg3 == 0) {
							Static97.anIntArrayArrayArray7[arg4][arg2][arg0] |= 0x249;
							Static97.anIntArrayArrayArray7[arg4][arg2][arg0 + 1] |= 0x492;
						} else if (arg3 == 1) {
							Static97.anIntArrayArrayArray7[arg4][arg2][arg0 + 1] |= 0x492;
							Static97.anIntArrayArrayArray7[arg4][arg2 + 1][arg0] |= 0x249;
						} else if (arg3 == 2) {
							Static97.anIntArrayArrayArray7[arg4][arg2 + 1][arg0] |= 0x249;
							Static97.anIntArrayArrayArray7[arg4][arg2][arg0] |= 0x492;
						} else if (arg3 == 3) {
							Static97.anIntArrayArrayArray7[arg4][arg2][arg0] |= 0x492;
							Static97.anIntArrayArrayArray7[arg4][arg2][arg0] |= 0x249;
						}
					}
					if (local95.anInt871 != 0 && arg5 != null) {
						arg5.method1452(arg0, arg2, arg1, local95.aBoolean34, arg3);
					}
					if (local95.anInt873 != 16) {
						arg6.method44(arg4, arg2, arg0, local95.anInt873);
					}
				} else if (arg1 == 3) {
					if (local95.anInt847 == -1 && local95.anIntArray171 == null) {
						local198 = local95.method717(local81, local69, local91, arg3, local59, 3);
					} else {
						local198 = new Class1_Sub2_Sub3_Sub5(arg7, 3, arg3, local59, local69, local81, local91, local95.anInt847, true, null);
					}
					arg6.method82(arg4, arg2, arg0, local146, local198, null, Static1.anIntArray8[arg3], 0, local121, local101);
					if (local95.aBoolean29) {
						if (arg3 == 0) {
							Static28.aByteArrayArrayArray2[arg4][arg2][arg0 + 1] = 50;
						} else if (arg3 == 1) {
							Static28.aByteArrayArrayArray2[arg4][arg2 + 1][arg0 + 1] = 50;
						} else if (arg3 == 2) {
							Static28.aByteArrayArrayArray2[arg4][arg2 + 1][arg0] = 50;
						} else if (arg3 == 3) {
							Static28.aByteArrayArrayArray2[arg4][arg2][arg0] = 50;
						}
					}
					if (local95.anInt871 != 0 && arg5 != null) {
						arg5.method1452(arg0, arg2, arg1, local95.aBoolean34, arg3);
					}
				} else if (arg1 == 9) {
					if (local95.anInt847 == -1 && local95.anIntArray171 == null) {
						local198 = local95.method717(local81, local69, local91, arg3, local59, arg1);
					} else {
						local198 = new Class1_Sub2_Sub3_Sub5(arg7, arg1, arg3, local59, local69, local81, local91, local95.anInt847, true, null);
					}
					arg6.method86(arg4, arg2, arg0, local146, 1, 1, local198, 0, local121, local101);
					if (local95.anInt871 != 0 && arg5 != null) {
						arg5.method1455(local95.aBoolean34, arg0, local95.anInt845, arg2, local95.anInt857, arg3);
					}
				} else {
					if (local95.aBoolean32) {
						if (arg3 == 1) {
							local941 = local91;
							local91 = local81;
							local81 = local69;
							local69 = local59;
							local59 = local941;
						} else if (arg3 == 2) {
							local941 = local91;
							local91 = local69;
							local69 = local941;
							local941 = local81;
							local81 = local59;
							local59 = local941;
						} else if (arg3 == 3) {
							local941 = local91;
							local91 = local59;
							local59 = local69;
							local69 = local81;
							local81 = local941;
						}
					}
					if (arg1 == 4) {
						if (local95.anInt847 == -1 && local95.anIntArray171 == null) {
							local198 = local95.method717(local81, local69, local91, 0, local59, 4);
						} else {
							local198 = new Class1_Sub2_Sub3_Sub5(arg7, 4, 0, local59, local69, local81, local91, local95.anInt847, true, null);
						}
						arg6.method51(arg4, arg2, arg0, local146, local198, Static46.anIntArray240[arg3], arg3 * 512, 0, 0, local121, local101);
					} else if (arg1 == 5) {
						local941 = 16;
						local294 = arg6.method62(arg4, arg2, arg0);
						if (local294 != 0) {
							local941 = Static78.method1315(local294 >> 14 & 0x7FFF).anInt873;
						}
						if (local95.anInt847 == -1 && local95.anIntArray171 == null) {
							local981 = local95.method717(local81, local69, local91, 0, local59, 4);
						} else {
							local981 = new Class1_Sub2_Sub3_Sub5(arg7, 4, 0, local59, local69, local81, local91, local95.anInt847, true, null);
						}
						arg6.method51(arg4, arg2, arg0, local146, local981, Static46.anIntArray240[arg3], arg3 * 512, Static61.anIntArray264[arg3] * local941, Static97.anIntArray398[arg3] * local941, local121, local101);
					} else if (arg1 == 6) {
						if (local95.anInt847 == -1 && local95.anIntArray171 == null) {
							local198 = local95.method717(local81, local69, local91, 0, local59, 4);
						} else {
							local198 = new Class1_Sub2_Sub3_Sub5(arg7, 4, 0, local59, local69, local81, local91, local95.anInt847, true, null);
						}
						arg6.method51(arg4, arg2, arg0, local146, local198, 256, arg3, 0, 0, local121, local101);
					} else if (arg1 == 7) {
						if (local95.anInt847 == -1 && local95.anIntArray171 == null) {
							local198 = local95.method717(local81, local69, local91, 0, local59, 4);
						} else {
							local198 = new Class1_Sub2_Sub3_Sub5(arg7, 4, 0, local59, local69, local81, local91, local95.anInt847, true, null);
						}
						arg6.method51(arg4, arg2, arg0, local146, local198, 512, arg3, 0, 0, local121, local101);
					} else if (arg1 == 8) {
						if (local95.anInt847 == -1 && local95.anIntArray171 == null) {
							local198 = local95.method717(local81, local69, local91, 0, local59, 4);
						} else {
							local198 = new Class1_Sub2_Sub3_Sub5(arg7, 4, 0, local59, local69, local81, local91, local95.anInt847, true, null);
						}
						arg6.method51(arg4, arg2, arg0, local146, local198, 768, arg3, 0, 0, local121, local101);
					}
				}
			}
		} else if (!Static63.aBoolean55 || local95.anInt877 != 0 || local95.anInt871 == 1 || local95.aBoolean35) {
			if (local95.anInt847 == -1 && local95.anIntArray171 == null) {
				local198 = local95.method717(local81, local69, local91, arg3, local59, 22);
			} else {
				local198 = new Class1_Sub2_Sub3_Sub5(arg7, 22, arg3, local59, local69, local81, local91, local95.anInt847, true, null);
			}
			arg6.method76(arg4, arg2, arg0, local146, local198, local121, local101);
			if (local95.anInt871 == 1 && arg5 != null) {
				arg5.method1451(arg2, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)I")
	public static int method1378(@OriginalArg(1) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(6) int local6 = local0 | local0 >>> 1;
		@Pc(16) int local16 = local6 | local6 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(28) int local28 = local22 | local22 >>> 8;
		@Pc(39) int local39 = local28 | local28 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V")
	public static void method1379() {
		aClass25_864 = null;
		aClass25_863 = null;
		aClass25_859 = null;
		aClass25_865 = null;
		aClass25_860 = null;
		aClass25_857 = null;
		aClass25_858 = null;
		aClass25_868 = null;
		aClass25_866 = null;
		aClass25_862 = null;
		aClass25_867 = null;
		aClass25_861 = null;
	}
}
