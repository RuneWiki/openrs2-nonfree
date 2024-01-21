import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!vb;Lclient!og;IIIIIII)V")
	public static void method147(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static92.aBoolean101 && (Static140.aByteArrayArrayArray6[0][arg7][arg6] & 0x2) == 0) {
			if ((Static140.aByteArrayArrayArray6[arg3][arg7][arg6] & 0x10) != 0) {
				return;
			}
			if (Static77.method1450(arg3, arg6, arg7) != Static24.anInt724) {
				return;
			}
		}
		if (arg3 < Static118.anInt2928) {
			Static118.anInt2928 = arg3;
		}
		@Pc(52) Class2_Sub2_Sub5 local52 = Static121.method2129(arg5);
		@Pc(61) int local61;
		@Pc(64) int local64;
		if (arg2 == 1 || arg2 == 3) {
			local61 = local52.anInt538;
			local64 = local52.anInt520;
		} else {
			local61 = local52.anInt520;
			local64 = local52.anInt538;
		}
		@Pc(85) int local85;
		@Pc(83) int local83;
		if (arg7 + local61 > 104) {
			local83 = arg7 + 1;
			local85 = arg7;
		} else {
			local83 = (local61 + 1 >> 1) + arg7;
			local85 = arg7 + (local61 >> 1);
		}
		@Pc(110) int local110;
		@Pc(114) int local114;
		if (local64 + arg6 > 104) {
			local110 = arg6;
			local114 = arg6 + 1;
		} else {
			local114 = arg6 + (local64 + 1 >> 1);
			local110 = (local64 >> 1) + arg6;
		}
		@Pc(135) int[][] local135 = Static122.anIntArrayArrayArray2[arg3];
		@Pc(143) int local143 = (local61 << 6) + (arg7 << 7);
		@Pc(170) int local170 = local135[local85][local114] + local135[local83][local110] + local135[local85][local110] + local135[local83][local114] >> 2;
		@Pc(179) int local179 = (arg6 << 7) + (local64 << 6);
		@Pc(191) int local191 = (arg5 << 14) + (arg6 << 7) + arg7 + 1073741824;
		@Pc(197) int local197 = (arg2 << 6) + arg4;
		if (local52.anInt540 == 0) {
			local191 += Integer.MIN_VALUE;
		}
		if (local52.anInt524 == 1) {
			local197 += 256;
		}
		if (local52.method352()) {
			Static144.method2440(local52, arg2, arg7, arg6, arg3);
		}
		@Pc(263) Class2_Sub2_Sub1 local263;
		if (arg4 != 22) {
			@Pc(363) int local363;
			if (arg4 == 10 || arg4 == 11) {
				if (local52.anInt513 == -1 && local52.anIntArray73 == null) {
					local263 = local52.method351(local179, local135, local170, arg2, 10, local143);
				} else {
					local263 = new Class2_Sub2_Sub1_Sub5(arg5, 10, arg2, arg3, arg7, arg6, local52.anInt513, true, null);
				}
				if (local263 != null && arg1.method2065(arg3, arg7, arg6, local170, local61, local64, local263, arg4 == 11 ? 256 : 0, local191, local197) && local52.aBoolean22) {
					local363 = 15;
					if (local263 instanceof Class2_Sub2_Sub1_Sub2) {
						local363 = ((Class2_Sub2_Sub1_Sub2) local263).method595() / 4;
						if (local363 > 30) {
							local363 = 30;
						}
					}
					for (@Pc(381) int local381 = 0; local381 <= local61; local381++) {
						for (@Pc(385) int local385 = 0; local385 <= local64; local385++) {
							if (Static27.aByteArrayArrayArray1[arg3][arg7 + local381][local385 + arg6] < local363) {
								Static27.aByteArrayArrayArray1[arg3][local381 + arg7][arg6 + local385] = (byte) local363;
							}
						}
					}
				}
				if (local52.anInt514 != 0 && arg0 != null) {
					arg0.method2805(arg7, arg6, local61, local64, local52.aBoolean28);
				}
			} else if (arg4 >= 12) {
				if (local52.anInt513 == -1 && local52.anIntArray73 == null) {
					local263 = local52.method351(local179, local135, local170, arg2, arg4, local143);
				} else {
					local263 = new Class2_Sub2_Sub1_Sub5(arg5, arg4, arg2, arg3, arg7, arg6, local52.anInt513, true, null);
				}
				arg1.method2065(arg3, arg7, arg6, local170, 1, 1, local263, 0, local191, local197);
				if (arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg3 > 0) {
					Static140.anIntArrayArrayArray6[arg3][arg7][arg6] |= 0x924;
				}
				if (local52.anInt514 != 0 && arg0 != null) {
					arg0.method2805(arg7, arg6, local61, local64, local52.aBoolean28);
				}
			} else if (arg4 == 0) {
				if (local52.anInt513 == -1 && local52.anIntArray73 == null) {
					local263 = local52.method351(local179, local135, local170, arg2, 0, local143);
				} else {
					local263 = new Class2_Sub2_Sub1_Sub5(arg5, 0, arg2, arg3, arg7, arg6, local52.anInt513, true, null);
				}
				arg1.method2087(arg3, arg7, arg6, local170, local263, null, Static52.anIntArray224[arg2], 0, local191, local197);
				if (arg2 == 0) {
					if (local52.aBoolean22) {
						Static27.aByteArrayArrayArray1[arg3][arg7][arg6] = 50;
						Static27.aByteArrayArrayArray1[arg3][arg7][arg6 + 1] = 50;
					}
					if (local52.aBoolean27) {
						Static140.anIntArrayArrayArray6[arg3][arg7][arg6] |= 0x249;
					}
				} else if (arg2 == 1) {
					if (local52.aBoolean22) {
						Static27.aByteArrayArrayArray1[arg3][arg7][arg6 + 1] = 50;
						Static27.aByteArrayArrayArray1[arg3][arg7 + 1][arg6 + 1] = 50;
					}
					if (local52.aBoolean27) {
						Static140.anIntArrayArrayArray6[arg3][arg7][arg6 + 1] |= 0x492;
					}
				} else if (arg2 == 2) {
					if (local52.aBoolean22) {
						Static27.aByteArrayArrayArray1[arg3][arg7 + 1][arg6] = 50;
						Static27.aByteArrayArrayArray1[arg3][arg7 + 1][arg6 + 1] = 50;
					}
					if (local52.aBoolean27) {
						Static140.anIntArrayArrayArray6[arg3][arg7 + 1][arg6] |= 0x249;
					}
				} else if (arg2 == 3) {
					if (local52.aBoolean22) {
						Static27.aByteArrayArrayArray1[arg3][arg7][arg6] = 50;
						Static27.aByteArrayArrayArray1[arg3][arg7 + 1][arg6] = 50;
					}
					if (local52.aBoolean27) {
						Static140.anIntArrayArrayArray6[arg3][arg7][arg6] |= 0x492;
					}
				}
				if (local52.anInt514 != 0 && arg0 != null) {
					arg0.method2812(arg6, local52.aBoolean28, arg2, arg7, arg4);
				}
				if (local52.anInt526 != 16) {
					arg1.method2053(arg3, arg7, arg6, local52.anInt526);
				}
			} else if (arg4 == 1) {
				if (local52.anInt513 == -1 && local52.anIntArray73 == null) {
					local263 = local52.method351(local179, local135, local170, arg2, 1, local143);
				} else {
					local263 = new Class2_Sub2_Sub1_Sub5(arg5, 1, arg2, arg3, arg7, arg6, local52.anInt513, true, null);
				}
				arg1.method2087(arg3, arg7, arg6, local170, local263, null, Static94.anIntArray387[arg2], 0, local191, local197);
				if (local52.aBoolean22) {
					if (arg2 == 0) {
						Static27.aByteArrayArrayArray1[arg3][arg7][arg6 + 1] = 50;
					} else if (arg2 == 1) {
						Static27.aByteArrayArrayArray1[arg3][arg7 + 1][arg6 + 1] = 50;
					} else if (arg2 == 2) {
						Static27.aByteArrayArrayArray1[arg3][arg7 + 1][arg6] = 50;
					} else if (arg2 == 3) {
						Static27.aByteArrayArrayArray1[arg3][arg7][arg6] = 50;
					}
				}
				if (local52.anInt514 != 0 && arg0 != null) {
					arg0.method2812(arg6, local52.aBoolean28, arg2, arg7, arg4);
				}
			} else {
				@Pc(962) int local962;
				@Pc(992) Class2_Sub2_Sub1 local992;
				if (arg4 == 2) {
					local962 = arg2 + 1 & 0x3;
					@Pc(982) Class2_Sub2_Sub1 local982;
					if (local52.anInt513 == -1 && local52.anIntArray73 == null) {
						local982 = local52.method351(local179, local135, local170, arg2 + 4, 2, local143);
						local992 = local52.method351(local179, local135, local170, local962, 2, local143);
					} else {
						local982 = new Class2_Sub2_Sub1_Sub5(arg5, 2, arg2 + 4, arg3, arg7, arg6, local52.anInt513, true, null);
						local992 = new Class2_Sub2_Sub1_Sub5(arg5, 2, local962, arg3, arg7, arg6, local52.anInt513, true, null);
					}
					arg1.method2087(arg3, arg7, arg6, local170, local982, local992, Static52.anIntArray224[arg2], Static52.anIntArray224[local962], local191, local197);
					if (local52.aBoolean27) {
						if (arg2 == 0) {
							Static140.anIntArrayArrayArray6[arg3][arg7][arg6] |= 0x249;
							Static140.anIntArrayArrayArray6[arg3][arg7][arg6 + 1] |= 0x492;
						} else if (arg2 == 1) {
							Static140.anIntArrayArrayArray6[arg3][arg7][arg6 + 1] |= 0x492;
							Static140.anIntArrayArrayArray6[arg3][arg7 + 1][arg6] |= 0x249;
						} else if (arg2 == 2) {
							Static140.anIntArrayArrayArray6[arg3][arg7 + 1][arg6] |= 0x249;
							Static140.anIntArrayArrayArray6[arg3][arg7][arg6] |= 0x492;
						} else if (arg2 == 3) {
							Static140.anIntArrayArrayArray6[arg3][arg7][arg6] |= 0x492;
							Static140.anIntArrayArrayArray6[arg3][arg7][arg6] |= 0x249;
						}
					}
					if (local52.anInt514 != 0 && arg0 != null) {
						arg0.method2812(arg6, local52.aBoolean28, arg2, arg7, arg4);
					}
					if (local52.anInt526 != 16) {
						arg1.method2053(arg3, arg7, arg6, local52.anInt526);
					}
				} else if (arg4 == 3) {
					if (local52.anInt513 == -1 && local52.anIntArray73 == null) {
						local263 = local52.method351(local179, local135, local170, arg2, 3, local143);
					} else {
						local263 = new Class2_Sub2_Sub1_Sub5(arg5, 3, arg2, arg3, arg7, arg6, local52.anInt513, true, null);
					}
					arg1.method2087(arg3, arg7, arg6, local170, local263, null, Static94.anIntArray387[arg2], 0, local191, local197);
					if (local52.aBoolean22) {
						if (arg2 == 0) {
							Static27.aByteArrayArrayArray1[arg3][arg7][arg6 + 1] = 50;
						} else if (arg2 == 1) {
							Static27.aByteArrayArrayArray1[arg3][arg7 + 1][arg6 + 1] = 50;
						} else if (arg2 == 2) {
							Static27.aByteArrayArrayArray1[arg3][arg7 + 1][arg6] = 50;
						} else if (arg2 == 3) {
							Static27.aByteArrayArrayArray1[arg3][arg7][arg6] = 50;
						}
					}
					if (local52.anInt514 != 0 && arg0 != null) {
						arg0.method2812(arg6, local52.aBoolean28, arg2, arg7, arg4);
					}
				} else if (arg4 == 9) {
					if (local52.anInt513 == -1 && local52.anIntArray73 == null) {
						local263 = local52.method351(local179, local135, local170, arg2, arg4, local143);
					} else {
						local263 = new Class2_Sub2_Sub1_Sub5(arg5, arg4, arg2, arg3, arg7, arg6, local52.anInt513, true, null);
					}
					arg1.method2065(arg3, arg7, arg6, local170, 1, 1, local263, 0, local191, local197);
					if (local52.anInt514 != 0 && arg0 != null) {
						arg0.method2805(arg7, arg6, local61, local64, local52.aBoolean28);
					}
					if (local52.anInt526 != 16) {
						arg1.method2053(arg3, arg7, arg6, local52.anInt526);
					}
				} else if (arg4 == 4) {
					if (local52.anInt513 == -1 && local52.anIntArray73 == null) {
						local263 = local52.method351(local179, local135, local170, arg2, 4, local143);
					} else {
						local263 = new Class2_Sub2_Sub1_Sub5(arg5, 4, arg2, arg3, arg7, arg6, local52.anInt513, true, null);
					}
					arg1.method2071(arg3, arg7, arg6, local170, local263, null, Static52.anIntArray224[arg2], 0, 0, 0, local191, local197);
				} else if (arg4 == 5) {
					local962 = 16;
					local363 = arg1.method2077(arg3, arg7, arg6);
					if (local363 != 0) {
						local962 = Static121.method2129(local363 >> 14 & 0x7FFF).anInt526;
					}
					if (local52.anInt513 == -1 && local52.anIntArray73 == null) {
						local992 = local52.method351(local179, local135, local170, arg2, 4, local143);
					} else {
						local992 = new Class2_Sub2_Sub1_Sub5(arg5, 4, arg2, arg3, arg7, arg6, local52.anInt513, true, null);
					}
					arg1.method2071(arg3, arg7, arg6, local170, local992, null, Static52.anIntArray224[arg2], 0, Static6.anIntArray26[arg2] * local962, local962 * Static78.anIntArray344[arg2], local191, local197);
				} else if (arg4 == 6) {
					local962 = 8;
					local363 = arg1.method2077(arg3, arg7, arg6);
					if (local363 != 0) {
						local962 = Static121.method2129(local363 >> 14 & 0x7FFF).anInt526 / 2;
					}
					if (local52.anInt513 == -1 && local52.anIntArray73 == null) {
						local992 = local52.method351(local179, local135, local170, arg2 + 4, 4, local143);
					} else {
						local992 = new Class2_Sub2_Sub1_Sub5(arg5, 4, arg2 + 4, arg3, arg7, arg6, local52.anInt513, true, null);
					}
					arg1.method2071(arg3, arg7, arg6, local170, local992, null, 256, arg2, Static156.anIntArray563[arg2] * local962, local962 * Static109.anIntArray143[arg2], local191, local197);
				} else if (arg4 == 7) {
					local363 = arg2 + 2 & 0x3;
					if (local52.anInt513 == -1 && local52.anIntArray73 == null) {
						local263 = local52.method351(local179, local135, local170, local363 + 4, 4, local143);
					} else {
						local263 = new Class2_Sub2_Sub1_Sub5(arg5, 4, local363 + 4, arg3, arg7, arg6, local52.anInt513, true, null);
					}
					arg1.method2071(arg3, arg7, arg6, local170, local263, null, 256, local363, 0, 0, local191, local197);
				} else if (arg4 == 8) {
					local962 = 8;
					local363 = arg1.method2077(arg3, arg7, arg6);
					if (local363 != 0) {
						local962 = Static121.method2129(local363 >> 14 & 0x7FFF).anInt526 / 2;
					}
					@Pc(1766) int local1766 = arg2 + 2 & 0x3;
					@Pc(1798) Class2_Sub2_Sub1 local1798;
					if (local52.anInt513 == -1 && local52.anIntArray73 == null) {
						local992 = local52.method351(local179, local135, local170, arg2 + 4, 4, local143);
						local1798 = local52.method351(local179, local135, local170, local1766 + 4, 4, local143);
					} else {
						local992 = new Class2_Sub2_Sub1_Sub5(arg5, 4, arg2 + 4, arg3, arg7, arg6, local52.anInt513, true, null);
						local1798 = new Class2_Sub2_Sub1_Sub5(arg5, 4, local1766 + 4, arg3, arg7, arg6, local52.anInt513, true, null);
					}
					arg1.method2071(arg3, arg7, arg6, local170, local992, local1798, 256, arg2, Static156.anIntArray563[arg2] * local962, local962 * Static109.anIntArray143[arg2], local191, local197);
				}
			}
		} else if (!Static92.aBoolean101 || local52.anInt540 != 0 || local52.anInt514 == 1 || local52.aBoolean26) {
			if (local52.anInt513 == -1 && local52.anIntArray73 == null) {
				local263 = local52.method351(local179, local135, local170, arg2, 22, local143);
			} else {
				local263 = new Class2_Sub2_Sub1_Sub5(arg5, 22, arg2, arg3, arg7, arg6, local52.anInt513, true, null);
			}
			arg1.method2081(arg3, arg7, arg6, local170, local263, local191, local197);
			if (local52.anInt514 == 1 && arg0 != null) {
				arg0.method2801(arg6, arg7);
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!sg;ILclient!oa;)I")
	public static int method149(@OriginalArg(0) Class77 arg0, @OriginalArg(2) Class2_Sub18 arg1) {
		@Pc(14) int local14 = arg1.anInt3423;
		arg1.method2349(arg0.anInt3606);
		arg1.anInt3423 += Static62.aClass34_1.method1152(arg0.anInt3606, arg1.anInt3423, arg1.aByteArray39, 0, arg0.aByteArray46);
		return arg1.anInt3423 - local14;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!ke;ILclient!ke;)V")
	public static void method151(@OriginalArg(0) Class43 arg0, @OriginalArg(2) Class43 arg1) {
		Static80.aClass43_22 = arg0;
		Static130.aClass43_31 = arg1;
	}
}
