import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!br", name = "s", descriptor = "[Z")
	public static boolean[] aBooleanArray4;

	@OriginalMember(owner = "client!br", name = "l", descriptor = "[I")
	public static final int[] anIntArray48 = new int[3];

	@OriginalMember(owner = "client!br", name = "o", descriptor = "[Z")
	public static final boolean[] aBooleanArray3 = new boolean[8];

	@OriginalMember(owner = "client!br", name = "p", descriptor = "I")
	public static int anInt778 = 1;

	@OriginalMember(owner = "client!br", name = "u", descriptor = "[Lclient!ul;")
	public static final Class3_Sub7_Sub21[] aClass3_Sub7_Sub21Array1 = new Class3_Sub7_Sub21[14];

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(B)V")
	public static void method632() {
		if (Static343.aBoolean448) {
			return;
		}
		Static334.method5494(Static177.aClass45ArrayArrayArray1);
		if (Static321.aClass45ArrayArrayArray3 != null) {
			Static334.method5494(Static321.aClass45ArrayArrayArray3);
		}
		Static343.aBoolean448 = true;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(ILclient!tj;J)V")
	public static void method633(@OriginalArg(1) Class122 arg0, @OriginalArg(2) long arg1) {
		Static300.anInt5965 = Static137.anInt2561;
		Static224.anInt4583 = 0;
		Static137.anInt2561 = 0;
		@Pc(14) long local14 = Static53.method898();
		for (@Pc(19) Class8_Sub5 local19 = (Class8_Sub5) Static223.aClass65_7.method1462(); local19 != null; local19 = (Class8_Sub5) Static223.aClass65_7.method1461()) {
			if (local19.method3578(arg0, arg1)) {
				Static224.anInt4583++;
			}
		}
		if (Static71.aBoolean328 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static223.aClass65_7.method1457() + ", running: " + Static224.anInt4583 + ". Particles: " + Static137.anInt2561 + ". Time taken: " + (Static53.method898() - local14) + "ms");
		}
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(IIIIII)Z")
	public static boolean method634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static285.anIntArrayArrayArray11[arg0][local16][local20] == -Static287.anInt5782) {
						return false;
					}
				}
			}
			local20 = (arg1 << 7) + 1;
			@Pc(142) int local142 = (arg3 << 7) + 2;
			@Pc(151) int local151 = Static69.aClass22Array1[arg0].method4672(arg1, arg3) + arg5;
			if (!Static20.method420(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << 7) - 1;
			if (!Static20.method420(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << 7) - 1;
			if (!Static20.method420(local20, local151, local177)) {
				return false;
			} else if (Static20.method420(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static213.method3734(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static20.method420(local16 + 1, Static69.aClass22Array1[arg0].method4672(arg1, arg3) + arg5, local20 + 1) && Static20.method420(local16 + 128 - 1, Static69.aClass22Array1[arg0].method4672(arg1 + 1, arg3) + arg5, local20 + 1) && Static20.method420(local16 + 128 - 1, Static69.aClass22Array1[arg0].method4672(arg1 + 1, arg3 + 1) + arg5, local20 + 128 - 1) && Static20.method420(local16 + 1, Static69.aClass22Array1[arg0].method4672(arg1, arg3 + 1) + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(I[BIZIIIILclient!tj;[Lclient!ao;II)[I")
	public static int[] method636(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class122 arg7, @OriginalArg(9) Class13[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11 = (arg3 & 0x7) * 8;
		@Pc(22) int local22 = (arg10 & 0x7) * 8;
		@Pc(26) byte local26;
		if (arg2) {
			local26 = 1;
		} else {
			local26 = 4;
		}
		@Pc(38) int local38;
		@Pc(42) int local42;
		if (!arg2) {
			@Pc(36) Class13 local36 = arg8[arg5];
			for (local38 = 0; local38 < 8; local38++) {
				for (local42 = 0; local42 < 8; local42++) {
					@Pc(56) int local56 = Static29.method589(local42 & 0x7, local38 & 0x7, arg1) + arg9;
					@Pc(68) int local68 = Static81.method1276(arg1, local42 & 0x7, local38 & 0x7) + arg4;
					if (local56 > 0 && local56 < Static162.anInt2152 - 1 && local68 > 0 && local68 < Static122.anInt2632 - 1) {
						local36.method240(local56, local68);
					}
				}
			}
		}
		@Pc(109) Class3_Sub4 local109 = new Class3_Sub4(arg0);
		local38 = (arg3 & 0x1FFFFFF8) << 3;
		local42 = (arg10 & 0xFFFFFFF8) << 3;
		@Pc(123) byte local123 = 0;
		@Pc(125) byte local125 = 0;
		if (arg1 == 1) {
			local125 = 1;
		} else if (arg1 == 2) {
			local123 = 1;
			local125 = 1;
		} else if (arg1 == 3) {
			local123 = 1;
		}
		@Pc(219) int local219;
		@Pc(232) int local232;
		@Pc(267) int local267;
		@Pc(276) int local276;
		@Pc(290) int local290;
		@Pc(299) int local299;
		for (@Pc(152) int local152 = 0; local152 < local26; local152++) {
			for (@Pc(156) int local156 = 0; local156 < 64; local156++) {
				for (@Pc(160) int local160 = 0; local160 < 64; local160++) {
					if (arg6 != local152 || local11 > local156 || local11 + 8 < local156 || local160 < local22 || local22 + 8 < local160) {
						Static219.method3811(0, -1, local109, false, -1, 0, 0, 0, 0, 0, arg2);
					} else if (local156 == local11 + 8 || local22 + 8 == local160) {
						if (arg1 == 0) {
							local232 = arg4 + local160 - local22;
							local219 = arg9 + local156 - local11;
						} else if (arg1 == 1) {
							local232 = local11 + arg4 + 8 - local156;
							local219 = local160 + arg9 - local22;
						} else if (arg1 == 2) {
							local219 = local11 + arg9 + 8 - local156;
							local232 = local22 + arg4 + 8 - local160;
						} else {
							local219 = arg9 + local22 + 8 - local160;
							local232 = arg4 + local156 - local11;
						}
						Static219.method3811(local156 + local38, local232, local109, true, local219, 0, arg5, local42 + local160, 0, 0, arg2);
					} else {
						local219 = arg9 + Static29.method589(local160 & 0x7, local156 & 0x7, arg1);
						local232 = arg4 + Static81.method1276(arg1, local160 & 0x7, local156 & 0x7);
						Static219.method3811(local38 + local156, local232, local109, false, local219, arg1, arg5, local160 + local42, local123, local125, arg2);
						if (local156 == 63 || local160 == 63) {
							local267 = local156 == 63 ? 64 : local156;
							local276 = local160 == 63 ? 64 : local160;
							if (arg1 == 0) {
								local290 = arg9 + local267 - local11;
								local299 = arg4 + local276 - local22;
							} else if (arg1 == 1) {
								local290 = arg9 + local276 - local22;
								local299 = local11 + arg4 + 8 - local267;
							} else if (arg1 == 2) {
								local290 = local11 + arg9 + 8 - local267;
								local299 = arg4 + local22 + 8 - local276;
							} else {
								local299 = arg4 + local267 - local11;
								local290 = arg9 + local22 + 8 - local276;
							}
							if (local290 >= 0 && local290 < Static162.anInt2152 && local299 >= 0 && Static122.anInt2632 > local299) {
								Static105.anIntArrayArrayArray2[arg5][local290][local299] = Static105.anIntArrayArrayArray2[arg5][local219 + local123][local232 + local125];
							}
						}
					}
				}
			}
		}
		@Pc(524) boolean local524 = false;
		@Pc(638) int local638;
		@Pc(642) int local642;
		@Pc(676) int local676;
		while (local109.anInt4268 < local109.aByteArray70.length) {
			local219 = local109.method3643();
			if (local219 == 128) {
				Static103.anIntArray126[0] = local109.method3649();
				Static103.anIntArray126[1] = local109.method3622();
				Static103.anIntArray126[2] = local109.method3622();
				Static103.anIntArray126[3] = local109.method3622();
				local524 = true;
				Static103.anIntArray126[4] = local109.method3649();
			} else {
				if (local219 != 129) {
					local109.anInt4268--;
					break;
				}
				if (Static72.aByteArrayArrayArray1 == null) {
					Static72.aByteArrayArrayArray1 = new byte[4][][];
				}
				for (local232 = 0; local232 < 4; local232++) {
					@Pc(589) byte local589 = local109.method3621();
					if (local589 == 0 && Static72.aByteArrayArrayArray1[arg5] != null) {
						if (arg6 >= local232) {
							local276 = arg9;
							local290 = arg9 + 7;
							local299 = arg4;
							local638 = arg4 + 7;
							if (local290 < 0) {
								local290 = 0;
							} else if (local290 >= Static162.anInt2152) {
								local290 = Static162.anInt2152;
							}
							if (arg9 < 0) {
								local276 = 0;
							} else if (arg9 >= Static162.anInt2152) {
								local276 = Static162.anInt2152;
							}
							if (arg4 < 0) {
								local299 = 0;
							} else if (arg4 >= Static122.anInt2632) {
								local299 = Static122.anInt2632;
							}
							if (local638 < 0) {
								local638 = 0;
							} else if (Static122.anInt2632 <= local638) {
								local638 = Static122.anInt2632;
							}
							while (local276 < local290) {
								while (local299 < local638) {
									Static72.aByteArrayArrayArray1[arg5][local276][local299] = 0;
									local299++;
								}
								local276++;
							}
						}
					} else if (local589 == 1) {
						if (Static72.aByteArrayArrayArray1[arg5] == null) {
							Static72.aByteArrayArrayArray1[arg5] = new byte[Static162.anInt2152 + 1][Static122.anInt2632 + 1];
						}
						for (local276 = 0; local276 < 64; local276 += 4) {
							for (local290 = 0; local290 < 64; local290 += 4) {
								@Pc(629) byte local629 = local109.method3621();
								if (arg6 >= local232) {
									for (local638 = local276; local638 < local276 + 4; local638++) {
										for (local642 = local290; local642 < local290 + 4; local642++) {
											if (local11 <= local638 && local11 + 8 > local638 && local642 >= local22 && local22 < local22 + 8) {
												local676 = Static29.method589(local642 & 0x7, local638 & 0x7, arg1) + arg9;
												@Pc(689) int local689 = arg4 + Static81.method1276(arg1, local642 & 0x7, local638 & 0x7);
												if (local676 >= 0 && Static162.anInt2152 > local676 && local689 >= 0 && Static122.anInt2632 > local689) {
													Static72.aByteArrayArrayArray1[arg5][local676][local689] = local629;
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if (!arg2) {
			@Pc(887) Class184 local887 = null;
			while (true) {
				while (local109.aByteArray70.length > local109.anInt4268) {
					local232 = local109.method3643();
					if (local232 == 0) {
						local887 = new Class184(local109);
					} else if (local232 == 1) {
						local267 = local109.method3643();
						if (local267 > 0) {
							for (local276 = 0; local276 < local267; local276++) {
								@Pc(924) Class3_Sub13_Sub1 local924 = new Class3_Sub13_Sub1(local109);
								if (local924.anInt6678 == 31) {
									@Pc(934) Class176 local934 = Static137.method2084(local109.method3649());
									local924.method5602(local934.anInt5446, local934.anInt5447, local934.anInt5449, local934.anInt5454);
								}
								local299 = local924.anInt6662 >> 7;
								local638 = local924.anInt6666 >> 7;
								if (local924.anInt6672 == arg6 && local11 <= local299 && local299 < local11 + 8 && local22 <= local638 && local638 < local22 + 8) {
									local642 = Static110.method1882(local924.anInt6662 & 0x3FF, arg1, local924.anInt6666 & 0x3FF) + (arg9 << 7);
									local676 = Static216.method3751(local924.anInt6662 & 0x3FF, local924.anInt6666 & 0x3FF, arg1) + (arg4 << 7);
									local924.anInt6666 = local676;
									local924.anInt6662 = local642;
									local299 = local924.anInt6662 >> 7;
									local638 = local924.anInt6666 >> 7;
									if (local299 >= 0 && local638 >= 0 && Static162.anInt2152 > local299 && local638 < Static122.anInt2632) {
										local924.anInt6667 = Static105.anIntArrayArrayArray2[arg6][local299][local638] - local924.anInt6667;
										if (arg7.method4800() > 0) {
											Static271.method4583(local924);
										}
									}
								}
							}
						}
					} else if (local232 == 2) {
						if (local887 == null) {
							local887 = new Class184();
						}
						local887.method4955(local109);
					} else {
						throw new IllegalStateException();
					}
				}
				if (local887 != null) {
					Static26.method563(local887, arg4 >> 3, arg9 >> 3);
				}
				break;
			}
		}
		if (Static72.aByteArrayArrayArray1 != null && Static72.aByteArrayArrayArray1[arg5] != null) {
			local219 = arg9 + 7;
			local232 = arg4 + 7;
			for (local267 = arg9; local267 < local219; local267++) {
				for (local276 = arg4; local276 < local232; local276++) {
					Static72.aByteArrayArrayArray1[arg5][local267][local276] = 0;
				}
			}
		}
		if (local524) {
			return Static103.anIntArray126;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(III)I")
	public static int method637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(41) int local41 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local41;
		}
		return arg0;
	}
}
