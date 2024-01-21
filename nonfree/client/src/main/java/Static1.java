import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "f", descriptor = "[I")
	public static int[] anIntArray1;

	@OriginalMember(owner = "client!a", name = "l", descriptor = "Lclient!kc;")
	public static Class22 aClass22_1;

	@OriginalMember(owner = "client!a", name = "o", descriptor = "Lclient!ha;")
	public static Class29 aClass29_1;

	@OriginalMember(owner = "client!a", name = "h", descriptor = "Lclient!wd;")
	private static Class80 aClass80_3 = Static2.method59(" from your ignore list first");

	@OriginalMember(owner = "client!a", name = "b", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1 = aClass80_3;

	@OriginalMember(owner = "client!a", name = "c", descriptor = "[Z")
	public static boolean[] aBooleanArray1 = new boolean[5];

	@OriginalMember(owner = "client!a", name = "i", descriptor = "Lclient!wd;")
	private static Class80 aClass80_4 = Static2.method59("Loading wordpack )2 ");

	@OriginalMember(owner = "client!a", name = "d", descriptor = "Lclient!wd;")
	public static Class80 aClass80_2 = aClass80_4;

	@OriginalMember(owner = "client!a", name = "j", descriptor = "Lclient!wd;")
	public static Class80 aClass80_5 = Static2.method59("Hierhin gehen");

	@OriginalMember(owner = "client!a", name = "m", descriptor = "Lclient!wd;")
	public static Class80 aClass80_6 = Static2.method59("ams");

	@OriginalMember(owner = "client!a", name = "p", descriptor = "Lclient!wd;")
	public static Class80 aClass80_7 = Static2.method59("::gc");

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIB)I")
	public static int method1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * 57 + arg1;
		@Pc(20) int local20 = local10 << 13 ^ local10;
		@Pc(34) int local34 = (local20 * local20 * 15731 + 789221) * local20 + 1376312589 & Integer.MAX_VALUE;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	public static void method2() {
		anIntArray1 = null;
		aClass22_1 = null;
		aClass80_2 = null;
		aClass80_7 = null;
		aClass29_1 = null;
		aBooleanArray1 = null;
		aClass80_1 = null;
		aClass80_4 = null;
		aClass80_6 = null;
		aClass80_3 = null;
		aClass80_5 = null;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
	public static void method3() {
		Static120.aClass32_55.method878();
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(JB)V")
	public static void method4(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static64.anInt1824 >= 100) {
			Static3.method65(0, Static3.aClass80_42, Static40.aClass80_446);
			return;
		}
		@Pc(27) Class80 local27 = Static102.method1658(arg0).method2000();
		for (@Pc(29) int local29 = 0; local29 < Static64.anInt1824; local29++) {
			if (Static64.aLongArray5[local29] == arg0) {
				Static3.method65(0, Static93.method1444(new Class80[] { local27, Static24.aClass80_319 }), Static40.aClass80_446);
				return;
			}
		}
		for (@Pc(68) int local68 = 0; local68 < Static45.anInt2090; local68++) {
			if (Static3.aLongArray1[local68] == arg0) {
				Static3.method65(0, Static93.method1444(new Class80[] { Static62.aClass80_657, local27, Static94.aClass80_934 }), Static40.aClass80_446);
				return;
			}
		}
		if (!local27.method2017(Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.aClass80_924)) {
			Static64.aLongArray5[Static64.anInt1824++] = arg0;
			Static70.aBoolean131 = true;
			Static120.aClass2_Sub17_Sub1_3.method1799(226);
			Static120.aClass2_Sub17_Sub1_3.method1772(arg0);
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)I")
	public static int method5(@OriginalArg(0) int arg0) {
		return arg0 >> 17 & 0x7;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IZILclient!me;ILclient!sa;III)V")
	public static void method6(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class49 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class64 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static18.aBoolean51 && (Static108.aByteArrayArrayArray7[0][arg0][arg6] & 0x2) == 0) {
			if ((Static108.aByteArrayArrayArray7[arg1][arg0][arg6] & 0x10) != 0) {
				return;
			}
			if (Static126.method1983(arg0, arg1, arg6) != Static90.anInt2213) {
				return;
			}
		}
		if (Static113.anInt2928 > arg1) {
			Static113.anInt2928 = arg1;
		}
		@Pc(65) int local65 = Static100.anIntArrayArrayArray5[arg1][arg0 + 1][arg6];
		@Pc(73) int local73 = Static100.anIntArrayArrayArray5[arg1][arg0][arg6];
		@Pc(85) int local85 = Static100.anIntArrayArrayArray5[arg1][arg0 + 1][arg6 + 1];
		@Pc(95) int local95 = Static100.anIntArrayArrayArray5[arg1][arg0][arg6 + 1];
		@Pc(106) int local106 = local85 + local73 + local65 + local95 >> 2;
		@Pc(110) Class2_Sub1_Sub10 local110 = Static18.method404(arg7);
		@Pc(122) int local122 = arg0 + (arg6 << 7) + (arg7 << 14) + 1073741824;
		if (local110.anInt1653 == 0) {
			local122 += Integer.MIN_VALUE;
		}
		@Pc(138) int local138 = arg3 + (arg5 << 6);
		if (local110.anInt1622 == 1) {
			local138 += 256;
		}
		if (local110.method967()) {
			Static17.method327(arg6, local110, arg5, arg0, arg1);
		}
		@Pc(190) Class2_Sub1_Sub1 local190;
		if (arg3 != 22) {
			@Pc(286) int local286;
			if (arg3 == 10 || arg3 == 11) {
				if (local110.anInt1650 == -1 && local110.anIntArray207 == null) {
					local190 = local110.method963(local95, 10, local73, local85, arg5, local65);
				} else {
					local190 = new Class2_Sub1_Sub1_Sub7(arg7, 10, arg5, local73, local65, local85, local95, local110.anInt1650, true, null);
				}
				if (local190 != null) {
					@Pc(283) int local283;
					if (arg5 == 1 || arg5 == 3) {
						local283 = local110.anInt1634;
						local286 = local110.anInt1630;
					} else {
						local283 = local110.anInt1630;
						local286 = local110.anInt1634;
					}
					@Pc(296) int local296 = 0;
					if (arg3 == 11) {
						local296 += 256;
					}
					if (arg4.method1616(arg1, arg0, arg6, local106, local286, local283, local190, local296, local122, local138) && local110.aBoolean114) {
						@Pc(318) int local318 = 15;
						if (local190 instanceof Class2_Sub1_Sub1_Sub2) {
							local318 = ((Class2_Sub1_Sub1_Sub2) local190).method213() / 4;
							if (local318 > 30) {
								local318 = 30;
							}
						}
						for (@Pc(334) int local334 = 0; local334 <= local286; local334++) {
							for (@Pc(338) int local338 = 0; local338 <= local283; local338++) {
								if (Static97.aByteArrayArrayArray6[arg1][local334 + arg0][arg6 + local338] < local318) {
									Static97.aByteArrayArrayArray6[arg1][local334 + arg0][local338 + arg6] = (byte) local318;
								}
							}
						}
					}
				}
				if (local110.anInt1641 != 0 && arg2 != null) {
					arg2.method1173(local110.aBoolean111, arg5, local110.anInt1630, local110.anInt1634, arg6, arg0);
				}
			} else if (arg3 >= 12) {
				if (local110.anInt1650 == -1 && local110.anIntArray207 == null) {
					local190 = local110.method963(local95, arg3, local73, local85, arg5, local65);
				} else {
					local190 = new Class2_Sub1_Sub1_Sub7(arg7, arg3, arg5, local73, local65, local85, local95, local110.anInt1650, true, null);
				}
				arg4.method1616(arg1, arg0, arg6, local106, 1, 1, local190, 0, local122, local138);
				if (arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg1 > 0) {
					Static79.anIntArrayArrayArray4[arg1][arg0][arg6] |= 0x924;
				}
				if (local110.anInt1641 != 0 && arg2 != null) {
					arg2.method1173(local110.aBoolean111, arg5, local110.anInt1630, local110.anInt1634, arg6, arg0);
				}
			} else if (arg3 == 0) {
				if (local110.anInt1650 == -1 && local110.anIntArray207 == null) {
					local190 = local110.method963(local95, 0, local73, local85, arg5, local65);
				} else {
					local190 = new Class2_Sub1_Sub1_Sub7(arg7, 0, arg5, local73, local65, local85, local95, local110.anInt1650, true, null);
				}
				arg4.method1639(arg1, arg0, arg6, local106, local190, null, Static85.anIntArray276[arg5], 0, local122, local138);
				if (arg5 == 0) {
					if (local110.aBoolean114) {
						Static97.aByteArrayArrayArray6[arg1][arg0][arg6] = 50;
						Static97.aByteArrayArrayArray6[arg1][arg0][arg6 + 1] = 50;
					}
					if (local110.aBoolean110) {
						Static79.anIntArrayArrayArray4[arg1][arg0][arg6] |= 0x249;
					}
				} else if (arg5 == 1) {
					if (local110.aBoolean114) {
						Static97.aByteArrayArrayArray6[arg1][arg0][arg6 + 1] = 50;
						Static97.aByteArrayArrayArray6[arg1][arg0 + 1][arg6 + 1] = 50;
					}
					if (local110.aBoolean110) {
						Static79.anIntArrayArrayArray4[arg1][arg0][arg6 + 1] |= 0x492;
					}
				} else if (arg5 == 2) {
					if (local110.aBoolean114) {
						Static97.aByteArrayArrayArray6[arg1][arg0 + 1][arg6] = 50;
						Static97.aByteArrayArrayArray6[arg1][arg0 + 1][arg6 + 1] = 50;
					}
					if (local110.aBoolean110) {
						Static79.anIntArrayArrayArray4[arg1][arg0 + 1][arg6] |= 0x249;
					}
				} else if (arg5 == 3) {
					if (local110.aBoolean114) {
						Static97.aByteArrayArrayArray6[arg1][arg0][arg6] = 50;
						Static97.aByteArrayArrayArray6[arg1][arg0 + 1][arg6] = 50;
					}
					if (local110.aBoolean110) {
						Static79.anIntArrayArrayArray4[arg1][arg0][arg6] |= 0x492;
					}
				}
				if (local110.anInt1641 != 0 && arg2 != null) {
					arg2.method1179(arg3, arg0, arg6, arg5, local110.aBoolean111);
				}
				if (local110.anInt1645 != 16) {
					arg4.method1636(arg1, arg0, arg6, local110.anInt1645);
				}
			} else if (arg3 == 1) {
				if (local110.anInt1650 == -1 && local110.anIntArray207 == null) {
					local190 = local110.method963(local95, 1, local73, local85, arg5, local65);
				} else {
					local190 = new Class2_Sub1_Sub1_Sub7(arg7, 1, arg5, local73, local65, local85, local95, local110.anInt1650, true, null);
				}
				arg4.method1639(arg1, arg0, arg6, local106, local190, null, Static9.anIntArray23[arg5], 0, local122, local138);
				if (local110.aBoolean114) {
					if (arg5 == 0) {
						Static97.aByteArrayArrayArray6[arg1][arg0][arg6 + 1] = 50;
					} else if (arg5 == 1) {
						Static97.aByteArrayArrayArray6[arg1][arg0 + 1][arg6 + 1] = 50;
					} else if (arg5 == 2) {
						Static97.aByteArrayArrayArray6[arg1][arg0 + 1][arg6] = 50;
					} else if (arg5 == 3) {
						Static97.aByteArrayArrayArray6[arg1][arg0][arg6] = 50;
					}
				}
				if (local110.anInt1641 != 0 && arg2 != null) {
					arg2.method1179(arg3, arg0, arg6, arg5, local110.aBoolean111);
				}
			} else {
				@Pc(928) int local928;
				@Pc(967) Class2_Sub1_Sub1 local967;
				if (arg3 == 2) {
					local928 = arg5 + 1 & 0x3;
					@Pc(952) Class2_Sub1_Sub1 local952;
					if (local110.anInt1650 == -1 && local110.anIntArray207 == null) {
						local952 = local110.method963(local95, 2, local73, local85, arg5 + 4, local65);
						local967 = local110.method963(local95, 2, local73, local85, local928, local65);
					} else {
						local952 = new Class2_Sub1_Sub1_Sub7(arg7, 2, arg5 + 4, local73, local65, local85, local95, local110.anInt1650, true, null);
						local967 = new Class2_Sub1_Sub1_Sub7(arg7, 2, local928, local73, local65, local85, local95, local110.anInt1650, true, null);
					}
					arg4.method1639(arg1, arg0, arg6, local106, local952, local967, Static85.anIntArray276[arg5], Static85.anIntArray276[local928], local122, local138);
					if (local110.aBoolean110) {
						if (arg5 == 0) {
							Static79.anIntArrayArrayArray4[arg1][arg0][arg6] |= 0x249;
							Static79.anIntArrayArrayArray4[arg1][arg0][arg6 + 1] |= 0x492;
						} else if (arg5 == 1) {
							Static79.anIntArrayArrayArray4[arg1][arg0][arg6 + 1] |= 0x492;
							Static79.anIntArrayArrayArray4[arg1][arg0 + 1][arg6] |= 0x249;
						} else if (arg5 == 2) {
							Static79.anIntArrayArrayArray4[arg1][arg0 + 1][arg6] |= 0x249;
							Static79.anIntArrayArrayArray4[arg1][arg0][arg6] |= 0x492;
						} else if (arg5 == 3) {
							Static79.anIntArrayArrayArray4[arg1][arg0][arg6] |= 0x492;
							Static79.anIntArrayArrayArray4[arg1][arg0][arg6] |= 0x249;
						}
					}
					if (local110.anInt1641 != 0 && arg2 != null) {
						arg2.method1179(arg3, arg0, arg6, arg5, local110.aBoolean111);
					}
					if (local110.anInt1645 != 16) {
						arg4.method1636(arg1, arg0, arg6, local110.anInt1645);
					}
				} else if (arg3 == 3) {
					if (local110.anInt1650 == -1 && local110.anIntArray207 == null) {
						local190 = local110.method963(local95, 3, local73, local85, arg5, local65);
					} else {
						local190 = new Class2_Sub1_Sub1_Sub7(arg7, 3, arg5, local73, local65, local85, local95, local110.anInt1650, true, null);
					}
					arg4.method1639(arg1, arg0, arg6, local106, local190, null, Static9.anIntArray23[arg5], 0, local122, local138);
					if (local110.aBoolean114) {
						if (arg5 == 0) {
							Static97.aByteArrayArrayArray6[arg1][arg0][arg6 + 1] = 50;
						} else if (arg5 == 1) {
							Static97.aByteArrayArrayArray6[arg1][arg0 + 1][arg6 + 1] = 50;
						} else if (arg5 == 2) {
							Static97.aByteArrayArrayArray6[arg1][arg0 + 1][arg6] = 50;
						} else if (arg5 == 3) {
							Static97.aByteArrayArrayArray6[arg1][arg0][arg6] = 50;
						}
					}
					if (local110.anInt1641 != 0 && arg2 != null) {
						arg2.method1179(arg3, arg0, arg6, arg5, local110.aBoolean111);
					}
				} else if (arg3 == 9) {
					if (local110.anInt1650 == -1 && local110.anIntArray207 == null) {
						local190 = local110.method963(local95, arg3, local73, local85, arg5, local65);
					} else {
						local190 = new Class2_Sub1_Sub1_Sub7(arg7, arg3, arg5, local73, local65, local85, local95, local110.anInt1650, true, null);
					}
					arg4.method1616(arg1, arg0, arg6, local106, 1, 1, local190, 0, local122, local138);
					if (local110.anInt1641 != 0 && arg2 != null) {
						arg2.method1173(local110.aBoolean111, arg5, local110.anInt1630, local110.anInt1634, arg6, arg0);
					}
				} else {
					if (local110.aBoolean113) {
						if (arg5 == 1) {
							local928 = local95;
							local95 = local85;
							local85 = local65;
							local65 = local73;
							local73 = local928;
						} else if (arg5 == 2) {
							local928 = local95;
							local95 = local65;
							local65 = local928;
							local928 = local85;
							local85 = local73;
							local73 = local928;
						} else if (arg5 == 3) {
							local928 = local95;
							local95 = local73;
							local73 = local65;
							local65 = local85;
							local85 = local928;
						}
					}
					if (arg3 == 4) {
						if (local110.anInt1650 == -1 && local110.anIntArray207 == null) {
							local190 = local110.method963(local95, 4, local73, local85, 0, local65);
						} else {
							local190 = new Class2_Sub1_Sub1_Sub7(arg7, 4, 0, local73, local65, local85, local95, local110.anInt1650, true, null);
						}
						arg4.method1637(arg1, arg0, arg6, local106, local190, Static85.anIntArray276[arg5], arg5 * 512, 0, 0, local122, local138);
					} else if (arg3 == 5) {
						local928 = 16;
						local286 = arg4.method1656(arg1, arg0, arg6);
						if (local286 != 0) {
							local928 = Static18.method404(local286 >> 14 & 0x7FFF).anInt1645;
						}
						if (local110.anInt1650 == -1 && local110.anIntArray207 == null) {
							local967 = local110.method963(local95, 4, local73, local85, 0, local65);
						} else {
							local967 = new Class2_Sub1_Sub1_Sub7(arg7, 4, 0, local73, local65, local85, local95, local110.anInt1650, true, null);
						}
						arg4.method1637(arg1, arg0, arg6, local106, local967, Static85.anIntArray276[arg5], arg5 * 512, local928 * Static108.anIntArray367[arg5], Static21.anIntArray102[arg5] * local928, local122, local138);
					} else if (arg3 == 6) {
						if (local110.anInt1650 == -1 && local110.anIntArray207 == null) {
							local190 = local110.method963(local95, 4, local73, local85, 0, local65);
						} else {
							local190 = new Class2_Sub1_Sub1_Sub7(arg7, 4, 0, local73, local65, local85, local95, local110.anInt1650, true, null);
						}
						arg4.method1637(arg1, arg0, arg6, local106, local190, 256, arg5, 0, 0, local122, local138);
					} else if (arg3 == 7) {
						if (local110.anInt1650 == -1 && local110.anIntArray207 == null) {
							local190 = local110.method963(local95, 4, local73, local85, 0, local65);
						} else {
							local190 = new Class2_Sub1_Sub1_Sub7(arg7, 4, 0, local73, local65, local85, local95, local110.anInt1650, true, null);
						}
						arg4.method1637(arg1, arg0, arg6, local106, local190, 512, arg5, 0, 0, local122, local138);
					} else if (arg3 == 8) {
						if (local110.anInt1650 == -1 && local110.anIntArray207 == null) {
							local190 = local110.method963(local95, 4, local73, local85, 0, local65);
						} else {
							local190 = new Class2_Sub1_Sub1_Sub7(arg7, 4, 0, local73, local65, local85, local95, local110.anInt1650, true, null);
						}
						arg4.method1637(arg1, arg0, arg6, local106, local190, 768, arg5, 0, 0, local122, local138);
					}
				}
			}
		} else if (!Static18.aBoolean51 || local110.anInt1653 != 0 || local110.aBoolean112) {
			if (local110.anInt1650 == -1 && local110.anIntArray207 == null) {
				local190 = local110.method963(local95, 22, local73, local85, arg5, local65);
			} else {
				local190 = new Class2_Sub1_Sub1_Sub7(arg7, 22, arg5, local73, local65, local85, local95, local110.anInt1650, true, null);
			}
			arg4.method1654(arg1, arg0, arg6, local106, local190, local122, local138);
			if (local110.anInt1641 == 1 && arg2 != null) {
				arg2.method1177(arg6, arg0);
			}
		}
	}
}
