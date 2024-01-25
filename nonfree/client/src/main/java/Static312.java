import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "[I")
	public static final int[] anIntArray593 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!sf", name = "k", descriptor = "[[I")
	public static final int[][] anIntArrayArray49 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
	public static int anInt5392 = 0;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
	public static void method4793() {
		if (Static145.anIntArray290 != null) {
			return;
		}
		Static145.anIntArray290 = new int[65536];
		@Pc(20) double local20 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(29) int local29 = 0; local29 < 65536; local29++) {
			@Pc(43) double local43 = (double) (local29 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(54) double local54 = (double) (local29 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(61) double local61 = (double) (local29 & 0x7F) / 128.0D;
			@Pc(63) double local63 = local61;
			@Pc(65) double local65 = local61;
			@Pc(67) double local67 = local61;
			if (local54 != 0.0D) {
				@Pc(84) double local84;
				if (local61 < 0.5D) {
					local84 = (local54 + 1.0D) * local61;
				} else {
					local84 = local54 + local61 - local54 * local61;
				}
				@Pc(98) double local98 = local61 * 2.0D - local84;
				@Pc(102) double local102 = local43 + 0.3333333333333333D;
				if (local102 > 1.0D) {
					local102--;
				}
				@Pc(116) double local116 = local43 - 0.3333333333333333D;
				if (local43 * 6.0D < 1.0D) {
					local65 = local98 + local43 * 6.0D * (local84 - local98);
				} else if (local43 * 2.0D < 1.0D) {
					local65 = local84;
				} else if (local43 * 3.0D < 2.0D) {
					local65 = local98 + (0.6666666666666666D - local43) * (-local98 + local84) * 6.0D;
				} else {
					local65 = local98;
				}
				if (local116 < 0.0D) {
					local116++;
				}
				if (local102 * 6.0D < 1.0D) {
					local63 = local98 + (local84 - local98) * 6.0D * local102;
				} else if (local102 * 2.0D < 1.0D) {
					local63 = local84;
				} else if (local102 * 3.0D < 2.0D) {
					local63 = local98 + (0.6666666666666666D - local102) * 6.0D * (local84 - local98);
				} else {
					local63 = local98;
				}
				if (local116 * 6.0D < 1.0D) {
					local67 = local116 * 6.0D * (local84 - local98) + local98;
				} else if (local116 * 2.0D < 1.0D) {
					local67 = local84;
				} else if (local116 * 3.0D < 2.0D) {
					local67 = (0.6666666666666666D - local116) * 6.0D * (local84 - local98) + local98;
				} else {
					local67 = local98;
				}
			}
			local63 = Math.pow(local63, local20);
			local65 = Math.pow(local65, local20);
			local67 = Math.pow(local67, local20);
			@Pc(298) int local298 = (int) (local63 * 256.0D);
			@Pc(303) int local303 = (int) (local65 * 256.0D);
			@Pc(308) int local308 = (int) (local67 * 256.0D);
			@Pc(318) int local318 = local308 + (local303 << 8) + (local298 << 16);
			Static145.anIntArray290[local29] = local318;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILclient!mj;IIII)Ljava/awt/Frame;")
	public static Frame method4796(@OriginalArg(0) int arg0, @OriginalArg(1) Class156 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!arg1.method3661()) {
			return null;
		}
		@Pc(17) Class5[] local17 = Static155.method2391(arg1);
		if (local17 == null) {
			return null;
		}
		@Pc(23) boolean local23 = false;
		for (@Pc(25) int local25 = 0; local25 < local17.length; local25++) {
			if (local17[local25].anInt115 == arg2 && local17[local25].anInt116 == arg3 && (!local23 || arg0 < local17[local25].anInt112)) {
				arg0 = local17[local25].anInt112;
				local23 = true;
			}
		}
		if (!local23) {
			return null;
		}
		@Pc(98) Class133 local98 = arg1.method3641(arg2, arg3, arg0);
		while (local98.anInt3257 == 0) {
			Static37.method613(10L);
		}
		@Pc(113) Frame local113 = (Frame) local98.anObject3;
		if (local113 == null) {
			return null;
		} else if (local98.anInt3257 == 2) {
			Static20.method223(local113, arg1);
			return null;
		} else {
			return local113;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!bj;I)V")
	public static void method4797(@OriginalArg(0) Class28_Sub1_Sub1 arg0) {
		arg0.aBoolean337 = false;
		@Pc(18) Class177 local18;
		if (arg0.anInt4333 != -1) {
			local18 = Static176.aClass43_2.method930(arg0.anInt4333);
			if (local18 == null || local18.anIntArray499 == null) {
				arg0.aBoolean340 = false;
				arg0.anInt4333 = -1;
			} else {
				label297: {
					arg0.anInt4352++;
					if (arg0.anInt4316 < local18.anIntArray499.length && local18.anIntArray501[arg0.anInt4316] < arg0.anInt4352) {
						arg0.anInt4352 = 1;
						arg0.anInt4316++;
						arg0.anInt4338++;
						Static351.method2911(arg0.aByte73, arg0.anInt5774, arg0.anInt4316, local18, arg0.anInt5766, arg0 == Static226.aClass28_Sub1_Sub1_Sub2_2);
					}
					if (local18.anIntArray499.length <= arg0.anInt4316) {
						arg0.anInt4316 = 0;
						arg0.anInt4352 = 0;
						if (arg0.aBoolean340) {
							arg0.anInt4333 = arg0.method4014().method618();
							if (arg0.anInt4333 == -1) {
								arg0.aBoolean340 = false;
								break label297;
							}
							local18 = Static176.aClass43_2.method930(arg0.anInt4333);
						}
						Static351.method2911(arg0.aByte73, arg0.anInt5774, arg0.anInt4316, local18, arg0.anInt5766, arg0 == Static226.aClass28_Sub1_Sub1_Sub2_2);
					}
					arg0.anInt4338 = arg0.anInt4316 + 1;
					if (arg0.anInt4338 >= local18.anIntArray499.length) {
						arg0.anInt4338 = 0;
					}
				}
			}
		}
		@Pc(192) Class177 local192;
		if (arg0.anInt4367 != -1 && Static76.anInt1617 >= arg0.anInt4329) {
			@Pc(175) Class125 local175 = Static224.aClass203_2.method4559(arg0.anInt4367);
			@Pc(178) int local178 = local175.anInt3050;
			if (local178 == -1) {
				arg0.anInt4367 = -1;
			} else {
				label299: {
					local192 = Static176.aClass43_2.method930(local178);
					if (local175.aBoolean236) {
						if (local192.anInt4517 == 3) {
							if (arg0.anInt4375 > 0 && arg0.anInt4339 <= Static76.anInt1617 && Static76.anInt1617 > arg0.anInt4368) {
								arg0.anInt4367 = -1;
								break label299;
							}
						} else if (local192.anInt4517 == 1 && arg0.anInt4375 > 0 && arg0.anInt4339 <= Static76.anInt1617 && Static76.anInt1617 > arg0.anInt4368) {
							arg0.anInt4329 = Static76.anInt1617 + 1;
							break label299;
						}
					}
					if (local192 == null || local192.anIntArray499 == null) {
						arg0.anInt4367 = -1;
					} else {
						if (arg0.anInt4351 < 0) {
							arg0.anInt4351 = 0;
							Static351.method2911(arg0.aByte73, arg0.anInt5774, 0, local192, arg0.anInt5766, arg0 == Static226.aClass28_Sub1_Sub1_Sub2_2);
						}
						arg0.anInt4361++;
						if (local192.anIntArray499.length > arg0.anInt4351 && arg0.anInt4361 > local192.anIntArray501[arg0.anInt4351]) {
							arg0.anInt4351++;
							arg0.anInt4361 = 1;
							Static351.method2911(arg0.aByte73, arg0.anInt5774, arg0.anInt4351, local192, arg0.anInt5766, Static226.aClass28_Sub1_Sub1_Sub2_2 == arg0);
						}
						if (local192.anIntArray499.length <= arg0.anInt4351) {
							if (local175.aBoolean236) {
								arg0.anInt4351 -= local192.anInt4497;
								arg0.anInt4343++;
								if (arg0.anInt4343 >= local192.anInt4514) {
									arg0.anInt4367 = -1;
								} else if (arg0.anInt4351 >= 0 && local192.anIntArray499.length > arg0.anInt4351) {
									Static351.method2911(arg0.aByte73, arg0.anInt5774, arg0.anInt4351, local192, arg0.anInt5766, arg0 == Static226.aClass28_Sub1_Sub1_Sub2_2);
								} else {
									arg0.anInt4367 = -1;
								}
							} else {
								arg0.anInt4367 = -1;
							}
						}
						arg0.anInt4341 = arg0.anInt4351 + 1;
						if (local192.anIntArray499.length <= arg0.anInt4341) {
							if (local175.aBoolean236) {
								arg0.anInt4341 -= local192.anInt4497;
								if (arg0.anInt4343 + 1 >= local192.anInt4514) {
									arg0.anInt4341 = -1;
								} else if (arg0.anInt4341 < 0 || local192.anIntArray499.length <= arg0.anInt4341) {
									arg0.anInt4341 = -1;
								}
							} else {
								arg0.anInt4341 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt4314 != -1 && arg0.anInt4327 <= 1) {
			local18 = Static176.aClass43_2.method930(arg0.anInt4314);
			if (local18.anInt4517 == 3) {
				if (arg0.anInt4375 > 0 && arg0.anInt4339 <= Static76.anInt1617 && Static76.anInt1617 > arg0.anInt4368) {
					arg0.anInt4314 = -1;
				}
			} else if (local18.anInt4517 == 1 && arg0.anInt4375 > 0 && Static76.anInt1617 >= arg0.anInt4339 && Static76.anInt1617 > arg0.anInt4368) {
				arg0.anInt4327 = 2;
			}
		}
		if (arg0.anInt4314 != -1 && arg0.anInt4327 == 0) {
			local18 = Static176.aClass43_2.method930(arg0.anInt4314);
			if (local18 == null || local18.anIntArray499 == null) {
				arg0.anInt4314 = -1;
			} else {
				arg0.anInt4363++;
				if (arg0.anInt4356 < local18.anIntArray499.length && local18.anIntArray501[arg0.anInt4356] < arg0.anInt4363) {
					arg0.anInt4363 = 1;
					arg0.anInt4356++;
					Static351.method2911(arg0.aByte73, arg0.anInt5774, arg0.anInt4356, local18, arg0.anInt5766, Static226.aClass28_Sub1_Sub1_Sub2_2 == arg0);
				}
				if (arg0.anInt4356 >= local18.anIntArray499.length) {
					arg0.anInt4315++;
					arg0.anInt4356 -= local18.anInt4497;
					if (arg0.anInt4315 >= local18.anInt4514) {
						arg0.anInt4314 = -1;
					} else if (arg0.anInt4356 >= 0 && arg0.anInt4356 < local18.anIntArray499.length) {
						Static351.method2911(arg0.aByte73, arg0.anInt5774, arg0.anInt4356, local18, arg0.anInt5766, Static226.aClass28_Sub1_Sub1_Sub2_2 == arg0);
					} else {
						arg0.anInt4314 = -1;
					}
				}
				arg0.anInt4317 = arg0.anInt4356 + 1;
				if (arg0.anInt4317 >= local18.anIntArray499.length) {
					arg0.anInt4317 -= local18.anInt4497;
					if (local18.anInt4514 <= arg0.anInt4315 + 1) {
						arg0.anInt4317 = -1;
					} else if (arg0.anInt4317 < 0 || arg0.anInt4317 >= local18.anIntArray499.length) {
						arg0.anInt4317 = -1;
					}
				}
				arg0.aBoolean337 = local18.aBoolean350;
			}
		}
		if (arg0.anInt4327 > 0) {
			arg0.anInt4327--;
		}
		for (@Pc(724) int local724 = 0; local724 < arg0.aClass81Array3.length; local724++) {
			@Pc(731) Class81 local731 = arg0.aClass81Array3[local724];
			if (local731 != null) {
				if (local731.anInt2043 > 0) {
					local731.anInt2043--;
				} else {
					local192 = Static176.aClass43_2.method930(local731.anInt2042);
					if (local192 == null || local192.anIntArray499 == null) {
						arg0.aClass81Array3[local724] = null;
					} else {
						local731.anInt2041++;
						if (local192.anIntArray499.length > local731.anInt2045 && local731.anInt2041 > local192.anIntArray501[local731.anInt2045]) {
							local731.anInt2041 = 1;
							local731.anInt2045++;
							Static351.method2911(arg0.aByte73, arg0.anInt5774, local731.anInt2045, local192, arg0.anInt5766, Static226.aClass28_Sub1_Sub1_Sub2_2 == arg0);
						}
						if (local192.anIntArray499.length <= local731.anInt2045) {
							local731.anInt2045 -= local192.anInt4497;
							local731.anInt2040++;
							if (local192.anInt4514 <= local731.anInt2040) {
								arg0.aClass81Array3[local724] = null;
							} else if (local731.anInt2045 >= 0 && local731.anInt2045 < local192.anIntArray499.length) {
								Static351.method2911(arg0.aByte73, arg0.anInt5774, local731.anInt2045, local192, arg0.anInt5766, arg0 == Static226.aClass28_Sub1_Sub1_Sub2_2);
							} else {
								arg0.aClass81Array3[local724] = null;
							}
						}
						local731.anInt2046 = local731.anInt2045 + 1;
						if (local731.anInt2046 >= local192.anIntArray499.length) {
							local731.anInt2046 -= local192.anInt4497;
							if (local731.anInt2040 + 1 >= local192.anInt4514) {
								local731.anInt2046 = -1;
							} else if (local731.anInt2046 < 0 || local731.anInt2046 >= local192.anIntArray499.length) {
								local731.anInt2046 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIB)I")
	public static int method4798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static22.anIntArray34[arg0 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!dt;B)Z")
	public static boolean method4801(@OriginalArg(0) Class62 arg0) {
		if (Static310.anInt5346 == arg0.anInt1572) {
			Static29.anInt4374 = 250;
			return true;
		} else {
			return false;
		}
	}
}
