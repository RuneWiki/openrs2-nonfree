import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "[Lclient!bc;")
	public static Class2_Sub2_Sub1_Sub2[] aClass2_Sub2_Sub1_Sub2Array5;

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "[Lclient!ae;")
	public static Class2_Sub2_Sub1_Sub1[] aClass2_Sub2_Sub1_Sub1Array4;

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "[I")
	public static int[] anIntArray114;

	@OriginalMember(owner = "client!ha", name = "t", descriptor = "Ljava/awt/Image;")
	public static Image anImage3;

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "Lclient!u;")
	public static Class74 aClass74_707 = Static72.method1077("(U2");

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "Lclient!u;")
	public static Class74 aClass74_708 = Static72.method1077("mapscene");

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "[B")
	public static byte[] aByteArray7 = new byte[520];

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "Lclient!u;")
	public static Class74 aClass74_709 = Static72.method1077("bevor Sie den Vorgang wiederholen)3");

	@OriginalMember(owner = "client!ha", name = "u", descriptor = "Lclient!u;")
	public static Class74 aClass74_710 = Static72.method1077("sideicons");

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "Lclient!u;")
	public static Class74 aClass74_711 = Static72.method1077("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!ha", name = "y", descriptor = "Lclient!u;")
	public static Class74 aClass74_713 = Static72.method1077("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILclient!u;Lclient!ic;)I")
	public static int method680(@OriginalArg(1) Class74 arg0, @OriginalArg(2) Class2_Sub10 arg1) {
		@Pc(6) int local6 = arg1.anInt2187;
		arg1.method1521(arg0.anInt2481);
		arg1.anInt2187 += Static105.aClass31_1.method679(arg0.aByteArray38, 0, arg1.aByteArray27, arg0.anInt2481, arg1.anInt2187);
		return arg1.anInt2187 - local6;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
	public static void method681() {
		try {
			if (Static9.anInt300 == 1) {
				@Pc(18) int local18 = Static12.aClass2_Sub16_Sub2_1.method1806();
				if (local18 > 0 && Static12.aClass2_Sub16_Sub2_1.method1791()) {
					local18 -= Static72.anInt1559;
					if (local18 < 0) {
						local18 = 0;
					}
					Static12.aClass2_Sub16_Sub2_1.method1808(local18);
				} else {
					Static12.aClass2_Sub16_Sub2_1.method1798();
					Static12.aClass2_Sub16_Sub2_1.method1802();
					Static33.aClass2_Sub18_1 = null;
					Static110.aClass35_1 = null;
					if (Static62.aClass26_12 == null) {
						Static9.anInt300 = 0;
					} else {
						Static9.anInt300 = 2;
					}
				}
			}
		} catch (@Pc(56) Exception local56) {
			local56.printStackTrace();
			Static12.aClass2_Sub16_Sub2_1.method1798();
			Static9.anInt300 = 0;
			Static110.aClass35_1 = null;
			Static33.aClass2_Sub18_1 = null;
			Static62.aClass26_12 = null;
		}
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
	public static void method682() {
		aClass2_Sub2_Sub1_Sub2Array5 = null;
		aClass74_710 = null;
		aClass74_711 = null;
		aByteArray7 = null;
		aClass74_709 = null;
		aClass74_713 = null;
		aClass74_708 = null;
		anImage3 = null;
		aClass2_Sub2_Sub1_Sub1Array4 = null;
		aClass74_707 = null;
		anIntArray114 = null;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)Lclient!cc;")
	public static Class2_Sub2_Sub1_Sub3 method683() {
		@Pc(17) Class2_Sub2_Sub1_Sub3 local17 = new Class2_Sub2_Sub1_Sub3(Static91.anIntArray265, Static71.anIntArray194, Static17.anIntArray54, Static57.anIntArray156, Static24.aByteArrayArray3);
		Static37.method1354();
		return local17;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIILclient!sd;IIIILclient!ob;)V")
	public static void method684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class69 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class55 arg8) {
		@Pc(13) int local13 = Static56.anIntArrayArrayArray2[arg7][arg2][arg3];
		@Pc(23) int local23 = Static56.anIntArrayArrayArray2[arg7][arg2 + 1][arg3];
		@Pc(35) int local35 = Static56.anIntArrayArrayArray2[arg7][arg2 + 1][arg3 + 1];
		@Pc(45) int local45 = Static56.anIntArrayArrayArray2[arg7][arg2][arg3 + 1];
		@Pc(55) int local55 = local45 + local35 + local23 + local13 >> 2;
		@Pc(67) int local67 = (arg5 << 14) + arg2 + (arg3 << 7) + 1073741824;
		@Pc(73) int local73 = arg6 + (arg1 << 6);
		@Pc(77) Class2_Sub2_Sub14 local77 = Static2.method19(arg5);
		if (local77.anInt2271 == 0) {
			local67 += Integer.MIN_VALUE;
		}
		if (local77.anInt2252 == 1) {
			local73 += 256;
		}
		@Pc(121) Class2_Sub2_Sub2 local121;
		if (arg6 == 22) {
			if (local77.anInt2268 == -1 && local77.anIntArray318 == null) {
				local121 = local77.method1551(22, local45, local35, local13, arg1, local23);
			} else {
				local121 = new Class2_Sub2_Sub2_Sub2(arg5, 22, arg1, local13, local23, local35, local45, local77.anInt2268, true, null);
			}
			arg4.method1648(arg0, arg2, arg3, local55, local121, local67, local73);
			if (local77.anInt2242 == 1) {
				arg8.method1283(arg3, arg2);
			}
			return;
		}
		@Pc(209) int local209;
		if (arg6 == 10 || arg6 == 11) {
			if (local77.anInt2268 == -1 && local77.anIntArray318 == null) {
				local121 = local77.method1551(10, local45, local35, local13, arg1, local23);
			} else {
				local121 = new Class2_Sub2_Sub2_Sub2(arg5, 10, arg1, local13, local23, local35, local45, local77.anInt2268, true, null);
			}
			if (local121 != null) {
				@Pc(212) int local212;
				if (arg1 == 1 || arg1 == 3) {
					local209 = local77.anInt2259;
					local212 = local77.anInt2279;
				} else {
					local212 = local77.anInt2259;
					local209 = local77.anInt2279;
				}
				@Pc(222) int local222 = 0;
				if (arg6 == 11) {
					local222 += 256;
				}
				arg4.method1624(arg0, arg2, arg3, local55, local209, local212, local121, local222, local67, local73);
			}
			if (local77.anInt2242 != 0) {
				arg8.method1271(arg1, local77.anInt2259, arg3, local77.anInt2279, arg2, local77.aBoolean93);
			}
		} else if (arg6 >= 12) {
			if (local77.anInt2268 == -1 && local77.anIntArray318 == null) {
				local121 = local77.method1551(arg6, local45, local35, local13, arg1, local23);
			} else {
				local121 = new Class2_Sub2_Sub2_Sub2(arg5, arg6, arg1, local13, local23, local35, local45, local77.anInt2268, true, null);
			}
			arg4.method1624(arg0, arg2, arg3, local55, 1, 1, local121, 0, local67, local73);
			if (local77.anInt2242 != 0) {
				arg8.method1271(arg1, local77.anInt2259, arg3, local77.anInt2279, arg2, local77.aBoolean93);
			}
		} else if (arg6 == 0) {
			if (local77.anInt2268 == -1 && local77.anIntArray318 == null) {
				local121 = local77.method1551(0, local45, local35, local13, arg1, local23);
			} else {
				local121 = new Class2_Sub2_Sub2_Sub2(arg5, 0, arg1, local13, local23, local35, local45, local77.anInt2268, true, null);
			}
			arg4.method1620(arg0, arg2, arg3, local55, local121, null, Static100.anIntArray315[arg1], 0, local67, local73);
			if (local77.anInt2242 != 0) {
				arg8.method1276(arg6, local77.aBoolean93, arg2, arg3, arg1);
			}
		} else if (arg6 == 1) {
			if (local77.anInt2268 == -1 && local77.anIntArray318 == null) {
				local121 = local77.method1551(1, local45, local35, local13, arg1, local23);
			} else {
				local121 = new Class2_Sub2_Sub2_Sub2(arg5, 1, arg1, local13, local23, local35, local45, local77.anInt2268, true, null);
			}
			arg4.method1620(arg0, arg2, arg3, local55, local121, null, Static112.anIntArray350[arg1], 0, local67, local73);
			if (local77.anInt2242 != 0) {
				arg8.method1276(arg6, local77.aBoolean93, arg2, arg3, arg1);
			}
		} else {
			@Pc(481) int local481;
			@Pc(521) Class2_Sub2_Sub2 local521;
			if (arg6 == 2) {
				local481 = arg1 + 1 & 0x3;
				@Pc(506) Class2_Sub2_Sub2 local506;
				if (local77.anInt2268 == -1 && local77.anIntArray318 == null) {
					local506 = local77.method1551(2, local45, local35, local13, arg1 + 4, local23);
					local521 = local77.method1551(2, local45, local35, local13, local481, local23);
				} else {
					local506 = new Class2_Sub2_Sub2_Sub2(arg5, 2, arg1 + 4, local13, local23, local35, local45, local77.anInt2268, true, null);
					local521 = new Class2_Sub2_Sub2_Sub2(arg5, 2, local481, local13, local23, local35, local45, local77.anInt2268, true, null);
				}
				arg4.method1620(arg0, arg2, arg3, local55, local506, local521, Static100.anIntArray315[arg1], Static100.anIntArray315[local481], local67, local73);
				if (local77.anInt2242 != 0) {
					arg8.method1276(arg6, local77.aBoolean93, arg2, arg3, arg1);
				}
			} else if (arg6 == 3) {
				if (local77.anInt2268 == -1 && local77.anIntArray318 == null) {
					local121 = local77.method1551(3, local45, local35, local13, arg1, local23);
				} else {
					local121 = new Class2_Sub2_Sub2_Sub2(arg5, 3, arg1, local13, local23, local35, local45, local77.anInt2268, true, null);
				}
				arg4.method1620(arg0, arg2, arg3, local55, local121, null, Static112.anIntArray350[arg1], 0, local67, local73);
				if (local77.anInt2242 != 0) {
					arg8.method1276(arg6, local77.aBoolean93, arg2, arg3, arg1);
				}
			} else if (arg6 == 9) {
				if (local77.anInt2268 == -1 && local77.anIntArray318 == null) {
					local121 = local77.method1551(arg6, local45, local35, local13, arg1, local23);
				} else {
					local121 = new Class2_Sub2_Sub2_Sub2(arg5, arg6, arg1, local13, local23, local35, local45, local77.anInt2268, true, null);
				}
				arg4.method1624(arg0, arg2, arg3, local55, 1, 1, local121, 0, local67, local73);
				if (local77.anInt2242 != 0) {
					arg8.method1271(arg1, local77.anInt2259, arg3, local77.anInt2279, arg2, local77.aBoolean93);
				}
			} else {
				if (local77.aBoolean90) {
					if (arg1 == 1) {
						local481 = local45;
						local45 = local35;
						local35 = local23;
						local23 = local13;
						local13 = local481;
					} else if (arg1 == 2) {
						local481 = local45;
						local45 = local23;
						local23 = local481;
						@Pc(726) int local726 = local35;
						local35 = local13;
						local13 = local726;
					} else if (arg1 == 3) {
						local481 = local45;
						local45 = local13;
						local13 = local23;
						local23 = local35;
						local35 = local481;
					}
				}
				if (arg6 == 4) {
					if (local77.anInt2268 == -1 && local77.anIntArray318 == null) {
						local121 = local77.method1551(4, local45, local35, local13, 0, local23);
					} else {
						local121 = new Class2_Sub2_Sub2_Sub2(arg5, 4, 0, local13, local23, local35, local45, local77.anInt2268, true, null);
					}
					arg4.method1618(arg0, arg2, arg3, local55, local121, Static100.anIntArray315[arg1], arg1 * 512, 0, 0, local67, local73);
				} else if (arg6 == 5) {
					local481 = 16;
					local209 = arg4.method1638(arg0, arg2, arg3);
					if (local209 != 0) {
						local481 = Static2.method19(local209 >> 14 & 0x7FFF).anInt2254;
					}
					if (local77.anInt2268 == -1 && local77.anIntArray318 == null) {
						local521 = local77.method1551(4, local45, local35, local13, 0, local23);
					} else {
						local521 = new Class2_Sub2_Sub2_Sub2(arg5, 4, 0, local13, local23, local35, local45, local77.anInt2268, true, null);
					}
					arg4.method1618(arg0, arg2, arg3, local55, local521, Static100.anIntArray315[arg1], arg1 * 512, local481 * Static69.anIntArray189[arg1], local481 * Static90.anIntArray264[arg1], local67, local73);
				} else if (arg6 == 6) {
					if (local77.anInt2268 == -1 && local77.anIntArray318 == null) {
						local121 = local77.method1551(4, local45, local35, local13, 0, local23);
					} else {
						local121 = new Class2_Sub2_Sub2_Sub2(arg5, 4, 0, local13, local23, local35, local45, local77.anInt2268, true, null);
					}
					arg4.method1618(arg0, arg2, arg3, local55, local121, 256, arg1, 0, 0, local67, local73);
				} else if (arg6 == 7) {
					if (local77.anInt2268 == -1 && local77.anIntArray318 == null) {
						local121 = local77.method1551(4, local45, local35, local13, 0, local23);
					} else {
						local121 = new Class2_Sub2_Sub2_Sub2(arg5, 4, 0, local13, local23, local35, local45, local77.anInt2268, true, null);
					}
					arg4.method1618(arg0, arg2, arg3, local55, local121, 512, arg1, 0, 0, local67, local73);
				} else if (arg6 == 8) {
					if (local77.anInt2268 == -1 && local77.anIntArray318 == null) {
						local121 = local77.method1551(4, local45, local35, local13, 0, local23);
					} else {
						local121 = new Class2_Sub2_Sub2_Sub2(arg5, 4, 0, local13, local23, local35, local45, local77.anInt2268, true, null);
					}
					arg4.method1618(arg0, arg2, arg3, local55, local121, 768, arg1, 0, 0, local67, local73);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
	public static void method685() {
		Static81.aByteArrayArrayArray5 = new byte[4][104][104];
		Static109.anInt2400 = 99;
		Static99.anIntArray310 = new int[104];
		Static38.aByteArrayArrayArray2 = new byte[4][104][104];
		Static97.anIntArray414 = new int[104];
		Static113.anIntArrayArrayArray5 = new int[4][105][105];
		Static27.anIntArrayArray7 = new int[105][105];
		Static113.aByteArrayArrayArray7 = new byte[4][104][104];
		Static116.anIntArray361 = new int[104];
		Static103.anIntArray327 = new int[104];
		Static45.aByteArrayArrayArray3 = new byte[4][105][105];
		Static128.anIntArray418 = new int[104];
		Static91.aByteArrayArrayArray6 = new byte[4][104][104];
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!u;BILclient!u;Lclient!g;Z)V")
	public static void method686(@OriginalArg(0) Class74 arg0, @OriginalArg(3) Class74 arg1, @OriginalArg(4) Class26 arg2) {
		@Pc(4) int local4 = arg2.method1351(arg1);
		@Pc(19) int local19 = arg2.method1374(local4, arg0);
		Static4.method26(local19, arg2, local4, 255);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
	public static void method687() {
		Static100.anInt2221 = 0;
		@Pc(156) int local156;
		for (@Pc(9) int local9 = -1; local9 < Static29.anInt686 + Static10.anInt320; local9++) {
			@Pc(17) Class2_Sub2_Sub2_Sub1 local17;
			if (local9 == -1) {
				local17 = Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1;
			} else if (local9 < Static10.anInt320) {
				local17 = Static112.aClass2_Sub2_Sub2_Sub1_Sub2Array1[Static92.anIntArray267[local9]];
			} else {
				local17 = Static80.aClass2_Sub2_Sub2_Sub1_Sub1Array1[Static40.anIntArray110[local9 - Static10.anInt320]];
			}
			if (local17 != null && local17.method1861()) {
				@Pc(53) Class2_Sub2_Sub9 local53;
				if (local17 instanceof Class2_Sub2_Sub2_Sub1_Sub1) {
					local53 = ((Class2_Sub2_Sub2_Sub1_Sub1) local17).aClass2_Sub2_Sub9_1;
					if (local53.anIntArray130 != null) {
						local53 = local53.method767();
					}
					if (local53 == null) {
						continue;
					}
				}
				if (Static10.anInt320 <= local9) {
					local53 = ((Class2_Sub2_Sub2_Sub1_Sub1) local17).aClass2_Sub2_Sub9_1;
					if (local53.anIntArray130 != null) {
						local53 = local53.method767();
					}
					if (local53.anInt1084 >= 0 && Static105.aClass2_Sub2_Sub1_Sub2Array10.length > local53.anInt1084) {
						Static82.method1270(local17, local17.anInt2668 + 15);
						if (Static119.anInt2549 > -1) {
							Static105.aClass2_Sub2_Sub1_Sub2Array10[local53.anInt1084].method213(Static119.anInt2549 - 12, Static55.anInt513 + -30);
						}
					}
					if (Static52.anInt1251 == 1 && Static40.anIntArray110[local9 - Static10.anInt320] == Static124.anInt2739 && Static107.anInt2338 % 20 < 10) {
						Static82.method1270(local17, local17.anInt2668 + 15);
						if (Static119.anInt2549 > -1) {
							Static55.aClass2_Sub2_Sub1_Sub2Array3[0].method213(Static119.anInt2549 - 12, Static55.anInt513 - 28);
						}
					}
				} else {
					local156 = 30;
					@Pc(159) Class2_Sub2_Sub2_Sub1_Sub2 local159 = (Class2_Sub2_Sub2_Sub1_Sub2) local17;
					if (local159.anInt2726 != -1 || local159.anInt2750 != -1) {
						Static82.method1270(local17, local17.anInt2668 + 15);
						if (Static119.anInt2549 > -1) {
							if (local159.anInt2726 != -1) {
								aClass2_Sub2_Sub1_Sub2Array5[local159.anInt2726].method213(Static119.anInt2549 - 12, Static55.anInt513 - 30);
								local156 += 25;
							}
							if (local159.anInt2750 != -1) {
								Static105.aClass2_Sub2_Sub1_Sub2Array10[local159.anInt2750].method213(Static119.anInt2549 - 12, -local156 + Static55.anInt513);
								local156 += 25;
							}
						}
					}
					if (local9 >= 0 && Static52.anInt1251 == 10 && Static54.anInt1326 == Static92.anIntArray267[local9]) {
						Static82.method1270(local17, local17.anInt2668 + 15);
						if (Static119.anInt2549 > -1) {
							Static55.aClass2_Sub2_Sub1_Sub2Array3[1].method213(Static119.anInt2549 - 12, Static55.anInt513 + -local156);
						}
					}
				}
				if (local17.aClass74_1657 != null && (Static10.anInt320 <= local9 || Static65.anInt1443 == 0 || Static65.anInt1443 == 3 || Static65.anInt1443 == 1 && Static7.method1864(((Class2_Sub2_Sub2_Sub1_Sub2) local17).aClass74_1661))) {
					Static82.method1270(local17, local17.anInt2668);
					if (Static119.anInt2549 > -1 && Static100.anInt2221 < Static31.anInt793) {
						Static31.anIntArray91[Static100.anInt2221] = Static54.aClass2_Sub2_Sub1_Sub3_7.method302(local17.aClass74_1657) / 2;
						Static31.anIntArray90[Static100.anInt2221] = Static54.aClass2_Sub2_Sub1_Sub3_7.anInt382;
						Static31.anIntArray88[Static100.anInt2221] = Static119.anInt2549;
						Static31.anIntArray89[Static100.anInt2221] = Static55.anInt513;
						Static31.anIntArray85[Static100.anInt2221] = local17.anInt2678;
						Static31.anIntArray86[Static100.anInt2221] = local17.anInt2662;
						Static31.anIntArray87[Static100.anInt2221] = local17.anInt2687;
						Static31.aClass74Array5[Static100.anInt2221] = local17.aClass74_1657;
						Static100.anInt2221++;
					}
				}
				if (local17.anInt2667 > Static107.anInt2338) {
					Static82.method1270(local17, local17.anInt2668 + 15);
					if (Static119.anInt2549 > -1) {
						local156 = local17.anInt2694 * 30 / local17.anInt2671;
						if (local156 > 30) {
							local156 = 30;
						}
						Static58.method702(Static119.anInt2549 - 15, Static55.anInt513 - 3, local156, 5, 65280);
						Static58.method702(local156 + Static119.anInt2549 - 15, Static55.anInt513 + -3, 30 - local156, 5, 16711680);
					}
				}
				for (local156 = 0; local156 < 4; local156++) {
					if (Static107.anInt2338 < local17.anIntArray396[local156]) {
						Static82.method1270(local17, local17.anInt2668 / 2);
						if (Static119.anInt2549 > -1) {
							if (local156 == 1) {
								Static55.anInt513 -= 20;
							}
							if (local156 == 2) {
								Static55.anInt513 -= 10;
								Static119.anInt2549 -= 15;
							}
							if (local156 == 3) {
								Static55.anInt513 -= 10;
								Static119.anInt2549 += 15;
							}
							Static27.aClass2_Sub2_Sub1_Sub2Array4[local17.anIntArray397[local156]].method213(Static119.anInt2549 - 12, Static55.anInt513 - 12);
							Static123.aClass2_Sub2_Sub1_Sub3_13.method314(Static56.method940(local17.anIntArray395[local156]), Static119.anInt2549, Static55.anInt513 + 4, 0);
							Static123.aClass2_Sub2_Sub1_Sub3_13.method314(Static56.method940(local17.anIntArray395[local156]), Static119.anInt2549 - 1, Static55.anInt513 - -3, 16777215);
						}
					}
				}
			}
		}
		for (@Pc(496) int local496 = 0; local496 < Static100.anInt2221; local496++) {
			local156 = Static31.anIntArray88[local496];
			@Pc(506) int local506 = Static31.anIntArray89[local496];
			@Pc(510) int local510 = Static31.anIntArray90[local496];
			@Pc(512) boolean local512 = true;
			@Pc(516) int local516 = Static31.anIntArray91[local496];
			while (local512) {
				local512 = false;
				for (@Pc(522) int local522 = 0; local522 < local496; local522++) {
					if (local506 + 2 > Static31.anIntArray89[local522] + -Static31.anIntArray90[local522] && Static31.anIntArray89[local522] + 2 > local506 - local510 && local156 - local516 < Static31.anIntArray91[local522] + Static31.anIntArray88[local522] && local516 + local156 > -Static31.anIntArray91[local522] + Static31.anIntArray88[local522] && local506 > Static31.anIntArray89[local522] - Static31.anIntArray90[local522]) {
						local506 = Static31.anIntArray89[local522] - Static31.anIntArray90[local522];
						local512 = true;
					}
				}
			}
			Static119.anInt2549 = Static31.anIntArray88[local496];
			Static55.anInt513 = Static31.anIntArray89[local496] = local506;
			@Pc(612) Class74 local612 = Static31.aClass74Array5[local496];
			if (Static64.anInt1433 == 0) {
				@Pc(632) int local632 = 16776960;
				if (Static31.anIntArray85[local496] < 6) {
					local632 = Static1.anIntArray306[Static31.anIntArray85[local496]];
				}
				if (Static31.anIntArray85[local496] == 6) {
					local632 = Static57.anInt1378 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static31.anIntArray85[local496] == 7) {
					local632 = Static57.anInt1378 % 20 >= 10 ? 65535 : 255;
				}
				if (Static31.anIntArray85[local496] == 8) {
					local632 = Static57.anInt1378 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(706) int local706;
				if (Static31.anIntArray85[local496] == 9) {
					local706 = 150 - Static31.anIntArray87[local496];
					if (local706 < 50) {
						local632 = local706 * 1280 + 16711680;
					} else if (local706 < 100) {
						local632 = 16776960 - (local706 - 50) * 327680;
					} else if (local706 < 150) {
						local632 = (local706 - 100) * 5 + 65280;
					}
				}
				if (Static31.anIntArray85[local496] == 10) {
					local706 = 150 - Static31.anIntArray87[local496];
					if (local706 < 50) {
						local632 = local706 * 5 + 16711680;
					} else if (local706 < 100) {
						local632 = 16711935 - (local706 - 50) * 327680;
					} else if (local706 < 150) {
						local632 = local706 * 327680 + 255 + 500 - local706 * 5 - 32768000;
					}
				}
				if (Static31.anIntArray85[local496] == 11) {
					local706 = 150 - Static31.anIntArray87[local496];
					if (local706 < 50) {
						local632 = 16777215 - local706 * 327685;
					} else if (local706 < 100) {
						local632 = local706 * 327685 + 65280 - 16384250;
					} else if (local706 < 150) {
						local632 = 49545215 - local706 * 327680;
					}
				}
				if (Static31.anIntArray86[local496] == 0) {
					Static54.aClass2_Sub2_Sub1_Sub3_7.method314(local612, Static119.anInt2549, Static55.anInt513 + 1, 0);
					Static54.aClass2_Sub2_Sub1_Sub3_7.method314(local612, Static119.anInt2549, Static55.anInt513, local632);
				}
				if (Static31.anIntArray86[local496] == 1) {
					Static54.aClass2_Sub2_Sub1_Sub3_7.method316(local612, Static119.anInt2549, Static55.anInt513 + 1, 0, Static57.anInt1378);
					Static54.aClass2_Sub2_Sub1_Sub3_7.method316(local612, Static119.anInt2549, Static55.anInt513, local632, Static57.anInt1378);
				}
				if (Static31.anIntArray86[local496] == 2) {
					Static54.aClass2_Sub2_Sub1_Sub3_7.method320(local612, Static119.anInt2549, Static55.anInt513 + 1, 0, Static57.anInt1378);
					Static54.aClass2_Sub2_Sub1_Sub3_7.method320(local612, Static119.anInt2549, Static55.anInt513, local632, Static57.anInt1378);
				}
				if (Static31.anIntArray86[local496] == 3) {
					Static54.aClass2_Sub2_Sub1_Sub3_7.method319(local612, Static119.anInt2549, Static55.anInt513 + 1, 0, Static57.anInt1378, 150 - Static31.anIntArray87[local496]);
					Static54.aClass2_Sub2_Sub1_Sub3_7.method319(local612, Static119.anInt2549, Static55.anInt513, local632, Static57.anInt1378, 150 - Static31.anIntArray87[local496]);
				}
				@Pc(976) int local976;
				if (Static31.anIntArray86[local496] == 4) {
					local706 = Static54.aClass2_Sub2_Sub1_Sub3_7.method302(local612);
					local976 = (150 - Static31.anIntArray87[local496]) * (local706 + 100) / 150;
					Static58.method711(Static119.anInt2549 - 50, 0, Static119.anInt2549 + 50, 334);
					Static54.aClass2_Sub2_Sub1_Sub3_7.method308(local612, Static119.anInt2549 + 50 - local976, Static55.anInt513 + 1, 0);
					Static54.aClass2_Sub2_Sub1_Sub3_7.method308(local612, Static119.anInt2549 + 50 - local976, Static55.anInt513, local632);
					Static58.method699();
				}
				if (Static31.anIntArray86[local496] == 5) {
					local706 = 150 - Static31.anIntArray87[local496];
					Static58.method711(0, Static55.anInt513 - Static54.aClass2_Sub2_Sub1_Sub3_7.anInt382 - 1, 512, Static55.anInt513 + 5);
					local976 = 0;
					if (local706 < 25) {
						local976 = local706 - 25;
					} else if (local706 > 125) {
						local976 = local706 - 125;
					}
					Static54.aClass2_Sub2_Sub1_Sub3_7.method314(local612, Static119.anInt2549, Static55.anInt513 + local976 + 1, 0);
					Static54.aClass2_Sub2_Sub1_Sub3_7.method314(local612, Static119.anInt2549, local976 + Static55.anInt513, local632);
					Static58.method699();
				}
			} else {
				Static54.aClass2_Sub2_Sub1_Sub3_7.method314(local612, Static119.anInt2549, Static55.anInt513 + 1, 0);
				Static54.aClass2_Sub2_Sub1_Sub3_7.method314(local612, Static119.anInt2549, Static55.anInt513, 16776960);
			}
		}
	}
}
