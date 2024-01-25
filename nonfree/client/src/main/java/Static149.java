import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!hd", name = "m", descriptor = "Lclient!fr;")
	public static final Class91 aClass91_45 = new Class91(4);

	@OriginalMember(owner = "client!hd", name = "r", descriptor = "[I")
	public static final int[] anIntArray328 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(CIB)I")
	public static int method2366(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local7 = (arg0 << 4) + 1;
		}
		if (arg0 == 'ñ' && arg1 == 0) {
			local7 = 1762;
		}
		return local7;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIBIIII)V")
	public static void method2367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static105.anInt2417 <= arg5 && arg5 <= Static70.anInt1843 && arg1 >= Static105.anInt2417 && Static70.anInt1843 >= arg1 && Static105.anInt2417 <= arg2 && arg2 <= Static70.anInt1843 && arg8 >= Static105.anInt2417 && arg8 <= Static70.anInt1843 && Static362.anInt6654 <= arg6 && arg6 <= Static164.anInt6595 && arg4 >= Static362.anInt6654 && Static164.anInt6595 >= arg4 && arg7 >= Static362.anInt6654 && Static164.anInt6595 >= arg7 && arg3 >= Static362.anInt6654 && arg3 <= Static164.anInt6595) {
			Static80.method6094(arg6, arg3, arg1, arg7, arg5, arg2, arg4, arg0, arg8);
		} else {
			Static193.method3131(arg4, arg1, arg0, arg7, arg5, arg8, arg3, arg2, arg6);
		}
	}

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)V")
	public static void method2368() {
		Static4.aClass91_1.method1999();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIZII)V")
	public static void method2369(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static414.method5610(arg3)) {
			Static54.method1008(Static293.aClass68ArrayArray4[arg3], arg1, arg0, -1, arg2);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIIZII)Z")
	public static boolean method2370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 < arg5 + arg6 && arg2 + arg7 > arg5) {
			return arg3 < arg4 + arg1 && arg3 + arg0 > arg1;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZIII)V")
	public static void method2372(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!arg1 && arg3 == Static150.anInt3209 && Static76.anInt1937 == arg2 && (Static426.anInt1486 == Static313.anInt5847 || Static12.aClass34_Sub1_1.method5471(Static262.anInt2805))) {
			return;
		}
		Static150.anInt3209 = arg3;
		Static76.anInt1937 = arg2;
		Static313.anInt5847 = Static426.anInt1486;
		if (Static12.aClass34_Sub1_1.method5471(Static262.anInt2805)) {
			Static313.anInt5847 = 0;
		}
		Static118.method2017(arg0);
		Static338.method5238(true, Static374.aClass158_147.method3594(Static365.anInt6682), Static308.aClass20_5);
		@Pc(54) int local54 = Static278.anInt5374;
		Static278.anInt5374 = (Static150.anInt3209 - (Static209.anInt4283 >> 4)) * 8;
		@Pc(65) int local65 = Static380.anInt6896;
		Static380.anInt6896 = (Static76.anInt1937 - (Static211.anInt4295 >> 4)) * 8;
		Static264.aClass1_Sub1_Sub17_3 = Static377.method3854(Static150.anInt3209 * 8, Static76.anInt1937 * 8);
		Static90.aClass121_1 = null;
		@Pc(89) int local89 = Static278.anInt5374 - local54;
		@Pc(94) int local94 = Static380.anInt6896 - local65;
		@Pc(113) int local113;
		@Pc(115) int local115;
		@Pc(162) int local162;
		@Pc(265) int local265;
		if (arg0 == 10) {
			for (local265 = 0; local265 < Static127.anInt2832; local265++) {
				@Pc(270) Class1_Sub27 local270 = Static324.aClass1_Sub27Array2[local265];
				if (local270 != null) {
					@Pc(275) Class30_Sub1_Sub1_Sub1 local275 = local270.aClass30_Sub1_Sub1_Sub1_2;
					for (local115 = 0; local115 < 10; local115++) {
						local275.anIntArray130[local115] -= local89;
						local275.anIntArray129[local115] -= local94;
					}
					local275.anInt7490 -= local89 * 128;
					local275.anInt7488 -= local94 * 128;
				}
			}
		} else {
			Static197.anInt4078 = 0;
			@Pc(101) boolean local101 = false;
			@Pc(107) int local107 = Static209.anInt4283 * 128 - 128;
			local113 = Static211.anInt4295 * 128 - 128;
			for (local115 = 0; local115 < Static127.anInt2832; local115++) {
				@Pc(120) Class1_Sub27 local120 = Static324.aClass1_Sub27Array2[local115];
				if (local120 != null) {
					@Pc(125) Class30_Sub1_Sub1_Sub1 local125 = local120.aClass30_Sub1_Sub1_Sub1_2;
					local125.anInt7488 -= local94 * 128;
					local125.anInt7490 -= local89 * 128;
					if (local125.anInt7490 >= 0 && local107 >= local125.anInt7490 && local125.anInt7488 >= 0 && local125.anInt7488 <= local113) {
						@Pc(160) boolean local160 = true;
						for (local162 = 0; local162 < 10; local162++) {
							local125.anIntArray130[local162] -= local89;
							local125.anIntArray129[local162] -= local94;
							if (local125.anIntArray130[local162] < 0 || local125.anIntArray130[local162] >= Static209.anInt4283 || local125.anIntArray129[local162] < 0 || local125.anIntArray129[local162] >= Static211.anInt4295) {
								local160 = false;
							}
						}
						if (local160) {
							Static415.anIntArray701[Static197.anInt4078++] = local125.anInt1299;
						} else {
							local125.method666(null);
							local101 = true;
							local120.method6178();
						}
					} else {
						local125.method666(null);
						local101 = true;
						local120.method6178();
					}
				}
			}
			if (local101) {
				Static127.anInt2832 = Static24.aClass38_3.method770();
				Static24.aClass38_3.method772(Static324.aClass1_Sub27Array2);
			}
		}
		for (local265 = 0; local265 < 2048; local265++) {
			@Pc(331) Class30_Sub1_Sub1_Sub2 local331 = Static135.aClass30_Sub1_Sub1_Sub2Array1[local265];
			if (local331 != null) {
				for (local113 = 0; local113 < 10; local113++) {
					local331.anIntArray130[local113] -= local89;
					local331.anIntArray129[local113] -= local94;
				}
				local331.anInt7490 -= local89 * 128;
				local331.anInt7488 -= local94 * 128;
			}
		}
		@Pc(378) Class178[] local378 = Static393.aClass178Array1;
		for (local113 = 0; local113 < local378.length; local113++) {
			@Pc(385) Class178 local385 = local378[local113];
			if (local385 != null) {
				local385.anInt5273 -= local94 * 128;
				local385.anInt5272 -= local89 * 128;
			}
		}
		for (@Pc(413) Class1_Sub40 local413 = (Class1_Sub40) Static239.aClass203_37.method4548(); local413 != null; local413 = (Class1_Sub40) Static239.aClass203_37.method4545()) {
			local413.anInt6627 -= local94;
			local413.anInt6621 -= local89;
			if (Static367.anInt6719 != 4 && (local413.anInt6621 < 0 || local413.anInt6627 < 0 || Static209.anInt4283 <= local413.anInt6621 || Static211.anInt4295 <= local413.anInt6627)) {
				local413.method6178();
			}
		}
		if (Static367.anInt6719 != 4) {
			for (@Pc(468) Class1_Sub14 local468 = (Class1_Sub14) Static156.aClass38_16.method767(); local468 != null; local468 = (Class1_Sub14) Static156.aClass38_16.method773()) {
				@Pc(475) int local475 = (int) (local468.aLong228 & 0x3FFFL);
				@Pc(480) int local480 = local475 - Static278.anInt5374;
				local162 = (int) (local468.aLong228 >> 14 & 0x3FFFL);
				@Pc(493) int local493 = local162 - Static380.anInt6896;
				if (local480 < 0 || local493 < 0 || Static209.anInt4283 <= local480 || Static211.anInt4295 <= local493) {
					local468.method6178();
				}
			}
		}
		if (Static270.anInt5251 != 0) {
			Static270.anInt5251 -= local89;
			Static57.anInt1519 -= local94;
		}
		Static2.method40();
		if (arg0 != 10) {
			Static342.anInt6261 -= local89;
			Static325.anInt6023 -= local89;
			Static78.anInt1973 -= local94 * 128;
			Static41.anInt1051 -= local94;
			Static272.anInt5269 -= local94;
			Static378.anInt6885 -= local89 * 128;
			if (Math.abs(local89) > Static209.anInt4283 || Math.abs(local94) > Static211.anInt4295) {
				Static448.method6102();
			}
		} else if (Static21.anInt6762 == 4) {
			Static162.anInt3418 -= local89 * 128;
			Static459.anInt7963 -= local94 * 128;
			Static224.anInt7016 -= local89 * 128;
			Static323.anInt5976 -= local94 * 128;
		} else {
			Static21.anInt6762 = 1;
		}
		Static259.method3826();
		Static249.method3728();
		Static184.aClass203_32.method4553();
		Static398.aClass203_46.method4553();
		Static367.aClass117_8.method2960();
		Static130.method2138();
	}
}
