import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!u", name = "c", descriptor = "Z")
	public static boolean aBoolean163;

	@OriginalMember(owner = "client!u", name = "i", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1460 = Static49.method1293("(U");

	@OriginalMember(owner = "client!u", name = "x", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1461 = Static49.method1293("<col=00ff80>");

	@OriginalMember(owner = "client!u", name = "C", descriptor = "Z")
	public static boolean aBoolean166 = false;

	@OriginalMember(owner = "client!u", name = "J", descriptor = "I")
	public static int anInt4331 = 0;

	@OriginalMember(owner = "client!u", name = "T", descriptor = "Z")
	public static boolean aBoolean167 = true;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
	public static void method3310() {
		aClass70_1461 = null;
		aClass70_1460 = null;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BLclient!ne;Lclient!ne;)V")
	public static void method3314(@OriginalArg(1) Class1_Sub1_Sub1_Sub2_Sub1 arg0, @OriginalArg(2) Class1_Sub1_Sub1_Sub2_Sub1 arg1) {
		if (Static89.aBoolean102) {
			Static44.method1095(arg0, arg1);
			return;
		}
		if (Static15.anInt445 == 0 || Static15.anInt445 == 5) {
			arg0.method2397(Static110.aClass70_1007, 382, 225, 16777215, -1);
			Static155.method3016(230, 233, 304, 34, 9179409);
			Static155.method3016(231, 234, 302, 32, 0);
			Static155.method3012(232, 235, Static42.anInt1427 * 3, 30, 9179409);
			Static155.method3012(Static42.anInt1427 * 3 + 232, 235, 300 - Static42.anInt1427 * 3, 30, 0);
			arg0.method2397(Static179.aClass70_1559, 382, 256, 16777215, -1);
		}
		@Pc(110) short local110;
		@Pc(118) int local118;
		if (Static15.anInt445 == 20) {
			Static116.aClass1_Sub1_Sub1_Sub3_4.method2618(382 - Static116.aClass1_Sub1_Sub1_Sub3_4.anInt3504 / 2, 271 - Static116.aClass1_Sub1_Sub1_Sub3_4.anInt3507 / 2);
			local110 = 211;
			arg0.method2397(Static179.aClass70_1567, 382, 211, 16776960, 0);
			local118 = local110 + 15;
			arg0.method2397(Static179.aClass70_1561, 382, 226, 16776960, 0);
			@Pc(126) int local126 = local118 + 15;
			arg0.method2397(Static179.aClass70_1566, 382, 241, 16776960, 0);
			@Pc(134) int local134 = local126 + 15;
			@Pc(135) int local135 = local134 + 10;
			arg0.method2391(Static160.method3210(new Class70[] { Static152.aClass70_691, Static76.method2394(Static179.aClass70_1563) }), 272, 266, 16777215, 0);
			@Pc(155) int local155 = local135 + 15;
			arg0.method2391(Static160.method3210(new Class70[] { Static173.aClass70_1536, Static179.aClass70_1564.method2917() }), 274, 281, 16777215, 0);
			@Pc(176) int local176 = local155 + 15;
		}
		if (Static15.anInt445 == 10) {
			Static116.aClass1_Sub1_Sub1_Sub3_4.method2618(202, 171);
			if (Static34.anInt1109 == 0) {
				local110 = 251;
				arg0.method2397(Static92.aClass70_880, 382, 251, 16776960, 0);
				Static100.aClass1_Sub1_Sub1_Sub3_3.method2618(229, 271);
				local118 = local110 + 30;
				arg0.method2382(Static156.aClass70_1384, 229, 271, 144, 40, 16777215, 0, 1, 1, 0);
				Static100.aClass1_Sub1_Sub1_Sub3_3.method2618(389, 271);
				arg0.method2382(Static126.aClass70_288, 389, 271, 144, 40, 16777215, 0, 1, 1, 0);
			} else if (Static34.anInt1109 == 2) {
				local110 = 211;
				arg0.method2397(Static179.aClass70_1567, 382, 211, 16776960, 0);
				local118 = local110 + 15;
				arg0.method2397(Static179.aClass70_1561, 382, 226, 16776960, 0);
				local118 += 15;
				arg0.method2397(Static179.aClass70_1566, 382, 241, 16776960, 0);
				@Pc(372) boolean local372;
				if (Static114.anInt3122 == 0 && Static47.anInt1654 % 40 < 20 && Static167.aBoolean168) {
					local372 = true;
				} else {
					local372 = false;
				}
				local118 += 15;
				local118 += 10;
				arg0.method2391(Static160.method3210(new Class70[] { Static152.aClass70_691, Static76.method2394(Static179.aClass70_1563), local372 ? Static167.aClass70_1462 : Static179.aClass70_1562 }), 272, 266, 16777215, 0);
				local118 += 15;
				if (Static114.anInt3122 == 1 && Static47.anInt1654 % 40 < 20 && Static167.aBoolean168) {
					local372 = true;
				} else {
					local372 = false;
				}
				arg0.method2391(Static160.method3210(new Class70[] { Static173.aClass70_1536, Static179.aClass70_1564.method2917(), local372 ? Static167.aClass70_1462 : Static179.aClass70_1562 }), 274, 281, 16777215, 0);
				local118 += 15;
				Static100.aClass1_Sub1_Sub1_Sub3_3.method2618(229, 301);
				arg0.method2397(Static185.aClass70_1598, 302, 326, 16777215, 0);
				Static100.aClass1_Sub1_Sub1_Sub3_3.method2618(389, 301);
				arg0.method2397(Static70.aClass70_676, 462, 326, 16777215, 0);
			} else if (Static34.anInt1109 == 3) {
				local110 = 236;
				arg0.method2397(Static94.aClass70_902, 382, 211, 16776960, 0);
				arg0.method2397(Static118.aClass70_1080, 382, 236, 16777215, 0);
				local118 = local110 + 15;
				arg0.method2397(Static131.aClass70_1164, 382, 251, 16777215, 0);
				local118 += 15;
				arg0.method2397(Static141.aClass70_1254, 382, 266, 16777215, 0);
				local118 += 15;
				arg0.method2397(Static33.aClass70_354, 382, 281, 16777215, 0);
				local118 += 15;
				Static100.aClass1_Sub1_Sub1_Sub3_3.method2618(309, 301);
				arg0.method2397(Static70.aClass70_676, 382, 326, 16777215, 0);
			}
		}
		if (Static82.anInt2517 != 1) {
			if (Static86.anInt2581 > 0) {
				Static185.method3518(Static86.anInt2581);
				Static86.anInt2581 = 0;
			}
			Static25.method549();
		}
		Static151.aClass1_Sub1_Sub1_Sub3Array10[Static148.aBoolean145 ? 1 : 0].method2618(725, 463);
		if (Static15.anInt445 <= 5 || Static19.anInt535 == 2 || Static123.anInt3345 != 0) {
			return;
		}
		if (Static75.aClass1_Sub1_Sub1_Sub3_2 == null) {
			Static75.aClass1_Sub1_Sub1_Sub3_2 = Static14.method372(Static156.aClass76_Sub1_15, Static179.aClass70_1562, Static11.aClass70_133);
			return;
		}
		Static75.aClass1_Sub1_Sub1_Sub3_2.method2618(5, 463);
		arg0.method2397(Static160.method3210(new Class70[] { Static120.aClass70_1110, Static147.aClass70_1328, Static34.method873(Static26.anInt708) }), 55, 478, 16777215, 0);
		if (Static181.aClass5_1 == null) {
			arg1.method2397(Static7.aClass70_91, 55, 492, 16777215, 0);
		} else {
			arg1.method2397(Static178.aClass70_1550, 55, 492, 16777215, 0);
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(III)V")
	public static void method3315() {
		for (@Pc(1) int local1 = 0; local1 < Static40.anInt1398; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static73.anInt2250; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static85.anInt2550; local7++) {
					@Pc(16) Class1_Sub17 local16 = Static90.aClass1_Sub17ArrayArrayArray1[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class34 local21 = local16.aClass34_1;
						if (local21 != null && local21.aClass1_Sub1_Sub4_2 instanceof Class1_Sub1_Sub4_Sub3) {
							@Pc(31) Class1_Sub1_Sub4_Sub3 local31 = (Class1_Sub1_Sub4_Sub3) local21.aClass1_Sub1_Sub4_2;
							Static55.method1373(local31, local1, local4, local7, 1, 1);
							if (local21.aClass1_Sub1_Sub4_3 instanceof Class1_Sub1_Sub4_Sub3) {
								@Pc(46) Class1_Sub1_Sub4_Sub3 local46 = (Class1_Sub1_Sub4_Sub3) local21.aClass1_Sub1_Sub4_3;
								Static55.method1373(local46, local1, local4, local7, 1, 1);
								Static46.method1142(local31, local46, 0, 0, 0, false);
								local21.aClass1_Sub1_Sub4_3 = local46.method1135(local46.aShort24, local46.aShort25, -50, -10, -50, false);
							}
							local21.aClass1_Sub1_Sub4_2 = local31.method1135(local31.aShort24, local31.aShort25, -50, -10, -50, false);
						}
						@Pc(104) Class1_Sub1_Sub4_Sub3 local104;
						for (@Pc(88) int local88 = 0; local88 < local16.anInt2953; local88++) {
							@Pc(94) Class53 local94 = local16.aClass53Array2[local88];
							if (local94 != null && local94.aClass1_Sub1_Sub4_4 instanceof Class1_Sub1_Sub4_Sub3) {
								local104 = (Class1_Sub1_Sub4_Sub3) local94.aClass1_Sub1_Sub4_4;
								Static55.method1373(local104, local1, local4, local7, local94.anInt3111 + 1 - local94.anInt3109, local94.anInt3101 - local94.anInt3107 + 1);
								local94.aClass1_Sub1_Sub4_4 = local104.method1135(local104.aShort24, local104.aShort25, -50, -10, -50, false);
							}
						}
						@Pc(144) Class7 local144 = local16.aClass7_1;
						if (local144 != null && local144.aClass1_Sub1_Sub4_1 instanceof Class1_Sub1_Sub4_Sub3) {
							local104 = (Class1_Sub1_Sub4_Sub3) local144.aClass1_Sub1_Sub4_1;
							Static160.method3207(local104, local1, local4, local7);
							local144.aClass1_Sub1_Sub4_1 = local104.method1135(local104.aShort24, local104.aShort25, -50, -10, -50, false);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIILclient!fa;II)V")
	public static void method3328(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1_Sub9 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(30) int local30;
		if (arg1 < 0 || arg1 >= 104 || arg5 < 0 || arg5 >= 104) {
			while (true) {
				local30 = arg4.method1234();
				if (local30 == 0) {
					break;
				}
				if (local30 == 1) {
					arg4.method1234();
					break;
				}
				if (local30 <= 49) {
					arg4.method1234();
				}
			}
			return;
		}
		Static20.aByteArrayArrayArray1[arg0][arg1][arg5] = 0;
		while (true) {
			local30 = arg4.method1234();
			if (local30 == 0) {
				if (arg0 == 0) {
					Static142.anIntArrayArrayArray8[0][arg1][arg5] = -Static58.method1419(arg5 + arg2 + 556238, 932731 - -arg1 - -arg3) * 8;
				} else {
					Static142.anIntArrayArrayArray8[arg0][arg1][arg5] = Static142.anIntArrayArrayArray8[arg0 - 1][arg1][arg5] - 240;
				}
				break;
			}
			if (local30 == 1) {
				@Pc(91) int local91 = arg4.method1234();
				if (local91 == 1) {
					local91 = 0;
				}
				if (arg0 == 0) {
					Static142.anIntArrayArrayArray8[0][arg1][arg5] = -local91 * 8;
				} else {
					Static142.anIntArrayArrayArray8[arg0][arg1][arg5] = Static142.anIntArrayArrayArray8[arg0 - 1][arg1][arg5] - local91 * 8;
				}
				break;
			}
			if (local30 <= 49) {
				Static25.aByteArrayArrayArray2[arg0][arg1][arg5] = arg4.method1243();
				Static41.aByteArrayArrayArray3[arg0][arg1][arg5] = (byte) ((local30 - 2) / 4);
				Static60.aByteArrayArrayArray4[arg0][arg1][arg5] = (byte) (arg6 + local30 - 2 & 0x3);
			} else if (local30 <= 81) {
				Static20.aByteArrayArrayArray1[arg0][arg1][arg5] = (byte) (local30 - 49);
			} else {
				Static95.aByteArrayArrayArray6[arg0][arg1][arg5] = (byte) (local30 - 81);
			}
		}
	}
}
