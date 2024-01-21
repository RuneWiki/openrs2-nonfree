import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!p", name = "j", descriptor = "J")
	private static long aLong64;

	@OriginalMember(owner = "client!p", name = "q", descriptor = "I")
	public static int anInt2216;

	@OriginalMember(owner = "client!p", name = "c", descriptor = "[I")
	public static int[] anIntArray300 = new int[1000];

	@OriginalMember(owner = "client!p", name = "f", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1004 = Static24.method441("m-Ochte sich mit Ihnen duellieren)3");

	@OriginalMember(owner = "client!p", name = "g", descriptor = "I")
	public static int anInt2211 = 0;

	@OriginalMember(owner = "client!p", name = "h", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1005 = Static24.method441("Name eingeben:");

	@OriginalMember(owner = "client!p", name = "i", descriptor = "I")
	public static final int anInt2212 = 0;

	@OriginalMember(owner = "client!p", name = "k", descriptor = "I")
	public static int anInt2213 = 0;

	@OriginalMember(owner = "client!p", name = "m", descriptor = "Lclient!s;")
	public static Class52 aClass52_9 = new Class52();

	@OriginalMember(owner = "client!p", name = "n", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1006 = Static24.method441("Maximale Anmelde)2Versuche -Uberschritten)3");

	@OriginalMember(owner = "client!p", name = "o", descriptor = "[I")
	public static int[] anIntArray301 = new int[128];

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
	public static void method1303() {
		Static42.aClass21_14.method743();
		Static51.aClass21_22.method743();
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
	public static void method1304() {
		aClass65_1006 = null;
		aClass65_1005 = null;
		anIntArray301 = null;
		aClass52_9 = null;
		anIntArray300 = null;
		aClass65_1004 = null;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method1305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (!Static46.method816(arg4)) {
			return false;
		}
		Static43.method1807(arg1, arg5, arg6, arg7);
		@Pc(18) boolean local18 = true;
		@Pc(22) Class2_Sub1_Sub2[] local22 = Static89.aClass2_Sub1_Sub2ArrayArray1[arg4];
		for (@Pc(29) int local29 = 0; local29 < local22.length; local29++) {
			@Pc(35) Class2_Sub1_Sub2 local35 = local22[local29];
			if (local35 != null && local35.anInt155 == arg2) {
				if (local35.anInt180 > 0) {
					Static29.method515(local35);
				}
				@Pc(64) int local64 = local35.anInt166 + arg5 - arg0;
				@Pc(69) int local69 = arg1 + local35.anInt203;
				if (local35.anInt179 == 0) {
					if (local35.aBoolean8 && !Static110.method1840(arg3, local29)) {
						continue;
					}
					if (local35.anInt192 > local35.anInt153 - local35.anInt170) {
						local35.anInt192 = local35.anInt153 - local35.anInt170;
					}
					if (local35.anInt192 < 0) {
						local35.anInt192 = 0;
					}
					local18 &= method1305(local35.anInt192, local69, local29, arg3, arg4, local64, local35.anInt161 + local69, local64 - -local35.anInt170);
					Static43.method1807(arg1, arg5, arg6, arg7);
					if (local35.anInt170 < local35.anInt153) {
						Static32.method630(local35.anInt161 + local69, local35.anInt153, local35.anInt170, local64, local35.anInt192);
					}
				}
				if (local35.anInt179 != 1) {
					@Pc(170) int local170;
					@Pc(174) int local174;
					@Pc(185) int local185;
					@Pc(254) int local254;
					@Pc(252) int local252;
					@Pc(277) int local277;
					@Pc(168) int local168;
					@Pc(245) int local245;
					if (local35.anInt179 == 2) {
						local168 = 0;
						for (local170 = 0; local170 < local35.anInt170; local170++) {
							for (local174 = 0; local174 < local35.anInt161; local174++) {
								local185 = (local35.anInt175 + 32) * local174 + local69;
								@Pc(194) int local194 = (local35.anInt171 + 32) * local170 + local64;
								if (local168 < 20) {
									local185 += local35.anIntArray24[local168];
									local194 += local35.anIntArray21[local168];
								}
								if (local35.anIntArray19[local168] > 0) {
									local245 = 0;
									local252 = local35.anIntArray19[local168] - 1;
									local254 = 0;
									if (local185 > Static43.anInt2927 - 32 && local185 < Static43.anInt2928 && local194 > Static43.anInt2926 - 32 && Static43.anInt2929 > local194 || Static40.anInt1296 != 0 && Static93.anInt2615 == local168) {
										local277 = 0;
										if (Static80.anInt2291 == 1 && anInt2216 == local168 && local29 + (arg4 << 16) == Static79.anInt2279) {
											local277 = 16777215;
										}
										@Pc(311) Class2_Sub1_Sub4_Sub2 local311 = Static70.method1271(local35.anIntArray26[local168], local252, local277);
										if (local311 == null) {
											local18 = false;
										} else {
											if (Static40.anInt1296 != 0 && local168 == Static93.anInt2615 && (arg4 << 16) + local29 == Static80.anInt2293) {
												local254 = Static85.anInt2459 - Static7.anInt298;
												local245 = Static16.anInt480 - Static18.anInt2532;
												if (local254 < 5 && local254 > -5) {
													local254 = 0;
												}
												if (local245 < 5 && local245 > -5) {
													local245 = 0;
												}
												if (Static13.anInt446 < 5) {
													local245 = 0;
													local254 = 0;
												}
												local311.method482(local185 + local245, local254 + local194);
												if (arg2 != -1) {
													@Pc(384) Class2_Sub1_Sub2 local384 = local22[arg2];
													@Pc(404) int local404;
													if (local194 + local254 < Static43.anInt2926 && local384.anInt192 > 0) {
														local404 = Static28.anInt794 * (Static43.anInt2926 - local254 - local194) / 3;
														if (Static28.anInt794 * 10 < local404) {
															local404 = Static28.anInt794 * 10;
														}
														if (local404 > local384.anInt192) {
															local404 = local384.anInt192;
														}
														local384.anInt192 -= local404;
														Static7.anInt298 += local404;
													}
													if (local194 + local254 + 32 > Static43.anInt2929 && local384.anInt192 < local384.anInt153 - local384.anInt170) {
														local404 = (local194 + local254 + 32 - Static43.anInt2929) * Static28.anInt794 / 3;
														if (Static28.anInt794 * 10 < local404) {
															local404 = Static28.anInt794 * 10;
														}
														if (local404 > local384.anInt153 - local384.anInt170 - local384.anInt192) {
															local404 = local384.anInt153 - local384.anInt192 - local384.anInt170;
														}
														Static7.anInt298 -= local404;
														local384.anInt192 += local404;
													}
												}
											} else if (Static1.anInt3 != 0 && Static46.anInt1372 == local168 && Static16.anInt497 == local29 + (arg4 << 16)) {
												local311.method482(local185, local194);
											} else {
												local311.method486(local185, local194);
											}
											if (local311.anInt760 == 33 || local35.anIntArray26[local168] != 1) {
												@Pc(549) int local549 = local35.anIntArray26[local168];
												Static60.aClass2_Sub1_Sub4_Sub4_2.method1828(Static6.method129(local549), local185 + local245 + 1, local194 + 10 - -local254, 0);
												Static60.aClass2_Sub1_Sub4_Sub4_2.method1828(Static6.method129(local549), local245 + local185, local254 + local194 - -9, 16776960);
											}
										}
									}
								} else if (local35.anIntArray23 != null && local168 < 20) {
									@Pc(229) Class2_Sub1_Sub4_Sub2 local229 = local35.method86(local168);
									if (local229 != null) {
										local229.method486(local185, local194);
									} else if (Static107.aBoolean155) {
										local18 = false;
									}
								}
								local168++;
							}
						}
					} else if (local35.anInt179 == 3) {
						if (Static80.method1359(local35)) {
							local168 = local35.anInt184;
							if (Static110.method1840(arg3, local29) && local35.anInt176 != 0) {
								local168 = local35.anInt176;
							}
						} else {
							local168 = local35.anInt205;
							if (Static110.method1840(arg3, local29) && local35.anInt206 != 0) {
								local168 = local35.anInt206;
							}
						}
						if (local35.anInt188 == 0) {
							if (local35.aBoolean9) {
								Static43.method1815(local69, local64, local35.anInt161, local35.anInt170, local168);
							} else {
								Static43.method1806(local69, local64, local35.anInt161, local35.anInt170, local168);
							}
						} else if (local35.aBoolean9) {
							Static43.method1810(local69, local64, local35.anInt161, local35.anInt170, local168, 256 - (local35.anInt188 & 0xFF));
						} else {
							Static43.method1818(local69, local64, local35.anInt161, local35.anInt170, local168, 256 - (local35.anInt188 & 0xFF));
						}
					} else {
						@Pc(715) Class2_Sub1_Sub4_Sub4 local715;
						if (local35.anInt179 == 4) {
							local715 = local35.method88();
							if (local715 != null) {
								@Pc(726) Class65 local726 = local35.aClass65_89;
								if (Static80.method1359(local35)) {
									local170 = local35.anInt184;
									if (Static110.method1840(arg3, local29) && local35.anInt176 != 0) {
										local170 = local35.anInt176;
									}
									if (local35.aClass65_88.method1760() > 0) {
										local726 = local35.aClass65_88;
									}
								} else {
									local170 = local35.anInt205;
									if (Static110.method1840(arg3, local29) && local35.anInt206 != 0) {
										local170 = local35.anInt206;
									}
								}
								if (local35.anInt159 == 6 && Static85.anInt2453 == (arg4 << 16) + local29) {
									local726 = Static6.aClass65_118;
									local170 = local35.anInt205;
								}
								if (Static43.anInt2925 == 479) {
									if (local170 == 16776960) {
										local170 = 255;
									}
									if (local170 == 49152) {
										local170 = 16777215;
									}
								}
								local726 = Static81.method1800(local35, local726);
								local715.method1825(local726, local69, local64, local35.anInt161, local35.anInt170, local170, local35.aBoolean11, local35.anInt197, local35.anInt163, local35.anInt187);
							} else if (Static107.aBoolean155) {
								local18 = false;
							}
						} else if (local35.anInt179 == 5) {
							@Pc(856) Class2_Sub1_Sub4_Sub2 local856 = local35.method85(Static80.method1359(local35));
							if (local856 != null) {
								local856.method486(local69, local64);
							} else if (Static107.aBoolean155) {
								local18 = false;
							}
						} else if (local35.anInt179 == 6) {
							Static10.method241(local69 + local35.anInt161 / 2, local64 + local35.anInt170 / 2);
							local168 = Class2_Sub1_Sub4_Sub1.anIntArray55[local35.anInt195] * local35.anInt181 >> 16;
							local170 = Class2_Sub1_Sub4_Sub1.anIntArray56[local35.anInt195] * local35.anInt181 >> 16;
							@Pc(911) boolean local911 = Static80.method1359(local35);
							if (local911) {
								local185 = local35.anInt177;
							} else {
								local185 = local35.anInt154;
							}
							@Pc(940) Class2_Sub1_Sub1_Sub6 local940;
							if (local35.anInt194 == 5) {
								if (local35.anInt152 == 0) {
									local940 = Static67.aClass49_2.method1492(null, -1, -1, null);
								} else {
									local940 = Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.method1512();
								}
							} else if (local185 == -1) {
								local940 = local35.method83(local911, -1, null, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.aClass49_1);
								if (local940 == null && Static107.aBoolean155) {
									local18 = false;
								}
							} else {
								@Pc(953) Class2_Sub1_Sub6 local953 = Static71.method1291(local185);
								local940 = local35.method83(local911, local35.anInt190, local953, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.aClass49_1);
								if (local940 == null && Static107.aBoolean155) {
									local18 = false;
								}
							}
							if (local940 != null) {
								local940.method1530(local35.anInt165, 0, local35.anInt195, 0, local168, local170);
							}
							Static10.method254();
						} else {
							if (local35.anInt179 == 7) {
								local715 = local35.method88();
								if (local715 == null) {
									if (Static107.aBoolean155) {
										local18 = false;
									}
									continue;
								}
								local170 = 0;
								for (local174 = 0; local174 < local35.anInt170; local174++) {
									for (local185 = 0; local185 < local35.anInt161; local185++) {
										if (local35.anIntArray19[local170] > 0) {
											@Pc(1045) Class2_Sub1_Sub8 local1045 = Static70.method1263(local35.anIntArray19[local170] - 1);
											@Pc(1048) Class65 local1048 = local1045.aClass65_820;
											if (local1048 == null) {
												local1048 = Static63.aClass65_857;
											}
											if (local1045.anInt1820 == 1 || local35.anIntArray26[local170] != 1) {
												local1048 = Static13.method282(new Class65[] { local1048, Static40.aClass65_567, Static6.method131(local35.anIntArray26[local170]) });
											}
											local254 = (local35.anInt175 + 115) * local185 + local69;
											local252 = local64 + local174 * (local35.anInt171 + 12);
											if (local35.anInt197 == 0) {
												local715.method1826(local1048, local254, local252, local35.anInt205, local35.aBoolean11);
											} else if (local35.anInt197 == 1) {
												local715.method1832(local1048, local35.anInt161 / 2 + local254, local252, local35.anInt205, local35.aBoolean11);
											} else {
												local715.method1833(local1048, local254 + local35.anInt161 - 1, local252, local35.anInt205, local35.aBoolean11);
											}
										}
										local170++;
									}
								}
							}
							if (local35.anInt179 == 8 && Static61.method1084(local29, arg3) && Static18.anInt2530 == Static34.anInt1140) {
								local168 = 0;
								local170 = 0;
								@Pc(1203) Class65 local1203 = local35.aClass65_89;
								@Pc(1205) Class2_Sub1_Sub4_Sub4 local1205 = Static110.aClass2_Sub1_Sub4_Sub4_3;
								local1203 = Static81.method1800(local35, local1203);
								@Pc(1228) Class65 local1228;
								while (local1203.method1760() > 0) {
									local245 = local1203.method1775(Static21.aClass65_1126);
									if (local245 == -1) {
										local1228 = local1203;
										local1203 = Static8.aClass65_145;
									} else {
										local1228 = local1203.method1772(local245, 0);
										local1203 = local1203.method1779(local245 + 2);
									}
									local254 = local1205.method1822(local1228);
									local170 += local1205.anInt2931 + 1;
									if (local168 < local254) {
										local168 = local254;
									}
								}
								local170 += 7;
								local168 += 6;
								local254 = local64 + local35.anInt170 + 5;
								local245 = local35.anInt161 + local69 - local168 - 5;
								if (local69 + 5 > local245) {
									local245 = local69 + 5;
								}
								if (local168 + local245 > arg6) {
									local245 = arg6 - local168;
								}
								if (local254 + local170 > arg7) {
									local254 = arg7 - local170;
								}
								Static43.method1815(local245, local254, local168, local170, 16777120);
								Static43.method1806(local245, local254, local168, local170, 0);
								local1203 = local35.aClass65_89;
								local252 = local254 + local1205.anInt2931 + 2;
								local1203 = Static81.method1800(local35, local1203);
								while (local1203.method1760() > 0) {
									local277 = local1203.method1775(Static21.aClass65_1126);
									if (local277 == -1) {
										local1228 = local1203;
										local1203 = Static8.aClass65_145;
									} else {
										local1228 = local1203.method1772(local277, 0);
										local1203 = local1203.method1779(local277 + 2);
									}
									local1205.method1826(local1228, local245 + 3, local252, 0, false);
									local252 += local1205.anInt2931 + 1;
								}
							}
						}
					}
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)J")
	public static synchronized long method1306() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (Static2.aLong5 > local5) {
			aLong64 += Static2.aLong5 - local5;
		}
		Static2.aLong5 = local5;
		return aLong64 + local5;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V")
	public static void method1307(@OriginalArg(1) int arg0) {
		if (arg0 == Static35.anInt1181) {
			return;
		}
		if (Static35.anInt1181 == 0) {
			Static93.method1619();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static80.anInt2283 = 0;
			Static24.anInt720 = 0;
			Static5.anInt242 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static9.aClass13_1 != null) {
			Static9.aClass13_1.method316();
			Static9.aClass13_1 = null;
		}
		if (Static35.anInt1181 == 25 || Static35.anInt1181 == 40) {
			Static70.method1260();
			Static43.method1808();
		}
		if (Static35.anInt1181 == 25) {
			Static101.anInt2786 = 1;
			Static37.anInt1221 = 0;
			Static81.anInt2904 = 1;
			Static98.anInt2762 = 0;
			Static48.anInt1404 = 0;
		}
		if (arg0 == 35) {
			Static89.method1571();
			Static30.method574();
			if (Static46.aClass15_34 == null) {
				Static46.aClass15_34 = Static18.method1551(503, Static70.aCanvas1, 765);
			}
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static46.aClass15_34 = null;
			Static89.method1571();
			Static18.method1552(Static28.aClass33_Sub1_15, Static19.aClass33_Sub1_31, Static70.aCanvas1);
		}
		if (arg0 == 25 || arg0 == 30 || arg0 == 40) {
			Static46.aClass15_34 = null;
			Static30.method574();
			Static42.method810(Static70.aCanvas1, Static28.aClass33_Sub1_15);
		}
		Static38.aBoolean74 = true;
		Static35.anInt1181 = arg0;
	}
}
