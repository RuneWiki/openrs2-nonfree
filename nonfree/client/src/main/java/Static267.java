import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!rc", name = "r", descriptor = "[I")
	public static int[] anIntArray400;

	@OriginalMember(owner = "client!rc", name = "t", descriptor = "Lclient!tq;")
	public static Class191 aClass191_173;

	@OriginalMember(owner = "client!rc", name = "y", descriptor = "[I")
	public static final int[] anIntArray402 = new int[5];

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I[IBI[I)V")
	public static void method4825(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 >= arg2) {
			return;
		}
		@Pc(26) int local26 = (arg2 + arg0) / 2;
		@Pc(28) int local28 = arg0;
		@Pc(32) int local32 = arg1[local26];
		arg1[local26] = arg1[arg2];
		arg1[arg2] = local32;
		@Pc(46) int local46 = arg3[local26];
		arg3[local26] = arg3[arg2];
		arg3[arg2] = local46;
		for (@Pc(58) int local58 = arg0; local58 < arg2; local58++) {
			if (arg1[local58] < (local58 & 0x1) + local32) {
				@Pc(77) int local77 = arg1[local58];
				arg1[local58] = arg1[local28];
				arg1[local28] = local77;
				@Pc(91) int local91 = arg3[local58];
				arg3[local58] = arg3[local28];
				arg3[local28++] = local91;
			}
		}
		arg1[arg2] = arg1[local28];
		arg1[local28] = local32;
		arg3[arg2] = arg3[local28];
		arg3[local28] = local46;
		method4825(arg0, arg1, local28 - 1, arg3);
		method4825(local28 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)V")
	public static void method4826() {
		Static47.aClass119_29.method3315(5);
		Static301.aClass119_156.method3315(5);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZLclient!fj;)V")
	public static void method4827(@OriginalArg(1) Class62_Sub1_Sub2 arg0) {
		arg0.aBoolean483 = false;
		@Pc(18) Class107 local18;
		if (arg0.anInt5347 != -1) {
			local18 = Static212.method3773(arg0.anInt5347);
			if (local18 == null || local18.anIntArray280 == null) {
				arg0.anInt5347 = -1;
				arg0.aBoolean484 = false;
			} else {
				label297: {
					arg0.anInt5331++;
					if (arg0.anInt5350 < local18.anIntArray280.length && local18.anIntArray279[arg0.anInt5350] < arg0.anInt5331) {
						arg0.anInt5350++;
						arg0.anInt5331 = 1;
						arg0.anInt5319++;
						Static343.method5928(Static41.aClass62_Sub1_Sub2_Sub2_2 == arg0, local18, arg0.anInt5289, arg0.anInt5350, arg0.anInt5280);
					}
					if (arg0.anInt5350 >= local18.anIntArray280.length) {
						arg0.anInt5350 = 0;
						arg0.anInt5331 = 0;
						if (arg0.aBoolean484) {
							arg0.anInt5347 = arg0.method4775().method5102();
							if (arg0.anInt5347 == -1) {
								arg0.aBoolean484 = false;
								break label297;
							}
							local18 = Static212.method3773(arg0.anInt5347);
						}
						Static343.method5928(Static41.aClass62_Sub1_Sub2_Sub2_2 == arg0, local18, arg0.anInt5289, arg0.anInt5350, arg0.anInt5280);
					}
					arg0.anInt5319 = arg0.anInt5350 + 1;
					if (arg0.anInt5319 >= local18.anIntArray280.length) {
						arg0.anInt5319 = 0;
					}
				}
			}
		}
		@Pc(193) Class107 local193;
		if (arg0.anInt5321 != -1 && arg0.anInt5357 <= Static212.anInt4090) {
			@Pc(177) Class215 local177 = Static44.method1076(arg0.anInt5321);
			@Pc(180) int local180 = local177.anInt6968;
			if (local180 == -1) {
				arg0.anInt5321 = -1;
			} else {
				label299: {
					local193 = Static212.method3773(local180);
					if (local177.aBoolean621) {
						if (local193.anInt3290 == 3) {
							if (arg0.anInt5367 > 0 && Static212.anInt4090 >= arg0.anInt5296 && Static212.anInt4090 > arg0.anInt5343) {
								arg0.anInt5321 = -1;
								break label299;
							}
						} else if (local193.anInt3290 == 1 && arg0.anInt5367 > 0 && arg0.anInt5296 <= Static212.anInt4090 && Static212.anInt4090 > arg0.anInt5343) {
							arg0.anInt5357 = Static212.anInt4090 + 1;
							break label299;
						}
					}
					if (local193 == null || local193.anIntArray280 == null) {
						arg0.anInt5321 = -1;
					} else {
						if (arg0.anInt5356 < 0) {
							arg0.anInt5356 = 0;
							Static343.method5928(arg0 == Static41.aClass62_Sub1_Sub2_Sub2_2, local193, arg0.anInt5289, 0, arg0.anInt5280);
						}
						arg0.anInt5317++;
						if (local193.anIntArray280.length > arg0.anInt5356 && local193.anIntArray279[arg0.anInt5356] < arg0.anInt5317) {
							arg0.anInt5317 = 1;
							arg0.anInt5356++;
							Static343.method5928(arg0 == Static41.aClass62_Sub1_Sub2_Sub2_2, local193, arg0.anInt5289, arg0.anInt5356, arg0.anInt5280);
						}
						if (local193.anIntArray280.length <= arg0.anInt5356) {
							if (local177.aBoolean621) {
								arg0.anInt5293++;
								arg0.anInt5356 -= local193.anInt3276;
								if (arg0.anInt5293 >= local193.anInt3286) {
									arg0.anInt5321 = -1;
								} else if (arg0.anInt5356 >= 0 && arg0.anInt5356 < local193.anIntArray280.length) {
									Static343.method5928(Static41.aClass62_Sub1_Sub2_Sub2_2 == arg0, local193, arg0.anInt5289, arg0.anInt5356, arg0.anInt5280);
								} else {
									arg0.anInt5321 = -1;
								}
							} else {
								arg0.anInt5321 = -1;
							}
						}
						arg0.anInt5307 = arg0.anInt5356 + 1;
						if (local193.anIntArray280.length <= arg0.anInt5307) {
							if (local177.aBoolean621) {
								arg0.anInt5307 -= local193.anInt3276;
								if (local193.anInt3286 <= arg0.anInt5293 + 1) {
									arg0.anInt5307 = -1;
								} else if (arg0.anInt5307 < 0 || arg0.anInt5307 >= local193.anIntArray280.length) {
									arg0.anInt5307 = -1;
								}
							} else {
								arg0.anInt5307 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt5322 != -1 && arg0.anInt5345 <= 1) {
			local18 = Static212.method3773(arg0.anInt5322);
			if (local18.anInt3290 == 3) {
				if (arg0.anInt5367 > 0 && Static212.anInt4090 >= arg0.anInt5296 && Static212.anInt4090 > arg0.anInt5343) {
					arg0.anInt5322 = -1;
				}
			} else if (local18.anInt3290 == 1 && arg0.anInt5367 > 0 && arg0.anInt5296 <= Static212.anInt4090 && Static212.anInt4090 > arg0.anInt5343) {
				arg0.anInt5345 = 2;
			}
		}
		if (arg0.anInt5322 != -1 && arg0.anInt5345 == 0) {
			local18 = Static212.method3773(arg0.anInt5322);
			if (local18 == null || local18.anIntArray280 == null) {
				arg0.anInt5322 = -1;
			} else {
				arg0.anInt5341++;
				if (local18.anIntArray280.length > arg0.anInt5305 && local18.anIntArray279[arg0.anInt5305] < arg0.anInt5341) {
					arg0.anInt5305++;
					arg0.anInt5341 = 1;
					Static343.method5928(Static41.aClass62_Sub1_Sub2_Sub2_2 == arg0, local18, arg0.anInt5289, arg0.anInt5305, arg0.anInt5280);
				}
				if (arg0.anInt5305 >= local18.anIntArray280.length) {
					arg0.anInt5349++;
					arg0.anInt5305 -= local18.anInt3276;
					if (local18.anInt3286 <= arg0.anInt5349) {
						arg0.anInt5322 = -1;
					} else if (arg0.anInt5305 >= 0 && local18.anIntArray280.length > arg0.anInt5305) {
						Static343.method5928(arg0 == Static41.aClass62_Sub1_Sub2_Sub2_2, local18, arg0.anInt5289, arg0.anInt5305, arg0.anInt5280);
					} else {
						arg0.anInt5322 = -1;
					}
				}
				arg0.anInt5337 = arg0.anInt5305 + 1;
				if (local18.anIntArray280.length <= arg0.anInt5337) {
					arg0.anInt5337 -= local18.anInt3276;
					if (local18.anInt3286 <= arg0.anInt5349 + 1) {
						arg0.anInt5337 = -1;
					} else if (arg0.anInt5337 < 0 || arg0.anInt5337 >= local18.anIntArray280.length) {
						arg0.anInt5337 = -1;
					}
				}
				arg0.aBoolean483 = local18.aBoolean290;
			}
		}
		if (arg0.anInt5345 > 0) {
			arg0.anInt5345--;
		}
		for (@Pc(724) int local724 = 0; local724 < arg0.aClass103Array3.length; local724++) {
			@Pc(731) Class103 local731 = arg0.aClass103Array3[local724];
			if (local731 != null) {
				if (local731.anInt3242 > 0) {
					local731.anInt3242--;
				} else {
					local193 = Static212.method3773(local731.anInt3236);
					if (local193 == null || local193.anIntArray280 == null) {
						arg0.aClass103Array3[local724] = null;
					} else {
						local731.anInt3240++;
						if (local731.anInt3237 < local193.anIntArray280.length && local731.anInt3240 > local193.anIntArray279[local731.anInt3237]) {
							local731.anInt3240 = 1;
							local731.anInt3237++;
							Static343.method5928(Static41.aClass62_Sub1_Sub2_Sub2_2 == arg0, local193, arg0.anInt5289, local731.anInt3237, arg0.anInt5280);
						}
						if (local193.anIntArray280.length <= local731.anInt3237) {
							local731.anInt3237 -= local193.anInt3276;
							local731.anInt3241++;
							if (local193.anInt3286 <= local731.anInt3241) {
								arg0.aClass103Array3[local724] = null;
							} else if (local731.anInt3237 >= 0 && local193.anIntArray280.length > local731.anInt3237) {
								Static343.method5928(arg0 == Static41.aClass62_Sub1_Sub2_Sub2_2, local193, arg0.anInt5289, local731.anInt3237, arg0.anInt5280);
							} else {
								arg0.aClass103Array3[local724] = null;
							}
						}
						local731.anInt3239 = local731.anInt3237 + 1;
						if (local193.anIntArray280.length <= local731.anInt3239) {
							local731.anInt3239 -= local193.anInt3276;
							if (local193.anInt3286 <= local731.anInt3241 + 1) {
								local731.anInt3239 = -1;
							} else if (local731.anInt3239 < 0 || local193.anIntArray280.length <= local731.anInt3239) {
								local731.anInt3239 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(B)V")
	public static void method4828() {
		@Pc(5) Class119 local5 = Static253.aClass119_210;
		synchronized (Static253.aClass119_210) {
			Static253.aClass119_210.method3304();
		}
		local5 = Static119.aClass119_76;
		synchronized (Static119.aClass119_76) {
			Static119.aClass119_76.method3304();
		}
		@Pc(37) Class148 local37 = Static129.aClass148_1;
		synchronized (Static129.aClass148_1) {
			Static129.aClass148_1.method4063();
		}
	}
}
