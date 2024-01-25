import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!ee", name = "s", descriptor = "I")
	public static int anInt1524 = 0;

	@OriginalMember(owner = "client!ee", name = "x", descriptor = "Z")
	public static boolean aBoolean144 = false;

	@OriginalMember(owner = "client!ee", name = "M", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_23 = new Class93("Examine", "Untersuchen", "Examiner", "Examinar");

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IBI)I")
	public static int method1573(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = arg1 * 57 + arg0;
		@Pc(23) int local23 = local17 << 13 ^ local17;
		@Pc(37) int local37 = local23 * (local23 * local23 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local37 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BCI)I")
	public static int method1574(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local12 = (arg0 << 4) + 1;
		}
		if (arg0 == 'ñ' && arg1 == 0) {
			local12 = 1762;
		}
		return local12;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)V")
	public static void method1578(@OriginalArg(1) int arg0) {
		if (!Static231.aBoolean537) {
			arg0 = -1;
		}
		if (Static160.anInt3243 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(22) Class178 local22 = Static59.method1351(arg0);
			@Pc(26) Class76 local26 = local22.method5081();
			if (local26 == null) {
				arg0 = -1;
			} else {
				Static177.aClass168_2.method4842(local26.method2359(), new Point(local22.anInt5710, local22.anInt5703), local26.method2365(), Static240.aCanvas4, local26.method2366());
				Static160.anInt3243 = arg0;
			}
		}
		if (arg0 == -1 && Static160.anInt3243 != -1) {
			Static177.aClass168_2.method4842(null, new Point(), -1, Static240.aCanvas4, -1);
			Static160.anInt3243 = -1;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IILclient!ae;)V")
	public static void method1579(@OriginalArg(1) int arg0, @OriginalArg(2) Class4 arg1) {
		Static339.method5842(arg1);
		@Pc(19) int local19;
		@Pc(23) int local23;
		if (arg0 > 1) {
			for (local19 = 0; local19 < Static95.anInt6381; local19++) {
				for (local23 = 0; local23 < Static237.anInt4532; local23++) {
					if ((Static313.aByteArrayArrayArray12[1][local19][local23] & 0x2) == 2) {
						Static305.method5356(local19, local23);
					}
				}
			}
		}
		for (local19 = 0; local19 < arg0; local19++) {
			for (local23 = 0; local23 <= Static237.anInt4532; local23++) {
				for (@Pc(61) int local61 = 0; local61 <= Static95.anInt6381; local61++) {
					@Pc(75) int local75;
					@Pc(77) int local77;
					@Pc(79) int local79;
					@Pc(101) int local101;
					@Pc(130) int local130;
					@Pc(212) int local212;
					@Pc(220) int local220;
					@Pc(240) int local240;
					@Pc(244) int local244;
					if ((Static272.aByteArrayArrayArray9[local19][local61][local23] & 0x1) != 0) {
						local75 = local23;
						local77 = local23;
						local79 = local19;
						while (local75 > 0 && (Static272.aByteArrayArrayArray9[local19][local61][local75 - 1] & 0x1) != 0) {
							local75--;
						}
						local101 = local19;
						while (local77 < Static237.anInt4532 && (Static272.aByteArrayArrayArray9[local19][local61][local77 + 1] & 0x1) != 0) {
							local77++;
						}
						label164: while (local79 > 0) {
							for (local130 = local75; local130 <= local77; local130++) {
								if ((Static272.aByteArrayArrayArray9[local79 - 1][local61][local130] & 0x1) == 0) {
									break label164;
								}
							}
							local79--;
						}
						label153: while (local101 < 3) {
							for (local130 = local75; local130 <= local77; local130++) {
								if ((Static272.aByteArrayArrayArray9[local101 + 1][local61][local130] & 0x1) == 0) {
									break label153;
								}
							}
							local101++;
						}
						local130 = (local101 + 1 - local79) * (local77 + 1 - local75);
						if (local130 >= 2) {
							local212 = Static109.anIntArrayArrayArray3[local101][local61][local75] - 240;
							local220 = Static109.anIntArrayArrayArray3[local79][local61][local75];
							Static107.method2343(1, local61 * 128, local61 * 128, local75 * 128, local77 * 128 + 128, local212, local220);
							for (local240 = local79; local240 <= local101; local240++) {
								for (local244 = local75; local244 <= local77; local244++) {
									Static272.aByteArrayArrayArray9[local240][local61][local244] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((Static272.aByteArrayArrayArray9[local19][local61][local23] & 0x2) != 0) {
						local75 = local61;
						local77 = local61;
						local79 = local19;
						local101 = local19;
						while (local75 > 0 && (Static272.aByteArrayArrayArray9[local19][local75 - 1][local23] & 0x2) != 0) {
							local75--;
						}
						while (local77 < Static95.anInt6381 && (Static272.aByteArrayArrayArray9[local19][local77 + 1][local23] & 0x2) != 0) {
							local77++;
						}
						label218: while (local79 > 0) {
							for (local130 = local75; local130 <= local77; local130++) {
								if ((Static272.aByteArrayArrayArray9[local79 - 1][local130][local23] & 0x2) == 0) {
									break label218;
								}
							}
							local79--;
						}
						label207: while (local101 < 3) {
							for (local130 = local75; local130 <= local77; local130++) {
								if ((Static272.aByteArrayArrayArray9[local101 + 1][local130][local23] & 0x2) == 0) {
									break label207;
								}
							}
							local101++;
						}
						local130 = (local77 + 1 - local75) * (local101 + 1 - local79);
						if (local130 >= 2) {
							local212 = Static109.anIntArrayArrayArray3[local101][local75][local23] - 240;
							local220 = Static109.anIntArrayArrayArray3[local79][local75][local23];
							Static107.method2343(2, local75 * 128, local77 * 128 + 128, local23 * 128, local23 * 128, local212, local220);
							for (local240 = local79; local240 <= local101; local240++) {
								for (local244 = local75; local244 <= local77; local244++) {
									Static272.aByteArrayArrayArray9[local240][local244][local23] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((Static272.aByteArrayArrayArray9[local19][local61][local23] & 0x4) != 0) {
						local75 = local61;
						local77 = local61;
						for (local79 = local23; local79 > 0 && (Static272.aByteArrayArrayArray9[local19][local61][local79 - 1] & 0x4) != 0; local79--) {
						}
						for (local101 = local23; local101 < Static237.anInt4532 && (Static272.aByteArrayArrayArray9[local19][local61][local101 + 1] & 0x4) != 0; local101++) {
						}
						label271: while (local75 > 0) {
							for (local130 = local79; local130 <= local101; local130++) {
								if ((Static272.aByteArrayArrayArray9[local19][local75 - 1][local130] & 0x4) == 0) {
									break label271;
								}
							}
							local75--;
						}
						label260: while (Static95.anInt6381 > local77) {
							for (local130 = local79; local130 <= local101; local130++) {
								if ((Static272.aByteArrayArrayArray9[local19][local77 + 1][local130] & 0x4) == 0) {
									break label260;
								}
							}
							local77++;
						}
						if ((local77 + 1 - local75) * (-local79 + local101 + 1) >= 4) {
							local130 = Static109.anIntArrayArrayArray3[local19][local75][local79];
							Static107.method2343(4, local75 * 128, local77 * 128 + 128, local79 * 128, local101 * 128 + 128, local130, local130);
							for (@Pc(663) int local663 = local75; local663 <= local77; local663++) {
								for (local212 = local79; local212 <= local101; local212++) {
									Static272.aByteArrayArrayArray9[local19][local663][local212] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIZI)V")
	public static void method1581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static228.anInt920 <= arg3 && arg3 <= Static307.anInt6214) {
			@Pc(23) int local23 = Static24.method734(Static96.anInt2180, arg1, Static124.anInt4221);
			@Pc(33) int local33 = Static24.method734(Static96.anInt2180, arg0, Static124.anInt4221);
			Static170.method2884(local33, arg2, local23, arg3);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZZIIII)V")
	public static void method1582(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static275.aClass8ArrayArrayArray4 == null) {
			Static147.aClass4_2.method4261(arg3, arg4, arg1, arg2, -16777216);
			return;
		}
		Static241.anInt4651++;
		if (Static41.aClass62_Sub1_Sub2_Sub2_2 != null && Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5289 + 64 - Static41.aClass62_Sub1_Sub2_Sub2_2.method4777() * 64 >> 7 == Static201.anInt3909 && Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5280 - (Static41.aClass62_Sub1_Sub2_Sub2_2.method4777() - 1) * 64 >> 7 == Static116.anInt2576) {
			Static116.anInt2576 = -1;
			Static201.anInt3909 = -1;
			Static271.method4898();
		}
		Static181.method3479();
		if (!arg0) {
			Static215.method3807();
		}
		Static261.method4666();
		Static30.method767(arg2, arg4, arg3, true, arg1);
		@Pc(77) int local77 = Static254.anInt5030;
		@Pc(79) int local79 = Static156.anInt3172;
		@Pc(81) int local81 = Static278.anInt5654;
		@Pc(83) int local83 = Static7.anInt154;
		@Pc(92) int local92;
		@Pc(131) int local131;
		if (Static182.anInt3602 == 1) {
			local92 = (int) Static331.aFloat43;
			if (Static152.anInt3112 >> 8 > local92) {
				local92 = Static152.anInt3112 >> 8;
			}
			if (Static171.aBooleanArray16[4] && local92 < Static6.anIntArray5[4] + 128) {
				local92 = Static6.anIntArray5[4] + 128;
			}
			local131 = (int) Static92.aFloat28 + Static102.anInt2330 & 0x3FFF;
			Static168.method3165(local131, local92, local77, Static321.anInt6465, (local92 >> 3) * 3 + 600, Static138.method2745(Static182.anInt3603, Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5289, Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5280) + -50, Static97.anInt6858);
		} else if (Static182.anInt3602 == 4) {
			local92 = (int) Static331.aFloat43;
			if (local92 < Static152.anInt3112 >> 8) {
				local92 = Static152.anInt3112 >> 8;
			}
			if (Static171.aBooleanArray16[4] && Static6.anIntArray5[4] + 128 > local92) {
				local92 = Static6.anIntArray5[4] + 128;
			}
			local131 = (int) Static92.aFloat28 & 0x3FFF;
			Static168.method3165(local131, local92, local77, Static321.anInt6465, (local92 >> 3) * 3 + 600, Static138.method2745(Static182.anInt3603, Static24.anInt501, Static347.anInt4215) + -50, Static97.anInt6858);
		} else if (Static182.anInt3602 == 5) {
			Static134.method2693(local77);
		}
		local92 = Static287.anInt5819;
		local131 = Static163.anInt1495;
		@Pc(227) int local227 = Static290.anInt5837;
		@Pc(229) int local229 = Static283.anInt5723;
		@Pc(231) int local231 = Static291.anInt5883;
		@Pc(275) int local275;
		for (@Pc(233) int local233 = 0; local233 < 5; local233++) {
			if (Static171.aBooleanArray16[local233]) {
				local275 = (int) ((double) -Static73.anIntArray290[local233] + (double) (Static73.anIntArray290[local233] * 2 + 1) * Math.random() + Math.sin((double) Static267.anIntArray402[local233] / 100.0D * (double) Static154.anIntArray477[local233]) * (double) Static6.anIntArray5[local233]);
				if (local233 == 0) {
					Static287.anInt5819 += local275;
				}
				if (local233 == 2) {
					Static290.anInt5837 += local275;
				}
				if (local233 == 4) {
					Static283.anInt5723 += local275;
					if (Static283.anInt5723 < 1024) {
						Static283.anInt5723 = 1024;
					} else if (Static283.anInt5723 > 3072) {
						Static283.anInt5723 = 3072;
					}
				}
				if (local233 == 3) {
					Static291.anInt5883 = local275 + Static291.anInt5883 & 0x3FFF;
				}
				if (local233 == 1) {
					Static163.anInt1495 += local275;
				}
			}
		}
		if (Static287.anInt5819 < 0) {
			Static287.anInt5819 = 0;
		}
		if (Static290.anInt5837 < 0) {
			Static290.anInt5837 = 0;
		}
		if ((Static223.anInt4280 << 7) - 1 < Static287.anInt5819) {
			Static287.anInt5819 = (Static223.anInt4280 << 7) - 1;
		}
		if ((Static160.anInt3244 << 7) - 1 < Static290.anInt5837) {
			Static290.anInt5837 = (Static160.anInt3244 << 7) - 1;
		}
		Static21.method692();
		Static215.method3811();
		Static147.aClass4_2.method4252(local79, local83, local81 + local79, local77 + local83);
		Static147.aClass4_2.method4225();
		local275 = Static284.anInt5760;
		if (Static89.aClass18_1 == null) {
			Static147.aClass4_2.method4283(local275);
		} else {
			Static89.aClass18_1.method695(Static283.anInt5723, Static291.anInt5883, local79, local77, local81, local275, Static82.anInt2744 << 3, Static147.aClass4_2, local83);
		}
		Static166.method3083();
		Static88.aClass133_4.method4339(Static287.anInt5819, Static163.anInt1495, Static290.anInt5837, -Static283.anInt5723 & 0x3FFF, -Static291.anInt5883 & 0x3FFF, -Static344.anInt6885 & 0x3FFF);
		Static147.aClass4_2.method4233(Static88.aClass133_4);
		Static147.aClass4_2.method4266(local81 / 2 + local79, local77 / 2 + local83, Static255.anInt5040 << 1, Static255.anInt5040 << 1);
		Static159.method3014(Static255.anInt5040 << 1, local81 / 2 + local79, local77 / 2 + local83, Static255.anInt5040 << 1);
		Static40.method944(-Static291.anInt5883 & 0x3FFF, Static287.anInt5819, Static163.anInt1495, -Static344.anInt6885 & 0x3FFF, -Static283.anInt5723 & 0x3FFF, Static290.anInt5837);
		@Pc(496) byte local496 = Static116.method2494() == 2 ? (byte) Static241.anInt4651 : 1;
		Static306.method5409(Static147.aClass4_2, Static212.anInt4090, Static30.anInt553, Static88.aClass133_4, Static287.anInt5819, Static163.anInt1495, Static290.anInt5837, Static66.aByteArrayArrayArray3, Static110.anIntArray224, Static183.anIntArray295, Static209.anIntArray371, Static183.anIntArray296, Static47.anIntArray90, Static182.anInt3603 + 1, local496, Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5289 >> 7, Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5280 >> 7, !Static40.aBoolean79);
		Static166.method3083();
		if (Static263.anInt5396 == 30) {
			Static326.method5740(local79, local83, local81, local77);
			Static128.method2623(local79, local81, local83, local77);
			Static81.method1821(local83, local81, local77, local79);
			Static48.method1188(local83, local81, local77, local79);
		}
		Static7.method212();
		Static163.anInt1495 = local131;
		Static283.anInt5723 = local229;
		Static287.anInt5819 = local92;
		Static290.anInt5837 = local227;
		Static291.anInt5883 = local231;
		if (Static186.aBoolean490 && Static193.aClass165_1.method4807() == 0) {
			Static186.aBoolean490 = false;
		}
		if (Static186.aBoolean490) {
			Static147.aClass4_2.method4261(local83, local79, local77, local81, -16777216);
			Static224.method3945(false, Static111.aClass93_46.method2819(Static21.anInt455), Static193.aClass37_2);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIII)Lclient!fj;")
	public static Class62_Sub1_Sub2 method1585(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class8 local11 = Static275.aClass8ArrayArrayArray4[arg1][arg2][arg0];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class62_Sub1_Sub2 local17 = null;
		@Pc(19) int local19 = -1;
		for (@Pc(27) Class172 local27 = local11.aClass172_1; local27 != null; local27 = local27.aClass172_4) {
			@Pc(31) Class62_Sub1 local31 = local27.aClass62_Sub1_1;
			if (local31 instanceof Class62_Sub1_Sub2) {
				@Pc(37) Class62_Sub1_Sub2 local37 = (Class62_Sub1_Sub2) local31;
				@Pc(49) int local49 = local37.method4777() * 64 + 60 - 64;
				@Pc(57) int local57 = local37.anInt5289 - local49 >> 7;
				@Pc(65) int local65 = local37.anInt5280 - local49 >> 7;
				@Pc(72) int local72 = local49 + local37.anInt5289 >> 7;
				@Pc(79) int local79 = local37.anInt5280 + local49 >> 7;
				if (local57 <= arg2 && local65 <= arg0 && arg2 <= local72 && arg0 <= local79) {
					@Pc(113) int local113 = (local72 + 1 - arg2) * (local79 - -1 + -arg0);
					if (local19 < local113) {
						local19 = local113;
						local17 = local37;
					}
				}
			}
		}
		return local17;
	}
}
