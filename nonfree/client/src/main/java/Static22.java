import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!bg", name = "x", descriptor = "Lclient!pk;")
	public static Class132 aClass132_7;

	@OriginalMember(owner = "client!bg", name = "S", descriptor = "I")
	public static int anInt617;

	@OriginalMember(owner = "client!bg", name = "C", descriptor = "I")
	public static volatile int anInt604 = 0;

	@OriginalMember(owner = "client!bg", name = "P", descriptor = "Lclient!ok;")
	public static Class125 aClass125_8 = new Class125(128);

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIF[[FLclient!td;IIII[[I[[IIIZI[[F[[FI)I")
	public static int method400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[][] arg3, @OriginalArg(4) Class8_Sub29 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int[][] arg9, @OriginalArg(10) int[][] arg10, @OriginalArg(11) int arg11, @OriginalArg(13) boolean arg12, @OriginalArg(14) int arg13, @OriginalArg(15) float[][] arg14, @OriginalArg(16) float[][] arg15, @OriginalArg(17) int arg16) {
		@Pc(12) int local12;
		if (arg11 == 1) {
			local12 = arg8;
			arg8 = arg7;
			arg7 = 128 - local12;
		} else if (arg11 == 2) {
			arg8 = 128 - arg8;
			arg7 = 128 - arg7;
		} else if (arg11 == 3) {
			local12 = arg8;
			arg8 = 128 - arg7;
			arg7 = local12;
		}
		@Pc(66) float local66;
		@Pc(78) float local78;
		@Pc(60) int local60;
		@Pc(72) float local72;
		if (arg8 == 0 && arg7 == 0) {
			local60 = arg16;
			local66 = arg14[arg13][arg5];
			local72 = arg15[arg13][arg5];
			local78 = arg3[arg13][arg5];
		} else if (arg8 == 128 && arg7 == 0) {
			local72 = arg15[arg13 + 1][arg5];
			local66 = arg14[arg13 + 1][arg5];
			local60 = arg6;
			local78 = arg3[arg13 + 1][arg5];
		} else if (arg8 == 128 && arg7 == 128) {
			local66 = arg14[arg13 + 1][arg5 + 1];
			local60 = arg0;
			local78 = arg3[arg13 + 1][arg5 + 1];
			local72 = arg15[arg13 + 1][arg5 + 1];
		} else if (arg8 == 0 && arg7 == 128) {
			local72 = arg15[arg13][arg5 + 1];
			local78 = arg3[arg13][arg5 + 1];
			local60 = arg1;
			local66 = arg14[arg13][arg5 + 1];
		} else {
			local66 = arg14[arg13][arg5];
			@Pc(113) float local113 = (float) arg8 / 128.0F;
			local78 = arg3[arg13][arg5];
			@Pc(133) float local133 = local66 + (arg14[arg13 + 1][arg5] - local66) * local113;
			@Pc(148) float local148 = local78 + local113 * (arg3[arg13 + 1][arg5] - local78);
			local72 = arg15[arg13][arg5];
			@Pc(159) float local159 = (float) arg7 / 128.0F;
			@Pc(174) float local174 = local72 + local113 * (arg15[arg13 + 1][arg5] - local72);
			@Pc(182) float local182 = arg15[arg13][arg5 + 1];
			@Pc(199) float local199 = local182 + (arg15[arg13 + 1][arg5 + 1] - local182) * local113;
			@Pc(207) float local207 = arg3[arg13][arg5 + 1];
			@Pc(215) float local215 = arg14[arg13][arg5 + 1];
			@Pc(231) float local231 = local207 + (arg3[arg13 + 1][arg5 + 1] - local207) * local113;
			local72 = local174 + (local199 - local174) * local159;
			local78 = local148 + (local231 - local148) * local159;
			@Pc(265) float local265 = local215 + (arg14[arg13 + 1][arg5 + 1] - local215) * local113;
			@Pc(271) int local271 = Static127.method2065(arg6, arg16, arg8);
			local66 = local133 + (local265 - local133) * local159;
			@Pc(286) int local286 = Static127.method2065(arg0, arg1, arg8);
			local60 = Static127.method2065(local286, local271, arg7);
		}
		@Pc(388) int local388 = arg8 + (arg13 << 7);
		@Pc(395) int local395 = (arg5 << 7) + arg7;
		@Pc(405) int local405 = Static9.method82(arg13, arg8, arg10, arg7, arg5);
		return arg4.method3785(local388, local405, local395, local72, local66, local78, arg12 ? local60 & 0xFFFFFF00 : local60, arg9 == null ? 0.0F : (float) (local405 - Static9.method82(arg13, arg8, arg9, arg7, arg5)) / arg2);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BIIII)Lclient!k;")
	public static Class91 method402(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(31) long local31 = (long) arg3 & 0xFFFFL | ((long) arg1 & 0xFFFFL) << 16 | ((long) arg0 & 0xFFFFL) << 48 | ((long) arg2 & 0xFFFFL) << 32;
		@Pc(37) Class91 local37 = (Class91) Static260.aClass61_49.method1384(local31);
		if (local37 != null) {
			return local37;
		}
		@Pc(46) Class81 local46 = Static199.method3081(arg3);
		@Pc(48) Class109[] local48 = null;
		if (local46.anIntArray187 != null) {
			local48 = new Class109[local46.anIntArray187.length];
			for (@Pc(60) int local60 = 0; local60 < local48.length; local60++) {
				@Pc(71) Class23 local71 = Static219.method3422(local46.anIntArray187[local60]);
				local48[local60] = new Class109(local71.anInt760, local71.anInt763, local71.anInt752, local71.anInt762, local71.anInt755, local71.anInt761, local71.anInt751, local71.aBoolean49);
			}
		}
		local37 = new Class91(local46.anInt2319, local48, local46.anInt2314, arg0, arg2, arg1);
		Static260.aClass61_49.method1377(local31, local37);
		return local37;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZIZLclient!pk;Lclient!pk;)Lclient!wf;")
	public static Class8_Sub1_Sub22 method403(@OriginalArg(1) int arg0, @OriginalArg(3) Class132 arg1, @OriginalArg(4) Class132 arg2) {
		@Pc(3) boolean local3 = true;
		@Pc(12) int[] local12 = arg1.method3167(arg0);
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(30) byte[] local30 = arg1.method3184(arg0, local12[local14]);
			if (local30 == null) {
				local3 = false;
			} else {
				@Pc(50) int local50 = local30[1] & 0xFF | (local30[0] & 0xFF) << 8;
				@Pc(58) byte[] local58 = arg2.method3184(local50, 0);
				if (local58 == null) {
					local3 = false;
				}
			}
		}
		if (!local3) {
			return null;
		}
		try {
			return new Class8_Sub1_Sub22(arg1, arg2, arg0, false);
		} catch (@Pc(87) Exception local87) {
			return null;
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)V")
	public static void method404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static299.aBoolean481 = true;
		Static74.anInt1607 = arg0;
		Static214.anInt4400 = arg1;
		Static89.anInt1906 = arg2;
		Static23.anInt621 = -1;
		Static101.anInt2132 = -1;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIII)V")
	public static void method405(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static116.aBoolean188) {
			Static126.method1993(arg3, arg2, arg0 + arg3, arg1 + arg2);
			Static126.method1994(arg3, arg2, arg0, arg1, 0);
		} else {
			Static103.method1680(arg3, arg2, arg3 + arg0, arg2 - -arg1);
			Static103.method1664(arg3, arg2, arg0, arg1, 0);
		}
		if (Static286.anInt5464 < 100) {
			return;
		}
		if (Static78.aClass8_Sub1_Sub7_3 == null || arg0 != Static78.aClass8_Sub1_Sub7_3.anInt3602 || arg1 != Static78.aClass8_Sub1_Sub7_3.anInt3603) {
			@Pc(70) Class8_Sub1_Sub7_Sub1 local70 = new Class8_Sub1_Sub7_Sub1(arg0, arg1);
			Static103.method1675(local70.anIntArray150, arg0, arg1);
			Static54.method866(arg0, 0, 0, 0, Static156.anInt3157, arg1, Static221.anInt4539, 0);
			if (Static116.aBoolean188) {
				Static78.aClass8_Sub1_Sub7_3 = new Class8_Sub1_Sub7_Sub2(local70);
			} else {
				Static78.aClass8_Sub1_Sub7_3 = local70;
			}
			if (Static116.aBoolean188) {
				Static103.anIntArray155 = null;
			} else {
				Static99.aClass4_1.method3760();
			}
		}
		Static78.aClass8_Sub1_Sub7_3.method2806(arg3, arg2);
		@Pc(117) int local117 = arg0 * Static169.anInt3408 / Static156.anInt3157 + arg3;
		@Pc(123) int local123 = Static285.anInt5596 * arg1 / Static221.anInt4539;
		@Pc(131) int local131 = arg1 * Static73.anInt1576 / Static221.anInt4539 + arg2;
		@Pc(133) int local133 = 16711680;
		@Pc(139) int local139 = arg0 * Static162.anInt3357 / Static156.anInt3157;
		if (Static198.anInt3914 == 1) {
			local133 = 16777215;
		}
		if (Static116.aBoolean188) {
			Static126.method2000(local117, local131, local139, local123, local133, 128);
			Static126.method2004(local117, local131, local139, local123, local133);
		} else {
			Static103.method1678(local117, local131, local139, local123, local133, 128);
			Static103.method1669(local117, local131, local139, local123, local133);
		}
		if (Static189.anInt3789 <= 0) {
			return;
		}
		@Pc(191) int local191;
		if (Static3.anInt4882 > 10) {
			local191 = (20 - Static3.anInt4882) * 25;
		} else {
			local191 = Static3.anInt4882 * 25;
		}
		for (@Pc(202) Class8_Sub22 local202 = (Class8_Sub22) Static245.aClass182_27.method4319(); local202 != null; local202 = (Class8_Sub22) Static245.aClass182_27.method4329()) {
			if (Static58.anInt2236 == local202.anInt3446) {
				@Pc(223) int local223 = arg3 + arg0 * local202.anInt3441 / Static156.anInt3157;
				@Pc(233) int local233 = arg2 + arg1 * local202.anInt3445 / Static221.anInt4539;
				if (Static116.aBoolean188) {
					Static126.method2000(local223 - 2, local233 + -2, 4, 4, 16776960, local191);
				} else {
					Static103.method1678(local223 - 2, local233 - 2, 4, 4, 16776960, local191);
				}
			}
		}
	}
}
