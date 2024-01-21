import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!wb", name = "M", descriptor = "[I")
	public static int[] anIntArray358;

	@OriginalMember(owner = "client!wb", name = "T", descriptor = "Lclient!ce;")
	public static Class11_Sub1 aClass11_Sub1_19;

	@OriginalMember(owner = "client!wb", name = "E", descriptor = "Lclient!wd;")
	private static Class80 aClass80_1054 = Static2.method59("Checking for updates )2 ");

	@OriginalMember(owner = "client!wb", name = "W", descriptor = "Lclient!wd;")
	private static Class80 aClass80_1055 = Static2.method59("Players");

	@OriginalMember(owner = "client!wb", name = "bb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1056 = aClass80_1055;

	@OriginalMember(owner = "client!wb", name = "ub", descriptor = "Z")
	public static boolean aBoolean209 = false;

	@OriginalMember(owner = "client!wb", name = "zb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1057 = aClass80_1054;

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V")
	public static void method1749() {
		aClass80_1055 = null;
		aClass80_1054 = null;
		aClass11_Sub1_19 = null;
		anIntArray358 = null;
		aClass80_1057 = null;
		aClass80_1056 = null;
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V")
	public static void method1750() {
		for (@Pc(3) int local3 = 0; local3 < Static93.anInt2410; local3++) {
			@Pc(14) int local14 = Static16.anIntArray68[local3];
			@Pc(18) Class2_Sub1_Sub1_Sub4_Sub1 local18 = Static35.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local14];
			@Pc(22) int local22 = Static100.aClass2_Sub17_Sub1_1.method1780();
			if ((local22 & 0x2) != 0) {
				local18.aClass80_918 = Static100.aClass2_Sub17_Sub1_1.method1797();
				local18.anInt2328 = 100;
			}
			@Pc(53) int local53;
			if ((local22 & 0x10) != 0) {
				local18.anInt2362 = Static100.aClass2_Sub17_Sub1_1.method1779();
				local53 = Static100.aClass2_Sub17_Sub1_1.method1747();
				local18.anInt2331 = local53 >> 16;
				local18.anInt2379 = (local53 & 0xFFFF) + Static10.anInt300;
				local18.anInt2372 = 0;
				if (Static10.anInt300 < local18.anInt2379) {
					local18.anInt2372 = -1;
				}
				local18.anInt2343 = 0;
				if (local18.anInt2362 == 65535) {
					local18.anInt2362 = -1;
				}
			}
			if ((local22 & 0x20) != 0) {
				local18.aClass2_Sub1_Sub13_1 = Static23.method462(Static100.aClass2_Sub17_Sub1_1.method1756());
				local18.anInt2318 = local18.aClass2_Sub1_Sub13_1.anInt2576;
				local18.anInt2335 = local18.aClass2_Sub1_Sub13_1.anInt2566;
				local18.anInt2333 = local18.aClass2_Sub1_Sub13_1.anInt2567;
				local18.anInt2364 = local18.aClass2_Sub1_Sub13_1.anInt2573;
				local18.anInt2329 = local18.aClass2_Sub1_Sub13_1.anInt2577;
				local18.anInt2330 = local18.aClass2_Sub1_Sub13_1.anInt2574;
				local18.anInt2352 = local18.aClass2_Sub1_Sub13_1.anInt2580;
				local18.anInt2326 = local18.aClass2_Sub1_Sub13_1.anInt2552;
				local18.anInt2345 = local18.aClass2_Sub1_Sub13_1.anInt2553;
			}
			if ((local22 & 0x4) != 0) {
				local18.anInt2319 = Static100.aClass2_Sub17_Sub1_1.method1756();
				if (local18.anInt2319 == 65535) {
					local18.anInt2319 = -1;
				}
			}
			if ((local22 & 0x8) != 0) {
				local18.anInt2348 = Static100.aClass2_Sub17_Sub1_1.method1783();
				local18.anInt2368 = Static100.aClass2_Sub17_Sub1_1.method1779();
			}
			@Pc(195) int local195;
			if ((local22 & 0x40) != 0) {
				local53 = Static100.aClass2_Sub17_Sub1_1.method1780();
				local195 = Static100.aClass2_Sub17_Sub1_1.method1751();
				local18.method1430(local195, local53, Static10.anInt300);
				local18.anInt2378 = Static10.anInt300 + 300;
				local18.anInt2338 = Static100.aClass2_Sub17_Sub1_1.method1780();
				local18.anInt2371 = Static100.aClass2_Sub17_Sub1_1.method1770();
			}
			if ((local22 & 0x80) != 0) {
				local53 = Static100.aClass2_Sub17_Sub1_1.method1770();
				local195 = Static100.aClass2_Sub17_Sub1_1.method1770();
				local18.method1430(local195, local53, Static10.anInt300);
				local18.anInt2378 = Static10.anInt300 + 300;
				local18.anInt2338 = Static100.aClass2_Sub17_Sub1_1.method1789();
				local18.anInt2371 = Static100.aClass2_Sub17_Sub1_1.method1780();
			}
			if ((local22 & 0x1) != 0) {
				local53 = Static100.aClass2_Sub17_Sub1_1.method1790();
				local195 = Static100.aClass2_Sub17_Sub1_1.method1780();
				if (local53 == 65535) {
					local53 = -1;
				}
				if (local53 == local18.anInt2374 && local53 != -1) {
					@Pc(339) int local339 = Static93.method1443(local53).anInt1346;
					if (local339 == 1) {
						local18.anInt2358 = 0;
						local18.anInt2339 = 0;
						local18.anInt2361 = 0;
						local18.anInt2353 = local195;
					}
					if (local339 == 2) {
						local18.anInt2361 = 0;
					}
				} else if (local53 == -1 || local18.anInt2374 == -1 || Static93.method1443(local53).anInt1356 >= Static93.method1443(local18.anInt2374).anInt1356) {
					local18.anInt2339 = 0;
					local18.anInt2361 = 0;
					local18.anInt2353 = local195;
					local18.anInt2365 = local18.anInt2382;
					local18.anInt2358 = 0;
					local18.anInt2374 = local53;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(Z)V")
	public static void method1755() {
		Static61.aClass32_35.method878();
		Static2.aClass32_4.method878();
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIBIIII)Z")
	public static boolean method1778(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		if (!Static122.method1969(arg0)) {
			return false;
		}
		Static44.aClass2_Sub1_Sub17Array1 = null;
		@Pc(30) boolean local30 = Static15.method248(arg3, 0, 0, 0, arg1, Static51.aClass2_Sub1_Sub17ArrayArray1[arg0], 0, arg2, -1);
		if (Static44.aClass2_Sub1_Sub17Array1 != null) {
			Static15.method248(arg3, 0, Static44.anInt1349, Static44.anInt1342, arg1, Static44.aClass2_Sub1_Sub17Array1, 0, arg2, -1412584499);
		}
		return local30;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!se;I)V")
	public static void method1782(@OriginalArg(0) Class2_Sub1_Sub1_Sub4 arg0) {
		arg0.anInt2351 = arg0.anInt2352;
		if (arg0.anInt2382 == 0) {
			arg0.anInt2336 = 0;
			return;
		}
		if (arg0.anInt2374 != -1 && arg0.anInt2353 == 0) {
			@Pc(31) Class2_Sub1_Sub8 local31 = Static93.method1443(arg0.anInt2374);
			if (arg0.anInt2365 > 0 && local31.anInt1347 == 0) {
				arg0.anInt2336++;
				return;
			}
			if (arg0.anInt2365 <= 0 && local31.anInt1360 == 0) {
				arg0.anInt2336++;
				return;
			}
		}
		@Pc(79) int local79 = arg0.anIntArray312[arg0.anInt2382 - 1] * 128 + arg0.anInt2364 * 64;
		@Pc(82) int local82 = arg0.anInt2370;
		@Pc(85) int local85 = arg0.anInt2324;
		@Pc(100) int local100 = arg0.anIntArray309[arg0.anInt2382 - 1] * 128 + arg0.anInt2364 * 64;
		if (local79 - local82 > 256 || local79 - local82 < -256 || local100 - local85 > 256 || local100 - local85 < -256) {
			arg0.anInt2324 = local100;
			arg0.anInt2370 = local79;
			return;
		}
		@Pc(135) int local135 = arg0.anInt2333;
		@Pc(137) int local137 = 4;
		if (local79 <= local82) {
			if (local79 < local82) {
				if (local85 < local100) {
					arg0.anInt2375 = 768;
				} else if (local85 > local100) {
					arg0.anInt2375 = 256;
				} else {
					arg0.anInt2375 = 512;
				}
			} else if (local85 < local100) {
				arg0.anInt2375 = 1024;
			} else if (local85 > local100) {
				arg0.anInt2375 = 0;
			}
		} else if (local85 < local100) {
			arg0.anInt2375 = 1280;
		} else if (local100 >= local85) {
			arg0.anInt2375 = 1536;
		} else {
			arg0.anInt2375 = 1792;
		}
		@Pc(219) int local219 = arg0.anInt2375 - arg0.anInt2347 & 0x7FF;
		if (local219 > 1024) {
			local219 -= 2048;
		}
		@Pc(227) boolean local227 = true;
		if (local219 >= -256 && local219 <= 256) {
			local135 = arg0.anInt2318;
		} else if (local219 >= 256 && local219 < 768) {
			local135 = arg0.anInt2326;
		} else if (local219 >= -768 && local219 <= -256) {
			local135 = arg0.anInt2345;
		}
		if (local135 == -1) {
			local135 = arg0.anInt2318;
		}
		arg0.anInt2351 = local135;
		if (arg0 instanceof Class2_Sub1_Sub1_Sub4_Sub1) {
			local227 = ((Class2_Sub1_Sub1_Sub4_Sub1) arg0).aClass2_Sub1_Sub13_1.aBoolean192;
		}
		if (local227) {
			if (arg0.anInt2375 != arg0.anInt2347 && arg0.anInt2319 == -1 && arg0.anInt2335 != 0) {
				local137 = 2;
			}
			if (arg0.anInt2382 > 2) {
				local137 = 6;
			}
			if (arg0.anInt2382 > 3) {
				local137 = 8;
			}
			if (arg0.anInt2336 > 0 && arg0.anInt2382 > 1) {
				arg0.anInt2336--;
				local137 = 8;
			}
		} else {
			if (arg0.anInt2382 > 1) {
				local137 = 6;
			}
			if (arg0.anInt2382 > 2) {
				local137 = 8;
			}
			if (arg0.anInt2336 > 0 && arg0.anInt2382 > 1) {
				arg0.anInt2336--;
				local137 = 8;
			}
		}
		if (arg0.aBooleanArray14[arg0.anInt2382 - 1]) {
			local137 <<= 0x1;
		}
		if (local100 > local85) {
			arg0.anInt2324 += local137;
			if (arg0.anInt2324 > local100) {
				arg0.anInt2324 = local100;
			}
		} else if (local85 > local100) {
			arg0.anInt2324 -= local137;
			if (local100 > arg0.anInt2324) {
				arg0.anInt2324 = local100;
			}
		}
		if (local79 > local82) {
			arg0.anInt2370 += local137;
			if (local79 < arg0.anInt2370) {
				arg0.anInt2370 = local79;
			}
		} else if (local82 > local79) {
			arg0.anInt2370 -= local137;
			if (local79 > arg0.anInt2370) {
				arg0.anInt2370 = local79;
			}
		}
		if (arg0.anInt2370 == local79 && local100 == arg0.anInt2324) {
			if (arg0.anInt2365 > 0) {
				arg0.anInt2365--;
			}
			arg0.anInt2382--;
		}
		if (local137 >= 8 && arg0.anInt2351 == arg0.anInt2318 && arg0.anInt2356 != -1) {
			arg0.anInt2351 = arg0.anInt2356;
		}
	}
}
