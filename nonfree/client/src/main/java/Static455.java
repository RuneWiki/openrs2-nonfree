import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static455 {

	@OriginalMember(owner = "client!rea", name = "e", descriptor = "F")
	public static float aFloat155;

	@OriginalMember(owner = "client!rea", name = "f", descriptor = "Lclient!lt;")
	public static Class215 aClass215_1;

	@OriginalMember(owner = "client!rea", name = "r", descriptor = "Lclient!jv;")
	public static final Class182 aClass182_7 = new Class182("", 10);

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(IIII)Lclient!vj;")
	public static Class10_Sub1_Sub2 method6418(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class100 local11 = Static309.aClass100ArrayArrayArray2[arg2][arg0][arg1];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class10_Sub1_Sub2 local17 = null;
		@Pc(19) int local19 = -1;
		for (@Pc(22) Class35 local22 = local11.aClass35_2; local22 != null; local22 = local22.aClass35_1) {
			@Pc(26) Class10_Sub1 local26 = local22.aClass10_Sub1_1;
			if (local26 instanceof Class10_Sub1_Sub2) {
				@Pc(32) Class10_Sub1_Sub2 local32 = (Class10_Sub1_Sub2) local26;
				@Pc(42) int local42 = (local32.method7021() - 1) * 256 + 252;
				@Pc(50) int local50 = local32.anInt8934 - local42 >> 9;
				@Pc(58) int local58 = local32.anInt8929 - local42 >> 9;
				@Pc(66) int local66 = local32.anInt8934 + local42 >> 9;
				@Pc(74) int local74 = local32.anInt8929 + local42 >> 9;
				if (arg0 >= local50 && local58 <= arg1 && local66 >= arg0 && arg1 <= local74) {
					@Pc(111) int local111 = (local74 + 1 - arg1) * (local66 + 1 - arg0);
					if (local19 < local111) {
						local19 = local111;
						local17 = local32;
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(ILclient!oa;I)Z")
	public static boolean method6426(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1) {
		@Pc(11) int local11 = (Static38.anInt740 - 104) / 2;
		@Pc(17) int local17 = (Static38.anInt741 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg0; local29 <= 3; local29++) {
					if (Static209.method7919(arg0, local25, local21, local29)) {
						local40 = local29;
						if (Static163.method3178(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static321.method4882(local40, local25, local21);
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
		Static17.aClass13_1 = arg1.method6843(local90, 512, 512, 512);
		Static116.method2398();
		local40 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 16) + (238 - -((int) (Math.random() * 20.0D)) + -10 << 8) + 238 - 10 | 0xFF000000;
		@Pc(166) int local166 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(185) int local185 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8;
		@Pc(193) boolean[][] local193 = new boolean[Static489.anInt9739 + 1][Static489.anInt9739 + 1];
		@Pc(199) int local199;
		@Pc(203) int local203;
		@Pc(205) int local205;
		@Pc(207) int local207;
		@Pc(213) int local213;
		@Pc(220) int local220;
		@Pc(229) int local229;
		@Pc(254) int local254;
		@Pc(258) int local258;
		@Pc(311) int local311;
		@Pc(318) int local318;
		@Pc(322) int local322;
		@Pc(341) int local341;
		for (@Pc(195) int local195 = local11; local195 < local11 + 104; local195 += Static489.anInt9739) {
			for (local199 = local17; local199 < local17 + 104; local199 += Static489.anInt9739) {
				local203 = 0;
				local205 = 0;
				local207 = local195;
				if (local195 > 0) {
					local207 = local195 - 1;
					local203 += 4;
				}
				local213 = local199;
				if (local199 > 0) {
					local213 = local199 - 1;
				}
				local220 = Static489.anInt9739 + local195;
				if (local220 < 104) {
					local220++;
				}
				local229 = local199 + Static489.anInt9739;
				if (local229 < 104) {
					local205 += 4;
					local229++;
				}
				arg1.ca(0, 0, local203 + Static489.anInt9739 * 4, Static489.anInt9739 * 4 + local205);
				arg1.D(-16777216);
				@Pc(262) int local262;
				for (local254 = arg0; local254 <= 3; local254++) {
					for (local258 = 0; local258 <= Static489.anInt9739; local258++) {
						for (local262 = 0; local262 <= Static489.anInt9739; local262++) {
							local193[local258][local262] = Static209.method7919(arg0, local262 + local213, local207 + local258, local254);
						}
					}
					Static45.aClass16Array1[local254].method8039(local207, local213, local220, local229, local193);
					if (!Static465.aBoolean547) {
						for (local262 = -4; local262 < Static489.anInt9739; local262++) {
							for (local311 = -4; local311 < Static489.anInt9739; local311++) {
								local318 = local195 + local262;
								local322 = local311 + local199;
								if (local318 >= local11 && local322 >= local17 && Static209.method7919(arg0, local322, local318, local254)) {
									local341 = local254;
									if (Static163.method3178(local322, local318)) {
										local341 = local254 - 1;
									}
									if (local341 >= 0) {
										Static202.method3599(local205 + (Static489.anInt9739 - local311) * 4 - 4, local341, local40, local318, local166, local203 + local262 * 4, arg1, local322);
									}
								}
							}
						}
					}
				}
				if (Static465.aBoolean547) {
					@Pc(396) Class84 local396 = Static15.aClass84Array1[arg0];
					for (local262 = 0; local262 < Static489.anInt9739; local262++) {
						for (local311 = 0; local311 < Static489.anInt9739; local311++) {
							local318 = local195 + local262;
							local322 = local311 + local199;
							local341 = local396.anIntArrayArray37[local318 - local396.anInt2635][local322 - local396.anInt2638];
							if ((local341 & 0x40240000) != 0) {
								arg1.method6794(4, local262 * 4 + local203, 4, local205 + (Static489.anInt9739 - local311) * 4 - 4, -1713569622);
							} else if ((local341 & 0x800000) != 0) {
								arg1.method6817(local203 + local262 * 4, -1713569622, (Static489.anInt9739 - local311) * 4 + local205 - 4, 4);
							} else if ((local341 & 0x2000000) != 0) {
								arg1.method6782(-1713569622, local203 + local262 * 4 + 3, 4, (Static489.anInt9739 - local311) * 4 + local205 - 4);
							} else if ((local341 & 0x8000000) != 0) {
								arg1.method6817(local262 * 4 + local203, -1713569622, local205 + (Static489.anInt9739 - local311) * 4 + 3 - 4, 4);
							} else if ((local341 & 0x20000000) != 0) {
								arg1.method6782(-1713569622, local203 + local262 * 4, 4, (Static489.anInt9739 - local311) * 4 + local205 - 4);
							}
						}
					}
				}
				arg1.C(local203, local205, Static489.anInt9739 * 4, Static489.anInt9739 * 4, local185, 2);
				Static17.aClass13_1.GA((local195 - local11) * 4 + 48, -(Static489.anInt9739 * 4) + (464 - (local199 - local17) * 4), Static489.anInt9739 * 4, Static489.anInt9739 * 4, local203, local205);
			}
		}
		arg1.F();
		arg1.D(-16777215);
		Static39.method670();
		Static370.anInt6653 = 0;
		Static452.aClass124_50.method3265();
		if (!Static465.aBoolean547) {
			for (local199 = local11; local199 < local11 + 104; local199++) {
				for (local203 = local17; local203 < local17 + 104; local203++) {
					for (local205 = arg0; arg0 + 1 >= local205 && local205 <= 3; local205++) {
						if (Static209.method7919(arg0, local203, local199, local205)) {
							@Pc(686) Interface17 local686 = (Interface17) Static38.method651(local205, local199, local203);
							if (local686 == null) {
								local686 = (Interface17) Static541.method7510(local205, local199, local203, qi.class);
							}
							if (local686 == null) {
								local686 = (Interface17) Static216.method3734(local205, local199, local203);
							}
							if (local686 == null) {
								local686 = (Interface17) Static183.method3413(local205, local199, local203);
							}
							if (local686 != null) {
								@Pc(727) Class25 local727 = Static553.aClass288_4.method6419(local686.method7743());
								if (!local727.aBoolean53 || Static148.aBoolean511) {
									local220 = local727.anInt617;
									if (local727.anIntArray115 != null) {
										for (local229 = 0; local229 < local727.anIntArray115.length; local229++) {
											if (local727.anIntArray115[local229] != -1) {
												@Pc(756) Class25 local756 = Static553.aClass288_4.method6419(local727.anIntArray115[local229]);
												if (local756.anInt617 >= 0) {
													local220 = local756.anInt617;
												}
											}
										}
									}
									if (local220 >= 0) {
										@Pc(778) boolean local778 = false;
										if (local220 >= 0) {
											@Pc(788) Class86 local788 = Static152.aClass337_2.method7441(local220);
											if (local788 != null && local788.aBoolean217) {
												local778 = true;
											}
										}
										local254 = local199;
										local258 = local203;
										if (local778) {
											@Pc(806) int[][] local806 = Static15.aClass84Array1[local205].anIntArrayArray37;
											local311 = Static15.aClass84Array1[local205].anInt2635;
											local318 = Static15.aClass84Array1[local205].anInt2638;
											for (local322 = 0; local322 < 10; local322++) {
												local341 = (int) (Math.random() * 4.0D);
												if (local341 == 0 && local254 > local11 && local254 > local199 - 3 && (local806[local254 - local311 - 1][local258 - local318] & 0x2C0108) == 0) {
													local254--;
												}
												if (local341 == 1 && local254 < local11 + 104 - 1 && local199 + 3 > local254 && (local806[local254 + 1 - local311][local258 - local318] & 0x2C0180) == 0) {
													local254++;
												}
												if (local341 == 2 && local17 < local258 && local203 - 3 < local258 && (local806[local254 - local311][local258 - local318 - 1] & 0x2C0102) == 0) {
													local258--;
												}
												if (local341 == 3 && local17 + 103 > local258 && local203 + 3 > local258 && (local806[local254 - local311][local258 + 1 - local318] & 0x2C0120) == 0) {
													local258++;
												}
											}
										}
										Static25.anIntArray108[Static370.anInt6653] = local727.anInt605;
										Static308.anIntArray465[Static370.anInt6653] = local254;
										Static517.anIntArray673[Static370.anInt6653] = local258;
										Static370.anInt6653++;
									}
								}
							}
						}
					}
				}
			}
			if (Static378.aClass67_1 != null) {
				Static483.aClass31_104.anInt775 = 1;
				Static152.aClass337_2.method7445(64, 1024);
				for (local203 = 0; local203 < Static378.aClass67_1.anInt2257; local203++) {
					local205 = Static378.aClass67_1.anIntArray223[local203];
					if (local205 >> 28 == Static129.aClass10_Sub1_Sub2_Sub2_1.aByte101) {
						local207 = (local205 >> 14 & 0x3FFF) - Static373.anInt6695;
						local213 = (local205 & 0x3FFF) - Static6.anInt97;
						if (local207 >= 0 && local207 < Static38.anInt740 && local213 >= 0 && Static38.anInt741 > local213) {
							Static452.aClass124_50.method3275(new Class4_Sub33(local203));
						} else {
							@Pc(1094) Class86 local1094 = Static152.aClass337_2.method7441(Static378.aClass67_1.anIntArray222[local203]);
							if (local1094.anIntArray252 != null && local207 + local1094.anInt2706 >= 0 && Static38.anInt740 > local1094.anInt2717 + local207 && local1094.anInt2696 + local213 >= 0 && Static38.anInt741 > local213 + local1094.anInt2710) {
								Static452.aClass124_50.method3275(new Class4_Sub33(local203));
							}
						}
					}
				}
				Static152.aClass337_2.method7445(64, 128);
				Static483.aClass31_104.anInt775 = 2;
				Static483.aClass31_104.method660();
			}
		}
		return true;
	}
}
