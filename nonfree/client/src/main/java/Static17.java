import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!bd", name = "J", descriptor = "I")
	public static int anInt431;

	@OriginalMember(owner = "client!bd", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString25 = "Loaded world list data";

	@OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
	public static volatile int anInt419 = 0;

	@OriginalMember(owner = "client!bd", name = "D", descriptor = "I")
	public static int anInt427 = -1;

	@OriginalMember(owner = "client!bd", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString26 = "Ok";

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V")
	public static void method353() {
		for (@Pc(10) Class2_Sub4 local10 = (Class2_Sub4) Static104.aClass1_10.method13(); local10 != null; local10 = (Class2_Sub4) Static104.aClass1_10.method9()) {
			if (local10.anInt396 > 0) {
				local10.anInt396--;
			}
			if (local10.anInt396 != 0) {
				if (local10.anInt391 > 0) {
					local10.anInt391--;
				}
				if (local10.anInt391 == 0 && local10.anInt405 >= 1 && local10.anInt389 >= 1 && local10.anInt405 <= 102 && local10.anInt389 <= 102 && (local10.anInt402 < 0 || Static101.method4819(local10.anInt402, local10.anInt404))) {
					Static293.method4860(local10.anInt405, local10.anInt402, local10.anInt390, local10.anInt395, local10.anInt389, local10.anInt404, local10.anInt400);
					local10.anInt391 = -1;
					if (local10.anInt402 == local10.anInt392 && local10.anInt392 == -1) {
						local10.method4926();
					} else if (local10.anInt392 == local10.anInt402 && local10.anInt395 == local10.anInt399 && local10.anInt404 == local10.anInt393) {
						local10.method4926();
					}
				}
			} else if (local10.anInt392 < 0 || Static101.method4819(local10.anInt392, local10.anInt393)) {
				Static293.method4860(local10.anInt405, local10.anInt392, local10.anInt390, local10.anInt399, local10.anInt389, local10.anInt393, local10.anInt400);
				local10.method4926();
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZLclient!kk;)V")
	public static void method355(@OriginalArg(1) Class36_Sub3_Sub1 arg0) {
		for (@Pc(15) Class2_Sub23 local15 = (Class2_Sub23) Static143.aClass1_12.method13(); local15 != null; local15 = (Class2_Sub23) Static143.aClass1_12.method9()) {
			if (local15.aClass36_Sub3_Sub1_1 == arg0) {
				if (local15.aClass2_Sub5_Sub2_1 != null) {
					Static43.aClass2_Sub5_Sub1_1.method404(local15.aClass2_Sub5_Sub2_1);
					local15.aClass2_Sub5_Sub2_1 = null;
				}
				local15.method4926();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIILclient!rc;II)V")
	public static void method358(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub23 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2.anInt4657 == -1 && arg2.anIntArray390 == null) {
			return;
		}
		@Pc(22) int local22 = 0;
		if (arg0 > arg2.anInt4663) {
			local22 = arg0 - arg2.anInt4663;
		} else if (arg2.anInt4650 > arg0) {
			local22 = arg2.anInt4650 - arg0;
		}
		@Pc(59) int local59 = Static144.anInt3122 * arg2.anInt4661 >> 8;
		if (arg2.anInt4662 < arg3) {
			local22 += arg3 - arg2.anInt4662;
		} else if (arg2.anInt4651 > arg3) {
			local22 += arg2.anInt4651 - arg3;
		}
		if (arg2.anInt4658 == 0 || arg2.anInt4658 < local22 - 64 || Static144.anInt3122 == 0 || arg2.anInt4653 != arg4) {
			if (arg2.aClass2_Sub5_Sub2_1 != null) {
				Static43.aClass2_Sub5_Sub1_1.method404(arg2.aClass2_Sub5_Sub2_1);
				arg2.aClass2_Sub5_Sub2_1 = null;
			}
			if (arg2.aClass2_Sub5_Sub2_2 != null) {
				Static43.aClass2_Sub5_Sub1_1.method404(arg2.aClass2_Sub5_Sub2_2);
				arg2.aClass2_Sub5_Sub2_2 = null;
			}
			return;
		}
		local22 -= 64;
		if (local22 < 0) {
			local22 = 0;
		}
		@Pc(156) int local156 = local59 * (arg2.anInt4658 - local22) / arg2.anInt4658;
		if (arg2.aClass2_Sub5_Sub2_1 != null) {
			arg2.aClass2_Sub5_Sub2_1.method1787(local156);
		} else if (arg2.anInt4657 >= 0) {
			@Pc(174) Class30 local174 = Static304.method647(Static115.aClass84_50, arg2.anInt4657, 0);
			if (local174 != null) {
				@Pc(182) Class2_Sub9_Sub1 local182 = local174.method646().method1941(Static171.aClass9_1);
				@Pc(187) Class2_Sub5_Sub2 local187 = Static306.method1795(local182, local156);
				local187.method1794(-1);
				Static43.aClass2_Sub5_Sub1_1.method403(local187);
				arg2.aClass2_Sub5_Sub2_1 = local187;
			}
		}
		if (arg2.aClass2_Sub5_Sub2_2 != null) {
			arg2.aClass2_Sub5_Sub2_2.method1787(local156);
			if (!arg2.aClass2_Sub5_Sub2_2.method4927()) {
				arg2.aClass2_Sub5_Sub2_2 = null;
			}
		} else if (arg2.anIntArray390 != null && (arg2.anInt4659 -= arg1) <= 0) {
			@Pc(239) int local239 = (int) (Math.random() * (double) arg2.anIntArray390.length);
			@Pc(247) Class30 local247 = Static304.method647(Static115.aClass84_50, arg2.anIntArray390[local239], 0);
			if (local247 != null) {
				@Pc(254) Class2_Sub9_Sub1 local254 = local247.method646().method1941(Static171.aClass9_1);
				@Pc(259) Class2_Sub5_Sub2 local259 = Static306.method1795(local254, local156);
				local259.method1794(0);
				Static43.aClass2_Sub5_Sub1_1.method403(local259);
				arg2.aClass2_Sub5_Sub2_2 = local259;
				arg2.anInt4659 = (int) (Math.random() * (double) (arg2.anInt4660 - arg2.anInt4656)) + arg2.anInt4656;
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BI)Lclient!qg;")
	public static Class142 method359(@OriginalArg(1) int arg0) {
		@Pc(6) Class142 local6 = (Class142) Static169.aClass46_29.method1074((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(24) byte[] local24 = Static190.aClass84_90.method2127(Static209.method1565(arg0), Static125.method4627(arg0));
		local6 = new Class142();
		if (local24 != null) {
			local6.method3635(new Class2_Sub26(local24));
		}
		Static169.aClass46_29.method1071(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BLclient!mn;)Ljava/lang/String;")
	public static String method361(@OriginalArg(1) Class115 arg0) {
		if (Static35.method708(arg0).method1323() == 0) {
			return null;
		} else if (arg0.aString175 == null || arg0.aString175.trim().length() == 0) {
			return Static202.aBoolean348 ? "Hidden-use" : null;
		} else {
			return arg0.aString175;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "([[IIIIII)I")
	public static int method362(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(30) int local30 = arg0[arg2 + 1][arg4] * arg1 + (128 - arg1) * arg0[arg2][arg4] >> 7;
		@Pc(57) int local57 = (128 - arg1) * arg0[arg2][arg4 + 1] + arg0[arg2 + 1][arg4 + 1] * arg1 >> 7;
		return local30 * (128 - arg3) + local57 * arg3 >> 7;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)V")
	public static void method363(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Static271.anInt5632;
		@Pc(7) int local7 = Static133.anInt2729;
		@Pc(9) int local9 = Static255.anInt5182;
		@Pc(11) int local11 = Static210.anInt4376;
		@Pc(13) int local13 = Static265.anInt5500;
		@Pc(16) int local16 = (int) Static198.aFloat41;
		if (local16 < Static182.anInt3886 / 256) {
			local16 = Static182.anInt3886 / 256;
		}
		@Pc(37) int local37 = (int) Static142.aFloat31 + Static83.anInt1889 & 0x7FF;
		if (Static198.aBooleanArray19[4] && local16 < Static250.anIntArray447[4] + 128) {
			local16 = Static250.anIntArray447[4] + 128;
		}
		Static202.method3404(local16, Static99.method1894(Static208.anInt4335, Static111.aClass36_Sub3_Sub2_1.anInt5109, Static111.aClass36_Sub3_Sub2_1.anInt5093) - 50, Static247.anInt4924, arg0, local37, Static280.anInt5827, local16 * 3 + 600);
		if (local5 == Static271.anInt5632 && local7 == Static133.anInt2729 && Static255.anInt5182 == local9 && Static210.anInt4376 == local11 && local13 == Static265.anInt5500) {
			Static101.anInt6027 = 1;
			return;
		}
		Static229.anInt5459 = 10;
		Static295.anInt6138 = 10;
		Static62.anInt1380 = 10;
		Static88.anInt4713 = 10;
		if (local9 < Static255.anInt5182) {
			local9 += Static62.anInt1380 * (Static255.anInt5182 - local9) / 1000 + Static295.anInt6138;
			if (Static255.anInt5182 > local9) {
				Static255.anInt5182 = local9;
			}
		}
		if (Static210.anInt4376 > local11) {
			local11 += (Static210.anInt4376 - local11) * Static229.anInt5459 / 1000 + Static88.anInt4713;
			if (local11 < Static210.anInt4376) {
				Static210.anInt4376 = local11;
			}
		}
		if (local11 > Static210.anInt4376) {
			local11 -= Static88.anInt4713 + Static229.anInt5459 * (local11 - Static210.anInt4376) / 1000;
			if (local11 > Static210.anInt4376) {
				Static210.anInt4376 = local11;
			}
		}
		if (Static271.anInt5632 > local5) {
			local5 += Static295.anInt6138 + Static62.anInt1380 * (Static271.anInt5632 - local5) / 1000;
			if (local5 < Static271.anInt5632) {
				Static271.anInt5632 = local5;
			}
		}
		if (local7 < Static133.anInt2729) {
			local7 += (Static133.anInt2729 - local7) * Static62.anInt1380 / 1000 + Static295.anInt6138;
			if (local7 < Static133.anInt2729) {
				Static133.anInt2729 = local7;
			}
		}
		if (local7 > Static133.anInt2729) {
			local7 -= Static62.anInt1380 * (local7 - Static133.anInt2729) / 1000 + Static295.anInt6138;
			if (local7 > Static133.anInt2729) {
				Static133.anInt2729 = local7;
			}
		}
		if (local9 > Static255.anInt5182) {
			local9 -= Static62.anInt1380 * (local9 - Static255.anInt5182) / 1000 + Static295.anInt6138;
			if (Static255.anInt5182 < local9) {
				Static255.anInt5182 = local9;
			}
		}
		@Pc(289) int local289 = Static265.anInt5500 - local13;
		if (Static271.anInt5632 < local5) {
			local5 -= Static295.anInt6138 + Static62.anInt1380 * (local5 - Static271.anInt5632) / 1000;
			if (local5 > Static271.anInt5632) {
				Static271.anInt5632 = local5;
			}
		}
		if (local289 > 1024) {
			local289 -= 2048;
		}
		if (local289 < -1024) {
			local289 += 2048;
		}
		if (local289 > 0) {
			local13 += Static88.anInt4713 + Static229.anInt5459 * local289 / 1000;
			local13 &= 0x7FF;
		}
		if (local289 < 0) {
			local13 -= Static229.anInt5459 * -local289 / 1000 + Static88.anInt4713;
			local13 &= 0x7FF;
		}
		@Pc(369) int local369 = Static265.anInt5500 - local13;
		if (local369 > 1024) {
			local369 -= 2048;
		}
		if (local369 < -1024) {
			local369 += 2048;
		}
		if (local369 >= 0 || local289 <= 0 || local369 > 0 && local289 < 0) {
			Static265.anInt5500 = local13;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIII)V")
	public static void method364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static20.anInt1234 < 100) {
			Static162.method2815();
		}
		if (Static60.aBoolean106) {
			Static94.method1752(arg2, arg1, arg0 + arg2, arg3 + arg1);
		} else {
			Static160.method2781(arg2, arg1, arg0 + arg2, arg3 + arg1);
		}
		@Pc(45) int local45;
		@Pc(58) int local58;
		if (Static20.anInt1234 < 100) {
			local45 = arg2 + arg0 / 2;
			local58 = arg3 / 2 + arg1 - 38;
			if (Static60.aBoolean106) {
				Static94.method1758(arg2, arg1, arg0, arg3, 0);
				Static94.method1756(local45 - 152, local58, 304, 34, 9179409);
				Static94.method1756(local45 - 151, local58 + 1, 302, 32, 0);
				Static94.method1758(local45 - 150, local58 + 2, Static20.anInt1234 * 3, 30, 9179409);
				Static94.method1758(Static20.anInt1234 * 3 + local45 - 150, local58 + 2, 300 - Static20.anInt1234 * 3, 30, 0);
			} else {
				Static160.method2788(arg2, arg1, arg0, arg3, 0);
				Static160.method2782(local45 - 152, local58, 304, 34, 9179409);
				Static160.method2782(local45 - 151, local58 + 1, 302, 32, 0);
				Static160.method2788(local45 - 150, local58 + 2, Static20.anInt1234 * 3, 30, 9179409);
				Static160.method2788(Static20.anInt1234 * 3 + local45 - 150, local58 - -2, 300 - Static20.anInt1234 * 3, 30, 0);
			}
			Static153.aClass2_Sub3_Sub5_1.method3308(Static100.aString110, local45, local58 + 20, 16777215, -1);
			return;
		}
		Static248.anInt4937 = (int) ((float) (arg0 * 2) / Static280.aFloat55);
		local45 = Static61.anInt2999 - (int) ((float) arg3 / Static280.aFloat55);
		Static259.anInt5400 = Static61.anInt2999 - (int) ((float) arg3 / Static280.aFloat55);
		Static170.anInt3613 = (int) ((float) (arg3 * 2) / Static280.aFloat55);
		local58 = (int) ((float) arg0 / Static280.aFloat55) + Static219.anInt4587;
		@Pc(232) int local232 = Static219.anInt4587 - (int) ((float) arg0 / Static280.aFloat55);
		@Pc(240) int local240 = Static61.anInt2999 + (int) ((float) arg3 / Static280.aFloat55);
		Static92.anInt2038 = Static219.anInt4587 - (int) ((float) arg0 / Static280.aFloat55);
		if (Static60.aBoolean106) {
			if (Static14.aClass2_Sub3_Sub1_Sub1_1 == null || Static14.aClass2_Sub3_Sub1_Sub1_1.anInt5453 != arg0 || Static14.aClass2_Sub3_Sub1_Sub1_1.anInt5462 != arg3) {
				Static14.aClass2_Sub3_Sub1_Sub1_1 = null;
				Static14.aClass2_Sub3_Sub1_Sub1_1 = new Class2_Sub3_Sub1_Sub1(arg0, arg3);
			}
			Static160.method2787(Static14.aClass2_Sub3_Sub1_Sub1_1.anIntArray479, arg0, arg3);
			Static107.method2000(local232, local45, arg0, 0, 0, local58, arg3, local240);
			Static227.method3808(local45, 0, arg0, 0, Static243.aBoolean323, local58, local232, arg3, local240);
			Static254.method4116(local58, local45, local240, local232, 0, 0, arg3, arg0);
			Static14.aClass2_Sub3_Sub1_Sub1_1.method4375();
			Static94.method1751(Static14.aClass2_Sub3_Sub1_Sub1_1.anIntArray479, arg2, arg1, arg0, arg3);
			Static160.anIntArray254 = null;
		} else {
			Static107.method2000(local232, local45, arg0 + arg2, arg2, arg1, local58, arg3 + arg1, local240);
			Static227.method3808(local45, arg1, arg2 + arg0, arg2, Static243.aBoolean323, local58, local232, arg1 + arg3, local240);
			Static254.method4116(local58, local45, local240, local232, arg2, arg1, arg1 + arg3, arg0 + arg2);
		}
		if (Static77.anInt1651 > 0) {
			Static11.anInt297--;
			if (Static11.anInt297 == 0) {
				Static11.anInt297 = 20;
				Static77.anInt1651--;
			}
		}
		if (!Static173.aBoolean307) {
			return;
		}
		@Pc(392) int local392 = arg0 + arg2 - 5;
		@Pc(398) int local398 = arg1 + arg3 - 8;
		Static208.aClass2_Sub3_Sub5_3.method3314("Fps:" + Static104.anInt2261, local392, local398, 16776960, -1);
		@Pc(414) int local414 = 16776960;
		@Pc(415) int local415 = local398 - 15;
		@Pc(417) Runtime local417 = Runtime.getRuntime();
		@Pc(426) int local426 = (int) ((local417.totalMemory() - local417.freeMemory()) / 1024L);
		if (local426 > 65536) {
			local414 = 16711680;
		}
		Static208.aClass2_Sub3_Sub5_3.method3314("Mem:" + local426 + "k", local392, local415, local414, -1);
		local398 = local415 - 15;
	}
}
