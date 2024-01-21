import java.awt.Graphics;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!vb", name = "ac", descriptor = "I")
	public static int anInt2666;

	@OriginalMember(owner = "client!vb", name = "ub", descriptor = "[I")
	public static int[] anIntArray328 = new int[1000];

	@OriginalMember(owner = "client!vb", name = "dc", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1477 = Static75.method1216("Loaded sprites");

	@OriginalMember(owner = "client!vb", name = "Bb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1473 = aClass4_1477;

	@OriginalMember(owner = "client!vb", name = "Db", descriptor = "I")
	public static int anInt2654 = 0;

	@OriginalMember(owner = "client!vb", name = "Vb", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1475 = Static75.method1216("cyan:");

	@OriginalMember(owner = "client!vb", name = "Eb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1474 = aClass4_1475;

	@OriginalMember(owner = "client!vb", name = "Fb", descriptor = "[I")
	public static int[] anIntArray329 = new int[2000];

	@OriginalMember(owner = "client!vb", name = "Qb", descriptor = "Z")
	public static boolean aBoolean231 = false;

	@OriginalMember(owner = "client!vb", name = "Ub", descriptor = "I")
	public static int anInt2663 = -1;

	@OriginalMember(owner = "client!vb", name = "Wb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1476 = Static75.method1216("Weiter");

	@OriginalMember(owner = "client!vb", name = "fc", descriptor = "I")
	public static int anInt2669 = 0;

	@OriginalMember(owner = "client!vb", name = "gc", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1478 = Static75.method1216("::errortest");

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "(I)V")
	public static void method1805() {
		@Pc(14) int local14;
		if (Static81.anInt1899 > 0) {
			for (local14 = 0; local14 < 256; local14++) {
				if (Static81.anInt1899 > 768) {
					Static86.anIntArray262[local14] = Static61.method1036(Static100.anIntArray304[local14], Static16.anIntArray34[local14], 1024 - Static81.anInt1899);
				} else if (Static81.anInt1899 <= 256) {
					Static86.anIntArray262[local14] = Static61.method1036(Static16.anIntArray34[local14], Static100.anIntArray304[local14], 256 - Static81.anInt1899);
				} else {
					Static86.anIntArray262[local14] = Static16.anIntArray34[local14];
				}
			}
		} else if (Static104.anInt2547 <= 0) {
			for (local14 = 0; local14 < 256; local14++) {
				Static86.anIntArray262[local14] = Static100.anIntArray304[local14];
			}
		} else {
			for (local14 = 0; local14 < 256; local14++) {
				if (Static104.anInt2547 > 768) {
					Static86.anIntArray262[local14] = Static61.method1036(Static100.anIntArray304[local14], Static28.anIntArray82[local14], 1024 - Static104.anInt2547);
				} else if (Static104.anInt2547 > 256) {
					Static86.anIntArray262[local14] = Static28.anIntArray82[local14];
				} else {
					Static86.anIntArray262[local14] = Static61.method1036(Static28.anIntArray82[local14], Static100.anIntArray304[local14], 256 - Static104.anInt2547);
				}
			}
		}
		for (local14 = 0; local14 < 33920; local14++) {
			Static11.aClass25_155.anIntArray233[local14] = Static86.aClass3_Sub1_Sub4_Sub2_33.anIntArray325[local14];
		}
		@Pc(166) int local166 = 1152;
		@Pc(168) int local168 = 0;
		@Pc(183) int local183;
		@Pc(187) int local187;
		@Pc(200) int local200;
		@Pc(207) int local207;
		@Pc(217) int local217;
		@Pc(222) int local222;
		@Pc(231) int local231;
		for (@Pc(170) int local170 = 1; local170 < 255; local170++) {
			local183 = (256 - local170) * Static54.anIntArray179[local170] / 256;
			local187 = local183 + 22;
			if (local187 < 0) {
				local187 = 0;
			}
			local168 += local187;
			for (local200 = local187; local200 < 128; local200++) {
				local207 = Static51.anIntArray174[local168++];
				if (local207 == 0) {
					local166++;
				} else {
					local217 = local207;
					local222 = 256 - local207;
					local207 = Static86.anIntArray262[local207];
					local231 = Static11.aClass25_155.anIntArray233[local166];
					Static11.aClass25_155.anIntArray233[local166++] = (local217 * (local207 & 0xFF00FF) + (local231 & 0xFF00FF) * local222 & 0xFF00FF00) + (local222 * (local231 & 0xFF00) + (local207 & 0xFF00) * local217 & 0xFF0000) >> 8;
				}
			}
			local166 += local187;
		}
		local168 = 0;
		for (local183 = 0; local183 < 33920; local183++) {
			Static43.aClass25_54.anIntArray233[local183] = Static82.aClass3_Sub1_Sub4_Sub2_31.anIntArray325[local183];
		}
		local166 = 1176;
		for (local187 = 1; local187 < 255; local187++) {
			local200 = Static54.anIntArray179[local187] * (256 - local187) / 256;
			local207 = 103 - local200;
			local166 += local200;
			for (local217 = 0; local217 < local207; local217++) {
				local222 = Static51.anIntArray174[local168++];
				if (local222 == 0) {
					local166++;
				} else {
					@Pc(345) int local345 = 256 - local222;
					@Pc(350) int local350 = Static43.aClass25_54.anIntArray233[local166];
					local231 = local222;
					local222 = Static86.anIntArray262[local222];
					Static43.aClass25_54.anIntArray233[local166++] = (local345 * (local350 & 0xFF00FF) + local231 * (local222 & 0xFF00FF) & 0xFF00FF00) + ((local222 & 0xFF00) * local231 + local345 * (local350 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local168 += 128 - local207;
			local166 += 128 - local200 - local207;
		}
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(B)V")
	public static void method1806() {
		aClass4_1473 = null;
		aClass4_1478 = null;
		aClass4_1475 = null;
		aClass4_1474 = null;
		anIntArray329 = null;
		aClass4_1477 = null;
		anIntArray328 = null;
		aClass4_1476 = null;
	}

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "(I)V")
	public static void method1808() {
		try {
			@Pc(7) Graphics local7 = Static9.aCanvas1.getGraphics();
			Static88.aClass25_103.method1161(4, local7, 550);
		} catch (@Pc(15) Exception local15) {
			Static9.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "(I)Z")
	public static boolean method1809() {
		@Pc(13) long local13 = Static82.method1291();
		@Pc(19) int local19 = (int) (local13 - Static19.aLong13);
		if (local19 > 200) {
			local19 = 200;
		}
		Static19.aLong13 = local13;
		Static82.anInt1918 += local19;
		if (Static68.anInt1664 == 0 && Static46.anInt2739 == 0 && Static9.anInt317 == 0 && anInt2654 == 0) {
			return true;
		} else if (Static54.aClass31_4 == null) {
			return false;
		} else {
			try {
				if (Static82.anInt1918 > 30000) {
					throw new IOException();
				}
				@Pc(64) Class3_Sub1_Sub16 local64;
				@Pc(69) Class3_Sub4 local69;
				while (Static46.anInt2739 < 20 && anInt2654 > 0) {
					local64 = (Class3_Sub1_Sub16) Static55.aClass34_5.method794();
					local69 = new Class3_Sub4(4);
					local69.method423(1);
					local69.method441((int) local64.aLong88);
					Static54.aClass31_4.method716(4, local69.aByteArray4);
					Static39.aClass34_4.method792(local64.aLong88, local64);
					Static46.anInt2739++;
					anInt2654--;
				}
				while (Static68.anInt1664 < 20 && Static9.anInt317 > 0) {
					local64 = (Class3_Sub1_Sub16) Static51.aClass56_2.method1190();
					local69 = new Class3_Sub4(4);
					local69.method423(0);
					local69.method441((int) local64.aLong88);
					Static54.aClass31_4.method716(4, local69.aByteArray4);
					local64.method1909();
					Static28.aClass34_3.method792(local64.aLong88, local64);
					Static68.anInt1664++;
					Static9.anInt317--;
				}
				for (@Pc(162) int local162 = 0; local162 < 100; local162++) {
					@Pc(168) int local168 = Static54.aClass31_4.method715();
					if (local168 < 0) {
						throw new IOException();
					}
					if (local168 == 0) {
						break;
					}
					Static82.anInt1918 = 0;
					@Pc(186) byte local186 = 0;
					if (Static86.aClass3_Sub1_Sub16_1 == null) {
						local186 = 8;
					} else if (Static104.anInt2548 == 0) {
						local186 = 1;
					}
					@Pc(211) int local211;
					@Pc(216) int local216;
					@Pc(252) int local252;
					@Pc(330) int local330;
					if (local186 <= 0) {
						local211 = Static66.aClass3_Sub4_4.aByteArray4.length - Static86.aClass3_Sub1_Sub16_1.aByte2;
						local216 = 512 - Static104.anInt2548;
						if (local216 > local211 - Static66.aClass3_Sub4_4.anInt627) {
							local216 = local211 - Static66.aClass3_Sub4_4.anInt627;
						}
						if (local168 < local216) {
							local216 = local168;
						}
						Static54.aClass31_4.method711(Static66.aClass3_Sub4_4.anInt627, local216, Static66.aClass3_Sub4_4.aByteArray4);
						if (Static98.aByte3 != 0) {
							for (local252 = 0; local252 < local216; local252++) {
								Static66.aClass3_Sub4_4.aByteArray4[Static66.aClass3_Sub4_4.anInt627 + local252] ^= Static98.aByte3;
							}
						}
						Static66.aClass3_Sub4_4.anInt627 += local216;
						Static104.anInt2548 += local216;
						if (local211 == Static66.aClass3_Sub4_4.anInt627) {
							if (Static86.aClass3_Sub1_Sub16_1.aLong88 == 16711935L) {
								Static1.aClass3_Sub4_1 = Static66.aClass3_Sub4_4;
								for (local252 = 0; local252 < 256; local252++) {
									@Pc(317) Class64_Sub1 local317 = Static81.aClass64_Sub1Array1[local252];
									if (local317 != null) {
										Static1.aClass3_Sub4_1.anInt627 = local252 * 4 + 5;
										local330 = Static1.aClass3_Sub4_1.method438();
										local317.method1645(local330);
									}
								}
							} else {
								Static23.aCRC32_1.reset();
								Static23.aCRC32_1.update(Static66.aClass3_Sub4_4.aByteArray4, 0, local211);
								local252 = (int) Static23.aCRC32_1.getValue();
								if (local252 != Static86.aClass3_Sub1_Sub16_1.anInt2232) {
									try {
										Static54.aClass31_4.method717();
									} catch (@Pc(367) Exception local367) {
									}
									Static98.aByte3 = (byte) (Math.random() * 255.0D + 1.0D);
									Static54.aClass31_4 = null;
									Static21.anInt488++;
									return false;
								}
								Static21.anInt488 = 0;
								Static31.anInt958 = 0;
								Static86.aClass3_Sub1_Sub16_1.aClass64_Sub1_19.method1642((Static86.aClass3_Sub1_Sub16_1.aLong88 & 0xFF0000L) == 16711680L, Static95.aBoolean185, (int) (Static86.aClass3_Sub1_Sub16_1.aLong88 & 0xFFFFL), Static66.aClass3_Sub4_4.aByteArray4);
							}
							Static86.aClass3_Sub1_Sub16_1.method1930();
							Static66.aClass3_Sub4_4 = null;
							if (Static95.aBoolean185) {
								Static46.anInt2739--;
							} else {
								Static68.anInt1664--;
							}
							Static86.aClass3_Sub1_Sub16_1 = null;
							Static104.anInt2548 = 0;
						} else {
							if (Static104.anInt2548 != 512) {
								break;
							}
							Static104.anInt2548 = 0;
						}
					} else {
						local211 = local186 - Static23.aClass3_Sub4_2.anInt627;
						if (local168 < local211) {
							local211 = local168;
						}
						Static54.aClass31_4.method711(Static23.aClass3_Sub4_2.anInt627, local211, Static23.aClass3_Sub4_2.aByteArray4);
						if (Static98.aByte3 != 0) {
							for (local216 = 0; local216 < local211; local216++) {
								Static23.aClass3_Sub4_2.aByteArray4[local216 + Static23.aClass3_Sub4_2.anInt627] ^= Static98.aByte3;
							}
						}
						Static23.aClass3_Sub4_2.anInt627 += local211;
						if (local186 > Static23.aClass3_Sub4_2.anInt627) {
							break;
						}
						if (Static86.aClass3_Sub1_Sub16_1 == null) {
							Static23.aClass3_Sub4_2.anInt627 = 0;
							local216 = Static23.aClass3_Sub4_2.method446();
							local252 = Static23.aClass3_Sub4_2.method459();
							@Pc(514) int local514 = Static23.aClass3_Sub4_2.method446();
							local330 = Static23.aClass3_Sub4_2.method438();
							@Pc(526) long local526 = (long) ((local216 << 16) + local252);
							@Pc(532) Class3_Sub1_Sub16 local532 = (Class3_Sub1_Sub16) Static39.aClass34_4.method797(local526);
							Static95.aBoolean185 = true;
							if (local532 == null) {
								local532 = (Class3_Sub1_Sub16) Static28.aClass34_3.method797(local526);
								Static95.aBoolean185 = false;
							}
							if (local532 == null) {
								throw new IOException();
							}
							@Pc(558) int local558 = local514 == 0 ? 5 : 9;
							Static86.aClass3_Sub1_Sub16_1 = local532;
							Static66.aClass3_Sub4_4 = new Class3_Sub4(Static86.aClass3_Sub1_Sub16_1.aByte2 + local330 + local558);
							Static66.aClass3_Sub4_4.method423(local514);
							Static66.aClass3_Sub4_4.method424(local330);
							Static23.aClass3_Sub4_2.anInt627 = 0;
							Static104.anInt2548 = 8;
						} else if (Static104.anInt2548 == 0) {
							if (Static23.aClass3_Sub4_2.aByteArray4[0] == -1) {
								Static23.aClass3_Sub4_2.anInt627 = 0;
								Static104.anInt2548 = 1;
							} else {
								Static86.aClass3_Sub1_Sub16_1 = null;
							}
						}
					}
				}
				return true;
			} catch (@Pc(615) IOException local615) {
				try {
					Static54.aClass31_4.method717();
				} catch (@Pc(620) Exception local620) {
				}
				Static31.anInt958++;
				Static54.aClass31_4 = null;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZB)V")
	public static void method1811(@OriginalArg(0) boolean arg0) {
		Static19.aBoolean31 = arg0;
		@Pc(21) int local21;
		@Pc(27) int local27;
		@Pc(31) int local31;
		@Pc(61) int local61;
		@Pc(65) int local65;
		@Pc(102) int local102;
		@Pc(106) int local106;
		@Pc(129) int local129;
		@Pc(137) int local137;
		@Pc(145) int local145;
		if (!Static19.aBoolean31) {
			local21 = (Static65.anInt1630 - Static32.aClass3_Sub4_Sub1_2.anInt627) / 16;
			Static12.anIntArrayArray1 = new int[local21][4];
			for (local27 = 0; local27 < local21; local27++) {
				for (local31 = 0; local31 < 4; local31++) {
					Static12.anIntArrayArray1[local27][local31] = Static32.aClass3_Sub4_Sub1_2.method438();
				}
			}
			local31 = Static32.aClass3_Sub4_Sub1_2.method452();
			local61 = Static32.aClass3_Sub4_Sub1_2.method459();
			local65 = Static32.aClass3_Sub4_Sub1_2.method459();
			@Pc(67) boolean local67 = false;
			if ((local61 / 8 == 48 || local61 / 8 == 49) && local31 / 8 == 48) {
				local67 = true;
			}
			if (local61 / 8 == 48 && local31 / 8 == 148) {
				local67 = true;
			}
			local102 = Static32.aClass3_Sub4_Sub1_2.method459();
			local106 = Static32.aClass3_Sub4_Sub1_2.method421();
			Static47.anIntArray172 = new int[local21];
			Static5.aByteArrayArray1 = new byte[local21][];
			Static70.anIntArray232 = new int[local21];
			Static67.anIntArray231 = new int[local21];
			Static32.aByteArrayArray4 = new byte[local21][];
			local21 = 0;
			for (local129 = (local61 - 6) / 8; local129 <= (local61 + 6) / 8; local129++) {
				for (local137 = (local31 - 6) / 8; local137 <= (local31 + 6) / 8; local137++) {
					local145 = local137 + (local129 << 8);
					if (!local67 || local137 != 49 && local137 != 149 && local137 != 147 && local129 != 50 && (local129 != 49 || local137 != 47)) {
						Static70.anIntArray232[local21] = local145;
						Static67.anIntArray231[local21] = Static20.aClass64_Sub1_1.method1638(Static60.method1012(new Class4[] { Static78.aClass4_229, Static93.method1632(local129), Static19.aClass4_236, Static93.method1632(local137) }));
						Static47.anIntArray172[local21] = Static20.aClass64_Sub1_1.method1638(Static60.method1012(new Class4[] { Static79.aClass4_1055, Static93.method1632(local129), Static19.aClass4_236, Static93.method1632(local137) }));
						local21++;
					}
				}
			}
			Static5.method127(local31, local61, local106, local65, local102);
			return;
		}
		local21 = Static32.aClass3_Sub4_Sub1_2.method459();
		local27 = Static32.aClass3_Sub4_Sub1_2.method452();
		local31 = Static32.aClass3_Sub4_Sub1_2.method414();
		local61 = Static32.aClass3_Sub4_Sub1_2.method449();
		local65 = Static32.aClass3_Sub4_Sub1_2.method459();
		Static32.aClass3_Sub4_Sub1_2.method468();
		@Pc(297) int local297;
		for (local102 = 0; local102 < 4; local102++) {
			for (local106 = 0; local106 < 13; local106++) {
				for (local297 = 0; local297 < 13; local297++) {
					local129 = Static32.aClass3_Sub4_Sub1_2.method462(1);
					if (local129 == 1) {
						Static86.anIntArrayArrayArray24[local102][local106][local297] = Static32.aClass3_Sub4_Sub1_2.method462(26);
					} else {
						Static86.anIntArrayArrayArray24[local102][local106][local297] = -1;
					}
				}
			}
		}
		Static32.aClass3_Sub4_Sub1_2.method467();
		local106 = (Static65.anInt1630 - Static32.aClass3_Sub4_Sub1_2.anInt627) / 16;
		Static12.anIntArrayArray1 = new int[local106][4];
		for (local297 = 0; local297 < local106; local297++) {
			for (local129 = 0; local129 < 4; local129++) {
				Static12.anIntArrayArray1[local297][local129] = Static32.aClass3_Sub4_Sub1_2.method415();
			}
		}
		Static5.aByteArrayArray1 = new byte[local106][];
		Static32.aByteArrayArray4 = new byte[local106][];
		Static47.anIntArray172 = new int[local106];
		Static70.anIntArray232 = new int[local106];
		Static67.anIntArray231 = new int[local106];
		local106 = 0;
		for (local129 = 0; local129 < 4; local129++) {
			for (local137 = 0; local137 < 13; local137++) {
				for (local145 = 0; local145 < 13; local145++) {
					@Pc(426) int local426 = Static86.anIntArrayArrayArray24[local129][local137][local145];
					if (local426 != -1) {
						@Pc(436) int local436 = local426 >> 14 & 0x3FF;
						@Pc(442) int local442 = local426 >> 3 & 0x7FF;
						@Pc(453) int local453 = (local436 / 8 << 8) + (local442 / 8);
						for (@Pc(455) int local455 = 0; local455 < local106; local455++) {
							if (Static70.anIntArray232[local455] == local453) {
								local453 = -1;
								break;
							}
						}
						if (local453 != -1) {
							Static70.anIntArray232[local106] = local453;
							@Pc(488) int local488 = local453 >> 8 & 0xFF;
							@Pc(492) int local492 = local453 & 0xFF;
							Static67.anIntArray231[local106] = Static20.aClass64_Sub1_1.method1638(Static60.method1012(new Class4[] { Static78.aClass4_229, Static93.method1632(local488), Static19.aClass4_236, Static93.method1632(local492) }));
							Static47.anIntArray172[local106] = Static20.aClass64_Sub1_1.method1638(Static60.method1012(new Class4[] { Static79.aClass4_1055, Static93.method1632(local488), Static19.aClass4_236, Static93.method1632(local492) }));
							local106++;
						}
					}
				}
			}
		}
		Static5.method127(local65, local21, local61, local27, local31);
	}

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "(I)V")
	public static void method1812() {
		while (true) {
			if (Static32.aClass3_Sub4_Sub1_2.method461(Static65.anInt1630) >= 27) {
				@Pc(12) int local12 = Static32.aClass3_Sub4_Sub1_2.method462(15);
				if (local12 != 32767) {
					@Pc(19) boolean local19 = false;
					if (Static90.aClass3_Sub1_Sub1_Sub1_Sub1Array9[local12] == null) {
						local19 = true;
						Static90.aClass3_Sub1_Sub1_Sub1_Sub1Array9[local12] = new Class3_Sub1_Sub1_Sub1_Sub1();
					}
					@Pc(35) Class3_Sub1_Sub1_Sub1_Sub1 local35 = Static90.aClass3_Sub1_Sub1_Sub1_Sub1Array9[local12];
					Static24.anIntArray40[Static29.anInt905++] = local12;
					local35.anInt2343 = Static60.anInt1489;
					@Pc(51) int local51 = Static32.aClass3_Sub4_Sub1_2.method462(1);
					@Pc(58) int local58 = Static95.anIntArray284[Static32.aClass3_Sub4_Sub1_2.method462(3)];
					if (local19) {
						local35.anInt2293 = local58;
					}
					@Pc(68) int local68 = Static32.aClass3_Sub4_Sub1_2.method462(1);
					if (local68 == 1) {
						Static12.anIntArray13[Static95.anInt2230++] = local12;
					}
					local35.aClass3_Sub1_Sub17_1 = Static44.method810(Static32.aClass3_Sub4_Sub1_2.method462(13));
					@Pc(94) int local94 = Static32.aClass3_Sub4_Sub1_2.method462(5);
					if (local94 > 15) {
						local94 -= 32;
					}
					@Pc(105) int local105 = Static32.aClass3_Sub4_Sub1_2.method462(5);
					local35.anInt2312 = local35.aClass3_Sub1_Sub17_1.anInt2499;
					local35.anInt2305 = local35.aClass3_Sub1_Sub17_1.anInt2519;
					local35.anInt2347 = local35.aClass3_Sub1_Sub17_1.anInt2495;
					local35.anInt2291 = local35.aClass3_Sub1_Sub17_1.anInt2523;
					if (local105 > 15) {
						local105 -= 32;
					}
					local35.anInt2307 = local35.aClass3_Sub1_Sub17_1.anInt2498;
					if (local35.anInt2347 == 0) {
						local35.anInt2293 = 0;
					}
					local35.anInt2314 = local35.aClass3_Sub1_Sub17_1.anInt2496;
					local35.anInt2322 = local35.aClass3_Sub1_Sub17_1.anInt2493;
					local35.anInt2319 = local35.aClass3_Sub1_Sub17_1.anInt2516;
					local35.anInt2306 = local35.aClass3_Sub1_Sub17_1.anInt2504;
					local35.method1553(Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray286[0] + local105, local51 == 1, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray289[0] + local94);
					continue;
				}
			}
			Static32.aClass3_Sub4_Sub1_2.method467();
			return;
		}
	}
}
