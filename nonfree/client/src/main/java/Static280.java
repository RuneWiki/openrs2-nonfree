import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray31;

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "Lclient!ul;")
	public static Class246 aClass246_157;

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
	public static int anInt4913;

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_56 = new Class179(67, 2);

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIII)V")
	public static void method4059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(12) int local12 = -arg2;
		Static59.method1261(Static163.anIntArrayArray35[arg3], arg2 + arg0, arg0 + -arg2, arg1);
		@Pc(31) int local31 = -1;
		while (local9 > local7) {
			local31 += 2;
			local12 += local31;
			local7++;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(54) int[] local54 = Static163.anIntArrayArray35[local9 + arg3];
				@Pc(61) int[] local61 = Static163.anIntArrayArray35[arg3 - local9];
				@Pc(65) int local65 = arg0 + local7;
				@Pc(70) int local70 = arg0 - local7;
				Static59.method1261(local54, local65, local70, arg1);
				Static59.method1261(local61, local65, local70, arg1);
			}
			@Pc(86) int local86 = arg0 + local9;
			@Pc(90) int local90 = arg0 - local9;
			@Pc(96) int[] local96 = Static163.anIntArrayArray35[local7 + arg3];
			@Pc(103) int[] local103 = Static163.anIntArrayArray35[arg3 - local7];
			Static59.method1261(local96, local86, local90, arg1);
			Static59.method1261(local103, local86, local90, arg1);
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILclient!ya;I)Z")
	public static boolean method4062(@OriginalArg(1) Class39 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = (Static195.anInt3537 - 104) / 2;
		@Pc(17) int local17 = (Static118.anInt2419 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg1; local29 <= 3; local29++) {
					if (Static412.method5522(local21, local29, arg1, local25)) {
						local40 = local29;
						if (Static87.method1622(local21, local25)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static210.method3333(local25, local40, local21);
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
		Static188.aClass143_20 = arg0.method4554(local89, 512, 512, 512);
		Static264.method3899();
		local40 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 + -10 << 16) + 238 - 10 | 0xFF000000;
		@Pc(169) int local169 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(188) int local188 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16;
		@Pc(192) boolean[][] local192 = new boolean[Static199.anInt3824][Static199.anInt3824];
		@Pc(198) int local198;
		@Pc(215) int local215;
		@Pc(219) int local219;
		@Pc(223) int local223;
		@Pc(276) int local276;
		@Pc(282) int local282;
		@Pc(286) int local286;
		@Pc(301) int local301;
		for (@Pc(194) int local194 = local11; local194 < local11 + 104; local194 += Static199.anInt3824) {
			for (local198 = local17; local198 < local17 + 104; local198 += Static199.anInt3824) {
				arg0.OA(0, 0, Static199.anInt3824 * 4, Static199.anInt3824 * 4);
				arg0.p(-16777216);
				for (local215 = arg1; local215 <= 3; local215++) {
					for (local219 = 0; local219 < Static199.anInt3824; local219++) {
						for (local223 = 0; local223 < Static199.anInt3824; local223++) {
							local192[local219][local223] = Static412.method5522(local194 + local219, local215, arg1, local198 + local223);
						}
					}
					Static269.aClass149Array2[local215].method3564(local194, local198, Static199.anInt3824 + local194, Static199.anInt3824 + local198, local192);
					if (!Static407.aBoolean447) {
						for (local223 = -4; local223 < Static199.anInt3824; local223++) {
							for (local276 = -4; local276 < Static199.anInt3824; local276++) {
								local282 = local194 + local223;
								local286 = local276 + local198;
								if (local11 <= local282 && local286 >= local17 && Static412.method5522(local282, local215, arg1, local286)) {
									local301 = local215;
									if (Static87.method1622(local282, local286)) {
										local301 = local215 - 1;
									}
									if (local301 >= 0) {
										Static253.method3796(local223 * 4, local169, arg0, (Static199.anInt3824 - local276) * 4 - 4, local40, local301, local286, local282);
									}
								}
							}
						}
					}
				}
				if (Static407.aBoolean447) {
					@Pc(349) Class188 local349 = Static125.aClass188Array1[arg1];
					for (local223 = 0; local223 < Static199.anInt3824; local223++) {
						for (local276 = 0; local276 < Static199.anInt3824; local276++) {
							local282 = local223 + local194;
							local286 = local276 + local198;
							local301 = local349.anIntArrayArray51[local282 - local349.anInt5211][local286 - local349.anInt5216];
							if ((local301 & 0x40240000) != 0) {
								arg0.method4563((Static199.anInt3824 - local276) * 4 - 4, -1713569622, 4, local223 * 4, 4);
							} else if ((local301 & 0x800000) != 0) {
								arg0.method4501(local223 * 4, 4, -1713569622, (Static199.anInt3824 - local276) * 4 - 4);
							} else if ((local301 & 0x2000000) != 0) {
								arg0.method4500((Static199.anInt3824 - local276) * 4 - 4, 4, local223 * 4 + 3, -1713569622);
							} else if ((local301 & 0x8000000) != 0) {
								arg0.method4501(local223 * 4, 4, -1713569622, (Static199.anInt3824 - local276) * 4 + 3 - 4);
							} else if ((local301 & 0x20000000) != 0) {
								arg0.method4500((Static199.anInt3824 - local276) * 4 - 4, 4, local223 * 4, -1713569622);
							}
						}
					}
				}
				arg0.O(0, 0, Static199.anInt3824 * 4, Static199.anInt3824 * 4, local188, 2);
				Static188.aClass143_20.t((local194 - local11) * 4 + 48, -(Static199.anInt3824 * 4) + 464 + -((-local17 + local198) * 4), Static199.anInt3824 * 4, Static199.anInt3824 * 4, 0, 0);
			}
		}
		arg0.e();
		arg0.p(-16777215);
		Static319.method3515();
		Static62.anInt1460 = 0;
		Static381.aClass181_62.method4101();
		if (!Static407.aBoolean447) {
			for (local198 = local11; local198 < local11 + 104; local198++) {
				for (local215 = local17; local215 < local17 + 104; local215++) {
					for (local219 = arg1; arg1 + 1 >= local219 && local219 <= 3; local219++) {
						if (Static412.method5522(local198, local219, arg1, local215)) {
							@Pc(615) Interface5 local615 = (Interface5) Static393.method5258(local219, local198, local215);
							if (local615 == null) {
								local615 = (Interface5) Static357.method4896(local219, local198, local215, ig.class);
							}
							if (local615 == null) {
								local615 = (Interface5) Static110.method1983(local219, local198, local215);
							}
							if (local615 == null) {
								local615 = (Interface5) Static198.method3177(local219, local198, local215);
							}
							if (local615 != null) {
								@Pc(658) Class129 local658 = Static349.aClass115_4.method2766(local615.method5176());
								if (!local658.aBoolean223 || Static232.aBoolean297) {
									local282 = local658.anInt3494;
									if (local658.anIntArray310 != null) {
										for (local286 = 0; local286 < local658.anIntArray310.length; local286++) {
											if (local658.anIntArray310[local286] != -1) {
												@Pc(687) Class129 local687 = Static349.aClass115_4.method2766(local658.anIntArray310[local286]);
												if (local687.anInt3494 >= 0) {
													local282 = local687.anInt3494;
												}
											}
										}
									}
									if (local282 >= 0) {
										@Pc(703) boolean local703 = false;
										if (local282 >= 0) {
											@Pc(713) Class202 local713 = Static17.aClass78_3.method2110(local282);
											if (local713 != null && local713.aBoolean399) {
												local703 = true;
											}
										}
										local301 = local198;
										@Pc(724) int local724 = local215;
										if (local703) {
											@Pc(731) int[][] local731 = Static125.aClass188Array1[local219].anIntArrayArray51;
											@Pc(736) int local736 = Static125.aClass188Array1[local219].anInt5211;
											@Pc(741) int local741 = Static125.aClass188Array1[local219].anInt5216;
											for (@Pc(743) int local743 = 0; local743 < 10; local743++) {
												@Pc(750) int local750 = (int) (Math.random() * 4.0D);
												if (local750 == 0 && local11 < local301 && local301 > local198 - 3 && (local731[local301 - local736 - 1][local724 - local741] & 0x2C0108) == 0) {
													local301--;
												}
												if (local750 == 1 && local11 + 104 - 1 > local301 && local301 < local198 + 3 && (local731[local301 + 1 - local736][local724 - local741] & 0x2C0180) == 0) {
													local301++;
												}
												if (local750 == 2 && local17 < local724 && local215 - 3 < local724 && (local731[local301 - local736][local724 - local741 - 1] & 0x2C0102) == 0) {
													local724--;
												}
												if (local750 == 3 && local17 + 104 - 1 > local724 && local215 + 3 > local724 && (local731[local301 - local736][local724 + 1 - local741] & 0x2C0120) == 0) {
													local724++;
												}
											}
										}
										Static218.anIntArray332[Static62.anInt1460] = local658.anInt3530;
										Static373.anIntArray567[Static62.anInt1460] = local301;
										Static399.anIntArray651[Static62.anInt1460] = local724;
										Static62.anInt1460++;
									}
								}
							}
						}
					}
				}
			}
			if (Static236.aClass45_3 != null) {
				Static94.aClass246_56.anInt6592 = 1;
				Static17.aClass78_3.method2111(64, 1024);
				for (local215 = 0; local215 < Static236.aClass45_3.anInt1505; local215++) {
					local219 = Static236.aClass45_3.anIntArray102[local215];
					if (local219 >> 28 == Static452.aClass31_Sub2_Sub1_Sub1_2.aByte100) {
						local223 = (local219 >> 14 & 0x3FFF) - Static165.anInt3049;
						local276 = (local219 & 0x3FFF) - Static345.anInt5799;
						if (local223 >= 0 && local223 < Static195.anInt3537 && local276 >= 0 && Static118.anInt2419 > local276) {
							Static381.aClass181_62.method4102(new Class1_Sub43(local215));
						} else {
							@Pc(999) Class202 local999 = Static17.aClass78_3.method2110(Static236.aClass45_3.anIntArray103[local215]);
							if (local999.anIntArray517 != null && local999.anInt5593 + local223 >= 0 && Static195.anInt3537 > local999.anInt5594 + local223 && local276 + local999.anInt5566 >= 0 && Static118.anInt2419 > local276 + local999.anInt5570) {
								Static381.aClass181_62.method4102(new Class1_Sub43(local215));
							}
						}
					}
				}
				Static17.aClass78_3.method2111(64, 128);
				Static94.aClass246_56.anInt6592 = 2;
				Static94.aClass246_56.method5474();
			}
		}
		return true;
	}
}
