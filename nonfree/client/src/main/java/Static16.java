import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "Lclient!pg;")
	public static Class1_Sub12_Sub3 aClass1_Sub12_Sub3_2;

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
	public static int anInt1098;

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
	public static int anInt1099;

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "Lclient!ki;")
	public static Class1_Sub12_Sub2 aClass1_Sub12_Sub2_2;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "Lclient!ig;")
	public static final Class47 aClass47_5 = new Class47(100);

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_432 = Static187.method3089("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "[I")
	public static final int[] anIntArray86 = new int[] { 5, 0, 0, 0, 8, 0, 0, 0, 0, -2, -1, 0, 0, 0, 6, 0, 0, 0, 0, -1, -1, 5, 3, 0, 0, 0, 0, 2, -1, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 6, 20, 0, 0, 0, 2, 0, 0, 0, 12, 4, 0, 0, 0, 1, 0, 4, 0, 0, 0, 0, 0, 0, 14, 6, 7, 0, -2, 0, 4, 0, 6, 0, 0, 4, 4, 5, 0, -2, -2, 9, 10, 0, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 3, 0, 3, 0, 2, 0, 2, 0, 0, 5, 0, -1, 0, 0, 0, 5, 3, 0, 2, 0, 0, 0, 0, 1, 0, 0, 7, 0, 0, 0, 0, 6, -1, -1, 0, 6, 0, -1, 0, 0, 0, 6, 0, 5, 0, -2, 0, 0, 3, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, -2, -1, -1, -2, 2, 0, 6, 0, 0, 0, 0, -2, 0, 0, 0, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 24, 0, 0, 0, 10, 8, 0, -1, 4, -2, 0, 0, 0, 6, 0, 0, -2, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_433 = Static187.method3089(":assist:");

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "Lclient!ig;")
	public static final Class47 aClass47_6 = new Class47(64);

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIII)Z")
	public static boolean method738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static196.method3212(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(24) int local24 = Static73.anIntArrayArrayArray3[arg0][arg1][arg2] - 1;
		@Pc(28) int local28 = local24 - 120;
		@Pc(32) int local32 = local24 - 230;
		@Pc(36) int local36 = local24 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static59.anInt1427) {
					if (!Static169.method2639(local10, local24, local14)) {
						return false;
					}
					if (!Static169.method2639(local10, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static169.method2639(local10, local28, local14)) {
						return false;
					}
					if (!Static169.method2639(local10, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static169.method2639(local10, local32, local14)) {
					return false;
				}
				if (!Static169.method2639(local10, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static205.anInt4447) {
					if (!Static169.method2639(local10, local24, local14 + 128)) {
						return false;
					}
					if (!Static169.method2639(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static169.method2639(local10, local28, local14 + 128)) {
						return false;
					}
					if (!Static169.method2639(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static169.method2639(local10, local32, local14 + 128)) {
					return false;
				}
				if (!Static169.method2639(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static59.anInt1427) {
					if (!Static169.method2639(local10 + 128, local24, local14)) {
						return false;
					}
					if (!Static169.method2639(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static169.method2639(local10 + 128, local28, local14)) {
						return false;
					}
					if (!Static169.method2639(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static169.method2639(local10 + 128, local32, local14)) {
					return false;
				}
				if (!Static169.method2639(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static205.anInt4447) {
					if (!Static169.method2639(local10, local24, local14)) {
						return false;
					}
					if (!Static169.method2639(local10 + 128, local24, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static169.method2639(local10, local28, local14)) {
						return false;
					}
					if (!Static169.method2639(local10 + 128, local28, local14)) {
						return false;
					}
				}
				if (!Static169.method2639(local10, local32, local14)) {
					return false;
				}
				if (!Static169.method2639(local10 + 128, local32, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static169.method2639(local10 + 64, local36, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static169.method2639(local10, local32, local14 + 128);
		} else if (arg3 == 32) {
			return Static169.method2639(local10 + 128, local32, local14 + 128);
		} else if (arg3 == 64) {
			return Static169.method2639(local10 + 128, local32, local14);
		} else if (arg3 == 128) {
			return Static169.method2639(local10, local32, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIII)V")
	public static void method742(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = 0;
		Static41.method731(arg0);
		@Pc(12) int local12 = arg0;
		@Pc(15) int local15 = -arg0;
		@Pc(19) int local19 = arg0 - arg1;
		if (local19 < 0) {
			local19 = 0;
		}
		@Pc(29) int local29 = -local19;
		@Pc(31) int local31 = -1;
		@Pc(50) int local50;
		@Pc(58) int local58;
		@Pc(67) int local67;
		@Pc(76) int local76;
		if (arg4 >= Static118.anInt2521 && Static204.anInt2389 >= arg4) {
			@Pc(41) int[] local41 = Static142.anIntArrayArray25[arg4];
			local50 = Static19.method429(Static102.anInt2207, arg3 - arg0, Static116.anInt2488);
			local58 = Static19.method429(Static102.anInt2207, arg3 + arg0, Static116.anInt2488);
			local67 = Static19.method429(Static102.anInt2207, arg3 - local19, Static116.anInt2488);
			local76 = Static19.method429(Static102.anInt2207, arg3 + local19, Static116.anInt2488);
			Static74.method1123(local50, arg5, local41, local67);
			Static74.method1123(local67, arg2, local41, local76);
			Static74.method1123(local76, arg5, local41, local58);
		}
		@Pc(98) int local98 = local19;
		@Pc(100) int local100 = -1;
		while (local3 < local12) {
			local100 += 2;
			local29 += local100;
			local31 += 2;
			if (local29 >= 0 && local98 >= 1) {
				local98--;
				local29 -= local98 << 1;
				Static83.anIntArray154[local98] = local3;
			}
			local3++;
			local15 += local31;
			@Pc(252) int local252;
			@Pc(261) int local261;
			@Pc(268) int[] local268;
			@Pc(154) int local154;
			if (local15 >= 0) {
				local12--;
				local50 = local12 + arg4;
				local15 -= local12 << 1;
				local154 = arg4 - local12;
				if (Static118.anInt2521 <= local50 && Static204.anInt2389 >= local154) {
					if (local19 <= local12) {
						local58 = Static19.method429(Static102.anInt2207, arg3 + local3, Static116.anInt2488);
						local67 = Static19.method429(Static102.anInt2207, arg3 - local3, Static116.anInt2488);
						if (Static204.anInt2389 >= local50) {
							Static74.method1123(local67, arg5, Static142.anIntArrayArray25[local50], local58);
						}
						if (local154 >= Static118.anInt2521) {
							Static74.method1123(local67, arg5, Static142.anIntArrayArray25[local154], local58);
						}
					} else {
						local58 = Static83.anIntArray154[local12];
						local67 = Static19.method429(Static102.anInt2207, arg3 + local3, Static116.anInt2488);
						local76 = Static19.method429(Static102.anInt2207, arg3 - local3, Static116.anInt2488);
						local252 = Static19.method429(Static102.anInt2207, arg3 + local58, Static116.anInt2488);
						local261 = Static19.method429(Static102.anInt2207, arg3 - local58, Static116.anInt2488);
						if (local50 <= Static204.anInt2389) {
							local268 = Static142.anIntArrayArray25[local50];
							Static74.method1123(local76, arg5, local268, local261);
							Static74.method1123(local261, arg2, local268, local252);
							Static74.method1123(local252, arg5, local268, local67);
						}
						if (local154 >= Static118.anInt2521) {
							local268 = Static142.anIntArrayArray25[local154];
							Static74.method1123(local76, arg5, local268, local261);
							Static74.method1123(local261, arg2, local268, local252);
							Static74.method1123(local252, arg5, local268, local67);
						}
					}
				}
			}
			local154 = arg4 - local3;
			local50 = local3 + arg4;
			if (local50 >= Static118.anInt2521 && Static204.anInt2389 >= local154) {
				local67 = arg3 - local12;
				local58 = arg3 + local12;
				if (local58 >= Static102.anInt2207 && Static116.anInt2488 >= local67) {
					local58 = Static19.method429(Static102.anInt2207, local58, Static116.anInt2488);
					local67 = Static19.method429(Static102.anInt2207, local67, Static116.anInt2488);
					if (local19 > local3) {
						local76 = local98 < local3 ? Static83.anIntArray154[local3] : local98;
						local252 = Static19.method429(Static102.anInt2207, arg3 + local76, Static116.anInt2488);
						local261 = Static19.method429(Static102.anInt2207, arg3 - local76, Static116.anInt2488);
						if (Static204.anInt2389 >= local50) {
							local268 = Static142.anIntArrayArray25[local50];
							Static74.method1123(local67, arg5, local268, local261);
							Static74.method1123(local261, arg2, local268, local252);
							Static74.method1123(local252, arg5, local268, local58);
						}
						if (local154 >= Static118.anInt2521) {
							local268 = Static142.anIntArrayArray25[local154];
							Static74.method1123(local67, arg5, local268, local261);
							Static74.method1123(local261, arg2, local268, local252);
							Static74.method1123(local252, arg5, local268, local58);
						}
					} else {
						if (Static204.anInt2389 >= local50) {
							Static74.method1123(local67, arg5, Static142.anIntArrayArray25[local50], local58);
						}
						if (local154 >= Static118.anInt2521) {
							Static74.method1123(local67, arg5, Static142.anIntArrayArray25[local154], local58);
						}
					}
				}
			}
		}
	}
}
