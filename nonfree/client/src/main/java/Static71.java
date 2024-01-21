import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!m", name = "c", descriptor = "Lclient!pd;")
	public static Class20 aClass20_35;

	@OriginalMember(owner = "client!m", name = "o", descriptor = "Lclient!mf;")
	public static Class4_Sub2_Sub3_Sub3 aClass4_Sub2_Sub3_Sub3_4;

	@OriginalMember(owner = "client!m", name = "e", descriptor = "Lclient!ja;")
	public static Class39 aClass39_917 = Static28.method504("<col=ffb000>");

	@OriginalMember(owner = "client!m", name = "g", descriptor = "Lclient!he;")
	public static Class4_Sub5 aClass4_Sub5_38 = null;

	@OriginalMember(owner = "client!m", name = "h", descriptor = "I")
	public static int anInt1738 = 0;

	@OriginalMember(owner = "client!m", name = "i", descriptor = "[Lclient!ja;")
	public static Class39[] aClass39Array13 = new Class39[1000];

	@OriginalMember(owner = "client!m", name = "j", descriptor = "I")
	public static volatile int anInt1739 = 0;

	@OriginalMember(owner = "client!m", name = "s", descriptor = "Lclient!ja;")
	public static Class39 aClass39_918 = Static28.method504("(Y<)4col>");

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)Lclient!mf;")
	public static Class4_Sub2_Sub3_Sub3 method1191() {
		@Pc(20) Class4_Sub2_Sub3_Sub3 local20 = new Class4_Sub2_Sub3_Sub3(Static121.anIntArray320, Static21.anIntArray61, Static16.anIntArray49, Static114.anIntArray308, Static70.aByteArrayArray6);
		Static120.method2049();
		return local20;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!pd;II)Lclient!nd;")
	public static Class4_Sub15 method1192(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) byte[] local13 = arg0.method486(arg1);
		return local13 == null ? null : new Class4_Sub15(local13);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(III[Lclient!he;IIIIII)V")
	public static void method1193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class4_Sub5[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static17.method1680(arg5, arg4, arg8, arg7);
		Static57.method1043();
		for (@Pc(18) int local18 = 0; local18 < arg2.length; local18++) {
			@Pc(24) Class4_Sub5 local24 = arg2[local18];
			if (local24 != null && (local24.anInt1199 == arg6 || arg6 == -1412584499 && local24 == Static129.aClass4_Sub5_72)) {
				@Pc(44) int local44;
				if (arg3 == -1) {
					Static11.anIntArray38[Static87.anInt2227] = local24.anInt1245 + arg0;
					Static30.anIntArray89[Static87.anInt2227] = arg1 + local24.anInt1201;
					Static108.anIntArray301[Static87.anInt2227] = local24.anInt1244;
					Static94.anIntArray252[Static87.anInt2227] = local24.anInt1259;
					local44 = Static87.anInt2227++;
				} else {
					local44 = arg3;
				}
				local24.anInt1250 = anInt1738;
				local24.anInt1218 = local44;
				if (!local24.aBoolean63 || !method1194(local24)) {
					if (local24.anInt1241 > 0) {
						Static16.method260(local24);
					}
					@Pc(100) int local100 = arg1 + local24.anInt1201;
					@Pc(105) int local105 = arg0 + local24.anInt1245;
					@Pc(108) int local108 = local24.anInt1205;
					@Pc(136) int local136;
					@Pc(142) int local142;
					if (local24 == Static129.aClass4_Sub5_72) {
						if (arg6 != -1412584499 && !local24.aBoolean58) {
							Static96.aClass4_Sub5Array2 = arg2;
							Static87.anInt2230 = arg0;
							Static28.anInt758 = arg1;
							continue;
						}
						if (!local24.aBoolean58) {
							local108 = 128;
						}
						if (Static14.aBoolean13 && Static62.aBoolean92) {
							local136 = Static88.anInt2198;
							local136 -= Static58.anInt1549;
							local142 = Static73.anInt1769;
							if (Static115.anInt2883 > local136) {
								local136 = Static115.anInt2883;
							}
							if (aClass4_Sub5_38.anInt1244 + Static115.anInt2883 < local136 + local24.anInt1244) {
								local136 = aClass4_Sub5_38.anInt1244 + Static115.anInt2883 - local24.anInt1244;
							}
							local105 = local136;
							local142 -= Static77.anInt1849;
							if (Static2.anInt12 > local142) {
								local142 = Static2.anInt12;
							}
							if (local24.anInt1259 + local142 > aClass4_Sub5_38.anInt1259 + Static2.anInt12) {
								local142 = aClass4_Sub5_38.anInt1259 + Static2.anInt12 - local24.anInt1259;
							}
							local100 = local142;
						}
					}
					@Pc(212) int local212;
					@Pc(214) int local214;
					@Pc(247) int local247;
					@Pc(252) int local252;
					@Pc(285) int local285;
					@Pc(290) int local290;
					if (local24.anInt1225 == 2) {
						local136 = arg5;
						local212 = arg8;
						local214 = arg7;
						local142 = arg4;
					} else if (local24.anInt1225 == 9) {
						local247 = local105;
						local252 = local100;
						local285 = local24.anInt1244 + local105;
						local290 = local24.anInt1259 + local100;
						if (local105 > local285) {
							local247 = local285;
							local285 = local105;
						}
						local136 = local247 <= arg5 ? arg5 : local247;
						local285++;
						local212 = local285 < arg8 ? local285 : arg8;
						if (local290 < local100) {
							local252 = local290;
							local290 = local100;
						}
						local290++;
						local214 = local290 < arg7 ? local290 : arg7;
						local142 = local252 > arg4 ? local252 : arg4;
					} else {
						local136 = local105 > arg5 ? local105 : arg5;
						local142 = arg4 < local100 ? local100 : arg4;
						local247 = local24.anInt1244 + local105;
						local252 = local24.anInt1259 + local100;
						local214 = arg7 > local252 ? local252 : arg7;
						local212 = local247 < arg8 ? local247 : arg8;
					}
					if (!local24.aBoolean63 || local212 > local136 && local142 < local214) {
						if (local24.anInt1241 != 0) {
							if (local24.anInt1241 == 1337) {
								Static23.anInt646 = local100;
								Static102.anInt2543 = local105;
								Static102.method1842(local105, local24.anInt1244, local24.anInt1259, local100);
								Static17.method1680(arg5, arg4, arg8, arg7);
								continue;
							}
							if (local24.anInt1241 == 1338) {
								Static68.method1170(local105, local44, local100);
								Static17.method1680(arg5, arg4, arg8, arg7);
								continue;
							}
						}
						local247 = Static88.anInt2198;
						local252 = Static73.anInt1769;
						if (!Static101.aBoolean122 && local136 <= local247 && local142 <= local252 && local247 < local212 && local214 > local252) {
							Static109.method1928(local24, local247 - local105, local252 - local100);
						}
						if (local24.anInt1225 == 0) {
							if (!local24.aBoolean63 && method1194(local24) && local24 != Static83.aClass4_Sub5_43) {
								continue;
							}
							if (!local24.aBoolean63) {
								if (local24.anInt1251 - local24.anInt1259 < local24.anInt1214) {
									local24.anInt1214 = local24.anInt1251 - local24.anInt1259;
								}
								if (local24.anInt1214 < 0) {
									local24.anInt1214 = 0;
								}
							}
							method1193(local105 - local24.anInt1237, -local24.anInt1214 + local100, arg2, local44, local142, local136, local24.anInt1230, local214, local212);
							if (local24.aClass4_Sub5Array1 != null) {
								method1193(local105 - local24.anInt1237, local100 - local24.anInt1214, local24.aClass4_Sub5Array1, local44, local142, local136, local24.anInt1230, local214, local212);
							}
							@Pc(533) Class4_Sub10 local533 = (Class4_Sub10) Static15.aClass42_4.method1055((long) local24.anInt1230);
							if (local533 != null) {
								if (local533.anInt1721 == 0 && local136 <= Static88.anInt2198 && Static73.anInt1769 >= local142 && Static88.anInt2198 < local212 && local214 > Static73.anInt1769 && !Static101.aBoolean122 && !Static67.aBoolean96) {
									Static125.anIntArray358[0] = 1007;
									Static105.anInt2033 = 1;
									Static47.aClass39Array8[0] = Static62.aClass39_862;
									Static52.aClass39Array11[0] = Static72.aClass39_423;
								}
								Static24.method322(local214, local142, local44, local136, local212, local105, local100, local533.anInt1724);
							}
							Static17.method1680(arg5, arg4, arg8, arg7);
							Static57.method1043();
						}
						if (Static99.aBooleanArray13[local44] || Static2.anInt17 > 1) {
							if (local24.anInt1225 == 0 && !local24.aBoolean63 && local24.anInt1251 > local24.anInt1259) {
								Static13.method230(local100, local24.anInt1214, local24.anInt1259, local24.anInt1251, local105 + local24.anInt1244);
							}
							if (local24.anInt1225 != 1) {
								@Pc(653) int local653;
								@Pc(665) int local665;
								@Pc(821) int local821;
								@Pc(735) int local735;
								@Pc(890) int local890;
								@Pc(674) int local674;
								@Pc(826) int local826;
								if (local24.anInt1225 == 2) {
									local285 = 0;
									for (local290 = 0; local290 < local24.anInt1259; local290++) {
										for (local653 = 0; local653 < local24.anInt1244; local653++) {
											local665 = (local24.anInt1203 + 32) * local653 + local105;
											local674 = local290 * (local24.anInt1196 + 32) + local100;
											if (local285 < 20) {
												local674 += local24.anIntArray128[local285];
												local665 += local24.anIntArray133[local285];
											}
											if (local24.anIntArray130[local285] > 0) {
												local735 = local24.anIntArray130[local285] - 1;
												if (local665 + 32 > arg5 && arg8 > local665 && arg4 < local674 + 32 && arg7 > local674 || local24 == Static63.aClass4_Sub5_36 && Static126.anInt3160 == local285) {
													@Pc(790) Class4_Sub2_Sub3_Sub1 local790;
													if (Static59.anInt1555 == 1 && Static36.anInt911 == local285 && local24.anInt1230 == Static31.anInt818) {
														local790 = Static102.method1838(local24.anIntArray134[local285], 0, 2, false, local735);
													} else {
														local790 = Static102.method1838(local24.anIntArray134[local285], 3153952, 1, false, local735);
													}
													if (local790 == null) {
														Static19.method344(local24);
													} else if (local24 == Static63.aClass4_Sub5_36 && Static126.anInt3160 == local285) {
														local821 = Static73.anInt1769 - Static44.anInt1129;
														local826 = Static88.anInt2198 - Static108.anInt2699;
														if (local821 < 5 && local821 > -5) {
															local821 = 0;
														}
														if (local826 < 5 && local826 > -5) {
															local826 = 0;
														}
														if (Static23.anInt649 < 5) {
															local821 = 0;
															local826 = 0;
														}
														local790.method859(local665 + local826, local821 + local674, 128);
														if (arg6 != -1) {
															@Pc(867) Class4_Sub5 local867 = arg2[arg6 & 0xFFFF];
															if (local674 + local821 < Static17.anInt2258 && local867.anInt1214 > 0) {
																local890 = Static39.anInt952 * (Static17.anInt2258 - local674 - local821) / 3;
																if (Static39.anInt952 * 10 < local890) {
																	local890 = Static39.anInt952 * 10;
																}
																if (local890 > local867.anInt1214) {
																	local890 = local867.anInt1214;
																}
																local867.anInt1214 -= local890;
																Static44.anInt1129 += local890;
																Static19.method344(local867);
															}
															if (Static17.anInt2259 < local674 + local821 + 32 && local867.anInt1251 - local867.anInt1259 > local867.anInt1214) {
																local890 = (local821 + local674 + 32 - Static17.anInt2259) * Static39.anInt952 / 3;
																if (Static39.anInt952 * 10 < local890) {
																	local890 = Static39.anInt952 * 10;
																}
																if (local890 > local867.anInt1251 - local867.anInt1214 - local867.anInt1259) {
																	local890 = local867.anInt1251 - local867.anInt1214 - local867.anInt1259;
																}
																Static44.anInt1129 -= local890;
																local867.anInt1214 += local890;
																Static19.method344(local867);
															}
														}
													} else if (local24 == Static25.aClass4_Sub5_74 && local285 == Static120.anInt2958) {
														local790.method859(local665, local674, 128);
													} else {
														local790.method876(local665, local674);
													}
												}
											} else if (local24.anIntArray132 != null && local285 < 20) {
												@Pc(709) Class4_Sub2_Sub3_Sub1 local709 = local24.method788(local285);
												if (local709 != null) {
													local709.method876(local665, local674);
												} else if (Static19.aBoolean21) {
													Static19.method344(local24);
												}
											}
											local285++;
										}
									}
								} else if (local24.anInt1225 == 3) {
									if (Static59.method1047(local24)) {
										local285 = local24.anInt1210;
										if (local24 == Static83.aClass4_Sub5_43 && local24.anInt1269 != 0) {
											local285 = local24.anInt1269;
										}
									} else {
										local285 = local24.anInt1211;
										if (Static83.aClass4_Sub5_43 == local24 && local24.anInt1252 != 0) {
											local285 = local24.anInt1252;
										}
									}
									if (local108 == 0) {
										if (local24.aBoolean62) {
											Static17.method1682(local105, local100, local24.anInt1244, local24.anInt1259, local285);
										} else {
											Static17.method1683(local105, local100, local24.anInt1244, local24.anInt1259, local285);
										}
									} else if (local24.aBoolean62) {
										Static17.method1676(local105, local100, local24.anInt1244, local24.anInt1259, local285, 256 - (local108 & 0xFF));
									} else {
										Static17.method1670(local105, local100, local24.anInt1244, local24.anInt1259, local285, 256 - (local108 & 0xFF));
									}
								} else {
									@Pc(1152) Class4_Sub2_Sub3_Sub3 local1152;
									if (local24.anInt1225 == 4) {
										local1152 = local24.method791();
										if (local1152 != null) {
											@Pc(1164) Class39 local1164 = local24.aClass39_722;
											if (Static59.method1047(local24)) {
												local290 = local24.anInt1210;
												if (local24 == Static83.aClass4_Sub5_43 && local24.anInt1269 != 0) {
													local290 = local24.anInt1269;
												}
												if (local24.aClass39_724.method953() > 0) {
													local1164 = local24.aClass39_724;
												}
											} else {
												local290 = local24.anInt1211;
												if (Static83.aClass4_Sub5_43 == local24 && local24.anInt1252 != 0) {
													local290 = local24.anInt1252;
												}
											}
											if (local24.aBoolean63 && local24.anInt1208 != -1) {
												@Pc(1223) Class4_Sub2_Sub5 local1223 = Static119.method2166(local24.anInt1208);
												local1164 = local1223.aClass39_352;
												if (local1164 == null) {
													local1164 = Static99.aClass39_1290;
												}
												if ((local1223.anInt606 == 1 || local24.anInt1219 != 1) && local24.anInt1219 != -1) {
													local1164 = Static62.method1123(new Class39[] { Static104.aClass39_1337, local1164, Static72.aClass39_427, Static126.method2187(local24.anInt1219) });
												}
											}
											if (Static101.aClass4_Sub5_55 == local24) {
												local1164 = Static113.aClass39_1480;
												local290 = local24.anInt1211;
											}
											if (!local24.aBoolean63) {
												local1164 = Static72.method534(local1164, local24);
											}
											local1152.method1261(local1164, local105, local100, local24.anInt1244, local24.anInt1259, local290, local24.aBoolean57 ? 0 : -1, local24.anInt1240, local24.anInt1238, local24.anInt1197);
										} else if (Static19.aBoolean21) {
											Static19.method344(local24);
										}
									} else if (local24.anInt1225 == 5) {
										@Pc(1326) Class4_Sub2_Sub3_Sub1 local1326;
										if (local24.aBoolean63) {
											if (local24.anInt1208 == -1) {
												local1326 = local24.method781(false);
											} else {
												local1326 = Static102.method1838(local24.anInt1219, local24.anInt1270, local24.anInt1256, false, local24.anInt1208);
											}
											if (local1326 != null) {
												local290 = local1326.anInt1345;
												local653 = local1326.anInt1342;
												if (local24.aBoolean55) {
													Static17.method1678(local105, local100, local105 + local24.anInt1244, local24.anInt1259 + local100);
													local665 = (local290 + local24.anInt1244 - 1) / local290;
													local674 = (local653 + local24.anInt1259 - 1) / local653;
													for (local826 = 0; local826 < local665; local826++) {
														for (local821 = 0; local821 < local674; local821++) {
															if (local24.anInt1229 != 0) {
																local1326.method861(local290 / 2 + local826 * local290 + local105, local653 / 2 + local100 + local653 * local821, local24.anInt1229, 4096);
															} else if (local108 == 0) {
																local1326.method876(local105 + local290 * local826, local821 * local653 + local100);
															} else {
																local1326.method859(local105 + local826 * local290, local100 - -(local821 * local653), 256 - (local108 & 0xFF));
															}
														}
													}
													Static17.method1680(arg5, arg4, arg8, arg7);
												} else {
													local665 = local24.anInt1244 * 4096 / local290;
													if (local24.anInt1229 != 0) {
														local1326.method861(local105 + local24.anInt1244 / 2, local24.anInt1259 / 2 + local100, local24.anInt1229, local665);
													} else if (local108 != 0) {
														local1326.method873(local105, local100, local24.anInt1244, local24.anInt1259, 256 - (local108 & 0xFF));
													} else if (local24.anInt1244 == local290 && local653 == local24.anInt1259) {
														local1326.method876(local105, local100);
													} else {
														local1326.method874(local105, local100, local24.anInt1244, local24.anInt1259);
													}
												}
											} else if (Static19.aBoolean21) {
												Static19.method344(local24);
											}
										} else {
											local1326 = local24.method781(Static59.method1047(local24));
											if (local1326 != null) {
												local1326.method876(local105, local100);
											} else if (Static19.aBoolean21) {
												Static19.method344(local24);
											}
										}
									} else {
										@Pc(1680) Class4_Sub2_Sub5 local1680;
										if (local24.anInt1225 == 6) {
											@Pc(1587) Class4_Sub2_Sub1_Sub6 local1587 = null;
											local665 = 0;
											@Pc(1593) boolean local1593 = Static59.method1047(local24);
											if (local1593) {
												local290 = local24.anInt1255;
											} else {
												local290 = local24.anInt1206;
											}
											if (local24.anInt1208 != -1) {
												local1680 = Static119.method2166(local24.anInt1208);
												if (local1680 != null) {
													local1680 = local1680.method419(local24.anInt1219);
													local1587 = local1680.method416(1);
													if (local1587 == null) {
														Static19.method344(local24);
													} else {
														local1587.method2150();
														local665 = local1587.anInt3118 / 2;
													}
												}
											} else if (local24.anInt1200 == 5) {
												if (local24.anInt1248 == 0) {
													local1587 = Static58.aClass63_1.method1698(null, null, -1, -1);
												} else {
													local1587 = Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.method2172();
												}
											} else if (local290 == -1) {
												local1587 = local24.method785(local1593, null, -1, Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.aClass63_2);
												if (local1587 == null && Static19.aBoolean21) {
													Static19.method344(local24);
												}
											} else {
												@Pc(1618) Class4_Sub2_Sub2 local1618 = Static116.method2017(local290);
												local1587 = local24.method785(local1593, local1618, local24.anInt1261, Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.aClass63_2);
												if (local1587 == null && Static19.aBoolean21) {
													Static19.method344(local24);
												}
											}
											Static57.method1033(local24.anInt1244 / 2 + local105, local100 + local24.anInt1259 / 2);
											local674 = local24.anInt1242 * Class4_Sub2_Sub3_Sub2.anIntArray152[local24.anInt1217] >> 16;
											local826 = Class4_Sub2_Sub3_Sub2.anIntArray155[local24.anInt1217] * local24.anInt1242 >> 16;
											if (local1587 != null) {
												if (local24.aBoolean63) {
													local1587.method2150();
													if (local24.aBoolean61) {
														local1587.method2131(local24.anInt1227, local24.anInt1216, local24.anInt1217, local24.anInt1243, local674 + local665 + local24.anInt1213, local826 - -local24.anInt1213, local24.anInt1242);
													} else {
														local1587.method2145(local24.anInt1227, local24.anInt1216, local24.anInt1217, local24.anInt1243, local24.anInt1213 + local665 + local674, local24.anInt1213 + local826);
													}
												} else {
													local1587.method2145(local24.anInt1227, 0, local24.anInt1217, 0, local674, local826);
												}
											}
											Static57.method1038();
										} else {
											if (local24.anInt1225 == 7) {
												local1152 = local24.method791();
												if (local1152 == null) {
													if (Static19.aBoolean21) {
														Static19.method344(local24);
													}
													continue;
												}
												local290 = 0;
												for (local653 = 0; local653 < local24.anInt1259; local653++) {
													for (local665 = 0; local665 < local24.anInt1244; local665++) {
														if (local24.anIntArray130[local290] > 0) {
															local1680 = Static119.method2166(local24.anIntArray130[local290] - 1);
															@Pc(1860) Class39 local1860 = local1680.aClass39_352;
															if (local1860 == null) {
																local1860 = Static99.aClass39_1290;
															}
															if (local1680.anInt606 == 1 || local24.anIntArray134[local290] != 1) {
																local1860 = Static62.method1123(new Class39[] { Static104.aClass39_1337, local1860, Static72.aClass39_427, Static126.method2187(local24.anIntArray134[local290]) });
															}
															local821 = (local24.anInt1203 + 115) * local665 + local105;
															local735 = (local24.anInt1196 + 12) * local653 + local100;
															if (local24.anInt1240 == 0) {
																local1152.method1272(local1860, local821, local735, local24.anInt1211, local24.aBoolean57 ? 0 : -1);
															} else if (local24.anInt1240 == 1) {
																local1152.method1280(local1860, local821 + local24.anInt1244 / 2, local735, local24.anInt1211, local24.aBoolean57 ? 0 : -1);
															} else {
																local1152.method1283(local1860, local24.anInt1244 + local821 - 1, local735, local24.anInt1211, local24.aBoolean57 ? 0 : -1);
															}
														}
														local290++;
													}
												}
											}
											@Pc(2165) int local2165;
											if (local24.anInt1225 == 8 && local24 == Static35.aClass4_Sub5_16 && Static19.anInt524 == Static52.anInt1359) {
												local285 = 0;
												local290 = 0;
												@Pc(2014) Class39 local2014 = local24.aClass39_722;
												@Pc(2016) Class4_Sub2_Sub3_Sub3 local2016 = aClass4_Sub2_Sub3_Sub3_4;
												local2014 = Static72.method534(local2014, local24);
												@Pc(2034) Class39 local2034;
												while (local2014.method953() > 0) {
													local826 = local2014.method960(Static65.aClass39_884);
													if (local826 == -1) {
														local2034 = local2014;
														local2014 = Static72.aClass39_423;
													} else {
														local2034 = local2014.method938(local826, 0);
														local2014 = local2014.method964(local826 + 4);
													}
													local821 = local2016.method1265(local2034);
													if (local285 < local821) {
														local285 = local821;
													}
													local290 += local2016.anInt1833 + 1;
												}
												local290 += 7;
												local285 += 6;
												local826 = local105 + local24.anInt1244 - local285 - 5;
												if (local826 < local105 + 5) {
													local826 = local105 + 5;
												}
												local821 = local100 + local24.anInt1259 + 5;
												if (arg7 < local290 + local821) {
													local821 = arg7 - local290;
												}
												if (arg8 < local826 + local285) {
													local826 = arg8 - local285;
												}
												Static17.method1682(local826, local821, local285, local290, 16777120);
												Static17.method1683(local826, local821, local285, local290, 0);
												local2014 = local24.aClass39_722;
												local735 = local821 + local2016.anInt1833 + 2;
												local2014 = Static72.method534(local2014, local24);
												while (local2014.method953() > 0) {
													local2165 = local2014.method960(Static65.aClass39_884);
													if (local2165 == -1) {
														local2034 = local2014;
														local2014 = Static72.aClass39_423;
													} else {
														local2034 = local2014.method938(local2165, 0);
														local2014 = local2014.method964(local2165 + 4);
													}
													local2016.method1272(local2034, local826 + 3, local735, 0, -1);
													local735 += local2016.anInt1833 + 1;
												}
											}
											if (local24.anInt1225 == 9) {
												if (local24.anInt1253 == 1) {
													Static17.method1671(local105, local100, local24.anInt1244 + local105, local100 + local24.anInt1259, local24.anInt1211);
												} else {
													local285 = local24.anInt1244 < 0 ? -local24.anInt1244 : local24.anInt1244;
													local290 = local24.anInt1259 >= 0 ? local24.anInt1259 : -local24.anInt1259;
													local653 = local285;
													if (local285 < local290) {
														local653 = local290;
													}
													if (local653 != 0) {
														local665 = (local24.anInt1244 << 16) / local653;
														local674 = (local24.anInt1259 << 16) / local653;
														if (local674 > local665) {
															local674 = -local674;
														} else {
															local665 = -local665;
														}
														local2165 = local24.anInt1253 * local665 + 1 >> 17;
														local735 = local24.anInt1253 * local665 >> 17;
														local821 = local674 * local24.anInt1253 + 1 >> 17;
														@Pc(2303) int local2303 = local735 + local100;
														@Pc(2308) int local2308 = local100 - local2165;
														local826 = local24.anInt1253 * local674 >> 17;
														@Pc(2323) int local2323 = local105 + local24.anInt1244 - local821;
														local890 = local105 - local821;
														@Pc(2332) int local2332 = local105 + local826;
														@Pc(2339) int local2339 = local826 + local24.anInt1244 + local105;
														@Pc(2347) int local2347 = local24.anInt1259 + local100 - local2165;
														@Pc(2355) int local2355 = local735 + local100 + local24.anInt1259;
														Static57.method1044(local2332, local890, local2323);
														Static57.method1035(local2303, local2308, local2347, local2332, local890, local2323, local24.anInt1211);
														Static57.method1044(local2332, local2323, local2339);
														Static57.method1035(local2303, local2347, local2355, local2332, local2323, local2339, local24.anInt1211);
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BLclient!he;)Z")
	public static boolean method1194(@OriginalArg(1) Class4_Sub5 arg0) {
		if (Static67.aBoolean96) {
			if (Static20.method385(arg0) != 0) {
				return false;
			}
			if (arg0.anInt1225 == 0) {
				return false;
			}
		}
		return arg0.aBoolean56;
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V")
	public static void method1195() {
		aClass20_35 = null;
		aClass4_Sub5_38 = null;
		aClass39_917 = null;
		aClass39_918 = null;
		aClass4_Sub2_Sub3_Sub3_4 = null;
		aClass39Array13 = null;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)I")
	public static int method1196() {
		return 6;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II)Lclient!ja;")
	public static Class39 method1197(@OriginalArg(1) int arg0) {
		return Static62.method1123(new Class39[] { Static29.method510(arg0 >> 24 & 0xFF), Static43.aClass39_666, Static29.method510(arg0 >> 16 & 0xFF), Static43.aClass39_666, Static29.method510(arg0 >> 8 & 0xFF), Static43.aClass39_666, Static29.method510(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "([BIZ)Ljava/lang/Object;")
	public static Object method1198(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static70.aBoolean98) {
			try {
				@Pc(28) Class58 local28 = (Class58) Class.forName("Class58_Sub1").getDeclaredConstructor().newInstance();
				local28.method1649(arg0);
				return local28;
			} catch (@Pc(35) Throwable local35) {
				Static70.aBoolean98 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIB)I")
	public static int method1199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0 >>> 31;
		return (local12 + arg0) / arg1 - local12;
	}
}
