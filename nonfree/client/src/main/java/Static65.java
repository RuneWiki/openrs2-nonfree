import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!co", name = "b", descriptor = "I")
	public static int anInt1322;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "Lclient!gi;")
	public static final Class122 aClass122_3 = new Class122();

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(BII)Z")
	public static boolean method1177(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!r;IIILclient!sp;Lclient!lt;)Z")
	public static boolean method1178(@OriginalArg(0) Class134 arg0, @OriginalArg(4) Class310 arg1, @OriginalArg(5) Class1_Sub32 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg1.anIntArray624 != null) {
			local11 = Static226.anInt6320 - (arg2.anInt5298 + arg1.anInt8138 - Static226.anInt6312) * (-Static226.anInt6321 + Static226.anInt6320) / (Static226.anInt6316 - Static226.anInt6312);
			local7 = Static226.anInt6313 + (Static226.anInt6311 - Static226.anInt6313) * (arg1.anInt8133 + arg2.anInt5301 - Static226.anInt6319) / (Static226.anInt6322 - Static226.anInt6319);
			local13 = Static226.anInt6320 - (Static226.anInt6320 - Static226.anInt6321) * (arg1.anInt8142 - -arg2.anInt5298 + -Static226.anInt6312) / (Static226.anInt6316 - Static226.anInt6312);
			local9 = Static226.anInt6313 + (Static226.anInt6311 - Static226.anInt6313) * (arg2.anInt5301 + arg1.anInt8110 + -Static226.anInt6319) / (Static226.anInt6322 - Static226.anInt6319);
		}
		@Pc(104) Class22 local104 = null;
		@Pc(106) int local106 = 0;
		@Pc(108) int local108 = 0;
		@Pc(110) int local110 = 0;
		@Pc(112) int local112 = 0;
		if (arg1.anInt8124 != -1) {
			if (arg2.aBoolean426 && arg1.anInt8108 != -1) {
				local104 = arg1.method6532(true, arg0);
			} else {
				local104 = arg1.method6532(false, arg0);
			}
			if (local104 != null) {
				local106 = arg2.anInt5295 - (local104.A() + 1 >> 1);
				if (local7 > local106) {
					local7 = local106;
				}
				local108 = arg2.anInt5295 + (local104.A() + 1 >> 1);
				local110 = arg2.anInt5299 - (local104.ca() + 1 >> 1);
				if (local108 > local9) {
					local9 = local108;
				}
				local112 = arg2.anInt5299 + (local104.ca() + 1 >> 1);
				if (local11 > local110) {
					local11 = local110;
				}
				if (local112 > local13) {
					local13 = local112;
				}
			}
		}
		@Pc(202) Class31 local202 = null;
		@Pc(204) int local204 = 0;
		@Pc(211) int local211 = 0;
		@Pc(213) int local213 = 0;
		@Pc(215) int local215 = 0;
		@Pc(217) int local217 = 0;
		@Pc(219) int local219 = 0;
		@Pc(221) int local221 = 0;
		@Pc(270) int local270;
		@Pc(297) int local297;
		if (arg1.aString84 != null) {
			local202 = Static584.method7803(arg1.anInt8135);
			if (local202 != null) {
				local204 = Static291.aClass334_9.method7357(null, null, arg1.aString84, Static594.aStringArray44);
				local211 = arg2.anInt5299;
				if (local104 == null) {
					local211 -= local204 * local202.method488() / 2;
				} else {
					local211 -= (local104.ca() >> 1) + local204 * local202.method486();
				}
				for (local270 = 0; local270 < local204; local270++) {
					@Pc(276) String local276 = Static594.aStringArray44[local270];
					if (local204 - 1 > local270) {
						local276 = local276.substring(0, local276.length() - 4);
					}
					local297 = local202.method484(local276);
					if (local213 < local297) {
						local213 = local297;
					}
				}
				local215 = arg2.anInt5295 - local213 / 2;
				if (local215 < local7) {
					local7 = local215;
				}
				local217 = local213 / 2 + arg2.anInt5295;
				if (local9 < local217) {
					local9 = local217;
				}
				local219 = local211;
				if (local11 > local219) {
					local11 = local219;
				}
				local221 = local211 + local202.method486() * local204;
				if (local221 > local13) {
					local13 = local221;
				}
			}
		}
		if (Static226.anInt6313 > local9 || local7 > Static226.anInt6311 || local13 < Static226.anInt6321 || local11 > Static226.anInt6320) {
			return true;
		}
		@Pc(395) int local395;
		if (arg1.anIntArray624 != null) {
			@Pc(393) int[] local393 = new int[arg1.anIntArray624.length];
			for (local395 = 0; local395 < local393.length / 2; local395++) {
				local297 = arg1.anIntArray624[local395 * 2] + arg2.anInt5301;
				@Pc(420) int local420 = arg1.anIntArray624[local395 * 2 + 1] + arg2.anInt5298;
				local393[local395 * 2] = Static226.anInt6313 + (Static226.anInt6311 - Static226.anInt6313) * (-Static226.anInt6319 + local297) / (Static226.anInt6322 - Static226.anInt6319);
				local393[local395 * 2 + 1] = Static226.anInt6320 - (local420 - Static226.anInt6312) * (-Static226.anInt6321 + Static226.anInt6320) / (Static226.anInt6316 - Static226.anInt6312);
			}
			Static551.method7495(arg0, local393, arg1.anInt8111);
			for (local297 = 0; local297 < local393.length / 2 - 1; local297++) {
				arg0.method6933(local393[local297 * 2], local393[local297 * 2 + 3], arg1.anInt8118, local393[local297 * 2 + 1], local393[(local297 + 1) * 2]);
			}
			arg0.method6933(local393[local393.length - 2], local393[1], arg1.anInt8118, local393[local393.length - 1], local393[0]);
		}
		if (local104 != null) {
			if (Static95.anInt2005 > 0 && (Static355.anInt5919 != -1 && arg2.anInt5300 == Static355.anInt5919 || Static58.anInt1101 != -1 && Static58.anInt1101 == arg1.anInt8130)) {
				if (Static520.anInt8816 <= 50) {
					local270 = Static520.anInt8816 * 2;
				} else {
					local270 = 200 - Static520.anInt8816 * 2;
				}
				local395 = local270 << 24 | 0xFFFF00;
				arg0.method6926(arg2.anInt5295, arg2.anInt5299, local395, local104.E() / 2 + 7);
				arg0.method6926(arg2.anInt5295, arg2.anInt5299, local395, local104.E() / 2 + 5);
				arg0.method6926(arg2.anInt5295, arg2.anInt5299, local395, local104.E() / 2 + 3);
				arg0.method6926(arg2.anInt5295, arg2.anInt5299, local395, local104.E() / 2 + 1);
				arg0.method6926(arg2.anInt5295, arg2.anInt5299, local395, local104.E() / 2);
			}
			local104.method7662(arg2.anInt5295 - (local104.A() >> 1), arg2.anInt5299 + -(local104.ca() >> 1));
		}
		if (arg1.aString84 != null && local202 != null) {
			Static114.method1793(arg2, local211, local202, local213, local204, arg0, arg1);
		}
		if (arg1.anInt8124 != -1 || arg1.aString84 != null) {
			@Pc(709) Class1_Sub9 local709 = new Class1_Sub9(arg2);
			local709.anInt1362 = local110;
			local709.anInt1364 = local108;
			local709.anInt1356 = local219;
			local709.anInt1365 = local215;
			local709.anInt1357 = local217;
			local709.anInt1359 = local112;
			local709.anInt1361 = local221;
			local709.anInt1358 = local106;
			Static497.aClass353_44.method7679(local709);
		}
		return false;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V")
	public static void method1180() {
		if (Static348.aClass1_Sub30_Sub1_1.method3916(Static113.anInt2222) != 2) {
			return;
		}
		@Pc(19) byte local19 = (byte) (Static350.anInt5818 - 4 & 0xFF);
		@Pc(23) int local23 = Static350.anInt5818 % Static71.anInt1410;
		@Pc(29) int local29;
		for (@Pc(25) int local25 = 0; local25 < 4; local25++) {
			for (local29 = 0; local29 < Static471.anInt8012; local29++) {
				Static165.aByteArrayArrayArray13[local25][local23][local29] = local19;
			}
		}
		if (Static433.anInt7592 == 3) {
			return;
		}
		for (local29 = 0; local29 < 2; local29++) {
			Static441.anIntArray644[local29] = -1000000;
			Static401.anIntArray539[local29] = 1000000;
			Static164.anIntArray688[local29] = 0;
			Static109.anIntArray265[local29] = 1000000;
			Static409.anIntArray543[local29] = 0;
		}
		@Pc(93) int local93 = Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9365;
		@Pc(96) int local96 = Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9370;
		@Pc(144) int local144;
		if (Static340.anInt5707 != 1 && Static442.anInt7679 == -1) {
			local144 = Static66.method1191(Static405.anInt7085, Static433.anInt7592, Static59.anInt1132);
			if (local144 - Static295.anInt5077 < 3200 && (Static455.aByteArrayArrayArray17[Static433.anInt7592][Static405.anInt7085 >> 9][Static59.anInt1132 >> 9] & 0x4) != 0) {
				Static501.method7000(false, Static405.anInt7085 >> 9, Static59.anInt1132 >> 9, 1, Static292.aClass39ArrayArrayArray2);
				return;
			}
			return;
		}
		if (Static340.anInt5707 != 1) {
			local93 = Static442.anInt7679;
			local96 = Static243.anInt4483;
		}
		if ((Static455.aByteArrayArrayArray17[Static433.anInt7592][local93 >> 9][local96 >> 9] & 0x4) != 0) {
			Static501.method7000(false, local93 >> 9, local96 >> 9, 0, Static292.aClass39ArrayArrayArray2);
		}
		if (Static103.anInt2093 >= 2560) {
			return;
		}
		local144 = Static405.anInt7085 >> 9;
		@Pc(148) int local148 = Static59.anInt1132 >> 9;
		@Pc(152) int local152 = local93 >> 9;
		@Pc(156) int local156 = local96 >> 9;
		@Pc(163) int local163;
		if (local152 <= local144) {
			local163 = local144 - local152;
		} else {
			local163 = local152 - local144;
		}
		@Pc(181) int local181;
		if (local156 > local148) {
			local181 = local156 - local148;
		} else {
			local181 = local148 - local156;
		}
		if ((local163 != 0 || local181 != 0) && -Static71.anInt1410 < local163 && local163 < Static71.anInt1410 && local181 > -Static471.anInt8012 && Static471.anInt8012 > local181) {
			@Pc(261) int local261;
			@Pc(263) int local263;
			if (local181 >= local163) {
				local261 = local163 * 65536 / local181;
				local263 = 32768;
				while (local156 != local148) {
					if (local156 > local148) {
						local148++;
					} else if (local156 < local148) {
						local148--;
					}
					if ((Static455.aByteArrayArrayArray17[Static433.anInt7592][local144][local148] & 0x4) != 0) {
						Static501.method7000(false, local144, local148, 1, Static292.aClass39ArrayArrayArray2);
						return;
					}
					local263 += local261;
					if (local263 >= 65536) {
						local263 -= 65536;
						if (local152 > local144) {
							local144++;
						} else if (local144 > local152) {
							local144--;
						}
						if ((Static455.aByteArrayArrayArray17[Static433.anInt7592][local144][local148] & 0x4) != 0) {
							Static501.method7000(false, local144, local148, 1, Static292.aClass39ArrayArrayArray2);
							return;
						}
					}
				}
				return;
			}
			local261 = local181 * 65536 / local163;
			local263 = 32768;
			while (local144 != local152) {
				if (local152 > local144) {
					local144++;
				} else if (local152 < local144) {
					local144--;
				}
				if ((Static455.aByteArrayArrayArray17[Static433.anInt7592][local144][local148] & 0x4) != 0) {
					Static501.method7000(false, local144, local148, 1, Static292.aClass39ArrayArrayArray2);
					return;
				}
				local263 += local261;
				if (local263 >= 65536) {
					local263 -= 65536;
					if (local156 > local148) {
						local148++;
					} else if (local148 > local156) {
						local148--;
					}
					if ((Static455.aByteArrayArrayArray17[Static433.anInt7592][local144][local148] & 0x4) != 0) {
						Static501.method7000(false, local144, local148, 1, Static292.aClass39ArrayArrayArray2);
						return;
					}
				}
			}
			return;
		}
		Static345.method4708(null, "RC: " + local144 + "," + local148 + " " + local152 + "," + local156 + " " + Static541.anInt9058 + "," + Static116.anInt2289);
		return;
	}
}
