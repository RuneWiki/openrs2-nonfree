import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "Lclient!ms;")
	private static Class155 aClass155_16;

	@OriginalMember(owner = "client!iq", name = "g", descriptor = "Lclient!ph;")
	private static Class178 aClass178_1;

	@OriginalMember(owner = "client!iq", name = "o", descriptor = "[I")
	private static int[] anIntArray320;

	@OriginalMember(owner = "client!iq", name = "r", descriptor = "Lclient!ms;")
	private static Class155 aClass155_17;

	@OriginalMember(owner = "client!iq", name = "v", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray16;

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "[[I")
	private static final int[][] anIntArrayArray11 = new int[5][5000];

	@OriginalMember(owner = "client!iq", name = "f", descriptor = "I")
	private static int anInt2799 = 0;

	@OriginalMember(owner = "client!iq", name = "m", descriptor = "[I")
	private static final int[] anIntArray319 = new int[5];

	@OriginalMember(owner = "client!iq", name = "p", descriptor = "[I")
	private static final int[] anIntArray321 = new int[1000];

	@OriginalMember(owner = "client!iq", name = "s", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray15 = new String[1000];

	@OriginalMember(owner = "client!iq", name = "u", descriptor = "[Lclient!er;")
	private static final Class66[] aClass66Array1 = new Class66[50];

	@OriginalMember(owner = "client!iq", name = "w", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!iq", name = "x", descriptor = "Lclient!mq;")
	public static final Class154 aClass154_16 = new Class154(4);

	@OriginalMember(owner = "client!iq", name = "y", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray17 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!iq", name = "z", descriptor = "[I")
	private static final int[] anIntArray322 = new int[3];

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!ni;I)V")
	private static void method2601(@OriginalArg(0) Class2_Sub1_Sub11 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray531;
		@Pc(11) int[] local11 = arg0.anIntArray530;
		@Pc(13) byte local13 = -1;
		anInt2799 = 0;
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
						anIntArray321[local1++] = local11[local5];
						continue;
					}
					@Pc(51) int local51;
					if (local31 == 1) {
						local51 = local11[local5];
						anIntArray321[local1++] = Static248.aClass125_1.anIntArray338[local51];
						continue;
					}
					if (local31 == 2) {
						local51 = local11[local5];
						local1--;
						Static248.aClass125_1.method2743(local51, anIntArray321[local1]);
						continue;
					}
					if (local31 == 3) {
						aStringArray15[local3++] = arg0.aStringArray29[local5];
						continue;
					}
					if (local31 == 6) {
						local5 += local11[local5];
						continue;
					}
					if (local31 == 7) {
						local1 -= 2;
						if (anIntArray321[local1] != anIntArray321[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 8) {
						local1 -= 2;
						if (anIntArray321[local1] == anIntArray321[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 9) {
						local1 -= 2;
						if (anIntArray321[local1] < anIntArray321[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 10) {
						local1 -= 2;
						if (anIntArray321[local1] > anIntArray321[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 21) {
						if (anInt2799 == 0) {
							return;
						}
						@Pc(192) Class66 local192 = aClass66Array1[--anInt2799];
						arg0 = local192.aClass2_Sub1_Sub11_1;
						local8 = arg0.anIntArray531;
						local11 = arg0.anIntArray530;
						local5 = local192.anInt1604;
						anIntArray320 = local192.anIntArray216;
						aStringArray16 = local192.aStringArray9;
						continue;
					}
					if (local31 == 25) {
						local51 = local11[local5];
						anIntArray321[local1++] = Static248.aClass125_1.method2733(local51);
						continue;
					}
					if (local31 == 27) {
						local51 = local11[local5];
						local1--;
						Static248.aClass125_1.method2737(local51, anIntArray321[local1]);
						continue;
					}
					if (local31 == 31) {
						local1 -= 2;
						if (anIntArray321[local1] <= anIntArray321[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 32) {
						local1 -= 2;
						if (anIntArray321[local1] >= anIntArray321[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 33) {
						anIntArray321[local1++] = anIntArray320[local11[local5]];
						continue;
					}
					@Pc(303) int local303;
					if (local31 == 34) {
						local303 = local11[local5];
						local1--;
						anIntArray320[local303] = anIntArray321[local1];
						continue;
					}
					if (local31 == 35) {
						aStringArray15[local3++] = aStringArray16[local11[local5]];
						continue;
					}
					if (local31 == 36) {
						local303 = local11[local5];
						local3--;
						aStringArray16[local303] = aStringArray15[local3];
						continue;
					}
					if (local31 == 37) {
						local51 = local11[local5];
						local3 -= local51;
						local352 = Static222.method3737(aStringArray15, local3, local51);
						aStringArray15[local3++] = local352;
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
						@Pc(379) Class2_Sub1_Sub11 local379 = Static284.method4382(local51);
						if (local379 == null) {
							throw new RuntimeException();
						}
						@Pc(389) int[] local389 = new int[local379.anInt4335];
						@Pc(393) String[] local393 = new String[local379.anInt4337];
						for (local395 = 0; local395 < local379.anInt4341; local395++) {
							local389[local395] = anIntArray321[local1 + local395 - local379.anInt4341];
						}
						for (local414 = 0; local414 < local379.anInt4338; local414++) {
							local393[local414] = aStringArray15[local3 + local414 - local379.anInt4338];
						}
						local1 -= local379.anInt4341;
						local3 -= local379.anInt4338;
						@Pc(445) Class66 local445 = new Class66();
						local445.aClass2_Sub1_Sub11_1 = arg0;
						local445.anInt1604 = local5;
						local445.anIntArray216 = anIntArray320;
						local445.aStringArray9 = aStringArray16;
						if (anInt2799 >= aClass66Array1.length) {
							throw new RuntimeException();
						}
						aClass66Array1[anInt2799++] = local445;
						arg0 = local379;
						local8 = local379.anIntArray531;
						local11 = local379.anIntArray530;
						local5 = -1;
						anIntArray320 = local389;
						aStringArray16 = local393;
						continue;
					}
					if (local31 == 42) {
						anIntArray321[local1++] = Static61.anIntArray162[local11[local5]];
						continue;
					}
					if (local31 == 43) {
						local51 = local11[local5];
						local1--;
						Static61.anIntArray162[local51] = anIntArray321[local1];
						Static168.method2731(local51);
						Static243.aBoolean331 |= Static267.aBooleanArray110[local51];
						continue;
					}
					if (local31 == 44) {
						local51 = local11[local5] >> 16;
						local540 = local11[local5] & 0xFFFF;
						local1--;
						local545 = anIntArray321[local1];
						if (local545 >= 0 && local545 <= 5000) {
							anIntArray319[local51] = local545;
							@Pc(560) byte local560 = -1;
							if (local540 == 105) {
								local560 = 0;
							}
							local395 = 0;
							while (true) {
								if (local395 >= local545) {
									continue label4494;
								}
								anIntArrayArray11[local51][local395] = local560;
								local395++;
							}
						}
						throw new RuntimeException();
					}
					if (local31 == 45) {
						local51 = local11[local5];
						local1--;
						local540 = anIntArray321[local1];
						if (local540 >= 0 && local540 < anIntArray319[local51]) {
							anIntArray321[local1++] = anIntArrayArray11[local51][local540];
							continue;
						}
						throw new RuntimeException();
					}
					if (local31 == 46) {
						local51 = local11[local5];
						local1 -= 2;
						local540 = anIntArray321[local1];
						if (local540 >= 0 && local540 < anIntArray319[local51]) {
							anIntArrayArray11[local51][local540] = anIntArray321[local1 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local31 == 47) {
						@Pc(655) String local655 = Static211.aStringArray22[local11[local5]];
						if (local655 == null) {
							local655 = "null";
						}
						aStringArray15[local3++] = local655;
						continue;
					}
					if (local31 == 48) {
						local51 = local11[local5];
						local3--;
						Static211.aStringArray22[local51] = aStringArray15[local3];
						Static340.method5226(local51);
						continue;
					}
					if (local31 == 51) {
						@Pc(693) Class214 local693 = arg0.aClass214Array1[local11[local5]];
						local1--;
						@Pc(703) Class2_Sub44 local703 = (Class2_Sub44) local693.method5059((long) anIntArray321[local1]);
						if (local703 != null) {
							local5 += local703.anInt6631;
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
				@Pc(856) Class155 local856;
				@Pc(754) Class155 local754;
				@Pc(923) Class155 local923;
				if (local31 < 300) {
					if (local31 == 100) {
						local1 -= 3;
						local540 = anIntArray321[local1];
						local545 = anIntArray321[local1 + 1];
						local744 = anIntArray321[local1 + 2];
						if (local545 == 0) {
							throw new RuntimeException();
						}
						local754 = Static240.method3886(local540);
						if (local754.aClass155Array2 == null) {
							local754.aClass155Array2 = new Class155[local744 + 1];
						}
						if (local754.aClass155Array2.length <= local744) {
							@Pc(773) Class155[] local773 = new Class155[local744 + 1];
							for (local775 = 0; local775 < local754.aClass155Array2.length; local775++) {
								local773[local775] = local754.aClass155Array2[local775];
							}
							local754.aClass155Array2 = local773;
						}
						if (local744 > 0 && local754.aClass155Array2[local744 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local744 - 1));
						}
						@Pc(818) Class155 local818 = new Class155();
						local818.anInt4164 = local545;
						local818.anInt4144 = local818.anInt4166 = local754.anInt4166;
						local818.anInt4135 = local744;
						local754.aClass155Array2[local744] = local818;
						if (local718) {
							aClass155_16 = local818;
						} else {
							aClass155_17 = local818;
						}
						Static295.method4664(local754);
						continue;
					}
					@Pc(877) Class155 local877;
					if (local31 == 101) {
						local856 = local718 ? aClass155_16 : aClass155_17;
						if (local856.anInt4135 == -1) {
							if (local718) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						local877 = Static240.method3886(local856.anInt4166);
						local877.aClass155Array2[local856.anInt4135] = null;
						Static295.method4664(local877);
						continue;
					}
					if (local31 == 102) {
						local1--;
						local856 = Static240.method3886(anIntArray321[local1]);
						local856.aClass155Array2 = null;
						Static295.method4664(local856);
						continue;
					}
					if (local31 == 200) {
						local1 -= 2;
						local540 = anIntArray321[local1];
						local545 = anIntArray321[local1 + 1];
						local923 = Static257.method5607(local545, local540);
						if (local923 != null && local545 != -1) {
							anIntArray321[local1++] = 1;
							if (local718) {
								aClass155_16 = local923;
							} else {
								aClass155_17 = local923;
							}
							continue;
						}
						anIntArray321[local1++] = 0;
						continue;
					}
					if (local31 == 201) {
						local1--;
						local540 = anIntArray321[local1];
						local877 = Static240.method3886(local540);
						if (local877 == null) {
							anIntArray321[local1++] = 0;
						} else {
							anIntArray321[local1++] = 1;
							if (local718) {
								aClass155_16 = local877;
							} else {
								aClass155_17 = local877;
							}
						}
						continue;
					}
				} else {
					@Pc(1073) boolean local1073;
					if (local31 < 500) {
						if (local31 == 403) {
							local1 -= 2;
							local540 = anIntArray321[local1];
							local545 = anIntArray321[local1 + 1];
							for (local744 = 0; local744 < Static31.anIntArray107.length; local744++) {
								if (Static31.anIntArray107[local744] == local540) {
									Static267.aClass12_Sub1_Sub2_Sub2_1.aClass247_1.method5688(local744, Static8.aClass40_1, local545);
									continue label4494;
								}
							}
							local395 = 0;
							while (true) {
								if (local395 >= Static233.anIntArray521.length) {
									continue label4494;
								}
								if (Static233.anIntArray521[local395] == local540) {
									Static267.aClass12_Sub1_Sub2_Sub2_1.aClass247_1.method5688(local395, Static8.aClass40_1, local545);
									continue label4494;
								}
								local395++;
							}
						}
						if (local31 == 404) {
							local1 -= 2;
							local540 = anIntArray321[local1];
							local545 = anIntArray321[local1 + 1];
							Static267.aClass12_Sub1_Sub2_Sub2_1.aClass247_1.method5693(local545, local540);
							continue;
						}
						if (local31 == 410) {
							local1--;
							local1073 = anIntArray321[local1] != 0;
							Static267.aClass12_Sub1_Sub2_Sub2_1.aClass247_1.method5694(local1073);
							continue;
						}
					} else {
						@Pc(1269) boolean local1269;
						if (local31 >= 1000 && local31 < 1100 || !(local31 < 2000 || local31 >= 2100)) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local856 = Static240.method3886(anIntArray321[local1]);
							} else {
								local856 = local718 ? aClass155_16 : aClass155_17;
							}
							if (local31 == 1000) {
								local1 -= 4;
								local856.anInt4169 = anIntArray321[local1];
								local856.anInt4200 = anIntArray321[local1 + 1];
								local545 = anIntArray321[local1 + 2];
								if (local545 < 0) {
									local545 = 0;
								} else if (local545 > 5) {
									local545 = 5;
								}
								local744 = anIntArray321[local1 + 3];
								if (local744 < 0) {
									local744 = 0;
								} else if (local744 > 5) {
									local744 = 5;
								}
								local856.aByte41 = (byte) local545;
								local856.aByte43 = (byte) local744;
								Static295.method4664(local856);
								Static287.method4402(local856);
								if (local856.anInt4135 == -1) {
									Static62.method1134(local856.anInt4166);
								}
								continue;
							}
							if (local31 == 1001) {
								local1 -= 4;
								local856.anInt4181 = anIntArray321[local1];
								local856.anInt4210 = anIntArray321[local1 + 1];
								local856.anInt4143 = 0;
								local856.anInt4173 = 0;
								local545 = anIntArray321[local1 + 2];
								if (local545 < 0) {
									local545 = 0;
								} else if (local545 > 4) {
									local545 = 4;
								}
								local744 = anIntArray321[local1 + 3];
								if (local744 < 0) {
									local744 = 0;
								} else if (local744 > 4) {
									local744 = 4;
								}
								local856.aByte42 = (byte) local545;
								local856.aByte40 = (byte) local744;
								Static295.method4664(local856);
								Static287.method4402(local856);
								if (local856.anInt4164 == 0) {
									Static13.method409(local856, false);
								}
								continue;
							}
							if (local31 == 1003) {
								local1--;
								local1269 = anIntArray321[local1] == 1;
								if (local856.aBoolean320 != local1269) {
									local856.aBoolean320 = local1269;
									Static295.method4664(local856);
								}
								if (local856.anInt4135 == -1) {
									Static194.method3167(local856.anInt4166);
								}
								continue;
							}
							if (local31 == 1004) {
								local1 -= 2;
								local856.anInt4147 = anIntArray321[local1];
								local856.anInt4161 = anIntArray321[local1 + 1];
								Static295.method4664(local856);
								Static287.method4402(local856);
								if (local856.anInt4164 == 0) {
									Static13.method409(local856, false);
								}
								continue;
							}
							if (local31 == 1005) {
								local1--;
								local856.aBoolean316 = anIntArray321[local1] == 1;
								continue;
							}
						} else if (local31 >= 1100 && local31 < 1200 || local31 >= 2100 && local31 < 2200) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local856 = Static240.method3886(anIntArray321[local1]);
							} else {
								local856 = local718 ? aClass155_16 : aClass155_17;
							}
							if (local31 == 1100) {
								local1 -= 2;
								local856.anInt4174 = anIntArray321[local1];
								if (local856.anInt4174 > local856.anInt4177 - local856.anInt4170) {
									local856.anInt4174 = local856.anInt4177 - local856.anInt4170;
								}
								if (local856.anInt4174 < 0) {
									local856.anInt4174 = 0;
								}
								local856.anInt4207 = anIntArray321[local1 + 1];
								if (local856.anInt4207 > local856.anInt4176 - local856.anInt4214) {
									local856.anInt4207 = local856.anInt4176 - local856.anInt4214;
								}
								if (local856.anInt4207 < 0) {
									local856.anInt4207 = 0;
								}
								Static295.method4664(local856);
								if (local856.anInt4135 == -1) {
									Static212.method3599(local856.anInt4166);
								}
								continue;
							}
							if (local31 == 1101) {
								local1--;
								local856.anInt4165 = anIntArray321[local1];
								Static295.method4664(local856);
								if (local856.anInt4135 == -1) {
									Static375.method3802(local856.anInt4166);
								}
								continue;
							}
							if (local31 == 1102) {
								local1--;
								local856.aBoolean313 = anIntArray321[local1] == 1;
								Static295.method4664(local856);
								continue;
							}
							if (local31 == 1103) {
								local1--;
								local856.anInt4187 = anIntArray321[local1];
								Static295.method4664(local856);
								continue;
							}
							if (local31 == 1104) {
								local1--;
								local856.anInt4138 = anIntArray321[local1];
								Static295.method4664(local856);
								continue;
							}
							if (local31 == 1105) {
								local1--;
								local545 = anIntArray321[local1];
								if (local856.anInt4168 != local545) {
									local856.anInt4168 = local545;
									Static295.method4664(local856);
								}
								if (local856.anInt4135 == -1) {
									Static300.method4718(local856.anInt4166);
								}
								continue;
							}
							if (local31 == 1106) {
								local1--;
								local856.anInt4190 = anIntArray321[local1];
								Static295.method4664(local856);
								continue;
							}
							if (local31 == 1107) {
								local1--;
								local856.aBoolean317 = anIntArray321[local1] == 1;
								Static295.method4664(local856);
								continue;
							}
							if (local31 == 1108) {
								local856.anInt4188 = 1;
								local1--;
								local856.anInt4193 = anIntArray321[local1];
								Static295.method4664(local856);
								if (local856.anInt4135 == -1) {
									Static161.method2687(local856.anInt4166);
								}
								continue;
							}
							if (local31 == 1109) {
								local1 -= 6;
								local856.anInt4167 = anIntArray321[local1];
								local856.anInt4134 = anIntArray321[local1 + 1];
								local856.anInt4151 = anIntArray321[local1 + 2];
								local856.lb = anIntArray321[local1 + 3];
								local856.anInt4199 = anIntArray321[local1 + 4];
								local856.anInt4180 = anIntArray321[local1 + 5];
								Static295.method4664(local856);
								if (local856.anInt4135 == -1) {
									Static235.method3845(local856.anInt4166);
									Static83.method1467(local856.anInt4166);
								}
								continue;
							}
							if (local31 == 1110) {
								local1--;
								local545 = anIntArray321[local1];
								if (local856.anInt4178 != local545) {
									local856.anInt4178 = local545;
									local856.anInt4203 = 0;
									local856.anInt4192 = 1;
									local856.anInt4133 = 0;
									Static295.method4664(local856);
								}
								if (local856.anInt4135 == -1) {
									Static347.method5290(local856.anInt4166);
								}
								continue;
							}
							if (local31 == 1111) {
								local1--;
								local856.aBoolean314 = anIntArray321[local1] == 1;
								Static295.method4664(local856);
								continue;
							}
							if (local31 == 1112) {
								local3--;
								local1702 = aStringArray15[local3];
								if (!local1702.equals(local856.aString37)) {
									local856.aString37 = local1702;
									Static295.method4664(local856);
								}
								if (local856.anInt4135 == -1) {
									Static246.method3925(local856.anInt4166);
								}
								continue;
							}
							if (local31 == 1113) {
								local1--;
								local856.anInt4194 = anIntArray321[local1];
								Static295.method4664(local856);
								if (local856.anInt4135 == -1) {
									Static10.method373(local856.anInt4166);
								}
								continue;
							}
							if (local31 == 1114) {
								local1 -= 3;
								local856.anInt4157 = anIntArray321[local1];
								local856.anInt4182 = anIntArray321[local1 + 1];
								local856.anInt4162 = anIntArray321[local1 + 2];
								Static295.method4664(local856);
								continue;
							}
							if (local31 == 1115) {
								local1--;
								local856.aBoolean319 = anIntArray321[local1] == 1;
								Static295.method4664(local856);
								continue;
							}
							if (local31 == 1116) {
								local1--;
								local856.anInt4148 = anIntArray321[local1];
								Static295.method4664(local856);
								continue;
							}
							if (local31 == 1117) {
								local1--;
								local856.anInt4142 = anIntArray321[local1];
								Static295.method4664(local856);
								continue;
							}
							if (local31 == 1118) {
								local1--;
								local856.aBoolean324 = anIntArray321[local1] == 1;
								Static295.method4664(local856);
								continue;
							}
							if (local31 == 1119) {
								local1--;
								local856.aBoolean323 = anIntArray321[local1] == 1;
								Static295.method4664(local856);
								continue;
							}
							if (local31 == 1120) {
								local1 -= 2;
								local856.anInt4177 = anIntArray321[local1];
								local856.anInt4176 = anIntArray321[local1 + 1];
								Static295.method4664(local856);
								if (local856.anInt4164 == 0) {
									Static13.method409(local856, false);
								}
								continue;
							}
							if (local31 == 1121) {
								local1 -= 2;
								local856.aShort65 = (short) anIntArray321[local1];
								local856.aShort64 = (short) anIntArray321[local1 + 1];
								Static295.method4664(local856);
								continue;
							}
							if (local31 == 1122) {
								local1--;
								local856.aBoolean311 = anIntArray321[local1] == 1;
								Static295.method4664(local856);
								continue;
							}
							if (local31 == 1123) {
								local1--;
								local856.anInt4180 = anIntArray321[local1];
								Static295.method4664(local856);
								if (local856.anInt4135 == -1) {
									Static235.method3845(local856.anInt4166);
								}
								continue;
							}
							if (local31 == 1124) {
								local1--;
								local545 = anIntArray321[local1];
								local856.aBoolean312 = local545 == 1;
								Static295.method4664(local856);
								continue;
							}
							if (local31 == 1125) {
								local1 -= 2;
								local856.anInt4202 = anIntArray321[local1];
								local856.anInt4139 = anIntArray321[local1 + 1];
								Static295.method4664(local856);
								continue;
							}
						} else if (local31 >= 1200 && local31 < 1300 || !(local31 < 2200 || local31 >= 2300)) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local856 = Static240.method3886(anIntArray321[local1]);
							} else {
								local856 = local718 ? aClass155_16 : aClass155_17;
							}
							Static295.method4664(local856);
							if (local31 == 1200 || local31 == 1205 || local31 == 1208 || local31 == 1209 || local31 == 1212 || local31 == 1213) {
								local1 -= 2;
								local545 = anIntArray321[local1];
								local744 = anIntArray321[local1 + 1];
								if (local856.anInt4135 == -1) {
									Static181.method2928(local856.anInt4166);
									Static235.method3845(local856.anInt4166);
									Static83.method1467(local856.anInt4166);
								}
								if (local545 == -1) {
									local856.anInt4188 = 1;
									local856.anInt4193 = -1;
									local856.anInt4212 = -1;
									continue;
								}
								local856.anInt4212 = local545;
								local856.anInt4204 = local744;
								if (local31 == 1208 || local31 == 1209) {
									local856.aBoolean321 = true;
								} else {
									local856.aBoolean321 = false;
								}
								@Pc(2093) Class117 local2093 = Static106.aClass250_1.method5735(local545);
								local856.anInt4151 = local2093.anInt2852;
								local856.lb = local2093.anInt2863;
								local856.anInt4199 = local2093.anInt2861;
								local856.anInt4167 = local2093.anInt2836;
								local856.anInt4134 = local2093.anInt2866;
								local856.anInt4180 = local2093.anInt2885;
								if (local31 == 1205 || local31 == 1209) {
									local856.anInt4145 = 0;
								} else if (local31 == 1212 || local31 == 1213) {
									local856.anInt4145 = 1;
								} else {
									local856.anInt4145 = 2;
								}
								if (local856.anInt4143 > 0) {
									local856.anInt4180 = local856.anInt4180 * 32 / local856.anInt4143;
								} else if (local856.anInt4181 > 0) {
									local856.anInt4180 = local856.anInt4180 * 32 / local856.anInt4181;
								}
								continue;
							}
							if (local31 == 1201) {
								local856.anInt4188 = 2;
								local1--;
								local856.anInt4193 = anIntArray321[local1];
								if (local856.anInt4135 == -1) {
									Static161.method2687(local856.anInt4166);
								}
								continue;
							}
							if (local31 == 1202) {
								local856.anInt4188 = 3;
								local856.anInt4193 = -1;
								if (local856.anInt4135 == -1) {
									Static161.method2687(local856.anInt4166);
								}
								continue;
							}
							if (local31 == 1203) {
								local856.anInt4188 = 6;
								local1--;
								local856.anInt4193 = anIntArray321[local1];
								if (local856.anInt4135 == -1) {
									Static161.method2687(local856.anInt4166);
								}
								continue;
							}
							if (local31 == 1204) {
								local856.anInt4188 = 5;
								local1--;
								local856.anInt4193 = anIntArray321[local1];
								if (local856.anInt4135 == -1) {
									Static161.method2687(local856.anInt4166);
								}
								continue;
							}
							if (local31 == 1206) {
								local1 -= 4;
								local856.anInt4172 = anIntArray321[local1];
								local856.anInt4198 = anIntArray321[local1 + 1];
								local856.anInt4136 = anIntArray321[local1 + 2];
								local856.anInt4179 = anIntArray321[local1 + 3];
								Static295.method4664(local856);
								continue;
							}
							if (local31 == 1207) {
								local1 -= 2;
								local856.anInt4152 = anIntArray321[local1];
								local856.anInt4156 = anIntArray321[local1 + 1];
								Static295.method4664(local856);
								continue;
							}
							if (local31 == 1210) {
								local1 -= 4;
								local856.anInt4193 = anIntArray321[local1];
								local856.anInt4140 = anIntArray321[local1 + 1];
								if (anIntArray321[local1 + 2] == 1) {
									local856.anInt4188 = 9;
								} else {
									local856.anInt4188 = 8;
								}
								if (anIntArray321[local1 + 3] == 1) {
									local856.aBoolean321 = true;
								} else {
									local856.aBoolean321 = false;
								}
								if (local856.anInt4135 == -1) {
									Static161.method2687(local856.anInt4166);
								}
								continue;
							}
							if (local31 == 1211) {
								local856.anInt4188 = 5;
								local856.anInt4193 = Static194.anInt3441;
								local856.anInt4140 = 0;
								if (local856.anInt4135 == -1) {
									Static161.method2687(local856.anInt4166);
								}
								continue;
							}
						} else if (local31 >= 1300 && local31 < 1400 || local31 >= 2300 && local31 < 2400) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local856 = Static240.method3886(anIntArray321[local1]);
							} else {
								local856 = local718 ? aClass155_16 : aClass155_17;
							}
							if (local31 == 1300) {
								local1--;
								local545 = anIntArray321[local1] - 1;
								if (local545 >= 0 && local545 <= 9) {
									local3--;
									local856.method3762(local545, aStringArray15[local3]);
									continue;
								}
								local3--;
								continue;
							}
							if (local31 == 1301) {
								local1 -= 2;
								local545 = anIntArray321[local1];
								local744 = anIntArray321[local1 + 1];
								local856.aClass155_25 = Static257.method5607(local744, local545);
								continue;
							}
							if (local31 == 1302) {
								local1--;
								local545 = anIntArray321[local1];
								if (local545 == Static351.anInt1771 || local545 == Static383.anInt6646 || local545 == Static52.anInt3690) {
									local856.anInt4211 = local545;
								}
								continue;
							}
							if (local31 == 1303) {
								local1--;
								local856.anInt4159 = anIntArray321[local1];
								continue;
							}
							if (local31 == 1304) {
								local1--;
								local856.anInt4149 = anIntArray321[local1];
								continue;
							}
							if (local31 == 1305) {
								local3--;
								local856.aString36 = aStringArray15[local3];
								continue;
							}
							if (local31 == 1306) {
								local3--;
								local856.aString38 = aStringArray15[local3];
								continue;
							}
							if (local31 == 1307) {
								local856.aStringArray26 = null;
								continue;
							}
							if (local31 == 1308) {
								local1--;
								local856.anInt4158 = anIntArray321[local1];
								local1--;
								local856.anInt4153 = anIntArray321[local1];
								continue;
							}
							if (local31 == 1309) {
								local1--;
								local545 = anIntArray321[local1];
								local1--;
								local744 = anIntArray321[local1];
								if (local744 >= 1 && local744 <= 10) {
									local856.method3770(local744 - 1, local545);
								}
								continue;
							}
							if (local31 == 1310) {
								local3--;
								local856.aString39 = aStringArray15[local3];
								continue;
							}
							if (local31 == 1311) {
								local1--;
								local856.anInt4146 = anIntArray321[local1];
								continue;
							}
						} else {
							if (local31 >= 1400 && local31 < 1500 || local31 >= 2400 && local31 < 2500) {
								if (local31 >= 2000) {
									local31 -= 1000;
									local1--;
									local856 = Static240.method3886(anIntArray321[local1]);
								} else {
									local856 = local718 ? aClass155_16 : aClass155_17;
								}
								local3--;
								local1702 = aStringArray15[local3];
								@Pc(2620) int[] local2620 = null;
								if (local1702.length() > 0 && local1702.charAt(local1702.length() - 1) == 'Y') {
									local1--;
									local395 = anIntArray321[local1];
									if (local395 > 0) {
										local2620 = new int[local395];
										while (local395-- > 0) {
											local1--;
											local2620[local395] = anIntArray321[local1];
										}
									}
									local1702 = local1702.substring(0, local1702.length() - 1);
								}
								@Pc(2666) Object[] local2666 = new Object[local1702.length() + 1];
								for (local414 = local2666.length - 1; local414 >= 1; local414--) {
									if (local1702.charAt(local414 - 1) == 's') {
										local3--;
										local2666[local414] = aStringArray15[local3];
									} else {
										local1--;
										local2666[local414] = Integer.valueOf(anIntArray321[local1]);
									}
								}
								local1--;
								local775 = anIntArray321[local1];
								if (local775 == -1) {
									local2666 = null;
								} else {
									local2666[0] = Integer.valueOf(local775);
								}
								if (local31 == 1400) {
									local856.anObjectArray25 = local2666;
								} else if (local31 == 1401) {
									local856.anObjectArray28 = local2666;
								} else if (local31 == 1402) {
									local856.anObjectArray29 = local2666;
								} else if (local31 == 1403) {
									local856.anObjectArray17 = local2666;
								} else if (local31 == 1404) {
									local856.anObjectArray20 = local2666;
								} else if (local31 == 1405) {
									local856.anObjectArray9 = local2666;
								} else if (local31 == 1406) {
									local856.anObjectArray15 = local2666;
								} else if (local31 == 1407) {
									local856.anObjectArray35 = local2666;
									local856.anIntArray512 = local2620;
								} else if (local31 == 1408) {
									local856.anObjectArray23 = local2666;
								} else if (local31 == 1409) {
									local856.anObjectArray34 = local2666;
								} else if (local31 == 1410) {
									local856.anObjectArray22 = local2666;
								} else if (local31 == 1411) {
									local856.anObjectArray18 = local2666;
								} else if (local31 == 1412) {
									local856.anObjectArray27 = local2666;
								} else if (local31 == 1414) {
									local856.anObjectArray33 = local2666;
									local856.anIntArray510 = local2620;
								} else if (local31 == 1415) {
									local856.anObjectArray8 = local2666;
									local856.anIntArray508 = local2620;
								} else if (local31 == 1416) {
									local856.anObjectArray7 = local2666;
								} else if (local31 == 1417) {
									local856.anObjectArray31 = local2666;
								} else if (local31 == 1418) {
									local856.anObjectArray10 = local2666;
								} else if (local31 == 1419) {
									local856.anObjectArray21 = local2666;
								} else if (local31 == 1420) {
									local856.anObjectArray24 = local2666;
								} else if (local31 == 1421) {
									local856.anObjectArray26 = local2666;
								} else if (local31 == 1422) {
									local856.anObjectArray16 = local2666;
								} else if (local31 == 1423) {
									local856.anObjectArray6 = local2666;
								} else if (local31 == 1424) {
									local856.anObjectArray13 = local2666;
								} else if (local31 == 1425) {
									local856.anObjectArray32 = local2666;
								} else if (local31 == 1426) {
									local856.anObjectArray11 = local2666;
								} else if (local31 == 1427) {
									local856.anObjectArray14 = local2666;
								} else if (local31 == 1428) {
									local856.anObjectArray19 = local2666;
									local856.anIntArray507 = local2620;
								} else if (local31 == 1429) {
									local856.anObjectArray30 = local2666;
									local856.anIntArray509 = local2620;
								}
								local856.aBoolean315 = true;
								continue;
							}
							if (local31 < 1600) {
								local856 = local718 ? aClass155_16 : aClass155_17;
								if (local31 == 1500) {
									anIntArray321[local1++] = local856.anInt4189;
									continue;
								}
								if (local31 == 1501) {
									anIntArray321[local1++] = local856.anInt4206;
									continue;
								}
								if (local31 == 1502) {
									anIntArray321[local1++] = local856.anInt4170;
									continue;
								}
								if (local31 == 1503) {
									anIntArray321[local1++] = local856.anInt4214;
									continue;
								}
								if (local31 == 1504) {
									anIntArray321[local1++] = local856.aBoolean320 ? 1 : 0;
									continue;
								}
								if (local31 == 1505) {
									anIntArray321[local1++] = local856.anInt4144;
									continue;
								}
							} else if (local31 < 1700) {
								local856 = local718 ? aClass155_16 : aClass155_17;
								if (local31 == 1600) {
									anIntArray321[local1++] = local856.anInt4174;
									continue;
								}
								if (local31 == 1601) {
									anIntArray321[local1++] = local856.anInt4207;
									continue;
								}
								if (local31 == 1602) {
									aStringArray15[local3++] = local856.aString37;
									continue;
								}
								if (local31 == 1603) {
									anIntArray321[local1++] = local856.anInt4177;
									continue;
								}
								if (local31 == 1604) {
									anIntArray321[local1++] = local856.anInt4176;
									continue;
								}
								if (local31 == 1605) {
									anIntArray321[local1++] = local856.anInt4180;
									continue;
								}
								if (local31 == 1606) {
									anIntArray321[local1++] = local856.anInt4151;
									continue;
								}
								if (local31 == 1607) {
									anIntArray321[local1++] = local856.anInt4199;
									continue;
								}
								if (local31 == 1608) {
									anIntArray321[local1++] = local856.lb;
									continue;
								}
								if (local31 == 1609) {
									anIntArray321[local1++] = local856.anInt4187;
									continue;
								}
								if (local31 == 1610) {
									anIntArray321[local1++] = local856.anInt4167;
									continue;
								}
								if (local31 == 1611) {
									anIntArray321[local1++] = local856.anInt4134;
									continue;
								}
								if (local31 == 1612) {
									anIntArray321[local1++] = local856.anInt4168;
									continue;
								}
							} else if (local31 < 1800) {
								local856 = local718 ? aClass155_16 : aClass155_17;
								if (local31 == 1700) {
									anIntArray321[local1++] = local856.anInt4212;
									continue;
								}
								if (local31 == 1701) {
									if (local856.anInt4212 == -1) {
										anIntArray321[local1++] = 0;
									} else {
										anIntArray321[local1++] = local856.anInt4204;
									}
									continue;
								}
								if (local31 == 1702) {
									anIntArray321[local1++] = local856.anInt4135;
									continue;
								}
							} else if (local31 < 1900) {
								local856 = local718 ? aClass155_16 : aClass155_17;
								if (local31 == 1800) {
									anIntArray321[local1++] = Static41.method878(local856).method5123();
									continue;
								}
								if (local31 == 1801) {
									local1--;
									local545 = anIntArray321[local1];
									local545--;
									if (local856.aStringArray26 != null && local545 < local856.aStringArray26.length && local856.aStringArray26[local545] != null) {
										aStringArray15[local3++] = local856.aStringArray26[local545];
										continue;
									}
									aStringArray15[local3++] = "";
									continue;
								}
								if (local31 == 1802) {
									if (local856.aString36 == null) {
										aStringArray15[local3++] = "";
									} else {
										aStringArray15[local3++] = local856.aString36;
									}
									continue;
								}
							} else if (local31 < 2600) {
								local1--;
								local856 = Static240.method3886(anIntArray321[local1]);
								if (local31 == 2500) {
									anIntArray321[local1++] = local856.anInt4189;
									continue;
								}
								if (local31 == 2501) {
									anIntArray321[local1++] = local856.anInt4206;
									continue;
								}
								if (local31 == 2502) {
									anIntArray321[local1++] = local856.anInt4170;
									continue;
								}
								if (local31 == 2503) {
									anIntArray321[local1++] = local856.anInt4214;
									continue;
								}
								if (local31 == 2504) {
									anIntArray321[local1++] = local856.aBoolean320 ? 1 : 0;
									continue;
								}
								if (local31 == 2505) {
									anIntArray321[local1++] = local856.anInt4144;
									continue;
								}
							} else if (local31 < 2700) {
								local1--;
								local856 = Static240.method3886(anIntArray321[local1]);
								if (local31 == 2600) {
									anIntArray321[local1++] = local856.anInt4174;
									continue;
								}
								if (local31 == 2601) {
									anIntArray321[local1++] = local856.anInt4207;
									continue;
								}
								if (local31 == 2602) {
									aStringArray15[local3++] = local856.aString37;
									continue;
								}
								if (local31 == 2603) {
									anIntArray321[local1++] = local856.anInt4177;
									continue;
								}
								if (local31 == 2604) {
									anIntArray321[local1++] = local856.anInt4176;
									continue;
								}
								if (local31 == 2605) {
									anIntArray321[local1++] = local856.anInt4180;
									continue;
								}
								if (local31 == 2606) {
									anIntArray321[local1++] = local856.anInt4151;
									continue;
								}
								if (local31 == 2607) {
									anIntArray321[local1++] = local856.anInt4199;
									continue;
								}
								if (local31 == 2608) {
									anIntArray321[local1++] = local856.lb;
									continue;
								}
								if (local31 == 2609) {
									anIntArray321[local1++] = local856.anInt4187;
									continue;
								}
								if (local31 == 2610) {
									anIntArray321[local1++] = local856.anInt4167;
									continue;
								}
								if (local31 == 2611) {
									anIntArray321[local1++] = local856.anInt4134;
									continue;
								}
								if (local31 == 2612) {
									anIntArray321[local1++] = local856.anInt4168;
									continue;
								}
							} else {
								@Pc(3638) Class2_Sub41 local3638;
								@Pc(3554) Class2_Sub41 local3554;
								if (local31 < 2800) {
									if (local31 == 2700) {
										local1--;
										local856 = Static240.method3886(anIntArray321[local1]);
										anIntArray321[local1++] = local856.anInt4212;
										continue;
									}
									if (local31 == 2701) {
										local1--;
										local856 = Static240.method3886(anIntArray321[local1]);
										if (local856.anInt4212 == -1) {
											anIntArray321[local1++] = 0;
										} else {
											anIntArray321[local1++] = local856.anInt4204;
										}
										continue;
									}
									if (local31 == 2702) {
										local1--;
										local540 = anIntArray321[local1];
										local3554 = (Class2_Sub41) Static362.aClass214_32.method5059((long) local540);
										if (local3554 == null) {
											anIntArray321[local1++] = 0;
										} else {
											anIntArray321[local1++] = 1;
										}
										continue;
									}
									if (local31 == 2703) {
										local1--;
										local856 = Static240.method3886(anIntArray321[local1]);
										if (local856.aClass155Array2 == null) {
											anIntArray321[local1++] = 0;
											continue;
										}
										local545 = local856.aClass155Array2.length;
										for (local744 = 0; local744 < local856.aClass155Array2.length; local744++) {
											if (local856.aClass155Array2[local744] == null) {
												local545 = local744;
												break;
											}
										}
										anIntArray321[local1++] = local545;
										continue;
									}
									if (local31 == 2704 || local31 == 2705) {
										local1 -= 2;
										local540 = anIntArray321[local1];
										local545 = anIntArray321[local1 + 1];
										local3638 = (Class2_Sub41) Static362.aClass214_32.method5059((long) local540);
										if (local3638 != null && local3638.anInt6411 == local545) {
											anIntArray321[local1++] = 1;
											continue;
										}
										anIntArray321[local1++] = 0;
										continue;
									}
								} else if (local31 < 2900) {
									local1--;
									local856 = Static240.method3886(anIntArray321[local1]);
									if (local31 == 2800) {
										anIntArray321[local1++] = Static41.method878(local856).method5123();
										continue;
									}
									if (local31 == 2801) {
										local1--;
										local545 = anIntArray321[local1];
										local545--;
										if (local856.aStringArray26 != null && local545 < local856.aStringArray26.length && local856.aStringArray26[local545] != null) {
											aStringArray15[local3++] = local856.aStringArray26[local545];
											continue;
										}
										aStringArray15[local3++] = "";
										continue;
									}
									if (local31 == 2802) {
										if (local856.aString36 == null) {
											aStringArray15[local3++] = "";
										} else {
											aStringArray15[local3++] = local856.aString36;
										}
										continue;
									}
								} else if (local31 < 3200) {
									if (local31 == 3100) {
										local3--;
										local352 = aStringArray15[local3];
										Static366.method5530(local352);
										continue;
									}
									if (local31 == 3101) {
										local1 -= 2;
										Static189.method4513(anIntArray321[local1], anIntArray321[local1 + 1], Static267.aClass12_Sub1_Sub2_Sub2_1);
										continue;
									}
									if (local31 == 3103) {
										Static221.method3736();
										continue;
									}
									if (local31 == 3104) {
										local3--;
										local352 = aStringArray15[local3];
										local545 = 0;
										if (Static225.method3769(local352)) {
											local545 = Static319.method4935(local352);
										}
										Static19.method552(Static208.aClass41_117);
										Static39.aClass2_Sub13_Sub2_4.method4218(local545);
										continue;
									}
									if (local31 == 3105) {
										local3--;
										local352 = aStringArray15[local3];
										Static19.method552(Static385.aClass41_206);
										Static39.aClass2_Sub13_Sub2_4.method4207(local352.length() + 1);
										Static39.aClass2_Sub13_Sub2_4.method4230(local352);
										continue;
									}
									if (local31 == 3106) {
										local3--;
										local352 = aStringArray15[local3];
										Static19.method552(Static214.aClass41_122);
										Static39.aClass2_Sub13_Sub2_4.method4207(local352.length() + 1);
										Static39.aClass2_Sub13_Sub2_4.method4230(local352);
										continue;
									}
									if (local31 == 3107) {
										local1--;
										local540 = anIntArray321[local1];
										local3--;
										local1702 = aStringArray15[local3];
										Static2.method3450(local1702, local540);
										continue;
									}
									if (local31 == 3108) {
										local1 -= 3;
										local540 = anIntArray321[local1];
										local545 = anIntArray321[local1 + 1];
										local744 = anIntArray321[local1 + 2];
										local754 = Static240.method3886(local744);
										Static389.method5722(local754, local545, local540);
										continue;
									}
									if (local31 == 3109) {
										local1 -= 2;
										local540 = anIntArray321[local1];
										local545 = anIntArray321[local1 + 1];
										local923 = local718 ? aClass155_16 : aClass155_17;
										Static389.method5722(local923, local545, local540);
										continue;
									}
									if (local31 == 3110) {
										local1--;
										local540 = anIntArray321[local1];
										Static19.method552(Static267.aClass41_142);
										Static39.aClass2_Sub13_Sub2_4.method4199(local540);
										continue;
									}
									if (local31 == 3111) {
										local1 -= 2;
										local540 = anIntArray321[local1];
										local545 = anIntArray321[local1 + 1];
										local3638 = (Class2_Sub41) Static362.aClass214_32.method5059((long) local540);
										if (local3638 != null) {
											Static303.method4757(local3638, local3638.anInt6411 != local545, true);
										}
										Static273.method4282(local540, 3, true, local545);
										continue;
									}
									if (local31 == 3112) {
										local1--;
										local540 = anIntArray321[local1];
										local3554 = (Class2_Sub41) Static362.aClass214_32.method5059((long) local540);
										if (local3554 != null && local3554.anInt6413 == 3) {
											Static303.method4757(local3554, true, true);
										}
										continue;
									}
								} else if (local31 < 3300) {
									if (local31 == 3200) {
										local1 -= 3;
										Static134.method2336(anIntArray321[local1 + 2], 255, anIntArray321[local1], anIntArray321[local1 + 1]);
										continue;
									}
									if (local31 == 3201) {
										local1--;
										Static138.method2406(anIntArray321[local1], 255);
										continue;
									}
									if (local31 == 3202) {
										local1 -= 2;
										Static129.method2300(anIntArray321[local1], anIntArray321[local1 + 1], 255);
										continue;
									}
								} else if (local31 < 3400) {
									if (local31 == 3300) {
										anIntArray321[local1++] = Static295.anInt5281;
										continue;
									}
									if (local31 == 3301) {
										local1 -= 2;
										local540 = anIntArray321[local1];
										local545 = anIntArray321[local1 + 1];
										anIntArray321[local1++] = Static136.method2379(local545, local540, false);
										continue;
									}
									if (local31 == 3302) {
										local1 -= 2;
										local540 = anIntArray321[local1];
										local545 = anIntArray321[local1 + 1];
										anIntArray321[local1++] = Static335.method5124(false, local540, local545);
										continue;
									}
									if (local31 == 3303) {
										local1 -= 2;
										local540 = anIntArray321[local1];
										local545 = anIntArray321[local1 + 1];
										anIntArray321[local1++] = Static5.method5742(false, local545, local540);
										continue;
									}
									if (local31 == 3304) {
										local1--;
										local540 = anIntArray321[local1];
										anIntArray321[local1++] = Static161.aClass185_1.method4412(local540).anInt3240;
										continue;
									}
									if (local31 == 3305) {
										local1--;
										local540 = anIntArray321[local1];
										anIntArray321[local1++] = Static335.anIntArray713[local540];
										continue;
									}
									if (local31 == 3306) {
										local1--;
										local540 = anIntArray321[local1];
										anIntArray321[local1++] = Static348.anIntArray743[local540];
										continue;
									}
									if (local31 == 3307) {
										local1--;
										local540 = anIntArray321[local1];
										anIntArray321[local1++] = Static212.anIntArray484[local540];
										continue;
									}
									if (local31 == 3308) {
										@Pc(4226) byte local4226 = Static267.aClass12_Sub1_Sub2_Sub2_1.aByte74;
										local545 = (Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6328 >> 7) + Static376.anInt6607;
										local744 = (Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6317 >> 7) + Static133.anInt2474;
										anIntArray321[local1++] = (local4226 << 28) + (local545 << 14) + local744;
										continue;
									}
									if (local31 == 3309) {
										local1--;
										local540 = anIntArray321[local1];
										anIntArray321[local1++] = local540 >> 14 & 0x3FFF;
										continue;
									}
									if (local31 == 3310) {
										local1--;
										local540 = anIntArray321[local1];
										anIntArray321[local1++] = local540 >> 28;
										continue;
									}
									if (local31 == 3311) {
										local1--;
										local540 = anIntArray321[local1];
										anIntArray321[local1++] = local540 & 0x3FFF;
										continue;
									}
									if (local31 == 3312) {
										anIntArray321[local1++] = Static6.aBoolean4 ? 1 : 0;
										continue;
									}
									if (local31 == 3313) {
										local1 -= 2;
										local540 = anIntArray321[local1];
										local545 = anIntArray321[local1 + 1];
										anIntArray321[local1++] = Static136.method2379(local545, local540, true);
										continue;
									}
									if (local31 == 3314) {
										local1 -= 2;
										local540 = anIntArray321[local1];
										local545 = anIntArray321[local1 + 1];
										anIntArray321[local1++] = Static335.method5124(true, local540, local545);
										continue;
									}
									if (local31 == 3315) {
										local1 -= 2;
										local540 = anIntArray321[local1];
										local545 = anIntArray321[local1 + 1];
										anIntArray321[local1++] = Static5.method5742(true, local545, local540);
										continue;
									}
									if (local31 == 3316) {
										if (Static287.anInt5112 >= 2) {
											anIntArray321[local1++] = Static287.anInt5112;
										} else {
											anIntArray321[local1++] = 0;
										}
										continue;
									}
									if (local31 == 3317) {
										anIntArray321[local1++] = Static90.anInt1710;
										continue;
									}
									if (local31 == 3318) {
										anIntArray321[local1++] = Static259.anInt4618;
										continue;
									}
									if (local31 == 3321) {
										anIntArray321[local1++] = Static384.anInt6676;
										continue;
									}
									if (local31 == 3322) {
										anIntArray321[local1++] = Static386.anInt1406;
										continue;
									}
									if (local31 == 3323) {
										if (Static338.anInt5998 >= 5 && Static338.anInt5998 <= 9) {
											anIntArray321[local1++] = 1;
											continue;
										}
										anIntArray321[local1++] = 0;
										continue;
									}
									if (local31 == 3324) {
										if (Static338.anInt5998 >= 5 && Static338.anInt5998 <= 9) {
											anIntArray321[local1++] = Static338.anInt5998;
											continue;
										}
										anIntArray321[local1++] = 0;
										continue;
									}
									if (local31 == 3325) {
										anIntArray321[local1++] = Static118.aBoolean180 ? 1 : 0;
										continue;
									}
									if (local31 == 3326) {
										anIntArray321[local1++] = Static267.aClass12_Sub1_Sub2_Sub2_1.anInt5393;
										continue;
									}
									if (local31 == 3327) {
										anIntArray321[local1++] = Static267.aClass12_Sub1_Sub2_Sub2_1.aClass247_1.aBoolean494 ? 1 : 0;
										continue;
									}
									if (local31 == 3328) {
										anIntArray321[local1++] = Static244.aBoolean92 && !Static208.aBoolean285 ? 1 : 0;
										continue;
									}
									if (local31 == 3329) {
										anIntArray321[local1++] = Static346.aBoolean460 ? 1 : 0;
										continue;
									}
									if (local31 == 3330) {
										local1--;
										local540 = anIntArray321[local1];
										anIntArray321[local1++] = Static143.method2459(local540);
										continue;
									}
									if (local31 == 3331) {
										local1 -= 2;
										local540 = anIntArray321[local1];
										local545 = anIntArray321[local1 + 1];
										anIntArray321[local1++] = Static282.method4345(local545, local540, false);
										continue;
									}
									if (local31 == 3332) {
										local1 -= 2;
										local540 = anIntArray321[local1];
										local545 = anIntArray321[local1 + 1];
										anIntArray321[local1++] = Static282.method4345(local545, local540, true);
										continue;
									}
									if (local31 == 3333) {
										anIntArray321[local1++] = Static25.anInt604;
										continue;
									}
									if (local31 == 3335) {
										anIntArray321[local1++] = Static189.anInt5185;
										continue;
									}
									if (local31 == 3336) {
										local1 -= 4;
										local540 = anIntArray321[local1];
										local545 = anIntArray321[local1 + 1];
										local744 = anIntArray321[local1 + 2];
										local395 = anIntArray321[local1 + 3];
										local540 += local545 << 14;
										local540 += local744 << 28;
										local540 += local395;
										anIntArray321[local1++] = local540;
										continue;
									}
									if (local31 == 3337) {
										anIntArray321[local1++] = Static277.anInt2677;
										continue;
									}
									if (local31 == 3338) {
										anIntArray321[local1++] = Static221.method3731();
										continue;
									}
								} else if (local31 < 3500) {
									@Pc(4725) Class69 local4725;
									if (local31 == 3400) {
										local1 -= 2;
										local540 = anIntArray321[local1];
										local545 = anIntArray321[local1 + 1];
										local4725 = Static290.aClass105_1.method2446(local540);
										aStringArray15[local3++] = local4725.method1535(local545);
										continue;
									}
									if (local31 == 3408) {
										local1 -= 4;
										local540 = anIntArray321[local1];
										local545 = anIntArray321[local1 + 1];
										local744 = anIntArray321[local1 + 2];
										local395 = anIntArray321[local1 + 3];
										@Pc(4765) Class69 local4765 = Static290.aClass105_1.method2446(local744);
										if (local4765.aChar4 == local540 && local4765.aChar3 == local545) {
											if (local545 == 115) {
												aStringArray15[local3++] = local4765.method1535(local395);
											} else {
												anIntArray321[local1++] = local4765.method1534(local395);
											}
											continue;
										}
										throw new RuntimeException("C3408-1");
									}
									if (local31 == 3409) {
										local1 -= 3;
										local540 = anIntArray321[local1];
										local545 = anIntArray321[local1 + 1];
										local744 = anIntArray321[local1 + 2];
										if (local545 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(4832) Class69 local4832 = Static290.aClass105_1.method2446(local545);
										if (local4832.aChar3 != local540) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray321[local1++] = local4832.method1537(local744) ? 1 : 0;
										continue;
									}
									if (local31 == 3410) {
										local1--;
										local540 = anIntArray321[local1];
										local3--;
										local1702 = aStringArray15[local3];
										if (local540 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local4725 = Static290.aClass105_1.method2446(local540);
										if (local4725.aChar3 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray321[local1++] = local4725.method1531(local1702) ? 1 : 0;
										continue;
									}
									if (local31 == 3411) {
										local1--;
										local540 = anIntArray321[local1];
										@Pc(4915) Class69 local4915 = Static290.aClass105_1.method2446(local540);
										anIntArray321[local1++] = local4915.aClass214_11.method5066();
										continue;
									}
								} else if (local31 < 3700) {
									if (local31 == 3600) {
										if (Static160.anInt2911 == 0) {
											anIntArray321[local1++] = -2;
										} else if (Static160.anInt2911 == 1) {
											anIntArray321[local1++] = -1;
										} else {
											anIntArray321[local1++] = Static244.anInt1014;
										}
										continue;
									}
									if (local31 == 3601) {
										local1--;
										local540 = anIntArray321[local1];
										if (Static160.anInt2911 == 2 && local540 < Static244.anInt1014) {
											aStringArray15[local3++] = Static340.aStringArray38[local540];
											if (Static278.aStringArray8[local540] == null) {
												aStringArray15[local3++] = "";
											} else {
												aStringArray15[local3++] = Static278.aStringArray8[local540];
											}
											continue;
										}
										aStringArray15[local3++] = "";
										aStringArray15[local3++] = "";
										continue;
									}
									if (local31 == 3602) {
										local1--;
										local540 = anIntArray321[local1];
										if (Static160.anInt2911 == 2 && local540 < Static244.anInt1014) {
											anIntArray321[local1++] = Static249.anIntArray557[local540];
											continue;
										}
										anIntArray321[local1++] = 0;
										continue;
									}
									if (local31 == 3603) {
										local1--;
										local540 = anIntArray321[local1];
										if (Static160.anInt2911 == 2 && local540 < Static244.anInt1014) {
											anIntArray321[local1++] = Static147.anIntArray307[local540];
											continue;
										}
										anIntArray321[local1++] = 0;
										continue;
									}
									if (local31 == 3604) {
										local3--;
										local352 = aStringArray15[local3];
										local1--;
										local545 = anIntArray321[local1];
										Static272.method4280(local545, local352);
										continue;
									}
									if (local31 == 3605) {
										local3--;
										local352 = aStringArray15[local3];
										Static314.method4881(local352);
										continue;
									}
									if (local31 == 3606) {
										local3--;
										local352 = aStringArray15[local3];
										Static181.method2930(local352);
										continue;
									}
									if (local31 == 3607) {
										local3--;
										local352 = aStringArray15[local3];
										Static122.method2235(local352, false);
										continue;
									}
									if (local31 == 3608) {
										local3--;
										local352 = aStringArray15[local3];
										Static38.method828(local352);
										continue;
									}
									if (local31 == 3609) {
										local3--;
										local352 = aStringArray15[local3];
										if (local352.startsWith("<img=0>") || local352.startsWith("<img=1>")) {
											local352 = local352.substring(7);
										}
										anIntArray321[local1++] = Static326.method5042(local352) ? 1 : 0;
										continue;
									}
									if (local31 == 3610) {
										local1--;
										local540 = anIntArray321[local1];
										if (Static160.anInt2911 == 2 && local540 < Static244.anInt1014) {
											aStringArray15[local3++] = Static337.aStringArray36[local540];
											continue;
										}
										aStringArray15[local3++] = "";
										continue;
									}
									if (local31 == 3611) {
										if (Static260.aString45 == null) {
											aStringArray15[local3++] = "";
										} else {
											aStringArray15[local3++] = Static163.method2689(Static260.aString45);
										}
										continue;
									}
									if (local31 == 3612) {
										if (Static260.aString45 == null) {
											anIntArray321[local1++] = 0;
										} else {
											anIntArray321[local1++] = Static354.anInt6211;
										}
										continue;
									}
									if (local31 == 3613) {
										local1--;
										local540 = anIntArray321[local1];
										if (Static260.aString45 != null && local540 < Static354.anInt6211) {
											aStringArray15[local3++] = Static61.aClass195Array1[local540].aString54;
											continue;
										}
										aStringArray15[local3++] = "";
										continue;
									}
									if (local31 == 3614) {
										local1--;
										local540 = anIntArray321[local1];
										if (Static260.aString45 != null && local540 < Static354.anInt6211) {
											anIntArray321[local1++] = Static61.aClass195Array1[local540].anInt5439;
											continue;
										}
										anIntArray321[local1++] = 0;
										continue;
									}
									if (local31 == 3615) {
										local1--;
										local540 = anIntArray321[local1];
										if (Static260.aString45 != null && local540 < Static354.anInt6211) {
											anIntArray321[local1++] = Static61.aClass195Array1[local540].aByte60;
											continue;
										}
										anIntArray321[local1++] = 0;
										continue;
									}
									if (local31 == 3616) {
										anIntArray321[local1++] = Static93.aByte19;
										continue;
									}
									if (local31 == 3617) {
										local3--;
										local352 = aStringArray15[local3];
										Static126.method2272(local352);
										continue;
									}
									if (local31 == 3618) {
										anIntArray321[local1++] = Static207.aByte38;
										continue;
									}
									if (local31 == 3619) {
										local3--;
										local352 = aStringArray15[local3];
										Static186.method5453(local352);
										continue;
									}
									if (local31 == 3620) {
										Static174.method5752();
										continue;
									}
									if (local31 == 3621) {
										if (Static160.anInt2911 == 0) {
											anIntArray321[local1++] = -1;
										} else {
											anIntArray321[local1++] = Static379.anInt1197;
										}
										continue;
									}
									if (local31 == 3622) {
										local1--;
										local540 = anIntArray321[local1];
										if (Static160.anInt2911 != 0 && local540 < Static379.anInt1197) {
											aStringArray15[local3++] = Static235.aStringArray28[local540];
											if (Static184.aStringArray42[local540] == null) {
												aStringArray15[local3++] = "";
											} else {
												aStringArray15[local3++] = Static184.aStringArray42[local540];
											}
											continue;
										}
										aStringArray15[local3++] = "";
										aStringArray15[local3++] = "";
										continue;
									}
									if (local31 == 3623) {
										local3--;
										local352 = aStringArray15[local3];
										if (local352.startsWith("<img=0>") || local352.startsWith("<img=1>")) {
											local352 = local352.substring(7);
										}
										anIntArray321[local1++] = Static55.method1065(local352) ? 1 : 0;
										continue;
									}
									if (local31 == 3624) {
										local1--;
										local540 = anIntArray321[local1];
										if (Static61.aClass195Array1 != null && local540 < Static354.anInt6211 && Static61.aClass195Array1[local540].aString56.equalsIgnoreCase(Static267.aClass12_Sub1_Sub2_Sub2_1.aString51)) {
											anIntArray321[local1++] = 1;
											continue;
										}
										anIntArray321[local1++] = 0;
										continue;
									}
									if (local31 == 3625) {
										if (Static34.aString5 == null) {
											aStringArray15[local3++] = "";
										} else {
											aStringArray15[local3++] = Static34.aString5;
										}
										continue;
									}
									if (local31 == 3626) {
										local1--;
										local540 = anIntArray321[local1];
										if (Static260.aString45 != null && local540 < Static354.anInt6211) {
											aStringArray15[local3++] = Static61.aClass195Array1[local540].aString55;
											continue;
										}
										aStringArray15[local3++] = "";
										continue;
									}
									if (local31 == 3627) {
										local1--;
										local540 = anIntArray321[local1];
										if (Static160.anInt2911 == 2 && local540 >= 0 && local540 < Static244.anInt1014) {
											anIntArray321[local1++] = Static295.aBooleanArray119[local540] ? 1 : 0;
											continue;
										}
										anIntArray321[local1++] = 0;
										continue;
									}
									if (local31 == 3628) {
										local3--;
										local352 = aStringArray15[local3];
										if (local352.startsWith("<img=0>") || local352.startsWith("<img=1>")) {
											local352 = local352.substring(7);
										}
										anIntArray321[local1++] = Static228.method3798(local352);
										continue;
									}
									if (local31 == 3629) {
										anIntArray321[local1++] = Static324.anInt5683;
										continue;
									}
									if (local31 == 3630) {
										local3--;
										local352 = aStringArray15[local3];
										Static122.method2235(local352, true);
										continue;
									}
									if (local31 == 3631) {
										local1--;
										local540 = anIntArray321[local1];
										anIntArray321[local1++] = Static275.aBooleanArray114[local540] ? 1 : 0;
										continue;
									}
									if (local31 == 3632) {
										local1--;
										local540 = anIntArray321[local1];
										if (Static260.aString45 != null && local540 < Static354.anInt6211) {
											aStringArray15[local3++] = Static61.aClass195Array1[local540].aString56;
											continue;
										}
										aStringArray15[local3++] = "";
										continue;
									}
									if (local31 == 3633) {
										local1--;
										local540 = anIntArray321[local1];
										if (Static160.anInt2911 != 0 && local540 < Static379.anInt1197) {
											aStringArray15[local3++] = Static217.aStringArray24[local540];
											continue;
										}
										aStringArray15[local3++] = "";
										continue;
									}
								} else if (local31 < 4000) {
									if (local31 == 3903) {
										local1--;
										local540 = anIntArray321[local1];
										anIntArray321[local1++] = Static315.aClass14Array1[local540].method372();
										continue;
									}
									if (local31 == 3904) {
										local1--;
										local540 = anIntArray321[local1];
										anIntArray321[local1++] = Static315.aClass14Array1[local540].anInt309;
										continue;
									}
									if (local31 == 3905) {
										local1--;
										local540 = anIntArray321[local1];
										anIntArray321[local1++] = Static315.aClass14Array1[local540].anInt306;
										continue;
									}
									if (local31 == 3906) {
										local1--;
										local540 = anIntArray321[local1];
										anIntArray321[local1++] = Static315.aClass14Array1[local540].anInt311;
										continue;
									}
									if (local31 == 3907) {
										local1--;
										local540 = anIntArray321[local1];
										anIntArray321[local1++] = Static315.aClass14Array1[local540].anInt305;
										continue;
									}
									if (local31 == 3908) {
										local1--;
										local540 = anIntArray321[local1];
										anIntArray321[local1++] = Static315.aClass14Array1[local540].anInt302;
										continue;
									}
									if (local31 == 3910) {
										local1--;
										local540 = anIntArray321[local1];
										local545 = Static315.aClass14Array1[local540].method374();
										anIntArray321[local1++] = local545 == 0 ? 1 : 0;
										continue;
									}
									if (local31 == 3911) {
										local1--;
										local540 = anIntArray321[local1];
										local545 = Static315.aClass14Array1[local540].method374();
										anIntArray321[local1++] = local545 == 2 ? 1 : 0;
										continue;
									}
									if (local31 == 3912) {
										local1--;
										local540 = anIntArray321[local1];
										local545 = Static315.aClass14Array1[local540].method374();
										anIntArray321[local1++] = local545 == 5 ? 1 : 0;
										continue;
									}
									if (local31 == 3913) {
										local1--;
										local540 = anIntArray321[local1];
										local545 = Static315.aClass14Array1[local540].method374();
										anIntArray321[local1++] = local545 == 1 ? 1 : 0;
										continue;
									}
								} else if (local31 < 4100) {
									if (local31 == 4000) {
										local1 -= 2;
										local540 = anIntArray321[local1];
										local545 = anIntArray321[local1 + 1];
										anIntArray321[local1++] = local540 + local545;
										continue;
									}
									if (local31 == 4001) {
										local1 -= 2;
										local540 = anIntArray321[local1];
										local545 = anIntArray321[local1 + 1];
										anIntArray321[local1++] = local540 - local545;
										continue;
									}
									if (local31 == 4002) {
										local1 -= 2;
										local540 = anIntArray321[local1];
										local545 = anIntArray321[local1 + 1];
										anIntArray321[local1++] = local540 * local545;
										continue;
									}
									if (local31 == 4003) {
										local1 -= 2;
										local540 = anIntArray321[local1];
										local545 = anIntArray321[local1 + 1];
										anIntArray321[local1++] = local540 / local545;
										continue;
									}
									if (local31 == 4004) {
										local1--;
										local540 = anIntArray321[local1];
										anIntArray321[local1++] = (int) (Math.random() * (double) local540);
										continue;
									}
									if (local31 == 4005) {
										local1--;
										local540 = anIntArray321[local1];
										anIntArray321[local1++] = (int) (Math.random() * (double) (local540 + 1));
										continue;
									}
									if (local31 == 4006) {
										local1 -= 5;
										local540 = anIntArray321[local1];
										local545 = anIntArray321[local1 + 1];
										local744 = anIntArray321[local1 + 2];
										local395 = anIntArray321[local1 + 3];
										local414 = anIntArray321[local1 + 4];
										anIntArray321[local1++] = local540 + (local545 - local540) * (local414 - local744) / (local395 - local744);
										continue;
									}
									@Pc(6089) long local6089;
									@Pc(6082) long local6082;
									if (local31 == 4007) {
										local1 -= 2;
										local6082 = anIntArray321[local1];
										local6089 = anIntArray321[local1 + 1];
										anIntArray321[local1++] = (int) (local6082 + local6082 * local6089 / 100L);
										continue;
									}
									if (local31 == 4008) {
										local1 -= 2;
										local540 = anIntArray321[local1];
										local545 = anIntArray321[local1 + 1];
										anIntArray321[local1++] = local540 | 0x1 << local545;
										continue;
									}
									if (local31 == 4009) {
										local1 -= 2;
										local540 = anIntArray321[local1];
										local545 = anIntArray321[local1 + 1];
										anIntArray321[local1++] = local540 & -(0x1 << local545) - 1;
										continue;
									}
									if (local31 == 4010) {
										local1 -= 2;
										local540 = anIntArray321[local1];
										local545 = anIntArray321[local1 + 1];
										anIntArray321[local1++] = (local540 & 0x1 << local545) == 0 ? 0 : 1;
										continue;
									}
									if (local31 == 4011) {
										local1 -= 2;
										local540 = anIntArray321[local1];
										local545 = anIntArray321[local1 + 1];
										anIntArray321[local1++] = local540 % local545;
										continue;
									}
									if (local31 == 4012) {
										local1 -= 2;
										local540 = anIntArray321[local1];
										local545 = anIntArray321[local1 + 1];
										if (local540 == 0) {
											anIntArray321[local1++] = 0;
										} else {
											anIntArray321[local1++] = (int) Math.pow((double) local540, (double) local545);
										}
										continue;
									}
									if (local31 == 4013) {
										local1 -= 2;
										local540 = anIntArray321[local1];
										local545 = anIntArray321[local1 + 1];
										if (local540 == 0) {
											anIntArray321[local1++] = 0;
										} else if (local545 == 0) {
											anIntArray321[local1++] = Integer.MAX_VALUE;
										} else {
											anIntArray321[local1++] = (int) Math.pow((double) local540, 1.0D / (double) local545);
										}
										continue;
									}
									if (local31 == 4014) {
										local1 -= 2;
										local540 = anIntArray321[local1];
										local545 = anIntArray321[local1 + 1];
										anIntArray321[local1++] = local540 & local545;
										continue;
									}
									if (local31 == 4015) {
										local1 -= 2;
										local540 = anIntArray321[local1];
										local545 = anIntArray321[local1 + 1];
										anIntArray321[local1++] = local540 | local545;
										continue;
									}
									if (local31 == 4016) {
										local1 -= 2;
										local540 = anIntArray321[local1];
										local545 = anIntArray321[local1 + 1];
										anIntArray321[local1++] = local540 < local545 ? local540 : local545;
										continue;
									}
									if (local31 == 4017) {
										local1 -= 2;
										local540 = anIntArray321[local1];
										local545 = anIntArray321[local1 + 1];
										anIntArray321[local1++] = local540 > local545 ? local540 : local545;
										continue;
									}
									if (local31 == 4018) {
										local1 -= 3;
										local6082 = anIntArray321[local1];
										local6089 = anIntArray321[local1 + 1];
										@Pc(6395) long local6395 = (long) anIntArray321[local1 + 2];
										anIntArray321[local1++] = (int) (local6082 * local6395 / local6089);
										continue;
									}
								} else {
									@Pc(6934) boolean local6934;
									if (local31 < 4200) {
										if (local31 == 4100) {
											local3--;
											local352 = aStringArray15[local3];
											local1--;
											local545 = anIntArray321[local1];
											aStringArray15[local3++] = local352 + local545;
											continue;
										}
										if (local31 == 4101) {
											local3 -= 2;
											local352 = aStringArray15[local3];
											local1702 = aStringArray15[local3 + 1];
											aStringArray15[local3++] = local352 + local1702;
											continue;
										}
										if (local31 == 4102) {
											local3--;
											local352 = aStringArray15[local3];
											local1--;
											local545 = anIntArray321[local1];
											aStringArray15[local3++] = local352 + Static341.method5230(local545);
											continue;
										}
										if (local31 == 4103) {
											local3--;
											local352 = aStringArray15[local3];
											aStringArray15[local3++] = local352.toLowerCase();
											continue;
										}
										if (local31 == 4104) {
											local1--;
											local540 = anIntArray321[local1];
											@Pc(6521) long local6521 = ((long) local540 + 11745L) * 86400000L;
											aCalendar1.setTime(new Date(local6521));
											local395 = aCalendar1.get(5);
											local414 = aCalendar1.get(2);
											local775 = aCalendar1.get(1);
											aStringArray15[local3++] = local395 + "-" + aStringArray17[local414] + "-" + local775;
											continue;
										}
										if (local31 == 4105) {
											local3 -= 2;
											local352 = aStringArray15[local3];
											local1702 = aStringArray15[local3 + 1];
											if (Static267.aClass12_Sub1_Sub2_Sub2_1.aClass247_1 != null && Static267.aClass12_Sub1_Sub2_Sub2_1.aClass247_1.aBoolean494) {
												aStringArray15[local3++] = local1702;
												continue;
											}
											aStringArray15[local3++] = local352;
											continue;
										}
										if (local31 == 4106) {
											local1--;
											local540 = anIntArray321[local1];
											aStringArray15[local3++] = Integer.toString(local540);
											continue;
										}
										if (local31 == 4107) {
											local3 -= 2;
											anIntArray321[local1++] = Static196.method3284(aStringArray15[local3 + 1], aStringArray15[local3], Static189.anInt5185);
											continue;
										}
										@Pc(6653) Class216 local6653;
										if (local31 == 4108) {
											local3--;
											local352 = aStringArray15[local3];
											local1 -= 2;
											local545 = anIntArray321[local1];
											local744 = anIntArray321[local1 + 1];
											local6653 = Static362.method5519(Static382.aClass71_89, local744);
											anIntArray321[local1++] = local6653.method5076(local352, local545, Static357.aClass5Array2);
											continue;
										}
										if (local31 == 4109) {
											local3--;
											local352 = aStringArray15[local3];
											local1 -= 2;
											local545 = anIntArray321[local1];
											local744 = anIntArray321[local1 + 1];
											local6653 = Static362.method5519(Static382.aClass71_89, local744);
											anIntArray321[local1++] = local6653.method5078(local352, local545, Static357.aClass5Array2);
											continue;
										}
										if (local31 == 4110) {
											local3 -= 2;
											local352 = aStringArray15[local3];
											local1702 = aStringArray15[local3 + 1];
											local1--;
											if (anIntArray321[local1] == 1) {
												aStringArray15[local3++] = local352;
											} else {
												aStringArray15[local3++] = local1702;
											}
											continue;
										}
										if (local31 == 4111) {
											local3--;
											local352 = aStringArray15[local3];
											aStringArray15[local3++] = Static18.method506(local352);
											continue;
										}
										if (local31 == 4112) {
											local3--;
											local352 = aStringArray15[local3];
											local1--;
											local545 = anIntArray321[local1];
											if (local545 == -1) {
												throw new RuntimeException("null char");
											}
											aStringArray15[local3++] = local352 + (char) local545;
											continue;
										}
										if (local31 == 4113) {
											local1--;
											local540 = anIntArray321[local1];
											anIntArray321[local1++] = Static163.method2690((char) local540) ? 1 : 0;
											continue;
										}
										if (local31 == 4114) {
											local1--;
											local540 = anIntArray321[local1];
											anIntArray321[local1++] = Static389.method5717((char) local540) ? 1 : 0;
											continue;
										}
										if (local31 == 4115) {
											local1--;
											local540 = anIntArray321[local1];
											anIntArray321[local1++] = Static235.method3842((char) local540) ? 1 : 0;
											continue;
										}
										if (local31 == 4116) {
											local1--;
											local540 = anIntArray321[local1];
											anIntArray321[local1++] = Static347.method5295((char) local540) ? 1 : 0;
											continue;
										}
										if (local31 == 4117) {
											local3--;
											local352 = aStringArray15[local3];
											if (local352 == null) {
												anIntArray321[local1++] = 0;
											} else {
												anIntArray321[local1++] = local352.length();
											}
											continue;
										}
										if (local31 == 4118) {
											local3--;
											local352 = aStringArray15[local3];
											local1 -= 2;
											local545 = anIntArray321[local1];
											local744 = anIntArray321[local1 + 1];
											aStringArray15[local3++] = local352.substring(local545, local744);
											continue;
										}
										if (local31 == 4119) {
											local3--;
											local352 = aStringArray15[local3];
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
											aStringArray15[local3++] = local6932.toString();
											continue;
										}
										if (local31 == 4120) {
											local3--;
											local352 = aStringArray15[local3];
											local1 -= 2;
											local545 = anIntArray321[local1];
											local744 = anIntArray321[local1 + 1];
											anIntArray321[local1++] = local352.indexOf(local545, local744);
											continue;
										}
										if (local31 == 4121) {
											local3 -= 2;
											local352 = aStringArray15[local3];
											local1702 = aStringArray15[local3 + 1];
											local1--;
											local744 = anIntArray321[local1];
											anIntArray321[local1++] = local352.indexOf(local1702, local744);
											continue;
										}
										if (local31 == 4122) {
											local1--;
											local540 = anIntArray321[local1];
											anIntArray321[local1++] = Character.toLowerCase((char) local540);
											continue;
										}
										if (local31 == 4123) {
											local1--;
											local540 = anIntArray321[local1];
											anIntArray321[local1++] = Character.toUpperCase((char) local540);
											continue;
										}
										if (local31 == 4124) {
											local1--;
											local1073 = anIntArray321[local1] != 0;
											local1--;
											local545 = anIntArray321[local1];
											aStringArray15[local3++] = Static137.method2401((long) local545, 0, local1073, Static189.anInt5185);
											continue;
										}
										if (local31 == 4125) {
											local3--;
											local352 = aStringArray15[local3];
											local1--;
											local545 = anIntArray321[local1];
											@Pc(7107) Class216 local7107 = Static362.method5519(Static382.aClass71_89, local545);
											anIntArray321[local1++] = local7107.method5075(Static357.aClass5Array2, local352);
											continue;
										}
									} else {
										@Pc(7383) Class61 local7383;
										if (local31 < 4300) {
											if (local31 == 4200) {
												local1--;
												local540 = anIntArray321[local1];
												aStringArray15[local3++] = Static106.aClass250_1.method5735(local540).aString27;
												continue;
											}
											@Pc(7157) Class117 local7157;
											if (local31 == 4201) {
												local1 -= 2;
												local540 = anIntArray321[local1];
												local545 = anIntArray321[local1 + 1];
												local7157 = Static106.aClass250_1.method5735(local540);
												if (local545 >= 1 && local545 <= 5 && local7157.aStringArray18[local545 - 1] != null) {
													aStringArray15[local3++] = local7157.aStringArray18[local545 - 1];
													continue;
												}
												aStringArray15[local3++] = "";
												continue;
											}
											if (local31 == 4202) {
												local1 -= 2;
												local540 = anIntArray321[local1];
												local545 = anIntArray321[local1 + 1];
												local7157 = Static106.aClass250_1.method5735(local540);
												if (local545 >= 1 && local545 <= 5 && local7157.aStringArray19[local545 - 1] != null) {
													aStringArray15[local3++] = local7157.aStringArray19[local545 - 1];
													continue;
												}
												aStringArray15[local3++] = "";
												continue;
											}
											if (local31 == 4203) {
												local1--;
												local540 = anIntArray321[local1];
												anIntArray321[local1++] = Static106.aClass250_1.method5735(local540).anInt2864;
												continue;
											}
											if (local31 == 4204) {
												local1--;
												local540 = anIntArray321[local1];
												anIntArray321[local1++] = Static106.aClass250_1.method5735(local540).anInt2872 == 1 ? 1 : 0;
												continue;
											}
											@Pc(7290) Class117 local7290;
											if (local31 == 4205) {
												local1--;
												local540 = anIntArray321[local1];
												local7290 = Static106.aClass250_1.method5735(local540);
												if (local7290.anInt2884 == -1 && local7290.anInt2837 >= 0) {
													anIntArray321[local1++] = local7290.anInt2837;
													continue;
												}
												anIntArray321[local1++] = local540;
												continue;
											}
											if (local31 == 4206) {
												local1--;
												local540 = anIntArray321[local1];
												local7290 = Static106.aClass250_1.method5735(local540);
												if (local7290.anInt2884 >= 0 && local7290.anInt2837 >= 0) {
													anIntArray321[local1++] = local7290.anInt2837;
													continue;
												}
												anIntArray321[local1++] = local540;
												continue;
											}
											if (local31 == 4207) {
												local1--;
												local540 = anIntArray321[local1];
												anIntArray321[local1++] = Static106.aClass250_1.method5735(local540).aBoolean210 ? 1 : 0;
												continue;
											}
											if (local31 == 4208) {
												local1 -= 2;
												local540 = anIntArray321[local1];
												local545 = anIntArray321[local1 + 1];
												local7383 = Static82.aClass184_1.method4403(local545);
												if (local7383.method1397()) {
													aStringArray15[local3++] = Static106.aClass250_1.method5735(local540).method2642(local545, local7383.aString20);
												} else {
													anIntArray321[local1++] = Static106.aClass250_1.method5735(local540).method2631(local7383.anInt1488, local545);
												}
												continue;
											}
											if (local31 == 4209) {
												local1 -= 2;
												local540 = anIntArray321[local1];
												local545 = anIntArray321[local1 + 1] - 1;
												local7157 = Static106.aClass250_1.method5735(local540);
												if (local7157.anInt2839 == local545) {
													anIntArray321[local1++] = local7157.anInt2880;
												} else if (local7157.anInt2887 == local545) {
													anIntArray321[local1++] = local7157.anInt2834;
												} else {
													anIntArray321[local1++] = -1;
												}
												continue;
											}
											if (local31 == 4210) {
												local3--;
												local352 = aStringArray15[local3];
												local1--;
												local545 = anIntArray321[local1];
												Static249.method3989(local352, local545 == 1);
												anIntArray321[local1++] = Static134.anInt2480;
												continue;
											}
											if (local31 == 4211) {
												if (Static240.aShortArray86 != null && Static149.anInt2704 < Static134.anInt2480) {
													anIntArray321[local1++] = Static240.aShortArray86[Static149.anInt2704++] & 0xFFFF;
													continue;
												}
												anIntArray321[local1++] = -1;
												continue;
											}
											if (local31 == 4212) {
												Static149.anInt2704 = 0;
												continue;
											}
										} else if (local31 < 4400) {
											if (local31 == 4300) {
												local1 -= 2;
												local540 = anIntArray321[local1];
												local545 = anIntArray321[local1 + 1];
												local7383 = Static82.aClass184_1.method4403(local545);
												if (local7383.method1397()) {
													aStringArray15[local3++] = Static274.aClass151_4.method3705(local540).method5575(local545, local7383.aString20);
												} else {
													anIntArray321[local1++] = Static274.aClass151_4.method3705(local540).method5569(local7383.anInt1488, local545);
												}
												continue;
											}
										} else if (local31 < 4500) {
											if (local31 == 4400) {
												local1 -= 2;
												local540 = anIntArray321[local1];
												local545 = anIntArray321[local1 + 1];
												local7383 = Static82.aClass184_1.method4403(local545);
												if (local7383.method1397()) {
													aStringArray15[local3++] = Static11.aClass123_5.method2703(local540).method825(local545, local7383.aString20);
												} else {
													anIntArray321[local1++] = Static11.aClass123_5.method2703(local540).method823(local7383.anInt1488, local545);
												}
												continue;
											}
										} else if (local31 < 4600) {
											if (local31 == 4500) {
												local1 -= 2;
												local540 = anIntArray321[local1];
												local545 = anIntArray321[local1 + 1];
												local7383 = Static82.aClass184_1.method4403(local545);
												if (local7383.method1397()) {
													aStringArray15[local3++] = Static283.aClass223_1.method5298(local540).method3538(local545, local7383.aString20);
												} else {
													anIntArray321[local1++] = Static283.aClass223_1.method5298(local540).method3534(local545, local7383.anInt1488);
												}
												continue;
											}
										} else if (local31 < 4700) {
											if (local31 == 4600) {
												local1--;
												local540 = anIntArray321[local1];
												@Pc(7704) Class170 local7704 = Static225.aClass47_1.method1075(local540);
												if (local7704.anIntArray563 != null && local7704.anIntArray563.length > 0) {
													local744 = 0;
													local395 = local7704.anIntArray562[0];
													for (local414 = 1; local414 < local7704.anIntArray563.length; local414++) {
														if (local7704.anIntArray562[local414] > local395) {
															local744 = local414;
															local395 = local7704.anIntArray562[local414];
														}
													}
													anIntArray321[local1++] = local7704.anIntArray563[local744];
													continue;
												}
												anIntArray321[local1++] = local7704.anInt4555;
												continue;
											}
										} else if (local31 < 5100) {
											if (local31 == 5000) {
												anIntArray321[local1++] = Static160.anInt2918;
												continue;
											}
											if (local31 == 5001) {
												local1 -= 3;
												Static160.anInt2918 = anIntArray321[local1];
												Static195.anInt3567 = anIntArray321[local1 + 1];
												Static145.anInt2654 = anIntArray321[local1 + 2];
												Static19.method552(Static86.aClass41_162);
												Static39.aClass2_Sub13_Sub2_4.method4207(Static160.anInt2918);
												Static39.aClass2_Sub13_Sub2_4.method4207(Static195.anInt3567);
												Static39.aClass2_Sub13_Sub2_4.method4207(Static145.anInt2654);
												continue;
											}
											if (local31 == 5002) {
												local3 -= 2;
												local352 = aStringArray15[local3];
												local1702 = aStringArray15[local3 + 1];
												local1 -= 2;
												local744 = anIntArray321[local1];
												local395 = anIntArray321[local1 + 1];
												if (local1702 == null) {
													local1702 = "";
												}
												if (local1702.length() > 80) {
													local1702 = local1702.substring(0, 80);
												}
												Static19.method552(Static200.aClass41_115);
												Static39.aClass2_Sub13_Sub2_4.method4207(Static346.method5273(local352) + Static346.method5273(local1702) + 2);
												Static39.aClass2_Sub13_Sub2_4.method4230(local352);
												Static39.aClass2_Sub13_Sub2_4.method4207(local744 - 1);
												Static39.aClass2_Sub13_Sub2_4.method4207(local395);
												Static39.aClass2_Sub13_Sub2_4.method4230(local1702);
												continue;
											}
											if (local31 == 5003) {
												local1--;
												local540 = anIntArray321[local1];
												local1702 = null;
												if (local540 < 100) {
													local1702 = Static13.aStringArray2[local540];
												}
												if (local1702 == null) {
													local1702 = "";
												}
												aStringArray15[local3++] = local1702;
												continue;
											}
											if (local31 == 5004) {
												local1--;
												local540 = anIntArray321[local1];
												local545 = -1;
												if (local540 < 100 && Static13.aStringArray2[local540] != null) {
													local545 = Static18.anIntArray85[local540];
												}
												anIntArray321[local1++] = local545;
												continue;
											}
											if (local31 == 5005) {
												anIntArray321[local1++] = Static195.anInt3567;
												continue;
											}
											if (local31 == 5008) {
												local3--;
												local352 = aStringArray15[local3];
												if (Static287.anInt5112 == 0 && (Static244.aBoolean92 && !Static208.aBoolean285 || Static346.aBoolean460)) {
													continue;
												}
												local1702 = local352.toLowerCase();
												@Pc(7969) byte local7969 = 0;
												if (local1702.startsWith(Static350.aClass221_223.method5229(0))) {
													local7969 = 0;
													local352 = local352.substring(Static350.aClass221_223.method5229(0).length());
												} else if (local1702.startsWith(Static134.aClass221_95.method5229(0))) {
													local7969 = 1;
													local352 = local352.substring(Static134.aClass221_95.method5229(0).length());
												} else if (local1702.startsWith(Static332.aClass221_203.method5229(0))) {
													local7969 = 2;
													local352 = local352.substring(Static332.aClass221_203.method5229(0).length());
												} else if (local1702.startsWith(Static166.aClass221_109.method5229(0))) {
													local7969 = 3;
													local352 = local352.substring(Static166.aClass221_109.method5229(0).length());
												} else if (local1702.startsWith(Static58.aClass221_192.method5229(0))) {
													local7969 = 4;
													local352 = local352.substring(Static58.aClass221_192.method5229(0).length());
												} else if (local1702.startsWith(Static311.aClass221_189.method5229(0))) {
													local7969 = 5;
													local352 = local352.substring(Static311.aClass221_189.method5229(0).length());
												} else if (local1702.startsWith(Static319.aClass221_199.method5229(0))) {
													local7969 = 6;
													local352 = local352.substring(Static319.aClass221_199.method5229(0).length());
												} else if (local1702.startsWith(Static217.aClass221_141.method5229(0))) {
													local7969 = 7;
													local352 = local352.substring(Static217.aClass221_141.method5229(0).length());
												} else if (local1702.startsWith(Static229.aClass221_213.method5229(0))) {
													local7969 = 8;
													local352 = local352.substring(Static229.aClass221_213.method5229(0).length());
												} else if (local1702.startsWith(Static64.aClass221_42.method5229(0))) {
													local7969 = 9;
													local352 = local352.substring(Static64.aClass221_42.method5229(0).length());
												} else if (local1702.startsWith(Static347.aClass221_220.method5229(0))) {
													local7969 = 10;
													local352 = local352.substring(Static347.aClass221_220.method5229(0).length());
												} else if (local1702.startsWith(Static79.aClass221_62.method5229(0))) {
													local7969 = 11;
													local352 = local352.substring(Static79.aClass221_62.method5229(0).length());
												} else if (Static189.anInt5185 != 0) {
													if (local1702.startsWith(Static350.aClass221_223.method5229(Static189.anInt5185))) {
														local7969 = 0;
														local352 = local352.substring(Static350.aClass221_223.method5229(Static189.anInt5185).length());
													} else if (local1702.startsWith(Static134.aClass221_95.method5229(Static189.anInt5185))) {
														local7969 = 1;
														local352 = local352.substring(Static134.aClass221_95.method5229(Static189.anInt5185).length());
													} else if (local1702.startsWith(Static332.aClass221_203.method5229(Static189.anInt5185))) {
														local7969 = 2;
														local352 = local352.substring(Static332.aClass221_203.method5229(Static189.anInt5185).length());
													} else if (local1702.startsWith(Static166.aClass221_109.method5229(Static189.anInt5185))) {
														local7969 = 3;
														local352 = local352.substring(Static166.aClass221_109.method5229(Static189.anInt5185).length());
													} else if (local1702.startsWith(Static58.aClass221_192.method5229(Static189.anInt5185))) {
														local7969 = 4;
														local352 = local352.substring(Static58.aClass221_192.method5229(Static189.anInt5185).length());
													} else if (local1702.startsWith(Static311.aClass221_189.method5229(Static189.anInt5185))) {
														local7969 = 5;
														local352 = local352.substring(Static311.aClass221_189.method5229(Static189.anInt5185).length());
													} else if (local1702.startsWith(Static319.aClass221_199.method5229(Static189.anInt5185))) {
														local7969 = 6;
														local352 = local352.substring(Static319.aClass221_199.method5229(Static189.anInt5185).length());
													} else if (local1702.startsWith(Static217.aClass221_141.method5229(Static189.anInt5185))) {
														local7969 = 7;
														local352 = local352.substring(Static217.aClass221_141.method5229(Static189.anInt5185).length());
													} else if (local1702.startsWith(Static229.aClass221_213.method5229(Static189.anInt5185))) {
														local7969 = 8;
														local352 = local352.substring(Static229.aClass221_213.method5229(Static189.anInt5185).length());
													} else if (local1702.startsWith(Static64.aClass221_42.method5229(Static189.anInt5185))) {
														local7969 = 9;
														local352 = local352.substring(Static64.aClass221_42.method5229(Static189.anInt5185).length());
													} else if (local1702.startsWith(Static347.aClass221_220.method5229(Static189.anInt5185))) {
														local7969 = 10;
														local352 = local352.substring(Static347.aClass221_220.method5229(Static189.anInt5185).length());
													} else if (local1702.startsWith(Static79.aClass221_62.method5229(Static189.anInt5185))) {
														local7969 = 11;
														local352 = local352.substring(Static79.aClass221_62.method5229(Static189.anInt5185).length());
													}
												}
												local1702 = local352.toLowerCase();
												@Pc(8407) byte local8407 = 0;
												if (local1702.startsWith(Static66.aClass221_186.method5229(0))) {
													local8407 = 1;
													local352 = local352.substring(Static66.aClass221_186.method5229(0).length());
												} else if (local1702.startsWith(Static326.aClass221_201.method5229(0))) {
													local8407 = 2;
													local352 = local352.substring(Static326.aClass221_201.method5229(0).length());
												} else if (local1702.startsWith(Static17.aClass221_15.method5229(0))) {
													local8407 = 3;
													local352 = local352.substring(Static17.aClass221_15.method5229(0).length());
												} else if (local1702.startsWith(Static391.aClass221_238.method5229(0))) {
													local8407 = 4;
													local352 = local352.substring(Static391.aClass221_238.method5229(0).length());
												} else if (local1702.startsWith(Static17.aClass221_12.method5229(0))) {
													local8407 = 5;
													local352 = local352.substring(Static17.aClass221_12.method5229(0).length());
												} else if (Static189.anInt5185 != 0) {
													if (local1702.startsWith(Static66.aClass221_186.method5229(Static189.anInt5185))) {
														local8407 = 1;
														local352 = local352.substring(Static66.aClass221_186.method5229(Static189.anInt5185).length());
													} else if (local1702.startsWith(Static326.aClass221_201.method5229(Static189.anInt5185))) {
														local8407 = 2;
														local352 = local352.substring(Static326.aClass221_201.method5229(Static189.anInt5185).length());
													} else if (local1702.startsWith(Static17.aClass221_15.method5229(Static189.anInt5185))) {
														local8407 = 3;
														local352 = local352.substring(Static17.aClass221_15.method5229(Static189.anInt5185).length());
													} else if (local1702.startsWith(Static391.aClass221_238.method5229(Static189.anInt5185))) {
														local8407 = 4;
														local352 = local352.substring(Static391.aClass221_238.method5229(Static189.anInt5185).length());
													} else if (local1702.startsWith(Static17.aClass221_12.method5229(Static189.anInt5185))) {
														local8407 = 5;
														local352 = local352.substring(Static17.aClass221_12.method5229(Static189.anInt5185).length());
													}
												}
												Static19.method552(Static40.aClass41_200);
												Static39.aClass2_Sub13_Sub2_4.method4207(0);
												local414 = Static39.aClass2_Sub13_Sub2_4.anInt4788;
												Static39.aClass2_Sub13_Sub2_4.method4207(local7969);
												Static39.aClass2_Sub13_Sub2_4.method4207(local8407);
												Static346.method5274(local352, Static39.aClass2_Sub13_Sub2_4);
												Static39.aClass2_Sub13_Sub2_4.method4241(Static39.aClass2_Sub13_Sub2_4.anInt4788 - local414);
												continue;
											}
											if (local31 == 5009) {
												local3 -= 2;
												local352 = aStringArray15[local3];
												local1702 = aStringArray15[local3 + 1];
												if (Static287.anInt5112 != 0 || (!Static244.aBoolean92 || Static208.aBoolean285) && !Static346.aBoolean460) {
													Static19.method552(Static170.aClass41_86);
													Static39.aClass2_Sub13_Sub2_4.method4207(0);
													local744 = Static39.aClass2_Sub13_Sub2_4.anInt4788;
													Static39.aClass2_Sub13_Sub2_4.method4230(local352);
													Static346.method5274(local1702, Static39.aClass2_Sub13_Sub2_4);
													Static39.aClass2_Sub13_Sub2_4.method4241(Static39.aClass2_Sub13_Sub2_4.anInt4788 - local744);
												}
												continue;
											}
											if (local31 == 5010) {
												local1--;
												local540 = anIntArray321[local1];
												local1702 = null;
												if (local540 < 100) {
													local1702 = Static281.aStringArray32[local540];
												}
												if (local1702 == null) {
													local1702 = "";
												}
												aStringArray15[local3++] = local1702;
												continue;
											}
											if (local31 == 5011) {
												local1--;
												local540 = anIntArray321[local1];
												local1702 = null;
												if (local540 < 100) {
													local1702 = Static321.aStringArray35[local540];
												}
												if (local1702 == null) {
													local1702 = "";
												}
												aStringArray15[local3++] = local1702;
												continue;
											}
											if (local31 == 5012) {
												local1--;
												local540 = anIntArray321[local1];
												local545 = -1;
												if (local540 < 100) {
													local545 = Static271.anIntArray597[local540];
												}
												anIntArray321[local1++] = local545;
												continue;
											}
											if (local31 == 5015) {
												if (Static267.aClass12_Sub1_Sub2_Sub2_1 == null || Static267.aClass12_Sub1_Sub2_Sub2_1.aString52 == null) {
													local352 = Static53.aString7;
												} else {
													local352 = Static267.aClass12_Sub1_Sub2_Sub2_1.method4724();
												}
												aStringArray15[local3++] = local352;
												continue;
											}
											if (local31 == 5016) {
												anIntArray321[local1++] = Static145.anInt2654;
												continue;
											}
											if (local31 == 5017) {
												anIntArray321[local1++] = Static148.anInt2696;
												continue;
											}
											if (local31 == 5018) {
												local1--;
												local540 = anIntArray321[local1];
												local545 = 0;
												if (local540 < 100 && Static13.aStringArray2[local540] != null) {
													local545 = Static18.anIntArray85[local540];
												}
												anIntArray321[local1++] = local545;
												continue;
											}
											if (local31 == 5019) {
												local1--;
												local540 = anIntArray321[local1];
												local1702 = null;
												if (local540 < 100) {
													local1702 = Static222.aStringArray25[local540];
												}
												if (local1702 == null) {
													local1702 = "";
												}
												aStringArray15[local3++] = local1702;
												continue;
											}
											if (local31 == 5020) {
												if (Static267.aClass12_Sub1_Sub2_Sub2_1 == null || Static267.aClass12_Sub1_Sub2_Sub2_1.aString52 == null) {
													local352 = Static53.aString7;
												} else {
													local352 = Static267.aClass12_Sub1_Sub2_Sub2_1.method4713();
												}
												aStringArray15[local3++] = local352;
												continue;
											}
											if (local31 == 5050) {
												local1--;
												local540 = anIntArray321[local1];
												aStringArray15[local3++] = Static344.method5458(local540).aString32;
												continue;
											}
											@Pc(8899) Class2_Sub1_Sub8 local8899;
											if (local31 == 5051) {
												local1--;
												local540 = anIntArray321[local1];
												local8899 = Static344.method5458(local540);
												if (local8899.anIntArray478 == null) {
													anIntArray321[local1++] = 0;
												} else {
													anIntArray321[local1++] = local8899.anIntArray478.length;
												}
												continue;
											}
											if (local31 == 5052) {
												local1 -= 2;
												local540 = anIntArray321[local1];
												local545 = anIntArray321[local1 + 1];
												@Pc(8934) Class2_Sub1_Sub8 local8934 = Static344.method5458(local540);
												local395 = local8934.anIntArray478[local545];
												anIntArray321[local1++] = local395;
												continue;
											}
											if (local31 == 5053) {
												local1--;
												local540 = anIntArray321[local1];
												local8899 = Static344.method5458(local540);
												if (local8899.anIntArray477 == null) {
													anIntArray321[local1++] = 0;
												} else {
													anIntArray321[local1++] = local8899.anIntArray477.length;
												}
												continue;
											}
											if (local31 == 5054) {
												local1 -= 2;
												local540 = anIntArray321[local1];
												local545 = anIntArray321[local1 + 1];
												anIntArray321[local1++] = Static344.method5458(local540).anIntArray477[local545];
												continue;
											}
											if (local31 == 5055) {
												local1--;
												local540 = anIntArray321[local1];
												aStringArray15[local3++] = Static145.method2497(local540).method3626();
												continue;
											}
											if (local31 == 5056) {
												local1--;
												local540 = anIntArray321[local1];
												@Pc(9029) Class2_Sub1_Sub10 local9029 = Static145.method2497(local540);
												if (local9029.anIntArray488 == null) {
													anIntArray321[local1++] = 0;
												} else {
													anIntArray321[local1++] = local9029.anIntArray488.length;
												}
												continue;
											}
											if (local31 == 5057) {
												local1 -= 2;
												local540 = anIntArray321[local1];
												local545 = anIntArray321[local1 + 1];
												anIntArray321[local1++] = Static145.method2497(local540).anIntArray488[local545];
												continue;
											}
											if (local31 == 5058) {
												aClass178_1 = new Class178();
												local1--;
												aClass178_1.anInt4883 = anIntArray321[local1];
												aClass178_1.aClass2_Sub1_Sub10_1 = Static145.method2497(aClass178_1.anInt4883);
												aClass178_1.anIntArray600 = new int[aClass178_1.aClass2_Sub1_Sub10_1.method3618()];
												continue;
											}
											if (local31 == 5059) {
												Static19.method552(Static41.aClass41_16);
												Static39.aClass2_Sub13_Sub2_4.method4207(0);
												local540 = Static39.aClass2_Sub13_Sub2_4.anInt4788;
												Static39.aClass2_Sub13_Sub2_4.method4207(0);
												Static39.aClass2_Sub13_Sub2_4.method4199(aClass178_1.anInt4883);
												aClass178_1.aClass2_Sub1_Sub10_1.method3622(Static39.aClass2_Sub13_Sub2_4, aClass178_1.anIntArray600);
												Static39.aClass2_Sub13_Sub2_4.method4241(Static39.aClass2_Sub13_Sub2_4.anInt4788 - local540);
												continue;
											}
											if (local31 == 5060) {
												local3--;
												local352 = aStringArray15[local3];
												Static19.method552(Static277.aClass41_75);
												Static39.aClass2_Sub13_Sub2_4.method4207(0);
												local545 = Static39.aClass2_Sub13_Sub2_4.anInt4788;
												Static39.aClass2_Sub13_Sub2_4.method4230(local352);
												Static39.aClass2_Sub13_Sub2_4.method4199(aClass178_1.anInt4883);
												aClass178_1.aClass2_Sub1_Sub10_1.method3622(Static39.aClass2_Sub13_Sub2_4, aClass178_1.anIntArray600);
												Static39.aClass2_Sub13_Sub2_4.method4241(Static39.aClass2_Sub13_Sub2_4.anInt4788 - local545);
												continue;
											}
											if (local31 == 5061) {
												Static19.method552(Static41.aClass41_16);
												Static39.aClass2_Sub13_Sub2_4.method4207(0);
												local540 = Static39.aClass2_Sub13_Sub2_4.anInt4788;
												Static39.aClass2_Sub13_Sub2_4.method4207(1);
												Static39.aClass2_Sub13_Sub2_4.method4199(aClass178_1.anInt4883);
												aClass178_1.aClass2_Sub1_Sub10_1.method3622(Static39.aClass2_Sub13_Sub2_4, aClass178_1.anIntArray600);
												Static39.aClass2_Sub13_Sub2_4.method4241(Static39.aClass2_Sub13_Sub2_4.anInt4788 - local540);
												continue;
											}
											if (local31 == 5062) {
												local1 -= 2;
												local540 = anIntArray321[local1];
												local545 = anIntArray321[local1 + 1];
												anIntArray321[local1++] = Static344.method5458(local540).aCharArray5[local545];
												continue;
											}
											if (local31 == 5063) {
												local1 -= 2;
												local540 = anIntArray321[local1];
												local545 = anIntArray321[local1 + 1];
												anIntArray321[local1++] = Static344.method5458(local540).aCharArray6[local545];
												continue;
											}
											if (local31 == 5064) {
												local1 -= 2;
												local540 = anIntArray321[local1];
												local545 = anIntArray321[local1 + 1];
												if (local545 == -1) {
													anIntArray321[local1++] = -1;
												} else {
													anIntArray321[local1++] = Static344.method5458(local540).method3520((char) local545);
												}
												continue;
											}
											if (local31 == 5065) {
												local1 -= 2;
												local540 = anIntArray321[local1];
												local545 = anIntArray321[local1 + 1];
												if (local545 == -1) {
													anIntArray321[local1++] = -1;
												} else {
													anIntArray321[local1++] = Static344.method5458(local540).method3515((char) local545);
												}
												continue;
											}
											if (local31 == 5066) {
												local1--;
												local540 = anIntArray321[local1];
												anIntArray321[local1++] = Static145.method2497(local540).method3618();
												continue;
											}
											if (local31 == 5067) {
												local1 -= 2;
												local540 = anIntArray321[local1];
												local545 = anIntArray321[local1 + 1];
												local744 = Static145.method2497(local540).method3625(local545);
												anIntArray321[local1++] = local744;
												continue;
											}
											if (local31 == 5068) {
												local1 -= 2;
												local540 = anIntArray321[local1];
												local545 = anIntArray321[local1 + 1];
												aClass178_1.anIntArray600[local540] = local545;
												continue;
											}
											if (local31 == 5069) {
												local1 -= 2;
												local540 = anIntArray321[local1];
												local545 = anIntArray321[local1 + 1];
												aClass178_1.anIntArray600[local540] = local545;
												continue;
											}
											if (local31 == 5070) {
												local1 -= 3;
												local540 = anIntArray321[local1];
												local545 = anIntArray321[local1 + 1];
												local744 = anIntArray321[local1 + 2];
												@Pc(9455) Class2_Sub1_Sub10 local9455 = Static145.method2497(local540);
												if (local9455.method3625(local545) != 0) {
													throw new RuntimeException("bad command");
												}
												anIntArray321[local1++] = local9455.method3617(local744, local545);
												continue;
											}
											if (local31 == 5071) {
												local3--;
												local352 = aStringArray15[local3];
												local1--;
												local1269 = anIntArray321[local1] == 1;
												Static154.method2581(local352, local1269);
												anIntArray321[local1++] = Static134.anInt2480;
												continue;
											}
											if (local31 == 5072) {
												if (Static240.aShortArray86 != null && Static149.anInt2704 < Static134.anInt2480) {
													anIntArray321[local1++] = Static240.aShortArray86[Static149.anInt2704++] & 0xFFFF;
													continue;
												}
												anIntArray321[local1++] = -1;
												continue;
											}
											if (local31 == 5073) {
												Static149.anInt2704 = 0;
												continue;
											}
										} else if (local31 < 5200) {
											if (local31 == 5100) {
												if (Static129.aClass149_1.method3685(86)) {
													anIntArray321[local1++] = 1;
												} else {
													anIntArray321[local1++] = 0;
												}
												continue;
											}
											if (local31 == 5101) {
												if (Static129.aClass149_1.method3685(82)) {
													anIntArray321[local1++] = 1;
												} else {
													anIntArray321[local1++] = 0;
												}
												continue;
											}
											if (local31 == 5102) {
												if (Static129.aClass149_1.method3685(81)) {
													anIntArray321[local1++] = 1;
												} else {
													anIntArray321[local1++] = 0;
												}
												continue;
											}
										} else {
											@Pc(9978) boolean local9978;
											if (local31 < 5300) {
												if (local31 == 5200) {
													local1--;
													Static311.method4821(anIntArray321[local1]);
													continue;
												}
												if (local31 == 5201) {
													anIntArray321[local1++] = Static245.method3905();
													continue;
												}
												if (local31 == 5205) {
													local1--;
													Static46.method911(-1, false, -1, anIntArray321[local1]);
													continue;
												}
												@Pc(9654) Class2_Sub1_Sub17 local9654;
												if (local31 == 5206) {
													local1--;
													local540 = anIntArray321[local1];
													local9654 = Static302.method469(local540 >> 14 & 0x3FFF, local540 & 0x3FFF);
													if (local9654 == null) {
														anIntArray321[local1++] = -1;
													} else {
														anIntArray321[local1++] = local9654.anInt6753;
													}
													continue;
												}
												@Pc(9678) Class2_Sub1_Sub17 local9678;
												if (local31 == 5207) {
													local1--;
													local9678 = Static302.method470(anIntArray321[local1]);
													if (local9678 != null && local9678.aString66 != null) {
														aStringArray15[local3++] = local9678.aString66;
														continue;
													}
													aStringArray15[local3++] = "";
													continue;
												}
												if (local31 == 5208) {
													anIntArray321[local1++] = Static134.anInt2482;
													anIntArray321[local1++] = Static92.anInt1721;
													continue;
												}
												if (local31 == 5209) {
													anIntArray321[local1++] = Static284.anInt5040 + Static302.anInt396;
													anIntArray321[local1++] = Static318.anInt4656 + Static302.anInt387;
													continue;
												}
												if (local31 == 5210) {
													local1--;
													local540 = anIntArray321[local1];
													local9654 = Static302.method470(local540);
													if (local9654 == null) {
														anIntArray321[local1++] = 0;
														anIntArray321[local1++] = 0;
													} else {
														anIntArray321[local1++] = local9654.anInt6736 >> 14 & 0x3FFF;
														anIntArray321[local1++] = local9654.anInt6736 & 0x3FFF;
													}
													continue;
												}
												if (local31 == 5211) {
													local1--;
													local540 = anIntArray321[local1];
													local9654 = Static302.method470(local540);
													if (local9654 == null) {
														anIntArray321[local1++] = 0;
														anIntArray321[local1++] = 0;
													} else {
														anIntArray321[local1++] = local9654.anInt6738 - local9654.anInt6741;
														anIntArray321[local1++] = local9654.anInt6744 - local9654.anInt6737;
													}
													continue;
												}
												@Pc(9820) Class2_Sub20 local9820;
												if (local31 == 5212) {
													local9820 = Static80.method1437();
													if (local9820 == null) {
														anIntArray321[local1++] = -1;
														anIntArray321[local1++] = -1;
													} else {
														anIntArray321[local1++] = local9820.anInt3000;
														local545 = local9820.anInt2999 << 28 | local9820.anInt2998 + Static302.anInt396 << 14 | local9820.anInt3001 + Static302.anInt387;
														anIntArray321[local1++] = local545;
													}
													continue;
												}
												if (local31 == 5213) {
													local9820 = Static219.method3707();
													if (local9820 == null) {
														anIntArray321[local1++] = -1;
														anIntArray321[local1++] = -1;
													} else {
														anIntArray321[local1++] = local9820.anInt3000;
														local545 = local9820.anInt2999 << 28 | local9820.anInt2998 + Static302.anInt396 << 14 | local9820.anInt3001 + Static302.anInt387;
														anIntArray321[local1++] = local545;
													}
													continue;
												}
												if (local31 == 5214) {
													local1--;
													local540 = anIntArray321[local1];
													local9654 = Static178.method2901();
													if (local9654 != null) {
														local6934 = local9654.method5756(local540 & 0x3FFF, anIntArray322, local540 >> 28 & 0x3, local540 >> 14 & 0x3FFF);
														if (local6934) {
															Static356.method5408(anIntArray322[1], anIntArray322[2]);
														}
													}
													continue;
												}
												if (local31 == 5215) {
													local1 -= 2;
													local540 = anIntArray321[local1];
													local545 = anIntArray321[local1 + 1];
													@Pc(9976) Class174 local9976 = Static302.method485(local540 >> 14 & 0x3FFF, local540 & 0x3FFF);
													local9978 = false;
													for (@Pc(9983) Class2_Sub1_Sub17 local9983 = (Class2_Sub1_Sub17) local9976.method4102(); local9983 != null; local9983 = (Class2_Sub1_Sub17) local9976.method4098()) {
														if (local9983.anInt6753 == local545) {
															local9978 = true;
															break;
														}
													}
													if (local9978) {
														anIntArray321[local1++] = 1;
													} else {
														anIntArray321[local1++] = 0;
													}
													continue;
												}
												if (local31 == 5218) {
													local1--;
													local540 = anIntArray321[local1];
													local9654 = Static302.method470(local540);
													if (local9654 == null) {
														anIntArray321[local1++] = -1;
													} else {
														anIntArray321[local1++] = local9654.anInt6746;
													}
													continue;
												}
												if (local31 == 5220) {
													anIntArray321[local1++] = Static74.anInt4012 == 100 ? 1 : 0;
													continue;
												}
												if (local31 == 5221) {
													local1--;
													local540 = anIntArray321[local1];
													Static356.method5408(local540 >> 14 & 0x3FFF, local540 & 0x3FFF);
													continue;
												}
												if (local31 == 5222) {
													local9678 = Static178.method2901();
													if (local9678 == null) {
														anIntArray321[local1++] = -1;
														anIntArray321[local1++] = -1;
													} else {
														local1269 = local9678.method5755(Static284.anInt5040 + Static302.anInt396, Static318.anInt4656 + Static302.anInt387, anIntArray322);
														if (local1269) {
															anIntArray321[local1++] = anIntArray322[1];
															anIntArray321[local1++] = anIntArray322[2];
														} else {
															anIntArray321[local1++] = -1;
															anIntArray321[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5223) {
													local1 -= 2;
													local540 = anIntArray321[local1];
													local545 = anIntArray321[local1 + 1];
													Static46.method911(local545 & 0x3FFF, false, local545 >> 14 & 0x3FFF, local540);
													continue;
												}
												if (local31 == 5224) {
													local1--;
													local540 = anIntArray321[local1];
													local9654 = Static178.method2901();
													if (local9654 == null) {
														anIntArray321[local1++] = -1;
														anIntArray321[local1++] = -1;
													} else {
														local6934 = local9654.method5756(local540 & 0x3FFF, anIntArray322, local540 >> 28 & 0x3, local540 >> 14 & 0x3FFF);
														if (local6934) {
															anIntArray321[local1++] = anIntArray322[1];
															anIntArray321[local1++] = anIntArray322[2];
														} else {
															anIntArray321[local1++] = -1;
															anIntArray321[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5225) {
													local1--;
													local540 = anIntArray321[local1];
													local9654 = Static178.method2901();
													if (local9654 == null) {
														anIntArray321[local1++] = -1;
														anIntArray321[local1++] = -1;
													} else {
														local6934 = local9654.method5755(local540 >> 14 & 0x3FFF, local540 & 0x3FFF, anIntArray322);
														if (local6934) {
															anIntArray321[local1++] = anIntArray322[1];
															anIntArray321[local1++] = anIntArray322[2];
														} else {
															anIntArray321[local1++] = -1;
															anIntArray321[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5226) {
													local1--;
													Static82.method1455(anIntArray321[local1]);
													continue;
												}
												if (local31 == 5227) {
													local1 -= 2;
													local540 = anIntArray321[local1];
													local545 = anIntArray321[local1 + 1];
													Static46.method911(local545 & 0x3FFF, true, local545 >> 14 & 0x3FFF, local540);
													continue;
												}
												if (local31 == 5228) {
													local1--;
													Static327.aBoolean446 = anIntArray321[local1] == 1;
													continue;
												}
												if (local31 == 5229) {
													anIntArray321[local1++] = Static327.aBoolean446 ? 1 : 0;
													continue;
												}
												if (local31 == 5230) {
													local1--;
													local540 = anIntArray321[local1];
													Static79.method1412(local540);
													continue;
												}
												@Pc(10394) Class2 local10394;
												if (local31 == 5231) {
													local1 -= 2;
													local540 = anIntArray321[local1];
													local1269 = anIntArray321[local1 + 1] == 1;
													if (Static214.aClass214_23 == null) {
														continue;
													}
													local10394 = Static214.aClass214_23.method5059((long) local540);
													if (local10394 != null && !local1269) {
														local10394.method5745();
														continue;
													}
													if (local10394 == null && local1269) {
														local10394 = new Class2();
														Static214.aClass214_23.method5065((long) local540, local10394);
													}
													continue;
												}
												@Pc(10433) Class2 local10433;
												if (local31 == 5232) {
													local1--;
													local540 = anIntArray321[local1];
													if (Static214.aClass214_23 == null) {
														anIntArray321[local1++] = 0;
													} else {
														local10433 = Static214.aClass214_23.method5059((long) local540);
														anIntArray321[local1++] = local10433 == null ? 0 : 1;
													}
													continue;
												}
												if (local31 == 5233) {
													local1 -= 2;
													local540 = anIntArray321[local1];
													local1269 = anIntArray321[local1 + 1] == 1;
													if (Static265.aClass214_26 == null) {
														continue;
													}
													local10394 = Static265.aClass214_26.method5059((long) local540);
													if (local10394 != null && !local1269) {
														local10394.method5745();
														continue;
													}
													if (local10394 == null && local1269) {
														local10394 = new Class2();
														Static265.aClass214_26.method5065((long) local540, local10394);
													}
													continue;
												}
												if (local31 == 5234) {
													local1--;
													local540 = anIntArray321[local1];
													if (Static265.aClass214_26 == null) {
														anIntArray321[local1++] = 0;
													} else {
														local10433 = Static265.aClass214_26.method5059((long) local540);
														anIntArray321[local1++] = local10433 == null ? 0 : 1;
													}
													continue;
												}
												if (local31 == 5235) {
													anIntArray321[local1++] = Static302.aClass2_Sub1_Sub17_2 == null ? -1 : Static302.aClass2_Sub1_Sub17_2.anInt6753;
													continue;
												}
											} else if (local31 < 5400) {
												if (local31 == 5300) {
													local1 -= 2;
													local540 = anIntArray321[local1];
													local545 = anIntArray321[local1 + 1];
													Static295.method4662(local545, 3, false, local540);
													anIntArray321[local1++] = Static363.aFrame4 == null ? 0 : 1;
													continue;
												}
												if (local31 == 5301) {
													if (Static363.aFrame4 != null) {
														Static295.method4662(-1, Static365.anInt2296, false, -1);
													}
													continue;
												}
												if (local31 == 5302) {
													@Pc(10596) Class196[] local10596 = Static354.method5363();
													anIntArray321[local1++] = local10596.length;
													continue;
												}
												if (local31 == 5303) {
													local1--;
													local540 = anIntArray321[local1];
													@Pc(10614) Class196[] local10614 = Static354.method5363();
													anIntArray321[local1++] = local10614[local540].anInt5452;
													anIntArray321[local1++] = local10614[local540].anInt5445;
													continue;
												}
												if (local31 == 5305) {
													local540 = Static123.anInt2360;
													local545 = Static11.anInt3910;
													local744 = -1;
													@Pc(10643) Class196[] local10643 = Static354.method5363();
													for (local414 = 0; local414 < local10643.length; local414++) {
														@Pc(10650) Class196 local10650 = local10643[local414];
														if (local10650.anInt5452 == local540 && local10650.anInt5445 == local545) {
															local744 = local414;
															break;
														}
													}
													anIntArray321[local1++] = local744;
													continue;
												}
												if (local31 == 5306) {
													anIntArray321[local1++] = Static238.method3868();
													continue;
												}
												if (local31 == 5307) {
													local1--;
													local540 = anIntArray321[local1];
													if (local540 >= 1 && local540 <= 2) {
														Static295.method4662(-1, local540, false, -1);
													}
													continue;
												}
												if (local31 == 5308) {
													anIntArray321[local1++] = Static365.anInt2296;
													continue;
												}
												if (local31 == 5309) {
													local1--;
													local540 = anIntArray321[local1];
													if (local540 >= 1 && local540 <= 2) {
														Static365.anInt2296 = local540;
														Static30.method724(Static92.aClass53_2);
													}
													continue;
												}
											} else {
												@Pc(11105) String local11105;
												if (local31 < 5500) {
													if (local31 == 5400) {
														local3 -= 2;
														local352 = aStringArray15[local3];
														local1702 = aStringArray15[local3 + 1];
														local1--;
														local744 = anIntArray321[local1];
														Static19.method552(Static175.aClass41_154);
														Static39.aClass2_Sub13_Sub2_4.method4207(Static346.method5273(local352) + Static346.method5273(local1702) + 1);
														Static39.aClass2_Sub13_Sub2_4.method4230(local352);
														Static39.aClass2_Sub13_Sub2_4.method4230(local1702);
														Static39.aClass2_Sub13_Sub2_4.method4207(local744);
														continue;
													}
													if (local31 == 5401) {
														local1 -= 2;
														Static243.aShortArray87[anIntArray321[local1]] = (short) Static56.method1074(anIntArray321[local1 + 1]);
														Static106.aClass250_1.method5726();
														Static106.aClass250_1.method5730();
														Static274.aClass151_4.method3709();
														Static303.method4753();
														continue;
													}
													if (local31 == 5405) {
														local1 -= 2;
														local540 = anIntArray321[local1];
														local545 = anIntArray321[local1 + 1];
														if (local540 >= 0 && local540 < 2) {
															Static339.anIntArrayArrayArray13[local540] = new int[local545 << 1][4];
														}
														continue;
													}
													if (local31 == 5406) {
														local1 -= 7;
														local540 = anIntArray321[local1];
														local545 = anIntArray321[local1 + 1] << 1;
														local744 = anIntArray321[local1 + 2];
														local395 = anIntArray321[local1 + 3];
														local414 = anIntArray321[local1 + 4];
														local775 = anIntArray321[local1 + 5];
														@Pc(10891) int local10891 = anIntArray321[local1 + 6];
														if (local540 >= 0 && local540 < 2 && Static339.anIntArrayArrayArray13[local540] != null && local545 >= 0 && local545 < Static339.anIntArrayArrayArray13[local540].length) {
															Static339.anIntArrayArrayArray13[local540][local545] = new int[] { (local744 >> 14 & 0x3FFF) * 128, local395, (local744 & 0x3FFF) * 128, local10891 };
															Static339.anIntArrayArrayArray13[local540][local545 + 1] = new int[] { (local414 >> 14 & 0x3FFF) * 128, local775, (local414 & 0x3FFF) * 128 };
														}
														continue;
													}
													if (local31 == 5407) {
														local1--;
														local540 = Static339.anIntArrayArrayArray13[anIntArray321[local1]].length >> 1;
														anIntArray321[local1++] = local540;
														continue;
													}
													if (local31 == 5411) {
														if (Static363.aFrame4 != null) {
															Static295.method4662(-1, Static365.anInt2296, false, -1);
														}
														if (Static154.aFrame1 == null) {
															local352 = Static17.aString2 == null ? Static153.method2580() : Static17.aString2;
															Static104.method1848(Static92.aClass53_2, local352, false, Static123.anInt2363 == 1);
														} else {
															Static367.method5541();
															System.exit(0);
														}
														continue;
													}
													if (local31 == 5419) {
														local352 = "";
														if (Static120.aClass1_5 != null) {
															if (Static120.aClass1_5.anObject1 == null) {
																local352 = Static178.method2900(Static120.aClass1_5.anInt1);
															} else {
																local352 = (String) Static120.aClass1_5.anObject1;
															}
														}
														aStringArray15[local3++] = local352;
														continue;
													}
													if (local31 == 5420) {
														anIntArray321[local1++] = Static65.anInt1255 == 3 ? 1 : 0;
														continue;
													}
													if (local31 == 5421) {
														if (Static363.aFrame4 != null) {
															Static295.method4662(-1, Static365.anInt2296, false, -1);
														}
														local3--;
														local352 = aStringArray15[local3];
														local1--;
														local1269 = anIntArray321[local1] == 1;
														local11105 = Static153.method2580() + local352;
														Static104.method1848(Static92.aClass53_2, local11105, local1269, Static123.anInt2363 == 1);
														continue;
													}
													if (local31 == 5422) {
														local3 -= 2;
														local352 = aStringArray15[local3];
														local1702 = aStringArray15[local3 + 1];
														local1--;
														local744 = anIntArray321[local1];
														if (local352.length() > 0) {
															if (Static363.aStringArray37 == null) {
																Static363.aStringArray37 = new String[Static80.anIntArray201[Static209.aClass48_2.anInt1208]];
															}
															Static363.aStringArray37[local744] = local352;
														}
														if (local1702.length() > 0) {
															if (Static144.aStringArray14 == null) {
																Static144.aStringArray14 = new String[Static80.anIntArray201[Static209.aClass48_2.anInt1208]];
															}
															Static144.aStringArray14[local744] = local1702;
														}
														continue;
													}
													if (local31 == 5423) {
														local3--;
														System.out.println(aStringArray15[local3]);
														continue;
													}
													if (local31 == 5424) {
														local1 -= 11;
														Static267.anInt4716 = anIntArray321[local1];
														Static307.anInt5483 = anIntArray321[local1 + 1];
														Static195.anInt3566 = anIntArray321[local1 + 2];
														Static207.anInt3849 = anIntArray321[local1 + 3];
														Static172.anInt3061 = anIntArray321[local1 + 4];
														Static178.anInt3184 = anIntArray321[local1 + 5];
														Static342.anInt6049 = anIntArray321[local1 + 6];
														Static110.anInt2201 = anIntArray321[local1 + 7];
														Static10.anInt312 = anIntArray321[local1 + 8];
														Static175.anInt5035 = anIntArray321[local1 + 9];
														Static383.anInt6652 = anIntArray321[local1 + 10];
														Static119.aClass71_25.method1560(Static172.anInt3061);
														Static119.aClass71_25.method1560(Static178.anInt3184);
														Static119.aClass71_25.method1560(Static342.anInt6049);
														Static119.aClass71_25.method1560(Static110.anInt2201);
														Static119.aClass71_25.method1560(Static10.anInt312);
														Static213.aClass5_4 = null;
														Class2_Sub6_Sub4_Sub1.lb = null;
														Static91.aClass5_2 = null;
														Static245.aClass5_5 = null;
														Static284.aClass5_8 = null;
														Static359.aClass5_15 = null;
														Static306.aClass5_10 = null;
														Static284.aClass5_7 = null;
														Static372.aBoolean487 = true;
														continue;
													}
													if (local31 == 5425) {
														Static172.method2808();
														Static372.aBoolean487 = false;
														continue;
													}
													if (local31 == 5426) {
														local1 -= 2;
														Static29.anInt669 = anIntArray321[local1];
														Static356.anInt6263 = anIntArray321[local1 + 1];
														continue;
													}
													if (local31 == 5427) {
														local1 -= 2;
														Static359.anInt6307 = anIntArray321[local1 + 1];
														continue;
													}
													if (local31 == 5428) {
														local1 -= 2;
														local540 = anIntArray321[local1];
														local545 = anIntArray321[local1 + 1];
														anIntArray321[local1++] = Static243.method3903(local540, local545) ? 1 : 0;
														continue;
													}
													if (local31 == 5429) {
														local3--;
														Static71.method1292(aStringArray15[local3], false);
														continue;
													}
												} else if (local31 < 5600) {
													if (local31 == 5500) {
														local1 -= 4;
														local540 = anIntArray321[local1];
														local545 = anIntArray321[local1 + 1];
														local744 = anIntArray321[local1 + 2];
														local395 = anIntArray321[local1 + 3];
														Static377.method5662(local545, local395, (local540 >> 14 & 0x3FFF) - Static376.anInt6607, (local540 & 0x3FFF) - Static133.anInt2474, local744, false);
														continue;
													}
													if (local31 == 5501) {
														local1 -= 4;
														local540 = anIntArray321[local1];
														local545 = anIntArray321[local1 + 1];
														local744 = anIntArray321[local1 + 2];
														local395 = anIntArray321[local1 + 3];
														Static63.method1159(local744, local395, (local540 & 0x3FFF) - Static133.anInt2474, local545, (local540 >> 14 & 0x3FFF) - Static376.anInt6607);
														continue;
													}
													if (local31 == 5502) {
														local1 -= 6;
														local540 = anIntArray321[local1];
														if (local540 >= 2) {
															throw new RuntimeException();
														}
														Static53.anInt1096 = local540;
														local545 = anIntArray321[local1 + 1];
														if (local545 + 1 >= Static339.anIntArrayArrayArray13[Static53.anInt1096].length >> 1) {
															throw new RuntimeException();
														}
														Static24.anInt586 = local545;
														Static237.anInt4349 = 0;
														Static53.anInt1093 = anIntArray321[local1 + 2];
														Static304.anInt2195 = anIntArray321[local1 + 3];
														local744 = anIntArray321[local1 + 4];
														if (local744 >= 2) {
															throw new RuntimeException();
														}
														Static159.anInt2909 = local744;
														local395 = anIntArray321[local1 + 5];
														if (local395 + 1 >= Static339.anIntArrayArrayArray13[Static159.anInt2909].length >> 1) {
															throw new RuntimeException();
														}
														Static265.anInt4676 = local395;
														Static283.anInt5017 = 3;
														continue;
													}
													if (local31 == 5503) {
														Static307.method4777();
														continue;
													}
													if (local31 == 5504) {
														local1 -= 2;
														Static111.method2141(anIntArray321[local1], anIntArray321[local1 + 1]);
														continue;
													}
													if (local31 == 5505) {
														anIntArray321[local1++] = (int) Static295.aFloat73 >> 3;
														continue;
													}
													if (local31 == 5506) {
														anIntArray321[local1++] = (int) Static18.aFloat8 >> 3;
														continue;
													}
													if (local31 == 5507) {
														Static206.method3518();
														continue;
													}
													if (local31 == 5508) {
														Static306.method4758();
														continue;
													}
													if (local31 == 5509) {
														Static317.method4927();
														continue;
													}
													if (local31 == 5510) {
														Static133.method2331();
														continue;
													}
													if (local31 == 5511) {
														local1--;
														local540 = anIntArray321[local1];
														local545 = local540 >> 14 & 0x3FFF;
														local744 = local540 & 0x3FFF;
														local545 -= Static376.anInt6607;
														if (local545 < 0) {
															local545 = 0;
														} else if (local545 >= Static392.anInt6751) {
															local545 = Static392.anInt6751;
														}
														local744 -= Static133.anInt2474;
														if (local744 < 0) {
															local744 = 0;
														} else if (local744 >= Static307.anInt5484) {
															local744 = Static307.anInt5484;
														}
														Static332.anInt5822 = local545 * 128 + 64;
														Static290.anInt5133 = local744 * 128 + 64;
														Static283.anInt5017 = 4;
														continue;
													}
													if (local31 == 5512) {
														Static377.method5660();
														continue;
													}
												} else if (local31 < 5700) {
													if (local31 == 5600) {
														local3 -= 2;
														local352 = aStringArray15[local3];
														local1702 = aStringArray15[local3 + 1];
														local1--;
														local744 = anIntArray321[local1];
														if (Static344.anInt6327 == 10 && Static255.anInt1792 == 0 && Static251.anInt4517 == 0 && Static289.anInt5127 == 0 && Static99.anInt1958 == 0) {
															Static355.method5385(local1702, local744, local352);
														}
														continue;
													}
													if (local31 == 5601) {
														Static199.method3341();
														continue;
													}
													if (local31 == 5602) {
														if (Static251.anInt4517 == 0) {
															Static217.anInt4042 = -2;
														}
														continue;
													}
													if (local31 == 5603) {
														local1 -= 4;
														if (Static344.anInt6327 == 10 && Static255.anInt1792 == 0 && Static251.anInt4517 == 0 && Static289.anInt5127 == 0 && Static99.anInt1958 == 0) {
															Static26.method680(anIntArray321[local1 + 1], anIntArray321[local1], anIntArray321[local1 + 3], anIntArray321[local1 + 2]);
														}
														continue;
													}
													if (local31 == 5604) {
														local3--;
														if (Static344.anInt6327 == 10 && Static255.anInt1792 == 0 && Static251.anInt4517 == 0 && Static289.anInt5127 == 0 && Static99.anInt1958 == 0) {
															Static136.method2380(Static389.method5718(aStringArray15[local3]));
														}
														continue;
													}
													if (local31 == 5605) {
														local3 -= 3;
														local1 -= 7;
														if (Static344.anInt6327 == 10 && Static255.anInt1792 == 0 && Static251.anInt4517 == 0 && Static289.anInt5127 == 0 && Static99.anInt1958 == 0) {
															Static266.method4108(anIntArray321[local1 + 5] == 1, aStringArray15[local3 + 1], anIntArray321[local1 + 1], anIntArray321[local1 + 4] == 1, anIntArray321[local1 + 6] == 1, aStringArray15[local3 + 2], anIntArray321[local1 + 3], anIntArray321[local1], Static389.method5718(aStringArray15[local3]), anIntArray321[local1 + 2]);
														}
														continue;
													}
													if (local31 == 5606) {
														if (Static289.anInt5127 == 0) {
															Static304.anInt2193 = -2;
														}
														continue;
													}
													if (local31 == 5607) {
														anIntArray321[local1++] = Static217.anInt4042;
														continue;
													}
													if (local31 == 5608) {
														anIntArray321[local1++] = Static281.anInt4956;
														continue;
													}
													if (local31 == 5609) {
														anIntArray321[local1++] = Static304.anInt2193;
														continue;
													}
													if (local31 == 5610) {
														for (local540 = 0; local540 < 5; local540++) {
															aStringArray15[local3++] = Static227.aStringArray27.length > local540 ? Static163.method2689(Static227.aStringArray27[local540]) : "";
														}
														Static227.aStringArray27 = null;
														continue;
													}
													if (local31 == 5611) {
														anIntArray321[local1++] = Static5.anInt6727;
														continue;
													}
												} else if (local31 < 6100) {
													if (local31 == 6001) {
														local1--;
														local540 = anIntArray321[local1];
														if (local540 < 1) {
															local540 = 1;
														}
														if (local540 > 4) {
															local540 = 4;
														}
														Static146.anInt2670 = local540;
														Static385.method5708();
														Static30.method724(Static92.aClass53_2);
														Static218.aBoolean305 = false;
														continue;
													}
													if (local31 == 6002) {
														local1--;
														Static276.method4295(anIntArray321[local1] == 1);
														Static385.method5708();
														Static283.method4365();
														Static30.method724(Static92.aClass53_2);
														Static218.aBoolean305 = false;
														continue;
													}
													if (local31 == 6003) {
														local1--;
														Static136.aBoolean194 = anIntArray321[local1] == 1;
														Static283.method4365();
														Static30.method724(Static92.aClass53_2);
														Static218.aBoolean305 = false;
														continue;
													}
													if (local31 == 6005) {
														local1--;
														Static364.aBoolean378 = anIntArray321[local1] == 1;
														Static385.method5708();
														Static30.method724(Static92.aClass53_2);
														Static218.aBoolean305 = false;
														continue;
													}
													if (local31 == 6006) {
														local1--;
														Static264.aBoolean341 = anIntArray321[local1] == 1;
														Static304.aClass82_4.method4459(!Static264.aBoolean341);
														Static30.method724(Static92.aClass53_2);
														Static218.aBoolean305 = false;
														continue;
													}
													if (local31 == 6007) {
														local1--;
														Static235.anInt4315 = anIntArray321[local1];
														Static30.method724(Static92.aClass53_2);
														Static218.aBoolean305 = false;
														continue;
													}
													if (local31 == 6008) {
														local1--;
														Static364.aBoolean379 = anIntArray321[local1] == 1;
														Static30.method724(Static92.aClass53_2);
														Static218.aBoolean305 = false;
														continue;
													}
													if (local31 == 6009) {
														local1--;
														Static158.aBoolean211 = anIntArray321[local1] == 1;
														Static385.method5708();
														Static30.method724(Static92.aClass53_2);
														Static218.aBoolean305 = false;
														continue;
													}
													if (local31 == 6010) {
														local1--;
														Static80.aBoolean128 = anIntArray321[local1] == 1;
														Static30.method724(Static92.aClass53_2);
														Static218.aBoolean305 = false;
														continue;
													}
													if (local31 == 6011) {
														local1--;
														local540 = anIntArray321[local1];
														if (local540 < 0 || local540 > 2) {
															local540 = 0;
														}
														Static193.anInt6663 = local540;
														Static385.method5708();
														Static30.method724(Static92.aClass53_2);
														Static218.aBoolean305 = false;
														continue;
													}
													if (local31 == 6012) {
														local1--;
														Static37.aBoolean52 = anIntArray321[local1] == 1;
														Static6.method193();
														Static30.method724(Static92.aClass53_2);
														Static218.aBoolean305 = false;
														continue;
													}
													if (local31 == 6014) {
														local1--;
														Static194.aBoolean254 = anIntArray321[local1] == 1;
														Static385.method5708();
														Static30.method724(Static92.aClass53_2);
														Static218.aBoolean305 = false;
														continue;
													}
													if (local31 == 6015) {
														local1--;
														Static116.aBoolean177 = anIntArray321[local1] == 1;
														Static385.method5708();
														Static30.method724(Static92.aClass53_2);
														Static218.aBoolean305 = false;
														continue;
													}
													if (local31 == 6016) {
														local1--;
														local540 = anIntArray321[local1];
														if (local540 < 0 || local540 > 2) {
															local540 = 0;
														}
														Static34.anInt734 = local540;
														Static215.method3636();
														Static30.method724(Static92.aClass53_2);
														continue;
													}
													if (local31 == 6017) {
														local1--;
														Static265.aBoolean343 = anIntArray321[local1] == 1;
														Static133.method2329();
														Static30.method724(Static92.aClass53_2);
														Static218.aBoolean305 = false;
														continue;
													}
													if (local31 == 6018) {
														local1--;
														local540 = anIntArray321[local1];
														if (local540 < 0) {
															local540 = 0;
														}
														if (local540 > 127) {
															local540 = 127;
														}
														Static107.anInt2129 = local540;
														Static30.method724(Static92.aClass53_2);
														Static218.aBoolean305 = false;
														continue;
													}
													if (local31 == 6019) {
														local1--;
														local540 = anIntArray321[local1];
														if (local540 < 0) {
															local540 = 0;
														}
														if (local540 > 255) {
															local540 = 255;
														}
														if (local540 != Static193.anInt6666) {
															if (Static193.anInt6666 == 0 && Static4.anInt147 != -1) {
																Static267.method4129(local540, Static4.anInt147, Static161.aClass71_37);
																Static327.aBoolean445 = false;
															} else if (local540 == 0) {
																Static277.method2507();
																Static327.aBoolean445 = false;
															} else {
																Static182.method2943(local540);
															}
															Static193.anInt6666 = local540;
														}
														Static30.method724(Static92.aClass53_2);
														Static218.aBoolean305 = false;
														continue;
													}
													if (local31 == 6020) {
														local1--;
														local540 = anIntArray321[local1];
														if (local540 < 0) {
															local540 = 0;
														}
														if (local540 > 127) {
															local540 = 127;
														}
														Static16.anInt400 = local540;
														Static30.method724(Static92.aClass53_2);
														Static218.aBoolean305 = false;
														continue;
													}
													if (local31 == 6021) {
														local1--;
														Static19.aBoolean31 = anIntArray321[local1] == 1;
														Static283.method4365();
														continue;
													}
													if (local31 == 6023) {
														local1--;
														local540 = anIntArray321[local1];
														local1269 = false;
														if (local540 < 0) {
															local540 = 0;
														}
														if (local540 > 2) {
															local540 = 2;
														}
														if (Static314.anInt5576 < 96) {
															local540 = 0;
															local1269 = true;
														}
														Static346.method5275(local540);
														Static30.method724(Static92.aClass53_2);
														Static218.aBoolean305 = false;
														anIntArray321[local1++] = local1269 ? 0 : 1;
														continue;
													}
													if (local31 == 6024) {
														local1--;
														local540 = anIntArray321[local1];
														if (local540 < 0 || local540 > 2) {
															local540 = 0;
														}
														Static1.anInt41 = local540;
														Static30.method724(Static92.aClass53_2);
														continue;
													}
													if (local31 == 6025) {
														local1--;
														local540 = anIntArray321[local1];
														if (local540 < 0 || local540 > Static45.method2429(Static314.anInt5576)) {
															local540 = 0;
														}
														Static301.anInt5429 = local540;
														Static30.method724(Static92.aClass53_2);
														Static218.aBoolean305 = false;
														continue;
													}
													if (local31 == 6027) {
														local1--;
														local540 = anIntArray321[local1];
														if (local540 < 0 || local540 > 1) {
															local540 = 0;
														}
														Static171.method2806(local540 == 1);
														continue;
													}
													if (local31 == 6028) {
														local1--;
														Static180.aBoolean232 = anIntArray321[local1] != 0;
														Static30.method724(Static92.aClass53_2);
														continue;
													}
													if (local31 == 6029) {
														local1--;
														Static235.anInt4315 = anIntArray321[local1];
														Static30.method724(Static92.aClass53_2);
														continue;
													}
													if (local31 == 6030) {
														local1--;
														Static265.aBoolean344 = anIntArray321[local1] != 0;
														Static30.method724(Static92.aClass53_2);
														Static385.method5708();
														continue;
													}
													if (local31 == 6031) {
														local1--;
														local540 = anIntArray321[local1];
														if (local540 < 0 || local540 > 3) {
															local540 = 2;
														}
														Static200.method3348(local540);
														continue;
													}
													if (local31 == 6032) {
														local1--;
														local540 = anIntArray321[local1];
														if (local540 < 0 || local540 > 3) {
															local540 = 2;
														}
														Static193.anInt6668 = local540;
														Static30.method724(Static92.aClass53_2);
														Static218.aBoolean305 = false;
														continue;
													}
													if (local31 == 6033) {
														local1--;
														local540 = anIntArray321[local1];
														if (local540 < 0 || local540 > 4) {
															local540 = 2;
														}
														Static244.anInt1013 = local540;
														Static30.method724(Static92.aClass53_2);
														continue;
													}
												} else if (local31 < 6200) {
													if (local31 == 6101) {
														anIntArray321[local1++] = Static146.anInt2670;
														continue;
													}
													if (local31 == 6102) {
														anIntArray321[local1++] = Static43.method900() ? 1 : 0;
														continue;
													}
													if (local31 == 6103) {
														anIntArray321[local1++] = Static136.aBoolean194 ? 1 : 0;
														continue;
													}
													if (local31 == 6105) {
														anIntArray321[local1++] = Static364.aBoolean378 ? 1 : 0;
														continue;
													}
													if (local31 == 6106) {
														anIntArray321[local1++] = Static264.aBoolean341 ? 1 : 0;
														continue;
													}
													if (local31 == 6107) {
														anIntArray321[local1++] = Static235.anInt4315;
														continue;
													}
													if (local31 == 6108) {
														anIntArray321[local1++] = Static364.aBoolean379 ? 1 : 0;
														continue;
													}
													if (local31 == 6109) {
														anIntArray321[local1++] = Static158.aBoolean211 ? 1 : 0;
														continue;
													}
													if (local31 == 6110) {
														anIntArray321[local1++] = Static80.aBoolean128 ? 1 : 0;
														continue;
													}
													if (local31 == 6111) {
														anIntArray321[local1++] = Static193.anInt6663;
														continue;
													}
													if (local31 == 6112) {
														anIntArray321[local1++] = Static37.aBoolean52 ? 1 : 0;
														continue;
													}
													if (local31 == 6114) {
														anIntArray321[local1++] = Static194.aBoolean254 ? 1 : 0;
														continue;
													}
													if (local31 == 6115) {
														anIntArray321[local1++] = Static116.aBoolean177 ? 1 : 0;
														continue;
													}
													if (local31 == 6116) {
														anIntArray321[local1++] = Static34.anInt734;
														continue;
													}
													if (local31 == 6117) {
														anIntArray321[local1++] = Static265.aBoolean343 ? 1 : 0;
														continue;
													}
													if (local31 == 6118) {
														anIntArray321[local1++] = Static107.anInt2129;
														continue;
													}
													if (local31 == 6119) {
														anIntArray321[local1++] = Static193.anInt6666;
														continue;
													}
													if (local31 == 6120) {
														anIntArray321[local1++] = Static16.anInt400;
														continue;
													}
													if (local31 == 6121) {
														anIntArray321[local1++] = Static304.aClass82_4.method4471() ? 1 : 0;
														continue;
													}
													if (local31 == 6123) {
														anIntArray321[local1++] = Static142.method3057();
														continue;
													}
													if (local31 == 6124) {
														anIntArray321[local1++] = Static1.anInt41;
														continue;
													}
													if (local31 == 6125) {
														anIntArray321[local1++] = Static301.anInt5429;
														continue;
													}
													if (local31 == 6126) {
														anIntArray321[local1++] = Static304.aClass82_4.method4484() ? 1 : 0;
														continue;
													}
													if (local31 == 6127) {
														anIntArray321[local1++] = Static168.aBoolean222 ? 1 : 0;
														continue;
													}
													if (local31 == 6128) {
														anIntArray321[local1++] = Static180.aBoolean232 ? 1 : 0;
														continue;
													}
													if (local31 == 6129) {
														anIntArray321[local1++] = Static235.anInt4315;
														continue;
													}
													if (local31 == 6130) {
														anIntArray321[local1++] = Static265.aBoolean344 ? 1 : 0;
														continue;
													}
													if (local31 == 6131) {
														anIntArray321[local1++] = Static123.anInt2363;
														continue;
													}
													if (local31 == 6132) {
														anIntArray321[local1++] = Static193.anInt6668;
														continue;
													}
													if (local31 == 6133) {
														anIntArray321[local1++] = Static65.anInt1255 == 1 || Static65.anInt1255 == 4 ? 1 : 0;
														continue;
													}
													if (local31 == 6134) {
														anIntArray321[local1++] = Static45.method2429(Static314.anInt5576);
														continue;
													}
													if (local31 == 6135) {
														anIntArray321[local1++] = Static244.anInt1013;
														continue;
													}
												} else if (local31 < 6300) {
													if (local31 == 6200) {
														local1 -= 2;
														Static43.aShort14 = (short) anIntArray321[local1];
														if (Static43.aShort14 <= 0) {
															Static43.aShort14 = 256;
														}
														Static170.aShort23 = (short) anIntArray321[local1 + 1];
														if (Static170.aShort23 <= 0) {
															Static170.aShort23 = 205;
														}
														continue;
													}
													if (local31 == 6201) {
														local1 -= 2;
														Static134.aShort20 = (short) anIntArray321[local1];
														if (Static134.aShort20 <= 0) {
															Static134.aShort20 = 256;
														}
														Static38.aShort13 = (short) anIntArray321[local1 + 1];
														if (Static38.aShort13 <= 0) {
															Static38.aShort13 = 320;
														}
														continue;
													}
													if (local31 == 6202) {
														local1 -= 4;
														Static276.aShort68 = (short) anIntArray321[local1];
														if (Static276.aShort68 <= 0) {
															Static276.aShort68 = 1;
														}
														Static138.aShort22 = (short) anIntArray321[local1 + 1];
														if (Static138.aShort22 <= 0) {
															Static138.aShort22 = 32767;
														} else if (Static138.aShort22 < Static276.aShort68) {
															Static138.aShort22 = Static276.aShort68;
														}
														Static242.aShort66 = (short) anIntArray321[local1 + 2];
														if (Static242.aShort66 <= 0) {
															Static242.aShort66 = 1;
														}
														Static79.aShort15 = (short) anIntArray321[local1 + 3];
														if (Static79.aShort15 <= 0) {
															Static79.aShort15 = 32767;
														} else if (Static79.aShort15 < Static242.aShort66) {
															Static79.aShort15 = Static242.aShort66;
														}
														continue;
													}
													if (local31 == 6203) {
														Static365.method2199(Static291.aClass155_28.anInt4170, 0, false, Static291.aClass155_28.anInt4214, 0);
														anIntArray321[local1++] = Static244.anInt1026;
														anIntArray321[local1++] = Static108.anInt2142;
														continue;
													}
													if (local31 == 6204) {
														anIntArray321[local1++] = Static134.aShort20;
														anIntArray321[local1++] = Static38.aShort13;
														continue;
													}
													if (local31 == 6205) {
														anIntArray321[local1++] = Static43.aShort14;
														anIntArray321[local1++] = Static170.aShort23;
														continue;
													}
												} else if (local31 < 6400) {
													if (local31 == 6300) {
														anIntArray321[local1++] = (int) (Static51.method979() / 60000L);
														continue;
													}
													if (local31 == 6301) {
														anIntArray321[local1++] = (int) (Static51.method979() / 86400000L) - 11745;
														continue;
													}
													if (local31 == 6302) {
														local1 -= 3;
														local540 = anIntArray321[local1];
														local545 = anIntArray321[local1 + 1];
														local744 = anIntArray321[local1 + 2];
														aCalendar1.clear();
														aCalendar1.set(11, 12);
														aCalendar1.set(local744, local545, local540);
														anIntArray321[local1++] = (int) (aCalendar1.getTime().getTime() / 86400000L) - 11745;
														continue;
													}
													if (local31 == 6303) {
														aCalendar1.clear();
														aCalendar1.setTime(new Date(Static51.method979()));
														anIntArray321[local1++] = aCalendar1.get(1);
														continue;
													}
													if (local31 == 6304) {
														local1--;
														local540 = anIntArray321[local1];
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
														anIntArray321[local1++] = local1269 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6500) {
													if (local31 == 6405) {
														anIntArray321[local1++] = Static204.method3410() ? 1 : 0;
														continue;
													}
													if (local31 == 6406) {
														anIntArray321[local1++] = Static56.method1071() ? 1 : 0;
														continue;
													}
												} else if (local31 < 6600) {
													if (local31 == 6500) {
														if (Static344.anInt6327 == 10 && Static255.anInt1792 == 0 && Static251.anInt4517 == 0 && Static289.anInt5127 == 0) {
															anIntArray321[local1++] = Static373.method5597() == -1 ? 0 : 1;
															continue;
														}
														anIntArray321[local1++] = 1;
														continue;
													}
													@Pc(13410) Class243 local13410;
													@Pc(13386) Class141_Sub1 local13386;
													if (local31 == 6501) {
														local13386 = Static376.method5647();
														if (local13386 == null) {
															anIntArray321[local1++] = -1;
															anIntArray321[local1++] = 0;
															aStringArray15[local3++] = "";
															anIntArray321[local1++] = 0;
															aStringArray15[local3++] = "";
															anIntArray321[local1++] = 0;
															anIntArray321[local1++] = 0;
														} else {
															anIntArray321[local1++] = local13386.anInt6672;
															anIntArray321[local1++] = local13386.anInt6667;
															aStringArray15[local3++] = local13386.aString62;
															local13410 = local13386.method5706();
															anIntArray321[local1++] = local13410.anInt6549;
															aStringArray15[local3++] = local13410.aString61;
															anIntArray321[local1++] = local13386.anInt6662;
															anIntArray321[local1++] = local13386.anInt6673;
														}
														continue;
													}
													if (local31 == 6502) {
														local13386 = Static107.method2074();
														if (local13386 == null) {
															anIntArray321[local1++] = -1;
															anIntArray321[local1++] = 0;
															aStringArray15[local3++] = "";
															anIntArray321[local1++] = 0;
															aStringArray15[local3++] = "";
															anIntArray321[local1++] = 0;
															anIntArray321[local1++] = 0;
														} else {
															anIntArray321[local1++] = local13386.anInt6672;
															anIntArray321[local1++] = local13386.anInt6667;
															aStringArray15[local3++] = local13386.aString62;
															local13410 = local13386.method5706();
															anIntArray321[local1++] = local13410.anInt6549;
															aStringArray15[local3++] = local13410.aString61;
															anIntArray321[local1++] = local13386.anInt6662;
															anIntArray321[local1++] = local13386.anInt6673;
														}
														continue;
													}
													if (local31 == 6503) {
														local1--;
														local540 = anIntArray321[local1];
														if (Static344.anInt6327 == 10 && Static255.anInt1792 == 0 && Static251.anInt4517 == 0 && Static289.anInt5127 == 0) {
															anIntArray321[local1++] = Static246.method3927(local540) ? 1 : 0;
															continue;
														}
														anIntArray321[local1++] = 0;
														continue;
													}
													if (local31 == 6504) {
														local1--;
														Static37.anInt767 = anIntArray321[local1];
														Static30.method724(Static92.aClass53_2);
														continue;
													}
													if (local31 == 6505) {
														anIntArray321[local1++] = Static37.anInt767;
														continue;
													}
													if (local31 == 6506) {
														local1--;
														local540 = anIntArray321[local1];
														@Pc(13630) Class141_Sub1 local13630 = Static106.method1856(local540);
														if (local13630 == null) {
															anIntArray321[local1++] = -1;
															aStringArray15[local3++] = "";
															anIntArray321[local1++] = 0;
															aStringArray15[local3++] = "";
															anIntArray321[local1++] = 0;
															anIntArray321[local1++] = 0;
														} else {
															anIntArray321[local1++] = local13630.anInt6667;
															aStringArray15[local3++] = local13630.aString62;
															@Pc(13648) Class243 local13648 = local13630.method5706();
															anIntArray321[local1++] = local13648.anInt6549;
															aStringArray15[local3++] = local13648.aString61;
															anIntArray321[local1++] = local13630.anInt6662;
															anIntArray321[local1++] = local13630.anInt6673;
														}
														continue;
													}
													if (local31 == 6507) {
														local1 -= 4;
														local540 = anIntArray321[local1];
														local1269 = anIntArray321[local1 + 1] == 1;
														local744 = anIntArray321[local1 + 2];
														local9978 = anIntArray321[local1 + 3] == 1;
														Static390.method5724(local9978, local540, local744, local1269);
														continue;
													}
													if (local31 == 6508) {
														Static266.method4110();
														continue;
													}
													if (local31 == 6509) {
														if (Static344.anInt6327 == 10) {
															local1--;
															Static165.aBoolean219 = anIntArray321[local1] == 1;
														}
														continue;
													}
												} else if (local31 < 6700) {
													if (local31 == 6600) {
														local1--;
														Static223.aBoolean308 = anIntArray321[local1] == 1;
														Static30.method724(Static92.aClass53_2);
														continue;
													}
													if (local31 == 6601) {
														anIntArray321[local1++] = Static223.aBoolean308 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6800 && Static249.aClass75_2 == Static228.aClass75_1) {
													if (local31 == 6700) {
														local540 = Static362.aClass214_32.method5066();
														if (Static226.anInt4223 != -1) {
															local540++;
														}
														anIntArray321[local1++] = local540;
														continue;
													}
													if (local31 == 6701) {
														local1--;
														local540 = anIntArray321[local1];
														if (Static226.anInt4223 != -1) {
															if (local540 == 0) {
																anIntArray321[local1++] = Static226.anInt4223;
																continue;
															}
															local540--;
														}
														local3554 = (Class2_Sub41) Static362.aClass214_32.method5060();
														while (local540-- > 0) {
															local3554 = (Class2_Sub41) Static362.aClass214_32.method5064();
														}
														anIntArray321[local1++] = local3554.anInt6411;
														continue;
													}
													if (local31 == 6702) {
														local1--;
														local540 = anIntArray321[local1];
														if (Static228.aClass155ArrayArray1[local540] == null) {
															aStringArray15[local3++] = "";
														} else {
															local1702 = Static228.aClass155ArrayArray1[local540][0].aString35;
															if (local1702 == null) {
																aStringArray15[local3++] = "";
															} else {
																aStringArray15[local3++] = local1702.substring(0, local1702.indexOf(58));
															}
														}
														continue;
													}
													if (local31 == 6703) {
														local1--;
														local540 = anIntArray321[local1];
														if (Static228.aClass155ArrayArray1[local540] == null) {
															anIntArray321[local1++] = 0;
														} else {
															anIntArray321[local1++] = Static228.aClass155ArrayArray1[local540].length;
														}
														continue;
													}
													if (local31 == 6704) {
														local1 -= 2;
														local540 = anIntArray321[local1];
														local545 = anIntArray321[local1 + 1];
														if (Static228.aClass155ArrayArray1[local540] == null) {
															aStringArray15[local3++] = "";
														} else {
															local11105 = Static228.aClass155ArrayArray1[local540][local545].aString35;
															if (local11105 == null) {
																aStringArray15[local3++] = "";
															} else {
																aStringArray15[local3++] = local11105;
															}
														}
														continue;
													}
													if (local31 == 6705) {
														local1 -= 2;
														local540 = anIntArray321[local1];
														local545 = anIntArray321[local1 + 1];
														if (Static228.aClass155ArrayArray1[local540] == null) {
															anIntArray321[local1++] = 0;
														} else {
															anIntArray321[local1++] = Static228.aClass155ArrayArray1[local540][local545].anInt4160;
														}
														continue;
													}
													if (local31 == 6706) {
														continue;
													}
													if (local31 == 6707) {
														local1 -= 3;
														local540 = anIntArray321[local1];
														local545 = anIntArray321[local1 + 1];
														local744 = anIntArray321[local1 + 2];
														Static360.method5471(1, local744, "", local540 << 16 | local545);
														continue;
													}
													if (local31 == 6708) {
														local1 -= 3;
														local540 = anIntArray321[local1];
														local545 = anIntArray321[local1 + 1];
														local744 = anIntArray321[local1 + 2];
														Static360.method5471(2, local744, "", local540 << 16 | local545);
														continue;
													}
													if (local31 == 6709) {
														local1 -= 3;
														local540 = anIntArray321[local1];
														local545 = anIntArray321[local1 + 1];
														local744 = anIntArray321[local1 + 2];
														Static360.method5471(3, local744, "", local540 << 16 | local545);
														continue;
													}
													if (local31 == 6710) {
														local1 -= 3;
														local540 = anIntArray321[local1];
														local545 = anIntArray321[local1 + 1];
														local744 = anIntArray321[local1 + 2];
														Static360.method5471(4, local744, "", local540 << 16 | local545);
														continue;
													}
													if (local31 == 6711) {
														local1 -= 3;
														local540 = anIntArray321[local1];
														local545 = anIntArray321[local1 + 1];
														local744 = anIntArray321[local1 + 2];
														Static360.method5471(5, local744, "", local540 << 16 | local545);
														continue;
													}
													if (local31 == 6712) {
														local1 -= 3;
														local540 = anIntArray321[local1];
														local545 = anIntArray321[local1 + 1];
														local744 = anIntArray321[local1 + 2];
														Static360.method5471(6, local744, "", local540 << 16 | local545);
														continue;
													}
													if (local31 == 6713) {
														local1 -= 3;
														local540 = anIntArray321[local1];
														local545 = anIntArray321[local1 + 1];
														local744 = anIntArray321[local1 + 2];
														Static360.method5471(7, local744, "", local540 << 16 | local545);
														continue;
													}
													if (local31 == 6714) {
														local1 -= 3;
														local540 = anIntArray321[local1];
														local545 = anIntArray321[local1 + 1];
														local744 = anIntArray321[local1 + 2];
														Static360.method5471(8, local744, "", local540 << 16 | local545);
														continue;
													}
													if (local31 == 6715) {
														local1 -= 3;
														local540 = anIntArray321[local1];
														local545 = anIntArray321[local1 + 1];
														local744 = anIntArray321[local1 + 2];
														Static360.method5471(9, local744, "", local540 << 16 | local545);
														continue;
													}
													if (local31 == 6716) {
														local1 -= 3;
														local540 = anIntArray321[local1];
														local545 = anIntArray321[local1 + 1];
														local744 = anIntArray321[local1 + 2];
														Static360.method5471(10, local744, "", local540 << 16 | local545);
														continue;
													}
													if (local31 == 6717) {
														local1 -= 3;
														local540 = anIntArray321[local1];
														local545 = anIntArray321[local1 + 1];
														local744 = anIntArray321[local1 + 2];
														local754 = Static257.method5607(local744, local540 << 16 | local545);
														Static327.method5048();
														@Pc(14365) Class2_Sub35 local14365 = Static41.method878(local754);
														Static143.method2457(local540 << 16 | local545, local14365.anInt5880, local744, local14365.method5123(), local754.anInt4158, local754.anInt4153);
														continue;
													}
												} else if (local31 < 6900) {
													@Pc(14399) Class80 local14399;
													if (local31 == 6800) {
														local1--;
														local540 = anIntArray321[local1];
														local14399 = Static240.aClass211_4.method5049(local540);
														if (local14399.aString23 == null) {
															aStringArray15[local3++] = "";
														} else {
															aStringArray15[local3++] = local14399.aString23;
														}
														continue;
													}
													if (local31 == 6801) {
														local1--;
														local540 = anIntArray321[local1];
														local14399 = Static240.aClass211_4.method5049(local540);
														anIntArray321[local1++] = local14399.anInt2037;
														continue;
													}
													if (local31 == 6802) {
														local1--;
														local540 = anIntArray321[local1];
														local14399 = Static240.aClass211_4.method5049(local540);
														anIntArray321[local1++] = local14399.anInt2055;
														continue;
													}
													if (local31 == 6803) {
														local1--;
														local540 = anIntArray321[local1];
														local14399 = Static240.aClass211_4.method5049(local540);
														anIntArray321[local1++] = local14399.anInt2039;
														continue;
													}
													if (local31 == 6804) {
														local1 -= 2;
														local540 = anIntArray321[local1];
														local545 = anIntArray321[local1 + 1];
														local7383 = Static82.aClass184_1.method4403(local545);
														if (local7383.method1397()) {
															aStringArray15[local3++] = Static240.aClass211_4.method5049(local540).method1841(local7383.aString20, local545);
														} else {
															anIntArray321[local1++] = Static240.aClass211_4.method5049(local540).method1851(local7383.anInt1488, local545);
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
			if (arg0.aString42 == null) {
				local14550 = new StringBuffer(30);
				local14550.append("CS2: ").append(arg0.aLong208).append(" ");
				for (local540 = anInt2799 - 1; local540 >= 0; local540--) {
					local14550.append("v: ").append(aClass66Array1[local540].aClass2_Sub1_Sub11_1.aLong208).append(" ");
				}
				local14550.append("op: ").append(local13);
				Static235.method3843(local14550.toString(), local14532);
			} else {
				Static366.method5530("Clientscript error in: " + arg0.aString42);
				local14550 = new StringBuffer(30);
				local14550.append("Clientscript error in: ").append(arg0.aString42).append("\n");
				for (local540 = anInt2799 - 1; local540 >= 0; local540--) {
					local14550.append("via: ").append(aClass66Array1[local540].aClass2_Sub1_Sub11_1.aString42).append("\n");
				}
				local14550.append("Op: ").append(local13).append("\n");
				local1702 = local14532.getMessage();
				if (local1702 != null && local1702.length() > 0) {
					local14550.append("Message: ").append(local1702).append("\n");
				}
				Static235.method3843(local14550.toString(), local14532);
				Static32.method5235(local14550.toString());
			}
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!lh;I)V")
	private static void method2602(@OriginalArg(0) Class2_Sub24 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray5;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class2_Sub1_Sub11 local12 = Static284.method4382(local8);
		if (local12 == null) {
			return;
		}
		anIntArray320 = new int[local12.anInt4335];
		@Pc(21) int local21 = 0;
		aStringArray16 = new String[local12.anInt4337];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt3666;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt3669;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass155_23 == null ? -1 : arg0.aClass155_23.anInt4166;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt3671;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass155_23 == null ? -1 : arg0.aClass155_23.anInt4135;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass155_24 == null ? -1 : arg0.aClass155_24.anInt4166;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass155_24 == null ? -1 : arg0.aClass155_24.anInt4135;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt3664;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt3673;
				}
				anIntArray320[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString30;
				}
				aStringArray16[local27++] = local135;
			}
		}
		method2601(local12, arg1);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!lh;)V")
	public static void method2604(@OriginalArg(0) Class2_Sub24 arg0) {
		method2602(arg0, 200000);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!lm;II)V")
	public static void method2605(@OriginalArg(0) Class144 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class2_Sub1_Sub11 local5 = Static264.method4095(arg0, arg2, arg1);
		if (local5 == null) {
			return;
		}
		anIntArray320 = new int[local5.anInt4335];
		aStringArray16 = new String[local5.anInt4337];
		if (local5.aClass144_9 == Static26.aClass144_1 || local5.aClass144_9 == Static101.aClass144_4 || local5.aClass144_9 == Static215.aClass144_7) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static360.aClass155_37 != null) {
				local30 = Static360.aClass155_37.anInt4189;
				local32 = Static360.aClass155_37.anInt4206;
			}
			anIntArray320[0] = Static138.aClass78_1.method1804() - local30;
			anIntArray320[1] = Static138.aClass78_1.method1808() - local32;
		}
		method2601(local5, 200000);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)V")
	public static void method2606(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static138.method2407(arg0)) {
			return;
		}
		@Pc(12) Class155[] local12 = Static228.aClass155ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class155 local19 = local12[local14];
			if (local19.anObjectArray12 != null) {
				@Pc(26) Class2_Sub24 local26 = new Class2_Sub24();
				local26.aClass155_23 = local19;
				local26.anObjectArray5 = local19.anObjectArray12;
				method2602(local26, 2000000);
			}
		}
	}
}
