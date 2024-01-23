import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!jm", name = "l", descriptor = "[[[Lclient!i;")
	public static Class1_Sub14[][][] aClass1_Sub14ArrayArrayArray2;

	@OriginalMember(owner = "client!jm", name = "q", descriptor = "I")
	public static int anInt2996;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(BLclient!im;)V")
	public static void method2266(@OriginalArg(1) Class1_Sub16 arg0) {
		@Pc(9) int local9 = arg0.method2618();
		Static115.aClass64Array1 = new Class64[local9];
		@Pc(14) int local14;
		for (local14 = 0; local14 < local9; local14++) {
			Static115.aClass64Array1[local14] = new Class64();
			Static115.aClass64Array1[local14].anInt2056 = arg0.method2618();
			Static115.aClass64Array1[local14].aString61 = arg0.method2608();
		}
		Static299.anInt6238 = arg0.method2618();
		Static177.anInt3990 = arg0.method2618();
		Static205.anInt4565 = arg0.method2618();
		Static24.aClass140_Sub1Array1 = new Class140_Sub1[Static177.anInt3990 + 1 - Static299.anInt6238];
		for (local14 = 0; local14 < Static205.anInt4565; local14++) {
			@Pc(78) int local78 = arg0.method2618();
			@Pc(86) Class140_Sub1 local86 = Static24.aClass140_Sub1Array1[local78] = new Class140_Sub1();
			local86.anInt5446 = arg0.method2655();
			local86.anInt5451 = arg0.method2610();
			local86.anInt5462 = Static299.anInt6238 + local78;
			local86.aString176 = arg0.method2608();
			local86.aString175 = arg0.method2608();
		}
		Static129.anInt2870 = arg0.method2610();
		Static36.aBoolean66 = true;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)V")
	public static void method2268() {
		Static199.aClass155_37.method4362();
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Z)V")
	public static void method2270() {
		Static83.aClass155_14.method4354();
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIII)V")
	public static void method2271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(10) int local10 = arg2 - arg0;
		@Pc(15) int local15 = arg1 - arg3;
		if (local10 == 0) {
			if (local15 != 0) {
				Static227.method3947(arg3, arg1, arg4, arg0);
			}
		} else if (local15 == 0) {
			Static153.method2861(arg0, arg2, arg3, arg4);
		} else {
			if (local10 < 0) {
				local10 = -local10;
			}
			if (local15 < 0) {
				local15 = -local15;
			}
			@Pc(64) boolean local64 = local10 < local15;
			@Pc(68) int local68;
			@Pc(74) int local74;
			if (local64) {
				local68 = arg0;
				arg0 = arg3;
				arg3 = local68;
				local74 = arg2;
				arg2 = arg1;
				arg1 = local74;
			}
			if (arg0 > arg2) {
				local68 = arg0;
				arg0 = arg2;
				arg2 = local68;
				local74 = arg3;
				arg3 = arg1;
				arg1 = local74;
			}
			local68 = arg3;
			local74 = arg2 - arg0;
			@Pc(103) int local103 = arg1 - arg3;
			if (local103 < 0) {
				local103 = -local103;
			}
			@Pc(115) int local115 = arg3 < arg1 ? 1 : -1;
			@Pc(120) int local120 = -(local74 >> 1);
			@Pc(124) int local124;
			if (local64) {
				for (local124 = arg0; local124 <= arg2; local124++) {
					Static57.anIntArrayArray9[local124][local68] = arg4;
					local120 += local103;
					if (local120 > 0) {
						local120 -= local74;
						local68 += local115;
					}
				}
			} else {
				for (local124 = arg0; local124 <= arg2; local124++) {
					local120 += local103;
					Static57.anIntArrayArray9[local68][local124] = arg4;
					if (local120 > 0) {
						local120 -= local74;
						local68 += local115;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IB)V")
	public static void method2272() {
		Static15.aClass155_4.method4364(5);
		Static129.aClass155_24.method4364(5);
		Static194.aClass155_36.method4364(5);
		Static173.aClass155_33.method4364(5);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)[B")
	public static byte[] method2273(@OriginalArg(1) int arg0) {
		@Pc(18) Class1_Sub2_Sub13 local18 = (Class1_Sub2_Sub13) Static269.aClass125_11.method3669((long) arg0);
		if (local18 == null) {
			@Pc(25) byte[] local25 = new byte[512];
			@Pc(31) Random local31 = new Random((long) arg0);
			@Pc(33) int local33;
			for (local33 = 0; local33 < 255; local33++) {
				local25[local33] = (byte) local33;
			}
			for (local33 = 0; local33 < 255; local33++) {
				@Pc(56) int local56 = 255 - local33;
				@Pc(61) int local61 = Static13.method291(local56, local31);
				@Pc(65) byte local65 = local25[local61];
				local25[local61] = local25[local56];
				local25[local56] = local25[511 - local33] = local65;
			}
			local18 = new Class1_Sub2_Sub13(local25);
			Static269.aClass125_11.method3671(local18, (long) arg0);
		}
		return local18.aByteArray36;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Z[[[IB[Lclient!de;)V")
	public static void method2274(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(3) Class36[] arg2) {
		@Pc(9) byte local9;
		if (arg0) {
			local9 = 1;
		} else {
			local9 = 4;
		}
		@Pc(17) int local17;
		@Pc(24) int local24;
		if (!arg0) {
			for (local17 = 0; local17 < 4; local17++) {
				for (local24 = 0; local24 < 104; local24++) {
					for (@Pc(31) int local31 = 0; local31 < 104; local31++) {
						if ((Static126.aByteArrayArrayArray24[local17][local24][local31] & 0x1) == 1) {
							@Pc(52) int local52 = local17;
							if ((Static126.aByteArrayArrayArray24[1][local24][local31] & 0x2) == 2) {
								local52 = local17 - 1;
							}
							if (local52 >= 0) {
								arg2[local52].method956(local31, local24);
							}
						}
					}
				}
			}
			Static141.anInt3233 += (int) (Math.random() * 5.0D) - 2;
			if (Static141.anInt3233 < -16) {
				Static141.anInt3233 = -16;
			}
			if (Static141.anInt3233 > 16) {
				Static141.anInt3233 = 16;
			}
			Static290.anInt6099 += (int) (Math.random() * 5.0D) - 2;
			if (Static290.anInt6099 < -8) {
				Static290.anInt6099 = -8;
			}
			if (Static290.anInt6099 > 8) {
				Static290.anInt6099 = 8;
			}
		}
		local17 = Static290.anInt6099 >> 2 << 10;
		@Pc(139) int[][] local139 = new int[104][104];
		local24 = Static141.anInt3233 >> 1;
		@Pc(147) int[][] local147 = new int[104][104];
		@Pc(149) int local149;
		@Pc(170) int local170;
		@Pc(176) int local176;
		@Pc(178) int local178;
		@Pc(185) int local185;
		@Pc(325) int local325;
		@Pc(209) int local209;
		@Pc(231) int local231;
		@Pc(244) int local244;
		@Pc(250) int local250;
		@Pc(308) int local308;
		for (local149 = 0; local149 < local9; local149++) {
			@Pc(164) byte[][] local164 = Static271.aByteArrayArrayArray52[local149];
			@Pc(304) int local304;
			@Pc(298) int local298;
			@Pc(539) int local539;
			@Pc(545) int local545;
			@Pc(611) int local611;
			if (!Static296.aBoolean335) {
				local170 = (int) Math.sqrt(5100.0D);
				local176 = local170 * 768 >> 8;
				for (local178 = 1; local178 < 103; local178++) {
					for (local185 = 1; local185 < 103; local185++) {
						local209 = Static287.anIntArrayArrayArray18[local149][local185 + 1][local178] - Static287.anIntArrayArrayArray18[local149][local185 - 1][local178];
						local231 = Static287.anIntArrayArrayArray18[local149][local185][local178 + 1] - Static287.anIntArrayArrayArray18[local149][local185][local178 - 1];
						local244 = (int) Math.sqrt((double) (local231 * local231 + local209 * local209 + 65536));
						local250 = (local209 << 8) / local244;
						local298 = (local164[local185][local178] >> 1) + (local164[local185][local178 + 1] >> 3) + (local164[local185][local178 + -1] >> 2) + (local164[local185 + -1][local178] >> 2) + (local164[local185 + 1][local178] >> 3);
						local304 = (local231 << 8) / local244;
						local308 = -65536 / local244;
						local325 = (local304 * -50 + local250 * -50 + local308 * -10) / local176 + 74;
						local139[local185][local178] = local325 - local298;
					}
				}
			} else if (Static10.aBoolean12) {
				for (local170 = 1; local170 < 103; local170++) {
					for (local176 = 1; local176 < 103; local176++) {
						local185 = (local164[local176][local170 + 1] >> 3) + (local164[local176 - 1][local170] >> 2) + (local164[local176 + 1][local170] >> 3) + (local164[local176][local170 + -1] >> 2) + (local164[local176][local170] >> 1);
						local139[local176][local170] = 74 - local185;
					}
				}
			} else {
				local176 = (int) Static201.aFloatArray27[1];
				local170 = (int) Static201.aFloatArray27[0];
				local178 = (int) Static201.aFloatArray27[2];
				local185 = (int) Math.sqrt((double) (local170 * local170 + local176 * local176 + local178 * local178));
				local325 = local185 * 1024 >> 8;
				for (local209 = 1; local209 < 103; local209++) {
					for (local231 = 1; local231 < 103; local231++) {
						local308 = Static287.anIntArrayArrayArray18[local149][local231][local209 + 1] - Static287.anIntArrayArrayArray18[local149][local231][local209 - 1];
						local250 = Static287.anIntArrayArrayArray18[local149][local231 + 1][local209] - Static287.anIntArrayArrayArray18[local149][local231 - 1][local209];
						local304 = (int) Math.sqrt((double) (local250 * local250 + local308 * local308 + 65536));
						local298 = (local250 << 8) / local304;
						local539 = -65536 / local304;
						local545 = (local308 << 8) / local304;
						local244 = (local176 * local539 + local170 * local298 + local545 * local178) / local325 + 96;
						local611 = (local164[local231][local209 + 1] >> 3) + (local164[local231 - 1][local209] >> 2) + (local164[local231 - -1][local209] >> 3) + (local164[local231][local209 + -1] >> 2) + (local164[local231][local209] >> 1);
						local139[local231][local209] = local244 - (int) ((float) local611 * 1.7F);
					}
				}
			}
			for (local170 = 0; local170 < 104; local170++) {
				Static8.anIntArray447[local170] = 0;
				Static191.anIntArray382[local170] = 0;
				Static182.anIntArray446[local170] = 0;
				Static220.anIntArray498[local170] = 0;
				Static273.anIntArray585[local170] = 0;
			}
			for (local170 = -5; local170 < 104; local170++) {
				for (local176 = 0; local176 < 104; local176++) {
					local178 = local170 + 5;
					@Pc(734) int local734;
					if (local178 < 104) {
						local185 = Static27.aByteArrayArrayArray5[local149][local178][local176] & 0xFF;
						if (local185 > 0) {
							@Pc(698) Class136 local698 = Static160.method3004(local185 - 1);
							Static8.anIntArray447[local176] += local698.anInt4935;
							Static191.anIntArray382[local176] += local698.anInt4942;
							Static182.anIntArray446[local176] += local698.anInt4949;
							Static220.anIntArray498[local176] += local698.anInt4941;
							local734 = Static273.anIntArray585[local176]++;
						}
					}
					local185 = local170 - 5;
					if (local185 >= 0) {
						local325 = Static27.aByteArrayArrayArray5[local149][local185][local176] & 0xFF;
						if (local325 > 0) {
							@Pc(766) Class136 local766 = Static160.method3004(local325 - 1);
							Static8.anIntArray447[local176] -= local766.anInt4935;
							Static191.anIntArray382[local176] -= local766.anInt4942;
							Static182.anIntArray446[local176] -= local766.anInt4949;
							Static220.anIntArray498[local176] -= local766.anInt4941;
							local734 = Static273.anIntArray585[local176]--;
						}
					}
				}
				if (local170 >= 0) {
					local176 = 0;
					local325 = 0;
					local209 = 0;
					local185 = 0;
					local178 = 0;
					for (local231 = -5; local231 < 104; local231++) {
						local244 = local231 + 5;
						local250 = local231 - 5;
						if (local244 < 104) {
							local185 += Static182.anIntArray446[local244];
							local178 += Static191.anIntArray382[local244];
							local209 += Static273.anIntArray585[local244];
							local176 += Static8.anIntArray447[local244];
							local325 += Static220.anIntArray498[local244];
						}
						if (local250 >= 0) {
							local176 -= Static8.anIntArray447[local250];
							local185 -= Static182.anIntArray446[local250];
							local178 -= Static191.anIntArray382[local250];
							local325 -= Static220.anIntArray498[local250];
							local209 -= Static273.anIntArray585[local250];
						}
						if (local231 >= 0 && local209 > 0) {
							local147[local170][local231] = Static196.method3519(local178 / local209, local176 * 256 / local325, local185 / local209);
						}
					}
				}
			}
			for (local170 = 1; local170 < 103; local170++) {
				label757: for (local176 = 1; local176 < 103; local176++) {
					if (arg0 || Static40.method1450() || (Static126.aByteArrayArrayArray24[0][local170][local176] & 0x2) != 0 || (Static126.aByteArrayArrayArray24[local149][local170][local176] & 0x10) == 0 && Static45.method982(local170, local149, local176) == Static228.anInt5022) {
						if (Static90.anInt2102 > local149) {
							Static90.anInt2102 = local149;
						}
						local178 = Static27.aByteArrayArrayArray5[local149][local170][local176] & 0xFF;
						local185 = Static241.aByteArrayArrayArray46[local149][local170][local176] & 0xFF;
						if (local178 > 0 || local185 > 0) {
							local325 = Static287.anIntArrayArrayArray18[local149][local170][local176];
							local209 = Static287.anIntArrayArrayArray18[local149][local170 + 1][local176];
							local231 = Static287.anIntArrayArrayArray18[local149][local170 + 1][local176 + 1];
							local244 = Static287.anIntArrayArrayArray18[local149][local170][local176 + 1];
							if (local149 > 0) {
								@Pc(1062) boolean local1062 = true;
								if (local178 == 0 && Static117.aByteArrayArrayArray20[local149][local170][local176] != 0) {
									local1062 = false;
								}
								if (local185 > 0 && !Static50.method1056(local185 - 1).aBoolean303) {
									local1062 = false;
								}
								if (local1062 && local325 == local209 && local231 == local325 && local325 == local244) {
									Static64.anIntArrayArrayArray5[local149][local170][local176] |= 0x4;
								}
							}
							if (local178 > 0) {
								local250 = local147[local170][local176];
								local304 = local24 + (local250 & 0x7F);
								if (local304 < 0) {
									local304 = 0;
								} else if (local304 > 127) {
									local304 = 127;
								}
								local298 = local304 + (local250 & 0x380) + (local250 + local17 & 0xFC00);
								local308 = Static151.anIntArray324[Static122.method2098(96, local298)];
							} else {
								local250 = -1;
								local308 = 0;
							}
							local304 = local139[local170][local176];
							local545 = local139[local170][local176 + 1];
							local298 = local139[local170 + 1][local176];
							local539 = local139[local170 + 1][local176 + 1];
							if (local185 == 0) {
								Static32.method664(local149, local170, local176, 0, 0, -1, local325, local209, local231, local244, Static122.method2098(local304, local250), Static122.method2098(local298, local250), Static122.method2098(local539, local250), Static122.method2098(local545, local250), 0, 0, 0, 0, local308, 0);
								if (Static296.aBoolean335 && local149 > 0 && local250 != -1 && Static160.method3004(local178 - 1).aBoolean271) {
									Static124.method2122(0, 0, true, false, local170, local176, local325 - Static287.anIntArrayArrayArray18[0][local170][local176], local209 + -Static287.anIntArrayArrayArray18[0][local170 + 1][local176], local231 - Static287.anIntArrayArrayArray18[0][local170 + 1][local176 + 1], -Static287.anIntArrayArrayArray18[0][local170][local176 + 1] + local244);
								}
								if (Static296.aBoolean335 && !arg0 && Static57.anIntArrayArray10 != null && local149 == 0) {
									for (local611 = local170 - 1; local611 <= local170 + 1; local611++) {
										for (@Pc(1764) int local1764 = local176 - 1; local1764 <= local176 + 1; local1764++) {
											if ((local611 != local170 || local1764 != local176) && local611 >= 0 && local611 < 104 && local1764 >= 0 && local1764 < 104) {
												@Pc(1805) int local1805 = Static241.aByteArrayArrayArray46[local149][local611][local1764] & 0xFF;
												if (local1805 != 0) {
													@Pc(1818) Class159 local1818 = Static50.method1056(local1805 - 1);
													if (local1818.anInt5801 != -1 && Static139.method4752(Static151.anInterface2_1.method4422(local1818.anInt5801))) {
														Static57.anIntArrayArray10[local170][local176] = local1818.anInt5805 + (local1818.anInt5797 << 24);
														continue label757;
													}
												}
											}
										}
									}
								}
							} else {
								@Pc(1225) byte local1225 = Static88.aByteArrayArrayArray13[local149][local170][local176];
								local611 = Static117.aByteArrayArrayArray20[local149][local170][local176] + 1;
								@Pc(1241) Class159 local1241 = Static50.method1056(local185 - 1);
								@Pc(1280) int local1280;
								@Pc(1317) int local1317;
								@Pc(1267) int local1267;
								if (Static296.aBoolean335 && !arg0 && Static57.anIntArrayArray10 != null && local149 == 0) {
									if (local1241.anInt5801 != -1 && Static139.method4752(Static151.anInterface2_1.method4422(local1241.anInt5801))) {
										Static57.anIntArrayArray10[local170][local176] = (local1241.anInt5797 << 24) + local1241.anInt5805;
									} else {
										label723: for (local1267 = local170 - 1; local1267 <= local170 + 1; local1267++) {
											for (local1280 = local176 - 1; local1280 <= local176 + 1; local1280++) {
												if ((local170 != local1267 || local176 != local1280) && local1267 >= 0 && local1267 < 104 && local1280 >= 0 && local1280 < 104) {
													local1317 = Static241.aByteArrayArrayArray46[local149][local1267][local1280] & 0xFF;
													if (local1317 != 0) {
														@Pc(1330) Class159 local1330 = Static50.method1056(local1317 - 1);
														if (local1330.anInt5801 != -1 && Static139.method4752(Static151.anInterface2_1.method4422(local1330.anInt5801))) {
															Static57.anIntArrayArray10[local170][local176] = local1330.anInt5805 + (local1330.anInt5797 << 24);
															break label723;
														}
													}
												}
											}
										}
									}
								}
								local1267 = local1241.anInt5801;
								if (local1267 >= 0 && !Static151.anInterface2_1.method4414(local1267)) {
									local1267 = -1;
								}
								@Pc(1441) int local1441;
								@Pc(1415) int local1415;
								if (local1267 >= 0) {
									local1317 = Static151.anIntArray324[Static182.method3511(96, Static151.anInterface2_1.method4416(local1267))];
									local1280 = -1;
								} else if (local1241.anInt5803 == -1) {
									local1280 = -2;
									local1317 = 0;
								} else {
									local1280 = local1241.anInt5803;
									local1415 = (local1280 & 0x7F) + local24;
									if (local1415 < 0) {
										local1415 = 0;
									} else if (local1415 > 127) {
										local1415 = 127;
									}
									local1441 = (local17 + local1280 & 0xFC00) + (local1280 & 0x380) + local1415;
									local1317 = Static151.anIntArray324[Static182.method3511(96, local1441)];
								}
								if (local1241.anInt5807 >= 0) {
									local1415 = local1241.anInt5807;
									local1441 = local24 + (local1415 & 0x7F);
									if (local1441 < 0) {
										local1441 = 0;
									} else if (local1441 > 127) {
										local1441 = 127;
									}
									@Pc(1499) int local1499 = local1441 + (local1415 + local17 & 0xFC00) + (local1415 & 0x380);
									local1317 = Static151.anIntArray324[Static182.method3511(96, local1499)];
								}
								Static32.method664(local149, local170, local176, local611, local1225, local1267, local325, local209, local231, local244, Static122.method2098(local304, local250), Static122.method2098(local298, local250), Static122.method2098(local539, local250), Static122.method2098(local545, local250), Static182.method3511(local304, local1280), Static182.method3511(local298, local1280), Static182.method3511(local539, local1280), Static182.method3511(local545, local1280), local308, local1317);
								if (Static296.aBoolean335 && local149 > 0) {
									Static124.method2122(local611, local1225, local1280 == -2 || !local1241.aBoolean304, local250 == -1 || !Static160.method3004(local178 - 1).aBoolean271, local170, local176, local325 - Static287.anIntArrayArrayArray18[0][local170][local176], -Static287.anIntArrayArrayArray18[0][local170 + 1][local176] + local209, local231 - Static287.anIntArrayArrayArray18[0][local170 + 1][local176 + 1], -Static287.anIntArrayArrayArray18[0][local170][local176 + 1] + local244);
								}
							}
						}
					}
				}
			}
			if (Static296.aBoolean335) {
				@Pc(1864) float[][] local1864 = new float[105][105];
				@Pc(1868) float[][] local1868 = new float[105][105];
				@Pc(1872) int[][] local1872 = Static287.anIntArrayArrayArray18[local149];
				@Pc(1876) float[][] local1876 = new float[105][105];
				local325 = 1;
				while (true) {
					if (local325 > 103) {
						@Pc(2000) Class1_Sub20[] local2000;
						if (arg0) {
							local2000 = Static285.method4692(local147, Static27.aByteArrayArrayArray5[local149], local1868, Static241.aByteArrayArrayArray46[local149], local1876, local1864, Static113.anIntArrayArrayArray10[0], Static117.aByteArrayArrayArray20[local149], Static88.aByteArrayArrayArray13[local149], Static57.anIntArrayArray10, local139, Static287.anIntArrayArrayArray18[local149], Static126.aByteArrayArrayArray24, arg1, local149);
							Static112.method1808(local149, local2000);
							break;
						}
						local2000 = Static285.method4692(local147, Static27.aByteArrayArrayArray5[local149], local1868, Static241.aByteArrayArrayArray46[local149], local1876, local1864, null, Static117.aByteArrayArrayArray20[local149], Static88.aByteArrayArrayArray13[local149], null, local139, Static287.anIntArrayArrayArray18[local149], Static126.aByteArrayArrayArray24, arg1, local149);
						@Pc(2058) Class1_Sub20[] local2058 = Static37.method856(Static88.aByteArrayArrayArray13[local149], Static117.aByteArrayArrayArray20[local149], local149, Static27.aByteArrayArrayArray5[local149], local1864, local1868, local1876, Static241.aByteArrayArrayArray46[local149], Static126.aByteArrayArrayArray24, Static287.anIntArrayArrayArray18[local149], local139);
						@Pc(2065) Class1_Sub20[] local2065 = new Class1_Sub20[local2058.length + local2000.length];
						for (local244 = 0; local244 < local2000.length; local244++) {
							local2065[local244] = local2000[local244];
						}
						for (local244 = 0; local244 < local2058.length; local244++) {
							local2065[local2000.length + local244] = local2058[local244];
						}
						Static112.method1808(local149, local2065);
						Static10.method221(Static287.anIntArrayArrayArray18[local149], Static67.anInt1749, Static241.aByteArrayArrayArray46[local149], local149, Static88.aByteArrayArrayArray13[local149], Static67.aClass103Array1, Static117.aByteArrayArrayArray20[local149], Static27.aByteArrayArrayArray5[local149], local1864, local1876, local1868);
						break;
					}
					for (local209 = 1; local209 <= 103; local209++) {
						local231 = local1872[local209 + 1][local325] - local1872[local209 - 1][local325];
						local244 = local1872[local209][local325 + 1] - local1872[local209][local325 - 1];
						@Pc(1936) float local1936 = (float) Math.sqrt((double) (local244 * local244 + local231 * local231 + 65536));
						local1864[local209][local325] = (float) local231 / local1936;
						local1876[local209][local325] = -256.0F / local1936;
						local1868[local209][local325] = (float) local244 / local1936;
					}
					local325++;
				}
			}
			Static27.aByteArrayArrayArray5[local149] = null;
			Static241.aByteArrayArrayArray46[local149] = null;
			Static117.aByteArrayArrayArray20[local149] = null;
			Static88.aByteArrayArrayArray13[local149] = null;
			Static271.aByteArrayArrayArray52[local149] = null;
		}
		Static33.method689();
		if (arg0) {
			return;
		}
		@Pc(2168) int local2168;
		for (local149 = 0; local149 < 104; local149++) {
			for (local2168 = 0; local2168 < 104; local2168++) {
				if ((Static126.aByteArrayArrayArray24[1][local149][local2168] & 0x2) == 2) {
					Static9.method212(local149, local2168);
				}
			}
		}
		for (local149 = 0; local149 < 4; local149++) {
			for (local2168 = 0; local2168 <= 104; local2168++) {
				for (@Pc(2204) int local2204 = 0; local2204 <= 104; local2204++) {
					if ((Static64.anIntArrayArrayArray5[local149][local2204][local2168] & 0x1) != 0) {
						for (local170 = local2168; local170 > 0 && (Static64.anIntArrayArrayArray5[local149][local2204][local170 - 1] & 0x1) != 0; local170--) {
						}
						local176 = local2168;
						local178 = local149;
						while (local176 < 104 && (Static64.anIntArrayArrayArray5[local149][local2204][local176 + 1] & 0x1) != 0) {
							local176++;
						}
						label442: while (local178 > 0) {
							for (local325 = local170; local325 <= local176; local325++) {
								if ((Static64.anIntArrayArrayArray5[local178 - 1][local2204][local325] & 0x1) == 0) {
									break label442;
								}
							}
							local178--;
						}
						label430: for (local185 = local149; local185 < 3; local185++) {
							for (local325 = local170; local325 <= local176; local325++) {
								if ((Static64.anIntArrayArrayArray5[local185 + 1][local2204][local325] & 0x1) == 0) {
									break label430;
								}
							}
						}
						local325 = (local185 + 1 - local178) * (-local170 + 1 + local176);
						if (local325 >= 8) {
							local231 = Static287.anIntArrayArrayArray18[local185][local2204][local170] - 240;
							local244 = Static287.anIntArrayArrayArray18[local178][local2204][local170];
							Static269.method4533(1, local2204 * 128, local2204 * 128, local170 * 128, local176 * 128 + 128, local231, local244);
							for (local250 = local178; local250 <= local185; local250++) {
								for (local308 = local170; local308 <= local176; local308++) {
									Static64.anIntArrayArrayArray5[local250][local2204][local308] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((Static64.anIntArrayArrayArray5[local149][local2204][local2168] & 0x2) != 0) {
						local170 = local2204;
						local185 = local149;
						local176 = local2204;
						local178 = local149;
						while (local170 > 0 && (Static64.anIntArrayArrayArray5[local149][local170 - 1][local2168] & 0x2) != 0) {
							local170--;
						}
						while (local176 < 104 && (Static64.anIntArrayArrayArray5[local149][local176 + 1][local2168] & 0x2) != 0) {
							local176++;
						}
						label496: while (local178 > 0) {
							for (local325 = local170; local325 <= local176; local325++) {
								if ((Static64.anIntArrayArrayArray5[local178 - 1][local325][local2168] & 0x2) == 0) {
									break label496;
								}
							}
							local178--;
						}
						label485: while (local185 < 3) {
							for (local325 = local170; local325 <= local176; local325++) {
								if ((Static64.anIntArrayArrayArray5[local185 + 1][local325][local2168] & 0x2) == 0) {
									break label485;
								}
							}
							local185++;
						}
						local325 = (local185 + 1 - local178) * (-local170 + local176 + 1);
						if (local325 >= 8) {
							local244 = Static287.anIntArrayArrayArray18[local178][local170][local2168];
							local231 = Static287.anIntArrayArrayArray18[local185][local170][local2168] - 240;
							Static269.method4533(2, local170 * 128, local176 * 128 + 128, local2168 * 128, local2168 * 128, local231, local244);
							for (local250 = local178; local250 <= local185; local250++) {
								for (local308 = local170; local308 <= local176; local308++) {
									Static64.anIntArrayArrayArray5[local250][local308][local2168] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((Static64.anIntArrayArrayArray5[local149][local2204][local2168] & 0x4) != 0) {
						local170 = local2204;
						local176 = local2204;
						local178 = local2168;
						local185 = local2168;
						while (local178 > 0 && (Static64.anIntArrayArrayArray5[local149][local2204][local178 - 1] & 0x4) != 0) {
							local178--;
						}
						while (local185 < 104 && (Static64.anIntArrayArrayArray5[local149][local2204][local185 + 1] & 0x4) != 0) {
							local185++;
						}
						label549: while (local170 > 0) {
							for (local325 = local178; local325 <= local185; local325++) {
								if ((Static64.anIntArrayArrayArray5[local149][local170 - 1][local325] & 0x4) == 0) {
									break label549;
								}
							}
							local170--;
						}
						label538: while (local176 < 104) {
							for (local325 = local178; local325 <= local185; local325++) {
								if ((Static64.anIntArrayArrayArray5[local149][local176 + 1][local325] & 0x4) == 0) {
									break label538;
								}
							}
							local176++;
						}
						if ((local176 + 1 - local170) * ((local185 - local178) + 1) >= 4) {
							local325 = Static287.anIntArrayArrayArray18[local149][local170][local178];
							Static269.method4533(4, local170 * 128, local176 * 128 + 128, local178 * 128, local185 * 128 + 128, local325, local325);
							for (local209 = local170; local209 <= local176; local209++) {
								for (local231 = local178; local231 <= local185; local231++) {
									Static64.anIntArrayArrayArray5[local149][local209][local231] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZJ)V")
	public static void method2275(@OriginalArg(1) long arg0) {
		if (arg0 != 0L) {
			Static81.aClass1_Sub16_Sub1_1.method2676(45);
			Static81.aClass1_Sub16_Sub1_1.method2631(arg0);
		}
	}
}
