import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!cd", name = "t", descriptor = "[Lclient!kd;")
	public static Class2_Sub1_Sub2_Sub1[] aClass2_Sub1_Sub2_Sub1Array16;

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "Lclient!ob;")
	public static Class55 aClass55_16 = new Class55(30);

	@OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
	public static int anInt297 = 0;

	@OriginalMember(owner = "client!cd", name = "u", descriptor = "[[B")
	public static byte[][] aByteArrayArray1 = new byte[50][];

	@OriginalMember(owner = "client!cd", name = "v", descriptor = "Lclient!je;")
	public static Class40 aClass40_222 = Static69.method1231("und haben es deaktiviert)3 Klicken Sie auf der");

	@OriginalMember(owner = "client!cd", name = "w", descriptor = "I")
	public static int anInt298 = 1;

	@OriginalMember(owner = "client!cd", name = "x", descriptor = "I")
	public static int anInt299 = 0;

	@OriginalMember(owner = "client!cd", name = "y", descriptor = "Lclient!je;")
	public static Class40 aClass40_223 = Static69.method1231("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!cd", name = "z", descriptor = "Lclient!je;")
	public static Class40 aClass40_224 = Static69.method1231("Stufe)2");

	@OriginalMember(owner = "client!cd", name = "A", descriptor = "Lclient!je;")
	public static Class40 aClass40_225 = Static69.method1231("logo");

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)V")
	public static void method237(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static112.method1873(arg0)) {
			return;
		}
		@Pc(26) Class2_Sub13[] local26 = Static45.aClass2_Sub13ArrayArray1[arg0];
		for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
			@Pc(34) Class2_Sub13 local34 = local26[local28];
			if (local34.anObjectArray8 != null) {
				@Pc(41) Class2_Sub7 local41 = new Class2_Sub7();
				local41.anObjectArray1 = local34.anObjectArray8;
				local41.aClass2_Sub13_4 = local34;
				Static58.method1028(local41);
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
	public static void method238() {
		aClass40_223 = null;
		aByteArrayArray1 = null;
		aClass40_222 = null;
		aClass2_Sub1_Sub2_Sub1Array16 = null;
		aClass40_224 = null;
		aClass40_225 = null;
		aClass55_16 = null;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILclient!hb;IIIIIILclient!ee;)V")
	public static void method239(@OriginalArg(0) int arg0, @OriginalArg(1) Class30 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class20 arg7) {
		if (Static34.aBoolean60 && (Static66.aByteArrayArrayArray10[0][arg5][arg4] & 0x2) == 0) {
			if ((Static66.aByteArrayArrayArray10[arg2][arg5][arg4] & 0x10) != 0) {
				return;
			}
			if (Static116.method1935(arg4, arg5, arg2) != Static1.anInt8) {
				return;
			}
		}
		if (arg2 < Static1.anInt13) {
			Static1.anInt13 = arg2;
		}
		@Pc(52) Class2_Sub1_Sub4 local52 = Static107.method1839(arg3);
		@Pc(63) int local63;
		@Pc(66) int local66;
		if (arg6 == 1 || arg6 == 3) {
			local66 = local52.anInt1036;
			local63 = local52.anInt1066;
		} else {
			local63 = local52.anInt1036;
			local66 = local52.anInt1066;
		}
		@Pc(85) int local85;
		@Pc(83) int local83;
		if (arg5 + local63 > 104) {
			local83 = arg5 + 1;
			local85 = arg5;
		} else {
			local85 = (local63 >> 1) + arg5;
			local83 = (local63 + 1 >> 1) + arg5;
		}
		@Pc(110) int local110;
		@Pc(114) int local114;
		if (local66 + arg4 > 104) {
			local110 = arg4;
			local114 = arg4 + 1;
		} else {
			local110 = (local66 >> 1) + arg4;
			local114 = arg4 + (local66 + 1 >> 1);
		}
		@Pc(134) int[][] local134 = Static118.anIntArrayArrayArray6[arg2];
		@Pc(160) int local160 = local134[local85][local114] + local134[local83][local110] + local134[local85][local110] + local134[local83][local114] >> 2;
		@Pc(168) int local168 = (local63 << 6) + (arg5 << 7);
		@Pc(176) int local176 = (arg4 << 7) + (local66 << 6);
		@Pc(188) int local188 = (arg4 << 7) + (arg5 + (arg3 << 14) + 1073741824);
		@Pc(194) int local194 = arg0 + (arg6 << 6);
		if (local52.anInt1067 == 0) {
			local188 += Integer.MIN_VALUE;
		}
		if (local52.anInt1042 == 1) {
			local194 += 256;
		}
		if (local52.method703()) {
			Static116.method1944(arg2, arg5, local52, arg4, arg6);
		}
		@Pc(255) Class2_Sub1_Sub1 local255;
		if (arg0 != 22) {
			@Pc(360) int local360;
			if (arg0 == 10 || arg0 == 11) {
				if (local52.anInt1052 == -1 && local52.anIntArray103 == null) {
					local255 = local52.method700(local168, local160, local176, 10, local134, arg6);
				} else {
					local255 = new Class2_Sub1_Sub1_Sub1(arg3, 10, arg6, arg2, arg5, arg4, local52.anInt1052, true, null);
				}
				if (local255 != null && arg1.method749(arg2, arg5, arg4, local160, local63, local66, local255, arg0 == 11 ? 256 : 0, local188, local194) && local52.aBoolean77) {
					local360 = 15;
					if (local255 instanceof Class2_Sub1_Sub1_Sub2) {
						local360 = ((Class2_Sub1_Sub1_Sub2) local255).method120() / 4;
						if (local360 > 30) {
							local360 = 30;
						}
					}
					for (@Pc(376) int local376 = 0; local376 <= local63; local376++) {
						for (@Pc(380) int local380 = 0; local380 <= local66; local380++) {
							if (Static87.aByteArrayArrayArray9[arg2][local376 + arg5][local380 + arg4] < local360) {
								Static87.aByteArrayArrayArray9[arg2][arg5 + local376][local380 + arg4] = (byte) local360;
							}
						}
					}
				}
				if (local52.anInt1048 != 0 && arg7 != null) {
					arg7.method435(local66, arg5, local52.aBoolean73, local63, arg4);
				}
			} else if (arg0 >= 12) {
				if (local52.anInt1052 == -1 && local52.anIntArray103 == null) {
					local255 = local52.method700(local168, local160, local176, arg0, local134, arg6);
				} else {
					local255 = new Class2_Sub1_Sub1_Sub1(arg3, arg0, arg6, arg2, arg5, arg4, local52.anInt1052, true, null);
				}
				arg1.method749(arg2, arg5, arg4, local160, 1, 1, local255, 0, local188, local194);
				if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg2 > 0) {
					Static64.anIntArrayArrayArray5[arg2][arg5][arg4] |= 0x924;
				}
				if (local52.anInt1048 != 0 && arg7 != null) {
					arg7.method435(local66, arg5, local52.aBoolean73, local63, arg4);
				}
			} else if (arg0 == 0) {
				if (local52.anInt1052 == -1 && local52.anIntArray103 == null) {
					local255 = local52.method700(local168, local160, local176, 0, local134, arg6);
				} else {
					local255 = new Class2_Sub1_Sub1_Sub1(arg3, 0, arg6, arg2, arg5, arg4, local52.anInt1052, true, null);
				}
				arg1.method738(arg2, arg5, arg4, local160, local255, null, Static101.anIntArray282[arg6], 0, local188, local194);
				if (arg6 == 0) {
					if (local52.aBoolean77) {
						Static87.aByteArrayArrayArray9[arg2][arg5][arg4] = 50;
						Static87.aByteArrayArrayArray9[arg2][arg5][arg4 + 1] = 50;
					}
					if (local52.aBoolean72) {
						Static64.anIntArrayArrayArray5[arg2][arg5][arg4] |= 0x249;
					}
				} else if (arg6 == 1) {
					if (local52.aBoolean77) {
						Static87.aByteArrayArrayArray9[arg2][arg5][arg4 + 1] = 50;
						Static87.aByteArrayArrayArray9[arg2][arg5 + 1][arg4 + 1] = 50;
					}
					if (local52.aBoolean72) {
						Static64.anIntArrayArrayArray5[arg2][arg5][arg4 + 1] |= 0x492;
					}
				} else if (arg6 == 2) {
					if (local52.aBoolean77) {
						Static87.aByteArrayArrayArray9[arg2][arg5 + 1][arg4] = 50;
						Static87.aByteArrayArrayArray9[arg2][arg5 + 1][arg4 + 1] = 50;
					}
					if (local52.aBoolean72) {
						Static64.anIntArrayArrayArray5[arg2][arg5 + 1][arg4] |= 0x249;
					}
				} else if (arg6 == 3) {
					if (local52.aBoolean77) {
						Static87.aByteArrayArrayArray9[arg2][arg5][arg4] = 50;
						Static87.aByteArrayArrayArray9[arg2][arg5 + 1][arg4] = 50;
					}
					if (local52.aBoolean72) {
						Static64.anIntArrayArrayArray5[arg2][arg5][arg4] |= 0x492;
					}
				}
				if (local52.anInt1048 != 0 && arg7 != null) {
					arg7.method447(arg4, arg6, local52.aBoolean73, arg5, arg0);
				}
				if (local52.anInt1054 != 16) {
					arg1.method737(arg2, arg5, arg4, local52.anInt1054);
				}
			} else if (arg0 == 1) {
				if (local52.anInt1052 == -1 && local52.anIntArray103 == null) {
					local255 = local52.method700(local168, local160, local176, 1, local134, arg6);
				} else {
					local255 = new Class2_Sub1_Sub1_Sub1(arg3, 1, arg6, arg2, arg5, arg4, local52.anInt1052, true, null);
				}
				arg1.method738(arg2, arg5, arg4, local160, local255, null, Static120.anIntArray329[arg6], 0, local188, local194);
				if (local52.aBoolean77) {
					if (arg6 == 0) {
						Static87.aByteArrayArrayArray9[arg2][arg5][arg4 + 1] = 50;
					} else if (arg6 == 1) {
						Static87.aByteArrayArrayArray9[arg2][arg5 + 1][arg4 + 1] = 50;
					} else if (arg6 == 2) {
						Static87.aByteArrayArrayArray9[arg2][arg5 + 1][arg4] = 50;
					} else if (arg6 == 3) {
						Static87.aByteArrayArrayArray9[arg2][arg5][arg4] = 50;
					}
				}
				if (local52.anInt1048 != 0 && arg7 != null) {
					arg7.method447(arg4, arg6, local52.aBoolean73, arg5, arg0);
				}
			} else {
				@Pc(958) int local958;
				@Pc(989) Class2_Sub1_Sub1 local989;
				if (arg0 == 2) {
					local958 = arg6 + 1 & 0x3;
					@Pc(979) Class2_Sub1_Sub1 local979;
					if (local52.anInt1052 == -1 && local52.anIntArray103 == null) {
						local979 = local52.method700(local168, local160, local176, 2, local134, arg6 + 4);
						local989 = local52.method700(local168, local160, local176, 2, local134, local958);
					} else {
						local979 = new Class2_Sub1_Sub1_Sub1(arg3, 2, arg6 + 4, arg2, arg5, arg4, local52.anInt1052, true, null);
						local989 = new Class2_Sub1_Sub1_Sub1(arg3, 2, local958, arg2, arg5, arg4, local52.anInt1052, true, null);
					}
					arg1.method738(arg2, arg5, arg4, local160, local979, local989, Static101.anIntArray282[arg6], Static101.anIntArray282[local958], local188, local194);
					if (local52.aBoolean72) {
						if (arg6 == 0) {
							Static64.anIntArrayArrayArray5[arg2][arg5][arg4] |= 0x249;
							Static64.anIntArrayArrayArray5[arg2][arg5][arg4 + 1] |= 0x492;
						} else if (arg6 == 1) {
							Static64.anIntArrayArrayArray5[arg2][arg5][arg4 + 1] |= 0x492;
							Static64.anIntArrayArrayArray5[arg2][arg5 + 1][arg4] |= 0x249;
						} else if (arg6 == 2) {
							Static64.anIntArrayArrayArray5[arg2][arg5 + 1][arg4] |= 0x249;
							Static64.anIntArrayArrayArray5[arg2][arg5][arg4] |= 0x492;
						} else if (arg6 == 3) {
							Static64.anIntArrayArrayArray5[arg2][arg5][arg4] |= 0x492;
							Static64.anIntArrayArrayArray5[arg2][arg5][arg4] |= 0x249;
						}
					}
					if (local52.anInt1048 != 0 && arg7 != null) {
						arg7.method447(arg4, arg6, local52.aBoolean73, arg5, arg0);
					}
					if (local52.anInt1054 != 16) {
						arg1.method737(arg2, arg5, arg4, local52.anInt1054);
					}
				} else if (arg0 == 3) {
					if (local52.anInt1052 == -1 && local52.anIntArray103 == null) {
						local255 = local52.method700(local168, local160, local176, 3, local134, arg6);
					} else {
						local255 = new Class2_Sub1_Sub1_Sub1(arg3, 3, arg6, arg2, arg5, arg4, local52.anInt1052, true, null);
					}
					arg1.method738(arg2, arg5, arg4, local160, local255, null, Static120.anIntArray329[arg6], 0, local188, local194);
					if (local52.aBoolean77) {
						if (arg6 == 0) {
							Static87.aByteArrayArrayArray9[arg2][arg5][arg4 + 1] = 50;
						} else if (arg6 == 1) {
							Static87.aByteArrayArrayArray9[arg2][arg5 + 1][arg4 + 1] = 50;
						} else if (arg6 == 2) {
							Static87.aByteArrayArrayArray9[arg2][arg5 + 1][arg4] = 50;
						} else if (arg6 == 3) {
							Static87.aByteArrayArrayArray9[arg2][arg5][arg4] = 50;
						}
					}
					if (local52.anInt1048 != 0 && arg7 != null) {
						arg7.method447(arg4, arg6, local52.aBoolean73, arg5, arg0);
					}
				} else if (arg0 == 9) {
					if (local52.anInt1052 == -1 && local52.anIntArray103 == null) {
						local255 = local52.method700(local168, local160, local176, arg0, local134, arg6);
					} else {
						local255 = new Class2_Sub1_Sub1_Sub1(arg3, arg0, arg6, arg2, arg5, arg4, local52.anInt1052, true, null);
					}
					arg1.method749(arg2, arg5, arg4, local160, 1, 1, local255, 0, local188, local194);
					if (local52.anInt1048 != 0 && arg7 != null) {
						arg7.method435(local66, arg5, local52.aBoolean73, local63, arg4);
					}
					if (local52.anInt1054 != 16) {
						arg1.method737(arg2, arg5, arg4, local52.anInt1054);
					}
				} else if (arg0 == 4) {
					if (local52.anInt1052 == -1 && local52.anIntArray103 == null) {
						local255 = local52.method700(local168, local160, local176, 4, local134, arg6);
					} else {
						local255 = new Class2_Sub1_Sub1_Sub1(arg3, 4, arg6, arg2, arg5, arg4, local52.anInt1052, true, null);
					}
					arg1.method746(arg2, arg5, arg4, local160, local255, null, Static101.anIntArray282[arg6], 0, 0, 0, local188, local194);
				} else if (arg0 == 5) {
					local958 = 16;
					local360 = arg1.method755(arg2, arg5, arg4);
					if (local360 != 0) {
						local958 = Static107.method1839(local360 >> 14 & 0x7FFF).anInt1054;
					}
					if (local52.anInt1052 == -1 && local52.anIntArray103 == null) {
						local989 = local52.method700(local168, local160, local176, 4, local134, arg6);
					} else {
						local989 = new Class2_Sub1_Sub1_Sub1(arg3, 4, arg6, arg2, arg5, arg4, local52.anInt1052, true, null);
					}
					arg1.method746(arg2, arg5, arg4, local160, local989, null, Static101.anIntArray282[arg6], 0, Static103.anIntArray283[arg6] * local958, local958 * Static54.anIntArray143[arg6], local188, local194);
				} else if (arg0 == 6) {
					local360 = arg1.method755(arg2, arg5, arg4);
					local958 = 8;
					if (local360 != 0) {
						local958 = Static107.method1839(local360 >> 14 & 0x7FFF).anInt1054 / 2;
					}
					if (local52.anInt1052 == -1 && local52.anIntArray103 == null) {
						local989 = local52.method700(local168, local160, local176, 4, local134, arg6 + 4);
					} else {
						local989 = new Class2_Sub1_Sub1_Sub1(arg3, 4, arg6 + 4, arg2, arg5, arg4, local52.anInt1052, true, null);
					}
					arg1.method746(arg2, arg5, arg4, local160, local989, null, 256, arg6, local958 * Static69.anIntArray204[arg6], Static59.anIntArray152[arg6] * local958, local188, local194);
				} else if (arg0 == 7) {
					local360 = arg6 + 2 & 0x3;
					if (local52.anInt1052 == -1 && local52.anIntArray103 == null) {
						local255 = local52.method700(local168, local160, local176, 4, local134, local360 + 4);
					} else {
						local255 = new Class2_Sub1_Sub1_Sub1(arg3, 4, local360 + 4, arg2, arg5, arg4, local52.anInt1052, true, null);
					}
					arg1.method746(arg2, arg5, arg4, local160, local255, null, 256, local360, 0, 0, local188, local194);
				} else if (arg0 == 8) {
					local360 = arg1.method755(arg2, arg5, arg4);
					local958 = 8;
					if (local360 != 0) {
						local958 = Static107.method1839(local360 >> 14 & 0x7FFF).anInt1054 / 2;
					}
					@Pc(1787) int local1787 = arg6 + 2 & 0x3;
					@Pc(1818) Class2_Sub1_Sub1 local1818;
					if (local52.anInt1052 == -1 && local52.anIntArray103 == null) {
						local989 = local52.method700(local168, local160, local176, 4, local134, arg6 + 4);
						local1818 = local52.method700(local168, local160, local176, 4, local134, local1787 + 4);
					} else {
						local989 = new Class2_Sub1_Sub1_Sub1(arg3, 4, arg6 + 4, arg2, arg5, arg4, local52.anInt1052, true, null);
						local1818 = new Class2_Sub1_Sub1_Sub1(arg3, 4, local1787 + 4, arg2, arg5, arg4, local52.anInt1052, true, null);
					}
					arg1.method746(arg2, arg5, arg4, local160, local989, local1818, 256, arg6, local958 * Static69.anIntArray204[arg6], local958 * Static59.anIntArray152[arg6], local188, local194);
				}
			}
		} else if (!Static34.aBoolean60 || local52.anInt1067 != 0 || local52.anInt1048 == 1 || local52.aBoolean71) {
			if (local52.anInt1052 == -1 && local52.anIntArray103 == null) {
				local255 = local52.method700(local168, local160, local176, 22, local134, arg6);
			} else {
				local255 = new Class2_Sub1_Sub1_Sub1(arg3, 22, arg6, arg2, arg5, arg4, local52.anInt1052, true, null);
			}
			arg1.method757(arg2, arg5, arg4, local160, local255, local188, local194);
			if (local52.anInt1048 == 1 && arg7 != null) {
				arg7.method441(arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V")
	public static void method240() {
		for (@Pc(10) Class2_Sub1_Sub1_Sub5 local10 = (Class2_Sub1_Sub1_Sub5) Static120.aClass3_16.method82(); local10 != null; local10 = (Class2_Sub1_Sub1_Sub5) Static120.aClass3_16.method74()) {
			if (Static105.anInt2531 != local10.anInt1173 || local10.anInt1192 < Static28.anInt704) {
				local10.method2209();
			} else if (local10.anInt1187 <= Static28.anInt704) {
				if (local10.anInt1172 > 0) {
					@Pc(46) Class2_Sub1_Sub1_Sub3_Sub1 local46 = Static127.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local10.anInt1172 - 1];
					if (local46 != null && local46.anInt1788 >= 0 && local46.anInt1788 < 13312 && local46.anInt1792 >= 0 && local46.anInt1792 < 13312) {
						local10.method811(Static93.method1730(local46.anInt1788, local10.anInt1173, local46.anInt1792) - local10.anInt1194, local46.anInt1792, local46.anInt1788, Static28.anInt704);
					}
				}
				if (local10.anInt1172 < 0) {
					@Pc(98) int local98 = -local10.anInt1172 - 1;
					@Pc(103) Class2_Sub1_Sub1_Sub3_Sub2 local103;
					if (local98 == Static56.anInt1466) {
						local103 = Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1;
					} else {
						local103 = Static69.aClass2_Sub1_Sub1_Sub3_Sub2Array2[local98];
					}
					if (local103 != null && local103.anInt1788 >= 0 && local103.anInt1788 < 13312 && local103.anInt1792 >= 0 && local103.anInt1792 < 13312) {
						local10.method811(Static93.method1730(local103.anInt1788, local10.anInt1173, local103.anInt1792) - local10.anInt1194, local103.anInt1792, local103.anInt1788, Static28.anInt704);
					}
				}
				local10.method810(Static49.anInt1315);
				Static111.aClass30_1.method768(Static105.anInt2531, (int) local10.aDouble3, (int) local10.aDouble5, (int) local10.aDouble7, 60, local10, local10.anInt1181, -1, false);
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(B)V")
	public static void method241() {
		while (true) {
			if (Static7.aClass2_Sub9_Sub1_1.method674(Static130.anInt3009) >= 11) {
				@Pc(14) int local14 = Static7.aClass2_Sub9_Sub1_1.method671(11);
				if (local14 != 2047) {
					@Pc(21) boolean local21 = false;
					if (Static69.aClass2_Sub1_Sub1_Sub3_Sub2Array2[local14] == null) {
						Static69.aClass2_Sub1_Sub1_Sub3_Sub2Array2[local14] = new Class2_Sub1_Sub1_Sub3_Sub2();
						local21 = true;
						if (Static3.aClass2_Sub9Array1[local14] != null) {
							Static69.aClass2_Sub1_Sub1_Sub3_Sub2Array2[local14].method1182(Static3.aClass2_Sub9Array1[local14]);
						}
					}
					Static126.anIntArray347[Static130.anInt3007++] = local14;
					@Pc(57) Class2_Sub1_Sub1_Sub3_Sub2 local57 = Static69.aClass2_Sub1_Sub1_Sub3_Sub2Array2[local14];
					local57.anInt1808 = Static28.anInt704;
					@Pc(65) int local65 = Static7.aClass2_Sub9_Sub1_1.method671(5);
					if (local65 > 15) {
						local65 -= 32;
					}
					@Pc(74) int local74 = Static7.aClass2_Sub9_Sub1_1.method671(1);
					@Pc(81) int local81 = Static45.anIntArray129[Static7.aClass2_Sub9_Sub1_1.method671(3)];
					if (local21) {
						local57.anInt1801 = local57.anInt1818 = local81;
					}
					@Pc(94) int local94 = Static7.aClass2_Sub9_Sub1_1.method671(1);
					if (local94 == 1) {
						Static73.anIntArray202[Static58.anInt1521++] = local14;
					}
					@Pc(110) int local110 = Static7.aClass2_Sub9_Sub1_1.method671(5);
					if (local110 > 15) {
						local110 -= 32;
					}
					local57.method1176(local74 == 1, Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray180[0] + local65, local110 + Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray177[0]);
					continue;
				}
			}
			Static7.aClass2_Sub9_Sub1_1.method675();
			return;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIII)V")
	public static void method242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static111.aClass30_1.method755(arg0, arg1, arg3);
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(35) int local35;
		@Pc(49) int local49;
		@Pc(59) int local59;
		if (local11 != 0) {
			local20 = Static111.aClass30_1.method779(arg0, arg1, arg3, local11);
			local26 = local20 >> 6 & 0x3;
			local30 = local20 & 0x1F;
			@Pc(33) int[] local33 = Static50.aClass2_Sub1_Sub2_Sub4_2.anIntArray259;
			local35 = arg2;
			local49 = (103 - arg3) * 512 * 4 + arg1 * 4 + 24624;
			if (local11 > 0) {
				local35 = arg4;
			}
			local59 = local11 >> 14 & 0x7FFF;
			@Pc(63) Class2_Sub1_Sub4 local63 = Static107.method1839(local59);
			if (local63.anInt1056 == -1) {
				if (local30 == 0 || local30 == 2) {
					if (local26 == 0) {
						local33[local49] = local35;
						local33[local49 + 512] = local35;
						local33[local49 + 1024] = local35;
						local33[local49 + 1536] = local35;
					} else if (local26 == 1) {
						local33[local49] = local35;
						local33[local49 + 1] = local35;
						local33[local49 + 2] = local35;
						local33[local49 + 3] = local35;
					} else if (local26 == 2) {
						local33[local49 + 3] = local35;
						local33[local49 + 515] = local35;
						local33[local49 + 3 + 1024] = local35;
						local33[local49 + 3 + 1536] = local35;
					} else if (local26 == 3) {
						local33[local49 + 1536] = local35;
						local33[local49 + 1537] = local35;
						local33[local49 + 1536 + 2] = local35;
						local33[local49 + 1536 + 3] = local35;
					}
				}
				if (local30 == 3) {
					if (local26 == 0) {
						local33[local49] = local35;
					} else if (local26 == 1) {
						local33[local49 + 3] = local35;
					} else if (local26 == 2) {
						local33[local49 + 1536 + 3] = local35;
					} else if (local26 == 3) {
						local33[local49 + 1536] = local35;
					}
				}
				if (local30 == 2) {
					if (local26 == 3) {
						local33[local49] = local35;
						local33[local49 + 512] = local35;
						local33[local49 + 1024] = local35;
						local33[local49 + 1536] = local35;
					} else if (local26 == 0) {
						local33[local49] = local35;
						local33[local49 + 1] = local35;
						local33[local49 + 2] = local35;
						local33[local49 + 3] = local35;
					} else if (local26 == 1) {
						local33[local49 + 3] = local35;
						local33[local49 + 512 + 3] = local35;
						local33[local49 + 3 + 1024] = local35;
						local33[local49 + 3 + 1536] = local35;
					} else if (local26 == 2) {
						local33[local49 + 1536] = local35;
						local33[local49 + 1536 + 1] = local35;
						local33[local49 + 2 + 1536] = local35;
						local33[local49 + 1539] = local35;
					}
				}
			} else {
				@Pc(376) Class2_Sub1_Sub2_Sub1 local376 = Static24.aClass2_Sub1_Sub2_Sub1Array103[local63.anInt1056];
				if (local376 != null) {
					@Pc(388) int local388 = (local63.anInt1066 * 4 - local376.anInt1631) / 2;
					@Pc(399) int local399 = (local63.anInt1036 * 4 - local376.anInt1632) / 2;
					local376.method1084(local399 + arg1 * 4 + 48, local388 + (-local63.anInt1066 + (104 - arg3)) * 4 + 48);
				}
			}
		}
		local11 = Static111.aClass30_1.method774(arg0, arg1, arg3);
		if (local11 != 0) {
			local20 = Static111.aClass30_1.method779(arg0, arg1, arg3, local11);
			local35 = local11 >> 14 & 0x7FFF;
			@Pc(446) Class2_Sub1_Sub4 local446 = Static107.method1839(local35);
			local30 = local20 & 0x1F;
			local26 = local20 >> 6 & 0x3;
			@Pc(488) int local488;
			if (local446.anInt1056 != -1) {
				@Pc(466) Class2_Sub1_Sub2_Sub1 local466 = Static24.aClass2_Sub1_Sub2_Sub1Array103[local446.anInt1056];
				if (local466 != null) {
					local59 = (local446.anInt1036 * 4 - local466.anInt1632) / 2;
					local488 = (local446.anInt1066 * 4 - local466.anInt1631) / 2;
					local466.method1084(arg1 * 4 + local59 + 48, local488 + (-arg3 + 104 + -local446.anInt1066) * 4 + 48);
				}
			} else if (local30 == 9) {
				local49 = 15658734;
				if (local11 > 0) {
					local49 = 15597568;
				}
				@Pc(528) int[] local528 = Static50.aClass2_Sub1_Sub2_Sub4_2.anIntArray259;
				local488 = (103 - arg3) * 512 * 4 + arg1 * 4 + 24624;
				if (local26 == 0 || local26 == 2) {
					local528[local488 + 1536] = local49;
					local528[local488 + 1025] = local49;
					local528[local488 + 514] = local49;
					local528[local488 + 3] = local49;
				} else {
					local528[local488] = local49;
					local528[local488 + 513] = local49;
					local528[local488 + 1026] = local49;
					local528[local488 + 3 + 1536] = local49;
				}
			}
		}
		local11 = Static111.aClass30_1.method760(arg0, arg1, arg3);
		if (local11 == 0) {
			return;
		}
		local20 = local11 >> 14 & 0x7FFF;
		@Pc(616) Class2_Sub1_Sub4 local616 = Static107.method1839(local20);
		if (local616.anInt1056 == -1) {
			return;
		}
		@Pc(626) Class2_Sub1_Sub2_Sub1 local626 = Static24.aClass2_Sub1_Sub2_Sub1Array103[local616.anInt1056];
		if (local626 != null) {
			local35 = (local616.anInt1036 * 4 - local626.anInt1632) / 2;
			@Pc(650) int local650 = (local616.anInt1066 * 4 - local626.anInt1631) / 2;
			local626.method1084(local35 + arg1 * 4 + 48, local650 + (-local616.anInt1066 + (104 - arg3)) * 4 + 48);
		}
	}
}
