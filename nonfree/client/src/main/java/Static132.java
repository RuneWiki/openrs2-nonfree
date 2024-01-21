import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "Lclient!cf;")
	public static final Class20 aClass20_15 = new Class20();

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
	public static int anInt2747 = 0;

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "[[S")
	public static final short[][] aShortArrayArray2 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!e;III)V")
	public static void method1965(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class1_Sub17 local12;
		if (arg2 < Static115.anInt2477) {
			local12 = Static179.aClass1_Sub17ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass5_1 != null && local12.aClass5_1.aClass8_1.method2671()) {
				arg0.method2674(local12.aClass5_1.aClass8_1, 128, 0, 0, true);
			}
		}
		if (arg3 < Static115.anInt2477) {
			local12 = Static179.aClass1_Sub17ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass5_1 != null && local12.aClass5_1.aClass8_1.method2671()) {
				arg0.method2674(local12.aClass5_1.aClass8_1, 0, 0, 128, true);
			}
		}
		if (arg2 < Static115.anInt2477 && arg3 < Static160.anInt3334) {
			local12 = Static179.aClass1_Sub17ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass5_1 != null && local12.aClass5_1.aClass8_1.method2671()) {
				arg0.method2674(local12.aClass5_1.aClass8_1, 128, 0, 128, true);
			}
		}
		if (arg2 < Static115.anInt2477 && arg3 > 0) {
			local12 = Static179.aClass1_Sub17ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass5_1 != null && local12.aClass5_1.aClass8_1.method2671()) {
				arg0.method2674(local12.aClass5_1.aClass8_1, 128, 0, -128, true);
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIII)V")
	public static void method1966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= Static115.anInt2477 * 128) {
			arg0 = Static115.anInt2477 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= Static160.anInt3334 * 128) {
			arg2 = Static160.anInt3334 * 128 - 1;
		}
		Static71.anInt1617++;
		Static53.anInt1312 = Class1_Sub3_Sub1_Sub4.anIntArray320[arg3];
		Static62.anInt1477 = Class1_Sub3_Sub1_Sub4.anIntArray317[arg3];
		Static165.anInt3434 = Class1_Sub3_Sub1_Sub4.anIntArray320[arg4];
		Static109.anInt2361 = Class1_Sub3_Sub1_Sub4.anIntArray317[arg4];
		Static188.aBooleanArrayArray32 = Static128.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static59.anInt1427 = arg0;
		Static20.anInt538 = arg1;
		Static205.anInt4447 = arg2;
		Static7.anInt157 = arg0 / 128;
		Static83.anInt1829 = arg2 / 128;
		Static210.anInt4510 = arg5;
		Static16.anInt1098 = Static7.anInt157 - Static62.anInt1472;
		if (Static16.anInt1098 < 0) {
			Static16.anInt1098 = 0;
		}
		Static166.anInt3458 = Static83.anInt1829 - Static62.anInt1472;
		if (Static166.anInt3458 < 0) {
			Static166.anInt3458 = 0;
		}
		Static168.anInt3499 = Static7.anInt157 + Static62.anInt1472;
		if (Static168.anInt3499 > Static115.anInt2477) {
			Static168.anInt3499 = Static115.anInt2477;
		}
		Static196.anInt4246 = Static83.anInt1829 + Static62.anInt1472;
		if (Static196.anInt4246 > Static160.anInt3334) {
			Static196.anInt4246 = Static160.anInt3334;
		}
		Static11.method198();
		Static170.anInt3550 = 0;
		@Pc(125) int local125;
		@Pc(128) int local128;
		for (@Pc(118) int local118 = Static50.anInt3133; local118 < Static163.anInt3629; local118++) {
			@Pc(123) Class1_Sub17[][] local123 = Static179.aClass1_Sub17ArrayArrayArray1[local118];
			for (local125 = Static16.anInt1098; local125 < Static168.anInt3499; local125++) {
				for (local128 = Static166.anInt3458; local128 < Static196.anInt4246; local128++) {
					@Pc(135) Class1_Sub17 local135 = local123[local125][local128];
					if (local135 != null) {
						if (local135.anInt2376 <= arg5 && (Static188.aBooleanArrayArray32[local125 + Static62.anInt1472 - Static7.anInt157][local128 + Static62.anInt1472 - Static83.anInt1829] || Static73.anIntArrayArrayArray3[local118][local125][local128] - arg1 >= 2000)) {
							local135.aBoolean139 = true;
							local135.aBoolean140 = true;
							if (local135.anInt2380 > 0) {
								local135.aBoolean138 = true;
							} else {
								local135.aBoolean138 = false;
							}
							Static170.anInt3550++;
						} else {
							local135.aBoolean139 = false;
							local135.aBoolean140 = false;
							local135.anInt2372 = 0;
						}
					}
				}
			}
		}
		@Pc(227) int local227;
		@Pc(236) int local236;
		@Pc(241) int local241;
		@Pc(245) int local245;
		@Pc(223) int local223;
		for (@Pc(210) int local210 = Static50.anInt3133; local210 < Static163.anInt3629; local210++) {
			@Pc(215) Class1_Sub17[][] local215 = Static179.aClass1_Sub17ArrayArrayArray1[local210];
			for (local128 = -Static62.anInt1472; local128 <= 0; local128++) {
				local223 = Static7.anInt157 + local128;
				local227 = Static7.anInt157 - local128;
				if (local223 >= Static16.anInt1098 || local227 < Static168.anInt3499) {
					for (local236 = -Static62.anInt1472; local236 <= 0; local236++) {
						local241 = Static83.anInt1829 + local236;
						local245 = Static83.anInt1829 - local236;
						@Pc(257) Class1_Sub17 local257;
						if (local223 >= Static16.anInt1098) {
							if (local241 >= Static166.anInt3458) {
								local257 = local215[local223][local241];
								if (local257 != null && local257.aBoolean139) {
									Static178.method2902(local257, true);
								}
							}
							if (local245 < Static196.anInt4246) {
								local257 = local215[local223][local245];
								if (local257 != null && local257.aBoolean139) {
									Static178.method2902(local257, true);
								}
							}
						}
						if (local227 < Static168.anInt3499) {
							if (local241 >= Static166.anInt3458) {
								local257 = local215[local227][local241];
								if (local257 != null && local257.aBoolean139) {
									Static178.method2902(local257, true);
								}
							}
							if (local245 < Static196.anInt4246) {
								local257 = local215[local227][local245];
								if (local257 != null && local257.aBoolean139) {
									Static178.method2902(local257, true);
								}
							}
						}
						if (Static170.anInt3550 == 0) {
							Static119.aBoolean148 = false;
							return;
						}
					}
				}
			}
		}
		for (local125 = Static50.anInt3133; local125 < Static163.anInt3629; local125++) {
			@Pc(341) Class1_Sub17[][] local341 = Static179.aClass1_Sub17ArrayArrayArray1[local125];
			for (local223 = -Static62.anInt1472; local223 <= 0; local223++) {
				local227 = Static7.anInt157 + local223;
				local236 = Static7.anInt157 - local223;
				if (local227 >= Static16.anInt1098 || local236 < Static168.anInt3499) {
					for (local241 = -Static62.anInt1472; local241 <= 0; local241++) {
						local245 = Static83.anInt1829 + local241;
						@Pc(371) int local371 = Static83.anInt1829 - local241;
						@Pc(383) Class1_Sub17 local383;
						if (local227 >= Static16.anInt1098) {
							if (local245 >= Static166.anInt3458) {
								local383 = local341[local227][local245];
								if (local383 != null && local383.aBoolean139) {
									Static178.method2902(local383, false);
								}
							}
							if (local371 < Static196.anInt4246) {
								local383 = local341[local227][local371];
								if (local383 != null && local383.aBoolean139) {
									Static178.method2902(local383, false);
								}
							}
						}
						if (local236 < Static168.anInt3499) {
							if (local245 >= Static166.anInt3458) {
								local383 = local341[local236][local245];
								if (local383 != null && local383.aBoolean139) {
									Static178.method2902(local383, false);
								}
							}
							if (local371 < Static196.anInt4246) {
								local383 = local341[local236][local371];
								if (local383 != null && local383.aBoolean139) {
									Static178.method2902(local383, false);
								}
							}
						}
						if (Static170.anInt3550 == 0) {
							Static119.aBoolean148 = false;
							return;
						}
					}
				}
			}
		}
		Static119.aBoolean148 = false;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(BI)[B")
	public static synchronized byte[] method1967(@OriginalArg(1) int arg0) {
		@Pc(29) byte[] local29;
		if (arg0 == 100 && Static189.anInt4124 > 0) {
			local29 = Static149.aByteArrayArray7[--Static189.anInt4124];
			Static149.aByteArrayArray7[Static189.anInt4124] = null;
			return local29;
		} else if (arg0 == 5000 && Static175.anInt3779 > 0) {
			local29 = Static126.aByteArrayArray4[--Static175.anInt3779];
			Static126.aByteArrayArray4[Static175.anInt3779] = null;
			return local29;
		} else if (arg0 == 30000 && Static89.anInt1920 > 0) {
			local29 = Static184.aByteArrayArray10[--Static89.anInt1920];
			Static184.aByteArrayArray10[Static89.anInt1920] = null;
			return local29;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)I")
	public static int method1968(@OriginalArg(1) int arg0) {
		if (arg0 >= 65 && arg0 <= 90 || arg0 >= 192 && arg0 <= 222 && arg0 != 215) {
			return arg0 + 32;
		} else if (arg0 == 159) {
			return 255;
		} else if (arg0 == 140) {
			return 156;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILclient!ab;Lclient!ab;Lclient!ab;)V")
	public static void method1969(@OriginalArg(1) Class3 arg0, @OriginalArg(2) Class3 arg1, @OriginalArg(3) Class3 arg2) {
		Static44.aClass3_24 = arg1;
		Static71.aClass3_10 = arg0;
		Static196.aClass3_37 = arg2;
	}
}
