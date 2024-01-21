import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!m", name = "pb", descriptor = "I")
	public static int anInt2218;

	@OriginalMember(owner = "client!m", name = "Z", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(III)V")
	public static void method1668(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int[] local8 = new int[4];
		local8[0] = arg1;
		@Pc(15) int[] local15 = new int[4];
		@Pc(17) int local17 = 1;
		local15[0] = arg0;
		for (@Pc(23) int local23 = 0; local23 < 4; local23++) {
			if (arg1 != Static74.anIntArray161[local23]) {
				local8[local17] = Static74.anIntArray161[local23];
				local15[local17] = Static143.anIntArray333[local23];
				local17++;
			}
		}
		Static74.anIntArray161 = local8;
		Static143.anIntArray333 = local15;
		Static112.method1965(Static163.aClass89Array1.length - 1, Static163.aClass89Array1, 0, Static143.anIntArray333, Static74.anIntArray161);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IBIII)V")
	public static void method1669(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static4.method2576(arg3, arg1, arg3 + arg0, arg2 + arg1);
		Static22.method499();
		Static92.anInt2056++;
		Static17.method365(true);
		Static40.method796(true);
		Static17.method365(false);
		Static40.method796(false);
		Static116.method2026();
		Static66.method1199();
		@Pc(51) int local51;
		@Pc(70) int local70;
		if (!Static184.aBoolean171) {
			local51 = Static23.anInt585;
			if (local51 < Static154.anInt3515 / 256) {
				local51 = Static154.anInt3515 / 256;
			}
			local70 = Static1.anInt14 + Static35.anInt964 & 0x7FF;
			if (Static34.aBooleanArray2[4] && Static72.anIntArray152[4] + 128 > local51) {
				local51 = Static72.anIntArray152[4] + 128;
			}
			Static92.method1572(local51 * 3 + 600, local51, local70, Static116.anInt2611, Static3.anInt111, Static102.method1694(Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anInt3040, Static44.anInt1086, Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anInt3026) - 50);
		}
		if (Static184.aBoolean171) {
			local51 = Static16.method238();
		} else {
			local51 = Static26.method566();
		}
		local70 = Static53.anInt1289;
		@Pc(125) int local125 = Static126.anInt2769;
		@Pc(127) int local127 = Static69.anInt1702;
		@Pc(129) int local129 = Static106.anInt2331;
		@Pc(131) int local131 = Static31.anInt838;
		@Pc(175) int local175;
		for (@Pc(133) int local133 = 0; local133 < 5; local133++) {
			if (Static34.aBooleanArray2[local133]) {
				local175 = (int) ((double) -Static21.anIntArray25[local133] + (double) (Static21.anIntArray25[local133] * 2 + 1) * Math.random() + Math.sin((double) Static19.anIntArray20[local133] / 100.0D * (double) Static95.anIntArray235[local133]) * (double) Static72.anIntArray152[local133]);
				if (local133 == 3) {
					Static31.anInt838 = local175 + Static31.anInt838 & 0x7FF;
				}
				if (local133 == 2) {
					Static69.anInt1702 += local175;
				}
				if (local133 == 0) {
					Static53.anInt1289 += local175;
				}
				if (local133 == 4) {
					Static106.anInt2331 += local175;
					if (Static106.anInt2331 < 128) {
						Static106.anInt2331 = 128;
					}
					if (Static106.anInt2331 > 383) {
						Static106.anInt2331 = 383;
					}
				}
				if (local133 == 1) {
					Static126.anInt2769 += local175;
				}
			}
		}
		local175 = Static36.anInt973;
		@Pc(238) int local238 = Static172.anInt3997;
		if (arg3 <= local175 && arg0 + arg3 > local175 && arg1 <= local238 && local238 < arg2 + arg1) {
			Static124.anInt1940 = Static36.anInt973 - arg3;
			Static124.anInt1941 = Static172.anInt3997 - arg1;
			Static124.aBoolean83 = true;
			Static124.anInt1942 = 0;
		} else {
			Static124.aBoolean83 = false;
			Static124.anInt1942 = 0;
		}
		Static81.method1360();
		Static4.method2572(arg3, arg1, arg0, arg2, 0);
		Static81.method1360();
		Static180.method3085(Static53.anInt1289, Static126.anInt2769, Static69.anInt1702, Static106.anInt2331, Static31.anInt838, local51);
		Static81.method1360();
		Static69.method1230();
		Static26.method567(arg0, arg1, arg2, arg3);
		Static185.method2990(arg1, arg3);
		((Class27) Static22.anInterface3_2).method1034(Static149.anInt3336);
		Static141.method594(arg2, arg1, arg0, arg3);
		Static31.anInt838 = local131;
		Static126.anInt2769 = local125;
		Static53.anInt1289 = local70;
		Static69.anInt1702 = local127;
		Static106.anInt2331 = local129;
		if (Static181.aBoolean168 && Static62.method1111() == 0) {
			Static181.aBoolean168 = false;
		}
		if (Static181.aBoolean168) {
			Static4.method2572(arg3, arg1, arg0, arg2, 0);
			Static63.method1116(false, Static71.aClass81_597);
		}
		if (!Static181.aBoolean168 && !Static149.aBoolean145 && local175 >= arg3 && local175 < arg3 + arg0 && local238 >= arg1 && arg2 + arg1 > local238) {
			Static176.method3052(arg3, arg1, local238, local175);
		}
	}

	@OriginalMember(owner = "client!m", name = "d", descriptor = "(I)V")
	public static void method1672() {
		Static95.aClass59_16.method1967();
		Static149.aClass59_23.method1967();
		Static116.aClass59_20.method1967();
		Static154.aClass59_24.method1967();
		Static66.aClass59_15.method1967();
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IILclient!gf;IIIII)V")
	public static void method1673(@OriginalArg(1) int arg0, @OriginalArg(2) Class28 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static50.aBoolean45 && (Static43.aByteArrayArrayArray2[0][arg2][arg4] & 0x2) == 0) {
			if ((Static43.aByteArrayArrayArray2[arg5][arg2][arg4] & 0x10) != 0) {
				return;
			}
			if (Static166.method2912(arg2, arg4, arg5) != Static77.anInt1824) {
				return;
			}
		}
		if (arg5 < Static54.anInt1304) {
			Static54.anInt1304 = arg5;
		}
		@Pc(52) Class1_Sub2_Sub8 local52 = Static14.method220(arg6);
		@Pc(66) int local66;
		@Pc(63) int local63;
		if (arg0 == 1 || arg0 == 3) {
			local63 = local52.anInt1237;
			local66 = local52.anInt1277;
		} else {
			local63 = local52.anInt1277;
			local66 = local52.anInt1237;
		}
		@Pc(86) int local86;
		@Pc(94) int local94;
		if (arg2 + local66 <= 104) {
			local86 = (local66 >> 1) + arg2;
			local94 = arg2 + (local66 + 1 >> 1);
		} else {
			local86 = arg2;
			local94 = arg2 + 1;
		}
		@Pc(109) int local109;
		@Pc(113) int local113;
		if (local63 + arg4 > 104) {
			local109 = arg4;
			local113 = arg4 + 1;
		} else {
			local113 = arg4 + (local63 + 1 >> 1);
			local109 = arg4 + (local63 >> 1);
		}
		@Pc(145) int[][] local145 = Static157.anIntArrayArrayArray7[arg5];
		@Pc(171) int local171 = local145[local94][local113] + local145[local94][local109] + local145[local86][local109] + local145[local86][local113] >> 2;
		@Pc(179) int local179 = (arg2 << 7) + (local66 << 6);
		@Pc(187) int local187 = (local63 << 6) + (arg4 << 7);
		@Pc(204) long local204 = (long) ((arg0 | 0x400) << 20 | arg4 << 7 | arg2 | arg3 << 14);
		if (local52.anInt1256 == 0) {
			local204 |= Long.MIN_VALUE;
		}
		if (local52.anInt1251 == 1) {
			local204 |= 0x400000L;
		}
		local204 |= (long) arg6 << 32;
		if (local52.method931()) {
			Static138.method2329(arg5, arg4, arg0, arg2, local52);
		}
		@Pc(283) Class1_Sub2_Sub1 local283;
		@Pc(297) Class1_Sub2_Sub13 local297;
		if (arg3 != 22) {
			@Pc(391) int local391;
			if (arg3 == 10 || arg3 == 11) {
				if (local52.anInt1272 == -1 && local52.anIntArray108 == null) {
					local297 = local52.method940(local171, arg0, local179, local187, 10, local145);
					local283 = local297.aClass1_Sub2_Sub1_4;
				} else {
					local283 = new Class1_Sub2_Sub1_Sub2(arg6, 10, arg0, arg5, arg2, arg4, local52.anInt1272, true, null);
				}
				if (local283 != null && Static170.method3006(arg5, arg2, arg4, local171, local66, local63, local283, arg3 == 11 ? 256 : 0, local204) && local52.aBoolean50) {
					local391 = 15;
					if (local283 instanceof Class1_Sub2_Sub1_Sub4) {
						local391 = ((Class1_Sub2_Sub1_Sub4) local283).method1456() / 4;
						if (local391 > 30) {
							local391 = 30;
						}
					}
					for (@Pc(407) int local407 = 0; local407 <= local66; local407++) {
						for (@Pc(411) int local411 = 0; local411 <= local63; local411++) {
							if (Static168.aByteArrayArrayArray9[arg5][local407 + arg2][local411 + arg4] < local391) {
								Static168.aByteArrayArrayArray9[arg5][local407 + arg2][arg4 + local411] = (byte) local391;
							}
						}
					}
				}
				if (local52.anInt1261 != 0 && arg1 != null) {
					arg1.method1048(local52.aBoolean46, arg2, arg4, local63, local66);
				}
			} else if (arg3 >= 12) {
				if (local52.anInt1272 == -1 && local52.anIntArray108 == null) {
					local297 = local52.method940(local171, arg0, local179, local187, arg3, local145);
					local283 = local297.aClass1_Sub2_Sub1_4;
				} else {
					local283 = new Class1_Sub2_Sub1_Sub2(arg6, arg3, arg0, arg5, arg2, arg4, local52.anInt1272, true, null);
				}
				Static170.method3006(arg5, arg2, arg4, local171, 1, 1, local283, 0, local204);
				if (arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg5 > 0) {
					Static166.anIntArrayArrayArray8[arg5][arg2][arg4] |= 0x924;
				}
				if (local52.anInt1261 != 0 && arg1 != null) {
					arg1.method1048(local52.aBoolean46, arg2, arg4, local63, local66);
				}
			} else if (arg3 == 0) {
				if (local52.anInt1272 == -1 && local52.anIntArray108 == null) {
					local297 = local52.method940(local171, arg0, local179, local187, 0, local145);
					local283 = local297.aClass1_Sub2_Sub1_4;
				} else {
					local283 = new Class1_Sub2_Sub1_Sub2(arg6, 0, arg0, arg5, arg2, arg4, local52.anInt1272, true, null);
				}
				Static88.method1497(arg5, arg2, arg4, local171, local283, null, Static68.anIntArray144[arg0], 0, local204);
				if (arg0 == 0) {
					if (local52.aBoolean50) {
						Static168.aByteArrayArrayArray9[arg5][arg2][arg4] = 50;
						Static168.aByteArrayArrayArray9[arg5][arg2][arg4 + 1] = 50;
					}
					if (local52.aBoolean47) {
						Static166.anIntArrayArrayArray8[arg5][arg2][arg4] |= 0x249;
					}
				} else if (arg0 == 1) {
					if (local52.aBoolean50) {
						Static168.aByteArrayArrayArray9[arg5][arg2][arg4 + 1] = 50;
						Static168.aByteArrayArrayArray9[arg5][arg2 + 1][arg4 + 1] = 50;
					}
					if (local52.aBoolean47) {
						Static166.anIntArrayArrayArray8[arg5][arg2][arg4 + 1] |= 0x492;
					}
				} else if (arg0 == 2) {
					if (local52.aBoolean50) {
						Static168.aByteArrayArrayArray9[arg5][arg2 + 1][arg4] = 50;
						Static168.aByteArrayArrayArray9[arg5][arg2 + 1][arg4 + 1] = 50;
					}
					if (local52.aBoolean47) {
						Static166.anIntArrayArrayArray8[arg5][arg2 + 1][arg4] |= 0x249;
					}
				} else if (arg0 == 3) {
					if (local52.aBoolean50) {
						Static168.aByteArrayArrayArray9[arg5][arg2][arg4] = 50;
						Static168.aByteArrayArrayArray9[arg5][arg2 + 1][arg4] = 50;
					}
					if (local52.aBoolean47) {
						Static166.anIntArrayArrayArray8[arg5][arg2][arg4] |= 0x492;
					}
				}
				if (local52.anInt1261 != 0 && arg1 != null) {
					arg1.method1038(arg4, arg0, local52.aBoolean46, arg3, arg2);
				}
				if (local52.anInt1253 != 16) {
					Static173.method3043(arg5, arg2, arg4, local52.anInt1253);
				}
			} else if (arg3 == 1) {
				if (local52.anInt1272 == -1 && local52.anIntArray108 == null) {
					local297 = local52.method940(local171, arg0, local179, local187, 1, local145);
					local283 = local297.aClass1_Sub2_Sub1_4;
				} else {
					local283 = new Class1_Sub2_Sub1_Sub2(arg6, 1, arg0, arg5, arg2, arg4, local52.anInt1272, true, null);
				}
				Static88.method1497(arg5, arg2, arg4, local171, local283, null, Static118.anIntArray281[arg0], 0, local204);
				if (local52.aBoolean50) {
					if (arg0 == 0) {
						Static168.aByteArrayArrayArray9[arg5][arg2][arg4 + 1] = 50;
					} else if (arg0 == 1) {
						Static168.aByteArrayArrayArray9[arg5][arg2 + 1][arg4 + 1] = 50;
					} else if (arg0 == 2) {
						Static168.aByteArrayArrayArray9[arg5][arg2 + 1][arg4] = 50;
					} else if (arg0 == 3) {
						Static168.aByteArrayArrayArray9[arg5][arg2][arg4] = 50;
					}
				}
				if (local52.anInt1261 != 0 && arg1 != null) {
					arg1.method1038(arg4, arg0, local52.aBoolean46, arg3, arg2);
				}
			} else {
				@Pc(999) int local999;
				@Pc(1060) Class1_Sub2_Sub13 local1060;
				if (arg3 == 2) {
					local999 = arg0 + 1 & 0x3;
					@Pc(1036) Class1_Sub2_Sub1 local1036;
					@Pc(1022) Class1_Sub2_Sub1 local1022;
					if (local52.anInt1272 == -1 && local52.anIntArray108 == null) {
						@Pc(1050) Class1_Sub2_Sub13 local1050 = local52.method940(local171, arg0 + 4, local179, local187, 2, local145);
						local1060 = local52.method940(local171, local999, local179, local187, 2, local145);
						local1036 = local1060.aClass1_Sub2_Sub1_4;
						local1022 = local1050.aClass1_Sub2_Sub1_4;
					} else {
						local1022 = new Class1_Sub2_Sub1_Sub2(arg6, 2, arg0 + 4, arg5, arg2, arg4, local52.anInt1272, true, null);
						local1036 = new Class1_Sub2_Sub1_Sub2(arg6, 2, local999, arg5, arg2, arg4, local52.anInt1272, true, null);
					}
					Static88.method1497(arg5, arg2, arg4, local171, local1022, local1036, Static68.anIntArray144[arg0], Static68.anIntArray144[local999], local204);
					if (local52.aBoolean47) {
						if (arg0 == 0) {
							Static166.anIntArrayArrayArray8[arg5][arg2][arg4] |= 0x249;
							Static166.anIntArrayArrayArray8[arg5][arg2][arg4 + 1] |= 0x492;
						} else if (arg0 == 1) {
							Static166.anIntArrayArrayArray8[arg5][arg2][arg4 + 1] |= 0x492;
							Static166.anIntArrayArrayArray8[arg5][arg2 + 1][arg4] |= 0x249;
						} else if (arg0 == 2) {
							Static166.anIntArrayArrayArray8[arg5][arg2 + 1][arg4] |= 0x249;
							Static166.anIntArrayArrayArray8[arg5][arg2][arg4] |= 0x492;
						} else if (arg0 == 3) {
							Static166.anIntArrayArrayArray8[arg5][arg2][arg4] |= 0x492;
							Static166.anIntArrayArrayArray8[arg5][arg2][arg4] |= 0x249;
						}
					}
					if (local52.anInt1261 != 0 && arg1 != null) {
						arg1.method1038(arg4, arg0, local52.aBoolean46, arg3, arg2);
					}
					if (local52.anInt1253 != 16) {
						Static173.method3043(arg5, arg2, arg4, local52.anInt1253);
					}
				} else if (arg3 == 3) {
					if (local52.anInt1272 == -1 && local52.anIntArray108 == null) {
						local297 = local52.method940(local171, arg0, local179, local187, 3, local145);
						local283 = local297.aClass1_Sub2_Sub1_4;
					} else {
						local283 = new Class1_Sub2_Sub1_Sub2(arg6, 3, arg0, arg5, arg2, arg4, local52.anInt1272, true, null);
					}
					Static88.method1497(arg5, arg2, arg4, local171, local283, null, Static118.anIntArray281[arg0], 0, local204);
					if (local52.aBoolean50) {
						if (arg0 == 0) {
							Static168.aByteArrayArrayArray9[arg5][arg2][arg4 + 1] = 50;
						} else if (arg0 == 1) {
							Static168.aByteArrayArrayArray9[arg5][arg2 + 1][arg4 + 1] = 50;
						} else if (arg0 == 2) {
							Static168.aByteArrayArrayArray9[arg5][arg2 + 1][arg4] = 50;
						} else if (arg0 == 3) {
							Static168.aByteArrayArrayArray9[arg5][arg2][arg4] = 50;
						}
					}
					if (local52.anInt1261 != 0 && arg1 != null) {
						arg1.method1038(arg4, arg0, local52.aBoolean46, arg3, arg2);
					}
				} else if (arg3 == 9) {
					if (local52.anInt1272 == -1 && local52.anIntArray108 == null) {
						local297 = local52.method940(local171, arg0, local179, local187, arg3, local145);
						local283 = local297.aClass1_Sub2_Sub1_4;
					} else {
						local283 = new Class1_Sub2_Sub1_Sub2(arg6, arg3, arg0, arg5, arg2, arg4, local52.anInt1272, true, null);
					}
					Static170.method3006(arg5, arg2, arg4, local171, 1, 1, local283, 0, local204);
					if (local52.anInt1261 != 0 && arg1 != null) {
						arg1.method1048(local52.aBoolean46, arg2, arg4, local63, local66);
					}
					if (local52.anInt1253 != 16) {
						Static173.method3043(arg5, arg2, arg4, local52.anInt1253);
					}
				} else if (arg3 == 4) {
					if (local52.anInt1272 == -1 && local52.anIntArray108 == null) {
						local297 = local52.method940(local171, arg0, local179, local187, 4, local145);
						local283 = local297.aClass1_Sub2_Sub1_4;
					} else {
						local283 = new Class1_Sub2_Sub1_Sub2(arg6, 4, arg0, arg5, arg2, arg4, local52.anInt1272, true, null);
					}
					Static165.method2898(arg5, arg2, arg4, local171, local283, null, Static68.anIntArray144[arg0], 0, 0, 0, local204);
				} else {
					@Pc(1564) long local1564;
					@Pc(1602) Class1_Sub2_Sub1 local1602;
					if (arg3 == 5) {
						local1564 = Static21.method421(arg5, arg2, arg4);
						local999 = 16;
						if (local1564 != 0L) {
							local999 = Static14.method220(Integer.MAX_VALUE & (int) (local1564 >>> 32)).anInt1253;
						}
						if (local52.anInt1272 == -1 && local52.anIntArray108 == null) {
							local1060 = local52.method940(local171, arg0, local179, local187, 4, local145);
							local1602 = local1060.aClass1_Sub2_Sub1_4;
						} else {
							local1602 = new Class1_Sub2_Sub1_Sub2(arg6, 4, arg0, arg5, arg2, arg4, local52.anInt1272, true, null);
						}
						Static165.method2898(arg5, arg2, arg4, local171, local1602, null, Static68.anIntArray144[arg0], 0, Static65.anIntArray132[arg0] * local999, Static70.anIntArray148[arg0] * local999, local204);
					} else if (arg3 == 6) {
						local999 = 8;
						local1564 = Static21.method421(arg5, arg2, arg4);
						if (local1564 != 0L) {
							local999 = Static14.method220((int) (local1564 >>> 32) & Integer.MAX_VALUE).anInt1253 / 2;
						}
						if (local52.anInt1272 == -1 && local52.anIntArray108 == null) {
							local1060 = local52.method940(local171, arg0 + 4, local179, local187, 4, local145);
							local1602 = local1060.aClass1_Sub2_Sub1_4;
						} else {
							local1602 = new Class1_Sub2_Sub1_Sub2(arg6, 4, arg0 + 4, arg5, arg2, arg4, local52.anInt1272, true, null);
						}
						Static165.method2898(arg5, arg2, arg4, local171, local1602, null, 256, arg0, Static54.anIntArray110[arg0] * local999, local999 * Static66.anIntArray137[arg0], local204);
					} else if (arg3 == 7) {
						local391 = arg0 + 2 & 0x3;
						if (local52.anInt1272 == -1 && local52.anIntArray108 == null) {
							@Pc(1779) Class1_Sub2_Sub13 local1779 = local52.method940(local171, local391 + 4, local179, local187, 4, local145);
							local283 = local1779.aClass1_Sub2_Sub1_4;
						} else {
							local283 = new Class1_Sub2_Sub1_Sub2(arg6, 4, local391 + 4, arg5, arg2, arg4, local52.anInt1272, true, null);
						}
						Static165.method2898(arg5, arg2, arg4, local171, local283, null, 256, local391, 0, 0, local204);
					} else if (arg3 == 8) {
						local999 = 8;
						local1564 = Static21.method421(arg5, arg2, arg4);
						if (local1564 != 0L) {
							local999 = Static14.method220(Integer.MAX_VALUE & (int) (local1564 >>> 32)).anInt1253 / 2;
						}
						@Pc(1833) int local1833 = arg0 + 2 & 0x3;
						@Pc(1873) Class1_Sub2_Sub1 local1873;
						if (local52.anInt1272 == -1 && local52.anIntArray108 == null) {
							@Pc(1889) Class1_Sub2_Sub13 local1889 = local52.method940(local171, arg0 + 4, local179, local187, 4, local145);
							@Pc(1901) Class1_Sub2_Sub13 local1901 = local52.method940(local171, local1833 + 4, local179, local187, 4, local145);
							local1873 = local1901.aClass1_Sub2_Sub1_4;
							local1602 = local1889.aClass1_Sub2_Sub1_4;
						} else {
							local1602 = new Class1_Sub2_Sub1_Sub2(arg6, 4, arg0 + 4, arg5, arg2, arg4, local52.anInt1272, true, null);
							local1873 = new Class1_Sub2_Sub1_Sub2(arg6, 4, local1833 + 4, arg5, arg2, arg4, local52.anInt1272, true, null);
						}
						Static165.method2898(arg5, arg2, arg4, local171, local1602, local1873, 256, arg0, Static54.anIntArray110[arg0] * local999, Static66.anIntArray137[arg0] * local999, local204);
					}
				}
			}
		} else if (!Static50.aBoolean45 || local52.anInt1256 != 0 || local52.anInt1261 == 1 || local52.aBoolean52) {
			if (local52.anInt1272 == -1 && local52.anIntArray108 == null) {
				local297 = local52.method940(local171, arg0, local179, local187, 22, local145);
				local283 = local297.aClass1_Sub2_Sub1_4;
			} else {
				local283 = new Class1_Sub2_Sub1_Sub2(arg6, 22, arg0, arg5, arg2, arg4, local52.anInt1272, true, null);
			}
			Static177.method3058(arg5, arg2, arg4, local171, local283, local204);
			if (local52.anInt1261 == 1 && arg1 != null) {
				arg1.method1036(arg4, arg2);
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "e", descriptor = "(I)V")
	public static void method1674() {
		aBigInteger1 = null;
	}
}
