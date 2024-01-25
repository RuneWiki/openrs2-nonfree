import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!dl", name = "B", descriptor = "Lclient!l;")
	public static Class95 aClass95_4;

	@OriginalMember(owner = "client!dl", name = "D", descriptor = "I")
	public static int anInt1500;

	@OriginalMember(owner = "client!dl", name = "E", descriptor = "Lclient!um;")
	public static Class248 aClass248_3;

	@OriginalMember(owner = "client!dl", name = "w", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_58 = new Class56(91, 10);

	@OriginalMember(owner = "client!dl", name = "z", descriptor = "[I")
	public static final int[] anIntArray111 = new int[3];

	@OriginalMember(owner = "client!dl", name = "C", descriptor = "Lclient!hd;")
	public static Class110 aClass110_3 = null;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Ljava/lang/String;ZJIIIZILjava/lang/String;ZZI)V")
	public static void method1223(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10) {
		if (arg1) {
			Static66.method1087();
			if (Static150.aString22.equals("")) {
				Static26.anInt634 = 39;
				return;
			}
		}
		@Pc(19) int[] local19 = new int[4];
		for (@Pc(21) int local21 = 0; local21 < 3; local21++) {
			local19[local21] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(46) Class4_Sub9 local46 = new Class4_Sub9(128);
		local46.method4999(10);
		local46.method5029((arg8 ? 4 : 0) | (arg5 ? 1 : 0) | (arg9 ? 2 : 0));
		local46.method5030(arg2);
		local46.method5047(local19[0]);
		local46.method5039(arg7);
		local46.method5047(local19[1]);
		local46.method5029(Static400.anInt6511);
		local46.method4999(arg10);
		local46.method4999(arg4);
		local46.method5047(local19[2]);
		local46.method5029(arg3);
		local46.method5029(arg6);
		local46.method5047(local19[3]);
		local46.method5002(Static173.aBigInteger1, Static457.aBigInteger2);
		@Pc(132) Class4_Sub9 local132 = new Class4_Sub9(366);
		local132.method5039(arg0);
		if (arg1) {
			local132.method5030(Static298.method3885(Static150.aString22));
			try {
				local132.method5030(Long.parseLong(Static276.aString38));
			} catch (@Pc(151) Exception local151) {
				Static26.anInt634 = 39;
				return;
			}
		}
		@Pc(162) int local162 = 8 - (local132.anInt6207 & 0x7);
		for (@Pc(164) int local164 = 0; local164 < local162; local164++) {
			local132.method4999((int) (Math.random() * 255.0D));
		}
		local132.method5064(local19);
		Static247.aClass4_Sub9_Sub2_2.anInt6207 = 0;
		Static247.aClass4_Sub9_Sub2_2.method4999(arg1 ? Static389.aClass44_12.anInt1111 : Static389.aClass44_9.anInt1111);
		Static247.aClass4_Sub9_Sub2_2.method5029(local46.anInt6207 + local132.anInt6207 + 28);
		Static247.aClass4_Sub9_Sub2_2.method5029(593);
		Static247.aClass4_Sub9_Sub2_2.method4999(Static429.anInt6999);
		Static247.aClass4_Sub9_Sub2_2.method4999(Static231.aClass6_7.anInt96);
		Static247.method3253(Static247.aClass4_Sub9_Sub2_2);
		Static247.aClass4_Sub9_Sub2_2.method5052(local46.anInt6207, local46.aByteArray81);
		Static247.aClass4_Sub9_Sub2_2.method5052(local132.anInt6207, local132.aByteArray81);
		Static254.anInt4212 = 1;
		Static26.anInt634 = -3;
		Static344.anInt5705 = 0;
		Static313.anInt5081 = 0;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILclient!ya;I)Z")
	public static boolean method1224(@OriginalArg(1) Class135 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = (Static337.anInt5497 - 104) / 2;
		@Pc(17) int local17 = (Static282.anInt4644 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg1; local29 <= 3; local29++) {
					if (Static376.method4953(local29, local21, arg1, local25)) {
						local40 = local29;
						if (Static215.method4450(local21, local25)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static452.method5998(local25, local40, local21);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(89) int[] local89 = new int[262144];
		for (local29 = 0; local29 < local89.length; local29++) {
			local89[local29] = -16777216;
		}
		Static224.aClass95_11 = arg0.method5351(local89, 512, 512, 512);
		Static98.method1496();
		local40 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 + -10 << 8) + 238 - 10 | 0xFF000000;
		@Pc(162) int local162 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xCE9FFF00) << 16;
		@Pc(181) int local181 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8;
		@Pc(190) boolean[][] local190 = new boolean[Static332.anInt5412][Static332.anInt5412];
		@Pc(196) int local196;
		@Pc(213) int local213;
		@Pc(217) int local217;
		@Pc(221) int local221;
		@Pc(274) int local274;
		@Pc(280) int local280;
		@Pc(284) int local284;
		@Pc(303) int local303;
		for (@Pc(192) int local192 = local11; local192 < local11 + 104; local192 += Static332.anInt5412) {
			for (local196 = local17; local196 < local17 + 104; local196 += Static332.anInt5412) {
				arg0.OA(0, 0, Static332.anInt5412 * 4, Static332.anInt5412 * 4);
				arg0.p(-16777216);
				for (local213 = arg1; local213 <= 3; local213++) {
					for (local217 = 0; local217 < Static332.anInt5412; local217++) {
						for (local221 = 0; local221 < Static332.anInt5412; local221++) {
							local190[local217][local221] = Static376.method4953(local213, local217 + local192, arg1, local196 + local221);
						}
					}
					Static228.aClass41Array2[local213].method5563(local192, local196, Static332.anInt5412 + local192, Static332.anInt5412 + local196, local190);
					if (!Static11.aBoolean7) {
						for (local221 = -4; local221 < Static332.anInt5412; local221++) {
							for (local274 = -4; local274 < Static332.anInt5412; local274++) {
								local280 = local221 + local192;
								local284 = local274 + local196;
								if (local11 <= local280 && local17 <= local284 && Static376.method4953(local213, local280, arg1, local284)) {
									local303 = local213;
									if (Static215.method4450(local280, local284)) {
										local303 = local213 - 1;
									}
									if (local303 >= 0) {
										Static10.method132(arg0, local221 * 4, local303, (Static332.anInt5412 - local274) * 4 - 4, local280, local40, local162, local284);
									}
								}
							}
						}
					}
				}
				if (Static11.aBoolean7) {
					@Pc(356) Class128 local356 = Static409.aClass128Array1[arg1];
					for (local221 = 0; local221 < Static332.anInt5412; local221++) {
						for (local274 = 0; local274 < Static332.anInt5412; local274++) {
							local280 = local192 + local221;
							local284 = local274 + local196;
							local303 = local356.anIntArrayArray38[local280 - local356.anInt3180][local284 - local356.anInt3167];
							if ((local303 & 0x40240000) != 0) {
								arg0.method5394(4, local221 * 4, 4, (Static332.anInt5412 - local274) * 4 - 4, -1713569622);
							} else if ((local303 & 0x800000) != 0) {
								arg0.method5402(4, local221 * 4, -1713569622, (Static332.anInt5412 - local274) * 4 - 4);
							} else if ((local303 & 0x2000000) != 0) {
								arg0.method5368(4, local221 * 4 + 3, (-local274 + Static332.anInt5412) * 4 - 4, -1713569622);
							} else if ((local303 & 0x8000000) != 0) {
								arg0.method5402(4, local221 * 4, -1713569622, (Static332.anInt5412 - local274) * 4 - 1);
							} else if ((local303 & 0x20000000) != 0) {
								arg0.method5368(4, local221 * 4, (Static332.anInt5412 - local274) * 4 - 4, -1713569622);
							}
						}
					}
				}
				arg0.O(0, 0, Static332.anInt5412 * 4, Static332.anInt5412 * 4, local181, 2);
				Static224.aClass95_11.t((local192 - local11) * 4 + 48, -(Static332.anInt5412 * 4) + 464 + -((-local17 + local196) * 4), Static332.anInt5412 * 4, Static332.anInt5412 * 4, 0, 0);
			}
		}
		arg0.e();
		arg0.p(-16777215);
		Static194.method5772();
		Static248.anInt4505 = 0;
		Static259.aClass244_22.method5264();
		if (!Static11.aBoolean7) {
			for (local196 = local11; local196 < local11 + 104; local196++) {
				for (local213 = local17; local213 < local17 + 104; local213++) {
					for (local217 = arg1; arg1 + 1 >= local217 && local217 <= 3; local217++) {
						if (Static376.method4953(local217, local196, arg1, local213)) {
							@Pc(625) Interface4 local625 = (Interface4) Static190.method2771(local217, local196, local213);
							if (local625 == null) {
								local625 = (Interface4) Static64.method926(local217, local196, local213, fw.class);
							}
							if (local625 == null) {
								local625 = (Interface4) Static14.method170(local217, local196, local213);
							}
							if (local625 == null) {
								local625 = (Interface4) Static169.method2325(local217, local196, local213);
							}
							if (local625 != null) {
								@Pc(668) Class114 local668 = Static51.aClass151_1.method2917(local625.method5603());
								if (!local668.aBoolean207 || Static225.aBoolean284) {
									local280 = local668.anInt2845;
									if (local668.anIntArray235 != null) {
										for (local284 = 0; local284 < local668.anIntArray235.length; local284++) {
											if (local668.anIntArray235[local284] != -1) {
												@Pc(700) Class114 local700 = Static51.aClass151_1.method2917(local668.anIntArray235[local284]);
												if (local700.anInt2845 >= 0) {
													local280 = local700.anInt2845;
												}
											}
										}
									}
									if (local280 >= 0) {
										@Pc(722) boolean local722 = false;
										if (local280 >= 0) {
											@Pc(734) Class100 local734 = Static82.aClass235_1.method4957(local280);
											if (local734 != null && local734.aBoolean160) {
												local722 = true;
											}
										}
										local303 = local196;
										@Pc(745) int local745 = local213;
										if (local722) {
											@Pc(752) int[][] local752 = Static409.aClass128Array1[local217].anIntArrayArray38;
											@Pc(757) int local757 = Static409.aClass128Array1[local217].anInt3180;
											@Pc(762) int local762 = Static409.aClass128Array1[local217].anInt3167;
											for (@Pc(764) int local764 = 0; local764 < 10; local764++) {
												@Pc(771) int local771 = (int) (Math.random() * 4.0D);
												if (local771 == 0 && local11 < local303 && local303 > local196 - 3 && (local752[local303 - local757 - 1][local745 - local762] & 0x2C0108) == 0) {
													local303--;
												}
												if (local771 == 1 && local303 < local11 + 104 - 1 && local303 < local196 + 3 && (local752[local303 + 1 - local757][local745 - local762] & 0x2C0180) == 0) {
													local303++;
												}
												if (local771 == 2 && local17 < local745 && local745 > local213 - 3 && (local752[local303 - local757][local745 - local762 - 1] & 0x2C0102) == 0) {
													local745--;
												}
												if (local771 == 3 && local17 + 104 - 1 > local745 && local745 < local213 + 3 && (local752[local303 - local757][local745 + 1 - local762] & 0x2C0120) == 0) {
													local745++;
												}
											}
										}
										Static170.anIntArray553[Static248.anInt4505] = local668.anInt2875;
										Static361.anIntArray51[Static248.anInt4505] = local303;
										Static102.anIntArray140[Static248.anInt4505] = local745;
										Static248.anInt4505++;
									}
								}
							}
						}
					}
				}
			}
			if (Static337.aClass11_2 != null) {
				Static170.aClass211_95.anInt5388 = 1;
				Static82.aClass235_1.method4956(1024, 64);
				for (local213 = 0; local213 < Static337.aClass11_2.anInt186; local213++) {
					local217 = Static337.aClass11_2.anIntArray7[local213];
					if (local217 >> 28 == Static401.aClass8_Sub3_Sub1_Sub1_2.aByte99) {
						local221 = (local217 >> 14 & 0x3FFF) - Static365.anInt6047;
						local274 = (local217 & 0x3FFF) - Static366.anInt6052;
						if (local221 >= 0 && Static337.anInt5497 > local221 && local274 >= 0 && Static282.anInt4644 > local274) {
							Static259.aClass244_22.method5273(new Class4_Sub24(local213));
						} else {
							@Pc(1028) Class100 local1028 = Static82.aClass235_1.method4957(Static337.aClass11_2.anIntArray9[local213]);
							if (local1028.anIntArray207 != null && local221 + local1028.anInt2477 >= 0 && Static337.anInt5497 > local221 + local1028.anInt2461 && local274 + local1028.anInt2472 >= 0 && local1028.anInt2465 + local274 < Static282.anInt4644) {
								Static259.aClass244_22.method5273(new Class4_Sub24(local213));
							}
						}
					}
				}
				Static82.aClass235_1.method4956(128, 64);
				Static170.aClass211_95.anInt5388 = 2;
				Static170.aClass211_95.method4379();
			}
		}
		return true;
	}
}
