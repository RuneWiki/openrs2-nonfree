import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!sh", name = "D", descriptor = "Lclient!wd;")
	public static Class259 aClass259_1;

	@OriginalMember(owner = "client!sh", name = "E", descriptor = "Z")
	public static boolean aBoolean508;

	@OriginalMember(owner = "client!sh", name = "s", descriptor = "I")
	public static int anInt6148 = -1;

	@OriginalMember(owner = "client!sh", name = "C", descriptor = "Lclient!lp;")
	public static final Class150 aClass150_1 = new Class150();

	@OriginalMember(owner = "client!sh", name = "f", descriptor = "(I)V")
	public static void method4729() {
		Static402.aClass257_31.method5499();
		Static120.aClass257_20.method5499();
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!vg;I)Lclient!vg;")
	public static Class250 method4730(@OriginalArg(0) Class250 arg0) {
		@Pc(6) Class250 local6 = Static52.method814(arg0);
		if (local6 == null) {
			local6 = arg0.aClass250_14;
		}
		return local6;
	}

	@OriginalMember(owner = "client!sh", name = "g", descriptor = "(I)V")
	public static void method4731() {
		if (Static300.anInt5023 > 1) {
			Static376.anInt6288 = Static443.anInt6230;
			Static300.anInt5023--;
		}
		if (Static79.anInt1462 > 0) {
			Static79.anInt1462--;
		}
		if (Static13.aBoolean25) {
			Static13.aBoolean25 = false;
			Static362.method4701();
			return;
		}
		if (!Static263.aBoolean329) {
			Static35.method607();
		}
		for (@Pc(33) int local33 = 0; local33 < 100 && Static379.method4849(); local33++) {
		}
		if (Static98.anInt1721 != 30) {
			return;
		}
		Static110.method1536(Static75.aClass1_Sub11_Sub1_1, Static260.aClass137_219.method2806());
		if (Static52.aClass1_Sub10_1 == null) {
			if (Static15.aLong18 <= Static232.method3058()) {
				Static52.aClass1_Sub10_1 = Static30.aClass255_1.method5466(Static270.aString42);
			}
		} else if (Static52.aClass1_Sub10_1.anInt1094 != -1) {
			Static5.method94(Static17.aClass137_28);
			Static75.aClass1_Sub11_Sub1_1.method4448(Static52.aClass1_Sub10_1.anInt1094);
			Static52.aClass1_Sub10_1 = null;
			Static15.aLong18 = Static232.method3058() + 30000L;
		}
		@Pc(103) Class1_Sub29 local103 = (Class1_Sub29) Static416.aClass254_44.method5437();
		@Pc(121) int local121;
		@Pc(144) int local144;
		@Pc(162) int local162;
		@Pc(175) boolean local175;
		@Pc(224) int local224;
		@Pc(231) int local231;
		@Pc(242) int local242;
		if (local103 != null || Static232.method3058() - 2000L > Static190.aLong96) {
			@Pc(118) boolean local118 = false;
			local121 = Static75.aClass1_Sub11_Sub1_1.anInt5766;
			for (@Pc(126) Class1_Sub29 local126 = (Class1_Sub29) Static428.aClass254_46.method5437(); local126 != null && Static75.aClass1_Sub11_Sub1_1.anInt5766 - local121 < 240; local126 = (Class1_Sub29) Static428.aClass254_46.method5433()) {
				local126.method5617();
				local144 = local126.method3484();
				if (local144 < 0) {
					local144 = 0;
				} else if (local144 > 65534) {
					local144 = 65534;
				}
				local162 = local126.method3481();
				if (local162 < 0) {
					local162 = 0;
				} else if (local162 > 65534) {
					local162 = 65534;
				}
				local175 = false;
				if (local126.method3484() == -1 && local126.method3481() == -1) {
					local175 = true;
					local144 = -1;
					local162 = -1;
				}
				if (Static328.anInt5387 != local162 || Static448.anInt6659 != local144) {
					if (!local118) {
						Static5.method94(Static269.aClass137_175);
						Static75.aClass1_Sub11_Sub1_1.method4445(0);
						local121 = Static75.aClass1_Sub11_Sub1_1.anInt5766;
						local118 = true;
					}
					local224 = local162 - Static328.anInt5387;
					Static328.anInt5387 = local162;
					local231 = local144 - Static448.anInt6659;
					Static448.anInt6659 = local144;
					local242 = (int) ((local126.method3482() - Static190.aLong96) / 20L);
					if (local242 < 8 && local224 >= -32 && local224 <= 31 && local231 >= -32 && local231 <= 31) {
						local224 += 32;
						local231 += 32;
						Static75.aClass1_Sub11_Sub1_1.method4448(local231 + (local224 << 6) + (local242 << 12));
					} else if (local242 < 32 && local224 >= -128 && local224 <= 127 && local231 >= -128 && local231 <= 127) {
						Static75.aClass1_Sub11_Sub1_1.method4445(local242 + 128);
						local231 += 128;
						local224 += 128;
						Static75.aClass1_Sub11_Sub1_1.method4448((local224 << 8) + local231);
					} else if (local242 >= 32) {
						Static75.aClass1_Sub11_Sub1_1.method4448(local242 + 57344);
						if (local175) {
							Static75.aClass1_Sub11_Sub1_1.method4450(Integer.MIN_VALUE);
						} else {
							Static75.aClass1_Sub11_Sub1_1.method4450(local162 | local144 << 16);
						}
					} else {
						Static75.aClass1_Sub11_Sub1_1.method4445(local242 + 192);
						if (local175) {
							Static75.aClass1_Sub11_Sub1_1.method4450(Integer.MIN_VALUE);
						} else {
							Static75.aClass1_Sub11_Sub1_1.method4450(local162 | local144 << 16);
						}
					}
					Static190.aLong96 = local126.method3482();
				}
			}
			if (local118) {
				Static75.aClass1_Sub11_Sub1_1.method4478(Static75.aClass1_Sub11_Sub1_1.anInt5766 - local121);
			}
		}
		@Pc(429) int local429;
		@Pc(473) int local473;
		if (local103 != null) {
			@Pc(413) long local413 = (local103.method3482() - Static3.aLong222) / 50L;
			Static3.aLong222 = local103.method3482();
			if (local413 > 32767L) {
				local413 = 32767L;
			}
			local429 = local103.method3484();
			if (local429 < 0) {
				local429 = 0;
			} else if (local429 > 65535) {
				local429 = 65535;
			}
			local144 = local103.method3481();
			if (local144 < 0) {
				local144 = 0;
			} else if (local144 > 65535) {
				local144 = 65535;
			}
			@Pc(457) byte local457 = 0;
			if (local103.method3483() == 2) {
				local457 = 1;
			}
			local473 = (int) local413;
			Static5.method94(Static54.aClass137_52);
			Static75.aClass1_Sub11_Sub1_1.method4448(local473 | local457 << 15);
			Static75.aClass1_Sub11_Sub1_1.method4450(local429 << 16 | local144);
		}
		@Pc(498) int local498;
		if (Static36.anInt708 > 0) {
			local498 = 0;
			for (local121 = 0; local121 < Static36.anInt708; local121++) {
				if (Static266.aClass143Array3[local121].method2865()) {
					local498++;
				}
			}
			if (local498 > 0) {
				if (local498 > 75) {
					local498 = 75;
				}
				Static5.method94(Static359.aClass137_226);
				Static75.aClass1_Sub11_Sub1_1.method4445(local498 * 3);
				for (local429 = 0; local429 < Static36.anInt708; local429++) {
					@Pc(546) Class143 local546 = Static266.aClass143Array3[local429];
					if (local546.method2865()) {
						@Pc(559) long local559 = (local546.method2875() - Static398.aLong205) / 50L;
						if (local559 > 65535L) {
							local559 = 65535L;
						}
						Static398.aLong205 = local546.method2875();
						Static75.aClass1_Sub11_Sub1_1.method4445(local546.method2870());
						Static75.aClass1_Sub11_Sub1_1.method4448((int) local559);
					}
				}
			}
		}
		if (Static16.anInt3244 > 0) {
			Static16.anInt3244--;
		}
		if (Static390.aBoolean526 && Static16.anInt3244 <= 0) {
			Static390.aBoolean526 = false;
			Static16.anInt3244 = 20;
			Static5.method94(Static81.aClass137_73);
			Static75.aClass1_Sub11_Sub1_1.method4472((int) Static278.aFloat52 >> 3);
			Static75.aClass1_Sub11_Sub1_1.method4474((int) Static95.aFloat27 >> 3);
		}
		if (Static323.aBoolean426 && !Static5.aBoolean13) {
			Static5.aBoolean13 = true;
			Static5.method94(Static27.aClass137_56);
			Static75.aClass1_Sub11_Sub1_1.method4445(1);
		}
		if (!Static323.aBoolean426 && Static5.aBoolean13) {
			Static5.aBoolean13 = false;
			Static5.method94(Static27.aClass137_56);
			Static75.aClass1_Sub11_Sub1_1.method4445(0);
		}
		if (!Static253.aBoolean325) {
			Static5.method94(Static11.aClass137_19);
			Static75.aClass1_Sub11_Sub1_1.method4445(0);
			local498 = Static75.aClass1_Sub11_Sub1_1.anInt5766;
			@Pc(695) Class1_Sub11 local695 = Static336.aClass106_Sub1_1.method4431();
			Static75.aClass1_Sub11_Sub1_1.method4480(local695.aByteArray64, local695.anInt5766);
			Static75.aClass1_Sub11_Sub1_1.method4478(Static75.aClass1_Sub11_Sub1_1.anInt5766 - local498);
			Static253.aBoolean325 = true;
		}
		if (Static159.aClass82ArrayArrayArray2 != null) {
			if (Static100.anInt1781 == 2) {
				Static419.method5236();
			} else if (Static100.anInt1781 == 3) {
				Static297.method3890();
			}
		}
		if (Static426.aBoolean567) {
			Static426.aBoolean567 = false;
		} else {
			Static230.aFloat90 /= 2.0F;
		}
		if (Static404.aBoolean535) {
			Static404.aBoolean535 = false;
		} else {
			Static19.aFloat3 /= 2.0F;
		}
		Static230.method4877();
		if (Static98.anInt1721 != 30) {
			return;
		}
		Static347.method4406();
		Static287.method3736();
		Static228.method3019();
		Static86.method1265();
		Static65.anInt1145++;
		if (Static65.anInt1145 > 750) {
			Static362.method4701();
			return;
		}
		Static442.method5559();
		Static52.method803();
		Static265.method3398();
		for (local498 = aClass259_1.method5529(true); local498 != -1; local498 = aClass259_1.method5529(false)) {
			Static47.method710(local498);
			Static103.anIntArray84[Static53.anInt975++ & 0x1F] = local498;
		}
		@Pc(840) Class250 local840;
		for (@Pc(815) Class1_Sub3_Sub13 local815 = Static145.method1909(); local815 != null; local815 = Static145.method1909()) {
			local429 = local815.method3461();
			local144 = local815.method3460();
			if (local429 == 1) {
				Static156.anIntArray134[local144] = local815.anInt4301;
				Static447.aBoolean604 |= Static389.aBooleanArray12[local144];
				Static398.anIntArray400[Static387.anInt6408++ & 0x1F] = local144;
			} else if (local429 == 2) {
				Static260.aStringArray46[local144] = local815.aString43;
				Static128.anIntArray106[Static81.anInt1506++ & 0x1F] = local144;
			} else if (local429 == 3) {
				local840 = Static96.method1379(local144);
				if (!local815.aString43.equals(local840.aString62)) {
					local840.aString62 = local815.aString43;
					Static94.method1357(local840);
				}
			} else if (local429 == 4) {
				local840 = Static96.method1379(local144);
				local473 = local815.anInt4301;
				local224 = local815.anInt4297;
				local231 = local815.anInt4295;
				if (local473 != local840.anInt7024 || local840.anInt6981 != local224 || local840.anInt6982 != local231) {
					local840.anInt6982 = local231;
					local840.anInt7024 = local473;
					local840.anInt6981 = local224;
					Static94.method1357(local840);
				}
			} else if (local429 == 5) {
				local840 = Static96.method1379(local144);
				if (local840.anInt6960 != local815.anInt4301 || local815.anInt4301 == -1) {
					local840.anInt6960 = local815.anInt4301;
					local840.anInt6988 = 0;
					local840.anInt7023 = 0;
					local840.anInt6980 = 1;
					Static94.method1357(local840);
				}
			} else if (local429 == 6) {
				local162 = local815.anInt4301;
				local473 = local162 >> 10 & 0x1F;
				local224 = local162 >> 5 & 0x1F;
				local231 = local162 & 0x1F;
				local242 = (local231 << 3) + (local473 << 19) + (local224 << 11);
				@Pc(979) Class250 local979 = Static96.method1379(local144);
				if (local979.anInt7029 != local242) {
					local979.anInt7029 = local242;
					Static94.method1357(local979);
				}
			} else if (local429 == 7) {
				local840 = Static96.method1379(local144);
				local175 = local815.anInt4301 == 1;
				if (local175 != local840.aBoolean576) {
					local840.aBoolean576 = local175;
					Static94.method1357(local840);
				}
			} else if (local429 == 8) {
				local840 = Static96.method1379(local144);
				if (local840.anInt7006 != local815.anInt4301 || local815.anInt4297 != local840.anInt6961 || local815.anInt4295 != local840.anInt6972) {
					local840.anInt6961 = local815.anInt4297;
					local840.anInt7006 = local815.anInt4301;
					local840.anInt6972 = local815.anInt4295;
					if (local840.anInt7030 != -1) {
						if (local840.anInt7027 > 0) {
							local840.anInt6972 = local840.anInt6972 * 32 / local840.anInt7027;
						} else if (local840.anInt7022 > 0) {
							local840.anInt6972 = local840.anInt6972 * 32 / local840.anInt7022;
						}
					}
					Static94.method1357(local840);
				}
			} else if (local429 == 9) {
				local840 = Static96.method1379(local144);
				if (local840.anInt7030 != local815.anInt4301 || local840.anInt7046 != local815.anInt4297) {
					local840.anInt7030 = local815.anInt4301;
					local840.anInt7046 = local815.anInt4297;
					Static94.method1357(local840);
				}
			} else if (local429 == 10) {
				local840 = Static96.method1379(local144);
				if (local815.anInt4301 != local840.anInt7045 || local815.anInt4297 != local840.anInt6993 || local815.anInt4295 != local840.anInt7003) {
					local840.anInt7045 = local815.anInt4301;
					local840.anInt7003 = local815.anInt4295;
					local840.anInt6993 = local815.anInt4297;
					Static94.method1357(local840);
				}
			} else if (local429 == 11) {
				local840 = Static96.method1379(local144);
				local840.anInt7013 = local840.anInt7005 = local815.anInt4297;
				local840.aByte98 = 0;
				local840.aByte100 = 0;
				local840.anInt6964 = local840.anInt7040 = local815.anInt4301;
				Static94.method1357(local840);
			} else if (local429 == 12) {
				local840 = Static96.method1379(local144);
				local473 = local815.anInt4301;
				if (local840 != null && local840.anInt7009 == 0) {
					if (local840.anInt6998 - local840.anInt6997 < local473) {
						local473 = local840.anInt6998 - local840.anInt6997;
					}
					if (local473 < 0) {
						local473 = 0;
					}
					if (local473 != local840.anInt6966) {
						local840.anInt6966 = local473;
						Static94.method1357(local840);
					}
				}
			} else if (local429 == 14) {
				local840 = Static96.method1379(local144);
				local840.anInt7021 = local815.anInt4301;
			} else if (local429 == 15) {
				Static313.anInt5206 = local815.anInt4297;
				Static18.aBoolean29 = true;
				Static174.anInt2859 = local815.anInt4301;
			} else if (local429 == 16) {
				local840 = Static96.method1379(local144);
				local840.anInt6989 = local815.anInt4301;
			}
		}
		if (Static77.anInt1449 != 0) {
			Static426.anInt6943 += 20;
			if (Static426.anInt6943 >= 400) {
				Static77.anInt1449 = 0;
			}
		}
		Static239.anInt3853++;
		if (Static346.aClass250_11 != null) {
			Static344.anInt5626++;
			if (Static344.anInt5626 >= 15) {
				Static94.method1357(Static346.aClass250_11);
				Static346.aClass250_11 = null;
			}
		}
		Static70.aClass250_3 = null;
		Static289.aClass250_6 = null;
		Static118.aBoolean147 = false;
		Static245.aBoolean313 = false;
		Static177.method2367(-1, -1, null);
		Static244.method3191(-1, -1, null);
		if (!Static360.aBoolean498) {
			Static258.anInt4103 = -1;
		}
		Static195.method2587();
		Static443.anInt6230++;
		if (Static24.aBoolean38) {
			Static5.method94(Static196.aClass137_133);
			Static75.aClass1_Sub11_Sub1_1.method4492(Static189.anInt3034 << 28 | Static299.anInt5003 << 14 | Static97.anInt1705);
			Static24.aBoolean38 = false;
		}
		while (true) {
			@Pc(1434) Class1_Sub31 local1434;
			@Pc(1439) Class250 local1439;
			do {
				local1434 = (Class1_Sub31) Static40.aClass254_37.method5436();
				if (local1434 == null) {
					while (true) {
						do {
							local1434 = (Class1_Sub31) Static275.aClass254_27.method5436();
							if (local1434 == null) {
								while (true) {
									do {
										local1434 = (Class1_Sub31) Static6.aClass254_1.method5436();
										if (local1434 == null) {
											if (Static289.aClass250_6 == null) {
												Static316.anInt5247 = 0;
											}
											if (Static68.aClass250_2 != null) {
												Static287.method3734();
											}
											if (Static411.anInt6701 > 0 && Static321.aClass31_4.method3798(82) && Static321.aClass31_4.method3798(81) && Static230.anInt6340 != 0) {
												local429 = Static239.aClass20_Sub3_Sub3_Sub1_1.aByte89 - Static230.anInt6340;
												if (local429 < 0) {
													local429 = 0;
												} else if (local429 > 3) {
													local429 = 3;
												}
												Static414.method5164(local429, Static101.anInt6646 + Static239.aClass20_Sub3_Sub3_Sub1_1.anIntArray370[0], Static278.anInt4392 + Static239.aClass20_Sub3_Sub3_Sub1_1.anIntArray369[0]);
											}
											Static261.method3367();
											for (local429 = 0; local429 < 5; local429++) {
												@Pc(1643) int local1643 = Static65.anIntArray55[local429]++;
											}
											if (Static447.aBoolean604 && Static152.aLong81 < Static232.method3058() - 60000L) {
												Static329.method4206();
											}
											Static9.anInt195++;
											if (Static9.anInt195 > 500) {
												Static9.anInt195 = 0;
												local144 = (int) (Math.random() * 8.0D);
												if ((local144 & 0x4) == 4) {
													Static104.anInt7242 += Static360.anInt5993;
												}
												if ((local144 & 0x1) == 1) {
													Static399.anInt6510 += Static153.anInt2549;
												}
												if ((local144 & 0x2) == 2) {
													Static106.anInt1854 += Static223.anInt3637;
												}
											}
											if (Static399.anInt6510 < -50) {
												Static153.anInt2549 = 2;
											}
											if (Static399.anInt6510 > 50) {
												Static153.anInt2549 = -2;
											}
											if (Static106.anInt1854 < -55) {
												Static223.anInt3637 = 2;
											}
											if (Static106.anInt1854 > 55) {
												Static223.anInt3637 = -2;
											}
											if (Static104.anInt7242 < -40) {
												Static360.anInt5993 = 1;
											}
											Static264.anInt4204++;
											if (Static104.anInt7242 > 40) {
												Static360.anInt5993 = -1;
											}
											if (Static264.anInt4204 > 500) {
												Static264.anInt4204 = 0;
												local144 = (int) (Math.random() * 8.0D);
												if ((local144 & 0x2) == 2) {
													Static305.anInt5082 += Static440.anInt7308;
												}
												if ((local144 & 0x1) == 1) {
													Static171.anInt2824 += Static236.anInt3825;
												}
											}
											if (Static171.anInt2824 < -60) {
												Static236.anInt3825 = 2;
											}
											if (Static171.anInt2824 > 60) {
												Static236.anInt3825 = -2;
											}
											if (Static305.anInt5082 < -20) {
												Static440.anInt7308 = 1;
											}
											if (Static305.anInt5082 > 10) {
												Static440.anInt7308 = -1;
											}
											Static300.anInt5018++;
											if (Static300.anInt5018 > 50) {
												Static5.method94(Static145.aClass137_103);
											}
											if (Static189.aBoolean229) {
												Static161.method1533();
												Static189.aBoolean229 = false;
											}
											try {
												if (Static48.aClass3_2 != null && Static75.aClass1_Sub11_Sub1_1.anInt5766 > 0) {
													Static88.anInt1565 += Static75.aClass1_Sub11_Sub1_1.anInt5766;
													Static48.aClass3_2.method62(Static75.aClass1_Sub11_Sub1_1.anInt5766, Static75.aClass1_Sub11_Sub1_1.aByteArray64);
													Static300.anInt5018 = 0;
													Static75.aClass1_Sub11_Sub1_1.anInt5766 = 0;
													return;
												}
												return;
											} catch (@Pc(1850) IOException local1850) {
												Static362.method4701();
												return;
											}
										}
										local1439 = local1434.aClass250_8;
										if (local1439.anInt7038 < 0) {
											break;
										}
										local840 = Static96.method1379(local1439.anInt7002);
									} while (local840 == null || local840.aClass250Array2 == null || local840.aClass250Array2.length <= local1439.anInt7038 || local840.aClass250Array2[local1439.anInt7038] != local1439);
									Static267.method3402(local1434);
								}
							}
							local1439 = local1434.aClass250_8;
							if (local1439.anInt7038 < 0) {
								break;
							}
							local840 = Static96.method1379(local1439.anInt7002);
						} while (local840 == null || local840.aClass250Array2 == null || local1439.anInt7038 >= local840.aClass250Array2.length || local1439 != local840.aClass250Array2[local1439.anInt7038]);
						Static267.method3402(local1434);
					}
				}
				local1439 = local1434.aClass250_8;
				if (local1439.anInt7038 < 0) {
					break;
				}
				local840 = Static96.method1379(local1439.anInt7002);
			} while (local840 == null || local840.aClass250Array2 == null || local1439.anInt7038 >= local840.aClass250Array2.length || local1439 != local840.aClass250Array2[local1439.anInt7038]);
			Static267.method3402(local1434);
		}
	}
}
