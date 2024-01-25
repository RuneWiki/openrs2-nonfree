import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
	public static int anInt3034;

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "Z")
	public static boolean aBoolean229 = false;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IB)I")
	public static int method2489(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local14 < local23) {
			local46 = local23;
		}
		if (local46 < local30) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local46 + local32) / 2.0D;
		if (local46 != local32) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local46 + local32);
			}
			if (local46 == local14) {
				local60 = (local23 - local30) / (-local32 + local46);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / ((2.0D - local46) - local32);
			}
		}
		local60 /= 6.0D;
		@Pc(155) int local155 = (int) (local60 * 256.0D);
		@Pc(168) int local168 = (int) (local62 * 256.0D);
		@Pc(173) int local173 = (int) (local68 * 256.0D);
		if (local168 < 0) {
			local168 = 0;
		} else if (local168 > 255) {
			local168 = 255;
		}
		if (local173 < 0) {
			local173 = 0;
		} else if (local173 > 255) {
			local173 = 255;
		}
		if (local173 > 243) {
			local168 >>= 0x4;
		} else if (local173 > 217) {
			local168 >>= 0x3;
		} else if (local173 > 192) {
			local168 >>= 0x2;
		} else if (local173 > 179) {
			local168 >>= 0x1;
		}
		return (local173 >> 1) + (local168 >> 5 << 7) + ((local155 >> 2 & 0x3F) << 10);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZLclient!so;)V")
	public static void method2490(@OriginalArg(1) Class224 arg0) {
		@Pc(12) int local12;
		@Pc(21) int local21;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(40) int local40;
		@Pc(44) int local44;
		if (arg0 == Static396.aClass224_25) {
			local12 = Static154.aClass1_Sub11_Sub1_3.method4504();
			local21 = Static403.anInt6530 + (local12 >> 4 & 0x7);
			local28 = Static74.anInt1414 + (local12 & 0x7);
			local32 = Static154.aClass1_Sub11_Sub1_3.method4459();
			local36 = local32 >> 2;
			local40 = local32 & 0x3;
			local44 = Static8.anIntArray488[local36];
			if (Static37.method636(Static108.anInt1918) || local21 >= 0 && local28 >= 0 && local21 < Static425.anInt6922 && Static251.anInt4072 > local28) {
				Static150.method2101(local36, local21, local40, local44, -1, Static382.anInt6355, local28);
			}
		} else if (arg0 == Static273.aClass224_16) {
			local12 = Static154.aClass1_Sub11_Sub1_3.method4485();
			local21 = Static154.aClass1_Sub11_Sub1_3.method4463();
			Static259.aClass95_3.method1821(local12).method2827(local21);
		} else {
			@Pc(149) int local149;
			@Pc(166) int local166;
			@Pc(145) int local145;
			if (Static393.aClass224_24 == arg0) {
				local12 = Static154.aClass1_Sub11_Sub1_3.method4463();
				local21 = Static403.anInt6530 + (local12 >> 4 & 0x7);
				local28 = (local12 & 0x7) + Static74.anInt1414;
				local32 = Static154.aClass1_Sub11_Sub1_3.method4485();
				if (local32 == 65535) {
					local32 = -1;
				}
				local36 = Static154.aClass1_Sub11_Sub1_3.method4463();
				local40 = local36 >> 4 & 0xF;
				local44 = local36 & 0x7;
				local145 = Static154.aClass1_Sub11_Sub1_3.method4463();
				local149 = Static154.aClass1_Sub11_Sub1_3.method4463();
				if (local21 >= 0 && local28 >= 0 && local21 < Static425.anInt6922 && Static251.anInt4072 > local28) {
					local166 = local40 + 1;
					if (local21 - local166 <= Static239.aClass20_Sub3_Sub3_Sub1_1.anIntArray370[0] && local166 + local21 >= Static239.aClass20_Sub3_Sub3_Sub1_1.anIntArray370[0] && Static239.aClass20_Sub3_Sub3_Sub1_1.anIntArray369[0] >= local28 - local166 && Static239.aClass20_Sub3_Sub3_Sub1_1.anIntArray369[0] <= local28 + local166) {
						Static1.method38(local40 + (local21 << 16) + (Static382.anInt6355 << 24) + (local28 << 8), local32, local149, local44, local145);
					}
				}
			} else if (Static279.aClass224_27 == arg0) {
				local12 = Static154.aClass1_Sub11_Sub1_3.method4504();
				local21 = local12 >> 2;
				local28 = local12 & 0x3;
				local32 = Static8.anIntArray488[local21];
				local36 = Static154.aClass1_Sub11_Sub1_3.method4459();
				local40 = (local36 >> 4 & 0x7) + Static403.anInt6530;
				local44 = (local36 & 0x7) + Static74.anInt1414;
				local145 = Static154.aClass1_Sub11_Sub1_3.method4486();
				if (local145 == 65535) {
					local145 = -1;
				}
				Static359.method4654(local32, local21, local44, local40, local145, Static382.anInt6355, local28);
			} else if (Static329.aClass224_20 == arg0) {
				local12 = Static154.aClass1_Sub11_Sub1_3.method4463();
				local21 = Static403.anInt6530 + (local12 >> 4 & 0x7);
				local28 = Static74.anInt1414 + (local12 & 0x7);
				local32 = Static154.aClass1_Sub11_Sub1_3.method4485();
				local36 = Static154.aClass1_Sub11_Sub1_3.method4463();
				local40 = Static154.aClass1_Sub11_Sub1_3.method4485();
				local44 = Static154.aClass1_Sub11_Sub1_3.method4463();
				if (local21 >= 0 && local28 >= 0 && local21 < Static425.anInt6922 && local28 < Static251.anInt4072) {
					local145 = local21 * 128 + 64;
					local149 = local28 * 128 + 64;
					local166 = Static382.anInt6355;
					if (local166 < 3 && Static346.method4403(local28, local21)) {
						local166++;
					}
					@Pc(393) Class20_Sub3_Sub4 local393 = new Class20_Sub3_Sub4(local32, local40, Static368.anInt6250, Static382.anInt6355, local166, local145, Static183.method4175(local149, local145, Static382.anInt6355) - local36, local149, local21, local21, local28, local28, local44);
					Static245.aClass254_23.method5430(new Class1_Sub3_Sub9(local393));
				}
			} else if (Static427.aClass224_26 == arg0) {
				Static154.aClass1_Sub11_Sub1_3.method4463();
				local12 = Static154.aClass1_Sub11_Sub1_3.method4463();
				local21 = (local12 >> 4 & 0x7) + Static403.anInt6530;
				local28 = (local12 & 0x7) + Static74.anInt1414;
				local32 = Static154.aClass1_Sub11_Sub1_3.method4485();
				local36 = Static154.aClass1_Sub11_Sub1_3.method4463();
				local40 = Static154.aClass1_Sub11_Sub1_3.method4493();
				@Pc(442) String local442 = Static154.aClass1_Sub11_Sub1_3.method4484();
				Static92.method1317(Static382.anInt6355, local28, local442, local40, local36, local32, local21);
			} else if (Static111.aClass224_21 == arg0) {
				local12 = Static154.aClass1_Sub11_Sub1_3.method4485();
				local21 = Static154.aClass1_Sub11_Sub1_3.method4463();
				local28 = Static403.anInt6530 + (local21 >> 4 & 0x7);
				local32 = Static74.anInt1414 + (local21 & 0x7);
				if (local28 >= 0 && local32 >= 0 && local28 < Static425.anInt6922 && local32 < Static251.anInt4072) {
					@Pc(518) Class1_Sub19 local518 = (Class1_Sub19) Static194.aClass257_13.method5503((long) (local28 | Static382.anInt6355 << 28 | local32 << 14));
					if (local518 != null) {
						for (@Pc(526) Class1_Sub13 local526 = (Class1_Sub13) local518.aClass254_15.method5437(); local526 != null; local526 = (Class1_Sub13) local518.aClass254_15.method5433()) {
							if ((local12 & 0x7FFF) == local526.anInt1501) {
								local526.method5617();
								break;
							}
						}
						if (local518.aClass254_15.method5444()) {
							local518.method5617();
						}
						Static324.method4162(Static382.anInt6355, local28, local32);
					}
				}
			} else if (Static7.aClass224_23 == arg0) {
				local12 = Static154.aClass1_Sub11_Sub1_3.method4486();
				local21 = Static154.aClass1_Sub11_Sub1_3.method4486();
				local28 = Static154.aClass1_Sub11_Sub1_3.method4504();
				local32 = (local28 >> 4 & 0x7) + Static403.anInt6530;
				local36 = (local28 & 0x7) + Static74.anInt1414;
				if (local32 >= 0 && local36 >= 0 && Static425.anInt6922 > local32 && Static251.anInt4072 > local36) {
					Static71.method1131(local32, local36, Static382.anInt6355, new Class1_Sub13(local12, local21));
					Static324.method4162(Static382.anInt6355, local32, local36);
				}
			} else {
				@Pc(696) int local696;
				@Pc(700) int local700;
				@Pc(704) int local704;
				@Pc(713) int local713;
				@Pc(809) Class20_Sub3_Sub2 local809;
				if (arg0 == Static272.aClass224_15) {
					local12 = Static154.aClass1_Sub11_Sub1_3.method4463();
					@Pc(642) boolean local642 = (local12 & 0x80) != 0;
					local28 = (local12 >> 3 & 0x7) + Static403.anInt6530;
					local32 = Static74.anInt1414 + (local12 & 0x7);
					local36 = Static154.aClass1_Sub11_Sub1_3.method4452() + local28;
					local40 = Static154.aClass1_Sub11_Sub1_3.method4452() + local32;
					local44 = Static154.aClass1_Sub11_Sub1_3.method4482();
					local145 = Static154.aClass1_Sub11_Sub1_3.method4485();
					local149 = Static154.aClass1_Sub11_Sub1_3.method4463() * 4;
					local166 = Static154.aClass1_Sub11_Sub1_3.method4463() * 4;
					local696 = Static154.aClass1_Sub11_Sub1_3.method4485();
					local700 = Static154.aClass1_Sub11_Sub1_3.method4485();
					local704 = Static154.aClass1_Sub11_Sub1_3.method4463();
					if (local704 == 255) {
						local704 = -1;
					}
					local713 = Static154.aClass1_Sub11_Sub1_3.method4463();
					if (local28 >= 0 && local32 >= 0 && Static425.anInt6922 > local28 && Static251.anInt4072 > local32 && local36 >= 0 && local40 >= 0 && Static425.anInt6922 > local36 && Static251.anInt4072 > local40 && local145 != 65535) {
						local149 <<= 0x0;
						local166 <<= 0x0;
						local40 = local40 * 128 + 64;
						local36 = local36 * 128 + 64;
						local28 = local28 * 128 + 64;
						local32 = local32 * 128 + 64;
						local809 = new Class20_Sub3_Sub2(local145, Static382.anInt6355, local28, local32, local149, local696 + Static368.anInt6250, local700 + Static368.anInt6250, local704, local713, local44, local166, local642);
						local809.method1880(local36, local40, Static183.method4175(local40, local36, Static382.anInt6355) - local166, Static368.anInt6250 + local696);
						Static264.aClass254_25.method5430(new Class1_Sub3_Sub4(local809));
					}
				} else if (arg0 == Static85.aClass224_17) {
					local12 = Static154.aClass1_Sub11_Sub1_3.method4494();
					@Pc(844) byte local844 = Static154.aClass1_Sub11_Sub1_3.method4473();
					local28 = Static154.aClass1_Sub11_Sub1_3.method4486();
					local32 = Static154.aClass1_Sub11_Sub1_3.method4465();
					local36 = (local32 >> 4 & 0x7) + Static403.anInt6530;
					local40 = Static74.anInt1414 + (local32 & 0x7);
					@Pc(871) byte local871 = Static154.aClass1_Sub11_Sub1_3.method4477();
					local145 = Static154.aClass1_Sub11_Sub1_3.method4485();
					@Pc(879) byte local879 = Static154.aClass1_Sub11_Sub1_3.method4477();
					local166 = Static154.aClass1_Sub11_Sub1_3.method4465();
					local696 = local166 >> 2;
					local700 = local166 & 0x3;
					@Pc(899) byte local899 = Static154.aClass1_Sub11_Sub1_3.method4452();
					local713 = Static154.aClass1_Sub11_Sub1_3.method4500();
					if (!Static213.aClass128_22.method3569()) {
						Static207.method2800(local40, Static382.anInt6355, local36, local713, local700, local28, local871, local879, local899, local696, local12, local844, local145);
					}
				} else {
					@Pc(955) boolean local955;
					if (arg0 == Static54.aClass224_8) {
						local12 = Static154.aClass1_Sub11_Sub1_3.method4463();
						local21 = (local12 >> 4 & 0xF) + Static403.anInt6530 * 2;
						local28 = Static74.anInt1414 * 2 + (local12 & 0xF);
						local955 = Static154.aClass1_Sub11_Sub1_3.method4463() != 0;
						local36 = Static154.aClass1_Sub11_Sub1_3.method4452() + local21;
						local40 = Static154.aClass1_Sub11_Sub1_3.method4452() + local28;
						local44 = Static154.aClass1_Sub11_Sub1_3.method4482();
						local145 = Static154.aClass1_Sub11_Sub1_3.method4482();
						local149 = Static154.aClass1_Sub11_Sub1_3.method4485();
						@Pc(987) byte local987 = Static154.aClass1_Sub11_Sub1_3.method4452();
						local696 = Static154.aClass1_Sub11_Sub1_3.method4463() * 4;
						local700 = Static154.aClass1_Sub11_Sub1_3.method4485();
						local704 = Static154.aClass1_Sub11_Sub1_3.method4485();
						local713 = Static154.aClass1_Sub11_Sub1_3.method4463();
						@Pc(1009) int local1009 = Static154.aClass1_Sub11_Sub1_3.method4463();
						if (local713 == 255) {
							local713 = -1;
						}
						if (local21 >= 0 && local28 >= 0 && local21 < Static425.anInt6922 * 2 && local28 < Static425.anInt6922 * 2 && local36 >= 0 && local40 >= 0 && local36 < Static251.anInt4072 * 2 && local40 < Static251.anInt4072 * 2 && local149 != 65535) {
							local40 *= 64;
							local696 <<= 0x0;
							local28 *= 64;
							local21 = local21 * 64;
							local36 = local36 * 64;
							local166 = local987 << 0;
							if (local44 != 0) {
								@Pc(1101) int local1101;
								@Pc(1105) Class20_Sub3_Sub3 local1105;
								@Pc(1091) int local1091;
								@Pc(1095) int local1095;
								if (local44 >= 0) {
									local1091 = local44 - 1;
									local1095 = local1091 & 0x7FF;
									local1101 = local1091 >> 11 & 0xF;
									local1105 = Static98.aClass20_Sub3_Sub3_Sub2Array1[local1095];
								} else {
									local1091 = -local44 - 1;
									local1095 = local1091 & 0x7FF;
									local1101 = local1091 >> 11 & 0xF;
									if (Static348.anInt5668 == local1095) {
										local1105 = Static239.aClass20_Sub3_Sub3_Sub1_1;
									} else {
										local1105 = Static73.aClass20_Sub3_Sub3_Sub1Array1[local1095];
									}
								}
								if (local1105 != null) {
									@Pc(1143) Class51 local1143 = local1105.method4676();
									if (local1143.anIntArrayArray34 != null && local1143.anIntArrayArray34[local1101] != null) {
										local1095 = local1143.anIntArrayArray34[local1101][0];
										@Pc(1165) int local1165 = local1143.anIntArrayArray34[local1101][2];
										@Pc(1170) int local1170 = local1105.aClass145_7.method2946();
										@Pc(1174) int local1174 = Class1_Sub1_Sub25.anIntArray249[local1170];
										@Pc(1178) int local1178 = Class1_Sub1_Sub25.anIntArray248[local1170];
										@Pc(1188) int local1188 = local1095 * local1178 + local1174 * local1165 >> 15;
										@Pc(1198) int local1198 = local1165 * local1178 - local1095 * local1174 >> 15;
										local28 += local1198;
										local166 -= local1143.anIntArrayArray34[local1101][1];
										local21 += local1188;
									}
								}
							}
							@Pc(1237) Class20_Sub3_Sub2 local1237 = new Class20_Sub3_Sub2(local149, Static382.anInt6355, local21, local28, local166, Static368.anInt6250 + local700, local704 + Static368.anInt6250, local713, local1009, local145, local696, local955);
							local1237.method1880(local36, local40, Static183.method4175(local40, local36, Static382.anInt6355) - local696, Static368.anInt6250 + local700);
							Static264.aClass254_25.method5430(new Class1_Sub3_Sub4(local1237));
						}
					} else if (arg0 == Static192.aClass224_13) {
						local12 = Static154.aClass1_Sub11_Sub1_3.method4500();
						local21 = Static154.aClass1_Sub11_Sub1_3.method4463();
						local28 = Static403.anInt6530 + (local21 >> 4 & 0x7);
						local32 = (local21 & 0x7) + Static74.anInt1414;
						local36 = Static154.aClass1_Sub11_Sub1_3.method4485();
						local40 = Static154.aClass1_Sub11_Sub1_3.method4486();
						if (local28 >= 0 && local32 >= 0 && local28 < Static425.anInt6922 && local32 < Static251.anInt4072 && local36 != Static348.anInt5668) {
							Static71.method1131(local28, local32, Static382.anInt6355, new Class1_Sub13(local40, local12));
							Static324.method4162(Static382.anInt6355, local28, local32);
						}
					} else if (arg0 == Static439.aClass224_28) {
						local12 = Static154.aClass1_Sub11_Sub1_3.method4463();
						local21 = (local12 >> 4 & 0xF) + Static403.anInt6530 * 2;
						local28 = (local12 & 0xF) + Static74.anInt1414 * 2;
						local955 = Static154.aClass1_Sub11_Sub1_3.method4463() != 0;
						local36 = Static154.aClass1_Sub11_Sub1_3.method4452() + local21;
						local40 = Static154.aClass1_Sub11_Sub1_3.method4452() + local28;
						local44 = Static154.aClass1_Sub11_Sub1_3.method4482();
						local145 = Static154.aClass1_Sub11_Sub1_3.method4485();
						local149 = Static154.aClass1_Sub11_Sub1_3.method4463() * 4;
						local166 = Static154.aClass1_Sub11_Sub1_3.method4463() * 4;
						local696 = Static154.aClass1_Sub11_Sub1_3.method4485();
						local700 = Static154.aClass1_Sub11_Sub1_3.method4485();
						local704 = Static154.aClass1_Sub11_Sub1_3.method4463();
						local713 = Static154.aClass1_Sub11_Sub1_3.method4463();
						if (local704 == 255) {
							local704 = -1;
						}
						if (local21 >= 0 && local28 >= 0 && Static425.anInt6922 * 2 > local21 && local28 < Static425.anInt6922 * 2 && local36 >= 0 && local40 >= 0 && local36 < Static251.anInt4072 * 2 && local40 < Static251.anInt4072 * 2 && local145 != 65535) {
							local166 <<= 0x0;
							local28 = local28 * 64;
							local21 = local21 * 64;
							local40 *= 64;
							local149 <<= 0x0;
							local36 *= 64;
							local809 = new Class20_Sub3_Sub2(local145, Static382.anInt6355, local21, local28, local149, Static368.anInt6250 + local696, Static368.anInt6250 + local700, local704, local713, local44, local166, local955);
							local809.method1880(local36, local40, Static183.method4175(local40, local36, Static382.anInt6355) - local166, local696 + Static368.anInt6250);
							Static264.aClass254_25.method5430(new Class1_Sub3_Sub4(local809));
						}
					} else if (arg0 == Static65.aClass224_9) {
						local12 = Static154.aClass1_Sub11_Sub1_3.method4504();
						local21 = local12 >> 2;
						local28 = local12 & 0x3;
						local32 = Static8.anIntArray488[local21];
						local36 = Static154.aClass1_Sub11_Sub1_3.method4497();
						local40 = Static154.aClass1_Sub11_Sub1_3.method4463();
						local44 = (local40 >> 4 & 0x7) + Static403.anInt6530;
						local145 = Static74.anInt1414 + (local40 & 0x7);
						if (Static37.method636(Static108.anInt1918) || local44 >= 0 && local145 >= 0 && Static425.anInt6922 > local44 && local145 < Static251.anInt4072) {
							Static150.method2101(local21, local44, local28, local32, local36, Static382.anInt6355, local145);
						}
					} else if (arg0 == Static342.aClass224_22) {
						local12 = Static154.aClass1_Sub11_Sub1_3.method4463();
						local21 = Static403.anInt6530 + (local12 >> 4 & 0x7);
						local28 = (local12 & 0x7) + Static74.anInt1414;
						local32 = Static154.aClass1_Sub11_Sub1_3.method4485();
						local36 = Static154.aClass1_Sub11_Sub1_3.method4485();
						local40 = Static154.aClass1_Sub11_Sub1_3.method4485();
						if (Static194.aClass257_13 != null && local21 >= 0 && local28 >= 0 && local21 < Static425.anInt6922 && local28 < Static251.anInt4072) {
							@Pc(1700) Class1_Sub19 local1700 = (Class1_Sub19) Static194.aClass257_13.method5503((long) (Static382.anInt6355 << 28 | local28 << 14 | local21));
							if (local1700 != null) {
								for (@Pc(1708) Class1_Sub13 local1708 = (Class1_Sub13) local1700.aClass254_15.method5437(); local1708 != null; local1708 = (Class1_Sub13) local1700.aClass254_15.method5433()) {
									if ((local32 & 0x7FFF) == local1708.anInt1501 && local1708.anInt1503 == local36) {
										local1708.method5617();
										local1708.anInt1503 = local40;
										Static71.method1131(local21, local28, Static382.anInt6355, local1708);
										break;
									}
								}
								Static324.method4162(Static382.anInt6355, local21, local28);
							}
						}
					} else {
						Static211.method2815(null, "T3 - " + arg0);
						Static252.method2868();
					}
				}
			}
		}
	}
}
