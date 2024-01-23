import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!th", name = "j", descriptor = "I")
	public static int anInt4864 = -1;

	@OriginalMember(owner = "client!th", name = "db", descriptor = "S")
	public static short aShort30 = 1;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!rf;IIIIIIZ)V")
	public static void method3885(@OriginalArg(0) Class147 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		@Pc(3) int local3 = arg0.anIntArray414.length;
		@Pc(5) int local5;
		@Pc(15) int local15;
		@Pc(22) int local22;
		@Pc(29) int local29;
		@Pc(39) int local39;
		for (local5 = 0; local5 < local3; local5++) {
			local15 = arg0.anIntArray414[local5] - Static175.anInt3456;
			local22 = arg0.anIntArray412[local5] - Static27.anInt1303;
			local29 = arg0.anIntArray411[local5] - Static165.anInt3299;
			local39 = local29 * arg3 + local15 * arg4 >> 16;
			@Pc(49) int local49 = local29 * arg4 - local15 * arg3 >> 16;
			@Pc(61) int local61 = local22 * arg2 - local49 * arg1 >> 16;
			@Pc(71) int local71 = local22 * arg1 + local49 * arg2 >> 16;
			if (local71 < 50) {
				return;
			}
			if (arg0.anIntArray408 != null) {
				Static228.anIntArray404[local5] = local39;
				Static228.anIntArray415[local5] = local61;
				Static228.anIntArray407[local5] = local71;
			}
			Static228.anIntArray406[local5] = Static204.anInt3986 + (local39 << 9) / local71;
			Static228.anIntArray413[local5] = Static204.anInt3985 + (local61 << 9) / local71;
		}
		Static204.anInt3983 = 0;
		local3 = arg0.anIntArray409.length;
		for (local5 = 0; local5 < local3; local5++) {
			local15 = arg0.anIntArray409[local5];
			local22 = arg0.anIntArray418[local5];
			local29 = arg0.anIntArray417[local5];
			local39 = Static228.anIntArray406[local15];
			@Pc(148) int local148 = Static228.anIntArray406[local22];
			@Pc(152) int local152 = Static228.anIntArray406[local29];
			@Pc(156) int local156 = Static228.anIntArray413[local15];
			@Pc(160) int local160 = Static228.anIntArray413[local22];
			@Pc(164) int local164 = Static228.anIntArray413[local29];
			if ((local39 - local148) * (local164 - local160) - (local156 - local160) * (local152 - local148) > 0) {
				if (Static125.aBoolean177 && Static185.method2905(Static243.anInt4645 + Static204.anInt3986, Static217.anInt4313 + Static204.anInt3985, local156, local160, local164, local39, local148, local152)) {
					Static173.anInt3434 = arg5;
					Static247.anInt4704 = arg6;
				}
				if (!Static178.aBoolean216 && !arg7) {
					Static204.aBoolean258 = false;
					if (local39 < 0 || local148 < 0 || local152 < 0 || local39 > Static204.anInt3984 || local148 > Static204.anInt3984 || local152 > Static204.anInt3984) {
						Static204.aBoolean258 = true;
					}
					if (arg0.anIntArray408 == null || arg0.anIntArray408[local5] == -1) {
						if (arg0.anIntArray405[local5] != 12345678) {
							Static204.method3221(local156, local160, local164, local39, local148, local152, arg0.anIntArray405[local5], arg0.anIntArray410[local5], arg0.anIntArray416[local5]);
						}
					} else if (!Static105.aBoolean162) {
						@Pc(373) int local373 = Static204.anInterface2_1.method1979(arg0.anIntArray408[local5]);
						Static204.method3221(local156, local160, local164, local39, local148, local152, Static185.method2903(local373, arg0.anIntArray405[local5]), Static185.method2903(local373, arg0.anIntArray410[local5]), Static185.method2903(local373, arg0.anIntArray416[local5]));
					} else if (arg0.aBoolean297) {
						Static204.method3233(local156, local160, local164, local39, local148, local152, arg0.anIntArray405[local5], arg0.anIntArray410[local5], arg0.anIntArray416[local5], Static228.anIntArray404[0], Static228.anIntArray404[1], Static228.anIntArray404[3], Static228.anIntArray415[0], Static228.anIntArray415[1], Static228.anIntArray415[3], Static228.anIntArray407[0], Static228.anIntArray407[1], Static228.anIntArray407[3], arg0.anIntArray408[local5]);
					} else {
						Static204.method3233(local156, local160, local164, local39, local148, local152, arg0.anIntArray405[local5], arg0.anIntArray410[local5], arg0.anIntArray416[local5], Static228.anIntArray404[local15], Static228.anIntArray404[local22], Static228.anIntArray404[local29], Static228.anIntArray415[local15], Static228.anIntArray415[local22], Static228.anIntArray415[local29], Static228.anIntArray407[local15], Static228.anIntArray407[local22], Static228.anIntArray407[local29], arg0.anIntArray408[local5]);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIII)I")
	public static int method3888(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(11) int local11 = 65536 - Class131.anIntArray353[arg0 * 1024 / arg3] >> 1;
		return (local11 * arg2 >> 16) + (arg1 * (65536 - local11) >> 16);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II[Lclient!cc;)V")
	public static void method3891(@OriginalArg(1) int arg0, @OriginalArg(2) Class22[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(23) Class22 local23 = arg1[local7];
			if (local23 != null) {
				if (local23.anInt542 == 0) {
					if (local23.aClass22Array1 != null) {
						method3891(arg0, local23.aClass22Array1);
					}
					@Pc(49) Class4_Sub10 local49 = (Class4_Sub10) Static227.aClass97_16.method2360((long) local23.anInt596);
					if (local49 != null) {
						Static114.method1938(local49.anInt1032, arg0);
					}
				}
				@Pc(67) Class4_Sub22 local67;
				if (arg0 == 0 && local23.anObjectArray22 != null) {
					local67 = new Class4_Sub22();
					local67.anObjectArray32 = local23.anObjectArray22;
					local67.aClass22_15 = local23;
					Static125.method2089(local67);
				}
				if (arg0 == 1 && local23.anObjectArray30 != null) {
					if (local23.anInt561 >= 0) {
						@Pc(91) Class22 local91 = Static21.method3453(local23.anInt596);
						if (local91 == null || local91.aClass22Array1 == null || local91.aClass22Array1.length <= local23.anInt561 || local23 != local91.aClass22Array1[local23.anInt561]) {
							continue;
						}
					}
					local67 = new Class4_Sub22();
					local67.anObjectArray32 = local23.anObjectArray30;
					local67.aClass22_15 = local23;
					Static125.method2089(local67);
				}
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIILclient!en;IJZ)Z")
	public static boolean method3892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class12 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return Static177.method2746(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BIC)C")
	public static char method3899(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		if (arg1 >= 'À' && arg1 <= 'ÿ') {
			label131: {
				if (arg1 >= 'À' && arg1 <= 'Æ') {
					return 'A';
				}
				if (arg1 == 'Ç') {
					return 'C';
				}
				if (arg1 >= 'È' && arg1 <= 'Ë') {
					return 'E';
				}
				if (arg1 >= 'Ì' && arg1 <= 'Ï') {
					return 'I';
				}
				if (arg1 == 'Ñ' && arg0 != 0) {
					return 'N';
				}
				if (arg1 >= 'Ò' && arg1 <= 'Ö') {
					return 'O';
				}
				if (arg1 >= 'Ù' && arg1 <= 'Ü') {
					return 'U';
				}
				if (arg1 == 'Ý') {
					return 'Y';
				}
				if (arg1 != 'ß') {
					if (arg1 >= 'à' && arg1 <= 'æ') {
						return 'a';
					}
					if (arg1 == 'ç') {
						return 'c';
					}
					if (arg1 >= 'è' && arg1 <= 'ë') {
						return 'e';
					}
					if (arg1 >= 'ì' && arg1 <= 'ï') {
						return 'i';
					}
					if (arg1 == 'ñ' && arg0 != 0) {
						return 'n';
					}
					if (arg1 >= 'ò' && arg1 <= 'ö') {
						return 'o';
					}
					if (arg1 >= 'ù' && arg1 <= 'ü') {
						return 'u';
					}
					if (arg1 != 'ý' && arg1 != 'ÿ') {
						break label131;
					}
					return 'y';
				}
				return 's';
			}
		}
		if (arg1 == 'Œ') {
			return 'O';
		} else if (arg1 == 'œ') {
			return 'o';
		} else if (arg1 == 'Ÿ') {
			return 'Y';
		} else {
			return arg1;
		}
	}
}
