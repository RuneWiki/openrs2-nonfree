import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray115;

	@OriginalMember(owner = "client!nq", name = "g", descriptor = "[I")
	private static int[] anIntArray393;

	@OriginalMember(owner = "client!nq", name = "h", descriptor = "Lclient!eo;")
	private static Class68 aClass68_8;

	@OriginalMember(owner = "client!nq", name = "j", descriptor = "Lclient!rs;")
	private static Class204 aClass204_1;

	@OriginalMember(owner = "client!nq", name = "r", descriptor = "Lclient!eo;")
	private static Class68 aClass68_9;

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "[I")
	private static final int[] anIntArray391 = new int[1000];

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "I")
	private static int anInt5029 = 0;

	@OriginalMember(owner = "client!nq", name = "d", descriptor = "I")
	private static int anInt5030 = 0;

	@OriginalMember(owner = "client!nq", name = "e", descriptor = "[I")
	private static final int[] anIntArray392 = new int[5];

	@OriginalMember(owner = "client!nq", name = "i", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray116 = new String[1000];

	@OriginalMember(owner = "client!nq", name = "m", descriptor = "[Lclient!ir;")
	private static final Class114[] aClass114Array1 = new Class114[50];

	@OriginalMember(owner = "client!nq", name = "n", descriptor = "[[I")
	private static final int[][] anIntArrayArray40 = new int[5][5000];

	@OriginalMember(owner = "client!nq", name = "t", descriptor = "I")
	private static int anInt5038 = 0;

	@OriginalMember(owner = "client!nq", name = "w", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!nq", name = "z", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray117 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!nq", name = "A", descriptor = "Lclient!ad;")
	public static final Class5 aClass5_44 = new Class5(4);

	@OriginalMember(owner = "client!nq", name = "B", descriptor = "[I")
	private static final int[] anIntArray394 = new int[3];

	@OriginalMember(owner = "client!nq", name = "C", descriptor = "I")
	private static int anInt5043 = 0;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IZ)V")
	public static void method4039() {
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!pl;I)V")
	private static void method4040(@OriginalArg(0) Class3_Sub3_Sub17 arg0, @OriginalArg(1) int arg1) {
		anInt5038 = 0;
		anInt5030 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray422;
		@Pc(11) int[] local11 = arg0.anIntArray421;
		@Pc(13) byte local13 = -1;
		anInt5029 = 0;
		@Pc(603) int local603;
		try {
			@Pc(17) int local17 = 0;
			label260: while (true) {
				local17++;
				if (local17 > arg1) {
					throw new RuntimeException("slow");
				}
				local5++;
				@Pc(31) int local31 = local8[local5];
				if (local31 >= 100) {
					@Pc(802) boolean local802;
					if (local11[local5] == 1) {
						local802 = true;
					} else {
						local802 = false;
					}
					if (local31 >= 100 && local31 < 5000) {
						method4041(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method4042(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray391[anInt5038++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray391[anInt5038++] = Static369.aClass11_1.anIntArray37[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static369.aClass11_1.method464(anIntArray391[--anInt5038], local54);
					} else if (local31 == 3) {
						aStringArray116[anInt5030++] = arg0.aStringArray132[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt5038 -= 2;
						if (anIntArray391[anInt5038] != anIntArray391[anInt5038 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt5038 -= 2;
						if (anIntArray391[anInt5038] == anIntArray391[anInt5038 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt5038 -= 2;
						if (anIntArray391[anInt5038] < anIntArray391[anInt5038 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt5038 -= 2;
						if (anIntArray391[anInt5038] > anIntArray391[anInt5038 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt5029 == 0) {
							return;
						}
						@Pc(216) Class114 local216 = aClass114Array1[--anInt5029];
						arg0 = local216.aClass3_Sub3_Sub17_1;
						local8 = arg0.anIntArray422;
						local11 = arg0.anIntArray421;
						local5 = local216.anInt3656;
						anIntArray393 = local216.anIntArray281;
						aStringArray115 = local216.aStringArray81;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray391[anInt5038++] = Static369.aClass11_1.method455(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static369.aClass11_1.method465(local54, anIntArray391[--anInt5038]);
					} else if (local31 == 31) {
						anInt5038 -= 2;
						if (anIntArray391[anInt5038] <= anIntArray391[anInt5038 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt5038 -= 2;
						if (anIntArray391[anInt5038] >= anIntArray391[anInt5038 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray391[anInt5038++] = anIntArray393[local11[local5]];
					} else if (local31 == 34) {
						anIntArray393[local11[local5]] = anIntArray391[--anInt5038];
					} else if (local31 == 35) {
						aStringArray116[anInt5030++] = aStringArray115[local11[local5]];
					} else if (local31 == 36) {
						aStringArray115[local11[local5]] = aStringArray116[--anInt5030];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt5030 -= local54;
						@Pc(400) String local400 = Static269.method4035(local54, aStringArray116, anInt5030);
						aStringArray116[anInt5030++] = local400;
					} else if (local31 == 38) {
						anInt5038--;
					} else if (local31 == 39) {
						anInt5030--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class3_Sub3_Sub17 local436 = Static448.method5928(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt5633];
							@Pc(450) String[] local450 = new String[local436.anInt5629];
							for (local452 = 0; local452 < local436.anInt5627; local452++) {
								local446[local452] = anIntArray391[anInt5038 + local452 - local436.anInt5627];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt5631; local471++) {
								local450[local471] = aStringArray116[anInt5030 + local471 - local436.anInt5631];
							}
							anInt5038 -= local436.anInt5627;
							anInt5030 -= local436.anInt5631;
							@Pc(502) Class114 local502 = new Class114();
							local502.aClass3_Sub3_Sub17_1 = arg0;
							local502.anInt3656 = local5;
							local502.anIntArray281 = anIntArray393;
							local502.aStringArray81 = aStringArray115;
							if (anInt5029 >= aClass114Array1.length) {
								throw new RuntimeException();
							}
							aClass114Array1[anInt5029++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray422;
							local11 = local436.anIntArray421;
							local5 = -1;
							anIntArray393 = local446;
							aStringArray115 = local450;
						} else if (local31 == 42) {
							anIntArray391[anInt5038++] = Static436.anIntArray560[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static436.anIntArray560[local54] = anIntArray391[--anInt5038];
							Static285.method4197(local54);
							Static184.aBoolean290 |= Static372.aBooleanArray9[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray391[--anInt5038];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray392[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray40[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray391[--anInt5038];
							if (local603 < 0 || local603 >= anIntArray392[local54]) {
								throw new RuntimeException();
							}
							anIntArray391[anInt5038++] = anIntArrayArray40[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt5038 -= 2;
							local603 = anIntArray391[anInt5038];
							if (local603 < 0 || local603 >= anIntArray392[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray40[local54][local603] = anIntArray391[anInt5038 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static306.aStringArray130[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray116[anInt5030++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static306.aStringArray130[local54] = aStringArray116[--anInt5030];
							Static395.method5330(local54);
						} else if (local31 == 51) {
							@Pc(774) Class127 local774 = arg0.aClass127Array1[local11[local5]];
							@Pc(787) Class3_Sub25 local787 = (Class3_Sub25) local774.method3246((long) anIntArray391[--anInt5038]);
							if (local787 != null) {
								local5 += local787.anInt4134;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(855) StringBuffer local855;
			if (arg0.aString55 == null) {
				local855 = new StringBuffer(30);
				local855.append("CS2: ").append(arg0.aLong227).append(" ");
				for (local603 = anInt5029 - 1; local603 >= 0; local603--) {
					local855.append("v: ").append(aClass114Array1[local603].aClass3_Sub3_Sub17_1.aLong227).append(" ");
				}
				local855.append("op: ").append(local13);
				Static379.method1671(local837, local855.toString());
			} else {
				Static206.method3380("Clientscript error in: " + arg0.aString55);
				local855 = new StringBuffer(30);
				local855.append("Clientscript error in: ").append(arg0.aString55).append("\n");
				for (local603 = anInt5029 - 1; local603 >= 0; local603--) {
					local855.append("via: ").append(aClass114Array1[local603].aClass3_Sub3_Sub17_1.aString55).append("\n");
				}
				local855.append("Op: ").append(local13).append("\n");
				@Pc(895) String local895 = local837.getMessage();
				if (local895 != null && local895.length() > 0) {
					local855.append("Message: ").append(local895).append("\n");
				}
				Static379.method1671(local837, local855.toString());
				Static438.method5862(local855.toString());
			}
		}
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(IZ)V")
	private static void method4041(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class68 local137;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(35) Class68 local35;
		@Pc(13) int local13;
		@Pc(210) Class68 local210;
		@Pc(158) Class68 local158;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt5038 -= 3;
				local13 = anIntArray391[anInt5038];
				local19 = anIntArray391[anInt5038 + 1];
				local25 = anIntArray391[anInt5038 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static321.method4661(local13);
				if (local35.aClass68Array2 == null) {
					local35.aClass68Array2 = new Class68[local25 + 1];
				}
				if (local35.aClass68Array2.length <= local25) {
					@Pc(54) Class68[] local54 = new Class68[local25 + 1];
					for (local56 = 0; local56 < local35.aClass68Array2.length; local56++) {
						local54[local56] = local35.aClass68Array2[local56];
					}
					local35.aClass68Array2 = local54;
				}
				if (local25 > 0 && local35.aClass68Array2[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class68 local99 = new Class68();
				local99.anInt2182 = local19;
				local99.anInt2225 = local99.anInt2177 = local35.anInt2177;
				local99.anInt2187 = local25;
				local35.aClass68Array2[local25] = local99;
				if (arg1) {
					aClass68_9 = local99;
				} else {
					aClass68_8 = local99;
				}
				Static442.method5899(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass68_9 : aClass68_8;
				if (local137.anInt2187 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static321.method4661(local137.anInt2177);
				local158.aClass68Array2[local137.anInt2187] = null;
				Static442.method5899(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static321.method4661(anIntArray391[--anInt5038]);
				local137.aClass68Array2 = null;
				Static442.method5899(local137);
				return;
			}
			if (arg0 == 200) {
				anInt5038 -= 2;
				local13 = anIntArray391[anInt5038];
				local19 = anIntArray391[anInt5038 + 1];
				local210 = Static347.method4975(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray391[anInt5038++] = 1;
					if (arg1) {
						aClass68_9 = local210;
						return;
					}
					aClass68_8 = local210;
					return;
				}
				anIntArray391[anInt5038++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray391[--anInt5038];
				local158 = Static321.method4661(local13);
				if (local158 != null) {
					anIntArray391[anInt5038++] = 1;
					if (arg1) {
						aClass68_9 = local158;
						return;
					}
					aClass68_8 = local158;
					return;
				}
				anIntArray391[anInt5038++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray391[--anInt5038];
				method4045(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray391[--anInt5038];
				method4046(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt5038 -= 2;
					local13 = anIntArray391[anInt5038];
					local19 = anIntArray391[anInt5038 + 1];
					for (local25 = 0; local25 < Static329.anIntArray447.length; local25++) {
						if (Static329.anIntArray447[local25] == local13) {
							Static113.aClass1_Sub3_Sub3_Sub1_4.aClass8_1.method254(local19, Static279.aClass109_8, local25);
							return;
						}
					}
					for (local353 = 0; local353 < Static319.anIntArray428.length; local353++) {
						if (Static319.anIntArray428[local353] == local13) {
							Static113.aClass1_Sub3_Sub3_Sub1_4.aClass8_1.method254(local19, Static279.aClass109_8, local353);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt5038 -= 2;
					local13 = anIntArray391[anInt5038];
					local19 = anIntArray391[anInt5038 + 1];
					Static113.aClass1_Sub3_Sub3_Sub1_4.aClass8_1.method252(local13, local19);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray391[--anInt5038] != 0;
					Static113.aClass1_Sub3_Sub3_Sub1_4.aClass8_1.method243(local412);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1488) String local1488;
				@Pc(1101) String local1101;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static321.method4661(anIntArray391[--anInt5038]);
					} else {
						local137 = arg1 ? aClass68_9 : aClass68_8;
					}
					if (arg0 == 1100) {
						anInt5038 -= 2;
						local137.anInt2147 = anIntArray391[anInt5038];
						if (local137.anInt2147 > local137.anInt2210 - local137.anInt2178) {
							local137.anInt2147 = local137.anInt2210 - local137.anInt2178;
						}
						if (local137.anInt2147 < 0) {
							local137.anInt2147 = 0;
						}
						local137.anInt2151 = anIntArray391[anInt5038 + 1];
						if (local137.anInt2151 > local137.anInt2197 - local137.lb) {
							local137.anInt2151 = local137.anInt2197 - local137.lb;
						}
						if (local137.anInt2151 < 0) {
							local137.anInt2151 = 0;
						}
						Static442.method5899(local137);
						if (local137.anInt2187 == -1) {
							Static319.method4639(local137.anInt2177);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt2174 = anIntArray391[--anInt5038];
						Static442.method5899(local137);
						if (local137.anInt2187 == -1) {
							Static363.method5126(local137.anInt2177);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean175 = anIntArray391[--anInt5038] == 1;
						Static442.method5899(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt2219 = anIntArray391[--anInt5038];
						Static442.method5899(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt2145 = anIntArray391[--anInt5038];
						Static442.method5899(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray391[--anInt5038];
						if (local137.anInt2159 != local19) {
							local137.anInt2159 = local19;
							Static442.method5899(local137);
						}
						if (local137.anInt2187 == -1) {
							Static412.method5540(local137.anInt2177);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt2206 = anIntArray391[--anInt5038];
						Static442.method5899(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean172 = anIntArray391[--anInt5038] == 1;
						Static442.method5899(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt2173 = 1;
						local137.anInt2146 = anIntArray391[--anInt5038];
						Static442.method5899(local137);
						if (local137.anInt2187 == -1) {
							Static292.method4288(local137.anInt2177);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt5038 -= 6;
						local137.anInt2208 = anIntArray391[anInt5038];
						local137.anInt2142 = anIntArray391[anInt5038 + 1];
						local137.anInt2141 = anIntArray391[anInt5038 + 2];
						local137.anInt2195 = anIntArray391[anInt5038 + 3];
						local137.anInt2198 = anIntArray391[anInt5038 + 4];
						local137.anInt2191 = anIntArray391[anInt5038 + 5];
						Static442.method5899(local137);
						if (local137.anInt2187 == -1) {
							Static412.method5539(local137.anInt2177);
							Static420.method5629(local137.anInt2177);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray391[--anInt5038];
						if (local137.anInt2205 != local19) {
							local137.anInt2205 = local19;
							local137.anInt2139 = 0;
							local137.anInt2216 = 1;
							local137.anInt2152 = 0;
							Static442.method5899(local137);
						}
						if (local137.anInt2187 == -1) {
							Static34.method816(local137.anInt2177);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean168 = anIntArray391[--anInt5038] == 1;
						Static442.method5899(local137);
						return;
					}
					if (arg0 == 1112) {
						local1101 = aStringArray116[--anInt5030];
						if (!local1101.equals(local137.aString20)) {
							local137.aString20 = local1101;
							Static442.method5899(local137);
						}
						if (local137.anInt2187 == -1) {
							Static219.method3495(local137.anInt2177);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt2223 = anIntArray391[--anInt5038];
						Static442.method5899(local137);
						if (local137.anInt2187 == -1) {
							Static415.method5563(local137.anInt2177);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt5038 -= 3;
						local137.anInt2143 = anIntArray391[anInt5038];
						local137.anInt2138 = anIntArray391[anInt5038 + 1];
						local137.anInt2167 = anIntArray391[anInt5038 + 2];
						Static442.method5899(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean171 = anIntArray391[--anInt5038] == 1;
						Static442.method5899(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt2144 = anIntArray391[--anInt5038];
						Static442.method5899(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt2179 = anIntArray391[--anInt5038];
						Static442.method5899(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean176 = anIntArray391[--anInt5038] == 1;
						Static442.method5899(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean174 = anIntArray391[--anInt5038] == 1;
						Static442.method5899(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt5038 -= 2;
						local137.anInt2210 = anIntArray391[anInt5038];
						local137.anInt2197 = anIntArray391[anInt5038 + 1];
						Static442.method5899(local137);
						if (local137.anInt2182 == 0) {
							Static446.method5923(false, local137);
						}
						return;
					}
					if (arg0 == 1121) {
						anInt5038 -= 2;
						local137.anInt2201 = (short) anIntArray391[anInt5038];
						local137.anInt2176 = (short) anIntArray391[anInt5038 + 1];
						Static442.method5899(local137);
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean178 = anIntArray391[--anInt5038] == 1;
						Static442.method5899(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt2191 = anIntArray391[--anInt5038];
						Static442.method5899(local137);
						if (local137.anInt2187 == -1) {
							Static412.method5539(local137.anInt2177);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray391[--anInt5038];
						local137.aBoolean173 = local19 == 1;
						Static442.method5899(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt5038 -= 2;
						local137.anInt2227 = anIntArray391[anInt5038];
						local137.anInt2207 = anIntArray391[anInt5038 + 1];
						Static442.method5899(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt2189 = anIntArray391[--anInt5038];
						Static442.method5899(local137);
						return;
					}
					@Pc(1454) Class235 local1454;
					if (arg0 == 1127) {
						anInt5038 -= 2;
						local19 = anIntArray391[anInt5038];
						local25 = anIntArray391[anInt5038 + 1];
						local1454 = Static294.aClass69_2.method1740(local19);
						if (local25 != local1454.anInt7023) {
							local137.method1729(local25, local19);
							return;
						}
						local137.method1732(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray391[--anInt5038];
						local1488 = aStringArray116[--anInt5030];
						local1454 = Static294.aClass69_2.method1740(local19);
						if (!local1454.aString63.equals(local1488)) {
							local137.method1723(local19, local1488);
							return;
						}
						local137.method1732(local19);
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2290) int local2290;
					if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static321.method4661(anIntArray391[--anInt5038]);
						} else {
							local137 = arg1 ? aClass68_9 : aClass68_8;
						}
						if (arg0 == 1300) {
							local19 = anIntArray391[--anInt5038] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method1721(local19, aStringArray116[--anInt5030]);
								return;
							}
							anInt5030--;
							return;
						}
						if (arg0 == 1301) {
							anInt5038 -= 2;
							local19 = anIntArray391[anInt5038];
							local25 = anIntArray391[anInt5038 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass68_2 = null;
								return;
							}
							local137.aClass68_2 = Static347.method4975(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray391[--anInt5038];
							if (local19 != Static376.anInt7411 && local19 != Static392.anInt6754 && local19 != Static312.anInt5686) {
								return;
							}
							local137.anInt2175 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt2158 = anIntArray391[--anInt5038];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt2166 = anIntArray391[--anInt5038];
							return;
						}
						if (arg0 == 1305) {
							local137.aString21 = aStringArray116[--anInt5030];
							return;
						}
						if (arg0 == 1306) {
							local137.aString18 = aStringArray116[--anInt5030];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray52 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt2222 = anIntArray391[--anInt5038];
							local137.anInt2196 = anIntArray391[--anInt5038];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray391[--anInt5038];
							local25 = anIntArray391[--anInt5038];
							if (local25 >= 1 && local25 <= 10) {
								local137.method1736(local19, local25 - 1);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString19 = aStringArray116[--anInt5030];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt2171 = anIntArray391[--anInt5038];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt5038 -= 3;
								local19 = anIntArray391[anInt5038] - 1;
								local25 = anIntArray391[anInt5038 + 1];
								local353 = anIntArray391[anInt5038 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt5038 -= 2;
								local19 = 10;
								local25 = anIntArray391[anInt5038];
								local353 = anIntArray391[anInt5038 + 1];
							}
							if (local137.aByteArray29 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray29 = new byte[11];
								local137.aByteArray28 = new byte[11];
								local137.anIntArray186 = new int[11];
							}
							local137.aByteArray29[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean169 = false;
								for (local2290 = 0; local2290 < local137.aByteArray29.length; local2290++) {
									if (local137.aByteArray29[local2290] != 0) {
										local137.aBoolean169 = true;
										break;
									}
								}
							} else {
								local137.aBoolean169 = true;
							}
							local137.aByteArray28[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt2163 = anIntArray391[--anInt5038];
							return;
						}
					} else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static321.method4661(anIntArray391[--anInt5038]);
						} else {
							local137 = arg1 ? aClass68_9 : aClass68_8;
						}
						local1101 = aStringArray116[--anInt5030];
						@Pc(2369) int[] local2369 = null;
						if (local1101.length() > 0 && local1101.charAt(local1101.length() - 1) == 'Y') {
							local353 = anIntArray391[--anInt5038];
							if (local353 > 0) {
								local2369 = new int[local353];
								while (local353-- > 0) {
									local2369[local353] = anIntArray391[--anInt5038];
								}
							}
							local1101 = local1101.substring(0, local1101.length() - 1);
						}
						@Pc(2421) Object[] local2421 = new Object[local1101.length() + 1];
						for (local2290 = local2421.length - 1; local2290 >= 1; local2290--) {
							if (local1101.charAt(local2290 - 1) == 's') {
								local2421[local2290] = aStringArray116[--anInt5030];
							} else {
								local2421[local2290] = Integer.valueOf(anIntArray391[--anInt5038]);
							}
						}
						local56 = anIntArray391[--anInt5038];
						if (local56 == -1) {
							local2421 = null;
						} else {
							local2421[0] = Integer.valueOf(local56);
						}
						if (arg0 == 1400) {
							local137.anObjectArray5 = local2421;
						} else if (arg0 == 1401) {
							local137.anObjectArray6 = local2421;
						} else if (arg0 == 1402) {
							local137.anObjectArray31 = local2421;
						} else if (arg0 == 1403) {
							local137.anObjectArray14 = local2421;
						} else if (arg0 == 1404) {
							local137.anObjectArray10 = local2421;
						} else if (arg0 == 1405) {
							local137.anObjectArray16 = local2421;
						} else if (arg0 == 1406) {
							local137.anObjectArray24 = local2421;
						} else if (arg0 == 1407) {
							local137.anObjectArray7 = local2421;
							local137.anIntArray188 = local2369;
						} else if (arg0 == 1408) {
							local137.anObjectArray9 = local2421;
						} else if (arg0 == 1409) {
							local137.anObjectArray25 = local2421;
						} else if (arg0 == 1410) {
							local137.anObjectArray8 = local2421;
						} else if (arg0 == 1411) {
							local137.anObjectArray34 = local2421;
						} else if (arg0 == 1412) {
							local137.anObjectArray21 = local2421;
						} else if (arg0 == 1414) {
							local137.anObjectArray32 = local2421;
							local137.anIntArray187 = local2369;
						} else if (arg0 == 1415) {
							local137.anObjectArray26 = local2421;
							local137.anIntArray193 = local2369;
						} else if (arg0 == 1416) {
							local137.anObjectArray29 = local2421;
						} else if (arg0 == 1417) {
							local137.anObjectArray19 = local2421;
						} else if (arg0 == 1418) {
							local137.anObjectArray12 = local2421;
						} else if (arg0 == 1419) {
							local137.anObjectArray18 = local2421;
						} else if (arg0 == 1420) {
							local137.anObjectArray11 = local2421;
						} else if (arg0 == 1421) {
							local137.anObjectArray27 = local2421;
						} else if (arg0 == 1422) {
							local137.anObjectArray33 = local2421;
						} else if (arg0 == 1423) {
							local137.anObjectArray28 = local2421;
						} else if (arg0 == 1424) {
							local137.anObjectArray30 = local2421;
						} else if (arg0 == 1425) {
							local137.anObjectArray22 = local2421;
						} else if (arg0 == 1426) {
							local137.anObjectArray15 = local2421;
						} else if (arg0 == 1427) {
							local137.anObjectArray13 = local2421;
						} else if (arg0 == 1428) {
							local137.anObjectArray17 = local2421;
							local137.anIntArray189 = local2369;
						} else if (arg0 == 1429) {
							local137.anObjectArray4 = local2421;
							local137.anIntArray190 = local2369;
						} else if (arg0 == 1430) {
							local137.anObjectArray23 = local2421;
						}
						local137.aBoolean180 = true;
						return;
					} else if (arg0 < 1600) {
						local137 = arg1 ? aClass68_9 : aClass68_8;
						if (arg0 == 1500) {
							anIntArray391[anInt5038++] = local137.anInt2217;
							return;
						}
						if (arg0 == 1501) {
							anIntArray391[anInt5038++] = local137.anInt2212;
							return;
						}
						if (arg0 == 1502) {
							anIntArray391[anInt5038++] = local137.anInt2178;
							return;
						}
						if (arg0 == 1503) {
							anIntArray391[anInt5038++] = local137.lb;
							return;
						}
						if (arg0 == 1504) {
							anIntArray391[anInt5038++] = local137.aBoolean167 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray391[anInt5038++] = local137.anInt2225;
							return;
						}
						if (arg0 == 1506) {
							local158 = Static94.method1636(local137);
							anIntArray391[anInt5038++] = local158 == null ? -1 : local158.anInt2177;
							return;
						}
					} else {
						@Pc(3017) Class235 local3017;
						if (arg0 < 1700) {
							local137 = arg1 ? aClass68_9 : aClass68_8;
							if (arg0 == 1600) {
								anIntArray391[anInt5038++] = local137.anInt2147;
								return;
							}
							if (arg0 == 1601) {
								anIntArray391[anInt5038++] = local137.anInt2151;
								return;
							}
							if (arg0 == 1602) {
								aStringArray116[anInt5030++] = local137.aString20;
								return;
							}
							if (arg0 == 1603) {
								anIntArray391[anInt5038++] = local137.anInt2210;
								return;
							}
							if (arg0 == 1604) {
								anIntArray391[anInt5038++] = local137.anInt2197;
								return;
							}
							if (arg0 == 1605) {
								anIntArray391[anInt5038++] = local137.anInt2191;
								return;
							}
							if (arg0 == 1606) {
								anIntArray391[anInt5038++] = local137.anInt2141;
								return;
							}
							if (arg0 == 1607) {
								anIntArray391[anInt5038++] = local137.anInt2198;
								return;
							}
							if (arg0 == 1608) {
								anIntArray391[anInt5038++] = local137.anInt2195;
								return;
							}
							if (arg0 == 1609) {
								anIntArray391[anInt5038++] = local137.anInt2219;
								return;
							}
							if (arg0 == 1610) {
								anIntArray391[anInt5038++] = local137.anInt2208;
								return;
							}
							if (arg0 == 1611) {
								anIntArray391[anInt5038++] = local137.anInt2142;
								return;
							}
							if (arg0 == 1612) {
								anIntArray391[anInt5038++] = local137.anInt2159;
								return;
							}
							if (arg0 == 1613) {
								local19 = anIntArray391[--anInt5038];
								local3017 = Static294.aClass69_2.method1740(local19);
								if (local3017.method5455()) {
									aStringArray116[anInt5030++] = local137.method1724(local3017.aString63, local19);
								} else {
									anIntArray391[anInt5038++] = local137.method1735(local3017.anInt7023, local19);
								}
							}
						} else if (arg0 < 1800) {
							local137 = arg1 ? aClass68_9 : aClass68_8;
							if (arg0 == 1700) {
								anIntArray391[anInt5038++] = local137.anInt2192;
								return;
							}
							if (arg0 == 1701) {
								if (local137.anInt2192 != -1) {
									anIntArray391[anInt5038++] = local137.anInt2186;
									return;
								}
								anIntArray391[anInt5038++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray391[anInt5038++] = local137.anInt2187;
								return;
							}
						} else if (arg0 < 1900) {
							local137 = arg1 ? aClass68_9 : aClass68_8;
							if (arg0 == 1800) {
								anIntArray391[anInt5038++] = Static56.method1160(local137).method3487();
								return;
							}
							if (arg0 == 1801) {
								local19 = anIntArray391[--anInt5038];
								local19--;
								if (local137.aStringArray52 != null && local19 < local137.aStringArray52.length && local137.aStringArray52[local19] != null) {
									aStringArray116[anInt5030++] = local137.aStringArray52[local19];
									return;
								}
								aStringArray116[anInt5030++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local137.aString21 == null) {
									aStringArray116[anInt5030++] = "";
									return;
								}
								aStringArray116[anInt5030++] = local137.aString21;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local137 = Static321.method4661(anIntArray391[--anInt5038]);
								arg0 -= 1000;
							} else {
								local137 = arg1 ? aClass68_9 : aClass68_8;
							}
							if (anInt5043 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local137.anObjectArray13 == null) {
									return;
								}
								@Pc(3254) Class3_Sub20 local3254 = new Class3_Sub20();
								local3254.aClass68_4 = local137;
								local3254.anObjectArray35 = local137.anObjectArray13;
								local3254.anInt2712 = anInt5043 + 1;
								Static392.aClass229_44.method5321(local3254);
								return;
							}
						} else if (arg0 < 2600) {
							local137 = Static321.method4661(anIntArray391[--anInt5038]);
							if (arg0 == 2500) {
								anIntArray391[anInt5038++] = local137.anInt2217;
								return;
							}
							if (arg0 == 2501) {
								anIntArray391[anInt5038++] = local137.anInt2212;
								return;
							}
							if (arg0 == 2502) {
								anIntArray391[anInt5038++] = local137.anInt2178;
								return;
							}
							if (arg0 == 2503) {
								anIntArray391[anInt5038++] = local137.lb;
								return;
							}
							if (arg0 == 2504) {
								anIntArray391[anInt5038++] = local137.aBoolean167 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray391[anInt5038++] = local137.anInt2225;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static94.method1636(local137);
								anIntArray391[anInt5038++] = local158 == null ? -1 : local158.anInt2177;
								return;
							}
						} else if (arg0 < 2700) {
							local137 = Static321.method4661(anIntArray391[--anInt5038]);
							if (arg0 == 2600) {
								anIntArray391[anInt5038++] = local137.anInt2147;
								return;
							}
							if (arg0 == 2601) {
								anIntArray391[anInt5038++] = local137.anInt2151;
								return;
							}
							if (arg0 == 2602) {
								aStringArray116[anInt5030++] = local137.aString20;
								return;
							}
							if (arg0 == 2603) {
								anIntArray391[anInt5038++] = local137.anInt2210;
								return;
							}
							if (arg0 == 2604) {
								anIntArray391[anInt5038++] = local137.anInt2197;
								return;
							}
							if (arg0 == 2605) {
								anIntArray391[anInt5038++] = local137.anInt2191;
								return;
							}
							if (arg0 == 2606) {
								anIntArray391[anInt5038++] = local137.anInt2141;
								return;
							}
							if (arg0 == 2607) {
								anIntArray391[anInt5038++] = local137.anInt2198;
								return;
							}
							if (arg0 == 2608) {
								anIntArray391[anInt5038++] = local137.anInt2195;
								return;
							}
							if (arg0 == 2609) {
								anIntArray391[anInt5038++] = local137.anInt2219;
								return;
							}
							if (arg0 == 2610) {
								anIntArray391[anInt5038++] = local137.anInt2208;
								return;
							}
							if (arg0 == 2611) {
								anIntArray391[anInt5038++] = local137.anInt2142;
								return;
							}
							if (arg0 == 2612) {
								anIntArray391[anInt5038++] = local137.anInt2159;
								return;
							}
						} else {
							@Pc(3751) Class3_Sub40 local3751;
							@Pc(3649) Class3_Sub40 local3649;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local137 = Static321.method4661(anIntArray391[--anInt5038]);
									anIntArray391[anInt5038++] = local137.anInt2192;
									return;
								}
								if (arg0 == 2701) {
									local137 = Static321.method4661(anIntArray391[--anInt5038]);
									if (local137.anInt2192 != -1) {
										anIntArray391[anInt5038++] = local137.anInt2186;
										return;
									}
									anIntArray391[anInt5038++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local13 = anIntArray391[--anInt5038];
									local3649 = (Class3_Sub40) Static30.aClass127_3.method3246((long) local13);
									if (local3649 != null) {
										anIntArray391[anInt5038++] = 1;
										return;
									}
									anIntArray391[anInt5038++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local137 = Static321.method4661(anIntArray391[--anInt5038]);
									if (local137.aClass68Array2 == null) {
										anIntArray391[anInt5038++] = 0;
										return;
									}
									local19 = local137.aClass68Array2.length;
									for (local25 = 0; local25 < local137.aClass68Array2.length; local25++) {
										if (local137.aClass68Array2[local25] == null) {
											local19 = local25;
											break;
										}
									}
									anIntArray391[anInt5038++] = local19;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt5038 -= 2;
									local13 = anIntArray391[anInt5038];
									local19 = anIntArray391[anInt5038 + 1];
									local3751 = (Class3_Sub40) Static30.aClass127_3.method3246((long) local13);
									if (local3751 != null && local3751.anInt6668 == local19) {
										anIntArray391[anInt5038++] = 1;
										return;
									}
									anIntArray391[anInt5038++] = 0;
									return;
								}
							} else if (arg0 < 2900) {
								local137 = Static321.method4661(anIntArray391[--anInt5038]);
								if (arg0 == 2800) {
									anIntArray391[anInt5038++] = Static56.method1160(local137).method3487();
									return;
								}
								if (arg0 == 2801) {
									local19 = anIntArray391[--anInt5038];
									local19--;
									if (local137.aStringArray52 != null && local19 < local137.aStringArray52.length && local137.aStringArray52[local19] != null) {
										aStringArray116[anInt5030++] = local137.aStringArray52[local19];
										return;
									}
									aStringArray116[anInt5030++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local137.aString21 == null) {
										aStringArray116[anInt5030++] = "";
										return;
									}
									aStringArray116[anInt5030++] = local137.aString21;
									return;
								}
							} else {
								@Pc(3888) String local3888;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local3888 = aStringArray116[--anInt5030];
										Static206.method3380(local3888);
										return;
									}
									if (arg0 == 3101) {
										anInt5038 -= 2;
										Static51.method1064(anIntArray391[anInt5038 + 1], anIntArray391[anInt5038], Static113.aClass1_Sub3_Sub3_Sub1_4);
										return;
									}
									if (arg0 == 3103) {
										Static403.method5458();
										return;
									}
									if (arg0 == 3104) {
										local3888 = aStringArray116[--anInt5030];
										local19 = 0;
										if (Static179.method3046(local3888)) {
											local19 = Static110.method1873(local3888);
										}
										Static414.method5552(Static423.aClass92_242);
										Static302.aClass3_Sub2_Sub2_2.method6008(local19);
										return;
									}
									if (arg0 == 3105) {
										local3888 = aStringArray116[--anInt5030];
										Static414.method5552(Static65.aClass92_220);
										Static302.aClass3_Sub2_Sub2_2.method6001(local3888.length() + 1);
										Static302.aClass3_Sub2_Sub2_2.method6033(local3888);
										return;
									}
									if (arg0 == 3106) {
										local3888 = aStringArray116[--anInt5030];
										Static414.method5552(Static139.aClass92_97);
										Static302.aClass3_Sub2_Sub2_2.method6001(local3888.length() + 1);
										Static302.aClass3_Sub2_Sub2_2.method6033(local3888);
										return;
									}
									if (arg0 == 3107) {
										local13 = anIntArray391[--anInt5038];
										local1101 = aStringArray116[--anInt5030];
										Static349.method5834(local13, local1101);
										return;
									}
									if (arg0 == 3108) {
										anInt5038 -= 3;
										local13 = anIntArray391[anInt5038];
										local19 = anIntArray391[anInt5038 + 1];
										local25 = anIntArray391[anInt5038 + 2];
										local35 = Static321.method4661(local25);
										Static384.method5258(local35, local13, local19);
										return;
									}
									if (arg0 == 3109) {
										anInt5038 -= 2;
										local13 = anIntArray391[anInt5038];
										local19 = anIntArray391[anInt5038 + 1];
										local210 = arg1 ? aClass68_9 : aClass68_8;
										Static384.method5258(local210, local13, local19);
										return;
									}
									if (arg0 == 3110) {
										local13 = anIntArray391[--anInt5038];
										Static414.method5552(Static42.aClass92_35);
										Static302.aClass3_Sub2_Sub2_2.method6045(local13);
										return;
									}
									if (arg0 == 3111) {
										anInt5038 -= 2;
										local13 = anIntArray391[anInt5038];
										local19 = anIntArray391[anInt5038 + 1];
										local3751 = (Class3_Sub40) Static30.aClass127_3.method3246((long) local13);
										if (local3751 != null) {
											Static316.method4612(true, local3751.anInt6668 != local19, local3751);
										}
										Static298.method4386(true, local19, 3, local13);
										return;
									}
									if (arg0 == 3112) {
										anInt5038--;
										local13 = anIntArray391[anInt5038];
										local3649 = (Class3_Sub40) Static30.aClass127_3.method3246((long) local13);
										if (local3649 != null && local3649.anInt6670 == 3) {
											Static316.method4612(true, true, local3649);
										}
										return;
									}
									if (arg0 == 3113) {
										Static346.method4964(aStringArray116[--anInt5030]);
										return;
									}
									if (arg0 == 3114) {
										anInt5038 -= 2;
										local13 = anIntArray391[anInt5038];
										local19 = anIntArray391[anInt5038 + 1];
										local1488 = aStringArray116[--anInt5030];
										Static304.method4490("", "", local19, local13, local1488);
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt5038 -= 3;
										Static222.method3517(anIntArray391[anInt5038], 255, anIntArray391[anInt5038 + 1], anIntArray391[anInt5038 + 2]);
										return;
									}
									if (arg0 == 3201) {
										Static27.method721(anIntArray391[--anInt5038], 255, 50);
										return;
									}
									if (arg0 == 3202) {
										anInt5038 -= 2;
										Static287.method4202(anIntArray391[anInt5038 + 1], 255, anIntArray391[anInt5038]);
										return;
									}
									if (arg0 == 3203) {
										anInt5038 -= 4;
										Static222.method3517(anIntArray391[anInt5038], anIntArray391[anInt5038 + 3], anIntArray391[anInt5038 + 1], anIntArray391[anInt5038 + 2]);
										return;
									}
									if (arg0 == 3204) {
										anInt5038 -= 3;
										Static27.method721(anIntArray391[anInt5038], anIntArray391[anInt5038 + 1], anIntArray391[anInt5038 + 2]);
										return;
									}
									if (arg0 == 3205) {
										anInt5038 -= 3;
										Static287.method4202(anIntArray391[anInt5038 + 1], anIntArray391[anInt5038 + 2], anIntArray391[anInt5038]);
										return;
									}
									if (arg0 == 3206) {
										anInt5038 -= 4;
										Static171.method2968(anIntArray391[anInt5038], anIntArray391[anInt5038 + 2], anIntArray391[anInt5038 + 3], anIntArray391[anInt5038 + 1]);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray391[anInt5038++] = Static290.anInt5325;
										return;
									}
									if (arg0 == 3301) {
										anInt5038 -= 2;
										local13 = anIntArray391[anInt5038];
										local19 = anIntArray391[anInt5038 + 1];
										anIntArray391[anInt5038++] = Static37.method888(local13, false, local19);
										return;
									}
									if (arg0 == 3302) {
										anInt5038 -= 2;
										local13 = anIntArray391[anInt5038];
										local19 = anIntArray391[anInt5038 + 1];
										anIntArray391[anInt5038++] = Static393.method5308(false, local13, local19);
										return;
									}
									if (arg0 == 3303) {
										anInt5038 -= 2;
										local13 = anIntArray391[anInt5038];
										local19 = anIntArray391[anInt5038 + 1];
										anIntArray391[anInt5038++] = Static405.method5474(local19, false, local13);
										return;
									}
									if (arg0 == 3304) {
										local13 = anIntArray391[--anInt5038];
										anIntArray391[anInt5038++] = Static343.aClass150_6.method3776(local13).anInt1255;
										return;
									}
									if (arg0 == 3305) {
										local13 = anIntArray391[--anInt5038];
										anIntArray391[anInt5038++] = Static54.anIntArray81[local13];
										return;
									}
									if (arg0 == 3306) {
										local13 = anIntArray391[--anInt5038];
										anIntArray391[anInt5038++] = Static231.anIntArray341[local13];
										return;
									}
									if (arg0 == 3307) {
										local13 = anIntArray391[--anInt5038];
										anIntArray391[anInt5038++] = Static216.anIntArray322[local13];
										return;
									}
									if (arg0 == 3308) {
										@Pc(4605) byte local4605 = Static113.aClass1_Sub3_Sub3_Sub1_4.aByte77;
										local19 = (Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6053 >> 7) + Static108.anInt3458;
										local25 = (Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6055 >> 7) + Static339.anInt6223;
										anIntArray391[anInt5038++] = (local4605 << 28) + (local19 << 14) + local25;
										return;
									}
									if (arg0 == 3309) {
										local13 = anIntArray391[--anInt5038];
										anIntArray391[anInt5038++] = local13 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local13 = anIntArray391[--anInt5038];
										anIntArray391[anInt5038++] = local13 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local13 = anIntArray391[--anInt5038];
										anIntArray391[anInt5038++] = local13 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray391[anInt5038++] = Static139.aBoolean249 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt5038 -= 2;
										local13 = anIntArray391[anInt5038];
										local19 = anIntArray391[anInt5038 + 1];
										anIntArray391[anInt5038++] = Static37.method888(local13, true, local19);
										return;
									}
									if (arg0 == 3314) {
										anInt5038 -= 2;
										local13 = anIntArray391[anInt5038];
										local19 = anIntArray391[anInt5038 + 1];
										anIntArray391[anInt5038++] = Static393.method5308(true, local13, local19);
										return;
									}
									if (arg0 == 3315) {
										anInt5038 -= 2;
										local13 = anIntArray391[anInt5038];
										local19 = anIntArray391[anInt5038 + 1];
										anIntArray391[anInt5038++] = Static405.method5474(local19, true, local13);
										return;
									}
									if (arg0 == 3316) {
										if (Static199.anInt3933 >= 2) {
											anIntArray391[anInt5038++] = Static199.anInt3933;
											return;
										}
										anIntArray391[anInt5038++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray391[anInt5038++] = Static176.anInt3611;
										return;
									}
									if (arg0 == 3318) {
										anIntArray391[anInt5038++] = Static379.anInt2076;
										return;
									}
									if (arg0 == 3321) {
										anIntArray391[anInt5038++] = Static213.anInt4181;
										return;
									}
									if (arg0 == 3322) {
										anIntArray391[anInt5038++] = Static340.anInt6291;
										return;
									}
									if (arg0 == 3323) {
										if (Static144.anInt3223 >= 5 && Static144.anInt3223 <= 9) {
											anIntArray391[anInt5038++] = 1;
											return;
										}
										anIntArray391[anInt5038++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static144.anInt3223 >= 5 && Static144.anInt3223 <= 9) {
											anIntArray391[anInt5038++] = Static144.anInt3223;
											return;
										}
										anIntArray391[anInt5038++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray391[anInt5038++] = Static17.aBoolean22 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray391[anInt5038++] = Static113.aClass1_Sub3_Sub3_Sub1_4.anInt4882;
										return;
									}
									if (arg0 == 3327) {
										anIntArray391[anInt5038++] = Static113.aClass1_Sub3_Sub3_Sub1_4.aClass8_1.aBoolean15 ? 1 : 0;
										return;
									}
									if (arg0 == 3328) {
										anIntArray391[anInt5038++] = Static269.aBoolean373 && !Static268.aBoolean372 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray391[anInt5038++] = Static413.aBoolean307 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local13 = anIntArray391[--anInt5038];
										anIntArray391[anInt5038++] = Static285.method4196(local13);
										return;
									}
									if (arg0 == 3331) {
										anInt5038 -= 2;
										local13 = anIntArray391[anInt5038];
										local19 = anIntArray391[anInt5038 + 1];
										anIntArray391[anInt5038++] = Static451.method5974(local19, local13, false);
										return;
									}
									if (arg0 == 3332) {
										anInt5038 -= 2;
										local13 = anIntArray391[anInt5038];
										local19 = anIntArray391[anInt5038 + 1];
										anIntArray391[anInt5038++] = Static451.method5974(local19, local13, true);
										return;
									}
									if (arg0 == 3333) {
										anIntArray391[anInt5038++] = Static177.anInt3622;
										return;
									}
									if (arg0 == 3335) {
										anIntArray391[anInt5038++] = Static216.anInt4257;
										return;
									}
									if (arg0 == 3336) {
										anInt5038 -= 4;
										local13 = anIntArray391[anInt5038];
										local19 = anIntArray391[anInt5038 + 1];
										local25 = anIntArray391[anInt5038 + 2];
										local353 = anIntArray391[anInt5038 + 3];
										local13 += local19 << 14;
										local13 += local25 << 28;
										local13 += local353;
										anIntArray391[anInt5038++] = local13;
										return;
									}
									if (arg0 == 3337) {
										anIntArray391[anInt5038++] = Static448.anInt7558;
										return;
									}
									if (arg0 == 3338) {
										anIntArray391[anInt5038++] = Static19.method565();
										return;
									}
								} else if (arg0 < 3500) {
									@Pc(5230) Class58 local5230;
									if (arg0 == 3400) {
										anInt5038 -= 2;
										local13 = anIntArray391[anInt5038];
										local19 = anIntArray391[anInt5038 + 1];
										local5230 = Static58.aClass192_1.method4696(local13);
										aStringArray116[anInt5030++] = local5230.method1409(local19);
										return;
									}
									if (arg0 == 3408) {
										anInt5038 -= 4;
										local13 = anIntArray391[anInt5038];
										local19 = anIntArray391[anInt5038 + 1];
										local25 = anIntArray391[anInt5038 + 2];
										local353 = anIntArray391[anInt5038 + 3];
										@Pc(5276) Class58 local5276 = Static58.aClass192_1.method4696(local25);
										if (local5276.aChar2 == local13 && local5276.aChar3 == local19) {
											if (local19 == 115) {
												aStringArray116[anInt5030++] = local5276.method1409(local353);
												return;
											}
											anIntArray391[anInt5038++] = local5276.method1404(local353);
											return;
										}
										throw new RuntimeException("C3408-1");
									}
									if (arg0 == 3409) {
										anInt5038 -= 3;
										local13 = anIntArray391[anInt5038];
										local19 = anIntArray391[anInt5038 + 1];
										local25 = anIntArray391[anInt5038 + 2];
										if (local19 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(5352) Class58 local5352 = Static58.aClass192_1.method4696(local19);
										if (local5352.aChar3 != local13) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray391[anInt5038++] = local5352.method1405(local25) ? 1 : 0;
										return;
									}
									if (arg0 == 3410) {
										local13 = anIntArray391[--anInt5038];
										local1101 = aStringArray116[--anInt5030];
										if (local13 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local5230 = Static58.aClass192_1.method4696(local13);
										if (local5230.aChar3 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray391[anInt5038++] = local5230.method1398(local1101) ? 1 : 0;
										return;
									}
									if (arg0 == 3411) {
										local13 = anIntArray391[--anInt5038];
										@Pc(5450) Class58 local5450 = Static58.aClass192_1.method4696(local13);
										anIntArray391[anInt5038++] = local5450.aClass127_7.method3256();
										return;
									}
								} else if (arg0 < 3700) {
									if (arg0 == 3600) {
										if (Static147.anInt3266 == 0) {
											anIntArray391[anInt5038++] = -2;
											return;
										}
										if (Static147.anInt3266 == 1) {
											anIntArray391[anInt5038++] = -1;
											return;
										}
										anIntArray391[anInt5038++] = Static317.anInt5757;
										return;
									}
									if (arg0 == 3601) {
										local13 = anIntArray391[--anInt5038];
										if (Static147.anInt3266 == 2 && local13 < Static317.anInt5757) {
											aStringArray116[anInt5030++] = Static170.aStringArray78[local13];
											if (Static436.aStringArray172[local13] != null) {
												aStringArray116[anInt5030++] = Static436.aStringArray172[local13];
												return;
											}
											aStringArray116[anInt5030++] = "";
											return;
										}
										aStringArray116[anInt5030++] = "";
										aStringArray116[anInt5030++] = "";
										return;
									}
									if (arg0 == 3602) {
										local13 = anIntArray391[--anInt5038];
										if (Static147.anInt3266 == 2 && local13 < Static317.anInt5757) {
											anIntArray391[anInt5038++] = Static195.anIntArray296[local13];
											return;
										}
										anIntArray391[anInt5038++] = 0;
										return;
									}
									if (arg0 == 3603) {
										local13 = anIntArray391[--anInt5038];
										if (Static147.anInt3266 == 2 && local13 < Static317.anInt5757) {
											anIntArray391[anInt5038++] = Static445.anIntArray576[local13];
											return;
										}
										anIntArray391[anInt5038++] = 0;
										return;
									}
									if (arg0 == 3604) {
										local3888 = aStringArray116[--anInt5030];
										local19 = anIntArray391[--anInt5038];
										Static73.method1338(local19, local3888);
										return;
									}
									if (arg0 == 3605) {
										local3888 = aStringArray116[--anInt5030];
										Static357.method5083(local3888);
										return;
									}
									if (arg0 == 3606) {
										local3888 = aStringArray116[--anInt5030];
										Static315.method4603(local3888);
										return;
									}
									if (arg0 == 3607) {
										local3888 = aStringArray116[--anInt5030];
										Static399.method5376(local3888, false);
										return;
									}
									if (arg0 == 3608) {
										local3888 = aStringArray116[--anInt5030];
										Static422.method5654(local3888);
										return;
									}
									if (arg0 == 3609) {
										local3888 = aStringArray116[--anInt5030];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray391[anInt5038++] = Static58.method1178(local3888) ? 1 : 0;
										return;
									}
									if (arg0 == 3610) {
										local13 = anIntArray391[--anInt5038];
										if (Static147.anInt3266 == 2 && local13 < Static317.anInt5757) {
											aStringArray116[anInt5030++] = Static279.aStringArray173[local13];
											return;
										}
										aStringArray116[anInt5030++] = "";
										return;
									}
									if (arg0 == 3611) {
										if (Static289.aString53 != null) {
											aStringArray116[anInt5030++] = Static403.method5452(Static289.aString53);
											return;
										}
										aStringArray116[anInt5030++] = "";
										return;
									}
									if (arg0 == 3612) {
										if (Static289.aString53 != null) {
											anIntArray391[anInt5038++] = Static154.anInt3337;
											return;
										}
										anIntArray391[anInt5038++] = 0;
										return;
									}
									if (arg0 == 3613) {
										local13 = anIntArray391[--anInt5038];
										if (Static289.aString53 != null && local13 < Static154.anInt3337) {
											aStringArray116[anInt5030++] = Static65.aClass26Array2[local13].aString5;
											return;
										}
										aStringArray116[anInt5030++] = "";
										return;
									}
									if (arg0 == 3614) {
										local13 = anIntArray391[--anInt5038];
										if (Static289.aString53 != null && local13 < Static154.anInt3337) {
											anIntArray391[anInt5038++] = Static65.aClass26Array2[local13].anInt1022;
											return;
										}
										anIntArray391[anInt5038++] = 0;
										return;
									}
									if (arg0 == 3615) {
										local13 = anIntArray391[--anInt5038];
										if (Static289.aString53 != null && local13 < Static154.anInt3337) {
											anIntArray391[anInt5038++] = Static65.aClass26Array2[local13].aByte11;
											return;
										}
										anIntArray391[anInt5038++] = 0;
										return;
									}
									if (arg0 == 3616) {
										anIntArray391[anInt5038++] = Static320.aByte74;
										return;
									}
									if (arg0 == 3617) {
										local3888 = aStringArray116[--anInt5030];
										Static4.method742(local3888);
										return;
									}
									if (arg0 == 3618) {
										anIntArray391[anInt5038++] = Static125.aByte10;
										return;
									}
									if (arg0 == 3619) {
										local3888 = aStringArray116[--anInt5030];
										Static168.method2912(local3888);
										return;
									}
									if (arg0 == 3620) {
										Static212.method3432();
										return;
									}
									if (arg0 == 3621) {
										if (Static147.anInt3266 == 0) {
											anIntArray391[anInt5038++] = -1;
											return;
										}
										anIntArray391[anInt5038++] = Static363.anInt6512;
										return;
									}
									if (arg0 == 3622) {
										local13 = anIntArray391[--anInt5038];
										if (Static147.anInt3266 != 0 && local13 < Static363.anInt6512) {
											aStringArray116[anInt5030++] = Static169.aStringArray76[local13];
											if (Static352.aStringArray127[local13] != null) {
												aStringArray116[anInt5030++] = Static352.aStringArray127[local13];
												return;
											}
											aStringArray116[anInt5030++] = "";
											return;
										}
										aStringArray116[anInt5030++] = "";
										aStringArray116[anInt5030++] = "";
										return;
									}
									if (arg0 == 3623) {
										local3888 = aStringArray116[--anInt5030];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray391[anInt5038++] = Static55.method1113(local3888) ? 1 : 0;
										return;
									}
									if (arg0 == 3624) {
										local13 = anIntArray391[--anInt5038];
										if (Static65.aClass26Array2 != null && local13 < Static154.anInt3337 && Static65.aClass26Array2[local13].aString7.equalsIgnoreCase(Static113.aClass1_Sub3_Sub3_Sub1_4.aString47)) {
											anIntArray391[anInt5038++] = 1;
											return;
										}
										anIntArray391[anInt5038++] = 0;
										return;
									}
									if (arg0 == 3625) {
										if (Static127.aString24 != null) {
											aStringArray116[anInt5030++] = Static127.aString24;
											return;
										}
										aStringArray116[anInt5030++] = "";
										return;
									}
									if (arg0 == 3626) {
										local13 = anIntArray391[--anInt5038];
										if (Static289.aString53 != null && local13 < Static154.anInt3337) {
											aStringArray116[anInt5030++] = Static65.aClass26Array2[local13].aString8;
											return;
										}
										aStringArray116[anInt5030++] = "";
										return;
									}
									if (arg0 == 3627) {
										local13 = anIntArray391[--anInt5038];
										if (Static147.anInt3266 == 2 && local13 >= 0 && local13 < Static317.anInt5757) {
											anIntArray391[anInt5038++] = Static430.aBooleanArray25[local13] ? 1 : 0;
											return;
										}
										anIntArray391[anInt5038++] = 0;
										return;
									}
									if (arg0 == 3628) {
										local3888 = aStringArray116[--anInt5030];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray391[anInt5038++] = Static364.method5136(local3888);
										return;
									}
									if (arg0 == 3629) {
										anIntArray391[anInt5038++] = Static368.anInt6561;
										return;
									}
									if (arg0 == 3630) {
										local3888 = aStringArray116[--anInt5030];
										Static399.method5376(local3888, true);
										return;
									}
									if (arg0 == 3631) {
										local13 = anIntArray391[--anInt5038];
										anIntArray391[anInt5038++] = Static400.aBooleanArray22[local13] ? 1 : 0;
										return;
									}
									if (arg0 == 3632) {
										local13 = anIntArray391[--anInt5038];
										if (Static289.aString53 != null && local13 < Static154.anInt3337) {
											aStringArray116[anInt5030++] = Static65.aClass26Array2[local13].aString7;
											return;
										}
										aStringArray116[anInt5030++] = "";
										return;
									}
									if (arg0 == 3633) {
										local13 = anIntArray391[--anInt5038];
										if (Static147.anInt3266 != 0 && local13 < Static363.anInt6512) {
											aStringArray116[anInt5030++] = Static422.aStringArray169[local13];
											return;
										}
										aStringArray116[anInt5030++] = "";
										return;
									}
								} else if (arg0 < 4000) {
									if (arg0 == 3903) {
										local13 = anIntArray391[--anInt5038];
										anIntArray391[anInt5038++] = Static131.aClass205Array1[local13].method5117();
										return;
									}
									if (arg0 == 3904) {
										local13 = anIntArray391[--anInt5038];
										anIntArray391[anInt5038++] = Static131.aClass205Array1[local13].anInt6497;
										return;
									}
									if (arg0 == 3905) {
										local13 = anIntArray391[--anInt5038];
										anIntArray391[anInt5038++] = Static131.aClass205Array1[local13].anInt6490;
										return;
									}
									if (arg0 == 3906) {
										local13 = anIntArray391[--anInt5038];
										anIntArray391[anInt5038++] = Static131.aClass205Array1[local13].anInt6494;
										return;
									}
									if (arg0 == 3907) {
										local13 = anIntArray391[--anInt5038];
										anIntArray391[anInt5038++] = Static131.aClass205Array1[local13].anInt6496;
										return;
									}
									if (arg0 == 3908) {
										local13 = anIntArray391[--anInt5038];
										anIntArray391[anInt5038++] = Static131.aClass205Array1[local13].anInt6493;
										return;
									}
									if (arg0 == 3910) {
										local13 = anIntArray391[--anInt5038];
										local19 = Static131.aClass205Array1[local13].method5116();
										anIntArray391[anInt5038++] = local19 == 0 ? 1 : 0;
										return;
									}
									if (arg0 == 3911) {
										local13 = anIntArray391[--anInt5038];
										local19 = Static131.aClass205Array1[local13].method5116();
										anIntArray391[anInt5038++] = local19 == 2 ? 1 : 0;
										return;
									}
									if (arg0 == 3912) {
										local13 = anIntArray391[--anInt5038];
										local19 = Static131.aClass205Array1[local13].method5116();
										anIntArray391[anInt5038++] = local19 == 5 ? 1 : 0;
										return;
									}
									if (arg0 == 3913) {
										local13 = anIntArray391[--anInt5038];
										local19 = Static131.aClass205Array1[local13].method5116();
										anIntArray391[anInt5038++] = local19 == 1 ? 1 : 0;
										return;
									}
								} else if (arg0 < 4100) {
									if (arg0 == 4000) {
										anInt5038 -= 2;
										local13 = anIntArray391[anInt5038];
										local19 = anIntArray391[anInt5038 + 1];
										anIntArray391[anInt5038++] = local13 + local19;
										return;
									}
									if (arg0 == 4001) {
										anInt5038 -= 2;
										local13 = anIntArray391[anInt5038];
										local19 = anIntArray391[anInt5038 + 1];
										anIntArray391[anInt5038++] = local13 - local19;
										return;
									}
									if (arg0 == 4002) {
										anInt5038 -= 2;
										local13 = anIntArray391[anInt5038];
										local19 = anIntArray391[anInt5038 + 1];
										anIntArray391[anInt5038++] = local13 * local19;
										return;
									}
									if (arg0 == 4003) {
										anInt5038 -= 2;
										local13 = anIntArray391[anInt5038];
										local19 = anIntArray391[anInt5038 + 1];
										anIntArray391[anInt5038++] = local13 / local19;
										return;
									}
									if (arg0 == 4004) {
										local13 = anIntArray391[--anInt5038];
										anIntArray391[anInt5038++] = (int) (Math.random() * (double) local13);
										return;
									}
									if (arg0 == 4005) {
										local13 = anIntArray391[--anInt5038];
										anIntArray391[anInt5038++] = (int) (Math.random() * (double) (local13 + 1));
										return;
									}
									if (arg0 == 4006) {
										anInt5038 -= 5;
										local13 = anIntArray391[anInt5038];
										local19 = anIntArray391[anInt5038 + 1];
										local25 = anIntArray391[anInt5038 + 2];
										local353 = anIntArray391[anInt5038 + 3];
										local2290 = anIntArray391[anInt5038 + 4];
										anIntArray391[anInt5038++] = local13 + (local19 - local13) * (local2290 - local25) / (local353 - local25);
										return;
									}
									@Pc(6960) long local6960;
									@Pc(6953) long local6953;
									if (arg0 == 4007) {
										anInt5038 -= 2;
										local6953 = anIntArray391[anInt5038];
										local6960 = anIntArray391[anInt5038 + 1];
										anIntArray391[anInt5038++] = (int) (local6953 + local6953 * local6960 / 100L);
										return;
									}
									if (arg0 == 4008) {
										anInt5038 -= 2;
										local13 = anIntArray391[anInt5038];
										local19 = anIntArray391[anInt5038 + 1];
										anIntArray391[anInt5038++] = local13 | 0x1 << local19;
										return;
									}
									if (arg0 == 4009) {
										anInt5038 -= 2;
										local13 = anIntArray391[anInt5038];
										local19 = anIntArray391[anInt5038 + 1];
										anIntArray391[anInt5038++] = local13 & -(0x1 << local19) - 1;
										return;
									}
									if (arg0 == 4010) {
										anInt5038 -= 2;
										local13 = anIntArray391[anInt5038];
										local19 = anIntArray391[anInt5038 + 1];
										anIntArray391[anInt5038++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
										return;
									}
									if (arg0 == 4011) {
										anInt5038 -= 2;
										local13 = anIntArray391[anInt5038];
										local19 = anIntArray391[anInt5038 + 1];
										anIntArray391[anInt5038++] = local13 % local19;
										return;
									}
									if (arg0 == 4012) {
										anInt5038 -= 2;
										local13 = anIntArray391[anInt5038];
										local19 = anIntArray391[anInt5038 + 1];
										if (local13 == 0) {
											anIntArray391[anInt5038++] = 0;
											return;
										}
										anIntArray391[anInt5038++] = (int) Math.pow((double) local13, (double) local19);
										return;
									}
									if (arg0 == 4013) {
										anInt5038 -= 2;
										local13 = anIntArray391[anInt5038];
										local19 = anIntArray391[anInt5038 + 1];
										if (local13 == 0) {
											anIntArray391[anInt5038++] = 0;
											return;
										}
										if (local19 == 0) {
											anIntArray391[anInt5038++] = Integer.MAX_VALUE;
											return;
										}
										anIntArray391[anInt5038++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
										return;
									}
									if (arg0 == 4014) {
										anInt5038 -= 2;
										local13 = anIntArray391[anInt5038];
										local19 = anIntArray391[anInt5038 + 1];
										anIntArray391[anInt5038++] = local13 & local19;
										return;
									}
									if (arg0 == 4015) {
										anInt5038 -= 2;
										local13 = anIntArray391[anInt5038];
										local19 = anIntArray391[anInt5038 + 1];
										anIntArray391[anInt5038++] = local13 | local19;
										return;
									}
									if (arg0 == 4016) {
										anInt5038 -= 2;
										local13 = anIntArray391[anInt5038];
										local19 = anIntArray391[anInt5038 + 1];
										anIntArray391[anInt5038++] = local13 < local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4017) {
										anInt5038 -= 2;
										local13 = anIntArray391[anInt5038];
										local19 = anIntArray391[anInt5038 + 1];
										anIntArray391[anInt5038++] = local13 > local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4018) {
										anInt5038 -= 3;
										local6953 = anIntArray391[anInt5038];
										local6960 = anIntArray391[anInt5038 + 1];
										@Pc(7341) long local7341 = (long) anIntArray391[anInt5038 + 2];
										anIntArray391[anInt5038++] = (int) (local6953 * local7341 / local6960);
										return;
									}
								} else if (arg0 < 4200) {
									if (arg0 == 4100) {
										local3888 = aStringArray116[--anInt5030];
										local19 = anIntArray391[--anInt5038];
										aStringArray116[anInt5030++] = local3888 + local19;
										return;
									}
									if (arg0 == 4101) {
										anInt5030 -= 2;
										local3888 = aStringArray116[anInt5030];
										local1101 = aStringArray116[anInt5030 + 1];
										aStringArray116[anInt5030++] = local3888 + local1101;
										return;
									}
									if (arg0 == 4102) {
										local3888 = aStringArray116[--anInt5030];
										local19 = anIntArray391[--anInt5038];
										aStringArray116[anInt5030++] = local3888 + Static8.method199(local19);
										return;
									}
									if (arg0 == 4103) {
										local3888 = aStringArray116[--anInt5030];
										aStringArray116[anInt5030++] = local3888.toLowerCase();
										return;
									}
									if (arg0 == 4104) {
										aStringArray116[anInt5030++] = method4050(anIntArray391[--anInt5038]);
										return;
									}
									if (arg0 == 4105) {
										anInt5030 -= 2;
										local3888 = aStringArray116[anInt5030];
										local1101 = aStringArray116[anInt5030 + 1];
										if (Static113.aClass1_Sub3_Sub3_Sub1_4.aClass8_1 != null && Static113.aClass1_Sub3_Sub3_Sub1_4.aClass8_1.aBoolean15) {
											aStringArray116[anInt5030++] = local1101;
											return;
										}
										aStringArray116[anInt5030++] = local3888;
										return;
									}
									if (arg0 == 4106) {
										local13 = anIntArray391[--anInt5038];
										aStringArray116[anInt5030++] = Integer.toString(local13);
										return;
									}
									if (arg0 == 4107) {
										anInt5030 -= 2;
										anIntArray391[anInt5038++] = Static441.method5894(aStringArray116[anInt5030 + 1], Static216.anInt4257, aStringArray116[anInt5030]);
										return;
									}
									@Pc(7624) Class179 local7624;
									if (arg0 == 4108) {
										local3888 = aStringArray116[--anInt5030];
										anInt5038 -= 2;
										local19 = anIntArray391[anInt5038];
										local25 = anIntArray391[anInt5038 + 1];
										local7624 = Static334.method4856(Static420.aClass56_87, local25);
										anIntArray391[anInt5038++] = local7624.method4389(local3888, Static240.aClass22Array17, local19);
										return;
									}
									if (arg0 == 4109) {
										local3888 = aStringArray116[--anInt5030];
										anInt5038 -= 2;
										local19 = anIntArray391[anInt5038];
										local25 = anIntArray391[anInt5038 + 1];
										local7624 = Static334.method4856(Static420.aClass56_87, local25);
										anIntArray391[anInt5038++] = local7624.method4392(local19, local3888, Static240.aClass22Array17);
										return;
									}
									if (arg0 == 4110) {
										anInt5030 -= 2;
										local3888 = aStringArray116[anInt5030];
										local1101 = aStringArray116[anInt5030 + 1];
										if (anIntArray391[--anInt5038] == 1) {
											aStringArray116[anInt5030++] = local3888;
											return;
										}
										aStringArray116[anInt5030++] = local1101;
										return;
									}
									if (arg0 == 4111) {
										local3888 = aStringArray116[--anInt5030];
										aStringArray116[anInt5030++] = Static80.method1411(local3888);
										return;
									}
									if (arg0 == 4112) {
										local3888 = aStringArray116[--anInt5030];
										local19 = anIntArray391[--anInt5038];
										if (local19 == -1) {
											throw new RuntimeException("null char");
										}
										aStringArray116[anInt5030++] = local3888 + (char) local19;
										return;
									}
									if (arg0 == 4113) {
										local13 = anIntArray391[--anInt5038];
										anIntArray391[anInt5038++] = Static166.method2897((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4114) {
										local13 = anIntArray391[--anInt5038];
										anIntArray391[anInt5038++] = Static353.method5000((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4115) {
										local13 = anIntArray391[--anInt5038];
										anIntArray391[anInt5038++] = Static398.method5368((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4116) {
										local13 = anIntArray391[--anInt5038];
										anIntArray391[anInt5038++] = Static100.method1742((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4117) {
										local3888 = aStringArray116[--anInt5030];
										if (local3888 != null) {
											anIntArray391[anInt5038++] = local3888.length();
											return;
										}
										anIntArray391[anInt5038++] = 0;
										return;
									}
									if (arg0 == 4118) {
										local3888 = aStringArray116[--anInt5030];
										anInt5038 -= 2;
										local19 = anIntArray391[anInt5038];
										local25 = anIntArray391[anInt5038 + 1];
										aStringArray116[anInt5030++] = local3888.substring(local19, local25);
										return;
									}
									if (arg0 == 4119) {
										local3888 = aStringArray116[--anInt5030];
										@Pc(7987) StringBuffer local7987 = new StringBuffer(local3888.length());
										@Pc(7989) boolean local7989 = false;
										for (local353 = 0; local353 < local3888.length(); local353++) {
											@Pc(7996) char local7996 = local3888.charAt(local353);
											if (local7996 == '<') {
												local7989 = true;
											} else if (local7996 == '>') {
												local7989 = false;
											} else if (!local7989) {
												local7987.append(local7996);
											}
										}
										aStringArray116[anInt5030++] = local7987.toString();
										return;
									}
									if (arg0 == 4120) {
										local3888 = aStringArray116[--anInt5030];
										anInt5038 -= 2;
										local19 = anIntArray391[anInt5038];
										local25 = anIntArray391[anInt5038 + 1];
										anIntArray391[anInt5038++] = local3888.indexOf(local19, local25);
										return;
									}
									if (arg0 == 4121) {
										anInt5030 -= 2;
										local3888 = aStringArray116[anInt5030];
										local1101 = aStringArray116[anInt5030 + 1];
										local25 = anIntArray391[--anInt5038];
										anIntArray391[anInt5038++] = local3888.indexOf(local1101, local25);
										return;
									}
									if (arg0 == 4122) {
										local13 = anIntArray391[--anInt5038];
										anIntArray391[anInt5038++] = Character.toLowerCase((char) local13);
										return;
									}
									if (arg0 == 4123) {
										local13 = anIntArray391[--anInt5038];
										anIntArray391[anInt5038++] = Character.toUpperCase((char) local13);
										return;
									}
									if (arg0 == 4124) {
										local412 = anIntArray391[--anInt5038] != 0;
										local19 = anIntArray391[--anInt5038];
										aStringArray116[anInt5030++] = Static410.method5506((long) local19, 0, local412, Static216.anInt4257);
										return;
									}
									if (arg0 == 4125) {
										local3888 = aStringArray116[--anInt5030];
										local19 = anIntArray391[--anInt5038];
										@Pc(8210) Class179 local8210 = Static334.method4856(Static420.aClass56_87, local19);
										anIntArray391[anInt5038++] = local8210.method4390(Static240.aClass22Array17, local3888);
										return;
									}
								} else if (arg0 < 4300) {
									if (arg0 == 4200) {
										local13 = anIntArray391[--anInt5038];
										aStringArray116[anInt5030++] = Static89.aClass157_1.method3832(local13).aString56;
										return;
									}
									@Pc(8272) Class191 local8272;
									if (arg0 == 4201) {
										anInt5038 -= 2;
										local13 = anIntArray391[anInt5038];
										local19 = anIntArray391[anInt5038 + 1];
										local8272 = Static89.aClass157_1.method3832(local13);
										if (local19 >= 1 && local19 <= 5 && local8272.aStringArray139[local19 - 1] != null) {
											aStringArray116[anInt5030++] = local8272.aStringArray139[local19 - 1];
											return;
										}
										aStringArray116[anInt5030++] = "";
										return;
									}
									if (arg0 == 4202) {
										anInt5038 -= 2;
										local13 = anIntArray391[anInt5038];
										local19 = anIntArray391[anInt5038 + 1];
										local8272 = Static89.aClass157_1.method3832(local13);
										if (local19 >= 1 && local19 <= 5 && local8272.aStringArray140[local19 - 1] != null) {
											aStringArray116[anInt5030++] = local8272.aStringArray140[local19 - 1];
											return;
										}
										aStringArray116[anInt5030++] = "";
										return;
									}
									if (arg0 == 4203) {
										local13 = anIntArray391[--anInt5038];
										anIntArray391[anInt5038++] = Static89.aClass157_1.method3832(local13).anInt5805;
										return;
									}
									if (arg0 == 4204) {
										local13 = anIntArray391[--anInt5038];
										anIntArray391[anInt5038++] = Static89.aClass157_1.method3832(local13).anInt5837 == 1 ? 1 : 0;
										return;
									}
									@Pc(8435) Class191 local8435;
									if (arg0 == 4205) {
										local13 = anIntArray391[--anInt5038];
										local8435 = Static89.aClass157_1.method3832(local13);
										if (local8435.anInt5832 == -1 && local8435.anInt5817 >= 0) {
											anIntArray391[anInt5038++] = local8435.anInt5817;
											return;
										}
										anIntArray391[anInt5038++] = local13;
										return;
									}
									if (arg0 == 4206) {
										local13 = anIntArray391[--anInt5038];
										local8435 = Static89.aClass157_1.method3832(local13);
										if (local8435.anInt5832 >= 0 && local8435.anInt5817 >= 0) {
											anIntArray391[anInt5038++] = local8435.anInt5817;
											return;
										}
										anIntArray391[anInt5038++] = local13;
										return;
									}
									if (arg0 == 4207) {
										local13 = anIntArray391[--anInt5038];
										anIntArray391[anInt5038++] = Static89.aClass157_1.method3832(local13).aBoolean416 ? 1 : 0;
										return;
									}
									if (arg0 == 4208) {
										anInt5038 -= 2;
										local13 = anIntArray391[anInt5038];
										local19 = anIntArray391[anInt5038 + 1];
										local3017 = Static294.aClass69_2.method1740(local19);
										if (local3017.method5455()) {
											aStringArray116[anInt5030++] = Static89.aClass157_1.method3832(local13).method4673(local19, local3017.aString63);
											return;
										}
										anIntArray391[anInt5038++] = Static89.aClass157_1.method3832(local13).method4662(local3017.anInt7023, local19);
										return;
									}
									if (arg0 == 4209) {
										anInt5038 -= 2;
										local13 = anIntArray391[anInt5038];
										local19 = anIntArray391[anInt5038 + 1] - 1;
										local8272 = Static89.aClass157_1.method3832(local13);
										if (local8272.anInt5854 == local19) {
											anIntArray391[anInt5038++] = local8272.anInt5857;
											return;
										}
										if (local8272.anInt5853 == local19) {
											anIntArray391[anInt5038++] = local8272.anInt5858;
											return;
										}
										anIntArray391[anInt5038++] = -1;
										return;
									}
									if (arg0 == 4210) {
										local3888 = aStringArray116[--anInt5030];
										local19 = anIntArray391[--anInt5038];
										Static15.method467(local19 == 1, local3888);
										anIntArray391[anInt5038++] = Static301.anInt5506;
										return;
									}
									if (arg0 == 4211) {
										if (Static72.aShortArray39 != null && Static425.anInt7285 < Static301.anInt5506) {
											anIntArray391[anInt5038++] = Static72.aShortArray39[Static425.anInt7285++] & 0xFFFF;
											return;
										}
										anIntArray391[anInt5038++] = -1;
										return;
									}
									if (arg0 == 4212) {
										Static425.anInt7285 = 0;
										return;
									}
								} else if (arg0 < 4400) {
									if (arg0 == 4300) {
										anInt5038 -= 2;
										local13 = anIntArray391[anInt5038];
										local19 = anIntArray391[anInt5038 + 1];
										local3017 = Static294.aClass69_2.method1740(local19);
										if (local3017.method5455()) {
											aStringArray116[anInt5030++] = Static154.aClass251_2.method5684(local13).method1301(local19, local3017.aString63);
											return;
										}
										anIntArray391[anInt5038++] = Static154.aClass251_2.method5684(local13).method1299(local3017.anInt7023, local19);
										return;
									}
								} else if (arg0 < 4500) {
									if (arg0 == 4400) {
										anInt5038 -= 2;
										local13 = anIntArray391[anInt5038];
										local19 = anIntArray391[anInt5038 + 1];
										local3017 = Static294.aClass69_2.method1740(local19);
										if (local3017.method5455()) {
											aStringArray116[anInt5030++] = Static55.aClass25_1.method855(local13).method3306(local3017.aString63, local19);
											return;
										}
										anIntArray391[anInt5038++] = Static55.aClass25_1.method855(local13).method3312(local19, local3017.anInt7023);
										return;
									}
								} else if (arg0 < 4600) {
									if (arg0 == 4500) {
										anInt5038 -= 2;
										local13 = anIntArray391[anInt5038];
										local19 = anIntArray391[anInt5038 + 1];
										local3017 = Static294.aClass69_2.method1740(local19);
										if (local3017.method5455()) {
											aStringArray116[anInt5030++] = Static30.aClass254_1.method5748(local13).method2964(local3017.aString63, local19);
											return;
										}
										anIntArray391[anInt5038++] = Static30.aClass254_1.method5748(local13).method2965(local19, local3017.anInt7023);
										return;
									}
								} else if (arg0 < 4700 && arg0 == 4600) {
									local13 = anIntArray391[--anInt5038];
									@Pc(8936) Class137 local8936 = Static427.aClass237_1.method5479(local13);
									if (local8936.anIntArray318 != null && local8936.anIntArray318.length > 0) {
										local25 = 0;
										local353 = local8936.anIntArray317[0];
										for (local2290 = 1; local2290 < local8936.anIntArray318.length; local2290++) {
											if (local8936.anIntArray317[local2290] > local353) {
												local25 = local2290;
												local353 = local8936.anIntArray317[local2290];
											}
										}
										anIntArray391[anInt5038++] = local8936.anIntArray318[local25];
										return;
									}
									anIntArray391[anInt5038++] = local8936.anInt4224;
									return;
								}
							}
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static321.method4661(anIntArray391[--anInt5038]);
					} else {
						local137 = arg1 ? aClass68_9 : aClass68_8;
					}
					Static442.method5899(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt5038 -= 2;
						local19 = anIntArray391[anInt5038];
						local25 = anIntArray391[anInt5038 + 1];
						if (local137.anInt2187 == -1) {
							Static7.method160(local137.anInt2177);
							Static412.method5539(local137.anInt2177);
							Static420.method5629(local137.anInt2177);
						}
						if (local19 == -1) {
							local137.anInt2173 = 1;
							local137.anInt2146 = -1;
							local137.anInt2192 = -1;
							return;
						}
						local137.anInt2192 = local19;
						local137.anInt2186 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean170 = true;
						} else {
							local137.aBoolean170 = false;
						}
						@Pc(1630) Class191 local1630 = Static89.aClass157_1.method3832(local19);
						local137.anInt2141 = local1630.anInt5821;
						local137.anInt2195 = local1630.anInt5823;
						local137.anInt2198 = local1630.anInt5834;
						local137.anInt2208 = local1630.anInt5816;
						local137.anInt2142 = local1630.anInt5802;
						local137.anInt2191 = local1630.lb;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt2149 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt2149 = 1;
						} else {
							local137.anInt2149 = 2;
						}
						if (local137.anInt2209 > 0) {
							local137.anInt2191 = local137.anInt2191 * 32 / local137.anInt2209;
							return;
						}
						if (local137.anInt2157 > 0) {
							local137.anInt2191 = local137.anInt2191 * 32 / local137.anInt2157;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt2173 = 2;
						local137.anInt2146 = anIntArray391[--anInt5038];
						if (local137.anInt2187 == -1) {
							Static292.method4288(local137.anInt2177);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt2173 = 3;
						local137.anInt2146 = -1;
						if (local137.anInt2187 == -1) {
							Static292.method4288(local137.anInt2177);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt2173 = 6;
						local137.anInt2146 = anIntArray391[--anInt5038];
						if (local137.anInt2187 == -1) {
							Static292.method4288(local137.anInt2177);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt2173 = 5;
						local137.anInt2146 = anIntArray391[--anInt5038];
						if (local137.anInt2187 == -1) {
							Static292.method4288(local137.anInt2177);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt5038 -= 4;
						local137.anInt2154 = anIntArray391[anInt5038];
						local137.anInt2184 = anIntArray391[anInt5038 + 1];
						local137.anInt2168 = anIntArray391[anInt5038 + 2];
						local137.anInt2164 = anIntArray391[anInt5038 + 3];
						Static442.method5899(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt5038 -= 2;
						local137.anInt2204 = anIntArray391[anInt5038];
						local137.anInt2202 = anIntArray391[anInt5038 + 1];
						Static442.method5899(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt5038 -= 4;
						local137.anInt2146 = anIntArray391[anInt5038];
						local137.anInt2190 = anIntArray391[anInt5038 + 1];
						if (anIntArray391[anInt5038 + 2] == 1) {
							local137.anInt2173 = 9;
						} else {
							local137.anInt2173 = 8;
						}
						if (anIntArray391[anInt5038 + 3] == 1) {
							local137.aBoolean170 = true;
						} else {
							local137.aBoolean170 = false;
						}
						if (local137.anInt2187 == -1) {
							Static292.method4288(local137.anInt2177);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt2173 = 5;
						local137.anInt2146 = Static177.anInt3617;
						local137.anInt2190 = 0;
						if (local137.anInt2187 == -1) {
							Static292.method4288(local137.anInt2177);
						}
						return;
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static321.method4661(anIntArray391[--anInt5038]);
				} else {
					local137 = arg1 ? aClass68_9 : aClass68_8;
				}
				if (arg0 == 1000) {
					anInt5038 -= 4;
					local137.anInt2188 = anIntArray391[anInt5038];
					local137.anInt2185 = anIntArray391[anInt5038 + 1];
					local19 = anIntArray391[anInt5038 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray391[anInt5038 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte37 = (byte) local19;
					local137.aByte36 = (byte) local25;
					Static442.method5899(local137);
					Static448.method5930(local137);
					if (local137.anInt2187 == -1) {
						Static156.method2728(local137.anInt2177);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt5038 -= 4;
					local137.anInt2157 = anIntArray391[anInt5038];
					local137.anInt2200 = anIntArray391[anInt5038 + 1];
					local137.anInt2209 = 0;
					local137.anInt2183 = 0;
					local19 = anIntArray391[anInt5038 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray391[anInt5038 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte35 = (byte) local19;
					local137.aByte38 = (byte) local25;
					Static442.method5899(local137);
					Static448.method5930(local137);
					if (local137.anInt2182 == 0) {
						Static446.method5923(false, local137);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(620) boolean local620 = anIntArray391[--anInt5038] == 1;
					if (local137.aBoolean167 != local620) {
						local137.aBoolean167 = local620;
						Static442.method5899(local137);
					}
					if (local137.anInt2187 == -1) {
						Static351.method4987(local137.anInt2177);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt5038 -= 2;
					local137.anInt2203 = anIntArray391[anInt5038];
					local137.anInt2199 = anIntArray391[anInt5038 + 1];
					Static442.method5899(local137);
					Static448.method5930(local137);
					if (local137.anInt2182 == 0) {
						Static446.method5923(false, local137);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean181 = anIntArray391[--anInt5038] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "(IZ)V")
	private static void method4042(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(157) int local157;
		@Pc(1313) boolean local1313;
		@Pc(89) int local89;
		@Pc(75) String local75;
		@Pc(192) int local192;
		@Pc(95) int local95;
		@Pc(81) String local81;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray391[anInt5038++] = Static282.anInt5193;
				return;
			}
			if (arg0 == 5001) {
				anInt5038 -= 3;
				Static282.anInt5193 = anIntArray391[anInt5038];
				Static153.aClass215_55 = Static91.method1566(anIntArray391[anInt5038 + 1]);
				if (Static153.aClass215_55 == null) {
					Static153.aClass215_55 = Static369.aClass215_112;
				}
				Static358.anInt5917 = anIntArray391[anInt5038 + 2];
				Static414.method5552(Static256.aClass92_156);
				Static302.aClass3_Sub2_Sub2_2.method6001(Static282.anInt5193);
				Static302.aClass3_Sub2_Sub2_2.method6001(Static153.aClass215_55.anInt6609);
				Static302.aClass3_Sub2_Sub2_2.method6001(Static358.anInt5917);
				return;
			}
			if (arg0 == 5002) {
				anInt5030 -= 2;
				local75 = aStringArray116[anInt5030];
				local81 = aStringArray116[anInt5030 + 1];
				anInt5038 -= 2;
				local89 = anIntArray391[anInt5038];
				local95 = anIntArray391[anInt5038 + 1];
				if (local81 == null) {
					local81 = "";
				}
				if (local81.length() > 80) {
					local81 = local81.substring(0, 80);
				}
				Static414.method5552(Static94.aClass92_67);
				Static302.aClass3_Sub2_Sub2_2.method6001(Static442.method5901(local75) + Static442.method5901(local81) + 2);
				Static302.aClass3_Sub2_Sub2_2.method6033(local75);
				Static302.aClass3_Sub2_Sub2_2.method6001(local89 - 1);
				Static302.aClass3_Sub2_Sub2_2.method6001(local95);
				Static302.aClass3_Sub2_Sub2_2.method6033(local81);
				return;
			}
			if (arg0 == 5003) {
				local157 = anIntArray391[--anInt5038];
				local81 = null;
				if (local157 < 100) {
					local81 = Static11.aStringArray7[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray116[anInt5030++] = local81;
				return;
			}
			if (arg0 == 5004) {
				local157 = anIntArray391[--anInt5038];
				local192 = -1;
				if (local157 < 100 && Static11.aStringArray7[local157] != null) {
					local192 = Static318.anIntArray244[local157];
				}
				anIntArray391[anInt5038++] = local192;
				return;
			}
			if (arg0 == 5005) {
				if (Static153.aClass215_55 == null) {
					anIntArray391[anInt5038++] = -1;
					return;
				}
				anIntArray391[anInt5038++] = Static153.aClass215_55.anInt6609;
				return;
			}
			if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
				local75 = aStringArray116[--anInt5030];
				method4051(local75, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt5030 -= 2;
				local75 = aStringArray116[anInt5030];
				local81 = aStringArray116[anInt5030 + 1];
				if (Static199.anInt3933 != 0 || (!Static269.aBoolean373 || Static268.aBoolean372) && !Static413.aBoolean307) {
					Static414.method5552(Static7.aClass92_7);
					Static302.aClass3_Sub2_Sub2_2.method6001(0);
					local89 = Static302.aClass3_Sub2_Sub2_2.anInt7620;
					Static302.aClass3_Sub2_Sub2_2.method6033(local75);
					Static305.method4505(local81, Static302.aClass3_Sub2_Sub2_2);
					Static302.aClass3_Sub2_Sub2_2.method5993(Static302.aClass3_Sub2_Sub2_2.anInt7620 - local89);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local157 = anIntArray391[--anInt5038];
				local81 = null;
				if (local157 < 100) {
					local81 = Static83.aStringArray38[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray116[anInt5030++] = local81;
				return;
			}
			if (arg0 == 5011) {
				local157 = anIntArray391[--anInt5038];
				local81 = null;
				if (local157 < 100) {
					local81 = Static140.aStringArray65[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray116[anInt5030++] = local81;
				return;
			}
			if (arg0 == 5012) {
				local157 = anIntArray391[--anInt5038];
				local192 = -1;
				if (local157 < 100) {
					local192 = Static393.anIntArray488[local157];
				}
				anIntArray391[anInt5038++] = local192;
				return;
			}
			if (arg0 == 5015) {
				if (Static113.aClass1_Sub3_Sub3_Sub1_4 == null || Static113.aClass1_Sub3_Sub3_Sub1_4.aString48 == null) {
					local75 = Static230.aString42;
				} else {
					local75 = Static113.aClass1_Sub3_Sub3_Sub1_4.method3930();
				}
				aStringArray116[anInt5030++] = local75;
				return;
			}
			if (arg0 == 5016) {
				anIntArray391[anInt5038++] = Static358.anInt5917;
				return;
			}
			if (arg0 == 5017) {
				anIntArray391[anInt5038++] = Static52.anInt1256;
				return;
			}
			if (arg0 == 5018) {
				local157 = anIntArray391[--anInt5038];
				local192 = 0;
				if (local157 < 100 && Static11.aStringArray7[local157] != null) {
					local192 = Static318.anIntArray244[local157];
				}
				anIntArray391[anInt5038++] = local192;
				return;
			}
			if (arg0 == 5019) {
				local157 = anIntArray391[--anInt5038];
				local81 = null;
				if (local157 < 100) {
					local81 = Static71.aStringArray37[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray116[anInt5030++] = local81;
				return;
			}
			if (arg0 == 5020) {
				if (Static113.aClass1_Sub3_Sub3_Sub1_4 == null || Static113.aClass1_Sub3_Sub3_Sub1_4.aString48 == null) {
					local75 = Static230.aString42;
				} else {
					local75 = Static113.aClass1_Sub3_Sub3_Sub1_4.method3935();
				}
				aStringArray116[anInt5030++] = local75;
				return;
			}
			if (arg0 == 5050) {
				local157 = anIntArray391[--anInt5038];
				aStringArray116[anInt5030++] = Static430.aClass59_1.method1410(local157).aString51;
				return;
			}
			@Pc(589) Class3_Sub3_Sub15 local589;
			if (arg0 == 5051) {
				local157 = anIntArray391[--anInt5038];
				local589 = Static430.aClass59_1.method1410(local157);
				if (local589.anIntArray389 == null) {
					anIntArray391[anInt5038++] = 0;
					return;
				}
				anIntArray391[anInt5038++] = local589.anIntArray389.length;
				return;
			}
			if (arg0 == 5052) {
				anInt5038 -= 2;
				local157 = anIntArray391[anInt5038];
				local192 = anIntArray391[anInt5038 + 1];
				@Pc(634) Class3_Sub3_Sub15 local634 = Static430.aClass59_1.method1410(local157);
				local95 = local634.anIntArray389[local192];
				anIntArray391[anInt5038++] = local95;
				return;
			}
			if (arg0 == 5053) {
				local157 = anIntArray391[--anInt5038];
				local589 = Static430.aClass59_1.method1410(local157);
				if (local589.anIntArray390 == null) {
					anIntArray391[anInt5038++] = 0;
					return;
				}
				anIntArray391[anInt5038++] = local589.anIntArray390.length;
				return;
			}
			if (arg0 == 5054) {
				anInt5038 -= 2;
				local157 = anIntArray391[anInt5038];
				local192 = anIntArray391[anInt5038 + 1];
				anIntArray391[anInt5038++] = Static430.aClass59_1.method1410(local157).anIntArray390[local192];
				return;
			}
			if (arg0 == 5055) {
				local157 = anIntArray391[--anInt5038];
				aStringArray116[anInt5030++] = Static32.aClass259_1.method5865(local157).method4655();
				return;
			}
			if (arg0 == 5056) {
				local157 = anIntArray391[--anInt5038];
				@Pc(760) Class3_Sub3_Sub18 local760 = Static32.aClass259_1.method5865(local157);
				if (local760.anIntArray430 == null) {
					anIntArray391[anInt5038++] = 0;
					return;
				}
				anIntArray391[anInt5038++] = local760.anIntArray430.length;
				return;
			}
			if (arg0 == 5057) {
				anInt5038 -= 2;
				local157 = anIntArray391[anInt5038];
				local192 = anIntArray391[anInt5038 + 1];
				anIntArray391[anInt5038++] = Static32.aClass259_1.method5865(local157).anIntArray430[local192];
				return;
			}
			if (arg0 == 5058) {
				aClass204_1 = new Class204();
				aClass204_1.anInt6332 = anIntArray391[--anInt5038];
				aClass204_1.aClass3_Sub3_Sub18_1 = Static32.aClass259_1.method5865(aClass204_1.anInt6332);
				aClass204_1.anIntArray459 = new int[aClass204_1.aClass3_Sub3_Sub18_1.method4656()];
				return;
			}
			if (arg0 == 5059) {
				Static414.method5552(Static451.aClass92_254);
				Static302.aClass3_Sub2_Sub2_2.method6001(0);
				local157 = Static302.aClass3_Sub2_Sub2_2.anInt7620;
				Static302.aClass3_Sub2_Sub2_2.method6001(0);
				Static302.aClass3_Sub2_Sub2_2.method6045(aClass204_1.anInt6332);
				aClass204_1.aClass3_Sub3_Sub18_1.method4650(Static302.aClass3_Sub2_Sub2_2, aClass204_1.anIntArray459);
				Static302.aClass3_Sub2_Sub2_2.method5993(Static302.aClass3_Sub2_Sub2_2.anInt7620 - local157);
				return;
			}
			if (arg0 == 5060) {
				local75 = aStringArray116[--anInt5030];
				Static414.method5552(Static356.aClass92_213);
				Static302.aClass3_Sub2_Sub2_2.method6001(0);
				local192 = Static302.aClass3_Sub2_Sub2_2.anInt7620;
				Static302.aClass3_Sub2_Sub2_2.method6033(local75);
				Static302.aClass3_Sub2_Sub2_2.method6045(aClass204_1.anInt6332);
				aClass204_1.aClass3_Sub3_Sub18_1.method4650(Static302.aClass3_Sub2_Sub2_2, aClass204_1.anIntArray459);
				Static302.aClass3_Sub2_Sub2_2.method5993(Static302.aClass3_Sub2_Sub2_2.anInt7620 - local192);
				return;
			}
			if (arg0 == 5061) {
				Static414.method5552(Static451.aClass92_254);
				Static302.aClass3_Sub2_Sub2_2.method6001(0);
				local157 = Static302.aClass3_Sub2_Sub2_2.anInt7620;
				Static302.aClass3_Sub2_Sub2_2.method6001(1);
				Static302.aClass3_Sub2_Sub2_2.method6045(aClass204_1.anInt6332);
				aClass204_1.aClass3_Sub3_Sub18_1.method4650(Static302.aClass3_Sub2_Sub2_2, aClass204_1.anIntArray459);
				Static302.aClass3_Sub2_Sub2_2.method5993(Static302.aClass3_Sub2_Sub2_2.anInt7620 - local157);
				return;
			}
			if (arg0 == 5062) {
				anInt5038 -= 2;
				local157 = anIntArray391[anInt5038];
				local192 = anIntArray391[anInt5038 + 1];
				anIntArray391[anInt5038++] = Static430.aClass59_1.method1410(local157).aCharArray8[local192];
				return;
			}
			if (arg0 == 5063) {
				anInt5038 -= 2;
				local157 = anIntArray391[anInt5038];
				local192 = anIntArray391[anInt5038 + 1];
				anIntArray391[anInt5038++] = Static430.aClass59_1.method1410(local157).aCharArray9[local192];
				return;
			}
			if (arg0 == 5064) {
				anInt5038 -= 2;
				local157 = anIntArray391[anInt5038];
				local192 = anIntArray391[anInt5038 + 1];
				if (local192 == -1) {
					anIntArray391[anInt5038++] = -1;
					return;
				}
				anIntArray391[anInt5038++] = Static430.aClass59_1.method1410(local157).method4026((char) local192);
				return;
			}
			if (arg0 == 5065) {
				anInt5038 -= 2;
				local157 = anIntArray391[anInt5038];
				local192 = anIntArray391[anInt5038 + 1];
				if (local192 == -1) {
					anIntArray391[anInt5038++] = -1;
					return;
				}
				anIntArray391[anInt5038++] = Static430.aClass59_1.method1410(local157).method4023((char) local192);
				return;
			}
			if (arg0 == 5066) {
				local157 = anIntArray391[--anInt5038];
				anIntArray391[anInt5038++] = Static32.aClass259_1.method5865(local157).method4656();
				return;
			}
			if (arg0 == 5067) {
				anInt5038 -= 2;
				local157 = anIntArray391[anInt5038];
				local192 = anIntArray391[anInt5038 + 1];
				local89 = Static32.aClass259_1.method5865(local157).method4654(local192).anInt3754;
				anIntArray391[anInt5038++] = local89;
				return;
			}
			if (arg0 == 5068) {
				anInt5038 -= 2;
				local157 = anIntArray391[anInt5038];
				local192 = anIntArray391[anInt5038 + 1];
				aClass204_1.anIntArray459[local157] = local192;
				return;
			}
			if (arg0 == 5069) {
				anInt5038 -= 2;
				local157 = anIntArray391[anInt5038];
				local192 = anIntArray391[anInt5038 + 1];
				aClass204_1.anIntArray459[local157] = local192;
				return;
			}
			if (arg0 == 5070) {
				anInt5038 -= 3;
				local157 = anIntArray391[anInt5038];
				local192 = anIntArray391[anInt5038 + 1];
				local89 = anIntArray391[anInt5038 + 2];
				@Pc(1265) Class3_Sub3_Sub18 local1265 = Static32.aClass259_1.method5865(local157);
				if (local1265.method4654(local192).anInt3754 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray391[anInt5038++] = local1265.method4649(local89, local192);
				return;
			}
			if (arg0 == 5071) {
				local75 = aStringArray116[--anInt5030];
				local1313 = anIntArray391[--anInt5038] == 1;
				Static59.method1186(local1313, local75);
				anIntArray391[anInt5038++] = Static301.anInt5506;
				return;
			}
			if (arg0 == 5072) {
				if (Static72.aShortArray39 != null && Static425.anInt7285 < Static301.anInt5506) {
					anIntArray391[anInt5038++] = Static72.aShortArray39[Static425.anInt7285++] & 0xFFFF;
					return;
				}
				anIntArray391[anInt5038++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static425.anInt7285 = 0;
				return;
			}
			if (arg0 == 5074) {
				Static414.method5552(Static451.aClass92_254);
				Static302.aClass3_Sub2_Sub2_2.method6001(0);
				local157 = Static302.aClass3_Sub2_Sub2_2.anInt7620;
				Static302.aClass3_Sub2_Sub2_2.method6001(2);
				Static302.aClass3_Sub2_Sub2_2.method6045(aClass204_1.anInt6332);
				aClass204_1.aClass3_Sub3_Sub18_1.method4650(Static302.aClass3_Sub2_Sub2_2, aClass204_1.anIntArray459);
				Static302.aClass3_Sub2_Sub2_2.method5993(Static302.aClass3_Sub2_Sub2_2.anInt7620 - local157);
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static19.aClass16_1.method580(86)) {
					anIntArray391[anInt5038++] = 1;
					return;
				}
				anIntArray391[anInt5038++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static19.aClass16_1.method580(82)) {
					anIntArray391[anInt5038++] = 1;
					return;
				}
				anIntArray391[anInt5038++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static19.aClass16_1.method580(81)) {
					anIntArray391[anInt5038++] = 1;
					return;
				}
				anIntArray391[anInt5038++] = 0;
				return;
			}
		} else {
			@Pc(2691) int local2691;
			@Pc(1965) boolean local1965;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static6.method142(anIntArray391[--anInt5038]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray391[anInt5038++] = Static295.method4317();
					return;
				}
				if (arg0 == 5205) {
					Static345.method4946(anIntArray391[--anInt5038], false, -1, -1);
					return;
				}
				@Pc(1554) Class3_Sub3_Sub5 local1554;
				if (arg0 == 5206) {
					local157 = anIntArray391[--anInt5038];
					local1554 = Static210.method5874(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					if (local1554 == null) {
						anIntArray391[anInt5038++] = -1;
						return;
					}
					anIntArray391[anInt5038++] = local1554.anInt1177;
					return;
				}
				@Pc(1587) Class3_Sub3_Sub5 local1587;
				if (arg0 == 5207) {
					local1587 = Static210.method5873(anIntArray391[--anInt5038]);
					if (local1587 != null && local1587.aString9 != null) {
						aStringArray116[anInt5030++] = local1587.aString9;
						return;
					}
					aStringArray116[anInt5030++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray391[anInt5038++] = Static381.anInt2831;
					anIntArray391[anInt5038++] = Static315.anInt5738;
					return;
				}
				if (arg0 == 5209) {
					anIntArray391[anInt5038++] = Static189.anInt3807 + Static210.anInt7505;
					anIntArray391[anInt5038++] = Static372.anInt1537 + Static210.anInt7496;
					return;
				}
				if (arg0 == 5210) {
					local157 = anIntArray391[--anInt5038];
					local1554 = Static210.method5873(local157);
					if (local1554 == null) {
						anIntArray391[anInt5038++] = 0;
						anIntArray391[anInt5038++] = 0;
						return;
					}
					anIntArray391[anInt5038++] = local1554.anInt1185 >> 14 & 0x3FFF;
					anIntArray391[anInt5038++] = local1554.anInt1185 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local157 = anIntArray391[--anInt5038];
					local1554 = Static210.method5873(local157);
					if (local1554 == null) {
						anIntArray391[anInt5038++] = 0;
						anIntArray391[anInt5038++] = 0;
						return;
					}
					anIntArray391[anInt5038++] = local1554.anInt1178 - local1554.anInt1186;
					anIntArray391[anInt5038++] = local1554.anInt1183 - local1554.anInt1181;
					return;
				}
				@Pc(1777) Class3_Sub8 local1777;
				if (arg0 == 5212) {
					local1777 = Static442.method5902();
					if (local1777 == null) {
						anIntArray391[anInt5038++] = -1;
						anIntArray391[anInt5038++] = -1;
						return;
					}
					anIntArray391[anInt5038++] = local1777.anInt1157;
					local192 = local1777.anInt1152 << 28 | local1777.anInt1153 + Static210.anInt7505 << 14 | local1777.anInt1154 + Static210.anInt7496;
					anIntArray391[anInt5038++] = local192;
					return;
				}
				if (arg0 == 5213) {
					local1777 = Static370.method5162();
					if (local1777 == null) {
						anIntArray391[anInt5038++] = -1;
						anIntArray391[anInt5038++] = -1;
						return;
					}
					anIntArray391[anInt5038++] = local1777.anInt1157;
					local192 = local1777.anInt1152 << 28 | local1777.anInt1153 + Static210.anInt7505 << 14 | local1777.anInt1154 + Static210.anInt7496;
					anIntArray391[anInt5038++] = local192;
					return;
				}
				@Pc(1925) boolean local1925;
				if (arg0 == 5214) {
					local157 = anIntArray391[--anInt5038];
					local1554 = Static325.method4726();
					if (local1554 != null) {
						local1925 = local1554.method1025(local157 >> 14 & 0x3FFF, local157 >> 28 & 0x3, anIntArray394, local157 & 0x3FFF);
						if (local1925) {
							Static207.method3389(anIntArray394[2], anIntArray394[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt5038 -= 2;
					local157 = anIntArray391[anInt5038];
					local192 = anIntArray391[anInt5038 + 1];
					@Pc(1963) Class248 local1963 = Static210.method5871(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					local1965 = false;
					for (@Pc(1970) Class3_Sub3_Sub5 local1970 = (Class3_Sub3_Sub5) local1963.method5661(); local1970 != null; local1970 = (Class3_Sub3_Sub5) local1963.method5657()) {
						if (local1970.anInt1177 == local192) {
							local1965 = true;
							break;
						}
					}
					if (local1965) {
						anIntArray391[anInt5038++] = 1;
						return;
					}
					anIntArray391[anInt5038++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local157 = anIntArray391[--anInt5038];
					local1554 = Static210.method5873(local157);
					if (local1554 == null) {
						anIntArray391[anInt5038++] = -1;
						return;
					}
					anIntArray391[anInt5038++] = local1554.anInt1184;
					return;
				}
				if (arg0 == 5220) {
					anIntArray391[anInt5038++] = Static281.anInt5171 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local157 = anIntArray391[--anInt5038];
					Static207.method3389(local157 & 0x3FFF, local157 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1587 = Static325.method4726();
					if (local1587 != null) {
						local1313 = local1587.method1024(Static372.anInt1537 + Static210.anInt7496, anIntArray394, Static189.anInt3807 + Static210.anInt7505);
						if (local1313) {
							anIntArray391[anInt5038++] = anIntArray394[1];
							anIntArray391[anInt5038++] = anIntArray394[2];
							return;
						}
						anIntArray391[anInt5038++] = -1;
						anIntArray391[anInt5038++] = -1;
						return;
					}
					anIntArray391[anInt5038++] = -1;
					anIntArray391[anInt5038++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt5038 -= 2;
					local157 = anIntArray391[anInt5038];
					local192 = anIntArray391[anInt5038 + 1];
					Static345.method4946(local157, false, local192 & 0x3FFF, local192 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local157 = anIntArray391[--anInt5038];
					local1554 = Static325.method4726();
					if (local1554 != null) {
						local1925 = local1554.method1025(local157 >> 14 & 0x3FFF, local157 >> 28 & 0x3, anIntArray394, local157 & 0x3FFF);
						if (local1925) {
							anIntArray391[anInt5038++] = anIntArray394[1];
							anIntArray391[anInt5038++] = anIntArray394[2];
							return;
						}
						anIntArray391[anInt5038++] = -1;
						anIntArray391[anInt5038++] = -1;
						return;
					}
					anIntArray391[anInt5038++] = -1;
					anIntArray391[anInt5038++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local157 = anIntArray391[--anInt5038];
					local1554 = Static325.method4726();
					if (local1554 != null) {
						local1925 = local1554.method1024(local157 & 0x3FFF, anIntArray394, local157 >> 14 & 0x3FFF);
						if (local1925) {
							anIntArray391[anInt5038++] = anIntArray394[1];
							anIntArray391[anInt5038++] = anIntArray394[2];
							return;
						}
						anIntArray391[anInt5038++] = -1;
						anIntArray391[anInt5038++] = -1;
						return;
					}
					anIntArray391[anInt5038++] = -1;
					anIntArray391[anInt5038++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static54.method1104(anIntArray391[--anInt5038]);
					return;
				}
				if (arg0 == 5227) {
					anInt5038 -= 2;
					local157 = anIntArray391[anInt5038];
					local192 = anIntArray391[anInt5038 + 1];
					Static345.method4946(local157, true, local192 & 0x3FFF, local192 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Static33.aBoolean86 = anIntArray391[--anInt5038] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray391[anInt5038++] = Static33.aBoolean86 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local157 = anIntArray391[--anInt5038];
					Static132.method2286(local157);
					return;
				}
				@Pc(2483) Class3 local2483;
				if (arg0 == 5231) {
					anInt5038 -= 2;
					local157 = anIntArray391[anInt5038];
					local1313 = anIntArray391[anInt5038 + 1] == 1;
					if (Static179.aClass127_19 != null) {
						local2483 = Static179.aClass127_19.method3246((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method5987();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class3();
							Static179.aClass127_19.method3257((long) local157, local2483);
						}
					}
					return;
				}
				@Pc(2525) Class3 local2525;
				if (arg0 == 5232) {
					local157 = anIntArray391[--anInt5038];
					if (Static179.aClass127_19 != null) {
						local2525 = Static179.aClass127_19.method3246((long) local157);
						anIntArray391[anInt5038++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray391[anInt5038++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt5038 -= 2;
					local157 = anIntArray391[anInt5038];
					local1313 = anIntArray391[anInt5038 + 1] == 1;
					if (Static371.aClass127_30 != null) {
						local2483 = Static371.aClass127_30.method3246((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method5987();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class3();
							Static371.aClass127_30.method3257((long) local157, local2483);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local157 = anIntArray391[--anInt5038];
					if (Static371.aClass127_30 != null) {
						local2525 = Static371.aClass127_30.method3246((long) local157);
						anIntArray391[anInt5038++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray391[anInt5038++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray391[anInt5038++] = Static210.aClass3_Sub3_Sub5_3 == null ? -1 : Static210.aClass3_Sub3_Sub5_3.anInt1177;
					return;
				}
				if (arg0 == 5236) {
					anInt5038 -= 2;
					local157 = anIntArray391[anInt5038];
					local192 = anIntArray391[anInt5038 + 1];
					local89 = local192 >> 14 & 0x3FFF;
					local95 = local192 & 0x3FFF;
					local2691 = Static156.method2726(local157, local89, local95);
					if (local2691 < 0) {
						anIntArray391[anInt5038++] = -1;
						return;
					}
					anIntArray391[anInt5038++] = local2691;
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt5038 -= 2;
					local157 = anIntArray391[anInt5038];
					local192 = anIntArray391[anInt5038 + 1];
					Static383.method5254(local157, 3, false, local192);
					anIntArray391[anInt5038++] = Static342.aFrame2 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static342.aFrame2 != null) {
						Static383.method5254(-1, Static123.aClass21_Sub1_1.anInt878, false, -1);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2769) Class98[] local2769 = Static252.method3856();
					anIntArray391[anInt5038++] = local2769.length;
					return;
				}
				if (arg0 == 5303) {
					local157 = anIntArray391[--anInt5038];
					@Pc(2793) Class98[] local2793 = Static252.method3856();
					anIntArray391[anInt5038++] = local2793[local157].anInt3341;
					anIntArray391[anInt5038++] = local2793[local157].anInt3339;
					return;
				}
				if (arg0 == 5305) {
					local157 = Static123.aClass21_Sub1_1.anInt874;
					local192 = Static123.aClass21_Sub1_1.anInt882;
					local89 = -1;
					@Pc(2830) Class98[] local2830 = Static252.method3856();
					for (local2691 = 0; local2691 < local2830.length; local2691++) {
						@Pc(2837) Class98 local2837 = local2830[local2691];
						if (local2837.anInt3341 == local157 && local2837.anInt3339 == local192) {
							local89 = local2691;
							break;
						}
					}
					anIntArray391[anInt5038++] = local89;
					return;
				}
				if (arg0 == 5306) {
					anIntArray391[anInt5038++] = Static38.method898();
					return;
				}
				if (arg0 == 5307) {
					local157 = anIntArray391[--anInt5038];
					if (local157 >= 1 && local157 <= 2) {
						Static383.method5254(-1, local157, false, -1);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray391[anInt5038++] = Static123.aClass21_Sub1_1.anInt878;
					return;
				}
				if (arg0 == 5309) {
					local157 = anIntArray391[--anInt5038];
					if (local157 >= 1 && local157 <= 2) {
						Static123.aClass21_Sub1_1.anInt878 = local157;
						Static123.aClass21_Sub1_1.method782(Static295.aClass103_5);
						return;
					}
					return;
				}
			} else {
				@Pc(3345) String local3345;
				if (arg0 < 5500) {
					if (arg0 == 5400) {
						anInt5030 -= 2;
						local75 = aStringArray116[anInt5030];
						local81 = aStringArray116[anInt5030 + 1];
						local89 = anIntArray391[--anInt5038];
						Static414.method5552(Static113.aClass92_227);
						Static302.aClass3_Sub2_Sub2_2.method6001(Static442.method5901(local75) + Static442.method5901(local81) + 1);
						Static302.aClass3_Sub2_Sub2_2.method6033(local75);
						Static302.aClass3_Sub2_Sub2_2.method6033(local81);
						Static302.aClass3_Sub2_Sub2_2.method6001(local89);
						return;
					}
					if (arg0 == 5401) {
						anInt5038 -= 2;
						Static368.aShortArray85[anIntArray391[anInt5038]] = (short) Static336.method4872(anIntArray391[anInt5038 + 1]);
						Static89.aClass157_1.method3844();
						Static89.aClass157_1.method3843();
						Static154.aClass251_2.method5687();
						Static357.method5085();
						return;
					}
					if (arg0 == 5405) {
						anInt5038 -= 2;
						local157 = anIntArray391[anInt5038];
						local192 = anIntArray391[anInt5038 + 1];
						if (local157 >= 0 && local157 < 2) {
							Static158.anIntArrayArrayArray10[local157] = new int[local192 << 1][4];
						}
						return;
					}
					if (arg0 == 5406) {
						anInt5038 -= 7;
						local157 = anIntArray391[anInt5038];
						local192 = anIntArray391[anInt5038 + 1] << 1;
						local89 = anIntArray391[anInt5038 + 2];
						local95 = anIntArray391[anInt5038 + 3];
						local2691 = anIntArray391[anInt5038 + 4];
						@Pc(3105) int local3105 = anIntArray391[anInt5038 + 5];
						@Pc(3111) int local3111 = anIntArray391[anInt5038 + 6];
						if (local157 >= 0 && local157 < 2 && Static158.anIntArrayArrayArray10[local157] != null && local192 >= 0 && local192 < Static158.anIntArrayArrayArray10[local157].length) {
							Static158.anIntArrayArrayArray10[local157][local192] = new int[] { (local89 >> 14 & 0x3FFF) << 7, local95, (local89 & 0x3FFF) << 7, local3111 };
							Static158.anIntArrayArrayArray10[local157][local192 + 1] = new int[] { (local2691 >> 14 & 0x3FFF) << 7, local3105, (local2691 & 0x3FFF) << 7 };
						}
						return;
					}
					if (arg0 == 5407) {
						local157 = Static158.anIntArrayArrayArray10[anIntArray391[--anInt5038]].length >> 1;
						anIntArray391[anInt5038++] = local157;
						return;
					}
					if (arg0 == 5411) {
						if (Static342.aFrame2 != null) {
							Static383.method5254(-1, Static123.aClass21_Sub1_1.anInt878, false, -1);
						}
						if (Static225.aFrame1 != null) {
							Static364.method5135();
							System.exit(0);
							return;
						}
						local75 = Static104.aString22 == null ? Static436.method5783() : Static104.aString22;
						Static81.method1418(Static347.anInt6318 == 1, false, Static295.aClass103_5, local75);
						return;
					}
					if (arg0 == 5419) {
						local75 = "";
						if (Static64.aClass190_2 != null) {
							if (Static64.aClass190_2.anObject7 == null) {
								local75 = Static440.method5892(Static64.aClass190_2.anInt5801);
							} else {
								local75 = (String) Static64.aClass190_2.anObject7;
							}
						}
						aStringArray116[anInt5030++] = local75;
						return;
					}
					if (arg0 == 5420) {
						anIntArray391[anInt5038++] = Static162.anInt3462 == 3 ? 1 : 0;
						return;
					}
					if (arg0 == 5421) {
						if (Static342.aFrame2 != null) {
							Static383.method5254(-1, Static123.aClass21_Sub1_1.anInt878, false, -1);
						}
						local75 = aStringArray116[--anInt5030];
						local1313 = anIntArray391[--anInt5038] == 1;
						local3345 = Static436.method5783() + local75;
						Static81.method1418(Static347.anInt6318 == 1, local1313, Static295.aClass103_5, local3345);
						return;
					}
					if (arg0 == 5422) {
						anInt5030 -= 2;
						local75 = aStringArray116[anInt5030];
						local81 = aStringArray116[anInt5030 + 1];
						local89 = anIntArray391[--anInt5038];
						if (local75.length() > 0) {
							if (Static182.aStringArray84 == null) {
								Static182.aStringArray84 = new String[Static95.anIntArray180[Static114.aClass89_2.anInt3213]];
							}
							Static182.aStringArray84[local89] = local75;
						}
						if (local81.length() > 0) {
							if (Static180.aStringArray82 == null) {
								Static180.aStringArray82 = new String[Static95.anIntArray180[Static114.aClass89_2.anInt3213]];
							}
							Static180.aStringArray82[local89] = local81;
						}
						return;
					}
					if (arg0 == 5423) {
						System.out.println(aStringArray116[--anInt5030]);
						return;
					}
					if (arg0 == 5424) {
						anInt5038 -= 11;
						Static246.anInt2398 = anIntArray391[anInt5038];
						Static230.anInt4398 = anIntArray391[anInt5038 + 1];
						Static111.anInt7564 = anIntArray391[anInt5038 + 2];
						Static353.anInt6333 = anIntArray391[anInt5038 + 3];
						Static171.anInt3593 = anIntArray391[anInt5038 + 4];
						Static340.anInt6289 = anIntArray391[anInt5038 + 5];
						Static230.anInt4400 = anIntArray391[anInt5038 + 6];
						Static417.anInt7206 = anIntArray391[anInt5038 + 7];
						Static30.anInt827 = anIntArray391[anInt5038 + 8];
						Static250.anInt4693 = anIntArray391[anInt5038 + 9];
						Static256.anInt4774 = anIntArray391[anInt5038 + 10];
						Static20.aClass56_10.method1365(Static171.anInt3593);
						Static20.aClass56_10.method1365(Static340.anInt6289);
						Static20.aClass56_10.method1365(Static230.anInt4400);
						Static20.aClass56_10.method1365(Static417.anInt7206);
						Static20.aClass56_10.method1365(Static30.anInt827);
						Static252.aClass22_12 = null;
						Static84.aClass22_3 = null;
						Static315.aClass22_16 = null;
						Static433.aClass22_20 = null;
						Static106.aClass22_4 = null;
						Static309.aClass22_15 = null;
						Static233.aClass22_10 = null;
						Static315.aClass22_17 = null;
						Static126.aBoolean275 = true;
						return;
					}
					if (arg0 == 5425) {
						Static356.method5054();
						Static126.aBoolean275 = false;
						return;
					}
					if (arg0 == 5426) {
						anInt5038 -= 2;
						Static287.anInt5247 = anIntArray391[anInt5038];
						Static130.anInt6132 = anIntArray391[anInt5038 + 1];
						return;
					}
					if (arg0 == 5427) {
						anInt5038 -= 2;
						Static80.anInt1720 = anIntArray391[anInt5038 + 1];
						return;
					}
					if (arg0 == 5428) {
						anInt5038 -= 2;
						local157 = anIntArray391[anInt5038];
						local192 = anIntArray391[anInt5038 + 1];
						anIntArray391[anInt5038++] = Static381.method2280(local157, local192) ? 1 : 0;
						return;
					}
					if (arg0 == 5429) {
						Static161.method2808(false, aStringArray116[--anInt5030]);
						return;
					}
					if (arg0 == 5430) {
						try {
							Static462.method4867(Static295.aClass103_5.anApplet1, "accountcreated");
							return;
						} catch (@Pc(3639) Throwable local3639) {
							return;
						}
					}
				} else if (arg0 < 5600) {
					if (arg0 == 5500) {
						anInt5038 -= 4;
						local157 = anIntArray391[anInt5038];
						local192 = anIntArray391[anInt5038 + 1];
						local89 = anIntArray391[anInt5038 + 2];
						local95 = anIntArray391[anInt5038 + 3];
						Static62.method1213(local89, (local157 & 0x3FFF) - Static339.anInt6223, false, (local157 >> 14 & 0x3FFF) - Static108.anInt3458, local95, local192);
						return;
					}
					if (arg0 == 5501) {
						anInt5038 -= 4;
						local157 = anIntArray391[anInt5038];
						local192 = anIntArray391[anInt5038 + 1];
						local89 = anIntArray391[anInt5038 + 2];
						local95 = anIntArray391[anInt5038 + 3];
						Static437.method5857(local192, local95, local89, (local157 & 0x3FFF) - Static339.anInt6223, (local157 >> 14 & 0x3FFF) - Static108.anInt3458);
						return;
					}
					if (arg0 == 5502) {
						anInt5038 -= 6;
						local157 = anIntArray391[anInt5038];
						if (local157 >= 2) {
							throw new RuntimeException();
						}
						Static70.anInt1610 = local157;
						local192 = anIntArray391[anInt5038 + 1];
						if (local192 + 1 >= Static158.anIntArrayArrayArray10[Static70.anInt1610].length >> 1) {
							throw new RuntimeException();
						}
						Static221.anInt4292 = local192;
						Static61.anInt1445 = 0;
						Static128.anInt2705 = anIntArray391[anInt5038 + 2];
						Static183.anInt4105 = anIntArray391[anInt5038 + 3];
						local89 = anIntArray391[anInt5038 + 4];
						if (local89 >= 2) {
							throw new RuntimeException();
						}
						Static447.anInt7550 = local89;
						local95 = anIntArray391[anInt5038 + 5];
						if (local95 + 1 >= Static158.anIntArrayArrayArray10[Static447.anInt7550].length >> 1) {
							throw new RuntimeException();
						}
						Static274.anInt5077 = local95;
						Static107.anInt2382 = 3;
						return;
					}
					if (arg0 == 5503) {
						Static344.method4923();
						return;
					}
					if (arg0 == 5504) {
						anInt5038 -= 2;
						Static134.method2322(anIntArray391[anInt5038 + 1], anIntArray391[anInt5038]);
						return;
					}
					if (arg0 == 5505) {
						anIntArray391[anInt5038++] = (int) Static265.aFloat64 >> 3;
						return;
					}
					if (arg0 == 5506) {
						anIntArray391[anInt5038++] = (int) Static235.aFloat60 >> 3;
						return;
					}
					if (arg0 == 5507) {
						Static441.method5896();
						return;
					}
					if (arg0 == 5508) {
						Static304.method4494();
						return;
					}
					if (arg0 == 5509) {
						Static381.method2284();
						return;
					}
					if (arg0 == 5510) {
						Static21.method591();
						return;
					}
					if (arg0 == 5511) {
						local157 = anIntArray391[--anInt5038];
						local192 = local157 >> 14 & 0x3FFF;
						local89 = local157 & 0x3FFF;
						local192 -= Static108.anInt3458;
						if (local192 < 0) {
							local192 = 0;
						} else if (local192 >= Static399.anInt6923) {
							local192 = Static399.anInt6923;
						}
						local89 -= Static339.anInt6223;
						if (local89 < 0) {
							local89 = 0;
						} else if (local89 >= Static127.anInt2696) {
							local89 = Static127.anInt2696;
						}
						Static222.anInt4311 = (local192 << 7) + 64;
						Static358.anInt5918 = (local89 << 7) + 64;
						Static107.anInt2382 = 4;
						return;
					}
					if (arg0 == 5512) {
						Static347.method4974();
						return;
					}
				} else if (arg0 < 5700) {
					if (arg0 == 5600) {
						anInt5030 -= 2;
						local75 = aStringArray116[anInt5030];
						local81 = aStringArray116[anInt5030 + 1];
						local89 = anIntArray391[--anInt5038];
						if (Static142.anInt3209 != 10) {
							return;
						}
						if (Static151.anInt3305 == 0 && Static108.anInt3455 == 0 && Static284.anInt5211 == 0 && Static100.anInt2238 == 0) {
							Static375.method5178(local81, local75, local89);
							return;
						}
						return;
					}
					if (arg0 == 5601) {
						Static418.method5598();
						return;
					}
					if (arg0 == 5602) {
						if (Static108.anInt3455 == 0) {
							Static287.anInt5252 = -2;
						}
						return;
					}
					if (arg0 == 5603) {
						anInt5038 -= 4;
						if (Static142.anInt3209 != 10) {
							return;
						}
						if (Static151.anInt3305 == 0 && Static108.anInt3455 == 0 && Static284.anInt5211 == 0 && Static100.anInt2238 == 0) {
							Static429.method5679(anIntArray391[anInt5038 + 2], anIntArray391[anInt5038 + 1], anIntArray391[anInt5038 + 3], anIntArray391[anInt5038]);
							return;
						}
						return;
					}
					if (arg0 == 5604) {
						anInt5030--;
						if (Static142.anInt3209 != 10) {
							return;
						}
						if (Static151.anInt3305 == 0 && Static108.anInt3455 == 0 && Static284.anInt5211 == 0 && Static100.anInt2238 == 0) {
							Static259.method3923(Static353.method4997(aStringArray116[anInt5030]));
							return;
						}
						return;
					}
					if (arg0 == 5605) {
						anInt5030 -= 3;
						anInt5038 -= 7;
						if (Static142.anInt3209 != 10) {
							return;
						}
						if (Static151.anInt3305 == 0 && Static108.anInt3455 == 0 && Static284.anInt5211 == 0 && Static100.anInt2238 == 0) {
							Static331.method4559(anIntArray391[anInt5038 + 3], anIntArray391[anInt5038], aStringArray116[anInt5030 + 1], anIntArray391[anInt5038 + 5] == 1, anIntArray391[anInt5038 + 1], anIntArray391[anInt5038 + 6] == 1, Static353.method4997(aStringArray116[anInt5030]), anIntArray391[anInt5038 + 2], aStringArray116[anInt5030 + 2], anIntArray391[anInt5038 + 4] == 1);
							return;
						}
						return;
					}
					if (arg0 == 5606) {
						if (Static284.anInt5211 == 0) {
							Static407.anInt7061 = -2;
						}
						return;
					}
					if (arg0 == 5607) {
						anIntArray391[anInt5038++] = Static287.anInt5252;
						return;
					}
					if (arg0 == 5608) {
						anIntArray391[anInt5038++] = Static220.anInt4289;
						return;
					}
					if (arg0 == 5609) {
						anIntArray391[anInt5038++] = Static407.anInt7061;
						return;
					}
					if (arg0 == 5610) {
						for (local157 = 0; local157 < 5; local157++) {
							aStringArray116[anInt5030++] = Static195.aStringArray87.length > local157 ? Static403.method5452(Static195.aStringArray87[local157]) : "";
						}
						Static195.aStringArray87 = null;
						return;
					}
					if (arg0 == 5611) {
						anIntArray391[anInt5038++] = Static52.anInt1259;
						return;
					}
				} else if (arg0 < 6100) {
					if (arg0 == 6001) {
						local157 = anIntArray391[--anInt5038];
						if (local157 < 1) {
							local157 = 1;
						}
						if (local157 > 4) {
							local157 = 4;
						}
						Static123.aClass21_Sub1_1.anInt864 = local157;
						Static152.method2703();
						Static123.aClass21_Sub1_1.method782(Static295.aClass103_5);
						Static103.aBoolean182 = false;
						return;
					}
					if (arg0 == 6002) {
						Static123.aClass21_Sub1_1.method784(anIntArray391[--anInt5038] == 1);
						Static152.method2703();
						Static42.method929();
						Static123.aClass21_Sub1_1.method782(Static295.aClass103_5);
						Static103.aBoolean182 = false;
						return;
					}
					if (arg0 == 6003) {
						Static123.aClass21_Sub1_1.aBoolean68 = anIntArray391[--anInt5038] == 1;
						Static42.method929();
						Static123.aClass21_Sub1_1.method782(Static295.aClass103_5);
						Static103.aBoolean182 = false;
						return;
					}
					if (arg0 == 6005) {
						Static123.aClass21_Sub1_1.aBoolean65 = anIntArray391[--anInt5038] == 1;
						Static152.method2703();
						Static123.aClass21_Sub1_1.method782(Static295.aClass103_5);
						Static103.aBoolean182 = false;
						return;
					}
					if (arg0 == 6006) {
						Static123.aClass21_Sub1_1.aBoolean70 = anIntArray391[--anInt5038] == 1;
						Static266.aClass75_7.method2592(!Static123.aClass21_Sub1_1.aBoolean70);
						Static123.aClass21_Sub1_1.method782(Static295.aClass103_5);
						Static103.aBoolean182 = false;
						return;
					}
					if (arg0 == 6007) {
						Static123.aClass21_Sub1_1.anInt877 = anIntArray391[--anInt5038];
						Static123.aClass21_Sub1_1.method782(Static295.aClass103_5);
						Static103.aBoolean182 = false;
						return;
					}
					if (arg0 == 6008) {
						Static123.aClass21_Sub1_1.aBoolean79 = anIntArray391[--anInt5038] == 1;
						Static123.aClass21_Sub1_1.method782(Static295.aClass103_5);
						Static103.aBoolean182 = false;
						return;
					}
					if (arg0 == 6009) {
						Static123.aClass21_Sub1_1.aBoolean66 = anIntArray391[--anInt5038] == 1;
						Static152.method2703();
						Static123.aClass21_Sub1_1.method782(Static295.aClass103_5);
						Static103.aBoolean182 = false;
						return;
					}
					if (arg0 == 6010) {
						Static123.aClass21_Sub1_1.aBoolean78 = anIntArray391[--anInt5038] == 1;
						Static123.aClass21_Sub1_1.method782(Static295.aClass103_5);
						Static103.aBoolean182 = false;
						return;
					}
					if (arg0 == 6011) {
						local157 = anIntArray391[--anInt5038];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static123.aClass21_Sub1_1.method778(Static347.anInt6318, local157);
						Static152.method2703();
						Static123.aClass21_Sub1_1.method782(Static295.aClass103_5);
						Static103.aBoolean182 = false;
						return;
					}
					if (arg0 == 6012) {
						Static123.aClass21_Sub1_1.method779(Static347.anInt6318, anIntArray391[--anInt5038] == 1);
						Static337.method4900();
						Static373.method5169();
						Static123.aClass21_Sub1_1.method782(Static295.aClass103_5);
						Static103.aBoolean182 = false;
						return;
					}
					if (arg0 == 6014) {
						Static123.aClass21_Sub1_1.aBoolean73 = anIntArray391[--anInt5038] == 1;
						Static152.method2703();
						Static123.aClass21_Sub1_1.method782(Static295.aClass103_5);
						Static103.aBoolean182 = false;
						return;
					}
					if (arg0 == 6015) {
						Static123.aClass21_Sub1_1.aBoolean76 = anIntArray391[--anInt5038] == 1;
						Static152.method2703();
						Static123.aClass21_Sub1_1.method782(Static295.aClass103_5);
						Static103.aBoolean182 = false;
						return;
					}
					if (arg0 == 6016) {
						local157 = anIntArray391[--anInt5038];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static123.aClass21_Sub1_1.anInt879 = local157;
						Static69.method1302(Static347.anInt6318);
						Static123.aClass21_Sub1_1.method782(Static295.aClass103_5);
						return;
					}
					if (arg0 == 6017) {
						Static123.aClass21_Sub1_1.aBoolean81 = anIntArray391[--anInt5038] == 1;
						Static115.method2110();
						Static123.aClass21_Sub1_1.method782(Static295.aClass103_5);
						Static103.aBoolean182 = false;
						return;
					}
					if (arg0 == 6018) {
						local157 = anIntArray391[--anInt5038];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static123.aClass21_Sub1_1.anInt868 = local157;
						Static123.aClass21_Sub1_1.method782(Static295.aClass103_5);
						Static103.aBoolean182 = false;
						return;
					}
					if (arg0 == 6019) {
						local157 = anIntArray391[--anInt5038];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 255) {
							local157 = 255;
						}
						if (local157 != Static123.aClass21_Sub1_1.anInt871) {
							if (Static123.aClass21_Sub1_1.anInt871 == 0 && Static257.anInt4778 != -1) {
								Static60.method1187(local157, Static160.aClass56_39, Static257.anInt4778);
								Static358.aBoolean419 = false;
							} else if (local157 == 0) {
								Static36.method853();
								Static358.aBoolean419 = false;
							} else {
								Static25.method690(local157);
							}
							Static123.aClass21_Sub1_1.anInt871 = local157;
						}
						Static123.aClass21_Sub1_1.method782(Static295.aClass103_5);
						Static103.aBoolean182 = false;
						return;
					}
					if (arg0 == 6020) {
						local157 = anIntArray391[--anInt5038];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static123.aClass21_Sub1_1.anInt863 = local157;
						Static123.aClass21_Sub1_1.method782(Static295.aClass103_5);
						Static103.aBoolean182 = false;
						return;
					}
					if (arg0 == 6021) {
						Static123.aClass21_Sub1_1.aBoolean84 = anIntArray391[--anInt5038] == 1;
						Static42.method929();
						return;
					}
					if (arg0 == 6023) {
						local157 = anIntArray391[--anInt5038];
						local1313 = false;
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 2) {
							local157 = 2;
						}
						if (Static102.anInt619 < 96) {
							local157 = 0;
							local1313 = true;
						}
						Static26.method712(local157);
						Static123.aClass21_Sub1_1.method782(Static295.aClass103_5);
						Static103.aBoolean182 = false;
						anIntArray391[anInt5038++] = local1313 ? 0 : 1;
						return;
					}
					if (arg0 == 6024) {
						local157 = anIntArray391[--anInt5038];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static123.aClass21_Sub1_1.anInt869 = local157;
						Static123.aClass21_Sub1_1.method782(Static295.aClass103_5);
						return;
					}
					if (arg0 == 6025) {
						local157 = anIntArray391[--anInt5038];
						if (local157 < 0 || local157 > Static140.method2523(Static102.anInt619)) {
							local157 = 0;
						}
						Static123.aClass21_Sub1_1.anInt866 = local157;
						Static123.aClass21_Sub1_1.method782(Static295.aClass103_5);
						Static103.aBoolean182 = false;
						return;
					}
					if (arg0 == 6027) {
						local157 = anIntArray391[--anInt5038];
						if (local157 < 0 || local157 > 1) {
							local157 = 0;
						}
						Static115.method2112(local157 == 1);
						return;
					}
					if (arg0 == 6028) {
						Static123.aClass21_Sub1_1.aBoolean77 = anIntArray391[--anInt5038] != 0;
						Static123.aClass21_Sub1_1.method782(Static295.aClass103_5);
						return;
					}
					if (arg0 == 6029) {
						Static123.aClass21_Sub1_1.anInt877 = anIntArray391[--anInt5038];
						Static123.aClass21_Sub1_1.method782(Static295.aClass103_5);
						return;
					}
					if (arg0 == 6030) {
						Static123.aClass21_Sub1_1.aBoolean80 = anIntArray391[--anInt5038] != 0;
						Static123.aClass21_Sub1_1.method782(Static295.aClass103_5);
						Static152.method2703();
						return;
					}
					if (arg0 == 6031) {
						local157 = anIntArray391[--anInt5038];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static69.method1302(local157);
						return;
					}
					if (arg0 == 6032) {
						local157 = anIntArray391[--anInt5038];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static123.aClass21_Sub1_1.anInt867 = local157;
						Static123.aClass21_Sub1_1.method782(Static295.aClass103_5);
						Static103.aBoolean182 = false;
						return;
					}
					if (arg0 == 6033) {
						local157 = anIntArray391[--anInt5038];
						if (local157 < 0 || local157 > 4) {
							local157 = 2;
						}
						Static123.aClass21_Sub1_1.anInt881 = local157;
						Static123.aClass21_Sub1_1.method782(Static295.aClass103_5);
						return;
					}
					if (arg0 == 6034) {
						Static123.aClass21_Sub1_1.aBoolean67 = anIntArray391[--anInt5038] == 1;
						Static123.aClass21_Sub1_1.method782(Static295.aClass103_5);
						Static337.method4900();
						Static103.aBoolean182 = false;
						return;
					}
					if (arg0 == 6035) {
						Static123.aClass21_Sub1_1.aBoolean83 = anIntArray391[--anInt5038] == 1;
						Static152.method2703();
						Static42.method929();
						return;
					}
				} else if (arg0 < 6200) {
					if (arg0 == 6101) {
						anIntArray391[anInt5038++] = Static123.aClass21_Sub1_1.anInt864;
						return;
					}
					if (arg0 == 6102) {
						anIntArray391[anInt5038++] = Static123.aClass21_Sub1_1.method791(Static347.anInt6318) ? 1 : 0;
						return;
					}
					if (arg0 == 6103) {
						anIntArray391[anInt5038++] = Static123.aClass21_Sub1_1.aBoolean68 ? 1 : 0;
						return;
					}
					if (arg0 == 6105) {
						anIntArray391[anInt5038++] = Static123.aClass21_Sub1_1.aBoolean65 ? 1 : 0;
						return;
					}
					if (arg0 == 6106) {
						anIntArray391[anInt5038++] = Static123.aClass21_Sub1_1.aBoolean70 ? 1 : 0;
						return;
					}
					if (arg0 == 6107) {
						anIntArray391[anInt5038++] = Static123.aClass21_Sub1_1.anInt877;
						return;
					}
					if (arg0 == 6108) {
						anIntArray391[anInt5038++] = Static123.aClass21_Sub1_1.aBoolean79 ? 1 : 0;
						return;
					}
					if (arg0 == 6109) {
						anIntArray391[anInt5038++] = Static123.aClass21_Sub1_1.aBoolean66 ? 1 : 0;
						return;
					}
					if (arg0 == 6110) {
						anIntArray391[anInt5038++] = Static123.aClass21_Sub1_1.aBoolean78 ? 1 : 0;
						return;
					}
					if (arg0 == 6111) {
						anIntArray391[anInt5038++] = Static123.aClass21_Sub1_1.method775(Static347.anInt6318);
						return;
					}
					if (arg0 == 6112) {
						anIntArray391[anInt5038++] = Static123.aClass21_Sub1_1.method780(Static347.anInt6318) ? 1 : 0;
						return;
					}
					if (arg0 == 6114) {
						anIntArray391[anInt5038++] = Static123.aClass21_Sub1_1.aBoolean73 ? 1 : 0;
						return;
					}
					if (arg0 == 6115) {
						anIntArray391[anInt5038++] = Static123.aClass21_Sub1_1.aBoolean76 ? 1 : 0;
						return;
					}
					if (arg0 == 6116) {
						anIntArray391[anInt5038++] = Static123.aClass21_Sub1_1.anInt879;
						return;
					}
					if (arg0 == 6117) {
						anIntArray391[anInt5038++] = Static123.aClass21_Sub1_1.aBoolean81 ? 1 : 0;
						return;
					}
					if (arg0 == 6118) {
						anIntArray391[anInt5038++] = Static123.aClass21_Sub1_1.anInt868;
						return;
					}
					if (arg0 == 6119) {
						anIntArray391[anInt5038++] = Static123.aClass21_Sub1_1.anInt871;
						return;
					}
					if (arg0 == 6120) {
						anIntArray391[anInt5038++] = Static123.aClass21_Sub1_1.anInt863;
						return;
					}
					if (arg0 == 6121) {
						anIntArray391[anInt5038++] = Static266.aClass75_7.method2615() ? 1 : 0;
						return;
					}
					if (arg0 == 6123) {
						anIntArray391[anInt5038++] = Static438.method5860();
						return;
					}
					if (arg0 == 6124) {
						anIntArray391[anInt5038++] = Static123.aClass21_Sub1_1.anInt869;
						return;
					}
					if (arg0 == 6125) {
						anIntArray391[anInt5038++] = Static123.aClass21_Sub1_1.anInt866;
						return;
					}
					if (arg0 == 6126) {
						anIntArray391[anInt5038++] = Static266.aClass75_7.method2593() ? 1 : 0;
						return;
					}
					if (arg0 == 6127) {
						anIntArray391[anInt5038++] = Static123.aClass21_Sub1_1.aBoolean82 ? 1 : 0;
						return;
					}
					if (arg0 == 6128) {
						anIntArray391[anInt5038++] = Static123.aClass21_Sub1_1.aBoolean77 ? 1 : 0;
						return;
					}
					if (arg0 == 6129) {
						anIntArray391[anInt5038++] = Static123.aClass21_Sub1_1.anInt877;
						return;
					}
					if (arg0 == 6130) {
						anIntArray391[anInt5038++] = Static123.aClass21_Sub1_1.aBoolean80 ? 1 : 0;
						return;
					}
					if (arg0 == 6131) {
						anIntArray391[anInt5038++] = Static347.anInt6318;
						return;
					}
					if (arg0 == 6132) {
						anIntArray391[anInt5038++] = Static123.aClass21_Sub1_1.anInt867;
						return;
					}
					if (arg0 == 6133) {
						anIntArray391[anInt5038++] = Static162.anInt3462 == 1 || Static162.anInt3462 == 4 ? 1 : 0;
						return;
					}
					if (arg0 == 6134) {
						anIntArray391[anInt5038++] = Static140.method2523(Static102.anInt619);
						return;
					}
					if (arg0 == 6135) {
						anIntArray391[anInt5038++] = Static123.aClass21_Sub1_1.anInt881;
						return;
					}
					if (arg0 == 6136) {
						anIntArray391[anInt5038++] = Static123.aClass21_Sub1_1.aBoolean67 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6300) {
					if (arg0 == 6200) {
						anInt5038 -= 2;
						Static399.aShort211 = (short) anIntArray391[anInt5038];
						if (Static399.aShort211 <= 0) {
							Static399.aShort211 = 256;
						}
						Static63.aShort198 = (short) anIntArray391[anInt5038 + 1];
						if (Static63.aShort198 <= 0) {
							Static63.aShort198 = 205;
						}
						return;
					}
					if (arg0 == 6201) {
						anInt5038 -= 2;
						Static404.aShort214 = (short) anIntArray391[anInt5038];
						if (Static404.aShort214 <= 0) {
							Static404.aShort214 = 256;
						}
						Static139.aShort93 = (short) anIntArray391[anInt5038 + 1];
						if (Static139.aShort93 <= 0) {
							Static139.aShort93 = 320;
						}
						return;
					}
					if (arg0 == 6202) {
						anInt5038 -= 4;
						Static166.aShort102 = (short) anIntArray391[anInt5038];
						if (Static166.aShort102 <= 0) {
							Static166.aShort102 = 1;
						}
						Static381.aShort90 = (short) anIntArray391[anInt5038 + 1];
						if (Static381.aShort90 <= 0) {
							Static381.aShort90 = 32767;
						} else if (Static381.aShort90 < Static166.aShort102) {
							Static381.aShort90 = Static166.aShort102;
						}
						Static228.aShort235 = (short) anIntArray391[anInt5038 + 2];
						if (Static228.aShort235 <= 0) {
							Static228.aShort235 = 1;
						}
						Static308.aShort165 = (short) anIntArray391[anInt5038 + 3];
						if (Static308.aShort165 <= 0) {
							Static308.aShort165 = 32767;
							return;
						}
						if (Static308.aShort165 < Static228.aShort235) {
							Static308.aShort165 = Static228.aShort235;
						}
						return;
					}
					if (arg0 == 6203) {
						Static306.method4510(Static294.aClass68_10.lb, false, Static294.aClass68_10.anInt2178, 0, 0);
						anIntArray391[anInt5038++] = Static390.anInt6741;
						anIntArray391[anInt5038++] = Static444.anInt7527;
						return;
					}
					if (arg0 == 6204) {
						anIntArray391[anInt5038++] = Static404.aShort214;
						anIntArray391[anInt5038++] = Static139.aShort93;
						return;
					}
					if (arg0 == 6205) {
						anIntArray391[anInt5038++] = Static399.aShort211;
						anIntArray391[anInt5038++] = Static63.aShort198;
						return;
					}
				} else if (arg0 < 6400) {
					if (arg0 == 6300) {
						anIntArray391[anInt5038++] = (int) (Static150.method2672() / 60000L);
						return;
					}
					if (arg0 == 6301) {
						anIntArray391[anInt5038++] = (int) (Static150.method2672() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6302) {
						anInt5038 -= 3;
						local157 = anIntArray391[anInt5038];
						local192 = anIntArray391[anInt5038 + 1];
						local89 = anIntArray391[anInt5038 + 2];
						aCalendar2.clear();
						aCalendar2.set(11, 12);
						aCalendar2.set(local89, local192, local157);
						anIntArray391[anInt5038++] = (int) (aCalendar2.getTime().getTime() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6303) {
						aCalendar2.clear();
						aCalendar2.setTime(new Date(Static150.method2672()));
						anIntArray391[anInt5038++] = aCalendar2.get(1);
						return;
					}
					if (arg0 == 6304) {
						local157 = anIntArray391[--anInt5038];
						local1313 = true;
						if (local157 < 0) {
							local1313 = (local157 + 1) % 4 == 0;
						} else if (local157 < 1582) {
							local1313 = local157 % 4 == 0;
						} else if (local157 % 4 != 0) {
							local1313 = false;
						} else if (local157 % 100 != 0) {
							local1313 = true;
						} else if (local157 % 400 != 0) {
							local1313 = false;
						}
						anIntArray391[anInt5038++] = local1313 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6500) {
					if (arg0 == 6405) {
						anIntArray391[anInt5038++] = Static166.method2900() ? 1 : 0;
						return;
					}
					if (arg0 == 6406) {
						anIntArray391[anInt5038++] = Static385.method5259() ? 1 : 0;
						return;
					}
				} else if (arg0 < 6600) {
					if (arg0 == 6500) {
						if (Static142.anInt3209 == 10 && Static151.anInt3305 == 0 && Static108.anInt3455 == 0 && Static284.anInt5211 == 0) {
							anIntArray391[anInt5038++] = Static129.method2231() == -1 ? 0 : 1;
							return;
						}
						anIntArray391[anInt5038++] = 1;
						return;
					}
					@Pc(6160) Class265 local6160;
					@Pc(6127) Class145_Sub1 local6127;
					if (arg0 == 6501) {
						local6127 = Static330.method4798();
						if (local6127 != null) {
							anIntArray391[anInt5038++] = local6127.anInt4487;
							anIntArray391[anInt5038++] = local6127.anInt4486;
							aStringArray116[anInt5030++] = local6127.aString43;
							local6160 = local6127.method3662();
							anIntArray391[anInt5038++] = local6160.anInt7549;
							aStringArray116[anInt5030++] = local6160.aString66;
							anIntArray391[anInt5038++] = local6127.anInt4478;
							anIntArray391[anInt5038++] = local6127.anInt4488;
							return;
						}
						anIntArray391[anInt5038++] = -1;
						anIntArray391[anInt5038++] = 0;
						aStringArray116[anInt5030++] = "";
						anIntArray391[anInt5038++] = 0;
						aStringArray116[anInt5030++] = "";
						anIntArray391[anInt5038++] = 0;
						anIntArray391[anInt5038++] = 0;
						return;
					}
					if (arg0 == 6502) {
						local6127 = Static7.method161();
						if (local6127 != null) {
							anIntArray391[anInt5038++] = local6127.anInt4487;
							anIntArray391[anInt5038++] = local6127.anInt4486;
							aStringArray116[anInt5030++] = local6127.aString43;
							local6160 = local6127.method3662();
							anIntArray391[anInt5038++] = local6160.anInt7549;
							aStringArray116[anInt5030++] = local6160.aString66;
							anIntArray391[anInt5038++] = local6127.anInt4478;
							anIntArray391[anInt5038++] = local6127.anInt4488;
							return;
						}
						anIntArray391[anInt5038++] = -1;
						anIntArray391[anInt5038++] = 0;
						aStringArray116[anInt5030++] = "";
						anIntArray391[anInt5038++] = 0;
						aStringArray116[anInt5030++] = "";
						anIntArray391[anInt5038++] = 0;
						anIntArray391[anInt5038++] = 0;
						return;
					}
					if (arg0 == 6503) {
						local157 = anIntArray391[--anInt5038];
						if (Static142.anInt3209 == 10 && Static151.anInt3305 == 0 && Static108.anInt3455 == 0 && Static284.anInt5211 == 0) {
							anIntArray391[anInt5038++] = Static251.method3840(local157) ? 1 : 0;
							return;
						}
						anIntArray391[anInt5038++] = 0;
						return;
					}
					if (arg0 == 6504) {
						Static123.aClass21_Sub1_1.anInt862 = anIntArray391[--anInt5038];
						Static123.aClass21_Sub1_1.method782(Static295.aClass103_5);
						return;
					}
					if (arg0 == 6505) {
						anIntArray391[anInt5038++] = Static123.aClass21_Sub1_1.anInt862;
						return;
					}
					if (arg0 == 6506) {
						local157 = anIntArray391[--anInt5038];
						@Pc(6476) Class145_Sub1 local6476 = Static318.method2568(local157);
						if (local6476 != null) {
							anIntArray391[anInt5038++] = local6476.anInt4486;
							aStringArray116[anInt5030++] = local6476.aString43;
							@Pc(6500) Class265 local6500 = local6476.method3662();
							anIntArray391[anInt5038++] = local6500.anInt7549;
							aStringArray116[anInt5030++] = local6500.aString66;
							anIntArray391[anInt5038++] = local6476.anInt4478;
							anIntArray391[anInt5038++] = local6476.anInt4488;
							return;
						}
						anIntArray391[anInt5038++] = -1;
						aStringArray116[anInt5030++] = "";
						anIntArray391[anInt5038++] = 0;
						aStringArray116[anInt5030++] = "";
						anIntArray391[anInt5038++] = 0;
						anIntArray391[anInt5038++] = 0;
						return;
					}
					if (arg0 == 6507) {
						anInt5038 -= 4;
						local157 = anIntArray391[anInt5038];
						local1313 = anIntArray391[anInt5038 + 1] == 1;
						local89 = anIntArray391[anInt5038 + 2];
						local1965 = anIntArray391[anInt5038 + 3] == 1;
						Static200.method3253(local89, local1965, local157, local1313);
						return;
					}
					if (arg0 == 6508) {
						Static146.method2661();
						return;
					}
					if (arg0 == 6509) {
						if (Static142.anInt3209 != 10) {
							return;
						}
						Static242.aBoolean351 = anIntArray391[--anInt5038] == 1;
						return;
					}
				} else if (arg0 < 6700) {
					if (arg0 == 6600) {
						Static123.aClass21_Sub1_1.aBoolean72 = anIntArray391[--anInt5038] == 1;
						Static123.aClass21_Sub1_1.method782(Static295.aClass103_5);
						return;
					}
					if (arg0 == 6601) {
						anIntArray391[anInt5038++] = Static123.aClass21_Sub1_1.aBoolean72 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6800 && Static135.aClass247_2 == Static182.aClass247_4) {
					if (arg0 == 6700) {
						local157 = Static30.aClass127_3.method3256();
						if (Static337.anInt6221 != -1) {
							local157++;
						}
						anIntArray391[anInt5038++] = local157;
						return;
					}
					if (arg0 == 6701) {
						local157 = anIntArray391[--anInt5038];
						if (Static337.anInt6221 != -1) {
							if (local157 == 0) {
								anIntArray391[anInt5038++] = Static337.anInt6221;
								return;
							}
							local157--;
						}
						@Pc(6758) Class3_Sub40 local6758 = (Class3_Sub40) Static30.aClass127_3.method3248();
						while (local157-- > 0) {
							local6758 = (Class3_Sub40) Static30.aClass127_3.method3252();
						}
						anIntArray391[anInt5038++] = local6758.anInt6668;
						return;
					}
					if (arg0 == 6702) {
						local157 = anIntArray391[--anInt5038];
						if (Static300.aClass68ArrayArray3[local157] == null) {
							aStringArray116[anInt5030++] = "";
							return;
						}
						local81 = Static300.aClass68ArrayArray3[local157][0].aString17;
						if (local81 == null) {
							aStringArray116[anInt5030++] = "";
							return;
						}
						aStringArray116[anInt5030++] = local81.substring(0, local81.indexOf(58));
						return;
					}
					if (arg0 == 6703) {
						local157 = anIntArray391[--anInt5038];
						if (Static300.aClass68ArrayArray3[local157] == null) {
							anIntArray391[anInt5038++] = 0;
							return;
						}
						anIntArray391[anInt5038++] = Static300.aClass68ArrayArray3[local157].length;
						return;
					}
					if (arg0 == 6704) {
						anInt5038 -= 2;
						local157 = anIntArray391[anInt5038];
						local192 = anIntArray391[anInt5038 + 1];
						if (Static300.aClass68ArrayArray3[local157] == null) {
							aStringArray116[anInt5030++] = "";
							return;
						}
						local3345 = Static300.aClass68ArrayArray3[local157][local192].aString17;
						if (local3345 == null) {
							aStringArray116[anInt5030++] = "";
							return;
						}
						aStringArray116[anInt5030++] = local3345;
						return;
					}
					if (arg0 == 6705) {
						anInt5038 -= 2;
						local157 = anIntArray391[anInt5038];
						local192 = anIntArray391[anInt5038 + 1];
						if (Static300.aClass68ArrayArray3[local157] == null) {
							anIntArray391[anInt5038++] = 0;
							return;
						}
						anIntArray391[anInt5038++] = Static300.aClass68ArrayArray3[local157][local192].anInt2194;
						return;
					}
					if (arg0 == 6706) {
						return;
					}
					if (arg0 == 6707) {
						anInt5038 -= 3;
						local157 = anIntArray391[anInt5038];
						local192 = anIntArray391[anInt5038 + 1];
						local89 = anIntArray391[anInt5038 + 2];
						Static129.method2233("", local157 << 16 | local192, local89, 1);
						return;
					}
					if (arg0 == 6708) {
						anInt5038 -= 3;
						local157 = anIntArray391[anInt5038];
						local192 = anIntArray391[anInt5038 + 1];
						local89 = anIntArray391[anInt5038 + 2];
						Static129.method2233("", local157 << 16 | local192, local89, 2);
						return;
					}
					if (arg0 == 6709) {
						anInt5038 -= 3;
						local157 = anIntArray391[anInt5038];
						local192 = anIntArray391[anInt5038 + 1];
						local89 = anIntArray391[anInt5038 + 2];
						Static129.method2233("", local157 << 16 | local192, local89, 3);
						return;
					}
					if (arg0 == 6710) {
						anInt5038 -= 3;
						local157 = anIntArray391[anInt5038];
						local192 = anIntArray391[anInt5038 + 1];
						local89 = anIntArray391[anInt5038 + 2];
						Static129.method2233("", local157 << 16 | local192, local89, 4);
						return;
					}
					if (arg0 == 6711) {
						anInt5038 -= 3;
						local157 = anIntArray391[anInt5038];
						local192 = anIntArray391[anInt5038 + 1];
						local89 = anIntArray391[anInt5038 + 2];
						Static129.method2233("", local157 << 16 | local192, local89, 5);
						return;
					}
					if (arg0 == 6712) {
						anInt5038 -= 3;
						local157 = anIntArray391[anInt5038];
						local192 = anIntArray391[anInt5038 + 1];
						local89 = anIntArray391[anInt5038 + 2];
						Static129.method2233("", local157 << 16 | local192, local89, 6);
						return;
					}
					if (arg0 == 6713) {
						anInt5038 -= 3;
						local157 = anIntArray391[anInt5038];
						local192 = anIntArray391[anInt5038 + 1];
						local89 = anIntArray391[anInt5038 + 2];
						Static129.method2233("", local157 << 16 | local192, local89, 7);
						return;
					}
					if (arg0 == 6714) {
						anInt5038 -= 3;
						local157 = anIntArray391[anInt5038];
						local192 = anIntArray391[anInt5038 + 1];
						local89 = anIntArray391[anInt5038 + 2];
						Static129.method2233("", local157 << 16 | local192, local89, 8);
						return;
					}
					if (arg0 == 6715) {
						anInt5038 -= 3;
						local157 = anIntArray391[anInt5038];
						local192 = anIntArray391[anInt5038 + 1];
						local89 = anIntArray391[anInt5038 + 2];
						Static129.method2233("", local157 << 16 | local192, local89, 9);
						return;
					}
					if (arg0 == 6716) {
						anInt5038 -= 3;
						local157 = anIntArray391[anInt5038];
						local192 = anIntArray391[anInt5038 + 1];
						local89 = anIntArray391[anInt5038 + 2];
						Static129.method2233("", local157 << 16 | local192, local89, 10);
						return;
					}
					if (arg0 == 6717) {
						anInt5038 -= 3;
						local157 = anIntArray391[anInt5038];
						local192 = anIntArray391[anInt5038 + 1];
						local89 = anIntArray391[anInt5038 + 2];
						@Pc(7346) Class68 local7346 = Static347.method4975(local157 << 16 | local192, local89);
						Static31.method766();
						@Pc(7351) Class3_Sub26 local7351 = Static56.method1160(local7346);
						Static169.method2916(local7351.method3487(), local7351.anInt4280, local7346);
						return;
					}
				} else if (arg0 < 6900) {
					@Pc(7379) Class223 local7379;
					if (arg0 == 6800) {
						local157 = anIntArray391[--anInt5038];
						local7379 = Static408.aClass61_3.method1426(local157);
						if (local7379.aString61 == null) {
							aStringArray116[anInt5030++] = "";
							return;
						}
						aStringArray116[anInt5030++] = local7379.aString61;
						return;
					}
					if (arg0 == 6801) {
						local157 = anIntArray391[--anInt5038];
						local7379 = Static408.aClass61_3.method1426(local157);
						anIntArray391[anInt5038++] = local7379.anInt6703;
						return;
					}
					if (arg0 == 6802) {
						local157 = anIntArray391[--anInt5038];
						local7379 = Static408.aClass61_3.method1426(local157);
						anIntArray391[anInt5038++] = local7379.anInt6719;
						return;
					}
					if (arg0 == 6803) {
						local157 = anIntArray391[--anInt5038];
						local7379 = Static408.aClass61_3.method1426(local157);
						anIntArray391[anInt5038++] = local7379.anInt6730;
						return;
					}
					if (arg0 == 6804) {
						anInt5038 -= 2;
						local157 = anIntArray391[anInt5038];
						local192 = anIntArray391[anInt5038 + 1];
						@Pc(7501) Class235 local7501 = Static294.aClass69_2.method1740(local192);
						if (local7501.method5455()) {
							aStringArray116[anInt5030++] = Static408.aClass61_3.method1426(local157).method5281(local7501.aString63, local192);
							return;
						}
						anIntArray391[anInt5038++] = Static408.aClass61_3.method1426(local157).method5282(local7501.anInt7023, local192);
						return;
					}
				}
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)V")
	public static void method4043(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static294.method4291(arg0)) {
			return;
		}
		@Pc(12) Class68[] local12 = Static300.aClass68ArrayArray3[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class68 local19 = local12[local14];
			if (local19.anObjectArray20 != null) {
				@Pc(26) Class3_Sub20 local26 = new Class3_Sub20();
				local26.aClass68_4 = local19;
				local26.anObjectArray35 = local19.anObjectArray20;
				method4048(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!gd;)V")
	public static void method4044(@OriginalArg(0) Class3_Sub20 arg0) {
		method4048(arg0, 200000);
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)V")
	private static void method4045(@OriginalArg(0) int arg0) {
		@Pc(3) Class68 local3 = Static321.method4661(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class68[] local13 = Static4.aClass68ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class68[] local19 = Static300.aClass68ArrayArray3[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static4.aClass68ArrayArray2[local9] = new Class68[local22];
			Static464.method5799(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static464.method5799(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)V")
	private static void method4046(@OriginalArg(0) int arg0) {
		@Pc(3) Class68 local3 = Static321.method4661(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class68[] local13 = Static4.aClass68ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class68[] local19 = Static300.aClass68ArrayArray3[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static4.aClass68ArrayArray2[local9] = new Class68[local22];
			Static464.method5799(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static464.method5799(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "()V")
	public static void method4047() {
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!gd;I)V")
	private static void method4048(@OriginalArg(0) Class3_Sub20 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray35;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class3_Sub3_Sub17 local12 = Static448.method5928(local8);
		if (local12 == null) {
			return;
		}
		anIntArray393 = new int[local12.anInt5633];
		@Pc(21) int local21 = 0;
		aStringArray115 = new String[local12.anInt5629];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt2706;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt2713;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass68_4 == null ? -1 : arg0.aClass68_4.anInt2177;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt2711;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass68_4 == null ? -1 : arg0.aClass68_4.anInt2187;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass68_5 == null ? -1 : arg0.aClass68_5.anInt2177;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass68_5 == null ? -1 : arg0.aClass68_5.anInt2187;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt2703;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt2707;
				}
				anIntArray393[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString26;
				}
				aStringArray115[local27++] = local135;
			}
		}
		anInt5043 = arg0.anInt2712;
		method4040(local12, arg1);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!pb;II)V")
	public static void method4049(@OriginalArg(0) Class180 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class3_Sub3_Sub17 local5 = Static442.method5903(arg2, arg0, arg1);
		if (local5 == null) {
			return;
		}
		anIntArray393 = new int[local5.anInt5633];
		aStringArray115 = new String[local5.anInt5629];
		if (local5.aClass180_6 == Static3.aClass180_8 || local5.aClass180_6 == Static215.aClass180_3 || local5.aClass180_6 == Static312.aClass180_7) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static118.aClass68_3 != null) {
				local30 = Static118.aClass68_3.anInt2217;
				local32 = Static118.aClass68_3.anInt2212;
			}
			anIntArray393[0] = Static155.aClass74_1.method1870() - local30;
			anIntArray393[1] = Static155.aClass74_1.method1865() - local32;
		}
		method4040(local5, 200000);
	}

	@OriginalMember(owner = "client!nq", name = "d", descriptor = "(I)Ljava/lang/String;")
	private static String method4050(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar2.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar2.get(5);
		@Pc(20) int local20 = aCalendar2.get(2);
		@Pc(24) int local24 = aCalendar2.get(1);
		return local16 + "-" + aStringArray117[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method4051(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static199.anInt3933 == 0 && (Static269.aBoolean373 && !Static268.aBoolean372 || Static413.aBoolean307)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static142.aClass175_97.method4201(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static142.aClass175_97.method4201(0).length());
		} else if (local11.startsWith(Static60.aClass175_49.method4201(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static60.aClass175_49.method4201(0).length());
		} else if (local11.startsWith(Static363.aClass175_209.method4201(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static363.aClass175_209.method4201(0).length());
		} else if (local11.startsWith(Static170.aClass175_115.method4201(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static170.aClass175_115.method4201(0).length());
		} else if (local11.startsWith(Static67.aClass175_55.method4201(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static67.aClass175_55.method4201(0).length());
		} else if (local11.startsWith(Static405.aClass175_227.method4201(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static405.aClass175_227.method4201(0).length());
		} else if (local11.startsWith(Static123.aClass175_87.method4201(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static123.aClass175_87.method4201(0).length());
		} else if (local11.startsWith(Static301.aClass175_180.method4201(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static301.aClass175_180.method4201(0).length());
		} else if (local11.startsWith(Static231.aClass175_147.method4201(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static231.aClass175_147.method4201(0).length());
		} else if (local11.startsWith(Static256.aClass175_161.method4201(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static256.aClass175_161.method4201(0).length());
		} else if (local11.startsWith(Static127.aClass175_89.method4201(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static127.aClass175_89.method4201(0).length());
		} else if (local11.startsWith(Static348.aClass175_242.method4201(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static348.aClass175_242.method4201(0).length());
		} else if (Static216.anInt4257 != 0) {
			if (local11.startsWith(Static142.aClass175_97.method4201(Static216.anInt4257))) {
				local13 = 0;
				arg0 = arg0.substring(Static142.aClass175_97.method4201(Static216.anInt4257).length());
			} else if (local11.startsWith(Static60.aClass175_49.method4201(Static216.anInt4257))) {
				local13 = 1;
				arg0 = arg0.substring(Static60.aClass175_49.method4201(Static216.anInt4257).length());
			} else if (local11.startsWith(Static363.aClass175_209.method4201(Static216.anInt4257))) {
				local13 = 2;
				arg0 = arg0.substring(Static363.aClass175_209.method4201(Static216.anInt4257).length());
			} else if (local11.startsWith(Static170.aClass175_115.method4201(Static216.anInt4257))) {
				local13 = 3;
				arg0 = arg0.substring(Static170.aClass175_115.method4201(Static216.anInt4257).length());
			} else if (local11.startsWith(Static67.aClass175_55.method4201(Static216.anInt4257))) {
				local13 = 4;
				arg0 = arg0.substring(Static67.aClass175_55.method4201(Static216.anInt4257).length());
			} else if (local11.startsWith(Static405.aClass175_227.method4201(Static216.anInt4257))) {
				local13 = 5;
				arg0 = arg0.substring(Static405.aClass175_227.method4201(Static216.anInt4257).length());
			} else if (local11.startsWith(Static123.aClass175_87.method4201(Static216.anInt4257))) {
				local13 = 6;
				arg0 = arg0.substring(Static123.aClass175_87.method4201(Static216.anInt4257).length());
			} else if (local11.startsWith(Static301.aClass175_180.method4201(Static216.anInt4257))) {
				local13 = 7;
				arg0 = arg0.substring(Static301.aClass175_180.method4201(Static216.anInt4257).length());
			} else if (local11.startsWith(Static231.aClass175_147.method4201(Static216.anInt4257))) {
				local13 = 8;
				arg0 = arg0.substring(Static231.aClass175_147.method4201(Static216.anInt4257).length());
			} else if (local11.startsWith(Static256.aClass175_161.method4201(Static216.anInt4257))) {
				local13 = 9;
				arg0 = arg0.substring(Static256.aClass175_161.method4201(Static216.anInt4257).length());
			} else if (local11.startsWith(Static127.aClass175_89.method4201(Static216.anInt4257))) {
				local13 = 10;
				arg0 = arg0.substring(Static127.aClass175_89.method4201(Static216.anInt4257).length());
			} else if (local11.startsWith(Static348.aClass175_242.method4201(Static216.anInt4257))) {
				local13 = 11;
				arg0 = arg0.substring(Static348.aClass175_242.method4201(Static216.anInt4257).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static322.aClass175_193.method4201(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static322.aClass175_193.method4201(0).length());
		} else if (local11.startsWith(Static267.aClass175_164.method4201(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static267.aClass175_164.method4201(0).length());
		} else if (local11.startsWith(Static341.aClass175_201.method4201(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static341.aClass175_201.method4201(0).length());
		} else if (local11.startsWith(Static187.aClass175_123.method4201(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static187.aClass175_123.method4201(0).length());
		} else if (local11.startsWith(Static182.aClass175_122.method4201(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static182.aClass175_122.method4201(0).length());
		} else if (Static216.anInt4257 != 0) {
			if (local11.startsWith(Static322.aClass175_193.method4201(Static216.anInt4257))) {
				local451 = 1;
				arg0 = arg0.substring(Static322.aClass175_193.method4201(Static216.anInt4257).length());
			} else if (local11.startsWith(Static267.aClass175_164.method4201(Static216.anInt4257))) {
				local451 = 2;
				arg0 = arg0.substring(Static267.aClass175_164.method4201(Static216.anInt4257).length());
			} else if (local11.startsWith(Static341.aClass175_201.method4201(Static216.anInt4257))) {
				local451 = 3;
				arg0 = arg0.substring(Static341.aClass175_201.method4201(Static216.anInt4257).length());
			} else if (local11.startsWith(Static187.aClass175_123.method4201(Static216.anInt4257))) {
				local451 = 4;
				arg0 = arg0.substring(Static187.aClass175_123.method4201(Static216.anInt4257).length());
			} else if (local11.startsWith(Static182.aClass175_122.method4201(Static216.anInt4257))) {
				local451 = 5;
				arg0 = arg0.substring(Static182.aClass175_122.method4201(Static216.anInt4257).length());
			}
		}
		Static414.method5552(Static391.aClass92_225);
		Static302.aClass3_Sub2_Sub2_2.method6001(0);
		@Pc(646) int local646 = Static302.aClass3_Sub2_Sub2_2.anInt7620;
		if (arg1 == 5021) {
			Static302.aClass3_Sub2_Sub2_2.method6001(1);
		} else if (arg1 == 5022) {
			Static302.aClass3_Sub2_Sub2_2.method6001(2);
		} else {
			Static302.aClass3_Sub2_Sub2_2.method6001(0);
		}
		Static302.aClass3_Sub2_Sub2_2.method6001(local13);
		Static302.aClass3_Sub2_Sub2_2.method6001(local451);
		Static305.method4505(arg0, Static302.aClass3_Sub2_Sub2_2);
		Static302.aClass3_Sub2_Sub2_2.method5993(Static302.aClass3_Sub2_Sub2_2.anInt7620 - local646);
	}
}
