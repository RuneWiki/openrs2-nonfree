import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
	public static int anInt1730;

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "Lclient!rd;")
	public static Class72_Sub1 aClass72_Sub1_15;

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "Lclient!qe;")
	private static Class78 aClass78_388 = Static199.method3560("You can(Wt add yourself to your own friend list)3");

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "Lclient!qe;")
	public static Class78 aClass78_385 = aClass78_388;

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "Lclient!qe;")
	private static Class78 aClass78_389 = Static199.method3560("Choose Option");

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "Lclient!qe;")
	public static Class78 aClass78_386 = aClass78_389;

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "Lclient!qe;")
	public static Class78 aClass78_387 = Static199.method3560("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "[Lclient!qe;")
	public static Class78[] aClass78Array16 = new Class78[8];

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)Z")
	public static boolean method1339(@OriginalArg(0) int arg0) {
		if (Static202.aBooleanArray124[arg0]) {
			return true;
		} else if (Static11.aClass72_19.method3171(arg0)) {
			@Pc(21) int local21 = Static11.aClass72_19.method3177(arg0);
			if (local21 == 0) {
				Static202.aBooleanArray124[arg0] = true;
				return true;
			}
			if (Static181.aClass64ArrayArray1[arg0] == null) {
				Static181.aClass64ArrayArray1[arg0] = new Class64[local21];
			}
			for (@Pc(45) int local45 = 0; local45 < local21; local45++) {
				if (Static181.aClass64ArrayArray1[arg0][local45] == null) {
					@Pc(58) byte[] local58 = Static11.aClass72_19.method3197(local45, arg0);
					if (local58 != null) {
						Static181.aClass64ArrayArray1[arg0][local45] = new Class64();
						Static181.aClass64ArrayArray1[arg0][local45].anInt3044 = local45 + (arg0 << 16);
						if (local58[0] == -1) {
							Static181.aClass64ArrayArray1[arg0][local45].method2407(new Class2_Sub23(local58));
						} else {
							Static181.aClass64ArrayArray1[arg0][local45].method2409(new Class2_Sub23(local58));
						}
					}
				}
			}
			Static202.aBooleanArray124[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!df;Z)V")
	public static void method1341(@OriginalArg(0) Class2_Sub12 arg0, @OriginalArg(1) boolean arg1) {
		Static16.aClass44_61.method1355(arg0);
		while (true) {
			@Pc(8) Class2_Sub12 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(30) Class2_Sub12[][] local30;
			@Pc(47) Class2_Sub12 local47;
			@Pc(270) int local270;
			@Pc(665) int local665;
			@Pc(670) int local670;
			@Pc(675) int local675;
			@Pc(999) Class27 local999;
			@Pc(1172) int local1172;
			@Pc(1057) int local1057;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(276) Class100 var11;
										@Pc(678) int var16;
										@Pc(687) int var17;
										@Pc(699) int var18;
										@Pc(421) int var21;
										@Pc(308) boolean var22;
										@Pc(880) Class2_Sub12 var33;
										while (true) {
											do {
												local8 = (Class2_Sub12) Static16.aClass44_61.method1365();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean28);
											local17 = local8.anInt772;
											local20 = local8.anInt773;
											local23 = local8.anInt761;
											local26 = local8.anInt769;
											local30 = Static226.aClass2_Sub12ArrayArrayArray3[local23];
											if (!local8.aBoolean29) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local47 = Static226.aClass2_Sub12ArrayArrayArray3[local23 - 1][local17][local20];
													if (local47 != null && local47.aBoolean28) {
														continue;
													}
												}
												if (local17 <= Static179.anInt4190 && local17 > Static66.anInt1312) {
													local47 = local30[local17 - 1][local20];
													if (local47 != null && local47.aBoolean28 && (local47.aBoolean29 || (local8.anInt762 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static179.anInt4190 && local17 < Static96.anInt2119 - 1) {
													local47 = local30[local17 + 1][local20];
													if (local47 != null && local47.aBoolean28 && (local47.aBoolean29 || (local8.anInt762 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static11.anInt312 && local20 > Static190.anInt4422) {
													local47 = local30[local17][local20 - 1];
													if (local47 != null && local47.aBoolean28 && (local47.aBoolean29 || (local8.anInt762 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static11.anInt312 && local20 < Static100.anInt2197 - 1) {
													local47 = local30[local17][local20 + 1];
													if (local47 != null && local47.aBoolean28 && (local47.aBoolean29 || (local8.anInt762 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean29 = false;
											if (local8.aClass2_Sub12_1 != null) {
												local47 = local8.aClass2_Sub12_1;
												if (local47.aClass26_1 == null) {
													if (local47.aClass18_1 != null) {
														if (Static209.method3067(0, local17, local20)) {
															Static75.method1258(local47.aClass18_1, Static224.anInt4840, Static72.anInt4675, Static132.anInt3060, Static160.anInt3702, local17, local20, true);
														} else {
															Static75.method1258(local47.aClass18_1, Static224.anInt4840, Static72.anInt4675, Static132.anInt3060, Static160.anInt3702, local17, local20, false);
														}
													}
												} else if (Static209.method3067(0, local17, local20)) {
													Static211.method3687(local47.aClass26_1, 0, Static224.anInt4840, Static72.anInt4675, Static132.anInt3060, Static160.anInt3702, local17, local20, true);
												} else {
													Static211.method3687(local47.aClass26_1, 0, Static224.anInt4840, Static72.anInt4675, Static132.anInt3060, Static160.anInt3702, local17, local20, false);
												}
												@Pc(244) Class27 local244 = local47.aClass27_1;
												if (local244 != null) {
													local244.aClass5_2.method3779(0, Static224.anInt4840, Static72.anInt4675, Static132.anInt3060, Static160.anInt3702, local244.anInt808 - Static181.anInt4199, local244.anInt809 - Static53.anInt1723, local244.anInt810 - Static59.anInt1039, local244.aLong30);
												}
												for (local270 = 0; local270 < local47.anInt775; local270++) {
													var11 = local47.aClass100Array3[local270];
													if (var11 != null) {
														var11.aClass5_8.method3779(var11.anInt4526, Static224.anInt4840, Static72.anInt4675, Static132.anInt3060, Static160.anInt3702, var11.anInt4522 - Static181.anInt4199, var11.anInt4519 - Static53.anInt1723, var11.anInt4520 - Static59.anInt1039, var11.aLong169);
													}
												}
											}
											var22 = false;
											if (local8.aClass26_1 == null) {
												if (local8.aClass18_1 != null) {
													if (Static209.method3067(local26, local17, local20)) {
														Static75.method1258(local8.aClass18_1, Static224.anInt4840, Static72.anInt4675, Static132.anInt3060, Static160.anInt3702, local17, local20, true);
													} else {
														var22 = true;
														Static75.method1258(local8.aClass18_1, Static224.anInt4840, Static72.anInt4675, Static132.anInt3060, Static160.anInt3702, local17, local20, false);
													}
												}
											} else if (Static209.method3067(local26, local17, local20)) {
												Static211.method3687(local8.aClass26_1, local26, Static224.anInt4840, Static72.anInt4675, Static132.anInt3060, Static160.anInt3702, local17, local20, true);
											} else {
												var22 = true;
												if (local8.aClass26_1.anInt803 != 12345678 || Static194.aBoolean191 && local23 <= Static142.anInt3237) {
													Static211.method3687(local8.aClass26_1, local26, Static224.anInt4840, Static72.anInt4675, Static132.anInt3060, Static160.anInt3702, local17, local20, false);
												}
											}
											if (var22) {
												@Pc(388) Class106 local388 = local8.aClass106_1;
												if (local388 != null && (local388.aLong176 & 0xFFFFFFFF80000000L) != 0L) {
													local388.aClass5_11.method3779(0, Static224.anInt4840, Static72.anInt4675, Static132.anInt3060, Static160.anInt3702, local388.anInt4668 - Static181.anInt4199, local388.anInt4670 - Static53.anInt1723, local388.anInt4669 - Static59.anInt1039, local388.aLong176);
												}
											}
											var21 = 0;
											local270 = 0;
											@Pc(426) Class27 local426 = local8.aClass27_1;
											@Pc(429) Class104 local429 = local8.aClass104_1;
											if (local426 != null || local429 != null) {
												if (Static179.anInt4190 == local17) {
													var21++;
												} else if (Static179.anInt4190 < local17) {
													var21 += 2;
												}
												if (Static11.anInt312 == local20) {
													var21 += 3;
												} else if (Static11.anInt312 > local20) {
													var21 += 6;
												}
												local270 = Static47.anIntArray138[var21];
												local8.anInt765 = Static168.anIntArray754[var21];
											}
											if (local426 != null) {
												if ((local426.anInt811 & Static139.anIntArray448[var21]) == 0) {
													local8.anInt774 = 0;
												} else if (local426.anInt811 == 16) {
													local8.anInt774 = 3;
													local8.anInt771 = Static204.anIntArray733[var21];
													local8.anInt767 = 3 - local8.anInt771;
												} else if (local426.anInt811 == 32) {
													local8.anInt774 = 6;
													local8.anInt771 = Static147.anIntArray666[var21];
													local8.anInt767 = 6 - local8.anInt771;
												} else if (local426.anInt811 == 64) {
													local8.anInt774 = 12;
													local8.anInt771 = Static220.anIntArray773[var21];
													local8.anInt767 = 12 - local8.anInt771;
												} else {
													local8.anInt774 = 9;
													local8.anInt771 = Static28.anIntArray89[var21];
													local8.anInt767 = 9 - local8.anInt771;
												}
												if ((local426.anInt811 & local270) != 0 && !Static1.method3(local26, local17, local20, local426.anInt811)) {
													local426.aClass5_2.method3779(0, Static224.anInt4840, Static72.anInt4675, Static132.anInt3060, Static160.anInt3702, local426.anInt808 - Static181.anInt4199, local426.anInt809 - Static53.anInt1723, local426.anInt810 - Static59.anInt1039, local426.aLong30);
												}
												if ((local426.anInt812 & local270) != 0 && !Static1.method3(local26, local17, local20, local426.anInt812)) {
													local426.aClass5_3.method3779(0, Static224.anInt4840, Static72.anInt4675, Static132.anInt3060, Static160.anInt3702, local426.anInt808 - Static181.anInt4199, local426.anInt809 - Static53.anInt1723, local426.anInt810 - Static59.anInt1039, local426.aLong30);
												}
											}
											if (local429 != null && !Static194.method3535(local26, local17, local20, local429.aClass5_10.method3773())) {
												if ((local429.anInt4651 & local270) != 0) {
													local429.aClass5_10.method3779(0, Static224.anInt4840, Static72.anInt4675, Static132.anInt3060, Static160.anInt3702, local429.anInt4648 + local429.anInt4644 - Static181.anInt4199, local429.anInt4649 - Static53.anInt1723, local429.anInt4643 + local429.anInt4645 - Static59.anInt1039, local429.aLong175);
												} else if (local429.anInt4651 == 256) {
													local665 = local429.anInt4648 - Static181.anInt4199;
													local670 = local429.anInt4649 - Static53.anInt1723;
													local675 = local429.anInt4643 - Static59.anInt1039;
													var16 = local429.anInt4646;
													if (var16 == 1 || var16 == 2) {
														var17 = -local665;
													} else {
														var17 = local665;
													}
													if (var16 == 2 || var16 == 3) {
														var18 = -local675;
													} else {
														var18 = local675;
													}
													if (var18 < var17) {
														local429.aClass5_10.method3779(0, Static224.anInt4840, Static72.anInt4675, Static132.anInt3060, Static160.anInt3702, local665 + local429.anInt4644, local670, local675 + local429.anInt4645, local429.aLong175);
													} else if (local429.aClass5_9 != null) {
														local429.aClass5_9.method3779(0, Static224.anInt4840, Static72.anInt4675, Static132.anInt3060, Static160.anInt3702, local665, local670, local675, local429.aLong175);
													}
												}
											}
											if (var22) {
												@Pc(746) Class106 local746 = local8.aClass106_1;
												if (local746 != null && (local746.aLong176 & 0xFFFFFFFF80000000L) == 0L) {
													local746.aClass5_11.method3779(0, Static224.anInt4840, Static72.anInt4675, Static132.anInt3060, Static160.anInt3702, local746.anInt4668 - Static181.anInt4199, local746.anInt4670 - Static53.anInt1723, local746.anInt4669 - Static59.anInt1039, local746.aLong176);
												}
												@Pc(780) Class87 local780 = local8.aClass87_1;
												if (local780 != null && local780.anInt4409 == 0) {
													if (local780.aClass5_5 != null) {
														local780.aClass5_5.method3779(0, Static224.anInt4840, Static72.anInt4675, Static132.anInt3060, Static160.anInt3702, local780.anInt4411 - Static181.anInt4199, local780.anInt4414 - Static53.anInt1723, local780.anInt4413 - Static59.anInt1039, local780.aLong161);
													}
													if (local780.aClass5_7 != null) {
														local780.aClass5_7.method3779(0, Static224.anInt4840, Static72.anInt4675, Static132.anInt3060, Static160.anInt3702, local780.anInt4411 - Static181.anInt4199, local780.anInt4414 - Static53.anInt1723, local780.anInt4413 - Static59.anInt1039, local780.aLong161);
													}
													if (local780.aClass5_6 != null) {
														local780.aClass5_6.method3779(0, Static224.anInt4840, Static72.anInt4675, Static132.anInt3060, Static160.anInt3702, local780.anInt4411 - Static181.anInt4199, local780.anInt4414 - Static53.anInt1723, local780.anInt4413 - Static59.anInt1039, local780.aLong161);
													}
												}
											}
											local665 = local8.anInt762;
											if (local665 != 0) {
												if (local17 < Static179.anInt4190 && (local665 & 0x4) != 0) {
													var33 = local30[local17 + 1][local20];
													if (var33 != null && var33.aBoolean28) {
														Static16.aClass44_61.method1355(var33);
													}
												}
												if (local20 < Static11.anInt312 && (local665 & 0x2) != 0) {
													var33 = local30[local17][local20 + 1];
													if (var33 != null && var33.aBoolean28) {
														Static16.aClass44_61.method1355(var33);
													}
												}
												if (local17 > Static179.anInt4190 && (local665 & 0x1) != 0) {
													var33 = local30[local17 - 1][local20];
													if (var33 != null && var33.aBoolean28) {
														Static16.aClass44_61.method1355(var33);
													}
												}
												if (local20 > Static11.anInt312 && (local665 & 0x8) != 0) {
													var33 = local30[local17][local20 - 1];
													if (var33 != null && var33.aBoolean28) {
														Static16.aClass44_61.method1355(var33);
													}
												}
											}
											break;
										}
										if (local8.anInt774 != 0) {
											var22 = true;
											for (var21 = 0; var21 < local8.anInt775; var21++) {
												if (local8.aClass100Array3[var21].anInt4523 != Static132.anInt3070 && (local8.anIntArray128[var21] & local8.anInt774) == local8.anInt771) {
													var22 = false;
													break;
												}
											}
											if (var22) {
												local999 = local8.aClass27_1;
												if (!Static1.method3(local26, local17, local20, local999.anInt811)) {
													local999.aClass5_2.method3779(0, Static224.anInt4840, Static72.anInt4675, Static132.anInt3060, Static160.anInt3702, local999.anInt808 - Static181.anInt4199, local999.anInt809 - Static53.anInt1723, local999.anInt810 - Static59.anInt1039, local999.aLong30);
												}
												local8.anInt774 = 0;
											}
										}
										if (!local8.aBoolean30) {
											break;
										}
										try {
											@Pc(1037) int local1037 = local8.anInt775;
											local8.aBoolean30 = false;
											var21 = 0;
											label572: for (local270 = 0; local270 < local1037; local270++) {
												var11 = local8.aClass100Array3[local270];
												if (var11.anInt4523 != Static132.anInt3070) {
													for (local1057 = var11.anInt4529; local1057 <= var11.anInt4525; local1057++) {
														for (local665 = var11.anInt4517; local665 <= var11.anInt4528; local665++) {
															var33 = local30[local1057][local665];
															if (var33.aBoolean29) {
																local8.aBoolean30 = true;
																continue label572;
															}
															if (var33.anInt774 != 0) {
																local675 = 0;
																if (local1057 > var11.anInt4529) {
																	local675++;
																}
																if (local1057 < var11.anInt4525) {
																	local675 += 4;
																}
																if (local665 > var11.anInt4517) {
																	local675 += 8;
																}
																if (local665 < var11.anInt4528) {
																	local675 += 2;
																}
																if ((local675 & var33.anInt774) == local8.anInt767) {
																	local8.aBoolean30 = true;
																	continue label572;
																}
															}
														}
													}
													Static18.aClass100Array1[var21++] = var11;
													local665 = Static179.anInt4190 - var11.anInt4529;
													local670 = var11.anInt4525 - Static179.anInt4190;
													if (local670 > local665) {
														local665 = local670;
													}
													local675 = Static11.anInt312 - var11.anInt4517;
													var16 = var11.anInt4528 - Static11.anInt312;
													if (var16 > local675) {
														var11.anInt4515 = local665 + var16;
													} else {
														var11.anInt4515 = local665 + local675;
													}
												}
											}
											while (var21 > 0) {
												local1172 = -50;
												local1057 = -1;
												@Pc(1181) Class100 local1181;
												for (local665 = 0; local665 < var21; local665++) {
													local1181 = Static18.aClass100Array1[local665];
													if (local1181.anInt4523 != Static132.anInt3070) {
														if (local1181.anInt4515 > local1172) {
															local1172 = local1181.anInt4515;
															local1057 = local665;
														} else if (local1181.anInt4515 == local1172) {
															local675 = local1181.anInt4522 - Static181.anInt4199;
															var16 = local1181.anInt4520 - Static59.anInt1039;
															var17 = Static18.aClass100Array1[local1057].anInt4522 - Static181.anInt4199;
															var18 = Static18.aClass100Array1[local1057].anInt4520 - Static59.anInt1039;
															if (local675 * local675 + var16 * var16 > var17 * var17 + var18 * var18) {
																local1057 = local665;
															}
														}
													}
												}
												if (local1057 == -1) {
													break;
												}
												local1181 = Static18.aClass100Array1[local1057];
												local1181.anInt4523 = Static132.anInt3070;
												if (!Static184.method3393(local26, local1181.anInt4529, local1181.anInt4525, local1181.anInt4517, local1181.anInt4528, local1181.aClass5_8.method3773())) {
													local1181.aClass5_8.method3779(local1181.anInt4526, Static224.anInt4840, Static72.anInt4675, Static132.anInt3060, Static160.anInt3702, local1181.anInt4522 - Static181.anInt4199, local1181.anInt4519 - Static53.anInt1723, local1181.anInt4520 - Static59.anInt1039, local1181.aLong169);
												}
												for (local675 = local1181.anInt4529; local675 <= local1181.anInt4525; local675++) {
													for (var16 = local1181.anInt4517; var16 <= local1181.anInt4528; var16++) {
														@Pc(1305) Class2_Sub12 local1305 = local30[local675][var16];
														if (local1305.anInt774 != 0) {
															Static16.aClass44_61.method1355(local1305);
														} else if ((local675 != local17 || var16 != local20) && local1305.aBoolean28) {
															Static16.aClass44_61.method1355(local1305);
														}
													}
												}
											}
											if (!local8.aBoolean30) {
												break;
											}
										} catch (@Pc(1343) Exception local1343) {
											local8.aBoolean30 = false;
											break;
										}
									}
								} while (!local8.aBoolean28);
							} while (local8.anInt774 != 0);
							if (local17 > Static179.anInt4190 || local17 <= Static66.anInt1312) {
								break;
							}
							local47 = local30[local17 - 1][local20];
						} while (local47 != null && local47.aBoolean28);
						if (local17 < Static179.anInt4190 || local17 >= Static96.anInt2119 - 1) {
							break;
						}
						local47 = local30[local17 + 1][local20];
					} while (local47 != null && local47.aBoolean28);
					if (local20 > Static11.anInt312 || local20 <= Static190.anInt4422) {
						break;
					}
					local47 = local30[local17][local20 - 1];
				} while (local47 != null && local47.aBoolean28);
				if (local20 < Static11.anInt312 || local20 >= Static100.anInt2197 - 1) {
					break;
				}
				local47 = local30[local17][local20 + 1];
			} while (local47 != null && local47.aBoolean28);
			local8.aBoolean28 = false;
			Static23.anInt419--;
			@Pc(1447) Class87 local1447 = local8.aClass87_1;
			if (local1447 != null && local1447.anInt4409 != 0) {
				if (local1447.aClass5_5 != null) {
					local1447.aClass5_5.method3779(0, Static224.anInt4840, Static72.anInt4675, Static132.anInt3060, Static160.anInt3702, local1447.anInt4411 - Static181.anInt4199, local1447.anInt4414 - Static53.anInt1723 - local1447.anInt4409, local1447.anInt4413 - Static59.anInt1039, local1447.aLong161);
				}
				if (local1447.aClass5_7 != null) {
					local1447.aClass5_7.method3779(0, Static224.anInt4840, Static72.anInt4675, Static132.anInt3060, Static160.anInt3702, local1447.anInt4411 - Static181.anInt4199, local1447.anInt4414 - Static53.anInt1723 - local1447.anInt4409, local1447.anInt4413 - Static59.anInt1039, local1447.aLong161);
				}
				if (local1447.aClass5_6 != null) {
					local1447.aClass5_6.method3779(0, Static224.anInt4840, Static72.anInt4675, Static132.anInt3060, Static160.anInt3702, local1447.anInt4411 - Static181.anInt4199, local1447.anInt4414 - Static53.anInt1723 - local1447.anInt4409, local1447.anInt4413 - Static59.anInt1039, local1447.aLong161);
				}
			}
			if (local8.anInt765 != 0) {
				@Pc(1542) Class104 local1542 = local8.aClass104_1;
				if (local1542 != null && !Static194.method3535(local26, local17, local20, local1542.aClass5_10.method3773())) {
					if ((local1542.anInt4651 & local8.anInt765) != 0) {
						local1542.aClass5_10.method3779(0, Static224.anInt4840, Static72.anInt4675, Static132.anInt3060, Static160.anInt3702, local1542.anInt4648 + local1542.anInt4644 - Static181.anInt4199, local1542.anInt4649 - Static53.anInt1723, local1542.anInt4643 + local1542.anInt4645 - Static59.anInt1039, local1542.aLong175);
					} else if (local1542.anInt4651 == 256) {
						local270 = local1542.anInt4648 - Static181.anInt4199;
						local1172 = local1542.anInt4649 - Static53.anInt1723;
						local1057 = local1542.anInt4643 - Static59.anInt1039;
						local665 = local1542.anInt4646;
						if (local665 == 1 || local665 == 2) {
							local670 = -local270;
						} else {
							local670 = local270;
						}
						if (local665 == 2 || local665 == 3) {
							local675 = -local1057;
						} else {
							local675 = local1057;
						}
						if (local675 >= local670) {
							local1542.aClass5_10.method3779(0, Static224.anInt4840, Static72.anInt4675, Static132.anInt3060, Static160.anInt3702, local270 + local1542.anInt4644, local1172, local1057 + local1542.anInt4645, local1542.aLong175);
						} else if (local1542.aClass5_9 != null) {
							local1542.aClass5_9.method3779(0, Static224.anInt4840, Static72.anInt4675, Static132.anInt3060, Static160.anInt3702, local270, local1172, local1057, local1542.aLong175);
						}
					}
				}
				local999 = local8.aClass27_1;
				if (local999 != null) {
					if ((local999.anInt812 & local8.anInt765) != 0 && !Static1.method3(local26, local17, local20, local999.anInt812)) {
						local999.aClass5_3.method3779(0, Static224.anInt4840, Static72.anInt4675, Static132.anInt3060, Static160.anInt3702, local999.anInt808 - Static181.anInt4199, local999.anInt809 - Static53.anInt1723, local999.anInt810 - Static59.anInt1039, local999.aLong30);
					}
					if ((local999.anInt811 & local8.anInt765) != 0 && !Static1.method3(local26, local17, local20, local999.anInt811)) {
						local999.aClass5_2.method3779(0, Static224.anInt4840, Static72.anInt4675, Static132.anInt3060, Static160.anInt3702, local999.anInt808 - Static181.anInt4199, local999.anInt809 - Static53.anInt1723, local999.anInt810 - Static59.anInt1039, local999.aLong30);
					}
				}
			}
			@Pc(1762) Class2_Sub12 local1762;
			if (local23 < Static78.anInt1716 - 1) {
				local1762 = Static226.aClass2_Sub12ArrayArrayArray3[local23 + 1][local17][local20];
				if (local1762 != null && local1762.aBoolean28) {
					Static16.aClass44_61.method1355(local1762);
				}
			}
			if (local17 < Static179.anInt4190) {
				local1762 = local30[local17 + 1][local20];
				if (local1762 != null && local1762.aBoolean28) {
					Static16.aClass44_61.method1355(local1762);
				}
			}
			if (local20 < Static11.anInt312) {
				local1762 = local30[local17][local20 + 1];
				if (local1762 != null && local1762.aBoolean28) {
					Static16.aClass44_61.method1355(local1762);
				}
			}
			if (local17 > Static179.anInt4190) {
				local1762 = local30[local17 - 1][local20];
				if (local1762 != null && local1762.aBoolean28) {
					Static16.aClass44_61.method1355(local1762);
				}
			}
			if (local20 > Static11.anInt312) {
				local1762 = local30[local17][local20 - 1];
				if (local1762 != null && local1762.aBoolean28) {
					Static16.aClass44_61.method1355(local1762);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IBII)I")
	public static int method1342(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 <= arg0) {
			return arg2 < arg0 ? arg2 : arg0;
		} else {
			return arg1;
		}
	}
}
