import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
	public static int anInt3051;

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1288 = Static59.method1195(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!sd", name = "B", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1297 = Static59.method1195("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1289 = aClass60_1297;

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1290 = Static59.method1195("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1291 = Static59.method1195("leuchten1:");

	@OriginalMember(owner = "client!sd", name = "o", descriptor = "Lclient!ad;")
	public static Class5 aClass5_20 = new Class5();

	@OriginalMember(owner = "client!sd", name = "s", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1292 = Static59.method1195(")2");

	@OriginalMember(owner = "client!sd", name = "t", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1293 = Static59.method1195("::noclip");

	@OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
	public static int anInt3055 = 0;

	@OriginalMember(owner = "client!sd", name = "v", descriptor = "[I")
	public static int[] anIntArray326 = new int[4000];

	@OriginalMember(owner = "client!sd", name = "w", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1294 = Static59.method1195("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!sd", name = "z", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1295 = Static59.method1195("Classic");

	@OriginalMember(owner = "client!sd", name = "A", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1296 = Static59.method1195("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!sd", name = "D", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1298 = aClass60_1290;

	@OriginalMember(owner = "client!sd", name = "E", descriptor = "I")
	public static int anInt3059 = 0;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!jb;BI)Lclient!r;")
	public static Class3_Sub1_Sub2_Sub4 method2035(@OriginalArg(0) Class25 arg0, @OriginalArg(2) int arg1) {
		return Static24.method596(arg0, arg1) ? Static38.method872() : null;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)Z")
	public static boolean method2036(@OriginalArg(0) int arg0) {
		if (!Static21.method563(arg0)) {
			return false;
		}
		@Pc(15) Class3_Sub15[] local15 = Static120.aClass3_Sub15ArrayArray1[arg0];
		@Pc(22) boolean local22 = false;
		for (@Pc(24) int local24 = 0; local24 < local15.length; local24++) {
			@Pc(30) Class3_Sub15 local30 = local15[local24];
			if (local30 != null && local30.anInt2296 == 6) {
				@Pc(56) int local56;
				if (local30.anInt2252 != -1 || local30.anInt2249 != -1) {
					@Pc(51) boolean local51 = Static26.method652(local30);
					if (local51) {
						local56 = local30.anInt2249;
					} else {
						local56 = local30.anInt2252;
					}
					if (local56 != -1) {
						@Pc(70) Class3_Sub1_Sub14 local70 = Static109.method2054(local56);
						local30.anInt2263 += Static69.anInt2153;
						while (local70.anIntArray247[local30.anInt2277] < local30.anInt2263) {
							local30.anInt2263 -= local70.anIntArray247[local30.anInt2277];
							local30.anInt2277++;
							if (local70.anIntArray243.length <= local30.anInt2277) {
								local30.anInt2277 -= local70.anInt2478;
								if (local30.anInt2277 < 0 || local70.anIntArray243.length <= local30.anInt2277) {
									local30.anInt2277 = 0;
								}
							}
							local22 = true;
						}
					}
				}
				if (local30.anInt2307 != 0 && !local30.aBoolean81) {
					local22 = true;
					@Pc(149) int local149 = local30.anInt2307 >> 16;
					@Pc(153) int local153 = local149 * Static69.anInt2153;
					local56 = local30.anInt2307 << 16 >> 16;
					local30.anInt2259 = local30.anInt2259 + local153 & 0x7FF;
					local56 *= Static69.anInt2153;
					local30.anInt2302 = local30.anInt2302 + local56 & 0x7FF;
				}
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!qf;I)I")
	public static int method2037(@OriginalArg(0) Class60 arg0) {
		if (Static123.anInt3361 == 1) {
			return 7;
		} else if (arg0.method1853(Static96.aClass60_1190)) {
			return 1;
		} else if (arg0.method1853(Static67.aClass60_923)) {
			return 1;
		} else if (arg0.method1853(Static96.aClass60_1180)) {
			return 2;
		} else if (arg0.method1853(Static51.aClass60_583)) {
			return 2;
		} else if (arg0.method1853(Static23.aClass60_1124)) {
			return 3;
		} else if (arg0.method1853(Static15.aClass60_251)) {
			return 4;
		} else if (arg0.method1853(Static64.aClass60_888)) {
			return 4;
		} else if (arg0.method1853(Static78.aClass60_1034)) {
			return 5;
		} else if (arg0.method1853(Static29.aClass60_388)) {
			return 6;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZ)V")
	public static void method2038(@OriginalArg(0) int arg0) {
		@Pc(8) int[] local8 = Static12.aClass3_Sub1_Sub2_Sub3_1.anIntArray222;
		@Pc(11) int local11 = local8.length;
		for (@Pc(20) int local20 = 0; local20 < local11; local20++) {
			local8[local20] = 0;
		}
		@Pc(49) int local49;
		@Pc(51) int local51;
		for (@Pc(36) int local36 = 1; local36 < 103; local36++) {
			local49 = (103 - local36) * 512 * 4 + 24628;
			for (local51 = 1; local51 < 103; local51++) {
				if ((Static60.aByteArrayArrayArray4[arg0][local51][local36] & 0x18) == 0) {
					Static13.aClass58_1.method1777(local8, local49, arg0, local51, local36);
				}
				if (arg0 < 3 && (Static60.aByteArrayArrayArray4[arg0 + 1][local51][local36] & 0x8) != 0) {
					Static13.aClass58_1.method1777(local8, local49, arg0 + 1, local51, local36);
				}
				local49 += 4;
			}
		}
		local49 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
		Static12.aClass3_Sub1_Sub2_Sub3_1.method1451();
		local51 = (int) (Math.random() * 20.0D) + 228 << 16;
		@Pc(163) int local163;
		for (@Pc(159) int local159 = 1; local159 < 103; local159++) {
			for (local163 = 1; local163 < 103; local163++) {
				if ((Static60.aByteArrayArrayArray4[arg0][local163][local159] & 0x18) == 0) {
					method2040(local163, local159, local49, local51, arg0);
				}
				if (arg0 < 3 && (Static60.aByteArrayArrayArray4[arg0 + 1][local163][local159] & 0x8) != 0) {
					method2040(local163, local159, local49, local51, arg0 + 1);
				}
			}
		}
		Static91.anInt2643 = 0;
		for (local163 = 0; local163 < 104; local163++) {
			for (@Pc(225) int local225 = 0; local225 < 104; local225++) {
				@Pc(233) int local233 = Static13.aClass58_1.method1738(Static119.anInt3243, local163, local225);
				if (local233 != 0) {
					local233 = local233 >> 14 & 0x7FFF;
					@Pc(246) int local246 = Static18.method517(local233).anInt3428;
					if (local246 >= 0) {
						@Pc(250) int local250 = local163;
						@Pc(252) int local252 = local225;
						if (local246 != 22 && local246 != 29 && local246 != 34 && local246 != 36 && local246 != 46 && local246 != 47 && local246 != 48) {
							@Pc(286) int[][] local286 = Static89.aClass72Array1[Static119.anInt3243].anIntArrayArray78;
							for (@Pc(288) int local288 = 0; local288 < 10; local288++) {
								@Pc(295) int local295 = (int) (Math.random() * 4.0D);
								if (local295 == 0 && local250 > 0 && local250 > local163 - 3 && (local286[local250 - 1][local252] & 0x12C0108) == 0) {
									local250--;
								}
								if (local295 == 1 && local250 < 103 && local250 < local163 + 3 && (local286[local250 + 1][local252] & 0x12C0180) == 0) {
									local250++;
								}
								if (local295 == 2 && local252 > 0 && local225 - 3 < local252 && (local286[local250][local252 - 1] & 0x12C0102) == 0) {
									local252--;
								}
								if (local295 == 3 && local252 < 103 && local252 < local225 + 3 && (local286[local250][local252 + 1] & 0x12C0120) == 0) {
									local252++;
								}
							}
						}
						Static91.aClass3_Sub1_Sub2_Sub3Array5[Static91.anInt2643] = Static114.aClass3_Sub1_Sub2_Sub3Array9[local246];
						Static80.anIntArray251[Static91.anInt2643] = local250;
						Static71.anIntArray186[Static91.anInt2643] = local252;
						Static91.anInt2643++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
	public static void method2039() {
		aClass60_1295 = null;
		aClass60_1288 = null;
		aClass60_1296 = null;
		aClass60_1294 = null;
		anIntArray326 = null;
		aClass60_1292 = null;
		aClass60_1293 = null;
		aClass60_1298 = null;
		aClass5_20 = null;
		aClass60_1297 = null;
		aClass60_1289 = null;
		aClass60_1290 = null;
		aClass60_1291 = null;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIII)V")
	private static void method2040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static13.aClass58_1.method1745(arg4, arg0, arg1);
		@Pc(23) int local23;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(31) int local31;
		@Pc(54) int local54;
		@Pc(67) int local67;
		if (local11 != 0) {
			local23 = Static13.aClass58_1.method1747(arg4, arg0, arg1, local11);
			local29 = local23 >> 6 & 0x3;
			local31 = arg2;
			local35 = local23 & 0x1F;
			@Pc(38) int[] local38 = Static12.aClass3_Sub1_Sub2_Sub3_1.anIntArray222;
			local54 = arg0 * 4 + (-(arg1 * 512) + 52736) * 4 + 24624;
			if (local11 > 0) {
				local31 = arg3;
			}
			local67 = local11 >> 14 & 0x7FFF;
			@Pc(71) Class3_Sub1_Sub17 local71 = Static18.method517(local67);
			if (local71.anInt3447 == -1) {
				if (local35 == 0 || local35 == 2) {
					if (local29 == 0) {
						local38[local54] = local31;
						local38[local54 + 512] = local31;
						local38[local54 + 1024] = local31;
						local38[local54 + 1536] = local31;
					} else if (local29 == 1) {
						local38[local54] = local31;
						local38[local54 + 1] = local31;
						local38[local54 + 2] = local31;
						local38[local54 + 3] = local31;
					} else if (local29 == 2) {
						local38[local54 + 3] = local31;
						local38[local54 + 515] = local31;
						local38[local54 + 3 + 1024] = local31;
						local38[local54 + 1536 + 3] = local31;
					} else if (local29 == 3) {
						local38[local54 + 1536] = local31;
						local38[local54 + 1 + 1536] = local31;
						local38[local54 + 1536 + 2] = local31;
						local38[local54 + 3 + 1536] = local31;
					}
				}
				if (local35 == 3) {
					if (local29 == 0) {
						local38[local54] = local31;
					} else if (local29 == 1) {
						local38[local54 + 3] = local31;
					} else if (local29 == 2) {
						local38[local54 + 1536 + 3] = local31;
					} else if (local29 == 3) {
						local38[local54 + 1536] = local31;
					}
				}
				if (local35 == 2) {
					if (local29 == 3) {
						local38[local54] = local31;
						local38[local54 + 512] = local31;
						local38[local54 + 1024] = local31;
						local38[local54 + 1536] = local31;
					} else if (local29 == 0) {
						local38[local54] = local31;
						local38[local54 + 1] = local31;
						local38[local54 + 2] = local31;
						local38[local54 + 3] = local31;
					} else if (local29 == 1) {
						local38[local54 + 3] = local31;
						local38[local54 + 3 + 512] = local31;
						local38[local54 + 1024 + 3] = local31;
						local38[local54 + 1536 + 3] = local31;
					} else if (local29 == 2) {
						local38[local54 + 1536] = local31;
						local38[local54 + 1 + 1536] = local31;
						local38[local54 + 2 + 1536] = local31;
						local38[local54 + 3 + 1536] = local31;
					}
				}
			} else {
				@Pc(389) Class3_Sub1_Sub2_Sub4 local389 = Static112.aClass3_Sub1_Sub2_Sub4Array9[local71.anInt3447];
				if (local389 != null) {
					@Pc(402) int local402 = (local71.anInt3441 * 4 - local389.anInt2858) / 2;
					@Pc(413) int local413 = (local71.anInt3449 * 4 - local389.anInt2860) / 2;
					local389.method1903(local413 + arg0 * 4 + 48, (-arg1 + (104 - local71.anInt3441)) * 4 + 48 + local402);
				}
			}
		}
		local11 = Static13.aClass58_1.method1774(arg4, arg0, arg1);
		if (local11 != 0) {
			local23 = Static13.aClass58_1.method1747(arg4, arg0, arg1, local11);
			local35 = local23 & 0x1F;
			local29 = local23 >> 6 & 0x3;
			local31 = local11 >> 14 & 0x7FFF;
			@Pc(470) Class3_Sub1_Sub17 local470 = Static18.method517(local31);
			@Pc(496) int local496;
			if (local470.anInt3447 != -1) {
				@Pc(574) Class3_Sub1_Sub2_Sub4 local574 = Static112.aClass3_Sub1_Sub2_Sub4Array9[local470.anInt3447];
				if (local574 != null) {
					local67 = (local470.anInt3449 * 4 - local574.anInt2860) / 2;
					local496 = (local470.anInt3441 * 4 - local574.anInt2858) / 2;
					local574.method1903(arg0 * 4 + local67 + 48, local496 + 48 - -((-local470.anInt3441 + -arg1 + 104) * 4));
				}
			} else if (local35 == 9) {
				local54 = 15658734;
				local496 = arg0 * 4 + (103 - arg1) * 2048 + 24624;
				if (local11 > 0) {
					local54 = 15597568;
				}
				@Pc(503) int[] local503 = Static12.aClass3_Sub1_Sub2_Sub3_1.anIntArray222;
				if (local29 == 0 || local29 == 2) {
					local503[local496 + 1536] = local54;
					local503[local496 + 1 + 1024] = local54;
					local503[local496 + 2 + 512] = local54;
					local503[local496 + 3] = local54;
				} else {
					local503[local496] = local54;
					local503[local496 + 1 + 512] = local54;
					local503[local496 + 1026] = local54;
					local503[local496 + 3 + 1536] = local54;
				}
			}
		}
		local11 = Static13.aClass58_1.method1738(arg4, arg0, arg1);
		if (local11 == 0) {
			return;
		}
		local23 = local11 >> 14 & 0x7FFF;
		@Pc(651) Class3_Sub1_Sub17 local651 = Static18.method517(local23);
		if (local651.anInt3447 == -1) {
			return;
		}
		@Pc(660) Class3_Sub1_Sub2_Sub4 local660 = Static112.aClass3_Sub1_Sub2_Sub4Array9[local651.anInt3447];
		if (local660 != null) {
			@Pc(673) int local673 = (local651.anInt3441 * 4 - local660.anInt2858) / 2;
			local31 = (local651.anInt3449 * 4 - local660.anInt2860) / 2;
			local660.method1903(arg0 * 4 + local31 + 48, local673 + (48 - -((104 - (arg1 - -local651.anInt3441)) * 4)));
			return;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V")
	public static void method2041() {
		try {
			@Pc(10) Graphics local10 = Static2.aCanvas1.getGraphics();
			Static85.aClass16_62.method1664(550, 4, local10);
		} catch (@Pc(18) Exception local18) {
			Static2.aCanvas1.repaint();
		}
	}
}
