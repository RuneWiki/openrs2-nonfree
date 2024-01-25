import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_88 = new Class216(22, 7);

	@OriginalMember(owner = "client!ku", name = "e", descriptor = "[I")
	public static final int[] anIntArray403 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!ku", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString56 = null;

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(II[Lclient!kq;)V")
	public static void method4459(@OriginalArg(0) int arg0, @OriginalArg(2) Class199[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(17) Class199 local17 = arg1[local11];
			if (local17 != null && local17.anInt4982 == arg0 && !Static75.method1611(local17)) {
				if (local17.anInt4966 == 0) {
					method4459(local17.anInt5041, arg1);
					if (local17.aClass199Array1 != null) {
						method4459(local17.anInt5041, local17.aClass199Array1);
					}
					@Pc(51) Class4_Sub28 local51 = (Class4_Sub28) Static242.aClass66_17.method1994((long) local17.anInt5041);
					if (local51 != null) {
						Static245.method6855(local51.anInt4697);
					}
				}
				if (local17.anInt4966 == 6 && local17.anInt4948 != -1) {
					@Pc(71) Class124 local71 = Static99.aClass2_1.method22(local17.anInt4948);
					if (local71 != null) {
						local17.anInt4960 += Static88.anInt1794;
						@Pc(82) int local82 = local17.anInt4985;
						while (local17.anInt4960 > local71.anIntArray221[local17.anInt4985]) {
							local17.anInt4960 -= local71.anIntArray221[local17.anInt4985];
							local17.anInt4985++;
							if (local71.anIntArray224.length <= local17.anInt4985) {
								local17.anInt4985 -= local71.anInt3035;
								if (local17.anInt4985 < 0 || local71.anIntArray224.length <= local17.anInt4985) {
									local17.anInt4985 = 0;
								}
							}
							local17.anInt5014 = local17.anInt4985 + 1;
							if (local71.anIntArray224.length <= local17.anInt5014) {
								local17.anInt5014 -= local71.anInt3035;
								if (local17.anInt5014 < 0 || local17.anInt5014 >= local71.anIntArray224.length) {
									local17.anInt5014 = -1;
								}
							}
							Static331.method4565(local17);
						}
						if (local82 != local17.anInt4985) {
							Static122.method2185(local17.anInt4985, local71);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IILclient!ha;)Z")
	public static boolean method4460(@OriginalArg(0) int arg0, @OriginalArg(2) Class33 arg1) {
		@Pc(11) int local11 = (Static224.anInt3557 - 104) / 2;
		@Pc(17) int local17 = (Static267.anInt4309 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg0; local29 <= 3; local29++) {
					if (Static260.method7101(local25, local29, arg0, local21)) {
						local40 = local29;
						if (Static547.method7286(local21, local25)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static284.method4099(local25, local21, local40);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(82) int[] local82 = new int[262144];
		for (local29 = 0; local29 < local82.length; local29++) {
			local82[local29] = -16777216;
		}
		Static307.aClass17_68 = arg1.method8128(local82, 512, 512, 512);
		Static606.method7955();
		local40 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF000000;
		@Pc(155) int local155 = ((int) (Math.random() * 20.0D) + 228 | 0x7B54FF00) << 16;
		@Pc(174) int local174 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
		@Pc(186) boolean[][] local186 = new boolean[Static291.anInt4607 + 1 + 2][Static291.anInt4607 + 1 + 2];
		@Pc(192) int local192;
		@Pc(196) int local196;
		@Pc(198) int local198;
		@Pc(200) int local200;
		@Pc(206) int local206;
		@Pc(213) int local213;
		@Pc(224) int local224;
		@Pc(250) int local250;
		@Pc(254) int local254;
		@Pc(307) int local307;
		@Pc(314) int local314;
		@Pc(318) int local318;
		@Pc(333) int local333;
		for (@Pc(188) int local188 = local11; local188 < local11 + 104; local188 += Static291.anInt4607) {
			for (local192 = local17; local192 < local17 + 104; local192 += Static291.anInt4607) {
				local196 = 0;
				local198 = 0;
				local200 = local188;
				if (local188 > 0) {
					local200 = local188 - 1;
					local196 += 4;
				}
				local206 = local192;
				if (local192 > 0) {
					local206 = local192 - 1;
				}
				local213 = Static291.anInt4607 + local188;
				if (local213 < 104) {
					local213++;
				}
				local224 = local192 + Static291.anInt4607;
				if (local224 < 104) {
					local198 += 4;
					local224++;
				}
				arg1.KA(0, 0, Static291.anInt4607 * 4 + local196, Static291.anInt4607 * 4 + local198);
				arg1.GA(-16777216);
				@Pc(258) int local258;
				for (local250 = arg0; local250 <= 3; local250++) {
					for (local254 = 0; local254 <= Static291.anInt4607; local254++) {
						for (local258 = 0; local258 <= Static291.anInt4607; local258++) {
							local186[local254][local258] = Static260.method7101(local206 + local258, local250, arg0, local254 + local200);
						}
					}
					Static655.aClass42Array5[local250].method7454(local200, local206, local213, local224, local186);
					if (!Static471.aBoolean587) {
						for (local258 = -4; local258 < Static291.anInt4607; local258++) {
							for (local307 = -4; local307 < Static291.anInt4607; local307++) {
								local314 = local188 + local258;
								local318 = local307 + local192;
								if (local314 >= local11 && local17 <= local318 && Static260.method7101(local318, local250, arg0, local314)) {
									local333 = local250;
									if (Static547.method7286(local314, local318)) {
										local333 = local250 - 1;
									}
									if (local333 >= 0) {
										Static134.method2410(local333, arg1, local40, local258 * 4 + local196, local318, (Static291.anInt4607 - local307) * 4 + local198 - 4, local314, local155);
									}
								}
							}
						}
					}
				}
				if (Static471.aBoolean587) {
					@Pc(389) Class389 local389 = Static263.aClass389Array1[arg0];
					for (local258 = 0; local258 < Static291.anInt4607; local258++) {
						for (local307 = 0; local307 < Static291.anInt4607; local307++) {
							local314 = local258 + local188;
							local318 = local192 + local307;
							local333 = local389.anIntArrayArray64[local314 - local389.anInt10446][local318 - local389.anInt10431];
							if ((local333 & 0x40240000) != 0) {
								arg1.method8103(local258 * 4 + local196, (-local307 + Static291.anInt4607) * 4 + local198 - 4, -1713569622, 4, 4);
							} else if ((local333 & 0x800000) != 0) {
								arg1.method8082(local258 * 4 + local196, (-local307 + Static291.anInt4607) * 4 + local198 + -4, -1713569622, 4);
							} else if ((local333 & 0x2000000) != 0) {
								arg1.method8097(-1713569622, local196 + local258 * 4 + 3, (Static291.anInt4607 + -local307) * 4 + -4 + local198, 4);
							} else if ((local333 & 0x8000000) != 0) {
								arg1.method8082(local258 * 4 + local196, (Static291.anInt4607 - local307) * 4 + 3 + local198 + -4, -1713569622, 4);
							} else if ((local333 & 0x20000000) != 0) {
								arg1.method8097(-1713569622, local196 + local258 * 4, (Static291.anInt4607 + -local307) * 4 + -4 + local198, 4);
							}
						}
					}
				}
				arg1.aa(local196, local198, Static291.anInt4607 * 4, Static291.anInt4607 * 4, local174, 2);
				Static307.aClass17_68.method5269((local188 - local11) * 4 + 48, -(Static291.anInt4607 * 4) + -((-local17 + local192) * 4) + 464, Static291.anInt4607 * 4, Static291.anInt4607 * 4, local196, local198);
			}
		}
		arg1.la();
		arg1.GA(-16777215);
		Static34.method8332();
		Static612.anInt9404 = 0;
		Static148.aClass163_17.method3643();
		if (!Static471.aBoolean587) {
			for (local192 = local11; local192 < local11 + 104; local192++) {
				for (local196 = local17; local196 < local17 + 104; local196++) {
					for (local198 = arg0; local198 <= arg0 + 1 && local198 <= 3; local198++) {
						if (Static260.method7101(local196, local198, arg0, local192)) {
							@Pc(675) Interface20 local675 = (Interface20) Static191.method2972(local198, local192, local196);
							if (local675 == null) {
								local675 = (Interface20) Static130.method2321(local198, local192, local196, qb.class);
							}
							if (local675 == null) {
								local675 = (Interface20) Static572.method7588(local198, local192, local196);
							}
							if (local675 == null) {
								local675 = (Interface20) Static273.method3954(local198, local192, local196);
							}
							if (local675 != null) {
								@Pc(716) Class342 local716 = Static441.aClass74_169.method2075(local675.method7087());
								if (!local716.aBoolean686 || Static307.aBoolean718) {
									local213 = local716.anInt8712;
									if (local716.anIntArray620 != null) {
										for (local224 = 0; local224 < local716.anIntArray620.length; local224++) {
											if (local716.anIntArray620[local224] != -1) {
												@Pc(745) Class342 local745 = Static441.aClass74_169.method2075(local716.anIntArray620[local224]);
												if (local745.anInt8712 >= 0) {
													local213 = local745.anInt8712;
												}
											}
										}
									}
									if (local213 >= 0) {
										@Pc(771) boolean local771 = false;
										if (local213 >= 0) {
											@Pc(778) Class259 local778 = Static526.aClass59_4.method1798(local213);
											if (local778 != null && local778.aBoolean516) {
												local771 = true;
											}
										}
										local250 = local192;
										local254 = local196;
										if (local771) {
											@Pc(796) int[][] local796 = Static263.aClass389Array1[local198].anIntArrayArray64;
											local307 = Static263.aClass389Array1[local198].anInt10446;
											local314 = Static263.aClass389Array1[local198].anInt10431;
											for (local318 = 0; local318 < 10; local318++) {
												local333 = (int) (Math.random() * 4.0D);
												if (local333 == 0 && local11 < local250 && local250 > local192 - 3 && (local796[local250 - local307 - 1][local254 - local314] & 0x2C0108) == 0) {
													local250--;
												}
												if (local333 == 1 && local11 + 104 - 1 > local250 && local250 < local192 + 3 && (local796[local250 + 1 - local307][local254 - local314] & 0x2C0180) == 0) {
													local250++;
												}
												if (local333 == 2 && local254 > local17 && local254 > local196 - 3 && (local796[local250 - local307][local254 - local314 - 1] & 0x2C0102) == 0) {
													local254--;
												}
												if (local333 == 3 && local17 + 104 - 1 > local254 && local196 + 3 > local254 && (local796[local250 - local307][local254 + 1 - local314] & 0x2C0120) == 0) {
													local254++;
												}
											}
										}
										Static573.anIntArray634[Static612.anInt9404] = local716.anInt8738;
										Static59.anIntArray85[Static612.anInt9404] = local250;
										Static91.anIntArray117[Static612.anInt9404] = local254;
										Static612.anInt9404++;
									}
								}
							}
						}
					}
				}
			}
			if (Static545.aClass225_3 != null) {
				Static674.aClass34_134.anInt1211 = 1;
				Static526.aClass59_4.method1797(1024, 64);
				for (local196 = 0; local196 < Static545.aClass225_3.anInt5491; local196++) {
					local198 = Static545.aClass225_3.anIntArray422[local196];
					if (Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aByte141 == local198 >> 28) {
						local200 = (local198 >> 14 & 0x3FFF) - Static445.anInt6949;
						local206 = (local198 & 0x3FFF) - Static321.anInt5000;
						if (local200 >= 0 && Static224.anInt3557 > local200 && local206 >= 0 && Static267.anInt4309 > local206) {
							Static148.aClass163_17.method3646(new Class4_Sub24(local196));
						} else {
							@Pc(1098) Class259 local1098 = Static526.aClass59_4.method1798(Static545.aClass225_3.anIntArray423[local196]);
							if (local1098.anIntArray462 != null && local200 + local1098.anInt6658 >= 0 && Static224.anInt3557 > local200 + local1098.anInt6666 && local206 + local1098.anInt6676 >= 0 && Static267.anInt4309 > local1098.anInt6660 + local206) {
								Static148.aClass163_17.method3646(new Class4_Sub24(local196));
							}
						}
					}
				}
				Static526.aClass59_4.method1797(128, 64);
				Static674.aClass34_134.anInt1211 = 2;
				Static674.aClass34_134.method1231();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)I")
	public static int method4462() {
		if (Static407.aFrame5 == null) {
			return Static420.aBoolean509 ? 2 : 1;
		} else {
			return 3;
		}
	}
}
