import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!pl", name = "i", descriptor = "Lclient!wk;")
	public static Class264 aClass264_35;

	@OriginalMember(owner = "client!pl", name = "C", descriptor = "F")
	public static float aFloat150;

	@OriginalMember(owner = "client!pl", name = "g", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_68 = new Class242(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(BLclient!qa;Lclient!m;)V")
	public static void method4221(@OriginalArg(1) Class30 arg0, @OriginalArg(2) Interface10 arg1) {
		if (Static137.aClass4_Sub1_Sub16_2 == null) {
			return;
		}
		if (Static231.anInt4229 < 10) {
			if (!Static137.aClass166_219.method3682(Static137.aClass4_Sub1_Sub16_2.aString58)) {
				Static231.anInt4229 = Static260.aClass166_302.method3692(Static137.aClass4_Sub1_Sub16_2.aString58) / 10;
				return;
			}
			Static301.method4178();
			Static231.anInt4229 = 10;
		}
		if (Static231.anInt4229 == 10) {
			Static137.anInt5581 = Static137.aClass4_Sub1_Sub16_2.anInt6329 >> 6 << 6;
			Static137.anInt5584 = Static137.aClass4_Sub1_Sub16_2.anInt6327 >> 6 << 6;
			Static137.anInt5588 = (Static137.aClass4_Sub1_Sub16_2.anInt6317 >> 6 << 6) + 64 - Static137.anInt5581;
			Static137.anInt5580 = (Static137.aClass4_Sub1_Sub16_2.anInt6315 >> 6 << 6) + 64 - Static137.anInt5584;
			@Pc(73) int[] local73 = new int[3];
			@Pc(75) int local75 = -1;
			@Pc(77) int local77 = -1;
			if (Static137.aClass4_Sub1_Sub16_2.method4923(Static381.anInt6688 + (Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6062 >> 7), Static375.aClass6_Sub2_Sub1_Sub1_3.aByte86, Static285.anInt5187 + (Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6061 >> 7), local73)) {
				local77 = local73[2] - Static137.anInt5584;
				local75 = local73[1] - Static137.anInt5581;
			}
			if (!Static450.aBoolean499 && local75 >= 0 && local75 < Static137.anInt5588 && local77 >= 0 && local77 < Static137.anInt5580) {
				local77 += (int) (Math.random() * 10.0D) - 5;
				local75 += (int) (Math.random() * 10.0D) - 5;
				Static348.anInt6296 = local75;
				Static4.anInt162 = local77;
			} else if (Static65.anInt1633 == -1 || Static299.anInt5399 == -1) {
				Static137.aClass4_Sub1_Sub16_2.method4921(Static137.aClass4_Sub1_Sub16_2.anInt6328 >> 14 & 0x3FFF, Static137.aClass4_Sub1_Sub16_2.anInt6328 & 0x3FFF, local73);
				Static348.anInt6296 = local73[1] - Static137.anInt5581;
				Static4.anInt162 = local73[2] - Static137.anInt5584;
			} else {
				Static137.aClass4_Sub1_Sub16_2.method4921(Static65.anInt1633, Static299.anInt5399, local73);
				if (local73 != null) {
					Static4.anInt162 = local73[2] - Static137.anInt5584;
					Static348.anInt6296 = local73[1] - Static137.anInt5581;
				}
				Static299.anInt5399 = -1;
				Static65.anInt1633 = -1;
				Static450.aBoolean499 = false;
			}
			if (Static137.aClass4_Sub1_Sub16_2.anInt6316 == 37) {
				Static137.aFloat153 = 3.0F;
				Static137.aFloat154 = 3.0F;
			} else if (Static137.aClass4_Sub1_Sub16_2.anInt6316 == 50) {
				Static137.aFloat153 = 4.0F;
				Static137.aFloat154 = 4.0F;
			} else if (Static137.aClass4_Sub1_Sub16_2.anInt6316 == 75) {
				Static137.aFloat153 = 6.0F;
				Static137.aFloat154 = 6.0F;
			} else if (Static137.aClass4_Sub1_Sub16_2.anInt6316 == 100) {
				Static137.aFloat153 = 8.0F;
				Static137.aFloat154 = 8.0F;
			} else if (Static137.aClass4_Sub1_Sub16_2.anInt6316 == 200) {
				Static137.aFloat153 = 16.0F;
				Static137.aFloat154 = 16.0F;
			} else {
				Static137.aFloat153 = 8.0F;
				Static137.aFloat154 = 8.0F;
			}
			Static137.anInt5578 = (int) Static137.aFloat153 >> 1;
			Static137.aByteArrayArrayArray9 = Static39.method1433(Static137.anInt5578);
			Static28.method540();
			Static137.method4284();
			Static113.aClass258_17 = new Class258();
			Static137.anInt5577 += (int) (Math.random() * 5.0D) - 2;
			if (Static137.anInt5577 < -8) {
				Static137.anInt5577 = -8;
			}
			if (Static137.anInt5577 > 8) {
				Static137.anInt5577 = 8;
			}
			Static137.anInt5579 += (int) (Math.random() * 5.0D) - 2;
			if (Static137.anInt5579 < -16) {
				Static137.anInt5579 = -16;
			}
			if (Static137.anInt5579 > 16) {
				Static137.anInt5579 = 16;
			}
			Static137.method4302(arg1, Static137.anInt5577 >> 2 << 10, Static137.anInt5579 >> 1);
			Static137.aClass198_4.method4493(1024, 256);
			Static137.aClass212_4.method4943(256, 256);
			Static137.aClass74_10.method1684(4096);
			Static73.aClass252_1.method5481(256);
			Static231.anInt4229 = 20;
		} else if (Static231.anInt4229 == 20) {
			Static39.method1428(true);
			Static137.method4303(arg0, Static137.anInt5577, Static137.anInt5579);
			Static231.anInt4229 = 60;
			Static39.method1428(true);
			Static208.method2967();
		} else if (Static231.anInt4229 == 60) {
			if (Static137.aClass166_219.method3679(Static137.aClass4_Sub1_Sub16_2.aString58 + "_staticelements")) {
				if (!Static137.aClass166_219.method3682(Static137.aClass4_Sub1_Sub16_2.aString58 + "_staticelements")) {
					return;
				}
				Static137.aClass257_2 = Static455.method5874(Static165.aBoolean225, Static137.aClass166_219, Static137.aClass4_Sub1_Sub16_2.aString58 + "_staticelements");
			} else {
				Static137.aClass257_2 = new Class257(0);
			}
			Static137.method4298();
			Static231.anInt4229 = 70;
			Static39.method1428(true);
			Static208.method2967();
		} else if (Static231.anInt4229 == 70) {
			Static389.aClass264_41 = new Class264(arg0, 11, true, Static248.aCanvas5);
			Static231.anInt4229 = 73;
			Static39.method1428(true);
			Static208.method2967();
		} else if (Static231.anInt4229 == 73) {
			Static196.aClass264_22 = new Class264(arg0, 12, true, Static248.aCanvas5);
			Static231.anInt4229 = 76;
			Static39.method1428(true);
			Static208.method2967();
		} else if (Static231.anInt4229 == 76) {
			Static394.aClass264_42 = new Class264(arg0, 14, true, Static248.aCanvas5);
			Static231.anInt4229 = 79;
			Static39.method1428(true);
			Static208.method2967();
		} else if (Static231.anInt4229 == 79) {
			Static182.aClass264_21 = new Class264(arg0, 17, true, Static248.aCanvas5);
			Static231.anInt4229 = 82;
			Static39.method1428(true);
			Static208.method2967();
		} else if (Static231.anInt4229 == 82) {
			Static59.aClass264_7 = new Class264(arg0, 19, true, Static248.aCanvas5);
			Static231.anInt4229 = 85;
			Static39.method1428(true);
			Static208.method2967();
		} else if (Static231.anInt4229 == 85) {
			Static260.aClass264_50 = new Class264(arg0, 22, true, Static248.aCanvas5);
			Static231.anInt4229 = 88;
			Static39.method1428(true);
			Static208.method2967();
		} else if (Static231.anInt4229 == 88) {
			aClass264_35 = new Class264(arg0, 26, true, Static248.aCanvas5);
			Static231.anInt4229 = 91;
			Static39.method1428(true);
			Static208.method2967();
		} else {
			Static307.aClass264_49 = new Class264(arg0, 30, true, Static248.aCanvas5);
			Static231.anInt4229 = 100;
			Static39.method1428(true);
			Static208.method2967();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!ho;I)V")
	public static void method4227(@OriginalArg(0) Class4_Sub18 arg0) {
		arg0.aBoolean496 = false;
		if (arg0.aClass4_Sub35_5 != null) {
			arg0.aClass4_Sub35_5.anInt6959 = 0;
		}
		for (@Pc(22) Class4_Sub18 local22 = arg0.method5751(); local22 != null; local22 = arg0.method5752()) {
			method4227(local22);
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILclient!wq;IIIIIIZIII)Z")
	public static boolean method4228(@OriginalArg(0) int arg0, @OriginalArg(1) Class268 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg3;
		@Pc(9) int local9 = arg2;
		@Pc(23) int local23 = arg3 - 64;
		@Pc(28) int local28 = arg2 - 64;
		Static384.anIntArrayArray57[64][64] = 99;
		Static33.anIntArrayArray12[64][64] = 0;
		@Pc(42) byte local42 = 0;
		@Pc(44) int local44 = 0;
		Static102.anIntArray137[0] = arg3;
		@Pc(51) int local51 = local42 + 1;
		Static161.anIntArray252[0] = arg2;
		@Pc(56) int[][] local56 = arg1.anIntArrayArray66;
		while (true) {
			label282: while (true) {
				@Pc(81) int local81;
				@Pc(71) int local71;
				@Pc(87) int local87;
				@Pc(93) int local93;
				@Pc(246) int local246;
				@Pc(291) int local291;
				do {
					do {
						do {
							label259: do {
								if (local44 == local51) {
									Static126.anInt2567 = local7;
									Static123.anInt6825 = local9;
									return false;
								}
								local7 = Static102.anIntArray137[local44];
								local9 = Static161.anIntArray252[local44];
								local71 = local9 - local28;
								local44 = local44 + 1 & 0xFFF;
								local81 = local7 - local23;
								local87 = local7 - arg1.anInt7539;
								local93 = local9 - arg1.anInt7518;
								if (arg0 == -4) {
									if (local7 == arg8 && arg9 == local9) {
										Static123.anInt6825 = local9;
										Static126.anInt2567 = local7;
										return true;
									}
								} else if (arg0 == -3) {
									if (Static303.method4186(local9, arg5, arg7, arg6, arg9, arg8, arg7, local7)) {
										Static123.anInt6825 = local9;
										Static126.anInt2567 = local7;
										return true;
									}
								} else if (arg0 == -2) {
									if (arg1.method5806(local7, arg7, arg6, arg4, local9, arg7, arg9, arg5, arg8)) {
										Static123.anInt6825 = local9;
										Static126.anInt2567 = local7;
										return true;
									}
								} else if (arg0 == -1) {
									if (arg1.method5810(arg6, arg7, arg8, local7, arg9, arg5, local9, arg4)) {
										Static123.anInt6825 = local9;
										Static126.anInt2567 = local7;
										return true;
									}
								} else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
									if (arg1.method5801(arg0, arg9, local7, arg10, local9, arg7, arg8)) {
										Static126.anInt2567 = local7;
										Static123.anInt6825 = local9;
										return true;
									}
								} else if (arg1.method5800(arg8, arg0, local7, arg7, local9, arg10, arg9)) {
									Static123.anInt6825 = local9;
									Static126.anInt2567 = local7;
									return true;
								}
								local246 = Static33.anIntArrayArray12[local81][local71] + 1;
								if (local81 > 0 && Static384.anIntArrayArray57[local81 - 1][local71] == 0 && (local56[local87 - 1][local93] & 0x43A40000) == 0 && (local56[local87 - 1][arg7 + local93 - 1] & 0x4E240000) == 0) {
									local291 = 1;
									while (true) {
										if (arg7 - 1 <= local291) {
											Static102.anIntArray137[local51] = local7 - 1;
											Static161.anIntArray252[local51] = local9;
											Static384.anIntArrayArray57[local81 - 1][local71] = 2;
											local51 = local51 + 1 & 0xFFF;
											Static33.anIntArrayArray12[local81 - 1][local71] = local246;
											break;
										}
										if ((local56[local87 - 1][local93 + local291] & 0x4FA40000) != 0) {
											break;
										}
										local291++;
									}
								}
								if (local81 < 128 - arg7 && Static384.anIntArrayArray57[local81 + 1][local71] == 0 && (local56[arg7 + local87][local93] & 0x60E40000) == 0 && (local56[local87 + arg7][arg7 + local93 - 1] & 0x78240000) == 0) {
									local291 = 1;
									while (true) {
										if (local291 >= arg7 - 1) {
											Static102.anIntArray137[local51] = local7 + 1;
											Static161.anIntArray252[local51] = local9;
											Static384.anIntArrayArray57[local81 + 1][local71] = 8;
											local51 = local51 + 1 & 0xFFF;
											Static33.anIntArrayArray12[local81 + 1][local71] = local246;
											break;
										}
										if ((local56[local87 + arg7][local93 + local291] & 0x78E40000) != 0) {
											break;
										}
										local291++;
									}
								}
								if (local71 > 0 && Static384.anIntArrayArray57[local81][local71 - 1] == 0 && (local56[local87][local93 - 1] & 0x43A40000) == 0 && (local56[arg7 + local87 - 1][local93 - 1] & 0x60E40000) == 0) {
									local291 = 1;
									while (true) {
										if (arg7 - 1 <= local291) {
											Static102.anIntArray137[local51] = local7;
											Static161.anIntArray252[local51] = local9 - 1;
											Static384.anIntArrayArray57[local81][local71 - 1] = 1;
											local51 = local51 + 1 & 0xFFF;
											Static33.anIntArrayArray12[local81][local71 - 1] = local246;
											break;
										}
										if ((local56[local87 + local291][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local291++;
									}
								}
								if (128 - arg7 > local71 && Static384.anIntArrayArray57[local81][local71 + 1] == 0 && (local56[local87][arg7 + local93] & 0x4E240000) == 0 && (local56[arg7 + local87 - 1][arg7 + local93] & 0x78240000) == 0) {
									local291 = 1;
									while (true) {
										if (local291 >= arg7 - 1) {
											Static102.anIntArray137[local51] = local7;
											Static161.anIntArray252[local51] = local9 + 1;
											Static384.anIntArrayArray57[local81][local71 + 1] = 4;
											local51 = local51 + 1 & 0xFFF;
											Static33.anIntArrayArray12[local81][local71 + 1] = local246;
											break;
										}
										if ((local56[local291 + local87][local93 + arg7] & 0x7E240000) != 0) {
											break;
										}
										local291++;
									}
								}
								if (local81 > 0 && local71 > 0 && Static384.anIntArrayArray57[local81 - 1][local71 - 1] == 0 && (local56[local87 - 1][local93 - 1] & 0x43A40000) == 0) {
									local291 = 1;
									while (true) {
										if (arg7 <= local291) {
											Static102.anIntArray137[local51] = local7 - 1;
											Static161.anIntArray252[local51] = local9 - 1;
											local51 = local51 + 1 & 0xFFF;
											Static384.anIntArrayArray57[local81 - 1][local71 - 1] = 3;
											Static33.anIntArrayArray12[local81 - 1][local71 - 1] = local246;
											break;
										}
										if ((local56[local87 - 1][local291 + local93 - 1] & 0x4FA40000) != 0 || (local56[local87 + local291 - 1][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local291++;
									}
								}
								if (local81 < 128 - arg7 && local71 > 0 && Static384.anIntArrayArray57[local81 + 1][local71 - 1] == 0 && (local56[local87 + arg7][local93 - 1] & 0x60E40000) == 0) {
									local291 = 1;
									while (true) {
										if (arg7 <= local291) {
											Static102.anIntArray137[local51] = local7 + 1;
											Static161.anIntArray252[local51] = local9 - 1;
											Static384.anIntArrayArray57[local81 + 1][local71 - 1] = 9;
											local51 = local51 + 1 & 0xFFF;
											Static33.anIntArrayArray12[local81 + 1][local71 - 1] = local246;
											break;
										}
										if ((local56[arg7 + local87][local93 + local291 - 1] & 0x78E40000) != 0 || (local56[local87 + local291][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local291++;
									}
								}
								if (local81 > 0 && local71 < 128 - arg7 && Static384.anIntArrayArray57[local81 - 1][local71 + 1] == 0 && (local56[local87 - 1][arg7 + local93] & 0x4E240000) == 0) {
									for (local291 = 1; local291 < arg7; local291++) {
										if ((local56[local87 - 1][local93 + local291] & 0x4FA40000) != 0 || (local56[local291 + local87 - 1][arg7 + local93] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static102.anIntArray137[local51] = local7 - 1;
									Static161.anIntArray252[local51] = local9 + 1;
									Static384.anIntArrayArray57[local81 - 1][local71 + 1] = 6;
									local51 = local51 + 1 & 0xFFF;
									Static33.anIntArrayArray12[local81 - 1][local71 + 1] = local246;
								}
							} while (local81 >= 128 - arg7);
						} while (local71 >= 128 - arg7);
					} while (Static384.anIntArrayArray57[local81 + 1][local71 + 1] != 0);
				} while ((local56[local87 + arg7][arg7 + local93] & 0x78240000) != 0);
				for (local291 = 1; local291 < arg7; local291++) {
					if ((local56[local291 + local87][arg7 + local93] & 0x7E240000) != 0 || (local56[local87 + arg7][local93 + local291] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static102.anIntArray137[local51] = local7 + 1;
				Static161.anIntArray252[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static384.anIntArrayArray57[local81 + 1][local71 + 1] = 12;
				Static33.anIntArrayArray12[local81 + 1][local71 + 1] = local246;
			}
		}
	}
}
