import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "[I")
	public static int[] anIntArray399;

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
	public static int anInt4462;

	@OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
	public static int anInt4475;

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "Z")
	public static boolean aBoolean296 = false;

	@OriginalMember(owner = "client!rc", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString145 = "Loaded world list data";

	@OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
	public static int anInt4474 = 0;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
	public static void method3586() {
		anIntArray399 = null;
		aString145 = null;
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
	public static void method3587() {
		Static148.aClass22ArrayArray1 = new Class22[Static222.aClass98_132.method2380()][];
		Static257.aBooleanArray24 = new boolean[Static222.aClass98_132.method2380()];
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)Lclient!hi;")
	public static Class59 method3588() {
		@Pc(23) Class59 local23;
		if (Static178.aBoolean216) {
			local23 = new Class59_Sub1(Static15.anInt278, Static197.anInt3881, Static262.anIntArray439[0], Static100.anIntArray223[0], Static159.anIntArray285[0], Static46.anIntArray120[0], Static274.aByteArrayArray20[0], Static6.anIntArray14);
		} else {
			local23 = new Class59_Sub2(Static15.anInt278, Static197.anInt3881, Static262.anIntArray439[0], Static100.anIntArray223[0], Static159.anIntArray285[0], Static46.anIntArray120[0], Static274.aByteArrayArray20[0], Static6.anIntArray14);
		}
		Static268.method4006();
		return local23;
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)Z")
	public static boolean method3589() throws IOException {
		if (Static259.aClass158_3 == null) {
			return false;
		}
		@Pc(14) int local14 = Static259.aClass158_3.method3774();
		if (local14 == 0) {
			return false;
		}
		if (Static92.anInt1908 == -1) {
			Static259.aClass158_3.method3775(0, 1, Static101.aClass4_Sub17_Sub1_4.aByteArray30);
			Static101.aClass4_Sub17_Sub1_4.anInt2400 = 0;
			Static92.anInt1908 = Static101.aClass4_Sub17_Sub1_4.method1899();
			local14--;
			Static131.anInt2781 = Static138.anIntArray266[Static92.anInt1908];
		}
		if (Static131.anInt2781 == -1) {
			if (local14 <= 0) {
				return false;
			}
			Static259.aClass158_3.method3775(0, 1, Static101.aClass4_Sub17_Sub1_4.aByteArray30);
			Static131.anInt2781 = Static101.aClass4_Sub17_Sub1_4.aByteArray30[0] & 0xFF;
			local14--;
		}
		if (Static131.anInt2781 == -2) {
			if (local14 <= 1) {
				return false;
			}
			local14 -= 2;
			Static259.aClass158_3.method3775(0, 2, Static101.aClass4_Sub17_Sub1_4.aByteArray30);
			Static101.aClass4_Sub17_Sub1_4.anInt2400 = 0;
			Static131.anInt2781 = Static101.aClass4_Sub17_Sub1_4.method1837();
		}
		if (local14 < Static131.anInt2781) {
			return false;
		}
		Static101.aClass4_Sub17_Sub1_4.anInt2400 = 0;
		Static259.aClass158_3.method3775(0, Static131.anInt2781, Static101.aClass4_Sub17_Sub1_4.aByteArray30);
		Static269.anInt5030 = 0;
		Static251.anInt4741 = Static53.anInt1060;
		Static53.anInt1060 = Static235.anInt4579;
		Static235.anInt4579 = Static92.anInt1908;
		@Pc(135) int local135;
		@Pc(149) int local149;
		@Pc(131) int local131;
		@Pc(139) int local139;
		if (Static92.anInt1908 == 50) {
			local131 = Static101.aClass4_Sub17_Sub1_4.method1850();
			local135 = Static101.aClass4_Sub17_Sub1_4.method1850();
			local139 = Static101.aClass4_Sub17_Sub1_4.method1851();
			if (local139 == 65535) {
				local139 = -1;
			}
			local149 = Static101.aClass4_Sub17_Sub1_4.method1851();
			if (Static30.method462(local149)) {
				@Pc(161) Class22 local161 = Static21.method3453(local131);
				@Pc(173) Class163 local173;
				if (local161.aBoolean33) {
					Static213.method3410(local135, local139, local131);
					local173 = Static277.method4117(local139);
					Static67.method1038(local173.anInt4886, local173.anInt4894, local131, local173.anInt4907);
					Static198.method1838(local173.anInt4862, local131, local173.anInt4911, local173.anInt4896);
				} else if (local139 == -1) {
					Static92.anInt1908 = -1;
					local161.anInt628 = 0;
					return true;
				} else {
					local173 = Static277.method4117(local139);
					local161.anInt621 = local173.anInt4886;
					local161.anInt623 = local173.anInt4907 * 100 / local135;
					local161.anInt617 = local173.anInt4894;
					local161.anInt628 = 4;
					local161.anInt572 = local139;
					Static81.method3274(local161);
				}
			}
			Static92.anInt1908 = -1;
			return true;
		} else if (Static92.anInt1908 == 232) {
			local131 = Static101.aClass4_Sub17_Sub1_4.method1868();
			local135 = Static101.aClass4_Sub17_Sub1_4.method1868();
			local139 = Static101.aClass4_Sub17_Sub1_4.method1889();
			if (Static30.method462(local131)) {
				Static105.method1725(local139, local135);
			}
			Static92.anInt1908 = -1;
			return true;
		} else if (Static92.anInt1908 == 83) {
			local131 = Static101.aClass4_Sub17_Sub1_4.method1868();
			local135 = Static101.aClass4_Sub17_Sub1_4.method1837();
			local139 = Static101.aClass4_Sub17_Sub1_4.method1850();
			if (Static30.method462(local131)) {
				Static137.method2182(local139, local135);
			}
			Static92.anInt1908 = -1;
			return true;
		} else if (Static92.anInt1908 == 145) {
			if (Static25.anInt448 != -1) {
				Static114.method1938(Static25.anInt448, 0);
			}
			Static92.anInt1908 = -1;
			return true;
		} else if (Static92.anInt1908 == 210) {
			local131 = Static101.aClass4_Sub17_Sub1_4.method1868();
			local135 = Static101.aClass4_Sub17_Sub1_4.method1837();
			local139 = Static101.aClass4_Sub17_Sub1_4.method1850();
			if (local135 == 65535) {
				local135 = -1;
			}
			if (Static30.method462(local131)) {
				Static31.method473(local139, 2, -1, local135);
			}
			Static92.anInt1908 = -1;
			return true;
		} else if (Static92.anInt1908 == 121) {
			Static3.method41();
			Static157.method2484();
			Static47.anInt944 += 32;
			Static92.anInt1908 = -1;
			return true;
		} else {
			@Pc(380) long local380;
			@Pc(403) long local403;
			@Pc(437) int local437;
			@Pc(421) int local421;
			@Pc(504) int local504;
			@Pc(511) boolean local511;
			@Pc(514) int local514;
			if (Static92.anInt1908 == 156) {
				Static159.anInt3170 = Static177.anInt3485;
				local380 = Static101.aClass4_Sub17_Sub1_4.method1864();
				if (local380 == 0L) {
					Static26.anInt478 = 0;
					Static92.anInt1908 = -1;
					Static52.aString30 = null;
					Static83.aClass4_Sub16Array3 = null;
					Static232.aString149 = null;
					return true;
				}
				local403 = Static101.aClass4_Sub17_Sub1_4.method1864();
				Static232.aString149 = Static141.method2286(local403);
				Static52.aString30 = Static141.method2286(local380);
				Static27.aByte8 = Static101.aClass4_Sub17_Sub1_4.method1892();
				local421 = Static101.aClass4_Sub17_Sub1_4.method1874();
				if (local421 == 255) {
					Static92.anInt1908 = -1;
					return true;
				}
				Static26.anInt478 = local421;
				@Pc(435) Class4_Sub16[] local435 = new Class4_Sub16[100];
				for (local437 = 0; local437 < Static26.anInt478; local437++) {
					local435[local437] = new Class4_Sub16();
					local435[local437].aLong200 = Static101.aClass4_Sub17_Sub1_4.method1864();
					local435[local437].aString59 = Static141.method2286(local435[local437].aLong200);
					local435[local437].anInt1957 = Static101.aClass4_Sub17_Sub1_4.method1837();
					local435[local437].aByte11 = Static101.aClass4_Sub17_Sub1_4.method1892();
					local435[local437].aString58 = Static101.aClass4_Sub17_Sub1_4.method1841();
					if (local435[local437].aLong200 == Static217.aLong158) {
						Static147.aByte12 = local435[local437].aByte11;
					}
				}
				local504 = Static26.anInt478;
				while (local504 > 0) {
					local511 = true;
					local504--;
					for (local514 = 0; local514 < local504; local514++) {
						if (local435[local514].aString59.compareTo(local435[local514 + 1].aString59) > 0) {
							@Pc(541) Class4_Sub16 local541 = local435[local514];
							local435[local514] = local435[local514 + 1];
							local511 = false;
							local435[local514 + 1] = local541;
						}
					}
					if (local511) {
						break;
					}
				}
				Static83.aClass4_Sub16Array3 = local435;
				Static92.anInt1908 = -1;
				return true;
			}
			@Pc(587) long local587;
			@Pc(602) int local602;
			if (Static92.anInt1908 == 117) {
				local380 = Static101.aClass4_Sub17_Sub1_4.method1864();
				local403 = Static101.aClass4_Sub17_Sub1_4.method1837();
				local587 = Static101.aClass4_Sub17_Sub1_4.method1835();
				local437 = Static101.aClass4_Sub17_Sub1_4.method1874();
				@Pc(598) long local598 = (local403 << 32) + local587;
				@Pc(600) boolean local600 = false;
				local602 = 0;
				label1791: while (true) {
					if (local602 < 100) {
						if (local598 != Static243.aLongArray13[local602]) {
							local602++;
							continue;
						}
						local600 = true;
						break;
					}
					if (local437 <= 1) {
						if (Static263.aBoolean68 && !Static189.aBoolean321 || Static63.aBoolean91) {
							local600 = true;
						} else {
							for (local602 = 0; local602 < Static297.anInt5497; local602++) {
								if (local380 == Static126.aLongArray6[local602]) {
									local600 = true;
									break label1791;
								}
							}
						}
					}
					break;
				}
				if (!local600 && Static116.anInt2585 == 0) {
					Static243.aLongArray13[Static54.anInt1070] = local598;
					Static54.anInt1070 = (Static54.anInt1070 + 1) % 100;
					@Pc(693) String local693 = Static293.method4172(Static168.method2663(Static217.method3494(Static101.aClass4_Sub17_Sub1_4)));
					if (local437 == 2 || local437 == 3) {
						Static271.method4062(local693, 7, "<img=1>" + Static211.method3379(local380));
					} else if (local437 == 1) {
						Static271.method4062(local693, 7, "<img=0>" + Static211.method3379(local380));
					} else {
						Static271.method4062(local693, 3, Static211.method3379(local380));
					}
				}
				Static92.anInt1908 = -1;
				return true;
			} else if (Static92.anInt1908 == 13) {
				Static43.method4376(false);
				Static92.anInt1908 = -1;
				return true;
			} else {
				@Pc(781) String local781;
				if (Static92.anInt1908 == 19) {
					local131 = Static101.aClass4_Sub17_Sub1_4.method1837();
					local135 = Static101.aClass4_Sub17_Sub1_4.method1851();
					local781 = Static101.aClass4_Sub17_Sub1_4.method1841();
					if (Static30.method462(local131)) {
						Static122.method2062(local135, local781);
					}
					Static92.anInt1908 = -1;
					return true;
				}
				@Pc(832) Class4_Sub10 local832;
				if (Static92.anInt1908 == 185) {
					local131 = Static101.aClass4_Sub17_Sub1_4.method1844();
					local135 = Static101.aClass4_Sub17_Sub1_4.method1868();
					local139 = Static101.aClass4_Sub17_Sub1_4.method1874();
					local149 = Static101.aClass4_Sub17_Sub1_4.method1851();
					if (Static30.method462(local149)) {
						local832 = (Class4_Sub10) Static227.aClass97_16.method2360((long) local131);
						if (local832 != null) {
							Static284.method4279(local832, local135 != local832.anInt1032);
						}
						Static158.method2490(local131, local139, local135);
					}
					Static92.anInt1908 = -1;
					return true;
				} else if (Static92.anInt1908 == 108) {
					Static157.method2484();
					local131 = Static101.aClass4_Sub17_Sub1_4.method1882();
					local135 = Static101.aClass4_Sub17_Sub1_4.method1844();
					local139 = Static101.aClass4_Sub17_Sub1_4.method1872();
					Static286.anIntArray481[local139] = local135;
					Static264.anIntArray443[local139] = local131;
					Static280.anIntArray475[local139] = 1;
					for (local149 = 0; local149 < 98; local149++) {
						if (Class57.anIntArray222[local149] <= local135) {
							Static280.anIntArray475[local139] = local149 + 2;
						}
					}
					Static61.anIntArray132[Static231.anInt4523++ & 0x1F] = local139;
					Static92.anInt1908 = -1;
					return true;
				} else {
					@Pc(980) int local980;
					@Pc(958) Class22 local958;
					if (Static92.anInt1908 == 238) {
						local131 = Static101.aClass4_Sub17_Sub1_4.method1889();
						local135 = Static101.aClass4_Sub17_Sub1_4.method1837();
						if (local131 < -70000) {
							local135 += 32768;
						}
						if (local131 < 0) {
							local958 = null;
						} else {
							local958 = Static21.method3453(local131);
						}
						while (Static101.aClass4_Sub17_Sub1_4.anInt2400 < Static131.anInt2781) {
							local149 = Static101.aClass4_Sub17_Sub1_4.method1856();
							local421 = Static101.aClass4_Sub17_Sub1_4.method1837();
							local980 = 0;
							if (local421 != 0) {
								local980 = Static101.aClass4_Sub17_Sub1_4.method1874();
								if (local980 == 255) {
									local980 = Static101.aClass4_Sub17_Sub1_4.method1889();
								}
							}
							if (local958 != null && local149 >= 0 && local958.anIntArray63.length > local149) {
								local958.anIntArray63[local149] = local421;
								local958.anIntArray56[local149] = local980;
							}
							Static268.method4004(local980, local421 - 1, local135, local149);
						}
						if (local958 != null) {
							Static81.method3274(local958);
						}
						Static157.method2484();
						Static273.anIntArray126[Static215.anInt4270++ & 0x1F] = local135 & 0x7FFF;
						Static92.anInt1908 = -1;
						return true;
					} else if (Static92.anInt1908 == 254) {
						local131 = Static101.aClass4_Sub17_Sub1_4.method1837();
						local135 = Static101.aClass4_Sub17_Sub1_4.method1874();
						local139 = Static101.aClass4_Sub17_Sub1_4.method1874();
						local149 = Static101.aClass4_Sub17_Sub1_4.method1837();
						local421 = Static101.aClass4_Sub17_Sub1_4.method1874();
						local980 = Static101.aClass4_Sub17_Sub1_4.method1874();
						if (Static30.method462(local131)) {
							Static231.method3629(local980, local139, local135, local421, true, local149);
						}
						Static92.anInt1908 = -1;
						return true;
					} else if (Static92.anInt1908 == 194) {
						local131 = Static101.aClass4_Sub17_Sub1_4.method1874();
						local135 = Static101.aClass4_Sub17_Sub1_4.method1851();
						local139 = Static101.aClass4_Sub17_Sub1_4.method1868();
						@Pc(1131) Class12_Sub3_Sub1 local1131 = Static100.aClass12_Sub3_Sub1Array1[local135];
						if (local1131 != null) {
							Static1.method8(local1131, local139, local131);
						}
						Static92.anInt1908 = -1;
						return true;
					} else if (Static92.anInt1908 == 51) {
						Static21.method3456(Static101.aClass4_Sub17_Sub1_4.method1841());
						Static92.anInt1908 = -1;
						return true;
					} else {
						@Pc(1168) String local1168;
						if (Static92.anInt1908 == 201) {
							local131 = Static101.aClass4_Sub17_Sub1_4.method1896();
							local1168 = Static101.aClass4_Sub17_Sub1_4.method1841();
							local139 = Static101.aClass4_Sub17_Sub1_4.method1868();
							if (Static30.method462(local131)) {
								Static122.method2062(local139, local1168);
							}
							Static92.anInt1908 = -1;
							return true;
						} else if (Static92.anInt1908 == 21) {
							local131 = Static101.aClass4_Sub17_Sub1_4.method1896();
							local135 = Static101.aClass4_Sub17_Sub1_4.method1868();
							local139 = Static101.aClass4_Sub17_Sub1_4.method1858();
							local149 = Static101.aClass4_Sub17_Sub1_4.method1837();
							local421 = Static101.aClass4_Sub17_Sub1_4.method1851();
							if (Static30.method462(local131)) {
								Static31.method473(local139, 7, local149, local421 | local135 << 16);
							}
							Static92.anInt1908 = -1;
							return true;
						} else {
							@Pc(1454) int local1454;
							if (Static92.anInt1908 == 70) {
								local131 = Static101.aClass4_Sub17_Sub1_4.method1851();
								local135 = Static101.aClass4_Sub17_Sub1_4.method1889();
								local139 = Static101.aClass4_Sub17_Sub1_4.method1837();
								local149 = Static101.aClass4_Sub17_Sub1_4.method1896();
								if (local135 >> 30 == 0) {
									@Pc(1298) Class126 local1298;
									@Pc(1386) Class141 local1386;
									@Pc(1391) Class141 local1391;
									@Pc(1311) Class141 local1311;
									@Pc(1369) Class126 local1369;
									if (local135 >> 29 != 0) {
										local421 = local135 & 0xFFFF;
										@Pc(1268) Class12_Sub3_Sub1 local1268 = Static100.aClass12_Sub3_Sub1Array1[local421];
										if (local1268 != null) {
											local511 = true;
											if (local139 == 65535) {
												local139 = -1;
											}
											if (local139 != -1 && local1268.anInt4125 != -1) {
												if (local139 == local1268.anInt4125) {
													local1298 = Static262.method3973(local139);
													if (local1298.aBoolean245 && local1298.anInt3816 != -1) {
														local1311 = Static296.method1376(local1298.anInt3816);
														local514 = local1311.anInt4349;
														if (local514 == 1) {
															local511 = false;
															local1268.anInt4154 = 0;
															local1268.anInt4158 = 1;
															local1268.anInt4169 = 0;
															local1268.anInt4144 = local131 + Static104.anInt2226;
															local1268.anInt4188 = 0;
															Static11.method188(false, local1311, local1268.anInt4141, local1268.anInt4113, local1268.anInt4188);
														} else if (local514 == 2) {
															local1268.anInt4112 = 0;
															local511 = false;
														}
													}
												} else {
													local1298 = Static262.method3973(local139);
													local1369 = Static262.method3973(local1268.anInt4125);
													if (local1298.anInt3816 != -1 && local1369.anInt3816 != -1) {
														local1386 = Static296.method1376(local1298.anInt3816);
														local1391 = Static296.method1376(local1369.anInt3816);
														if (local1386.anInt4358 < local1391.anInt4358) {
															local511 = false;
														}
													}
												}
											}
											if (local511) {
												local1268.anInt4187 = local149;
												local1268.anInt4125 = local139;
												local1268.anInt4188 = 0;
												local1268.anInt4154 = 0;
												local1268.anInt4144 = local131 + Static104.anInt2226;
												if (Static104.anInt2226 < local1268.anInt4144) {
													local1268.anInt4188 = -1;
												}
												local1268.anInt4158 = 1;
												if (local1268.anInt4125 != -1 && Static104.anInt2226 == local1268.anInt4144) {
													local1454 = Static262.method3973(local1268.anInt4125).anInt3816;
													if (local1454 != -1) {
														local1311 = Static296.method1376(local1454);
														if (local1311 != null && local1311.anIntArray390 != null) {
															Static11.method188(false, local1311, local1268.anInt4141, local1268.anInt4113, 0);
														}
													}
												}
											}
										}
									} else if (local135 >> 28 != 0) {
										local421 = local135 & 0xFFFF;
										@Pc(1502) Class12_Sub3_Sub2 local1502;
										if (Static238.anInt4597 == local421) {
											local1502 = Static239.aClass12_Sub3_Sub2_2;
										} else {
											local1502 = Static257.aClass12_Sub3_Sub2Array1[local421];
										}
										if (local1502 != null) {
											local511 = true;
											if (local139 == 65535) {
												local139 = -1;
											}
											if (local139 != -1 && local1502.anInt4125 != -1) {
												if (local1502.anInt4125 == local139) {
													local1298 = Static262.method3973(local139);
													if (local1298.aBoolean245 && local1298.anInt3816 != -1) {
														local1311 = Static296.method1376(local1298.anInt3816);
														local514 = local1311.anInt4349;
														if (local514 == 1) {
															local1502.anInt4169 = 0;
															local1502.anInt4158 = 1;
															local511 = false;
															local1502.anInt4188 = 0;
															local1502.anInt4144 = Static104.anInt2226 + local131;
															local1502.anInt4154 = 0;
															Static11.method188(false, local1311, local1502.anInt4141, local1502.anInt4113, local1502.anInt4188);
														} else if (local514 == 2) {
															local511 = false;
															local1502.anInt4112 = 0;
														}
													}
												} else {
													local1298 = Static262.method3973(local139);
													local1369 = Static262.method3973(local1502.anInt4125);
													if (local1298.anInt3816 != -1 && local1369.anInt3816 != -1) {
														local1386 = Static296.method1376(local1298.anInt3816);
														local1391 = Static296.method1376(local1369.anInt3816);
														if (local1391.anInt4358 > local1386.anInt4358) {
															local511 = false;
														}
													}
												}
											}
											if (local511) {
												local1502.anInt4125 = local139;
												local1502.anInt4158 = 1;
												local1502.anInt4187 = local149;
												local1502.anInt4144 = local131 + Static104.anInt2226;
												local1502.anInt4188 = 0;
												local1502.anInt4154 = 0;
												if (Static104.anInt2226 < local1502.anInt4144) {
													local1502.anInt4188 = -1;
												}
												if (local1502.anInt4125 == 65535) {
													local1502.anInt4125 = -1;
												}
												if (local1502.anInt4125 != -1 && Static104.anInt2226 == local1502.anInt4144) {
													local1454 = Static262.method3973(local1502.anInt4125).anInt3816;
													if (local1454 != -1) {
														local1311 = Static296.method1376(local1454);
														if (local1311 != null && local1311.anIntArray390 != null) {
															Static11.method188(Static239.aClass12_Sub3_Sub2_2 == local1502, local1311, local1502.anInt4141, local1502.anInt4113, 0);
														}
													}
												}
											}
										}
									}
								} else {
									local421 = local135 >> 28 & 0x3;
									local980 = (local135 >> 14 & 0x3FFF) - Static170.anInt3385;
									local437 = (local135 & 0x3FFF) - Static239.anInt4613;
									if (local980 >= 0 && local437 >= 0 && local980 < 104 && local437 < 104) {
										local437 = local437 * 128 + 64;
										local980 = local980 * 128 + 64;
										@Pc(1795) Class12_Sub1 local1795 = new Class12_Sub1(local139, local421, local980, local437, Static96.method1559(local421, local437, local980) - local149, local131, Static104.anInt2226);
										Static209.aClass10_61.method184(new Class4_Sub2_Sub7(local1795));
									}
								}
								Static92.anInt1908 = -1;
								return true;
							} else if (Static92.anInt1908 == 213 || Static92.anInt1908 == 172 || Static92.anInt1908 == 132 || Static92.anInt1908 == 81 || Static92.anInt1908 == 137 || Static92.anInt1908 == 211 || Static92.anInt1908 == 111 || Static92.anInt1908 == 6 || Static92.anInt1908 == 18 || Static92.anInt1908 == 214 || Static92.anInt1908 == 82 || Static92.anInt1908 == 76 || Static92.anInt1908 == 138 || Static92.anInt1908 == 130) {
								Static115.method1996();
								Static92.anInt1908 = -1;
								return true;
							} else if (Static92.anInt1908 == 4) {
								local131 = Static101.aClass4_Sub17_Sub1_4.method1896();
								local135 = Static101.aClass4_Sub17_Sub1_4.method1844();
								local139 = Static101.aClass4_Sub17_Sub1_4.method1869();
								if (Static30.method462(local131)) {
									Static68.method1046(local139, local135);
								}
								Static92.anInt1908 = -1;
								return true;
							} else if (Static92.anInt1908 == 10) {
								local380 = Static101.aClass4_Sub17_Sub1_4.method1864();
								local139 = Static101.aClass4_Sub17_Sub1_4.method1837();
								@Pc(1925) String local1925 = Static248.method3758(local139).method2879(Static101.aClass4_Sub17_Sub1_4);
								Static25.method381(local139, local1925, 19, Static211.method3379(local380), null);
								Static92.anInt1908 = -1;
								return true;
							} else if (Static92.anInt1908 == 136) {
								Static180.method2828();
								Static92.anInt1908 = -1;
								return false;
							} else if (Static92.anInt1908 == 227) {
								local131 = Static101.aClass4_Sub17_Sub1_4.method1872();
								local135 = Static101.aClass4_Sub17_Sub1_4.method1851();
								if (local135 == 65535) {
									local135 = -1;
								}
								Static292.method4342(local131, local135);
								Static92.anInt1908 = -1;
								return true;
							} else if (Static92.anInt1908 == 246) {
								local131 = Static101.aClass4_Sub17_Sub1_4.method1845();
								local135 = Static101.aClass4_Sub17_Sub1_4.method1851();
								if (local135 == 65535) {
									local135 = -1;
								}
								local139 = Static101.aClass4_Sub17_Sub1_4.method1882();
								Static270.method4034(local135, local139, local131);
								Static92.anInt1908 = -1;
								return true;
							} else if (Static92.anInt1908 == 32) {
								Static261.method3953();
								Static92.anInt1908 = -1;
								return true;
							} else if (Static92.anInt1908 == 79) {
								local131 = Static101.aClass4_Sub17_Sub1_4.method1896();
								local135 = Static101.aClass4_Sub17_Sub1_4.method1896();
								local139 = Static101.aClass4_Sub17_Sub1_4.method1889();
								if (local131 == 65535) {
									local131 = -1;
								}
								if (Static30.method462(local135)) {
									Static31.method473(local139, 1, -1, local131);
								}
								Static92.anInt1908 = -1;
								return true;
							} else if (Static92.anInt1908 == 24) {
								local131 = Static101.aClass4_Sub17_Sub1_4.method1851();
								local135 = Static101.aClass4_Sub17_Sub1_4.method1865();
								Static168.method2660(local131, local135);
								Static92.anInt1908 = -1;
								return true;
							} else if (Static92.anInt1908 == 97) {
								local131 = Static101.aClass4_Sub17_Sub1_4.method1889();
								@Pc(2090) Class22 local2090 = Static21.method3453(local131);
								for (local139 = 0; local139 < local2090.anIntArray63.length; local139++) {
									local2090.anIntArray63[local139] = -1;
									local2090.anIntArray63[local139] = 0;
								}
								Static81.method3274(local2090);
								Static92.anInt1908 = -1;
								return true;
							} else if (Static92.anInt1908 == 30) {
								local131 = Static101.aClass4_Sub17_Sub1_4.method1837();
								local135 = Static101.aClass4_Sub17_Sub1_4.method1874();
								local139 = Static101.aClass4_Sub17_Sub1_4.method1874();
								local149 = Static101.aClass4_Sub17_Sub1_4.method1837();
								local421 = Static101.aClass4_Sub17_Sub1_4.method1874();
								local980 = Static101.aClass4_Sub17_Sub1_4.method1874();
								if (Static30.method462(local131)) {
									Static142.method2312(local135, local421, local139, local980, local149);
								}
								Static92.anInt1908 = -1;
								return true;
							} else if (Static92.anInt1908 == 116) {
								local131 = Static101.aClass4_Sub17_Sub1_4.method1837();
								local135 = Static101.aClass4_Sub17_Sub1_4.method1874();
								local139 = Static101.aClass4_Sub17_Sub1_4.method1837();
								local149 = Static101.aClass4_Sub17_Sub1_4.method1874();
								if (local131 == 65535) {
									local131 = -1;
								}
								Static231.method3630(local131, local135, local149, local139);
								Static92.anInt1908 = -1;
								return true;
							} else if (Static92.anInt1908 == 11) {
								local131 = Static101.aClass4_Sub17_Sub1_4.method1837();
								local135 = Static101.aClass4_Sub17_Sub1_4.method1874();
								local139 = Static101.aClass4_Sub17_Sub1_4.method1874();
								local149 = Static101.aClass4_Sub17_Sub1_4.method1874();
								local421 = Static101.aClass4_Sub17_Sub1_4.method1874();
								local980 = Static101.aClass4_Sub17_Sub1_4.method1837();
								if (Static30.method462(local131)) {
									Static231.aBooleanArray21[local135] = true;
									Static279.anIntArray464[local135] = local139;
									Static201.anIntArray337[local135] = local149;
									Static93.anIntArray206[local135] = local421;
									Static89.anIntArray196[local135] = local980;
								}
								Static92.anInt1908 = -1;
								return true;
							} else if (Static92.anInt1908 == 229) {
								Static157.method2484();
								Static100.anInt2135 = Static101.aClass4_Sub17_Sub1_4.method1869();
								Static105.anInt2257 = Static177.anInt3485;
								Static92.anInt1908 = -1;
								return true;
							} else {
								@Pc(2306) long local2306;
								if (Static92.anInt1908 == 212) {
									local380 = Static101.aClass4_Sub17_Sub1_4.method1864();
									Static101.aClass4_Sub17_Sub1_4.method1892();
									local403 = Static101.aClass4_Sub17_Sub1_4.method1864();
									local587 = Static101.aClass4_Sub17_Sub1_4.method1837();
									local2306 = Static101.aClass4_Sub17_Sub1_4.method1835();
									local504 = Static101.aClass4_Sub17_Sub1_4.method1874();
									local514 = Static101.aClass4_Sub17_Sub1_4.method1837();
									@Pc(2316) boolean local2316 = false;
									@Pc(2322) long local2322 = local2306 + (local587 << 32);
									@Pc(2324) int local2324 = 0;
									label1345: while (true) {
										if (local2324 < 100) {
											if (Static243.aLongArray13[local2324] != local2322) {
												local2324++;
												continue;
											}
											local2316 = true;
											break;
										}
										if (local504 <= 1) {
											for (local2324 = 0; local2324 < Static297.anInt5497; local2324++) {
												if (Static126.aLongArray6[local2324] == local380) {
													local2316 = true;
													break label1345;
												}
											}
										}
										break;
									}
									if (!local2316 && Static116.anInt2585 == 0) {
										Static243.aLongArray13[Static54.anInt1070] = local2322;
										Static54.anInt1070 = (Static54.anInt1070 + 1) % 100;
										@Pc(2393) String local2393 = Static248.method3758(local514).method2879(Static101.aClass4_Sub17_Sub1_4);
										if (local504 == 2 || local504 == 3) {
											Static25.method381(local514, local2393, 20, "<img=1>" + Static211.method3379(local380), Static211.method3379(local403));
										} else if (local504 == 1) {
											Static25.method381(local514, local2393, 20, "<img=0>" + Static211.method3379(local380), Static211.method3379(local403));
										} else {
											Static25.method381(local514, local2393, 20, Static211.method3379(local380), Static211.method3379(local403));
										}
									}
									Static92.anInt1908 = -1;
									return true;
								} else if (Static92.anInt1908 == 37) {
									Static114.anInt2474 = Static101.aClass4_Sub17_Sub1_4.method1868() * 30;
									Static92.anInt1908 = -1;
									Static105.anInt2257 = Static177.anInt3485;
									return true;
								} else if (Static92.anInt1908 == 41) {
									if (Static55.aFrame2 != null) {
										Static82.method1277(false, Static116.anInt2573, -1, -1);
									}
									@Pc(2499) byte[] local2499 = new byte[Static131.anInt2781];
									Static101.aClass4_Sub17_Sub1_4.method1907(Static131.anInt2781, local2499);
									local1168 = Static259.method3911(Static131.anInt2781, 0, local2499);
									if (Static27.aFrame3 == null && (Static260.anInt4951 == 3 || !Static260.aString172.startsWith("win") || Static145.aBoolean193)) {
										Static275.method4103(local1168, true);
									} else {
										Static86.aString52 = local1168;
										Static55.aBoolean81 = true;
										Static119.aClass123_3 = Static87.aClass164_2.method3932(local1168);
									}
									Static92.anInt1908 = -1;
									return true;
								} else if (Static92.anInt1908 == 134) {
									local131 = Static101.aClass4_Sub17_Sub1_4.method1896();
									Static112.method1927(local131);
									Static273.anIntArray126[Static215.anInt4270++ & 0x1F] = local131 & 0x7FFF;
									Static92.anInt1908 = -1;
									return true;
								} else if (Static92.anInt1908 == 66) {
									local131 = Static101.aClass4_Sub17_Sub1_4.method1868();
									local135 = Static101.aClass4_Sub17_Sub1_4.method1837();
									local139 = Static101.aClass4_Sub17_Sub1_4.method1868();
									if (Static30.method462(local135)) {
										Static207.method3301(local139, local131);
									}
									Static92.anInt1908 = -1;
									return true;
								} else if (Static92.anInt1908 == 223) {
									local131 = Static101.aClass4_Sub17_Sub1_4.method1896();
									local135 = Static101.aClass4_Sub17_Sub1_4.method1844();
									local139 = Static101.aClass4_Sub17_Sub1_4.method1868();
									if (Static30.method462(local131)) {
										Static200.method3110(local135, local139);
									}
									Static92.anInt1908 = -1;
									return true;
								} else if (Static92.anInt1908 == 100) {
									local131 = Static101.aClass4_Sub17_Sub1_4.method1874();
									if (Static101.aClass4_Sub17_Sub1_4.method1874() == 0) {
										Static24.aClass101Array1[local131] = new Class101();
									} else {
										Static101.aClass4_Sub17_Sub1_4.anInt2400--;
										Static24.aClass101Array1[local131] = new Class101(Static101.aClass4_Sub17_Sub1_4);
									}
									Static92.anInt1908 = -1;
									Static28.anInt529 = Static177.anInt3485;
									return true;
								} else if (Static92.anInt1908 == 55) {
									local131 = Static101.aClass4_Sub17_Sub1_4.method1889();
									local135 = Static101.aClass4_Sub17_Sub1_4.method1837();
									if (local131 < -70000) {
										local135 += 32768;
									}
									if (local131 < 0) {
										local958 = null;
									} else {
										local958 = Static21.method3453(local131);
									}
									if (local958 != null) {
										for (local149 = 0; local149 < local958.anIntArray63.length; local149++) {
											local958.anIntArray63[local149] = 0;
											local958.anIntArray56[local149] = 0;
										}
									}
									Static281.method4241(local135);
									local149 = Static101.aClass4_Sub17_Sub1_4.method1837();
									for (local421 = 0; local421 < local149; local421++) {
										local980 = Static101.aClass4_Sub17_Sub1_4.method1882();
										if (local980 == 255) {
											local980 = Static101.aClass4_Sub17_Sub1_4.method1850();
										}
										local437 = Static101.aClass4_Sub17_Sub1_4.method1868();
										if (local958 != null && local421 < local958.anIntArray63.length) {
											local958.anIntArray63[local421] = local437;
											local958.anIntArray56[local421] = local980;
										}
										Static268.method4004(local980, local437 - 1, local135, local421);
									}
									if (local958 != null) {
										Static81.method3274(local958);
									}
									Static157.method2484();
									Static273.anIntArray126[Static215.anInt4270++ & 0x1F] = local135 & 0x7FFF;
									Static92.anInt1908 = -1;
									return true;
								} else if (Static92.anInt1908 == 160) {
									local131 = Static101.aClass4_Sub17_Sub1_4.method1837();
									local135 = Static101.aClass4_Sub17_Sub1_4.method1889();
									if (Static30.method462(local131)) {
										@Pc(2865) Class4_Sub10 local2865 = (Class4_Sub10) Static227.aClass97_16.method2360((long) local135);
										if (local2865 != null) {
											Static284.method4279(local2865, true);
										}
										if (Static32.aClass22_4 != null) {
											Static81.method3274(Static32.aClass22_4);
											Static32.aClass22_4 = null;
										}
									}
									Static92.anInt1908 = -1;
									return true;
								} else if (Static92.anInt1908 == 101) {
									local131 = Static101.aClass4_Sub17_Sub1_4.method1874();
									local135 = local131 >> 5;
									local139 = local131 & 0x1F;
									if (local139 == 0) {
										Static250.aClass7Array1[local135] = null;
										Static92.anInt1908 = -1;
										return true;
									}
									@Pc(2924) Class7 local2924 = new Class7();
									local2924.anInt135 = local139;
									local2924.anInt135 = local131 & 0x3F;
									local2924.anInt131 = Static101.aClass4_Sub17_Sub1_4.method1874();
									if (local2924.anInt131 >= 0 && Static39.aClass4_Sub2_Sub1Array12.length > local2924.anInt131) {
										if (local2924.anInt135 == 1 || local2924.anInt135 == 10) {
											local2924.anInt133 = Static101.aClass4_Sub17_Sub1_4.method1837();
											Static101.aClass4_Sub17_Sub1_4.anInt2400 += 5;
										} else if (local2924.anInt135 >= 2 && local2924.anInt135 <= 6) {
											if (local2924.anInt135 == 2) {
												local2924.anInt132 = 64;
												local2924.anInt138 = 64;
											}
											if (local2924.anInt135 == 3) {
												local2924.anInt132 = 64;
												local2924.anInt138 = 0;
											}
											if (local2924.anInt135 == 4) {
												local2924.anInt132 = 64;
												local2924.anInt138 = 128;
											}
											if (local2924.anInt135 == 5) {
												local2924.anInt132 = 0;
												local2924.anInt138 = 64;
											}
											if (local2924.anInt135 == 6) {
												local2924.anInt132 = 128;
												local2924.anInt138 = 64;
											}
											local2924.anInt135 = 2;
											local2924.anInt137 = Static101.aClass4_Sub17_Sub1_4.method1837();
											local2924.anInt139 = Static101.aClass4_Sub17_Sub1_4.method1837();
											local2924.anInt136 = Static101.aClass4_Sub17_Sub1_4.method1874();
											local2924.anInt130 = Static101.aClass4_Sub17_Sub1_4.method1837();
										}
										local2924.anInt140 = Static101.aClass4_Sub17_Sub1_4.method1837();
										if (local2924.anInt140 == 65535) {
											local2924.anInt140 = -1;
										}
										Static250.aClass7Array1[local135] = local2924;
									}
									Static92.anInt1908 = -1;
									return true;
								} else if (Static92.anInt1908 == 243) {
									local131 = Static101.aClass4_Sub17_Sub1_4.method1850();
									local135 = Static101.aClass4_Sub17_Sub1_4.method1868();
									Static168.method2660(local135, local131);
									Static92.anInt1908 = -1;
									return true;
								} else {
									@Pc(3139) boolean local3139;
									@Pc(3184) String local3184;
									@Pc(3122) String local3122;
									if (Static92.anInt1908 == 249) {
										local3122 = Static101.aClass4_Sub17_Sub1_4.method1841();
										if (local3122.endsWith(":tradereq:")) {
											local1168 = local3122.substring(0, local3122.indexOf(":"));
											local3139 = false;
											local403 = Static34.method491(local1168);
											for (local980 = 0; local980 < Static297.anInt5497; local980++) {
												if (local403 == Static126.aLongArray6[local980]) {
													local3139 = true;
													break;
												}
											}
											if (!local3139 && Static116.anInt2585 == 0) {
												Static271.method4062(Static255.aString166, 4, local1168);
											}
										} else if (local3122.endsWith(":chalreq:")) {
											local1168 = local3122.substring(0, local3122.indexOf(":"));
											local3139 = false;
											local403 = Static34.method491(local1168);
											for (local980 = 0; local980 < Static297.anInt5497; local980++) {
												if (Static126.aLongArray6[local980] == local403) {
													local3139 = true;
													break;
												}
											}
											if (!local3139 && Static116.anInt2585 == 0) {
												local3184 = local3122.substring(local3122.indexOf(":") + 1, local3122.length() + -9);
												Static271.method4062(local3184, 8, local1168);
											}
										} else if (local3122.endsWith(":assistreq:")) {
											local1168 = local3122.substring(0, local3122.indexOf(":"));
											local403 = Static34.method491(local1168);
											local3139 = false;
											for (local980 = 0; local980 < Static297.anInt5497; local980++) {
												if (Static126.aLongArray6[local980] == local403) {
													local3139 = true;
													break;
												}
											}
											if (!local3139 && Static116.anInt2585 == 0) {
												Static271.method4062("", 10, local1168);
											}
										} else if (local3122.endsWith(":clan:")) {
											local1168 = local3122.substring(0, local3122.indexOf(":clan:"));
											Static271.method4062(local1168, 11, "");
										} else if (local3122.endsWith(":trade:")) {
											local1168 = local3122.substring(0, local3122.indexOf(":trade:"));
											if (Static116.anInt2585 == 0) {
												Static271.method4062(local1168, 12, "");
											}
										} else if (local3122.endsWith(":assist:")) {
											local1168 = local3122.substring(0, local3122.indexOf(":assist:"));
											if (Static116.anInt2585 == 0) {
												Static271.method4062(local1168, 13, "");
											}
										} else if (local3122.endsWith(":duelstake:")) {
											local1168 = local3122.substring(0, local3122.indexOf(":"));
											local3139 = false;
											local403 = Static34.method491(local1168);
											for (local980 = 0; local980 < Static297.anInt5497; local980++) {
												if (local403 == Static126.aLongArray6[local980]) {
													local3139 = true;
													break;
												}
											}
											if (!local3139 && Static116.anInt2585 == 0) {
												Static271.method4062("", 14, local1168);
											}
										} else if (local3122.endsWith(":duelfriend:")) {
											local1168 = local3122.substring(0, local3122.indexOf(":"));
											local403 = Static34.method491(local1168);
											local3139 = false;
											for (local980 = 0; local980 < Static297.anInt5497; local980++) {
												if (Static126.aLongArray6[local980] == local403) {
													local3139 = true;
													break;
												}
											}
											if (!local3139 && Static116.anInt2585 == 0) {
												Static271.method4062("", 15, local1168);
											}
										} else if (local3122.endsWith(":clanreq:")) {
											local3139 = false;
											local1168 = local3122.substring(0, local3122.indexOf(":"));
											local403 = Static34.method491(local1168);
											for (local980 = 0; local980 < Static297.anInt5497; local980++) {
												if (Static126.aLongArray6[local980] == local403) {
													local3139 = true;
													break;
												}
											}
											if (!local3139 && Static116.anInt2585 == 0) {
												Static271.method4062("", 16, local1168);
											}
										} else if (local3122.endsWith(":allyreq:")) {
											local1168 = local3122.substring(0, local3122.indexOf(":"));
											local403 = Static34.method491(local1168);
											local3139 = false;
											for (local980 = 0; local980 < Static297.anInt5497; local980++) {
												if (local403 == Static126.aLongArray6[local980]) {
													local3139 = true;
													break;
												}
											}
											if (!local3139 && Static116.anInt2585 == 0) {
												local3184 = local3122.substring(local3122.indexOf(":") + 1, local3122.length() + -9);
												Static271.method4062(local3184, 21, local1168);
											}
										} else {
											Static271.method4062(local3122, 0, "");
										}
										Static92.anInt1908 = -1;
										return true;
									} else if (Static92.anInt1908 == 167) {
										local131 = Static101.aClass4_Sub17_Sub1_4.method1837();
										if (Static30.method462(local131)) {
											Static54.method873();
										}
										Static92.anInt1908 = -1;
										return true;
									} else {
										@Pc(3726) String local3726;
										if (Static92.anInt1908 == 102) {
											local380 = Static101.aClass4_Sub17_Sub1_4.method1864();
											local403 = Static101.aClass4_Sub17_Sub1_4.method1837();
											local587 = Static101.aClass4_Sub17_Sub1_4.method1835();
											local437 = Static101.aClass4_Sub17_Sub1_4.method1874();
											local1454 = Static101.aClass4_Sub17_Sub1_4.method1837();
											@Pc(3641) boolean local3641 = false;
											@Pc(3647) long local3647 = local587 + (local403 << 32);
											@Pc(3649) int local3649 = 0;
											label1651: while (true) {
												if (local3649 < 100) {
													if (local3647 != Static243.aLongArray13[local3649]) {
														local3649++;
														continue;
													}
													local3641 = true;
													break;
												}
												if (local437 <= 1) {
													for (local3649 = 0; local3649 < Static297.anInt5497; local3649++) {
														if (Static126.aLongArray6[local3649] == local380) {
															local3641 = true;
															break label1651;
														}
													}
												}
												break;
											}
											if (!local3641 && Static116.anInt2585 == 0) {
												Static243.aLongArray13[Static54.anInt1070] = local3647;
												Static54.anInt1070 = (Static54.anInt1070 + 1) % 100;
												local3726 = Static248.method3758(local1454).method2879(Static101.aClass4_Sub17_Sub1_4);
												if (local437 == 2) {
													Static25.method381(local1454, local3726, 18, "<img=1>" + Static211.method3379(local380), null);
												} else if (local437 == 1) {
													Static25.method381(local1454, local3726, 18, "<img=0>" + Static211.method3379(local380), null);
												} else {
													Static25.method381(local1454, local3726, 18, Static211.method3379(local380), null);
												}
											}
											Static92.anInt1908 = -1;
											return true;
										} else if (Static92.anInt1908 == 163) {
											Static233.anInt4547 = Static101.aClass4_Sub17_Sub1_4.method1872();
											Static161.anInt3201 = Static101.aClass4_Sub17_Sub1_4.method1882();
											Static92.anInt1908 = -1;
											return true;
										} else if (Static92.anInt1908 == 122) {
											local131 = Static101.aClass4_Sub17_Sub1_4.method1851();
											local135 = Static101.aClass4_Sub17_Sub1_4.method1865();
											local139 = Static101.aClass4_Sub17_Sub1_4.method1858();
											if (Static30.method462(local131)) {
												Static174.method2713(local139, local135);
											}
											Static92.anInt1908 = -1;
											return true;
										} else if (Static92.anInt1908 == 103) {
											Static297.anInt5497 = Static131.anInt2781 / 8;
											for (local131 = 0; local131 < Static297.anInt5497; local131++) {
												Static126.aLongArray6[local131] = Static101.aClass4_Sub17_Sub1_4.method1864();
												Static112.aStringArray18[local131] = Static151.method2420(Static126.aLongArray6[local131]);
												Static272.aBooleanArray25[local131] = false;
											}
											Static233.anInt4542 = Static177.anInt3485;
											Static92.anInt1908 = -1;
											return true;
										} else if (Static92.anInt1908 == 5) {
											local131 = Static101.aClass4_Sub17_Sub1_4.method1837();
											if (Static30.method462(local131)) {
												Static248.method3764();
											}
											Static92.anInt1908 = -1;
											return true;
										} else if (Static92.anInt1908 == 251) {
											local131 = Static101.aClass4_Sub17_Sub1_4.method1837();
											local135 = Static101.aClass4_Sub17_Sub1_4.method1850();
											local139 = Static101.aClass4_Sub17_Sub1_4.method1860();
											local149 = Static101.aClass4_Sub17_Sub1_4.method1869();
											if (Static30.method462(local131)) {
												Static184.method2878(local135, local149, local139);
											}
											Static92.anInt1908 = -1;
											return true;
										} else if (Static92.anInt1908 == 64) {
											local131 = Static101.aClass4_Sub17_Sub1_4.method1882();
											local135 = Static101.aClass4_Sub17_Sub1_4.method1868();
											local139 = Static101.aClass4_Sub17_Sub1_4.method1868();
											if (Static30.method462(local139)) {
												if (local131 == 2) {
													Static72.method1078();
												}
												Static25.anInt448 = local135;
												Static245.method3745(local135);
												Static161.method2519(false);
												Static170.method2676(Static25.anInt448);
												for (local149 = 0; local149 < 100; local149++) {
													Static222.aBooleanArray20[local149] = true;
												}
											}
											Static92.anInt1908 = -1;
											return true;
										} else if (Static92.anInt1908 == 248) {
											Static47.anInt949 = Static101.aClass4_Sub17_Sub1_4.method1874();
											Static92.anInt1908 = -1;
											return true;
										} else if (Static92.anInt1908 == 98) {
											Static43.method4376(true);
											Static92.anInt1908 = -1;
											return true;
										} else if (Static92.anInt1908 == 255) {
											local131 = Static101.aClass4_Sub17_Sub1_4.method1851();
											local135 = Static101.aClass4_Sub17_Sub1_4.method1851();
											@Pc(4027) byte local4027 = Static101.aClass4_Sub17_Sub1_4.method1894();
											if (Static30.method462(local135)) {
												Static105.method1725(local4027, local131);
											}
											Static92.anInt1908 = -1;
											return true;
										} else if (Static92.anInt1908 == 155) {
											for (local131 = 0; local131 < Static221.anIntArray393.length; local131++) {
												if (Static136.anIntArray250[local131] != Static221.anIntArray393[local131]) {
													Static221.anIntArray393[local131] = Static136.anIntArray250[local131];
													Static102.method1653(local131);
													Static102.anIntArray224[Static47.anInt944++ & 0x1F] = local131;
												}
											}
											Static92.anInt1908 = -1;
											return true;
										} else if (Static92.anInt1908 == 244) {
											Static81.anInt4013 = Static101.aClass4_Sub17_Sub1_4.method1874();
											Static233.anInt4542 = Static177.anInt3485;
											Static92.anInt1908 = -1;
											return true;
										} else if (Static92.anInt1908 == 127) {
											Static157.method2484();
											Static183.anInt3590 = Static101.aClass4_Sub17_Sub1_4.method1874();
											Static105.anInt2257 = Static177.anInt3485;
											Static92.anInt1908 = -1;
											return true;
										} else if (Static92.anInt1908 == 78) {
											Static165.method2605(Static87.aClass164_2, Static101.aClass4_Sub17_Sub1_4, Static131.anInt2781);
											Static92.anInt1908 = -1;
											return true;
										} else if (Static92.anInt1908 == 38) {
											local131 = Static101.aClass4_Sub17_Sub1_4.method1837();
											local1168 = Static101.aClass4_Sub17_Sub1_4.method1841();
											@Pc(4160) Object[] local4160 = new Object[local1168.length() + 1];
											for (local149 = local1168.length() - 1; local149 >= 0; local149--) {
												if (local1168.charAt(local149) == 's') {
													local4160[local149 + 1] = Static101.aClass4_Sub17_Sub1_4.method1841();
												} else {
													local4160[local149 + 1] = Integer.valueOf(Static101.aClass4_Sub17_Sub1_4.method1889());
												}
											}
											local4160[0] = Integer.valueOf(Static101.aClass4_Sub17_Sub1_4.method1889());
											if (Static30.method462(local131)) {
												@Pc(4214) Class4_Sub22 local4214 = new Class4_Sub22();
												local4214.anObjectArray32 = local4160;
												Static125.method2089(local4214);
											}
											Static92.anInt1908 = -1;
											return true;
										} else if (Static92.anInt1908 == 154) {
											local380 = Static101.aClass4_Sub17_Sub1_4.method1864();
											local139 = Static101.aClass4_Sub17_Sub1_4.method1837();
											@Pc(4239) byte local4239 = Static101.aClass4_Sub17_Sub1_4.method1892();
											local3139 = false;
											if ((local380 & Long.MIN_VALUE) != 0L) {
												local3139 = true;
											}
											if (local3139) {
												if (Static26.anInt478 == 0) {
													Static92.anInt1908 = -1;
													return true;
												}
												local380 &= Long.MAX_VALUE;
												for (local980 = 0; Static26.anInt478 > local980 && (Static83.aClass4_Sub16Array3[local980].aLong200 != local380 || Static83.aClass4_Sub16Array3[local980].anInt1957 != local139); local980++) {
												}
												if (local980 < Static26.anInt478) {
													while (local980 < Static26.anInt478 - 1) {
														Static83.aClass4_Sub16Array3[local980] = Static83.aClass4_Sub16Array3[local980 + 1];
														local980++;
													}
													Static26.anInt478--;
													Static83.aClass4_Sub16Array3[Static26.anInt478] = null;
												}
											} else {
												local3184 = Static101.aClass4_Sub17_Sub1_4.method1841();
												@Pc(4335) Class4_Sub16 local4335 = new Class4_Sub16();
												local4335.aLong200 = local380;
												local4335.aString59 = Static141.method2286(local4335.aLong200);
												local4335.anInt1957 = local139;
												local4335.aByte11 = local4239;
												local4335.aString58 = local3184;
												for (local1454 = Static26.anInt478 - 1; local1454 >= 0; local1454--) {
													local504 = Static83.aClass4_Sub16Array3[local1454].aString59.compareTo(local4335.aString59);
													if (local504 == 0) {
														Static83.aClass4_Sub16Array3[local1454].anInt1957 = local139;
														Static83.aClass4_Sub16Array3[local1454].aByte11 = local4239;
														Static83.aClass4_Sub16Array3[local1454].aString58 = local3184;
														Static159.anInt3170 = Static177.anInt3485;
														Static92.anInt1908 = -1;
														if (local380 == Static217.aLong158) {
															Static147.aByte12 = local4239;
														}
														return true;
													}
													if (local504 < 0) {
														break;
													}
												}
												if (Static26.anInt478 >= Static83.aClass4_Sub16Array3.length) {
													Static92.anInt1908 = -1;
													return true;
												}
												for (local504 = Static26.anInt478 - 1; local504 > local1454; local504--) {
													Static83.aClass4_Sub16Array3[local504 + 1] = Static83.aClass4_Sub16Array3[local504];
												}
												if (Static26.anInt478 == 0) {
													Static83.aClass4_Sub16Array3 = new Class4_Sub16[100];
												}
												Static83.aClass4_Sub16Array3[local1454 + 1] = local4335;
												if (local380 == Static217.aLong158) {
													Static147.aByte12 = local4239;
												}
												Static26.anInt478++;
											}
											Static92.anInt1908 = -1;
											Static159.anInt3170 = Static177.anInt3485;
											return true;
										} else if (Static92.anInt1908 == 196) {
											local131 = Static101.aClass4_Sub17_Sub1_4.method1844();
											local135 = Static101.aClass4_Sub17_Sub1_4.method1868();
											if (Static30.method462(local135)) {
												local139 = 0;
												if (Static239.aClass12_Sub3_Sub2_2.aClass143_1 != null) {
													local139 = Static239.aClass12_Sub3_Sub2_2.aClass143_1.method3571();
												}
												Static31.method473(local131, 3, -1, local139);
											}
											Static92.anInt1908 = -1;
											return true;
										} else if (Static92.anInt1908 == 180) {
											Static129.method2130();
											Static92.anInt1908 = -1;
											return true;
										} else if (Static92.anInt1908 == 8) {
											local131 = Static101.aClass4_Sub17_Sub1_4.method1844();
											Static248.aClass123_5 = Static87.aClass164_2.method3935(local131);
											Static92.anInt1908 = -1;
											return true;
										} else if (Static92.anInt1908 == 193) {
											for (local131 = 0; local131 < Static257.aClass12_Sub3_Sub2Array1.length; local131++) {
												if (Static257.aClass12_Sub3_Sub2Array1[local131] != null) {
													Static257.aClass12_Sub3_Sub2Array1[local131].anInt4178 = -1;
												}
											}
											for (local131 = 0; local131 < Static100.aClass12_Sub3_Sub1Array1.length; local131++) {
												if (Static100.aClass12_Sub3_Sub1Array1[local131] != null) {
													Static100.aClass12_Sub3_Sub1Array1[local131].anInt4178 = -1;
												}
											}
											Static92.anInt1908 = -1;
											return true;
										} else {
											@Pc(4668) Class4_Sub25 local4668;
											@Pc(4659) Class4_Sub25 local4659;
											if (Static92.anInt1908 == 72) {
												local131 = Static101.aClass4_Sub17_Sub1_4.method1844();
												local135 = Static101.aClass4_Sub17_Sub1_4.method1837();
												local139 = Static101.aClass4_Sub17_Sub1_4.method1837();
												local149 = Static101.aClass4_Sub17_Sub1_4.method1868();
												if (local139 == 65535) {
													local139 = -1;
												}
												local421 = Static101.aClass4_Sub17_Sub1_4.method1896();
												if (local149 == 65535) {
													local149 = -1;
												}
												if (Static30.method462(local135)) {
													for (local980 = local139; local980 <= local149; local980++) {
														local2306 = (long) local980 + ((long) local131 << 32);
														local4659 = (Class4_Sub25) Static294.aClass97_18.method2360(local2306);
														if (local4659 != null) {
															local4668 = new Class4_Sub25(local4659.anInt3558, local421);
															local4659.method4391();
														} else if (local980 == -1) {
															local4668 = new Class4_Sub25(Static21.method3453(local131).aClass4_Sub25_7.anInt3558, local421);
														} else {
															local4668 = new Class4_Sub25(0, local421);
														}
														Static294.aClass97_18.method2364(local4668, local2306);
													}
												}
												Static92.anInt1908 = -1;
												return true;
											} else if (Static92.anInt1908 == 198) {
												Static161.anInt3201 = Static101.aClass4_Sub17_Sub1_4.method1874();
												Static233.anInt4547 = Static101.aClass4_Sub17_Sub1_4.method1872();
												for (local131 = Static233.anInt4547; local131 < Static233.anInt4547 + 8; local131++) {
													for (local135 = Static161.anInt3201; local135 < Static161.anInt3201 + 8; local135++) {
														if (Static10.aClass10ArrayArrayArray1[Static210.anInt4103][local131][local135] != null) {
															Static10.aClass10ArrayArrayArray1[Static210.anInt4103][local131][local135] = null;
															Static261.method3957(local131, local135);
														}
													}
												}
												for (@Pc(4771) Class4_Sub30 local4771 = (Class4_Sub30) Static231.aClass10_47.method190(); local4771 != null; local4771 = (Class4_Sub30) Static231.aClass10_47.method191()) {
													if (Static233.anInt4547 <= local4771.anInt5329 && local4771.anInt5329 < Static233.anInt4547 + 8 && Static161.anInt3201 <= local4771.anInt5331 && Static161.anInt3201 + 8 > local4771.anInt5331 && Static210.anInt4103 == local4771.anInt5342) {
														local4771.anInt5335 = 0;
													}
												}
												Static92.anInt1908 = -1;
												return true;
											} else if (Static92.anInt1908 == 80) {
												Static47.anInt952 = Static101.aClass4_Sub17_Sub1_4.method1874();
												Static281.anInt5346 = Static101.aClass4_Sub17_Sub1_4.method1874();
												Static171.anInt3390 = Static101.aClass4_Sub17_Sub1_4.method1874();
												Static92.anInt1908 = -1;
												return true;
											} else if (Static92.anInt1908 == 252) {
												local131 = Static101.aClass4_Sub17_Sub1_4.method1844();
												local135 = Static101.aClass4_Sub17_Sub1_4.method1837();
												local139 = Static101.aClass4_Sub17_Sub1_4.method1844();
												if (Static30.method462(local135)) {
													@Pc(4882) Class4_Sub10 local4882 = (Class4_Sub10) Static227.aClass97_16.method2360((long) local131);
													local832 = (Class4_Sub10) Static227.aClass97_16.method2360((long) local139);
													if (local832 != null) {
														Static284.method4279(local832, local4882 == null || local4882.anInt1032 != local832.anInt1032);
													}
													if (local4882 != null) {
														local4882.method4391();
														Static227.aClass97_16.method2364(local4882, (long) local139);
													}
													@Pc(4924) Class22 local4924 = Static21.method3453(local131);
													if (local4924 != null) {
														Static81.method3274(local4924);
													}
													local4924 = Static21.method3453(local139);
													if (local4924 != null) {
														Static81.method3274(local4924);
														Static161.method2514(local4924, true);
													}
													if (Static25.anInt448 != -1) {
														Static114.method1938(Static25.anInt448, 1);
													}
												}
												Static92.anInt1908 = -1;
												return true;
											} else {
												@Pc(5203) String local5203;
												if (Static92.anInt1908 == 169) {
													local380 = Static101.aClass4_Sub17_Sub1_4.method1864();
													local139 = Static101.aClass4_Sub17_Sub1_4.method1837();
													local3139 = true;
													if (local380 < 0L) {
														local380 &= Long.MAX_VALUE;
														local3139 = false;
													}
													local149 = Static101.aClass4_Sub17_Sub1_4.method1874();
													local3184 = "";
													if (local139 > 0) {
														local3184 = Static101.aClass4_Sub17_Sub1_4.method1841();
													}
													@Pc(5006) String local5006 = Static211.method3379(local380);
													for (local1454 = 0; local1454 < Static231.anInt4525; local1454++) {
														if (Static153.aLongArray7[local1454] == local380) {
															if (local139 != Static131.anIntArray247[local1454]) {
																Static131.anIntArray247[local1454] = local139;
																if (local139 > 0) {
																	Static271.method4062(local5006 + Static105.aString67, 5, "");
																}
																if (local139 == 0) {
																	Static271.method4062(local5006 + Static191.aString180, 5, "");
																}
															}
															Static175.aStringArray28[local1454] = local3184;
															Static266.anIntArray447[local1454] = local149;
															Static176.aBooleanArray10[local1454] = local3139;
															local5006 = null;
															break;
														}
													}
													if (local5006 != null && Static231.anInt4525 < 200) {
														Static153.aLongArray7[Static231.anInt4525] = local380;
														Static196.aStringArray31[Static231.anInt4525] = local5006;
														Static131.anIntArray247[Static231.anInt4525] = local139;
														Static175.aStringArray28[Static231.anInt4525] = local3184;
														Static266.anIntArray447[Static231.anInt4525] = local149;
														Static176.aBooleanArray10[Static231.anInt4525] = local3139;
														Static231.anInt4525++;
													}
													Static233.anInt4542 = Static177.anInt3485;
													local504 = Static231.anInt4525;
													while (local504 > 0) {
														@Pc(5131) boolean local5131 = true;
														local504--;
														for (local514 = 0; local514 < local504; local514++) {
															if (Static131.anIntArray247[local514] != Static211.anInt4204 && Static131.anIntArray247[local514 + 1] == Static211.anInt4204 || Static131.anIntArray247[local514] == 0 && Static131.anIntArray247[local514 + 1] != 0) {
																local602 = Static131.anIntArray247[local514];
																Static131.anIntArray247[local514] = Static131.anIntArray247[local514 + 1];
																Static131.anIntArray247[local514 + 1] = local602;
																local5131 = false;
																local3726 = Static175.aStringArray28[local514];
																Static175.aStringArray28[local514] = Static175.aStringArray28[local514 + 1];
																Static175.aStringArray28[local514 + 1] = local3726;
																local5203 = Static196.aStringArray31[local514];
																Static196.aStringArray31[local514] = Static196.aStringArray31[local514 + 1];
																Static196.aStringArray31[local514 + 1] = local5203;
																@Pc(5221) long local5221 = Static153.aLongArray7[local514];
																Static153.aLongArray7[local514] = Static153.aLongArray7[local514 + 1];
																Static153.aLongArray7[local514 + 1] = local5221;
																@Pc(5239) int local5239 = Static266.anIntArray447[local514];
																Static266.anIntArray447[local514] = Static266.anIntArray447[local514 + 1];
																Static266.anIntArray447[local514 + 1] = local5239;
																@Pc(5257) boolean local5257 = Static176.aBooleanArray10[local514];
																Static176.aBooleanArray10[local514] = Static176.aBooleanArray10[local514 + 1];
																Static176.aBooleanArray10[local514 + 1] = local5257;
															}
														}
														if (local5131) {
															break;
														}
													}
													Static92.anInt1908 = -1;
													return true;
												} else if (Static92.anInt1908 == 16) {
													Static92.anInt1908 = -1;
													Static207.anInt4065 = 0;
													return true;
												} else if (Static92.anInt1908 == 12) {
													local131 = Static101.aClass4_Sub17_Sub1_4.method1851();
													local135 = Static101.aClass4_Sub17_Sub1_4.method1850();
													local139 = Static101.aClass4_Sub17_Sub1_4.method1851();
													local149 = Static101.aClass4_Sub17_Sub1_4.method1868();
													local421 = Static101.aClass4_Sub17_Sub1_4.method1896();
													if (Static30.method462(local131)) {
														Static67.method1038(local421, local139, local135, local149);
													}
													Static92.anInt1908 = -1;
													return true;
												} else if (Static92.anInt1908 == 109) {
													local131 = Static101.aClass4_Sub17_Sub1_4.method1837();
													@Pc(5344) byte local5344 = Static101.aClass4_Sub17_Sub1_4.method1892();
													Static93.method1502(local131, local5344);
													Static92.anInt1908 = -1;
													return true;
												} else if (Static92.anInt1908 == 242) {
													Static161.anInt3201 = Static101.aClass4_Sub17_Sub1_4.method1874();
													Static233.anInt4547 = Static101.aClass4_Sub17_Sub1_4.method1882();
													while (Static101.aClass4_Sub17_Sub1_4.anInt2400 < Static131.anInt2781) {
														Static92.anInt1908 = Static101.aClass4_Sub17_Sub1_4.method1874();
														Static115.method1996();
													}
													Static92.anInt1908 = -1;
													return true;
												} else if (Static92.anInt1908 == 90) {
													local131 = Static101.aClass4_Sub17_Sub1_4.method1837();
													local135 = Static101.aClass4_Sub17_Sub1_4.method1874();
													if (Static30.method462(local131)) {
														Static98.anInt2077 = local135;
													}
													Static92.anInt1908 = -1;
													return true;
												} else if (Static92.anInt1908 == 207) {
													local3122 = Static101.aClass4_Sub17_Sub1_4.method1841();
													local135 = Static101.aClass4_Sub17_Sub1_4.method1865();
													local139 = Static101.aClass4_Sub17_Sub1_4.method1837();
													if (local139 == 65535) {
														local139 = -1;
													}
													local149 = Static101.aClass4_Sub17_Sub1_4.method1874();
													if (local135 >= 1 && local135 <= 8) {
														if (local3122.equalsIgnoreCase("null")) {
															local3122 = null;
														}
														Static161.aStringArray25[local135 - 1] = local3122;
														Static61.anIntArray131[local135 - 1] = local139;
														Static205.aBooleanArray18[local135 - 1] = local149 == 0;
													}
													Static92.anInt1908 = -1;
													return true;
												} else if (Static92.anInt1908 == 2) {
													local380 = Static101.aClass4_Sub17_Sub1_4.method1864();
													Static101.aClass4_Sub17_Sub1_4.method1892();
													local403 = Static101.aClass4_Sub17_Sub1_4.method1864();
													@Pc(5505) boolean local5505 = false;
													local587 = Static101.aClass4_Sub17_Sub1_4.method1837();
													local2306 = Static101.aClass4_Sub17_Sub1_4.method1835();
													@Pc(5521) long local5521 = (local587 << 32) + local2306;
													local504 = Static101.aClass4_Sub17_Sub1_4.method1874();
													@Pc(5527) int local5527 = 0;
													label1571: while (true) {
														if (local5527 >= 100) {
															if (local504 <= 1) {
																if (Static263.aBoolean68 && !Static189.aBoolean321 || Static63.aBoolean91) {
																	local5505 = true;
																} else {
																	for (local5527 = 0; local5527 < Static297.anInt5497; local5527++) {
																		if (Static126.aLongArray6[local5527] == local380) {
																			local5505 = true;
																			break label1571;
																		}
																	}
																}
															}
															break;
														}
														if (local5521 == Static243.aLongArray13[local5527]) {
															local5505 = true;
															break;
														}
														local5527++;
													}
													if (!local5505 && Static116.anInt2585 == 0) {
														Static243.aLongArray13[Static54.anInt1070] = local5521;
														Static54.anInt1070 = (Static54.anInt1070 + 1) % 100;
														local5203 = Static293.method4172(Static168.method2663(Static217.method3494(Static101.aClass4_Sub17_Sub1_4)));
														if (local504 == 2 || local504 == 3) {
															Static243.method3718(local5203, Static211.method3379(local403), "<img=1>" + Static211.method3379(local380));
														} else if (local504 == 1) {
															Static243.method3718(local5203, Static211.method3379(local403), "<img=0>" + Static211.method3379(local380));
														} else {
															Static243.method3718(local5203, Static211.method3379(local403), Static211.method3379(local380));
														}
													}
													Static92.anInt1908 = -1;
													return true;
												} else if (Static92.anInt1908 == 92) {
													local131 = Static101.aClass4_Sub17_Sub1_4.method1837();
													local135 = Static101.aClass4_Sub17_Sub1_4.method1851();
													if (local131 == 65535) {
														local131 = -1;
													}
													local139 = Static101.aClass4_Sub17_Sub1_4.method1889();
													local149 = Static101.aClass4_Sub17_Sub1_4.method1851();
													local421 = Static101.aClass4_Sub17_Sub1_4.method1850();
													if (local135 == 65535) {
														local135 = -1;
													}
													if (Static30.method462(local149)) {
														for (local980 = local131; local980 <= local135; local980++) {
															local2306 = ((long) local421 << 32) + ((long) local980);
															local4659 = (Class4_Sub25) Static294.aClass97_18.method2360(local2306);
															if (local4659 != null) {
																local4668 = new Class4_Sub25(local139, local4659.anInt3559);
																local4659.method4391();
															} else if (local980 == -1) {
																local4668 = new Class4_Sub25(local139, Static21.method3453(local421).aClass4_Sub25_7.anInt3559);
															} else {
																local4668 = new Class4_Sub25(local139, -1);
															}
															Static294.aClass97_18.method2364(local4668, local2306);
														}
													}
													Static92.anInt1908 = -1;
													return true;
												} else if (Static92.anInt1908 == 143) {
													local380 = Static101.aClass4_Sub17_Sub1_4.method1864();
													local781 = Static293.method4172(Static168.method2663(Static217.method3494(Static101.aClass4_Sub17_Sub1_4)));
													Static271.method4062(local781, 6, Static211.method3379(local380));
													Static92.anInt1908 = -1;
													return true;
												} else if (Static92.anInt1908 == 168) {
													local131 = Static101.aClass4_Sub17_Sub1_4.method1882();
													local135 = Static101.aClass4_Sub17_Sub1_4.method1874();
													local139 = Static101.aClass4_Sub17_Sub1_4.method1882();
													Static210.anInt4103 = local131 >> 1;
													Static239.aClass12_Sub3_Sub2_2.method3383(local139, local135, (local131 & 0x1) == 1);
													Static92.anInt1908 = -1;
													return true;
												} else if (Static92.anInt1908 == 125) {
													Static101.aClass4_Sub17_Sub1_4.anInt2400 += 28;
													if (Static101.aClass4_Sub17_Sub1_4.method1840()) {
														Static171.method2689(Static101.aClass4_Sub17_Sub1_4, Static101.aClass4_Sub17_Sub1_4.anInt2400 - 28);
													}
													Static92.anInt1908 = -1;
													return true;
												} else if (Static92.anInt1908 == 39) {
													if (Static131.anInt2781 == 0) {
														Static217.aString138 = Static275.aString186;
													} else {
														Static217.aString138 = Static101.aClass4_Sub17_Sub1_4.method1841();
													}
													Static92.anInt1908 = -1;
													return true;
												} else if (Static92.anInt1908 == 142) {
													local131 = Static101.aClass4_Sub17_Sub1_4.method1844();
													local139 = local131 >> 14 & 0x3FFF;
													local135 = local131 >> 28 & 0x3;
													local421 = Static101.aClass4_Sub17_Sub1_4.method1896();
													local149 = local131 & 0x3FFF;
													if (local421 == 65535) {
														local421 = -1;
													}
													local980 = Static101.aClass4_Sub17_Sub1_4.method1872();
													local149 -= Static239.anInt4613;
													local437 = local980 >> 2;
													local139 -= Static170.anInt3385;
													local1454 = local980 & 0x3;
													local504 = Static262.anIntArray441[local437];
													Static35.method515(local149, local437, local135, local504, local421, local139, local1454);
													Static92.anInt1908 = -1;
													return true;
												} else if (Static92.anInt1908 == 177) {
													local131 = Static101.aClass4_Sub17_Sub1_4.method1889();
													local135 = Static101.aClass4_Sub17_Sub1_4.method1837();
													local139 = Static101.aClass4_Sub17_Sub1_4.method1851();
													local149 = Static101.aClass4_Sub17_Sub1_4.method1837();
													if (Static30.method462(local139)) {
														Static283.method4254(local131, local135 + (local149 << 16));
													}
													Static92.anInt1908 = -1;
													return true;
												} else if (Static92.anInt1908 == 45) {
													local131 = Static101.aClass4_Sub17_Sub1_4.method1858();
													local135 = Static101.aClass4_Sub17_Sub1_4.method1868();
													Static93.method1502(local135, local131);
													Static92.anInt1908 = -1;
													return true;
												} else if (Static92.anInt1908 == 58) {
													local131 = Static101.aClass4_Sub17_Sub1_4.method1837();
													local1168 = Static101.aClass4_Sub17_Sub1_4.method1841();
													local139 = Static101.aClass4_Sub17_Sub1_4.method1889();
													if (Static30.method462(local131)) {
														Static264.method3977(local1168, local139);
													}
													Static92.anInt1908 = -1;
													return true;
												} else {
													Static244.method3721("T1 - " + Static92.anInt1908 + "," + Static53.anInt1060 + "," + Static251.anInt4741 + " - " + Static131.anInt2781, null);
													Static180.method2828();
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
