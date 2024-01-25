import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!ida", name = "B", descriptor = "I")
	public static int anInt4156;

	@OriginalMember(owner = "client!ida", name = "I", descriptor = "Lclient!iba;")
	public static Class140 aClass140_1;

	@OriginalMember(owner = "client!ida", name = "H", descriptor = "I")
	public static int anInt4160 = 0;

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(IIII)Z")
	public static boolean method3650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static219.method3784(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << Static339.anInt6128;
		@Pc(14) int local14 = arg2 << Static339.anInt6128;
		@Pc(23) int local23 = Static133.aClass59Array3[arg0].JA(arg1, arg2) - 1;
		@Pc(31) int local31 = local23 - (0x78 << Static339.anInt6128 - 7);
		@Pc(39) int local39 = local23 - (0xE6 << Static339.anInt6128 - 7);
		@Pc(47) int local47 = local23 - (0xEE << Static339.anInt6128 - 7);
		if (arg3 == 1) {
			if (local10 > Static170.anInt3628) {
				if (!Static502.method6781(local10, local23, local14)) {
					return false;
				}
				if (!Static502.method6781(local10, local23, local14 + Static108.anInt2068)) {
					return false;
				}
				if (!Static502.method6781(local10, local23, local14 + Static112.anInt2178)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static502.method6781(local10, local31, local14)) {
					return false;
				}
				if (!Static502.method6781(local10, local31, local14 + Static108.anInt2068)) {
					return false;
				}
				if (!Static502.method6781(local10, local31, local14 + Static112.anInt2178)) {
					return false;
				}
			}
			if (!Static502.method6781(local10, local39, local14)) {
				return false;
			} else if (Static502.method6781(local10, local39, local14 + Static108.anInt2068)) {
				return Static502.method6781(local10, local39, local14 + Static112.anInt2178);
			} else {
				return false;
			}
		} else if (arg3 == 2) {
			if (local14 < Static478.anInt8129) {
				if (!Static502.method6781(local10, local23, local14 + Static112.anInt2178)) {
					return false;
				}
				if (!Static502.method6781(local10 + Static108.anInt2068, local23, local14 + Static112.anInt2178)) {
					return false;
				}
				if (!Static502.method6781(local10 + Static112.anInt2178, local23, local14 + Static112.anInt2178)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static502.method6781(local10, local31, local14 + Static112.anInt2178)) {
					return false;
				}
				if (!Static502.method6781(local10 + Static108.anInt2068, local31, local14 + Static112.anInt2178)) {
					return false;
				}
				if (!Static502.method6781(local10 + Static112.anInt2178, local31, local14 + Static112.anInt2178)) {
					return false;
				}
			}
			if (!Static502.method6781(local10, local39, local14 + Static112.anInt2178)) {
				return false;
			} else if (Static502.method6781(local10 + Static108.anInt2068, local39, local14 + Static112.anInt2178)) {
				return Static502.method6781(local10 + Static112.anInt2178, local39, local14 + Static112.anInt2178);
			} else {
				return false;
			}
		} else if (arg3 == 4) {
			if (local10 < Static170.anInt3628) {
				if (!Static502.method6781(local10 + Static112.anInt2178, local23, local14)) {
					return false;
				}
				if (!Static502.method6781(local10 + Static112.anInt2178, local23, local14 + Static108.anInt2068)) {
					return false;
				}
				if (!Static502.method6781(local10 + Static112.anInt2178, local23, local14 + Static112.anInt2178)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static502.method6781(local10 + Static112.anInt2178, local31, local14)) {
					return false;
				}
				if (!Static502.method6781(local10 + Static112.anInt2178, local31, local14 + Static108.anInt2068)) {
					return false;
				}
				if (!Static502.method6781(local10 + Static112.anInt2178, local31, local14 + Static112.anInt2178)) {
					return false;
				}
			}
			if (!Static502.method6781(local10 + Static112.anInt2178, local39, local14)) {
				return false;
			} else if (Static502.method6781(local10 + Static112.anInt2178, local39, local14 + Static108.anInt2068)) {
				return Static502.method6781(local10 + Static112.anInt2178, local39, local14 + Static112.anInt2178);
			} else {
				return false;
			}
		} else if (arg3 == 8) {
			if (local14 > Static478.anInt8129) {
				if (!Static502.method6781(local10, local23, local14)) {
					return false;
				}
				if (!Static502.method6781(local10 + Static108.anInt2068, local23, local14)) {
					return false;
				}
				if (!Static502.method6781(local10 + Static112.anInt2178, local23, local14)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static502.method6781(local10, local31, local14)) {
					return false;
				}
				if (!Static502.method6781(local10 + Static108.anInt2068, local31, local14)) {
					return false;
				}
				if (!Static502.method6781(local10 + Static112.anInt2178, local31, local14)) {
					return false;
				}
			}
			if (!Static502.method6781(local10, local39, local14)) {
				return false;
			} else if (Static502.method6781(local10 + Static108.anInt2068, local39, local14)) {
				return Static502.method6781(local10 + Static112.anInt2178, local39, local14);
			} else {
				return false;
			}
		} else if (!Static502.method6781(local10 + Static108.anInt2068, local47, local14 + Static108.anInt2068)) {
			return false;
		} else if (arg3 == 16) {
			return Static502.method6781(local10, local39, local14 + Static112.anInt2178);
		} else if (arg3 == 32) {
			return Static502.method6781(local10 + Static112.anInt2178, local39, local14 + Static112.anInt2178);
		} else if (arg3 == 64) {
			return Static502.method6781(local10 + Static112.anInt2178, local39, local14);
		} else if (arg3 == 128) {
			return Static502.method6781(local10, local39, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(IIB)V")
	public static void method3653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static217.aFloat72 > Static217.aFloat73) {
			Static217.aFloat73 = (float) ((double) Static217.aFloat73 + (double) Static217.aFloat73 / 30.0D);
			if (Static217.aFloat72 < Static217.aFloat73) {
				Static217.aFloat73 = Static217.aFloat72;
			}
			Static125.method7473();
			Static217.anInt3828 = (int) Static217.aFloat73 >> 1;
			Static217.aByteArrayArrayArray18 = Static8.method202(Static217.anInt3828);
		} else if (Static217.aFloat73 > Static217.aFloat72) {
			Static217.aFloat73 = (float) ((double) Static217.aFloat73 - (double) Static217.aFloat73 / 30.0D);
			if (Static217.aFloat72 > Static217.aFloat73) {
				Static217.aFloat73 = Static217.aFloat72;
			}
			Static125.method7473();
			Static217.anInt3828 = (int) Static217.aFloat73 >> 1;
			Static217.aByteArrayArrayArray18 = Static8.method202(Static217.anInt3828);
		}
		if (Static29.anInt856 != -1 && Static562.anInt9257 != -1) {
			@Pc(79) int local79 = Static29.anInt856 - Static39.anInt4953;
			if (local79 < 2 || local79 > 2) {
				local79 /= 8;
			}
			@Pc(96) int local96 = Static562.anInt9257 - Static538.anInt8915;
			Static39.anInt4953 -= -local79;
			if (local96 < 2 || local96 > 2) {
				local96 /= 8;
			}
			Static538.anInt8915 -= -local96;
			if (local79 == 0 && local96 == 0) {
				Static562.anInt9257 = -1;
				Static29.anInt856 = -1;
			}
			Static125.method7473();
		}
		if (Static186.anInt3869 > 0) {
			Static230.anInt4710--;
			if (Static230.anInt4710 == 0) {
				Static230.anInt4710 = 100;
				Static186.anInt3869--;
			}
		} else {
			Static538.anInt8920 = -1;
			Static29.anInt860 = -1;
		}
		if (!Static335.aBoolean429 || Static243.aClass361_38 == null) {
			return;
		}
		for (@Pc(168) Class6_Sub30 local168 = (Class6_Sub30) Static243.aClass361_38.method7838(); local168 != null; local168 = (Class6_Sub30) Static243.aClass361_38.method7845()) {
			@Pc(177) Class176 local177 = Static217.aClass213_2.method5127(local168.aClass6_Sub17_1.anInt2970);
			if (local168.method4679(arg0, arg1)) {
				if (local177.aStringArray14 != null) {
					if (local177.aStringArray14[4] != null) {
						Static142.method7766(false, true, -1, 1007, local177.aStringArray14[4], (long) local168.aClass6_Sub17_1.anInt2970, local177.aString39, 0, -1, local177.anInt5064);
					}
					if (local177.aStringArray14[3] != null) {
						Static142.method7766(false, true, -1, 1008, local177.aStringArray14[3], (long) local168.aClass6_Sub17_1.anInt2970, local177.aString39, 0, -1, local177.anInt5064);
					}
					if (local177.aStringArray14[2] != null) {
						Static142.method7766(false, true, -1, 1003, local177.aStringArray14[2], (long) local168.aClass6_Sub17_1.anInt2970, local177.aString39, 0, -1, local177.anInt5064);
					}
					if (local177.aStringArray14[1] != null) {
						Static142.method7766(false, true, -1, 1010, local177.aStringArray14[1], (long) local168.aClass6_Sub17_1.anInt2970, local177.aString39, 0, -1, local177.anInt5064);
					}
					if (local177.aStringArray14[0] != null) {
						Static142.method7766(false, true, -1, 1012, local177.aStringArray14[0], (long) local168.aClass6_Sub17_1.anInt2970, local177.aString39, 0, -1, local177.anInt5064);
					}
				}
				if (!local168.aClass6_Sub17_1.aBoolean212) {
					local168.aClass6_Sub17_1.aBoolean212 = true;
					Static446.method6330(Static83.aClass261_2, local168.aClass6_Sub17_1.anInt2970, local177.anInt5064);
				}
				if (local168.aClass6_Sub17_1.aBoolean212) {
					Static446.method6330(Static146.aClass261_3, local168.aClass6_Sub17_1.anInt2970, local177.anInt5064);
				}
			} else if (local168.aClass6_Sub17_1.aBoolean212) {
				local168.aClass6_Sub17_1.aBoolean212 = false;
				Static446.method6330(Static526.aClass261_10, local168.aClass6_Sub17_1.anInt2970, local177.anInt5064);
			}
		}
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(BLclient!rr;II)V")
	public static void method3654(@OriginalArg(1) Class292 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static302.aClass292_5 = arg0;
		Static588.anInt2165 = arg2;
		Static40.anInt1005 = arg1;
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method3655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg1 == arg6) {
			Static565.method5600(arg4, arg3, arg6, arg0, arg2, arg5);
		} else if (Static13.anInt7634 <= arg3 - arg6 && Static461.anInt7899 >= arg3 + arg6 && arg5 - arg1 >= Static583.anInt9478 && Static415.anInt9494 >= arg5 + arg1) {
			Static479.method6619(arg3, arg6, arg5, arg1, arg0, arg4, arg2);
		} else {
			Static324.method6169(arg2, arg1, arg3, arg6, arg4, arg5, arg0);
		}
	}
}
