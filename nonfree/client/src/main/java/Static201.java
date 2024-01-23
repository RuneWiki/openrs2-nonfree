import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!u", name = "b", descriptor = "Lclient!ld;")
	public static Class67 aClass67_9;

	@OriginalMember(owner = "client!u", name = "e", descriptor = "[Lclient!lc;")
	public static Class41[] aClass41Array9;

	@OriginalMember(owner = "client!u", name = "i", descriptor = "Lclient!mb;")
	public static Class70 aClass70_41;

	@OriginalMember(owner = "client!u", name = "j", descriptor = "I")
	public static int anInt4262;

	@OriginalMember(owner = "client!u", name = "r", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "I")
	public static int anInt4257 = 0;

	@OriginalMember(owner = "client!u", name = "d", descriptor = "I")
	public static int anInt4259 = 0;

	@OriginalMember(owner = "client!u", name = "o", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1460 = Static64.method1101("Please remove ");

	@OriginalMember(owner = "client!u", name = "g", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1458 = aClass51_1460;

	@OriginalMember(owner = "client!u", name = "k", descriptor = "I")
	public static int anInt4263 = 0;

	@OriginalMember(owner = "client!u", name = "l", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1459 = aClass51_1460;

	@OriginalMember(owner = "client!u", name = "m", descriptor = "I")
	public static int anInt4264 = 0;

	@OriginalMember(owner = "client!u", name = "q", descriptor = "I")
	public static int anInt4267 = 0;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IZIIIIIII[II)V")
	public static void method3305(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) int arg9) {
		if (arg2 < Static96.anInt2121) {
			arg9 -= Static96.anInt2121 - arg2;
			arg2 = Static96.anInt2121;
		}
		if (arg5 == 9) {
			arg0 = arg0 + 1 & 0x3;
			arg5 = 1;
		}
		if (arg5 == 10) {
			arg5 = 1;
			arg0 = arg0 + 3 & 0x3;
		}
		if (arg3 < Static96.anInt2124) {
			arg6 -= Static96.anInt2124 - arg3;
			arg3 = Static96.anInt2124;
		}
		if (arg5 == 11) {
			arg5 = 8;
			arg0 = arg0 + 3 & 0x3;
		}
		if (arg6 + arg3 > Static96.anInt2125) {
			arg6 = Static96.anInt2125 - arg3;
		}
		if (Static96.anInt2123 < arg9 + arg2) {
			arg9 = Static96.anInt2123 - arg2;
		}
		@Pc(97) int local97 = Static96.anInt2126 - arg9;
		@Pc(104) int local104 = arg3 * Static96.anInt2126 + arg2;
		@Pc(113) int local113;
		@Pc(117) int local117;
		if (arg5 == 1) {
			if (arg0 == 0) {
				for (local113 = 0; local113 < arg6; local113++) {
					for (local117 = 0; local117 < arg9; local117++) {
						if (local113 >= local117) {
							arg8[local104] = arg7;
						} else if (arg1) {
							arg8[local104] = arg4;
						}
						local104++;
					}
					local104 += local97;
				}
			} else if (arg0 == 1) {
				for (local113 = arg6 - 1; local113 >= 0; local113--) {
					for (local117 = 0; local117 < arg9; local117++) {
						if (local113 >= local117) {
							arg8[local104] = arg7;
						} else if (arg1) {
							arg8[local104] = arg4;
						}
						local104++;
					}
					local104 += local97;
				}
			} else if (arg0 == 2) {
				for (local113 = 0; local113 < arg6; local113++) {
					for (local117 = 0; local117 < arg9; local117++) {
						if (local117 >= local113) {
							arg8[local104] = arg7;
						} else if (arg1) {
							arg8[local104] = arg4;
						}
						local104++;
					}
					local104 += local97;
				}
			} else if (arg0 == 3) {
				for (local113 = arg6 - 1; local113 >= 0; local113--) {
					for (local117 = 0; local117 < arg9; local117++) {
						if (local113 <= local117) {
							arg8[local104] = arg7;
						} else if (arg1) {
							arg8[local104] = arg4;
						}
						local104++;
					}
					local104 += local97;
				}
			}
		} else if (arg5 == 2) {
			if (arg0 == 0) {
				for (local113 = arg6 - 1; local113 >= 0; local113--) {
					for (local117 = 0; local117 < arg9; local117++) {
						if (local117 <= local113 >> 1) {
							arg8[local104] = arg7;
						} else if (arg1) {
							arg8[local104] = arg4;
						}
						local104++;
					}
					local104 += local97;
				}
			} else if (arg0 == 1) {
				for (local113 = 0; local113 < arg6; local113++) {
					for (local117 = 0; local117 < arg9; local117++) {
						if (local117 >= local113 << 1) {
							arg8[local104] = arg7;
						} else if (arg1) {
							arg8[local104] = arg4;
						}
						local104++;
					}
					local104 += local97;
				}
			} else if (arg0 == 2) {
				for (local113 = 0; local113 < arg6; local113++) {
					for (local117 = arg9 - 1; local117 >= 0; local117--) {
						if (local113 >> 1 >= local117) {
							arg8[local104] = arg7;
						} else if (arg1) {
							arg8[local104] = arg4;
						}
						local104++;
					}
					local104 += local97;
				}
			} else if (arg0 == 3) {
				for (local113 = arg6 - 1; local113 >= 0; local113--) {
					for (local117 = arg9 - 1; local117 >= 0; local117--) {
						if (local113 << 1 <= local117) {
							arg8[local104] = arg7;
						} else if (arg1) {
							arg8[local104] = arg4;
						}
						local104++;
					}
					local104 += local97;
				}
			}
		} else if (arg5 == 3) {
			if (arg0 == 0) {
				for (local113 = arg6 - 1; local113 >= 0; local113--) {
					for (local117 = arg9 - 1; local117 >= 0; local117--) {
						if (local117 <= local113 >> 1) {
							arg8[local104] = arg7;
						} else if (arg1) {
							arg8[local104] = arg4;
						}
						local104++;
					}
					local104 += local97;
				}
			} else if (arg0 == 1) {
				for (local113 = arg6 - 1; local113 >= 0; local113--) {
					for (local117 = 0; local117 < arg9; local117++) {
						if (local117 >= local113 << 1) {
							arg8[local104] = arg7;
						} else if (arg1) {
							arg8[local104] = arg4;
						}
						local104++;
					}
					local104 += local97;
				}
			} else if (arg0 == 2) {
				for (local113 = 0; local113 < arg6; local113++) {
					for (local117 = 0; local117 < arg9; local117++) {
						if (local113 >> 1 >= local117) {
							arg8[local104] = arg7;
						} else if (arg1) {
							arg8[local104] = arg4;
						}
						local104++;
					}
					local104 += local97;
				}
			} else if (arg0 == 3) {
				for (local113 = 0; local113 < arg6; local113++) {
					for (local117 = arg9 - 1; local117 >= 0; local117--) {
						if (local117 >= local113 << 1) {
							arg8[local104] = arg7;
						} else if (arg1) {
							arg8[local104] = arg4;
						}
						local104++;
					}
					local104 += local97;
				}
			}
		} else if (arg5 == 4) {
			if (arg0 == 0) {
				for (local113 = arg6 - 1; local113 >= 0; local113--) {
					for (local117 = 0; local117 < arg9; local117++) {
						if (local117 >= local113 >> 1) {
							arg8[local104] = arg7;
						} else if (arg1) {
							arg8[local104] = arg4;
						}
						local104++;
					}
					local104 += local97;
				}
			} else if (arg0 == 1) {
				for (local113 = 0; local113 < arg6; local113++) {
					for (local117 = 0; local117 < arg9; local117++) {
						if (local117 <= local113 << 1) {
							arg8[local104] = arg7;
						} else if (arg1) {
							arg8[local104] = arg4;
						}
						local104++;
					}
					local104 += local97;
				}
			} else if (arg0 == 2) {
				for (local113 = 0; local113 < arg6; local113++) {
					for (local117 = arg9 - 1; local117 >= 0; local117--) {
						if (local117 >= local113 >> 1) {
							arg8[local104] = arg7;
						} else if (arg1) {
							arg8[local104] = arg4;
						}
						local104++;
					}
					local104 += local97;
				}
			} else if (arg0 == 3) {
				for (local113 = arg6 - 1; local113 >= 0; local113--) {
					for (local117 = arg9 - 1; local117 >= 0; local117--) {
						if (local113 << 1 >= local117) {
							arg8[local104] = arg7;
						} else if (arg1) {
							arg8[local104] = arg4;
						}
						local104++;
					}
					local104 += local97;
				}
			}
		} else if (arg5 != 5) {
			if (arg5 == 6) {
				if (arg0 == 0) {
					for (local113 = 0; local113 < arg6; local113++) {
						for (local117 = 0; local117 < arg9; local117++) {
							if (arg9 / 2 >= local117) {
								arg8[local104] = arg7;
							} else if (arg1) {
								arg8[local104] = arg4;
							}
							local104++;
						}
						local104 += local97;
					}
					return;
				}
				if (arg0 == 1) {
					for (local113 = 0; local113 < arg6; local113++) {
						for (local117 = 0; local117 < arg9; local117++) {
							if (local113 <= arg6 / 2) {
								arg8[local104] = arg7;
							} else if (arg1) {
								arg8[local104] = arg4;
							}
							local104++;
						}
						local104 += local97;
					}
					return;
				}
				if (arg0 == 2) {
					for (local113 = 0; local113 < arg6; local113++) {
						for (local117 = 0; local117 < arg9; local117++) {
							if (arg9 / 2 <= local117) {
								arg8[local104] = arg7;
							} else if (arg1) {
								arg8[local104] = arg4;
							}
							local104++;
						}
						local104 += local97;
					}
					return;
				}
				if (arg0 == 3) {
					for (local113 = 0; local113 < arg6; local113++) {
						for (local117 = 0; local117 < arg9; local117++) {
							if (local113 >= arg6 / 2) {
								arg8[local104] = arg7;
							} else if (arg1) {
								arg8[local104] = arg4;
							}
							local104++;
						}
						local104 += local97;
					}
					return;
				}
			}
			if (arg5 == 7) {
				if (arg0 == 0) {
					for (local113 = 0; local113 < arg6; local113++) {
						for (local117 = 0; local117 < arg9; local117++) {
							if (local113 - arg6 / 2 >= local117) {
								arg8[local104] = arg7;
							} else if (arg1) {
								arg8[local104] = arg4;
							}
							local104++;
						}
						local104 += local97;
					}
					return;
				}
				if (arg0 == 1) {
					for (local113 = arg6 - 1; local113 >= 0; local113--) {
						for (local117 = 0; local117 < arg9; local117++) {
							if (local113 - arg6 / 2 >= local117) {
								arg8[local104] = arg7;
							} else if (arg1) {
								arg8[local104] = arg4;
							}
							local104++;
						}
						local104 += local97;
					}
					return;
				}
				if (arg0 == 2) {
					for (local113 = arg6 - 1; local113 >= 0; local113--) {
						for (local117 = arg9 - 1; local117 >= 0; local117--) {
							if (local113 - arg6 / 2 >= local117) {
								arg8[local104] = arg7;
							} else if (arg1) {
								arg8[local104] = arg4;
							}
							local104++;
						}
						local104 += local97;
					}
					return;
				}
				if (arg0 == 3) {
					for (local113 = 0; local113 < arg6; local113++) {
						for (local117 = arg9 - 1; local117 >= 0; local117--) {
							if (local113 - arg6 / 2 >= local117) {
								arg8[local104] = arg7;
							} else if (arg1) {
								arg8[local104] = arg4;
							}
							local104++;
						}
						local104 += local97;
					}
					return;
				}
			}
			if (arg5 == 8) {
				if (arg0 == 0) {
					for (local113 = 0; local113 < arg6; local113++) {
						for (local117 = 0; local117 < arg9; local117++) {
							if (local117 >= local113 - arg6 / 2) {
								arg8[local104] = arg7;
							} else if (arg1) {
								arg8[local104] = arg4;
							}
							local104++;
						}
						local104 += local97;
					}
					return;
				}
				if (arg0 == 1) {
					for (local113 = arg6 - 1; local113 >= 0; local113--) {
						for (local117 = 0; local117 < arg9; local117++) {
							if (local113 - arg6 / 2 <= local117) {
								arg8[local104] = arg7;
							} else if (arg1) {
								arg8[local104] = arg4;
							}
							local104++;
						}
						local104 += local97;
					}
					return;
				}
				if (arg0 == 2) {
					for (local113 = arg6 - 1; local113 >= 0; local113--) {
						for (local117 = arg9 - 1; local117 >= 0; local117--) {
							if (local113 - arg6 / 2 <= local117) {
								arg8[local104] = arg7;
							} else if (arg1) {
								arg8[local104] = arg4;
							}
							local104++;
						}
						local104 += local97;
					}
					return;
				}
				if (arg0 == 3) {
					for (local113 = 0; local113 < arg6; local113++) {
						for (local117 = arg9 - 1; local117 >= 0; local117--) {
							if (local117 >= local113 - arg6 / 2) {
								arg8[local104] = arg7;
							} else if (arg1) {
								arg8[local104] = arg4;
							}
							local104++;
						}
						local104 += local97;
					}
					return;
				}
			}
		} else if (arg0 == 0) {
			for (local113 = arg6 - 1; local113 >= 0; local113--) {
				for (local117 = arg9 - 1; local117 >= 0; local117--) {
					if (local113 >> 1 <= local117) {
						arg8[local104] = arg7;
					} else if (arg1) {
						arg8[local104] = arg4;
					}
					local104++;
				}
				local104 += local97;
			}
		} else if (arg0 == 1) {
			for (local113 = arg6 - 1; local113 >= 0; local113--) {
				for (local117 = 0; local117 < arg9; local117++) {
					if (local117 <= local113 << 1) {
						arg8[local104] = arg7;
					} else if (arg1) {
						arg8[local104] = arg4;
					}
					local104++;
				}
				local104 += local97;
			}
		} else if (arg0 == 2) {
			for (local113 = 0; local113 < arg6; local113++) {
				for (local117 = 0; local117 < arg9; local117++) {
					if (local113 >> 1 <= local117) {
						arg8[local104] = arg7;
					} else if (arg1) {
						arg8[local104] = arg4;
					}
					local104++;
				}
				local104 += local97;
			}
		} else if (arg0 == 3) {
			for (local113 = 0; local113 < arg6; local113++) {
				for (local117 = arg9 - 1; local117 >= 0; local117--) {
					if (local117 <= local113 << 1) {
						arg8[local104] = arg7;
					} else if (arg1) {
						arg8[local104] = arg4;
					}
					local104++;
				}
				local104 += local97;
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V")
	public static void method3306() {
		for (@Pc(8) int local8 = 0; local8 < Static161.anInt3459; local8++) {
			@Pc(14) int local14 = Static123.anIntArray162[local8]--;
			if (Static123.anIntArray162[local8] >= -10) {
				@Pc(87) Class91 local87 = Static141.aClass91Array2[local8];
				if (local87 == null) {
					local87 = Static238.method2725(Static128.aClass70_Sub1_69, Static225.anIntArray375[local8], 0);
					if (local87 == null) {
						continue;
					}
					Static123.anIntArray162[local8] += local87.method2723();
					Static141.aClass91Array2[local8] = local87;
				}
				if (Static123.anIntArray162[local8] < 0) {
					@Pc(211) int local211;
					if (Static129.anIntArray189[local8] == 0) {
						local211 = Static84.anInt1961;
					} else {
						@Pc(130) int local130 = (Static129.anIntArray189[local8] & 0xFF) * 128;
						@Pc(138) int local138 = Static129.anIntArray189[local8] >> 16 & 0xFF;
						@Pc(148) int local148 = local138 * 128 + 64 - Static73.aClass5_Sub1_Sub1_1.anInt3624;
						if (local148 < 0) {
							local148 = -local148;
						}
						@Pc(161) int local161 = Static129.anIntArray189[local8] >> 8 & 0xFF;
						@Pc(171) int local171 = local161 * 128 + 64 - Static73.aClass5_Sub1_Sub1_1.anInt3598;
						if (local171 < 0) {
							local171 = -local171;
						}
						@Pc(185) int local185 = local148 + local171 - 128;
						if (local130 < local185) {
							Static123.anIntArray162[local8] = -100;
							continue;
						}
						if (local185 < 0) {
							local185 = 0;
						}
						local211 = (local130 - local185) * Static123.anInt2717 / local130;
					}
					if (local211 > 0) {
						@Pc(225) Class1_Sub6_Sub1 local225 = local87.method2724().method2536(Static65.aClass23_1);
						@Pc(230) Class1_Sub4_Sub4 local230 = Static237.method2392(local225, local211);
						local230.method2389(Static66.anIntArray99[local8] - 1);
						Static111.aClass1_Sub4_Sub3_2.method2306(local230);
					}
					Static123.anIntArray162[local8] = -100;
				}
			} else {
				Static161.anInt3459--;
				for (@Pc(30) int local30 = local8; local30 < Static161.anInt3459; local30++) {
					Static225.anIntArray375[local30] = Static225.anIntArray375[local30 + 1];
					Static141.aClass91Array2[local30] = Static141.aClass91Array2[local30 + 1];
					Static66.anIntArray99[local30] = Static66.anIntArray99[local30 + 1];
					Static123.anIntArray162[local30] = Static123.anIntArray162[local30 + 1];
					Static129.anIntArray189[local30] = Static129.anIntArray189[local30 + 1];
				}
				local8--;
			}
		}
		if (Static178.aBoolean183 && !Static218.method1759()) {
			if (Static155.anInt3424 != 0 && Static69.anInt1577 != -1) {
				Static65.method1115(Static155.anInt3424, Static8.aClass70_Sub1_3, Static69.anInt1577);
			}
			Static178.aBoolean183 = false;
		} else if (Static155.anInt3424 != 0 && Static69.anInt1577 != -1 && !Static218.method1759()) {
			Static167.aClass1_Sub16_Sub1_2.method3823(158);
			Static167.aClass1_Sub16_Sub1_2.method3808(Static69.anInt1577);
			Static69.anInt1577 = -1;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)I")
	public static int method3307() {
		return 2;
	}
}
