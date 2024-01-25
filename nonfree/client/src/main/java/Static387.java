import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!wl", name = "h", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray85;

	@OriginalMember(owner = "client!wl", name = "j", descriptor = "[I")
	private static int[] anIntArray738;

	@OriginalMember(owner = "client!wl", name = "o", descriptor = "Lclient!je;")
	private static Class117 aClass117_19;

	@OriginalMember(owner = "client!wl", name = "r", descriptor = "Lclient!je;")
	private static Class117 aClass117_20;

	@OriginalMember(owner = "client!wl", name = "u", descriptor = "Lclient!od;")
	private static Class171 aClass171_1;

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "[I")
	private static final int[] anIntArray737 = new int[1000];

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "[[I")
	private static final int[][] anIntArrayArray62 = new int[5][5000];

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
	private static int anInt6319 = 0;

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "[Lclient!rc;")
	private static final Class199[] aClass199Array1 = new Class199[50];

	@OriginalMember(owner = "client!wl", name = "k", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray86 = new String[1000];

	@OriginalMember(owner = "client!wl", name = "p", descriptor = "[I")
	private static final int[] anIntArray739 = new int[5];

	@OriginalMember(owner = "client!wl", name = "s", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!wl", name = "x", descriptor = "[I")
	private static final int[] anIntArray740 = new int[3];

	@OriginalMember(owner = "client!wl", name = "y", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray87 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!wl", name = "z", descriptor = "Lclient!tl;")
	public static final Class227 aClass227_54 = new Class227(4);

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!bu;I)V")
	private static void method5489(@OriginalArg(0) Class1_Sub6_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray111;
		@Pc(11) int[] local11 = arg0.anIntArray112;
		@Pc(13) byte local13 = -1;
		anInt6319 = 0;
		@Pc(540) int local540;
		@Pc(1724) String local1724;
		try {
			@Pc(17) int local17 = 0;
			label4425: while (true) {
				local17++;
				if (local17 > arg1) {
					throw new RuntimeException("slow");
				}
				local5++;
				@Pc(31) int local31 = local8[local5];
				@Pc(303) int local303;
				@Pc(545) int local545;
				@Pc(395) int local395;
				@Pc(414) int local414;
				@Pc(352) String local352;
				if (local31 < 100) {
					if (local31 == 0) {
						anIntArray737[local1++] = local11[local5];
						continue;
					}
					@Pc(51) int local51;
					if (local31 == 1) {
						local51 = local11[local5];
						anIntArray737[local1++] = Static230.aClass72_3.anIntArray213[local51];
						continue;
					}
					if (local31 == 2) {
						local51 = local11[local5];
						local1--;
						Static230.aClass72_3.method1336(anIntArray737[local1], local51);
						continue;
					}
					if (local31 == 3) {
						aStringArray86[local3++] = arg0.aStringArray12[local5];
						continue;
					}
					if (local31 == 6) {
						local5 += local11[local5];
						continue;
					}
					if (local31 == 7) {
						local1 -= 2;
						if (anIntArray737[local1] != anIntArray737[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 8) {
						local1 -= 2;
						if (anIntArray737[local1] == anIntArray737[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 9) {
						local1 -= 2;
						if (anIntArray737[local1] < anIntArray737[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 10) {
						local1 -= 2;
						if (anIntArray737[local1] > anIntArray737[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 21) {
						if (anInt6319 == 0) {
							return;
						}
						@Pc(192) Class199 local192 = aClass199Array1[--anInt6319];
						arg0 = local192.aClass1_Sub6_Sub1_1;
						local8 = arg0.anIntArray111;
						local11 = arg0.anIntArray112;
						local5 = local192.anInt5087;
						anIntArray738 = local192.anIntArray605;
						aStringArray85 = local192.aStringArray72;
						continue;
					}
					if (local31 == 25) {
						local51 = local11[local5];
						anIntArray737[local1++] = Static230.aClass72_3.method1333(local51);
						continue;
					}
					if (local31 == 27) {
						local51 = local11[local5];
						local1--;
						Static230.aClass72_3.method1345(anIntArray737[local1], local51);
						continue;
					}
					if (local31 == 31) {
						local1 -= 2;
						if (anIntArray737[local1] <= anIntArray737[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 32) {
						local1 -= 2;
						if (anIntArray737[local1] >= anIntArray737[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 33) {
						anIntArray737[local1++] = anIntArray738[local11[local5]];
						continue;
					}
					if (local31 == 34) {
						local303 = local11[local5];
						local1--;
						anIntArray738[local303] = anIntArray737[local1];
						continue;
					}
					if (local31 == 35) {
						aStringArray86[local3++] = aStringArray85[local11[local5]];
						continue;
					}
					if (local31 == 36) {
						local303 = local11[local5];
						local3--;
						aStringArray85[local303] = aStringArray86[local3];
						continue;
					}
					if (local31 == 37) {
						local51 = local11[local5];
						local3 -= local51;
						local352 = Static124.method1809(local51, local3, aStringArray86);
						aStringArray86[local3++] = local352;
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
						@Pc(379) Class1_Sub6_Sub1 local379 = Static152.method2306(local51);
						if (local379 == null) {
							throw new RuntimeException();
						}
						@Pc(389) int[] local389 = new int[local379.anInt733];
						@Pc(393) String[] local393 = new String[local379.anInt732];
						for (local395 = 0; local395 < local379.anInt736; local395++) {
							local389[local395] = anIntArray737[local1 + local395 - local379.anInt736];
						}
						for (local414 = 0; local414 < local379.anInt735; local414++) {
							local393[local414] = aStringArray86[local3 + local414 - local379.anInt735];
						}
						local1 -= local379.anInt736;
						local3 -= local379.anInt735;
						@Pc(445) Class199 local445 = new Class199();
						local445.aClass1_Sub6_Sub1_1 = arg0;
						local445.anInt5087 = local5;
						local445.anIntArray605 = anIntArray738;
						local445.aStringArray72 = aStringArray85;
						if (anInt6319 >= aClass199Array1.length) {
							throw new RuntimeException();
						}
						aClass199Array1[anInt6319++] = local445;
						arg0 = local379;
						local8 = local379.anIntArray111;
						local11 = local379.anIntArray112;
						local5 = -1;
						anIntArray738 = local389;
						aStringArray85 = local393;
						continue;
					}
					if (local31 == 42) {
						anIntArray737[local1++] = Static158.anIntArray322[local11[local5]];
						continue;
					}
					if (local31 == 43) {
						local51 = local11[local5];
						local1--;
						Static158.anIntArray322[local51] = anIntArray737[local1];
						Static319.method4697(local51);
						Static121.aBoolean177 |= Static105.aBooleanArray10[local51];
						continue;
					}
					if (local31 == 44) {
						local51 = local11[local5] >> 16;
						local540 = local11[local5] & 0xFFFF;
						local1--;
						local545 = anIntArray737[local1];
						if (local545 >= 0 && local545 <= 5000) {
							anIntArray739[local51] = local545;
							@Pc(560) byte local560 = -1;
							if (local540 == 105) {
								local560 = 0;
							}
							local395 = 0;
							while (true) {
								if (local395 >= local545) {
									continue label4425;
								}
								anIntArrayArray62[local51][local395] = local560;
								local395++;
							}
						}
						throw new RuntimeException();
					}
					if (local31 == 45) {
						local51 = local11[local5];
						local1--;
						local540 = anIntArray737[local1];
						if (local540 >= 0 && local540 < anIntArray739[local51]) {
							anIntArray737[local1++] = anIntArrayArray62[local51][local540];
							continue;
						}
						throw new RuntimeException();
					}
					if (local31 == 46) {
						local51 = local11[local5];
						local1 -= 2;
						local540 = anIntArray737[local1];
						if (local540 >= 0 && local540 < anIntArray739[local51]) {
							anIntArrayArray62[local51][local540] = anIntArray737[local1 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local31 == 47) {
						@Pc(655) String local655 = Static230.aStringArray83[local11[local5]];
						if (local655 == null) {
							local655 = "null";
						}
						aStringArray86[local3++] = local655;
						continue;
					}
					if (local31 == 48) {
						local51 = local11[local5];
						local3--;
						Static230.aStringArray83[local51] = aStringArray86[local3];
						Static3.method15(local51);
						continue;
					}
					if (local31 == 51) {
						@Pc(693) Class77 local693 = arg0.aClass77Array1[local11[local5]];
						local1--;
						@Pc(703) Class1_Sub30 local703 = (Class1_Sub30) local693.method1368((long) anIntArray737[local1]);
						if (local703 != null) {
							local5 += local703.anInt3799;
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
				@Pc(856) Class117 local856;
				@Pc(754) Class117 local754;
				@Pc(923) Class117 local923;
				@Pc(775) int local775;
				if (local31 < 300) {
					if (local31 == 100) {
						local1 -= 3;
						local540 = anIntArray737[local1];
						local545 = anIntArray737[local1 + 1];
						local744 = anIntArray737[local1 + 2];
						if (local545 == 0) {
							throw new RuntimeException();
						}
						local754 = Static13.method107(local540);
						if (local754.aClass117Array1 == null) {
							local754.aClass117Array1 = new Class117[local744 + 1];
						}
						if (local754.aClass117Array1.length <= local744) {
							@Pc(773) Class117[] local773 = new Class117[local744 + 1];
							for (local775 = 0; local775 < local754.aClass117Array1.length; local775++) {
								local773[local775] = local754.aClass117Array1[local775];
							}
							local754.aClass117Array1 = local773;
						}
						if (local744 > 0 && local754.aClass117Array1[local744 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local744 - 1));
						}
						@Pc(818) Class117 local818 = new Class117();
						local818.anInt3108 = local545;
						local818.anInt3066 = local818.anInt3093 = local754.anInt3093;
						local818.anInt3043 = local744;
						local754.aClass117Array1[local744] = local818;
						if (local718) {
							aClass117_20 = local818;
						} else {
							aClass117_19 = local818;
						}
						Static312.method4635(local754);
						continue;
					}
					@Pc(877) Class117 local877;
					if (local31 == 101) {
						local856 = local718 ? aClass117_20 : aClass117_19;
						if (local856.anInt3043 == -1) {
							if (local718) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						local877 = Static13.method107(local856.anInt3093);
						local877.aClass117Array1[local856.anInt3043] = null;
						Static312.method4635(local877);
						continue;
					}
					if (local31 == 102) {
						local1--;
						local856 = Static13.method107(anIntArray737[local1]);
						local856.aClass117Array1 = null;
						Static312.method4635(local856);
						continue;
					}
					if (local31 == 200) {
						local1 -= 2;
						local540 = anIntArray737[local1];
						local545 = anIntArray737[local1 + 1];
						local923 = Static84.method1246(local540, local545);
						if (local923 != null && local545 != -1) {
							anIntArray737[local1++] = 1;
							if (local718) {
								aClass117_20 = local923;
							} else {
								aClass117_19 = local923;
							}
							continue;
						}
						anIntArray737[local1++] = 0;
						continue;
					}
					if (local31 == 201) {
						local1--;
						local540 = anIntArray737[local1];
						local877 = Static13.method107(local540);
						if (local877 == null) {
							anIntArray737[local1++] = 0;
						} else {
							anIntArray737[local1++] = 1;
							if (local718) {
								aClass117_20 = local877;
							} else {
								aClass117_19 = local877;
							}
						}
						continue;
					}
					if (local31 == 202) {
						local1--;
						local540 = anIntArray737[local1];
						method5490(local540);
						continue;
					}
					if (local31 == 203) {
						local1--;
						local540 = anIntArray737[local1];
						method5492(local540);
						continue;
					}
				} else {
					@Pc(1095) boolean local1095;
					if (local31 < 500) {
						if (local31 == 403) {
							local1 -= 2;
							local540 = anIntArray737[local1];
							local545 = anIntArray737[local1 + 1];
							for (local744 = 0; local744 < Static37.anIntArray109.length; local744++) {
								if (Static37.anIntArray109[local744] == local540) {
									Static321.aClass25_Sub1_Sub1_Sub1_2.aClass49_1.method904(local744, local545, Static183.aClass146_2);
									continue label4425;
								}
							}
							local395 = 0;
							while (true) {
								if (local395 >= Static388.anIntArray744.length) {
									continue label4425;
								}
								if (Static388.anIntArray744[local395] == local540) {
									Static321.aClass25_Sub1_Sub1_Sub1_2.aClass49_1.method904(local395, local545, Static183.aClass146_2);
									continue label4425;
								}
								local395++;
							}
						}
						if (local31 == 404) {
							local1 -= 2;
							local540 = anIntArray737[local1];
							local545 = anIntArray737[local1 + 1];
							Static321.aClass25_Sub1_Sub1_Sub1_2.aClass49_1.method910(local540, local545);
							continue;
						}
						if (local31 == 410) {
							local1--;
							local1095 = anIntArray737[local1] != 0;
							Static321.aClass25_Sub1_Sub1_Sub1_2.aClass49_1.method900(local1095);
							continue;
						}
					} else {
						@Pc(1291) boolean local1291;
						if (local31 >= 1000 && local31 < 1100 || local31 >= 2000 && local31 < 2100) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local856 = Static13.method107(anIntArray737[local1]);
							} else {
								local856 = local718 ? aClass117_20 : aClass117_19;
							}
							if (local31 == 1000) {
								local1 -= 4;
								local856.anInt3037 = anIntArray737[local1];
								local856.anInt3087 = anIntArray737[local1 + 1];
								local545 = anIntArray737[local1 + 2];
								if (local545 < 0) {
									local545 = 0;
								} else if (local545 > 5) {
									local545 = 5;
								}
								local744 = anIntArray737[local1 + 3];
								if (local744 < 0) {
									local744 = 0;
								} else if (local744 > 5) {
									local744 = 5;
								}
								local856.aByte41 = (byte) local545;
								local856.aByte40 = (byte) local744;
								Static312.method4635(local856);
								Static368.method5122(local856);
								if (local856.anInt3043 == -1) {
									Static299.method5147(local856.anInt3093);
								}
								continue;
							}
							if (local31 == 1001) {
								local1 -= 4;
								local856.anInt3100 = anIntArray737[local1];
								local856.anInt3079 = anIntArray737[local1 + 1];
								local856.anInt3075 = 0;
								local856.anInt3062 = 0;
								local545 = anIntArray737[local1 + 2];
								if (local545 < 0) {
									local545 = 0;
								} else if (local545 > 4) {
									local545 = 4;
								}
								local744 = anIntArray737[local1 + 3];
								if (local744 < 0) {
									local744 = 0;
								} else if (local744 > 4) {
									local744 = 4;
								}
								local856.aByte42 = (byte) local545;
								local856.aByte39 = (byte) local744;
								Static312.method4635(local856);
								Static368.method5122(local856);
								if (local856.anInt3108 == 0) {
									Static365.method5064(false, local856);
								}
								continue;
							}
							if (local31 == 1003) {
								local1--;
								local1291 = anIntArray737[local1] == 1;
								if (local856.aBoolean263 != local1291) {
									local856.aBoolean263 = local1291;
									Static312.method4635(local856);
								}
								if (local856.anInt3043 == -1) {
									Static187.method2680(local856.anInt3093);
								}
								continue;
							}
							if (local31 == 1004) {
								local1 -= 2;
								local856.anInt3039 = anIntArray737[local1];
								local856.anInt3081 = anIntArray737[local1 + 1];
								Static312.method4635(local856);
								Static368.method5122(local856);
								if (local856.anInt3108 == 0) {
									Static365.method5064(false, local856);
								}
								continue;
							}
							if (local31 == 1005) {
								local1--;
								local856.aBoolean274 = anIntArray737[local1] == 1;
								continue;
							}
						} else if (local31 >= 1100 && local31 < 1200 || local31 >= 2100 && local31 < 2200) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local856 = Static13.method107(anIntArray737[local1]);
							} else {
								local856 = local718 ? aClass117_20 : aClass117_19;
							}
							if (local31 == 1100) {
								local1 -= 2;
								local856.anInt3040 = anIntArray737[local1];
								if (local856.anInt3040 > local856.anInt3056 - local856.anInt3074) {
									local856.anInt3040 = local856.anInt3056 - local856.anInt3074;
								}
								if (local856.anInt3040 < 0) {
									local856.anInt3040 = 0;
								}
								local856.anInt3089 = anIntArray737[local1 + 1];
								if (local856.anInt3089 > local856.anInt3078 - local856.anInt3071) {
									local856.anInt3089 = local856.anInt3078 - local856.anInt3071;
								}
								if (local856.anInt3089 < 0) {
									local856.anInt3089 = 0;
								}
								Static312.method4635(local856);
								if (local856.anInt3043 == -1) {
									Static363.method5050(local856.anInt3093);
								}
								continue;
							}
							if (local31 == 1101) {
								local1--;
								local856.anInt3091 = anIntArray737[local1];
								Static312.method4635(local856);
								if (local856.anInt3043 == -1) {
									Static305.method4535(local856.anInt3093);
								}
								continue;
							}
							if (local31 == 1102) {
								local1--;
								local856.aBoolean269 = anIntArray737[local1] == 1;
								Static312.method4635(local856);
								continue;
							}
							if (local31 == 1103) {
								local1--;
								local856.anInt3105 = anIntArray737[local1];
								Static312.method4635(local856);
								continue;
							}
							if (local31 == 1104) {
								local1--;
								local856.anInt3112 = anIntArray737[local1];
								Static312.method4635(local856);
								continue;
							}
							if (local31 == 1105) {
								local1--;
								local545 = anIntArray737[local1];
								if (local856.anInt3055 != local545) {
									local856.anInt3055 = local545;
									Static312.method4635(local856);
								}
								if (local856.anInt3043 == -1) {
									Static129.method1897(local856.anInt3093);
								}
								continue;
							}
							if (local31 == 1106) {
								local1--;
								local856.anInt3086 = anIntArray737[local1];
								Static312.method4635(local856);
								continue;
							}
							if (local31 == 1107) {
								local1--;
								local856.aBoolean273 = anIntArray737[local1] == 1;
								Static312.method4635(local856);
								continue;
							}
							if (local31 == 1108) {
								local856.anInt3068 = 1;
								local1--;
								local856.lb = anIntArray737[local1];
								Static312.method4635(local856);
								if (local856.anInt3043 == -1) {
									Static117.method1732(local856.anInt3093);
								}
								continue;
							}
							if (local31 == 1109) {
								local1 -= 6;
								local856.anInt3106 = anIntArray737[local1];
								local856.anInt3035 = anIntArray737[local1 + 1];
								local856.anInt3036 = anIntArray737[local1 + 2];
								local856.anInt3109 = anIntArray737[local1 + 3];
								local856.anInt3116 = anIntArray737[local1 + 4];
								local856.anInt3067 = anIntArray737[local1 + 5];
								Static312.method4635(local856);
								if (local856.anInt3043 == -1) {
									Static356.method2742(local856.anInt3093);
									Static147.method2205(local856.anInt3093);
								}
								continue;
							}
							if (local31 == 1110) {
								local1--;
								local545 = anIntArray737[local1];
								if (local856.anInt3088 != local545) {
									local856.anInt3088 = local545;
									local856.anInt3059 = 0;
									local856.anInt3057 = 1;
									local856.anInt3044 = 0;
									Static312.method4635(local856);
								}
								if (local856.anInt3043 == -1) {
									Static170.method2503(local856.anInt3093);
								}
								continue;
							}
							if (local31 == 1111) {
								local1--;
								local856.aBoolean262 = anIntArray737[local1] == 1;
								Static312.method4635(local856);
								continue;
							}
							if (local31 == 1112) {
								local3--;
								local1724 = aStringArray86[local3];
								if (!local1724.equals(local856.aString30)) {
									local856.aString30 = local1724;
									Static312.method4635(local856);
								}
								if (local856.anInt3043 == -1) {
									Static115.method1697(local856.anInt3093);
								}
								continue;
							}
							if (local31 == 1113) {
								local1--;
								local856.anInt3101 = anIntArray737[local1];
								Static312.method4635(local856);
								if (local856.anInt3043 == -1) {
									Static317.method4658(local856.anInt3093);
								}
								continue;
							}
							if (local31 == 1114) {
								local1 -= 3;
								local856.anInt3082 = anIntArray737[local1];
								local856.anInt3051 = anIntArray737[local1 + 1];
								local856.anInt3113 = anIntArray737[local1 + 2];
								Static312.method4635(local856);
								continue;
							}
							if (local31 == 1115) {
								local1--;
								local856.aBoolean268 = anIntArray737[local1] == 1;
								Static312.method4635(local856);
								continue;
							}
							if (local31 == 1116) {
								local1--;
								local856.anInt3103 = anIntArray737[local1];
								Static312.method4635(local856);
								continue;
							}
							if (local31 == 1117) {
								local1--;
								local856.anInt3084 = anIntArray737[local1];
								Static312.method4635(local856);
								continue;
							}
							if (local31 == 1118) {
								local1--;
								local856.aBoolean260 = anIntArray737[local1] == 1;
								Static312.method4635(local856);
								continue;
							}
							if (local31 == 1119) {
								local1--;
								local856.aBoolean271 = anIntArray737[local1] == 1;
								Static312.method4635(local856);
								continue;
							}
							if (local31 == 1120) {
								local1 -= 2;
								local856.anInt3056 = anIntArray737[local1];
								local856.anInt3078 = anIntArray737[local1 + 1];
								Static312.method4635(local856);
								if (local856.anInt3108 == 0) {
									Static365.method5064(false, local856);
								}
								continue;
							}
							if (local31 == 1121) {
								local1 -= 2;
								local856.aShort56 = (short) anIntArray737[local1];
								local856.aShort55 = (short) anIntArray737[local1 + 1];
								Static312.method4635(local856);
								continue;
							}
							if (local31 == 1122) {
								local1--;
								local856.aBoolean266 = anIntArray737[local1] == 1;
								Static312.method4635(local856);
								continue;
							}
							if (local31 == 1123) {
								local1--;
								local856.anInt3067 = anIntArray737[local1];
								Static312.method4635(local856);
								if (local856.anInt3043 == -1) {
									Static356.method2742(local856.anInt3093);
								}
								continue;
							}
							if (local31 == 1124) {
								local1--;
								local545 = anIntArray737[local1];
								local856.aBoolean276 = local545 == 1;
								Static312.method4635(local856);
								continue;
							}
							if (local31 == 1125) {
								local1 -= 2;
								local856.anInt3115 = anIntArray737[local1];
								local856.anInt3052 = anIntArray737[local1 + 1];
								Static312.method4635(local856);
								continue;
							}
						} else if (local31 >= 1200 && local31 < 1300 || !(local31 < 2200 || local31 >= 2300)) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local856 = Static13.method107(anIntArray737[local1]);
							} else {
								local856 = local718 ? aClass117_20 : aClass117_19;
							}
							Static312.method4635(local856);
							if (local31 == 1200 || local31 == 1205 || local31 == 1208 || local31 == 1209 || local31 == 1212 || local31 == 1213) {
								local1 -= 2;
								local545 = anIntArray737[local1];
								local744 = anIntArray737[local1 + 1];
								if (local856.anInt3043 == -1) {
									Static250.method3877(local856.anInt3093);
									Static356.method2742(local856.anInt3093);
									Static147.method2205(local856.anInt3093);
								}
								if (local545 == -1) {
									local856.anInt3068 = 1;
									local856.lb = -1;
									local856.anInt3080 = -1;
									continue;
								}
								local856.anInt3080 = local545;
								local856.anInt3107 = local744;
								if (local31 == 1208 || local31 == 1209) {
									local856.aBoolean267 = true;
								} else {
									local856.aBoolean267 = false;
								}
								@Pc(2115) Class88 local2115 = Static263.aClass102_2.method2172(local545);
								local856.anInt3036 = local2115.anInt2029;
								local856.anInt3109 = local2115.anInt2024;
								local856.anInt3116 = local2115.anInt1996;
								local856.anInt3106 = local2115.anInt2015;
								local856.anInt3035 = local2115.anInt1991;
								local856.anInt3067 = local2115.anInt2017;
								if (local31 == 1205 || local31 == 1209) {
									local856.anInt3063 = 0;
								} else if (local31 == 1212 || local31 == 1213) {
									local856.anInt3063 = 1;
								} else {
									local856.anInt3063 = 2;
								}
								if (local856.anInt3075 > 0) {
									local856.anInt3067 = local856.anInt3067 * 32 / local856.anInt3075;
								} else if (local856.anInt3100 > 0) {
									local856.anInt3067 = local856.anInt3067 * 32 / local856.anInt3100;
								}
								continue;
							}
							if (local31 == 1201) {
								local856.anInt3068 = 2;
								local1--;
								local856.lb = anIntArray737[local1];
								if (local856.anInt3043 == -1) {
									Static117.method1732(local856.anInt3093);
								}
								continue;
							}
							if (local31 == 1202) {
								local856.anInt3068 = 3;
								local856.lb = -1;
								if (local856.anInt3043 == -1) {
									Static117.method1732(local856.anInt3093);
								}
								continue;
							}
							if (local31 == 1203) {
								local856.anInt3068 = 6;
								local1--;
								local856.lb = anIntArray737[local1];
								if (local856.anInt3043 == -1) {
									Static117.method1732(local856.anInt3093);
								}
								continue;
							}
							if (local31 == 1204) {
								local856.anInt3068 = 5;
								local1--;
								local856.lb = anIntArray737[local1];
								if (local856.anInt3043 == -1) {
									Static117.method1732(local856.anInt3093);
								}
								continue;
							}
							if (local31 == 1206) {
								local1 -= 4;
								local856.anInt3097 = anIntArray737[local1];
								local856.anInt3046 = anIntArray737[local1 + 1];
								local856.anInt3085 = anIntArray737[local1 + 2];
								local856.anInt3090 = anIntArray737[local1 + 3];
								Static312.method4635(local856);
								continue;
							}
							if (local31 == 1207) {
								local1 -= 2;
								local856.anInt3069 = anIntArray737[local1];
								local856.anInt3041 = anIntArray737[local1 + 1];
								Static312.method4635(local856);
								continue;
							}
							if (local31 == 1210) {
								local1 -= 4;
								local856.lb = anIntArray737[local1];
								local856.anInt3058 = anIntArray737[local1 + 1];
								if (anIntArray737[local1 + 2] == 1) {
									local856.anInt3068 = 9;
								} else {
									local856.anInt3068 = 8;
								}
								if (anIntArray737[local1 + 3] == 1) {
									local856.aBoolean267 = true;
								} else {
									local856.aBoolean267 = false;
								}
								if (local856.anInt3043 == -1) {
									Static117.method1732(local856.anInt3093);
								}
								continue;
							}
							if (local31 == 1211) {
								local856.anInt3068 = 5;
								local856.lb = Static43.anInt861;
								local856.anInt3058 = 0;
								if (local856.anInt3043 == -1) {
									Static117.method1732(local856.anInt3093);
								}
								continue;
							}
						} else if (local31 >= 1300 && local31 < 1400 || local31 >= 2300 && local31 < 2400) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local856 = Static13.method107(anIntArray737[local1]);
							} else {
								local856 = local718 ? aClass117_20 : aClass117_19;
							}
							if (local31 == 1300) {
								local1--;
								local545 = anIntArray737[local1] - 1;
								if (local545 >= 0 && local545 <= 9) {
									local3--;
									local856.method2506(aStringArray86[local3], local545);
									continue;
								}
								local3--;
								continue;
							}
							if (local31 == 1301) {
								local1 -= 2;
								local545 = anIntArray737[local1];
								local744 = anIntArray737[local1 + 1];
								local856.aClass117_3 = Static84.method1246(local545, local744);
								continue;
							}
							if (local31 == 1302) {
								local1--;
								local545 = anIntArray737[local1];
								if (local545 == Static192.anInt3398 || local545 == Static230.anInt6112 || local545 == Static295.anInt5082) {
									local856.anInt3047 = local545;
								}
								continue;
							}
							if (local31 == 1303) {
								local1--;
								local856.anInt3098 = anIntArray737[local1];
								continue;
							}
							if (local31 == 1304) {
								local1--;
								local856.anInt3049 = anIntArray737[local1];
								continue;
							}
							if (local31 == 1305) {
								local3--;
								local856.aString28 = aStringArray86[local3];
								continue;
							}
							if (local31 == 1306) {
								local3--;
								local856.aString29 = aStringArray86[local3];
								continue;
							}
							if (local31 == 1307) {
								local856.aStringArray43 = null;
								continue;
							}
							if (local31 == 1308) {
								local1--;
								local856.anInt3096 = anIntArray737[local1];
								local1--;
								local856.anInt3073 = anIntArray737[local1];
								continue;
							}
							if (local31 == 1309) {
								local1--;
								local545 = anIntArray737[local1];
								local1--;
								local744 = anIntArray737[local1];
								if (local744 >= 1 && local744 <= 10) {
									local856.method2512(local744 - 1, local545);
								}
								continue;
							}
							if (local31 == 1310) {
								local3--;
								local856.aString31 = aStringArray86[local3];
								continue;
							}
							if (local31 == 1311) {
								local1--;
								local856.anInt3094 = anIntArray737[local1];
								continue;
							}
						} else {
							if (local31 >= 1400 && local31 < 1500 || local31 >= 2400 && local31 < 2500) {
								if (local31 >= 2000) {
									local31 -= 1000;
									local1--;
									local856 = Static13.method107(anIntArray737[local1]);
								} else {
									local856 = local718 ? aClass117_20 : aClass117_19;
								}
								local3--;
								local1724 = aStringArray86[local3];
								@Pc(2642) int[] local2642 = null;
								if (local1724.length() > 0 && local1724.charAt(local1724.length() - 1) == 'Y') {
									local1--;
									local395 = anIntArray737[local1];
									if (local395 > 0) {
										local2642 = new int[local395];
										while (local395-- > 0) {
											local1--;
											local2642[local395] = anIntArray737[local1];
										}
									}
									local1724 = local1724.substring(0, local1724.length() - 1);
								}
								@Pc(2688) Object[] local2688 = new Object[local1724.length() + 1];
								for (local414 = local2688.length - 1; local414 >= 1; local414--) {
									if (local1724.charAt(local414 - 1) == 's') {
										local3--;
										local2688[local414] = aStringArray86[local3];
									} else {
										local1--;
										local2688[local414] = Integer.valueOf(anIntArray737[local1]);
									}
								}
								local1--;
								local775 = anIntArray737[local1];
								if (local775 == -1) {
									local2688 = null;
								} else {
									local2688[0] = Integer.valueOf(local775);
								}
								if (local31 == 1400) {
									local856.anObjectArray33 = local2688;
								} else if (local31 == 1401) {
									local856.anObjectArray32 = local2688;
								} else if (local31 == 1402) {
									local856.anObjectArray12 = local2688;
								} else if (local31 == 1403) {
									local856.anObjectArray28 = local2688;
								} else if (local31 == 1404) {
									local856.anObjectArray9 = local2688;
								} else if (local31 == 1405) {
									local856.anObjectArray18 = local2688;
								} else if (local31 == 1406) {
									local856.anObjectArray26 = local2688;
								} else if (local31 == 1407) {
									local856.anObjectArray20 = local2688;
									local856.anIntArray356 = local2642;
								} else if (local31 == 1408) {
									local856.anObjectArray17 = local2688;
								} else if (local31 == 1409) {
									local856.anObjectArray16 = local2688;
								} else if (local31 == 1410) {
									local856.anObjectArray23 = local2688;
								} else if (local31 == 1411) {
									local856.anObjectArray4 = local2688;
								} else if (local31 == 1412) {
									local856.anObjectArray24 = local2688;
								} else if (local31 == 1414) {
									local856.anObjectArray7 = local2688;
									local856.anIntArray362 = local2642;
								} else if (local31 == 1415) {
									local856.anObjectArray31 = local2688;
									local856.anIntArray363 = local2642;
								} else if (local31 == 1416) {
									local856.anObjectArray15 = local2688;
								} else if (local31 == 1417) {
									local856.anObjectArray22 = local2688;
								} else if (local31 == 1418) {
									local856.anObjectArray8 = local2688;
								} else if (local31 == 1419) {
									local856.anObjectArray27 = local2688;
								} else if (local31 == 1420) {
									local856.anObjectArray10 = local2688;
								} else if (local31 == 1421) {
									local856.anObjectArray25 = local2688;
								} else if (local31 == 1422) {
									local856.anObjectArray14 = local2688;
								} else if (local31 == 1423) {
									local856.anObjectArray21 = local2688;
								} else if (local31 == 1424) {
									local856.anObjectArray29 = local2688;
								} else if (local31 == 1425) {
									local856.anObjectArray30 = local2688;
								} else if (local31 == 1426) {
									local856.anObjectArray6 = local2688;
								} else if (local31 == 1427) {
									local856.anObjectArray11 = local2688;
								} else if (local31 == 1428) {
									local856.anObjectArray13 = local2688;
									local856.anIntArray354 = local2642;
								} else if (local31 == 1429) {
									local856.anObjectArray5 = local2688;
									local856.anIntArray359 = local2642;
								}
								local856.aBoolean270 = true;
								continue;
							}
							if (local31 < 1600) {
								local856 = local718 ? aClass117_20 : aClass117_19;
								if (local31 == 1500) {
									anIntArray737[local1++] = local856.anInt3072;
									continue;
								}
								if (local31 == 1501) {
									anIntArray737[local1++] = local856.anInt3104;
									continue;
								}
								if (local31 == 1502) {
									anIntArray737[local1++] = local856.anInt3074;
									continue;
								}
								if (local31 == 1503) {
									anIntArray737[local1++] = local856.anInt3071;
									continue;
								}
								if (local31 == 1504) {
									anIntArray737[local1++] = local856.aBoolean263 ? 1 : 0;
									continue;
								}
								if (local31 == 1505) {
									anIntArray737[local1++] = local856.anInt3066;
									continue;
								}
							} else if (local31 < 1700) {
								local856 = local718 ? aClass117_20 : aClass117_19;
								if (local31 == 1600) {
									anIntArray737[local1++] = local856.anInt3040;
									continue;
								}
								if (local31 == 1601) {
									anIntArray737[local1++] = local856.anInt3089;
									continue;
								}
								if (local31 == 1602) {
									aStringArray86[local3++] = local856.aString30;
									continue;
								}
								if (local31 == 1603) {
									anIntArray737[local1++] = local856.anInt3056;
									continue;
								}
								if (local31 == 1604) {
									anIntArray737[local1++] = local856.anInt3078;
									continue;
								}
								if (local31 == 1605) {
									anIntArray737[local1++] = local856.anInt3067;
									continue;
								}
								if (local31 == 1606) {
									anIntArray737[local1++] = local856.anInt3036;
									continue;
								}
								if (local31 == 1607) {
									anIntArray737[local1++] = local856.anInt3116;
									continue;
								}
								if (local31 == 1608) {
									anIntArray737[local1++] = local856.anInt3109;
									continue;
								}
								if (local31 == 1609) {
									anIntArray737[local1++] = local856.anInt3105;
									continue;
								}
								if (local31 == 1610) {
									anIntArray737[local1++] = local856.anInt3106;
									continue;
								}
								if (local31 == 1611) {
									anIntArray737[local1++] = local856.anInt3035;
									continue;
								}
								if (local31 == 1612) {
									anIntArray737[local1++] = local856.anInt3055;
									continue;
								}
							} else if (local31 < 1800) {
								local856 = local718 ? aClass117_20 : aClass117_19;
								if (local31 == 1700) {
									anIntArray737[local1++] = local856.anInt3080;
									continue;
								}
								if (local31 == 1701) {
									if (local856.anInt3080 == -1) {
										anIntArray737[local1++] = 0;
									} else {
										anIntArray737[local1++] = local856.anInt3107;
									}
									continue;
								}
								if (local31 == 1702) {
									anIntArray737[local1++] = local856.anInt3043;
									continue;
								}
							} else if (local31 < 1900) {
								local856 = local718 ? aClass117_20 : aClass117_19;
								if (local31 == 1800) {
									anIntArray737[local1++] = Static50.method810(local856).method2807();
									continue;
								}
								if (local31 == 1801) {
									local1--;
									local545 = anIntArray737[local1];
									local545--;
									if (local856.aStringArray43 != null && local545 < local856.aStringArray43.length && local856.aStringArray43[local545] != null) {
										aStringArray86[local3++] = local856.aStringArray43[local545];
										continue;
									}
									aStringArray86[local3++] = "";
									continue;
								}
								if (local31 == 1802) {
									if (local856.aString28 == null) {
										aStringArray86[local3++] = "";
									} else {
										aStringArray86[local3++] = local856.aString28;
									}
									continue;
								}
							} else if (local31 < 2600) {
								local1--;
								local856 = Static13.method107(anIntArray737[local1]);
								if (local31 == 2500) {
									anIntArray737[local1++] = local856.anInt3072;
									continue;
								}
								if (local31 == 2501) {
									anIntArray737[local1++] = local856.anInt3104;
									continue;
								}
								if (local31 == 2502) {
									anIntArray737[local1++] = local856.anInt3074;
									continue;
								}
								if (local31 == 2503) {
									anIntArray737[local1++] = local856.anInt3071;
									continue;
								}
								if (local31 == 2504) {
									anIntArray737[local1++] = local856.aBoolean263 ? 1 : 0;
									continue;
								}
								if (local31 == 2505) {
									anIntArray737[local1++] = local856.anInt3066;
									continue;
								}
							} else if (local31 < 2700) {
								local1--;
								local856 = Static13.method107(anIntArray737[local1]);
								if (local31 == 2600) {
									anIntArray737[local1++] = local856.anInt3040;
									continue;
								}
								if (local31 == 2601) {
									anIntArray737[local1++] = local856.anInt3089;
									continue;
								}
								if (local31 == 2602) {
									aStringArray86[local3++] = local856.aString30;
									continue;
								}
								if (local31 == 2603) {
									anIntArray737[local1++] = local856.anInt3056;
									continue;
								}
								if (local31 == 2604) {
									anIntArray737[local1++] = local856.anInt3078;
									continue;
								}
								if (local31 == 2605) {
									anIntArray737[local1++] = local856.anInt3067;
									continue;
								}
								if (local31 == 2606) {
									anIntArray737[local1++] = local856.anInt3036;
									continue;
								}
								if (local31 == 2607) {
									anIntArray737[local1++] = local856.anInt3116;
									continue;
								}
								if (local31 == 2608) {
									anIntArray737[local1++] = local856.anInt3109;
									continue;
								}
								if (local31 == 2609) {
									anIntArray737[local1++] = local856.anInt3105;
									continue;
								}
								if (local31 == 2610) {
									anIntArray737[local1++] = local856.anInt3106;
									continue;
								}
								if (local31 == 2611) {
									anIntArray737[local1++] = local856.anInt3035;
									continue;
								}
								if (local31 == 2612) {
									anIntArray737[local1++] = local856.anInt3055;
									continue;
								}
							} else {
								@Pc(3660) Class1_Sub38 local3660;
								@Pc(3576) Class1_Sub38 local3576;
								if (local31 < 2800) {
									if (local31 == 2700) {
										local1--;
										local856 = Static13.method107(anIntArray737[local1]);
										anIntArray737[local1++] = local856.anInt3080;
										continue;
									}
									if (local31 == 2701) {
										local1--;
										local856 = Static13.method107(anIntArray737[local1]);
										if (local856.anInt3080 == -1) {
											anIntArray737[local1++] = 0;
										} else {
											anIntArray737[local1++] = local856.anInt3107;
										}
										continue;
									}
									if (local31 == 2702) {
										local1--;
										local540 = anIntArray737[local1];
										local3576 = (Class1_Sub38) Static22.aClass77_29.method1368((long) local540);
										if (local3576 == null) {
											anIntArray737[local1++] = 0;
										} else {
											anIntArray737[local1++] = 1;
										}
										continue;
									}
									if (local31 == 2703) {
										local1--;
										local856 = Static13.method107(anIntArray737[local1]);
										if (local856.aClass117Array1 == null) {
											anIntArray737[local1++] = 0;
											continue;
										}
										local545 = local856.aClass117Array1.length;
										for (local744 = 0; local744 < local856.aClass117Array1.length; local744++) {
											if (local856.aClass117Array1[local744] == null) {
												local545 = local744;
												break;
											}
										}
										anIntArray737[local1++] = local545;
										continue;
									}
									if (local31 == 2704 || local31 == 2705) {
										local1 -= 2;
										local540 = anIntArray737[local1];
										local545 = anIntArray737[local1 + 1];
										local3660 = (Class1_Sub38) Static22.aClass77_29.method1368((long) local540);
										if (local3660 != null && local3660.anInt5050 == local545) {
											anIntArray737[local1++] = 1;
											continue;
										}
										anIntArray737[local1++] = 0;
										continue;
									}
								} else if (local31 < 2900) {
									local1--;
									local856 = Static13.method107(anIntArray737[local1]);
									if (local31 == 2800) {
										anIntArray737[local1++] = Static50.method810(local856).method2807();
										continue;
									}
									if (local31 == 2801) {
										local1--;
										local545 = anIntArray737[local1];
										local545--;
										if (local856.aStringArray43 != null && local545 < local856.aStringArray43.length && local856.aStringArray43[local545] != null) {
											aStringArray86[local3++] = local856.aStringArray43[local545];
											continue;
										}
										aStringArray86[local3++] = "";
										continue;
									}
									if (local31 == 2802) {
										if (local856.aString28 == null) {
											aStringArray86[local3++] = "";
										} else {
											aStringArray86[local3++] = local856.aString28;
										}
										continue;
									}
								} else if (local31 < 3200) {
									if (local31 == 3100) {
										local3--;
										local352 = aStringArray86[local3];
										Static118.method1733(local352);
										continue;
									}
									if (local31 == 3101) {
										local1 -= 2;
										Static313.method4640(anIntArray737[local1], anIntArray737[local1 + 1], Static321.aClass25_Sub1_Sub1_Sub1_2);
										continue;
									}
									if (local31 == 3103) {
										Static277.method4252();
										continue;
									}
									if (local31 == 3104) {
										local3--;
										local352 = aStringArray86[local3];
										local545 = 0;
										if (Static156.method2347(local352)) {
											local545 = Static147.method2202(local352);
										}
										Static177.method1119(Static367.aClass48_208);
										Static209.aClass1_Sub33_Sub2_2.method5142(local545);
										continue;
									}
									if (local31 == 3105) {
										local3--;
										local352 = aStringArray86[local3];
										Static177.method1119(Static368.aClass48_210);
										Static209.aClass1_Sub33_Sub2_2.method5165(local352.length() + 1);
										Static209.aClass1_Sub33_Sub2_2.method5143(local352);
										continue;
									}
									if (local31 == 3106) {
										local3--;
										local352 = aStringArray86[local3];
										Static177.method1119(Static302.aClass48_184);
										Static209.aClass1_Sub33_Sub2_2.method5165(local352.length() + 1);
										Static209.aClass1_Sub33_Sub2_2.method5143(local352);
										continue;
									}
									if (local31 == 3107) {
										local1--;
										local540 = anIntArray737[local1];
										local3--;
										local1724 = aStringArray86[local3];
										Static197.method2849(local540, local1724);
										continue;
									}
									if (local31 == 3108) {
										local1 -= 3;
										local540 = anIntArray737[local1];
										local545 = anIntArray737[local1 + 1];
										local744 = anIntArray737[local1 + 2];
										local754 = Static13.method107(local744);
										Static221.method3083(local545, local754, local540);
										continue;
									}
									if (local31 == 3109) {
										local1 -= 2;
										local540 = anIntArray737[local1];
										local545 = anIntArray737[local1 + 1];
										local923 = local718 ? aClass117_20 : aClass117_19;
										Static221.method3083(local545, local923, local540);
										continue;
									}
									if (local31 == 3110) {
										local1--;
										local540 = anIntArray737[local1];
										Static177.method1119(Static67.aClass48_40);
										Static209.aClass1_Sub33_Sub2_2.method5138(local540);
										continue;
									}
									if (local31 == 3111) {
										local1 -= 2;
										local540 = anIntArray737[local1];
										local545 = anIntArray737[local1 + 1];
										local3660 = (Class1_Sub38) Static22.aClass77_29.method1368((long) local540);
										if (local3660 != null) {
											Static229.method3190(true, local3660, local3660.anInt5050 != local545);
										}
										Static134.method1981(local540, local545, 3, true);
										continue;
									}
									if (local31 == 3112) {
										local1--;
										local540 = anIntArray737[local1];
										local3576 = (Class1_Sub38) Static22.aClass77_29.method1368((long) local540);
										if (local3576 != null && local3576.anInt5052 == 3) {
											Static229.method3190(true, local3576, true);
										}
										continue;
									}
								} else if (local31 < 3300) {
									if (local31 == 3200) {
										local1 -= 3;
										Static256.method3911(anIntArray737[local1], 255, anIntArray737[local1 + 2], anIntArray737[local1 + 1]);
										continue;
									}
									if (local31 == 3201) {
										local1--;
										Static140.method5238(255, anIntArray737[local1], 50);
										continue;
									}
									if (local31 == 3202) {
										local1 -= 2;
										Static57.method5054(anIntArray737[local1], anIntArray737[local1 + 1], 255);
										continue;
									}
									if (local31 == 3203) {
										local1 -= 4;
										Static256.method3911(anIntArray737[local1], anIntArray737[local1 + 3], anIntArray737[local1 + 2], anIntArray737[local1 + 1]);
										continue;
									}
									if (local31 == 3204) {
										local1 -= 3;
										Static140.method5238(anIntArray737[local1 + 1], anIntArray737[local1], anIntArray737[local1 + 2]);
										continue;
									}
									if (local31 == 3205) {
										local1 -= 3;
										Static57.method5054(anIntArray737[local1], anIntArray737[local1 + 1], anIntArray737[local1 + 2]);
										continue;
									}
								} else if (local31 < 3400) {
									if (local31 == 3300) {
										anIntArray737[local1++] = Static366.anInt5883;
										continue;
									}
									if (local31 == 3301) {
										local1 -= 2;
										local540 = anIntArray737[local1];
										local545 = anIntArray737[local1 + 1];
										anIntArray737[local1++] = Static50.method816(local540, false, local545);
										continue;
									}
									if (local31 == 3302) {
										local1 -= 2;
										local540 = anIntArray737[local1];
										local545 = anIntArray737[local1 + 1];
										anIntArray737[local1++] = Static162.method2407(local540, local545, false);
										continue;
									}
									if (local31 == 3303) {
										local1 -= 2;
										local540 = anIntArray737[local1];
										local545 = anIntArray737[local1 + 1];
										anIntArray737[local1++] = Static72.method1161(false, local545, local540);
										continue;
									}
									if (local31 == 3304) {
										local1--;
										local540 = anIntArray737[local1];
										anIntArray737[local1++] = Static133.aClass247_1.method5446(local540).anInt6381;
										continue;
									}
									if (local31 == 3305) {
										local1--;
										local540 = anIntArray737[local1];
										anIntArray737[local1++] = Static362.anIntArray696[local540];
										continue;
									}
									if (local31 == 3306) {
										local1--;
										local540 = anIntArray737[local1];
										anIntArray737[local1++] = Static152.anIntArray334[local540];
										continue;
									}
									if (local31 == 3307) {
										local1--;
										local540 = anIntArray737[local1];
										anIntArray737[local1++] = Static89.anIntArray215[local540];
										continue;
									}
									if (local31 == 3308) {
										@Pc(4314) byte local4314 = Static321.aClass25_Sub1_Sub1_Sub1_2.aByte70;
										local545 = (Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6080 >> 7) + Static256.anInt4410;
										local744 = (Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6077 >> 7) + Static293.anInt5053;
										anIntArray737[local1++] = (local4314 << 28) + (local545 << 14) + local744;
										continue;
									}
									if (local31 == 3309) {
										local1--;
										local540 = anIntArray737[local1];
										anIntArray737[local1++] = local540 >> 14 & 0x3FFF;
										continue;
									}
									if (local31 == 3310) {
										local1--;
										local540 = anIntArray737[local1];
										anIntArray737[local1++] = local540 >> 28;
										continue;
									}
									if (local31 == 3311) {
										local1--;
										local540 = anIntArray737[local1];
										anIntArray737[local1++] = local540 & 0x3FFF;
										continue;
									}
									if (local31 == 3312) {
										anIntArray737[local1++] = Static104.aBoolean157 ? 1 : 0;
										continue;
									}
									if (local31 == 3313) {
										local1 -= 2;
										local540 = anIntArray737[local1];
										local545 = anIntArray737[local1 + 1];
										anIntArray737[local1++] = Static50.method816(local540, true, local545);
										continue;
									}
									if (local31 == 3314) {
										local1 -= 2;
										local540 = anIntArray737[local1];
										local545 = anIntArray737[local1 + 1];
										anIntArray737[local1++] = Static162.method2407(local540, local545, true);
										continue;
									}
									if (local31 == 3315) {
										local1 -= 2;
										local540 = anIntArray737[local1];
										local545 = anIntArray737[local1 + 1];
										anIntArray737[local1++] = Static72.method1161(true, local545, local540);
										continue;
									}
									if (local31 == 3316) {
										if (Static284.anInt4919 >= 2) {
											anIntArray737[local1++] = Static284.anInt4919;
										} else {
											anIntArray737[local1++] = 0;
										}
										continue;
									}
									if (local31 == 3317) {
										anIntArray737[local1++] = Static11.anInt3595;
										continue;
									}
									if (local31 == 3318) {
										anIntArray737[local1++] = Static233.anInt3887;
										continue;
									}
									if (local31 == 3321) {
										anIntArray737[local1++] = Static114.anInt1989;
										continue;
									}
									if (local31 == 3322) {
										anIntArray737[local1++] = Static215.anInt3689;
										continue;
									}
									if (local31 == 3323) {
										if (Static61.anInt1224 >= 5 && Static61.anInt1224 <= 9) {
											anIntArray737[local1++] = 1;
											continue;
										}
										anIntArray737[local1++] = 0;
										continue;
									}
									if (local31 == 3324) {
										if (Static61.anInt1224 >= 5 && Static61.anInt1224 <= 9) {
											anIntArray737[local1++] = Static61.anInt1224;
											continue;
										}
										anIntArray737[local1++] = 0;
										continue;
									}
									if (local31 == 3325) {
										anIntArray737[local1++] = Static254.aBoolean435 ? 1 : 0;
										continue;
									}
									if (local31 == 3326) {
										anIntArray737[local1++] = Static321.aClass25_Sub1_Sub1_Sub1_2.anInt607;
										continue;
									}
									if (local31 == 3327) {
										anIntArray737[local1++] = Static321.aClass25_Sub1_Sub1_Sub1_2.aClass49_1.aBoolean105 ? 1 : 0;
										continue;
									}
									if (local31 == 3328) {
										anIntArray737[local1++] = Static357.aBoolean558 && !Static201.aBoolean347 ? 1 : 0;
										continue;
									}
									if (local31 == 3329) {
										anIntArray737[local1++] = Static54.aBoolean102 ? 1 : 0;
										continue;
									}
									if (local31 == 3330) {
										local1--;
										local540 = anIntArray737[local1];
										anIntArray737[local1++] = Static152.method2303(local540);
										continue;
									}
									if (local31 == 3331) {
										local1 -= 2;
										local540 = anIntArray737[local1];
										local545 = anIntArray737[local1 + 1];
										anIntArray737[local1++] = Static267.method4130(false, local540, local545);
										continue;
									}
									if (local31 == 3332) {
										local1 -= 2;
										local540 = anIntArray737[local1];
										local545 = anIntArray737[local1 + 1];
										anIntArray737[local1++] = Static267.method4130(true, local540, local545);
										continue;
									}
									if (local31 == 3333) {
										anIntArray737[local1++] = Static275.anInt4798;
										continue;
									}
									if (local31 == 3335) {
										anIntArray737[local1++] = Static48.anInt952;
										continue;
									}
									if (local31 == 3336) {
										local1 -= 4;
										local540 = anIntArray737[local1];
										local545 = anIntArray737[local1 + 1];
										local744 = anIntArray737[local1 + 2];
										local395 = anIntArray737[local1 + 3];
										local540 += local545 << 14;
										local540 += local744 << 28;
										local540 += local395;
										anIntArray737[local1++] = local540;
										continue;
									}
									if (local31 == 3337) {
										anIntArray737[local1++] = Static380.anInt6150;
										continue;
									}
									if (local31 == 3338) {
										anIntArray737[local1++] = Static130.method1906();
										continue;
									}
								} else if (local31 < 3500) {
									@Pc(4813) Class187 local4813;
									if (local31 == 3400) {
										local1 -= 2;
										local540 = anIntArray737[local1];
										local545 = anIntArray737[local1 + 1];
										local4813 = Static8.aClass242_1.method5294(local540);
										aStringArray86[local3++] = local4813.method4298(local545);
										continue;
									}
									if (local31 == 3408) {
										local1 -= 4;
										local540 = anIntArray737[local1];
										local545 = anIntArray737[local1 + 1];
										local744 = anIntArray737[local1 + 2];
										local395 = anIntArray737[local1 + 3];
										@Pc(4853) Class187 local4853 = Static8.aClass242_1.method5294(local744);
										if (local4853.aChar5 == local540 && local4853.aChar4 == local545) {
											if (local545 == 115) {
												aStringArray86[local3++] = local4853.method4298(local395);
											} else {
												anIntArray737[local1++] = local4853.method4306(local395);
											}
											continue;
										}
										throw new RuntimeException("C3408-1");
									}
									if (local31 == 3409) {
										local1 -= 3;
										local540 = anIntArray737[local1];
										local545 = anIntArray737[local1 + 1];
										local744 = anIntArray737[local1 + 2];
										if (local545 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(4920) Class187 local4920 = Static8.aClass242_1.method5294(local545);
										if (local4920.aChar4 != local540) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray737[local1++] = local4920.method4300(local744) ? 1 : 0;
										continue;
									}
									if (local31 == 3410) {
										local1--;
										local540 = anIntArray737[local1];
										local3--;
										local1724 = aStringArray86[local3];
										if (local540 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local4813 = Static8.aClass242_1.method5294(local540);
										if (local4813.aChar4 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray737[local1++] = local4813.method4302(local1724) ? 1 : 0;
										continue;
									}
									if (local31 == 3411) {
										local1--;
										local540 = anIntArray737[local1];
										@Pc(5003) Class187 local5003 = Static8.aClass242_1.method5294(local540);
										anIntArray737[local1++] = local5003.aClass77_31.method1365();
										continue;
									}
								} else if (local31 < 3700) {
									if (local31 == 3600) {
										if (Static145.anInt2705 == 0) {
											anIntArray737[local1++] = -2;
										} else if (Static145.anInt2705 == 1) {
											anIntArray737[local1++] = -1;
										} else {
											anIntArray737[local1++] = Static248.anInt4157;
										}
										continue;
									}
									if (local31 == 3601) {
										local1--;
										local540 = anIntArray737[local1];
										if (Static145.anInt2705 == 2 && local540 < Static248.anInt4157) {
											aStringArray86[local3++] = Static175.aStringArray45[local540];
											if (Static334.aStringArray78[local540] == null) {
												aStringArray86[local3++] = "";
											} else {
												aStringArray86[local3++] = Static334.aStringArray78[local540];
											}
											continue;
										}
										aStringArray86[local3++] = "";
										aStringArray86[local3++] = "";
										continue;
									}
									if (local31 == 3602) {
										local1--;
										local540 = anIntArray737[local1];
										if (Static145.anInt2705 == 2 && local540 < Static248.anInt4157) {
											anIntArray737[local1++] = Static234.anIntArray495[local540];
											continue;
										}
										anIntArray737[local1++] = 0;
										continue;
									}
									if (local31 == 3603) {
										local1--;
										local540 = anIntArray737[local1];
										if (Static145.anInt2705 == 2 && local540 < Static248.anInt4157) {
											anIntArray737[local1++] = Static197.anIntArray408[local540];
											continue;
										}
										anIntArray737[local1++] = 0;
										continue;
									}
									if (local31 == 3604) {
										local3--;
										local352 = aStringArray86[local3];
										local1--;
										local545 = anIntArray737[local1];
										Static54.method891(local545, local352);
										continue;
									}
									if (local31 == 3605) {
										local3--;
										local352 = aStringArray86[local3];
										Static48.method747(local352);
										continue;
									}
									if (local31 == 3606) {
										local3--;
										local352 = aStringArray86[local3];
										Static222.method3993(local352);
										continue;
									}
									if (local31 == 3607) {
										local3--;
										local352 = aStringArray86[local3];
										Static258.method3961(local352, false);
										continue;
									}
									if (local31 == 3608) {
										local3--;
										local352 = aStringArray86[local3];
										Static26.method463(local352);
										continue;
									}
									if (local31 == 3609) {
										local3--;
										local352 = aStringArray86[local3];
										if (local352.startsWith("<img=0>") || local352.startsWith("<img=1>")) {
											local352 = local352.substring(7);
										}
										anIntArray737[local1++] = Static294.method4444(local352) ? 1 : 0;
										continue;
									}
									if (local31 == 3610) {
										local1--;
										local540 = anIntArray737[local1];
										if (Static145.anInt2705 == 2 && local540 < Static248.anInt4157) {
											aStringArray86[local3++] = Static121.aStringArray33[local540];
											continue;
										}
										aStringArray86[local3++] = "";
										continue;
									}
									if (local31 == 3611) {
										if (Static98.aString13 == null) {
											aStringArray86[local3++] = "";
										} else {
											aStringArray86[local3++] = Static114.method1653(Static98.aString13);
										}
										continue;
									}
									if (local31 == 3612) {
										if (Static98.aString13 == null) {
											anIntArray737[local1++] = 0;
										} else {
											anIntArray737[local1++] = Static4.anInt54;
										}
										continue;
									}
									if (local31 == 3613) {
										local1--;
										local540 = anIntArray737[local1];
										if (Static98.aString13 != null && local540 < Static4.anInt54) {
											aStringArray86[local3++] = Static178.aClass149Array1[local540].aString41;
											continue;
										}
										aStringArray86[local3++] = "";
										continue;
									}
									if (local31 == 3614) {
										local1--;
										local540 = anIntArray737[local1];
										if (Static98.aString13 != null && local540 < Static4.anInt54) {
											anIntArray737[local1++] = Static178.aClass149Array1[local540].anInt3644;
											continue;
										}
										anIntArray737[local1++] = 0;
										continue;
									}
									if (local31 == 3615) {
										local1--;
										local540 = anIntArray737[local1];
										if (Static98.aString13 != null && local540 < Static4.anInt54) {
											anIntArray737[local1++] = Static178.aClass149Array1[local540].aByte52;
											continue;
										}
										anIntArray737[local1++] = 0;
										continue;
									}
									if (local31 == 3616) {
										anIntArray737[local1++] = Static239.aByte56;
										continue;
									}
									if (local31 == 3617) {
										local3--;
										local352 = aStringArray86[local3];
										Static110.method5482(local352);
										continue;
									}
									if (local31 == 3618) {
										anIntArray737[local1++] = Static139.aByte38;
										continue;
									}
									if (local31 == 3619) {
										local3--;
										local352 = aStringArray86[local3];
										Static368.method5120(local352);
										continue;
									}
									if (local31 == 3620) {
										Static331.method4785();
										continue;
									}
									if (local31 == 3621) {
										if (Static145.anInt2705 == 0) {
											anIntArray737[local1++] = -1;
										} else {
											anIntArray737[local1++] = Static56.anInt1157;
										}
										continue;
									}
									if (local31 == 3622) {
										local1--;
										local540 = anIntArray737[local1];
										if (Static145.anInt2705 != 0 && local540 < Static56.anInt1157) {
											aStringArray86[local3++] = Static250.aStringArray59[local540];
											if (Static256.aStringArray60[local540] == null) {
												aStringArray86[local3++] = "";
											} else {
												aStringArray86[local3++] = Static256.aStringArray60[local540];
											}
											continue;
										}
										aStringArray86[local3++] = "";
										aStringArray86[local3++] = "";
										continue;
									}
									if (local31 == 3623) {
										local3--;
										local352 = aStringArray86[local3];
										if (local352.startsWith("<img=0>") || local352.startsWith("<img=1>")) {
											local352 = local352.substring(7);
										}
										anIntArray737[local1++] = Static18.method2855(local352) ? 1 : 0;
										continue;
									}
									if (local31 == 3624) {
										local1--;
										local540 = anIntArray737[local1];
										if (Static178.aClass149Array1 != null && local540 < Static4.anInt54 && Static178.aClass149Array1[local540].aString42.equalsIgnoreCase(Static321.aClass25_Sub1_Sub1_Sub1_2.aString6)) {
											anIntArray737[local1++] = 1;
											continue;
										}
										anIntArray737[local1++] = 0;
										continue;
									}
									if (local31 == 3625) {
										if (Static313.aString59 == null) {
											aStringArray86[local3++] = "";
										} else {
											aStringArray86[local3++] = Static313.aString59;
										}
										continue;
									}
									if (local31 == 3626) {
										local1--;
										local540 = anIntArray737[local1];
										if (Static98.aString13 != null && local540 < Static4.anInt54) {
											aStringArray86[local3++] = Static178.aClass149Array1[local540].aString43;
											continue;
										}
										aStringArray86[local3++] = "";
										continue;
									}
									if (local31 == 3627) {
										local1--;
										local540 = anIntArray737[local1];
										if (Static145.anInt2705 == 2 && local540 >= 0 && local540 < Static248.anInt4157) {
											anIntArray737[local1++] = Static194.aBooleanArray17[local540] ? 1 : 0;
											continue;
										}
										anIntArray737[local1++] = 0;
										continue;
									}
									if (local31 == 3628) {
										local3--;
										local352 = aStringArray86[local3];
										if (local352.startsWith("<img=0>") || local352.startsWith("<img=1>")) {
											local352 = local352.substring(7);
										}
										anIntArray737[local1++] = Static218.method3198(local352);
										continue;
									}
									if (local31 == 3629) {
										anIntArray737[local1++] = Static318.anInt5417;
										continue;
									}
									if (local31 == 3630) {
										local3--;
										local352 = aStringArray86[local3];
										Static258.method3961(local352, true);
										continue;
									}
									if (local31 == 3631) {
										local1--;
										local540 = anIntArray737[local1];
										anIntArray737[local1++] = Static300.aBooleanArray27[local540] ? 1 : 0;
										continue;
									}
									if (local31 == 3632) {
										local1--;
										local540 = anIntArray737[local1];
										if (Static98.aString13 != null && local540 < Static4.anInt54) {
											aStringArray86[local3++] = Static178.aClass149Array1[local540].aString42;
											continue;
										}
										aStringArray86[local3++] = "";
										continue;
									}
									if (local31 == 3633) {
										local1--;
										local540 = anIntArray737[local1];
										if (Static145.anInt2705 != 0 && local540 < Static56.anInt1157) {
											aStringArray86[local3++] = Static262.aStringArray88[local540];
											continue;
										}
										aStringArray86[local3++] = "";
										continue;
									}
								} else if (local31 < 4000) {
									if (local31 == 3903) {
										local1--;
										local540 = anIntArray737[local1];
										anIntArray737[local1++] = Static303.aClass76Array1[local540].method1357();
										continue;
									}
									if (local31 == 3904) {
										local1--;
										local540 = anIntArray737[local1];
										anIntArray737[local1++] = Static303.aClass76Array1[local540].anInt1667;
										continue;
									}
									if (local31 == 3905) {
										local1--;
										local540 = anIntArray737[local1];
										anIntArray737[local1++] = Static303.aClass76Array1[local540].anInt1670;
										continue;
									}
									if (local31 == 3906) {
										local1--;
										local540 = anIntArray737[local1];
										anIntArray737[local1++] = Static303.aClass76Array1[local540].anInt1668;
										continue;
									}
									if (local31 == 3907) {
										local1--;
										local540 = anIntArray737[local1];
										anIntArray737[local1++] = Static303.aClass76Array1[local540].anInt1666;
										continue;
									}
									if (local31 == 3908) {
										local1--;
										local540 = anIntArray737[local1];
										anIntArray737[local1++] = Static303.aClass76Array1[local540].anInt1671;
										continue;
									}
									if (local31 == 3910) {
										local1--;
										local540 = anIntArray737[local1];
										local545 = Static303.aClass76Array1[local540].method1358();
										anIntArray737[local1++] = local545 == 0 ? 1 : 0;
										continue;
									}
									if (local31 == 3911) {
										local1--;
										local540 = anIntArray737[local1];
										local545 = Static303.aClass76Array1[local540].method1358();
										anIntArray737[local1++] = local545 == 2 ? 1 : 0;
										continue;
									}
									if (local31 == 3912) {
										local1--;
										local540 = anIntArray737[local1];
										local545 = Static303.aClass76Array1[local540].method1358();
										anIntArray737[local1++] = local545 == 5 ? 1 : 0;
										continue;
									}
									if (local31 == 3913) {
										local1--;
										local540 = anIntArray737[local1];
										local545 = Static303.aClass76Array1[local540].method1358();
										anIntArray737[local1++] = local545 == 1 ? 1 : 0;
										continue;
									}
								} else if (local31 < 4100) {
									if (local31 == 4000) {
										local1 -= 2;
										local540 = anIntArray737[local1];
										local545 = anIntArray737[local1 + 1];
										anIntArray737[local1++] = local540 + local545;
										continue;
									}
									if (local31 == 4001) {
										local1 -= 2;
										local540 = anIntArray737[local1];
										local545 = anIntArray737[local1 + 1];
										anIntArray737[local1++] = local540 - local545;
										continue;
									}
									if (local31 == 4002) {
										local1 -= 2;
										local540 = anIntArray737[local1];
										local545 = anIntArray737[local1 + 1];
										anIntArray737[local1++] = local540 * local545;
										continue;
									}
									if (local31 == 4003) {
										local1 -= 2;
										local540 = anIntArray737[local1];
										local545 = anIntArray737[local1 + 1];
										anIntArray737[local1++] = local540 / local545;
										continue;
									}
									if (local31 == 4004) {
										local1--;
										local540 = anIntArray737[local1];
										anIntArray737[local1++] = (int) (Math.random() * (double) local540);
										continue;
									}
									if (local31 == 4005) {
										local1--;
										local540 = anIntArray737[local1];
										anIntArray737[local1++] = (int) (Math.random() * (double) (local540 + 1));
										continue;
									}
									if (local31 == 4006) {
										local1 -= 5;
										local540 = anIntArray737[local1];
										local545 = anIntArray737[local1 + 1];
										local744 = anIntArray737[local1 + 2];
										local395 = anIntArray737[local1 + 3];
										local414 = anIntArray737[local1 + 4];
										anIntArray737[local1++] = local540 + (local545 - local540) * (local414 - local744) / (local395 - local744);
										continue;
									}
									@Pc(6177) long local6177;
									@Pc(6170) long local6170;
									if (local31 == 4007) {
										local1 -= 2;
										local6170 = anIntArray737[local1];
										local6177 = anIntArray737[local1 + 1];
										anIntArray737[local1++] = (int) (local6170 + local6170 * local6177 / 100L);
										continue;
									}
									if (local31 == 4008) {
										local1 -= 2;
										local540 = anIntArray737[local1];
										local545 = anIntArray737[local1 + 1];
										anIntArray737[local1++] = local540 | 0x1 << local545;
										continue;
									}
									if (local31 == 4009) {
										local1 -= 2;
										local540 = anIntArray737[local1];
										local545 = anIntArray737[local1 + 1];
										anIntArray737[local1++] = local540 & -(0x1 << local545) - 1;
										continue;
									}
									if (local31 == 4010) {
										local1 -= 2;
										local540 = anIntArray737[local1];
										local545 = anIntArray737[local1 + 1];
										anIntArray737[local1++] = (local540 & 0x1 << local545) == 0 ? 0 : 1;
										continue;
									}
									if (local31 == 4011) {
										local1 -= 2;
										local540 = anIntArray737[local1];
										local545 = anIntArray737[local1 + 1];
										anIntArray737[local1++] = local540 % local545;
										continue;
									}
									if (local31 == 4012) {
										local1 -= 2;
										local540 = anIntArray737[local1];
										local545 = anIntArray737[local1 + 1];
										if (local540 == 0) {
											anIntArray737[local1++] = 0;
										} else {
											anIntArray737[local1++] = (int) Math.pow((double) local540, (double) local545);
										}
										continue;
									}
									if (local31 == 4013) {
										local1 -= 2;
										local540 = anIntArray737[local1];
										local545 = anIntArray737[local1 + 1];
										if (local540 == 0) {
											anIntArray737[local1++] = 0;
										} else if (local545 == 0) {
											anIntArray737[local1++] = Integer.MAX_VALUE;
										} else {
											anIntArray737[local1++] = (int) Math.pow((double) local540, 1.0D / (double) local545);
										}
										continue;
									}
									if (local31 == 4014) {
										local1 -= 2;
										local540 = anIntArray737[local1];
										local545 = anIntArray737[local1 + 1];
										anIntArray737[local1++] = local540 & local545;
										continue;
									}
									if (local31 == 4015) {
										local1 -= 2;
										local540 = anIntArray737[local1];
										local545 = anIntArray737[local1 + 1];
										anIntArray737[local1++] = local540 | local545;
										continue;
									}
									if (local31 == 4016) {
										local1 -= 2;
										local540 = anIntArray737[local1];
										local545 = anIntArray737[local1 + 1];
										anIntArray737[local1++] = local540 < local545 ? local540 : local545;
										continue;
									}
									if (local31 == 4017) {
										local1 -= 2;
										local540 = anIntArray737[local1];
										local545 = anIntArray737[local1 + 1];
										anIntArray737[local1++] = local540 > local545 ? local540 : local545;
										continue;
									}
									if (local31 == 4018) {
										local1 -= 3;
										local6170 = anIntArray737[local1];
										local6177 = anIntArray737[local1 + 1];
										@Pc(6483) long local6483 = (long) anIntArray737[local1 + 2];
										anIntArray737[local1++] = (int) (local6170 * local6483 / local6177);
										continue;
									}
								} else {
									@Pc(6981) boolean local6981;
									if (local31 < 4200) {
										if (local31 == 4100) {
											local3--;
											local352 = aStringArray86[local3];
											local1--;
											local545 = anIntArray737[local1];
											aStringArray86[local3++] = local352 + local545;
											continue;
										}
										if (local31 == 4101) {
											local3 -= 2;
											local352 = aStringArray86[local3];
											local1724 = aStringArray86[local3 + 1];
											aStringArray86[local3++] = local352 + local1724;
											continue;
										}
										if (local31 == 4102) {
											local3--;
											local352 = aStringArray86[local3];
											local1--;
											local545 = anIntArray737[local1];
											aStringArray86[local3++] = local352 + Static135.method2031(local545);
											continue;
										}
										if (local31 == 4103) {
											local3--;
											local352 = aStringArray86[local3];
											aStringArray86[local3++] = local352.toLowerCase();
											continue;
										}
										if (local31 == 4104) {
											local303 = local3++;
											local1--;
											aStringArray86[local303] = method5497(anIntArray737[local1]);
											continue;
										}
										if (local31 == 4105) {
											local3 -= 2;
											local352 = aStringArray86[local3];
											local1724 = aStringArray86[local3 + 1];
											if (Static321.aClass25_Sub1_Sub1_Sub1_2.aClass49_1 != null && Static321.aClass25_Sub1_Sub1_Sub1_2.aClass49_1.aBoolean105) {
												aStringArray86[local3++] = local1724;
												continue;
											}
											aStringArray86[local3++] = local352;
											continue;
										}
										if (local31 == 4106) {
											local1--;
											local540 = anIntArray737[local1];
											aStringArray86[local3++] = Integer.toString(local540);
											continue;
										}
										if (local31 == 4107) {
											local3 -= 2;
											anIntArray737[local1++] = Static325.method4731(aStringArray86[local3], Static48.anInt952, aStringArray86[local3 + 1]);
											continue;
										}
										@Pc(6700) Class110 local6700;
										if (local31 == 4108) {
											local3--;
											local352 = aStringArray86[local3];
											local1 -= 2;
											local545 = anIntArray737[local1];
											local744 = anIntArray737[local1 + 1];
											local6700 = Static286.method4348(Static27.aClass230_8, local744);
											anIntArray737[local1++] = local6700.method2415(Static215.aClass51Array14, local545, local352);
											continue;
										}
										if (local31 == 4109) {
											local3--;
											local352 = aStringArray86[local3];
											local1 -= 2;
											local545 = anIntArray737[local1];
											local744 = anIntArray737[local1 + 1];
											local6700 = Static286.method4348(Static27.aClass230_8, local744);
											anIntArray737[local1++] = local6700.method2411(local352, local545, Static215.aClass51Array14);
											continue;
										}
										if (local31 == 4110) {
											local3 -= 2;
											local352 = aStringArray86[local3];
											local1724 = aStringArray86[local3 + 1];
											local1--;
											if (anIntArray737[local1] == 1) {
												aStringArray86[local3++] = local352;
											} else {
												aStringArray86[local3++] = local1724;
											}
											continue;
										}
										if (local31 == 4111) {
											local3--;
											local352 = aStringArray86[local3];
											aStringArray86[local3++] = Static292.method4433(local352);
											continue;
										}
										if (local31 == 4112) {
											local3--;
											local352 = aStringArray86[local3];
											local1--;
											local545 = anIntArray737[local1];
											if (local545 == -1) {
												throw new RuntimeException("null char");
											}
											aStringArray86[local3++] = local352 + (char) local545;
											continue;
										}
										if (local31 == 4113) {
											local1--;
											local540 = anIntArray737[local1];
											anIntArray737[local1++] = Static12.method106((char) local540) ? 1 : 0;
											continue;
										}
										if (local31 == 4114) {
											local1--;
											local540 = anIntArray737[local1];
											anIntArray737[local1++] = Static170.method2510((char) local540) ? 1 : 0;
											continue;
										}
										if (local31 == 4115) {
											local1--;
											local540 = anIntArray737[local1];
											anIntArray737[local1++] = Static2.method8((char) local540) ? 1 : 0;
											continue;
										}
										if (local31 == 4116) {
											local1--;
											local540 = anIntArray737[local1];
											anIntArray737[local1++] = Static251.method3881((char) local540) ? 1 : 0;
											continue;
										}
										if (local31 == 4117) {
											local3--;
											local352 = aStringArray86[local3];
											if (local352 == null) {
												anIntArray737[local1++] = 0;
											} else {
												anIntArray737[local1++] = local352.length();
											}
											continue;
										}
										if (local31 == 4118) {
											local3--;
											local352 = aStringArray86[local3];
											local1 -= 2;
											local545 = anIntArray737[local1];
											local744 = anIntArray737[local1 + 1];
											aStringArray86[local3++] = local352.substring(local545, local744);
											continue;
										}
										if (local31 == 4119) {
											local3--;
											local352 = aStringArray86[local3];
											@Pc(6979) StringBuffer local6979 = new StringBuffer(local352.length());
											local6981 = false;
											for (local395 = 0; local395 < local352.length(); local395++) {
												@Pc(6988) char local6988 = local352.charAt(local395);
												if (local6988 == '<') {
													local6981 = true;
												} else if (local6988 == '>') {
													local6981 = false;
												} else if (!local6981) {
													local6979.append(local6988);
												}
											}
											aStringArray86[local3++] = local6979.toString();
											continue;
										}
										if (local31 == 4120) {
											local3--;
											local352 = aStringArray86[local3];
											local1 -= 2;
											local545 = anIntArray737[local1];
											local744 = anIntArray737[local1 + 1];
											anIntArray737[local1++] = local352.indexOf(local545, local744);
											continue;
										}
										if (local31 == 4121) {
											local3 -= 2;
											local352 = aStringArray86[local3];
											local1724 = aStringArray86[local3 + 1];
											local1--;
											local744 = anIntArray737[local1];
											anIntArray737[local1++] = local352.indexOf(local1724, local744);
											continue;
										}
										if (local31 == 4122) {
											local1--;
											local540 = anIntArray737[local1];
											anIntArray737[local1++] = Character.toLowerCase((char) local540);
											continue;
										}
										if (local31 == 4123) {
											local1--;
											local540 = anIntArray737[local1];
											anIntArray737[local1++] = Character.toUpperCase((char) local540);
											continue;
										}
										if (local31 == 4124) {
											local1--;
											local1095 = anIntArray737[local1] != 0;
											local1--;
											local545 = anIntArray737[local1];
											aStringArray86[local3++] = Static289.method4387(0, Static48.anInt952, local1095, (long) local545);
											continue;
										}
										if (local31 == 4125) {
											local3--;
											local352 = aStringArray86[local3];
											local1--;
											local545 = anIntArray737[local1];
											@Pc(7154) Class110 local7154 = Static286.method4348(Static27.aClass230_8, local545);
											anIntArray737[local1++] = local7154.method2412(local352, Static215.aClass51Array14);
											continue;
										}
									} else {
										@Pc(7430) Class24 local7430;
										if (local31 < 4300) {
											if (local31 == 4200) {
												local1--;
												local540 = anIntArray737[local1];
												aStringArray86[local3++] = Static263.aClass102_2.method2172(local540).aString17;
												continue;
											}
											@Pc(7204) Class88 local7204;
											if (local31 == 4201) {
												local1 -= 2;
												local540 = anIntArray737[local1];
												local545 = anIntArray737[local1 + 1];
												local7204 = Static263.aClass102_2.method2172(local540);
												if (local545 >= 1 && local545 <= 5 && local7204.aStringArray29[local545 - 1] != null) {
													aStringArray86[local3++] = local7204.aStringArray29[local545 - 1];
													continue;
												}
												aStringArray86[local3++] = "";
												continue;
											}
											if (local31 == 4202) {
												local1 -= 2;
												local540 = anIntArray737[local1];
												local545 = anIntArray737[local1 + 1];
												local7204 = Static263.aClass102_2.method2172(local540);
												if (local545 >= 1 && local545 <= 5 && local7204.aStringArray28[local545 - 1] != null) {
													aStringArray86[local3++] = local7204.aStringArray28[local545 - 1];
													continue;
												}
												aStringArray86[local3++] = "";
												continue;
											}
											if (local31 == 4203) {
												local1--;
												local540 = anIntArray737[local1];
												anIntArray737[local1++] = Static263.aClass102_2.method2172(local540).anInt2019;
												continue;
											}
											if (local31 == 4204) {
												local1--;
												local540 = anIntArray737[local1];
												anIntArray737[local1++] = Static263.aClass102_2.method2172(local540).anInt2018 == 1 ? 1 : 0;
												continue;
											}
											@Pc(7337) Class88 local7337;
											if (local31 == 4205) {
												local1--;
												local540 = anIntArray737[local1];
												local7337 = Static263.aClass102_2.method2172(local540);
												if (local7337.anInt2022 == -1 && local7337.anInt2008 >= 0) {
													anIntArray737[local1++] = local7337.anInt2008;
													continue;
												}
												anIntArray737[local1++] = local540;
												continue;
											}
											if (local31 == 4206) {
												local1--;
												local540 = anIntArray737[local1];
												local7337 = Static263.aClass102_2.method2172(local540);
												if (local7337.anInt2022 >= 0 && local7337.anInt2008 >= 0) {
													anIntArray737[local1++] = local7337.anInt2008;
													continue;
												}
												anIntArray737[local1++] = local540;
												continue;
											}
											if (local31 == 4207) {
												local1--;
												local540 = anIntArray737[local1];
												anIntArray737[local1++] = Static263.aClass102_2.method2172(local540).aBoolean168 ? 1 : 0;
												continue;
											}
											if (local31 == 4208) {
												local1 -= 2;
												local540 = anIntArray737[local1];
												local545 = anIntArray737[local1 + 1];
												local7430 = Static232.aClass47_2.method888(local545);
												if (local7430.method375()) {
													aStringArray86[local3++] = Static263.aClass102_2.method2172(local540).method1652(local7430.aString2, local545);
												} else {
													anIntArray737[local1++] = Static263.aClass102_2.method2172(local540).method1662(local7430.anInt392, local545);
												}
												continue;
											}
											if (local31 == 4209) {
												local1 -= 2;
												local540 = anIntArray737[local1];
												local545 = anIntArray737[local1 + 1] - 1;
												local7204 = Static263.aClass102_2.method2172(local540);
												if (local7204.anInt2045 == local545) {
													anIntArray737[local1++] = local7204.anInt2043;
												} else if (local7204.anInt1984 == local545) {
													anIntArray737[local1++] = local7204.anInt1997;
												} else {
													anIntArray737[local1++] = -1;
												}
												continue;
											}
											if (local31 == 4210) {
												local3--;
												local352 = aStringArray86[local3];
												local1--;
												local545 = anIntArray737[local1];
												Static103.method1479(local352, local545 == 1);
												anIntArray737[local1++] = Static6.anInt85;
												continue;
											}
											if (local31 == 4211) {
												if (Static110.aShortArray122 != null && Static148.anInt2721 < Static6.anInt85) {
													anIntArray737[local1++] = Static110.aShortArray122[Static148.anInt2721++] & 0xFFFF;
													continue;
												}
												anIntArray737[local1++] = -1;
												continue;
											}
											if (local31 == 4212) {
												Static148.anInt2721 = 0;
												continue;
											}
										} else if (local31 < 4400) {
											if (local31 == 4300) {
												local1 -= 2;
												local540 = anIntArray737[local1];
												local545 = anIntArray737[local1 + 1];
												local7430 = Static232.aClass47_2.method888(local545);
												if (local7430.method375()) {
													aStringArray86[local3++] = Static168.aClass196_2.method4452(local540).method1154(local545, local7430.aString2);
												} else {
													anIntArray737[local1++] = Static168.aClass196_2.method4452(local540).method1149(local7430.anInt392, local545);
												}
												continue;
											}
										} else if (local31 < 4500) {
											if (local31 == 4400) {
												local1 -= 2;
												local540 = anIntArray737[local1];
												local545 = anIntArray737[local1 + 1];
												local7430 = Static232.aClass47_2.method888(local545);
												if (local7430.method375()) {
													aStringArray86[local3++] = Static54.aClass153_1.method3081(local540).method5085(local545, local7430.aString2);
												} else {
													anIntArray737[local1++] = Static54.aClass153_1.method3081(local540).method5080(local7430.anInt392, local545);
												}
												continue;
											}
										} else if (local31 < 4600) {
											if (local31 == 4500) {
												local1 -= 2;
												local540 = anIntArray737[local1];
												local545 = anIntArray737[local1 + 1];
												local7430 = Static232.aClass47_2.method888(local545);
												if (local7430.method375()) {
													aStringArray86[local3++] = Static72.aClass37_1.method634(local540).method2315(local545, local7430.aString2);
												} else {
													anIntArray737[local1++] = Static72.aClass37_1.method634(local540).method2321(local7430.anInt392, local545);
												}
												continue;
											}
										} else if (local31 < 4700) {
											if (local31 == 4600) {
												local1--;
												local540 = anIntArray737[local1];
												@Pc(7751) Class8 local7751 = Static160.aClass163_1.method3328(local540);
												if (local7751.anIntArray16 != null && local7751.anIntArray16.length > 0) {
													local744 = 0;
													local395 = local7751.anIntArray15[0];
													for (local414 = 1; local414 < local7751.anIntArray16.length; local414++) {
														if (local7751.anIntArray15[local414] > local395) {
															local744 = local414;
															local395 = local7751.anIntArray15[local414];
														}
													}
													anIntArray737[local1++] = local7751.anIntArray16[local744];
													continue;
												}
												anIntArray737[local1++] = local7751.anInt159;
												continue;
											}
										} else if (local31 < 5100) {
											if (local31 == 5000) {
												anIntArray737[local1++] = Static6.anInt91;
												continue;
											}
											if (local31 == 5001) {
												local1 -= 3;
												Static6.anInt91 = anIntArray737[local1];
												Static346.aClass205_3 = Static162.method2404(anIntArray737[local1 + 1]);
												if (Static346.aClass205_3 == null) {
													Static346.aClass205_3 = Static173.aClass205_1;
												}
												Static19.anInt317 = anIntArray737[local1 + 2];
												Static177.method1119(Static239.aClass48_138);
												Static209.aClass1_Sub33_Sub2_2.method5165(Static6.anInt91);
												Static209.aClass1_Sub33_Sub2_2.method5165(Static346.aClass205_3.anInt5344);
												Static209.aClass1_Sub33_Sub2_2.method5165(Static19.anInt317);
												continue;
											}
											if (local31 == 5002) {
												local3 -= 2;
												local352 = aStringArray86[local3];
												local1724 = aStringArray86[local3 + 1];
												local1 -= 2;
												local744 = anIntArray737[local1];
												local395 = anIntArray737[local1 + 1];
												if (local1724 == null) {
													local1724 = "";
												}
												if (local1724.length() > 80) {
													local1724 = local1724.substring(0, 80);
												}
												Static177.method1119(Static328.aClass48_196);
												Static209.aClass1_Sub33_Sub2_2.method5165(Static56.method903(local352) + Static56.method903(local1724) + 2);
												Static209.aClass1_Sub33_Sub2_2.method5143(local352);
												Static209.aClass1_Sub33_Sub2_2.method5165(local744 - 1);
												Static209.aClass1_Sub33_Sub2_2.method5165(local395);
												Static209.aClass1_Sub33_Sub2_2.method5143(local1724);
												continue;
											}
											if (local31 == 5003) {
												local1--;
												local540 = anIntArray737[local1];
												local1724 = null;
												if (local540 < 100) {
													local1724 = Static283.aStringArray70[local540];
												}
												if (local1724 == null) {
													local1724 = "";
												}
												aStringArray86[local3++] = local1724;
												continue;
											}
											if (local31 == 5004) {
												local1--;
												local540 = anIntArray737[local1];
												local545 = -1;
												if (local540 < 100 && Static283.aStringArray70[local540] != null) {
													local545 = Static313.anIntArray626[local540];
												}
												anIntArray737[local1++] = local545;
												continue;
											}
											if (local31 == 5005) {
												if (Static346.aClass205_3 == null) {
													anIntArray737[local1++] = -1;
												} else {
													anIntArray737[local1++] = Static346.aClass205_3.anInt5344;
												}
												continue;
											}
											if (local31 == 5008 || local31 == 5021) {
												local3--;
												local352 = aStringArray86[local3];
												method5493(local352, local31);
												continue;
											}
											if (local31 == 5009) {
												local3 -= 2;
												local352 = aStringArray86[local3];
												local1724 = aStringArray86[local3 + 1];
												if (Static284.anInt4919 != 0 || (!Static357.aBoolean558 || Static201.aBoolean347) && !Static54.aBoolean102) {
													Static177.method1119(Static292.aClass48_180);
													Static209.aClass1_Sub33_Sub2_2.method5165(0);
													local744 = Static209.aClass1_Sub33_Sub2_2.lb;
													Static209.aClass1_Sub33_Sub2_2.method5143(local352);
													Static135.method2026(local1724, Static209.aClass1_Sub33_Sub2_2);
													Static209.aClass1_Sub33_Sub2_2.method5149(Static209.aClass1_Sub33_Sub2_2.lb - local744);
												}
												continue;
											}
											if (local31 == 5010) {
												local1--;
												local540 = anIntArray737[local1];
												local1724 = null;
												if (local540 < 100) {
													local1724 = Static277.aStringArray69[local540];
												}
												if (local1724 == null) {
													local1724 = "";
												}
												aStringArray86[local3++] = local1724;
												continue;
											}
											if (local31 == 5011) {
												local1--;
												local540 = anIntArray737[local1];
												local1724 = null;
												if (local540 < 100) {
													local1724 = Static16.aStringArray7[local540];
												}
												if (local1724 == null) {
													local1724 = "";
												}
												aStringArray86[local3++] = local1724;
												continue;
											}
											if (local31 == 5012) {
												local1--;
												local540 = anIntArray737[local1];
												local545 = -1;
												if (local540 < 100) {
													local545 = Static24.anIntArray74[local540];
												}
												anIntArray737[local1++] = local545;
												continue;
											}
											if (local31 == 5015) {
												if (Static321.aClass25_Sub1_Sub1_Sub1_2 == null || Static321.aClass25_Sub1_Sub1_Sub1_2.aString5 == null) {
													local352 = Static8.aString1;
												} else {
													local352 = Static321.aClass25_Sub1_Sub1_Sub1_2.method462();
												}
												aStringArray86[local3++] = local352;
												continue;
											}
											if (local31 == 5016) {
												anIntArray737[local1++] = Static19.anInt317;
												continue;
											}
											if (local31 == 5017) {
												anIntArray737[local1++] = Static162.anInt2945;
												continue;
											}
											if (local31 == 5018) {
												local1--;
												local540 = anIntArray737[local1];
												local545 = 0;
												if (local540 < 100 && Static283.aStringArray70[local540] != null) {
													local545 = Static313.anIntArray626[local540];
												}
												anIntArray737[local1++] = local545;
												continue;
											}
											if (local31 == 5019) {
												local1--;
												local540 = anIntArray737[local1];
												local1724 = null;
												if (local540 < 100) {
													local1724 = Static364.aStringArray82[local540];
												}
												if (local1724 == null) {
													local1724 = "";
												}
												aStringArray86[local3++] = local1724;
												continue;
											}
											if (local31 == 5020) {
												if (Static321.aClass25_Sub1_Sub1_Sub1_2 == null || Static321.aClass25_Sub1_Sub1_Sub1_2.aString5 == null) {
													local352 = Static8.aString1;
												} else {
													local352 = Static321.aClass25_Sub1_Sub1_Sub1_2.method467();
												}
												aStringArray86[local3++] = local352;
												continue;
											}
											if (local31 == 5050) {
												local1--;
												local540 = anIntArray737[local1];
												aStringArray86[local3++] = Static165.method2423(local540).aString25;
												continue;
											}
											@Pc(8301) Class1_Sub6_Sub8 local8301;
											if (local31 == 5051) {
												local1--;
												local540 = anIntArray737[local1];
												local8301 = Static165.method2423(local540);
												if (local8301.anIntArray332 == null) {
													anIntArray737[local1++] = 0;
												} else {
													anIntArray737[local1++] = local8301.anIntArray332.length;
												}
												continue;
											}
											if (local31 == 5052) {
												local1 -= 2;
												local540 = anIntArray737[local1];
												local545 = anIntArray737[local1 + 1];
												@Pc(8336) Class1_Sub6_Sub8 local8336 = Static165.method2423(local540);
												local395 = local8336.anIntArray332[local545];
												anIntArray737[local1++] = local395;
												continue;
											}
											if (local31 == 5053) {
												local1--;
												local540 = anIntArray737[local1];
												local8301 = Static165.method2423(local540);
												if (local8301.anIntArray333 == null) {
													anIntArray737[local1++] = 0;
												} else {
													anIntArray737[local1++] = local8301.anIntArray333.length;
												}
												continue;
											}
											if (local31 == 5054) {
												local1 -= 2;
												local540 = anIntArray737[local1];
												local545 = anIntArray737[local1 + 1];
												anIntArray737[local1++] = Static165.method2423(local540).anIntArray333[local545];
												continue;
											}
											if (local31 == 5055) {
												local1--;
												local540 = anIntArray737[local1];
												aStringArray86[local3++] = Static357.method5242(local540).method4183();
												continue;
											}
											if (local31 == 5056) {
												local1--;
												local540 = anIntArray737[local1];
												@Pc(8431) Class1_Sub6_Sub13 local8431 = Static357.method5242(local540);
												if (local8431.anIntArray576 == null) {
													anIntArray737[local1++] = 0;
												} else {
													anIntArray737[local1++] = local8431.anIntArray576.length;
												}
												continue;
											}
											if (local31 == 5057) {
												local1 -= 2;
												local540 = anIntArray737[local1];
												local545 = anIntArray737[local1 + 1];
												anIntArray737[local1++] = Static357.method5242(local540).anIntArray576[local545];
												continue;
											}
											if (local31 == 5058) {
												aClass171_1 = new Class171();
												local1--;
												aClass171_1.anInt4362 = anIntArray737[local1];
												aClass171_1.aClass1_Sub6_Sub13_1 = Static357.method5242(aClass171_1.anInt4362);
												aClass171_1.anIntArray533 = new int[aClass171_1.aClass1_Sub6_Sub13_1.method4184()];
												continue;
											}
											if (local31 == 5059) {
												Static177.method1119(Static284.aClass48_176);
												Static209.aClass1_Sub33_Sub2_2.method5165(0);
												local540 = Static209.aClass1_Sub33_Sub2_2.lb;
												Static209.aClass1_Sub33_Sub2_2.method5165(0);
												Static209.aClass1_Sub33_Sub2_2.method5138(aClass171_1.anInt4362);
												aClass171_1.aClass1_Sub6_Sub13_1.method4185(Static209.aClass1_Sub33_Sub2_2, aClass171_1.anIntArray533);
												Static209.aClass1_Sub33_Sub2_2.method5149(Static209.aClass1_Sub33_Sub2_2.lb - local540);
												continue;
											}
											if (local31 == 5060) {
												local3--;
												local352 = aStringArray86[local3];
												Static177.method1119(Static130.aClass48_75);
												Static209.aClass1_Sub33_Sub2_2.method5165(0);
												local545 = Static209.aClass1_Sub33_Sub2_2.lb;
												Static209.aClass1_Sub33_Sub2_2.method5143(local352);
												Static209.aClass1_Sub33_Sub2_2.method5138(aClass171_1.anInt4362);
												aClass171_1.aClass1_Sub6_Sub13_1.method4185(Static209.aClass1_Sub33_Sub2_2, aClass171_1.anIntArray533);
												Static209.aClass1_Sub33_Sub2_2.method5149(Static209.aClass1_Sub33_Sub2_2.lb - local545);
												continue;
											}
											if (local31 == 5061) {
												Static177.method1119(Static284.aClass48_176);
												Static209.aClass1_Sub33_Sub2_2.method5165(0);
												local540 = Static209.aClass1_Sub33_Sub2_2.lb;
												Static209.aClass1_Sub33_Sub2_2.method5165(1);
												Static209.aClass1_Sub33_Sub2_2.method5138(aClass171_1.anInt4362);
												aClass171_1.aClass1_Sub6_Sub13_1.method4185(Static209.aClass1_Sub33_Sub2_2, aClass171_1.anIntArray533);
												Static209.aClass1_Sub33_Sub2_2.method5149(Static209.aClass1_Sub33_Sub2_2.lb - local540);
												continue;
											}
											if (local31 == 5062) {
												local1 -= 2;
												local540 = anIntArray737[local1];
												local545 = anIntArray737[local1 + 1];
												anIntArray737[local1++] = Static165.method2423(local540).aCharArray1[local545];
												continue;
											}
											if (local31 == 5063) {
												local1 -= 2;
												local540 = anIntArray737[local1];
												local545 = anIntArray737[local1 + 1];
												anIntArray737[local1++] = Static165.method2423(local540).aCharArray2[local545];
												continue;
											}
											if (local31 == 5064) {
												local1 -= 2;
												local540 = anIntArray737[local1];
												local545 = anIntArray737[local1 + 1];
												if (local545 == -1) {
													anIntArray737[local1++] = -1;
												} else {
													anIntArray737[local1++] = Static165.method2423(local540).method2307((char) local545);
												}
												continue;
											}
											if (local31 == 5065) {
												local1 -= 2;
												local540 = anIntArray737[local1];
												local545 = anIntArray737[local1 + 1];
												if (local545 == -1) {
													anIntArray737[local1++] = -1;
												} else {
													anIntArray737[local1++] = Static165.method2423(local540).method2301((char) local545);
												}
												continue;
											}
											if (local31 == 5066) {
												local1--;
												local540 = anIntArray737[local1];
												anIntArray737[local1++] = Static357.method5242(local540).method4184();
												continue;
											}
											if (local31 == 5067) {
												local1 -= 2;
												local540 = anIntArray737[local1];
												local545 = anIntArray737[local1 + 1];
												local744 = Static357.method5242(local540).method4179(local545);
												anIntArray737[local1++] = local744;
												continue;
											}
											if (local31 == 5068) {
												local1 -= 2;
												local540 = anIntArray737[local1];
												local545 = anIntArray737[local1 + 1];
												aClass171_1.anIntArray533[local540] = local545;
												continue;
											}
											if (local31 == 5069) {
												local1 -= 2;
												local540 = anIntArray737[local1];
												local545 = anIntArray737[local1 + 1];
												aClass171_1.anIntArray533[local540] = local545;
												continue;
											}
											if (local31 == 5070) {
												local1 -= 3;
												local540 = anIntArray737[local1];
												local545 = anIntArray737[local1 + 1];
												local744 = anIntArray737[local1 + 2];
												@Pc(8857) Class1_Sub6_Sub13 local8857 = Static357.method5242(local540);
												if (local8857.method4179(local545) != 0) {
													throw new RuntimeException("bad command");
												}
												anIntArray737[local1++] = local8857.method4188(local744, local545);
												continue;
											}
											if (local31 == 5071) {
												local3--;
												local352 = aStringArray86[local3];
												local1--;
												local1291 = anIntArray737[local1] == 1;
												Static337.method4816(local352, local1291);
												anIntArray737[local1++] = Static6.anInt85;
												continue;
											}
											if (local31 == 5072) {
												if (Static110.aShortArray122 != null && Static148.anInt2721 < Static6.anInt85) {
													anIntArray737[local1++] = Static110.aShortArray122[Static148.anInt2721++] & 0xFFFF;
													continue;
												}
												anIntArray737[local1++] = -1;
												continue;
											}
											if (local31 == 5073) {
												Static148.anInt2721 = 0;
												continue;
											}
										} else if (local31 < 5200) {
											if (local31 == 5100) {
												if (Static264.aClass154_1.method3994(86)) {
													anIntArray737[local1++] = 1;
												} else {
													anIntArray737[local1++] = 0;
												}
												continue;
											}
											if (local31 == 5101) {
												if (Static264.aClass154_1.method3994(82)) {
													anIntArray737[local1++] = 1;
												} else {
													anIntArray737[local1++] = 0;
												}
												continue;
											}
											if (local31 == 5102) {
												if (Static264.aClass154_1.method3994(81)) {
													anIntArray737[local1++] = 1;
												} else {
													anIntArray737[local1++] = 0;
												}
												continue;
											}
										} else {
											@Pc(9380) boolean local9380;
											if (local31 < 5300) {
												if (local31 == 5200) {
													local1--;
													Static261.method4025(anIntArray737[local1]);
													continue;
												}
												if (local31 == 5201) {
													anIntArray737[local1++] = Static90.method1350();
													continue;
												}
												if (local31 == 5205) {
													local1--;
													Static290.method4429(-1, -1, false, anIntArray737[local1]);
													continue;
												}
												@Pc(9056) Class1_Sub6_Sub4 local9056;
												if (local31 == 5206) {
													local1--;
													local540 = anIntArray737[local1];
													local9056 = Static353.method2110(local540 >> 14 & 0x3FFF, local540 & 0x3FFF);
													if (local9056 == null) {
														anIntArray737[local1++] = -1;
													} else {
														anIntArray737[local1++] = local9056.anInt1850;
													}
													continue;
												}
												@Pc(9080) Class1_Sub6_Sub4 local9080;
												if (local31 == 5207) {
													local1--;
													local9080 = Static353.method2109(anIntArray737[local1]);
													if (local9080 != null && local9080.aString14 != null) {
														aStringArray86[local3++] = local9080.aString14;
														continue;
													}
													aStringArray86[local3++] = "";
													continue;
												}
												if (local31 == 5208) {
													anIntArray737[local1++] = Static57.anInt5865;
													anIntArray737[local1++] = Static335.anInt5582;
													continue;
												}
												if (local31 == 5209) {
													anIntArray737[local1++] = Static386.anInt6289 + Static353.anInt2629;
													anIntArray737[local1++] = Static299.anInt6015 + Static353.anInt2623;
													continue;
												}
												if (local31 == 5210) {
													local1--;
													local540 = anIntArray737[local1];
													local9056 = Static353.method2109(local540);
													if (local9056 == null) {
														anIntArray737[local1++] = 0;
														anIntArray737[local1++] = 0;
													} else {
														anIntArray737[local1++] = local9056.anInt1855 >> 14 & 0x3FFF;
														anIntArray737[local1++] = local9056.anInt1855 & 0x3FFF;
													}
													continue;
												}
												if (local31 == 5211) {
													local1--;
													local540 = anIntArray737[local1];
													local9056 = Static353.method2109(local540);
													if (local9056 == null) {
														anIntArray737[local1++] = 0;
														anIntArray737[local1++] = 0;
													} else {
														anIntArray737[local1++] = local9056.anInt1861 - local9056.anInt1845;
														anIntArray737[local1++] = local9056.anInt1858 - local9056.anInt1848;
													}
													continue;
												}
												@Pc(9222) Class1_Sub24 local9222;
												if (local31 == 5212) {
													local9222 = Static241.method3349();
													if (local9222 == null) {
														anIntArray737[local1++] = -1;
														anIntArray737[local1++] = -1;
													} else {
														anIntArray737[local1++] = local9222.anInt3616;
														local545 = local9222.anInt3619 << 28 | local9222.anInt3618 + Static353.anInt2629 << 14 | local9222.anInt3621 + Static353.anInt2623;
														anIntArray737[local1++] = local545;
													}
													continue;
												}
												if (local31 == 5213) {
													local9222 = Static192.method2745();
													if (local9222 == null) {
														anIntArray737[local1++] = -1;
														anIntArray737[local1++] = -1;
													} else {
														anIntArray737[local1++] = local9222.anInt3616;
														local545 = local9222.anInt3619 << 28 | local9222.anInt3618 + Static353.anInt2629 << 14 | local9222.anInt3621 + Static353.anInt2623;
														anIntArray737[local1++] = local545;
													}
													continue;
												}
												if (local31 == 5214) {
													local1--;
													local540 = anIntArray737[local1];
													local9056 = Static275.method4234();
													if (local9056 != null) {
														local6981 = local9056.method1499(local540 >> 14 & 0x3FFF, anIntArray740, local540 & 0x3FFF, local540 >> 28 & 0x3);
														if (local6981) {
															Static274.method4219(anIntArray740[1], anIntArray740[2]);
														}
													}
													continue;
												}
												if (local31 == 5215) {
													local1 -= 2;
													local540 = anIntArray737[local1];
													local545 = anIntArray737[local1 + 1];
													@Pc(9378) Class170 local9378 = Static353.method2129(local540 >> 14 & 0x3FFF, local540 & 0x3FFF);
													local9380 = false;
													for (@Pc(9385) Class1_Sub6_Sub4 local9385 = (Class1_Sub6_Sub4) local9378.method3685(); local9385 != null; local9385 = (Class1_Sub6_Sub4) local9378.method3688()) {
														if (local9385.anInt1850 == local545) {
															local9380 = true;
															break;
														}
													}
													if (local9380) {
														anIntArray737[local1++] = 1;
													} else {
														anIntArray737[local1++] = 0;
													}
													continue;
												}
												if (local31 == 5218) {
													local1--;
													local540 = anIntArray737[local1];
													local9056 = Static353.method2109(local540);
													if (local9056 == null) {
														anIntArray737[local1++] = -1;
													} else {
														anIntArray737[local1++] = local9056.anInt1854;
													}
													continue;
												}
												if (local31 == 5220) {
													anIntArray737[local1++] = Static240.anInt4008 == 100 ? 1 : 0;
													continue;
												}
												if (local31 == 5221) {
													local1--;
													local540 = anIntArray737[local1];
													Static274.method4219(local540 >> 14 & 0x3FFF, local540 & 0x3FFF);
													continue;
												}
												if (local31 == 5222) {
													local9080 = Static275.method4234();
													if (local9080 == null) {
														anIntArray737[local1++] = -1;
														anIntArray737[local1++] = -1;
													} else {
														local1291 = local9080.method1497(anIntArray740, Static386.anInt6289 + Static353.anInt2629, Static299.anInt6015 + Static353.anInt2623);
														if (local1291) {
															anIntArray737[local1++] = anIntArray740[1];
															anIntArray737[local1++] = anIntArray740[2];
														} else {
															anIntArray737[local1++] = -1;
															anIntArray737[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5223) {
													local1 -= 2;
													local540 = anIntArray737[local1];
													local545 = anIntArray737[local1 + 1];
													Static290.method4429(local545 >> 14 & 0x3FFF, local545 & 0x3FFF, false, local540);
													continue;
												}
												if (local31 == 5224) {
													local1--;
													local540 = anIntArray737[local1];
													local9056 = Static275.method4234();
													if (local9056 == null) {
														anIntArray737[local1++] = -1;
														anIntArray737[local1++] = -1;
													} else {
														local6981 = local9056.method1499(local540 >> 14 & 0x3FFF, anIntArray740, local540 & 0x3FFF, local540 >> 28 & 0x3);
														if (local6981) {
															anIntArray737[local1++] = anIntArray740[1];
															anIntArray737[local1++] = anIntArray740[2];
														} else {
															anIntArray737[local1++] = -1;
															anIntArray737[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5225) {
													local1--;
													local540 = anIntArray737[local1];
													local9056 = Static275.method4234();
													if (local9056 == null) {
														anIntArray737[local1++] = -1;
														anIntArray737[local1++] = -1;
													} else {
														local6981 = local9056.method1497(anIntArray740, local540 >> 14 & 0x3FFF, local540 & 0x3FFF);
														if (local6981) {
															anIntArray737[local1++] = anIntArray740[1];
															anIntArray737[local1++] = anIntArray740[2];
														} else {
															anIntArray737[local1++] = -1;
															anIntArray737[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5226) {
													local1--;
													Static366.method5066(anIntArray737[local1]);
													continue;
												}
												if (local31 == 5227) {
													local1 -= 2;
													local540 = anIntArray737[local1];
													local545 = anIntArray737[local1 + 1];
													Static290.method4429(local545 >> 14 & 0x3FFF, local545 & 0x3FFF, true, local540);
													continue;
												}
												if (local31 == 5228) {
													local1--;
													Static229.aBoolean380 = anIntArray737[local1] == 1;
													continue;
												}
												if (local31 == 5229) {
													anIntArray737[local1++] = Static229.aBoolean380 ? 1 : 0;
													continue;
												}
												if (local31 == 5230) {
													local1--;
													local540 = anIntArray737[local1];
													Static241.method3350(local540);
													continue;
												}
												@Pc(9796) Class1 local9796;
												if (local31 == 5231) {
													local1 -= 2;
													local540 = anIntArray737[local1];
													local1291 = anIntArray737[local1 + 1] == 1;
													if (Static76.aClass77_36 == null) {
														continue;
													}
													local9796 = Static76.aClass77_36.method1368((long) local540);
													if (local9796 != null && !local1291) {
														local9796.method5577();
														continue;
													}
													if (local9796 == null && local1291) {
														local9796 = new Class1();
														Static76.aClass77_36.method1370((long) local540, local9796);
													}
													continue;
												}
												@Pc(9835) Class1 local9835;
												if (local31 == 5232) {
													local1--;
													local540 = anIntArray737[local1];
													if (Static76.aClass77_36 == null) {
														anIntArray737[local1++] = 0;
													} else {
														local9835 = Static76.aClass77_36.method1368((long) local540);
														anIntArray737[local1++] = local9835 == null ? 0 : 1;
													}
													continue;
												}
												if (local31 == 5233) {
													local1 -= 2;
													local540 = anIntArray737[local1];
													local1291 = anIntArray737[local1 + 1] == 1;
													if (Static114.aClass77_15 == null) {
														continue;
													}
													local9796 = Static114.aClass77_15.method1368((long) local540);
													if (local9796 != null && !local1291) {
														local9796.method5577();
														continue;
													}
													if (local9796 == null && local1291) {
														local9796 = new Class1();
														Static114.aClass77_15.method1370((long) local540, local9796);
													}
													continue;
												}
												if (local31 == 5234) {
													local1--;
													local540 = anIntArray737[local1];
													if (Static114.aClass77_15 == null) {
														anIntArray737[local1++] = 0;
													} else {
														local9835 = Static114.aClass77_15.method1368((long) local540);
														anIntArray737[local1++] = local9835 == null ? 0 : 1;
													}
													continue;
												}
												if (local31 == 5235) {
													anIntArray737[local1++] = Static353.aClass1_Sub6_Sub4_2 == null ? -1 : Static353.aClass1_Sub6_Sub4_2.anInt1850;
													continue;
												}
											} else if (local31 < 5400) {
												if (local31 == 5300) {
													local1 -= 2;
													local540 = anIntArray737[local1];
													local545 = anIntArray737[local1 + 1];
													Static228.method3177(local540, 3, local545, false);
													anIntArray737[local1++] = Static47.aFrame1 == null ? 0 : 1;
													continue;
												}
												if (local31 == 5301) {
													if (Static47.aFrame1 != null) {
														Static228.method3177(-1, Static188.aClass135_Sub1_1.anInt3380, -1, false);
													}
													continue;
												}
												if (local31 == 5302) {
													@Pc(9999) Class234[] local9999 = Static254.method3902();
													anIntArray737[local1++] = local9999.length;
													continue;
												}
												if (local31 == 5303) {
													local1--;
													local540 = anIntArray737[local1];
													@Pc(10017) Class234[] local10017 = Static254.method3902();
													anIntArray737[local1++] = local10017[local540].anInt5871;
													anIntArray737[local1++] = local10017[local540].anInt5874;
													continue;
												}
												if (local31 == 5305) {
													local540 = Static188.aClass135_Sub1_1.anInt3378;
													local545 = Static188.aClass135_Sub1_1.anInt3381;
													local744 = -1;
													@Pc(10048) Class234[] local10048 = Static254.method3902();
													for (local414 = 0; local414 < local10048.length; local414++) {
														@Pc(10055) Class234 local10055 = local10048[local414];
														if (local10055.anInt5871 == local540 && local10055.anInt5874 == local545) {
															local744 = local414;
															break;
														}
													}
													anIntArray737[local1++] = local744;
													continue;
												}
												if (local31 == 5306) {
													anIntArray737[local1++] = Static254.method3903();
													continue;
												}
												if (local31 == 5307) {
													local1--;
													local540 = anIntArray737[local1];
													if (local540 >= 1 && local540 <= 2) {
														Static228.method3177(-1, local540, -1, false);
													}
													continue;
												}
												if (local31 == 5308) {
													anIntArray737[local1++] = Static188.aClass135_Sub1_1.anInt3380;
													continue;
												}
												if (local31 == 5309) {
													local1--;
													local540 = anIntArray737[local1];
													if (local540 >= 1 && local540 <= 2) {
														Static188.aClass135_Sub1_1.anInt3380 = local540;
														Static188.aClass135_Sub1_1.method2746(Static341.aClass162_5);
													}
													continue;
												}
											} else {
												@Pc(10515) String local10515;
												if (local31 < 5500) {
													if (local31 == 5400) {
														local3 -= 2;
														local352 = aStringArray86[local3];
														local1724 = aStringArray86[local3 + 1];
														local1--;
														local744 = anIntArray737[local1];
														Static177.method1119(Static83.aClass48_46);
														Static209.aClass1_Sub33_Sub2_2.method5165(Static56.method903(local352) + Static56.method903(local1724) + 1);
														Static209.aClass1_Sub33_Sub2_2.method5143(local352);
														Static209.aClass1_Sub33_Sub2_2.method5143(local1724);
														Static209.aClass1_Sub33_Sub2_2.method5165(local744);
														continue;
													}
													if (local31 == 5401) {
														local1 -= 2;
														Static391.aShortArray123[anIntArray737[local1]] = (short) Static91.method1356(anIntArray737[local1 + 1]);
														Static263.aClass102_2.method2176();
														Static263.aClass102_2.method2180();
														Static168.aClass196_2.method4449();
														Static262.method5507();
														continue;
													}
													if (local31 == 5405) {
														local1 -= 2;
														local540 = anIntArray737[local1];
														local545 = anIntArray737[local1 + 1];
														if (local540 >= 0 && local540 < 2) {
															Static215.anIntArrayArrayArray11[local540] = new int[local545 << 1][4];
														}
														continue;
													}
													if (local31 == 5406) {
														local1 -= 7;
														local540 = anIntArray737[local1];
														local545 = anIntArray737[local1 + 1] << 1;
														local744 = anIntArray737[local1 + 2];
														local395 = anIntArray737[local1 + 3];
														local414 = anIntArray737[local1 + 4];
														local775 = anIntArray737[local1 + 5];
														@Pc(10299) int local10299 = anIntArray737[local1 + 6];
														if (local540 >= 0 && local540 < 2 && Static215.anIntArrayArrayArray11[local540] != null && local545 >= 0 && local545 < Static215.anIntArrayArrayArray11[local540].length) {
															Static215.anIntArrayArrayArray11[local540][local545] = new int[] { (local744 >> 14 & 0x3FFF) * 128, local395, (local744 & 0x3FFF) * 128, local10299 };
															Static215.anIntArrayArrayArray11[local540][local545 + 1] = new int[] { (local414 >> 14 & 0x3FFF) * 128, local775, (local414 & 0x3FFF) * 128 };
														}
														continue;
													}
													if (local31 == 5407) {
														local1--;
														local540 = Static215.anIntArrayArrayArray11[anIntArray737[local1]].length >> 1;
														anIntArray737[local1++] = local540;
														continue;
													}
													if (local31 == 5411) {
														if (Static47.aFrame1 != null) {
															Static228.method3177(-1, Static188.aClass135_Sub1_1.anInt3380, -1, false);
														}
														if (Static142.aFrame2 == null) {
															local352 = Static161.aString26 == null ? Static173.method2548() : Static161.aString26;
															Static98.method1453(false, local352, Static25.anInt394 == 1, Static341.aClass162_5);
														} else {
															Static251.method3883();
															System.exit(0);
														}
														continue;
													}
													if (local31 == 5419) {
														local352 = "";
														if (Static196.aClass112_6 != null) {
															if (Static196.aClass112_6.anObject5 == null) {
																local352 = Static373.method5226(Static196.aClass112_6.anInt2968);
															} else {
																local352 = (String) Static196.aClass112_6.anObject5;
															}
														}
														aStringArray86[local3++] = local352;
														continue;
													}
													if (local31 == 5420) {
														anIntArray737[local1++] = Static237.anInt3958 == 3 ? 1 : 0;
														continue;
													}
													if (local31 == 5421) {
														if (Static47.aFrame1 != null) {
															Static228.method3177(-1, Static188.aClass135_Sub1_1.anInt3380, -1, false);
														}
														local3--;
														local352 = aStringArray86[local3];
														local1--;
														local1291 = anIntArray737[local1] == 1;
														local10515 = Static173.method2548() + local352;
														Static98.method1453(local1291, local10515, Static25.anInt394 == 1, Static341.aClass162_5);
														continue;
													}
													if (local31 == 5422) {
														local3 -= 2;
														local352 = aStringArray86[local3];
														local1724 = aStringArray86[local3 + 1];
														local1--;
														local744 = anIntArray737[local1];
														if (local352.length() > 0) {
															if (Static295.aStringArray71 == null) {
																Static295.aStringArray71 = new String[Static352.anIntArray689[Static313.aClass94_8.anInt2209]];
															}
															Static295.aStringArray71[local744] = local352;
														}
														if (local1724.length() > 0) {
															if (Static26.aStringArray8 == null) {
																Static26.aStringArray8 = new String[Static352.anIntArray689[Static313.aClass94_8.anInt2209]];
															}
															Static26.aStringArray8[local744] = local1724;
														}
														continue;
													}
													if (local31 == 5423) {
														local3--;
														System.out.println(aStringArray86[local3]);
														continue;
													}
													if (local31 == 5424) {
														local1 -= 11;
														Static198.anInt3501 = anIntArray737[local1];
														Static186.anInt3266 = anIntArray737[local1 + 1];
														Static89.anInt1646 = anIntArray737[local1 + 2];
														Static26.anInt592 = anIntArray737[local1 + 3];
														Static128.anInt2283 = anIntArray737[local1 + 4];
														Static112.anInt1969 = anIntArray737[local1 + 5];
														Static266.anInt4629 = anIntArray737[local1 + 6];
														Static346.anInt5670 = anIntArray737[local1 + 7];
														Static294.anInt5055 = anIntArray737[local1 + 8];
														Static39.anInt749 = anIntArray737[local1 + 9];
														Static145.anInt2703 = anIntArray737[local1 + 10];
														Static145.aClass230_41.method4966(Static128.anInt2283);
														Static145.aClass230_41.method4966(Static112.anInt1969);
														Static145.aClass230_41.method4966(Static266.anInt4629);
														Static145.aClass230_41.method4966(Static346.anInt5670);
														Static145.aClass230_41.method4966(Static294.anInt5055);
														Static195.aClass51_23 = null;
														Static274.aClass51_14 = null;
														Static326.aClass51_17 = null;
														Static152.aClass51_7 = null;
														Static381.aClass51_22 = null;
														Static284.aClass51_15 = null;
														Static361.aClass51_18 = null;
														Static158.aClass51_6 = null;
														Static122.aBoolean178 = true;
														continue;
													}
													if (local31 == 5425) {
														Static289.method4391();
														Static122.aBoolean178 = false;
														continue;
													}
													if (local31 == 5426) {
														local1 -= 2;
														Static157.anInt2870 = anIntArray737[local1];
														Static260.anInt4514 = anIntArray737[local1 + 1];
														continue;
													}
													if (local31 == 5427) {
														local1 -= 2;
														Static274.anInt4782 = anIntArray737[local1 + 1];
														continue;
													}
													if (local31 == 5428) {
														local1 -= 2;
														local540 = anIntArray737[local1];
														local545 = anIntArray737[local1 + 1];
														anIntArray737[local1++] = Static359.method5477(local545, local540) ? 1 : 0;
														continue;
													}
													if (local31 == 5429) {
														local3--;
														Static187.method2678(false, aStringArray86[local3]);
														continue;
													}
												} else if (local31 < 5600) {
													if (local31 == 5500) {
														local1 -= 4;
														local540 = anIntArray737[local1];
														local545 = anIntArray737[local1 + 1];
														local744 = anIntArray737[local1 + 2];
														local395 = anIntArray737[local1 + 3];
														Static265.method4064((local540 >> 14 & 0x3FFF) - Static256.anInt4410, local545, false, local395, (local540 & 0x3FFF) - Static293.anInt5053, local744);
														continue;
													}
													if (local31 == 5501) {
														local1 -= 4;
														local540 = anIntArray737[local1];
														local545 = anIntArray737[local1 + 1];
														local744 = anIntArray737[local1 + 2];
														local395 = anIntArray737[local1 + 3];
														Static49.method3049(local545, (local540 >> 14 & 0x3FFF) - Static256.anInt4410, (local540 & 0x3FFF) - Static293.anInt5053, local744, local395);
														continue;
													}
													if (local31 == 5502) {
														local1 -= 6;
														local540 = anIntArray737[local1];
														if (local540 >= 2) {
															throw new RuntimeException();
														}
														Static227.anInt4752 = local540;
														local545 = anIntArray737[local1 + 1];
														if (local545 + 1 >= Static215.anIntArrayArrayArray11[Static227.anInt4752].length >> 1) {
															throw new RuntimeException();
														}
														Static356.anInt3386 = local545;
														Static198.anInt3500 = 0;
														Static43.anInt862 = anIntArray737[local1 + 2];
														Static45.anInt876 = anIntArray737[local1 + 3];
														local744 = anIntArray737[local1 + 4];
														if (local744 >= 2) {
															throw new RuntimeException();
														}
														Static72.anInt1436 = local744;
														local395 = anIntArray737[local1 + 5];
														if (local395 + 1 >= Static215.anIntArrayArrayArray11[Static72.anInt1436].length >> 1) {
															throw new RuntimeException();
														}
														Static64.anInt1263 = local395;
														Static323.anInt5463 = 3;
														continue;
													}
													if (local31 == 5503) {
														Static223.method3098();
														continue;
													}
													if (local31 == 5504) {
														local1 -= 2;
														Static281.method4294(anIntArray737[local1], anIntArray737[local1 + 1]);
														continue;
													}
													if (local31 == 5505) {
														anIntArray737[local1++] = (int) Static19.aFloat1 >> 3;
														continue;
													}
													if (local31 == 5506) {
														anIntArray737[local1++] = (int) Static386.aFloat82 >> 3;
														continue;
													}
													if (local31 == 5507) {
														Static307.method4939();
														continue;
													}
													if (local31 == 5508) {
														Static267.method4125();
														continue;
													}
													if (local31 == 5509) {
														Static167.method2467();
														continue;
													}
													if (local31 == 5510) {
														Static162.method2409();
														continue;
													}
													if (local31 == 5511) {
														local1--;
														local540 = anIntArray737[local1];
														local545 = local540 >> 14 & 0x3FFF;
														local744 = local540 & 0x3FFF;
														local545 -= Static256.anInt4410;
														if (local545 < 0) {
															local545 = 0;
														} else if (local545 >= Static92.anInt1675) {
															local545 = Static92.anInt1675;
														}
														local744 -= Static293.anInt5053;
														if (local744 < 0) {
															local744 = 0;
														} else if (local744 >= Static262.anInt6340) {
															local744 = Static262.anInt6340;
														}
														Static85.anInt1570 = local545 * 128 + 64;
														Static16.anInt287 = local744 * 128 + 64;
														Static323.anInt5463 = 4;
														continue;
													}
													if (local31 == 5512) {
														Static238.method3299();
														continue;
													}
												} else if (local31 < 5700) {
													if (local31 == 5600) {
														local3 -= 2;
														local352 = aStringArray86[local3];
														local1724 = aStringArray86[local3 + 1];
														local1--;
														local744 = anIntArray737[local1];
														if (Static142.anInt2665 == 10 && Static67.anInt1357 == 0 && Static354.anInt5766 == 0 && Static300.anInt5112 == 0 && Static24.anInt387 == 0) {
															Static370.method5199(local744, local1724, local352);
														}
														continue;
													}
													if (local31 == 5601) {
														Static257.method3931();
														continue;
													}
													if (local31 == 5602) {
														if (Static354.anInt5766 == 0) {
															Static288.anInt4959 = -2;
														}
														continue;
													}
													if (local31 == 5603) {
														local1 -= 4;
														if (Static142.anInt2665 == 10 && Static67.anInt1357 == 0 && Static354.anInt5766 == 0 && Static300.anInt5112 == 0 && Static24.anInt387 == 0) {
															Static212.method2975(anIntArray737[local1 + 1], anIntArray737[local1 + 2], anIntArray737[local1], anIntArray737[local1 + 3]);
														}
														continue;
													}
													if (local31 == 5604) {
														local3--;
														if (Static142.anInt2665 == 10 && Static67.anInt1357 == 0 && Static354.anInt5766 == 0 && Static300.anInt5112 == 0 && Static24.anInt387 == 0) {
															Static122.method1792(Static229.method3191(aStringArray86[local3]));
														}
														continue;
													}
													if (local31 == 5605) {
														local3 -= 3;
														local1 -= 7;
														if (Static142.anInt2665 == 10 && Static67.anInt1357 == 0 && Static354.anInt5766 == 0 && Static300.anInt5112 == 0 && Static24.anInt387 == 0) {
															Static234.method3214(anIntArray737[local1], aStringArray86[local3 + 1], Static229.method3191(aStringArray86[local3]), anIntArray737[local1 + 4] == 1, anIntArray737[local1 + 6] == 1, anIntArray737[local1 + 2], aStringArray86[local3 + 2], anIntArray737[local1 + 3], anIntArray737[local1 + 5] == 1, anIntArray737[local1 + 1]);
														}
														continue;
													}
													if (local31 == 5606) {
														if (Static300.anInt5112 == 0) {
															Static324.anInt2339 = -2;
														}
														continue;
													}
													if (local31 == 5607) {
														anIntArray737[local1++] = Static288.anInt4959;
														continue;
													}
													if (local31 == 5608) {
														anIntArray737[local1++] = Static133.anInt2478;
														continue;
													}
													if (local31 == 5609) {
														anIntArray737[local1++] = Static324.anInt2339;
														continue;
													}
													if (local31 == 5610) {
														for (local540 = 0; local540 < 5; local540++) {
															aStringArray86[local3++] = Static183.aStringArray23.length > local540 ? Static114.method1653(Static183.aStringArray23[local540]) : "";
														}
														Static183.aStringArray23 = null;
														continue;
													}
													if (local31 == 5611) {
														anIntArray737[local1++] = Static266.anInt4615;
														continue;
													}
												} else if (local31 < 6100) {
													if (local31 == 6001) {
														local1--;
														local540 = anIntArray737[local1];
														if (local540 < 1) {
															local540 = 1;
														}
														if (local540 > 4) {
															local540 = 4;
														}
														Static188.aClass135_Sub1_1.anInt3373 = local540;
														Static2.method10();
														Static188.aClass135_Sub1_1.method2746(Static341.aClass162_5);
														Static247.aBoolean423 = false;
														continue;
													}
													if (local31 == 6002) {
														local1--;
														Static188.aClass135_Sub1_1.method2749(anIntArray737[local1] == 1);
														Static2.method10();
														Static49.method3048();
														Static188.aClass135_Sub1_1.method2746(Static341.aClass162_5);
														Static247.aBoolean423 = false;
														continue;
													}
													if (local31 == 6003) {
														local1--;
														Static188.aClass135_Sub1_1.aBoolean321 = anIntArray737[local1] == 1;
														Static49.method3048();
														Static188.aClass135_Sub1_1.method2746(Static341.aClass162_5);
														Static247.aBoolean423 = false;
														continue;
													}
													if (local31 == 6005) {
														local1--;
														Static188.aClass135_Sub1_1.aBoolean326 = anIntArray737[local1] == 1;
														Static2.method10();
														Static188.aClass135_Sub1_1.method2746(Static341.aClass162_5);
														Static247.aBoolean423 = false;
														continue;
													}
													if (local31 == 6006) {
														local1--;
														Static188.aClass135_Sub1_1.aBoolean328 = anIntArray737[local1] == 1;
														Static66.aClass164_2.method5340(!Static188.aClass135_Sub1_1.aBoolean328);
														Static188.aClass135_Sub1_1.method2746(Static341.aClass162_5);
														Static247.aBoolean423 = false;
														continue;
													}
													if (local31 == 6007) {
														local1--;
														Static188.aClass135_Sub1_1.anInt3377 = anIntArray737[local1];
														Static188.aClass135_Sub1_1.method2746(Static341.aClass162_5);
														Static247.aBoolean423 = false;
														continue;
													}
													if (local31 == 6008) {
														local1--;
														Static188.aClass135_Sub1_1.aBoolean322 = anIntArray737[local1] == 1;
														Static188.aClass135_Sub1_1.method2746(Static341.aClass162_5);
														Static247.aBoolean423 = false;
														continue;
													}
													if (local31 == 6009) {
														local1--;
														Static188.aClass135_Sub1_1.aBoolean320 = anIntArray737[local1] == 1;
														Static2.method10();
														Static188.aClass135_Sub1_1.method2746(Static341.aClass162_5);
														Static247.aBoolean423 = false;
														continue;
													}
													if (local31 == 6010) {
														local1--;
														Static188.aClass135_Sub1_1.aBoolean327 = anIntArray737[local1] == 1;
														Static188.aClass135_Sub1_1.method2746(Static341.aClass162_5);
														Static247.aBoolean423 = false;
														continue;
													}
													if (local31 == 6011) {
														local1--;
														local540 = anIntArray737[local1];
														if (local540 < 0 || local540 > 2) {
															local540 = 0;
														}
														Static188.aClass135_Sub1_1.anInt3384 = local540;
														Static2.method10();
														Static188.aClass135_Sub1_1.method2746(Static341.aClass162_5);
														Static247.aBoolean423 = false;
														continue;
													}
													if (local31 == 6012) {
														local1--;
														Static188.aClass135_Sub1_1.aBoolean332 = anIntArray737[local1] == 1;
														Static251.method3879();
														Static188.aClass135_Sub1_1.method2746(Static341.aClass162_5);
														Static247.aBoolean423 = false;
														continue;
													}
													if (local31 == 6014) {
														local1--;
														Static188.aClass135_Sub1_1.aBoolean324 = anIntArray737[local1] == 1;
														Static2.method10();
														Static188.aClass135_Sub1_1.method2746(Static341.aClass162_5);
														Static247.aBoolean423 = false;
														continue;
													}
													if (local31 == 6015) {
														local1--;
														Static188.aClass135_Sub1_1.aBoolean317 = anIntArray737[local1] == 1;
														Static2.method10();
														Static188.aClass135_Sub1_1.method2746(Static341.aClass162_5);
														Static247.aBoolean423 = false;
														continue;
													}
													if (local31 == 6016) {
														local1--;
														local540 = anIntArray737[local1];
														if (local540 < 0 || local540 > 2) {
															local540 = 0;
														}
														Static188.aClass135_Sub1_1.anInt3372 = local540;
														Static151.method2293();
														Static188.aClass135_Sub1_1.method2746(Static341.aClass162_5);
														continue;
													}
													if (local31 == 6017) {
														local1--;
														Static188.aClass135_Sub1_1.aBoolean325 = anIntArray737[local1] == 1;
														Static211.method2968();
														Static188.aClass135_Sub1_1.method2746(Static341.aClass162_5);
														Static247.aBoolean423 = false;
														continue;
													}
													if (local31 == 6018) {
														local1--;
														local540 = anIntArray737[local1];
														if (local540 < 0) {
															local540 = 0;
														}
														if (local540 > 127) {
															local540 = 127;
														}
														Static188.aClass135_Sub1_1.anInt3382 = local540;
														Static188.aClass135_Sub1_1.method2746(Static341.aClass162_5);
														Static247.aBoolean423 = false;
														continue;
													}
													if (local31 == 6019) {
														local1--;
														local540 = anIntArray737[local1];
														if (local540 < 0) {
															local540 = 0;
														}
														if (local540 > 255) {
															local540 = 255;
														}
														if (local540 != Static188.aClass135_Sub1_1.anInt3379) {
															if (Static188.aClass135_Sub1_1.anInt3379 == 0 && Static91.anInt1663 != -1) {
																Static346.method4883(Static156.aClass230_44, Static91.anInt1663, local540);
																Static12.aBoolean13 = false;
															} else if (local540 == 0) {
																Static374.method5259();
																Static12.aBoolean13 = false;
															} else {
																Static203.method2880(local540);
															}
															Static188.aClass135_Sub1_1.anInt3379 = local540;
														}
														Static188.aClass135_Sub1_1.method2746(Static341.aClass162_5);
														Static247.aBoolean423 = false;
														continue;
													}
													if (local31 == 6020) {
														local1--;
														local540 = anIntArray737[local1];
														if (local540 < 0) {
															local540 = 0;
														}
														if (local540 > 127) {
															local540 = 127;
														}
														Static188.aClass135_Sub1_1.anInt3374 = local540;
														Static188.aClass135_Sub1_1.method2746(Static341.aClass162_5);
														Static247.aBoolean423 = false;
														continue;
													}
													if (local31 == 6021) {
														local1--;
														Static188.aClass135_Sub1_1.aBoolean333 = anIntArray737[local1] == 1;
														Static49.method3048();
														continue;
													}
													if (local31 == 6023) {
														local1--;
														local540 = anIntArray737[local1];
														local1291 = false;
														if (local540 < 0) {
															local540 = 0;
														}
														if (local540 > 2) {
															local540 = 2;
														}
														if (Static294.anInt5063 < 96) {
															local540 = 0;
															local1291 = true;
														}
														Static310.method4626(local540);
														Static188.aClass135_Sub1_1.method2746(Static341.aClass162_5);
														Static247.aBoolean423 = false;
														anIntArray737[local1++] = local1291 ? 0 : 1;
														continue;
													}
													if (local31 == 6024) {
														local1--;
														local540 = anIntArray737[local1];
														if (local540 < 0 || local540 > 2) {
															local540 = 0;
														}
														Static188.aClass135_Sub1_1.anInt3376 = local540;
														Static188.aClass135_Sub1_1.method2746(Static341.aClass162_5);
														continue;
													}
													if (local31 == 6025) {
														local1--;
														local540 = anIntArray737[local1];
														if (local540 < 0 || local540 > Static43.method680(Static294.anInt5063)) {
															local540 = 0;
														}
														Static188.aClass135_Sub1_1.anInt3383 = local540;
														Static188.aClass135_Sub1_1.method2746(Static341.aClass162_5);
														Static247.aBoolean423 = false;
														continue;
													}
													if (local31 == 6027) {
														local1--;
														local540 = anIntArray737[local1];
														if (local540 < 0 || local540 > 1) {
															local540 = 0;
														}
														Static233.method3208(local540 == 1);
														continue;
													}
													if (local31 == 6028) {
														local1--;
														Static188.aClass135_Sub1_1.aBoolean318 = anIntArray737[local1] != 0;
														Static188.aClass135_Sub1_1.method2746(Static341.aClass162_5);
														continue;
													}
													if (local31 == 6029) {
														local1--;
														Static188.aClass135_Sub1_1.anInt3377 = anIntArray737[local1];
														Static188.aClass135_Sub1_1.method2746(Static341.aClass162_5);
														continue;
													}
													if (local31 == 6030) {
														local1--;
														Static188.aClass135_Sub1_1.aBoolean330 = anIntArray737[local1] != 0;
														Static188.aClass135_Sub1_1.method2746(Static341.aClass162_5);
														Static2.method10();
														continue;
													}
													if (local31 == 6031) {
														local1--;
														local540 = anIntArray737[local1];
														if (local540 < 0 || local540 > 3) {
															local540 = 2;
														}
														Static75.method1176(local540);
														continue;
													}
													if (local31 == 6032) {
														local1--;
														local540 = anIntArray737[local1];
														if (local540 < 0 || local540 > 3) {
															local540 = 2;
														}
														Static188.aClass135_Sub1_1.anInt3375 = local540;
														Static188.aClass135_Sub1_1.method2746(Static341.aClass162_5);
														Static247.aBoolean423 = false;
														continue;
													}
													if (local31 == 6033) {
														local1--;
														local540 = anIntArray737[local1];
														if (local540 < 0 || local540 > 4) {
															local540 = 2;
														}
														Static188.aClass135_Sub1_1.anInt3385 = local540;
														Static188.aClass135_Sub1_1.method2746(Static341.aClass162_5);
														continue;
													}
													if (local31 == 6035) {
														local1--;
														Static188.aClass135_Sub1_1.aBoolean334 = anIntArray737[local1] == 1;
														Static2.method10();
														Static49.method3048();
														continue;
													}
												} else if (local31 < 6200) {
													if (local31 == 6101) {
														anIntArray737[local1++] = Static188.aClass135_Sub1_1.anInt3373;
														continue;
													}
													if (local31 == 6102) {
														anIntArray737[local1++] = Static188.aClass135_Sub1_1.method2744(Static25.anInt394) ? 1 : 0;
														continue;
													}
													if (local31 == 6103) {
														anIntArray737[local1++] = Static188.aClass135_Sub1_1.aBoolean321 ? 1 : 0;
														continue;
													}
													if (local31 == 6105) {
														anIntArray737[local1++] = Static188.aClass135_Sub1_1.aBoolean326 ? 1 : 0;
														continue;
													}
													if (local31 == 6106) {
														anIntArray737[local1++] = Static188.aClass135_Sub1_1.aBoolean328 ? 1 : 0;
														continue;
													}
													if (local31 == 6107) {
														anIntArray737[local1++] = Static188.aClass135_Sub1_1.anInt3377;
														continue;
													}
													if (local31 == 6108) {
														anIntArray737[local1++] = Static188.aClass135_Sub1_1.aBoolean322 ? 1 : 0;
														continue;
													}
													if (local31 == 6109) {
														anIntArray737[local1++] = Static188.aClass135_Sub1_1.aBoolean320 ? 1 : 0;
														continue;
													}
													if (local31 == 6110) {
														anIntArray737[local1++] = Static188.aClass135_Sub1_1.aBoolean327 ? 1 : 0;
														continue;
													}
													if (local31 == 6111) {
														anIntArray737[local1++] = Static188.aClass135_Sub1_1.anInt3384;
														continue;
													}
													if (local31 == 6112) {
														anIntArray737[local1++] = Static188.aClass135_Sub1_1.aBoolean332 ? 1 : 0;
														continue;
													}
													if (local31 == 6114) {
														anIntArray737[local1++] = Static188.aClass135_Sub1_1.aBoolean324 ? 1 : 0;
														continue;
													}
													if (local31 == 6115) {
														anIntArray737[local1++] = Static188.aClass135_Sub1_1.aBoolean317 ? 1 : 0;
														continue;
													}
													if (local31 == 6116) {
														anIntArray737[local1++] = Static188.aClass135_Sub1_1.anInt3372;
														continue;
													}
													if (local31 == 6117) {
														anIntArray737[local1++] = Static188.aClass135_Sub1_1.aBoolean325 ? 1 : 0;
														continue;
													}
													if (local31 == 6118) {
														anIntArray737[local1++] = Static188.aClass135_Sub1_1.anInt3382;
														continue;
													}
													if (local31 == 6119) {
														anIntArray737[local1++] = Static188.aClass135_Sub1_1.anInt3379;
														continue;
													}
													if (local31 == 6120) {
														anIntArray737[local1++] = Static188.aClass135_Sub1_1.anInt3374;
														continue;
													}
													if (local31 == 6121) {
														anIntArray737[local1++] = Static66.aClass164_2.method5327() ? 1 : 0;
														continue;
													}
													if (local31 == 6123) {
														anIntArray737[local1++] = Static176.method2585();
														continue;
													}
													if (local31 == 6124) {
														anIntArray737[local1++] = Static188.aClass135_Sub1_1.anInt3376;
														continue;
													}
													if (local31 == 6125) {
														anIntArray737[local1++] = Static188.aClass135_Sub1_1.anInt3383;
														continue;
													}
													if (local31 == 6126) {
														anIntArray737[local1++] = Static66.aClass164_2.method5341() ? 1 : 0;
														continue;
													}
													if (local31 == 6127) {
														anIntArray737[local1++] = Static188.aClass135_Sub1_1.aBoolean316 ? 1 : 0;
														continue;
													}
													if (local31 == 6128) {
														anIntArray737[local1++] = Static188.aClass135_Sub1_1.aBoolean318 ? 1 : 0;
														continue;
													}
													if (local31 == 6129) {
														anIntArray737[local1++] = Static188.aClass135_Sub1_1.anInt3377;
														continue;
													}
													if (local31 == 6130) {
														anIntArray737[local1++] = Static188.aClass135_Sub1_1.aBoolean330 ? 1 : 0;
														continue;
													}
													if (local31 == 6131) {
														anIntArray737[local1++] = Static25.anInt394;
														continue;
													}
													if (local31 == 6132) {
														anIntArray737[local1++] = Static188.aClass135_Sub1_1.anInt3375;
														continue;
													}
													if (local31 == 6133) {
														anIntArray737[local1++] = Static237.anInt3958 == 1 || Static237.anInt3958 == 4 ? 1 : 0;
														continue;
													}
													if (local31 == 6134) {
														anIntArray737[local1++] = Static43.method680(Static294.anInt5063);
														continue;
													}
													if (local31 == 6135) {
														anIntArray737[local1++] = Static188.aClass135_Sub1_1.anInt3385;
														continue;
													}
												} else if (local31 < 6300) {
													if (local31 == 6200) {
														local1 -= 2;
														Static373.aShort86 = (short) anIntArray737[local1];
														if (Static373.aShort86 <= 0) {
															Static373.aShort86 = 256;
														}
														Static76.aShort83 = (short) anIntArray737[local1 + 1];
														if (Static76.aShort83 <= 0) {
															Static76.aShort83 = 205;
														}
														continue;
													}
													if (local31 == 6201) {
														local1 -= 2;
														Static249.aShort67 = (short) anIntArray737[local1];
														if (Static249.aShort67 <= 0) {
															Static249.aShort67 = 256;
														}
														Static390.aShort98 = (short) anIntArray737[local1 + 1];
														if (Static390.aShort98 <= 0) {
															Static390.aShort98 = 320;
														}
														continue;
													}
													if (local31 == 6202) {
														local1 -= 4;
														Static14.aShort1 = (short) anIntArray737[local1];
														if (Static14.aShort1 <= 0) {
															Static14.aShort1 = 1;
														}
														Static98.aShort29 = (short) anIntArray737[local1 + 1];
														if (Static98.aShort29 <= 0) {
															Static98.aShort29 = 32767;
														} else if (Static98.aShort29 < Static14.aShort1) {
															Static98.aShort29 = Static14.aShort1;
														}
														Static390.aShort99 = (short) anIntArray737[local1 + 2];
														if (Static390.aShort99 <= 0) {
															Static390.aShort99 = 1;
														}
														Static281.aShort73 = (short) anIntArray737[local1 + 3];
														if (Static281.aShort73 <= 0) {
															Static281.aShort73 = 32767;
														} else if (Static281.aShort73 < Static390.aShort99) {
															Static281.aShort73 = Static390.aShort99;
														}
														continue;
													}
													if (local31 == 6203) {
														Static230.method5273(0, 0, Static238.aClass117_11.anInt3071, Static238.aClass117_11.anInt3074, false);
														anIntArray737[local1++] = Static5.anInt65;
														anIntArray737[local1++] = Static299.anInt5993;
														continue;
													}
													if (local31 == 6204) {
														anIntArray737[local1++] = Static249.aShort67;
														anIntArray737[local1++] = Static390.aShort98;
														continue;
													}
													if (local31 == 6205) {
														anIntArray737[local1++] = Static373.aShort86;
														anIntArray737[local1++] = Static76.aShort83;
														continue;
													}
												} else if (local31 < 6400) {
													if (local31 == 6300) {
														anIntArray737[local1++] = (int) (Static378.method5293() / 60000L);
														continue;
													}
													if (local31 == 6301) {
														anIntArray737[local1++] = (int) (Static378.method5293() / 86400000L) - 11745;
														continue;
													}
													if (local31 == 6302) {
														local1 -= 3;
														local540 = anIntArray737[local1];
														local545 = anIntArray737[local1 + 1];
														local744 = anIntArray737[local1 + 2];
														aCalendar2.clear();
														aCalendar2.set(11, 12);
														aCalendar2.set(local744, local545, local540);
														anIntArray737[local1++] = (int) (aCalendar2.getTime().getTime() / 86400000L) - 11745;
														continue;
													}
													if (local31 == 6303) {
														aCalendar2.clear();
														aCalendar2.setTime(new Date(Static378.method5293()));
														anIntArray737[local1++] = aCalendar2.get(1);
														continue;
													}
													if (local31 == 6304) {
														local1--;
														local540 = anIntArray737[local1];
														local1291 = true;
														if (local540 < 0) {
															local1291 = (local540 + 1) % 4 == 0;
														} else if (local540 < 1582) {
															local1291 = local540 % 4 == 0;
														} else if (local540 % 4 != 0) {
															local1291 = false;
														} else if (local540 % 100 != 0) {
															local1291 = true;
														} else if (local540 % 400 != 0) {
															local1291 = false;
														}
														anIntArray737[local1++] = local1291 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6500) {
													if (local31 == 6405) {
														anIntArray737[local1++] = Static319.method4694() ? 1 : 0;
														continue;
													}
													if (local31 == 6406) {
														anIntArray737[local1++] = Static147.method2201() ? 1 : 0;
														continue;
													}
												} else if (local31 < 6600) {
													if (local31 == 6500) {
														if (Static142.anInt2665 == 10 && Static67.anInt1357 == 0 && Static354.anInt5766 == 0 && Static300.anInt5112 == 0) {
															anIntArray737[local1++] = Static51.method838() == -1 ? 0 : 1;
															continue;
														}
														anIntArray737[local1++] = 1;
														continue;
													}
													@Pc(12921) Class203 local12921;
													@Pc(12897) Class124_Sub1 local12897;
													if (local31 == 6501) {
														local12897 = Static156.method2351();
														if (local12897 == null) {
															anIntArray737[local1++] = -1;
															anIntArray737[local1++] = 0;
															aStringArray86[local3++] = "";
															anIntArray737[local1++] = 0;
															aStringArray86[local3++] = "";
															anIntArray737[local1++] = 0;
															anIntArray737[local1++] = 0;
														} else {
															anIntArray737[local1++] = local12897.anInt5511;
															anIntArray737[local1++] = local12897.anInt5499;
															aStringArray86[local3++] = local12897.aString65;
															local12921 = local12897.method4762();
															anIntArray737[local1++] = local12921.anInt5242;
															aStringArray86[local3++] = local12921.aString58;
															anIntArray737[local1++] = local12897.anInt5502;
															anIntArray737[local1++] = local12897.anInt5512;
														}
														continue;
													}
													if (local31 == 6502) {
														local12897 = Static232.method617();
														if (local12897 == null) {
															anIntArray737[local1++] = -1;
															anIntArray737[local1++] = 0;
															aStringArray86[local3++] = "";
															anIntArray737[local1++] = 0;
															aStringArray86[local3++] = "";
															anIntArray737[local1++] = 0;
															anIntArray737[local1++] = 0;
														} else {
															anIntArray737[local1++] = local12897.anInt5511;
															anIntArray737[local1++] = local12897.anInt5499;
															aStringArray86[local3++] = local12897.aString65;
															local12921 = local12897.method4762();
															anIntArray737[local1++] = local12921.anInt5242;
															aStringArray86[local3++] = local12921.aString58;
															anIntArray737[local1++] = local12897.anInt5502;
															anIntArray737[local1++] = local12897.anInt5512;
														}
														continue;
													}
													if (local31 == 6503) {
														local1--;
														local540 = anIntArray737[local1];
														if (Static142.anInt2665 == 10 && Static67.anInt1357 == 0 && Static354.anInt5766 == 0 && Static300.anInt5112 == 0) {
															anIntArray737[local1++] = Static181.method4755(local540) ? 1 : 0;
															continue;
														}
														anIntArray737[local1++] = 0;
														continue;
													}
													if (local31 == 6504) {
														local1--;
														Static188.aClass135_Sub1_1.anInt3371 = anIntArray737[local1];
														Static188.aClass135_Sub1_1.method2746(Static341.aClass162_5);
														continue;
													}
													if (local31 == 6505) {
														anIntArray737[local1++] = Static188.aClass135_Sub1_1.anInt3371;
														continue;
													}
													if (local31 == 6506) {
														local1--;
														local540 = anIntArray737[local1];
														@Pc(13144) Class124_Sub1 local13144 = Static273.method4215(local540);
														if (local13144 == null) {
															anIntArray737[local1++] = -1;
															aStringArray86[local3++] = "";
															anIntArray737[local1++] = 0;
															aStringArray86[local3++] = "";
															anIntArray737[local1++] = 0;
															anIntArray737[local1++] = 0;
														} else {
															anIntArray737[local1++] = local13144.anInt5499;
															aStringArray86[local3++] = local13144.aString65;
															@Pc(13162) Class203 local13162 = local13144.method4762();
															anIntArray737[local1++] = local13162.anInt5242;
															aStringArray86[local3++] = local13162.aString58;
															anIntArray737[local1++] = local13144.anInt5502;
															anIntArray737[local1++] = local13144.anInt5512;
														}
														continue;
													}
													if (local31 == 6507) {
														local1 -= 4;
														local540 = anIntArray737[local1];
														local1291 = anIntArray737[local1 + 1] == 1;
														local744 = anIntArray737[local1 + 2];
														local9380 = anIntArray737[local1 + 3] == 1;
														Static102.method2553(local744, local540, local9380, local1291);
														continue;
													}
													if (local31 == 6508) {
														Static62.method1009();
														continue;
													}
													if (local31 == 6509) {
														if (Static142.anInt2665 == 10) {
															local1--;
															Static268.aBoolean453 = anIntArray737[local1] == 1;
														}
														continue;
													}
												} else if (local31 < 6700) {
													if (local31 == 6600) {
														local1--;
														Static188.aClass135_Sub1_1.aBoolean329 = anIntArray737[local1] == 1;
														Static188.aClass135_Sub1_1.method2746(Static341.aClass162_5);
														continue;
													}
													if (local31 == 6601) {
														anIntArray737[local1++] = Static188.aClass135_Sub1_1.aBoolean329 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6800 && Static234.aClass28_3 == Static167.aClass28_2) {
													if (local31 == 6700) {
														local540 = Static22.aClass77_29.method1365();
														if (Static352.anInt5753 != -1) {
															local540++;
														}
														anIntArray737[local1++] = local540;
														continue;
													}
													if (local31 == 6701) {
														local1--;
														local540 = anIntArray737[local1];
														if (Static352.anInt5753 != -1) {
															if (local540 == 0) {
																anIntArray737[local1++] = Static352.anInt5753;
																continue;
															}
															local540--;
														}
														local3576 = (Class1_Sub38) Static22.aClass77_29.method1359();
														while (local540-- > 0) {
															local3576 = (Class1_Sub38) Static22.aClass77_29.method1360();
														}
														anIntArray737[local1++] = local3576.anInt5050;
														continue;
													}
													if (local31 == 6702) {
														local1--;
														local540 = anIntArray737[local1];
														if (Static137.aClass117ArrayArray1[local540] == null) {
															aStringArray86[local3++] = "";
														} else {
															local1724 = Static137.aClass117ArrayArray1[local540][0].aString27;
															if (local1724 == null) {
																aStringArray86[local3++] = "";
															} else {
																aStringArray86[local3++] = local1724.substring(0, local1724.indexOf(58));
															}
														}
														continue;
													}
													if (local31 == 6703) {
														local1--;
														local540 = anIntArray737[local1];
														if (Static137.aClass117ArrayArray1[local540] == null) {
															anIntArray737[local1++] = 0;
														} else {
															anIntArray737[local1++] = Static137.aClass117ArrayArray1[local540].length;
														}
														continue;
													}
													if (local31 == 6704) {
														local1 -= 2;
														local540 = anIntArray737[local1];
														local545 = anIntArray737[local1 + 1];
														if (Static137.aClass117ArrayArray1[local540] == null) {
															aStringArray86[local3++] = "";
														} else {
															local10515 = Static137.aClass117ArrayArray1[local540][local545].aString27;
															if (local10515 == null) {
																aStringArray86[local3++] = "";
															} else {
																aStringArray86[local3++] = local10515;
															}
														}
														continue;
													}
													if (local31 == 6705) {
														local1 -= 2;
														local540 = anIntArray737[local1];
														local545 = anIntArray737[local1 + 1];
														if (Static137.aClass117ArrayArray1[local540] == null) {
															anIntArray737[local1++] = 0;
														} else {
															anIntArray737[local1++] = Static137.aClass117ArrayArray1[local540][local545].anInt3060;
														}
														continue;
													}
													if (local31 == 6706) {
														continue;
													}
													if (local31 == 6707) {
														local1 -= 3;
														local540 = anIntArray737[local1];
														local545 = anIntArray737[local1 + 1];
														local744 = anIntArray737[local1 + 2];
														Static306.method4553(1, "", local744, local540 << 16 | local545);
														continue;
													}
													if (local31 == 6708) {
														local1 -= 3;
														local540 = anIntArray737[local1];
														local545 = anIntArray737[local1 + 1];
														local744 = anIntArray737[local1 + 2];
														Static306.method4553(2, "", local744, local540 << 16 | local545);
														continue;
													}
													if (local31 == 6709) {
														local1 -= 3;
														local540 = anIntArray737[local1];
														local545 = anIntArray737[local1 + 1];
														local744 = anIntArray737[local1 + 2];
														Static306.method4553(3, "", local744, local540 << 16 | local545);
														continue;
													}
													if (local31 == 6710) {
														local1 -= 3;
														local540 = anIntArray737[local1];
														local545 = anIntArray737[local1 + 1];
														local744 = anIntArray737[local1 + 2];
														Static306.method4553(4, "", local744, local540 << 16 | local545);
														continue;
													}
													if (local31 == 6711) {
														local1 -= 3;
														local540 = anIntArray737[local1];
														local545 = anIntArray737[local1 + 1];
														local744 = anIntArray737[local1 + 2];
														Static306.method4553(5, "", local744, local540 << 16 | local545);
														continue;
													}
													if (local31 == 6712) {
														local1 -= 3;
														local540 = anIntArray737[local1];
														local545 = anIntArray737[local1 + 1];
														local744 = anIntArray737[local1 + 2];
														Static306.method4553(6, "", local744, local540 << 16 | local545);
														continue;
													}
													if (local31 == 6713) {
														local1 -= 3;
														local540 = anIntArray737[local1];
														local545 = anIntArray737[local1 + 1];
														local744 = anIntArray737[local1 + 2];
														Static306.method4553(7, "", local744, local540 << 16 | local545);
														continue;
													}
													if (local31 == 6714) {
														local1 -= 3;
														local540 = anIntArray737[local1];
														local545 = anIntArray737[local1 + 1];
														local744 = anIntArray737[local1 + 2];
														Static306.method4553(8, "", local744, local540 << 16 | local545);
														continue;
													}
													if (local31 == 6715) {
														local1 -= 3;
														local540 = anIntArray737[local1];
														local545 = anIntArray737[local1 + 1];
														local744 = anIntArray737[local1 + 2];
														Static306.method4553(9, "", local744, local540 << 16 | local545);
														continue;
													}
													if (local31 == 6716) {
														local1 -= 3;
														local540 = anIntArray737[local1];
														local545 = anIntArray737[local1 + 1];
														local744 = anIntArray737[local1 + 2];
														Static306.method4553(10, "", local744, local540 << 16 | local545);
														continue;
													}
													if (local31 == 6717) {
														local1 -= 3;
														local540 = anIntArray737[local1];
														local545 = anIntArray737[local1 + 1];
														local744 = anIntArray737[local1 + 2];
														local754 = Static84.method1246(local540 << 16 | local545, local744);
														Static361.method5016();
														@Pc(13882) Class1_Sub22 local13882 = Static50.method810(local754);
														Static232.method620(local13882.anInt3449, local744, local13882.method2807(), local754.anInt3073, local754.anInt3096, local540 << 16 | local545);
														continue;
													}
												} else if (local31 < 6900) {
													@Pc(13916) Class97 local13916;
													if (local31 == 6800) {
														local1--;
														local540 = anIntArray737[local1];
														local13916 = Static16.aClass249_1.method5522(local540);
														if (local13916.aString22 == null) {
															aStringArray86[local3++] = "";
														} else {
															aStringArray86[local3++] = local13916.aString22;
														}
														continue;
													}
													if (local31 == 6801) {
														local1--;
														local540 = anIntArray737[local1];
														local13916 = Static16.aClass249_1.method5522(local540);
														anIntArray737[local1++] = local13916.anInt2268;
														continue;
													}
													if (local31 == 6802) {
														local1--;
														local540 = anIntArray737[local1];
														local13916 = Static16.aClass249_1.method5522(local540);
														anIntArray737[local1++] = local13916.anInt2266;
														continue;
													}
													if (local31 == 6803) {
														local1--;
														local540 = anIntArray737[local1];
														local13916 = Static16.aClass249_1.method5522(local540);
														anIntArray737[local1++] = local13916.anInt2292;
														continue;
													}
													if (local31 == 6804) {
														local1 -= 2;
														local540 = anIntArray737[local1];
														local545 = anIntArray737[local1 + 1];
														local7430 = Static232.aClass47_2.method888(local545);
														if (local7430.method375()) {
															aStringArray86[local3++] = Static16.aClass249_1.method5522(local540).method1861(local7430.aString2, local545);
														} else {
															anIntArray737[local1++] = Static16.aClass249_1.method5522(local540).method1852(local7430.anInt392, local545);
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
		} catch (@Pc(14049) Exception local14049) {
			@Pc(14067) StringBuffer local14067;
			if (arg0.aString8 == null) {
				local14067 = new StringBuffer(30);
				local14067.append("CS2: ").append(arg0.aLong207).append(" ");
				for (local540 = anInt6319 - 1; local540 >= 0; local540--) {
					local14067.append("v: ").append(aClass199Array1[local540].aClass1_Sub6_Sub1_1.aLong207).append(" ");
				}
				local14067.append("op: ").append(local13);
				Static62.method1006(local14049, local14067.toString());
			} else {
				Static118.method1733("Clientscript error in: " + arg0.aString8);
				local14067 = new StringBuffer(30);
				local14067.append("Clientscript error in: ").append(arg0.aString8).append("\n");
				for (local540 = anInt6319 - 1; local540 >= 0; local540--) {
					local14067.append("via: ").append(aClass199Array1[local540].aClass1_Sub6_Sub1_1.aString8).append("\n");
				}
				local14067.append("Op: ").append(local13).append("\n");
				local1724 = local14049.getMessage();
				if (local1724 != null && local1724.length() > 0) {
					local14067.append("Message: ").append(local1724).append("\n");
				}
				Static62.method1006(local14049, local14067.toString());
				Static192.method2752(local14067.toString());
			}
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
	private static void method5490(@OriginalArg(0) int arg0) {
		@Pc(3) Class117 local3 = Static13.method107(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class117[] local13 = Static286.aClass117ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class117[] local19 = Static137.aClass117ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static286.aClass117ArrayArray2[local9] = new Class117[local22];
			Static404.method4338(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static404.method4338(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!sa;I)V")
	private static void method5491(@OriginalArg(0) Class1_Sub39 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray34;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class1_Sub6_Sub1 local12 = Static152.method2306(local8);
		if (local12 == null) {
			return;
		}
		anIntArray738 = new int[local12.anInt733];
		@Pc(21) int local21 = 0;
		aStringArray85 = new String[local12.anInt732];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt5363;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt5360;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass117_16 == null ? -1 : arg0.aClass117_16.anInt3093;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt5362;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass117_16 == null ? -1 : arg0.aClass117_16.anInt3043;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass117_15 == null ? -1 : arg0.aClass117_15.anInt3093;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass117_15 == null ? -1 : arg0.aClass117_15.anInt3043;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt5364;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt5359;
				}
				anIntArray738[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString61;
				}
				aStringArray85[local27++] = local135;
			}
		}
		method5489(local12, arg1);
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V")
	private static void method5492(@OriginalArg(0) int arg0) {
		@Pc(3) Class117 local3 = Static13.method107(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class117[] local13 = Static286.aClass117ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class117[] local19 = Static137.aClass117ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static286.aClass117ArrayArray2[local9] = new Class117[local22];
			Static404.method4338(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static404.method4338(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method5493(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static284.anInt4919 == 0 && (Static357.aBoolean558 && !Static201.aBoolean347 || Static54.aBoolean102)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static240.aClass169_217.method3680(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static240.aClass169_217.method3680(0).length());
		} else if (local11.startsWith(Static240.aClass169_216.method3680(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static240.aClass169_216.method3680(0).length());
		} else if (local11.startsWith(Static330.aClass169_297.method3680(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static330.aClass169_297.method3680(0).length());
		} else if (local11.startsWith(Static191.aClass169_171.method3680(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static191.aClass169_171.method3680(0).length());
		} else if (local11.startsWith(Static249.aClass169_232.method3680(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static249.aClass169_232.method3680(0).length());
		} else if (local11.startsWith(Static67.aClass169_52.method3680(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static67.aClass169_52.method3680(0).length());
		} else if (local11.startsWith(Static293.aClass169_275.method3680(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static293.aClass169_275.method3680(0).length());
		} else if (local11.startsWith(Static386.aClass169_337.method3680(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static386.aClass169_337.method3680(0).length());
		} else if (local11.startsWith(Static118.aClass169_103.method3680(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static118.aClass169_103.method3680(0).length());
		} else if (local11.startsWith(Static294.aClass169_278.method3680(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static294.aClass169_278.method3680(0).length());
		} else if (local11.startsWith(Static330.aClass169_298.method3680(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static330.aClass169_298.method3680(0).length());
		} else if (local11.startsWith(Static160.aClass169_146.method3680(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static160.aClass169_146.method3680(0).length());
		} else if (Static48.anInt952 != 0) {
			if (local11.startsWith(Static240.aClass169_217.method3680(Static48.anInt952))) {
				local13 = 0;
				arg0 = arg0.substring(Static240.aClass169_217.method3680(Static48.anInt952).length());
			} else if (local11.startsWith(Static240.aClass169_216.method3680(Static48.anInt952))) {
				local13 = 1;
				arg0 = arg0.substring(Static240.aClass169_216.method3680(Static48.anInt952).length());
			} else if (local11.startsWith(Static330.aClass169_297.method3680(Static48.anInt952))) {
				local13 = 2;
				arg0 = arg0.substring(Static330.aClass169_297.method3680(Static48.anInt952).length());
			} else if (local11.startsWith(Static191.aClass169_171.method3680(Static48.anInt952))) {
				local13 = 3;
				arg0 = arg0.substring(Static191.aClass169_171.method3680(Static48.anInt952).length());
			} else if (local11.startsWith(Static249.aClass169_232.method3680(Static48.anInt952))) {
				local13 = 4;
				arg0 = arg0.substring(Static249.aClass169_232.method3680(Static48.anInt952).length());
			} else if (local11.startsWith(Static67.aClass169_52.method3680(Static48.anInt952))) {
				local13 = 5;
				arg0 = arg0.substring(Static67.aClass169_52.method3680(Static48.anInt952).length());
			} else if (local11.startsWith(Static293.aClass169_275.method3680(Static48.anInt952))) {
				local13 = 6;
				arg0 = arg0.substring(Static293.aClass169_275.method3680(Static48.anInt952).length());
			} else if (local11.startsWith(Static386.aClass169_337.method3680(Static48.anInt952))) {
				local13 = 7;
				arg0 = arg0.substring(Static386.aClass169_337.method3680(Static48.anInt952).length());
			} else if (local11.startsWith(Static118.aClass169_103.method3680(Static48.anInt952))) {
				local13 = 8;
				arg0 = arg0.substring(Static118.aClass169_103.method3680(Static48.anInt952).length());
			} else if (local11.startsWith(Static294.aClass169_278.method3680(Static48.anInt952))) {
				local13 = 9;
				arg0 = arg0.substring(Static294.aClass169_278.method3680(Static48.anInt952).length());
			} else if (local11.startsWith(Static330.aClass169_298.method3680(Static48.anInt952))) {
				local13 = 10;
				arg0 = arg0.substring(Static330.aClass169_298.method3680(Static48.anInt952).length());
			} else if (local11.startsWith(Static160.aClass169_146.method3680(Static48.anInt952))) {
				local13 = 11;
				arg0 = arg0.substring(Static160.aClass169_146.method3680(Static48.anInt952).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static117.aClass169_102.method3680(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static117.aClass169_102.method3680(0).length());
		} else if (local11.startsWith(Static373.aClass169_329.method3680(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static373.aClass169_329.method3680(0).length());
		} else if (local11.startsWith(Static119.aClass169_106.method3680(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static119.aClass169_106.method3680(0).length());
		} else if (local11.startsWith(Static161.aClass169_150.method3680(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static161.aClass169_150.method3680(0).length());
		} else if (local11.startsWith(Static277.aClass169_260.method3680(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static277.aClass169_260.method3680(0).length());
		} else if (Static48.anInt952 != 0) {
			if (local11.startsWith(Static117.aClass169_102.method3680(Static48.anInt952))) {
				local451 = 1;
				arg0 = arg0.substring(Static117.aClass169_102.method3680(Static48.anInt952).length());
			} else if (local11.startsWith(Static373.aClass169_329.method3680(Static48.anInt952))) {
				local451 = 2;
				arg0 = arg0.substring(Static373.aClass169_329.method3680(Static48.anInt952).length());
			} else if (local11.startsWith(Static119.aClass169_106.method3680(Static48.anInt952))) {
				local451 = 3;
				arg0 = arg0.substring(Static119.aClass169_106.method3680(Static48.anInt952).length());
			} else if (local11.startsWith(Static161.aClass169_150.method3680(Static48.anInt952))) {
				local451 = 4;
				arg0 = arg0.substring(Static161.aClass169_150.method3680(Static48.anInt952).length());
			} else if (local11.startsWith(Static277.aClass169_260.method3680(Static48.anInt952))) {
				local451 = 5;
				arg0 = arg0.substring(Static277.aClass169_260.method3680(Static48.anInt952).length());
			}
		}
		Static177.method1119(Static254.aClass48_153);
		Static209.aClass1_Sub33_Sub2_2.method5165(0);
		@Pc(646) int local646 = Static209.aClass1_Sub33_Sub2_2.lb;
		if (arg1 == 5021) {
			Static209.aClass1_Sub33_Sub2_2.method5165(1);
		} else {
			Static209.aClass1_Sub33_Sub2_2.method5165(0);
		}
		Static209.aClass1_Sub33_Sub2_2.method5165(local13);
		Static209.aClass1_Sub33_Sub2_2.method5165(local451);
		Static135.method2026(arg0, Static209.aClass1_Sub33_Sub2_2);
		Static209.aClass1_Sub33_Sub2_2.method5149(Static209.aClass1_Sub33_Sub2_2.lb - local646);
	}

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "(I)V")
	public static void method5494(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static345.method4878(arg0)) {
			return;
		}
		@Pc(12) Class117[] local12 = Static137.aClass117ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class117 local19 = local12[local14];
			if (local19.anObjectArray19 != null) {
				@Pc(26) Class1_Sub39 local26 = new Class1_Sub39();
				local26.aClass117_16 = local19;
				local26.anObjectArray34 = local19.anObjectArray19;
				method5491(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!sa;)V")
	public static void method5496(@OriginalArg(0) Class1_Sub39 arg0) {
		method5491(arg0, 200000);
	}

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "(I)Ljava/lang/String;")
	private static String method5497(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar2.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar2.get(5);
		@Pc(20) int local20 = aCalendar2.get(2);
		@Pc(24) int local24 = aCalendar2.get(1);
		return local16 + "-" + aStringArray87[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!sl;II)V")
	public static void method5498(@OriginalArg(0) Class213 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class1_Sub6_Sub1 local5 = Static134.method1983(arg1, arg2, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray738 = new int[local5.anInt733];
		aStringArray85 = new String[local5.anInt732];
		if (local5.aClass213_2 == Static360.aClass213_16 || local5.aClass213_2 == Static80.aClass213_5 || local5.aClass213_2 == Static298.aClass213_9) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static56.aClass117_1 != null) {
				local30 = Static56.aClass117_1.anInt3072;
				local32 = Static56.aClass117_1.anInt3104;
			}
			anIntArray738[0] = Static300.aClass182_1.method4112() - local30;
			anIntArray738[1] = Static300.aClass182_1.method4121() - local32;
		}
		method5489(local5, 200000);
	}
}
