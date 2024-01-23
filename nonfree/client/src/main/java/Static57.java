import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "Lclient!ak;")
	public static Class7 aClass7_50;

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "F")
	public static float aFloat32;

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "Z")
	public static boolean aBoolean97 = true;

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
	public static int anInt1183 = 0;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method934(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static228.method3502(arg4)) {
			Static24.method426(arg2, arg3, arg5, arg6, arg1, arg0, -1, arg7, Static86.aClass127ArrayArray1[arg4]);
		} else if (arg3 == -1) {
			for (@Pc(26) int local26 = 0; local26 < 100; local26++) {
				Static267.aBooleanArray25[local26] = true;
			}
		} else {
			Static267.aBooleanArray25[arg3] = true;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IZLclient!t;Lclient!t;B)I")
	public static int method935(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class152_Sub1 arg2, @OriginalArg(3) Class152_Sub1 arg3) {
		if (arg0 == 1) {
			@Pc(12) int local12 = arg2.anInt5084;
			@Pc(15) int local15 = arg3.anInt5084;
			if (!arg1) {
				if (local15 == -1) {
					local15 = 2001;
				}
				if (local12 == -1) {
					local12 = 2001;
				}
			}
			return local12 - local15;
		} else if (arg0 == 2) {
			return Static211.method778(arg2.method3903().aString135, Static282.anInt5857, arg3.method3903().aString135);
		} else if (arg0 == 3) {
			if (arg2.aString172.equals("-")) {
				if (arg3.aString172.equals("-")) {
					return 0;
				} else if (arg1) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg3.aString172.equals("-")) {
				return arg1 ? 1 : -1;
			} else {
				return Static211.method778(arg2.aString172, Static282.anInt5857, arg3.aString172);
			}
		} else if (arg0 == 4) {
			return arg2.method3894() ? (arg3.method3894() ? 0 : 1) : arg3.method3894() ? -1 : 0;
		} else if (arg0 == 5) {
			return arg2.method3895() ? (arg3.method3895() ? 0 : 1) : arg3.method3895() ? -1 : 0;
		} else if (arg0 == 6) {
			return arg2.method3891() ? (arg3.method3891() ? 0 : 1) : arg3.method3891() ? -1 : 0;
		} else if (arg0 == 7) {
			return arg2.method3898() ? (arg3.method3898() ? 0 : 1) : arg3.method3898() ? -1 : 0;
		} else {
			return arg2.anInt5090 - arg3.anInt5090;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIILclient!og;)V")
	public static void method936(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class127 arg3) {
		if (Static240.aBoolean369) {
			Static50.method867(arg1, arg0, arg3.anInt3567 + arg1, arg0 - -arg3.anInt3595);
		}
		if (Static43.anInt967 >= 3) {
			if (Static240.aBoolean369) {
				@Pc(45) Class1_Sub2_Sub2 local45 = arg3.method2850(false);
				if (local45 != null) {
					local45.method3921(arg1, arg0);
				}
			} else {
				Static213.method3376(arg1, arg0, arg3.anIntArray417, arg3.anIntArray425);
			}
		} else if (Static240.aBoolean369) {
			((Class1_Sub2_Sub2_Sub2) Static145.aClass1_Sub2_Sub2_6).method3192(arg1, arg0, arg3.anInt3567, arg3.anInt3595, Static145.aClass1_Sub2_Sub2_6.anInt5119 / 2, Static145.aClass1_Sub2_Sub2_6.anInt5112 / 2, (int) Static177.aFloat97, 256, (Class1_Sub2_Sub2_Sub2) arg3.method2850(false));
		} else {
			((Class1_Sub2_Sub2_Sub1) Static145.aClass1_Sub2_Sub2_6).method3942(arg1, arg0, arg3.anInt3567, arg3.anInt3595, Static145.aClass1_Sub2_Sub2_6.anInt5119 / 2, Static145.aClass1_Sub2_Sub2_6.anInt5112 / 2, (int) Static177.aFloat97, arg3.anIntArray417, arg3.anIntArray425);
		}
		Static260.aBooleanArray24[arg2] = true;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V")
	public static void method937() {
		@Pc(6) Class1_Sub6 local6;
		for (local6 = (Class1_Sub6) Static261.aClass69_26.method1636(); local6 != null; local6 = (Class1_Sub6) Static261.aClass69_26.method1631()) {
			if (local6.aBoolean88) {
				local6.method842();
			}
		}
		for (local6 = (Class1_Sub6) Static196.aClass69_22.method1636(); local6 != null; local6 = (Class1_Sub6) Static196.aClass69_22.method1631()) {
			if (local6.aBoolean88) {
				local6.method842();
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IZIIII)V")
	public static void method938(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static152.anInt2841++;
		Static53.method908();
		@Pc(30) int local30;
		if (arg1) {
			Static288.method4406(false, 0, false);
		} else {
			Static102.method1649(0);
			Static288.method4406(true, 0, false);
			if (Static247.anInt5042 == 0) {
				for (local30 = 1; local30 <= 5; local30++) {
					Static288.method4406(false, local30, false);
					Static288.method4406(false, local30, true);
					Static102.method1649(local30);
				}
			} else {
				for (local30 = 1; local30 <= 5; local30++) {
					Static102.method1649(local30);
					Static288.method4406(false, local30, false);
					Static288.method4406(false, local30, true);
				}
			}
		}
		if (!arg1) {
			Static74.method1276();
		}
		Static254.method4538();
		if (Static240.aBoolean369) {
			Static75.method1284(true, arg0, arg3, arg2, arg4);
			arg4 = Static196.anInt3785;
			arg0 = Static229.anInt4800;
			arg2 = Static32.anInt713;
			arg3 = Static282.anInt5854;
		}
		@Pc(153) int local153;
		if (Static109.anInt2057 == 1) {
			local30 = (int) Static152.aFloat81;
			if (Static121.anInt2349 / 256 > local30) {
				local30 = Static121.anInt2349 / 256;
			}
			if (Static136.aBooleanArray10[4] && Static206.anIntArray470[4] + 128 > local30) {
				local30 = Static206.anIntArray470[4] + 128;
			}
			local153 = (int) Static177.aFloat97 + Static156.anInt1708 & 0x7FF;
			Static246.method2727(Static242.anInt4995, local30 * 3 + 600, local30, local153, Static124.method1919(Static159.anInt2978, Static28.aClass6_Sub6_Sub2_1.anInt4562, Static28.aClass6_Sub6_Sub2_1.anInt4569) - 50, arg3, Static139.anInt2614);
		} else if (Static109.anInt2057 == 5) {
			Static136.method2153(arg3);
		}
		local30 = Static182.anInt3398;
		local153 = Static185.anInt3457;
		@Pc(190) int local190 = Static68.anInt4743;
		@Pc(192) int local192 = Static77.anInt1548;
		@Pc(194) int local194 = Static56.anInt1177;
		@Pc(196) int local196;
		@Pc(242) int local242;
		for (local196 = 0; local196 < 5; local196++) {
			if (Static136.aBooleanArray10[local196]) {
				local242 = (int) ((double) -Static138.anIntArray314[local196] + Math.random() * (double) (Static138.anIntArray314[local196] * 2 + 1) + Math.sin((double) Static260.anIntArray613[local196] / 100.0D * (double) Static227.anIntArray556[local196]) * (double) Static206.anIntArray470[local196]);
				if (local196 == 2) {
					Static68.anInt4743 += local242;
				}
				if (local196 == 3) {
					Static56.anInt1177 = Static56.anInt1177 + local242 & 0x7FF;
				}
				if (local196 == 4) {
					Static77.anInt1548 += local242;
					if (Static77.anInt1548 < 128) {
						Static77.anInt1548 = 128;
					}
					if (Static77.anInt1548 > 383) {
						Static77.anInt1548 = 383;
					}
				}
				if (local196 == 1) {
					Static185.anInt3457 += local242;
				}
				if (local196 == 0) {
					Static182.anInt3398 += local242;
				}
			}
		}
		Static99.method1625();
		@Pc(400) int local400;
		if (Static240.aBoolean369) {
			Static50.method867(arg4, arg0, arg4 + arg2, arg3 + arg0);
			@Pc(360) float local360 = (float) Static77.anInt1548 * 0.17578125F;
			@Pc(365) float local365 = (float) Static56.anInt1177 * 0.17578125F;
			if (Static109.anInt2057 == 3) {
				local365 = Static61.aFloat33 * 360.0F / 6.2831855F;
				local360 = Static177.aFloat98 * 360.0F / 6.2831855F;
			}
			if (Static98.anInt1878 == 10) {
				local400 = Static255.method3976(Static47.anInt5866, Static176.anInt3254, Static68.anInt4743 >> 10, Static182.anInt3398 >> 10);
			} else {
				local400 = Static255.method3976(Static47.anInt5866, Static176.anInt3254, Static28.aClass6_Sub6_Sub2_1.anIntArray516[0] >> 3, Static28.aClass6_Sub6_Sub2_1.anIntArray519[0] >> 3);
			}
			if (Static139.anInt2613 >= 0) {
				Static240.method3797();
				@Pc(430) Class116 local430 = Static55.method927(Static67.anInt1384, Static23.anInt5827, Static298.anInt5907, Static139.anInt2613);
				local430.method2611(Static143.anInt2664, arg4, arg0, arg2, arg3, Static77.anInt1548, Static56.anInt1177, local400);
			} else {
				Static240.method3776(local400);
			}
			Static240.method3782(arg4, arg0, arg2, arg3, arg4 + arg2 / 2, arg0 - -(arg3 / 2), local360, local365, Static184.anInt3403, Static184.anInt3403);
			Static82.method1397(false);
			Static240.method3775();
			Static240.method3801(true);
			Static240.method3774(true);
		} else {
			Static213.method3369(arg4, arg0, arg2 + arg4, arg3 + arg0);
			Static208.method3241();
			if (Static139.anInt2613 < 0) {
				Static213.method3362(arg4, arg0, arg2, arg3, 0);
			} else {
				@Pc(335) Class116 local335 = Static55.method927(Static67.anInt1384, Static23.anInt5827, Static298.anInt5907, Static139.anInt2613);
				local335.method2610(Static143.anInt2664, arg4, arg0, arg2, arg3, Static77.anInt1548, Static56.anInt1177);
			}
		}
		if (Static192.aBoolean414 || arg4 > Static54.anInt1146 || arg4 + arg2 <= Static54.anInt1146 || Static223.anInt4678 < arg0 || arg3 + arg0 <= Static223.anInt4678) {
			Static14.aBoolean29 = false;
			Static270.anInt5412 = 0;
		} else {
			Static270.anInt5412 = 0;
			Static14.aBoolean29 = true;
			local196 = Static77.anInt1560;
			local400 = Static17.anInt409;
			local242 = Static211.anInt958;
			Static134.anInt2546 = (local242 - local196) * (Static54.anInt1146 + -arg4) / arg2 + local196;
			@Pc(521) int local521 = Static150.anInt2786;
			Static67.anInt1387 = local400 + (Static223.anInt4678 - arg0) * (-local400 + local521) / arg3;
		}
		Static39.method716();
		@Pc(551) byte local551 = Static220.method3518() == 2 ? (byte) Static152.anInt2841 : 1;
		if (Static240.aBoolean369) {
			Static194.method2940(Static261.anInt5259, !Static51.aBoolean91);
			Static262.method4033(Static182.anInt3398, Static185.anInt3457, Static77.anInt1548, Static68.anInt4743, Static56.anInt1177);
			Static240.anInt4950 = Static261.anInt5259;
			Static40.method745(Static182.anInt3398, Static185.anInt3457, Static68.anInt4743, Static77.anInt1548, Static56.anInt1177, Static119.aByteArrayArrayArray21, Static98.anIntArray251, Static140.anIntArray316, Static275.anIntArray650, Static107.anIntArray265, Static265.anIntArray618, Static159.anInt2978 + 1, local551, Static28.aClass6_Sub6_Sub2_1.anInt4562 >> 7, Static28.aClass6_Sub6_Sub2_1.anInt4569 >> 7);
			Static29.aBoolean56 = true;
			Static194.method2946();
			Static262.method4033(0, 0, 0, 0, 0);
			Static39.method716();
			Static95.method1566(arg4, arg3, Static184.anInt3403, arg0, Static184.anInt3403, arg2);
			Static20.method355(arg4, arg0, Static184.anInt3403, Static184.anInt3403, arg2, arg3);
			Static22.method3915();
		} else {
			Static40.method745(Static182.anInt3398, Static185.anInt3457, Static68.anInt4743, Static77.anInt1548, Static56.anInt1177, Static119.aByteArrayArrayArray21, Static98.anIntArray251, Static140.anIntArray316, Static275.anIntArray650, Static107.anIntArray265, Static265.anIntArray618, Static159.anInt2978 + 1, local551, Static28.aClass6_Sub6_Sub2_1.anInt4562 >> 7, Static28.aClass6_Sub6_Sub2_1.anInt4569 >> 7);
			Static39.method716();
			Static22.method3915();
			Static95.method1566(arg4, arg3, 256, arg0, 256, arg2);
			Static20.method355(arg4, arg0, 256, 256, arg2, arg3);
		}
		((Class40_Sub1) Static208.anInterface4_1).method1003(Static47.anInt5866);
		Static75.method1288(arg2, arg0, arg3, arg4);
		Static68.anInt4743 = local190;
		Static56.anInt1177 = local194;
		Static182.anInt3398 = local30;
		Static185.anInt3457 = local153;
		Static77.anInt1548 = local192;
		if (Static143.aBoolean186 && Static137.aClass168_3.method4271() == 0) {
			Static143.aBoolean186 = false;
		}
		if (Static143.aBoolean186) {
			if (Static240.aBoolean369) {
				Static50.method866(arg4, arg0, arg2, arg3, 0);
			} else {
				Static213.method3362(arg4, arg0, arg2, arg3, 0);
			}
			Static195.method2964(false, Static4.aString6);
		}
		if (!arg1 && !Static143.aBoolean186 && !Static192.aBoolean414 && Static54.anInt1146 >= arg4 && Static54.anInt1146 < arg4 + arg2 && Static223.anInt4678 >= arg0 && Static223.anInt4678 < arg0 + arg3) {
			Static140.method2204(arg4, arg0, Static223.anInt4678, Static54.anInt1146, arg3, arg2);
		}
	}
}
