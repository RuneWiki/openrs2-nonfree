import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString40;

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
	public static int anInt1011 = 1;

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
	public static int anInt1012 = 0;

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
	public static int anInt1014 = -1;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!qf;III)V")
	public static void method837(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class3_Sub25 local12;
		if (arg2 < Static295.anInt4973) {
			local12 = Static146.aClass3_Sub25ArrayArrayArray7[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass13_1 != null && local12.aClass13_1.aClass10_1.method4976()) {
				arg0.method4983(local12.aClass13_1.aClass10_1, 128, 0, 0, true);
			}
		}
		if (arg3 < Static295.anInt4973) {
			local12 = Static146.aClass3_Sub25ArrayArrayArray7[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass13_1 != null && local12.aClass13_1.aClass10_1.method4976()) {
				arg0.method4983(local12.aClass13_1.aClass10_1, 0, 0, 128, true);
			}
		}
		if (arg2 < Static295.anInt4973 && arg3 < Static307.anInt6023) {
			local12 = Static146.aClass3_Sub25ArrayArrayArray7[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass13_1 != null && local12.aClass13_1.aClass10_1.method4976()) {
				arg0.method4983(local12.aClass13_1.aClass10_1, 128, 0, 128, true);
			}
		}
		if (arg2 < Static295.anInt4973 && arg3 > 0) {
			local12 = Static146.aClass3_Sub25ArrayArrayArray7[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass13_1 != null && local12.aClass13_1.aClass10_1.method4976()) {
				arg0.method4983(local12.aClass13_1.aClass10_1, 128, 0, -128, true);
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method838(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static125.aClass41_1);
		arg0.removeMouseMotionListener(Static125.aClass41_1);
		arg0.removeFocusListener(Static125.aClass41_1);
		Static166.anInt3120 = 0;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIZIIIIZILclient!rk;)V")
	public static void method839(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class153 arg9) {
		if (arg2 && !Static208.method3462() && (Static41.aByteArrayArrayArray2[0][arg6][arg3] & 0x2) == 0) {
			if ((Static41.aByteArrayArrayArray2[arg5][arg6][arg3] & 0x10) != 0) {
				return;
			}
			if (Static133.method2305(arg5, arg3, arg6) != Static187.anInt3700) {
				return;
			}
		}
		if (arg5 < Static170.anInt3194) {
			Static170.anInt3194 = arg5;
		}
		@Pc(63) Class49 local63 = Static175.method2874(arg0);
		if (Static283.aBoolean393 && local63.aBoolean122) {
			return;
		}
		@Pc(84) int local84;
		@Pc(81) int local81;
		if (arg8 == 1 || arg8 == 3) {
			local84 = local63.anInt1329;
			local81 = local63.anInt1360;
		} else {
			local81 = local63.anInt1329;
			local84 = local63.anInt1360;
		}
		@Pc(101) int local101;
		@Pc(105) int local105;
		if (local84 + arg6 > 104) {
			local101 = arg6;
			local105 = arg6 + 1;
		} else {
			local101 = (local84 >> 1) + arg6;
			local105 = (local84 + 1 >> 1) + arg6;
		}
		@Pc(125) int[][] local125 = Static256.anIntArrayArrayArray14[arg4];
		@Pc(136) int local136;
		@Pc(134) int local134;
		if (local81 + arg3 > 104) {
			local134 = arg3 + 1;
			local136 = arg3;
		} else {
			local136 = arg3 + (local81 >> 1);
			local134 = (local81 + 1 >> 1) + arg3;
		}
		@Pc(178) int local178 = local125[local105][local134] + local125[local105][local136] + local125[local101][local136] + local125[local101][local134] >> 2;
		@Pc(186) int local186 = (local84 << 6) + (arg6 << 7);
		@Pc(194) int local194 = (arg3 << 7) + (local81 << 6);
		@Pc(196) int local196 = 0;
		@Pc(221) int[][] local221;
		if (Static283.aBoolean393 && arg4 != 0) {
			local221 = Static256.anIntArrayArrayArray14[0];
			local196 = local178 - (local221[local105][local134] + local221[local101][local134] + local221[local101][local136] + local221[local105][local136] >> 2);
		}
		local221 = null;
		if (arg7) {
			local221 = Static258.anIntArrayArrayArray15[0];
		} else if (arg4 < 3) {
			local221 = Static256.anIntArrayArrayArray14[arg4 + 1];
		}
		@Pc(287) long local287 = (long) (arg6 | arg3 << 7 | arg1 << 14 | arg8 << 20 | 0x40000000);
		if (local63.anInt1330 == 0 || arg7) {
			local287 |= Long.MIN_VALUE;
		}
		if (local63.anInt1373 == 1) {
			local287 |= 0x400000L;
		}
		if (local63.aBoolean116) {
			local287 |= 0x80000000L;
		}
		local287 |= (long) arg0 << 32;
		if (local63.method1123()) {
			Static114.method5018(0, arg5, local63, null, arg3, null, arg8, arg6);
		}
		@Pc(343) boolean local343 = !arg7 & local63.aBoolean112;
		@Pc(390) Class10 local390;
		@Pc(406) Class174 local406;
		if (arg1 == 22) {
			if (Static201.aBoolean280 || local63.anInt1330 != 0 || local63.anInt1372 == 1 || local63.aBoolean117) {
				if (local63.anInt1354 == -1 && local63.anIntArray129 == null && local63.anIntArray131 == null && !local63.aBoolean110) {
					local406 = local63.method1115(arg2, local194, local125, 22, null, local186, local178, local343, arg8, local221);
					if (Static283.aBoolean393 && local343) {
						Static193.method3207(local406.aClass81_Sub2_4, local186, local196, local194);
					}
					local390 = local406.aClass10_10;
				} else {
					local390 = new Class10_Sub6(arg0, 22, arg8, arg4, arg6, arg3, -1, local63.aBoolean111, null);
				}
				Static77.method1208(arg5, arg6, arg3, local178, local390, local287, local63.aBoolean108);
				if (local63.anInt1372 == 1 && arg9 != null) {
					arg9.method4085(arg6, arg3);
				}
			}
		} else if (arg1 == 10 || arg1 == 11) {
			if (local63.anInt1354 == -1 && local63.anIntArray129 == null && local63.anIntArray131 == null && !local63.aBoolean110) {
				local406 = local63.method1115(arg2, local194, local125, 10, null, local186, local178, local343, arg1 == 11 ? arg8 + 4 : arg8, local221);
				if (Static283.aBoolean393 && local343) {
					Static193.method3207(local406.aClass81_Sub2_4, local186, local196, local194);
				}
				local390 = local406.aClass10_10;
			} else {
				local390 = new Class10_Sub6(arg0, 10, arg1 == 11 ? arg8 + 4 : arg8, arg4, arg6, arg3, -1, local63.aBoolean111, null);
			}
			if (local390 != null) {
				@Pc(541) boolean local541 = Static64.method1014(arg5, arg6, arg3, local178, local84, local81, local390, local287);
				if (local63.aBoolean114 && local541 && arg2) {
					@Pc(550) int local550 = 15;
					if (local390 instanceof Class10_Sub4) {
						local550 = ((Class10_Sub4) local390).method1955() / 4;
						if (local550 > 30) {
							local550 = 30;
						}
					}
					for (@Pc(567) int local567 = 0; local567 <= local84; local567++) {
						for (@Pc(572) int local572 = 0; local572 <= local81; local572++) {
							if (local550 > Static188.aByteArrayArrayArray17[arg5][local567 + arg6][local572 + arg3]) {
								Static188.aByteArrayArrayArray17[arg5][local567 + arg6][arg3 + local572] = (byte) local550;
							}
						}
					}
				}
			}
			if (local63.anInt1372 != 0 && arg9 != null) {
				arg9.method4075(arg6, local81, local63.aBoolean119, arg3, local84, !local63.aBoolean120);
			}
		} else if (arg1 >= 12) {
			if (local63.anInt1354 == -1 && local63.anIntArray129 == null && local63.anIntArray131 == null && !local63.aBoolean110) {
				local406 = local63.method1115(arg2, local194, local125, arg1, null, local186, local178, local343, arg8, local221);
				if (Static283.aBoolean393 && local343) {
					Static193.method3207(local406.aClass81_Sub2_4, local186, local196, local194);
				}
				local390 = local406.aClass10_10;
			} else {
				local390 = new Class10_Sub6(arg0, arg1, arg8, arg4, arg6, arg3, -1, local63.aBoolean111, null);
			}
			Static64.method1014(arg5, arg6, arg3, local178, 1, 1, local390, local287);
			if (arg2 && arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg5 > 0 && local63.anInt1369 != 0) {
				Static104.anIntArrayArrayArray6[arg5][arg6][arg3] |= 0x4;
			}
			if (local63.anInt1372 != 0 && arg9 != null) {
				arg9.method4075(arg6, local81, local63.aBoolean119, arg3, local84, !local63.aBoolean120);
			}
		} else if (arg1 == 0) {
			if (local63.anInt1354 == -1 && local63.anIntArray129 == null && local63.anIntArray131 == null && !local63.aBoolean110) {
				local406 = local63.method1115(arg2, local194, local125, 0, null, local186, local178, local343, arg8, local221);
				if (Static283.aBoolean393 && local343) {
					Static193.method3207(local406.aClass81_Sub2_4, local186, local196, local194);
				}
				local390 = local406.aClass10_10;
			} else {
				local390 = new Class10_Sub6(arg0, 0, arg8, arg4, arg6, arg3, -1, local63.aBoolean111, null);
			}
			Static105.method1680(arg5, arg6, arg3, local178, local390, null, Static195.anIntArray437[arg8], 0, local287);
			if (arg2) {
				if (arg8 == 0) {
					if (local63.aBoolean114) {
						Static188.aByteArrayArrayArray17[arg5][arg6][arg3] = 50;
						Static188.aByteArrayArrayArray17[arg5][arg6][arg3 + 1] = 50;
					}
					if (local63.anInt1369 == 1) {
						Static104.anIntArrayArrayArray6[arg5][arg6][arg3] |= 0x1;
					}
				} else if (arg8 == 1) {
					if (local63.aBoolean114) {
						Static188.aByteArrayArrayArray17[arg5][arg6][arg3 + 1] = 50;
						Static188.aByteArrayArrayArray17[arg5][arg6 + 1][arg3 + 1] = 50;
					}
					if (local63.anInt1369 == 1) {
						Static104.anIntArrayArrayArray6[arg5][arg6][arg3 + 1] |= 0x2;
					}
				} else if (arg8 == 2) {
					if (local63.aBoolean114) {
						Static188.aByteArrayArrayArray17[arg5][arg6 + 1][arg3] = 50;
						Static188.aByteArrayArrayArray17[arg5][arg6 + 1][arg3 + 1] = 50;
					}
					if (local63.anInt1369 == 1) {
						Static104.anIntArrayArrayArray6[arg5][arg6 + 1][arg3] |= 0x1;
					}
				} else if (arg8 == 3) {
					if (local63.aBoolean114) {
						Static188.aByteArrayArrayArray17[arg5][arg6][arg3] = 50;
						Static188.aByteArrayArrayArray17[arg5][arg6 + 1][arg3] = 50;
					}
					if (local63.anInt1369 == 1) {
						Static104.anIntArrayArrayArray6[arg5][arg6][arg3] |= 0x2;
					}
				}
			}
			if (local63.anInt1372 != 0 && arg9 != null) {
				arg9.method4084(arg6, arg3, !local63.aBoolean120, arg1, arg8, local63.aBoolean119);
			}
			if (local63.anInt1344 != 16) {
				Static108.method1766(arg5, arg6, arg3, local63.anInt1344);
			}
		} else if (arg1 == 1) {
			if (local63.anInt1354 == -1 && local63.anIntArray129 == null && local63.anIntArray131 == null && !local63.aBoolean110) {
				local406 = local63.method1115(arg2, local194, local125, 1, null, local186, local178, local343, arg8, local221);
				if (Static283.aBoolean393 && local343) {
					Static193.method3207(local406.aClass81_Sub2_4, local186, local196, local194);
				}
				local390 = local406.aClass10_10;
			} else {
				local390 = new Class10_Sub6(arg0, 1, arg8, arg4, arg6, arg3, -1, local63.aBoolean111, null);
			}
			Static105.method1680(arg5, arg6, arg3, local178, local390, null, Static122.anIntArray280[arg8], 0, local287);
			if (local63.aBoolean114 && arg2) {
				if (arg8 == 0) {
					Static188.aByteArrayArrayArray17[arg5][arg6][arg3 + 1] = 50;
				} else if (arg8 == 1) {
					Static188.aByteArrayArrayArray17[arg5][arg6 + 1][arg3 + 1] = 50;
				} else if (arg8 == 2) {
					Static188.aByteArrayArrayArray17[arg5][arg6 + 1][arg3] = 50;
				} else if (arg8 == 3) {
					Static188.aByteArrayArrayArray17[arg5][arg6][arg3] = 50;
				}
			}
			if (local63.anInt1372 != 0 && arg9 != null) {
				arg9.method4084(arg6, arg3, !local63.aBoolean120, arg1, arg8, local63.aBoolean119);
			}
		} else {
			@Pc(1281) int local1281;
			if (arg1 == 2) {
				local1281 = arg8 + 1 & 0x3;
				@Pc(1357) Class10 local1357;
				@Pc(1329) Class10 local1329;
				if (local63.anInt1354 == -1 && local63.anIntArray129 == null && local63.anIntArray131 == null && !local63.aBoolean110) {
					@Pc(1315) Class174 local1315 = local63.method1115(arg2, local194, local125, 2, null, local186, local178, local343, arg8 + 4, local221);
					if (Static283.aBoolean393 && local343) {
						Static193.method3207(local1315.aClass81_Sub2_4, local186, local196, local194);
					}
					local1329 = local1315.aClass10_10;
					local1315 = local63.method1115(arg2, local194, local125, 2, null, local186, local178, local343, local1281, local221);
					if (Static283.aBoolean393 && local343) {
						Static193.method3207(local1315.aClass81_Sub2_4, local186, local196, local194);
					}
					local1357 = local1315.aClass10_10;
				} else {
					local1329 = new Class10_Sub6(arg0, 2, arg8 + 4, arg4, arg6, arg3, -1, local63.aBoolean111, null);
					local1357 = new Class10_Sub6(arg0, 2, local1281, arg4, arg6, arg3, -1, local63.aBoolean111, null);
				}
				Static105.method1680(arg5, arg6, arg3, local178, local1329, local1357, Static195.anIntArray437[arg8], Static195.anIntArray437[local1281], local287);
				if (local63.anInt1369 == 1 && arg2) {
					if (arg8 == 0) {
						Static104.anIntArrayArrayArray6[arg5][arg6][arg3] |= 0x1;
						Static104.anIntArrayArrayArray6[arg5][arg6][arg3 + 1] |= 0x2;
					} else if (arg8 == 1) {
						Static104.anIntArrayArrayArray6[arg5][arg6][arg3 + 1] |= 0x2;
						Static104.anIntArrayArrayArray6[arg5][arg6 + 1][arg3] |= 0x1;
					} else if (arg8 == 2) {
						Static104.anIntArrayArrayArray6[arg5][arg6 + 1][arg3] |= 0x1;
						Static104.anIntArrayArrayArray6[arg5][arg6][arg3] |= 0x2;
					} else if (arg8 == 3) {
						Static104.anIntArrayArrayArray6[arg5][arg6][arg3] |= 0x2;
						Static104.anIntArrayArrayArray6[arg5][arg6][arg3] |= 0x1;
					}
				}
				if (local63.anInt1372 != 0 && arg9 != null) {
					arg9.method4084(arg6, arg3, !local63.aBoolean120, arg1, arg8, local63.aBoolean119);
				}
				if (local63.anInt1344 != 16) {
					Static108.method1766(arg5, arg6, arg3, local63.anInt1344);
				}
			} else if (arg1 == 3) {
				if (local63.anInt1354 == -1 && local63.anIntArray129 == null && local63.anIntArray131 == null && !local63.aBoolean110) {
					local406 = local63.method1115(arg2, local194, local125, 3, null, local186, local178, local343, arg8, local221);
					if (Static283.aBoolean393 && local343) {
						Static193.method3207(local406.aClass81_Sub2_4, local186, local196, local194);
					}
					local390 = local406.aClass10_10;
				} else {
					local390 = new Class10_Sub6(arg0, 3, arg8, arg4, arg6, arg3, -1, local63.aBoolean111, null);
				}
				Static105.method1680(arg5, arg6, arg3, local178, local390, null, Static122.anIntArray280[arg8], 0, local287);
				if (local63.aBoolean114 && arg2) {
					if (arg8 == 0) {
						Static188.aByteArrayArrayArray17[arg5][arg6][arg3 + 1] = 50;
					} else if (arg8 == 1) {
						Static188.aByteArrayArrayArray17[arg5][arg6 + 1][arg3 + 1] = 50;
					} else if (arg8 == 2) {
						Static188.aByteArrayArrayArray17[arg5][arg6 + 1][arg3] = 50;
					} else if (arg8 == 3) {
						Static188.aByteArrayArrayArray17[arg5][arg6][arg3] = 50;
					}
				}
				if (local63.anInt1372 != 0 && arg9 != null) {
					arg9.method4084(arg6, arg3, !local63.aBoolean120, arg1, arg8, local63.aBoolean119);
				}
			} else if (arg1 == 9) {
				if (local63.anInt1354 == -1 && local63.anIntArray129 == null && local63.anIntArray131 == null && !local63.aBoolean110) {
					local406 = local63.method1115(arg2, local194, local125, arg1, null, local186, local178, local343, arg8, local221);
					if (Static283.aBoolean393 && local343) {
						Static193.method3207(local406.aClass81_Sub2_4, local186, local196, local194);
					}
					local390 = local406.aClass10_10;
				} else {
					local390 = new Class10_Sub6(arg0, arg1, arg8, arg4, arg6, arg3, -1, local63.aBoolean111, null);
				}
				Static64.method1014(arg5, arg6, arg3, local178, 1, 1, local390, local287);
				if (local63.anInt1372 != 0 && arg9 != null) {
					arg9.method4075(arg6, local81, local63.aBoolean119, arg3, local84, !local63.aBoolean120);
				}
				if (local63.anInt1344 != 16) {
					Static108.method1766(arg5, arg6, arg3, local63.anInt1344);
				}
			} else if (arg1 == 4) {
				if (local63.anInt1354 == -1 && local63.anIntArray129 == null && local63.anIntArray131 == null && !local63.aBoolean110) {
					local406 = local63.method1115(arg2, local194, local125, 4, null, local186, local178, local343, arg8, local221);
					if (Static283.aBoolean393 && local343) {
						Static193.method3207(local406.aClass81_Sub2_4, local186, local196, local194);
					}
					local390 = local406.aClass10_10;
				} else {
					local390 = new Class10_Sub6(arg0, 4, arg8, arg4, arg6, arg3, -1, local63.aBoolean111, null);
				}
				Static210.method3471(arg5, arg6, arg3, local178, local390, null, Static195.anIntArray437[arg8], 0, 0, 0, local287);
			} else {
				@Pc(1976) long local1976;
				@Pc(2018) Class10 local2018;
				@Pc(2034) Class174 local2034;
				if (arg1 == 5) {
					local1281 = 16;
					local1976 = Static148.method2517(arg5, arg6, arg3);
					if (local1976 != 0L) {
						local1281 = Static175.method2874((int) (local1976 >>> 32) & Integer.MAX_VALUE).anInt1344;
					}
					if (local63.anInt1354 == -1 && local63.anIntArray129 == null && local63.anIntArray131 == null && !local63.aBoolean110) {
						local2034 = local63.method1115(arg2, local194, local125, 4, null, local186, local178, local343, arg8, local221);
						if (Static283.aBoolean393 && local343) {
							Static193.method3207(local2034.aClass81_Sub2_4, local186 - Static36.anIntArray56[arg8] * 8, local196, local194 - Static206.anIntArray451[arg8] * 8);
						}
						local2018 = local2034.aClass10_10;
					} else {
						local2018 = new Class10_Sub6(arg0, 4, arg8, arg4, arg6, arg3, -1, local63.aBoolean111, null);
					}
					Static210.method3471(arg5, arg6, arg3, local178, local2018, null, Static195.anIntArray437[arg8], 0, Static36.anIntArray56[arg8] * local1281, local1281 * Static206.anIntArray451[arg8], local287);
				} else if (arg1 == 6) {
					local1976 = Static148.method2517(arg5, arg6, arg3);
					local1281 = 8;
					if (local1976 != 0L) {
						local1281 = Static175.method2874((int) (local1976 >>> 32) & Integer.MAX_VALUE).anInt1344 / 2;
					}
					if (local63.anInt1354 == -1 && local63.anIntArray129 == null && local63.anIntArray131 == null && !local63.aBoolean110) {
						local2034 = local63.method1115(arg2, local194, local125, 4, null, local186, local178, local343, arg8 + 4, local221);
						if (Static283.aBoolean393 && local343) {
							Static193.method3207(local2034.aClass81_Sub2_4, local186 - Static233.anIntArray505[arg8] * 8, local196, local194 - Static104.anIntArray193[arg8] * 8);
						}
						local2018 = local2034.aClass10_10;
					} else {
						local2018 = new Class10_Sub6(arg0, 4, arg8 + 4, arg4, arg6, arg3, -1, local63.aBoolean111, null);
					}
					Static210.method3471(arg5, arg6, arg3, local178, local2018, null, 256, arg8, local1281 * Static233.anIntArray505[arg8], Static104.anIntArray193[arg8] * local1281, local287);
				} else if (arg1 == 7) {
					@Pc(2224) int local2224 = arg8 + 2 & 0x3;
					if (local63.anInt1354 == -1 && local63.anIntArray129 == null && local63.anIntArray131 == null && !local63.aBoolean110) {
						@Pc(2259) Class174 local2259 = local63.method1115(arg2, local194, local125, 4, null, local186, local178, local343, local2224 + 4, local221);
						if (Static283.aBoolean393 && local343) {
							Static193.method3207(local2259.aClass81_Sub2_4, local186, local196, local194);
						}
						local390 = local2259.aClass10_10;
					} else {
						local390 = new Class10_Sub6(arg0, 4, local2224 + 4, arg4, arg6, arg3, -1, local63.aBoolean111, null);
					}
					Static210.method3471(arg5, arg6, arg3, local178, local390, null, 256, local2224, 0, 0, local287);
				} else if (arg1 == 8) {
					local1976 = Static148.method2517(arg5, arg6, arg3);
					local1281 = 8;
					if (local1976 != 0L) {
						local1281 = Static175.method2874((int) (local1976 >>> 32) & Integer.MAX_VALUE).anInt1344 / 2;
					}
					@Pc(2337) int local2337 = arg8 + 2 & 0x3;
					@Pc(2433) Class10 local2433;
					if (local63.anInt1354 == -1 && local63.anIntArray129 == null && local63.anIntArray131 == null && !local63.aBoolean110) {
						@Pc(2357) int local2357 = Static233.anIntArray505[arg8] * 8;
						@Pc(2363) int local2363 = Static104.anIntArray193[arg8] * 8;
						@Pc(2379) Class174 local2379 = local63.method1115(arg2, local194, local125, 4, null, local186, local178, local343, arg8 + 4, local221);
						if (Static283.aBoolean393 && local343) {
							Static193.method3207(local2379.aClass81_Sub2_4, local186 - local2357, local196, local194 - local2363);
						}
						local2018 = local2379.aClass10_10;
						local2379 = local63.method1115(arg2, local194, local125, 4, null, local186, local178, local343, local2337 + 4, local221);
						if (Static283.aBoolean393 && local343) {
							Static193.method3207(local2379.aClass81_Sub2_4, local186 - local2357, local196, local194 - local2363);
						}
						local2433 = local2379.aClass10_10;
					} else {
						local2018 = new Class10_Sub6(arg0, 4, arg8 + 4, arg4, arg6, arg3, -1, local63.aBoolean111, null);
						local2433 = new Class10_Sub6(arg0, 4, local2337 + 4, arg4, arg6, arg3, -1, local63.aBoolean111, null);
					}
					Static210.method3471(arg5, arg6, arg3, local178, local2018, local2433, 256, arg8, local1281 * Static233.anIntArray505[arg8], Static104.anIntArray193[arg8] * local1281, local287);
				}
			}
		}
	}
}
