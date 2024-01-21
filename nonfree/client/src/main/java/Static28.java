import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
	public static int anInt722;

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "Lclient!ai;")
	private static Class6 aClass6_198 = Static38.method685("glow1:");

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "Lclient!ai;")
	public static Class6 aClass6_197 = aClass6_198;

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "Lclient!ai;")
	private static Class6 aClass6_199 = Static38.method685("Use");

	@OriginalMember(owner = "client!dd", name = "l", descriptor = "Lclient!ai;")
	public static Class6 aClass6_200 = aClass6_198;

	@OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
	public static int anInt726 = 0;

	@OriginalMember(owner = "client!dd", name = "p", descriptor = "Lclient!ai;")
	public static Class6 aClass6_201 = aClass6_199;

	@OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
	public static int anInt729 = 0;

	@OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
	public static int anInt732 = 0;

	@OriginalMember(owner = "client!dd", name = "v", descriptor = "Lclient!ai;")
	public static Class6 aClass6_202 = Static38.method685("mod_icons");

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZ)I")
	public static int method504(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = (arg0 >>> 1 & 0xD5555555) + (arg0 & 0x55555555);
		@Pc(19) int local19 = (local9 >>> 2 & 0x73333333) + (local9 & 0x33333333);
		@Pc(32) int local32 = local19 + (local19 >>> 4) & 0xF0F0F0F;
		@Pc(42) int local42 = local32 + (local32 >>> 8);
		@Pc(48) int local48 = local42 + (local42 >>> 16);
		return local48 & 0xFF;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
	public static void method506() {
		aClass6_197 = null;
		aClass6_198 = null;
		aClass6_201 = null;
		aClass6_200 = null;
		aClass6_199 = null;
		aClass6_202 = null;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIII)Lclient!n;")
	public static Class2_Sub16 method507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub16 local7 = new Class2_Sub16();
		local7.anInt2555 = arg0;
		local7.anInt2551 = arg2;
		Static148.aClass16_10.method480(local7, (long) arg1);
		Static161.method2583(arg2);
		Static12.method207(arg2);
		@Pc(29) Class87 local29 = Static57.method940(arg1);
		if (local29 != null) {
			Static151.method2327(local29);
		}
		if (Static124.aClass87_9 != null) {
			Static151.method2327(Static124.aClass87_9);
			Static124.aClass87_9 = null;
		}
		Static160.aBoolean24 = false;
		Static46.anInt1322 = 0;
		Static133.method2089(Static144.anInt3388, Static171.anInt4010, Static105.anInt2554, Static96.anInt2389);
		if (Static21.anInt520 != -1) {
			Static63.method1013(1, Static21.anInt520);
		}
		return local7;
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(B)V")
	public static void method513() {
		Static23.aClass17_2.method509();
		Static29.aClass17_3.method509();
		Static152.aClass17_24.method509();
	}

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "(B)V")
	public static void method514() {
		Static117.aClass17_15.method509();
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZIII)V")
	public static void method516(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static180.anInt4193 = 0;
		@Pc(78) int local78;
		for (@Pc(14) int local14 = -1; local14 < Static167.anInt3925 + Static81.anInt1985; local14++) {
			@Pc(32) Class2_Sub3_Sub5_Sub1 local32;
			if (local14 == -1) {
				local32 = Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1;
			} else if (Static167.anInt3925 <= local14) {
				local32 = Static151.aClass2_Sub3_Sub5_Sub1_Sub2Array1[Static149.anIntArray312[local14 - Static167.anInt3925]];
			} else {
				local32 = Static2.aClass2_Sub3_Sub5_Sub1_Sub1Array1[Static156.anIntArray358[local14]];
			}
			if (local32 != null && local32.method1806()) {
				@Pc(59) Class2_Sub3_Sub17 local59;
				if (local32 instanceof Class2_Sub3_Sub5_Sub1_Sub2) {
					local59 = ((Class2_Sub3_Sub5_Sub1_Sub2) local32).aClass2_Sub3_Sub17_1;
					if (local59.anIntArray382 != null) {
						local59 = local59.method2651();
					}
					if (local59 == null) {
						continue;
					}
				}
				if (Static167.anInt3925 <= local14) {
					local59 = ((Class2_Sub3_Sub5_Sub1_Sub2) local32).aClass2_Sub3_Sub17_1;
					if (local59.anIntArray382 != null) {
						local59 = local59.method2651();
					}
					if (local59.anInt3902 >= 0 && local59.anInt3902 < Static55.aClass2_Sub3_Sub2_Sub1Array2.length) {
						Static15.method308(local32, local32.method1799() + 15);
						if (Static168.anInt3965 > -1) {
							Static55.aClass2_Sub3_Sub2_Sub1Array2[local59.anInt3902].method280(arg1 + Static168.anInt3965 - 12, arg0 - -Static27.anInt709 - 30);
						}
					}
					if (Static64.anInt1578 == 1 && Static149.anIntArray312[local14 - Static167.anInt3925] == Static157.anInt3643 && Static107.anInt2559 % 20 < 10) {
						Static15.method308(local32, local32.method1799() + 15);
						if (Static168.anInt3965 > -1) {
							Static85.aClass2_Sub3_Sub2_Sub1Array4[0].method280(Static168.anInt3965 + arg1 - 12, arg0 + Static27.anInt709 - 28);
						}
					}
				} else {
					@Pc(76) Class2_Sub3_Sub5_Sub1_Sub1 local76 = (Class2_Sub3_Sub5_Sub1_Sub1) local32;
					local78 = 30;
					if (local76.anInt944 != -1 || local76.anInt959 != -1) {
						Static15.method308(local32, local32.method1799() + 15);
						if (Static168.anInt3965 > -1) {
							if (local76.anInt944 != -1) {
								Static90.aClass2_Sub3_Sub2_Sub1Array8[local76.anInt944].method280(Static168.anInt3965 + arg1 - 12, Static27.anInt709 + arg0 + -30);
								local78 += 25;
							}
							if (local76.anInt959 != -1) {
								Static55.aClass2_Sub3_Sub2_Sub1Array2[local76.anInt959].method280(Static168.anInt3965 + arg1 - 12, arg0 + Static27.anInt709 - local78);
								local78 += 25;
							}
						}
					}
					if (local14 >= 0 && Static64.anInt1578 == 10 && Static156.anIntArray358[local14] == Static5.anInt90) {
						Static15.method308(local32, local32.method1799() + 15);
						if (Static168.anInt3965 > -1) {
							Static85.aClass2_Sub3_Sub2_Sub1Array4[1].method280(arg1 + Static168.anInt3965 - 12, arg0 + Static27.anInt709 + -local78);
						}
					}
				}
				if (local32.aClass6_776 != null && (Static167.anInt3925 <= local14 || anInt726 == 0 || anInt726 == 3 || anInt726 == 1 && Static95.method1543(((Class2_Sub3_Sub5_Sub1_Sub1) local32).aClass6_244))) {
					Static15.method308(local32, local32.method1799());
					if (Static168.anInt3965 > -1 && Static97.anInt2402 > Static180.anInt4193) {
						Static97.anIntArray185[Static180.anInt4193] = Static85.aClass2_Sub3_Sub2_Sub4_Sub1_5.method2516(local32.aClass6_776) / 2;
						Static97.anIntArray183[Static180.anInt4193] = Static85.aClass2_Sub3_Sub2_Sub4_Sub1_5.anInt3712;
						Static97.anIntArray181[Static180.anInt4193] = Static168.anInt3965;
						Static97.anIntArray179[Static180.anInt4193] = Static27.anInt709;
						Static97.anIntArray182[Static180.anInt4193] = local32.anInt2705;
						Static97.anIntArray184[Static180.anInt4193] = local32.anInt2675;
						Static97.anIntArray180[Static180.anInt4193] = local32.anInt2701;
						Static97.aClass6Array12[Static180.anInt4193] = local32.aClass6_776;
						Static180.anInt4193++;
					}
				}
				if (local32.anInt2686 > Static107.anInt2559) {
					Static15.method308(local32, local32.method1799() + 15);
					if (Static168.anInt3965 > -1) {
						local78 = local32.anInt2704 * 30 / local32.anInt2670;
						if (local78 > 30) {
							local78 = 30;
						}
						Static53.method2496(arg1 + Static168.anInt3965 - 15, arg0 + -3 - -Static27.anInt709, local78, 5, 65280);
						Static53.method2496(Static168.anInt3965 + arg1 + local78 - 15, Static27.anInt709 + arg0 + -3, 30 - local78, 5, 16711680);
					}
				}
				for (local78 = 0; local78 < 4; local78++) {
					if (Static107.anInt2559 < local32.anIntArray227[local78]) {
						Static15.method308(local32, local32.method1799() / 2);
						if (Static168.anInt3965 > -1) {
							if (local78 == 1) {
								Static27.anInt709 -= 20;
							}
							if (local78 == 2) {
								Static27.anInt709 -= 10;
								Static168.anInt3965 -= 15;
							}
							if (local78 == 3) {
								Static168.anInt3965 += 15;
								Static27.anInt709 -= 10;
							}
							Static103.aClass2_Sub3_Sub2_Sub1Array6[local32.anIntArray228[local78]].method280(Static168.anInt3965 + arg1 - 12, Static27.anInt709 + arg0 + -12);
							Static58.aClass2_Sub3_Sub2_Sub4_Sub1_4.method2508(Static106.method2806(local32.anIntArray224[local78]), Static168.anInt3965 + arg1 - 1, Static27.anInt709 + arg0 + 3, 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(523) int local523 = 0; local523 < Static180.anInt4193; local523++) {
			local78 = Static97.anIntArray181[local523];
			@Pc(533) int local533 = Static97.anIntArray179[local523];
			@Pc(535) boolean local535 = true;
			@Pc(539) int local539 = Static97.anIntArray185[local523];
			@Pc(543) int local543 = Static97.anIntArray183[local523];
			while (local535) {
				local535 = false;
				for (@Pc(549) int local549 = 0; local549 < local523; local549++) {
					if (local533 + 2 > -Static97.anIntArray183[local549] + Static97.anIntArray179[local549] && local533 - local543 < Static97.anIntArray179[local549] - -2 && local78 - local539 < Static97.anIntArray185[local549] + Static97.anIntArray181[local549] && local539 + local78 > Static97.anIntArray181[local549] + -Static97.anIntArray185[local549] && Static97.anIntArray179[local549] - Static97.anIntArray183[local549] < local533) {
						local533 = Static97.anIntArray179[local549] - Static97.anIntArray183[local549];
						local535 = true;
					}
				}
			}
			Static168.anInt3965 = Static97.anIntArray181[local523];
			Static27.anInt709 = Static97.anIntArray179[local523] = local533;
			@Pc(648) Class6 local648 = Static97.aClass6Array12[local523];
			if (Static155.anInt3954 == 0) {
				@Pc(655) int local655 = 16776960;
				if (Static97.anIntArray182[local523] < 6) {
					local655 = Static50.anIntArray90[Static97.anIntArray182[local523]];
				}
				if (Static97.anIntArray182[local523] == 6) {
					local655 = Static106.anInt4182 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static97.anIntArray182[local523] == 7) {
					local655 = Static106.anInt4182 % 20 >= 10 ? 65535 : 255;
				}
				if (Static97.anIntArray182[local523] == 8) {
					local655 = Static106.anInt4182 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(724) int local724;
				if (Static97.anIntArray182[local523] == 9) {
					local724 = 150 - Static97.anIntArray180[local523];
					if (local724 < 50) {
						local655 = local724 * 1280 + 16711680;
					} else if (local724 < 100) {
						local655 = 16776960 - (local724 - 50) * 327680;
					} else if (local724 < 150) {
						local655 = local724 * 5 + 65280 - 500;
					}
				}
				if (Static97.anIntArray182[local523] == 10) {
					local724 = 150 - Static97.anIntArray180[local523];
					if (local724 < 50) {
						local655 = local724 * 5 + 16711680;
					} else if (local724 < 100) {
						local655 = 16711935 - (local724 - 50) * 327680;
					} else if (local724 < 150) {
						local655 = local724 * 327680 + 755 - local724 * 5 - 32768000;
					}
				}
				if (Static97.anIntArray182[local523] == 11) {
					local724 = 150 - Static97.anIntArray180[local523];
					if (local724 < 50) {
						local655 = 16777215 - local724 * 327685;
					} else if (local724 < 100) {
						local655 = (local724 - 50) * 327685 + 65280;
					} else if (local724 < 150) {
						local655 = 32768000 + 16777215 - local724 * 327680;
					}
				}
				if (Static97.anIntArray184[local523] == 0) {
					Static85.aClass2_Sub3_Sub2_Sub4_Sub1_5.method2508(local648, arg1 + Static168.anInt3965, Static27.anInt709 + arg0, local655, 0);
				}
				if (Static97.anIntArray184[local523] == 1) {
					Static85.aClass2_Sub3_Sub2_Sub4_Sub1_5.method2530(local648, arg1 + Static168.anInt3965, Static27.anInt709 + arg0, local655, Static106.anInt4182);
				}
				if (Static97.anIntArray184[local523] == 2) {
					Static85.aClass2_Sub3_Sub2_Sub4_Sub1_5.method2528(local648, Static168.anInt3965 + arg1, arg0 + Static27.anInt709, local655, Static106.anInt4182);
				}
				if (Static97.anIntArray184[local523] == 3) {
					Static85.aClass2_Sub3_Sub2_Sub4_Sub1_5.method2525(local648, Static168.anInt3965 + arg1, Static27.anInt709 + arg0, local655, Static106.anInt4182, 150 - Static97.anIntArray180[local523]);
				}
				if (Static97.anIntArray184[local523] == 4) {
					local724 = (150 - Static97.anIntArray180[local523]) * (Static85.aClass2_Sub3_Sub2_Sub4_Sub1_5.method2516(local648) + 100) / 150;
					Static53.method2498(arg1 + Static168.anInt3965 - 50, arg0, Static168.anInt3965 + arg1 + 50, arg0 + arg3);
					Static85.aClass2_Sub3_Sub2_Sub4_Sub1_5.method2512(local648, Static168.anInt3965 + arg1 + 50 - local724, arg0 + Static27.anInt709, local655, 0);
					Static53.method2493(arg1, arg0, arg2 + arg1, arg0 - -arg3);
				}
				if (Static97.anIntArray184[local523] == 5) {
					local724 = 150 - Static97.anIntArray180[local523];
					Static53.method2498(arg1, arg0 + Static27.anInt709 - Static85.aClass2_Sub3_Sub2_Sub4_Sub1_5.anInt3712 - 1, arg2 + arg1, arg0 + Static27.anInt709 + 5);
					@Pc(1045) int local1045 = 0;
					if (local724 < 25) {
						local1045 = local724 - 25;
					} else if (local724 > 125) {
						local1045 = local724 - 125;
					}
					Static85.aClass2_Sub3_Sub2_Sub4_Sub1_5.method2508(local648, Static168.anInt3965 + arg1, local1045 + Static27.anInt709 + arg0, local655, 0);
					Static53.method2493(arg1, arg0, arg1 + arg2, arg3 + arg0);
				}
			} else {
				Static85.aClass2_Sub3_Sub2_Sub4_Sub1_5.method2508(local648, Static168.anInt3965 + arg1, Static27.anInt709 + arg0, 16776960, 0);
			}
		}
	}
}
