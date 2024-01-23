import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!ob", name = "t", descriptor = "[I")
	public static int[] anIntArray269;

	@OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
	public static int anInt3587 = 0;

	@OriginalMember(owner = "client!ob", name = "s", descriptor = "I")
	public static int anInt3590 = 0;

	@OriginalMember(owner = "client!ob", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString127 = "Choose Option";

	@OriginalMember(owner = "client!ob", name = "w", descriptor = "Lclient!gd;")
	public static Class61 aClass61_31 = new Class61(64);

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)V")
	public static void method2795() {
		Static59.aClass61_9.method1378();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILclient!jd;I)V")
	public static void method2797(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub14 arg1) {
		@Pc(8) Object[] local8 = arg1.anObjectArray1;
		@Pc(14) int local14 = (Integer) local8[0];
		@Pc(18) Class8_Sub1_Sub20 local18 = Static243.method3654(local14);
		if (local18 == null) {
			return;
		}
		Static7.anInt63 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = -1;
		@Pc(32) byte local32 = -1;
		@Pc(35) int[] local35 = local18.anIntArray416;
		@Pc(38) int[] local38 = local18.anIntArray417;
		@Pc(52) int local52;
		try {
			@Pc(40) int local40 = 0;
			Static106.anIntArray157 = new int[local18.anInt5224];
			Static256.aStringArray71 = new String[local18.anInt5225];
			@Pc(50) int local50 = 0;
			@Pc(67) int local67;
			@Pc(174) String local174;
			for (local52 = 1; local52 < local8.length; local52++) {
				if (local8[local52] instanceof Integer) {
					local67 = (Integer) local8[local52];
					if (local67 == -2147483647) {
						local67 = arg1.anInt2432;
					}
					if (local67 == -2147483646) {
						local67 = arg1.anInt2439;
					}
					if (local67 == -2147483645) {
						local67 = arg1.aClass159_10 == null ? -1 : arg1.aClass159_10.anInt5199;
					}
					if (local67 == -2147483644) {
						local67 = arg1.anInt2440;
					}
					if (local67 == -2147483643) {
						local67 = arg1.aClass159_10 == null ? -1 : arg1.aClass159_10.anInt5133;
					}
					if (local67 == -2147483642) {
						local67 = arg1.aClass159_9 == null ? -1 : arg1.aClass159_9.anInt5199;
					}
					if (local67 == -2147483641) {
						local67 = arg1.aClass159_9 == null ? -1 : arg1.aClass159_9.anInt5133;
					}
					if (local67 == -2147483640) {
						local67 = arg1.anInt2428;
					}
					if (local67 == -2147483639) {
						local67 = arg1.anInt2438;
					}
					Static106.anIntArray157[local40++] = local67;
				} else if (local8[local52] instanceof String) {
					local174 = (String) local8[local52];
					if (local174.equals("event_opbase")) {
						local174 = arg1.aString93;
					}
					Static256.aStringArray71[local50++] = local174;
				}
			}
			local52 = 0;
			label4443: while (true) {
				local52++;
				if (local52 > arg0) {
					throw new RuntimeException("slow");
				}
				local30++;
				@Pc(209) int local209 = local35[local30];
				@Pc(798) int local798;
				@Pc(803) int local803;
				@Pc(644) int local644;
				@Pc(597) String local597;
				@Pc(638) int[] local638;
				if (local209 < 100) {
					if (local209 == 0) {
						Static114.anIntArray191[local28++] = local38[local30];
						continue;
					}
					if (local209 == 1) {
						local67 = local38[local30];
						Static114.anIntArray191[local28++] = Static8.anIntArray495[local67];
						continue;
					}
					if (local209 == 2) {
						local67 = local38[local30];
						local28--;
						Static90.method1462(local67, Static114.anIntArray191[local28]);
						continue;
					}
					if (local209 == 3) {
						Static286.aStringArray80[local26++] = local18.aStringArray75[local30];
						continue;
					}
					if (local209 == 6) {
						local30 += local38[local30];
						continue;
					}
					if (local209 == 7) {
						local28 -= 2;
						if (Static114.anIntArray191[local28] != Static114.anIntArray191[local28 + 1]) {
							local30 += local38[local30];
						}
						continue;
					}
					if (local209 == 8) {
						local28 -= 2;
						if (Static114.anIntArray191[local28] == Static114.anIntArray191[local28 + 1]) {
							local30 += local38[local30];
						}
						continue;
					}
					if (local209 == 9) {
						local28 -= 2;
						if (Static114.anIntArray191[local28 + 1] > Static114.anIntArray191[local28]) {
							local30 += local38[local30];
						}
						continue;
					}
					if (local209 == 10) {
						local28 -= 2;
						if (Static114.anIntArray191[local28 + 1] < Static114.anIntArray191[local28]) {
							local30 += local38[local30];
						}
						continue;
					}
					if (local209 == 21) {
						if (Static7.anInt63 == 0) {
							return;
						}
						@Pc(409) Class107 local409 = Static58.aClass107Array2[--Static7.anInt63];
						local18 = local409.aClass8_Sub1_Sub20_1;
						Static256.aStringArray71 = local409.aStringArray44;
						local38 = local18.anIntArray417;
						local35 = local18.anIntArray416;
						Static106.anIntArray157 = local409.anIntArray245;
						local30 = local409.anInt3127;
						continue;
					}
					if (local209 == 25) {
						local67 = local38[local30];
						Static114.anIntArray191[local28++] = Static112.method1837(local67);
						continue;
					}
					if (local209 == 27) {
						local67 = local38[local30];
						local28--;
						Static276.method4108(local67, Static114.anIntArray191[local28]);
						continue;
					}
					if (local209 == 31) {
						local28 -= 2;
						if (Static114.anIntArray191[local28 + 1] >= Static114.anIntArray191[local28]) {
							local30 += local38[local30];
						}
						continue;
					}
					if (local209 == 32) {
						local28 -= 2;
						if (Static114.anIntArray191[local28] >= Static114.anIntArray191[local28 + 1]) {
							local30 += local38[local30];
						}
						continue;
					}
					if (local209 == 33) {
						Static114.anIntArray191[local28++] = Static106.anIntArray157[local38[local30]];
						continue;
					}
					@Pc(540) int local540;
					if (local209 == 34) {
						local540 = local38[local30];
						local28--;
						Static106.anIntArray157[local540] = Static114.anIntArray191[local28];
						continue;
					}
					if (local209 == 35) {
						Static286.aStringArray80[local26++] = Static256.aStringArray71[local38[local30]];
						continue;
					}
					if (local209 == 36) {
						local540 = local38[local30];
						local26--;
						Static256.aStringArray71[local540] = Static286.aStringArray80[local26];
						continue;
					}
					if (local209 == 37) {
						local67 = local38[local30];
						local26 -= local67;
						local597 = Static161.method2569(Static286.aStringArray80, local26, local67);
						Static286.aStringArray80[local26++] = local597;
						continue;
					}
					if (local209 == 38) {
						local28--;
						continue;
					}
					if (local209 == 39) {
						local26--;
						continue;
					}
					if (local209 == 40) {
						local67 = local38[local30];
						@Pc(634) Class8_Sub1_Sub20 local634 = Static243.method3654(local67);
						local638 = new int[local634.anInt5224];
						@Pc(642) String[] local642 = new String[local634.anInt5225];
						for (local644 = 0; local644 < local634.anInt5227; local644++) {
							local638[local644] = Static114.anIntArray191[local28 + local644 - local634.anInt5227];
						}
						for (local644 = 0; local644 < local634.anInt5226; local644++) {
							local642[local644] = Static286.aStringArray80[local26 + local644 - local634.anInt5226];
						}
						local28 -= local634.anInt5227;
						local26 -= local634.anInt5226;
						@Pc(699) Class107 local699 = new Class107();
						local699.aStringArray44 = Static256.aStringArray71;
						local699.anInt3127 = local30;
						local699.anIntArray245 = Static106.anIntArray157;
						local699.aClass8_Sub1_Sub20_1 = local18;
						if (Static7.anInt63 >= Static58.aClass107Array2.length) {
							throw new RuntimeException();
						}
						Static58.aClass107Array2[Static7.anInt63++] = local699;
						local18 = local634;
						Static106.anIntArray157 = local638;
						local38 = local634.anIntArray417;
						local30 = -1;
						local35 = local634.anIntArray416;
						Static256.aStringArray71 = local642;
						continue;
					}
					if (local209 == 42) {
						Static114.anIntArray191[local28++] = Static199.anIntArray305[local38[local30]];
						continue;
					}
					if (local209 == 43) {
						local67 = local38[local30];
						local28--;
						Static199.anIntArray305[local67] = Static114.anIntArray191[local28];
						Static93.method1489(local67);
						continue;
					}
					if (local209 == 44) {
						local67 = local38[local30] >> 16;
						local798 = local38[local30] & 0xFFFF;
						local28--;
						local803 = Static114.anIntArray191[local28];
						if (local803 >= 0 && local803 <= 5000) {
							Static255.anIntArray393[local67] = local803;
							@Pc(822) byte local822 = -1;
							if (local798 == 105) {
								local822 = 0;
							}
							local644 = 0;
							while (true) {
								if (local803 <= local644) {
									continue label4443;
								}
								Static224.anIntArrayArray26[local67][local644] = local822;
								local644++;
							}
						}
						throw new RuntimeException();
					}
					if (local209 == 45) {
						local67 = local38[local30];
						local28--;
						local798 = Static114.anIntArray191[local28];
						if (local798 >= 0 && local798 < Static255.anIntArray393[local67]) {
							Static114.anIntArray191[local28++] = Static224.anIntArrayArray26[local67][local798];
							continue;
						}
						throw new RuntimeException();
					}
					if (local209 == 46) {
						local28 -= 2;
						local67 = local38[local30];
						local798 = Static114.anIntArray191[local28];
						if (local798 >= 0 && Static255.anIntArray393[local67] > local798) {
							Static224.anIntArrayArray26[local67][local798] = Static114.anIntArray191[local28 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local209 == 47) {
						local174 = Static270.aStringArray76[local38[local30]];
						if (local174 == null) {
							local174 = "null";
						}
						Static286.aStringArray80[local26++] = local174;
						continue;
					}
					if (local209 == 48) {
						local67 = local38[local30];
						local26--;
						Static270.aStringArray76[local67] = Static286.aStringArray80[local26];
						Static153.method2448(local67);
						continue;
					}
					if (local209 == 51) {
						@Pc(986) Class129 local986 = local18.aClass129Array1[local38[local30]];
						local28--;
						@Pc(996) Class8_Sub28 local996 = (Class8_Sub28) local986.method3043((long) Static114.anIntArray191[local28]);
						if (local996 != null) {
							local30 += local996.anInt4870;
						}
						continue;
					}
				}
				@Pc(1014) boolean local1014;
				if (local38[local30] == 1) {
					local1014 = true;
				} else {
					local1014 = false;
				}
				@Pc(1962) Class159 local1962;
				@Pc(1935) Class159 local1935;
				@Pc(3842) int local3842;
				@Pc(1051) Class159 local1051;
				@Pc(1106) int local1106;
				if (local209 >= 300) {
					@Pc(4428) boolean local4428;
					if (local209 < 500) {
						if (local209 == 403) {
							local28 -= 2;
							local798 = Static114.anIntArray191[local28];
							local803 = Static114.anIntArray191[local28 + 1];
							for (local1106 = 0; local1106 < Static33.anIntArray51.length; local1106++) {
								if (local798 == Static33.anIntArray51[local1106]) {
									Static21.aClass36_Sub3_Sub1_1.aClass11_2.method266(local803, local1106);
									continue label4443;
								}
							}
							local1106 = 0;
							while (true) {
								if (local1106 >= Static193.anIntArray287.length) {
									continue label4443;
								}
								if (local798 == Static193.anIntArray287[local1106]) {
									Static21.aClass36_Sub3_Sub1_1.aClass11_2.method266(local803, local1106);
									continue label4443;
								}
								local1106++;
							}
						}
						if (local209 == 404) {
							local28 -= 2;
							local798 = Static114.anIntArray191[local28];
							local803 = Static114.anIntArray191[local28 + 1];
							Static21.aClass36_Sub3_Sub1_1.aClass11_2.method263(local798, local803);
							continue;
						}
						if (local209 == 410) {
							local28--;
							local4428 = Static114.anIntArray191[local28] != 0;
							Static21.aClass36_Sub3_Sub1_1.aClass11_2.method262(local4428);
							continue;
						}
					} else {
						@Pc(1247) boolean local1247;
						if (local209 >= 1000 && local209 < 1100 || local209 >= 2000 && local209 < 2100) {
							if (local209 < 2000) {
								local1051 = local1014 ? Static246.aClass159_17 : Static60.aClass159_5;
							} else {
								local209 -= 1000;
								local28--;
								local1051 = Static82.method1361(Static114.anIntArray191[local28]);
							}
							if (local209 == 1000) {
								local28 -= 4;
								local1051.anInt5158 = Static114.anIntArray191[local28];
								local1051.anInt5172 = Static114.anIntArray191[local28 + 1];
								local803 = Static114.anIntArray191[local28 + 2];
								if (local803 < 0) {
									local803 = 0;
								} else if (local803 > 5) {
									local803 = 5;
								}
								local1106 = Static114.anIntArray191[local28 + 3];
								local1051.aByte17 = (byte) local803;
								if (local1106 < 0) {
									local1106 = 0;
								} else if (local1106 > 5) {
									local1106 = 5;
								}
								local1051.aByte19 = (byte) local1106;
								Static128.method2075(local1051);
								Static227.method3513(local1051);
								if (local1051.anInt5133 == -1) {
									Static141.method2239(local1051.anInt5199);
								}
								continue;
							}
							if (local209 == 1001) {
								local28 -= 4;
								local1051.anInt5145 = Static114.anIntArray191[local28];
								local1051.anInt5156 = Static114.anIntArray191[local28 + 1];
								local1051.anInt5195 = 0;
								local1051.anInt5201 = 0;
								local1106 = Static114.anIntArray191[local28 + 3];
								local803 = Static114.anIntArray191[local28 + 2];
								if (local803 < 0) {
									local803 = 0;
								} else if (local803 > 4) {
									local803 = 4;
								}
								local1051.aByte18 = (byte) local803;
								if (local1106 < 0) {
									local1106 = 0;
								} else if (local1106 > 4) {
									local1106 = 4;
								}
								local1051.aByte16 = (byte) local1106;
								Static128.method2075(local1051);
								Static227.method3513(local1051);
								if (local1051.anInt5197 == 0) {
									Static191.method2995(false, local1051);
								}
								continue;
							}
							if (local209 == 1003) {
								local28--;
								local1247 = Static114.anIntArray191[local28] == 1;
								if (local1051.aBoolean424 != local1247) {
									local1051.aBoolean424 = local1247;
									Static128.method2075(local1051);
								}
								if (local1051.anInt5133 == -1) {
									Static10.method100(local1051.anInt5199);
								}
								continue;
							}
							if (local209 == 1004) {
								local28 -= 2;
								local1051.anInt5174 = Static114.anIntArray191[local28];
								local1051.anInt5161 = Static114.anIntArray191[local28 + 1];
								Static128.method2075(local1051);
								Static227.method3513(local1051);
								if (local1051.anInt5197 == 0) {
									Static191.method2995(false, local1051);
								}
								continue;
							}
							if (local209 == 1005) {
								local28--;
								local1051.aBoolean425 = Static114.anIntArray191[local28] == 1;
								continue;
							}
						} else {
							@Pc(1905) String local1905;
							if (local209 >= 1100 && local209 < 1200 || local209 >= 2100 && local209 < 2200) {
								if (local209 < 2000) {
									local1051 = local1014 ? Static246.aClass159_17 : Static60.aClass159_5;
								} else {
									local209 -= 1000;
									local28--;
									local1051 = Static82.method1361(Static114.anIntArray191[local28]);
								}
								if (local209 == 1100) {
									local28 -= 2;
									local1051.anInt5128 = Static114.anIntArray191[local28];
									if (local1051.anInt5162 - local1051.anInt5123 < local1051.anInt5128) {
										local1051.anInt5128 = local1051.anInt5162 - local1051.anInt5123;
									}
									if (local1051.anInt5128 < 0) {
										local1051.anInt5128 = 0;
									}
									local1051.anInt5176 = Static114.anIntArray191[local28 + 1];
									if (local1051.anInt5176 > local1051.anInt5207 - local1051.anInt5121) {
										local1051.anInt5176 = local1051.anInt5207 - local1051.anInt5121;
									}
									if (local1051.anInt5176 < 0) {
										local1051.anInt5176 = 0;
									}
									Static128.method2075(local1051);
									if (local1051.anInt5133 == -1) {
										Static19.method346(local1051.anInt5199);
									}
									continue;
								}
								if (local209 == 1101) {
									local28--;
									local1051.anInt5193 = Static114.anIntArray191[local28];
									Static128.method2075(local1051);
									if (local1051.anInt5133 == -1) {
										Static218.method3411(local1051.anInt5199);
									}
									continue;
								}
								if (local209 == 1102) {
									local28--;
									local1051.aBoolean420 = Static114.anIntArray191[local28] == 1;
									Static128.method2075(local1051);
									continue;
								}
								if (local209 == 1103) {
									local28--;
									local1051.anInt5178 = Static114.anIntArray191[local28];
									Static128.method2075(local1051);
									continue;
								}
								if (local209 == 1104) {
									local28--;
									local1051.anInt5203 = Static114.anIntArray191[local28];
									Static128.method2075(local1051);
									continue;
								}
								if (local209 == 1105) {
									local28--;
									local1051.anInt5144 = Static114.anIntArray191[local28];
									Static128.method2075(local1051);
									continue;
								}
								if (local209 == 1106) {
									local28--;
									local1051.anInt5117 = Static114.anIntArray191[local28];
									Static128.method2075(local1051);
									continue;
								}
								if (local209 == 1107) {
									local28--;
									local1051.aBoolean427 = Static114.anIntArray191[local28] == 1;
									Static128.method2075(local1051);
									continue;
								}
								if (local209 == 1108) {
									local1051.anInt5151 = 1;
									local28--;
									local1051.anInt5153 = Static114.anIntArray191[local28];
									Static128.method2075(local1051);
									if (local1051.anInt5133 == -1) {
										Static294.method4287(local1051.anInt5199);
									}
									continue;
								}
								if (local209 == 1109) {
									local28 -= 6;
									local1051.anInt5184 = Static114.anIntArray191[local28];
									local1051.anInt5134 = Static114.anIntArray191[local28 + 1];
									local1051.anInt5163 = Static114.anIntArray191[local28 + 2];
									local1051.anInt5138 = Static114.anIntArray191[local28 + 3];
									local1051.anInt5120 = Static114.anIntArray191[local28 + 4];
									local1051.anInt5209 = Static114.anIntArray191[local28 + 5];
									Static128.method2075(local1051);
									if (local1051.anInt5133 == -1) {
										Static147.method2393(local1051.anInt5199);
										Static254.method3802(local1051.anInt5199);
									}
									continue;
								}
								if (local209 == 1110) {
									local28--;
									local803 = Static114.anIntArray191[local28];
									if (local803 != local1051.anInt5141) {
										local1051.anInt5175 = 0;
										local1051.anInt5137 = 1;
										local1051.anInt5194 = 0;
										local1051.anInt5141 = local803;
										Static128.method2075(local1051);
									}
									if (local1051.anInt5133 == -1) {
										Static24.method430(local1051.anInt5199);
									}
									continue;
								}
								if (local209 == 1111) {
									local28--;
									local1051.aBoolean414 = Static114.anIntArray191[local28] == 1;
									Static128.method2075(local1051);
									continue;
								}
								if (local209 == 1112) {
									local26--;
									local1905 = Static286.aStringArray80[local26];
									if (!local1905.equals(local1051.aString177)) {
										local1051.aString177 = local1905;
										Static128.method2075(local1051);
									}
									if (local1051.anInt5133 == -1) {
										Static37.method3006(local1051.anInt5199);
									}
									continue;
								}
								if (local209 == 1113) {
									local28--;
									local1051.anInt5169 = Static114.anIntArray191[local28];
									Static128.method2075(local1051);
									continue;
								}
								if (local209 == 1114) {
									local28 -= 3;
									local1051.anInt5112 = Static114.anIntArray191[local28];
									local1051.anInt5127 = Static114.anIntArray191[local28 + 1];
									local1051.anInt5167 = Static114.anIntArray191[local28 + 2];
									Static128.method2075(local1051);
									continue;
								}
								if (local209 == 1115) {
									local28--;
									local1051.aBoolean430 = Static114.anIntArray191[local28] == 1;
									Static128.method2075(local1051);
									continue;
								}
								if (local209 == 1116) {
									local28--;
									local1051.anInt5200 = Static114.anIntArray191[local28];
									Static128.method2075(local1051);
									continue;
								}
								if (local209 == 1117) {
									local28--;
									local1051.anInt5114 = Static114.anIntArray191[local28];
									Static128.method2075(local1051);
									continue;
								}
								if (local209 == 1118) {
									local28--;
									local1051.aBoolean413 = Static114.anIntArray191[local28] == 1;
									Static128.method2075(local1051);
									continue;
								}
								if (local209 == 1119) {
									local28--;
									local1051.aBoolean428 = Static114.anIntArray191[local28] == 1;
									Static128.method2075(local1051);
									continue;
								}
								if (local209 == 1120) {
									local28 -= 2;
									local1051.anInt5162 = Static114.anIntArray191[local28];
									local1051.anInt5207 = Static114.anIntArray191[local28 + 1];
									Static128.method2075(local1051);
									if (local1051.anInt5197 == 0) {
										Static191.method2995(false, local1051);
									}
									continue;
								}
								if (local209 == 1121) {
									local28 -= 2;
									local1051.aShort20 = (short) Static114.anIntArray191[local28];
									local1051.aShort21 = (short) Static114.anIntArray191[local28 + 1];
									Static128.method2075(local1051);
									continue;
								}
								if (local209 == 1122) {
									local28--;
									local1051.aBoolean416 = Static114.anIntArray191[local28] == 1;
									Static128.method2075(local1051);
									continue;
								}
								if (local209 == 1123) {
									local28--;
									local1051.anInt5209 = Static114.anIntArray191[local28];
									Static128.method2075(local1051);
									if (local1051.anInt5133 == -1) {
										Static147.method2393(local1051.anInt5199);
									}
									continue;
								}
								if (local209 == 1124) {
									local28--;
									local803 = Static114.anIntArray191[local28];
									local1051.aBoolean422 = local803 == 1;
									Static128.method2075(local1051);
									continue;
								}
							} else if (local209 >= 1200 && local209 < 1300 || local209 >= 2200 && local209 < 2300) {
								if (local209 < 2000) {
									local1051 = local1014 ? Static246.aClass159_17 : Static60.aClass159_5;
								} else {
									local209 -= 1000;
									local28--;
									local1051 = Static82.method1361(Static114.anIntArray191[local28]);
								}
								Static128.method2075(local1051);
								if (local209 == 1200 || local209 == 1205 || local209 == 1208 || local209 == 1209) {
									local28 -= 2;
									local803 = Static114.anIntArray191[local28];
									local1106 = Static114.anIntArray191[local28 + 1];
									if (local1051.anInt5133 == -1) {
										Static25.method435(local1051.anInt5199);
										Static147.method2393(local1051.anInt5199);
										Static254.method3802(local1051.anInt5199);
									}
									if (local803 == -1) {
										local1051.anInt5153 = -1;
										local1051.anInt5151 = 1;
										local1051.anInt5125 = -1;
										continue;
									}
									if (local209 == 1208 || local209 == 1209) {
										local1051.aBoolean415 = true;
									} else {
										local1051.aBoolean415 = false;
									}
									local1051.anInt5160 = local1106;
									local1051.anInt5125 = local803;
									@Pc(13508) Class10 local13508 = Static140.method2222(local803);
									local1051.anInt5138 = local13508.anInt124;
									local1051.anInt5120 = local13508.anInt126;
									local1051.anInt5134 = local13508.anInt97;
									local1051.anInt5209 = local13508.anInt152;
									local1051.anInt5184 = local13508.anInt153;
									if (local1051.anInt5201 > 0) {
										local1051.anInt5209 = local1051.anInt5209 * 32 / local1051.anInt5201;
									} else if (local1051.anInt5145 > 0) {
										local1051.anInt5209 = local1051.anInt5209 * 32 / local1051.anInt5145;
									}
									if (local209 == 1205) {
										local1051.aBoolean421 = false;
									} else {
										local1051.aBoolean421 = true;
									}
									local1051.anInt5163 = local13508.anInt119;
									continue;
								}
								if (local209 == 1201) {
									local1051.anInt5151 = 2;
									local28--;
									local1051.anInt5153 = Static114.anIntArray191[local28];
									if (local1051.anInt5133 == -1) {
										Static294.method4287(local1051.anInt5199);
									}
									continue;
								}
								if (local209 == 1202) {
									local1051.anInt5151 = 3;
									local1051.anInt5153 = Static21.aClass36_Sub3_Sub1_1.aClass11_2.method264();
									if (local1051.anInt5133 == -1) {
										Static294.method4287(local1051.anInt5199);
									}
									continue;
								}
								if (local209 == 1203) {
									local1051.anInt5151 = 6;
									local28--;
									local1051.anInt5153 = Static114.anIntArray191[local28];
									if (local1051.anInt5133 == -1) {
										Static294.method4287(local1051.anInt5199);
									}
									continue;
								}
								if (local209 == 1204) {
									local1051.anInt5151 = 5;
									local28--;
									local1051.anInt5153 = Static114.anIntArray191[local28];
									if (local1051.anInt5133 == -1) {
										Static294.method4287(local1051.anInt5199);
									}
									continue;
								}
								if (local209 == 1206) {
									local28 -= 4;
									local1051.anInt5119 = Static114.anIntArray191[local28];
									local1051.anInt5118 = Static114.anIntArray191[local28 + 1];
									local1051.anInt5113 = Static114.anIntArray191[local28 + 2];
									local1051.anInt5190 = Static114.anIntArray191[local28 + 3];
									Static128.method2075(local1051);
									continue;
								}
								if (local209 == 1207) {
									local28 -= 2;
									local1051.anInt5170 = Static114.anIntArray191[local28];
									local1051.anInt5154 = Static114.anIntArray191[local28 + 1];
									Static128.method2075(local1051);
									continue;
								}
							} else if (local209 >= 1300 && local209 < 1400 || local209 >= 2300 && local209 < 2400) {
								if (local209 < 2000) {
									local1051 = local1014 ? Static246.aClass159_17 : Static60.aClass159_5;
								} else {
									local209 -= 1000;
									local28--;
									local1051 = Static82.method1361(Static114.anIntArray191[local28]);
								}
								if (local209 == 1300) {
									local28--;
									local803 = Static114.anIntArray191[local28] - 1;
									if (local803 >= 0 && local803 <= 9) {
										local26--;
										local1051.method3876(Static286.aStringArray80[local26], local803);
										continue;
									}
									local26--;
									continue;
								}
								if (local209 == 1301) {
									local28 -= 2;
									local803 = Static114.anIntArray191[local28];
									local1106 = Static114.anIntArray191[local28 + 1];
									local1051.aClass159_18 = Static260.method3916(local1106, local803);
									continue;
								}
								if (local209 == 1302) {
									local28--;
									local1051.aBoolean417 = Static114.anIntArray191[local28] == 1;
									continue;
								}
								if (local209 == 1303) {
									local28--;
									local1051.anInt5186 = Static114.anIntArray191[local28];
									continue;
								}
								if (local209 == 1304) {
									local28--;
									local1051.anInt5142 = Static114.anIntArray191[local28];
									continue;
								}
								if (local209 == 1305) {
									local26--;
									local1051.aString178 = Static286.aStringArray80[local26];
									continue;
								}
								if (local209 == 1306) {
									local26--;
									local1051.aString182 = Static286.aStringArray80[local26];
									continue;
								}
								if (local209 == 1307) {
									local1051.aStringArray73 = null;
									continue;
								}
								if (local209 == 1308) {
									local28--;
									local1051.anInt5148 = Static114.anIntArray191[local28];
									local28--;
									local1051.anInt5150 = Static114.anIntArray191[local28];
									continue;
								}
								if (local209 == 1309) {
									local28--;
									local803 = Static114.anIntArray191[local28];
									local28--;
									local1106 = Static114.anIntArray191[local28];
									if (local1106 >= 1 && local1106 <= 10) {
										local1051.method3888(local803, local1106 - 1);
									}
									continue;
								}
								if (local209 == 1310) {
									local26--;
									local1051.aString184 = Static286.aStringArray80[local26];
									continue;
								}
							} else {
								@Pc(3297) int local3297;
								@Pc(5076) int[] local5076;
								if (local209 >= 1400 && local209 < 1500 || local209 >= 2400 && local209 < 2500) {
									if (local209 < 2000) {
										local1051 = local1014 ? Static246.aClass159_17 : Static60.aClass159_5;
									} else {
										local209 -= 1000;
										local28--;
										local1051 = Static82.method1361(Static114.anIntArray191[local28]);
									}
									local26--;
									local1905 = Static286.aStringArray80[local26];
									local5076 = null;
									if (local1905.length() > 0 && local1905.charAt(local1905.length() - 1) == 'Y') {
										local28--;
										local644 = Static114.anIntArray191[local28];
										if (local644 > 0) {
											local5076 = new int[local644];
											while (local644-- > 0) {
												local28--;
												local5076[local644] = Static114.anIntArray191[local28];
											}
										}
										local1905 = local1905.substring(0, local1905.length() - 1);
									}
									@Pc(12841) Object[] local12841 = new Object[local1905.length() + 1];
									for (local3297 = local12841.length - 1; local3297 >= 1; local3297--) {
										if (local1905.charAt(local3297 - 1) == 's') {
											local26--;
											local12841[local3297] = Static286.aStringArray80[local26];
										} else {
											local28--;
											local12841[local3297] = Integer.valueOf(Static114.anIntArray191[local28]);
										}
									}
									local28--;
									local3297 = Static114.anIntArray191[local28];
									if (local3297 == -1) {
										local12841 = null;
									} else {
										local12841[0] = Integer.valueOf(local3297);
									}
									local1051.aBoolean419 = true;
									if (local209 == 1400) {
										local1051.anObjectArray29 = local12841;
									} else if (local209 == 1401) {
										local1051.anObjectArray7 = local12841;
									} else if (local209 == 1402) {
										local1051.anObjectArray25 = local12841;
									} else if (local209 == 1403) {
										local1051.anObjectArray14 = local12841;
									} else if (local209 == 1404) {
										local1051.anObjectArray5 = local12841;
									} else if (local209 == 1405) {
										local1051.anObjectArray17 = local12841;
									} else if (local209 == 1406) {
										local1051.anObjectArray20 = local12841;
									} else if (local209 == 1407) {
										local1051.anObjectArray3 = local12841;
										local1051.anIntArray407 = local5076;
									} else if (local209 == 1408) {
										local1051.anObjectArray6 = local12841;
									} else if (local209 == 1409) {
										local1051.anObjectArray23 = local12841;
									} else if (local209 == 1410) {
										local1051.anObjectArray28 = local12841;
									} else if (local209 == 1411) {
										local1051.anObjectArray32 = local12841;
									} else if (local209 == 1412) {
										local1051.anObjectArray18 = local12841;
									} else if (local209 == 1414) {
										local1051.anObjectArray15 = local12841;
										local1051.anIntArray405 = local5076;
									} else if (local209 == 1415) {
										local1051.anObjectArray12 = local12841;
										local1051.anIntArray401 = local5076;
									} else if (local209 == 1416) {
										local1051.anObjectArray9 = local12841;
									} else if (local209 == 1417) {
										local1051.anObjectArray31 = local12841;
									} else if (local209 == 1418) {
										local1051.anObjectArray27 = local12841;
									} else if (local209 == 1419) {
										local1051.anObjectArray16 = local12841;
									} else if (local209 == 1420) {
										local1051.anObjectArray22 = local12841;
									} else if (local209 == 1421) {
										local1051.anObjectArray11 = local12841;
									} else if (local209 == 1422) {
										local1051.anObjectArray13 = local12841;
									} else if (local209 == 1423) {
										local1051.anObjectArray4 = local12841;
									} else if (local209 == 1424) {
										local1051.anObjectArray19 = local12841;
									} else if (local209 == 1425) {
										local1051.anObjectArray24 = local12841;
									} else if (local209 == 1426) {
										local1051.anObjectArray10 = local12841;
									} else if (local209 == 1427) {
										local1051.anObjectArray21 = local12841;
									} else if (local209 == 1428) {
										local1051.anObjectArray30 = local12841;
										local1051.anIntArray397 = local5076;
									} else if (local209 == 1429) {
										local1051.anObjectArray8 = local12841;
										local1051.anIntArray403 = local5076;
									}
									continue;
								}
								if (local209 < 1600) {
									local1051 = local1014 ? Static246.aClass159_17 : Static60.aClass159_5;
									if (local209 == 1500) {
										Static114.anIntArray191[local28++] = local1051.anInt5208;
										continue;
									}
									if (local209 == 1501) {
										Static114.anIntArray191[local28++] = local1051.anInt5198;
										continue;
									}
									if (local209 == 1502) {
										Static114.anIntArray191[local28++] = local1051.anInt5123;
										continue;
									}
									if (local209 == 1503) {
										Static114.anIntArray191[local28++] = local1051.anInt5121;
										continue;
									}
									if (local209 == 1504) {
										Static114.anIntArray191[local28++] = local1051.aBoolean424 ? 1 : 0;
										continue;
									}
									if (local209 == 1505) {
										Static114.anIntArray191[local28++] = local1051.anInt5116;
										continue;
									}
								} else if (local209 < 1700) {
									local1051 = local1014 ? Static246.aClass159_17 : Static60.aClass159_5;
									if (local209 == 1600) {
										Static114.anIntArray191[local28++] = local1051.anInt5128;
										continue;
									}
									if (local209 == 1601) {
										Static114.anIntArray191[local28++] = local1051.anInt5176;
										continue;
									}
									if (local209 == 1602) {
										Static286.aStringArray80[local26++] = local1051.aString177;
										continue;
									}
									if (local209 == 1603) {
										Static114.anIntArray191[local28++] = local1051.anInt5162;
										continue;
									}
									if (local209 == 1604) {
										Static114.anIntArray191[local28++] = local1051.anInt5207;
										continue;
									}
									if (local209 == 1605) {
										Static114.anIntArray191[local28++] = local1051.anInt5209;
										continue;
									}
									if (local209 == 1606) {
										Static114.anIntArray191[local28++] = local1051.anInt5163;
										continue;
									}
									if (local209 == 1607) {
										Static114.anIntArray191[local28++] = local1051.anInt5120;
										continue;
									}
									if (local209 == 1608) {
										Static114.anIntArray191[local28++] = local1051.anInt5138;
										continue;
									}
									if (local209 == 1609) {
										Static114.anIntArray191[local28++] = local1051.anInt5178;
										continue;
									}
									if (local209 == 1610) {
										Static114.anIntArray191[local28++] = local1051.anInt5184;
										continue;
									}
									if (local209 == 1611) {
										Static114.anIntArray191[local28++] = local1051.anInt5134;
										continue;
									}
									if (local209 == 1612) {
										Static114.anIntArray191[local28++] = local1051.anInt5144;
										continue;
									}
								} else if (local209 < 1800) {
									local1051 = local1014 ? Static246.aClass159_17 : Static60.aClass159_5;
									if (local209 == 1700) {
										Static114.anIntArray191[local28++] = local1051.anInt5125;
										continue;
									}
									if (local209 == 1701) {
										if (local1051.anInt5125 == -1) {
											Static114.anIntArray191[local28++] = 0;
										} else {
											Static114.anIntArray191[local28++] = local1051.anInt5160;
										}
										continue;
									}
									if (local209 == 1702) {
										Static114.anIntArray191[local28++] = local1051.anInt5133;
										continue;
									}
								} else if (local209 < 1900) {
									local1051 = local1014 ? Static246.aClass159_17 : Static60.aClass159_5;
									if (local209 == 1800) {
										Static114.anIntArray191[local28++] = Static42.method668(local1051).method3350();
										continue;
									}
									if (local209 == 1801) {
										local28--;
										local803 = Static114.anIntArray191[local28];
										local803--;
										if (local1051.aStringArray73 != null && local1051.aStringArray73.length > local803 && local1051.aStringArray73[local803] != null) {
											Static286.aStringArray80[local26++] = local1051.aStringArray73[local803];
											continue;
										}
										Static286.aStringArray80[local26++] = "";
										continue;
									}
									if (local209 == 1802) {
										if (local1051.aString178 == null) {
											Static286.aStringArray80[local26++] = "";
										} else {
											Static286.aStringArray80[local26++] = local1051.aString178;
										}
										continue;
									}
								} else if (local209 < 2600) {
									local28--;
									local1051 = Static82.method1361(Static114.anIntArray191[local28]);
									if (local209 == 2500) {
										Static114.anIntArray191[local28++] = local1051.anInt5208;
										continue;
									}
									if (local209 == 2501) {
										Static114.anIntArray191[local28++] = local1051.anInt5198;
										continue;
									}
									if (local209 == 2502) {
										Static114.anIntArray191[local28++] = local1051.anInt5123;
										continue;
									}
									if (local209 == 2503) {
										Static114.anIntArray191[local28++] = local1051.anInt5121;
										continue;
									}
									if (local209 == 2504) {
										Static114.anIntArray191[local28++] = local1051.aBoolean424 ? 1 : 0;
										continue;
									}
									if (local209 == 2505) {
										Static114.anIntArray191[local28++] = local1051.anInt5116;
										continue;
									}
								} else if (local209 < 2700) {
									local28--;
									local1051 = Static82.method1361(Static114.anIntArray191[local28]);
									if (local209 == 2600) {
										Static114.anIntArray191[local28++] = local1051.anInt5128;
										continue;
									}
									if (local209 == 2601) {
										Static114.anIntArray191[local28++] = local1051.anInt5176;
										continue;
									}
									if (local209 == 2602) {
										Static286.aStringArray80[local26++] = local1051.aString177;
										continue;
									}
									if (local209 == 2603) {
										Static114.anIntArray191[local28++] = local1051.anInt5162;
										continue;
									}
									if (local209 == 2604) {
										Static114.anIntArray191[local28++] = local1051.anInt5207;
										continue;
									}
									if (local209 == 2605) {
										Static114.anIntArray191[local28++] = local1051.anInt5209;
										continue;
									}
									if (local209 == 2606) {
										Static114.anIntArray191[local28++] = local1051.anInt5163;
										continue;
									}
									if (local209 == 2607) {
										Static114.anIntArray191[local28++] = local1051.anInt5120;
										continue;
									}
									if (local209 == 2608) {
										Static114.anIntArray191[local28++] = local1051.anInt5138;
										continue;
									}
									if (local209 == 2609) {
										Static114.anIntArray191[local28++] = local1051.anInt5178;
										continue;
									}
									if (local209 == 2610) {
										Static114.anIntArray191[local28++] = local1051.anInt5184;
										continue;
									}
									if (local209 == 2611) {
										Static114.anIntArray191[local28++] = local1051.anInt5134;
										continue;
									}
									if (local209 == 2612) {
										Static114.anIntArray191[local28++] = local1051.anInt5144;
										continue;
									}
								} else if (local209 < 2800) {
									if (local209 == 2700) {
										local28--;
										local1051 = Static82.method1361(Static114.anIntArray191[local28]);
										Static114.anIntArray191[local28++] = local1051.anInt5125;
										continue;
									}
									if (local209 == 2701) {
										local28--;
										local1051 = Static82.method1361(Static114.anIntArray191[local28]);
										if (local1051.anInt5125 == -1) {
											Static114.anIntArray191[local28++] = 0;
										} else {
											Static114.anIntArray191[local28++] = local1051.anInt5160;
										}
										continue;
									}
									if (local209 == 2702) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										@Pc(1634) Class8_Sub32 local1634 = (Class8_Sub32) Static213.aClass129_22.method3043((long) local798);
										if (local1634 == null) {
											Static114.anIntArray191[local28++] = 0;
										} else {
											Static114.anIntArray191[local28++] = 1;
										}
										continue;
									}
									if (local209 == 2703) {
										local28--;
										local1051 = Static82.method1361(Static114.anIntArray191[local28]);
										if (local1051.aClass159Array1 == null) {
											Static114.anIntArray191[local28++] = 0;
											continue;
										}
										local803 = local1051.aClass159Array1.length;
										for (local1106 = 0; local1106 < local1051.aClass159Array1.length; local1106++) {
											if (local1051.aClass159Array1[local1106] == null) {
												local803 = local1106;
												break;
											}
										}
										Static114.anIntArray191[local28++] = local803;
										continue;
									}
									if (local209 == 2704 || local209 == 2705) {
										local28 -= 2;
										local803 = Static114.anIntArray191[local28 + 1];
										local798 = Static114.anIntArray191[local28];
										@Pc(1726) Class8_Sub32 local1726 = (Class8_Sub32) Static213.aClass129_22.method3043((long) local798);
										if (local1726 != null && local803 == local1726.anInt5295) {
											Static114.anIntArray191[local28++] = 1;
										} else {
											Static114.anIntArray191[local28++] = 0;
										}
										continue;
									}
								} else if (local209 < 2900) {
									local28--;
									local1051 = Static82.method1361(Static114.anIntArray191[local28]);
									if (local209 == 2800) {
										Static114.anIntArray191[local28++] = Static42.method668(local1051).method3350();
										continue;
									}
									if (local209 == 2801) {
										local28--;
										local803 = Static114.anIntArray191[local28];
										local803--;
										if (local1051.aStringArray73 != null && local803 < local1051.aStringArray73.length && local1051.aStringArray73[local803] != null) {
											Static286.aStringArray80[local26++] = local1051.aStringArray73[local803];
											continue;
										}
										Static286.aStringArray80[local26++] = "";
										continue;
									}
									if (local209 == 2802) {
										if (local1051.aString178 == null) {
											Static286.aStringArray80[local26++] = "";
										} else {
											Static286.aStringArray80[local26++] = local1051.aString178;
										}
										continue;
									}
								} else if (local209 < 3200) {
									if (local209 == 3100) {
										local26--;
										local597 = Static286.aStringArray80[local26];
										Static47.method746(0, local597, "");
										continue;
									}
									if (local209 == 3101) {
										local28 -= 2;
										Static197.method3042(Static21.aClass36_Sub3_Sub1_1, Static114.anIntArray191[local28 + 1], Static114.anIntArray191[local28]);
										continue;
									}
									if (local209 == 3103) {
										Static201.method3118();
										continue;
									}
									if (local209 == 3104) {
										local803 = 0;
										local26--;
										local597 = Static286.aStringArray80[local26];
										if (Static3.method3665(local597)) {
											local803 = Static167.method2646(local597);
										}
										Static66.aClass8_Sub2_Sub1_4.method2398(75);
										Static66.aClass8_Sub2_Sub1_4.method2330(local803);
										continue;
									}
									if (local209 == 3105) {
										local26--;
										local597 = Static286.aStringArray80[local26];
										Static66.aClass8_Sub2_Sub1_4.method2398(112);
										Static66.aClass8_Sub2_Sub1_4.method2378(Static31.method513(local597));
										continue;
									}
									if (local209 == 3106) {
										local26--;
										local597 = Static286.aStringArray80[local26];
										Static66.aClass8_Sub2_Sub1_4.method2398(1);
										Static66.aClass8_Sub2_Sub1_4.method2340(local597.length() + 1);
										Static66.aClass8_Sub2_Sub1_4.method2331(local597);
										continue;
									}
									if (local209 == 3107) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										local26--;
										local1905 = Static286.aStringArray80[local26];
										Static33.method528(local798, local1905);
										continue;
									}
									if (local209 == 3108) {
										local28 -= 3;
										local803 = Static114.anIntArray191[local28 + 1];
										local798 = Static114.anIntArray191[local28];
										local1106 = Static114.anIntArray191[local28 + 2];
										local1935 = Static82.method1361(local1106);
										Static269.method3755(local798, local1935, local803);
										continue;
									}
									if (local209 == 3109) {
										local28 -= 2;
										local803 = Static114.anIntArray191[local28 + 1];
										local798 = Static114.anIntArray191[local28];
										local1962 = local1014 ? Static246.aClass159_17 : Static60.aClass159_5;
										Static269.method3755(local798, local1962, local803);
										continue;
									}
									if (local209 == 3110) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										Static66.aClass8_Sub2_Sub1_4.method2398(28);
										Static66.aClass8_Sub2_Sub1_4.method2333(local798);
										continue;
									}
								} else if (local209 < 3300) {
									if (local209 == 3200) {
										local28 -= 3;
										Static140.method2221(Static114.anIntArray191[local28 + 1], Static114.anIntArray191[local28 + 2], 255, Static114.anIntArray191[local28]);
										continue;
									}
									if (local209 == 3201) {
										local28--;
										Static135.method2192(255, Static114.anIntArray191[local28]);
										continue;
									}
									if (local209 == 3202) {
										local28 -= 2;
										Static204.method3181(Static114.anIntArray191[local28 + 1], Static114.anIntArray191[local28], 255);
										continue;
									}
								} else if (local209 < 3400) {
									if (local209 == 3300) {
										Static114.anIntArray191[local28++] = anInt3590;
										continue;
									}
									if (local209 == 3301) {
										local28 -= 2;
										local798 = Static114.anIntArray191[local28];
										local803 = Static114.anIntArray191[local28 + 1];
										Static114.anIntArray191[local28++] = Static215.method3371(local803, local798);
										continue;
									}
									if (local209 == 3302) {
										local28 -= 2;
										local798 = Static114.anIntArray191[local28];
										local803 = Static114.anIntArray191[local28 + 1];
										Static114.anIntArray191[local28++] = method2798(local798, local803);
										continue;
									}
									if (local209 == 3303) {
										local28 -= 2;
										local798 = Static114.anIntArray191[local28];
										local803 = Static114.anIntArray191[local28 + 1];
										Static114.anIntArray191[local28++] = Static31.method514(local798, local803);
										continue;
									}
									if (local209 == 3304) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										Static114.anIntArray191[local28++] = Static49.method775(local798).anInt4501;
										continue;
									}
									if (local209 == 3305) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										Static114.anIntArray191[local28++] = Static77.anIntArray112[local798];
										continue;
									}
									if (local209 == 3306) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										Static114.anIntArray191[local28++] = Static64.anIntArray98[local798];
										continue;
									}
									if (local209 == 3307) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										Static114.anIntArray191[local28++] = Static125.anIntArray198[local798];
										continue;
									}
									if (local209 == 3308) {
										local798 = Static34.anInt770;
										local1106 = Static130.anInt2601 + (Static21.aClass36_Sub3_Sub1_1.anInt4118 >> 7);
										local803 = Static49.anInt1089 + (Static21.aClass36_Sub3_Sub1_1.anInt4117 >> 7);
										Static114.anIntArray191[local28++] = local1106 + (local803 << 14) + (local798 << 28);
										continue;
									}
									if (local209 == 3309) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										Static114.anIntArray191[local28++] = local798 >> 14 & 0x3FFF;
										continue;
									}
									if (local209 == 3310) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										Static114.anIntArray191[local28++] = local798 >> 28;
										continue;
									}
									if (local209 == 3311) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										Static114.anIntArray191[local28++] = local798 & 0x3FFF;
										continue;
									}
									if (local209 == 3312) {
										Static114.anIntArray191[local28++] = Static65.aBoolean466 ? 1 : 0;
										continue;
									}
									if (local209 == 3313) {
										local28 -= 2;
										local798 = Static114.anIntArray191[local28] + 32768;
										local803 = Static114.anIntArray191[local28 + 1];
										Static114.anIntArray191[local28++] = Static215.method3371(local803, local798);
										continue;
									}
									if (local209 == 3314) {
										local28 -= 2;
										local798 = Static114.anIntArray191[local28] + 32768;
										local803 = Static114.anIntArray191[local28 + 1];
										Static114.anIntArray191[local28++] = method2798(local798, local803);
										continue;
									}
									if (local209 == 3315) {
										local28 -= 2;
										local798 = Static114.anIntArray191[local28] + 32768;
										local803 = Static114.anIntArray191[local28 + 1];
										Static114.anIntArray191[local28++] = Static31.method514(local798, local803);
										continue;
									}
									if (local209 == 3316) {
										if (Static94.anInt1962 < 2) {
											Static114.anIntArray191[local28++] = 0;
										} else {
											Static114.anIntArray191[local28++] = Static94.anInt1962;
										}
										continue;
									}
									if (local209 == 3317) {
										Static114.anIntArray191[local28++] = Static147.anInt2993;
										continue;
									}
									if (local209 == 3318) {
										Static114.anIntArray191[local28++] = Static11.anInt2977;
										continue;
									}
									if (local209 == 3321) {
										Static114.anIntArray191[local28++] = Static288.anInt1354;
										continue;
									}
									if (local209 == 3322) {
										Static114.anIntArray191[local28++] = Static169.anInt3391;
										continue;
									}
									if (local209 == 3323) {
										if (Static115.anInt2352 >= 5 && Static115.anInt2352 <= 9) {
											Static114.anIntArray191[local28++] = 1;
											continue;
										}
										Static114.anIntArray191[local28++] = 0;
										continue;
									}
									if (local209 == 3324) {
										if (Static115.anInt2352 >= 5 && Static115.anInt2352 <= 9) {
											Static114.anIntArray191[local28++] = Static115.anInt2352;
											continue;
										}
										Static114.anIntArray191[local28++] = 0;
										continue;
									}
									if (local209 == 3325) {
										Static114.anIntArray191[local28++] = Static288.aBoolean98 ? 1 : 0;
										continue;
									}
									if (local209 == 3326) {
										Static114.anIntArray191[local28++] = Static21.aClass36_Sub3_Sub1_1.anInt4018;
										continue;
									}
									if (local209 == 3327) {
										Static114.anIntArray191[local28++] = Static21.aClass36_Sub3_Sub1_1.aClass11_2.aBoolean26 ? 1 : 0;
										continue;
									}
									if (local209 == 3328) {
										Static114.anIntArray191[local28++] = Static176.aBoolean291 && !Static139.aBoolean229 ? 1 : 0;
										continue;
									}
									if (local209 == 3329) {
										Static114.anIntArray191[local28++] = Static176.aBoolean292 ? 1 : 0;
										continue;
									}
									if (local209 == 3330) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										Static114.anIntArray191[local28++] = Static77.method1231(local798);
										continue;
									}
									if (local209 == 3331) {
										local28 -= 2;
										local798 = Static114.anIntArray191[local28];
										local803 = Static114.anIntArray191[local28 + 1];
										Static114.anIntArray191[local28++] = Static115.method1858(local798, false, local803);
										continue;
									}
									if (local209 == 3332) {
										local28 -= 2;
										local798 = Static114.anIntArray191[local28];
										local803 = Static114.anIntArray191[local28 + 1];
										Static114.anIntArray191[local28++] = Static115.method1858(local798, true, local803);
										continue;
									}
									if (local209 == 3333) {
										Static114.anIntArray191[local28++] = Static197.anInt3907;
										continue;
									}
									if (local209 == 3335) {
										Static114.anIntArray191[local28++] = Static184.anInt3648;
										continue;
									}
									if (local209 == 3336) {
										local28 -= 4;
										local798 = Static114.anIntArray191[local28];
										local803 = Static114.anIntArray191[local28 + 1];
										local1106 = Static114.anIntArray191[local28 + 2];
										local644 = Static114.anIntArray191[local28 + 3];
										local798 += local803 << 14;
										local798 += local1106 << 28;
										local798 += local644;
										Static114.anIntArray191[local28++] = local798;
										continue;
									}
									if (local209 == 3337) {
										Static114.anIntArray191[local28++] = Static270.anInt5329;
										continue;
									}
								} else if (local209 < 3500) {
									@Pc(11240) Class8_Sub1_Sub18 local11240;
									if (local209 == 3400) {
										local28 -= 2;
										local798 = Static114.anIntArray191[local28];
										local803 = Static114.anIntArray191[local28 + 1];
										local11240 = Static140.method2220(local798);
										if (local11240.aChar3 == 's') {
										}
										Static286.aStringArray80[local26++] = local11240.method3690(local803);
										continue;
									}
									if (local209 == 3408) {
										local28 -= 4;
										local1106 = Static114.anIntArray191[local28 + 2];
										local803 = Static114.anIntArray191[local28 + 1];
										local798 = Static114.anIntArray191[local28];
										local644 = Static114.anIntArray191[local28 + 3];
										@Pc(11288) Class8_Sub1_Sub18 local11288 = Static140.method2220(local1106);
										if (local11288.aChar4 == local798 && local803 == local11288.aChar3) {
											if (local803 == 115) {
												Static286.aStringArray80[local26++] = local11288.method3690(local644);
											} else {
												Static114.anIntArray191[local28++] = local11288.method3688(local644);
											}
											continue;
										}
										throw new RuntimeException("C3408-1");
									}
									if (local209 == 3409) {
										local28 -= 3;
										local803 = Static114.anIntArray191[local28 + 1];
										local1106 = Static114.anIntArray191[local28 + 2];
										local798 = Static114.anIntArray191[local28];
										if (local803 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(11363) Class8_Sub1_Sub18 local11363 = Static140.method2220(local803);
										if (local11363.aChar3 != local798) {
											throw new RuntimeException("C3409-1");
										}
										Static114.anIntArray191[local28++] = local11363.method3689(local1106) ? 1 : 0;
										continue;
									}
									if (local209 == 3410) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										local26--;
										local1905 = Static286.aStringArray80[local26];
										if (local798 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local11240 = Static140.method2220(local798);
										if (local11240.aChar3 != 's') {
											throw new RuntimeException("C3410-1");
										}
										Static114.anIntArray191[local28++] = local11240.method3681(local1905) ? 1 : 0;
										continue;
									}
									if (local209 == 3411) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										@Pc(11452) Class8_Sub1_Sub18 local11452 = Static140.method2220(local798);
										Static114.anIntArray191[local28++] = local11452.aClass129_26.method3040();
										continue;
									}
								} else if (local209 < 3700) {
									if (local209 == 3600) {
										if (Static11.anInt2951 == 0) {
											Static114.anIntArray191[local28++] = -2;
										} else if (Static11.anInt2951 == 1) {
											Static114.anIntArray191[local28++] = -1;
										} else {
											Static114.anIntArray191[local28++] = Static173.anInt3444;
										}
										continue;
									}
									if (local209 == 3601) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										if (Static11.anInt2951 == 2 && local798 < Static173.anInt3444) {
											Static286.aStringArray80[local26++] = Static47.aStringArray15[local798];
											continue;
										}
										Static286.aStringArray80[local26++] = "";
										continue;
									}
									if (local209 == 3602) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										if (Static11.anInt2951 == 2 && Static173.anInt3444 > local798) {
											Static114.anIntArray191[local28++] = Static63.anIntArray95[local798];
											continue;
										}
										Static114.anIntArray191[local28++] = 0;
										continue;
									}
									if (local209 == 3603) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										if (Static11.anInt2951 == 2 && local798 < Static173.anInt3444) {
											Static114.anIntArray191[local28++] = Static220.anIntArray340[local798];
											continue;
										}
										Static114.anIntArray191[local28++] = 0;
										continue;
									}
									if (local209 == 3604) {
										local26--;
										local597 = Static286.aStringArray80[local26];
										local28--;
										local803 = Static114.anIntArray191[local28];
										Static226.method3504(local803, local597);
										continue;
									}
									if (local209 == 3605) {
										local26--;
										local597 = Static286.aStringArray80[local26];
										Static254.method3801(Static31.method513(local597));
										continue;
									}
									if (local209 == 3606) {
										local26--;
										local597 = Static286.aStringArray80[local26];
										Static227.method3515(Static31.method513(local597));
										continue;
									}
									if (local209 == 3607) {
										local26--;
										local597 = Static286.aStringArray80[local26];
										Static66.method3396(Static31.method513(local597), false);
										continue;
									}
									if (local209 == 3608) {
										local26--;
										local597 = Static286.aStringArray80[local26];
										Static44.method711(Static31.method513(local597));
										continue;
									}
									if (local209 == 3609) {
										local26--;
										local597 = Static286.aStringArray80[local26];
										if (local597.startsWith("<img=0>") || local597.startsWith("<img=1>")) {
											local597 = local597.substring(7);
										}
										Static114.anIntArray191[local28++] = Static248.method3686(local597) ? 1 : 0;
										continue;
									}
									if (local209 == 3610) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										if (Static11.anInt2951 == 2 && local798 < Static173.anInt3444) {
											Static286.aStringArray80[local26++] = Static173.aStringArray51[local798];
											continue;
										}
										Static286.aStringArray80[local26++] = "";
										continue;
									}
									if (local209 == 3611) {
										if (Static4.aString6 == null) {
											Static286.aStringArray80[local26++] = "";
										} else {
											Static286.aStringArray80[local26++] = Static19.method344(Static4.aString6);
										}
										continue;
									}
									if (local209 == 3612) {
										if (Static4.aString6 == null) {
											Static114.anIntArray191[local28++] = 0;
										} else {
											Static114.anIntArray191[local28++] = Static146.anInt2901;
										}
										continue;
									}
									if (local209 == 3613) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										if (Static4.aString6 != null && local798 < Static146.anInt2901) {
											Static286.aStringArray80[local26++] = Static19.method344(Static189.aClass8_Sub25Array1[local798].aString154);
											continue;
										}
										Static286.aStringArray80[local26++] = "";
										continue;
									}
									if (local209 == 3614) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										if (Static4.aString6 != null && Static146.anInt2901 > local798) {
											Static114.anIntArray191[local28++] = Static189.aClass8_Sub25Array1[local798].anInt4432;
											continue;
										}
										Static114.anIntArray191[local28++] = 0;
										continue;
									}
									if (local209 == 3615) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										if (Static4.aString6 != null && local798 < Static146.anInt2901) {
											Static114.anIntArray191[local28++] = Static189.aClass8_Sub25Array1[local798].aByte13;
											continue;
										}
										Static114.anIntArray191[local28++] = 0;
										continue;
									}
									if (local209 == 3616) {
										Static114.anIntArray191[local28++] = Static92.aByte6;
										continue;
									}
									if (local209 == 3617) {
										local26--;
										local597 = Static286.aStringArray80[local26];
										Static222.method3478(local597);
										continue;
									}
									if (local209 == 3618) {
										Static114.anIntArray191[local28++] = Static191.aByte9;
										continue;
									}
									if (local209 == 3619) {
										local26--;
										local597 = Static286.aStringArray80[local26];
										Static65.method4180(Static31.method513(local597));
										continue;
									}
									if (local209 == 3620) {
										Static235.method3583();
										continue;
									}
									if (local209 == 3621) {
										if (Static11.anInt2951 == 0) {
											Static114.anIntArray191[local28++] = -1;
										} else {
											Static114.anIntArray191[local28++] = Static30.anInt728;
										}
										continue;
									}
									if (local209 == 3622) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										if (Static11.anInt2951 != 0 && Static30.anInt728 > local798) {
											Static286.aStringArray80[local26++] = Static121.method1945(Static213.aLongArray11[local798]);
											continue;
										}
										Static286.aStringArray80[local26++] = "";
										continue;
									}
									if (local209 == 3623) {
										local26--;
										local597 = Static286.aStringArray80[local26];
										if (local597.startsWith("<img=0>") || local597.startsWith("<img=1>")) {
											local597 = local597.substring(7);
										}
										Static114.anIntArray191[local28++] = Static221.method3455(local597) ? 1 : 0;
										continue;
									}
									if (local209 == 3624) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										if (Static189.aClass8_Sub25Array1 != null && Static146.anInt2901 > local798 && Static189.aClass8_Sub25Array1[local798].aString154.equalsIgnoreCase(Static21.aClass36_Sub3_Sub1_1.aString144)) {
											Static114.anIntArray191[local28++] = 1;
											continue;
										}
										Static114.anIntArray191[local28++] = 0;
										continue;
									}
									if (local209 == 3625) {
										if (Static119.aString90 == null) {
											Static286.aStringArray80[local26++] = "";
										} else {
											Static286.aStringArray80[local26++] = Static19.method344(Static119.aString90);
										}
										continue;
									}
									if (local209 == 3626) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										if (Static4.aString6 != null && Static146.anInt2901 > local798) {
											Static286.aStringArray80[local26++] = Static189.aClass8_Sub25Array1[local798].aString155;
											continue;
										}
										Static286.aStringArray80[local26++] = "";
										continue;
									}
									if (local209 == 3627) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										if (Static11.anInt2951 == 2 && local798 >= 0 && Static173.anInt3444 > local798) {
											Static114.anIntArray191[local28++] = Static57.aBooleanArray4[local798] ? 1 : 0;
											continue;
										}
										Static114.anIntArray191[local28++] = 0;
										continue;
									}
									if (local209 == 3628) {
										local26--;
										local597 = Static286.aStringArray80[local26];
										if (local597.startsWith("<img=0>") || local597.startsWith("<img=1>")) {
											local597 = local597.substring(7);
										}
										Static114.anIntArray191[local28++] = Static234.method3563(local597);
										continue;
									}
									if (local209 == 3629) {
										Static114.anIntArray191[local28++] = Static260.anInt5234;
										continue;
									}
									if (local209 == 3630) {
										local26--;
										local597 = Static286.aStringArray80[local26];
										Static66.method3396(Static31.method513(local597), true);
										continue;
									}
									if (local209 == 3631) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										Static114.anIntArray191[local28++] = Static145.aBooleanArray13[local798] ? 1 : 0;
										continue;
									}
								} else if (local209 < 4000) {
									if (local209 == 3903) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										Static114.anIntArray191[local28++] = Static178.aClass94Array1[local798].method2212();
										continue;
									}
									if (local209 == 3904) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										Static114.anIntArray191[local28++] = Static178.aClass94Array1[local798].anInt2756;
										continue;
									}
									if (local209 == 3905) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										Static114.anIntArray191[local28++] = Static178.aClass94Array1[local798].anInt2762;
										continue;
									}
									if (local209 == 3906) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										Static114.anIntArray191[local28++] = Static178.aClass94Array1[local798].anInt2764;
										continue;
									}
									if (local209 == 3907) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										Static114.anIntArray191[local28++] = Static178.aClass94Array1[local798].anInt2760;
										continue;
									}
									if (local209 == 3908) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										Static114.anIntArray191[local28++] = Static178.aClass94Array1[local798].anInt2758;
										continue;
									}
									if (local209 == 3910) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										local803 = Static178.aClass94Array1[local798].method2209();
										Static114.anIntArray191[local28++] = local803 == 0 ? 1 : 0;
										continue;
									}
									if (local209 == 3911) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										local803 = Static178.aClass94Array1[local798].method2209();
										Static114.anIntArray191[local28++] = local803 == 2 ? 1 : 0;
										continue;
									}
									if (local209 == 3912) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										local803 = Static178.aClass94Array1[local798].method2209();
										Static114.anIntArray191[local28++] = local803 == 5 ? 1 : 0;
										continue;
									}
									if (local209 == 3913) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										local803 = Static178.aClass94Array1[local798].method2209();
										Static114.anIntArray191[local28++] = local803 == 1 ? 1 : 0;
										continue;
									}
								} else if (local209 < 4100) {
									if (local209 == 4000) {
										local28 -= 2;
										local798 = Static114.anIntArray191[local28];
										local803 = Static114.anIntArray191[local28 + 1];
										Static114.anIntArray191[local28++] = local803 + local798;
										continue;
									}
									if (local209 == 4001) {
										local28 -= 2;
										local803 = Static114.anIntArray191[local28 + 1];
										local798 = Static114.anIntArray191[local28];
										Static114.anIntArray191[local28++] = local798 - local803;
										continue;
									}
									if (local209 == 4002) {
										local28 -= 2;
										local798 = Static114.anIntArray191[local28];
										local803 = Static114.anIntArray191[local28 + 1];
										Static114.anIntArray191[local28++] = local803 * local798;
										continue;
									}
									if (local209 == 4003) {
										local28 -= 2;
										local798 = Static114.anIntArray191[local28];
										local803 = Static114.anIntArray191[local28 + 1];
										Static114.anIntArray191[local28++] = local798 / local803;
										continue;
									}
									if (local209 == 4004) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										Static114.anIntArray191[local28++] = (int) ((double) local798 * Math.random());
										continue;
									}
									if (local209 == 4005) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										Static114.anIntArray191[local28++] = (int) ((double) (local798 + 1) * Math.random());
										continue;
									}
									if (local209 == 4006) {
										local28 -= 5;
										local803 = Static114.anIntArray191[local28 + 1];
										local644 = Static114.anIntArray191[local28 + 3];
										local1106 = Static114.anIntArray191[local28 + 2];
										local3297 = Static114.anIntArray191[local28 + 4];
										local798 = Static114.anIntArray191[local28];
										Static114.anIntArray191[local28++] = (local803 - local798) * (-local1106 + local3297) / (local644 - local1106) + local798;
										continue;
									}
									@Pc(3336) long local3336;
									@Pc(3341) long local3341;
									if (local209 == 4007) {
										local28 -= 2;
										local3336 = Static114.anIntArray191[local28 + 1];
										local3341 = Static114.anIntArray191[local28];
										Static114.anIntArray191[local28++] = (int) (local3341 * local3336 / 100L + local3341);
										continue;
									}
									if (local209 == 4008) {
										local28 -= 2;
										local803 = Static114.anIntArray191[local28 + 1];
										local798 = Static114.anIntArray191[local28];
										Static114.anIntArray191[local28++] = 0x1 << local803 | local798;
										continue;
									}
									if (local209 == 4009) {
										local28 -= 2;
										local798 = Static114.anIntArray191[local28];
										local803 = Static114.anIntArray191[local28 + 1];
										Static114.anIntArray191[local28++] = local798 & -(0x1 << local803) - 1;
										continue;
									}
									if (local209 == 4010) {
										local28 -= 2;
										local803 = Static114.anIntArray191[local28 + 1];
										local798 = Static114.anIntArray191[local28];
										Static114.anIntArray191[local28++] = (0x1 << local803 & local798) == 0 ? 0 : 1;
										continue;
									}
									if (local209 == 4011) {
										local28 -= 2;
										local798 = Static114.anIntArray191[local28];
										local803 = Static114.anIntArray191[local28 + 1];
										Static114.anIntArray191[local28++] = local798 % local803;
										continue;
									}
									if (local209 == 4012) {
										local28 -= 2;
										local798 = Static114.anIntArray191[local28];
										local803 = Static114.anIntArray191[local28 + 1];
										if (local798 == 0) {
											Static114.anIntArray191[local28++] = 0;
										} else {
											Static114.anIntArray191[local28++] = (int) Math.pow((double) local798, (double) local803);
										}
										continue;
									}
									if (local209 == 4013) {
										local28 -= 2;
										local803 = Static114.anIntArray191[local28 + 1];
										local798 = Static114.anIntArray191[local28];
										if (local798 == 0) {
											Static114.anIntArray191[local28++] = 0;
										} else if (local803 == 0) {
											Static114.anIntArray191[local28++] = Integer.MAX_VALUE;
										} else {
											Static114.anIntArray191[local28++] = (int) Math.pow((double) local798, 1.0D / (double) local803);
										}
										continue;
									}
									if (local209 == 4014) {
										local28 -= 2;
										local803 = Static114.anIntArray191[local28 + 1];
										local798 = Static114.anIntArray191[local28];
										Static114.anIntArray191[local28++] = local798 & local803;
										continue;
									}
									if (local209 == 4015) {
										local28 -= 2;
										local798 = Static114.anIntArray191[local28];
										local803 = Static114.anIntArray191[local28 + 1];
										Static114.anIntArray191[local28++] = local803 | local798;
										continue;
									}
									if (local209 == 4016) {
										local28 -= 2;
										local798 = Static114.anIntArray191[local28];
										local803 = Static114.anIntArray191[local28 + 1];
										Static114.anIntArray191[local28++] = local798 >= local803 ? local803 : local798;
										continue;
									}
									if (local209 == 4017) {
										local28 -= 2;
										local803 = Static114.anIntArray191[local28 + 1];
										local798 = Static114.anIntArray191[local28];
										Static114.anIntArray191[local28++] = local803 >= local798 ? local803 : local798;
										continue;
									}
									if (local209 == 4018) {
										local28 -= 3;
										local3341 = Static114.anIntArray191[local28];
										local3336 = Static114.anIntArray191[local28 + 1];
										@Pc(3686) long local3686 = (long) Static114.anIntArray191[local28 + 2];
										Static114.anIntArray191[local28++] = (int) (local3686 * local3341 / local3336);
										continue;
									}
								} else if (local209 < 4200) {
									if (local209 == 4100) {
										local28--;
										local803 = Static114.anIntArray191[local28];
										local26--;
										local597 = Static286.aStringArray80[local26];
										Static286.aStringArray80[local26++] = local597 + local803;
										continue;
									}
									if (local209 == 4101) {
										local26 -= 2;
										local597 = Static286.aStringArray80[local26];
										local1905 = Static286.aStringArray80[local26 + 1];
										Static286.aStringArray80[local26++] = local597 + local1905;
										continue;
									}
									if (local209 == 4102) {
										local26--;
										local597 = Static286.aStringArray80[local26];
										local28--;
										local803 = Static114.anIntArray191[local28];
										Static286.aStringArray80[local26++] = local597 + Static122.method1969(local803);
										continue;
									}
									if (local209 == 4103) {
										local26--;
										local597 = Static286.aStringArray80[local26];
										Static286.aStringArray80[local26++] = local597.toLowerCase();
										continue;
									}
									if (local209 == 4104) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										@Pc(3824) long local3824 = ((long) local798 + 11745L) * 86400000L;
										Static232.aCalendar2.setTime(new Date(local3824));
										local644 = Static232.aCalendar2.get(5);
										local3297 = Static232.aCalendar2.get(2);
										local3842 = Static232.aCalendar2.get(1);
										Static286.aStringArray80[local26++] = local644 + "-" + Static125.aStringArray38[local3297] + "-" + local3842;
										continue;
									}
									if (local209 == 4105) {
										local26 -= 2;
										local1905 = Static286.aStringArray80[local26 + 1];
										local597 = Static286.aStringArray80[local26];
										if (Static21.aClass36_Sub3_Sub1_1.aClass11_2 != null && Static21.aClass36_Sub3_Sub1_1.aClass11_2.aBoolean26) {
											Static286.aStringArray80[local26++] = local1905;
											continue;
										}
										Static286.aStringArray80[local26++] = local597;
										continue;
									}
									if (local209 == 4106) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										Static286.aStringArray80[local26++] = Integer.toString(local798);
										continue;
									}
									if (local209 == 4107) {
										local26 -= 2;
										Static114.anIntArray191[local28++] = Static37.method3004(Static189.method2958(Static286.aStringArray80[local26 + 1], Static286.aStringArray80[local26], Static184.anInt3648));
										continue;
									}
									if (local209 == 4108) {
										local26--;
										local597 = Static286.aStringArray80[local26];
										local28 -= 2;
										local803 = Static114.anIntArray191[local28];
										local1106 = Static114.anIntArray191[local28 + 1];
										Static114.anIntArray191[local28++] = Static250.method3750(local1106).method2016(local597, local803);
										continue;
									}
									if (local209 == 4109) {
										local28 -= 2;
										local26--;
										local597 = Static286.aStringArray80[local26];
										local803 = Static114.anIntArray191[local28];
										local1106 = Static114.anIntArray191[local28 + 1];
										Static114.anIntArray191[local28++] = Static250.method3750(local1106).method2037(local597, local803);
										continue;
									}
									if (local209 == 4110) {
										local26 -= 2;
										local1905 = Static286.aStringArray80[local26 + 1];
										local597 = Static286.aStringArray80[local26];
										local28--;
										if (Static114.anIntArray191[local28] == 1) {
											Static286.aStringArray80[local26++] = local597;
										} else {
											Static286.aStringArray80[local26++] = local1905;
										}
										continue;
									}
									if (local209 == 4111) {
										local26--;
										local597 = Static286.aStringArray80[local26];
										Static286.aStringArray80[local26++] = Static43.method2024(local597);
										continue;
									}
									if (local209 == 4112) {
										local26--;
										local597 = Static286.aStringArray80[local26];
										local28--;
										local803 = Static114.anIntArray191[local28];
										if (local803 == -1) {
											throw new RuntimeException("null char");
										}
										Static286.aStringArray80[local26++] = local597 + (char) local803;
										continue;
									}
									if (local209 == 4113) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										Static114.anIntArray191[local28++] = Static31.method512((char) local798) ? 1 : 0;
										continue;
									}
									if (local209 == 4114) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										Static114.anIntArray191[local28++] = Static277.method4274((char) local798) ? 1 : 0;
										continue;
									}
									if (local209 == 4115) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										Static114.anIntArray191[local28++] = Static239.method3612((char) local798) ? 1 : 0;
										continue;
									}
									if (local209 == 4116) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										Static114.anIntArray191[local28++] = Static224.method3489((char) local798) ? 1 : 0;
										continue;
									}
									if (local209 == 4117) {
										local26--;
										local597 = Static286.aStringArray80[local26];
										if (local597 == null) {
											Static114.anIntArray191[local28++] = 0;
										} else {
											Static114.anIntArray191[local28++] = local597.length();
										}
										continue;
									}
									if (local209 == 4118) {
										local28 -= 2;
										local26--;
										local597 = Static286.aStringArray80[local26];
										local803 = Static114.anIntArray191[local28];
										local1106 = Static114.anIntArray191[local28 + 1];
										Static286.aStringArray80[local26++] = local597.substring(local803, local1106);
										continue;
									}
									if (local209 == 4119) {
										local26--;
										local597 = Static286.aStringArray80[local26];
										@Pc(4269) StringBuffer local4269 = new StringBuffer(local597.length());
										@Pc(4271) boolean local4271 = false;
										for (local644 = 0; local597.length() > local644; local644++) {
											@Pc(4281) char local4281 = local597.charAt(local644);
											if (local4281 == '<') {
												local4271 = true;
											} else if (local4281 == '>') {
												local4271 = false;
											} else if (!local4271) {
												local4269.append(local4281);
											}
										}
										Static286.aStringArray80[local26++] = local4269.toString();
										continue;
									}
									if (local209 == 4120) {
										local28 -= 2;
										local26--;
										local597 = Static286.aStringArray80[local26];
										local803 = Static114.anIntArray191[local28];
										local1106 = Static114.anIntArray191[local28 + 1];
										Static114.anIntArray191[local28++] = local597.indexOf(local803, local1106);
										continue;
									}
									if (local209 == 4121) {
										local28--;
										local1106 = Static114.anIntArray191[local28];
										local26 -= 2;
										local597 = Static286.aStringArray80[local26];
										local1905 = Static286.aStringArray80[local26 + 1];
										Static114.anIntArray191[local28++] = local597.indexOf(local1905, local1106);
										continue;
									}
									if (local209 == 4122) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										Static114.anIntArray191[local28++] = Character.toLowerCase((char) local798);
										continue;
									}
									if (local209 == 4123) {
										local28--;
										local798 = Static114.anIntArray191[local28];
										Static114.anIntArray191[local28++] = Character.toUpperCase((char) local798);
										continue;
									}
									if (local209 == 4124) {
										local28--;
										local4428 = Static114.anIntArray191[local28] != 0;
										local28--;
										local803 = Static114.anIntArray191[local28];
										Static286.aStringArray80[local26++] = Static133.method2172(local4428, 0, Static184.anInt3648, (long) local803);
										continue;
									}
								} else {
									@Pc(4481) Class8_Sub1_Sub13 local4481;
									if (local209 < 4300) {
										if (local209 == 4200) {
											local28--;
											local798 = Static114.anIntArray191[local28];
											Static286.aStringArray80[local26++] = Static140.method2222(local798).aString13;
											continue;
										}
										@Pc(10858) Class10 local10858;
										if (local209 == 4201) {
											local28 -= 2;
											local803 = Static114.anIntArray191[local28 + 1];
											local798 = Static114.anIntArray191[local28];
											local10858 = Static140.method2222(local798);
											if (local803 >= 1 && local803 <= 5 && local10858.aStringArray1[local803 - 1] != null) {
												Static286.aStringArray80[local26++] = local10858.aStringArray1[local803 - 1];
												continue;
											}
											Static286.aStringArray80[local26++] = "";
											continue;
										}
										if (local209 == 4202) {
											local28 -= 2;
											local803 = Static114.anIntArray191[local28 + 1];
											local798 = Static114.anIntArray191[local28];
											local10858 = Static140.method2222(local798);
											if (local803 >= 1 && local803 <= 5 && local10858.aStringArray2[local803 - 1] != null) {
												Static286.aStringArray80[local26++] = local10858.aStringArray2[local803 - 1];
												continue;
											}
											Static286.aStringArray80[local26++] = "";
											continue;
										}
										if (local209 == 4203) {
											local28--;
											local798 = Static114.anIntArray191[local28];
											Static114.anIntArray191[local28++] = Static140.method2222(local798).anInt120;
											continue;
										}
										if (local209 == 4204) {
											local28--;
											local798 = Static114.anIntArray191[local28];
											Static114.anIntArray191[local28++] = Static140.method2222(local798).anInt147 == 1 ? 1 : 0;
											continue;
										}
										@Pc(11008) Class10 local11008;
										if (local209 == 4205) {
											local28--;
											local798 = Static114.anIntArray191[local28];
											local11008 = Static140.method2222(local798);
											if (local11008.anInt139 == -1 && local11008.anInt132 >= 0) {
												Static114.anIntArray191[local28++] = local11008.anInt132;
												continue;
											}
											Static114.anIntArray191[local28++] = local798;
											continue;
										}
										if (local209 == 4206) {
											local28--;
											local798 = Static114.anIntArray191[local28];
											local11008 = Static140.method2222(local798);
											if (local11008.anInt139 >= 0 && local11008.anInt132 >= 0) {
												Static114.anIntArray191[local28++] = local11008.anInt132;
												continue;
											}
											Static114.anIntArray191[local28++] = local798;
											continue;
										}
										if (local209 == 4207) {
											local28--;
											local798 = Static114.anIntArray191[local28];
											Static114.anIntArray191[local28++] = Static140.method2222(local798).aBoolean13 ? 1 : 0;
											continue;
										}
										if (local209 == 4208) {
											local28 -= 2;
											local798 = Static114.anIntArray191[local28];
											local803 = Static114.anIntArray191[local28 + 1];
											local4481 = Static168.method4141(local803);
											if (local4481.method3308()) {
												Static286.aStringArray80[local26++] = Static140.method2222(local798).method83(local803, local4481.aString152);
											} else {
												Static114.anIntArray191[local28++] = Static140.method2222(local798).method84(local803, local4481.anInt4335);
											}
											continue;
										}
										if (local209 == 4210) {
											local26--;
											local597 = Static286.aStringArray80[local26];
											local28--;
											local803 = Static114.anIntArray191[local28];
											Static292.method4265(local803 == 1, local597);
											Static114.anIntArray191[local28++] = Static234.anInt4711;
											continue;
										}
										if (local209 == 4211) {
											if (Static170.aShortArray27 != null && Static208.anInt4316 < Static234.anInt4711) {
												Static114.anIntArray191[local28++] = Static170.aShortArray27[Static208.anInt4316++] & 0xFFFF;
												continue;
											}
											Static114.anIntArray191[local28++] = -1;
											continue;
										}
										if (local209 == 4212) {
											Static208.anInt4316 = 0;
											continue;
										}
									} else if (local209 >= 4400) {
										if (local209 < 4500) {
											if (local209 == 4400) {
												local28 -= 2;
												local798 = Static114.anIntArray191[local28];
												local803 = Static114.anIntArray191[local28 + 1];
												local4481 = Static168.method4141(local803);
												if (local4481.method3308()) {
													Static286.aStringArray80[local26++] = Static235.method3578(local798).method1580(local4481.aString152, local803);
												} else {
													Static114.anIntArray191[local28++] = Static235.method3578(local798).method1583(local803, local4481.anInt4335);
												}
												continue;
											}
										} else if (local209 < 4600) {
											if (local209 == 4500) {
												local28 -= 2;
												local798 = Static114.anIntArray191[local28];
												local803 = Static114.anIntArray191[local28 + 1];
												local4481 = Static168.method4141(local803);
												if (local4481.method3308()) {
													Static286.aStringArray80[local26++] = Static84.method1370(local798).method2941(local4481.aString152, local803);
												} else {
													Static114.anIntArray191[local28++] = Static84.method1370(local798).method2948(local4481.anInt4335, local803);
												}
												continue;
											}
										} else if (local209 < 5100) {
											if (local209 == 5000) {
												Static114.anIntArray191[local28++] = Static134.anInt2700;
												continue;
											}
											if (local209 == 5001) {
												local28 -= 3;
												Static134.anInt2700 = Static114.anIntArray191[local28];
												Static119.anInt2400 = Static114.anIntArray191[local28 + 1];
												Static14.anInt362 = Static114.anIntArray191[local28 + 2];
												Static66.aClass8_Sub2_Sub1_4.method2398(204);
												Static66.aClass8_Sub2_Sub1_4.method2340(Static134.anInt2700);
												Static66.aClass8_Sub2_Sub1_4.method2340(Static119.anInt2400);
												Static66.aClass8_Sub2_Sub1_4.method2340(Static14.anInt362);
												continue;
											}
											if (local209 == 5002) {
												local28 -= 2;
												local26--;
												local597 = Static286.aStringArray80[local26];
												local1106 = Static114.anIntArray191[local28 + 1];
												local803 = Static114.anIntArray191[local28];
												Static66.aClass8_Sub2_Sub1_4.method2398(88);
												Static66.aClass8_Sub2_Sub1_4.method2378(Static31.method513(local597));
												Static66.aClass8_Sub2_Sub1_4.method2340(local803 - 1);
												Static66.aClass8_Sub2_Sub1_4.method2340(local1106);
												continue;
											}
											if (local209 == 5003) {
												local28--;
												local798 = Static114.anIntArray191[local28];
												local1905 = null;
												if (local798 < 100) {
													local1905 = Static137.aStringArray27[local798];
												}
												if (local1905 == null) {
													local1905 = "";
												}
												Static286.aStringArray80[local26++] = local1905;
												continue;
											}
											if (local209 == 5004) {
												local28--;
												local798 = Static114.anIntArray191[local28];
												local803 = -1;
												if (local798 < 100 && Static137.aStringArray27[local798] != null) {
													local803 = Static236.anIntArray356[local798];
												}
												Static114.anIntArray191[local28++] = local803;
												continue;
											}
											if (local209 == 5005) {
												Static114.anIntArray191[local28++] = Static119.anInt2400;
												continue;
											}
											if (local209 == 5008) {
												local26--;
												local597 = Static286.aStringArray80[local26];
												if (local597.startsWith("::")) {
													Static109.method1776(local597);
													continue;
												}
												if (Static94.anInt1962 == 0 && (Static176.aBoolean291 && !Static139.aBoolean229 || Static176.aBoolean292)) {
													continue;
												}
												@Pc(9295) byte local9295 = 0;
												local1905 = local597.toLowerCase();
												if (local1905.startsWith(Static241.aString168)) {
													local597 = local597.substring(Static241.aString168.length());
													local9295 = 0;
												} else if (local1905.startsWith(Static66.aString158)) {
													local597 = local597.substring(Static66.aString158.length());
													local9295 = 1;
												} else if (local1905.startsWith(Static191.aString138)) {
													local9295 = 2;
													local597 = local597.substring(Static191.aString138.length());
												} else if (local1905.startsWith(Static157.aString200)) {
													local597 = local597.substring(Static157.aString200.length());
													local9295 = 3;
												} else if (local1905.startsWith(Static73.aString62)) {
													local9295 = 4;
													local597 = local597.substring(Static73.aString62.length());
												} else if (local1905.startsWith(Static38.aString36)) {
													local9295 = 5;
													local597 = local597.substring(Static38.aString36.length());
												} else if (local1905.startsWith(Static4.aString5)) {
													local597 = local597.substring(Static4.aString5.length());
													local9295 = 6;
												} else if (local1905.startsWith(Static60.aString51)) {
													local597 = local597.substring(Static60.aString51.length());
													local9295 = 7;
												} else if (local1905.startsWith(Static177.aString66)) {
													local597 = local597.substring(Static177.aString66.length());
													local9295 = 8;
												} else if (local1905.startsWith(Static162.aString114)) {
													local597 = local597.substring(Static162.aString114.length());
													local9295 = 9;
												} else if (local1905.startsWith(Static84.aString67)) {
													local597 = local597.substring(Static84.aString67.length());
													local9295 = 10;
												} else if (local1905.startsWith(Static221.aString160)) {
													local9295 = 11;
													local597 = local597.substring(Static221.aString160.length());
												} else if (Static184.anInt3648 != 0) {
													if (local1905.startsWith(Static139.aString99)) {
														local597 = local597.substring(Static139.aString99.length());
														local9295 = 0;
													} else if (local1905.startsWith(Static211.aString153)) {
														local9295 = 1;
														local597 = local597.substring(Static211.aString153.length());
													} else if (local1905.startsWith(Static201.aString147)) {
														local597 = local597.substring(Static201.aString147.length());
														local9295 = 2;
													} else if (local1905.startsWith(Static10.aString12)) {
														local9295 = 3;
														local597 = local597.substring(Static10.aString12.length());
													} else if (local1905.startsWith(Static266.aString189)) {
														local9295 = 4;
														local597 = local597.substring(Static266.aString189.length());
													} else if (local1905.startsWith(Static273.aString192)) {
														local9295 = 5;
														local597 = local597.substring(Static273.aString192.length());
													} else if (local1905.startsWith(Static9.aString8)) {
														local9295 = 6;
														local597 = local597.substring(Static9.aString8.length());
													} else if (local1905.startsWith(Static178.aString122)) {
														local597 = local597.substring(Static178.aString122.length());
														local9295 = 7;
													} else if (local1905.startsWith(Static241.aString167)) {
														local597 = local597.substring(Static241.aString167.length());
														local9295 = 8;
													} else if (local1905.startsWith(Static65.aString193)) {
														local597 = local597.substring(Static65.aString193.length());
														local9295 = 9;
													} else if (local1905.startsWith(Static222.aString161)) {
														local9295 = 10;
														local597 = local597.substring(Static222.aString161.length());
													} else if (local1905.startsWith(Static261.aString187)) {
														local597 = local597.substring(Static261.aString187.length());
														local9295 = 11;
													}
												}
												@Pc(9616) byte local9616 = 0;
												local1905 = local597.toLowerCase();
												if (local1905.startsWith(Static69.aString58)) {
													local9616 = 1;
													local597 = local597.substring(Static69.aString58.length());
												} else if (local1905.startsWith(Static3.aString171)) {
													local9616 = 2;
													local597 = local597.substring(Static3.aString171.length());
												} else if (local1905.startsWith(Static293.aString199)) {
													local597 = local597.substring(Static293.aString199.length());
													local9616 = 3;
												} else if (local1905.startsWith(Static175.aString121)) {
													local597 = local597.substring(Static175.aString121.length());
													local9616 = 4;
												} else if (local1905.startsWith(Static271.aString191)) {
													local9616 = 5;
													local597 = local597.substring(Static271.aString191.length());
												} else if (Static184.anInt3648 != 0) {
													if (local1905.startsWith(Static189.aString135)) {
														local9616 = 1;
														local597 = local597.substring(Static189.aString135.length());
													} else if (local1905.startsWith(Static13.aString17)) {
														local9616 = 2;
														local597 = local597.substring(Static13.aString17.length());
													} else if (local1905.startsWith(Static13.aString16)) {
														local9616 = 3;
														local597 = local597.substring(Static13.aString16.length());
													} else if (local1905.startsWith(Static97.aString76)) {
														local597 = local597.substring(Static97.aString76.length());
														local9616 = 4;
													} else if (local1905.startsWith(Static216.aString156)) {
														local597 = local597.substring(Static216.aString156.length());
														local9616 = 5;
													}
												}
												Static66.aClass8_Sub2_Sub1_4.method2398(178);
												Static66.aClass8_Sub2_Sub1_4.method2340(0);
												local3297 = Static66.aClass8_Sub2_Sub1_4.anInt2955;
												Static66.aClass8_Sub2_Sub1_4.method2340(local9295);
												Static66.aClass8_Sub2_Sub1_4.method2340(local9616);
												Static75.method1181(local597, Static66.aClass8_Sub2_Sub1_4);
												Static66.aClass8_Sub2_Sub1_4.method2321(Static66.aClass8_Sub2_Sub1_4.anInt2955 - local3297);
												continue;
											}
											if (local209 == 5009) {
												local26 -= 2;
												local597 = Static286.aStringArray80[local26];
												local1905 = Static286.aStringArray80[local26 + 1];
												if (Static94.anInt1962 != 0 || (!Static176.aBoolean291 || Static139.aBoolean229) && !Static176.aBoolean292) {
													Static66.aClass8_Sub2_Sub1_4.method2398(84);
													Static66.aClass8_Sub2_Sub1_4.method2340(0);
													local1106 = Static66.aClass8_Sub2_Sub1_4.anInt2955;
													Static66.aClass8_Sub2_Sub1_4.method2378(Static31.method513(local597));
													Static75.method1181(local1905, Static66.aClass8_Sub2_Sub1_4);
													Static66.aClass8_Sub2_Sub1_4.method2321(Static66.aClass8_Sub2_Sub1_4.anInt2955 - local1106);
												}
												continue;
											}
											if (local209 == 5010) {
												local28--;
												local798 = Static114.anIntArray191[local28];
												local1905 = null;
												if (local798 < 100) {
													local1905 = Static203.aStringArray64[local798];
												}
												if (local1905 == null) {
													local1905 = "";
												}
												Static286.aStringArray80[local26++] = local1905;
												continue;
											}
											if (local209 == 5011) {
												local28--;
												local798 = Static114.anIntArray191[local28];
												local1905 = null;
												if (local798 < 100) {
													local1905 = Static264.aStringArray82[local798];
												}
												if (local1905 == null) {
													local1905 = "";
												}
												Static286.aStringArray80[local26++] = local1905;
												continue;
											}
											if (local209 == 5012) {
												local803 = -1;
												local28--;
												local798 = Static114.anIntArray191[local28];
												if (local798 < 100) {
													local803 = Static114.anIntArray189[local798];
												}
												Static114.anIntArray191[local28++] = local803;
												continue;
											}
											if (local209 == 5015) {
												if (Static21.aClass36_Sub3_Sub1_1 == null || Static21.aClass36_Sub3_Sub1_1.aString144 == null) {
													local597 = Static20.aString18;
												} else {
													local597 = Static21.aClass36_Sub3_Sub1_1.method3084();
												}
												Static286.aStringArray80[local26++] = local597;
												continue;
											}
											if (local209 == 5016) {
												Static114.anIntArray191[local28++] = Static14.anInt362;
												continue;
											}
											if (local209 == 5017) {
												Static114.anIntArray191[local28++] = Static288.anInt1350;
												continue;
											}
											if (local209 == 5050) {
												local28--;
												local798 = Static114.anIntArray191[local28];
												Static286.aStringArray80[local26++] = Static179.method2742(local798).aString102;
												continue;
											}
											@Pc(10029) Class8_Sub1_Sub10 local10029;
											if (local209 == 5051) {
												local28--;
												local798 = Static114.anIntArray191[local28];
												local10029 = Static179.method2742(local798);
												if (local10029.anIntArray232 == null) {
													Static114.anIntArray191[local28++] = 0;
												} else {
													Static114.anIntArray191[local28++] = local10029.anIntArray232.length;
												}
												continue;
											}
											if (local209 == 5052) {
												local28 -= 2;
												local798 = Static114.anIntArray191[local28];
												local803 = Static114.anIntArray191[local28 + 1];
												@Pc(10070) Class8_Sub1_Sub10 local10070 = Static179.method2742(local798);
												local644 = local10070.anIntArray232[local803];
												Static114.anIntArray191[local28++] = local644;
												continue;
											}
											if (local209 == 5053) {
												local28--;
												local798 = Static114.anIntArray191[local28];
												local10029 = Static179.method2742(local798);
												if (local10029.anIntArray234 == null) {
													Static114.anIntArray191[local28++] = 0;
												} else {
													Static114.anIntArray191[local28++] = local10029.anIntArray234.length;
												}
												continue;
											}
											if (local209 == 5054) {
												local28 -= 2;
												local798 = Static114.anIntArray191[local28];
												local803 = Static114.anIntArray191[local28 + 1];
												Static114.anIntArray191[local28++] = Static179.method2742(local798).anIntArray234[local803];
												continue;
											}
											if (local209 == 5055) {
												local28--;
												local798 = Static114.anIntArray191[local28];
												Static286.aStringArray80[local26++] = Static115.method1854(local798).method3129();
												continue;
											}
											if (local209 == 5056) {
												local28--;
												local798 = Static114.anIntArray191[local28];
												@Pc(10181) Class8_Sub1_Sub12 local10181 = Static115.method1854(local798);
												if (local10181.anIntArray314 == null) {
													Static114.anIntArray191[local28++] = 0;
												} else {
													Static114.anIntArray191[local28++] = local10181.anIntArray314.length;
												}
												continue;
											}
											if (local209 == 5057) {
												local28 -= 2;
												local798 = Static114.anIntArray191[local28];
												local803 = Static114.anIntArray191[local28 + 1];
												Static114.anIntArray191[local28++] = Static115.method1854(local798).anIntArray314[local803];
												continue;
											}
											if (local209 == 5058) {
												Static82.aClass7_1 = new Class7();
												local28--;
												Static82.aClass7_1.anInt61 = Static114.anIntArray191[local28];
												Static82.aClass7_1.aClass8_Sub1_Sub12_1 = Static115.method1854(Static82.aClass7_1.anInt61);
												Static82.aClass7_1.anIntArray7 = new int[Static82.aClass7_1.aClass8_Sub1_Sub12_1.method3131()];
												continue;
											}
											if (local209 == 5059) {
												Static66.aClass8_Sub2_Sub1_4.method2398(200);
												Static66.aClass8_Sub2_Sub1_4.method2340(0);
												local798 = Static66.aClass8_Sub2_Sub1_4.anInt2955;
												Static66.aClass8_Sub2_Sub1_4.method2340(0);
												Static66.aClass8_Sub2_Sub1_4.method2333(Static82.aClass7_1.anInt61);
												Static82.aClass7_1.aClass8_Sub1_Sub12_1.method3137(Static82.aClass7_1.anIntArray7, Static66.aClass8_Sub2_Sub1_4);
												Static66.aClass8_Sub2_Sub1_4.method2321(Static66.aClass8_Sub2_Sub1_4.anInt2955 - local798);
												continue;
											}
											if (local209 == 5060) {
												local26--;
												local597 = Static286.aStringArray80[local26];
												Static66.aClass8_Sub2_Sub1_4.method2398(86);
												Static66.aClass8_Sub2_Sub1_4.method2340(0);
												local803 = Static66.aClass8_Sub2_Sub1_4.anInt2955;
												Static66.aClass8_Sub2_Sub1_4.method2378(Static31.method513(local597));
												Static66.aClass8_Sub2_Sub1_4.method2333(Static82.aClass7_1.anInt61);
												Static82.aClass7_1.aClass8_Sub1_Sub12_1.method3137(Static82.aClass7_1.anIntArray7, Static66.aClass8_Sub2_Sub1_4);
												Static66.aClass8_Sub2_Sub1_4.method2321(Static66.aClass8_Sub2_Sub1_4.anInt2955 - local803);
												continue;
											}
											if (local209 == 5061) {
												Static66.aClass8_Sub2_Sub1_4.method2398(200);
												Static66.aClass8_Sub2_Sub1_4.method2340(0);
												local798 = Static66.aClass8_Sub2_Sub1_4.anInt2955;
												Static66.aClass8_Sub2_Sub1_4.method2340(1);
												Static66.aClass8_Sub2_Sub1_4.method2333(Static82.aClass7_1.anInt61);
												Static82.aClass7_1.aClass8_Sub1_Sub12_1.method3137(Static82.aClass7_1.anIntArray7, Static66.aClass8_Sub2_Sub1_4);
												Static66.aClass8_Sub2_Sub1_4.method2321(Static66.aClass8_Sub2_Sub1_4.anInt2955 - local798);
												continue;
											}
											if (local209 == 5062) {
												local28 -= 2;
												local803 = Static114.anIntArray191[local28 + 1];
												local798 = Static114.anIntArray191[local28];
												Static114.anIntArray191[local28++] = Static179.method2742(local798).aCharArray3[local803];
												continue;
											}
											if (local209 == 5063) {
												local28 -= 2;
												local798 = Static114.anIntArray191[local28];
												local803 = Static114.anIntArray191[local28 + 1];
												Static114.anIntArray191[local28++] = Static179.method2742(local798).aCharArray2[local803];
												continue;
											}
											if (local209 == 5064) {
												local28 -= 2;
												local798 = Static114.anIntArray191[local28];
												local803 = Static114.anIntArray191[local28 + 1];
												if (local803 == -1) {
													Static114.anIntArray191[local28++] = -1;
												} else {
													Static114.anIntArray191[local28++] = Static179.method2742(local798).method2279((char) local803);
												}
												continue;
											}
											if (local209 == 5065) {
												local28 -= 2;
												local798 = Static114.anIntArray191[local28];
												local803 = Static114.anIntArray191[local28 + 1];
												if (local803 == -1) {
													Static114.anIntArray191[local28++] = -1;
												} else {
													Static114.anIntArray191[local28++] = Static179.method2742(local798).method2278((char) local803);
												}
												continue;
											}
											if (local209 == 5066) {
												local28--;
												local798 = Static114.anIntArray191[local28];
												Static114.anIntArray191[local28++] = Static115.method1854(local798).method3131();
												continue;
											}
											if (local209 == 5067) {
												local28 -= 2;
												local798 = Static114.anIntArray191[local28];
												local803 = Static114.anIntArray191[local28 + 1];
												local1106 = Static115.method1854(local798).method3132(local803);
												Static114.anIntArray191[local28++] = local1106;
												continue;
											}
											if (local209 == 5068) {
												local28 -= 2;
												local798 = Static114.anIntArray191[local28];
												local803 = Static114.anIntArray191[local28 + 1];
												Static82.aClass7_1.anIntArray7[local798] = local803;
												continue;
											}
											if (local209 == 5069) {
												local28 -= 2;
												local803 = Static114.anIntArray191[local28 + 1];
												local798 = Static114.anIntArray191[local28];
												Static82.aClass7_1.anIntArray7[local798] = local803;
												continue;
											}
											if (local209 == 5070) {
												local28 -= 3;
												local798 = Static114.anIntArray191[local28];
												local803 = Static114.anIntArray191[local28 + 1];
												local1106 = Static114.anIntArray191[local28 + 2];
												@Pc(10660) Class8_Sub1_Sub12 local10660 = Static115.method1854(local798);
												if (local10660.method3132(local803) != 0) {
													throw new RuntimeException("bad command");
												}
												Static114.anIntArray191[local28++] = local10660.method3136(local803, local1106);
												continue;
											}
											if (local209 == 5071) {
												local26--;
												local597 = Static286.aStringArray80[local26];
												local28--;
												local1247 = Static114.anIntArray191[local28] == 1;
												Static200.method3088(local597, local1247);
												Static114.anIntArray191[local28++] = Static234.anInt4711;
												continue;
											}
											if (local209 == 5072) {
												if (Static170.aShortArray27 != null && Static208.anInt4316 < Static234.anInt4711) {
													Static114.anIntArray191[local28++] = Static170.aShortArray27[Static208.anInt4316++] & 0xFFFF;
													continue;
												}
												Static114.anIntArray191[local28++] = -1;
												continue;
											}
											if (local209 == 5073) {
												Static208.anInt4316 = 0;
												continue;
											}
										} else if (local209 < 5200) {
											if (local209 == 5100) {
												if (Static36.aBooleanArray2[86]) {
													Static114.anIntArray191[local28++] = 1;
												} else {
													Static114.anIntArray191[local28++] = 0;
												}
												continue;
											}
											if (local209 == 5101) {
												if (Static36.aBooleanArray2[82]) {
													Static114.anIntArray191[local28++] = 1;
												} else {
													Static114.anIntArray191[local28++] = 0;
												}
												continue;
											}
											if (local209 == 5102) {
												if (Static36.aBooleanArray2[81]) {
													Static114.anIntArray191[local28++] = 1;
												} else {
													Static114.anIntArray191[local28++] = 0;
												}
												continue;
											}
										} else {
											@Pc(5118) boolean local5118;
											if (local209 < 5300) {
												if (local209 == 5200) {
													local28--;
													Static138.method2210(Static114.anIntArray191[local28]);
													continue;
												}
												if (local209 == 5201) {
													Static114.anIntArray191[local28++] = Static255.method3818();
													continue;
												}
												if (local209 == 5202) {
													local28--;
													Static15.method282(Static114.anIntArray191[local28]);
													continue;
												}
												if (local209 == 5203) {
													local26--;
													Static256.method3841(Static286.aStringArray80[local26]);
													continue;
												}
												if (local209 == 5204) {
													Static286.aStringArray80[local26 - 1] = Static144.method2282(Static286.aStringArray80[local26 - 1]);
													continue;
												}
												if (local209 == 5205) {
													local28--;
													Static249.method3696(-1, -1, Static114.anIntArray191[local28]);
													continue;
												}
												@Pc(4763) Class8_Sub1_Sub2 local4763;
												if (local209 == 5206) {
													local28--;
													local798 = Static114.anIntArray191[local28];
													local4763 = Static79.method1289(local798 >> 14 & 0x3FFF, local798 & 0x3FFF);
													if (local4763 == null) {
														Static114.anIntArray191[local28++] = -1;
													} else {
														Static114.anIntArray191[local28++] = local4763.anInt646;
													}
													continue;
												}
												@Pc(4793) Class8_Sub1_Sub2 local4793;
												if (local209 == 5207) {
													local28--;
													local4793 = Static294.method4290(Static114.anIntArray191[local28]);
													if (local4793 != null && local4793.aString19 != null) {
														Static286.aStringArray80[local26++] = local4793.aString19;
														continue;
													}
													Static286.aStringArray80[local26++] = "";
													continue;
												}
												if (local209 == 5208) {
													Static114.anIntArray191[local28++] = Static162.anInt3357;
													Static114.anIntArray191[local28++] = Static285.anInt5596;
													continue;
												}
												if (local209 == 5209) {
													Static114.anIntArray191[local28++] = Static220.anInt4522 + Static52.anInt1147;
													Static114.anIntArray191[local28++] = Static140.anInt2782 + Static221.anInt4539 - Static218.anInt4483 - 1;
													continue;
												}
												if (local209 == 5210) {
													local28--;
													local798 = Static114.anIntArray191[local28];
													local4763 = Static294.method4290(local798);
													if (local4763 == null) {
														Static114.anIntArray191[local28++] = 0;
														Static114.anIntArray191[local28++] = 0;
													} else {
														Static114.anIntArray191[local28++] = local4763.anInt647 >> 14 & 0x3FFF;
														Static114.anIntArray191[local28++] = local4763.anInt647 & 0x3FFF;
													}
													continue;
												}
												if (local209 == 5211) {
													local28--;
													local798 = Static114.anIntArray191[local28];
													local4763 = Static294.method4290(local798);
													if (local4763 == null) {
														Static114.anIntArray191[local28++] = 0;
														Static114.anIntArray191[local28++] = 0;
													} else {
														Static114.anIntArray191[local28++] = local4763.anInt649 - local4763.anInt644;
														Static114.anIntArray191[local28++] = local4763.anInt642 - local4763.anInt650;
													}
													continue;
												}
												if (local209 == 5212) {
													local798 = Static243.method3656();
													local1106 = 0;
													if (local798 == -1) {
														local1905 = "";
													} else {
														local1905 = Static245.aClass130_2.aStringArray61[local798];
														local1106 = Static245.aClass130_2.method3049(local798);
													}
													local1905 = Static9.method80(" ", "<br>", local1905);
													Static286.aStringArray80[local26++] = local1905;
													Static114.anIntArray191[local28++] = local1106;
													continue;
												}
												if (local209 == 5213) {
													local798 = Static293.method4284();
													local1106 = 0;
													if (local798 == -1) {
														local1905 = "";
													} else {
														local1905 = Static245.aClass130_2.aStringArray61[local798];
														local1106 = Static245.aClass130_2.method3049(local798);
													}
													local1905 = Static9.method80(" ", "<br>", local1905);
													Static286.aStringArray80[local26++] = local1905;
													Static114.anIntArray191[local28++] = local1106;
													continue;
												}
												if (local209 == 5214) {
													local28--;
													local798 = Static114.anIntArray191[local28];
													local4763 = Static114.method1846();
													if (local4763 != null) {
														local5076 = local4763.method423(local798 >> 28 & 0x3, local798 & 0x3FFF, local798 >> 14 & 0x3FFF);
														if (local5076 != null) {
															Static28.method469(local5076[2], local5076[1]);
														}
													}
													continue;
												}
												if (local209 == 5215) {
													local28 -= 2;
													local798 = Static114.anIntArray191[local28];
													local803 = Static114.anIntArray191[local28 + 1];
													@Pc(5116) Class164 local5116 = Static150.method3480(local798 & 0x3FFF, local798 >> 14 & 0x3FFF);
													local5118 = false;
													for (@Pc(5125) Class8_Sub1_Sub2 local5125 = (Class8_Sub1_Sub2) local5116.method3989(); local5125 != null; local5125 = (Class8_Sub1_Sub2) local5116.method3988()) {
														if (local5125.anInt646 == local803) {
															local5118 = true;
															break;
														}
													}
													if (local5118) {
														Static114.anIntArray191[local28++] = 1;
													} else {
														Static114.anIntArray191[local28++] = 0;
													}
													continue;
												}
												if (local209 == 5216) {
													local28--;
													local798 = Static114.anIntArray191[local28];
													Static164.method2607(local798);
													continue;
												}
												if (local209 == 5217) {
													local28--;
													local798 = Static114.anIntArray191[local28];
													if (Static5.method40(local798)) {
														Static114.anIntArray191[local28++] = 1;
													} else {
														Static114.anIntArray191[local28++] = 0;
													}
													continue;
												}
												if (local209 == 5218) {
													local28--;
													local798 = Static114.anIntArray191[local28];
													local4763 = Static294.method4290(local798);
													if (local4763 == null) {
														Static114.anIntArray191[local28++] = -1;
													} else {
														Static114.anIntArray191[local28++] = local4763.anInt640;
													}
													continue;
												}
												if (local209 == 5219) {
													local26--;
													Static174.method2693(Static286.aStringArray80[local26]);
													continue;
												}
												if (local209 == 5220) {
													Static114.anIntArray191[local28++] = Static286.anInt5464 == 100 ? 1 : 0;
													continue;
												}
												if (local209 == 5221) {
													local28--;
													local798 = Static114.anIntArray191[local28];
													Static28.method469(local798 & 0x3FFF, local798 >> 14 & 0x3FFF);
													continue;
												}
												if (local209 == 5222) {
													local4793 = Static114.method1846();
													if (local4793 == null) {
														Static114.anIntArray191[local28++] = -1;
														Static114.anIntArray191[local28++] = -1;
													} else {
														local638 = local4793.method422(Static221.anInt4539 + Static140.anInt2782 - Static218.anInt4483 - 1, Static52.anInt1147 + Static220.anInt4522);
														if (local638 == null) {
															Static114.anIntArray191[local28++] = -1;
															Static114.anIntArray191[local28++] = -1;
														} else {
															Static114.anIntArray191[local28++] = local638[1];
															Static114.anIntArray191[local28++] = local638[2];
														}
													}
													continue;
												}
												if (local209 == 5223) {
													local28 -= 2;
													local798 = Static114.anIntArray191[local28];
													local803 = Static114.anIntArray191[local28 + 1];
													Static249.method3696(local803 >> 14 & 0x3FFF, local803 & 0x3FFF, local798);
													continue;
												}
												if (local209 == 5224) {
													local28--;
													local798 = Static114.anIntArray191[local28];
													local4763 = Static114.method1846();
													if (local4763 == null) {
														Static114.anIntArray191[local28++] = -1;
														Static114.anIntArray191[local28++] = -1;
													} else {
														local5076 = local4763.method423(local798 >> 28 & 0x3, local798 & 0x3FFF, local798 >> 14 & 0x3FFF);
														if (local5076 == null) {
															Static114.anIntArray191[local28++] = -1;
															Static114.anIntArray191[local28++] = -1;
														} else {
															Static114.anIntArray191[local28++] = local5076[1];
															Static114.anIntArray191[local28++] = local5076[2];
														}
													}
													continue;
												}
												if (local209 == 5225) {
													local28--;
													local798 = Static114.anIntArray191[local28];
													local4763 = Static114.method1846();
													if (local4763 == null) {
														Static114.anIntArray191[local28++] = -1;
														Static114.anIntArray191[local28++] = -1;
													} else {
														local5076 = local4763.method422(local798 & 0x3FFF, local798 >> 14 & 0x3FFF);
														if (local5076 == null) {
															Static114.anIntArray191[local28++] = -1;
															Static114.anIntArray191[local28++] = -1;
														} else {
															Static114.anIntArray191[local28++] = local5076[1];
															Static114.anIntArray191[local28++] = local5076[2];
														}
													}
													continue;
												}
											} else if (local209 < 5400) {
												if (local209 == 5300) {
													local28 -= 2;
													local803 = Static114.anIntArray191[local28 + 1];
													local798 = Static114.anIntArray191[local28];
													Static101.method1616(local798, local803, false, 3);
													Static114.anIntArray191[local28++] = Static58.aFrame2 == null ? 0 : 1;
													continue;
												}
												if (local209 == 5301) {
													if (Static58.aFrame2 != null) {
														Static101.method1616(-1, -1, false, Static99.anInt2072);
													}
													continue;
												}
												if (local209 == 5302) {
													@Pc(8912) Class126[] local8912 = Static52.method841();
													Static114.anIntArray191[local28++] = local8912.length;
													continue;
												}
												if (local209 == 5303) {
													local28--;
													local798 = Static114.anIntArray191[local28];
													@Pc(8933) Class126[] local8933 = Static52.method841();
													Static114.anIntArray191[local28++] = local8933[local798].anInt3884;
													Static114.anIntArray191[local28++] = local8933[local798].anInt3887;
													continue;
												}
												if (local209 == 5305) {
													local798 = Static229.anInt4665;
													local803 = Static172.anInt3425;
													local1106 = -1;
													@Pc(8964) Class126[] local8964 = Static52.method841();
													for (local3297 = 0; local3297 < local8964.length; local3297++) {
														@Pc(8974) Class126 local8974 = local8964[local3297];
														if (local798 == local8974.anInt3884 && local8974.anInt3887 == local803) {
															local1106 = local3297;
															break;
														}
													}
													Static114.anIntArray191[local28++] = local1106;
													continue;
												}
												if (local209 == 5306) {
													Static114.anIntArray191[local28++] = Static99.method1585();
													continue;
												}
												if (local209 == 5307) {
													local28--;
													local798 = Static114.anIntArray191[local28];
													if (local798 < 0 || local798 > 2) {
														local798 = 0;
													}
													Static101.method1616(-1, -1, false, local798);
													continue;
												}
												if (local209 == 5308) {
													Static114.anIntArray191[local28++] = Static99.anInt2072;
													continue;
												}
												if (local209 == 5309) {
													local28--;
													local798 = Static114.anIntArray191[local28];
													if (local798 < 0 || local798 > 2) {
														local798 = 0;
													}
													Static99.anInt2072 = local798;
													Static269.method3754(Static199.aClass17_3);
													continue;
												}
											} else if (local209 < 5500) {
												if (local209 == 5400) {
													local26 -= 2;
													local597 = Static286.aStringArray80[local26];
													local1905 = Static286.aStringArray80[local26 + 1];
													local28--;
													local1106 = Static114.anIntArray191[local28];
													Static66.aClass8_Sub2_Sub1_4.method2398(217);
													Static66.aClass8_Sub2_Sub1_4.method2340(Static114.method1850(local597) + Static114.method1850(local1905) + 1);
													Static66.aClass8_Sub2_Sub1_4.method2331(local597);
													Static66.aClass8_Sub2_Sub1_4.method2331(local1905);
													Static66.aClass8_Sub2_Sub1_4.method2340(local1106);
													continue;
												}
												if (local209 == 5401) {
													local28 -= 2;
													Static150.aShortArray47[Static114.anIntArray191[local28]] = (short) Static10.method90(Static114.anIntArray191[local28 + 1]);
													Static128.method2077();
													Static31.method511();
													Static57.method909();
													Static149.method2412();
													Static141.method2237();
													continue;
												}
												if (local209 == 5405) {
													local28 -= 2;
													local798 = Static114.anIntArray191[local28];
													local803 = Static114.anIntArray191[local28 + 1];
													if (local798 >= 0 && local798 < 2) {
														Static230.anIntArrayArrayArray11[local798] = new int[local803 << 1][4];
													}
													continue;
												}
												if (local209 == 5406) {
													local28 -= 7;
													local803 = Static114.anIntArray191[local28 + 1] << 1;
													local798 = Static114.anIntArray191[local28];
													local644 = Static114.anIntArray191[local28 + 3];
													local1106 = Static114.anIntArray191[local28 + 2];
													local3297 = Static114.anIntArray191[local28 + 4];
													local3842 = Static114.anIntArray191[local28 + 5];
													@Pc(5709) int local5709 = Static114.anIntArray191[local28 + 6];
													if (local798 >= 0 && local798 < 2 && Static230.anIntArrayArrayArray11[local798] != null && local803 >= 0 && local803 < Static230.anIntArrayArrayArray11[local798].length) {
														Static230.anIntArrayArrayArray11[local798][local803] = new int[] { (local1106 >> 14 & 0x3FFF) * 128, local644, (local1106 & 0x3FFF) * 128, local5709 };
														Static230.anIntArrayArrayArray11[local798][local803 + 1] = new int[] { (local3297 >> 14 & 0x3FFF) * 128, local3842, (local3297 & 0x3FFF) * 128 };
													}
													continue;
												}
												if (local209 == 5407) {
													local28--;
													local798 = Static230.anIntArrayArrayArray11[Static114.anIntArray191[local28]].length >> 1;
													Static114.anIntArray191[local28++] = local798;
													continue;
												}
												if (local209 == 5411) {
													if (Static58.aFrame2 != null) {
														Static101.method1616(-1, -1, false, Static99.anInt2072);
													}
													if (Static209.aFrame3 == null) {
														Static37.method3008(Static9.method78(), false);
													} else {
														System.exit(0);
													}
													continue;
												}
												if (local209 == 5419) {
													local597 = "";
													if (Static107.aClass163_6 != null) {
														if (Static107.aClass163_6.anObject7 == null) {
															local597 = Static194.method3025(Static107.aClass163_6.anInt5260);
														} else {
															local597 = (String) Static107.aClass163_6.anObject7;
														}
													}
													Static286.aStringArray80[local26++] = local597;
													continue;
												}
												if (local209 == 5420) {
													Static114.anIntArray191[local28++] = Static26.anInt662 == 3 ? 1 : 0;
													continue;
												}
												if (local209 == 5421) {
													if (Static58.aFrame2 != null) {
														Static101.method1616(-1, -1, false, Static99.anInt2072);
													}
													local28--;
													local1247 = Static114.anIntArray191[local28] == 1;
													local26--;
													local597 = Static286.aStringArray80[local26];
													@Pc(5934) String local5934 = Static9.method78() + local597;
													if (Static209.aFrame3 != null || local1247 && Static26.anInt662 != 3 && Static26.aString24.startsWith("win") && !Static279.aBoolean460) {
														Static79.aString65 = local5934;
														Static102.aBoolean168 = local1247;
														Static3.aClass163_10 = Static199.aClass17_3.method456(local5934);
														continue;
													}
													Static37.method3008(local5934, local1247);
													continue;
												}
												if (local209 == 5422) {
													local26 -= 2;
													local597 = Static286.aStringArray80[local26];
													local28--;
													local1106 = Static114.anIntArray191[local28];
													local1905 = Static286.aStringArray80[local26 + 1];
													if (local597.length() > 0) {
														if (Static225.aStringArray68 == null) {
															Static225.aStringArray68 = new String[Static47.anIntArray74[Static198.anInt3914]];
														}
														Static225.aStringArray68[local1106] = local597;
													}
													if (local1905.length() > 0) {
														if (Static168.aStringArray81 == null) {
															Static168.aStringArray81 = new String[Static47.anIntArray74[Static198.anInt3914]];
														}
														Static168.aStringArray81[local1106] = local1905;
													}
													continue;
												}
												if (local209 == 5423) {
													local26--;
													System.out.println(Static286.aStringArray80[local26]);
													continue;
												}
												if (local209 == 5424) {
													local28 -= 11;
													Static101.anInt2131 = Static114.anIntArray191[local28];
													Static299.anInt5715 = Static114.anIntArray191[local28 + 1];
													Static235.anInt4747 = Static114.anIntArray191[local28 + 2];
													Static25.anInt660 = Static114.anIntArray191[local28 + 3];
													Static97.anInt2006 = Static114.anIntArray191[local28 + 4];
													Static50.anInt1117 = Static114.anIntArray191[local28 + 5];
													Static38.anInt848 = Static114.anIntArray191[local28 + 6];
													Static120.anInt2415 = Static114.anIntArray191[local28 + 7];
													Static227.anInt4636 = Static114.anIntArray191[local28 + 8];
													Static200.anInt4050 = Static114.anIntArray191[local28 + 9];
													Static299.anInt5729 = Static114.anIntArray191[local28 + 10];
													Static145.aClass132_55.method3166(Static97.anInt2006);
													Static145.aClass132_55.method3166(Static50.anInt1117);
													Static145.aClass132_55.method3166(Static38.anInt848);
													Static145.aClass132_55.method3166(Static120.anInt2415);
													Static145.aClass132_55.method3166(Static227.anInt4636);
													Static225.aBoolean372 = true;
													continue;
												}
												if (local209 == 5425) {
													Static124.method1983();
													Static225.aBoolean372 = false;
													continue;
												}
												if (local209 == 5426) {
													local28--;
													Static16.anInt3516 = Static114.anIntArray191[local28];
													continue;
												}
												if (local209 == 5427) {
													local28 -= 2;
													Static241.anInt4825 = Static114.anIntArray191[local28];
													Static60.anInt1302 = Static114.anIntArray191[local28 + 1];
													continue;
												}
												if (local209 == 5428) {
													local28 -= 2;
													local798 = Static114.anIntArray191[local28];
													local803 = Static114.anIntArray191[local28 + 1];
													Static114.anIntArray191[local28++] = Static206.method3270(local798, local803) ? 1 : 0;
													continue;
												}
											} else if (local209 < 5600) {
												if (local209 == 5500) {
													local28 -= 4;
													local798 = Static114.anIntArray191[local28];
													local803 = Static114.anIntArray191[local28 + 1];
													local1106 = Static114.anIntArray191[local28 + 2];
													local644 = Static114.anIntArray191[local28 + 3];
													Static25.method437(false, local1106, local644, (local798 >> 14 & 0x3FFF) - Static49.anInt1089, (local798 & 0x3FFF) - Static130.anInt2601, local803);
													continue;
												}
												if (local209 == 5501) {
													local28 -= 4;
													local803 = Static114.anIntArray191[local28 + 1];
													local798 = Static114.anIntArray191[local28];
													local1106 = Static114.anIntArray191[local28 + 2];
													local644 = Static114.anIntArray191[local28 + 3];
													Static182.method2784(local803, (local798 >> 14 & 0x3FFF) - Static49.anInt1089, local1106, local644, (local798 & 0x3FFF) - Static130.anInt2601);
													continue;
												}
												if (local209 == 5502) {
													local28 -= 6;
													local798 = Static114.anIntArray191[local28];
													if (local798 >= 2) {
														throw new RuntimeException();
													}
													Static30.anInt726 = local798;
													local803 = Static114.anIntArray191[local28 + 1];
													if (Static230.anIntArrayArrayArray11[Static30.anInt726].length >> 1 <= local803 + 1) {
														throw new RuntimeException();
													}
													Static214.anInt4399 = local803;
													Static153.anInt3122 = 0;
													Static206.anInt4270 = Static114.anIntArray191[local28 + 2];
													Static292.anInt5658 = Static114.anIntArray191[local28 + 3];
													local1106 = Static114.anIntArray191[local28 + 4];
													if (local1106 >= 2) {
														throw new RuntimeException();
													}
													Static115.anInt2342 = local1106;
													local644 = Static114.anIntArray191[local28 + 5];
													if (Static230.anIntArrayArrayArray11[Static115.anInt2342].length >> 1 <= local644 + 1) {
														throw new RuntimeException();
													}
													Static212.anInt4367 = local644;
													Static172.anInt3428 = 3;
													continue;
												}
												if (local209 == 5503) {
													Static162.method2643();
													continue;
												}
												if (local209 == 5504) {
													local28 -= 2;
													Static63.method982(Static114.anIntArray191[local28 + 1], Static114.anIntArray191[local28]);
													continue;
												}
												if (local209 == 5505) {
													Static114.anIntArray191[local28++] = (int) Static201.aFloat36;
													continue;
												}
												if (local209 == 5506) {
													Static114.anIntArray191[local28++] = (int) Static82.aFloat20;
													continue;
												}
												if (local209 == 5507) {
													Static275.method4087();
													continue;
												}
												if (local209 == 5508) {
													Static67.method1070();
													continue;
												}
												if (local209 == 5509) {
													Static267.method4016();
													continue;
												}
												if (local209 == 5510) {
													Static225.method3497();
													continue;
												}
												if (local209 == 5512) {
													Static30.method506();
													continue;
												}
											} else if (local209 < 5700) {
												if (local209 == 5600) {
													local26 -= 2;
													local597 = Static286.aStringArray80[local26];
													local28--;
													local1106 = Static114.anIntArray191[local28];
													local1905 = Static286.aStringArray80[local26 + 1];
													if (Static23.anInt618 == 10 && Static293.anInt5678 == 0 && Static247.anInt5536 == 0 && Static230.anInt4668 == 0 && Static46.anInt1042 == 0) {
														Static30.method507(local1106, local1905, local597);
													}
													continue;
												}
												if (local209 == 5601) {
													Static17.method317();
													continue;
												}
												if (local209 == 5602) {
													if (Static247.anInt5536 == 0) {
														Static130.anInt2600 = -2;
													}
													continue;
												}
												if (local209 == 5603) {
													local28 -= 4;
													if (Static23.anInt618 == 10 && Static293.anInt5678 == 0 && Static247.anInt5536 == 0 && Static230.anInt4668 == 0 && Static46.anInt1042 == 0) {
														Static38.method604(Static114.anIntArray191[local28], Static114.anIntArray191[local28 + 2], Static114.anIntArray191[local28 + 3], Static114.anIntArray191[local28 + 1]);
													}
													continue;
												}
												if (local209 == 5604) {
													local26--;
													if (Static23.anInt618 == 10 && Static293.anInt5678 == 0 && Static247.anInt5536 == 0 && Static230.anInt4668 == 0 && Static46.anInt1042 == 0) {
														Static260.method3921(Static31.method513(Static286.aStringArray80[local26]));
													}
													continue;
												}
												if (local209 == 5605) {
													local26 -= 3;
													local28 -= 7;
													if (Static23.anInt618 == 10 && Static293.anInt5678 == 0 && Static247.anInt5536 == 0 && Static230.anInt4668 == 0 && Static46.anInt1042 == 0) {
														Static163.method3404(Static114.anIntArray191[local28], Static114.anIntArray191[local28 + 4] == 1, Static114.anIntArray191[local28 + 2], Static286.aStringArray80[local26 + 2], Static114.anIntArray191[local28 + 6] == 1, Static114.anIntArray191[local28 + 3], Static114.anIntArray191[local28 + 1], Static114.anIntArray191[local28 + 5] == 1, Static31.method513(Static286.aStringArray80[local26]), Static286.aStringArray80[local26 + 1]);
													}
													continue;
												}
												if (local209 == 5606) {
													if (Static230.anInt4668 == 0) {
														Static242.anInt4854 = -2;
													}
													continue;
												}
												if (local209 == 5607) {
													Static114.anIntArray191[local28++] = Static130.anInt2600;
													continue;
												}
												if (local209 == 5608) {
													Static114.anIntArray191[local28++] = Static125.anInt2489;
													continue;
												}
												if (local209 == 5609) {
													Static114.anIntArray191[local28++] = Static242.anInt4854;
													continue;
												}
												if (local209 == 5610) {
													for (local798 = 0; local798 < 5; local798++) {
														Static286.aStringArray80[local26++] = local798 < Static95.aStringArray31.length ? Static19.method344(Static95.aStringArray31[local798]) : "";
													}
													Static95.aStringArray31 = null;
													continue;
												}
												if (local209 == 5611) {
													Static114.anIntArray191[local28++] = Static3.anInt4885;
													continue;
												}
											} else if (local209 < 6100) {
												if (local209 == 6001) {
													local28--;
													local798 = Static114.anIntArray191[local28];
													if (local798 < 1) {
														local798 = 1;
													}
													if (local798 > 4) {
														local798 = 4;
													}
													Static54.anInt1180 = local798;
													if (!Static116.aBoolean188 || !Static76.aBoolean117) {
														if (Static54.anInt1180 == 1) {
															Static96.method1525(0.9F);
														}
														if (Static54.anInt1180 == 2) {
															Static96.method1525(0.8F);
														}
														if (Static54.anInt1180 == 3) {
															Static96.method1525(0.7F);
														}
														if (Static54.anInt1180 == 4) {
															Static96.method1525(0.6F);
														}
													}
													if (Static116.aBoolean188) {
														Static293.method4282();
														if (!Static76.aBoolean117) {
															Static225.method3495();
														}
													}
													Static31.method511();
													Static269.method3754(Static199.aClass17_3);
													Static49.aBoolean75 = false;
													continue;
												}
												if (local209 == 6002) {
													local28--;
													Static273.method4053(Static114.anIntArray191[local28] == 1);
													Static231.method3535();
													Static225.method3495();
													Static17.method316();
													Static269.method3754(Static199.aClass17_3);
													Static49.aBoolean75 = false;
													continue;
												}
												if (local209 == 6003) {
													local28--;
													Static11.aBoolean244 = Static114.anIntArray191[local28] == 1;
													Static17.method316();
													Static269.method3754(Static199.aClass17_3);
													Static49.aBoolean75 = false;
													continue;
												}
												if (local209 == 6005) {
													local28--;
													Static113.aBoolean182 = Static114.anIntArray191[local28] == 1;
													Static225.method3495();
													Static269.method3754(Static199.aClass17_3);
													Static49.aBoolean75 = false;
													continue;
												}
												if (local209 == 6006) {
													local28--;
													Static214.aBoolean355 = Static114.anIntArray191[local28] == 1;
													((Class49_Sub1) Static96.anInterface4_1).method1273(!Static214.aBoolean355);
													Static269.method3754(Static199.aClass17_3);
													Static49.aBoolean75 = false;
													continue;
												}
												if (local209 == 6007) {
													local28--;
													Static153.aBoolean257 = Static114.anIntArray191[local28] == 1;
													Static269.method3754(Static199.aClass17_3);
													Static49.aBoolean75 = false;
													continue;
												}
												if (local209 == 6008) {
													local28--;
													Static37.aBoolean314 = Static114.anIntArray191[local28] == 1;
													Static269.method3754(Static199.aClass17_3);
													Static49.aBoolean75 = false;
													continue;
												}
												if (local209 == 6009) {
													local28--;
													Static198.aBoolean317 = Static114.anIntArray191[local28] == 1;
													Static269.method3754(Static199.aClass17_3);
													Static49.aBoolean75 = false;
													continue;
												}
												if (local209 == 6010) {
													local28--;
													Static150.aBoolean367 = Static114.anIntArray191[local28] == 1;
													Static269.method3754(Static199.aClass17_3);
													Static49.aBoolean75 = false;
													continue;
												}
												if (local209 == 6011) {
													local28--;
													local798 = Static114.anIntArray191[local28];
													if (local798 < 0 || local798 > 2) {
														local798 = 0;
													}
													Static270.anInt5337 = local798;
													Static269.method3754(Static199.aClass17_3);
													Static49.aBoolean75 = false;
													continue;
												}
												if (local209 == 6012) {
													if (Static116.aBoolean188) {
														Static108.method1772(0, 0);
													}
													local28--;
													Static76.aBoolean117 = Static114.anIntArray191[local28] == 1;
													if (Static116.aBoolean188 && Static76.aBoolean117) {
														Static96.method1525(0.7F);
													} else {
														if (Static54.anInt1180 == 1) {
															Static96.method1525(0.9F);
														}
														if (Static54.anInt1180 == 2) {
															Static96.method1525(0.8F);
														}
														if (Static54.anInt1180 == 3) {
															Static96.method1525(0.7F);
														}
														if (Static54.anInt1180 == 4) {
															Static96.method1525(0.6F);
														}
													}
													Static225.method3495();
													Static269.method3754(Static199.aClass17_3);
													Static49.aBoolean75 = false;
													continue;
												}
												if (local209 == 6014) {
													local28--;
													Static273.aBoolean455 = Static114.anIntArray191[local28] == 1;
													if (Static116.aBoolean188) {
														Static225.method3495();
													}
													Static269.method3754(Static199.aClass17_3);
													Static49.aBoolean75 = false;
													continue;
												}
												if (local209 == 6015) {
													local28--;
													Static35.aBoolean50 = Static114.anIntArray191[local28] == 1;
													if (Static116.aBoolean188) {
														Static293.method4282();
													}
													Static269.method3754(Static199.aClass17_3);
													Static49.aBoolean75 = false;
													continue;
												}
												if (local209 == 6016) {
													local28--;
													local798 = Static114.anIntArray191[local28];
													if (Static116.aBoolean188) {
														Static120.aBoolean205 = true;
													}
													if (local798 < 0 || local798 > 2) {
														local798 = 0;
													}
													Static215.anInt4429 = local798;
													continue;
												}
												if (local209 == 6017) {
													local28--;
													Static277.aBoolean477 = Static114.anIntArray191[local28] == 1;
													Static191.method2994();
													Static269.method3754(Static199.aClass17_3);
													Static49.aBoolean75 = false;
													continue;
												}
												if (local209 == 6018) {
													local28--;
													local798 = Static114.anIntArray191[local28];
													if (local798 < 0) {
														local798 = 0;
													}
													if (local798 > 127) {
														local798 = 127;
													}
													Static172.anInt3426 = local798;
													Static269.method3754(Static199.aClass17_3);
													Static49.aBoolean75 = false;
													continue;
												}
												if (local209 == 6019) {
													local28--;
													local798 = Static114.anIntArray191[local28];
													if (local798 < 0) {
														local798 = 0;
													}
													if (local798 > 255) {
														local798 = 255;
													}
													if (local798 != Static275.anInt5409) {
														if (Static275.anInt5409 == 0 && Static236.anInt4769 != -1) {
															Static15.method283(Static88.aClass132_35, local798, Static236.anInt4769);
															Static140.aBoolean230 = false;
														} else if (local798 == 0) {
															Static188.method2942();
															Static140.aBoolean230 = false;
														} else {
															Static261.method3925(local798);
														}
														Static275.anInt5409 = local798;
													}
													Static269.method3754(Static199.aClass17_3);
													Static49.aBoolean75 = false;
													continue;
												}
												if (local209 == 6020) {
													local28--;
													local798 = Static114.anIntArray191[local28];
													if (local798 < 0) {
														local798 = 0;
													}
													if (local798 > 127) {
														local798 = 127;
													}
													Static106.anInt2205 = local798;
													Static269.method3754(Static199.aClass17_3);
													Static49.aBoolean75 = false;
													continue;
												}
												if (local209 == 6021) {
													local28--;
													Static65.aBoolean465 = Static114.anIntArray191[local28] == 1;
													Static17.method316();
													continue;
												}
												if (local209 == 6023) {
													local1247 = false;
													local28--;
													local798 = Static114.anIntArray191[local28];
													if (local798 < 0) {
														local798 = 0;
													}
													if (local798 > 2) {
														local798 = 2;
													}
													if (Static16.anInt3524 < 96) {
														local1247 = true;
														local798 = 0;
													}
													Static223.method3485(local798);
													Static269.method3754(Static199.aClass17_3);
													Static49.aBoolean75 = false;
													Static114.anIntArray191[local28++] = local1247 ? 0 : 1;
													continue;
												}
												if (local209 == 6024) {
													local28--;
													local798 = Static114.anIntArray191[local28];
													if (local798 < 0 || local798 > 2) {
														local798 = 0;
													}
													Static174.anInt3451 = local798;
													Static269.method3754(Static199.aClass17_3);
													continue;
												}
												if (local209 == 6027) {
													local28--;
													local798 = Static114.anIntArray191[local28];
													if (!Static116.aBoolean188) {
														continue;
													}
													if (local798 < 0 || local798 > 1) {
														local798 = 0;
													}
													Static256.method3840(local798 == 1);
													continue;
												}
												if (local209 == 6028) {
													local28--;
													Static81.aBoolean129 = Static114.anIntArray191[local28] != 0;
													Static269.method3754(Static199.aClass17_3);
													continue;
												}
											} else if (local209 < 6200) {
												if (local209 == 6101) {
													Static114.anIntArray191[local28++] = Static54.anInt1180;
													continue;
												}
												if (local209 == 6102) {
													Static114.anIntArray191[local28++] = Static158.method2553() ? 1 : 0;
													continue;
												}
												if (local209 == 6103) {
													Static114.anIntArray191[local28++] = Static11.aBoolean244 ? 1 : 0;
													continue;
												}
												if (local209 == 6105) {
													Static114.anIntArray191[local28++] = Static113.aBoolean182 ? 1 : 0;
													continue;
												}
												if (local209 == 6106) {
													Static114.anIntArray191[local28++] = Static214.aBoolean355 ? 1 : 0;
													continue;
												}
												if (local209 == 6107) {
													Static114.anIntArray191[local28++] = Static153.aBoolean257 ? 1 : 0;
													continue;
												}
												if (local209 == 6108) {
													Static114.anIntArray191[local28++] = Static37.aBoolean314 ? 1 : 0;
													continue;
												}
												if (local209 == 6109) {
													Static114.anIntArray191[local28++] = Static198.aBoolean317 ? 1 : 0;
													continue;
												}
												if (local209 == 6110) {
													Static114.anIntArray191[local28++] = Static150.aBoolean367 ? 1 : 0;
													continue;
												}
												if (local209 == 6111) {
													Static114.anIntArray191[local28++] = Static270.anInt5337;
													continue;
												}
												if (local209 == 6112) {
													Static114.anIntArray191[local28++] = Static76.aBoolean117 ? 1 : 0;
													continue;
												}
												if (local209 == 6114) {
													Static114.anIntArray191[local28++] = Static273.aBoolean455 ? 1 : 0;
													continue;
												}
												if (local209 == 6115) {
													Static114.anIntArray191[local28++] = Static35.aBoolean50 ? 1 : 0;
													continue;
												}
												if (local209 == 6116) {
													Static114.anIntArray191[local28++] = Static215.anInt4429;
													continue;
												}
												if (local209 == 6117) {
													Static114.anIntArray191[local28++] = Static277.aBoolean477 ? 1 : 0;
													continue;
												}
												if (local209 == 6118) {
													Static114.anIntArray191[local28++] = Static172.anInt3426;
													continue;
												}
												if (local209 == 6119) {
													Static114.anIntArray191[local28++] = Static275.anInt5409;
													continue;
												}
												if (local209 == 6120) {
													Static114.anIntArray191[local28++] = Static106.anInt2205;
													continue;
												}
												if (local209 == 6121) {
													if (Static116.aBoolean188) {
														Static114.anIntArray191[local28++] = Static116.aBoolean194 ? 1 : 0;
													} else {
														Static114.anIntArray191[local28++] = 0;
													}
													continue;
												}
												if (local209 == 6123) {
													Static114.anIntArray191[local28++] = Static223.method3483();
													continue;
												}
												if (local209 == 6124) {
													Static114.anIntArray191[local28++] = Static174.anInt3451;
													continue;
												}
												if (local209 == 6126) {
													if (Static116.aBoolean188) {
														Static114.anIntArray191[local28++] = Static154.method2457() ? 1 : 0;
													} else {
														Static114.anIntArray191[local28++] = 0;
													}
													continue;
												}
												if (local209 == 6127) {
													Static114.anIntArray191[local28++] = Static270.aBoolean450 ? 1 : 0;
													continue;
												}
												if (local209 == 6128) {
													Static114.anIntArray191[local28++] = Static81.aBoolean129 ? 1 : 0;
													continue;
												}
											} else if (local209 < 6300) {
												if (local209 == 6200) {
													local28 -= 2;
													Static83.aShort6 = (short) Static114.anIntArray191[local28];
													if (Static83.aShort6 <= 0) {
														Static83.aShort6 = 256;
													}
													Static2.aShort1 = (short) Static114.anIntArray191[local28 + 1];
													if (Static2.aShort1 <= 0) {
														Static2.aShort1 = 205;
													}
													continue;
												}
												if (local209 == 6201) {
													local28 -= 2;
													Static147.aShort17 = (short) Static114.anIntArray191[local28];
													if (Static147.aShort17 <= 0) {
														Static147.aShort17 = 256;
													}
													Static31.aShort3 = (short) Static114.anIntArray191[local28 + 1];
													if (Static31.aShort3 <= 0) {
														Static31.aShort3 = 320;
													}
													continue;
												}
												if (local209 == 6202) {
													local28 -= 4;
													Static34.aShort4 = (short) Static114.anIntArray191[local28];
													if (Static34.aShort4 <= 0) {
														Static34.aShort4 = 1;
													}
													Static74.aShort5 = (short) Static114.anIntArray191[local28 + 1];
													if (Static74.aShort5 <= 0) {
														Static74.aShort5 = 32767;
													} else if (Static74.aShort5 < Static34.aShort4) {
														Static74.aShort5 = Static34.aShort4;
													}
													Static102.aShort16 = (short) Static114.anIntArray191[local28 + 2];
													if (Static102.aShort16 <= 0) {
														Static102.aShort16 = 1;
													}
													Static101.aShort15 = (short) Static114.anIntArray191[local28 + 3];
													if (Static101.aShort15 <= 0) {
														Static101.aShort15 = 32767;
													} else if (Static101.aShort15 < Static102.aShort16) {
														Static101.aShort15 = Static102.aShort16;
													}
													continue;
												}
												if (local209 == 6203) {
													Static239.method3610(0, Static224.aClass159_16.anInt5123, Static224.aClass159_16.anInt5121, false, 0);
													Static114.anIntArray191[local28++] = Static51.anInt1121;
													Static114.anIntArray191[local28++] = Static15.anInt403;
													continue;
												}
												if (local209 == 6204) {
													Static114.anIntArray191[local28++] = Static147.aShort17;
													Static114.anIntArray191[local28++] = Static31.aShort3;
													continue;
												}
												if (local209 == 6205) {
													Static114.anIntArray191[local28++] = Static83.aShort6;
													Static114.anIntArray191[local28++] = Static2.aShort1;
													continue;
												}
											} else if (local209 < 6400) {
												if (local209 == 6300) {
													Static114.anIntArray191[local28++] = (int) (Static71.method1143() / 60000L);
													continue;
												}
												if (local209 == 6301) {
													Static114.anIntArray191[local28++] = (int) (Static71.method1143() / 86400000L) - 11745;
													continue;
												}
												if (local209 == 6302) {
													local28 -= 3;
													local798 = Static114.anIntArray191[local28];
													local1106 = Static114.anIntArray191[local28 + 2];
													local803 = Static114.anIntArray191[local28 + 1];
													Static232.aCalendar2.clear();
													Static232.aCalendar2.set(11, 12);
													Static232.aCalendar2.set(local1106, local803, local798);
													Static114.anIntArray191[local28++] = (int) (Static232.aCalendar2.getTime().getTime() / 86400000L) - 11745;
													continue;
												}
												if (local209 == 6303) {
													Static232.aCalendar2.clear();
													Static232.aCalendar2.setTime(new Date(Static71.method1143()));
													Static114.anIntArray191[local28++] = Static232.aCalendar2.get(1);
													continue;
												}
												if (local209 == 6304) {
													local28--;
													local798 = Static114.anIntArray191[local28];
													local1247 = true;
													if (local798 < 0) {
														local1247 = (local798 + 1) % 4 == 0;
													} else if (local798 < 1582) {
														local1247 = local798 % 4 == 0;
													} else if (local798 % 4 != 0) {
														local1247 = false;
													} else if (local798 % 100 != 0) {
														local1247 = true;
													} else if (local798 % 400 != 0) {
														local1247 = false;
													}
													Static114.anIntArray191[local28++] = local1247 ? 1 : 0;
													continue;
												}
											} else if (local209 < 6500) {
												if (local209 == 6405) {
													Static114.anIntArray191[local28++] = Static5.method41() ? 1 : 0;
													continue;
												}
												if (local209 == 6406) {
													Static114.anIntArray191[local28++] = Static11.method2355() ? 1 : 0;
													continue;
												}
											} else if (local209 < 6600) {
												if (local209 == 6500) {
													if (Static23.anInt618 == 10 && Static293.anInt5678 == 0 && Static247.anInt5536 == 0 && Static230.anInt4668 == 0) {
														Static114.anIntArray191[local28++] = Static17.method315() == -1 ? 0 : 1;
														continue;
													}
													Static114.anIntArray191[local28++] = 1;
													continue;
												}
												@Pc(7024) Class39 local7024;
												@Pc(6999) Class13_Sub1 local6999;
												if (local209 == 6501) {
													local6999 = Static4.method34();
													if (local6999 == null) {
														Static114.anIntArray191[local28++] = -1;
														Static114.anIntArray191[local28++] = 0;
														Static286.aStringArray80[local26++] = "";
														Static114.anIntArray191[local28++] = 0;
														Static286.aStringArray80[local26++] = "";
														Static114.anIntArray191[local28++] = 0;
													} else {
														Static114.anIntArray191[local28++] = local6999.anInt3528;
														Static114.anIntArray191[local28++] = local6999.anInt3515;
														Static286.aStringArray80[local26++] = local6999.aString124;
														local7024 = local6999.method2750();
														Static114.anIntArray191[local28++] = local7024.anInt1150;
														Static286.aStringArray80[local26++] = local7024.aString45;
														Static114.anIntArray191[local28++] = local6999.anInt3517;
													}
													continue;
												}
												if (local209 == 6502) {
													local6999 = Static35.method557();
													if (local6999 == null) {
														Static114.anIntArray191[local28++] = -1;
														Static114.anIntArray191[local28++] = 0;
														Static286.aStringArray80[local26++] = "";
														Static114.anIntArray191[local28++] = 0;
														Static286.aStringArray80[local26++] = "";
														Static114.anIntArray191[local28++] = 0;
													} else {
														Static114.anIntArray191[local28++] = local6999.anInt3528;
														Static114.anIntArray191[local28++] = local6999.anInt3515;
														Static286.aStringArray80[local26++] = local6999.aString124;
														local7024 = local6999.method2750();
														Static114.anIntArray191[local28++] = local7024.anInt1150;
														Static286.aStringArray80[local26++] = local7024.aString45;
														Static114.anIntArray191[local28++] = local6999.anInt3517;
													}
													continue;
												}
												if (local209 == 6503) {
													local28--;
													local798 = Static114.anIntArray191[local28];
													if (Static23.anInt618 == 10 && Static293.anInt5678 == 0 && Static247.anInt5536 == 0 && Static230.anInt4668 == 0) {
														Static114.anIntArray191[local28++] = Static234.method3561(local798) ? 1 : 0;
														continue;
													}
													Static114.anIntArray191[local28++] = 0;
													continue;
												}
												if (local209 == 6504) {
													local28--;
													Static185.anInt3690 = Static114.anIntArray191[local28];
													Static269.method3754(Static199.aClass17_3);
													continue;
												}
												if (local209 == 6505) {
													Static114.anIntArray191[local28++] = Static185.anInt3690;
													continue;
												}
												if (local209 == 6506) {
													local28--;
													local798 = Static114.anIntArray191[local28];
													@Pc(7246) Class13_Sub1 local7246 = Static39.method611(local798);
													if (local7246 == null) {
														Static114.anIntArray191[local28++] = -1;
														Static286.aStringArray80[local26++] = "";
														Static114.anIntArray191[local28++] = 0;
														Static286.aStringArray80[local26++] = "";
														Static114.anIntArray191[local28++] = 0;
													} else {
														Static114.anIntArray191[local28++] = local7246.anInt3515;
														Static286.aStringArray80[local26++] = local7246.aString124;
														@Pc(7265) Class39 local7265 = local7246.method2750();
														Static114.anIntArray191[local28++] = local7265.anInt1150;
														Static286.aStringArray80[local26++] = local7265.aString45;
														Static114.anIntArray191[local28++] = local7246.anInt3517;
													}
													continue;
												}
												if (local209 == 6507) {
													local28 -= 4;
													local1247 = Static114.anIntArray191[local28 + 1] == 1;
													local798 = Static114.anIntArray191[local28];
													local5118 = Static114.anIntArray191[local28 + 3] == 1;
													local1106 = Static114.anIntArray191[local28 + 2];
													Static211.method3313(local1106, local798, local5118, local1247);
													continue;
												}
											} else if (local209 < 6700) {
												if (local209 == 6600) {
													local28--;
													Static109.aBoolean177 = Static114.anIntArray191[local28] == 1;
													Static269.method3754(Static199.aClass17_3);
													continue;
												}
												if (local209 == 6601) {
													Static114.anIntArray191[local28++] = Static109.aBoolean177 ? 1 : 0;
													continue;
												}
											}
										}
									} else if (local209 == 4300) {
										local28 -= 2;
										local798 = Static114.anIntArray191[local28];
										local803 = Static114.anIntArray191[local28 + 1];
										local4481 = Static168.method4141(local803);
										if (local4481.method3308()) {
											Static286.aStringArray80[local26++] = Static253.method3795(local798).method4248(local803, local4481.aString152);
										} else {
											Static114.anIntArray191[local28++] = Static253.method3795(local798).method4239(local4481.anInt4335, local803);
										}
										continue;
									}
								}
							}
						}
					}
				} else if (local209 == 100) {
					local28 -= 3;
					local1106 = Static114.anIntArray191[local28 + 2];
					local803 = Static114.anIntArray191[local28 + 1];
					local798 = Static114.anIntArray191[local28];
					if (local803 != 0) {
						local1935 = Static82.method1361(local798);
						if (local1935.aClass159Array1 == null) {
							local1935.aClass159Array1 = new Class159[local1106 + 1];
						}
						if (local1106 >= local1935.aClass159Array1.length) {
							@Pc(14603) Class159[] local14603 = new Class159[local1106 + 1];
							for (local3842 = 0; local3842 < local1935.aClass159Array1.length; local3842++) {
								local14603[local3842] = local1935.aClass159Array1[local3842];
							}
							local1935.aClass159Array1 = local14603;
						}
						if (local1106 > 0 && local1935.aClass159Array1[local1106 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local1106 - 1));
						}
						@Pc(14657) Class159 local14657 = new Class159();
						local14657.aBoolean423 = true;
						local14657.anInt5116 = local14657.anInt5199 = local1935.anInt5199;
						local14657.anInt5133 = local1106;
						local14657.anInt5197 = local803;
						local1935.aClass159Array1[local1106] = local14657;
						if (local1014) {
							Static246.aClass159_17 = local14657;
						} else {
							Static60.aClass159_5 = local14657;
						}
						Static128.method2075(local1935);
						continue;
					}
					throw new RuntimeException();
				} else {
					@Pc(14724) Class159 local14724;
					if (local209 == 101) {
						local1051 = local1014 ? Static246.aClass159_17 : Static60.aClass159_5;
						if (local1051.anInt5133 == -1) {
							if (local1014) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						local14724 = Static82.method1361(local1051.anInt5199);
						local14724.aClass159Array1[local1051.anInt5133] = null;
						Static128.method2075(local14724);
						continue;
					}
					if (local209 == 102) {
						local28--;
						local1051 = Static82.method1361(Static114.anIntArray191[local28]);
						local1051.aClass159Array1 = null;
						Static128.method2075(local1051);
						continue;
					}
					if (local209 == 200) {
						local28 -= 2;
						local798 = Static114.anIntArray191[local28];
						local803 = Static114.anIntArray191[local28 + 1];
						local1962 = Static260.method3916(local803, local798);
						if (local1962 != null && local803 != -1) {
							Static114.anIntArray191[local28++] = 1;
							if (local1014) {
								Static246.aClass159_17 = local1962;
							} else {
								Static60.aClass159_5 = local1962;
							}
							continue;
						}
						Static114.anIntArray191[local28++] = 0;
						continue;
					}
					if (local209 == 201) {
						local28--;
						local798 = Static114.anIntArray191[local28];
						local14724 = Static82.method1361(local798);
						if (local14724 == null) {
							Static114.anIntArray191[local28++] = 0;
						} else {
							Static114.anIntArray191[local28++] = 1;
							if (local1014) {
								Static246.aClass159_17 = local14724;
							} else {
								Static60.aClass159_5 = local14724;
							}
						}
						continue;
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(14845) Exception local14845) {
			if (local18.aString186 == null) {
				if (Static147.anInt2995 != 0) {
					Static47.method746(0, "Clientscript error - check log for details", "");
				}
				Static88.method1444("CS2 - scr:" + local18.aLong203 + " op:" + local32, local14845);
			} else {
				@Pc(14884) StringBuffer local14884 = new StringBuffer(30);
				local14884.append("%0a - in: ").append(local18.aString186);
				for (local52 = Static7.anInt63 - 1; local52 >= 0; local52--) {
					local14884.append("%0a - via: ").append(Static58.aClass107Array2[local52].aClass8_Sub1_Sub20_1.aString186);
				}
				if (local32 == 40) {
					local52 = local38[local30];
					local14884.append("%0a - non-existant gosub script-num: ").append(Integer.toString(local52));
				}
				if (Static147.anInt2995 != 0) {
					Static47.method746(0, "Clientscript error in: " + local18.aString186, "");
				}
				Static88.method1444("CS2 - scr:" + local18.aLong203 + " op:" + local32 + local14884.toString(), local14845);
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BII)I")
	private static int method2798(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class8_Sub23 local15 = (Class8_Sub23) Static188.aClass129_20.method3043((long) arg0);
		if (local15 == null) {
			return 0;
		} else if (arg1 >= 0 && local15.anIntArray268.length > arg1) {
			return local15.anIntArray268[arg1];
		} else {
			return 0;
		}
	}
}
