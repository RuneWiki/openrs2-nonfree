import java.io.IOException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!pt", name = "c", descriptor = "I")
	public static int anInt6986;

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Z)V")
	public static synchronized void method5979() {
		if (Static534.anObject55 != null) {
			return;
		}
		try {
			@Pc(9) Class local9 = Class.forName("java.lang.management.ManagementFactory");
			@Pc(14) Method local14 = local9.getDeclaredMethod("getPlatformMBeanServer", null);
			@Pc(19) Object local19 = local14.invoke(null, (Object[]) null);
			@Pc(52) Method local52 = local9.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), String.class, Class.class);
			Static534.anObject55 = local52.invoke(null, local19, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
		} catch (@Pc(78) Exception local78) {
			System.out.println("HeapDump setup error:");
			local78.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)Z")
	public static boolean method5980() throws IOException {
		if (Static78.aClass152_2 == null) {
			return false;
		}
		@Pc(73) int local73;
		if (Static230.aClass272_135 == null) {
			if (Static203.aBoolean319) {
				if (!Static78.aClass152_2.method3910(1)) {
					return false;
				}
				Static78.aClass152_2.method3909(Static187.aClass3_Sub11_Sub1_1.aByteArray36, 1, 0);
				Static20.anInt529 = 0;
				Static203.aBoolean319 = false;
				Static432.anInt7151++;
			}
			Static187.aClass3_Sub11_Sub1_1.anInt3520 = 0;
			if (Static187.aClass3_Sub11_Sub1_1.method995()) {
				if (!Static78.aClass152_2.method3910(1)) {
					return false;
				}
				Static78.aClass152_2.method3909(Static187.aClass3_Sub11_Sub1_1.aByteArray36, 1, 1);
				Static20.anInt529 = 0;
				Static432.anInt7151++;
			}
			Static203.aBoolean319 = true;
			@Pc(69) Class272[] local69 = Static95.method523();
			local73 = Static187.aClass3_Sub11_Sub1_1.method1000();
			if (local73 < 0 || local69.length <= local73) {
				throw new IOException("invo:" + local73 + " ip:" + Static187.aClass3_Sub11_Sub1_1.anInt3520);
			}
			Static230.aClass272_135 = local69[local73];
			Static178.anInt8249 = Static230.aClass272_135.anInt7130;
		}
		if (Static178.anInt8249 == -1) {
			if (!Static78.aClass152_2.method3910(1)) {
				return false;
			}
			Static78.aClass152_2.method3909(Static187.aClass3_Sub11_Sub1_1.aByteArray36, 1, 0);
			Static20.anInt529 = 0;
			Static432.anInt7151++;
			Static178.anInt8249 = Static187.aClass3_Sub11_Sub1_1.aByteArray36[0] & 0xFF;
		}
		if (Static178.anInt8249 == -2) {
			if (!Static78.aClass152_2.method3910(2)) {
				return false;
			}
			Static78.aClass152_2.method3909(Static187.aClass3_Sub11_Sub1_1.aByteArray36, 2, 0);
			Static187.aClass3_Sub11_Sub1_1.anInt3520 = 0;
			Static178.anInt8249 = Static187.aClass3_Sub11_Sub1_1.method3109();
			Static432.anInt7151 += 2;
			Static20.anInt529 = 0;
		}
		if (Static178.anInt8249 > 0) {
			if (!Static78.aClass152_2.method3910(Static178.anInt8249)) {
				return false;
			}
			Static187.aClass3_Sub11_Sub1_1.anInt3520 = 0;
			Static78.aClass152_2.method3909(Static187.aClass3_Sub11_Sub1_1.aByteArray36, Static178.anInt8249, 0);
			Static20.anInt529 = 0;
			Static432.anInt7151 += Static178.anInt8249;
		}
		Static196.aClass272_118 = Static428.aClass272_46;
		Static428.aClass272_46 = Static210.aClass272_125;
		Static210.aClass272_125 = Static230.aClass272_135;
		if (Static514.aClass272_248 == Static230.aClass272_135) {
			Static562.method7489(Static226.aClass187_7);
			Static230.aClass272_135 = null;
			return true;
		}
		@Pc(229) String local229;
		@Pc(240) long local240;
		@Pc(245) long local245;
		@Pc(249) int local249;
		@Pc(223) boolean local223;
		@Pc(227) String local227;
		@Pc(253) int local253;
		@Pc(263) int local263;
		if (Static230.aClass272_135 == Static13.aClass272_195) {
			local223 = Static187.aClass3_Sub11_Sub1_1.method3118() == 1;
			local227 = Static187.aClass3_Sub11_Sub1_1.method3133();
			local229 = local227;
			if (local223) {
				local229 = Static187.aClass3_Sub11_Sub1_1.method3133();
			}
			local240 = Static187.aClass3_Sub11_Sub1_1.method3109();
			local245 = Static187.aClass3_Sub11_Sub1_1.method3126();
			local249 = Static187.aClass3_Sub11_Sub1_1.method3118();
			local253 = Static187.aClass3_Sub11_Sub1_1.method3109();
			@Pc(259) long local259 = local245 + (local240 << 32);
			@Pc(261) boolean local261 = false;
			local263 = 0;
			while (true) {
				if (local263 >= 100) {
					if (local249 <= 1 && Static381.method5639(local229)) {
						local261 = true;
					}
					break;
				}
				if (local259 == Static548.aLongArray15[local263]) {
					local261 = true;
					break;
				}
				local263++;
			}
			if (!local261 && Static239.anInt4498 == 0) {
				Static548.aLongArray15[Static91.anInt2275] = local259;
				Static91.anInt2275 = (Static91.anInt2275 + 1) % 100;
				@Pc(317) String local317 = Static459.aClass290_1.method6377(local253).method7462(Static187.aClass3_Sub11_Sub1_1);
				if (local249 == 2) {
					Static574.method7621("<img=1>" + local229, local253, "<img=1>" + local227, local227, 0, local317, 18, null);
				} else if (local249 == 1) {
					Static574.method7621("<img=0>" + local229, local253, "<img=0>" + local227, local227, 0, local317, 18, null);
				} else {
					Static574.method7621(local229, local253, local227, local227, 0, local317, 18, null);
				}
			}
			Static230.aClass272_135 = null;
			return true;
		}
		@Pc(396) int local396;
		if (Static310.aClass272_168 == Static230.aClass272_135) {
			local396 = Static187.aClass3_Sub11_Sub1_1.method3120();
			local73 = Static187.aClass3_Sub11_Sub1_1.method3139();
			if (Static310.method4848(local73)) {
				Static436.anInt7242 = local396;
			}
			Static230.aClass272_135 = null;
			return true;
		}
		@Pc(434) int local434;
		@Pc(430) int local430;
		if (Static110.aClass272_71 == Static230.aClass272_135) {
			local396 = Static187.aClass3_Sub11_Sub1_1.method3109();
			if (local396 == 65535) {
				local396 = -1;
			}
			local73 = Static187.aClass3_Sub11_Sub1_1.method3118();
			local430 = Static187.aClass3_Sub11_Sub1_1.method3109();
			local434 = Static187.aClass3_Sub11_Sub1_1.method3118();
			Static34.method576(local434, local430, local73, local396);
			Static230.aClass272_135 = null;
			return true;
		} else if (Static230.aClass272_135 == Static471.aClass272_237) {
			Static412.anInt6934 = Static187.aClass3_Sub11_Sub1_1.method3123() << 3;
			Static281.anInt5123 = Static187.aClass3_Sub11_Sub1_1.method3120();
			Static566.anInt9120 = Static187.aClass3_Sub11_Sub1_1.method3078() << 3;
			while (Static178.anInt8249 > Static187.aClass3_Sub11_Sub1_1.anInt3520) {
				@Pc(472) Class187 local472 = Static30.method557()[Static187.aClass3_Sub11_Sub1_1.method3118()];
				Static562.method7489(local472);
			}
			Static230.aClass272_135 = null;
			return true;
		} else {
			@Pc(490) String local490;
			if (Static115.aClass272_73 == Static230.aClass272_135) {
				local490 = Static187.aClass3_Sub11_Sub1_1.method3133();
				local227 = Static81.method1770(Static330.method5100(Static187.aClass3_Sub11_Sub1_1));
				Static483.method6585(local490, local490, local490, 6, 0, local227);
				Static230.aClass272_135 = null;
				return true;
			}
			@Pc(563) int local563;
			@Pc(664) int local664;
			@Pc(526) boolean local526;
			@Pc(625) String local625;
			@Pc(629) Class325 local629;
			@Pc(546) boolean local546;
			if (Static253.aClass272_149 == Static230.aClass272_135) {
				local490 = Static187.aClass3_Sub11_Sub1_1.method3133();
				local526 = Static187.aClass3_Sub11_Sub1_1.method3118() == 1;
				if (local526) {
					local227 = Static187.aClass3_Sub11_Sub1_1.method3133();
				} else {
					local227 = local490;
				}
				local434 = Static187.aClass3_Sub11_Sub1_1.method3109();
				@Pc(544) byte local544 = Static187.aClass3_Sub11_Sub1_1.method3096();
				local546 = false;
				if (local544 == -128) {
					local546 = true;
				}
				if (local546) {
					if (Static583.anInt9304 == 0) {
						Static230.aClass272_135 = null;
						return true;
					}
					for (local563 = 0; local563 < Static583.anInt9304 && (!Static419.aClass325Array5[local563].aString111.equals(local227) || Static419.aClass325Array5[local563].anInt8212 != local434); local563++) {
					}
					if (local563 < Static583.anInt9304) {
						while (Static583.anInt9304 - 1 > local563) {
							Static419.aClass325Array5[local563] = Static419.aClass325Array5[local563 + 1];
							local563++;
						}
						Static583.anInt9304--;
						Static419.aClass325Array5[Static583.anInt9304] = null;
					}
				} else {
					local625 = Static187.aClass3_Sub11_Sub1_1.method3133();
					local629 = new Class325();
					local629.aString111 = local227;
					local629.aString113 = local490;
					local629.aString112 = Static575.method7623(local629.aString111);
					local629.aByte118 = local544;
					local629.aString114 = local625;
					local629.anInt8212 = local434;
					for (local253 = Static583.anInt9304 - 1; local253 >= 0; local253--) {
						local664 = Static419.aClass325Array5[local253].aString112.compareTo(local629.aString112);
						if (local664 == 0) {
							Static419.aClass325Array5[local253].anInt8212 = local434;
							Static419.aClass325Array5[local253].aByte118 = local544;
							Static419.aClass325Array5[local253].aString114 = local625;
							if (local227.equals(Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aString94)) {
								Static253.aByte59 = local544;
							}
							Static230.aClass272_135 = null;
							Static78.anInt3020 = Static251.anInt4580;
							return true;
						}
						if (local664 < 0) {
							break;
						}
					}
					if (Static583.anInt9304 >= Static419.aClass325Array5.length) {
						Static230.aClass272_135 = null;
						return true;
					}
					for (local664 = Static583.anInt9304 - 1; local664 > local253; local664--) {
						Static419.aClass325Array5[local664 + 1] = Static419.aClass325Array5[local664];
					}
					if (Static583.anInt9304 == 0) {
						Static419.aClass325Array5 = new Class325[100];
					}
					Static419.aClass325Array5[local253 + 1] = local629;
					Static583.anInt9304++;
					if (local227.equals(Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aString94)) {
						Static253.aByte59 = local544;
					}
				}
				Static78.anInt3020 = Static251.anInt4580;
				Static230.aClass272_135 = null;
				return true;
			}
			@Pc(784) String local784;
			@Pc(814) String local814;
			@Pc(782) String local782;
			if (Static220.aClass272_130 == Static230.aClass272_135) {
				local396 = Static187.aClass3_Sub11_Sub1_1.method3138();
				local73 = Static187.aClass3_Sub11_Sub1_1.method3116();
				local430 = Static187.aClass3_Sub11_Sub1_1.method3118();
				local782 = "";
				local784 = local782;
				if ((local430 & 0x1) != 0) {
					local782 = Static187.aClass3_Sub11_Sub1_1.method3133();
					if ((local430 & 0x2) == 0) {
						local784 = local782;
					} else {
						local784 = Static187.aClass3_Sub11_Sub1_1.method3133();
					}
				}
				local814 = Static187.aClass3_Sub11_Sub1_1.method3133();
				if (local396 == 99) {
					Static369.method5492(local814);
				} else if (local784.equals("") || !Static381.method5639(local784)) {
					Static483.method6585(local784, local782, local782, local396, local73, local814);
				} else {
					Static230.aClass272_135 = null;
					return true;
				}
				Static230.aClass272_135 = null;
				return true;
			} else if (Static355.aClass272_189 == Static230.aClass272_135) {
				Static562.method7489(Static35.aClass187_2);
				Static230.aClass272_135 = null;
				return true;
			} else if (Static249.aClass272_147 == Static230.aClass272_135) {
				local396 = Static187.aClass3_Sub11_Sub1_1.method3109();
				local73 = Static187.aClass3_Sub11_Sub1_1.method3116();
				if (Static310.method4848(local396)) {
					@Pc(878) Class3_Sub28 local878 = (Class3_Sub28) Static227.aClass310_15.method6601((long) local73);
					if (local878 != null) {
						Static423.method6029(false, true, local878);
					}
					if (Static48.aClass203_24 != null) {
						Static138.method2656(Static48.aClass203_24);
						Static48.aClass203_24 = null;
					}
				}
				Static230.aClass272_135 = null;
				return true;
			} else if (Static464.aClass272_234 == Static230.aClass272_135) {
				Static562.method7489(Static280.aClass187_10);
				Static230.aClass272_135 = null;
				return true;
			} else {
				@Pc(953) boolean local953;
				if (Static140.aClass272_243 == Static230.aClass272_135) {
					local396 = Static187.aClass3_Sub11_Sub1_1.method3109();
					@Pc(922) Class9_Sub1_Sub1_Sub2_Sub2 local922;
					if (local396 == Static502.anInt8011) {
						local922 = Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2;
					} else {
						local922 = Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[local396];
					}
					if (local922 == null) {
						Static230.aClass272_135 = null;
						return true;
					}
					local430 = Static187.aClass3_Sub11_Sub1_1.method3109();
					local434 = Static187.aClass3_Sub11_Sub1_1.method3118();
					local953 = (local430 & 0x8000) != 0;
					if (local922.aString94 != null && local922.aClass75_1 != null) {
						local546 = false;
						if (local434 <= 1) {
							if (!local953 && (Static203.aBoolean318 && !Static491.aBoolean618 || Static426.aBoolean561)) {
								local546 = true;
							} else if (Static381.method5639(local922.aString94)) {
								local546 = true;
							}
						}
						if (!local546 && Static239.anInt4498 == 0) {
							local249 = -1;
							if (local953) {
								local430 &= 0x7FFF;
								@Pc(1010) Class364 local1010 = Static540.method7111(Static187.aClass3_Sub11_Sub1_1);
								local249 = local1010.anInt9356;
								local625 = local1010.aClass3_Sub3_Sub17_1.method7462(Static187.aClass3_Sub11_Sub1_1);
							} else {
								local625 = Static81.method1770(Static330.method5100(Static187.aClass3_Sub11_Sub1_1));
							}
							local922.aString93 = local625.trim();
							local922.anInt6433 = local430 >> 8;
							local922.anInt6414 = 150;
							local922.anInt6452 = local430 & 0xFF;
							if (local434 == 1 || local434 == 2) {
								local253 = local953 ? 17 : 1;
							} else {
								local253 = local953 ? 17 : 2;
							}
							if (local434 == 2) {
								Static574.method7621("<img=1>" + local922.method5581(), local249, "<img=1>" + local922.method5577(), local922.aString95, 0, local625, local253, null);
							} else if (local434 == 1) {
								Static574.method7621("<img=0>" + local922.method5581(), local249, "<img=0>" + local922.method5577(), local922.aString95, 0, local625, local253, null);
							} else {
								Static574.method7621(local922.method5581(), local249, local922.method5577(), local922.aString95, 0, local625, local253, null);
							}
						}
					}
					Static230.aClass272_135 = null;
					return true;
				} else if (Static492.aClass272_184 == Static230.aClass272_135) {
					Static246.method4030(false);
					Static230.aClass272_135 = null;
					return true;
				} else if (Static164.aClass272_100 == Static230.aClass272_135) {
					local396 = Static187.aClass3_Sub11_Sub1_1.method3110();
					local73 = Static187.aClass3_Sub11_Sub1_1.method3139();
					local430 = Static187.aClass3_Sub11_Sub1_1.method3109();
					if (Static310.method4848(local430)) {
						if (local396 == 2) {
							Static190.method3263();
						}
						Static307.anInt5578 = local73;
						Static91.method2048(local73);
						Static517.method6895(false);
						Static149.method2776(Static307.anInt5578);
						for (local434 = 0; local434 < 100; local434++) {
							Static253.aBooleanArray17[local434] = true;
						}
					}
					Static230.aClass272_135 = null;
					return true;
				} else if (Static314.aClass272_172 == Static230.aClass272_135) {
					local223 = Static187.aClass3_Sub11_Sub1_1.method3118() == 1;
					@Pc(1230) byte[] local1230 = new byte[Static178.anInt8249 - 1];
					Static187.aClass3_Sub11_Sub1_1.method3090(Static178.anInt8249 - 1, local1230);
					Static259.method6929(local223, local1230);
					Static230.aClass272_135 = null;
					return true;
				} else if (Static230.aClass272_135 == Static103.aClass272_61) {
					local396 = Static187.aClass3_Sub11_Sub1_1.method3116();
					Static65.aClass192_1 = Static409.aClass221_6.method5203(local396);
					Static230.aClass272_135 = null;
					return true;
				} else if (Static230.aClass272_135 == Static322.aClass272_177) {
					local396 = Static187.aClass3_Sub11_Sub1_1.method3116();
					local73 = Static187.aClass3_Sub11_Sub1_1.method3117();
					if (Static310.method4848(local73)) {
						Static357.method5351(Static502.anInt8011, 5, local396, 0);
					}
					Static230.aClass272_135 = null;
					return true;
				} else if (Static230.aClass272_135 == Static113.aClass272_72) {
					Static59.anInt5160 = Static187.aClass3_Sub11_Sub1_1.method3137();
					Static203.aBoolean318 = Static187.aClass3_Sub11_Sub1_1.method3118() == 1;
					Static230.aClass272_135 = null;
					return true;
				} else {
					@Pc(1342) int local1342;
					if (Static230.aClass272_135 == Static539.aClass272_173) {
						local396 = Static187.aClass3_Sub11_Sub1_1.method3116();
						local73 = Static187.aClass3_Sub11_Sub1_1.method3120();
						local430 = Static187.aClass3_Sub11_Sub1_1.method3118();
						Static349.anIntArray481[local73] = local396;
						Static95.anIntArray64[local73] = local430;
						Static501.anIntArray615[local73] = 1;
						local434 = Static514.anIntArray624[local73] - 1;
						for (local1342 = 0; local1342 < local434; local1342++) {
							if (local396 >= Class309.anIntArray604[local1342]) {
								Static501.anIntArray615[local73] = local1342 + 2;
							}
						}
						Static317.anIntArray446[Static505.anInt2915++ & 0x1F] = local73;
						Static230.aClass272_135 = null;
						return true;
					} else if (Static230.aClass272_135 == Static348.aClass272_187) {
						if (Static307.anInt5578 != -1) {
							Static107.method5739(Static307.anInt5578, 0);
						}
						Static230.aClass272_135 = null;
						return true;
					} else {
						@Pc(1923) int local1923;
						@Pc(1851) int local1851;
						@Pc(1461) boolean local1461;
						@Pc(1620) int local1620;
						if (Static84.aClass272_53 == Static230.aClass272_135) {
							local396 = Static187.aClass3_Sub11_Sub1_1.method3099();
							local73 = Static187.aClass3_Sub11_Sub1_1.method3105();
							local430 = Static187.aClass3_Sub11_Sub1_1.method3117();
							local434 = Static187.aClass3_Sub11_Sub1_1.method3109();
							local1342 = Static187.aClass3_Sub11_Sub1_1.method3109();
							local546 = (local396 & 0x80) != 0;
							if (local73 >> 30 == 0) {
								@Pc(1531) Class175 local1531;
								@Pc(1546) Class17 local1546;
								@Pc(1552) Class17 local1552;
								if (local73 >> 29 != 0) {
									local563 = local73 & 0xFFFF;
									@Pc(1750) Class3_Sub39 local1750 = (Class3_Sub39) Static243.aClass310_16.method6601((long) local563);
									if (local1750 != null) {
										if (local430 == 65535) {
											local430 = -1;
										}
										@Pc(1762) Class9_Sub1_Sub1_Sub2_Sub1 local1762 = local1750.aClass9_Sub1_Sub1_Sub2_Sub1_2;
										@Pc(1764) boolean local1764 = true;
										local1620 = local546 ? local1762.anInt6384 : local1762.anInt6424;
										if (local430 != -1 && local1620 != -1) {
											if (local430 == local1620) {
												local1531 = Static547.aClass248_2.method5708(local430);
												if (local1531.aBoolean386 && local1531.anInt4956 != -1) {
													local1546 = Static330.aClass279_2.method6216(local1531.anInt4956);
													local1851 = local1546.anInt555;
													if (local1851 == 0 || local1851 == 2) {
														local1764 = false;
													} else if (local1851 == 1) {
														local1764 = true;
													}
												}
											} else {
												local1531 = Static547.aClass248_2.method5708(local430);
												@Pc(1796) Class175 local1796 = Static547.aClass248_2.method5708(local1620);
												if (local1531.anInt4956 != -1 && local1796.anInt4956 != -1) {
													local1552 = Static330.aClass279_2.method6216(local1531.anInt4956);
													@Pc(1816) Class17 local1816 = Static330.aClass279_2.method6216(local1796.anInt4956);
													if (local1552.anInt559 < local1816.anInt559) {
														local1764 = false;
													}
												}
											}
										}
										if (local1764) {
											if (local546) {
												local1762.anInt6420 = 1;
												local1762.anInt6400 = 0;
												local1762.anInt6418 = local1342;
												local1762.anInt6384 = local430;
												local1762.anInt6444 = 0;
												local1762.anInt6409 = local396 & 0x7;
												local1762.anInt6432 = local434 + Static305.anInt5560;
												if (local1762.anInt6432 > Static305.anInt5560) {
													local1762.anInt6444 = -1;
												}
												if (local1762.anInt6384 != -1 && Static305.anInt5560 == local1762.anInt6432) {
													local1923 = Static547.aClass248_2.method5708(local1762.anInt6384).anInt4956;
													if (local1923 != -1) {
														local1546 = Static330.aClass279_2.method6216(local1923);
														if (local1546 != null && local1546.anIntArray55 != null) {
															Static351.method5300(0, local1546, local1762.anInt8980, local1762.anInt8975, local1762.aByte126, false);
														}
													}
												}
											} else {
												local1762.lb = 0;
												local1762.anInt6386 = 0;
												local1762.anInt6412 = 1;
												local1762.anInt6424 = local430;
												local1762.anInt6390 = local396 & 0x7;
												local1762.anInt6464 = Static305.anInt5560 + local434;
												local1762.anInt6443 = local1342;
												if (local1762.anInt6464 > Static305.anInt5560) {
													local1762.lb = -1;
												}
												if (local1762.anInt6424 != -1 && Static305.anInt5560 == local1762.anInt6464) {
													local1923 = Static547.aClass248_2.method5708(local1762.anInt6424).anInt4956;
													if (local1923 != -1) {
														local1546 = Static330.aClass279_2.method6216(local1923);
														if (local1546 != null && local1546.anIntArray55 != null) {
															Static351.method5300(0, local1546, local1762.anInt8980, local1762.anInt8975, local1762.aByte126, false);
														}
													}
												}
											}
										}
									}
								} else if (local73 >> 28 != 0) {
									local563 = local73 & 0xFFFF;
									@Pc(1446) Class9_Sub1_Sub1_Sub2_Sub2 local1446;
									if (Static502.anInt8011 == local563) {
										local1446 = Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2;
									} else {
										local1446 = Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[local563];
									}
									if (local1446 != null) {
										if (local430 == 65535) {
											local430 = -1;
										}
										local1461 = true;
										local664 = local546 ? local1446.anInt6384 : local1446.anInt6424;
										@Pc(1497) Class17 local1497;
										if (local430 != -1 && local664 != -1) {
											@Pc(1484) Class175 local1484;
											if (local430 == local664) {
												local1484 = Static547.aClass248_2.method5708(local430);
												if (local1484.aBoolean386 && local1484.anInt4956 != -1) {
													local1497 = Static330.aClass279_2.method6216(local1484.anInt4956);
													local263 = local1497.anInt555;
													if (local263 == 0 || local263 == 2) {
														local1461 = false;
													} else if (local263 == 1) {
														local1461 = true;
													}
												}
											} else {
												local1484 = Static547.aClass248_2.method5708(local430);
												local1531 = Static547.aClass248_2.method5708(local664);
												if (local1484.anInt4956 != -1 && local1531.anInt4956 != -1) {
													local1546 = Static330.aClass279_2.method6216(local1484.anInt4956);
													local1552 = Static330.aClass279_2.method6216(local1531.anInt4956);
													if (local1552.anInt559 > local1546.anInt559) {
														local1461 = false;
													}
												}
											}
										}
										if (local1461) {
											if (local546) {
												local1446.anInt6432 = Static305.anInt5560 + local434;
												local1446.anInt6400 = 0;
												local1446.anInt6444 = 0;
												local1446.anInt6420 = 1;
												local1446.anInt6418 = local1342;
												local1446.anInt6409 = local396 & 0x7;
												local1446.anInt6384 = local430;
												if (Static305.anInt5560 < local1446.anInt6432) {
													local1446.anInt6444 = -1;
												}
												if (local1446.anInt6384 == 65535) {
													local1446.anInt6384 = -1;
												}
												if (local1446.anInt6384 != -1 && local1446.anInt6432 == Static305.anInt5560) {
													local1620 = Static547.aClass248_2.method5708(local1446.anInt6384).anInt4956;
													if (local1620 != -1) {
														local1497 = Static330.aClass279_2.method6216(local1620);
														if (local1497 != null && local1497.anIntArray55 != null) {
															Static351.method5300(0, local1497, local1446.anInt8980, local1446.anInt8975, local1446.aByte126, Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2 == local1446);
														}
													}
												}
											} else {
												local1446.anInt6412 = 1;
												local1446.anInt6390 = local396 & 0x7;
												local1446.anInt6424 = local430;
												local1446.anInt6386 = 0;
												local1446.anInt6443 = local1342;
												local1446.anInt6464 = Static305.anInt5560 + local434;
												local1446.lb = 0;
												if (Static305.anInt5560 < local1446.anInt6464) {
													local1446.lb = -1;
												}
												if (local1446.anInt6424 == 65535) {
													local1446.anInt6424 = -1;
												}
												if (local1446.anInt6424 != -1 && local1446.anInt6464 == Static305.anInt5560) {
													local1620 = Static547.aClass248_2.method5708(local1446.anInt6424).anInt4956;
													if (local1620 != -1) {
														local1497 = Static330.aClass279_2.method6216(local1620);
														if (local1497 != null && local1497.anIntArray55 != null) {
															Static351.method5300(0, local1497, local1446.anInt8980, local1446.anInt8975, local1446.aByte126, Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2 == local1446);
														}
													}
												}
											}
										}
									}
								}
							} else {
								local563 = local73 >> 28 & 0x3;
								local249 = (local73 >> 14 & 0x3FFF) - Static529.anInt8344;
								local253 = (local73 & 0x3FFF) - Static463.anInt7588;
								if (local249 >= 0 && local253 >= 0 && local249 < Static400.anInt6818 && Static271.anInt5050 > local253) {
									local664 = local249 * 512 + 256;
									local1620 = local253 * 512 + 256;
									local1923 = local563;
									if (local563 < 3 && Static425.method6053(local249, local253)) {
										local1923 = local563 + 1;
									}
									@Pc(2111) Class9_Sub1_Sub1_Sub4 local2111 = new Class9_Sub1_Sub1_Sub4(local430, 0, Static305.anInt5560, local563, local1923, local664, Static130.method2562(local1620, local563, local664) - local1342, local1620, local249, local249, local253, local253, local396 & 0x7);
									Static131.aClass130_11.method3548(new Class3_Sub3_Sub19(local2111));
								}
							}
							Static230.aClass272_135 = null;
							return true;
						} else if (Static230.aClass272_135 == Static560.aClass272_264) {
							local223 = Static187.aClass3_Sub11_Sub1_1.method3118() == 1;
							local227 = Static187.aClass3_Sub11_Sub1_1.method3133();
							local229 = local227;
							if (local223) {
								local229 = Static187.aClass3_Sub11_Sub1_1.method3133();
							}
							local434 = Static187.aClass3_Sub11_Sub1_1.method3118();
							local953 = false;
							if (local434 <= 1) {
								if (Static203.aBoolean318 && !Static491.aBoolean618 || Static426.aBoolean561) {
									local953 = true;
								} else if (local434 <= 1 && Static381.method5639(local229)) {
									local953 = true;
								}
							}
							if (!local953 && Static239.anInt4498 == 0) {
								local814 = Static81.method1770(Static330.method5100(Static187.aClass3_Sub11_Sub1_1));
								if (local434 == 2) {
									Static574.method7621("<img=1>" + local229, -1, "<img=1>" + local227, local227, 0, local814, 24, null);
								} else if (local434 == 1) {
									Static574.method7621("<img=0>" + local229, -1, "<img=0>" + local227, local227, 0, local814, 24, null);
								} else {
									Static574.method7621(local229, -1, local227, local227, 0, local814, 24, null);
								}
							}
							Static230.aClass272_135 = null;
							return true;
						} else {
							@Pc(2314) int local2314;
							if (Static230.aClass272_135 == Static107.aClass272_209) {
								Static566.anInt9120 = Static187.aClass3_Sub11_Sub1_1.method3078() << 3;
								Static281.anInt5123 = Static187.aClass3_Sub11_Sub1_1.method3120();
								Static412.anInt6934 = Static187.aClass3_Sub11_Sub1_1.method3123() << 3;
								for (@Pc(2280) Class3_Sub46 local2280 = (Class3_Sub46) Static508.aClass310_33.method6602(); local2280 != null; local2280 = (Class3_Sub46) Static508.aClass310_33.method6599()) {
									local73 = (int) (local2280.aLong273 >> 28 & 0x3L);
									local430 = (int) (local2280.aLong273 & 0x3FFFL);
									local434 = local430 - Static529.anInt8344;
									local1342 = (int) (local2280.aLong273 >> 14 & 0x3FFFL);
									local2314 = local1342 - Static463.anInt7588;
									if (local73 == Static281.anInt5123 && Static566.anInt9120 <= local434 && local434 < Static566.anInt9120 + 8 && Static412.anInt6934 <= local2314 && Static412.anInt6934 + 8 > local2314) {
										local2280.method7812();
										if (local434 >= 0 && local2314 >= 0 && Static400.anInt6818 > local434 && Static271.anInt5050 > local2314) {
											Static577.method3277(local2314, local434, Static281.anInt5123);
										}
									}
								}
								for (@Pc(2378) Class3_Sub42 local2378 = (Class3_Sub42) Static475.aClass130_47.method3543(); local2378 != null; local2378 = (Class3_Sub42) Static475.aClass130_47.method3551()) {
									if (local2378.anInt7385 >= Static566.anInt9120 && local2378.anInt7385 < Static566.anInt9120 + 8 && local2378.anInt7381 >= Static412.anInt6934 && local2378.anInt7381 < Static412.anInt6934 + 8 && local2378.anInt7384 == Static281.anInt5123) {
										local2378.anInt7383 = 0;
									}
								}
								Static230.aClass272_135 = null;
								return true;
							} else if (Static147.aClass272_92 == Static230.aClass272_135) {
								Static187.aClass3_Sub11_Sub1_1.anInt3520 += 28;
								if (Static187.aClass3_Sub11_Sub1_1.method3080()) {
									Static211.method3740(Static187.aClass3_Sub11_Sub1_1, Static187.aClass3_Sub11_Sub1_1.anInt3520 - 28);
								}
								Static230.aClass272_135 = null;
								return true;
							} else if (Static230.aClass272_135 == Static144.aClass272_88) {
								Static562.method7489(Static83.aClass187_4);
								Static230.aClass272_135 = null;
								return true;
							} else if (Static230.aClass272_135 == Static446.aClass272_227) {
								Static427.aClass56_1.method1733();
								Static47.anInt1015 += 32;
								Static230.aClass272_135 = null;
								return true;
							} else if (Static247.aClass272_146 == Static230.aClass272_135) {
								local396 = Static187.aClass3_Sub11_Sub1_1.method3118();
								@Pc(2500) boolean local2500 = (local396 & 0x1) == 1;
								local229 = Static187.aClass3_Sub11_Sub1_1.method3133();
								local782 = Static187.aClass3_Sub11_Sub1_1.method3133();
								if (local782.equals("")) {
									local782 = local229;
								}
								local784 = Static187.aClass3_Sub11_Sub1_1.method3133();
								local814 = Static187.aClass3_Sub11_Sub1_1.method3133();
								if (local814.equals("")) {
									local814 = local784;
								}
								if (local2500) {
									for (local563 = 0; local563 < Static82.anInt2184; local563++) {
										if (Static552.aStringArray46[local563].equals(local814)) {
											Static145.aStringArray14[local563] = local229;
											Static552.aStringArray46[local563] = local782;
											Static553.aStringArray47[local563] = local784;
											Static40.aStringArray32[local563] = local814;
											break;
										}
									}
								} else {
									Static145.aStringArray14[Static82.anInt2184] = local229;
									Static552.aStringArray46[Static82.anInt2184] = local782;
									Static553.aStringArray47[Static82.anInt2184] = local784;
									Static40.aStringArray32[Static82.anInt2184] = local814;
									Static143.aBooleanArray32[Static82.anInt2184] = (local396 & 0x2) == 2;
									Static82.anInt2184++;
								}
								Static230.aClass272_135 = null;
								Static417.anInt7008 = Static251.anInt4580;
								return true;
							} else if (Static299.aClass272_163 == Static230.aClass272_135) {
								Static429.method6073(Static451.aBoolean584);
								Static230.aClass272_135 = null;
								return false;
							} else if (Static230.aClass272_135 == Static118.aClass272_76) {
								local396 = Static187.aClass3_Sub11_Sub1_1.method3118();
								local73 = local396 >> 5;
								local430 = local396 & 0x1F;
								if (local430 == 0) {
									Static443.aClass122Array1[local73] = null;
									Static230.aClass272_135 = null;
									return true;
								}
								@Pc(2640) Class122 local2640 = new Class122();
								local2640.anInt3557 = local430;
								local2640.anInt3547 = Static187.aClass3_Sub11_Sub1_1.method3118();
								if (local2640.anInt3547 >= 0 && Static56.aClass46Array2.length > local2640.anInt3547) {
									if (local2640.anInt3557 == 1 || local2640.anInt3557 == 10) {
										local2640.anInt3554 = Static187.aClass3_Sub11_Sub1_1.method3109();
										Static187.aClass3_Sub11_Sub1_1.anInt3520 += 6;
									} else if (local2640.anInt3557 >= 2 && local2640.anInt3557 <= 6) {
										if (local2640.anInt3557 == 2) {
											local2640.anInt3553 = 256;
											local2640.anInt3555 = 256;
										}
										if (local2640.anInt3557 == 3) {
											local2640.anInt3553 = 256;
											local2640.anInt3555 = 0;
										}
										if (local2640.anInt3557 == 4) {
											local2640.anInt3553 = 256;
											local2640.anInt3555 = 512;
										}
										if (local2640.anInt3557 == 5) {
											local2640.anInt3555 = 256;
											local2640.anInt3553 = 0;
										}
										if (local2640.anInt3557 == 6) {
											local2640.anInt3555 = 256;
											local2640.anInt3553 = 512;
										}
										local2640.anInt3557 = 2;
										local2640.anInt3552 = Static187.aClass3_Sub11_Sub1_1.method3118();
										local2640.anInt3555 += Static187.aClass3_Sub11_Sub1_1.method3109() - Static529.anInt8344 << 9;
										local2640.anInt3553 += Static187.aClass3_Sub11_Sub1_1.method3109() - Static463.anInt7588 << 9;
										local2640.anInt3551 = Static187.aClass3_Sub11_Sub1_1.method3118() << 2;
										local2640.anInt3548 = Static187.aClass3_Sub11_Sub1_1.method3109();
									}
									local2640.anInt3549 = Static187.aClass3_Sub11_Sub1_1.method3109();
									if (local2640.anInt3549 == 65535) {
										local2640.anInt3549 = -1;
									}
									Static443.aClass122Array1[local73] = local2640;
								}
								Static230.aClass272_135 = null;
								return true;
							} else {
								@Pc(2839) Class3_Sub28 local2839;
								if (Static87.aClass272_57 == Static230.aClass272_135) {
									local396 = Static187.aClass3_Sub11_Sub1_1.method3115();
									local73 = Static187.aClass3_Sub11_Sub1_1.method3074();
									local430 = Static187.aClass3_Sub11_Sub1_1.method3117();
									local434 = Static187.aClass3_Sub11_Sub1_1.method3118();
									if (Static310.method4848(local396)) {
										local2839 = (Class3_Sub28) Static227.aClass310_15.method6601((long) local73);
										if (local2839 != null) {
											Static423.method6029(false, local2839.anInt5333 != local430, local2839);
										}
										Static144.method2740(local434, local73, false, local430);
									}
									Static230.aClass272_135 = null;
									return true;
								} else if (Static442.aClass272_261 == Static230.aClass272_135) {
									Static562.method7489(Static81.aClass187_3);
									Static230.aClass272_135 = null;
									return true;
								} else if (Static230.aClass272_135 == Static393.aClass272_213) {
									Static230.aClass272_135 = null;
									return false;
								} else if (Static396.aClass272_208 == Static230.aClass272_135) {
									local396 = Static187.aClass3_Sub11_Sub1_1.method3105();
									local227 = Static187.aClass3_Sub11_Sub1_1.method3133();
									local430 = Static187.aClass3_Sub11_Sub1_1.method3115();
									if (Static310.method4848(local430)) {
										Static532.method7027(local227, local396);
									}
									Static230.aClass272_135 = null;
									return true;
								} else if (Static532.aClass272_257 == Static230.aClass272_135) {
									local396 = Static187.aClass3_Sub11_Sub1_1.method3076();
									local73 = Static187.aClass3_Sub11_Sub1_1.method3139();
									Static427.aClass56_1.method1731(local396, local73);
									Static230.aClass272_135 = null;
									return true;
								} else if (Static230.aClass272_135 == Static319.aClass272_174) {
									Static480.aClass265_5 = Static490.method6751(Static187.aClass3_Sub11_Sub1_1.method3118());
									Static230.aClass272_135 = null;
									return true;
								} else if (Static227.aClass272_134 == Static230.aClass272_135) {
									local396 = Static187.aClass3_Sub11_Sub1_1.method3115();
									local73 = Static187.aClass3_Sub11_Sub1_1.method3109();
									local430 = Static187.aClass3_Sub11_Sub1_1.method3115();
									if (Static310.method4848(local430)) {
										Static25.method462(local396, local73);
									}
									Static230.aClass272_135 = null;
									return true;
								} else if (Static522.aClass272_253 == Static230.aClass272_135) {
									local396 = Static187.aClass3_Sub11_Sub1_1.method3139();
									local73 = Static187.aClass3_Sub11_Sub1_1.method3074();
									local430 = Static187.aClass3_Sub11_Sub1_1.method3139();
									if (Static310.method4848(local396)) {
										Static485.method6606(local430, local73);
									}
									Static230.aClass272_135 = null;
									return true;
								} else if (Static242.aClass272_141 == Static230.aClass272_135) {
									if (Static311.aFrame2 != null) {
										Static29.method547(-1, Static278.aClass3_Sub13_Sub1_1.anInt5151, -1, false);
									}
									@Pc(3010) byte[] local3010 = new byte[Static178.anInt8249];
									Static187.aClass3_Sub11_Sub1_1.method993(Static178.anInt8249, local3010);
									local227 = Static331.method5118(0, local3010, Static178.anInt8249);
									Static303.method4768(local227, Static260.anInt4932 == 1, Static409.aClass221_6, true);
									Static230.aClass272_135 = null;
									return true;
								} else if (Static230.aClass272_135 == Static468.aClass272_235) {
									Static562.method7489(Static363.aClass187_13);
									Static230.aClass272_135 = null;
									return true;
								} else if (Static590.aClass272_272 == Static230.aClass272_135) {
									local396 = Static187.aClass3_Sub11_Sub1_1.method3105();
									local73 = Static187.aClass3_Sub11_Sub1_1.method3115();
									if (local73 == 65535) {
										local73 = -1;
									}
									local430 = Static187.aClass3_Sub11_Sub1_1.method3115();
									if (Static310.method4848(local430)) {
										Static357.method5351(local73, 2, local396, -1);
									}
									Static230.aClass272_135 = null;
									return true;
								} else if (Static196.aClass272_119 == Static230.aClass272_135) {
									Static246.method4030(true);
									Static230.aClass272_135 = null;
									return true;
								} else if (Static57.aClass272_40 == Static230.aClass272_135) {
									Static429.method6073(false);
									Static230.aClass272_135 = null;
									return false;
								} else if (Static230.aClass272_135 == Static527.aClass272_256) {
									Static562.method7489(Static100.aClass187_6);
									Static230.aClass272_135 = null;
									return true;
								} else if (Static161.aClass272_95 == Static230.aClass272_135) {
									local396 = Static187.aClass3_Sub11_Sub1_1.method3139();
									local73 = Static187.aClass3_Sub11_Sub1_1.method3120();
									Static427.aClass56_1.method1736(local73, local396);
									Static230.aClass272_135 = null;
									return true;
								} else if (Static230.aClass272_135 == Static191.aClass272_116) {
									local396 = Static187.aClass3_Sub11_Sub1_1.method3117();
									local73 = Static187.aClass3_Sub11_Sub1_1.method3117();
									local430 = Static187.aClass3_Sub11_Sub1_1.method3116();
									local434 = Static187.aClass3_Sub11_Sub1_1.method3109();
									if (Static310.method4848(local73)) {
										Static454.method6306(local434 + (local396 << 16), local430);
									}
									Static230.aClass272_135 = null;
									return true;
								} else if (Static466.aClass272_266 == Static230.aClass272_135) {
									Static281.anInt5123 = Static187.aClass3_Sub11_Sub1_1.method3099();
									Static566.anInt9120 = Static187.aClass3_Sub11_Sub1_1.method3096() << 3;
									Static412.anInt6934 = Static187.aClass3_Sub11_Sub1_1.method3096() << 3;
									Static230.aClass272_135 = null;
									return true;
								} else if (Static288.aClass272_159 == Static230.aClass272_135) {
									local223 = Static187.aClass3_Sub11_Sub1_1.method3118() == 1;
									local227 = Static187.aClass3_Sub11_Sub1_1.method3133();
									local229 = local227;
									if (local223) {
										local229 = Static187.aClass3_Sub11_Sub1_1.method3133();
									}
									local434 = Static187.aClass3_Sub11_Sub1_1.method3118();
									local1342 = Static187.aClass3_Sub11_Sub1_1.method3109();
									local546 = false;
									if (local434 <= 1 && Static381.method5639(local229)) {
										local546 = true;
									}
									if (!local546 && Static239.anInt4498 == 0) {
										local625 = Static459.aClass290_1.method6377(local1342).method7462(Static187.aClass3_Sub11_Sub1_1);
										if (local434 == 2) {
											Static574.method7621("<img=1>" + local229, local1342, "<img=1>" + local227, local227, 0, local625, 25, null);
										} else if (local434 == 1) {
											Static574.method7621("<img=0>" + local229, local1342, "<img=0>" + local227, local227, 0, local625, 25, null);
										} else {
											Static574.method7621(local229, local1342, local227, local227, 0, local625, 25, null);
										}
									}
									Static230.aClass272_135 = null;
									return true;
								} else if (Static230.aClass272_135 == Static2.aClass272_1) {
									local396 = Static187.aClass3_Sub11_Sub1_1.method3118();
									if (Static187.aClass3_Sub11_Sub1_1.method3118() == 0) {
										Static72.aClass259Array1[local396] = new Class259();
									} else {
										Static187.aClass3_Sub11_Sub1_1.anInt3520--;
										Static72.aClass259Array1[local396] = new Class259(Static187.aClass3_Sub11_Sub1_1);
									}
									Static230.aClass272_135 = null;
									Static96.anInt2328 = Static251.anInt4580;
									return true;
								} else if (Static458.aClass272_230 == Static230.aClass272_135) {
									Static562.method7489(Static349.aClass187_12);
									Static230.aClass272_135 = null;
									return true;
								} else if (Static29.aClass272_22 == Static230.aClass272_135) {
									Static353.method5306();
									Static230.aClass272_135 = null;
									return false;
								} else if (Static230.aClass272_135 == Static145.aClass272_89) {
									Static66.anInt1794 = Static187.aClass3_Sub11_Sub1_1.method3118();
									Static230.aClass272_135 = null;
									Static247.anInt4548 = Static251.anInt4580;
									return true;
								} else if (Static230.aClass272_135 == Static74.aClass272_49) {
									local396 = Static187.aClass3_Sub11_Sub1_1.method3109();
									local73 = Static187.aClass3_Sub11_Sub1_1.method3118();
									local430 = Static187.aClass3_Sub11_Sub1_1.method3118();
									local434 = Static187.aClass3_Sub11_Sub1_1.method3109() << 2;
									local1342 = Static187.aClass3_Sub11_Sub1_1.method3118();
									local2314 = Static187.aClass3_Sub11_Sub1_1.method3118();
									if (Static310.method4848(local396)) {
										Static81.method1774(local1342, local73, local434, local430, local2314);
									}
									Static230.aClass272_135 = null;
									return true;
								} else if (Static201.aClass272_122 == Static230.aClass272_135) {
									local490 = Static187.aClass3_Sub11_Sub1_1.method3133();
									local73 = Static187.aClass3_Sub11_Sub1_1.method3109();
									local229 = Static459.aClass290_1.method6377(local73).method7462(Static187.aClass3_Sub11_Sub1_1);
									Static574.method7621(local490, local73, local490, local490, 0, local229, 19, null);
									Static230.aClass272_135 = null;
									return true;
								} else if (Static230.aClass272_135 == Class9_Sub1_Sub1_Sub4.lb) {
									local396 = Static187.aClass3_Sub11_Sub1_1.method3139();
									local73 = Static187.aClass3_Sub11_Sub1_1.method3117();
									local229 = Static187.aClass3_Sub11_Sub1_1.method3133();
									if (Static310.method4848(local396)) {
										Static83.method1824(local73, local229);
									}
									Static230.aClass272_135 = null;
									return true;
								} else if (Static230.aClass272_135 == Static513.aClass272_247) {
									local396 = Static187.aClass3_Sub11_Sub1_1.method3110();
									local73 = Static187.aClass3_Sub11_Sub1_1.method3109();
									local430 = Static187.aClass3_Sub11_Sub1_1.method3116();
									if (Static310.method4848(local73)) {
										Static312.method4879(local396, local430);
									}
									Static230.aClass272_135 = null;
									return true;
								} else if (Static230.aClass272_135 == Static139.aClass272_85) {
									Static562.method7489(Static83.aClass187_5);
									Static230.aClass272_135 = null;
									return true;
								} else if (Static230.aClass272_135 == Static365.aClass272_275) {
									local396 = Static187.aClass3_Sub11_Sub1_1.method3076();
									local73 = Static187.aClass3_Sub11_Sub1_1.method3115();
									local430 = Static187.aClass3_Sub11_Sub1_1.method3109();
									local434 = Static187.aClass3_Sub11_Sub1_1.method3115();
									local1342 = Static187.aClass3_Sub11_Sub1_1.method3139();
									if (Static310.method4848(local434)) {
										Static357.method5351(local430 << 16 | local73, 7, local396, local1342);
									}
									Static230.aClass272_135 = null;
									return true;
								} else if (Static461.aClass272_231 == Static230.aClass272_135) {
									Static562.method7489(Static562.aClass187_17);
									Static230.aClass272_135 = null;
									return true;
								} else if (Static280.aClass272_157 == Static230.aClass272_135) {
									local396 = Static187.aClass3_Sub11_Sub1_1.method3109();
									local73 = Static187.aClass3_Sub11_Sub1_1.method3109();
									local430 = Static187.aClass3_Sub11_Sub1_1.method3109();
									local434 = Static187.aClass3_Sub11_Sub1_1.method3109();
									if (Static310.method4848(local396) && Static59.aClass203ArrayArray3[local73] != null) {
										for (local1342 = local430; local1342 < local434; local1342++) {
											local2314 = Static187.aClass3_Sub11_Sub1_1.method3126();
											if (local1342 < Static59.aClass203ArrayArray3[local73].length && Static59.aClass203ArrayArray3[local73][local1342] != null) {
												Static59.aClass203ArrayArray3[local73][local1342].anInt5492 = local2314;
											}
										}
									}
									Static230.aClass272_135 = null;
									return true;
								} else if (Static230.aClass272_135 == Static147.aClass272_93) {
									local396 = Static187.aClass3_Sub11_Sub1_1.method3076();
									local73 = Static187.aClass3_Sub11_Sub1_1.method3115();
									Static427.aClass56_1.method1736(local396, local73);
									Static230.aClass272_135 = null;
									return true;
								} else if (Static230.aClass272_135 == Static234.aClass272_137) {
									if (Static419.method7098(Static246.anInt4542)) {
										Static208.anInt4195 = (int) ((float) Static187.aClass3_Sub11_Sub1_1.method3109() * 2.5F);
									} else {
										Static208.anInt4195 = Static187.aClass3_Sub11_Sub1_1.method3109() * 30;
									}
									Static230.aClass272_135 = null;
									Static247.anInt4548 = Static251.anInt4580;
									return true;
								} else if (Static67.aClass272_44 == Static230.aClass272_135) {
									local396 = Static187.aClass3_Sub11_Sub1_1.method3139();
									if (local396 == 65535) {
										local396 = -1;
									}
									local73 = Static187.aClass3_Sub11_Sub1_1.method3139();
									local430 = Static187.aClass3_Sub11_Sub1_1.method3105();
									local434 = Static187.aClass3_Sub11_Sub1_1.method3105();
									if (Static310.method4848(local73)) {
										Static537.method3882(local430, local434, local396);
										@Pc(3745) Class339 local3745 = Static517.aClass145_1.method3798(local396);
										Static534.method7033(local3745.anInt8834, local3745.anInt8837, local3745.anInt8794, local434);
										Static216.method3775(local3745.anInt8842, local3745.anInt8801, local434, local3745.anInt8826);
									}
									Static230.aClass272_135 = null;
									return true;
								} else {
									@Pc(3818) long local3818;
									@Pc(3824) Class3_Sub10 local3824;
									@Pc(3833) Class3_Sub10 local3833;
									if (Static190.aClass272_113 == Static230.aClass272_135) {
										local396 = Static187.aClass3_Sub11_Sub1_1.method3115();
										if (local396 == 65535) {
											local396 = -1;
										}
										local73 = Static187.aClass3_Sub11_Sub1_1.method3139();
										local430 = Static187.aClass3_Sub11_Sub1_1.method3109();
										if (local430 == 65535) {
											local430 = -1;
										}
										local434 = Static187.aClass3_Sub11_Sub1_1.method3115();
										local1342 = Static187.aClass3_Sub11_Sub1_1.method3076();
										if (Static310.method4848(local434)) {
											for (local2314 = local396; local2314 <= local430; local2314++) {
												local3818 = ((long) local1342 << 32) + (long) local2314;
												local3824 = (Class3_Sub10) Static263.aClass310_17.method6601(local3818);
												if (local3824 != null) {
													local3833 = new Class3_Sub10(local3824.anInt730, local73);
													local3824.method7812();
												} else if (local2314 == -1) {
													local3833 = new Class3_Sub10(Static414.method5954(local1342).aClass3_Sub10_1.anInt730, local73);
												} else {
													local3833 = new Class3_Sub10(0, local73);
												}
												Static263.aClass310_17.method6603(local3833, local3818);
											}
										}
										Static230.aClass272_135 = null;
										return true;
									} else if (Static230.aClass272_135 == Static79.aClass272_50) {
										Static562.method7489(Static396.aClass187_15);
										Static230.aClass272_135 = null;
										return true;
									} else {
										@Pc(3927) long local3927;
										if (Static230.aClass272_135 == Static312.aClass272_170) {
											local223 = Static187.aClass3_Sub11_Sub1_1.method3118() == 1;
											local227 = Static187.aClass3_Sub11_Sub1_1.method3133();
											local229 = local227;
											if (local223) {
												local229 = Static187.aClass3_Sub11_Sub1_1.method3133();
											}
											local240 = Static187.aClass3_Sub11_Sub1_1.method3128();
											local245 = Static187.aClass3_Sub11_Sub1_1.method3109();
											local3927 = Static187.aClass3_Sub11_Sub1_1.method3126();
											local664 = Static187.aClass3_Sub11_Sub1_1.method3118();
											local1620 = Static187.aClass3_Sub11_Sub1_1.method3109();
											@Pc(3942) long local3942 = (local245 << 32) + local3927;
											@Pc(3944) boolean local3944 = false;
											@Pc(3946) int local3946 = 0;
											while (true) {
												if (local3946 >= 100) {
													if (local664 <= 1 && Static381.method5639(local229)) {
														local3944 = true;
													}
													break;
												}
												if (local3942 == Static548.aLongArray15[local3946]) {
													local3944 = true;
													break;
												}
												local3946++;
											}
											if (!local3944 && Static239.anInt4498 == 0) {
												Static548.aLongArray15[Static91.anInt2275] = local3942;
												Static91.anInt2275 = (Static91.anInt2275 + 1) % 100;
												@Pc(3998) String local3998 = Static459.aClass290_1.method6377(local1620).method7462(Static187.aClass3_Sub11_Sub1_1);
												if (local664 == 2) {
													Static574.method7621("<img=1>" + local229, local1620, "<img=1>" + local227, local227, 0, local3998, 20, Static454.method6307(local240));
												} else if (local664 == 1) {
													Static574.method7621("<img=0>" + local229, local1620, "<img=0>" + local227, local227, 0, local3998, 20, Static454.method6307(local240));
												} else {
													Static574.method7621(local229, local1620, local227, local227, 0, local3998, 20, Static454.method6307(local240));
												}
											}
											Static230.aClass272_135 = null;
											return true;
										} else if (Static230.aClass272_135 == Static500.aClass272_244) {
											local396 = Static187.aClass3_Sub11_Sub1_1.method3116();
											local73 = Static187.aClass3_Sub11_Sub1_1.method3109();
											if (Static310.method4848(local73)) {
												if (local396 == -1) {
													Static471.anInt7695 = -1;
													Static205.anInt4130 = -1;
												} else {
													local430 = local396 >> 14 & 0x3FFF;
													local434 = local396 & 0x3FFF;
													local430 -= Static529.anInt8344;
													if (local430 < 0) {
														local430 = 0;
													} else if (local430 >= Static400.anInt6818) {
														local430 = Static400.anInt6818;
													}
													local434 -= Static463.anInt7588;
													Static471.anInt7695 = (local430 << 9) + 256;
													if (local434 < 0) {
														local434 = 0;
													} else if (local434 >= Static271.anInt5050) {
														local434 = Static271.anInt5050;
													}
													Static205.anInt4130 = (local434 << 9) + 256;
												}
											}
											Static230.aClass272_135 = null;
											return true;
										} else if (Static230.aClass272_135 == Static596.aClass272_274) {
											local396 = Static187.aClass3_Sub11_Sub1_1.method3116();
											local73 = Static187.aClass3_Sub11_Sub1_1.method3109();
											local430 = Static187.aClass3_Sub11_Sub1_1.method3109();
											if (Static310.method4848(local73)) {
												Static568.method7553(local430, local396);
											}
											Static230.aClass272_135 = null;
											return true;
										} else if (Static102.aClass272_34 == Static230.aClass272_135) {
											Static562.method7489(Static373.aClass187_14);
											Static230.aClass272_135 = null;
											return true;
										} else if (Static230.aClass272_135 == Static353.aClass272_188) {
											local396 = Static187.aClass3_Sub11_Sub1_1.method3115();
											local73 = Static187.aClass3_Sub11_Sub1_1.method3139();
											local430 = Static187.aClass3_Sub11_Sub1_1.method3076();
											local434 = Static187.aClass3_Sub11_Sub1_1.method3116();
											if (Static310.method4848(local73)) {
												Static357.method5351(local396, 5, local434, local430);
											}
											Static230.aClass272_135 = null;
											return true;
										} else if (Static232.aClass272_136 == Static230.aClass272_135) {
											local396 = Static187.aClass3_Sub11_Sub1_1.method3139();
											local73 = Static187.aClass3_Sub11_Sub1_1.method3117();
											local430 = Static187.aClass3_Sub11_Sub1_1.method3117();
											local434 = Static187.aClass3_Sub11_Sub1_1.method3105();
											local1342 = Static187.aClass3_Sub11_Sub1_1.method3115();
											if (Static310.method4848(local1342)) {
												Static534.method7033(local430, local73, local396, local434);
											}
											Static230.aClass272_135 = null;
											return true;
										} else if (Static230.aClass272_135 == Static463.aClass272_233) {
											local396 = Static187.aClass3_Sub11_Sub1_1.method3109();
											if (local396 == 65535) {
												local396 = -1;
											}
											local73 = Static187.aClass3_Sub11_Sub1_1.method3118();
											local430 = Static187.aClass3_Sub11_Sub1_1.method3109();
											local434 = Static187.aClass3_Sub11_Sub1_1.method3118();
											Static544.method7134(local434, local430, false, local73, local396);
											Static230.aClass272_135 = null;
											return true;
										} else if (Static230.aClass272_135 == Static279.aClass272_156) {
											local396 = Static187.aClass3_Sub11_Sub1_1.method3109();
											if (Static310.method4848(local396)) {
												Static501.method6761();
											}
											Static230.aClass272_135 = null;
											return true;
										} else if (Static42.aClass272_35 == Static230.aClass272_135) {
											Static412.method5935(Static187.aClass3_Sub11_Sub1_1, Static409.aClass221_6, Static178.anInt8249);
											Static230.aClass272_135 = null;
											return true;
										} else if (Static230.aClass272_135 == Static374.aClass272_202) {
											Static204.method3661(Static187.aClass3_Sub11_Sub1_1, Static178.anInt8249);
											Static230.aClass272_135 = null;
											return true;
										} else if (Static230.aClass272_135 == Static203.aClass272_123) {
											local396 = Static187.aClass3_Sub11_Sub1_1.method3109();
											local73 = Static187.aClass3_Sub11_Sub1_1.method3118();
											local526 = (local73 & 0x1) == 1;
											Static71.method1656(local526, local396);
											local434 = Static187.aClass3_Sub11_Sub1_1.method3109();
											for (local1342 = 0; local1342 < local434; local1342++) {
												local2314 = Static187.aClass3_Sub11_Sub1_1.method3109();
												local563 = Static187.aClass3_Sub11_Sub1_1.method3118();
												if (local563 == 255) {
													local563 = Static187.aClass3_Sub11_Sub1_1.method3076();
												}
												Static304.method4778(local2314 - 1, local1342, local563, local396, local526);
											}
											Static30.anIntArray73[Static66.anInt1793++ & 0x1F] = local396;
											Static230.aClass272_135 = null;
											return true;
										} else if (Static230.aClass272_135 == Static265.aClass272_153) {
											Static556.anInt8901 = Static187.aClass3_Sub11_Sub1_1.method3107();
											Static247.anInt4548 = Static251.anInt4580;
											Static230.aClass272_135 = null;
											return true;
										} else if (Static524.aClass272_254 == Static230.aClass272_135) {
											local396 = Static187.aClass3_Sub11_Sub1_1.method3117();
											local73 = Static187.aClass3_Sub11_Sub1_1.method3109();
											local229 = Static187.aClass3_Sub11_Sub1_1.method3133();
											if (Static310.method4848(local73)) {
												Static83.method1824(local396, local229);
											}
											Static230.aClass272_135 = null;
											return true;
										} else if (Static568.aClass272_267 == Static230.aClass272_135) {
											local396 = Static187.aClass3_Sub11_Sub1_1.method3109();
											local227 = Static187.aClass3_Sub11_Sub1_1.method3133();
											@Pc(4490) Object[] local4490 = new Object[local227.length() + 1];
											for (local434 = local227.length() - 1; local434 >= 0; local434--) {
												if (local227.charAt(local434) == 's') {
													local4490[local434 + 1] = Static187.aClass3_Sub11_Sub1_1.method3133();
												} else {
													local4490[local434 + 1] = Integer.valueOf(Static187.aClass3_Sub11_Sub1_1.method3116());
												}
											}
											local4490[0] = Integer.valueOf(Static187.aClass3_Sub11_Sub1_1.method3116());
											if (Static310.method4848(local396)) {
												@Pc(4543) Class3_Sub45 local4543 = new Class3_Sub45();
												local4543.anObjectArray33 = local4490;
												Static149.method2778(local4543);
											}
											Static230.aClass272_135 = null;
											return true;
										} else {
											@Pc(4727) boolean local4727;
											if (Static230.aClass272_135 == Static22.aClass272_19) {
												Static78.anInt3020 = Static251.anInt4580;
												if (Static178.anInt8249 == 0) {
													Static230.aClass272_135 = null;
													Static89.aString30 = null;
													Static548.aString121 = null;
													Static583.anInt9304 = 0;
													Static419.aClass325Array5 = null;
													return true;
												}
												Static89.aString30 = Static187.aClass3_Sub11_Sub1_1.method3133();
												local223 = Static187.aClass3_Sub11_Sub1_1.method3118() == 1;
												if (local223) {
													Static187.aClass3_Sub11_Sub1_1.method3133();
												}
												@Pc(4596) long local4596 = Static187.aClass3_Sub11_Sub1_1.method3128();
												Static548.aString121 = Static180.method3145(local4596);
												Static436.aByte100 = Static187.aClass3_Sub11_Sub1_1.method3096();
												local434 = Static187.aClass3_Sub11_Sub1_1.method3118();
												if (local434 == 255) {
													Static230.aClass272_135 = null;
													return true;
												}
												Static583.anInt9304 = local434;
												@Pc(4620) Class325[] local4620 = new Class325[100];
												for (local2314 = 0; local2314 < Static583.anInt9304; local2314++) {
													local4620[local2314] = new Class325();
													local4620[local2314].aString113 = Static187.aClass3_Sub11_Sub1_1.method3133();
													local223 = Static187.aClass3_Sub11_Sub1_1.method3118() == 1;
													if (local223) {
														local4620[local2314].aString111 = Static187.aClass3_Sub11_Sub1_1.method3133();
													} else {
														local4620[local2314].aString111 = local4620[local2314].aString113;
													}
													local4620[local2314].aString112 = Static575.method7623(local4620[local2314].aString111);
													local4620[local2314].anInt8212 = Static187.aClass3_Sub11_Sub1_1.method3109();
													local4620[local2314].aByte118 = Static187.aClass3_Sub11_Sub1_1.method3096();
													local4620[local2314].aString114 = Static187.aClass3_Sub11_Sub1_1.method3133();
													if (local4620[local2314].aString111.equals(Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aString94)) {
														Static253.aByte59 = local4620[local2314].aByte118;
													}
												}
												local253 = Static583.anInt9304;
												while (local253 > 0) {
													local4727 = true;
													local253--;
													for (local664 = 0; local664 < local253; local664++) {
														if (local4620[local664].aString112.compareTo(local4620[local664 + 1].aString112) > 0) {
															local629 = local4620[local664];
															local4620[local664] = local4620[local664 + 1];
															local4727 = false;
															local4620[local664 + 1] = local629;
														}
													}
													if (local4727) {
														break;
													}
												}
												Static419.aClass325Array5 = local4620;
												Static230.aClass272_135 = null;
												return true;
											} else if (Static92.aClass272_59 == Static230.aClass272_135) {
												Static133.method2592(Static187.aClass3_Sub11_Sub1_1.method3133());
												Static230.aClass272_135 = null;
												return true;
											} else if (Static488.aClass272_239 == Static230.aClass272_135) {
												local396 = Static187.aClass3_Sub11_Sub1_1.method3097();
												local73 = Static187.aClass3_Sub11_Sub1_1.method3139();
												local430 = Static187.aClass3_Sub11_Sub1_1.method3074();
												if (Static310.method4848(local73)) {
													Static523.method7826(local396, local430);
												}
												Static230.aClass272_135 = null;
												return true;
											} else if (Static162.aClass272_96 == Static230.aClass272_135) {
												local490 = Static187.aClass3_Sub11_Sub1_1.method3133();
												local73 = Static187.aClass3_Sub11_Sub1_1.method3139();
												if (local73 == 65535) {
													local73 = -1;
												}
												local430 = Static187.aClass3_Sub11_Sub1_1.method3120();
												local434 = Static187.aClass3_Sub11_Sub1_1.method3118();
												if (local430 >= 1 && local430 <= 8) {
													if (local490.equalsIgnoreCase("null")) {
														local490 = null;
													}
													Static431.aStringArray22[local430 - 1] = local490;
													Static169.anIntArray286[local430 - 1] = local73;
													Static9.aBooleanArray1[local430 - 1] = local434 == 0;
												}
												Static230.aClass272_135 = null;
												return true;
											} else if (Static230.aClass272_135 == Static210.aClass272_126) {
												local396 = Static187.aClass3_Sub11_Sub1_1.method3117();
												local73 = Static187.aClass3_Sub11_Sub1_1.method3099();
												@Pc(4901) int[] local4901 = new int[4];
												for (local434 = 0; local434 < 4; local434++) {
													local4901[local434] = Static187.aClass3_Sub11_Sub1_1.method3139();
												}
												@Pc(4922) Class3_Sub39 local4922 = (Class3_Sub39) Static243.aClass310_16.method6601((long) local396);
												if (local4922 != null) {
													Static369.method5494(local4922.aClass9_Sub1_Sub1_Sub2_Sub1_2, local4901, local73);
												}
												Static230.aClass272_135 = null;
												return true;
											} else if (Static341.aClass272_185 == Static230.aClass272_135) {
												for (local396 = 0; local396 < Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2.length; local396++) {
													if (Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[local396] != null) {
														Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[local396].anIntArray515 = null;
														Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[local396].anInt6453 = -1;
													}
												}
												for (local73 = 0; local73 < Static568.anInt9131; local73++) {
													Static341.aClass3_Sub39Array1[local73].aClass9_Sub1_Sub1_Sub2_Sub1_2.anIntArray515 = null;
													Static341.aClass3_Sub39Array1[local73].aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt6453 = -1;
												}
												Static230.aClass272_135 = null;
												return true;
											} else if (Static558.aClass272_263 == Static230.aClass272_135) {
												local396 = Static187.aClass3_Sub11_Sub1_1.method3139();
												local73 = Static187.aClass3_Sub11_Sub1_1.method3117();
												if (local73 == 65535) {
													local73 = -1;
												}
												local430 = Static187.aClass3_Sub11_Sub1_1.method3117();
												if (local430 == 65535) {
													local430 = -1;
												}
												local434 = Static187.aClass3_Sub11_Sub1_1.method3074();
												local1342 = Static187.aClass3_Sub11_Sub1_1.method3105();
												if (Static310.method4848(local396)) {
													for (local2314 = local430; local2314 <= local73; local2314++) {
														local3818 = (long) local2314 + ((long) local1342 << 32);
														local3824 = (Class3_Sub10) Static263.aClass310_17.method6601(local3818);
														if (local3824 != null) {
															local3833 = new Class3_Sub10(local434, local3824.anInt723);
															local3824.method7812();
														} else if (local2314 == -1) {
															local3833 = new Class3_Sub10(local434, Static414.method5954(local1342).aClass3_Sub10_1.anInt723);
														} else {
															local3833 = new Class3_Sub10(local434, -1);
														}
														Static263.aClass310_17.method6603(local3833, local3818);
													}
												}
												Static230.aClass272_135 = null;
												return true;
											} else if (Static595.aClass272_273 == Static230.aClass272_135) {
												local396 = Static187.aClass3_Sub11_Sub1_1.method3109();
												if (Static310.method4848(local396)) {
													Static548.method7334();
												}
												Static230.aClass272_135 = null;
												return true;
											} else {
												@Pc(5119) byte local5119;
												if (Static230.aClass272_135 == Static59.aClass272_158) {
													local5119 = Static187.aClass3_Sub11_Sub1_1.method3078();
													local73 = Static187.aClass3_Sub11_Sub1_1.method3115();
													local430 = Static187.aClass3_Sub11_Sub1_1.method3109();
													if (Static310.method4848(local73)) {
														Static568.method7553(local430, local5119);
													}
													Static230.aClass272_135 = null;
													return true;
												} else if (Static83.aClass272_52 == Static230.aClass272_135) {
													local5119 = Static187.aClass3_Sub11_Sub1_1.method3078();
													local73 = Static187.aClass3_Sub11_Sub1_1.method3115();
													Static427.aClass56_1.method1731(local5119, local73);
													Static230.aClass272_135 = null;
													return true;
												} else if (Static230.aClass272_135 == Static209.aClass272_250) {
													local396 = Static187.aClass3_Sub11_Sub1_1.method3139();
													local73 = Static187.aClass3_Sub11_Sub1_1.method3115();
													local430 = Static187.aClass3_Sub11_Sub1_1.method3074();
													if (Static310.method4848(local396)) {
														Static67.method1528(local430, local73);
													}
													Static230.aClass272_135 = null;
													return true;
												} else if (Static230.aClass272_135 == Static391.aClass272_210) {
													local396 = Static187.aClass3_Sub11_Sub1_1.method3074();
													local73 = Static187.aClass3_Sub11_Sub1_1.method3115();
													local430 = Static187.aClass3_Sub11_Sub1_1.method3076();
													if (Static310.method4848(local73)) {
														@Pc(5212) Class3_Sub28 local5212 = (Class3_Sub28) Static227.aClass310_15.method6601((long) local430);
														local2839 = (Class3_Sub28) Static227.aClass310_15.method6601((long) local396);
														if (local2839 != null) {
															Static423.method6029(false, local5212 == null || local2839.anInt5333 != local5212.anInt5333, local2839);
														}
														if (local5212 != null) {
															local5212.method7812();
															Static227.aClass310_15.method6603(local5212, (long) local396);
														}
														@Pc(5250) Class203 local5250 = Static414.method5954(local430);
														if (local5250 != null) {
															Static138.method2656(local5250);
														}
														local5250 = Static414.method5954(local396);
														if (local5250 != null) {
															Static138.method2656(local5250);
															Static480.method6572(true, local5250);
														}
														if (Static307.anInt5578 != -1) {
															Static107.method5739(Static307.anInt5578, 1);
														}
													}
													Static230.aClass272_135 = null;
													return true;
												} else if (Static230.aClass272_135 == Static517.aClass272_251) {
													local396 = Static187.aClass3_Sub11_Sub1_1.method3076();
													local73 = Static187.aClass3_Sub11_Sub1_1.method3139();
													local430 = Static187.aClass3_Sub11_Sub1_1.method3109();
													if (Static310.method4848(local73)) {
														Static65.method1516(local396, local430);
													}
													Static230.aClass272_135 = null;
													return true;
												} else if (Static230.aClass272_135 == Static45.aClass272_37) {
													Static185.aString46 = Static178.anInt8249 <= 2 ? Static48.aClass33_28.method797(Static131.anInt2839) : Static187.aClass3_Sub11_Sub1_1.method3133();
													Static332.anInt5938 = Static178.anInt8249 > 0 ? Static187.aClass3_Sub11_Sub1_1.method3109() : -1;
													if (Static332.anInt5938 == 65535) {
														Static332.anInt5938 = -1;
													}
													Static230.aClass272_135 = null;
													return true;
												} else if (Static230.aClass272_135 == Static424.aClass272_222) {
													local396 = Static187.aClass3_Sub11_Sub1_1.method3109();
													local73 = Static187.aClass3_Sub11_Sub1_1.method3118();
													local430 = Static187.aClass3_Sub11_Sub1_1.method3118();
													local434 = Static187.aClass3_Sub11_Sub1_1.method3109() << 2;
													local1342 = Static187.aClass3_Sub11_Sub1_1.method3118();
													local2314 = Static187.aClass3_Sub11_Sub1_1.method3118();
													if (Static310.method4848(local396)) {
														Static21.method441(local434, local1342, local2314, local73, true, local430);
													}
													Static230.aClass272_135 = null;
													return true;
												} else if (Static381.aClass272_207 == Static230.aClass272_135) {
													Static82.anInt2184 = Static187.aClass3_Sub11_Sub1_1.method3118();
													for (local396 = 0; local396 < Static82.anInt2184; local396++) {
														Static145.aStringArray14[local396] = Static187.aClass3_Sub11_Sub1_1.method3133();
														Static552.aStringArray46[local396] = Static187.aClass3_Sub11_Sub1_1.method3133();
														if (Static552.aStringArray46[local396].equals("")) {
															Static552.aStringArray46[local396] = Static145.aStringArray14[local396];
														}
														Static553.aStringArray47[local396] = Static187.aClass3_Sub11_Sub1_1.method3133();
														Static40.aStringArray32[local396] = Static187.aClass3_Sub11_Sub1_1.method3133();
														if (Static40.aStringArray32[local396].equals("")) {
															Static40.aStringArray32[local396] = Static553.aStringArray47[local396];
														}
														Static143.aBooleanArray32[local396] = false;
													}
													Static417.anInt7008 = Static251.anInt4580;
													Static230.aClass272_135 = null;
													return true;
												} else if (Static230.aClass272_135 == Static358.aClass272_270) {
													while (Static187.aClass3_Sub11_Sub1_1.anInt3520 < Static178.anInt8249) {
														local223 = Static187.aClass3_Sub11_Sub1_1.method3118() == 1;
														local227 = Static187.aClass3_Sub11_Sub1_1.method3133();
														local229 = Static187.aClass3_Sub11_Sub1_1.method3133();
														local434 = Static187.aClass3_Sub11_Sub1_1.method3109();
														local1342 = Static187.aClass3_Sub11_Sub1_1.method3118();
														local814 = "";
														local4727 = false;
														if (local434 > 0) {
															local814 = Static187.aClass3_Sub11_Sub1_1.method3133();
															local4727 = Static187.aClass3_Sub11_Sub1_1.method3118() == 1;
														}
														for (local249 = 0; local249 < Static590.anInt9377; local249++) {
															if (local223) {
																if (local229.equals(Static595.aStringArray49[local249])) {
																	Static595.aStringArray49[local249] = local227;
																	Static588.aStringArray13[local249] = local229;
																	local227 = null;
																	break;
																}
															} else if (local227.equals(Static595.aStringArray49[local249])) {
																if (local434 != Static334.anIntArray461[local249]) {
																	local1461 = true;
																	for (@Pc(5554) Class9_Sub8_Sub1 local5554 = (Class9_Sub8_Sub1) Static124.aClass309_8.method6590(); local5554 != null; local5554 = (Class9_Sub8_Sub1) Static124.aClass309_8.method6594()) {
																		if (local5554.aString60.equals(local227)) {
																			if (local434 != 0 && local5554.aShort57 == 0) {
																				local1461 = false;
																				local5554.method7465();
																			} else if (local434 == 0 && local5554.aShort57 != 0) {
																				local5554.method7465();
																				local1461 = false;
																			}
																		}
																	}
																	if (local1461) {
																		Static124.aClass309_8.method6595(new Class9_Sub8_Sub1(local227, local434));
																	}
																	Static334.anIntArray461[local249] = local434;
																}
																Static588.aStringArray13[local249] = local229;
																Static339.aStringArray36[local249] = local814;
																Static394.anIntArray540[local249] = local1342;
																Static265.aBooleanArray18[local249] = local4727;
																local227 = null;
																break;
															}
														}
														if (local227 != null && Static590.anInt9377 < 200) {
															Static595.aStringArray49[Static590.anInt9377] = local227;
															Static588.aStringArray13[Static590.anInt9377] = local229;
															Static334.anIntArray461[Static590.anInt9377] = local434;
															Static339.aStringArray36[Static590.anInt9377] = local814;
															Static394.anIntArray540[Static590.anInt9377] = local1342;
															Static265.aBooleanArray18[Static590.anInt9377] = local4727;
															Static590.anInt9377++;
														}
													}
													Static417.anInt7008 = Static251.anInt4580;
													Static355.anInt6147 = 2;
													local73 = Static590.anInt9377;
													while (local73 > 0) {
														local73--;
														local223 = true;
														for (local430 = 0; local430 < local73; local430++) {
															if (Static583.aClass65_5.anInt2279 != Static334.anIntArray461[local430] && Static334.anIntArray461[local430 + 1] == Static583.aClass65_5.anInt2279 || Static334.anIntArray461[local430] == 0 && Static334.anIntArray461[local430 + 1] != 0) {
																local434 = Static334.anIntArray461[local430];
																Static334.anIntArray461[local430] = Static334.anIntArray461[local430 + 1];
																Static334.anIntArray461[local430 + 1] = local434;
																local784 = Static339.aStringArray36[local430];
																Static339.aStringArray36[local430] = Static339.aStringArray36[local430 + 1];
																Static339.aStringArray36[local430 + 1] = local784;
																local814 = Static595.aStringArray49[local430];
																Static595.aStringArray49[local430] = Static595.aStringArray49[local430 + 1];
																Static595.aStringArray49[local430 + 1] = local814;
																local625 = Static588.aStringArray13[local430];
																Static588.aStringArray13[local430] = Static588.aStringArray13[local430 + 1];
																Static588.aStringArray13[local430 + 1] = local625;
																local249 = Static394.anIntArray540[local430];
																Static394.anIntArray540[local430] = Static394.anIntArray540[local430 + 1];
																Static394.anIntArray540[local430 + 1] = local249;
																local1461 = Static265.aBooleanArray18[local430];
																Static265.aBooleanArray18[local430] = Static265.aBooleanArray18[local430 + 1];
																Static265.aBooleanArray18[local430 + 1] = local1461;
																local223 = false;
															}
														}
														if (local223) {
															break;
														}
													}
													Static230.aClass272_135 = null;
													return true;
												} else if (Static230.aClass272_135 == Static71.aClass272_47) {
													local396 = Static187.aClass3_Sub11_Sub1_1.method3109();
													local73 = Static187.aClass3_Sub11_Sub1_1.method3118();
													local526 = (local73 & 0x1) == 1;
													while (Static178.anInt8249 > Static187.aClass3_Sub11_Sub1_1.anInt3520) {
														local434 = Static187.aClass3_Sub11_Sub1_1.method3138();
														local1342 = Static187.aClass3_Sub11_Sub1_1.method3109();
														local2314 = 0;
														if (local1342 != 0) {
															local2314 = Static187.aClass3_Sub11_Sub1_1.method3118();
															if (local2314 == 255) {
																local2314 = Static187.aClass3_Sub11_Sub1_1.method3116();
															}
														}
														Static304.method4778(local1342 - 1, local434, local2314, local396, local526);
													}
													Static30.anIntArray73[Static66.anInt1793++ & 0x1F] = local396;
													Static230.aClass272_135 = null;
													return true;
												} else if (Static188.aClass272_110 == Static230.aClass272_135) {
													local396 = Static187.aClass3_Sub11_Sub1_1.method3108();
													local73 = Static187.aClass3_Sub11_Sub1_1.method3097();
													local430 = Static187.aClass3_Sub11_Sub1_1.method3074();
													local434 = Static187.aClass3_Sub11_Sub1_1.method3139();
													if (Static310.method4848(local434)) {
														Static595.method7810(local73, local396, local430);
													}
													Static230.aClass272_135 = null;
													return true;
												} else if (Static230.aClass272_135 == Static413.aClass272_217) {
													local223 = Static187.aClass3_Sub11_Sub1_1.method3118() == 1;
													local227 = Static187.aClass3_Sub11_Sub1_1.method3133();
													local229 = local227;
													if (local223) {
														local229 = Static187.aClass3_Sub11_Sub1_1.method3133();
													}
													local240 = Static187.aClass3_Sub11_Sub1_1.method3128();
													local245 = Static187.aClass3_Sub11_Sub1_1.method3109();
													local3927 = Static187.aClass3_Sub11_Sub1_1.method3126();
													local664 = Static187.aClass3_Sub11_Sub1_1.method3118();
													@Pc(6018) long local6018 = local3927 + (local245 << 32);
													@Pc(6020) boolean local6020 = false;
													local1851 = 0;
													while (true) {
														if (local1851 >= 100) {
															if (local664 <= 1) {
																if (Static203.aBoolean318 && !Static491.aBoolean618 || Static426.aBoolean561) {
																	local6020 = true;
																} else if (Static381.method5639(local229)) {
																	local6020 = true;
																}
															}
															break;
														}
														if (local6018 == Static548.aLongArray15[local1851]) {
															local6020 = true;
															break;
														}
														local1851++;
													}
													if (!local6020 && Static239.anInt4498 == 0) {
														Static548.aLongArray15[Static91.anInt2275] = local6018;
														Static91.anInt2275 = (Static91.anInt2275 + 1) % 100;
														@Pc(6084) String local6084 = Static81.method1770(Static330.method5100(Static187.aClass3_Sub11_Sub1_1));
														if (local664 == 2 || local664 == 3) {
															Static574.method7621("<img=1>" + local229, -1, "<img=1>" + local227, local227, 0, local6084, 9, Static454.method6307(local240));
														} else if (local664 == 1) {
															Static574.method7621("<img=0>" + local229, -1, "<img=0>" + local227, local227, 0, local6084, 9, Static454.method6307(local240));
														} else {
															Static574.method7621(local229, -1, local227, local227, 0, local6084, 9, Static454.method6307(local240));
														}
													}
													Static230.aClass272_135 = null;
													return true;
												} else if (Static350.aClass272_246 == Static230.aClass272_135) {
													local223 = Static187.aClass3_Sub11_Sub1_1.method3118() == 1;
													local227 = Static187.aClass3_Sub11_Sub1_1.method3133();
													local229 = local227;
													if (local223) {
														local229 = Static187.aClass3_Sub11_Sub1_1.method3133();
													}
													local240 = Static187.aClass3_Sub11_Sub1_1.method3109();
													local245 = Static187.aClass3_Sub11_Sub1_1.method3126();
													local249 = Static187.aClass3_Sub11_Sub1_1.method3118();
													@Pc(6207) long local6207 = local245 + (local240 << 32);
													@Pc(6209) boolean local6209 = false;
													local1923 = 0;
													while (true) {
														if (local1923 >= 100) {
															if (local249 <= 1) {
																if (Static203.aBoolean318 && !Static491.aBoolean618 || Static426.aBoolean561) {
																	local6209 = true;
																} else if (Static381.method5639(local229)) {
																	local6209 = true;
																}
															}
															break;
														}
														if (Static548.aLongArray15[local1923] == local6207) {
															local6209 = true;
															break;
														}
														local1923++;
													}
													if (!local6209 && Static239.anInt4498 == 0) {
														Static548.aLongArray15[Static91.anInt2275] = local6207;
														Static91.anInt2275 = (Static91.anInt2275 + 1) % 100;
														@Pc(6270) String local6270 = Static81.method1770(Static330.method5100(Static187.aClass3_Sub11_Sub1_1));
														if (local249 == 2) {
															Static574.method7621("<img=1>" + local229, -1, "<img=1>" + local227, local227, 0, local6270, 7, null);
														} else if (local249 == 1) {
															Static574.method7621("<img=0>" + local229, -1, "<img=0>" + local227, local227, 0, local6270, 7, null);
														} else {
															Static574.method7621(local229, -1, local227, local227, 0, local6270, 3, null);
														}
													}
													Static230.aClass272_135 = null;
													return true;
												} else if (Static230.aClass272_135 == Static323.aClass272_271) {
													Static355.anInt6148 = Static187.aClass3_Sub11_Sub1_1.method3118();
													Static230.aClass272_135 = null;
													return true;
												} else if (Static230.aClass272_135 == Static308.aClass272_166) {
													Static347.anInt6098 = Static187.aClass3_Sub11_Sub1_1.method3110();
													Static67.anInt1795 = Static187.aClass3_Sub11_Sub1_1.method3120();
													Static230.aClass272_135 = null;
													return true;
												} else if (Static516.aClass272_249 == Static230.aClass272_135) {
													local396 = Static187.aClass3_Sub11_Sub1_1.method3116();
													local73 = Static187.aClass3_Sub11_Sub1_1.method3117();
													local430 = Static187.aClass3_Sub11_Sub1_1.method3117();
													if (local430 == 65535) {
														local430 = -1;
													}
													if (Static310.method4848(local73)) {
														Static29.method546(local430, local396);
													}
													Static230.aClass272_135 = null;
													return true;
												} else if (Static375.aClass272_203 == Static230.aClass272_135) {
													local396 = Static187.aClass3_Sub11_Sub1_1.method3115();
													local73 = Static187.aClass3_Sub11_Sub1_1.method3074();
													local430 = Static187.aClass3_Sub11_Sub1_1.method3117();
													if (local430 == 65535) {
														local430 = -1;
													}
													if (Static310.method4848(local396)) {
														Static357.method5351(local430, 1, local73, -1);
													}
													Static230.aClass272_135 = null;
													return true;
												} else if (Static505.aClass272_81 == Static230.aClass272_135) {
													local396 = Static187.aClass3_Sub11_Sub1_1.method3120();
													local73 = Static187.aClass3_Sub11_Sub1_1.method3117();
													local526 = (local396 & 0x1) == 1;
													Static21.method444(local73, local526);
													Static30.anIntArray73[Static66.anInt1793++ & 0x1F] = local73;
													Static230.aClass272_135 = null;
													return true;
												} else if (Static257.aClass272_151 == Static230.aClass272_135) {
													local396 = Static187.aClass3_Sub11_Sub1_1.method3116();
													local73 = Static187.aClass3_Sub11_Sub1_1.method3139();
													if (Static310.method4848(local73)) {
														Static357.method5351(-1, 3, local396, -1);
													}
													Static230.aClass272_135 = null;
													return true;
												} else if (Static230.aClass272_135 == Static44.aClass272_36) {
													local396 = Static187.aClass3_Sub11_Sub1_1.method3099();
													local73 = Static187.aClass3_Sub11_Sub1_1.method3118();
													if (local73 == 255) {
														local396 = -1;
														local73 = -1;
													}
													Static375.method5530(local396, local73);
													Static230.aClass272_135 = null;
													return true;
												} else if (Static230.aClass272_135 == Static577.aClass272_115) {
													local396 = Static187.aClass3_Sub11_Sub1_1.method3109();
													if (local396 == 65535) {
														local396 = -1;
													}
													local73 = Static187.aClass3_Sub11_Sub1_1.method3120();
													local430 = Static187.aClass3_Sub11_Sub1_1.method3120();
													Static118.method2470(local430, local73, local396);
													Static230.aClass272_135 = null;
													return true;
												} else if (Static230.aClass272_135 == Static316.aClass272_268) {
													local396 = Static187.aClass3_Sub11_Sub1_1.method3115();
													if (local396 == 65535) {
														local396 = -1;
													}
													local73 = Static187.aClass3_Sub11_Sub1_1.method3099();
													local430 = Static187.aClass3_Sub11_Sub1_1.method3129();
													Static92.method2052(local73, local396, local430);
													Static230.aClass272_135 = null;
													return true;
												} else if (Static230.aClass272_135 == Static129.aClass272_77) {
													Static230.aClass272_135 = null;
													Static355.anInt6147 = 1;
													Static417.anInt7008 = Static251.anInt4580;
													return true;
												} else if (Static230.aClass272_135 == Static357.aClass272_194) {
													Static2.method12();
													Static230.aClass272_135 = null;
													return false;
												} else if (Static108.aClass272_63 == Static230.aClass272_135) {
													Static562.method7489(Static394.aClass187_16);
													Static230.aClass272_135 = null;
													return true;
												} else if (Static510.aClass272_245 == Static230.aClass272_135) {
													local396 = Static187.aClass3_Sub11_Sub1_1.method3117();
													if (local396 == 65535) {
														local396 = -1;
													}
													local73 = Static187.aClass3_Sub11_Sub1_1.method3118();
													local430 = local73 >> 2;
													local434 = local73 & 0x3;
													local1342 = Static237.anIntArray361[local430];
													local2314 = Static187.aClass3_Sub11_Sub1_1.method3105();
													local563 = local2314 >> 28 & 0x3;
													local249 = local2314 >> 14 & 0x3FFF;
													local249 -= Static529.anInt8344;
													local253 = local2314 & 0x3FFF;
													@Pc(6667) int local6667 = local253 - Static463.anInt7588;
													Static277.method4436(local1342, local6667, local396, local249, local563, local430, local434);
													Static230.aClass272_135 = null;
													return true;
												} else if (Static182.aClass272_106 == Static230.aClass272_135) {
													Static71.method1659();
													Static230.aClass272_135 = null;
													return true;
												} else if (Static466.aClass272_265 == Static230.aClass272_135) {
													local396 = Static187.aClass3_Sub11_Sub1_1.method3109();
													local73 = Static187.aClass3_Sub11_Sub1_1.method3118();
													local430 = Static187.aClass3_Sub11_Sub1_1.method3118();
													local434 = Static187.aClass3_Sub11_Sub1_1.method3118();
													local1342 = Static187.aClass3_Sub11_Sub1_1.method3118();
													local2314 = Static187.aClass3_Sub11_Sub1_1.method3109();
													if (Static310.method4848(local396)) {
														Static508.aBooleanArray30[local73] = true;
														Static244.anIntArray365[local73] = local430;
														Static47.anIntArray92[local73] = local434;
														Static282.anIntArray385[local73] = local1342;
														Static461.anIntArray585[local73] = local2314;
													}
													Static230.aClass272_135 = null;
													return true;
												} else if (Static230.aClass272_135 == Static392.aClass272_211) {
													Static562.method7489(Static343.aClass187_11);
													Static230.aClass272_135 = null;
													return true;
												} else if (Static230.aClass272_135 == Static139.aClass272_86) {
													Static562.method7489(Static7.aClass187_1);
													Static230.aClass272_135 = null;
													return true;
												} else if (Static553.aClass272_262 == Static230.aClass272_135) {
													local396 = Static187.aClass3_Sub11_Sub1_1.method3109();
													if (local396 == 65535) {
														local396 = -1;
													}
													local73 = Static187.aClass3_Sub11_Sub1_1.method3118();
													local430 = Static187.aClass3_Sub11_Sub1_1.method3109();
													local434 = Static187.aClass3_Sub11_Sub1_1.method3118();
													Static544.method7134(local434, local430, true, local73, local396);
													Static230.aClass272_135 = null;
													return true;
												} else {
													Static379.method5607("T1 - " + (Static230.aClass272_135 == null ? -1 : Static230.aClass272_135.method6072()) + "," + (Static428.aClass272_46 == null ? -1 : Static428.aClass272_46.method6072()) + "," + (Static196.aClass272_118 == null ? -1 : Static196.aClass272_118.method6072()) + " - " + Static178.anInt8249, null);
													Static429.method6073(false);
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
