import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static629 {

	@OriginalMember(owner = "client!wia", name = "o", descriptor = "F")
	public static float aFloat199;

	@OriginalMember(owner = "client!wia", name = "e", descriptor = "I")
	public static int anInt10498 = 0;

	@OriginalMember(owner = "client!wia", name = "n", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_151 = new Class71(27, 1);

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(BII)Z")
	public static boolean method8467(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(ZI)I")
	public static int method8469(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 - 1;
		@Pc(19) int local19 = local9 | local9 >>> 1;
		@Pc(25) int local25 = local19 | local19 >>> 2;
		@Pc(31) int local31 = local25 | local25 >>> 4;
		@Pc(37) int local37 = local31 | local31 >>> 8;
		@Pc(43) int local43 = local37 | local37 >>> 16;
		return local43 + 1;
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(I)Z")
	public static boolean method8470() throws IOException {
		if (Static319.aClass240_2 == null) {
			return false;
		}
		@Pc(75) int local75;
		if (Static71.aClass71_22 == null) {
			if (Static235.aBoolean396) {
				if (!Static319.aClass240_2.method6379(1)) {
					return false;
				}
				Static319.aClass240_2.method6374(Static442.aClass8_Sub8_Sub2_2.aByteArray107, 0, 1);
				Static235.aBoolean396 = false;
				Static602.anInt10248 = 0;
				Static287.anInt5905++;
			}
			Static442.aClass8_Sub8_Sub2_2.anInt10588 = 0;
			if (Static442.aClass8_Sub8_Sub2_2.method8587()) {
				if (!Static319.aClass240_2.method6379(1)) {
					return false;
				}
				Static319.aClass240_2.method6374(Static442.aClass8_Sub8_Sub2_2.aByteArray107, 1, 1);
				Static287.anInt5905++;
				Static602.anInt10248 = 0;
			}
			Static235.aBoolean396 = true;
			@Pc(71) Class71[] local71 = Static45.method1356();
			local75 = Static442.aClass8_Sub8_Sub2_2.method8593();
			if (local75 < 0 || local75 >= local71.length) {
				throw new IOException("invo:" + local75 + " ip:" + Static442.aClass8_Sub8_Sub2_2.anInt10588);
			}
			Static71.aClass71_22 = local71[local75];
			Static635.anInt10565 = Static71.aClass71_22.anInt2623;
		}
		if (Static635.anInt10565 == -1) {
			if (!Static319.aClass240_2.method6379(1)) {
				return false;
			}
			Static319.aClass240_2.method6374(Static442.aClass8_Sub8_Sub2_2.aByteArray107, 0, 1);
			Static635.anInt10565 = Static442.aClass8_Sub8_Sub2_2.aByteArray107[0] & 0xFF;
			Static287.anInt5905++;
			Static602.anInt10248 = 0;
		}
		if (Static635.anInt10565 == -2) {
			if (!Static319.aClass240_2.method6379(2)) {
				return false;
			}
			Static319.aClass240_2.method6374(Static442.aClass8_Sub8_Sub2_2.aByteArray107, 0, 2);
			Static442.aClass8_Sub8_Sub2_2.anInt10588 = 0;
			Static635.anInt10565 = Static442.aClass8_Sub8_Sub2_2.method8578();
			Static602.anInt10248 = 0;
			Static287.anInt5905 += 2;
		}
		if (Static635.anInt10565 > 0) {
			if (!Static319.aClass240_2.method6379(Static635.anInt10565)) {
				return false;
			}
			Static442.aClass8_Sub8_Sub2_2.anInt10588 = 0;
			Static319.aClass240_2.method6374(Static442.aClass8_Sub8_Sub2_2.aByteArray107, 0, Static635.anInt10565);
			Static602.anInt10248 = 0;
			Static287.anInt5905 += Static635.anInt10565;
		}
		Static239.aClass71_61 = Static415.aClass71_103;
		Static415.aClass71_103 = Static126.aClass71_32;
		Static126.aClass71_32 = Static71.aClass71_22;
		@Pc(223) int local223;
		@Pc(231) int local231;
		@Pc(259) String local259;
		@Pc(233) String local233;
		@Pc(235) String local235;
		if (Static250.aClass71_63 == Static71.aClass71_22) {
			local223 = Static442.aClass8_Sub8_Sub2_2.method8565();
			local75 = Static442.aClass8_Sub8_Sub2_2.method8540();
			local231 = Static442.aClass8_Sub8_Sub2_2.method8525();
			local233 = "";
			local235 = local233;
			if ((local231 & 0x1) != 0) {
				local233 = Static442.aClass8_Sub8_Sub2_2.method8570();
				if ((local231 & 0x2) == 0) {
					local235 = local233;
				} else {
					local235 = Static442.aClass8_Sub8_Sub2_2.method8570();
				}
			}
			local259 = Static442.aClass8_Sub8_Sub2_2.method8570();
			if (local223 == 99) {
				Static481.method7139(local259);
			} else if (local235.equals("") || !Static342.method5461(local235)) {
				Static170.method3363(local259, local233, local223, local75, local235, local233);
			} else {
				Static71.aClass71_22 = null;
				return true;
			}
			Static71.aClass71_22 = null;
			return true;
		} else if (Static71.aClass71_22 == Static240.aClass71_62) {
			Static469.anInt8486 = 1;
			Static198.anInt4606 = Static75.anInt2309;
			Static71.aClass71_22 = null;
			return true;
		} else if (Static83.aClass71_25 == Static71.aClass71_22) {
			Static465.method6990(Static442.aClass8_Sub8_Sub2_2, Static635.anInt10565, Static51.aClass118_1);
			Static71.aClass71_22 = null;
			return true;
		} else {
			@Pc(339) Class8_Sub51 local339;
			if (Static71.aClass71_22 == Static540.aClass71_130) {
				local223 = Static442.aClass8_Sub8_Sub2_2.method8541();
				local75 = Static442.aClass8_Sub8_Sub2_2.method8525();
				local231 = Static442.aClass8_Sub8_Sub2_2.method8553();
				Static199.method3714();
				local339 = (Class8_Sub51) Static218.aClass253_14.method6594((long) local231);
				if (local339 != null) {
					Static406.method6452(local339.anInt10454 != local223, local339, false);
				}
				Static36.method1265(false, local231, local75, local223);
				Static71.aClass71_22 = null;
				return true;
			} else if (Static432.aClass71_109 == Static71.aClass71_22) {
				local223 = Static442.aClass8_Sub8_Sub2_2.method8552();
				local75 = Static442.aClass8_Sub8_Sub2_2.method8525();
				if (local223 == 255) {
					local223 = -1;
					local75 = -1;
				}
				Static488.method7175(local75, local223);
				Static71.aClass71_22 = null;
				return true;
			} else {
				@Pc(417) String local417;
				@Pc(428) long local428;
				@Pc(433) long local433;
				@Pc(437) int local437;
				@Pc(411) boolean local411;
				@Pc(415) String local415;
				@Pc(445) boolean local445;
				@Pc(447) int local447;
				if (Static485.aClass71_117 == Static71.aClass71_22) {
					local411 = Static442.aClass8_Sub8_Sub2_2.method8525() == 1;
					local415 = Static442.aClass8_Sub8_Sub2_2.method8570();
					local417 = local415;
					if (local411) {
						local417 = Static442.aClass8_Sub8_Sub2_2.method8570();
					}
					local428 = Static442.aClass8_Sub8_Sub2_2.method8578();
					local433 = Static442.aClass8_Sub8_Sub2_2.method8560();
					local437 = Static442.aClass8_Sub8_Sub2_2.method8525();
					@Pc(443) long local443 = local433 + (local428 << 32);
					local445 = false;
					local447 = 0;
					while (true) {
						if (local447 >= 100) {
							if (local437 <= 1) {
								if (Static408.aBoolean563 && !Static599.aBoolean732 || Static321.aBoolean449) {
									local445 = true;
								} else if (Static342.method5461(local417)) {
									local445 = true;
								}
							}
							break;
						}
						if (local443 == Static528.aLongArray13[local447]) {
							local445 = true;
							break;
						}
						local447++;
					}
					if (!local445 && Static332.anInt6573 == 0) {
						Static528.aLongArray13[Static51.anInt1659] = local443;
						Static51.anInt1659 = (Static51.anInt1659 + 1) % 100;
						@Pc(508) String local508 = Static378.method5954(Static207.method3783(Static442.aClass8_Sub8_Sub2_2));
						if (local437 == 2) {
							Static365.method5688(0, null, 7, local508, -1, "<img=1>" + local415, "<img=1>" + local417, local415);
						} else if (local437 == 1) {
							Static365.method5688(0, null, 7, local508, -1, "<img=0>" + local415, "<img=0>" + local417, local415);
						} else {
							Static365.method5688(0, null, 3, local508, -1, local415, local417, local415);
						}
					}
					Static71.aClass71_22 = null;
					return true;
				}
				@Pc(605) int local605;
				@Pc(620) int local620;
				@Pc(632) int local632;
				@Pc(601) int local601;
				@Pc(616) int local616;
				if (Static71.aClass71_22 == Static300.aClass71_76) {
					local223 = Static442.aClass8_Sub8_Sub2_2.method8553();
					local75 = local223 >> 28 & 0x3;
					local231 = local223 >> 14 & 0x3FFF;
					local601 = local223 & 0x3FFF;
					local605 = Static442.aClass8_Sub8_Sub2_2.method8576();
					if (local605 == 65535) {
						local605 = -1;
					}
					local616 = Static442.aClass8_Sub8_Sub2_2.method8528();
					local620 = local616 >> 2;
					local437 = local616 & 0x3;
					local231 -= Static628.anInt10493;
					local632 = Static469.anIntArray459[local620];
					local601 -= Static594.anInt10160;
					Static237.method4360(local605, local231, local75, local620, local632, local437, local601);
					Static71.aClass71_22 = null;
					return true;
				} else if (Static71.aClass71_22 == Static144.aClass71_36) {
					local223 = Static442.aClass8_Sub8_Sub2_2.method8578();
					if (local223 == 65535) {
						local223 = -1;
					}
					local75 = Static442.aClass8_Sub8_Sub2_2.method8525();
					local231 = Static442.aClass8_Sub8_Sub2_2.method8578();
					local601 = Static442.aClass8_Sub8_Sub2_2.method8525();
					Static343.method5470(local231, true, local75, 256, local223, local601);
					Static71.aClass71_22 = null;
					return true;
				} else if (Static321.aClass71_82 == Static71.aClass71_22) {
					local223 = Static442.aClass8_Sub8_Sub2_2.method8553();
					Static199.method3714();
					@Pc(704) Class8_Sub51 local704 = (Class8_Sub51) Static218.aClass253_14.method6594((long) local223);
					if (local704 != null) {
						Static406.method6452(true, local704, false);
					}
					if (Static523.aClass331_16 != null) {
						Static86.method2113(Static523.aClass331_16);
						Static523.aClass331_16 = null;
					}
					Static71.aClass71_22 = null;
					return true;
				} else if (Static266.aClass71_70 == Static71.aClass71_22) {
					local223 = Static442.aClass8_Sub8_Sub2_2.method8578();
					local75 = Static442.aClass8_Sub8_Sub2_2.method8540();
					Static199.method3714();
					Static617.method8370(local223, local75);
					Static71.aClass71_22 = null;
					return true;
				} else if (Static612.aClass71_148 == Static71.aClass71_22) {
					local223 = Static442.aClass8_Sub8_Sub2_2.method8545();
					if (local223 == 65535) {
						local223 = -1;
					}
					local75 = Static442.aClass8_Sub8_Sub2_2.method8527();
					local231 = Static442.aClass8_Sub8_Sub2_2.method8528();
					Static103.method2362(local75, local223, local231);
					Static71.aClass71_22 = null;
					return true;
				} else if (Static71.aClass71_22 == Static300.aClass71_75) {
					local223 = Static442.aClass8_Sub8_Sub2_2.method8560();
					local75 = Static442.aClass8_Sub8_Sub2_2.method8528();
					local231 = Static442.aClass8_Sub8_Sub2_2.method8545();
					if (local231 == 65535) {
						local231 = -1;
					}
					Static163.method3265(local75, local223, local231);
					Static71.aClass71_22 = null;
					return true;
				} else if (Static194.aClass71_48 == Static71.aClass71_22) {
					Static305.method5026(Static135.aClass314_7);
					Static71.aClass71_22 = null;
					return true;
				} else if (Static274.aClass71_72 == Static71.aClass71_22) {
					Static56.method1616(Static635.anInt10565, Static442.aClass8_Sub8_Sub2_2);
					Static71.aClass71_22 = null;
					return true;
				} else if (Static71.aClass71_22 == Static437.aClass71_110) {
					local223 = Static442.aClass8_Sub8_Sub2_2.method8578();
					if (local223 == 65535) {
						local223 = -1;
					}
					local75 = Static442.aClass8_Sub8_Sub2_2.method8525();
					local231 = Static442.aClass8_Sub8_Sub2_2.method8578();
					local601 = Static442.aClass8_Sub8_Sub2_2.method8525();
					local605 = Static442.aClass8_Sub8_Sub2_2.method8578();
					Static343.method5470(local231, false, local75, local605, local223, local601);
					Static71.aClass71_22 = null;
					return true;
				} else if (Static569.aClass71_136 == Static71.aClass71_22) {
					local223 = Static442.aClass8_Sub8_Sub2_2.method8578();
					local75 = Static442.aClass8_Sub8_Sub2_2.method8578();
					local231 = Static442.aClass8_Sub8_Sub2_2.method8578();
					Static199.method3714();
					if (Static368.aClass331ArrayArray2[local223] != null) {
						for (local601 = local75; local601 < local231; local601++) {
							local605 = Static442.aClass8_Sub8_Sub2_2.method8560();
							if (local601 < Static368.aClass331ArrayArray2[local223].length && Static368.aClass331ArrayArray2[local223][local601] != null) {
								Static368.aClass331ArrayArray2[local223][local601].anInt9569 = local605;
							}
						}
					}
					Static71.aClass71_22 = null;
					return true;
				} else if (Static76.aClass71_23 == Static71.aClass71_22) {
					Static305.method5026(Static52.aClass314_1);
					Static71.aClass71_22 = null;
					return true;
				} else if (Static474.aClass71_113 == Static71.aClass71_22) {
					Static245.anInt10229 = Static442.aClass8_Sub8_Sub2_2.method8525();
					Static100.anInt2668 = Static442.aClass8_Sub8_Sub2_2.method8574() << 3;
					Static2.anInt5169 = Static442.aClass8_Sub8_Sub2_2.method8574() << 3;
					while (Static442.aClass8_Sub8_Sub2_2.anInt10588 < Static635.anInt10565) {
						@Pc(968) Class314 local968 = Static128.method2842()[Static442.aClass8_Sub8_Sub2_2.method8525()];
						Static305.method5026(local968);
					}
					Static71.aClass71_22 = null;
					return true;
				} else {
					@Pc(1019) long local1019;
					@Pc(1025) int local1025;
					@Pc(1035) int local1035;
					if (Static71.aClass71_22 == Static406.aClass71_101) {
						local411 = Static442.aClass8_Sub8_Sub2_2.method8525() == 1;
						local415 = Static442.aClass8_Sub8_Sub2_2.method8570();
						local417 = local415;
						if (local411) {
							local417 = Static442.aClass8_Sub8_Sub2_2.method8570();
						}
						local428 = Static442.aClass8_Sub8_Sub2_2.method8549();
						local433 = Static442.aClass8_Sub8_Sub2_2.method8578();
						local1019 = Static442.aClass8_Sub8_Sub2_2.method8560();
						local1025 = Static442.aClass8_Sub8_Sub2_2.method8525();
						@Pc(1031) long local1031 = local1019 + (local433 << 32);
						@Pc(1033) boolean local1033 = false;
						local1035 = 0;
						while (true) {
							if (local1035 >= 100) {
								if (local1025 <= 1) {
									if (Static408.aBoolean563 && !Static599.aBoolean732 || Static321.aBoolean449) {
										local1033 = true;
									} else if (Static342.method5461(local417)) {
										local1033 = true;
									}
								}
								break;
							}
							if (local1031 == Static528.aLongArray13[local1035]) {
								local1033 = true;
								break;
							}
							local1035++;
						}
						if (!local1033 && Static332.anInt6573 == 0) {
							Static528.aLongArray13[Static51.anInt1659] = local1031;
							Static51.anInt1659 = (Static51.anInt1659 + 1) % 100;
							@Pc(1099) String local1099 = Static378.method5954(Static207.method3783(Static442.aClass8_Sub8_Sub2_2));
							if (local1025 == 2 || local1025 == 3) {
								Static365.method5688(0, Static342.method5462(local428), 9, local1099, -1, "<img=1>" + local415, "<img=1>" + local417, local415);
							} else if (local1025 == 1) {
								Static365.method5688(0, Static342.method5462(local428), 9, local1099, -1, "<img=0>" + local415, "<img=0>" + local417, local415);
							} else {
								Static365.method5688(0, Static342.method5462(local428), 9, local1099, -1, local415, local417, local415);
							}
						}
						Static71.aClass71_22 = null;
						return true;
					} else if (Static71.aClass71_22 == Static41.aClass71_12) {
						Static305.method5026(Static593.aClass314_14);
						Static71.aClass71_22 = null;
						return true;
					} else if (Static71.aClass71_22 == Static27.aClass71_6) {
						local223 = Static442.aClass8_Sub8_Sub2_2.method8553();
						local75 = Static442.aClass8_Sub8_Sub2_2.method8545();
						Static199.method3714();
						Static558.method7817(local223, local75);
						Static71.aClass71_22 = null;
						return true;
					} else if (Static71.aClass71_22 == Static296.aClass71_74) {
						local223 = Static442.aClass8_Sub8_Sub2_2.method8540();
						local75 = Static442.aClass8_Sub8_Sub2_2.method8568();
						Static199.method3714();
						Static230.method4274(local75, local223);
						Static71.aClass71_22 = null;
						return true;
					} else if (Static558.aClass71_133 == Static71.aClass71_22) {
						local223 = Static442.aClass8_Sub8_Sub2_2.method8540();
						Static557.aClass301_8 = Static51.aClass118_1.method3398(local223);
						Static71.aClass71_22 = null;
						return true;
					} else {
						@Pc(1313) Class8_Sub34 local1313;
						@Pc(1304) Class8_Sub34 local1304;
						if (Static71.aClass71_22 == Static189.aClass71_45) {
							local223 = Static442.aClass8_Sub8_Sub2_2.method8540();
							local75 = Static442.aClass8_Sub8_Sub2_2.method8578();
							if (local75 == 65535) {
								local75 = -1;
							}
							local231 = Static442.aClass8_Sub8_Sub2_2.method8541();
							if (local231 == 65535) {
								local231 = -1;
							}
							local601 = Static442.aClass8_Sub8_Sub2_2.method8520();
							Static199.method3714();
							for (local605 = local75; local605 <= local231; local605++) {
								local433 = (long) local605 + ((long) local601 << 32);
								local1304 = (Class8_Sub34) Static136.aClass253_11.method6594(local433);
								if (local1304 != null) {
									local1313 = new Class8_Sub34(local223, local1304.anInt6429);
									local1304.method8640();
								} else if (local605 == -1) {
									local1313 = new Class8_Sub34(local223, Static178.method3435(local601).aClass8_Sub34_2.anInt6429);
								} else {
									local1313 = new Class8_Sub34(local223, -1);
								}
								Static136.aClass253_11.method6591(local1313, local433);
							}
							Static71.aClass71_22 = null;
							return true;
						} else if (Static71.aClass71_22 == Static578.aClass71_140) {
							local223 = Static442.aClass8_Sub8_Sub2_2.method8576();
							local75 = Static442.aClass8_Sub8_Sub2_2.method8578();
							local231 = Static442.aClass8_Sub8_Sub2_2.method8553();
							local601 = Static442.aClass8_Sub8_Sub2_2.method8576();
							Static199.method3714();
							Static335.method5422(local223, local231, 7, local601 | local75 << 16);
							Static71.aClass71_22 = null;
							return true;
						} else if (Static71.aClass71_22 == Static584.aClass71_143) {
							Static305.method5026(Static292.aClass314_10);
							Static71.aClass71_22 = null;
							return true;
						} else if (Static507.aClass71_121 == Static71.aClass71_22) {
							Static71.aClass71_22 = null;
							return false;
						} else if (Static71.aClass71_22 == Static254.aClass71_41) {
							local223 = Static442.aClass8_Sub8_Sub2_2.method8541();
							local75 = Static442.aClass8_Sub8_Sub2_2.method8552();
							local231 = Static442.aClass8_Sub8_Sub2_2.method8552();
							local601 = Static442.aClass8_Sub8_Sub2_2.method8528();
							local605 = Static442.aClass8_Sub8_Sub2_2.method8552();
							Static199.method3714();
							Static97.aBooleanArray4[local231] = true;
							Static303.anIntArray354[local231] = local75;
							Static18.anIntArray22[local231] = local605;
							Static562.anIntArray535[local231] = local601;
							Static626.anIntArray615[local231] = local223;
							Static71.aClass71_22 = null;
							return true;
						} else if (Static90.aClass71_30 == Static71.aClass71_22) {
							for (local223 = 0; local223 < Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1.length; local223++) {
								if (Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local223] != null) {
									Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local223].anIntArray434 = null;
									Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local223].anInt8105 = -1;
								}
							}
							for (local75 = 0; local75 < Static438.anInt8226; local75++) {
								Static537.aClass8_Sub50Array1[local75].aClass15_Sub1_Sub2_Sub2_Sub2_2.anIntArray434 = null;
								Static537.aClass8_Sub50Array1[local75].aClass15_Sub1_Sub2_Sub2_Sub2_2.anInt8105 = -1;
							}
							Static71.aClass71_22 = null;
							return true;
						} else if (Static11.aClass71_4 == Static71.aClass71_22) {
							Static199.method3714();
							Static586.method8143();
							Static71.aClass71_22 = null;
							return true;
						} else if (Static237.aClass71_58 == Static71.aClass71_22) {
							Static305.method5026(Static105.aClass314_5);
							Static71.aClass71_22 = null;
							return true;
						} else if (Static404.aClass71_100 == Static71.aClass71_22) {
							local223 = Static442.aClass8_Sub8_Sub2_2.method8553();
							local75 = Static442.aClass8_Sub8_Sub2_2.method8578();
							Static199.method3714();
							Static571.method7929(local223, local75);
							Static71.aClass71_22 = null;
							return true;
						} else {
							@Pc(2221) int local2221;
							@Pc(1634) boolean local1634;
							@Pc(1642) int local1642;
							@Pc(2012) int local2012;
							@Pc(1586) boolean local1586;
							if (Static71.aClass71_22 == Static577.aClass71_139) {
								local223 = Static442.aClass8_Sub8_Sub2_2.method8525();
								local75 = Static442.aClass8_Sub8_Sub2_2.method8576();
								local231 = Static442.aClass8_Sub8_Sub2_2.method8540();
								local601 = Static442.aClass8_Sub8_Sub2_2.method8576();
								local605 = Static442.aClass8_Sub8_Sub2_2.method8576();
								local1586 = (local223 & 0x80) != 0;
								local620 = local223 & 0x7;
								local437 = local223 >> 3 & 0xF;
								if (local437 == 15) {
									local437 = -1;
								}
								if (local231 >> 30 == 0) {
									@Pc(1657) Class73 local1657;
									@Pc(1715) Class97 local1715;
									@Pc(1677) Class97 local1677;
									if (local231 >> 29 != 0) {
										local632 = local231 & 0xFFFF;
										@Pc(1620) Class8_Sub50 local1620 = (Class8_Sub50) Static278.aClass253_20.method6594((long) local632);
										if (local1620 != null) {
											@Pc(1625) Class15_Sub1_Sub2_Sub2_Sub2 local1625 = local1620.aClass15_Sub1_Sub2_Sub2_Sub2_2;
											if (local75 == 65535) {
												local75 = -1;
											}
											local1634 = true;
											local1642 = local1586 ? local1625.anInt8074 : local1625.anInt8058;
											if (local75 != -1 && local1642 != -1) {
												if (local75 == local1642) {
													local1657 = Static202.aClass333_2.method7823(local75);
													if (local1657.aBoolean202 && local1657.anInt2718 != -1) {
														local1715 = Static28.aClass220_1.method5670(local1657.anInt2718);
														@Pc(1718) int local1718 = local1715.anInt3603;
														if (local1718 == 0 || local1718 == 2) {
															local1634 = false;
														} else if (local1718 == 1) {
															local1634 = true;
														}
													}
												} else {
													local1657 = Static202.aClass333_2.method7823(local75);
													@Pc(1662) Class73 local1662 = Static202.aClass333_2.method7823(local1642);
													if (local1657.anInt2718 != -1 && local1662.anInt2718 != -1) {
														local1677 = Static28.aClass220_1.method5670(local1657.anInt2718);
														@Pc(1683) Class97 local1683 = Static28.aClass220_1.method5670(local1662.anInt2718);
														if (local1683.anInt3613 > local1677.anInt3613) {
															local1634 = false;
														}
													}
												}
											}
											if (local1634) {
												if (local1586) {
													local1625.anInt8074 = local75;
													local1625.anInt8111 = Static435.anInt8192 + local601;
													local1625.anInt8065 = local620;
													local1625.anInt8076 = local605;
													local1625.anInt8116 = 1;
													local1625.anInt8095 = 0;
													local1625.anInt8069 = local437;
													local1625.anInt8134 = 0;
													if (Static435.anInt8192 < local1625.anInt8111) {
														local1625.anInt8095 = -1;
													}
													if (local1625.anInt8074 != -1 && local1625.anInt8111 == Static435.anInt8192) {
														local1035 = Static202.aClass333_2.method7823(local1625.anInt8074).anInt2718;
														if (local1035 != -1) {
															local1715 = Static28.aClass220_1.method5670(local1035);
															if (local1715 != null && local1715.anIntArray182 != null && !local1625.aBoolean583) {
																Static522.method7447(local1625, local1715, 0);
															}
														}
													}
												} else {
													local1625.anInt8098 = 1;
													local1625.anInt8122 = 0;
													local1625.anInt8071 = local620;
													local1625.anInt8058 = local75;
													local1625.anInt8091 = local437;
													local1625.anInt8099 = local601 + Static435.anInt8192;
													local1625.anInt8072 = local605;
													local1625.anInt8056 = 0;
													if (local1625.anInt8099 > Static435.anInt8192) {
														local1625.anInt8056 = -1;
													}
													if (local1625.anInt8058 != -1 && Static435.anInt8192 == local1625.anInt8099) {
														local1035 = Static202.aClass333_2.method7823(local1625.anInt8058).anInt2718;
														if (local1035 != -1) {
															local1715 = Static28.aClass220_1.method5670(local1035);
															if (local1715 != null && local1715.anIntArray182 != null && !local1625.aBoolean583) {
																Static522.method7447(local1625, local1715, 0);
															}
														}
													}
												}
											}
										}
									} else if (local231 >> 28 != 0) {
										local632 = local231 & 0xFFFF;
										@Pc(1909) Class15_Sub1_Sub2_Sub2_Sub1 local1909;
										if (local632 == Static616.anInt10362) {
											local1909 = Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2;
										} else {
											local1909 = Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local632];
										}
										if (local1909 != null) {
											if (local75 == 65535) {
												local75 = -1;
											}
											local445 = true;
											local447 = local1586 ? local1909.anInt8074 : local1909.anInt8058;
											@Pc(2009) Class97 local2009;
											if (local75 != -1 && local447 != -1) {
												@Pc(1949) Class73 local1949;
												if (local447 == local75) {
													local1949 = Static202.aClass333_2.method7823(local75);
													if (local1949.aBoolean202 && local1949.anInt2718 != -1) {
														local2009 = Static28.aClass220_1.method5670(local1949.anInt2718);
														local2012 = local2009.anInt3603;
														if (local2012 == 0 || local2012 == 2) {
															local445 = false;
														} else if (local2012 == 1) {
															local445 = true;
														}
													}
												} else {
													local1949 = Static202.aClass333_2.method7823(local75);
													local1657 = Static202.aClass333_2.method7823(local447);
													if (local1949.anInt2718 != -1 && local1657.anInt2718 != -1) {
														local1715 = Static28.aClass220_1.method5670(local1949.anInt2718);
														local1677 = Static28.aClass220_1.method5670(local1657.anInt2718);
														if (local1715.anInt3613 < local1677.anInt3613) {
															local445 = false;
														}
													}
												}
											}
											if (local445) {
												if (local1586) {
													local1909.anInt8074 = local75;
													local1909.anInt8076 = local605;
													local1909.anInt8069 = local437;
													local1909.anInt8111 = local601 + Static435.anInt8192;
													local1909.anInt8134 = 0;
													local1909.anInt8095 = 0;
													local1909.anInt8065 = local620;
													local1909.anInt8116 = 1;
													if (local1909.anInt8074 == 65535) {
														local1909.anInt8074 = -1;
													}
													if (Static435.anInt8192 < local1909.anInt8111) {
														local1909.anInt8095 = -1;
													}
													if (local1909.anInt8074 != -1 && Static435.anInt8192 == local1909.anInt8111) {
														local1642 = Static202.aClass333_2.method7823(local1909.anInt8074).anInt2718;
														if (local1642 != -1) {
															local2009 = Static28.aClass220_1.method5670(local1642);
															if (local2009 != null && local2009.anIntArray182 != null && !local1909.aBoolean583) {
																Static522.method7447(local1909, local2009, 0);
															}
														}
													}
												} else {
													local1909.anInt8058 = local75;
													local1909.anInt8091 = local437;
													local1909.anInt8098 = 1;
													local1909.anInt8072 = local605;
													local1909.anInt8122 = 0;
													local1909.anInt8056 = 0;
													local1909.anInt8071 = local620;
													local1909.anInt8099 = Static435.anInt8192 + local601;
													if (local1909.anInt8058 == 65535) {
														local1909.anInt8058 = -1;
													}
													if (local1909.anInt8099 > Static435.anInt8192) {
														local1909.anInt8056 = -1;
													}
													if (local1909.anInt8058 != -1 && local1909.anInt8099 == Static435.anInt8192) {
														local1642 = Static202.aClass333_2.method7823(local1909.anInt8058).anInt2718;
														if (local1642 != -1) {
															local2009 = Static28.aClass220_1.method5670(local1642);
															if (local2009 != null && local2009.anIntArray182 != null && !local1909.aBoolean583) {
																Static522.method7447(local1909, local2009, 0);
															}
														}
													}
												}
											}
										}
									}
								} else {
									local632 = local231 >> 28 & 0x3;
									local1025 = (local231 >> 14 & 0x3FFF) - Static628.anInt10493;
									local2221 = (local231 & 0x3FFF) - Static594.anInt10160;
									if (local1025 >= 0 && local2221 >= 0 && Static372.anInt7082 > local1025 && Static218.anInt5023 > local2221) {
										local447 = local1025 * 512 + 256;
										local1642 = local2221 * 512 + 256;
										local1035 = local632;
										if (local632 < 3 && Static61.method1675(local2221, local1025)) {
											local1035 = local632 + 1;
										}
										@Pc(2284) Class15_Sub1_Sub2_Sub1 local2284 = new Class15_Sub1_Sub2_Sub1(local75, local601, Static435.anInt8192, local632, local1035, local447, Static177.method3098(local1642, local447, local632) - local605, local1642, local1025, local1025, local2221, local2221, local620);
										Static272.aClass43_30.method1424(new Class8_Sub5_Sub19(local2284));
									}
								}
								Static71.aClass71_22 = null;
								return true;
							} else if (Static71.aClass71_22 == Static238.aClass71_59) {
								local223 = Static442.aClass8_Sub8_Sub2_2.method8576();
								local75 = Static442.aClass8_Sub8_Sub2_2.method8545();
								local231 = Static442.aClass8_Sub8_Sub2_2.method8556();
								local601 = Static442.aClass8_Sub8_Sub2_2.method8578();
								Static199.method3714();
								Static620.method8394(local231, local601, local75, local223);
								Static71.aClass71_22 = null;
								return true;
							} else {
								@Pc(2347) boolean local2347;
								if (Static71.aClass71_22 == Static439.aClass71_111) {
									local223 = Static442.aClass8_Sub8_Sub2_2.method8578();
									local75 = Static442.aClass8_Sub8_Sub2_2.method8525();
									local2347 = (local75 & 0x1) == 1;
									while (Static635.anInt10565 > Static442.aClass8_Sub8_Sub2_2.anInt10588) {
										local601 = Static442.aClass8_Sub8_Sub2_2.method8565();
										local605 = Static442.aClass8_Sub8_Sub2_2.method8578();
										local616 = 0;
										if (local605 != 0) {
											local616 = Static442.aClass8_Sub8_Sub2_2.method8525();
											if (local616 == 255) {
												local616 = Static442.aClass8_Sub8_Sub2_2.method8540();
											}
										}
										Static423.method6602(local223, local616, local601, local2347, local605 - 1);
									}
									Static2.anIntArray288[Static533.anInt9188++ & 0x1F] = local223;
									Static71.aClass71_22 = null;
									return true;
								} else if (Static290.aClass71_73 == Static71.aClass71_22) {
									local223 = Static442.aClass8_Sub8_Sub2_2.method8571();
									local75 = Static442.aClass8_Sub8_Sub2_2.method8556();
									local231 = Static442.aClass8_Sub8_Sub2_2.method8568();
									Static199.method3714();
									Static241.method4436(local75, local223, local231);
									Static71.aClass71_22 = null;
									return true;
								} else {
									@Pc(2439) String local2439;
									if (Static535.aClass71_129 == Static71.aClass71_22) {
										local2439 = Static442.aClass8_Sub8_Sub2_2.method8570();
										@Pc(2445) Object[] local2445 = new Object[local2439.length() + 1];
										for (local231 = local2439.length() - 1; local231 >= 0; local231--) {
											if (local2439.charAt(local231) == 's') {
												local2445[local231 + 1] = Static442.aClass8_Sub8_Sub2_2.method8570();
											} else {
												local2445[local231 + 1] = Integer.valueOf(Static442.aClass8_Sub8_Sub2_2.method8540());
											}
										}
										local2445[0] = Integer.valueOf(Static442.aClass8_Sub8_Sub2_2.method8540());
										Static199.method3714();
										@Pc(2504) Class8_Sub40 local2504 = new Class8_Sub40();
										local2504.anObjectArray2 = local2445;
										Static273.method4698(local2504);
										Static71.aClass71_22 = null;
										return true;
									} else if (Static71.aClass71_22 == Static556.aClass71_132) {
										@Pc(2520) byte local2520 = Static442.aClass8_Sub8_Sub2_2.method8539();
										local75 = Static442.aClass8_Sub8_Sub2_2.method8552();
										Static199.method3714();
										Static242.method4788(local2520, local75);
										Static71.aClass71_22 = null;
										return true;
									} else {
										@Pc(2743) Class249 local2743;
										@Pc(2722) boolean local2722;
										if (Static71.aClass71_22 == Static322.aClass71_83) {
											Static173.anInt4160 = Static75.anInt2309;
											if (Static635.anInt10565 == 0) {
												Static71.aClass71_22 = null;
												Static29.aClass249Array1 = null;
												Static220.aString61 = null;
												Static340.aString70 = null;
												Static198.anInt4608 = 0;
												return true;
											}
											Static340.aString70 = Static442.aClass8_Sub8_Sub2_2.method8570();
											local411 = Static442.aClass8_Sub8_Sub2_2.method8525() == 1;
											if (local411) {
												Static442.aClass8_Sub8_Sub2_2.method8570();
											}
											@Pc(2581) long local2581 = Static442.aClass8_Sub8_Sub2_2.method8549();
											Static220.aString61 = Static418.method6564(local2581);
											Static638.aByte130 = Static442.aClass8_Sub8_Sub2_2.method8550();
											local601 = Static442.aClass8_Sub8_Sub2_2.method8525();
											if (local601 == 255) {
												Static71.aClass71_22 = null;
												return true;
											}
											Static198.anInt4608 = local601;
											@Pc(2609) Class249[] local2609 = new Class249[100];
											for (local616 = 0; local616 < Static198.anInt4608; local616++) {
												local2609[local616] = new Class249();
												local2609[local616].aString82 = Static442.aClass8_Sub8_Sub2_2.method8570();
												local411 = Static442.aClass8_Sub8_Sub2_2.method8525() == 1;
												if (local411) {
													local2609[local616].aString79 = Static442.aClass8_Sub8_Sub2_2.method8570();
												} else {
													local2609[local616].aString79 = local2609[local616].aString82;
												}
												local2609[local616].aString80 = Static456.method6912(local2609[local616].aString79);
												local2609[local616].anInt7875 = Static442.aClass8_Sub8_Sub2_2.method8578();
												local2609[local616].aByte79 = Static442.aClass8_Sub8_Sub2_2.method8550();
												local2609[local616].aString81 = Static442.aClass8_Sub8_Sub2_2.method8570();
												if (local2609[local616].aString79.equals(Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aString35)) {
													Static20.aByte5 = local2609[local616].aByte79;
												}
											}
											local632 = Static198.anInt4608;
											while (local632 > 0) {
												local2722 = true;
												local632--;
												for (local1025 = 0; local1025 < local632; local1025++) {
													if (local2609[local1025].aString80.compareTo(local2609[local1025 + 1].aString80) > 0) {
														local2743 = local2609[local1025];
														local2609[local1025] = local2609[local1025 + 1];
														local2609[local1025 + 1] = local2743;
														local2722 = false;
													}
												}
												if (local2722) {
													break;
												}
											}
											Static71.aClass71_22 = null;
											Static29.aClass249Array1 = local2609;
											return true;
										} else if (Static35.aClass71_137 == Static71.aClass71_22) {
											Static55.anInt1865 = Static442.aClass8_Sub8_Sub2_2.method8561();
											Static408.aBoolean563 = Static442.aClass8_Sub8_Sub2_2.method8525() == 1;
											Static71.aClass71_22 = null;
											return true;
										} else if (Static62.aClass71_17 == Static71.aClass71_22) {
											Static305.method5026(Static65.aClass314_2);
											Static71.aClass71_22 = null;
											return true;
										} else if (Static71.aClass71_22 == Static486.aClass71_118) {
											Static139.method2956();
											Static71.aClass71_22 = null;
											return false;
										} else if (Static583.aClass71_142 == Static71.aClass71_22) {
											Static305.method5026(Static168.aClass314_8);
											Static71.aClass71_22 = null;
											return true;
										} else {
											@Pc(3147) String local3147;
											if (Static71.aClass71_22 == Static352.aClass71_89) {
												@Pc(2900) boolean local2900;
												while (Static442.aClass8_Sub8_Sub2_2.anInt10588 < Static635.anInt10565) {
													local411 = Static442.aClass8_Sub8_Sub2_2.method8525() == 1;
													local415 = Static442.aClass8_Sub8_Sub2_2.method8570();
													local417 = Static442.aClass8_Sub8_Sub2_2.method8570();
													local601 = Static442.aClass8_Sub8_Sub2_2.method8578();
													local605 = Static442.aClass8_Sub8_Sub2_2.method8525();
													local259 = "";
													local2722 = false;
													if (local601 > 0) {
														local259 = Static442.aClass8_Sub8_Sub2_2.method8570();
														local2722 = Static442.aClass8_Sub8_Sub2_2.method8525() == 1;
													}
													for (local437 = 0; local437 < Static530.anInt9157; local437++) {
														if (local411) {
															if (local417.equals(Static54.aStringArray6[local437])) {
																Static54.aStringArray6[local437] = local415;
																local415 = null;
																Static582.aStringArray36[local437] = local417;
																break;
															}
														} else if (local415.equals(Static54.aStringArray6[local437])) {
															if (Static620.anIntArray608[local437] != local601) {
																local2900 = true;
																for (@Pc(2905) Class15_Sub5_Sub2 local2905 = (Class15_Sub5_Sub2) Static51.aClass123_2.method3537(); local2905 != null; local2905 = (Class15_Sub5_Sub2) Static51.aClass123_2.method3541()) {
																	if (local2905.aString108.equals(local415)) {
																		if (local601 != 0 && local2905.aShort118 == 0) {
																			local2905.method8314();
																			local2900 = false;
																		} else if (local601 == 0 && local2905.aShort118 != 0) {
																			local2900 = false;
																			local2905.method8314();
																		}
																	}
																}
																if (local2900) {
																	Static51.aClass123_2.method3539(new Class15_Sub5_Sub2(local415, local601));
																}
																Static620.anIntArray608[local437] = local601;
															}
															Static582.aStringArray36[local437] = local417;
															Static3.aStringArray2[local437] = local259;
															Static101.anIntArray135[local437] = local605;
															Static102.aBooleanArray5[local437] = local2722;
															local415 = null;
															break;
														}
													}
													if (local415 != null && Static530.anInt9157 < 200) {
														Static54.aStringArray6[Static530.anInt9157] = local415;
														Static582.aStringArray36[Static530.anInt9157] = local417;
														Static620.anIntArray608[Static530.anInt9157] = local601;
														Static3.aStringArray2[Static530.anInt9157] = local259;
														Static101.anIntArray135[Static530.anInt9157] = local605;
														Static102.aBooleanArray5[Static530.anInt9157] = local2722;
														Static530.anInt9157++;
													}
												}
												Static198.anInt4606 = Static75.anInt2309;
												Static469.anInt8486 = 2;
												local75 = Static530.anInt9157;
												while (local75 > 0) {
													local75--;
													local411 = true;
													for (local231 = 0; local231 < local75; local231++) {
														if (Static471.aClass280_2.anInt8497 != Static620.anIntArray608[local231] && Static471.aClass280_2.anInt8497 == Static620.anIntArray608[local231 + 1] || Static620.anIntArray608[local231] == 0 && Static620.anIntArray608[local231 + 1] != 0) {
															local601 = Static620.anIntArray608[local231];
															Static620.anIntArray608[local231] = Static620.anIntArray608[local231 + 1];
															Static620.anIntArray608[local231 + 1] = local601;
															local235 = Static3.aStringArray2[local231];
															Static3.aStringArray2[local231] = Static3.aStringArray2[local231 + 1];
															Static3.aStringArray2[local231 + 1] = local235;
															local259 = Static54.aStringArray6[local231];
															Static54.aStringArray6[local231] = Static54.aStringArray6[local231 + 1];
															Static54.aStringArray6[local231 + 1] = local259;
															local3147 = Static582.aStringArray36[local231];
															Static582.aStringArray36[local231] = Static582.aStringArray36[local231 + 1];
															Static582.aStringArray36[local231 + 1] = local3147;
															local437 = Static101.anIntArray135[local231];
															Static101.anIntArray135[local231] = Static101.anIntArray135[local231 + 1];
															Static101.anIntArray135[local231 + 1] = local437;
															local2900 = Static102.aBooleanArray5[local231];
															Static102.aBooleanArray5[local231] = Static102.aBooleanArray5[local231 + 1];
															Static102.aBooleanArray5[local231 + 1] = local2900;
															local411 = false;
														}
													}
													if (local411) {
														break;
													}
												}
												Static71.aClass71_22 = null;
												return true;
											} else if (Static71.aClass71_22 == Static137.aClass71_34) {
												local2439 = Static442.aClass8_Sub8_Sub2_2.method8570();
												local75 = Static442.aClass8_Sub8_Sub2_2.method8578();
												local417 = Static105.aClass49_1.method1677(local75).method7704(Static442.aClass8_Sub8_Sub2_2);
												Static365.method5688(0, null, 19, local417, local75, local2439, local2439, local2439);
												Static71.aClass71_22 = null;
												return true;
											} else if (Static71.aClass71_22 == Static522.aClass71_125) {
												Static232.method4294(false);
												Static71.aClass71_22 = null;
												return false;
											} else if (Static71.aClass71_22 == Static257.aClass71_66) {
												local411 = Static442.aClass8_Sub8_Sub2_2.method8525() == 1;
												@Pc(3277) byte[] local3277 = new byte[Static635.anInt10565 - 1];
												Static442.aClass8_Sub8_Sub2_2.method8563(0, local3277, Static635.anInt10565 - 1);
												Static495.method1944(local3277, local411);
												Static71.aClass71_22 = null;
												return true;
											} else if (Static367.aClass71_92 == Static71.aClass71_22) {
												local223 = Static442.aClass8_Sub8_Sub2_2.method8576();
												local75 = Static442.aClass8_Sub8_Sub2_2.method8525();
												Static199.method3714();
												if (local75 == 2) {
													Static402.method6407();
												}
												Static212.anInt4965 = local223;
												Static260.method4575(local223);
												Static131.method2902(false);
												Static273.method4691(Static212.anInt4965);
												for (local231 = 0; local231 < 100; local231++) {
													Static620.aBooleanArray29[local231] = true;
												}
												Static71.aClass71_22 = null;
												return true;
											} else if (Static71.aClass71_22 == Static582.aClass71_141) {
												Static100.anInt2668 = Static442.aClass8_Sub8_Sub2_2.method8539() << 3;
												Static2.anInt5169 = Static442.aClass8_Sub8_Sub2_2.method8550() << 3;
												Static245.anInt10229 = Static442.aClass8_Sub8_Sub2_2.method8525();
												for (@Pc(3374) Class8_Sub26 local3374 = (Class8_Sub26) Static567.aClass253_38.method6593(); local3374 != null; local3374 = (Class8_Sub26) Static567.aClass253_38.method6595()) {
													local75 = (int) (local3374.aLong285 >> 28 & 0x3L);
													local231 = (int) (local3374.aLong285 & 0x3FFFL);
													local601 = local231 - Static628.anInt10493;
													local605 = (int) (local3374.aLong285 >> 14 & 0x3FFFL);
													local616 = local605 - Static594.anInt10160;
													if (Static245.anInt10229 == local75 && local601 >= Static2.anInt5169 && local601 < Static2.anInt5169 + 8 && local616 >= Static100.anInt2668 && local616 < Static100.anInt2668 + 8) {
														local3374.method8640();
														if (local601 >= 0 && local616 >= 0 && local601 < Static372.anInt7082 && Static218.anInt5023 > local616) {
															Static510.method7349(local616, Static245.anInt10229, local601);
														}
													}
												}
												for (@Pc(3484) Class8_Sub44 local3484 = (Class8_Sub44) Static41.aClass43_12.method1422(); local3484 != null; local3484 = (Class8_Sub44) Static41.aClass43_12.method1426()) {
													if (Static2.anInt5169 <= local3484.anInt9146 && local3484.anInt9146 < Static2.anInt5169 + 8 && Static100.anInt2668 <= local3484.anInt9150 && Static100.anInt2668 + 8 > local3484.anInt9150 && Static245.anInt10229 == local3484.anInt9149) {
														local3484.anInt9151 = 0;
													}
												}
												Static71.aClass71_22 = null;
												return true;
											} else if (Static71.aClass71_22 == Static626.aClass71_150) {
												Static624.anInt10422 = Static442.aClass8_Sub8_Sub2_2.method8568();
												Static71.aClass71_22 = null;
												Static409.anInt7812 = Static75.anInt2309;
												return true;
											} else if (Static71.aClass71_22 == Static181.aClass71_43) {
												Static520.aClass251_10 = Static130.method2873(Static442.aClass8_Sub8_Sub2_2.method8525());
												Static71.aClass71_22 = null;
												return true;
											} else if (Static71.aClass71_22 == Static148.aClass71_84) {
												local223 = Static442.aClass8_Sub8_Sub2_2.method8556();
												local75 = Static442.aClass8_Sub8_Sub2_2.method8545();
												Static420.aClass77_1.method2390(local75, local223);
												Static71.aClass71_22 = null;
												return true;
											} else if (Static152.aClass71_39 == Static71.aClass71_22) {
												Static289.aString69 = Static635.anInt10565 <= 2 ? Static121.aClass84_26.method2710(Static372.anInt7083) : Static442.aClass8_Sub8_Sub2_2.method8570();
												Static140.anInt3588 = Static635.anInt10565 <= 0 ? -1 : Static442.aClass8_Sub8_Sub2_2.method8578();
												Static71.aClass71_22 = null;
												if (Static140.anInt3588 == 65535) {
													Static140.anInt3588 = -1;
												}
												return true;
											} else if (Static71.aClass71_22 == Static221.aClass71_53) {
												local223 = Static442.aClass8_Sub8_Sub2_2.method8576();
												Static199.method3714();
												Static245.method8267(local223);
												Static71.aClass71_22 = null;
												return true;
											} else if (Static587.aClass71_147 == Static71.aClass71_22) {
												local223 = Static442.aClass8_Sub8_Sub2_2.method8541();
												if (local223 == 65535) {
													local223 = -1;
												}
												local75 = Static442.aClass8_Sub8_Sub2_2.method8540();
												Static199.method3714();
												Static190.method6092(local223, local75);
												Static71.aClass71_22 = null;
												return true;
											} else if (Static71.aClass71_22 == Static59.aClass71_16) {
												Static420.aClass77_1.method2396();
												Static71.aClass71_22 = null;
												Static240.anInt5377 += 32;
												return true;
											} else if (Static336.aClass71_85 == Static71.aClass71_22) {
												Static176.anInt4174 = Static442.aClass8_Sub8_Sub2_2.method8525();
												Static409.anInt7812 = Static75.anInt2309;
												Static71.aClass71_22 = null;
												return true;
											} else if (Static71.aClass71_22 == Static368.aClass71_93) {
												Static373.method7302(Static442.aClass8_Sub8_Sub2_2.method8570());
												Static71.aClass71_22 = null;
												return true;
											} else if (Static71.aClass71_22 == Static530.aClass71_126) {
												local223 = Static442.aClass8_Sub8_Sub2_2.method8525();
												local75 = local223 >> 5;
												local231 = local223 & 0x1F;
												if (local231 == 0) {
													Static447.aClass319Array3[local75] = null;
													Static71.aClass71_22 = null;
													return true;
												}
												@Pc(3752) Class319 local3752 = new Class319();
												local3752.anInt9116 = local231;
												local3752.anInt9123 = Static442.aClass8_Sub8_Sub2_2.method8525();
												if (local3752.anInt9123 >= 0 && local3752.anInt9123 < Static152.aClass21Array7.length) {
													if (local3752.anInt9116 == 1 || local3752.anInt9116 == 10) {
														local3752.anInt9124 = Static442.aClass8_Sub8_Sub2_2.method8578();
														Static442.aClass8_Sub8_Sub2_2.anInt10588 += 6;
													} else if (local3752.anInt9116 >= 2 && local3752.anInt9116 <= 6) {
														if (local3752.anInt9116 == 2) {
															local3752.anInt9122 = 256;
															local3752.anInt9115 = 256;
														}
														if (local3752.anInt9116 == 3) {
															local3752.anInt9115 = 0;
															local3752.anInt9122 = 256;
														}
														if (local3752.anInt9116 == 4) {
															local3752.anInt9122 = 256;
															local3752.anInt9115 = 512;
														}
														if (local3752.anInt9116 == 5) {
															local3752.anInt9122 = 0;
															local3752.anInt9115 = 256;
														}
														if (local3752.anInt9116 == 6) {
															local3752.anInt9115 = 256;
															local3752.anInt9122 = 512;
														}
														local3752.anInt9116 = 2;
														local3752.anInt9121 = Static442.aClass8_Sub8_Sub2_2.method8525();
														local3752.anInt9115 += Static442.aClass8_Sub8_Sub2_2.method8578() - Static628.anInt10493 << 9;
														local3752.anInt9122 += Static442.aClass8_Sub8_Sub2_2.method8578() - Static594.anInt10160 << 9;
														local3752.anInt9125 = Static442.aClass8_Sub8_Sub2_2.method8525() << 2;
														local3752.anInt9117 = Static442.aClass8_Sub8_Sub2_2.method8578();
													}
													local3752.anInt9114 = Static442.aClass8_Sub8_Sub2_2.method8578();
													if (local3752.anInt9114 == 65535) {
														local3752.anInt9114 = -1;
													}
													Static447.aClass319Array3[local75] = local3752;
												}
												Static71.aClass71_22 = null;
												return true;
											} else if (Static85.aClass71_112 == Static71.aClass71_22) {
												local223 = Static442.aClass8_Sub8_Sub2_2.method8540();
												local75 = Static442.aClass8_Sub8_Sub2_2.method8520();
												local231 = Static442.aClass8_Sub8_Sub2_2.method8578();
												if (local231 == 65535) {
													local231 = -1;
												}
												Static199.method3714();
												Static283.method4799(local231, local223, local75);
												@Pc(3965) Class284 local3965 = Static497.aClass258_21.method6652(local231);
												Static620.method8394(local75, local3965.anInt8522, local3965.lb, local3965.anInt8574);
												Static561.method7832(local3965.anInt8575, local3965.anInt8571, local75, local3965.anInt8549);
												Static71.aClass71_22 = null;
												return true;
											} else if (Static71.aClass71_22 == Static7.aClass71_81) {
												Static266.anInt5673 = Static442.aClass8_Sub8_Sub2_2.method8525();
												Static71.aClass71_22 = null;
												return true;
											} else if (Static71.aClass71_22 == Static404.aClass71_99) {
												local223 = Static442.aClass8_Sub8_Sub2_2.method8556();
												local75 = Static442.aClass8_Sub8_Sub2_2.method8540();
												Static199.method3714();
												@Pc(4019) Class8_Sub51 local4019 = (Class8_Sub51) Static218.aClass253_14.method6594((long) local223);
												local339 = (Class8_Sub51) Static218.aClass253_14.method6594((long) local75);
												if (local339 != null) {
													Static406.method6452(local4019 == null || local4019.anInt10454 != local339.anInt10454, local339, false);
												}
												if (local4019 != null) {
													local4019.method8640();
													Static218.aClass253_14.method6591(local4019, (long) local75);
												}
												@Pc(4057) Class331 local4057 = Static178.method3435(local223);
												if (local4057 != null) {
													Static86.method2113(local4057);
												}
												local4057 = Static178.method3435(local75);
												if (local4057 != null) {
													Static86.method2113(local4057);
													Static279.method4732(true, local4057);
												}
												if (Static212.anInt4965 != -1) {
													Static279.method4733(Static212.anInt4965, 1);
												}
												Static71.aClass71_22 = null;
												return true;
											} else if (Static71.aClass71_22 == Static416.aClass71_104) {
												local223 = Static442.aClass8_Sub8_Sub2_2.method8528();
												local75 = Static442.aClass8_Sub8_Sub2_2.method8541();
												Static199.method3714();
												Static64.method1711(local75, true, local223);
												Static71.aClass71_22 = null;
												return true;
											} else if (Static265.aClass71_68 == Static71.aClass71_22) {
												local223 = Static442.aClass8_Sub8_Sub2_2.method8578();
												if (local223 == 65535) {
													local223 = -1;
												}
												local75 = Static442.aClass8_Sub8_Sub2_2.method8553();
												local231 = Static442.aClass8_Sub8_Sub2_2.method8545();
												if (local231 == 65535) {
													local231 = -1;
												}
												local601 = Static442.aClass8_Sub8_Sub2_2.method8545();
												Static199.method3714();
												for (local605 = local223; local605 <= local231; local605++) {
													local433 = (long) local605 + ((long) local75 << 32);
													local1304 = (Class8_Sub34) Static136.aClass253_11.method6594(local433);
													if (local1304 != null) {
														local1313 = new Class8_Sub34(local1304.anInt6421, local601);
														local1304.method8640();
													} else if (local605 == -1) {
														local1313 = new Class8_Sub34(Static178.method3435(local75).aClass8_Sub34_2.anInt6421, local601);
													} else {
														local1313 = new Class8_Sub34(0, local601);
													}
													Static136.aClass253_11.method6591(local1313, local433);
												}
												Static71.aClass71_22 = null;
												return true;
											} else if (Static71.aClass71_22 == Static125.aClass71_86) {
												local411 = Static442.aClass8_Sub8_Sub2_2.method8525() == 1;
												local415 = Static442.aClass8_Sub8_Sub2_2.method8570();
												local417 = local415;
												if (local411) {
													local417 = Static442.aClass8_Sub8_Sub2_2.method8570();
												}
												local428 = Static442.aClass8_Sub8_Sub2_2.method8549();
												local433 = Static442.aClass8_Sub8_Sub2_2.method8578();
												local1019 = Static442.aClass8_Sub8_Sub2_2.method8560();
												local1025 = Static442.aClass8_Sub8_Sub2_2.method8525();
												local2221 = Static442.aClass8_Sub8_Sub2_2.method8578();
												@Pc(4275) long local4275 = (local433 << 32) + local1019;
												@Pc(4277) boolean local4277 = false;
												local2012 = 0;
												while (true) {
													if (local2012 >= 100) {
														if (local1025 <= 1 && Static342.method5461(local417)) {
															local4277 = true;
														}
														break;
													}
													if (local4275 == Static528.aLongArray13[local2012]) {
														local4277 = true;
														break;
													}
													local2012++;
												}
												if (!local4277 && Static332.anInt6573 == 0) {
													Static528.aLongArray13[Static51.anInt1659] = local4275;
													Static51.anInt1659 = (Static51.anInt1659 + 1) % 100;
													@Pc(4331) String local4331 = Static105.aClass49_1.method1677(local2221).method7704(Static442.aClass8_Sub8_Sub2_2);
													if (local1025 == 2) {
														Static365.method5688(0, Static342.method5462(local428), 20, local4331, local2221, "<img=1>" + local415, "<img=1>" + local417, local415);
													} else if (local1025 == 1) {
														Static365.method5688(0, Static342.method5462(local428), 20, local4331, local2221, "<img=0>" + local415, "<img=0>" + local417, local415);
													} else {
														Static365.method5688(0, Static342.method5462(local428), 20, local4331, local2221, local415, local417, local415);
													}
												}
												Static71.aClass71_22 = null;
												return true;
											} else if (Static29.aClass71_7 == Static71.aClass71_22) {
												local223 = Static442.aClass8_Sub8_Sub2_2.method8525();
												@Pc(4425) boolean local4425 = (local223 & 0x1) == 1;
												local417 = Static442.aClass8_Sub8_Sub2_2.method8570();
												local233 = Static442.aClass8_Sub8_Sub2_2.method8570();
												if (local233.equals("")) {
													local233 = local417;
												}
												local235 = Static442.aClass8_Sub8_Sub2_2.method8570();
												local259 = Static442.aClass8_Sub8_Sub2_2.method8570();
												if (local259.equals("")) {
													local259 = local235;
												}
												if (local4425) {
													for (local620 = 0; local620 < Static554.anInt9637; local620++) {
														if (Static512.aStringArray31[local620].equals(local259)) {
															Static525.aStringArray32[local620] = local417;
															Static512.aStringArray31[local620] = local233;
															Static304.aStringArray18[local620] = local235;
															Static574.aStringArray35[local620] = local259;
															break;
														}
													}
												} else {
													Static525.aStringArray32[Static554.anInt9637] = local417;
													Static512.aStringArray31[Static554.anInt9637] = local233;
													Static304.aStringArray18[Static554.anInt9637] = local235;
													Static574.aStringArray35[Static554.anInt9637] = local259;
													Static423.aBooleanArray23[Static554.anInt9637] = (local223 & 0x2) == 2;
													Static554.anInt9637++;
												}
												Static71.aClass71_22 = null;
												Static198.anInt4606 = Static75.anInt2309;
												return true;
											} else if (Static71.aClass71_22 == Static493.aClass71_119) {
												Static100.anInt2668 = Static442.aClass8_Sub8_Sub2_2.method8521() << 3;
												Static245.anInt10229 = Static442.aClass8_Sub8_Sub2_2.method8528();
												Static2.anInt5169 = Static442.aClass8_Sub8_Sub2_2.method8550() << 3;
												Static71.aClass71_22 = null;
												return true;
											} else if (Static532.aClass71_127 == Static71.aClass71_22) {
												local223 = Static442.aClass8_Sub8_Sub2_2.method8540();
												Static199.method3714();
												Static71.aClass71_22 = null;
												if (local223 == -1) {
													Static460.anInt8416 = -1;
													Static621.anInt10407 = -1;
												} else {
													local75 = local223 >> 14 & 0x3FFF;
													local75 -= Static628.anInt10493;
													local231 = local223 & 0x3FFF;
													if (local75 < 0) {
														local75 = 0;
													} else if (Static372.anInt7082 <= local75) {
														local75 = Static372.anInt7082;
													}
													local231 -= Static594.anInt10160;
													Static460.anInt8416 = (local75 << 9) + 256;
													if (local231 < 0) {
														local231 = 0;
													} else if (local231 >= Static218.anInt5023) {
														local231 = Static218.anInt5023;
													}
													Static621.anInt10407 = (local231 << 9) + 256;
												}
												return true;
											} else if (Static71.aClass71_22 == Static149.aClass71_37) {
												local223 = Static442.aClass8_Sub8_Sub2_2.method8553();
												local75 = Static442.aClass8_Sub8_Sub2_2.method8520();
												local231 = Static442.aClass8_Sub8_Sub2_2.method8545();
												Static199.method3714();
												Static335.method5422(local223, local75, 5, local231);
												Static71.aClass71_22 = null;
												return true;
											} else if (Static71.aClass71_22 == Static352.aClass71_88) {
												local223 = Static442.aClass8_Sub8_Sub2_2.method8540();
												local75 = Static442.aClass8_Sub8_Sub2_2.method8541();
												Static199.method3714();
												Static610.method8301(local223, local75);
												Static71.aClass71_22 = null;
												return true;
											} else if (Static71.aClass71_22 == Static35.aClass71_138) {
												Static232.method4294(Static617.aBoolean747);
												Static71.aClass71_22 = null;
												return false;
											} else if (Static151.aClass71_38 == Static71.aClass71_22) {
												Static580.method4373();
												Static71.aClass71_22 = null;
												return true;
											} else if (Static71.aClass71_22 == Static83.aClass71_26) {
												local223 = Static442.aClass8_Sub8_Sub2_2.method8525();
												if (Static442.aClass8_Sub8_Sub2_2.method8525() == 0) {
													Static28.aClass305Array1[local223] = new Class305();
												} else {
													Static442.aClass8_Sub8_Sub2_2.anInt10588--;
													Static28.aClass305Array1[local223] = new Class305(Static442.aClass8_Sub8_Sub2_2);
												}
												Static71.aClass71_22 = null;
												Static297.anInt5985 = Static75.anInt2309;
												return true;
											} else if (Static637.aClass71_152 == Static71.aClass71_22) {
												local223 = Static442.aClass8_Sub8_Sub2_2.method8540();
												local75 = Static442.aClass8_Sub8_Sub2_2.method8541();
												if (local75 == 65535) {
													local75 = -1;
												}
												Static199.method3714();
												Static335.method5422(-1, local223, 2, local75);
												Static71.aClass71_22 = null;
												return true;
											} else if (Static514.aClass71_122 == Static71.aClass71_22) {
												local2439 = Static442.aClass8_Sub8_Sub2_2.method8570();
												local2347 = Static442.aClass8_Sub8_Sub2_2.method8525() == 1;
												if (local2347) {
													local415 = Static442.aClass8_Sub8_Sub2_2.method8570();
												} else {
													local415 = local2439;
												}
												local601 = Static442.aClass8_Sub8_Sub2_2.method8578();
												@Pc(4817) byte local4817 = Static442.aClass8_Sub8_Sub2_2.method8550();
												local1586 = false;
												if (local4817 == -128) {
													local1586 = true;
												}
												if (local1586) {
													if (Static198.anInt4608 == 0) {
														Static71.aClass71_22 = null;
														return true;
													}
													for (local620 = 0; local620 < Static198.anInt4608 && (!Static29.aClass249Array1[local620].aString79.equals(local415) || local601 != Static29.aClass249Array1[local620].anInt7875); local620++) {
													}
													if (local620 < Static198.anInt4608) {
														while (Static198.anInt4608 - 1 > local620) {
															Static29.aClass249Array1[local620] = Static29.aClass249Array1[local620 + 1];
															local620++;
														}
														Static198.anInt4608--;
														Static29.aClass249Array1[Static198.anInt4608] = null;
													}
												} else {
													local3147 = Static442.aClass8_Sub8_Sub2_2.method8570();
													local2743 = new Class249();
													local2743.aString82 = local2439;
													local2743.aString79 = local415;
													local2743.aString80 = Static456.method6912(local2743.aString79);
													local2743.aByte79 = local4817;
													local2743.aString81 = local3147;
													local2743.anInt7875 = local601;
													for (local632 = Static198.anInt4608 - 1; local632 >= 0; local632--) {
														local1025 = Static29.aClass249Array1[local632].aString80.compareTo(local2743.aString80);
														if (local1025 == 0) {
															Static29.aClass249Array1[local632].anInt7875 = local601;
															Static29.aClass249Array1[local632].aByte79 = local4817;
															Static29.aClass249Array1[local632].aString81 = local3147;
															if (local415.equals(Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aString35)) {
																Static20.aByte5 = local4817;
															}
															Static173.anInt4160 = Static75.anInt2309;
															Static71.aClass71_22 = null;
															return true;
														}
														if (local1025 < 0) {
															break;
														}
													}
													if (Static29.aClass249Array1.length <= Static198.anInt4608) {
														Static71.aClass71_22 = null;
														return true;
													}
													for (local1025 = Static198.anInt4608 - 1; local1025 > local632; local1025--) {
														Static29.aClass249Array1[local1025 + 1] = Static29.aClass249Array1[local1025];
													}
													if (Static198.anInt4608 == 0) {
														Static29.aClass249Array1 = new Class249[100];
													}
													Static29.aClass249Array1[local632 + 1] = local2743;
													Static198.anInt4608++;
													if (local415.equals(Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aString35)) {
														Static20.aByte5 = local4817;
													}
												}
												Static173.anInt4160 = Static75.anInt2309;
												Static71.aClass71_22 = null;
												return true;
											} else if (Static533.aClass71_128 == Static71.aClass71_22) {
												local223 = Static442.aClass8_Sub8_Sub2_2.method8576();
												local75 = Static442.aClass8_Sub8_Sub2_2.method8576();
												local231 = Static442.aClass8_Sub8_Sub2_2.method8540();
												Static199.method3714();
												Static290.method4843(local223 + (local75 << 16), local231);
												Static71.aClass71_22 = null;
												return true;
											} else if (aClass71_151 == Static71.aClass71_22) {
												local411 = Static442.aClass8_Sub8_Sub2_2.method8527() == 1;
												Static199.method3714();
												Static22.aBoolean88 = local411;
												Static71.aClass71_22 = null;
												return true;
											} else if (Static71.aClass71_22 == Static199.aClass71_50) {
												Static360.method5658();
												Static71.aClass71_22 = null;
												return true;
											} else if (Static58.aClass71_15 == Static71.aClass71_22) {
												local223 = Static442.aClass8_Sub8_Sub2_2.method8528();
												local75 = Static442.aClass8_Sub8_Sub2_2.method8545();
												@Pc(5130) int[] local5130 = new int[4];
												for (local601 = 0; local601 < 4; local601++) {
													local5130[local601] = Static442.aClass8_Sub8_Sub2_2.method8541();
												}
												@Pc(5153) Class8_Sub50 local5153 = (Class8_Sub50) Static278.aClass253_20.method6594((long) local75);
												if (local5153 != null) {
													Static233.method4304(local5130, local5153.aClass15_Sub1_Sub2_Sub2_Sub2_2, local223);
												}
												Static71.aClass71_22 = null;
												return true;
											} else if (Static71.aClass71_22 == Static186.aClass71_44) {
												local223 = Static442.aClass8_Sub8_Sub2_2.method8553();
												local75 = Static442.aClass8_Sub8_Sub2_2.method8545();
												Static199.method3714();
												if (local75 == 65535) {
													local75 = -1;
												}
												Static335.method5422(-1, local223, 1, local75);
												Static71.aClass71_22 = null;
												return true;
											} else if (Static71.aClass71_22 == Static89.aClass71_29) {
												local223 = Static442.aClass8_Sub8_Sub2_2.method8525();
												local415 = Static442.aClass8_Sub8_Sub2_2.method8570();
												local231 = Static442.aClass8_Sub8_Sub2_2.method8528();
												local601 = Static442.aClass8_Sub8_Sub2_2.method8578();
												if (local601 == 65535) {
													local601 = -1;
												}
												if (local231 >= 1 && local231 <= 8) {
													if (local415.equalsIgnoreCase("null")) {
														local415 = null;
													}
													Static370.aStringArray19[local231 - 1] = local415;
													Static525.anIntArray504[local231 - 1] = local601;
													Static560.aBooleanArray28[local231 - 1] = local223 == 0;
												}
												Static71.aClass71_22 = null;
												return true;
											} else if (Static71.aClass71_22 == Static375.aClass71_78) {
												if (Static197.aFrame1 != null) {
													Static327.method5366(-1, -1, Static155.aClass8_Sub25_6.aClass36_Sub5_1.method3307(), false);
												}
												@Pc(5281) byte[] local5281 = new byte[Static635.anInt10565];
												Static442.aClass8_Sub8_Sub2_2.method8594(Static635.anInt10565, local5281);
												local415 = Static287.method4822(0, local5281, Static635.anInt10565);
												Static453.method6874(Static51.aClass118_1, local415, true, Static155.aClass8_Sub25_6.aClass36_Sub19_2.method6358() == 1);
												Static71.aClass71_22 = null;
												return true;
											} else if (Static71.aClass71_22 == Static271.aClass71_71) {
												local411 = Static442.aClass8_Sub8_Sub2_2.method8525() == 1;
												local415 = Static442.aClass8_Sub8_Sub2_2.method8570();
												local417 = local415;
												if (local411) {
													local417 = Static442.aClass8_Sub8_Sub2_2.method8570();
												}
												local601 = Static442.aClass8_Sub8_Sub2_2.method8525();
												local605 = Static442.aClass8_Sub8_Sub2_2.method8578();
												local1586 = false;
												if (local601 <= 1 && Static342.method5461(local417)) {
													local1586 = true;
												}
												if (!local1586 && Static332.anInt6573 == 0) {
													local3147 = Static105.aClass49_1.method1677(local605).method7704(Static442.aClass8_Sub8_Sub2_2);
													if (local601 == 2) {
														Static365.method5688(0, null, 25, local3147, local605, "<img=1>" + local415, "<img=1>" + local417, local415);
													} else if (local601 == 1) {
														Static365.method5688(0, null, 25, local3147, local605, "<img=0>" + local415, "<img=0>" + local417, local415);
													} else {
														Static365.method5688(0, null, 25, local3147, local605, local415, local417, local415);
													}
												}
												Static71.aClass71_22 = null;
												return true;
											} else {
												@Pc(5478) boolean local5478;
												if (Static212.aClass71_52 == Static71.aClass71_22) {
													local223 = Static442.aClass8_Sub8_Sub2_2.method8578();
													@Pc(5450) Class15_Sub1_Sub2_Sub2_Sub1 local5450;
													if (local223 == Static616.anInt10362) {
														local5450 = Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2;
													} else {
														local5450 = Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local223];
													}
													if (local5450 == null) {
														Static71.aClass71_22 = null;
														return true;
													}
													local231 = Static442.aClass8_Sub8_Sub2_2.method8578();
													local601 = Static442.aClass8_Sub8_Sub2_2.method8525();
													local5478 = (local231 & 0x8000) != 0;
													if (local5450.aString35 != null && local5450.aClass337_1 != null) {
														local1586 = false;
														if (local601 <= 1) {
															if (!local5478 && (Static408.aBoolean563 && !Static599.aBoolean732 || Static321.aBoolean449)) {
																local1586 = true;
															} else if (Static342.method5461(local5450.aString35)) {
																local1586 = true;
															}
														}
														if (!local1586 && Static332.anInt6573 == 0) {
															local437 = -1;
															if (local5478) {
																local231 &= 0x7FFF;
																@Pc(5526) Class377 local5526 = Static552.method7747(Static442.aClass8_Sub8_Sub2_2);
																local437 = local5526.anInt10684;
																local3147 = local5526.aClass8_Sub5_Sub17_1.method7704(Static442.aClass8_Sub8_Sub2_2);
															} else {
																local3147 = Static378.method5954(Static207.method3783(Static442.aClass8_Sub8_Sub2_2));
															}
															local5450.aString85 = local3147.trim();
															local5450.anInt8053 = 150;
															local5450.anInt8121 = local231 >> 8;
															local5450.anInt8123 = local231 & 0xFF;
															if (local601 == 1 || local601 == 2) {
																local632 = local5478 ? 17 : 1;
															} else {
																local632 = local5478 ? 17 : 2;
															}
															if (local601 == 2) {
																Static365.method5688(0, null, local632, local3147, local437, "<img=1>" + local5450.method2759(), "<img=1>" + local5450.method2762(), local5450.aString36);
															} else if (local601 == 1) {
																Static365.method5688(0, null, local632, local3147, local437, "<img=0>" + local5450.method2759(), "<img=0>" + local5450.method2762(), local5450.aString36);
															} else {
																Static365.method5688(0, null, local632, local3147, local437, local5450.method2759(), local5450.method2762(), local5450.aString36);
															}
														}
													}
													Static71.aClass71_22 = null;
													return true;
												} else if (Static71.aClass71_22 == Static358.aClass71_91) {
													Static305.method5026(Static88.aClass314_4);
													Static71.aClass71_22 = null;
													return true;
												} else if (Static448.aClass71_95 == Static71.aClass71_22) {
													local411 = Static442.aClass8_Sub8_Sub2_2.method8525() == 1;
													local415 = Static442.aClass8_Sub8_Sub2_2.method8570();
													local417 = local415;
													if (local411) {
														local417 = Static442.aClass8_Sub8_Sub2_2.method8570();
													}
													local601 = Static442.aClass8_Sub8_Sub2_2.method8525();
													local5478 = false;
													if (local601 <= 1) {
														if (Static408.aBoolean563 && !Static599.aBoolean732 || Static321.aBoolean449) {
															local5478 = true;
														} else if (local601 <= 1 && Static342.method5461(local417)) {
															local5478 = true;
														}
													}
													if (!local5478 && Static332.anInt6573 == 0) {
														local259 = Static378.method5954(Static207.method3783(Static442.aClass8_Sub8_Sub2_2));
														if (local601 == 2) {
															Static365.method5688(0, null, 24, local259, -1, "<img=1>" + local415, "<img=1>" + local417, local415);
														} else if (local601 == 1) {
															Static365.method5688(0, null, 24, local259, -1, "<img=0>" + local415, "<img=0>" + local417, local415);
														} else {
															Static365.method5688(0, null, 24, local259, -1, local415, local417, local415);
														}
													}
													Static71.aClass71_22 = null;
													return true;
												} else if (Static71.aClass71_22 == Static423.aClass71_105) {
													local223 = Static442.aClass8_Sub8_Sub2_2.method8578();
													if (local223 == 65535) {
														local223 = -1;
													}
													local75 = Static442.aClass8_Sub8_Sub2_2.method8525();
													local231 = Static442.aClass8_Sub8_Sub2_2.method8578();
													local601 = Static442.aClass8_Sub8_Sub2_2.method8525();
													local605 = Static442.aClass8_Sub8_Sub2_2.method8578();
													Static143.method2988(local605, local75, local223, local601, local231);
													Static71.aClass71_22 = null;
													return true;
												} else if (Static563.aClass71_134 == Static71.aClass71_22) {
													local411 = Static442.aClass8_Sub8_Sub2_2.method8525() == 1;
													local415 = Static442.aClass8_Sub8_Sub2_2.method8570();
													local417 = local415;
													if (local411) {
														local417 = Static442.aClass8_Sub8_Sub2_2.method8570();
													}
													local428 = Static442.aClass8_Sub8_Sub2_2.method8578();
													local433 = Static442.aClass8_Sub8_Sub2_2.method8560();
													local437 = Static442.aClass8_Sub8_Sub2_2.method8525();
													local632 = Static442.aClass8_Sub8_Sub2_2.method8578();
													@Pc(5920) long local5920 = local433 + (local428 << 32);
													local1634 = false;
													local1642 = 0;
													while (true) {
														if (local1642 >= 100) {
															if (local437 <= 1 && Static342.method5461(local417)) {
																local1634 = true;
															}
															break;
														}
														if (Static528.aLongArray13[local1642] == local5920) {
															local1634 = true;
															break;
														}
														local1642++;
													}
													if (!local1634 && Static332.anInt6573 == 0) {
														Static528.aLongArray13[Static51.anInt1659] = local5920;
														Static51.anInt1659 = (Static51.anInt1659 + 1) % 100;
														@Pc(5975) String local5975 = Static105.aClass49_1.method1677(local632).method7704(Static442.aClass8_Sub8_Sub2_2);
														if (local437 == 2) {
															Static365.method5688(0, null, 18, local5975, local632, "<img=1>" + local415, "<img=1>" + local417, local415);
														} else if (local437 == 1) {
															Static365.method5688(0, null, 18, local5975, local632, "<img=0>" + local415, "<img=0>" + local417, local415);
														} else {
															Static365.method5688(0, null, 18, local5975, local632, local415, local417, local415);
														}
													}
													Static71.aClass71_22 = null;
													return true;
												} else {
													@Pc(6058) byte local6058;
													if (Static601.aClass71_145 == Static71.aClass71_22) {
														local223 = Static442.aClass8_Sub8_Sub2_2.method8541();
														local6058 = Static442.aClass8_Sub8_Sub2_2.method8539();
														Static420.aClass77_1.method2390(local223, local6058);
														Static71.aClass71_22 = null;
														return true;
													} else if (Static71.aClass71_22 == Static430.aClass71_108) {
														local223 = Static442.aClass8_Sub8_Sub2_2.method8520();
														local75 = Static442.aClass8_Sub8_Sub2_2.method8541();
														Static199.method3714();
														Static315.method7475(local223, local75);
														Static71.aClass71_22 = null;
														return true;
													} else if (Static180.aClass71_42 == Static71.aClass71_22) {
														if (Static212.anInt4965 != -1) {
															Static279.method4733(Static212.anInt4965, 0);
														}
														Static71.aClass71_22 = null;
														return true;
													} else if (Static71.aClass71_22 == Static520.aClass71_123) {
														local2439 = Static442.aClass8_Sub8_Sub2_2.method8570();
														local75 = Static442.aClass8_Sub8_Sub2_2.method8556();
														Static199.method3714();
														Static325.method5352(local75, local2439);
														Static71.aClass71_22 = null;
														return true;
													} else if (Static71.aClass71_22 == Static505.aClass71_120) {
														Static305.method5026(Static521.aClass314_12);
														Static71.aClass71_22 = null;
														return true;
													} else if (Static250.aClass71_64 == Static71.aClass71_22) {
														if (Static118.method5770(Static435.anInt8191)) {
															Static128.anInt3427 = (int) ((float) Static442.aClass8_Sub8_Sub2_2.method8578() * 2.5F);
														} else {
															Static128.anInt3427 = Static442.aClass8_Sub8_Sub2_2.method8578() * 30;
														}
														Static71.aClass71_22 = null;
														Static409.anInt7812 = Static75.anInt2309;
														return true;
													} else if (Static228.aClass71_54 == Static71.aClass71_22) {
														local223 = Static442.aClass8_Sub8_Sub2_2.method8528();
														local75 = Static442.aClass8_Sub8_Sub2_2.method8552();
														local231 = Static442.aClass8_Sub8_Sub2_2.method8527();
														local601 = Static442.aClass8_Sub8_Sub2_2.method8578() << 2;
														local605 = Static442.aClass8_Sub8_Sub2_2.method8525();
														Static199.method3714();
														Static63.method1686(local75, local605, local231, local601, true, local223);
														Static71.aClass71_22 = null;
														return true;
													} else if (Static192.aClass71_47 == Static71.aClass71_22) {
														Static446.anInt7846 = Static442.aClass8_Sub8_Sub2_2.method8528();
														Static19.anInt3640 = Static442.aClass8_Sub8_Sub2_2.method8527();
														Static71.aClass71_22 = null;
														return true;
													} else if (Static544.aClass71_131 == Static71.aClass71_22) {
														local2439 = Static442.aClass8_Sub8_Sub2_2.method8570();
														local415 = Static378.method5954(Static207.method3783(Static442.aClass8_Sub8_Sub2_2));
														Static170.method3363(local415, local2439, 6, 0, local2439, local2439);
														Static71.aClass71_22 = null;
														return true;
													} else if (Static71.aClass71_22 == Static399.aClass71_98) {
														local223 = Static442.aClass8_Sub8_Sub2_2.method8540();
														local75 = Static442.aClass8_Sub8_Sub2_2.method8528();
														Static199.method3714();
														Static24.method963(local75, local223);
														Static71.aClass71_22 = null;
														return true;
													} else if (Static642.aClass71_154 == Static71.aClass71_22) {
														local223 = Static442.aClass8_Sub8_Sub2_2.method8552();
														local75 = Static442.aClass8_Sub8_Sub2_2.method8527();
														local231 = Static442.aClass8_Sub8_Sub2_2.method8520();
														Static560.anIntArray532[local75] = local231;
														Static42.anIntArray60[local75] = local223;
														Static99.anIntArray117[local75] = 1;
														local601 = Static96.anIntArray116[local75] - 1;
														for (local605 = 0; local605 < local601; local605++) {
															if (local231 >= Class13_Sub5.anIntArray338[local605]) {
																Static99.anIntArray117[local75] = local605 + 2;
															}
														}
														Static464.anIntArray453[Static299.anInt5987++ & 0x1F] = local75;
														Static71.aClass71_22 = null;
														return true;
													} else if (Static71.aClass71_22 == Static616.aClass71_149) {
														Static199.method3714();
														Static254.method3442();
														Static71.aClass71_22 = null;
														return true;
													} else if (Static71.aClass71_22 == Static156.aClass71_40) {
														local223 = Static442.aClass8_Sub8_Sub2_2.method8528();
														Static199.method3714();
														Static214.anInt4980 = local223;
														Static71.aClass71_22 = null;
														return true;
													} else if (Static71.aClass71_22 == Static127.aClass71_33) {
														Static554.anInt9637 = Static442.aClass8_Sub8_Sub2_2.method8525();
														for (local223 = 0; local223 < Static554.anInt9637; local223++) {
															Static525.aStringArray32[local223] = Static442.aClass8_Sub8_Sub2_2.method8570();
															Static512.aStringArray31[local223] = Static442.aClass8_Sub8_Sub2_2.method8570();
															if (Static512.aStringArray31[local223].equals("")) {
																Static512.aStringArray31[local223] = Static525.aStringArray32[local223];
															}
															Static304.aStringArray18[local223] = Static442.aClass8_Sub8_Sub2_2.method8570();
															Static574.aStringArray35[local223] = Static442.aClass8_Sub8_Sub2_2.method8570();
															if (Static574.aStringArray35[local223].equals("")) {
																Static574.aStringArray35[local223] = Static304.aStringArray18[local223];
															}
															Static423.aBooleanArray23[local223] = false;
														}
														Static198.anInt4606 = Static75.anInt2309;
														Static71.aClass71_22 = null;
														return true;
													} else if (Static71.aClass71_22 == Static611.aClass71_146) {
														local223 = Static442.aClass8_Sub8_Sub2_2.method8578();
														local75 = Static442.aClass8_Sub8_Sub2_2.method8525();
														local2347 = (local75 & 0x1) == 1;
														Static74.method1948(local223, local2347);
														local601 = Static442.aClass8_Sub8_Sub2_2.method8578();
														for (local605 = 0; local605 < local601; local605++) {
															local616 = Static442.aClass8_Sub8_Sub2_2.method8528();
															if (local616 == 255) {
																local616 = Static442.aClass8_Sub8_Sub2_2.method8520();
															}
															local620 = Static442.aClass8_Sub8_Sub2_2.method8576();
															Static423.method6602(local223, local616, local605, local2347, local620 - 1);
														}
														Static2.anIntArray288[Static533.anInt9188++ & 0x1F] = local223;
														Static71.aClass71_22 = null;
														return true;
													} else if (Static71.aClass71_22 == Static386.aClass71_96) {
														local223 = Static442.aClass8_Sub8_Sub2_2.method8545();
														Static199.method3714();
														Static373.method7299(local223);
														Static71.aClass71_22 = null;
														return true;
													} else if (Static71.aClass71_22 == Static19.aClass71_35) {
														Static305.method5026(Static277.aClass314_9);
														Static71.aClass71_22 = null;
														return true;
													} else if (Static71.aClass71_22 == Static347.aClass71_87) {
														local223 = Static442.aClass8_Sub8_Sub2_2.method8576();
														local75 = Static442.aClass8_Sub8_Sub2_2.method8578();
														Static199.method3714();
														Static465.method6988(local223, local75);
														Static71.aClass71_22 = null;
														return true;
													} else if (Static71.aClass71_22 == Static478.aClass71_114) {
														local223 = Static442.aClass8_Sub8_Sub2_2.method8541();
														local415 = Static442.aClass8_Sub8_Sub2_2.method8570();
														Static199.method3714();
														Static288.method3437(local223, local415);
														Static71.aClass71_22 = null;
														return true;
													} else if (Static71.aClass71_22 == Static204.aClass71_51) {
														local223 = Static442.aClass8_Sub8_Sub2_2.method8545();
														local75 = Static442.aClass8_Sub8_Sub2_2.method8552();
														local2347 = (local75 & 0x1) == 1;
														Static332.method5396(local223, local2347);
														Static2.anIntArray288[Static533.anInt9188++ & 0x1F] = local223;
														Static71.aClass71_22 = null;
														return true;
													} else if (Static520.aClass71_124 == Static71.aClass71_22) {
														local223 = Static442.aClass8_Sub8_Sub2_2.method8528();
														local75 = Static442.aClass8_Sub8_Sub2_2.method8528();
														local231 = Static442.aClass8_Sub8_Sub2_2.method8528();
														local601 = Static442.aClass8_Sub8_Sub2_2.method8541() << 2;
														local605 = Static442.aClass8_Sub8_Sub2_2.method8525();
														Static199.method3714();
														Static78.method2056(local601, local605, local231, local75, local223);
														Static71.aClass71_22 = null;
														return true;
													} else if (Static78.aClass71_24 == Static71.aClass71_22) {
														local223 = Static442.aClass8_Sub8_Sub2_2.method8545();
														local75 = Static442.aClass8_Sub8_Sub2_2.method8552();
														Static420.aClass77_1.method2395(local75, local223);
														Static71.aClass71_22 = null;
														return true;
													} else if (Static638.aClass71_153 == Static71.aClass71_22) {
														local223 = Static442.aClass8_Sub8_Sub2_2.method8576();
														local6058 = Static442.aClass8_Sub8_Sub2_2.method8521();
														Static199.method3714();
														Static315.method7475(local6058, local223);
														Static71.aClass71_22 = null;
														return true;
													} else if (Static599.aClass71_144 == Static71.aClass71_22) {
														local223 = Static442.aClass8_Sub8_Sub2_2.method8540();
														Static199.method3714();
														Static335.method5422(-1, local223, 3, -1);
														Static71.aClass71_22 = null;
														return true;
													} else if (Static58.aClass71_14 == Static71.aClass71_22) {
														Static442.aClass8_Sub8_Sub2_2.anInt10588 += 28;
														if (Static442.aClass8_Sub8_Sub2_2.method8555()) {
															Static640.method8617(Static442.aClass8_Sub8_Sub2_2.anInt10588 - 28, Static442.aClass8_Sub8_Sub2_2);
														}
														Static71.aClass71_22 = null;
														return true;
													} else if (Static71.aClass71_22 == Static71.aClass71_21) {
														Static305.method5026(Static564.aClass314_13);
														Static71.aClass71_22 = null;
														return true;
													} else if (Static399.aClass71_97 == Static71.aClass71_22) {
														Static298.method8349();
														Static71.aClass71_22 = null;
														return false;
													} else if (Static71.aClass71_22 == Static568.aClass71_135) {
														Static305.method5026(Static121.aClass314_6);
														Static71.aClass71_22 = null;
														return true;
													} else if (Static71.aClass71_22 == Static414.aClass71_102) {
														Static305.method5026(Static86.aClass314_3);
														Static71.aClass71_22 = null;
														return true;
													} else if (Static57.aClass71_13 == Static71.aClass71_22) {
														local223 = Static442.aClass8_Sub8_Sub2_2.method8553();
														Static199.method3714();
														Static335.method5422(0, local223, 5, Static616.anInt10362);
														Static71.aClass71_22 = null;
														return true;
													} else if (Static71.aClass71_22 == Static229.aClass71_57) {
														local223 = Static442.aClass8_Sub8_Sub2_2.method8520();
														local75 = Static442.aClass8_Sub8_Sub2_2.method8545();
														Static420.aClass77_1.method2395(local223, local75);
														Static71.aClass71_22 = null;
														return true;
													} else if (Static255.aClass71_65 == Static71.aClass71_22) {
														Static305.method5026(Static427.aClass314_11);
														Static71.aClass71_22 = null;
														return true;
													} else if (Static238.aClass71_60 == Static71.aClass71_22) {
														local223 = Static442.aClass8_Sub8_Sub2_2.method8578();
														local415 = Static442.aClass8_Sub8_Sub2_2.method8570();
														Static199.method3714();
														Static288.method3437(local223, local415);
														Static71.aClass71_22 = null;
														return true;
													} else {
														Static596.method8231("T1 - " + (Static71.aClass71_22 == null ? -1 : Static71.aClass71_22.method2221()) + "," + (Static415.aClass71_103 == null ? -1 : Static415.aClass71_103.method2221()) + "," + (Static239.aClass71_61 == null ? -1 : Static239.aClass71_61.method2221()) + " - " + Static635.anInt10565, null);
														Static232.method4294(false);
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

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(IZZI)I")
	public static int method8473(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class8_Sub18 local8 = Static211.method4038(arg1, arg2);
		if (local8 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local8.anIntArray153.length) {
			return local8.anIntArray153[arg0];
		} else {
			return -1;
		}
	}
}
