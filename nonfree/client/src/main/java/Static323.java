import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!maa", name = "ab", descriptor = "I")
	public static int anInt5922;

	@OriginalMember(owner = "client!maa", name = "U", descriptor = "Lclient!os;")
	public static final Class245 aClass245_13 = new Class245(1);

	@OriginalMember(owner = "client!maa", name = "bb", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_98 = new Class287(15, 3);

	@OriginalMember(owner = "client!maa", name = "cb", descriptor = "Z")
	public static boolean aBoolean412 = false;

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(Lclient!mg;I)I")
	public static int method4780(@OriginalArg(0) Class204 arg0) {
		if (Static331.aClass204_10 == arg0) {
			return 5120;
		} else if (Static331.aClass204_11 == arg0) {
			return 5122;
		} else if (Static331.aClass204_12 == arg0) {
			return 5124;
		} else if (Static331.aClass204_13 == arg0) {
			return 5121;
		} else if (Static331.aClass204_14 == arg0) {
			return 5123;
		} else if (arg0 == Static331.aClass204_15) {
			return 5125;
		} else if (Static331.aClass204_16 == arg0) {
			return 5131;
		} else if (Static331.aClass204_17 == arg0) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(IILclient!r;)Z")
	public static boolean method4781(@OriginalArg(0) int arg0, @OriginalArg(2) Class31 arg1) {
		@Pc(11) int local11 = (Static345.anInt6228 - 104) / 2;
		@Pc(17) int local17 = (Static535.anInt9341 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg0; local29 <= 3; local29++) {
					if (Static321.method4740(local25, arg0, local29, local21)) {
						local40 = local29;
						if (Static269.method4098(local21, local25)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static33.method485(local25, local21, local40);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(86) int[] local86 = new int[262144];
		for (local29 = 0; local29 < local86.length; local29++) {
			local86[local29] = -16777216;
		}
		Static544.aClass73_39 = arg1.method8033(local86, 512, 512, 512);
		Static142.method2744();
		local40 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF000000;
		@Pc(154) int local154 = ((int) (Math.random() * 20.0D) + 228 | 0x3D9BFF00) << 16;
		@Pc(173) int local173 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
		@Pc(183) boolean[][] local183 = new boolean[Static396.anInt6995 + 2 + 1][Static396.anInt6995 + 3];
		@Pc(189) int local189;
		@Pc(193) int local193;
		@Pc(195) int local195;
		@Pc(197) int local197;
		@Pc(206) int local206;
		@Pc(213) int local213;
		@Pc(224) int local224;
		@Pc(250) int local250;
		@Pc(254) int local254;
		@Pc(307) int local307;
		@Pc(313) int local313;
		@Pc(317) int local317;
		@Pc(336) int local336;
		for (@Pc(185) int local185 = local11; local185 < local11 + 104; local185 += Static396.anInt6995) {
			for (local189 = local17; local189 < local17 + 104; local189 += Static396.anInt6995) {
				local193 = 0;
				local195 = 0;
				local197 = local185;
				if (local185 > 0) {
					local197 = local185 - 1;
					local193 += 4;
				}
				local206 = local189;
				if (local189 > 0) {
					local206 = local189 - 1;
				}
				local213 = local185 + Static396.anInt6995;
				if (local213 < 104) {
					local213++;
				}
				local224 = local189 + Static396.anInt6995;
				if (local224 < 104) {
					local224++;
					local195 += 4;
				}
				arg1.da(0, 0, Static396.anInt6995 * 4 + local193, Static396.anInt6995 * 4 + local195);
				arg1.ja(-16777216);
				@Pc(258) int local258;
				for (local250 = arg0; local250 <= 3; local250++) {
					for (local254 = 0; local254 <= Static396.anInt6995; local254++) {
						for (local258 = 0; local258 <= Static396.anInt6995; local258++) {
							local183[local254][local258] = Static321.method4740(local258 + local206, arg0, local250, local197 + local254);
						}
					}
					Static420.aClass127Array6[local250].method7865(local197, local206, local213, local224, local183);
					if (!Static83.aBoolean166) {
						for (local258 = -4; local258 < Static396.anInt6995; local258++) {
							for (local307 = -4; local307 < Static396.anInt6995; local307++) {
								local313 = local185 + local258;
								local317 = local307 + local189;
								if (local313 >= local11 && local317 >= local17 && Static321.method4740(local317, arg0, local250, local313)) {
									local336 = local250;
									if (Static269.method4098(local313, local317)) {
										local336 = local250 - 1;
									}
									if (local336 >= 0) {
										Static292.method4404(local154, local317, local313, local40, arg1, local336, (Static396.anInt6995 - local307) * 4 + local195 - 4, local258 * 4 + local193);
									}
								}
							}
						}
					}
				}
				if (Static83.aBoolean166) {
					@Pc(387) Class220 local387 = Static187.aClass220Array1[arg0];
					for (local258 = 0; local258 < Static396.anInt6995; local258++) {
						for (local307 = 0; local307 < Static396.anInt6995; local307++) {
							local313 = local258 + local185;
							local317 = local189 + local307;
							local336 = local387.anIntArrayArray66[local313 - local387.anInt6298][local317 - local387.anInt6303];
							if ((local336 & 0x40240000) != 0) {
								arg1.method8094((Static396.anInt6995 - local307) * 4 + local195 - 4, local193 + local258 * 4, 4, 4, -1713569622);
							} else if ((local336 & 0x800000) != 0) {
								arg1.method8042(-1713569622, 4, local193 + local258 * 4, (-local307 + Static396.anInt6995) * 4 + local195 + -4);
							} else if ((local336 & 0x2000000) != 0) {
								arg1.method8029(local193 + local258 * 4 + 3, (-local307 + Static396.anInt6995) * 4 + (local195 - 4), 4, -1713569622);
							} else if ((local336 & 0x8000000) != 0) {
								arg1.method8042(-1713569622, 4, local258 * 4 + local193, local195 + 3 - -((-local307 + Static396.anInt6995) * 4) + -4);
							} else if ((local336 & 0x20000000) != 0) {
								arg1.method8029(local193 + local258 * 4, (Static396.anInt6995 + -local307) * 4 + local195 + -4, 4, -1713569622);
							}
						}
					}
				}
				arg1.J(local193, local195, Static396.anInt6995 * 4, Static396.anInt6995 * 4, local173, 2);
				Static544.aClass73_39.da((local185 - local11) * 4 + 48, -((local189 + -local17) * 4) + 464 + -(Static396.anInt6995 * 4), Static396.anInt6995 * 4, Static396.anInt6995 * 4, local193, local195);
			}
		}
		arg1.JA();
		arg1.ja(-16777215);
		Static246.method3899();
		Static544.anInt9502 = 0;
		Static437.aClass244_57.method5581();
		if (!Static83.aBoolean166) {
			for (local189 = local11; local189 < local11 + 104; local189++) {
				for (local193 = local17; local193 < local17 + 104; local193++) {
					for (local195 = arg0; local195 <= arg0 + 1 && local195 <= 3; local195++) {
						if (Static321.method4740(local193, arg0, local195, local189)) {
							@Pc(672) Interface14 local672 = (Interface14) Static134.method2611(local195, local189, local193);
							if (local672 == null) {
								local672 = (Interface14) Static13.method122(local195, local189, local193, ofa.class);
							}
							if (local672 == null) {
								local672 = (Interface14) Static597.method8185(local195, local189, local193);
							}
							if (local672 == null) {
								local672 = (Interface14) Static542.method7423(local195, local189, local193);
							}
							if (local672 != null) {
								@Pc(713) Class194 local713 = Static536.aClass146_4.method3721(local672.method4958());
								if (!local713.aBoolean395 || Static150.aBoolean247) {
									local213 = local713.anInt5842;
									if (local713.anIntArray286 != null) {
										for (local224 = 0; local224 < local713.anIntArray286.length; local224++) {
											if (local713.anIntArray286[local224] != -1) {
												@Pc(743) Class194 local743 = Static536.aClass146_4.method3721(local713.anIntArray286[local224]);
												if (local743.anInt5842 >= 0) {
													local213 = local743.anInt5842;
												}
											}
										}
									}
									if (local213 >= 0) {
										@Pc(769) boolean local769 = false;
										if (local213 >= 0) {
											@Pc(776) Class338 local776 = Static550.aClass189_3.method4642(local213);
											if (local776 != null && local776.aBoolean646) {
												local769 = true;
											}
										}
										local250 = local189;
										local254 = local193;
										if (local769) {
											@Pc(794) int[][] local794 = Static187.aClass220Array1[local195].anIntArrayArray66;
											local307 = Static187.aClass220Array1[local195].anInt6298;
											local313 = Static187.aClass220Array1[local195].anInt6303;
											for (local317 = 0; local317 < 10; local317++) {
												local336 = (int) (Math.random() * 4.0D);
												if (local336 == 0 && local250 > local11 && local189 - 3 < local250 && (local794[local250 - local307 - 1][local254 - local313] & 0x2C0108) == 0) {
													local250--;
												}
												if (local336 == 1 && local11 + 104 - 1 > local250 && local250 < local189 + 3 && (local794[local250 + 1 - local307][local254 - local313] & 0x2C0180) == 0) {
													local250++;
												}
												if (local336 == 2 && local254 > local17 && local254 > local193 - 3 && (local794[local250 - local307][local254 - local313 - 1] & 0x2C0102) == 0) {
													local254--;
												}
												if (local336 == 3 && local17 + 104 - 1 > local254 && local254 < local193 + 3 && (local794[local250 - local307][local254 + 1 - local313] & 0x2C0120) == 0) {
													local254++;
												}
											}
										}
										Static180.anIntArray161[Static544.anInt9502] = local713.anInt5827;
										Static500.anIntArray517[Static544.anInt9502] = local250;
										Static355.anIntArray350[Static544.anInt9502] = local254;
										Static544.anInt9502++;
									}
								}
							}
						}
					}
				}
			}
			if (Static425.aClass57_3 != null) {
				Static347.aClass284_106.anInt8049 = 1;
				Static550.aClass189_3.method4643(1024, 64);
				for (local193 = 0; local193 < Static425.aClass57_3.anInt1840; local193++) {
					local195 = Static425.aClass57_3.anIntArray61[local193];
					if (Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aByte117 == local195 >> 28) {
						local197 = (local195 >> 14 & 0x3FFF) - Static321.anInt5874;
						local206 = (local195 & 0x3FFF) - Static137.anInt3293;
						if (local197 >= 0 && Static345.anInt6228 > local197 && local206 >= 0 && Static535.anInt9341 > local206) {
							Static437.aClass244_57.method5570(new Class3_Sub2(local193));
						} else {
							@Pc(1088) Class338 local1088 = Static550.aClass189_3.method4642(Static425.aClass57_3.anIntArray60[local193]);
							if (local1088.anIntArray561 != null && local1088.anInt9746 + local197 >= 0 && Static345.anInt6228 > local197 + local1088.anInt9745 && local1088.anInt9720 + local206 >= 0 && Static535.anInt9341 > local206 + local1088.anInt9732) {
								Static437.aClass244_57.method5570(new Class3_Sub2(local193));
							}
						}
					}
				}
				Static550.aClass189_3.method4643(128, 64);
				Static347.aClass284_106.anInt8049 = 2;
				Static347.aClass284_106.method6334();
			}
		}
		return true;
	}
}
