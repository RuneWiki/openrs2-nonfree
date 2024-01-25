import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!pp", name = "L", descriptor = "Lclient!ci;")
	public static final Class39 aClass39_1 = Static338.method5527();

	@OriginalMember(owner = "client!pp", name = "V", descriptor = "Z")
	public static boolean aBoolean463 = false;

	@OriginalMember(owner = "client!pp", name = "W", descriptor = "I")
	public static int anInt5343 = -1;

	@OriginalMember(owner = "client!pp", name = "X", descriptor = "Lclient!jg;")
	public static final Class107 aClass107_35 = new Class107(50);

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(B[I[I[ILclient!wn;)V")
	public static void method4520(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class1_Sub2_Sub3_Sub2 arg3) {
		for (@Pc(8) int local8 = 0; local8 < arg1.length; local8++) {
			@Pc(14) int local14 = arg1[local8];
			@Pc(18) int local18 = arg0[local8];
			@Pc(22) int local22 = arg2[local8];
			@Pc(24) int local24 = 0;
			while (local18 != 0 && arg3.aClass212Array3.length > local24) {
				if ((local18 & 0x1) != 0) {
					if (local14 == -1) {
						arg3.aClass212Array3[local24] = null;
					} else {
						@Pc(40) Class84 local40 = Static91.method1822(local14);
						@Pc(43) int local43 = local40.anInt2456;
						@Pc(48) Class212 local48 = arg3.aClass212Array3[local24];
						if (local48 != null) {
							if (local48.anInt6755 == local14) {
								if (local43 == 0) {
									local48 = arg3.aClass212Array3[local24] = null;
								} else if (local43 == 1) {
									local48.anInt6752 = 0;
									local48.anInt6753 = local22;
									local48.anInt6757 = 1;
									local48.anInt6759 = 0;
									local48.anInt6756 = 0;
									Static41.method4705(false, 0, arg3.anInt6888, arg3.anInt6893, local40, arg3.aByte77);
								} else if (local43 == 2) {
									local48.anInt6759 = 0;
								}
							} else if (local40.anInt2459 >= Static91.method1822(local48.anInt6755).anInt2459) {
								local48 = arg3.aClass212Array3[local24] = null;
							}
						}
						if (local48 == null) {
							local48 = arg3.aClass212Array3[local24] = new Class212();
							local48.anInt6757 = 1;
							local48.anInt6759 = 0;
							local48.anInt6755 = local14;
							local48.anInt6752 = 0;
							local48.anInt6756 = 0;
							local48.anInt6753 = local22;
							Static41.method4705(false, 0, arg3.anInt6888, arg3.anInt6893, local40, arg3.aByte77);
						}
					}
				}
				local24++;
				local18 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(IILclient!dr;)Z")
	public static boolean method4521(@OriginalArg(0) int arg0, @OriginalArg(2) Class37 arg1) {
		@Pc(11) int local11 = (Static66.anInt1177 - 104) / 2;
		@Pc(17) int local17 = (Static12.anInt213 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg0; local29 <= 3; local29++) {
					if (Static32.method438(local21, local25, arg0, local29)) {
						local40 = local29;
						if (Static283.method4811(local21, local25)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static92.method1838(local40, local25, local21);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(87) int[] local87 = new int[262144];
		for (local29 = 0; local29 < local87.length; local29++) {
			local87[local29] = -16777216;
		}
		Static235.aClass46_16 = arg1.method3729(local87, 512, 512, 512);
		Static183.method3484();
		local40 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 8) + ((int) (Math.random() * 20.0D) + -10 + 238 << 16) + 238 - 10 | 0xFF000000;
		@Pc(153) int local153 = ((int) (Math.random() * 20.0D) + 228 | 0xFF00) << 16;
		@Pc(172) int local172 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16;
		@Pc(176) boolean[][] local176 = new boolean[Static84.anInt1572][Static84.anInt1572];
		@Pc(182) int local182;
		@Pc(199) int local199;
		@Pc(203) int local203;
		@Pc(207) int local207;
		@Pc(259) int local259;
		@Pc(266) int local266;
		@Pc(270) int local270;
		@Pc(285) int local285;
		for (@Pc(178) int local178 = local11; local178 < local11 + 104; local178 += Static84.anInt1572) {
			for (local182 = local17; local182 < local17 + 104; local182 += Static84.anInt1572) {
				arg1.method3677(0, 0, Static84.anInt1572 * 4, Static84.anInt1572 * 4);
				arg1.method3689(-16777216);
				for (local199 = arg0; local199 <= 3; local199++) {
					for (local203 = 0; local203 < Static84.anInt1572; local203++) {
						for (local207 = 0; local207 < Static84.anInt1572; local207++) {
							local176[local203][local207] = Static32.method438(local178 + local203, local182 - -local207, arg0, local199);
						}
					}
					Static101.aClass105Array2[local199].method4455(local178, local182, local178 + Static84.anInt1572, local182 - -Static84.anInt1572, local176);
					if (!Static296.aBoolean582) {
						for (local207 = -4; local207 < Static84.anInt1572; local207++) {
							for (local259 = -4; local259 < Static84.anInt1572; local259++) {
								local266 = local178 + local207;
								local270 = local259 + local182;
								if (local266 >= local11 && local270 >= local17 && Static32.method438(local266, local270, arg0, local199)) {
									local285 = local199;
									if (Static283.method4811(local266, local270)) {
										local285 = local199 - 1;
									}
									if (local285 >= 0) {
										Static105.method2077(arg1, local266, local207 * 4, local153, (Static84.anInt1572 - local259) * 4 - 4, local285, local270, local40);
									}
								}
							}
						}
					}
				}
				if (Static296.aBoolean582) {
					@Pc(342) Class61 local342 = Static182.aClass61Array2[arg0];
					for (local207 = 0; local207 < Static84.anInt1572; local207++) {
						for (local259 = 0; local259 < Static84.anInt1572; local259++) {
							local266 = local178 + local207;
							local270 = local182 + local259;
							local285 = local342.anIntArrayArray19[local266 - local342.anInt1457][local270 - local342.anInt1460];
							if ((local285 & 0x40240000) != 0) {
								arg1.method3694(4, -1713569622, 4, local207 * 4, (Static84.anInt1572 - local259) * 4 - 4);
							} else if ((local285 & 0x800000) != 0) {
								arg1.method3660(4, (Static84.anInt1572 - local259) * 4 - 4, local207 * 4, -1713569622);
							} else if ((local285 & 0x2000000) != 0) {
								arg1.method3739((Static84.anInt1572 - local259) * 4 - 4, -1713569622, 4, local207 * 4 + 3);
							} else if ((local285 & 0x8000000) != 0) {
								arg1.method3660(4, (Static84.anInt1572 - local259) * 4 + 3 - 4, local207 * 4, -1713569622);
							} else if ((local285 & 0x20000000) != 0) {
								arg1.method3739((Static84.anInt1572 - local259) * 4 - 4, -1713569622, 4, local207 * 4);
							}
						}
					}
				}
				arg1.method3712(0, 0, Static84.anInt1572 * 4, Static84.anInt1572 * 4, local172, 2);
				Static235.aClass46_16.method5029((local178 - local11) * 4 + 48, 464 - (local182 + -local17) * 4 - Static84.anInt1572 * 4, Static84.anInt1572 * 4, Static84.anInt1572 * 4);
			}
		}
		arg1.method3709();
		arg1.method3689(-16777215);
		Static35.method5765();
		Static190.anInt6227 = 0;
		Static268.aClass180_38.method4917();
		if (!Static296.aBoolean582) {
			for (local182 = local11; local182 < local11 + 104; local182++) {
				for (local199 = local17; local199 < local17 + 104; local199++) {
					for (local203 = arg0; local203 <= arg0 + 1 && local203 <= 3; local203++) {
						if (Static32.method438(local182, local199, arg0, local203)) {
							@Pc(616) Interface8 local616 = (Interface8) Static217.method4135(local203, local182, local199);
							if (local616 == null) {
								local616 = (Interface8) Static109.method2112(local203, local182, local199, rc.class);
							}
							if (local616 == null) {
								local616 = (Interface8) Static356.method5687(local203, local182, local199);
							}
							if (local616 == null) {
								local616 = (Interface8) Static346.method5010(local203, local182, local199);
							}
							if (local616 != null) {
								@Pc(658) Class74 local658 = Static228.method4210(local616.method5502());
								if (!local658.aBoolean188 || Static235.aBoolean440) {
									local266 = local658.anInt2055;
									if (local658.anIntArray161 != null) {
										for (local270 = 0; local270 < local658.anIntArray161.length; local270++) {
											if (local658.anIntArray161[local270] != -1) {
												@Pc(689) Class74 local689 = Static228.method4210(local658.anIntArray161[local270]);
												if (local689.anInt2055 >= 0) {
													local266 = local689.anInt2055;
												}
											}
										}
									}
									if (local266 >= 0) {
										@Pc(712) boolean local712 = false;
										if (local266 >= 0) {
											@Pc(718) Class66 local718 = Static312.method5209(local266);
											if (local718 != null && local718.aBoolean156) {
												local712 = true;
											}
										}
										local285 = local182;
										@Pc(729) int local729 = local199;
										if (local712) {
											@Pc(736) int[][] local736 = Static182.aClass61Array2[local203].anIntArrayArray19;
											@Pc(741) int local741 = Static182.aClass61Array2[local203].anInt1457;
											@Pc(746) int local746 = Static182.aClass61Array2[local203].anInt1460;
											for (@Pc(748) int local748 = 0; local748 < 10; local748++) {
												@Pc(755) int local755 = (int) (Math.random() * 4.0D);
												if (local755 == 0 && local285 > local11 && local285 > local182 - 3 && (local736[local285 - local741 - 1][local729 - local746] & 0x2C0108) == 0) {
													local285--;
												}
												if (local755 == 1 && local11 + 104 - 1 > local285 && local285 < local182 + 3 && (local736[local285 + 1 - local741][local729 - local746] & 0x2C0180) == 0) {
													local285++;
												}
												if (local755 == 2 && local729 > local17 && local199 - 3 < local729 && (local736[local285 - local741][local729 - local746 - 1] & 0x2C0102) == 0) {
													local729--;
												}
												if (local755 == 3 && local729 < local17 + 103 && local199 + 3 > local729 && (local736[local285 - local741][local729 + 1 - local746] & 0x2C0120) == 0) {
													local729++;
												}
											}
										}
										Static10.anIntArray24[Static190.anInt6227] = local658.anInt2071;
										Static18.anIntArray32[Static190.anInt6227] = local285;
										Static292.anIntArray454[Static190.anInt6227] = local729;
										Static190.anInt6227++;
									}
								}
							}
						}
					}
				}
			}
			if (Static283.aClass194_3 != null) {
				Static304.aClass104_159.anInt3077 = 1;
				Static237.method4313(64, 1024);
				for (local199 = 0; local199 < Static283.aClass194_3.anInt6208; local199++) {
					local203 = Static283.aClass194_3.anIntArray480[local199];
					if (local203 >> 28 == Static177.aClass1_Sub2_Sub3_Sub1_1.aByte77) {
						local207 = (local203 >> 14 & 0x3FFF) - Static150.anInt3453;
						local259 = (local203 & 0x3FFF) - Static287.anInt5776;
						if (local207 >= 0 && local207 < Static66.anInt1177 && local259 >= 0 && Static12.anInt213 > local259) {
							Static268.aClass180_38.method4909(new Class2_Sub23(local199));
						} else {
							@Pc(1012) Class66 local1012 = Static312.method5209(Static283.aClass194_3.anIntArray479[local199]);
							if (local1012.anIntArray137 != null && local1012.anInt1761 + local207 >= 0 && Static66.anInt1177 > local207 + local1012.anInt1744 && local1012.anInt1755 + local259 >= 0 && local1012.anInt1762 + local259 < Static12.anInt213) {
								Static268.aClass180_38.method4909(new Class2_Sub23(local199));
							}
						}
					}
				}
				Static237.method4313(64, 128);
				Static304.aClass104_159.anInt3077 = 2;
				Static304.aClass104_159.method2751();
			}
		}
		return true;
	}
}
