import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!pb", name = "N", descriptor = "I")
	public static int anInt5266 = 2;

	@OriginalMember(owner = "client!pb", name = "ib", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_90 = new Class237(5, 12);

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZ)Lclient!tg;")
	public static Class223 method4255(@OriginalArg(0) int arg0) {
		@Pc(10) Class223 local10 = (Class223) Static411.aClass83_59.method1658((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(29) byte[] local29 = Static174.aClass250_39.method5667(arg0, 0);
		local10 = new Class223();
		if (local29 != null) {
			local10.method5265(new Class1_Sub1(local29));
		}
		local10.method5266();
		Static411.aClass83_59.method1675((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZBI)V")
	public static void method4256(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			Static276.aClass109_10 = Static315.method4727(Static119.aClass138_7, Static389.aClass128_Sub1_1.anInt3576 * 2, Static299.aCanvas5, arg1, Static184.anInterface7_8);
		} else {
			if (arg0) {
				Static276.aClass109_10 = Static315.method4727(Static119.aClass138_7, 0, Static299.aCanvas5, 0, Static184.anInterface7_8);
				Static276.aClass109_10.M(0);
				@Pc(23) Class101 local23 = Static184.method2821(Static40.anInt742, Static420.aClass250_87);
				@Pc(32) Class129 local32 = Static276.aClass109_10.method4719(local23, Static459.method3750(Static384.aClass250_76, Static40.anInt742));
				Static289.method4079(local32, Static364.aClass84_84.method1678(Static167.anInt3118), true);
				Static276.aClass109_10.method4704();
				Static191.method2911();
				Static276.aClass109_10.method4713();
			}
			try {
				Static276.aClass109_10 = Static315.method4727(Static119.aClass138_7, Static389.aClass128_Sub1_1.anInt3576 * 2, Static299.aCanvas5, arg1, Static184.anInterface7_8);
				if (Static276.aClass109_10.method4724()) {
					@Pc(65) Class1_Sub23 local65 = Static276.aClass109_10.method4690();
					Static276.aClass109_10.method4730(local65);
				}
			} catch (@Pc(70) Throwable local70) {
				Static276.aClass109_10 = Static315.method4727(Static119.aClass138_7, 0, Static299.aCanvas5, 0, Static184.anInterface7_8);
				arg1 = 0;
			}
		}
		Static285.anInt7839 = arg1;
		Static302.method4315();
		if (!Static276.aClass109_10.method4686()) {
			Static262.anInt4646 = 1;
		}
		Static276.aClass109_10.method4717(Static262.anInt4646);
		Static276.aClass109_10.method4725(0);
		Static276.aClass109_10.na(8);
		Static126.aClass18_1 = Static276.aClass109_10.method4715();
		Static172.aClass18_3 = Static276.aClass109_10.method4715();
		Static389.method5309();
		Static276.aClass109_10.method4682(!Static389.aClass128_Sub1_1.aBoolean241);
		if (Static276.aClass109_10.method4744()) {
			Static326.method4589(Static389.aClass128_Sub1_1.aBoolean239);
		}
		Static131.method5615(Static276.aClass109_10, Static352.anInt6022 >> 3, Static135.anInt2314 >> 3);
		Static215.method3267();
		Static373.aBoolean406 = false;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!qa;II)Z")
	public static boolean method4261(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = (Static135.anInt2314 - 104) / 2;
		@Pc(17) int local17 = (Static352.anInt6022 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg1; local29 <= 3; local29++) {
					if (Static266.method3895(local21, local25, arg1, local29)) {
						local40 = local29;
						if (Static340.method4799(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static419.method5634(local21, local25, local40);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(83) int[] local83 = new int[262144];
		for (local29 = 0; local29 < local83.length; local29++) {
			local83[local29] = -16777216;
		}
		Static280.aClass80_12 = arg0.method4739(local83, 512, 512, 512);
		Static170.method2698();
		local40 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (-10 + 238 + (int) (Math.random() * 20.0D) << 8) + 238 - 10 | 0xFF000000;
		@Pc(158) int local158 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(177) int local177 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8;
		@Pc(181) boolean[][] local181 = new boolean[Static353.anInt6048][Static353.anInt6048];
		@Pc(187) int local187;
		@Pc(204) int local204;
		@Pc(208) int local208;
		@Pc(212) int local212;
		@Pc(266) int local266;
		@Pc(273) int local273;
		@Pc(277) int local277;
		@Pc(296) int local296;
		for (@Pc(183) int local183 = local11; local183 < local11 + 104; local183 += Static353.anInt6048) {
			for (local187 = local17; local187 < local17 + 104; local187 += Static353.anInt6048) {
				arg0.pa(0, 0, Static353.anInt6048 * 4, Static353.anInt6048 * 4);
				arg0.M(-16777216);
				for (local204 = arg1; local204 <= 3; local204++) {
					for (local208 = 0; local208 < Static353.anInt6048; local208++) {
						for (local212 = 0; local212 < Static353.anInt6048; local212++) {
							local181[local208][local212] = Static266.method3895(local208 + local183, local187 + local212, arg1, local204);
						}
					}
					Static328.aClass136Array3[local204].method5976(local183, local187, Static353.anInt6048 + local183, local187 - -Static353.anInt6048, local181);
					if (!Static26.aBoolean264) {
						for (local212 = -4; local212 < Static353.anInt6048; local212++) {
							for (local266 = -4; local266 < Static353.anInt6048; local266++) {
								local273 = local183 + local212;
								local277 = local187 + local266;
								if (local11 <= local273 && local277 >= local17 && Static266.method3895(local273, local277, arg1, local204)) {
									local296 = local204;
									if (Static340.method4799(local277, local273)) {
										local296 = local204 - 1;
									}
									if (local296 >= 0) {
										Static278.method5822(arg0, local40, local273, local296, local158, local212 * 4, local277, (Static353.anInt6048 - local266) * 4 - 4);
									}
								}
							}
						}
					}
				}
				if (Static26.aBoolean264) {
					@Pc(350) Class112 local350 = Static170.aClass112Array1[arg1];
					for (local212 = 0; local212 < Static353.anInt6048; local212++) {
						for (local266 = 0; local266 < Static353.anInt6048; local266++) {
							local273 = local183 + local212;
							local277 = local187 + local266;
							local296 = local350.anIntArrayArray90[local273 - local350.anInt3133][local277 - local350.anInt3142];
							if ((local296 & 0x40240000) != 0) {
								arg0.method4743(local212 * 4, -1713569622, (Static353.anInt6048 - local266) * 4 - 4, 4, 4);
							} else if ((local296 & 0x800000) != 0) {
								arg0.method4689((Static353.anInt6048 - local266) * 4 - 4, -1713569622, local212 * 4, 4);
							} else if ((local296 & 0x2000000) != 0) {
								arg0.method4720((Static353.anInt6048 - local266) * 4 - 4, 4, -1713569622, local212 * 4 + 3);
							} else if ((local296 & 0x8000000) != 0) {
								arg0.method4689((Static353.anInt6048 - local266) * 4 + 3 - 4, -1713569622, local212 * 4, 4);
							} else if ((local296 & 0x20000000) != 0) {
								arg0.method4720((Static353.anInt6048 - local266) * 4 - 4, 4, -1713569622, local212 * 4);
							}
						}
					}
				}
				arg0.NA(0, 0, Static353.anInt6048 * 4, Static353.anInt6048 * 4, local177, 2);
				Static280.aClass80_12.W((local183 - local11) * 4 + 48, -(Static353.anInt6048 * 4) + -((-local17 + local187) * 4) + 464, Static353.anInt6048 * 4, Static353.anInt6048 * 4, 0, 0);
			}
		}
		arg0.va();
		arg0.M(-16777215);
		Static353.method4882();
		Static291.anInt5119 = 0;
		Static87.aClass266_13.method6004();
		if (!Static26.aBoolean264) {
			for (local187 = local11; local187 < local11 + 104; local187++) {
				for (local204 = local17; local204 < local17 + 104; local204++) {
					for (local208 = arg1; arg1 + 1 >= local208 && local208 <= 3; local208++) {
						if (Static266.method3895(local187, local204, arg1, local208)) {
							@Pc(613) Interface6 local613 = (Interface6) Static366.method4342(local208, local187, local204);
							if (local613 == null) {
								local613 = (Interface6) Static278.method5819(local208, local187, local204, jv.class);
							}
							if (local613 == null) {
								local613 = (Interface6) Static259.method5039(local208, local187, local204);
							}
							if (local613 == null) {
								local613 = (Interface6) Static81.method1400(local208, local187, local204);
							}
							if (local613 != null) {
								@Pc(654) Class182 local654 = Static71.aClass105_6.method2336(local613.method4665());
								if (!local654.aBoolean356 || Static429.aBoolean475) {
									local273 = local654.anInt5455;
									if (local654.anIntArray425 != null) {
										for (local277 = 0; local277 < local654.anIntArray425.length; local277++) {
											if (local654.anIntArray425[local277] != -1) {
												@Pc(683) Class182 local683 = Static71.aClass105_6.method2336(local654.anIntArray425[local277]);
												if (local683.anInt5455 >= 0) {
													local273 = local683.anInt5455;
												}
											}
										}
									}
									if (local273 >= 0) {
										@Pc(699) boolean local699 = false;
										if (local273 >= 0) {
											@Pc(706) Class231 local706 = Static1.aClass224_1.method5302(local273);
											if (local706 != null && local706.aBoolean444) {
												local699 = true;
											}
										}
										local296 = local187;
										@Pc(717) int local717 = local204;
										if (local699) {
											@Pc(724) int[][] local724 = Static170.aClass112Array1[local208].anIntArrayArray90;
											@Pc(729) int local729 = Static170.aClass112Array1[local208].anInt3133;
											@Pc(734) int local734 = Static170.aClass112Array1[local208].anInt3142;
											for (@Pc(736) int local736 = 0; local736 < 10; local736++) {
												@Pc(743) int local743 = (int) (Math.random() * 4.0D);
												if (local743 == 0 && local11 < local296 && local187 - 3 < local296 && (local724[local296 - local729 - 1][local717 - local734] & 0x2C0108) == 0) {
													local296--;
												}
												if (local743 == 1 && local296 < local11 + 104 - 1 && local296 < local187 + 3 && (local724[local296 + 1 - local729][local717 - local734] & 0x2C0180) == 0) {
													local296++;
												}
												if (local743 == 2 && local717 > local17 && local717 > local204 - 3 && (local724[local296 - local729][local717 - local734 - 1] & 0x2C0102) == 0) {
													local717--;
												}
												if (local743 == 3 && local717 < local17 + 104 - 1 && local204 + 3 > local717 && (local724[local296 - local729][local717 + 1 - local734] & 0x2C0120) == 0) {
													local717++;
												}
											}
										}
										Static195.anIntArray291[Static291.anInt5119] = local654.anInt5478;
										Static285.anIntArray689[Static291.anInt5119] = local296;
										Static94.anIntArray159[Static291.anInt5119] = local717;
										Static291.anInt5119++;
									}
								}
							}
						}
					}
				}
			}
			if (Static208.aClass222_3 != null) {
				Static147.aClass250_27.anInt7316 = 1;
				Static1.aClass224_1.method5304(64, 1024);
				for (local204 = 0; local204 < Static208.aClass222_3.anInt6534; local204++) {
					local208 = Static208.aClass222_3.anIntArray544[local204];
					if (local208 >> 28 == Static196.aClass26_Sub2_Sub2_Sub1_1.aByte95) {
						local212 = (local208 >> 14 & 0x3FFF) - Static437.anInt7555;
						local266 = (local208 & 0x3FFF) - Static134.anInt5502;
						if (local212 >= 0 && local212 < Static135.anInt2314 && local266 >= 0 && Static352.anInt6022 > local266) {
							Static87.aClass266_13.method5998(new Class1_Sub13(local204));
						} else {
							@Pc(1021) Class231 local1021 = Static1.aClass224_1.method5302(Static208.aClass222_3.anIntArray542[local204]);
							if (local1021.anIntArray568 != null && local212 + local1021.anInt6846 >= 0 && local1021.anInt6838 + local212 < Static135.anInt2314 && local266 + local1021.anInt6859 >= 0 && local266 + local1021.anInt6841 < Static352.anInt6022) {
								Static87.aClass266_13.method5998(new Class1_Sub13(local204));
							}
						}
					}
				}
				Static1.aClass224_1.method5304(64, 128);
				Static147.aClass250_27.anInt7316 = 2;
				Static147.aClass250_27.method5676();
			}
		}
		return true;
	}
}
