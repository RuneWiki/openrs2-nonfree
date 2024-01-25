import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_47 = new Class289(53, 7);

	@OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
	public static int anInt2579 = 0;

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V")
	public static void method2189() {
		@Pc(12) Class6_Sub26 local12 = Static268.method3981(Static377.aClass15_2, Static542.aClass289_130);
		local12.aClass6_Sub23_Sub1_2.method8366(0);
		Static670.method9077(local12);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZLclient!kf;B)V")
	public static void method2190(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub1_Sub1_Sub3_Sub2 arg1) {
		if (Static183.anInt3155 >= 400) {
			return;
		}
		@Pc(21) Class91 local21 = arg1.aClass91_1;
		@Pc(24) String local24 = arg1.aString67;
		if (local21.anIntArray140 != null) {
			local21 = local21.method2036(Static659.aClass363_3);
			if (local21 == null) {
				return;
			}
			local24 = local21.aString25;
		}
		if (!local21.lb) {
			return;
		}
		if (arg1.anInt5137 != 0) {
			@Pc(61) String local61 = Static457.aClass176_6 == Static427.aClass176_5 ? Static52.aClass41_30.method1007(Static616.anInt10077) : Static52.aClass41_28.method1007(Static616.anInt10077);
			local24 = local24 + Static148.method2140(Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt4182, arg1.anInt5137) + " (" + local61 + arg1.anInt5137 + ")";
		}
		if (Static291.aBoolean314 && !arg0) {
			@Pc(98) Class325 local98 = Static127.anInt1401 == -1 ? null : Static280.aClass349_2.method8157(Static127.anInt1401);
			if ((Static255.anInt5389 & 0x2) != 0 && (local98 == null || local21.method2039(local98.anInt9243, Static127.anInt1401) != local98.anInt9243)) {
				Static200.method2916((long) arg1.anInt5103, Static355.aString75, 0, false, (long) arg1.anInt5103, Static172.aString32 + " -> <col=ffff00>" + local24, 47, Static478.anInt8213, -1, true, 0, false);
			}
		}
		if (!arg0) {
			@Pc(156) String[] local156 = local21.aStringArray19;
			if (Static521.aBoolean612) {
				local156 = Static661.method8992(local156);
			}
			@Pc(168) int local168;
			if (local156 != null) {
				for (local168 = 4; local168 >= 0; local168--) {
					if (local156[local168] != null && (local21.aByte37 == 0 || !local156[local168].equalsIgnoreCase(Static52.aClass41_23.method1007(Static616.anInt10077)))) {
						@Pc(191) byte local191 = 0;
						@Pc(193) int local193 = Static80.anInt1521;
						if (local168 == 0) {
							local191 = 58;
						}
						if (local168 == 1) {
							local191 = 4;
						}
						if (local168 == 2) {
							local191 = 51;
						}
						if (local168 == 3) {
							local191 = 13;
						}
						if (local21.anInt2358 == local168) {
							local193 = local21.anInt2367;
						}
						if (local168 == 4) {
							local191 = 23;
						}
						if (local21.anInt2336 == local168) {
							local193 = local21.anInt2364;
						}
						Static200.method2916((long) arg1.anInt5103, local156[local168], 0, false, (long) arg1.anInt5103, "<col=ffff00>" + local24, local191, local156[local168].equalsIgnoreCase(Static52.aClass41_23.method1007(Static616.anInt10077)) ? local21.anInt2340 : local193, -1, true, 0, false);
					}
				}
			}
			if (local21.aByte37 == 1 && local156 != null) {
				for (local168 = 4; local168 >= 0; local168--) {
					if (local156[local168] != null && local156[local168].equalsIgnoreCase(Static52.aClass41_23.method1007(Static616.anInt10077))) {
						@Pc(318) short local318 = 0;
						if (Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt4182 < arg1.anInt5137) {
							local318 = 2000;
						}
						@Pc(331) short local331 = 0;
						if (local168 == 0) {
							local331 = 58;
						}
						if (local168 == 1) {
							local331 = 4;
						}
						if (local168 == 2) {
							local331 = 51;
						}
						if (local168 == 3) {
							local331 = 13;
						}
						if (local168 == 4) {
							local331 = 23;
						}
						if (local331 != 0) {
							local331 += local318;
						}
						Static200.method2916((long) arg1.anInt5103, local156[local168], 0, false, (long) arg1.anInt5103, "<col=ffff00>" + local24, local331, local21.anInt2340, -1, true, 0, false);
					}
				}
			}
		}
		Static200.method2916((long) arg1.anInt5103, Static52.aClass41_22.method1007(Static616.anInt10077), 0, arg0, (long) arg1.anInt5103, "<col=ffff00>" + local24, 1004, Static658.anInt10577, -1, true, 0, false);
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(Z)Z")
	public static boolean method2192() throws IOException {
		if (Static163.aClass170_1 == null) {
			return false;
		}
		@Pc(73) int local73;
		if (Static667.aClass179_372 == null) {
			if (Static519.aBoolean610) {
				if (!Static163.aClass170_1.method8769(1)) {
					return false;
				}
				Static163.aClass170_1.method8776(0, Static204.aClass6_Sub23_Sub1_1.aByteArray101, 1);
				Static447.anInt7487 = 0;
				Static296.anInt4972++;
				Static519.aBoolean610 = false;
			}
			Static204.aClass6_Sub23_Sub1_1.anInt9901 = 0;
			if (Static204.aClass6_Sub23_Sub1_1.method2881()) {
				if (!Static163.aClass170_1.method8769(1)) {
					return false;
				}
				Static163.aClass170_1.method8776(1, Static204.aClass6_Sub23_Sub1_1.aByteArray101, 1);
				Static296.anInt4972++;
				Static447.anInt7487 = 0;
			}
			Static519.aBoolean610 = true;
			@Pc(69) Class179[] local69 = Static399.method5767();
			local73 = Static204.aClass6_Sub23_Sub1_1.method2873();
			if (local73 < 0 || local73 >= local69.length) {
				throw new IOException("invo:" + local73 + " ip:" + Static204.aClass6_Sub23_Sub1_1.anInt9901);
			}
			Static667.aClass179_372 = local69[local73];
			Static655.anInt10505 = Static667.aClass179_372.anInt4843;
		}
		if (Static655.anInt10505 == -1) {
			if (!Static163.aClass170_1.method8769(1)) {
				return false;
			}
			Static163.aClass170_1.method8776(0, Static204.aClass6_Sub23_Sub1_1.aByteArray101, 1);
			Static296.anInt4972++;
			Static655.anInt10505 = Static204.aClass6_Sub23_Sub1_1.aByteArray101[0] & 0xFF;
			Static447.anInt7487 = 0;
		}
		if (Static655.anInt10505 == -2) {
			if (!Static163.aClass170_1.method8769(2)) {
				return false;
			}
			Static163.aClass170_1.method8776(0, Static204.aClass6_Sub23_Sub1_1.aByteArray101, 2);
			Static204.aClass6_Sub23_Sub1_1.anInt9901 = 0;
			Static655.anInt10505 = Static204.aClass6_Sub23_Sub1_1.method8363();
			Static296.anInt4972 += 2;
			Static447.anInt7487 = 0;
		}
		if (Static655.anInt10505 > 0) {
			if (!Static163.aClass170_1.method8769(Static655.anInt10505)) {
				return false;
			}
			Static204.aClass6_Sub23_Sub1_1.anInt9901 = 0;
			Static163.aClass170_1.method8776(0, Static204.aClass6_Sub23_Sub1_1.aByteArray101, Static655.anInt10505);
			Static296.anInt4972 += Static655.anInt10505;
			Static447.anInt7487 = 0;
		}
		Static34.aClass179_39 = Static398.aClass179_257;
		Static398.aClass179_257 = Static558.aClass179_321;
		Static558.aClass179_321 = Static667.aClass179_372;
		@Pc(206) String local206;
		@Pc(218) String local218;
		if (Static362.aClass179_234 == Static667.aClass179_372) {
			local206 = Static204.aClass6_Sub23_Sub1_1.method8354();
			local73 = Static204.aClass6_Sub23_Sub1_1.method8363();
			local218 = Static418.aClass377_1.method8763(local73).method6589(Static204.aClass6_Sub23_Sub1_1);
			Static593.method8154(local206, local206, local73, local206, local218, 19, (String) null, 0);
			Static667.aClass179_372 = null;
			return true;
		}
		@Pc(239) int local239;
		if (Static667.aClass179_372 == Static102.aClass179_79) {
			local239 = Static204.aClass6_Sub23_Sub1_1.method8365();
			Static277.method4080();
			Static216.method3143(local239);
			Static667.aClass179_372 = null;
			return true;
		} else if (Static667.aClass179_372 == Static326.aClass179_216) {
			Static122.method1893(Static20.aClass159_1);
			Static667.aClass179_372 = null;
			return true;
		} else {
			@Pc(289) int local289;
			@Pc(379) int local379;
			@Pc(275) String local275;
			@Pc(271) boolean local271;
			@Pc(285) long local285;
			@Pc(280) long local280;
			@Pc(295) long local295;
			@Pc(313) int local313;
			@Pc(373) String local373;
			if (Static229.aClass179_149 == Static667.aClass179_372) {
				local271 = Static204.aClass6_Sub23_Sub1_1.method8374() == 1;
				local275 = Static204.aClass6_Sub23_Sub1_1.method8354();
				local280 = (long) Static204.aClass6_Sub23_Sub1_1.method8363();
				local285 = (long) Static204.aClass6_Sub23_Sub1_1.method8344();
				local289 = Static204.aClass6_Sub23_Sub1_1.method8374();
				local295 = local285 + (local280 << 32);
				@Pc(297) boolean local297 = false;
				@Pc(305) Class6_Sub2 local305 = local271 ? Static303.aClass6_Sub2_3 : Static34.aClass6_Sub2_1;
				if (local305 == null) {
					local297 = true;
				} else {
					label2097: {
						for (local313 = 0; local313 < 100; local313++) {
							if (Static667.aLongArray22[local313] == local295) {
								local297 = true;
								break label2097;
							}
						}
						if (local289 <= 1) {
							if (Static322.aBoolean346 && !Static377.aBoolean420 || Static525.aBoolean615) {
								local297 = true;
							} else if (Static225.method3276(local275)) {
								local297 = true;
							}
						}
					}
				}
				if (!local297 && Static54.anInt1106 == 0) {
					Static667.aLongArray22[Static31.anInt711] = local295;
					Static31.anInt711 = (Static31.anInt711 + 1) % 100;
					local373 = Static648.method8832(Static648.method8827(Static204.aClass6_Sub23_Sub1_1));
					local379 = local271 ? 41 : 44;
					if (local289 == 2 || local289 == 3) {
						Static593.method8154(local275, "<img=1>" + local275, -1, "<img=1>" + local275, local373, local379, local305.aString9, 0);
					} else if (local289 == 1) {
						Static593.method8154(local275, "<img=0>" + local275, -1, "<img=0>" + local275, local373, local379, local305.aString9, 0);
					} else {
						Static593.method8154(local275, local275, -1, local275, local373, local379, local305.aString9, 0);
					}
				}
				Static667.aClass179_372 = null;
				return true;
			} else if (Static667.aClass179_372 == Static40.aClass179_300) {
				local239 = Static204.aClass6_Sub23_Sub1_1.method8393();
				local73 = Static204.aClass6_Sub23_Sub1_1.method8403();
				Static277.method4080();
				Static423.method6279(local239, local73);
				Static667.aClass179_372 = null;
				return true;
			} else {
				@Pc(501) int local501;
				if (Static248.aClass179_164 == Static667.aClass179_372) {
					local239 = Static204.aClass6_Sub23_Sub1_1.method8343();
					local73 = Static204.aClass6_Sub23_Sub1_1.method8367();
					if (local73 == 65535) {
						local73 = -1;
					}
					local218 = Static204.aClass6_Sub23_Sub1_1.method8354();
					local501 = Static204.aClass6_Sub23_Sub1_1.method8374();
					if (local239 >= 1 && local239 <= 8) {
						if (local218.equalsIgnoreCase("null")) {
							local218 = null;
						}
						Static82.aStringArray16[local239 - 1] = local218;
						Static380.anIntArray400[local239 - 1] = local73;
						Static40.aBooleanArray25[local239 - 1] = local501 == 0;
					}
					Static667.aClass179_372 = null;
					return true;
				}
				@Pc(575) boolean local575;
				@Pc(573) int local573;
				@Pc(598) String local598;
				if (Static490.aClass179_290 == Static667.aClass179_372) {
					local271 = Static204.aClass6_Sub23_Sub1_1.method8374() == 1;
					local275 = Static204.aClass6_Sub23_Sub1_1.method8354();
					local218 = local275;
					if (local271) {
						local218 = Static204.aClass6_Sub23_Sub1_1.method8354();
					}
					local501 = Static204.aClass6_Sub23_Sub1_1.method8374();
					local573 = Static204.aClass6_Sub23_Sub1_1.method8363();
					local575 = false;
					if (local501 <= 1 && Static225.method3276(local218)) {
						local575 = true;
					}
					if (!local575 && Static54.anInt1106 == 0) {
						local598 = Static418.aClass377_1.method8763(local573).method6589(Static204.aClass6_Sub23_Sub1_1);
						if (local501 == 2) {
							Static593.method8154(local275, "<img=1>" + local275, local573, "<img=1>" + local218, local598, 25, (String) null, 0);
						} else if (local501 == 1) {
							Static593.method8154(local275, "<img=0>" + local275, local573, "<img=0>" + local218, local598, 25, (String) null, 0);
						} else {
							Static593.method8154(local275, local275, local573, local218, local598, 25, (String) null, 0);
						}
					}
					Static667.aClass179_372 = null;
					return true;
				}
				@Pc(685) int local685;
				@Pc(716) String local716;
				@Pc(689) String local689;
				@Pc(687) String local687;
				if (Static286.aClass179_187 == Static667.aClass179_372) {
					local239 = Static204.aClass6_Sub23_Sub1_1.method8404();
					local73 = Static204.aClass6_Sub23_Sub1_1.method8369();
					local685 = Static204.aClass6_Sub23_Sub1_1.method8374();
					local687 = "";
					local689 = local687;
					if ((local685 & 0x1) != 0) {
						local687 = Static204.aClass6_Sub23_Sub1_1.method8354();
						if ((local685 & 0x2) == 0) {
							local689 = local687;
						} else {
							local689 = Static204.aClass6_Sub23_Sub1_1.method8354();
						}
					}
					local716 = Static204.aClass6_Sub23_Sub1_1.method8354();
					if (local239 == 99) {
						Static67.method1187(local716);
					} else if (local689.equals("") || !Static225.method3276(local689)) {
						Static55.method3549(local689, local687, local687, local239, local73, local716);
					} else {
						Static667.aClass179_372 = null;
						return true;
					}
					Static667.aClass179_372 = null;
					return true;
				} else if (Static173.aClass179_119 == Static667.aClass179_372) {
					Static575.method7985();
					Static667.aClass179_372 = null;
					return false;
				} else if (Static242.aClass179_163 == Static667.aClass179_372) {
					local239 = Static204.aClass6_Sub23_Sub1_1.method8339();
					local73 = Static204.aClass6_Sub23_Sub1_1.method8336();
					local685 = Static204.aClass6_Sub23_Sub1_1.method8377();
					Static277.method4080();
					Static75.method1315(local685, local239, local73);
					Static667.aClass179_372 = null;
					return true;
				} else {
					@Pc(795) byte local795;
					if (Static467.aClass179_279 == Static667.aClass179_372) {
						local239 = Static204.aClass6_Sub23_Sub1_1.method8374();
						local795 = Static204.aClass6_Sub23_Sub1_1.method8341();
						Static277.method4080();
						Static392.method1759(local239, local795);
						Static667.aClass179_372 = null;
						return true;
					} else if (Static667.aClass179_372 == Static403.aClass179_260) {
						local239 = Static204.aClass6_Sub23_Sub1_1.method8365();
						local73 = Static204.aClass6_Sub23_Sub1_1.method8397();
						Static277.method4080();
						if (local73 == 2) {
							Static424.method6295();
						}
						Static561.anInt9357 = local239;
						Static657.method8945(local239);
						Static420.method6263(false);
						Static295.method4219(Static561.anInt9357);
						for (local685 = 0; local685 < 100; local685++) {
							Static224.aBooleanArray12[local685] = true;
						}
						Static667.aClass179_372 = null;
						return true;
					} else if (Static603.aClass179_348 == Static667.aClass179_372) {
						Static204.aClass6_Sub23_Sub1_1.anInt9901 += 28;
						if (Static204.aClass6_Sub23_Sub1_1.method8376()) {
							Static376.method5351(Static204.aClass6_Sub23_Sub1_1.anInt9901 - 28, Static204.aClass6_Sub23_Sub1_1);
						}
						Static667.aClass179_372 = null;
						return true;
					} else if (Static581.aClass179_335 == Static667.aClass179_372) {
						Static122.method1893(Static488.aClass159_14);
						Static667.aClass179_372 = null;
						return true;
					} else if (Static324.aClass179_213 == Static667.aClass179_372) {
						Static122.method1893(Static373.aClass159_9);
						Static667.aClass179_372 = null;
						return true;
					} else if (Static277.aClass179_181 == Static667.aClass179_372) {
						Static659.aClass363_3.method8561();
						Static651.anInt10485 += 32;
						Static667.aClass179_372 = null;
						return true;
					} else if (Static667.aClass179_372 == Static309.aClass179_99) {
						Static617.anInt10079 = Static94.anInt1719;
						local271 = Static204.aClass6_Sub23_Sub1_1.method8374() == 1;
						@Pc(930) Class127 local930 = new Class127(Static204.aClass6_Sub23_Sub1_1);
						@Pc(934) Class145 local934;
						if (local271) {
							local934 = Static150.aClass145_2;
						} else {
							local934 = Static150.aClass145_1;
						}
						local930.method2711(local934);
						Static667.aClass179_372 = null;
						return true;
					} else {
						@Pc(998) int local998;
						@Pc(978) int local978;
						@Pc(990) int local990;
						if (Static667.aClass179_372 == Static571.aClass179_329) {
							local239 = Static204.aClass6_Sub23_Sub1_1.method8403();
							if (local239 == 65535) {
								local239 = -1;
							}
							local73 = Static204.aClass6_Sub23_Sub1_1.method8343();
							local685 = local73 >> 2;
							local501 = local73 & 0x3;
							local573 = Static472.anIntArray533[local685];
							local978 = Static204.aClass6_Sub23_Sub1_1.method8336();
							local289 = local978 >> 28 & 0x3;
							local990 = local978 >> 14 & 0x3FFF;
							local990 -= Static534.anInt8753;
							local998 = local978 & 0x3FFF;
							local998 -= Static234.anInt4239;
							Static408.method5843(local685, local990, local998, local239, local289, local501, local573);
							Static667.aClass179_372 = null;
							return true;
						} else if (Static667.aClass179_372 == Static238.aClass179_162) {
							Static206.anInt3566 = Static94.anInt1719;
							Static511.anInt6141 = 1;
							Static667.aClass179_372 = null;
							return true;
						} else if (Static667.aClass179_372 == Static407.aClass179_262) {
							Static122.method1893(Static127.aClass159_4);
							Static667.aClass179_372 = null;
							return true;
						} else if (Static545.aClass179_312 == Static667.aClass179_372) {
							local239 = Static204.aClass6_Sub23_Sub1_1.method8403();
							local795 = Static204.aClass6_Sub23_Sub1_1.method8384();
							Static659.aClass363_3.method8558(local239, local795);
							Static667.aClass179_372 = null;
							return true;
						} else {
							@Pc(1088) boolean local1088;
							if (Static667.aClass179_372 == client.lb) {
								local271 = Static204.aClass6_Sub23_Sub1_1.method8374() == 1;
								local275 = Static204.aClass6_Sub23_Sub1_1.method8354();
								local218 = local275;
								if (local271) {
									local218 = Static204.aClass6_Sub23_Sub1_1.method8354();
								}
								local501 = Static204.aClass6_Sub23_Sub1_1.method8374();
								local1088 = false;
								if (local501 <= 1) {
									if (Static322.aBoolean346 && !Static377.aBoolean420 || Static525.aBoolean615) {
										local1088 = true;
									} else if (local501 <= 1 && Static225.method3276(local218)) {
										local1088 = true;
									}
								}
								if (!local1088 && Static54.anInt1106 == 0) {
									local716 = Static648.method8832(Static648.method8827(Static204.aClass6_Sub23_Sub1_1));
									if (local501 == 2) {
										Static593.method8154(local275, "<img=1>" + local275, -1, "<img=1>" + local218, local716, 24, (String) null, 0);
									} else if (local501 == 1) {
										Static593.method8154(local275, "<img=0>" + local275, -1, "<img=0>" + local218, local716, 24, (String) null, 0);
									} else {
										Static593.method8154(local275, local275, -1, local218, local716, 24, (String) null, 0);
									}
								}
								Static667.aClass179_372 = null;
								return true;
							} else if (Static364.aClass179_235 == Static667.aClass179_372) {
								local239 = Static204.aClass6_Sub23_Sub1_1.method8374();
								@Pc(1208) boolean local1208 = (local239 & 0x1) == 1;
								local218 = Static204.aClass6_Sub23_Sub1_1.method8354();
								local687 = Static204.aClass6_Sub23_Sub1_1.method8354();
								if (local687.equals("")) {
									local687 = local218;
								}
								local689 = Static204.aClass6_Sub23_Sub1_1.method8354();
								local716 = Static204.aClass6_Sub23_Sub1_1.method8354();
								if (local716.equals("")) {
									local716 = local689;
								}
								if (local1208) {
									for (local289 = 0; local289 < Static477.anInt8198; local289++) {
										if (Static658.aStringArray65[local289].equals(local716)) {
											Static572.aStringArray58[local289] = local218;
											Static658.aStringArray65[local289] = local687;
											Static602.aStringArray63[local289] = local689;
											Static123.aStringArray18[local289] = local716;
											break;
										}
									}
								} else {
									Static572.aStringArray58[Static477.anInt8198] = local218;
									Static658.aStringArray65[Static477.anInt8198] = local687;
									Static602.aStringArray63[Static477.anInt8198] = local689;
									Static123.aStringArray18[Static477.anInt8198] = local716;
									Static287.aBooleanArray17[Static477.anInt8198] = (local239 & 0x2) == 2;
									Static477.anInt8198++;
								}
								Static667.aClass179_372 = null;
								Static206.anInt3566 = Static94.anInt1719;
								return true;
							} else if (Static667.aClass179_372 == Static150.aClass179_105) {
								local239 = Static204.aClass6_Sub23_Sub1_1.method8348();
								local73 = Static204.aClass6_Sub23_Sub1_1.method8363();
								Static277.method4080();
								if (local73 == 65535) {
									local73 = -1;
								}
								Static178.method2509(2, local239, local73, -1);
								Static667.aClass179_372 = null;
								return true;
							} else if (Static667.aClass179_372 == Static381.aClass179_273) {
								Static467.anInt8075 = Static94.anInt1719;
								local271 = Static204.aClass6_Sub23_Sub1_1.method8374() == 1;
								if (Static655.anInt10505 != 1) {
									if (local271) {
										Static303.aClass6_Sub2_3 = new Class6_Sub2(Static204.aClass6_Sub23_Sub1_1);
									} else {
										Static34.aClass6_Sub2_1 = new Class6_Sub2(Static204.aClass6_Sub23_Sub1_1);
									}
									Static667.aClass179_372 = null;
									return true;
								}
								Static667.aClass179_372 = null;
								if (local271) {
									Static303.aClass6_Sub2_3 = null;
								} else {
									Static34.aClass6_Sub2_1 = null;
								}
								return true;
							} else {
								@Pc(1437) long local1437;
								@Pc(1459) Class6_Sub42 local1459;
								@Pc(1443) Class6_Sub42 local1443;
								if (Static667.aClass179_372 == Static508.aClass179_352) {
									local239 = Static204.aClass6_Sub23_Sub1_1.method8365();
									local73 = Static204.aClass6_Sub23_Sub1_1.method8403();
									if (local73 == 65535) {
										local73 = -1;
									}
									local685 = Static204.aClass6_Sub23_Sub1_1.method8367();
									if (local685 == 65535) {
										local685 = -1;
									}
									local501 = Static204.aClass6_Sub23_Sub1_1.method8336();
									Static277.method4080();
									for (local573 = local685; local573 <= local73; local573++) {
										local1437 = ((long) local501 << 32) + (long) local573;
										local1443 = (Class6_Sub42) Static345.aClass209_31.method5038(local1437);
										if (local1443 != null) {
											local1459 = new Class6_Sub42(local1443.anInt6747, local239);
											local1443.method9174();
										} else if (local573 == -1) {
											local1459 = new Class6_Sub42(Static286.method4134(local501).aClass6_Sub42_2.anInt6747, local239);
										} else {
											local1459 = new Class6_Sub42(0, local239);
										}
										Static345.aClass209_31.method5035(local1437, local1459);
									}
									Static667.aClass179_372 = null;
									return true;
								} else if (Static631.aClass179_360 == Static667.aClass179_372) {
									local239 = Static204.aClass6_Sub23_Sub1_1.method8367();
									local73 = Static204.aClass6_Sub23_Sub1_1.method8367();
									local685 = Static204.aClass6_Sub23_Sub1_1.method8393();
									local501 = Static204.aClass6_Sub23_Sub1_1.method8367();
									Static277.method4080();
									Static178.method2509(7, local685, local239 << 16 | local73, local501);
									Static667.aClass179_372 = null;
									return true;
								} else if (Static667.aClass179_372 == Static325.aClass179_214) {
									local239 = Static204.aClass6_Sub23_Sub1_1.method8343();
									local73 = Static204.aClass6_Sub23_Sub1_1.method8337();
									local685 = Static204.aClass6_Sub23_Sub1_1.method8397();
									local501 = Static204.aClass6_Sub23_Sub1_1.method8337();
									local573 = Static204.aClass6_Sub23_Sub1_1.method8367();
									Static277.method4080();
									Static542.aBooleanArray30[local239] = true;
									Static502.anIntArray552[local239] = local501;
									Static615.anIntArray665[local239] = local685;
									Static31.anIntArray49[local239] = local73;
									Static464.anIntArray527[local239] = local573;
									Static667.aClass179_372 = null;
									return true;
								} else if (Static332.aClass179_272 == Static667.aClass179_372) {
									local271 = Static204.aClass6_Sub23_Sub1_1.method8374() == 1;
									@Pc(1599) byte[] local1599 = new byte[Static655.anInt10505 - 1];
									Static204.aClass6_Sub23_Sub1_1.method8375(Static655.anInt10505 - 1, local1599, 0);
									Static52.method1009(local1599, local271);
									Static667.aClass179_372 = null;
									return true;
								} else {
									@Pc(1667) boolean local1667;
									@Pc(1646) long local1646;
									@Pc(1720) String local1720;
									if (Static266.aClass179_176 == Static667.aClass179_372) {
										local271 = Static204.aClass6_Sub23_Sub1_1.method8374() == 1;
										local275 = Static204.aClass6_Sub23_Sub1_1.method8354();
										local218 = local275;
										if (local271) {
											local218 = Static204.aClass6_Sub23_Sub1_1.method8354();
										}
										local1646 = (long) Static204.aClass6_Sub23_Sub1_1.method8363();
										local1437 = (long) Static204.aClass6_Sub23_Sub1_1.method8344();
										local990 = Static204.aClass6_Sub23_Sub1_1.method8374();
										local998 = Static204.aClass6_Sub23_Sub1_1.method8363();
										@Pc(1665) long local1665 = local1437 + (local1646 << 32);
										local1667 = false;
										local379 = 0;
										while (true) {
											if (local379 >= 100) {
												if (local990 <= 1 && Static225.method3276(local218)) {
													local1667 = true;
												}
												break;
											}
											if (local1665 == Static667.aLongArray22[local379]) {
												local1667 = true;
												break;
											}
											local379++;
										}
										if (!local1667 && Static54.anInt1106 == 0) {
											Static667.aLongArray22[Static31.anInt711] = local1665;
											Static31.anInt711 = (Static31.anInt711 + 1) % 100;
											local1720 = Static418.aClass377_1.method8763(local998).method6589(Static204.aClass6_Sub23_Sub1_1);
											if (local990 == 2) {
												Static593.method8154(local275, "<img=1>" + local275, local998, "<img=1>" + local218, local1720, 18, (String) null, 0);
											} else if (local990 == 1) {
												Static593.method8154(local275, "<img=0>" + local275, local998, "<img=0>" + local218, local1720, 18, (String) null, 0);
											} else {
												Static593.method8154(local275, local275, local998, local218, local1720, 18, (String) null, 0);
											}
										}
										Static667.aClass179_372 = null;
										return true;
									} else if (Static582.aClass179_337 == Static667.aClass179_372) {
										local239 = Static204.aClass6_Sub23_Sub1_1.method8343();
										local73 = Static204.aClass6_Sub23_Sub1_1.method8397();
										if (local239 == 255) {
											local73 = -1;
											local239 = -1;
										}
										Static213.method3111(local239, local73);
										Static667.aClass179_372 = null;
										return true;
									} else {
										@Pc(1864) int local1864;
										@Pc(1868) int local1868;
										@Pc(1879) int local1879;
										if (Static562.aClass179_323 == Static667.aClass179_372) {
											local271 = Static204.aClass6_Sub23_Sub1_1.method8374() == 1;
											local275 = Static204.aClass6_Sub23_Sub1_1.method8354();
											local218 = local275;
											if (local271) {
												local218 = Static204.aClass6_Sub23_Sub1_1.method8354();
											}
											local1646 = Static204.aClass6_Sub23_Sub1_1.method8381();
											local1437 = (long) Static204.aClass6_Sub23_Sub1_1.method8363();
											local295 = (long) Static204.aClass6_Sub23_Sub1_1.method8344();
											local1864 = Static204.aClass6_Sub23_Sub1_1.method8374();
											local1868 = Static204.aClass6_Sub23_Sub1_1.method8363();
											@Pc(1875) long local1875 = (local1437 << 32) + local295;
											@Pc(1877) boolean local1877 = false;
											local1879 = 0;
											while (true) {
												if (local1879 >= 100) {
													if (local1864 <= 1 && Static225.method3276(local218)) {
														local1877 = true;
													}
													break;
												}
												if (local1875 == Static667.aLongArray22[local1879]) {
													local1877 = true;
													break;
												}
												local1879++;
											}
											if (!local1877 && Static54.anInt1106 == 0) {
												Static667.aLongArray22[Static31.anInt711] = local1875;
												Static31.anInt711 = (Static31.anInt711 + 1) % 100;
												@Pc(1931) String local1931 = Static418.aClass377_1.method8763(local1868).method6589(Static204.aClass6_Sub23_Sub1_1);
												if (local1864 == 2) {
													Static593.method8154(local275, "<img=1>" + local275, local1868, "<img=1>" + local218, local1931, 20, Static417.method6237(local1646), 0);
												} else if (local1864 == 1) {
													Static593.method8154(local275, "<img=0>" + local275, local1868, "<img=0>" + local218, local1931, 20, Static417.method6237(local1646), 0);
												} else {
													Static593.method8154(local275, local275, local1868, local218, local1931, 20, Static417.method6237(local1646), 0);
												}
											}
											Static667.aClass179_372 = null;
											return true;
										}
										@Pc(2043) boolean local2043;
										if (Static667.aClass179_372 == Static321.aClass179_212) {
											@Pc(2080) boolean local2080;
											while (Static655.anInt10505 > Static204.aClass6_Sub23_Sub1_1.anInt9901) {
												local271 = Static204.aClass6_Sub23_Sub1_1.method8374() == 1;
												local275 = Static204.aClass6_Sub23_Sub1_1.method8354();
												local218 = Static204.aClass6_Sub23_Sub1_1.method8354();
												local501 = Static204.aClass6_Sub23_Sub1_1.method8363();
												local573 = Static204.aClass6_Sub23_Sub1_1.method8374();
												local716 = "";
												local2043 = false;
												if (local501 > 0) {
													local716 = Static204.aClass6_Sub23_Sub1_1.method8354();
													local2043 = Static204.aClass6_Sub23_Sub1_1.method8374() == 1;
												}
												for (local990 = 0; local990 < Static96.anInt1739; local990++) {
													if (local271) {
														if (local218.equals(Static480.aStringArray50[local990])) {
															Static480.aStringArray50[local990] = local275;
															Static306.aStringArray38[local990] = local218;
															local275 = null;
															break;
														}
													} else if (local275.equals(Static480.aStringArray50[local990])) {
														if (Static577.anIntArray643[local990] != local501) {
															local2080 = true;
															for (@Pc(2085) Class2_Sub6_Sub2 local2085 = (Class2_Sub6_Sub2) Static213.aClass43_6.method1087(); local2085 != null; local2085 = (Class2_Sub6_Sub2) Static213.aClass43_6.method1088()) {
																if (local2085.aString79.equals(local275)) {
																	if (local501 != 0 && local2085.aShort81 == 0) {
																		local2080 = false;
																		local2085.method8436();
																	} else if (local501 == 0 && local2085.aShort81 != 0) {
																		local2085.method8436();
																		local2080 = false;
																	}
																}
															}
															if (local2080) {
																Static213.aClass43_6.method1084(new Class2_Sub6_Sub2(local275, local501));
															}
															Static577.anIntArray643[local990] = local501;
														}
														Static306.aStringArray38[local990] = local218;
														Static52.aStringArray10[local990] = local716;
														Static188.anIntArray181[local990] = local573;
														local275 = null;
														Static2.aBooleanArray32[local990] = local2043;
														break;
													}
												}
												if (local275 != null && Static96.anInt1739 < 200) {
													Static480.aStringArray50[Static96.anInt1739] = local275;
													Static306.aStringArray38[Static96.anInt1739] = local218;
													Static577.anIntArray643[Static96.anInt1739] = local501;
													Static52.aStringArray10[Static96.anInt1739] = local716;
													Static188.anIntArray181[Static96.anInt1739] = local573;
													Static2.aBooleanArray32[Static96.anInt1739] = local2043;
													Static96.anInt1739++;
												}
											}
											Static511.anInt6141 = 2;
											Static206.anInt3566 = Static94.anInt1719;
											local73 = Static96.anInt1739;
											while (local73 > 0) {
												local271 = true;
												local73--;
												for (local685 = 0; local685 < local73; local685++) {
													if (Static406.aClass354_3.anInt9837 != Static577.anIntArray643[local685] && Static577.anIntArray643[local685 + 1] == Static406.aClass354_3.anInt9837 || Static577.anIntArray643[local685] == 0 && Static577.anIntArray643[local685 + 1] != 0) {
														local501 = Static577.anIntArray643[local685];
														Static577.anIntArray643[local685] = Static577.anIntArray643[local685 + 1];
														Static577.anIntArray643[local685 + 1] = local501;
														local689 = Static52.aStringArray10[local685];
														Static52.aStringArray10[local685] = Static52.aStringArray10[local685 + 1];
														Static52.aStringArray10[local685 + 1] = local689;
														local716 = Static480.aStringArray50[local685];
														Static480.aStringArray50[local685] = Static480.aStringArray50[local685 + 1];
														Static480.aStringArray50[local685 + 1] = local716;
														local598 = Static306.aStringArray38[local685];
														Static306.aStringArray38[local685] = Static306.aStringArray38[local685 + 1];
														Static306.aStringArray38[local685 + 1] = local598;
														local990 = Static188.anIntArray181[local685];
														Static188.anIntArray181[local685] = Static188.anIntArray181[local685 + 1];
														Static188.anIntArray181[local685 + 1] = local990;
														local2080 = Static2.aBooleanArray32[local685];
														Static2.aBooleanArray32[local685] = Static2.aBooleanArray32[local685 + 1];
														Static2.aBooleanArray32[local685 + 1] = local2080;
														local271 = false;
													}
												}
												if (local271) {
													break;
												}
											}
											Static667.aClass179_372 = null;
											return true;
										} else if (Static667.aClass179_372 == Static379.aClass179_241) {
											local239 = Static204.aClass6_Sub23_Sub1_1.method8367();
											local73 = Static204.aClass6_Sub23_Sub1_1.method8336();
											local685 = Static204.aClass6_Sub23_Sub1_1.method8403();
											local501 = Static204.aClass6_Sub23_Sub1_1.method8403();
											Static277.method4080();
											Static417.method6238(local501, local685, local73, local239);
											Static667.aClass179_372 = null;
											return true;
										} else if (Static42.aClass179_48 == Static667.aClass179_372) {
											local239 = Static204.aClass6_Sub23_Sub1_1.method8403();
											local73 = Static204.aClass6_Sub23_Sub1_1.method8337();
											local685 = Static204.aClass6_Sub23_Sub1_1.method8336();
											local501 = Static204.aClass6_Sub23_Sub1_1.method8367();
											Static277.method4080();
											Static603.method8299(local239, local501, local73, local685);
											Static667.aClass179_372 = null;
											return true;
										} else if (Static493.aClass179_291 == Static667.aClass179_372) {
											local239 = Static204.aClass6_Sub23_Sub1_1.method8348();
											local275 = Static204.aClass6_Sub23_Sub1_1.method8354();
											Static277.method4080();
											Static199.method2912(local275, local239);
											Static667.aClass179_372 = null;
											return true;
										} else if (Static628.aClass179_358 == Static667.aClass179_372) {
											local239 = Static204.aClass6_Sub23_Sub1_1.method8365();
											Static277.method4080();
											Static270.method3993(local239);
											Static667.aClass179_372 = null;
											return true;
										} else if (Static667.aClass179_372 == Static602.aClass179_346) {
											Static467.anInt8075 = Static94.anInt1719;
											local271 = Static204.aClass6_Sub23_Sub1_1.method8374() == 1;
											@Pc(2520) Class386 local2520 = new Class386(Static204.aClass6_Sub23_Sub1_1);
											@Pc(2524) Class6_Sub2 local2524;
											if (local271) {
												local2524 = Static303.aClass6_Sub2_3;
											} else {
												local2524 = Static34.aClass6_Sub2_1;
											}
											local2520.method8947(local2524);
											Static667.aClass179_372 = null;
											return true;
										} else if (Static667.aClass179_372 == Static534.aClass179_307) {
											local239 = Static204.aClass6_Sub23_Sub1_1.method8403();
											local73 = Static204.aClass6_Sub23_Sub1_1.method8348();
											Static659.aClass363_3.method8558(local239, local73);
											Static667.aClass179_372 = null;
											return true;
										} else if (Static667.aClass179_372 == Static59.aClass179_61) {
											local239 = Static204.aClass6_Sub23_Sub1_1.method8403();
											local73 = Static204.aClass6_Sub23_Sub1_1.method8336();
											Static277.method4080();
											Static607.method8312(local239, local73);
											Static667.aClass179_372 = null;
											return true;
										} else if (Static667.aClass179_372 == Static285.aClass179_186) {
											local239 = Static204.aClass6_Sub23_Sub1_1.method8393();
											Static277.method4080();
											if (local239 == -1) {
												Static601.anInt9806 = -1;
												Static258.anInt4491 = -1;
											} else {
												local73 = local239 >> 14 & 0x3FFF;
												local685 = local239 & 0x3FFF;
												local73 -= Static534.anInt8753;
												local685 -= Static234.anInt4239;
												if (local73 < 0) {
													local73 = 0;
												} else if (Static491.anInt9856 <= local73) {
													local73 = Static491.anInt9856;
												}
												Static601.anInt9806 = (local73 << 9) + 256;
												if (local685 < 0) {
													local685 = 0;
												} else if (local685 >= Static393.anInt6574) {
													local685 = Static393.anInt6574;
												}
												Static258.anInt4491 = (local685 << 9) + 256;
											}
											Static667.aClass179_372 = null;
											return true;
										} else {
											@Pc(2683) boolean local2683;
											if (Static667.aClass179_372 == Static67.aClass179_66) {
												local239 = Static204.aClass6_Sub23_Sub1_1.method8363();
												local73 = Static204.aClass6_Sub23_Sub1_1.method8374();
												local2683 = (local73 & 0x1) == 1;
												while (Static655.anInt10505 > Static204.aClass6_Sub23_Sub1_1.anInt9901) {
													local501 = Static204.aClass6_Sub23_Sub1_1.method8404();
													local573 = Static204.aClass6_Sub23_Sub1_1.method8363();
													local978 = 0;
													if (local573 != 0) {
														local978 = Static204.aClass6_Sub23_Sub1_1.method8374();
														if (local978 == 255) {
															local978 = Static204.aClass6_Sub23_Sub1_1.method8369();
														}
													}
													Static98.method7269(local978, local573 - 1, local2683, local501, local239);
												}
												Static293.anIntArray282[Static453.anInt1620++ & 0x1F] = local239;
												Static667.aClass179_372 = null;
												return true;
											} else if (Static667.aClass179_372 == Static294.aClass179_359) {
												Static63.aBoolean723 = Static204.aClass6_Sub23_Sub1_1.method8343() == 1;
												Static667.aClass179_372 = null;
												return true;
											} else if (Static667.aClass179_372 == Static608.aClass179_349) {
												local239 = Static204.aClass6_Sub23_Sub1_1.method8363();
												local73 = Static204.aClass6_Sub23_Sub1_1.method8374();
												local2683 = (local73 & 0x1) == 1;
												Static109.method1750(local2683, local239);
												Static293.anIntArray282[Static453.anInt1620++ & 0x1F] = local239;
												Static667.aClass179_372 = null;
												return true;
											} else if (Static452.aClass179_269 == Static667.aClass179_372) {
												Static122.method1893(Static136.aClass159_6);
												Static667.aClass179_372 = null;
												return true;
											} else if (Static176.aClass179_121 == Static667.aClass179_372) {
												local239 = Static204.aClass6_Sub23_Sub1_1.method8403();
												if (local239 == 65535) {
													local239 = -1;
												}
												local73 = Static204.aClass6_Sub23_Sub1_1.method8348();
												Static277.method4080();
												Static178.method2509(1, local73, local239, -1);
												Static667.aClass179_372 = null;
												return true;
											} else if (Static667.aClass179_372 == Static669.aClass179_374) {
												local239 = Static204.aClass6_Sub23_Sub1_1.method8397();
												local73 = Static204.aClass6_Sub23_Sub1_1.method8337();
												local685 = Static204.aClass6_Sub23_Sub1_1.method8363();
												if (local685 == 65535) {
													local685 = -1;
												}
												Static426.method6547(local685, local73, local239);
												Static667.aClass179_372 = null;
												return true;
											} else if (Static291.aClass179_191 == Static667.aClass179_372) {
												local239 = Static204.aClass6_Sub23_Sub1_1.method8390();
												local73 = Static204.aClass6_Sub23_Sub1_1.method8365();
												if (local73 == 65535) {
													local73 = -1;
												}
												local685 = Static204.aClass6_Sub23_Sub1_1.method8374();
												Static228.method3314(local685, local73, local239);
												Static667.aClass179_372 = null;
												return true;
											} else if (Static667.aClass179_372 == Static174.aClass179_120) {
												local239 = Static204.aClass6_Sub23_Sub1_1.method8363();
												local73 = Static204.aClass6_Sub23_Sub1_1.method8336();
												local685 = Static204.aClass6_Sub23_Sub1_1.method8348();
												Static277.method4080();
												Static178.method2509(5, local73, local239, local685);
												Static667.aClass179_372 = null;
												return true;
											} else if (Static667.aClass179_372 == Static468.aClass179_280) {
												local206 = Static204.aClass6_Sub23_Sub1_1.method8354();
												local73 = Static204.aClass6_Sub23_Sub1_1.method8363();
												Static277.method4080();
												Static485.method7061(local73, local206);
												Static667.aClass179_372 = null;
												return true;
											} else {
												@Pc(2966) Class6_Sub51 local2966;
												if (Static667.aClass179_372 == Static39.aClass179_43) {
													local239 = Static204.aClass6_Sub23_Sub1_1.method8369();
													local73 = Static204.aClass6_Sub23_Sub1_1.method8393();
													Static277.method4080();
													@Pc(2959) Class6_Sub51 local2959 = (Class6_Sub51) Static262.aClass209_35.method5038((long) local239);
													local2966 = (Class6_Sub51) Static262.aClass209_35.method5038((long) local73);
													if (local2966 != null) {
														Static199.method2913(local2959 == null || local2959.anInt9360 != local2966.anInt9360, false, local2966);
													}
													if (local2959 != null) {
														local2959.method9174();
														Static262.aClass209_35.method5035((long) local73, local2959);
													}
													@Pc(2997) Class321 local2997 = Static286.method4134(local239);
													if (local2997 != null) {
														Static293.method4206(local2997);
													}
													local2997 = Static286.method4134(local73);
													if (local2997 != null) {
														Static293.method4206(local2997);
														Static351.method5107(local2997, true);
													}
													if (Static561.anInt9357 != -1) {
														Static363.method5233(1, Static561.anInt9357);
													}
													Static667.aClass179_372 = null;
													return true;
												} else if (Static667.aClass179_372 == Static109.aClass179_84) {
													local239 = Static204.aClass6_Sub23_Sub1_1.method8374();
													local73 = local239 >> 5;
													local685 = local239 & 0x1F;
													if (local685 == 0) {
														Static539.aClass167Array1[local73] = null;
														Static667.aClass179_372 = null;
														return true;
													}
													@Pc(3056) Class167 local3056 = new Class167();
													local3056.anInt4342 = local685;
													local3056.anInt4341 = Static204.aClass6_Sub23_Sub1_1.method8374();
													if (local3056.anInt4341 >= 0 && local3056.anInt4341 < Static371.aClass9Array110.length) {
														if (local3056.anInt4342 == 1 || local3056.anInt4342 == 10) {
															local3056.anInt4346 = Static204.aClass6_Sub23_Sub1_1.method8363();
															Static204.aClass6_Sub23_Sub1_1.anInt9901 += 6;
														} else if (local3056.anInt4342 >= 2 && local3056.anInt4342 <= 6) {
															if (local3056.anInt4342 == 2) {
																local3056.anInt4348 = 256;
																local3056.anInt4344 = 256;
															}
															if (local3056.anInt4342 == 3) {
																local3056.anInt4344 = 256;
																local3056.anInt4348 = 0;
															}
															if (local3056.anInt4342 == 4) {
																local3056.anInt4348 = 512;
																local3056.anInt4344 = 256;
															}
															if (local3056.anInt4342 == 5) {
																local3056.anInt4348 = 256;
																local3056.anInt4344 = 0;
															}
															if (local3056.anInt4342 == 6) {
																local3056.anInt4348 = 256;
																local3056.anInt4344 = 512;
															}
															local3056.anInt4342 = 2;
															local3056.anInt4343 = Static204.aClass6_Sub23_Sub1_1.method8374();
															local3056.anInt4348 += Static204.aClass6_Sub23_Sub1_1.method8363() - Static534.anInt8753 << 9;
															local3056.anInt4344 += Static204.aClass6_Sub23_Sub1_1.method8363() - Static234.anInt4239 << 9;
															local3056.anInt4337 = Static204.aClass6_Sub23_Sub1_1.method8374() << 2;
															local3056.anInt4336 = Static204.aClass6_Sub23_Sub1_1.method8363();
														}
														local3056.anInt4339 = Static204.aClass6_Sub23_Sub1_1.method8363();
														if (local3056.anInt4339 == 65535) {
															local3056.anInt4339 = -1;
														}
														Static539.aClass167Array1[local73] = local3056;
													}
													Static667.aClass179_372 = null;
													return true;
												} else if (Static476.aClass179_283 == Static667.aClass179_372) {
													local239 = Static204.aClass6_Sub23_Sub1_1.method8393();
													local73 = Static204.aClass6_Sub23_Sub1_1.method8403();
													Static277.method4080();
													if (local73 == 65535) {
														local73 = -1;
													}
													Static614.method8483(local73, local239);
													Static667.aClass179_372 = null;
													return true;
												} else if (Static667.aClass179_372 == Static60.aClass179_62) {
													Static105.anInt1937 = Static204.aClass6_Sub23_Sub1_1.method8384() << 3;
													Static557.anInt9342 = Static204.aClass6_Sub23_Sub1_1.method8391() << 3;
													Static310.anInt5244 = Static204.aClass6_Sub23_Sub1_1.method8397();
													while (Static655.anInt10505 > Static204.aClass6_Sub23_Sub1_1.anInt9901) {
														@Pc(3283) Class159 local3283 = Static88.method1506()[Static204.aClass6_Sub23_Sub1_1.method8374()];
														Static122.method1893(local3283);
													}
													Static667.aClass179_372 = null;
													return true;
												} else if (Static43.aClass179_50 == Static667.aClass179_372) {
													Static122.method1893(Static589.aClass159_15);
													Static667.aClass179_372 = null;
													return true;
												} else if (Static667.aClass179_372 == Static289.aClass179_189) {
													local239 = Static204.aClass6_Sub23_Sub1_1.method8337();
													local73 = Static204.aClass6_Sub23_Sub1_1.method8365() << 2;
													local685 = Static204.aClass6_Sub23_Sub1_1.method8397();
													local501 = Static204.aClass6_Sub23_Sub1_1.method8397();
													local573 = Static204.aClass6_Sub23_Sub1_1.method8397();
													Static277.method4080();
													Static54.method1057(local685, local239, local573, local501, local73);
													Static667.aClass179_372 = null;
													return true;
												} else if (Static667.aClass179_372 == Static179.aClass179_124) {
													local239 = Static204.aClass6_Sub23_Sub1_1.method8365();
													local73 = Static204.aClass6_Sub23_Sub1_1.method8403();
													Static277.method4080();
													Static264.method3896(local239, local73);
													Static667.aClass179_372 = null;
													return true;
												} else if (Static383.aClass179_244 == Static667.aClass179_372) {
													local239 = Static204.aClass6_Sub23_Sub1_1.method8363();
													if (local239 == 65535) {
														local239 = -1;
													}
													local73 = Static204.aClass6_Sub23_Sub1_1.method8374();
													local685 = Static204.aClass6_Sub23_Sub1_1.method8363();
													local501 = Static204.aClass6_Sub23_Sub1_1.method8374();
													local573 = Static204.aClass6_Sub23_Sub1_1.method8363();
													Static351.method5110(local73, local501, false, local685, local239, local573);
													Static667.aClass179_372 = null;
													return true;
												} else {
													@Pc(3459) boolean local3459;
													@Pc(3461) int local3461;
													if (Static667.aClass179_372 == Static395.aClass179_253) {
														local271 = Static204.aClass6_Sub23_Sub1_1.method8374() == 1;
														local275 = Static204.aClass6_Sub23_Sub1_1.method8354();
														local218 = local275;
														if (local271) {
															local218 = Static204.aClass6_Sub23_Sub1_1.method8354();
														}
														local1646 = Static204.aClass6_Sub23_Sub1_1.method8381();
														local1437 = (long) Static204.aClass6_Sub23_Sub1_1.method8363();
														local295 = (long) Static204.aClass6_Sub23_Sub1_1.method8344();
														local1864 = Static204.aClass6_Sub23_Sub1_1.method8374();
														@Pc(3457) long local3457 = (local1437 << 32) + local295;
														local3459 = false;
														local3461 = 0;
														while (true) {
															if (local3461 >= 100) {
																if (local1864 <= 1) {
																	if (Static322.aBoolean346 && !Static377.aBoolean420 || Static525.aBoolean615) {
																		local3459 = true;
																	} else if (Static225.method3276(local218)) {
																		local3459 = true;
																	}
																}
																break;
															}
															if (Static667.aLongArray22[local3461] == local3457) {
																local3459 = true;
																break;
															}
															local3461++;
														}
														if (!local3459 && Static54.anInt1106 == 0) {
															Static667.aLongArray22[Static31.anInt711] = local3457;
															Static31.anInt711 = (Static31.anInt711 + 1) % 100;
															@Pc(3520) String local3520 = Static648.method8832(Static648.method8827(Static204.aClass6_Sub23_Sub1_1));
															if (local1864 == 2 || local1864 == 3) {
																Static593.method8154(local275, "<img=1>" + local275, -1, "<img=1>" + local218, local3520, 9, Static417.method6237(local1646), 0);
															} else if (local1864 == 1) {
																Static593.method8154(local275, "<img=0>" + local275, -1, "<img=0>" + local218, local3520, 9, Static417.method6237(local1646), 0);
															} else {
																Static593.method8154(local275, local275, -1, local218, local3520, 9, Static417.method6237(local1646), 0);
															}
														}
														Static667.aClass179_372 = null;
														return true;
													} else if (Static23.aClass179_20 == Static667.aClass179_372) {
														Static560.anInt1378 = Static204.aClass6_Sub23_Sub1_1.method8340();
														Static322.aBoolean346 = Static204.aClass6_Sub23_Sub1_1.method8374() == 1;
														Static667.aClass179_372 = null;
														return true;
													} else if (Static667.aClass179_372 == Static315.aClass179_207) {
														local239 = Static204.aClass6_Sub23_Sub1_1.method8339();
														local73 = Static204.aClass6_Sub23_Sub1_1.method8393();
														Static277.method4080();
														Static603.method8302(local73, local239);
														Static667.aClass179_372 = null;
														return true;
													} else if (Static667.aClass179_372 == Static22.aClass179_19) {
														local239 = Static204.aClass6_Sub23_Sub1_1.method8336();
														local73 = Static204.aClass6_Sub23_Sub1_1.method8365();
														Static659.aClass363_3.method8560(local239, local73);
														Static667.aClass179_372 = null;
														return true;
													} else if (Static667.aClass179_372 == Static514.aClass179_303) {
														Static122.method1893(Static223.aClass159_8);
														Static667.aClass179_372 = null;
														return true;
													} else if (Static667.aClass179_372 == Static110.aClass179_86) {
														local271 = Static204.aClass6_Sub23_Sub1_1.method8343() == 1;
														Static277.method4080();
														Static178.aBoolean188 = local271;
														Static667.aClass179_372 = null;
														return true;
													} else if (Static32.aClass179_36 == Static667.aClass179_372) {
														Static122.method1893(Static32.aClass159_2);
														Static667.aClass179_372 = null;
														return true;
													} else if (Static667.aClass179_372 == Static555.aClass179_317) {
														local239 = Static204.aClass6_Sub23_Sub1_1.method8363();
														if (local239 == 65535) {
															local239 = -1;
														}
														local73 = Static204.aClass6_Sub23_Sub1_1.method8374();
														local685 = Static204.aClass6_Sub23_Sub1_1.method8363();
														local501 = Static204.aClass6_Sub23_Sub1_1.method8374();
														local573 = Static204.aClass6_Sub23_Sub1_1.method8363();
														Static424.method6293(local239, local73, local573, local685, local501);
														Static667.aClass179_372 = null;
														return true;
													} else if (Static667.aClass179_372 == Static12.aClass179_16) {
														Static667.aClass179_372 = null;
														return false;
													} else if (Static622.aClass179_355 == Static667.aClass179_372) {
														local239 = Static204.aClass6_Sub23_Sub1_1.method8348();
														Static277.method4080();
														Static178.method2509(5, local239, Static659.anInt7559, 0);
														Static667.aClass179_372 = null;
														return true;
													} else if (Static193.aClass179_130 == Static667.aClass179_372) {
														Static239.aString48 = Static655.anInt10505 > 2 ? Static204.aClass6_Sub23_Sub1_1.method8354() : Static52.aClass41_26.method1007(Static616.anInt10077);
														Static206.anInt3564 = Static655.anInt10505 > 0 ? Static204.aClass6_Sub23_Sub1_1.method8363() : -1;
														Static667.aClass179_372 = null;
														if (Static206.anInt3564 == 65535) {
															Static206.anInt3564 = -1;
														}
														return true;
													} else if (Static46.aClass179_53 == Static667.aClass179_372) {
														Static105.anInt1937 = Static204.aClass6_Sub23_Sub1_1.method8384() << 3;
														Static557.anInt9342 = Static204.aClass6_Sub23_Sub1_1.method8341() << 3;
														Static310.anInt5244 = Static204.aClass6_Sub23_Sub1_1.method8337();
														Static667.aClass179_372 = null;
														return true;
													} else if (Static133.aClass179_100 == Static667.aClass179_372) {
														Static277.method4080();
														Static652.method5481();
														Static667.aClass179_372 = null;
														return true;
													} else if (Static29.aClass179_255 == Static667.aClass179_372) {
														local206 = Static204.aClass6_Sub23_Sub1_1.method8354();
														local73 = Static204.aClass6_Sub23_Sub1_1.method8403();
														Static277.method4080();
														Static485.method7061(local73, local206);
														Static667.aClass179_372 = null;
														return true;
													} else if (Static667.aClass179_372 == Static206.aClass179_136) {
														if (Static289.aFrame1 != null) {
															Static138.method2063(Static96.aClass6_Sub22_7.aClass29_Sub18_2.method6277(), false, -1, -1);
														}
														@Pc(3874) byte[] local3874 = new byte[Static655.anInt10505];
														Static204.aClass6_Sub23_Sub1_1.method2876(local3874, Static655.anInt10505);
														local275 = Static232.method3397(Static655.anInt10505, 0, local3874);
														Static135.method2048(Static96.aClass6_Sub22_7.aClass29_Sub16_2.method5742() == 1, true, Static569.aClass380_6, local275);
														Static667.aClass179_372 = null;
														return true;
													} else if (Static225.aClass179_146 == Static667.aClass179_372) {
														local239 = Static204.aClass6_Sub23_Sub1_1.method8336();
														local73 = Static204.aClass6_Sub23_Sub1_1.method8403();
														local685 = Static204.aClass6_Sub23_Sub1_1.method8365();
														Static277.method4080();
														Static411.method6184((local685 << 16) + local73, local239);
														Static667.aClass179_372 = null;
														return true;
													} else if (Static667.aClass179_372 == Static652.aClass179_247) {
														local239 = Static204.aClass6_Sub23_Sub1_1.method8336();
														local73 = Static204.aClass6_Sub23_Sub1_1.method8363();
														Static277.method4080();
														Static278.method8282(local73, local239);
														Static667.aClass179_372 = null;
														return true;
													} else if (Static667.aClass179_372 == Static264.aClass179_170) {
														local239 = Static204.aClass6_Sub23_Sub1_1.method8374();
														if (Static204.aClass6_Sub23_Sub1_1.method8374() == 0) {
															Static490.aClass70Array1[local239] = new Class70();
														} else {
															Static204.aClass6_Sub23_Sub1_1.anInt9901--;
															Static490.aClass70Array1[local239] = new Class70(Static204.aClass6_Sub23_Sub1_1);
														}
														Static667.aClass179_372 = null;
														Static23.anInt568 = Static94.anInt1719;
														return true;
													} else if (Static300.aClass179_196 == Static667.aClass179_372) {
														local239 = Static204.aClass6_Sub23_Sub1_1.method8363();
														local73 = Static204.aClass6_Sub23_Sub1_1.method8337();
														local685 = Static204.aClass6_Sub23_Sub1_1.method8393();
														Static277.method4080();
														local2966 = (Class6_Sub51) Static262.aClass209_35.method5038((long) local685);
														if (local2966 != null) {
															Static199.method2913(local239 != local2966.anInt9360, false, local2966);
														}
														Static418.method6245(false, local239, local685, local73);
														Static667.aClass179_372 = null;
														return true;
													} else if (Static667.aClass179_372 == Static40.aClass179_299) {
														Static122.method1893(Static602.aClass159_16);
														Static667.aClass179_372 = null;
														return true;
													} else if (Static667.aClass179_372 == Static566.aClass179_325) {
														local239 = Static204.aClass6_Sub23_Sub1_1.method8363();
														local73 = Static204.aClass6_Sub23_Sub1_1.method8374();
														local2683 = (local73 & 0x1) == 1;
														Static605.method8304(local2683, local239);
														local501 = Static204.aClass6_Sub23_Sub1_1.method8363();
														for (local573 = 0; local573 < local501; local573++) {
															local978 = Static204.aClass6_Sub23_Sub1_1.method8374();
															if (local978 == 255) {
																local978 = Static204.aClass6_Sub23_Sub1_1.method8393();
															}
															local289 = Static204.aClass6_Sub23_Sub1_1.method8365();
															Static98.method7269(local978, local289 - 1, local2683, local573, local239);
														}
														Static293.anIntArray282[Static453.anInt1620++ & 0x1F] = local239;
														Static667.aClass179_372 = null;
														return true;
													} else if (Static667.aClass179_372 == Static342.aClass179_225) {
														Static346.method5047();
														Static667.aClass179_372 = null;
														return true;
													} else if (Static667.aClass179_372 == Static557.aClass179_320) {
														local239 = Static204.aClass6_Sub23_Sub1_1.method8393();
														local73 = Static204.aClass6_Sub23_Sub1_1.method8403();
														if (local73 == 65535) {
															local73 = -1;
														}
														local685 = Static204.aClass6_Sub23_Sub1_1.method8369();
														Static277.method4080();
														Static640.method8749(local685, local73, local239);
														@Pc(4173) Class216 local4173 = Static340.aClass121_1.method2647(local73);
														Static417.method6238(local4173.anInt6078, local4173.anInt6050, local239, local4173.anInt6072);
														Static421.method6265(local4173.anInt6079, local4173.anInt6081, local4173.anInt6040, local239);
														Static667.aClass179_372 = null;
														return true;
													} else {
														@Pc(4237) boolean local4237;
														@Pc(4235) long local4235;
														if (Static667.aClass179_372 == Static188.aClass179_128) {
															local271 = Static204.aClass6_Sub23_Sub1_1.method8374() == 1;
															local275 = Static204.aClass6_Sub23_Sub1_1.method8354();
															local280 = (long) Static204.aClass6_Sub23_Sub1_1.method8363();
															local285 = (long) Static204.aClass6_Sub23_Sub1_1.method8344();
															local289 = Static204.aClass6_Sub23_Sub1_1.method8374();
															local990 = Static204.aClass6_Sub23_Sub1_1.method8363();
															local4235 = local285 + (local280 << 32);
															local4237 = false;
															@Pc(4245) Class6_Sub2 local4245 = local271 ? Static303.aClass6_Sub2_3 : Static34.aClass6_Sub2_1;
															if (local4245 == null) {
																local4237 = true;
															} else {
																label2141: {
																	for (local379 = 0; local379 < 100; local379++) {
																		if (Static667.aLongArray22[local379] == local4235) {
																			local4237 = true;
																			break label2141;
																		}
																	}
																	if (local289 <= 1 && Static225.method3276(local275)) {
																		local4237 = true;
																	}
																}
															}
															if (!local4237 && Static54.anInt1106 == 0) {
																Static667.aLongArray22[Static31.anInt711] = local4235;
																Static31.anInt711 = (Static31.anInt711 + 1) % 100;
																local1720 = Static418.aClass377_1.method8763(local990).method6589(Static204.aClass6_Sub23_Sub1_1);
																local3461 = local271 ? 42 : 45;
																if (local289 == 2 || local289 == 3) {
																	Static593.method8154(local275, "<img=1>" + local275, local990, "<img=1>" + local275, local1720, local3461, local4245.aString9, 0);
																} else if (local289 == 1) {
																	Static593.method8154(local275, "<img=0>" + local275, local990, "<img=0>" + local275, local1720, local3461, local4245.aString9, 0);
																} else {
																	Static593.method8154(local275, local275, local990, local275, local1720, local3461, local4245.aString9, 0);
																}
															}
															Static667.aClass179_372 = null;
															return true;
														} else if (Static16.aClass179_18 == Static667.aClass179_372) {
															Static449.method6493(Static655.anInt10505, Static204.aClass6_Sub23_Sub1_1, Static569.aClass380_6);
															Static667.aClass179_372 = null;
															return true;
														} else if (Static667.aClass179_372 == Static283.aClass179_183) {
															Static122.method1893(Static448.aClass159_13);
															Static667.aClass179_372 = null;
															return true;
														} else if (Static627.aClass179_357 == Static667.aClass179_372) {
															local239 = Static204.aClass6_Sub23_Sub1_1.method8369();
															Static560.aClass103_3 = Static569.aClass380_6.method8812(local239);
															Static667.aClass179_372 = null;
															return true;
														} else if (Static539.aClass179_308 == Static667.aClass179_372) {
															local239 = Static204.aClass6_Sub23_Sub1_1.method8337();
															local73 = Static204.aClass6_Sub23_Sub1_1.method8367();
															local685 = Static204.aClass6_Sub23_Sub1_1.method8369();
															local501 = Static204.aClass6_Sub23_Sub1_1.method8363();
															Static277.method4080();
															Static675.method9107(local685, local239, local501, local73);
															Static667.aClass179_372 = null;
															return true;
														} else if (Static667.aClass179_372 == Static82.aClass179_74) {
															Static152.aByte45 = Static204.aClass6_Sub23_Sub1_1.method8350();
															if (Static152.aByte45 == 0 || Static152.aByte45 == 1) {
																Static141.aBoolean156 = true;
															}
															Static667.aClass179_372 = null;
															return true;
														} else if (Static465.aClass179_277 == Static667.aClass179_372) {
															local239 = Static204.aClass6_Sub23_Sub1_1.method8336();
															local73 = Static204.aClass6_Sub23_Sub1_1.method8403();
															Static277.method4080();
															Static167.method2407(local73, local239);
															Static667.aClass179_372 = null;
															return true;
														} else if (Static348.aClass179_227 == Static667.aClass179_372) {
															local239 = Static204.aClass6_Sub23_Sub1_1.method8337();
															local73 = Static204.aClass6_Sub23_Sub1_1.method8343();
															local685 = Static204.aClass6_Sub23_Sub1_1.method8393();
															Static242.anIntArray253[local73] = local685;
															Static439.anIntArray496[local73] = local239;
															Static147.anIntArray146[local73] = 1;
															local501 = Static326.anIntArray329[local73] - 1;
															for (local573 = 0; local573 < local501; local573++) {
																if (local685 >= Class274.anIntArray515[local573]) {
																	Static147.anIntArray146[local73] = local573 + 2;
																}
															}
															Static303.anIntArray303[Static42.anInt937++ & 0x1F] = local73;
															Static667.aClass179_372 = null;
															return true;
														} else if (Static667.aClass179_372 == Static28.aClass179_24) {
															local239 = Static204.aClass6_Sub23_Sub1_1.method8369();
															local73 = Static204.aClass6_Sub23_Sub1_1.method8397();
															Static277.method4080();
															Static365.method5272(local239, local73);
															Static667.aClass179_372 = null;
															return true;
														} else if (Static344.aClass179_226 == Static667.aClass179_372) {
															local271 = Static204.aClass6_Sub23_Sub1_1.method8374() == 1;
															local275 = Static204.aClass6_Sub23_Sub1_1.method8354();
															local218 = local275;
															if (local271) {
																local218 = Static204.aClass6_Sub23_Sub1_1.method8354();
															}
															local1646 = (long) Static204.aClass6_Sub23_Sub1_1.method8363();
															local1437 = (long) Static204.aClass6_Sub23_Sub1_1.method8344();
															local990 = Static204.aClass6_Sub23_Sub1_1.method8374();
															local4235 = (local1646 << 32) + local1437;
															local4237 = false;
															local313 = 0;
															while (true) {
																if (local313 >= 100) {
																	if (local990 <= 1) {
																		if (Static322.aBoolean346 && !Static377.aBoolean420 || Static525.aBoolean615) {
																			local4237 = true;
																		} else if (Static225.method3276(local218)) {
																			local4237 = true;
																		}
																	}
																	break;
																}
																if (local4235 == Static667.aLongArray22[local313]) {
																	local4237 = true;
																	break;
																}
																local313++;
															}
															if (!local4237 && Static54.anInt1106 == 0) {
																Static667.aLongArray22[Static31.anInt711] = local4235;
																Static31.anInt711 = (Static31.anInt711 + 1) % 100;
																local373 = Static648.method8832(Static648.method8827(Static204.aClass6_Sub23_Sub1_1));
																if (local990 == 2) {
																	Static593.method8154(local275, "<img=1>" + local275, -1, "<img=1>" + local218, local373, 7, (String) null, 0);
																} else if (local990 == 1) {
																	Static593.method8154(local275, "<img=0>" + local275, -1, "<img=0>" + local218, local373, 7, (String) null, 0);
																} else {
																	Static593.method8154(local275, local275, -1, local218, local373, 3, (String) null, 0);
																}
															}
															Static667.aClass179_372 = null;
															return true;
														} else if (Static667.aClass179_372 == Static209.aClass179_138) {
															local239 = Static204.aClass6_Sub23_Sub1_1.method8393();
															local73 = Static204.aClass6_Sub23_Sub1_1.method8369();
															local685 = Static204.aClass6_Sub23_Sub1_1.method8403();
															if (local685 == 65535) {
																local685 = -1;
															}
															local501 = Static204.aClass6_Sub23_Sub1_1.method8367();
															Static277.method4080();
															if (local501 == 65535) {
																local501 = -1;
															}
															for (local573 = local685; local573 <= local501; local573++) {
																local1437 = (long) local573 + ((long) local239 << 32);
																local1443 = (Class6_Sub42) Static345.aClass209_31.method5038(local1437);
																if (local1443 != null) {
																	local1459 = new Class6_Sub42(local73, local1443.anInt6749);
																	local1443.method9174();
																} else if (local573 == -1) {
																	local1459 = new Class6_Sub42(local73, Static286.method4134(local239).aClass6_Sub42_2.anInt6749);
																} else {
																	local1459 = new Class6_Sub42(local73, -1);
																}
																Static345.aClass209_31.method5035(local1437, local1459);
															}
															Static667.aClass179_372 = null;
															return true;
														} else if (Static667.aClass179_372 == Static662.aClass179_369) {
															local239 = Static204.aClass6_Sub23_Sub1_1.method8397();
															local73 = Static204.aClass6_Sub23_Sub1_1.method8403();
															local685 = Static204.aClass6_Sub23_Sub1_1.method8374();
															local501 = Static204.aClass6_Sub23_Sub1_1.method8363();
															local573 = Static204.aClass6_Sub23_Sub1_1.method8363();
															local978 = Static204.aClass6_Sub23_Sub1_1.method8336();
															local289 = local685 & 0x7;
															local990 = local685 >> 3 & 0xF;
															if (local990 == 15) {
																local990 = -1;
															}
															if (local978 >> 30 == 0) {
																@Pc(5016) Class119 local5016;
																@Pc(4994) Class213 local4994;
																@Pc(5010) Class119 local5010;
																if (local978 >> 29 != 0) {
																	local998 = local978 & 0xFFFF;
																	@Pc(5155) Class6_Sub44 local5155 = (Class6_Sub44) Static349.aClass209_32.method5038((long) local998);
																	if (local5155 != null) {
																		@Pc(5160) Class2_Sub1_Sub1_Sub3_Sub2 local5160 = local5155.aClass2_Sub1_Sub1_Sub3_Sub2_2;
																		if (local573 == 65535) {
																			local573 = -1;
																		}
																		@Pc(5172) Class118 local5172 = local5160.aClass118Array3[local239];
																		local3459 = true;
																		local3461 = local5172.anInt2965;
																		if (local573 != -1 && local3461 != -1) {
																			if (local573 == local3461) {
																				local4994 = Static111.aClass279_4.method6905(local573);
																				if (local4994.aBoolean398 && local4994.anInt6006 != -1) {
																					local5010 = Static334.aClass268_2.method6469(local4994.anInt6006);
																					@Pc(5212) int local5212 = local5010.anInt3012;
																					if (local5212 == 0 || local5212 == 2) {
																						local3459 = false;
																					} else if (local5212 == 1) {
																						local3459 = true;
																					}
																				}
																			} else {
																				local4994 = Static111.aClass279_4.method6905(local573);
																				@Pc(5240) Class213 local5240 = Static111.aClass279_4.method6905(local3461);
																				if (local4994.anInt6006 != -1 && local5240.anInt6006 != -1) {
																					local5016 = Static334.aClass268_2.method6469(local4994.anInt6006);
																					@Pc(5261) Class119 local5261 = Static334.aClass268_2.method6469(local5240.anInt6006);
																					if (local5261.anInt3004 > local5016.anInt3004) {
																						local3459 = false;
																					}
																				}
																			}
																		}
																		if (local3459) {
																			local5172.anInt2972 = local73;
																			local5172.anInt2968 = local289;
																			local5172.anInt2966 = 0;
																			local5172.anInt2971 = local990;
																			local5172.anInt2969 = 1;
																			local5172.anInt2965 = local573;
																			local5172.anInt2967 = local501 + Static90.anInt1698;
																			local5172.anInt2973 = 0;
																			if (Static90.anInt1698 < local5172.anInt2967) {
																				local5172.anInt2973 = -1;
																			}
																			if (local5172.anInt2965 == 65535) {
																				local5172.anInt2965 = -1;
																			}
																			if (local5172.anInt2965 != -1 && Static90.anInt1698 == local5172.anInt2967) {
																				local1879 = Static111.aClass279_4.method6905(local5172.anInt2965).anInt6006;
																				if (local1879 != -1) {
																					local5010 = Static334.aClass268_2.method6469(local1879);
																					if (local5010 != null && local5010.anIntArray167 != null && !local5160.aBoolean329) {
																						Static658.method8966(local5160, 0, local5010);
																					}
																				}
																			}
																		}
																	}
																} else if (local978 >> 28 != 0) {
																	local998 = local978 & 0xFFFF;
																	@Pc(4948) Class2_Sub1_Sub1_Sub3_Sub1 local4948;
																	if (local998 == Static659.anInt7559) {
																		local4948 = Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2;
																	} else {
																		local4948 = Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local998];
																	}
																	if (local4948 != null) {
																		@Pc(4961) Class118 local4961 = local4948.aClass118Array3[local239];
																		if (local573 == 65535) {
																			local573 = -1;
																		}
																		local1667 = true;
																		local379 = local4961.anInt2965;
																		@Pc(5043) Class119 local5043;
																		if (local573 != -1 && local379 != -1) {
																			@Pc(4989) Class213 local4989;
																			if (local379 == local573) {
																				local4989 = Static111.aClass279_4.method6905(local573);
																				if (local4989.aBoolean398 && local4989.anInt6006 != -1) {
																					local5043 = Static334.aClass268_2.method6469(local4989.anInt6006);
																					@Pc(5046) int local5046 = local5043.anInt3012;
																					if (local5046 == 0 || local5046 == 2) {
																						local1667 = false;
																					} else if (local5046 == 1) {
																						local1667 = true;
																					}
																				}
																			} else {
																				local4989 = Static111.aClass279_4.method6905(local573);
																				local4994 = Static111.aClass279_4.method6905(local379);
																				if (local4989.anInt6006 != -1 && local4994.anInt6006 != -1) {
																					local5010 = Static334.aClass268_2.method6469(local4989.anInt6006);
																					local5016 = Static334.aClass268_2.method6469(local4994.anInt6006);
																					if (local5016.anInt3004 > local5010.anInt3004) {
																						local1667 = false;
																					}
																				}
																			}
																		}
																		if (local1667) {
																			local4961.anInt2971 = local990;
																			local4961.anInt2973 = 0;
																			local4961.anInt2972 = local73;
																			local4961.anInt2966 = 0;
																			local4961.anInt2969 = 1;
																			local4961.anInt2965 = local573;
																			local4961.anInt2967 = local501 + Static90.anInt1698;
																			local4961.anInt2968 = local289;
																			if (local4961.anInt2965 == 65535) {
																				local4961.anInt2965 = -1;
																			}
																			if (Static90.anInt1698 < local4961.anInt2967) {
																				local4961.anInt2973 = -1;
																			}
																			if (local4961.anInt2965 != -1 && local4961.anInt2967 == Static90.anInt1698) {
																				local3461 = Static111.aClass279_4.method6905(local4961.anInt2965).anInt6006;
																				if (local3461 != -1) {
																					local5043 = Static334.aClass268_2.method6469(local3461);
																					if (local5043 != null && local5043.anIntArray167 != null && !local4948.aBoolean329) {
																						Static658.method8966(local4948, 0, local5043);
																					}
																				}
																			}
																		}
																	}
																}
															} else {
																local998 = local978 >> 28 & 0x3;
																local1864 = (local978 >> 14 & 0x3FFF) - Static534.anInt8753;
																local1868 = (local978 & 0x3FFF) - Static234.anInt4239;
																if (local1864 >= 0 && local1868 >= 0 && Static491.anInt9856 > local1864 && local1868 < Static393.anInt6574) {
																	local313 = local1864 * 512 + 256;
																	local379 = local1868 * 512 + 256;
																	local3461 = local998;
																	if (local998 < 3 && Static250.method3635(local1864, local1868)) {
																		local3461 = local998 + 1;
																	}
																	@Pc(5448) Class2_Sub1_Sub1_Sub1 local5448 = new Class2_Sub1_Sub1_Sub1(local573, local501, Static90.anInt1698, local998, local3461, local313, Static284.method4118(local313, local998, local379) - local73, local379, local1864, local1864, local1868, local1868, local289);
																	Static129.aClass362_11.method8536(new Class6_Sub4_Sub21(local5448));
																}
															}
															Static667.aClass179_372 = null;
															return true;
														} else if (Static512.aClass179_302 == Static667.aClass179_372) {
															Static122.method1893(Static403.aClass159_11);
															Static667.aClass179_372 = null;
															return true;
														} else if (Static667.aClass179_372 == Static233.aClass179_159) {
															Static233.anInt4181 = Static204.aClass6_Sub23_Sub1_1.method8374();
															Static667.aClass179_372 = null;
															Static61.anInt1166 = Static94.anInt1719;
															return true;
														} else if (Static667.aClass179_372 == Static196.aClass179_134) {
															local239 = Static204.aClass6_Sub23_Sub1_1.method8363();
															local795 = Static204.aClass6_Sub23_Sub1_1.method8391();
															Static277.method4080();
															Static576.method8004(local239, local795);
															Static667.aClass179_372 = null;
															return true;
														} else if (Static667.aClass179_372 == Static42.aClass179_47) {
															for (local239 = 0; local239 < Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1.length; local239++) {
																if (Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local239] != null) {
																	Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local239].anIntArray296 = null;
																	Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local239].anInt5077 = -1;
																}
															}
															for (local73 = 0; local73 < Static490.anInt8336; local73++) {
																Static84.aClass6_Sub44Array1[local73].aClass2_Sub1_Sub1_Sub3_Sub2_2.anIntArray296 = null;
																Static84.aClass6_Sub44Array1[local73].aClass2_Sub1_Sub1_Sub3_Sub2_2.anInt5077 = -1;
															}
															Static667.aClass179_372 = null;
															return true;
														} else if (Static320.aClass179_211 == Static667.aClass179_372) {
															local239 = Static204.aClass6_Sub23_Sub1_1.method8363();
															local73 = Static204.aClass6_Sub23_Sub1_1.method8363();
															local685 = Static204.aClass6_Sub23_Sub1_1.method8363();
															Static277.method4080();
															if (Static109.aClass321ArrayArray1[local239] != null) {
																for (local501 = local73; local501 < local685; local501++) {
																	local573 = Static204.aClass6_Sub23_Sub1_1.method8344();
																	if (local501 < Static109.aClass321ArrayArray1[local239].length && Static109.aClass321ArrayArray1[local239][local501] != null) {
																		Static109.aClass321ArrayArray1[local239][local501].anInt9051 = local573;
																	}
																}
															}
															Static667.aClass179_372 = null;
															return true;
														} else if (Static667.aClass179_372 == Static382.aClass179_242) {
															local239 = Static204.aClass6_Sub23_Sub1_1.method8374();
															local73 = Static204.aClass6_Sub23_Sub1_1.method8374();
															local685 = Static204.aClass6_Sub23_Sub1_1.method8343();
															local501 = Static204.aClass6_Sub23_Sub1_1.method8367() << 2;
															local573 = Static204.aClass6_Sub23_Sub1_1.method8337();
															Static277.method4080();
															Static627.method8632(local239, local501, local73, local573, true, local685);
															Static667.aClass179_372 = null;
															return true;
														} else if (Static667.aClass179_372 == Static312.aClass179_294) {
															Static277.method4080();
															Static641.method8754();
															Static667.aClass179_372 = null;
															return true;
														} else if (Static667.aClass179_372 == Static277.aClass179_182) {
															local239 = Static204.aClass6_Sub23_Sub1_1.method8363();
															@Pc(5683) Class2_Sub1_Sub1_Sub3_Sub1 local5683;
															if (local239 == Static659.anInt7559) {
																local5683 = Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2;
															} else {
																local5683 = Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local239];
															}
															if (local5683 == null) {
																Static667.aClass179_372 = null;
																return true;
															}
															local685 = Static204.aClass6_Sub23_Sub1_1.method8363();
															local501 = Static204.aClass6_Sub23_Sub1_1.method8374();
															local1088 = (local685 & 0x8000) != 0;
															if (local5683.aString45 != null && local5683.aClass271_1 != null) {
																local575 = false;
																if (local501 <= 1) {
																	if (!local1088 && (Static322.aBoolean346 && !Static377.aBoolean420 || Static525.aBoolean615)) {
																		local575 = true;
																	} else if (Static225.method3276(local5683.aString45)) {
																		local575 = true;
																	}
																}
																if (!local575 && Static54.anInt1106 == 0) {
																	local990 = -1;
																	if (local1088) {
																		local685 &= 0x7FFF;
																		@Pc(5762) Class141 local5762 = Static355.method5136(Static204.aClass6_Sub23_Sub1_1);
																		local990 = local5762.anInt3636;
																		local598 = local5762.aClass6_Sub4_Sub13_1.method6589(Static204.aClass6_Sub23_Sub1_1);
																	} else {
																		local598 = Static648.method8832(Static648.method8827(Static204.aClass6_Sub23_Sub1_1));
																	}
																	local5683.aString66 = local598.trim();
																	local5683.anInt5098 = local685 & 0xFF;
																	local5683.anInt5106 = 150;
																	local5683.anInt5056 = local685 >> 8;
																	if (local501 == 1 || local501 == 2) {
																		local998 = local1088 ? 17 : 1;
																	} else {
																		local998 = local1088 ? 17 : 2;
																	}
																	if (local501 == 2) {
																		Static593.method8154(local5683.aString46, "<img=1>" + local5683.method3519(), local990, "<img=1>" + local5683.method3514(), local598, local998, (String) null, 0);
																	} else if (local501 == 1) {
																		Static593.method8154(local5683.aString46, "<img=0>" + local5683.method3519(), local990, "<img=0>" + local5683.method3514(), local598, local998, (String) null, 0);
																	} else {
																		Static593.method8154(local5683.aString46, local5683.method3519(), local990, local5683.method3514(), local598, local998, (String) null, 0);
																	}
																}
															}
															Static667.aClass179_372 = null;
															return true;
														} else if (Static667.aClass179_372 == Static484.aClass179_289) {
															Static122.method1893(Static435.aClass159_12);
															Static667.aClass179_372 = null;
															return true;
														} else if (Static603.aClass179_347 == Static667.aClass179_372) {
															local206 = Static204.aClass6_Sub23_Sub1_1.method8354();
															local275 = Static648.method8832(Static648.method8827(Static204.aClass6_Sub23_Sub1_1));
															Static55.method3549(local206, local206, local206, 6, 0, local275);
															Static667.aClass179_372 = null;
															return true;
														} else if (Static269.aClass179_178 == Static667.aClass179_372) {
															Static483.method7043(false);
															Static667.aClass179_372 = null;
															return false;
														} else if (Static496.aClass179_342 == Static667.aClass179_372) {
															Static477.anInt8198 = Static204.aClass6_Sub23_Sub1_1.method8374();
															for (local239 = 0; local239 < Static477.anInt8198; local239++) {
																Static572.aStringArray58[local239] = Static204.aClass6_Sub23_Sub1_1.method8354();
																Static658.aStringArray65[local239] = Static204.aClass6_Sub23_Sub1_1.method8354();
																if (Static658.aStringArray65[local239].equals("")) {
																	Static658.aStringArray65[local239] = Static572.aStringArray58[local239];
																}
																Static602.aStringArray63[local239] = Static204.aClass6_Sub23_Sub1_1.method8354();
																Static123.aStringArray18[local239] = Static204.aClass6_Sub23_Sub1_1.method8354();
																if (Static123.aStringArray18[local239].equals("")) {
																	Static123.aStringArray18[local239] = Static602.aStringArray63[local239];
																}
																Static287.aBooleanArray17[local239] = false;
															}
															Static206.anInt3566 = Static94.anInt1719;
															Static667.aClass179_372 = null;
															return true;
														} else if (Static33.aClass179_38 == Static667.aClass179_372) {
															Static278.method8280();
															Static667.aClass179_372 = null;
															return false;
														} else if (Static667.aClass179_372 == Static351.aClass179_230) {
															local239 = Static204.aClass6_Sub23_Sub1_1.method8343();
															local73 = Static204.aClass6_Sub23_Sub1_1.method8367();
															Static659.aClass363_3.method8560(local239, local73);
															Static667.aClass179_372 = null;
															return true;
														} else if (Static374.aClass179_240 == Static667.aClass179_372) {
															Static122.method1893(Static82.aClass159_5);
															Static667.aClass179_372 = null;
															return true;
														} else if (Static667.aClass179_372 == Static109.aClass179_85) {
															Static147.anInt2503 = Static204.aClass6_Sub23_Sub1_1.method8337();
															Static464.anInt8029 = Static204.aClass6_Sub23_Sub1_1.method8397();
															Static667.aClass179_372 = null;
															return true;
														} else if (Static667.aClass179_372 == Static650.aClass179_366) {
															Static260.method8775(Static204.aClass6_Sub23_Sub1_1.method8354());
															Static667.aClass179_372 = null;
															return true;
														} else if (Static389.aClass179_250 == Static667.aClass179_372) {
															local239 = Static204.aClass6_Sub23_Sub1_1.method8369();
															if (Static375.anInt6324 != local239) {
																Static375.anInt6324 = local239;
																Static295.method4225(Static542.aClass357_25, -1, -1);
															}
															Static667.aClass179_372 = null;
															return true;
														} else if (Static104.aClass179_82 == Static667.aClass179_372) {
															Static484.method7047(Static655.anInt10505, Static204.aClass6_Sub23_Sub1_1);
															Static667.aClass179_372 = null;
															return true;
														} else if (Static220.aClass179_143 == Static667.aClass179_372) {
															local206 = Static204.aClass6_Sub23_Sub1_1.method8354();
															@Pc(6143) Object[] local6143 = new Object[local206.length() + 1];
															for (local685 = local206.length() - 1; local685 >= 0; local685--) {
																if (local206.charAt(local685) == 's') {
																	local6143[local685 + 1] = Static204.aClass6_Sub23_Sub1_1.method8354();
																} else {
																	local6143[local685 + 1] = Integer.valueOf(Static204.aClass6_Sub23_Sub1_1.method8369());
																}
															}
															local6143[0] = Integer.valueOf(Static204.aClass6_Sub23_Sub1_1.method8369());
															Static277.method4080();
															@Pc(6195) Class6_Sub49 local6195 = new Class6_Sub49();
															local6195.anObjectArray35 = local6143;
															Static295.method4226(local6195);
															Static667.aClass179_372 = null;
															return true;
														} else if (Static667.aClass179_372 == Static53.aClass179_56) {
															Static105.aClass203_1 = Static27.method6640(Static204.aClass6_Sub23_Sub1_1.method8374());
															Static667.aClass179_372 = null;
															return true;
														} else if (Static231.aClass179_153 == Static667.aClass179_372) {
															Static122.method1893(Static221.aClass159_7);
															Static667.aClass179_372 = null;
															return true;
														} else if (Static667.aClass179_372 == Static542.aClass179_310) {
															Static105.anInt1937 = Static204.aClass6_Sub23_Sub1_1.method8341() << 3;
															Static310.anInt5244 = Static204.aClass6_Sub23_Sub1_1.method8343();
															Static557.anInt9342 = Static204.aClass6_Sub23_Sub1_1.method8350() << 3;
															for (@Pc(6251) Class6_Sub52 local6251 = (Class6_Sub52) Static33.aClass209_3.method5037(); local6251 != null; local6251 = (Class6_Sub52) Static33.aClass209_3.method5036()) {
																local73 = (int) (local6251.aLong314 >> 28 & 0x3L);
																local685 = (int) (local6251.aLong314 & 0x3FFFL);
																local501 = local685 - Static534.anInt8753;
																local573 = (int) (local6251.aLong314 >> 14 & 0x3FFFL);
																local978 = local573 - Static234.anInt4239;
																if (local73 == Static310.anInt5244 && Static557.anInt9342 <= local501 && local501 < Static557.anInt9342 + 8 && Static105.anInt1937 <= local978 && local978 < Static105.anInt1937 + 8) {
																	local6251.method9174();
																	if (local501 >= 0 && local978 >= 0 && local501 < Static491.anInt9856 && local978 < Static393.anInt6574) {
																		Static529.method8525(Static310.anInt5244, local501, local978);
																	}
																}
															}
															@Pc(6352) Class6_Sub45 local6352;
															for (local6352 = (Class6_Sub45) Static464.aClass362_52.method8538(); local6352 != null; local6352 = (Class6_Sub45) Static464.aClass362_52.method8530()) {
																if (Static557.anInt9342 <= local6352.anInt8112 && local6352.anInt8112 < Static557.anInt9342 + 8 && Static105.anInt1937 <= local6352.anInt8113 && Static105.anInt1937 + 8 > local6352.anInt8113 && local6352.anInt8116 == Static310.anInt5244) {
																	local6352.aBoolean558 = true;
																}
															}
															for (local6352 = (Class6_Sub45) Static467.aClass362_53.method8538(); local6352 != null; local6352 = (Class6_Sub45) Static467.aClass362_53.method8530()) {
																if (Static557.anInt9342 <= local6352.anInt8112 && local6352.anInt8112 < Static557.anInt9342 + 8 && Static105.anInt1937 <= local6352.anInt8113 && local6352.anInt8113 < Static105.anInt1937 + 8 && Static310.anInt5244 == local6352.anInt8116) {
																	local6352.aBoolean558 = true;
																}
															}
															Static667.aClass179_372 = null;
															return true;
														} else if (Static667.aClass179_372 == Static646.aClass179_363) {
															if (Static561.anInt9357 != -1) {
																Static363.method5233(0, Static561.anInt9357);
															}
															Static667.aClass179_372 = null;
															return true;
														} else if (Static520.aClass179_324 == Static667.aClass179_372) {
															local239 = Static204.aClass6_Sub23_Sub1_1.method8393();
															local73 = Static204.aClass6_Sub23_Sub1_1.method8365();
															Static277.method4080();
															Static576.method8004(local73, local239);
															Static667.aClass179_372 = null;
															return true;
														} else if (Static667.aClass179_372 == Static56.aClass179_59) {
															if (Static261.method3800(Static556.anInt9319)) {
																Static551.anInt8501 = (int) ((float) Static204.aClass6_Sub23_Sub1_1.method8363() * 2.5F);
															} else {
																Static551.anInt8501 = Static204.aClass6_Sub23_Sub1_1.method8363() * 30;
															}
															Static61.anInt1166 = Static94.anInt1719;
															Static667.aClass179_372 = null;
															return true;
														} else if (Static667.aClass179_372 == Static588.aClass179_343) {
															local239 = Static204.aClass6_Sub23_Sub1_1.method8374();
															Static277.method4080();
															Static667.aClass179_372 = null;
															Static70.anInt1340 = local239;
															return true;
														} else {
															@Pc(6742) Class232 local6742;
															if (Static319.aClass179_210 == Static667.aClass179_372) {
																Static595.anInt9704 = Static94.anInt1719;
																if (Static655.anInt10505 == 0) {
																	Static145.aString26 = null;
																	Static508.aString136 = null;
																	Static619.anInt10114 = 0;
																	Static365.aClass232Array1 = null;
																	Static667.aClass179_372 = null;
																	return true;
																}
																Static508.aString136 = Static204.aClass6_Sub23_Sub1_1.method8354();
																local271 = Static204.aClass6_Sub23_Sub1_1.method8374() == 1;
																if (local271) {
																	Static204.aClass6_Sub23_Sub1_1.method8354();
																}
																@Pc(6587) long local6587 = Static204.aClass6_Sub23_Sub1_1.method8381();
																Static145.aString26 = Static74.method1301(local6587);
																Static648.aByte147 = Static204.aClass6_Sub23_Sub1_1.method8391();
																local501 = Static204.aClass6_Sub23_Sub1_1.method8374();
																if (local501 == 255) {
																	Static667.aClass179_372 = null;
																	return true;
																}
																Static619.anInt10114 = local501;
																@Pc(6611) Class232[] local6611 = new Class232[100];
																for (local978 = 0; local978 < Static619.anInt10114; local978++) {
																	local6611[local978] = new Class232();
																	local6611[local978].aString87 = Static204.aClass6_Sub23_Sub1_1.method8354();
																	local271 = Static204.aClass6_Sub23_Sub1_1.method8374() == 1;
																	if (local271) {
																		local6611[local978].aString86 = Static204.aClass6_Sub23_Sub1_1.method8354();
																	} else {
																		local6611[local978].aString86 = local6611[local978].aString87;
																	}
																	local6611[local978].aString85 = Static573.method4494(local6611[local978].aString86);
																	local6611[local978].anInt6343 = Static204.aClass6_Sub23_Sub1_1.method8363();
																	local6611[local978].aByte107 = Static204.aClass6_Sub23_Sub1_1.method8391();
																	local6611[local978].aString88 = Static204.aClass6_Sub23_Sub1_1.method8354();
																	if (local6611[local978].aString86.equals(Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aString45)) {
																		Static509.aByte124 = local6611[local978].aByte107;
																	}
																}
																local998 = Static619.anInt10114;
																while (local998 > 0) {
																	local2043 = true;
																	local998--;
																	for (local1864 = 0; local1864 < local998; local1864++) {
																		if (local6611[local1864].aString85.compareTo(local6611[local1864 + 1].aString85) > 0) {
																			local6742 = local6611[local1864];
																			local6611[local1864] = local6611[local1864 + 1];
																			local2043 = false;
																			local6611[local1864 + 1] = local6742;
																		}
																	}
																	if (local2043) {
																		break;
																	}
																}
																Static667.aClass179_372 = null;
																Static365.aClass232Array1 = local6611;
																return true;
															} else if (Static667.aClass179_372 == Static543.aClass179_376) {
																Static122.method1893(Static385.aClass159_10);
																Static667.aClass179_372 = null;
																return true;
															} else if (Static667.aClass179_372 == Static219.aClass179_141) {
																Static426.anInt7557 = Static204.aClass6_Sub23_Sub1_1.method8374();
																Static667.aClass179_372 = null;
																return true;
															} else if (Static27.aClass179_274 == Static667.aClass179_372) {
																Static617.anInt10079 = Static94.anInt1719;
																local271 = Static204.aClass6_Sub23_Sub1_1.method8374() == 1;
																if (Static655.anInt10505 != 1) {
																	if (local271) {
																		Static150.aClass145_2 = new Class145(Static204.aClass6_Sub23_Sub1_1);
																	} else {
																		Static150.aClass145_1 = new Class145(Static204.aClass6_Sub23_Sub1_1);
																	}
																	Static667.aClass179_372 = null;
																	return true;
																}
																if (local271) {
																	Static150.aClass145_2 = null;
																} else {
																	Static150.aClass145_1 = null;
																}
																Static667.aClass179_372 = null;
																return true;
															} else if (Static667.aClass179_372 == Static430.aClass179_353) {
																local239 = Static204.aClass6_Sub23_Sub1_1.method8336();
																Static277.method4080();
																@Pc(6862) Class6_Sub51 local6862 = (Class6_Sub51) Static262.aClass209_35.method5038((long) local239);
																if (local6862 != null) {
																	Static199.method2913(true, false, local6862);
																}
																if (Static590.aClass321_53 != null) {
																	Static293.method4206(Static590.aClass321_53);
																	Static590.aClass321_53 = null;
																}
																Static667.aClass179_372 = null;
																return true;
															} else if (Static667.aClass179_372 == Static541.aClass179_238) {
																local239 = Static204.aClass6_Sub23_Sub1_1.method8336();
																Static277.method4080();
																Static178.method2509(3, local239, -1, -1);
																Static667.aClass179_372 = null;
																return true;
															} else if (Static9.aClass179_14 == Static667.aClass179_372) {
																local239 = Static204.aClass6_Sub23_Sub1_1.method8363();
																if (local239 == 65535) {
																	local239 = -1;
																}
																local73 = Static204.aClass6_Sub23_Sub1_1.method8374();
																local685 = Static204.aClass6_Sub23_Sub1_1.method8363();
																local501 = Static204.aClass6_Sub23_Sub1_1.method8374();
																Static351.method5110(local73, local501, true, local685, local239, 256);
																Static667.aClass179_372 = null;
																return true;
															} else if (Static667.aClass179_372 == Static327.aClass179_218) {
																local206 = Static204.aClass6_Sub23_Sub1_1.method8354();
																local2683 = Static204.aClass6_Sub23_Sub1_1.method8374() == 1;
																if (local2683) {
																	local275 = Static204.aClass6_Sub23_Sub1_1.method8354();
																} else {
																	local275 = local206;
																}
																local501 = Static204.aClass6_Sub23_Sub1_1.method8363();
																@Pc(6970) byte local6970 = Static204.aClass6_Sub23_Sub1_1.method8391();
																local575 = false;
																if (local6970 == -128) {
																	local575 = true;
																}
																if (local575) {
																	if (Static619.anInt10114 == 0) {
																		Static667.aClass179_372 = null;
																		return true;
																	}
																	for (local289 = 0; Static619.anInt10114 > local289 && (!Static365.aClass232Array1[local289].aString86.equals(local275) || local501 != Static365.aClass232Array1[local289].anInt6343); local289++) {
																	}
																	if (Static619.anInt10114 > local289) {
																		while (Static619.anInt10114 - 1 > local289) {
																			Static365.aClass232Array1[local289] = Static365.aClass232Array1[local289 + 1];
																			local289++;
																		}
																		Static619.anInt10114--;
																		Static365.aClass232Array1[Static619.anInt10114] = null;
																	}
																} else {
																	local598 = Static204.aClass6_Sub23_Sub1_1.method8354();
																	local6742 = new Class232();
																	local6742.aString87 = local206;
																	local6742.aString86 = local275;
																	local6742.aString85 = Static573.method4494(local6742.aString86);
																	local6742.aByte107 = local6970;
																	local6742.aString88 = local598;
																	local6742.anInt6343 = local501;
																	for (local998 = Static619.anInt10114 - 1; local998 >= 0; local998--) {
																		local1864 = Static365.aClass232Array1[local998].aString85.compareTo(local6742.aString85);
																		if (local1864 == 0) {
																			Static365.aClass232Array1[local998].anInt6343 = local501;
																			Static365.aClass232Array1[local998].aByte107 = local6970;
																			Static365.aClass232Array1[local998].aString88 = local598;
																			if (local275.equals(Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aString45)) {
																				Static509.aByte124 = local6970;
																			}
																			Static595.anInt9704 = Static94.anInt1719;
																			Static667.aClass179_372 = null;
																			return true;
																		}
																		if (local1864 < 0) {
																			break;
																		}
																	}
																	if (Static619.anInt10114 >= Static365.aClass232Array1.length) {
																		Static667.aClass179_372 = null;
																		return true;
																	}
																	for (local1864 = Static619.anInt10114 - 1; local1864 > local998; local1864--) {
																		Static365.aClass232Array1[local1864 + 1] = Static365.aClass232Array1[local1864];
																	}
																	if (Static619.anInt10114 == 0) {
																		Static365.aClass232Array1 = new Class232[100];
																	}
																	Static365.aClass232Array1[local998 + 1] = local6742;
																	Static619.anInt10114++;
																	if (local275.equals(Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aString45)) {
																		Static509.aByte124 = local6970;
																	}
																}
																Static667.aClass179_372 = null;
																Static595.anInt9704 = Static94.anInt1719;
																return true;
															} else if (Static85.aClass179_75 == Static667.aClass179_372) {
																@Pc(7197) int[] local7197 = new int[4];
																for (local73 = 0; local73 < 4; local73++) {
																	local7197[local73] = Static204.aClass6_Sub23_Sub1_1.method8365();
																}
																local685 = Static204.aClass6_Sub23_Sub1_1.method8343();
																local501 = Static204.aClass6_Sub23_Sub1_1.method8363();
																@Pc(7226) Class6_Sub44 local7226 = (Class6_Sub44) Static349.aClass209_32.method5038((long) local501);
																if (local7226 != null) {
																	Static389.method5546(local685, local7197, local7226.aClass2_Sub1_Sub1_Sub3_Sub2_2);
																}
																Static667.aClass179_372 = null;
																return true;
															} else if (Static480.aClass179_287 == Static667.aClass179_372) {
																local239 = Static204.aClass6_Sub23_Sub1_1.method8363();
																local73 = Static204.aClass6_Sub23_Sub1_1.method8374();
																Static277.method4080();
																Static380.method5385(local239, true, local73);
																Static667.aClass179_372 = null;
																return true;
															} else if (Static581.aClass179_334 == Static667.aClass179_372) {
																Static510.method7253();
																Static667.aClass179_372 = null;
																return true;
															} else if (Static667.aClass179_372 == Static477.aClass179_284) {
																Static483.method7043(Static618.aBoolean708);
																Static667.aClass179_372 = null;
																return false;
															} else if (Static582.aClass179_338 == Static667.aClass179_372) {
																Static14.anInt432 = Static204.aClass6_Sub23_Sub1_1.method8395();
																Static61.anInt1166 = Static94.anInt1719;
																Static667.aClass179_372 = null;
																return true;
															} else {
																Static664.method9007((Throwable) null, "T1 - " + (Static667.aClass179_372 == null ? -1 : Static667.aClass179_372.method4112()) + "," + (Static398.aClass179_257 == null ? -1 : Static398.aClass179_257.method4112()) + "," + (Static34.aClass179_39 == null ? -1 : Static34.aClass179_39.method4112()) + " - " + Static655.anInt10505);
																Static483.method7043(false);
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
	}
}
