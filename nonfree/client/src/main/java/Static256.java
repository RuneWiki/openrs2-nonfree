import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!ot", name = "f", descriptor = "Lclient!dr;")
	private static Class53 aClass53_1;

	@OriginalMember(owner = "client!ot", name = "h", descriptor = "Lclient!ae;")
	private static Class4 aClass4_20;

	@OriginalMember(owner = "client!ot", name = "p", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray117;

	@OriginalMember(owner = "client!ot", name = "r", descriptor = "Lclient!ae;")
	private static Class4 aClass4_21;

	@OriginalMember(owner = "client!ot", name = "w", descriptor = "[I")
	private static int[] anIntArray878;

	@OriginalMember(owner = "client!ot", name = "d", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!ot", name = "e", descriptor = "[I")
	private static final int[] anIntArray876 = new int[5];

	@OriginalMember(owner = "client!ot", name = "i", descriptor = "I")
	private static int anInt4510 = 0;

	@OriginalMember(owner = "client!ot", name = "j", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray116 = new String[1000];

	@OriginalMember(owner = "client!ot", name = "k", descriptor = "[I")
	private static final int[] anIntArray877 = new int[1000];

	@OriginalMember(owner = "client!ot", name = "o", descriptor = "[[I")
	private static final int[][] anIntArrayArray33 = new int[5][5000];

	@OriginalMember(owner = "client!ot", name = "u", descriptor = "[Lclient!en;")
	private static final Class61[] aClass61Array1 = new Class61[50];

	@OriginalMember(owner = "client!ot", name = "x", descriptor = "[I")
	private static final int[] anIntArray879 = new int[3];

	@OriginalMember(owner = "client!ot", name = "y", descriptor = "Lclient!mo;")
	public static final Class160 aClass160_39 = new Class160(4);

	@OriginalMember(owner = "client!ot", name = "z", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray118 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)V")
	public static void method3998(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static348.method5096(arg0)) {
			return;
		}
		@Pc(12) Class4[] local12 = Static183.aClass4ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class4 local19 = local12[local14];
			if (local19.anObjectArray8 != null) {
				@Pc(26) Class2_Sub22 local26 = new Class2_Sub22();
				local26.aClass4_15 = local19;
				local26.anObjectArray33 = local19.anObjectArray8;
				method4000(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lclient!ks;I)V")
	private static void method3999(@OriginalArg(0) Class2_Sub10_Sub11 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray685;
		@Pc(11) int[] local11 = arg0.anIntArray684;
		@Pc(13) byte local13 = -1;
		anInt4510 = 0;
		@Pc(540) int local540;
		@Pc(1702) String local1702;
		try {
			@Pc(17) int local17 = 0;
			label4494: while (true) {
				local17++;
				if (local17 > arg1) {
					throw new RuntimeException("slow");
				}
				local5++;
				@Pc(31) int local31 = local8[local5];
				@Pc(545) int local545;
				@Pc(395) int local395;
				@Pc(414) int local414;
				@Pc(352) String local352;
				if (local31 < 100) {
					if (local31 == 0) {
						anIntArray877[local1++] = local11[local5];
						continue;
					}
					@Pc(51) int local51;
					if (local31 == 1) {
						local51 = local11[local5];
						anIntArray877[local1++] = Static321.aClass211_1.anIntArray1019[local51];
						continue;
					}
					if (local31 == 2) {
						local51 = local11[local5];
						local1--;
						Static321.aClass211_1.method4472(anIntArray877[local1], local51);
						continue;
					}
					if (local31 == 3) {
						aStringArray116[local3++] = arg0.aStringArray86[local5];
						continue;
					}
					if (local31 == 6) {
						local5 += local11[local5];
						continue;
					}
					if (local31 == 7) {
						local1 -= 2;
						if (anIntArray877[local1] != anIntArray877[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 8) {
						local1 -= 2;
						if (anIntArray877[local1] == anIntArray877[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 9) {
						local1 -= 2;
						if (anIntArray877[local1] < anIntArray877[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 10) {
						local1 -= 2;
						if (anIntArray877[local1] > anIntArray877[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 21) {
						if (anInt4510 == 0) {
							return;
						}
						@Pc(192) Class61 local192 = aClass61Array1[--anInt4510];
						arg0 = local192.aClass2_Sub10_Sub11_1;
						local8 = arg0.anIntArray685;
						local11 = arg0.anIntArray684;
						local5 = local192.anInt1466;
						anIntArray878 = local192.anIntArray342;
						aStringArray117 = local192.aStringArray47;
						continue;
					}
					if (local31 == 25) {
						local51 = local11[local5];
						anIntArray877[local1++] = Static321.aClass211_1.method4464(local51);
						continue;
					}
					if (local31 == 27) {
						local51 = local11[local5];
						local1--;
						Static321.aClass211_1.method4467(local51, anIntArray877[local1]);
						continue;
					}
					if (local31 == 31) {
						local1 -= 2;
						if (anIntArray877[local1] <= anIntArray877[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 32) {
						local1 -= 2;
						if (anIntArray877[local1] >= anIntArray877[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 33) {
						anIntArray877[local1++] = anIntArray878[local11[local5]];
						continue;
					}
					@Pc(303) int local303;
					if (local31 == 34) {
						local303 = local11[local5];
						local1--;
						anIntArray878[local303] = anIntArray877[local1];
						continue;
					}
					if (local31 == 35) {
						aStringArray116[local3++] = aStringArray117[local11[local5]];
						continue;
					}
					if (local31 == 36) {
						local303 = local11[local5];
						local3--;
						aStringArray117[local303] = aStringArray116[local3];
						continue;
					}
					if (local31 == 37) {
						local51 = local11[local5];
						local3 -= local51;
						local352 = Static183.method3159(local3, aStringArray116, local51);
						aStringArray116[local3++] = local352;
						continue;
					}
					if (local31 == 38) {
						local1--;
						continue;
					}
					if (local31 == 39) {
						local3--;
						continue;
					}
					if (local31 == 40) {
						local51 = local11[local5];
						@Pc(379) Class2_Sub10_Sub11 local379 = Static322.method4784(local51);
						if (local379 == null) {
							throw new RuntimeException();
						}
						@Pc(389) int[] local389 = new int[local379.anInt3505];
						@Pc(393) String[] local393 = new String[local379.anInt3501];
						for (local395 = 0; local395 < local379.anInt3500; local395++) {
							local389[local395] = anIntArray877[local1 + local395 - local379.anInt3500];
						}
						for (local414 = 0; local414 < local379.anInt3502; local414++) {
							local393[local414] = aStringArray116[local3 + local414 - local379.anInt3502];
						}
						local1 -= local379.anInt3500;
						local3 -= local379.anInt3502;
						@Pc(445) Class61 local445 = new Class61();
						local445.aClass2_Sub10_Sub11_1 = arg0;
						local445.anInt1466 = local5;
						local445.anIntArray342 = anIntArray878;
						local445.aStringArray47 = aStringArray117;
						if (anInt4510 >= aClass61Array1.length) {
							throw new RuntimeException();
						}
						aClass61Array1[anInt4510++] = local445;
						arg0 = local379;
						local8 = local379.anIntArray685;
						local11 = local379.anIntArray684;
						local5 = -1;
						anIntArray878 = local389;
						aStringArray117 = local393;
						continue;
					}
					if (local31 == 42) {
						anIntArray877[local1++] = Static330.anIntArray1157[local11[local5]];
						continue;
					}
					if (local31 == 43) {
						local51 = local11[local5];
						local1--;
						Static330.anIntArray1157[local51] = anIntArray877[local1];
						Static159.method2865(local51);
						Static10.aBoolean423 |= Static88.aBooleanArray13[local51];
						continue;
					}
					if (local31 == 44) {
						local51 = local11[local5] >> 16;
						local540 = local11[local5] & 0xFFFF;
						local1--;
						local545 = anIntArray877[local1];
						if (local545 >= 0 && local545 <= 5000) {
							anIntArray876[local51] = local545;
							@Pc(560) byte local560 = -1;
							if (local540 == 105) {
								local560 = 0;
							}
							local395 = 0;
							while (true) {
								if (local395 >= local545) {
									continue label4494;
								}
								anIntArrayArray33[local51][local395] = local560;
								local395++;
							}
						}
						throw new RuntimeException();
					}
					if (local31 == 45) {
						local51 = local11[local5];
						local1--;
						local540 = anIntArray877[local1];
						if (local540 >= 0 && local540 < anIntArray876[local51]) {
							anIntArray877[local1++] = anIntArrayArray33[local51][local540];
							continue;
						}
						throw new RuntimeException();
					}
					if (local31 == 46) {
						local51 = local11[local5];
						local1 -= 2;
						local540 = anIntArray877[local1];
						if (local540 >= 0 && local540 < anIntArray876[local51]) {
							anIntArrayArray33[local51][local540] = anIntArray877[local1 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local31 == 47) {
						@Pc(655) String local655 = Static245.aStringArray108[local11[local5]];
						if (local655 == null) {
							local655 = "null";
						}
						aStringArray116[local3++] = local655;
						continue;
					}
					if (local31 == 48) {
						local51 = local11[local5];
						local3--;
						Static245.aStringArray108[local51] = aStringArray116[local3];
						Static192.method3297(local51);
						continue;
					}
					if (local31 == 51) {
						@Pc(693) Class246 local693 = arg0.aClass246Array1[local11[local5]];
						local1--;
						@Pc(703) Class2_Sub14 local703 = (Class2_Sub14) local693.method5613((long) anIntArray877[local1]);
						if (local703 != null) {
							local5 += local703.anInt1455;
						}
						continue;
					}
				}
				@Pc(718) boolean local718;
				if (local11[local5] == 1) {
					local718 = true;
				} else {
					local718 = false;
				}
				@Pc(744) int local744;
				@Pc(775) int local775;
				@Pc(856) Class4 local856;
				@Pc(754) Class4 local754;
				@Pc(923) Class4 local923;
				if (local31 < 300) {
					if (local31 == 100) {
						local1 -= 3;
						local540 = anIntArray877[local1];
						local545 = anIntArray877[local1 + 1];
						local744 = anIntArray877[local1 + 2];
						if (local545 == 0) {
							throw new RuntimeException();
						}
						local754 = Static380.method5560(local540);
						if (local754.aClass4Array1 == null) {
							local754.aClass4Array1 = new Class4[local744 + 1];
						}
						if (local754.aClass4Array1.length <= local744) {
							@Pc(773) Class4[] local773 = new Class4[local744 + 1];
							for (local775 = 0; local775 < local754.aClass4Array1.length; local775++) {
								local773[local775] = local754.aClass4Array1[local775];
							}
							local754.aClass4Array1 = local773;
						}
						if (local744 > 0 && local754.aClass4Array1[local744 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local744 - 1));
						}
						@Pc(818) Class4 local818 = new Class4();
						local818.anInt125 = local545;
						local818.anInt88 = local818.anInt94 = local754.anInt94;
						local818.lb = local744;
						local754.aClass4Array1[local744] = local818;
						if (local718) {
							aClass4_21 = local818;
						} else {
							aClass4_20 = local818;
						}
						Static51.method872(local754);
						continue;
					}
					@Pc(877) Class4 local877;
					if (local31 == 101) {
						local856 = local718 ? aClass4_21 : aClass4_20;
						if (local856.lb == -1) {
							if (local718) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						local877 = Static380.method5560(local856.anInt94);
						local877.aClass4Array1[local856.lb] = null;
						Static51.method872(local877);
						continue;
					}
					if (local31 == 102) {
						local1--;
						local856 = Static380.method5560(anIntArray877[local1]);
						local856.aClass4Array1 = null;
						Static51.method872(local856);
						continue;
					}
					if (local31 == 200) {
						local1 -= 2;
						local540 = anIntArray877[local1];
						local545 = anIntArray877[local1 + 1];
						local923 = Static164.method2913(local545, local540);
						if (local923 != null && local545 != -1) {
							anIntArray877[local1++] = 1;
							if (local718) {
								aClass4_21 = local923;
							} else {
								aClass4_20 = local923;
							}
							continue;
						}
						anIntArray877[local1++] = 0;
						continue;
					}
					if (local31 == 201) {
						local1--;
						local540 = anIntArray877[local1];
						local877 = Static380.method5560(local540);
						if (local877 == null) {
							anIntArray877[local1++] = 0;
						} else {
							anIntArray877[local1++] = 1;
							if (local718) {
								aClass4_21 = local877;
							} else {
								aClass4_20 = local877;
							}
						}
						continue;
					}
				} else {
					@Pc(1073) boolean local1073;
					if (local31 < 500) {
						if (local31 == 403) {
							local1 -= 2;
							local540 = anIntArray877[local1];
							local545 = anIntArray877[local1 + 1];
							for (local744 = 0; local744 < Static293.anIntArray1334.length; local744++) {
								if (Static293.anIntArray1334[local744] == local540) {
									Static206.aClass1_Sub5_Sub1_Sub1_1.aClass224_1.method4889(local744, local545, Static192.aClass196_1);
									continue label4494;
								}
							}
							local395 = 0;
							while (true) {
								if (local395 >= Static341.anIntArray1177.length) {
									continue label4494;
								}
								if (Static341.anIntArray1177[local395] == local540) {
									Static206.aClass1_Sub5_Sub1_Sub1_1.aClass224_1.method4889(local395, local545, Static192.aClass196_1);
									continue label4494;
								}
								local395++;
							}
						}
						if (local31 == 404) {
							local1 -= 2;
							local540 = anIntArray877[local1];
							local545 = anIntArray877[local1 + 1];
							Static206.aClass1_Sub5_Sub1_Sub1_1.aClass224_1.method4886(local540, local545);
							continue;
						}
						if (local31 == 410) {
							local1--;
							local1073 = anIntArray877[local1] != 0;
							Static206.aClass1_Sub5_Sub1_Sub1_1.aClass224_1.method4884(local1073);
							continue;
						}
					} else {
						@Pc(1269) boolean local1269;
						if (local31 >= 1000 && local31 < 1100 || !(local31 < 2000 || local31 >= 2100)) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local856 = Static380.method5560(anIntArray877[local1]);
							} else {
								local856 = local718 ? aClass4_21 : aClass4_20;
							}
							if (local31 == 1000) {
								local1 -= 4;
								local856.anInt91 = anIntArray877[local1];
								local856.anInt100 = anIntArray877[local1 + 1];
								local545 = anIntArray877[local1 + 2];
								if (local545 < 0) {
									local545 = 0;
								} else if (local545 > 5) {
									local545 = 5;
								}
								local744 = anIntArray877[local1 + 3];
								if (local744 < 0) {
									local744 = 0;
								} else if (local744 > 5) {
									local744 = 5;
								}
								local856.aByte4 = (byte) local545;
								local856.aByte3 = (byte) local744;
								Static51.method872(local856);
								Static205.method3476(local856);
								if (local856.lb == -1) {
									Static283.method4312(local856.anInt94);
								}
								continue;
							}
							if (local31 == 1001) {
								local1 -= 4;
								local856.anInt114 = anIntArray877[local1];
								local856.anInt96 = anIntArray877[local1 + 1];
								local856.anInt81 = 0;
								local856.anInt75 = 0;
								local545 = anIntArray877[local1 + 2];
								if (local545 < 0) {
									local545 = 0;
								} else if (local545 > 4) {
									local545 = 4;
								}
								local744 = anIntArray877[local1 + 3];
								if (local744 < 0) {
									local744 = 0;
								} else if (local744 > 4) {
									local744 = 4;
								}
								local856.aByte1 = (byte) local545;
								local856.aByte2 = (byte) local744;
								Static51.method872(local856);
								Static205.method3476(local856);
								if (local856.anInt125 == 0) {
									Static35.method640(local856, false);
								}
								continue;
							}
							if (local31 == 1003) {
								local1--;
								local1269 = anIntArray877[local1] == 1;
								if (local856.aBoolean9 != local1269) {
									local856.aBoolean9 = local1269;
									Static51.method872(local856);
								}
								if (local856.lb == -1) {
									Static286.method4341(local856.anInt94);
								}
								continue;
							}
							if (local31 == 1004) {
								local1 -= 2;
								local856.anInt89 = anIntArray877[local1];
								local856.anInt63 = anIntArray877[local1 + 1];
								Static51.method872(local856);
								Static205.method3476(local856);
								if (local856.anInt125 == 0) {
									Static35.method640(local856, false);
								}
								continue;
							}
							if (local31 == 1005) {
								local1--;
								local856.aBoolean16 = anIntArray877[local1] == 1;
								continue;
							}
						} else if (local31 >= 1100 && local31 < 1200 || local31 >= 2100 && local31 < 2200) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local856 = Static380.method5560(anIntArray877[local1]);
							} else {
								local856 = local718 ? aClass4_21 : aClass4_20;
							}
							if (local31 == 1100) {
								local1 -= 2;
								local856.anInt53 = anIntArray877[local1];
								if (local856.anInt53 > local856.anInt68 - local856.anInt101) {
									local856.anInt53 = local856.anInt68 - local856.anInt101;
								}
								if (local856.anInt53 < 0) {
									local856.anInt53 = 0;
								}
								local856.anInt78 = anIntArray877[local1 + 1];
								if (local856.anInt78 > local856.anInt72 - local856.anInt113) {
									local856.anInt78 = local856.anInt72 - local856.anInt113;
								}
								if (local856.anInt78 < 0) {
									local856.anInt78 = 0;
								}
								Static51.method872(local856);
								if (local856.lb == -1) {
									Static169.method2975(local856.anInt94);
								}
								continue;
							}
							if (local31 == 1101) {
								local1--;
								local856.anInt57 = anIntArray877[local1];
								Static51.method872(local856);
								if (local856.lb == -1) {
									Static145.method4678(local856.anInt94);
								}
								continue;
							}
							if (local31 == 1102) {
								local1--;
								local856.aBoolean12 = anIntArray877[local1] == 1;
								Static51.method872(local856);
								continue;
							}
							if (local31 == 1103) {
								local1--;
								local856.anInt87 = anIntArray877[local1];
								Static51.method872(local856);
								continue;
							}
							if (local31 == 1104) {
								local1--;
								local856.anInt84 = anIntArray877[local1];
								Static51.method872(local856);
								continue;
							}
							if (local31 == 1105) {
								local1--;
								local545 = anIntArray877[local1];
								if (local856.anInt64 != local545) {
									local856.anInt64 = local545;
									Static51.method872(local856);
								}
								if (local856.lb == -1) {
									Static344.method4212(local856.anInt94);
								}
								continue;
							}
							if (local31 == 1106) {
								local1--;
								local856.anInt120 = anIntArray877[local1];
								Static51.method872(local856);
								continue;
							}
							if (local31 == 1107) {
								local1--;
								local856.aBoolean11 = anIntArray877[local1] == 1;
								Static51.method872(local856);
								continue;
							}
							if (local31 == 1108) {
								local856.anInt60 = 1;
								local1--;
								local856.anInt99 = anIntArray877[local1];
								Static51.method872(local856);
								if (local856.lb == -1) {
									Static273.method4171(local856.anInt94);
								}
								continue;
							}
							if (local31 == 1109) {
								local1 -= 6;
								local856.anInt123 = anIntArray877[local1];
								local856.anInt115 = anIntArray877[local1 + 1];
								local856.anInt112 = anIntArray877[local1 + 2];
								local856.anInt103 = anIntArray877[local1 + 3];
								local856.anInt61 = anIntArray877[local1 + 4];
								local856.anInt79 = anIntArray877[local1 + 5];
								Static51.method872(local856);
								if (local856.lb == -1) {
									Static381.method5580(local856.anInt94);
									Static52.method877(local856.anInt94);
								}
								continue;
							}
							if (local31 == 1110) {
								local1--;
								local545 = anIntArray877[local1];
								if (local856.anInt124 != local545) {
									local856.anInt124 = local545;
									local856.anInt85 = 0;
									local856.anInt105 = 1;
									local856.anInt117 = 0;
									Static51.method872(local856);
								}
								if (local856.lb == -1) {
									Static40.method705(local856.anInt94);
								}
								continue;
							}
							if (local31 == 1111) {
								local1--;
								local856.aBoolean18 = anIntArray877[local1] == 1;
								Static51.method872(local856);
								continue;
							}
							if (local31 == 1112) {
								local3--;
								local1702 = aStringArray116[local3];
								if (!local1702.equals(local856.aString1)) {
									local856.aString1 = local1702;
									Static51.method872(local856);
								}
								if (local856.lb == -1) {
									Static141.method2672(local856.anInt94);
								}
								continue;
							}
							if (local31 == 1113) {
								local1--;
								local856.anInt51 = anIntArray877[local1];
								Static51.method872(local856);
								if (local856.lb == -1) {
									Static50.method861(local856.anInt94);
								}
								continue;
							}
							if (local31 == 1114) {
								local1 -= 3;
								local856.anInt86 = anIntArray877[local1];
								local856.anInt49 = anIntArray877[local1 + 1];
								local856.anInt95 = anIntArray877[local1 + 2];
								Static51.method872(local856);
								continue;
							}
							if (local31 == 1115) {
								local1--;
								local856.aBoolean3 = anIntArray877[local1] == 1;
								Static51.method872(local856);
								continue;
							}
							if (local31 == 1116) {
								local1--;
								local856.anInt116 = anIntArray877[local1];
								Static51.method872(local856);
								continue;
							}
							if (local31 == 1117) {
								local1--;
								local856.anInt134 = anIntArray877[local1];
								Static51.method872(local856);
								continue;
							}
							if (local31 == 1118) {
								local1--;
								local856.aBoolean15 = anIntArray877[local1] == 1;
								Static51.method872(local856);
								continue;
							}
							if (local31 == 1119) {
								local1--;
								local856.aBoolean6 = anIntArray877[local1] == 1;
								Static51.method872(local856);
								continue;
							}
							if (local31 == 1120) {
								local1 -= 2;
								local856.anInt68 = anIntArray877[local1];
								local856.anInt72 = anIntArray877[local1 + 1];
								Static51.method872(local856);
								if (local856.anInt125 == 0) {
									Static35.method640(local856, false);
								}
								continue;
							}
							if (local31 == 1121) {
								local1 -= 2;
								local856.aShort3 = (short) anIntArray877[local1];
								local856.aShort2 = (short) anIntArray877[local1 + 1];
								Static51.method872(local856);
								continue;
							}
							if (local31 == 1122) {
								local1--;
								local856.aBoolean17 = anIntArray877[local1] == 1;
								Static51.method872(local856);
								continue;
							}
							if (local31 == 1123) {
								local1--;
								local856.anInt79 = anIntArray877[local1];
								Static51.method872(local856);
								if (local856.lb == -1) {
									Static381.method5580(local856.anInt94);
								}
								continue;
							}
							if (local31 == 1124) {
								local1--;
								local545 = anIntArray877[local1];
								local856.aBoolean7 = local545 == 1;
								Static51.method872(local856);
								continue;
							}
							if (local31 == 1125) {
								local1 -= 2;
								local856.anInt55 = anIntArray877[local1];
								local856.anInt126 = anIntArray877[local1 + 1];
								Static51.method872(local856);
								continue;
							}
						} else if (local31 >= 1200 && local31 < 1300 || !(local31 < 2200 || local31 >= 2300)) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local856 = Static380.method5560(anIntArray877[local1]);
							} else {
								local856 = local718 ? aClass4_21 : aClass4_20;
							}
							Static51.method872(local856);
							if (local31 == 1200 || local31 == 1205 || local31 == 1208 || local31 == 1209 || local31 == 1212 || local31 == 1213) {
								local1 -= 2;
								local545 = anIntArray877[local1];
								local744 = anIntArray877[local1 + 1];
								if (local856.lb == -1) {
									Static305.method4475(local856.anInt94);
									Static381.method5580(local856.anInt94);
									Static52.method877(local856.anInt94);
								}
								if (local545 == -1) {
									local856.anInt60 = 1;
									local856.anInt99 = -1;
									local856.anInt58 = -1;
									continue;
								}
								local856.anInt58 = local545;
								local856.anInt127 = local744;
								if (local31 == 1208 || local31 == 1209) {
									local856.aBoolean14 = true;
								} else {
									local856.aBoolean14 = false;
								}
								@Pc(2093) Class179 local2093 = Static15.aClass81_1.method2175(local545);
								local856.anInt112 = local2093.anInt4397;
								local856.anInt103 = local2093.anInt4386;
								local856.anInt61 = local2093.anInt4434;
								local856.anInt123 = local2093.anInt4388;
								local856.anInt115 = local2093.anInt4419;
								local856.anInt79 = local2093.anInt4399;
								if (local31 == 1205 || local31 == 1209) {
									local856.anInt93 = 0;
								} else if (local31 == 1212 || local31 == 1213) {
									local856.anInt93 = 1;
								} else {
									local856.anInt93 = 2;
								}
								if (local856.anInt81 > 0) {
									local856.anInt79 = local856.anInt79 * 32 / local856.anInt81;
								} else if (local856.anInt114 > 0) {
									local856.anInt79 = local856.anInt79 * 32 / local856.anInt114;
								}
								continue;
							}
							if (local31 == 1201) {
								local856.anInt60 = 2;
								local1--;
								local856.anInt99 = anIntArray877[local1];
								if (local856.lb == -1) {
									Static273.method4171(local856.anInt94);
								}
								continue;
							}
							if (local31 == 1202) {
								local856.anInt60 = 3;
								local856.anInt99 = -1;
								if (local856.lb == -1) {
									Static273.method4171(local856.anInt94);
								}
								continue;
							}
							if (local31 == 1203) {
								local856.anInt60 = 6;
								local1--;
								local856.anInt99 = anIntArray877[local1];
								if (local856.lb == -1) {
									Static273.method4171(local856.anInt94);
								}
								continue;
							}
							if (local31 == 1204) {
								local856.anInt60 = 5;
								local1--;
								local856.anInt99 = anIntArray877[local1];
								if (local856.lb == -1) {
									Static273.method4171(local856.anInt94);
								}
								continue;
							}
							if (local31 == 1206) {
								local1 -= 4;
								local856.anInt130 = anIntArray877[local1];
								local856.anInt110 = anIntArray877[local1 + 1];
								local856.anInt59 = anIntArray877[local1 + 2];
								local856.anInt106 = anIntArray877[local1 + 3];
								Static51.method872(local856);
								continue;
							}
							if (local31 == 1207) {
								local1 -= 2;
								local856.anInt104 = anIntArray877[local1];
								local856.anInt74 = anIntArray877[local1 + 1];
								Static51.method872(local856);
								continue;
							}
							if (local31 == 1210) {
								local1 -= 4;
								local856.anInt99 = anIntArray877[local1];
								local856.anInt62 = anIntArray877[local1 + 1];
								if (anIntArray877[local1 + 2] == 1) {
									local856.anInt60 = 9;
								} else {
									local856.anInt60 = 8;
								}
								if (anIntArray877[local1 + 3] == 1) {
									local856.aBoolean14 = true;
								} else {
									local856.aBoolean14 = false;
								}
								if (local856.lb == -1) {
									Static273.method4171(local856.anInt94);
								}
								continue;
							}
							if (local31 == 1211) {
								local856.anInt60 = 5;
								local856.anInt99 = Static176.anInt3381;
								local856.anInt62 = 0;
								if (local856.lb == -1) {
									Static273.method4171(local856.anInt94);
								}
								continue;
							}
						} else if (local31 >= 1300 && local31 < 1400 || local31 >= 2300 && local31 < 2400) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local856 = Static380.method5560(anIntArray877[local1]);
							} else {
								local856 = local718 ? aClass4_21 : aClass4_20;
							}
							if (local31 == 1300) {
								local1--;
								local545 = anIntArray877[local1] - 1;
								if (local545 >= 0 && local545 <= 9) {
									local3--;
									local856.method73(aStringArray116[local3], local545);
									continue;
								}
								local3--;
								continue;
							}
							if (local31 == 1301) {
								local1 -= 2;
								local545 = anIntArray877[local1];
								local744 = anIntArray877[local1 + 1];
								local856.aClass4_1 = Static164.method2913(local744, local545);
								continue;
							}
							if (local31 == 1302) {
								local1--;
								local545 = anIntArray877[local1];
								if (local545 == Static283.anInt4899 || local545 == Static249.anInt6516 || local545 == Static110.anInt2330) {
									local856.anInt118 = local545;
								}
								continue;
							}
							if (local31 == 1303) {
								local1--;
								local856.anInt73 = anIntArray877[local1];
								continue;
							}
							if (local31 == 1304) {
								local1--;
								local856.anInt66 = anIntArray877[local1];
								continue;
							}
							if (local31 == 1305) {
								local3--;
								local856.aString2 = aStringArray116[local3];
								continue;
							}
							if (local31 == 1306) {
								local3--;
								local856.aString5 = aStringArray116[local3];
								continue;
							}
							if (local31 == 1307) {
								local856.aStringArray6 = null;
								continue;
							}
							if (local31 == 1308) {
								local1--;
								local856.anInt70 = anIntArray877[local1];
								local1--;
								local856.anInt56 = anIntArray877[local1];
								continue;
							}
							if (local31 == 1309) {
								local1--;
								local545 = anIntArray877[local1];
								local1--;
								local744 = anIntArray877[local1];
								if (local744 >= 1 && local744 <= 10) {
									local856.method71(local744 - 1, local545);
								}
								continue;
							}
							if (local31 == 1310) {
								local3--;
								local856.aString4 = aStringArray116[local3];
								continue;
							}
							if (local31 == 1311) {
								local1--;
								local856.anInt107 = anIntArray877[local1];
								continue;
							}
						} else {
							if (local31 >= 1400 && local31 < 1500 || local31 >= 2400 && local31 < 2500) {
								if (local31 >= 2000) {
									local31 -= 1000;
									local1--;
									local856 = Static380.method5560(anIntArray877[local1]);
								} else {
									local856 = local718 ? aClass4_21 : aClass4_20;
								}
								local3--;
								local1702 = aStringArray116[local3];
								@Pc(2620) int[] local2620 = null;
								if (local1702.length() > 0 && local1702.charAt(local1702.length() - 1) == 'Y') {
									local1--;
									local395 = anIntArray877[local1];
									if (local395 > 0) {
										local2620 = new int[local395];
										while (local395-- > 0) {
											local1--;
											local2620[local395] = anIntArray877[local1];
										}
									}
									local1702 = local1702.substring(0, local1702.length() - 1);
								}
								@Pc(2666) Object[] local2666 = new Object[local1702.length() + 1];
								for (local414 = local2666.length - 1; local414 >= 1; local414--) {
									if (local1702.charAt(local414 - 1) == 's') {
										local3--;
										local2666[local414] = aStringArray116[local3];
									} else {
										local1--;
										local2666[local414] = Integer.valueOf(anIntArray877[local1]);
									}
								}
								local1--;
								local775 = anIntArray877[local1];
								if (local775 == -1) {
									local2666 = null;
								} else {
									local2666[0] = Integer.valueOf(local775);
								}
								if (local31 == 1400) {
									local856.anObjectArray11 = local2666;
								} else if (local31 == 1401) {
									local856.anObjectArray24 = local2666;
								} else if (local31 == 1402) {
									local856.anObjectArray25 = local2666;
								} else if (local31 == 1403) {
									local856.anObjectArray29 = local2666;
								} else if (local31 == 1404) {
									local856.anObjectArray16 = local2666;
								} else if (local31 == 1405) {
									local856.anObjectArray22 = local2666;
								} else if (local31 == 1406) {
									local856.anObjectArray19 = local2666;
								} else if (local31 == 1407) {
									local856.anObjectArray13 = local2666;
									local856.anIntArray37 = local2620;
								} else if (local31 == 1408) {
									local856.anObjectArray3 = local2666;
								} else if (local31 == 1409) {
									local856.anObjectArray27 = local2666;
								} else if (local31 == 1410) {
									local856.anObjectArray28 = local2666;
								} else if (local31 == 1411) {
									local856.anObjectArray26 = local2666;
								} else if (local31 == 1412) {
									local856.anObjectArray6 = local2666;
								} else if (local31 == 1414) {
									local856.anObjectArray2 = local2666;
									local856.anIntArray40 = local2620;
								} else if (local31 == 1415) {
									local856.anObjectArray17 = local2666;
									local856.anIntArray38 = local2620;
								} else if (local31 == 1416) {
									local856.anObjectArray10 = local2666;
								} else if (local31 == 1417) {
									local856.anObjectArray1 = local2666;
								} else if (local31 == 1418) {
									local856.anObjectArray23 = local2666;
								} else if (local31 == 1419) {
									local856.anObjectArray4 = local2666;
								} else if (local31 == 1420) {
									local856.anObjectArray20 = local2666;
								} else if (local31 == 1421) {
									local856.anObjectArray14 = local2666;
								} else if (local31 == 1422) {
									local856.anObjectArray12 = local2666;
								} else if (local31 == 1423) {
									local856.anObjectArray18 = local2666;
								} else if (local31 == 1424) {
									local856.anObjectArray5 = local2666;
								} else if (local31 == 1425) {
									local856.anObjectArray7 = local2666;
								} else if (local31 == 1426) {
									local856.anObjectArray21 = local2666;
								} else if (local31 == 1427) {
									local856.anObjectArray15 = local2666;
								} else if (local31 == 1428) {
									local856.anObjectArray9 = local2666;
									local856.anIntArray42 = local2620;
								} else if (local31 == 1429) {
									local856.anObjectArray30 = local2666;
									local856.anIntArray39 = local2620;
								}
								local856.aBoolean5 = true;
								continue;
							}
							if (local31 < 1600) {
								local856 = local718 ? aClass4_21 : aClass4_20;
								if (local31 == 1500) {
									anIntArray877[local1++] = local856.anInt71;
									continue;
								}
								if (local31 == 1501) {
									anIntArray877[local1++] = local856.anInt48;
									continue;
								}
								if (local31 == 1502) {
									anIntArray877[local1++] = local856.anInt101;
									continue;
								}
								if (local31 == 1503) {
									anIntArray877[local1++] = local856.anInt113;
									continue;
								}
								if (local31 == 1504) {
									anIntArray877[local1++] = local856.aBoolean9 ? 1 : 0;
									continue;
								}
								if (local31 == 1505) {
									anIntArray877[local1++] = local856.anInt88;
									continue;
								}
							} else if (local31 < 1700) {
								local856 = local718 ? aClass4_21 : aClass4_20;
								if (local31 == 1600) {
									anIntArray877[local1++] = local856.anInt53;
									continue;
								}
								if (local31 == 1601) {
									anIntArray877[local1++] = local856.anInt78;
									continue;
								}
								if (local31 == 1602) {
									aStringArray116[local3++] = local856.aString1;
									continue;
								}
								if (local31 == 1603) {
									anIntArray877[local1++] = local856.anInt68;
									continue;
								}
								if (local31 == 1604) {
									anIntArray877[local1++] = local856.anInt72;
									continue;
								}
								if (local31 == 1605) {
									anIntArray877[local1++] = local856.anInt79;
									continue;
								}
								if (local31 == 1606) {
									anIntArray877[local1++] = local856.anInt112;
									continue;
								}
								if (local31 == 1607) {
									anIntArray877[local1++] = local856.anInt61;
									continue;
								}
								if (local31 == 1608) {
									anIntArray877[local1++] = local856.anInt103;
									continue;
								}
								if (local31 == 1609) {
									anIntArray877[local1++] = local856.anInt87;
									continue;
								}
								if (local31 == 1610) {
									anIntArray877[local1++] = local856.anInt123;
									continue;
								}
								if (local31 == 1611) {
									anIntArray877[local1++] = local856.anInt115;
									continue;
								}
								if (local31 == 1612) {
									anIntArray877[local1++] = local856.anInt64;
									continue;
								}
							} else if (local31 < 1800) {
								local856 = local718 ? aClass4_21 : aClass4_20;
								if (local31 == 1700) {
									anIntArray877[local1++] = local856.anInt58;
									continue;
								}
								if (local31 == 1701) {
									if (local856.anInt58 == -1) {
										anIntArray877[local1++] = 0;
									} else {
										anIntArray877[local1++] = local856.anInt127;
									}
									continue;
								}
								if (local31 == 1702) {
									anIntArray877[local1++] = local856.lb;
									continue;
								}
							} else if (local31 < 1900) {
								local856 = local718 ? aClass4_21 : aClass4_20;
								if (local31 == 1800) {
									anIntArray877[local1++] = Static45.method784(local856).method642();
									continue;
								}
								if (local31 == 1801) {
									local1--;
									local545 = anIntArray877[local1];
									local545--;
									if (local856.aStringArray6 != null && local545 < local856.aStringArray6.length && local856.aStringArray6[local545] != null) {
										aStringArray116[local3++] = local856.aStringArray6[local545];
										continue;
									}
									aStringArray116[local3++] = "";
									continue;
								}
								if (local31 == 1802) {
									if (local856.aString2 == null) {
										aStringArray116[local3++] = "";
									} else {
										aStringArray116[local3++] = local856.aString2;
									}
									continue;
								}
							} else if (local31 < 2600) {
								local1--;
								local856 = Static380.method5560(anIntArray877[local1]);
								if (local31 == 2500) {
									anIntArray877[local1++] = local856.anInt71;
									continue;
								}
								if (local31 == 2501) {
									anIntArray877[local1++] = local856.anInt48;
									continue;
								}
								if (local31 == 2502) {
									anIntArray877[local1++] = local856.anInt101;
									continue;
								}
								if (local31 == 2503) {
									anIntArray877[local1++] = local856.anInt113;
									continue;
								}
								if (local31 == 2504) {
									anIntArray877[local1++] = local856.aBoolean9 ? 1 : 0;
									continue;
								}
								if (local31 == 2505) {
									anIntArray877[local1++] = local856.anInt88;
									continue;
								}
							} else if (local31 < 2700) {
								local1--;
								local856 = Static380.method5560(anIntArray877[local1]);
								if (local31 == 2600) {
									anIntArray877[local1++] = local856.anInt53;
									continue;
								}
								if (local31 == 2601) {
									anIntArray877[local1++] = local856.anInt78;
									continue;
								}
								if (local31 == 2602) {
									aStringArray116[local3++] = local856.aString1;
									continue;
								}
								if (local31 == 2603) {
									anIntArray877[local1++] = local856.anInt68;
									continue;
								}
								if (local31 == 2604) {
									anIntArray877[local1++] = local856.anInt72;
									continue;
								}
								if (local31 == 2605) {
									anIntArray877[local1++] = local856.anInt79;
									continue;
								}
								if (local31 == 2606) {
									anIntArray877[local1++] = local856.anInt112;
									continue;
								}
								if (local31 == 2607) {
									anIntArray877[local1++] = local856.anInt61;
									continue;
								}
								if (local31 == 2608) {
									anIntArray877[local1++] = local856.anInt103;
									continue;
								}
								if (local31 == 2609) {
									anIntArray877[local1++] = local856.anInt87;
									continue;
								}
								if (local31 == 2610) {
									anIntArray877[local1++] = local856.anInt123;
									continue;
								}
								if (local31 == 2611) {
									anIntArray877[local1++] = local856.anInt115;
									continue;
								}
								if (local31 == 2612) {
									anIntArray877[local1++] = local856.anInt64;
									continue;
								}
							} else {
								@Pc(3638) Class2_Sub38 local3638;
								@Pc(3554) Class2_Sub38 local3554;
								if (local31 < 2800) {
									if (local31 == 2700) {
										local1--;
										local856 = Static380.method5560(anIntArray877[local1]);
										anIntArray877[local1++] = local856.anInt58;
										continue;
									}
									if (local31 == 2701) {
										local1--;
										local856 = Static380.method5560(anIntArray877[local1]);
										if (local856.anInt58 == -1) {
											anIntArray877[local1++] = 0;
										} else {
											anIntArray877[local1++] = local856.anInt127;
										}
										continue;
									}
									if (local31 == 2702) {
										local1--;
										local540 = anIntArray877[local1];
										local3554 = (Class2_Sub38) Static12.aClass246_2.method5613((long) local540);
										if (local3554 == null) {
											anIntArray877[local1++] = 0;
										} else {
											anIntArray877[local1++] = 1;
										}
										continue;
									}
									if (local31 == 2703) {
										local1--;
										local856 = Static380.method5560(anIntArray877[local1]);
										if (local856.aClass4Array1 == null) {
											anIntArray877[local1++] = 0;
											continue;
										}
										local545 = local856.aClass4Array1.length;
										for (local744 = 0; local744 < local856.aClass4Array1.length; local744++) {
											if (local856.aClass4Array1[local744] == null) {
												local545 = local744;
												break;
											}
										}
										anIntArray877[local1++] = local545;
										continue;
									}
									if (local31 == 2704 || local31 == 2705) {
										local1 -= 2;
										local540 = anIntArray877[local1];
										local545 = anIntArray877[local1 + 1];
										local3638 = (Class2_Sub38) Static12.aClass246_2.method5613((long) local540);
										if (local3638 != null && local3638.anInt4976 == local545) {
											anIntArray877[local1++] = 1;
											continue;
										}
										anIntArray877[local1++] = 0;
										continue;
									}
								} else if (local31 < 2900) {
									local1--;
									local856 = Static380.method5560(anIntArray877[local1]);
									if (local31 == 2800) {
										anIntArray877[local1++] = Static45.method784(local856).method642();
										continue;
									}
									if (local31 == 2801) {
										local1--;
										local545 = anIntArray877[local1];
										local545--;
										if (local856.aStringArray6 != null && local545 < local856.aStringArray6.length && local856.aStringArray6[local545] != null) {
											aStringArray116[local3++] = local856.aStringArray6[local545];
											continue;
										}
										aStringArray116[local3++] = "";
										continue;
									}
									if (local31 == 2802) {
										if (local856.aString2 == null) {
											aStringArray116[local3++] = "";
										} else {
											aStringArray116[local3++] = local856.aString2;
										}
										continue;
									}
								} else if (local31 < 3200) {
									if (local31 == 3100) {
										local3--;
										local352 = aStringArray116[local3];
										Static351.method5638(local352);
										continue;
									}
									if (local31 == 3101) {
										local1 -= 2;
										Static359.method5244(anIntArray877[local1], Static206.aClass1_Sub5_Sub1_Sub1_1, anIntArray877[local1 + 1]);
										continue;
									}
									if (local31 == 3103) {
										Static236.method1935();
										continue;
									}
									if (local31 == 3104) {
										local3--;
										local352 = aStringArray116[local3];
										local545 = 0;
										if (Static34.method626(local352)) {
											local545 = Static189.method5666(local352);
										}
										Static216.method3597(Static200.aClass11_59);
										Static372.aClass2_Sub16_Sub2_4.method5355(local545);
										continue;
									}
									if (local31 == 3105) {
										local3--;
										local352 = aStringArray116[local3];
										Static216.method3597(Static106.aClass11_37);
										Static372.aClass2_Sub16_Sub2_4.method5358(local352.length() + 1);
										Static372.aClass2_Sub16_Sub2_4.method5362(local352);
										continue;
									}
									if (local31 == 3106) {
										local3--;
										local352 = aStringArray116[local3];
										Static216.method3597(Static379.aClass11_93);
										Static372.aClass2_Sub16_Sub2_4.method5358(local352.length() + 1);
										Static372.aClass2_Sub16_Sub2_4.method5362(local352);
										continue;
									}
									if (local31 == 3107) {
										local1--;
										local540 = anIntArray877[local1];
										local3--;
										local1702 = aStringArray116[local3];
										Static33.method598(local1702, local540);
										continue;
									}
									if (local31 == 3108) {
										local1 -= 3;
										local540 = anIntArray877[local1];
										local545 = anIntArray877[local1 + 1];
										local744 = anIntArray877[local1 + 2];
										local754 = Static380.method5560(local744);
										Static105.method2214(local754, local545, local540);
										continue;
									}
									if (local31 == 3109) {
										local1 -= 2;
										local540 = anIntArray877[local1];
										local545 = anIntArray877[local1 + 1];
										local923 = local718 ? aClass4_21 : aClass4_20;
										Static105.method2214(local923, local545, local540);
										continue;
									}
									if (local31 == 3110) {
										local1--;
										local540 = anIntArray877[local1];
										Static216.method3597(Static276.aClass11_74);
										Static372.aClass2_Sub16_Sub2_4.method5351(local540);
										continue;
									}
									if (local31 == 3111) {
										local1 -= 2;
										local540 = anIntArray877[local1];
										local545 = anIntArray877[local1 + 1];
										local3638 = (Class2_Sub38) Static12.aClass246_2.method5613((long) local540);
										if (local3638 != null) {
											Static293.method5577(local3638, true, local3638.anInt4976 != local545);
										}
										Static148.method2763(local545, true, 3, local540);
										continue;
									}
									if (local31 == 3112) {
										local1--;
										local540 = anIntArray877[local1];
										local3554 = (Class2_Sub38) Static12.aClass246_2.method5613((long) local540);
										if (local3554 != null && local3554.anInt4974 == 3) {
											Static293.method5577(local3554, true, true);
										}
										continue;
									}
								} else if (local31 < 3300) {
									if (local31 == 3200) {
										local1 -= 3;
										Static315.method4659(anIntArray877[local1], anIntArray877[local1 + 2], anIntArray877[local1 + 1], 255);
										continue;
									}
									if (local31 == 3201) {
										local1--;
										Static84.method1291(255, anIntArray877[local1]);
										continue;
									}
									if (local31 == 3202) {
										local1 -= 2;
										Static139.method2654(anIntArray877[local1 + 1], 255, anIntArray877[local1]);
										continue;
									}
								} else if (local31 < 3400) {
									if (local31 == 3300) {
										anIntArray877[local1++] = Static253.anInt4469;
										continue;
									}
									if (local31 == 3301) {
										local1 -= 2;
										local540 = anIntArray877[local1];
										local545 = anIntArray877[local1 + 1];
										anIntArray877[local1++] = Static213.method3563(local545, false, local540);
										continue;
									}
									if (local31 == 3302) {
										local1 -= 2;
										local540 = anIntArray877[local1];
										local545 = anIntArray877[local1 + 1];
										anIntArray877[local1++] = Static321.method4771(local540, false, local545);
										continue;
									}
									if (local31 == 3303) {
										local1 -= 2;
										local540 = anIntArray877[local1];
										local545 = anIntArray877[local1 + 1];
										anIntArray877[local1++] = Static257.method4004(local540, local545, false);
										continue;
									}
									if (local31 == 3304) {
										local1--;
										local540 = anIntArray877[local1];
										anIntArray877[local1++] = Static345.aClass180_2.method3969(local540).anInt4544;
										continue;
									}
									if (local31 == 3305) {
										local1--;
										local540 = anIntArray877[local1];
										anIntArray877[local1++] = Static267.anIntArray895[local540];
										continue;
									}
									if (local31 == 3306) {
										local1--;
										local540 = anIntArray877[local1];
										anIntArray877[local1++] = Static115.anIntArray476[local540];
										continue;
									}
									if (local31 == 3307) {
										local1--;
										local540 = anIntArray877[local1];
										anIntArray877[local1++] = Static214.anIntArray761[local540];
										continue;
									}
									if (local31 == 3308) {
										@Pc(4226) byte local4226 = Static206.aClass1_Sub5_Sub1_Sub1_1.aByte69;
										local545 = (Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6390 >> 7) + Static28.anInt606;
										local744 = (Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6386 >> 7) + Static319.anInt5425;
										anIntArray877[local1++] = (local4226 << 28) + (local545 << 14) + local744;
										continue;
									}
									if (local31 == 3309) {
										local1--;
										local540 = anIntArray877[local1];
										anIntArray877[local1++] = local540 >> 14 & 0x3FFF;
										continue;
									}
									if (local31 == 3310) {
										local1--;
										local540 = anIntArray877[local1];
										anIntArray877[local1++] = local540 >> 28;
										continue;
									}
									if (local31 == 3311) {
										local1--;
										local540 = anIntArray877[local1];
										anIntArray877[local1++] = local540 & 0x3FFF;
										continue;
									}
									if (local31 == 3312) {
										anIntArray877[local1++] = Static269.aBoolean348 ? 1 : 0;
										continue;
									}
									if (local31 == 3313) {
										local1 -= 2;
										local540 = anIntArray877[local1];
										local545 = anIntArray877[local1 + 1];
										anIntArray877[local1++] = Static213.method3563(local545, true, local540);
										continue;
									}
									if (local31 == 3314) {
										local1 -= 2;
										local540 = anIntArray877[local1];
										local545 = anIntArray877[local1 + 1];
										anIntArray877[local1++] = Static321.method4771(local540, true, local545);
										continue;
									}
									if (local31 == 3315) {
										local1 -= 2;
										local540 = anIntArray877[local1];
										local545 = anIntArray877[local1 + 1];
										anIntArray877[local1++] = Static257.method4004(local540, local545, true);
										continue;
									}
									if (local31 == 3316) {
										if (Static303.anInt5133 >= 2) {
											anIntArray877[local1++] = Static303.anInt5133;
										} else {
											anIntArray877[local1++] = 0;
										}
										continue;
									}
									if (local31 == 3317) {
										anIntArray877[local1++] = Static358.anInt2087;
										continue;
									}
									if (local31 == 3318) {
										anIntArray877[local1++] = Static347.anInt5864;
										continue;
									}
									if (local31 == 3321) {
										anIntArray877[local1++] = Static241.anInt4325;
										continue;
									}
									if (local31 == 3322) {
										anIntArray877[local1++] = Static89.anInt1708;
										continue;
									}
									if (local31 == 3323) {
										if (Static359.anInt6022 >= 5 && Static359.anInt6022 <= 9) {
											anIntArray877[local1++] = 1;
											continue;
										}
										anIntArray877[local1++] = 0;
										continue;
									}
									if (local31 == 3324) {
										if (Static359.anInt6022 >= 5 && Static359.anInt6022 <= 9) {
											anIntArray877[local1++] = Static359.anInt6022;
											continue;
										}
										anIntArray877[local1++] = 0;
										continue;
									}
									if (local31 == 3325) {
										anIntArray877[local1++] = Static330.aBoolean414 ? 1 : 0;
										continue;
									}
									if (local31 == 3326) {
										anIntArray877[local1++] = Static206.aClass1_Sub5_Sub1_Sub1_1.anInt2300;
										continue;
									}
									if (local31 == 3327) {
										anIntArray877[local1++] = Static206.aClass1_Sub5_Sub1_Sub1_1.aClass224_1.aBoolean416 ? 1 : 0;
										continue;
									}
									if (local31 == 3328) {
										anIntArray877[local1++] = Static305.aBoolean386 && !Static169.aBoolean245 ? 1 : 0;
										continue;
									}
									if (local31 == 3329) {
										anIntArray877[local1++] = Static51.aBoolean82 ? 1 : 0;
										continue;
									}
									if (local31 == 3330) {
										local1--;
										local540 = anIntArray877[local1];
										anIntArray877[local1++] = Static144.method2688(local540);
										continue;
									}
									if (local31 == 3331) {
										local1 -= 2;
										local540 = anIntArray877[local1];
										local545 = anIntArray877[local1 + 1];
										anIntArray877[local1++] = Static234.method3803(local545, false, local540);
										continue;
									}
									if (local31 == 3332) {
										local1 -= 2;
										local540 = anIntArray877[local1];
										local545 = anIntArray877[local1 + 1];
										anIntArray877[local1++] = Static234.method3803(local545, true, local540);
										continue;
									}
									if (local31 == 3333) {
										anIntArray877[local1++] = Static241.anInt4323;
										continue;
									}
									if (local31 == 3335) {
										anIntArray877[local1++] = Static107.anInt2498;
										continue;
									}
									if (local31 == 3336) {
										local1 -= 4;
										local540 = anIntArray877[local1];
										local545 = anIntArray877[local1 + 1];
										local744 = anIntArray877[local1 + 2];
										local395 = anIntArray877[local1 + 3];
										local540 += local545 << 14;
										local540 += local744 << 28;
										local540 += local395;
										anIntArray877[local1++] = local540;
										continue;
									}
									if (local31 == 3337) {
										anIntArray877[local1++] = Static16.anInt383;
										continue;
									}
									if (local31 == 3338) {
										anIntArray877[local1++] = Static355.method5206();
										continue;
									}
								} else if (local31 < 3500) {
									@Pc(4725) Class159 local4725;
									if (local31 == 3400) {
										local1 -= 2;
										local540 = anIntArray877[local1];
										local545 = anIntArray877[local1 + 1];
										local4725 = Static289.aClass235_1.method5390(local540);
										aStringArray116[local3++] = local4725.method3549(local545);
										continue;
									}
									if (local31 == 3408) {
										local1 -= 4;
										local540 = anIntArray877[local1];
										local545 = anIntArray877[local1 + 1];
										local744 = anIntArray877[local1 + 2];
										local395 = anIntArray877[local1 + 3];
										@Pc(4765) Class159 local4765 = Static289.aClass235_1.method5390(local744);
										if (local4765.aChar3 == local540 && local4765.aChar2 == local545) {
											if (local545 == 115) {
												aStringArray116[local3++] = local4765.method3549(local395);
											} else {
												anIntArray877[local1++] = local4765.method3558(local395);
											}
											continue;
										}
										throw new RuntimeException("C3408-1");
									}
									if (local31 == 3409) {
										local1 -= 3;
										local540 = anIntArray877[local1];
										local545 = anIntArray877[local1 + 1];
										local744 = anIntArray877[local1 + 2];
										if (local545 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(4832) Class159 local4832 = Static289.aClass235_1.method5390(local545);
										if (local4832.aChar2 != local540) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray877[local1++] = local4832.method3552(local744) ? 1 : 0;
										continue;
									}
									if (local31 == 3410) {
										local1--;
										local540 = anIntArray877[local1];
										local3--;
										local1702 = aStringArray116[local3];
										if (local540 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local4725 = Static289.aClass235_1.method5390(local540);
										if (local4725.aChar2 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray877[local1++] = local4725.method3547(local1702) ? 1 : 0;
										continue;
									}
									if (local31 == 3411) {
										local1--;
										local540 = anIntArray877[local1];
										@Pc(4915) Class159 local4915 = Static289.aClass235_1.method5390(local540);
										anIntArray877[local1++] = local4915.aClass246_17.method5615();
										continue;
									}
								} else if (local31 < 3700) {
									if (local31 == 3600) {
										if (Static339.anInt5795 == 0) {
											anIntArray877[local1++] = -2;
										} else if (Static339.anInt5795 == 1) {
											anIntArray877[local1++] = -1;
										} else {
											anIntArray877[local1++] = Static121.anInt2600;
										}
										continue;
									}
									if (local31 == 3601) {
										local1--;
										local540 = anIntArray877[local1];
										if (Static339.anInt5795 == 2 && local540 < Static121.anInt2600) {
											aStringArray116[local3++] = Static174.aStringArray82[local540];
											if (Static21.aStringArray13[local540] == null) {
												aStringArray116[local3++] = "";
											} else {
												aStringArray116[local3++] = Static21.aStringArray13[local540];
											}
											continue;
										}
										aStringArray116[local3++] = "";
										aStringArray116[local3++] = "";
										continue;
									}
									if (local31 == 3602) {
										local1--;
										local540 = anIntArray877[local1];
										if (Static339.anInt5795 == 2 && local540 < Static121.anInt2600) {
											anIntArray877[local1++] = Static249.anIntArray1341[local540];
											continue;
										}
										anIntArray877[local1++] = 0;
										continue;
									}
									if (local31 == 3603) {
										local1--;
										local540 = anIntArray877[local1];
										if (Static339.anInt5795 == 2 && local540 < Static121.anInt2600) {
											anIntArray877[local1++] = Static286.anIntArray981[local540];
											continue;
										}
										anIntArray877[local1++] = 0;
										continue;
									}
									if (local31 == 3604) {
										local3--;
										local352 = aStringArray116[local3];
										local1--;
										local545 = anIntArray877[local1];
										Static328.method4852(local352, local545);
										continue;
									}
									if (local31 == 3605) {
										local3--;
										local352 = aStringArray116[local3];
										Static203.method3444(local352);
										continue;
									}
									if (local31 == 3606) {
										local3--;
										local352 = aStringArray116[local3];
										Static201.method3377(local352);
										continue;
									}
									if (local31 == 3607) {
										local3--;
										local352 = aStringArray116[local3];
										Static191.method3272(local352, false);
										continue;
									}
									if (local31 == 3608) {
										local3--;
										local352 = aStringArray116[local3];
										Static206.method3478(local352);
										continue;
									}
									if (local31 == 3609) {
										local3--;
										local352 = aStringArray116[local3];
										if (local352.startsWith("<img=0>") || local352.startsWith("<img=1>")) {
											local352 = local352.substring(7);
										}
										anIntArray877[local1++] = Static202.method3436(local352) ? 1 : 0;
										continue;
									}
									if (local31 == 3610) {
										local1--;
										local540 = anIntArray877[local1];
										if (Static339.anInt5795 == 2 && local540 < Static121.anInt2600) {
											aStringArray116[local3++] = Static250.aStringArray113[local540];
											continue;
										}
										aStringArray116[local3++] = "";
										continue;
									}
									if (local31 == 3611) {
										if (Static303.aString56 == null) {
											aStringArray116[local3++] = "";
										} else {
											aStringArray116[local3++] = Static96.method1919(Static303.aString56);
										}
										continue;
									}
									if (local31 == 3612) {
										if (Static303.aString56 == null) {
											anIntArray877[local1++] = 0;
										} else {
											anIntArray877[local1++] = Static19.anInt436;
										}
										continue;
									}
									if (local31 == 3613) {
										local1--;
										local540 = anIntArray877[local1];
										if (Static303.aString56 != null && local540 < Static19.anInt436) {
											aStringArray116[local3++] = Static372.aClass234Array1[local540].aString61;
											continue;
										}
										aStringArray116[local3++] = "";
										continue;
									}
									if (local31 == 3614) {
										local1--;
										local540 = anIntArray877[local1];
										if (Static303.aString56 != null && local540 < Static19.anInt436) {
											anIntArray877[local1++] = Static372.aClass234Array1[local540].anInt6049;
											continue;
										}
										anIntArray877[local1++] = 0;
										continue;
									}
									if (local31 == 3615) {
										local1--;
										local540 = anIntArray877[local1];
										if (Static303.aString56 != null && local540 < Static19.anInt436) {
											anIntArray877[local1++] = Static372.aClass234Array1[local540].aByte62;
											continue;
										}
										anIntArray877[local1++] = 0;
										continue;
									}
									if (local31 == 3616) {
										anIntArray877[local1++] = Static213.aByte41;
										continue;
									}
									if (local31 == 3617) {
										local3--;
										local352 = aStringArray116[local3];
										Static113.method2351(local352);
										continue;
									}
									if (local31 == 3618) {
										anIntArray877[local1++] = Static269.aByte48;
										continue;
									}
									if (local31 == 3619) {
										local3--;
										local352 = aStringArray116[local3];
										Static249.method5597(local352);
										continue;
									}
									if (local31 == 3620) {
										Static242.method4236();
										continue;
									}
									if (local31 == 3621) {
										if (Static339.anInt5795 == 0) {
											anIntArray877[local1++] = -1;
										} else {
											anIntArray877[local1++] = Static376.anInt6317;
										}
										continue;
									}
									if (local31 == 3622) {
										local1--;
										local540 = anIntArray877[local1];
										if (Static339.anInt5795 != 0 && local540 < Static376.anInt6317) {
											aStringArray116[local3++] = Static347.aStringArray149[local540];
											if (Static366.aStringArray157[local540] == null) {
												aStringArray116[local3++] = "";
											} else {
												aStringArray116[local3++] = Static366.aStringArray157[local540];
											}
											continue;
										}
										aStringArray116[local3++] = "";
										aStringArray116[local3++] = "";
										continue;
									}
									if (local31 == 3623) {
										local3--;
										local352 = aStringArray116[local3];
										if (local352.startsWith("<img=0>") || local352.startsWith("<img=1>")) {
											local352 = local352.substring(7);
										}
										anIntArray877[local1++] = Static67.method1057(local352) ? 1 : 0;
										continue;
									}
									if (local31 == 3624) {
										local1--;
										local540 = anIntArray877[local1];
										if (Static372.aClass234Array1 != null && local540 < Static19.anInt436 && Static372.aClass234Array1[local540].aString60.equalsIgnoreCase(Static206.aClass1_Sub5_Sub1_Sub1_1.aString24)) {
											anIntArray877[local1++] = 1;
											continue;
										}
										anIntArray877[local1++] = 0;
										continue;
									}
									if (local31 == 3625) {
										if (Static261.aString53 == null) {
											aStringArray116[local3++] = "";
										} else {
											aStringArray116[local3++] = Static261.aString53;
										}
										continue;
									}
									if (local31 == 3626) {
										local1--;
										local540 = anIntArray877[local1];
										if (Static303.aString56 != null && local540 < Static19.anInt436) {
											aStringArray116[local3++] = Static372.aClass234Array1[local540].aString63;
											continue;
										}
										aStringArray116[local3++] = "";
										continue;
									}
									if (local31 == 3627) {
										local1--;
										local540 = anIntArray877[local1];
										if (Static339.anInt5795 == 2 && local540 >= 0 && local540 < Static121.anInt2600) {
											anIntArray877[local1++] = Static189.aBooleanArray38[local540] ? 1 : 0;
											continue;
										}
										anIntArray877[local1++] = 0;
										continue;
									}
									if (local31 == 3628) {
										local3--;
										local352 = aStringArray116[local3];
										if (local352.startsWith("<img=0>") || local352.startsWith("<img=1>")) {
											local352 = local352.substring(7);
										}
										anIntArray877[local1++] = Static209.method3514(local352);
										continue;
									}
									if (local31 == 3629) {
										anIntArray877[local1++] = Static104.anInt2158;
										continue;
									}
									if (local31 == 3630) {
										local3--;
										local352 = aStringArray116[local3];
										Static191.method3272(local352, true);
										continue;
									}
									if (local31 == 3631) {
										local1--;
										local540 = anIntArray877[local1];
										anIntArray877[local1++] = Static110.aBooleanArray15[local540] ? 1 : 0;
										continue;
									}
									if (local31 == 3632) {
										local1--;
										local540 = anIntArray877[local1];
										if (Static303.aString56 != null && local540 < Static19.anInt436) {
											aStringArray116[local3++] = Static372.aClass234Array1[local540].aString60;
											continue;
										}
										aStringArray116[local3++] = "";
										continue;
									}
									if (local31 == 3633) {
										local1--;
										local540 = anIntArray877[local1];
										if (Static339.anInt5795 != 0 && local540 < Static376.anInt6317) {
											aStringArray116[local3++] = Static290.aStringArray131[local540];
											continue;
										}
										aStringArray116[local3++] = "";
										continue;
									}
								} else if (local31 < 4000) {
									if (local31 == 3903) {
										local1--;
										local540 = anIntArray877[local1];
										anIntArray877[local1++] = Static61.aClass158Array1[local540].method3523();
										continue;
									}
									if (local31 == 3904) {
										local1--;
										local540 = anIntArray877[local1];
										anIntArray877[local1++] = Static61.aClass158Array1[local540].anInt3836;
										continue;
									}
									if (local31 == 3905) {
										local1--;
										local540 = anIntArray877[local1];
										anIntArray877[local1++] = Static61.aClass158Array1[local540].anInt3840;
										continue;
									}
									if (local31 == 3906) {
										local1--;
										local540 = anIntArray877[local1];
										anIntArray877[local1++] = Static61.aClass158Array1[local540].anInt3834;
										continue;
									}
									if (local31 == 3907) {
										local1--;
										local540 = anIntArray877[local1];
										anIntArray877[local1++] = Static61.aClass158Array1[local540].anInt3831;
										continue;
									}
									if (local31 == 3908) {
										local1--;
										local540 = anIntArray877[local1];
										anIntArray877[local1++] = Static61.aClass158Array1[local540].anInt3838;
										continue;
									}
									if (local31 == 3910) {
										local1--;
										local540 = anIntArray877[local1];
										local545 = Static61.aClass158Array1[local540].method3519();
										anIntArray877[local1++] = local545 == 0 ? 1 : 0;
										continue;
									}
									if (local31 == 3911) {
										local1--;
										local540 = anIntArray877[local1];
										local545 = Static61.aClass158Array1[local540].method3519();
										anIntArray877[local1++] = local545 == 2 ? 1 : 0;
										continue;
									}
									if (local31 == 3912) {
										local1--;
										local540 = anIntArray877[local1];
										local545 = Static61.aClass158Array1[local540].method3519();
										anIntArray877[local1++] = local545 == 5 ? 1 : 0;
										continue;
									}
									if (local31 == 3913) {
										local1--;
										local540 = anIntArray877[local1];
										local545 = Static61.aClass158Array1[local540].method3519();
										anIntArray877[local1++] = local545 == 1 ? 1 : 0;
										continue;
									}
								} else if (local31 < 4100) {
									if (local31 == 4000) {
										local1 -= 2;
										local540 = anIntArray877[local1];
										local545 = anIntArray877[local1 + 1];
										anIntArray877[local1++] = local540 + local545;
										continue;
									}
									if (local31 == 4001) {
										local1 -= 2;
										local540 = anIntArray877[local1];
										local545 = anIntArray877[local1 + 1];
										anIntArray877[local1++] = local540 - local545;
										continue;
									}
									if (local31 == 4002) {
										local1 -= 2;
										local540 = anIntArray877[local1];
										local545 = anIntArray877[local1 + 1];
										anIntArray877[local1++] = local540 * local545;
										continue;
									}
									if (local31 == 4003) {
										local1 -= 2;
										local540 = anIntArray877[local1];
										local545 = anIntArray877[local1 + 1];
										anIntArray877[local1++] = local540 / local545;
										continue;
									}
									if (local31 == 4004) {
										local1--;
										local540 = anIntArray877[local1];
										anIntArray877[local1++] = (int) (Math.random() * (double) local540);
										continue;
									}
									if (local31 == 4005) {
										local1--;
										local540 = anIntArray877[local1];
										anIntArray877[local1++] = (int) (Math.random() * (double) (local540 + 1));
										continue;
									}
									if (local31 == 4006) {
										local1 -= 5;
										local540 = anIntArray877[local1];
										local545 = anIntArray877[local1 + 1];
										local744 = anIntArray877[local1 + 2];
										local395 = anIntArray877[local1 + 3];
										local414 = anIntArray877[local1 + 4];
										anIntArray877[local1++] = local540 + (local545 - local540) * (local414 - local744) / (local395 - local744);
										continue;
									}
									@Pc(6089) long local6089;
									@Pc(6082) long local6082;
									if (local31 == 4007) {
										local1 -= 2;
										local6082 = anIntArray877[local1];
										local6089 = anIntArray877[local1 + 1];
										anIntArray877[local1++] = (int) (local6082 + local6082 * local6089 / 100L);
										continue;
									}
									if (local31 == 4008) {
										local1 -= 2;
										local540 = anIntArray877[local1];
										local545 = anIntArray877[local1 + 1];
										anIntArray877[local1++] = local540 | 0x1 << local545;
										continue;
									}
									if (local31 == 4009) {
										local1 -= 2;
										local540 = anIntArray877[local1];
										local545 = anIntArray877[local1 + 1];
										anIntArray877[local1++] = local540 & -(0x1 << local545) - 1;
										continue;
									}
									if (local31 == 4010) {
										local1 -= 2;
										local540 = anIntArray877[local1];
										local545 = anIntArray877[local1 + 1];
										anIntArray877[local1++] = (local540 & 0x1 << local545) == 0 ? 0 : 1;
										continue;
									}
									if (local31 == 4011) {
										local1 -= 2;
										local540 = anIntArray877[local1];
										local545 = anIntArray877[local1 + 1];
										anIntArray877[local1++] = local540 % local545;
										continue;
									}
									if (local31 == 4012) {
										local1 -= 2;
										local540 = anIntArray877[local1];
										local545 = anIntArray877[local1 + 1];
										if (local540 == 0) {
											anIntArray877[local1++] = 0;
										} else {
											anIntArray877[local1++] = (int) Math.pow((double) local540, (double) local545);
										}
										continue;
									}
									if (local31 == 4013) {
										local1 -= 2;
										local540 = anIntArray877[local1];
										local545 = anIntArray877[local1 + 1];
										if (local540 == 0) {
											anIntArray877[local1++] = 0;
										} else if (local545 == 0) {
											anIntArray877[local1++] = Integer.MAX_VALUE;
										} else {
											anIntArray877[local1++] = (int) Math.pow((double) local540, 1.0D / (double) local545);
										}
										continue;
									}
									if (local31 == 4014) {
										local1 -= 2;
										local540 = anIntArray877[local1];
										local545 = anIntArray877[local1 + 1];
										anIntArray877[local1++] = local540 & local545;
										continue;
									}
									if (local31 == 4015) {
										local1 -= 2;
										local540 = anIntArray877[local1];
										local545 = anIntArray877[local1 + 1];
										anIntArray877[local1++] = local540 | local545;
										continue;
									}
									if (local31 == 4016) {
										local1 -= 2;
										local540 = anIntArray877[local1];
										local545 = anIntArray877[local1 + 1];
										anIntArray877[local1++] = local540 < local545 ? local540 : local545;
										continue;
									}
									if (local31 == 4017) {
										local1 -= 2;
										local540 = anIntArray877[local1];
										local545 = anIntArray877[local1 + 1];
										anIntArray877[local1++] = local540 > local545 ? local540 : local545;
										continue;
									}
									if (local31 == 4018) {
										local1 -= 3;
										local6082 = anIntArray877[local1];
										local6089 = anIntArray877[local1 + 1];
										@Pc(6395) long local6395 = (long) anIntArray877[local1 + 2];
										anIntArray877[local1++] = (int) (local6082 * local6395 / local6089);
										continue;
									}
								} else {
									@Pc(6934) boolean local6934;
									if (local31 < 4200) {
										if (local31 == 4100) {
											local3--;
											local352 = aStringArray116[local3];
											local1--;
											local545 = anIntArray877[local1];
											aStringArray116[local3++] = local352 + local545;
											continue;
										}
										if (local31 == 4101) {
											local3 -= 2;
											local352 = aStringArray116[local3];
											local1702 = aStringArray116[local3 + 1];
											aStringArray116[local3++] = local352 + local1702;
											continue;
										}
										if (local31 == 4102) {
											local3--;
											local352 = aStringArray116[local3];
											local1--;
											local545 = anIntArray877[local1];
											aStringArray116[local3++] = local352 + Static247.method4893(local545);
											continue;
										}
										if (local31 == 4103) {
											local3--;
											local352 = aStringArray116[local3];
											aStringArray116[local3++] = local352.toLowerCase();
											continue;
										}
										if (local31 == 4104) {
											local1--;
											local540 = anIntArray877[local1];
											@Pc(6521) long local6521 = ((long) local540 + 11745L) * 86400000L;
											aCalendar2.setTime(new Date(local6521));
											local395 = aCalendar2.get(5);
											local414 = aCalendar2.get(2);
											local775 = aCalendar2.get(1);
											aStringArray116[local3++] = local395 + "-" + aStringArray118[local414] + "-" + local775;
											continue;
										}
										if (local31 == 4105) {
											local3 -= 2;
											local352 = aStringArray116[local3];
											local1702 = aStringArray116[local3 + 1];
											if (Static206.aClass1_Sub5_Sub1_Sub1_1.aClass224_1 != null && Static206.aClass1_Sub5_Sub1_Sub1_1.aClass224_1.aBoolean416) {
												aStringArray116[local3++] = local1702;
												continue;
											}
											aStringArray116[local3++] = local352;
											continue;
										}
										if (local31 == 4106) {
											local1--;
											local540 = anIntArray877[local1];
											aStringArray116[local3++] = Integer.toString(local540);
											continue;
										}
										if (local31 == 4107) {
											local3 -= 2;
											anIntArray877[local1++] = Static162.method2892(aStringArray116[local3 + 1], aStringArray116[local3], Static107.anInt2498);
											continue;
										}
										@Pc(6653) Class136 local6653;
										if (local31 == 4108) {
											local3--;
											local352 = aStringArray116[local3];
											local1 -= 2;
											local545 = anIntArray877[local1];
											local744 = anIntArray877[local1 + 1];
											local6653 = Static230.method3732(local744, Static120.aClass171_35);
											anIntArray877[local1++] = local6653.method3128(Static63.aClass18Array3, local352, local545);
											continue;
										}
										if (local31 == 4109) {
											local3--;
											local352 = aStringArray116[local3];
											local1 -= 2;
											local545 = anIntArray877[local1];
											local744 = anIntArray877[local1 + 1];
											local6653 = Static230.method3732(local744, Static120.aClass171_35);
											anIntArray877[local1++] = local6653.method3121(Static63.aClass18Array3, local352, local545);
											continue;
										}
										if (local31 == 4110) {
											local3 -= 2;
											local352 = aStringArray116[local3];
											local1702 = aStringArray116[local3 + 1];
											local1--;
											if (anIntArray877[local1] == 1) {
												aStringArray116[local3++] = local352;
											} else {
												aStringArray116[local3++] = local1702;
											}
											continue;
										}
										if (local31 == 4111) {
											local3--;
											local352 = aStringArray116[local3];
											aStringArray116[local3++] = Static249.method5599(local352);
											continue;
										}
										if (local31 == 4112) {
											local3--;
											local352 = aStringArray116[local3];
											local1--;
											local545 = anIntArray877[local1];
											if (local545 == -1) {
												throw new RuntimeException("null char");
											}
											aStringArray116[local3++] = local352 + (char) local545;
											continue;
										}
										if (local31 == 4113) {
											local1--;
											local540 = anIntArray877[local1];
											anIntArray877[local1++] = Static217.method3609((char) local540) ? 1 : 0;
											continue;
										}
										if (local31 == 4114) {
											local1--;
											local540 = anIntArray877[local1];
											anIntArray877[local1++] = Static131.method2584((char) local540) ? 1 : 0;
											continue;
										}
										if (local31 == 4115) {
											local1--;
											local540 = anIntArray877[local1];
											anIntArray877[local1++] = Static72.method4061((char) local540) ? 1 : 0;
											continue;
										}
										if (local31 == 4116) {
											local1--;
											local540 = anIntArray877[local1];
											anIntArray877[local1++] = Static8.method185((char) local540) ? 1 : 0;
											continue;
										}
										if (local31 == 4117) {
											local3--;
											local352 = aStringArray116[local3];
											if (local352 == null) {
												anIntArray877[local1++] = 0;
											} else {
												anIntArray877[local1++] = local352.length();
											}
											continue;
										}
										if (local31 == 4118) {
											local3--;
											local352 = aStringArray116[local3];
											local1 -= 2;
											local545 = anIntArray877[local1];
											local744 = anIntArray877[local1 + 1];
											aStringArray116[local3++] = local352.substring(local545, local744);
											continue;
										}
										if (local31 == 4119) {
											local3--;
											local352 = aStringArray116[local3];
											@Pc(6932) StringBuffer local6932 = new StringBuffer(local352.length());
											local6934 = false;
											for (local395 = 0; local395 < local352.length(); local395++) {
												@Pc(6941) char local6941 = local352.charAt(local395);
												if (local6941 == '<') {
													local6934 = true;
												} else if (local6941 == '>') {
													local6934 = false;
												} else if (!local6934) {
													local6932.append(local6941);
												}
											}
											aStringArray116[local3++] = local6932.toString();
											continue;
										}
										if (local31 == 4120) {
											local3--;
											local352 = aStringArray116[local3];
											local1 -= 2;
											local545 = anIntArray877[local1];
											local744 = anIntArray877[local1 + 1];
											anIntArray877[local1++] = local352.indexOf(local545, local744);
											continue;
										}
										if (local31 == 4121) {
											local3 -= 2;
											local352 = aStringArray116[local3];
											local1702 = aStringArray116[local3 + 1];
											local1--;
											local744 = anIntArray877[local1];
											anIntArray877[local1++] = local352.indexOf(local1702, local744);
											continue;
										}
										if (local31 == 4122) {
											local1--;
											local540 = anIntArray877[local1];
											anIntArray877[local1++] = Character.toLowerCase((char) local540);
											continue;
										}
										if (local31 == 4123) {
											local1--;
											local540 = anIntArray877[local1];
											anIntArray877[local1++] = Character.toUpperCase((char) local540);
											continue;
										}
										if (local31 == 4124) {
											local1--;
											local1073 = anIntArray877[local1] != 0;
											local1--;
											local545 = anIntArray877[local1];
											aStringArray116[local3++] = Static131.method2583(Static107.anInt2498, 0, (long) local545, local1073);
											continue;
										}
										if (local31 == 4125) {
											local3--;
											local352 = aStringArray116[local3];
											local1--;
											local545 = anIntArray877[local1];
											@Pc(7107) Class136 local7107 = Static230.method3732(local545, Static120.aClass171_35);
											anIntArray877[local1++] = local7107.method3123(local352, Static63.aClass18Array3);
											continue;
										}
									} else {
										@Pc(7383) Class144 local7383;
										if (local31 < 4300) {
											if (local31 == 4200) {
												local1--;
												local540 = anIntArray877[local1];
												aStringArray116[local3++] = Static15.aClass81_1.method2175(local540).aString51;
												continue;
											}
											@Pc(7157) Class179 local7157;
											if (local31 == 4201) {
												local1 -= 2;
												local540 = anIntArray877[local1];
												local545 = anIntArray877[local1 + 1];
												local7157 = Static15.aClass81_1.method2175(local540);
												if (local545 >= 1 && local545 <= 5 && local7157.aStringArray110[local545 - 1] != null) {
													aStringArray116[local3++] = local7157.aStringArray110[local545 - 1];
													continue;
												}
												aStringArray116[local3++] = "";
												continue;
											}
											if (local31 == 4202) {
												local1 -= 2;
												local540 = anIntArray877[local1];
												local545 = anIntArray877[local1 + 1];
												local7157 = Static15.aClass81_1.method2175(local540);
												if (local545 >= 1 && local545 <= 5 && local7157.aStringArray111[local545 - 1] != null) {
													aStringArray116[local3++] = local7157.aStringArray111[local545 - 1];
													continue;
												}
												aStringArray116[local3++] = "";
												continue;
											}
											if (local31 == 4203) {
												local1--;
												local540 = anIntArray877[local1];
												anIntArray877[local1++] = Static15.aClass81_1.method2175(local540).anInt4433;
												continue;
											}
											if (local31 == 4204) {
												local1--;
												local540 = anIntArray877[local1];
												anIntArray877[local1++] = Static15.aClass81_1.method2175(local540).anInt4421 == 1 ? 1 : 0;
												continue;
											}
											@Pc(7290) Class179 local7290;
											if (local31 == 4205) {
												local1--;
												local540 = anIntArray877[local1];
												local7290 = Static15.aClass81_1.method2175(local540);
												if (local7290.anInt4398 == -1 && local7290.anInt4426 >= 0) {
													anIntArray877[local1++] = local7290.anInt4426;
													continue;
												}
												anIntArray877[local1++] = local540;
												continue;
											}
											if (local31 == 4206) {
												local1--;
												local540 = anIntArray877[local1];
												local7290 = Static15.aClass81_1.method2175(local540);
												if (local7290.anInt4398 >= 0 && local7290.anInt4426 >= 0) {
													anIntArray877[local1++] = local7290.anInt4426;
													continue;
												}
												anIntArray877[local1++] = local540;
												continue;
											}
											if (local31 == 4207) {
												local1--;
												local540 = anIntArray877[local1];
												anIntArray877[local1++] = Static15.aClass81_1.method2175(local540).aBoolean334 ? 1 : 0;
												continue;
											}
											if (local31 == 4208) {
												local1 -= 2;
												local540 = anIntArray877[local1];
												local545 = anIntArray877[local1 + 1];
												local7383 = Static261.aClass125_2.method2922(local545);
												if (local7383.method3307()) {
													aStringArray116[local3++] = Static15.aClass81_1.method2175(local540).method3936(local545, local7383.aString42);
												} else {
													anIntArray877[local1++] = Static15.aClass81_1.method2175(local540).method3943(local7383.anInt3627, local545);
												}
												continue;
											}
											if (local31 == 4209) {
												local1 -= 2;
												local540 = anIntArray877[local1];
												local545 = anIntArray877[local1 + 1] - 1;
												local7157 = Static15.aClass81_1.method2175(local540);
												if (local7157.anInt4394 == local545) {
													anIntArray877[local1++] = local7157.anInt4427;
												} else if (local7157.anInt4411 == local545) {
													anIntArray877[local1++] = local7157.anInt4418;
												} else {
													anIntArray877[local1++] = -1;
												}
												continue;
											}
											if (local31 == 4210) {
												local3--;
												local352 = aStringArray116[local3];
												local1--;
												local545 = anIntArray877[local1];
												Static158.method2850(local545 == 1, local352);
												anIntArray877[local1++] = Static264.anInt4609;
												continue;
											}
											if (local31 == 4211) {
												if (Static161.aShortArray53 != null && Static235.anInt4194 < Static264.anInt4609) {
													anIntArray877[local1++] = Static161.aShortArray53[Static235.anInt4194++] & 0xFFFF;
													continue;
												}
												anIntArray877[local1++] = -1;
												continue;
											}
											if (local31 == 4212) {
												Static235.anInt4194 = 0;
												continue;
											}
										} else if (local31 < 4400) {
											if (local31 == 4300) {
												local1 -= 2;
												local540 = anIntArray877[local1];
												local545 = anIntArray877[local1 + 1];
												local7383 = Static261.aClass125_2.method2922(local545);
												if (local7383.method3307()) {
													aStringArray116[local3++] = Static356.aClass48_2.method951(local540).method3089(local7383.aString42, local545);
												} else {
													anIntArray877[local1++] = Static356.aClass48_2.method951(local540).method3090(local545, local7383.anInt3627);
												}
												continue;
											}
										} else if (local31 < 4500) {
											if (local31 == 4400) {
												local1 -= 2;
												local540 = anIntArray877[local1];
												local545 = anIntArray877[local1 + 1];
												local7383 = Static261.aClass125_2.method2922(local545);
												if (local7383.method3307()) {
													aStringArray116[local3++] = Static221.aClass118_6.method2858(local540).method3782(local545, local7383.aString42);
												} else {
													anIntArray877[local1++] = Static221.aClass118_6.method2858(local540).method3784(local545, local7383.anInt3627);
												}
												continue;
											}
										} else if (local31 < 4600) {
											if (local31 == 4500) {
												local1 -= 2;
												local540 = anIntArray877[local1];
												local545 = anIntArray877[local1 + 1];
												local7383 = Static261.aClass125_2.method2922(local545);
												if (local7383.method3307()) {
													aStringArray116[local3++] = Static170.aClass149_1.method3334(local540).method4587(local545, local7383.aString42);
												} else {
													anIntArray877[local1++] = Static170.aClass149_1.method3334(local540).method4588(local545, local7383.anInt3627);
												}
												continue;
											}
										} else if (local31 < 4700) {
											if (local31 == 4600) {
												local1--;
												local540 = anIntArray877[local1];
												@Pc(7704) Class103 local7704 = Static46.aClass139_1.method3157(local540);
												if (local7704.anIntArray579 != null && local7704.anIntArray579.length > 0) {
													local744 = 0;
													local395 = local7704.anIntArray580[0];
													for (local414 = 1; local414 < local7704.anIntArray579.length; local414++) {
														if (local7704.anIntArray580[local414] > local395) {
															local744 = local414;
															local395 = local7704.anIntArray580[local414];
														}
													}
													anIntArray877[local1++] = local7704.anIntArray579[local744];
													continue;
												}
												anIntArray877[local1++] = local7704.anInt2825;
												continue;
											}
										} else if (local31 < 5100) {
											if (local31 == 5000) {
												anIntArray877[local1++] = Static156.anInt3026;
												continue;
											}
											if (local31 == 5001) {
												local1 -= 3;
												Static156.anInt3026 = anIntArray877[local1];
												Static369.anInt6250 = anIntArray877[local1 + 1];
												Static254.anInt4497 = anIntArray877[local1 + 2];
												Static216.method3597(Static32.aClass11_10);
												Static372.aClass2_Sub16_Sub2_4.method5358(Static156.anInt3026);
												Static372.aClass2_Sub16_Sub2_4.method5358(Static369.anInt6250);
												Static372.aClass2_Sub16_Sub2_4.method5358(Static254.anInt4497);
												continue;
											}
											if (local31 == 5002) {
												local3 -= 2;
												local352 = aStringArray116[local3];
												local1702 = aStringArray116[local3 + 1];
												local1 -= 2;
												local744 = anIntArray877[local1];
												local395 = anIntArray877[local1 + 1];
												if (local1702 == null) {
													local1702 = "";
												}
												if (local1702.length() > 80) {
													local1702 = local1702.substring(0, 80);
												}
												Static216.method3597(Static36.aClass11_12);
												Static372.aClass2_Sub16_Sub2_4.method5358(Static204.method3471(local352) + Static204.method3471(local1702) + 2);
												Static372.aClass2_Sub16_Sub2_4.method5362(local352);
												Static372.aClass2_Sub16_Sub2_4.method5358(local744 - 1);
												Static372.aClass2_Sub16_Sub2_4.method5358(local395);
												Static372.aClass2_Sub16_Sub2_4.method5362(local1702);
												continue;
											}
											if (local31 == 5003) {
												local1--;
												local540 = anIntArray877[local1];
												local1702 = null;
												if (local540 < 100) {
													local1702 = Static220.aStringArray99[local540];
												}
												if (local1702 == null) {
													local1702 = "";
												}
												aStringArray116[local3++] = local1702;
												continue;
											}
											if (local31 == 5004) {
												local1--;
												local540 = anIntArray877[local1];
												local545 = -1;
												if (local540 < 100 && Static220.aStringArray99[local540] != null) {
													local545 = Static44.anIntArray182[local540];
												}
												anIntArray877[local1++] = local545;
												continue;
											}
											if (local31 == 5005) {
												anIntArray877[local1++] = Static369.anInt6250;
												continue;
											}
											if (local31 == 5008) {
												local3--;
												local352 = aStringArray116[local3];
												if (Static303.anInt5133 == 0 && (Static305.aBoolean386 && !Static169.aBoolean245 || Static51.aBoolean82)) {
													continue;
												}
												local1702 = local352.toLowerCase();
												@Pc(7969) byte local7969 = 0;
												if (local1702.startsWith(Static198.aClass32_52.method701(0))) {
													local7969 = 0;
													local352 = local352.substring(Static198.aClass32_52.method701(0).length());
												} else if (local1702.startsWith(Static326.aClass32_88.method701(0))) {
													local7969 = 1;
													local352 = local352.substring(Static326.aClass32_88.method701(0).length());
												} else if (local1702.startsWith(Static206.aClass32_54.method701(0))) {
													local7969 = 2;
													local352 = local352.substring(Static206.aClass32_54.method701(0).length());
												} else if (local1702.startsWith(Static125.aClass32_37.method701(0))) {
													local7969 = 3;
													local352 = local352.substring(Static125.aClass32_37.method701(0).length());
												} else if (local1702.startsWith(Static348.aClass32_93.method701(0))) {
													local7969 = 4;
													local352 = local352.substring(Static348.aClass32_93.method701(0).length());
												} else if (local1702.startsWith(Static278.aClass32_75.method701(0))) {
													local7969 = 5;
													local352 = local352.substring(Static278.aClass32_75.method701(0).length());
												} else if (local1702.startsWith(Static263.aClass32_68.method701(0))) {
													local7969 = 6;
													local352 = local352.substring(Static263.aClass32_68.method701(0).length());
												} else if (local1702.startsWith(Static3.aClass32_2.method701(0))) {
													local7969 = 7;
													local352 = local352.substring(Static3.aClass32_2.method701(0).length());
												} else if (local1702.startsWith(Static193.aClass32_50.method701(0))) {
													local7969 = 8;
													local352 = local352.substring(Static193.aClass32_50.method701(0).length());
												} else if (local1702.startsWith(Static371.aClass32_98.method701(0))) {
													local7969 = 9;
													local352 = local352.substring(Static371.aClass32_98.method701(0).length());
												} else if (local1702.startsWith(Static273.aClass32_73.method701(0))) {
													local7969 = 10;
													local352 = local352.substring(Static273.aClass32_73.method701(0).length());
												} else if (local1702.startsWith(Static30.aClass32_12.method701(0))) {
													local7969 = 11;
													local352 = local352.substring(Static30.aClass32_12.method701(0).length());
												} else if (Static107.anInt2498 != 0) {
													if (local1702.startsWith(Static198.aClass32_52.method701(Static107.anInt2498))) {
														local7969 = 0;
														local352 = local352.substring(Static198.aClass32_52.method701(Static107.anInt2498).length());
													} else if (local1702.startsWith(Static326.aClass32_88.method701(Static107.anInt2498))) {
														local7969 = 1;
														local352 = local352.substring(Static326.aClass32_88.method701(Static107.anInt2498).length());
													} else if (local1702.startsWith(Static206.aClass32_54.method701(Static107.anInt2498))) {
														local7969 = 2;
														local352 = local352.substring(Static206.aClass32_54.method701(Static107.anInt2498).length());
													} else if (local1702.startsWith(Static125.aClass32_37.method701(Static107.anInt2498))) {
														local7969 = 3;
														local352 = local352.substring(Static125.aClass32_37.method701(Static107.anInt2498).length());
													} else if (local1702.startsWith(Static348.aClass32_93.method701(Static107.anInt2498))) {
														local7969 = 4;
														local352 = local352.substring(Static348.aClass32_93.method701(Static107.anInt2498).length());
													} else if (local1702.startsWith(Static278.aClass32_75.method701(Static107.anInt2498))) {
														local7969 = 5;
														local352 = local352.substring(Static278.aClass32_75.method701(Static107.anInt2498).length());
													} else if (local1702.startsWith(Static263.aClass32_68.method701(Static107.anInt2498))) {
														local7969 = 6;
														local352 = local352.substring(Static263.aClass32_68.method701(Static107.anInt2498).length());
													} else if (local1702.startsWith(Static3.aClass32_2.method701(Static107.anInt2498))) {
														local7969 = 7;
														local352 = local352.substring(Static3.aClass32_2.method701(Static107.anInt2498).length());
													} else if (local1702.startsWith(Static193.aClass32_50.method701(Static107.anInt2498))) {
														local7969 = 8;
														local352 = local352.substring(Static193.aClass32_50.method701(Static107.anInt2498).length());
													} else if (local1702.startsWith(Static371.aClass32_98.method701(Static107.anInt2498))) {
														local7969 = 9;
														local352 = local352.substring(Static371.aClass32_98.method701(Static107.anInt2498).length());
													} else if (local1702.startsWith(Static273.aClass32_73.method701(Static107.anInt2498))) {
														local7969 = 10;
														local352 = local352.substring(Static273.aClass32_73.method701(Static107.anInt2498).length());
													} else if (local1702.startsWith(Static30.aClass32_12.method701(Static107.anInt2498))) {
														local7969 = 11;
														local352 = local352.substring(Static30.aClass32_12.method701(Static107.anInt2498).length());
													}
												}
												local1702 = local352.toLowerCase();
												@Pc(8407) byte local8407 = 0;
												if (local1702.startsWith(Static250.aClass32_62.method701(0))) {
													local8407 = 1;
													local352 = local352.substring(Static250.aClass32_62.method701(0).length());
												} else if (local1702.startsWith(Static326.aClass32_87.method701(0))) {
													local8407 = 2;
													local352 = local352.substring(Static326.aClass32_87.method701(0).length());
												} else if (local1702.startsWith(Static80.aClass32_27.method701(0))) {
													local8407 = 3;
													local352 = local352.substring(Static80.aClass32_27.method701(0).length());
												} else if (local1702.startsWith(Static384.aClass32_103.method701(0))) {
													local8407 = 4;
													local352 = local352.substring(Static384.aClass32_103.method701(0).length());
												} else if (local1702.startsWith(Static323.aClass32_86.method701(0))) {
													local8407 = 5;
													local352 = local352.substring(Static323.aClass32_86.method701(0).length());
												} else if (Static107.anInt2498 != 0) {
													if (local1702.startsWith(Static250.aClass32_62.method701(Static107.anInt2498))) {
														local8407 = 1;
														local352 = local352.substring(Static250.aClass32_62.method701(Static107.anInt2498).length());
													} else if (local1702.startsWith(Static326.aClass32_87.method701(Static107.anInt2498))) {
														local8407 = 2;
														local352 = local352.substring(Static326.aClass32_87.method701(Static107.anInt2498).length());
													} else if (local1702.startsWith(Static80.aClass32_27.method701(Static107.anInt2498))) {
														local8407 = 3;
														local352 = local352.substring(Static80.aClass32_27.method701(Static107.anInt2498).length());
													} else if (local1702.startsWith(Static384.aClass32_103.method701(Static107.anInt2498))) {
														local8407 = 4;
														local352 = local352.substring(Static384.aClass32_103.method701(Static107.anInt2498).length());
													} else if (local1702.startsWith(Static323.aClass32_86.method701(Static107.anInt2498))) {
														local8407 = 5;
														local352 = local352.substring(Static323.aClass32_86.method701(Static107.anInt2498).length());
													}
												}
												Static216.method3597(Static118.aClass11_43);
												Static372.aClass2_Sub16_Sub2_4.method5358(0);
												local414 = Static372.aClass2_Sub16_Sub2_4.anInt6145;
												Static372.aClass2_Sub16_Sub2_4.method5358(local7969);
												Static372.aClass2_Sub16_Sub2_4.method5358(local8407);
												Static16.method309(local352, Static372.aClass2_Sub16_Sub2_4);
												Static372.aClass2_Sub16_Sub2_4.method5316(Static372.aClass2_Sub16_Sub2_4.anInt6145 - local414);
												continue;
											}
											if (local31 == 5009) {
												local3 -= 2;
												local352 = aStringArray116[local3];
												local1702 = aStringArray116[local3 + 1];
												if (Static303.anInt5133 != 0 || (!Static305.aBoolean386 || Static169.aBoolean245) && !Static51.aBoolean82) {
													Static216.method3597(Static79.aClass11_72);
													Static372.aClass2_Sub16_Sub2_4.method5358(0);
													local744 = Static372.aClass2_Sub16_Sub2_4.anInt6145;
													Static372.aClass2_Sub16_Sub2_4.method5362(local352);
													Static16.method309(local1702, Static372.aClass2_Sub16_Sub2_4);
													Static372.aClass2_Sub16_Sub2_4.method5316(Static372.aClass2_Sub16_Sub2_4.anInt6145 - local744);
												}
												continue;
											}
											if (local31 == 5010) {
												local1--;
												local540 = anIntArray877[local1];
												local1702 = null;
												if (local540 < 100) {
													local1702 = Static40.aStringArray26[local540];
												}
												if (local1702 == null) {
													local1702 = "";
												}
												aStringArray116[local3++] = local1702;
												continue;
											}
											if (local31 == 5011) {
												local1--;
												local540 = anIntArray877[local1];
												local1702 = null;
												if (local540 < 100) {
													local1702 = Static321.aStringArray141[local540];
												}
												if (local1702 == null) {
													local1702 = "";
												}
												aStringArray116[local3++] = local1702;
												continue;
											}
											if (local31 == 5012) {
												local1--;
												local540 = anIntArray877[local1];
												local545 = -1;
												if (local540 < 100) {
													local545 = Static321.anIntArray1120[local540];
												}
												anIntArray877[local1++] = local545;
												continue;
											}
											if (local31 == 5015) {
												if (Static206.aClass1_Sub5_Sub1_Sub1_1 == null || Static206.aClass1_Sub5_Sub1_Sub1_1.aString25 == null) {
													local352 = Static385.aString67;
												} else {
													local352 = Static206.aClass1_Sub5_Sub1_Sub1_1.method2253();
												}
												aStringArray116[local3++] = local352;
												continue;
											}
											if (local31 == 5016) {
												anIntArray877[local1++] = Static254.anInt4497;
												continue;
											}
											if (local31 == 5017) {
												anIntArray877[local1++] = Class2_Sub4_Sub9.lb;
												continue;
											}
											if (local31 == 5018) {
												local1--;
												local540 = anIntArray877[local1];
												local545 = 0;
												if (local540 < 100 && Static220.aStringArray99[local540] != null) {
													local545 = Static44.anIntArray182[local540];
												}
												anIntArray877[local1++] = local545;
												continue;
											}
											if (local31 == 5019) {
												local1--;
												local540 = anIntArray877[local1];
												local1702 = null;
												if (local540 < 100) {
													local1702 = Static96.aStringArray55[local540];
												}
												if (local1702 == null) {
													local1702 = "";
												}
												aStringArray116[local3++] = local1702;
												continue;
											}
											if (local31 == 5020) {
												if (Static206.aClass1_Sub5_Sub1_Sub1_1 == null || Static206.aClass1_Sub5_Sub1_Sub1_1.aString25 == null) {
													local352 = Static385.aString67;
												} else {
													local352 = Static206.aClass1_Sub5_Sub1_Sub1_1.method2250();
												}
												aStringArray116[local3++] = local352;
												continue;
											}
											if (local31 == 5050) {
												local1--;
												local540 = anIntArray877[local1];
												aStringArray116[local3++] = Static107.method2415(local540).aString59;
												continue;
											}
											@Pc(8899) Class2_Sub10_Sub16 local8899;
											if (local31 == 5051) {
												local1--;
												local540 = anIntArray877[local1];
												local8899 = Static107.method2415(local540);
												if (local8899.anIntArray1079 == null) {
													anIntArray877[local1++] = 0;
												} else {
													anIntArray877[local1++] = local8899.anIntArray1079.length;
												}
												continue;
											}
											if (local31 == 5052) {
												local1 -= 2;
												local540 = anIntArray877[local1];
												local545 = anIntArray877[local1 + 1];
												@Pc(8934) Class2_Sub10_Sub16 local8934 = Static107.method2415(local540);
												local395 = local8934.anIntArray1079[local545];
												anIntArray877[local1++] = local395;
												continue;
											}
											if (local31 == 5053) {
												local1--;
												local540 = anIntArray877[local1];
												local8899 = Static107.method2415(local540);
												if (local8899.anIntArray1080 == null) {
													anIntArray877[local1++] = 0;
												} else {
													anIntArray877[local1++] = local8899.anIntArray1080.length;
												}
												continue;
											}
											if (local31 == 5054) {
												local1 -= 2;
												local540 = anIntArray877[local1];
												local545 = anIntArray877[local1 + 1];
												anIntArray877[local1++] = Static107.method2415(local540).anIntArray1080[local545];
												continue;
											}
											if (local31 == 5055) {
												local1--;
												local540 = anIntArray877[local1];
												aStringArray116[local3++] = Static3.method74(local540).method1143();
												continue;
											}
											if (local31 == 5056) {
												local1--;
												local540 = anIntArray877[local1];
												@Pc(9029) Class2_Sub10_Sub6 local9029 = Static3.method74(local540);
												if (local9029.anIntArray315 == null) {
													anIntArray877[local1++] = 0;
												} else {
													anIntArray877[local1++] = local9029.anIntArray315.length;
												}
												continue;
											}
											if (local31 == 5057) {
												local1 -= 2;
												local540 = anIntArray877[local1];
												local545 = anIntArray877[local1 + 1];
												anIntArray877[local1++] = Static3.method74(local540).anIntArray315[local545];
												continue;
											}
											if (local31 == 5058) {
												aClass53_1 = new Class53();
												local1--;
												aClass53_1.anInt1274 = anIntArray877[local1];
												aClass53_1.aClass2_Sub10_Sub6_1 = Static3.method74(aClass53_1.anInt1274);
												aClass53_1.anIntArray271 = new int[aClass53_1.aClass2_Sub10_Sub6_1.method1141()];
												continue;
											}
											if (local31 == 5059) {
												Static216.method3597(Static36.aClass11_11);
												Static372.aClass2_Sub16_Sub2_4.method5358(0);
												local540 = Static372.aClass2_Sub16_Sub2_4.anInt6145;
												Static372.aClass2_Sub16_Sub2_4.method5358(0);
												Static372.aClass2_Sub16_Sub2_4.method5351(aClass53_1.anInt1274);
												aClass53_1.aClass2_Sub10_Sub6_1.method1144(aClass53_1.anIntArray271, Static372.aClass2_Sub16_Sub2_4);
												Static372.aClass2_Sub16_Sub2_4.method5316(Static372.aClass2_Sub16_Sub2_4.anInt6145 - local540);
												continue;
											}
											if (local31 == 5060) {
												local3--;
												local352 = aStringArray116[local3];
												Static216.method3597(Static176.aClass11_57);
												Static372.aClass2_Sub16_Sub2_4.method5358(0);
												local545 = Static372.aClass2_Sub16_Sub2_4.anInt6145;
												Static372.aClass2_Sub16_Sub2_4.method5362(local352);
												Static372.aClass2_Sub16_Sub2_4.method5351(aClass53_1.anInt1274);
												aClass53_1.aClass2_Sub10_Sub6_1.method1144(aClass53_1.anIntArray271, Static372.aClass2_Sub16_Sub2_4);
												Static372.aClass2_Sub16_Sub2_4.method5316(Static372.aClass2_Sub16_Sub2_4.anInt6145 - local545);
												continue;
											}
											if (local31 == 5061) {
												Static216.method3597(Static36.aClass11_11);
												Static372.aClass2_Sub16_Sub2_4.method5358(0);
												local540 = Static372.aClass2_Sub16_Sub2_4.anInt6145;
												Static372.aClass2_Sub16_Sub2_4.method5358(1);
												Static372.aClass2_Sub16_Sub2_4.method5351(aClass53_1.anInt1274);
												aClass53_1.aClass2_Sub10_Sub6_1.method1144(aClass53_1.anIntArray271, Static372.aClass2_Sub16_Sub2_4);
												Static372.aClass2_Sub16_Sub2_4.method5316(Static372.aClass2_Sub16_Sub2_4.anInt6145 - local540);
												continue;
											}
											if (local31 == 5062) {
												local1 -= 2;
												local540 = anIntArray877[local1];
												local545 = anIntArray877[local1 + 1];
												anIntArray877[local1++] = Static107.method2415(local540).aCharArray5[local545];
												continue;
											}
											if (local31 == 5063) {
												local1 -= 2;
												local540 = anIntArray877[local1];
												local545 = anIntArray877[local1 + 1];
												anIntArray877[local1++] = Static107.method2415(local540).aCharArray6[local545];
												continue;
											}
											if (local31 == 5064) {
												local1 -= 2;
												local540 = anIntArray877[local1];
												local545 = anIntArray877[local1 + 1];
												if (local545 == -1) {
													anIntArray877[local1++] = -1;
												} else {
													anIntArray877[local1++] = Static107.method2415(local540).method4704((char) local545);
												}
												continue;
											}
											if (local31 == 5065) {
												local1 -= 2;
												local540 = anIntArray877[local1];
												local545 = anIntArray877[local1 + 1];
												if (local545 == -1) {
													anIntArray877[local1++] = -1;
												} else {
													anIntArray877[local1++] = Static107.method2415(local540).method4700((char) local545);
												}
												continue;
											}
											if (local31 == 5066) {
												local1--;
												local540 = anIntArray877[local1];
												anIntArray877[local1++] = Static3.method74(local540).method1141();
												continue;
											}
											if (local31 == 5067) {
												local1 -= 2;
												local540 = anIntArray877[local1];
												local545 = anIntArray877[local1 + 1];
												local744 = Static3.method74(local540).method1146(local545);
												anIntArray877[local1++] = local744;
												continue;
											}
											if (local31 == 5068) {
												local1 -= 2;
												local540 = anIntArray877[local1];
												local545 = anIntArray877[local1 + 1];
												aClass53_1.anIntArray271[local540] = local545;
												continue;
											}
											if (local31 == 5069) {
												local1 -= 2;
												local540 = anIntArray877[local1];
												local545 = anIntArray877[local1 + 1];
												aClass53_1.anIntArray271[local540] = local545;
												continue;
											}
											if (local31 == 5070) {
												local1 -= 3;
												local540 = anIntArray877[local1];
												local545 = anIntArray877[local1 + 1];
												local744 = anIntArray877[local1 + 2];
												@Pc(9455) Class2_Sub10_Sub6 local9455 = Static3.method74(local540);
												if (local9455.method1146(local545) != 0) {
													throw new RuntimeException("bad command");
												}
												anIntArray877[local1++] = local9455.method1140(local744, local545);
												continue;
											}
											if (local31 == 5071) {
												local3--;
												local352 = aStringArray116[local3];
												local1--;
												local1269 = anIntArray877[local1] == 1;
												Static353.method5190(local352, local1269);
												anIntArray877[local1++] = Static264.anInt4609;
												continue;
											}
											if (local31 == 5072) {
												if (Static161.aShortArray53 != null && Static235.anInt4194 < Static264.anInt4609) {
													anIntArray877[local1++] = Static161.aShortArray53[Static235.anInt4194++] & 0xFFFF;
													continue;
												}
												anIntArray877[local1++] = -1;
												continue;
											}
											if (local31 == 5073) {
												Static235.anInt4194 = 0;
												continue;
											}
										} else if (local31 < 5200) {
											if (local31 == 5100) {
												if (Static48.aClass69_1.method2261(86)) {
													anIntArray877[local1++] = 1;
												} else {
													anIntArray877[local1++] = 0;
												}
												continue;
											}
											if (local31 == 5101) {
												if (Static48.aClass69_1.method2261(82)) {
													anIntArray877[local1++] = 1;
												} else {
													anIntArray877[local1++] = 0;
												}
												continue;
											}
											if (local31 == 5102) {
												if (Static48.aClass69_1.method2261(81)) {
													anIntArray877[local1++] = 1;
												} else {
													anIntArray877[local1++] = 0;
												}
												continue;
											}
										} else {
											@Pc(9978) boolean local9978;
											if (local31 < 5300) {
												if (local31 == 5200) {
													local1--;
													Static265.method4088(anIntArray877[local1]);
													continue;
												}
												if (local31 == 5201) {
													anIntArray877[local1++] = Static186.method3208();
													continue;
												}
												if (local31 == 5205) {
													local1--;
													Static53.method898(-1, anIntArray877[local1], false, -1);
													continue;
												}
												@Pc(9654) Class2_Sub10_Sub8 local9654;
												if (local31 == 5206) {
													local1--;
													local540 = anIntArray877[local1];
													local9654 = Static338.method3054(local540 >> 14 & 0x3FFF, local540 & 0x3FFF);
													if (local9654 == null) {
														anIntArray877[local1++] = -1;
													} else {
														anIntArray877[local1++] = local9654.anInt1903;
													}
													continue;
												}
												@Pc(9678) Class2_Sub10_Sub8 local9678;
												if (local31 == 5207) {
													local1--;
													local9678 = Static338.method3046(anIntArray877[local1]);
													if (local9678 != null && local9678.aString18 != null) {
														aStringArray116[local3++] = local9678.aString18;
														continue;
													}
													aStringArray116[local3++] = "";
													continue;
												}
												if (local31 == 5208) {
													anIntArray877[local1++] = Static68.anInt1325;
													anIntArray877[local1++] = Static17.anInt397;
													continue;
												}
												if (local31 == 5209) {
													anIntArray877[local1++] = Static82.anInt1484 + Static338.anInt3305;
													anIntArray877[local1++] = Static308.anInt5181 + Static338.anInt3307;
													continue;
												}
												if (local31 == 5210) {
													local1--;
													local540 = anIntArray877[local1];
													local9654 = Static338.method3046(local540);
													if (local9654 == null) {
														anIntArray877[local1++] = 0;
														anIntArray877[local1++] = 0;
													} else {
														anIntArray877[local1++] = local9654.anInt1920 >> 14 & 0x3FFF;
														anIntArray877[local1++] = local9654.anInt1920 & 0x3FFF;
													}
													continue;
												}
												if (local31 == 5211) {
													local1--;
													local540 = anIntArray877[local1];
													local9654 = Static338.method3046(local540);
													if (local9654 == null) {
														anIntArray877[local1++] = 0;
														anIntArray877[local1++] = 0;
													} else {
														anIntArray877[local1++] = local9654.anInt1909 - local9654.anInt1919;
														anIntArray877[local1++] = local9654.anInt1913 - local9654.anInt1915;
													}
													continue;
												}
												@Pc(9820) Class2_Sub23 local9820;
												if (local31 == 5212) {
													local9820 = Static335.method4948();
													if (local9820 == null) {
														anIntArray877[local1++] = -1;
														anIntArray877[local1++] = -1;
													} else {
														anIntArray877[local1++] = local9820.anInt2801;
														local545 = local9820.anInt2805 << 28 | local9820.anInt2800 + Static338.anInt3305 << 14 | local9820.anInt2803 + Static338.anInt3307;
														anIntArray877[local1++] = local545;
													}
													continue;
												}
												if (local31 == 5213) {
													local9820 = Static242.method4242();
													if (local9820 == null) {
														anIntArray877[local1++] = -1;
														anIntArray877[local1++] = -1;
													} else {
														anIntArray877[local1++] = local9820.anInt2801;
														local545 = local9820.anInt2805 << 28 | local9820.anInt2800 + Static338.anInt3305 << 14 | local9820.anInt2803 + Static338.anInt3307;
														anIntArray877[local1++] = local545;
													}
													continue;
												}
												if (local31 == 5214) {
													local1--;
													local540 = anIntArray877[local1];
													local9654 = Static367.method5420();
													if (local9654 != null) {
														local6934 = local9654.method1860(local540 & 0x3FFF, local540 >> 28 & 0x3, local540 >> 14 & 0x3FFF, anIntArray879);
														if (local6934) {
															Static374.method5469(anIntArray879[2], anIntArray879[1]);
														}
													}
													continue;
												}
												if (local31 == 5215) {
													local1 -= 2;
													local540 = anIntArray877[local1];
													local545 = anIntArray877[local1 + 1];
													@Pc(9976) Class87 local9976 = Static338.method3041(local540 >> 14 & 0x3FFF, local540 & 0x3FFF);
													local9978 = false;
													for (@Pc(9983) Class2_Sub10_Sub8 local9983 = (Class2_Sub10_Sub8) local9976.method2353(); local9983 != null; local9983 = (Class2_Sub10_Sub8) local9976.method2352()) {
														if (local9983.anInt1903 == local545) {
															local9978 = true;
															break;
														}
													}
													if (local9978) {
														anIntArray877[local1++] = 1;
													} else {
														anIntArray877[local1++] = 0;
													}
													continue;
												}
												if (local31 == 5218) {
													local1--;
													local540 = anIntArray877[local1];
													local9654 = Static338.method3046(local540);
													if (local9654 == null) {
														anIntArray877[local1++] = -1;
													} else {
														anIntArray877[local1++] = local9654.anInt1904;
													}
													continue;
												}
												if (local31 == 5220) {
													anIntArray877[local1++] = Static309.anInt5191 == 100 ? 1 : 0;
													continue;
												}
												if (local31 == 5221) {
													local1--;
													local540 = anIntArray877[local1];
													Static374.method5469(local540 & 0x3FFF, local540 >> 14 & 0x3FFF);
													continue;
												}
												if (local31 == 5222) {
													local9678 = Static367.method5420();
													if (local9678 == null) {
														anIntArray877[local1++] = -1;
														anIntArray877[local1++] = -1;
													} else {
														local1269 = local9678.method1858(anIntArray879, Static308.anInt5181 + Static338.anInt3307, Static82.anInt1484 + Static338.anInt3305);
														if (local1269) {
															anIntArray877[local1++] = anIntArray879[1];
															anIntArray877[local1++] = anIntArray879[2];
														} else {
															anIntArray877[local1++] = -1;
															anIntArray877[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5223) {
													local1 -= 2;
													local540 = anIntArray877[local1];
													local545 = anIntArray877[local1 + 1];
													Static53.method898(local545 >> 14 & 0x3FFF, local540, false, local545 & 0x3FFF);
													continue;
												}
												if (local31 == 5224) {
													local1--;
													local540 = anIntArray877[local1];
													local9654 = Static367.method5420();
													if (local9654 == null) {
														anIntArray877[local1++] = -1;
														anIntArray877[local1++] = -1;
													} else {
														local6934 = local9654.method1860(local540 & 0x3FFF, local540 >> 28 & 0x3, local540 >> 14 & 0x3FFF, anIntArray879);
														if (local6934) {
															anIntArray877[local1++] = anIntArray879[1];
															anIntArray877[local1++] = anIntArray879[2];
														} else {
															anIntArray877[local1++] = -1;
															anIntArray877[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5225) {
													local1--;
													local540 = anIntArray877[local1];
													local9654 = Static367.method5420();
													if (local9654 == null) {
														anIntArray877[local1++] = -1;
														anIntArray877[local1++] = -1;
													} else {
														local6934 = local9654.method1858(anIntArray879, local540 & 0x3FFF, local540 >> 14 & 0x3FFF);
														if (local6934) {
															anIntArray877[local1++] = anIntArray879[1];
															anIntArray877[local1++] = anIntArray879[2];
														} else {
															anIntArray877[local1++] = -1;
															anIntArray877[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5226) {
													local1--;
													Static146.method2751(anIntArray877[local1]);
													continue;
												}
												if (local31 == 5227) {
													local1 -= 2;
													local540 = anIntArray877[local1];
													local545 = anIntArray877[local1 + 1];
													Static53.method898(local545 >> 14 & 0x3FFF, local540, true, local545 & 0x3FFF);
													continue;
												}
												if (local31 == 5228) {
													local1--;
													Static323.aBoolean407 = anIntArray877[local1] == 1;
													continue;
												}
												if (local31 == 5229) {
													anIntArray877[local1++] = Static323.aBoolean407 ? 1 : 0;
													continue;
												}
												if (local31 == 5230) {
													local1--;
													local540 = anIntArray877[local1];
													Static291.method4411(local540);
													continue;
												}
												@Pc(10394) Class2 local10394;
												if (local31 == 5231) {
													local1 -= 2;
													local540 = anIntArray877[local1];
													local1269 = anIntArray877[local1 + 1] == 1;
													if (Static232.aClass246_21 == null) {
														continue;
													}
													local10394 = Static232.aClass246_21.method5613((long) local540);
													if (local10394 != null && !local1269) {
														local10394.method5617();
														continue;
													}
													if (local10394 == null && local1269) {
														local10394 = new Class2();
														Static232.aClass246_21.method5609(local10394, (long) local540);
													}
													continue;
												}
												@Pc(10433) Class2 local10433;
												if (local31 == 5232) {
													local1--;
													local540 = anIntArray877[local1];
													if (Static232.aClass246_21 == null) {
														anIntArray877[local1++] = 0;
													} else {
														local10433 = Static232.aClass246_21.method5613((long) local540);
														anIntArray877[local1++] = local10433 == null ? 0 : 1;
													}
													continue;
												}
												if (local31 == 5233) {
													local1 -= 2;
													local540 = anIntArray877[local1];
													local1269 = anIntArray877[local1 + 1] == 1;
													if (Static41.aClass246_4 == null) {
														continue;
													}
													local10394 = Static41.aClass246_4.method5613((long) local540);
													if (local10394 != null && !local1269) {
														local10394.method5617();
														continue;
													}
													if (local10394 == null && local1269) {
														local10394 = new Class2();
														Static41.aClass246_4.method5609(local10394, (long) local540);
													}
													continue;
												}
												if (local31 == 5234) {
													local1--;
													local540 = anIntArray877[local1];
													if (Static41.aClass246_4 == null) {
														anIntArray877[local1++] = 0;
													} else {
														local10433 = Static41.aClass246_4.method5613((long) local540);
														anIntArray877[local1++] = local10433 == null ? 0 : 1;
													}
													continue;
												}
												if (local31 == 5235) {
													anIntArray877[local1++] = Static338.aClass2_Sub10_Sub8_3 == null ? -1 : Static338.aClass2_Sub10_Sub8_3.anInt1903;
													continue;
												}
											} else if (local31 < 5400) {
												if (local31 == 5300) {
													local1 -= 2;
													local540 = anIntArray877[local1];
													local545 = anIntArray877[local1 + 1];
													Static145.method4675(3, local540, local545, false);
													anIntArray877[local1++] = Static385.aFrame2 == null ? 0 : 1;
													continue;
												}
												if (local31 == 5301) {
													if (Static385.aFrame2 != null) {
														Static145.method4675(Static213.anInt3866, -1, -1, false);
													}
													continue;
												}
												if (local31 == 5302) {
													@Pc(10596) Class241[] local10596 = Static378.method5517();
													anIntArray877[local1++] = local10596.length;
													continue;
												}
												if (local31 == 5303) {
													local1--;
													local540 = anIntArray877[local1];
													@Pc(10614) Class241[] local10614 = Static378.method5517();
													anIntArray877[local1++] = local10614[local540].anInt6298;
													anIntArray877[local1++] = local10614[local540].anInt6295;
													continue;
												}
												if (local31 == 5305) {
													local540 = Static364.anInt6192;
													local545 = Static132.anInt2711;
													local744 = -1;
													@Pc(10643) Class241[] local10643 = Static378.method5517();
													for (local414 = 0; local414 < local10643.length; local414++) {
														@Pc(10650) Class241 local10650 = local10643[local414];
														if (local10650.anInt6298 == local540 && local10650.anInt6295 == local545) {
															local744 = local414;
															break;
														}
													}
													anIntArray877[local1++] = local744;
													continue;
												}
												if (local31 == 5306) {
													anIntArray877[local1++] = Static162.method2888();
													continue;
												}
												if (local31 == 5307) {
													local1--;
													local540 = anIntArray877[local1];
													if (local540 >= 1 && local540 <= 2) {
														Static145.method4675(local540, -1, -1, false);
													}
													continue;
												}
												if (local31 == 5308) {
													anIntArray877[local1++] = Static213.anInt3866;
													continue;
												}
												if (local31 == 5309) {
													local1--;
													local540 = anIntArray877[local1];
													if (local540 >= 1 && local540 <= 2) {
														Static213.anInt3866 = local540;
														Static164.method2916(Static359.aClass111_5);
													}
													continue;
												}
											} else {
												@Pc(11105) String local11105;
												if (local31 < 5500) {
													if (local31 == 5400) {
														local3 -= 2;
														local352 = aStringArray116[local3];
														local1702 = aStringArray116[local3 + 1];
														local1--;
														local744 = anIntArray877[local1];
														Static216.method3597(Static221.aClass11_85);
														Static372.aClass2_Sub16_Sub2_4.method5358(Static204.method3471(local352) + Static204.method3471(local1702) + 1);
														Static372.aClass2_Sub16_Sub2_4.method5362(local352);
														Static372.aClass2_Sub16_Sub2_4.method5362(local1702);
														Static372.aClass2_Sub16_Sub2_4.method5358(local744);
														continue;
													}
													if (local31 == 5401) {
														local1 -= 2;
														Static66.aShortArray13[anIntArray877[local1]] = (short) Static171.method3061(anIntArray877[local1 + 1]);
														Static15.aClass81_1.method2188();
														Static15.aClass81_1.method2187();
														Static356.aClass48_2.method955();
														Static240.method3873();
														continue;
													}
													if (local31 == 5405) {
														local1 -= 2;
														local540 = anIntArray877[local1];
														local545 = anIntArray877[local1 + 1];
														if (local540 >= 0 && local540 < 2) {
															Static221.anIntArrayArrayArray16[local540] = new int[local545 << 1][4];
														}
														continue;
													}
													if (local31 == 5406) {
														local1 -= 7;
														local540 = anIntArray877[local1];
														local545 = anIntArray877[local1 + 1] << 1;
														local744 = anIntArray877[local1 + 2];
														local395 = anIntArray877[local1 + 3];
														local414 = anIntArray877[local1 + 4];
														local775 = anIntArray877[local1 + 5];
														@Pc(10891) int local10891 = anIntArray877[local1 + 6];
														if (local540 >= 0 && local540 < 2 && Static221.anIntArrayArrayArray16[local540] != null && local545 >= 0 && local545 < Static221.anIntArrayArrayArray16[local540].length) {
															Static221.anIntArrayArrayArray16[local540][local545] = new int[] { (local744 >> 14 & 0x3FFF) * 128, local395, (local744 & 0x3FFF) * 128, local10891 };
															Static221.anIntArrayArrayArray16[local540][local545 + 1] = new int[] { (local414 >> 14 & 0x3FFF) * 128, local775, (local414 & 0x3FFF) * 128 };
														}
														continue;
													}
													if (local31 == 5407) {
														local1--;
														local540 = Static221.anIntArrayArrayArray16[anIntArray877[local1]].length >> 1;
														anIntArray877[local1++] = local540;
														continue;
													}
													if (local31 == 5411) {
														if (Static385.aFrame2 != null) {
															Static145.method4675(Static213.anInt3866, -1, -1, false);
														}
														if (Static8.aFrame1 == null) {
															local352 = Static128.aString27 == null ? Static136.method2645() : Static128.aString27;
															Static280.method4252(Static62.anInt1261 == 1, false, local352, Static359.aClass111_5);
														} else {
															Static37.method675();
															System.exit(0);
														}
														continue;
													}
													if (local31 == 5419) {
														local352 = "";
														if (Static138.aClass182_3 != null) {
															if (Static138.aClass182_3.anObject6 == null) {
																local352 = Static37.method676(Static138.aClass182_3.anInt4500);
															} else {
																local352 = (String) Static138.aClass182_3.anObject6;
															}
														}
														aStringArray116[local3++] = local352;
														continue;
													}
													if (local31 == 5420) {
														anIntArray877[local1++] = Static152.anInt2983 == 3 ? 1 : 0;
														continue;
													}
													if (local31 == 5421) {
														if (Static385.aFrame2 != null) {
															Static145.method4675(Static213.anInt3866, -1, -1, false);
														}
														local3--;
														local352 = aStringArray116[local3];
														local1--;
														local1269 = anIntArray877[local1] == 1;
														local11105 = Static136.method2645() + local352;
														Static280.method4252(Static62.anInt1261 == 1, local1269, local11105, Static359.aClass111_5);
														continue;
													}
													if (local31 == 5422) {
														local3 -= 2;
														local352 = aStringArray116[local3];
														local1702 = aStringArray116[local3 + 1];
														local1--;
														local744 = anIntArray877[local1];
														if (local352.length() > 0) {
															if (Static110.aStringArray60 == null) {
																Static110.aStringArray60 = new String[Static127.anIntArray534[Static275.aClass150_3.anInt3682]];
															}
															Static110.aStringArray60[local744] = local352;
														}
														if (local1702.length() > 0) {
															if (Static156.aStringArray78 == null) {
																Static156.aStringArray78 = new String[Static127.anIntArray534[Static275.aClass150_3.anInt3682]];
															}
															Static156.aStringArray78[local744] = local1702;
														}
														continue;
													}
													if (local31 == 5423) {
														local3--;
														System.out.println(aStringArray116[local3]);
														continue;
													}
													if (local31 == 5424) {
														local1 -= 11;
														Static381.anInt6500 = anIntArray877[local1];
														Static144.anInt2872 = anIntArray877[local1 + 1];
														Static28.anInt605 = anIntArray877[local1 + 2];
														Static131.anInt2702 = anIntArray877[local1 + 3];
														Static6.anInt208 = anIntArray877[local1 + 4];
														Static88.anInt1684 = anIntArray877[local1 + 5];
														Static92.anInt1739 = anIntArray877[local1 + 6];
														Static177.anInt3401 = anIntArray877[local1 + 7];
														Static325.anInt5591 = anIntArray877[local1 + 8];
														Static115.anInt2458 = anIntArray877[local1 + 9];
														Static94.anInt1921 = anIntArray877[local1 + 10];
														Static263.aClass171_64.method3739(Static6.anInt208);
														Static263.aClass171_64.method3739(Static88.anInt1684);
														Static263.aClass171_64.method3739(Static92.anInt1739);
														Static263.aClass171_64.method3739(Static177.anInt3401);
														Static263.aClass171_64.method3739(Static325.anInt5591);
														Static379.aClass18_28 = null;
														Static238.aClass18_17 = null;
														Static45.aClass18_3 = null;
														Static46.aClass18_4 = null;
														Static96.aClass18_7 = null;
														Static250.aClass18_18 = null;
														Static392.aClass18_29 = null;
														Static343.aClass18_25 = null;
														Static284.aBoolean372 = true;
														continue;
													}
													if (local31 == 5425) {
														Static145.method4669();
														Static284.aBoolean372 = false;
														continue;
													}
													if (local31 == 5426) {
														local1 -= 2;
														Static143.anInt2866 = anIntArray877[local1];
														Static181.anInt6176 = anIntArray877[local1 + 1];
														continue;
													}
													if (local31 == 5427) {
														local1 -= 2;
														Static316.anInt5408 = anIntArray877[local1 + 1];
														continue;
													}
													if (local31 == 5428) {
														local1 -= 2;
														local540 = anIntArray877[local1];
														local545 = anIntArray877[local1 + 1];
														anIntArray877[local1++] = Static69.method1130(local545, local540) ? 1 : 0;
														continue;
													}
													if (local31 == 5429) {
														local3--;
														Static192.method3298(false, aStringArray116[local3]);
														continue;
													}
												} else if (local31 < 5600) {
													if (local31 == 5500) {
														local1 -= 4;
														local540 = anIntArray877[local1];
														local545 = anIntArray877[local1 + 1];
														local744 = anIntArray877[local1 + 2];
														local395 = anIntArray877[local1 + 3];
														Static210.method3524((local540 >> 14 & 0x3FFF) - Static28.anInt606, (local540 & 0x3FFF) - Static319.anInt5425, local545, local395, false, local744);
														continue;
													}
													if (local31 == 5501) {
														local1 -= 4;
														local540 = anIntArray877[local1];
														local545 = anIntArray877[local1 + 1];
														local744 = anIntArray877[local1 + 2];
														local395 = anIntArray877[local1 + 3];
														Static219.method3626(local545, (local540 >> 14 & 0x3FFF) - Static28.anInt606, (local540 & 0x3FFF) - Static319.anInt5425, local395, local744);
														continue;
													}
													if (local31 == 5502) {
														local1 -= 6;
														local540 = anIntArray877[local1];
														if (local540 >= 2) {
															throw new RuntimeException();
														}
														Static334.anInt5726 = local540;
														local545 = anIntArray877[local1 + 1];
														if (local545 + 1 >= Static221.anIntArrayArrayArray16[Static334.anInt5726].length >> 1) {
															throw new RuntimeException();
														}
														Static75.anInt1443 = local545;
														Static384.anInt6554 = 0;
														Static381.anInt6501 = anIntArray877[local1 + 2];
														Static224.anInt4005 = anIntArray877[local1 + 3];
														local744 = anIntArray877[local1 + 4];
														if (local744 >= 2) {
															throw new RuntimeException();
														}
														Class2_Sub4_Sub22.lb = local744;
														local395 = anIntArray877[local1 + 5];
														if (local395 + 1 >= Static221.anIntArrayArrayArray16[Class2_Sub4_Sub22.lb].length >> 1) {
															throw new RuntimeException();
														}
														Static381.anInt6498 = local395;
														Static79.anInt4624 = 3;
														continue;
													}
													if (local31 == 5503) {
														Static235.method3813();
														continue;
													}
													if (local31 == 5504) {
														local1 -= 2;
														Static195.method3316(anIntArray877[local1], anIntArray877[local1 + 1]);
														continue;
													}
													if (local31 == 5505) {
														anIntArray877[local1++] = (int) Static1.aFloat80 >> 3;
														continue;
													}
													if (local31 == 5506) {
														anIntArray877[local1++] = (int) Static127.aFloat41 >> 3;
														continue;
													}
													if (local31 == 5507) {
														Static226.method5459();
														continue;
													}
													if (local31 == 5508) {
														Static181.method5331();
														continue;
													}
													if (local31 == 5509) {
														Static63.method1042();
														continue;
													}
													if (local31 == 5510) {
														Static320.method4748();
														continue;
													}
													if (local31 == 5511) {
														local1--;
														local540 = anIntArray877[local1];
														local545 = local540 >> 14 & 0x3FFF;
														local744 = local540 & 0x3FFF;
														local545 -= Static28.anInt606;
														if (local545 < 0) {
															local545 = 0;
														} else if (local545 >= Static246.anInt4374) {
															local545 = Static246.anInt4374;
														}
														local744 -= Static319.anInt5425;
														if (local744 < 0) {
															local744 = 0;
														} else if (local744 >= Static185.anInt3485) {
															local744 = Static185.anInt3485;
														}
														Static290.anInt5046 = local545 * 128 + 64;
														Static295.anInt5082 = local744 * 128 + 64;
														Static79.anInt4624 = 4;
														continue;
													}
													if (local31 == 5512) {
														Static307.method4497();
														continue;
													}
												} else if (local31 < 5700) {
													if (local31 == 5600) {
														local3 -= 2;
														local352 = aStringArray116[local3];
														local1702 = aStringArray116[local3 + 1];
														local1--;
														local744 = anIntArray877[local1];
														if (Static391.anInt6627 == 10 && Static154.anInt2989 == 0 && Static216.anInt3923 == 0 && Static349.anInt4698 == 0 && Static285.anInt4943 == 0) {
															Static30.method548(local1702, local744, local352);
														}
														continue;
													}
													if (local31 == 5601) {
														Static154.method2828();
														continue;
													}
													if (local31 == 5602) {
														if (Static216.anInt3923 == 0) {
															Static139.anInt2783 = -2;
														}
														continue;
													}
													if (local31 == 5603) {
														local1 -= 4;
														if (Static391.anInt6627 == 10 && Static154.anInt2989 == 0 && Static216.anInt3923 == 0 && Static349.anInt4698 == 0 && Static285.anInt4943 == 0) {
															Static46.method796(anIntArray877[local1 + 2], anIntArray877[local1 + 3], anIntArray877[local1], anIntArray877[local1 + 1]);
														}
														continue;
													}
													if (local31 == 5604) {
														local3--;
														if (Static391.anInt6627 == 10 && Static154.anInt2989 == 0 && Static216.anInt3923 == 0 && Static349.anInt4698 == 0 && Static285.anInt4943 == 0) {
															Static210.method3522(Static363.method5387(aStringArray116[local3]));
														}
														continue;
													}
													if (local31 == 5605) {
														local3 -= 3;
														local1 -= 7;
														if (Static391.anInt6627 == 10 && Static154.anInt2989 == 0 && Static216.anInt3923 == 0 && Static349.anInt4698 == 0 && Static285.anInt4943 == 0) {
															Static10.method5053(anIntArray877[local1 + 4] == 1, anIntArray877[local1 + 2], anIntArray877[local1 + 6] == 1, anIntArray877[local1], anIntArray877[local1 + 5] == 1, aStringArray116[local3 + 1], Static363.method5387(aStringArray116[local3]), aStringArray116[local3 + 2], anIntArray877[local1 + 1], anIntArray877[local1 + 3]);
														}
														continue;
													}
													if (local31 == 5606) {
														if (Static349.anInt4698 == 0) {
															Static106.anInt2303 = -2;
														}
														continue;
													}
													if (local31 == 5607) {
														anIntArray877[local1++] = Static139.anInt2783;
														continue;
													}
													if (local31 == 5608) {
														anIntArray877[local1++] = Static163.anInt2452;
														continue;
													}
													if (local31 == 5609) {
														anIntArray877[local1++] = Static106.anInt2303;
														continue;
													}
													if (local31 == 5610) {
														for (local540 = 0; local540 < 5; local540++) {
															aStringArray116[local3++] = Static337.aStringArray147.length > local540 ? Static96.method1919(Static337.aStringArray147[local540]) : "";
														}
														Static337.aStringArray147 = null;
														continue;
													}
													if (local31 == 5611) {
														anIntArray877[local1++] = Static301.anInt5344;
														continue;
													}
												} else if (local31 < 6100) {
													if (local31 == 6001) {
														local1--;
														local540 = anIntArray877[local1];
														if (local540 < 1) {
															local540 = 1;
														}
														if (local540 > 4) {
															local540 = 4;
														}
														Static3.anInt131 = local540;
														Static133.method2606();
														Static164.method2916(Static359.aClass111_5);
														Static64.aBoolean92 = false;
														continue;
													}
													if (local31 == 6002) {
														local1--;
														Static127.method2517(anIntArray877[local1] == 1);
														Static133.method2606();
														Static392.method5539();
														Static164.method2916(Static359.aClass111_5);
														Static64.aBoolean92 = false;
														continue;
													}
													if (local31 == 6003) {
														local1--;
														Static272.aBoolean352 = anIntArray877[local1] == 1;
														Static392.method5539();
														Static164.method2916(Static359.aClass111_5);
														Static64.aBoolean92 = false;
														continue;
													}
													if (local31 == 6005) {
														local1--;
														Static349.aBoolean351 = anIntArray877[local1] == 1;
														Static133.method2606();
														Static164.method2916(Static359.aClass111_5);
														Static64.aBoolean92 = false;
														continue;
													}
													if (local31 == 6006) {
														local1--;
														Static6.aBoolean21 = anIntArray877[local1] == 1;
														Static111.aClass63_3.method1997(!Static6.aBoolean21);
														Static164.method2916(Static359.aClass111_5);
														Static64.aBoolean92 = false;
														continue;
													}
													if (local31 == 6007) {
														local1--;
														Static116.anInt2496 = anIntArray877[local1];
														Static164.method2916(Static359.aClass111_5);
														Static64.aBoolean92 = false;
														continue;
													}
													if (local31 == 6008) {
														local1--;
														Static10.aBoolean424 = anIntArray877[local1] == 1;
														Static164.method2916(Static359.aClass111_5);
														Static64.aBoolean92 = false;
														continue;
													}
													if (local31 == 6009) {
														local1--;
														Static187.aBoolean270 = anIntArray877[local1] == 1;
														Static133.method2606();
														Static164.method2916(Static359.aClass111_5);
														Static64.aBoolean92 = false;
														continue;
													}
													if (local31 == 6010) {
														local1--;
														Static178.aBoolean265 = anIntArray877[local1] == 1;
														Static164.method2916(Static359.aClass111_5);
														Static64.aBoolean92 = false;
														continue;
													}
													if (local31 == 6011) {
														local1--;
														local540 = anIntArray877[local1];
														if (local540 < 0 || local540 > 2) {
															local540 = 0;
														}
														Static202.anInt3721 = local540;
														Static133.method2606();
														Static164.method2916(Static359.aClass111_5);
														Static64.aBoolean92 = false;
														continue;
													}
													if (local31 == 6012) {
														local1--;
														Static212.aBoolean293 = anIntArray877[local1] == 1;
														Static360.method5257();
														Static164.method2916(Static359.aClass111_5);
														Static64.aBoolean92 = false;
														continue;
													}
													if (local31 == 6014) {
														local1--;
														Static385.aBoolean467 = anIntArray877[local1] == 1;
														Static133.method2606();
														Static164.method2916(Static359.aClass111_5);
														Static64.aBoolean92 = false;
														continue;
													}
													if (local31 == 6015) {
														local1--;
														Static58.aBoolean89 = anIntArray877[local1] == 1;
														Static133.method2606();
														Static164.method2916(Static359.aClass111_5);
														Static64.aBoolean92 = false;
														continue;
													}
													if (local31 == 6016) {
														local1--;
														local540 = anIntArray877[local1];
														if (local540 < 0 || local540 > 2) {
															local540 = 0;
														}
														Static131.anInt2686 = local540;
														Static210.method3520();
														Static164.method2916(Static359.aClass111_5);
														continue;
													}
													if (local31 == 6017) {
														local1--;
														Static343.aBoolean422 = anIntArray877[local1] == 1;
														Static217.method3612();
														Static164.method2916(Static359.aClass111_5);
														Static64.aBoolean92 = false;
														continue;
													}
													if (local31 == 6018) {
														local1--;
														local540 = anIntArray877[local1];
														if (local540 < 0) {
															local540 = 0;
														}
														if (local540 > 127) {
															local540 = 127;
														}
														Static143.anInt2862 = local540;
														Static164.method2916(Static359.aClass111_5);
														Static64.aBoolean92 = false;
														continue;
													}
													if (local31 == 6019) {
														local1--;
														local540 = anIntArray877[local1];
														if (local540 < 0) {
															local540 = 0;
														}
														if (local540 > 255) {
															local540 = 255;
														}
														if (local540 != Static322.anInt5529) {
															if (Static322.anInt5529 == 0 && Static220.anInt3948 != -1) {
																Static154.method2825(Static220.anInt3948, local540, Static233.aClass171_53);
																Static221.aBoolean428 = false;
															} else if (local540 == 0) {
																Static293.method5579();
																Static221.aBoolean428 = false;
															} else {
																Static133.method2604(local540);
															}
															Static322.anInt5529 = local540;
														}
														Static164.method2916(Static359.aClass111_5);
														Static64.aBoolean92 = false;
														continue;
													}
													if (local31 == 6020) {
														local1--;
														local540 = anIntArray877[local1];
														if (local540 < 0) {
															local540 = 0;
														}
														if (local540 > 127) {
															local540 = 127;
														}
														Static330.anInt5659 = local540;
														Static164.method2916(Static359.aClass111_5);
														Static64.aBoolean92 = false;
														continue;
													}
													if (local31 == 6021) {
														local1--;
														Static389.aBoolean472 = anIntArray877[local1] == 1;
														Static392.method5539();
														continue;
													}
													if (local31 == 6023) {
														local1--;
														local540 = anIntArray877[local1];
														local1269 = false;
														if (local540 < 0) {
															local540 = 0;
														}
														if (local540 > 2) {
															local540 = 2;
														}
														if (Static253.anInt4468 < 96) {
															local540 = 0;
															local1269 = true;
														}
														Static133.method2603(local540);
														Static164.method2916(Static359.aClass111_5);
														Static64.aBoolean92 = false;
														anIntArray877[local1++] = local1269 ? 0 : 1;
														continue;
													}
													if (local31 == 6024) {
														local1--;
														local540 = anIntArray877[local1];
														if (local540 < 0 || local540 > 2) {
															local540 = 0;
														}
														Static132.anInt2709 = local540;
														Static164.method2916(Static359.aClass111_5);
														continue;
													}
													if (local31 == 6025) {
														local1--;
														local540 = anIntArray877[local1];
														if (local540 < 0 || local540 > Static6.method149(Static253.anInt4468)) {
															local540 = 0;
														}
														Static81.anInt1473 = local540;
														Static164.method2916(Static359.aClass111_5);
														Static64.aBoolean92 = false;
														continue;
													}
													if (local31 == 6027) {
														local1--;
														local540 = anIntArray877[local1];
														if (local540 < 0 || local540 > 1) {
															local540 = 0;
														}
														Static3.method78(local540 == 1);
														continue;
													}
													if (local31 == 6028) {
														local1--;
														Static278.aBoolean357 = anIntArray877[local1] != 0;
														Static164.method2916(Static359.aClass111_5);
														continue;
													}
													if (local31 == 6029) {
														local1--;
														Static116.anInt2496 = anIntArray877[local1];
														Static164.method2916(Static359.aClass111_5);
														continue;
													}
													if (local31 == 6030) {
														local1--;
														Static358.aBoolean142 = anIntArray877[local1] != 0;
														Static164.method2916(Static359.aClass111_5);
														Static133.method2606();
														continue;
													}
													if (local31 == 6031) {
														local1--;
														local540 = anIntArray877[local1];
														if (local540 < 0 || local540 > 3) {
															local540 = 2;
														}
														Static150.method2787(local540);
														continue;
													}
													if (local31 == 6032) {
														local1--;
														local540 = anIntArray877[local1];
														if (local540 < 0 || local540 > 3) {
															local540 = 2;
														}
														Static182.anInt3879 = local540;
														Static164.method2916(Static359.aClass111_5);
														Static64.aBoolean92 = false;
														continue;
													}
													if (local31 == 6033) {
														local1--;
														local540 = anIntArray877[local1];
														if (local540 < 0 || local540 > 4) {
															local540 = 2;
														}
														Static29.anInt617 = local540;
														Static164.method2916(Static359.aClass111_5);
														continue;
													}
												} else if (local31 < 6200) {
													if (local31 == 6101) {
														anIntArray877[local1++] = Static3.anInt131;
														continue;
													}
													if (local31 == 6102) {
														anIntArray877[local1++] = Static231.method3740() ? 1 : 0;
														continue;
													}
													if (local31 == 6103) {
														anIntArray877[local1++] = Static272.aBoolean352 ? 1 : 0;
														continue;
													}
													if (local31 == 6105) {
														anIntArray877[local1++] = Static349.aBoolean351 ? 1 : 0;
														continue;
													}
													if (local31 == 6106) {
														anIntArray877[local1++] = Static6.aBoolean21 ? 1 : 0;
														continue;
													}
													if (local31 == 6107) {
														anIntArray877[local1++] = Static116.anInt2496;
														continue;
													}
													if (local31 == 6108) {
														anIntArray877[local1++] = Static10.aBoolean424 ? 1 : 0;
														continue;
													}
													if (local31 == 6109) {
														anIntArray877[local1++] = Static187.aBoolean270 ? 1 : 0;
														continue;
													}
													if (local31 == 6110) {
														anIntArray877[local1++] = Static178.aBoolean265 ? 1 : 0;
														continue;
													}
													if (local31 == 6111) {
														anIntArray877[local1++] = Static202.anInt3721;
														continue;
													}
													if (local31 == 6112) {
														anIntArray877[local1++] = Static212.aBoolean293 ? 1 : 0;
														continue;
													}
													if (local31 == 6114) {
														anIntArray877[local1++] = Static385.aBoolean467 ? 1 : 0;
														continue;
													}
													if (local31 == 6115) {
														anIntArray877[local1++] = Static58.aBoolean89 ? 1 : 0;
														continue;
													}
													if (local31 == 6116) {
														anIntArray877[local1++] = Static131.anInt2686;
														continue;
													}
													if (local31 == 6117) {
														anIntArray877[local1++] = Static343.aBoolean422 ? 1 : 0;
														continue;
													}
													if (local31 == 6118) {
														anIntArray877[local1++] = Static143.anInt2862;
														continue;
													}
													if (local31 == 6119) {
														anIntArray877[local1++] = Static322.anInt5529;
														continue;
													}
													if (local31 == 6120) {
														anIntArray877[local1++] = Static330.anInt5659;
														continue;
													}
													if (local31 == 6121) {
														anIntArray877[local1++] = Static111.aClass63_3.method1986() ? 1 : 0;
														continue;
													}
													if (local31 == 6123) {
														anIntArray877[local1++] = Static232.method3779();
														continue;
													}
													if (local31 == 6124) {
														anIntArray877[local1++] = Static132.anInt2709;
														continue;
													}
													if (local31 == 6125) {
														anIntArray877[local1++] = Static81.anInt1473;
														continue;
													}
													if (local31 == 6126) {
														anIntArray877[local1++] = Static111.aClass63_3.method1994() ? 1 : 0;
														continue;
													}
													if (local31 == 6127) {
														anIntArray877[local1++] = Static262.aBoolean340 ? 1 : 0;
														continue;
													}
													if (local31 == 6128) {
														anIntArray877[local1++] = Static278.aBoolean357 ? 1 : 0;
														continue;
													}
													if (local31 == 6129) {
														anIntArray877[local1++] = Static116.anInt2496;
														continue;
													}
													if (local31 == 6130) {
														anIntArray877[local1++] = Static358.aBoolean142 ? 1 : 0;
														continue;
													}
													if (local31 == 6131) {
														anIntArray877[local1++] = Static62.anInt1261;
														continue;
													}
													if (local31 == 6132) {
														anIntArray877[local1++] = Static182.anInt3879;
														continue;
													}
													if (local31 == 6133) {
														anIntArray877[local1++] = Static152.anInt2983 == 1 || Static152.anInt2983 == 4 ? 1 : 0;
														continue;
													}
													if (local31 == 6134) {
														anIntArray877[local1++] = Static6.method149(Static253.anInt4468);
														continue;
													}
													if (local31 == 6135) {
														anIntArray877[local1++] = Static29.anInt617;
														continue;
													}
												} else if (local31 < 6300) {
													if (local31 == 6200) {
														local1 -= 2;
														Static280.aShort62 = (short) anIntArray877[local1];
														if (Static280.aShort62 <= 0) {
															Static280.aShort62 = 256;
														}
														Static386.aShort98 = (short) anIntArray877[local1 + 1];
														if (Static386.aShort98 <= 0) {
															Static386.aShort98 = 205;
														}
														continue;
													}
													if (local31 == 6201) {
														local1 -= 2;
														Static81.aShort7 = (short) anIntArray877[local1];
														if (Static81.aShort7 <= 0) {
															Static81.aShort7 = 256;
														}
														Static105.aShort29 = (short) anIntArray877[local1 + 1];
														if (Static105.aShort29 <= 0) {
															Static105.aShort29 = 320;
														}
														continue;
													}
													if (local31 == 6202) {
														local1 -= 4;
														Static1.aShort99 = (short) anIntArray877[local1];
														if (Static1.aShort99 <= 0) {
															Static1.aShort99 = 1;
														}
														Static14.aShort4 = (short) anIntArray877[local1 + 1];
														if (Static14.aShort4 <= 0) {
															Static14.aShort4 = 32767;
														} else if (Static14.aShort4 < Static1.aShort99) {
															Static14.aShort4 = Static1.aShort99;
														}
														Static115.aShort36 = (short) anIntArray877[local1 + 2];
														if (Static115.aShort36 <= 0) {
															Static115.aShort36 = 1;
														}
														Static113.aShort35 = (short) anIntArray877[local1 + 3];
														if (Static113.aShort35 <= 0) {
															Static113.aShort35 = 32767;
														} else if (Static113.aShort35 < Static115.aShort36) {
															Static113.aShort35 = Static115.aShort36;
														}
														continue;
													}
													if (local31 == 6203) {
														Static333.method4911(0, Static68.aClass4_8.anInt113, 0, Static68.aClass4_8.anInt101, false);
														anIntArray877[local1++] = Static243.anInt4331;
														anIntArray877[local1++] = Static206.anInt3801;
														continue;
													}
													if (local31 == 6204) {
														anIntArray877[local1++] = Static81.aShort7;
														anIntArray877[local1++] = Static105.aShort29;
														continue;
													}
													if (local31 == 6205) {
														anIntArray877[local1++] = Static280.aShort62;
														anIntArray877[local1++] = Static386.aShort98;
														continue;
													}
												} else if (local31 < 6400) {
													if (local31 == 6300) {
														anIntArray877[local1++] = (int) (Static39.method699() / 60000L);
														continue;
													}
													if (local31 == 6301) {
														anIntArray877[local1++] = (int) (Static39.method699() / 86400000L) - 11745;
														continue;
													}
													if (local31 == 6302) {
														local1 -= 3;
														local540 = anIntArray877[local1];
														local545 = anIntArray877[local1 + 1];
														local744 = anIntArray877[local1 + 2];
														aCalendar2.clear();
														aCalendar2.set(11, 12);
														aCalendar2.set(local744, local545, local540);
														anIntArray877[local1++] = (int) (aCalendar2.getTime().getTime() / 86400000L) - 11745;
														continue;
													}
													if (local31 == 6303) {
														aCalendar2.clear();
														aCalendar2.setTime(new Date(Static39.method699()));
														anIntArray877[local1++] = aCalendar2.get(1);
														continue;
													}
													if (local31 == 6304) {
														local1--;
														local540 = anIntArray877[local1];
														local1269 = true;
														if (local540 < 0) {
															local1269 = (local540 + 1) % 4 == 0;
														} else if (local540 < 1582) {
															local1269 = local540 % 4 == 0;
														} else if (local540 % 4 != 0) {
															local1269 = false;
														} else if (local540 % 100 != 0) {
															local1269 = true;
														} else if (local540 % 400 != 0) {
															local1269 = false;
														}
														anIntArray877[local1++] = local1269 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6500) {
													if (local31 == 6405) {
														anIntArray877[local1++] = Static208.method3511() ? 1 : 0;
														continue;
													}
													if (local31 == 6406) {
														anIntArray877[local1++] = Static202.method3433() ? 1 : 0;
														continue;
													}
												} else if (local31 < 6600) {
													if (local31 == 6500) {
														if (Static391.anInt6627 == 10 && Static154.anInt2989 == 0 && Static216.anInt3923 == 0 && Static349.anInt4698 == 0) {
															anIntArray877[local1++] = Static324.method4799() == -1 ? 0 : 1;
															continue;
														}
														anIntArray877[local1++] = 1;
														continue;
													}
													@Pc(13410) Class215 local13410;
													@Pc(13386) Class138_Sub1 local13386;
													if (local31 == 6501) {
														local13386 = Static242.method4240();
														if (local13386 == null) {
															anIntArray877[local1++] = -1;
															anIntArray877[local1++] = 0;
															aStringArray116[local3++] = "";
															anIntArray877[local1++] = 0;
															aStringArray116[local3++] = "";
															anIntArray877[local1++] = 0;
															anIntArray877[local1++] = 0;
														} else {
															anIntArray877[local1++] = local13386.anInt3885;
															anIntArray877[local1++] = local13386.anInt3869;
															aStringArray116[local3++] = local13386.aString46;
															local13410 = local13386.method3574();
															anIntArray877[local1++] = local13410.anInt5178;
															aStringArray116[local3++] = local13410.aString57;
															anIntArray877[local1++] = local13386.anInt3871;
															anIntArray877[local1++] = local13386.anInt3884;
														}
														continue;
													}
													if (local31 == 6502) {
														local13386 = Static12.method254();
														if (local13386 == null) {
															anIntArray877[local1++] = -1;
															anIntArray877[local1++] = 0;
															aStringArray116[local3++] = "";
															anIntArray877[local1++] = 0;
															aStringArray116[local3++] = "";
															anIntArray877[local1++] = 0;
															anIntArray877[local1++] = 0;
														} else {
															anIntArray877[local1++] = local13386.anInt3885;
															anIntArray877[local1++] = local13386.anInt3869;
															aStringArray116[local3++] = local13386.aString46;
															local13410 = local13386.method3574();
															anIntArray877[local1++] = local13410.anInt5178;
															aStringArray116[local3++] = local13410.aString57;
															anIntArray877[local1++] = local13386.anInt3871;
															anIntArray877[local1++] = local13386.anInt3884;
														}
														continue;
													}
													if (local31 == 6503) {
														local1--;
														local540 = anIntArray877[local1];
														if (Static391.anInt6627 == 10 && Static154.anInt2989 == 0 && Static216.anInt3923 == 0 && Static349.anInt4698 == 0) {
															anIntArray877[local1++] = Static341.method5002(local540) ? 1 : 0;
															continue;
														}
														anIntArray877[local1++] = 0;
														continue;
													}
													if (local31 == 6504) {
														local1--;
														Static80.anInt1467 = anIntArray877[local1];
														Static164.method2916(Static359.aClass111_5);
														continue;
													}
													if (local31 == 6505) {
														anIntArray877[local1++] = Static80.anInt1467;
														continue;
													}
													if (local31 == 6506) {
														local1--;
														local540 = anIntArray877[local1];
														@Pc(13630) Class138_Sub1 local13630 = Static47.method804(local540);
														if (local13630 == null) {
															anIntArray877[local1++] = -1;
															aStringArray116[local3++] = "";
															anIntArray877[local1++] = 0;
															aStringArray116[local3++] = "";
															anIntArray877[local1++] = 0;
															anIntArray877[local1++] = 0;
														} else {
															anIntArray877[local1++] = local13630.anInt3869;
															aStringArray116[local3++] = local13630.aString46;
															@Pc(13648) Class215 local13648 = local13630.method3574();
															anIntArray877[local1++] = local13648.anInt5178;
															aStringArray116[local3++] = local13648.aString57;
															anIntArray877[local1++] = local13630.anInt3871;
															anIntArray877[local1++] = local13630.anInt3884;
														}
														continue;
													}
													if (local31 == 6507) {
														local1 -= 4;
														local540 = anIntArray877[local1];
														local1269 = anIntArray877[local1 + 1] == 1;
														local744 = anIntArray877[local1 + 2];
														local9978 = anIntArray877[local1 + 3] == 1;
														Static114.method2354(local1269, local540, local744, local9978);
														continue;
													}
													if (local31 == 6508) {
														Static105.method2215();
														continue;
													}
													if (local31 == 6509) {
														if (Static391.anInt6627 == 10) {
															local1--;
															Static384.aBoolean466 = anIntArray877[local1] == 1;
														}
														continue;
													}
												} else if (local31 < 6700) {
													if (local31 == 6600) {
														local1--;
														Static207.aBoolean371 = anIntArray877[local1] == 1;
														Static164.method2916(Static359.aClass111_5);
														continue;
													}
													if (local31 == 6601) {
														anIntArray877[local1++] = Static207.aBoolean371 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6800 && Static196.aClass89_2 == Static311.aClass89_5) {
													if (local31 == 6700) {
														local540 = Static12.aClass246_2.method5615();
														if (Static234.anInt4158 != -1) {
															local540++;
														}
														anIntArray877[local1++] = local540;
														continue;
													}
													if (local31 == 6701) {
														local1--;
														local540 = anIntArray877[local1];
														if (Static234.anInt4158 != -1) {
															if (local540 == 0) {
																anIntArray877[local1++] = Static234.anInt4158;
																continue;
															}
															local540--;
														}
														local3554 = (Class2_Sub38) Static12.aClass246_2.method5606();
														while (local540-- > 0) {
															local3554 = (Class2_Sub38) Static12.aClass246_2.method5614();
														}
														anIntArray877[local1++] = local3554.anInt4976;
														continue;
													}
													if (local31 == 6702) {
														local1--;
														local540 = anIntArray877[local1];
														if (Static183.aClass4ArrayArray1[local540] == null) {
															aStringArray116[local3++] = "";
														} else {
															local1702 = Static183.aClass4ArrayArray1[local540][0].aString3;
															if (local1702 == null) {
																aStringArray116[local3++] = "";
															} else {
																aStringArray116[local3++] = local1702.substring(0, local1702.indexOf(58));
															}
														}
														continue;
													}
													if (local31 == 6703) {
														local1--;
														local540 = anIntArray877[local1];
														if (Static183.aClass4ArrayArray1[local540] == null) {
															anIntArray877[local1++] = 0;
														} else {
															anIntArray877[local1++] = Static183.aClass4ArrayArray1[local540].length;
														}
														continue;
													}
													if (local31 == 6704) {
														local1 -= 2;
														local540 = anIntArray877[local1];
														local545 = anIntArray877[local1 + 1];
														if (Static183.aClass4ArrayArray1[local540] == null) {
															aStringArray116[local3++] = "";
														} else {
															local11105 = Static183.aClass4ArrayArray1[local540][local545].aString3;
															if (local11105 == null) {
																aStringArray116[local3++] = "";
															} else {
																aStringArray116[local3++] = local11105;
															}
														}
														continue;
													}
													if (local31 == 6705) {
														local1 -= 2;
														local540 = anIntArray877[local1];
														local545 = anIntArray877[local1 + 1];
														if (Static183.aClass4ArrayArray1[local540] == null) {
															anIntArray877[local1++] = 0;
														} else {
															anIntArray877[local1++] = Static183.aClass4ArrayArray1[local540][local545].anInt129;
														}
														continue;
													}
													if (local31 == 6706) {
														continue;
													}
													if (local31 == 6707) {
														local1 -= 3;
														local540 = anIntArray877[local1];
														local545 = anIntArray877[local1 + 1];
														local744 = anIntArray877[local1 + 2];
														Static168.method2960(local540 << 16 | local545, "", 1, local744);
														continue;
													}
													if (local31 == 6708) {
														local1 -= 3;
														local540 = anIntArray877[local1];
														local545 = anIntArray877[local1 + 1];
														local744 = anIntArray877[local1 + 2];
														Static168.method2960(local540 << 16 | local545, "", 2, local744);
														continue;
													}
													if (local31 == 6709) {
														local1 -= 3;
														local540 = anIntArray877[local1];
														local545 = anIntArray877[local1 + 1];
														local744 = anIntArray877[local1 + 2];
														Static168.method2960(local540 << 16 | local545, "", 3, local744);
														continue;
													}
													if (local31 == 6710) {
														local1 -= 3;
														local540 = anIntArray877[local1];
														local545 = anIntArray877[local1 + 1];
														local744 = anIntArray877[local1 + 2];
														Static168.method2960(local540 << 16 | local545, "", 4, local744);
														continue;
													}
													if (local31 == 6711) {
														local1 -= 3;
														local540 = anIntArray877[local1];
														local545 = anIntArray877[local1 + 1];
														local744 = anIntArray877[local1 + 2];
														Static168.method2960(local540 << 16 | local545, "", 5, local744);
														continue;
													}
													if (local31 == 6712) {
														local1 -= 3;
														local540 = anIntArray877[local1];
														local545 = anIntArray877[local1 + 1];
														local744 = anIntArray877[local1 + 2];
														Static168.method2960(local540 << 16 | local545, "", 6, local744);
														continue;
													}
													if (local31 == 6713) {
														local1 -= 3;
														local540 = anIntArray877[local1];
														local545 = anIntArray877[local1 + 1];
														local744 = anIntArray877[local1 + 2];
														Static168.method2960(local540 << 16 | local545, "", 7, local744);
														continue;
													}
													if (local31 == 6714) {
														local1 -= 3;
														local540 = anIntArray877[local1];
														local545 = anIntArray877[local1 + 1];
														local744 = anIntArray877[local1 + 2];
														Static168.method2960(local540 << 16 | local545, "", 8, local744);
														continue;
													}
													if (local31 == 6715) {
														local1 -= 3;
														local540 = anIntArray877[local1];
														local545 = anIntArray877[local1 + 1];
														local744 = anIntArray877[local1 + 2];
														Static168.method2960(local540 << 16 | local545, "", 9, local744);
														continue;
													}
													if (local31 == 6716) {
														local1 -= 3;
														local540 = anIntArray877[local1];
														local545 = anIntArray877[local1 + 1];
														local744 = anIntArray877[local1 + 2];
														Static168.method2960(local540 << 16 | local545, "", 10, local744);
														continue;
													}
													if (local31 == 6717) {
														local1 -= 3;
														local540 = anIntArray877[local1];
														local545 = anIntArray877[local1 + 1];
														local744 = anIntArray877[local1 + 2];
														local754 = Static164.method2913(local744, local540 << 16 | local545);
														Static259.method4010();
														@Pc(14365) Class2_Sub11 local14365 = Static45.method784(local754);
														Static316.method4699(local744, local14365.anInt748, local540 << 16 | local545, local754.anInt56, local754.anInt70, local14365.method642());
														continue;
													}
												} else if (local31 < 6900) {
													@Pc(14399) Class243 local14399;
													if (local31 == 6800) {
														local1--;
														local540 = anIntArray877[local1];
														local14399 = Static158.aClass226_1.method4913(local540);
														if (local14399.aString64 == null) {
															aStringArray116[local3++] = "";
														} else {
															aStringArray116[local3++] = local14399.aString64;
														}
														continue;
													}
													if (local31 == 6801) {
														local1--;
														local540 = anIntArray877[local1];
														local14399 = Static158.aClass226_1.method4913(local540);
														anIntArray877[local1++] = local14399.anInt6344;
														continue;
													}
													if (local31 == 6802) {
														local1--;
														local540 = anIntArray877[local1];
														local14399 = Static158.aClass226_1.method4913(local540);
														anIntArray877[local1++] = local14399.anInt6369;
														continue;
													}
													if (local31 == 6803) {
														local1--;
														local540 = anIntArray877[local1];
														local14399 = Static158.aClass226_1.method4913(local540);
														anIntArray877[local1++] = local14399.anInt6354;
														continue;
													}
													if (local31 == 6804) {
														local1 -= 2;
														local540 = anIntArray877[local1];
														local545 = anIntArray877[local1 + 1];
														local7383 = Static261.aClass125_2.method2922(local545);
														if (local7383.method3307()) {
															aStringArray116[local3++] = Static158.aClass226_1.method4913(local540).method5522(local7383.aString42, local545);
														} else {
															anIntArray877[local1++] = Static158.aClass226_1.method4913(local540).method5518(local7383.anInt3627, local545);
														}
														continue;
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
				throw new IllegalStateException();
			}
		} catch (@Pc(14532) Exception local14532) {
			@Pc(14550) StringBuffer local14550;
			if (arg0.aString37 == null) {
				local14550 = new StringBuffer(30);
				local14550.append("CS2: ").append(arg0.aLong209).append(" ");
				for (local540 = anInt4510 - 1; local540 >= 0; local540--) {
					local14550.append("v: ").append(aClass61Array1[local540].aClass2_Sub10_Sub11_1.aLong209).append(" ");
				}
				local14550.append("op: ").append(local13);
				Static142.method2676(local14532, local14550.toString());
			} else {
				Static351.method5638("Clientscript error in: " + arg0.aString37);
				local14550 = new StringBuffer(30);
				local14550.append("Clientscript error in: ").append(arg0.aString37).append("\n");
				for (local540 = anInt4510 - 1; local540 >= 0; local540--) {
					local14550.append("via: ").append(aClass61Array1[local540].aClass2_Sub10_Sub11_1.aString37).append("\n");
				}
				local14550.append("Op: ").append(local13).append("\n");
				local1702 = local14532.getMessage();
				if (local1702 != null && local1702.length() > 0) {
					local14550.append("Message: ").append(local1702).append("\n");
				}
				Static142.method2676(local14532, local14550.toString());
				Static210.method3525(local14550.toString());
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lclient!i;I)V")
	private static void method4000(@OriginalArg(0) Class2_Sub22 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray33;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class2_Sub10_Sub11 local12 = Static322.method4784(local8);
		if (local12 == null) {
			return;
		}
		anIntArray878 = new int[local12.anInt3505];
		@Pc(21) int local21 = 0;
		aStringArray117 = new String[local12.anInt3501];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt2778;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt2776;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass4_15 == null ? -1 : arg0.aClass4_15.anInt94;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt2770;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass4_15 == null ? -1 : arg0.aClass4_15.lb;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass4_14 == null ? -1 : arg0.aClass4_14.anInt94;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass4_14 == null ? -1 : arg0.aClass4_14.lb;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt2772;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt2777;
				}
				anIntArray878[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString28;
				}
				aStringArray117[local27++] = local135;
			}
		}
		method3999(local12, arg1);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lclient!hq;II)V")
	public static void method4002(@OriginalArg(0) Class101 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class2_Sub10_Sub11 local5 = Static356.method5235(arg2, arg1, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray878 = new int[local5.anInt3505];
		aStringArray117 = new String[local5.anInt3501];
		if (local5.aClass101_10 == Static303.aClass101_11 || local5.aClass101_10 == Static15.aClass101_2 || local5.aClass101_10 == Static106.aClass101_7) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static240.aClass4_18 != null) {
				local30 = Static240.aClass4_18.anInt71;
				local32 = Static240.aClass4_18.anInt48;
			}
			anIntArray878[0] = Static311.aClass129_1.method2997() - local30;
			anIntArray878[1] = Static311.aClass129_1.method2989() - local32;
		}
		method3999(local5, 200000);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lclient!i;)V")
	public static void method4003(@OriginalArg(0) Class2_Sub22 arg0) {
		method4000(arg0, 200000);
	}
}
