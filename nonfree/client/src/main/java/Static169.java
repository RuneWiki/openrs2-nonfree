import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!im", name = "w", descriptor = "[[I")
	public static final int[][] anIntArrayArray38 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(BLclient!kk;)V")
	public static void method2681(@OriginalArg(1) Class31_Sub2_Sub1 arg0) {
		arg0.aBoolean507 = false;
		@Pc(18) Class223 local18;
		if (arg0.anInt7338 != -1) {
			local18 = Static293.aClass127_1.method2975(arg0.anInt7338);
			if (local18 == null || local18.anIntArray557 == null) {
				arg0.anInt7338 = -1;
				arg0.aBoolean505 = false;
			} else {
				label394: {
					arg0.anInt7334++;
					if (local18.anIntArray557.length > arg0.anInt7335 && arg0.anInt7334 > local18.anIntArray559[arg0.anInt7335]) {
						arg0.anInt7334 = 1;
						arg0.anInt7335++;
						arg0.anInt7370++;
						Static172.method2762(local18, arg0.anInt7300, Static452.aClass31_Sub2_Sub1_Sub1_2 == arg0, arg0.anInt7335, arg0.aByte100, arg0.anInt7298);
					}
					if (local18.anIntArray557.length <= arg0.anInt7335) {
						arg0.anInt7334 = 0;
						arg0.anInt7335 = 0;
						if (arg0.aBoolean505) {
							arg0.anInt7338 = arg0.method5982().method573();
							if (arg0.anInt7338 == -1) {
								arg0.aBoolean505 = false;
								break label394;
							}
							local18 = Static293.aClass127_1.method2975(arg0.anInt7338);
						}
						Static172.method2762(local18, arg0.anInt7300, arg0 == Static452.aClass31_Sub2_Sub1_Sub1_2, arg0.anInt7335, arg0.aByte100, arg0.anInt7298);
					}
					arg0.anInt7370 = arg0.anInt7335 + 1;
					if (local18.anIntArray557.length <= arg0.anInt7370) {
						arg0.anInt7370 = 0;
					}
				}
			}
		}
		@Pc(185) int local185;
		@Pc(199) Class223 local199;
		@Pc(182) Class38 local182;
		if (arg0.anInt7321 != -1 && arg0.anInt7316 <= Static378.anInt4244) {
			local182 = Static67.aClass263_2.method5782(arg0.anInt7321);
			local185 = local182.anInt1014;
			if (local185 == -1) {
				arg0.anInt7321 = -1;
			} else {
				label396: {
					local199 = Static293.aClass127_1.method2975(local185);
					if (local182.aBoolean50) {
						if (local199.anInt6048 == 3) {
							if (arg0.anInt7379 > 0 && Static378.anInt4244 >= arg0.anInt7351 && arg0.anInt7312 < Static378.anInt4244) {
								arg0.anInt7321 = -1;
								break label396;
							}
						} else if (local199.anInt6048 == 1 && arg0.anInt7379 > 0 && arg0.anInt7351 <= Static378.anInt4244 && Static378.anInt4244 > arg0.anInt7312) {
							arg0.anInt7316 = Static378.anInt4244 + 1;
							break label396;
						}
					}
					if (local199 == null || local199.anIntArray557 == null) {
						arg0.anInt7321 = -1;
					} else {
						if (arg0.anInt7357 < 0) {
							arg0.anInt7357 = 0;
							Static172.method2762(local199, arg0.anInt7300, arg0 == Static452.aClass31_Sub2_Sub1_Sub1_2, 0, arg0.aByte100, arg0.anInt7298);
						}
						arg0.anInt7314++;
						if (arg0.anInt7357 < local199.anIntArray557.length && arg0.anInt7314 > local199.anIntArray559[arg0.anInt7357]) {
							arg0.anInt7314 = 1;
							arg0.anInt7357++;
							Static172.method2762(local199, arg0.anInt7300, Static452.aClass31_Sub2_Sub1_Sub1_2 == arg0, arg0.anInt7357, arg0.aByte100, arg0.anInt7298);
						}
						if (arg0.anInt7357 >= local199.anIntArray557.length) {
							if (local182.aBoolean50) {
								arg0.anInt7347++;
								arg0.anInt7357 -= local199.anInt6055;
								if (arg0.anInt7347 >= local199.anInt6044) {
									arg0.anInt7321 = -1;
								} else if (arg0.anInt7357 >= 0 && local199.anIntArray557.length > arg0.anInt7357) {
									Static172.method2762(local199, arg0.anInt7300, arg0 == Static452.aClass31_Sub2_Sub1_Sub1_2, arg0.anInt7357, arg0.aByte100, arg0.anInt7298);
								} else {
									arg0.anInt7321 = -1;
								}
							} else {
								arg0.anInt7321 = -1;
							}
						}
						arg0.anInt7367 = arg0.anInt7357 + 1;
						if (local199.anIntArray557.length <= arg0.anInt7367) {
							if (local182.aBoolean50) {
								arg0.anInt7367 -= local199.anInt6055;
								if (arg0.anInt7347 + 1 >= local199.anInt6044) {
									arg0.anInt7367 = -1;
								} else if (arg0.anInt7367 < 0 || local199.anIntArray557.length <= arg0.anInt7367) {
									arg0.anInt7367 = -1;
								}
							} else {
								arg0.anInt7367 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt7368 != -1 && arg0.anInt7342 <= Static378.anInt4244) {
			local182 = Static67.aClass263_2.method5782(arg0.anInt7368);
			local185 = local182.anInt1014;
			if (local185 == -1) {
				arg0.anInt7368 = -1;
			} else {
				label399: {
					local199 = Static293.aClass127_1.method2975(local185);
					if (local182.aBoolean50) {
						if (local199.anInt6048 == 3) {
							if (arg0.anInt7379 > 0 && arg0.anInt7351 <= Static378.anInt4244 && Static378.anInt4244 > arg0.anInt7312) {
								arg0.anInt7368 = -1;
								break label399;
							}
						} else if (local199.anInt6048 == 1 && arg0.anInt7379 > 0 && Static378.anInt4244 >= arg0.anInt7351 && arg0.anInt7312 < Static378.anInt4244) {
							arg0.anInt7342 = Static378.anInt4244 + 1;
							break label399;
						}
					}
					if (local199 == null || local199.anIntArray557 == null) {
						arg0.anInt7368 = -1;
					} else {
						if (arg0.anInt7371 < 0) {
							arg0.anInt7371 = 0;
							Static172.method2762(local199, arg0.anInt7300, Static452.aClass31_Sub2_Sub1_Sub1_2 == arg0, 0, arg0.aByte100, arg0.anInt7298);
						}
						arg0.anInt7315++;
						if (local199.anIntArray557.length > arg0.anInt7371 && arg0.anInt7315 > local199.anIntArray559[arg0.anInt7371]) {
							arg0.anInt7371++;
							arg0.anInt7315 = 1;
							Static172.method2762(local199, arg0.anInt7300, arg0 == Static452.aClass31_Sub2_Sub1_Sub1_2, arg0.anInt7371, arg0.aByte100, arg0.anInt7298);
						}
						if (arg0.anInt7371 >= local199.anIntArray557.length) {
							if (local182.aBoolean50) {
								arg0.anInt7363++;
								arg0.anInt7371 -= local199.anInt6055;
								if (local199.anInt6044 <= arg0.anInt7363) {
									arg0.anInt7368 = -1;
								} else if (arg0.anInt7371 >= 0 && local199.anIntArray557.length > arg0.anInt7371) {
									Static172.method2762(local199, arg0.anInt7300, arg0 == Static452.aClass31_Sub2_Sub1_Sub1_2, arg0.anInt7371, arg0.aByte100, arg0.anInt7298);
								} else {
									arg0.anInt7368 = -1;
								}
							} else {
								arg0.anInt7368 = -1;
							}
						}
						arg0.anInt7356 = arg0.anInt7371 + 1;
						if (local199.anIntArray557.length <= arg0.anInt7356) {
							if (local182.aBoolean50) {
								arg0.anInt7356 -= local199.anInt6055;
								if (local199.anInt6044 <= arg0.anInt7363 + 1) {
									arg0.anInt7356 = -1;
								} else if (arg0.anInt7356 < 0 || local199.anIntArray557.length <= arg0.anInt7356) {
									arg0.anInt7356 = -1;
								}
							} else {
								arg0.anInt7356 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt7365 != -1 && arg0.anInt7323 <= 1) {
			local18 = Static293.aClass127_1.method2975(arg0.anInt7365);
			if (local18.anInt6048 == 3) {
				if (arg0.anInt7379 > 0 && arg0.anInt7351 <= Static378.anInt4244 && Static378.anInt4244 > arg0.anInt7312) {
					arg0.anInt7365 = -1;
				}
			} else if (local18.anInt6048 == 1 && arg0.anInt7379 > 0 && Static378.anInt4244 >= arg0.anInt7351 && Static378.anInt4244 > arg0.anInt7312) {
				arg0.anInt7323 = 2;
			}
		}
		if (arg0.anInt7365 != -1 && arg0.anInt7323 == 0) {
			local18 = Static293.aClass127_1.method2975(arg0.anInt7365);
			if (local18 == null || local18.anIntArray557 == null) {
				arg0.anInt7365 = -1;
			} else {
				arg0.anInt7320++;
				if (local18.anIntArray557.length > arg0.anInt7350 && local18.anIntArray559[arg0.anInt7350] < arg0.anInt7320) {
					arg0.anInt7350++;
					arg0.anInt7320 = 1;
					Static172.method2762(local18, arg0.anInt7300, arg0 == Static452.aClass31_Sub2_Sub1_Sub1_2, arg0.anInt7350, arg0.aByte100, arg0.anInt7298);
				}
				if (arg0.anInt7350 >= local18.anIntArray557.length) {
					arg0.anInt7354++;
					arg0.anInt7350 -= local18.anInt6055;
					if (local18.anInt6044 <= arg0.anInt7354) {
						arg0.anInt7365 = -1;
					} else if (arg0.anInt7350 >= 0 && local18.anIntArray557.length > arg0.anInt7350) {
						Static172.method2762(local18, arg0.anInt7300, arg0 == Static452.aClass31_Sub2_Sub1_Sub1_2, arg0.anInt7350, arg0.aByte100, arg0.anInt7298);
					} else {
						arg0.anInt7365 = -1;
					}
				}
				arg0.anInt7317 = arg0.anInt7350 + 1;
				if (arg0.anInt7317 >= local18.anIntArray557.length) {
					arg0.anInt7317 -= local18.anInt6055;
					if (arg0.anInt7354 + 1 >= local18.anInt6044) {
						arg0.anInt7317 = -1;
					} else if (arg0.anInt7317 < 0 || arg0.anInt7317 >= local18.anIntArray557.length) {
						arg0.anInt7317 = -1;
					}
				}
				arg0.aBoolean507 = local18.aBoolean420;
			}
		}
		if (arg0.anInt7323 > 0) {
			arg0.anInt7323--;
		}
		for (@Pc(1085) int local1085 = 0; local1085 < arg0.aClass225Array3.length; local1085++) {
			@Pc(1092) Class225 local1092 = arg0.aClass225Array3[local1085];
			if (local1092 != null) {
				if (local1092.anInt6085 > 0) {
					local1092.anInt6085--;
				} else {
					local199 = Static293.aClass127_1.method2975(local1092.anInt6081);
					if (local199 == null || local199.anIntArray557 == null) {
						arg0.aClass225Array3[local1085] = null;
					} else {
						local1092.anInt6087++;
						if (local199.anIntArray557.length > local1092.anInt6088 && local199.anIntArray559[local1092.anInt6088] < local1092.anInt6087) {
							local1092.anInt6088++;
							local1092.anInt6087 = 1;
							Static172.method2762(local199, arg0.anInt7300, arg0 == Static452.aClass31_Sub2_Sub1_Sub1_2, local1092.anInt6088, arg0.aByte100, arg0.anInt7298);
						}
						if (local199.anIntArray557.length <= local1092.anInt6088) {
							local1092.anInt6088 -= local199.anInt6055;
							local1092.anInt6083++;
							if (local1092.anInt6083 >= local199.anInt6044) {
								arg0.aClass225Array3[local1085] = null;
							} else if (local1092.anInt6088 >= 0 && local199.anIntArray557.length > local1092.anInt6088) {
								Static172.method2762(local199, arg0.anInt7300, arg0 == Static452.aClass31_Sub2_Sub1_Sub1_2, local1092.anInt6088, arg0.aByte100, arg0.anInt7298);
							} else {
								arg0.aClass225Array3[local1085] = null;
							}
						}
						local1092.anInt6082 = local1092.anInt6088 + 1;
						if (local1092.anInt6082 >= local199.anIntArray557.length) {
							local1092.anInt6082 -= local199.anInt6055;
							if (local199.anInt6044 <= local1092.anInt6083 + 1) {
								local1092.anInt6082 = -1;
							} else if (local1092.anInt6082 < 0 || local1092.anInt6082 >= local199.anIntArray557.length) {
								local1092.anInt6082 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IZI)Z")
	public static boolean method2682(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!ya;)V")
	public static void method2683(@OriginalArg(0) Class39 arg0) {
		for (@Pc(1) int local1 = Static378.anInt4251; local1 < Static68.anInt1553; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static132.anInt2639; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static87.anInt1875; local7++) {
					@Pc(16) Class80 local16 = client.lb[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class31_Sub3 local21 = local16.aClass31_Sub3_3;
						@Pc(24) Class31_Sub3 local24 = local16.aClass31_Sub3_2;
						if (local21 != null && local21.method5971()) {
							Static60.method1285(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method5971()) {
								Static60.method1285(arg0, local24, local1, local4, local7, 1, 1);
								local24.method5972(0, arg0, 0, local21, 0, false);
								local24.method5970();
							}
							local21.method5970();
						}
						for (@Pc(70) Class22 local70 = local16.aClass22_2; local70 != null; local70 = local70.aClass22_1) {
							@Pc(74) Class31_Sub2 local74 = local70.aClass31_Sub2_1;
							if (local74 != null && local74.method5971()) {
								Static60.method1285(arg0, local74, local1, local4, local7, local74.aShort100 + 1 - local74.aShort103, local74.aShort101 - local74.aShort102 + 1);
								local74.method5970();
							}
						}
						@Pc(111) Class31_Sub1 local111 = local16.aClass31_Sub1_2;
						if (local111 != null && local111.method5971()) {
							Static94.method1691(arg0, local111, local1, local4, local7);
							local111.method5970();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "()V")
	public static void method2684() {
		Static212.anInt3976 = 0;
		label208: for (@Pc(3) int local3 = 0; local3 < Static397.anInt6372; local3++) {
			@Pc(8) Class128 local8 = Static85.aClass128Array1[local3];
			@Pc(12) int local12;
			if (Static227.anIntArray338 != null) {
				for (local12 = 0; local12 < Static227.anIntArray338.length; local12++) {
					if (Static227.anIntArray338[local12] != -1000000 && (local8.anInt3445 <= Static227.anIntArray338[local12] || local8.anInt3446 <= Static227.anIntArray338[local12]) && (local8.anInt3436 <= Static20.anIntArray435[local12] || local8.anInt3438 <= Static20.anIntArray435[local12]) && (local8.anInt3436 >= Static61.anIntArray95[local12] || local8.anInt3438 >= Static61.anIntArray95[local12]) && (local8.anInt3440 <= Static39.anIntArray63[local12] || local8.anInt3448 <= Static39.anIntArray63[local12]) && (local8.anInt3440 >= Static274.anIntArray425[local12] || local8.anInt3448 >= Static274.anIntArray425[local12])) {
						continue label208;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(128) int local128;
			@Pc(164) int local164;
			@Pc(143) boolean local143;
			if (local8.anInt3443 == 1) {
				local12 = local8.anInt3434 + Static75.anInt1695 - Static398.anInt6395;
				if (local12 >= 0 && local12 <= Static75.anInt1695 + Static75.anInt1695) {
					local110 = local8.anInt3447 + Static75.anInt1695 - Static350.anInt5829;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static75.anInt1695 + Static75.anInt1695) {
						continue;
					}
					local128 = local8.anInt3442 + Static75.anInt1695 - Static350.anInt5829;
					if (local128 > Static75.anInt1695 + Static75.anInt1695) {
						local128 = Static75.anInt1695 + Static75.anInt1695;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static23.aBooleanArrayArray4[local12][local110++]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static396.anInt6364 - local8.anInt3436;
						if (local164 > Static160.anInt3003) {
							local8.anInt3450 = 1;
						} else {
							if (local164 >= -Static160.anInt3003) {
								continue;
							}
							local8.anInt3450 = 2;
							local164 = -local164;
						}
						local8.anInt3433 = (local8.anInt3440 - Static263.anInt4683 << 8) / local164;
						local8.anInt3439 = (local8.anInt3448 - Static263.anInt4683 << 8) / local164;
						local8.anInt3441 = (local8.anInt3445 - Static146.anInt2808 << 8) / local164;
						local8.anInt3449 = (local8.anInt3446 - Static146.anInt2808 << 8) / local164;
						Static303.aClass128Array2[Static212.anInt3976++] = local8;
					}
				}
			} else if (local8.anInt3443 == 2) {
				local12 = local8.anInt3447 + Static75.anInt1695 - Static350.anInt5829;
				if (local12 >= 0 && local12 <= Static75.anInt1695 + Static75.anInt1695) {
					local110 = local8.anInt3434 + Static75.anInt1695 - Static398.anInt6395;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static75.anInt1695 + Static75.anInt1695) {
						continue;
					}
					local128 = local8.anInt3452 + Static75.anInt1695 - Static398.anInt6395;
					if (local128 > Static75.anInt1695 + Static75.anInt1695) {
						local128 = Static75.anInt1695 + Static75.anInt1695;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static23.aBooleanArrayArray4[local110++][local12]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static263.anInt4683 - local8.anInt3440;
						if (local164 > Static160.anInt3003) {
							local8.anInt3450 = 3;
						} else {
							if (local164 >= -Static160.anInt3003) {
								continue;
							}
							local8.anInt3450 = 4;
							local164 = -local164;
						}
						local8.anInt3444 = (local8.anInt3436 - Static396.anInt6364 << 8) / local164;
						local8.anInt3432 = (local8.anInt3438 - Static396.anInt6364 << 8) / local164;
						local8.anInt3441 = (local8.anInt3445 - Static146.anInt2808 << 8) / local164;
						local8.anInt3449 = (local8.anInt3446 - Static146.anInt2808 << 8) / local164;
						Static303.aClass128Array2[Static212.anInt3976++] = local8;
					}
				}
			} else if (local8.anInt3443 == 4) {
				local12 = local8.anInt3445 - Static146.anInt2808;
				if (local12 > Static332.anInt5657) {
					local110 = local8.anInt3447 + Static75.anInt1695 - Static350.anInt5829;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static75.anInt1695 + Static75.anInt1695) {
						continue;
					}
					local128 = local8.anInt3442 + Static75.anInt1695 - Static350.anInt5829;
					if (local128 > Static75.anInt1695 + Static75.anInt1695) {
						local128 = Static75.anInt1695 + Static75.anInt1695;
					} else if (local128 < 0) {
						continue;
					}
					@Pc(435) int local435 = local8.anInt3434 + Static75.anInt1695 - Static398.anInt6395;
					if (local435 < 0) {
						local435 = 0;
					} else if (local435 > Static75.anInt1695 + Static75.anInt1695) {
						continue;
					}
					local164 = local8.anInt3452 + Static75.anInt1695 - Static398.anInt6395;
					if (local164 > Static75.anInt1695 + Static75.anInt1695) {
						local164 = Static75.anInt1695 + Static75.anInt1695;
					} else if (local164 < 0) {
						continue;
					}
					@Pc(468) boolean local468 = false;
					label180: for (@Pc(470) int local470 = local435; local470 <= local164; local470++) {
						for (@Pc(473) int local473 = local110; local473 <= local128; local473++) {
							if (Static23.aBooleanArrayArray4[local470][local473]) {
								local468 = true;
								break label180;
							}
						}
					}
					if (local468) {
						local8.anInt3450 = 5;
						local8.anInt3444 = (local8.anInt3436 - Static396.anInt6364 << 8) / local12;
						local8.anInt3432 = (local8.anInt3438 - Static396.anInt6364 << 8) / local12;
						local8.anInt3433 = (local8.anInt3440 - Static263.anInt4683 << 8) / local12;
						local8.anInt3439 = (local8.anInt3448 - Static263.anInt4683 << 8) / local12;
						Static303.aClass128Array2[Static212.anInt3976++] = local8;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V")
	public static void method2685() {
		if (Static388.aBoolean439) {
			return;
		}
		Static84.aBoolean109 = true;
		Static388.aBoolean439 = true;
		if (Static38.aClass135_Sub1_1.aBoolean362) {
			Static201.aFloat56 = (int) Static201.aFloat56 - 17 & 0xFFFFFFF0;
		} else {
			Static316.aFloat76 += (-Static316.aFloat76 - 12.0F) / 2.0F;
		}
	}
}
