import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!r", name = "q", descriptor = "I")
	public static int anInt709;

	@OriginalMember(owner = "client!r", name = "I", descriptor = "I")
	public static int anInt722;

	@OriginalMember(owner = "client!r", name = "c", descriptor = "Lclient!tg;")
	private static Class81 aClass81_242 = Static120.method2057("Please enter your username)3");

	@OriginalMember(owner = "client!r", name = "e", descriptor = "I")
	public static int anInt700 = 0;

	@OriginalMember(owner = "client!r", name = "f", descriptor = "Lclient!tg;")
	public static Class81 aClass81_243 = aClass81_242;

	@OriginalMember(owner = "client!r", name = "h", descriptor = "Lclient!tg;")
	public static Class81 aClass81_244 = Static120.method2057("::qa_op_test");

	@OriginalMember(owner = "client!r", name = "m", descriptor = "I")
	public static final int anInt706 = 7759444;

	@OriginalMember(owner = "client!r", name = "o", descriptor = "Lclient!tg;")
	private static Class81 aClass81_245 = Static120.method2057("Please wait )2 attempting to reestablish)3");

	@OriginalMember(owner = "client!r", name = "t", descriptor = "Z")
	public static boolean aBoolean23 = false;

	@OriginalMember(owner = "client!r", name = "K", descriptor = "Lclient!tg;")
	private static Class81 aClass81_250 = Static120.method2057("shake:");

	@OriginalMember(owner = "client!r", name = "C", descriptor = "Lclient!tg;")
	public static Class81 aClass81_246 = aClass81_250;

	@OriginalMember(owner = "client!r", name = "D", descriptor = "Lclient!tg;")
	public static Class81 aClass81_247 = Static120.method2057("(U");

	@OriginalMember(owner = "client!r", name = "F", descriptor = "Lclient!tg;")
	public static Class81 aClass81_248 = aClass81_245;

	@OriginalMember(owner = "client!r", name = "H", descriptor = "Lclient!tg;")
	public static Class81 aClass81_249 = aClass81_250;

	@OriginalMember(owner = "client!r", name = "U", descriptor = "[Lclient!gf;")
	public static Class28[] aClass28Array2 = new Class28[4];

	@OriginalMember(owner = "client!r", name = "W", descriptor = "Lclient!tg;")
	public static Class81 aClass81_251 = Static120.method2057("nav");

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIII)V")
	public static void method594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static23.anInt583 == 1) {
			Static173.aClass1_Sub2_Sub2_Sub3Array11[Static173.anInt4002 / 100].method2130(Static114.anInt2144 - 8, Static21.anInt537 + -8);
		}
		if (Static23.anInt583 == 2) {
			Static173.aClass1_Sub2_Sub2_Sub3Array11[Static173.anInt4002 / 100 + 4].method2130(Static114.anInt2144 - 8, Static21.anInt537 + -8);
		}
		Static132.method2250();
		if (!Static67.aBoolean65) {
			return;
		}
		@Pc(51) int local51 = arg1 + 20;
		@Pc(55) int local55 = arg3 + 507;
		Static160.aClass1_Sub2_Sub2_Sub2_Sub1_5.method1947(Static127.method2169(new Class81[] { Static52.aClass81_447, Static149.method2548(anInt700) }), local55, local51, 16776960, -1);
		@Pc(77) Runtime local77 = Runtime.getRuntime();
		@Pc(86) int local86 = (int) ((local77.totalMemory() - local77.freeMemory()) / 1024L);
		@Pc(88) int local88 = 16776960;
		if (local86 > 32768 && Static50.aBoolean45) {
			local88 = 16711680;
		}
		local51 += 15;
		if (local86 > 65536 && !Static50.aBoolean45) {
			local88 = 16711680;
		}
		Static160.aClass1_Sub2_Sub2_Sub2_Sub1_5.method1947(Static127.method2169(new Class81[] { Static171.aClass81_1384, Static149.method2548(local86), Static86.aClass81_672 }), local55, local51, local88, -1);
		local51 += 15;
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(B)V")
	public static void method598() {
		aClass81_244 = null;
		aClass81_242 = null;
		aClass81_249 = null;
		aClass28Array2 = null;
		aClass81_248 = null;
		aClass81_251 = null;
		aClass81_246 = null;
		aClass81_245 = null;
		aClass81_250 = null;
		aClass81_247 = null;
		aClass81_243 = null;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BIII)V")
	public static void method603(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static19.anInt487 == 0 || arg0 == 0 || Static81.anInt1859 >= 50 || arg1 == -1) {
			return;
		}
		Static166.anIntArray399[Static81.anInt1859] = arg1;
		Static116.anIntArray276[Static81.anInt1859] = arg0;
		Static175.anIntArray308[Static81.anInt1859] = arg2;
		Static157.aClass21Array1[Static81.anInt1859] = null;
		Static51.anIntArray103[Static81.anInt1859] = 0;
		Static81.anInt1859++;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BLclient!de;)V")
	public static void method607(@OriginalArg(1) Class1_Sub2_Sub1_Sub3 arg0) {
		arg0.anInt3054 = arg0.anInt3009;
		if (arg0.anInt3011 == 0) {
			arg0.anInt3062 = 0;
			return;
		}
		if (arg0.anInt3024 != -1 && arg0.anInt3037 == 0) {
			@Pc(31) Class1_Sub2_Sub18 local31 = Static73.method1277(arg0.anInt3024);
			if (arg0.anInt3045 > 0 && local31.anInt3788 == 0) {
				arg0.anInt3062++;
				return;
			}
			if (arg0.anInt3045 <= 0 && local31.anInt3806 == 0) {
				arg0.anInt3062++;
				return;
			}
		}
		@Pc(69) int local69 = arg0.anInt3040;
		@Pc(84) int local84 = arg0.anIntArray326[arg0.anInt3011 - 1] * 128 + arg0.anInt3051 * 64;
		@Pc(99) int local99 = arg0.anInt3051 * 64 + arg0.anIntArray324[arg0.anInt3011 - 1] * 128;
		@Pc(102) int local102 = arg0.anInt3026;
		if (local84 - local69 > 256 || local84 - local69 < -256 || local99 - local102 > 256 || local99 - local102 < -256) {
			arg0.anInt3026 = local99;
			arg0.anInt3040 = local84;
			return;
		}
		if (local84 > local69) {
			if (local99 > local102) {
				arg0.anInt3049 = 1280;
			} else if (local102 > local99) {
				arg0.anInt3049 = 1792;
			} else {
				arg0.anInt3049 = 1536;
			}
		} else if (local69 <= local84) {
			if (local99 > local102) {
				arg0.anInt3049 = 1024;
			} else if (local99 < local102) {
				arg0.anInt3049 = 0;
			}
		} else if (local99 > local102) {
			arg0.anInt3049 = 768;
		} else if (local102 <= local99) {
			arg0.anInt3049 = 512;
		} else {
			arg0.anInt3049 = 256;
		}
		@Pc(207) boolean local207 = true;
		@Pc(210) int local210 = arg0.anInt3017;
		@Pc(212) int local212 = 4;
		@Pc(225) int local225 = arg0.anInt3049 - arg0.anInt3048 & 0x7FF;
		if (local225 > 1024) {
			local225 -= 2048;
		}
		if (local225 >= -256 && local225 <= 256) {
			local210 = arg0.anInt3034;
		} else if (local225 >= 256 && local225 < 768) {
			local210 = arg0.anInt3036;
		} else if (local225 >= -768 && local225 <= -256) {
			local210 = arg0.anInt3033;
		}
		if (local210 == -1) {
			local210 = arg0.anInt3034;
		}
		arg0.anInt3054 = local210;
		if (arg0 instanceof Class1_Sub2_Sub1_Sub3_Sub2) {
			local207 = ((Class1_Sub2_Sub1_Sub3_Sub2) arg0).aClass1_Sub2_Sub5_1.aBoolean34;
		}
		if (local207) {
			if (arg0.anInt3048 != arg0.anInt3049 && arg0.anInt3052 == -1 && arg0.anInt3041 != 0) {
				local212 = 2;
			}
			if (arg0.anInt3011 > 2) {
				local212 = 6;
			}
			if (arg0.anInt3011 > 3) {
				local212 = 8;
			}
			if (arg0.anInt3062 > 0 && arg0.anInt3011 > 1) {
				arg0.anInt3062--;
				local212 = 8;
			}
		} else {
			if (arg0.anInt3011 > 1) {
				local212 = 6;
			}
			if (arg0.anInt3011 > 2) {
				local212 = 8;
			}
			if (arg0.anInt3062 > 0 && arg0.anInt3011 > 1) {
				arg0.anInt3062--;
				local212 = 8;
			}
		}
		if (arg0.aBooleanArray15[arg0.anInt3011 - 1]) {
			local212 <<= 0x1;
		}
		if (local212 >= 8 && arg0.anInt3034 == arg0.anInt3054 && arg0.anInt3010 != -1) {
			arg0.anInt3054 = arg0.anInt3010;
		}
		if (local69 < local84) {
			arg0.anInt3040 += local212;
			if (arg0.anInt3040 > local84) {
				arg0.anInt3040 = local84;
			}
		} else if (local84 < local69) {
			arg0.anInt3040 -= local212;
			if (local84 > arg0.anInt3040) {
				arg0.anInt3040 = local84;
			}
		}
		if (local99 > local102) {
			arg0.anInt3026 += local212;
			if (arg0.anInt3026 > local99) {
				arg0.anInt3026 = local99;
			}
		} else if (local102 > local99) {
			arg0.anInt3026 -= local212;
			if (arg0.anInt3026 < local99) {
				arg0.anInt3026 = local99;
			}
		}
		if (local84 != arg0.anInt3040 || local99 != arg0.anInt3026) {
			return;
		}
		arg0.anInt3011--;
		if (arg0.anInt3045 > 0) {
			arg0.anInt3045--;
			return;
		}
	}
}
