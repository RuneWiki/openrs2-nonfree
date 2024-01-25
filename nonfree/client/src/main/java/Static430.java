import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!qj", name = "n", descriptor = "Lclient!pe;")
	public static Class254 aClass254_110;

	@OriginalMember(owner = "client!qj", name = "z", descriptor = "F")
	public static float aFloat174;

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!cp;IIIII)V")
	public static void method6816(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt8057 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass3_Sub28Array6[local4] != null) {
				arg0.anInt8057++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt8057; local22++) {
			@Pc(31) long local31 = Static272.aLongArrayArrayArray1[arg1][arg2][arg3];
			@Pc(41) Class212 local41;
			while (local31 != 0L) {
				local41 = Static464.aClass212Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass3_Sub28_2 == arg0.aClass3_Sub28Array6[local22]) {
					continue label51;
				}
			}
			local31 = Static272.aLongArrayArrayArray1[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static464.aClass212Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass3_Sub28_2 == arg0.aClass3_Sub28Array6[local22]) {
					continue label51;
				}
			}
			for (@Pc(93) int local93 = local22; local93 < arg0.anInt8057 - 1; local93++) {
				arg0.aClass3_Sub28Array6[local93] = arg0.aClass3_Sub28Array6[local93 + 1];
			}
			arg0.anInt8057--;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIBZ)V")
	public static void method6817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3 && Static368.anInt7248 == arg1 && arg2 == Static187.anInt3746 && (Static212.anInt4380 == Static96.anInt2320 || Static455.aClass3_Sub27_Sub1_1.method4040(Static275.anInt5823))) {
			return;
		}
		Static187.anInt3746 = arg2;
		Static368.anInt7248 = arg1;
		Static96.anInt2320 = Static212.anInt4380;
		if (Static455.aClass3_Sub27_Sub1_1.method4040(Static275.anInt5823)) {
			Static96.anInt2320 = 0;
		}
		Static168.method3104(arg0);
		Static569.method8164(true, Static139.aClass101_11.method2841(Static126.anInt2904), Static546.aClass15_16, Static137.aClass111_5, Static13.aClass297_2);
		@Pc(61) int local61 = Static230.anInt4667;
		@Pc(63) int local63 = Static563.anInt10006;
		Static230.anInt4667 = (Static368.anInt7248 - (Static460.anInt8640 >> 4)) * 8;
		Static563.anInt10006 = (Static187.anInt3746 - (Static292.anInt7682 >> 4)) * 8;
		Static424.aClass3_Sub4_Sub7_3 = Static87.method5773(Static368.anInt7248 * 8, Static187.anInt3746 * 8);
		Static356.aClass238_3 = null;
		@Pc(95) int local95 = Static230.anInt4667 - local61;
		@Pc(100) int local100 = Static563.anInt10006 - local63;
		@Pc(107) int local107;
		@Pc(119) int local119;
		@Pc(232) int local232;
		@Pc(179) int local179;
		if (arg0 == 11) {
			for (local107 = 0; local107 < Static17.anInt6046; local107++) {
				@Pc(112) Class3_Sub46 local112 = Static60.aClass3_Sub46Array1[local107];
				if (local112 != null) {
					@Pc(117) Class2_Sub2_Sub1_Sub2 local117 = local112.aClass2_Sub2_Sub1_Sub2_2;
					for (local119 = 0; local119 < 10; local119++) {
						local117.anIntArray487[local119] -= local95;
						local117.anIntArray488[local119] -= local100;
					}
					local117.anInt9398 -= local95 * 512;
					local117.anInt9396 -= local100 * 512;
				}
			}
		} else {
			Static268.anInt5680 = 0;
			@Pc(167) boolean local167 = false;
			@Pc(173) int local173 = (Static460.anInt8640 - 1) * 512;
			local179 = (Static292.anInt7682 - 1) * 512;
			for (local119 = 0; local119 < Static17.anInt6046; local119++) {
				@Pc(186) Class3_Sub46 local186 = Static60.aClass3_Sub46Array1[local119];
				if (local186 != null) {
					@Pc(191) Class2_Sub2_Sub1_Sub2 local191 = local186.aClass2_Sub2_Sub1_Sub2_2;
					local191.anInt9398 -= local95 * 512;
					local191.anInt9396 -= local100 * 512;
					if (local191.anInt9398 >= 0 && local191.anInt9398 <= local173 && local191.anInt9396 >= 0 && local191.anInt9396 <= local179) {
						@Pc(230) boolean local230 = true;
						for (local232 = 0; local232 < 10; local232++) {
							local191.anIntArray487[local232] -= local95;
							local191.anIntArray488[local232] -= local100;
							if (local191.anIntArray487[local232] < 0 || local191.anIntArray487[local232] >= Static460.anInt8640 || local191.anIntArray488[local232] < 0 || local191.anIntArray488[local232] >= Static292.anInt7682) {
								local230 = false;
							}
						}
						if (local230) {
							Static304.anIntArray377[Static268.anInt5680++] = local191.anInt7603;
						} else {
							local191.method6322(null);
							local186.method8412();
							local167 = true;
						}
					} else {
						local191.method6322(null);
						local186.method8412();
						local167 = true;
					}
				}
			}
			if (local167) {
				Static17.anInt6046 = Static331.aClass25_25.method950();
				Static331.aClass25_25.method955(Static60.aClass3_Sub46Array1);
			}
		}
		for (local107 = 0; local107 < 2048; local107++) {
			@Pc(341) Class2_Sub2_Sub1_Sub1 local341 = Static378.aClass2_Sub2_Sub1_Sub1Array10[local107];
			if (local341 != null) {
				for (local179 = 0; local179 < 10; local179++) {
					local341.anIntArray487[local179] -= local95;
					local341.anIntArray488[local179] -= local100;
				}
				local341.anInt9396 -= local100 * 512;
				local341.anInt9398 -= local95 * 512;
			}
		}
		@Pc(390) Class357[] local390 = Static516.aClass357Array3;
		for (local179 = 0; local179 < local390.length; local179++) {
			@Pc(397) Class357 local397 = local390[local179];
			if (local397 != null) {
				local397.anInt10300 -= local95 * 512;
				local397.anInt10303 -= local100 * 512;
			}
		}
		for (@Pc(425) Class3_Sub45 local425 = (Class3_Sub45) Static364.aClass183_46.method4795(); local425 != null; local425 = (Class3_Sub45) Static364.aClass183_46.method4793()) {
			local425.anInt9267 -= local100;
			local425.anInt9258 -= local95;
			if (Static39.anInt1074 != 4 && (local425.anInt9258 < 0 || local425.anInt9267 < 0 || local425.anInt9258 >= Static460.anInt8640 || Static292.anInt7682 <= local425.anInt9267)) {
				local425.method8412();
			}
		}
		if (Static39.anInt1074 != 4) {
			for (@Pc(475) Class3_Sub30 local475 = (Class3_Sub30) Static30.aClass25_5.method949(); local475 != null; local475 = (Class3_Sub30) Static30.aClass25_5.method947()) {
				@Pc(482) int local482 = (int) (local475.aLong262 & 0x3FFFL);
				@Pc(487) int local487 = local482 - Static230.anInt4667;
				local232 = (int) (local475.aLong262 >> 14 & 0x3FFFL);
				@Pc(500) int local500 = local232 - Static563.anInt10006;
				if (local487 < 0 || local500 < 0 || Static460.anInt8640 <= local487 || Static292.anInt7682 <= local500) {
					local475.method8412();
				}
			}
		}
		if (Static567.anInt10049 != 0) {
			Static387.anInt7430 -= local100;
			Static567.anInt10049 -= local95;
		}
		Static3.method215();
		if (arg0 != 11) {
			Static428.anInt8266 -= local100;
			Static29.anInt855 -= local95;
			Static480.anInt8972 -= local100;
			Static496.anInt9269 -= local100 * 512;
			Static594.anInt10391 -= local95 * 512;
			Static464.anInt8682 -= local95;
			if (Math.abs(local95) > Static460.anInt8640 || Math.abs(local100) > Static292.anInt7682) {
				Static423.method6761();
			}
		} else if (Static267.anInt5668 == 4) {
			Static189.anInt3761 -= local95 * 512;
			Static531.anInt9619 -= local95 * 512;
			Static166.anInt3526 -= local100 * 512;
			Static65.anInt1699 -= local100 * 512;
		} else {
			Static267.anInt5668 = 1;
		}
		Static304.method5044();
		Static23.method7146();
		Static542.aClass183_60.method4790();
		Static591.aClass183_64.method4790();
		Static206.aClass134_10.method3232();
		Static342.method5818();
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(CZ)C")
	public static char method6818(@OriginalArg(0) char arg0) {
		if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
			return '_';
		} else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
			return arg0;
		} else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
			return 'a';
		} else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
			return 'e';
		} else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
			return 'i';
		} else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
			return 'o';
		} else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
			return 'u';
		} else if (arg0 == 'ç' || arg0 == 'Ç') {
			return 'c';
		} else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
			return 'y';
		} else if (arg0 == 'ñ' || arg0 == 'Ñ') {
			return 'n';
		} else if (arg0 == 'ß') {
			return 'b';
		} else {
			return Character.toLowerCase(arg0);
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)V")
	public static void method6820(@OriginalArg(0) int arg0) {
		Static400.anInt7816 = arg0;
		Static377.anInt7322 = 2;
		if (Static148.aString35 == null) {
			Static395.method3918(35);
		} else {
			@Pc(20) Class3_Sub7 local20 = new Class3_Sub7(Static491.method6667(Static208.method3661(Static148.aString35)));
			@Pc(26) long local26 = local20.method6519();
			Static490.aLong226 = local20.method6519();
			Static573.method8191(true, Static482.method7394(local26), "");
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V")
	public static void method6821() {
		@Pc(13) int local13 = Static29.anInt855 * 512 + 256;
		@Pc(19) int local19 = Static428.anInt8266 * 512 + 256;
		@Pc(27) int local27 = Static274.method4782(local19, Static212.anInt4380, local13) - Static258.anInt5538;
		if (Static213.anInt4389 >= 100) {
			Static496.anInt9269 = Static428.anInt8266 * 512 + 256;
			Static594.anInt10391 = Static29.anInt855 * 512 + 256;
			Static360.anInt1771 = Static274.method4782(Static496.anInt9269, Static212.anInt4380, Static594.anInt10391) - Static258.anInt5538;
		} else {
			if (Static594.anInt10391 < local13) {
				Static594.anInt10391 += (local13 - Static594.anInt10391) * Static213.anInt4389 / 1000 + Static394.anInt7573;
				if (local13 < Static594.anInt10391) {
					Static594.anInt10391 = local13;
				}
			}
			if (local13 < Static594.anInt10391) {
				Static594.anInt10391 -= (Static594.anInt10391 - local13) * Static213.anInt4389 / 1000 + Static394.anInt7573;
				if (Static594.anInt10391 < local13) {
					Static594.anInt10391 = local13;
				}
			}
			if (Static360.anInt1771 < local27) {
				Static360.anInt1771 += Static213.anInt4389 * (local27 - Static360.anInt1771) / 1000 + Static394.anInt7573;
				if (Static360.anInt1771 > local27) {
					Static360.anInt1771 = local27;
				}
			}
			if (Static496.anInt9269 < local19) {
				Static496.anInt9269 += Static394.anInt7573 + Static213.anInt4389 * (local19 - Static496.anInt9269) / 1000;
				if (local19 < Static496.anInt9269) {
					Static496.anInt9269 = local19;
				}
			}
			if (Static360.anInt1771 > local27) {
				Static360.anInt1771 -= (Static360.anInt1771 - local27) * Static213.anInt4389 / 1000 + Static394.anInt7573;
				if (Static360.anInt1771 < local27) {
					Static360.anInt1771 = local27;
				}
			}
			if (local19 < Static496.anInt9269) {
				Static496.anInt9269 -= Static394.anInt7573 + Static213.anInt4389 * (Static496.anInt9269 - local19) / 1000;
				if (Static496.anInt9269 < local19) {
					Static496.anInt9269 = local19;
				}
			}
		}
		local19 = Static480.anInt8972 * 512 + 256;
		local13 = Static464.anInt8682 * 512 + 256;
		local27 = Static274.method4782(local19, Static212.anInt4380, local13) - Static439.anInt8397;
		@Pc(231) int local231 = local13 - Static594.anInt10391;
		@Pc(236) int local236 = local27 - Static360.anInt1771;
		@Pc(241) int local241 = local19 - Static496.anInt9269;
		@Pc(252) int local252 = (int) Math.sqrt((double) (local241 * local241 + local231 * local231));
		@Pc(263) int local263 = (int) (Math.atan2((double) local236, (double) local252) * 2607.5945876176133D) & 0x3FFF;
		if (local263 < 1024) {
			local263 = 1024;
		}
		@Pc(279) int local279 = (int) (Math.atan2((double) local231, (double) local241) * -2607.5945876176133D) & 0x3FFF;
		if (local263 > 3072) {
			local263 = 3072;
		}
		if (local263 > Static522.anInt9554) {
			Static522.anInt9554 += Static34.anInt967 + Static332.anInt6909 * (local263 - Static522.anInt9554 >> 3) / 1000 << 3;
			if (local263 < Static522.anInt9554) {
				Static522.anInt9554 = local263;
			}
		}
		if (Static522.anInt9554 > local263) {
			Static522.anInt9554 -= Static34.anInt967 + Static332.anInt6909 * (Static522.anInt9554 - local263 >> 3) / 1000 << 3;
			if (Static522.anInt9554 < local263) {
				Static522.anInt9554 = local263;
			}
		}
		@Pc(352) int local352 = local279 - Static104.anInt2511;
		if (local352 > 8192) {
			local352 -= 16384;
		}
		if (local352 < -8192) {
			local352 += 16384;
		}
		local352 >>= 0x3;
		if (local352 > 0) {
			Static104.anInt2511 += Static332.anInt6909 * local352 / 1000 + Static34.anInt967 << 3;
			Static104.anInt2511 &= 0x3FFF;
		}
		if (local352 < 0) {
			Static104.anInt2511 -= Static332.anInt6909 * -local352 / 1000 + Static34.anInt967 << 3;
			Static104.anInt2511 &= 0x3FFF;
		}
		@Pc(410) int local410 = local279 - Static104.anInt2511;
		if (local410 > 8192) {
			local410 -= 16384;
		}
		if (local410 < -8192) {
			local410 += 16384;
		}
		if (local410 < 0 && local352 > 0 || local410 > 0 && local352 < 0) {
			Static104.anInt2511 = local279;
		}
		Static235.anInt4860 = 0;
	}
}
