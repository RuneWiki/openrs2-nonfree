import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
	public static int anInt3538;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "Z")
	public static boolean aBoolean155 = false;

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
	public static int anInt3533 = 1;

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "Lclient!qe;")
	public static Class78 aClass78_642 = Static199.method3560("<col=ffff00>");

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "([Lclient!tb;ZI)V")
	public static void method2743(@OriginalArg(0) Class90[] arg0) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		for (local17 = 0; local17 < 4; local17++) {
			for (local21 = 0; local21 < 104; local21++) {
				for (@Pc(25) int local25 = 0; local25 < 104; local25++) {
					if ((Static133.aByteArrayArrayArray10[local17][local21][local25] & 0x1) == 1) {
						@Pc(40) int local40 = local17;
						if ((Static133.aByteArrayArrayArray10[1][local21][local25] & 0x2) == 2) {
							local40 = local17 - 1;
						}
						if (local40 >= 0) {
							arg0[local40].method3517(local21, local25);
						}
					}
				}
			}
		}
		Static40.anInt747 += (int) (Math.random() * 5.0D) - 2;
		if (Static40.anInt747 < -16) {
			Static40.anInt747 = -16;
		}
		Static179.anInt4185 += (int) (Math.random() * 5.0D) - 2;
		if (Static179.anInt4185 < -8) {
			Static179.anInt4185 = -8;
		}
		if (Static179.anInt4185 > 8) {
			Static179.anInt4185 = 8;
		}
		if (Static40.anInt747 > 16) {
			Static40.anInt747 = 16;
		}
		local17 = Static179.anInt4185 >> 2 << 10;
		local21 = Static40.anInt747 >> 1;
		@Pc(140) int[][] local140 = new int[104][104];
		@Pc(144) int[][] local144 = new int[104][104];
		@Pc(156) int local156;
		@Pc(162) int local162;
		@Pc(164) int local164;
		@Pc(168) int local168;
		@Pc(259) int local259;
		@Pc(192) int local192;
		@Pc(213) int local213;
		@Pc(226) int local226;
		@Pc(232) int local232;
		@Pc(242) int local242;
		@Pc(238) int local238;
		@Pc(307) int local307;
		@Pc(523) int local523;
		@Pc(560) int local560;
		@Pc(813) int local813;
		@Pc(829) int local829;
		@Pc(852) int local852;
		for (@Pc(146) int local146 = 0; local146 < 4; local146++) {
			@Pc(152) byte[][] local152 = Static220.aByteArrayArrayArray15[local146];
			local156 = (int) Math.sqrt(5100.0D);
			local162 = local156 * 768 >> 8;
			for (local164 = 1; local164 < 103; local164++) {
				for (local168 = 1; local168 < 103; local168++) {
					local192 = Static144.anIntArrayArrayArray7[local146][local168 + 1][local164] - Static144.anIntArrayArrayArray7[local146][local168 - 1][local164];
					local213 = Static144.anIntArrayArrayArray7[local146][local168][local164 + 1] - Static144.anIntArrayArrayArray7[local146][local168][local164 - 1];
					local226 = (int) Math.sqrt((double) (local192 * local192 + local213 * local213 + 65536));
					local232 = (local192 << 8) / local226;
					local238 = (local213 << 8) / local226;
					local242 = -65536 / local226;
					local259 = (local232 * -50 + local242 * -10 + local238 * -50) / local162 + 74;
					local307 = (local152[local168][local164] >> 1) + (local152[local168][local164 - 1] >> 2) + (local152[local168 - -1][local164] >> 3) + (local152[local168 + -1][local164] >> 2) + (local152[local168][local164 + 1] >> 3);
					local140[local168][local164] = local259 - local307;
				}
			}
			for (local168 = 0; local168 < 104; local168++) {
				Static193.anIntArray712[local168] = 0;
				Static9.anIntArray33[local168] = 0;
				Static226.anIntArray794[local168] = 0;
				Static169.anIntArray647[local168] = 0;
				Static55.anIntArray154[local168] = 0;
			}
			for (local259 = -5; local259 < 104; local259++) {
				for (local192 = 0; local192 < 104; local192++) {
					local213 = local259 + 5;
					@Pc(428) int local428;
					if (local213 < 104) {
						local226 = Static128.aByteArrayArrayArray8[local146][local213][local192] & 0xFF;
						if (local226 > 0) {
							@Pc(392) Class2_Sub3_Sub12 local392 = Static134.method2446(local226 - 1);
							Static193.anIntArray712[local192] += local392.anInt1626;
							Static9.anIntArray33[local192] += local392.anInt1628;
							Static226.anIntArray794[local192] += local392.anInt1616;
							Static169.anIntArray647[local192] += local392.anInt1619;
							local428 = Static55.anIntArray154[local192]++;
						}
					}
					local226 = local259 - 5;
					if (local226 >= 0) {
						local232 = Static128.aByteArrayArrayArray8[local146][local226][local192] & 0xFF;
						if (local232 > 0) {
							@Pc(458) Class2_Sub3_Sub12 local458 = Static134.method2446(local232 - 1);
							Static193.anIntArray712[local192] -= local458.anInt1626;
							Static9.anIntArray33[local192] -= local458.anInt1628;
							Static226.anIntArray794[local192] -= local458.anInt1616;
							Static169.anIntArray647[local192] -= local458.anInt1619;
							local428 = Static55.anIntArray154[local192]--;
						}
					}
				}
				if (local259 >= 0) {
					local213 = 0;
					local226 = 0;
					local232 = 0;
					local242 = 0;
					local238 = 0;
					for (local307 = -5; local307 < 104; local307++) {
						local523 = local307 + 5;
						if (local523 < 104) {
							local232 += Static226.anIntArray794[local523];
							local238 += Static55.anIntArray154[local523];
							local242 += Static169.anIntArray647[local523];
							local226 += Static9.anIntArray33[local523];
							local213 += Static193.anIntArray712[local523];
						}
						local560 = local307 - 5;
						if (local560 >= 0) {
							local213 -= Static193.anIntArray712[local560];
							local232 -= Static226.anIntArray794[local560];
							local226 -= Static9.anIntArray33[local560];
							local238 -= Static55.anIntArray154[local560];
							local242 -= Static169.anIntArray647[local560];
						}
						if (local307 >= 0 && local238 > 0) {
							local144[local259][local307] = Static152.method2738(local226 / local238, local232 / local238, local213 * 256 / local242);
						}
					}
				}
			}
			for (local192 = 1; local192 < 103; local192++) {
				for (local213 = 1; local213 < 103; local213++) {
					if (Static48.method633() || (Static133.aByteArrayArrayArray10[0][local192][local213] & 0x2) != 0 || (Static133.aByteArrayArrayArray10[local146][local192][local213] & 0x10) == 0 && Static220.method3826(local213, local146, local192) == Static150.anInt3435) {
						if (Static145.anInt3289 > local146) {
							Static145.anInt3289 = local146;
						}
						local232 = Static170.aByteArrayArrayArray13[local146][local192][local213] & 0xFF;
						local226 = Static128.aByteArrayArrayArray8[local146][local192][local213] & 0xFF;
						if (local226 > 0 || local232 > 0) {
							local242 = Static144.anIntArrayArrayArray7[local146][local192][local213];
							local238 = Static144.anIntArrayArrayArray7[local146][local192 + 1][local213];
							local307 = Static144.anIntArrayArrayArray7[local146][local192 + 1][local213 + 1];
							local523 = Static144.anIntArrayArrayArray7[local146][local192][local213 + 1];
							if (local146 > 0) {
								@Pc(756) boolean local756 = true;
								if (local226 == 0 && Static12.aByteArrayArrayArray1[local146][local192][local213] != 0) {
									local756 = false;
								}
								if (local232 > 0 && !Static51.method669(local232 - 1).aBoolean144) {
									local756 = false;
								}
								if (local756 && local242 == local238 && local307 == local242 && local523 == local242) {
									Static224.anIntArrayArrayArray14[local146][local192][local213] |= 0x924;
								}
							}
							if (local226 <= 0) {
								local813 = 0;
								local560 = -1;
							} else {
								local560 = local144[local192][local213];
								local829 = local21 + (local560 & 0x7F);
								if (local829 < 0) {
									local829 = 0;
								} else if (local829 > 127) {
									local829 = 127;
								}
								local852 = (local560 & 0x380) + (local17 + local560 & 0xFC00) + local829;
								local813 = Static163.anIntArray630[Static5.method97(96, local852)];
							}
							local829 = local140[local192][local213];
							@Pc(875) int local875 = local140[local192 + 1][local213 + 1];
							@Pc(883) int local883 = local140[local192][local213 + 1];
							local852 = local140[local192 + 1][local213];
							if (local232 == 0) {
								Static12.method228(local146, local192, local213, 0, 0, -1, local242, local238, local307, local523, Static5.method97(local829, local560), Static5.method97(local852, local560), Static5.method97(local875, local560), Static5.method97(local883, local560), 0, 0, 0, 0, local813, 0);
							} else {
								@Pc(941) int local941 = Static12.aByteArrayArrayArray1[local146][local192][local213] + 1;
								@Pc(949) byte local949 = Static126.aByteArrayArrayArray7[local146][local192][local213];
								@Pc(955) Class2_Sub3_Sub21 local955 = Static51.method669(local232 - 1);
								@Pc(958) int local958 = local955.anInt3251;
								if (local958 >= 0 && !Static163.anInterface4_1.method762(local958)) {
									local958 = -1;
								}
								@Pc(985) int local985;
								@Pc(983) int local983;
								@Pc(997) int local997;
								@Pc(1026) int local1026;
								if (local958 >= 0) {
									local983 = Static163.anIntArray630[Static77.method1312(96, Static163.anInterface4_1.method759(local958))];
									local985 = -1;
								} else if (local955.anInt3253 == -1) {
									local983 = 0;
									local985 = -2;
								} else {
									local985 = local955.anInt3253;
									local997 = (local985 & 0x7F) + local21;
									if (local997 < 0) {
										local997 = 0;
									} else if (local997 > 127) {
										local997 = 127;
									}
									local1026 = local997 + (local17 + local985 & 0xFC00) + (local985 & 0x380);
									local983 = Static163.anIntArray630[Static77.method1312(96, local1026)];
								}
								if (local955.anInt3252 >= 0) {
									local997 = local955.anInt3252;
									local1026 = local21 + (local997 & 0x7F);
									if (local1026 < 0) {
										local1026 = 0;
									} else if (local1026 > 127) {
										local1026 = 127;
									}
									@Pc(1087) int local1087 = local1026 + (local997 + local17 & 0xFC00) + (local997 & 0x380);
									local983 = Static163.anIntArray630[Static77.method1312(96, local1087)];
								}
								Static12.method228(local146, local192, local213, local941, local949, local958, local242, local238, local307, local523, Static5.method97(local829, local560), Static5.method97(local852, local560), Static5.method97(local875, local560), Static5.method97(local883, local560), Static77.method1312(local829, local985), Static77.method1312(local852, local985), Static77.method1312(local875, local985), Static77.method1312(local883, local985), local813, local983);
							}
						}
					}
				}
			}
			for (local213 = 1; local213 < 103; local213++) {
				for (local226 = 1; local226 < 103; local226++) {
					if ((Static133.aByteArrayArrayArray10[0][local226][local213] & 0x2) == 0) {
						Static41.method570(local146, local226, local213, Static220.method3826(local213, local146, local226));
					} else {
						Static41.method570(local146, local226, local213, 0);
					}
				}
			}
			Static128.aByteArrayArrayArray8[local146] = null;
			Static170.aByteArrayArrayArray13[local146] = null;
			Static12.aByteArrayArrayArray1[local146] = null;
			Static126.aByteArrayArrayArray7[local146] = null;
			Static220.aByteArrayArrayArray15[local146] = null;
		}
		Static178.method3271();
		for (@Pc(1232) int local1232 = 0; local1232 < 104; local1232++) {
			for (local156 = 0; local156 < 104; local156++) {
				if ((Static133.aByteArrayArrayArray10[1][local1232][local156] & 0x2) == 2) {
					Static116.method2146(local1232, local156);
				}
			}
		}
		local156 = 1;
		local164 = 4;
		local162 = 2;
		for (local168 = 0; local168 < 4; local168++) {
			if (local168 > 0) {
				local156 <<= 0x3;
				local164 <<= 0x3;
				local162 <<= 0x3;
			}
			for (local259 = 0; local259 <= local168; local259++) {
				for (local192 = 0; local192 <= 104; local192++) {
					for (local213 = 0; local213 <= 104; local213++) {
						if ((Static224.anIntArrayArrayArray14[local259][local213][local192] & local156) != 0) {
							for (local226 = local192; local226 > 0 && (local156 & Static224.anIntArrayArrayArray14[local259][local213][local226 - 1]) != 0; local226--) {
							}
							for (local232 = local192; local232 < 104 && (local156 & Static224.anIntArrayArrayArray14[local259][local213][local232 + 1]) != 0; local232++) {
							}
							local242 = local259;
							local238 = local259;
							label355: while (local242 > 0) {
								for (local307 = local226; local307 <= local232; local307++) {
									if ((Static224.anIntArrayArrayArray14[local242 - 1][local213][local307] & local156) == 0) {
										break label355;
									}
								}
								local242--;
							}
							label344: while (local238 < local168) {
								for (local307 = local226; local307 <= local232; local307++) {
									if ((local156 & Static224.anIntArrayArrayArray14[local238 + 1][local213][local307]) == 0) {
										break label344;
									}
								}
								local238++;
							}
							local307 = (local238 + 1 - local242) * (local232 + 1 - local226);
							if (local307 >= 8) {
								local560 = Static144.anIntArrayArrayArray7[local238][local213][local226] - 240;
								local813 = Static144.anIntArrayArrayArray7[local242][local213][local226];
								Static90.method1590(local168, 1, local213 * 128, local213 * 128, local226 * 128, local232 * 128 + 128, local560, local813);
								for (local829 = local242; local829 <= local238; local829++) {
									for (local852 = local226; local852 <= local232; local852++) {
										Static224.anIntArrayArrayArray14[local829][local213][local852] &= ~local156;
									}
								}
							}
						}
						if ((Static224.anIntArrayArrayArray14[local259][local213][local192] & local162) != 0) {
							for (local226 = local213; local226 > 0 && (Static224.anIntArrayArrayArray14[local259][local226 - 1][local192] & local162) != 0; local226--) {
							}
							for (local232 = local213; local232 < 104 && (Static224.anIntArrayArrayArray14[local259][local232 + 1][local192] & local162) != 0; local232++) {
							}
							local242 = local259;
							local238 = local259;
							label410: while (local242 > 0) {
								for (local307 = local226; local307 <= local232; local307++) {
									if ((local162 & Static224.anIntArrayArrayArray14[local242 - 1][local307][local192]) == 0) {
										break label410;
									}
								}
								local242--;
							}
							label399: while (local238 < local168) {
								for (local307 = local226; local307 <= local232; local307++) {
									if ((local162 & Static224.anIntArrayArrayArray14[local238 + 1][local307][local192]) == 0) {
										break label399;
									}
								}
								local238++;
							}
							local307 = (local238 + 1 - local242) * (local232 + 1 - local226);
							if (local307 >= 8) {
								local560 = Static144.anIntArrayArrayArray7[local238][local226][local192] - 240;
								local813 = Static144.anIntArrayArrayArray7[local242][local226][local192];
								Static90.method1590(local168, 2, local226 * 128, local232 * 128 + 128, local192 * 128, local192 * 128, local560, local813);
								for (local829 = local242; local829 <= local238; local829++) {
									for (local852 = local226; local852 <= local232; local852++) {
										Static224.anIntArrayArrayArray14[local829][local852][local192] &= ~local162;
									}
								}
							}
						}
						if ((local164 & Static224.anIntArrayArrayArray14[local259][local213][local192]) != 0) {
							local226 = local213;
							for (local242 = local192; local242 > 0 && (Static224.anIntArrayArrayArray14[local259][local213][local242 - 1] & local164) != 0; local242--) {
							}
							local232 = local213;
							for (local238 = local192; local238 < 104 && (local164 & Static224.anIntArrayArrayArray14[local259][local213][local238 + 1]) != 0; local238++) {
							}
							label465: while (local226 > 0) {
								for (local307 = local242; local307 <= local238; local307++) {
									if ((local164 & Static224.anIntArrayArrayArray14[local259][local226 - 1][local307]) == 0) {
										break label465;
									}
								}
								local226--;
							}
							label454: while (local232 < 104) {
								for (local307 = local242; local307 <= local238; local307++) {
									if ((local164 & Static224.anIntArrayArrayArray14[local259][local232 + 1][local307]) == 0) {
										break label454;
									}
								}
								local232++;
							}
							if ((local232 + 1 - local226) * (-local242 + local238 + 1) >= 4) {
								local307 = Static144.anIntArrayArrayArray7[local259][local226][local242];
								Static90.method1590(local168, 4, local226 * 128, local232 * 128 + 128, local242 * 128, local238 * 128 + 128, local307, local307);
								for (local523 = local226; local523 <= local232; local523++) {
									for (local560 = local242; local560 <= local238; local560++) {
										Static224.anIntArrayArrayArray14[local259][local523][local560] &= ~local164;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIII)V")
	public static void method2746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg4 - arg2;
		@Pc(13) int local13 = arg0 - arg3;
		if (local8 == 0) {
			if (local13 != 0) {
				Static14.method2693(arg2, arg1, arg3, arg0);
			}
		} else if (local13 == 0) {
			Static168.method3775(arg1, arg3, arg4, arg2);
		} else {
			@Pc(39) int local39 = (local13 << 12) / local8;
			@Pc(48) int local48 = arg3 - (local39 * arg2 >> 12);
			@Pc(53) int local53;
			@Pc(62) int local62;
			if (Static6.anInt187 > arg2) {
				local53 = Static6.anInt187;
				local62 = local48 + (Static6.anInt187 * local39 >> 12);
			} else if (Static101.anInt2213 >= arg2) {
				local62 = arg3;
				local53 = arg2;
			} else {
				local62 = (local39 * Static101.anInt2213 >> 12) + local48;
				local53 = Static101.anInt2213;
			}
			if (Static73.anInt1576 > local62) {
				local62 = Static73.anInt1576;
				local53 = (Static73.anInt1576 - local48 << 12) / local39;
			} else if (Static137.anInt3137 < local62) {
				local53 = (Static137.anInt3137 - local48 << 12) / local39;
				local62 = Static137.anInt3137;
			}
			@Pc(122) int local122;
			@Pc(130) int local130;
			if (arg4 < Static6.anInt187) {
				local122 = Static6.anInt187;
				local130 = (local39 * Static6.anInt187 >> 12) + local48;
			} else if (arg4 > Static101.anInt2213) {
				local122 = Static101.anInt2213;
				local130 = (Static101.anInt2213 * local39 >> 12) + local48;
			} else {
				local130 = arg0;
				local122 = arg4;
			}
			if (local130 < Static73.anInt1576) {
				local130 = Static73.anInt1576;
				local122 = (Static73.anInt1576 - local48 << 12) / local39;
			} else if (local130 > Static137.anInt3137) {
				local122 = (Static137.anInt3137 - local48 << 12) / local39;
				local130 = Static137.anInt3137;
			}
			Static205.method544(local53, local62, arg1, local130, local122);
		}
	}
}
