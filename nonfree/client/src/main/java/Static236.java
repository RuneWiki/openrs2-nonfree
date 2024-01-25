import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!iq", name = "bb", descriptor = "Lclient!vc;")
	public static Class2_Sub49 aClass2_Sub49_1;

	@OriginalMember(owner = "client!iq", name = "db", descriptor = "Lclient!rba;")
	public static Class292 aClass292_2;

	@OriginalMember(owner = "client!iq", name = "K", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_64 = new Class349(14, 3);

	@OriginalMember(owner = "client!iq", name = "ab", descriptor = "I")
	public static int anInt3929 = -50;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIIZ)I")
	public static int method3367(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) Class2_Sub16 local10 = Static261.method3663(arg1, arg2);
		if (local10 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(21) int local21 = 0;
			for (@Pc(23) int local23 = 0; local23 < local10.anIntArray214.length; local23++) {
				if (arg0 == local10.anIntArray215[local23]) {
					local21 += local10.anIntArray214[local23];
				}
			}
			return local21;
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILclient!rg;)V")
	public static void method3368(@OriginalArg(1) Class12_Sub2_Sub1_Sub4 arg0) {
		@Pc(19) Class148 local19;
		if (arg0.anInt8351 != -1) {
			local19 = Static117.aClass18_1.method296(arg0.anInt8351);
			if (local19 == null || local19.anIntArray254 == null) {
				arg0.anInt8351 = -1;
				arg0.aBoolean710 = false;
			} else {
				label357: {
					arg0.anInt8353++;
					if (arg0.anInt8376 < local19.anIntArray254.length && local19.anIntArray253[arg0.anInt8376] < arg0.anInt8353) {
						arg0.anInt8353 = 1;
						arg0.anInt8415++;
						arg0.anInt8376++;
						if (!arg0.aBoolean709) {
							Static543.method7102(arg0, arg0.anInt8376, local19);
						}
					}
					if (local19.anIntArray254.length <= arg0.anInt8376) {
						arg0.anInt8353 = 0;
						arg0.anInt8376 = 0;
						if (arg0.aBoolean710) {
							arg0.anInt8351 = arg0.method6767().method1203();
							if (arg0.anInt8351 == -1) {
								arg0.aBoolean710 = false;
								break label357;
							}
							local19 = Static117.aClass18_1.method296(arg0.anInt8351);
						}
						if (!arg0.aBoolean709) {
							Static543.method7102(arg0, arg0.anInt8376, local19);
						}
					}
					arg0.anInt8415 = arg0.anInt8376 + 1;
					if (local19.anIntArray254 == null) {
						arg0.aBoolean710 = false;
						arg0.anInt8351 = -1;
					} else if (local19.anIntArray254.length <= arg0.anInt8415) {
						arg0.anInt8415 = 0;
					}
				}
			}
		}
		@Pc(170) int local170;
		@Pc(179) Class148 local179;
		@Pc(167) Class82 local167;
		if (arg0.anInt8370 != -1 && arg0.anInt8404 <= Static532.anInt8757) {
			local167 = Static62.aClass49_1.method1021(arg0.anInt8370);
			local170 = local167.anInt1827;
			if (local170 == -1) {
				arg0.anInt8370 = -1;
			} else {
				label358: {
					local179 = Static117.aClass18_1.method296(local170);
					if (local167.aBoolean116) {
						if (local179.anInt3046 == 3) {
							if (arg0.anInt8430 > 0 && arg0.anInt8369 <= Static532.anInt8757 && arg0.anInt8412 < Static532.anInt8757) {
								arg0.anInt8370 = -1;
								break label358;
							}
						} else if (local179.anInt3046 == 1 && arg0.anInt8430 > 0 && arg0.anInt8369 <= Static532.anInt8757 && arg0.anInt8412 < Static532.anInt8757) {
							arg0.anInt8404 = Static532.anInt8757 + 1;
							break label358;
						}
					}
					if (local179 == null || local179.anIntArray254 == null) {
						arg0.anInt8370 = -1;
					} else {
						if (arg0.lb < 0) {
							arg0.lb = 0;
							if (!arg0.aBoolean709) {
								Static543.method7102(arg0, 0, local179);
							}
						}
						arg0.anInt8405++;
						if (arg0.lb < local179.anIntArray254.length && local179.anIntArray253[arg0.lb] < arg0.anInt8405) {
							arg0.lb++;
							arg0.anInt8405 = 1;
							if (!arg0.aBoolean709) {
								Static543.method7102(arg0, arg0.lb, local179);
							}
						}
						if (local179.anIntArray254.length <= arg0.lb) {
							if (local167.aBoolean116) {
								arg0.lb -= local179.anInt3045;
								arg0.anInt8400++;
								if (local179.anInt3044 <= arg0.anInt8400) {
									arg0.anInt8370 = -1;
								} else if (arg0.lb < 0 || arg0.lb >= local179.anIntArray254.length) {
									arg0.anInt8370 = -1;
								} else if (!arg0.aBoolean709) {
									Static543.method7102(arg0, arg0.lb, local179);
								}
							} else {
								arg0.anInt8370 = -1;
							}
						}
						arg0.anInt8408 = arg0.lb + 1;
						if (arg0.anInt8408 >= local179.anIntArray254.length) {
							if (local167.aBoolean116) {
								arg0.anInt8408 -= local179.anInt3045;
								if (arg0.anInt8400 + 1 >= local179.anInt3044) {
									arg0.anInt8408 = -1;
								} else if (arg0.anInt8408 < 0 || arg0.anInt8408 >= local179.anIntArray254.length) {
									arg0.anInt8408 = -1;
								}
							} else {
								arg0.anInt8408 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt8366 != -1 && Static532.anInt8757 >= arg0.anInt8362) {
			local167 = Static62.aClass49_1.method1021(arg0.anInt8366);
			local170 = local167.anInt1827;
			if (local170 == -1) {
				arg0.anInt8366 = -1;
			} else {
				label361: {
					local179 = Static117.aClass18_1.method296(local170);
					if (local167.aBoolean116) {
						if (local179.anInt3046 == 3) {
							if (arg0.anInt8430 > 0 && Static532.anInt8757 >= arg0.anInt8369 && Static532.anInt8757 > arg0.anInt8412) {
								arg0.anInt8366 = -1;
								break label361;
							}
						} else if (local179.anInt3046 == 1 && arg0.anInt8430 > 0 && arg0.anInt8369 <= Static532.anInt8757 && arg0.anInt8412 < Static532.anInt8757) {
							arg0.anInt8362 = Static532.anInt8757 + 1;
							break label361;
						}
					}
					if (local179 == null || local179.anIntArray254 == null) {
						arg0.anInt8366 = -1;
					} else {
						if (arg0.anInt8393 < 0) {
							arg0.anInt8393 = 0;
							if (!arg0.aBoolean709) {
								Static543.method7102(arg0, 0, local179);
							}
						}
						arg0.anInt8349++;
						if (arg0.anInt8393 < local179.anIntArray254.length && arg0.anInt8349 > local179.anIntArray253[arg0.anInt8393]) {
							arg0.anInt8349 = 1;
							arg0.anInt8393++;
							if (!arg0.aBoolean709) {
								Static543.method7102(arg0, arg0.anInt8393, local179);
							}
						}
						if (local179.anIntArray254.length <= arg0.anInt8393) {
							if (local167.aBoolean116) {
								arg0.anInt8393 -= local179.anInt3045;
								arg0.anInt8374++;
								if (arg0.anInt8374 >= local179.anInt3044) {
									arg0.anInt8366 = -1;
								} else if (arg0.anInt8393 < 0 || local179.anIntArray254.length <= arg0.anInt8393) {
									arg0.anInt8366 = -1;
								} else if (!arg0.aBoolean709) {
									Static543.method7102(arg0, arg0.anInt8393, local179);
								}
							} else {
								arg0.anInt8366 = -1;
							}
						}
						arg0.anInt8398 = arg0.anInt8393 + 1;
						if (local179.anIntArray254.length <= arg0.anInt8398) {
							if (local167.aBoolean116) {
								arg0.anInt8398 -= local179.anInt3045;
								if (arg0.anInt8374 + 1 >= local179.anInt3044) {
									arg0.anInt8398 = -1;
								} else if (arg0.anInt8398 < 0 || local179.anIntArray254.length <= arg0.anInt8398) {
									arg0.anInt8398 = -1;
								}
							} else {
								arg0.anInt8398 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt8394 != -1 && arg0.anInt8397 <= 1) {
			local19 = Static117.aClass18_1.method296(arg0.anInt8394);
			if (local19.anInt3046 == 3) {
				if (arg0.anInt8430 > 0 && arg0.anInt8369 <= Static532.anInt8757 && Static532.anInt8757 > arg0.anInt8412) {
					arg0.anInt8394 = -1;
					arg0.anIntArray558 = null;
				}
			} else if (local19.anInt3046 == 1 && arg0.anInt8430 > 0 && Static532.anInt8757 >= arg0.anInt8369 && Static532.anInt8757 > arg0.anInt8412) {
				arg0.anInt8397 = 2;
			}
		}
		if (arg0.anInt8394 != -1 && arg0.anInt8397 == 0) {
			local19 = Static117.aClass18_1.method296(arg0.anInt8394);
			if (local19 == null || local19.anIntArray254 == null) {
				arg0.anInt8394 = -1;
				arg0.anIntArray558 = null;
			} else {
				arg0.anInt8396++;
				if (arg0.anInt8420 < local19.anIntArray254.length && arg0.anInt8396 > local19.anIntArray253[arg0.anInt8420]) {
					arg0.anInt8420++;
					arg0.anInt8396 = 1;
					if (!arg0.aBoolean709) {
						Static543.method7102(arg0, arg0.anInt8420, local19);
					}
				}
				if (arg0.anInt8420 >= local19.anIntArray254.length) {
					arg0.anInt8357++;
					arg0.anInt8420 -= local19.anInt3045;
					if (arg0.anInt8357 >= local19.anInt3044) {
						arg0.anInt8394 = -1;
						arg0.anIntArray558 = null;
					} else if (arg0.anInt8420 < 0 || arg0.anInt8420 >= local19.anIntArray254.length) {
						arg0.anInt8394 = -1;
						arg0.anIntArray558 = null;
					} else if (!arg0.aBoolean709) {
						Static543.method7102(arg0, arg0.anInt8420, local19);
					}
				}
				arg0.anInt8379 = arg0.anInt8420 + 1;
				if (arg0.anInt8379 >= local19.anIntArray254.length) {
					arg0.anInt8379 -= local19.anInt3045;
					if (local19.anInt3044 <= arg0.anInt8357 + 1) {
						arg0.anInt8379 = -1;
					} else if (arg0.anInt8379 < 0 || arg0.anInt8379 >= local19.anIntArray254.length) {
						arg0.anInt8379 = -1;
					}
				}
			}
		}
		if (arg0.anInt8397 > 0) {
			arg0.anInt8397--;
		}
		for (@Pc(1030) int local1030 = 0; local1030 < arg0.aClass324Array3.length; local1030++) {
			@Pc(1037) Class324 local1037 = arg0.aClass324Array3[local1030];
			if (local1037 != null) {
				if (local1037.anInt8131 > 0) {
					local1037.anInt8131--;
				} else {
					local179 = Static117.aClass18_1.method296(local1037.anInt8135);
					if (local179 == null || local179.anIntArray254 == null) {
						arg0.aClass324Array3[local1030] = null;
					} else {
						local1037.anInt8133++;
						if (local1037.anInt8129 < local179.anIntArray254.length && local1037.anInt8133 > local179.anIntArray253[local1037.anInt8129]) {
							local1037.anInt8133 = 1;
							local1037.anInt8129++;
							if (!arg0.aBoolean709) {
								Static543.method7102(arg0, local1037.anInt8129, local179);
							}
						}
						if (local1037.anInt8129 >= local179.anIntArray254.length) {
							local1037.anInt8129 -= local179.anInt3045;
							local1037.anInt8130++;
							if (local1037.anInt8130 >= local179.anInt3044) {
								arg0.aClass324Array3[local1030] = null;
							} else if (local1037.anInt8129 < 0 || local179.anIntArray254.length <= local1037.anInt8129) {
								arg0.aClass324Array3[local1030] = null;
							} else if (!arg0.aBoolean709) {
								Static543.method7102(arg0, local1037.anInt8129, local179);
							}
						}
						local1037.anInt8128 = local1037.anInt8129 + 1;
						if (local179.anIntArray254.length <= local1037.anInt8128) {
							local1037.anInt8128 -= local179.anInt3045;
							if (local179.anInt3044 <= local1037.anInt8130 + 1) {
								local1037.anInt8128 = -1;
							} else if (local1037.anInt8128 < 0 || local179.anIntArray254.length <= local1037.anInt8128) {
								local1037.anInt8128 = -1;
							}
						}
					}
				}
			}
		}
	}
}
