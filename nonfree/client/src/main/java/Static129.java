import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!nb", name = "bb", descriptor = "[I")
	public static int[] anIntArray44;

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "Lclient!i;")
	public static Class41 aClass41_125 = Static184.method2923("hitmarks");

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "Lclient!i;")
	public static Class41 aClass41_126 = Static184.method2923("Speicher wird zugewiesen)3");

	@OriginalMember(owner = "client!nb", name = "L", descriptor = "Lclient!i;")
	public static Class41 aClass41_127 = Static184.method2923("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!nb", name = "V", descriptor = "I")
	public static int anInt566 = 0;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIII)Z")
	public static boolean method393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static212.method3258(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(24) int local24 = Static56.anIntArrayArrayArray7[arg0][arg1][arg2] - 1;
		@Pc(28) int local28 = local24 - 120;
		@Pc(32) int local32 = local24 - 230;
		@Pc(36) int local36 = local24 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static65.anInt1729) {
					if (!Static91.method1600(local10, local24, local14)) {
						return false;
					}
					if (!Static91.method1600(local10, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static91.method1600(local10, local28, local14)) {
						return false;
					}
					if (!Static91.method1600(local10, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static91.method1600(local10, local32, local14)) {
					return false;
				}
				if (!Static91.method1600(local10, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static191.anInt4374) {
					if (!Static91.method1600(local10, local24, local14 + 128)) {
						return false;
					}
					if (!Static91.method1600(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static91.method1600(local10, local28, local14 + 128)) {
						return false;
					}
					if (!Static91.method1600(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static91.method1600(local10, local32, local14 + 128)) {
					return false;
				}
				if (!Static91.method1600(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static65.anInt1729) {
					if (!Static91.method1600(local10 + 128, local24, local14)) {
						return false;
					}
					if (!Static91.method1600(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static91.method1600(local10 + 128, local28, local14)) {
						return false;
					}
					if (!Static91.method1600(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static91.method1600(local10 + 128, local32, local14)) {
					return false;
				}
				if (!Static91.method1600(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static191.anInt4374) {
					if (!Static91.method1600(local10, local24, local14)) {
						return false;
					}
					if (!Static91.method1600(local10 + 128, local24, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static91.method1600(local10, local28, local14)) {
						return false;
					}
					if (!Static91.method1600(local10 + 128, local28, local14)) {
						return false;
					}
				}
				if (!Static91.method1600(local10, local32, local14)) {
					return false;
				}
				if (!Static91.method1600(local10 + 128, local32, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static91.method1600(local10 + 64, local36, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static91.method1600(local10, local32, local14 + 128);
		} else if (arg3 == 32) {
			return Static91.method1600(local10 + 128, local32, local14 + 128);
		} else if (arg3 == 64) {
			return Static91.method1600(local10 + 128, local32, local14);
		} else if (arg3 == 128) {
			return Static91.method1600(local10, local32, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(JII[I)Lclient!i;")
	public static Class41 method400(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (Static219.anInterface4_1 != null) {
			@Pc(12) Class41 local12 = Static219.anInterface4_1.method2310(arg2, arg1, arg0);
			if (local12 != null) {
				return local12;
			}
		}
		return arg1 == 5 ? Static176.method2837(arg0).method1403() : Static208.method3217(arg0);
	}

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "(II)Lclient!i;")
	public static Class41 method408(@OriginalArg(1) int arg0) {
		@Pc(5) Class41 local5 = Static152.method2471(arg0);
		for (@Pc(15) int local15 = local5.method1393() - 3; local15 > 0; local15 -= 3) {
			local5 = Static149.method2324(new Class41[] { local5.method1412(0, local15), Static48.aClass41_401, local5.method1424(local15) });
		}
		if (local5.method1393() > 9) {
			return Static149.method2324(new Class41[] { Static133.aClass41_853, local5.method1412(0, local5.method1393() - 8), Static117.aClass41_805, Static61.aClass41_478, local5, Static185.aClass41_1124 });
		} else if (local5.method1393() > 6) {
			return Static149.method2324(new Class41[] { Static34.aClass41_248, local5.method1412(0, local5.method1393() - 4), Static144.aClass41_913, Static61.aClass41_478, local5, Static185.aClass41_1124 });
		} else {
			return Static149.method2324(new Class41[] { Static67.aClass41_554, local5, Static106.aClass41_760 });
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(III[Lclient!ia;IB[BZ)V")
	public static void method413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class42[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) byte[] arg5) {
		@Pc(13) int local13;
		@Pc(17) int local17;
		for (@Pc(9) int local9 = 0; local9 < 4; local9++) {
			for (local13 = 0; local13 < 64; local13++) {
				for (local17 = 0; local17 < 64; local17++) {
					if (local13 + arg1 > 0 && local13 + arg1 < 103 && local17 + arg4 > 0 && arg4 + local17 < 103) {
						arg3[local9].anIntArrayArray19[local13 + arg1][local17 + arg4] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(95) Class2_Sub3 local95 = new Class2_Sub3(arg5);
		for (local13 = 0; local13 < 4; local13++) {
			for (local17 = 0; local17 < 64; local17++) {
				for (@Pc(105) int local105 = 0; local105 < 64; local105++) {
					Static122.method2040(local17 + arg1, local95, arg0, arg2, local105 + arg4, 0, local13);
				}
			}
		}
	}
}
