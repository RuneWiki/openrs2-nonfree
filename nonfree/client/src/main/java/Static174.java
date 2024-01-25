import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!is", name = "d", descriptor = "J")
	public static long aLong119 = -1L;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(I)Z")
	public static boolean method2816() throws IOException {
		if (Static125.aClass11_5 == null) {
			return false;
		}
		@Pc(13) int local13 = Static125.aClass11_5.method133();
		if (local13 == 0) {
			return false;
		}
		@Pc(70) int local70;
		if (Static300.aClass22_246 == null) {
			if (Static330.aBoolean513) {
				Static125.aClass11_5.method131(0, 1, Static146.aClass4_Sub12_Sub1_3.aByteArray36);
				local13--;
				Static330.aBoolean513 = false;
				Static138.anInt2826++;
			}
			Static146.aClass4_Sub12_Sub1_3.anInt2997 = 0;
			if (Static146.aClass4_Sub12_Sub1_3.method1141()) {
				if (local13 == 0) {
					return false;
				}
				local13--;
				Static125.aClass11_5.method131(1, 1, Static146.aClass4_Sub12_Sub1_3.aByteArray36);
				Static138.anInt2826++;
			}
			Static330.aBoolean513 = true;
			@Pc(66) Class22[] local66 = Static149.method2553();
			local70 = Static146.aClass4_Sub12_Sub1_3.method1140();
			if (local70 < 0 || local70 >= local66.length) {
				throw new IOException("invo:" + local70 + " ip:" + Static146.aClass4_Sub12_Sub1_3.anInt2997);
			}
			Static300.aClass22_246 = local66[local70];
			Static454.anInt4075 = Static300.aClass22_246.anInt468;
		}
		if (Static454.anInt4075 == -1) {
			if (local13 <= 0) {
				return false;
			}
			Static125.aClass11_5.method131(0, 1, Static146.aClass4_Sub12_Sub1_3.aByteArray36);
			local13--;
			Static138.anInt2826++;
			Static454.anInt4075 = Static146.aClass4_Sub12_Sub1_3.aByteArray36[0] & 0xFF;
		}
		if (Static454.anInt4075 == -2) {
			if (local13 <= 1) {
				return false;
			}
			Static125.aClass11_5.method131(0, 2, Static146.aClass4_Sub12_Sub1_3.aByteArray36);
			Static146.aClass4_Sub12_Sub1_3.anInt2997 = 0;
			local13 -= 2;
			Static454.anInt4075 = Static146.aClass4_Sub12_Sub1_3.method2536();
			Static138.anInt2826 += 2;
		}
		if (local13 < Static454.anInt4075) {
			return false;
		}
		Static146.aClass4_Sub12_Sub1_3.anInt2997 = 0;
		Static125.aClass11_5.method131(0, Static454.anInt4075, Static146.aClass4_Sub12_Sub1_3.aByteArray36);
		Static316.aClass22_257 = Static380.aClass22_294;
		Static138.anInt2826 += Static454.anInt4075;
		Static410.anInt6735 = 0;
		Static380.aClass22_294 = Static35.aClass22_42;
		Static35.aClass22_42 = Static300.aClass22_246;
		if (Static48.aClass22_53 == Static300.aClass22_246) {
			Static244.method2572(Static435.aClass21_17);
			Static300.aClass22_246 = null;
			return true;
		}
		@Pc(212) String local212;
		@Pc(206) boolean local206;
		@Pc(210) String local210;
		@Pc(224) int local224;
		@Pc(228) int local228;
		@Pc(251) String local251;
		@Pc(230) boolean local230;
		if (Static300.aClass22_246 == Static143.aClass22_125) {
			local206 = Static146.aClass4_Sub12_Sub1_3.method2490() == 1;
			local210 = Static146.aClass4_Sub12_Sub1_3.method2537();
			local212 = local210;
			if (local206) {
				local212 = Static146.aClass4_Sub12_Sub1_3.method2537();
			}
			local224 = Static146.aClass4_Sub12_Sub1_3.method2490();
			local228 = Static146.aClass4_Sub12_Sub1_3.method2536();
			local230 = false;
			if (local224 <= 1 && Static239.method3549(local212)) {
				local230 = true;
			}
			if (!local230 && Static65.anInt1373 == 0) {
				local251 = Static445.aClass81_2.method2258(local228).method234(Static146.aClass4_Sub12_Sub1_3);
				if (local224 == 2) {
					Static426.method5438(local228, "<img=1>" + local212, local251, null, 0, "<img=1>" + local210, 25);
				} else if (local224 == 1) {
					Static426.method5438(local228, "<img=0>" + local212, local251, null, 0, "<img=0>" + local210, 25);
				} else {
					Static426.method5438(local228, local212, local251, null, 0, local210, 25);
				}
			}
			Static300.aClass22_246 = null;
			return true;
		}
		@Pc(327) int local327;
		@Pc(335) int local335;
		if (Static300.aClass22_246 == Static7.aClass22_254) {
			local327 = Static146.aClass4_Sub12_Sub1_3.method2491();
			local70 = Static146.aClass4_Sub12_Sub1_3.method2536();
			local335 = Static146.aClass4_Sub12_Sub1_3.method2536();
			if (Static326.method4415(local70)) {
				Static243.method3562(local327, local335);
			}
			Static300.aClass22_246 = null;
			return true;
		} else if (Static300.aClass22_246 == Static223.aClass22_191) {
			local327 = Static146.aClass4_Sub12_Sub1_3.method2536();
			local210 = Static146.aClass4_Sub12_Sub1_3.method2537();
			@Pc(366) Object[] local366 = new Object[local210.length() + 1];
			for (local224 = local210.length() - 1; local224 >= 0; local224--) {
				if (local210.charAt(local224) == 's') {
					local366[local224 + 1] = Static146.aClass4_Sub12_Sub1_3.method2537();
				} else {
					local366[local224 + 1] = Integer.valueOf(Static146.aClass4_Sub12_Sub1_3.method2529());
				}
			}
			local366[0] = Integer.valueOf(Static146.aClass4_Sub12_Sub1_3.method2529());
			if (Static326.method4415(local327)) {
				@Pc(421) Class4_Sub34 local421 = new Class4_Sub34();
				local421.anObjectArray4 = local366;
				Static271.method3894(local421);
			}
			Static300.aClass22_246 = null;
			return true;
		} else if (Static296.aClass22_241 == Static300.aClass22_246) {
			Static244.method2572(Static309.aClass21_13);
			Static300.aClass22_246 = null;
			return true;
		} else if (Static195.aClass22_167 == Static300.aClass22_246) {
			Static230.method3470();
			Static300.aClass22_246 = null;
			return false;
		} else if (Static352.aClass22_282 == Static300.aClass22_246) {
			local327 = Static146.aClass4_Sub12_Sub1_3.method2520();
			local70 = Static146.aClass4_Sub12_Sub1_3.method2490();
			local335 = Static146.aClass4_Sub12_Sub1_3.method2548();
			if (local335 == 65535) {
				local335 = -1;
			}
			Static427.method5456(local335, local70, local327);
			Static300.aClass22_246 = null;
			return true;
		} else if (Static239.aClass22_203 == Static300.aClass22_246) {
			local327 = Static146.aClass4_Sub12_Sub1_3.method2493();
			local70 = Static146.aClass4_Sub12_Sub1_3.method2515();
			if (local70 == 65535) {
				local70 = -1;
			}
			local335 = Static146.aClass4_Sub12_Sub1_3.method2490();
			Static411.method5274(local335, local327, local70);
			Static300.aClass22_246 = null;
			return true;
		} else {
			@Pc(535) String local535;
			if (Static300.aClass22_246 == Static352.aClass22_281) {
				local327 = Static146.aClass4_Sub12_Sub1_3.method2489();
				local70 = Static146.aClass4_Sub12_Sub1_3.method2523();
				local335 = Static146.aClass4_Sub12_Sub1_3.method2548();
				if (local335 == 65535) {
					local335 = -1;
				}
				local535 = Static146.aClass4_Sub12_Sub1_3.method2537();
				if (local327 >= 1 && local327 <= 8) {
					if (local535.equalsIgnoreCase("null")) {
						local535 = null;
					}
					Static349.aStringArray29[local327 - 1] = local535;
					Static272.anIntArray333[local327 - 1] = local335;
					Static217.aBooleanArray13[local327 - 1] = local70 == 0;
				}
				Static300.aClass22_246 = null;
				return true;
			} else if (Static424.aClass22_319 == Static300.aClass22_246) {
				local327 = Static146.aClass4_Sub12_Sub1_3.method2490();
				local70 = local327 >> 5;
				local335 = local327 & 0x1F;
				if (local335 == 0) {
					Static306.aClass38Array1[local70] = null;
					Static300.aClass22_246 = null;
					return true;
				}
				@Pc(610) Class38 local610 = new Class38();
				local610.anInt891 = local335;
				local610.anInt886 = Static146.aClass4_Sub12_Sub1_3.method2490();
				if (local610.anInt886 >= 0 && local610.anInt886 < Static59.aClass57Array3.length) {
					if (local610.anInt891 == 1 || local610.anInt891 == 10) {
						local610.anInt885 = Static146.aClass4_Sub12_Sub1_3.method2536();
						Static146.aClass4_Sub12_Sub1_3.anInt2997 += 6;
					} else if (local610.anInt891 >= 2 && local610.anInt891 <= 6) {
						if (local610.anInt891 == 2) {
							local610.anInt894 = 64;
							local610.anInt892 = 64;
						}
						if (local610.anInt891 == 3) {
							local610.anInt894 = 64;
							local610.anInt892 = 0;
						}
						if (local610.anInt891 == 4) {
							local610.anInt894 = 64;
							local610.anInt892 = 128;
						}
						if (local610.anInt891 == 5) {
							local610.anInt894 = 0;
							local610.anInt892 = 64;
						}
						if (local610.anInt891 == 6) {
							local610.anInt894 = 128;
							local610.anInt892 = 64;
						}
						local610.anInt891 = 2;
						local610.anInt887 = Static146.aClass4_Sub12_Sub1_3.method2490();
						local610.anInt892 += Static146.aClass4_Sub12_Sub1_3.method2536() - Static180.anInt3453 << 7;
						local610.anInt894 += Static146.aClass4_Sub12_Sub1_3.method2536() - Static86.anInt1771 << 7;
						local610.anInt895 = Static146.aClass4_Sub12_Sub1_3.method2490();
						local610.anInt889 = Static146.aClass4_Sub12_Sub1_3.method2536();
					}
					local610.anInt888 = Static146.aClass4_Sub12_Sub1_3.method2536();
					if (local610.anInt888 == 65535) {
						local610.anInt888 = -1;
					}
					Static306.aClass38Array1[local70] = local610;
				}
				Static300.aClass22_246 = null;
				return true;
			} else if (Static300.aClass22_246 == Static75.aClass22_73) {
				local327 = Static146.aClass4_Sub12_Sub1_3.method2536();
				local70 = Static146.aClass4_Sub12_Sub1_3.method2538();
				local335 = Static146.aClass4_Sub12_Sub1_3.method2548();
				if (Static326.method4415(local327)) {
					Static227.method3451(local335, local70);
				}
				Static300.aClass22_246 = null;
				return true;
			} else {
				@Pc(813) String local813;
				if (Static300.aClass22_246 == Static41.aClass22_45) {
					local813 = Static146.aClass4_Sub12_Sub1_3.method2537();
					local70 = Static146.aClass4_Sub12_Sub1_3.method2536();
					local212 = Static445.aClass81_2.method2258(local70).method234(Static146.aClass4_Sub12_Sub1_3);
					Static426.method5438(local70, local813, local212, null, 0, local813, 19);
					Static300.aClass22_246 = null;
					return true;
				} else if (Static278.aClass22_232 == Static300.aClass22_246) {
					local327 = Static146.aClass4_Sub12_Sub1_3.method2548();
					local70 = Static146.aClass4_Sub12_Sub1_3.method2538();
					local335 = Static146.aClass4_Sub12_Sub1_3.method2511();
					if (Static326.method4415(local327)) {
						Static316.method4221(local70, local335);
					}
					Static300.aClass22_246 = null;
					return true;
				} else if (Static300.aClass22_246 == Static434.aClass22_336) {
					Static14.anInt189 = Static146.aClass4_Sub12_Sub1_3.method2520();
					Static412.anInt6765 = Static146.aClass4_Sub12_Sub1_3.method2523();
					Static300.aClass22_246 = null;
					return true;
				} else if (Static300.aClass22_246 == Static324.aClass22_261) {
					if (Static334.anInt5766 != -1) {
						Static310.method4165(Static334.anInt5766, 0);
					}
					Static300.aClass22_246 = null;
					return true;
				} else if (Static331.aClass22_268 == Static300.aClass22_246) {
					local327 = Static146.aClass4_Sub12_Sub1_3.method2515();
					local70 = Static146.aClass4_Sub12_Sub1_3.method2511();
					Static257.aClass114_1.method2828(local70, local327);
					Static300.aClass22_246 = null;
					return true;
				} else if (Static49.aClass22_98 == Static300.aClass22_246) {
					Static251.method3639();
					Static300.aClass22_246 = null;
					return false;
				} else if (Static261.aClass22_218 == Static300.aClass22_246) {
					local327 = Static146.aClass4_Sub12_Sub1_3.method2490();
					local70 = Static146.aClass4_Sub12_Sub1_3.method2523();
					if (local327 == 255) {
						local70 = -1;
						local327 = -1;
					}
					Static442.method5573(local327, local70);
					Static300.aClass22_246 = null;
					return true;
				} else if (Static300.aClass22_246 == Static376.aClass22_286) {
					local327 = Static146.aClass4_Sub12_Sub1_3.method2511();
					local70 = Static146.aClass4_Sub12_Sub1_3.method2520();
					local335 = Static146.aClass4_Sub12_Sub1_3.method2489();
					Static160.anIntArray207[local70] = local327;
					Static395.anIntArray502[local70] = local335;
					Static198.anIntArray258[local70] = 1;
					local224 = Static117.anIntArray167[local70] - 1;
					for (local228 = 0; local228 < local224; local228++) {
						if (local327 >= Class126.anIntArray260[local228]) {
							Static198.anIntArray258[local70] = local228 + 2;
						}
					}
					Static39.anIntArray40[Static346.anInt5948++ & 0x1F] = local70;
					Static300.aClass22_246 = null;
					return true;
				} else if (Static300.aClass22_246 == Static135.aClass22_120) {
					local327 = Static146.aClass4_Sub12_Sub1_3.method2510();
					local70 = Static146.aClass4_Sub12_Sub1_3.method2536();
					if (Static326.method4415(local70)) {
						Static54.method914(3, local327, -1, -1);
					}
					Static300.aClass22_246 = null;
					return true;
				} else if (Static300.aClass22_246 == Static254.aClass22_209) {
					local327 = Static146.aClass4_Sub12_Sub1_3.method2490();
					local70 = Static146.aClass4_Sub12_Sub1_3.method2538();
					local335 = Static146.aClass4_Sub12_Sub1_3.method2538();
					if (Static326.method4415(local70)) {
						if (local327 == 2) {
							Static436.method5520();
						}
						Static334.anInt5766 = local335;
						Static426.method5439(local335);
						Static327.method4422(false);
						Static271.method3897(Static334.anInt5766);
						for (local224 = 0; local224 < 100; local224++) {
							Static416.aBooleanArray21[local224] = true;
						}
					}
					Static300.aClass22_246 = null;
					return true;
				} else if (Static119.aClass22_106 == Static300.aClass22_246) {
					local327 = Static146.aClass4_Sub12_Sub1_3.method2491();
					local70 = Static146.aClass4_Sub12_Sub1_3.method2529();
					local335 = Static146.aClass4_Sub12_Sub1_3.method2536();
					local224 = Static146.aClass4_Sub12_Sub1_3.method2548();
					if (Static326.method4415(local335)) {
						Static54.method914(5, local327, local224, local70);
					}
					Static300.aClass22_246 = null;
					return true;
				} else {
					@Pc(1190) int local1190;
					if (Static401.aClass22_302 == Static300.aClass22_246) {
						local327 = Static146.aClass4_Sub12_Sub1_3.method2536();
						local70 = Static146.aClass4_Sub12_Sub1_3.method2536();
						local335 = Static146.aClass4_Sub12_Sub1_3.method2536();
						local224 = Static146.aClass4_Sub12_Sub1_3.method2536();
						if (Static326.method4415(local327) && Static297.aClass247ArrayArray2[local70] != null) {
							for (local228 = local335; local228 < local224; local228++) {
								local1190 = Static146.aClass4_Sub12_Sub1_3.method2493();
								if (local228 < Static297.aClass247ArrayArray2[local70].length && Static297.aClass247ArrayArray2[local70][local228] != null) {
									Static297.aClass247ArrayArray2[local70][local228].anInt6819 = local1190;
								}
							}
						}
						Static300.aClass22_246 = null;
						return true;
					}
					@Pc(1252) long local1252;
					@Pc(1257) long local1257;
					@Pc(1267) int local1267;
					@Pc(1263) int local1263;
					@Pc(1277) int local1277;
					if (Static300.aClass22_246 == Static26.aClass22_32) {
						local206 = Static146.aClass4_Sub12_Sub1_3.method2490() == 1;
						local210 = Static146.aClass4_Sub12_Sub1_3.method2537();
						local212 = local210;
						if (local206) {
							local212 = Static146.aClass4_Sub12_Sub1_3.method2537();
						}
						local1252 = Static146.aClass4_Sub12_Sub1_3.method2536();
						local1257 = Static146.aClass4_Sub12_Sub1_3.method2493();
						local1263 = Static146.aClass4_Sub12_Sub1_3.method2490();
						local1267 = Static146.aClass4_Sub12_Sub1_3.method2536();
						@Pc(1273) long local1273 = local1257 + (local1252 << 32);
						@Pc(1275) boolean local1275 = false;
						local1277 = 0;
						while (true) {
							if (local1277 >= 100) {
								if (local1263 <= 1 && Static239.method3549(local212)) {
									local1275 = true;
								}
								break;
							}
							if (Static270.aLongArray7[local1277] == local1273) {
								local1275 = true;
								break;
							}
							local1277++;
						}
						if (!local1275 && Static65.anInt1373 == 0) {
							Static270.aLongArray7[Static407.anInt6719] = local1273;
							Static407.anInt6719 = (Static407.anInt6719 + 1) % 100;
							@Pc(1324) String local1324 = Static445.aClass81_2.method2258(local1267).method234(Static146.aClass4_Sub12_Sub1_3);
							if (local1263 == 2) {
								Static426.method5438(local1267, "<img=1>" + local212, local1324, null, 0, "<img=1>" + local210, 18);
							} else if (local1263 == 1) {
								Static426.method5438(local1267, "<img=0>" + local212, local1324, null, 0, "<img=0>" + local210, 18);
							} else {
								Static426.method5438(local1267, local212, local1324, null, 0, local210, 18);
							}
						}
						Static300.aClass22_246 = null;
						return true;
					}
					@Pc(1411) boolean local1411;
					if (Static300.aClass22_246 == Static115.aClass22_102) {
						local327 = Static146.aClass4_Sub12_Sub1_3.method2536();
						local70 = Static146.aClass4_Sub12_Sub1_3.method2490();
						local1411 = (local70 & 0x1) == 1;
						while (Static454.anInt4075 > Static146.aClass4_Sub12_Sub1_3.anInt2997) {
							local224 = Static146.aClass4_Sub12_Sub1_3.method2506();
							local228 = Static146.aClass4_Sub12_Sub1_3.method2536();
							local1190 = 0;
							if (local228 != 0) {
								local1190 = Static146.aClass4_Sub12_Sub1_3.method2490();
								if (local1190 == 255) {
									local1190 = Static146.aClass4_Sub12_Sub1_3.method2529();
								}
							}
							Static153.method2603(local224, local228 - 1, local327, local1190, local1411);
						}
						Static393.anIntArray500[Static140.anInt2841++ & 0x1F] = local327;
						Static300.aClass22_246 = null;
						return true;
					} else if (Static187.aClass22_159 == Static300.aClass22_246) {
						if (Static320.aFrame3 != null) {
							Static188.method4107(Static323.aClass50_Sub1_1.anInt3447, -1, -1, false);
						}
						@Pc(1483) byte[] local1483 = new byte[Static454.anInt4075];
						Static146.aClass4_Sub12_Sub1_3.method1132(Static454.anInt4075, local1483);
						local210 = Static412.method5293(local1483, Static454.anInt4075, 0);
						Static275.method3929(Static206.aClass66_4, local210, Static177.anInt2973 == 1, true);
						Static300.aClass22_246 = null;
						return true;
					} else if (Static300.aClass22_246 == Static329.aClass22_264) {
						Static244.method2572(Static133.aClass21_8);
						Static300.aClass22_246 = null;
						return true;
					} else if (Static300.aClass22_246 == Static189.aClass22_160) {
						local327 = Static146.aClass4_Sub12_Sub1_3.method2491();
						local70 = Static146.aClass4_Sub12_Sub1_3.method2538();
						Static257.aClass114_1.method2830(local70, local327);
						Static300.aClass22_246 = null;
						return true;
					} else {
						@Pc(1576) Class4_Sub43 local1576;
						if (Static302.aClass22_247 == Static300.aClass22_246) {
							local327 = Static146.aClass4_Sub12_Sub1_3.method2489();
							local70 = Static146.aClass4_Sub12_Sub1_3.method2548();
							local335 = Static146.aClass4_Sub12_Sub1_3.method2529();
							local224 = Static146.aClass4_Sub12_Sub1_3.method2538();
							if (Static326.method4415(local70)) {
								local1576 = (Class4_Sub43) Static325.aClass102_29.method2700((long) local335);
								if (local1576 != null) {
									Static90.method1606(local224 != local1576.anInt6979, local1576, false);
								}
								Static300.method4092(local224, local327, false, local335);
							}
							Static300.aClass22_246 = null;
							return true;
						} else if (Static311.aClass22_252 == Static300.aClass22_246) {
							Static244.method2572(Static146.aClass21_2);
							Static300.aClass22_246 = null;
							return true;
						} else if (Static265.aClass22_223 == Static300.aClass22_246) {
							local327 = Static146.aClass4_Sub12_Sub1_3.method2548();
							local70 = Static146.aClass4_Sub12_Sub1_3.method2509();
							local335 = Static146.aClass4_Sub12_Sub1_3.method2510();
							if (Static326.method4415(local327)) {
								Static112.method2033(local70, local335);
							}
							Static300.aClass22_246 = null;
							return true;
						} else if (Static431.aClass22_324 == Static300.aClass22_246) {
							local327 = Static146.aClass4_Sub12_Sub1_3.method2536();
							local70 = Static146.aClass4_Sub12_Sub1_3.method2489();
							local1411 = (local70 & 0x1) == 1;
							Static150.method2573(local327, local1411);
							Static393.anIntArray500[Static140.anInt2841++ & 0x1F] = local327;
							Static300.aClass22_246 = null;
							return true;
						} else {
							@Pc(1747) String local1747;
							if (Static422.aClass22_312 == Static300.aClass22_246) {
								local206 = Static146.aClass4_Sub12_Sub1_3.method2490() == 1;
								local210 = Static146.aClass4_Sub12_Sub1_3.method2537();
								local212 = local210;
								if (local206) {
									local212 = Static146.aClass4_Sub12_Sub1_3.method2537();
								}
								local224 = Static146.aClass4_Sub12_Sub1_3.method2490();
								@Pc(1713) boolean local1713 = false;
								if (local224 <= 1) {
									if (Static109.aBoolean628 && !Static396.aBoolean443 || Static308.aBoolean486) {
										local1713 = true;
									} else if (local224 <= 1 && Static239.method3549(local212)) {
										local1713 = true;
									}
								}
								if (!local1713 && Static65.anInt1373 == 0) {
									local1747 = Static22.method297(Static261.method3776(Static146.aClass4_Sub12_Sub1_3));
									if (local224 == 2) {
										Static426.method5438(-1, "<img=1>" + local212, local1747, null, 0, "<img=1>" + local210, 24);
									} else if (local224 == 1) {
										Static426.method5438(-1, "<img=0>" + local212, local1747, null, 0, "<img=0>" + local210, 24);
									} else {
										Static426.method5438(-1, local212, local1747, null, 0, local210, 24);
									}
								}
								Static300.aClass22_246 = null;
								return true;
							} else if (Static300.aClass22_246 == Static245.aClass22_205) {
								Static244.method2572(Static183.aClass21_12);
								Static300.aClass22_246 = null;
								return true;
							} else {
								@Pc(2080) String local2080;
								@Pc(1858) boolean local1858;
								@Pc(2152) boolean local2152;
								if (Static233.aClass22_195 == Static300.aClass22_246) {
									while (Static146.aClass4_Sub12_Sub1_3.anInt2997 < Static454.anInt4075) {
										local206 = Static146.aClass4_Sub12_Sub1_3.method2490() == 1;
										local210 = Static146.aClass4_Sub12_Sub1_3.method2537();
										local212 = Static146.aClass4_Sub12_Sub1_3.method2537();
										local224 = Static146.aClass4_Sub12_Sub1_3.method2536();
										local228 = Static146.aClass4_Sub12_Sub1_3.method2490();
										local1747 = "";
										local1858 = false;
										if (local224 > 0) {
											local1747 = Static146.aClass4_Sub12_Sub1_3.method2537();
											local1858 = Static146.aClass4_Sub12_Sub1_3.method2490() == 1;
										}
										for (local1263 = 0; local1263 < Static49.anInt2346; local1263++) {
											if (local206) {
												if (local212.equals(Static194.aStringArray14[local1263])) {
													Static194.aStringArray14[local1263] = local210;
													local210 = null;
													Static57.aStringArray6[local1263] = local212;
													break;
												}
											} else if (local210.equals(Static194.aStringArray14[local1263])) {
												if (Static71.anIntArray536[local1263] != local224) {
													Static71.anIntArray536[local1263] = local224;
													if (local224 > 0) {
														Static128.method2268(0, 5, local210 + Static138.aClass83_54.method2267(Static178.anInt3423), "", "");
													}
													if (local224 == 0) {
														Static128.method2268(0, 5, local210 + Static371.aClass83_125.method2267(Static178.anInt3423), "", "");
													}
												}
												Static57.aStringArray6[local1263] = local212;
												Static433.aStringArray38[local1263] = local1747;
												Static280.anIntArray339[local1263] = local228;
												local210 = null;
												Static424.aBooleanArray23[local1263] = local1858;
												break;
											}
										}
										if (local210 != null && Static49.anInt2346 < 200) {
											Static194.aStringArray14[Static49.anInt2346] = local210;
											Static57.aStringArray6[Static49.anInt2346] = local212;
											Static71.anIntArray536[Static49.anInt2346] = local224;
											Static433.aStringArray38[Static49.anInt2346] = local1747;
											Static280.anIntArray339[Static49.anInt2346] = local228;
											Static424.aBooleanArray23[Static49.anInt2346] = local1858;
											Static49.anInt2346++;
										}
									}
									Static376.anInt6277 = 2;
									Static244.anInt3027 = Static325.anInt5640;
									local70 = Static49.anInt2346;
									while (local70 > 0) {
										local70--;
										local206 = true;
										for (local335 = 0; local335 < local70; local335++) {
											if (Static71.anIntArray536[local335] != Static56.anInt1028 && Static56.anInt1028 == Static71.anIntArray536[local335 + 1] || Static71.anIntArray536[local335] == 0 && Static71.anIntArray536[local335 + 1] != 0) {
												local224 = Static71.anIntArray536[local335];
												Static71.anIntArray536[local335] = Static71.anIntArray536[local335 + 1];
												Static71.anIntArray536[local335 + 1] = local224;
												local2080 = Static433.aStringArray38[local335];
												Static433.aStringArray38[local335] = Static433.aStringArray38[local335 + 1];
												Static433.aStringArray38[local335 + 1] = local2080;
												local1747 = Static194.aStringArray14[local335];
												Static194.aStringArray14[local335] = Static194.aStringArray14[local335 + 1];
												Static194.aStringArray14[local335 + 1] = local1747;
												local251 = Static57.aStringArray6[local335];
												Static57.aStringArray6[local335] = Static57.aStringArray6[local335 + 1];
												Static57.aStringArray6[local335 + 1] = local251;
												local1263 = Static280.anIntArray339[local335];
												Static280.anIntArray339[local335] = Static280.anIntArray339[local335 + 1];
												Static280.anIntArray339[local335 + 1] = local1263;
												local2152 = Static424.aBooleanArray23[local335];
												Static424.aBooleanArray23[local335] = Static424.aBooleanArray23[local335 + 1];
												Static424.aBooleanArray23[local335 + 1] = local2152;
												local206 = false;
											}
										}
										if (local206) {
											break;
										}
									}
									Static300.aClass22_246 = null;
									return true;
								} else if (Static300.aClass22_246 == Static423.aClass22_317) {
									local327 = Static146.aClass4_Sub12_Sub1_3.method2538();
									if (local327 == 65535) {
										local327 = -1;
									}
									local70 = Static146.aClass4_Sub12_Sub1_3.method2529();
									local335 = Static146.aClass4_Sub12_Sub1_3.method2548();
									if (Static326.method4415(local335)) {
										Static79.method1399(local327, local70);
									}
									Static300.aClass22_246 = null;
									return true;
								} else if (Static236.aClass22_200 == Static300.aClass22_246) {
									Static189.method2942(Static146.aClass4_Sub12_Sub1_3, Static454.anInt4075);
									Static300.aClass22_246 = null;
									return true;
								} else if (Static300.aClass22_246 == Static12.aClass22_17) {
									local327 = Static146.aClass4_Sub12_Sub1_3.method2536();
									local70 = Static146.aClass4_Sub12_Sub1_3.method2490();
									Static257.aClass114_1.method2828(local70, local327);
									Static300.aClass22_246 = null;
									return true;
								} else {
									@Pc(2311) long local2311;
									@Pc(2329) Class4_Sub33 local2329;
									@Pc(2317) Class4_Sub33 local2317;
									if (Static421.aClass22_311 == Static300.aClass22_246) {
										local327 = Static146.aClass4_Sub12_Sub1_3.method2515();
										if (local327 == 65535) {
											local327 = -1;
										}
										local70 = Static146.aClass4_Sub12_Sub1_3.method2510();
										local335 = Static146.aClass4_Sub12_Sub1_3.method2536();
										local224 = Static146.aClass4_Sub12_Sub1_3.method2529();
										local228 = Static146.aClass4_Sub12_Sub1_3.method2538();
										if (local228 == 65535) {
											local228 = -1;
										}
										if (Static326.method4415(local335)) {
											for (local1190 = local327; local1190 <= local228; local1190++) {
												local2311 = ((long) local224 << 32) + (long) local1190;
												local2317 = (Class4_Sub33) Static211.aClass102_18.method2700(local2311);
												if (local2317 != null) {
													local2329 = new Class4_Sub33(local70, local2317.anInt5110);
													local2317.method5684();
												} else if (local1190 == -1) {
													local2329 = new Class4_Sub33(local70, Static392.method5121(local224).aClass4_Sub33_2.anInt5110);
												} else {
													local2329 = new Class4_Sub33(local70, -1);
												}
												Static211.aClass102_18.method2703(local2311, local2329);
											}
										}
										Static300.aClass22_246 = null;
										return true;
									} else if (Static107.aClass22_96 == Static300.aClass22_246) {
										Static154.anInt813 = Static146.aClass4_Sub12_Sub1_3.method2534() << 3;
										Static385.anInt6487 = Static146.aClass4_Sub12_Sub1_3.method2542() << 3;
										Static113.anInt2426 = Static146.aClass4_Sub12_Sub1_3.method2523();
										Static300.aClass22_246 = null;
										return true;
									} else if (Static406.aClass22_306 == Static300.aClass22_246) {
										Static17.anInt223 = Static146.aClass4_Sub12_Sub1_3.method2512();
										Static308.anInt5413 = Static325.anInt5640;
										Static300.aClass22_246 = null;
										return true;
									} else if (Static300.aClass22_246 == Static178.aClass22_152) {
										local327 = Static146.aClass4_Sub12_Sub1_3.method2489();
										local70 = Static146.aClass4_Sub12_Sub1_3.method2515();
										if (Static326.method4415(local70)) {
											Static268.anInt4991 = local327;
										}
										Static300.aClass22_246 = null;
										return true;
									} else {
										@Pc(2473) int local2473;
										@Pc(2494) int local2494;
										@Pc(2648) int local2648;
										@Pc(3138) int local3138;
										if (Static372.aClass22_290 == Static300.aClass22_246) {
											local327 = Static146.aClass4_Sub12_Sub1_3.method2538();
											local70 = Static146.aClass4_Sub12_Sub1_3.method2548();
											local335 = Static146.aClass4_Sub12_Sub1_3.method2510();
											local224 = Static146.aClass4_Sub12_Sub1_3.method2548();
											local228 = Static146.aClass4_Sub12_Sub1_3.method2520();
											local230 = (local228 & 0x80) != 0;
											if (local335 >> 30 == 0) {
												@Pc(2515) Class161 local2515;
												@Pc(2573) Class138 local2573;
												@Pc(2520) Class161 local2520;
												@Pc(2535) Class138 local2535;
												@Pc(2541) Class138 local2541;
												if (local335 >> 29 != 0) {
													local2473 = local335 & 0xFFFF;
													@Pc(2477) Class16_Sub1_Sub5_Sub2 local2477 = Static143.aClass16_Sub1_Sub5_Sub2Array1[local2473];
													if (local2477 != null) {
														if (local70 == 65535) {
															local70 = -1;
														}
														local2152 = true;
														local2494 = local230 ? local2477.anInt6045 : local2477.anInt6029;
														if (local70 != -1 && local2494 != -1) {
															if (local70 == local2494) {
																local2515 = Static352.aClass194_2.method4421(local70);
																if (local2515.aBoolean459 && local2515.anInt5002 != -1) {
																	local2573 = Static182.aClass55_1.method1397(local2515.anInt5002);
																	local1277 = local2573.anInt4406;
																	if (local1277 == 0 || local1277 == 2) {
																		local2152 = false;
																	} else if (local1277 == 1) {
																		local2152 = true;
																	}
																}
															} else {
																local2515 = Static352.aClass194_2.method4421(local70);
																local2520 = Static352.aClass194_2.method4421(local2494);
																if (local2515.anInt5002 != -1 && local2520.anInt5002 != -1) {
																	local2535 = Static182.aClass55_1.method1397(local2515.anInt5002);
																	local2541 = Static182.aClass55_1.method1397(local2520.anInt5002);
																	if (local2541.anInt4413 > local2535.anInt4413) {
																		local2152 = false;
																	}
																}
															}
														}
														if (local2152) {
															if (local230) {
																local2477.anInt6022 = 0;
																local2477.anInt6066 = local327 + Static24.anInt5323;
																local2477.anInt6053 = local224;
																local2477.anInt6069 = 1;
																local2477.anInt6062 = 0;
																local2477.anInt6056 = local228 & 0x7;
																local2477.anInt6045 = local70;
																if (local2477.anInt6066 > Static24.anInt5323) {
																	local2477.anInt6022 = -1;
																}
																if (local2477.anInt6045 != -1 && Static24.anInt5323 == local2477.anInt6066) {
																	local2648 = Static352.aClass194_2.method4421(local2477.anInt6045).anInt5002;
																	if (local2648 != -1) {
																		local2573 = Static182.aClass55_1.method1397(local2648);
																		if (local2573 != null && local2573.anIntArray295 != null) {
																			Static15.method156(local2477.anInt6893, 0, local2477.aByte82, local2477.anInt6892, local2573, false);
																		}
																	}
																}
															} else {
																local2477.anInt6014 = local224;
																local2477.anInt6027 = 0;
																local2477.anInt6083 = 1;
																local2477.anInt6029 = local70;
																local2477.anInt6017 = local228 & 0x7;
																local2477.anInt6057 = local327 + Static24.anInt5323;
																local2477.anInt6033 = 0;
																if (local2477.anInt6057 > Static24.anInt5323) {
																	local2477.anInt6027 = -1;
																}
																if (local2477.anInt6029 != -1 && Static24.anInt5323 == local2477.anInt6057) {
																	local2648 = Static352.aClass194_2.method4421(local2477.anInt6029).anInt5002;
																	if (local2648 != -1) {
																		local2573 = Static182.aClass55_1.method1397(local2648);
																		if (local2573 != null && local2573.anIntArray295 != null) {
																			Static15.method156(local2477.anInt6893, 0, local2477.aByte82, local2477.anInt6892, local2573, false);
																		}
																	}
																}
															}
														}
													}
												} else if (local335 >> 28 != 0) {
													local2473 = local335 & 0xFFFF;
													@Pc(2773) Class16_Sub1_Sub5_Sub1 local2773;
													if (Static207.anInt5452 == local2473) {
														local2773 = Static1.aClass16_Sub1_Sub5_Sub1_1;
													} else {
														local2773 = Static267.aClass16_Sub1_Sub5_Sub1Array1[local2473];
													}
													if (local2773 != null) {
														if (local70 == 65535) {
															local70 = -1;
														}
														local2152 = true;
														local2494 = local230 ? local2773.anInt6045 : local2773.anInt6029;
														if (local70 != -1 && local2494 != -1) {
															if (local70 == local2494) {
																local2515 = Static352.aClass194_2.method4421(local70);
																if (local2515.aBoolean459 && local2515.anInt5002 != -1) {
																	local2573 = Static182.aClass55_1.method1397(local2515.anInt5002);
																	local1277 = local2573.anInt4406;
																	if (local1277 == 0 || local1277 == 2) {
																		local2152 = false;
																	} else if (local1277 == 1) {
																		local2152 = true;
																	}
																}
															} else {
																local2515 = Static352.aClass194_2.method4421(local70);
																local2520 = Static352.aClass194_2.method4421(local2494);
																if (local2515.anInt5002 != -1 && local2520.anInt5002 != -1) {
																	local2535 = Static182.aClass55_1.method1397(local2515.anInt5002);
																	local2541 = Static182.aClass55_1.method1397(local2520.anInt5002);
																	if (local2541.anInt4413 > local2535.anInt4413) {
																		local2152 = false;
																	}
																}
															}
														}
														if (local2152) {
															if (local230) {
																local2773.anInt6056 = local228 & 0x7;
																local2773.anInt6045 = local70;
																local2773.anInt6053 = local224;
																local2773.anInt6069 = 1;
																local2773.anInt6066 = local327 + Static24.anInt5323;
																local2773.anInt6022 = 0;
																local2773.anInt6062 = 0;
																if (local2773.anInt6045 == 65535) {
																	local2773.anInt6045 = -1;
																}
																if (local2773.anInt6066 > Static24.anInt5323) {
																	local2773.anInt6022 = -1;
																}
																if (local2773.anInt6045 != -1 && local2773.anInt6066 == Static24.anInt5323) {
																	local2648 = Static352.aClass194_2.method4421(local2773.anInt6045).anInt5002;
																	if (local2648 != -1) {
																		local2573 = Static182.aClass55_1.method1397(local2648);
																		if (local2573 != null && local2573.anIntArray295 != null) {
																			Static15.method156(local2773.anInt6893, 0, local2773.aByte82, local2773.anInt6892, local2573, local2773 == Static1.aClass16_Sub1_Sub5_Sub1_1);
																		}
																	}
																}
															} else {
																local2773.anInt6017 = local228 & 0x7;
																local2773.anInt6033 = 0;
																local2773.anInt6014 = local224;
																local2773.anInt6083 = 1;
																local2773.anInt6029 = local70;
																local2773.anInt6057 = Static24.anInt5323 + local327;
																local2773.anInt6027 = 0;
																if (local2773.anInt6029 == 65535) {
																	local2773.anInt6029 = -1;
																}
																if (local2773.anInt6057 > Static24.anInt5323) {
																	local2773.anInt6027 = -1;
																}
																if (local2773.anInt6029 != -1 && local2773.anInt6057 == Static24.anInt5323) {
																	local2648 = Static352.aClass194_2.method4421(local2773.anInt6029).anInt5002;
																	if (local2648 != -1) {
																		local2573 = Static182.aClass55_1.method1397(local2648);
																		if (local2573 != null && local2573.anIntArray295 != null) {
																			Static15.method156(local2773.anInt6893, 0, local2773.aByte82, local2773.anInt6892, local2573, Static1.aClass16_Sub1_Sub5_Sub1_1 == local2773);
																		}
																	}
																}
															}
														}
													}
												}
											} else {
												local2473 = local335 >> 28 & 0x3;
												local1263 = (local335 >> 14 & 0x3FFF) - Static180.anInt3453;
												local1267 = (local335 & 0x3FFF) - Static86.anInt1771;
												if (local1263 >= 0 && local1267 >= 0 && Static326.anInt5666 > local1263 && Static283.anInt5187 > local1267) {
													local2494 = local1263 * 128 + 64;
													local2648 = local1267 * 128 + 64;
													local3138 = local2473;
													if (local2473 < 3 && Static378.method3229(local1263, local1267)) {
														local3138 = local2473 + 1;
													}
													@Pc(3173) Class16_Sub1_Sub2 local3173 = new Class16_Sub1_Sub2(local70, 0, Static24.anInt5323, local2473, local3138, local2494, Static13.method135(local2494, local2473, local2648) - local224, local2648, local1263, local1263, local1267, local1267, local228);
													Static292.aClass183_36.method4137(new Class4_Sub1_Sub10(local3173));
												}
											}
											Static300.aClass22_246 = null;
											return true;
										} else if (Static300.aClass22_246 == Static390.aClass22_292) {
											local327 = Static146.aClass4_Sub12_Sub1_3.method2536();
											local70 = Static146.aClass4_Sub12_Sub1_3.method2490();
											local1411 = (local70 & 0x1) == 1;
											Static171.method2796(local327, local1411);
											local224 = Static146.aClass4_Sub12_Sub1_3.method2536();
											for (local228 = 0; local228 < local224; local228++) {
												local1190 = Static146.aClass4_Sub12_Sub1_3.method2489();
												if (local1190 == 255) {
													local1190 = Static146.aClass4_Sub12_Sub1_3.method2511();
												}
												local2473 = Static146.aClass4_Sub12_Sub1_3.method2536();
												Static153.method2603(local228, local2473 - 1, local327, local1190, local1411);
											}
											Static393.anIntArray500[Static140.anInt2841++ & 0x1F] = local327;
											Static300.aClass22_246 = null;
											return true;
										} else if (Static300.aClass22_246 == Static409.aClass22_325) {
											local813 = Static146.aClass4_Sub12_Sub1_3.method2537();
											local210 = Static22.method297(Static261.method3776(Static146.aClass4_Sub12_Sub1_3));
											Static128.method2268(0, 6, local210, local813, local813);
											Static300.aClass22_246 = null;
											return true;
										} else if (Static300.aClass22_246 == Static302.aClass22_248) {
											local327 = Static146.aClass4_Sub12_Sub1_3.method2538();
											local70 = Static146.aClass4_Sub12_Sub1_3.method2548();
											if (local70 == 65535) {
												local70 = -1;
											}
											local335 = Static146.aClass4_Sub12_Sub1_3.method2529();
											local224 = Static146.aClass4_Sub12_Sub1_3.method2491();
											if (Static326.method4415(local327)) {
												Static119.method2150(local224, local335, local70);
												@Pc(3326) Class211 local3326 = Static444.aClass206_3.method4703(local70);
												Static94.method1652(local224, local3326.anInt6122, local3326.anInt6133, local3326.anInt6137);
												Static67.method1274(local3326.anInt6152, local3326.lb, local224, local3326.anInt6135);
											}
											Static300.aClass22_246 = null;
											return true;
										} else if (Static300.aClass22_246 == Static184.aClass22_157) {
											local327 = Static146.aClass4_Sub12_Sub1_3.method2538();
											local70 = Static146.aClass4_Sub12_Sub1_3.method2515();
											local335 = Static146.aClass4_Sub12_Sub1_3.method2536();
											local224 = Static146.aClass4_Sub12_Sub1_3.method2548();
											local228 = Static146.aClass4_Sub12_Sub1_3.method2491();
											if (Static326.method4415(local224)) {
												Static54.method914(7, local228, local70 | local335 << 16, local327);
											}
											Static300.aClass22_246 = null;
											return true;
										} else if (Static300.aClass22_246 == Static8.aClass22_11) {
											local327 = Static146.aClass4_Sub12_Sub1_3.method2548();
											local70 = Static146.aClass4_Sub12_Sub1_3.method2548();
											local335 = Static146.aClass4_Sub12_Sub1_3.method2529();
											local224 = Static146.aClass4_Sub12_Sub1_3.method2538();
											local228 = Static146.aClass4_Sub12_Sub1_3.method2536();
											if (Static326.method4415(local327)) {
												Static94.method1652(local335, local228, local224, local70);
											}
											Static300.aClass22_246 = null;
											return true;
										} else if (Static300.aClass22_246 == Static105.aClass22_94) {
											Static124.method2241(true);
											Static300.aClass22_246 = null;
											return true;
										} else if (Static24.aClass22_245 == Static300.aClass22_246) {
											local327 = Static146.aClass4_Sub12_Sub1_3.method2536();
											@Pc(3451) byte local3451 = Static146.aClass4_Sub12_Sub1_3.method2507();
											Static257.aClass114_1.method2830(local327, local3451);
											Static300.aClass22_246 = null;
											return true;
										} else if (Static146.aClass22_23 == Static300.aClass22_246) {
											local327 = Static146.aClass4_Sub12_Sub1_3.method2490();
											if (Static146.aClass4_Sub12_Sub1_3.method2490() == 0) {
												Static408.aClass28Array1[local327] = new Class28();
											} else {
												Static146.aClass4_Sub12_Sub1_3.anInt2997--;
												Static408.aClass28Array1[local327] = new Class28(Static146.aClass4_Sub12_Sub1_3);
											}
											Static246.anInt4589 = Static325.anInt5640;
											Static300.aClass22_246 = null;
											return true;
										} else if (Static300.aClass22_246 == Static172.aClass22_150) {
											local206 = Static146.aClass4_Sub12_Sub1_3.method2490() == 1;
											local210 = Static146.aClass4_Sub12_Sub1_3.method2537();
											local212 = local210;
											if (local206) {
												local212 = Static146.aClass4_Sub12_Sub1_3.method2537();
											}
											local1252 = Static146.aClass4_Sub12_Sub1_3.method2536();
											local1257 = Static146.aClass4_Sub12_Sub1_3.method2493();
											local1263 = Static146.aClass4_Sub12_Sub1_3.method2490();
											@Pc(3544) long local3544 = (local1252 << 32) + local1257;
											@Pc(3546) boolean local3546 = false;
											local3138 = 0;
											while (true) {
												if (local3138 >= 100) {
													if (local1263 <= 1) {
														if (Static109.aBoolean628 && !Static396.aBoolean443 || Static308.aBoolean486) {
															local3546 = true;
														} else if (Static239.method3549(local212)) {
															local3546 = true;
														}
													}
													break;
												}
												if (local3544 == Static270.aLongArray7[local3138]) {
													local3546 = true;
													break;
												}
												local3138++;
											}
											if (!local3546 && Static65.anInt1373 == 0) {
												Static270.aLongArray7[Static407.anInt6719] = local3544;
												Static407.anInt6719 = (Static407.anInt6719 + 1) % 100;
												@Pc(3605) String local3605 = Static22.method297(Static261.method3776(Static146.aClass4_Sub12_Sub1_3));
												if (local1263 == 2) {
													Static426.method5438(-1, "<img=1>" + local212, local3605, null, 0, "<img=1>" + local210, 7);
												} else if (local1263 == 1) {
													Static426.method5438(-1, "<img=0>" + local212, local3605, null, 0, "<img=0>" + local210, 7);
												} else {
													Static426.method5438(-1, local212, local3605, null, 0, local210, 3);
												}
											}
											Static300.aClass22_246 = null;
											return true;
										} else if (Static257.aClass22_212 == Static300.aClass22_246) {
											local327 = Static146.aClass4_Sub12_Sub1_3.method2538();
											local70 = Static146.aClass4_Sub12_Sub1_3.method2520();
											local335 = Static146.aClass4_Sub12_Sub1_3.method2538();
											@Pc(3691) Class16_Sub1_Sub5_Sub2 local3691 = Static143.aClass16_Sub1_Sub5_Sub2Array1[local327];
											if (local3691 != null) {
												Static33.method632(local335, local70, local3691);
											}
											Static300.aClass22_246 = null;
											return true;
										} else if (Static74.aClass22_72 == Static300.aClass22_246) {
											Static413.anInt6823 = Static146.aClass4_Sub12_Sub1_3.method2490();
											for (local327 = 0; local327 < Static413.anInt6823; local327++) {
												Static326.aStringArray27[local327] = Static146.aClass4_Sub12_Sub1_3.method2537();
												Static102.aStringArray7[local327] = Static146.aClass4_Sub12_Sub1_3.method2537();
												if (Static102.aStringArray7[local327].equals("")) {
													Static102.aStringArray7[local327] = Static326.aStringArray27[local327];
												}
												Static315.aStringArray26[local327] = Static146.aClass4_Sub12_Sub1_3.method2537();
												Static141.aStringArray11[local327] = Static146.aClass4_Sub12_Sub1_3.method2537();
												if (Static141.aStringArray11[local327].equals("")) {
													Static141.aStringArray11[local327] = Static315.aStringArray26[local327];
												}
												Static414.aBooleanArray20[local327] = false;
											}
											Static300.aClass22_246 = null;
											Static244.anInt3027 = Static325.anInt5640;
											return true;
										} else {
											@Pc(3817) long local3817;
											if (Static435.aClass22_328 == Static300.aClass22_246) {
												local206 = Static146.aClass4_Sub12_Sub1_3.method2490() == 1;
												local210 = Static146.aClass4_Sub12_Sub1_3.method2537();
												local212 = local210;
												if (local206) {
													local212 = Static146.aClass4_Sub12_Sub1_3.method2537();
												}
												local1252 = Static146.aClass4_Sub12_Sub1_3.method2501();
												local1257 = Static146.aClass4_Sub12_Sub1_3.method2536();
												local3817 = Static146.aClass4_Sub12_Sub1_3.method2493();
												local2494 = Static146.aClass4_Sub12_Sub1_3.method2490();
												local2648 = Static146.aClass4_Sub12_Sub1_3.method2536();
												@Pc(3832) long local3832 = (local1257 << 32) + local3817;
												@Pc(3834) boolean local3834 = false;
												@Pc(3836) int local3836 = 0;
												while (true) {
													if (local3836 >= 100) {
														if (local2494 <= 1 && Static239.method3549(local212)) {
															local3834 = true;
														}
														break;
													}
													if (Static270.aLongArray7[local3836] == local3832) {
														local3834 = true;
														break;
													}
													local3836++;
												}
												if (!local3834 && Static65.anInt1373 == 0) {
													Static270.aLongArray7[Static407.anInt6719] = local3832;
													Static407.anInt6719 = (Static407.anInt6719 + 1) % 100;
													@Pc(3889) String local3889 = Static445.aClass81_2.method2258(local2648).method234(Static146.aClass4_Sub12_Sub1_3);
													if (local2494 == 2) {
														Static426.method5438(local2648, "<img=1>" + local212, local3889, Static45.method766(local1252), 0, "<img=1>" + local210, 20);
													} else if (local2494 == 1) {
														Static426.method5438(local2648, "<img=0>" + local212, local3889, Static45.method766(local1252), 0, "<img=0>" + local210, 20);
													} else {
														Static426.method5438(local2648, local212, local3889, Static45.method766(local1252), 0, local210, 20);
													}
												}
												Static300.aClass22_246 = null;
												return true;
											} else if (Static399.aClass22_300 == Static300.aClass22_246) {
												for (local327 = 0; local327 < Static267.aClass16_Sub1_Sub5_Sub1Array1.length; local327++) {
													if (Static267.aClass16_Sub1_Sub5_Sub1Array1[local327] != null) {
														Static267.aClass16_Sub1_Sub5_Sub1Array1[local327].anInt6021 = -1;
													}
												}
												for (local70 = 0; local70 < Static143.aClass16_Sub1_Sub5_Sub2Array1.length; local70++) {
													if (Static143.aClass16_Sub1_Sub5_Sub2Array1[local70] != null) {
														Static143.aClass16_Sub1_Sub5_Sub2Array1[local70].anInt6021 = -1;
													}
												}
												Static300.aClass22_246 = null;
												return true;
											} else if (Static310.aClass22_251 == Static300.aClass22_246) {
												local327 = Static146.aClass4_Sub12_Sub1_3.method2536();
												if (Static326.method4415(local327)) {
													Static54.method913();
												}
												Static300.aClass22_246 = null;
												return true;
											} else {
												@Pc(4235) Class15 local4235;
												if (Static4.aClass22_277 == Static300.aClass22_246) {
													Static381.anInt6418 = Static325.anInt5640;
													if (Static454.anInt4075 == 0) {
														Static221.aString39 = null;
														Static300.aClass22_246 = null;
														Static276.aClass15Array2 = null;
														Static290.anInt6410 = 0;
														Static395.aString63 = null;
														return true;
													}
													Static395.aString63 = Static146.aClass4_Sub12_Sub1_3.method2537();
													local206 = Static146.aClass4_Sub12_Sub1_3.method2490() == 1;
													if (local206) {
														Static146.aClass4_Sub12_Sub1_3.method2537();
													}
													@Pc(4078) long local4078 = Static146.aClass4_Sub12_Sub1_3.method2501();
													Static221.aString39 = Static44.method763(local4078);
													Static446.aByte103 = Static146.aClass4_Sub12_Sub1_3.method2542();
													local224 = Static146.aClass4_Sub12_Sub1_3.method2490();
													if (local224 == 255) {
														Static300.aClass22_246 = null;
														return true;
													}
													Static290.anInt6410 = local224;
													@Pc(4104) Class15[] local4104 = new Class15[100];
													for (local1190 = 0; local1190 < Static290.anInt6410; local1190++) {
														local4104[local1190] = new Class15();
														local4104[local1190].aString8 = Static146.aClass4_Sub12_Sub1_3.method2537();
														local206 = Static146.aClass4_Sub12_Sub1_3.method2490() == 1;
														if (local206) {
															local4104[local1190].aString7 = Static146.aClass4_Sub12_Sub1_3.method2537();
														} else {
															local4104[local1190].aString7 = local4104[local1190].aString8;
														}
														local4104[local1190].aString6 = Static123.method4868(local4104[local1190].aString7);
														local4104[local1190].anInt272 = Static146.aClass4_Sub12_Sub1_3.method2536();
														local4104[local1190].aByte1 = Static146.aClass4_Sub12_Sub1_3.method2542();
														local4104[local1190].aString5 = Static146.aClass4_Sub12_Sub1_3.method2537();
														if (local4104[local1190].aString7.equals(Static1.aClass16_Sub1_Sub5_Sub1_1.aString44)) {
															Static160.aByte18 = local4104[local1190].aByte1;
														}
													}
													local1267 = Static290.anInt6410;
													while (local1267 > 0) {
														local1858 = true;
														local1267--;
														for (local2494 = 0; local2494 < local1267; local2494++) {
															if (local4104[local2494].aString6.compareTo(local4104[local2494 + 1].aString6) > 0) {
																local4235 = local4104[local2494];
																local4104[local2494] = local4104[local2494 + 1];
																local1858 = false;
																local4104[local2494 + 1] = local4235;
															}
														}
														if (local1858) {
															break;
														}
													}
													Static276.aClass15Array2 = local4104;
													Static300.aClass22_246 = null;
													return true;
												} else if (Static406.aClass22_307 == Static300.aClass22_246) {
													Static257.aClass114_1.method2829();
													Static292.anInt5255 += 32;
													Static300.aClass22_246 = null;
													return true;
												} else if (Static300.aClass22_246 == Static233.aClass22_196) {
													local327 = Static146.aClass4_Sub12_Sub1_3.method2538();
													local70 = Static146.aClass4_Sub12_Sub1_3.method2515();
													if (local70 == 65535) {
														local70 = -1;
													}
													local335 = Static146.aClass4_Sub12_Sub1_3.method2510();
													if (Static326.method4415(local327)) {
														Static54.method914(1, local335, local70, -1);
													}
													Static300.aClass22_246 = null;
													return true;
												} else if (Static300.aClass22_246 == Static433.aClass22_327) {
													local327 = Static146.aClass4_Sub12_Sub1_3.method2529();
													local70 = Static146.aClass4_Sub12_Sub1_3.method2548();
													if (Static326.method4415(local70)) {
														Static54.method914(5, local327, Static207.anInt5452, 0);
													}
													Static300.aClass22_246 = null;
													return true;
												} else if (Static300.aClass22_246 == Static199.aClass22_173) {
													local327 = Static146.aClass4_Sub12_Sub1_3.method2536();
													local70 = Static146.aClass4_Sub12_Sub1_3.method2490();
													local335 = Static146.aClass4_Sub12_Sub1_3.method2490();
													local224 = Static146.aClass4_Sub12_Sub1_3.method2536() << 0;
													local228 = Static146.aClass4_Sub12_Sub1_3.method2490();
													local1190 = Static146.aClass4_Sub12_Sub1_3.method2490();
													if (Static326.method4415(local327)) {
														Static313.method4175(local1190, local224, local335, local228, local70);
													}
													Static300.aClass22_246 = null;
													return true;
												} else if (Static300.aClass22_246 == Static423.aClass22_316) {
													Static300.aClass22_246 = null;
													Static244.anInt3027 = Static325.anInt5640;
													Static376.anInt6277 = 1;
													return true;
												} else if (Static421.aClass22_310 == Static300.aClass22_246) {
													local327 = Static146.aClass4_Sub12_Sub1_3.method2490();
													@Pc(4427) boolean local4427 = (local327 & 0x1) == 1;
													local212 = Static146.aClass4_Sub12_Sub1_3.method2537();
													local535 = Static146.aClass4_Sub12_Sub1_3.method2537();
													if (local535.equals("")) {
														local535 = local212;
													}
													local2080 = Static146.aClass4_Sub12_Sub1_3.method2537();
													local1747 = Static146.aClass4_Sub12_Sub1_3.method2537();
													if (local1747.equals("")) {
														local1747 = local2080;
													}
													if (local4427) {
														for (local2473 = 0; local2473 < Static413.anInt6823; local2473++) {
															if (Static102.aStringArray7[local2473].equals(local1747)) {
																Static326.aStringArray27[local2473] = local212;
																Static102.aStringArray7[local2473] = local535;
																Static315.aStringArray26[local2473] = local2080;
																Static141.aStringArray11[local2473] = local1747;
																break;
															}
														}
													} else {
														Static326.aStringArray27[Static413.anInt6823] = local212;
														Static102.aStringArray7[Static413.anInt6823] = local535;
														Static315.aStringArray26[Static413.anInt6823] = local2080;
														Static141.aStringArray11[Static413.anInt6823] = local1747;
														Static414.aBooleanArray20[Static413.anInt6823] = (local327 & 0x2) == 2;
														Static413.anInt6823++;
													}
													Static300.aClass22_246 = null;
													Static244.anInt3027 = Static325.anInt5640;
													return true;
												} else if (Static300.aClass22_246 == Static27.aClass22_33) {
													Static92.anInt1847 = Static146.aClass4_Sub12_Sub1_3.method2490();
													Static300.aClass22_246 = null;
													Static308.anInt5413 = Static325.anInt5640;
													return true;
												} else if (Static300.aClass22_246 == Static167.aClass22_144) {
													Static188.anInt5353 = Static146.aClass4_Sub12_Sub1_3.method2536() * 30;
													Static300.aClass22_246 = null;
													Static308.anInt5413 = Static325.anInt5640;
													return true;
												} else if (Static82.aClass22_80 == Static300.aClass22_246) {
													local813 = Static146.aClass4_Sub12_Sub1_3.method2537();
													local70 = Static146.aClass4_Sub12_Sub1_3.method2536();
													local335 = Static146.aClass4_Sub12_Sub1_3.method2510();
													if (Static326.method4415(local70)) {
														Static79.method1398(local813, local335);
													}
													Static300.aClass22_246 = null;
													return true;
												} else if (Static300.aClass22_246 == Static164.aClass22_204) {
													Static244.method2572(Static294.aClass21_4);
													Static300.aClass22_246 = null;
													return true;
												} else if (Static169.aClass22_146 == Static300.aClass22_246) {
													local327 = Static146.aClass4_Sub12_Sub1_3.method2548();
													local210 = Static146.aClass4_Sub12_Sub1_3.method2537();
													local335 = Static146.aClass4_Sub12_Sub1_3.method2536();
													if (Static326.method4415(local335)) {
														Static244.method2569(local210, local327);
													}
													Static300.aClass22_246 = null;
													return true;
												} else if (Static131.aClass22_117 == Static300.aClass22_246) {
													local327 = Static146.aClass4_Sub12_Sub1_3.method2529();
													local70 = Static146.aClass4_Sub12_Sub1_3.method2536();
													local335 = Static146.aClass4_Sub12_Sub1_3.method2538();
													if (Static326.method4415(local335)) {
														Static14.method145(local327, local70);
													}
													Static300.aClass22_246 = null;
													return true;
												} else if (Static43.aClass22_332 == Static300.aClass22_246) {
													Static211.method3203();
													Static300.aClass22_246 = null;
													return false;
												} else if (Static300.aClass22_246 == Static3.aClass22_185) {
													local327 = Static146.aClass4_Sub12_Sub1_3.method2536();
													local70 = Static146.aClass4_Sub12_Sub1_3.method2510();
													local335 = Static146.aClass4_Sub12_Sub1_3.method2548();
													if (Static326.method4415(local327)) {
														Static164.method3585(local335, local70);
													}
													Static300.aClass22_246 = null;
													return true;
												} else if (Static300.aClass22_246 == Static230.aClass22_194) {
													Static154.anInt813 = Static146.aClass4_Sub12_Sub1_3.method2534() << 3;
													Static385.anInt6487 = Static146.aClass4_Sub12_Sub1_3.method2542() << 3;
													Static113.anInt2426 = Static146.aClass4_Sub12_Sub1_3.method2523();
													while (Static454.anInt4075 > Static146.aClass4_Sub12_Sub1_3.anInt2997) {
														@Pc(4723) Class21 local4723 = Static448.method5650()[Static146.aClass4_Sub12_Sub1_3.method2490()];
														Static244.method2572(local4723);
													}
													Static300.aClass22_246 = null;
													return true;
												} else if (Static300.aClass22_246 == Static262.aClass22_219) {
													Static184.anInt3532 = Static146.aClass4_Sub12_Sub1_3.method2490();
													Static300.aClass22_246 = null;
													return true;
												} else if (Static300.aClass22_246 == Static422.aClass22_313) {
													Static244.method2572(Static38.aClass21_6);
													Static300.aClass22_246 = null;
													return true;
												} else if (Static300.aClass22_246 == Static154.aClass22_51) {
													local327 = Static146.aClass4_Sub12_Sub1_3.method2536();
													if (Static326.method4415(local327)) {
														Static100.method1773();
													}
													Static300.aClass22_246 = null;
													return true;
												} else if (Static194.aClass22_164 == Static300.aClass22_246) {
													local327 = Static146.aClass4_Sub12_Sub1_3.method2535();
													local70 = Static146.aClass4_Sub12_Sub1_3.method2529();
													local335 = Static146.aClass4_Sub12_Sub1_3.method2535();
													local224 = Static146.aClass4_Sub12_Sub1_3.method2515();
													if (Static326.method4415(local224)) {
														Static400.method5189(local70, local335, local327);
													}
													Static300.aClass22_246 = null;
													return true;
												} else if (Static300.aClass22_246 == Static234.aClass22_199) {
													local327 = Static146.aClass4_Sub12_Sub1_3.method2536();
													if (local327 == 65535) {
														local327 = -1;
													}
													local70 = Static146.aClass4_Sub12_Sub1_3.method2490();
													local335 = Static146.aClass4_Sub12_Sub1_3.method2536();
													local224 = Static146.aClass4_Sub12_Sub1_3.method2490();
													Static187.method2934(local327, local70, local224, local335);
													Static300.aClass22_246 = null;
													return true;
												} else if (Static300.aClass22_246 == Static60.aClass22_63) {
													Static244.method2572(Static410.aClass21_15);
													Static300.aClass22_246 = null;
													return true;
												} else if (Static332.aClass22_269 == Static300.aClass22_246) {
													Static244.method2572(Static35.aClass21_5);
													Static300.aClass22_246 = null;
													return true;
												} else if (Static45.aClass22_49 == Static300.aClass22_246) {
													local327 = Static146.aClass4_Sub12_Sub1_3.method2536();
													local70 = Static146.aClass4_Sub12_Sub1_3.method2490();
													local335 = Static146.aClass4_Sub12_Sub1_3.method2490();
													local224 = Static146.aClass4_Sub12_Sub1_3.method2536() << 0;
													local228 = Static146.aClass4_Sub12_Sub1_3.method2490();
													local1190 = Static146.aClass4_Sub12_Sub1_3.method2490();
													if (Static326.method4415(local327)) {
														Static245.method3596(local224, true, local1190, local335, local70, local228);
													}
													Static300.aClass22_246 = null;
													return true;
												} else if (Static300.aClass22_246 == Static149.aClass22_129) {
													local327 = Static146.aClass4_Sub12_Sub1_3.method2536();
													if (local327 == 65535) {
														local327 = -1;
													}
													local70 = Static146.aClass4_Sub12_Sub1_3.method2490();
													local335 = Static146.aClass4_Sub12_Sub1_3.method2536();
													local224 = Static146.aClass4_Sub12_Sub1_3.method2490();
													Static273.method3912(local70, local335, local327, local224);
													Static300.aClass22_246 = null;
													return true;
												} else if (Static300.aClass22_246 == Static287.aClass22_236) {
													Static244.method2572(Static183.aClass21_11);
													Static300.aClass22_246 = null;
													return true;
												} else if (Static72.aClass22_71 == Static300.aClass22_246) {
													Static124.method2241(false);
													Static300.aClass22_246 = null;
													return true;
												} else if (Static320.aClass22_263 == Static300.aClass22_246) {
													local327 = Static146.aClass4_Sub12_Sub1_3.method2489();
													local70 = Static146.aClass4_Sub12_Sub1_3.method2510();
													local335 = Static146.aClass4_Sub12_Sub1_3.method2548();
													if (Static326.method4415(local335)) {
														Static255.method3686(local327, local70);
													}
													Static300.aClass22_246 = null;
													return true;
												} else if (Static443.aClass22_331 == Static300.aClass22_246) {
													local813 = Static146.aClass4_Sub12_Sub1_3.method2537();
													local1411 = Static146.aClass4_Sub12_Sub1_3.method2490() == 1;
													if (local1411) {
														local210 = Static146.aClass4_Sub12_Sub1_3.method2537();
													} else {
														local210 = local813;
													}
													local224 = Static146.aClass4_Sub12_Sub1_3.method2536();
													@Pc(5040) byte local5040 = Static146.aClass4_Sub12_Sub1_3.method2542();
													local230 = false;
													if (local5040 == -128) {
														local230 = true;
													}
													if (local230) {
														if (Static290.anInt6410 == 0) {
															Static300.aClass22_246 = null;
															return true;
														}
														for (local2473 = 0; Static290.anInt6410 > local2473 && (!Static276.aClass15Array2[local2473].aString7.equals(local210) || Static276.aClass15Array2[local2473].anInt272 != local224); local2473++) {
														}
														if (local2473 < Static290.anInt6410) {
															while (local2473 < Static290.anInt6410 - 1) {
																Static276.aClass15Array2[local2473] = Static276.aClass15Array2[local2473 + 1];
																local2473++;
															}
															Static290.anInt6410--;
															Static276.aClass15Array2[Static290.anInt6410] = null;
														}
													} else {
														local251 = Static146.aClass4_Sub12_Sub1_3.method2537();
														local4235 = new Class15();
														local4235.aString8 = local813;
														local4235.aString7 = local210;
														local4235.aString6 = Static123.method4868(local4235.aString7);
														local4235.aByte1 = local5040;
														local4235.anInt272 = local224;
														local4235.aString5 = local251;
														for (local1267 = Static290.anInt6410 - 1; local1267 >= 0; local1267--) {
															local2494 = Static276.aClass15Array2[local1267].aString6.compareTo(local4235.aString6);
															if (local2494 == 0) {
																Static276.aClass15Array2[local1267].anInt272 = local224;
																Static276.aClass15Array2[local1267].aByte1 = local5040;
																Static276.aClass15Array2[local1267].aString5 = local251;
																if (local210.equals(Static1.aClass16_Sub1_Sub5_Sub1_1.aString44)) {
																	Static160.aByte18 = local5040;
																}
																Static381.anInt6418 = Static325.anInt5640;
																Static300.aClass22_246 = null;
																return true;
															}
															if (local2494 < 0) {
																break;
															}
														}
														if (Static290.anInt6410 >= Static276.aClass15Array2.length) {
															Static300.aClass22_246 = null;
															return true;
														}
														for (local2494 = Static290.anInt6410 - 1; local2494 > local1267; local2494--) {
															Static276.aClass15Array2[local2494 + 1] = Static276.aClass15Array2[local2494];
														}
														if (Static290.anInt6410 == 0) {
															Static276.aClass15Array2 = new Class15[100];
														}
														Static276.aClass15Array2[local1267 + 1] = local4235;
														Static290.anInt6410++;
														if (local210.equals(Static1.aClass16_Sub1_Sub5_Sub1_1.aString44)) {
															Static160.aByte18 = local5040;
														}
													}
													Static300.aClass22_246 = null;
													Static381.anInt6418 = Static325.anInt5640;
													return true;
												} else if (Static300.aClass22_246 == Static1.aClass22_1) {
													Static244.method2572(Static405.aClass21_14);
													Static300.aClass22_246 = null;
													return true;
												} else if (Static300.aClass22_246 == Static201.aClass22_273) {
													Static244.method2572(Static179.aClass21_10);
													Static300.aClass22_246 = null;
													return true;
												} else if (Static214.aClass22_178 == Static300.aClass22_246) {
													local327 = Static146.aClass4_Sub12_Sub1_3.method2536();
													if (local327 == 65535) {
														local327 = -1;
													}
													local70 = Static146.aClass4_Sub12_Sub1_3.method2548();
													local335 = Static146.aClass4_Sub12_Sub1_3.method2511();
													local224 = Static146.aClass4_Sub12_Sub1_3.method2538();
													local228 = Static146.aClass4_Sub12_Sub1_3.method2536();
													if (local228 == 65535) {
														local228 = -1;
													}
													if (Static326.method4415(local70)) {
														for (local1190 = local228; local1190 <= local327; local1190++) {
															local2311 = ((long) local335 << 32) + ((long) local1190);
															local2317 = (Class4_Sub33) Static211.aClass102_18.method2700(local2311);
															if (local2317 != null) {
																local2329 = new Class4_Sub33(local2317.anInt5105, local224);
																local2317.method5684();
															} else if (local1190 == -1) {
																local2329 = new Class4_Sub33(Static392.method5121(local335).aClass4_Sub33_2.anInt5105, local224);
															} else {
																local2329 = new Class4_Sub33(0, local224);
															}
															Static211.aClass102_18.method2703(local2311, local2329);
														}
													}
													Static300.aClass22_246 = null;
													return true;
												} else if (Static300.aClass22_246 == Static379.aClass22_293) {
													local327 = Static146.aClass4_Sub12_Sub1_3.method2548();
													local210 = Static146.aClass4_Sub12_Sub1_3.method2537();
													local335 = Static146.aClass4_Sub12_Sub1_3.method2548();
													if (Static326.method4415(local327)) {
														Static244.method2569(local210, local335);
													}
													Static300.aClass22_246 = null;
													return true;
												} else if (Static277.aClass22_231 == Static300.aClass22_246) {
													Static439.method5553(Static146.aClass4_Sub12_Sub1_3.method2537());
													Static300.aClass22_246 = null;
													return true;
												} else if (Static207.aClass22_253 == Static300.aClass22_246) {
													Static113.anInt2426 = Static146.aClass4_Sub12_Sub1_3.method2523();
													Static154.anInt813 = Static146.aClass4_Sub12_Sub1_3.method2534() << 3;
													Static385.anInt6487 = Static146.aClass4_Sub12_Sub1_3.method2507() << 3;
													for (@Pc(5469) Class4_Sub18 local5469 = (Class4_Sub18) Static440.aClass102_40.method2705(); local5469 != null; local5469 = (Class4_Sub18) Static440.aClass102_40.method2704()) {
														local70 = (int) (local5469.aLong224 & 0x3FFFL);
														local335 = (int) (local5469.aLong224 >> 14 & 0x3FFFL);
														local224 = (int) (local5469.aLong224 >> 28 & 0x3L);
														if (local224 == Static113.anInt2426 && local70 >= Static154.anInt813 && Static154.anInt813 + 8 > local70 && Static385.anInt6487 <= local335 && Static385.anInt6487 + 8 > local335) {
															local5469.method5684();
															Static443.method5595(Static113.anInt2426, local70, local335);
														}
													}
													for (@Pc(5544) Class4_Sub9 local5544 = (Class4_Sub9) Static115.aClass183_15.method4140(); local5544 != null; local5544 = (Class4_Sub9) Static115.aClass183_15.method4144()) {
														if (Static154.anInt813 <= local5544.anInt793 && Static154.anInt813 + 8 > local5544.anInt793 && local5544.anInt790 >= Static385.anInt6487 && Static385.anInt6487 + 8 > local5544.anInt790 && Static113.anInt2426 == local5544.anInt800) {
															local5544.anInt796 = 0;
														}
													}
													Static300.aClass22_246 = null;
													return true;
												} else if (Static300.aClass22_246 == Static106.aClass22_95) {
													local327 = Static146.aClass4_Sub12_Sub1_3.method2511();
													local70 = Static146.aClass4_Sub12_Sub1_3.method2536();
													local335 = Static146.aClass4_Sub12_Sub1_3.method2548();
													if (local335 == 65535) {
														local335 = -1;
													}
													if (Static326.method4415(local70)) {
														Static54.method914(2, local327, local335, -1);
													}
													Static300.aClass22_246 = null;
													return true;
												} else if (Static42.aClass22_46 == Static300.aClass22_246) {
													local327 = Static146.aClass4_Sub12_Sub1_3.method2506();
													local70 = Static146.aClass4_Sub12_Sub1_3.method2529();
													local335 = Static146.aClass4_Sub12_Sub1_3.method2490();
													local535 = "";
													local2080 = local535;
													if ((local335 & 0x1) != 0) {
														local535 = Static146.aClass4_Sub12_Sub1_3.method2537();
														if ((local335 & 0x2) == 0) {
															local2080 = local535;
														} else {
															local2080 = Static146.aClass4_Sub12_Sub1_3.method2537();
														}
													}
													local1747 = Static146.aClass4_Sub12_Sub1_3.method2537();
													if (local327 == 99) {
														Static441.method5568(local1747);
													} else if (local2080.equals("") || !Static239.method3549(local2080)) {
														Static128.method2268(local70, local327, local1747, local535, local2080);
													} else {
														Static300.aClass22_246 = null;
														return true;
													}
													Static300.aClass22_246 = null;
													return true;
												} else if (Static300.aClass22_246 == Static369.aClass22_287) {
													Static413.method5301();
													Static300.aClass22_246 = null;
													return true;
												} else if (Static330.aClass22_266 == Static300.aClass22_246) {
													Static244.method2572(Static106.aClass21_7);
													Static300.aClass22_246 = null;
													return true;
												} else if (Static300.aClass22_246 == Static225.aClass22_192) {
													local327 = Static146.aClass4_Sub12_Sub1_3.method2536();
													local70 = Static146.aClass4_Sub12_Sub1_3.method2529();
													if (Static326.method4415(local327)) {
														@Pc(5751) Class4_Sub43 local5751 = (Class4_Sub43) Static325.aClass102_29.method2700((long) local70);
														if (local5751 != null) {
															Static90.method1606(true, local5751, false);
														}
														if (Static304.aClass247_16 != null) {
															Static63.method1142(Static304.aClass247_16);
															Static304.aClass247_16 = null;
														}
													}
													Static300.aClass22_246 = null;
													return true;
												} else if (Static300.aClass22_246 == Static345.aClass22_278) {
													local327 = Static146.aClass4_Sub12_Sub1_3.method2523();
													local70 = local327 >> 2;
													local335 = local327 & 0x3;
													local224 = Static201.anIntArray410[local70];
													local228 = Static146.aClass4_Sub12_Sub1_3.method2511();
													local1190 = local228 >> 28 & 0x3;
													local2473 = local228 >> 14 & 0x3FFF;
													local1263 = local228 & 0x3FFF;
													local1267 = Static146.aClass4_Sub12_Sub1_3.method2538();
													@Pc(5820) int local5820 = local1263 - Static86.anInt1771;
													if (local1267 == 65535) {
														local1267 = -1;
													}
													local2473 -= Static180.anInt3453;
													Static297.method4071(local1190, local335, local1267, local224, local70, local2473, local5820);
													Static300.aClass22_246 = null;
													return true;
												} else if (Static272.aClass22_230 == Static300.aClass22_246) {
													local327 = Static146.aClass4_Sub12_Sub1_3.method2536();
													local70 = Static146.aClass4_Sub12_Sub1_3.method2490();
													local335 = Static146.aClass4_Sub12_Sub1_3.method2490();
													local224 = Static146.aClass4_Sub12_Sub1_3.method2490();
													local228 = Static146.aClass4_Sub12_Sub1_3.method2490();
													local1190 = Static146.aClass4_Sub12_Sub1_3.method2536();
													if (Static326.method4415(local327)) {
														Static342.aBooleanArray17[local70] = true;
														Static105.anIntArray161[local70] = local335;
														Static41.anIntArray46[local70] = local224;
														Static61.anIntArray65[local70] = local228;
														Static390.anIntArray486[local70] = local1190;
													}
													Static300.aClass22_246 = null;
													return true;
												} else if (Static300.aClass22_246 == Static210.aClass22_175) {
													Static244.method2572(Static420.aClass21_16);
													Static300.aClass22_246 = null;
													return true;
												} else if (Static300.aClass22_246 == Static399.aClass22_301) {
													Static167.aString35 = Static454.anInt4075 > 2 ? Static146.aClass4_Sub12_Sub1_3.method2537() : Static190.aClass83_76.method2267(Static178.anInt3423);
													Static220.anInt4097 = Static454.anInt4075 > 0 ? Static146.aClass4_Sub12_Sub1_3.method2536() : -1;
													Static300.aClass22_246 = null;
													if (Static220.anInt4097 == 65535) {
														Static220.anInt4097 = -1;
													}
													return true;
												} else if (Static287.aClass22_235 == Static300.aClass22_246) {
													local327 = Static146.aClass4_Sub12_Sub1_3.method2529();
													Static216.aClass199_7 = Static206.aClass66_4.method1739(local327);
													Static300.aClass22_246 = null;
													return true;
												} else if (Static452.aClass22_335 == Static300.aClass22_246) {
													Static186.aClass104_2 = Static2.method6(Static146.aClass4_Sub12_Sub1_3.method2490());
													Static300.aClass22_246 = null;
													return true;
												} else if (Static305.aClass22_249 == Static300.aClass22_246) {
													Static95.method1665(Static146.aClass4_Sub12_Sub1_3, Static454.anInt4075, Static206.aClass66_4);
													Static300.aClass22_246 = null;
													return true;
												} else if (Static300.aClass22_246 == Static279.aClass22_330) {
													local327 = Static146.aClass4_Sub12_Sub1_3.method2515();
													local70 = Static146.aClass4_Sub12_Sub1_3.method2536();
													@Pc(6007) byte local6007 = Static146.aClass4_Sub12_Sub1_3.method2534();
													if (Static326.method4415(local327)) {
														Static316.method4221(local70, local6007);
													}
													Static300.aClass22_246 = null;
													return true;
												} else if (Static11.aClass22_16 == Static300.aClass22_246) {
													Static146.aClass4_Sub12_Sub1_3.anInt2997 += 28;
													if (Static146.aClass4_Sub12_Sub1_3.method2500()) {
														Static157.method2669(Static146.aClass4_Sub12_Sub1_3, Static146.aClass4_Sub12_Sub1_3.anInt2997 - 28);
													}
													Static300.aClass22_246 = null;
													return true;
												} else if (Static396.aClass22_214 == Static300.aClass22_246) {
													local327 = Static146.aClass4_Sub12_Sub1_3.method2515();
													local70 = Static146.aClass4_Sub12_Sub1_3.method2515();
													local335 = Static146.aClass4_Sub12_Sub1_3.method2529();
													local224 = Static146.aClass4_Sub12_Sub1_3.method2515();
													if (Static326.method4415(local327)) {
														Static303.method4114(local335, local70 + (local224 << 16));
													}
													Static300.aClass22_246 = null;
													return true;
												} else if (Static300.aClass22_246 == Static113.aClass22_101) {
													Static244.method2572(Static152.aClass21_9);
													Static300.aClass22_246 = null;
													return true;
												} else if (Static300.aClass22_246 == Static360.aClass22_284) {
													local327 = Static146.aClass4_Sub12_Sub1_3.method2511();
													local70 = Static146.aClass4_Sub12_Sub1_3.method2510();
													local335 = Static146.aClass4_Sub12_Sub1_3.method2538();
													if (Static326.method4415(local335)) {
														@Pc(6126) Class4_Sub43 local6126 = (Class4_Sub43) Static325.aClass102_29.method2700((long) local70);
														local1576 = (Class4_Sub43) Static325.aClass102_29.method2700((long) local327);
														if (local1576 != null) {
															Static90.method1606(local6126 == null || local1576.anInt6979 != local6126.anInt6979, local1576, false);
														}
														if (local6126 != null) {
															local6126.method5684();
															Static325.aClass102_29.method2703((long) local327, local6126);
														}
														@Pc(6164) Class247 local6164 = Static392.method5121(local70);
														if (local6164 != null) {
															Static63.method1142(local6164);
														}
														local6164 = Static392.method5121(local327);
														if (local6164 != null) {
															Static63.method1142(local6164);
															Static374.method4998(local6164, true);
														}
														if (Static334.anInt5766 != -1) {
															Static310.method4165(Static334.anInt5766, 1);
														}
													}
													Static300.aClass22_246 = null;
													return true;
												} else if (Static433.aClass22_326 == Static300.aClass22_246) {
													local206 = Static146.aClass4_Sub12_Sub1_3.method2490() == 1;
													local210 = Static146.aClass4_Sub12_Sub1_3.method2537();
													local212 = local210;
													if (local206) {
														local212 = Static146.aClass4_Sub12_Sub1_3.method2537();
													}
													local1252 = Static146.aClass4_Sub12_Sub1_3.method2501();
													local1257 = Static146.aClass4_Sub12_Sub1_3.method2536();
													local3817 = Static146.aClass4_Sub12_Sub1_3.method2493();
													local2494 = Static146.aClass4_Sub12_Sub1_3.method2490();
													@Pc(6247) long local6247 = (local1257 << 32) + local3817;
													@Pc(6249) boolean local6249 = false;
													@Pc(6251) int local6251 = 0;
													while (true) {
														if (local6251 >= 100) {
															if (local2494 <= 1) {
																if (Static109.aBoolean628 && !Static396.aBoolean443 || Static308.aBoolean486) {
																	local6249 = true;
																} else if (Static239.method3549(local212)) {
																	local6249 = true;
																}
															}
															break;
														}
														if (local6247 == Static270.aLongArray7[local6251]) {
															local6249 = true;
															break;
														}
														local6251++;
													}
													if (!local6249 && Static65.anInt1373 == 0) {
														Static270.aLongArray7[Static407.anInt6719] = local6247;
														Static407.anInt6719 = (Static407.anInt6719 + 1) % 100;
														@Pc(6311) String local6311 = Static22.method297(Static261.method3776(Static146.aClass4_Sub12_Sub1_3));
														if (local2494 == 2 || local2494 == 3) {
															Static426.method5438(-1, "<img=1>" + local212, local6311, Static45.method766(local1252), 0, "<img=1>" + local210, 9);
														} else if (local2494 == 1) {
															Static426.method5438(-1, "<img=0>" + local212, local6311, Static45.method766(local1252), 0, "<img=0>" + local210, 9);
														} else {
															Static426.method5438(-1, local212, local6311, Static45.method766(local1252), 0, local210, 9);
														}
													}
													Static300.aClass22_246 = null;
													return true;
												} else {
													Static94.method1654(null, "T1 - " + (Static300.aClass22_246 == null ? -1 : Static300.aClass22_246.method527()) + "," + (Static380.aClass22_294 == null ? -1 : Static380.aClass22_294.method527()) + "," + (Static316.aClass22_257 == null ? -1 : Static316.aClass22_257.method527()) + " - " + Static454.anInt4075);
													Static251.method3639();
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

	@OriginalMember(owner = "client!is", name = "b", descriptor = "(I)V")
	public static void method2817() {
		Static356.aClass68_43.method1777();
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(BI)I")
	public static int method2820(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}
