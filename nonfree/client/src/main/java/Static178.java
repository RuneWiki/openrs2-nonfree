import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!te", name = "fb", descriptor = "I")
	public static int anInt3840;

	@OriginalMember(owner = "client!te", name = "O", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1827 = Static187.method3089("Versteckt");

	@OriginalMember(owner = "client!te", name = "hb", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1830 = Static187.method3089("purple:");

	@OriginalMember(owner = "client!te", name = "V", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1828 = aClass92_1830;

	@OriginalMember(owner = "client!te", name = "bb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1829 = Static187.method3089("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!te", name = "jb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1831 = aClass92_1830;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!lc;Z)V")
	public static void method2902(@OriginalArg(0) Class1_Sub17 arg0, @OriginalArg(1) boolean arg1) {
		Static32.aClass20_2.method466(arg0);
		while (true) {
			@Pc(8) Class1_Sub17 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(30) Class1_Sub17[][] local30;
			@Pc(47) Class1_Sub17 local47;
			@Pc(245) int local245;
			@Pc(579) int local579;
			@Pc(584) int local584;
			@Pc(589) int local589;
			@Pc(906) Class48 local906;
			@Pc(1079) int local1079;
			@Pc(964) int local964;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(251) Class16 var11;
										@Pc(592) int var16;
										@Pc(601) int var17;
										@Pc(613) int var18;
										@Pc(335) int var20;
										@Pc(283) boolean var21;
										@Pc(787) Class1_Sub17 var32;
										while (true) {
											do {
												local8 = (Class1_Sub17) Static32.aClass20_2.method475();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean140);
											local17 = local8.anInt2374;
											local20 = local8.anInt2371;
											local23 = local8.anInt2377;
											local26 = local8.anInt2378;
											local30 = Static179.aClass1_Sub17ArrayArrayArray1[local23];
											if (!local8.aBoolean139) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local47 = Static179.aClass1_Sub17ArrayArrayArray1[local23 - 1][local17][local20];
													if (local47 != null && local47.aBoolean140) {
														continue;
													}
												}
												if (local17 <= Static7.anInt157 && local17 > Static16.anInt1098) {
													local47 = local30[local17 - 1][local20];
													if (local47 != null && local47.aBoolean140 && (local47.aBoolean139 || (local8.anInt2385 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static7.anInt157 && local17 < Static168.anInt3499 - 1) {
													local47 = local30[local17 + 1][local20];
													if (local47 != null && local47.aBoolean140 && (local47.aBoolean139 || (local8.anInt2385 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static83.anInt1829 && local20 > Static166.anInt3458) {
													local47 = local30[local17][local20 - 1];
													if (local47 != null && local47.aBoolean140 && (local47.aBoolean139 || (local8.anInt2385 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static83.anInt1829 && local20 < Static196.anInt4246 - 1) {
													local47 = local30[local17][local20 + 1];
													if (local47 != null && local47.aBoolean140 && (local47.aBoolean139 || (local8.anInt2385 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean139 = false;
											if (local8.aClass1_Sub17_1 != null) {
												local47 = local8.aClass1_Sub17_1;
												if (local47.aClass64_1 == null) {
													if (local47.aClass31_1 != null && !Static196.method3212(0, local17, local20)) {
														Static77.method1171(local47.aClass31_1, Static53.anInt1312, Static62.anInt1477, Static165.anInt3434, Static109.anInt2361, local17, local20);
													}
												} else if (!Static196.method3212(0, local17, local20)) {
													Static123.method1821(local47.aClass64_1, 0, Static53.anInt1312, Static62.anInt1477, Static165.anInt3434, Static109.anInt2361, local17, local20);
												}
												@Pc(219) Class48 local219 = local47.aClass48_1;
												if (local219 != null) {
													local219.aClass8_4.method2672(0, Static53.anInt1312, Static62.anInt1477, Static165.anInt3434, Static109.anInt2361, local219.anInt1851 - Static59.anInt1427, local219.anInt1849 - Static20.anInt538, local219.anInt1853 - Static205.anInt4447, local219.aLong94);
												}
												for (local245 = 0; local245 < local47.anInt2380; local245++) {
													var11 = local47.aClass16Array3[local245];
													if (var11 != null) {
														var11.aClass8_2.method2672(var11.anInt542, Static53.anInt1312, Static62.anInt1477, Static165.anInt3434, Static109.anInt2361, var11.anInt543 - Static59.anInt1427, var11.anInt544 - Static20.anInt538, var11.anInt541 - Static205.anInt4447, var11.aLong30);
													}
												}
											}
											var21 = false;
											if (local8.aClass64_1 == null) {
												if (local8.aClass31_1 != null && !Static196.method3212(local26, local17, local20)) {
													var21 = true;
													Static77.method1171(local8.aClass31_1, Static53.anInt1312, Static62.anInt1477, Static165.anInt3434, Static109.anInt2361, local17, local20);
												}
											} else if (!Static196.method3212(local26, local17, local20)) {
												var21 = true;
												if (local8.aClass64_1.anInt2675 != 12345678 || Static119.aBoolean148 && local23 <= Static73.anInt1641) {
													Static123.method1821(local8.aClass64_1, local26, Static53.anInt1312, Static62.anInt1477, Static165.anInt3434, Static109.anInt2361, local17, local20);
												}
											}
											var20 = 0;
											local245 = 0;
											@Pc(340) Class48 local340 = local8.aClass48_1;
											@Pc(343) Class85 local343 = local8.aClass85_1;
											if (local340 != null || local343 != null) {
												if (Static7.anInt157 == local17) {
													var20++;
												} else if (Static7.anInt157 < local17) {
													var20 += 2;
												}
												if (Static83.anInt1829 == local20) {
													var20 += 3;
												} else if (Static83.anInt1829 > local20) {
													var20 += 6;
												}
												local245 = Static29.anIntArray59[var20];
												local8.anInt2384 = Static113.anIntArray184[var20];
											}
											if (local340 != null) {
												if ((local340.anInt1852 & Static208.anIntArray88[var20]) == 0) {
													local8.anInt2372 = 0;
												} else if (local340.anInt1852 == 16) {
													local8.anInt2372 = 3;
													local8.anInt2379 = Static14.anIntArray40[var20];
													local8.anInt2375 = 3 - local8.anInt2379;
												} else if (local340.anInt1852 == 32) {
													local8.anInt2372 = 6;
													local8.anInt2379 = Static131.anIntArray212[var20];
													local8.anInt2375 = 6 - local8.anInt2379;
												} else if (local340.anInt1852 == 64) {
													local8.anInt2372 = 12;
													local8.anInt2379 = Static209.anIntArray364[var20];
													local8.anInt2375 = 12 - local8.anInt2379;
												} else {
													local8.anInt2372 = 9;
													local8.anInt2379 = Static149.anIntArray275[var20];
													local8.anInt2375 = 9 - local8.anInt2379;
												}
												if ((local340.anInt1852 & local245) != 0 && !Static16.method738(local26, local17, local20, local340.anInt1852)) {
													local340.aClass8_4.method2672(0, Static53.anInt1312, Static62.anInt1477, Static165.anInt3434, Static109.anInt2361, local340.anInt1851 - Static59.anInt1427, local340.anInt1849 - Static20.anInt538, local340.anInt1853 - Static205.anInt4447, local340.aLong94);
												}
												if ((local340.anInt1850 & local245) != 0 && !Static16.method738(local26, local17, local20, local340.anInt1850)) {
													local340.aClass8_5.method2672(0, Static53.anInt1312, Static62.anInt1477, Static165.anInt3434, Static109.anInt2361, local340.anInt1851 - Static59.anInt1427, local340.anInt1849 - Static20.anInt538, local340.anInt1853 - Static205.anInt4447, local340.aLong94);
												}
											}
											if (local343 != null && !Static158.method2479(local26, local17, local20, local343.aClass8_7.method2668())) {
												if ((local343.anInt3800 & local245) != 0) {
													local343.aClass8_7.method2672(0, Static53.anInt1312, Static62.anInt1477, Static165.anInt3434, Static109.anInt2361, local343.anInt3803 + local343.anInt3795 - Static59.anInt1427, local343.anInt3796 - Static20.anInt538, local343.anInt3792 + local343.anInt3791 - Static205.anInt4447, local343.aLong208);
												} else if (local343.anInt3800 == 256) {
													local579 = local343.anInt3803 - Static59.anInt1427;
													local584 = local343.anInt3796 - Static20.anInt538;
													local589 = local343.anInt3792 - Static205.anInt4447;
													var16 = local343.anInt3801;
													if (var16 == 1 || var16 == 2) {
														var17 = -local579;
													} else {
														var17 = local579;
													}
													if (var16 == 2 || var16 == 3) {
														var18 = -local589;
													} else {
														var18 = local589;
													}
													if (var18 < var17) {
														local343.aClass8_7.method2672(0, Static53.anInt1312, Static62.anInt1477, Static165.anInt3434, Static109.anInt2361, local579 + local343.anInt3795, local584, local589 + local343.anInt3791, local343.aLong208);
													} else if (local343.aClass8_6 != null) {
														local343.aClass8_6.method2672(0, Static53.anInt1312, Static62.anInt1477, Static165.anInt3434, Static109.anInt2361, local579, local584, local589, local343.aLong208);
													}
												}
											}
											if (var21) {
												@Pc(660) Class5 local660 = local8.aClass5_1;
												if (local660 != null) {
													local660.aClass8_1.method2672(0, Static53.anInt1312, Static62.anInt1477, Static165.anInt3434, Static109.anInt2361, local660.anInt103 - Static59.anInt1427, local660.anInt98 - Static20.anInt538, local660.anInt100 - Static205.anInt4447, local660.aLong7);
												}
												@Pc(687) Class87 local687 = local8.aClass87_1;
												if (local687 != null && local687.anInt3915 == 0) {
													if (local687.aClass8_10 != null) {
														local687.aClass8_10.method2672(0, Static53.anInt1312, Static62.anInt1477, Static165.anInt3434, Static109.anInt2361, local687.anInt3911 - Static59.anInt1427, local687.anInt3912 - Static20.anInt538, local687.anInt3910 - Static205.anInt4447, local687.aLong213);
													}
													if (local687.aClass8_9 != null) {
														local687.aClass8_9.method2672(0, Static53.anInt1312, Static62.anInt1477, Static165.anInt3434, Static109.anInt2361, local687.anInt3911 - Static59.anInt1427, local687.anInt3912 - Static20.anInt538, local687.anInt3910 - Static205.anInt4447, local687.aLong213);
													}
													if (local687.aClass8_8 != null) {
														local687.aClass8_8.method2672(0, Static53.anInt1312, Static62.anInt1477, Static165.anInt3434, Static109.anInt2361, local687.anInt3911 - Static59.anInt1427, local687.anInt3912 - Static20.anInt538, local687.anInt3910 - Static205.anInt4447, local687.aLong213);
													}
												}
											}
											local579 = local8.anInt2385;
											if (local579 != 0) {
												if (local17 < Static7.anInt157 && (local579 & 0x4) != 0) {
													var32 = local30[local17 + 1][local20];
													if (var32 != null && var32.aBoolean140) {
														Static32.aClass20_2.method466(var32);
													}
												}
												if (local20 < Static83.anInt1829 && (local579 & 0x2) != 0) {
													var32 = local30[local17][local20 + 1];
													if (var32 != null && var32.aBoolean140) {
														Static32.aClass20_2.method466(var32);
													}
												}
												if (local17 > Static7.anInt157 && (local579 & 0x1) != 0) {
													var32 = local30[local17 - 1][local20];
													if (var32 != null && var32.aBoolean140) {
														Static32.aClass20_2.method466(var32);
													}
												}
												if (local20 > Static83.anInt1829 && (local579 & 0x8) != 0) {
													var32 = local30[local17][local20 - 1];
													if (var32 != null && var32.aBoolean140) {
														Static32.aClass20_2.method466(var32);
													}
												}
											}
											break;
										}
										if (local8.anInt2372 != 0) {
											var21 = true;
											for (var20 = 0; var20 < local8.anInt2380; var20++) {
												if (local8.aClass16Array3[var20].anInt535 != Static71.anInt1617 && (local8.anIntArray178[var20] & local8.anInt2372) == local8.anInt2379) {
													var21 = false;
													break;
												}
											}
											if (var21) {
												local906 = local8.aClass48_1;
												if (!Static16.method738(local26, local17, local20, local906.anInt1852)) {
													local906.aClass8_4.method2672(0, Static53.anInt1312, Static62.anInt1477, Static165.anInt3434, Static109.anInt2361, local906.anInt1851 - Static59.anInt1427, local906.anInt1849 - Static20.anInt538, local906.anInt1853 - Static205.anInt4447, local906.aLong94);
												}
												local8.anInt2372 = 0;
											}
										}
										if (!local8.aBoolean138) {
											break;
										}
										try {
											@Pc(944) int local944 = local8.anInt2380;
											local8.aBoolean138 = false;
											var20 = 0;
											label558: for (local245 = 0; local245 < local944; local245++) {
												var11 = local8.aClass16Array3[local245];
												if (var11.anInt535 != Static71.anInt1617) {
													for (local964 = var11.anInt536; local964 <= var11.anInt547; local964++) {
														for (local579 = var11.anInt540; local579 <= var11.anInt537; local579++) {
															var32 = local30[local964][local579];
															if (var32.aBoolean139) {
																local8.aBoolean138 = true;
																continue label558;
															}
															if (var32.anInt2372 != 0) {
																local589 = 0;
																if (local964 > var11.anInt536) {
																	local589++;
																}
																if (local964 < var11.anInt547) {
																	local589 += 4;
																}
																if (local579 > var11.anInt540) {
																	local589 += 8;
																}
																if (local579 < var11.anInt537) {
																	local589 += 2;
																}
																if ((local589 & var32.anInt2372) == local8.anInt2375) {
																	local8.aBoolean138 = true;
																	continue label558;
																}
															}
														}
													}
													Static41.aClass16Array2[var20++] = var11;
													local579 = Static7.anInt157 - var11.anInt536;
													local584 = var11.anInt547 - Static7.anInt157;
													if (local584 > local579) {
														local579 = local584;
													}
													local589 = Static83.anInt1829 - var11.anInt540;
													var16 = var11.anInt537 - Static83.anInt1829;
													if (var16 > local589) {
														var11.anInt539 = local579 + var16;
													} else {
														var11.anInt539 = local579 + local589;
													}
												}
											}
											while (var20 > 0) {
												local1079 = -50;
												local964 = -1;
												@Pc(1088) Class16 local1088;
												for (local579 = 0; local579 < var20; local579++) {
													local1088 = Static41.aClass16Array2[local579];
													if (local1088.anInt535 != Static71.anInt1617) {
														if (local1088.anInt539 > local1079) {
															local1079 = local1088.anInt539;
															local964 = local579;
														} else if (local1088.anInt539 == local1079) {
															local589 = local1088.anInt543 - Static59.anInt1427;
															var16 = local1088.anInt541 - Static205.anInt4447;
															var17 = Static41.aClass16Array2[local964].anInt543 - Static59.anInt1427;
															var18 = Static41.aClass16Array2[local964].anInt541 - Static205.anInt4447;
															if (local589 * local589 + var16 * var16 > var17 * var17 + var18 * var18) {
																local964 = local579;
															}
														}
													}
												}
												if (local964 == -1) {
													break;
												}
												local1088 = Static41.aClass16Array2[local964];
												local1088.anInt535 = Static71.anInt1617;
												if (!Static21.method436(local26, local1088.anInt536, local1088.anInt547, local1088.anInt540, local1088.anInt537, local1088.aClass8_2.method2668())) {
													local1088.aClass8_2.method2672(local1088.anInt542, Static53.anInt1312, Static62.anInt1477, Static165.anInt3434, Static109.anInt2361, local1088.anInt543 - Static59.anInt1427, local1088.anInt544 - Static20.anInt538, local1088.anInt541 - Static205.anInt4447, local1088.aLong30);
												}
												for (local589 = local1088.anInt536; local589 <= local1088.anInt547; local589++) {
													for (var16 = local1088.anInt540; var16 <= local1088.anInt537; var16++) {
														@Pc(1212) Class1_Sub17 local1212 = local30[local589][var16];
														if (local1212.anInt2372 != 0) {
															Static32.aClass20_2.method466(local1212);
														} else if ((local589 != local17 || var16 != local20) && local1212.aBoolean140) {
															Static32.aClass20_2.method466(local1212);
														}
													}
												}
											}
											if (!local8.aBoolean138) {
												break;
											}
										} catch (@Pc(1250) Exception local1250) {
											local8.aBoolean138 = false;
											break;
										}
									}
								} while (!local8.aBoolean140);
							} while (local8.anInt2372 != 0);
							if (local17 > Static7.anInt157 || local17 <= Static16.anInt1098) {
								break;
							}
							local47 = local30[local17 - 1][local20];
						} while (local47 != null && local47.aBoolean140);
						if (local17 < Static7.anInt157 || local17 >= Static168.anInt3499 - 1) {
							break;
						}
						local47 = local30[local17 + 1][local20];
					} while (local47 != null && local47.aBoolean140);
					if (local20 > Static83.anInt1829 || local20 <= Static166.anInt3458) {
						break;
					}
					local47 = local30[local17][local20 - 1];
				} while (local47 != null && local47.aBoolean140);
				if (local20 < Static83.anInt1829 || local20 >= Static196.anInt4246 - 1) {
					break;
				}
				local47 = local30[local17][local20 + 1];
			} while (local47 != null && local47.aBoolean140);
			local8.aBoolean140 = false;
			Static170.anInt3550--;
			@Pc(1354) Class87 local1354 = local8.aClass87_1;
			if (local1354 != null && local1354.anInt3915 != 0) {
				if (local1354.aClass8_10 != null) {
					local1354.aClass8_10.method2672(0, Static53.anInt1312, Static62.anInt1477, Static165.anInt3434, Static109.anInt2361, local1354.anInt3911 - Static59.anInt1427, local1354.anInt3912 - Static20.anInt538 - local1354.anInt3915, local1354.anInt3910 - Static205.anInt4447, local1354.aLong213);
				}
				if (local1354.aClass8_9 != null) {
					local1354.aClass8_9.method2672(0, Static53.anInt1312, Static62.anInt1477, Static165.anInt3434, Static109.anInt2361, local1354.anInt3911 - Static59.anInt1427, local1354.anInt3912 - Static20.anInt538 - local1354.anInt3915, local1354.anInt3910 - Static205.anInt4447, local1354.aLong213);
				}
				if (local1354.aClass8_8 != null) {
					local1354.aClass8_8.method2672(0, Static53.anInt1312, Static62.anInt1477, Static165.anInt3434, Static109.anInt2361, local1354.anInt3911 - Static59.anInt1427, local1354.anInt3912 - Static20.anInt538 - local1354.anInt3915, local1354.anInt3910 - Static205.anInt4447, local1354.aLong213);
				}
			}
			if (local8.anInt2384 != 0) {
				@Pc(1449) Class85 local1449 = local8.aClass85_1;
				if (local1449 != null && !Static158.method2479(local26, local17, local20, local1449.aClass8_7.method2668())) {
					if ((local1449.anInt3800 & local8.anInt2384) != 0) {
						local1449.aClass8_7.method2672(0, Static53.anInt1312, Static62.anInt1477, Static165.anInt3434, Static109.anInt2361, local1449.anInt3803 + local1449.anInt3795 - Static59.anInt1427, local1449.anInt3796 - Static20.anInt538, local1449.anInt3792 + local1449.anInt3791 - Static205.anInt4447, local1449.aLong208);
					} else if (local1449.anInt3800 == 256) {
						local245 = local1449.anInt3803 - Static59.anInt1427;
						local1079 = local1449.anInt3796 - Static20.anInt538;
						local964 = local1449.anInt3792 - Static205.anInt4447;
						local579 = local1449.anInt3801;
						if (local579 == 1 || local579 == 2) {
							local584 = -local245;
						} else {
							local584 = local245;
						}
						if (local579 == 2 || local579 == 3) {
							local589 = -local964;
						} else {
							local589 = local964;
						}
						if (local589 >= local584) {
							local1449.aClass8_7.method2672(0, Static53.anInt1312, Static62.anInt1477, Static165.anInt3434, Static109.anInt2361, local245 + local1449.anInt3795, local1079, local964 + local1449.anInt3791, local1449.aLong208);
						} else if (local1449.aClass8_6 != null) {
							local1449.aClass8_6.method2672(0, Static53.anInt1312, Static62.anInt1477, Static165.anInt3434, Static109.anInt2361, local245, local1079, local964, local1449.aLong208);
						}
					}
				}
				local906 = local8.aClass48_1;
				if (local906 != null) {
					if ((local906.anInt1850 & local8.anInt2384) != 0 && !Static16.method738(local26, local17, local20, local906.anInt1850)) {
						local906.aClass8_5.method2672(0, Static53.anInt1312, Static62.anInt1477, Static165.anInt3434, Static109.anInt2361, local906.anInt1851 - Static59.anInt1427, local906.anInt1849 - Static20.anInt538, local906.anInt1853 - Static205.anInt4447, local906.aLong94);
					}
					if ((local906.anInt1852 & local8.anInt2384) != 0 && !Static16.method738(local26, local17, local20, local906.anInt1852)) {
						local906.aClass8_4.method2672(0, Static53.anInt1312, Static62.anInt1477, Static165.anInt3434, Static109.anInt2361, local906.anInt1851 - Static59.anInt1427, local906.anInt1849 - Static20.anInt538, local906.anInt1853 - Static205.anInt4447, local906.aLong94);
					}
				}
			}
			@Pc(1669) Class1_Sub17 local1669;
			if (local23 < Static163.anInt3629 - 1) {
				local1669 = Static179.aClass1_Sub17ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1669 != null && local1669.aBoolean140) {
					Static32.aClass20_2.method466(local1669);
				}
			}
			if (local17 < Static7.anInt157) {
				local1669 = local30[local17 + 1][local20];
				if (local1669 != null && local1669.aBoolean140) {
					Static32.aClass20_2.method466(local1669);
				}
			}
			if (local20 < Static83.anInt1829) {
				local1669 = local30[local17][local20 + 1];
				if (local1669 != null && local1669.aBoolean140) {
					Static32.aClass20_2.method466(local1669);
				}
			}
			if (local17 > Static7.anInt157) {
				local1669 = local30[local17 - 1][local20];
				if (local1669 != null && local1669.aBoolean140) {
					Static32.aClass20_2.method466(local1669);
				}
			}
			if (local20 > Static83.anInt1829) {
				local1669 = local30[local17][local20 - 1];
				if (local1669 != null && local1669.aBoolean140) {
					Static32.aClass20_2.method466(local1669);
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!ij;")
	public static RuntimeException_Sub1 method2905(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString4 = local9.aString4 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(B)V")
	public static void method2906() {
		for (@Pc(14) Class1_Sub8 local14 = (Class1_Sub8) Static73.aClass20_6.method467(); local14 != null; local14 = (Class1_Sub8) Static73.aClass20_6.method468()) {
			if (local14.anInt1243 == -1) {
				local14.anInt1252 = 0;
				Static156.method2376(local14);
			} else {
				local14.method3414();
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BII)Lclient!vd;")
	public static Class92 method2909(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = arg0 - arg1;
		if (local3 < -9) {
			return Static165.aClass92_1670;
		} else if (local3 < -6) {
			return Static179.aClass92_1849;
		} else if (local3 < -3) {
			return Static165.aClass92_1671;
		} else if (local3 < 0) {
			return Static62.aClass92_604;
		} else if (local3 > 9) {
			return Static32.aClass92_344;
		} else if (local3 > 6) {
			return Static120.aClass92_1186;
		} else if (local3 > 3) {
			return Static176.aClass92_1807;
		} else if (local3 > 0) {
			return Static62.aClass92_605;
		} else {
			return Static98.aClass92_937;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IZLclient!le;)V")
	public static void method2910(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class57 arg1) {
		if (Static47.aClass57_2 != null) {
			try {
				Static47.aClass57_2.method1672();
			} catch (@Pc(8) Exception local8) {
			}
			Static47.aClass57_2 = null;
		}
		Static47.aClass57_2 = arg1;
		Static138.method2071(arg0);
		Static68.aClass1_Sub14_3.anInt4061 = 0;
		Static96.anInt2014 = 0;
		Static139.aClass1_Sub14_4 = null;
		Static95.aClass1_Sub3_Sub23_1 = null;
		while (true) {
			@Pc(33) Class1_Sub3_Sub23 local33 = (Class1_Sub3_Sub23) Static193.aClass97_16.method3372();
			if (local33 == null) {
				while (true) {
					local33 = (Class1_Sub3_Sub23) Static193.aClass97_17.method3372();
					if (local33 == null) {
						if (Static53.aByte5 != 0) {
							try {
								@Pc(86) Class1_Sub14 local86 = new Class1_Sub14(4);
								local86.method3024(4);
								local86.method3024(Static53.aByte5);
								local86.method3020(0);
								Static47.aClass57_2.method1673(local86.aByteArray49, 4);
							} catch (@Pc(107) IOException local107) {
								try {
									Static47.aClass57_2.method1672();
								} catch (@Pc(112) Exception local112) {
								}
								Static47.aClass57_2 = null;
								Static157.anInt3249++;
							}
						}
						Static113.anInt2436 = 0;
						Static55.aLong59 = Static124.method1828();
						return;
					}
					Static143.aClass86_2.method2886(local33);
					Static153.aClass97_18.method3374(local33, local33.aLong251);
					Static175.anInt3777--;
					Static104.anInt2259++;
				}
			}
			Static106.aClass97_12.method3374(local33, local33.aLong251);
			Static106.anInt2305++;
			Static170.anInt3546--;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IBII)I")
	public static int method2911(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static146.aByteArrayArrayArray33[arg2][arg0][arg1] & 0x8) == 0) {
			return arg2 <= 0 || (Static146.aByteArrayArrayArray33[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}
}
