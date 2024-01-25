import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!rj", name = "p", descriptor = "I")
	public static int anInt7527;

	@OriginalMember(owner = "client!rj", name = "j", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_122 = new Class40("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

	@OriginalMember(owner = "client!rj", name = "o", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_123 = new Class40("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIII)V")
	private static void method6101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class5_Sub2_Sub7 local8 = Static144.method2728(arg2, 10);
		local8.method1327();
		local8.anInt1437 = arg0;
		local8.anInt1433 = arg3;
		local8.anInt1434 = arg1;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!qa;Lclient!cea;III)V")
	public static void method6102(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class37 local12;
		if (arg3 < Static374.anInt6925) {
			local12 = Static152.aClass37ArrayArrayArray1[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass15_Sub5_1 != null && local12.aClass15_Sub5_1.method6861()) {
				arg1.method6859(true, 0, arg0, Static58.anInt1202, 0, local12.aClass15_Sub5_1);
			}
		}
		if (arg4 < Static374.anInt6925) {
			local12 = Static152.aClass37ArrayArrayArray1[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass15_Sub5_1 != null && local12.aClass15_Sub5_1.method6861()) {
				arg1.method6859(true, 0, arg0, 0, Static58.anInt1202, local12.aClass15_Sub5_1);
			}
		}
		if (arg3 < Static374.anInt6925 && arg4 < Static430.anInt7565) {
			local12 = Static152.aClass37ArrayArrayArray1[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass15_Sub5_1 != null && local12.aClass15_Sub5_1.method6861()) {
				arg1.method6859(true, 0, arg0, Static58.anInt1202, Static58.anInt1202, local12.aClass15_Sub5_1);
			}
		}
		if (arg3 < Static374.anInt6925 && arg4 > 0) {
			local12 = Static152.aClass37ArrayArrayArray1[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass15_Sub5_1 != null && local12.aClass15_Sub5_1.method6861()) {
				arg1.method6859(true, 0, arg0, Static58.anInt1202, -Static58.anInt1202, local12.aClass15_Sub5_1);
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)Z")
	public static boolean method6104() throws IOException {
		if (client.lb == null) {
			return false;
		}
		@Pc(75) int local75;
		if (Static13.aClass150_11 == null) {
			if (Static42.aBoolean40) {
				if (!client.lb.method4916(1)) {
					return false;
				}
				client.lb.method4918(0, 1, Static131.aClass5_Sub3_Sub1_1.aByteArray66);
				Static10.anInt168++;
				Static385.anInt7006 = 0;
				Static42.aBoolean40 = false;
			}
			Static131.aClass5_Sub3_Sub1_1.anInt4960 = 0;
			if (Static131.aClass5_Sub3_Sub1_1.method522()) {
				if (!client.lb.method4916(1)) {
					return false;
				}
				client.lb.method4918(1, 1, Static131.aClass5_Sub3_Sub1_1.aByteArray66);
				Static10.anInt168++;
				Static385.anInt7006 = 0;
			}
			Static42.aBoolean40 = true;
			@Pc(71) Class150[] local71 = Static365.method5577();
			local75 = Static131.aClass5_Sub3_Sub1_1.method531();
			if (local75 < 0 || local71.length <= local75) {
				throw new IOException("invo:" + local75 + " ip:" + Static131.aClass5_Sub3_Sub1_1.anInt4960);
			}
			Static13.aClass150_11 = local71[local75];
			Static319.anInt6170 = Static13.aClass150_11.anInt4152;
		}
		if (Static319.anInt6170 == -1) {
			if (!client.lb.method4916(1)) {
				return false;
			}
			client.lb.method4918(0, 1, Static131.aClass5_Sub3_Sub1_1.aByteArray66);
			Static319.anInt6170 = Static131.aClass5_Sub3_Sub1_1.aByteArray66[0] & 0xFF;
			Static385.anInt7006 = 0;
			Static10.anInt168++;
		}
		if (Static319.anInt6170 == -2) {
			if (!client.lb.method4916(2)) {
				return false;
			}
			client.lb.method4918(0, 2, Static131.aClass5_Sub3_Sub1_1.aByteArray66);
			Static131.aClass5_Sub3_Sub1_1.anInt4960 = 0;
			Static319.anInt6170 = Static131.aClass5_Sub3_Sub1_1.method4227();
			Static10.anInt168 += 2;
			Static385.anInt7006 = 0;
		}
		if (Static319.anInt6170 > 0) {
			if (!client.lb.method4916(Static319.anInt6170)) {
				return false;
			}
			Static131.aClass5_Sub3_Sub1_1.anInt4960 = 0;
			client.lb.method4918(0, Static319.anInt6170, Static131.aClass5_Sub3_Sub1_1.aByteArray66);
			Static385.anInt7006 = 0;
			Static10.anInt168 += Static319.anInt6170;
		}
		Static473.aClass150_200 = Static203.aClass150_90;
		Static203.aClass150_90 = Static448.aClass150_190;
		Static448.aClass150_190 = Static13.aClass150_11;
		@Pc(212) int local212;
		if (Static187.aClass150_85 == Static13.aClass150_11) {
			local212 = Static131.aClass5_Sub3_Sub1_1.method4230();
			Static10.aClass83_3 = Static159.aClass9_10.method283(local212);
			Static13.aClass150_11 = null;
			return true;
		}
		@Pc(255) int local255;
		@Pc(259) int local259;
		@Pc(243) String local243;
		@Pc(245) String local245;
		@Pc(239) boolean local239;
		@Pc(261) boolean local261;
		@Pc(284) String local284;
		if (Static342.aClass150_205 == Static13.aClass150_11) {
			local239 = Static131.aClass5_Sub3_Sub1_1.method4220() == 1;
			local243 = Static131.aClass5_Sub3_Sub1_1.method4234();
			local245 = local243;
			if (local239) {
				local245 = Static131.aClass5_Sub3_Sub1_1.method4234();
			}
			local255 = Static131.aClass5_Sub3_Sub1_1.method4220();
			local259 = Static131.aClass5_Sub3_Sub1_1.method4227();
			local261 = false;
			if (local255 <= 1 && Static359.method5523(local245)) {
				local261 = true;
			}
			if (!local261 && Static98.anInt2245 == 0) {
				local284 = Static166.aClass278_2.method6455(local259).method1998(Static131.aClass5_Sub3_Sub1_1);
				if (local255 == 2) {
					Static81.method1437(local284, 0, null, "<img=1>" + local243, local259, "<img=1>" + local245, 25);
				} else if (local255 == 1) {
					Static81.method1437(local284, 0, null, "<img=0>" + local243, local259, "<img=0>" + local245, 25);
				} else {
					Static81.method1437(local284, 0, null, local243, local259, local245, 25);
				}
			}
			Static13.aClass150_11 = null;
			return true;
		} else if (Static13.aClass150_11 == Static115.aClass150_61) {
			local212 = Static131.aClass5_Sub3_Sub1_1.method4183();
			local75 = Static131.aClass5_Sub3_Sub1_1.method4226();
			if (local75 == 255) {
				local212 = -1;
				local75 = -1;
			}
			Static349.method5427(local212, local75);
			Static13.aClass150_11 = null;
			return true;
		} else if (Static456.aClass150_193 == Static13.aClass150_11) {
			Static13.aClass150_11 = null;
			return false;
		} else if (Static527.aClass150_225 == Static13.aClass150_11) {
			local212 = Static131.aClass5_Sub3_Sub1_1.method4227();
			if (Static158.method2886(local212)) {
				Static398.method5797();
			}
			Static13.aClass150_11 = null;
			return true;
		} else if (Static248.aClass150_136 == Static13.aClass150_11) {
			Static484.method7248(Static22.aClass212_1);
			Static13.aClass150_11 = null;
			return true;
		} else {
			@Pc(470) int local470;
			@Pc(459) long local459;
			@Pc(464) long local464;
			@Pc(476) int local476;
			@Pc(486) int local486;
			if (Static13.aClass150_11 == Static390.aClass150_215) {
				local239 = Static131.aClass5_Sub3_Sub1_1.method4220() == 1;
				local243 = Static131.aClass5_Sub3_Sub1_1.method4234();
				local245 = local243;
				if (local239) {
					local245 = Static131.aClass5_Sub3_Sub1_1.method4234();
				}
				local459 = Static131.aClass5_Sub3_Sub1_1.method4227();
				local464 = Static131.aClass5_Sub3_Sub1_1.method4182();
				local470 = Static131.aClass5_Sub3_Sub1_1.method4220();
				local476 = Static131.aClass5_Sub3_Sub1_1.method4227();
				@Pc(482) long local482 = (local459 << 32) + local464;
				@Pc(484) boolean local484 = false;
				local486 = 0;
				while (true) {
					if (local486 >= 100) {
						if (local470 <= 1 && Static359.method5523(local245)) {
							local484 = true;
						}
						break;
					}
					if (local482 == Static252.aLongArray5[local486]) {
						local484 = true;
						break;
					}
					local486++;
				}
				if (!local484 && Static98.anInt2245 == 0) {
					Static252.aLongArray5[Static122.anInt2581] = local482;
					Static122.anInt2581 = (Static122.anInt2581 + 1) % 100;
					@Pc(539) String local539 = Static166.aClass278_2.method6455(local476).method1998(Static131.aClass5_Sub3_Sub1_1);
					if (local470 == 2) {
						Static81.method1437(local539, 0, null, "<img=1>" + local243, local476, "<img=1>" + local245, 18);
					} else if (local470 == 1) {
						Static81.method1437(local539, 0, null, "<img=0>" + local243, local476, "<img=0>" + local245, 18);
					} else {
						Static81.method1437(local539, 0, null, local243, local476, local245, 18);
					}
				}
				Static13.aClass150_11 = null;
				return true;
			} else if (Static13.aClass150_11 == Static464.aClass150_197) {
				local212 = Static131.aClass5_Sub3_Sub1_1.method4232();
				local75 = Static131.aClass5_Sub3_Sub1_1.method4194();
				if (Static158.method2886(local212)) {
					Static201.method3294(0, local75, 5, Static510.anInt8653);
				}
				Static13.aClass150_11 = null;
				return true;
			} else {
				@Pc(648) int local648;
				if (Static13.aClass150_11 == Static493.aClass150_207) {
					local212 = Static131.aClass5_Sub3_Sub1_1.method4205();
					local75 = Static131.aClass5_Sub3_Sub1_1.method4198();
					local648 = Static131.aClass5_Sub3_Sub1_1.method4205();
					if (Static158.method2886(local212)) {
						Static30.method697(local648, local75);
					}
					Static13.aClass150_11 = null;
					return true;
				} else if (Static244.aClass150_124 == Static13.aClass150_11) {
					local212 = Static131.aClass5_Sub3_Sub1_1.method4210();
					local75 = Static131.aClass5_Sub3_Sub1_1.method4194();
					local648 = Static131.aClass5_Sub3_Sub1_1.method4227();
					local255 = Static131.aClass5_Sub3_Sub1_1.method4210();
					if (Static158.method2886(local648)) {
						Static198.method3281(local255, local75, local212);
					}
					Static13.aClass150_11 = null;
					return true;
				} else {
					@Pc(711) String local711;
					@Pc(713) String local713;
					@Pc(737) String local737;
					if (Static68.aClass150_32 == Static13.aClass150_11) {
						local212 = Static131.aClass5_Sub3_Sub1_1.method4231();
						local75 = Static131.aClass5_Sub3_Sub1_1.method4230();
						local648 = Static131.aClass5_Sub3_Sub1_1.method4220();
						local711 = "";
						local713 = local711;
						if ((local648 & 0x1) != 0) {
							local711 = Static131.aClass5_Sub3_Sub1_1.method4234();
							if ((local648 & 0x2) == 0) {
								local713 = local711;
							} else {
								local713 = Static131.aClass5_Sub3_Sub1_1.method4234();
							}
						}
						local737 = Static131.aClass5_Sub3_Sub1_1.method4234();
						if (local212 == 99) {
							Static360.method5527(local737);
						} else if (local713.equals("") || !Static359.method5523(local713)) {
							Static328.method5200(local711, local75, local212, local737, local713);
						} else {
							Static13.aClass150_11 = null;
							return true;
						}
						Static13.aClass150_11 = null;
						return true;
					} else if (Static13.aClass150_11 == Static55.aClass150_28) {
						local212 = Static131.aClass5_Sub3_Sub1_1.method4220();
						local75 = Static131.aClass5_Sub3_Sub1_1.method4205();
						local648 = Static131.aClass5_Sub3_Sub1_1.method4194();
						if (Static158.method2886(local75)) {
							Static276.method4514(local648, local212);
						}
						Static13.aClass150_11 = null;
						return true;
					} else if (Static292.aClass150_141 == Static13.aClass150_11) {
						local212 = Static131.aClass5_Sub3_Sub1_1.method4227();
						if (Static158.method2886(local212)) {
							Static448.method6330();
						}
						Static13.aClass150_11 = null;
						return true;
					} else {
						@Pc(825) String local825;
						if (Static13.aClass150_11 == Static223.aClass150_101) {
							local825 = Static131.aClass5_Sub3_Sub1_1.method4234();
							local243 = Static144.method2730(Static115.method2243(Static131.aClass5_Sub3_Sub1_1));
							Static328.method5200(local825, 0, 6, local243, local825);
							Static13.aClass150_11 = null;
							return true;
						} else if (Static250.aClass150_126 == Static13.aClass150_11) {
							local212 = Static131.aClass5_Sub3_Sub1_1.method4198();
							local75 = Static131.aClass5_Sub3_Sub1_1.method4232();
							local648 = Static131.aClass5_Sub3_Sub1_1.method4202();
							if (Static158.method2886(local75)) {
								Static320.method5149(local648, local212);
							}
							Static13.aClass150_11 = null;
							return true;
						} else {
							@Pc(901) int local901;
							@Pc(889) boolean local889;
							if (Static35.aClass150_22 == Static13.aClass150_11) {
								local212 = Static131.aClass5_Sub3_Sub1_1.method4227();
								local75 = Static131.aClass5_Sub3_Sub1_1.method4220();
								local889 = (local75 & 0x1) == 1;
								while (Static131.aClass5_Sub3_Sub1_1.anInt4960 < Static319.anInt6170) {
									local255 = Static131.aClass5_Sub3_Sub1_1.method4231();
									local259 = Static131.aClass5_Sub3_Sub1_1.method4227();
									local901 = 0;
									if (local259 != 0) {
										local901 = Static131.aClass5_Sub3_Sub1_1.method4220();
										if (local901 == 255) {
											local901 = Static131.aClass5_Sub3_Sub1_1.method4230();
										}
									}
									Static369.method5021(local901, local259 - 1, local255, local212, local889);
								}
								Static161.anIntArray249[Static228.anInt4307++ & 0x1F] = local212;
								Static13.aClass150_11 = null;
								return true;
							} else if (Static390.aClass150_217 == Static13.aClass150_11) {
								local212 = Static131.aClass5_Sub3_Sub1_1.method4232();
								local75 = Static131.aClass5_Sub3_Sub1_1.method4194();
								local648 = Static131.aClass5_Sub3_Sub1_1.method4227();
								local255 = Static131.aClass5_Sub3_Sub1_1.method4227();
								local259 = Static131.aClass5_Sub3_Sub1_1.method4202();
								if (Static158.method2886(local259)) {
									Static201.method3294(local648, local75, 7, local255 << 16 | local212);
								}
								Static13.aClass150_11 = null;
								return true;
							} else if (Static13.aClass150_11 == Static314.aClass150_106) {
								Static270.method4455(true);
								Static13.aClass150_11 = null;
								return true;
							} else if (Static18.aClass150_19 == Static13.aClass150_11) {
								Static484.method7248(Static325.aClass212_15);
								Static13.aClass150_11 = null;
								return true;
							} else {
								@Pc(1061) long local1061;
								@Pc(1067) Class5_Sub11 local1067;
								@Pc(1076) Class5_Sub11 local1076;
								if (Static415.aClass150_185 == Static13.aClass150_11) {
									local212 = Static131.aClass5_Sub3_Sub1_1.method4232();
									local75 = Static131.aClass5_Sub3_Sub1_1.method4230();
									local648 = Static131.aClass5_Sub3_Sub1_1.method4202();
									if (local648 == 65535) {
										local648 = -1;
									}
									local255 = Static131.aClass5_Sub3_Sub1_1.method4202();
									local259 = Static131.aClass5_Sub3_Sub1_1.method4232();
									if (local259 == 65535) {
										local259 = -1;
									}
									if (Static158.method2886(local255)) {
										for (local901 = local648; local901 <= local259; local901++) {
											local1061 = ((long) local75 << 32) + (long) local901;
											local1067 = (Class5_Sub11) Static236.aClass42_17.method1109(local1061);
											if (local1067 != null) {
												local1076 = new Class5_Sub11(local1067.anInt2112, local212);
												local1067.method7425();
											} else if (local901 == -1) {
												local1076 = new Class5_Sub11(Static352.method5447(local75).aClass5_Sub11_1.anInt2112, local212);
											} else {
												local1076 = new Class5_Sub11(0, local212);
											}
											Static236.aClass42_17.method1106(local1061, local1076);
										}
									}
									Static13.aClass150_11 = null;
									return true;
								} else if (Static477.aClass150_201 == Static13.aClass150_11) {
									local212 = Static131.aClass5_Sub3_Sub1_1.method4205();
									local75 = Static131.aClass5_Sub3_Sub1_1.method4232();
									local648 = Static131.aClass5_Sub3_Sub1_1.method4198();
									if (Static158.method2886(local212)) {
										Static289.method4849(local648, local75);
									}
									Static13.aClass150_11 = null;
									return true;
								} else if (Static13.aClass150_11 == Static15.aClass150_14) {
									Static484.method7248(Static67.aClass212_18);
									Static13.aClass150_11 = null;
									return true;
								} else if (Static13.aClass150_11 == Static56.aClass150_29) {
									if (Static545.method7421(Static389.anInt7024)) {
										Static34.anInt869 = (int) ((float) Static131.aClass5_Sub3_Sub1_1.method4227() * 2.5F);
									} else {
										Static34.anInt869 = Static131.aClass5_Sub3_Sub1_1.method4227() * 30;
									}
									Static51.anInt1105 = Static356.anInt6716;
									Static13.aClass150_11 = null;
									return true;
								} else if (Static13.aClass150_11 == Static248.aClass150_137) {
									local212 = Static131.aClass5_Sub3_Sub1_1.method4227();
									local75 = Static131.aClass5_Sub3_Sub1_1.method4220();
									local648 = Static131.aClass5_Sub3_Sub1_1.method4220();
									local255 = Static131.aClass5_Sub3_Sub1_1.method4227() << 0;
									local259 = Static131.aClass5_Sub3_Sub1_1.method4220();
									local901 = Static131.aClass5_Sub3_Sub1_1.method4220();
									if (Static158.method2886(local212)) {
										Static410.method5972(local648, local259, local901, local75, local255);
									}
									Static13.aClass150_11 = null;
									return true;
								} else if (Static385.aClass150_173 == Static13.aClass150_11) {
									local239 = Static131.aClass5_Sub3_Sub1_1.method4220() == 1;
									@Pc(1250) byte[] local1250 = new byte[Static319.anInt6170 - 1];
									Static131.aClass5_Sub3_Sub1_1.method4177(local1250, Static319.anInt6170 - 1);
									Static541.method7394(local1250, local239);
									Static13.aClass150_11 = null;
									return true;
								} else if (Static356.aClass150_165 == Static13.aClass150_11) {
									Static16.anInt456 = Static131.aClass5_Sub3_Sub1_1.method4212();
									Static51.anInt1105 = Static356.anInt6716;
									Static13.aClass150_11 = null;
									return true;
								} else if (Static13.aClass150_11 == Static533.aClass150_227) {
									Static364.anInt6810 = Static131.aClass5_Sub3_Sub1_1.method4218();
									Static260.aBoolean605 = Static131.aClass5_Sub3_Sub1_1.method4220() == 1;
									Static13.aClass150_11 = null;
									return true;
								} else if (Static519.aClass150_222 == Static13.aClass150_11) {
									Static484.method7248(Static517.aClass212_17);
									Static13.aClass150_11 = null;
									return true;
								} else {
									@Pc(1359) int local1359;
									if (Static13.aClass150_11 == Static441.aClass150_189) {
										local212 = Static131.aClass5_Sub3_Sub1_1.method4227();
										local75 = Static131.aClass5_Sub3_Sub1_1.method4220();
										local889 = (local75 & 0x1) == 1;
										Static484.method7246(local889, local212);
										local255 = Static131.aClass5_Sub3_Sub1_1.method4227();
										for (local259 = 0; local259 < local255; local259++) {
											local901 = Static131.aClass5_Sub3_Sub1_1.method4205();
											local1359 = Static131.aClass5_Sub3_Sub1_1.method4220();
											if (local1359 == 255) {
												local1359 = Static131.aClass5_Sub3_Sub1_1.method4222();
											}
											Static369.method5021(local1359, local901 - 1, local259, local212, local889);
										}
										Static161.anIntArray249[Static228.anInt4307++ & 0x1F] = local212;
										Static13.aClass150_11 = null;
										return true;
									} else if (Static405.aClass150_181 == Static13.aClass150_11) {
										Static484.method7248(Static494.aClass212_16);
										Static13.aClass150_11 = null;
										return true;
									} else if (Static204.aClass150_92 == Static13.aClass150_11) {
										Static150.anInt3101 = Static131.aClass5_Sub3_Sub1_1.method4220();
										for (local212 = 0; local212 < Static150.anInt3101; local212++) {
											Static3.aStringArray3[local212] = Static131.aClass5_Sub3_Sub1_1.method4234();
											Static357.aStringArray30[local212] = Static131.aClass5_Sub3_Sub1_1.method4234();
											if (Static357.aStringArray30[local212].equals("")) {
												Static357.aStringArray30[local212] = Static3.aStringArray3[local212];
											}
											Static207.aStringArray20[local212] = Static131.aClass5_Sub3_Sub1_1.method4234();
											Static13.aStringArray6[local212] = Static131.aClass5_Sub3_Sub1_1.method4234();
											if (Static13.aStringArray6[local212].equals("")) {
												Static13.aStringArray6[local212] = Static207.aStringArray20[local212];
											}
											Static324.aBooleanArray22[local212] = false;
										}
										Static13.aClass150_11 = null;
										Static49.anInt1093 = Static356.anInt6716;
										return true;
									} else {
										@Pc(1526) boolean local1526;
										@Pc(1565) boolean local1565;
										if (Static247.aClass150_125 == Static13.aClass150_11) {
											while (Static131.aClass5_Sub3_Sub1_1.anInt4960 < Static319.anInt6170) {
												local239 = Static131.aClass5_Sub3_Sub1_1.method4220() == 1;
												local243 = Static131.aClass5_Sub3_Sub1_1.method4234();
												local245 = Static131.aClass5_Sub3_Sub1_1.method4234();
												local255 = Static131.aClass5_Sub3_Sub1_1.method4227();
												local259 = Static131.aClass5_Sub3_Sub1_1.method4220();
												local737 = "";
												local1526 = false;
												if (local255 > 0) {
													local737 = Static131.aClass5_Sub3_Sub1_1.method4234();
													local1526 = Static131.aClass5_Sub3_Sub1_1.method4220() == 1;
												}
												for (local470 = 0; local470 < Static59.anInt1208; local470++) {
													if (local239) {
														if (local245.equals(Static23.aStringArray7[local470])) {
															Static23.aStringArray7[local470] = local243;
															local243 = null;
															Static386.aStringArray18[local470] = local245;
															break;
														}
													} else if (local243.equals(Static23.aStringArray7[local470])) {
														if (Static361.anIntArray507[local470] != local255) {
															local1565 = true;
															for (@Pc(1570) Class30_Sub2_Sub2 local1570 = (Class30_Sub2_Sub2) Static66.aClass77_4.method2157(); local1570 != null; local1570 = (Class30_Sub2_Sub2) Static66.aClass77_4.method2160()) {
																if (local1570.aString54.equals(local243)) {
																	if (local255 != 0 && local1570.aShort69 == 0) {
																		local1570.method6004();
																		local1565 = false;
																	} else if (local255 == 0 && local1570.aShort69 != 0) {
																		local1570.method6004();
																		local1565 = false;
																	}
																}
															}
															if (local1565) {
																Static66.aClass77_4.method2165(new Class30_Sub2_Sub2(local243, local255));
															}
															Static361.anIntArray507[local470] = local255;
														}
														Static386.aStringArray18[local470] = local245;
														Static506.aStringArray37[local470] = local737;
														Static534.anIntArray686[local470] = local259;
														local243 = null;
														Static506.aBooleanArray36[local470] = local1526;
														break;
													}
												}
												if (local243 != null && Static59.anInt1208 < 200) {
													Static23.aStringArray7[Static59.anInt1208] = local243;
													Static386.aStringArray18[Static59.anInt1208] = local245;
													Static361.anIntArray507[Static59.anInt1208] = local255;
													Static506.aStringArray37[Static59.anInt1208] = local737;
													Static534.anIntArray686[Static59.anInt1208] = local259;
													Static506.aBooleanArray36[Static59.anInt1208] = local1526;
													Static59.anInt1208++;
												}
											}
											Static128.anInt2703 = 2;
											Static49.anInt1093 = Static356.anInt6716;
											local75 = Static59.anInt1208;
											while (local75 > 0) {
												local239 = true;
												local75--;
												for (local648 = 0; local648 < local75; local648++) {
													if (Static361.anIntArray507[local648] != Static212.aClass43_2.anInt1149 && Static361.anIntArray507[local648 + 1] == Static212.aClass43_2.anInt1149 || Static361.anIntArray507[local648] == 0 && Static361.anIntArray507[local648 + 1] != 0) {
														local255 = Static361.anIntArray507[local648];
														Static361.anIntArray507[local648] = Static361.anIntArray507[local648 + 1];
														Static361.anIntArray507[local648 + 1] = local255;
														local713 = Static506.aStringArray37[local648];
														Static506.aStringArray37[local648] = Static506.aStringArray37[local648 + 1];
														Static506.aStringArray37[local648 + 1] = local713;
														local737 = Static23.aStringArray7[local648];
														Static23.aStringArray7[local648] = Static23.aStringArray7[local648 + 1];
														Static23.aStringArray7[local648 + 1] = local737;
														local284 = Static386.aStringArray18[local648];
														Static386.aStringArray18[local648] = Static386.aStringArray18[local648 + 1];
														Static386.aStringArray18[local648 + 1] = local284;
														local470 = Static534.anIntArray686[local648];
														Static534.anIntArray686[local648] = Static534.anIntArray686[local648 + 1];
														Static534.anIntArray686[local648 + 1] = local470;
														local1565 = Static506.aBooleanArray36[local648];
														Static506.aBooleanArray36[local648] = Static506.aBooleanArray36[local648 + 1];
														local239 = false;
														Static506.aBooleanArray36[local648 + 1] = local1565;
													}
												}
												if (local239) {
													break;
												}
											}
											Static13.aClass150_11 = null;
											return true;
										}
										@Pc(1942) int local1942;
										@Pc(1938) long local1938;
										@Pc(1946) int local1946;
										if (Static13.aClass150_11 == Static208.aClass150_93) {
											local239 = Static131.aClass5_Sub3_Sub1_1.method4220() == 1;
											local243 = Static131.aClass5_Sub3_Sub1_1.method4234();
											local245 = local243;
											if (local239) {
												local245 = Static131.aClass5_Sub3_Sub1_1.method4234();
											}
											local459 = Static131.aClass5_Sub3_Sub1_1.method4172();
											local464 = Static131.aClass5_Sub3_Sub1_1.method4227();
											local1938 = Static131.aClass5_Sub3_Sub1_1.method4182();
											local1942 = Static131.aClass5_Sub3_Sub1_1.method4220();
											local1946 = Static131.aClass5_Sub3_Sub1_1.method4227();
											@Pc(1952) long local1952 = local1938 + (local464 << 32);
											@Pc(1954) boolean local1954 = false;
											@Pc(1956) int local1956 = 0;
											while (true) {
												if (local1956 >= 100) {
													if (local1942 <= 1 && Static359.method5523(local245)) {
														local1954 = true;
													}
													break;
												}
												if (Static252.aLongArray5[local1956] == local1952) {
													local1954 = true;
													break;
												}
												local1956++;
											}
											if (!local1954 && Static98.anInt2245 == 0) {
												Static252.aLongArray5[Static122.anInt2581] = local1952;
												Static122.anInt2581 = (Static122.anInt2581 + 1) % 100;
												@Pc(2014) String local2014 = Static166.aClass278_2.method6455(local1946).method1998(Static131.aClass5_Sub3_Sub1_1);
												if (local1942 == 2) {
													Static81.method1437(local2014, 0, Static504.method6951(local459), "<img=1>" + local243, local1946, "<img=1>" + local245, 20);
												} else if (local1942 == 1) {
													Static81.method1437(local2014, 0, Static504.method6951(local459), "<img=0>" + local243, local1946, "<img=0>" + local245, 20);
												} else {
													Static81.method1437(local2014, 0, Static504.method6951(local459), local243, local1946, local245, 20);
												}
											}
											Static13.aClass150_11 = null;
											return true;
										}
										@Pc(2145) int local2145;
										if (Static157.aClass150_75 == Static13.aClass150_11) {
											local239 = Static131.aClass5_Sub3_Sub1_1.method4220() == 1;
											local243 = Static131.aClass5_Sub3_Sub1_1.method4234();
											local245 = local243;
											if (local239) {
												local245 = Static131.aClass5_Sub3_Sub1_1.method4234();
											}
											local459 = Static131.aClass5_Sub3_Sub1_1.method4172();
											local464 = Static131.aClass5_Sub3_Sub1_1.method4227();
											local1938 = Static131.aClass5_Sub3_Sub1_1.method4182();
											local1942 = Static131.aClass5_Sub3_Sub1_1.method4220();
											@Pc(2141) long local2141 = local1938 + (local464 << 32);
											@Pc(2143) boolean local2143 = false;
											local2145 = 0;
											while (true) {
												if (local2145 >= 100) {
													if (local1942 <= 1) {
														if (Static260.aBoolean605 && !Static143.aBoolean200 || Static411.aBoolean519) {
															local2143 = true;
														} else if (Static359.method5523(local245)) {
															local2143 = true;
														}
													}
													break;
												}
												if (local2141 == Static252.aLongArray5[local2145]) {
													local2143 = true;
													break;
												}
												local2145++;
											}
											if (!local2143 && Static98.anInt2245 == 0) {
												Static252.aLongArray5[Static122.anInt2581] = local2141;
												Static122.anInt2581 = (Static122.anInt2581 + 1) % 100;
												@Pc(2207) String local2207 = Static144.method2730(Static115.method2243(Static131.aClass5_Sub3_Sub1_1));
												if (local1942 == 2 || local1942 == 3) {
													Static81.method1437(local2207, 0, Static504.method6951(local459), "<img=1>" + local243, -1, "<img=1>" + local245, 9);
												} else if (local1942 == 1) {
													Static81.method1437(local2207, 0, Static504.method6951(local459), "<img=0>" + local243, -1, "<img=0>" + local245, 9);
												} else {
													Static81.method1437(local2207, 0, Static504.method6951(local459), local243, -1, local245, 9);
												}
											}
											Static13.aClass150_11 = null;
											return true;
										} else if (Static13.aClass150_11 == Static110.aClass150_60) {
											local212 = Static131.aClass5_Sub3_Sub1_1.method4227();
											local75 = Static131.aClass5_Sub3_Sub1_1.method4194();
											local648 = Static131.aClass5_Sub3_Sub1_1.method4202();
											local255 = Static131.aClass5_Sub3_Sub1_1.method4202();
											local259 = Static131.aClass5_Sub3_Sub1_1.method4227();
											if (Static158.method2886(local648)) {
												Static84.method1459(local255, local75, local212, local259);
											}
											Static13.aClass150_11 = null;
											return true;
										} else if (Static13.aClass150_11 == Static414.aClass150_224) {
											local212 = Static131.aClass5_Sub3_Sub1_1.method4210();
											local75 = Static131.aClass5_Sub3_Sub1_1.method4230();
											local648 = Static131.aClass5_Sub3_Sub1_1.method4232();
											if (Static158.method2886(local648)) {
												Static334.method5756(local75, local212);
											}
											Static13.aClass150_11 = null;
											return true;
										} else if (Static347.aClass150_163 == Static13.aClass150_11) {
											Static151.anInt3118 = Static131.aClass5_Sub3_Sub1_1.method4220();
											Static51.anInt1105 = Static356.anInt6716;
											Static13.aClass150_11 = null;
											return true;
										} else if (Static13.aClass150_11 == Static187.aClass150_84) {
											local212 = Static131.aClass5_Sub3_Sub1_1.method4227();
											if (local212 == 65535) {
												local212 = -1;
											}
											local75 = Static131.aClass5_Sub3_Sub1_1.method4220();
											local648 = Static131.aClass5_Sub3_Sub1_1.method4227();
											local255 = Static131.aClass5_Sub3_Sub1_1.method4220();
											Static231.method3801(local212, local648, local255, local75);
											Static13.aClass150_11 = null;
											return true;
										} else if (Static13.aClass150_11 == Static137.aClass150_31) {
											local212 = Static131.aClass5_Sub3_Sub1_1.method4227();
											local75 = Static131.aClass5_Sub3_Sub1_1.method4232();
											local245 = Static131.aClass5_Sub3_Sub1_1.method4234();
											if (Static158.method2886(local212)) {
												Static228.method3767(local75, local245);
											}
											Static13.aClass150_11 = null;
											return true;
										} else if (Static13.aClass150_11 == Static321.aClass150_152) {
											local212 = Static131.aClass5_Sub3_Sub1_1.method4232();
											local75 = Static131.aClass5_Sub3_Sub1_1.method4230();
											local648 = Static131.aClass5_Sub3_Sub1_1.method4205();
											local255 = Static131.aClass5_Sub3_Sub1_1.method4227();
											if (Static158.method2886(local212)) {
												Static507.method6974(local255 + (local648 << 16), local75);
											}
											Static13.aClass150_11 = null;
											return true;
										} else if (Static390.aClass150_214 == Static13.aClass150_11) {
											local212 = Static131.aClass5_Sub3_Sub1_1.method4194();
											local75 = Static131.aClass5_Sub3_Sub1_1.method4230();
											local648 = Static131.aClass5_Sub3_Sub1_1.method4232();
											if (local648 == 65535) {
												local648 = -1;
											}
											local255 = Static131.aClass5_Sub3_Sub1_1.method4202();
											if (Static158.method2886(local255)) {
												Static330.method5212(local212, local75, local648);
												@Pc(2510) Class22 local2510 = Static451.aClass67_2.method2006(local648);
												Static84.method1459(local2510.anInt600, local75, local2510.anInt573, local2510.anInt562);
												method6101(local2510.anInt545, local2510.anInt591, local75, local2510.anInt585);
											}
											Static13.aClass150_11 = null;
											return true;
										} else if (Static17.aClass150_17 == Static13.aClass150_11) {
											local212 = Static131.aClass5_Sub3_Sub1_1.method4227();
											if (local212 == 65535) {
												local212 = -1;
											}
											local75 = Static131.aClass5_Sub3_Sub1_1.method4220();
											local648 = Static131.aClass5_Sub3_Sub1_1.method4227();
											local255 = Static131.aClass5_Sub3_Sub1_1.method4220();
											Static532.method7260(local212, local255, local75, local648);
											Static13.aClass150_11 = null;
											return true;
										} else if (Static191.aClass150_164 == Static13.aClass150_11) {
											Static484.method7248(Static118.aClass212_7);
											Static13.aClass150_11 = null;
											return true;
										} else if (Static522.aClass150_223 == Static13.aClass150_11) {
											Static484.method7248(Static86.aClass212_5);
											Static13.aClass150_11 = null;
											return true;
										} else if (Static173.aClass150_81 == Static13.aClass150_11) {
											local239 = Static131.aClass5_Sub3_Sub1_1.method4220() == 1;
											local243 = Static131.aClass5_Sub3_Sub1_1.method4234();
											local245 = local243;
											if (local239) {
												local245 = Static131.aClass5_Sub3_Sub1_1.method4234();
											}
											local255 = Static131.aClass5_Sub3_Sub1_1.method4220();
											@Pc(2620) boolean local2620 = false;
											if (local255 <= 1) {
												if (Static260.aBoolean605 && !Static143.aBoolean200 || Static411.aBoolean519) {
													local2620 = true;
												} else if (local255 <= 1 && Static359.method5523(local245)) {
													local2620 = true;
												}
											}
											if (!local2620 && Static98.anInt2245 == 0) {
												local737 = Static144.method2730(Static115.method2243(Static131.aClass5_Sub3_Sub1_1));
												if (local255 == 2) {
													Static81.method1437(local737, 0, null, "<img=1>" + local243, -1, "<img=1>" + local245, 24);
												} else if (local255 == 1) {
													Static81.method1437(local737, 0, null, "<img=0>" + local243, -1, "<img=0>" + local245, 24);
												} else {
													Static81.method1437(local737, 0, null, local243, -1, local245, 24);
												}
											}
											Static13.aClass150_11 = null;
											return true;
										} else if (Static315.aClass150_148 == Static13.aClass150_11) {
											Static484.method7248(Static236.aClass212_11);
											Static13.aClass150_11 = null;
											return true;
										} else if (Static16.aClass150_15 == Static13.aClass150_11) {
											local212 = Static131.aClass5_Sub3_Sub1_1.method4227();
											local75 = Static131.aClass5_Sub3_Sub1_1.method4220();
											local648 = Static131.aClass5_Sub3_Sub1_1.method4220();
											local255 = Static131.aClass5_Sub3_Sub1_1.method4227() << 0;
											local259 = Static131.aClass5_Sub3_Sub1_1.method4220();
											local901 = Static131.aClass5_Sub3_Sub1_1.method4220();
											if (Static158.method2886(local212)) {
												Static259.method4373(local648, local75, local259, local901, true, local255);
											}
											Static13.aClass150_11 = null;
											return true;
										} else if (Static417.aClass150_186 == Static13.aClass150_11) {
											Static484.method7248(Static276.aClass212_14);
											Static13.aClass150_11 = null;
											return true;
										} else if (Static13.aClass150_11 == Static337.aClass150_157) {
											local212 = Static131.aClass5_Sub3_Sub1_1.method4220();
											local75 = Static131.aClass5_Sub3_Sub1_1.method4232();
											Static540.aClass242_1.method5722(local212, local75);
											Static13.aClass150_11 = null;
											return true;
										} else if (Static365.aClass150_167 == Static13.aClass150_11) {
											Static484.method7248(Static230.aClass212_10);
											Static13.aClass150_11 = null;
											return true;
										} else if (Static13.aClass150_11 == Static336.aClass150_150) {
											local212 = Static131.aClass5_Sub3_Sub1_1.method4220();
											if (Static131.aClass5_Sub3_Sub1_1.method4220() == 0) {
												Static328.aClass315Array1[local212] = new Class315();
											} else {
												Static131.aClass5_Sub3_Sub1_1.anInt4960--;
												Static328.aClass315Array1[local212] = new Class315(Static131.aClass5_Sub3_Sub1_1);
											}
											Static13.aClass150_11 = null;
											Static370.anInt7927 = Static356.anInt6716;
											return true;
										} else if (Static222.aClass150_213 == Static13.aClass150_11) {
											local212 = Static131.aClass5_Sub3_Sub1_1.method4220();
											local75 = local212 >> 5;
											local648 = local212 & 0x1F;
											if (local648 == 0) {
												Static531.aClass34Array1[local75] = null;
												Static13.aClass150_11 = null;
												return true;
											}
											@Pc(2891) Class34 local2891 = new Class34();
											local2891.anInt976 = local648;
											local2891.anInt975 = Static131.aClass5_Sub3_Sub1_1.method4220();
											if (local2891.anInt975 >= 0 && Static438.aClass25Array16.length > local2891.anInt975) {
												if (local2891.anInt976 == 1 || local2891.anInt976 == 10) {
													local2891.anInt973 = Static131.aClass5_Sub3_Sub1_1.method4227();
													Static131.aClass5_Sub3_Sub1_1.anInt4960 += 6;
												} else if (local2891.anInt976 >= 2 && local2891.anInt976 <= 6) {
													if (local2891.anInt976 == 2) {
														local2891.anInt978 = 64;
														local2891.anInt972 = 64;
													}
													if (local2891.anInt976 == 3) {
														local2891.anInt972 = 64;
														local2891.anInt978 = 0;
													}
													if (local2891.anInt976 == 4) {
														local2891.anInt972 = 64;
														local2891.anInt978 = 128;
													}
													if (local2891.anInt976 == 5) {
														local2891.anInt978 = 64;
														local2891.anInt972 = 0;
													}
													if (local2891.anInt976 == 6) {
														local2891.anInt972 = 128;
														local2891.anInt978 = 64;
													}
													local2891.anInt976 = 2;
													local2891.anInt971 = Static131.aClass5_Sub3_Sub1_1.method4220();
													local2891.anInt978 += Static131.aClass5_Sub3_Sub1_1.method4227() - Static515.anInt3214 << 7;
													local2891.anInt972 += Static131.aClass5_Sub3_Sub1_1.method4227() - Static338.anInt6353 << 7;
													local2891.anInt977 = Static131.aClass5_Sub3_Sub1_1.method4220() << 0;
													local2891.anInt980 = Static131.aClass5_Sub3_Sub1_1.method4227();
												}
												local2891.anInt979 = Static131.aClass5_Sub3_Sub1_1.method4227();
												if (local2891.anInt979 == 65535) {
													local2891.anInt979 = -1;
												}
												Static531.aClass34Array1[local75] = local2891;
											}
											Static13.aClass150_11 = null;
											return true;
										} else {
											@Pc(3194) Class163 local3194;
											if (Static51.aClass150_27 == Static13.aClass150_11) {
												local825 = Static131.aClass5_Sub3_Sub1_1.method4234();
												local889 = Static131.aClass5_Sub3_Sub1_1.method4220() == 1;
												if (local889) {
													local243 = Static131.aClass5_Sub3_Sub1_1.method4234();
												} else {
													local243 = local825;
												}
												local255 = Static131.aClass5_Sub3_Sub1_1.method4227();
												@Pc(3107) byte local3107 = Static131.aClass5_Sub3_Sub1_1.method4196();
												local261 = false;
												if (local3107 == -128) {
													local261 = true;
												}
												if (local261) {
													if (Static280.anInt5465 == 0) {
														Static13.aClass150_11 = null;
														return true;
													}
													for (local1359 = 0; local1359 < Static280.anInt5465 && (!Static482.aClass163Array1[local1359].aString49.equals(local243) || local255 != Static482.aClass163Array1[local1359].anInt4833); local1359++) {
													}
													if (local1359 < Static280.anInt5465) {
														while (Static280.anInt5465 - 1 > local1359) {
															Static482.aClass163Array1[local1359] = Static482.aClass163Array1[local1359 + 1];
															local1359++;
														}
														Static280.anInt5465--;
														Static482.aClass163Array1[Static280.anInt5465] = null;
													}
												} else {
													local284 = Static131.aClass5_Sub3_Sub1_1.method4234();
													local3194 = new Class163();
													local3194.aString51 = local825;
													local3194.aString49 = local243;
													local3194.aString48 = Static86.method1503(local3194.aString49);
													local3194.aString50 = local284;
													local3194.aByte51 = local3107;
													local3194.anInt4833 = local255;
													for (local476 = Static280.anInt5465 - 1; local476 >= 0; local476--) {
														local1942 = Static482.aClass163Array1[local476].aString48.compareTo(local3194.aString48);
														if (local1942 == 0) {
															Static482.aClass163Array1[local476].anInt4833 = local255;
															Static482.aClass163Array1[local476].aByte51 = local3107;
															Static482.aClass163Array1[local476].aString50 = local284;
															if (local243.equals(Static35.aClass15_Sub2_Sub1_Sub1_1.aString18)) {
																Static138.aByte33 = local3107;
															}
															Static510.anInt8651 = Static356.anInt6716;
															Static13.aClass150_11 = null;
															return true;
														}
														if (local1942 < 0) {
															break;
														}
													}
													if (Static482.aClass163Array1.length <= Static280.anInt5465) {
														Static13.aClass150_11 = null;
														return true;
													}
													for (local1942 = Static280.anInt5465 - 1; local1942 > local476; local1942--) {
														Static482.aClass163Array1[local1942 + 1] = Static482.aClass163Array1[local1942];
													}
													if (Static280.anInt5465 == 0) {
														Static482.aClass163Array1 = new Class163[100];
													}
													Static482.aClass163Array1[local476 + 1] = local3194;
													Static280.anInt5465++;
													if (local243.equals(Static35.aClass15_Sub2_Sub1_Sub1_1.aString18)) {
														Static138.aByte33 = local3107;
													}
												}
												Static13.aClass150_11 = null;
												Static510.anInt8651 = Static356.anInt6716;
												return true;
											} else if (Static80.aClass150_38 == Static13.aClass150_11) {
												Static19.method6153(Static131.aClass5_Sub3_Sub1_1.method4234());
												Static13.aClass150_11 = null;
												return true;
											} else if (Static35.aClass150_23 == Static13.aClass150_11) {
												local212 = Static131.aClass5_Sub3_Sub1_1.method4205();
												if (local212 == 65535) {
													local212 = -1;
												}
												local75 = Static131.aClass5_Sub3_Sub1_1.method4183();
												local648 = Static131.aClass5_Sub3_Sub1_1.method4220();
												Static398.method5796(local648, local75, local212);
												Static13.aClass150_11 = null;
												return true;
											} else if (Static243.aClass150_123 == Static13.aClass150_11) {
												local212 = Static131.aClass5_Sub3_Sub1_1.method4205();
												if (local212 == 65535) {
													local212 = -1;
												}
												local75 = Static131.aClass5_Sub3_Sub1_1.method4182();
												local648 = Static131.aClass5_Sub3_Sub1_1.method4183();
												Static40.method855(local212, local75, local648);
												Static13.aClass150_11 = null;
												return true;
											} else if (Static13.aClass150_11 == Static451.aClass150_192) {
												local212 = Static131.aClass5_Sub3_Sub1_1.method4194();
												local75 = Static131.aClass5_Sub3_Sub1_1.method4227();
												if (Static158.method2886(local75)) {
													Static201.method3294(-1, local212, 3, -1);
												}
												Static13.aClass150_11 = null;
												return true;
											} else if (Static516.aClass150_218 == Static13.aClass150_11) {
												local212 = Static131.aClass5_Sub3_Sub1_1.method4227();
												local75 = Static131.aClass5_Sub3_Sub1_1.method4232();
												local648 = Static131.aClass5_Sub3_Sub1_1.method4232();
												if (Static158.method2886(local212)) {
													Static63.method1192(local648, local75);
												}
												Static13.aClass150_11 = null;
												return true;
											} else if (Static521.aClass150_221 == Static13.aClass150_11) {
												local825 = Static131.aClass5_Sub3_Sub1_1.method4234();
												local75 = Static131.aClass5_Sub3_Sub1_1.method4227();
												local245 = Static166.aClass278_2.method6455(local75).method1998(Static131.aClass5_Sub3_Sub1_1);
												Static81.method1437(local245, 0, null, local825, local75, local825, 19);
												Static13.aClass150_11 = null;
												return true;
											} else if (Static13.aClass150_11 == Static517.aClass150_219) {
												local212 = Static131.aClass5_Sub3_Sub1_1.method4205();
												local75 = Static131.aClass5_Sub3_Sub1_1.method4220();
												if (Static158.method2886(local212)) {
													Static508.anInt8632 = local75;
												}
												Static13.aClass150_11 = null;
												return true;
											} else if (Static13.aClass150_11 == Static542.aClass150_230) {
												local212 = Static131.aClass5_Sub3_Sub1_1.method4205();
												local75 = Static131.aClass5_Sub3_Sub1_1.method4205();
												local648 = Static131.aClass5_Sub3_Sub1_1.method4171();
												@Pc(3541) Class5_Sub51 local3541 = (Class5_Sub51) Static521.aClass42_42.method1109((long) local212);
												if (local3541 != null) {
													Static423.method6077(local3541.aClass15_Sub2_Sub1_Sub2_2, local648, local75);
												}
												Static13.aClass150_11 = null;
												return true;
											} else if (Static93.aClass150_50 == Static13.aClass150_11) {
												local212 = Static131.aClass5_Sub3_Sub1_1.method4198();
												local75 = Static131.aClass5_Sub3_Sub1_1.method4227();
												Static540.aClass242_1.method5722(local212, local75);
												Static13.aClass150_11 = null;
												return true;
											} else if (Static13.aClass150_11 == Static252.aClass150_127) {
												for (local212 = 0; local212 < Static10.aClass15_Sub2_Sub1_Sub1Array1.length; local212++) {
													if (Static10.aClass15_Sub2_Sub1_Sub1Array1[local212] != null) {
														Static10.aClass15_Sub2_Sub1_Sub1Array1[local212].anInt4711 = -1;
													}
												}
												for (local75 = 0; local75 < Static310.anInt6066; local75++) {
													Static275.aClass5_Sub51Array1[local75].aClass15_Sub2_Sub1_Sub2_2.anInt4711 = -1;
												}
												Static13.aClass150_11 = null;
												return true;
											} else if (Static293.aClass150_143 == Static13.aClass150_11) {
												Static13.aClass150_11 = null;
												Static128.anInt2703 = 1;
												Static49.anInt1093 = Static356.anInt6716;
												return true;
											} else if (Static183.aClass150_96 == Static13.aClass150_11) {
												local212 = Static131.aClass5_Sub3_Sub1_1.method4227();
												local243 = Static131.aClass5_Sub3_Sub1_1.method4234();
												local648 = Static131.aClass5_Sub3_Sub1_1.method4232();
												if (Static158.method2886(local648)) {
													Static228.method3767(local212, local243);
												}
												Static13.aClass150_11 = null;
												return true;
											} else if (Static41.aClass150_25 == Static13.aClass150_11) {
												local212 = Static131.aClass5_Sub3_Sub1_1.method4230();
												local75 = Static131.aClass5_Sub3_Sub1_1.method4232();
												local648 = Static131.aClass5_Sub3_Sub1_1.method4205();
												if (local648 == 65535) {
													local648 = -1;
												}
												local255 = Static131.aClass5_Sub3_Sub1_1.method4198();
												local259 = Static131.aClass5_Sub3_Sub1_1.method4205();
												if (local259 == 65535) {
													local259 = -1;
												}
												if (Static158.method2886(local75)) {
													for (local901 = local259; local901 <= local648; local901++) {
														local1061 = ((long) local212 << 32) + ((long) local901);
														local1067 = (Class5_Sub11) Static236.aClass42_17.method1109(local1061);
														if (local1067 != null) {
															local1076 = new Class5_Sub11(local255, local1067.anInt2105);
															local1067.method7425();
														} else if (local901 == -1) {
															local1076 = new Class5_Sub11(local255, Static352.method5447(local212).aClass5_Sub11_1.anInt2105);
														} else {
															local1076 = new Class5_Sub11(local255, -1);
														}
														Static236.aClass42_17.method1106(local1061, local1076);
													}
												}
												Static13.aClass150_11 = null;
												return true;
											} else if (Static13.aClass150_11 == Static515.aClass150_74) {
												Static140.anInt2860 = Static131.aClass5_Sub3_Sub1_1.method4196() << 3;
												Static142.anInt2982 = Static131.aClass5_Sub3_Sub1_1.method4183();
												Static397.anInt7135 = Static131.aClass5_Sub3_Sub1_1.method4188() << 3;
												while (Static131.aClass5_Sub3_Sub1_1.anInt4960 < Static319.anInt6170) {
													@Pc(3802) Class212 local3802 = Static120.method2292()[Static131.aClass5_Sub3_Sub1_1.method4220()];
													Static484.method7248(local3802);
												}
												Static13.aClass150_11 = null;
												return true;
											} else if (Static376.aClass150_170 == Static13.aClass150_11) {
												local212 = Static131.aClass5_Sub3_Sub1_1.method4227();
												local243 = Static131.aClass5_Sub3_Sub1_1.method4234();
												@Pc(3834) Object[] local3834 = new Object[local243.length() + 1];
												for (local255 = local243.length() - 1; local255 >= 0; local255--) {
													if (local243.charAt(local255) == 's') {
														local3834[local255 + 1] = Static131.aClass5_Sub3_Sub1_1.method4234();
													} else {
														local3834[local255 + 1] = Integer.valueOf(Static131.aClass5_Sub3_Sub1_1.method4230());
													}
												}
												local3834[0] = Integer.valueOf(Static131.aClass5_Sub3_Sub1_1.method4230());
												if (Static158.method2886(local212)) {
													@Pc(3892) Class5_Sub17 local3892 = new Class5_Sub17();
													local3892.anObjectArray3 = local3834;
													Static266.method4403(local3892);
												}
												Static13.aClass150_11 = null;
												return true;
											} else if (Static546.aClass150_231 == Static13.aClass150_11) {
												local212 = Static131.aClass5_Sub3_Sub1_1.method4194();
												local75 = Static131.aClass5_Sub3_Sub1_1.method4232();
												Static540.aClass242_1.method5723(local212, local75);
												Static13.aClass150_11 = null;
												return true;
											} else if (Static390.aClass150_216 == Static13.aClass150_11) {
												local212 = Static131.aClass5_Sub3_Sub1_1.method4202();
												if (local212 == 65535) {
													local212 = -1;
												}
												local75 = Static131.aClass5_Sub3_Sub1_1.method4183();
												local648 = local75 >> 2;
												local255 = local75 & 0x3;
												local259 = Static114.anIntArray215[local648];
												local901 = Static131.aClass5_Sub3_Sub1_1.method4198();
												local1359 = local901 >> 28 & 0x3;
												local470 = local901 >> 14 & 0x3FFF;
												local470 -= Static515.anInt3214;
												local476 = local901 & 0x3FFF;
												local476 -= Static338.anInt6353;
												Static164.method2919(local648, local212, local1359, local470, local255, local259, local476);
												Static13.aClass150_11 = null;
												return true;
											} else if (Static13.aClass150_11 == Static404.aClass150_180) {
												local212 = Static131.aClass5_Sub3_Sub1_1.method4232();
												if (local212 == 65535) {
													local212 = -1;
												}
												local75 = Static131.aClass5_Sub3_Sub1_1.method4230();
												local648 = Static131.aClass5_Sub3_Sub1_1.method4227();
												if (Static158.method2886(local648)) {
													Static201.method3294(-1, local75, 1, local212);
												}
												Static13.aClass150_11 = null;
												return true;
											} else if (Static289.aClass150_138 == Static13.aClass150_11) {
												local212 = Static131.aClass5_Sub3_Sub1_1.method4227();
												local75 = Static131.aClass5_Sub3_Sub1_1.method4230();
												if (Static158.method2886(local212)) {
													@Pc(4058) Class5_Sub43 local4058 = (Class5_Sub43) Static307.aClass42_24.method1109((long) local75);
													if (local4058 != null) {
														Static343.method5317(true, false, local4058);
													}
													if (Static381.aClass220_16 != null) {
														Static377.method5650(Static381.aClass220_16);
														Static381.aClass220_16 = null;
													}
												}
												Static13.aClass150_11 = null;
												return true;
											} else if (Static13.aClass150_11 == Static535.aClass150_228) {
												local212 = Static131.aClass5_Sub3_Sub1_1.method4205();
												local75 = Static131.aClass5_Sub3_Sub1_1.method4222();
												local648 = Static131.aClass5_Sub3_Sub1_1.method4232();
												local255 = Static131.aClass5_Sub3_Sub1_1.method4222();
												if (Static158.method2886(local648)) {
													Static201.method3294(local255, local75, 5, local212);
												}
												Static13.aClass150_11 = null;
												return true;
											} else if (Static13.aClass150_11 == Static396.aClass150_232) {
												Static510.anInt8651 = Static356.anInt6716;
												if (Static319.anInt6170 == 0) {
													Static13.aClass150_11 = null;
													Static280.anInt5465 = 0;
													Static42.aString22 = null;
													Static264.aString53 = null;
													Static482.aClass163Array1 = null;
													return true;
												}
												Static42.aString22 = Static131.aClass5_Sub3_Sub1_1.method4234();
												local239 = Static131.aClass5_Sub3_Sub1_1.method4220() == 1;
												if (local239) {
													Static131.aClass5_Sub3_Sub1_1.method4234();
												}
												@Pc(4160) long local4160 = Static131.aClass5_Sub3_Sub1_1.method4172();
												Static264.aString53 = Static193.method3234(local4160);
												Static276.aByte55 = Static131.aClass5_Sub3_Sub1_1.method4196();
												local255 = Static131.aClass5_Sub3_Sub1_1.method4220();
												if (local255 == 255) {
													Static13.aClass150_11 = null;
													return true;
												}
												Static280.anInt5465 = local255;
												@Pc(4186) Class163[] local4186 = new Class163[100];
												for (local901 = 0; local901 < Static280.anInt5465; local901++) {
													local4186[local901] = new Class163();
													local4186[local901].aString51 = Static131.aClass5_Sub3_Sub1_1.method4234();
													local239 = Static131.aClass5_Sub3_Sub1_1.method4220() == 1;
													if (local239) {
														local4186[local901].aString49 = Static131.aClass5_Sub3_Sub1_1.method4234();
													} else {
														local4186[local901].aString49 = local4186[local901].aString51;
													}
													local4186[local901].aString48 = Static86.method1503(local4186[local901].aString49);
													local4186[local901].anInt4833 = Static131.aClass5_Sub3_Sub1_1.method4227();
													local4186[local901].aByte51 = Static131.aClass5_Sub3_Sub1_1.method4196();
													local4186[local901].aString50 = Static131.aClass5_Sub3_Sub1_1.method4234();
													if (local4186[local901].aString49.equals(Static35.aClass15_Sub2_Sub1_Sub1_1.aString18)) {
														Static138.aByte33 = local4186[local901].aByte51;
													}
												}
												local476 = Static280.anInt5465;
												while (local476 > 0) {
													local1526 = true;
													local476--;
													for (local1942 = 0; local1942 < local476; local1942++) {
														if (local4186[local1942].aString48.compareTo(local4186[local1942 + 1].aString48) > 0) {
															local3194 = local4186[local1942];
															local4186[local1942] = local4186[local1942 + 1];
															local1526 = false;
															local4186[local1942 + 1] = local3194;
														}
													}
													if (local1526) {
														break;
													}
												}
												Static482.aClass163Array1 = local4186;
												Static13.aClass150_11 = null;
												return true;
											} else {
												@Pc(4895) int local4895;
												if (Static13.aClass150_11 == Static17.aClass150_16) {
													local212 = Static131.aClass5_Sub3_Sub1_1.method4202();
													local75 = Static131.aClass5_Sub3_Sub1_1.method4171();
													local648 = Static131.aClass5_Sub3_Sub1_1.method4227();
													local255 = Static131.aClass5_Sub3_Sub1_1.method4198();
													local259 = Static131.aClass5_Sub3_Sub1_1.method4205();
													local261 = (local75 & 0x80) != 0;
													if (local255 >> 30 == 0) {
														@Pc(4504) Class31 local4504;
														@Pc(4510) Class31 local4510;
														@Pc(4489) Class48 local4489;
														if (local255 >> 29 != 0) {
															local1359 = local255 & 0xFFFF;
															@Pc(4726) Class5_Sub51 local4726 = (Class5_Sub51) Static521.aClass42_42.method1109((long) local1359);
															if (local4726 != null) {
																if (local259 == 65535) {
																	local259 = -1;
																}
																@Pc(4736) Class15_Sub2_Sub1_Sub2 local4736 = local4726.aClass15_Sub2_Sub1_Sub2_2;
																@Pc(4738) boolean local4738 = true;
																local1946 = local261 ? local4736.anInt4715 : local4736.anInt4689;
																if (local259 != -1 && local1946 != -1) {
																	if (local1946 == local259) {
																		local4489 = Static501.aClass41_2.method1068(local259);
																		if (local4489.aBoolean68 && local4489.anInt1218 != -1) {
																			local4504 = Static155.aClass76_2.method2152(local4489.anInt1218);
																			local2145 = local4504.anInt923;
																			if (local2145 == 0 || local2145 == 2) {
																				local4738 = false;
																			} else if (local2145 == 1) {
																				local4738 = true;
																			}
																		}
																	} else {
																		local4489 = Static501.aClass41_2.method1068(local259);
																		@Pc(4771) Class48 local4771 = Static501.aClass41_2.method1068(local1946);
																		if (local4489.anInt1218 != -1 && local4771.anInt1218 != -1) {
																			local4510 = Static155.aClass76_2.method2152(local4489.anInt1218);
																			@Pc(4791) Class31 local4791 = Static155.aClass76_2.method2152(local4771.anInt1218);
																			if (local4791.anInt933 > local4510.anInt933) {
																				local4738 = false;
																			}
																		}
																	}
																}
																if (local4738) {
																	if (local261) {
																		local4736.anInt4710 = 0;
																		local4736.anInt4728 = 0;
																		local4736.anInt4727 = local75 & 0x7;
																		local4736.anInt4750 = 1;
																		local4736.anInt4706 = local648;
																		local4736.anInt4708 = Static481.anInt8318 + local212;
																		local4736.anInt4715 = local259;
																		if (Static481.anInt8318 < local4736.anInt4708) {
																			local4736.anInt4728 = -1;
																		}
																		if (local4736.anInt4715 != -1 && local4736.anInt4708 == Static481.anInt8318) {
																			local4895 = Static501.aClass41_2.method1068(local4736.anInt4715).anInt1218;
																			if (local4895 != -1) {
																				local4504 = Static155.aClass76_2.method2152(local4895);
																				if (local4504 != null && local4504.anIntArray69 != null) {
																					Static279.method4554(false, local4736.anInt8493, 0, local4504, local4736.anInt8492, local4736.aByte91);
																				}
																			}
																		}
																	} else {
																		local4736.anInt4699 = local648;
																		local4736.anInt4685 = Static481.anInt8318 + local212;
																		local4736.anInt4702 = local75 & 0x7;
																		local4736.anInt4726 = 1;
																		local4736.anInt4689 = local259;
																		local4736.anInt4694 = 0;
																		local4736.anInt4744 = 0;
																		if (local4736.anInt4685 > Static481.anInt8318) {
																			local4736.anInt4744 = -1;
																		}
																		if (local4736.anInt4689 != -1 && Static481.anInt8318 == local4736.anInt4685) {
																			local4895 = Static501.aClass41_2.method1068(local4736.anInt4689).anInt1218;
																			if (local4895 != -1) {
																				local4504 = Static155.aClass76_2.method2152(local4895);
																				if (local4504 != null && local4504.anIntArray69 != null) {
																					Static279.method4554(false, local4736.anInt8493, 0, local4504, local4736.anInt8492, local4736.aByte91);
																				}
																			}
																		}
																	}
																}
															}
														} else if (local255 >> 28 != 0) {
															local1359 = local255 & 0xFFFF;
															@Pc(4405) Class15_Sub2_Sub1_Sub1 local4405;
															if (Static510.anInt8653 == local1359) {
																local4405 = Static35.aClass15_Sub2_Sub1_Sub1_1;
															} else {
																local4405 = Static10.aClass15_Sub2_Sub1_Sub1Array1[local1359];
															}
															if (local4405 != null) {
																if (local259 == 65535) {
																	local259 = -1;
																}
																local1565 = true;
																local1942 = local261 ? local4405.anInt4715 : local4405.anInt4689;
																@Pc(4458) Class31 local4458;
																if (local259 != -1 && local1942 != -1) {
																	@Pc(4444) Class48 local4444;
																	if (local259 == local1942) {
																		local4444 = Static501.aClass41_2.method1068(local259);
																		if (local4444.aBoolean68 && local4444.anInt1218 != -1) {
																			local4458 = Static155.aClass76_2.method2152(local4444.anInt1218);
																			local486 = local4458.anInt923;
																			if (local486 == 0 || local486 == 2) {
																				local1565 = false;
																			} else if (local486 == 1) {
																				local1565 = true;
																			}
																		}
																	} else {
																		local4444 = Static501.aClass41_2.method1068(local259);
																		local4489 = Static501.aClass41_2.method1068(local1942);
																		if (local4444.anInt1218 != -1 && local4489.anInt1218 != -1) {
																			local4504 = Static155.aClass76_2.method2152(local4444.anInt1218);
																			local4510 = Static155.aClass76_2.method2152(local4489.anInt1218);
																			if (local4504.anInt933 < local4510.anInt933) {
																				local1565 = false;
																			}
																		}
																	}
																}
																if (local1565) {
																	if (local261) {
																		local4405.anInt4708 = Static481.anInt8318 + local212;
																		local4405.anInt4750 = 1;
																		local4405.anInt4706 = local648;
																		local4405.anInt4727 = local75 & 0x7;
																		local4405.anInt4710 = 0;
																		local4405.anInt4715 = local259;
																		local4405.anInt4728 = 0;
																		if (local4405.anInt4715 == 65535) {
																			local4405.anInt4715 = -1;
																		}
																		if (Static481.anInt8318 < local4405.anInt4708) {
																			local4405.anInt4728 = -1;
																		}
																		if (local4405.anInt4715 != -1 && Static481.anInt8318 == local4405.anInt4708) {
																			local1946 = Static501.aClass41_2.method1068(local4405.anInt4715).anInt1218;
																			if (local1946 != -1) {
																				local4458 = Static155.aClass76_2.method2152(local1946);
																				if (local4458 != null && local4458.anIntArray69 != null) {
																					Static279.method4554(Static35.aClass15_Sub2_Sub1_Sub1_1 == local4405, local4405.anInt8493, 0, local4458, local4405.anInt8492, local4405.aByte91);
																				}
																			}
																		}
																	} else {
																		local4405.anInt4699 = local648;
																		local4405.anInt4744 = 0;
																		local4405.anInt4689 = local259;
																		local4405.anInt4694 = 0;
																		local4405.anInt4685 = Static481.anInt8318 + local212;
																		local4405.anInt4726 = 1;
																		local4405.anInt4702 = local75 & 0x7;
																		if (local4405.anInt4685 > Static481.anInt8318) {
																			local4405.anInt4744 = -1;
																		}
																		if (local4405.anInt4689 == 65535) {
																			local4405.anInt4689 = -1;
																		}
																		if (local4405.anInt4689 != -1 && Static481.anInt8318 == local4405.anInt4685) {
																			local1946 = Static501.aClass41_2.method1068(local4405.anInt4689).anInt1218;
																			if (local1946 != -1) {
																				local4458 = Static155.aClass76_2.method2152(local1946);
																				if (local4458 != null && local4458.anIntArray69 != null) {
																					Static279.method4554(local4405 == Static35.aClass15_Sub2_Sub1_Sub1_1, local4405.anInt8493, 0, local4458, local4405.anInt8492, local4405.aByte91);
																				}
																			}
																		}
																	}
																}
															}
														}
													} else {
														local1359 = local255 >> 28 & 0x3;
														local470 = (local255 >> 14 & 0x3FFF) - Static515.anInt3214;
														local476 = (local255 & 0x3FFF) - Static338.anInt6353;
														if (local470 >= 0 && local476 >= 0 && local470 < Static460.anInt7894 && local476 < Static235.anInt4493) {
															local1942 = local470 * 128 + 64;
															local1946 = local476 * 128 + 64;
															local4895 = local1359;
															if (local1359 < 3 && Static279.method4553(local476, local470)) {
																local4895 = local1359 + 1;
															}
															@Pc(5092) Class15_Sub2_Sub5 local5092 = new Class15_Sub2_Sub5(local259, 0, Static481.anInt8318, local1359, local4895, local1942, Static191.method5464(local1942, local1946, local1359) - local648, local1946, local470, local470, local476, local476, local75);
															Static98.aClass99_17.method2513(new Class5_Sub2_Sub8(local5092));
														}
													}
													Static13.aClass150_11 = null;
													return true;
												} else if (Static127.aClass150_64 == Static13.aClass150_11) {
													Static450.anInt7828 = Static131.aClass5_Sub3_Sub1_1.method4171();
													Static58.anInt1190 = Static131.aClass5_Sub3_Sub1_1.method4183();
													Static13.aClass150_11 = null;
													return true;
												} else if (Static13.aClass150_11 == Static365.aClass150_168) {
													Static439.aClass127_10 = Static311.method5046(Static131.aClass5_Sub3_Sub1_1.method4220());
													Static13.aClass150_11 = null;
													return true;
												} else if (Static482.aClass150_203 == Static13.aClass150_11) {
													Static423.method6082(Static159.aClass9_10, Static131.aClass5_Sub3_Sub1_1, Static319.anInt6170);
													Static13.aClass150_11 = null;
													return true;
												} else if (Static501.aClass150_209 == Static13.aClass150_11) {
													local212 = Static131.aClass5_Sub3_Sub1_1.method4202();
													if (local212 == 65535) {
														local212 = -1;
													}
													local75 = Static131.aClass5_Sub3_Sub1_1.method4230();
													local648 = Static131.aClass5_Sub3_Sub1_1.method4227();
													if (Static158.method2886(local648)) {
														Static201.method3294(-1, local75, 2, local212);
													}
													Static13.aClass150_11 = null;
													return true;
												} else if (Static13.aClass150_11 == Static18.aClass150_18) {
													local212 = Static131.aClass5_Sub3_Sub1_1.method4220();
													@Pc(5197) boolean local5197 = (local212 & 0x1) == 1;
													local245 = Static131.aClass5_Sub3_Sub1_1.method4234();
													local711 = Static131.aClass5_Sub3_Sub1_1.method4234();
													if (local711.equals("")) {
														local711 = local245;
													}
													local713 = Static131.aClass5_Sub3_Sub1_1.method4234();
													local737 = Static131.aClass5_Sub3_Sub1_1.method4234();
													if (local737.equals("")) {
														local737 = local713;
													}
													if (local5197) {
														for (local1359 = 0; local1359 < Static150.anInt3101; local1359++) {
															if (Static357.aStringArray30[local1359].equals(local737)) {
																Static3.aStringArray3[local1359] = local245;
																Static357.aStringArray30[local1359] = local711;
																Static207.aStringArray20[local1359] = local713;
																Static13.aStringArray6[local1359] = local737;
																break;
															}
														}
													} else {
														Static3.aStringArray3[Static150.anInt3101] = local245;
														Static357.aStringArray30[Static150.anInt3101] = local711;
														Static207.aStringArray20[Static150.anInt3101] = local713;
														Static13.aStringArray6[Static150.anInt3101] = local737;
														Static324.aBooleanArray22[Static150.anInt3101] = (local212 & 0x2) == 2;
														Static150.anInt3101++;
													}
													Static49.anInt1093 = Static356.anInt6716;
													Static13.aClass150_11 = null;
													return true;
												} else if (Static338.aClass150_159 == Static13.aClass150_11) {
													Static484.method7248(Static540.aClass212_19);
													Static13.aClass150_11 = null;
													return true;
												} else {
													@Pc(5323) byte local5323;
													if (Static36.aClass150_24 == Static13.aClass150_11) {
														local212 = Static131.aClass5_Sub3_Sub1_1.method4227();
														local5323 = Static131.aClass5_Sub3_Sub1_1.method4188();
														local648 = Static131.aClass5_Sub3_Sub1_1.method4205();
														if (Static158.method2886(local212)) {
															Static320.method5149(local648, local5323);
														}
														Static13.aClass150_11 = null;
														return true;
													}
													@Pc(5372) Class5_Sub43 local5372;
													if (Static69.aClass150_33 == Static13.aClass150_11) {
														local212 = Static131.aClass5_Sub3_Sub1_1.method4198();
														local75 = Static131.aClass5_Sub3_Sub1_1.method4227();
														local648 = Static131.aClass5_Sub3_Sub1_1.method4222();
														if (Static158.method2886(local75)) {
															@Pc(5365) Class5_Sub43 local5365 = (Class5_Sub43) Static307.aClass42_24.method1109((long) local648);
															local5372 = (Class5_Sub43) Static307.aClass42_24.method1109((long) local212);
															if (local5372 != null) {
																Static343.method5317(local5365 == null || local5365.anInt7801 != local5372.anInt7801, false, local5372);
															}
															if (local5365 != null) {
																local5365.method7425();
																Static307.aClass42_24.method1106((long) local212, local5365);
															}
															@Pc(5407) Class220 local5407 = Static352.method5447(local648);
															if (local5407 != null) {
																Static377.method5650(local5407);
															}
															local5407 = Static352.method5447(local212);
															if (local5407 != null) {
																Static377.method5650(local5407);
																Static428.method6119(local5407, true);
															}
															if (Static395.anInt7085 != -1) {
																Static207.method3360(Static395.anInt7085, 1);
															}
														}
														Static13.aClass150_11 = null;
														return true;
													} else if (Static13.aClass150_11 == Static325.aClass150_155) {
														local212 = Static131.aClass5_Sub3_Sub1_1.method4205();
														if (local212 == 65535) {
															local212 = -1;
														}
														local75 = Static131.aClass5_Sub3_Sub1_1.method4230();
														local648 = Static131.aClass5_Sub3_Sub1_1.method4232();
														if (Static158.method2886(local648)) {
															Static217.method3498(local75, local212);
														}
														Static13.aClass150_11 = null;
														return true;
													} else if (Static13.aClass150_11 == Static420.aClass150_229) {
														if (Static395.anInt7085 != -1) {
															Static207.method3360(Static395.anInt7085, 0);
														}
														Static13.aClass150_11 = null;
														return true;
													} else if (Static13.aClass150_11 == Static461.aClass150_195) {
														local239 = Static131.aClass5_Sub3_Sub1_1.method4220() == 1;
														local243 = Static131.aClass5_Sub3_Sub1_1.method4234();
														local245 = local243;
														if (local239) {
															local245 = Static131.aClass5_Sub3_Sub1_1.method4234();
														}
														local459 = Static131.aClass5_Sub3_Sub1_1.method4227();
														local464 = Static131.aClass5_Sub3_Sub1_1.method4182();
														local470 = Static131.aClass5_Sub3_Sub1_1.method4220();
														@Pc(5533) long local5533 = (local459 << 32) + local464;
														@Pc(5535) boolean local5535 = false;
														local4895 = 0;
														while (true) {
															if (local4895 >= 100) {
																if (local470 <= 1) {
																	if (Static260.aBoolean605 && !Static143.aBoolean200 || Static411.aBoolean519) {
																		local5535 = true;
																	} else if (Static359.method5523(local245)) {
																		local5535 = true;
																	}
																}
																break;
															}
															if (Static252.aLongArray5[local4895] == local5533) {
																local5535 = true;
																break;
															}
															local4895++;
														}
														if (!local5535 && Static98.anInt2245 == 0) {
															Static252.aLongArray5[Static122.anInt2581] = local5533;
															Static122.anInt2581 = (Static122.anInt2581 + 1) % 100;
															@Pc(5596) String local5596 = Static144.method2730(Static115.method2243(Static131.aClass5_Sub3_Sub1_1));
															if (local470 == 2) {
																Static81.method1437(local5596, 0, null, "<img=1>" + local243, -1, "<img=1>" + local245, 7);
															} else if (local470 == 1) {
																Static81.method1437(local5596, 0, null, "<img=0>" + local243, -1, "<img=0>" + local245, 7);
															} else {
																Static81.method1437(local5596, 0, null, local243, -1, local245, 3);
															}
														}
														Static13.aClass150_11 = null;
														return true;
													} else if (Static13.aClass150_11 == Static324.aClass150_154) {
														local212 = Static131.aClass5_Sub3_Sub1_1.method4205();
														local5323 = Static131.aClass5_Sub3_Sub1_1.method4196();
														Static540.aClass242_1.method5723(local5323, local212);
														Static13.aClass150_11 = null;
														return true;
													} else if (Static13.aClass150_11 == Static388.aClass150_174) {
														Static204.method3339(Static131.aClass5_Sub3_Sub1_1, Static319.anInt6170);
														Static13.aClass150_11 = null;
														return true;
													} else if (Static13.aClass150_11 == Static203.aClass150_91) {
														Static155.method2831();
														Static13.aClass150_11 = null;
														return false;
													} else if (Static13.aClass150_11 == Static291.aClass150_140) {
														Static484.method7248(Static206.aClass212_12);
														Static13.aClass150_11 = null;
														return true;
													} else if (Static331.aClass150_156 == Static13.aClass150_11) {
														Static131.aClass5_Sub3_Sub1_1.anInt4960 += 28;
														if (Static131.aClass5_Sub3_Sub1_1.method4178()) {
															Static321.method5154(Static131.aClass5_Sub3_Sub1_1.anInt4960 - 28, Static131.aClass5_Sub3_Sub1_1);
														}
														Static13.aClass150_11 = null;
														return true;
													} else if (Static238.aClass150_122 == Static13.aClass150_11) {
														local212 = Static131.aClass5_Sub3_Sub1_1.method4220();
														local75 = Static131.aClass5_Sub3_Sub1_1.method4202();
														local889 = (local212 & 0x1) == 1;
														Static521.method7149(local75, local889);
														Static161.anIntArray249[Static228.anInt4307++ & 0x1F] = local75;
														Static13.aClass150_11 = null;
														return true;
													} else if (Static13.aClass150_11 == Static70.aClass150_34) {
														Static357.method5507();
														Static13.aClass150_11 = null;
														return true;
													} else if (Static302.aClass150_145 == Static13.aClass150_11) {
														Static540.aClass242_1.method5718();
														Static13.aClass150_11 = null;
														Static352.anInt6563 += 32;
														return true;
													} else if (Static279.aClass150_131 == Static13.aClass150_11) {
														local212 = Static131.aClass5_Sub3_Sub1_1.method4227();
														local75 = Static131.aClass5_Sub3_Sub1_1.method4220();
														local648 = Static131.aClass5_Sub3_Sub1_1.method4220();
														local255 = Static131.aClass5_Sub3_Sub1_1.method4220();
														local259 = Static131.aClass5_Sub3_Sub1_1.method4220();
														local901 = Static131.aClass5_Sub3_Sub1_1.method4227();
														if (Static158.method2886(local212)) {
															Static494.aBooleanArray35[local75] = true;
															Static456.anIntArray599[local75] = local648;
															Static374.anIntArray512[local75] = local255;
															Static530.anIntArray683[local75] = local259;
															Static93.anIntArray185[local75] = local901;
														}
														Static13.aClass150_11 = null;
														return true;
													} else if (Static41.aClass150_26 == Static13.aClass150_11) {
														local212 = Static131.aClass5_Sub3_Sub1_1.method4171();
														local75 = Static131.aClass5_Sub3_Sub1_1.method4232();
														if (local75 == 65535) {
															local75 = -1;
														}
														local245 = Static131.aClass5_Sub3_Sub1_1.method4234();
														local255 = Static131.aClass5_Sub3_Sub1_1.method4226();
														if (local212 >= 1 && local212 <= 8) {
															if (local245.equalsIgnoreCase("null")) {
																local245 = null;
															}
															Static409.aStringArray33[local212 - 1] = local245;
															Static236.anIntArray308[local212 - 1] = local75;
															Static257.aBooleanArray16[local212 - 1] = local255 == 0;
														}
														Static13.aClass150_11 = null;
														return true;
													} else if (Static13.aClass150_11 == Static411.aClass150_184) {
														Static222.aString80 = Static319.anInt6170 > 2 ? Static131.aClass5_Sub3_Sub1_1.method4234() : Static102.aClass40_33.method1063(Static194.anInt3737);
														Static399.anInt7152 = Static319.anInt6170 > 0 ? Static131.aClass5_Sub3_Sub1_1.method4227() : -1;
														Static13.aClass150_11 = null;
														if (Static399.anInt7152 == 65535) {
															Static399.anInt7152 = -1;
														}
														return true;
													} else if (Static13.aClass150_11 == Static23.aClass150_20) {
														Static219.anInt4147 = Static131.aClass5_Sub3_Sub1_1.method4220();
														Static13.aClass150_11 = null;
														return true;
													} else if (Static532.aClass150_226 == Static13.aClass150_11) {
														local212 = Static131.aClass5_Sub3_Sub1_1.method4227();
														local75 = Static131.aClass5_Sub3_Sub1_1.method4183();
														local648 = Static131.aClass5_Sub3_Sub1_1.method4230();
														local255 = Static131.aClass5_Sub3_Sub1_1.method4232();
														if (Static158.method2886(local255)) {
															local5372 = (Class5_Sub43) Static307.aClass42_24.method1109((long) local648);
															if (local5372 != null) {
																Static343.method5317(local5372.anInt7801 != local212, false, local5372);
															}
															Static194.method3243(local75, local648, local212, false);
														}
														Static13.aClass150_11 = null;
														return true;
													} else if (Static13.aClass150_11 == Static303.aClass150_146) {
														local212 = Static131.aClass5_Sub3_Sub1_1.method4227();
														local75 = Static131.aClass5_Sub3_Sub1_1.method4227();
														local648 = Static131.aClass5_Sub3_Sub1_1.method4227();
														local255 = Static131.aClass5_Sub3_Sub1_1.method4227();
														if (Static158.method2886(local212) && Static139.aClass220ArrayArray1[local75] != null) {
															for (local259 = local648; local259 < local255; local259++) {
																local901 = Static131.aClass5_Sub3_Sub1_1.method4182();
																if (local259 < Static139.aClass220ArrayArray1[local75].length && Static139.aClass220ArrayArray1[local75][local259] != null) {
																	Static139.aClass220ArrayArray1[local75][local259].anInt6647 = local901;
																}
															}
														}
														Static13.aClass150_11 = null;
														return true;
													} else if (Static13.aClass150_11 == Static376.aClass150_169) {
														Static484.method7248(Static155.aClass212_8);
														Static13.aClass150_11 = null;
														return true;
													} else if (Static163.aClass150_77 == Static13.aClass150_11) {
														Static397.anInt7135 = Static131.aClass5_Sub3_Sub1_1.method4188() << 3;
														Static140.anInt2860 = Static131.aClass5_Sub3_Sub1_1.method4215() << 3;
														Static142.anInt2982 = Static131.aClass5_Sub3_Sub1_1.method4171();
														for (@Pc(6143) Class5_Sub7 local6143 = (Class5_Sub7) Static181.aClass42_11.method1103(); local6143 != null; local6143 = (Class5_Sub7) Static181.aClass42_11.method1105()) {
															local75 = (int) (local6143.aLong253 >> 28 & 0x3L);
															local648 = (int) (local6143.aLong253 & 0x3FFFL);
															local255 = local648 - Static515.anInt3214;
															local259 = (int) (local6143.aLong253 >> 14 & 0x3FFFL);
															local901 = local259 - Static338.anInt6353;
															if (Static142.anInt2982 == local75 && local255 >= Static140.anInt2860 && Static140.anInt2860 + 8 > local255 && Static397.anInt7135 <= local901 && local901 < Static397.anInt7135 + 8) {
																local6143.method7425();
																if (local255 >= 0 && local901 >= 0 && Static460.anInt7894 > local255 && Static235.anInt4493 > local901) {
																	Static172.method7331(local901, local255, Static142.anInt2982);
																}
															}
														}
														for (@Pc(6238) Class5_Sub22 local6238 = (Class5_Sub22) Static330.aClass99_53.method2526(); local6238 != null; local6238 = (Class5_Sub22) Static330.aClass99_53.method2519()) {
															if (local6238.anInt3297 >= Static140.anInt2860 && Static140.anInt2860 + 8 > local6238.anInt3297 && local6238.anInt3296 >= Static397.anInt7135 && Static397.anInt7135 + 8 > local6238.anInt3296 && Static142.anInt2982 == local6238.anInt3301) {
																local6238.anInt3306 = 0;
															}
														}
														Static13.aClass150_11 = null;
														return true;
													} else if (Static13.aClass150_11 == Static227.aClass150_107) {
														local212 = Static131.aClass5_Sub3_Sub1_1.method4171();
														local75 = Static131.aClass5_Sub3_Sub1_1.method4222();
														local648 = Static131.aClass5_Sub3_Sub1_1.method4183();
														Static191.anIntArray489[local648] = local75;
														Static99.anIntArray197[local648] = local212;
														Static460.anIntArray602[local648] = 1;
														local255 = Static228.anIntArray296[local648] - 1;
														for (local259 = 0; local259 < local255; local259++) {
															if (Class5_Sub29.anIntArray684[local259] <= local75) {
																Static460.anIntArray602[local648] = local259 + 2;
															}
														}
														Static409.anIntArray565[Static542.anInt9117++ & 0x1F] = local648;
														Static13.aClass150_11 = null;
														return true;
													} else if (Static291.aClass150_139 == Static13.aClass150_11) {
														local212 = Static131.aClass5_Sub3_Sub1_1.method4205();
														local75 = Static131.aClass5_Sub3_Sub1_1.method4232();
														local648 = Static131.aClass5_Sub3_Sub1_1.method4194();
														if (Static158.method2886(local212)) {
															Static532.method7259(local648, local75);
														}
														Static13.aClass150_11 = null;
														return true;
													} else if (Static13.aClass150_11 == Static77.aClass150_144) {
														Static484.method7248(Static214.aClass212_9);
														Static13.aClass150_11 = null;
														return true;
													} else if (Static13.aClass150_11 == Static83.aClass150_40) {
														Static270.method4455(false);
														Static13.aClass150_11 = null;
														return true;
													} else if (Static13.aClass150_11 == Static166.aClass150_79) {
														Static286.method4827(false);
														Static13.aClass150_11 = null;
														return false;
													} else if (Static193.aClass150_88 == Static13.aClass150_11) {
														local825 = Static131.aClass5_Sub3_Sub1_1.method4234();
														local75 = Static131.aClass5_Sub3_Sub1_1.method4230();
														local648 = Static131.aClass5_Sub3_Sub1_1.method4202();
														if (Static158.method2886(local648)) {
															Static504.method6952(local825, local75);
														}
														Static13.aClass150_11 = null;
														return true;
													} else if (Static496.aClass150_208 == Static13.aClass150_11) {
														Static213.method3467();
														Static13.aClass150_11 = null;
														return false;
													} else if (Static379.aClass150_171 == Static13.aClass150_11) {
														Static286.method4827(Static428.aBoolean536);
														Static13.aClass150_11 = null;
														return false;
													} else if (Static13.aClass150_11 == Static211.aClass150_94) {
														if (Static254.aFrame32 != null) {
															Static302.method4984(-1, -1, false, Static300.aClass5_Sub28_Sub1_1.anInt4891);
														}
														@Pc(6474) byte[] local6474 = new byte[Static319.anInt6170];
														Static131.aClass5_Sub3_Sub1_1.method526(local6474, Static319.anInt6170);
														local243 = Static152.method2790(Static319.anInt6170, 0, local6474);
														Static459.method6390(Static159.aClass9_10, true, Static17.anInt459 == 1, local243);
														Static13.aClass150_11 = null;
														return true;
													} else if (Static26.aClass150_21 == Static13.aClass150_11) {
														Static397.anInt7135 = Static131.aClass5_Sub3_Sub1_1.method4215() << 3;
														Static140.anInt2860 = Static131.aClass5_Sub3_Sub1_1.method4189() << 3;
														Static142.anInt2982 = Static131.aClass5_Sub3_Sub1_1.method4183();
														Static13.aClass150_11 = null;
														return true;
													} else if (Static91.aClass150_49 == Static13.aClass150_11) {
														local212 = Static131.aClass5_Sub3_Sub1_1.method4232();
														local75 = Static131.aClass5_Sub3_Sub1_1.method4183();
														local648 = Static131.aClass5_Sub3_Sub1_1.method4205();
														if (Static158.method2886(local212)) {
															if (local75 == 2) {
																Static162.method2906();
															}
															Static395.anInt7085 = local648;
															Static430.method6131(local648);
															Static92.method1973(false);
															Static266.method4402(Static395.anInt7085);
															for (local255 = 0; local255 < 100; local255++) {
																Static345.aBooleanArray24[local255] = true;
															}
														}
														Static13.aClass150_11 = null;
														return true;
													} else if (Static218.aClass150_98 == Static13.aClass150_11) {
														Static484.method7248(Static94.aClass212_6);
														Static13.aClass150_11 = null;
														return true;
													} else {
														Static370.method6434("T1 - " + (Static13.aClass150_11 == null ? -1 : Static13.aClass150_11.method3535()) + "," + (Static203.aClass150_90 == null ? -1 : Static203.aClass150_90.method3535()) + "," + (Static473.aClass150_200 == null ? -1 : Static473.aClass150_200.method3535()) + " - " + Static319.anInt6170, null);
														Static286.method4827(false);
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

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILclient!oh;I)Ljava/lang/String;")
	public static String method6105(@OriginalArg(0) int arg0, @OriginalArg(1) Class220 arg1) {
		if (!Static68.method1303(arg1).method1958(arg0) && arg1.anObjectArray30 == null) {
			return null;
		} else if (arg1.aStringArray29 == null || arg0 >= arg1.aStringArray29.length || arg1.aStringArray29[arg0] == null || arg1.aStringArray29[arg0].trim().length() == 0) {
			return Static525.aBoolean645 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray29[arg0];
		}
	}
}
