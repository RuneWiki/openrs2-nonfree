import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!rf", name = "o", descriptor = "I")
	public static int anInt3388;

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "Lclient!dd;")
	public static Class17 aClass17_23 = new Class17(100);

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "[I")
	public static int[] anIntArray300 = new int[2048];

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "Lclient!mg;")
	public static Class55 aClass55_2 = new Class55();

	@OriginalMember(owner = "client!rf", name = "h", descriptor = "Z")
	public static boolean aBoolean138 = true;

	@OriginalMember(owner = "client!rf", name = "i", descriptor = "Lclient!ai;")
	private static Class6 aClass6_989 = Static38.method685("Login limit exceeded)3");

	@OriginalMember(owner = "client!rf", name = "j", descriptor = "Lclient!ai;")
	public static Class6 aClass6_990 = Static38.method685("hitmarks");

	@OriginalMember(owner = "client!rf", name = "k", descriptor = "Lclient!ai;")
	public static Class6 aClass6_991 = aClass6_989;

	@OriginalMember(owner = "client!rf", name = "l", descriptor = "Lclient!ai;")
	private static Class6 aClass6_992 = Static38.method685("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!rf", name = "m", descriptor = "Lclient!ai;")
	public static Class6 aClass6_993 = aClass6_992;

	@OriginalMember(owner = "client!rf", name = "p", descriptor = "Lclient!ai;")
	private static Class6 aClass6_995 = Static38.method685("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!rf", name = "n", descriptor = "Lclient!ai;")
	public static Class6 aClass6_994 = aClass6_995;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIBIILclient!ka;IILclient!l;)V")
	public static void method2226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class44 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class48 arg8) {
		@Pc(5) Class2_Sub3_Sub6 local5 = Static163.method2609(arg7);
		@Pc(28) int local28;
		@Pc(31) int local31;
		if (arg0 == 1 || arg0 == 3) {
			local31 = local5.anInt1205;
			local28 = local5.anInt1195;
		} else {
			local28 = local5.anInt1205;
			local31 = local5.anInt1195;
		}
		@Pc(48) int local48;
		@Pc(52) int local52;
		if (local28 + arg4 > 104) {
			local48 = arg4;
			local52 = arg4 + 1;
		} else {
			local48 = arg4 + (local28 >> 1);
			local52 = (local28 + 1 >> 1) + arg4;
		}
		@Pc(88) int local88;
		@Pc(81) int local81;
		if (local31 + arg2 <= 104) {
			local81 = (local31 + 1 >> 1) + arg2;
			local88 = arg2 + (local31 >> 1);
		} else {
			local88 = arg2;
			local81 = arg2 + 1;
		}
		@Pc(100) int[][] local100 = Static165.anIntArrayArrayArray10[arg1];
		@Pc(126) int local126 = local100[local52][local81] + local100[local48][local81] + local100[local52][local88] + local100[local48][local88] >> 2;
		@Pc(134) int local134 = (local28 << 6) + (arg4 << 7);
		@Pc(142) int local142 = (local31 << 6) + (arg2 << 7);
		@Pc(154) int local154 = (arg7 << 14) + arg4 + (arg2 << 7) + 1073741824;
		@Pc(160) int local160 = arg3 + (arg0 << 6);
		if (local5.anInt1199 == 1) {
			local160 += 256;
		}
		if (local5.anInt1219 == 0) {
			local154 += Integer.MIN_VALUE;
		}
		@Pc(195) Class2_Sub3_Sub5 local195;
		if (arg3 == 22) {
			if (local5.anInt1201 == -1 && local5.anIntArray61 == null) {
				local195 = local5.method742(local100, local142, local134, local126, 22, arg0);
			} else {
				local195 = new Class2_Sub3_Sub5_Sub6(arg7, 22, arg0, arg1, arg4, arg2, local5.anInt1201, true, null);
			}
			arg5.method1290(arg6, arg4, arg2, local126, local195, local154, local160);
			if (local5.anInt1192 == 1) {
				arg8.method1481(arg4, arg2);
			}
		} else if (arg3 == 10 || arg3 == 11) {
			if (local5.anInt1201 == -1 && local5.anIntArray61 == null) {
				local195 = local5.method742(local100, local142, local134, local126, 10, arg0);
			} else {
				local195 = new Class2_Sub3_Sub5_Sub6(arg7, 10, arg0, arg1, arg4, arg2, local5.anInt1201, true, null);
			}
			if (local195 != null) {
				arg5.method1274(arg6, arg4, arg2, local126, local28, local31, local195, arg3 == 11 ? 256 : 0, local154, local160);
			}
			if (local5.anInt1192 != 0) {
				arg8.method1473(arg2, local28, arg4, local5.aBoolean48, local31);
			}
		} else if (arg3 >= 12) {
			if (local5.anInt1201 == -1 && local5.anIntArray61 == null) {
				local195 = local5.method742(local100, local142, local134, local126, arg3, arg0);
			} else {
				local195 = new Class2_Sub3_Sub5_Sub6(arg7, arg3, arg0, arg1, arg4, arg2, local5.anInt1201, true, null);
			}
			arg5.method1274(arg6, arg4, arg2, local126, 1, 1, local195, 0, local154, local160);
			if (local5.anInt1192 != 0) {
				arg8.method1473(arg2, local28, arg4, local5.aBoolean48, local31);
			}
		} else if (arg3 == 0) {
			if (local5.anInt1201 == -1 && local5.anIntArray61 == null) {
				local195 = local5.method742(local100, local142, local134, local126, 0, arg0);
			} else {
				local195 = new Class2_Sub3_Sub5_Sub6(arg7, 0, arg0, arg1, arg4, arg2, local5.anInt1201, true, null);
			}
			arg5.method1288(arg6, arg4, arg2, local126, local195, null, Static61.anIntArray98[arg0], 0, local154, local160);
			if (local5.anInt1192 != 0) {
				arg8.method1485(arg4, arg2, local5.aBoolean48, arg3, arg0);
			}
		} else if (arg3 == 1) {
			if (local5.anInt1201 == -1 && local5.anIntArray61 == null) {
				local195 = local5.method742(local100, local142, local134, local126, 1, arg0);
			} else {
				local195 = new Class2_Sub3_Sub5_Sub6(arg7, 1, arg0, arg1, arg4, arg2, local5.anInt1201, true, null);
			}
			arg5.method1288(arg6, arg4, arg2, local126, local195, null, Static88.anIntArray154[arg0], 0, local154, local160);
			if (local5.anInt1192 != 0) {
				arg8.method1485(arg4, arg2, local5.aBoolean48, arg3, arg0);
			}
		} else {
			@Pc(547) Class2_Sub3_Sub5 local547;
			@Pc(517) int local517;
			if (arg3 == 2) {
				local517 = arg0 + 1 & 0x3;
				@Pc(537) Class2_Sub3_Sub5 local537;
				if (local5.anInt1201 == -1 && local5.anIntArray61 == null) {
					local537 = local5.method742(local100, local142, local134, local126, 2, arg0 + 4);
					local547 = local5.method742(local100, local142, local134, local126, 2, local517);
				} else {
					local537 = new Class2_Sub3_Sub5_Sub6(arg7, 2, arg0 + 4, arg1, arg4, arg2, local5.anInt1201, true, null);
					local547 = new Class2_Sub3_Sub5_Sub6(arg7, 2, local517, arg1, arg4, arg2, local5.anInt1201, true, null);
				}
				arg5.method1288(arg6, arg4, arg2, local126, local537, local547, Static61.anIntArray98[arg0], Static61.anIntArray98[local517], local154, local160);
				if (local5.anInt1192 != 0) {
					arg8.method1485(arg4, arg2, local5.aBoolean48, arg3, arg0);
				}
			} else if (arg3 == 3) {
				if (local5.anInt1201 == -1 && local5.anIntArray61 == null) {
					local195 = local5.method742(local100, local142, local134, local126, 3, arg0);
				} else {
					local195 = new Class2_Sub3_Sub5_Sub6(arg7, 3, arg0, arg1, arg4, arg2, local5.anInt1201, true, null);
				}
				arg5.method1288(arg6, arg4, arg2, local126, local195, null, Static88.anIntArray154[arg0], 0, local154, local160);
				if (local5.anInt1192 != 0) {
					arg8.method1485(arg4, arg2, local5.aBoolean48, arg3, arg0);
				}
			} else if (arg3 == 9) {
				if (local5.anInt1201 == -1 && local5.anIntArray61 == null) {
					local195 = local5.method742(local100, local142, local134, local126, arg3, arg0);
				} else {
					local195 = new Class2_Sub3_Sub5_Sub6(arg7, arg3, arg0, arg1, arg4, arg2, local5.anInt1201, true, null);
				}
				arg5.method1274(arg6, arg4, arg2, local126, 1, 1, local195, 0, local154, local160);
				if (local5.anInt1192 != 0) {
					arg8.method1473(arg2, local28, arg4, local5.aBoolean48, local31);
				}
			} else if (arg3 == 4) {
				if (local5.anInt1201 == -1 && local5.anIntArray61 == null) {
					local195 = local5.method742(local100, local142, local134, local126, 4, arg0);
				} else {
					local195 = new Class2_Sub3_Sub5_Sub6(arg7, 4, arg0, arg1, arg4, arg2, local5.anInt1201, true, null);
				}
				arg5.method1263(arg6, arg4, arg2, local126, local195, null, Static61.anIntArray98[arg0], 0, 0, 0, local154, local160);
			} else {
				@Pc(802) int local802;
				if (arg3 == 5) {
					local517 = 16;
					local802 = arg5.method1247(arg6, arg4, arg2);
					if (local802 != 0) {
						local517 = Static163.method2609(local802 >> 14 & 0x7FFF).anInt1194;
					}
					if (local5.anInt1201 == -1 && local5.anIntArray61 == null) {
						local547 = local5.method742(local100, local142, local134, local126, 4, arg0);
					} else {
						local547 = new Class2_Sub3_Sub5_Sub6(arg7, 4, arg0, arg1, arg4, arg2, local5.anInt1201, true, null);
					}
					arg5.method1263(arg6, arg4, arg2, local126, local547, null, Static61.anIntArray98[arg0], 0, local517 * Static132.anIntArray280[arg0], Static142.anIntArray296[arg0] * local517, local154, local160);
				} else if (arg3 == 6) {
					local802 = arg5.method1247(arg6, arg4, arg2);
					local517 = 8;
					if (local802 != 0) {
						local517 = Static163.method2609(local802 >> 14 & 0x7FFF).anInt1194 / 2;
					}
					if (local5.anInt1201 == -1 && local5.anIntArray61 == null) {
						local547 = local5.method742(local100, local142, local134, local126, 4, arg0 + 4);
					} else {
						local547 = new Class2_Sub3_Sub5_Sub6(arg7, 4, arg0 + 4, arg1, arg4, arg2, local5.anInt1201, true, null);
					}
					arg5.method1263(arg6, arg4, arg2, local126, local547, null, 256, arg0, Static55.anIntArray94[arg0] * local517, local517 * Static101.anIntArray151[arg0], local154, local160);
				} else if (arg3 == 7) {
					local802 = arg0 + 2 & 0x3;
					if (local5.anInt1201 == -1 && local5.anIntArray61 == null) {
						local195 = local5.method742(local100, local142, local134, local126, 4, local802 + 4);
					} else {
						local195 = new Class2_Sub3_Sub5_Sub6(arg7, 4, local802 + 4, arg1, arg4, arg2, local5.anInt1201, true, null);
					}
					arg5.method1263(arg6, arg4, arg2, local126, local195, null, 256, local802, 0, 0, local154, local160);
				} else if (arg3 == 8) {
					local517 = 8;
					local802 = arg5.method1247(arg6, arg4, arg2);
					if (local802 != 0) {
						local517 = Static163.method2609(local802 >> 14 & 0x7FFF).anInt1194 / 2;
					}
					@Pc(1054) int local1054 = arg0 + 2 & 0x3;
					@Pc(1093) Class2_Sub3_Sub5 local1093;
					if (local5.anInt1201 == -1 && local5.anIntArray61 == null) {
						local547 = local5.method742(local100, local142, local134, local126, 4, arg0 + 4);
						local1093 = local5.method742(local100, local142, local134, local126, 4, local1054 + 4);
					} else {
						local547 = new Class2_Sub3_Sub5_Sub6(arg7, 4, arg0 + 4, arg1, arg4, arg2, local5.anInt1201, true, null);
						local1093 = new Class2_Sub3_Sub5_Sub6(arg7, 4, local1054 + 4, arg1, arg4, arg2, local5.anInt1201, true, null);
					}
					arg5.method1263(arg6, arg4, arg2, local126, local547, local1093, 256, arg0, Static55.anIntArray94[arg0] * local517, Static101.anIntArray151[arg0] * local517, local154, local160);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
	public static void method2227() {
		while (true) {
			if (Static64.aClass2_Sub13_Sub1_1.method1452(Static139.anInt3252) >= 11) {
				@Pc(16) int local16 = Static64.aClass2_Sub13_Sub1_1.method1458(11);
				if (local16 != 2047) {
					@Pc(23) boolean local23 = false;
					if (Static2.aClass2_Sub3_Sub5_Sub1_Sub1Array1[local16] == null) {
						Static2.aClass2_Sub3_Sub5_Sub1_Sub1Array1[local16] = new Class2_Sub3_Sub5_Sub1_Sub1();
						local23 = true;
						if (Static46.aClass2_Sub13Array1[local16] != null) {
							Static2.aClass2_Sub3_Sub5_Sub1_Sub1Array1[local16].method592(Static46.aClass2_Sub13Array1[local16]);
						}
					}
					Static156.anIntArray358[Static167.anInt3925++] = local16;
					@Pc(59) Class2_Sub3_Sub5_Sub1_Sub1 local59 = Static2.aClass2_Sub3_Sub5_Sub1_Sub1Array1[local16];
					local59.anInt2662 = Static107.anInt2559;
					@Pc(67) int local67 = Static64.aClass2_Sub13_Sub1_1.method1458(5);
					if (local67 > 15) {
						local67 -= 32;
					}
					@Pc(78) int local78 = Static64.aClass2_Sub13_Sub1_1.method1458(1);
					@Pc(83) int local83 = Static64.aClass2_Sub13_Sub1_1.method1458(1);
					if (local83 == 1) {
						anIntArray300[Static28.anInt732++] = local16;
					}
					@Pc(99) int local99 = Static64.aClass2_Sub13_Sub1_1.method1458(5);
					@Pc(106) int local106 = Static140.anIntArray293[Static64.aClass2_Sub13_Sub1_1.method1458(3)];
					if (local99 > 15) {
						local99 -= 32;
					}
					if (local23) {
						local59.anInt2680 = local59.anInt2681 = local106;
					}
					local59.method1803(local99 + Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray221[0], local78 == 1, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray223[0] + local67);
					continue;
				}
			}
			Static64.aClass2_Sub13_Sub1_1.method1457();
			return;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)V")
	public static void method2228() {
		for (@Pc(7) int local7 = 0; local7 < Static81.anInt1985; local7++) {
			@Pc(13) int local13 = Static149.anIntArray312[local7];
			@Pc(17) Class2_Sub3_Sub5_Sub1_Sub2 local17 = Static151.aClass2_Sub3_Sub5_Sub1_Sub2Array1[local13];
			if (local17 != null) {
				Static103.method1706(local17.aClass2_Sub3_Sub17_1.anInt3906, local17);
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V")
	public static void method2229() {
		aClass6_989 = null;
		anIntArray300 = null;
		aClass6_992 = null;
		aClass17_23 = null;
		aClass6_994 = null;
		aClass6_991 = null;
		aClass55_2 = null;
		aClass6_990 = null;
		aClass6_995 = null;
		aClass6_993 = null;
	}
}
