import java.io.IOException;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!dg", name = "S", descriptor = "Lclient!oj;")
	public static Class84 aClass84_18 = new Class84(64);

	@OriginalMember(owner = "client!dg", name = "ab", descriptor = "Lclient!hh;")
	public static Class50 aClass50_323 = Static186.method3527("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!dg", name = "cb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_324 = Static186.method3527("<img=1>");

	@OriginalMember(owner = "client!dg", name = "db", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!dg", name = "fb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_325 = Static186.method3527(")1");

	@OriginalMember(owner = "client!dg", name = "gb", descriptor = "I")
	public static int anInt921 = 0;

	@OriginalMember(owner = "client!dg", name = "ib", descriptor = "I")
	public static int anInt923 = 0;

	@OriginalMember(owner = "client!dg", name = "jb", descriptor = "I")
	public static int anInt924 = 0;

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "(B)V")
	public static void method670() {
		for (@Pc(11) int local11 = 0; local11 < 5; local11++) {
			Static116.aBooleanArray8[local11] = false;
		}
		Static144.anInt2937 = -1;
		Static28.anInt544 = 1;
		Static217.anInt4288 = -1;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!me;ILclient!pa;Lclient!pa;)V")
	public static void method671(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) Class86 arg1, @OriginalArg(3) Class86 arg2) {
		Static217.aClass86_80 = arg2;
		Static103.aClass86_34 = arg1;
		Static15.anInterface3_1 = arg0;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IILclient!vf;ILclient!qh;IZ)V")
	public static void method672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub8 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class93 arg4, @OriginalArg(5) int arg5) {
		if (arg2 == null) {
			return;
		}
		@Pc(12) int local12 = Static223.anInt4341 + Static104.anInt2068 & 0x7FF;
		@Pc(24) int local24 = Math.max(arg4.anInt3600 / 2, arg4.anInt3620 / 2) + 10;
		@Pc(32) int local32 = arg5 * arg5 + arg0 * arg0;
		if (local32 > local24 * local24) {
			return;
		}
		@Pc(47) int local47 = Class120.anIntArray491[local12];
		@Pc(55) int local55 = local47 * 256 / (Static106.anInt2129 + 256);
		@Pc(59) int local59 = Class120.anIntArray492[local12];
		@Pc(67) int local67 = local59 * 256 / (Static106.anInt2129 + 256);
		@Pc(78) int local78 = arg5 * local67 - arg0 * local55 >> 16;
		@Pc(88) int local88 = local55 * arg5 + arg0 * local67 >> 16;
		((Class1_Sub1_Sub8_Sub1) arg2).method2443(arg4.anInt3600 / 2 + arg3 + local88 - arg2.anInt2986 / 2, -(arg2.anInt2992 / 2) + -local78 + arg1 - -(arg4.anInt3620 / 2), arg4.anIntArray394, arg4.anIntArray398);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "([BII)I")
	public static int method674(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Static150.method2517(0, arg0, arg1);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static69.anIntArrayArrayArray4[arg0][local16][local20] == -Static1.anInt43) {
						return false;
					}
				}
			}
			local20 = (arg1 << 7) + 1;
			@Pc(146) int local146 = (arg3 << 7) + 2;
			@Pc(156) int local156 = Static119.anIntArrayArrayArray10[arg0][arg1][arg3] + arg5;
			if (!Static120.method1907(local20, local156, local146)) {
				return false;
			}
			@Pc(169) int local169 = (arg2 << 7) - 1;
			if (!Static120.method1907(local169, local156, local146)) {
				return false;
			}
			@Pc(182) int local182 = (arg4 << 7) - 1;
			if (!Static120.method1907(local20, local156, local182)) {
				return false;
			} else if (Static120.method1907(local169, local156, local182)) {
				return true;
			} else {
				return false;
			}
		} else if (method676(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static120.method1907(local16 + 1, Static119.anIntArrayArrayArray10[arg0][arg1][arg3] + arg5, local20 + 1) && Static120.method1907(local16 + 128 - 1, Static119.anIntArrayArrayArray10[arg0][arg1 + 1][arg3] + arg5, local20 + 1) && Static120.method1907(local16 + 128 - 1, Static119.anIntArrayArrayArray10[arg0][arg1 + 1][arg3 + 1] + arg5, local20 + 128 - 1) && Static120.method1907(local16 + 1, Static119.anIntArrayArrayArray10[arg0][arg1][arg3 + 1] + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(III)Z")
	public static boolean method676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static69.anIntArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == -Static1.anInt43) {
			return false;
		} else if (local7 == Static1.anInt43) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static120.method1907(local22 + 1, Static119.anIntArrayArrayArray10[arg0][arg1][arg2], local26 + 1) && Static120.method1907(local22 + 128 - 1, Static119.anIntArrayArrayArray10[arg0][arg1 + 1][arg2], local26 + 1) && Static120.method1907(local22 + 128 - 1, Static119.anIntArrayArrayArray10[arg0][arg1 + 1][arg2 + 1], local26 + 128 - 1) && Static120.method1907(local22 + 1, Static119.anIntArrayArrayArray10[arg0][arg1][arg2 + 1], local26 + 128 - 1)) {
				Static69.anIntArrayArrayArray4[arg0][arg1][arg2] = Static1.anInt43;
				return true;
			} else {
				Static69.anIntArrayArrayArray4[arg0][arg1][arg2] = -Static1.anInt43;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "(I)V")
	public static void method677() {
		if (Static67.anInt1301 > 0) {
			Static67.anInt1301--;
		}
		if (Static219.anInt2996 > 1) {
			Static219.anInt2996--;
			Static155.anInt3200 = Static31.anInt594;
		}
		if (Static36.aBoolean29) {
			Static36.aBoolean29 = false;
			Static91.method3219();
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < 100 && Static15.method215(); local29++) {
		}
		if (Static220.anInt4304 != 30) {
			return;
		}
		Static158.method2635(Static32.aClass1_Sub17_Sub1_1);
		@Pc(51) Object local51 = Static113.aClass21_1.anObject2;
		@Pc(92) int local92;
		@Pc(89) int local89;
		@Pc(94) int local94;
		@Pc(109) int local109;
		@Pc(125) int local125;
		synchronized (Static113.aClass21_1.anObject2) {
			if (!Static223.aBoolean210) {
				Static113.aClass21_1.anInt878 = 0;
			} else if (Static2.anInt59 != 0 || Static113.aClass21_1.anInt878 >= 40) {
				Static32.aClass1_Sub17_Sub1_1.method2182(207);
				Static32.aClass1_Sub17_Sub1_1.method2175(0);
				local89 = 0;
				local92 = Static32.aClass1_Sub17_Sub1_1.anInt2656;
				for (local94 = 0; Static113.aClass21_1.anInt878 > local94 && Static32.aClass1_Sub17_Sub1_1.anInt2656 - local92 < 240; local94++) {
					local89++;
					local109 = Static113.aClass21_1.anIntArray71[local94];
					if (local109 < 0) {
						local109 = 0;
					} else if (local109 > 65534) {
						local109 = 65534;
					}
					local125 = Static113.aClass21_1.anIntArray72[local94];
					if (local125 < 0) {
						local125 = 0;
					} else if (local125 > 65534) {
						local125 = 65534;
					}
					@Pc(141) boolean local141 = false;
					if (Static113.aClass21_1.anIntArray71[local94] == -1 && Static113.aClass21_1.anIntArray72[local94] == -1) {
						local109 = -1;
						local141 = true;
						local125 = -1;
					}
					if (local125 != Static183.anInt3789 || local109 != Static68.anInt1304) {
						@Pc(189) int local189 = local125 - Static183.anInt3789;
						Static183.anInt3789 = local125;
						@Pc(196) int local196 = local109 - Static68.anInt1304;
						Static68.anInt1304 = local109;
						if (Static197.anInt4430 < 8 && local189 >= -32 && local189 <= 31 && local196 >= -32 && local196 <= 31) {
							local189 += 32;
							local196 += 32;
							Static32.aClass1_Sub17_Sub1_1.method2151((Static197.anInt4430 << 12) + ((local189 << 6) + local196));
							Static197.anInt4430 = 0;
						} else if (Static197.anInt4430 < 32 && local189 >= -128 && local189 <= 127 && local196 >= -128 && local196 <= 127) {
							local189 += 128;
							local196 += 128;
							Static32.aClass1_Sub17_Sub1_1.method2175(Static197.anInt4430 + 128);
							Static32.aClass1_Sub17_Sub1_1.method2151((local189 << 8) + local196);
							Static197.anInt4430 = 0;
						} else if (Static197.anInt4430 < 32) {
							Static32.aClass1_Sub17_Sub1_1.method2175(Static197.anInt4430 + 192);
							if (local141) {
								Static32.aClass1_Sub17_Sub1_1.method2124(Integer.MIN_VALUE);
							} else {
								Static32.aClass1_Sub17_Sub1_1.method2124(local109 << 16 | local125);
							}
							Static197.anInt4430 = 0;
						} else {
							Static32.aClass1_Sub17_Sub1_1.method2151(Static197.anInt4430 + 57344);
							if (local141) {
								Static32.aClass1_Sub17_Sub1_1.method2124(Integer.MIN_VALUE);
							} else {
								Static32.aClass1_Sub17_Sub1_1.method2124(local109 << 16 | local125);
							}
							Static197.anInt4430 = 0;
						}
					} else if (Static197.anInt4430 < 2047) {
						Static197.anInt4430++;
					}
				}
				Static32.aClass1_Sub17_Sub1_1.method2179(Static32.aClass1_Sub17_Sub1_1.anInt2656 - local92);
				if (Static113.aClass21_1.anInt878 > local89) {
					Static113.aClass21_1.anInt878 -= local89;
					for (local109 = 0; local109 < Static113.aClass21_1.anInt878; local109++) {
						Static113.aClass21_1.anIntArray72[local109] = Static113.aClass21_1.anIntArray72[local109 + local89];
						Static113.aClass21_1.anIntArray71[local109] = Static113.aClass21_1.anIntArray71[local89 + local109];
					}
				} else {
					Static113.aClass21_1.anInt878 = 0;
				}
			}
		}
		if (Static2.anInt59 != 0) {
			local92 = Static163.anInt3374;
			@Pc(414) long local414 = (Static27.aLong26 - Static212.aLong161) / 50L;
			Static212.aLong161 = Static27.aLong26;
			local89 = Static70.anInt1323;
			if (local92 < 0) {
				local92 = 0;
			} else if (local92 > 65535) {
				local92 = 65535;
			}
			if (local414 > 32767L) {
				local414 = 32767L;
			}
			@Pc(444) byte local444 = 0;
			if (local89 < 0) {
				local89 = 0;
			} else if (local89 > 65535) {
				local89 = 65535;
			}
			local109 = (int) local414;
			if (Static2.anInt59 == 2) {
				local444 = 1;
			}
			Static32.aClass1_Sub17_Sub1_1.method2182(195);
			Static32.aClass1_Sub17_Sub1_1.method2124(local92 << 16 | local89);
			Static32.aClass1_Sub17_Sub1_1.method2136(local109 | local444 << 15);
		}
		if (Static165.anInt2645 > 0) {
			Static165.anInt2645--;
		}
		if (Static188.aBooleanArray21[96] || Static188.aBooleanArray21[97] || Static188.aBooleanArray21[98] || Static188.aBooleanArray21[99]) {
			Static110.aBoolean98 = true;
		}
		if (Static110.aBoolean98 && Static165.anInt2645 <= 0) {
			Static110.aBoolean98 = false;
			Static165.anInt2645 = 20;
			Static32.aClass1_Sub17_Sub1_1.method2182(166);
			Static32.aClass1_Sub17_Sub1_1.method2151(Static176.anInt3690);
			Static32.aClass1_Sub17_Sub1_1.method2151(Static104.anInt2068);
		}
		if (Static231.aBoolean215 && !Static98.aBoolean89) {
			Static98.aBoolean89 = true;
			Static32.aClass1_Sub17_Sub1_1.method2182(21);
			Static32.aClass1_Sub17_Sub1_1.method2175(1);
		}
		if (!Static231.aBoolean215 && Static98.aBoolean89) {
			Static98.aBoolean89 = false;
			Static32.aClass1_Sub17_Sub1_1.method2182(21);
			Static32.aClass1_Sub17_Sub1_1.method2175(0);
		}
		if (!Static91.aBoolean192) {
			Static32.aClass1_Sub17_Sub1_1.method2182(84);
			Static32.aClass1_Sub17_Sub1_1.method2160(Static206.method3255());
			Static91.aBoolean192 = true;
		}
		Static157.method2620();
		if (Static220.anInt4304 != 30) {
			return;
		}
		Static91.method3224();
		Static115.method1854();
		Static173.anInt3576++;
		if (Static173.anInt3576 > 750) {
			Static91.method3219();
			return;
		}
		Static53.method802();
		Static34.method508();
		Static165.method2137();
		if (Static124.aClass93_73 != null) {
			Static208.method2995();
		}
		for (@Pc(639) int local639 = Static163.method2723(true); local639 != -1; local639 = Static163.method2723(false)) {
			Static203.method543(local639);
			Static204.anIntArray466[Static176.anInt3680++ & 0x1F] = local639;
		}
		for (@Pc(664) Class1_Sub1_Sub13 local664 = Static175.method2899(); local664 != null; local664 = Static175.method2899()) {
			local92 = local664.method2257();
			local89 = local664.method2258();
			if (local92 == 1) {
				Static63.anIntArray102[local89] = local664.anInt2779;
				Static3.anIntArray14[Static183.anInt3798++ & 0x1F] = local89;
			} else if (local92 == 2) {
				Static63.aClass50Array28[local89] = local664.aClass50_937;
				Static152.anIntArray328[Static232.anInt4448++ & 0x1F] = local89;
			}
		}
		if (Static169.anInt3448 != 0) {
			Static198.anInt3992 += 20;
			if (Static198.anInt3992 >= 400) {
				Static169.anInt3448 = 0;
			}
		}
		anInt921++;
		if (Static66.aClass93_44 != null) {
			Static151.anInt3155++;
			if (Static151.anInt3155 >= 15) {
				Static66.method999(Static66.aClass93_44);
				Static66.aClass93_44 = null;
			}
		}
		@Pc(843) Class93 local843;
		if (Static9.aClass93_9 != null) {
			Static66.method999(Static9.aClass93_9);
			Static63.anInt1260++;
			if (Static45.anInt940 + 5 < Static117.anInt2301 || Static45.anInt940 - 5 > Static117.anInt2301 || Static196.anInt3982 + 5 < Static110.anInt2205 || Static110.anInt2205 < Static196.anInt3982 - 5) {
				Static177.aBoolean168 = true;
			}
			if (Static64.anInt1281 == 0) {
				if (Static177.aBoolean168 && Static63.anInt1260 >= 5) {
					if (Static9.aClass93_9 == Static197.aClass93_124 && Static58.anInt1155 != Static116.anInt2294) {
						local843 = Static9.aClass93_9;
						@Pc(849) byte local849 = 0;
						if (Static114.anInt2289 == 1 && local843.anInt3618 == 206) {
							local849 = 1;
						}
						if (local843.anIntArray392[Static116.anInt2294] <= 0) {
							local849 = 0;
						}
						if (Static159.method3332(Static35.method552(local843))) {
							local94 = Static58.anInt1155;
							local109 = Static116.anInt2294;
							local843.anIntArray392[local109] = local843.anIntArray392[local94];
							local843.anIntArray401[local109] = local843.anIntArray401[local94];
							local843.anIntArray392[local94] = -1;
							local843.anIntArray401[local94] = 0;
						} else if (local849 == 1) {
							local94 = Static58.anInt1155;
							local109 = Static116.anInt2294;
							while (local94 != local109) {
								if (local109 < local94) {
									local843.method2910(local94, local94 - 1);
									local94--;
								} else if (local94 < local109) {
									local843.method2910(local94, local94 + 1);
									local94++;
								}
							}
						} else {
							local843.method2910(Static58.anInt1155, Static116.anInt2294);
						}
						Static32.aClass1_Sub17_Sub1_1.method2182(109);
						Static32.aClass1_Sub17_Sub1_1.method2147(local849);
						Static32.aClass1_Sub17_Sub1_1.method2151(Static116.anInt2294);
						Static32.aClass1_Sub17_Sub1_1.method2154(Static58.anInt1155);
						Static32.aClass1_Sub17_Sub1_1.method2144(Static9.aClass93_9.anInt3603);
					}
				} else if ((Static92.anInt1866 == 1 || Static7.method126(Static193.anInt3035 - 1)) && Static193.anInt3035 > 2) {
					Static97.method1525();
				} else if (Static193.anInt3035 > 0) {
					Static224.method67(Static193.anInt3035 - 1);
				}
				Static9.aClass93_9 = null;
				Static2.anInt59 = 0;
				Static151.anInt3155 = 10;
			}
		}
		Static40.anInt879 = 0;
		Static10.aBoolean9 = false;
		local843 = Static147.aClass93_91;
		Static93.aClass93_58 = null;
		@Pc(1001) Class93 local1001 = Static146.aClass93_90;
		Static147.aClass93_91 = null;
		Static146.aClass93_90 = null;
		Static7.aBoolean6 = false;
		while (Static177.method2919() && Static40.anInt879 < 128) {
			Static122.anIntArray270[Static40.anInt879] = Static69.anInt1316;
			Static186.anIntArray518[Static40.anInt879] = Static57.anInt1134;
			Static40.anInt879++;
		}
		Static124.aClass93_73 = null;
		if (Static10.anInt204 != -1) {
			Static221.method3400(Static48.anInt1023, 0, 0, Static185.anInt3844, 0, Static10.anInt204, 0);
		}
		Static31.anInt594++;
		while (true) {
			@Pc(1052) Class1_Sub29 local1052;
			@Pc(1068) Class93 local1068;
			@Pc(1057) Class93 local1057;
			do {
				local1052 = (Class1_Sub29) Static23.aClass75_3.method2241();
				if (local1052 == null) {
					while (true) {
						do {
							local1052 = (Class1_Sub29) Static191.aClass75_19.method2241();
							if (local1052 == null) {
								while (true) {
									do {
										local1052 = (Class1_Sub29) Static209.aClass75_21.method2241();
										if (local1052 == null) {
											if (Static121.aBoolean103 && Static124.aClass93_73 == null) {
												Static121.aBoolean103 = false;
											}
											if (Static54.aClass93_35 != null) {
												Static109.method1724();
											}
											if (Static122.anInt2447 > 0 && Static188.aBooleanArray21[82] && Static188.aBooleanArray21[81] && Static87.anInt1831 != 0) {
												local94 = Static212.anInt4195 - Static87.anInt1831;
												if (local94 < 0) {
													local94 = 0;
												} else if (local94 > 3) {
													local94 = 3;
												}
												Static16.method231(Static101.anInt2041 + Static230.aClass20_Sub3_Sub1_3.anIntArray313[0], local94, Static91.anInt4078 + Static230.aClass20_Sub3_Sub1_3.anIntArray311[0]);
											}
											if (Static218.anInt3570 != -1) {
												local94 = Static218.anInt3570;
												local109 = Static63.anInt1255;
												if (Static122.anInt2447 > 0 && Static188.aBooleanArray21[82] && Static188.aBooleanArray21[81]) {
													Static16.method231(local109 + Static101.anInt2041, Static212.anInt4195, Static91.anInt4078 + local94);
												} else {
													@Pc(1281) boolean local1281 = Static233.method3515(local94, 0, 0, 0, 0, local109, true, Static230.aClass20_Sub3_Sub1_3.anIntArray311[0], Static230.aClass20_Sub3_Sub1_3.anIntArray313[0], 0, 0);
													if (local1281) {
														Static144.anInt2938 = Static70.anInt1323;
														Static169.anInt3448 = 1;
														Static52.anInt3318 = Static163.anInt3374;
														Static198.anInt3992 = 0;
													}
												}
												Static218.anInt3570 = -1;
											}
											Static186.method3528();
											if (local843 != Static147.aClass93_91) {
												if (local843 != null) {
													Static66.method999(local843);
												}
												if (Static147.aClass93_91 != null) {
													Static66.method999(Static147.aClass93_91);
												}
											}
											if (Static146.aClass93_90 != local1001 && Static54.anInt1079 == Static65.anInt4129) {
												if (local1001 != null) {
													Static66.method999(local1001);
												}
												if (Static146.aClass93_90 != null) {
													Static66.method999(Static146.aClass93_90);
												}
											}
											if (Static146.aClass93_90 == null) {
												if (Static54.anInt1079 > 0) {
													Static54.anInt1079--;
												}
											} else if (Static65.anInt4129 > Static54.anInt1079) {
												Static54.anInt1079++;
												if (Static54.anInt1079 == Static65.anInt4129) {
													Static66.method999(Static146.aClass93_90);
												}
											}
											if (Static28.anInt544 == 1) {
												Static57.method842();
											} else if (Static28.anInt544 == 2) {
												Static86.method1287();
											} else {
												Static26.method383();
											}
											for (local94 = 0; local94 < 5; local94++) {
												@Pc(1398) int local1398 = Static1.anIntArray10[local94]++;
											}
											local109 = Static184.method3081();
											local125 = Static97.method1524();
											if (local109 > 4500 && local125 > 4500) {
												Static67.anInt1301 = 250;
												Static188.method3103(4000);
												Static32.aClass1_Sub17_Sub1_1.method2182(34);
											}
											Static19.anInt399++;
											Static86.anInt1771++;
											Static34.anInt665++;
											@Pc(1456) int local1456;
											if (Static34.anInt665 > 500) {
												Static34.anInt665 = 0;
												local1456 = (int) (Math.random() * 8.0D);
												if ((local1456 & 0x1) == 1) {
													Static210.anInt4162 += Static70.anInt1324;
												}
												if ((local1456 & 0x2) == 2) {
													Static43.anInt929 += Static101.anInt2038;
												}
												if ((local1456 & 0x4) == 4) {
													Static74.anInt1501 += Static107.anInt2134;
												}
											}
											if (Static19.anInt399 > 500) {
												Static19.anInt399 = 0;
												local1456 = (int) (Math.random() * 8.0D);
												if ((local1456 & 0x2) == 2) {
													Static106.anInt2129 += Static185.anInt3845;
												}
												if ((local1456 & 0x1) == 1) {
													Static223.anInt4341 += Static9.anInt193;
												}
											}
											if (Static106.anInt2129 < -20) {
												Static185.anInt3845 = 1;
											}
											if (Static223.anInt4341 < -60) {
												Static9.anInt193 = 2;
											}
											if (Static74.anInt1501 < -40) {
												Static107.anInt2134 = 1;
											}
											if (Static223.anInt4341 > 60) {
												Static9.anInt193 = -2;
											}
											if (Static74.anInt1501 > 40) {
												Static107.anInt2134 = -1;
											}
											if (Static210.anInt4162 < -50) {
												Static70.anInt1324 = 2;
											}
											if (Static43.anInt929 < -55) {
												Static101.anInt2038 = 2;
											}
											if (Static43.anInt929 > 55) {
												Static101.anInt2038 = -2;
											}
											if (Static210.anInt4162 > 50) {
												Static70.anInt1324 = -2;
											}
											if (Static106.anInt2129 > 10) {
												Static185.anInt3845 = -1;
											}
											if (Static86.anInt1771 > 50) {
												Static32.aClass1_Sub17_Sub1_1.method2182(171);
											}
											Static220.method3398();
											try {
												if (Static33.aClass26_2 != null && Static32.aClass1_Sub17_Sub1_1.anInt2656 > 0) {
													Static33.aClass26_2.method781(Static32.aClass1_Sub17_Sub1_1.aByteArray40, Static32.aClass1_Sub17_Sub1_1.anInt2656);
													Static86.anInt1771 = 0;
													Static32.aClass1_Sub17_Sub1_1.anInt2656 = 0;
													return;
												}
												return;
											} catch (@Pc(1611) IOException local1611) {
												Static91.method3219();
												return;
											}
										}
										local1057 = local1052.aClass93_119;
										if (local1057.anInt3614 < 0) {
											break;
										}
										local1068 = Static164.method2725(local1057.anInt3660);
									} while (local1068 == null || local1068.aClass93Array1 == null || local1068.aClass93Array1.length <= local1057.anInt3614 || local1057 != local1068.aClass93Array1[local1057.anInt3614]);
									Static144.method2381(local1052);
								}
							}
							local1057 = local1052.aClass93_119;
							if (local1057.anInt3614 < 0) {
								break;
							}
							local1068 = Static164.method2725(local1057.anInt3660);
						} while (local1068 == null || local1068.aClass93Array1 == null || local1057.anInt3614 >= local1068.aClass93Array1.length || local1068.aClass93Array1[local1057.anInt3614] != local1057);
						Static144.method2381(local1052);
					}
				}
				local1057 = local1052.aClass93_119;
				if (local1057.anInt3614 < 0) {
					break;
				}
				local1068 = Static164.method2725(local1057.anInt3660);
			} while (local1068 == null || local1068.aClass93Array1 == null || local1068.aClass93Array1.length <= local1057.anInt3614 || local1057 != local1068.aClass93Array1[local1057.anInt3614]);
			Static144.method2381(local1052);
		}
	}
}
