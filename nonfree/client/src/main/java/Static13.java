import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!al", name = "a", descriptor = "Lclient!ea;")
	public static Class42 aClass42_2;

	@OriginalMember(owner = "client!al", name = "d", descriptor = "Lclient!jh;")
	public static Class84 aClass84_3;

	@OriginalMember(owner = "client!al", name = "f", descriptor = "Lclient!bf;")
	public static Class1_Sub2_Sub2 aClass1_Sub2_Sub2_7;

	@OriginalMember(owner = "client!al", name = "g", descriptor = "Lclient!bf;")
	public static Class1_Sub2_Sub2 aClass1_Sub2_Sub2_8;

	@OriginalMember(owner = "client!al", name = "i", descriptor = "Lclient!ak;")
	public static Class7 aClass7_145;

	@OriginalMember(owner = "client!al", name = "j", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray17;

	@OriginalMember(owner = "client!al", name = "k", descriptor = "I")
	public static int anInt3332;

	@OriginalMember(owner = "client!al", name = "b", descriptor = "Z")
	public static boolean aBoolean247 = true;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ILclient!vg;Lclient!vg;)V")
	public static void method2696(@OriginalArg(1) Class1_Sub2 arg0, @OriginalArg(2) Class1_Sub2 arg1) {
		if (arg0.aClass1_Sub2_69 != null) {
			arg0.method4509();
		}
		arg0.aClass1_Sub2_69 = arg1;
		arg0.aClass1_Sub2_68 = arg1.aClass1_Sub2_68;
		arg0.aClass1_Sub2_69.aClass1_Sub2_68 = arg0;
		arg0.aClass1_Sub2_68.aClass1_Sub2_69 = arg0;
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(B)V")
	public static void method2697() {
		@Pc(18) Class163 local18 = Static18.aClass163_1;
		synchronized (Static18.aClass163_1) {
			Static81.anInt1616 = Static203.anInt4009;
			Static3.anInt141++;
			@Pc(34) int local34;
			if (Static278.anInt5580 >= 0) {
				while (Static278.anInt5580 != Static107.anInt1997) {
					local34 = Static43.anIntArray130[Static107.anInt1997];
					Static107.anInt1997 = Static107.anInt1997 + 1 & 0x7F;
					if (local34 < 0) {
						Static246.aBooleanArray15[~local34] = false;
					} else {
						Static246.aBooleanArray15[local34] = true;
					}
				}
			} else {
				for (local34 = 0; local34 < 112; local34++) {
					Static246.aBooleanArray15[local34] = false;
				}
				Static278.anInt5580 = Static107.anInt1997;
			}
			Static203.anInt4009 = Static270.anInt5417;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIILclient!og;)V")
	public static void method2698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class127 arg3) {
		Static39.method716();
		if (Static240.aBoolean369) {
			Static50.method867(arg2, arg1, arg3.anInt3567 + arg2, arg1 - -arg3.anInt3595);
		} else {
			Static213.method3369(arg2, arg1, arg3.anInt3567 + arg2, arg3.anInt3595 + arg1);
		}
		if (Static43.anInt967 != 2 && Static43.anInt967 != 5 && Static206.aClass1_Sub2_Sub2_9 != null) {
			@Pc(87) int local87 = (int) Static177.aFloat97 + Static35.anInt746 & 0x7FF;
			@Pc(97) int local97 = 464 - Static28.aClass6_Sub6_Sub2_1.anInt4569 / 32;
			@Pc(106) int local106 = Static28.aClass6_Sub6_Sub2_1.anInt4562 / 32 + 48;
			if (Static240.aBoolean369) {
				((Class1_Sub2_Sub2_Sub2) Static206.aClass1_Sub2_Sub2_9).method3192(arg2, arg1, arg3.anInt3567, arg3.anInt3595, local106, local97, local87, Static155.anInt2868 + 256, (Class1_Sub2_Sub2_Sub2) arg3.method2850(false));
			} else {
				((Class1_Sub2_Sub2_Sub1) Static206.aClass1_Sub2_Sub2_9).method3939(arg2, arg1, arg3.anInt3567, arg3.anInt3595, local106, local97, local87, Static155.anInt2868 + 256, arg3.anIntArray417, arg3.anIntArray425);
			}
			@Pc(185) int local185;
			@Pc(205) int local205;
			@Pc(209) int local209;
			@Pc(221) int local221;
			@Pc(251) int local251;
			@Pc(270) int local270;
			@Pc(278) int local278;
			@Pc(312) int local312;
			if (Static3.aClass50_1 != null) {
				for (@Pc(154) int local154 = 0; local154 < Static3.aClass50_1.anInt1409; local154++) {
					if (Static3.aClass50_1.method1168(local154)) {
						local185 = ((Static3.aClass50_1.anIntArray169[local154] >> 14 & 0x3FFF) - Static224.anInt4695) * 4 + 2 - Static28.aClass6_Sub6_Sub2_1.anInt4562 / 32;
						local205 = ((Static3.aClass50_1.anIntArray169[local154] & 0x3FFF) - Static158.anInt2961) * 4 + 2 - Static28.aClass6_Sub6_Sub2_1.anInt4569 / 32;
						local209 = Class135.anIntArray472[local87];
						@Pc(217) int local217 = local209 * 256 / (Static155.anInt2868 + 256);
						local221 = Class135.anIntArray474[local87];
						@Pc(223) Class1_Sub2_Sub12 local223 = Static169.aClass1_Sub2_Sub12_3;
						@Pc(231) int local231 = local221 * 256 / (Static155.anInt2868 + 256);
						if (Static3.aClass50_1.method1167(local154) == 1) {
							local223 = Static84.aClass1_Sub2_Sub12_2;
						}
						local251 = local231 * local185 + local205 * local217 >> 16;
						if (Static3.aClass50_1.method1167(local154) == 2) {
							local223 = Static10.aClass1_Sub2_Sub12_1;
						}
						local270 = local231 * local205 - local217 * local185 >> 16;
						local278 = local223.method4393(Static3.aClass50_1.aStringArray6[local154], 100);
						local251 -= local278 / 2;
						if (-arg3.anInt3567 <= local251 && arg3.anInt3567 >= local251 && -arg3.anInt3595 <= local270 && local270 <= arg3.anInt3595) {
							local312 = 16777215;
							if (Static3.aClass50_1.anIntArray168[local154] != -1) {
								local312 = Static3.aClass50_1.anIntArray168[local154];
							}
							if (Static240.aBoolean369) {
								Static50.method865((Class1_Sub2_Sub2_Sub2) arg3.method2850(false));
							} else {
								Static213.method3382(arg3.anIntArray417, arg3.anIntArray425);
							}
							local223.method4380(Static3.aClass50_1.aStringArray6[local154], local251 + arg2 + arg3.anInt3567 / 2, arg1 - -(arg3.anInt3595 / 2) - local270, local278, 50, local312, 0, 1, 0, 0);
							if (Static240.aBoolean369) {
								Static50.method864();
							} else {
								Static213.method3375();
							}
						}
					}
				}
			}
			for (local185 = 0; local185 < Static235.anInt4895; local185++) {
				local205 = Static100.anIntArray258[local185] * 4 + 2 - Static28.aClass6_Sub6_Sub2_1.anInt4562 / 32;
				local209 = Static183.anIntArray683[local185] * 4 + 2 - Static28.aClass6_Sub6_Sub2_1.anInt4569 / 32;
				@Pc(427) Class104 local427 = Static35.method636(Static135.anIntArray492[local185]);
				if (local427.anIntArray350 != null) {
					local427 = local427.method2355();
					if (local427 == null || local427.anInt2801 == -1) {
						continue;
					}
				}
				Static103.method1654(local205, local209, arg3, arg2, Static155.aClass1_Sub2_Sub2Array8[local427.anInt2801], arg1);
			}
			for (local185 = 0; local185 < 104; local185++) {
				for (local205 = 0; local205 < 104; local205++) {
					@Pc(479) Class69 local479 = Static4.aClass69ArrayArrayArray1[Static159.anInt2978][local185][local205];
					if (local479 != null) {
						local221 = local185 * 4 + 2 - Static28.aClass6_Sub6_Sub2_1.anInt4562 / 32;
						local251 = local205 * 4 + 2 - Static28.aClass6_Sub6_Sub2_1.anInt4569 / 32;
						Static103.method1654(local221, local251, arg3, arg2, Static228.aClass1_Sub2_Sub2Array12[0], arg1);
					}
				}
			}
			for (local185 = 0; local185 < Static293.anInt5831; local185++) {
				@Pc(537) Class6_Sub6_Sub1 local537 = Static211.aClass6_Sub6_Sub1Array2[Static75.anIntArray178[local185]];
				if (local537 != null && local537.method3514()) {
					@Pc(549) Class19 local549 = local537.aClass19_1;
					if (local549 != null && local549.anIntArray67 != null) {
						local549 = local549.method507();
					}
					if (local549 != null && local549.aBoolean61 && local549.aBoolean58) {
						local251 = local537.anInt4569 / 32 - Static28.aClass6_Sub6_Sub2_1.anInt4569 / 32;
						local221 = local537.anInt4562 / 32 - Static28.aClass6_Sub6_Sub2_1.anInt4562 / 32;
						if (local549.anInt643 == -1) {
							Static103.method1654(local221, local251, arg3, arg2, Static228.aClass1_Sub2_Sub2Array12[1], arg1);
						} else {
							Static103.method1654(local221, local251, arg3, arg2, Static155.aClass1_Sub2_Sub2Array8[local549.anInt643], arg1);
						}
					}
				}
			}
			for (local185 = 0; local185 < Static241.anInt4977; local185++) {
				@Pc(632) Class6_Sub6_Sub2 local632 = Static77.aClass6_Sub6_Sub2Array1[Static143.anIntArray331[local185]];
				if (local632 != null && local632.method3514()) {
					local209 = local632.anInt4562 / 32 - Static28.aClass6_Sub6_Sub2_1.anInt4562 / 32;
					@Pc(651) boolean local651 = false;
					local221 = local632.anInt4569 / 32 - Static28.aClass6_Sub6_Sub2_1.anInt4569 / 32;
					@Pc(667) long local667 = Static136.method2158(local632.aString147);
					for (local278 = 0; local278 < Static147.anInt2712; local278++) {
						if (Static207.aLongArray9[local278] == local667 && Static22.anIntArray597[local278] != 0) {
							local651 = true;
							break;
						}
					}
					@Pc(695) boolean local695 = false;
					for (local312 = 0; local312 < Static265.anInt5302; local312++) {
						if (local667 == Static32.aClass1_Sub16Array1[local312].aLong202) {
							local695 = true;
							break;
						}
					}
					@Pc(720) boolean local720 = false;
					if (Static28.aClass6_Sub6_Sub2_1.anInt4600 != 0 && local632.anInt4600 != 0 && Static28.aClass6_Sub6_Sub2_1.anInt4600 == local632.anInt4600) {
						local720 = true;
					}
					if (local651) {
						Static103.method1654(local209, local221, arg3, arg2, Static228.aClass1_Sub2_Sub2Array12[3], arg1);
					} else if (local695) {
						Static103.method1654(local209, local221, arg3, arg2, Static228.aClass1_Sub2_Sub2Array12[5], arg1);
					} else if (local720) {
						Static103.method1654(local209, local221, arg3, arg2, Static228.aClass1_Sub2_Sub2Array12[4], arg1);
					} else {
						Static103.method1654(local209, local221, arg3, arg2, Static228.aClass1_Sub2_Sub2Array12[2], arg1);
					}
				}
			}
			@Pc(792) Class36[] local792 = Static187.aClass36Array1;
			for (local205 = 0; local205 < local792.length; local205++) {
				@Pc(802) Class36 local802 = local792[local205];
				if (local802 != null && local802.anInt1168 != 0 && Static261.anInt5259 % 20 < 10) {
					if (local802.anInt1168 == 1 && local802.anInt1172 >= 0 && Static211.aClass6_Sub6_Sub1Array2.length > local802.anInt1172) {
						@Pc(834) Class6_Sub6_Sub1 local834 = Static211.aClass6_Sub6_Sub1Array2[local802.anInt1172];
						if (local834 != null) {
							local270 = local834.anInt4569 / 32 - Static28.aClass6_Sub6_Sub2_1.anInt4569 / 32;
							local251 = local834.anInt4562 / 32 - Static28.aClass6_Sub6_Sub2_1.anInt4562 / 32;
							Static187.method2822(arg1, local270, local251, local802.anInt1166, 360000, arg3, arg2);
						}
					}
					if (local802.anInt1168 == 2) {
						local221 = (local802.anInt1171 - Static224.anInt4695) * 4 + 2 - Static28.aClass6_Sub6_Sub2_1.anInt4562 / 32;
						local251 = (-Static158.anInt2961 + local802.anInt1159) * 4 + 2 - Static28.aClass6_Sub6_Sub2_1.anInt4569 / 32;
						local270 = local802.anInt1174 * 4;
						local270 *= local270;
						Static187.method2822(arg1, local251, local221, local802.anInt1166, local270, arg3, arg2);
					}
					if (local802.anInt1168 == 10 && local802.anInt1172 >= 0 && Static77.aClass6_Sub6_Sub2Array1.length > local802.anInt1172) {
						@Pc(941) Class6_Sub6_Sub2 local941 = Static77.aClass6_Sub6_Sub2Array1[local802.anInt1172];
						if (local941 != null) {
							local251 = local941.anInt4562 / 32 - Static28.aClass6_Sub6_Sub2_1.anInt4562 / 32;
							local270 = local941.anInt4569 / 32 - Static28.aClass6_Sub6_Sub2_1.anInt4569 / 32;
							Static187.method2822(arg1, local270, local251, local802.anInt1166, 360000, arg3, arg2);
						}
					}
				}
			}
			if (Static30.anInt663 != 0) {
				local185 = Static30.anInt663 * 4 + (Static28.aClass6_Sub6_Sub2_1.method3509() + -1) * 2 + 2 - Static28.aClass6_Sub6_Sub2_1.anInt4562 / 32;
				local205 = Static24.anInt554 * 4 + Static28.aClass6_Sub6_Sub2_1.method3509() * 2 + 2 - Static28.aClass6_Sub6_Sub2_1.anInt4569 / 32 - 2;
				Static103.method1654(local185, local205, arg3, arg2, Static284.aClass1_Sub2_Sub2_12, arg1);
			}
			if (Static240.aBoolean369) {
				Static50.method866(arg2 + arg3.anInt3567 / 2 - 1, arg1 - -(arg3.anInt3595 / 2) + -1, 3, 3, 16777215);
			} else {
				Static213.method3362(arg3.anInt3567 / 2 + arg2 - 1, arg1 + arg3.anInt3595 / 2 + -1, 3, 3, 16777215);
			}
		} else if (Static240.aBoolean369) {
			@Pc(70) Class1_Sub2_Sub2 local70 = arg3.method2850(false);
			if (local70 != null) {
				local70.method3921(arg2, arg1);
			}
		} else {
			Static213.method3376(arg2, arg1, arg3.anIntArray417, arg3.anIntArray425);
		}
		Static260.aBooleanArray24[arg0] = true;
	}
}
