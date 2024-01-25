import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!kn", name = "o", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_60 = new Class46(27, 15);

	@OriginalMember(owner = "client!kn", name = "q", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_61 = new Class46(56, 7);

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)Z")
	public static boolean method4585() throws IOException {
		if (Static495.aClass170_2 == null) {
			return false;
		}
		@Pc(73) int local73;
		if (Static219.aClass337_68 == null) {
			if (Static251.aBoolean326) {
				if (!Static495.aClass170_2.method8122(1)) {
					return false;
				}
				Static495.aClass170_2.method8123(0, 1, Static257.aClass5_Sub22_Sub1_1.aByteArray71);
				Static307.anInt2869++;
				Static251.aBoolean326 = false;
				Static578.anInt4588 = 0;
			}
			Static257.aClass5_Sub22_Sub1_1.anInt6629 = 0;
			if (Static257.aClass5_Sub22_Sub1_1.method2647()) {
				if (!Static495.aClass170_2.method8122(1)) {
					return false;
				}
				Static495.aClass170_2.method8123(1, 1, Static257.aClass5_Sub22_Sub1_1.aByteArray71);
				Static578.anInt4588 = 0;
				Static307.anInt2869++;
			}
			Static251.aBoolean326 = true;
			@Pc(69) Class337[] local69 = Static100.method1626();
			local73 = Static257.aClass5_Sub22_Sub1_1.method2657();
			if (local73 < 0 || local73 >= local69.length) {
				throw new IOException("invo:" + local73 + " ip:" + Static257.aClass5_Sub22_Sub1_1.anInt6629);
			}
			Static219.aClass337_68 = local69[local73];
			Static50.anInt1005 = Static219.aClass337_68.anInt9241;
		}
		if (Static50.anInt1005 == -1) {
			if (!Static495.aClass170_2.method8122(1)) {
				return false;
			}
			Static495.aClass170_2.method8123(0, 1, Static257.aClass5_Sub22_Sub1_1.aByteArray71);
			Static50.anInt1005 = Static257.aClass5_Sub22_Sub1_1.aByteArray71[0] & 0xFF;
			Static307.anInt2869++;
			Static578.anInt4588 = 0;
		}
		if (Static50.anInt1005 == -2) {
			if (!Static495.aClass170_2.method8122(2)) {
				return false;
			}
			Static495.aClass170_2.method8123(0, 2, Static257.aClass5_Sub22_Sub1_1.aByteArray71);
			Static257.aClass5_Sub22_Sub1_1.anInt6629 = 0;
			Static50.anInt1005 = Static257.aClass5_Sub22_Sub1_1.method5968();
			Static307.anInt2869 += 2;
			Static578.anInt4588 = 0;
		}
		if (Static50.anInt1005 > 0) {
			if (!Static495.aClass170_2.method8122(Static50.anInt1005)) {
				return false;
			}
			Static257.aClass5_Sub22_Sub1_1.anInt6629 = 0;
			Static495.aClass170_2.method8123(0, Static50.anInt1005, Static257.aClass5_Sub22_Sub1_1.aByteArray71);
			Static307.anInt2869 += Static50.anInt1005;
			Static578.anInt4588 = 0;
		}
		Static630.aClass337_165 = Static310.aClass337_94;
		Static310.aClass337_94 = Static313.aClass337_96;
		Static313.aClass337_96 = Static219.aClass337_68;
		@Pc(219) int local219;
		@Pc(223) int local223;
		@Pc(227) int local227;
		@Pc(204) int local204;
		if (Static177.aClass337_56 == Static219.aClass337_68) {
			local204 = Static257.aClass5_Sub22_Sub1_1.method5968();
			if (local204 == 65535) {
				local204 = -1;
			}
			local73 = Static257.aClass5_Sub22_Sub1_1.method5966();
			local219 = Static257.aClass5_Sub22_Sub1_1.method5968();
			local223 = Static257.aClass5_Sub22_Sub1_1.method5966();
			local227 = Static257.aClass5_Sub22_Sub1_1.method5968();
			Static492.method7225(local219, local227, local223, local204, local73, false);
			Static219.aClass337_68 = null;
			return true;
		} else if (Static219.aClass337_68 == Static501.aClass337_143) {
			Static50.anInt1007 = Static257.aClass5_Sub22_Sub1_1.method5966();
			Static462.anInt7776 = Static126.anInt2290;
			Static219.aClass337_68 = null;
			return true;
		} else if (Static219.aClass337_68 == Static438.aClass337_168) {
			local204 = Static257.aClass5_Sub22_Sub1_1.method5951() << 2;
			local73 = Static257.aClass5_Sub22_Sub1_1.method5966();
			local219 = Static257.aClass5_Sub22_Sub1_1.method5924();
			local223 = Static257.aClass5_Sub22_Sub1_1.method5966();
			local227 = Static257.aClass5_Sub22_Sub1_1.method5903();
			Static490.method7215();
			Static6.method119(local227, local204, local219, local223, true, local73);
			Static219.aClass337_68 = null;
			return true;
		} else if (Static219.aClass337_68 == Static346.aClass337_80) {
			Static362.method5387(Static39.aClass376_2);
			Static219.aClass337_68 = null;
			return true;
		} else if (Static216.aClass337_67 == Static219.aClass337_68) {
			Static301.aClass59_1.method1310();
			Static219.aClass337_68 = null;
			Static508.anInt8815 += 32;
			return true;
		} else if (Static219.aClass337_68 == Static417.aClass337_125) {
			local204 = Static257.aClass5_Sub22_Sub1_1.method5968();
			if (local204 == 65535) {
				local204 = -1;
			}
			local73 = Static257.aClass5_Sub22_Sub1_1.method5924();
			local219 = Static257.aClass5_Sub22_Sub1_1.method5924();
			Static321.method4876(local204, local219, local73);
			Static219.aClass337_68 = null;
			return true;
		} else if (Static219.aClass337_68 == Static10.aClass337_11) {
			local204 = Static257.aClass5_Sub22_Sub1_1.method5951();
			if (local204 == 65535) {
				local204 = -1;
			}
			local73 = Static257.aClass5_Sub22_Sub1_1.method5966();
			local219 = Static257.aClass5_Sub22_Sub1_1.method5931();
			Static174.method2691(local73, local219, local204);
			Static219.aClass337_68 = null;
			return true;
		} else if (Static354.aClass337_48 == Static219.aClass337_68) {
			local204 = Static257.aClass5_Sub22_Sub1_1.method5968();
			local73 = Static257.aClass5_Sub22_Sub1_1.method5916();
			Static490.method7215();
			Static233.method3900(local204, local73);
			Static219.aClass337_68 = null;
			return true;
		} else {
			@Pc(425) String local425;
			@Pc(413) String local413;
			if (Static219.aClass337_68 == Static578.aClass337_77) {
				local413 = Static257.aClass5_Sub22_Sub1_1.method5937();
				local73 = Static257.aClass5_Sub22_Sub1_1.method5968();
				local425 = Static474.aClass66_2.method1367(local73).method5163(Static257.aClass5_Sub22_Sub1_1);
				Static361.method8007(local413, 19, local73, null, 0, local425, local413, local413);
				Static219.aClass337_68 = null;
				return true;
			}
			@Pc(525) int local525;
			@Pc(486) boolean local486;
			@Pc(494) boolean local494;
			@Pc(533) String local533;
			@Pc(581) int local581;
			if (Static457.aClass337_134 == Static219.aClass337_68) {
				local204 = Static257.aClass5_Sub22_Sub1_1.method5968();
				@Pc(457) Class4_Sub2_Sub1_Sub1_Sub1 local457;
				if (Static337.anInt5722 == local204) {
					local457 = Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2;
				} else {
					local457 = Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[local204];
				}
				if (local457 == null) {
					Static219.aClass337_68 = null;
					return true;
				}
				local219 = Static257.aClass5_Sub22_Sub1_1.method5968();
				local223 = Static257.aClass5_Sub22_Sub1_1.method5966();
				local486 = (local219 & 0x8000) != 0;
				if (local457.aString17 != null && local457.aClass248_1 != null) {
					local494 = false;
					if (local223 <= 1) {
						if (!local486 && (Static194.aBoolean235 && !Static92.aBoolean141 || Static34.aBoolean23)) {
							local494 = true;
						} else if (Static104.method1658(local457.aString17)) {
							local494 = true;
						}
					}
					if (!local494 && Static184.anInt3247 == 0) {
						local525 = -1;
						if (local486) {
							local219 &= 0x7FFF;
							@Pc(543) Class85 local543 = Static496.method7419(Static257.aClass5_Sub22_Sub1_1);
							local525 = local543.anInt2153;
							local533 = local543.aClass5_Sub5_Sub13_1.method5163(Static257.aClass5_Sub22_Sub1_1);
						} else {
							local533 = Static101.method1631(Static20.method246(Static257.aClass5_Sub22_Sub1_1));
						}
						local457.aString20 = local533.trim();
						local457.anInt1235 = local219 & 0xFF;
						local457.anInt1238 = local219 >> 8;
						local457.anInt1253 = 150;
						if (local223 == 1 || local223 == 2) {
							local581 = local486 ? 17 : 1;
						} else {
							local581 = local486 ? 17 : 2;
						}
						if (local223 == 2) {
							Static361.method8007("<img=1>" + local457.method743(), local581, local525, null, 0, local533, local457.aString16, "<img=1>" + local457.method746());
						} else if (local223 == 1) {
							Static361.method8007("<img=0>" + local457.method743(), local581, local525, null, 0, local533, local457.aString16, "<img=0>" + local457.method746());
						} else {
							Static361.method8007(local457.method743(), local581, local525, null, 0, local533, local457.aString16, local457.method746());
						}
					}
				}
				Static219.aClass337_68 = null;
				return true;
			} else if (Static219.aClass337_68 == Static635.aClass337_169) {
				Static40.method5454(Static50.anInt1005, Static257.aClass5_Sub22_Sub1_1);
				Static219.aClass337_68 = null;
				return true;
			} else {
				@Pc(705) boolean local705;
				if (Static634.aClass337_167 == Static219.aClass337_68) {
					local705 = Static257.aClass5_Sub22_Sub1_1.method5967() == 1;
					Static490.method7215();
					Static219.aClass337_68 = null;
					Static256.aBoolean333 = local705;
					return true;
				} else if (Static285.aClass337_92 == Static219.aClass337_68) {
					local204 = Static257.aClass5_Sub22_Sub1_1.method5968();
					local73 = Static257.aClass5_Sub22_Sub1_1.method5953();
					Static490.method7215();
					Static225.method3819(local73, local204);
					Static219.aClass337_68 = null;
					return true;
				} else {
					@Pc(760) boolean local760;
					if (Static321.aClass337_101 == Static219.aClass337_68) {
						local204 = Static257.aClass5_Sub22_Sub1_1.method5951();
						local73 = Static257.aClass5_Sub22_Sub1_1.method5903();
						local760 = (local73 & 0x1) == 1;
						Static555.method8086(local204, local760);
						Static568.anIntArray525[Static3.anInt10435++ & 0x1F] = local204;
						Static219.aClass337_68 = null;
						return true;
					} else if (Static313.aClass337_95 == Static219.aClass337_68) {
						Static362.method5387(Static160.aClass376_17);
						Static219.aClass337_68 = null;
						return true;
					} else if (Static432.aClass337_127 == Static219.aClass337_68) {
						Static461.aClass43_2 = Static497.method7439(Static257.aClass5_Sub22_Sub1_1.method5966());
						Static219.aClass337_68 = null;
						return true;
					} else if (Static79.aClass337_26 == Static219.aClass337_68) {
						local204 = Static257.aClass5_Sub22_Sub1_1.method5951();
						local73 = Static257.aClass5_Sub22_Sub1_1.method5957();
						local219 = Static257.aClass5_Sub22_Sub1_1.method5940();
						local223 = Static257.aClass5_Sub22_Sub1_1.method5917();
						Static490.method7215();
						Static638.method9005(local219 << 16 | local223, local73, 7, local204);
						Static219.aClass337_68 = null;
						return true;
					} else {
						@Pc(878) int local878;
						@Pc(908) int local908;
						@Pc(1318) boolean local1318;
						@Pc(942) int local942;
						@Pc(948) int local948;
						@Pc(950) int local950;
						@Pc(1358) int local1358;
						@Pc(1025) boolean local1025;
						@Pc(915) int local915;
						if (Static219.aClass337_68 == Static329.aClass337_51) {
							local204 = Static257.aClass5_Sub22_Sub1_1.method5940();
							local73 = Static257.aClass5_Sub22_Sub1_1.method5951();
							local219 = Static257.aClass5_Sub22_Sub1_1.method5953();
							local223 = Static257.aClass5_Sub22_Sub1_1.method5951();
							local227 = Static257.aClass5_Sub22_Sub1_1.method5903();
							local494 = (local227 & 0x80) != 0;
							local878 = local227 & 0x7;
							local525 = local227 >> 3 & 0xF;
							if (local525 == 15) {
								local525 = -1;
							}
							if (local219 >> 30 == 0) {
								@Pc(1112) Class362 local1112;
								@Pc(1065) Class362 local1065;
								@Pc(1051) Class82 local1051;
								if (local219 >> 29 != 0) {
									local581 = local219 & 0xFFFF;
									@Pc(1013) Class5_Sub3 local1013 = (Class5_Sub3) Static445.aClass273_29.method6581((long) local581);
									if (local1013 != null) {
										if (local223 == 65535) {
											local223 = -1;
										}
										@Pc(1023) Class4_Sub2_Sub1_Sub1_Sub2 local1023 = local1013.aClass4_Sub2_Sub1_Sub1_Sub2_1;
										local1025 = true;
										local948 = local494 ? local1023.anInt1276 : local1023.anInt1197;
										if (local223 != -1 && local948 != -1) {
											if (local948 == local223) {
												local1051 = Static52.aClass10_1.method211(local223);
												if (local1051.aBoolean157 && local1051.anInt2052 != -1) {
													local1065 = Static435.aClass298_1.method7034(local1051.anInt2052);
													@Pc(1068) int local1068 = local1065.anInt10002;
													if (local1068 == 0 || local1068 == 2) {
														local1025 = false;
													} else if (local1068 == 1) {
														local1025 = true;
													}
												}
											} else {
												local1051 = Static52.aClass10_1.method211(local223);
												@Pc(1097) Class82 local1097 = Static52.aClass10_1.method211(local948);
												if (local1051.anInt2052 != -1 && local1097.anInt2052 != -1) {
													local1112 = Static435.aClass298_1.method7034(local1051.anInt2052);
													@Pc(1118) Class362 local1118 = Static435.aClass298_1.method7034(local1097.anInt2052);
													if (local1118.anInt10005 > local1112.anInt10005) {
														local1025 = false;
													}
												}
											}
										}
										if (local1025) {
											if (local494) {
												local1023.anInt1222 = 1;
												local1023.anInt1276 = local223;
												local1023.anInt1247 = local525;
												local1023.anInt1224 = local73;
												local1023.anInt1259 = 0;
												local1023.anInt1240 = Static631.anInt10493 + local204;
												local1023.anInt1228 = 0;
												local1023.anInt1262 = local878;
												if (Static631.anInt10493 < local1023.anInt1240) {
													local1023.anInt1228 = -1;
												}
												if (local1023.anInt1276 != -1 && Static631.anInt10493 == local1023.anInt1240) {
													local950 = Static52.aClass10_1.method211(local1023.anInt1276).anInt2052;
													if (local950 != -1) {
														local1065 = Static435.aClass298_1.method7034(local950);
														if (local1065 != null && local1065.anIntArray571 != null && !local1023.aBoolean71) {
															Static67.method1108(local1023, 0, local1065);
														}
													}
												}
											} else {
												local1023.anInt1202 = 1;
												local1023.anInt1197 = local223;
												local1023.anInt1251 = 0;
												local1023.anInt1200 = local525;
												local1023.anInt1267 = local73;
												local1023.anInt1269 = 0;
												local1023.anInt1255 = local204 + Static631.anInt10493;
												local1023.anInt1233 = local878;
												if (local1023.anInt1255 > Static631.anInt10493) {
													local1023.anInt1251 = -1;
												}
												if (local1023.anInt1197 != -1 && local1023.anInt1255 == Static631.anInt10493) {
													local950 = Static52.aClass10_1.method211(local1023.anInt1197).anInt2052;
													if (local950 != -1) {
														local1065 = Static435.aClass298_1.method7034(local950);
														if (local1065 != null && local1065.anIntArray571 != null && !local1023.aBoolean71) {
															Static67.method1108(local1023, 0, local1065);
														}
													}
												}
											}
										}
									}
								} else if (local219 >> 28 != 0) {
									local581 = local219 & 0xFFFF;
									@Pc(1303) Class4_Sub2_Sub1_Sub1_Sub1 local1303;
									if (local581 == Static337.anInt5722) {
										local1303 = Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2;
									} else {
										local1303 = Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[local581];
									}
									if (local1303 != null) {
										if (local223 == 65535) {
											local223 = -1;
										}
										local1318 = true;
										local942 = local494 ? local1303.anInt1276 : local1303.anInt1197;
										@Pc(1355) Class362 local1355;
										if (local223 != -1 && local942 != -1) {
											@Pc(1342) Class82 local1342;
											if (local223 == local942) {
												local1342 = Static52.aClass10_1.method211(local223);
												if (local1342.aBoolean157 && local1342.anInt2052 != -1) {
													local1355 = Static435.aClass298_1.method7034(local1342.anInt2052);
													local1358 = local1355.anInt10002;
													if (local1358 == 0 || local1358 == 2) {
														local1318 = false;
													} else if (local1358 == 1) {
														local1318 = true;
													}
												}
											} else {
												local1342 = Static52.aClass10_1.method211(local223);
												local1051 = Static52.aClass10_1.method211(local942);
												if (local1342.anInt2052 != -1 && local1051.anInt2052 != -1) {
													local1065 = Static435.aClass298_1.method7034(local1342.anInt2052);
													local1112 = Static435.aClass298_1.method7034(local1051.anInt2052);
													if (local1065.anInt10005 < local1112.anInt10005) {
														local1318 = false;
													}
												}
											}
										}
										if (local1318) {
											if (local494) {
												local1303.anInt1247 = local525;
												local1303.anInt1240 = Static631.anInt10493 + local204;
												local1303.anInt1276 = local223;
												local1303.anInt1228 = 0;
												local1303.anInt1262 = local878;
												local1303.anInt1259 = 0;
												local1303.anInt1224 = local73;
												local1303.anInt1222 = 1;
												if (Static631.anInt10493 < local1303.anInt1240) {
													local1303.anInt1228 = -1;
												}
												if (local1303.anInt1276 == 65535) {
													local1303.anInt1276 = -1;
												}
												if (local1303.anInt1276 != -1 && local1303.anInt1240 == Static631.anInt10493) {
													local948 = Static52.aClass10_1.method211(local1303.anInt1276).anInt2052;
													if (local948 != -1) {
														local1355 = Static435.aClass298_1.method7034(local948);
														if (local1355 != null && local1355.anIntArray571 != null && !local1303.aBoolean71) {
															Static67.method1108(local1303, 0, local1355);
														}
													}
												}
											} else {
												local1303.anInt1200 = local525;
												local1303.anInt1202 = 1;
												local1303.anInt1255 = local204 + Static631.anInt10493;
												local1303.anInt1251 = 0;
												local1303.anInt1233 = local878;
												local1303.anInt1269 = 0;
												local1303.anInt1197 = local223;
												local1303.anInt1267 = local73;
												if (local1303.anInt1197 == 65535) {
													local1303.anInt1197 = -1;
												}
												if (Static631.anInt10493 < local1303.anInt1255) {
													local1303.anInt1251 = -1;
												}
												if (local1303.anInt1197 != -1 && Static631.anInt10493 == local1303.anInt1255) {
													local948 = Static52.aClass10_1.method211(local1303.anInt1197).anInt2052;
													if (local948 != -1) {
														local1355 = Static435.aClass298_1.method7034(local948);
														if (local1355 != null && local1355.anIntArray571 != null && !local1303.aBoolean71) {
															Static67.method1108(local1303, 0, local1355);
														}
													}
												}
											}
										}
									}
								}
							} else {
								local581 = local219 >> 28 & 0x3;
								local908 = (local219 >> 14 & 0x3FFF) - Static565.anInt9560;
								local915 = (local219 & 0x3FFF) - Static567.anInt9589;
								if (local908 >= 0 && local915 >= 0 && Static326.anInt5541 > local908 && Static448.anInt7637 > local915) {
									local942 = local908 * 512 + 256;
									local948 = local915 * 512 + 256;
									local950 = local581;
									if (local581 < 3 && Static23.method285(local908, local915)) {
										local950 = local581 + 1;
									}
									@Pc(984) Class4_Sub2_Sub1_Sub4 local984 = new Class4_Sub2_Sub1_Sub4(local223, local204, Static631.anInt10493, local581, local950, local942, Static644.method9021(local948, local942, local581) - local73, local948, local908, local908, local915, local915, local878);
									Static14.aClass330_4.method7917(new Class5_Sub5_Sub18(local984));
								}
							}
							Static219.aClass337_68 = null;
							return true;
						}
						@Pc(1628) String local1628;
						@Pc(1602) String local1602;
						@Pc(1604) String local1604;
						if (Static87.aClass337_27 == Static219.aClass337_68) {
							local204 = Static257.aClass5_Sub22_Sub1_1.method5947();
							local73 = Static257.aClass5_Sub22_Sub1_1.method5913();
							local219 = Static257.aClass5_Sub22_Sub1_1.method5966();
							local1602 = "";
							local1604 = local1602;
							if ((local219 & 0x1) != 0) {
								local1602 = Static257.aClass5_Sub22_Sub1_1.method5937();
								if ((local219 & 0x2) == 0) {
									local1604 = local1602;
								} else {
									local1604 = Static257.aClass5_Sub22_Sub1_1.method5937();
								}
							}
							local1628 = Static257.aClass5_Sub22_Sub1_1.method5937();
							if (local204 == 99) {
								Static83.method6024(local1628);
							} else if (local1604.equals("") || !Static104.method1658(local1604)) {
								Static412.method6340(local1602, local73, local1628, local1604, local1602, local204);
							} else {
								Static219.aClass337_68 = null;
								return true;
							}
							Static219.aClass337_68 = null;
							return true;
						} else if (Static219.aClass337_68 == Static446.aClass337_132) {
							Static162.method2338(Static257.aClass5_Sub22_Sub1_1.method5937());
							Static219.aClass337_68 = null;
							return true;
						} else if (Static354.aClass337_46 == Static219.aClass337_68) {
							local204 = Static257.aClass5_Sub22_Sub1_1.method5951();
							local73 = Static257.aClass5_Sub22_Sub1_1.method5968();
							local219 = Static257.aClass5_Sub22_Sub1_1.method5968();
							local223 = Static257.aClass5_Sub22_Sub1_1.method5957();
							Static490.method7215();
							Static2.method22(local73, local204, local219, local223);
							Static219.aClass337_68 = null;
							return true;
						} else if (Static134.aClass337_43 == Static219.aClass337_68) {
							Static606.anInt10177 = Static257.aClass5_Sub22_Sub1_1.method5966();
							Static219.aClass337_68 = null;
							return true;
						} else if (Static8.aClass337_113 == Static219.aClass337_68) {
							local204 = Static257.aClass5_Sub22_Sub1_1.method5903();
							local73 = Static257.aClass5_Sub22_Sub1_1.method5966();
							local425 = Static257.aClass5_Sub22_Sub1_1.method5937();
							local223 = Static257.aClass5_Sub22_Sub1_1.method5951();
							if (local223 == 65535) {
								local223 = -1;
							}
							if (local73 >= 1 && local73 <= 8) {
								if (local425.equalsIgnoreCase("null")) {
									local425 = null;
								}
								Static447.aStringArray60[local73 - 1] = local425;
								Static495.anIntArray477[local73 - 1] = local223;
								Static564.aBooleanArray27[local73 - 1] = local204 == 0;
							}
							Static219.aClass337_68 = null;
							return true;
						} else {
							@Pc(1801) String local1801;
							if (Static556.aClass337_149 == Static219.aClass337_68) {
								local204 = Static257.aClass5_Sub22_Sub1_1.method5917();
								local1801 = Static257.aClass5_Sub22_Sub1_1.method5937();
								Static490.method7215();
								Static192.method2916(local204, local1801);
								Static219.aClass337_68 = null;
								return true;
							} else if (Static219.aClass337_68 == Static193.aClass337_142) {
								local204 = Static257.aClass5_Sub22_Sub1_1.method5917();
								local73 = Static257.aClass5_Sub22_Sub1_1.method5917();
								Static490.method7215();
								Static11.method212(local73, local204);
								Static219.aClass337_68 = null;
								return true;
							} else if (Static294.aClass337_93 == Static219.aClass337_68) {
								local204 = Static257.aClass5_Sub22_Sub1_1.method5966();
								local73 = local204 >> 5;
								local219 = local204 & 0x1F;
								if (local219 == 0) {
									Static82.aClass154Array1[local73] = null;
									Static219.aClass337_68 = null;
									return true;
								}
								@Pc(1870) Class154 local1870 = new Class154();
								local1870.anInt4132 = local219;
								local1870.anInt4130 = Static257.aClass5_Sub22_Sub1_1.method5966();
								if (local1870.anInt4130 >= 0 && Static160.aClass28Array20.length > local1870.anInt4130) {
									if (local1870.anInt4132 == 1 || local1870.anInt4132 == 10) {
										local1870.anInt4129 = Static257.aClass5_Sub22_Sub1_1.method5968();
										Static257.aClass5_Sub22_Sub1_1.anInt6629 += 6;
									} else if (local1870.anInt4132 >= 2 && local1870.anInt4132 <= 6) {
										if (local1870.anInt4132 == 2) {
											local1870.anInt4139 = 256;
											local1870.anInt4135 = 256;
										}
										if (local1870.anInt4132 == 3) {
											local1870.anInt4135 = 256;
											local1870.anInt4139 = 0;
										}
										if (local1870.anInt4132 == 4) {
											local1870.anInt4135 = 256;
											local1870.anInt4139 = 512;
										}
										if (local1870.anInt4132 == 5) {
											local1870.anInt4139 = 256;
											local1870.anInt4135 = 0;
										}
										if (local1870.anInt4132 == 6) {
											local1870.anInt4139 = 256;
											local1870.anInt4135 = 512;
										}
										local1870.anInt4132 = 2;
										local1870.anInt4134 = Static257.aClass5_Sub22_Sub1_1.method5966();
										local1870.anInt4139 += Static257.aClass5_Sub22_Sub1_1.method5968() - Static565.anInt9560 << 9;
										local1870.anInt4135 += Static257.aClass5_Sub22_Sub1_1.method5968() - Static567.anInt9589 << 9;
										local1870.anInt4136 = Static257.aClass5_Sub22_Sub1_1.method5966() << 2;
										local1870.anInt4138 = Static257.aClass5_Sub22_Sub1_1.method5968();
									}
									local1870.anInt4137 = Static257.aClass5_Sub22_Sub1_1.method5968();
									if (local1870.anInt4137 == 65535) {
										local1870.anInt4137 = -1;
									}
									Static82.aClass154Array1[local73] = local1870;
								}
								Static219.aClass337_68 = null;
								return true;
							} else {
								@Pc(2071) long local2071;
								@Pc(2076) long local2076;
								@Pc(2081) long local2081;
								if (Static209.aClass337_65 == Static219.aClass337_68) {
									local705 = Static257.aClass5_Sub22_Sub1_1.method5966() == 1;
									local1801 = Static257.aClass5_Sub22_Sub1_1.method5937();
									local425 = local1801;
									if (local705) {
										local425 = Static257.aClass5_Sub22_Sub1_1.method5937();
									}
									local2071 = Static257.aClass5_Sub22_Sub1_1.method5907();
									local2076 = Static257.aClass5_Sub22_Sub1_1.method5968();
									local2081 = Static257.aClass5_Sub22_Sub1_1.method5931();
									local908 = Static257.aClass5_Sub22_Sub1_1.method5966();
									local915 = Static257.aClass5_Sub22_Sub1_1.method5968();
									@Pc(2097) long local2097 = local2081 + (local2076 << 32);
									@Pc(2099) boolean local2099 = false;
									local1358 = 0;
									while (true) {
										if (local1358 >= 100) {
											if (local908 <= 1 && Static104.method1658(local425)) {
												local2099 = true;
											}
											break;
										}
										if (Static188.aLongArray14[local1358] == local2097) {
											local2099 = true;
											break;
										}
										local1358++;
									}
									if (!local2099 && Static184.anInt3247 == 0) {
										Static188.aLongArray14[Static394.anInt6511] = local2097;
										Static394.anInt6511 = (Static394.anInt6511 + 1) % 100;
										@Pc(2151) String local2151 = Static474.aClass66_2.method1367(local915).method5163(Static257.aClass5_Sub22_Sub1_1);
										if (local908 == 2) {
											Static361.method8007("<img=1>" + local1801, 20, local915, Static641.method9013(local2071), 0, local2151, local1801, "<img=1>" + local425);
										} else if (local908 == 1) {
											Static361.method8007("<img=0>" + local1801, 20, local915, Static641.method9013(local2071), 0, local2151, local1801, "<img=0>" + local425);
										} else {
											Static361.method8007(local1801, 20, local915, Static641.method9013(local2071), 0, local2151, local1801, local425);
										}
									}
									Static219.aClass337_68 = null;
									return true;
								} else if (Static219.aClass337_68 == Static492.aClass337_141) {
									Static497.method7437();
									Static219.aClass337_68 = null;
									return true;
								} else if (Static66.aClass337_22 == Static219.aClass337_68) {
									Static98.anInt6103 = Static257.aClass5_Sub22_Sub1_1.method5924();
									Static215.anInt4082 = Static257.aClass5_Sub22_Sub1_1.method5924();
									Static219.aClass337_68 = null;
									return true;
								} else if (Static253.aClass337_120 == Static219.aClass337_68) {
									local204 = Static257.aClass5_Sub22_Sub1_1.method5917();
									Static490.method7215();
									Static216.method3686(local204);
									Static219.aClass337_68 = null;
									return true;
								} else if (Static219.aClass337_68 == Static209.aClass337_66) {
									Static587.anInt9873 = Static257.aClass5_Sub22_Sub1_1.method5963() << 3;
									Static520.anInt8959 = Static257.aClass5_Sub22_Sub1_1.method5924();
									Static385.anInt6359 = Static257.aClass5_Sub22_Sub1_1.method5909() << 3;
									Static219.aClass337_68 = null;
									return true;
								} else if (Static219.aClass337_68 == Static642.aClass337_157) {
									local204 = Static257.aClass5_Sub22_Sub1_1.method5916();
									local73 = Static257.aClass5_Sub22_Sub1_1.method5953();
									local219 = Static257.aClass5_Sub22_Sub1_1.method5951();
									if (local219 == 65535) {
										local219 = -1;
									}
									Static490.method7215();
									Static77.method1348(local219, local73, local204);
									@Pc(2336) Class255 local2336 = Static643.aClass275_2.method6641(local219);
									Static2.method22(local2336.anInt6514, local2336.anInt6521, local2336.anInt6543, local204);
									Static350.method8736(local2336.anInt6565, local2336.anInt6552, local204, local2336.anInt6535);
									Static219.aClass337_68 = null;
									return true;
								} else if (Static365.aClass337_84 == Static219.aClass337_68) {
									Static362.method5387(Static142.aClass376_5);
									Static219.aClass337_68 = null;
									return true;
								} else if (Static219.aClass337_68 == Static354.aClass337_47) {
									Static12.method223();
									Static219.aClass337_68 = null;
									return false;
								} else if (Static219.aClass337_68 == Static62.aClass337_20) {
									Static362.method5387(Static329.aClass376_8);
									Static219.aClass337_68 = null;
									return true;
								} else if (Static181.aClass337_58 == Static219.aClass337_68) {
									local204 = Static257.aClass5_Sub22_Sub1_1.method5967();
									local73 = Static257.aClass5_Sub22_Sub1_1.method5917() << 2;
									local219 = Static257.aClass5_Sub22_Sub1_1.method5966();
									local223 = Static257.aClass5_Sub22_Sub1_1.method5903();
									local227 = Static257.aClass5_Sub22_Sub1_1.method5924();
									Static490.method7215();
									Static640.method6760(local219, local223, local73, local227, local204);
									Static219.aClass337_68 = null;
									return true;
								} else {
									@Pc(2473) int local2473;
									if (Static348.aClass337_111 == Static219.aClass337_68) {
										local204 = Static257.aClass5_Sub22_Sub1_1.method5968();
										local73 = Static257.aClass5_Sub22_Sub1_1.method5966();
										local760 = (local73 & 0x1) == 1;
										Static396.method5883(local204, local760);
										local223 = Static257.aClass5_Sub22_Sub1_1.method5968();
										for (local227 = 0; local227 < local223; local227++) {
											local2473 = Static257.aClass5_Sub22_Sub1_1.method5924();
											if (local2473 == 255) {
												local2473 = Static257.aClass5_Sub22_Sub1_1.method5957();
											}
											local878 = Static257.aClass5_Sub22_Sub1_1.method5917();
											Static108.method1683(local760, local227, local878 - 1, local204, local2473);
										}
										Static568.anIntArray525[Static3.anInt10435++ & 0x1F] = local204;
										Static219.aClass337_68 = null;
										return true;
									} else if (Static314.aClass337_98 == Static219.aClass337_68) {
										@Pc(2526) byte local2526 = Static257.aClass5_Sub22_Sub1_1.method5962();
										local73 = Static257.aClass5_Sub22_Sub1_1.method5968();
										Static490.method7215();
										Static598.method8588(local2526, local73);
										Static219.aClass337_68 = null;
										return true;
									} else if (Static219.aClass337_68 == Static337.aClass337_105) {
										Static587.anInt9874 = Static257.aClass5_Sub22_Sub1_1.method5956();
										Static219.aClass337_68 = null;
										Static462.anInt7776 = Static126.anInt2290;
										return true;
									} else if (Static13.aClass337_12 == Static219.aClass337_68) {
										Static362.method5387(Static80.aClass376_3);
										Static219.aClass337_68 = null;
										return true;
									} else if (Static219.aClass337_68 == Static71.aClass337_25) {
										Static583.method8429(Static418.aBoolean515);
										Static219.aClass337_68 = null;
										return false;
									} else if (Static534.aClass337_148 == Static219.aClass337_68) {
										Static257.aClass5_Sub22_Sub1_1.anInt6629 += 28;
										if (Static257.aClass5_Sub22_Sub1_1.method5921()) {
											Static157.method2276(Static257.aClass5_Sub22_Sub1_1.anInt6629 - 28, Static257.aClass5_Sub22_Sub1_1);
										}
										Static219.aClass337_68 = null;
										return true;
									} else if (Static586.aClass337_152 == Static219.aClass337_68) {
										local204 = Static257.aClass5_Sub22_Sub1_1.method5908();
										local73 = Static257.aClass5_Sub22_Sub1_1.method5956();
										local219 = Static257.aClass5_Sub22_Sub1_1.method5916();
										Static490.method7215();
										Static221.method3772(local219, local73, local204);
										Static219.aClass337_68 = null;
										return true;
									} else if (Static219.aClass337_68 == Static371.aClass337_115) {
										Static362.method5387(Static96.aClass376_4);
										Static219.aClass337_68 = null;
										return true;
									} else if (Static219.aClass337_68 == Static65.aClass337_21) {
										local204 = Static257.aClass5_Sub22_Sub1_1.method5917();
										local73 = Static257.aClass5_Sub22_Sub1_1.method5913();
										Static490.method7215();
										Static373.method5488(local73, local204);
										Static219.aClass337_68 = null;
										return true;
									} else if (Static219.aClass337_68 == Static612.aClass337_159) {
										local204 = Static257.aClass5_Sub22_Sub1_1.method5951();
										local73 = Static257.aClass5_Sub22_Sub1_1.method5953();
										Static301.aClass59_1.method1311(local73, local204);
										Static219.aClass337_68 = null;
										return true;
									} else if (Static530.aClass337_151 == Static219.aClass337_68) {
										local204 = Static257.aClass5_Sub22_Sub1_1.method5953();
										Static490.method7215();
										Static638.method9005(-1, local204, 3, -1);
										Static219.aClass337_68 = null;
										return true;
									} else if (Static485.aClass337_140 == Static219.aClass337_68) {
										local204 = Static257.aClass5_Sub22_Sub1_1.method5913();
										Static426.aClass91_8 = Static470.aClass100_14.method2086(local204);
										Static219.aClass337_68 = null;
										return true;
									} else if (Static219.aClass337_68 == Static341.aClass337_107) {
										local204 = Static257.aClass5_Sub22_Sub1_1.method5968();
										if (local204 == 65535) {
											local204 = -1;
										}
										local73 = Static257.aClass5_Sub22_Sub1_1.method5966();
										local219 = Static257.aClass5_Sub22_Sub1_1.method5968();
										local223 = Static257.aClass5_Sub22_Sub1_1.method5966();
										local227 = Static257.aClass5_Sub22_Sub1_1.method5968();
										Static443.method6696(local223, local219, local204, local227, local73);
										Static219.aClass337_68 = null;
										return true;
									} else if (Static51.aClass337_18 == Static219.aClass337_68) {
										Static362.method5387(Static277.aClass376_11);
										Static219.aClass337_68 = null;
										return true;
									} else {
										@Pc(2835) Class5_Sub40 local2835;
										@Pc(2826) Class5_Sub40 local2826;
										if (Static280.aClass337_91 == Static219.aClass337_68) {
											local204 = Static257.aClass5_Sub22_Sub1_1.method5917();
											if (local204 == 65535) {
												local204 = -1;
											}
											local73 = Static257.aClass5_Sub22_Sub1_1.method5951();
											if (local73 == 65535) {
												local73 = -1;
											}
											local219 = Static257.aClass5_Sub22_Sub1_1.method5916();
											local223 = Static257.aClass5_Sub22_Sub1_1.method5968();
											Static490.method7215();
											for (local227 = local73; local227 <= local204; local227++) {
												local2076 = ((long) local219 << 32) + (long) local227;
												local2826 = (Class5_Sub40) Static421.aClass273_26.method6581(local2076);
												if (local2826 != null) {
													local2835 = new Class5_Sub40(local2826.anInt7590, local223);
													local2826.method9047();
												} else if (local227 == -1) {
													local2835 = new Class5_Sub40(Static107.method9049(local219).aClass5_Sub40_2.anInt7590, local223);
												} else {
													local2835 = new Class5_Sub40(0, local223);
												}
												Static421.aClass273_26.method6585(local2076, local2835);
											}
											Static219.aClass337_68 = null;
											return true;
										} else if (Static219.aClass337_68 == Static237.aClass337_72) {
											Static583.method8429(false);
											Static219.aClass337_68 = null;
											return false;
										} else if (Static219.aClass337_68 == Static605.aClass337_158) {
											local413 = Static257.aClass5_Sub22_Sub1_1.method5937();
											@Pc(2899) Object[] local2899 = new Object[local413.length() + 1];
											for (local219 = local413.length() - 1; local219 >= 0; local219--) {
												if (local413.charAt(local219) == 's') {
													local2899[local219 + 1] = Static257.aClass5_Sub22_Sub1_1.method5937();
												} else {
													local2899[local219 + 1] = Integer.valueOf(Static257.aClass5_Sub22_Sub1_1.method5913());
												}
											}
											local2899[0] = Integer.valueOf(Static257.aClass5_Sub22_Sub1_1.method5913());
											Static490.method7215();
											@Pc(2953) Class5_Sub51 local2953 = new Class5_Sub51();
											local2953.anObjectArray33 = local2899;
											Static370.method5457(local2953);
											Static219.aClass337_68 = null;
											return true;
										} else if (Static346.aClass337_79 == Static219.aClass337_68) {
											Static502.aString99 = Static50.anInt1005 > 2 ? Static257.aClass5_Sub22_Sub1_1.method5937() : Static174.aClass120_26.method2690(Static266.anInt4796);
											Static405.anInt6784 = Static50.anInt1005 <= 0 ? -1 : Static257.aClass5_Sub22_Sub1_1.method5968();
											if (Static405.anInt6784 == 65535) {
												Static405.anInt6784 = -1;
											}
											Static219.aClass337_68 = null;
											return true;
										} else if (Static219.aClass337_68 == Static126.aClass337_42) {
											local204 = Static257.aClass5_Sub22_Sub1_1.method5968();
											if (local204 == 65535) {
												local204 = -1;
											}
											local73 = Static257.aClass5_Sub22_Sub1_1.method5916();
											local219 = Static257.aClass5_Sub22_Sub1_1.method5940();
											if (local219 == 65535) {
												local219 = -1;
											}
											local223 = Static257.aClass5_Sub22_Sub1_1.method5916();
											Static490.method7215();
											for (local227 = local219; local227 <= local204; local227++) {
												local2076 = ((long) local73 << 32) + ((long) local227);
												local2826 = (Class5_Sub40) Static421.aClass273_26.method6581(local2076);
												if (local2826 != null) {
													local2835 = new Class5_Sub40(local223, local2826.anInt7585);
													local2826.method9047();
												} else if (local227 == -1) {
													local2835 = new Class5_Sub40(local223, Static107.method9049(local73).aClass5_Sub40_2.anInt7585);
												} else {
													local2835 = new Class5_Sub40(local223, -1);
												}
												Static421.aClass273_26.method6585(local2076, local2835);
											}
											Static219.aClass337_68 = null;
											return true;
										} else if (Static219.aClass337_68 == Static359.aClass337_112) {
											local705 = Static257.aClass5_Sub22_Sub1_1.method5966() == 1;
											local1801 = Static257.aClass5_Sub22_Sub1_1.method5937();
											local425 = local1801;
											if (local705) {
												local425 = Static257.aClass5_Sub22_Sub1_1.method5937();
											}
											local2071 = Static257.aClass5_Sub22_Sub1_1.method5907();
											local2076 = Static257.aClass5_Sub22_Sub1_1.method5968();
											local2081 = Static257.aClass5_Sub22_Sub1_1.method5931();
											local908 = Static257.aClass5_Sub22_Sub1_1.method5966();
											@Pc(3152) long local3152 = (local2076 << 32) + local2081;
											@Pc(3154) boolean local3154 = false;
											local950 = 0;
											while (true) {
												if (local950 >= 100) {
													if (local908 <= 1) {
														if (Static194.aBoolean235 && !Static92.aBoolean141 || Static34.aBoolean23) {
															local3154 = true;
														} else if (Static104.method1658(local425)) {
															local3154 = true;
														}
													}
													break;
												}
												if (Static188.aLongArray14[local950] == local3152) {
													local3154 = true;
													break;
												}
												local950++;
											}
											if (!local3154 && Static184.anInt3247 == 0) {
												Static188.aLongArray14[Static394.anInt6511] = local3152;
												Static394.anInt6511 = (Static394.anInt6511 + 1) % 100;
												@Pc(3222) String local3222 = Static101.method1631(Static20.method246(Static257.aClass5_Sub22_Sub1_1));
												if (local908 == 2 || local908 == 3) {
													Static361.method8007("<img=1>" + local1801, 9, -1, Static641.method9013(local2071), 0, local3222, local1801, "<img=1>" + local425);
												} else if (local908 == 1) {
													Static361.method8007("<img=0>" + local1801, 9, -1, Static641.method9013(local2071), 0, local3222, local1801, "<img=0>" + local425);
												} else {
													Static361.method8007(local1801, 9, -1, Static641.method9013(local2071), 0, local3222, local1801, local425);
												}
											}
											Static219.aClass337_68 = null;
											return true;
										} else if (Static219.aClass337_68 == Static204.aClass337_63) {
											Static362.method5387(Static177.aClass376_9);
											Static219.aClass337_68 = null;
											return true;
										} else if (Static219.aClass337_68 == Static251.aClass337_78) {
											Static490.method7215();
											Static236.method3917();
											Static219.aClass337_68 = null;
											return true;
										} else if (Static246.aClass337_74 == Static219.aClass337_68) {
											Static451.anInt7695 = Static257.aClass5_Sub22_Sub1_1.method5926();
											Static194.aBoolean235 = Static257.aClass5_Sub22_Sub1_1.method5966() == 1;
											Static219.aClass337_68 = null;
											return true;
										} else if (Static219.aClass337_68 == Static315.aClass337_123) {
											local204 = Static257.aClass5_Sub22_Sub1_1.method5967();
											Static490.method7215();
											Static219.aClass337_68 = null;
											Static111.anInt2092 = local204;
											return true;
										} else if (Static381.aClass337_116 == Static219.aClass337_68) {
											Static362.method5387(Static270.aClass376_10);
											Static219.aClass337_68 = null;
											return true;
										} else {
											@Pc(3402) Class5_Sub27 local3402;
											if (Static258.aClass337_81 == Static219.aClass337_68) {
												local204 = Static257.aClass5_Sub22_Sub1_1.method5966();
												local73 = Static257.aClass5_Sub22_Sub1_1.method5951();
												local219 = Static257.aClass5_Sub22_Sub1_1.method5913();
												Static490.method7215();
												local3402 = (Class5_Sub27) Static269.aClass273_11.method6581((long) local219);
												if (local3402 != null) {
													Static609.method8688(local3402.anInt4270 != local73, local3402, false);
												}
												Static409.method2684(local73, local204, false, local219);
												Static219.aClass337_68 = null;
												return true;
											} else if (Static219.aClass337_68 == Static93.aClass337_33) {
												local204 = Static257.aClass5_Sub22_Sub1_1.method5967();
												local73 = local204 >> 2;
												local219 = local204 & 0x3;
												local223 = Static114.anIntArray130[local73];
												local227 = Static257.aClass5_Sub22_Sub1_1.method5916();
												local2473 = local227 >> 28 & 0x3;
												local878 = local227 >> 14 & 0x3FFF;
												local525 = local227 & 0x3FFF;
												local581 = Static257.aClass5_Sub22_Sub1_1.method5940();
												if (local581 == 65535) {
													local581 = -1;
												}
												local878 -= Static565.anInt9560;
												local525 -= Static567.anInt9589;
												Static568.method8243(local878, local2473, local525, local73, local223, local581, local219);
												Static219.aClass337_68 = null;
												return true;
											} else if (Static219.aClass337_68 == Static319.aClass337_100) {
												Static219.aClass337_68 = null;
												Static545.anInt9233 = 1;
												Static197.anInt10377 = Static126.anInt2290;
												return true;
											} else if (Static219.aClass337_68 == Static343.aClass337_108) {
												local204 = Static257.aClass5_Sub22_Sub1_1.method5951();
												local1801 = Static257.aClass5_Sub22_Sub1_1.method5937();
												Static490.method7215();
												Static192.method2916(local204, local1801);
												Static219.aClass337_68 = null;
												return true;
											} else if (Static208.aClass337_64 == Static219.aClass337_68) {
												local204 = Static257.aClass5_Sub22_Sub1_1.method5913();
												local73 = Static257.aClass5_Sub22_Sub1_1.method5908();
												Static490.method7215();
												Static118.method1790(local204, local73);
												Static219.aClass337_68 = null;
												return true;
											} else if (Static219.aClass337_68 == Static392.aClass337_121) {
												local204 = Static257.aClass5_Sub22_Sub1_1.method5916();
												local1801 = Static257.aClass5_Sub22_Sub1_1.method5937();
												Static490.method7215();
												Static409.method2683(local204, local1801);
												Static219.aClass337_68 = null;
												return true;
											} else if (Static200.aClass337_62 == Static219.aClass337_68) {
												local204 = Static257.aClass5_Sub22_Sub1_1.method5966();
												@Pc(3596) boolean local3596 = (local204 & 0x1) == 1;
												local425 = Static257.aClass5_Sub22_Sub1_1.method5937();
												local1602 = Static257.aClass5_Sub22_Sub1_1.method5937();
												if (local1602.equals("")) {
													local1602 = local425;
												}
												local1604 = Static257.aClass5_Sub22_Sub1_1.method5937();
												local1628 = Static257.aClass5_Sub22_Sub1_1.method5937();
												if (local1628.equals("")) {
													local1628 = local1604;
												}
												if (local3596) {
													for (local878 = 0; local878 < Static225.anInt4205; local878++) {
														if (Static518.aStringArray70[local878].equals(local1628)) {
															Static447.aStringArray59[local878] = local425;
															Static518.aStringArray70[local878] = local1602;
															Static526.aStringArray72[local878] = local1604;
															Static530.aStringArray75[local878] = local1628;
															break;
														}
													}
												} else {
													Static447.aStringArray59[Static225.anInt4205] = local425;
													Static518.aStringArray70[Static225.anInt4205] = local1602;
													Static526.aStringArray72[Static225.anInt4205] = local1604;
													Static530.aStringArray75[Static225.anInt4205] = local1628;
													Static189.aBooleanArray29[Static225.anInt4205] = (local204 & 0x2) == 2;
													Static225.anInt4205++;
												}
												Static197.anInt10377 = Static126.anInt2290;
												Static219.aClass337_68 = null;
												return true;
											} else if (Static219.aClass337_68 == Static235.aClass337_71) {
												local413 = Static257.aClass5_Sub22_Sub1_1.method5937();
												local1801 = Static101.method1631(Static20.method246(Static257.aClass5_Sub22_Sub1_1));
												Static412.method6340(local413, 0, local1801, local413, local413, 6);
												Static219.aClass337_68 = null;
												return true;
											} else {
												@Pc(3743) byte local3743;
												if (Static219.aClass337_68 == Static617.aClass337_161) {
													local204 = Static257.aClass5_Sub22_Sub1_1.method5924();
													local3743 = Static257.aClass5_Sub22_Sub1_1.method5909();
													Static490.method7215();
													Static141.method2046(local204, local3743);
													Static219.aClass337_68 = null;
													return true;
												} else if (Static219.aClass337_68 == Static24.aClass337_13) {
													local204 = Static257.aClass5_Sub22_Sub1_1.method5957();
													Static490.method7215();
													Static638.method9005(Static337.anInt5722, local204, 5, 0);
													Static219.aClass337_68 = null;
													return true;
												} else if (Static607.aClass337_150 == Static219.aClass337_68) {
													local204 = Static257.aClass5_Sub22_Sub1_1.method5903();
													local73 = Static257.aClass5_Sub22_Sub1_1.method5916();
													local219 = Static257.aClass5_Sub22_Sub1_1.method5966();
													Static245.anIntArray516[local204] = local73;
													Static364.anIntArray334[local204] = local219;
													Static183.anIntArray180[local204] = 1;
													local223 = Static190.anIntArray183[local204] - 1;
													for (local227 = 0; local227 < local223; local227++) {
														if (local73 >= Class202.anIntArray277[local227]) {
															Static183.anIntArray180[local204] = local227 + 2;
														}
													}
													Static605.anIntArray579[Static550.anInt9297++ & 0x1F] = local204;
													Static219.aClass337_68 = null;
													return true;
												} else if (Static338.aClass337_106 == Static219.aClass337_68) {
													local204 = Static257.aClass5_Sub22_Sub1_1.method5968();
													if (local204 == 65535) {
														local204 = -1;
													}
													local73 = Static257.aClass5_Sub22_Sub1_1.method5966();
													local219 = Static257.aClass5_Sub22_Sub1_1.method5968();
													local223 = Static257.aClass5_Sub22_Sub1_1.method5966();
													Static492.method7225(local219, 256, local223, local204, local73, true);
													Static219.aClass337_68 = null;
													return true;
												} else if (Static167.aClass337_54 == Static219.aClass337_68) {
													if (Static337.anInt5727 != -1) {
														Static441.method6684(0, Static337.anInt5727);
													}
													Static219.aClass337_68 = null;
													return true;
												} else if (Static598.aClass337_155 == Static219.aClass337_68) {
													local204 = Static257.aClass5_Sub22_Sub1_1.method5957();
													local73 = Static257.aClass5_Sub22_Sub1_1.method5940();
													Static301.aClass59_1.method1309(local204, local73);
													Static219.aClass337_68 = null;
													return true;
												} else if (Static219.aClass337_68 == Static170.aClass337_55) {
													local204 = Static257.aClass5_Sub22_Sub1_1.method5953();
													local73 = Static257.aClass5_Sub22_Sub1_1.method5940();
													Static490.method7215();
													if (local73 == 65535) {
														local73 = -1;
													}
													Static638.method9005(local73, local204, 1, -1);
													Static219.aClass337_68 = null;
													return true;
												} else if (Static108.aClass337_37 == Static219.aClass337_68) {
													local705 = Static257.aClass5_Sub22_Sub1_1.method5966() == 1;
													@Pc(3968) byte[] local3968 = new byte[Static50.anInt1005 - 1];
													Static257.aClass5_Sub22_Sub1_1.method5915(0, Static50.anInt1005 - 1, local3968);
													Static10.method204(local705, local3968);
													Static219.aClass337_68 = null;
													return true;
												} else if (Static99.aClass337_35 == Static219.aClass337_68) {
													Static587.anInt9873 = Static257.aClass5_Sub22_Sub1_1.method5962() << 3;
													Static520.anInt8959 = Static257.aClass5_Sub22_Sub1_1.method5903();
													Static385.anInt6359 = Static257.aClass5_Sub22_Sub1_1.method5963() << 3;
													while (Static50.anInt1005 > Static257.aClass5_Sub22_Sub1_1.anInt6629) {
														@Pc(4014) Class376 local4014 = Static350.method8737()[Static257.aClass5_Sub22_Sub1_1.method5966()];
														Static362.method5387(local4014);
													}
													Static219.aClass337_68 = null;
													return true;
												} else if (Static104.aClass337_36 == Static219.aClass337_68) {
													Static327.method4976(Static470.aClass100_14, Static257.aClass5_Sub22_Sub1_1, Static50.anInt1005);
													Static219.aClass337_68 = null;
													return true;
												} else if (Static638.aClass337_171 == Static219.aClass337_68) {
													local204 = Static257.aClass5_Sub22_Sub1_1.method5968();
													local73 = Static257.aClass5_Sub22_Sub1_1.method5966();
													local760 = (local73 & 0x1) == 1;
													while (Static257.aClass5_Sub22_Sub1_1.anInt6629 < Static50.anInt1005) {
														local223 = Static257.aClass5_Sub22_Sub1_1.method5947();
														local227 = Static257.aClass5_Sub22_Sub1_1.method5968();
														local2473 = 0;
														if (local227 != 0) {
															local2473 = Static257.aClass5_Sub22_Sub1_1.method5966();
															if (local2473 == 255) {
																local2473 = Static257.aClass5_Sub22_Sub1_1.method5913();
															}
														}
														Static108.method1683(local760, local223, local227 - 1, local204, local2473);
													}
													Static568.anIntArray525[Static3.anInt10435++ & 0x1F] = local204;
													Static219.aClass337_68 = null;
													return true;
												} else if (Static98.aClass337_114 == Static219.aClass337_68) {
													Static15.method228();
													Static219.aClass337_68 = null;
													return false;
												} else {
													@Pc(4172) boolean local4172;
													if (Static219.aClass337_68 == Static224.aClass337_69) {
														@Pc(4234) boolean local4234;
														while (Static50.anInt1005 > Static257.aClass5_Sub22_Sub1_1.anInt6629) {
															local705 = Static257.aClass5_Sub22_Sub1_1.method5966() == 1;
															local1801 = Static257.aClass5_Sub22_Sub1_1.method5937();
															local425 = Static257.aClass5_Sub22_Sub1_1.method5937();
															local223 = Static257.aClass5_Sub22_Sub1_1.method5968();
															local227 = Static257.aClass5_Sub22_Sub1_1.method5966();
															local1628 = "";
															local4172 = false;
															if (local223 > 0) {
																local1628 = Static257.aClass5_Sub22_Sub1_1.method5937();
																local4172 = Static257.aClass5_Sub22_Sub1_1.method5966() == 1;
															}
															for (local525 = 0; local525 < Static48.anInt995; local525++) {
																if (local705) {
																	if (local425.equals(Static400.aStringArray55[local525])) {
																		Static400.aStringArray55[local525] = local1801;
																		Static257.aStringArray32[local525] = local425;
																		local1801 = null;
																		break;
																	}
																} else if (local1801.equals(Static400.aStringArray55[local525])) {
																	if (local223 != Static408.anIntArray379[local525]) {
																		local4234 = true;
																		for (@Pc(4239) Class4_Sub1_Sub2 local4239 = (Class4_Sub1_Sub2) Static403.aClass99_8.method2045(); local4239 != null; local4239 = (Class4_Sub1_Sub2) Static403.aClass99_8.method2047()) {
																			if (local4239.aString57.equals(local1801)) {
																				if (local223 != 0 && local4239.aShort86 == 0) {
																					local4239.method8713();
																					local4234 = false;
																				} else if (local223 == 0 && local4239.aShort86 != 0) {
																					local4239.method8713();
																					local4234 = false;
																				}
																			}
																		}
																		if (local4234) {
																			Static403.aClass99_8.method2039(new Class4_Sub1_Sub2(local1801, local223));
																		}
																		Static408.anIntArray379[local525] = local223;
																	}
																	Static257.aStringArray32[local525] = local425;
																	Static362.aStringArray46[local525] = local1628;
																	Static456.anIntArray417[local525] = local227;
																	Static235.aBooleanArray13[local525] = local4172;
																	local1801 = null;
																	break;
																}
															}
															if (local1801 != null && Static48.anInt995 < 200) {
																Static400.aStringArray55[Static48.anInt995] = local1801;
																Static257.aStringArray32[Static48.anInt995] = local425;
																Static408.anIntArray379[Static48.anInt995] = local223;
																Static362.aStringArray46[Static48.anInt995] = local1628;
																Static456.anIntArray417[Static48.anInt995] = local227;
																Static235.aBooleanArray13[Static48.anInt995] = local4172;
																Static48.anInt995++;
															}
														}
														Static545.anInt9233 = 2;
														Static197.anInt10377 = Static126.anInt2290;
														local73 = Static48.anInt995;
														while (local73 > 0) {
															local705 = true;
															local73--;
															for (local219 = 0; local219 < local73; local219++) {
																if (Static408.anIntArray379[local219] != Static490.aClass306_5.anInt8300 && Static490.aClass306_5.anInt8300 == Static408.anIntArray379[local219 + 1] || Static408.anIntArray379[local219] == 0 && Static408.anIntArray379[local219 + 1] != 0) {
																	local223 = Static408.anIntArray379[local219];
																	Static408.anIntArray379[local219] = Static408.anIntArray379[local219 + 1];
																	Static408.anIntArray379[local219 + 1] = local223;
																	local1604 = Static362.aStringArray46[local219];
																	Static362.aStringArray46[local219] = Static362.aStringArray46[local219 + 1];
																	Static362.aStringArray46[local219 + 1] = local1604;
																	local1628 = Static400.aStringArray55[local219];
																	Static400.aStringArray55[local219] = Static400.aStringArray55[local219 + 1];
																	Static400.aStringArray55[local219 + 1] = local1628;
																	local533 = Static257.aStringArray32[local219];
																	Static257.aStringArray32[local219] = Static257.aStringArray32[local219 + 1];
																	Static257.aStringArray32[local219 + 1] = local533;
																	local525 = Static456.anIntArray417[local219];
																	Static456.anIntArray417[local219] = Static456.anIntArray417[local219 + 1];
																	Static456.anIntArray417[local219 + 1] = local525;
																	local4234 = Static235.aBooleanArray13[local219];
																	Static235.aBooleanArray13[local219] = Static235.aBooleanArray13[local219 + 1];
																	Static235.aBooleanArray13[local219 + 1] = local4234;
																	local705 = false;
																}
															}
															if (local705) {
																break;
															}
														}
														Static219.aClass337_68 = null;
														return true;
													} else if (Static219.aClass337_68 == Static645.aClass337_172) {
														if (Static535.method7883(Static151.anInt2620)) {
															Static456.anInt7726 = (int) ((float) Static257.aClass5_Sub22_Sub1_1.method5968() * 2.5F);
														} else {
															Static456.anInt7726 = Static257.aClass5_Sub22_Sub1_1.method5968() * 30;
														}
														Static462.anInt7776 = Static126.anInt2290;
														Static219.aClass337_68 = null;
														return true;
													} else if (Static619.aClass337_162 == Static219.aClass337_68) {
														local204 = Static257.aClass5_Sub22_Sub1_1.method5917();
														local73 = Static257.aClass5_Sub22_Sub1_1.method5916();
														Static490.method7215();
														Static598.method8588(local73, local204);
														Static219.aClass337_68 = null;
														return true;
													} else if (Static219.aClass337_68 == Static467.aClass337_136) {
														local204 = Static257.aClass5_Sub22_Sub1_1.method5957();
														local73 = Static257.aClass5_Sub22_Sub1_1.method5903();
														Static490.method7215();
														Static536.method7901(local73, local204);
														Static219.aClass337_68 = null;
														return true;
													} else if (Static450.aClass337_133 == Static219.aClass337_68) {
														local204 = Static257.aClass5_Sub22_Sub1_1.method5951();
														local73 = Static257.aClass5_Sub22_Sub1_1.method5913();
														local219 = Static257.aClass5_Sub22_Sub1_1.method5913();
														Static490.method7215();
														Static638.method9005(local204, local73, 5, local219);
														Static219.aClass337_68 = null;
														return true;
													} else if (Static219.aClass337_68 == Static504.aClass337_144) {
														local705 = Static257.aClass5_Sub22_Sub1_1.method5966() == 1;
														local1801 = Static257.aClass5_Sub22_Sub1_1.method5937();
														local425 = local1801;
														if (local705) {
															local425 = Static257.aClass5_Sub22_Sub1_1.method5937();
														}
														local223 = Static257.aClass5_Sub22_Sub1_1.method5966();
														local227 = Static257.aClass5_Sub22_Sub1_1.method5968();
														local494 = false;
														if (local223 <= 1 && Static104.method1658(local425)) {
															local494 = true;
														}
														if (!local494 && Static184.anInt3247 == 0) {
															local533 = Static474.aClass66_2.method1367(local227).method5163(Static257.aClass5_Sub22_Sub1_1);
															if (local223 == 2) {
																Static361.method8007("<img=1>" + local1801, 25, local227, null, 0, local533, local1801, "<img=1>" + local425);
															} else if (local223 == 1) {
																Static361.method8007("<img=0>" + local1801, 25, local227, null, 0, local533, local1801, "<img=0>" + local425);
															} else {
																Static361.method8007(local1801, 25, local227, null, 0, local533, local1801, local425);
															}
														}
														Static219.aClass337_68 = null;
														return true;
													} else {
														@Pc(4973) Class21 local4973;
														if (Static219.aClass337_68 == Static325.aClass337_103) {
															Static393.anInt10472 = Static126.anInt2290;
															if (Static50.anInt1005 == 0) {
																Static113.anInt2111 = 0;
																Static171.aString38 = null;
																Static219.aClass337_68 = null;
																Static199.aClass21Array1 = null;
																Static149.aString35 = null;
																return true;
															}
															Static149.aString35 = Static257.aClass5_Sub22_Sub1_1.method5937();
															local705 = Static257.aClass5_Sub22_Sub1_1.method5966() == 1;
															if (local705) {
																Static257.aClass5_Sub22_Sub1_1.method5937();
															}
															@Pc(4816) long local4816 = Static257.aClass5_Sub22_Sub1_1.method5907();
															Static171.aString38 = Static249.method4127(local4816);
															Static418.aByte101 = Static257.aClass5_Sub22_Sub1_1.method5963();
															local223 = Static257.aClass5_Sub22_Sub1_1.method5966();
															if (local223 == 255) {
																Static219.aClass337_68 = null;
																return true;
															}
															Static113.anInt2111 = local223;
															@Pc(4842) Class21[] local4842 = new Class21[100];
															for (local2473 = 0; local2473 < Static113.anInt2111; local2473++) {
																local4842[local2473] = new Class21();
																local4842[local2473].aString9 = Static257.aClass5_Sub22_Sub1_1.method5937();
																local705 = Static257.aClass5_Sub22_Sub1_1.method5966() == 1;
																if (local705) {
																	local4842[local2473].aString10 = Static257.aClass5_Sub22_Sub1_1.method5937();
																} else {
																	local4842[local2473].aString10 = local4842[local2473].aString9;
																}
																local4842[local2473].aString7 = Static156.method2258(local4842[local2473].aString10);
																local4842[local2473].anInt343 = Static257.aClass5_Sub22_Sub1_1.method5968();
																local4842[local2473].aByte5 = Static257.aClass5_Sub22_Sub1_1.method5963();
																local4842[local2473].aString8 = Static257.aClass5_Sub22_Sub1_1.method5937();
																if (local4842[local2473].aString10.equals(Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aString17)) {
																	Static617.aByte133 = local4842[local2473].aByte5;
																}
															}
															local581 = Static113.anInt2111;
															while (local581 > 0) {
																local4172 = true;
																local581--;
																for (local908 = 0; local908 < local581; local908++) {
																	if (local4842[local908].aString7.compareTo(local4842[local908 + 1].aString7) > 0) {
																		local4973 = local4842[local908];
																		local4842[local908] = local4842[local908 + 1];
																		local4842[local908 + 1] = local4973;
																		local4172 = false;
																	}
																}
																if (local4172) {
																	break;
																}
															}
															Static199.aClass21Array1 = local4842;
															Static219.aClass337_68 = null;
															return true;
														} else if (Static263.aClass337_87 == Static219.aClass337_68) {
															local204 = Static257.aClass5_Sub22_Sub1_1.method5968();
															local3743 = Static257.aClass5_Sub22_Sub1_1.method5962();
															Static301.aClass59_1.method1311(local3743, local204);
															Static219.aClass337_68 = null;
															return true;
														} else if (Static622.aClass337_163 == Static219.aClass337_68) {
															local204 = Static257.aClass5_Sub22_Sub1_1.method5940();
															local73 = Static257.aClass5_Sub22_Sub1_1.method5924();
															Static490.method7215();
															Static553.method8067(true, local204, local73);
															Static219.aClass337_68 = null;
															return true;
														} else if (Static313.aClass337_97 == Static219.aClass337_68) {
															Static362.method5387(Static21.aClass376_1);
															Static219.aClass337_68 = null;
															return true;
														} else if (Static219.aClass337_68 == Static632.aClass337_166) {
															Static362.method5387(Static447.aClass376_14);
															Static219.aClass337_68 = null;
															return true;
														} else if (Static219.aClass337_68 == Static365.aClass337_85) {
															local204 = Static257.aClass5_Sub22_Sub1_1.method5966();
															if (Static257.aClass5_Sub22_Sub1_1.method5966() == 0) {
																Static188.aClass65Array2[local204] = new Class65();
															} else {
																Static257.aClass5_Sub22_Sub1_1.anInt6629--;
																Static188.aClass65Array2[local204] = new Class65(Static257.aClass5_Sub22_Sub1_1);
															}
															Static219.aClass337_68 = null;
															Static536.anInt9157 = Static126.anInt2290;
															return true;
														} else if (Static113.aClass337_38 == Static219.aClass337_68) {
															local204 = Static257.aClass5_Sub22_Sub1_1.method5968();
															local73 = Static257.aClass5_Sub22_Sub1_1.method5903();
															Static490.method7215();
															if (local73 == 2) {
																Static19.method244();
															}
															Static337.anInt5727 = local204;
															Static418.method6379(local204);
															Static555.method8083(false);
															Static370.method5466(Static337.anInt5727);
															for (local219 = 0; local219 < 100; local219++) {
																Static264.aBooleanArray16[local219] = true;
															}
															Static219.aClass337_68 = null;
															return true;
														} else if (Static466.aClass337_135 == Static219.aClass337_68) {
															if (Static323.aFrame2 != null) {
																Static400.method5975(false, Static97.aClass5_Sub25_8.aClass6_Sub8_2.method2208(), -1, -1);
															}
															@Pc(5177) byte[] local5177 = new byte[Static50.anInt1005];
															Static257.aClass5_Sub22_Sub1_1.method2648(local5177, Static50.anInt1005);
															local1801 = Static392.method5817(local5177, 0, Static50.anInt1005);
															Static173.method2687(Static470.aClass100_14, local1801, true, Static97.aClass5_Sub25_8.aClass6_Sub11_1.method3988() == 1);
															Static219.aClass337_68 = null;
															return true;
														} else if (Static521.aClass337_145 == Static219.aClass337_68) {
															@Pc(5217) int[] local5217 = new int[4];
															for (local73 = 0; local73 < 4; local73++) {
																local5217[local73] = Static257.aClass5_Sub22_Sub1_1.method5951();
															}
															local219 = Static257.aClass5_Sub22_Sub1_1.method5966();
															local223 = Static257.aClass5_Sub22_Sub1_1.method5968();
															@Pc(5250) Class5_Sub3 local5250 = (Class5_Sub3) Static445.aClass273_29.method6581((long) local223);
															if (local5250 != null) {
																Static1.method7585(local5250.aClass4_Sub2_Sub1_Sub1_Sub2_1, local219, local5217);
															}
															Static219.aClass337_68 = null;
															return true;
														} else if (Static219.aClass337_68 == Static115.aClass337_39) {
															local204 = Static257.aClass5_Sub22_Sub1_1.method5968();
															local73 = Static257.aClass5_Sub22_Sub1_1.method5968();
															local219 = Static257.aClass5_Sub22_Sub1_1.method5968();
															Static490.method7215();
															if (Static519.aClass295ArrayArray2[local204] != null) {
																for (local223 = local73; local223 < local219; local223++) {
																	local227 = Static257.aClass5_Sub22_Sub1_1.method5931();
																	if (local223 < Static519.aClass295ArrayArray2[local204].length && Static519.aClass295ArrayArray2[local204][local223] != null) {
																		Static519.aClass295ArrayArray2[local204][local223].anInt7979 = local227;
																	}
																}
															}
															Static219.aClass337_68 = null;
															return true;
														} else if (Static93.aClass337_32 == Static219.aClass337_68) {
															local705 = Static257.aClass5_Sub22_Sub1_1.method5966() == 1;
															local1801 = Static257.aClass5_Sub22_Sub1_1.method5937();
															local425 = local1801;
															if (local705) {
																local425 = Static257.aClass5_Sub22_Sub1_1.method5937();
															}
															local2071 = Static257.aClass5_Sub22_Sub1_1.method5968();
															local2076 = Static257.aClass5_Sub22_Sub1_1.method5931();
															local525 = Static257.aClass5_Sub22_Sub1_1.method5966();
															local581 = Static257.aClass5_Sub22_Sub1_1.method5968();
															@Pc(5381) long local5381 = (local2071 << 32) + local2076;
															local1025 = false;
															local948 = 0;
															while (true) {
																if (local948 >= 100) {
																	if (local525 <= 1 && Static104.method1658(local425)) {
																		local1025 = true;
																	}
																	break;
																}
																if (Static188.aLongArray14[local948] == local5381) {
																	local1025 = true;
																	break;
																}
																local948++;
															}
															if (!local1025 && Static184.anInt3247 == 0) {
																Static188.aLongArray14[Static394.anInt6511] = local5381;
																Static394.anInt6511 = (Static394.anInt6511 + 1) % 100;
																@Pc(5442) String local5442 = Static474.aClass66_2.method1367(local581).method5163(Static257.aClass5_Sub22_Sub1_1);
																if (local525 == 2) {
																	Static361.method8007("<img=1>" + local1801, 18, local581, null, 0, local5442, local1801, "<img=1>" + local425);
																} else if (local525 == 1) {
																	Static361.method8007("<img=0>" + local1801, 18, local581, null, 0, local5442, local1801, "<img=0>" + local425);
																} else {
																	Static361.method8007(local1801, 18, local581, null, 0, local5442, local1801, local425);
																}
															}
															Static219.aClass337_68 = null;
															return true;
														} else if (Static446.aClass337_131 == Static219.aClass337_68) {
															local204 = Static257.aClass5_Sub22_Sub1_1.method5924();
															local73 = Static257.aClass5_Sub22_Sub1_1.method5903();
															local219 = Static257.aClass5_Sub22_Sub1_1.method5966();
															local223 = Static257.aClass5_Sub22_Sub1_1.method5951();
															local227 = Static257.aClass5_Sub22_Sub1_1.method5903();
															Static490.method7215();
															Static433.aBooleanArray22[local227] = true;
															Static330.anIntArray302[local227] = local204;
															Static91.anIntArray118[local227] = local219;
															Static325.anIntArray294[local227] = local73;
															Static168.anIntArray167[local227] = local223;
															Static219.aClass337_68 = null;
															return true;
														} else if (Static219.aClass337_68 == Static596.aClass337_154) {
															Static198.method3508();
															Static219.aClass337_68 = null;
															return true;
														} else if (Static219.aClass337_68 == Static439.aClass337_130) {
															Static362.method5387(Static490.aClass376_15);
															Static219.aClass337_68 = null;
															return true;
														} else if (Static151.aClass337_49 == Static219.aClass337_68) {
															local413 = Static257.aClass5_Sub22_Sub1_1.method5937();
															local760 = Static257.aClass5_Sub22_Sub1_1.method5966() == 1;
															if (local760) {
																local1801 = Static257.aClass5_Sub22_Sub1_1.method5937();
															} else {
																local1801 = local413;
															}
															local223 = Static257.aClass5_Sub22_Sub1_1.method5968();
															@Pc(5627) byte local5627 = Static257.aClass5_Sub22_Sub1_1.method5963();
															local494 = false;
															if (local5627 == -128) {
																local494 = true;
															}
															if (local494) {
																if (Static113.anInt2111 == 0) {
																	Static219.aClass337_68 = null;
																	return true;
																}
																for (local878 = 0; Static113.anInt2111 > local878 && (!Static199.aClass21Array1[local878].aString10.equals(local1801) || local223 != Static199.aClass21Array1[local878].anInt343); local878++) {
																}
																if (Static113.anInt2111 > local878) {
																	while (local878 < Static113.anInt2111 - 1) {
																		Static199.aClass21Array1[local878] = Static199.aClass21Array1[local878 + 1];
																		local878++;
																	}
																	Static113.anInt2111--;
																	Static199.aClass21Array1[Static113.anInt2111] = null;
																}
															} else {
																local533 = Static257.aClass5_Sub22_Sub1_1.method5937();
																local4973 = new Class21();
																local4973.aString10 = local1801;
																local4973.aString9 = local413;
																local4973.aString7 = Static156.method2258(local4973.aString10);
																local4973.aByte5 = local5627;
																local4973.anInt343 = local223;
																local4973.aString8 = local533;
																for (local581 = Static113.anInt2111 - 1; local581 >= 0; local581--) {
																	local908 = Static199.aClass21Array1[local581].aString7.compareTo(local4973.aString7);
																	if (local908 == 0) {
																		Static199.aClass21Array1[local581].anInt343 = local223;
																		Static199.aClass21Array1[local581].aByte5 = local5627;
																		Static199.aClass21Array1[local581].aString8 = local533;
																		if (local1801.equals(Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aString17)) {
																			Static617.aByte133 = local5627;
																		}
																		Static219.aClass337_68 = null;
																		Static393.anInt10472 = Static126.anInt2290;
																		return true;
																	}
																	if (local908 < 0) {
																		break;
																	}
																}
																if (Static113.anInt2111 >= Static199.aClass21Array1.length) {
																	Static219.aClass337_68 = null;
																	return true;
																}
																for (local908 = Static113.anInt2111 - 1; local908 > local581; local908--) {
																	Static199.aClass21Array1[local908 + 1] = Static199.aClass21Array1[local908];
																}
																if (Static113.anInt2111 == 0) {
																	Static199.aClass21Array1 = new Class21[100];
																}
																Static199.aClass21Array1[local581 + 1] = local4973;
																Static113.anInt2111++;
																if (local1801.equals(Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aString17)) {
																	Static617.aByte133 = local5627;
																}
															}
															Static393.anInt10472 = Static126.anInt2290;
															Static219.aClass337_68 = null;
															return true;
														} else if (Static522.aClass337_146 == Static219.aClass337_68) {
															local204 = Static257.aClass5_Sub22_Sub1_1.method5966();
															local73 = Static257.aClass5_Sub22_Sub1_1.method5917();
															Static301.aClass59_1.method1309(local204, local73);
															Static219.aClass337_68 = null;
															return true;
														} else if (Static219.aClass337_68 == Static277.aClass337_88) {
															Static225.anInt4205 = Static257.aClass5_Sub22_Sub1_1.method5966();
															for (local204 = 0; local204 < Static225.anInt4205; local204++) {
																Static447.aStringArray59[local204] = Static257.aClass5_Sub22_Sub1_1.method5937();
																Static518.aStringArray70[local204] = Static257.aClass5_Sub22_Sub1_1.method5937();
																if (Static518.aStringArray70[local204].equals("")) {
																	Static518.aStringArray70[local204] = Static447.aStringArray59[local204];
																}
																Static526.aStringArray72[local204] = Static257.aClass5_Sub22_Sub1_1.method5937();
																Static530.aStringArray75[local204] = Static257.aClass5_Sub22_Sub1_1.method5937();
																if (Static530.aStringArray75[local204].equals("")) {
																	Static530.aStringArray75[local204] = Static526.aStringArray72[local204];
																}
																Static189.aBooleanArray29[local204] = false;
															}
															Static197.anInt10377 = Static126.anInt2290;
															Static219.aClass337_68 = null;
															return true;
														} else if (Static219.aClass337_68 == Static316.aClass337_99) {
															Static490.method7215();
															Static119.method1798();
															Static219.aClass337_68 = null;
															return true;
														} else if (Static219.aClass337_68 == Static143.aClass337_44) {
															Static219.aClass337_68 = null;
															return false;
														} else if (Static229.aClass337_70 == Static219.aClass337_68) {
															local705 = Static257.aClass5_Sub22_Sub1_1.method5966() == 1;
															local1801 = Static257.aClass5_Sub22_Sub1_1.method5937();
															local425 = local1801;
															if (local705) {
																local425 = Static257.aClass5_Sub22_Sub1_1.method5937();
															}
															local2071 = Static257.aClass5_Sub22_Sub1_1.method5968();
															local2076 = Static257.aClass5_Sub22_Sub1_1.method5931();
															local525 = Static257.aClass5_Sub22_Sub1_1.method5966();
															@Pc(6014) long local6014 = local2076 + (local2071 << 32);
															local1318 = false;
															local942 = 0;
															while (true) {
																if (local942 >= 100) {
																	if (local525 <= 1) {
																		if (Static194.aBoolean235 && !Static92.aBoolean141 || Static34.aBoolean23) {
																			local1318 = true;
																		} else if (Static104.method1658(local425)) {
																			local1318 = true;
																		}
																	}
																	break;
																}
																if (Static188.aLongArray14[local942] == local6014) {
																	local1318 = true;
																	break;
																}
																local942++;
															}
															if (!local1318 && Static184.anInt3247 == 0) {
																Static188.aLongArray14[Static394.anInt6511] = local6014;
																Static394.anInt6511 = (Static394.anInt6511 + 1) % 100;
																@Pc(6073) String local6073 = Static101.method1631(Static20.method246(Static257.aClass5_Sub22_Sub1_1));
																if (local525 == 2) {
																	Static361.method8007("<img=1>" + local1801, 7, -1, null, 0, local6073, local1801, "<img=1>" + local425);
																} else if (local525 == 1) {
																	Static361.method8007("<img=0>" + local1801, 7, -1, null, 0, local6073, local1801, "<img=0>" + local425);
																} else {
																	Static361.method8007(local1801, 3, -1, null, 0, local6073, local1801, local425);
																}
															}
															Static219.aClass337_68 = null;
															return true;
														} else if (Static42.aClass337_17 == Static219.aClass337_68) {
															local204 = Static257.aClass5_Sub22_Sub1_1.method5924();
															local73 = Static257.aClass5_Sub22_Sub1_1.method5967();
															if (local73 == 255) {
																local204 = -1;
																local73 = -1;
															}
															Static353.method5271(local204, local73);
															Static219.aClass337_68 = null;
															return true;
														} else if (Static219.aClass337_68 == Static330.aClass337_104) {
															local204 = Static257.aClass5_Sub22_Sub1_1.method5940();
															Static490.method7215();
															Static563.method8170(local204);
															Static219.aClass337_68 = null;
															return true;
														} else if (Static69.aClass337_23 == Static219.aClass337_68) {
															Static362.method5387(Static446.aClass376_13);
															Static219.aClass337_68 = null;
															return true;
														} else if (Static595.aClass337_153 == Static219.aClass337_68) {
															local204 = Static257.aClass5_Sub22_Sub1_1.method5916();
															Static490.method7215();
															@Pc(6221) Class5_Sub27 local6221 = (Class5_Sub27) Static269.aClass273_11.method6581((long) local204);
															if (local6221 != null) {
																Static609.method8688(true, local6221, false);
															}
															if (Static69.aClass295_5 != null) {
																Static465.method6901(Static69.aClass295_5);
																Static69.aClass295_5 = null;
															}
															Static219.aClass337_68 = null;
															return true;
														} else if (Static219.aClass337_68 == Static70.aClass337_24) {
															local204 = Static257.aClass5_Sub22_Sub1_1.method5953();
															local73 = Static257.aClass5_Sub22_Sub1_1.method5940();
															Static490.method7215();
															Static5.method103(local204, local73);
															Static219.aClass337_68 = null;
															return true;
														} else if (Static260.aClass337_86 == Static219.aClass337_68) {
															Static362.method5387(Static532.aClass376_16);
															Static219.aClass337_68 = null;
															return true;
														} else if (Static483.aClass337_138 == Static219.aClass337_68) {
															local204 = Static257.aClass5_Sub22_Sub1_1.method5957();
															local73 = Static257.aClass5_Sub22_Sub1_1.method5951();
															if (local73 == 65535) {
																local73 = -1;
															}
															Static490.method7215();
															Static36.method539(local73, local204);
															Static219.aClass337_68 = null;
															return true;
														} else if (Static615.aClass337_160 == Static219.aClass337_68) {
															local204 = Static257.aClass5_Sub22_Sub1_1.method5916();
															local73 = Static257.aClass5_Sub22_Sub1_1.method5953();
															Static490.method7215();
															@Pc(6323) Class5_Sub27 local6323 = (Class5_Sub27) Static269.aClass273_11.method6581((long) local73);
															local3402 = (Class5_Sub27) Static269.aClass273_11.method6581((long) local204);
															if (local3402 != null) {
																Static609.method8688(local6323 == null || local3402.anInt4270 != local6323.anInt4270, local3402, false);
															}
															if (local6323 != null) {
																local6323.method9047();
																Static269.aClass273_11.method6585((long) local204, local6323);
															}
															@Pc(6367) Class295 local6367 = Static107.method9049(local73);
															if (local6367 != null) {
																Static465.method6901(local6367);
															}
															local6367 = Static107.method9049(local204);
															if (local6367 != null) {
																Static465.method6901(local6367);
																Static22.method259(true, local6367);
															}
															if (Static337.anInt5727 != -1) {
																Static441.method6684(1, Static337.anInt5727);
															}
															Static219.aClass337_68 = null;
															return true;
														} else if (Static526.aClass337_147 == Static219.aClass337_68) {
															local705 = Static257.aClass5_Sub22_Sub1_1.method5966() == 1;
															local1801 = Static257.aClass5_Sub22_Sub1_1.method5937();
															local425 = local1801;
															if (local705) {
																local425 = Static257.aClass5_Sub22_Sub1_1.method5937();
															}
															local223 = Static257.aClass5_Sub22_Sub1_1.method5966();
															local486 = false;
															if (local223 <= 1) {
																if (Static194.aBoolean235 && !Static92.aBoolean141 || Static34.aBoolean23) {
																	local486 = true;
																} else if (local223 <= 1 && Static104.method1658(local425)) {
																	local486 = true;
																}
															}
															if (!local486 && Static184.anInt3247 == 0) {
																local1628 = Static101.method1631(Static20.method246(Static257.aClass5_Sub22_Sub1_1));
																if (local223 == 2) {
																	Static361.method8007("<img=1>" + local1801, 24, -1, null, 0, local1628, local1801, "<img=1>" + local425);
																} else if (local223 == 1) {
																	Static361.method8007("<img=0>" + local1801, 24, -1, null, 0, local1628, local1801, "<img=0>" + local425);
																} else {
																	Static361.method8007(local1801, 24, -1, null, 0, local1628, local1801, local425);
																}
															}
															Static219.aClass337_68 = null;
															return true;
														} else if (Static219.aClass337_68 == Static392.aClass337_122) {
															for (local204 = 0; local204 < Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12.length; local204++) {
																if (Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[local204] != null) {
																	Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[local204].anIntArray85 = null;
																	Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[local204].anInt1277 = -1;
																}
															}
															for (local73 = 0; local73 < Static235.anInt4322; local73++) {
																Static467.aClass5_Sub3Array1[local73].aClass4_Sub2_Sub1_Sub1_Sub2_1.anIntArray85 = null;
																Static467.aClass5_Sub3Array1[local73].aClass4_Sub2_Sub1_Sub1_Sub2_1.anInt1277 = -1;
															}
															Static219.aClass337_68 = null;
															return true;
														} else if (Static178.aClass337_57 == Static219.aClass337_68) {
															local204 = Static257.aClass5_Sub22_Sub1_1.method5913();
															local73 = Static257.aClass5_Sub22_Sub1_1.method5951();
															if (local73 == 65535) {
																local73 = -1;
															}
															Static490.method7215();
															Static638.method9005(local73, local204, 2, -1);
															Static219.aClass337_68 = null;
															return true;
														} else if (Static250.aClass337_75 == Static219.aClass337_68) {
															local204 = Static257.aClass5_Sub22_Sub1_1.method5940();
															local73 = Static257.aClass5_Sub22_Sub1_1.method5968();
															local219 = Static257.aClass5_Sub22_Sub1_1.method5953();
															Static490.method7215();
															Static375.method5523(local219, local204 + (local73 << 16));
															Static219.aClass337_68 = null;
															return true;
														} else if (Static599.aClass337_156 == Static219.aClass337_68) {
															Static587.anInt9873 = Static257.aClass5_Sub22_Sub1_1.method5909() << 3;
															Static520.anInt8959 = Static257.aClass5_Sub22_Sub1_1.method5924();
															Static385.anInt6359 = Static257.aClass5_Sub22_Sub1_1.method5963() << 3;
															for (@Pc(6677) Class5_Sub18 local6677 = (Class5_Sub18) Static440.aClass273_28.method6577(); local6677 != null; local6677 = (Class5_Sub18) Static440.aClass273_28.method6589()) {
																local73 = (int) (local6677.aLong278 >> 28 & 0x3L);
																local219 = (int) (local6677.aLong278 & 0x3FFFL);
																local223 = local219 - Static565.anInt9560;
																local227 = (int) (local6677.aLong278 >> 14 & 0x3FFFL);
																local2473 = local227 - Static567.anInt9589;
																if (Static520.anInt8959 == local73 && local223 >= Static385.anInt6359 && Static385.anInt6359 + 8 > local223 && local2473 >= Static587.anInt9873 && Static587.anInt9873 + 8 > local2473) {
																	local6677.method9047();
																	if (local223 >= 0 && local2473 >= 0 && Static326.anInt5541 > local223 && Static448.anInt7637 > local2473) {
																		Static85.method1401(local223, local2473, Static520.anInt8959);
																	}
																}
															}
															for (@Pc(6781) Class5_Sub44 local6781 = (Class5_Sub44) Static174.aClass330_14.method7908(); local6781 != null; local6781 = (Class5_Sub44) Static174.aClass330_14.method7914()) {
																if (local6781.anInt8645 >= Static385.anInt6359 && local6781.anInt8645 < Static385.anInt6359 + 8 && local6781.anInt8639 >= Static587.anInt9873 && local6781.anInt8639 < Static587.anInt9873 + 8 && local6781.anInt8640 == Static520.anInt8959) {
																	local6781.anInt8641 = 0;
																}
															}
															Static219.aClass337_68 = null;
															return true;
														} else if (Static638.aClass337_170 == Static219.aClass337_68) {
															local204 = Static257.aClass5_Sub22_Sub1_1.method5953();
															Static490.method7215();
															Static219.aClass337_68 = null;
															if (local204 == -1) {
																Static304.anInt5319 = -1;
																Static396.anInt6606 = -1;
															} else {
																local73 = local204 >> 14 & 0x3FFF;
																local219 = local204 & 0x3FFF;
																local73 -= Static565.anInt9560;
																local219 -= Static567.anInt9589;
																if (local73 < 0) {
																	local73 = 0;
																} else if (Static326.anInt5541 <= local73) {
																	local73 = Static326.anInt5541;
																}
																Static304.anInt5319 = (local73 << 9) + 256;
																if (local219 < 0) {
																	local219 = 0;
																} else if (local219 >= Static448.anInt7637) {
																	local219 = Static448.anInt7637;
																}
																Static396.anInt6606 = (local219 << 9) + 256;
															}
															return true;
														} else {
															Static524.method7740(null, "T1 - " + (Static219.aClass337_68 == null ? -1 : Static219.aClass337_68.method7976()) + "," + (Static310.aClass337_94 == null ? -1 : Static310.aClass337_94.method7976()) + "," + (Static630.aClass337_165 == null ? -1 : Static630.aClass337_165.method7976()) + " - " + Static50.anInt1005);
															Static583.method8429(false);
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

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)V")
	public static void method4587() {
		if (Static280.method4485(Static151.anInt2620) || Static535.method7883(Static151.anInt2620)) {
			Static462.method6854(Static117.anInt2170 >> 12, Static19.anInt277 >> 12, 5000);
		} else {
			@Pc(27) int local27 = Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anIntArray94[0] >> 3;
			@Pc(34) int local34 = Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anIntArray95[0] >> 3;
			if (local27 >= 0 && local27 < Static326.anInt5541 >> 3 && local34 >= 0 && local34 < Static448.anInt7637 >> 3) {
				Static462.method6854(local34, local27, 5000);
			} else {
				Static462.method6854(Static448.anInt7637 >> 4, Static326.anInt5541 >> 4, 0);
			}
		}
		Static89.method1509();
		Static133.method1984();
		Static611.method8097();
		Static392.method5819();
	}
}
