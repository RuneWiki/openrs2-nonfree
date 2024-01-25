import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!ku", name = "j", descriptor = "Lclient!g;")
	public static Class83 aClass83_16;

	@OriginalMember(owner = "client!ku", name = "k", descriptor = "I")
	public static int anInt637;

	@OriginalMember(owner = "client!ku", name = "l", descriptor = "I")
	public static int anInt638;

	@OriginalMember(owner = "client!ku", name = "e", descriptor = "Lclient!co;")
	public static final Class41 aClass41_3 = new Class41(4);

	@OriginalMember(owner = "client!ku", name = "g", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_16 = new Class208(103, -2);

	@OriginalMember(owner = "client!ku", name = "h", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_22 = new Class62("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

	@OriginalMember(owner = "client!ku", name = "i", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_10 = new Class183(1, 3);

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)V")
	public static void method508() {
		Static306.anInt5654 = 0;
		Static93.anInt1979 = 0;
		Static291.anInt5452 = 0;
		Static241.anInt2712 = 0;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lclient!cj;B)V")
	public static void method510(@OriginalArg(0) Class1_Sub2_Sub1_Sub1 arg0) {
		@Pc(15) Class2_Sub41 local15 = (Class2_Sub41) Static309.aClass243_26.method5967((long) arg0.anInt5374);
		if (local15 == null) {
			Static168.method2962(0, arg0.aByte73, arg0.anIntArray465[0], null, arg0, null, arg0.anIntArray466[0]);
		} else {
			local15.method5986();
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(ILclient!oj;II)V")
	public static void method511(@OriginalArg(0) int arg0, @OriginalArg(1) Class48 arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg0 < 0 || Static28.anInt429 == 0 || Static46.anInt5339 == 0) {
			return;
		}
		arg1.method2469(Static309.anInt5673, Static64.anInt1441, Static28.anInt429, Static46.anInt5339);
		arg1.method2496(Static352.anInt6483, Static284.anInt5624, Static28.anInt429, Static46.anInt5339);
		@Pc(32) Class21 local32 = arg1.method2483();
		local32.method3704(Static349.anInt6420, Static91.anInt1959, Static128.anInt2778, Static337.anInt6240, Static68.anInt1511, Static127.anInt2769);
		arg1.method2482(local32);
		@Pc(61) int local61;
		@Pc(70) int local70;
		@Pc(73) int local73;
		@Pc(82) int local82;
		@Pc(90) int local90;
		@Pc(105) int[] local105;
		@Pc(137) int local137;
		@Pc(146) int local146;
		if (Static210.aClass149Array5 != null) {
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			@Pc(52) int local52 = arg1.method2539();
			local61 = (arg2 - Static309.anInt5673) * local52 / Static28.anInt429;
			local70 = (arg0 - Static64.anInt1441) * local52 / Static46.anInt5339;
			local73 = arg1.method2508();
			local82 = local73 * (arg2 - Static309.anInt5673) / Static28.anInt429;
			local90 = (arg0 - Static64.anInt1441) * local73 / Static46.anInt5339;
			local105 = new int[] { local61, local70, local52 };
			local32.method3702(local105);
			@Pc(123) int[] local123 = new int[] { local82, local90, local73 };
			local32.method3702(local123);
			@Pc(128) float local128 = 0.0F;
			local137 = local123[0] - local105[0];
			local146 = local123[1] - local105[1];
			@Pc(154) int local154 = local123[2] - local105[2];
			while (local128 < 1.0F) {
				@Pc(167) int local167 = (int) ((float) local105[0] + (float) local137 * local128);
				@Pc(171) int local171 = local167 >> 7;
				@Pc(182) int local182 = (int) ((float) local105[2] + (float) local154 * local128);
				@Pc(186) int local186 = local182 >> 7;
				if (local171 > 0 && local186 > 0 && Static89.anInt1891 > local171 && local186 < Static85.anInt1839) {
					@Pc(206) int local206 = Static182.aClass1_Sub2_Sub1_Sub1_1.aByte73;
					if (local206 < 3 && (Static329.aByteArrayArrayArray17[1][local171][local186] & 0x2) != 0) {
						local206++;
					}
					if ((float) Static210.aClass149Array5[local206].method5839(local167, local182) < local128 * (float) local146 + (float) local105[1]) {
						local47 = local167 + (Static182.aClass1_Sub2_Sub1_Sub1_1.method4792() - 1) * 64 >> 7;
						local49 = local182 + (Static182.aClass1_Sub2_Sub1_Sub1_1.method4792() - 1) * 64 >> 7;
						break;
					}
				}
				local128 = (float) ((double) local128 + 0.01D);
			}
			if (local47 != -1 && local49 != -1) {
				if (Static45.aBoolean446 && (Static272.anInt5116 & 0x40) != 0) {
					@Pc(336) Class3 local336 = Static134.method2355(Static92.anInt1971, Static306.anInt5658);
					if (local336 == null) {
						Static49.method729();
					} else {
						Static51.method787(0L, local47, 21, -1, Static5.anInt136, Static207.aString34, local49, false, " ->", true);
					}
				} else {
					if (Static85.aClass38_1 == Static202.aClass38_2) {
						Static51.method787(0L, local47, 23, -1, -1, Static290.aClass62_193.method1389(Static200.anInt4144), local49, false, "", true);
					}
					Static51.method787(0L, local47, 9, -1, -1, Static330.aString59, local49, false, "", true);
				}
			}
		}
		@Pc(358) Class199 local358 = Static349.aClass199_7;
		for (@Pc(365) Class7_Sub5 local365 = (Class7_Sub5) local358.method4896(); local365 != null; local365 = (Class7_Sub5) local358.method4902()) {
			if (local365.anInt4257 == Static182.aClass1_Sub2_Sub1_Sub1_1.aByte73 && local365.method3785(arg1, arg2, arg0)) {
				@Pc(487) int local487;
				if (local365.aClass1_1 instanceof Class1_Sub2_Sub1_Sub1) {
					@Pc(387) Class1_Sub2_Sub1_Sub1 local387 = (Class1_Sub2_Sub1_Sub1) local365.aClass1_1;
					local61 = local387.method4792();
					if ((local61 & 0x1) == 0 && (local387.anInt6800 & 0x7F) == 0 && (local387.anInt6798 & 0x7F) == 0 || (local61 & 0x1) == 1 && (local387.anInt6800 & 0x7F) == 64 && (local387.anInt6798 & 0x7F) == 64) {
						local70 = local387.anInt6800 + 64 - local387.method4792() * 64;
						local73 = local387.anInt6798 - (local387.method4792() - 1) * 64;
						@Pc(499) int local499;
						for (local82 = 0; local82 < Static123.anInt5933; local82++) {
							@Pc(465) Class1_Sub2_Sub1_Sub2 local465 = Static223.aClass1_Sub2_Sub1_Sub2Array1[Static373.anIntArray577[local82]];
							if (local465 != null && local465.anInt5398 != Static339.anInt6265 && local465.aBoolean395) {
								local487 = local465.anInt6800 + 64 - local465.aClass197_1.anInt5486 * 64;
								local499 = local465.anInt6798 - (local465.aClass197_1.anInt5486 - 1) * 64;
								if (local487 >= local70 && local465.aClass197_1.anInt5486 <= local387.method4792() - (local487 - local70 >> 7) && local499 >= local73 && local465.aClass197_1.anInt5486 <= local387.method4792() - (local499 - local73 >> 7)) {
									Static235.method4212(local465, Static182.aClass1_Sub2_Sub1_Sub1_1.aByte73 != local365.anInt4257);
									local465.anInt5398 = Static339.anInt6265;
								}
							}
						}
						local90 = Static97.anInt2139;
						local105 = Static321.anIntArray512;
						for (local499 = 0; local499 < local90; local499++) {
							@Pc(572) Class1_Sub2_Sub1_Sub1 local572 = Static42.aClass1_Sub2_Sub1_Sub1Array1[local105[local499]];
							if (local572 != null && Static339.anInt6265 != local572.anInt5398 && local572 != local387 && local572.aBoolean395) {
								local137 = local572.anInt6800 + 64 - local572.method4792() * 64;
								local146 = local572.anInt6798 + 64 - local572.method4792() * 64;
								if (local137 >= local70 && local572.method4792() <= local387.method4792() - (local137 - local70 >> 7) && local73 <= local146 && local572.method4792() <= local387.method4792() - (local146 - local73 >> 7)) {
									Static169.method5045(local365.anInt4257 != Static182.aClass1_Sub2_Sub1_Sub1_1.aByte73, local572);
									local572.anInt5398 = Static339.anInt6265;
								}
							}
						}
					}
					if (Static339.anInt6265 == local387.anInt5398) {
						continue;
					}
					Static169.method5045(Static182.aClass1_Sub2_Sub1_Sub1_1.aByte73 != local365.anInt4257, local387);
					local387.anInt5398 = Static339.anInt6265;
				}
				if (local365.aClass1_1 instanceof Class1_Sub2_Sub1_Sub2) {
					@Pc(701) Class1_Sub2_Sub1_Sub2 local701 = (Class1_Sub2_Sub1_Sub2) local365.aClass1_1;
					if (local701.aClass197_1 != null) {
						if ((local701.aClass197_1.anInt5486 & 0x1) == 0 && (local701.anInt6800 & 0x7F) == 0 && (local701.anInt6798 & 0x7F) == 0 || (local701.aClass197_1.anInt5486 & 0x1) == 1 && (local701.anInt6800 & 0x7F) == 64 && (local701.anInt6798 & 0x7F) == 64) {
							local61 = local701.anInt6800 + 64 - local701.aClass197_1.anInt5486 * 64;
							local70 = local701.anInt6798 - (local701.aClass197_1.anInt5486 - 1) * 64;
							for (local73 = 0; local73 < Static123.anInt5933; local73++) {
								@Pc(775) Class1_Sub2_Sub1_Sub2 local775 = Static223.aClass1_Sub2_Sub1_Sub2Array1[Static373.anIntArray577[local73]];
								if (local775 != null && Static339.anInt6265 != local775.anInt5398 && local775 != local701 && local775.aBoolean395) {
									local90 = local775.anInt6800 + 64 - local775.aClass197_1.anInt5486 * 64;
									local487 = local775.anInt6798 + 64 - local775.aClass197_1.anInt5486 * 64;
									if (local90 >= local61 && local775.aClass197_1.anInt5486 <= local701.aClass197_1.anInt5486 - (local90 - local61 >> 7) && local487 >= local70 && local701.aClass197_1.anInt5486 - (local487 - local70 >> 7) >= local775.aClass197_1.anInt5486) {
										Static235.method4212(local775, Static182.aClass1_Sub2_Sub1_Sub1_1.aByte73 != local365.anInt4257);
										local775.anInt5398 = Static339.anInt6265;
									}
								}
							}
							local82 = Static97.anInt2139;
							@Pc(880) int[] local880 = Static321.anIntArray512;
							for (local487 = 0; local487 < local82; local487++) {
								@Pc(890) Class1_Sub2_Sub1_Sub1 local890 = Static42.aClass1_Sub2_Sub1_Sub1Array1[local880[local487]];
								if (local890 != null && local890.anInt5398 != Static339.anInt6265 && local890.aBoolean395) {
									@Pc(916) int local916 = local890.anInt6800 + 64 - local890.method4792() * 64;
									local137 = local890.anInt6798 - (local890.method4792() - 1) * 64;
									if (local916 >= local61 && local890.method4792() <= local701.aClass197_1.anInt5486 - (local916 - local61 >> 7) && local137 >= local70 && local890.method4792() <= local701.aClass197_1.anInt5486 - (local137 - local70 >> 7)) {
										Static169.method5045(local365.anInt4257 != Static182.aClass1_Sub2_Sub1_Sub1_1.aByte73, local890);
										local890.anInt5398 = Static339.anInt6265;
									}
								}
							}
						}
						if (Static339.anInt6265 == local701.anInt5398) {
							continue;
						}
						Static235.method4212(local701, Static182.aClass1_Sub2_Sub1_Sub1_1.aByte73 != local365.anInt4257);
						local701.anInt5398 = Static339.anInt6265;
					}
				}
				if (local365.aClass1_1 instanceof Class1_Sub4_Sub1) {
					@Pc(1035) Class2_Sub30 local1035 = (Class2_Sub30) Static301.aClass243_24.method5967((long) (local365.anInt4257 << 28 | local365.anInt4260 << 14 | local365.anInt4258));
					if (local1035 != null) {
						for (@Pc(1043) Class2_Sub34 local1043 = (Class2_Sub34) local1035.aClass238_22.method5800(); local1043 != null; local1043 = (Class2_Sub34) local1035.aClass238_22.method5798()) {
							@Pc(1051) Class152 local1051 = Static57.aClass196_1.method4827(local1043.anInt5599);
							if (!Static45.aBoolean446) {
								if (local365.anInt4257 == Static182.aClass1_Sub2_Sub1_Sub1_1.aByte73) {
									@Pc(1061) String[] local1061 = local1051.aStringArray23;
									for (local82 = 4; local82 >= 0; local82--) {
										if (local1061 != null && local1061[local82] != null) {
											@Pc(1073) byte local1073 = 0;
											local487 = Static134.anInt2940;
											if (local82 == 0) {
												local1073 = 19;
											}
											if (local82 == 1) {
												local1073 = 12;
											}
											if (local82 == 2) {
												local1073 = 20;
											}
											if (local82 == 3) {
												local1073 = 58;
											}
											if (local1051.anInt4359 == local82) {
												local487 = local1051.anInt4315;
											}
											if (local82 == 4) {
												local1073 = 17;
											}
											if (local1051.anInt4334 == local82) {
												local487 = local1051.anInt4313;
											}
											Static51.method787((long) local1043.anInt5599, local365.anInt4258, local1073, -1, local487, local1061[local82], local365.anInt4260, false, "<col=ff9040>" + local1051.aString35, true);
										}
									}
								}
								Static51.method787((long) local1043.anInt5599, local365.anInt4258, 1012, -1, Static27.anInt2840, Static319.aClass62_213.method1389(Static200.anInt4144), local365.anInt4260, Static182.aClass1_Sub2_Sub1_Sub1_1.aByte73 != local365.anInt4257, "<col=ff9040>" + local1051.aString35, true);
							} else if (Static182.aClass1_Sub2_Sub1_Sub1_1.aByte73 == local365.anInt4257) {
								@Pc(1215) Class20 local1215 = Static56.anInt5212 == -1 ? null : Static57.aClass79_1.method1851(Static56.anInt5212);
								if ((Static272.anInt5116 & 0x1) != 0 && (local1215 == null || local1051.method3845(Static56.anInt5212, local1215.anInt369) != local1215.anInt369)) {
									Static51.method787((long) local1043.anInt5599, local365.anInt4258, 3, -1, Static5.anInt136, Static207.aString34, local365.anInt4260, false, Static343.aString60 + " -> <col=ff9040>" + local1051.aString35, true);
								}
							}
						}
					}
				}
				if (local365.aClass1_1 instanceof Interface8) {
					@Pc(1278) Interface8 local1278 = (Interface8) local365.aClass1_1;
					@Pc(1285) Class47 local1285 = Static230.aClass96_4.method2303(local1278.method6034());
					if (local1285.anIntArray95 != null) {
						local1285 = local1285.method903(Static179.aClass115_1);
					}
					if (local1285 != null) {
						if (!Static45.aBoolean446) {
							if (local365.anInt4257 == Static182.aClass1_Sub2_Sub1_Sub1_1.aByte73) {
								@Pc(1309) String[] local1309 = local1285.aStringArray7;
								if (local1309 != null) {
									for (local73 = 4; local73 >= 0; local73--) {
										if (local1309[local73] != null) {
											@Pc(1321) short local1321 = 0;
											local90 = Static134.anInt2940;
											if (local73 == 0) {
												local1321 = 2;
											}
											if (local73 == 1) {
												local1321 = 57;
											}
											if (local73 == 2) {
												local1321 = 10;
											}
											if (local73 == 3) {
												local1321 = 45;
											}
											if (local1285.anInt1276 == local73) {
												local90 = local1285.anInt1259;
											}
											if (local73 == 4) {
												local1321 = 1002;
											}
											if (local73 == local1285.anInt1264) {
												local90 = local1285.anInt1255;
											}
											Static51.method787(Static376.method5750(local365.anInt4260, local365.anInt4258, local1278), local365.anInt4258, local1321, -1, local90, local1309[local73], local365.anInt4260, false, "<col=00ffff>" + local1285.aString13, true);
										}
									}
								}
							}
							Static51.method787((long) local1285.anInt1234, local365.anInt4258, 1004, -1, Static27.anInt2840, Static319.aClass62_213.method1389(Static200.anInt4144), local365.anInt4260, local365.anInt4257 != Static182.aClass1_Sub2_Sub1_Sub1_1.aByte73, "<col=00ffff>" + local1285.aString13, true);
						} else if (local365.anInt4257 == Static182.aClass1_Sub2_Sub1_Sub1_1.aByte73) {
							@Pc(1468) Class20 local1468 = Static56.anInt5212 == -1 ? null : Static57.aClass79_1.method1851(Static56.anInt5212);
							if ((Static272.anInt5116 & 0x4) != 0 && (local1468 == null || local1285.method891(local1468.anInt369, Static56.anInt5212) != local1468.anInt369)) {
								Static51.method787(Static376.method5750(local365.anInt4260, local365.anInt4258, local1278), local365.anInt4258, 51, -1, Static5.anInt136, Static207.aString34, local365.anInt4260, false, Static343.aString60 + " -> <col=00ffff>" + local1285.aString13, true);
							}
						}
					}
				}
			}
		}
	}
}
