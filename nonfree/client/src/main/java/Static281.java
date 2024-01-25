import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!le", name = "r", descriptor = "Lclient!cv;")
	public static final Class59 aClass59_2 = new Class59();

	@OriginalMember(owner = "client!le", name = "U", descriptor = "Z")
	public static boolean aBoolean287 = true;

	@OriginalMember(owner = "client!le", name = "ib", descriptor = "[I")
	public static final int[] anIntArray451 = new int[50];

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZLclient!oa;IB)Lclient!ta;")
	public static Class56 method4010(@OriginalArg(1) Class121 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class191 local9 = Static551.method7586(arg0, arg1);
		return local9 == null ? null : local9.aClass56_3;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIII)V")
	public static void method4012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class9 local7 = Static208.aClass9ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class29_Sub1 local13 = local7.aClass29_Sub1_2;
		@Pc(16) Class29_Sub1 local16 = local7.aClass29_Sub1_1;
		if (local13 != null) {
			local13.anInt7304 = local13.anInt7304 * arg3 / (0x10 << Static188.anInt3275 - 7);
			local13.anInt7312 = local13.anInt7312 * arg3 / (0x10 << Static188.anInt3275 - 7);
		}
		if (local16 != null) {
			local16.anInt7304 = local16.anInt7304 * arg3 / (0x10 << Static188.anInt3275 - 7);
			local16.anInt7312 = local16.anInt7312 * arg3 / (0x10 << Static188.anInt3275 - 7);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIII)V")
	public static void method4013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(13) int local13 = arg2 * arg2;
		@Pc(17) int local17 = arg4 * arg4;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg4 << 1;
		@Pc(38) int local38 = local21 + local13 * (1 - local29);
		@Pc(47) int local47 = local17 - local25 * (local29 - 1);
		@Pc(51) int local51 = local13 << 2;
		@Pc(60) int local60 = local17 << 2;
		@Pc(68) int local68 = local21 * 3;
		@Pc(76) int local76 = local25 * ((arg4 << 1) - 3);
		@Pc(82) int local82 = local60;
		@Pc(88) int local88 = (arg4 - 1) * local51;
		@Pc(102) int local102;
		@Pc(111) int local111;
		if (Static134.anInt2364 <= arg1 && Static60.anInt971 >= arg1) {
			local102 = Static112.method1759(arg2 + arg3, Static235.anInt3970, Static151.anInt2683);
			local111 = Static112.method1759(arg3 - arg2, Static235.anInt3970, Static151.anInt2683);
			Static455.method6536(local102, local111, arg0, Static503.anIntArrayArray12[arg1]);
		}
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local38 += local68;
					local47 += local82;
					local7++;
					local82 += local60;
					local68 += local60;
				}
			}
			if (local47 < 0) {
				local47 += local82;
				local38 += local68;
				local7++;
				local68 += local60;
				local82 += local60;
			}
			local47 += -local76;
			local38 += -local88;
			local76 -= local51;
			local88 -= local51;
			local9--;
			local102 = arg1 - local9;
			local111 = arg1 + local9;
			if (local111 >= Static134.anInt2364 && local102 <= Static60.anInt971) {
				@Pc(212) int local212 = Static112.method1759(arg3 + local7, Static235.anInt3970, Static151.anInt2683);
				@Pc(221) int local221 = Static112.method1759(arg3 - local7, Static235.anInt3970, Static151.anInt2683);
				if (local102 >= Static134.anInt2364) {
					Static455.method6536(local212, local221, arg0, Static503.anIntArrayArray12[local102]);
				}
				if (Static60.anInt971 >= local111) {
					Static455.method6536(local212, local221, arg0, Static503.anIntArrayArray12[local111]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ILclient!oa;B)Z")
	public static boolean method4014(@OriginalArg(0) int arg0, @OriginalArg(1) Class121 arg1) {
		@Pc(11) int local11 = (Static301.anInt4912 - 104) / 2;
		@Pc(17) int local17 = (Static473.anInt7969 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg0; local29 <= 3; local29++) {
					if (Static355.method5298(local29, local21, local25, arg0)) {
						local40 = local29;
						if (Static26.method401(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static10.method2062(local40, local25, local21);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(81) int[] local81 = new int[262144];
		for (local29 = 0; local29 < local81.length; local29++) {
			local81[local29] = -16777216;
		}
		Static345.aClass4_19 = arg1.method7110(local81, 512, 512, 512);
		Static422.method6198();
		local40 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + 238 - 10 | 0xFF000000;
		@Pc(153) int local153 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0x94F1FF00) << 16;
		@Pc(172) int local172 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
		@Pc(185) boolean[][] local185 = new boolean[Static348.anInt8717 + 1][Static348.anInt8717 + 1];
		@Pc(191) int local191;
		@Pc(195) int local195;
		@Pc(197) int local197;
		@Pc(199) int local199;
		@Pc(208) int local208;
		@Pc(218) int local218;
		@Pc(229) int local229;
		@Pc(254) int local254;
		@Pc(258) int local258;
		@Pc(315) int local315;
		@Pc(322) int local322;
		@Pc(327) int local327;
		@Pc(344) int local344;
		for (@Pc(187) int local187 = local11; local187 < local11 + 104; local187 += Static348.anInt8717) {
			for (local191 = local17; local191 < local17 + 104; local191 += Static348.anInt8717) {
				local195 = 0;
				local197 = 0;
				local199 = local187;
				if (local187 > 0) {
					local199 = local187 - 1;
					local195 += 4;
				}
				local208 = local191;
				if (local191 > 0) {
					local208 = local191 - 1;
				}
				local218 = Static348.anInt8717 + local187;
				if (local218 < 104) {
					local218++;
				}
				local229 = local191 + Static348.anInt8717;
				if (local229 < 104) {
					local197 += 4;
					local229++;
				}
				arg1.ca(0, 0, local195 + Static348.anInt8717 * 4, Static348.anInt8717 * 4 + local197);
				arg1.D(-16777216);
				@Pc(262) int local262;
				for (local254 = arg0; local254 <= 3; local254++) {
					for (local258 = 0; local258 <= Static348.anInt8717; local258++) {
						for (local262 = 0; local262 <= Static348.anInt8717; local262++) {
							local185[local258][local262] = Static355.method5298(local254, local199 + local258, local208 - -local262, arg0);
						}
					}
					Static34.aClass60Array10[local254].method7894(local199, local208, local218, local229, local185);
					if (!Static543.aBoolean642) {
						for (local262 = -4; local262 < Static348.anInt8717; local262++) {
							for (local315 = -4; local315 < Static348.anInt8717; local315++) {
								local322 = local187 + local262;
								local327 = local191 + local315;
								if (local322 >= local11 && local17 <= local327 && Static355.method5298(local254, local322, local327, arg0)) {
									local344 = local254;
									if (Static26.method401(local327, local322)) {
										local344 = local254 - 1;
									}
									if (local344 >= 0) {
										Static459.method6467(local344, local195 + local262 * 4, local40, local327, (Static348.anInt8717 - local315) * 4 + local197 - 4, arg1, local322, local153);
									}
								}
							}
						}
					}
				}
				if (Static543.aBoolean642) {
					@Pc(406) Class295 local406 = Static296.aClass295Array3[arg0];
					for (local262 = 0; local262 < Static348.anInt8717; local262++) {
						for (local315 = 0; local315 < Static348.anInt8717; local315++) {
							local322 = local187 + local262;
							local327 = local191 + local315;
							local344 = local406.anIntArrayArray80[local322 - local406.anInt7938][local327 - local406.anInt7934];
							if ((local344 & 0x40240000) != 0) {
								arg1.method7109(local197 + (Static348.anInt8717 - local315) * 4 - 4, 4, 4, local262 * 4 + local195, -1713569622);
							} else if ((local344 & 0x800000) != 0) {
								arg1.method7138(4, local197 + (Static348.anInt8717 - local315) * 4 - 4, -1713569622, local262 * 4 + local195);
							} else if ((local344 & 0x2000000) != 0) {
								arg1.method7140(local195 + local262 * 4 + 3, local197 + -4 + (Static348.anInt8717 + -local315) * 4, -1713569622, 4);
							} else if ((local344 & 0x8000000) != 0) {
								arg1.method7138(4, local197 + (-local315 + Static348.anInt8717) * 4 + 3 - 4, -1713569622, local262 * 4 + local195);
							} else if ((local344 & 0x20000000) != 0) {
								arg1.method7140(local262 * 4 + local195, (Static348.anInt8717 - local315) * 4 + -4 + local197, -1713569622, 4);
							}
						}
					}
				}
				arg1.C(local195, local197, Static348.anInt8717 * 4, Static348.anInt8717 * 4, local172, 2);
				Static345.aClass4_19.GA((local187 - local11) * 4 + 48, 464 - ((-local17 + local191) * 4 + Static348.anInt8717 * 4), Static348.anInt8717 * 4, Static348.anInt8717 * 4, local195, local197);
			}
		}
		arg1.F();
		arg1.D(-16777215);
		Static260.method3643();
		Static348.anInt8718 = 0;
		Static369.aClass275_133.method6357();
		if (!Static543.aBoolean642) {
			for (local191 = local11; local191 < local11 + 104; local191++) {
				for (local195 = local17; local195 < local17 + 104; local195++) {
					for (local197 = arg0; arg0 + 1 >= local197 && local197 <= 3; local197++) {
						if (Static355.method5298(local197, local191, local195, arg0)) {
							@Pc(699) Interface6 local699 = (Interface6) Static315.method4904(local197, local191, local195);
							if (local699 == null) {
								local699 = (Interface6) Static134.method1995(local197, local191, local195, dda.class);
							}
							if (local699 == null) {
								local699 = (Interface6) Static120.method1814(local197, local191, local195);
							}
							if (local699 == null) {
								local699 = (Interface6) Static178.method5953(local197, local191, local195);
							}
							if (local699 != null) {
								@Pc(740) Class313 local740 = Static260.aClass100_1.method2008(local699.method7555());
								if (!local740.aBoolean589 || Static296.aBoolean667) {
									local218 = local740.anInt8455;
									if (local740.anIntArray650 != null) {
										for (local229 = 0; local229 < local740.anIntArray650.length; local229++) {
											if (local740.anIntArray650[local229] != -1) {
												@Pc(769) Class313 local769 = Static260.aClass100_1.method2008(local740.anIntArray650[local229]);
												if (local769.anInt8455 >= 0) {
													local218 = local769.anInt8455;
												}
											}
										}
									}
									if (local218 >= 0) {
										@Pc(792) boolean local792 = false;
										if (local218 >= 0) {
											@Pc(802) Class179 local802 = Static474.aClass276_4.method6396(local218);
											if (local802 != null && local802.aBoolean283) {
												local792 = true;
											}
										}
										local254 = local191;
										local258 = local195;
										if (local792) {
											@Pc(820) int[][] local820 = Static296.aClass295Array3[local197].anIntArrayArray80;
											local315 = Static296.aClass295Array3[local197].anInt7938;
											local322 = Static296.aClass295Array3[local197].anInt7934;
											for (local327 = 0; local327 < 10; local327++) {
												local344 = (int) (Math.random() * 4.0D);
												if (local344 == 0 && local11 < local254 && local191 - 3 < local254 && (local820[local254 - local315 - 1][local258 - local322] & 0x2C0108) == 0) {
													local254--;
												}
												if (local344 == 1 && local254 < local11 + 104 - 1 && local254 < local191 + 3 && (local820[local254 + 1 - local315][local258 - local322] & 0x2C0180) == 0) {
													local254++;
												}
												if (local344 == 2 && local17 < local258 && local258 > local195 - 3 && (local820[local254 - local315][local258 - local322 - 1] & 0x2C0102) == 0) {
													local258--;
												}
												if (local344 == 3 && local258 < local17 + 104 - 1 && local195 + 3 > local258 && (local820[local254 - local315][local258 + 1 - local322] & 0x2C0120) == 0) {
													local258++;
												}
											}
										}
										Static232.anIntArray418[Static348.anInt8718] = local740.anInt8480;
										Static163.anIntArray328[Static348.anInt8718] = local254;
										Static203.anIntArray394[Static348.anInt8718] = local258;
										Static348.anInt8718++;
									}
								}
							}
						}
					}
				}
			}
			if (Static517.aClass252_6 != null) {
				Static28.aClass251_7.anInt6998 = 1;
				Static474.aClass276_4.method6397(1024, 64);
				for (local195 = 0; local195 < Static517.aClass252_6.anInt7034; local195++) {
					local197 = Static517.aClass252_6.anIntArray566[local195];
					if (Static426.aClass29_Sub2_Sub1_Sub2_2.aByte103 == local197 >> 28) {
						local199 = (local197 >> 14 & 0x3FFF) - Static218.anInt3718;
						local208 = (local197 & 0x3FFF) - Static167.anInt3048;
						if (local199 >= 0 && Static301.anInt4912 > local199 && local208 >= 0 && local208 < Static473.anInt7969) {
							Static369.aClass275_133.method6370(new Class6_Sub9(local195));
						} else {
							@Pc(1117) Class179 local1117 = Static474.aClass276_4.method6396(Static517.aClass252_6.anIntArray567[local195]);
							if (local1117.anIntArray449 != null && local1117.anInt4588 + local199 >= 0 && Static301.anInt4912 > local1117.anInt4598 + local199 && local1117.anInt4593 + local208 >= 0 && Static473.anInt7969 > local1117.anInt4597 + local208) {
								Static369.aClass275_133.method6370(new Class6_Sub9(local195));
							}
						}
					}
				}
				Static474.aClass276_4.method6397(128, 64);
				Static28.aClass251_7.anInt6998 = 2;
				Static28.aClass251_7.method5833();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(B)V")
	public static void method4015() {
		if (Static154.anInt2734 == 0) {
			return;
		}
		try {
			if (++Static215.anInt3681 > 2000) {
				if (Static225.aClass71_1 != null) {
					Static225.aClass71_1.method5970();
					Static225.aClass71_1 = null;
				}
				if (Static225.anInt3804 >= 2) {
					Static154.anInt2734 = 0;
					Static102.anInt1886 = -5;
					return;
				}
				Static343.aClass147_3.method3179();
				Static225.anInt3804++;
				Static215.anInt3681 = 0;
				Static154.anInt2734 = 1;
			}
			if (Static154.anInt2734 == 1) {
				Static122.aClass278_5 = Static343.aClass147_3.method3182(Static152.aClass57_4);
				Static154.anInt2734 = 2;
			}
			if (Static154.anInt2734 == 2) {
				if (Static122.aClass278_5.anInt7757 == 2) {
					throw new IOException();
				}
				if (Static122.aClass278_5.anInt7757 != 1) {
					return;
				}
				Static225.aClass71_1 = Static26.method403((Socket) Static122.aClass278_5.anObject24);
				Static122.aClass278_5 = null;
				Static225.aClass71_1.method5968(Static218.aClass6_Sub14_Sub2_1.aByteArray88, Static218.aClass6_Sub14_Sub2_1.anInt7244);
				Static154.anInt2734 = 4;
			}
			@Pc(138) int local138;
			if (Static154.anInt2734 == 4) {
				if (!Static225.aClass71_1.method5964(1)) {
					return;
				}
				Static225.aClass71_1.method5963(Static420.aClass6_Sub14_Sub2_2.aByteArray88, 1, 0);
				local138 = Static420.aClass6_Sub14_Sub2_2.aByteArray88[0] & 0xFF;
				if (local138 != 21) {
					Static154.anInt2734 = 0;
					Static102.anInt1886 = local138;
					Static225.aClass71_1.method5970();
					Static225.aClass71_1 = null;
					return;
				}
				Static154.anInt2734 = 5;
			}
			if (Static154.anInt2734 == 5) {
				if (!Static225.aClass71_1.method5964(1)) {
					return;
				}
				Static225.aClass71_1.method5963(Static420.aClass6_Sub14_Sub2_2.aByteArray88, 1, 0);
				Static154.anInt2734 = 6;
				Static466.aStringArray27 = new String[Static420.aClass6_Sub14_Sub2_2.aByteArray88[0] & 0xFF];
			}
			if (Static154.anInt2734 == 6 && Static225.aClass71_1.method5964(Static466.aStringArray27.length * 8)) {
				Static420.aClass6_Sub14_Sub2_2.anInt7244 = 0;
				Static225.aClass71_1.method5963(Static420.aClass6_Sub14_Sub2_2.aByteArray88, Static466.aStringArray27.length * 8, 0);
				for (local138 = 0; local138 < Static466.aStringArray27.length; local138++) {
					Static466.aStringArray27[local138] = Static88.method1427(Static420.aClass6_Sub14_Sub2_2.method6033());
				}
				Static154.anInt2734 = 0;
				Static102.anInt1886 = 21;
				Static225.aClass71_1.method5970();
				Static225.aClass71_1 = null;
			}
		} catch (@Pc(244) IOException local244) {
			if (Static225.aClass71_1 != null) {
				Static225.aClass71_1.method5970();
				Static225.aClass71_1 = null;
			}
			if (Static225.anInt3804 < 2) {
				Static343.aClass147_3.method3179();
				Static225.anInt3804++;
				Static215.anInt3681 = 0;
				Static154.anInt2734 = 1;
			} else {
				Static154.anInt2734 = 0;
				Static102.anInt1886 = -4;
			}
		}
	}
}
