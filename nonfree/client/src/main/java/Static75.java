import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!cia", name = "c", descriptor = "Lclient!rg;")
	public static Class310 aClass310_17;

	@OriginalMember(owner = "client!cia", name = "b", descriptor = "Z")
	public static boolean aBoolean74 = false;

	@OriginalMember(owner = "client!cia", name = "h", descriptor = "[I")
	public static final int[] anIntArray71 = new int[1000];

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(Lclient!tga;I)Z")
	public static boolean method1228(@OriginalArg(0) Class347 arg0) throws IOException {
		@Pc(8) Class278 local8 = arg0.aClass278_2;
		@Pc(11) Class14_Sub21_Sub2 local11 = arg0.aClass14_Sub21_Sub2_1;
		if (local8 == null) {
			return false;
		}
		@Pc(100) int local100;
		if (arg0.aClass160_244 == null) {
			if (arg0.aBoolean663) {
				if (!local8.method6653(1)) {
					return false;
				}
				local8.method6650(1, arg0.aClass14_Sub21_Sub2_1.aByteArray99, 0);
				arg0.anInt9630 = 0;
				arg0.aBoolean663 = false;
				arg0.anInt9631++;
			}
			local11.anInt8936 = 0;
			if (local11.method7767()) {
				if (!local8.method6653(1)) {
					return false;
				}
				local8.method6650(1, arg0.aClass14_Sub21_Sub2_1.aByteArray99, 1);
				arg0.anInt9630 = 0;
				arg0.anInt9631++;
			}
			arg0.aBoolean663 = true;
			@Pc(96) Class160[] local96 = Static665.method9231();
			local100 = local11.method7769();
			if (local100 < 0 || local100 >= local96.length) {
				throw new IOException("invo:" + local100 + " ip:" + local11.anInt8936);
			}
			arg0.aClass160_244 = local96[local100];
			arg0.anInt9628 = arg0.aClass160_244.anInt4436;
		}
		if (arg0.anInt9628 == -1) {
			if (!local8.method6653(1)) {
				return false;
			}
			local8.method6650(1, local11.aByteArray99, 0);
			arg0.anInt9630 = 0;
			arg0.anInt9628 = local11.aByteArray99[0] & 0xFF;
			arg0.anInt9631++;
		}
		if (arg0.anInt9628 == -2) {
			if (!local8.method6653(2)) {
				return false;
			}
			local8.method6650(2, local11.aByteArray99, 0);
			local11.anInt8936 = 0;
			arg0.anInt9628 = local11.method7717(-1978450544);
			arg0.anInt9631 += 2;
			arg0.anInt9630 = 0;
		}
		if (arg0.anInt9628 > 0) {
			if (!local8.method6653(arg0.anInt9628)) {
				return false;
			}
			local11.anInt8936 = 0;
			local8.method6650(arg0.anInt9628, local11.aByteArray99, 0);
			arg0.anInt9630 = 0;
			arg0.anInt9631 += arg0.anInt9628;
		}
		arg0.aClass160_243 = arg0.aClass160_242;
		arg0.aClass160_242 = arg0.aClass160_245;
		arg0.aClass160_245 = arg0.aClass160_244;
		@Pc(340) String local340;
		@Pc(288) boolean local288;
		@Pc(304) int local304;
		@Pc(308) int local308;
		@Pc(294) String local294;
		@Pc(292) String local292;
		@Pc(310) boolean local310;
		if (arg0.aClass160_244 == Static110.aClass160_50) {
			local288 = local11.method7695(94) == 1;
			local292 = local11.method7703(0);
			local294 = local292;
			if (local288) {
				local294 = local11.method7703(0);
			}
			local304 = local11.method7695(101);
			local308 = local11.method7717(-1978450544);
			local310 = false;
			if (local304 <= 1 && Static130.method2006(local294)) {
				local310 = true;
			}
			if (!local310 && Static26.anInt351 == 0) {
				local340 = Static592.aClass46_2.method897(local308).method1679(local11);
				if (local304 == 2) {
					Static218.method3767((String) null, local292, "<img=1>" + local294, 25, local308, 0, local340, "<img=1>" + local292);
				} else if (local304 == 1) {
					Static218.method3767((String) null, local292, "<img=0>" + local294, 25, local308, 0, local340, "<img=0>" + local292);
				} else {
					Static218.method3767((String) null, local292, local294, 25, local308, 0, local340, local292);
				}
			}
			arg0.aClass160_244 = null;
			return true;
		}
		@Pc(460) int local460;
		@Pc(526) int local526;
		@Pc(437) int local437;
		@Pc(585) int local585;
		@Pc(473) boolean local473;
		if (arg0.aClass160_244 == Static219.aClass160_108) {
			local437 = local11.method7717(-1978450544);
			@Pc(444) Class4_Sub3_Sub3_Sub3_Sub2 local444;
			if (Static597.anInt9858 == local437) {
				local444 = Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1;
			} else {
				local444 = Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4[local437];
			}
			if (local444 == null) {
				arg0.aClass160_244 = null;
				return true;
			}
			local460 = local11.method7717(-1978450544);
			local304 = local11.method7695(98);
			local473 = (local460 & 0x8000) != 0;
			if (local444.aString37 != null && local444.aClass398_1 != null) {
				local310 = false;
				if (local304 <= 1) {
					if (!local473 && (Static321.aBoolean403 && !Static586.aBoolean669 || Static292.aBoolean395)) {
						local310 = true;
					} else if (Static130.method2006(local444.aString37)) {
						local310 = true;
					}
				}
				if (!local310 && Static26.anInt351 == 0) {
					local526 = -1;
					if (local473) {
						local460 &= 0x7FFF;
						@Pc(544) Class184 local544 = Static47.method800(local11);
						local526 = local544.anInt5127;
						local340 = local544.aClass14_Sub2_Sub8_1.method1679(local11);
					} else {
						local340 = Static159.method2265(Static98.method1622(local11));
					}
					local444.method2898(local460 & 0xFF, local340.trim(), local460 >> 8);
					if (local304 == 1 || local304 == 2) {
						local585 = local473 ? 17 : 1;
					} else {
						local585 = local473 ? 17 : 2;
					}
					if (local304 == 2) {
						Static218.method3767((String) null, local444.aString38, "<img=1>" + local444.method2887(), local585, local526, 0, local340, "<img=1>" + local444.method2888());
					} else if (local304 == 1) {
						Static218.method3767((String) null, local444.aString38, "<img=0>" + local444.method2887(), local585, local526, 0, local340, "<img=0>" + local444.method2888());
					} else {
						Static218.method3767((String) null, local444.aString38, local444.method2887(), local585, local526, 0, local340, local444.method2888());
					}
				}
			}
			arg0.aClass160_244 = null;
			return true;
		} else if (arg0.aClass160_244 == Static481.aClass160_276) {
			local437 = local11.method7754();
			local292 = local11.method7703(0);
			Static570.method8145();
			Static98.method1623(local437, local292);
			arg0.aClass160_244 = null;
			return true;
		} else if (Static288.aClass160_150 == arg0.aClass160_244) {
			Static675.method9344(Static211.aClass27_6);
			arg0.aClass160_244 = null;
			return true;
		} else {
			@Pc(797) Class14_Sub6 local797;
			@Pc(791) long local791;
			if (Static421.aClass160_188 == arg0.aClass160_244) {
				local437 = local11.method7726();
				local100 = local11.method7708();
				if (local100 == 65535) {
					local100 = -1;
				}
				local460 = local11.method7717(-1978450544);
				if (local460 == 65535) {
					local460 = -1;
				}
				local304 = local11.method7748();
				Static570.method8145();
				for (local308 = local460; local308 <= local100; local308++) {
					local791 = ((long) local437 << 32) + ((long) local308);
					local797 = (Class14_Sub6) Static574.aClass125_40.method2630(local791);
					@Pc(806) Class14_Sub6 local806;
					if (local797 != null) {
						local806 = new Class14_Sub6(local304, local797.anInt455);
						local797.method9513();
					} else if (local308 == -1) {
						local806 = new Class14_Sub6(local304, Static391.method5936(local437).aClass14_Sub6_4.anInt455);
					} else {
						local806 = new Class14_Sub6(local304, -1);
					}
					Static574.aClass125_40.method2626(local806, local791);
				}
				arg0.aClass160_244 = null;
				return true;
			}
			@Pc(937) String local937;
			if (Static497.aClass160_214 == arg0.aClass160_244) {
				local288 = local11.method7695(100) == 1;
				local292 = local11.method7703(0);
				local294 = local292;
				if (local288) {
					local294 = local11.method7703(0);
				}
				local304 = local11.method7695(115);
				local473 = false;
				if (local304 <= 1) {
					if (Static321.aBoolean403 && !Static586.aBoolean669 || Static292.aBoolean395) {
						local473 = true;
					} else if (local304 <= 1 && Static130.method2006(local294)) {
						local473 = true;
					}
				}
				if (!local473 && Static26.anInt351 == 0) {
					local937 = Static159.method2265(Static98.method1622(local11));
					if (local304 == 2) {
						Static218.method3767((String) null, local292, "<img=1>" + local294, 24, -1, 0, local937, "<img=1>" + local292);
					} else if (local304 == 1) {
						Static218.method3767((String) null, local292, "<img=0>" + local294, 24, -1, 0, local937, "<img=0>" + local292);
					} else {
						Static218.method3767((String) null, local292, local294, 24, -1, 0, local937, local292);
					}
				}
				arg0.aClass160_244 = null;
				return true;
			} else if (Static685.aClass160_131 == arg0.aClass160_244) {
				Static676.anInt11214 = Static154.anInt2379;
				local288 = local11.method7695(104) == 1;
				if (arg0.anInt9628 != 1) {
					if (local288) {
						Static71.aClass14_Sub48_1 = new Class14_Sub48(local11);
					} else {
						Static412.aClass14_Sub48_2 = new Class14_Sub48(local11);
					}
					arg0.aClass160_244 = null;
					return true;
				}
				if (local288) {
					Static71.aClass14_Sub48_1 = null;
				} else {
					Static412.aClass14_Sub48_2 = null;
				}
				arg0.aClass160_244 = null;
				return true;
			} else {
				@Pc(1173) int local1173;
				@Pc(1290) boolean local1290;
				@Pc(1292) int local1292;
				if (arg0.aClass160_244 == Static627.aClass160_264) {
					Static101.anInt1748 = Static154.anInt2379;
					if (arg0.anInt9628 == 0) {
						Static360.aString77 = null;
						arg0.aClass160_244 = null;
						Static67.anInt1036 = 0;
						Static51.aString18 = null;
						Static293.aClass165Array1 = null;
						return true;
					}
					Static51.aString18 = local11.method7703(0);
					local288 = local11.method7695(115) == 1;
					if (local288) {
						local11.method7703(0);
					}
					@Pc(1143) long local1143 = local11.method7729();
					Static360.aString77 = Static580.method8268(local1143);
					Static58.aByte16 = local11.method7720();
					local304 = local11.method7695(100);
					if (local304 == 255) {
						arg0.aClass160_244 = null;
						return true;
					}
					Static67.anInt1036 = local304;
					@Pc(1171) Class165[] local1171 = new Class165[100];
					for (local1173 = 0; local1173 < Static67.anInt1036; local1173++) {
						local1171[local1173] = new Class165();
						local1171[local1173].aString54 = local11.method7703(0);
						local288 = local11.method7695(111) == 1;
						if (local288) {
							local1171[local1173].aString53 = local11.method7703(0);
						} else {
							local1171[local1173].aString53 = local1171[local1173].aString54;
						}
						local1171[local1173].aString51 = Static531.method7864(local1171[local1173].aString53);
						local1171[local1173].anInt4578 = local11.method7717(-1978450544);
						local1171[local1173].aByte86 = local11.method7720();
						local1171[local1173].aString52 = local11.method7703(0);
						if (local1171[local1173].aString53.equals(Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aString37)) {
							Static36.aByte14 = local1171[local1173].aByte86;
						}
					}
					local585 = Static67.anInt1036;
					while (local585 > 0) {
						local585--;
						local1290 = true;
						for (local1292 = 0; local1292 < local585; local1292++) {
							if (local1171[local1292].aString51.compareTo(local1171[local1292 + 1].aString51) > 0) {
								@Pc(1313) Class165 local1313 = local1171[local1292];
								local1171[local1292] = local1171[local1292 + 1];
								local1290 = false;
								local1171[local1292 + 1] = local1313;
							}
						}
						if (local1290) {
							break;
						}
					}
					arg0.aClass160_244 = null;
					Static293.aClass165Array1 = local1171;
					return true;
				}
				@Pc(1418) int local1418;
				@Pc(1393) long local1393;
				@Pc(1504) String local1504;
				@Pc(1416) boolean local1416;
				if (arg0.aClass160_244 == Static157.aClass160_66) {
					local288 = local11.method7695(97) == 1;
					local292 = local11.method7703(0);
					local294 = local292;
					if (local288) {
						local294 = local11.method7703(0);
					}
					local1393 = local11.method7729();
					local791 = (long) local11.method7717(-1978450544);
					@Pc(1403) long local1403 = (long) local11.method7719();
					local1292 = local11.method7695(113);
					@Pc(1414) long local1414 = (local791 << 32) + local1403;
					local1416 = false;
					local1418 = 0;
					while (true) {
						if (local1418 >= 100) {
							if (local1292 <= 1) {
								if (Static321.aBoolean403 && !Static586.aBoolean669 || Static292.aBoolean395) {
									local1416 = true;
								} else if (Static130.method2006(local294)) {
									local1416 = true;
								}
							}
							break;
						}
						if (Static6.aLongArray2[local1418] == local1414) {
							local1416 = true;
							break;
						}
						local1418++;
					}
					if (!local1416 && Static26.anInt351 == 0) {
						Static6.aLongArray2[Static461.anInt7683] = local1414;
						Static461.anInt7683 = (Static461.anInt7683 + 1) % 100;
						local1504 = Static159.method2265(Static98.method1622(local11));
						if (local1292 == 2 || local1292 == 3) {
							Static218.method3767(Static509.method7631(local1393), local292, "<img=1>" + local294, 9, -1, 0, local1504, "<img=1>" + local292);
						} else if (local1292 == 1) {
							Static218.method3767(Static509.method7631(local1393), local292, "<img=0>" + local294, 9, -1, 0, local1504, "<img=0>" + local292);
						} else {
							Static218.method3767(Static509.method7631(local1393), local292, local294, 9, -1, 0, local1504, local292);
						}
					}
					arg0.aClass160_244 = null;
					return true;
				} else if (arg0.aClass160_244 == Static227.aClass160_112) {
					local437 = local11.method7748();
					local100 = local11.method7717(-1978450544);
					Static570.method8145();
					Static497.method7462(local100, local437);
					arg0.aClass160_244 = null;
					return true;
				} else if (Static537.aClass160_227 == arg0.aClass160_244) {
					local437 = local11.method7714();
					local100 = local11.method7731();
					local460 = local11.method7714();
					Static105.anIntArray504[local437] = local100;
					Static462.anIntArray408[local437] = local460;
					Static185.anIntArray184[local437] = 1;
					local304 = Static172.anIntArray150[local437] - 1;
					for (local308 = 0; local308 < local304; local308++) {
						if (local100 >= Class310.anIntArray465[local308]) {
							Static185.anIntArray184[local437] = local308 + 2;
						}
					}
					Static529.anIntArray469[Static445.anInt7493++ & 0x1F] = local437;
					arg0.aClass160_244 = null;
					return true;
				} else if (arg0.aClass160_244 == Static29.aClass160_8) {
					Static676.anInt11214 = Static154.anInt2379;
					local288 = local11.method7695(123) == 1;
					@Pc(1727) Class145 local1727 = new Class145(local11);
					@Pc(1731) Class14_Sub48 local1731;
					if (local288) {
						local1731 = Static71.aClass14_Sub48_1;
					} else {
						local1731 = Static412.aClass14_Sub48_2;
					}
					local1727.method3205(local1731);
					arg0.aClass160_244 = null;
					return true;
				} else if (Static635.aClass160_267 == arg0.aClass160_244) {
					Static479.method7247();
					arg0.aClass160_244 = null;
					return false;
				} else {
					@Pc(1797) int local1797;
					if (Static333.aClass160_259 == arg0.aClass160_244) {
						local437 = local11.method7717(-1978450544);
						if (local437 == 65535) {
							local437 = -1;
						}
						local100 = local11.method7748();
						local460 = local100 >> 28 & 0x3;
						local304 = local100 >> 14 & 0x3FFF;
						local308 = local100 & 0x3FFF;
						local1173 = local11.method7738(1275460792);
						local1797 = local1173 >> 2;
						local526 = local1173 & 0x3;
						local304 -= Static36.anInt617;
						local585 = Static135.anIntArray136[local1797];
						local308 -= Static550.anInt9242;
						Static186.method2744(local308, local437, local585, local1797, local460, local304, local526);
						arg0.aClass160_244 = null;
						return true;
					}
					@Pc(1839) byte local1839;
					if (Static94.aClass160_48 == arg0.aClass160_244) {
						local437 = local11.method7738(1275460792);
						local1839 = local11.method7688();
						Static570.method8145();
						Static470.method7059(local437, local1839);
						arg0.aClass160_244 = null;
						return true;
					} else if (Static20.aClass160_7 == arg0.aClass160_244) {
						local437 = local11.method7714();
						local100 = local11.method7695(121);
						local460 = local11.method7749(-16669);
						local304 = local11.method7708() << 2;
						local308 = local11.method7738(1275460792);
						Static570.method8145();
						Static229.method3852(local437, local460, local304, local100, local308);
						arg0.aClass160_244 = null;
						return true;
					} else if (arg0.aClass160_244 == Static552.aClass160_228) {
						Static570.method8145();
						Static535.method7897();
						arg0.aClass160_244 = null;
						return true;
					} else if (Static491.aClass160_212 == arg0.aClass160_244) {
						local437 = local11.method7731();
						Static570.method8145();
						Static457.method6747(Static597.anInt9858, local437, 0, 5);
						arg0.aClass160_244 = null;
						return true;
					} else if (Static597.aClass160_252 == arg0.aClass160_244) {
						Static193.anInt9745 = local11.method7720() << 3;
						Static513.anInt8429 = local11.method7749(-16669);
						Static202.anInt3500 = local11.method7734() << 3;
						while (arg0.anInt9628 > local11.anInt8936) {
							@Pc(1962) Class27 local1962 = Static242.method4051()[local11.method7695(124)];
							Static675.method9344(local1962);
						}
						arg0.aClass160_244 = null;
						return true;
					} else if (Static601.aClass160_254 == arg0.aClass160_244) {
						local437 = local11.method7708();
						local100 = local11.method7695(112);
						Static570.method8145();
						if (local100 == 2) {
							Static662.method9211();
						}
						Static358.anInt6145 = local437;
						Static437.method6519(local437);
						Static379.method5835(false);
						Static672.method9294(Static358.anInt6145);
						for (local460 = 0; local460 < 100; local460++) {
							Static415.aBooleanArray17[local460] = true;
						}
						arg0.aClass160_244 = null;
						return true;
					} else if (Static671.aClass160_278 == arg0.aClass160_244) {
						Static675.method9344(Static459.aClass27_18);
						arg0.aClass160_244 = null;
						return true;
					} else if (Static116.aClass160_51 == arg0.aClass160_244) {
						local437 = local11.method7717(-1978450544);
						local100 = local11.method7748();
						if (Static576.anObjectArray36 == null) {
							Static576.anObjectArray36 = new Object[Static258.aClass370_1.anInt10393];
						}
						Static576.anObjectArray36[local437] = Integer.valueOf(local100);
						Static229.anIntArray226[Static538.anInt9199++ & 0x1F] = local437;
						arg0.aClass160_244 = null;
						return true;
					} else if (arg0.aClass160_244 == Static219.aClass160_106) {
						local437 = local11.method7738(1275460792);
						Static570.method8145();
						arg0.aClass160_244 = null;
						Static56.anInt962 = local437;
						return true;
					} else if (arg0.aClass160_244 == Static509.aClass160_220) {
						local437 = local11.method7726();
						local100 = local11.method7708();
						Static188.aClass238_1.method5869(local437, local100);
						arg0.aClass160_244 = null;
						return true;
					} else {
						@Pc(2674) int local2674;
						@Pc(2393) int local2393;
						@Pc(2190) boolean local2190;
						@Pc(2619) int local2619;
						@Pc(2612) int local2612;
						@Pc(2439) int local2439;
						if (Static586.aClass160_247 == arg0.aClass160_244) {
							local437 = local11.method7748();
							local100 = local11.method7708();
							local460 = local11.method7754();
							local304 = local11.method7738(1275460792);
							local308 = local11.method7695(127);
							local1173 = local11.method7712();
							local1797 = local308 & 0x7;
							local526 = local308 >> 3 & 0xF;
							if (local526 == 15) {
								local526 = -1;
							}
							local2190 = (local308 >> 7 & 0x1) == 1;
							if (local437 >> 30 == 0) {
								@Pc(2330) int local2330;
								@Pc(2294) Class259 local2294;
								@Pc(2272) Class203 local2272;
								@Pc(2288) Class259 local2288;
								if (local437 >> 29 != 0) {
									local1292 = local437 & 0xFFFF;
									@Pc(2419) Class14_Sub44 local2419 = (Class14_Sub44) Static100.aClass125_9.method2630((long) local1292);
									if (local2419 != null) {
										@Pc(2424) Class4_Sub3_Sub3_Sub3_Sub1 local2424 = local2419.aClass4_Sub3_Sub3_Sub3_Sub1_2;
										if (local100 == 65535) {
											local100 = -1;
										}
										@Pc(2434) Class214 local2434 = local2424.aClass214Array3[local304];
										@Pc(2436) boolean local2436 = true;
										local2439 = local2434.anInt5678;
										if (local100 != -1 && local2439 != -1) {
											if (local100 == local2439) {
												local2272 = Static453.aClass281_2.method6686(local100);
												if (local2272.aBoolean402 && local2272.anInt5538 != -1) {
													local2288 = Static59.aClass204_1.method5041(local2272.anInt5538);
													@Pc(2523) int local2523 = local2288.anInt7194;
													if (local2523 == 0 || local2523 == 2) {
														local2436 = false;
													} else if (local2523 == 1) {
														local2436 = true;
													}
												}
											} else {
												local2272 = Static453.aClass281_2.method6686(local100);
												@Pc(2463) Class203 local2463 = Static453.aClass281_2.method6686(local2439);
												if (local2272.anInt5538 != -1 && local2463.anInt5538 != -1) {
													local2294 = Static59.aClass204_1.method5041(local2272.anInt5538);
													@Pc(2486) Class259 local2486 = Static59.aClass204_1.method5041(local2463.anInt5538);
													if (local2486.anInt7201 > local2294.anInt7201) {
														local2436 = false;
													}
												}
											}
										}
										if (local2436) {
											local2434.anInt5683 = local526;
											local2434.anInt5678 = local100;
											local2434.anInt5680 = local1173;
											if (local100 == -1) {
												local2434.aClass181_10.method8964(-1, 0);
											} else {
												local2272 = Static453.aClass281_2.method6686(local100);
												local2330 = local2272.aBoolean402 ? 0 : 2;
												if (local2190) {
													local2330 = 1;
												}
												local2434.aClass181_10.method8955(local2330, false, local460, local2272.anInt5538);
											}
										}
									}
								} else if (local437 >> 28 != 0) {
									local1292 = local437 & 0xFFFF;
									@Pc(2227) Class4_Sub3_Sub3_Sub3_Sub2 local2227;
									if (local1292 == Static597.anInt9858) {
										local2227 = Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1;
									} else {
										local2227 = Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4[local1292];
									}
									if (local2227 != null) {
										@Pc(2238) Class214 local2238 = local2227.aClass214Array3[local304];
										if (local100 == 65535) {
											local100 = -1;
										}
										local1416 = true;
										local1418 = local2238.anInt5678;
										@Pc(2267) Class203 local2267;
										if (local100 != -1 && local1418 != -1) {
											if (local1418 == local100) {
												local2267 = Static453.aClass281_2.method6686(local100);
												if (local2267.aBoolean402 && local2267.anInt5538 != -1) {
													@Pc(2327) Class259 local2327 = Static59.aClass204_1.method5041(local2267.anInt5538);
													local2330 = local2327.anInt7194;
													if (local2330 == 0 || local2330 == 2) {
														local1416 = false;
													} else if (local2330 == 1) {
														local1416 = true;
													}
												}
											} else {
												local2267 = Static453.aClass281_2.method6686(local100);
												local2272 = Static453.aClass281_2.method6686(local1418);
												if (local2267.anInt5538 != -1 && local2272.anInt5538 != -1) {
													local2288 = Static59.aClass204_1.method5041(local2267.anInt5538);
													local2294 = Static59.aClass204_1.method5041(local2272.anInt5538);
													if (local2288.anInt7201 < local2294.anInt7201) {
														local1416 = false;
													}
												}
											}
										}
										if (local1416) {
											local2238.anInt5683 = local526;
											local2238.anInt5678 = local100;
											local2238.anInt5680 = local1173;
											local2238.anInt5682 = local1797;
											if (local100 == -1) {
												local2238.aClass181_10.method8964(-1, 0);
											} else {
												local2267 = Static453.aClass281_2.method6686(local100);
												local2393 = local2267.aBoolean402 ? 0 : 2;
												if (local2190) {
													local2393 = 1;
												}
												local2238.aClass181_10.method8955(local2393, false, local460, local2267.anInt5538);
											}
										}
									}
								}
							} else {
								local1292 = local437 >> 28 & 0x3;
								local2612 = (local437 >> 14 & 0x3FFF) - Static36.anInt617;
								local2619 = (local437 & 0x3FFF) - Static550.anInt9242;
								if (local2612 >= 0 && local2619 >= 0 && local2612 < Static380.anInt6689 && local2619 < Static542.anInt9214) {
									if (local100 == -1) {
										@Pc(2655) Class14_Sub2_Sub11 local2655 = (Class14_Sub2_Sub11) Static598.aClass125_42.method2630((long) (local2612 << 16 | local2619));
										if (local2655 != null) {
											local2655.aClass4_Sub3_Sub3_Sub1_1.method2322();
											local2655.method9513();
										}
									} else {
										local2674 = local2612 * 512 + 256;
										local1418 = local2619 * 512 + 256;
										local2439 = local1292;
										if (local1292 < 3 && Static551.method7974(local2612, local2619)) {
											local2439 = local1292 + 1;
										}
										@Pc(2718) Class4_Sub3_Sub3_Sub1 local2718 = new Class4_Sub3_Sub3_Sub1(local100, local460, local1292, local2439, local2674, Static388.method5919(local1418, local2674, local1292) - local1173, local1418, local2612, local2612, local2619, local2619, local1797, local2190);
										Static598.aClass125_42.method2626(new Class14_Sub2_Sub11(local2718), (long) (local2612 << 16 | local2619));
									}
								}
							}
							arg0.aClass160_244 = null;
							return true;
						} else if (Static574.aClass160_238 == arg0.aClass160_244) {
							local437 = local11.method7717(-1978450544);
							if (local437 == 65535) {
								local437 = -1;
							}
							local100 = local11.method7695(110);
							local460 = local11.method7717(-1978450544);
							local304 = local11.method7695(102);
							local308 = local11.method7717(-1978450544);
							Static400.method968(local304, local437, local460, local308, local100);
							arg0.aClass160_244 = null;
							return true;
						} else if (Static222.aClass160_109 == arg0.aClass160_244) {
							Static675.method9344(Static411.aClass27_12);
							arg0.aClass160_244 = null;
							return true;
						} else if (arg0.aClass160_244 == Static165.aClass160_72) {
							Static675.method9344(Static203.aClass27_5);
							arg0.aClass160_244 = null;
							return true;
						} else if (Static503.aClass160_217 == arg0.aClass160_244) {
							Static202.anInt3500 = local11.method7734() << 3;
							Static513.anInt8429 = local11.method7695(110);
							Static193.anInt9745 = local11.method7734() << 3;
							for (@Pc(2828) Class14_Sub25 local2828 = (Class14_Sub25) Static282.aClass125_17.method2633(); local2828 != null; local2828 = (Class14_Sub25) Static282.aClass125_17.method2627()) {
								local100 = (int) (local2828.aLong324 >> 28 & 0x3L);
								local460 = (int) (local2828.aLong324 & 0x3FFFL);
								local304 = local460 - Static36.anInt617;
								local308 = (int) (local2828.aLong324 >> 14 & 0x3FFFL);
								local1173 = local308 - Static550.anInt9242;
								if (Static513.anInt8429 == local100 && local304 >= Static202.anInt3500 && Static202.anInt3500 + 8 > local304 && Static193.anInt9745 <= local1173 && local1173 < Static193.anInt9745 + 8) {
									local2828.method9513();
									if (local304 >= 0 && local1173 >= 0 && Static380.anInt6689 > local304 && Static542.anInt9214 > local1173) {
										Static379.method5837(Static513.anInt8429, local304, local1173);
									}
								}
							}
							@Pc(2952) Class14_Sub3 local2952;
							for (local2952 = (Class14_Sub3) Static461.aClass32_44.method584(); local2952 != null; local2952 = (Class14_Sub3) Static461.aClass32_44.method577()) {
								if (local2952.anInt233 >= Static202.anInt3500 && Static202.anInt3500 + 8 > local2952.anInt233 && local2952.anInt224 >= Static193.anInt9745 && Static193.anInt9745 + 8 > local2952.anInt224 && Static513.anInt8429 == local2952.anInt231) {
									local2952.aBoolean18 = true;
								}
							}
							for (local2952 = (Class14_Sub3) Static74.aClass32_2.method584(); local2952 != null; local2952 = (Class14_Sub3) Static74.aClass32_2.method577()) {
								if (Static202.anInt3500 <= local2952.anInt233 && Static202.anInt3500 + 8 > local2952.anInt233 && Static193.anInt9745 <= local2952.anInt224 && Static193.anInt9745 + 8 > local2952.anInt224 && local2952.anInt231 == Static513.anInt8429) {
									local2952.aBoolean18 = true;
								}
							}
							arg0.aClass160_244 = null;
							return true;
						} else if (arg0.aClass160_244 == Static209.aClass160_283) {
							@Pc(3088) String local3088 = local11.method7703(0);
							local100 = local11.method7717(-1978450544);
							local294 = Static592.aClass46_2.method897(local100).method1679(local11);
							Static218.method3767((String) null, local3088, local3088, 19, local100, 0, local294, local3088);
							arg0.aClass160_244 = null;
							return true;
						} else if (arg0.aClass160_244 == Static563.aClass160_138) {
							local437 = local11.method7712();
							local100 = local11.method7748();
							Static570.method8145();
							Static140.method2125(local437, local100);
							arg0.aClass160_244 = null;
							return true;
						} else if (Static624.aClass160_261 == arg0.aClass160_244) {
							Static461.method6796(arg0.anInt9628, local11, Static344.aClass173_5);
							arg0.aClass160_244 = null;
							return true;
						} else {
							@Pc(3208) long local3208;
							@Pc(3210) boolean local3210;
							@Pc(3282) String local3282;
							if (Static158.aClass160_67 == arg0.aClass160_244) {
								local288 = local11.method7695(118) == 1;
								local292 = local11.method7703(0);
								local294 = local292;
								if (local288) {
									local294 = local11.method7703(0);
								}
								local1393 = (long) local11.method7717(-1978450544);
								local791 = (long) local11.method7719();
								local526 = local11.method7695(117);
								local585 = local11.method7717(-1978450544);
								local3208 = (local1393 << 32) + local791;
								local3210 = false;
								local2674 = 0;
								while (true) {
									if (local2674 >= 100) {
										if (local526 <= 1 && Static130.method2006(local294)) {
											local3210 = true;
										}
										break;
									}
									if (Static6.aLongArray2[local2674] == local3208) {
										local3210 = true;
										break;
									}
									local2674++;
								}
								if (!local3210 && Static26.anInt351 == 0) {
									Static6.aLongArray2[Static461.anInt7683] = local3208;
									Static461.anInt7683 = (Static461.anInt7683 + 1) % 100;
									local3282 = Static592.aClass46_2.method897(local585).method1679(local11);
									if (local526 == 2) {
										Static218.method3767((String) null, local292, "<img=1>" + local294, 18, local585, 0, local3282, "<img=1>" + local292);
									} else if (local526 == 1) {
										Static218.method3767((String) null, local292, "<img=0>" + local294, 18, local585, 0, local3282, "<img=0>" + local292);
									} else {
										Static218.method3767((String) null, local292, local294, 18, local585, 0, local3282, local292);
									}
								}
								arg0.aClass160_244 = null;
								return true;
							} else if (arg0.aClass160_244 == Static383.aClass160_178) {
								Static563.anInt4929 = local11.method7755();
								Static321.aBoolean403 = local11.method7695(121) == 1;
								arg0.aClass160_244 = null;
								return true;
							} else if (arg0.aClass160_244 == Static614.aClass160_258) {
								Static334.method5151(Static669.aBoolean764);
								arg0.aClass160_244 = null;
								return false;
							} else if (Static180.aClass160_87 == arg0.aClass160_244) {
								local437 = local11.method7727();
								local100 = local11.method7752();
								local460 = local11.method7748();
								Static570.method8145();
								Static83.method1420(local460, local100, local437);
								arg0.aClass160_244 = null;
								return true;
							} else if (arg0.aClass160_244 == Static549.aClass160_33) {
								@Pc(3446) byte local3446 = local11.method7734();
								local100 = local11.method7754();
								Static570.method8145();
								Static63.method1037(local100, local3446);
								arg0.aClass160_244 = null;
								return true;
							} else {
								@Pc(3484) boolean local3484;
								if (Static613.aClass160_257 == arg0.aClass160_244) {
									local437 = local11.method7717(-1978450544);
									local100 = local11.method7695(115);
									local3484 = (local100 & 0x1) == 1;
									while (arg0.anInt9628 > local11.anInt8936) {
										local304 = local11.method7728(-129);
										local308 = local11.method7717(-1978450544);
										local1173 = 0;
										if (local308 != 0) {
											local1173 = local11.method7695(119);
											if (local1173 == 255) {
												local1173 = local11.method7748();
											}
										}
										Static391.method5937(local1173, local437, local308 - 1, local3484, local304);
									}
									Static663.anIntArray579[Static446.anInt7495++ & 0x1F] = local437;
									arg0.aClass160_244 = null;
									return true;
								} else if (arg0.aClass160_244 == Static60.aClass160_26) {
									Static675.method9344(Static158.aClass27_4);
									arg0.aClass160_244 = null;
									return true;
								} else if (arg0.aClass160_244 == Static558.aClass160_231) {
									local437 = local11.method7717(-1978450544);
									if (local437 == 65535) {
										local437 = -1;
									}
									local100 = local11.method7695(112);
									local460 = local11.method7717(-1978450544);
									local304 = local11.method7695(108);
									local308 = local11.method7717(-1978450544);
									Static676.method9511(local100, local304, false, local437, local308, local460);
									arg0.aClass160_244 = null;
									return true;
								} else if (Static265.aClass160_141 == arg0.aClass160_244) {
									Static570.method8145();
									Static615.method8658();
									arg0.aClass160_244 = null;
									return true;
								} else if (Static10.aClass160_5 == arg0.aClass160_244) {
									local100 = local11.method7731();
									local460 = local11.method7708();
									local304 = local11.method7689();
									Static570.method8145();
									Static457.method6747(local460, local100, local304, 5);
									arg0.aClass160_244 = null;
									return true;
								} else if (arg0.aClass160_244 == Static175.aClass160_82) {
									Static675.method9344(Static338.aClass27_9);
									arg0.aClass160_244 = null;
									return true;
								} else {
									@Pc(3700) String local3700;
									@Pc(3696) String local3696;
									if (arg0.aClass160_244 == Static478.aClass160_205) {
										local100 = local11.method7695(116);
										local3484 = (local100 & 0x1) == 1;
										local3696 = local11.method7703(0);
										local3700 = local11.method7703(0);
										if (local3700.equals("")) {
											local3700 = local3696;
										}
										local937 = local11.method7703(0);
										local340 = local11.method7703(0);
										if (local340.equals("")) {
											local340 = local937;
										}
										if (local3484) {
											for (local526 = 0; local526 < Static458.anInt7639; local526++) {
												if (Static331.aStringArray26[local526].equals(local340)) {
													Static292.aStringArray24[local526] = local3696;
													Static331.aStringArray26[local526] = local3700;
													Static466.aStringArray34[local526] = local937;
													Static95.aStringArray12[local526] = local340;
													break;
												}
											}
										} else {
											Static292.aStringArray24[Static458.anInt7639] = local3696;
											Static331.aStringArray26[Static458.anInt7639] = local3700;
											Static466.aStringArray34[Static458.anInt7639] = local937;
											Static95.aStringArray12[Static458.anInt7639] = local340;
											Static566.aBooleanArray23[Static458.anInt7639] = (local100 & 0x2) == 2;
											Static458.anInt7639++;
										}
										Static46.anInt767 = Static154.anInt2379;
										arg0.aClass160_244 = null;
										return true;
									} else if (arg0.aClass160_244 == Static17.aClass160_6) {
										local100 = local11.method7717(-1978450544);
										local460 = local11.method7689();
										Static570.method8145();
										Static92.method9437(local460, local100);
										arg0.aClass160_244 = null;
										return true;
									} else if (arg0.aClass160_244 == Static563.aClass160_139) {
										local292 = local11.method7703(0);
										local460 = local11.method7714();
										local304 = local11.method7708();
										if (local304 == 65535) {
											local304 = -1;
										}
										local308 = local11.method7749(-16669);
										if (local308 >= 1 && local308 <= 8) {
											if (local292.equalsIgnoreCase("null")) {
												local292 = null;
											}
											Static480.aStringArray35[local308 - 1] = local292;
											Static534.anIntArray473[local308 - 1] = local304;
											Static348.aBooleanArray16[local308 - 1] = local460 == 0;
										}
										arg0.aClass160_244 = null;
										return true;
									} else if (arg0.aClass160_244 == Static142.aClass160_63) {
										local100 = local11.method7754();
										local294 = local11.method7703(0);
										Static570.method8145();
										Static98.method1623(local100, local294);
										arg0.aClass160_244 = null;
										return true;
									} else if (arg0.aClass160_244 == Static566.aClass160_236) {
										Static675.method9344(Static293.aClass27_7);
										arg0.aClass160_244 = null;
										return true;
									} else if (arg0.aClass160_244 == Static70.aClass160_29) {
										local100 = local11.method7712();
										local460 = local11.method7754();
										local304 = local11.method7726();
										local308 = local11.method7708();
										Static570.method8145();
										Static459.method8985(local460, local308, local100, local304);
										arg0.aClass160_244 = null;
										return true;
									} else if (Static249.aClass160_134 == arg0.aClass160_244) {
										local100 = local11.method7731();
										local460 = local11.method7708();
										Static570.method8145();
										Static63.method1037(local460, local100);
										arg0.aClass160_244 = null;
										return true;
									} else if (Static155.aClass160_65 == arg0.aClass160_244) {
										for (local100 = 0; local100 < Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4.length; local100++) {
											if (Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4[local100] != null) {
												Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4[local100].anIntArray198 = null;
												Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4[local100].aClass181_8.method8964(-1, 0);
											}
										}
										for (local460 = 0; local460 < Static549.anInt1216; local460++) {
											Static28.aClass14_Sub44Array2[local460].aClass4_Sub3_Sub3_Sub3_Sub1_2.anIntArray198 = null;
											Static28.aClass14_Sub44Array2[local460].aClass4_Sub3_Sub3_Sub3_Sub1_2.aClass181_8.method8964(-1, 0);
										}
										arg0.aClass160_244 = null;
										return true;
									} else {
										@Pc(4116) long local4116;
										@Pc(4111) long local4111;
										@Pc(4094) boolean local4094;
										if (Static622.aClass160_260 == arg0.aClass160_244) {
											local4094 = local11.method7695(106) == 1;
											local294 = local11.method7703(0);
											local3696 = local294;
											if (local4094) {
												local3696 = local11.method7703(0);
											}
											local4111 = (long) local11.method7717(-1978450544);
											local4116 = (long) local11.method7719();
											local585 = local11.method7695(125);
											local3208 = (local4111 << 32) + local4116;
											local3210 = false;
											local2674 = 0;
											while (true) {
												if (local2674 >= 100) {
													if (local585 <= 1) {
														if (Static321.aBoolean403 && !Static586.aBoolean669 || Static292.aBoolean395) {
															local3210 = true;
														} else if (Static130.method2006(local3696)) {
															local3210 = true;
														}
													}
													break;
												}
												if (local3208 == Static6.aLongArray2[local2674]) {
													local3210 = true;
													break;
												}
												local2674++;
											}
											if (!local3210 && Static26.anInt351 == 0) {
												Static6.aLongArray2[Static461.anInt7683] = local3208;
												Static461.anInt7683 = (Static461.anInt7683 + 1) % 100;
												local3282 = Static159.method2265(Static98.method1622(local11));
												if (local585 == 2) {
													Static218.method3767((String) null, local294, "<img=1>" + local3696, 7, -1, 0, local3282, "<img=1>" + local294);
												} else if (local585 == 1) {
													Static218.method3767((String) null, local294, "<img=0>" + local3696, 7, -1, 0, local3282, "<img=0>" + local294);
												} else {
													Static218.method3767((String) null, local294, local3696, 3, -1, 0, local3282, local294);
												}
											}
											arg0.aClass160_244 = null;
											return true;
										} else if (Static241.aClass160_127 == arg0.aClass160_244) {
											Static343.method5237();
											arg0.aClass160_244 = null;
											return false;
										} else {
											@Pc(4334) boolean local4334;
											if (Static557.aClass160_218 == arg0.aClass160_244) {
												local100 = local11.method7717(-1978450544);
												local460 = local11.method7714();
												local4334 = (local460 & 0x1) == 1;
												Static105.method8323(local100, local4334);
												Static663.anIntArray579[Static446.anInt7495++ & 0x1F] = local100;
												arg0.aClass160_244 = null;
												return true;
											} else if (Static653.aClass160_271 == arg0.aClass160_244) {
												Static328.method5111(arg0.anInt9628, local11);
												arg0.aClass160_244 = null;
												return true;
											} else if (Static316.aClass160_160 == arg0.aClass160_244) {
												Static42.anInt4891 = Static154.anInt2379;
												local4094 = local11.method7695(106) == 1;
												if (arg0.anInt9628 != 1) {
													if (local4094) {
														Static686.aClass23_3 = new Class23(local11);
													} else {
														Static466.aClass23_1 = new Class23(local11);
													}
													arg0.aClass160_244 = null;
													return true;
												}
												if (local4094) {
													Static686.aClass23_3 = null;
												} else {
													Static466.aClass23_1 = null;
												}
												arg0.aClass160_244 = null;
												return true;
											} else if (arg0.aClass160_244 == Static282.aClass160_149) {
												local4094 = local11.method7749(-16669) == 1;
												Static570.method8145();
												arg0.aClass160_244 = null;
												Static19.aBoolean22 = local4094;
												return true;
											} else if (Static190.aClass160_95 == arg0.aClass160_244) {
												local100 = local11.method7689();
												local460 = local11.method7717(-1978450544);
												Static570.method8145();
												Static675.method9343(local460, local100);
												arg0.aClass160_244 = null;
												return true;
											} else if (arg0.aClass160_244 == Static644.aClass160_270) {
												local292 = local11.method7703(0);
												local294 = Static159.method2265(Static98.method1622(local11));
												Static187.method2752(local294, 0, local292, local292, 6, local292);
												arg0.aClass160_244 = null;
												return true;
											} else if (arg0.aClass160_244 == Static83.aClass160_36) {
												Static675.method9344(Static565.aClass27_16);
												arg0.aClass160_244 = null;
												return true;
											} else if (arg0.aClass160_244 == Static553.aClass160_229) {
												local100 = local11.method7708();
												Static570.method8145();
												Static213.method5246(local100);
												arg0.aClass160_244 = null;
												return true;
											} else if (arg0.aClass160_244 == Static508.aClass160_219) {
												local100 = local11.method7731();
												Static570.method8145();
												@Pc(4561) Class14_Sub13 local4561 = (Class14_Sub13) Static27.aClass125_3.method2630((long) local100);
												if (local4561 != null) {
													Static69.method1092(local4561, false, true);
												}
												if (Static432.aClass299_7 != null) {
													Static538.method7933(Static432.aClass299_7);
													Static432.aClass299_7 = null;
												}
												arg0.aClass160_244 = null;
												return true;
											} else if (Static131.aClass160_59 == arg0.aClass160_244) {
												local100 = local11.method7717(-1978450544);
												@Pc(4596) byte local4596 = local11.method7720();
												if (Static576.anObjectArray36 == null) {
													Static576.anObjectArray36 = new Object[Static258.aClass370_1.anInt10393];
												}
												Static576.anObjectArray36[local100] = Integer.valueOf(local4596);
												Static229.anIntArray226[Static538.anInt9199++ & 0x1F] = local100;
												arg0.aClass160_244 = null;
												return true;
											} else if (Static469.aClass160_280 == arg0.aClass160_244) {
												local100 = local11.method7717(-1978450544);
												if (local100 == 65535) {
													local100 = -1;
												}
												local460 = local11.method7695(127);
												local304 = local11.method7717(-1978450544);
												local308 = local11.method7695(103);
												Static676.method9511(local460, local308, true, local100, 256, local304);
												arg0.aClass160_244 = null;
												return true;
											} else if (arg0.aClass160_244 == Static547.aClass160_124) {
												local100 = local11.method7717(-1978450544);
												local294 = local11.method7703(0);
												if (Static576.anObjectArray36 == null) {
													Static576.anObjectArray36 = new Object[Static258.aClass370_1.anInt10393];
												}
												Static576.anObjectArray36[local100] = local294;
												Static229.anIntArray226[Static538.anInt9199++ & 0x1F] = local100;
												arg0.aClass160_244 = null;
												return true;
											} else if (Static146.aClass160_64 == arg0.aClass160_244) {
												Static275.aClass305_4 = Static431.method6454(local11.method7695(120));
												arg0.aClass160_244 = null;
												return true;
											} else if (arg0.aClass160_244 == Static128.aClass160_58) {
												Static242.anInt4629 = local11.method7714();
												Static664.anInt10860 = local11.method7749(-16669);
												arg0.aClass160_244 = null;
												return true;
											} else if (Static532.aClass160_224 == arg0.aClass160_244) {
												Static58.method1022();
												arg0.aClass160_244 = null;
												return true;
											} else if (arg0.aClass160_244 == Static358.aClass160_171) {
												local100 = local11.method7695(106);
												local460 = local11.method7754();
												Static188.aClass238_1.method5870(local100, local460);
												arg0.aClass160_244 = null;
												return true;
											} else if (arg0.aClass160_244 == Static433.aClass160_193) {
												local100 = local11.method7748();
												local460 = local11.method7708();
												Static570.method8145();
												if (local460 == 65535) {
													local460 = -1;
												}
												Static457.method6747(local460, local100, -1, 2);
												arg0.aClass160_244 = null;
												return true;
											} else if (arg0.aClass160_244 == Static520.aClass160_222) {
												local100 = local11.method7731();
												local294 = local11.method7703(0);
												Static570.method8145();
												Static649.method9101(local100, local294);
												arg0.aClass160_244 = null;
												return true;
											} else if (arg0.aClass160_244 == Static48.aClass160_18) {
												local100 = local11.method7717(-1978450544);
												@Pc(4840) long local4840 = local11.method7729();
												if (Static576.anObjectArray36 == null) {
													Static576.anObjectArray36 = new Object[Static258.aClass370_1.anInt10393];
												}
												Static576.anObjectArray36[local100] = Long.valueOf(local4840);
												Static229.anIntArray226[Static538.anInt9199++ & 0x1F] = local100;
												arg0.aClass160_244 = null;
												return true;
											} else if (arg0.aClass160_244 == Static655.aClass160_274) {
												local100 = local11.method7695(100);
												if (local11.method7695(118) == 0) {
													Static481.aClass76Array6[local100] = new Class76();
												} else {
													local11.anInt8936--;
													Static481.aClass76Array6[local100] = new Class76(local11);
												}
												Static244.anInt4645 = Static154.anInt2379;
												arg0.aClass160_244 = null;
												return true;
											} else if (Static519.aClass160_251 == arg0.aClass160_244) {
												arg0.aClass160_244 = null;
												Static576.anObjectArray36 = new Object[Static258.aClass370_1.anInt10393];
												return true;
											} else if (arg0.aClass160_244 == Static184.aClass160_197) {
												if (Static358.anInt6145 != -1) {
													Static323.method5078(Static358.anInt6145, 0);
												}
												arg0.aClass160_244 = null;
												return true;
											} else if (arg0.aClass160_244 == Static159.aClass160_68) {
												local4094 = local11.method7749(-16669) == 1;
												local460 = local11.method7689();
												if (local4094 != Static593.aBoolean673 || Static561.anInt9368 != local460) {
													Static593.aBoolean673 = local4094;
													Static561.anInt9368 = local460;
													Static672.method9299(Static242.aClass162_6, -1, -1);
												}
												arg0.aClass160_244 = null;
												return true;
											} else if (arg0.aClass160_244 == Static573.aClass160_237) {
												local100 = local11.method7748();
												local460 = local11.method7748();
												@Pc(5021) Class14_Sub54 local5021 = Static72.method1195(arg0.aClass197_2, Static629.aClass251_251);
												local5021.aClass14_Sub21_Sub2_2.method7730(local100);
												local5021.aClass14_Sub21_Sub2_2.method7730(local460);
												arg0.method8308(local5021);
												arg0.aClass160_244 = null;
												return true;
											} else if (Static228.aClass160_113 == arg0.aClass160_244) {
												Static553.anInt9258 = local11.method7695(106);
												arg0.aClass160_244 = null;
												return true;
											} else if (arg0.aClass160_244 == Static82.aClass160_35) {
												local100 = local11.method7695(105);
												local460 = local100 >> 5;
												local304 = local100 & 0x1F;
												if (local304 == 0) {
													Static8.aClass136Array1[local460] = null;
													arg0.aClass160_244 = null;
													return true;
												}
												@Pc(5089) Class136 local5089 = new Class136();
												local5089.anInt3427 = local304;
												local5089.anInt3429 = local11.method7695(109);
												if (local5089.anInt3429 >= 0 && Static303.aClass45Array28.length > local5089.anInt3429) {
													if (local5089.anInt3427 == 1 || local5089.anInt3427 == 10) {
														local5089.anInt3419 = local11.method7717(-1978450544);
														local5089.anInt3428 = local11.method7717(-1978450544);
														local11.anInt8936 += 4;
													} else if (local5089.anInt3427 >= 2 && local5089.anInt3427 <= 6) {
														if (local5089.anInt3427 == 2) {
															local5089.anInt3425 = 256;
															local5089.anInt3420 = 256;
														}
														if (local5089.anInt3427 == 3) {
															local5089.anInt3425 = 0;
															local5089.anInt3420 = 256;
														}
														if (local5089.anInt3427 == 4) {
															local5089.anInt3420 = 256;
															local5089.anInt3425 = 512;
														}
														if (local5089.anInt3427 == 5) {
															local5089.anInt3420 = 0;
															local5089.anInt3425 = 256;
														}
														if (local5089.anInt3427 == 6) {
															local5089.anInt3425 = 256;
															local5089.anInt3420 = 512;
														}
														local5089.anInt3427 = 2;
														local5089.anInt3422 = local11.method7695(94);
														local5089.anInt3425 += local11.method7717(-1978450544) - Static36.anInt617 << 9;
														local5089.anInt3420 += local11.method7717(-1978450544) - Static550.anInt9242 << 9;
														local5089.anInt3424 = local11.method7695(106) << 2;
														local5089.anInt3423 = local11.method7717(-1978450544);
													}
													local5089.anInt3426 = local11.method7717(-1978450544);
													if (local5089.anInt3426 == 65535) {
														local5089.anInt3426 = -1;
													}
													Static8.aClass136Array1[local460] = local5089;
												}
												arg0.aClass160_244 = null;
												return true;
											} else if (Static654.aClass160_272 == arg0.aClass160_244) {
												Static675.method9344(Static598.aClass27_17);
												arg0.aClass160_244 = null;
												return true;
											} else if (arg0.aClass160_244 == Static529.aClass160_223) {
												local100 = local11.method7712();
												@Pc(5322) int[] local5322 = new int[4];
												for (local304 = 0; local304 < 4; local304++) {
													local5322[local304] = local11.method7708();
												}
												local308 = local11.method7714();
												@Pc(5351) Class14_Sub44 local5351 = (Class14_Sub44) Static100.aClass125_9.method2630((long) local100);
												if (local5351 != null) {
													Static167.method2423(local5322, local5351.aClass4_Sub3_Sub3_Sub3_Sub1_2, local308, true);
												}
												arg0.aClass160_244 = null;
												return true;
											} else if (Static186.aClass160_91 == arg0.aClass160_244) {
												local100 = local11.method7717(-1978450544);
												local460 = local11.method7714();
												Static570.method8145();
												Static265.method4405(local460, local100, true);
												arg0.aClass160_244 = null;
												return true;
											} else {
												@Pc(5508) boolean local5508;
												@Pc(5441) String local5441;
												if (arg0.aClass160_244 == Static411.aClass160_185) {
													while (arg0.anInt9628 > local11.anInt8936) {
														local4094 = local11.method7695(104) == 1;
														local294 = local11.method7703(0);
														local3696 = local11.method7703(0);
														local308 = local11.method7717(-1978450544);
														local1173 = local11.method7695(115);
														local1290 = local11.method7695(117) == 1;
														local5441 = "";
														local2190 = false;
														if (local308 > 0) {
															local5441 = local11.method7703(0);
															local2190 = local11.method7695(116) == 1;
														}
														for (local1292 = 0; local1292 < Static261.anInt4885; local1292++) {
															if (local4094) {
																if (local3696.equals(Static265.aStringArray23[local1292])) {
																	Static265.aStringArray23[local1292] = local294;
																	local294 = null;
																	Static557.aStringArray37[local1292] = local3696;
																	break;
																}
															} else if (local294.equals(Static265.aStringArray23[local1292])) {
																if (local308 != Static591.anIntArray508[local1292]) {
																	local5508 = true;
																	for (@Pc(5513) Class4_Sub4_Sub2 local5513 = (Class4_Sub4_Sub2) Static417.aClass283_9.method6791(); local5513 != null; local5513 = (Class4_Sub4_Sub2) Static417.aClass283_9.method6792()) {
																		if (local5513.aString100.equals(local294)) {
																			if (local308 != 0 && local5513.aShort85 == 0) {
																				local5513.method9473();
																				local5508 = false;
																			} else if (local308 == 0 && local5513.aShort85 != 0) {
																				local5508 = false;
																				local5513.method9473();
																			}
																		}
																	}
																	if (local5508) {
																		Static417.aClass283_9.method6802(new Class4_Sub4_Sub2(local294, local308));
																	}
																	Static591.anIntArray508[local1292] = local308;
																}
																Static557.aStringArray37[local1292] = local3696;
																Static654.aStringArray46[local1292] = local5441;
																Static286.anIntArray292[local1292] = local1173;
																Static218.aBooleanArray11[local1292] = local2190;
																local294 = null;
																Static153.aBooleanArray3[local1292] = local1290;
																break;
															}
														}
														if (local294 != null && Static261.anInt4885 < 200) {
															Static265.aStringArray23[Static261.anInt4885] = local294;
															Static557.aStringArray37[Static261.anInt4885] = local3696;
															Static591.anIntArray508[Static261.anInt4885] = local308;
															Static654.aStringArray46[Static261.anInt4885] = local5441;
															Static286.anIntArray292[Static261.anInt4885] = local1173;
															Static218.aBooleanArray11[Static261.anInt4885] = local2190;
															Static153.aBooleanArray3[Static261.anInt4885] = local1290;
															Static261.anInt4885++;
														}
													}
													Static187.anInt3100 = 2;
													Static46.anInt767 = Static154.anInt2379;
													local460 = Static261.anInt4885;
													while (local460 > 0) {
														local460--;
														local4094 = true;
														for (local304 = 0; local304 < local460; local304++) {
															local473 = false;
															if (Static591.anIntArray508[local304] != Static564.aClass357_4.anInt9936 && Static564.aClass357_4.anInt9936 == Static591.anIntArray508[local304 + 1]) {
																local473 = true;
															}
															if (!local473 && Static591.anIntArray508[local304] == 0 && Static591.anIntArray508[local304 + 1] != 0) {
																local473 = true;
															}
															if (!local473 && !Static153.aBooleanArray3[local304] && Static153.aBooleanArray3[local304 + 1]) {
																local473 = true;
															}
															if (local473) {
																local1173 = Static591.anIntArray508[local304];
																Static591.anIntArray508[local304] = Static591.anIntArray508[local304 + 1];
																Static591.anIntArray508[local304 + 1] = local1173;
																local340 = Static654.aStringArray46[local304];
																Static654.aStringArray46[local304] = Static654.aStringArray46[local304 + 1];
																Static654.aStringArray46[local304 + 1] = local340;
																local5441 = Static265.aStringArray23[local304];
																Static265.aStringArray23[local304] = Static265.aStringArray23[local304 + 1];
																Static265.aStringArray23[local304 + 1] = local5441;
																@Pc(5801) String local5801 = Static557.aStringArray37[local304];
																Static557.aStringArray37[local304] = Static557.aStringArray37[local304 + 1];
																Static557.aStringArray37[local304 + 1] = local5801;
																local1292 = Static286.anIntArray292[local304];
																Static286.anIntArray292[local304] = Static286.anIntArray292[local304 + 1];
																Static286.anIntArray292[local304 + 1] = local1292;
																local5508 = Static218.aBooleanArray11[local304];
																Static218.aBooleanArray11[local304] = Static218.aBooleanArray11[local304 + 1];
																Static218.aBooleanArray11[local304 + 1] = local5508;
																local3210 = Static153.aBooleanArray3[local304];
																Static153.aBooleanArray3[local304] = Static153.aBooleanArray3[local304 + 1];
																local4094 = false;
																Static153.aBooleanArray3[local304 + 1] = local3210;
															}
														}
														if (local4094) {
															break;
														}
													}
													arg0.aClass160_244 = null;
													return true;
												} else if (arg0.aClass160_244 == Static326.aClass160_161) {
													Static675.method9344(Static108.aClass27_3);
													arg0.aClass160_244 = null;
													return true;
												} else if (arg0.aClass160_244 == Static524.aClass160_246) {
													Static202.anInt3500 = local11.method7720() << 3;
													Static193.anInt9745 = local11.method7734() << 3;
													Static513.anInt8429 = local11.method7695(99);
													arg0.aClass160_244 = null;
													return true;
												} else if (Static260.aClass160_137 == arg0.aClass160_244) {
													local100 = local11.method7689();
													local460 = local11.method7708();
													if (local460 == 65535) {
														local460 = -1;
													}
													Static570.method8145();
													Static569.method8142(local100, local460);
													arg0.aClass160_244 = null;
													return true;
												} else if (arg0.aClass160_244 == Static496.aClass160_208) {
													Static258.anInt4845 = local11.method7752();
													arg0.aClass160_244 = null;
													Static504.anInt8772 = Static154.anInt2379;
													return true;
												} else if (arg0.aClass160_244 == Static334.aClass160_163) {
													local100 = local11.method7717(-1978450544);
													local460 = local11.method7717(-1978450544);
													Static570.method8145();
													Static517.method7663(local100, local460);
													arg0.aClass160_244 = null;
													return true;
												} else if (arg0.aClass160_244 == Static290.aClass160_152) {
													local100 = local11.method7754();
													local460 = local11.method7708();
													local304 = local11.method7748();
													local308 = local11.method7712();
													Static570.method8145();
													Static457.method6747(local308 | local100 << 16, local304, local460, 7);
													arg0.aClass160_244 = null;
													return true;
												} else if (arg0.aClass160_244 == Static225.aClass160_111) {
													local292 = local11.method7703(0);
													@Pc(6062) Object[] local6062 = new Object[local292.length() + 1];
													for (local304 = local292.length() - 1; local304 >= 0; local304--) {
														if (local292.charAt(local304) == 's') {
															local6062[local304 + 1] = local11.method7703(0);
														} else {
															local6062[local304 + 1] = Integer.valueOf(local11.method7748());
														}
													}
													local6062[0] = Integer.valueOf(local11.method7748());
													Static570.method8145();
													@Pc(6122) Class14_Sub10 local6122 = new Class14_Sub10();
													local6122.anObjectArray1 = local6062;
													Static672.method9304(local6122);
													arg0.aClass160_244 = null;
													return true;
												} else if (Static423.aClass160_189 == arg0.aClass160_244) {
													Static686.method9455();
													arg0.aClass160_244 = null;
													return true;
												} else if (Static440.aClass160_76 == arg0.aClass160_244) {
													arg0.aClass160_244 = null;
													return false;
												} else if (Static477.aClass160_204 == arg0.aClass160_244) {
													Static177.aByte62 = local11.method7736();
													if (Static177.aByte62 == 0 || Static177.aByte62 == 1) {
														Static217.aBoolean326 = true;
													}
													arg0.aClass160_244 = null;
													return true;
												} else if (Static239.aClass160_126 == arg0.aClass160_244) {
													local292 = local11.method7703(0);
													local4334 = local11.method7695(119) == 1;
													if (local4334) {
														local294 = local11.method7703(0);
													} else {
														local294 = local292;
													}
													local308 = local11.method7717(-1978450544);
													@Pc(6223) byte local6223 = local11.method7720();
													local1290 = false;
													if (local6223 == -128) {
														local1290 = true;
													}
													if (local1290) {
														if (Static67.anInt1036 == 0) {
															arg0.aClass160_244 = null;
															return true;
														}
														for (local526 = 0; Static67.anInt1036 > local526 && (!Static293.aClass165Array1[local526].aString53.equals(local294) || local308 != Static293.aClass165Array1[local526].anInt4578); local526++) {
														}
														if (local526 < Static67.anInt1036) {
															while (local526 < Static67.anInt1036 - 1) {
																Static293.aClass165Array1[local526] = Static293.aClass165Array1[local526 + 1];
																local526++;
															}
															Static67.anInt1036--;
															Static293.aClass165Array1[Static67.anInt1036] = null;
														}
													} else {
														local5441 = local11.method7703(0);
														@Pc(6335) Class165 local6335 = new Class165();
														local6335.aString53 = local294;
														local6335.aString54 = local292;
														local6335.aString51 = Static531.method7864(local6335.aString53);
														local6335.aByte86 = local6223;
														local6335.aString52 = local5441;
														local6335.anInt4578 = local308;
														for (local1292 = Static67.anInt1036 - 1; local1292 >= 0; local1292--) {
															local2612 = Static293.aClass165Array1[local1292].aString51.compareTo(local6335.aString51);
															if (local2612 == 0) {
																Static293.aClass165Array1[local1292].anInt4578 = local308;
																Static293.aClass165Array1[local1292].aByte86 = local6223;
																Static293.aClass165Array1[local1292].aString52 = local5441;
																if (local294.equals(Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aString37)) {
																	Static36.aByte14 = local6223;
																}
																arg0.aClass160_244 = null;
																Static101.anInt1748 = Static154.anInt2379;
																return true;
															}
															if (local2612 < 0) {
																break;
															}
														}
														if (Static67.anInt1036 >= Static293.aClass165Array1.length) {
															arg0.aClass160_244 = null;
															return true;
														}
														for (local2612 = Static67.anInt1036 - 1; local2612 > local1292; local2612--) {
															Static293.aClass165Array1[local2612 + 1] = Static293.aClass165Array1[local2612];
														}
														if (Static67.anInt1036 == 0) {
															Static293.aClass165Array1 = new Class165[100];
														}
														Static293.aClass165Array1[local1292 + 1] = local6335;
														Static67.anInt1036++;
														if (local294.equals(Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aString37)) {
															Static36.aByte14 = local6223;
														}
													}
													arg0.aClass160_244 = null;
													Static101.anInt1748 = Static154.anInt2379;
													return true;
												} else if (Static7.aClass160_1 == arg0.aClass160_244) {
													local4094 = local11.method7695(97) == 1;
													@Pc(6523) byte[] local6523 = new byte[arg0.anInt9628 - 1];
													local11.method7750(arg0.anInt9628 - 1, 0, local6523);
													Static207.method3095(local6523, local4094);
													arg0.aClass160_244 = null;
													return true;
												} else if (Static427.aClass160_191 == arg0.aClass160_244) {
													Static547.method3970(local11.method7703(0));
													arg0.aClass160_244 = null;
													return true;
												} else if (arg0.aClass160_244 == Static427.aClass160_192) {
													local100 = local11.method7717(-1978450544);
													local460 = local11.method7695(121);
													local4334 = (local460 & 0x1) == 1;
													Static421.method6290(local100, local4334);
													local308 = local11.method7717(-1978450544);
													for (local1173 = 0; local1173 < local308; local1173++) {
														local1797 = local11.method7708();
														local526 = local11.method7714();
														if (local526 == 255) {
															local526 = local11.method7689();
														}
														Static391.method5937(local526, local100, local1797 - 1, local4334, local1173);
													}
													Static663.anIntArray579[Static446.anInt7495++ & 0x1F] = local100;
													arg0.aClass160_244 = null;
													return true;
												} else if (Static681.aClass160_281 == arg0.aClass160_244) {
													local100 = local11.method7748();
													if (local100 != Static73.anInt1202) {
														Static73.anInt1202 = local100;
														Static672.method9299(Static63.aClass162_1, -1, -1);
													}
													arg0.aClass160_244 = null;
													return true;
												} else if (arg0.aClass160_244 == Static56.aClass160_25) {
													local100 = local11.method7754();
													local460 = local11.method7738(1275460792);
													local304 = local11.method7712();
													local308 = local11.method7748();
													Static570.method8145();
													Static279.method7929(local100, local304, local308, local460);
													arg0.aClass160_244 = null;
													return true;
												} else if (Static558.aClass160_232 == arg0.aClass160_244) {
													local100 = local11.method7748();
													local460 = local11.method7712();
													Static188.aClass238_1.method5870(local100, local460);
													arg0.aClass160_244 = null;
													return true;
												} else if (Static183.aClass160_88 == arg0.aClass160_244) {
													local100 = local11.method7749(-16669);
													local460 = local11.method7748();
													local304 = local11.method7717(-1978450544);
													local308 = local11.method7754();
													Static570.method8145();
													Static678.method9368(local460, local100, local308, local304);
													arg0.aClass160_244 = null;
													return true;
												} else if (arg0.aClass160_244 == Static174.aClass160_81) {
													local4094 = local11.method7695(121) == 1;
													local294 = local11.method7703(0);
													local1393 = (long) local11.method7717(-1978450544);
													local791 = (long) local11.method7719();
													local526 = local11.method7695(112);
													local585 = local11.method7717(-1978450544);
													local3208 = (local1393 << 32) + local791;
													local3210 = false;
													@Pc(6818) Class14_Sub48 local6818 = local4094 ? Static71.aClass14_Sub48_1 : Static412.aClass14_Sub48_2;
													if (local6818 == null) {
														local3210 = true;
													} else {
														label2274: {
															for (local1418 = 0; local1418 < 100; local1418++) {
																if (local3208 == Static6.aLongArray2[local1418]) {
																	local3210 = true;
																	break label2274;
																}
															}
															if (local526 <= 1 && Static130.method2006(local294)) {
																local3210 = true;
															}
														}
													}
													if (!local3210 && Static26.anInt351 == 0) {
														Static6.aLongArray2[Static461.anInt7683] = local3208;
														Static461.anInt7683 = (Static461.anInt7683 + 1) % 100;
														local1504 = Static592.aClass46_2.method897(local585).method1679(local11);
														local2439 = local4094 ? 42 : 45;
														if (local526 == 2 || local526 == 3) {
															Static218.method3767(local6818.aString118, local294, "<img=1>" + local294, local2439, local585, 0, local1504, "<img=1>" + local294);
														} else if (local526 == 1) {
															Static218.method3767(local6818.aString118, local294, "<img=0>" + local294, local2439, local585, 0, local1504, "<img=0>" + local294);
														} else {
															Static218.method3767(local6818.aString118, local294, local294, local2439, local585, 0, local1504, local294);
														}
													}
													arg0.aClass160_244 = null;
													return true;
												} else if (Static64.aClass160_28 == arg0.aClass160_244) {
													Static524.aBoolean667 = local11.method7749(-16669) == 1;
													arg0.aClass160_244 = null;
													return true;
												} else if (Static335.aClass160_164 == arg0.aClass160_244) {
													Static188.aClass238_1.method5866();
													Static301.anInt5894 += 32;
													arg0.aClass160_244 = null;
													return true;
												} else if (arg0.aClass160_244 == Static34.aClass160_12) {
													local100 = local11.method7717(-1978450544);
													local294 = local11.method7703(0);
													local4334 = local11.method7695(109) == 1;
													Static167.aBoolean180 = local4334;
													Static164.aClass357_1 = Static564.aClass357_4;
													Static332.method5147(local100, local294);
													Static160.method2323(15);
													arg0.aClass160_244 = null;
													return false;
												} else {
													@Pc(7125) long local7125;
													if (arg0.aClass160_244 == Static10.aClass160_4) {
														local4094 = local11.method7695(127) == 1;
														local294 = local11.method7703(0);
														local3696 = local294;
														if (local4094) {
															local3696 = local11.method7703(0);
														}
														local4111 = local11.method7729();
														local4116 = (long) local11.method7717(-1978450544);
														local7125 = (long) local11.method7719();
														local2612 = local11.method7695(95);
														local2619 = local11.method7717(-1978450544);
														@Pc(7140) long local7140 = (local4116 << 32) + local7125;
														@Pc(7142) boolean local7142 = false;
														local2393 = 0;
														while (true) {
															if (local2393 >= 100) {
																if (local2612 <= 1 && Static130.method2006(local3696)) {
																	local7142 = true;
																}
																break;
															}
															if (local7140 == Static6.aLongArray2[local2393]) {
																local7142 = true;
																break;
															}
															local2393++;
														}
														if (!local7142 && Static26.anInt351 == 0) {
															Static6.aLongArray2[Static461.anInt7683] = local7140;
															Static461.anInt7683 = (Static461.anInt7683 + 1) % 100;
															@Pc(7215) String local7215 = Static592.aClass46_2.method897(local2619).method1679(local11);
															if (local2612 == 2) {
																Static218.method3767(Static509.method7631(local4111), local294, "<img=1>" + local3696, 20, local2619, 0, local7215, "<img=1>" + local294);
															} else if (local2612 == 1) {
																Static218.method3767(Static509.method7631(local4111), local294, "<img=0>" + local3696, 20, local2619, 0, local7215, "<img=0>" + local294);
															} else {
																Static218.method3767(Static509.method7631(local4111), local294, local3696, 20, local2619, 0, local7215, local294);
															}
														}
														arg0.aClass160_244 = null;
														return true;
													} else if (Static235.aClass160_125 == arg0.aClass160_244) {
														if (Static232.method3903(Static387.anInt9114)) {
															Static132.anInt2081 = (int) ((float) local11.method7717(-1978450544) * 2.5F);
														} else {
															Static132.anInt2081 = local11.method7717(-1978450544) * 30;
														}
														arg0.aClass160_244 = null;
														Static504.anInt8772 = Static154.anInt2379;
														return true;
													} else {
														@Pc(7368) byte[] local7368;
														if (Static399.aClass160_181 == arg0.aClass160_244) {
															if (Static12.aFrame1 != null) {
																Static89.method8701(false, -1, Static181.aClass14_Sub26_9.aClass43_Sub15_1.method4526(), -1);
															}
															local7368 = new byte[arg0.anInt9628];
															local11.method7758(local7368, arg0.anInt9628);
															local294 = Static490.method7391(arg0.anInt9628, 0, local7368);
															Static381.method5860(Static181.aClass14_Sub26_9.aClass43_Sub1_1.method801() == 1, true, Static344.aClass173_5, local294);
															arg0.aClass160_244 = null;
															return true;
														} else if (arg0.aClass160_244 == Static8.aClass160_2) {
															local1839 = local11.method7734();
															local460 = local11.method7708();
															Static188.aClass238_1.method5869(local1839, local460);
															arg0.aClass160_244 = null;
															return true;
														} else if (Static624.aClass160_262 == arg0.aClass160_244) {
															local11.anInt8936 += 28;
															if (local11.method7707()) {
																Static665.method9233(local11.anInt8936 - 28, local11);
															}
															arg0.aClass160_244 = null;
															return true;
														} else if (arg0.aClass160_244 == Static514.aClass160_221) {
															local100 = local11.method7717(-1978450544);
															local460 = local11.method7717(-1978450544);
															local304 = local11.method7717(-1978450544);
															Static570.method8145();
															if (Static339.aClass299ArrayArray1[local100] != null) {
																for (local308 = local460; local308 < local304; local308++) {
																	local1173 = local11.method7719();
																	if (Static339.aClass299ArrayArray1[local100].length > local308 && Static339.aClass299ArrayArray1[local100][local308] != null) {
																		Static339.aClass299ArrayArray1[local100][local308].anInt8576 = local1173;
																	}
																}
															}
															arg0.aClass160_244 = null;
															return true;
														} else if (Static375.aClass160_266 == arg0.aClass160_244) {
															Static675.method9344(Static373.aClass27_10);
															arg0.aClass160_244 = null;
															return true;
														} else if (Static219.aClass160_107 == arg0.aClass160_244) {
															local100 = local11.method7731();
															Static570.method8145();
															Static457.method6747(-1, local100, -1, 3);
															arg0.aClass160_244 = null;
															return true;
														} else if (Static104.aClass160_49 == arg0.aClass160_244) {
															local4094 = local11.method7695(109) == 1;
															local294 = local11.method7703(0);
															local1393 = (long) local11.method7717(-1978450544);
															local791 = (long) local11.method7719();
															local526 = local11.method7695(119);
															local7125 = (local1393 << 32) + local791;
															local5508 = false;
															@Pc(7610) Class14_Sub48 local7610 = local4094 ? Static71.aClass14_Sub48_1 : Static412.aClass14_Sub48_2;
															if (local7610 == null) {
																local5508 = true;
															} else {
																label2282: {
																	for (local2674 = 0; local2674 < 100; local2674++) {
																		if (Static6.aLongArray2[local2674] == local7125) {
																			local5508 = true;
																			break label2282;
																		}
																	}
																	if (local526 <= 1) {
																		if (Static321.aBoolean403 && !Static586.aBoolean669 || Static292.aBoolean395) {
																			local5508 = true;
																		} else if (Static130.method2006(local294)) {
																			local5508 = true;
																		}
																	}
																}
															}
															if (!local5508 && Static26.anInt351 == 0) {
																Static6.aLongArray2[Static461.anInt7683] = local7125;
																Static461.anInt7683 = (Static461.anInt7683 + 1) % 100;
																local3282 = Static159.method2265(Static98.method1622(local11));
																local1418 = local4094 ? 41 : 44;
																if (local526 == 2 || local526 == 3) {
																	Static218.method3767(local7610.aString118, local294, "<img=1>" + local294, local1418, -1, 0, local3282, "<img=1>" + local294);
																} else if (local526 == 1) {
																	Static218.method3767(local7610.aString118, local294, "<img=0>" + local294, local1418, -1, 0, local3282, "<img=0>" + local294);
																} else {
																	Static218.method3767(local7610.aString118, local294, local294, local1418, -1, 0, local3282, local294);
																}
															}
															arg0.aClass160_244 = null;
															return true;
														} else if (arg0.aClass160_244 == Static558.aClass160_233) {
															local100 = local11.method7717(-1978450544);
															Static570.method8145();
															Static687.method9464(local100);
															arg0.aClass160_244 = null;
															return true;
														} else if (arg0.aClass160_244 == Static211.aClass160_104) {
															Static675.method9344(Static388.aClass27_11);
															arg0.aClass160_244 = null;
															return true;
														} else if (arg0.aClass160_244 == Static559.aClass160_234) {
															if (Static12.aFrame1 != null) {
																Static89.method8701(false, -1, Static181.aClass14_Sub26_9.aClass43_Sub15_1.method4526(), -1);
															}
															local7368 = new byte[arg0.anInt9628];
															local11.method7758(local7368, arg0.anInt9628);
															local294 = Static490.method7391(arg0.anInt9628, 0, local7368);
															local3696 = "opensn";
															if (!Static571.aBoolean654 || Static637.method8919(Static344.aClass173_5, 1, local294, local3696).anInt6256 == 2) {
																Static418.method6275(true, local3696, Static344.aClass173_5, local294, Static181.aClass14_Sub26_9.aClass43_Sub1_1.method801() == 1);
															}
															arg0.aClass160_244 = null;
															return true;
														} else if (arg0.aClass160_244 == Static63.aClass160_27) {
															local100 = local11.method7726();
															local460 = local11.method7731();
															local304 = local11.method7708();
															Static570.method8145();
															if (local304 == 65535) {
																local304 = -1;
															}
															Static105.method8321(local460, local304, local100);
															@Pc(7940) Class284 local7940 = Static252.aClass56_1.method1052(local304);
															Static459.method8985(local7940.anInt7781, local7940.anInt7724, local7940.anInt7734, local460);
															Static359.method5454(local7940.anInt7745, local460, local7940.anInt7764, local7940.anInt7732);
															arg0.aClass160_244 = null;
															return true;
														} else if (arg0.aClass160_244 == Static193.aClass160_249) {
															local100 = local11.method7748();
															local460 = local11.method7717(-1978450544);
															Static570.method8145();
															if (local460 == 65535) {
																local460 = -1;
															}
															Static457.method6747(local460, local100, -1, 1);
															arg0.aClass160_244 = null;
															return true;
														} else if (arg0.aClass160_244 == Static40.aClass160_15) {
															local100 = local11.method7727();
															local460 = local11.method7748();
															Static570.method8145();
															Static426.method6397(local100, local460);
															arg0.aClass160_244 = null;
															return true;
														} else if (Static544.aClass160_239 == arg0.aClass160_244) {
															Static458.anInt7639 = local11.method7695(116);
															for (local100 = 0; local100 < Static458.anInt7639; local100++) {
																Static292.aStringArray24[local100] = local11.method7703(0);
																Static331.aStringArray26[local100] = local11.method7703(0);
																if (Static331.aStringArray26[local100].equals("")) {
																	Static331.aStringArray26[local100] = Static292.aStringArray24[local100];
																}
																Static466.aStringArray34[local100] = local11.method7703(0);
																Static95.aStringArray12[local100] = local11.method7703(0);
																if (Static95.aStringArray12[local100].equals("")) {
																	Static95.aStringArray12[local100] = Static466.aStringArray34[local100];
																}
																Static566.aBooleanArray23[local100] = false;
															}
															arg0.aClass160_244 = null;
															Static46.anInt767 = Static154.anInt2379;
															return true;
														} else if (Static609.aClass160_256 == arg0.aClass160_244) {
															Static42.anInt4891 = Static154.anInt2379;
															local4094 = local11.method7695(127) == 1;
															@Pc(8132) Class198 local8132 = new Class198(local11);
															@Pc(8136) Class23 local8136;
															if (local4094) {
																local8136 = Static686.aClass23_3;
															} else {
																local8136 = Static466.aClass23_1;
															}
															local8132.method4911(local8136);
															arg0.aClass160_244 = null;
															return true;
														} else if (Static682.aClass160_282 == arg0.aClass160_244) {
															local100 = local11.method7754();
															if (local100 == 65535) {
																local100 = -1;
															}
															local460 = local11.method7708();
															local304 = local11.method7748();
															local308 = local11.method7754();
															Static570.method8145();
															if (local308 == 65535) {
																local308 = -1;
															}
															for (local1173 = local308; local1173 <= local100; local1173++) {
																local4116 = ((long) local304 << 32) + (long) local1173;
																@Pc(8204) Class14_Sub6 local8204 = (Class14_Sub6) Static574.aClass125_40.method2630(local4116);
																if (local8204 != null) {
																	local797 = new Class14_Sub6(local8204.anInt453, local460);
																	local8204.method9513();
																} else if (local1173 == -1) {
																	local797 = new Class14_Sub6(Static391.method5936(local304).aClass14_Sub6_4.anInt453, local460);
																} else {
																	local797 = new Class14_Sub6(0, local460);
																}
																Static574.aClass125_40.method2626(local797, local4116);
															}
															arg0.aClass160_244 = null;
															return true;
														} else if (Static168.aClass160_77 == arg0.aClass160_244) {
															Static334.method5151(false);
															arg0.aClass160_244 = null;
															return false;
														} else if (arg0.aClass160_244 == Static563.aClass160_140) {
															local100 = local11.method7717(-1978450544);
															local460 = local11.method7726();
															local304 = local11.method7717(-1978450544);
															Static570.method8145();
															Static347.method5283(local100 + (local304 << 16), local460);
															arg0.aClass160_244 = null;
															return true;
														} else {
															@Pc(8334) Class14_Sub13 local8334;
															if (Static299.aClass160_156 == arg0.aClass160_244) {
																local100 = local11.method7731();
																local460 = local11.method7689();
																Static570.method8145();
																@Pc(8327) Class14_Sub13 local8327 = (Class14_Sub13) Static27.aClass125_3.method2630((long) local460);
																local8334 = (Class14_Sub13) Static27.aClass125_3.method2630((long) local100);
																if (local8334 != null) {
																	Static69.method1092(local8334, false, local8327 == null || local8334.anInt1465 != local8327.anInt1465);
																}
																if (local8327 != null) {
																	local8327.method9513();
																	Static27.aClass125_3.method2626(local8327, (long) local100);
																}
																@Pc(8372) Class299 local8372 = Static391.method5936(local460);
																if (local8372 != null) {
																	Static538.method7933(local8372);
																}
																local8372 = Static391.method5936(local100);
																if (local8372 != null) {
																	Static538.method7933(local8372);
																	Static683.method9420(local8372, true);
																}
																if (Static358.anInt6145 != -1) {
																	Static323.method5078(Static358.anInt6145, 1);
																}
																arg0.aClass160_244 = null;
																return true;
															} else if (Static127.aClass160_284 == arg0.aClass160_244) {
																arg0.aClass160_244 = null;
																Static576.anObjectArray36 = null;
																return true;
															} else if (Static280.aClass160_146 == arg0.aClass160_244) {
																Static675.method9344(Static466.aClass27_13);
																arg0.aClass160_244 = null;
																return true;
															} else if (Static190.aClass160_94 == arg0.aClass160_244) {
																local100 = local11.method7731();
																local460 = local11.method7749(-16669);
																local304 = local11.method7712();
																Static570.method8145();
																local8334 = (Class14_Sub13) Static27.aClass125_3.method2630((long) local100);
																if (local8334 != null) {
																	Static69.method1092(local8334, false, local8334.anInt1465 != local304);
																}
																Static385.method5886(local304, local460, false, local100);
																arg0.aClass160_244 = null;
																return true;
															} else if (arg0.aClass160_244 == Static72.aClass160_31) {
																local100 = local11.method7748();
																Static470.aClass230_8 = Static344.aClass173_5.method4232(local100);
																arg0.aClass160_244 = null;
																return true;
															} else if (Static188.aClass160_93 == arg0.aClass160_244) {
																local100 = local11.method7728(-129);
																local460 = local11.method7748();
																local304 = local11.method7695(109);
																local3700 = "";
																local937 = local3700;
																if ((local304 & 0x1) != 0) {
																	local3700 = local11.method7703(0);
																	if ((local304 & 0x2) == 0) {
																		local937 = local3700;
																	} else {
																		local937 = local11.method7703(0);
																	}
																}
																local340 = local11.method7703(0);
																if (local100 == 99) {
																	Static590.method8398(local340);
																} else if (local100 == 98) {
																	Static601.method8504(local340);
																} else if (local937.equals("") || !Static130.method2006(local937)) {
																	Static187.method2752(local340, local460, local3700, local937, local100, local3700);
																} else {
																	arg0.aClass160_244 = null;
																	return true;
																}
																arg0.aClass160_244 = null;
																return true;
															} else if (arg0.aClass160_244 == Static675.aClass160_279) {
																local100 = local11.method7695(106);
																local460 = local11.method7712() << 2;
																local304 = local11.method7695(126);
																local308 = local11.method7749(-16669);
																local1173 = local11.method7714();
																Static570.method8145();
																Static93.method1579(true, local100, local460, local308, local304, local1173);
																arg0.aClass160_244 = null;
																return true;
															} else if (Static290.aClass160_153 == arg0.aClass160_244) {
																Static675.method9344(Static474.aClass27_14);
																arg0.aClass160_244 = null;
																return true;
															} else if (Static390.aClass160_179 == arg0.aClass160_244) {
																local100 = local11.method7731();
																local460 = local11.method7738(1275460792);
																Static570.method8145();
																Static245.method4086(local100, local460);
																arg0.aClass160_244 = null;
																return true;
															} else if (Static654.aClass160_273 == arg0.aClass160_244) {
																local100 = local11.method7714();
																local460 = local11.method7717(-1978450544);
																local304 = local11.method7695(117);
																local308 = local11.method7749(-16669);
																local1173 = local11.method7749(-16669);
																Static570.method8145();
																Static552.aBooleanArray22[local1173] = true;
																Static187.anIntArray186[local1173] = local308;
																Static308.anIntArray304[local1173] = local100;
																Static331.anIntArray319[local1173] = local304;
																Static246.anIntArray236[local1173] = local460;
																arg0.aClass160_244 = null;
																return true;
															} else if (arg0.aClass160_244 == Static243.aClass160_128) {
																local100 = local11.method7689();
																Static570.method8145();
																if (local100 == -1) {
																	Static507.anInt8817 = -1;
																	Static124.anInt2024 = -1;
																} else {
																	local460 = local100 >> 14 & 0x3FFF;
																	local460 -= Static36.anInt617;
																	local304 = local100 & 0x3FFF;
																	if (local460 < 0) {
																		local460 = 0;
																	} else if (local460 >= Static380.anInt6689) {
																		local460 = Static380.anInt6689;
																	}
																	local304 -= Static550.anInt9242;
																	Static507.anInt8817 = (local460 << 9) + 256;
																	if (local304 < 0) {
																		local304 = 0;
																	} else if (local304 >= Static542.anInt9214) {
																		local304 = Static542.anInt9214;
																	}
																	Static124.anInt2024 = (local304 << 9) + 256;
																}
																arg0.aClass160_244 = null;
																return true;
															} else if (Static481.aClass160_275 == arg0.aClass160_244) {
																Static675.method9344(Static323.aClass27_8);
																arg0.aClass160_244 = null;
																return true;
															} else if (Static408.aClass160_182 == arg0.aClass160_244) {
																Static163.aString33 = arg0.anInt9628 > 2 ? local11.method7703(0) : Static21.aClass21_25.method324(Static26.anInt352);
																Static41.anInt656 = arg0.anInt9628 > 0 ? local11.method7717(-1978450544) : -1;
																if (Static41.anInt656 == 65535) {
																	Static41.anInt656 = -1;
																}
																arg0.aClass160_244 = null;
																return true;
															} else if (arg0.aClass160_244 == Static593.aClass160_250) {
																local100 = local11.method7714();
																local460 = local11.method7714();
																if (local100 == 255) {
																	local100 = -1;
																	local460 = -1;
																}
																Static71.method1141(local460, local100);
																arg0.aClass160_244 = null;
																return true;
															} else if (arg0.aClass160_244 == Static8.aClass160_3) {
																Static575.anInt9548 = local11.method7695(110);
																arg0.aClass160_244 = null;
																Static504.anInt8772 = Static154.anInt2379;
																return true;
															} else if (arg0.aClass160_244 == Static487.aClass160_209) {
																local100 = local11.method7712();
																if (local100 == 65535) {
																	local100 = -1;
																}
																local460 = local11.method7695(111);
																local304 = local11.method7749(-16669);
																Static358.method5441(local100, local460, local304);
																arg0.aClass160_244 = null;
																return true;
															} else if (Static378.aClass160_176 == arg0.aClass160_244) {
																local100 = local11.method7754();
																if (local100 == 65535) {
																	local100 = -1;
																}
																local460 = local11.method7746();
																local304 = local11.method7695(100);
																Static360.method5460(local460, local304, local100);
																arg0.aClass160_244 = null;
																return true;
															} else if (Static252.aClass160_135 == arg0.aClass160_244) {
																Static187.anInt3100 = 1;
																Static46.anInt767 = Static154.anInt2379;
																arg0.aClass160_244 = null;
																return true;
															} else {
																Static629.method8829("T1 - " + (arg0.aClass160_244 == null ? -1 : arg0.aClass160_244.method3886()) + "," + (arg0.aClass160_242 == null ? -1 : arg0.aClass160_242.method3886()) + "," + (arg0.aClass160_243 == null ? -1 : arg0.aClass160_243.method3886()) + " - " + arg0.anInt9628, (Throwable) null);
																Static334.method5151(false);
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

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(Lclient!da;)V")
	public static void method1233(@OriginalArg(0) Class68 arg0) {
		Static613.aClass68_11 = arg0;
	}
}
