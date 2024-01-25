import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!ht", name = "h", descriptor = "[I")
	public static int[] anIntArray263;

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray25 = new String[5];

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(B)Z")
	public static boolean method2391() throws IOException {
		if (Static211.aClass247_4 == null) {
			return false;
		}
		@Pc(13) int local13 = Static211.aClass247_4.method5161();
		if (local13 == 0) {
			return false;
		}
		@Pc(70) int local70;
		if (Static316.aClass253_117 == null) {
			if (Static443.aBoolean486) {
				Static211.aClass247_4.method5157(Static210.aClass7_Sub14_Sub1_4.aByteArray75, 0, 1);
				local13--;
				Static432.anInt7272++;
				Static443.aBoolean486 = false;
			}
			Static210.aClass7_Sub14_Sub1_4.anInt4989 = 0;
			if (Static210.aClass7_Sub14_Sub1_4.method1355()) {
				if (local13 == 0) {
					return false;
				}
				local13--;
				Static211.aClass247_4.method5157(Static210.aClass7_Sub14_Sub1_4.aByteArray75, 1, 1);
				Static432.anInt7272++;
			}
			Static443.aBoolean486 = true;
			@Pc(66) Class253[] local66 = Static382.method4858();
			local70 = Static210.aClass7_Sub14_Sub1_4.method1350();
			if (local70 < 0 || local70 >= local66.length) {
				throw new IOException("invo:" + local70 + " ip:" + Static210.aClass7_Sub14_Sub1_4.anInt4989);
			}
			Static316.aClass253_117 = local66[local70];
			Static205.anInt3627 = Static316.aClass253_117.anInt6627;
		}
		if (Static205.anInt3627 == -1) {
			if (local13 <= 0) {
				return false;
			}
			Static211.aClass247_4.method5157(Static210.aClass7_Sub14_Sub1_4.aByteArray75, 0, 1);
			local13--;
			Static432.anInt7272++;
			Static205.anInt3627 = Static210.aClass7_Sub14_Sub1_4.aByteArray75[0] & 0xFF;
		}
		if (Static205.anInt3627 == -2) {
			if (local13 <= 1) {
				return false;
			}
			Static211.aClass247_4.method5157(Static210.aClass7_Sub14_Sub1_4.aByteArray75, 0, 2);
			Static210.aClass7_Sub14_Sub1_4.anInt4989 = 0;
			local13 -= 2;
			Static205.anInt3627 = Static210.aClass7_Sub14_Sub1_4.method3943();
			Static432.anInt7272 += 2;
		}
		if (Static205.anInt3627 > local13) {
			return false;
		}
		Static210.aClass7_Sub14_Sub1_4.anInt4989 = 0;
		Static211.aClass247_4.method5157(Static210.aClass7_Sub14_Sub1_4.aByteArray75, 0, Static205.anInt3627);
		Static432.anInt7272 += Static205.anInt3627;
		Static376.anInt6106 = 0;
		Static417.aClass253_149 = Static210.aClass253_153;
		Static210.aClass253_153 = Static94.aClass253_35;
		Static94.aClass253_35 = Static316.aClass253_117;
		@Pc(199) int local199;
		@Pc(207) int local207;
		@Pc(238) String local238;
		@Pc(209) String local209;
		@Pc(211) String local211;
		if (Static423.aClass253_151 == Static316.aClass253_117) {
			local199 = Static210.aClass7_Sub14_Sub1_4.method3940();
			local70 = Static210.aClass7_Sub14_Sub1_4.method3938();
			local207 = Static210.aClass7_Sub14_Sub1_4.method3981();
			local209 = "";
			local211 = local209;
			if ((local207 & 0x1) != 0) {
				local209 = Static210.aClass7_Sub14_Sub1_4.method3986();
				if ((local207 & 0x2) == 0) {
					local211 = local209;
				} else {
					local211 = Static210.aClass7_Sub14_Sub1_4.method3986();
				}
			}
			local238 = Static210.aClass7_Sub14_Sub1_4.method3986();
			if (local199 == 99) {
				Static269.method3626(local238);
			} else if (local211.equals("") || !Static21.method221(local211)) {
				Static336.method4383(local199, local70, local211, local238, local209);
			} else {
				Static316.aClass253_117 = null;
				return true;
			}
			Static316.aClass253_117 = null;
			return true;
		} else if (Static332.aClass253_119 == Static316.aClass253_117) {
			Static239.method3255(Static324.aClass94_23);
			Static316.aClass253_117 = null;
			return true;
		} else if (Static341.aClass253_123 == Static316.aClass253_117) {
			Static354.method4563();
			Static316.aClass253_117 = null;
			return false;
		} else if (Static313.aClass253_116 == Static316.aClass253_117) {
			local199 = Static210.aClass7_Sub14_Sub1_4.method3972();
			local70 = Static210.aClass7_Sub14_Sub1_4.method3956();
			local207 = Static210.aClass7_Sub14_Sub1_4.method3935();
			if (Static278.method3710(local207)) {
				Static41.method572(local70, local199);
			}
			Static316.aClass253_117 = null;
			return true;
		} else if (Static56.aClass253_18 == Static316.aClass253_117) {
			if (Static459.method5312(Static206.anInt3642)) {
				Static37.anInt654 = (int) ((float) Static210.aClass7_Sub14_Sub1_4.method3943() * 2.5F);
			} else {
				Static37.anInt654 = Static210.aClass7_Sub14_Sub1_4.method3943() * 30;
			}
			Static316.aClass253_117 = null;
			Static302.anInt5112 = Static90.anInt1865;
			return true;
		} else if (Static350.aClass253_124 == Static316.aClass253_117) {
			Static261.aString49 = Static205.anInt3627 > 2 ? Static210.aClass7_Sub14_Sub1_4.method3986() : Static209.aClass55_82.method1205(Static5.anInt20);
			Static149.anInt5367 = Static205.anInt3627 <= 0 ? -1 : Static210.aClass7_Sub14_Sub1_4.method3943();
			Static316.aClass253_117 = null;
			if (Static149.anInt5367 == 65535) {
				Static149.anInt5367 = -1;
			}
			return true;
		} else if (Static316.aClass253_117 == Static430.aClass253_155) {
			local199 = Static210.aClass7_Sub14_Sub1_4.method3935();
			local70 = Static210.aClass7_Sub14_Sub1_4.method3946();
			local207 = Static210.aClass7_Sub14_Sub1_4.method3950();
			if (Static278.method3710(local199)) {
				Static114.method1944(local70, local207);
			}
			Static316.aClass253_117 = null;
			return true;
		} else if (Static58.aClass253_20 == Static316.aClass253_117) {
			Static78.method1381();
			Static316.aClass253_117 = null;
			return false;
		} else {
			@Pc(452) Class7_Sub44 local452;
			if (Static269.aClass253_101 == Static316.aClass253_117) {
				local199 = Static210.aClass7_Sub14_Sub1_4.method3950();
				local70 = Static210.aClass7_Sub14_Sub1_4.method3943();
				local207 = Static210.aClass7_Sub14_Sub1_4.method3938();
				if (Static278.method3710(local70)) {
					@Pc(445) Class7_Sub44 local445 = (Class7_Sub44) Static23.aClass164_3.method3512((long) local199);
					local452 = (Class7_Sub44) Static23.aClass164_3.method3512((long) local207);
					if (local452 != null) {
						Static255.method3394(local445 == null || local452.anInt7165 != local445.anInt7165, local452, false);
					}
					if (local445 != null) {
						local445.method5802();
						Static23.aClass164_3.method3508((long) local207, local445);
					}
					@Pc(483) Class95 local483 = Static313.method4088(local199);
					if (local483 != null) {
						Static413.method5189(local483);
					}
					local483 = Static313.method4088(local207);
					if (local483 != null) {
						Static413.method5189(local483);
						Static118.method1991(local483, true);
					}
					if (Static183.anInt3293 != -1) {
						Static379.method4657(1, Static183.anInt3293);
					}
				}
				Static316.aClass253_117 = null;
				return true;
			} else if (Static316.aClass253_117 == Static386.aClass253_139) {
				local199 = Static210.aClass7_Sub14_Sub1_4.method3931();
				local70 = Static210.aClass7_Sub14_Sub1_4.method3981();
				if (local199 == 255) {
					local70 = -1;
					local199 = -1;
				}
				Static337.method4387(local70, local199);
				Static316.aClass253_117 = null;
				return true;
			} else {
				@Pc(577) int local577;
				if (Static316.aClass253_117 == Static300.aClass253_113) {
					local199 = Static210.aClass7_Sub14_Sub1_4.method3968();
					local70 = Static210.aClass7_Sub14_Sub1_4.method3935();
					local207 = Static210.aClass7_Sub14_Sub1_4.method3935();
					if (Static278.method3710(local207)) {
						if (local199 == 2) {
							Static101.method1747();
						}
						Static183.anInt3293 = local70;
						Static92.method1632(local70);
						Static301.method4014(false);
						Static159.method2348(Static183.anInt3293);
						for (local577 = 0; local577 < 100; local577++) {
							Static69.aBooleanArray2[local577] = true;
						}
					}
					Static316.aClass253_117 = null;
					return true;
				} else if (Static316.aClass253_117 == Static240.aClass253_84) {
					@Pc(600) byte local600 = Static210.aClass7_Sub14_Sub1_4.method3930();
					local70 = Static210.aClass7_Sub14_Sub1_4.method3990();
					local207 = Static210.aClass7_Sub14_Sub1_4.method3943();
					if (Static278.method3710(local70)) {
						Static437.method1588(local207, local600);
					}
					Static316.aClass253_117 = null;
					return true;
				} else if (Static316.aClass253_117 == Static354.aClass253_126) {
					Static239.method3255(Static106.aClass94_11);
					Static316.aClass253_117 = null;
					return true;
				} else {
					@Pc(637) String local637;
					if (Static316.aClass253_117 == Static155.aClass253_58) {
						local637 = Static210.aClass7_Sub14_Sub1_4.method3986();
						local70 = Static210.aClass7_Sub14_Sub1_4.method3990();
						local207 = Static210.aClass7_Sub14_Sub1_4.method3990();
						if (Static278.method3710(local207)) {
							Static65.method1859(local70, local637);
						}
						Static316.aClass253_117 = null;
						return true;
					} else if (Static316.aClass253_117 == Static69.aClass253_23) {
						Static400.anInt5902 = Static210.aClass7_Sub14_Sub1_4.method3945() << 3;
						Static287.anInt6591 = Static210.aClass7_Sub14_Sub1_4.method3972();
						Static421.anInt6702 = Static210.aClass7_Sub14_Sub1_4.method3980() << 3;
						while (Static205.anInt3627 > Static210.aClass7_Sub14_Sub1_4.anInt4989) {
							@Pc(685) Class94 local685 = Static141.method2180()[Static210.aClass7_Sub14_Sub1_4.method3981()];
							Static239.method3255(local685);
						}
						Static316.aClass253_117 = null;
						return true;
					} else if (Static49.aClass253_15 == Static316.aClass253_117) {
						local199 = Static210.aClass7_Sub14_Sub1_4.method3946();
						local70 = Static210.aClass7_Sub14_Sub1_4.method3954();
						local207 = Static210.aClass7_Sub14_Sub1_4.method3956();
						local577 = Static210.aClass7_Sub14_Sub1_4.method3983();
						if (Static278.method3710(local199)) {
							Static80.method1411(local577, local207, local70);
						}
						Static316.aClass253_117 = null;
						return true;
					} else {
						@Pc(753) int local753;
						@Pc(757) int local757;
						if (Static316.aClass253_117 == Static380.aClass253_98) {
							local199 = Static210.aClass7_Sub14_Sub1_4.method3943();
							local70 = Static210.aClass7_Sub14_Sub1_4.method3981();
							local207 = Static210.aClass7_Sub14_Sub1_4.method3981();
							local577 = Static210.aClass7_Sub14_Sub1_4.method3943() << 0;
							local753 = Static210.aClass7_Sub14_Sub1_4.method3981();
							local757 = Static210.aClass7_Sub14_Sub1_4.method3981();
							if (Static278.method3710(local199)) {
								Static350.method4524(local577, local70, local753, local757, local207);
							}
							Static316.aClass253_117 = null;
							return true;
						} else if (Static86.aClass253_29 == Static316.aClass253_117) {
							local199 = Static210.aClass7_Sub14_Sub1_4.method3956();
							local70 = Static210.aClass7_Sub14_Sub1_4.method3943();
							local207 = Static210.aClass7_Sub14_Sub1_4.method3946();
							local577 = Static210.aClass7_Sub14_Sub1_4.method3935();
							local753 = Static210.aClass7_Sub14_Sub1_4.method3946();
							if (Static278.method3710(local70)) {
								Static301.method4013(7, local753 | local207 << 16, local199, local577);
							}
							Static316.aClass253_117 = null;
							return true;
						} else {
							@Pc(831) String local831;
							@Pc(825) boolean local825;
							@Pc(829) String local829;
							@Pc(847) boolean local847;
							@Pc(873) String local873;
							if (Static291.aClass253_108 == Static316.aClass253_117) {
								local825 = Static210.aClass7_Sub14_Sub1_4.method3981() == 1;
								local829 = Static210.aClass7_Sub14_Sub1_4.method3986();
								local831 = local829;
								if (local825) {
									local831 = Static210.aClass7_Sub14_Sub1_4.method3986();
								}
								local577 = Static210.aClass7_Sub14_Sub1_4.method3981();
								local753 = Static210.aClass7_Sub14_Sub1_4.method3943();
								local847 = false;
								if (local577 <= 1 && Static21.method221(local831)) {
									local847 = true;
								}
								if (!local847 && Static221.anInt3902 == 0) {
									local873 = Static209.aClass204_1.method4288(local753).method4273(Static210.aClass7_Sub14_Sub1_4);
									if (local577 == 2) {
										Static169.method2464("<img=1>" + local831, 25, 0, local873, local753, null, "<img=1>" + local829);
									} else if (local577 == 1) {
										Static169.method2464("<img=0>" + local831, 25, 0, local873, local753, null, "<img=0>" + local829);
									} else {
										Static169.method2464(local831, 25, 0, local873, local753, null, local829);
									}
								}
								Static316.aClass253_117 = null;
								return true;
							} else if (Static393.aClass253_141 == Static316.aClass253_117) {
								Static329.method4319(Static210.aClass7_Sub14_Sub1_4.method3986());
								Static316.aClass253_117 = null;
								return true;
							} else if (Static316.aClass253_117 == Static443.aClass253_157) {
								Static239.method3255(Static140.aClass94_2);
								Static316.aClass253_117 = null;
								return true;
							} else if (Static316.aClass253_117 == Static139.aClass253_52) {
								local199 = Static210.aClass7_Sub14_Sub1_4.method3946();
								local70 = Static210.aClass7_Sub14_Sub1_4.method3956();
								local207 = Static210.aClass7_Sub14_Sub1_4.method3943();
								if (Static278.method3710(local199)) {
									Static437.method1588(local207, local70);
								}
								Static316.aClass253_117 = null;
								return true;
							} else if (Static316.aClass253_117 == Static11.aClass253_1) {
								Static239.method3255(Static443.aClass94_25);
								Static316.aClass253_117 = null;
								return true;
							} else if (Static84.aClass253_102 == Static316.aClass253_117) {
								Static387.method2756(Static205.anInt3627, Static230.aClass61_4, Static210.aClass7_Sub14_Sub1_4);
								Static316.aClass253_117 = null;
								return true;
							} else if (Static316.aClass253_117 == Static364.aClass253_37) {
								Static239.method3255(Static108.aClass94_13);
								Static316.aClass253_117 = null;
								return true;
							} else {
								@Pc(1215) int local1215;
								@Pc(1101) int local1101;
								@Pc(1111) int local1111;
								@Pc(1039) boolean local1039;
								@Pc(1076) Class129 local1076;
								if (Static316.aClass253_117 == Static436.aClass253_158) {
									local637 = Static210.aClass7_Sub14_Sub1_4.method3986();
									local1039 = Static210.aClass7_Sub14_Sub1_4.method3981() == 1;
									if (local1039) {
										local829 = Static210.aClass7_Sub14_Sub1_4.method3986();
									} else {
										local829 = local637;
									}
									local577 = Static210.aClass7_Sub14_Sub1_4.method3943();
									@Pc(1057) byte local1057 = Static210.aClass7_Sub14_Sub1_4.method3930();
									local847 = false;
									if (local1057 == -128) {
										local847 = true;
									}
									if (local847) {
										if (Static267.anInt4534 == 0) {
											Static316.aClass253_117 = null;
											return true;
										}
										for (local1215 = 0; Static267.anInt4534 > local1215 && (!Static76.aClass129Array1[local1215].aString39.equals(local829) || local577 != Static76.aClass129Array1[local1215].anInt3588); local1215++) {
										}
										if (Static267.anInt4534 > local1215) {
											while (Static267.anInt4534 - 1 > local1215) {
												Static76.aClass129Array1[local1215] = Static76.aClass129Array1[local1215 + 1];
												local1215++;
											}
											Static267.anInt4534--;
											Static76.aClass129Array1[Static267.anInt4534] = null;
										}
									} else {
										local873 = Static210.aClass7_Sub14_Sub1_4.method3986();
										local1076 = new Class129();
										local1076.aString39 = local829;
										local1076.aString40 = local637;
										local1076.aString42 = Static345.method4461(local1076.aString39);
										local1076.aByte33 = local1057;
										local1076.anInt3588 = local577;
										local1076.aString41 = local873;
										for (local1101 = Static267.anInt4534 - 1; local1101 >= 0; local1101--) {
											local1111 = Static76.aClass129Array1[local1101].aString42.compareTo(local1076.aString42);
											if (local1111 == 0) {
												Static76.aClass129Array1[local1101].anInt3588 = local577;
												Static76.aClass129Array1[local1101].aByte33 = local1057;
												Static76.aClass129Array1[local1101].aString41 = local873;
												if (local829.equals(Static104.aClass26_Sub2_Sub4_Sub2_2.aString69)) {
													Static62.aByte12 = local1057;
												}
												Static316.aClass253_117 = null;
												Static254.anInt4291 = Static90.anInt1865;
												return true;
											}
											if (local1111 < 0) {
												break;
											}
										}
										if (Static76.aClass129Array1.length <= Static267.anInt4534) {
											Static316.aClass253_117 = null;
											return true;
										}
										for (local1111 = Static267.anInt4534 - 1; local1111 > local1101; local1111--) {
											Static76.aClass129Array1[local1111 + 1] = Static76.aClass129Array1[local1111];
										}
										if (Static267.anInt4534 == 0) {
											Static76.aClass129Array1 = new Class129[100];
										}
										Static76.aClass129Array1[local1101 + 1] = local1076;
										Static267.anInt4534++;
										if (local829.equals(Static104.aClass26_Sub2_Sub4_Sub2_2.aString69)) {
											Static62.aByte12 = local1057;
										}
									}
									Static254.anInt4291 = Static90.anInt1865;
									Static316.aClass253_117 = null;
									return true;
								} else if (Static294.aClass253_109 == Static316.aClass253_117) {
									local199 = Static210.aClass7_Sub14_Sub1_4.method3981();
									local70 = Static210.aClass7_Sub14_Sub1_4.method3946();
									Static224.aClass239_7.method4996(local70, local199);
									Static316.aClass253_117 = null;
									return true;
								} else if (Static316.aClass253_117 == Static174.aClass253_66) {
									local199 = Static210.aClass7_Sub14_Sub1_4.method3990();
									local70 = Static210.aClass7_Sub14_Sub1_4.method3990();
									local207 = Static210.aClass7_Sub14_Sub1_4.method3990();
									local577 = Static210.aClass7_Sub14_Sub1_4.method3938();
									local753 = Static210.aClass7_Sub14_Sub1_4.method3935();
									if (Static278.method3710(local70)) {
										Static272.method3650(local207, local753, local199, local577);
									}
									Static316.aClass253_117 = null;
									return true;
								} else if (Static316.aClass253_117 == Static236.aClass253_82) {
									local199 = Static210.aClass7_Sub14_Sub1_4.method3990();
									if (local199 == 65535) {
										local199 = -1;
									}
									local70 = Static210.aClass7_Sub14_Sub1_4.method3950();
									local207 = Static210.aClass7_Sub14_Sub1_4.method3990();
									if (Static278.method3710(local207)) {
										Static438.method5618(local199, local70);
									}
									Static316.aClass253_117 = null;
									return true;
								} else if (Static289.aClass253_107 == Static316.aClass253_117) {
									local199 = Static210.aClass7_Sub14_Sub1_4.method3943();
									local70 = Static210.aClass7_Sub14_Sub1_4.method3943();
									local207 = Static210.aClass7_Sub14_Sub1_4.method3943();
									local577 = Static210.aClass7_Sub14_Sub1_4.method3943();
									if (Static278.method3710(local199) && Static294.aClass95ArrayArray3[local70] != null) {
										for (local753 = local207; local753 < local577; local753++) {
											local757 = Static210.aClass7_Sub14_Sub1_4.method3975();
											if (Static294.aClass95ArrayArray3[local70].length > local753 && Static294.aClass95ArrayArray3[local70][local753] != null) {
												Static294.aClass95ArrayArray3[local70][local753].anInt2657 = local757;
											}
										}
									}
									Static316.aClass253_117 = null;
									return true;
								} else if (Static453.aClass253_164 == Static316.aClass253_117) {
									local199 = Static210.aClass7_Sub14_Sub1_4.method3950();
									local70 = Static210.aClass7_Sub14_Sub1_4.method3946();
									Static224.aClass239_7.method4996(local70, local199);
									Static316.aClass253_117 = null;
									return true;
								} else if (Static316.aClass253_117 == Static233.aClass253_118) {
									local199 = Static210.aClass7_Sub14_Sub1_4.method3938();
									local70 = Static210.aClass7_Sub14_Sub1_4.method3943();
									if (Static278.method3710(local70)) {
										Static301.method4013(5, Static296.anInt4920, local199, 0);
									}
									Static316.aClass253_117 = null;
									return true;
								} else if (Static304.aClass253_114 == Static316.aClass253_117) {
									Static239.method3255(Static225.aClass94_22);
									Static316.aClass253_117 = null;
									return true;
								} else if (Static316.aClass253_117 == Static99.aClass253_38) {
									local199 = Static210.aClass7_Sub14_Sub1_4.method3943();
									local70 = Static210.aClass7_Sub14_Sub1_4.method3938();
									if (Static278.method3710(local199)) {
										@Pc(1499) Class7_Sub44 local1499 = (Class7_Sub44) Static23.aClass164_3.method3512((long) local70);
										if (local1499 != null) {
											Static255.method3394(true, local1499, false);
										}
										if (Static63.aClass95_2 != null) {
											Static413.method5189(Static63.aClass95_2);
											Static63.aClass95_2 = null;
										}
									}
									Static316.aClass253_117 = null;
									return true;
								} else if (Static48.aClass253_14 == Static316.aClass253_117) {
									local199 = Static210.aClass7_Sub14_Sub1_4.method3956();
									local70 = Static210.aClass7_Sub14_Sub1_4.method3946();
									local831 = Static210.aClass7_Sub14_Sub1_4.method3986();
									if (Static278.method3710(local70)) {
										Static334.method4374(local199, local831);
									}
									Static316.aClass253_117 = null;
									return true;
								} else if (Static326.aClass253_163 == Static316.aClass253_117) {
									local825 = Static210.aClass7_Sub14_Sub1_4.method3981() == 1;
									local829 = Static210.aClass7_Sub14_Sub1_4.method3986();
									local831 = local829;
									if (local825) {
										local831 = Static210.aClass7_Sub14_Sub1_4.method3986();
									}
									local577 = Static210.aClass7_Sub14_Sub1_4.method3981();
									@Pc(1574) boolean local1574 = false;
									if (local577 <= 1) {
										if (Static148.aBoolean171 && !Static419.aBoolean437 || Static22.aBoolean309) {
											local1574 = true;
										} else if (local577 <= 1 && Static21.method221(local831)) {
											local1574 = true;
										}
									}
									if (!local1574 && Static221.anInt3902 == 0) {
										local238 = Static7.method43(Static86.method1477(Static210.aClass7_Sub14_Sub1_4));
										if (local577 == 2) {
											Static169.method2464("<img=1>" + local831, 24, 0, local238, -1, null, "<img=1>" + local829);
										} else if (local577 == 1) {
											Static169.method2464("<img=0>" + local831, 24, 0, local238, -1, null, "<img=0>" + local829);
										} else {
											Static169.method2464(local831, 24, 0, local238, -1, null, local829);
										}
									}
									Static316.aClass253_117 = null;
									return true;
								} else if (Static340.aClass253_122 == Static316.aClass253_117) {
									local199 = Static210.aClass7_Sub14_Sub1_4.method3972();
									local70 = Static210.aClass7_Sub14_Sub1_4.method3990();
									local207 = Static210.aClass7_Sub14_Sub1_4.method3946();
									@Pc(1694) Class26_Sub2_Sub4_Sub1 local1694 = Static171.aClass26_Sub2_Sub4_Sub1Array1[local70];
									if (local1694 != null) {
										Static426.method5485(local199, local1694, local207);
									}
									Static316.aClass253_117 = null;
									return true;
								} else if (Static316.aClass253_117 == Static166.aClass253_63) {
									local199 = Static210.aClass7_Sub14_Sub1_4.method3943();
									if (local199 == 65535) {
										local199 = -1;
									}
									local70 = Static210.aClass7_Sub14_Sub1_4.method3981();
									local207 = Static210.aClass7_Sub14_Sub1_4.method3972();
									Static394.method5008(local207, local70, local199);
									Static316.aClass253_117 = null;
									return true;
								} else if (Static372.aClass253_135 == Static316.aClass253_117) {
									local199 = Static210.aClass7_Sub14_Sub1_4.method3965();
									local70 = Static210.aClass7_Sub14_Sub1_4.method3935();
									if (local70 == 65535) {
										local70 = -1;
									}
									local207 = Static210.aClass7_Sub14_Sub1_4.method3968();
									Static109.method1893(local207, local199, local70);
									Static316.aClass253_117 = null;
									return true;
								} else if (Static139.aClass253_51 == Static316.aClass253_117) {
									local199 = Static210.aClass7_Sub14_Sub1_4.method3943();
									local829 = Static210.aClass7_Sub14_Sub1_4.method3986();
									@Pc(1782) Object[] local1782 = new Object[local829.length() + 1];
									for (local577 = local829.length() - 1; local577 >= 0; local577--) {
										if (local829.charAt(local577) == 's') {
											local1782[local577 + 1] = Static210.aClass7_Sub14_Sub1_4.method3986();
										} else {
											local1782[local577 + 1] = Integer.valueOf(Static210.aClass7_Sub14_Sub1_4.method3938());
										}
									}
									local1782[0] = Integer.valueOf(Static210.aClass7_Sub14_Sub1_4.method3938());
									if (Static278.method3710(local199)) {
										@Pc(1837) Class7_Sub18 local1837 = new Class7_Sub18();
										local1837.anObjectArray1 = local1782;
										Static159.method2352(local1837);
									}
									Static316.aClass253_117 = null;
									return true;
								} else if (Static100.aClass253_39 == Static316.aClass253_117) {
									Static224.aClass239_7.method5000();
									Static316.aClass253_117 = null;
									Static294.anInt4904 += 32;
									return true;
								} else if (Static309.aClass253_115 == Static316.aClass253_117) {
									local199 = Static210.aClass7_Sub14_Sub1_4.method3937();
									local70 = Static210.aClass7_Sub14_Sub1_4.method3935();
									local207 = Static210.aClass7_Sub14_Sub1_4.method3943();
									if (local207 == 65535) {
										local207 = -1;
									}
									local577 = Static210.aClass7_Sub14_Sub1_4.method3950();
									if (Static278.method3710(local70)) {
										Static289.method3834(local207, local199, local577);
										@Pc(1900) Class45 local1900 = Static259.aClass206_2.method4320(local207);
										Static272.method3650(local1900.anInt955, local1900.anInt984, local1900.anInt991, local577);
										Static224.method4572(local1900.anInt1000, local1900.anInt993, local577, local1900.anInt987);
									}
									Static316.aClass253_117 = null;
									return true;
								} else if (Static265.aClass253_99 == Static316.aClass253_117) {
									Static416.method5223(Static210.aClass7_Sub14_Sub1_4, Static205.anInt3627);
									Static316.aClass253_117 = null;
									return true;
								} else if (Static395.aClass253_143 == Static316.aClass253_117) {
									Static239.method3255(Static355.aClass94_20);
									Static316.aClass253_117 = null;
									return true;
								} else if (Static316.aClass253_117 == Static192.aClass253_74) {
									Static443.anInt7238 = Static210.aClass7_Sub14_Sub1_4.method3981();
									Static302.anInt5112 = Static90.anInt1865;
									Static316.aClass253_117 = null;
									return true;
								} else {
									@Pc(2007) long local2007;
									@Pc(2013) Class7_Sub16 local2013;
									@Pc(2024) Class7_Sub16 local2024;
									if (Static316.aClass253_117 == Static298.aClass253_110) {
										local199 = Static210.aClass7_Sub14_Sub1_4.method3935();
										local70 = Static210.aClass7_Sub14_Sub1_4.method3956();
										local207 = Static210.aClass7_Sub14_Sub1_4.method3943();
										if (local207 == 65535) {
											local207 = -1;
										}
										local577 = Static210.aClass7_Sub14_Sub1_4.method3943();
										local753 = Static210.aClass7_Sub14_Sub1_4.method3946();
										if (local753 == 65535) {
											local753 = -1;
										}
										if (Static278.method3710(local577)) {
											for (local757 = local207; local757 <= local753; local757++) {
												local2007 = (long) local757 + ((long) local70 << 32);
												local2013 = (Class7_Sub16) Static26.aClass164_4.method3512(local2007);
												if (local2013 != null) {
													local2024 = new Class7_Sub16(local2013.anInt2235, local199);
													local2013.method5802();
												} else if (local757 == -1) {
													local2024 = new Class7_Sub16(Static313.method4088(local70).aClass7_Sub16_2.anInt2235, local199);
												} else {
													local2024 = new Class7_Sub16(0, local199);
												}
												Static26.aClass164_4.method3508(local2007, local2024);
											}
										}
										Static316.aClass253_117 = null;
										return true;
									} else if (Static67.aClass253_22 == Static316.aClass253_117) {
										local199 = Static210.aClass7_Sub14_Sub1_4.method3943();
										local70 = Static210.aClass7_Sub14_Sub1_4.method3938();
										if (Static278.method3710(local199)) {
											Static301.method4013(3, -1, local70, -1);
										}
										Static316.aClass253_117 = null;
										return true;
									} else {
										@Pc(2118) long local2118;
										@Pc(2123) long local2123;
										@Pc(2128) long local2128;
										if (Static316.aClass253_117 == Static43.aClass253_12) {
											local825 = Static210.aClass7_Sub14_Sub1_4.method3981() == 1;
											local829 = Static210.aClass7_Sub14_Sub1_4.method3986();
											local831 = local829;
											if (local825) {
												local831 = Static210.aClass7_Sub14_Sub1_4.method3986();
											}
											local2118 = Static210.aClass7_Sub14_Sub1_4.method3941();
											local2123 = Static210.aClass7_Sub14_Sub1_4.method3943();
											local2128 = Static210.aClass7_Sub14_Sub1_4.method3975();
											local1111 = Static210.aClass7_Sub14_Sub1_4.method3981();
											@Pc(2139) long local2139 = (local2123 << 32) + local2128;
											@Pc(2141) boolean local2141 = false;
											@Pc(2143) int local2143 = 0;
											while (true) {
												if (local2143 >= 100) {
													if (local1111 <= 1) {
														if (Static148.aBoolean171 && !Static419.aBoolean437 || Static22.aBoolean309) {
															local2141 = true;
														} else if (Static21.method221(local831)) {
															local2141 = true;
														}
													}
													break;
												}
												if (local2139 == Static235.aLongArray7[local2143]) {
													local2141 = true;
													break;
												}
												local2143++;
											}
											if (!local2141 && Static221.anInt3902 == 0) {
												Static235.aLongArray7[Static252.anInt4263] = local2139;
												Static252.anInt4263 = (Static252.anInt4263 + 1) % 100;
												@Pc(2204) String local2204 = Static7.method43(Static86.method1477(Static210.aClass7_Sub14_Sub1_4));
												if (local1111 == 2 || local1111 == 3) {
													Static169.method2464("<img=1>" + local831, 9, 0, local2204, -1, Static458.method5799(local2118), "<img=1>" + local829);
												} else if (local1111 == 1) {
													Static169.method2464("<img=0>" + local831, 9, 0, local2204, -1, Static458.method5799(local2118), "<img=0>" + local829);
												} else {
													Static169.method2464(local831, 9, 0, local2204, -1, Static458.method5799(local2118), local829);
												}
											}
											Static316.aClass253_117 = null;
											return true;
										} else if (Static236.aClass253_83 == Static316.aClass253_117) {
											local199 = Static210.aClass7_Sub14_Sub1_4.method3943();
											local70 = Static210.aClass7_Sub14_Sub1_4.method3981();
											local207 = Static210.aClass7_Sub14_Sub1_4.method3981();
											local577 = Static210.aClass7_Sub14_Sub1_4.method3981();
											local753 = Static210.aClass7_Sub14_Sub1_4.method3981();
											local757 = Static210.aClass7_Sub14_Sub1_4.method3943();
											if (Static278.method3710(local199)) {
												Static172.aBooleanArray15[local70] = true;
												Static365.anIntArray540[local70] = local207;
												Static388.anIntArray562[local70] = local577;
												Static282.anIntArray426[local70] = local753;
												Static356.anIntArray523[local70] = local757;
											}
											Static316.aClass253_117 = null;
											return true;
										} else if (Static252.aClass253_91 == Static316.aClass253_117) {
											Static421.anInt6702 = Static210.aClass7_Sub14_Sub1_4.method3945() << 3;
											Static287.anInt6591 = Static210.aClass7_Sub14_Sub1_4.method3972();
											Static400.anInt5902 = Static210.aClass7_Sub14_Sub1_4.method3930() << 3;
											Static316.aClass253_117 = null;
											return true;
										} else if (Static94.aClass253_34 == Static316.aClass253_117) {
											local199 = Static210.aClass7_Sub14_Sub1_4.method3990();
											local70 = Static210.aClass7_Sub14_Sub1_4.method3968();
											local207 = Static210.aClass7_Sub14_Sub1_4.method3950();
											local577 = Static210.aClass7_Sub14_Sub1_4.method3990();
											if (Static278.method3710(local577)) {
												local452 = (Class7_Sub44) Static23.aClass164_3.method3512((long) local207);
												if (local452 != null) {
													Static255.method3394(local452.anInt7165 != local199, local452, false);
												}
												Static436.method5609(local70, local207, local199, false);
											}
											Static316.aClass253_117 = null;
											return true;
										} else if (Static44.aClass253_13 == Static316.aClass253_117) {
											local637 = Static210.aClass7_Sub14_Sub1_4.method3986();
											local70 = Static210.aClass7_Sub14_Sub1_4.method3943();
											local831 = Static209.aClass204_1.method4288(local70).method4273(Static210.aClass7_Sub14_Sub1_4);
											Static169.method2464(local637, 19, 0, local831, local70, null, local637);
											Static316.aClass253_117 = null;
											return true;
										} else if (Static421.aClass253_150 == Static316.aClass253_117) {
											local199 = Static210.aClass7_Sub14_Sub1_4.method3937();
											local70 = Static210.aClass7_Sub14_Sub1_4.method3950();
											local207 = Static210.aClass7_Sub14_Sub1_4.method3943();
											local577 = Static210.aClass7_Sub14_Sub1_4.method3943();
											if (Static278.method3710(local207)) {
												Static301.method4013(5, local577, local70, local199);
											}
											Static316.aClass253_117 = null;
											return true;
										} else if (Static316.aClass253_117 == Static243.aClass253_85) {
											Static362.method4646(false);
											Static316.aClass253_117 = null;
											return false;
										} else {
											@Pc(2531) int local2531;
											@Pc(2541) int local2541;
											if (Static316.aClass253_117 == Static275.aClass253_104) {
												local825 = Static210.aClass7_Sub14_Sub1_4.method3981() == 1;
												local829 = Static210.aClass7_Sub14_Sub1_4.method3986();
												local831 = local829;
												if (local825) {
													local831 = Static210.aClass7_Sub14_Sub1_4.method3986();
												}
												local2118 = Static210.aClass7_Sub14_Sub1_4.method3943();
												local2123 = Static210.aClass7_Sub14_Sub1_4.method3975();
												local2531 = Static210.aClass7_Sub14_Sub1_4.method3981();
												@Pc(2537) long local2537 = (local2118 << 32) + local2123;
												@Pc(2539) boolean local2539 = false;
												local2541 = 0;
												while (true) {
													if (local2541 >= 100) {
														if (local2531 <= 1) {
															if (Static148.aBoolean171 && !Static419.aBoolean437 || Static22.aBoolean309) {
																local2539 = true;
															} else if (Static21.method221(local831)) {
																local2539 = true;
															}
														}
														break;
													}
													if (Static235.aLongArray7[local2541] == local2537) {
														local2539 = true;
														break;
													}
													local2541++;
												}
												if (!local2539 && Static221.anInt3902 == 0) {
													Static235.aLongArray7[Static252.anInt4263] = local2537;
													Static252.anInt4263 = (Static252.anInt4263 + 1) % 100;
													@Pc(2601) String local2601 = Static7.method43(Static86.method1477(Static210.aClass7_Sub14_Sub1_4));
													if (local2531 == 2) {
														Static169.method2464("<img=1>" + local831, 7, 0, local2601, -1, null, "<img=1>" + local829);
													} else if (local2531 == 1) {
														Static169.method2464("<img=0>" + local831, 7, 0, local2601, -1, null, "<img=0>" + local829);
													} else {
														Static169.method2464(local831, 3, 0, local2601, -1, null, local829);
													}
												}
												Static316.aClass253_117 = null;
												return true;
											} else if (Static335.aClass253_121 == Static316.aClass253_117) {
												local199 = Static210.aClass7_Sub14_Sub1_4.method3954();
												local70 = Static210.aClass7_Sub14_Sub1_4.method3990();
												local207 = Static210.aClass7_Sub14_Sub1_4.method3950();
												if (Static278.method3710(local70)) {
													Static414.method5212(local207, local199);
												}
												Static316.aClass253_117 = null;
												return true;
											} else if (Static192.aClass253_73 == Static316.aClass253_117) {
												local199 = Static210.aClass7_Sub14_Sub1_4.method3943();
												local70 = Static210.aClass7_Sub14_Sub1_4.method3981();
												local1039 = (local70 & 0x1) == 1;
												while (Static205.anInt3627 > Static210.aClass7_Sub14_Sub1_4.anInt4989) {
													local577 = Static210.aClass7_Sub14_Sub1_4.method3940();
													local753 = Static210.aClass7_Sub14_Sub1_4.method3943();
													local757 = 0;
													if (local753 != 0) {
														local757 = Static210.aClass7_Sub14_Sub1_4.method3981();
														if (local757 == 255) {
															local757 = Static210.aClass7_Sub14_Sub1_4.method3938();
														}
													}
													Static42.method574(local199, local753 - 1, local577, local757, local1039);
												}
												Static322.anIntArray482[Static31.anInt524++ & 0x1F] = local199;
												Static316.aClass253_117 = null;
												return true;
											} else if (Static142.aClass253_53 == Static316.aClass253_117) {
												Static40.method2440(false);
												Static316.aClass253_117 = null;
												return true;
											} else if (Static280.aClass253_106 == Static316.aClass253_117) {
												local199 = Static210.aClass7_Sub14_Sub1_4.method3943();
												local70 = Static210.aClass7_Sub14_Sub1_4.method3981();
												local1039 = (local70 & 0x1) == 1;
												Static359.method4608(local1039, local199);
												local577 = Static210.aClass7_Sub14_Sub1_4.method3943();
												for (local753 = 0; local753 < local577; local753++) {
													local757 = Static210.aClass7_Sub14_Sub1_4.method3968();
													if (local757 == 255) {
														local757 = Static210.aClass7_Sub14_Sub1_4.method3956();
													}
													local1215 = Static210.aClass7_Sub14_Sub1_4.method3943();
													Static42.method574(local199, local1215 - 1, local753, local757, local1039);
												}
												Static322.anIntArray482[Static31.anInt524++ & 0x1F] = local199;
												Static316.aClass253_117 = null;
												return true;
											} else if (Static316.aClass253_117 == Static251.aClass253_90) {
												local637 = Static210.aClass7_Sub14_Sub1_4.method3986();
												local829 = Static7.method43(Static86.method1477(Static210.aClass7_Sub14_Sub1_4));
												Static336.method4383(6, 0, local637, local829, local637);
												Static316.aClass253_117 = null;
												return true;
											} else if (Static316.aClass253_117 == Static74.aClass253_24) {
												Static344.aClass175_3 = Static384.method5647(Static210.aClass7_Sub14_Sub1_4.method3981());
												Static316.aClass253_117 = null;
												return true;
											} else if (Static91.aClass253_33 == Static316.aClass253_117) {
												Static287.anInt6591 = Static210.aClass7_Sub14_Sub1_4.method3972();
												Static400.anInt5902 = Static210.aClass7_Sub14_Sub1_4.method3930() << 3;
												Static421.anInt6702 = Static210.aClass7_Sub14_Sub1_4.method3945() << 3;
												for (@Pc(2926) Class7_Sub34 local2926 = (Class7_Sub34) Static345.aClass164_33.method3514(); local2926 != null; local2926 = (Class7_Sub34) Static345.aClass164_33.method3519()) {
													local70 = (int) (local2926.aLong230 & 0x3FFFL);
													local207 = (int) (local2926.aLong230 >> 14 & 0x3FFFL);
													local577 = (int) (local2926.aLong230 >> 28 & 0x3L);
													if (local577 == Static287.anInt6591 && Static421.anInt6702 <= local70 && Static421.anInt6702 + 8 > local70 && local207 >= Static400.anInt5902 && local207 < Static400.anInt5902 + 8) {
														local2926.method5802();
														Static32.method424(local70, local207, Static287.anInt6591);
													}
												}
												for (@Pc(3005) Class7_Sub37 local3005 = (Class7_Sub37) Static276.aClass85_30.method2010(); local3005 != null; local3005 = (Class7_Sub37) Static276.aClass85_30.method2000()) {
													if (Static421.anInt6702 <= local3005.anInt5481 && local3005.anInt5481 < Static421.anInt6702 + 8 && Static400.anInt5902 <= local3005.anInt5477 && local3005.anInt5477 < Static400.anInt5902 + 8 && local3005.anInt5482 == Static287.anInt6591) {
														local3005.anInt5480 = 0;
													}
												}
												Static316.aClass253_117 = null;
												return true;
											} else if (Static316.aClass253_117 == Static278.aClass253_105) {
												Static386.method4948();
												Static316.aClass253_117 = null;
												return true;
											} else if (Static334.aClass253_120 == Static316.aClass253_117) {
												local825 = Static210.aClass7_Sub14_Sub1_4.method3981() == 1;
												@Pc(3087) byte[] local3087 = new byte[Static205.anInt3627 - 1];
												Static210.aClass7_Sub14_Sub1_4.method3932(local3087, Static205.anInt3627 - 1);
												Static256.method3402(local825, local3087);
												Static316.aClass253_117 = null;
												return true;
											} else if (Static316.aClass253_117 == Static258.aClass253_93) {
												Static239.method3255(Static97.aClass94_10);
												Static316.aClass253_117 = null;
												return true;
											} else if (Static356.aClass253_127 == Static316.aClass253_117) {
												Static133.anInt2522 = Static210.aClass7_Sub14_Sub1_4.method3961();
												Static316.aClass253_117 = null;
												Static302.anInt5112 = Static90.anInt1865;
												return true;
											} else {
												@Pc(3160) boolean local3160;
												@Pc(3216) boolean local3216;
												if (Static316.aClass253_117 == Static363.aClass253_131) {
													while (Static210.aClass7_Sub14_Sub1_4.anInt4989 < Static205.anInt3627) {
														local825 = Static210.aClass7_Sub14_Sub1_4.method3981() == 1;
														local829 = Static210.aClass7_Sub14_Sub1_4.method3986();
														local831 = Static210.aClass7_Sub14_Sub1_4.method3986();
														local577 = Static210.aClass7_Sub14_Sub1_4.method3943();
														local753 = Static210.aClass7_Sub14_Sub1_4.method3981();
														local238 = "";
														local3160 = false;
														if (local577 > 0) {
															local238 = Static210.aClass7_Sub14_Sub1_4.method3986();
															local3160 = Static210.aClass7_Sub14_Sub1_4.method3981() == 1;
														}
														for (local2531 = 0; local2531 < Static184.anInt3296; local2531++) {
															if (local825) {
																if (local831.equals(Static193.aStringArray30[local2531])) {
																	Static193.aStringArray30[local2531] = local829;
																	Static448.aStringArray53[local2531] = local831;
																	local829 = null;
																	break;
																}
															} else if (local829.equals(Static193.aStringArray30[local2531])) {
																if (Static37.anIntArray54[local2531] != local577) {
																	local3216 = true;
																	for (@Pc(3221) Class28_Sub1_Sub2 local3221 = (Class28_Sub1_Sub2) Static45.aClass169_2.method3598(); local3221 != null; local3221 = (Class28_Sub1_Sub2) Static45.aClass169_2.method3597()) {
																		if (local3221.aString71.equals(local829)) {
																			if (local577 != 0 && local3221.aShort101 == 0) {
																				local3221.method5642();
																				local3216 = false;
																			} else if (local577 == 0 && local3221.aShort101 != 0) {
																				local3216 = false;
																				local3221.method5642();
																			}
																		}
																	}
																	if (local3216) {
																		Static45.aClass169_2.method3603(new Class28_Sub1_Sub2(local829, local577));
																	}
																	Static37.anIntArray54[local2531] = local577;
																}
																Static448.aStringArray53[local2531] = local831;
																Static70.aStringArray6[local2531] = local238;
																Static123.anIntArray169[local2531] = local753;
																local829 = null;
																Static88.aBooleanArray5[local2531] = local3160;
																break;
															}
														}
														if (local829 != null && Static184.anInt3296 < 200) {
															Static193.aStringArray30[Static184.anInt3296] = local829;
															Static448.aStringArray53[Static184.anInt3296] = local831;
															Static37.anIntArray54[Static184.anInt3296] = local577;
															Static70.aStringArray6[Static184.anInt3296] = local238;
															Static123.anIntArray169[Static184.anInt3296] = local753;
															Static88.aBooleanArray5[Static184.anInt3296] = local3160;
															Static184.anInt3296++;
														}
													}
													Static458.anInt7538 = 2;
													Static324.anInt5357 = Static90.anInt1865;
													local70 = Static184.anInt3296;
													while (local70 > 0) {
														local70--;
														local825 = true;
														for (local207 = 0; local207 < local70; local207++) {
															if (Static37.anIntArray54[local207] != Static393.aClass124_5.anInt3453 && Static37.anIntArray54[local207 + 1] == Static393.aClass124_5.anInt3453 || Static37.anIntArray54[local207] == 0 && Static37.anIntArray54[local207 + 1] != 0) {
																local577 = Static37.anIntArray54[local207];
																Static37.anIntArray54[local207] = Static37.anIntArray54[local207 + 1];
																Static37.anIntArray54[local207 + 1] = local577;
																local211 = Static70.aStringArray6[local207];
																Static70.aStringArray6[local207] = Static70.aStringArray6[local207 + 1];
																Static70.aStringArray6[local207 + 1] = local211;
																local238 = Static193.aStringArray30[local207];
																Static193.aStringArray30[local207] = Static193.aStringArray30[local207 + 1];
																Static193.aStringArray30[local207 + 1] = local238;
																local873 = Static448.aStringArray53[local207];
																Static448.aStringArray53[local207] = Static448.aStringArray53[local207 + 1];
																Static448.aStringArray53[local207 + 1] = local873;
																local2531 = Static123.anIntArray169[local207];
																Static123.anIntArray169[local207] = Static123.anIntArray169[local207 + 1];
																Static123.anIntArray169[local207 + 1] = local2531;
																local3216 = Static88.aBooleanArray5[local207];
																Static88.aBooleanArray5[local207] = Static88.aBooleanArray5[local207 + 1];
																local825 = false;
																Static88.aBooleanArray5[local207 + 1] = local3216;
															}
														}
														if (local825) {
															break;
														}
													}
													Static316.aClass253_117 = null;
													return true;
												} else if (Static146.aClass253_147 == Static316.aClass253_117) {
													local199 = Static210.aClass7_Sub14_Sub1_4.method3946();
													if (local199 == 65535) {
														local199 = -1;
													}
													local70 = Static210.aClass7_Sub14_Sub1_4.method3972();
													local207 = Static210.aClass7_Sub14_Sub1_4.method3968();
													local209 = Static210.aClass7_Sub14_Sub1_4.method3986();
													if (local207 >= 1 && local207 <= 8) {
														if (local209.equalsIgnoreCase("null")) {
															local209 = null;
														}
														Static191.aStringArray29[local207 - 1] = local209;
														Static233.anIntArray489[local207 - 1] = local199;
														Static157.aBooleanArray14[local207 - 1] = local70 == 0;
													}
													Static316.aClass253_117 = null;
													return true;
												} else if (Static182.aClass253_71 == Static316.aClass253_117) {
													Static254.anInt4291 = Static90.anInt1865;
													if (Static205.anInt3627 == 0) {
														Static267.anInt4534 = 0;
														Static316.aClass253_117 = null;
														Static364.aString17 = null;
														Static76.aClass129Array1 = null;
														Static44.aString5 = null;
														return true;
													}
													Static44.aString5 = Static210.aClass7_Sub14_Sub1_4.method3986();
													local825 = Static210.aClass7_Sub14_Sub1_4.method3981() == 1;
													if (local825) {
														Static210.aClass7_Sub14_Sub1_4.method3986();
													}
													@Pc(3635) long local3635 = Static210.aClass7_Sub14_Sub1_4.method3941();
													Static364.aString17 = Static65.method1861(local3635);
													Static248.aByte42 = Static210.aClass7_Sub14_Sub1_4.method3930();
													local577 = Static210.aClass7_Sub14_Sub1_4.method3981();
													if (local577 == 255) {
														Static316.aClass253_117 = null;
														return true;
													}
													Static267.anInt4534 = local577;
													@Pc(3661) Class129[] local3661 = new Class129[100];
													for (local757 = 0; local757 < Static267.anInt4534; local757++) {
														local3661[local757] = new Class129();
														local3661[local757].aString40 = Static210.aClass7_Sub14_Sub1_4.method3986();
														local825 = Static210.aClass7_Sub14_Sub1_4.method3981() == 1;
														if (local825) {
															local3661[local757].aString39 = Static210.aClass7_Sub14_Sub1_4.method3986();
														} else {
															local3661[local757].aString39 = local3661[local757].aString40;
														}
														local3661[local757].aString42 = Static345.method4461(local3661[local757].aString39);
														local3661[local757].anInt3588 = Static210.aClass7_Sub14_Sub1_4.method3943();
														local3661[local757].aByte33 = Static210.aClass7_Sub14_Sub1_4.method3930();
														local3661[local757].aString41 = Static210.aClass7_Sub14_Sub1_4.method3986();
														if (local3661[local757].aString39.equals(Static104.aClass26_Sub2_Sub4_Sub2_2.aString69)) {
															Static62.aByte12 = local3661[local757].aByte33;
														}
													}
													local1101 = Static267.anInt4534;
													while (local1101 > 0) {
														local3160 = true;
														local1101--;
														for (local1111 = 0; local1111 < local1101; local1111++) {
															if (local3661[local1111].aString42.compareTo(local3661[local1111 + 1].aString42) > 0) {
																local1076 = local3661[local1111];
																local3661[local1111] = local3661[local1111 + 1];
																local3160 = false;
																local3661[local1111 + 1] = local1076;
															}
														}
														if (local3160) {
															break;
														}
													}
													Static316.aClass253_117 = null;
													Static76.aClass129Array1 = local3661;
													return true;
												} else if (Static316.aClass253_117 == Static181.aClass253_70) {
													Static210.aClass7_Sub14_Sub1_4.anInt4989 += 28;
													if (Static210.aClass7_Sub14_Sub1_4.method3978()) {
														Static434.method5571(Static210.aClass7_Sub14_Sub1_4, Static210.aClass7_Sub14_Sub1_4.anInt4989 - 28);
													}
													Static316.aClass253_117 = null;
													return true;
												} else if (Static403.aClass253_89 == Static316.aClass253_117) {
													Static76.anInt1558 = Static210.aClass7_Sub14_Sub1_4.method3931();
													Static127.anInt2456 = Static210.aClass7_Sub14_Sub1_4.method3981();
													Static316.aClass253_117 = null;
													return true;
												} else if (Static316.aClass253_117 == Static449.aClass253_162) {
													Static239.method3255(Static62.aClass94_5);
													Static316.aClass253_117 = null;
													return true;
												} else if (Static367.aClass253_133 == Static316.aClass253_117) {
													Static362.method4646(Static385.aBoolean406);
													Static316.aClass253_117 = null;
													return false;
												} else if (Static316.aClass253_117 == Static442.aClass253_159) {
													local199 = Static210.aClass7_Sub14_Sub1_4.method3990();
													local70 = Static210.aClass7_Sub14_Sub1_4.method3950();
													local207 = Static210.aClass7_Sub14_Sub1_4.method3935();
													if (Static278.method3710(local199)) {
														Static305.method5641(local70, local207);
													}
													Static316.aClass253_117 = null;
													return true;
												} else {
													@Pc(3963) int local3963;
													if (Static316.aClass253_117 == Static365.aClass253_132) {
														local825 = Static210.aClass7_Sub14_Sub1_4.method3981() == 1;
														local829 = Static210.aClass7_Sub14_Sub1_4.method3986();
														local831 = local829;
														if (local825) {
															local831 = Static210.aClass7_Sub14_Sub1_4.method3986();
														}
														local2118 = Static210.aClass7_Sub14_Sub1_4.method3943();
														local2123 = Static210.aClass7_Sub14_Sub1_4.method3975();
														local2531 = Static210.aClass7_Sub14_Sub1_4.method3981();
														local1101 = Static210.aClass7_Sub14_Sub1_4.method3943();
														@Pc(3959) long local3959 = (local2118 << 32) + local2123;
														@Pc(3961) boolean local3961 = false;
														local3963 = 0;
														while (true) {
															if (local3963 >= 100) {
																if (local2531 <= 1 && Static21.method221(local831)) {
																	local3961 = true;
																}
																break;
															}
															if (Static235.aLongArray7[local3963] == local3959) {
																local3961 = true;
																break;
															}
															local3963++;
														}
														if (!local3961 && Static221.anInt3902 == 0) {
															Static235.aLongArray7[Static252.anInt4263] = local3959;
															Static252.anInt4263 = (Static252.anInt4263 + 1) % 100;
															@Pc(4015) String local4015 = Static209.aClass204_1.method4288(local1101).method4273(Static210.aClass7_Sub14_Sub1_4);
															if (local2531 == 2) {
																Static169.method2464("<img=1>" + local831, 18, 0, local4015, local1101, null, "<img=1>" + local829);
															} else if (local2531 == 1) {
																Static169.method2464("<img=0>" + local831, 18, 0, local4015, local1101, null, "<img=0>" + local829);
															} else {
																Static169.method2464(local831, 18, 0, local4015, local1101, null, local829);
															}
														}
														Static316.aClass253_117 = null;
														return true;
													} else if (Static316.aClass253_117 == Static444.aClass253_160) {
														local199 = Static210.aClass7_Sub14_Sub1_4.method3981();
														@Pc(4100) boolean local4100 = (local199 & 0x1) == 1;
														local831 = Static210.aClass7_Sub14_Sub1_4.method3986();
														local209 = Static210.aClass7_Sub14_Sub1_4.method3986();
														if (local209.equals("")) {
															local209 = local831;
														}
														local211 = Static210.aClass7_Sub14_Sub1_4.method3986();
														local238 = Static210.aClass7_Sub14_Sub1_4.method3986();
														if (local238.equals("")) {
															local238 = local211;
														}
														if (local4100) {
															for (local1215 = 0; local1215 < Static206.anInt3640; local1215++) {
																if (Static248.aStringArray35[local1215].equals(local238)) {
																	Static84.aStringArray37[local1215] = local831;
																	Static248.aStringArray35[local1215] = local209;
																	Static332.aStringArray46[local1215] = local211;
																	Static226.aStringArray33[local1215] = local238;
																	break;
																}
															}
														} else {
															Static84.aStringArray37[Static206.anInt3640] = local831;
															Static248.aStringArray35[Static206.anInt3640] = local209;
															Static332.aStringArray46[Static206.anInt3640] = local211;
															Static226.aStringArray33[Static206.anInt3640] = local238;
															Static45.aBooleanArray1[Static206.anInt3640] = (local199 & 0x2) == 2;
															Static206.anInt3640++;
														}
														Static324.anInt5357 = Static90.anInt1865;
														Static316.aClass253_117 = null;
														return true;
													} else if (Static259.aClass253_94 == Static316.aClass253_117) {
														Static239.method3255(Static278.aClass94_21);
														Static316.aClass253_117 = null;
														return true;
													} else if (Static271.aClass253_103 == Static316.aClass253_117) {
														local199 = Static210.aClass7_Sub14_Sub1_4.method3943();
														if (local199 == 65535) {
															local199 = -1;
														}
														local70 = Static210.aClass7_Sub14_Sub1_4.method3981();
														local207 = Static210.aClass7_Sub14_Sub1_4.method3943();
														local577 = Static210.aClass7_Sub14_Sub1_4.method3981();
														Static341.method4428(local70, local577, local199, local207);
														Static316.aClass253_117 = null;
														return true;
													} else if (Static117.aClass253_45 == Static316.aClass253_117) {
														local199 = Static210.aClass7_Sub14_Sub1_4.method3972();
														local70 = Static210.aClass7_Sub14_Sub1_4.method3968();
														local207 = Static210.aClass7_Sub14_Sub1_4.method3937();
														Static446.anIntArray621[local70] = local207;
														Static29.anIntArray46[local70] = local199;
														Static326.anIntArray624[local70] = 1;
														local577 = Static117.anIntArray167[local70] - 1;
														for (local753 = 0; local753 < local577; local753++) {
															if (Class197.anIntArray463[local753] <= local207) {
																Static326.anIntArray624[local70] = local753 + 2;
															}
														}
														Static340.anIntArray497[Static111.anInt2255++ & 0x1F] = local70;
														Static316.aClass253_117 = null;
														return true;
													} else if (Static316.aClass253_117 == Static188.aClass253_72) {
														local199 = Static210.aClass7_Sub14_Sub1_4.method3935();
														local70 = Static210.aClass7_Sub14_Sub1_4.method3943();
														local831 = Static210.aClass7_Sub14_Sub1_4.method3986();
														if (Static278.method3710(local70)) {
															Static65.method1859(local199, local831);
														}
														Static316.aClass253_117 = null;
														return true;
													} else if (Static316.aClass253_117 == Static410.aClass253_148) {
														local199 = Static210.aClass7_Sub14_Sub1_4.method3943();
														local70 = Static210.aClass7_Sub14_Sub1_4.method3935();
														local207 = Static210.aClass7_Sub14_Sub1_4.method3946();
														local577 = Static210.aClass7_Sub14_Sub1_4.method3956();
														if (Static278.method3710(local199)) {
															Static31.method418((local70 << 16) + local207, local577);
														}
														Static316.aClass253_117 = null;
														return true;
													} else if (Static316.aClass253_117 == Static156.aClass253_59) {
														local199 = Static210.aClass7_Sub14_Sub1_4.method3943();
														local70 = Static210.aClass7_Sub14_Sub1_4.method3935();
														local207 = Static210.aClass7_Sub14_Sub1_4.method3943();
														if (Static278.method3710(local70)) {
															Static68.method1151(local207, local199);
														}
														Static316.aClass253_117 = null;
														return true;
													} else if (Static368.aClass253_134 == Static316.aClass253_117) {
														if (Static145.aFrame4 != null) {
															Static335.method4379(Static130.aClass153_Sub1_1.anInt5233, -1, false, -1);
														}
														@Pc(4422) byte[] local4422 = new byte[Static205.anInt3627];
														Static210.aClass7_Sub14_Sub1_4.method1357(local4422, Static205.anInt3627);
														local829 = Static184.method2672(local4422, 0, Static205.anInt3627);
														Static361.method4643(true, Static377.anInt6113 == 1, Static230.aClass61_4, local829);
														Static316.aClass253_117 = null;
														return true;
													} else if (Static299.aClass253_112 == Static316.aClass253_117) {
														local199 = Static210.aClass7_Sub14_Sub1_4.method3943();
														local70 = Static210.aClass7_Sub14_Sub1_4.method3972();
														local1039 = (local70 & 0x1) == 1;
														Static448.method5679(local1039, local199);
														Static322.anIntArray482[Static31.anInt524++ & 0x1F] = local199;
														Static316.aClass253_117 = null;
														return true;
													} else if (Static316.aClass253_117 == Static135.aClass253_111) {
														if (Static183.anInt3293 != -1) {
															Static379.method4657(0, Static183.anInt3293);
														}
														Static316.aClass253_117 = null;
														return true;
													} else if (Static58.aClass253_19 == Static316.aClass253_117) {
														local199 = Static210.aClass7_Sub14_Sub1_4.method3935();
														if (local199 == 65535) {
															local199 = -1;
														}
														local70 = Static210.aClass7_Sub14_Sub1_4.method3935();
														local207 = Static210.aClass7_Sub14_Sub1_4.method3937();
														if (Static278.method3710(local70)) {
															Static301.method4013(2, local199, local207, -1);
														}
														Static316.aClass253_117 = null;
														return true;
													} else if (Static17.aClass253_3 == Static316.aClass253_117) {
														Static239.method3255(Static65.aClass94_12);
														Static316.aClass253_117 = null;
														return true;
													} else if (Static433.aClass253_156 == Static316.aClass253_117) {
														local199 = Static210.aClass7_Sub14_Sub1_4.method3943();
														if (Static278.method3710(local199)) {
															Static359.method4613();
														}
														Static316.aClass253_117 = null;
														return true;
													} else if (Static316.aClass253_117 == Static360.aClass253_128) {
														local199 = Static210.aClass7_Sub14_Sub1_4.method3943();
														if (local199 == 65535) {
															local199 = -1;
														}
														local70 = Static210.aClass7_Sub14_Sub1_4.method3981();
														local207 = Static210.aClass7_Sub14_Sub1_4.method3943();
														local577 = Static210.aClass7_Sub14_Sub1_4.method3981();
														Static90.method1614(local207, local577, local199, local70);
														Static316.aClass253_117 = null;
														return true;
													} else if (Static316.aClass253_117 == Static126.aClass253_47) {
														local199 = Static210.aClass7_Sub14_Sub1_4.method3943();
														local70 = Static210.aClass7_Sub14_Sub1_4.method3981();
														local207 = Static210.aClass7_Sub14_Sub1_4.method3981();
														local577 = Static210.aClass7_Sub14_Sub1_4.method3943() << 0;
														local753 = Static210.aClass7_Sub14_Sub1_4.method3981();
														local757 = Static210.aClass7_Sub14_Sub1_4.method3981();
														if (Static278.method3710(local199)) {
															Static442.method5639(local757, local207, true, local70, local753, local577);
														}
														Static316.aClass253_117 = null;
														return true;
													} else if (Static90.aClass253_32 == Static316.aClass253_117) {
														local199 = Static210.aClass7_Sub14_Sub1_4.method3937();
														local70 = Static210.aClass7_Sub14_Sub1_4.method3935();
														local207 = Static210.aClass7_Sub14_Sub1_4.method3943();
														if (Static278.method3710(local70)) {
															Static222.method3121(local207, local199);
														}
														Static316.aClass253_117 = null;
														return true;
													} else if (Static316.aClass253_117 == Static78.aClass253_27) {
														Static206.anInt3640 = Static210.aClass7_Sub14_Sub1_4.method3981();
														for (local199 = 0; local199 < Static206.anInt3640; local199++) {
															Static84.aStringArray37[local199] = Static210.aClass7_Sub14_Sub1_4.method3986();
															Static248.aStringArray35[local199] = Static210.aClass7_Sub14_Sub1_4.method3986();
															if (Static248.aStringArray35[local199].equals("")) {
																Static248.aStringArray35[local199] = Static84.aStringArray37[local199];
															}
															Static332.aStringArray46[local199] = Static210.aClass7_Sub14_Sub1_4.method3986();
															Static226.aStringArray33[local199] = Static210.aClass7_Sub14_Sub1_4.method3986();
															if (Static226.aStringArray33[local199].equals("")) {
																Static226.aStringArray33[local199] = Static332.aStringArray46[local199];
															}
															Static45.aBooleanArray1[local199] = false;
														}
														Static324.anInt5357 = Static90.anInt1865;
														Static316.aClass253_117 = null;
														return true;
													} else if (Static316.aClass253_117 == Static40.aClass253_64) {
														Static40.method2440(true);
														Static316.aClass253_117 = null;
														return true;
													} else if (Static363.aClass253_130 == Static316.aClass253_117) {
														local199 = Static210.aClass7_Sub14_Sub1_4.method3981();
														if (Static210.aClass7_Sub14_Sub1_4.method3981() == 0) {
															Static286.aClass242Array3[local199] = new Class242();
														} else {
															Static210.aClass7_Sub14_Sub1_4.anInt4989--;
															Static286.aClass242Array3[local199] = new Class242(Static210.aClass7_Sub14_Sub1_4);
														}
														Static316.aClass253_117 = null;
														Static104.anInt2124 = Static90.anInt1865;
														return true;
													} else if (Static113.aClass253_44 == Static316.aClass253_117) {
														Static458.anInt7538 = 1;
														Static324.anInt5357 = Static90.anInt1865;
														Static316.aClass253_117 = null;
														return true;
													} else if (Static408.aClass253_146 == Static316.aClass253_117) {
														Static239.method3255(Static425.aClass94_24);
														Static316.aClass253_117 = null;
														return true;
													} else if (Static316.aClass253_117 == Static254.aClass253_92) {
														local199 = Static210.aClass7_Sub14_Sub1_4.method3990();
														local70 = Static210.aClass7_Sub14_Sub1_4.method3937();
														Static224.aClass239_7.method4999(local199, local70);
														Static316.aClass253_117 = null;
														return true;
													} else if (Static316.aClass253_117 == Static162.aClass253_61) {
														local199 = Static210.aClass7_Sub14_Sub1_4.method3938();
														local70 = Static210.aClass7_Sub14_Sub1_4.method3946();
														local207 = Static210.aClass7_Sub14_Sub1_4.method3946();
														if (local207 == 65535) {
															local207 = -1;
														}
														if (Static278.method3710(local70)) {
															Static301.method4013(1, local207, local199, -1);
														}
														Static316.aClass253_117 = null;
														return true;
													} else if (Static316.aClass253_117 == Static391.aClass253_140) {
														local199 = Static210.aClass7_Sub14_Sub1_4.method3981();
														local70 = local199 >> 5;
														local207 = local199 & 0x1F;
														if (local207 == 0) {
															Static325.aClass150Array1[local70] = null;
															Static316.aClass253_117 = null;
															return true;
														}
														@Pc(4898) Class150 local4898 = new Class150();
														local4898.anInt4136 = local207;
														local4898.anInt4138 = Static210.aClass7_Sub14_Sub1_4.method3981();
														if (local4898.anInt4138 >= 0 && local4898.anInt4138 < Static378.aClass11Array12.length) {
															if (local4898.anInt4136 == 1 || local4898.anInt4136 == 10) {
																local4898.anInt4139 = Static210.aClass7_Sub14_Sub1_4.method3943();
																Static210.aClass7_Sub14_Sub1_4.anInt4989 += 6;
															} else if (local4898.anInt4136 >= 2 && local4898.anInt4136 <= 6) {
																if (local4898.anInt4136 == 2) {
																	local4898.anInt4134 = 64;
																	local4898.anInt4144 = 64;
																}
																if (local4898.anInt4136 == 3) {
																	local4898.anInt4144 = 0;
																	local4898.anInt4134 = 64;
																}
																if (local4898.anInt4136 == 4) {
																	local4898.anInt4134 = 64;
																	local4898.anInt4144 = 128;
																}
																if (local4898.anInt4136 == 5) {
																	local4898.anInt4144 = 64;
																	local4898.anInt4134 = 0;
																}
																if (local4898.anInt4136 == 6) {
																	local4898.anInt4134 = 128;
																	local4898.anInt4144 = 64;
																}
																local4898.anInt4136 = 2;
																local4898.anInt4137 = Static210.aClass7_Sub14_Sub1_4.method3981();
																local4898.anInt4144 += Static210.aClass7_Sub14_Sub1_4.method3943() - Static359.anInt5713 << 7;
																local4898.anInt4134 += Static210.aClass7_Sub14_Sub1_4.method3943() - Static314.anInt5181 << 7;
																local4898.anInt4143 = Static210.aClass7_Sub14_Sub1_4.method3981() << 0;
																local4898.anInt4135 = Static210.aClass7_Sub14_Sub1_4.method3943();
															}
															local4898.anInt4141 = Static210.aClass7_Sub14_Sub1_4.method3943();
															if (local4898.anInt4141 == 65535) {
																local4898.anInt4141 = -1;
															}
															Static325.aClass150Array1[local70] = local4898;
														}
														Static316.aClass253_117 = null;
														return true;
													} else if (Static316.aClass253_117 == Static351.aClass253_125) {
														Static239.method3255(Static122.aClass94_15);
														Static316.aClass253_117 = null;
														return true;
													} else if (Static316.aClass253_117 == Static118.aClass253_46) {
														local199 = Static210.aClass7_Sub14_Sub1_4.method3990();
														if (local199 == 65535) {
															local199 = -1;
														}
														local70 = Static210.aClass7_Sub14_Sub1_4.method3956();
														local207 = Static210.aClass7_Sub14_Sub1_4.method3937();
														local577 = Static210.aClass7_Sub14_Sub1_4.method3935();
														if (local577 == 65535) {
															local577 = -1;
														}
														local753 = Static210.aClass7_Sub14_Sub1_4.method3943();
														if (Static278.method3710(local753)) {
															for (local757 = local577; local757 <= local199; local757++) {
																local2007 = (long) local757 + ((long) local207 << 32);
																local2013 = (Class7_Sub16) Static26.aClass164_4.method3512(local2007);
																if (local2013 != null) {
																	local2024 = new Class7_Sub16(local70, local2013.anInt2247);
																	local2013.method5802();
																} else if (local757 == -1) {
																	local2024 = new Class7_Sub16(local70, Static313.method4088(local207).aClass7_Sub16_2.anInt2247);
																} else {
																	local2024 = new Class7_Sub16(local70, -1);
																}
																Static26.aClass164_4.method3508(local2007, local2024);
															}
														}
														Static316.aClass253_117 = null;
														return true;
													} else if (Static104.aClass253_42 == Static316.aClass253_117) {
														local199 = Static210.aClass7_Sub14_Sub1_4.method3931();
														local70 = Static210.aClass7_Sub14_Sub1_4.method3990();
														if (Static278.method3710(local70)) {
															Static35.anInt4769 = local199;
														}
														Static316.aClass253_117 = null;
														return true;
													} else if (Static316.aClass253_117 == Static214.aClass253_50) {
														local199 = Static210.aClass7_Sub14_Sub1_4.method3990();
														@Pc(5211) byte local5211 = Static210.aClass7_Sub14_Sub1_4.method3930();
														Static224.aClass239_7.method4999(local199, local5211);
														Static316.aClass253_117 = null;
														return true;
													} else if (Static316.aClass253_117 == Static455.aClass253_144) {
														Static239.method3255(Static138.aClass94_16);
														Static316.aClass253_117 = null;
														return true;
													} else if (Static88.aClass253_31 == Static316.aClass253_117) {
														Static57.anInt986 = Static210.aClass7_Sub14_Sub1_4.method3981();
														Static316.aClass253_117 = null;
														return true;
													} else {
														@Pc(5457) int local5457;
														if (Static16.aClass253_145 == Static316.aClass253_117) {
															local199 = Static210.aClass7_Sub14_Sub1_4.method3935();
															local70 = Static210.aClass7_Sub14_Sub1_4.method3968();
															local207 = Static210.aClass7_Sub14_Sub1_4.method3938();
															local577 = Static210.aClass7_Sub14_Sub1_4.method3935();
															local753 = Static210.aClass7_Sub14_Sub1_4.method3946();
															local847 = (local70 & 0x80) != 0;
															if (local207 >> 30 == 0) {
																@Pc(5323) Class105 local5323;
																@Pc(5379) Class139 local5379;
																@Pc(5328) Class105 local5328;
																@Pc(5342) Class139 local5342;
																@Pc(5348) Class139 local5348;
																if (local207 >> 29 != 0) {
																	local1215 = local207 & 0xFFFF;
																	@Pc(5288) Class26_Sub2_Sub4_Sub1 local5288 = Static171.aClass26_Sub2_Sub4_Sub1Array1[local1215];
																	if (local5288 != null) {
																		if (local753 == 65535) {
																			local753 = -1;
																		}
																		local3216 = true;
																		local1111 = local847 ? local5288.anInt7065 : local5288.anInt7066;
																		if (local753 != -1 && local1111 != -1) {
																			if (local753 == local1111) {
																				local5323 = Static79.aClass231_1.method4830(local753);
																				if (local5323.aBoolean176 && local5323.anInt2900 != -1) {
																					local5379 = Static364.aClass151_2.method3293(local5323.anInt2900);
																					local3963 = local5379.anInt3937;
																					if (local3963 == 0 || local3963 == 2) {
																						local3216 = false;
																					} else if (local3963 == 1) {
																						local3216 = true;
																					}
																				}
																			} else {
																				local5323 = Static79.aClass231_1.method4830(local753);
																				local5328 = Static79.aClass231_1.method4830(local1111);
																				if (local5323.anInt2900 != -1 && local5328.anInt2900 != -1) {
																					local5342 = Static364.aClass151_2.method3293(local5323.anInt2900);
																					local5348 = Static364.aClass151_2.method3293(local5328.anInt2900);
																					if (local5342.anInt3953 < local5348.anInt3953) {
																						local3216 = false;
																					}
																				}
																			}
																		}
																		if (local3216) {
																			if (local847) {
																				local5288.anInt7082 = local577;
																				local5288.anInt7068 = local70 & 0x7;
																				local5288.anInt7037 = 0;
																				local5288.anInt7052 = Static274.anInt4617 + local199;
																				local5288.anInt7073 = 1;
																				local5288.anInt7041 = 0;
																				local5288.anInt7065 = local753;
																				if (local5288.anInt7052 > Static274.anInt4617) {
																					local5288.anInt7037 = -1;
																				}
																				if (local5288.anInt7065 != -1 && local5288.anInt7052 == Static274.anInt4617) {
																					local5457 = Static79.aClass231_1.method4830(local5288.anInt7065).anInt2900;
																					if (local5457 != -1) {
																						local5379 = Static364.aClass151_2.method3293(local5457);
																						if (local5379 != null && local5379.anIntArray344 != null) {
																							Static454.method5772(local5379, false, local5288.anInt7383, local5288.aByte102, local5288.anInt7388, 0);
																						}
																					}
																				}
																			} else {
																				local5288.anInt7047 = local577;
																				local5288.anInt7099 = 0;
																				local5288.anInt7042 = 0;
																				local5288.anInt7095 = local199 + Static274.anInt4617;
																				local5288.anInt7056 = 1;
																				local5288.anInt7066 = local753;
																				local5288.anInt7094 = local70 & 0x7;
																				if (local5288.anInt7095 > Static274.anInt4617) {
																					local5288.anInt7099 = -1;
																				}
																				if (local5288.anInt7066 != -1 && Static274.anInt4617 == local5288.anInt7095) {
																					local5457 = Static79.aClass231_1.method4830(local5288.anInt7066).anInt2900;
																					if (local5457 != -1) {
																						local5379 = Static364.aClass151_2.method3293(local5457);
																						if (local5379 != null && local5379.anIntArray344 != null) {
																							Static454.method5772(local5379, false, local5288.anInt7383, local5288.aByte102, local5288.anInt7388, 0);
																						}
																					}
																				}
																			}
																		}
																	}
																} else if (local207 >> 28 != 0) {
																	local1215 = local207 & 0xFFFF;
																	@Pc(5580) Class26_Sub2_Sub4_Sub2 local5580;
																	if (Static296.anInt4920 == local1215) {
																		local5580 = Static104.aClass26_Sub2_Sub4_Sub2_2;
																	} else {
																		local5580 = Static410.aClass26_Sub2_Sub4_Sub2Array1[local1215];
																	}
																	if (local5580 != null) {
																		if (local753 == 65535) {
																			local753 = -1;
																		}
																		local3216 = true;
																		local1111 = local847 ? local5580.anInt7065 : local5580.anInt7066;
																		if (local753 != -1 && local1111 != -1) {
																			if (local1111 == local753) {
																				local5323 = Static79.aClass231_1.method4830(local753);
																				if (local5323.aBoolean176 && local5323.anInt2900 != -1) {
																					local5379 = Static364.aClass151_2.method3293(local5323.anInt2900);
																					local3963 = local5379.anInt3937;
																					if (local3963 == 0 || local3963 == 2) {
																						local3216 = false;
																					} else if (local3963 == 1) {
																						local3216 = true;
																					}
																				}
																			} else {
																				local5323 = Static79.aClass231_1.method4830(local753);
																				local5328 = Static79.aClass231_1.method4830(local1111);
																				if (local5323.anInt2900 != -1 && local5328.anInt2900 != -1) {
																					local5342 = Static364.aClass151_2.method3293(local5323.anInt2900);
																					local5348 = Static364.aClass151_2.method3293(local5328.anInt2900);
																					if (local5348.anInt3953 > local5342.anInt3953) {
																						local3216 = false;
																					}
																				}
																			}
																		}
																		if (local3216) {
																			if (local847) {
																				local5580.anInt7041 = 0;
																				local5580.anInt7065 = local753;
																				local5580.anInt7082 = local577;
																				local5580.anInt7052 = local199 + Static274.anInt4617;
																				local5580.anInt7073 = 1;
																				local5580.anInt7068 = local70 & 0x7;
																				local5580.anInt7037 = 0;
																				if (local5580.anInt7065 == 65535) {
																					local5580.anInt7065 = -1;
																				}
																				if (local5580.anInt7052 > Static274.anInt4617) {
																					local5580.anInt7037 = -1;
																				}
																				if (local5580.anInt7065 != -1 && local5580.anInt7052 == Static274.anInt4617) {
																					local5457 = Static79.aClass231_1.method4830(local5580.anInt7065).anInt2900;
																					if (local5457 != -1) {
																						local5379 = Static364.aClass151_2.method3293(local5457);
																						if (local5379 != null && local5379.anIntArray344 != null) {
																							Static454.method5772(local5379, local5580 == Static104.aClass26_Sub2_Sub4_Sub2_2, local5580.anInt7383, local5580.aByte102, local5580.anInt7388, 0);
																						}
																					}
																				}
																			} else {
																				local5580.anInt7047 = local577;
																				local5580.anInt7094 = local70 & 0x7;
																				local5580.anInt7042 = 0;
																				local5580.anInt7056 = 1;
																				local5580.anInt7099 = 0;
																				local5580.anInt7066 = local753;
																				local5580.anInt7095 = local199 + Static274.anInt4617;
																				if (local5580.anInt7066 == 65535) {
																					local5580.anInt7066 = -1;
																				}
																				if (local5580.anInt7095 > Static274.anInt4617) {
																					local5580.anInt7099 = -1;
																				}
																				if (local5580.anInt7066 != -1 && Static274.anInt4617 == local5580.anInt7095) {
																					local5457 = Static79.aClass231_1.method4830(local5580.anInt7066).anInt2900;
																					if (local5457 != -1) {
																						local5379 = Static364.aClass151_2.method3293(local5457);
																						if (local5379 != null && local5379.anIntArray344 != null) {
																							Static454.method5772(local5379, Static104.aClass26_Sub2_Sub4_Sub2_2 == local5580, local5580.anInt7383, local5580.aByte102, local5580.anInt7388, 0);
																						}
																					}
																				}
																			}
																		}
																	}
																}
															} else {
																local1215 = local207 >> 28 & 0x3;
																local2531 = (local207 >> 14 & 0x3FFF) - Static359.anInt5713;
																local1101 = (local207 & 0x3FFF) - Static314.anInt5181;
																if (local2531 >= 0 && local1101 >= 0 && local2531 < Static333.anInt3375 && local1101 < Static102.anInt2086) {
																	local1111 = local2531 * 128 + 64;
																	local5457 = local1101 * 128 + 64;
																	local2541 = local1215;
																	if (local1215 < 3 && Static148.method2268(local1101, local2531)) {
																		local2541 = local1215 + 1;
																	}
																	@Pc(5959) Class26_Sub2_Sub1 local5959 = new Class26_Sub2_Sub1(local753, 0, Static274.anInt4617, local1215, local2541, local1111, Static333.method2748(local1215, local5457, local1111) - local577, local5457, local2531, local2531, local1101, local1101, local70);
																	Static203.aClass85_20.method2011(new Class7_Sub4_Sub12(local5959));
																}
															}
															Static316.aClass253_117 = null;
															return true;
														} else if (Static316.aClass253_117 == Static381.aClass253_138) {
															local199 = Static210.aClass7_Sub14_Sub1_4.method3938();
															Static421.aClass236_7 = Static230.aClass61_4.method1469(local199);
															Static316.aClass253_117 = null;
															return true;
														} else if (Static263.aClass253_97 == Static316.aClass253_117) {
															Static239.method3255(Static445.aClass94_4);
															Static316.aClass253_117 = null;
															return true;
														} else if (Static147.aClass253_54 == Static316.aClass253_117) {
															local199 = Static210.aClass7_Sub14_Sub1_4.method3943();
															if (Static278.method3710(local199)) {
																Static362.method4645();
															}
															Static316.aClass253_117 = null;
															return true;
														} else if (Static111.aClass253_43 == Static316.aClass253_117) {
															local825 = Static210.aClass7_Sub14_Sub1_4.method3981() == 1;
															local829 = Static210.aClass7_Sub14_Sub1_4.method3986();
															local831 = local829;
															if (local825) {
																local831 = Static210.aClass7_Sub14_Sub1_4.method3986();
															}
															local2118 = Static210.aClass7_Sub14_Sub1_4.method3941();
															local2123 = Static210.aClass7_Sub14_Sub1_4.method3943();
															local2128 = Static210.aClass7_Sub14_Sub1_4.method3975();
															local1111 = Static210.aClass7_Sub14_Sub1_4.method3981();
															local5457 = Static210.aClass7_Sub14_Sub1_4.method3943();
															@Pc(6065) long local6065 = (local2123 << 32) + local2128;
															@Pc(6067) boolean local6067 = false;
															@Pc(6069) int local6069 = 0;
															while (true) {
																if (local6069 >= 100) {
																	if (local1111 <= 1 && Static21.method221(local831)) {
																		local6067 = true;
																	}
																	break;
																}
																if (Static235.aLongArray7[local6069] == local6065) {
																	local6067 = true;
																	break;
																}
																local6069++;
															}
															if (!local6067 && Static221.anInt3902 == 0) {
																Static235.aLongArray7[Static252.anInt4263] = local6065;
																Static252.anInt4263 = (Static252.anInt4263 + 1) % 100;
																@Pc(6123) String local6123 = Static209.aClass204_1.method4288(local5457).method4273(Static210.aClass7_Sub14_Sub1_4);
																if (local1111 == 2) {
																	Static169.method2464("<img=1>" + local831, 20, 0, local6123, local5457, Static458.method5799(local2118), "<img=1>" + local829);
																} else if (local1111 == 1) {
																	Static169.method2464("<img=0>" + local831, 20, 0, local6123, local5457, Static458.method5799(local2118), "<img=0>" + local829);
																} else {
																	Static169.method2464(local831, 20, 0, local6123, local5457, Static458.method5799(local2118), local829);
																}
															}
															Static316.aClass253_117 = null;
															return true;
														} else if (Static394.aClass253_142 == Static316.aClass253_117) {
															for (local199 = 0; local199 < Static410.aClass26_Sub2_Sub4_Sub2Array1.length; local199++) {
																if (Static410.aClass26_Sub2_Sub4_Sub2Array1[local199] != null) {
																	Static410.aClass26_Sub2_Sub4_Sub2Array1[local199].anInt7046 = -1;
																}
															}
															for (local70 = 0; local70 < Static171.aClass26_Sub2_Sub4_Sub1Array1.length; local70++) {
																if (Static171.aClass26_Sub2_Sub4_Sub1Array1[local70] != null) {
																	Static171.aClass26_Sub2_Sub4_Sub1Array1[local70].anInt7046 = -1;
																}
															}
															Static316.aClass253_117 = null;
															return true;
														} else if (Static161.aClass253_60 == Static316.aClass253_117) {
															local199 = Static210.aClass7_Sub14_Sub1_4.method3956();
															local70 = local199 >> 28 & 0x3;
															local207 = local199 >> 14 & 0x3FFF;
															local577 = local199 & 0x3FFF;
															local753 = Static210.aClass7_Sub14_Sub1_4.method3972();
															local757 = local753 >> 2;
															local1215 = local753 & 0x3;
															local2531 = Static150.anIntArray251[local757];
															local1101 = Static210.aClass7_Sub14_Sub1_4.method3946();
															@Pc(6294) int local6294 = local577 - Static314.anInt5181;
															if (local1101 == 65535) {
																local1101 = -1;
															}
															local207 -= Static359.anInt5713;
															Static237.method3231(local1101, local70, local207, local757, local2531, local1215, local6294);
															Static316.aClass253_117 = null;
															return true;
														} else {
															Static419.method5247(null, "T1 - " + (Static316.aClass253_117 == null ? -1 : Static316.aClass253_117.method5225()) + "," + (Static210.aClass253_153 == null ? -1 : Static210.aClass253_153.method5225()) + "," + (Static417.aClass253_149 == null ? -1 : Static417.aClass253_149.method5225()) + " - " + Static205.anInt3627);
															Static362.method4646(false);
															return true;
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
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(III)Lclient!rr;")
	public static Class223 method2394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static19.aClass223ArrayArrayArray1[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static19.aClass223ArrayArrayArray1[0][arg1][arg2] != null && Static19.aClass223ArrayArrayArray1[0][arg1][arg2].aClass223_1 != null;
			if (local28 && arg0 >= Static315.anInt5183 - 1) {
				return null;
			}
			Static34.method472(arg0, arg1, arg2);
		}
		return Static19.aClass223ArrayArrayArray1[arg0][arg1][arg2];
	}
}
