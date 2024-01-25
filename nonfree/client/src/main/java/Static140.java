import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
	public static int anInt2937;

	@OriginalMember(owner = "client!ff", name = "p", descriptor = "[Lclient!dda;")
	public static Class72[] aClass72Array1;

	@OriginalMember(owner = "client!ff", name = "r", descriptor = "Lclient!rj;")
	public static Class287 aClass287_4;

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "Lclient!baa;")
	public static final Class28 aClass28_6 = new Class28(14, 0, 4, 1);

	@OriginalMember(owner = "client!ff", name = "s", descriptor = "I")
	public static int anInt2942 = 999999;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IILclient!ni;II)V")
	public static void method2379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub1_Sub1_Sub1 arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class54 local9 = arg2.method6168();
		@Pc(19) int local19 = arg2.anInt7377 - arg2.aClass186_7.anInt4914 & 0x3FFF;
		if (arg1 == -1) {
			if (local19 != 0 || arg2.anInt7361 > 25) {
				if (arg0 < 0 && local9.anInt1418 != -1) {
					arg2.anInt7419 = local9.anInt1418;
				} else if (arg0 <= 0 || local9.anInt1413 == -1) {
					arg2.anInt7419 = local9.anInt1401;
				} else {
					arg2.anInt7419 = local9.anInt1413;
				}
				arg2.aBoolean569 = false;
			} else if (!arg2.aBoolean569 || !local9.method969(arg2.anInt7419)) {
				arg2.anInt7419 = local9.method966();
				arg2.aBoolean569 = arg2.anInt7419 != -1;
			}
		} else if (arg2.anInt7339 != -1 && (local19 >= 10240 || local19 <= 2048)) {
			@Pc(209) int local209 = Static30.anIntArray44[arg3] - arg2.aClass186_7.anInt4914 & 0x3FFF;
			if (arg1 == 2 && local9.anInt1387 != -1) {
				if (local209 > 2048 && local209 <= 6144 && local9.anInt1423 != -1) {
					arg2.anInt7419 = local9.anInt1423;
				} else if (local209 >= 10240 && local209 < 14336 && local9.anInt1412 != -1) {
					arg2.anInt7419 = local9.anInt1412;
				} else if (local209 <= 6144 || local209 >= 10240 || local9.anInt1386 == -1) {
					arg2.anInt7419 = local9.anInt1387;
				} else {
					arg2.anInt7419 = local9.anInt1386;
				}
			} else if (arg1 == 0 && local9.anInt1389 != -1) {
				if (local209 > 2048 && local209 <= 6144 && local9.anInt1397 != -1) {
					arg2.anInt7419 = local9.anInt1397;
				} else if (local209 >= 10240 && local209 < 14336 && local9.anInt1391 != -1) {
					arg2.anInt7419 = local9.anInt1391;
				} else if (local209 <= 6144 || local209 >= 10240 || local9.anInt1384 == -1) {
					arg2.anInt7419 = local9.anInt1389;
				} else {
					arg2.anInt7419 = local9.anInt1384;
				}
			} else if (local209 > 2048 && local209 <= 6144 && local9.anInt1393 != -1) {
				arg2.anInt7419 = local9.anInt1393;
			} else if (local209 >= 10240 && local209 < 14336 && local9.anInt1395 != -1) {
				arg2.anInt7419 = local9.anInt1395;
			} else if (local209 <= 6144 || local209 >= 10240 || local9.anInt1408 == -1) {
				arg2.anInt7419 = local9.anInt1401;
			} else {
				arg2.anInt7419 = local9.anInt1408;
			}
			arg2.aBoolean569 = false;
		} else if (local19 == 0 && arg2.anInt7361 <= 25) {
			arg2.aBoolean569 = false;
			if (arg1 == 2 && local9.anInt1387 != -1) {
				arg2.anInt7419 = local9.anInt1387;
			} else if (arg1 == 0 && local9.anInt1389 != -1) {
				arg2.anInt7419 = local9.anInt1389;
			} else {
				arg2.anInt7419 = local9.anInt1401;
			}
		} else {
			if (arg1 == 2 && local9.anInt1387 != -1) {
				if (arg0 < 0 && local9.anInt1407 != -1) {
					arg2.anInt7419 = local9.anInt1407;
				} else if (arg0 <= 0 || local9.anInt1419 == -1) {
					arg2.anInt7419 = local9.anInt1387;
				} else {
					arg2.anInt7419 = local9.anInt1419;
				}
			} else if (arg1 == 0 && local9.anInt1389 != -1) {
				if (arg0 < 0 && local9.anInt1402 != -1) {
					arg2.anInt7419 = local9.anInt1402;
				} else if (arg0 <= 0 || local9.anInt1406 == -1) {
					arg2.anInt7419 = local9.anInt1389;
				} else {
					arg2.anInt7419 = local9.anInt1406;
				}
			} else if (arg0 < 0 && local9.anInt1400 != -1) {
				arg2.anInt7419 = local9.anInt1400;
			} else if (arg0 <= 0 || local9.anInt1417 == -1) {
				arg2.anInt7419 = local9.anInt1401;
			} else {
				arg2.anInt7419 = local9.anInt1417;
			}
			arg2.aBoolean569 = false;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg2 - arg3;
		@Pc(21) int local21 = arg1 - arg3;
		@Pc(25) int local25 = arg2 * arg2;
		@Pc(29) int local29 = arg1 * arg1;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg1 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(70) int local70 = local41 + (1 - local57) * local25;
		@Pc(79) int local79 = local29 - local45 * (local57 - 1);
		@Pc(88) int local88 = local33 * (1 - local61) + local49;
		@Pc(97) int local97 = local37 - local53 * (local61 - 1);
		@Pc(101) int local101 = local25 << 2;
		@Pc(105) int local105 = local29 << 2;
		@Pc(109) int local109 = local33 << 2;
		@Pc(113) int local113 = local37 << 2;
		@Pc(117) int local117 = local41 * 3;
		@Pc(128) int local128 = local45 * (local57 - 3);
		@Pc(132) int local132 = local49 * 3;
		@Pc(138) int local138 = (local61 - 3) * local53;
		@Pc(140) int local140 = local105;
		@Pc(146) int local146 = (arg1 - 1) * local101;
		@Pc(148) int local148 = local113;
		@Pc(154) int local154 = (local21 - 1) * local109;
		@Pc(175) int local175;
		@Pc(183) int local183;
		@Pc(192) int local192;
		@Pc(202) int local202;
		if (arg0 >= Static326.anInt6028 && Static80.anInt1738 >= arg0) {
			@Pc(164) int[] local164 = Static582.anIntArrayArray69[arg0];
			local175 = Static489.method6853(arg4 - arg2, Static553.anInt9074, Static249.anInt4668);
			local183 = Static489.method6853(arg4 + arg2, Static553.anInt9074, Static249.anInt4668);
			local192 = Static489.method6853(arg4 - local16, Static553.anInt9074, Static249.anInt4668);
			local202 = Static489.method6853(local16 + arg4, Static553.anInt9074, Static249.anInt4668);
			Static276.method3099(local175, local164, arg5, local192);
			Static276.method3099(local192, local164, arg6, local202);
			Static276.method3099(local202, local164, arg5, local183);
		}
		while (local9 > 0) {
			@Pc(233) boolean local233 = local9 <= local21;
			if (local233) {
				if (local88 < 0) {
					while (local88 < 0) {
						local97 += local148;
						local88 += local132;
						local132 += local113;
						local148 += local113;
						local11++;
					}
				}
				if (local97 < 0) {
					local97 += local148;
					local88 += local132;
					local148 += local113;
					local11++;
					local132 += local113;
				}
				local88 += -local154;
				local97 += -local138;
				local138 -= local109;
				local154 -= local109;
			}
			if (local70 < 0) {
				while (local70 < 0) {
					local70 += local117;
					local79 += local140;
					local7++;
					local117 += local105;
					local140 += local105;
				}
			}
			if (local79 < 0) {
				local79 += local140;
				local70 += local117;
				local117 += local105;
				local7++;
				local140 += local105;
			}
			local79 += -local128;
			local70 += -local146;
			local128 -= local101;
			local9--;
			local146 -= local101;
			local175 = arg0 - local9;
			local183 = local9 + arg0;
			if (local183 >= Static326.anInt6028 && Static80.anInt1738 >= local175) {
				local192 = Static489.method6853(local7 + arg4, Static553.anInt9074, Static249.anInt4668);
				local202 = Static489.method6853(arg4 - local7, Static553.anInt9074, Static249.anInt4668);
				if (local233) {
					@Pc(406) int local406 = Static489.method6853(local11 + arg4, Static553.anInt9074, Static249.anInt4668);
					@Pc(415) int local415 = Static489.method6853(arg4 - local11, Static553.anInt9074, Static249.anInt4668);
					@Pc(422) int[] local422;
					if (local175 >= Static326.anInt6028) {
						local422 = Static582.anIntArrayArray69[local175];
						Static276.method3099(local202, local422, arg5, local415);
						Static276.method3099(local415, local422, arg6, local406);
						Static276.method3099(local406, local422, arg5, local192);
					}
					if (local183 <= Static80.anInt1738) {
						local422 = Static582.anIntArrayArray69[local183];
						Static276.method3099(local202, local422, arg5, local415);
						Static276.method3099(local415, local422, arg6, local406);
						Static276.method3099(local406, local422, arg5, local192);
					}
				} else {
					if (local175 >= Static326.anInt6028) {
						Static276.method3099(local202, Static582.anIntArrayArray69[local175], arg5, local192);
					}
					if (local183 <= Static80.anInt1738) {
						Static276.method3099(local202, Static582.anIntArrayArray69[local183], arg5, local192);
					}
				}
			}
		}
	}
}
