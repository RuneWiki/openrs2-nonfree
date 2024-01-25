import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!og", name = "V", descriptor = "I")
	public static int anInt5181;

	@OriginalMember(owner = "client!og", name = "bb", descriptor = "Lclient!an;")
	public static Class12 aClass12_1;

	@OriginalMember(owner = "client!og", name = "ab", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_171 = new Class186(84, 6);

	@OriginalMember(owner = "client!og", name = "cb", descriptor = "I")
	public static int anInt5184 = 0;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ILclient!ic;)V")
	public static void method3970(@OriginalArg(1) Class4_Sub21 arg0) {
		if (!Static346.aBoolean427) {
			arg0.method5854();
			Static83.anInt1893--;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIII)V")
	public static void method3971(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) int local10;
		if (arg0 <= arg1) {
			for (local10 = arg0; local10 < arg1; local10++) {
				Static162.anIntArrayArray58[local10][arg2] = arg3;
			}
		} else {
			for (local10 = arg1; local10 < arg0; local10++) {
				Static162.anIntArrayArray58[local10][arg2] = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IILclient!qa;)Z")
	public static boolean method3972(@OriginalArg(1) int arg0, @OriginalArg(2) Class30 arg1) {
		@Pc(11) int local11 = (Static126.anInt2569 - 104) / 2;
		@Pc(17) int local17 = (Static190.anInt3697 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg0; local29 <= 3; local29++) {
					if (Static123.method5297(local29, arg0, local21, local25)) {
						local40 = local29;
						if (Static317.method4378(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static21.method448(local21, local25, local40);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(90) int[] local90 = new int[262144];
		for (local29 = 0; local29 < local90.length; local29++) {
			local90[local29] = -16777216;
		}
		Static195.aClass3_8 = arg1.method4672(local90, 512, 512, 512);
		Static326.method2434();
		local40 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 16) + ((int) (Math.random() * 20.0D) - 10 + 238 << 8) + 238 - 10 | 0xFF000000;
		@Pc(159) int local159 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(178) int local178 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8;
		@Pc(182) boolean[][] local182 = new boolean[Static448.anInt7460][Static448.anInt7460];
		@Pc(188) int local188;
		@Pc(205) int local205;
		@Pc(209) int local209;
		@Pc(213) int local213;
		@Pc(270) int local270;
		@Pc(276) int local276;
		@Pc(280) int local280;
		@Pc(299) int local299;
		for (@Pc(184) int local184 = local11; local184 < local11 + 104; local184 += Static448.anInt7460) {
			for (local188 = local17; local188 < local17 + 104; local188 += Static448.anInt7460) {
				arg1.pa(0, 0, Static448.anInt7460 * 4, Static448.anInt7460 * 4);
				arg1.M(-16777216);
				for (local205 = arg0; local205 <= 3; local205++) {
					for (local209 = 0; local209 < Static448.anInt7460; local209++) {
						for (local213 = 0; local213 < Static448.anInt7460; local213++) {
							local182[local209][local213] = Static123.method5297(local205, arg0, local209 + local184, local188 + local213);
						}
					}
					Static422.aClass146Array3[local205].method3607(local184, local188, Static448.anInt7460 + local184, local188 + Static448.anInt7460, local182);
					if (!Static201.aBoolean441) {
						for (local213 = -4; local213 < Static448.anInt7460; local213++) {
							for (local270 = -4; local270 < Static448.anInt7460; local270++) {
								local276 = local213 + local184;
								local280 = local270 + local188;
								if (local276 >= local11 && local280 >= local17 && Static123.method5297(local205, arg0, local276, local280)) {
									local299 = local205;
									if (Static317.method4378(local280, local276)) {
										local299 = local205 - 1;
									}
									if (local299 >= 0) {
										Static220.method4270(local299, local40, local276, local159, (Static448.anInt7460 - local270) * 4 - 4, arg1, local280, local213 * 4);
									}
								}
							}
						}
					}
				}
				if (Static201.aBoolean441) {
					@Pc(352) Class268 local352 = Static395.aClass268Array1[arg0];
					for (local213 = 0; local213 < Static448.anInt7460; local213++) {
						for (local270 = 0; local270 < Static448.anInt7460; local270++) {
							local276 = local184 + local213;
							local280 = local270 + local188;
							local299 = local352.anIntArrayArray66[local276 - local352.anInt7539][local280 - local352.anInt7518];
							if ((local299 & 0x40240000) != 0) {
								arg1.method4692(4, 4, local213 * 4, -1713569622, (Static448.anInt7460 - local270) * 4 - 4);
							} else if ((local299 & 0x800000) != 0) {
								arg1.method4658(local213 * 4, -1713569622, (Static448.anInt7460 - local270) * 4 - 4, 4);
							} else if ((local299 & 0x2000000) != 0) {
								arg1.method4677(-1713569622, 4, (Static448.anInt7460 - local270) * 4 - 4, local213 * 4 - -3);
							} else if ((local299 & 0x8000000) != 0) {
								arg1.method4658(local213 * 4, -1713569622, (Static448.anInt7460 - local270) * 4 + 3 - 4, 4);
							} else if ((local299 & 0x20000000) != 0) {
								arg1.method4677(-1713569622, 4, (Static448.anInt7460 - local270) * 4 - 4, local213 * 4);
							}
						}
					}
				}
				arg1.NA(0, 0, Static448.anInt7460 * 4, Static448.anInt7460 * 4, local178, 2);
				Static195.aClass3_8.W((local184 - local11) * 4 + 48, -(Static448.anInt7460 * 4) + -((-local17 + local188) * 4) + 464, Static448.anInt7460 * 4, Static448.anInt7460 * 4, 0, 0);
			}
		}
		arg1.va();
		arg1.M(-16777215);
		Static262.method3574();
		Static202.anInt3890 = 0;
		Static87.aClass258_15.method5527();
		if (!Static201.aBoolean441) {
			for (local188 = local11; local188 < local11 + 104; local188++) {
				for (local205 = local17; local205 < local17 + 104; local205++) {
					for (local209 = arg0; arg0 + 1 >= local209 && local209 <= 3; local209++) {
						if (Static123.method5297(local209, arg0, local188, local205)) {
							@Pc(622) Interface11 local622 = (Interface11) Static40.method729(local209, local188, local205);
							if (local622 == null) {
								local622 = (Interface11) Static134.method1950(local209, local188, local205, ou.class);
							}
							if (local622 == null) {
								local622 = (Interface11) Static138.method1998(local209, local188, local205);
							}
							if (local622 == null) {
								local622 = (Interface11) Static351.method4929(local209, local188, local205);
							}
							if (local622 != null) {
								@Pc(663) Class71 local663 = Static2.aClass74_13.method1683(local622.method5648());
								if (!local663.aBoolean161 || Static165.aBoolean225) {
									local276 = local663.anInt2201;
									if (local663.anIntArray138 != null) {
										for (local280 = 0; local280 < local663.anIntArray138.length; local280++) {
											if (local663.anIntArray138[local280] != -1) {
												@Pc(693) Class71 local693 = Static2.aClass74_13.method1683(local663.anIntArray138[local280]);
												if (local693.anInt2201 >= 0) {
													local276 = local693.anInt2201;
												}
											}
										}
									}
									if (local276 >= 0) {
										@Pc(719) boolean local719 = false;
										if (local276 >= 0) {
											@Pc(729) Class25 local729 = Static236.aClass198_3.method4491(local276);
											if (local729 != null && local729.aBoolean43) {
												local719 = true;
											}
										}
										local299 = local188;
										@Pc(740) int local740 = local205;
										if (local719) {
											@Pc(747) int[][] local747 = Static395.aClass268Array1[local209].anIntArrayArray66;
											@Pc(752) int local752 = Static395.aClass268Array1[local209].anInt7539;
											@Pc(757) int local757 = Static395.aClass268Array1[local209].anInt7518;
											for (@Pc(759) int local759 = 0; local759 < 10; local759++) {
												@Pc(766) int local766 = (int) (Math.random() * 4.0D);
												if (local766 == 0 && local299 > local11 && local299 > local188 - 3 && (local747[local299 - local752 - 1][local740 - local757] & 0x2C0108) == 0) {
													local299--;
												}
												if (local766 == 1 && local299 < local11 + 104 - 1 && local188 + 3 > local299 && (local747[local299 + 1 - local752][local740 - local757] & 0x2C0180) == 0) {
													local299++;
												}
												if (local766 == 2 && local17 < local740 && local205 - 3 < local740 && (local747[local299 - local752][local740 - local757 - 1] & 0x2C0102) == 0) {
													local740--;
												}
												if (local766 == 3 && local17 + 104 - 1 > local740 && local205 + 3 > local740 && (local747[local299 - local752][local740 + 1 - local757] & 0x2C0120) == 0) {
													local740++;
												}
											}
										}
										Static277.anIntArray441[Static202.anInt3890] = local663.anInt2158;
										Static421.anIntArray626[Static202.anInt3890] = local299;
										Static272.anIntArray437[Static202.anInt3890] = local740;
										Static202.anInt3890++;
									}
								}
							}
						}
					}
				}
			}
			if (Static406.aClass257_3 != null) {
				Static430.aClass166_284.anInt4829 = 1;
				Static236.aClass198_3.method4493(1024, 64);
				for (local205 = 0; local205 < Static406.aClass257_3.anInt7167; local205++) {
					local209 = Static406.aClass257_3.anIntArray631[local205];
					if (Static375.aClass6_Sub2_Sub1_Sub1_3.aByte86 == local209 >> 28) {
						local213 = (local209 >> 14 & 0x3FFF) - Static381.anInt6688;
						local270 = (local209 & 0x3FFF) - Static285.anInt5187;
						if (local213 >= 0 && Static126.anInt2569 > local213 && local270 >= 0 && local270 < Static190.anInt3697) {
							Static87.aClass258_15.method5526(new Class4_Sub15(local205));
						} else {
							@Pc(1022) Class25 local1022 = Static236.aClass198_3.method4491(Static406.aClass257_3.anIntArray632[local205]);
							if (local1022.anIntArray71 != null && local213 + local1022.anInt851 >= 0 && Static126.anInt2569 > local213 + local1022.anInt848 && local270 + local1022.anInt845 >= 0 && local1022.anInt841 + local270 < Static190.anInt3697) {
								Static87.aClass258_15.method5526(new Class4_Sub15(local205));
							}
						}
					}
				}
				Static236.aClass198_3.method4493(128, 64);
				Static430.aClass166_284.anInt4829 = 2;
				Static430.aClass166_284.method3671();
			}
		}
		return true;
	}
}
