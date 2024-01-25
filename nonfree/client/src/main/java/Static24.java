import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!bi", name = "g", descriptor = "Lclient!wo;")
	public static Class216 aClass216_6;

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString15 = null;

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
	public static int anInt942 = 0;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIILclient!uo;Lclient!gd;I)V")
	public static void method663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class32 arg3, @OriginalArg(5) Interface2 arg4, @OriginalArg(6) int arg5) {
		if (Static243.anInt4977 < 100) {
			Static101.method2110(arg4, arg3);
		}
		arg3.method2226(arg1, arg2, arg5 + arg1, arg2 + arg0);
		@Pc(31) int local31;
		@Pc(51) int local51;
		if (Static243.anInt4977 < 100) {
			local31 = arg1 + arg5 / 2;
			arg3.method2241(arg1, arg2, arg5, arg0, -16777216, 0);
			local51 = arg2 + arg0 / 2 - 18 - 20;
			arg3.method2200(local31 - 152, local51, 304, 34, Static143.aColorArray2[Static170.anInt3644].getRGB(), 0);
			arg3.method2241(local31 - 150, local51 + 2, Static243.anInt4977 * 3, 30, Static268.aColorArray3[Static170.anInt3644].getRGB(), 0);
			Static49.aClass9_1.method5019(-1, local31, Static20.aColorArray1[Static170.anInt3644].getRGB(), local51 + 20, Static143.aClass34_100.method1285(Static259.anInt2907));
			return;
		}
		@Pc(107) int local107 = Static62.anInt1771 - (int) ((float) arg5 / Static79.aFloat49);
		local31 = (int) ((float) arg0 / Static79.aFloat49) + Static169.anInt3636;
		local51 = Static62.anInt1771 + (int) ((float) arg5 / Static79.aFloat49);
		Static115.anInt2634 = (int) ((float) (arg0 * 2) / Static79.aFloat49);
		Static31.anInt1091 = (int) ((float) (arg5 * 2) / Static79.aFloat49);
		Static320.anInt5325 = Static169.anInt3636 - (int) ((float) arg0 / Static79.aFloat49);
		Static106.anInt2535 = Static62.anInt1771 - (int) ((float) arg5 / Static79.aFloat49);
		@Pc(165) int local165 = Static169.anInt3636 - (int) ((float) arg0 / Static79.aFloat49);
		Static79.method3762(local107 + Static79.anInt4162, local31 - -Static79.anInt4157, Static79.anInt4162 + local51, Static79.anInt4157 + local165, arg1, arg2, arg5 + arg1, arg0 + (arg2 - -1));
		Static79.method3749(arg3);
		@Pc(194) Class16 local194 = Static79.method3761(arg3);
		Static176.method3472(local194, arg3);
		if (Static339.anInt6507 > 0) {
			Static139.anInt4713--;
			if (Static139.anInt4713 == 0) {
				Static139.anInt4713 = 20;
				Static339.anInt6507--;
			}
		}
		if (!Static33.aBoolean105) {
			return;
		}
		@Pc(225) int local225 = arg5 + arg1 - 5;
		@Pc(231) int local231 = arg0 + arg2 - 8;
		Static212.aClass9_3.method5023(local225, local231, "Fps:" + anInt942, 16776960);
		@Pc(246) int local246 = local231 - 15;
		@Pc(248) Runtime local248 = Runtime.getRuntime();
		@Pc(257) int local257 = (int) ((local248.totalMemory() - local248.freeMemory()) / 1024L);
		@Pc(259) int local259 = 16776960;
		if (local257 > 65536) {
			local259 = 16711680;
		}
		Static212.aClass9_3.method5023(local225, local246, "Mem:" + local257 + "k", local259);
		local231 = local246 - 15;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)Lclient!hm;")
	public static Class62 method665() {
		try {
			return new Class62_Sub3();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class62) Class.forName("Class62_Sub1").getDeclaredConstructor().newInstance();
			} catch (@Pc(14) Throwable local14) {
				return new Class62_Sub2();
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I[I[ILclient!be;[I)V")
	public static void method666(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class17_Sub1_Sub1_Sub1 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg3.length; local3++) {
			@Pc(9) int local9 = arg3[local3];
			@Pc(13) int local13 = arg1[local3];
			@Pc(17) int local17 = arg0[local3];
			for (@Pc(19) int local19 = 0; local13 != 0 && arg2.aClass184Array3.length > local19; local19++) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg2.aClass184Array3[local19] = null;
					} else {
						@Pc(33) Class24 local33 = Static110.method5411(local9);
						@Pc(36) int local36 = local33.anInt1037;
						@Pc(41) Class184 local41 = arg2.aClass184Array3[local19];
						if (local41 != null) {
							if (local9 == local41.anInt5656) {
								if (local36 == 0) {
									local41 = arg2.aClass184Array3[local19] = null;
								} else if (local36 == 1) {
									local41.anInt5657 = 1;
									local41.anInt5658 = 0;
									local41.anInt5662 = local17;
									local41.anInt5660 = 0;
									local41.anInt5659 = 0;
									Static318.method5216(arg2.anInt5109, arg2.anInt5108, arg2 == Static198.aClass17_Sub1_Sub1_Sub1_3, local33, 0);
								} else if (local36 == 2) {
									local41.anInt5660 = 0;
								}
							} else if (local33.anInt1051 >= Static110.method5411(local41.anInt5656).anInt1051) {
								local41 = arg2.aClass184Array3[local19] = null;
							}
						}
						if (local41 == null) {
							local41 = arg2.aClass184Array3[local19] = new Class184();
							local41.anInt5658 = 0;
							local41.anInt5659 = 0;
							local41.anInt5656 = local9;
							local41.anInt5662 = local17;
							local41.anInt5660 = 0;
							local41.anInt5657 = 1;
							Static318.method5216(arg2.anInt5109, arg2.anInt5108, Static198.aClass17_Sub1_Sub1_Sub1_3 == arg2, local33, 0);
						}
					}
				}
				local13 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
	public static void method667() {
		if (Static7.aClass148_1 != null) {
			Static7.aClass148_1.method4123();
			Static7.aClass148_1 = null;
		}
		Static334.method5421();
		Static263.method4659();
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Static29.aClass71Array1[local17].method1945();
		}
		Static130.method2653(false);
		System.gc();
		Static180.method3550();
		Static93.anInt2303 = -1;
		Static82.aBoolean192 = false;
		Static237.method4338(true);
		Static234.anInt4783 = 0;
		Static124.anInt2811 = 0;
		Static314.aBoolean592 = false;
		Static224.anInt4654 = 0;
		Static32.anInt2224 = 0;
		for (@Pc(60) int local60 = 0; local60 < Static340.aClass105Array1.length; local60++) {
			Static340.aClass105Array1[local60] = null;
		}
		Static357.anInt4331 = 0;
		Static5.anInt200 = 0;
		for (@Pc(81) int local81 = 0; local81 < 2048; local81++) {
			Static102.aClass17_Sub1_Sub1_Sub1Array1[local81] = null;
			Static313.aClass1_Sub8Array1[local81] = null;
		}
		for (@Pc(97) int local97 = 0; local97 < 32768; local97++) {
			Static140.aClass17_Sub1_Sub1_Sub2Array1[local97] = null;
		}
		Static339.aClass197_30.method5155();
		Static319.method5224();
		Static190.anInt4079 = 0;
		Static178.method3528();
		Static280.method4867();
		Static46.method1281();
		Static112.method2422(true);
		try {
			Static359.method1280(Static15.aClass143_1.anApplet1, "loggedout");
		} catch (@Pc(133) Throwable local133) {
		}
	}
}
