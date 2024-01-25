import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!lh", name = "k", descriptor = "[I")
	public static int[] anIntArray403;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "Lclient!qr;")
	public static final Class293 aClass293_39 = new Class293(8);

	@OriginalMember(owner = "client!lh", name = "h", descriptor = "Z")
	public static boolean aBoolean469 = false;

	@OriginalMember(owner = "client!lh", name = "m", descriptor = "F")
	public static float aFloat112 = 0.0F;

	@OriginalMember(owner = "client!lh", name = "n", descriptor = "[S")
	public static short[] aShortArray63 = new short[256];

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
	public static void method4990() {
		if (Static485.aClass126_17 == null) {
			return;
		}
		if (Static144.aBoolean196) {
			Static168.method2635();
		}
		Static599.aClass43_3.method869();
		Static121.method1818();
		Static227.method3580();
		Static16.method435();
		Static189.method3006();
		Static547.method7741();
		if (Static374.aClass218_1 != null) {
			Static374.aClass218_1.method5166();
		}
		Static512.method8465();
		Static587.method8245();
		Static36.method680();
		Static462.method6095();
		Static451.method6704(false);
		for (@Pc(45) int local45 = 0; local45 < 2048; local45++) {
			@Pc(51) Class14_Sub1_Sub1_Sub3_Sub1 local51 = Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1[local45];
			if (local51 != null) {
				for (@Pc(55) int local55 = 0; local55 < local51.aClass180Array3.length; local55++) {
					local51.aClass180Array3[local55] = null;
				}
			}
		}
		for (@Pc(80) int local80 = 0; local80 < Static108.anInt1716; local80++) {
			@Pc(87) Class14_Sub1_Sub1_Sub3_Sub2 local87 = Static367.aClass5_Sub13Array1[local80].aClass14_Sub1_Sub1_Sub3_Sub2_1;
			if (local87 != null) {
				for (@Pc(91) int local91 = 0; local91 < local87.aClass180Array3.length; local91++) {
					local87.aClass180Array3[local91] = null;
				}
			}
		}
		Static468.aClass117_6 = null;
		Static88.aClass117_1 = null;
		Static485.aClass126_17.method7044();
		Static485.aClass126_17 = null;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(III)Z")
	public static boolean method4991(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static559.method7848(arg0, arg1) | (arg0 & 0x40000) != 0 || Static130.method1926(arg1, arg0);
	}

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(Z)Z")
	public static boolean method4996() throws IOException {
		if (Static487.aClass30_2 == null) {
			return false;
		}
		@Pc(73) int local73;
		if (Static86.aClass136_37 == null) {
			if (Static2.aBoolean1) {
				if (!Static487.aClass30_2.method669(1)) {
					return false;
				}
				Static487.aClass30_2.method677(Static167.aClass5_Sub12_Sub2_1.aByteArray104, 1, 0);
				Static80.anInt1302 = 0;
				Static2.aBoolean1 = false;
				Static401.anInt8427++;
			}
			Static167.aClass5_Sub12_Sub2_1.anInt10154 = 0;
			if (Static167.aClass5_Sub12_Sub2_1.method8668()) {
				if (!Static487.aClass30_2.method669(1)) {
					return false;
				}
				Static487.aClass30_2.method677(Static167.aClass5_Sub12_Sub2_1.aByteArray104, 1, 1);
				Static401.anInt8427++;
				Static80.anInt1302 = 0;
			}
			Static2.aBoolean1 = true;
			@Pc(69) Class136[] local69 = Static488.method7159();
			local73 = Static167.aClass5_Sub12_Sub2_1.method8663();
			if (local73 < 0 || local73 >= local69.length) {
				throw new IOException("invo:" + local73 + " ip:" + Static167.aClass5_Sub12_Sub2_1.anInt10154);
			}
			Static86.aClass136_37 = local69[local73];
			Static60.anInt3115 = Static86.aClass136_37.anInt3597;
		}
		if (Static60.anInt3115 == -1) {
			if (!Static487.aClass30_2.method669(1)) {
				return false;
			}
			Static487.aClass30_2.method677(Static167.aClass5_Sub12_Sub2_1.aByteArray104, 1, 0);
			Static80.anInt1302 = 0;
			Static401.anInt8427++;
			Static60.anInt3115 = Static167.aClass5_Sub12_Sub2_1.aByteArray104[0] & 0xFF;
		}
		if (Static60.anInt3115 == -2) {
			if (!Static487.aClass30_2.method669(2)) {
				return false;
			}
			Static487.aClass30_2.method677(Static167.aClass5_Sub12_Sub2_1.aByteArray104, 2, 0);
			Static167.aClass5_Sub12_Sub2_1.anInt10154 = 0;
			Static60.anInt3115 = Static167.aClass5_Sub12_Sub2_1.method8631();
			Static80.anInt1302 = 0;
			Static401.anInt8427 += 2;
		}
		if (Static60.anInt3115 > 0) {
			if (!Static487.aClass30_2.method669(Static60.anInt3115)) {
				return false;
			}
			Static167.aClass5_Sub12_Sub2_1.anInt10154 = 0;
			Static487.aClass30_2.method677(Static167.aClass5_Sub12_Sub2_1.aByteArray104, Static60.anInt3115, 0);
			Static401.anInt8427 += Static60.anInt3115;
			Static80.anInt1302 = 0;
		}
		Static612.aClass136_191 = Static102.aClass136_43;
		Static102.aClass136_43 = Static441.aClass136_148;
		Static441.aClass136_148 = Static86.aClass136_37;
		if (Static262.aClass136_101 == Static86.aClass136_37) {
			Static414.method6321();
			Static305.method4419();
			Static86.aClass136_37 = null;
			return true;
		}
		@Pc(219) int local219;
		if (Static86.aClass136_37 == Static499.aClass136_163) {
			local219 = Static167.aClass5_Sub12_Sub2_1.method8640();
			local73 = Static167.aClass5_Sub12_Sub2_1.method8629();
			Static414.method6321();
			Static547.method7742(local73, local219);
			Static86.aClass136_37 = null;
			return true;
		}
		@Pc(245) byte local245;
		if (Static86.aClass136_37 == Static334.aClass136_120) {
			local219 = Static167.aClass5_Sub12_Sub2_1.method8607();
			local245 = Static167.aClass5_Sub12_Sub2_1.method8649();
			Static414.method6321();
			Static491.method3752(local245, local219);
			Static86.aClass136_37 = null;
			return true;
		} else if (Static288.aClass136_111 == Static86.aClass136_37) {
			Static86.aClass136_37 = null;
			return false;
		} else {
			@Pc(320) int local320;
			@Pc(444) int local444;
			@Pc(298) boolean local298;
			@Pc(336) int local336;
			@Pc(441) boolean local441;
			@Pc(437) int local437;
			@Pc(462) Class231 local462;
			if (Static86.aClass136_37 == Static83.aClass136_159) {
				Static324.anInt5595 = Static278.anInt4551;
				if (Static60.anInt3115 == 0) {
					Static45.aString15 = null;
					Static86.aClass136_37 = null;
					Static60.aClass231Array3 = null;
					Static550.aString105 = null;
					Static122.anInt1983 = 0;
					return true;
				}
				Static550.aString105 = Static167.aClass5_Sub12_Sub2_1.method8617();
				local298 = Static167.aClass5_Sub12_Sub2_1.method8645() == 1;
				if (local298) {
					Static167.aClass5_Sub12_Sub2_1.method8617();
				}
				@Pc(308) long local308 = Static167.aClass5_Sub12_Sub2_1.method8644();
				Static45.aString15 = Static387.method5968(local308);
				Static56.aByte15 = Static167.aClass5_Sub12_Sub2_1.method8635();
				local320 = Static167.aClass5_Sub12_Sub2_1.method8645();
				if (local320 == 255) {
					Static86.aClass136_37 = null;
					return true;
				}
				Static122.anInt1983 = local320;
				@Pc(334) Class231[] local334 = new Class231[100];
				for (local336 = 0; local336 < Static122.anInt1983; local336++) {
					local334[local336] = new Class231();
					local334[local336].aString98 = Static167.aClass5_Sub12_Sub2_1.method8617();
					local298 = Static167.aClass5_Sub12_Sub2_1.method8645() == 1;
					if (local298) {
						local334[local336].aString99 = Static167.aClass5_Sub12_Sub2_1.method8617();
					} else {
						local334[local336].aString99 = local334[local336].aString98;
					}
					local334[local336].aString97 = Static250.method3883(local334[local336].aString99);
					local334[local336].anInt6354 = Static167.aClass5_Sub12_Sub2_1.method8631();
					local334[local336].aByte89 = Static167.aClass5_Sub12_Sub2_1.method8635();
					local334[local336].aString96 = Static167.aClass5_Sub12_Sub2_1.method8617();
					if (local334[local336].aString99.equals(Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aString42)) {
						Static3.aByte1 = local334[local336].aByte89;
					}
				}
				local437 = Static122.anInt1983;
				while (local437 > 0) {
					local441 = true;
					local437--;
					for (local444 = 0; local444 < local437; local444++) {
						if (local334[local444].aString97.compareTo(local334[local444 + 1].aString97) > 0) {
							local462 = local334[local444];
							local334[local444] = local334[local444 + 1];
							local441 = false;
							local334[local444 + 1] = local462;
						}
					}
					if (local441) {
						break;
					}
				}
				Static60.aClass231Array3 = local334;
				Static86.aClass136_37 = null;
				return true;
			}
			@Pc(523) int local523;
			if (Static340.aClass136_123 == Static86.aClass136_37) {
				@Pc(503) int[] local503 = new int[4];
				for (local73 = 0; local73 < 4; local73++) {
					local503[local73] = Static167.aClass5_Sub12_Sub2_1.method8640();
				}
				local523 = Static167.aClass5_Sub12_Sub2_1.method8606();
				local320 = Static167.aClass5_Sub12_Sub2_1.method8607();
				@Pc(534) Class5_Sub13 local534 = (Class5_Sub13) Static51.aClass81_11.method1599((long) local523);
				if (local534 != null) {
					Static647.method8880(local503, local534.aClass14_Sub1_Sub1_Sub3_Sub2_1, local320);
				}
				Static86.aClass136_37 = null;
				return true;
			} else if (Static36.aClass136_21 == Static86.aClass136_37) {
				local219 = Static167.aClass5_Sub12_Sub2_1.method8629();
				Static414.method6321();
				@Pc(563) Class5_Sub15 local563 = (Class5_Sub15) Static183.aClass81_27.method1599((long) local219);
				if (local563 != null) {
					Static177.method2689(false, true, local563);
				}
				if (Static381.aClass357_7 != null) {
					Static637.method8778(Static381.aClass357_7);
					Static381.aClass357_7 = null;
				}
				Static86.aClass136_37 = null;
				return true;
			} else if (Static86.aClass136_37 == Static314.aClass136_127) {
				Static167.aClass5_Sub12_Sub2_1.anInt10154 += 28;
				if (Static167.aClass5_Sub12_Sub2_1.method8659()) {
					Static582.method8175(Static167.aClass5_Sub12_Sub2_1.anInt10154 - 28, Static167.aClass5_Sub12_Sub2_1);
				}
				Static86.aClass136_37 = null;
				return true;
			} else if (Static86.aClass136_37 == Static108.aClass136_46) {
				local298 = Static167.aClass5_Sub12_Sub2_1.method8645() == 1;
				@Pc(624) byte[] local624 = new byte[Static60.anInt3115 - 1];
				Static167.aClass5_Sub12_Sub2_1.method8625(local624, 0, Static60.anInt3115 - 1);
				Static67.method1112(local298, local624);
				Static86.aClass136_37 = null;
				return true;
			} else if (Static59.aClass136_29 == Static86.aClass136_37) {
				Static516.method7430(Static388.aClass148_26);
				Static86.aClass136_37 = null;
				return true;
			} else {
				@Pc(675) int local675;
				if (Static86.aClass136_37 == Static137.aClass136_64) {
					local219 = Static167.aClass5_Sub12_Sub2_1.method8615();
					local73 = Static167.aClass5_Sub12_Sub2_1.method8640() << 2;
					local523 = Static167.aClass5_Sub12_Sub2_1.method8645();
					local320 = Static167.aClass5_Sub12_Sub2_1.method8645();
					local675 = Static167.aClass5_Sub12_Sub2_1.method8639();
					Static414.method6321();
					Static78.method1246(true, local320, local219, local675, local73, local523);
					Static86.aClass136_37 = null;
					return true;
				} else if (Static86.aClass136_37 == Static580.aClass136_198) {
					local219 = Static167.aClass5_Sub12_Sub2_1.method8641();
					local73 = Static167.aClass5_Sub12_Sub2_1.method8623();
					local523 = Static167.aClass5_Sub12_Sub2_1.method8634();
					Static414.method6321();
					Static135.method2000(local73, local523, local219);
					Static86.aClass136_37 = null;
					return true;
				} else {
					@Pc(741) boolean local741;
					if (Static617.aClass136_192 == Static86.aClass136_37) {
						local219 = Static167.aClass5_Sub12_Sub2_1.method8631();
						local73 = Static167.aClass5_Sub12_Sub2_1.method8645();
						local741 = (local73 & 0x1) == 1;
						while (Static167.aClass5_Sub12_Sub2_1.anInt10154 < Static60.anInt3115) {
							local320 = Static167.aClass5_Sub12_Sub2_1.method8614();
							local675 = Static167.aClass5_Sub12_Sub2_1.method8631();
							local336 = 0;
							if (local675 != 0) {
								local336 = Static167.aClass5_Sub12_Sub2_1.method8645();
								if (local336 == 255) {
									local336 = Static167.aClass5_Sub12_Sub2_1.method8623();
								}
							}
							Static79.method6908(local741, local320, local336, local219, local675 - 1);
						}
						Static276.anIntArray718[Static356.anInt6350++ & 0x1F] = local219;
						Static86.aClass136_37 = null;
						return true;
					} else if (Static86.aClass136_37 == Static257.aClass136_100) {
						local219 = Static167.aClass5_Sub12_Sub2_1.method8645();
						local73 = local219 >> 5;
						local523 = local219 & 0x1F;
						if (local523 == 0) {
							Static568.aClass16Array1[local73] = null;
							Static86.aClass136_37 = null;
							return true;
						}
						@Pc(832) Class16 local832 = new Class16();
						local832.anInt407 = local523;
						local832.anInt405 = Static167.aClass5_Sub12_Sub2_1.method8645();
						if (local832.anInt405 >= 0 && local832.anInt405 < Static619.aClass44Array19.length) {
							if (local832.anInt407 == 1 || local832.anInt407 == 10) {
								local832.anInt403 = Static167.aClass5_Sub12_Sub2_1.method8631();
								Static167.aClass5_Sub12_Sub2_1.anInt10154 += 6;
							} else if (local832.anInt407 >= 2 && local832.anInt407 <= 6) {
								if (local832.anInt407 == 2) {
									local832.anInt398 = 256;
									local832.anInt402 = 256;
								}
								if (local832.anInt407 == 3) {
									local832.anInt402 = 256;
									local832.anInt398 = 0;
								}
								if (local832.anInt407 == 4) {
									local832.anInt402 = 256;
									local832.anInt398 = 512;
								}
								if (local832.anInt407 == 5) {
									local832.anInt398 = 256;
									local832.anInt402 = 0;
								}
								if (local832.anInt407 == 6) {
									local832.anInt398 = 256;
									local832.anInt402 = 512;
								}
								local832.anInt407 = 2;
								local832.anInt399 = Static167.aClass5_Sub12_Sub2_1.method8645();
								local832.anInt398 += Static167.aClass5_Sub12_Sub2_1.method8631() - Static113.anInt1785 << 9;
								local832.anInt402 += Static167.aClass5_Sub12_Sub2_1.method8631() - Static622.anInt10087 << 9;
								local832.anInt404 = Static167.aClass5_Sub12_Sub2_1.method8645() << 2;
								local832.anInt406 = Static167.aClass5_Sub12_Sub2_1.method8631();
							}
							local832.anInt397 = Static167.aClass5_Sub12_Sub2_1.method8631();
							if (local832.anInt397 == 65535) {
								local832.anInt397 = -1;
							}
							Static568.aClass16Array1[local73] = local832;
						}
						Static86.aClass136_37 = null;
						return true;
					} else if (Static415.aClass136_143 == Static86.aClass136_37) {
						local219 = Static167.aClass5_Sub12_Sub2_1.method8629();
						local73 = Static167.aClass5_Sub12_Sub2_1.method8601();
						local523 = Static167.aClass5_Sub12_Sub2_1.method8633();
						Static414.method6321();
						Static285.method4275(local219, 5, local523, local73);
						Static86.aClass136_37 = null;
						return true;
					} else if (Static86.aClass136_37 == Static335.aClass136_121) {
						local219 = Static167.aClass5_Sub12_Sub2_1.method8601();
						if (local219 != Static430.anInt7294) {
							Static430.anInt7294 = local219;
							Static82.method1326(Static542.aClass74_26, -1, -1);
						}
						Static86.aClass136_37 = null;
						return true;
					} else if (Static229.aClass136_87 == Static86.aClass136_37) {
						local219 = Static167.aClass5_Sub12_Sub2_1.method8645();
						local73 = Static167.aClass5_Sub12_Sub2_1.method8645();
						local523 = Static167.aClass5_Sub12_Sub2_1.method8607();
						local320 = Static167.aClass5_Sub12_Sub2_1.method8640() << 2;
						local675 = Static167.aClass5_Sub12_Sub2_1.method8639();
						Static414.method6321();
						Static213.method3230(local219, local320, local675, local523, local73);
						Static86.aClass136_37 = null;
						return true;
					} else if (Static573.aClass136_177 == Static86.aClass136_37) {
						Static516.method7430(Static205.aClass148_21);
						Static86.aClass136_37 = null;
						return true;
					} else if (Static629.aClass136_199 == Static86.aClass136_37) {
						Static268.method4076(Static577.aBoolean768);
						Static86.aClass136_37 = null;
						return false;
					} else if (Static431.aClass136_27 == Static86.aClass136_37) {
						Static211.anInt3647 = Static167.aClass5_Sub12_Sub2_1.method8626();
						Static205.aBoolean296 = Static167.aClass5_Sub12_Sub2_1.method8645() == 1;
						Static86.aClass136_37 = null;
						return true;
					} else if (Static86.aClass136_37 == Static275.aClass136_167) {
						Static268.method4076(false);
						Static86.aClass136_37 = null;
						return false;
					} else if (Static562.aClass136_175 == Static86.aClass136_37) {
						Static445.anInt7509 = 1;
						Static543.anInt10432 = Static278.anInt4551;
						Static86.aClass136_37 = null;
						return true;
					} else {
						@Pc(1190) Class5_Sub15 local1190;
						if (Static259.aClass136_59 == Static86.aClass136_37) {
							local219 = Static167.aClass5_Sub12_Sub2_1.method8601();
							local73 = Static167.aClass5_Sub12_Sub2_1.method8629();
							Static414.method6321();
							@Pc(1183) Class5_Sub15 local1183 = (Class5_Sub15) Static183.aClass81_27.method1599((long) local73);
							local1190 = (Class5_Sub15) Static183.aClass81_27.method1599((long) local219);
							if (local1190 != null) {
								Static177.method2689(false, local1183 == null || local1183.anInt2409 != local1190.anInt2409, local1190);
							}
							if (local1183 != null) {
								local1183.method8911();
								Static183.aClass81_27.method1607(local1183, (long) local219);
							}
							@Pc(1221) Class357 local1221 = Static472.method6903(local73);
							if (local1221 != null) {
								Static637.method8778(local1221);
							}
							local1221 = Static472.method6903(local219);
							if (local1221 != null) {
								Static637.method8778(local1221);
								Static101.method1475(true, local1221);
							}
							if (Static302.anInt4813 != -1) {
								Static499.method7310(1, Static302.anInt4813);
							}
							Static86.aClass136_37 = null;
							return true;
						} else if (Static527.aClass136_189 == Static86.aClass136_37) {
							Static315.anInt5518 = Static167.aClass5_Sub12_Sub2_1.method8645();
							Static86.aClass136_37 = null;
							Static20.anInt442 = Static278.anInt4551;
							return true;
						} else if (Static86.aClass136_37 == Static269.aClass136_35) {
							Static206.method3191();
							Static86.aClass136_37 = null;
							return true;
						} else {
							@Pc(1286) String local1286;
							@Pc(1280) String local1280;
							if (Static17.aClass136_13 == Static86.aClass136_37) {
								local1280 = Static167.aClass5_Sub12_Sub2_1.method8617();
								local1286 = Static441.method6571(Static282.method4241(Static167.aClass5_Sub12_Sub2_1));
								Static365.method5696(0, local1286, local1280, local1280, local1280, 6);
								Static86.aClass136_37 = null;
								return true;
							} else if (Static86.aClass136_37 == Static173.aClass136_75) {
								Static518.method7452(Static167.aClass5_Sub12_Sub2_1, Static60.anInt3115, Static214.aClass192_1);
								Static86.aClass136_37 = null;
								return true;
							} else if (Static627.aClass136_196 == Static86.aClass136_37) {
								Static279.method4184();
								Static86.aClass136_37 = null;
								return true;
							} else if (Static461.aClass136_157 == Static86.aClass136_37) {
								Static503.anInt3941 = Static167.aClass5_Sub12_Sub2_1.method8595();
								Static20.anInt442 = Static278.anInt4551;
								Static86.aClass136_37 = null;
								return true;
							} else if (Static86.aClass136_37 == Static465.aClass136_145) {
								local219 = Static167.aClass5_Sub12_Sub2_1.method8631();
								local73 = Static167.aClass5_Sub12_Sub2_1.method8650();
								Static414.method6321();
								Static108.method1597(local219, local73);
								Static86.aClass136_37 = null;
								return true;
							} else if (Static86.aClass136_37 == Static481.aClass136_158) {
								Static516.method7430(Static79.aClass148_28);
								Static86.aClass136_37 = null;
								return true;
							} else if (Static86.aClass136_37 == Static632.aClass136_200) {
								local219 = Static167.aClass5_Sub12_Sub2_1.method8631();
								if (local219 == 65535) {
									local219 = -1;
								}
								local73 = Static167.aClass5_Sub12_Sub2_1.method8645();
								local523 = Static167.aClass5_Sub12_Sub2_1.method8631();
								local320 = Static167.aClass5_Sub12_Sub2_1.method8645();
								local675 = Static167.aClass5_Sub12_Sub2_1.method8631();
								Static301.method4383(local675, local219, local523, local320, local73);
								Static86.aClass136_37 = null;
								return true;
							} else if (Static86.aClass136_37 == Static150.aClass136_67) {
								local219 = Static167.aClass5_Sub12_Sub2_1.method8633();
								local1286 = Static167.aClass5_Sub12_Sub2_1.method8617();
								Static414.method6321();
								Static87.method1367(local219, local1286);
								Static86.aClass136_37 = null;
								return true;
							} else if (Static530.aClass136_170 == Static86.aClass136_37) {
								Static7.aByte4 = Static167.aClass5_Sub12_Sub2_1.method8592();
								if (Static7.aByte4 == 0 || Static7.aByte4 == 1) {
									Static539.aBoolean735 = true;
								}
								Static86.aClass136_37 = null;
								return true;
							} else if (Static86.aClass136_37 == Static547.aClass136_173) {
								Static70.anInt9227 = Static167.aClass5_Sub12_Sub2_1.method8645();
								Static86.aClass136_37 = null;
								return true;
							} else if (Static86.aClass136_37 == Static274.aClass136_201) {
								Static516.method7430(Static111.aClass148_7);
								Static86.aClass136_37 = null;
								return true;
							} else if (Static86.aClass136_37 == Static505.aClass136_126) {
								@Pc(1475) byte local1475 = Static167.aClass5_Sub12_Sub2_1.method8658();
								local73 = Static167.aClass5_Sub12_Sub2_1.method8631();
								Static564.aClass304_1.method7294(local73, local1475);
								Static86.aClass136_37 = null;
								return true;
							} else {
								@Pc(1523) int local1523;
								@Pc(1527) int local1527;
								if (Static86.aClass136_37 == Static51.aClass136_28) {
									local219 = Static167.aClass5_Sub12_Sub2_1.method8623();
									local73 = local219 >> 28 & 0x3;
									local523 = local219 >> 14 & 0x3FFF;
									local320 = local219 & 0x3FFF;
									local675 = Static167.aClass5_Sub12_Sub2_1.method8645();
									local336 = local675 >> 2;
									local1523 = local675 & 0x3;
									local1527 = Static192.anIntArray687[local336];
									local437 = Static167.aClass5_Sub12_Sub2_1.method8640();
									local320 -= Static622.anInt10087;
									local523 -= Static113.anInt1785;
									if (local437 == 65535) {
										local437 = -1;
									}
									Static604.method8429(local1527, local320, local437, local523, local1523, local73, local336);
									Static86.aClass136_37 = null;
									return true;
								} else if (Static86.aClass136_37 == Static87.aClass136_38) {
									for (local219 = 0; local219 < Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1.length; local219++) {
										if (Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1[local219] != null) {
											Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1[local219].anIntArray243 = null;
											Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1[local219].anInt2930 = -1;
										}
									}
									for (local73 = 0; local73 < Static108.anInt1716; local73++) {
										Static367.aClass5_Sub13Array1[local73].aClass14_Sub1_Sub1_Sub3_Sub2_1.anIntArray243 = null;
										Static367.aClass5_Sub13Array1[local73].aClass14_Sub1_Sub1_Sub3_Sub2_1.anInt2930 = -1;
									}
									Static86.aClass136_37 = null;
									return true;
								} else {
									@Pc(1638) String local1638;
									@Pc(1642) String local1642;
									@Pc(1656) String local1656;
									@Pc(1652) String local1652;
									if (Static86.aClass136_37 == Static23.aClass136_15) {
										local219 = Static167.aClass5_Sub12_Sub2_1.method8645();
										@Pc(1634) boolean local1634 = (local219 & 0x1) == 1;
										local1638 = Static167.aClass5_Sub12_Sub2_1.method8617();
										local1642 = Static167.aClass5_Sub12_Sub2_1.method8617();
										if (local1642.equals("")) {
											local1642 = local1638;
										}
										local1652 = Static167.aClass5_Sub12_Sub2_1.method8617();
										local1656 = Static167.aClass5_Sub12_Sub2_1.method8617();
										if (local1656.equals("")) {
											local1656 = local1652;
										}
										if (local1634) {
											for (local1523 = 0; local1523 < Static310.anInt5466; local1523++) {
												if (Static55.aStringArray3[local1523].equals(local1656)) {
													Static368.aStringArray26[local1523] = local1638;
													Static55.aStringArray3[local1523] = local1642;
													Static107.aStringArray9[local1523] = local1652;
													Static611.aStringArray44[local1523] = local1656;
													break;
												}
											}
										} else {
											Static368.aStringArray26[Static310.anInt5466] = local1638;
											Static55.aStringArray3[Static310.anInt5466] = local1642;
											Static107.aStringArray9[Static310.anInt5466] = local1652;
											Static611.aStringArray44[Static310.anInt5466] = local1656;
											Static497.aBooleanArray50[Static310.anInt5466] = (local219 & 0x2) == 2;
											Static310.anInt5466++;
										}
										Static543.anInt10432 = Static278.anInt4551;
										Static86.aClass136_37 = null;
										return true;
									}
									@Pc(1796) Class5_Sub49 local1796;
									@Pc(1787) Class5_Sub49 local1787;
									@Pc(1781) long local1781;
									if (Static425.aClass136_147 == Static86.aClass136_37) {
										local219 = Static167.aClass5_Sub12_Sub2_1.method8640();
										if (local219 == 65535) {
											local219 = -1;
										}
										local73 = Static167.aClass5_Sub12_Sub2_1.method8650();
										local523 = Static167.aClass5_Sub12_Sub2_1.method8606();
										if (local523 == 65535) {
											local523 = -1;
										}
										local320 = Static167.aClass5_Sub12_Sub2_1.method8606();
										Static414.method6321();
										for (local675 = local523; local675 <= local219; local675++) {
											local1781 = (long) local675 + ((long) local73 << 32);
											local1787 = (Class5_Sub49) Static545.aClass81_62.method1599(local1781);
											if (local1787 != null) {
												local1796 = new Class5_Sub49(local1787.anInt10264, local320);
												local1787.method8911();
											} else if (local675 == -1) {
												local1796 = new Class5_Sub49(Static472.method6903(local73).aClass5_Sub49_2.anInt10264, local320);
											} else {
												local1796 = new Class5_Sub49(0, local320);
											}
											Static545.aClass81_62.method1607(local1796, local1781);
										}
										Static86.aClass136_37 = null;
										return true;
									} else if (Static491.aClass136_91 == Static86.aClass136_37) {
										if (Static318.method4969(Static469.anInt7883)) {
											Static443.anInt7473 = (int) ((float) Static167.aClass5_Sub12_Sub2_1.method8631() * 2.5F);
										} else {
											Static443.anInt7473 = Static167.aClass5_Sub12_Sub2_1.method8631() * 30;
										}
										Static86.aClass136_37 = null;
										Static20.anInt442 = Static278.anInt4551;
										return true;
									} else {
										@Pc(1920) boolean local1920;
										@Pc(1970) String local1970;
										@Pc(1912) boolean local1912;
										if (Static19.aClass136_14 == Static86.aClass136_37) {
											local219 = Static167.aClass5_Sub12_Sub2_1.method8631();
											@Pc(1881) Class14_Sub1_Sub1_Sub3_Sub1 local1881;
											if (local219 == Static620.anInt10055) {
												local1881 = Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1;
											} else {
												local1881 = Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1[local219];
											}
											if (local1881 == null) {
												Static86.aClass136_37 = null;
												return true;
											}
											local523 = Static167.aClass5_Sub12_Sub2_1.method8631();
											local320 = Static167.aClass5_Sub12_Sub2_1.method8645();
											local1912 = (local523 & 0x8000) != 0;
											if (local1881.aString42 != null && local1881.aClass339_1 != null) {
												local1920 = false;
												if (local320 <= 1) {
													if (!local1912 && (Static205.aBoolean296 && !Static33.aBoolean54 || Static324.aBoolean473)) {
														local1920 = true;
													} else if (Static41.method724(local1881.aString42)) {
														local1920 = true;
													}
												}
												if (!local1920 && Static164.anInt5717 == 0) {
													local1527 = -1;
													if (local1912) {
														local523 &= 0x7FFF;
														@Pc(1961) Class2 local1961 = Static559.method7850(Static167.aClass5_Sub12_Sub2_1);
														local1527 = local1961.anInt9;
														local1970 = local1961.aClass5_Sub4_Sub21_1.method8745(Static167.aClass5_Sub12_Sub2_1);
													} else {
														local1970 = Static441.method6571(Static282.method4241(Static167.aClass5_Sub12_Sub2_1));
													}
													local1881.aString50 = local1970.trim();
													local1881.anInt2957 = 150;
													local1881.anInt2940 = local523 >> 8;
													local1881.anInt2944 = local523 & 0xFF;
													if (local320 == 1 || local320 == 2) {
														local437 = local1912 ? 17 : 1;
													} else {
														local437 = local1912 ? 17 : 2;
													}
													if (local320 == 2) {
														Static45.method767((String) null, local1970, local1881.aString43, 0, local437, "<img=1>" + local1881.method2373(), "<img=1>" + local1881.method2375(), local1527);
													} else if (local320 == 1) {
														Static45.method767((String) null, local1970, local1881.aString43, 0, local437, "<img=0>" + local1881.method2373(), "<img=0>" + local1881.method2375(), local1527);
													} else {
														Static45.method767((String) null, local1970, local1881.aString43, 0, local437, local1881.method2373(), local1881.method2375(), local1527);
													}
												}
											}
											Static86.aClass136_37 = null;
											return true;
										} else if (Static269.aClass136_36 == Static86.aClass136_37) {
											local219 = Static167.aClass5_Sub12_Sub2_1.method8631();
											if (local219 == 65535) {
												local219 = -1;
											}
											local73 = Static167.aClass5_Sub12_Sub2_1.method8645();
											local523 = Static167.aClass5_Sub12_Sub2_1.method8631();
											local320 = Static167.aClass5_Sub12_Sub2_1.method8645();
											Static392.method6102(local320, local73, local219, 256, true, local523);
											Static86.aClass136_37 = null;
											return true;
										} else if (Static86.aClass136_37 == Static9.aClass136_5) {
											Static310.anInt5466 = Static167.aClass5_Sub12_Sub2_1.method8645();
											for (local219 = 0; local219 < Static310.anInt5466; local219++) {
												Static368.aStringArray26[local219] = Static167.aClass5_Sub12_Sub2_1.method8617();
												Static55.aStringArray3[local219] = Static167.aClass5_Sub12_Sub2_1.method8617();
												if (Static55.aStringArray3[local219].equals("")) {
													Static55.aStringArray3[local219] = Static368.aStringArray26[local219];
												}
												Static107.aStringArray9[local219] = Static167.aClass5_Sub12_Sub2_1.method8617();
												Static611.aStringArray44[local219] = Static167.aClass5_Sub12_Sub2_1.method8617();
												if (Static611.aStringArray44[local219].equals("")) {
													Static611.aStringArray44[local219] = Static107.aStringArray9[local219];
												}
												Static497.aBooleanArray50[local219] = false;
											}
											Static86.aClass136_37 = null;
											Static543.anInt10432 = Static278.anInt4551;
											return true;
										} else if (Static86.aClass136_37 == Static581.aClass136_180) {
											local219 = Static167.aClass5_Sub12_Sub2_1.method8623();
											local1286 = Static167.aClass5_Sub12_Sub2_1.method8617();
											Static414.method6321();
											Static410.method6261(local1286, local219);
											Static86.aClass136_37 = null;
											return true;
										} else if (Static98.aClass136_93 == Static86.aClass136_37) {
											local219 = Static167.aClass5_Sub12_Sub2_1.method8623();
											Static414.method6321();
											Static285.method4275(-1, 3, -1, local219);
											Static86.aClass136_37 = null;
											return true;
										} else if (Static124.aClass136_202 == Static86.aClass136_37) {
											local298 = Static167.aClass5_Sub12_Sub2_1.method8615() == 1;
											Static414.method6321();
											Static186.aBoolean276 = local298;
											Static86.aClass136_37 = null;
											return true;
										} else if (Static86.aClass136_37 == Static312.aClass136_118) {
											local219 = Static167.aClass5_Sub12_Sub2_1.method8607();
											local73 = Static167.aClass5_Sub12_Sub2_1.method8601();
											Static414.method6321();
											Static348.method5297(local219, local73);
											Static86.aClass136_37 = null;
											return true;
										} else if (Static356.aClass136_130 == Static86.aClass136_37) {
											Static408.anInt7024 = Static167.aClass5_Sub12_Sub2_1.method8645();
											Static602.anInt9884 = Static167.aClass5_Sub12_Sub2_1.method8635() << 3;
											Static148.anInt4149 = Static167.aClass5_Sub12_Sub2_1.method8592() << 3;
											for (@Pc(2326) Class5_Sub17 local2326 = (Class5_Sub17) Static402.aClass81_65.method1608(); local2326 != null; local2326 = (Class5_Sub17) Static402.aClass81_65.method1610()) {
												local73 = (int) (local2326.aLong282 >> 28 & 0x3L);
												local523 = (int) (local2326.aLong282 & 0x3FFFL);
												local320 = local523 - Static113.anInt1785;
												local675 = (int) (local2326.aLong282 >> 14 & 0x3FFFL);
												local336 = local675 - Static622.anInt10087;
												if (local73 == Static408.anInt7024 && Static148.anInt4149 <= local320 && Static148.anInt4149 + 8 > local320 && Static602.anInt9884 <= local336 && local336 < Static602.anInt9884 + 8) {
													local2326.method8911();
													if (local320 >= 0 && local336 >= 0 && Static111.anInt1752 > local320 && local336 < Static279.anInt4567) {
														Static292.method4306(local320, Static408.anInt7024, local336);
													}
												}
											}
											@Pc(2423) Class5_Sub35 local2423;
											for (local2423 = (Class5_Sub35) Static404.aClass306_36.method7313(); local2423 != null; local2423 = (Class5_Sub35) Static404.aClass306_36.method7301()) {
												if (Static148.anInt4149 <= local2423.anInt6495 && Static148.anInt4149 + 8 > local2423.anInt6495 && Static602.anInt9884 <= local2423.anInt6497 && local2423.anInt6497 < Static602.anInt9884 + 8 && Static408.anInt7024 == local2423.anInt6492) {
													local2423.aBoolean540 = true;
												}
											}
											for (local2423 = (Class5_Sub35) Static498.aClass306_55.method7313(); local2423 != null; local2423 = (Class5_Sub35) Static498.aClass306_55.method7301()) {
												if (local2423.anInt6495 >= Static148.anInt4149 && local2423.anInt6495 < Static148.anInt4149 + 8 && local2423.anInt6497 >= Static602.anInt9884 && local2423.anInt6497 < Static602.anInt9884 + 8 && Static408.anInt7024 == local2423.anInt6492) {
													local2423.aBoolean540 = true;
												}
											}
											Static86.aClass136_37 = null;
											return true;
										} else if (Static625.aClass136_194 == Static86.aClass136_37) {
											local219 = Static167.aClass5_Sub12_Sub2_1.method8629();
											local73 = Static167.aClass5_Sub12_Sub2_1.method8606();
											Static564.aClass304_1.method7294(local73, local219);
											Static86.aClass136_37 = null;
											return true;
										} else if (Static86.aClass136_37 == Static582.aClass136_182) {
											local219 = Static167.aClass5_Sub12_Sub2_1.method8631();
											Static414.method6321();
											Static44.method753(local219);
											Static86.aClass136_37 = null;
											return true;
										} else if (Static86.aClass136_37 == Static597.aClass136_184) {
											Static516.method7430(Static527.aClass148_35);
											Static86.aClass136_37 = null;
											return true;
										} else if (Static86.aClass136_37 == Static511.aClass136_166) {
											local219 = Static167.aClass5_Sub12_Sub2_1.method8640();
											if (local219 == 65535) {
												local219 = -1;
											}
											local73 = Static167.aClass5_Sub12_Sub2_1.method8623();
											Static414.method6321();
											Static285.method4275(-1, 1, local219, local73);
											Static86.aClass136_37 = null;
											return true;
										} else if (Static86.aClass136_37 == Static88.aClass136_39) {
											local1280 = Static167.aClass5_Sub12_Sub2_1.method8617();
											@Pc(2609) Object[] local2609 = new Object[local1280.length() + 1];
											for (local523 = local1280.length() - 1; local523 >= 0; local523--) {
												if (local1280.charAt(local523) == 's') {
													local2609[local523 + 1] = Static167.aClass5_Sub12_Sub2_1.method8617();
												} else {
													local2609[local523 + 1] = Integer.valueOf(Static167.aClass5_Sub12_Sub2_1.method8623());
												}
											}
											local2609[0] = Integer.valueOf(Static167.aClass5_Sub12_Sub2_1.method8623());
											Static414.method6321();
											@Pc(2664) Class5_Sub9 local2664 = new Class5_Sub9();
											local2664.anObjectArray1 = local2609;
											Static82.method1317(local2664);
											Static86.aClass136_37 = null;
											return true;
										} else if (Static36.aClass136_20 == Static86.aClass136_37) {
											local219 = Static167.aClass5_Sub12_Sub2_1.method8631();
											local73 = Static167.aClass5_Sub12_Sub2_1.method8645();
											Static564.aClass304_1.method7297(local219, local73);
											Static86.aClass136_37 = null;
											return true;
										} else if (Static319.aClass136_119 == Static86.aClass136_37) {
											Static516.method7430(Static201.aClass148_20);
											Static86.aClass136_37 = null;
											return true;
										} else if (Static290.aClass136_113 == Static86.aClass136_37) {
											local219 = Static167.aClass5_Sub12_Sub2_1.method8629();
											Static414.method6321();
											Static86.aClass136_37 = null;
											if (local219 == -1) {
												Static609.anInt9978 = -1;
												Static394.anInt6873 = -1;
											} else {
												local73 = local219 >> 14 & 0x3FFF;
												local523 = local219 & 0x3FFF;
												local73 -= Static113.anInt1785;
												if (local73 < 0) {
													local73 = 0;
												} else if (local73 >= Static111.anInt1752) {
													local73 = Static111.anInt1752;
												}
												local523 -= Static622.anInt10087;
												if (local523 < 0) {
													local523 = 0;
												} else if (Static279.anInt4567 <= local523) {
													local523 = Static279.anInt4567;
												}
												Static394.anInt6873 = (local73 << 9) + 256;
												Static609.anInt9978 = (local523 << 9) + 256;
											}
											return true;
										} else if (Static86.aClass136_37 == Static492.aClass136_160) {
											local219 = Static167.aClass5_Sub12_Sub2_1.method8645();
											local73 = Static167.aClass5_Sub12_Sub2_1.method8633();
											Static414.method6321();
											Static529.method7565(local219, local73, true);
											Static86.aClass136_37 = null;
											return true;
										} else if (Static86.aClass136_37 == Static61.aClass136_30) {
											Static148.anInt4149 = Static167.aClass5_Sub12_Sub2_1.method8649() << 3;
											Static602.anInt9884 = Static167.aClass5_Sub12_Sub2_1.method8592() << 3;
											Static408.anInt7024 = Static167.aClass5_Sub12_Sub2_1.method8639();
											while (Static167.aClass5_Sub12_Sub2_1.anInt10154 < Static60.anInt3115) {
												@Pc(2836) Class148 local2836 = Static424.method6392()[Static167.aClass5_Sub12_Sub2_1.method8645()];
												Static516.method7430(local2836);
											}
											Static86.aClass136_37 = null;
											return true;
										} else if (Static86.aClass136_37 == Static370.aClass136_135) {
											local219 = Static167.aClass5_Sub12_Sub2_1.method8623();
											local73 = Static167.aClass5_Sub12_Sub2_1.method8631();
											if (local73 == 65535) {
												local73 = -1;
											}
											local523 = Static167.aClass5_Sub12_Sub2_1.method8650();
											Static414.method6321();
											Static482.method8274(local219, local523, local73);
											@Pc(2880) Class329 local2880 = Static479.aClass348_1.method8197(local73);
											Static111.method1634(local523, local2880.anInt9068, local2880.anInt9039, local2880.anInt9098);
											Static293.method4315(local2880.anInt9074, local2880.anInt9043, local2880.anInt9053, local523);
											Static86.aClass136_37 = null;
											return true;
										} else if (Static86.aClass136_37 == Static582.aClass136_181) {
											local219 = Static167.aClass5_Sub12_Sub2_1.method8639();
											local73 = Static167.aClass5_Sub12_Sub2_1.method8639();
											if (local219 == 255) {
												local73 = -1;
												local219 = -1;
											}
											Static133.method3507(local219, local73);
											Static86.aClass136_37 = null;
											return true;
										} else if (Static86.aClass136_37 == Static550.aClass136_138) {
											Static423.method6389(Static167.aClass5_Sub12_Sub2_1, Static60.anInt3115);
											Static86.aClass136_37 = null;
											return true;
										} else if (Static86.aClass136_37 == Static259.aClass136_60) {
											@Pc(3014) boolean local3014;
											while (Static167.aClass5_Sub12_Sub2_1.anInt10154 < Static60.anInt3115) {
												local298 = Static167.aClass5_Sub12_Sub2_1.method8645() == 1;
												local1286 = Static167.aClass5_Sub12_Sub2_1.method8617();
												local1638 = Static167.aClass5_Sub12_Sub2_1.method8617();
												local320 = Static167.aClass5_Sub12_Sub2_1.method8631();
												local675 = Static167.aClass5_Sub12_Sub2_1.method8645();
												local1656 = "";
												local441 = false;
												if (local320 > 0) {
													local1656 = Static167.aClass5_Sub12_Sub2_1.method8617();
													local441 = Static167.aClass5_Sub12_Sub2_1.method8645() == 1;
												}
												for (local1527 = 0; local1527 < Static74.anInt1238; local1527++) {
													if (local298) {
														if (local1638.equals(Static182.aStringArray13[local1527])) {
															Static182.aStringArray13[local1527] = local1286;
															local1286 = null;
															Static228.aStringArray17[local1527] = local1638;
															break;
														}
													} else if (local1286.equals(Static182.aStringArray13[local1527])) {
														if (local320 != Static484.anIntArray647[local1527]) {
															local3014 = true;
															for (@Pc(3019) Class14_Sub2_Sub1 local3019 = (Class14_Sub2_Sub1) Static172.aClass363_3.method8484(); local3019 != null; local3019 = (Class14_Sub2_Sub1) Static172.aClass363_3.method8478()) {
																if (local3019.aString6.equals(local1286)) {
																	if (local320 != 0 && local3019.aShort16 == 0) {
																		local3019.method8904();
																		local3014 = false;
																	} else if (local320 == 0 && local3019.aShort16 != 0) {
																		local3014 = false;
																		local3019.method8904();
																	}
																}
															}
															if (local3014) {
																Static172.aClass363_3.method8480(new Class14_Sub2_Sub1(local1286, local320));
															}
															Static484.anIntArray647[local1527] = local320;
														}
														Static228.aStringArray17[local1527] = local1638;
														Static237.aStringArray18[local1527] = local1656;
														Static42.anIntArray57[local1527] = local675;
														local1286 = null;
														Static338.aBooleanArray36[local1527] = local441;
														break;
													}
												}
												if (local1286 != null && Static74.anInt1238 < 200) {
													Static182.aStringArray13[Static74.anInt1238] = local1286;
													Static228.aStringArray17[Static74.anInt1238] = local1638;
													Static484.anIntArray647[Static74.anInt1238] = local320;
													Static237.aStringArray18[Static74.anInt1238] = local1656;
													Static42.anIntArray57[Static74.anInt1238] = local675;
													Static338.aBooleanArray36[Static74.anInt1238] = local441;
													Static74.anInt1238++;
												}
											}
											Static445.anInt7509 = 2;
											Static543.anInt10432 = Static278.anInt4551;
											local73 = Static74.anInt1238;
											while (local73 > 0) {
												local298 = true;
												local73--;
												for (local523 = 0; local523 < local73; local523++) {
													if (Static282.aClass109_2.anInt2756 != Static484.anIntArray647[local523] && Static282.aClass109_2.anInt2756 == Static484.anIntArray647[local523 + 1] || Static484.anIntArray647[local523] == 0 && Static484.anIntArray647[local523 + 1] != 0) {
														local320 = Static484.anIntArray647[local523];
														Static484.anIntArray647[local523] = Static484.anIntArray647[local523 + 1];
														Static484.anIntArray647[local523 + 1] = local320;
														local1652 = Static237.aStringArray18[local523];
														Static237.aStringArray18[local523] = Static237.aStringArray18[local523 + 1];
														Static237.aStringArray18[local523 + 1] = local1652;
														local1656 = Static182.aStringArray13[local523];
														Static182.aStringArray13[local523] = Static182.aStringArray13[local523 + 1];
														Static182.aStringArray13[local523 + 1] = local1656;
														local1970 = Static228.aStringArray17[local523];
														Static228.aStringArray17[local523] = Static228.aStringArray17[local523 + 1];
														Static228.aStringArray17[local523 + 1] = local1970;
														local1527 = Static42.anIntArray57[local523];
														Static42.anIntArray57[local523] = Static42.anIntArray57[local523 + 1];
														Static42.anIntArray57[local523 + 1] = local1527;
														local3014 = Static338.aBooleanArray36[local523];
														Static338.aBooleanArray36[local523] = Static338.aBooleanArray36[local523 + 1];
														local298 = false;
														Static338.aBooleanArray36[local523 + 1] = local3014;
													}
												}
												if (local298) {
													break;
												}
											}
											Static86.aClass136_37 = null;
											return true;
										} else if (Static86.aClass136_37 == Static597.aClass136_185) {
											local219 = Static167.aClass5_Sub12_Sub2_1.method8629();
											local73 = Static167.aClass5_Sub12_Sub2_1.method8634();
											Static414.method6321();
											Static137.method2066(local73, local219);
											Static86.aClass136_37 = null;
											return true;
										} else if (Static86.aClass136_37 == Static32.aClass136_165) {
											Static516.method7430(Static284.aClass148_24);
											Static86.aClass136_37 = null;
											return true;
										} else if (Static86.aClass136_37 == Static213.aClass136_82) {
											local219 = Static167.aClass5_Sub12_Sub2_1.method8601();
											local73 = Static167.aClass5_Sub12_Sub2_1.method8606();
											Static414.method6321();
											Static535.method7636(local219, local73);
											Static86.aClass136_37 = null;
											return true;
										} else if (Static596.aClass136_183 == Static86.aClass136_37) {
											Static414.method6321();
											Static342.method5254();
											Static86.aClass136_37 = null;
											return true;
										} else if (Static86.aClass136_37 == Static104.aClass136_45) {
											local1280 = Static167.aClass5_Sub12_Sub2_1.method8617();
											local73 = Static167.aClass5_Sub12_Sub2_1.method8631();
											local1638 = Static473.aClass171_1.method4004(local73).method8745(Static167.aClass5_Sub12_Sub2_1);
											Static45.method767((String) null, local1638, local1280, 0, 19, local1280, local1280, local73);
											Static86.aClass136_37 = null;
											return true;
										} else if (Static47.aClass136_23 == Static86.aClass136_37) {
											Static148.anInt4149 = Static167.aClass5_Sub12_Sub2_1.method8635() << 3;
											Static408.anInt7024 = Static167.aClass5_Sub12_Sub2_1.method8639();
											Static602.anInt9884 = Static167.aClass5_Sub12_Sub2_1.method8635() << 3;
											Static86.aClass136_37 = null;
											return true;
										} else if (Static296.aClass136_114 == Static86.aClass136_37) {
											local219 = Static167.aClass5_Sub12_Sub2_1.method8640();
											local73 = Static167.aClass5_Sub12_Sub2_1.method8606();
											Static414.method6321();
											Static540.method7698(local219, local73);
											Static86.aClass136_37 = null;
											return true;
										} else if (Static86.aClass136_37 == Static240.aClass136_88) {
											local219 = Static167.aClass5_Sub12_Sub2_1.method8639();
											Static414.method6321();
											Static71.anInt1127 = local219;
											Static86.aClass136_37 = null;
											return true;
										} else if (Static86.aClass136_37 == Static450.aClass136_152) {
											local1280 = Static167.aClass5_Sub12_Sub2_1.method8617();
											local741 = Static167.aClass5_Sub12_Sub2_1.method8645() == 1;
											if (local741) {
												local1286 = Static167.aClass5_Sub12_Sub2_1.method8617();
											} else {
												local1286 = local1280;
											}
											local320 = Static167.aClass5_Sub12_Sub2_1.method8631();
											@Pc(3526) byte local3526 = Static167.aClass5_Sub12_Sub2_1.method8635();
											local1920 = false;
											if (local3526 == -128) {
												local1920 = true;
											}
											if (local1920) {
												if (Static122.anInt1983 == 0) {
													Static86.aClass136_37 = null;
													return true;
												}
												for (local1523 = 0; local1523 < Static122.anInt1983 && (!Static60.aClass231Array3[local1523].aString99.equals(local1286) || Static60.aClass231Array3[local1523].anInt6354 != local320); local1523++) {
												}
												if (Static122.anInt1983 > local1523) {
													while (Static122.anInt1983 - 1 > local1523) {
														Static60.aClass231Array3[local1523] = Static60.aClass231Array3[local1523 + 1];
														local1523++;
													}
													Static122.anInt1983--;
													Static60.aClass231Array3[Static122.anInt1983] = null;
												}
											} else {
												local1970 = Static167.aClass5_Sub12_Sub2_1.method8617();
												local462 = new Class231();
												local462.aString98 = local1280;
												local462.aString99 = local1286;
												local462.aString97 = Static250.method3883(local462.aString99);
												local462.aString96 = local1970;
												local462.anInt6354 = local320;
												local462.aByte89 = local3526;
												for (local437 = Static122.anInt1983 - 1; local437 >= 0; local437--) {
													local444 = Static60.aClass231Array3[local437].aString97.compareTo(local462.aString97);
													if (local444 == 0) {
														Static60.aClass231Array3[local437].anInt6354 = local320;
														Static60.aClass231Array3[local437].aByte89 = local3526;
														Static60.aClass231Array3[local437].aString96 = local1970;
														if (local1286.equals(Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aString42)) {
															Static3.aByte1 = local3526;
														}
														Static86.aClass136_37 = null;
														Static324.anInt5595 = Static278.anInt4551;
														return true;
													}
													if (local444 < 0) {
														break;
													}
												}
												if (Static122.anInt1983 >= Static60.aClass231Array3.length) {
													Static86.aClass136_37 = null;
													return true;
												}
												for (local444 = Static122.anInt1983 - 1; local444 > local437; local444--) {
													Static60.aClass231Array3[local444 + 1] = Static60.aClass231Array3[local444];
												}
												if (Static122.anInt1983 == 0) {
													Static60.aClass231Array3 = new Class231[100];
												}
												Static60.aClass231Array3[local437 + 1] = local462;
												Static122.anInt1983++;
												if (local1286.equals(Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aString42)) {
													Static3.aByte1 = local3526;
												}
											}
											Static324.anInt5595 = Static278.anInt4551;
											Static86.aClass136_37 = null;
											return true;
										} else if (Static447.aClass136_149 == Static86.aClass136_37) {
											local219 = Static167.aClass5_Sub12_Sub2_1.method8631();
											if (local219 == 65535) {
												local219 = -1;
											}
											local73 = Static167.aClass5_Sub12_Sub2_1.method8629();
											Static414.method6321();
											Static285.method4275(-1, 2, local219, local73);
											Static86.aClass136_37 = null;
											return true;
										} else if (Static86.aClass136_37 == Static366.aClass136_133) {
											Static490.aString118 = Static60.anInt3115 > 2 ? Static167.aClass5_Sub12_Sub2_1.method8617() : Static76.aClass58_27.method1237(Static321.anInt5554);
											Static106.anInt1655 = Static60.anInt3115 > 0 ? Static167.aClass5_Sub12_Sub2_1.method8631() : -1;
											Static86.aClass136_37 = null;
											if (Static106.anInt1655 == 65535) {
												Static106.anInt1655 = -1;
											}
											return true;
										} else if (Static173.aClass136_76 == Static86.aClass136_37) {
											local219 = Static167.aClass5_Sub12_Sub2_1.method8623();
											local73 = Static167.aClass5_Sub12_Sub2_1.method8633();
											local523 = Static167.aClass5_Sub12_Sub2_1.method8640();
											Static414.method6321();
											Static443.method6582(local219, local73 + (local523 << 16));
											Static86.aClass136_37 = null;
											return true;
										} else if (Static86.aClass136_37 == Static37.aClass136_22) {
											local219 = Static167.aClass5_Sub12_Sub2_1.method8633();
											local73 = Static167.aClass5_Sub12_Sub2_1.method8629();
											local523 = Static167.aClass5_Sub12_Sub2_1.method8645();
											Static414.method6321();
											local1190 = (Class5_Sub15) Static183.aClass81_27.method1599((long) local73);
											if (local1190 != null) {
												Static177.method2689(false, local1190.anInt2409 != local219, local1190);
											}
											Static94.method8742(local523, local219, local73, false);
											Static86.aClass136_37 = null;
											return true;
										} else if (Static390.aClass136_141 == Static86.aClass136_37) {
											Static111.anInt1765 = Static167.aClass5_Sub12_Sub2_1.method8639();
											Static75.anInt1264 = Static167.aClass5_Sub12_Sub2_1.method8607();
											Static86.aClass136_37 = null;
											return true;
										} else {
											@Pc(4428) int local4428;
											@Pc(4012) int local4012;
											@Pc(4383) int local4383;
											@Pc(4448) int local4448;
											@Pc(4009) boolean local4009;
											@Pc(4225) boolean local4225;
											@Pc(4173) int local4173;
											if (Static574.aClass136_178 == Static86.aClass136_37) {
												local219 = Static167.aClass5_Sub12_Sub2_1.method8645();
												local73 = Static167.aClass5_Sub12_Sub2_1.method8623();
												local523 = Static167.aClass5_Sub12_Sub2_1.method8640();
												local320 = Static167.aClass5_Sub12_Sub2_1.method8631();
												local675 = Static167.aClass5_Sub12_Sub2_1.method8606();
												local336 = Static167.aClass5_Sub12_Sub2_1.method8607();
												local1523 = local336 & 0x7;
												local1527 = local336 >> 3 & 0xF;
												if (local1527 == 15) {
													local1527 = -1;
												}
												if (local73 >> 30 == 0) {
													@Pc(4093) Class200 local4093;
													@Pc(4099) Class200 local4099;
													@Pc(4078) Class68 local4078;
													if (local73 >> 29 != 0) {
														local437 = local73 & 0xFFFF;
														@Pc(4208) Class5_Sub13 local4208 = (Class5_Sub13) Static51.aClass81_11.method1599((long) local437);
														if (local4208 != null) {
															@Pc(4213) Class14_Sub1_Sub1_Sub3_Sub2 local4213 = local4208.aClass14_Sub1_Sub1_Sub3_Sub2_1;
															if (local523 == 65535) {
																local523 = -1;
															}
															@Pc(4223) Class315 local4223 = local4213.aClass315Array3[local219];
															local4225 = true;
															local4173 = local4223.anInt8720;
															if (local523 != -1 && local4173 != -1) {
																if (local4173 == local523) {
																	local4078 = Static452.aClass170_4.method4001(local523);
																	if (local4078.aBoolean114 && local4078.anInt1416 != -1) {
																		local4093 = Static396.aClass359_2.method8415(local4078.anInt1416);
																		@Pc(4259) int local4259 = local4093.anInt4871;
																		if (local4259 == 0 || local4259 == 2) {
																			local4225 = false;
																		} else if (local4259 == 1) {
																			local4225 = true;
																		}
																	}
																} else {
																	local4078 = Static452.aClass170_4.method4001(local523);
																	@Pc(4290) Class68 local4290 = Static452.aClass170_4.method4001(local4173);
																	if (local4078.anInt1416 != -1 && local4290.anInt1416 != -1) {
																		local4099 = Static396.aClass359_2.method8415(local4078.anInt1416);
																		@Pc(4311) Class200 local4311 = Static396.aClass359_2.method8415(local4290.anInt1416);
																		if (local4311.anInt4870 > local4099.anInt4870) {
																			local4225 = false;
																		}
																	}
																}
															}
															if (local4225) {
																local4223.anInt8725 = 0;
																local4223.anInt8724 = 0;
																local4223.anInt8720 = local523;
																local4223.anInt8722 = local320;
																local4223.anInt8719 = 1;
																local4223.anInt8721 = Static235.anInt3998 + local675;
																local4223.anInt8727 = local1527;
																local4223.anInt8723 = local1523;
																if (local4223.anInt8721 > Static235.anInt3998) {
																	local4223.anInt8725 = -1;
																}
																if (local4223.anInt8720 == 65535) {
																	local4223.anInt8720 = -1;
																}
																if (local4223.anInt8720 != -1 && local4223.anInt8721 == Static235.anInt3998) {
																	local4383 = Static452.aClass170_4.method4001(local4223.anInt8720).anInt1416;
																	if (local4383 != -1) {
																		local4093 = Static396.aClass359_2.method8415(local4383);
																		if (local4093 != null && local4093.anIntArray389 != null && !local4213.aBoolean255) {
																			Static270.method4083(local4093, 0, local4213);
																		}
																	}
																}
															}
														}
													} else if (local73 >> 28 != 0) {
														local437 = local73 & 0xFFFF;
														@Pc(3989) Class14_Sub1_Sub1_Sub3_Sub1 local3989;
														if (Static620.anInt10055 == local437) {
															local3989 = Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1;
														} else {
															local3989 = Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1[local437];
														}
														if (local3989 != null) {
															@Pc(4002) Class315 local4002 = local3989.aClass315Array3[local219];
															if (local523 == 65535) {
																local523 = -1;
															}
															local4009 = true;
															local4012 = local4002.anInt8720;
															@Pc(4044) Class200 local4044;
															if (local523 != -1 && local4012 != -1) {
																@Pc(4031) Class68 local4031;
																if (local4012 == local523) {
																	local4031 = Static452.aClass170_4.method4001(local523);
																	if (local4031.aBoolean114 && local4031.anInt1416 != -1) {
																		local4044 = Static396.aClass359_2.method8415(local4031.anInt1416);
																		@Pc(4047) int local4047 = local4044.anInt4871;
																		if (local4047 == 0 || local4047 == 2) {
																			local4009 = false;
																		} else if (local4047 == 1) {
																			local4009 = true;
																		}
																	}
																} else {
																	local4031 = Static452.aClass170_4.method4001(local523);
																	local4078 = Static452.aClass170_4.method4001(local4012);
																	if (local4031.anInt1416 != -1 && local4078.anInt1416 != -1) {
																		local4093 = Static396.aClass359_2.method8415(local4031.anInt1416);
																		local4099 = Static396.aClass359_2.method8415(local4078.anInt1416);
																		if (local4099.anInt4870 > local4093.anInt4870) {
																			local4009 = false;
																		}
																	}
																}
															}
															if (local4009) {
																local4002.anInt8720 = local523;
																local4002.anInt8721 = local675 + Static235.anInt3998;
																local4002.anInt8722 = local320;
																local4002.anInt8727 = local1527;
																local4002.anInt8723 = local1523;
																local4002.anInt8725 = 0;
																local4002.anInt8719 = 1;
																local4002.anInt8724 = 0;
																if (Static235.anInt3998 < local4002.anInt8721) {
																	local4002.anInt8725 = -1;
																}
																if (local4002.anInt8720 == 65535) {
																	local4002.anInt8720 = -1;
																}
																if (local4002.anInt8720 != -1 && local4002.anInt8721 == Static235.anInt3998) {
																	local4173 = Static452.aClass170_4.method4001(local4002.anInt8720).anInt1416;
																	if (local4173 != -1) {
																		local4044 = Static396.aClass359_2.method8415(local4173);
																		if (local4044 != null && local4044.anIntArray389 != null && !local3989.aBoolean255) {
																			Static270.method4083(local4044, 0, local3989);
																		}
																	}
																}
															}
														}
													}
												} else {
													local437 = local73 >> 28 & 0x3;
													local444 = (local73 >> 14 & 0x3FFF) - Static113.anInt1785;
													local4428 = (local73 & 0x3FFF) - Static622.anInt10087;
													if (local444 >= 0 && local4428 >= 0 && local444 < Static111.anInt1752 && Static279.anInt4567 > local4428) {
														local4448 = local444 * 512 + 256;
														local4012 = local4428 * 512 + 256;
														local4173 = local437;
														if (local437 < 3 && Static353.method5596(local444, local4428)) {
															local4173 = local437 + 1;
														}
														@Pc(4488) Class14_Sub1_Sub1_Sub4 local4488 = new Class14_Sub1_Sub1_Sub4(local523, local675, Static235.anInt3998, local437, local4173, local4448, Static600.method8378(local4012, local4448, local437) - local320, local4012, local444, local444, local4428, local4428, local1523);
														Static334.aClass306_29.method7303(new Class5_Sub4_Sub9(local4488));
													}
												}
												Static86.aClass136_37 = null;
												return true;
											} else if (Static465.aClass136_144 == Static86.aClass136_37) {
												local219 = Static167.aClass5_Sub12_Sub2_1.method8607();
												local73 = Static167.aClass5_Sub12_Sub2_1.method8631();
												local741 = (local219 & 0x1) == 1;
												Static215.method3280(local73, local741);
												Static276.anIntArray718[Static356.anInt6350++ & 0x1F] = local73;
												Static86.aClass136_37 = null;
												return true;
											} else if (Static355.aClass136_128 == Static86.aClass136_37) {
												local219 = Static167.aClass5_Sub12_Sub2_1.method8601();
												local73 = Static167.aClass5_Sub12_Sub2_1.method8631();
												Static414.method6321();
												Static12.method232(local73, local219);
												Static86.aClass136_37 = null;
												return true;
											} else if (Static458.aClass136_156 == Static86.aClass136_37) {
												Static585.aClass219_3 = Static518.method7450(Static167.aClass5_Sub12_Sub2_1.method8645());
												Static86.aClass136_37 = null;
												return true;
											} else if (Static100.aClass136_42 == Static86.aClass136_37) {
												local219 = Static167.aClass5_Sub12_Sub2_1.method8631();
												local73 = Static167.aClass5_Sub12_Sub2_1.method8631();
												local523 = Static167.aClass5_Sub12_Sub2_1.method8631();
												Static414.method6321();
												if (Static441.aClass357ArrayArray1[local219] != null) {
													for (local320 = local73; local320 < local523; local320++) {
														local675 = Static167.aClass5_Sub12_Sub2_1.method8657();
														if (local320 < Static441.aClass357ArrayArray1[local219].length && Static441.aClass357ArrayArray1[local219][local320] != null) {
															Static441.aClass357ArrayArray1[local219][local320].anInt9811 = local675;
														}
													}
												}
												Static86.aClass136_37 = null;
												return true;
											} else {
												@Pc(4663) long local4663;
												@Pc(4673) long local4673;
												if (Static140.aClass136_65 == Static86.aClass136_37) {
													local298 = Static167.aClass5_Sub12_Sub2_1.method8645() == 1;
													local1286 = Static167.aClass5_Sub12_Sub2_1.method8617();
													local1638 = local1286;
													if (local298) {
														local1638 = Static167.aClass5_Sub12_Sub2_1.method8617();
													}
													local4663 = Static167.aClass5_Sub12_Sub2_1.method8644();
													local1781 = (long) Static167.aClass5_Sub12_Sub2_1.method8631();
													local4673 = (long) Static167.aClass5_Sub12_Sub2_1.method8657();
													local444 = Static167.aClass5_Sub12_Sub2_1.method8645();
													@Pc(4683) long local4683 = local4673 + (local1781 << 32);
													local4225 = false;
													local4173 = 0;
													while (true) {
														if (local4173 >= 100) {
															if (local444 <= 1) {
																if (Static205.aBoolean296 && !Static33.aBoolean54 || Static324.aBoolean473) {
																	local4225 = true;
																} else if (Static41.method724(local1638)) {
																	local4225 = true;
																}
															}
															break;
														}
														if (local4683 == Static20.aLongArray1[local4173]) {
															local4225 = true;
															break;
														}
														local4173++;
													}
													if (!local4225 && Static164.anInt5717 == 0) {
														Static20.aLongArray1[Static387.anInt6779] = local4683;
														Static387.anInt6779 = (Static387.anInt6779 + 1) % 100;
														@Pc(4747) String local4747 = Static441.method6571(Static282.method4241(Static167.aClass5_Sub12_Sub2_1));
														if (local444 == 2 || local444 == 3) {
															Static45.method767(Static67.method1113(local4663), local4747, local1286, 0, 9, "<img=1>" + local1638, "<img=1>" + local1286, -1);
														} else if (local444 == 1) {
															Static45.method767(Static67.method1113(local4663), local4747, local1286, 0, 9, "<img=0>" + local1638, "<img=0>" + local1286, -1);
														} else {
															Static45.method767(Static67.method1113(local4663), local4747, local1286, 0, 9, local1638, local1286, -1);
														}
													}
													Static86.aClass136_37 = null;
													return true;
												} else if (Static206.aClass136_80 == Static86.aClass136_37) {
													local1280 = Static167.aClass5_Sub12_Sub2_1.method8617();
													local73 = Static167.aClass5_Sub12_Sub2_1.method8631();
													Static414.method6321();
													Static87.method1367(local73, local1280);
													Static86.aClass136_37 = null;
													return true;
												} else if (Static607.aClass136_188 == Static86.aClass136_37) {
													local219 = Static167.aClass5_Sub12_Sub2_1.method8606();
													if (local219 == 65535) {
														local219 = -1;
													}
													local73 = Static167.aClass5_Sub12_Sub2_1.method8645();
													local1638 = Static167.aClass5_Sub12_Sub2_1.method8617();
													local320 = Static167.aClass5_Sub12_Sub2_1.method8645();
													if (local73 >= 1 && local73 <= 8) {
														if (local1638.equalsIgnoreCase("null")) {
															local1638 = null;
														}
														Static195.aStringArray14[local73 - 1] = local1638;
														Static259.anIntArray173[local73 - 1] = local219;
														Static94.aBooleanArray59[local73 - 1] = local320 == 0;
													}
													Static86.aClass136_37 = null;
													return true;
												} else if (Static86.aClass136_37 == Static424.aClass136_146) {
													local219 = Static167.aClass5_Sub12_Sub2_1.method8631();
													local73 = Static167.aClass5_Sub12_Sub2_1.method8645();
													local741 = (local73 & 0x1) == 1;
													Static502.method7336(local219, local741);
													local320 = Static167.aClass5_Sub12_Sub2_1.method8631();
													for (local675 = 0; local675 < local320; local675++) {
														local336 = Static167.aClass5_Sub12_Sub2_1.method8615();
														if (local336 == 255) {
															local336 = Static167.aClass5_Sub12_Sub2_1.method8623();
														}
														local1523 = Static167.aClass5_Sub12_Sub2_1.method8640();
														Static79.method6908(local741, local675, local336, local219, local1523 - 1);
													}
													Static276.anIntArray718[Static356.anInt6350++ & 0x1F] = local219;
													Static86.aClass136_37 = null;
													return true;
												} else if (Static86.aClass136_37 == Static347.aClass136_179) {
													local298 = Static167.aClass5_Sub12_Sub2_1.method8645() == 1;
													local1286 = Static167.aClass5_Sub12_Sub2_1.method8617();
													local1638 = local1286;
													if (local298) {
														local1638 = Static167.aClass5_Sub12_Sub2_1.method8617();
													}
													local4663 = (long) Static167.aClass5_Sub12_Sub2_1.method8631();
													local1781 = (long) Static167.aClass5_Sub12_Sub2_1.method8657();
													local1527 = Static167.aClass5_Sub12_Sub2_1.method8645();
													local437 = Static167.aClass5_Sub12_Sub2_1.method8631();
													@Pc(5045) long local5045 = (local4663 << 32) + local1781;
													local4009 = false;
													local4012 = 0;
													while (true) {
														if (local4012 >= 100) {
															if (local1527 <= 1 && Static41.method724(local1638)) {
																local4009 = true;
															}
															break;
														}
														if (local5045 == Static20.aLongArray1[local4012]) {
															local4009 = true;
															break;
														}
														local4012++;
													}
													if (!local4009 && Static164.anInt5717 == 0) {
														Static20.aLongArray1[Static387.anInt6779] = local5045;
														Static387.anInt6779 = (Static387.anInt6779 + 1) % 100;
														@Pc(5098) String local5098 = Static473.aClass171_1.method4004(local437).method8745(Static167.aClass5_Sub12_Sub2_1);
														if (local1527 == 2) {
															Static45.method767((String) null, local5098, local1286, 0, 18, "<img=1>" + local1638, "<img=1>" + local1286, local437);
														} else if (local1527 == 1) {
															Static45.method767((String) null, local5098, local1286, 0, 18, "<img=0>" + local1638, "<img=0>" + local1286, local437);
														} else {
															Static45.method767((String) null, local5098, local1286, 0, 18, local1638, local1286, local437);
														}
													}
													Static86.aClass136_37 = null;
													return true;
												} else if (Static215.aClass136_84 == Static86.aClass136_37) {
													local219 = Static167.aClass5_Sub12_Sub2_1.method8614();
													local73 = Static167.aClass5_Sub12_Sub2_1.method8623();
													local523 = Static167.aClass5_Sub12_Sub2_1.method8645();
													local1642 = "";
													local1652 = local1642;
													if ((local523 & 0x1) != 0) {
														local1642 = Static167.aClass5_Sub12_Sub2_1.method8617();
														if ((local523 & 0x2) == 0) {
															local1652 = local1642;
														} else {
															local1652 = Static167.aClass5_Sub12_Sub2_1.method8617();
														}
													}
													local1656 = Static167.aClass5_Sub12_Sub2_1.method8617();
													if (local219 == 99) {
														Static177.method2690(local1656);
													} else if (local1652.equals("") || !Static41.method724(local1652)) {
														Static365.method5696(local73, local1656, local1642, local1642, local1652, local219);
													} else {
														Static86.aClass136_37 = null;
														return true;
													}
													Static86.aClass136_37 = null;
													return true;
												} else if (Static356.aClass136_129 == Static86.aClass136_37) {
													Static516.method7430(Static286.aClass148_34);
													Static86.aClass136_37 = null;
													return true;
												} else if (Static86.aClass136_37 == Static605.aClass136_187) {
													Static516.method7430(Static449.aClass148_27);
													Static86.aClass136_37 = null;
													return true;
												} else if (Static86.aClass136_37 == Static598.aClass136_186) {
													Static516.method7430(Static552.aClass148_32);
													Static86.aClass136_37 = null;
													return true;
												} else if (Static86.aClass136_37 == Static611.aClass136_190) {
													local219 = Static167.aClass5_Sub12_Sub2_1.method8639();
													local73 = Static167.aClass5_Sub12_Sub2_1.method8639();
													local523 = Static167.aClass5_Sub12_Sub2_1.method8607();
													local320 = Static167.aClass5_Sub12_Sub2_1.method8607();
													local675 = Static167.aClass5_Sub12_Sub2_1.method8640();
													Static414.method6321();
													Static274.aBooleanArray60[local320] = true;
													Static324.anIntArray410[local320] = local523;
													Static39.anIntArray54[local320] = local73;
													Static525.anIntArray681[local320] = local219;
													Static48.anIntArray63[local320] = local675;
													Static86.aClass136_37 = null;
													return true;
												} else if (Static244.aClass136_89 == Static86.aClass136_37) {
													local219 = Static167.aClass5_Sub12_Sub2_1.method8640();
													local245 = Static167.aClass5_Sub12_Sub2_1.method8592();
													Static414.method6321();
													Static535.method7636(local245, local219);
													Static86.aClass136_37 = null;
													return true;
												} else if (Static86.aClass136_37 == Static381.aClass136_139) {
													local219 = Static167.aClass5_Sub12_Sub2_1.method8633();
													local73 = Static167.aClass5_Sub12_Sub2_1.method8633();
													local523 = Static167.aClass5_Sub12_Sub2_1.method8631();
													local320 = Static167.aClass5_Sub12_Sub2_1.method8650();
													Static414.method6321();
													Static285.method4275(local219, 7, local73 | local523 << 16, local320);
													Static86.aClass136_37 = null;
													return true;
												} else if (Static268.aClass136_103 == Static86.aClass136_37) {
													local219 = Static167.aClass5_Sub12_Sub2_1.method8633();
													local73 = Static167.aClass5_Sub12_Sub2_1.method8615();
													Static414.method6321();
													if (local73 == 2) {
														Static185.method2976();
													}
													Static302.anInt4813 = local219;
													Static461.method6856(local219);
													Static627.method8697(false);
													Static82.method1319(Static302.anInt4813);
													for (local523 = 0; local523 < 100; local523++) {
														Static609.aBooleanArray58[local523] = true;
													}
													Static86.aClass136_37 = null;
													return true;
												} else if (Static86.aClass136_37 == Static110.aClass136_47) {
													if (Static630.aFrame3 != null) {
														Static236.method3632(false, Static627.aClass5_Sub46_31.aClass11_Sub1_1.method191(), -1, -1);
													}
													@Pc(5451) byte[] local5451 = new byte[Static60.anInt3115];
													Static167.aClass5_Sub12_Sub2_1.method8665(Static60.anInt3115, local5451);
													local1286 = Static62.method1073(0, Static60.anInt3115, local5451);
													Static170.method2645(local1286, Static627.aClass5_Sub46_31.aClass11_Sub15_2.method4289() == 1, Static214.aClass192_1, true);
													Static86.aClass136_37 = null;
													return true;
												} else if (Static86.aClass136_37 == Static340.aClass136_122) {
													Static516.method7430(Static247.aClass148_22);
													Static86.aClass136_37 = null;
													return true;
												} else if (Static289.aClass136_112 == Static86.aClass136_37) {
													local298 = Static167.aClass5_Sub12_Sub2_1.method8645() == 1;
													local1286 = Static167.aClass5_Sub12_Sub2_1.method8617();
													local1638 = local1286;
													if (local298) {
														local1638 = Static167.aClass5_Sub12_Sub2_1.method8617();
													}
													local4663 = (long) Static167.aClass5_Sub12_Sub2_1.method8631();
													local1781 = (long) Static167.aClass5_Sub12_Sub2_1.method8657();
													local1527 = Static167.aClass5_Sub12_Sub2_1.method8645();
													@Pc(5540) long local5540 = (local4663 << 32) + local1781;
													@Pc(5542) boolean local5542 = false;
													local4448 = 0;
													while (true) {
														if (local4448 >= 100) {
															if (local1527 <= 1) {
																if (Static205.aBoolean296 && !Static33.aBoolean54 || Static324.aBoolean473) {
																	local5542 = true;
																} else if (Static41.method724(local1638)) {
																	local5542 = true;
																}
															}
															break;
														}
														if (Static20.aLongArray1[local4448] == local5540) {
															local5542 = true;
															break;
														}
														local4448++;
													}
													if (!local5542 && Static164.anInt5717 == 0) {
														Static20.aLongArray1[Static387.anInt6779] = local5540;
														Static387.anInt6779 = (Static387.anInt6779 + 1) % 100;
														@Pc(5599) String local5599 = Static441.method6571(Static282.method4241(Static167.aClass5_Sub12_Sub2_1));
														if (local1527 == 2) {
															Static45.method767((String) null, local5599, local1286, 0, 7, "<img=1>" + local1638, "<img=1>" + local1286, -1);
														} else if (local1527 == 1) {
															Static45.method767((String) null, local5599, local1286, 0, 7, "<img=0>" + local1638, "<img=0>" + local1286, -1);
														} else {
															Static45.method767((String) null, local5599, local1286, 0, 3, local1638, local1286, -1);
														}
													}
													Static86.aClass136_37 = null;
													return true;
												} else if (Static86.aClass136_37 == Static244.aClass136_90) {
													local298 = Static167.aClass5_Sub12_Sub2_1.method8645() == 1;
													local1286 = Static167.aClass5_Sub12_Sub2_1.method8617();
													local1638 = local1286;
													if (local298) {
														local1638 = Static167.aClass5_Sub12_Sub2_1.method8617();
													}
													local4663 = Static167.aClass5_Sub12_Sub2_1.method8644();
													local1781 = (long) Static167.aClass5_Sub12_Sub2_1.method8631();
													local4673 = (long) Static167.aClass5_Sub12_Sub2_1.method8657();
													local444 = Static167.aClass5_Sub12_Sub2_1.method8645();
													local4428 = Static167.aClass5_Sub12_Sub2_1.method8631();
													@Pc(5721) long local5721 = (local1781 << 32) + local4673;
													@Pc(5723) boolean local5723 = false;
													local4383 = 0;
													while (true) {
														if (local4383 >= 100) {
															if (local444 <= 1 && Static41.method724(local1638)) {
																local5723 = true;
															}
															break;
														}
														if (local5721 == Static20.aLongArray1[local4383]) {
															local5723 = true;
															break;
														}
														local4383++;
													}
													if (!local5723 && Static164.anInt5717 == 0) {
														Static20.aLongArray1[Static387.anInt6779] = local5721;
														Static387.anInt6779 = (Static387.anInt6779 + 1) % 100;
														@Pc(5774) String local5774 = Static473.aClass171_1.method4004(local4428).method8745(Static167.aClass5_Sub12_Sub2_1);
														if (local444 == 2) {
															Static45.method767(Static67.method1113(local4663), local5774, local1286, 0, 20, "<img=1>" + local1638, "<img=1>" + local1286, local4428);
														} else if (local444 == 1) {
															Static45.method767(Static67.method1113(local4663), local5774, local1286, 0, 20, "<img=0>" + local1638, "<img=0>" + local1286, local4428);
														} else {
															Static45.method767(Static67.method1113(local4663), local5774, local1286, 0, 20, local1638, local1286, local4428);
														}
													}
													Static86.aClass136_37 = null;
													return true;
												} else if (Static134.aClass136_61 == Static86.aClass136_37) {
													Static478.method8536();
													Static86.aClass136_37 = null;
													return false;
												} else if (Static86.aClass136_37 == Static621.aClass136_193) {
													local219 = Static167.aClass5_Sub12_Sub2_1.method8623();
													Static271.aClass330_3 = Static214.aClass192_1.method4322(local219);
													Static86.aClass136_37 = null;
													return true;
												} else if (Static86.aClass136_37 == Static540.aClass136_172) {
													Static564.aClass304_1.method7290();
													Static86.aClass136_37 = null;
													Static202.anInt3586 += 32;
													return true;
												} else if (Static86.aClass136_37 == Static286.aClass136_176) {
													local219 = Static167.aClass5_Sub12_Sub2_1.method8615();
													local73 = Static167.aClass5_Sub12_Sub2_1.method8631();
													if (local73 == 65535) {
														local73 = -1;
													}
													local523 = Static167.aClass5_Sub12_Sub2_1.method8615();
													Static465.method6345(local73, local523, local219);
													Static86.aClass136_37 = null;
													return true;
												} else if (Static277.aClass136_107 == Static86.aClass136_37) {
													local219 = Static167.aClass5_Sub12_Sub2_1.method8593();
													local73 = Static167.aClass5_Sub12_Sub2_1.method8645();
													local523 = Static167.aClass5_Sub12_Sub2_1.method8631();
													if (local523 == 65535) {
														local523 = -1;
													}
													Static338.method5186(local523, local73, local219);
													Static86.aClass136_37 = null;
													return true;
												} else if (Static364.aClass136_131 == Static86.aClass136_37) {
													Static516.method7430(Static617.aClass148_36);
													Static86.aClass136_37 = null;
													return true;
												} else if (Static86.aClass136_37 == Static531.aClass136_171) {
													local219 = Static167.aClass5_Sub12_Sub2_1.method8606();
													local73 = Static167.aClass5_Sub12_Sub2_1.method8606();
													local523 = Static167.aClass5_Sub12_Sub2_1.method8623();
													local320 = Static167.aClass5_Sub12_Sub2_1.method8640();
													Static414.method6321();
													Static111.method1634(local523, local73, local219, local320);
													Static86.aClass136_37 = null;
													return true;
												} else if (Static86.aClass136_37 == Static277.aClass136_106) {
													local219 = Static167.aClass5_Sub12_Sub2_1.method8645();
													if (Static167.aClass5_Sub12_Sub2_1.method8645() == 0) {
														Static328.aClass205Array1[local219] = new Class205();
													} else {
														Static167.aClass5_Sub12_Sub2_1.anInt10154--;
														Static328.aClass205Array1[local219] = new Class205(Static167.aClass5_Sub12_Sub2_1);
													}
													Static637.anInt10328 = Static278.anInt4551;
													Static86.aClass136_37 = null;
													return true;
												} else if (Static86.aClass136_37 == Static457.aClass136_154) {
													Static645.method8846(Static167.aClass5_Sub12_Sub2_1.method8617());
													Static86.aClass136_37 = null;
													return true;
												} else if (Static73.aClass136_32 == Static86.aClass136_37) {
													local219 = Static167.aClass5_Sub12_Sub2_1.method8606();
													Static414.method6321();
													Static4.method41(local219);
													Static86.aClass136_37 = null;
													return true;
												} else if (Static86.aClass136_37 == Static104.aClass136_44) {
													local298 = Static167.aClass5_Sub12_Sub2_1.method8645() == 1;
													local1286 = Static167.aClass5_Sub12_Sub2_1.method8617();
													local1638 = local1286;
													if (local298) {
														local1638 = Static167.aClass5_Sub12_Sub2_1.method8617();
													}
													local320 = Static167.aClass5_Sub12_Sub2_1.method8645();
													local1912 = false;
													if (local320 <= 1) {
														if (Static205.aBoolean296 && !Static33.aBoolean54 || Static324.aBoolean473) {
															local1912 = true;
														} else if (local320 <= 1 && Static41.method724(local1638)) {
															local1912 = true;
														}
													}
													if (!local1912 && Static164.anInt5717 == 0) {
														local1656 = Static441.method6571(Static282.method4241(Static167.aClass5_Sub12_Sub2_1));
														if (local320 == 2) {
															Static45.method767((String) null, local1656, local1286, 0, 24, "<img=1>" + local1638, "<img=1>" + local1286, -1);
														} else if (local320 == 1) {
															Static45.method767((String) null, local1656, local1286, 0, 24, "<img=0>" + local1638, "<img=0>" + local1286, -1);
														} else {
															Static45.method767((String) null, local1656, local1286, 0, 24, local1638, local1286, -1);
														}
													}
													Static86.aClass136_37 = null;
													return true;
												} else if (Static401.aClass136_161 == Static86.aClass136_37) {
													local219 = Static167.aClass5_Sub12_Sub2_1.method8623();
													local73 = Static167.aClass5_Sub12_Sub2_1.method8633();
													Static414.method6321();
													if (local73 == 65535) {
														local73 = -1;
													}
													Static296.method4344(local219, local73);
													Static86.aClass136_37 = null;
													return true;
												} else if (Static86.aClass136_37 == Static26.aClass136_16) {
													local219 = Static167.aClass5_Sub12_Sub2_1.method8606();
													if (local219 == 65535) {
														local219 = -1;
													}
													local73 = Static167.aClass5_Sub12_Sub2_1.method8606();
													if (local73 == 65535) {
														local73 = -1;
													}
													local523 = Static167.aClass5_Sub12_Sub2_1.method8629();
													local320 = Static167.aClass5_Sub12_Sub2_1.method8650();
													Static414.method6321();
													for (local675 = local73; local675 <= local219; local675++) {
														local1781 = (long) local675 + ((long) local523 << 32);
														local1787 = (Class5_Sub49) Static545.aClass81_62.method1599(local1781);
														if (local1787 != null) {
															local1796 = new Class5_Sub49(local320, local1787.anInt10258);
															local1787.method8911();
														} else if (local675 == -1) {
															local1796 = new Class5_Sub49(local320, Static472.method6903(local523).aClass5_Sub49_2.anInt10258);
														} else {
															local1796 = new Class5_Sub49(local320, -1);
														}
														Static545.aClass81_62.method1607(local1796, local1781);
													}
													Static86.aClass136_37 = null;
													return true;
												} else if (Static86.aClass136_37 == Static190.aClass136_19) {
													local219 = Static167.aClass5_Sub12_Sub2_1.method8601();
													Static414.method6321();
													Static285.method4275(0, 5, Static620.anInt10055, local219);
													Static86.aClass136_37 = null;
													return true;
												} else if (Static431.aClass136_26 == Static86.aClass136_37) {
													Static516.method7430(Static58.aClass148_4);
													Static86.aClass136_37 = null;
													return true;
												} else if (Static454.aClass136_153 == Static86.aClass136_37) {
													local219 = Static167.aClass5_Sub12_Sub2_1.method8650();
													local73 = Static167.aClass5_Sub12_Sub2_1.method8633();
													Static414.method6321();
													Static280.method4193(local73, local219);
													Static86.aClass136_37 = null;
													return true;
												} else if (Static254.aClass136_98 == Static86.aClass136_37) {
													local298 = Static167.aClass5_Sub12_Sub2_1.method8645() == 1;
													local1286 = Static167.aClass5_Sub12_Sub2_1.method8617();
													local1638 = local1286;
													if (local298) {
														local1638 = Static167.aClass5_Sub12_Sub2_1.method8617();
													}
													local320 = Static167.aClass5_Sub12_Sub2_1.method8645();
													local675 = Static167.aClass5_Sub12_Sub2_1.method8631();
													local1920 = false;
													if (local320 <= 1 && Static41.method724(local1638)) {
														local1920 = true;
													}
													if (!local1920 && Static164.anInt5717 == 0) {
														local1970 = Static473.aClass171_1.method4004(local675).method8745(Static167.aClass5_Sub12_Sub2_1);
														if (local320 == 2) {
															Static45.method767((String) null, local1970, local1286, 0, 25, "<img=1>" + local1638, "<img=1>" + local1286, local675);
														} else if (local320 == 1) {
															Static45.method767((String) null, local1970, local1286, 0, 25, "<img=0>" + local1638, "<img=0>" + local1286, local675);
														} else {
															Static45.method767((String) null, local1970, local1286, 0, 25, local1638, local1286, local675);
														}
													}
													Static86.aClass136_37 = null;
													return true;
												} else if (Static86.aClass136_37 == Static496.aClass136_162) {
													Static516.method7430(Static198.aClass148_19);
													Static86.aClass136_37 = null;
													return true;
												} else if (Static625.aClass136_195 == Static86.aClass136_37) {
													local219 = Static167.aClass5_Sub12_Sub2_1.method8639();
													local73 = Static167.aClass5_Sub12_Sub2_1.method8623();
													local523 = Static167.aClass5_Sub12_Sub2_1.method8607();
													Static20.anIntArray33[local523] = local73;
													Static242.anIntArray346[local523] = local219;
													Static221.anIntArray312[local523] = 1;
													local320 = Static376.anIntArray517[local523] - 1;
													for (local675 = 0; local675 < local320; local675++) {
														if (local73 >= Class271.anIntArray590[local675]) {
															Static221.anIntArray312[local523] = local675 + 2;
														}
													}
													Static462.anIntArray541[Static458.anInt7755++ & 0x1F] = local523;
													Static86.aClass136_37 = null;
													return true;
												} else if (Static86.aClass136_37 == Static98.aClass136_94) {
													local219 = Static167.aClass5_Sub12_Sub2_1.method8601();
													local73 = Static167.aClass5_Sub12_Sub2_1.method8606();
													Static564.aClass304_1.method7297(local73, local219);
													Static86.aClass136_37 = null;
													return true;
												} else if (Static86.aClass136_37 == Static627.aClass136_197) {
													Static516.method7430(Static532.aClass148_31);
													Static86.aClass136_37 = null;
													return true;
												} else if (Static510.aClass136_164 == Static86.aClass136_37) {
													if (Static302.anInt4813 != -1) {
														Static499.method7310(0, Static302.anInt4813);
													}
													Static86.aClass136_37 = null;
													return true;
												} else if (Static86.aClass136_37 == Static283.aClass136_109) {
													Static645.method8845();
													Static86.aClass136_37 = null;
													return false;
												} else if (Static287.aClass136_110 == Static86.aClass136_37) {
													local219 = Static167.aClass5_Sub12_Sub2_1.method8631();
													if (local219 == 65535) {
														local219 = -1;
													}
													local73 = Static167.aClass5_Sub12_Sub2_1.method8645();
													local523 = Static167.aClass5_Sub12_Sub2_1.method8631();
													local320 = Static167.aClass5_Sub12_Sub2_1.method8645();
													local675 = Static167.aClass5_Sub12_Sub2_1.method8631();
													Static392.method6102(local320, local73, local219, local675, false, local523);
													Static86.aClass136_37 = null;
													return true;
												} else {
													Static280.method4194("T1 - " + (Static86.aClass136_37 == null ? -1 : Static86.aClass136_37.method3174()) + "," + (Static102.aClass136_43 == null ? -1 : Static102.aClass136_43.method3174()) + "," + (Static612.aClass136_191 == null ? -1 : Static612.aClass136_191.method3174()) + " - " + Static60.anInt3115, (Throwable) null);
													Static268.method4076(false);
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
