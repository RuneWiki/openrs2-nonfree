import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "Lclient!tj;")
	public static Class193 aClass193_99;

	@OriginalMember(owner = "client!ub", name = "t", descriptor = "I")
	public static int anInt6130;

	@OriginalMember(owner = "client!ub", name = "v", descriptor = "[Lclient!vj;")
	public static Class58[] aClass58Array124;

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!ub", name = "w", descriptor = "[Z")
	public static final boolean[] aBooleanArray27 = new boolean[200];

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!br;B)V")
	public static void method5206(@OriginalArg(0) Class21 arg0) {
		@Pc(9) Class21 local9 = Static271.method4639(arg0);
		@Pc(17) int local17;
		@Pc(14) int local14;
		if (local9 == null) {
			local17 = Static24.anInt496;
			local14 = Static23.anInt465;
		} else {
			local14 = local9.anInt758;
			local17 = local9.anInt740;
		}
		Static340.method5455(local14, local17, false, arg0);
		Static344.method2688(local14, arg0, local17);
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)V")
	public static void method5212() {
		Static108.aClass198_91.method5213();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!vq;I)Z")
	public static boolean method5214(@OriginalArg(1) Class47 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = (Static350.anInt6637 - 104) / 2;
		@Pc(17) int local17 = (Static105.anInt2647 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg1; local29 <= 3; local29++) {
					if (Static210.method3895(local29, local25, local21, arg1)) {
						local40 = local29;
						if (Static17.method309(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static7.method185(local21, local25, local40);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(84) int[] local84 = new int[262144];
		for (local29 = 0; local29 < local84.length; local29++) {
			local84[local29] = -16777216;
		}
		Static88.aClass58_12 = arg0.method2679(local84, 512, 512, 512);
		Static123.method2571();
		local40 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (238 - -((int) (Math.random() * 20.0D)) + -10 << 8) + 238 - 10 | 0xFF000000;
		@Pc(154) int local154 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xC1C5FF00) << 16;
		@Pc(178) int local178 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16;
		@Pc(182) boolean[][] local182 = new boolean[Static76.anInt1946][Static76.anInt1946];
		@Pc(188) int local188;
		@Pc(205) int local205;
		@Pc(209) int local209;
		@Pc(213) int local213;
		@Pc(267) int local267;
		@Pc(274) int local274;
		@Pc(278) int local278;
		@Pc(301) int local301;
		for (@Pc(184) int local184 = local11; local184 < local11 + 104; local184 += Static76.anInt1946) {
			for (local188 = local17; local188 < local17 + 104; local188 += Static76.anInt1946) {
				arg0.method2709(0, 0, Static76.anInt1946 * 4, Static76.anInt1946 * 4);
				arg0.method2728(-16777216);
				for (local205 = arg1; local205 <= 3; local205++) {
					for (local209 = 0; local209 < Static76.anInt1946; local209++) {
						for (local213 = 0; local213 < Static76.anInt1946; local213++) {
							local182[local209][local213] = Static210.method3895(local205, local213 + local188, local184 + local209, arg1);
						}
					}
					Static304.aClass60Array3[local205].method2273(local184, local188, local184 + Static76.anInt1946, Static76.anInt1946 + local188, local182);
					if (!Static225.aBoolean352) {
						for (local213 = -4; local213 < Static76.anInt1946; local213++) {
							for (local267 = -4; local267 < Static76.anInt1946; local267++) {
								local274 = local184 + local213;
								local278 = local267 + local188;
								if (local274 >= local11 && local278 >= local17 && Static210.method3895(local205, local278, local274, arg1)) {
									local301 = local205;
									if (Static17.method309(local278, local274)) {
										local301 = local205 - 1;
									}
									if (local301 >= 0) {
										Static232.method4123((Static76.anInt1946 - local267) * 4 - 4, local154, arg0, local213 * 4, local278, local274, local40, local301);
									}
								}
							}
						}
					}
				}
				if (Static225.aBoolean352) {
					@Pc(352) Class170 local352 = Static16.aClass170Array1[arg1];
					for (local213 = 0; local213 < Static76.anInt1946; local213++) {
						for (local267 = 0; local267 < Static76.anInt1946; local267++) {
							local274 = local184 + local213;
							local278 = local188 + local267;
							local301 = local352.anIntArrayArray143[local274 - local352.anInt5336][local278 - local352.anInt5341];
							if ((local301 & 0x40240000) != 0) {
								arg0.method2687(local213 * 4, -1713569622, 4, (Static76.anInt1946 - local267) * 4 - 4, 4);
							} else if ((local301 & 0x800000) != 0) {
								arg0.method2747(local213 * 4, -1713569622, 4, (Static76.anInt1946 - local267) * 4 - 4);
							} else if ((local301 & 0x2000000) != 0) {
								arg0.method2737(local213 * 4 + 3, 4, -1713569622, (Static76.anInt1946 - local267) * 4 - 4);
							} else if ((local301 & 0x8000000) != 0) {
								arg0.method2747(local213 * 4, -1713569622, 4, (-local267 + Static76.anInt1946) * 4 + 3 - 4);
							} else if ((local301 & 0x20000000) != 0) {
								arg0.method2737(local213 * 4, 4, -1713569622, (Static76.anInt1946 - local267) * 4 - 4);
							}
						}
					}
				}
				arg0.method2682(0, 0, Static76.anInt1946 * 4, Static76.anInt1946 * 4, local178, 2);
				Static88.aClass58_12.method4273((local184 - local11) * 4 + 48, -(Static76.anInt1946 * 4) + -((-local17 + local188) * 4) + 464, Static76.anInt1946 * 4, Static76.anInt1946 * 4);
			}
		}
		arg0.method2722();
		arg0.method2728(-16777215);
		Static12.method242();
		Static31.anInt798 = 0;
		Static92.aClass116_2.method3273();
		if (!Static225.aBoolean352) {
			for (local188 = local11; local188 < local11 + 104; local188++) {
				for (local205 = local17; local205 < local17 + 104; local205++) {
					for (local209 = arg1; local209 <= arg1 + 1 && local209 <= 3; local209++) {
						if (Static210.method3895(local209, local205, local188, arg1)) {
							@Pc(622) Interface7 local622 = (Interface7) Static172.method3324(local209, local188, local205);
							if (local622 == null) {
								local622 = (Interface7) Static347.method5528(local209, local188, local205, mb.class);
							}
							if (local622 == null) {
								local622 = (Interface7) Static354.method5631(local209, local188, local205);
							}
							if (local622 == null) {
								local622 = (Interface7) Static43.method852(local209, local188, local205);
							}
							if (local622 != null) {
								@Pc(664) Class18 local664 = Static113.method2380(local622.method5594());
								if (!local664.aBoolean44 || Static121.aBoolean369) {
									local274 = local664.anInt523;
									if (local664.anIntArray23 != null) {
										for (local278 = 0; local278 < local664.anIntArray23.length; local278++) {
											if (local664.anIntArray23[local278] != -1) {
												@Pc(692) Class18 local692 = Static113.method2380(local664.anIntArray23[local278]);
												if (local692.anInt523 >= 0) {
													local274 = local692.anInt523;
												}
											}
										}
									}
									if (local274 >= 0) {
										@Pc(708) boolean local708 = false;
										if (local274 >= 0) {
											@Pc(717) Class136 local717 = Static11.method223(local274);
											if (local717 != null && local717.aBoolean330) {
												local708 = true;
											}
										}
										local301 = local188;
										@Pc(728) int local728 = local205;
										if (local708) {
											@Pc(735) int[][] local735 = Static16.aClass170Array1[local209].anIntArrayArray143;
											@Pc(740) int local740 = Static16.aClass170Array1[local209].anInt5336;
											@Pc(745) int local745 = Static16.aClass170Array1[local209].anInt5341;
											for (@Pc(747) int local747 = 0; local747 < 10; local747++) {
												@Pc(754) int local754 = (int) (Math.random() * 4.0D);
												if (local754 == 0 && local301 > local11 && local188 - 3 < local301 && (local735[local301 - local740 - 1][local728 - local745] & 0x2C0108) == 0) {
													local301--;
												}
												if (local754 == 1 && local11 + 104 - 1 > local301 && local301 < local188 + 3 && (local735[local301 + 1 - local740][local728 - local745] & 0x2C0180) == 0) {
													local301++;
												}
												if (local754 == 2 && local17 < local728 && local205 - 3 < local728 && (local735[local301 - local740][local728 - local745 - 1] & 0x2C0102) == 0) {
													local728--;
												}
												if (local754 == 3 && local728 < local17 + 103 && local728 < local205 + 3 && (local735[local301 - local740][local728 + 1 - local745] & 0x2C0120) == 0) {
													local728++;
												}
											}
										}
										Static152.anIntArray284[Static31.anInt798] = local664.anInt534;
										Static221.anIntArray243[Static31.anInt798] = local301;
										Static186.anIntArray329[Static31.anInt798] = local728;
										Static31.anInt798++;
									}
								}
							}
						}
					}
				}
			}
			if (Static24.aClass137_1 != null) {
				Static149.aClass193_69.anInt5952 = 1;
				Static277.method4743(1024, 64);
				for (local205 = 0; local205 < Static24.aClass137_1.anInt4323; local205++) {
					local209 = Static24.aClass137_1.anIntArray367[local205];
					if (local209 >> 28 == Static12.anInt267) {
						local213 = (local209 >> 14 & 0x3FFF) - Static286.anInt6699;
						local267 = (local209 & 0x3FFF) - Static136.anInt3193;
						if (local213 >= 0 && local213 < Static350.anInt6637 && local267 >= 0 && Static105.anInt2647 > local267) {
							Static92.aClass116_2.method3274(new Class4_Sub8(local205));
						} else {
							@Pc(1013) Class136 local1013 = Static11.method223(Static24.aClass137_1.anIntArray368[local205]);
							if (local1013.anIntArray363 != null && local213 + local1013.anInt4260 >= 0 && Static350.anInt6637 > local1013.anInt4265 + local213 && local267 + local1013.anInt4278 >= 0 && local267 + local1013.anInt4271 < Static105.anInt2647) {
								Static92.aClass116_2.method3274(new Class4_Sub8(local205));
							}
						}
					}
				}
				Static277.method4743(128, 64);
				Static149.aClass193_69.anInt5952 = 2;
				Static149.aClass193_69.method5062();
			}
		}
		return true;
	}
}
