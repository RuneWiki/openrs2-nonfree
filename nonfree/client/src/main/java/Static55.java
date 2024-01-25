import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!dc", name = "J", descriptor = "[Lclient!vj;")
	public static Class58[] aClass58Array28;

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_80 = new Class159("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

	@OriginalMember(owner = "client!dc", name = "Z", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_81 = new Class159("level: ", "Stufe: ", "niveau ", "nível: ");

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1172(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static166.method3253(arg6)) {
			Static44.method882(Static271.aClass21ArrayArray1[arg6], -1, arg4, arg0, arg1, arg7, arg8, arg3, arg5, arg2);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILclient!qr;IZIIIILclient!vq;IZI)V")
	public static void method1173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class170 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) Class47 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10, @OriginalArg(12) int arg11) {
		if (!Static76.method1750() && !Static210.method3895(arg7, arg3, arg5, Static263.anInt6816)) {
			return;
		}
		if (Static253.anInt5160 > arg7) {
			Static253.anInt5160 = arg7;
		}
		@Pc(25) Class18 local25 = Static113.method2380(arg1);
		if (Static225.anInt4568 == 1 && local25.aBoolean43) {
			return;
		}
		@Pc(56) int local56;
		@Pc(53) int local53;
		if (arg9 == 1 || arg9 == 3) {
			local53 = local25.anInt532;
			local56 = local25.anInt529;
		} else {
			local56 = local25.anInt532;
			local53 = local25.anInt529;
		}
		@Pc(75) int local75;
		@Pc(83) int local83;
		if (Static350.anInt6637 >= local56 + arg5) {
			local75 = (local56 >> 1) + arg5;
			local83 = (local56 + 1 >> 1) + arg5;
		} else {
			local83 = arg5 + 1;
			local75 = arg5;
		}
		@Pc(102) int local102;
		@Pc(100) int local100;
		if (local53 + arg3 > Static105.anInt2647) {
			local100 = arg3 + 1;
			local102 = arg3;
		} else {
			local102 = (local53 >> 1) + arg3;
			local100 = (local53 + 1 >> 1) + arg3;
		}
		@Pc(122) Class60 local122 = Static261.aClass60Array2[arg11];
		@Pc(145) int local145 = local122.method2264(local75, local102) + local122.method2264(local83, local102) + local122.method2264(local75, local100) + local122.method2264(local83, local100) >> 2;
		@Pc(154) int local154 = (arg5 << 7) + (local56 << 6);
		@Pc(163) int local163 = (arg3 << 7) + (local53 << 6);
		@Pc(174) boolean local174 = arg4 && !arg10 && local25.aBoolean41;
		if (local25.method409()) {
			Static312.method5146(arg3, null, arg7, local25, null, arg9, arg5);
		}
		@Pc(208) boolean local208 = arg0 == -1 && local25.anInt516 == -1 && local25.anIntArray19 == null && local25.anIntArray23 == null && !local25.aBoolean48;
		if (Static239.aBoolean362 && local25.anInt497 != 1) {
			return;
		}
		if (arg6 != 22) {
			@Pc(343) Class8_Sub1 local343;
			@Pc(312) Class8_Sub1_Sub3 local312;
			@Pc(316) int local316;
			@Pc(408) int local408;
			if (arg6 == 10 || arg6 == 11) {
				local312 = null;
				if (local208) {
					@Pc(372) Class8_Sub1_Sub3 local372 = new Class8_Sub1_Sub3(arg8, local25, arg7, arg11, local154, local145, local163, arg10, arg5, local56 + arg5 - 1, arg3, local53 + arg3 - 1, arg6, arg9, local174);
					local312 = local372;
					local316 = local372.method2160();
					local343 = local372;
				} else {
					local316 = 15;
					local343 = new Class8_Sub1_Sub4(arg8, local25, arg6, arg9, arg7, arg11, local154, local145, local163, arg10, arg5, local56 + arg5 - 1, arg3, arg3 + local53 - 1, arg0);
				}
				if (Static301.method4952(local343, false)) {
					if (local312 != null && local312.method5592()) {
						local312.method5591(arg8);
					}
					if (local25.aBoolean47 && arg4) {
						if (local316 > 30) {
							local316 = 30;
						}
						for (local408 = 0; local408 <= local56; local408++) {
							for (@Pc(412) int local412 = 0; local412 <= local53; local412++) {
								local122.method2269(local408 + arg5, local412 + arg3, local316);
							}
						}
					}
				}
				if (local25.anInt526 != 0 && arg2 != null) {
					arg2.method4592(local53, local56, !local25.aBoolean46, arg5, local25.aBoolean38, arg3);
				}
			} else if (arg6 >= 12 && arg6 <= 17 || arg6 >= 18 && arg6 <= 21) {
				if (local208) {
					local312 = new Class8_Sub1_Sub3(arg8, local25, arg7, arg11, local154, local145, local163, arg10, arg5, local56 + arg5 - 1, arg3, arg3 + local53 - 1, arg6, arg9, local174);
					if (local312.method5592()) {
						local312.method5591(arg8);
					}
					local343 = local312;
				} else {
					local343 = new Class8_Sub1_Sub4(arg8, local25, arg6, arg9, arg7, arg11, local154, local145, local163, arg10, arg5, local56 + arg5 - 1, arg3, arg3 + local53 - 1, arg0);
				}
				Static301.method4952(local343, false);
				if (arg4 && !arg10 && arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg7 > 0 && local25.anInt497 != 0) {
					Static72.aByteArrayArrayArray5[arg7][arg5][arg3] = (byte) (Static72.aByteArrayArrayArray5[arg7][arg5][arg3] | 0x4);
				}
				if (local25.anInt526 != 0 && arg2 != null) {
					arg2.method4592(local53, local56, !local25.aBoolean46, arg5, local25.aBoolean38, arg3);
				}
			} else {
				@Pc(630) Class8_Sub4_Sub1 local630;
				@Pc(632) Class8_Sub4 local632;
				if (arg6 == 0) {
					if (local208) {
						local630 = new Class8_Sub4_Sub1(arg8, local25, arg11, local154, local145, local163, arg10, arg6, arg9, local174);
						local632 = local630;
						if (local630.method5592()) {
							local630.method5591(arg8);
						}
					} else {
						local632 = new Class8_Sub4_Sub2(arg8, local25, 0, arg9, arg7, arg11, local154, local145, local163, arg10, arg0);
					}
					Static186.method3553(arg7, arg5, arg3, local632, null);
					if (arg4) {
						if (arg9 == 0) {
							if (local25.aBoolean47) {
								local122.method2269(arg5, arg3, 50);
								local122.method2269(arg5, arg3 + 1, 50);
							}
							if (local25.anInt497 == 1 && !arg10) {
								Static72.aByteArrayArrayArray5[arg7][arg5][arg3] = (byte) (Static72.aByteArrayArrayArray5[arg7][arg5][arg3] | 0x1);
							}
						} else if (arg9 == 1) {
							if (local25.aBoolean47) {
								local122.method2269(arg5, arg3 + 1, 50);
								local122.method2269(arg5 + 1, arg3 + 1, 50);
							}
							if (local25.anInt497 == 1 && !arg10) {
								Static72.aByteArrayArrayArray5[arg7][arg5][arg3 + 1] = (byte) (Static72.aByteArrayArrayArray5[arg7][arg5][arg3 + 1] | 0x2);
							}
						} else if (arg9 == 2) {
							if (local25.aBoolean47) {
								local122.method2269(arg5 + 1, arg3, 50);
								local122.method2269(arg5 + 1, arg3 + 1, 50);
							}
							if (local25.anInt497 == 1 && !arg10) {
								Static72.aByteArrayArrayArray5[arg7][arg5 + 1][arg3] = (byte) (Static72.aByteArrayArrayArray5[arg7][arg5 + 1][arg3] | 0x1);
							}
						} else if (arg9 == 3) {
							if (local25.aBoolean47) {
								local122.method2269(arg5, arg3, 50);
								local122.method2269(arg5 + 1, arg3, 50);
							}
							if (local25.anInt497 == 1 && !arg10) {
								Static72.aByteArrayArrayArray5[arg7][arg5][arg3] = (byte) (Static72.aByteArrayArrayArray5[arg7][arg5][arg3] | 0x2);
							}
						}
					}
					if (local25.anInt526 != 0 && arg2 != null) {
						arg2.method4594(arg9, !local25.aBoolean46, arg5, arg6, arg3, local25.aBoolean38);
					}
					if (local25.anInt506 != 16) {
						Static220.method5508(arg7, arg5, arg3, local25.anInt506);
					}
				} else if (arg6 == 1) {
					if (local208) {
						local630 = new Class8_Sub4_Sub1(arg8, local25, arg11, local154, local145, local163, arg10, arg6, arg9, local174);
						if (local630.method5592()) {
							local630.method5591(arg8);
						}
						local632 = local630;
					} else {
						local632 = new Class8_Sub4_Sub2(arg8, local25, 1, arg9, arg7, arg11, local154, local145, local163, arg10, arg0);
					}
					Static186.method3553(arg7, arg5, arg3, local632, null);
					if (local25.aBoolean47 && arg4) {
						if (arg9 == 0) {
							local122.method2269(arg5, arg3 + 1, 50);
						} else if (arg9 == 1) {
							local122.method2269(arg5 + 1, arg3 + 1, 50);
						} else if (arg9 == 2) {
							local122.method2269(arg5 + 1, arg3, 50);
						} else if (arg9 == 3) {
							local122.method2269(arg5, arg3, 50);
						}
					}
					if (local25.anInt526 != 0 && arg2 != null) {
						arg2.method4594(arg9, !local25.aBoolean46, arg5, arg6, arg3, local25.aBoolean38);
					}
				} else if (arg6 == 2) {
					local316 = arg9 + 1 & 0x3;
					@Pc(1088) Class8_Sub4 local1088;
					if (local208) {
						@Pc(1056) Class8_Sub4_Sub1 local1056 = new Class8_Sub4_Sub1(arg8, local25, arg11, local154, local145, local163, arg10, arg6, arg9 + 4, local174);
						@Pc(1070) Class8_Sub4_Sub1 local1070 = new Class8_Sub4_Sub1(arg8, local25, arg11, local154, local145, local163, arg10, arg6, local316, local174);
						if (local1056.method5592()) {
							local1056.method5591(arg8);
						}
						if (local1070.method5592()) {
							local1070.method5591(arg8);
						}
						local1088 = local1070;
						local632 = local1056;
					} else {
						local632 = new Class8_Sub4_Sub2(arg8, local25, 2, arg9 + 4, arg7, arg11, local154, local145, local163, arg10, arg0);
						local1088 = new Class8_Sub4_Sub2(arg8, local25, 2, local316, arg7, arg11, local154, local145, local163, arg10, arg0);
					}
					Static186.method3553(arg7, arg5, arg3, local632, local1088);
					if (local25.anInt497 == 1 && arg4 && !arg10) {
						if (arg9 == 0) {
							Static72.aByteArrayArrayArray5[arg7][arg5][arg3] = (byte) (Static72.aByteArrayArrayArray5[arg7][arg5][arg3] | 0x1);
							Static72.aByteArrayArrayArray5[arg7][arg5][arg3 + 1] = (byte) (Static72.aByteArrayArrayArray5[arg7][arg5][arg3 + 1] | 0x2);
						} else if (arg9 == 1) {
							Static72.aByteArrayArrayArray5[arg7][arg5][arg3 + 1] = (byte) (Static72.aByteArrayArrayArray5[arg7][arg5][arg3 + 1] | 0x2);
							Static72.aByteArrayArrayArray5[arg7][arg5 + 1][arg3] = (byte) (Static72.aByteArrayArrayArray5[arg7][arg5 + 1][arg3] | 0x1);
						} else if (arg9 == 2) {
							Static72.aByteArrayArrayArray5[arg7][arg5 + 1][arg3] = (byte) (Static72.aByteArrayArrayArray5[arg7][arg5 + 1][arg3] | 0x1);
							Static72.aByteArrayArrayArray5[arg7][arg5][arg3] = (byte) (Static72.aByteArrayArrayArray5[arg7][arg5][arg3] | 0x2);
						} else if (arg9 == 3) {
							Static72.aByteArrayArrayArray5[arg7][arg5][arg3] = (byte) (Static72.aByteArrayArrayArray5[arg7][arg5][arg3] | 0x2);
							Static72.aByteArrayArrayArray5[arg7][arg5][arg3] = (byte) (Static72.aByteArrayArrayArray5[arg7][arg5][arg3] | 0x1);
						}
					}
					if (local25.anInt526 != 0 && arg2 != null) {
						arg2.method4594(arg9, !local25.aBoolean46, arg5, arg6, arg3, local25.aBoolean38);
					}
					if (local25.anInt506 != 16) {
						Static220.method5508(arg7, arg5, arg3, local25.anInt506);
					}
				} else if (arg6 == 3) {
					if (local208) {
						local630 = new Class8_Sub4_Sub1(arg8, local25, arg11, local154, local145, local163, arg10, arg6, arg9, local174);
						if (local630.method5592()) {
							local630.method5591(arg8);
						}
						local632 = local630;
					} else {
						local632 = new Class8_Sub4_Sub2(arg8, local25, 3, arg9, arg7, arg11, local154, local145, local163, arg10, arg0);
					}
					Static186.method3553(arg7, arg5, arg3, local632, null);
					if (local25.aBoolean47 && arg4) {
						if (arg9 == 0) {
							local122.method2269(arg5, arg3 + 1, 50);
						} else if (arg9 == 1) {
							local122.method2269(arg5 + 1, arg3 + 1, 50);
						} else if (arg9 == 2) {
							local122.method2269(arg5 + 1, arg3, 50);
						} else if (arg9 == 3) {
							local122.method2269(arg5, arg3, 50);
						}
					}
					if (local25.anInt526 != 0 && arg2 != null) {
						arg2.method4594(arg9, !local25.aBoolean46, arg5, arg6, arg3, local25.aBoolean38);
					}
				} else if (arg6 == 9) {
					if (local208) {
						local312 = new Class8_Sub1_Sub3(arg8, local25, arg7, arg11, local154, local145, local163, arg10, arg5, arg5, arg3, arg3, arg6, arg9, local174);
						local343 = local312;
						if (local312.method5592()) {
							local312.method5591(arg8);
						}
					} else {
						local343 = new Class8_Sub1_Sub4(arg8, local25, arg6, arg9, arg7, arg11, local154, local145, local163, arg10, arg5, arg5 + local56 - 1, arg3, local53 + arg3 - 1, arg0);
					}
					Static301.method4952(local343, false);
					if (local25.anInt526 != 0 && arg2 != null) {
						arg2.method4592(local53, local56, !local25.aBoolean46, arg5, local25.aBoolean38, arg3);
					}
					if (local25.anInt506 != 16) {
						Static220.method5508(arg7, arg5, arg3, local25.anInt506);
					}
				} else {
					@Pc(1604) Class8_Sub2 local1604;
					if (arg6 == 4) {
						if (local208) {
							@Pc(1602) Class8_Sub2_Sub2 local1602 = new Class8_Sub2_Sub2(arg8, local25, arg11, local154, local145, local163, arg10, 0, 0, 0, arg6, arg9);
							local1604 = local1602;
							if (local1602.method5592()) {
								local1602.method5591(arg8);
							}
						} else {
							local1604 = new Class8_Sub2_Sub1(arg8, local25, arg6, arg9, arg7, arg11, local154, local145, local163, arg10, 0, 0, 0, arg0);
						}
						Static10.method199(arg7, arg5, arg3, local1604, null);
					} else {
						@Pc(1644) int local1644;
						@Pc(1650) Interface7 local1650;
						@Pc(1713) Class8_Sub2_Sub2 local1713;
						if (arg6 == 5) {
							local1644 = 16;
							local1650 = (Interface7) Static354.method5631(arg7, arg5, arg3);
							if (local1650 != null) {
								local1644 = Static113.method2380(local1650.method5594()).anInt506;
							}
							if (local208) {
								local1713 = new Class8_Sub2_Sub2(arg8, local25, arg11, local154, local145, local163, arg10, 0, local1644 * Static56.anIntArray91[arg9], Static198.anIntArray344[arg9] * local1644, arg6, arg9);
								if (local1713.method5592()) {
									local1713.method5591(arg8);
								}
								local1604 = local1713;
							} else {
								local1604 = new Class8_Sub2_Sub1(arg8, local25, arg6, arg9, arg7, arg11, local154, local145, local163, arg10, 0, Static56.anIntArray91[arg9] * local1644, local1644 * Static198.anIntArray344[arg9], arg0);
							}
							Static10.method199(arg7, arg5, arg3, local1604, null);
						} else if (arg6 == 6) {
							local1644 = 8;
							local1650 = (Interface7) Static354.method5631(arg7, arg5, arg3);
							if (local1650 != null) {
								local1644 = Static113.method2380(local1650.method5594()).anInt506 / 2;
							}
							if (local208) {
								local1713 = new Class8_Sub2_Sub2(arg8, local25, arg11, local154, local145, local163, arg10, arg9, local1644 * Static56.anIntArray91[arg9], local1644 * Static198.anIntArray344[arg9], arg6, arg9 + 4);
								local1604 = local1713;
								if (local1713.method5592()) {
									local1713.method5591(arg8);
								}
							} else {
								local1604 = new Class8_Sub2_Sub1(arg8, local25, arg6, arg9 + 4, arg7, arg11, local154, local145, local163, arg10, arg9, local1644 * Static129.anIntArray266[arg9], Static354.anIntArray511[arg9] * local1644, arg0);
							}
							Static10.method199(arg7, arg5, arg3, local1604, null);
						} else if (arg6 == 7) {
							local1644 = arg9 + 2 & 0x3;
							if (local208) {
								@Pc(1880) Class8_Sub2_Sub2 local1880 = new Class8_Sub2_Sub2(arg8, local25, arg11, local154, local145, local163, arg10, local1644, 0, 0, arg6, local1644 + 4);
								local1604 = local1880;
								if (local1880.method5592()) {
									local1880.method5591(arg8);
								}
							} else {
								local1604 = new Class8_Sub2_Sub1(arg8, local25, arg6, local1644 + 4, arg7, arg11, local154, local145, local163, arg10, local1644, 0, 0, arg0);
							}
							Static10.method199(arg7, arg5, arg3, local1604, null);
						} else if (arg6 == 8) {
							local316 = arg9 + 2 & 0x3;
							local408 = 8;
							@Pc(1916) Interface7 local1916 = (Interface7) Static354.method5631(arg7, arg5, arg3);
							if (local1916 != null) {
								local408 = Static113.method2380(local1916.method5594()).anInt506 / 2;
							}
							@Pc(1957) Class8_Sub2 local1957;
							@Pc(1979) Class8_Sub2 local1979;
							if (local208) {
								local1957 = new Class8_Sub2_Sub2(arg8, local25, arg11, local154, local145, local163, arg10, arg9, local408 * Static129.anIntArray266[arg9], local408 * Static354.anIntArray511[arg9], arg6, arg9 + 4);
								local1979 = new Class8_Sub2_Sub2(arg8, local25, arg11, local154, local145, local163, arg10, arg9, 0, 0, arg6, local316 + 4);
								if (local1957.method5592()) {
									local1957.method5591(arg8);
								}
								if (local1979.method5592()) {
									local1979.method5591(arg8);
								}
							} else {
								local1957 = new Class8_Sub2_Sub1(arg8, local25, arg6, arg9 + 4, arg7, arg11, local154, local145, local163, arg10, arg9, local408 * Static129.anIntArray266[arg9], Static354.anIntArray511[arg9] * local408, arg0);
								local1979 = new Class8_Sub2_Sub1(arg8, local25, arg6, local316 + 4, arg7, arg11, local154, local145, local163, arg10, arg9, 0, 0, arg0);
							}
							Static10.method199(arg7, arg5, arg3, local1957, local1979);
						}
					}
				}
			}
		} else if (Static181.aBoolean302 || local25.anInt503 != 0 || local25.anInt526 == 1 || local25.aBoolean51) {
			@Pc(256) Class8_Sub5 local256;
			if (local208) {
				@Pc(271) Class8_Sub5_Sub1 local271 = new Class8_Sub5_Sub1(arg8, local25, arg11, local154, local145, local163, arg10, arg9, local174);
				local256 = local271;
				if (local271.method5592()) {
					local271.method5591(arg8);
				}
			} else {
				local256 = new Class8_Sub5_Sub2(arg8, local25, arg9, arg7, arg11, local154, local145, local163, arg10, arg0);
			}
			Static213.method3910(arg7, arg5, arg3, local256);
			if (local25.anInt526 == 1 && arg2 != null) {
				arg2.method4591(arg5, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)I")
	public static int method1176(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}
}
