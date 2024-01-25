import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!ui", name = "j", descriptor = "Lclient!ab;")
	private static Class3 aClass3_16;

	@OriginalMember(owner = "client!ui", name = "k", descriptor = "Lclient!ab;")
	private static Class3 aClass3_17;

	@OriginalMember(owner = "client!ui", name = "l", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray40;

	@OriginalMember(owner = "client!ui", name = "m", descriptor = "Lclient!qj;")
	private static Class193 aClass193_1;

	@OriginalMember(owner = "client!ui", name = "v", descriptor = "[I")
	private static int[] anIntArray549;

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "[I")
	private static final int[] anIntArray547 = new int[5];

	@OriginalMember(owner = "client!ui", name = "i", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray39 = new String[1000];

	@OriginalMember(owner = "client!ui", name = "n", descriptor = "[Lclient!or;")
	private static final Class175[] aClass175Array1 = new Class175[50];

	@OriginalMember(owner = "client!ui", name = "q", descriptor = "[[I")
	private static final int[][] anIntArrayArray57 = new int[5][5000];

	@OriginalMember(owner = "client!ui", name = "r", descriptor = "[I")
	private static final int[] anIntArray548 = new int[1000];

	@OriginalMember(owner = "client!ui", name = "s", descriptor = "I")
	private static int anInt6479 = 0;

	@OriginalMember(owner = "client!ui", name = "x", descriptor = "Lclient!co;")
	public static final Class41 aClass41_71 = new Class41(4);

	@OriginalMember(owner = "client!ui", name = "y", descriptor = "[I")
	private static final int[] anIntArray550 = new int[3];

	@OriginalMember(owner = "client!ui", name = "z", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray41 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!lc;II)V")
	public static void method5587(@OriginalArg(0) Class136 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class2_Sub7_Sub8 local5 = Static36.method2334(arg1, arg2, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray549 = new int[local5.anInt3129];
		aStringArray40 = new String[local5.anInt3135];
		if (local5.aClass136_4 == Static60.aClass136_3 || local5.aClass136_4 == Static348.aClass136_10 || local5.aClass136_4 == Static234.aClass136_7) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static85.aClass3_8 != null) {
				local30 = Static85.aClass3_8.anInt114;
				local32 = Static85.aClass3_8.anInt50;
			}
			anIntArray549[0] = Static136.aClass91_2.method5223() - local30;
			anIntArray549[1] = Static136.aClass91_2.method5224() - local32;
		}
		method5590(local5, 200000);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!bk;I)V")
	private static void method5588(@OriginalArg(0) Class2_Sub5 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray33;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class2_Sub7_Sub8 local12 = Static295.method4834(local8);
		if (local12 == null) {
			return;
		}
		anIntArray549 = new int[local12.anInt3129];
		@Pc(21) int local21 = 0;
		aStringArray40 = new String[local12.anInt3135];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt482;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt479;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass3_4 == null ? -1 : arg0.aClass3_4.anInt94;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt473;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass3_4 == null ? -1 : arg0.aClass3_4.anInt45;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass3_3 == null ? -1 : arg0.aClass3_3.anInt94;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass3_3 == null ? -1 : arg0.aClass3_3.anInt45;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt474;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt478;
				}
				anIntArray549[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString7;
				}
				aStringArray40[local27++] = local135;
			}
		}
		method5590(local12, arg1);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!bk;)V")
	public static void method5589(@OriginalArg(0) Class2_Sub5 arg0) {
		method5588(arg0, 200000);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!ih;I)V")
	private static void method5590(@OriginalArg(0) Class2_Sub7_Sub8 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray243;
		@Pc(11) int[] local11 = arg0.anIntArray244;
		@Pc(13) byte local13 = -1;
		anInt6479 = 0;
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
						anIntArray548[local1++] = local11[local5];
						continue;
					}
					@Pc(51) int local51;
					if (local31 == 1) {
						local51 = local11[local5];
						anIntArray548[local1++] = Static179.aClass115_1.anIntArray257[local51];
						continue;
					}
					if (local31 == 2) {
						local51 = local11[local5];
						local1--;
						Static179.aClass115_1.method2780(anIntArray548[local1], local51);
						continue;
					}
					if (local31 == 3) {
						aStringArray39[local3++] = arg0.aStringArray15[local5];
						continue;
					}
					if (local31 == 6) {
						local5 += local11[local5];
						continue;
					}
					if (local31 == 7) {
						local1 -= 2;
						if (anIntArray548[local1] != anIntArray548[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 8) {
						local1 -= 2;
						if (anIntArray548[local1] == anIntArray548[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 9) {
						local1 -= 2;
						if (anIntArray548[local1] < anIntArray548[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 10) {
						local1 -= 2;
						if (anIntArray548[local1] > anIntArray548[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 21) {
						if (anInt6479 == 0) {
							return;
						}
						@Pc(192) Class175 local192 = aClass175Array1[--anInt6479];
						arg0 = local192.aClass2_Sub7_Sub8_1;
						local8 = arg0.anIntArray243;
						local11 = arg0.anIntArray244;
						local5 = local192.anInt4865;
						anIntArray549 = local192.anIntArray398;
						aStringArray40 = local192.aStringArray26;
						continue;
					}
					if (local31 == 25) {
						local51 = local11[local5];
						anIntArray548[local1++] = Static179.aClass115_1.method2774(local51);
						continue;
					}
					if (local31 == 27) {
						local51 = local11[local5];
						local1--;
						Static179.aClass115_1.method2776(local51, anIntArray548[local1]);
						continue;
					}
					if (local31 == 31) {
						local1 -= 2;
						if (anIntArray548[local1] <= anIntArray548[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 32) {
						local1 -= 2;
						if (anIntArray548[local1] >= anIntArray548[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 33) {
						anIntArray548[local1++] = anIntArray549[local11[local5]];
						continue;
					}
					@Pc(303) int local303;
					if (local31 == 34) {
						local303 = local11[local5];
						local1--;
						anIntArray549[local303] = anIntArray548[local1];
						continue;
					}
					if (local31 == 35) {
						aStringArray39[local3++] = aStringArray40[local11[local5]];
						continue;
					}
					if (local31 == 36) {
						local303 = local11[local5];
						local3--;
						aStringArray40[local303] = aStringArray39[local3];
						continue;
					}
					if (local31 == 37) {
						local51 = local11[local5];
						local3 -= local51;
						local352 = Static274.method4592(aStringArray39, local51, local3);
						aStringArray39[local3++] = local352;
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
						@Pc(379) Class2_Sub7_Sub8 local379 = Static295.method4834(local51);
						if (local379 == null) {
							throw new RuntimeException();
						}
						@Pc(389) int[] local389 = new int[local379.anInt3129];
						@Pc(393) String[] local393 = new String[local379.anInt3135];
						for (local395 = 0; local395 < local379.anInt3132; local395++) {
							local389[local395] = anIntArray548[local1 + local395 - local379.anInt3132];
						}
						for (local414 = 0; local414 < local379.anInt3133; local414++) {
							local393[local414] = aStringArray39[local3 + local414 - local379.anInt3133];
						}
						local1 -= local379.anInt3132;
						local3 -= local379.anInt3133;
						@Pc(445) Class175 local445 = new Class175();
						local445.aClass2_Sub7_Sub8_1 = arg0;
						local445.anInt4865 = local5;
						local445.anIntArray398 = anIntArray549;
						local445.aStringArray26 = aStringArray40;
						if (anInt6479 >= aClass175Array1.length) {
							throw new RuntimeException();
						}
						aClass175Array1[anInt6479++] = local445;
						arg0 = local379;
						local8 = local379.anIntArray243;
						local11 = local379.anIntArray244;
						local5 = -1;
						anIntArray549 = local389;
						aStringArray40 = local393;
						continue;
					}
					if (local31 == 42) {
						anIntArray548[local1++] = Static318.anIntArray509[local11[local5]];
						continue;
					}
					if (local31 == 43) {
						local51 = local11[local5];
						local1--;
						Static318.anIntArray509[local51] = anIntArray548[local1];
						Static373.method5932(local51);
						Static176.aBoolean269 |= Static137.aBooleanArray7[local51];
						continue;
					}
					if (local31 == 44) {
						local51 = local11[local5] >> 16;
						local540 = local11[local5] & 0xFFFF;
						local1--;
						local545 = anIntArray548[local1];
						if (local545 >= 0 && local545 <= 5000) {
							anIntArray547[local51] = local545;
							@Pc(560) byte local560 = -1;
							if (local540 == 105) {
								local560 = 0;
							}
							local395 = 0;
							while (true) {
								if (local395 >= local545) {
									continue label4494;
								}
								anIntArrayArray57[local51][local395] = local560;
								local395++;
							}
						}
						throw new RuntimeException();
					}
					if (local31 == 45) {
						local51 = local11[local5];
						local1--;
						local540 = anIntArray548[local1];
						if (local540 >= 0 && local540 < anIntArray547[local51]) {
							anIntArray548[local1++] = anIntArrayArray57[local51][local540];
							continue;
						}
						throw new RuntimeException();
					}
					if (local31 == 46) {
						local51 = local11[local5];
						local1 -= 2;
						local540 = anIntArray548[local1];
						if (local540 >= 0 && local540 < anIntArray547[local51]) {
							anIntArrayArray57[local51][local540] = anIntArray548[local1 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local31 == 47) {
						@Pc(655) String local655 = Static197.aStringArray20[local11[local5]];
						if (local655 == null) {
							local655 = "null";
						}
						aStringArray39[local3++] = local655;
						continue;
					}
					if (local31 == 48) {
						local51 = local11[local5];
						local3--;
						Static197.aStringArray20[local51] = aStringArray39[local3];
						Static338.method5446(local51);
						continue;
					}
					if (local31 == 51) {
						@Pc(693) Class243 local693 = arg0.aClass243Array1[local11[local5]];
						local1--;
						@Pc(703) Class2_Sub16 local703 = (Class2_Sub16) local693.method5967((long) anIntArray548[local1]);
						if (local703 != null) {
							local5 += local703.anInt2601;
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
				@Pc(856) Class3 local856;
				@Pc(754) Class3 local754;
				@Pc(923) Class3 local923;
				if (local31 < 300) {
					if (local31 == 100) {
						local1 -= 3;
						local540 = anIntArray548[local1];
						local545 = anIntArray548[local1 + 1];
						local744 = anIntArray548[local1 + 2];
						if (local545 == 0) {
							throw new RuntimeException();
						}
						local754 = Static380.method5987(local540);
						if (local754.aClass3Array1 == null) {
							local754.aClass3Array1 = new Class3[local744 + 1];
						}
						if (local754.aClass3Array1.length <= local744) {
							@Pc(773) Class3[] local773 = new Class3[local744 + 1];
							for (local775 = 0; local775 < local754.aClass3Array1.length; local775++) {
								local773[local775] = local754.aClass3Array1[local775];
							}
							local754.aClass3Array1 = local773;
						}
						if (local744 > 0 && local754.aClass3Array1[local744 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local744 - 1));
						}
						@Pc(818) Class3 local818 = new Class3();
						local818.anInt91 = local545;
						local818.anInt87 = local818.anInt94 = local754.anInt94;
						local818.anInt45 = local744;
						local754.aClass3Array1[local744] = local818;
						if (local718) {
							aClass3_17 = local818;
						} else {
							aClass3_16 = local818;
						}
						Static128.method2229(local754);
						continue;
					}
					@Pc(877) Class3 local877;
					if (local31 == 101) {
						local856 = local718 ? aClass3_17 : aClass3_16;
						if (local856.anInt45 == -1) {
							if (local718) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						local877 = Static380.method5987(local856.anInt94);
						local877.aClass3Array1[local856.anInt45] = null;
						Static128.method2229(local877);
						continue;
					}
					if (local31 == 102) {
						local1--;
						local856 = Static380.method5987(anIntArray548[local1]);
						local856.aClass3Array1 = null;
						Static128.method2229(local856);
						continue;
					}
					if (local31 == 200) {
						local1 -= 2;
						local540 = anIntArray548[local1];
						local545 = anIntArray548[local1 + 1];
						local923 = Static134.method2355(local545, local540);
						if (local923 != null && local545 != -1) {
							anIntArray548[local1++] = 1;
							if (local718) {
								aClass3_17 = local923;
							} else {
								aClass3_16 = local923;
							}
							continue;
						}
						anIntArray548[local1++] = 0;
						continue;
					}
					if (local31 == 201) {
						local1--;
						local540 = anIntArray548[local1];
						local877 = Static380.method5987(local540);
						if (local877 == null) {
							anIntArray548[local1++] = 0;
						} else {
							anIntArray548[local1++] = 1;
							if (local718) {
								aClass3_17 = local877;
							} else {
								aClass3_16 = local877;
							}
						}
						continue;
					}
				} else {
					@Pc(1073) boolean local1073;
					if (local31 < 500) {
						if (local31 == 403) {
							local1 -= 2;
							local540 = anIntArray548[local1];
							local545 = anIntArray548[local1 + 1];
							for (local744 = 0; local744 < Static98.anIntArray171.length; local744++) {
								if (Static98.anIntArray171[local744] == local540) {
									Static182.aClass1_Sub2_Sub1_Sub1_1.aClass158_1.method3951(local744, local545, Static182.aClass170_2);
									continue label4494;
								}
							}
							local395 = 0;
							while (true) {
								if (local395 >= Static176.anIntArray278.length) {
									continue label4494;
								}
								if (Static176.anIntArray278[local395] == local540) {
									Static182.aClass1_Sub2_Sub1_Sub1_1.aClass158_1.method3951(local395, local545, Static182.aClass170_2);
									continue label4494;
								}
								local395++;
							}
						}
						if (local31 == 404) {
							local1 -= 2;
							local540 = anIntArray548[local1];
							local545 = anIntArray548[local1 + 1];
							Static182.aClass1_Sub2_Sub1_Sub1_1.aClass158_1.method3952(local540, local545);
							continue;
						}
						if (local31 == 410) {
							local1--;
							local1073 = anIntArray548[local1] != 0;
							Static182.aClass1_Sub2_Sub1_Sub1_1.aClass158_1.method3949(local1073);
							continue;
						}
					} else {
						@Pc(1269) boolean local1269;
						if (local31 >= 1000 && local31 < 1100 || !(local31 < 2000 || local31 >= 2100)) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local856 = Static380.method5987(anIntArray548[local1]);
							} else {
								local856 = local718 ? aClass3_17 : aClass3_16;
							}
							if (local31 == 1000) {
								local1 -= 4;
								local856.anInt41 = anIntArray548[local1];
								local856.anInt40 = anIntArray548[local1 + 1];
								local545 = anIntArray548[local1 + 2];
								if (local545 < 0) {
									local545 = 0;
								} else if (local545 > 5) {
									local545 = 5;
								}
								local744 = anIntArray548[local1 + 3];
								if (local744 < 0) {
									local744 = 0;
								} else if (local744 > 5) {
									local744 = 5;
								}
								local856.aByte2 = (byte) local545;
								local856.aByte4 = (byte) local744;
								Static128.method2229(local856);
								Static145.method4762(local856);
								if (local856.anInt45 == -1) {
									Static299.method4904(local856.anInt94);
								}
								continue;
							}
							if (local31 == 1001) {
								local1 -= 4;
								local856.anInt52 = anIntArray548[local1];
								local856.anInt58 = anIntArray548[local1 + 1];
								local856.anInt70 = 0;
								local856.anInt97 = 0;
								local545 = anIntArray548[local1 + 2];
								if (local545 < 0) {
									local545 = 0;
								} else if (local545 > 4) {
									local545 = 4;
								}
								local744 = anIntArray548[local1 + 3];
								if (local744 < 0) {
									local744 = 0;
								} else if (local744 > 4) {
									local744 = 4;
								}
								local856.aByte1 = (byte) local545;
								local856.aByte3 = (byte) local744;
								Static128.method2229(local856);
								Static145.method4762(local856);
								if (local856.anInt91 == 0) {
									Static378.method4266(local856, false);
								}
								continue;
							}
							if (local31 == 1003) {
								local1--;
								local1269 = anIntArray548[local1] == 1;
								if (local856.aBoolean12 != local1269) {
									local856.aBoolean12 = local1269;
									Static128.method2229(local856);
								}
								if (local856.anInt45 == -1) {
									Static38.method537(local856.anInt94);
								}
								continue;
							}
							if (local31 == 1004) {
								local1 -= 2;
								local856.anInt95 = anIntArray548[local1];
								local856.anInt98 = anIntArray548[local1 + 1];
								Static128.method2229(local856);
								Static145.method4762(local856);
								if (local856.anInt91 == 0) {
									Static378.method4266(local856, false);
								}
								continue;
							}
							if (local31 == 1005) {
								local1--;
								local856.aBoolean5 = anIntArray548[local1] == 1;
								continue;
							}
						} else if (local31 >= 1100 && local31 < 1200 || local31 >= 2100 && local31 < 2200) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local856 = Static380.method5987(anIntArray548[local1]);
							} else {
								local856 = local718 ? aClass3_17 : aClass3_16;
							}
							if (local31 == 1100) {
								local1 -= 2;
								local856.anInt81 = anIntArray548[local1];
								if (local856.anInt81 > local856.anInt76 - local856.anInt64) {
									local856.anInt81 = local856.anInt76 - local856.anInt64;
								}
								if (local856.anInt81 < 0) {
									local856.anInt81 = 0;
								}
								local856.anInt93 = anIntArray548[local1 + 1];
								if (local856.anInt93 > local856.anInt111 - local856.anInt116) {
									local856.anInt93 = local856.anInt111 - local856.anInt116;
								}
								if (local856.anInt93 < 0) {
									local856.anInt93 = 0;
								}
								Static128.method2229(local856);
								if (local856.anInt45 == -1) {
									Static141.method2428(local856.anInt94);
								}
								continue;
							}
							if (local31 == 1101) {
								local1--;
								local856.anInt103 = anIntArray548[local1];
								Static128.method2229(local856);
								if (local856.anInt45 == -1) {
									Static195.method3550(local856.anInt94);
								}
								continue;
							}
							if (local31 == 1102) {
								local1--;
								local856.aBoolean10 = anIntArray548[local1] == 1;
								Static128.method2229(local856);
								continue;
							}
							if (local31 == 1103) {
								local1--;
								local856.anInt85 = anIntArray548[local1];
								Static128.method2229(local856);
								continue;
							}
							if (local31 == 1104) {
								local1--;
								local856.anInt55 = anIntArray548[local1];
								Static128.method2229(local856);
								continue;
							}
							if (local31 == 1105) {
								local1--;
								local545 = anIntArray548[local1];
								if (local856.anInt42 != local545) {
									local856.anInt42 = local545;
									Static128.method2229(local856);
								}
								if (local856.anInt45 == -1) {
									Static42.method587(local856.anInt94);
								}
								continue;
							}
							if (local31 == 1106) {
								local1--;
								local856.anInt100 = anIntArray548[local1];
								Static128.method2229(local856);
								continue;
							}
							if (local31 == 1107) {
								local1--;
								local856.aBoolean18 = anIntArray548[local1] == 1;
								Static128.method2229(local856);
								continue;
							}
							if (local31 == 1108) {
								local856.anInt63 = 1;
								local1--;
								local856.anInt101 = anIntArray548[local1];
								Static128.method2229(local856);
								if (local856.anInt45 == -1) {
									Static153.method2740(local856.anInt94);
								}
								continue;
							}
							if (local31 == 1109) {
								local1 -= 6;
								local856.anInt57 = anIntArray548[local1];
								local856.anInt117 = anIntArray548[local1 + 1];
								local856.anInt44 = anIntArray548[local1 + 2];
								local856.anInt105 = anIntArray548[local1 + 3];
								local856.anInt102 = anIntArray548[local1 + 4];
								local856.anInt68 = anIntArray548[local1 + 5];
								Static128.method2229(local856);
								if (local856.anInt45 == -1) {
									Static190.method3484(local856.anInt94);
									Static47.method609(local856.anInt94);
								}
								continue;
							}
							if (local31 == 1110) {
								local1--;
								local545 = anIntArray548[local1];
								if (local856.anInt48 != local545) {
									local856.anInt48 = local545;
									local856.anInt82 = 0;
									local856.anInt80 = 1;
									local856.anInt112 = 0;
									Static128.method2229(local856);
								}
								if (local856.anInt45 == -1) {
									Static89.method1499(local856.anInt94);
								}
								continue;
							}
							if (local31 == 1111) {
								local1--;
								local856.aBoolean15 = anIntArray548[local1] == 1;
								Static128.method2229(local856);
								continue;
							}
							if (local31 == 1112) {
								local3--;
								local1702 = aStringArray39[local3];
								if (!local1702.equals(local856.aString4)) {
									local856.aString4 = local1702;
									Static128.method2229(local856);
								}
								if (local856.anInt45 == -1) {
									Static275.method5400(local856.anInt94);
								}
								continue;
							}
							if (local31 == 1113) {
								local1--;
								local856.anInt108 = anIntArray548[local1];
								Static128.method2229(local856);
								if (local856.anInt45 == -1) {
									Static54.method844(local856.anInt94);
								}
								continue;
							}
							if (local31 == 1114) {
								local1 -= 3;
								local856.anInt74 = anIntArray548[local1];
								local856.anInt96 = anIntArray548[local1 + 1];
								local856.anInt43 = anIntArray548[local1 + 2];
								Static128.method2229(local856);
								continue;
							}
							if (local31 == 1115) {
								local1--;
								local856.aBoolean7 = anIntArray548[local1] == 1;
								Static128.method2229(local856);
								continue;
							}
							if (local31 == 1116) {
								local1--;
								local856.anInt110 = anIntArray548[local1];
								Static128.method2229(local856);
								continue;
							}
							if (local31 == 1117) {
								local1--;
								local856.anInt113 = anIntArray548[local1];
								Static128.method2229(local856);
								continue;
							}
							if (local31 == 1118) {
								local1--;
								local856.aBoolean11 = anIntArray548[local1] == 1;
								Static128.method2229(local856);
								continue;
							}
							if (local31 == 1119) {
								local1--;
								local856.aBoolean14 = anIntArray548[local1] == 1;
								Static128.method2229(local856);
								continue;
							}
							if (local31 == 1120) {
								local1 -= 2;
								local856.anInt76 = anIntArray548[local1];
								local856.anInt111 = anIntArray548[local1 + 1];
								Static128.method2229(local856);
								if (local856.anInt91 == 0) {
									Static378.method4266(local856, false);
								}
								continue;
							}
							if (local31 == 1121) {
								local1 -= 2;
								local856.aShort2 = (short) anIntArray548[local1];
								local856.aShort1 = (short) anIntArray548[local1 + 1];
								Static128.method2229(local856);
								continue;
							}
							if (local31 == 1122) {
								local1--;
								local856.aBoolean3 = anIntArray548[local1] == 1;
								Static128.method2229(local856);
								continue;
							}
							if (local31 == 1123) {
								local1--;
								local856.anInt68 = anIntArray548[local1];
								Static128.method2229(local856);
								if (local856.anInt45 == -1) {
									Static190.method3484(local856.anInt94);
								}
								continue;
							}
							if (local31 == 1124) {
								local1--;
								local545 = anIntArray548[local1];
								local856.aBoolean13 = local545 == 1;
								Static128.method2229(local856);
								continue;
							}
							if (local31 == 1125) {
								local1 -= 2;
								local856.anInt88 = anIntArray548[local1];
								local856.anInt109 = anIntArray548[local1 + 1];
								Static128.method2229(local856);
								continue;
							}
						} else if (local31 >= 1200 && local31 < 1300 || !(local31 < 2200 || local31 >= 2300)) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local856 = Static380.method5987(anIntArray548[local1]);
							} else {
								local856 = local718 ? aClass3_17 : aClass3_16;
							}
							Static128.method2229(local856);
							if (local31 == 1200 || local31 == 1205 || local31 == 1208 || local31 == 1209 || local31 == 1212 || local31 == 1213) {
								local1 -= 2;
								local545 = anIntArray548[local1];
								local744 = anIntArray548[local1 + 1];
								if (local856.anInt45 == -1) {
									Static384.method6008(local856.anInt94);
									Static190.method3484(local856.anInt94);
									Static47.method609(local856.anInt94);
								}
								if (local545 == -1) {
									local856.anInt63 = 1;
									local856.anInt101 = -1;
									local856.anInt56 = -1;
									continue;
								}
								local856.anInt56 = local545;
								local856.anInt92 = local744;
								if (local31 == 1208 || local31 == 1209) {
									local856.aBoolean6 = true;
								} else {
									local856.aBoolean6 = false;
								}
								@Pc(2093) Class152 local2093 = Static57.aClass196_1.method4827(local545);
								local856.anInt44 = local2093.anInt4305;
								local856.anInt105 = local2093.anInt4351;
								local856.anInt102 = local2093.anInt4333;
								local856.anInt57 = local2093.anInt4329;
								local856.anInt117 = local2093.anInt4348;
								local856.anInt68 = local2093.anInt4350;
								if (local31 == 1205 || local31 == 1209) {
									local856.anInt71 = 0;
								} else if (local31 == 1212 || local31 == 1213) {
									local856.anInt71 = 1;
								} else {
									local856.anInt71 = 2;
								}
								if (local856.anInt70 > 0) {
									local856.anInt68 = local856.anInt68 * 32 / local856.anInt70;
								} else if (local856.anInt52 > 0) {
									local856.anInt68 = local856.anInt68 * 32 / local856.anInt52;
								}
								continue;
							}
							if (local31 == 1201) {
								local856.anInt63 = 2;
								local1--;
								local856.anInt101 = anIntArray548[local1];
								if (local856.anInt45 == -1) {
									Static153.method2740(local856.anInt94);
								}
								continue;
							}
							if (local31 == 1202) {
								local856.anInt63 = 3;
								local856.anInt101 = -1;
								if (local856.anInt45 == -1) {
									Static153.method2740(local856.anInt94);
								}
								continue;
							}
							if (local31 == 1203) {
								local856.anInt63 = 6;
								local1--;
								local856.anInt101 = anIntArray548[local1];
								if (local856.anInt45 == -1) {
									Static153.method2740(local856.anInt94);
								}
								continue;
							}
							if (local31 == 1204) {
								local856.anInt63 = 5;
								local1--;
								local856.anInt101 = anIntArray548[local1];
								if (local856.anInt45 == -1) {
									Static153.method2740(local856.anInt94);
								}
								continue;
							}
							if (local31 == 1206) {
								local1 -= 4;
								local856.anInt83 = anIntArray548[local1];
								local856.anInt54 = anIntArray548[local1 + 1];
								local856.anInt51 = anIntArray548[local1 + 2];
								local856.anInt75 = anIntArray548[local1 + 3];
								Static128.method2229(local856);
								continue;
							}
							if (local31 == 1207) {
								local1 -= 2;
								local856.anInt99 = anIntArray548[local1];
								local856.anInt79 = anIntArray548[local1 + 1];
								Static128.method2229(local856);
								continue;
							}
							if (local31 == 1210) {
								local1 -= 4;
								local856.anInt101 = anIntArray548[local1];
								local856.anInt69 = anIntArray548[local1 + 1];
								if (anIntArray548[local1 + 2] == 1) {
									local856.anInt63 = 9;
								} else {
									local856.anInt63 = 8;
								}
								if (anIntArray548[local1 + 3] == 1) {
									local856.aBoolean6 = true;
								} else {
									local856.aBoolean6 = false;
								}
								if (local856.anInt45 == -1) {
									Static153.method2740(local856.anInt94);
								}
								continue;
							}
							if (local31 == 1211) {
								local856.anInt63 = 5;
								local856.anInt101 = Static93.anInt1976;
								local856.anInt69 = 0;
								if (local856.anInt45 == -1) {
									Static153.method2740(local856.anInt94);
								}
								continue;
							}
						} else if (local31 >= 1300 && local31 < 1400 || local31 >= 2300 && local31 < 2400) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local856 = Static380.method5987(anIntArray548[local1]);
							} else {
								local856 = local718 ? aClass3_17 : aClass3_16;
							}
							if (local31 == 1300) {
								local1--;
								local545 = anIntArray548[local1] - 1;
								if (local545 >= 0 && local545 <= 9) {
									local3--;
									local856.method47(aStringArray39[local3], local545);
									continue;
								}
								local3--;
								continue;
							}
							if (local31 == 1301) {
								local1 -= 2;
								local545 = anIntArray548[local1];
								local744 = anIntArray548[local1 + 1];
								local856.aClass3_1 = Static134.method2355(local744, local545);
								continue;
							}
							if (local31 == 1302) {
								local1--;
								local545 = anIntArray548[local1];
								if (local545 == Static197.anInt4107 || local545 == Static23.anInt361 || local545 == Static7.anInt143) {
									local856.anInt53 = local545;
								}
								continue;
							}
							if (local31 == 1303) {
								local1--;
								local856.anInt77 = anIntArray548[local1];
								continue;
							}
							if (local31 == 1304) {
								local1--;
								local856.anInt106 = anIntArray548[local1];
								continue;
							}
							if (local31 == 1305) {
								local3--;
								local856.aString5 = aStringArray39[local3];
								continue;
							}
							if (local31 == 1306) {
								local3--;
								local856.aString1 = aStringArray39[local3];
								continue;
							}
							if (local31 == 1307) {
								local856.aStringArray1 = null;
								continue;
							}
							if (local31 == 1308) {
								local1--;
								local856.anInt72 = anIntArray548[local1];
								local1--;
								local856.anInt38 = anIntArray548[local1];
								continue;
							}
							if (local31 == 1309) {
								local1--;
								local545 = anIntArray548[local1];
								local1--;
								local744 = anIntArray548[local1];
								if (local744 >= 1 && local744 <= 10) {
									local856.method43(local744 - 1, local545);
								}
								continue;
							}
							if (local31 == 1310) {
								local3--;
								local856.aString3 = aStringArray39[local3];
								continue;
							}
							if (local31 == 1311) {
								local1--;
								local856.anInt37 = anIntArray548[local1];
								continue;
							}
						} else {
							if (local31 >= 1400 && local31 < 1500 || local31 >= 2400 && local31 < 2500) {
								if (local31 >= 2000) {
									local31 -= 1000;
									local1--;
									local856 = Static380.method5987(anIntArray548[local1]);
								} else {
									local856 = local718 ? aClass3_17 : aClass3_16;
								}
								local3--;
								local1702 = aStringArray39[local3];
								@Pc(2620) int[] local2620 = null;
								if (local1702.length() > 0 && local1702.charAt(local1702.length() - 1) == 'Y') {
									local1--;
									local395 = anIntArray548[local1];
									if (local395 > 0) {
										local2620 = new int[local395];
										while (local395-- > 0) {
											local1--;
											local2620[local395] = anIntArray548[local1];
										}
									}
									local1702 = local1702.substring(0, local1702.length() - 1);
								}
								@Pc(2666) Object[] local2666 = new Object[local1702.length() + 1];
								for (local414 = local2666.length - 1; local414 >= 1; local414--) {
									if (local1702.charAt(local414 - 1) == 's') {
										local3--;
										local2666[local414] = aStringArray39[local3];
									} else {
										local1--;
										local2666[local414] = Integer.valueOf(anIntArray548[local1]);
									}
								}
								local1--;
								local775 = anIntArray548[local1];
								if (local775 == -1) {
									local2666 = null;
								} else {
									local2666[0] = Integer.valueOf(local775);
								}
								if (local31 == 1400) {
									local856.anObjectArray27 = local2666;
								} else if (local31 == 1401) {
									local856.anObjectArray20 = local2666;
								} else if (local31 == 1402) {
									local856.anObjectArray25 = local2666;
								} else if (local31 == 1403) {
									local856.anObjectArray21 = local2666;
								} else if (local31 == 1404) {
									local856.anObjectArray18 = local2666;
								} else if (local31 == 1405) {
									local856.anObjectArray2 = local2666;
								} else if (local31 == 1406) {
									local856.anObjectArray28 = local2666;
								} else if (local31 == 1407) {
									local856.anObjectArray12 = local2666;
									local856.anIntArray3 = local2620;
								} else if (local31 == 1408) {
									local856.anObjectArray6 = local2666;
								} else if (local31 == 1409) {
									local856.anObjectArray13 = local2666;
								} else if (local31 == 1410) {
									local856.anObjectArray29 = local2666;
								} else if (local31 == 1411) {
									local856.anObjectArray5 = local2666;
								} else if (local31 == 1412) {
									local856.anObjectArray26 = local2666;
								} else if (local31 == 1414) {
									local856.anObjectArray7 = local2666;
									local856.anIntArray9 = local2620;
								} else if (local31 == 1415) {
									local856.anObjectArray15 = local2666;
									local856.anIntArray11 = local2620;
								} else if (local31 == 1416) {
									local856.anObjectArray9 = local2666;
								} else if (local31 == 1417) {
									local856.anObjectArray17 = local2666;
								} else if (local31 == 1418) {
									local856.anObjectArray3 = local2666;
								} else if (local31 == 1419) {
									local856.anObjectArray10 = local2666;
								} else if (local31 == 1420) {
									local856.anObjectArray4 = local2666;
								} else if (local31 == 1421) {
									local856.anObjectArray8 = local2666;
								} else if (local31 == 1422) {
									local856.anObjectArray19 = local2666;
								} else if (local31 == 1423) {
									local856.anObjectArray22 = local2666;
								} else if (local31 == 1424) {
									local856.anObjectArray23 = local2666;
								} else if (local31 == 1425) {
									local856.anObjectArray1 = local2666;
								} else if (local31 == 1426) {
									local856.anObjectArray11 = local2666;
								} else if (local31 == 1427) {
									local856.anObjectArray14 = local2666;
								} else if (local31 == 1428) {
									local856.anObjectArray16 = local2666;
									local856.anIntArray5 = local2620;
								} else if (local31 == 1429) {
									local856.anObjectArray24 = local2666;
									local856.anIntArray12 = local2620;
								}
								local856.aBoolean4 = true;
								continue;
							}
							if (local31 < 1600) {
								local856 = local718 ? aClass3_17 : aClass3_16;
								if (local31 == 1500) {
									anIntArray548[local1++] = local856.anInt114;
									continue;
								}
								if (local31 == 1501) {
									anIntArray548[local1++] = local856.anInt50;
									continue;
								}
								if (local31 == 1502) {
									anIntArray548[local1++] = local856.anInt64;
									continue;
								}
								if (local31 == 1503) {
									anIntArray548[local1++] = local856.anInt116;
									continue;
								}
								if (local31 == 1504) {
									anIntArray548[local1++] = local856.aBoolean12 ? 1 : 0;
									continue;
								}
								if (local31 == 1505) {
									anIntArray548[local1++] = local856.anInt87;
									continue;
								}
							} else if (local31 < 1700) {
								local856 = local718 ? aClass3_17 : aClass3_16;
								if (local31 == 1600) {
									anIntArray548[local1++] = local856.anInt81;
									continue;
								}
								if (local31 == 1601) {
									anIntArray548[local1++] = local856.anInt93;
									continue;
								}
								if (local31 == 1602) {
									aStringArray39[local3++] = local856.aString4;
									continue;
								}
								if (local31 == 1603) {
									anIntArray548[local1++] = local856.anInt76;
									continue;
								}
								if (local31 == 1604) {
									anIntArray548[local1++] = local856.anInt111;
									continue;
								}
								if (local31 == 1605) {
									anIntArray548[local1++] = local856.anInt68;
									continue;
								}
								if (local31 == 1606) {
									anIntArray548[local1++] = local856.anInt44;
									continue;
								}
								if (local31 == 1607) {
									anIntArray548[local1++] = local856.anInt102;
									continue;
								}
								if (local31 == 1608) {
									anIntArray548[local1++] = local856.anInt105;
									continue;
								}
								if (local31 == 1609) {
									anIntArray548[local1++] = local856.anInt85;
									continue;
								}
								if (local31 == 1610) {
									anIntArray548[local1++] = local856.anInt57;
									continue;
								}
								if (local31 == 1611) {
									anIntArray548[local1++] = local856.anInt117;
									continue;
								}
								if (local31 == 1612) {
									anIntArray548[local1++] = local856.anInt42;
									continue;
								}
							} else if (local31 < 1800) {
								local856 = local718 ? aClass3_17 : aClass3_16;
								if (local31 == 1700) {
									anIntArray548[local1++] = local856.anInt56;
									continue;
								}
								if (local31 == 1701) {
									if (local856.anInt56 == -1) {
										anIntArray548[local1++] = 0;
									} else {
										anIntArray548[local1++] = local856.anInt92;
									}
									continue;
								}
								if (local31 == 1702) {
									anIntArray548[local1++] = local856.anInt45;
									continue;
								}
							} else if (local31 < 1900) {
								local856 = local718 ? aClass3_17 : aClass3_16;
								if (local31 == 1800) {
									anIntArray548[local1++] = Static51.method778(local856).method3759();
									continue;
								}
								if (local31 == 1801) {
									local1--;
									local545 = anIntArray548[local1];
									local545--;
									if (local856.aStringArray1 != null && local545 < local856.aStringArray1.length && local856.aStringArray1[local545] != null) {
										aStringArray39[local3++] = local856.aStringArray1[local545];
										continue;
									}
									aStringArray39[local3++] = "";
									continue;
								}
								if (local31 == 1802) {
									if (local856.aString5 == null) {
										aStringArray39[local3++] = "";
									} else {
										aStringArray39[local3++] = local856.aString5;
									}
									continue;
								}
							} else if (local31 < 2600) {
								local1--;
								local856 = Static380.method5987(anIntArray548[local1]);
								if (local31 == 2500) {
									anIntArray548[local1++] = local856.anInt114;
									continue;
								}
								if (local31 == 2501) {
									anIntArray548[local1++] = local856.anInt50;
									continue;
								}
								if (local31 == 2502) {
									anIntArray548[local1++] = local856.anInt64;
									continue;
								}
								if (local31 == 2503) {
									anIntArray548[local1++] = local856.anInt116;
									continue;
								}
								if (local31 == 2504) {
									anIntArray548[local1++] = local856.aBoolean12 ? 1 : 0;
									continue;
								}
								if (local31 == 2505) {
									anIntArray548[local1++] = local856.anInt87;
									continue;
								}
							} else if (local31 < 2700) {
								local1--;
								local856 = Static380.method5987(anIntArray548[local1]);
								if (local31 == 2600) {
									anIntArray548[local1++] = local856.anInt81;
									continue;
								}
								if (local31 == 2601) {
									anIntArray548[local1++] = local856.anInt93;
									continue;
								}
								if (local31 == 2602) {
									aStringArray39[local3++] = local856.aString4;
									continue;
								}
								if (local31 == 2603) {
									anIntArray548[local1++] = local856.anInt76;
									continue;
								}
								if (local31 == 2604) {
									anIntArray548[local1++] = local856.anInt111;
									continue;
								}
								if (local31 == 2605) {
									anIntArray548[local1++] = local856.anInt68;
									continue;
								}
								if (local31 == 2606) {
									anIntArray548[local1++] = local856.anInt44;
									continue;
								}
								if (local31 == 2607) {
									anIntArray548[local1++] = local856.anInt102;
									continue;
								}
								if (local31 == 2608) {
									anIntArray548[local1++] = local856.anInt105;
									continue;
								}
								if (local31 == 2609) {
									anIntArray548[local1++] = local856.anInt85;
									continue;
								}
								if (local31 == 2610) {
									anIntArray548[local1++] = local856.anInt57;
									continue;
								}
								if (local31 == 2611) {
									anIntArray548[local1++] = local856.anInt117;
									continue;
								}
								if (local31 == 2612) {
									anIntArray548[local1++] = local856.anInt42;
									continue;
								}
							} else {
								@Pc(3638) Class2_Sub26 local3638;
								@Pc(3554) Class2_Sub26 local3554;
								if (local31 < 2800) {
									if (local31 == 2700) {
										local1--;
										local856 = Static380.method5987(anIntArray548[local1]);
										anIntArray548[local1++] = local856.anInt56;
										continue;
									}
									if (local31 == 2701) {
										local1--;
										local856 = Static380.method5987(anIntArray548[local1]);
										if (local856.anInt56 == -1) {
											anIntArray548[local1++] = 0;
										} else {
											anIntArray548[local1++] = local856.anInt92;
										}
										continue;
									}
									if (local31 == 2702) {
										local1--;
										local540 = anIntArray548[local1];
										local3554 = (Class2_Sub26) Static273.aClass243_20.method5967((long) local540);
										if (local3554 == null) {
											anIntArray548[local1++] = 0;
										} else {
											anIntArray548[local1++] = 1;
										}
										continue;
									}
									if (local31 == 2703) {
										local1--;
										local856 = Static380.method5987(anIntArray548[local1]);
										if (local856.aClass3Array1 == null) {
											anIntArray548[local1++] = 0;
											continue;
										}
										local545 = local856.aClass3Array1.length;
										for (local744 = 0; local744 < local856.aClass3Array1.length; local744++) {
											if (local856.aClass3Array1[local744] == null) {
												local545 = local744;
												break;
											}
										}
										anIntArray548[local1++] = local545;
										continue;
									}
									if (local31 == 2704 || local31 == 2705) {
										local1 -= 2;
										local540 = anIntArray548[local1];
										local545 = anIntArray548[local1 + 1];
										local3638 = (Class2_Sub26) Static273.aClass243_20.method5967((long) local540);
										if (local3638 != null && local3638.anInt4145 == local545) {
											anIntArray548[local1++] = 1;
											continue;
										}
										anIntArray548[local1++] = 0;
										continue;
									}
								} else if (local31 < 2900) {
									local1--;
									local856 = Static380.method5987(anIntArray548[local1]);
									if (local31 == 2800) {
										anIntArray548[local1++] = Static51.method778(local856).method3759();
										continue;
									}
									if (local31 == 2801) {
										local1--;
										local545 = anIntArray548[local1];
										local545--;
										if (local856.aStringArray1 != null && local545 < local856.aStringArray1.length && local856.aStringArray1[local545] != null) {
											aStringArray39[local3++] = local856.aStringArray1[local545];
											continue;
										}
										aStringArray39[local3++] = "";
										continue;
									}
									if (local31 == 2802) {
										if (local856.aString5 == null) {
											aStringArray39[local3++] = "";
										} else {
											aStringArray39[local3++] = local856.aString5;
										}
										continue;
									}
								} else if (local31 < 3200) {
									if (local31 == 3100) {
										local3--;
										local352 = aStringArray39[local3];
										Static79.method1369(local352);
										continue;
									}
									if (local31 == 3101) {
										local1 -= 2;
										Static77.method1329(anIntArray548[local1], Static182.aClass1_Sub2_Sub1_Sub1_1, anIntArray548[local1 + 1]);
										continue;
									}
									if (local31 == 3103) {
										Static243.method4287();
										continue;
									}
									if (local31 == 3104) {
										local3--;
										local352 = aStringArray39[local3];
										local545 = 0;
										if (Static84.method1453(local352)) {
											local545 = Static335.method5402(local352);
										}
										Static77.method1332(Static141.aClass183_40);
										Static76.aClass2_Sub24_Sub2_7.method5734(local545);
										continue;
									}
									if (local31 == 3105) {
										local3--;
										local352 = aStringArray39[local3];
										Static77.method1332(Static385.aClass183_112);
										Static76.aClass2_Sub24_Sub2_7.method5746(local352.length() + 1);
										Static76.aClass2_Sub24_Sub2_7.method5772(local352);
										continue;
									}
									if (local31 == 3106) {
										local3--;
										local352 = aStringArray39[local3];
										Static77.method1332(Static376.aClass183_104);
										Static76.aClass2_Sub24_Sub2_7.method5746(local352.length() + 1);
										Static76.aClass2_Sub24_Sub2_7.method5772(local352);
										continue;
									}
									if (local31 == 3107) {
										local1--;
										local540 = anIntArray548[local1];
										local3--;
										local1702 = aStringArray39[local3];
										Static378.method4269(local1702, local540);
										continue;
									}
									if (local31 == 3108) {
										local1 -= 3;
										local540 = anIntArray548[local1];
										local545 = anIntArray548[local1 + 1];
										local744 = anIntArray548[local1 + 2];
										local754 = Static380.method5987(local744);
										Static50.method732(local545, local540, local754);
										continue;
									}
									if (local31 == 3109) {
										local1 -= 2;
										local540 = anIntArray548[local1];
										local545 = anIntArray548[local1 + 1];
										local923 = local718 ? aClass3_17 : aClass3_16;
										Static50.method732(local545, local540, local923);
										continue;
									}
									if (local31 == 3110) {
										local1--;
										local540 = anIntArray548[local1];
										Static77.method1332(Static247.aClass183_73);
										Static76.aClass2_Sub24_Sub2_7.method5721(local540);
										continue;
									}
									if (local31 == 3111) {
										local1 -= 2;
										local540 = anIntArray548[local1];
										local545 = anIntArray548[local1 + 1];
										local3638 = (Class2_Sub26) Static273.aClass243_20.method5967((long) local540);
										if (local3638 != null) {
											Static110.method2010(local3638, true, local3638.anInt4145 != local545);
										}
										Static36.method2331(local545, true, local540, 3);
										continue;
									}
									if (local31 == 3112) {
										local1--;
										local540 = anIntArray548[local1];
										local3554 = (Class2_Sub26) Static273.aClass243_20.method5967((long) local540);
										if (local3554 != null && local3554.anInt4142 == 3) {
											Static110.method2010(local3554, true, true);
										}
										continue;
									}
								} else if (local31 < 3300) {
									if (local31 == 3200) {
										local1 -= 3;
										Static88.method1493(anIntArray548[local1 + 2], anIntArray548[local1], anIntArray548[local1 + 1], 255);
										continue;
									}
									if (local31 == 3201) {
										local1--;
										Static269.method4567(anIntArray548[local1], 255);
										continue;
									}
									if (local31 == 3202) {
										local1 -= 2;
										Static128.method2227(anIntArray548[local1 + 1], 255, anIntArray548[local1]);
										continue;
									}
								} else if (local31 < 3400) {
									if (local31 == 3300) {
										anIntArray548[local1++] = Static339.anInt6265;
										continue;
									}
									if (local31 == 3301) {
										local1 -= 2;
										local540 = anIntArray548[local1];
										local545 = anIntArray548[local1 + 1];
										anIntArray548[local1++] = Static392.method6135(local540, local545, false);
										continue;
									}
									if (local31 == 3302) {
										local1 -= 2;
										local540 = anIntArray548[local1];
										local545 = anIntArray548[local1 + 1];
										anIntArray548[local1++] = Static353.method5598(false, local540, local545);
										continue;
									}
									if (local31 == 3303) {
										local1 -= 2;
										local540 = anIntArray548[local1];
										local545 = anIntArray548[local1 + 1];
										anIntArray548[local1++] = Static109.method1985(local545, false, local540);
										continue;
									}
									if (local31 == 3304) {
										local1--;
										local540 = anIntArray548[local1];
										anIntArray548[local1++] = Static40.aClass146_1.method3775(local540).anInt4820;
										continue;
									}
									if (local31 == 3305) {
										local1--;
										local540 = anIntArray548[local1];
										anIntArray548[local1++] = Static385.anIntArray585[local540];
										continue;
									}
									if (local31 == 3306) {
										local1--;
										local540 = anIntArray548[local1];
										anIntArray548[local1++] = Static226.anIntArray377[local540];
										continue;
									}
									if (local31 == 3307) {
										local1--;
										local540 = anIntArray548[local1];
										anIntArray548[local1++] = Static140.anIntArray232[local540];
										continue;
									}
									if (local31 == 3308) {
										@Pc(4226) byte local4226 = Static182.aClass1_Sub2_Sub1_Sub1_1.aByte73;
										local545 = (Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6800 >> 7) + Static279.anInt5198;
										local744 = (Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6798 >> 7) + Static350.anInt6470;
										anIntArray548[local1++] = (local4226 << 28) + (local545 << 14) + local744;
										continue;
									}
									if (local31 == 3309) {
										local1--;
										local540 = anIntArray548[local1];
										anIntArray548[local1++] = local540 >> 14 & 0x3FFF;
										continue;
									}
									if (local31 == 3310) {
										local1--;
										local540 = anIntArray548[local1];
										anIntArray548[local1++] = local540 >> 28;
										continue;
									}
									if (local31 == 3311) {
										local1--;
										local540 = anIntArray548[local1];
										anIntArray548[local1++] = local540 & 0x3FFF;
										continue;
									}
									if (local31 == 3312) {
										anIntArray548[local1++] = Static180.aBoolean272 ? 1 : 0;
										continue;
									}
									if (local31 == 3313) {
										local1 -= 2;
										local540 = anIntArray548[local1];
										local545 = anIntArray548[local1 + 1];
										anIntArray548[local1++] = Static392.method6135(local540, local545, true);
										continue;
									}
									if (local31 == 3314) {
										local1 -= 2;
										local540 = anIntArray548[local1];
										local545 = anIntArray548[local1 + 1];
										anIntArray548[local1++] = Static353.method5598(true, local540, local545);
										continue;
									}
									if (local31 == 3315) {
										local1 -= 2;
										local540 = anIntArray548[local1];
										local545 = anIntArray548[local1 + 1];
										anIntArray548[local1++] = Static109.method1985(local545, true, local540);
										continue;
									}
									if (local31 == 3316) {
										if (Static273.anInt5130 >= 2) {
											anIntArray548[local1++] = Static273.anInt5130;
										} else {
											anIntArray548[local1++] = 0;
										}
										continue;
									}
									if (local31 == 3317) {
										anIntArray548[local1++] = Static222.anInt4434;
										continue;
									}
									if (local31 == 3318) {
										anIntArray548[local1++] = Static4.anInt134;
										continue;
									}
									if (local31 == 3321) {
										anIntArray548[local1++] = Static124.anInt4237;
										continue;
									}
									if (local31 == 3322) {
										anIntArray548[local1++] = Static154.anInt3222;
										continue;
									}
									if (local31 == 3323) {
										if (Static145.anInt5340 >= 5 && Static145.anInt5340 <= 9) {
											anIntArray548[local1++] = 1;
											continue;
										}
										anIntArray548[local1++] = 0;
										continue;
									}
									if (local31 == 3324) {
										if (Static145.anInt5340 >= 5 && Static145.anInt5340 <= 9) {
											anIntArray548[local1++] = Static145.anInt5340;
											continue;
										}
										anIntArray548[local1++] = 0;
										continue;
									}
									if (local31 == 3325) {
										anIntArray548[local1++] = Static294.aBoolean401 ? 1 : 0;
										continue;
									}
									if (local31 == 3326) {
										anIntArray548[local1++] = Static182.aClass1_Sub2_Sub1_Sub1_1.anInt956;
										continue;
									}
									if (local31 == 3327) {
										anIntArray548[local1++] = Static182.aClass1_Sub2_Sub1_Sub1_1.aClass158_1.aBoolean323 ? 1 : 0;
										continue;
									}
									if (local31 == 3328) {
										anIntArray548[local1++] = Static243.aBoolean352 && !Static184.aBoolean280 ? 1 : 0;
										continue;
									}
									if (local31 == 3329) {
										anIntArray548[local1++] = Static142.aBoolean215 ? 1 : 0;
										continue;
									}
									if (local31 == 3330) {
										local1--;
										local540 = anIntArray548[local1];
										anIntArray548[local1++] = Static349.method5575(local540);
										continue;
									}
									if (local31 == 3331) {
										local1 -= 2;
										local540 = anIntArray548[local1];
										local545 = anIntArray548[local1 + 1];
										anIntArray548[local1++] = Static266.method4522(local540, local545, false);
										continue;
									}
									if (local31 == 3332) {
										local1 -= 2;
										local540 = anIntArray548[local1];
										local545 = anIntArray548[local1 + 1];
										anIntArray548[local1++] = Static266.method4522(local540, local545, true);
										continue;
									}
									if (local31 == 3333) {
										anIntArray548[local1++] = Static32.anInt483;
										continue;
									}
									if (local31 == 3335) {
										anIntArray548[local1++] = Static200.anInt4144;
										continue;
									}
									if (local31 == 3336) {
										local1 -= 4;
										local540 = anIntArray548[local1];
										local545 = anIntArray548[local1 + 1];
										local744 = anIntArray548[local1 + 2];
										local395 = anIntArray548[local1 + 3];
										local540 += local545 << 14;
										local540 += local744 << 28;
										local540 += local395;
										anIntArray548[local1++] = local540;
										continue;
									}
									if (local31 == 3337) {
										anIntArray548[local1++] = Static369.anInt6788;
										continue;
									}
									if (local31 == 3338) {
										anIntArray548[local1++] = Static111.method2019();
										continue;
									}
								} else if (local31 < 3500) {
									@Pc(4725) Class61 local4725;
									if (local31 == 3400) {
										local1 -= 2;
										local540 = anIntArray548[local1];
										local545 = anIntArray548[local1 + 1];
										local4725 = Static25.aClass84_3.method1984(local540);
										aStringArray39[local3++] = local4725.method1380(local545);
										continue;
									}
									if (local31 == 3408) {
										local1 -= 4;
										local540 = anIntArray548[local1];
										local545 = anIntArray548[local1 + 1];
										local744 = anIntArray548[local1 + 2];
										local395 = anIntArray548[local1 + 3];
										@Pc(4765) Class61 local4765 = Static25.aClass84_3.method1984(local744);
										if (local4765.aChar4 == local540 && local4765.aChar3 == local545) {
											if (local545 == 115) {
												aStringArray39[local3++] = local4765.method1380(local395);
											} else {
												anIntArray548[local1++] = local4765.method1377(local395);
											}
											continue;
										}
										throw new RuntimeException("C3408-1");
									}
									if (local31 == 3409) {
										local1 -= 3;
										local540 = anIntArray548[local1];
										local545 = anIntArray548[local1 + 1];
										local744 = anIntArray548[local1 + 2];
										if (local545 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(4832) Class61 local4832 = Static25.aClass84_3.method1984(local545);
										if (local4832.aChar3 != local540) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray548[local1++] = local4832.method1378(local744) ? 1 : 0;
										continue;
									}
									if (local31 == 3410) {
										local1--;
										local540 = anIntArray548[local1];
										local3--;
										local1702 = aStringArray39[local3];
										if (local540 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local4725 = Static25.aClass84_3.method1984(local540);
										if (local4725.aChar3 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray548[local1++] = local4725.method1376(local1702) ? 1 : 0;
										continue;
									}
									if (local31 == 3411) {
										local1--;
										local540 = anIntArray548[local1];
										@Pc(4915) Class61 local4915 = Static25.aClass84_3.method1984(local540);
										anIntArray548[local1++] = local4915.aClass243_7.method5964();
										continue;
									}
								} else if (local31 < 3700) {
									if (local31 == 3600) {
										if (Static232.anInt4636 == 0) {
											anIntArray548[local1++] = -2;
										} else if (Static232.anInt4636 == 1) {
											anIntArray548[local1++] = -1;
										} else {
											anIntArray548[local1++] = Static139.anInt2976;
										}
										continue;
									}
									if (local31 == 3601) {
										local1--;
										local540 = anIntArray548[local1];
										if (Static232.anInt4636 == 2 && local540 < Static139.anInt2976) {
											aStringArray39[local3++] = Static30.aStringArray6[local540];
											if (Static288.aStringArray29[local540] == null) {
												aStringArray39[local3++] = "";
											} else {
												aStringArray39[local3++] = Static288.aStringArray29[local540];
											}
											continue;
										}
										aStringArray39[local3++] = "";
										aStringArray39[local3++] = "";
										continue;
									}
									if (local31 == 3602) {
										local1--;
										local540 = anIntArray548[local1];
										if (Static232.anInt4636 == 2 && local540 < Static139.anInt2976) {
											anIntArray548[local1++] = Static23.anIntArray42[local540];
											continue;
										}
										anIntArray548[local1++] = 0;
										continue;
									}
									if (local31 == 3603) {
										local1--;
										local540 = anIntArray548[local1];
										if (Static232.anInt4636 == 2 && local540 < Static139.anInt2976) {
											anIntArray548[local1++] = Static299.anIntArray474[local540];
											continue;
										}
										anIntArray548[local1++] = 0;
										continue;
									}
									if (local31 == 3604) {
										local3--;
										local352 = aStringArray39[local3];
										local1--;
										local545 = anIntArray548[local1];
										Static276.method6132(local545, local352);
										continue;
									}
									if (local31 == 3605) {
										local3--;
										local352 = aStringArray39[local3];
										Static184.method3406(local352);
										continue;
									}
									if (local31 == 3606) {
										local3--;
										local352 = aStringArray39[local3];
										Static50.method738(local352);
										continue;
									}
									if (local31 == 3607) {
										local3--;
										local352 = aStringArray39[local3];
										Static133.method2325(local352, false);
										continue;
									}
									if (local31 == 3608) {
										local3--;
										local352 = aStringArray39[local3];
										Static199.method3644(local352);
										continue;
									}
									if (local31 == 3609) {
										local3--;
										local352 = aStringArray39[local3];
										if (local352.startsWith("<img=0>") || local352.startsWith("<img=1>")) {
											local352 = local352.substring(7);
										}
										anIntArray548[local1++] = Static67.method1228(local352) ? 1 : 0;
										continue;
									}
									if (local31 == 3610) {
										local1--;
										local540 = anIntArray548[local1];
										if (Static232.anInt4636 == 2 && local540 < Static139.anInt2976) {
											aStringArray39[local3++] = Static73.aStringArray10[local540];
											continue;
										}
										aStringArray39[local3++] = "";
										continue;
									}
									if (local31 == 3611) {
										if (Static66.aString17 == null) {
											aStringArray39[local3++] = "";
										} else {
											aStringArray39[local3++] = Static55.method860(Static66.aString17);
										}
										continue;
									}
									if (local31 == 3612) {
										if (Static66.aString17 == null) {
											anIntArray548[local1++] = 0;
										} else {
											anIntArray548[local1++] = Static29.anInt438;
										}
										continue;
									}
									if (local31 == 3613) {
										local1--;
										local540 = anIntArray548[local1];
										if (Static66.aString17 != null && local540 < Static29.anInt438) {
											aStringArray39[local3++] = Static43.aClass163Array2[local540].aString39;
											continue;
										}
										aStringArray39[local3++] = "";
										continue;
									}
									if (local31 == 3614) {
										local1--;
										local540 = anIntArray548[local1];
										if (Static66.aString17 != null && local540 < Static29.anInt438) {
											anIntArray548[local1++] = Static43.aClass163Array2[local540].anInt4629;
											continue;
										}
										anIntArray548[local1++] = 0;
										continue;
									}
									if (local31 == 3615) {
										local1--;
										local540 = anIntArray548[local1];
										if (Static66.aString17 != null && local540 < Static29.anInt438) {
											anIntArray548[local1++] = Static43.aClass163Array2[local540].aByte34;
											continue;
										}
										anIntArray548[local1++] = 0;
										continue;
									}
									if (local31 == 3616) {
										anIntArray548[local1++] = Static38.aByte11;
										continue;
									}
									if (local31 == 3617) {
										local3--;
										local352 = aStringArray39[local3];
										Static59.method893(local352);
										continue;
									}
									if (local31 == 3618) {
										anIntArray548[local1++] = Static70.aByte22;
										continue;
									}
									if (local31 == 3619) {
										local3--;
										local352 = aStringArray39[local3];
										Static198.method3601(local352);
										continue;
									}
									if (local31 == 3620) {
										Static26.method293();
										continue;
									}
									if (local31 == 3621) {
										if (Static232.anInt4636 == 0) {
											anIntArray548[local1++] = -1;
										} else {
											anIntArray548[local1++] = Static158.anInt3256;
										}
										continue;
									}
									if (local31 == 3622) {
										local1--;
										local540 = anIntArray548[local1];
										if (Static232.anInt4636 != 0 && local540 < Static158.anInt3256) {
											aStringArray39[local3++] = Static45.aStringArray37[local540];
											if (Static134.aStringArray14[local540] == null) {
												aStringArray39[local3++] = "";
											} else {
												aStringArray39[local3++] = Static134.aStringArray14[local540];
											}
											continue;
										}
										aStringArray39[local3++] = "";
										aStringArray39[local3++] = "";
										continue;
									}
									if (local31 == 3623) {
										local3--;
										local352 = aStringArray39[local3];
										if (local352.startsWith("<img=0>") || local352.startsWith("<img=1>")) {
											local352 = local352.substring(7);
										}
										anIntArray548[local1++] = Static14.method170(local352) ? 1 : 0;
										continue;
									}
									if (local31 == 3624) {
										local1--;
										local540 = anIntArray548[local1];
										if (Static43.aClass163Array2 != null && local540 < Static29.anInt438 && Static43.aClass163Array2[local540].aString40.equalsIgnoreCase(Static182.aClass1_Sub2_Sub1_Sub1_1.aString12)) {
											anIntArray548[local1++] = 1;
											continue;
										}
										anIntArray548[local1++] = 0;
										continue;
									}
									if (local31 == 3625) {
										if (Static251.aString44 == null) {
											aStringArray39[local3++] = "";
										} else {
											aStringArray39[local3++] = Static251.aString44;
										}
										continue;
									}
									if (local31 == 3626) {
										local1--;
										local540 = anIntArray548[local1];
										if (Static66.aString17 != null && local540 < Static29.anInt438) {
											aStringArray39[local3++] = Static43.aClass163Array2[local540].aString38;
											continue;
										}
										aStringArray39[local3++] = "";
										continue;
									}
									if (local31 == 3627) {
										local1--;
										local540 = anIntArray548[local1];
										if (Static232.anInt4636 == 2 && local540 >= 0 && local540 < Static139.anInt2976) {
											anIntArray548[local1++] = Static289.aBooleanArray23[local540] ? 1 : 0;
											continue;
										}
										anIntArray548[local1++] = 0;
										continue;
									}
									if (local31 == 3628) {
										local3--;
										local352 = aStringArray39[local3];
										if (local352.startsWith("<img=0>") || local352.startsWith("<img=1>")) {
											local352 = local352.substring(7);
										}
										anIntArray548[local1++] = Static227.method4128(local352);
										continue;
									}
									if (local31 == 3629) {
										anIntArray548[local1++] = Static320.anInt7073;
										continue;
									}
									if (local31 == 3630) {
										local3--;
										local352 = aStringArray39[local3];
										Static133.method2325(local352, true);
										continue;
									}
									if (local31 == 3631) {
										local1--;
										local540 = anIntArray548[local1];
										anIntArray548[local1++] = Static302.aBooleanArray24[local540] ? 1 : 0;
										continue;
									}
									if (local31 == 3632) {
										local1--;
										local540 = anIntArray548[local1];
										if (Static66.aString17 != null && local540 < Static29.anInt438) {
											aStringArray39[local3++] = Static43.aClass163Array2[local540].aString40;
											continue;
										}
										aStringArray39[local3++] = "";
										continue;
									}
									if (local31 == 3633) {
										local1--;
										local540 = anIntArray548[local1];
										if (Static232.anInt4636 != 0 && local540 < Static158.anInt3256) {
											aStringArray39[local3++] = Static190.aStringArray19[local540];
											continue;
										}
										aStringArray39[local3++] = "";
										continue;
									}
								} else if (local31 < 4000) {
									if (local31 == 3903) {
										local1--;
										local540 = anIntArray548[local1];
										anIntArray548[local1++] = Static146.aClass231Array1[local540].method5614();
										continue;
									}
									if (local31 == 3904) {
										local1--;
										local540 = anIntArray548[local1];
										anIntArray548[local1++] = Static146.aClass231Array1[local540].anInt6505;
										continue;
									}
									if (local31 == 3905) {
										local1--;
										local540 = anIntArray548[local1];
										anIntArray548[local1++] = Static146.aClass231Array1[local540].anInt6507;
										continue;
									}
									if (local31 == 3906) {
										local1--;
										local540 = anIntArray548[local1];
										anIntArray548[local1++] = Static146.aClass231Array1[local540].anInt6504;
										continue;
									}
									if (local31 == 3907) {
										local1--;
										local540 = anIntArray548[local1];
										anIntArray548[local1++] = Static146.aClass231Array1[local540].anInt6511;
										continue;
									}
									if (local31 == 3908) {
										local1--;
										local540 = anIntArray548[local1];
										anIntArray548[local1++] = Static146.aClass231Array1[local540].anInt6512;
										continue;
									}
									if (local31 == 3910) {
										local1--;
										local540 = anIntArray548[local1];
										local545 = Static146.aClass231Array1[local540].method5610();
										anIntArray548[local1++] = local545 == 0 ? 1 : 0;
										continue;
									}
									if (local31 == 3911) {
										local1--;
										local540 = anIntArray548[local1];
										local545 = Static146.aClass231Array1[local540].method5610();
										anIntArray548[local1++] = local545 == 2 ? 1 : 0;
										continue;
									}
									if (local31 == 3912) {
										local1--;
										local540 = anIntArray548[local1];
										local545 = Static146.aClass231Array1[local540].method5610();
										anIntArray548[local1++] = local545 == 5 ? 1 : 0;
										continue;
									}
									if (local31 == 3913) {
										local1--;
										local540 = anIntArray548[local1];
										local545 = Static146.aClass231Array1[local540].method5610();
										anIntArray548[local1++] = local545 == 1 ? 1 : 0;
										continue;
									}
								} else if (local31 < 4100) {
									if (local31 == 4000) {
										local1 -= 2;
										local540 = anIntArray548[local1];
										local545 = anIntArray548[local1 + 1];
										anIntArray548[local1++] = local540 + local545;
										continue;
									}
									if (local31 == 4001) {
										local1 -= 2;
										local540 = anIntArray548[local1];
										local545 = anIntArray548[local1 + 1];
										anIntArray548[local1++] = local540 - local545;
										continue;
									}
									if (local31 == 4002) {
										local1 -= 2;
										local540 = anIntArray548[local1];
										local545 = anIntArray548[local1 + 1];
										anIntArray548[local1++] = local540 * local545;
										continue;
									}
									if (local31 == 4003) {
										local1 -= 2;
										local540 = anIntArray548[local1];
										local545 = anIntArray548[local1 + 1];
										anIntArray548[local1++] = local540 / local545;
										continue;
									}
									if (local31 == 4004) {
										local1--;
										local540 = anIntArray548[local1];
										anIntArray548[local1++] = (int) (Math.random() * (double) local540);
										continue;
									}
									if (local31 == 4005) {
										local1--;
										local540 = anIntArray548[local1];
										anIntArray548[local1++] = (int) (Math.random() * (double) (local540 + 1));
										continue;
									}
									if (local31 == 4006) {
										local1 -= 5;
										local540 = anIntArray548[local1];
										local545 = anIntArray548[local1 + 1];
										local744 = anIntArray548[local1 + 2];
										local395 = anIntArray548[local1 + 3];
										local414 = anIntArray548[local1 + 4];
										anIntArray548[local1++] = local540 + (local545 - local540) * (local414 - local744) / (local395 - local744);
										continue;
									}
									@Pc(6089) long local6089;
									@Pc(6082) long local6082;
									if (local31 == 4007) {
										local1 -= 2;
										local6082 = anIntArray548[local1];
										local6089 = anIntArray548[local1 + 1];
										anIntArray548[local1++] = (int) (local6082 + local6082 * local6089 / 100L);
										continue;
									}
									if (local31 == 4008) {
										local1 -= 2;
										local540 = anIntArray548[local1];
										local545 = anIntArray548[local1 + 1];
										anIntArray548[local1++] = local540 | 0x1 << local545;
										continue;
									}
									if (local31 == 4009) {
										local1 -= 2;
										local540 = anIntArray548[local1];
										local545 = anIntArray548[local1 + 1];
										anIntArray548[local1++] = local540 & -(0x1 << local545) - 1;
										continue;
									}
									if (local31 == 4010) {
										local1 -= 2;
										local540 = anIntArray548[local1];
										local545 = anIntArray548[local1 + 1];
										anIntArray548[local1++] = (local540 & 0x1 << local545) == 0 ? 0 : 1;
										continue;
									}
									if (local31 == 4011) {
										local1 -= 2;
										local540 = anIntArray548[local1];
										local545 = anIntArray548[local1 + 1];
										anIntArray548[local1++] = local540 % local545;
										continue;
									}
									if (local31 == 4012) {
										local1 -= 2;
										local540 = anIntArray548[local1];
										local545 = anIntArray548[local1 + 1];
										if (local540 == 0) {
											anIntArray548[local1++] = 0;
										} else {
											anIntArray548[local1++] = (int) Math.pow((double) local540, (double) local545);
										}
										continue;
									}
									if (local31 == 4013) {
										local1 -= 2;
										local540 = anIntArray548[local1];
										local545 = anIntArray548[local1 + 1];
										if (local540 == 0) {
											anIntArray548[local1++] = 0;
										} else if (local545 == 0) {
											anIntArray548[local1++] = Integer.MAX_VALUE;
										} else {
											anIntArray548[local1++] = (int) Math.pow((double) local540, 1.0D / (double) local545);
										}
										continue;
									}
									if (local31 == 4014) {
										local1 -= 2;
										local540 = anIntArray548[local1];
										local545 = anIntArray548[local1 + 1];
										anIntArray548[local1++] = local540 & local545;
										continue;
									}
									if (local31 == 4015) {
										local1 -= 2;
										local540 = anIntArray548[local1];
										local545 = anIntArray548[local1 + 1];
										anIntArray548[local1++] = local540 | local545;
										continue;
									}
									if (local31 == 4016) {
										local1 -= 2;
										local540 = anIntArray548[local1];
										local545 = anIntArray548[local1 + 1];
										anIntArray548[local1++] = local540 < local545 ? local540 : local545;
										continue;
									}
									if (local31 == 4017) {
										local1 -= 2;
										local540 = anIntArray548[local1];
										local545 = anIntArray548[local1 + 1];
										anIntArray548[local1++] = local540 > local545 ? local540 : local545;
										continue;
									}
									if (local31 == 4018) {
										local1 -= 3;
										local6082 = anIntArray548[local1];
										local6089 = anIntArray548[local1 + 1];
										@Pc(6395) long local6395 = (long) anIntArray548[local1 + 2];
										anIntArray548[local1++] = (int) (local6082 * local6395 / local6089);
										continue;
									}
								} else {
									@Pc(6934) boolean local6934;
									if (local31 < 4200) {
										if (local31 == 4100) {
											local3--;
											local352 = aStringArray39[local3];
											local1--;
											local545 = anIntArray548[local1];
											aStringArray39[local3++] = local352 + local545;
											continue;
										}
										if (local31 == 4101) {
											local3 -= 2;
											local352 = aStringArray39[local3];
											local1702 = aStringArray39[local3 + 1];
											aStringArray39[local3++] = local352 + local1702;
											continue;
										}
										if (local31 == 4102) {
											local3--;
											local352 = aStringArray39[local3];
											local1--;
											local545 = anIntArray548[local1];
											aStringArray39[local3++] = local352 + Static387.method6071(local545);
											continue;
										}
										if (local31 == 4103) {
											local3--;
											local352 = aStringArray39[local3];
											aStringArray39[local3++] = local352.toLowerCase();
											continue;
										}
										if (local31 == 4104) {
											local1--;
											local540 = anIntArray548[local1];
											@Pc(6521) long local6521 = ((long) local540 + 11745L) * 86400000L;
											aCalendar2.setTime(new Date(local6521));
											local395 = aCalendar2.get(5);
											local414 = aCalendar2.get(2);
											local775 = aCalendar2.get(1);
											aStringArray39[local3++] = local395 + "-" + aStringArray41[local414] + "-" + local775;
											continue;
										}
										if (local31 == 4105) {
											local3 -= 2;
											local352 = aStringArray39[local3];
											local1702 = aStringArray39[local3 + 1];
											if (Static182.aClass1_Sub2_Sub1_Sub1_1.aClass158_1 != null && Static182.aClass1_Sub2_Sub1_Sub1_1.aClass158_1.aBoolean323) {
												aStringArray39[local3++] = local1702;
												continue;
											}
											aStringArray39[local3++] = local352;
											continue;
										}
										if (local31 == 4106) {
											local1--;
											local540 = anIntArray548[local1];
											aStringArray39[local3++] = Integer.toString(local540);
											continue;
										}
										if (local31 == 4107) {
											local3 -= 2;
											anIntArray548[local1++] = Static127.method2224(Static200.anInt4144, aStringArray39[local3 + 1], aStringArray39[local3]);
											continue;
										}
										@Pc(6653) Class24 local6653;
										if (local31 == 4108) {
											local3--;
											local352 = aStringArray39[local3];
											local1 -= 2;
											local545 = anIntArray548[local1];
											local744 = anIntArray548[local1 + 1];
											local6653 = Static346.method5534(local744, Static381.aClass83_125);
											anIntArray548[local1++] = local6653.method324(Static221.aClass27Array60, local352, local545);
											continue;
										}
										if (local31 == 4109) {
											local3--;
											local352 = aStringArray39[local3];
											local1 -= 2;
											local545 = anIntArray548[local1];
											local744 = anIntArray548[local1 + 1];
											local6653 = Static346.method5534(local744, Static381.aClass83_125);
											anIntArray548[local1++] = local6653.method331(local545, Static221.aClass27Array60, local352);
											continue;
										}
										if (local31 == 4110) {
											local3 -= 2;
											local352 = aStringArray39[local3];
											local1702 = aStringArray39[local3 + 1];
											local1--;
											if (anIntArray548[local1] == 1) {
												aStringArray39[local3++] = local352;
											} else {
												aStringArray39[local3++] = local1702;
											}
											continue;
										}
										if (local31 == 4111) {
											local3--;
											local352 = aStringArray39[local3];
											aStringArray39[local3++] = Static252.method4379(local352);
											continue;
										}
										if (local31 == 4112) {
											local3--;
											local352 = aStringArray39[local3];
											local1--;
											local545 = anIntArray548[local1];
											if (local545 == -1) {
												throw new RuntimeException("null char");
											}
											aStringArray39[local3++] = local352 + (char) local545;
											continue;
										}
										if (local31 == 4113) {
											local1--;
											local540 = anIntArray548[local1];
											anIntArray548[local1++] = Static32.method367((char) local540) ? 1 : 0;
											continue;
										}
										if (local31 == 4114) {
											local1--;
											local540 = anIntArray548[local1];
											anIntArray548[local1++] = Static212.method3827((char) local540) ? 1 : 0;
											continue;
										}
										if (local31 == 4115) {
											local1--;
											local540 = anIntArray548[local1];
											anIntArray548[local1++] = Static218.method3893((char) local540) ? 1 : 0;
											continue;
										}
										if (local31 == 4116) {
											local1--;
											local540 = anIntArray548[local1];
											anIntArray548[local1++] = Static375.method5960((char) local540) ? 1 : 0;
											continue;
										}
										if (local31 == 4117) {
											local3--;
											local352 = aStringArray39[local3];
											if (local352 == null) {
												anIntArray548[local1++] = 0;
											} else {
												anIntArray548[local1++] = local352.length();
											}
											continue;
										}
										if (local31 == 4118) {
											local3--;
											local352 = aStringArray39[local3];
											local1 -= 2;
											local545 = anIntArray548[local1];
											local744 = anIntArray548[local1 + 1];
											aStringArray39[local3++] = local352.substring(local545, local744);
											continue;
										}
										if (local31 == 4119) {
											local3--;
											local352 = aStringArray39[local3];
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
											aStringArray39[local3++] = local6932.toString();
											continue;
										}
										if (local31 == 4120) {
											local3--;
											local352 = aStringArray39[local3];
											local1 -= 2;
											local545 = anIntArray548[local1];
											local744 = anIntArray548[local1 + 1];
											anIntArray548[local1++] = local352.indexOf(local545, local744);
											continue;
										}
										if (local31 == 4121) {
											local3 -= 2;
											local352 = aStringArray39[local3];
											local1702 = aStringArray39[local3 + 1];
											local1--;
											local744 = anIntArray548[local1];
											anIntArray548[local1++] = local352.indexOf(local1702, local744);
											continue;
										}
										if (local31 == 4122) {
											local1--;
											local540 = anIntArray548[local1];
											anIntArray548[local1++] = Character.toLowerCase((char) local540);
											continue;
										}
										if (local31 == 4123) {
											local1--;
											local540 = anIntArray548[local1];
											anIntArray548[local1++] = Character.toUpperCase((char) local540);
											continue;
										}
										if (local31 == 4124) {
											local1--;
											local1073 = anIntArray548[local1] != 0;
											local1--;
											local545 = anIntArray548[local1];
											aStringArray39[local3++] = Static69.method1258((long) local545, 0, local1073, Static200.anInt4144);
											continue;
										}
										if (local31 == 4125) {
											local3--;
											local352 = aStringArray39[local3];
											local1--;
											local545 = anIntArray548[local1];
											@Pc(7107) Class24 local7107 = Static346.method5534(local545, Static381.aClass83_125);
											anIntArray548[local1++] = local7107.method329(Static221.aClass27Array60, local352);
											continue;
										}
									} else {
										@Pc(7383) Class20 local7383;
										if (local31 < 4300) {
											if (local31 == 4200) {
												local1--;
												local540 = anIntArray548[local1];
												aStringArray39[local3++] = Static57.aClass196_1.method4827(local540).aString35;
												continue;
											}
											@Pc(7157) Class152 local7157;
											if (local31 == 4201) {
												local1 -= 2;
												local540 = anIntArray548[local1];
												local545 = anIntArray548[local1 + 1];
												local7157 = Static57.aClass196_1.method4827(local540);
												if (local545 >= 1 && local545 <= 5 && local7157.aStringArray23[local545 - 1] != null) {
													aStringArray39[local3++] = local7157.aStringArray23[local545 - 1];
													continue;
												}
												aStringArray39[local3++] = "";
												continue;
											}
											if (local31 == 4202) {
												local1 -= 2;
												local540 = anIntArray548[local1];
												local545 = anIntArray548[local1 + 1];
												local7157 = Static57.aClass196_1.method4827(local540);
												if (local545 >= 1 && local545 <= 5 && local7157.aStringArray24[local545 - 1] != null) {
													aStringArray39[local3++] = local7157.aStringArray24[local545 - 1];
													continue;
												}
												aStringArray39[local3++] = "";
												continue;
											}
											if (local31 == 4203) {
												local1--;
												local540 = anIntArray548[local1];
												anIntArray548[local1++] = Static57.aClass196_1.method4827(local540).anInt4332;
												continue;
											}
											if (local31 == 4204) {
												local1--;
												local540 = anIntArray548[local1];
												anIntArray548[local1++] = Static57.aClass196_1.method4827(local540).anInt4358 == 1 ? 1 : 0;
												continue;
											}
											@Pc(7290) Class152 local7290;
											if (local31 == 4205) {
												local1--;
												local540 = anIntArray548[local1];
												local7290 = Static57.aClass196_1.method4827(local540);
												if (local7290.anInt4310 == -1 && local7290.anInt4340 >= 0) {
													anIntArray548[local1++] = local7290.anInt4340;
													continue;
												}
												anIntArray548[local1++] = local540;
												continue;
											}
											if (local31 == 4206) {
												local1--;
												local540 = anIntArray548[local1];
												local7290 = Static57.aClass196_1.method4827(local540);
												if (local7290.anInt4310 >= 0 && local7290.anInt4340 >= 0) {
													anIntArray548[local1++] = local7290.anInt4340;
													continue;
												}
												anIntArray548[local1++] = local540;
												continue;
											}
											if (local31 == 4207) {
												local1--;
												local540 = anIntArray548[local1];
												anIntArray548[local1++] = Static57.aClass196_1.method4827(local540).aBoolean311 ? 1 : 0;
												continue;
											}
											if (local31 == 4208) {
												local1 -= 2;
												local540 = anIntArray548[local1];
												local545 = anIntArray548[local1 + 1];
												local7383 = Static57.aClass79_1.method1851(local545);
												if (local7383.method279()) {
													aStringArray39[local3++] = Static57.aClass196_1.method4827(local540).method3838(local545, local7383.aString6);
												} else {
													anIntArray548[local1++] = Static57.aClass196_1.method4827(local540).method3845(local545, local7383.anInt369);
												}
												continue;
											}
											if (local31 == 4209) {
												local1 -= 2;
												local540 = anIntArray548[local1];
												local545 = anIntArray548[local1 + 1] - 1;
												local7157 = Static57.aClass196_1.method4827(local540);
												if (local7157.anInt4323 == local545) {
													anIntArray548[local1++] = local7157.anInt4343;
												} else if (local7157.anInt4321 == local545) {
													anIntArray548[local1++] = local7157.anInt4318;
												} else {
													anIntArray548[local1++] = -1;
												}
												continue;
											}
											if (local31 == 4210) {
												local3--;
												local352 = aStringArray39[local3];
												local1--;
												local545 = anIntArray548[local1];
												Static108.method1983(local545 == 1, local352);
												anIntArray548[local1++] = Static274.anInt5131;
												continue;
											}
											if (local31 == 4211) {
												if (Static323.aShortArray111 != null && Static369.anInt6786 < Static274.anInt5131) {
													anIntArray548[local1++] = Static323.aShortArray111[Static369.anInt6786++] & 0xFFFF;
													continue;
												}
												anIntArray548[local1++] = -1;
												continue;
											}
											if (local31 == 4212) {
												Static369.anInt6786 = 0;
												continue;
											}
										} else if (local31 < 4400) {
											if (local31 == 4300) {
												local1 -= 2;
												local540 = anIntArray548[local1];
												local545 = anIntArray548[local1 + 1];
												local7383 = Static57.aClass79_1.method1851(local545);
												if (local7383.method279()) {
													aStringArray39[local3++] = Static207.aClass32_1.method579(local540).method4843(local545, local7383.aString6);
												} else {
													anIntArray548[local1++] = Static207.aClass32_1.method579(local540).method4830(local545, local7383.anInt369);
												}
												continue;
											}
										} else if (local31 < 4500) {
											if (local31 == 4400) {
												local1 -= 2;
												local540 = anIntArray548[local1];
												local545 = anIntArray548[local1 + 1];
												local7383 = Static57.aClass79_1.method1851(local545);
												if (local7383.method279()) {
													aStringArray39[local3++] = Static230.aClass96_4.method2303(local540).method906(local545, local7383.aString6);
												} else {
													anIntArray548[local1++] = Static230.aClass96_4.method2303(local540).method891(local7383.anInt369, local545);
												}
												continue;
											}
										} else if (local31 < 4600) {
											if (local31 == 4500) {
												local1 -= 2;
												local540 = anIntArray548[local1];
												local545 = anIntArray548[local1 + 1];
												local7383 = Static57.aClass79_1.method1851(local545);
												if (local7383.method279()) {
													aStringArray39[local3++] = Static80.aClass172_1.method4335(local540).method2832(local545, local7383.aString6);
												} else {
													anIntArray548[local1++] = Static80.aClass172_1.method4335(local540).method2831(local545, local7383.anInt369);
												}
												continue;
											}
										} else if (local31 < 4700) {
											if (local31 == 4600) {
												local1--;
												local540 = anIntArray548[local1];
												@Pc(7704) Class227 local7704 = Static59.aClass194_1.method4754(local540);
												if (local7704.anIntArray545 != null && local7704.anIntArray545.length > 0) {
													local744 = 0;
													local395 = local7704.anIntArray544[0];
													for (local414 = 1; local414 < local7704.anIntArray545.length; local414++) {
														if (local7704.anIntArray544[local414] > local395) {
															local744 = local414;
															local395 = local7704.anIntArray544[local414];
														}
													}
													anIntArray548[local1++] = local7704.anIntArray545[local744];
													continue;
												}
												anIntArray548[local1++] = local7704.anInt6426;
												continue;
											}
										} else if (local31 < 5100) {
											if (local31 == 5000) {
												anIntArray548[local1++] = Static23.anInt353;
												continue;
											}
											if (local31 == 5001) {
												local1 -= 3;
												Static23.anInt353 = anIntArray548[local1];
												Static381.anInt6604 = anIntArray548[local1 + 1];
												Static132.anInt2862 = anIntArray548[local1 + 2];
												Static77.method1332(Static32.aClass183_7);
												Static76.aClass2_Sub24_Sub2_7.method5746(Static23.anInt353);
												Static76.aClass2_Sub24_Sub2_7.method5746(Static381.anInt6604);
												Static76.aClass2_Sub24_Sub2_7.method5746(Static132.anInt2862);
												continue;
											}
											if (local31 == 5002) {
												local3 -= 2;
												local352 = aStringArray39[local3];
												local1702 = aStringArray39[local3 + 1];
												local1 -= 2;
												local744 = anIntArray548[local1];
												local395 = anIntArray548[local1 + 1];
												if (local1702 == null) {
													local1702 = "";
												}
												if (local1702.length() > 80) {
													local1702 = local1702.substring(0, 80);
												}
												Static77.method1332(Static200.aClass183_57);
												Static76.aClass2_Sub24_Sub2_7.method5746(Static305.method6026(local352) + Static305.method6026(local1702) + 2);
												Static76.aClass2_Sub24_Sub2_7.method5772(local352);
												Static76.aClass2_Sub24_Sub2_7.method5746(local744 - 1);
												Static76.aClass2_Sub24_Sub2_7.method5746(local395);
												Static76.aClass2_Sub24_Sub2_7.method5772(local1702);
												continue;
											}
											if (local31 == 5003) {
												local1--;
												local540 = anIntArray548[local1];
												local1702 = null;
												if (local540 < 100) {
													local1702 = Static217.aStringArray25[local540];
												}
												if (local1702 == null) {
													local1702 = "";
												}
												aStringArray39[local3++] = local1702;
												continue;
											}
											if (local31 == 5004) {
												local1--;
												local540 = anIntArray548[local1];
												local545 = -1;
												if (local540 < 100 && Static217.aStringArray25[local540] != null) {
													local545 = Static73.anIntArray121[local540];
												}
												anIntArray548[local1++] = local545;
												continue;
											}
											if (local31 == 5005) {
												anIntArray548[local1++] = Static381.anInt6604;
												continue;
											}
											if (local31 == 5008) {
												local3--;
												local352 = aStringArray39[local3];
												if (Static273.anInt5130 == 0 && (Static243.aBoolean352 && !Static184.aBoolean280 || Static142.aBoolean215)) {
													continue;
												}
												local1702 = local352.toLowerCase();
												@Pc(7969) byte local7969 = 0;
												if (local1702.startsWith(Static262.aClass62_181.method1389(0))) {
													local7969 = 0;
													local352 = local352.substring(Static262.aClass62_181.method1389(0).length());
												} else if (local1702.startsWith(Static384.aClass62_244.method1389(0))) {
													local7969 = 1;
													local352 = local352.substring(Static384.aClass62_244.method1389(0).length());
												} else if (local1702.startsWith(Static338.aClass62_224.method1389(0))) {
													local7969 = 2;
													local352 = local352.substring(Static338.aClass62_224.method1389(0).length());
												} else if (local1702.startsWith(Static265.aClass62_183.method1389(0))) {
													local7969 = 3;
													local352 = local352.substring(Static265.aClass62_183.method1389(0).length());
												} else if (local1702.startsWith(Static38.aClass62_23.method1389(0))) {
													local7969 = 4;
													local352 = local352.substring(Static38.aClass62_23.method1389(0).length());
												} else if (local1702.startsWith(Static372.aClass62_236.method1389(0))) {
													local7969 = 5;
													local352 = local352.substring(Static372.aClass62_236.method1389(0).length());
												} else if (local1702.startsWith(Static374.aClass62_238.method1389(0))) {
													local7969 = 6;
													local352 = local352.substring(Static374.aClass62_238.method1389(0).length());
												} else if (local1702.startsWith(Static361.aClass62_143.method1389(0))) {
													local7969 = 7;
													local352 = local352.substring(Static361.aClass62_143.method1389(0).length());
												} else if (local1702.startsWith(Static9.aClass62_5.method1389(0))) {
													local7969 = 8;
													local352 = local352.substring(Static9.aClass62_5.method1389(0).length());
												} else if (local1702.startsWith(Static114.aClass62_81.method1389(0))) {
													local7969 = 9;
													local352 = local352.substring(Static114.aClass62_81.method1389(0).length());
												} else if (local1702.startsWith(Static66.aClass62_45.method1389(0))) {
													local7969 = 10;
													local352 = local352.substring(Static66.aClass62_45.method1389(0).length());
												} else if (local1702.startsWith(Static30.aClass62_15.method1389(0))) {
													local7969 = 11;
													local352 = local352.substring(Static30.aClass62_15.method1389(0).length());
												} else if (Static200.anInt4144 != 0) {
													if (local1702.startsWith(Static262.aClass62_181.method1389(Static200.anInt4144))) {
														local7969 = 0;
														local352 = local352.substring(Static262.aClass62_181.method1389(Static200.anInt4144).length());
													} else if (local1702.startsWith(Static384.aClass62_244.method1389(Static200.anInt4144))) {
														local7969 = 1;
														local352 = local352.substring(Static384.aClass62_244.method1389(Static200.anInt4144).length());
													} else if (local1702.startsWith(Static338.aClass62_224.method1389(Static200.anInt4144))) {
														local7969 = 2;
														local352 = local352.substring(Static338.aClass62_224.method1389(Static200.anInt4144).length());
													} else if (local1702.startsWith(Static265.aClass62_183.method1389(Static200.anInt4144))) {
														local7969 = 3;
														local352 = local352.substring(Static265.aClass62_183.method1389(Static200.anInt4144).length());
													} else if (local1702.startsWith(Static38.aClass62_23.method1389(Static200.anInt4144))) {
														local7969 = 4;
														local352 = local352.substring(Static38.aClass62_23.method1389(Static200.anInt4144).length());
													} else if (local1702.startsWith(Static372.aClass62_236.method1389(Static200.anInt4144))) {
														local7969 = 5;
														local352 = local352.substring(Static372.aClass62_236.method1389(Static200.anInt4144).length());
													} else if (local1702.startsWith(Static374.aClass62_238.method1389(Static200.anInt4144))) {
														local7969 = 6;
														local352 = local352.substring(Static374.aClass62_238.method1389(Static200.anInt4144).length());
													} else if (local1702.startsWith(Static361.aClass62_143.method1389(Static200.anInt4144))) {
														local7969 = 7;
														local352 = local352.substring(Static361.aClass62_143.method1389(Static200.anInt4144).length());
													} else if (local1702.startsWith(Static9.aClass62_5.method1389(Static200.anInt4144))) {
														local7969 = 8;
														local352 = local352.substring(Static9.aClass62_5.method1389(Static200.anInt4144).length());
													} else if (local1702.startsWith(Static114.aClass62_81.method1389(Static200.anInt4144))) {
														local7969 = 9;
														local352 = local352.substring(Static114.aClass62_81.method1389(Static200.anInt4144).length());
													} else if (local1702.startsWith(Static66.aClass62_45.method1389(Static200.anInt4144))) {
														local7969 = 10;
														local352 = local352.substring(Static66.aClass62_45.method1389(Static200.anInt4144).length());
													} else if (local1702.startsWith(Static30.aClass62_15.method1389(Static200.anInt4144))) {
														local7969 = 11;
														local352 = local352.substring(Static30.aClass62_15.method1389(Static200.anInt4144).length());
													}
												}
												local1702 = local352.toLowerCase();
												@Pc(8407) byte local8407 = 0;
												if (local1702.startsWith(Static245.aClass62_170.method1389(0))) {
													local8407 = 1;
													local352 = local352.substring(Static245.aClass62_170.method1389(0).length());
												} else if (local1702.startsWith(Static203.aClass62_136.method1389(0))) {
													local8407 = 2;
													local352 = local352.substring(Static203.aClass62_136.method1389(0).length());
												} else if (local1702.startsWith(Static214.aClass62_153.method1389(0))) {
													local8407 = 3;
													local352 = local352.substring(Static214.aClass62_153.method1389(0).length());
												} else if (local1702.startsWith(Static91.aClass62_64.method1389(0))) {
													local8407 = 4;
													local352 = local352.substring(Static91.aClass62_64.method1389(0).length());
												} else if (local1702.startsWith(Static117.aClass62_85.method1389(0))) {
													local8407 = 5;
													local352 = local352.substring(Static117.aClass62_85.method1389(0).length());
												} else if (Static200.anInt4144 != 0) {
													if (local1702.startsWith(Static245.aClass62_170.method1389(Static200.anInt4144))) {
														local8407 = 1;
														local352 = local352.substring(Static245.aClass62_170.method1389(Static200.anInt4144).length());
													} else if (local1702.startsWith(Static203.aClass62_136.method1389(Static200.anInt4144))) {
														local8407 = 2;
														local352 = local352.substring(Static203.aClass62_136.method1389(Static200.anInt4144).length());
													} else if (local1702.startsWith(Static214.aClass62_153.method1389(Static200.anInt4144))) {
														local8407 = 3;
														local352 = local352.substring(Static214.aClass62_153.method1389(Static200.anInt4144).length());
													} else if (local1702.startsWith(Static91.aClass62_64.method1389(Static200.anInt4144))) {
														local8407 = 4;
														local352 = local352.substring(Static91.aClass62_64.method1389(Static200.anInt4144).length());
													} else if (local1702.startsWith(Static117.aClass62_85.method1389(Static200.anInt4144))) {
														local8407 = 5;
														local352 = local352.substring(Static117.aClass62_85.method1389(Static200.anInt4144).length());
													}
												}
												Static77.method1332(Static332.aClass183_96);
												Static76.aClass2_Sub24_Sub2_7.method5746(0);
												local414 = Static76.aClass2_Sub24_Sub2_7.anInt6669;
												Static76.aClass2_Sub24_Sub2_7.method5746(local7969);
												Static76.aClass2_Sub24_Sub2_7.method5746(local8407);
												Static220.method3900(Static76.aClass2_Sub24_Sub2_7, local352);
												Static76.aClass2_Sub24_Sub2_7.method5727(Static76.aClass2_Sub24_Sub2_7.anInt6669 - local414);
												continue;
											}
											if (local31 == 5009) {
												local3 -= 2;
												local352 = aStringArray39[local3];
												local1702 = aStringArray39[local3 + 1];
												if (Static273.anInt5130 != 0 || (!Static243.aBoolean352 || Static184.aBoolean280) && !Static142.aBoolean215) {
													Static77.method1332(Static229.aClass183_67);
													Static76.aClass2_Sub24_Sub2_7.method5746(0);
													local744 = Static76.aClass2_Sub24_Sub2_7.anInt6669;
													Static76.aClass2_Sub24_Sub2_7.method5772(local352);
													Static220.method3900(Static76.aClass2_Sub24_Sub2_7, local1702);
													Static76.aClass2_Sub24_Sub2_7.method5727(Static76.aClass2_Sub24_Sub2_7.anInt6669 - local744);
												}
												continue;
											}
											if (local31 == 5010) {
												local1--;
												local540 = anIntArray548[local1];
												local1702 = null;
												if (local540 < 100) {
													local1702 = Static337.aStringArray38[local540];
												}
												if (local1702 == null) {
													local1702 = "";
												}
												aStringArray39[local3++] = local1702;
												continue;
											}
											if (local31 == 5011) {
												local1--;
												local540 = anIntArray548[local1];
												local1702 = null;
												if (local540 < 100) {
													local1702 = Static286.aStringArray28[local540];
												}
												if (local1702 == null) {
													local1702 = "";
												}
												aStringArray39[local3++] = local1702;
												continue;
											}
											if (local31 == 5012) {
												local1--;
												local540 = anIntArray548[local1];
												local545 = -1;
												if (local540 < 100) {
													local545 = Static332.anIntArray530[local540];
												}
												anIntArray548[local1++] = local545;
												continue;
											}
											if (local31 == 5015) {
												if (Static182.aClass1_Sub2_Sub1_Sub1_1 == null || Static182.aClass1_Sub2_Sub1_Sub1_1.aString11 == null) {
													local352 = Static215.aString36;
												} else {
													local352 = Static182.aClass1_Sub2_Sub1_Sub1_1.method705();
												}
												aStringArray39[local3++] = local352;
												continue;
											}
											if (local31 == 5016) {
												anIntArray548[local1++] = Static132.anInt2862;
												continue;
											}
											if (local31 == 5017) {
												anIntArray548[local1++] = Static87.anInt1879;
												continue;
											}
											if (local31 == 5018) {
												local1--;
												local540 = anIntArray548[local1];
												local545 = 0;
												if (local540 < 100 && Static217.aStringArray25[local540] != null) {
													local545 = Static73.anIntArray121[local540];
												}
												anIntArray548[local1++] = local545;
												continue;
											}
											if (local31 == 5019) {
												local1--;
												local540 = anIntArray548[local1];
												local1702 = null;
												if (local540 < 100) {
													local1702 = Static312.aStringArray35[local540];
												}
												if (local1702 == null) {
													local1702 = "";
												}
												aStringArray39[local3++] = local1702;
												continue;
											}
											if (local31 == 5020) {
												if (Static182.aClass1_Sub2_Sub1_Sub1_1 == null || Static182.aClass1_Sub2_Sub1_Sub1_1.aString11 == null) {
													local352 = Static215.aString36;
												} else {
													local352 = Static182.aClass1_Sub2_Sub1_Sub1_1.method706();
												}
												aStringArray39[local3++] = local352;
												continue;
											}
											if (local31 == 5050) {
												local1--;
												local540 = anIntArray548[local1];
												aStringArray39[local3++] = Static146.method2641(local540).aString45;
												continue;
											}
											@Pc(8899) Class2_Sub7_Sub14 local8899;
											if (local31 == 5051) {
												local1--;
												local540 = anIntArray548[local1];
												local8899 = Static146.method2641(local540);
												if (local8899.anIntArray404 == null) {
													anIntArray548[local1++] = 0;
												} else {
													anIntArray548[local1++] = local8899.anIntArray404.length;
												}
												continue;
											}
											if (local31 == 5052) {
												local1 -= 2;
												local540 = anIntArray548[local1];
												local545 = anIntArray548[local1 + 1];
												@Pc(8934) Class2_Sub7_Sub14 local8934 = Static146.method2641(local540);
												local395 = local8934.anIntArray404[local545];
												anIntArray548[local1++] = local395;
												continue;
											}
											if (local31 == 5053) {
												local1--;
												local540 = anIntArray548[local1];
												local8899 = Static146.method2641(local540);
												if (local8899.anIntArray405 == null) {
													anIntArray548[local1++] = 0;
												} else {
													anIntArray548[local1++] = local8899.anIntArray405.length;
												}
												continue;
											}
											if (local31 == 5054) {
												local1 -= 2;
												local540 = anIntArray548[local1];
												local545 = anIntArray548[local1 + 1];
												anIntArray548[local1++] = Static146.method2641(local540).anIntArray405[local545];
												continue;
											}
											if (local31 == 5055) {
												local1--;
												local540 = anIntArray548[local1];
												aStringArray39[local3++] = Static116.method2078(local540).method1716();
												continue;
											}
											if (local31 == 5056) {
												local1--;
												local540 = anIntArray548[local1];
												@Pc(9029) Class2_Sub7_Sub4 local9029 = Static116.method2078(local540);
												if (local9029.anIntArray170 == null) {
													anIntArray548[local1++] = 0;
												} else {
													anIntArray548[local1++] = local9029.anIntArray170.length;
												}
												continue;
											}
											if (local31 == 5057) {
												local1 -= 2;
												local540 = anIntArray548[local1];
												local545 = anIntArray548[local1 + 1];
												anIntArray548[local1++] = Static116.method2078(local540).anIntArray170[local545];
												continue;
											}
											if (local31 == 5058) {
												aClass193_1 = new Class193();
												local1--;
												aClass193_1.anInt5276 = anIntArray548[local1];
												aClass193_1.aClass2_Sub7_Sub4_1 = Static116.method2078(aClass193_1.anInt5276);
												aClass193_1.anIntArray455 = new int[aClass193_1.aClass2_Sub7_Sub4_1.method1720()];
												continue;
											}
											if (local31 == 5059) {
												Static77.method1332(Static359.aClass183_102);
												Static76.aClass2_Sub24_Sub2_7.method5746(0);
												local540 = Static76.aClass2_Sub24_Sub2_7.anInt6669;
												Static76.aClass2_Sub24_Sub2_7.method5746(0);
												Static76.aClass2_Sub24_Sub2_7.method5721(aClass193_1.anInt5276);
												aClass193_1.aClass2_Sub7_Sub4_1.method1713(aClass193_1.anIntArray455, Static76.aClass2_Sub24_Sub2_7);
												Static76.aClass2_Sub24_Sub2_7.method5727(Static76.aClass2_Sub24_Sub2_7.anInt6669 - local540);
												continue;
											}
											if (local31 == 5060) {
												local3--;
												local352 = aStringArray39[local3];
												Static77.method1332(Static295.aClass183_83);
												Static76.aClass2_Sub24_Sub2_7.method5746(0);
												local545 = Static76.aClass2_Sub24_Sub2_7.anInt6669;
												Static76.aClass2_Sub24_Sub2_7.method5772(local352);
												Static76.aClass2_Sub24_Sub2_7.method5721(aClass193_1.anInt5276);
												aClass193_1.aClass2_Sub7_Sub4_1.method1713(aClass193_1.anIntArray455, Static76.aClass2_Sub24_Sub2_7);
												Static76.aClass2_Sub24_Sub2_7.method5727(Static76.aClass2_Sub24_Sub2_7.anInt6669 - local545);
												continue;
											}
											if (local31 == 5061) {
												Static77.method1332(Static359.aClass183_102);
												Static76.aClass2_Sub24_Sub2_7.method5746(0);
												local540 = Static76.aClass2_Sub24_Sub2_7.anInt6669;
												Static76.aClass2_Sub24_Sub2_7.method5746(1);
												Static76.aClass2_Sub24_Sub2_7.method5721(aClass193_1.anInt5276);
												aClass193_1.aClass2_Sub7_Sub4_1.method1713(aClass193_1.anIntArray455, Static76.aClass2_Sub24_Sub2_7);
												Static76.aClass2_Sub24_Sub2_7.method5727(Static76.aClass2_Sub24_Sub2_7.anInt6669 - local540);
												continue;
											}
											if (local31 == 5062) {
												local1 -= 2;
												local540 = anIntArray548[local1];
												local545 = anIntArray548[local1 + 1];
												anIntArray548[local1++] = Static146.method2641(local540).aCharArray4[local545];
												continue;
											}
											if (local31 == 5063) {
												local1 -= 2;
												local540 = anIntArray548[local1];
												local545 = anIntArray548[local1 + 1];
												anIntArray548[local1++] = Static146.method2641(local540).aCharArray5[local545];
												continue;
											}
											if (local31 == 5064) {
												local1 -= 2;
												local540 = anIntArray548[local1];
												local545 = anIntArray548[local1 + 1];
												if (local545 == -1) {
													anIntArray548[local1++] = -1;
												} else {
													anIntArray548[local1++] = Static146.method2641(local540).method4453((char) local545);
												}
												continue;
											}
											if (local31 == 5065) {
												local1 -= 2;
												local540 = anIntArray548[local1];
												local545 = anIntArray548[local1 + 1];
												if (local545 == -1) {
													anIntArray548[local1++] = -1;
												} else {
													anIntArray548[local1++] = Static146.method2641(local540).method4449((char) local545);
												}
												continue;
											}
											if (local31 == 5066) {
												local1--;
												local540 = anIntArray548[local1];
												anIntArray548[local1++] = Static116.method2078(local540).method1720();
												continue;
											}
											if (local31 == 5067) {
												local1 -= 2;
												local540 = anIntArray548[local1];
												local545 = anIntArray548[local1 + 1];
												local744 = Static116.method2078(local540).method1717(local545);
												anIntArray548[local1++] = local744;
												continue;
											}
											if (local31 == 5068) {
												local1 -= 2;
												local540 = anIntArray548[local1];
												local545 = anIntArray548[local1 + 1];
												aClass193_1.anIntArray455[local540] = local545;
												continue;
											}
											if (local31 == 5069) {
												local1 -= 2;
												local540 = anIntArray548[local1];
												local545 = anIntArray548[local1 + 1];
												aClass193_1.anIntArray455[local540] = local545;
												continue;
											}
											if (local31 == 5070) {
												local1 -= 3;
												local540 = anIntArray548[local1];
												local545 = anIntArray548[local1 + 1];
												local744 = anIntArray548[local1 + 2];
												@Pc(9455) Class2_Sub7_Sub4 local9455 = Static116.method2078(local540);
												if (local9455.method1717(local545) != 0) {
													throw new RuntimeException("bad command");
												}
												anIntArray548[local1++] = local9455.method1719(local545, local744);
												continue;
											}
											if (local31 == 5071) {
												local3--;
												local352 = aStringArray39[local3];
												local1--;
												local1269 = anIntArray548[local1] == 1;
												Static337.method5435(local352, local1269);
												anIntArray548[local1++] = Static274.anInt5131;
												continue;
											}
											if (local31 == 5072) {
												if (Static323.aShortArray111 != null && Static369.anInt6786 < Static274.anInt5131) {
													anIntArray548[local1++] = Static323.aShortArray111[Static369.anInt6786++] & 0xFFFF;
													continue;
												}
												anIntArray548[local1++] = -1;
												continue;
											}
											if (local31 == 5073) {
												Static369.anInt6786 = 0;
												continue;
											}
										} else if (local31 < 5200) {
											if (local31 == 5100) {
												if (Static68.aClass98_1.method4517(86)) {
													anIntArray548[local1++] = 1;
												} else {
													anIntArray548[local1++] = 0;
												}
												continue;
											}
											if (local31 == 5101) {
												if (Static68.aClass98_1.method4517(82)) {
													anIntArray548[local1++] = 1;
												} else {
													anIntArray548[local1++] = 0;
												}
												continue;
											}
											if (local31 == 5102) {
												if (Static68.aClass98_1.method4517(81)) {
													anIntArray548[local1++] = 1;
												} else {
													anIntArray548[local1++] = 0;
												}
												continue;
											}
										} else {
											@Pc(9978) boolean local9978;
											if (local31 < 5300) {
												if (local31 == 5200) {
													local1--;
													Static93.method1559(anIntArray548[local1]);
													continue;
												}
												if (local31 == 5201) {
													anIntArray548[local1++] = Static162.method2881();
													continue;
												}
												if (local31 == 5205) {
													local1--;
													Static205.method3761(anIntArray548[local1], -1, -1, false);
													continue;
												}
												@Pc(9654) Class2_Sub7_Sub12 local9654;
												if (local31 == 5206) {
													local1--;
													local540 = anIntArray548[local1];
													local9654 = Static20.method4157(local540 >> 14 & 0x3FFF, local540 & 0x3FFF);
													if (local9654 == null) {
														anIntArray548[local1++] = -1;
													} else {
														anIntArray548[local1++] = local9654.anInt4741;
													}
													continue;
												}
												@Pc(9678) Class2_Sub7_Sub12 local9678;
												if (local31 == 5207) {
													local1--;
													local9678 = Static20.method4148(anIntArray548[local1]);
													if (local9678 != null && local9678.aString43 != null) {
														aStringArray39[local3++] = local9678.aString43;
														continue;
													}
													aStringArray39[local3++] = "";
													continue;
												}
												if (local31 == 5208) {
													anIntArray548[local1++] = Static227.anInt4588;
													anIntArray548[local1++] = Static391.anInt7128;
													continue;
												}
												if (local31 == 5209) {
													anIntArray548[local1++] = Static375.anInt6902 + Static20.anInt4606;
													anIntArray548[local1++] = Static208.anInt4249 + Static20.anInt4611;
													continue;
												}
												if (local31 == 5210) {
													local1--;
													local540 = anIntArray548[local1];
													local9654 = Static20.method4148(local540);
													if (local9654 == null) {
														anIntArray548[local1++] = 0;
														anIntArray548[local1++] = 0;
													} else {
														anIntArray548[local1++] = local9654.anInt4738 >> 14 & 0x3FFF;
														anIntArray548[local1++] = local9654.anInt4738 & 0x3FFF;
													}
													continue;
												}
												if (local31 == 5211) {
													local1--;
													local540 = anIntArray548[local1];
													local9654 = Static20.method4148(local540);
													if (local9654 == null) {
														anIntArray548[local1++] = 0;
														anIntArray548[local1++] = 0;
													} else {
														anIntArray548[local1++] = local9654.anInt4739 - local9654.anInt4736;
														anIntArray548[local1++] = local9654.anInt4742 - local9654.anInt4737;
													}
													continue;
												}
												@Pc(9820) Class2_Sub10 local9820;
												if (local31 == 5212) {
													local9820 = Static196.method2015();
													if (local9820 == null) {
														anIntArray548[local1++] = -1;
														anIntArray548[local1++] = -1;
													} else {
														anIntArray548[local1++] = local9820.anInt2183;
														local545 = local9820.anInt2177 << 28 | local9820.anInt2184 + Static20.anInt4606 << 14 | local9820.anInt2178 + Static20.anInt4611;
														anIntArray548[local1++] = local545;
													}
													continue;
												}
												if (local31 == 5213) {
													local9820 = Static6.method62();
													if (local9820 == null) {
														anIntArray548[local1++] = -1;
														anIntArray548[local1++] = -1;
													} else {
														anIntArray548[local1++] = local9820.anInt2183;
														local545 = local9820.anInt2177 << 28 | local9820.anInt2184 + Static20.anInt4606 << 14 | local9820.anInt2178 + Static20.anInt4611;
														anIntArray548[local1++] = local545;
													}
													continue;
												}
												if (local31 == 5214) {
													local1--;
													local540 = anIntArray548[local1];
													local9654 = Static112.method1694();
													if (local9654 != null) {
														local6934 = local9654.method4258(local540 & 0x3FFF, anIntArray550, local540 >> 14 & 0x3FFF, local540 >> 28 & 0x3);
														if (local6934) {
															Static190.method3486(anIntArray550[2], anIntArray550[1]);
														}
													}
													continue;
												}
												if (local31 == 5215) {
													local1 -= 2;
													local540 = anIntArray548[local1];
													local545 = anIntArray548[local1 + 1];
													@Pc(9976) Class179 local9976 = Static20.method4161(local540 >> 14 & 0x3FFF, local540 & 0x3FFF);
													local9978 = false;
													for (@Pc(9983) Class2_Sub7_Sub12 local9983 = (Class2_Sub7_Sub12) local9976.method4487(); local9983 != null; local9983 = (Class2_Sub7_Sub12) local9976.method4494()) {
														if (local9983.anInt4741 == local545) {
															local9978 = true;
															break;
														}
													}
													if (local9978) {
														anIntArray548[local1++] = 1;
													} else {
														anIntArray548[local1++] = 0;
													}
													continue;
												}
												if (local31 == 5218) {
													local1--;
													local540 = anIntArray548[local1];
													local9654 = Static20.method4148(local540);
													if (local9654 == null) {
														anIntArray548[local1++] = -1;
													} else {
														anIntArray548[local1++] = local9654.anInt4735;
													}
													continue;
												}
												if (local31 == 5220) {
													anIntArray548[local1++] = Static344.anInt6330 == 100 ? 1 : 0;
													continue;
												}
												if (local31 == 5221) {
													local1--;
													local540 = anIntArray548[local1];
													Static190.method3486(local540 & 0x3FFF, local540 >> 14 & 0x3FFF);
													continue;
												}
												if (local31 == 5222) {
													local9678 = Static112.method1694();
													if (local9678 == null) {
														anIntArray548[local1++] = -1;
														anIntArray548[local1++] = -1;
													} else {
														local1269 = local9678.method4262(anIntArray550, Static208.anInt4249 + Static20.anInt4611, Static375.anInt6902 + Static20.anInt4606);
														if (local1269) {
															anIntArray548[local1++] = anIntArray550[1];
															anIntArray548[local1++] = anIntArray550[2];
														} else {
															anIntArray548[local1++] = -1;
															anIntArray548[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5223) {
													local1 -= 2;
													local540 = anIntArray548[local1];
													local545 = anIntArray548[local1 + 1];
													Static205.method3761(local540, local545 >> 14 & 0x3FFF, local545 & 0x3FFF, false);
													continue;
												}
												if (local31 == 5224) {
													local1--;
													local540 = anIntArray548[local1];
													local9654 = Static112.method1694();
													if (local9654 == null) {
														anIntArray548[local1++] = -1;
														anIntArray548[local1++] = -1;
													} else {
														local6934 = local9654.method4258(local540 & 0x3FFF, anIntArray550, local540 >> 14 & 0x3FFF, local540 >> 28 & 0x3);
														if (local6934) {
															anIntArray548[local1++] = anIntArray550[1];
															anIntArray548[local1++] = anIntArray550[2];
														} else {
															anIntArray548[local1++] = -1;
															anIntArray548[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5225) {
													local1--;
													local540 = anIntArray548[local1];
													local9654 = Static112.method1694();
													if (local9654 == null) {
														anIntArray548[local1++] = -1;
														anIntArray548[local1++] = -1;
													} else {
														local6934 = local9654.method4262(anIntArray550, local540 & 0x3FFF, local540 >> 14 & 0x3FFF);
														if (local6934) {
															anIntArray548[local1++] = anIntArray550[1];
															anIntArray548[local1++] = anIntArray550[2];
														} else {
															anIntArray548[local1++] = -1;
															anIntArray548[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5226) {
													local1--;
													Static108.method1971(anIntArray548[local1]);
													continue;
												}
												if (local31 == 5227) {
													local1 -= 2;
													local540 = anIntArray548[local1];
													local545 = anIntArray548[local1 + 1];
													Static205.method3761(local540, local545 >> 14 & 0x3FFF, local545 & 0x3FFF, true);
													continue;
												}
												if (local31 == 5228) {
													local1--;
													Static118.aBoolean397 = anIntArray548[local1] == 1;
													continue;
												}
												if (local31 == 5229) {
													anIntArray548[local1++] = Static118.aBoolean397 ? 1 : 0;
													continue;
												}
												if (local31 == 5230) {
													local1--;
													local540 = anIntArray548[local1];
													Static310.method5036(local540);
													continue;
												}
												@Pc(10394) Class2 local10394;
												if (local31 == 5231) {
													local1 -= 2;
													local540 = anIntArray548[local1];
													local1269 = anIntArray548[local1 + 1] == 1;
													if (Static158.aClass243_13 == null) {
														continue;
													}
													local10394 = Static158.aClass243_13.method5967((long) local540);
													if (local10394 != null && !local1269) {
														local10394.method6130();
														continue;
													}
													if (local10394 == null && local1269) {
														local10394 = new Class2();
														Static158.aClass243_13.method5968((long) local540, local10394);
													}
													continue;
												}
												@Pc(10433) Class2 local10433;
												if (local31 == 5232) {
													local1--;
													local540 = anIntArray548[local1];
													if (Static158.aClass243_13 == null) {
														anIntArray548[local1++] = 0;
													} else {
														local10433 = Static158.aClass243_13.method5967((long) local540);
														anIntArray548[local1++] = local10433 == null ? 0 : 1;
													}
													continue;
												}
												if (local31 == 5233) {
													local1 -= 2;
													local540 = anIntArray548[local1];
													local1269 = anIntArray548[local1 + 1] == 1;
													if (Static120.aClass243_10 == null) {
														continue;
													}
													local10394 = Static120.aClass243_10.method5967((long) local540);
													if (local10394 != null && !local1269) {
														local10394.method6130();
														continue;
													}
													if (local10394 == null && local1269) {
														local10394 = new Class2();
														Static120.aClass243_10.method5968((long) local540, local10394);
													}
													continue;
												}
												if (local31 == 5234) {
													local1--;
													local540 = anIntArray548[local1];
													if (Static120.aClass243_10 == null) {
														anIntArray548[local1++] = 0;
													} else {
														local10433 = Static120.aClass243_10.method5967((long) local540);
														anIntArray548[local1++] = local10433 == null ? 0 : 1;
													}
													continue;
												}
												if (local31 == 5235) {
													anIntArray548[local1++] = Static20.aClass2_Sub7_Sub12_3 == null ? -1 : Static20.aClass2_Sub7_Sub12_3.anInt4741;
													continue;
												}
											} else if (local31 < 5400) {
												if (local31 == 5300) {
													local1 -= 2;
													local540 = anIntArray548[local1];
													local545 = anIntArray548[local1 + 1];
													Static314.method5081(local540, 3, false, local545);
													anIntArray548[local1++] = Static33.aFrame2 == null ? 0 : 1;
													continue;
												}
												if (local31 == 5301) {
													if (Static33.aFrame2 != null) {
														Static314.method5081(-1, Static202.anInt4200, false, -1);
													}
													continue;
												}
												if (local31 == 5302) {
													@Pc(10596) Class68[] local10596 = Static7.method72();
													anIntArray548[local1++] = local10596.length;
													continue;
												}
												if (local31 == 5303) {
													local1--;
													local540 = anIntArray548[local1];
													@Pc(10614) Class68[] local10614 = Static7.method72();
													anIntArray548[local1++] = local10614[local540].anInt1896;
													anIntArray548[local1++] = local10614[local540].anInt1899;
													continue;
												}
												if (local31 == 5305) {
													local540 = Static120.anInt2646;
													local545 = Static260.anInt4975;
													local744 = -1;
													@Pc(10643) Class68[] local10643 = Static7.method72();
													for (local414 = 0; local414 < local10643.length; local414++) {
														@Pc(10650) Class68 local10650 = local10643[local414];
														if (local10650.anInt1896 == local540 && local10650.anInt1899 == local545) {
															local744 = local414;
															break;
														}
													}
													anIntArray548[local1++] = local744;
													continue;
												}
												if (local31 == 5306) {
													anIntArray548[local1++] = Static195.method3553();
													continue;
												}
												if (local31 == 5307) {
													local1--;
													local540 = anIntArray548[local1];
													if (local540 >= 1 && local540 <= 2) {
														Static314.method5081(-1, local540, false, -1);
													}
													continue;
												}
												if (local31 == 5308) {
													anIntArray548[local1++] = Static202.anInt4200;
													continue;
												}
												if (local31 == 5309) {
													local1--;
													local540 = anIntArray548[local1];
													if (local540 >= 1 && local540 <= 2) {
														Static202.anInt4200 = local540;
														Static237.method4219(Static154.aClass123_2);
													}
													continue;
												}
											} else {
												@Pc(11105) String local11105;
												if (local31 < 5500) {
													if (local31 == 5400) {
														local3 -= 2;
														local352 = aStringArray39[local3];
														local1702 = aStringArray39[local3 + 1];
														local1--;
														local744 = anIntArray548[local1];
														Static77.method1332(Static203.aClass183_56);
														Static76.aClass2_Sub24_Sub2_7.method5746(Static305.method6026(local352) + Static305.method6026(local1702) + 1);
														Static76.aClass2_Sub24_Sub2_7.method5772(local352);
														Static76.aClass2_Sub24_Sub2_7.method5772(local1702);
														Static76.aClass2_Sub24_Sub2_7.method5746(local744);
														continue;
													}
													if (local31 == 5401) {
														local1 -= 2;
														Static53.aShortArray9[anIntArray548[local1]] = (short) Static87.method1486(anIntArray548[local1 + 1]);
														Static57.aClass196_1.method4825();
														Static57.aClass196_1.method4823();
														Static207.aClass32_1.method571();
														Static59.method899();
														continue;
													}
													if (local31 == 5405) {
														local1 -= 2;
														local540 = anIntArray548[local1];
														local545 = anIntArray548[local1 + 1];
														if (local540 >= 0 && local540 < 2) {
															Static213.anIntArrayArrayArray8[local540] = new int[local545 << 1][4];
														}
														continue;
													}
													if (local31 == 5406) {
														local1 -= 7;
														local540 = anIntArray548[local1];
														local545 = anIntArray548[local1 + 1] << 1;
														local744 = anIntArray548[local1 + 2];
														local395 = anIntArray548[local1 + 3];
														local414 = anIntArray548[local1 + 4];
														local775 = anIntArray548[local1 + 5];
														@Pc(10891) int local10891 = anIntArray548[local1 + 6];
														if (local540 >= 0 && local540 < 2 && Static213.anIntArrayArrayArray8[local540] != null && local545 >= 0 && local545 < Static213.anIntArrayArrayArray8[local540].length) {
															Static213.anIntArrayArrayArray8[local540][local545] = new int[] { (local744 >> 14 & 0x3FFF) * 128, local395, (local744 & 0x3FFF) * 128, local10891 };
															Static213.anIntArrayArrayArray8[local540][local545 + 1] = new int[] { (local414 >> 14 & 0x3FFF) * 128, local775, (local414 & 0x3FFF) * 128 };
														}
														continue;
													}
													if (local31 == 5407) {
														local1--;
														local540 = Static213.anIntArrayArrayArray8[anIntArray548[local1]].length >> 1;
														anIntArray548[local1++] = local540;
														continue;
													}
													if (local31 == 5411) {
														if (Static33.aFrame2 != null) {
															Static314.method5081(-1, Static202.anInt4200, false, -1);
														}
														if (Static115.aFrame3 == null) {
															local352 = Static65.aString15 == null ? Static191.method4406() : Static65.aString15;
															Static171.method3041(Static36.anInt2910 == 1, local352, Static154.aClass123_2, false);
														} else {
															Static209.method3787();
															System.exit(0);
														}
														continue;
													}
													if (local31 == 5419) {
														local352 = "";
														if (Static283.aClass86_8 != null) {
															if (Static283.aClass86_8.anObject2 == null) {
																local352 = Static184.method3416(Static283.aClass86_8.anInt2588);
															} else {
																local352 = (String) Static283.aClass86_8.anObject2;
															}
														}
														aStringArray39[local3++] = local352;
														continue;
													}
													if (local31 == 5420) {
														anIntArray548[local1++] = Static175.anInt3717 == 3 ? 1 : 0;
														continue;
													}
													if (local31 == 5421) {
														if (Static33.aFrame2 != null) {
															Static314.method5081(-1, Static202.anInt4200, false, -1);
														}
														local3--;
														local352 = aStringArray39[local3];
														local1--;
														local1269 = anIntArray548[local1] == 1;
														local11105 = Static191.method4406() + local352;
														Static171.method3041(Static36.anInt2910 == 1, local11105, Static154.aClass123_2, local1269);
														continue;
													}
													if (local31 == 5422) {
														local3 -= 2;
														local352 = aStringArray39[local3];
														local1702 = aStringArray39[local3 + 1];
														local1--;
														local744 = anIntArray548[local1];
														if (local352.length() > 0) {
															if (Static81.aStringArray11 == null) {
																Static81.aStringArray11 = new String[Static237.anIntArray390[Static85.aClass38_1.anInt765]];
															}
															Static81.aStringArray11[local744] = local352;
														}
														if (local1702.length() > 0) {
															if (Static383.aStringArray44 == null) {
																Static383.aStringArray44 = new String[Static237.anIntArray390[Static85.aClass38_1.anInt765]];
															}
															Static383.aStringArray44[local744] = local1702;
														}
														continue;
													}
													if (local31 == 5423) {
														local3--;
														System.out.println(aStringArray39[local3]);
														continue;
													}
													if (local31 == 5424) {
														local1 -= 11;
														Static336.anInt6211 = anIntArray548[local1];
														Static240.anInt4746 = anIntArray548[local1 + 1];
														Static94.anInt2020 = anIntArray548[local1 + 2];
														Static167.anInt3449 = anIntArray548[local1 + 3];
														Static212.anInt4289 = anIntArray548[local1 + 4];
														Static159.anInt3286 = anIntArray548[local1 + 5];
														Static276.anInt7134 = anIntArray548[local1 + 6];
														Static251.anInt4861 = anIntArray548[local1 + 7];
														Static33.anInt215 = anIntArray548[local1 + 8];
														Static279.anInt5189 = anIntArray548[local1 + 9];
														Static373.anInt6859 = anIntArray548[local1 + 10];
														Static324.aClass83_116.method1958(Static212.anInt4289);
														Static324.aClass83_116.method1958(Static159.anInt3286);
														Static324.aClass83_116.method1958(Static276.anInt7134);
														Static324.aClass83_116.method1958(Static251.anInt4861);
														Static324.aClass83_116.method1958(Static33.anInt215);
														Static51.aClass27_2 = null;
														Static24.aClass27_1 = null;
														Static248.aClass27_20 = null;
														Static350.aClass27_22 = null;
														Static65.aClass27_6 = null;
														Static76.aClass27_9 = null;
														Static152.aClass27_18 = null;
														Static137.aClass27_4 = null;
														Static127.aBoolean191 = true;
														continue;
													}
													if (local31 == 5425) {
														Static32.method365();
														Static127.aBoolean191 = false;
														continue;
													}
													if (local31 == 5426) {
														local1 -= 2;
														Static387.anInt7048 = anIntArray548[local1];
														Static134.anInt2940 = anIntArray548[local1 + 1];
														continue;
													}
													if (local31 == 5427) {
														local1 -= 2;
														Static27.anInt2840 = anIntArray548[local1 + 1];
														continue;
													}
													if (local31 == 5428) {
														local1 -= 2;
														local540 = anIntArray548[local1];
														local545 = anIntArray548[local1 + 1];
														anIntArray548[local1++] = Static303.method6084(local545, local540) ? 1 : 0;
														continue;
													}
													if (local31 == 5429) {
														local3--;
														Static39.method541(aStringArray39[local3], false);
														continue;
													}
												} else if (local31 < 5600) {
													if (local31 == 5500) {
														local1 -= 4;
														local540 = anIntArray548[local1];
														local545 = anIntArray548[local1 + 1];
														local744 = anIntArray548[local1 + 2];
														local395 = anIntArray548[local1 + 3];
														Static358.method5631(local395, false, local744, (local540 >> 14 & 0x3FFF) - Static279.anInt5198, local545, (local540 & 0x3FFF) - Static350.anInt6470);
														continue;
													}
													if (local31 == 5501) {
														local1 -= 4;
														local540 = anIntArray548[local1];
														local545 = anIntArray548[local1 + 1];
														local744 = anIntArray548[local1 + 2];
														local395 = anIntArray548[local1 + 3];
														Static153.method2736(local545, local395, local744, (local540 >> 14 & 0x3FFF) - Static279.anInt5198, (local540 & 0x3FFF) - Static350.anInt6470);
														continue;
													}
													if (local31 == 5502) {
														local1 -= 6;
														local540 = anIntArray548[local1];
														if (local540 >= 2) {
															throw new RuntimeException();
														}
														Static296.anInt5530 = local540;
														local545 = anIntArray548[local1 + 1];
														if (local545 + 1 >= Static213.anIntArrayArrayArray8[Static296.anInt5530].length >> 1) {
															throw new RuntimeException();
														}
														Static340.anInt6279 = local545;
														Static248.anInt4822 = 0;
														Static260.anInt4977 = anIntArray548[local1 + 2];
														Static62.anInt4763 = anIntArray548[local1 + 3];
														local744 = anIntArray548[local1 + 4];
														if (local744 >= 2) {
															throw new RuntimeException();
														}
														Static123.anInt5935 = local744;
														local395 = anIntArray548[local1 + 5];
														if (local395 + 1 >= Static213.anIntArrayArrayArray8[Static123.anInt5935].length >> 1) {
															throw new RuntimeException();
														}
														Static154.anInt3221 = local395;
														Static198.anInt4108 = 3;
														continue;
													}
													if (local31 == 5503) {
														Static370.method4294();
														continue;
													}
													if (local31 == 5504) {
														local1 -= 2;
														Static23.method269(anIntArray548[local1], anIntArray548[local1 + 1]);
														continue;
													}
													if (local31 == 5505) {
														anIntArray548[local1++] = (int) Static323.aFloat71 >> 3;
														continue;
													}
													if (local31 == 5506) {
														anIntArray548[local1++] = (int) Static350.aFloat74 >> 3;
														continue;
													}
													if (local31 == 5507) {
														Static100.method1768();
														continue;
													}
													if (local31 == 5508) {
														Static389.method6107();
														continue;
													}
													if (local31 == 5509) {
														Static107.method1917();
														continue;
													}
													if (local31 == 5510) {
														Static53.method830();
														continue;
													}
													if (local31 == 5511) {
														local1--;
														local540 = anIntArray548[local1];
														local545 = local540 >> 14 & 0x3FFF;
														local744 = local540 & 0x3FFF;
														local545 -= Static279.anInt5198;
														if (local545 < 0) {
															local545 = 0;
														} else if (local545 >= Static89.anInt1891) {
															local545 = Static89.anInt1891;
														}
														local744 -= Static350.anInt6470;
														if (local744 < 0) {
															local744 = 0;
														} else if (local744 >= Static85.anInt1839) {
															local744 = Static85.anInt1839;
														}
														Static124.anInt4240 = local545 * 128 + 64;
														Static273.anInt5127 = local744 * 128 + 64;
														Static198.anInt4108 = 4;
														continue;
													}
													if (local31 == 5512) {
														Static89.method1498();
														continue;
													}
												} else if (local31 < 5700) {
													if (local31 == 5600) {
														local3 -= 2;
														local352 = aStringArray39[local3];
														local1702 = aStringArray39[local3 + 1];
														local1--;
														local744 = anIntArray548[local1];
														if (Static121.anInt6774 == 10 && Static220.anInt4431 == 0 && Static147.anInt3137 == 0 && Static35.anInt619 == 0 && Static331.anInt6109 == 0) {
															Static1.method6021(local744, local1702, local352);
														}
														continue;
													}
													if (local31 == 5601) {
														Static86.method1460();
														continue;
													}
													if (local31 == 5602) {
														if (Static147.anInt3137 == 0) {
															Static228.anInt4595 = -2;
														}
														continue;
													}
													if (local31 == 5603) {
														local1 -= 4;
														if (Static121.anInt6774 == 10 && Static220.anInt4431 == 0 && Static147.anInt3137 == 0 && Static35.anInt619 == 0 && Static331.anInt6109 == 0) {
															Static114.method2043(anIntArray548[local1 + 2], anIntArray548[local1 + 3], anIntArray548[local1 + 1], anIntArray548[local1]);
														}
														continue;
													}
													if (local31 == 5604) {
														local3--;
														if (Static121.anInt6774 == 10 && Static220.anInt4431 == 0 && Static147.anInt3137 == 0 && Static35.anInt619 == 0 && Static331.anInt6109 == 0) {
															Static145.method4760(Static115.method2052(aStringArray39[local3]));
														}
														continue;
													}
													if (local31 == 5605) {
														local3 -= 3;
														local1 -= 7;
														if (Static121.anInt6774 == 10 && Static220.anInt4431 == 0 && Static147.anInt3137 == 0 && Static35.anInt619 == 0 && Static331.anInt6109 == 0) {
															Static23.method272(anIntArray548[local1], aStringArray39[local3 + 2], Static115.method2052(aStringArray39[local3]), anIntArray548[local1 + 6] == 1, anIntArray548[local1 + 2], anIntArray548[local1 + 5] == 1, anIntArray548[local1 + 1], anIntArray548[local1 + 3], aStringArray39[local3 + 1], anIntArray548[local1 + 4] == 1);
														}
														continue;
													}
													if (local31 == 5606) {
														if (Static35.anInt619 == 0) {
															Static70.anInt1555 = -2;
														}
														continue;
													}
													if (local31 == 5607) {
														anIntArray548[local1++] = Static228.anInt4595;
														continue;
													}
													if (local31 == 5608) {
														anIntArray548[local1++] = Static302.anInt5607;
														continue;
													}
													if (local31 == 5609) {
														anIntArray548[local1++] = Static70.anInt1555;
														continue;
													}
													if (local31 == 5610) {
														for (local540 = 0; local540 < 5; local540++) {
															aStringArray39[local3++] = Static204.aStringArray21.length > local540 ? Static55.method860(Static204.aStringArray21[local540]) : "";
														}
														Static204.aStringArray21 = null;
														continue;
													}
													if (local31 == 5611) {
														anIntArray548[local1++] = Static7.anInt170;
														continue;
													}
												} else if (local31 < 6100) {
													if (local31 == 6001) {
														local1--;
														local540 = anIntArray548[local1];
														if (local540 < 1) {
															local540 = 1;
														}
														if (local540 > 4) {
															local540 = 4;
														}
														Static190.anInt3986 = local540;
														Static44.method598();
														Static237.method4219(Static154.aClass123_2);
														Static383.aBoolean489 = false;
														continue;
													}
													if (local31 == 6002) {
														local1--;
														Static168.method2965(anIntArray548[local1] == 1);
														Static44.method598();
														Static369.method5878();
														Static237.method4219(Static154.aClass123_2);
														Static383.aBoolean489 = false;
														continue;
													}
													if (local31 == 6003) {
														local1--;
														Static314.aBoolean421 = anIntArray548[local1] == 1;
														Static369.method5878();
														Static237.method4219(Static154.aClass123_2);
														Static383.aBoolean489 = false;
														continue;
													}
													if (local31 == 6005) {
														local1--;
														Static72.aBoolean125 = anIntArray548[local1] == 1;
														Static44.method598();
														Static237.method4219(Static154.aClass123_2);
														Static383.aBoolean489 = false;
														continue;
													}
													if (local31 == 6006) {
														local1--;
														Static308.aBoolean416 = anIntArray548[local1] == 1;
														Static383.aClass48_9.method2499(!Static308.aBoolean416);
														Static237.method4219(Static154.aClass123_2);
														Static383.aBoolean489 = false;
														continue;
													}
													if (local31 == 6007) {
														local1--;
														Static73.anInt1628 = anIntArray548[local1];
														Static237.method4219(Static154.aClass123_2);
														Static383.aBoolean489 = false;
														continue;
													}
													if (local31 == 6008) {
														local1--;
														Static74.aBoolean127 = anIntArray548[local1] == 1;
														Static237.method4219(Static154.aClass123_2);
														Static383.aBoolean489 = false;
														continue;
													}
													if (local31 == 6009) {
														local1--;
														Static135.aBoolean205 = anIntArray548[local1] == 1;
														Static44.method598();
														Static237.method4219(Static154.aClass123_2);
														Static383.aBoolean489 = false;
														continue;
													}
													if (local31 == 6010) {
														local1--;
														Static183.aBoolean279 = anIntArray548[local1] == 1;
														Static237.method4219(Static154.aClass123_2);
														Static383.aBoolean489 = false;
														continue;
													}
													if (local31 == 6011) {
														local1--;
														local540 = anIntArray548[local1];
														if (local540 < 0 || local540 > 2) {
															local540 = 0;
														}
														Static266.anInt5047 = local540;
														Static44.method598();
														Static237.method4219(Static154.aClass123_2);
														Static383.aBoolean489 = false;
														continue;
													}
													if (local31 == 6012) {
														local1--;
														Static382.aBoolean487 = anIntArray548[local1] == 1;
														Static77.method1330();
														Static237.method4219(Static154.aClass123_2);
														Static383.aBoolean489 = false;
														continue;
													}
													if (local31 == 6014) {
														local1--;
														Static104.aBoolean168 = anIntArray548[local1] == 1;
														Static44.method598();
														Static237.method4219(Static154.aClass123_2);
														Static383.aBoolean489 = false;
														continue;
													}
													if (local31 == 6015) {
														local1--;
														Static135.aBoolean204 = anIntArray548[local1] == 1;
														Static44.method598();
														Static237.method4219(Static154.aClass123_2);
														Static383.aBoolean489 = false;
														continue;
													}
													if (local31 == 6016) {
														local1--;
														local540 = anIntArray548[local1];
														if (local540 < 0 || local540 > 2) {
															local540 = 0;
														}
														Static87.anInt1875 = local540;
														Static33.method123();
														Static237.method4219(Static154.aClass123_2);
														continue;
													}
													if (local31 == 6017) {
														local1--;
														Static41.aBoolean51 = anIntArray548[local1] == 1;
														Static73.method1288();
														Static237.method4219(Static154.aClass123_2);
														Static383.aBoolean489 = false;
														continue;
													}
													if (local31 == 6018) {
														local1--;
														local540 = anIntArray548[local1];
														if (local540 < 0) {
															local540 = 0;
														}
														if (local540 > 127) {
															local540 = 127;
														}
														Static135.anInt2943 = local540;
														Static237.method4219(Static154.aClass123_2);
														Static383.aBoolean489 = false;
														continue;
													}
													if (local31 == 6019) {
														local1--;
														local540 = anIntArray548[local1];
														if (local540 < 0) {
															local540 = 0;
														}
														if (local540 > 255) {
															local540 = 255;
														}
														if (local540 != Static228.anInt4592) {
															if (Static228.anInt4592 == 0 && Static42.anInt732 != -1) {
																Static126.method2209(Static279.aClass83_95, local540, Static42.anInt732);
																Static361.aBoolean293 = false;
															} else if (local540 == 0) {
																Static234.method4210();
																Static361.aBoolean293 = false;
															} else {
																Static30.method341(local540);
															}
															Static228.anInt4592 = local540;
														}
														Static237.method4219(Static154.aClass123_2);
														Static383.aBoolean489 = false;
														continue;
													}
													if (local31 == 6020) {
														local1--;
														local540 = anIntArray548[local1];
														if (local540 < 0) {
															local540 = 0;
														}
														if (local540 > 127) {
															local540 = 127;
														}
														Static107.anInt2388 = local540;
														Static237.method4219(Static154.aClass123_2);
														Static383.aBoolean489 = false;
														continue;
													}
													if (local31 == 6021) {
														local1--;
														Static358.aBoolean467 = anIntArray548[local1] == 1;
														Static369.method5878();
														continue;
													}
													if (local31 == 6023) {
														local1--;
														local540 = anIntArray548[local1];
														local1269 = false;
														if (local540 < 0) {
															local540 = 0;
														}
														if (local540 > 2) {
															local540 = 2;
														}
														if (Static199.anInt4131 < 96) {
															local540 = 0;
															local1269 = true;
														}
														Static133.method2326(local540);
														Static237.method4219(Static154.aClass123_2);
														Static383.aBoolean489 = false;
														anIntArray548[local1++] = local1269 ? 0 : 1;
														continue;
													}
													if (local31 == 6024) {
														local1--;
														local540 = anIntArray548[local1];
														if (local540 < 0 || local540 > 2) {
															local540 = 0;
														}
														Static11.anInt210 = local540;
														Static237.method4219(Static154.aClass123_2);
														continue;
													}
													if (local31 == 6025) {
														local1--;
														local540 = anIntArray548[local1];
														if (local540 < 0 || local540 > Static185.method3421(Static199.anInt4131)) {
															local540 = 0;
														}
														Static42.anInt733 = local540;
														Static237.method4219(Static154.aClass123_2);
														Static383.aBoolean489 = false;
														continue;
													}
													if (local31 == 6027) {
														local1--;
														local540 = anIntArray548[local1];
														if (local540 < 0 || local540 > 1) {
															local540 = 0;
														}
														Static146.method2643(local540 == 1);
														continue;
													}
													if (local31 == 6028) {
														local1--;
														Static224.aBoolean324 = anIntArray548[local1] != 0;
														Static237.method4219(Static154.aClass123_2);
														continue;
													}
													if (local31 == 6029) {
														local1--;
														Static73.anInt1628 = anIntArray548[local1];
														Static237.method4219(Static154.aClass123_2);
														continue;
													}
													if (local31 == 6030) {
														local1--;
														Static73.aBoolean126 = anIntArray548[local1] != 0;
														Static237.method4219(Static154.aClass123_2);
														Static44.method598();
														continue;
													}
													if (local31 == 6031) {
														local1--;
														local540 = anIntArray548[local1];
														if (local540 < 0 || local540 > 3) {
															local540 = 2;
														}
														Static364.method5791(local540);
														continue;
													}
													if (local31 == 6032) {
														local1--;
														local540 = anIntArray548[local1];
														if (local540 < 0 || local540 > 3) {
															local540 = 2;
														}
														Static232.anInt4637 = local540;
														Static237.method4219(Static154.aClass123_2);
														Static383.aBoolean489 = false;
														continue;
													}
													if (local31 == 6033) {
														local1--;
														local540 = anIntArray548[local1];
														if (local540 < 0 || local540 > 4) {
															local540 = 2;
														}
														Static71.anInt1579 = local540;
														Static237.method4219(Static154.aClass123_2);
														continue;
													}
												} else if (local31 < 6200) {
													if (local31 == 6101) {
														anIntArray548[local1++] = Static190.anInt3986;
														continue;
													}
													if (local31 == 6102) {
														anIntArray548[local1++] = Static40.method575() ? 1 : 0;
														continue;
													}
													if (local31 == 6103) {
														anIntArray548[local1++] = Static314.aBoolean421 ? 1 : 0;
														continue;
													}
													if (local31 == 6105) {
														anIntArray548[local1++] = Static72.aBoolean125 ? 1 : 0;
														continue;
													}
													if (local31 == 6106) {
														anIntArray548[local1++] = Static308.aBoolean416 ? 1 : 0;
														continue;
													}
													if (local31 == 6107) {
														anIntArray548[local1++] = Static73.anInt1628;
														continue;
													}
													if (local31 == 6108) {
														anIntArray548[local1++] = Static74.aBoolean127 ? 1 : 0;
														continue;
													}
													if (local31 == 6109) {
														anIntArray548[local1++] = Static135.aBoolean205 ? 1 : 0;
														continue;
													}
													if (local31 == 6110) {
														anIntArray548[local1++] = Static183.aBoolean279 ? 1 : 0;
														continue;
													}
													if (local31 == 6111) {
														anIntArray548[local1++] = Static266.anInt5047;
														continue;
													}
													if (local31 == 6112) {
														anIntArray548[local1++] = Static382.aBoolean487 ? 1 : 0;
														continue;
													}
													if (local31 == 6114) {
														anIntArray548[local1++] = Static104.aBoolean168 ? 1 : 0;
														continue;
													}
													if (local31 == 6115) {
														anIntArray548[local1++] = Static135.aBoolean204 ? 1 : 0;
														continue;
													}
													if (local31 == 6116) {
														anIntArray548[local1++] = Static87.anInt1875;
														continue;
													}
													if (local31 == 6117) {
														anIntArray548[local1++] = Static41.aBoolean51 ? 1 : 0;
														continue;
													}
													if (local31 == 6118) {
														anIntArray548[local1++] = Static135.anInt2943;
														continue;
													}
													if (local31 == 6119) {
														anIntArray548[local1++] = Static228.anInt4592;
														continue;
													}
													if (local31 == 6120) {
														anIntArray548[local1++] = Static107.anInt2388;
														continue;
													}
													if (local31 == 6121) {
														anIntArray548[local1++] = Static383.aClass48_9.method2535() ? 1 : 0;
														continue;
													}
													if (local31 == 6123) {
														anIntArray548[local1++] = Static333.method5395();
														continue;
													}
													if (local31 == 6124) {
														anIntArray548[local1++] = Static11.anInt210;
														continue;
													}
													if (local31 == 6125) {
														anIntArray548[local1++] = Static42.anInt733;
														continue;
													}
													if (local31 == 6126) {
														anIntArray548[local1++] = Static383.aClass48_9.method2459() ? 1 : 0;
														continue;
													}
													if (local31 == 6127) {
														anIntArray548[local1++] = Static220.aBoolean317 ? 1 : 0;
														continue;
													}
													if (local31 == 6128) {
														anIntArray548[local1++] = Static224.aBoolean324 ? 1 : 0;
														continue;
													}
													if (local31 == 6129) {
														anIntArray548[local1++] = Static73.anInt1628;
														continue;
													}
													if (local31 == 6130) {
														anIntArray548[local1++] = Static73.aBoolean126 ? 1 : 0;
														continue;
													}
													if (local31 == 6131) {
														anIntArray548[local1++] = Static36.anInt2910;
														continue;
													}
													if (local31 == 6132) {
														anIntArray548[local1++] = Static232.anInt4637;
														continue;
													}
													if (local31 == 6133) {
														anIntArray548[local1++] = Static175.anInt3717 == 1 || Static175.anInt3717 == 4 ? 1 : 0;
														continue;
													}
													if (local31 == 6134) {
														anIntArray548[local1++] = Static185.method3421(Static199.anInt4131);
														continue;
													}
													if (local31 == 6135) {
														anIntArray548[local1++] = Static71.anInt1579;
														continue;
													}
												} else if (local31 < 6300) {
													if (local31 == 6200) {
														local1 -= 2;
														Static350.aShort92 = (short) anIntArray548[local1];
														if (Static350.aShort92 <= 0) {
															Static350.aShort92 = 256;
														}
														Static75.aShort31 = (short) anIntArray548[local1 + 1];
														if (Static75.aShort31 <= 0) {
															Static75.aShort31 = 205;
														}
														continue;
													}
													if (local31 == 6201) {
														local1 -= 2;
														Static233.aShort61 = (short) anIntArray548[local1];
														if (Static233.aShort61 <= 0) {
															Static233.aShort61 = 256;
														}
														Static140.aShort34 = (short) anIntArray548[local1 + 1];
														if (Static140.aShort34 <= 0) {
															Static140.aShort34 = 320;
														}
														continue;
													}
													if (local31 == 6202) {
														local1 -= 4;
														Static97.aShort32 = (short) anIntArray548[local1];
														if (Static97.aShort32 <= 0) {
															Static97.aShort32 = 1;
														}
														Static39.aShort12 = (short) anIntArray548[local1 + 1];
														if (Static39.aShort12 <= 0) {
															Static39.aShort12 = 32767;
														} else if (Static39.aShort12 < Static97.aShort32) {
															Static39.aShort12 = Static97.aShort32;
														}
														Static50.aShort25 = (short) anIntArray548[local1 + 2];
														if (Static50.aShort25 <= 0) {
															Static50.aShort25 = 1;
														}
														Static28.aShort5 = (short) anIntArray548[local1 + 3];
														if (Static28.aShort5 <= 0) {
															Static28.aShort5 = 32767;
														} else if (Static28.aShort5 < Static50.aShort25) {
															Static28.aShort5 = Static50.aShort25;
														}
														continue;
													}
													if (local31 == 6203) {
														Static285.method4706(false, 0, Static118.aClass3_14.anInt64, Static118.aClass3_14.anInt116, 0);
														anIntArray548[local1++] = Static93.anInt1980;
														anIntArray548[local1++] = Static340.anInt6282;
														continue;
													}
													if (local31 == 6204) {
														anIntArray548[local1++] = Static233.aShort61;
														anIntArray548[local1++] = Static140.aShort34;
														continue;
													}
													if (local31 == 6205) {
														anIntArray548[local1++] = Static350.aShort92;
														anIntArray548[local1++] = Static75.aShort31;
														continue;
													}
												} else if (local31 < 6400) {
													if (local31 == 6300) {
														anIntArray548[local1++] = (int) (Static101.method1805() / 60000L);
														continue;
													}
													if (local31 == 6301) {
														anIntArray548[local1++] = (int) (Static101.method1805() / 86400000L) - 11745;
														continue;
													}
													if (local31 == 6302) {
														local1 -= 3;
														local540 = anIntArray548[local1];
														local545 = anIntArray548[local1 + 1];
														local744 = anIntArray548[local1 + 2];
														aCalendar2.clear();
														aCalendar2.set(11, 12);
														aCalendar2.set(local744, local545, local540);
														anIntArray548[local1++] = (int) (aCalendar2.getTime().getTime() / 86400000L) - 11745;
														continue;
													}
													if (local31 == 6303) {
														aCalendar2.clear();
														aCalendar2.setTime(new Date(Static101.method1805()));
														anIntArray548[local1++] = aCalendar2.get(1);
														continue;
													}
													if (local31 == 6304) {
														local1--;
														local540 = anIntArray548[local1];
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
														anIntArray548[local1++] = local1269 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6500) {
													if (local31 == 6405) {
														anIntArray548[local1++] = Static229.method4164() ? 1 : 0;
														continue;
													}
													if (local31 == 6406) {
														anIntArray548[local1++] = Static259.method4446() ? 1 : 0;
														continue;
													}
												} else if (local31 < 6600) {
													if (local31 == 6500) {
														if (Static121.anInt6774 == 10 && Static220.anInt4431 == 0 && Static147.anInt3137 == 0 && Static35.anInt619 == 0) {
															anIntArray548[local1++] = Static125.method2192() == -1 ? 0 : 1;
															continue;
														}
														anIntArray548[local1++] = 1;
														continue;
													}
													@Pc(13410) Class198 local13410;
													@Pc(13386) Class35_Sub1 local13386;
													if (local31 == 6501) {
														local13386 = Static371.method5909();
														if (local13386 == null) {
															anIntArray548[local1++] = -1;
															anIntArray548[local1++] = 0;
															aStringArray39[local3++] = "";
															anIntArray548[local1++] = 0;
															aStringArray39[local3++] = "";
															anIntArray548[local1++] = 0;
															anIntArray548[local1++] = 0;
														} else {
															anIntArray548[local1++] = local13386.anInt5032;
															anIntArray548[local1++] = local13386.anInt5023;
															aStringArray39[local3++] = local13386.aString47;
															local13410 = local13386.method4510();
															anIntArray548[local1++] = local13410.anInt5529;
															aStringArray39[local3++] = local13410.aString53;
															anIntArray548[local1++] = local13386.anInt5022;
															anIntArray548[local1++] = local13386.anInt5027;
														}
														continue;
													}
													if (local31 == 6502) {
														local13386 = Static97.method1697();
														if (local13386 == null) {
															anIntArray548[local1++] = -1;
															anIntArray548[local1++] = 0;
															aStringArray39[local3++] = "";
															anIntArray548[local1++] = 0;
															aStringArray39[local3++] = "";
															anIntArray548[local1++] = 0;
															anIntArray548[local1++] = 0;
														} else {
															anIntArray548[local1++] = local13386.anInt5032;
															anIntArray548[local1++] = local13386.anInt5023;
															aStringArray39[local3++] = local13386.aString47;
															local13410 = local13386.method4510();
															anIntArray548[local1++] = local13410.anInt5529;
															aStringArray39[local3++] = local13410.aString53;
															anIntArray548[local1++] = local13386.anInt5022;
															anIntArray548[local1++] = local13386.anInt5027;
														}
														continue;
													}
													if (local31 == 6503) {
														local1--;
														local540 = anIntArray548[local1];
														if (Static121.anInt6774 == 10 && Static220.anInt4431 == 0 && Static147.anInt3137 == 0 && Static35.anInt619 == 0) {
															anIntArray548[local1++] = Static140.method2410(local540) ? 1 : 0;
															continue;
														}
														anIntArray548[local1++] = 0;
														continue;
													}
													if (local31 == 6504) {
														local1--;
														Static34.anInt592 = anIntArray548[local1];
														Static237.method4219(Static154.aClass123_2);
														continue;
													}
													if (local31 == 6505) {
														anIntArray548[local1++] = Static34.anInt592;
														continue;
													}
													if (local31 == 6506) {
														local1--;
														local540 = anIntArray548[local1];
														@Pc(13630) Class35_Sub1 local13630 = Static131.method2289(local540);
														if (local13630 == null) {
															anIntArray548[local1++] = -1;
															aStringArray39[local3++] = "";
															anIntArray548[local1++] = 0;
															aStringArray39[local3++] = "";
															anIntArray548[local1++] = 0;
															anIntArray548[local1++] = 0;
														} else {
															anIntArray548[local1++] = local13630.anInt5023;
															aStringArray39[local3++] = local13630.aString47;
															@Pc(13648) Class198 local13648 = local13630.method4510();
															anIntArray548[local1++] = local13648.anInt5529;
															aStringArray39[local3++] = local13648.aString53;
															anIntArray548[local1++] = local13630.anInt5022;
															anIntArray548[local1++] = local13630.anInt5027;
														}
														continue;
													}
													if (local31 == 6507) {
														local1 -= 4;
														local540 = anIntArray548[local1];
														local1269 = anIntArray548[local1 + 1] == 1;
														local744 = anIntArray548[local1 + 2];
														local9978 = anIntArray548[local1 + 3] == 1;
														Static137.method1145(local1269, local540, local9978, local744);
														continue;
													}
													if (local31 == 6508) {
														Static245.method4310();
														continue;
													}
													if (local31 == 6509) {
														if (Static121.anInt6774 == 10) {
															local1--;
															Static76.aBoolean131 = anIntArray548[local1] == 1;
														}
														continue;
													}
												} else if (local31 < 6700) {
													if (local31 == 6600) {
														local1--;
														Static260.aBoolean369 = anIntArray548[local1] == 1;
														Static237.method4219(Static154.aClass123_2);
														continue;
													}
													if (local31 == 6601) {
														anIntArray548[local1++] = Static260.aBoolean369 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6800 && Static115.aClass225_2 == Static391.aClass225_4) {
													if (local31 == 6700) {
														local540 = Static273.aClass243_20.method5964();
														if (Static388.anInt7080 != -1) {
															local540++;
														}
														anIntArray548[local1++] = local540;
														continue;
													}
													if (local31 == 6701) {
														local1--;
														local540 = anIntArray548[local1];
														if (Static388.anInt7080 != -1) {
															if (local540 == 0) {
																anIntArray548[local1++] = Static388.anInt7080;
																continue;
															}
															local540--;
														}
														local3554 = (Class2_Sub26) Static273.aClass243_20.method5975();
														while (local540-- > 0) {
															local3554 = (Class2_Sub26) Static273.aClass243_20.method5973();
														}
														anIntArray548[local1++] = local3554.anInt4145;
														continue;
													}
													if (local31 == 6702) {
														local1--;
														local540 = anIntArray548[local1];
														if (Static272.aClass3ArrayArray1[local540] == null) {
															aStringArray39[local3++] = "";
														} else {
															local1702 = Static272.aClass3ArrayArray1[local540][0].aString2;
															if (local1702 == null) {
																aStringArray39[local3++] = "";
															} else {
																aStringArray39[local3++] = local1702.substring(0, local1702.indexOf(58));
															}
														}
														continue;
													}
													if (local31 == 6703) {
														local1--;
														local540 = anIntArray548[local1];
														if (Static272.aClass3ArrayArray1[local540] == null) {
															anIntArray548[local1++] = 0;
														} else {
															anIntArray548[local1++] = Static272.aClass3ArrayArray1[local540].length;
														}
														continue;
													}
													if (local31 == 6704) {
														local1 -= 2;
														local540 = anIntArray548[local1];
														local545 = anIntArray548[local1 + 1];
														if (Static272.aClass3ArrayArray1[local540] == null) {
															aStringArray39[local3++] = "";
														} else {
															local11105 = Static272.aClass3ArrayArray1[local540][local545].aString2;
															if (local11105 == null) {
																aStringArray39[local3++] = "";
															} else {
																aStringArray39[local3++] = local11105;
															}
														}
														continue;
													}
													if (local31 == 6705) {
														local1 -= 2;
														local540 = anIntArray548[local1];
														local545 = anIntArray548[local1 + 1];
														if (Static272.aClass3ArrayArray1[local540] == null) {
															anIntArray548[local1++] = 0;
														} else {
															anIntArray548[local1++] = Static272.aClass3ArrayArray1[local540][local545].anInt65;
														}
														continue;
													}
													if (local31 == 6706) {
														continue;
													}
													if (local31 == 6707) {
														local1 -= 3;
														local540 = anIntArray548[local1];
														local545 = anIntArray548[local1 + 1];
														local744 = anIntArray548[local1 + 2];
														Static389.method6109(1, local540 << 16 | local545, "", local744);
														continue;
													}
													if (local31 == 6708) {
														local1 -= 3;
														local540 = anIntArray548[local1];
														local545 = anIntArray548[local1 + 1];
														local744 = anIntArray548[local1 + 2];
														Static389.method6109(2, local540 << 16 | local545, "", local744);
														continue;
													}
													if (local31 == 6709) {
														local1 -= 3;
														local540 = anIntArray548[local1];
														local545 = anIntArray548[local1 + 1];
														local744 = anIntArray548[local1 + 2];
														Static389.method6109(3, local540 << 16 | local545, "", local744);
														continue;
													}
													if (local31 == 6710) {
														local1 -= 3;
														local540 = anIntArray548[local1];
														local545 = anIntArray548[local1 + 1];
														local744 = anIntArray548[local1 + 2];
														Static389.method6109(4, local540 << 16 | local545, "", local744);
														continue;
													}
													if (local31 == 6711) {
														local1 -= 3;
														local540 = anIntArray548[local1];
														local545 = anIntArray548[local1 + 1];
														local744 = anIntArray548[local1 + 2];
														Static389.method6109(5, local540 << 16 | local545, "", local744);
														continue;
													}
													if (local31 == 6712) {
														local1 -= 3;
														local540 = anIntArray548[local1];
														local545 = anIntArray548[local1 + 1];
														local744 = anIntArray548[local1 + 2];
														Static389.method6109(6, local540 << 16 | local545, "", local744);
														continue;
													}
													if (local31 == 6713) {
														local1 -= 3;
														local540 = anIntArray548[local1];
														local545 = anIntArray548[local1 + 1];
														local744 = anIntArray548[local1 + 2];
														Static389.method6109(7, local540 << 16 | local545, "", local744);
														continue;
													}
													if (local31 == 6714) {
														local1 -= 3;
														local540 = anIntArray548[local1];
														local545 = anIntArray548[local1 + 1];
														local744 = anIntArray548[local1 + 2];
														Static389.method6109(8, local540 << 16 | local545, "", local744);
														continue;
													}
													if (local31 == 6715) {
														local1 -= 3;
														local540 = anIntArray548[local1];
														local545 = anIntArray548[local1 + 1];
														local744 = anIntArray548[local1 + 2];
														Static389.method6109(9, local540 << 16 | local545, "", local744);
														continue;
													}
													if (local31 == 6716) {
														local1 -= 3;
														local540 = anIntArray548[local1];
														local545 = anIntArray548[local1 + 1];
														local744 = anIntArray548[local1 + 2];
														Static389.method6109(10, local540 << 16 | local545, "", local744);
														continue;
													}
													if (local31 == 6717) {
														local1 -= 3;
														local540 = anIntArray548[local1];
														local545 = anIntArray548[local1 + 1];
														local744 = anIntArray548[local1 + 2];
														local754 = Static134.method2355(local744, local540 << 16 | local545);
														Static49.method729();
														@Pc(14365) Class2_Sub27 local14365 = Static51.method778(local754);
														Static102.method1835(local754.anInt72, local754.anInt38, local14365.method3759(), local744, local540 << 16 | local545, local14365.anInt4225);
														continue;
													}
												} else if (local31 < 6900) {
													@Pc(14399) Class212 local14399;
													if (local31 == 6800) {
														local1--;
														local540 = anIntArray548[local1];
														local14399 = Static78.aClass195_2.method4816(local540);
														if (local14399.aString58 == null) {
															aStringArray39[local3++] = "";
														} else {
															aStringArray39[local3++] = local14399.aString58;
														}
														continue;
													}
													if (local31 == 6801) {
														local1--;
														local540 = anIntArray548[local1];
														local14399 = Static78.aClass195_2.method4816(local540);
														anIntArray548[local1++] = local14399.anInt5994;
														continue;
													}
													if (local31 == 6802) {
														local1--;
														local540 = anIntArray548[local1];
														local14399 = Static78.aClass195_2.method4816(local540);
														anIntArray548[local1++] = local14399.anInt5993;
														continue;
													}
													if (local31 == 6803) {
														local1--;
														local540 = anIntArray548[local1];
														local14399 = Static78.aClass195_2.method4816(local540);
														anIntArray548[local1++] = local14399.anInt5985;
														continue;
													}
													if (local31 == 6804) {
														local1 -= 2;
														local540 = anIntArray548[local1];
														local545 = anIntArray548[local1 + 1];
														local7383 = Static57.aClass79_1.method1851(local545);
														if (local7383.method279()) {
															aStringArray39[local3++] = Static78.aClass195_2.method4816(local540).method5241(local7383.aString6, local545);
														} else {
															anIntArray548[local1++] = Static78.aClass195_2.method4816(local540).method5247(local545, local7383.anInt369);
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
			if (arg0.aString24 == null) {
				local14550 = new StringBuffer(30);
				local14550.append("CS2: ").append(arg0.aLong213).append(" ");
				for (local540 = anInt6479 - 1; local540 >= 0; local540--) {
					local14550.append("v: ").append(aClass175Array1[local540].aClass2_Sub7_Sub8_1.aLong213).append(" ");
				}
				local14550.append("op: ").append(local13);
				Static346.method5531(local14532, local14550.toString());
			} else {
				Static79.method1369("Clientscript error in: " + arg0.aString24);
				local14550 = new StringBuffer(30);
				local14550.append("Clientscript error in: ").append(arg0.aString24).append("\n");
				for (local540 = anInt6479 - 1; local540 >= 0; local540--) {
					local14550.append("via: ").append(aClass175Array1[local540].aClass2_Sub7_Sub8_1.aString24).append("\n");
				}
				local14550.append("Op: ").append(local13).append("\n");
				local1702 = local14532.getMessage();
				if (local1702 != null && local1702.length() > 0) {
					local14550.append("Message: ").append(local1702).append("\n");
				}
				Static346.method5531(local14532, local14550.toString());
				Static375.method5958(local14550.toString());
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
	public static void method5591(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static300.method4909(arg0)) {
			return;
		}
		@Pc(12) Class3[] local12 = Static272.aClass3ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class3 local19 = local12[local14];
			if (local19.anObjectArray30 != null) {
				@Pc(26) Class2_Sub5 local26 = new Class2_Sub5();
				local26.aClass3_4 = local19;
				local26.anObjectArray33 = local19.anObjectArray30;
				method5588(local26, 2000000);
			}
		}
	}
}
