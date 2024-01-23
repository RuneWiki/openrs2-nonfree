import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!vl", name = "z", descriptor = "[Lclient!pn;")
	public static Class1_Sub2_Sub11[] aClass1_Sub2_Sub11Array12;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method4266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(33) int local33;
		@Pc(48) int local48;
		if (Static191.anInt3934 == 0) {
			@Pc(13) int local13 = Static169.anInt3630;
			@Pc(15) int local15 = Static23.anInt474;
			@Pc(17) int local17 = Static128.anInt2846;
			@Pc(31) int local31 = (local17 - local13) * (arg1 - arg5) / arg4 + local13;
			local33 = Static209.anInt4169;
			local48 = (local15 - local33) * (arg3 - arg2) / arg0 + local33;
			if (Static125.aBoolean209 && (Static10.anInt246 & 0x40) != 0) {
				@Pc(62) Class71 local62 = Static164.method2829(Static90.anInt2022, Static291.anInt5525);
				if (local62 == null) {
					Static197.method3237();
				} else {
					Static181.method3039((short) 47, Static54.anInt1188, Static8.aString15, local48, 0L, " ->", local31);
				}
			} else {
				if (Static87.anInt1946 == 1) {
					Static181.method3039((short) 60, -1, Static289.aString330, local48, 0L, "", local31);
				}
				Static181.method3039((short) 43, -1, Static118.aString159, local48, 0L, "", local31);
			}
		}
		@Pc(112) long local112 = -1L;
		for (local33 = 0; local33 < Static139.anInt3026; local33++) {
			@Pc(127) long local127 = Static263.aLongArray10[local33];
			local48 = (int) local127 & 0x7F;
			@Pc(139) int local139 = (int) local127 >> 7 & 0x7F;
			@Pc(146) int local146 = (int) local127 >> 29 & 0x3;
			@Pc(153) int local153 = Integer.MAX_VALUE & (int) (local127 >>> 32);
			if (local127 != local112) {
				local112 = local127;
				@Pc(242) int local242;
				if (local146 == 2 && Static60.method1070(Static140.anInt3034, local48, local139, local127)) {
					@Pc(179) Class181 local179 = Static183.method3511(local153);
					if (local179.anIntArray552 != null) {
						local179 = local179.method4427();
					}
					if (local179 == null) {
						continue;
					}
					if (Static191.anInt3934 == 1) {
						Static181.method3039((short) 58, Static162.anInt3469, Static163.aString203, local139, local127, Static194.aString237 + " -> <col=00ffff>" + local179.aString332, local48);
					} else if (Static125.aBoolean209) {
						@Pc(364) Class1_Sub2_Sub12 local364 = Static13.anInt260 == -1 ? null : Static31.method645(Static13.anInt260);
						if ((Static10.anInt246 & 0x4) != 0 && (local364 == null || local179.method4422(Static13.anInt260, local364.anInt2582) != local364.anInt2582)) {
							Static181.method3039((short) 42, Static54.anInt1188, Static8.aString15, local139, local127, Static170.aString213 + " -> <col=00ffff>" + local179.aString332, local48);
						}
					} else {
						@Pc(231) String[] local231 = local179.aStringArray58;
						if (Static21.aBoolean33) {
							local231 = Static191.method3156(local231);
						}
						if (local231 != null) {
							for (local242 = 4; local242 >= 0; local242--) {
								if (local231[local242] != null) {
									@Pc(255) int local255 = -1;
									@Pc(257) short local257 = 0;
									if (local179.anInt5571 == local242) {
										local255 = local179.anInt5575;
									}
									if (local242 == local179.anInt5540) {
										local255 = local179.anInt5555;
									}
									if (local242 == 0) {
										local257 = 18;
									}
									if (local242 == 1) {
										local257 = 51;
									}
									if (local242 == 2) {
										local257 = 37;
									}
									if (local242 == 3) {
										local257 = 16;
									}
									if (local242 == 4) {
										local257 = 1006;
									}
									Static181.method3039(local257, local255, local231[local242], local139, local127, "<col=00ffff>" + local179.aString332, local48);
								}
							}
						}
						Static181.method3039((short) 1005, Static151.anInt5601, Static176.aString219, local139, (long) local179.anInt5578, "<col=00ffff>" + local179.aString332, local48);
					}
				}
				@Pc(528) int local528;
				@Pc(516) int local516;
				@Pc(471) int local471;
				@Pc(484) int local484;
				@Pc(493) Class14_Sub2_Sub2 local493;
				@Pc(596) Class14_Sub2_Sub1 local596;
				if (local146 == 1) {
					@Pc(415) Class14_Sub2_Sub2 local415 = Static254.aClass14_Sub2_Sub2Array1[local153];
					if ((local415.aClass46_1.anInt1532 & 0x1) == 0 && (local415.anInt4680 & 0x7F) == 0 && (local415.anInt4630 & 0x7F) == 0 || (local415.aClass46_1.anInt1532 & 0x1) == 1 && (local415.anInt4680 & 0x7F) == 64 && (local415.anInt4630 & 0x7F) == 64) {
						local471 = local415.anInt4680 - (local415.aClass46_1.anInt1532 - 1) * 64;
						local242 = local415.anInt4630 + 64 - local415.aClass46_1.anInt1532 * 64;
						for (local484 = 0; local484 < Static233.anInt4582; local484++) {
							local493 = Static254.aClass14_Sub2_Sub2Array1[Static281.anIntArray464[local484]];
							if (local493 != null && !local493.aBoolean357 && local493 != local415 && local493.aBoolean358) {
								local516 = local493.anInt4630 - (local493.aClass46_1.anInt1532 - 1) * 64;
								local528 = local493.anInt4680 - (local493.aClass46_1.anInt1532 - 1) * 64;
								if (local471 <= local528 && local493.aClass46_1.anInt1532 <= local415.aClass46_1.anInt1532 - (local528 - local471 >> 7) && local242 <= local516 && local415.aClass46_1.anInt1532 - (local516 - local242 >> 7) >= local493.aClass46_1.anInt1532) {
									Static80.method1380(local139, Static281.anIntArray464[local484], local493.aClass46_1, local48);
									local493.aBoolean357 = true;
								}
							}
						}
						for (local484 = 0; local484 < Static278.anInt5374; local484++) {
							local596 = Static98.aClass14_Sub2_Sub1Array1[Static17.anIntArray444[local484]];
							if (local596 != null && !local596.aBoolean357 && local596.aBoolean358) {
								local528 = local596.anInt4680 - (local596.method3656() - 1) * 64;
								local516 = local596.anInt4630 + 64 - local596.method3656() * 64;
								if (local528 >= local471 && local596.method3656() <= local415.aClass46_1.anInt1532 - (local528 - local471 >> 7) && local242 <= local516 && local596.method3656() <= local415.aClass46_1.anInt1532 - (local516 - local242 >> 7)) {
									Static97.method1790(local139, local48, Static17.anIntArray444[local484], local596);
									local596.aBoolean357 = true;
								}
							}
						}
					}
					if (local415.aBoolean357) {
						continue;
					}
					Static80.method1380(local139, local153, local415.aClass46_1, local48);
					local415.aBoolean357 = true;
				}
				if (local146 == 0) {
					@Pc(716) Class14_Sub2_Sub1 local716 = Static98.aClass14_Sub2_Sub1Array1[local153];
					if ((local716.anInt4680 & 0x7F) == 64 && (local716.anInt4630 & 0x7F) == 64) {
						local471 = local716.anInt4680 - (local716.method3656() - 1) * 64;
						local242 = local716.anInt4630 - (local716.method3656() - 1) * 64;
						for (local484 = 0; local484 < Static233.anInt4582; local484++) {
							local493 = Static254.aClass14_Sub2_Sub2Array1[Static281.anIntArray464[local484]];
							if (local493 != null && !local493.aBoolean357 && local493.aBoolean358) {
								local516 = local493.anInt4630 - (local493.aClass46_1.anInt1532 - 1) * 64;
								local528 = local493.anInt4680 + 64 - local493.aClass46_1.anInt1532 * 64;
								if (local528 >= local471 && local493.aClass46_1.anInt1532 <= local716.method3656() - (local528 - local471 >> 7) && local516 >= local242 && local493.aClass46_1.anInt1532 <= local716.method3656() - (local516 - local242 >> 7)) {
									Static80.method1380(local139, Static281.anIntArray464[local484], local493.aClass46_1, local48);
									local493.aBoolean357 = true;
								}
							}
						}
						for (local484 = 0; local484 < Static278.anInt5374; local484++) {
							local596 = Static98.aClass14_Sub2_Sub1Array1[Static17.anIntArray444[local484]];
							if (local596 != null && !local596.aBoolean357 && local596 != local716 && local596.aBoolean358) {
								local528 = local596.anInt4680 - (local596.method3656() - 1) * 64;
								local516 = local596.anInt4630 + 64 - local596.method3656() * 64;
								if (local528 >= local471 && local596.method3656() <= local716.method3656() - (local528 - local471 >> 7) && local242 <= local516 && local596.method3656() <= local716.method3656() - (local516 - local242 >> 7)) {
									Static97.method1790(local139, local48, Static17.anIntArray444[local484], local596);
									local596.aBoolean357 = true;
								}
							}
						}
					}
					if (local716.aBoolean357) {
						continue;
					}
					Static97.method1790(local139, local48, local153, local716);
					local716.aBoolean357 = true;
				}
				if (local146 == 3) {
					@Pc(991) Class61 local991 = Static229.aClass61ArrayArrayArray1[Static140.anInt3034][local48][local139];
					if (local991 != null) {
						for (@Pc(999) Class1_Sub2_Sub19 local999 = (Class1_Sub2_Sub19) local991.method1838(); local999 != null; local999 = (Class1_Sub2_Sub19) local991.method1848()) {
							local242 = local999.aClass14_Sub5_1.anInt2755;
							@Pc(1010) Class42 local1010 = Static112.method2060(local242);
							if (Static191.anInt3934 == 1) {
								Static181.method3039((short) 39, Static162.anInt3469, Static163.aString203, local139, (long) local242, Static194.aString237 + " -> <col=ff9040>" + local1010.aString87, local48);
							} else if (Static125.aBoolean209) {
								@Pc(1050) Class1_Sub2_Sub12 local1050 = Static13.anInt260 == -1 ? null : Static31.method645(Static13.anInt260);
								if ((Static10.anInt246 & 0x1) != 0 && (local1050 == null || local1010.method1254(local1050.anInt2582, Static13.anInt260) != local1050.anInt2582)) {
									Static181.method3039((short) 32, Static54.anInt1188, Static8.aString15, local139, (long) local242, Static170.aString213 + " -> <col=ff9040>" + local1010.aString87, local48);
								}
							} else {
								@Pc(1103) String[] local1103 = local1010.aStringArray20;
								if (Static21.aBoolean33) {
									local1103 = Static191.method3156(local1103);
								}
								for (local528 = 4; local528 >= 0; local528--) {
									if (local1103 != null && local1103[local528] != null) {
										@Pc(1125) byte local1125 = 0;
										@Pc(1127) int local1127 = -1;
										if (local528 == 0) {
											local1125 = 38;
										}
										if (local528 == 1) {
											local1125 = 59;
										}
										if (local528 == 2) {
											local1125 = 40;
										}
										if (local1010.anInt1486 == local528) {
											local1127 = local1010.anInt1480;
										}
										if (local1010.anInt1467 == local528) {
											local1127 = local1010.anInt1484;
										}
										if (local528 == 3) {
											local1125 = 6;
										}
										if (local528 == 4) {
											local1125 = 30;
										}
										Static181.method3039(local1125, local1127, local1103[local528], local139, (long) local242, "<col=ff9040>" + local1010.aString87, local48);
									}
								}
								Static181.method3039((short) 1001, Static151.anInt5601, Static176.aString219, local139, (long) local242, "<col=ff9040>" + local1010.aString87, local48);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIII)V")
	public static void method4268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static283.aClass1_Sub11_Sub1_3.anInt3264 = 0;
		Static283.aClass1_Sub11_Sub1_3.method2655(20);
		Static283.aClass1_Sub11_Sub1_3.method2655(arg0);
		Static283.aClass1_Sub11_Sub1_3.method2655(arg3);
		Static283.aClass1_Sub11_Sub1_3.method2660(arg2);
		Static283.aClass1_Sub11_Sub1_3.method2660(arg1);
		Static64.anInt1382 = -3;
		Static239.anInt4742 = 1;
		Static264.anInt5178 = 0;
		Static178.anInt3968 = 0;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)V")
	public static void method4269(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static74.aClass1_Sub26ArrayArrayArray1 = Static273.aClass1_Sub26ArrayArrayArray3;
			Static55.anIntArrayArrayArray3 = Static255.anIntArrayArrayArray12;
			Static299.aClass1_Sub32ArrayArray3 = Static44.aClass1_Sub32ArrayArray1;
		} else {
			Static74.aClass1_Sub26ArrayArrayArray1 = Static140.aClass1_Sub26ArrayArrayArray2;
			Static55.anIntArrayArrayArray3 = Static108.anIntArrayArrayArray7;
			Static299.aClass1_Sub32ArrayArray3 = Static192.aClass1_Sub32ArrayArray2;
		}
		Static169.anInt3625 = Static74.aClass1_Sub26ArrayArrayArray1.length;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILclient!cg;)Lclient!ij;")
	public static Class15_Sub2 method4272(@OriginalArg(1) Class1_Sub11 arg0) {
		return new Class15_Sub2(arg0.method2632(), arg0.method2632(), arg0.method2632(), arg0.method2632(), arg0.method2681(), arg0.method2681(), arg0.method2690());
	}

	@OriginalMember(owner = "client!vl", name = "e", descriptor = "(I)V")
	public static void method4273() {
		if (!Static60.method1068() && Static226.anInt4504 != Static140.anInt3034) {
			Static102.method1907(Static181.anInt3792, false, false, Static197.aClass14_Sub2_Sub1_2.anIntArray418[0], Static140.anInt3034, Static197.aClass14_Sub2_Sub1_2.anIntArray415[0], Static153.anInt3329);
		} else if (Static242.anInt4790 != Static140.anInt3034 && Static99.method1837(Static140.anInt3034)) {
			Static242.anInt4790 = Static140.anInt3034;
			Static88.method1529();
		}
	}
}
