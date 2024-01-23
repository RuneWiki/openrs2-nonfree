import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "Z")
	public static boolean aBoolean168;

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
	public static int anInt2438 = 0;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BILjava/lang/String;Ljava/lang/String;)V")
	public static void method1924(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		Static221.method3478(arg1, arg2, -1, null, arg0);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method1926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static90.anInt2026 = 0;
		@Pc(13) int local13;
		@Pc(635) int local635;
		@Pc(82) int local82;
		@Pc(273) int local273;
		@Pc(315) int local315;
		@Pc(358) int local358;
		@Pc(632) int local632;
		for (local13 = -1; local13 < Static233.anInt4582 + Static278.anInt5374; local13++) {
			@Pc(23) Class14_Sub2 local23;
			if (local13 == -1) {
				local23 = Static197.aClass14_Sub2_Sub1_2;
			} else if (Static278.anInt5374 <= local13) {
				local23 = Static254.aClass14_Sub2_Sub2Array1[Static281.anIntArray464[local13 - Static278.anInt5374]];
			} else {
				local23 = Static98.aClass14_Sub2_Sub1Array1[Static17.anIntArray444[local13]];
			}
			if (local23 != null && local23.method3647()) {
				@Pc(59) Class46 local59;
				if (local23 instanceof Class14_Sub2_Sub2) {
					local59 = ((Class14_Sub2_Sub2) local23).aClass46_1;
					if (local59.anIntArray148 != null) {
						local59 = local59.method1283();
					}
					if (local59 == null) {
						continue;
					}
				}
				@Pc(167) int local167;
				if (local13 >= Static278.anInt5374) {
					local59 = ((Class14_Sub2_Sub2) local23).aClass46_1;
					if (local59.anIntArray148 != null) {
						local59 = local59.method1283();
					}
					if (local59.anInt1533 >= 0 && Static232.aClass1_Sub2_Sub11Array9.length > local59.anInt1533) {
						if (local59.anInt1557 == -1) {
							local273 = local23.method3643() + 15;
						} else {
							local273 = local59.anInt1557 + 15;
						}
						Static282.method4246(arg2 >> 1, arg3, arg1 >> 1, arg5, local273, local23);
						if (Static171.anInt3648 > -1) {
							Static232.aClass1_Sub2_Sub11Array9[local59.anInt1533].method3781(Static171.anInt3648 + arg4 - 12, Static176.anInt3730 + arg0 + -30);
						}
					}
					@Pc(313) Class80[] local313 = Static198.aClass80Array2;
					for (local315 = 0; local315 < local313.length; local315++) {
						@Pc(323) Class80 local323 = local313[local315];
						if (local323 != null && local323.anInt2843 == 1 && local323.anInt2839 == Static281.anIntArray464[local13 - Static278.anInt5374] && Static237.anInt4710 % 20 < 10) {
							if (local59.anInt1557 == -1) {
								local358 = local23.method3643() + 15;
							} else {
								local358 = local59.anInt1557 + 15;
							}
							Static282.method4246(arg2 >> 1, arg3, arg1 >> 1, arg5, local358, local23);
							if (Static171.anInt3648 > -1) {
								Static135.aClass1_Sub2_Sub11Array3[local323.anInt2848].method3781(arg4 + Static171.anInt3648 - 12, Static176.anInt3730 + arg0 - 28);
							}
						}
					}
				} else {
					local82 = 30;
					@Pc(85) Class14_Sub2_Sub1 local85 = (Class14_Sub2_Sub1) local23;
					if (local85.anInt1715 != -1 || local85.anInt1732 != -1) {
						Static282.method4246(arg2 >> 1, arg3, arg1 >> 1, arg5, local23.method3643() + 15, local23);
						if (Static171.anInt3648 > -1) {
							if (local85.anInt1715 != -1) {
								Static248.aClass1_Sub2_Sub11Array10[local85.anInt1715].method3781(arg4 + Static171.anInt3648 - 12, arg0 + -30 + Static176.anInt3730);
								local82 += 25;
							}
							if (local85.anInt1732 != -1) {
								Static232.aClass1_Sub2_Sub11Array9[local85.anInt1732].method3781(arg4 + Static171.anInt3648 - 12, arg0 + (Static176.anInt3730 - local82));
								local82 += 25;
							}
						}
					}
					if (local13 >= 0) {
						local167 = 0;
						@Pc(169) Class80[] local169 = Static198.aClass80Array2;
						while (local169.length > local167) {
							@Pc(181) Class80 local181 = local169[local167];
							if (local181 != null && local181.anInt2843 == 10 && Static17.anIntArray444[local13] == local181.anInt2839) {
								Static282.method4246(arg2 >> 1, arg3, arg1 >> 1, arg5, local23.method3643() + 15, local23);
								if (Static171.anInt3648 > -1) {
									Static135.aClass1_Sub2_Sub11Array3[local181.anInt2848].method3781(Static171.anInt3648 + arg4 - 12, -local82 + Static176.anInt3730 + arg0);
								}
							}
							local167++;
						}
					}
				}
				if (local23.aString272 != null && (local13 >= Static278.anInt5374 || Static190.anInt3915 == 0 || Static190.anInt3915 == 3 || Static190.anInt3915 == 1 && Static185.method3085(((Class14_Sub2_Sub1) local23).aString99))) {
					Static282.method4246(arg2 >> 1, arg3, arg1 >> 1, arg5, local23.method3643(), local23);
					if (Static171.anInt3648 > -1 && Static90.anInt2026 < Static22.anInt460) {
						Static22.anIntArray53[Static90.anInt2026] = Static134.aClass1_Sub2_Sub1_3.method451(local23.aString272) / 2;
						Static22.anIntArray49[Static90.anInt2026] = Static134.aClass1_Sub2_Sub1_3.anInt486;
						Static22.anIntArray55[Static90.anInt2026] = Static171.anInt3648;
						Static22.anIntArray52[Static90.anInt2026] = Static176.anInt3730;
						Static22.anIntArray54[Static90.anInt2026] = local23.anInt4696;
						Static22.anIntArray50[Static90.anInt2026] = local23.anInt4698;
						Static22.anIntArray51[Static90.anInt2026] = local23.anInt4628;
						Static22.aStringArray9[Static90.anInt2026] = local23.aString272;
						Static90.anInt2026++;
					}
				}
				if (Static237.anInt4710 < local23.anInt4650) {
					@Pc(502) Class1_Sub2_Sub11 local502 = Static284.aClass1_Sub2_Sub11Array12[0];
					@Pc(506) Class1_Sub2_Sub11 local506 = Static284.aClass1_Sub2_Sub11Array12[1];
					if (local23 instanceof Class14_Sub2_Sub2) {
						@Pc(512) Class14_Sub2_Sub2 local512 = (Class14_Sub2_Sub2) local23;
						@Pc(522) Class1_Sub2_Sub11[] local522 = (Class1_Sub2_Sub11[]) Static97.aClass135_9.method3316((long) local512.aClass46_1.anInt1555);
						if (local522 == null) {
							local522 = Static200.method3247(Static134.aClass91_110, local512.aClass46_1.anInt1555);
							if (local522 != null) {
								Static97.aClass135_9.method3321((long) local512.aClass46_1.anInt1555, local522);
							}
						}
						@Pc(546) Class46 local546 = local512.aClass46_1;
						if (local522 != null && local522.length == 2) {
							local506 = local522[1];
							local502 = local522[0];
						}
						if (local546.anInt1557 == -1) {
							local315 = local23.method3643();
						} else {
							local315 = local546.anInt1557;
						}
					} else {
						local315 = local23.method3643();
					}
					Static282.method4246(arg2 >> 1, arg3, arg1 >> 1, arg5, local315 + local502.anInt4869 + 10, local23);
					if (Static171.anInt3648 > -1) {
						local167 = arg4 + Static171.anInt3648 - (local502.anInt4874 >> 1);
						local358 = arg0 + Static176.anInt3730 - 3;
						local502.method3781(local167, local358);
						local632 = local23.anInt4613 * local502.anInt4874 / 255;
						local635 = local502.anInt4869;
						if (Static277.aBoolean412) {
							Static41.method836(local167, local358, local632 + local167, local635 + local358);
						} else {
							Static50.method947(local167, local358, local167 + local632, local358 + local635);
						}
						local506.method3781(local167, local358);
						if (Static277.aBoolean412) {
							Static41.method847(arg4, arg0, arg4 + arg1, arg2 + arg0);
						} else {
							Static50.method950(arg4, arg0, arg1 + arg4, arg2 + arg0);
						}
					}
				}
				for (local82 = 0; local82 < 4; local82++) {
					if (Static237.anInt4710 < local23.anIntArray417[local82]) {
						if (local23 instanceof Class14_Sub2_Sub2) {
							@Pc(711) Class14_Sub2_Sub2 local711 = (Class14_Sub2_Sub2) local23;
							@Pc(714) Class46 local714 = local711.aClass46_1;
							if (local714.anInt1557 == -1) {
								local273 = local23.method3643() / 2;
							} else {
								local273 = local714.anInt1557 / 2;
							}
						} else {
							local273 = local23.method3643() / 2;
						}
						Static282.method4246(arg2 >> 1, arg3, arg1 >> 1, arg5, local273, local23);
						if (Static171.anInt3648 > -1) {
							if (local82 == 1) {
								Static176.anInt3730 -= 20;
							}
							if (local82 == 2) {
								Static176.anInt3730 -= 10;
								Static171.anInt3648 -= 15;
							}
							if (local82 == 3) {
								Static176.anInt3730 -= 10;
								Static171.anInt3648 += 15;
							}
							Static211.aClass1_Sub2_Sub11Array7[local23.anIntArray413[local82]].method3781(arg4 + Static171.anInt3648 - 12, arg0 + -12 + Static176.anInt3730);
							Static39.aClass1_Sub2_Sub1_1.method456(Integer.toString(local23.anIntArray416[local82]), Static171.anInt3648 + arg4 - 1, arg0 - -Static176.anInt3730 + 3, 16777215, 0);
						}
					}
				}
			}
		}
		for (local13 = 0; local13 < Static90.anInt2026; local13++) {
			@Pc(836) int local836 = Static22.anIntArray55[local13];
			local82 = Static22.anIntArray52[local13];
			local273 = Static22.anIntArray53[local13];
			local315 = Static22.anIntArray49[local13];
			@Pc(850) boolean local850 = true;
			while (local850) {
				local850 = false;
				for (local358 = 0; local358 < local13; local358++) {
					if (local82 + 2 > -Static22.anIntArray49[local358] + Static22.anIntArray52[local358] && local82 - local315 < Static22.anIntArray52[local358] - -2 && local836 - local273 < Static22.anIntArray55[local358] - -Static22.anIntArray53[local358] && Static22.anIntArray55[local358] - Static22.anIntArray53[local358] < local836 - -local273 && Static22.anIntArray52[local358] - Static22.anIntArray49[local358] < local82) {
						local850 = true;
						local82 = Static22.anIntArray52[local358] - Static22.anIntArray49[local358];
					}
				}
			}
			Static171.anInt3648 = Static22.anIntArray55[local13];
			Static176.anInt3730 = Static22.anIntArray52[local13] = local82;
			@Pc(960) String local960 = Static22.aStringArray9[local13];
			if (Static215.anInt4272 == 0) {
				local632 = 16776960;
				if (Static22.anIntArray54[local13] < 6) {
					local632 = Static31.anIntArray77[Static22.anIntArray54[local13]];
				}
				if (Static22.anIntArray54[local13] == 6) {
					local632 = Static279.anInt5382 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static22.anIntArray54[local13] == 7) {
					local632 = Static279.anInt5382 % 20 >= 10 ? 65535 : 255;
				}
				if (Static22.anIntArray54[local13] == 8) {
					local632 = Static279.anInt5382 % 20 < 10 ? 45056 : 8454016;
				}
				if (Static22.anIntArray54[local13] == 9) {
					local635 = 150 - Static22.anIntArray51[local13];
					if (local635 < 50) {
						local632 = local635 * 1280 + 16711680;
					} else if (local635 < 100) {
						local632 = 16776960 + 16384000 - local635 * 327680;
					} else if (local635 < 150) {
						local632 = local635 * 5 + 64780;
					}
				}
				if (Static22.anIntArray54[local13] == 10) {
					local635 = 150 - Static22.anIntArray51[local13];
					if (local635 < 50) {
						local632 = local635 * 5 + 16711680;
					} else if (local635 < 100) {
						local632 = 16711935 + 16384000 - local635 * 327680;
					} else if (local635 < 150) {
						local632 = local635 * 327680 + 255 - (local635 - 100) * 5 - 32768000;
					}
				}
				if (Static22.anIntArray54[local13] == 11) {
					local635 = 150 - Static22.anIntArray51[local13];
					if (local635 < 50) {
						local632 = 16777215 - local635 * 327685;
					} else if (local635 < 100) {
						local632 = (local635 - 50) * 327685 + 65280;
					} else if (local635 < 150) {
						local632 = 49545215 - local635 * 327680;
					}
				}
				if (Static22.anIntArray50[local13] == 0) {
					Static134.aClass1_Sub2_Sub1_3.method456(local960, Static171.anInt3648 + arg4, arg0 + Static176.anInt3730, local632, 0);
				}
				if (Static22.anIntArray50[local13] == 1) {
					Static134.aClass1_Sub2_Sub1_3.method454(local960, Static171.anInt3648 + arg4, arg0 - -Static176.anInt3730, local632, Static279.anInt5382);
				}
				if (Static22.anIntArray50[local13] == 2) {
					Static134.aClass1_Sub2_Sub1_3.method453(local960, arg4 + Static171.anInt3648, Static176.anInt3730 + arg0, local632, Static279.anInt5382);
				}
				if (Static22.anIntArray50[local13] == 3) {
					Static134.aClass1_Sub2_Sub1_3.method460(local960, arg4 + Static171.anInt3648, Static176.anInt3730 + arg0, local632, Static279.anInt5382, 150 - Static22.anIntArray51[local13]);
				}
				if (Static22.anIntArray50[local13] == 4) {
					local635 = (150 - Static22.anIntArray51[local13]) * (Static134.aClass1_Sub2_Sub1_3.method451(local960) + 100) / 150;
					if (Static277.aBoolean412) {
						Static41.method836(Static171.anInt3648 + arg4 - 50, arg0, Static171.anInt3648 + arg4 + 50, arg2 + arg0);
					} else {
						Static50.method947(Static171.anInt3648 + arg4 - 50, arg0, arg4 + Static171.anInt3648 + 50, arg2 + arg0);
					}
					Static134.aClass1_Sub2_Sub1_3.method458(local960, Static171.anInt3648 + arg4 + 50 - local635, Static176.anInt3730 + arg0, local632, 0);
					if (Static277.aBoolean412) {
						Static41.method847(arg4, arg0, arg1 + arg4, arg0 - -arg2);
					} else {
						Static50.method950(arg4, arg0, arg4 + arg1, arg0 - -arg2);
					}
				}
				if (Static22.anIntArray50[local13] == 5) {
					local635 = 150 - Static22.anIntArray51[local13];
					if (Static277.aBoolean412) {
						Static41.method836(arg4, Static176.anInt3730 + arg0 - Static134.aClass1_Sub2_Sub1_3.anInt486 - 1, arg1 + arg4, Static176.anInt3730 + arg0 + 5);
					} else {
						Static50.method947(arg4, Static176.anInt3730 + arg0 - Static134.aClass1_Sub2_Sub1_3.anInt486 - 1, arg4 - -arg1, Static176.anInt3730 + arg0 + 5);
					}
					@Pc(1422) int local1422 = 0;
					if (local635 < 25) {
						local1422 = local635 - 25;
					} else if (local635 > 125) {
						local1422 = local635 - 125;
					}
					Static134.aClass1_Sub2_Sub1_3.method456(local960, Static171.anInt3648 + arg4, local1422 + Static176.anInt3730 + arg0, local632, 0);
					if (Static277.aBoolean412) {
						Static41.method847(arg4, arg0, arg4 + arg1, arg0 + arg2);
					} else {
						Static50.method950(arg4, arg0, arg1 + arg4, arg2 + arg0);
					}
				}
			} else {
				Static134.aClass1_Sub2_Sub1_3.method456(local960, Static171.anInt3648 + arg4, arg0 + Static176.anInt3730, 16776960, 0);
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
	public static void method1928() {
		if (Static88.anInt1962 < 0) {
			Static88.anInt1962 = 0;
			Static22.anInt448 = -1;
			Static258.anInt5077 = -1;
		}
		if (Static164.anInt3508 < Static88.anInt1962) {
			Static22.anInt448 = -1;
			Static88.anInt1962 = Static164.anInt3508;
			Static258.anInt5077 = -1;
		}
		if (Static207.anInt4867 < 0) {
			Static22.anInt448 = -1;
			Static207.anInt4867 = 0;
			Static258.anInt5077 = -1;
		}
		if (Static95.anInt2218 < Static207.anInt4867) {
			Static207.anInt4867 = Static95.anInt2218;
			Static22.anInt448 = -1;
			Static258.anInt5077 = -1;
		}
	}
}
