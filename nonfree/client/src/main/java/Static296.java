import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "[Z")
	public static boolean[] aBooleanArray13;

	@OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
	public static int anInt1764;

	@OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
	public static int anInt1766;

	@OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
	public static int anInt1762 = 0;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIII)V")
	public static void method1372(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static93.anInt1927 < 100) {
			Static176.method661();
		}
		if (Static178.aBoolean216) {
			Static186.method2963(arg3, arg0, arg1 + arg3, arg2 + arg0);
		} else {
			Static166.method2622(arg3, arg0, arg1 + arg3, arg2 + arg0);
		}
		@Pc(48) int local48;
		@Pc(58) int local58;
		if (Static93.anInt1927 < 100) {
			local48 = arg3 + arg1 / 2;
			local58 = arg2 / 2 + arg0 - 18 - 20;
			if (Static178.aBoolean216) {
				Static186.method2968(arg3, arg0, arg1, arg2, 0);
				Static186.method2970(local48 - 152, local58, 304, 34, 9179409);
				Static186.method2970(local48 - 151, local58 + 1, 302, 32, 0);
				Static186.method2968(local48 - 150, local58 - -2, Static93.anInt1927 * 3, 30, 9179409);
				Static186.method2968(local48 + Static93.anInt1927 * 3 - 150, local58 + 2, 300 - Static93.anInt1927 * 3, 30, 0);
			} else {
				Static166.method2627(arg3, arg0, arg1, arg2, 0);
				Static166.method2614(local48 - 152, local58, 304, 34, 9179409);
				Static166.method2614(local48 - 151, local58 - -1, 302, 32, 0);
				Static166.method2627(local48 - 150, local58 + 2, Static93.anInt1927 * 3, 30, 9179409);
				Static166.method2627(Static93.anInt1927 * 3 + local48 - 150, local58 + 2, 300 - Static93.anInt1927 * 3, 30, 0);
			}
			Static289.aClass4_Sub2_Sub12_3.method4179(Static3.aString2, local48, local58 + 20, 16777215, -1);
			return;
		}
		Static21.anInt4307 = (int) ((float) (arg2 * 2) / Static251.aFloat47);
		Static59.anInt3156 = (int) ((float) (arg1 * 2) / Static251.aFloat47);
		Static165.anInt3295 = Static295.anInt5481 - (int) ((float) arg1 / Static251.aFloat47);
		Static87.anInt1806 = Static96.anInt2064 - (int) ((float) arg2 / Static251.aFloat47);
		local48 = Static96.anInt2064 - (int) ((float) arg2 / Static251.aFloat47);
		@Pc(236) int local236 = Static295.anInt5481 - (int) ((float) arg1 / Static251.aFloat47);
		local58 = (int) ((float) arg1 / Static251.aFloat47) + Static295.anInt5481;
		@Pc(252) int local252 = Static96.anInt2064 + (int) ((float) arg2 / Static251.aFloat47);
		if (Static178.aBoolean216) {
			if (Static227.aClass4_Sub2_Sub1_Sub1_5 == null || arg1 != Static227.aClass4_Sub2_Sub1_Sub1_5.anInt4301 || Static227.aClass4_Sub2_Sub1_Sub1_5.anInt4308 != arg2) {
				Static227.aClass4_Sub2_Sub1_Sub1_5 = null;
				Static227.aClass4_Sub2_Sub1_Sub1_5 = new Class4_Sub2_Sub1_Sub1(arg1, arg2);
			}
			Static166.method2623(Static227.aClass4_Sub2_Sub1_Sub1_5.anIntArray387, arg1, arg2);
			Static168.method2658(local236, 0, local48, local252, arg2, local58, 0, arg1);
			Static244.method3722(local48, local236, arg2, local252, local58, 0, 0, Static39.aBoolean340, arg1);
			Static284.method4276(0, local48, 0, local252, arg2, local58, local236, arg1);
			Static227.aClass4_Sub2_Sub1_Sub1_5.method3481();
			Static186.method2953(Static227.aClass4_Sub2_Sub1_Sub1_5.anIntArray387, arg3, arg0, arg1, arg2);
			Static166.anIntArray293 = null;
		} else {
			Static168.method2658(local236, arg0, local48, local252, arg2 + arg0, local58, arg3, arg1 + arg3);
			Static244.method3722(local48, local236, arg0 + arg2, local252, local58, arg0, arg3, Static39.aBoolean340, arg1 + arg3);
			Static284.method4276(arg3, local48, arg0, local252, arg2 + arg0, local58, local236, arg1 + arg3);
		}
		if (Static17.anInt372 > 0) {
			Static120.anInt2640--;
			if (Static120.anInt2640 == 0) {
				Static17.anInt372--;
				Static120.anInt2640 = 20;
			}
		}
		if (!Static131.aBoolean184) {
			return;
		}
		@Pc(396) int local396 = arg1 + arg3 - 5;
		@Pc(403) int local403 = arg0 + arg2 - 8;
		Static49.aClass4_Sub2_Sub12_1.method4186("Fps:" + Static85.anInt1723, local396, local403, 16776960, -1);
		@Pc(418) int local418 = local403 - 15;
		@Pc(420) Runtime local420 = Runtime.getRuntime();
		@Pc(430) int local430 = (int) ((local420.totalMemory() - local420.freeMemory()) / 1024L);
		@Pc(432) int local432 = 16776960;
		if (local430 > 65536) {
			local432 = 16711680;
		}
		Static49.aClass4_Sub2_Sub12_1.method4186("Mem:" + local430 + "k", local396, local418, local432, -1);
		local403 = local418 - 15;
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V")
	public static void method1373() {
		aBooleanArray13 = null;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!cc;B)V")
	public static void method1374(@OriginalArg(0) Class22 arg0) {
		@Pc(13) int local13 = arg0.anInt612;
		if (local13 == 324) {
			if (Static206.anInt4048 == -1) {
				Static206.anInt4048 = arg0.anInt588;
				Static110.anInt2430 = arg0.anInt627;
			}
			if (Static247.aClass143_2.aBoolean295) {
				arg0.anInt588 = Static206.anInt4048;
			} else {
				arg0.anInt588 = Static110.anInt2430;
			}
		} else if (local13 == 325) {
			if (Static206.anInt4048 == -1) {
				Static206.anInt4048 = arg0.anInt588;
				Static110.anInt2430 = arg0.anInt627;
			}
			if (Static247.aClass143_2.aBoolean295) {
				arg0.anInt588 = Static110.anInt2430;
			} else {
				arg0.anInt588 = Static206.anInt4048;
			}
		} else if (local13 == 327) {
			arg0.anInt621 = 150;
			arg0.anInt617 = (int) (Math.sin((double) Static104.anInt2226 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt572 = -1;
			arg0.anInt628 = 5;
		} else if (local13 == 328) {
			if (Static239.aClass12_Sub3_Sub2_2.aString132 == null) {
				arg0.anInt572 = 0;
			} else {
				arg0.anInt621 = 150;
				arg0.anInt617 = (int) (Math.sin((double) Static104.anInt2226 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt628 = 5;
				arg0.anInt572 = ((int) Static34.method491(Static239.aClass12_Sub3_Sub2_2.aString132) << 11) + 2047;
				arg0.anInt632 = Static239.aClass12_Sub3_Sub2_2.anInt4118;
				arg0.anInt576 = Static239.aClass12_Sub3_Sub2_2.anInt4159;
				arg0.anInt578 = 0;
				arg0.anInt622 = Static239.aClass12_Sub3_Sub2_2.anInt4127;
			}
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIII)Z")
	public static boolean method1375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static15.method266(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static96.method1563(local10 + 1, Static250.anIntArrayArrayArray13[arg0][arg1][arg2] + arg3, local14 + 1) && Static96.method1563(local10 + 128 - 1, Static250.anIntArrayArrayArray13[arg0][arg1 + 1][arg2] + arg3, local14 + 1) && Static96.method1563(local10 + 128 - 1, Static250.anIntArrayArrayArray13[arg0][arg1 + 1][arg2 + 1] + arg3, local14 + 128 - 1) && Static96.method1563(local10 + 1, Static250.anIntArrayArrayArray13[arg0][arg1][arg2 + 1] + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IB)Lclient!qm;")
	public static Class141 method1376(@OriginalArg(0) int arg0) {
		@Pc(10) Class141 local10 = (Class141) Static106.aClass33_18.method841((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static251.aClass98_143.method2396(Static215.method3430(arg0), Static132.method2160(arg0));
		local10 = new Class141();
		local10.anInt4357 = arg0;
		if (local25 != null) {
			local10.method3520(new Class4_Sub17(local25));
		}
		local10.method3525();
		Static106.aClass33_18.method845(local10, (long) arg0);
		return local10;
	}
}
