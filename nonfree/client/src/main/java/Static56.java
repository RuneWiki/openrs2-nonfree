import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!la", name = "j", descriptor = "Lclient!m;")
	public static Class10_Sub1_Sub1_Sub2 aClass10_Sub1_Sub1_Sub2_16;

	@OriginalMember(owner = "client!la", name = "l", descriptor = "Lclient!he;")
	public static Class11 aClass11_38;

	@OriginalMember(owner = "client!la", name = "n", descriptor = "[I")
	public static int[] anIntArray160;

	@OriginalMember(owner = "client!la", name = "o", descriptor = "I")
	public static int anInt1498;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "Lclient!va;")
	public static Class61 aClass61_622 = Static88.method1421(" )2> @whi@");

	@OriginalMember(owner = "client!la", name = "i", descriptor = "Lclient!bb;")
	public static Class9 aClass9_6 = new Class9();

	@OriginalMember(owner = "client!la", name = "k", descriptor = "Lclient!va;")
	private static Class61 aClass61_623 = Static88.method1421("Login attempts exceeded)3");

	@OriginalMember(owner = "client!la", name = "p", descriptor = "Lclient!va;")
	public static Class61 aClass61_624 = Static88.method1421(" @lre@");

	@OriginalMember(owner = "client!la", name = "q", descriptor = "Lclient!va;")
	public static Class61 aClass61_625 = Static88.method1421("(U5");

	@OriginalMember(owner = "client!la", name = "r", descriptor = "Lclient!va;")
	public static Class61 aClass61_626 = aClass61_623;

	@OriginalMember(owner = "client!la", name = "s", descriptor = "[Z")
	public static boolean[] aBooleanArray7 = new boolean[5];

	@OriginalMember(owner = "client!la", name = "t", descriptor = "I")
	public static int anInt1499 = 0;

	@OriginalMember(owner = "client!la", name = "u", descriptor = "I")
	public static int anInt1500 = 0;

	@OriginalMember(owner = "client!la", name = "v", descriptor = "I")
	public static int anInt1501 = 0;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BIILclient!he;)Lclient!ub;")
	public static Class10_Sub1_Sub1_Sub4 method818(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class11 arg2) {
		return Static5.method36(arg1, arg2, arg0) ? Static12.method261() : null;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
	public static void method819() {
		aClass61_622 = null;
		anIntArray160 = null;
		aClass61_623 = null;
		aClass61_625 = null;
		aClass61_626 = null;
		aClass61_624 = null;
		aBooleanArray7 = null;
		aClass11_38 = null;
		aClass9_6 = null;
		aClass10_Sub1_Sub1_Sub2_16 = null;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BLclient!ub;Lclient!ub;)V")
	public static void method820(@OriginalArg(1) Class10_Sub1_Sub1_Sub4 arg0, @OriginalArg(2) Class10_Sub1_Sub1_Sub4 arg1) {
		Static39.aClass15_6.method597();
		if (Static11.anInt319 == 0 || Static11.anInt319 == 5) {
			arg1.method1544(Static28.aClass61_337, 180, 54, 16777215);
			Static45.method1523(28, 62, 304, 34, 9179409);
			Static45.method1523(29, 63, 302, 32, 0);
			Static45.method1531(30, 64, Static42.anInt2376 * 3, 30, 9179409);
			Static45.method1531(Static42.anInt2376 * 3 + 30, 64, 300 - Static42.anInt2376 * 3, 30, 0);
			arg1.method1544(Static15.aClass61_148, 180, 85, 16777215);
		}
		@Pc(89) byte local89;
		@Pc(101) int local101;
		if (Static11.anInt319 == 20) {
			local89 = 40;
			Static64.aClass10_Sub1_Sub1_Sub2_19.method873(0, 0);
			arg1.method1543(Static15.aClass61_168, 180, 40, 16776960, true);
			local101 = local89 + 15;
			arg1.method1543(Static15.aClass61_145, 180, 55, 16776960, true);
			@Pc(109) int local109 = local101 + 15;
			arg1.method1543(Static15.aClass61_150, 180, 70, 16776960, true);
			@Pc(117) int local117 = local109 + 15;
			@Pc(118) int local118 = local117 + 10;
			arg1.method1554(Static93.method1156(new Class61[] { Static60.aClass61_670, Static15.aClass61_127 }), 90, 95, 16777215, true);
			@Pc(137) int local137 = local118 + 15;
			arg1.method1554(Static93.method1156(new Class61[] { Static41.aClass61_487, Static15.aClass61_158.method1618() }), 92, 110, 16777215, true);
			@Pc(158) int local158 = local137 + 15;
		}
		if (Static11.anInt319 == 10) {
			Static64.aClass10_Sub1_Sub1_Sub2_19.method873(0, 0);
			if (Static44.anInt1232 == 0) {
				local89 = 80;
				arg1.method1543(Static29.aClass61_344, 180, 80, 16776960, true);
				Static30.aClass10_Sub1_Sub1_Sub2_7.method873(27, 100);
				local101 = local89 + 30;
				arg1.method1543(Static36.aClass61_421, 100, 125, 16777215, true);
				Static30.aClass10_Sub1_Sub1_Sub2_7.method873(187, 100);
				arg1.method1543(Static103.aClass61_402, 260, 125, 16777215, true);
			} else if (Static44.anInt1232 == 2) {
				local89 = 40;
				arg1.method1543(Static15.aClass61_168, 180, 40, 16776960, true);
				local101 = local89 + 15;
				arg1.method1543(Static15.aClass61_145, 180, 55, 16776960, true);
				local101 += 15;
				arg1.method1543(Static15.aClass61_150, 180, 70, 16776960, true);
				local101 += 15;
				local101 += 10;
				arg1.method1554(Static93.method1156(new Class61[] { Static60.aClass61_670, Static15.aClass61_127, Static34.anInt1006 == 0 & Static95.anInt2442 % 40 < 20 ? Static70.aClass61_1083 : Static15.aClass61_139 }), 90, 95, 16777215, true);
				local101 += 15;
				arg1.method1554(Static93.method1156(new Class61[] { Static41.aClass61_487, Static15.aClass61_158.method1618(), Static34.anInt1006 == 1 & Static95.anInt2442 % 40 < 20 ? Static70.aClass61_1083 : Static15.aClass61_139 }), 92, 110, 16777215, true);
				local101 += 15;
				Static30.aClass10_Sub1_Sub1_Sub2_7.method873(27, 130);
				arg1.method1543(Static13.aClass61_105, 100, 155, 16777215, true);
				Static30.aClass10_Sub1_Sub1_Sub2_7.method873(187, 130);
				arg1.method1543(Static18.aClass61_203, 260, 155, 16777215, true);
			} else if (Static44.anInt1232 == 3) {
				local89 = 65;
				arg1.method1543(Static18.aClass61_204, 180, 40, 16776960, true);
				arg1.method1543(Static22.aClass61_284, 180, 65, 16777215, true);
				local101 = local89 + 15;
				arg1.method1543(Static34.aClass61_407, 180, 80, 16777215, true);
				local101 += 15;
				arg1.method1543(Static32.aClass61_381, 180, 95, 16777215, true);
				local101 += 15;
				arg1.method1543(Static21.aClass61_261, 180, 110, 16777215, true);
				Static30.aClass10_Sub1_Sub1_Sub2_7.method873(107, 130);
				arg1.method1543(Static18.aClass61_203, 180, 155, 16777215, true);
				local101 += 15;
			}
		}
		Static1.method1();
		try {
			@Pc(456) Graphics local456 = Static38.aCanvas1.getGraphics();
			Static39.aClass15_6.method594(171, 202, local456);
			Static5.aClass15_1.method594(0, 0, local456);
			Static53.aClass15_23.method594(0, 637, local456);
			if (Static40.aBoolean51) {
				Static40.aBoolean51 = false;
				Static57.aClass15_24.method594(0, 128, local456);
				Static10.aClass15_8.method594(371, 202, local456);
				Static67.aClass15_26.method594(265, 0, local456);
				Static30.aClass15_16.method594(265, 562, local456);
				Static33.aClass15_18.method594(171, 128, local456);
				Static67.aClass15_27.method594(171, 562, local456);
			}
		} catch (@Pc(521) Exception local521) {
			Static38.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)I")
	public static int method821(@OriginalArg(0) int arg0) {
		return (int) (Math.log((double) arg0 * 0.00390625D) * 868.5889638065036D + 0.5D);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIBI)I")
	public static int method822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 179) {
			arg0 /= 2;
		}
		if (arg2 > 192) {
			arg0 /= 2;
		}
		if (arg2 > 217) {
			arg0 /= 2;
		}
		if (arg2 > 243) {
			arg0 /= 2;
		}
		return arg2 / 2 + (arg1 / 4 << 10) + (arg0 / 32 << 7);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILclient!cb;IIILclient!rc;II)V")
	public static void method823(@OriginalArg(0) int arg0, @OriginalArg(2) Class12 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class54 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static31.aBoolean43 && (Static21.aByteArrayArrayArray4[0][arg0][arg7] & 0x2) == 0) {
			if ((Static21.aByteArrayArrayArray4[arg4][arg0][arg7] & 0x10) != 0) {
				return;
			}
			if (Static30.method551(arg0, arg4, arg7) != Static61.anInt1599) {
				return;
			}
		}
		if (Static9.anInt290 > arg4) {
			Static9.anInt290 = arg4;
		}
		@Pc(64) int local64 = Static37.anIntArrayArrayArray1[arg4][arg0][arg7];
		@Pc(74) int local74 = Static37.anIntArrayArrayArray1[arg4][arg0 + 1][arg7];
		@Pc(86) int local86 = Static37.anIntArrayArrayArray1[arg4][arg0 + 1][arg7 + 1];
		@Pc(96) int local96 = Static37.anIntArrayArrayArray1[arg4][arg0][arg7 + 1];
		@Pc(102) Class10_Sub1_Sub10 local102 = Static18.method405(arg3);
		@Pc(109) int local109 = (arg2 << 6) + arg6;
		if (local102.anInt1384 == 1) {
			local109 += 256;
		}
		@Pc(124) int local124 = local96 + local74 + local64 + local86 >> 2;
		@Pc(137) int local137 = (arg3 << 14) + arg0 + (arg7 << 7) + 1073741824;
		if (local102.anInt1371 == 0) {
			local137 += Integer.MIN_VALUE;
		}
		@Pc(181) Class10_Sub1_Sub5 local181;
		if (arg6 != 22) {
			@Pc(275) int local275;
			if (arg6 == 10 || arg6 == 11) {
				if (local102.anInt1375 == -1 && local102.anIntArray146 == null) {
					local181 = local102.method776(local64, local96, arg2, 10, local74, local86);
				} else {
					local181 = new Class10_Sub1_Sub5_Sub6(arg3, 10, arg2, local64, local74, local86, local96, local102.anInt1375, true);
				}
				if (local181 != null) {
					@Pc(272) int local272;
					if (arg2 == 1 || arg2 == 3) {
						local272 = local102.anInt1369;
						local275 = local102.anInt1378;
					} else {
						local275 = local102.anInt1369;
						local272 = local102.anInt1378;
					}
					@Pc(285) int local285 = 0;
					if (arg6 == 11) {
						local285 += 256;
					}
					if (arg5.method1358(arg4, arg0, arg7, local124, local275, local272, local181, local285, local137, local109) && local102.aBoolean61) {
						@Pc(320) Class10_Sub1_Sub5_Sub4 local320;
						if (local181 instanceof Class10_Sub1_Sub5_Sub4) {
							local320 = (Class10_Sub1_Sub5_Sub4) local181;
						} else {
							local320 = local102.method776(local64, local96, arg2, 10, local74, local86);
						}
						if (local320 != null) {
							for (@Pc(329) int local329 = 0; local329 <= local275; local329++) {
								for (@Pc(333) int local333 = 0; local333 <= local272; local333++) {
									@Pc(340) int local340 = local320.method1336() / 4;
									if (local340 > 30) {
										local340 = 30;
									}
									if (Static18.aByteArrayArrayArray3[arg4][arg0 + local329][arg7 + local333] < local340) {
										Static18.aByteArrayArrayArray3[arg4][local329 + arg0][local333 + arg7] = (byte) local340;
									}
								}
							}
						}
					}
				}
				if (local102.aBoolean56 && arg1 != null) {
					arg1.method251(arg7, local102.aBoolean57, arg2, arg0, local102.anInt1369, local102.anInt1378);
				}
			} else if (arg6 >= 12) {
				if (local102.anInt1375 == -1 && local102.anIntArray146 == null) {
					local181 = local102.method776(local64, local96, arg2, arg6, local74, local86);
				} else {
					local181 = new Class10_Sub1_Sub5_Sub6(arg3, arg6, arg2, local64, local74, local86, local96, local102.anInt1375, true);
				}
				arg5.method1358(arg4, arg0, arg7, local124, 1, 1, local181, 0, local137, local109);
				if (arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg4 > 0) {
					Static51.anIntArrayArrayArray3[arg4][arg0][arg7] |= 0x924;
				}
				if (local102.aBoolean56 && arg1 != null) {
					arg1.method251(arg7, local102.aBoolean57, arg2, arg0, local102.anInt1369, local102.anInt1378);
				}
			} else if (arg6 == 0) {
				if (local102.anInt1375 == -1 && local102.anIntArray146 == null) {
					local181 = local102.method776(local64, local96, arg2, 0, local74, local86);
				} else {
					local181 = new Class10_Sub1_Sub5_Sub6(arg3, 0, arg2, local64, local74, local86, local96, local102.anInt1375, true);
				}
				arg5.method1367(arg4, arg0, arg7, local124, local181, null, Static54.anIntArray159[arg2], 0, local137, local109);
				if (arg2 == 0) {
					if (local102.aBoolean61) {
						Static18.aByteArrayArrayArray3[arg4][arg0][arg7] = 50;
						Static18.aByteArrayArrayArray3[arg4][arg0][arg7 + 1] = 50;
					}
					if (local102.aBoolean63) {
						Static51.anIntArrayArrayArray3[arg4][arg0][arg7] |= 0x249;
					}
				} else if (arg2 == 1) {
					if (local102.aBoolean61) {
						Static18.aByteArrayArrayArray3[arg4][arg0][arg7 + 1] = 50;
						Static18.aByteArrayArrayArray3[arg4][arg0 + 1][arg7 + 1] = 50;
					}
					if (local102.aBoolean63) {
						Static51.anIntArrayArrayArray3[arg4][arg0][arg7 + 1] |= 0x492;
					}
				} else if (arg2 == 2) {
					if (local102.aBoolean61) {
						Static18.aByteArrayArrayArray3[arg4][arg0 + 1][arg7] = 50;
						Static18.aByteArrayArrayArray3[arg4][arg0 + 1][arg7 + 1] = 50;
					}
					if (local102.aBoolean63) {
						Static51.anIntArrayArrayArray3[arg4][arg0 + 1][arg7] |= 0x249;
					}
				} else if (arg2 == 3) {
					if (local102.aBoolean61) {
						Static18.aByteArrayArrayArray3[arg4][arg0][arg7] = 50;
						Static18.aByteArrayArrayArray3[arg4][arg0 + 1][arg7] = 50;
					}
					if (local102.aBoolean63) {
						Static51.anIntArrayArrayArray3[arg4][arg0][arg7] |= 0x492;
					}
				}
				if (local102.aBoolean56 && arg1 != null) {
					arg1.method264(arg6, arg0, arg7, local102.aBoolean57, arg2);
				}
				if (local102.anInt1386 != 16) {
					arg5.method1382(arg4, arg0, arg7, local102.anInt1386);
				}
			} else if (arg6 == 1) {
				if (local102.anInt1375 == -1 && local102.anIntArray146 == null) {
					local181 = local102.method776(local64, local96, arg2, 1, local74, local86);
				} else {
					local181 = new Class10_Sub1_Sub5_Sub6(arg3, 1, arg2, local64, local74, local86, local96, local102.anInt1375, true);
				}
				arg5.method1367(arg4, arg0, arg7, local124, local181, null, Static69.anIntArray206[arg2], 0, local137, local109);
				if (local102.aBoolean61) {
					if (arg2 == 0) {
						Static18.aByteArrayArrayArray3[arg4][arg0][arg7 + 1] = 50;
					} else if (arg2 == 1) {
						Static18.aByteArrayArrayArray3[arg4][arg0 + 1][arg7 + 1] = 50;
					} else if (arg2 == 2) {
						Static18.aByteArrayArrayArray3[arg4][arg0 + 1][arg7] = 50;
					} else if (arg2 == 3) {
						Static18.aByteArrayArrayArray3[arg4][arg0][arg7] = 50;
					}
				}
				if (local102.aBoolean56 && arg1 != null) {
					arg1.method264(arg6, arg0, arg7, local102.aBoolean57, arg2);
				}
			} else {
				@Pc(933) int local933;
				@Pc(964) Class10_Sub1_Sub5 local964;
				if (arg6 == 2) {
					local933 = arg2 + 1 & 0x3;
					@Pc(954) Class10_Sub1_Sub5 local954;
					if (local102.anInt1375 == -1 && local102.anIntArray146 == null) {
						local954 = local102.method776(local64, local96, arg2 + 4, 2, local74, local86);
						local964 = local102.method776(local64, local96, local933, 2, local74, local86);
					} else {
						local954 = new Class10_Sub1_Sub5_Sub6(arg3, 2, arg2 + 4, local64, local74, local86, local96, local102.anInt1375, true);
						local964 = new Class10_Sub1_Sub5_Sub6(arg3, 2, local933, local64, local74, local86, local96, local102.anInt1375, true);
					}
					arg5.method1367(arg4, arg0, arg7, local124, local954, local964, Static54.anIntArray159[arg2], Static54.anIntArray159[local933], local137, local109);
					if (local102.aBoolean63) {
						if (arg2 == 0) {
							Static51.anIntArrayArrayArray3[arg4][arg0][arg7] |= 0x249;
							Static51.anIntArrayArrayArray3[arg4][arg0][arg7 + 1] |= 0x492;
						} else if (arg2 == 1) {
							Static51.anIntArrayArrayArray3[arg4][arg0][arg7 + 1] |= 0x492;
							Static51.anIntArrayArrayArray3[arg4][arg0 + 1][arg7] |= 0x249;
						} else if (arg2 == 2) {
							Static51.anIntArrayArrayArray3[arg4][arg0 + 1][arg7] |= 0x249;
							Static51.anIntArrayArrayArray3[arg4][arg0][arg7] |= 0x492;
						} else if (arg2 == 3) {
							Static51.anIntArrayArrayArray3[arg4][arg0][arg7] |= 0x492;
							Static51.anIntArrayArrayArray3[arg4][arg0][arg7] |= 0x249;
						}
					}
					if (local102.aBoolean56 && arg1 != null) {
						arg1.method264(arg6, arg0, arg7, local102.aBoolean57, arg2);
					}
					if (local102.anInt1386 != 16) {
						arg5.method1382(arg4, arg0, arg7, local102.anInt1386);
					}
				} else if (arg6 == 3) {
					if (local102.anInt1375 == -1 && local102.anIntArray146 == null) {
						local181 = local102.method776(local64, local96, arg2, 3, local74, local86);
					} else {
						local181 = new Class10_Sub1_Sub5_Sub6(arg3, 3, arg2, local64, local74, local86, local96, local102.anInt1375, true);
					}
					arg5.method1367(arg4, arg0, arg7, local124, local181, null, Static69.anIntArray206[arg2], 0, local137, local109);
					if (local102.aBoolean61) {
						if (arg2 == 0) {
							Static18.aByteArrayArrayArray3[arg4][arg0][arg7 + 1] = 50;
						} else if (arg2 == 1) {
							Static18.aByteArrayArrayArray3[arg4][arg0 + 1][arg7 + 1] = 50;
						} else if (arg2 == 2) {
							Static18.aByteArrayArrayArray3[arg4][arg0 + 1][arg7] = 50;
						} else if (arg2 == 3) {
							Static18.aByteArrayArrayArray3[arg4][arg0][arg7] = 50;
						}
					}
					if (local102.aBoolean56 && arg1 != null) {
						arg1.method264(arg6, arg0, arg7, local102.aBoolean57, arg2);
					}
				} else if (arg6 == 9) {
					if (local102.anInt1375 == -1 && local102.anIntArray146 == null) {
						local181 = local102.method776(local64, local96, arg2, arg6, local74, local86);
					} else {
						local181 = new Class10_Sub1_Sub5_Sub6(arg3, arg6, arg2, local64, local74, local86, local96, local102.anInt1375, true);
					}
					arg5.method1358(arg4, arg0, arg7, local124, 1, 1, local181, 0, local137, local109);
					if (local102.aBoolean56 && arg1 != null) {
						arg1.method251(arg7, local102.aBoolean57, arg2, arg0, local102.anInt1369, local102.anInt1378);
					}
				} else {
					if (local102.aBoolean58) {
						if (arg2 == 1) {
							local933 = local96;
							local96 = local86;
							local86 = local74;
							local74 = local64;
							local64 = local933;
						} else if (arg2 == 2) {
							local933 = local96;
							local96 = local74;
							local74 = local933;
							local933 = local86;
							local86 = local64;
							local64 = local933;
						} else if (arg2 == 3) {
							local933 = local96;
							local96 = local64;
							local64 = local74;
							local74 = local86;
							local86 = local933;
						}
					}
					if (arg6 == 4) {
						if (local102.anInt1375 == -1 && local102.anIntArray146 == null) {
							local181 = local102.method776(local64, local96, 0, 4, local74, local86);
						} else {
							local181 = new Class10_Sub1_Sub5_Sub6(arg3, 4, 0, local64, local74, local86, local96, local102.anInt1375, true);
						}
						arg5.method1383(arg4, arg0, arg7, local124, local181, Static54.anIntArray159[arg2], arg2 * 512, 0, 0, local137, local109);
					} else if (arg6 == 5) {
						local933 = 16;
						local275 = arg5.method1363(arg4, arg0, arg7);
						if (local275 > 0) {
							local933 = Static18.method405(local275 >> 14 & 0x7FFF).anInt1386;
						}
						if (local102.anInt1375 == -1 && local102.anIntArray146 == null) {
							local964 = local102.method776(local64, local96, 0, 4, local74, local86);
						} else {
							local964 = new Class10_Sub1_Sub5_Sub6(arg3, 4, 0, local64, local74, local86, local96, local102.anInt1375, true);
						}
						arg5.method1383(arg4, arg0, arg7, local124, local964, Static54.anIntArray159[arg2], arg2 * 512, local933 * Static105.anIntArray335[arg2], Static25.anIntArray84[arg2] * local933, local137, local109);
					} else if (arg6 == 6) {
						if (local102.anInt1375 == -1 && local102.anIntArray146 == null) {
							local181 = local102.method776(local64, local96, 0, 4, local74, local86);
						} else {
							local181 = new Class10_Sub1_Sub5_Sub6(arg3, 4, 0, local64, local74, local86, local96, local102.anInt1375, true);
						}
						arg5.method1383(arg4, arg0, arg7, local124, local181, 256, arg2, 0, 0, local137, local109);
					} else if (arg6 == 7) {
						if (local102.anInt1375 == -1 && local102.anIntArray146 == null) {
							local181 = local102.method776(local64, local96, 0, 4, local74, local86);
						} else {
							local181 = new Class10_Sub1_Sub5_Sub6(arg3, 4, 0, local64, local74, local86, local96, local102.anInt1375, true);
						}
						arg5.method1383(arg4, arg0, arg7, local124, local181, 512, arg2, 0, 0, local137, local109);
					} else if (arg6 == 8) {
						if (local102.anInt1375 == -1 && local102.anIntArray146 == null) {
							local181 = local102.method776(local64, local96, 0, 4, local74, local86);
						} else {
							local181 = new Class10_Sub1_Sub5_Sub6(arg3, 4, 0, local64, local74, local86, local96, local102.anInt1375, true);
						}
						arg5.method1383(arg4, arg0, arg7, local124, local181, 768, arg2, 0, 0, local137, local109);
					}
				}
			}
		} else if (!Static31.aBoolean43 || local102.anInt1371 != 0 || local102.aBoolean60) {
			if (local102.anInt1375 == -1 && local102.anIntArray146 == null) {
				local181 = local102.method776(local64, local96, arg2, 22, local74, local86);
			} else {
				local181 = new Class10_Sub1_Sub5_Sub6(arg3, 22, arg2, local64, local74, local86, local96, local102.anInt1375, true);
			}
			arg5.method1373(arg4, arg0, arg7, local124, local181, local137, local109);
			if (local102.aBoolean56 && local102.anInt1371 == 1 && arg1 != null) {
				arg1.method263(arg0, arg7);
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
	public static void method824() {
		if (!Static103.aBoolean47) {
			return;
		}
		Static33.aClass10_Sub1_Sub1_Sub2_9 = null;
		Static60.aClass10_Sub1_Sub1_Sub2_17 = null;
		Static49.aClass10_Sub1_Sub1_Sub2_14 = null;
		Static1.aClass10_Sub1_Sub1_Sub2_1 = null;
		Static25.aClass15_15 = null;
		Static99.aClass15_37 = null;
		Static106.aClass15_39 = null;
		Static104.aClass10_Sub1_Sub1_Sub2Array5 = null;
		Static53.aClass15_21 = null;
		Static102.aClass10_Sub1_Sub1_Sub2_25 = null;
		Static11.aClass10_Sub1_Sub1_Sub2_3 = null;
		Static94.aClass15_35 = null;
		Static74.aClass15_29 = null;
		Static53.aClass15_22 = null;
		Static31.aClass15_17 = null;
		Static43.aClass15_20 = null;
		Static55.aClass10_Sub1_Sub1_Sub2_15 = null;
		Static71.aClass10_Sub1_Sub1_Sub2_20 = null;
		Static46.aClass10_Sub1_Sub1_Sub2_12 = null;
		Static47.aClass10_Sub1_Sub1_Sub2_13 = null;
		Static71.anIntArray208 = null;
		Static32.aClass10_Sub1_Sub1_Sub2_8 = null;
		Static6.aClass15_4 = null;
		Static4.aClass10_Sub1_Sub1_Sub2_2 = null;
		Static103.aBoolean47 = false;
		Static9.aClass15_7 = null;
		Static16.anIntArray59 = null;
		aClass10_Sub1_Sub1_Sub2_16 = null;
		Static80.anIntArray241 = null;
		Static96.aClass10_Sub1_Sub1_Sub2_23 = null;
		Static71.aClass15_28 = null;
		Static75.anIntArray233 = null;
		Static70.aClass10_Sub1_Sub1_Sub2_26 = null;
		Static107.aClass15_36 = null;
		Static57.aClass15_25 = null;
		Static102.aClass10_Sub1_Sub1_Sub2_24 = null;
		Static60.anIntArray183 = null;
		Static67.anIntArray194 = null;
		Static103.aClass15_19 = null;
		Static24.aClass15_33 = null;
		Static36.anIntArray116 = null;
	}
}
