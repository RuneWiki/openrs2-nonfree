import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "[I")
	private static int[] anIntArray331;

	@OriginalMember(owner = "client!ko", name = "f", descriptor = "Lclient!paa;")
	private static Class261 aClass261_4;

	@OriginalMember(owner = "client!ko", name = "p", descriptor = "Lclient!wt;")
	private static Class379 aClass379_1;

	@OriginalMember(owner = "client!ko", name = "u", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray26;

	@OriginalMember(owner = "client!ko", name = "w", descriptor = "Lclient!paa;")
	private static Class261 aClass261_5;

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "I")
	private static int anInt4899 = 0;

	@OriginalMember(owner = "client!ko", name = "e", descriptor = "[I")
	private static final int[] anIntArray332 = new int[5];

	@OriginalMember(owner = "client!ko", name = "g", descriptor = "[[I")
	private static final int[][] anIntArrayArray25 = new int[5][5000];

	@OriginalMember(owner = "client!ko", name = "l", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray25 = new String[1000];

	@OriginalMember(owner = "client!ko", name = "o", descriptor = "I")
	private static int anInt4906 = 0;

	@OriginalMember(owner = "client!ko", name = "r", descriptor = "I")
	private static int anInt4908 = 0;

	@OriginalMember(owner = "client!ko", name = "t", descriptor = "[Lclient!hv;")
	private static final Class145[] aClass145Array1 = new Class145[50];

	@OriginalMember(owner = "client!ko", name = "v", descriptor = "[I")
	private static final int[] anIntArray333 = new int[1000];

	@OriginalMember(owner = "client!ko", name = "z", descriptor = "Lclient!bh;")
	public static final Class32 aClass32_48 = new Class32(4);

	@OriginalMember(owner = "client!ko", name = "A", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray27 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ko", name = "B", descriptor = "[I")
	private static final int[] anIntArray334 = new int[3];

	@OriginalMember(owner = "client!ko", name = "C", descriptor = "I")
	private static int anInt4912 = 0;

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V")
	public static void method4134(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static221.method3025(arg0)) {
			return;
		}
		@Pc(12) Class261[] local12 = Static559.aClass261ArrayArray2[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class261 local19 = local12[local14];
			if (local19.anObjectArray15 != null) {
				@Pc(26) Class2_Sub46 local26 = new Class2_Sub46();
				local26.aClass261_10 = local19;
				local26.anObjectArray32 = local19.anObjectArray15;
				method4135(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!uca;I)V")
	private static void method4135(@OriginalArg(0) Class2_Sub46 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray32;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class2_Sub2_Sub16 local12 = Static313.method4242(local8);
		if (local12 == null) {
			return;
		}
		anIntArray331 = new int[local12.anInt5868];
		@Pc(21) int local21 = 0;
		aStringArray26 = new String[local12.anInt5866];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt9259;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt9265;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass261_10 == null ? -1 : arg0.aClass261_10.anInt6614;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt9260;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass261_10 == null ? -1 : arg0.aClass261_10.anInt6629;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass261_11 == null ? -1 : arg0.aClass261_11.anInt6614;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass261_11 == null ? -1 : arg0.aClass261_11.anInt6629;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt9263;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt9266;
				}
				anIntArray331[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString104;
				}
				aStringArray26[local27++] = local135;
			}
		}
		anInt4912 = arg0.anInt9262;
		method4137(local12, arg1);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!ow;II)V")
	public static void method4136(@OriginalArg(0) Class260 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class2_Sub2_Sub16 local5 = Static147.method2210(arg1, arg0, arg2);
		if (local5 == null) {
			return;
		}
		anIntArray331 = new int[local5.anInt5868];
		aStringArray26 = new String[local5.anInt5866];
		if (local5.aClass260_7 == Static470.aClass260_8 || local5.aClass260_7 == Static292.aClass260_4 || local5.aClass260_7 == Static491.aClass260_9) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static93.aClass261_2 != null) {
				local30 = Static93.aClass261_2.anInt6642;
				local32 = Static93.aClass261_2.anInt6623;
			}
			anIntArray331[0] = Static507.aClass335_1.method7811() - local30;
			anIntArray331[1] = Static507.aClass335_1.method7821() - local32;
		}
		method4137(local5, 200000);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!nfa;I)V")
	private static void method4137(@OriginalArg(0) Class2_Sub2_Sub16 arg0, @OriginalArg(1) int arg1) {
		anInt4908 = 0;
		anInt4906 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray429;
		@Pc(11) int[] local11 = arg0.anIntArray430;
		@Pc(13) byte local13 = -1;
		anInt4899 = 0;
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
						method4140(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method4142(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray333[anInt4908++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray333[anInt4908++] = Static431.aClass205_1.anIntArray348[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static431.aClass205_1.method4256(local54, anIntArray333[--anInt4908]);
					} else if (local31 == 3) {
						aStringArray25[anInt4906++] = arg0.aStringArray31[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt4908 -= 2;
						if (anIntArray333[anInt4908] != anIntArray333[anInt4908 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt4908 -= 2;
						if (anIntArray333[anInt4908] == anIntArray333[anInt4908 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt4908 -= 2;
						if (anIntArray333[anInt4908] < anIntArray333[anInt4908 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt4908 -= 2;
						if (anIntArray333[anInt4908] > anIntArray333[anInt4908 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt4899 == 0) {
							return;
						}
						@Pc(216) Class145 local216 = aClass145Array1[--anInt4899];
						arg0 = local216.aClass2_Sub2_Sub16_1;
						local8 = arg0.anIntArray429;
						local11 = arg0.anIntArray430;
						local5 = local216.anInt3622;
						anIntArray331 = local216.anIntArray249;
						aStringArray26 = local216.aStringArray17;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray333[anInt4908++] = Static431.aClass205_1.method4251(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static431.aClass205_1.method4258(anIntArray333[--anInt4908], local54);
					} else if (local31 == 31) {
						anInt4908 -= 2;
						if (anIntArray333[anInt4908] <= anIntArray333[anInt4908 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt4908 -= 2;
						if (anIntArray333[anInt4908] >= anIntArray333[anInt4908 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray333[anInt4908++] = anIntArray331[local11[local5]];
					} else if (local31 == 34) {
						anIntArray331[local11[local5]] = anIntArray333[--anInt4908];
					} else if (local31 == 35) {
						aStringArray25[anInt4906++] = aStringArray26[local11[local5]];
					} else if (local31 == 36) {
						aStringArray26[local11[local5]] = aStringArray25[--anInt4906];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt4906 -= local54;
						@Pc(400) String local400 = Static148.method2222(aStringArray25, local54, anInt4906);
						aStringArray25[anInt4906++] = local400;
					} else if (local31 == 38) {
						anInt4908--;
					} else if (local31 == 39) {
						anInt4906--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class2_Sub2_Sub16 local436 = Static313.method4242(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt5868];
							@Pc(450) String[] local450 = new String[local436.anInt5866];
							for (local452 = 0; local452 < local436.anInt5864; local452++) {
								local446[local452] = anIntArray333[anInt4908 + local452 - local436.anInt5864];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt5870; local471++) {
								local450[local471] = aStringArray25[anInt4906 + local471 - local436.anInt5870];
							}
							anInt4908 -= local436.anInt5864;
							anInt4906 -= local436.anInt5870;
							@Pc(502) Class145 local502 = new Class145();
							local502.aClass2_Sub2_Sub16_1 = arg0;
							local502.anInt3622 = local5;
							local502.anIntArray249 = anIntArray331;
							local502.aStringArray17 = aStringArray26;
							if (anInt4899 >= aClass145Array1.length) {
								throw new RuntimeException();
							}
							aClass145Array1[anInt4899++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray429;
							local11 = local436.anIntArray430;
							local5 = -1;
							anIntArray331 = local446;
							aStringArray26 = local450;
						} else if (local31 == 42) {
							anIntArray333[anInt4908++] = Static171.anIntArray203[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static171.anIntArray203[local54] = anIntArray333[--anInt4908];
							Static280.method3895(local54);
							Static365.aBoolean427 |= Static410.aBooleanArray116[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray333[--anInt4908];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray332[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray25[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray333[--anInt4908];
							if (local603 < 0 || local603 >= anIntArray332[local54]) {
								throw new RuntimeException();
							}
							anIntArray333[anInt4908++] = anIntArrayArray25[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt4908 -= 2;
							local603 = anIntArray333[anInt4908];
							if (local603 < 0 || local603 >= anIntArray332[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray25[local54][local603] = anIntArray333[anInt4908 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static3.aStringArray48[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray25[anInt4906++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static3.aStringArray48[local54] = aStringArray25[--anInt4906];
							Static199.method2847(local54);
						} else if (local31 == 51) {
							@Pc(774) Class118 local774 = arg0.aClass118Array1[local11[local5]];
							@Pc(787) Class2_Sub30 local787 = (Class2_Sub30) local774.method2595((long) anIntArray333[--anInt4908]);
							if (local787 != null) {
								local5 += local787.anInt5508;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(856) StringBuffer local856;
			if (arg0.aString76 == null) {
				local856 = new StringBuffer(30);
				local856.append("CS2: ").append(arg0.aLong280).append(" ");
				for (local603 = anInt4899 - 1; local603 >= 0; local603--) {
					local856.append("v: ").append(aClass145Array1[local603].aClass2_Sub2_Sub16_1.aLong280).append(" ");
				}
				local856.append("op: ").append(local13);
				Static163.method2447(local837, local856.toString());
			} else {
				Static3.method8592("Clientscript error in: " + arg0.aString76);
				local856 = new StringBuffer(30);
				local856.append("Clientscript error in: ").append(arg0.aString76).append("\n");
				for (local603 = anInt4899 - 1; local603 >= 0; local603--) {
					local856.append("via: ").append(aClass145Array1[local603].aClass2_Sub2_Sub16_1.aString76).append("\n");
				}
				local856.append("Op: ").append(local13).append("\n");
				@Pc(896) String local896 = local837.getMessage();
				if (local896 != null && local896.length() > 0) {
					local856.append("Message: ").append(local896).append("\n");
				}
				Static163.method2447(local837, local856.toString());
				Static338.method4547(local856.toString());
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!uca;)V")
	public static void method4138(@OriginalArg(0) Class2_Sub46 arg0) {
		method4135(arg0, 200000);
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)Ljava/lang/String;")
	private static String method4139(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar1.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar1.get(5);
		@Pc(20) int local20 = aCalendar1.get(2);
		@Pc(24) int local24 = aCalendar1.get(1);
		return local16 + "-" + aStringArray27[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IZ)V")
	private static void method4140(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class261 local137;
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(158) Class261 local158;
		@Pc(35) Class261 local35;
		@Pc(210) Class261 local210;
		@Pc(13) int local13;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt4908 -= 3;
				local13 = anIntArray333[anInt4908];
				local19 = anIntArray333[anInt4908 + 1];
				local25 = anIntArray333[anInt4908 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static357.method4826(local13);
				if (local35.aClass261Array2 == null) {
					local35.aClass261Array2 = new Class261[local25 + 1];
				}
				if (local35.aClass261Array2.length <= local25) {
					@Pc(54) Class261[] local54 = new Class261[local25 + 1];
					for (local56 = 0; local56 < local35.aClass261Array2.length; local56++) {
						local54[local56] = local35.aClass261Array2[local56];
					}
					local35.aClass261Array2 = local54;
				}
				if (local25 > 0 && local35.aClass261Array2[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class261 local99 = new Class261();
				local99.anInt6635 = local19;
				local99.anInt6631 = local99.anInt6614 = local35.anInt6614;
				local99.anInt6629 = local25;
				local35.aClass261Array2[local25] = local99;
				if (arg1) {
					aClass261_4 = local99;
				} else {
					aClass261_5 = local99;
				}
				Static624.method8351(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass261_4 : aClass261_5;
				if (local137.anInt6629 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static357.method4826(local137.anInt6614);
				local158.aClass261Array2[local137.anInt6629] = null;
				Static624.method8351(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static357.method4826(anIntArray333[--anInt4908]);
				local137.aClass261Array2 = null;
				Static624.method8351(local137);
				return;
			}
			if (arg0 == 200) {
				anInt4908 -= 2;
				local13 = anIntArray333[anInt4908];
				local19 = anIntArray333[anInt4908 + 1];
				local210 = Static98.method1508(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray333[anInt4908++] = 1;
					if (arg1) {
						aClass261_4 = local210;
						return;
					}
					aClass261_5 = local210;
					return;
				}
				anIntArray333[anInt4908++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray333[--anInt4908];
				local158 = Static357.method4826(local13);
				if (local158 != null) {
					anIntArray333[anInt4908++] = 1;
					if (arg1) {
						aClass261_4 = local158;
						return;
					}
					aClass261_5 = local158;
					return;
				}
				anIntArray333[anInt4908++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray333[--anInt4908];
				method4145(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray333[--anInt4908];
				method4148(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt4908 -= 2;
					local13 = anIntArray333[anInt4908];
					local19 = anIntArray333[anInt4908 + 1];
					for (local25 = 0; local25 < Static180.anIntArray208.length; local25++) {
						if (Static180.anIntArray208[local25] == local13) {
							Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aClass218_1.method4618(Static502.aClass23_2, local19, local25);
							return;
						}
					}
					for (local353 = 0; local353 < Static476.anIntArray549.length; local353++) {
						if (Static476.anIntArray549[local353] == local13) {
							Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aClass218_1.method4618(Static502.aClass23_2, local19, local353);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt4908 -= 2;
					local13 = anIntArray333[anInt4908];
					local19 = anIntArray333[anInt4908 + 1];
					Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aClass218_1.method4613(local13, local19);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray333[--anInt4908] != 0;
					Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aClass218_1.method4615(local412);
					return;
				}
				if (arg0 == 411) {
					anInt4908 -= 2;
					local13 = anIntArray333[anInt4908];
					local19 = anIntArray333[anInt4908 + 1];
					Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aClass218_1.method4612(local13, local19, Static72.aClass225_2);
					return;
				}
			} else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static357.method4826(anIntArray333[--anInt4908]);
				} else {
					local137 = arg1 ? aClass261_4 : aClass261_5;
				}
				if (arg0 == 1000) {
					anInt4908 -= 4;
					local137.anInt6657 = anIntArray333[anInt4908];
					local137.anInt6632 = anIntArray333[anInt4908 + 1];
					local19 = anIntArray333[anInt4908 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray333[anInt4908 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte95 = (byte) local19;
					local137.aByte96 = (byte) local25;
					Static624.method8351(local137);
					Static642.method8601(local137);
					if (local137.anInt6629 == -1) {
						Static36.method606(local137.anInt6614);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt4908 -= 4;
					local137.anInt6604 = anIntArray333[anInt4908];
					local137.anInt6668 = anIntArray333[anInt4908 + 1];
					local137.anInt6609 = 0;
					local137.anInt6577 = 0;
					local19 = anIntArray333[anInt4908 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray333[anInt4908 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte94 = (byte) local19;
					local137.lb = (byte) local25;
					Static624.method8351(local137);
					Static642.method8601(local137);
					if (local137.anInt6635 == 0) {
						Static338.method4549(false, local137);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(645) boolean local645 = anIntArray333[--anInt4908] == 1;
					if (local137.aBoolean482 != local645) {
						local137.aBoolean482 = local645;
						Static624.method8351(local137);
					}
					if (local137.anInt6629 == -1) {
						Static333.method4504(local137.anInt6614);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt4908 -= 2;
					local137.anInt6574 = anIntArray333[anInt4908];
					local137.anInt6648 = anIntArray333[anInt4908 + 1];
					Static624.method8351(local137);
					Static642.method8601(local137);
					if (local137.anInt6635 == 0) {
						Static338.method4549(false, local137);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean487 = anIntArray333[--anInt4908] == 1;
					return;
				}
			} else {
				@Pc(1507) String local1507;
				@Pc(1145) String local1145;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static357.method4826(anIntArray333[--anInt4908]);
					} else {
						local137 = arg1 ? aClass261_4 : aClass261_5;
					}
					if (arg0 == 1100) {
						anInt4908 -= 2;
						local137.anInt6598 = anIntArray333[anInt4908];
						if (local137.anInt6598 > local137.anInt6665 - local137.anInt6595) {
							local137.anInt6598 = local137.anInt6665 - local137.anInt6595;
						}
						if (local137.anInt6598 < 0) {
							local137.anInt6598 = 0;
						}
						local137.anInt6624 = anIntArray333[anInt4908 + 1];
						if (local137.anInt6624 > local137.anInt6617 - local137.anInt6622) {
							local137.anInt6624 = local137.anInt6617 - local137.anInt6622;
						}
						if (local137.anInt6624 < 0) {
							local137.anInt6624 = 0;
						}
						Static624.method8351(local137);
						if (local137.anInt6629 == -1) {
							Static279.method3862(local137.anInt6614);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt6650 = anIntArray333[--anInt4908];
						Static624.method8351(local137);
						if (local137.anInt6629 == -1) {
							Static580.method7915(local137.anInt6614);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean473 = anIntArray333[--anInt4908] == 1;
						Static624.method8351(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt6628 = anIntArray333[--anInt4908];
						Static624.method8351(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt6603 = anIntArray333[--anInt4908];
						Static624.method8351(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray333[--anInt4908];
						if (local137.anInt6599 != local19) {
							local137.anInt6599 = local19;
							Static624.method8351(local137);
						}
						if (local137.anInt6629 == -1) {
							Static593.method8045(local137.anInt6614);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt6584 = anIntArray333[--anInt4908];
						Static624.method8351(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean475 = anIntArray333[--anInt4908] == 1;
						Static624.method8351(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt6634 = 1;
						local137.anInt6576 = anIntArray333[--anInt4908];
						Static624.method8351(local137);
						if (local137.anInt6629 == -1) {
							Static267.method3754(local137.anInt6614);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt4908 -= 6;
						local137.anInt6649 = anIntArray333[anInt4908];
						local137.anInt6602 = anIntArray333[anInt4908 + 1];
						local137.anInt6644 = anIntArray333[anInt4908 + 2];
						local137.anInt6667 = anIntArray333[anInt4908 + 3];
						local137.anInt6647 = anIntArray333[anInt4908 + 4];
						local137.anInt6613 = anIntArray333[anInt4908 + 5];
						Static624.method8351(local137);
						if (local137.anInt6629 == -1) {
							Static634.method8473(local137.anInt6614);
							Static456.method6240(local137.anInt6614);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray333[--anInt4908];
						if (local137.anInt6578 != local19) {
							local137.anInt6578 = local19;
							local137.anInt6581 = 0;
							local137.anInt6636 = 1;
							local137.anInt6597 = 0;
							@Pc(1094) Class81 local1094 = local137.anInt6578 == -1 ? null : Static540.aClass173_2.method3791(local137.anInt6578);
							if (local1094 != null) {
								Static350.method4702(local137.anInt6581, local1094);
							}
							Static624.method8351(local137);
						}
						if (local137.anInt6629 == -1) {
							Static128.method1804(local137.anInt6614);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean484 = anIntArray333[--anInt4908] == 1;
						Static624.method8351(local137);
						return;
					}
					if (arg0 == 1112) {
						local1145 = aStringArray25[--anInt4906];
						if (!local1145.equals(local137.aString93)) {
							local137.aString93 = local1145;
							Static624.method8351(local137);
						}
						if (local137.anInt6629 == -1) {
							Static305.method4183(local137.anInt6614);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt6651 = anIntArray333[--anInt4908];
						Static624.method8351(local137);
						if (local137.anInt6629 == -1) {
							Static339.method4572(local137.anInt6614);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt4908 -= 3;
						local137.anInt6580 = anIntArray333[anInt4908];
						local137.anInt6664 = anIntArray333[anInt4908 + 1];
						local137.anInt6575 = anIntArray333[anInt4908 + 2];
						Static624.method8351(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean479 = anIntArray333[--anInt4908] == 1;
						Static624.method8351(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt6658 = anIntArray333[--anInt4908];
						Static624.method8351(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt6592 = anIntArray333[--anInt4908];
						Static624.method8351(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean474 = anIntArray333[--anInt4908] == 1;
						Static624.method8351(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean488 = anIntArray333[--anInt4908] == 1;
						Static624.method8351(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt4908 -= 2;
						local137.anInt6665 = anIntArray333[anInt4908];
						local137.anInt6617 = anIntArray333[anInt4908 + 1];
						Static624.method8351(local137);
						if (local137.anInt6635 == 0) {
							Static338.method4549(false, local137);
						}
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean489 = anIntArray333[--anInt4908] == 1;
						Static624.method8351(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt6613 = anIntArray333[--anInt4908];
						Static624.method8351(local137);
						if (local137.anInt6629 == -1) {
							Static634.method8473(local137.anInt6614);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray333[--anInt4908];
						local137.aBoolean483 = local19 == 1;
						Static624.method8351(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt4908 -= 2;
						local137.anInt6583 = anIntArray333[anInt4908];
						local137.anInt6630 = anIntArray333[anInt4908 + 1];
						Static624.method8351(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt6608 = anIntArray333[--anInt4908];
						Static624.method8351(local137);
						return;
					}
					@Pc(1473) Class238 local1473;
					if (arg0 == 1127) {
						anInt4908 -= 2;
						local19 = anIntArray333[anInt4908];
						local25 = anIntArray333[anInt4908 + 1];
						local1473 = Static339.aClass66_1.method1439(local19);
						if (local25 != local1473.anInt6043) {
							local137.method5628(local25, local19);
							return;
						}
						local137.method5639(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray333[--anInt4908];
						local1507 = aStringArray25[--anInt4906];
						local1473 = Static339.aClass66_1.method1439(local19);
						if (!local1473.aString83.equals(local1507)) {
							local137.method5627(local1507, local19);
							return;
						}
						local137.method5639(local19);
						return;
					}
					if (arg0 == 1129 || arg0 == 1130) {
						local19 = anIntArray333[--anInt4908];
						if ((local137.anInt6635 == 5 || arg0 != 1129) && (local137.anInt6635 == 4 || arg0 != 1130)) {
							if (local137.anInt6605 != local19) {
								local137.anInt6605 = local19;
								Static624.method8351(local137);
							}
							if (local137.anInt6629 == -1) {
								Static643.method8623(local137.anInt6614);
							}
							return;
						}
						return;
					}
				} else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static357.method4826(anIntArray333[--anInt4908]);
					} else {
						local137 = arg1 ? aClass261_4 : aClass261_5;
					}
					Static624.method8351(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt4908 -= 2;
						local19 = anIntArray333[anInt4908];
						local25 = anIntArray333[anInt4908 + 1];
						if (local137.anInt6629 == -1) {
							Static554.method7608(local137.anInt6614);
							Static634.method8473(local137.anInt6614);
							Static456.method6240(local137.anInt6614);
						}
						if (local19 == -1) {
							local137.anInt6634 = 1;
							local137.anInt6576 = -1;
							local137.anInt6585 = -1;
							return;
						}
						local137.anInt6585 = local19;
						local137.anInt6626 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean477 = true;
						} else {
							local137.aBoolean477 = false;
						}
						@Pc(1697) Class34 local1697 = Static72.aClass225_2.method4789(local19);
						local137.anInt6644 = local1697.anInt885;
						local137.anInt6667 = local1697.anInt855;
						local137.anInt6647 = local1697.anInt892;
						local137.anInt6649 = local1697.anInt878;
						local137.anInt6602 = local1697.anInt854;
						local137.anInt6613 = local1697.anInt893;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt6619 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt6619 = 1;
						} else {
							local137.anInt6619 = 2;
						}
						if (local137.anInt6609 > 0) {
							local137.anInt6613 = local137.anInt6613 * 32 / local137.anInt6609;
							return;
						} else {
							if (local137.anInt6604 > 0) {
								local137.anInt6613 = local137.anInt6613 * 32 / local137.anInt6604;
							}
							return;
						}
					}
					if (arg0 == 1201) {
						local137.anInt6634 = 2;
						local137.anInt6576 = anIntArray333[--anInt4908];
						if (local137.anInt6629 == -1) {
							Static267.method3754(local137.anInt6614);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt6634 = 3;
						local137.anInt6576 = -1;
						if (local137.anInt6629 == -1) {
							Static267.method3754(local137.anInt6614);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt6634 = 6;
						local137.anInt6576 = anIntArray333[--anInt4908];
						if (local137.anInt6629 == -1) {
							Static267.method3754(local137.anInt6614);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt6634 = 5;
						local137.anInt6576 = anIntArray333[--anInt4908];
						if (local137.anInt6629 == -1) {
							Static267.method3754(local137.anInt6614);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt4908 -= 4;
						local137.anInt6662 = anIntArray333[anInt4908];
						local137.anInt6590 = anIntArray333[anInt4908 + 1];
						local137.anInt6663 = anIntArray333[anInt4908 + 2];
						local137.anInt6616 = anIntArray333[anInt4908 + 3];
						Static624.method8351(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt4908 -= 2;
						local137.anInt6586 = anIntArray333[anInt4908];
						local137.anInt6587 = anIntArray333[anInt4908 + 1];
						Static624.method8351(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt4908 -= 4;
						local137.anInt6576 = anIntArray333[anInt4908];
						local137.anInt6593 = anIntArray333[anInt4908 + 1];
						if (anIntArray333[anInt4908 + 2] == 1) {
							local137.anInt6634 = 9;
						} else {
							local137.anInt6634 = 8;
						}
						if (anIntArray333[anInt4908 + 3] == 1) {
							local137.aBoolean477 = true;
						} else {
							local137.aBoolean477 = false;
						}
						if (local137.anInt6629 == -1) {
							Static267.method3754(local137.anInt6614);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt6634 = 5;
						local137.anInt6576 = Static528.anInt8672;
						local137.anInt6593 = 0;
						if (local137.anInt6629 == -1) {
							Static267.method3754(local137.anInt6614);
						}
						return;
					}
				} else {
					@Pc(2357) int local2357;
					if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
						if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
							if (arg0 >= 2000) {
								arg0 -= 1000;
								local137 = Static357.method4826(anIntArray333[--anInt4908]);
							} else {
								local137 = arg1 ? aClass261_4 : aClass261_5;
							}
							if (arg0 == 1499) {
								local137.method5640();
								return;
							}
							local1145 = aStringArray25[--anInt4906];
							@Pc(2443) int[] local2443 = null;
							if (local1145.length() > 0 && local1145.charAt(local1145.length() - 1) == 'Y') {
								local353 = anIntArray333[--anInt4908];
								if (local353 > 0) {
									local2443 = new int[local353];
									while (local353-- > 0) {
										local2443[local353] = anIntArray333[--anInt4908];
									}
								}
								local1145 = local1145.substring(0, local1145.length() - 1);
							}
							@Pc(2495) Object[] local2495 = new Object[local1145.length() + 1];
							for (local2357 = local2495.length - 1; local2357 >= 1; local2357--) {
								if (local1145.charAt(local2357 - 1) == 's') {
									local2495[local2357] = aStringArray25[--anInt4906];
								} else {
									local2495[local2357] = Integer.valueOf(anIntArray333[--anInt4908]);
								}
							}
							local56 = anIntArray333[--anInt4908];
							if (local56 == -1) {
								local2495 = null;
							} else {
								local2495[0] = Integer.valueOf(local56);
							}
							if (arg0 == 1400) {
								local137.anObjectArray24 = local2495;
							} else if (arg0 == 1401) {
								local137.anObjectArray10 = local2495;
							} else if (arg0 == 1402) {
								local137.anObjectArray9 = local2495;
							} else if (arg0 == 1403) {
								local137.anObjectArray14 = local2495;
							} else if (arg0 == 1404) {
								local137.anObjectArray2 = local2495;
							} else if (arg0 == 1405) {
								local137.anObjectArray19 = local2495;
							} else if (arg0 == 1406) {
								local137.anObjectArray23 = local2495;
							} else if (arg0 == 1407) {
								local137.anObjectArray1 = local2495;
								local137.anIntArray488 = local2443;
							} else if (arg0 == 1408) {
								local137.anObjectArray22 = local2495;
							} else if (arg0 == 1409) {
								local137.anObjectArray4 = local2495;
							} else if (arg0 == 1410) {
								local137.anObjectArray28 = local2495;
							} else if (arg0 == 1411) {
								local137.anObjectArray30 = local2495;
							} else if (arg0 == 1412) {
								local137.anObjectArray3 = local2495;
							} else if (arg0 == 1414) {
								local137.anObjectArray26 = local2495;
								local137.anIntArray484 = local2443;
							} else if (arg0 == 1415) {
								local137.anObjectArray12 = local2495;
								local137.anIntArray489 = local2443;
							} else if (arg0 == 1416) {
								local137.anObjectArray20 = local2495;
							} else if (arg0 == 1417) {
								local137.anObjectArray18 = local2495;
							} else if (arg0 == 1418) {
								local137.anObjectArray21 = local2495;
							} else if (arg0 == 1419) {
								local137.anObjectArray8 = local2495;
							} else if (arg0 == 1420) {
								local137.anObjectArray16 = local2495;
							} else if (arg0 == 1421) {
								local137.anObjectArray17 = local2495;
							} else if (arg0 == 1422) {
								local137.anObjectArray25 = local2495;
							} else if (arg0 == 1423) {
								local137.anObjectArray5 = local2495;
							} else if (arg0 == 1424) {
								local137.anObjectArray13 = local2495;
							} else if (arg0 == 1425) {
								local137.anObjectArray7 = local2495;
							} else if (arg0 == 1426) {
								local137.anObjectArray6 = local2495;
							} else if (arg0 == 1427) {
								local137.anObjectArray29 = local2495;
							} else if (arg0 == 1428) {
								local137.anObjectArray27 = local2495;
								local137.anIntArray485 = local2443;
							} else if (arg0 == 1429) {
								local137.anObjectArray11 = local2495;
								local137.anIntArray493 = local2443;
							} else if (arg0 == 1430) {
								local137.anObjectArray31 = local2495;
							}
							local137.aBoolean481 = true;
							return;
						}
						if (arg0 < 1600) {
							local137 = arg1 ? aClass261_4 : aClass261_5;
							if (arg0 == 1500) {
								anIntArray333[anInt4908++] = local137.anInt6642;
								return;
							}
							if (arg0 == 1501) {
								anIntArray333[anInt4908++] = local137.anInt6623;
								return;
							}
							if (arg0 == 1502) {
								anIntArray333[anInt4908++] = local137.anInt6595;
								return;
							}
							if (arg0 == 1503) {
								anIntArray333[anInt4908++] = local137.anInt6622;
								return;
							}
							if (arg0 == 1504) {
								anIntArray333[anInt4908++] = local137.aBoolean482 ? 1 : 0;
								return;
							}
							if (arg0 == 1505) {
								anIntArray333[anInt4908++] = local137.anInt6631;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static83.method1185(local137);
								anIntArray333[anInt4908++] = local158 == null ? -1 : local158.anInt6614;
								return;
							}
						} else {
							@Pc(3091) Class238 local3091;
							if (arg0 < 1700) {
								local137 = arg1 ? aClass261_4 : aClass261_5;
								if (arg0 == 1600) {
									anIntArray333[anInt4908++] = local137.anInt6598;
									return;
								}
								if (arg0 == 1601) {
									anIntArray333[anInt4908++] = local137.anInt6624;
									return;
								}
								if (arg0 == 1602) {
									aStringArray25[anInt4906++] = local137.aString93;
									return;
								}
								if (arg0 == 1603) {
									anIntArray333[anInt4908++] = local137.anInt6665;
									return;
								}
								if (arg0 == 1604) {
									anIntArray333[anInt4908++] = local137.anInt6617;
									return;
								}
								if (arg0 == 1605) {
									anIntArray333[anInt4908++] = local137.anInt6613;
									return;
								}
								if (arg0 == 1606) {
									anIntArray333[anInt4908++] = local137.anInt6644;
									return;
								}
								if (arg0 == 1607) {
									anIntArray333[anInt4908++] = local137.anInt6647;
									return;
								}
								if (arg0 == 1608) {
									anIntArray333[anInt4908++] = local137.anInt6667;
									return;
								}
								if (arg0 == 1609) {
									anIntArray333[anInt4908++] = local137.anInt6628;
									return;
								}
								if (arg0 == 1610) {
									anIntArray333[anInt4908++] = local137.anInt6649;
									return;
								}
								if (arg0 == 1611) {
									anIntArray333[anInt4908++] = local137.anInt6602;
									return;
								}
								if (arg0 == 1612) {
									anIntArray333[anInt4908++] = local137.anInt6599;
									return;
								}
								if (arg0 == 1613) {
									local19 = anIntArray333[--anInt4908];
									local3091 = Static339.aClass66_1.method1439(local19);
									if (local3091.method5153()) {
										aStringArray25[anInt4906++] = local137.method5633(local3091.aString83, local19);
										return;
									}
									anIntArray333[anInt4908++] = local137.method5630(local3091.anInt6043, local19);
									return;
								}
								if (arg0 == 1614) {
									anIntArray333[anInt4908++] = local137.anInt6584;
									return;
								}
								if (arg0 == 2614) {
									anIntArray333[anInt4908++] = local137.anInt6634 == 1 ? local137.anInt6576 : -1;
									return;
								}
							} else if (arg0 < 1800) {
								local137 = arg1 ? aClass261_4 : aClass261_5;
								if (arg0 == 1700) {
									anIntArray333[anInt4908++] = local137.anInt6585;
									return;
								}
								if (arg0 == 1701) {
									if (local137.anInt6585 != -1) {
										anIntArray333[anInt4908++] = local137.anInt6626;
										return;
									}
									anIntArray333[anInt4908++] = 0;
									return;
								}
								if (arg0 == 1702) {
									anIntArray333[anInt4908++] = local137.anInt6629;
									return;
								}
							} else if (arg0 < 1900) {
								local137 = arg1 ? aClass261_4 : aClass261_5;
								if (arg0 == 1800) {
									anIntArray333[anInt4908++] = Static76.method1071(local137).method6880();
									return;
								}
								if (arg0 == 1801) {
									local19 = anIntArray333[--anInt4908];
									local19--;
									if (local137.aStringArray35 != null && local19 < local137.aStringArray35.length && local137.aStringArray35[local19] != null) {
										aStringArray25[anInt4906++] = local137.aStringArray35[local19];
										return;
									}
									aStringArray25[anInt4906++] = "";
									return;
								}
								if (arg0 == 1802) {
									if (local137.aString90 == null) {
										aStringArray25[anInt4906++] = "";
										return;
									}
									aStringArray25[anInt4906++] = local137.aString90;
									return;
								}
							} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
								if (arg0 >= 2000) {
									local137 = Static357.method4826(anIntArray333[--anInt4908]);
									arg0 -= 1000;
								} else {
									local137 = arg1 ? aClass261_4 : aClass261_5;
								}
								if (anInt4912 >= 10) {
									throw new RuntimeException("C29xx-1");
								}
								if (arg0 == 1927) {
									if (local137.anObjectArray29 == null) {
										return;
									}
									@Pc(3360) Class2_Sub46 local3360 = new Class2_Sub46();
									local3360.aClass261_10 = local137;
									local3360.anObjectArray32 = local137.anObjectArray29;
									local3360.anInt9262 = anInt4912 + 1;
									Static122.aClass109_13.method2323(local3360);
									return;
								}
							} else if (arg0 < 2600) {
								local137 = Static357.method4826(anIntArray333[--anInt4908]);
								if (arg0 == 2500) {
									anIntArray333[anInt4908++] = local137.anInt6642;
									return;
								}
								if (arg0 == 2501) {
									anIntArray333[anInt4908++] = local137.anInt6623;
									return;
								}
								if (arg0 == 2502) {
									anIntArray333[anInt4908++] = local137.anInt6595;
									return;
								}
								if (arg0 == 2503) {
									anIntArray333[anInt4908++] = local137.anInt6622;
									return;
								}
								if (arg0 == 2504) {
									anIntArray333[anInt4908++] = local137.aBoolean482 ? 1 : 0;
									return;
								}
								if (arg0 == 2505) {
									anIntArray333[anInt4908++] = local137.anInt6631;
									return;
								}
								if (arg0 == 1506) {
									local158 = Static83.method1185(local137);
									anIntArray333[anInt4908++] = local158 == null ? -1 : local158.anInt6614;
									return;
								}
							} else if (arg0 < 2700) {
								local137 = Static357.method4826(anIntArray333[--anInt4908]);
								if (arg0 == 2600) {
									anIntArray333[anInt4908++] = local137.anInt6598;
									return;
								}
								if (arg0 == 2601) {
									anIntArray333[anInt4908++] = local137.anInt6624;
									return;
								}
								if (arg0 == 2602) {
									aStringArray25[anInt4906++] = local137.aString93;
									return;
								}
								if (arg0 == 2603) {
									anIntArray333[anInt4908++] = local137.anInt6665;
									return;
								}
								if (arg0 == 2604) {
									anIntArray333[anInt4908++] = local137.anInt6617;
									return;
								}
								if (arg0 == 2605) {
									anIntArray333[anInt4908++] = local137.anInt6613;
									return;
								}
								if (arg0 == 2606) {
									anIntArray333[anInt4908++] = local137.anInt6644;
									return;
								}
								if (arg0 == 2607) {
									anIntArray333[anInt4908++] = local137.anInt6647;
									return;
								}
								if (arg0 == 2608) {
									anIntArray333[anInt4908++] = local137.anInt6667;
									return;
								}
								if (arg0 == 2609) {
									anIntArray333[anInt4908++] = local137.anInt6628;
									return;
								}
								if (arg0 == 2610) {
									anIntArray333[anInt4908++] = local137.anInt6649;
									return;
								}
								if (arg0 == 2611) {
									anIntArray333[anInt4908++] = local137.anInt6602;
									return;
								}
								if (arg0 == 2612) {
									anIntArray333[anInt4908++] = local137.anInt6599;
									return;
								}
								if (arg0 == 2613) {
									anIntArray333[anInt4908++] = local137.anInt6584;
									return;
								}
								if (arg0 == 2614) {
									anIntArray333[anInt4908++] = local137.anInt6634 == 1 ? local137.anInt6576 : -1;
									return;
								}
							} else {
								@Pc(3889) Class2_Sub9 local3889;
								@Pc(3787) Class2_Sub9 local3787;
								if (arg0 < 2800) {
									if (arg0 == 2700) {
										local137 = Static357.method4826(anIntArray333[--anInt4908]);
										anIntArray333[anInt4908++] = local137.anInt6585;
										return;
									}
									if (arg0 == 2701) {
										local137 = Static357.method4826(anIntArray333[--anInt4908]);
										if (local137.anInt6585 != -1) {
											anIntArray333[anInt4908++] = local137.anInt6626;
											return;
										}
										anIntArray333[anInt4908++] = 0;
										return;
									}
									if (arg0 == 2702) {
										local13 = anIntArray333[--anInt4908];
										local3787 = (Class2_Sub9) Static606.aClass118_47.method2595((long) local13);
										if (local3787 != null) {
											anIntArray333[anInt4908++] = 1;
											return;
										}
										anIntArray333[anInt4908++] = 0;
										return;
									}
									if (arg0 == 2703) {
										local137 = Static357.method4826(anIntArray333[--anInt4908]);
										if (local137.aClass261Array2 == null) {
											anIntArray333[anInt4908++] = 0;
											return;
										}
										local19 = local137.aClass261Array2.length;
										for (local25 = 0; local25 < local137.aClass261Array2.length; local25++) {
											if (local137.aClass261Array2[local25] == null) {
												local19 = local25;
												break;
											}
										}
										anIntArray333[anInt4908++] = local19;
										return;
									}
									if (arg0 == 2704 || arg0 == 2705) {
										anInt4908 -= 2;
										local13 = anIntArray333[anInt4908];
										local19 = anIntArray333[anInt4908 + 1];
										local3889 = (Class2_Sub9) Static606.aClass118_47.method2595((long) local13);
										if (local3889 != null && local3889.anInt2171 == local19) {
											anIntArray333[anInt4908++] = 1;
											return;
										}
										anIntArray333[anInt4908++] = 0;
										return;
									}
								} else if (arg0 < 2900) {
									local137 = Static357.method4826(anIntArray333[--anInt4908]);
									if (arg0 == 2800) {
										anIntArray333[anInt4908++] = Static76.method1071(local137).method6880();
										return;
									}
									if (arg0 == 2801) {
										local19 = anIntArray333[--anInt4908];
										local19--;
										if (local137.aStringArray35 != null && local19 < local137.aStringArray35.length && local137.aStringArray35[local19] != null) {
											aStringArray25[anInt4906++] = local137.aStringArray35[local19];
											return;
										}
										aStringArray25[anInt4906++] = "";
										return;
									}
									if (arg0 == 2802) {
										if (local137.aString90 == null) {
											aStringArray25[anInt4906++] = "";
											return;
										}
										aStringArray25[anInt4906++] = local137.aString90;
										return;
									}
								} else {
									@Pc(4026) String local4026;
									if (arg0 < 3200) {
										if (arg0 == 3100) {
											local4026 = aStringArray25[--anInt4906];
											Static171.method2573(local4026);
											return;
										}
										if (arg0 == 3101) {
											anInt4908 -= 2;
											Static590.method8029(anIntArray333[anInt4908 + 1], Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1, anIntArray333[anInt4908]);
											return;
										}
										if (arg0 == 3103) {
											Static584.method7988();
											return;
										}
										if (arg0 == 3104) {
											local4026 = aStringArray25[--anInt4906];
											local19 = 0;
											if (Static319.method4274(local4026)) {
												local19 = Static445.method6066(local4026);
											}
											@Pc(4086) Class2_Sub40 local4086 = Static464.method6285(Static251.aClass131_1, Static155.aClass179_38);
											local4086.aClass2_Sub22_Sub2_2.method8552(local19);
											Static528.method7295(local4086);
											return;
										}
										@Pc(4115) Class2_Sub40 local4115;
										if (arg0 == 3105) {
											local4026 = aStringArray25[--anInt4906];
											local4115 = Static464.method6285(Static251.aClass131_1, Static525.aClass179_82);
											local4115.aClass2_Sub22_Sub2_2.method8537(local4026.length() + 1);
											local4115.aClass2_Sub22_Sub2_2.method8540(local4026);
											Static528.method7295(local4115);
											return;
										}
										if (arg0 == 3106) {
											local4026 = aStringArray25[--anInt4906];
											local4115 = Static464.method6285(Static251.aClass131_1, Static567.aClass179_118);
											local4115.aClass2_Sub22_Sub2_2.method8537(local4026.length() + 1);
											local4115.aClass2_Sub22_Sub2_2.method8540(local4026);
											Static528.method7295(local4115);
											return;
										}
										if (arg0 == 3107) {
											local13 = anIntArray333[--anInt4908];
											local1145 = aStringArray25[--anInt4906];
											Static165.method5091(local13, local1145);
											return;
										}
										if (arg0 == 3108) {
											anInt4908 -= 3;
											local13 = anIntArray333[anInt4908];
											local19 = anIntArray333[anInt4908 + 1];
											local25 = anIntArray333[anInt4908 + 2];
											local35 = Static357.method4826(local25);
											Static190.method2759(local35, local13, local19);
											return;
										}
										if (arg0 == 3109) {
											anInt4908 -= 2;
											local13 = anIntArray333[anInt4908];
											local19 = anIntArray333[anInt4908 + 1];
											local210 = arg1 ? aClass261_4 : aClass261_5;
											Static190.method2759(local210, local13, local19);
											return;
										}
										if (arg0 == 3110) {
											local13 = anIntArray333[--anInt4908];
											local4115 = Static464.method6285(Static251.aClass131_1, Static165.aClass179_81);
											local4115.aClass2_Sub22_Sub2_2.method8500(local13);
											Static528.method7295(local4115);
											return;
										}
										if (arg0 == 3111) {
											anInt4908 -= 2;
											local13 = anIntArray333[anInt4908];
											local19 = anIntArray333[anInt4908 + 1];
											local3889 = (Class2_Sub9) Static606.aClass118_47.method2595((long) local13);
											if (local3889 != null) {
												Static588.method8013(local3889, true, local3889.anInt2171 != local19);
											}
											Static389.method5232(local13, true, 3, local19);
											return;
										}
										if (arg0 == 3112) {
											anInt4908--;
											local13 = anIntArray333[anInt4908];
											local3787 = (Class2_Sub9) Static606.aClass118_47.method2595((long) local13);
											if (local3787 != null && local3787.anInt2172 == 3) {
												Static588.method8013(local3787, true, true);
											}
											return;
										}
										if (arg0 == 3113) {
											Static262.method4770(aStringArray25[--anInt4906]);
											return;
										}
										if (arg0 == 3114) {
											anInt4908 -= 2;
											local13 = anIntArray333[anInt4908];
											local19 = anIntArray333[anInt4908 + 1];
											local1507 = aStringArray25[--anInt4906];
											Static443.method6042("", local19, "", local1507, "", local13);
											return;
										}
										if (arg0 == 3115) {
											anInt4908 -= 11;
											@Pc(4416) Class361[] local4416 = Static108.method1608();
											@Pc(4419) Class306[] local4419 = Static366.method4960();
											Static424.method5663(anIntArray333[anInt4908 + 2], anIntArray333[anInt4908 + 10], local4416[anIntArray333[anInt4908]], anIntArray333[anInt4908 + 4], anIntArray333[anInt4908 + 7], anIntArray333[anInt4908 + 9], anIntArray333[anInt4908 + 8], anIntArray333[anInt4908 + 3], anIntArray333[anInt4908 + 5], local4419[anIntArray333[anInt4908 + 1]], anIntArray333[anInt4908 + 6]);
											return;
										}
									} else if (arg0 < 3300) {
										if (arg0 == 3200) {
											anInt4908 -= 3;
											Static245.method3378(255, anIntArray333[anInt4908 + 1], anIntArray333[anInt4908], 256, anIntArray333[anInt4908 + 2]);
											return;
										}
										if (arg0 == 3201) {
											Static637.method8582(50, anIntArray333[--anInt4908], 255);
											return;
										}
										if (arg0 == 3202) {
											anInt4908 -= 2;
											Static318.method4264(anIntArray333[anInt4908], anIntArray333[anInt4908 + 1], 255);
											return;
										}
										if (arg0 == 3203) {
											anInt4908 -= 4;
											Static245.method3378(anIntArray333[anInt4908 + 3], anIntArray333[anInt4908 + 1], anIntArray333[anInt4908], 256, anIntArray333[anInt4908 + 2]);
											return;
										}
										if (arg0 == 3204) {
											anInt4908 -= 3;
											Static637.method8582(anIntArray333[anInt4908 + 2], anIntArray333[anInt4908], anIntArray333[anInt4908 + 1]);
											return;
										}
										if (arg0 == 3205) {
											anInt4908 -= 3;
											Static318.method4264(anIntArray333[anInt4908], anIntArray333[anInt4908 + 1], anIntArray333[anInt4908 + 2]);
											return;
										}
										if (arg0 == 3206) {
											anInt4908 -= 4;
											Static305.method4186(anIntArray333[anInt4908 + 2], false, anIntArray333[anInt4908], 256, anIntArray333[anInt4908 + 1], anIntArray333[anInt4908 + 3]);
											return;
										}
										if (arg0 == 3207) {
											anInt4908 -= 4;
											Static305.method4186(anIntArray333[anInt4908 + 2], true, anIntArray333[anInt4908], 256, anIntArray333[anInt4908 + 1], anIntArray333[anInt4908 + 3]);
											return;
										}
										if (arg0 == 3208) {
											anInt4908 -= 5;
											Static245.method3378(anIntArray333[anInt4908 + 3], anIntArray333[anInt4908 + 1], anIntArray333[anInt4908], anIntArray333[anInt4908 + 4], anIntArray333[anInt4908 + 2]);
											return;
										}
										if (arg0 == 3209) {
											anInt4908 -= 5;
											Static305.method4186(anIntArray333[anInt4908 + 2], false, anIntArray333[anInt4908], anIntArray333[anInt4908 + 4], anIntArray333[anInt4908 + 1], anIntArray333[anInt4908 + 3]);
											return;
										}
									} else if (arg0 < 3400) {
										if (arg0 == 3300) {
											anIntArray333[anInt4908++] = Static262.anInt5597;
											return;
										}
										if (arg0 == 3301) {
											anInt4908 -= 2;
											local13 = anIntArray333[anInt4908];
											local19 = anIntArray333[anInt4908 + 1];
											anIntArray333[anInt4908++] = Static221.method3023(local19, false, local13);
											return;
										}
										if (arg0 == 3302) {
											anInt4908 -= 2;
											local13 = anIntArray333[anInt4908];
											local19 = anIntArray333[anInt4908 + 1];
											anIntArray333[anInt4908++] = Static558.method7644(false, local13, local19);
											return;
										}
										if (arg0 == 3303) {
											anInt4908 -= 2;
											local13 = anIntArray333[anInt4908];
											local19 = anIntArray333[anInt4908 + 1];
											anIntArray333[anInt4908++] = Static242.method3397(local19, local13, false);
											return;
										}
										if (arg0 == 3304) {
											local13 = anIntArray333[--anInt4908];
											anIntArray333[anInt4908++] = Static517.aClass11_1.method189(local13).anInt735;
											return;
										}
										if (arg0 == 3305) {
											local13 = anIntArray333[--anInt4908];
											anIntArray333[anInt4908++] = Static448.anIntArray510[local13];
											return;
										}
										if (arg0 == 3306) {
											local13 = anIntArray333[--anInt4908];
											anIntArray333[anInt4908++] = Static7.anIntArray31[local13];
											return;
										}
										if (arg0 == 3307) {
											local13 = anIntArray333[--anInt4908];
											anIntArray333[anInt4908++] = Static225.anIntArray250[local13];
											return;
										}
										if (arg0 == 3308) {
											@Pc(4944) byte local4944 = Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aByte127;
											local19 = (Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10090 >> 9) + Static132.anInt2246;
											local25 = (Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10089 >> 9) + Static123.anInt2176;
											anIntArray333[anInt4908++] = (local4944 << 28) + (local19 << 14) + local25;
											return;
										}
										if (arg0 == 3309) {
											local13 = anIntArray333[--anInt4908];
											anIntArray333[anInt4908++] = local13 >> 14 & 0x3FFF;
											return;
										}
										if (arg0 == 3310) {
											local13 = anIntArray333[--anInt4908];
											anIntArray333[anInt4908++] = local13 >> 28;
											return;
										}
										if (arg0 == 3311) {
											local13 = anIntArray333[--anInt4908];
											anIntArray333[anInt4908++] = local13 & 0x3FFF;
											return;
										}
										if (arg0 == 3312) {
											anIntArray333[anInt4908++] = Static570.aBoolean690 ? 1 : 0;
											return;
										}
										if (arg0 == 3313) {
											anInt4908 -= 2;
											local13 = anIntArray333[anInt4908];
											local19 = anIntArray333[anInt4908 + 1];
											anIntArray333[anInt4908++] = Static221.method3023(local19, true, local13);
											return;
										}
										if (arg0 == 3314) {
											anInt4908 -= 2;
											local13 = anIntArray333[anInt4908];
											local19 = anIntArray333[anInt4908 + 1];
											anIntArray333[anInt4908++] = Static558.method7644(true, local13, local19);
											return;
										}
										if (arg0 == 3315) {
											anInt4908 -= 2;
											local13 = anIntArray333[anInt4908];
											local19 = anIntArray333[anInt4908 + 1];
											anIntArray333[anInt4908++] = Static242.method3397(local19, local13, true);
											return;
										}
										if (arg0 == 3316) {
											if (Static165.anInt5949 >= 2) {
												anIntArray333[anInt4908++] = Static165.anInt5949;
												return;
											}
											anIntArray333[anInt4908++] = 0;
											return;
										}
										if (arg0 == 3317) {
											anIntArray333[anInt4908++] = Static363.anInt5740;
											return;
										}
										if (arg0 == 3318) {
											anIntArray333[anInt4908++] = Static216.aClass326_9.anInt8758;
											return;
										}
										if (arg0 == 3321) {
											anIntArray333[anInt4908++] = Static510.anInt8540;
											return;
										}
										if (arg0 == 3322) {
											anIntArray333[anInt4908++] = Static370.anInt5838;
											return;
										}
										if (arg0 == 3323) {
											if (Static354.anInt5551 >= 5 && Static354.anInt5551 <= 9) {
												anIntArray333[anInt4908++] = 1;
												return;
											}
											anIntArray333[anInt4908++] = 0;
											return;
										}
										if (arg0 == 3324) {
											if (Static354.anInt5551 >= 5 && Static354.anInt5551 <= 9) {
												anIntArray333[anInt4908++] = Static354.anInt5551;
												return;
											}
											anIntArray333[anInt4908++] = 0;
											return;
										}
										if (arg0 == 3325) {
											anIntArray333[anInt4908++] = Static296.aBoolean353 ? 1 : 0;
											return;
										}
										if (arg0 == 3326) {
											anIntArray333[anInt4908++] = Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt4650;
											return;
										}
										if (arg0 == 3327) {
											anIntArray333[anInt4908++] = Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aClass218_1.aBoolean389 ? 1 : 0;
											return;
										}
										if (arg0 == 3329) {
											anIntArray333[anInt4908++] = Static32.aBoolean58 ? 1 : 0;
											return;
										}
										if (arg0 == 3330) {
											local13 = anIntArray333[--anInt4908];
											anIntArray333[anInt4908++] = Static522.method7263(local13);
											return;
										}
										if (arg0 == 3331) {
											anInt4908 -= 2;
											local13 = anIntArray333[anInt4908];
											local19 = anIntArray333[anInt4908 + 1];
											anIntArray333[anInt4908++] = Static345.method4634(local13, local19, false);
											return;
										}
										if (arg0 == 3332) {
											anInt4908 -= 2;
											local13 = anIntArray333[anInt4908];
											local19 = anIntArray333[anInt4908 + 1];
											anIntArray333[anInt4908++] = Static345.method4634(local13, local19, true);
											return;
										}
										if (arg0 == 3333) {
											anIntArray333[anInt4908++] = Static500.anInt8131;
											return;
										}
										if (arg0 == 3335) {
											anIntArray333[anInt4908++] = Static483.anInt7694;
											return;
										}
										if (arg0 == 3336) {
											anInt4908 -= 4;
											local13 = anIntArray333[anInt4908];
											local19 = anIntArray333[anInt4908 + 1];
											local25 = anIntArray333[anInt4908 + 2];
											local353 = anIntArray333[anInt4908 + 3];
											local13 += local19 << 14;
											local13 += local25 << 28;
											local13 += local353;
											anIntArray333[anInt4908++] = local13;
											return;
										}
										if (arg0 == 3337) {
											anIntArray333[anInt4908++] = Static380.anInt5916;
											return;
										}
										if (arg0 == 3338) {
											anIntArray333[anInt4908++] = Static320.method4287();
											return;
										}
										if (arg0 == 3339) {
											anIntArray333[anInt4908++] = 0;
											return;
										}
										if (arg0 == 3340) {
											anIntArray333[anInt4908++] = Static223.aBoolean258 ? 1 : 0;
											return;
										}
										if (arg0 == 3341) {
											anIntArray333[anInt4908++] = Static287.aBoolean327 ? 1 : 0;
											return;
										}
										if (arg0 == 3342) {
											anIntArray333[anInt4908++] = Static507.aClass335_1.method7811();
											return;
										}
										if (arg0 == 3343) {
											anIntArray333[anInt4908++] = Static507.aClass335_1.method7821();
											return;
										}
										if (arg0 == 3344) {
											aStringArray25[anInt4906++] = Static182.method7780();
											return;
										}
										if (arg0 == 3345) {
											aStringArray25[anInt4906++] = Static101.method1536();
											return;
										}
										if (arg0 == 3346) {
											anIntArray333[anInt4908++] = Static502.method2511();
											return;
										}
										if (arg0 == 3347) {
											anIntArray333[anInt4908++] = Static40.anInt800;
											return;
										}
										if (arg0 == 3349) {
											anIntArray333[anInt4908++] = Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aClass116_7.method2590() >> 3;
											return;
										}
									} else if (arg0 < 3500) {
										@Pc(5692) Class159 local5692;
										if (arg0 == 3400) {
											anInt4908 -= 2;
											local13 = anIntArray333[anInt4908];
											local19 = anIntArray333[anInt4908 + 1];
											local5692 = Static587.aClass232_1.method5002(local13);
											aStringArray25[anInt4906++] = local5692.method3414(local19);
											return;
										}
										if (arg0 == 3408) {
											anInt4908 -= 4;
											local13 = anIntArray333[anInt4908];
											local19 = anIntArray333[anInt4908 + 1];
											local25 = anIntArray333[anInt4908 + 2];
											local353 = anIntArray333[anInt4908 + 3];
											@Pc(5738) Class159 local5738 = Static587.aClass232_1.method5002(local25);
											if (local5738.aChar1 == local13 && local5738.aChar2 == local19) {
												if (local19 == 115) {
													aStringArray25[anInt4906++] = local5738.method3414(local353);
													return;
												}
												anIntArray333[anInt4908++] = local5738.method3424(local353);
												return;
											}
											throw new RuntimeException("C3408-1");
										}
										if (arg0 == 3409) {
											anInt4908 -= 3;
											local13 = anIntArray333[anInt4908];
											local19 = anIntArray333[anInt4908 + 1];
											local25 = anIntArray333[anInt4908 + 2];
											if (local19 == -1) {
												throw new RuntimeException("C3409-2");
											}
											@Pc(5814) Class159 local5814 = Static587.aClass232_1.method5002(local19);
											if (local5814.aChar2 != local13) {
												throw new RuntimeException("C3409-1");
											}
											anIntArray333[anInt4908++] = local5814.method3420(local25) ? 1 : 0;
											return;
										}
										if (arg0 == 3410) {
											local13 = anIntArray333[--anInt4908];
											local1145 = aStringArray25[--anInt4906];
											if (local13 == -1) {
												throw new RuntimeException("C3410-2");
											}
											local5692 = Static587.aClass232_1.method5002(local13);
											if (local5692.aChar2 != 's') {
												throw new RuntimeException("C3410-1");
											}
											anIntArray333[anInt4908++] = local5692.method3423(local1145) ? 1 : 0;
											return;
										}
										if (arg0 == 3411) {
											local13 = anIntArray333[--anInt4908];
											@Pc(5912) Class159 local5912 = Static587.aClass232_1.method5002(local13);
											anIntArray333[anInt4908++] = local5912.aClass118_24.method2602();
											return;
										}
									} else if (arg0 < 3700) {
										if (arg0 == 3600) {
											if (Static641.anInt10324 == 0) {
												anIntArray333[anInt4908++] = -2;
												return;
											}
											if (Static641.anInt10324 == 1) {
												anIntArray333[anInt4908++] = -1;
												return;
											}
											anIntArray333[anInt4908++] = Static352.anInt5497;
											return;
										}
										if (arg0 == 3601) {
											local13 = anIntArray333[--anInt4908];
											if (Static641.anInt10324 == 2 && local13 < Static352.anInt5497) {
												aStringArray25[anInt4906++] = Static213.aStringArray13[local13];
												if (Static565.aStringArray44[local13] != null) {
													aStringArray25[anInt4906++] = Static565.aStringArray44[local13];
													return;
												}
												aStringArray25[anInt4906++] = "";
												return;
											}
											aStringArray25[anInt4906++] = "";
											aStringArray25[anInt4906++] = "";
											return;
										}
										if (arg0 == 3602) {
											local13 = anIntArray333[--anInt4908];
											if (Static641.anInt10324 == 2 && local13 < Static352.anInt5497) {
												anIntArray333[anInt4908++] = Static320.anIntArray351[local13];
												return;
											}
											anIntArray333[anInt4908++] = 0;
											return;
										}
										if (arg0 == 3603) {
											local13 = anIntArray333[--anInt4908];
											if (Static641.anInt10324 == 2 && local13 < Static352.anInt5497) {
												anIntArray333[anInt4908++] = Static167.anIntArray196[local13];
												return;
											}
											anIntArray333[anInt4908++] = 0;
											return;
										}
										if (arg0 == 3604) {
											local4026 = aStringArray25[--anInt4906];
											local19 = anIntArray333[--anInt4908];
											Static432.method5967(local19, local4026);
											return;
										}
										if (arg0 == 3605) {
											local4026 = aStringArray25[--anInt4906];
											Static58.method900(local4026);
											return;
										}
										if (arg0 == 3606) {
											local4026 = aStringArray25[--anInt4906];
											Static25.method451(local4026);
											return;
										}
										if (arg0 == 3607) {
											local4026 = aStringArray25[--anInt4906];
											Static101.method1537(false, local4026);
											return;
										}
										if (arg0 == 3608) {
											local4026 = aStringArray25[--anInt4906];
											Static41.method666(local4026);
											return;
										}
										if (arg0 == 3609) {
											local4026 = aStringArray25[--anInt4906];
											if (local4026.startsWith("<img=0>") || local4026.startsWith("<img=1>")) {
												local4026 = local4026.substring(7);
											}
											anIntArray333[anInt4908++] = Static526.method7282(local4026) ? 1 : 0;
											return;
										}
										if (arg0 == 3610) {
											local13 = anIntArray333[--anInt4908];
											if (Static641.anInt10324 == 2 && local13 < Static352.anInt5497) {
												aStringArray25[anInt4906++] = Static564.aStringArray43[local13];
												return;
											}
											aStringArray25[anInt4906++] = "";
											return;
										}
										if (arg0 == 3611) {
											if (Static37.aString9 != null) {
												aStringArray25[anInt4906++] = Static501.method6909(Static37.aString9);
												return;
											}
											aStringArray25[anInt4906++] = "";
											return;
										}
										if (arg0 == 3612) {
											if (Static37.aString9 != null) {
												anIntArray333[anInt4908++] = Static159.anInt2843;
												return;
											}
											anIntArray333[anInt4908++] = 0;
											return;
										}
										if (arg0 == 3613) {
											local13 = anIntArray333[--anInt4908];
											if (Static37.aString9 != null && local13 < Static159.anInt2843) {
												aStringArray25[anInt4906++] = Static619.aClass211Array1[local13].aString59;
												return;
											}
											aStringArray25[anInt4906++] = "";
											return;
										}
										if (arg0 == 3614) {
											local13 = anIntArray333[--anInt4908];
											if (Static37.aString9 != null && local13 < Static159.anInt2843) {
												anIntArray333[anInt4908++] = Static619.aClass211Array1[local13].anInt5229;
												return;
											}
											anIntArray333[anInt4908++] = 0;
											return;
										}
										if (arg0 == 3615) {
											local13 = anIntArray333[--anInt4908];
											if (Static37.aString9 != null && local13 < Static159.anInt2843) {
												anIntArray333[anInt4908++] = Static619.aClass211Array1[local13].aByte80;
												return;
											}
											anIntArray333[anInt4908++] = 0;
											return;
										}
										if (arg0 == 3616) {
											anIntArray333[anInt4908++] = Static100.aByte29;
											return;
										}
										if (arg0 == 3617) {
											local4026 = aStringArray25[--anInt4906];
											Static515.method7207(local4026);
											return;
										}
										if (arg0 == 3618) {
											anIntArray333[anInt4908++] = Static326.aByte79;
											return;
										}
										if (arg0 == 3619) {
											local4026 = aStringArray25[--anInt4906];
											Static435.method2762(local4026);
											return;
										}
										if (arg0 == 3620) {
											Static55.method856();
											return;
										}
										if (arg0 == 3621) {
											if (Static641.anInt10324 == 0) {
												anIntArray333[anInt4908++] = -1;
												return;
											}
											anIntArray333[anInt4908++] = Static124.anInt2182;
											return;
										}
										if (arg0 == 3622) {
											local13 = anIntArray333[--anInt4908];
											if (Static641.anInt10324 != 0 && local13 < Static124.anInt2182) {
												aStringArray25[anInt4906++] = Static214.aStringArray14[local13];
												if (Static594.aStringArray45[local13] != null) {
													aStringArray25[anInt4906++] = Static594.aStringArray45[local13];
													return;
												}
												aStringArray25[anInt4906++] = "";
												return;
											}
											aStringArray25[anInt4906++] = "";
											aStringArray25[anInt4906++] = "";
											return;
										}
										if (arg0 == 3623) {
											local4026 = aStringArray25[--anInt4906];
											if (local4026.startsWith("<img=0>") || local4026.startsWith("<img=1>")) {
												local4026 = local4026.substring(7);
											}
											anIntArray333[anInt4908++] = Static260.method3557(local4026) ? 1 : 0;
											return;
										}
										if (arg0 == 3624) {
											local13 = anIntArray333[--anInt4908];
											if (Static619.aClass211Array1 != null && local13 < Static159.anInt2843 && Static619.aClass211Array1[local13].aString61.equalsIgnoreCase(Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aString50)) {
												anIntArray333[anInt4908++] = 1;
												return;
											}
											anIntArray333[anInt4908++] = 0;
											return;
										}
										if (arg0 == 3625) {
											if (Static392.aString84 != null) {
												aStringArray25[anInt4906++] = Static392.aString84;
												return;
											}
											aStringArray25[anInt4906++] = "";
											return;
										}
										if (arg0 == 3626) {
											local13 = anIntArray333[--anInt4908];
											if (Static37.aString9 != null && local13 < Static159.anInt2843) {
												aStringArray25[anInt4906++] = Static619.aClass211Array1[local13].aString62;
												return;
											}
											aStringArray25[anInt4906++] = "";
											return;
										}
										if (arg0 == 3627) {
											local13 = anIntArray333[--anInt4908];
											if (Static641.anInt10324 == 2 && local13 >= 0 && local13 < Static352.anInt5497) {
												anIntArray333[anInt4908++] = Static146.aBooleanArray42[local13] ? 1 : 0;
												return;
											}
											anIntArray333[anInt4908++] = 0;
											return;
										}
										if (arg0 == 3628) {
											local4026 = aStringArray25[--anInt4906];
											if (local4026.startsWith("<img=0>") || local4026.startsWith("<img=1>")) {
												local4026 = local4026.substring(7);
											}
											anIntArray333[anInt4908++] = Static460.method6256(local4026);
											return;
										}
										if (arg0 == 3629) {
											anIntArray333[anInt4908++] = Static310.anInt4998;
											return;
										}
										if (arg0 == 3630) {
											local4026 = aStringArray25[--anInt4906];
											Static101.method1537(true, local4026);
											return;
										}
										if (arg0 == 3631) {
											local13 = anIntArray333[--anInt4908];
											anIntArray333[anInt4908++] = Static240.aBooleanArray14[local13] ? 1 : 0;
											return;
										}
										if (arg0 == 3632) {
											local13 = anIntArray333[--anInt4908];
											if (Static37.aString9 != null && local13 < Static159.anInt2843) {
												aStringArray25[anInt4906++] = Static619.aClass211Array1[local13].aString61;
												return;
											}
											aStringArray25[anInt4906++] = "";
											return;
										}
										if (arg0 == 3633) {
											local13 = anIntArray333[--anInt4908];
											if (Static641.anInt10324 != 0 && local13 < Static124.anInt2182) {
												aStringArray25[anInt4906++] = Static55.aStringArray5[local13];
												return;
											}
											aStringArray25[anInt4906++] = "";
											return;
										}
									} else if (arg0 < 4000) {
										if (arg0 == 3903) {
											local13 = anIntArray333[--anInt4908];
											anIntArray333[anInt4908++] = Static81.aClass36Array1[local13].method742();
											return;
										}
										if (arg0 == 3904) {
											local13 = anIntArray333[--anInt4908];
											anIntArray333[anInt4908++] = Static81.aClass36Array1[local13].anInt955;
											return;
										}
										if (arg0 == 3905) {
											local13 = anIntArray333[--anInt4908];
											anIntArray333[anInt4908++] = Static81.aClass36Array1[local13].anInt962;
											return;
										}
										if (arg0 == 3906) {
											local13 = anIntArray333[--anInt4908];
											anIntArray333[anInt4908++] = Static81.aClass36Array1[local13].anInt959;
											return;
										}
										if (arg0 == 3907) {
											local13 = anIntArray333[--anInt4908];
											anIntArray333[anInt4908++] = Static81.aClass36Array1[local13].anInt958;
											return;
										}
										if (arg0 == 3908) {
											local13 = anIntArray333[--anInt4908];
											anIntArray333[anInt4908++] = Static81.aClass36Array1[local13].anInt954;
											return;
										}
										if (arg0 == 3910) {
											local13 = anIntArray333[--anInt4908];
											local19 = Static81.aClass36Array1[local13].method739();
											anIntArray333[anInt4908++] = local19 == 0 ? 1 : 0;
											return;
										}
										if (arg0 == 3911) {
											local13 = anIntArray333[--anInt4908];
											local19 = Static81.aClass36Array1[local13].method739();
											anIntArray333[anInt4908++] = local19 == 2 ? 1 : 0;
											return;
										}
										if (arg0 == 3912) {
											local13 = anIntArray333[--anInt4908];
											local19 = Static81.aClass36Array1[local13].method739();
											anIntArray333[anInt4908++] = local19 == 5 ? 1 : 0;
											return;
										}
										if (arg0 == 3913) {
											local13 = anIntArray333[--anInt4908];
											local19 = Static81.aClass36Array1[local13].method739();
											anIntArray333[anInt4908++] = local19 == 1 ? 1 : 0;
											return;
										}
									} else if (arg0 < 4100) {
										if (arg0 == 4000) {
											anInt4908 -= 2;
											local13 = anIntArray333[anInt4908];
											local19 = anIntArray333[anInt4908 + 1];
											anIntArray333[anInt4908++] = local13 + local19;
											return;
										}
										if (arg0 == 4001) {
											anInt4908 -= 2;
											local13 = anIntArray333[anInt4908];
											local19 = anIntArray333[anInt4908 + 1];
											anIntArray333[anInt4908++] = local13 - local19;
											return;
										}
										if (arg0 == 4002) {
											anInt4908 -= 2;
											local13 = anIntArray333[anInt4908];
											local19 = anIntArray333[anInt4908 + 1];
											anIntArray333[anInt4908++] = local13 * local19;
											return;
										}
										if (arg0 == 4003) {
											anInt4908 -= 2;
											local13 = anIntArray333[anInt4908];
											local19 = anIntArray333[anInt4908 + 1];
											anIntArray333[anInt4908++] = local13 / local19;
											return;
										}
										if (arg0 == 4004) {
											local13 = anIntArray333[--anInt4908];
											anIntArray333[anInt4908++] = (int) (Math.random() * (double) local13);
											return;
										}
										if (arg0 == 4005) {
											local13 = anIntArray333[--anInt4908];
											anIntArray333[anInt4908++] = (int) (Math.random() * (double) (local13 + 1));
											return;
										}
										if (arg0 == 4006) {
											anInt4908 -= 5;
											local13 = anIntArray333[anInt4908];
											local19 = anIntArray333[anInt4908 + 1];
											local25 = anIntArray333[anInt4908 + 2];
											local353 = anIntArray333[anInt4908 + 3];
											local2357 = anIntArray333[anInt4908 + 4];
											anIntArray333[anInt4908++] = local13 + (local19 - local13) * (local2357 - local25) / (local353 - local25);
											return;
										}
										@Pc(7422) long local7422;
										@Pc(7415) long local7415;
										if (arg0 == 4007) {
											anInt4908 -= 2;
											local7415 = anIntArray333[anInt4908];
											local7422 = anIntArray333[anInt4908 + 1];
											anIntArray333[anInt4908++] = (int) (local7415 + local7415 * local7422 / 100L);
											return;
										}
										if (arg0 == 4008) {
											anInt4908 -= 2;
											local13 = anIntArray333[anInt4908];
											local19 = anIntArray333[anInt4908 + 1];
											anIntArray333[anInt4908++] = local13 | 0x1 << local19;
											return;
										}
										if (arg0 == 4009) {
											anInt4908 -= 2;
											local13 = anIntArray333[anInt4908];
											local19 = anIntArray333[anInt4908 + 1];
											anIntArray333[anInt4908++] = local13 & -(0x1 << local19) - 1;
											return;
										}
										if (arg0 == 4010) {
											anInt4908 -= 2;
											local13 = anIntArray333[anInt4908];
											local19 = anIntArray333[anInt4908 + 1];
											anIntArray333[anInt4908++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
											return;
										}
										if (arg0 == 4011) {
											anInt4908 -= 2;
											local13 = anIntArray333[anInt4908];
											local19 = anIntArray333[anInt4908 + 1];
											anIntArray333[anInt4908++] = local13 % local19;
											return;
										}
										if (arg0 == 4012) {
											anInt4908 -= 2;
											local13 = anIntArray333[anInt4908];
											local19 = anIntArray333[anInt4908 + 1];
											if (local13 == 0) {
												anIntArray333[anInt4908++] = 0;
												return;
											}
											anIntArray333[anInt4908++] = (int) Math.pow((double) local13, (double) local19);
											return;
										}
										if (arg0 == 4013) {
											anInt4908 -= 2;
											local13 = anIntArray333[anInt4908];
											local19 = anIntArray333[anInt4908 + 1];
											if (local13 == 0) {
												anIntArray333[anInt4908++] = 0;
												return;
											}
											if (local19 == 0) {
												anIntArray333[anInt4908++] = Integer.MAX_VALUE;
												return;
											}
											anIntArray333[anInt4908++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
											return;
										}
										if (arg0 == 4014) {
											anInt4908 -= 2;
											local13 = anIntArray333[anInt4908];
											local19 = anIntArray333[anInt4908 + 1];
											anIntArray333[anInt4908++] = local13 & local19;
											return;
										}
										if (arg0 == 4015) {
											anInt4908 -= 2;
											local13 = anIntArray333[anInt4908];
											local19 = anIntArray333[anInt4908 + 1];
											anIntArray333[anInt4908++] = local13 | local19;
											return;
										}
										if (arg0 == 4016) {
											anInt4908 -= 2;
											local13 = anIntArray333[anInt4908];
											local19 = anIntArray333[anInt4908 + 1];
											anIntArray333[anInt4908++] = local13 < local19 ? local13 : local19;
											return;
										}
										if (arg0 == 4017) {
											anInt4908 -= 2;
											local13 = anIntArray333[anInt4908];
											local19 = anIntArray333[anInt4908 + 1];
											anIntArray333[anInt4908++] = local13 > local19 ? local13 : local19;
											return;
										}
										if (arg0 == 4018) {
											anInt4908 -= 3;
											local7415 = anIntArray333[anInt4908];
											local7422 = anIntArray333[anInt4908 + 1];
											@Pc(7803) long local7803 = (long) anIntArray333[anInt4908 + 2];
											anIntArray333[anInt4908++] = (int) (local7415 * local7803 / local7422);
											return;
										}
										if (arg0 == 4019) {
											anInt4908 -= 2;
											local13 = anIntArray333[anInt4908];
											local19 = anIntArray333[anInt4908 + 1];
											if (local13 > 700 || local19 > 700) {
												anIntArray333[anInt4908++] = 256;
											}
											@Pc(7862) double local7862 = (Math.random() * (double) (local19 + local13) + 800.0D - (double) local13) / 100.0D;
											anIntArray333[anInt4908++] = (int) (Math.pow(2.0D, local7862) + 0.5D);
											return;
										}
									} else if (arg0 < 4200) {
										if (arg0 == 4100) {
											local4026 = aStringArray25[--anInt4906];
											local19 = anIntArray333[--anInt4908];
											aStringArray25[anInt4906++] = local4026 + local19;
											return;
										}
										if (arg0 == 4101) {
											anInt4906 -= 2;
											local4026 = aStringArray25[anInt4906];
											local1145 = aStringArray25[anInt4906 + 1];
											aStringArray25[anInt4906++] = local4026 + local1145;
											return;
										}
										if (arg0 == 4102) {
											local4026 = aStringArray25[--anInt4906];
											local19 = anIntArray333[--anInt4908];
											aStringArray25[anInt4906++] = local4026 + Static119.method1749(local19);
											return;
										}
										if (arg0 == 4103) {
											local4026 = aStringArray25[--anInt4906];
											aStringArray25[anInt4906++] = local4026.toLowerCase();
											return;
										}
										if (arg0 == 4104) {
											aStringArray25[anInt4906++] = method4139(anIntArray333[--anInt4908]);
											return;
										}
										if (arg0 == 4105) {
											anInt4906 -= 2;
											local4026 = aStringArray25[anInt4906];
											local1145 = aStringArray25[anInt4906 + 1];
											if (Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aClass218_1 != null && Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aClass218_1.aBoolean389) {
												aStringArray25[anInt4906++] = local1145;
												return;
											}
											aStringArray25[anInt4906++] = local4026;
											return;
										}
										if (arg0 == 4106) {
											local13 = anIntArray333[--anInt4908];
											aStringArray25[anInt4906++] = Integer.toString(local13);
											return;
										}
										if (arg0 == 4107) {
											anInt4906 -= 2;
											anIntArray333[anInt4908++] = Static410.method5511(Static483.anInt7694, aStringArray25[anInt4906 + 1], aStringArray25[anInt4906]);
											return;
										}
										@Pc(8145) Class256 local8145;
										if (arg0 == 4108) {
											local4026 = aStringArray25[--anInt4906];
											anInt4908 -= 2;
											local19 = anIntArray333[anInt4908];
											local25 = anIntArray333[anInt4908 + 1];
											local8145 = Static416.method5569(Static141.aClass380_39, local25);
											anIntArray333[anInt4908++] = local8145.method5537(Static176.aClass61Array5, local4026, local19);
											return;
										}
										if (arg0 == 4109) {
											local4026 = aStringArray25[--anInt4906];
											anInt4908 -= 2;
											local19 = anIntArray333[anInt4908];
											local25 = anIntArray333[anInt4908 + 1];
											local8145 = Static416.method5569(Static141.aClass380_39, local25);
											anIntArray333[anInt4908++] = local8145.method5533(local19, local4026, Static176.aClass61Array5);
											return;
										}
										if (arg0 == 4110) {
											anInt4906 -= 2;
											local4026 = aStringArray25[anInt4906];
											local1145 = aStringArray25[anInt4906 + 1];
											if (anIntArray333[--anInt4908] == 1) {
												aStringArray25[anInt4906++] = local4026;
												return;
											}
											aStringArray25[anInt4906++] = local1145;
											return;
										}
										if (arg0 == 4111) {
											local4026 = aStringArray25[--anInt4906];
											aStringArray25[anInt4906++] = Static645.method8270(local4026);
											return;
										}
										if (arg0 == 4112) {
											local4026 = aStringArray25[--anInt4906];
											local19 = anIntArray333[--anInt4908];
											if (local19 == -1) {
												throw new RuntimeException("null char");
											}
											aStringArray25[anInt4906++] = local4026 + (char) local19;
											return;
										}
										if (arg0 == 4113) {
											local13 = anIntArray333[--anInt4908];
											anIntArray333[anInt4908++] = method4143((char) local13);
											return;
										}
										if (arg0 == 4114) {
											local13 = anIntArray333[--anInt4908];
											anIntArray333[anInt4908++] = Static644.method8649((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4115) {
											local13 = anIntArray333[--anInt4908];
											anIntArray333[anInt4908++] = Static439.method6022((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4116) {
											local13 = anIntArray333[--anInt4908];
											anIntArray333[anInt4908++] = Static554.method7606((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4117) {
											local4026 = aStringArray25[--anInt4906];
											if (local4026 != null) {
												anIntArray333[anInt4908++] = local4026.length();
												return;
											}
											anIntArray333[anInt4908++] = 0;
											return;
										}
										if (arg0 == 4118) {
											local4026 = aStringArray25[--anInt4906];
											anInt4908 -= 2;
											local19 = anIntArray333[anInt4908];
											local25 = anIntArray333[anInt4908 + 1];
											aStringArray25[anInt4906++] = local4026.substring(local19, local25);
											return;
										}
										if (arg0 == 4119) {
											local4026 = aStringArray25[--anInt4906];
											@Pc(8503) StringBuffer local8503 = new StringBuffer(local4026.length());
											@Pc(8505) boolean local8505 = false;
											for (local353 = 0; local353 < local4026.length(); local353++) {
												@Pc(8512) char local8512 = local4026.charAt(local353);
												if (local8512 == '<') {
													local8505 = true;
												} else if (local8512 == '>') {
													local8505 = false;
												} else if (!local8505) {
													local8503.append(local8512);
												}
											}
											aStringArray25[anInt4906++] = local8503.toString();
											return;
										}
										if (arg0 == 4120) {
											local4026 = aStringArray25[--anInt4906];
											anInt4908 -= 2;
											local19 = anIntArray333[anInt4908];
											local25 = anIntArray333[anInt4908 + 1];
											anIntArray333[anInt4908++] = local4026.indexOf(local19, local25);
											return;
										}
										if (arg0 == 4121) {
											anInt4906 -= 2;
											local4026 = aStringArray25[anInt4906];
											local1145 = aStringArray25[anInt4906 + 1];
											local25 = anIntArray333[--anInt4908];
											anIntArray333[anInt4908++] = local4026.indexOf(local1145, local25);
											return;
										}
										if (arg0 == 4122) {
											local13 = anIntArray333[--anInt4908];
											anIntArray333[anInt4908++] = Character.toLowerCase((char) local13);
											return;
										}
										if (arg0 == 4123) {
											local13 = anIntArray333[--anInt4908];
											anIntArray333[anInt4908++] = Character.toUpperCase((char) local13);
											return;
										}
										if (arg0 == 4124) {
											local412 = anIntArray333[--anInt4908] != 0;
											local19 = anIntArray333[--anInt4908];
											aStringArray25[anInt4906++] = Static350.method4701(0, local412, (long) local19, Static483.anInt7694);
											return;
										}
										if (arg0 == 4125) {
											local4026 = aStringArray25[--anInt4906];
											local19 = anIntArray333[--anInt4908];
											@Pc(8726) Class256 local8726 = Static416.method5569(Static141.aClass380_39, local19);
											anIntArray333[anInt4908++] = local8726.method5540(local4026, Static176.aClass61Array5);
											return;
										}
									} else if (arg0 < 4300) {
										if (arg0 == 4200) {
											local13 = anIntArray333[--anInt4908];
											aStringArray25[anInt4906++] = Static72.aClass225_2.method4789(local13).aString11;
											return;
										}
										@Pc(8788) Class34 local8788;
										if (arg0 == 4201) {
											anInt4908 -= 2;
											local13 = anIntArray333[anInt4908];
											local19 = anIntArray333[anInt4908 + 1];
											local8788 = Static72.aClass225_2.method4789(local13);
											if (local19 >= 1 && local19 <= 5 && local8788.aStringArray3[local19 - 1] != null) {
												aStringArray25[anInt4906++] = local8788.aStringArray3[local19 - 1];
												return;
											}
											aStringArray25[anInt4906++] = "";
											return;
										}
										if (arg0 == 4202) {
											anInt4908 -= 2;
											local13 = anIntArray333[anInt4908];
											local19 = anIntArray333[anInt4908 + 1];
											local8788 = Static72.aClass225_2.method4789(local13);
											if (local19 >= 1 && local19 <= 5 && local8788.aStringArray4[local19 - 1] != null) {
												aStringArray25[anInt4906++] = local8788.aStringArray4[local19 - 1];
												return;
											}
											aStringArray25[anInt4906++] = "";
											return;
										}
										if (arg0 == 4203) {
											local13 = anIntArray333[--anInt4908];
											anIntArray333[anInt4908++] = Static72.aClass225_2.method4789(local13).anInt867;
											return;
										}
										if (arg0 == 4204) {
											local13 = anIntArray333[--anInt4908];
											anIntArray333[anInt4908++] = Static72.aClass225_2.method4789(local13).anInt858 == 1 ? 1 : 0;
											return;
										}
										@Pc(8951) Class34 local8951;
										if (arg0 == 4205) {
											local13 = anIntArray333[--anInt4908];
											local8951 = Static72.aClass225_2.method4789(local13);
											if (local8951.anInt881 == -1 && local8951.anInt899 >= 0) {
												anIntArray333[anInt4908++] = local8951.anInt899;
												return;
											}
											anIntArray333[anInt4908++] = local13;
											return;
										}
										if (arg0 == 4206) {
											local13 = anIntArray333[--anInt4908];
											local8951 = Static72.aClass225_2.method4789(local13);
											if (local8951.anInt881 >= 0 && local8951.anInt899 >= 0) {
												anIntArray333[anInt4908++] = local8951.anInt899;
												return;
											}
											anIntArray333[anInt4908++] = local13;
											return;
										}
										if (arg0 == 4207) {
											local13 = anIntArray333[--anInt4908];
											anIntArray333[anInt4908++] = Static72.aClass225_2.method4789(local13).aBoolean67 ? 1 : 0;
											return;
										}
										if (arg0 == 4208) {
											anInt4908 -= 2;
											local13 = anIntArray333[anInt4908];
											local19 = anIntArray333[anInt4908 + 1];
											local3091 = Static339.aClass66_1.method1439(local19);
											if (local3091.method5153()) {
												aStringArray25[anInt4906++] = Static72.aClass225_2.method4789(local13).method687(local3091.aString83, local19);
												return;
											}
											anIntArray333[anInt4908++] = Static72.aClass225_2.method4789(local13).method688(local3091.anInt6043, local19);
											return;
										}
										if (arg0 == 4209) {
											anInt4908 -= 2;
											local13 = anIntArray333[anInt4908];
											local19 = anIntArray333[anInt4908 + 1] - 1;
											local8788 = Static72.aClass225_2.method4789(local13);
											if (local8788.anInt844 == local19) {
												anIntArray333[anInt4908++] = local8788.anInt866;
												return;
											}
											if (local8788.anInt849 == local19) {
												anIntArray333[anInt4908++] = local8788.anInt846;
												return;
											}
											anIntArray333[anInt4908++] = -1;
											return;
										}
										if (arg0 == 4210) {
											local4026 = aStringArray25[--anInt4906];
											local19 = anIntArray333[--anInt4908];
											Static501.method6911(local19 == 1, local4026);
											anIntArray333[anInt4908++] = Static129.anInt8997;
											return;
										}
										if (arg0 == 4211) {
											if (Static354.aShortArray80 != null && Static330.anInt6459 < Static129.anInt8997) {
												anIntArray333[anInt4908++] = Static354.aShortArray80[Static330.anInt6459++] & 0xFFFF;
												return;
											}
											anIntArray333[anInt4908++] = -1;
											return;
										}
										if (arg0 == 4212) {
											Static330.anInt6459 = 0;
											return;
										}
										if (arg0 == 4213) {
											local13 = anIntArray333[--anInt4908];
											anIntArray333[anInt4908++] = Static72.aClass225_2.method4789(local13).anInt841;
											return;
										}
										if (arg0 == 4214) {
											local4026 = aStringArray25[--anInt4906];
											anInt4908 -= 3;
											local19 = anIntArray333[anInt4908];
											local25 = anIntArray333[anInt4908 + 1];
											local353 = anIntArray333[anInt4908 + 2];
											Static324.method4331(local4026, local25, local19 == 1, local353);
											anIntArray333[anInt4908++] = Static129.anInt8997;
											return;
										}
										if (arg0 == 4215) {
											anInt4906 -= 2;
											anInt4908 -= 2;
											local4026 = aStringArray25[anInt4906];
											local19 = anIntArray333[anInt4908];
											local25 = anIntArray333[anInt4908 + 1];
											@Pc(9350) String local9350 = aStringArray25[anInt4906 + 1];
											Static12.method181(local9350, local19 == 1, local25, local4026);
											anIntArray333[anInt4908++] = Static129.anInt8997;
											return;
										}
									} else if (arg0 < 4400) {
										if (arg0 == 4300) {
											anInt4908 -= 2;
											local13 = anIntArray333[anInt4908];
											local19 = anIntArray333[anInt4908 + 1];
											local3091 = Static339.aClass66_1.method1439(local19);
											if (local3091.method5153()) {
												aStringArray25[anInt4906++] = Static409.aClass107_2.method2291(local13).method3195(local19, local3091.aString83);
												return;
											}
											anIntArray333[anInt4908++] = Static409.aClass107_2.method2291(local13).method3192(local3091.anInt6043, local19);
											return;
										}
									} else if (arg0 < 4500) {
										if (arg0 == 4400) {
											anInt4908 -= 2;
											local13 = anIntArray333[anInt4908];
											local19 = anIntArray333[anInt4908 + 1];
											local3091 = Static339.aClass66_1.method1439(local19);
											if (local3091.method5153()) {
												aStringArray25[anInt4906++] = Static319.aClass141_4.method2971(local13).method4062(local3091.aString83, local19);
												return;
											}
											anIntArray333[anInt4908++] = Static319.aClass141_4.method2971(local13).method4056(local19, local3091.anInt6043);
											return;
										}
									} else if (arg0 < 4600) {
										if (arg0 == 4500) {
											anInt4908 -= 2;
											local13 = anIntArray333[anInt4908];
											local19 = anIntArray333[anInt4908 + 1];
											local3091 = Static339.aClass66_1.method1439(local19);
											if (local3091.method5153()) {
												aStringArray25[anInt4906++] = Static105.aClass339_1.method7580(local13).method5244(local3091.aString83, local19);
												return;
											}
											anIntArray333[anInt4908++] = Static105.aClass339_1.method7580(local13).method5246(local3091.anInt6043, local19);
											return;
										}
									} else if (arg0 < 4700 && arg0 == 4600) {
										local13 = anIntArray333[--anInt4908];
										@Pc(9578) Class334 local9578 = Static43.aClass283_1.method6260(local13);
										if (local9578.anIntArray606 != null && local9578.anIntArray606.length > 0) {
											local25 = 0;
											local353 = local9578.anIntArray605[0];
											for (local2357 = 1; local2357 < local9578.anIntArray606.length; local2357++) {
												if (local9578.anIntArray605[local2357] > local353) {
													local25 = local2357;
													local353 = local9578.anIntArray605[local2357];
												}
											}
											anIntArray333[anInt4908++] = local9578.anIntArray606[local25];
											return;
										}
										anIntArray333[anInt4908++] = local9578.anInt8932;
										return;
									}
								}
							}
						}
					} else {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static357.method4826(anIntArray333[--anInt4908]);
						} else {
							local137 = arg1 ? aClass261_4 : aClass261_5;
						}
						if (arg0 == 1300) {
							local19 = anIntArray333[--anInt4908] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method5641(local19, aStringArray25[--anInt4906]);
								return;
							}
							anInt4906--;
							return;
						}
						if (arg0 == 1301) {
							anInt4908 -= 2;
							local19 = anIntArray333[anInt4908];
							local25 = anIntArray333[anInt4908 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass261_8 = null;
								return;
							}
							local137.aClass261_8 = Static98.method1508(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray333[--anInt4908];
							if (local19 != Static200.anInt3397 && local19 != Static126.anInt2200 && local19 != Static136.anInt9999) {
								return;
							}
							local137.anInt6646 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt6640 = anIntArray333[--anInt4908];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt6588 = anIntArray333[--anInt4908];
							return;
						}
						if (arg0 == 1305) {
							local137.aString90 = aStringArray25[--anInt4906];
							return;
						}
						if (arg0 == 1306) {
							local137.aString94 = aStringArray25[--anInt4906];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray35 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt6589 = anIntArray333[--anInt4908];
							local137.anInt6641 = anIntArray333[--anInt4908];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray333[--anInt4908];
							local25 = anIntArray333[--anInt4908];
							if (local25 >= 1 && local25 <= 10) {
								local137.method5625(local19, local25 - 1);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString92 = aStringArray25[--anInt4906];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt6618 = anIntArray333[--anInt4908];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt4908 -= 3;
								local19 = anIntArray333[anInt4908] - 1;
								local25 = anIntArray333[anInt4908 + 1];
								local353 = anIntArray333[anInt4908 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt4908 -= 2;
								local19 = 10;
								local25 = anIntArray333[anInt4908];
								local353 = anIntArray333[anInt4908 + 1];
							}
							if (local137.aByteArray84 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray84 = new byte[11];
								local137.aByteArray83 = new byte[11];
								local137.anIntArray492 = new int[11];
							}
							local137.aByteArray84[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean478 = false;
								for (local2357 = 0; local2357 < local137.aByteArray84.length; local2357++) {
									if (local137.aByteArray84[local2357] != 0) {
										local137.aBoolean478 = true;
										break;
									}
								}
							} else {
								local137.aBoolean478 = true;
							}
							local137.aByteArray83[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt6596 = anIntArray333[--anInt4908];
							return;
						}
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(IZ)V")
	private static void method4142(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(83) String local83;
		@Pc(1496) boolean local1496;
		@Pc(97) int local97;
		@Pc(175) int local175;
		@Pc(776) int local776;
		@Pc(181) String local181;
		@Pc(103) int local103;
		@Pc(52) Class2_Sub40 local52;
		@Pc(89) String local89;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray333[anInt4908++] = Static633.anInt10152;
				return;
			}
			if (arg0 == 5001) {
				anInt4908 -= 3;
				Static633.anInt10152 = anIntArray333[anInt4908];
				Static563.aClass45_4 = Static293.method4046(anIntArray333[anInt4908 + 1]);
				if (Static563.aClass45_4 == null) {
					Static563.aClass45_4 = Static305.aClass45_2;
				}
				Static134.anInt2258 = anIntArray333[anInt4908 + 2];
				local52 = Static464.method6285(Static251.aClass131_1, Static403.aClass179_87);
				local52.aClass2_Sub22_Sub2_2.method8537(Static633.anInt10152);
				local52.aClass2_Sub22_Sub2_2.method8537(Static563.aClass45_4.anInt1158);
				local52.aClass2_Sub22_Sub2_2.method8537(Static134.anInt2258);
				Static528.method7295(local52);
				return;
			}
			if (arg0 == 5002) {
				anInt4906 -= 2;
				local83 = aStringArray25[anInt4906];
				local89 = aStringArray25[anInt4906 + 1];
				anInt4908 -= 2;
				local97 = anIntArray333[anInt4908];
				local103 = anIntArray333[anInt4908 + 1];
				if (local89 == null) {
					local89 = "";
				}
				if (local89.length() > 80) {
					local89 = local89.substring(0, 80);
				}
				@Pc(125) Class2_Sub40 local125 = Static464.method6285(Static251.aClass131_1, Static425.aClass179_92);
				local125.aClass2_Sub22_Sub2_2.method8537(Static154.method2286(local83) + Static154.method2286(local89) + 2);
				local125.aClass2_Sub22_Sub2_2.method8540(local83);
				local125.aClass2_Sub22_Sub2_2.method8537(local97 - 1);
				local125.aClass2_Sub22_Sub2_2.method8537(local103);
				local125.aClass2_Sub22_Sub2_2.method8540(local89);
				Static528.method7295(local125);
				return;
			}
			@Pc(179) Class25 local179;
			if (arg0 == 5003) {
				local175 = anIntArray333[--anInt4908];
				local179 = Static7.method109(local175);
				local181 = "";
				if (local179 != null && local179.aString7 != null) {
					local181 = local179.aString7;
				}
				aStringArray25[anInt4906++] = local181;
				return;
			}
			if (arg0 == 5004) {
				local175 = anIntArray333[--anInt4908];
				local179 = Static7.method109(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt725;
				}
				anIntArray333[anInt4908++] = local97;
				return;
			}
			if (arg0 == 5005) {
				if (Static563.aClass45_4 == null) {
					anIntArray333[anInt4908++] = -1;
					return;
				}
				anIntArray333[anInt4908++] = Static563.aClass45_4.anInt1158;
				return;
			}
			@Pc(269) Class2_Sub40 local269;
			if (arg0 == 5006) {
				local175 = anIntArray333[--anInt4908];
				local269 = Static464.method6285(Static251.aClass131_1, Static624.aClass179_130);
				local269.aClass2_Sub22_Sub2_2.method8537(local175);
				Static528.method7295(local269);
				return;
			}
			if (arg0 == 5008) {
				local83 = aStringArray25[--anInt4906];
				method4146(local83, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt4906 -= 2;
				local83 = aStringArray25[anInt4906];
				local89 = aStringArray25[anInt4906 + 1];
				if (Static165.anInt5949 != 0 || (!Static416.aBoolean461 || Static463.aBoolean554) && !Static32.aBoolean58) {
					@Pc(328) Class2_Sub40 local328 = Static464.method6285(Static251.aClass131_1, Static175.aClass179_46);
					local328.aClass2_Sub22_Sub2_2.method8537(0);
					local103 = local328.aClass2_Sub22_Sub2_2.anInt10247;
					local328.aClass2_Sub22_Sub2_2.method8540(local83);
					Static621.method8308(local328.aClass2_Sub22_Sub2_2, local89);
					local328.aClass2_Sub22_Sub2_2.method8514(local328.aClass2_Sub22_Sub2_2.anInt10247 - local103);
					Static528.method7295(local328);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local175 = anIntArray333[--anInt4908];
				local179 = Static7.method109(local175);
				local181 = "";
				if (local179 != null && local179.aString6 != null) {
					local181 = local179.aString6;
				}
				aStringArray25[anInt4906++] = local181;
				return;
			}
			if (arg0 == 5011) {
				local175 = anIntArray333[--anInt4908];
				local179 = Static7.method109(local175);
				local181 = "";
				if (local179 != null && local179.aString4 != null) {
					local181 = local179.aString4;
				}
				aStringArray25[anInt4906++] = local181;
				return;
			}
			if (arg0 == 5012) {
				local175 = anIntArray333[--anInt4908];
				local179 = Static7.method109(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt721;
				}
				anIntArray333[anInt4908++] = local97;
				return;
			}
			if (arg0 == 5015) {
				if (Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1 == null || Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aString49 == null) {
					local83 = "";
				} else {
					local83 = Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.method3977();
				}
				aStringArray25[anInt4906++] = local83;
				return;
			}
			if (arg0 == 5016) {
				anIntArray333[anInt4908++] = Static134.anInt2258;
				return;
			}
			if (arg0 == 5017) {
				anIntArray333[anInt4908++] = Static156.method2319();
				return;
			}
			if (arg0 == 5018) {
				local175 = anIntArray333[--anInt4908];
				local179 = Static7.method109(local175);
				local97 = 0;
				if (local179 != null) {
					local97 = local179.anInt718;
				}
				anIntArray333[anInt4908++] = local97;
				return;
			}
			if (arg0 == 5019) {
				local175 = anIntArray333[--anInt4908];
				local179 = Static7.method109(local175);
				local181 = "";
				if (local179 != null && local179.aString5 != null) {
					local181 = local179.aString5;
				}
				aStringArray25[anInt4906++] = local181;
				return;
			}
			if (arg0 == 5020) {
				if (Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1 == null || Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aString49 == null) {
					local83 = "";
				} else {
					local83 = Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.method3978();
				}
				aStringArray25[anInt4906++] = local83;
				return;
			}
			if (arg0 == 5023) {
				local175 = anIntArray333[--anInt4908];
				local179 = Static7.method109(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt723;
				}
				anIntArray333[anInt4908++] = local97;
				return;
			}
			if (arg0 == 5024) {
				local175 = anIntArray333[--anInt4908];
				local179 = Static7.method109(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt720;
				}
				anIntArray333[anInt4908++] = local97;
				return;
			}
			if (arg0 == 5025) {
				local175 = anIntArray333[--anInt4908];
				local179 = Static7.method109(local175);
				local181 = "";
				if (local179 != null && local179.aString3 != null) {
					local181 = local179.aString3;
				}
				aStringArray25[anInt4906++] = local181;
				return;
			}
			if (arg0 == 5050) {
				local175 = anIntArray333[--anInt4908];
				aStringArray25[anInt4906++] = Static320.aClass230_1.method4940(local175).aString74;
				return;
			}
			@Pc(736) Class2_Sub2_Sub14 local736;
			if (arg0 == 5051) {
				local175 = anIntArray333[--anInt4908];
				local736 = Static320.aClass230_1.method4940(local175);
				if (local736.anIntArray416 == null) {
					anIntArray333[anInt4908++] = 0;
					return;
				}
				anIntArray333[anInt4908++] = local736.anIntArray416.length;
				return;
			}
			if (arg0 == 5052) {
				anInt4908 -= 2;
				local175 = anIntArray333[anInt4908];
				local776 = anIntArray333[anInt4908 + 1];
				@Pc(781) Class2_Sub2_Sub14 local781 = Static320.aClass230_1.method4940(local175);
				local103 = local781.anIntArray416[local776];
				anIntArray333[anInt4908++] = local103;
				return;
			}
			if (arg0 == 5053) {
				local175 = anIntArray333[--anInt4908];
				local736 = Static320.aClass230_1.method4940(local175);
				if (local736.anIntArray415 == null) {
					anIntArray333[anInt4908++] = 0;
					return;
				}
				anIntArray333[anInt4908++] = local736.anIntArray415.length;
				return;
			}
			if (arg0 == 5054) {
				anInt4908 -= 2;
				local175 = anIntArray333[anInt4908];
				local776 = anIntArray333[anInt4908 + 1];
				anIntArray333[anInt4908++] = Static320.aClass230_1.method4940(local175).anIntArray415[local776];
				return;
			}
			if (arg0 == 5055) {
				local175 = anIntArray333[--anInt4908];
				aStringArray25[anInt4906++] = Static295.aClass362_2.method8112(local175).method3157();
				return;
			}
			if (arg0 == 5056) {
				local175 = anIntArray333[--anInt4908];
				@Pc(907) Class2_Sub2_Sub10 local907 = Static295.aClass362_2.method8112(local175);
				if (local907.anIntArray255 == null) {
					anIntArray333[anInt4908++] = 0;
					return;
				}
				anIntArray333[anInt4908++] = local907.anIntArray255.length;
				return;
			}
			if (arg0 == 5057) {
				anInt4908 -= 2;
				local175 = anIntArray333[anInt4908];
				local776 = anIntArray333[anInt4908 + 1];
				anIntArray333[anInt4908++] = Static295.aClass362_2.method8112(local175).anIntArray255[local776];
				return;
			}
			if (arg0 == 5058) {
				aClass379_1 = new Class379();
				aClass379_1.anInt10329 = anIntArray333[--anInt4908];
				aClass379_1.aClass2_Sub2_Sub10_1 = Static295.aClass362_2.method8112(aClass379_1.anInt10329);
				aClass379_1.anIntArray696 = new int[aClass379_1.aClass2_Sub2_Sub10_1.method3152()];
				return;
			}
			if (arg0 == 5059) {
				local52 = Static464.method6285(Static251.aClass131_1, Static414.aClass179_88);
				local52.aClass2_Sub22_Sub2_2.method8537(0);
				local776 = local52.aClass2_Sub22_Sub2_2.anInt10247;
				local52.aClass2_Sub22_Sub2_2.method8537(0);
				local52.aClass2_Sub22_Sub2_2.method8500(aClass379_1.anInt10329);
				aClass379_1.aClass2_Sub2_Sub10_1.method3149(aClass379_1.anIntArray696, local52.aClass2_Sub22_Sub2_2);
				local52.aClass2_Sub22_Sub2_2.method8514(local52.aClass2_Sub22_Sub2_2.anInt10247 - local776);
				Static528.method7295(local52);
				return;
			}
			if (arg0 == 5060) {
				local83 = aStringArray25[--anInt4906];
				local269 = Static464.method6285(Static251.aClass131_1, Static233.aClass179_54);
				local269.aClass2_Sub22_Sub2_2.method8537(0);
				local97 = local269.aClass2_Sub22_Sub2_2.anInt10247;
				local269.aClass2_Sub22_Sub2_2.method8540(local83);
				local269.aClass2_Sub22_Sub2_2.method8500(aClass379_1.anInt10329);
				aClass379_1.aClass2_Sub2_Sub10_1.method3149(aClass379_1.anIntArray696, local269.aClass2_Sub22_Sub2_2);
				local269.aClass2_Sub22_Sub2_2.method8514(local269.aClass2_Sub22_Sub2_2.anInt10247 - local97);
				Static528.method7295(local269);
				return;
			}
			if (arg0 == 5061) {
				local52 = Static464.method6285(Static251.aClass131_1, Static414.aClass179_88);
				local52.aClass2_Sub22_Sub2_2.method8537(0);
				local776 = local52.aClass2_Sub22_Sub2_2.anInt10247;
				local52.aClass2_Sub22_Sub2_2.method8537(1);
				local52.aClass2_Sub22_Sub2_2.method8500(aClass379_1.anInt10329);
				aClass379_1.aClass2_Sub2_Sub10_1.method3149(aClass379_1.anIntArray696, local52.aClass2_Sub22_Sub2_2);
				local52.aClass2_Sub22_Sub2_2.method8514(local52.aClass2_Sub22_Sub2_2.anInt10247 - local776);
				Static528.method7295(local52);
				return;
			}
			if (arg0 == 5062) {
				anInt4908 -= 2;
				local175 = anIntArray333[anInt4908];
				local776 = anIntArray333[anInt4908 + 1];
				anIntArray333[anInt4908++] = Static320.aClass230_1.method4940(local175).aCharArray5[local776];
				return;
			}
			if (arg0 == 5063) {
				anInt4908 -= 2;
				local175 = anIntArray333[anInt4908];
				local776 = anIntArray333[anInt4908 + 1];
				anIntArray333[anInt4908++] = Static320.aClass230_1.method4940(local175).aCharArray4[local776];
				return;
			}
			if (arg0 == 5064) {
				anInt4908 -= 2;
				local175 = anIntArray333[anInt4908];
				local776 = anIntArray333[anInt4908 + 1];
				if (local776 == -1) {
					anIntArray333[anInt4908++] = -1;
					return;
				}
				anIntArray333[anInt4908++] = Static320.aClass230_1.method4940(local175).method4889((char) local776);
				return;
			}
			if (arg0 == 5065) {
				anInt4908 -= 2;
				local175 = anIntArray333[anInt4908];
				local776 = anIntArray333[anInt4908 + 1];
				if (local776 == -1) {
					anIntArray333[anInt4908++] = -1;
					return;
				}
				anIntArray333[anInt4908++] = Static320.aClass230_1.method4940(local175).method4884((char) local776);
				return;
			}
			if (arg0 == 5066) {
				local175 = anIntArray333[--anInt4908];
				anIntArray333[anInt4908++] = Static295.aClass362_2.method8112(local175).method3152();
				return;
			}
			if (arg0 == 5067) {
				anInt4908 -= 2;
				local175 = anIntArray333[anInt4908];
				local776 = anIntArray333[anInt4908 + 1];
				local97 = Static295.aClass362_2.method8112(local175).method3151(local776).anInt5480;
				anIntArray333[anInt4908++] = local97;
				return;
			}
			if (arg0 == 5068) {
				anInt4908 -= 2;
				local175 = anIntArray333[anInt4908];
				local776 = anIntArray333[anInt4908 + 1];
				aClass379_1.anIntArray696[local175] = local776;
				return;
			}
			if (arg0 == 5069) {
				anInt4908 -= 2;
				local175 = anIntArray333[anInt4908];
				local776 = anIntArray333[anInt4908 + 1];
				aClass379_1.anIntArray696[local175] = local776;
				return;
			}
			if (arg0 == 5070) {
				anInt4908 -= 3;
				local175 = anIntArray333[anInt4908];
				local776 = anIntArray333[anInt4908 + 1];
				local97 = anIntArray333[anInt4908 + 2];
				@Pc(1448) Class2_Sub2_Sub10 local1448 = Static295.aClass362_2.method8112(local175);
				if (local1448.method3151(local776).anInt5480 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray333[anInt4908++] = local1448.method3153(local97, local776);
				return;
			}
			if (arg0 == 5071) {
				local83 = aStringArray25[--anInt4906];
				local1496 = anIntArray333[--anInt4908] == 1;
				Static213.method2957(local83, local1496);
				anIntArray333[anInt4908++] = Static129.anInt8997;
				return;
			}
			if (arg0 == 5072) {
				if (Static354.aShortArray80 != null && Static330.anInt6459 < Static129.anInt8997) {
					anIntArray333[anInt4908++] = Static354.aShortArray80[Static330.anInt6459++] & 0xFFFF;
					return;
				}
				anIntArray333[anInt4908++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static330.anInt6459 = 0;
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static16.aClass167_1.method3544(86)) {
					anIntArray333[anInt4908++] = 1;
					return;
				}
				anIntArray333[anInt4908++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static16.aClass167_1.method3544(82)) {
					anIntArray333[anInt4908++] = 1;
					return;
				}
				anIntArray333[anInt4908++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static16.aClass167_1.method3544(81)) {
					anIntArray333[anInt4908++] = 1;
					return;
				}
				anIntArray333[anInt4908++] = 0;
				return;
			}
		} else {
			@Pc(2833) int local2833;
			@Pc(2107) boolean local2107;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static514.method7203(anIntArray333[--anInt4908]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray333[anInt4908++] = Static60.method908();
					return;
				}
				if (arg0 == 5205) {
					Static545.method7522(anIntArray333[--anInt4908], -1, -1, false);
					return;
				}
				@Pc(1696) Class2_Sub2_Sub9 local1696;
				if (arg0 == 5206) {
					local175 = anIntArray333[--anInt4908];
					local1696 = Static193.method1286(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					if (local1696 == null) {
						anIntArray333[anInt4908++] = -1;
						return;
					}
					anIntArray333[anInt4908++] = local1696.anInt2906;
					return;
				}
				@Pc(1729) Class2_Sub2_Sub9 local1729;
				if (arg0 == 5207) {
					local1729 = Static193.method1297(anIntArray333[--anInt4908]);
					if (local1729 != null && local1729.aString26 != null) {
						aStringArray25[anInt4906++] = local1729.aString26;
						return;
					}
					aStringArray25[anInt4906++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray333[anInt4908++] = Static540.anInt8852;
					anIntArray333[anInt4908++] = Static122.anInt2173;
					return;
				}
				if (arg0 == 5209) {
					anIntArray333[anInt4908++] = Static40.anInt794 + Static193.anInt1548;
					anIntArray333[anInt4908++] = Static347.anInt5452 + Static193.anInt1551;
					return;
				}
				if (arg0 == 5210) {
					local175 = anIntArray333[--anInt4908];
					local1696 = Static193.method1297(local175);
					if (local1696 == null) {
						anIntArray333[anInt4908++] = 0;
						anIntArray333[anInt4908++] = 0;
						return;
					}
					anIntArray333[anInt4908++] = local1696.anInt2895 >> 14 & 0x3FFF;
					anIntArray333[anInt4908++] = local1696.anInt2895 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local175 = anIntArray333[--anInt4908];
					local1696 = Static193.method1297(local175);
					if (local1696 == null) {
						anIntArray333[anInt4908++] = 0;
						anIntArray333[anInt4908++] = 0;
						return;
					}
					anIntArray333[anInt4908++] = local1696.anInt2892 - local1696.anInt2897;
					anIntArray333[anInt4908++] = local1696.anInt2903 - local1696.anInt2899;
					return;
				}
				@Pc(1919) Class2_Sub14 local1919;
				if (arg0 == 5212) {
					local1919 = Static525.method5093();
					if (local1919 == null) {
						anIntArray333[anInt4908++] = -1;
						anIntArray333[anInt4908++] = -1;
						return;
					}
					anIntArray333[anInt4908++] = local1919.anInt3128;
					local776 = local1919.anInt3129 << 28 | local1919.anInt3133 + Static193.anInt1548 << 14 | local1919.anInt3126 + Static193.anInt1551;
					anIntArray333[anInt4908++] = local776;
					return;
				}
				if (arg0 == 5213) {
					local1919 = Static248.method3410();
					if (local1919 == null) {
						anIntArray333[anInt4908++] = -1;
						anIntArray333[anInt4908++] = -1;
						return;
					}
					anIntArray333[anInt4908++] = local1919.anInt3128;
					local776 = local1919.anInt3129 << 28 | local1919.anInt3133 + Static193.anInt1548 << 14 | local1919.anInt3126 + Static193.anInt1551;
					anIntArray333[anInt4908++] = local776;
					return;
				}
				@Pc(2067) boolean local2067;
				if (arg0 == 5214) {
					local175 = anIntArray333[--anInt4908];
					local1696 = Static242.method3402();
					if (local1696 != null) {
						local2067 = local1696.method2428(anIntArray334, local175 >> 28 & 0x3, local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
						if (local2067) {
							Static196.method2805(anIntArray334[2], anIntArray334[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt4908 -= 2;
					local175 = anIntArray333[anInt4908];
					local776 = anIntArray333[anInt4908 + 1];
					@Pc(2105) Class75 local2105 = Static193.method1292(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					local2107 = false;
					for (@Pc(2112) Class2_Sub2_Sub9 local2112 = (Class2_Sub2_Sub9) local2105.method1573(); local2112 != null; local2112 = (Class2_Sub2_Sub9) local2105.method1568()) {
						if (local2112.anInt2906 == local776) {
							local2107 = true;
							break;
						}
					}
					if (local2107) {
						anIntArray333[anInt4908++] = 1;
						return;
					}
					anIntArray333[anInt4908++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local175 = anIntArray333[--anInt4908];
					local1696 = Static193.method1297(local175);
					if (local1696 == null) {
						anIntArray333[anInt4908++] = -1;
						return;
					}
					anIntArray333[anInt4908++] = local1696.anInt2900;
					return;
				}
				if (arg0 == 5220) {
					anIntArray333[anInt4908++] = Static619.anInt9953 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local175 = anIntArray333[--anInt4908];
					Static196.method2805(local175 & 0x3FFF, local175 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1729 = Static242.method3402();
					if (local1729 != null) {
						local1496 = local1729.method2425(Static347.anInt5452 + Static193.anInt1551, anIntArray334, Static40.anInt794 + Static193.anInt1548);
						if (local1496) {
							anIntArray333[anInt4908++] = anIntArray334[1];
							anIntArray333[anInt4908++] = anIntArray334[2];
							return;
						}
						anIntArray333[anInt4908++] = -1;
						anIntArray333[anInt4908++] = -1;
						return;
					}
					anIntArray333[anInt4908++] = -1;
					anIntArray333[anInt4908++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt4908 -= 2;
					local175 = anIntArray333[anInt4908];
					local776 = anIntArray333[anInt4908 + 1];
					Static545.method7522(local175, local776 >> 14 & 0x3FFF, local776 & 0x3FFF, false);
					return;
				}
				if (arg0 == 5224) {
					local175 = anIntArray333[--anInt4908];
					local1696 = Static242.method3402();
					if (local1696 != null) {
						local2067 = local1696.method2428(anIntArray334, local175 >> 28 & 0x3, local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
						if (local2067) {
							anIntArray333[anInt4908++] = anIntArray334[1];
							anIntArray333[anInt4908++] = anIntArray334[2];
							return;
						}
						anIntArray333[anInt4908++] = -1;
						anIntArray333[anInt4908++] = -1;
						return;
					}
					anIntArray333[anInt4908++] = -1;
					anIntArray333[anInt4908++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local175 = anIntArray333[--anInt4908];
					local1696 = Static242.method3402();
					if (local1696 != null) {
						local2067 = local1696.method2425(local175 & 0x3FFF, anIntArray334, local175 >> 14 & 0x3FFF);
						if (local2067) {
							anIntArray333[anInt4908++] = anIntArray334[1];
							anIntArray333[anInt4908++] = anIntArray334[2];
							return;
						}
						anIntArray333[anInt4908++] = -1;
						anIntArray333[anInt4908++] = -1;
						return;
					}
					anIntArray333[anInt4908++] = -1;
					anIntArray333[anInt4908++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static539.method7447(anIntArray333[--anInt4908]);
					return;
				}
				if (arg0 == 5227) {
					anInt4908 -= 2;
					local175 = anIntArray333[anInt4908];
					local776 = anIntArray333[anInt4908 + 1];
					Static545.method7522(local175, local776 >> 14 & 0x3FFF, local776 & 0x3FFF, true);
					return;
				}
				if (arg0 == 5228) {
					Static230.aBoolean265 = anIntArray333[--anInt4908] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray333[anInt4908++] = Static230.aBoolean265 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local175 = anIntArray333[--anInt4908];
					Static410.method5506(local175);
					return;
				}
				@Pc(2625) Class2 local2625;
				if (arg0 == 5231) {
					anInt4908 -= 2;
					local175 = anIntArray333[anInt4908];
					local1496 = anIntArray333[anInt4908 + 1] == 1;
					if (Static523.aClass118_45 != null) {
						local2625 = Static523.aClass118_45.method2595((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method8653();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class2();
							Static523.aClass118_45.method2601(local2625, (long) local175);
						}
					}
					return;
				}
				@Pc(2667) Class2 local2667;
				if (arg0 == 5232) {
					local175 = anIntArray333[--anInt4908];
					if (Static523.aClass118_45 != null) {
						local2667 = Static523.aClass118_45.method2595((long) local175);
						anIntArray333[anInt4908++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray333[anInt4908++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt4908 -= 2;
					local175 = anIntArray333[anInt4908];
					local1496 = anIntArray333[anInt4908 + 1] == 1;
					if (Static432.aClass118_40 != null) {
						local2625 = Static432.aClass118_40.method2595((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method8653();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class2();
							Static432.aClass118_40.method2601(local2625, (long) local175);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local175 = anIntArray333[--anInt4908];
					if (Static432.aClass118_40 != null) {
						local2667 = Static432.aClass118_40.method2595((long) local175);
						anIntArray333[anInt4908++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray333[anInt4908++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray333[anInt4908++] = Static193.aClass2_Sub2_Sub9_3 == null ? -1 : Static193.aClass2_Sub2_Sub9_3.anInt2906;
					return;
				}
				if (arg0 == 5236) {
					anInt4908 -= 2;
					local175 = anIntArray333[anInt4908];
					local776 = anIntArray333[anInt4908 + 1];
					local97 = local776 >> 14 & 0x3FFF;
					local103 = local776 & 0x3FFF;
					local2833 = Static586.method8003(local103, local97, local175);
					if (local2833 < 0) {
						anIntArray333[anInt4908++] = -1;
						return;
					}
					anIntArray333[anInt4908++] = local2833;
					return;
				}
				if (arg0 == 5237) {
					Static493.method6855();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt4908 -= 2;
					local175 = anIntArray333[anInt4908];
					local776 = anIntArray333[anInt4908 + 1];
					Static424.method5664(false, local175, local776, 3);
					anIntArray333[anInt4908++] = Static298.aFrame3 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static298.aFrame3 != null) {
						Static424.method5664(false, -1, -1, Static234.aClass2_Sub5_48.aClass6_Sub28_1.method8437());
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2919) Class210[] local2919 = Static1.method7735();
					anIntArray333[anInt4908++] = local2919.length;
					return;
				}
				if (arg0 == 5303) {
					local175 = anIntArray333[--anInt4908];
					@Pc(2943) Class210[] local2943 = Static1.method7735();
					anIntArray333[anInt4908++] = local2943[local175].anInt5212;
					anIntArray333[anInt4908++] = local2943[local175].anInt5208;
					return;
				}
				if (arg0 == 5305) {
					local175 = Static454.anInt7345;
					local776 = Static365.anInt5779;
					local97 = -1;
					@Pc(2978) Class210[] local2978 = Static1.method7735();
					for (local2833 = 0; local2833 < local2978.length; local2833++) {
						@Pc(2985) Class210 local2985 = local2978[local2833];
						if (local2985.anInt5212 == local175 && local2985.anInt5208 == local776) {
							local97 = local2833;
							break;
						}
					}
					anIntArray333[anInt4908++] = local97;
					return;
				}
				if (arg0 == 5306) {
					anIntArray333[anInt4908++] = Static626.method8388();
					return;
				}
				if (arg0 == 5307) {
					local175 = anIntArray333[--anInt4908];
					if (local175 >= 1 && local175 <= 2) {
						Static424.method5664(false, -1, -1, local175);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub28_1.method8437();
					return;
				}
				if (arg0 == 5309) {
					local175 = anIntArray333[--anInt4908];
					if (local175 >= 1 && local175 <= 2) {
						Static234.aClass2_Sub5_48.method176(local175, Static234.aClass2_Sub5_48.aClass6_Sub28_1);
						Static234.aClass2_Sub5_48.method176(local175, Static234.aClass2_Sub5_48.aClass6_Sub28_2);
						Static329.method4407();
						return;
					}
					return;
				}
			} else if (arg0 < 5500) {
				if (arg0 == 5400) {
					anInt4906 -= 2;
					local83 = aStringArray25[anInt4906];
					local89 = aStringArray25[anInt4906 + 1];
					local97 = anIntArray333[--anInt4908];
					@Pc(3133) Class2_Sub40 local3133 = Static464.method6285(Static251.aClass131_1, Static90.aClass179_22);
					local3133.aClass2_Sub22_Sub2_2.method8537(Static154.method2286(local83) + Static154.method2286(local89) + 1);
					local3133.aClass2_Sub22_Sub2_2.method8540(local83);
					local3133.aClass2_Sub22_Sub2_2.method8540(local89);
					local3133.aClass2_Sub22_Sub2_2.method8537(local97);
					Static528.method7295(local3133);
					return;
				}
				if (arg0 == 5401) {
					anInt4908 -= 2;
					Static448.aShortArray92[anIntArray333[anInt4908]] = (short) Static117.method1727(anIntArray333[anInt4908 + 1]);
					Static72.aClass225_2.method4786();
					Static72.aClass225_2.method4783();
					Static409.aClass107_2.method2284();
					Static32.method574();
					return;
				}
				if (arg0 == 5405) {
					anInt4908 -= 2;
					local175 = anIntArray333[anInt4908];
					local776 = anIntArray333[anInt4908 + 1];
					if (local175 >= 0 && local175 < 2) {
						Static543.anIntArrayArrayArray19[local175] = new int[local776 << 1][4];
					}
					return;
				}
				if (arg0 == 5406) {
					anInt4908 -= 7;
					local175 = anIntArray333[anInt4908];
					local776 = anIntArray333[anInt4908 + 1] << 1;
					local97 = anIntArray333[anInt4908 + 2];
					local103 = anIntArray333[anInt4908 + 3];
					local2833 = anIntArray333[anInt4908 + 4];
					@Pc(3271) int local3271 = anIntArray333[anInt4908 + 5];
					@Pc(3277) int local3277 = anIntArray333[anInt4908 + 6];
					if (local175 >= 0 && local175 < 2 && Static543.anIntArrayArrayArray19[local175] != null && local776 >= 0 && local776 < Static543.anIntArrayArrayArray19[local175].length) {
						Static543.anIntArrayArrayArray19[local175][local776] = new int[] { (local97 >> 14 & 0x3FFF) << 9, local103 << 2, (local97 & 0x3FFF) << 9, local3277 };
						Static543.anIntArrayArrayArray19[local175][local776 + 1] = new int[] { (local2833 >> 14 & 0x3FFF) << 9, local3271 << 2, (local2833 & 0x3FFF) << 9 };
					}
					return;
				}
				if (arg0 == 5407) {
					local175 = Static543.anIntArrayArrayArray19[anIntArray333[--anInt4908]].length >> 1;
					anIntArray333[anInt4908++] = local175;
					return;
				}
				if (arg0 == 5411) {
					if (Static298.aFrame3 != null) {
						Static424.method5664(false, -1, -1, Static234.aClass2_Sub5_48.aClass6_Sub28_1.method8437());
					}
					if (Static202.aFrame2 != null) {
						Static202.method2859();
						System.exit(0);
						return;
					}
					local83 = Static58.aString12 == null ? Static188.method2728() : Static58.aString12;
					Static407.method7597(Static234.aClass2_Sub5_48.aClass6_Sub21_2.method7280() == 1, false, local83, Static452.aClass226_6);
					return;
				}
				if (arg0 == 5419) {
					local83 = "";
					if (Static224.aClass108_4 != null) {
						if (Static224.aClass108_4.anObject6 == null) {
							local83 = Static579.method6867(Static224.aClass108_4.anInt2765);
						} else {
							local83 = (String) Static224.aClass108_4.anObject6;
						}
					}
					aStringArray25[anInt4906++] = local83;
					return;
				}
				if (arg0 == 5420) {
					anIntArray333[anInt4908++] = Static452.aClass226_6.aBoolean416 ? 0 : 1;
					return;
				}
				if (arg0 == 5421) {
					if (Static298.aFrame3 != null) {
						Static424.method5664(false, -1, -1, Static234.aClass2_Sub5_48.aClass6_Sub28_1.method8437());
					}
					local83 = aStringArray25[--anInt4906];
					local1496 = anIntArray333[--anInt4908] == 1;
					local181 = Static188.method2728() + local83;
					Static407.method7597(Static234.aClass2_Sub5_48.aClass6_Sub21_2.method7280() == 1, local1496, local181, Static452.aClass226_6);
					return;
				}
				if (arg0 == 5422) {
					anInt4906 -= 2;
					local83 = aStringArray25[anInt4906];
					local89 = aStringArray25[anInt4906 + 1];
					local97 = anIntArray333[--anInt4908];
					if (local83.length() > 0) {
						if (Static427.aStringArray36 == null) {
							Static427.aStringArray36 = new String[Static72.anIntArray99[Static189.aClass375_5.anInt10144]];
						}
						Static427.aStringArray36[local97] = local83;
					}
					if (local89.length() > 0) {
						if (Static138.aStringArray10 == null) {
							Static138.aStringArray10 = new String[Static72.anIntArray99[Static189.aClass375_5.anInt10144]];
						}
						Static138.aStringArray10[local97] = local89;
					}
					return;
				}
				if (arg0 == 5423) {
					System.out.println(aStringArray25[--anInt4906]);
					return;
				}
				if (arg0 == 5424) {
					anInt4908 -= 11;
					Static25.anInt580 = anIntArray333[anInt4908];
					Static90.anInt1698 = anIntArray333[anInt4908 + 1];
					Static309.anInt4983 = anIntArray333[anInt4908 + 2];
					Static544.anInt9304 = anIntArray333[anInt4908 + 3];
					Static529.anInt8677 = anIntArray333[anInt4908 + 4];
					Static273.anInt4380 = anIntArray333[anInt4908 + 5];
					Static220.anInt3595 = anIntArray333[anInt4908 + 6];
					Static175.anInt3082 = anIntArray333[anInt4908 + 7];
					Static368.anInt5823 = anIntArray333[anInt4908 + 8];
					Static565.anInt9214 = anIntArray333[anInt4908 + 9];
					Static413.anInt6426 = anIntArray333[anInt4908 + 10];
					Static79.aClass380_22.method8638(Static529.anInt8677);
					Static79.aClass380_22.method8638(Static273.anInt4380);
					Static79.aClass380_22.method8638(Static220.anInt3595);
					Static79.aClass380_22.method8638(Static175.anInt3082);
					Static79.aClass380_22.method8638(Static368.anInt5823);
					Static613.aClass61_34 = null;
					Static264.aClass61_17 = null;
					Static167.aClass61_5 = null;
					Static553.aClass61_33 = null;
					Static491.aClass61_27 = null;
					Static121.aClass61_4 = null;
					Static375.aClass61_18 = null;
					Static169.aClass61_6 = null;
					Static500.aBoolean612 = true;
					return;
				}
				if (arg0 == 5425) {
					Static352.method4709();
					Static500.aBoolean612 = false;
					return;
				}
				if (arg0 == 5426) {
					anInt4908 -= 2;
					Static473.anInt7592 = anIntArray333[anInt4908];
					Static141.anInt2605 = anIntArray333[anInt4908 + 1];
					return;
				}
				if (arg0 == 5427) {
					anInt4908 -= 2;
					Static377.anInt5908 = anIntArray333[anInt4908 + 1];
					return;
				}
				if (arg0 == 5428) {
					anInt4908 -= 2;
					local175 = anIntArray333[anInt4908];
					local776 = anIntArray333[anInt4908 + 1];
					anIntArray333[anInt4908++] = Static1.method7734(local776, local175) ? 1 : 0;
					return;
				}
				if (arg0 == 5429) {
					Static542.method7480(false, aStringArray25[--anInt4906], false);
					return;
				}
				if (arg0 == 5430) {
					try {
						Static651.method4296("accountcreated", Static617.anApplet2);
						return;
					} catch (@Pc(3819) Throwable local3819) {
						return;
					}
				}
				if (arg0 == 5431) {
					try {
						Static651.method4296("accountcreatestarted", Static617.anApplet2);
						return;
					} catch (@Pc(3830) Throwable local3830) {
						return;
					}
				}
				if (arg0 == 5432) {
					local83 = "";
					if (Static486.aClipboard1 != null) {
						@Pc(3842) Transferable local3842 = Static486.aClipboard1.getContents(null);
						if (local3842 != null) {
							try {
								local83 = (String) local3842.getTransferData(DataFlavor.stringFlavor);
								if (local83 == null) {
									local83 = "";
								}
							} catch (@Pc(3855) Exception local3855) {
							}
						}
					}
					aStringArray25[anInt4906++] = local83;
					return;
				}
				if (arg0 == 5433) {
					Static464.anInt7433 = anIntArray333[--anInt4908];
					return;
				}
			} else if (arg0 < 5600) {
				if (arg0 == 5500) {
					anInt4908 -= 4;
					local175 = anIntArray333[anInt4908];
					local776 = anIntArray333[anInt4908 + 1];
					local97 = anIntArray333[anInt4908 + 2];
					local103 = anIntArray333[anInt4908 + 3];
					Static88.method1313((local175 & 0x3FFF) - Static123.anInt2176, local776 << 2, local103, false, local97, (local175 >> 14 & 0x3FFF) - Static132.anInt2246);
					return;
				}
				if (arg0 == 5501) {
					anInt4908 -= 4;
					local175 = anIntArray333[anInt4908];
					local776 = anIntArray333[anInt4908 + 1];
					local97 = anIntArray333[anInt4908 + 2];
					local103 = anIntArray333[anInt4908 + 3];
					Static167.method2470(local776 << 2, (local175 & 0x3FFF) - Static123.anInt2176, (local175 >> 14 & 0x3FFF) - Static132.anInt2246, local97, local103);
					return;
				}
				if (arg0 == 5502) {
					anInt4908 -= 6;
					local175 = anIntArray333[anInt4908];
					if (local175 >= 2) {
						throw new RuntimeException();
					}
					Static133.anInt2248 = local175;
					local776 = anIntArray333[anInt4908 + 1];
					if (local776 + 1 >= Static543.anIntArrayArrayArray19[Static133.anInt2248].length >> 1) {
						throw new RuntimeException();
					}
					Static620.anInt9963 = local776;
					Static261.anInt4097 = 0;
					Static177.anInt8966 = anIntArray333[anInt4908 + 2];
					Static473.anInt7589 = anIntArray333[anInt4908 + 3];
					local97 = anIntArray333[anInt4908 + 4];
					if (local97 >= 2) {
						throw new RuntimeException();
					}
					Static239.anInt3904 = local97;
					local103 = anIntArray333[anInt4908 + 5];
					if (local103 + 1 >= Static543.anIntArrayArrayArray19[Static239.anInt3904].length >> 1) {
						throw new RuntimeException();
					}
					Static541.anInt8878 = local103;
					Static445.anInt7122 = 3;
					Static12.anInt159 = -1;
					Static8.anInt107 = -1;
					return;
				}
				if (arg0 == 5503) {
					Static204.method2871();
					return;
				}
				if (arg0 == 5504) {
					anInt4908 -= 2;
					Static419.method5599(anIntArray333[anInt4908], anIntArray333[anInt4908 + 1]);
					return;
				}
				if (arg0 == 5505) {
					anIntArray333[anInt4908++] = (int) Static339.aFloat100 >> 3;
					return;
				}
				if (arg0 == 5506) {
					anIntArray333[anInt4908++] = (int) Static440.aFloat144 >> 3;
					return;
				}
				if (arg0 == 5507) {
					Static468.method6320();
					return;
				}
				if (arg0 == 5508) {
					Static109.method1618();
					return;
				}
				if (arg0 == 5509) {
					Static388.method5229();
					return;
				}
				if (arg0 == 5510) {
					Static544.method7819();
					return;
				}
				if (arg0 == 5511) {
					local175 = anIntArray333[--anInt4908];
					local776 = local175 >> 14 & 0x3FFF;
					local97 = local175 & 0x3FFF;
					local776 -= Static132.anInt2246;
					if (local776 < 0) {
						local776 = 0;
					} else if (local776 >= Static228.anInt3704) {
						local776 = Static228.anInt3704;
					}
					local97 -= Static123.anInt2176;
					if (local97 < 0) {
						local97 = 0;
					} else if (local97 >= Static162.anInt2911) {
						local97 = Static162.anInt2911;
					}
					Static319.anInt5080 = (local776 << 9) + 256;
					Static418.anInt6556 = (local97 << 9) + 256;
					Static445.anInt7122 = 4;
					Static12.anInt159 = -1;
					Static8.anInt107 = -1;
					return;
				}
				if (arg0 == 5512) {
					Static216.method6829();
					return;
				}
				if (arg0 == 5514) {
					Static638.anInt7981 = anIntArray333[--anInt4908];
					return;
				}
				if (arg0 == 5516) {
					anIntArray333[anInt4908++] = Static638.anInt7981;
					return;
				}
				if (arg0 == 5517) {
					local175 = anIntArray333[--anInt4908];
					if (local175 == -1) {
						local776 = local175 >> 14 & 0x3FFF;
						local97 = local175 & 0x3FFF;
						local776 -= Static132.anInt2246;
						if (local776 < 0) {
							local776 = 0;
						} else if (local776 >= Static228.anInt3704) {
							local776 = Static228.anInt3704;
						}
						local97 -= Static123.anInt2176;
						if (local97 < 0) {
							local97 = 0;
						} else if (local97 >= Static162.anInt2911) {
							local97 = Static162.anInt2911;
						}
						Static8.anInt107 = (local776 << 9) + 256;
						Static12.anInt159 = (local97 << 9) + 256;
						return;
					}
					Static8.anInt107 = -1;
					Static12.anInt159 = -1;
					return;
				}
			} else if (arg0 < 5700) {
				if (arg0 == 5600) {
					anInt4906 -= 2;
					local83 = aStringArray25[anInt4906];
					local89 = aStringArray25[anInt4906 + 1];
					local97 = anIntArray333[--anInt4908];
					if (local83.length() > 320) {
						return;
					}
					if (Static324.anInt5145 != 3) {
						return;
					}
					if (Static324.anInt5144 == 0 && Static66.anInt10109 == 0) {
						Static34.aString8 = local83;
						Static91.aString17 = local89;
						Static500.anInt8131 = local97;
						Static158.method2370(6);
						return;
					}
					return;
				}
				if (arg0 == 5601) {
					Static191.method2769();
					return;
				}
				if (arg0 == 5602) {
					if (Static324.anInt5144 == 0) {
						Static69.anInt1229 = -2;
						Static354.anInt5584 = -2;
					}
					return;
				}
				if (arg0 == 5604) {
					anInt4906--;
					if (Static324.anInt5145 != 3) {
						return;
					}
					if (Static324.anInt5144 == 0 && Static66.anInt10109 == 0) {
						Static470.method6339(aStringArray25[anInt4906]);
						return;
					}
					return;
				}
				if (arg0 == 5605) {
					anInt4906 -= 2;
					anInt4908 -= 2;
					if (Static324.anInt5145 != 3) {
						return;
					}
					if (Static324.anInt5144 == 0 && Static66.anInt10109 == 0) {
						Static80.method1109(aStringArray25[anInt4906], anIntArray333[anInt4908 + 1] == 1, aStringArray25[anInt4906 + 1], anIntArray333[anInt4908]);
						return;
					}
					return;
				}
				if (arg0 == 5606) {
					if (Static66.anInt10109 == 0) {
						Static304.anInt10284 = -2;
					}
					return;
				}
				if (arg0 == 5607) {
					anIntArray333[anInt4908++] = Static354.anInt5584;
					return;
				}
				if (arg0 == 5608) {
					anIntArray333[anInt4908++] = Static125.anInt2197;
					return;
				}
				if (arg0 == 5609) {
					anIntArray333[anInt4908++] = Static304.anInt10284;
					return;
				}
				if (arg0 == 5611) {
					anIntArray333[anInt4908++] = Static7.anInt95;
					return;
				}
				if (arg0 == 5612) {
					local175 = anIntArray333[--anInt4908];
					if (Static324.anInt5145 != 7) {
						return;
					}
					if (Static324.anInt5144 == 0 && Static66.anInt10109 == 0) {
						if (Static155.aClass121_2 != null) {
							Static155.aClass121_2.method2936();
							Static155.aClass121_2 = null;
						}
						Static500.anInt8131 = local175;
						Static158.method2370(9);
						return;
					}
					return;
				}
				if (arg0 == 5613) {
					anIntArray333[anInt4908++] = Static354.anInt5584;
					return;
				}
				if (arg0 == 5615) {
					anInt4906 -= 2;
					local83 = aStringArray25[anInt4906];
					local89 = aStringArray25[anInt4906 + 1];
					if (local83.length() > 320) {
						return;
					}
					if (Static324.anInt5145 != 3) {
						return;
					}
					if (Static324.anInt5144 == 0 && Static66.anInt10109 == 0) {
						if (Static155.aClass121_2 != null) {
							Static155.aClass121_2.method2936();
							Static155.aClass121_2 = null;
						}
						Static34.aString8 = local83;
						Static91.aString17 = local89;
						Static158.method2370(5);
						return;
					}
					return;
				}
				if (arg0 == 5616) {
					Static211.method2746(false);
					return;
				}
				if (arg0 == 5617) {
					anIntArray333[anInt4908++] = Static69.anInt1229;
					return;
				}
				if (arg0 == 5618) {
					anInt4908--;
					return;
				}
				if (arg0 == 5619) {
					anInt4908--;
					return;
				}
				if (arg0 == 5620) {
					anIntArray333[anInt4908++] = 0;
					return;
				}
				if (arg0 == 5621) {
					anInt4906 -= 2;
					anInt4908 -= 2;
					return;
				}
				if (arg0 == 5622) {
					return;
				}
				if (arg0 == 5623) {
					if (Static435.aString32 != null) {
						anIntArray333[anInt4908++] = 1;
						return;
					}
					anIntArray333[anInt4908++] = 0;
					return;
				}
				if (arg0 == 5624) {
					anIntArray333[anInt4908++] = (int) (Static528.aLong234 >> 32);
					anIntArray333[anInt4908++] = (int) (Static528.aLong234 & 0xFFFFL);
					return;
				}
				if (arg0 == 5625) {
					anIntArray333[anInt4908++] = Static340.aBoolean387 ? 1 : 0;
					return;
				}
				if (arg0 == 5626) {
					Static340.aBoolean387 = true;
					Static251.method3442();
					return;
				}
			} else if (arg0 < 6100) {
				if (arg0 == 6001) {
					local175 = anIntArray333[--anInt4908];
					Static234.aClass2_Sub5_48.method176(local175, Static234.aClass2_Sub5_48.aClass6_Sub3_1);
					Static566.method7765();
					Static329.method4407();
					Static266.aBoolean292 = false;
					return;
				}
				@Pc(4786) boolean local4786;
				if (arg0 == 6002) {
					local4786 = anIntArray333[--anInt4908] == 1;
					Static234.aClass2_Sub5_48.method176(local4786 ? 1 : 0, Static234.aClass2_Sub5_48.aClass6_Sub13_2);
					Static234.aClass2_Sub5_48.method176(local4786 ? 1 : 0, Static234.aClass2_Sub5_48.aClass6_Sub13_1);
					Static566.method7765();
					Static422.method5643();
					Static329.method4407();
					Static266.aBoolean292 = false;
					return;
				}
				if (arg0 == 6003) {
					local4786 = anIntArray333[--anInt4908] == 1;
					Static234.aClass2_Sub5_48.method176(local4786 ? 2 : 1, Static234.aClass2_Sub5_48.aClass6_Sub18_1);
					Static234.aClass2_Sub5_48.method176(local4786 ? 2 : 1, Static234.aClass2_Sub5_48.aClass6_Sub18_2);
					Static422.method5643();
					Static329.method4407();
					Static266.aBoolean292 = false;
					return;
				}
				if (arg0 == 6005) {
					Static234.aClass2_Sub5_48.method176(anIntArray333[--anInt4908] == 1 ? 1 : 0, Static234.aClass2_Sub5_48.aClass6_Sub4_1);
					Static566.method7765();
					Static329.method4407();
					Static266.aBoolean292 = false;
					return;
				}
				if (arg0 == 6007) {
					Static234.aClass2_Sub5_48.method176(anIntArray333[--anInt4908], Static234.aClass2_Sub5_48.aClass6_Sub12_1);
					Static329.method4407();
					Static266.aBoolean292 = false;
					return;
				}
				if (arg0 == 6008) {
					Static234.aClass2_Sub5_48.method176(anIntArray333[--anInt4908] == 1 ? 1 : 0, Static234.aClass2_Sub5_48.aClass6_Sub16_1);
					Static329.method4407();
					Static266.aBoolean292 = false;
					return;
				}
				if (arg0 == 6010) {
					Static234.aClass2_Sub5_48.method176(anIntArray333[--anInt4908] == 1 ? 1 : 0, Static234.aClass2_Sub5_48.aClass6_Sub23_1);
					Static329.method4407();
					Static266.aBoolean292 = false;
					return;
				}
				if (arg0 == 6011) {
					Static234.aClass2_Sub5_48.method176(anIntArray333[--anInt4908], Static234.aClass2_Sub5_48.aClass6_Sub24_1);
					Static566.method7765();
					Static329.method4407();
					Static266.aBoolean292 = false;
					return;
				}
				if (arg0 == 6012) {
					Static234.aClass2_Sub5_48.method176(anIntArray333[--anInt4908] == 1 ? 1 : 0, Static234.aClass2_Sub5_48.aClass6_Sub17_1);
					Static45.method741();
					Static249.method3418();
					Static329.method4407();
					Static266.aBoolean292 = false;
					return;
				}
				if (arg0 == 6014) {
					Static234.aClass2_Sub5_48.method176(anIntArray333[--anInt4908] == 1 ? 2 : 0, Static234.aClass2_Sub5_48.aClass6_Sub15_1);
					Static566.method7765();
					Static329.method4407();
					Static266.aBoolean292 = false;
					return;
				}
				if (arg0 == 6015) {
					Static234.aClass2_Sub5_48.method176(anIntArray333[--anInt4908] == 1 ? 1 : 0, Static234.aClass2_Sub5_48.aClass6_Sub6_1);
					Static566.method7765();
					Static329.method4407();
					Static266.aBoolean292 = false;
					return;
				}
				if (arg0 == 6016) {
					Static234.aClass2_Sub5_48.method176(anIntArray333[--anInt4908], Static234.aClass2_Sub5_48.aClass6_Sub11_2);
					Static317.method4257(false, Static234.aClass2_Sub5_48.aClass6_Sub21_2.method7280());
					Static329.method4407();
					return;
				}
				if (arg0 == 6017) {
					Static234.aClass2_Sub5_48.method176(anIntArray333[--anInt4908] == 1 ? 1 : 0, Static234.aClass2_Sub5_48.aClass6_Sub2_1);
					Static610.method8217();
					Static329.method4407();
					Static266.aBoolean292 = false;
					return;
				}
				if (arg0 == 6018) {
					Static234.aClass2_Sub5_48.method176(anIntArray333[--anInt4908], Static234.aClass2_Sub5_48.aClass6_Sub22_5);
					Static329.method4407();
					Static266.aBoolean292 = false;
					return;
				}
				if (arg0 == 6019) {
					local175 = anIntArray333[--anInt4908];
					local776 = Static234.aClass2_Sub5_48.aClass6_Sub22_3.method7291();
					if (local175 != local776) {
						if (Static569.method7798(Static324.anInt5145)) {
							if (local776 == 0 && Static489.anInt1781 != -1) {
								Static565.method7740(Static489.anInt1781, Static539.aClass380_121, local175);
								Static151.method2243();
								Static446.aBoolean675 = false;
							} else if (local175 == 0) {
								Static109.method1616();
								Static446.aBoolean675 = false;
							} else {
								Static53.method846(local175);
							}
						}
						Static234.aClass2_Sub5_48.method176(local175, Static234.aClass2_Sub5_48.aClass6_Sub22_3);
						Static329.method4407();
						Static266.aBoolean292 = false;
					}
					return;
				}
				if (arg0 == 6020) {
					Static234.aClass2_Sub5_48.method176(anIntArray333[--anInt4908], Static234.aClass2_Sub5_48.aClass6_Sub22_2);
					Static329.method4407();
					Static266.aBoolean292 = false;
					return;
				}
				if (arg0 == 6021) {
					local175 = Static234.aClass2_Sub5_48.aClass6_Sub18_1.method5409();
					Static234.aClass2_Sub5_48.method176(anIntArray333[--anInt4908] == 1 ? 0 : local175, Static234.aClass2_Sub5_48.aClass6_Sub18_2);
					Static422.method5643();
					return;
				}
				if (arg0 == 6023) {
					local175 = anIntArray333[--anInt4908];
					Static234.aClass2_Sub5_48.method176(local175, Static234.aClass2_Sub5_48.aClass6_Sub19_1);
					Static329.method4407();
					Static266.aBoolean292 = false;
					return;
				}
				if (arg0 == 6024) {
					Static234.aClass2_Sub5_48.method176(anIntArray333[--anInt4908], Static234.aClass2_Sub5_48.aClass6_Sub11_1);
					Static329.method4407();
					return;
				}
				if (arg0 == 6025) {
					Static234.aClass2_Sub5_48.method176(anIntArray333[--anInt4908], Static234.aClass2_Sub5_48.aClass6_Sub9_1);
					Static329.method4407();
					Static266.aBoolean292 = false;
					return;
				}
				if (arg0 == 6027) {
					local175 = anIntArray333[--anInt4908];
					if (local175 < 0 || local175 > 1) {
						local175 = 0;
					}
					Static570.method7807(local175 == 1);
					return;
				}
				if (arg0 == 6028) {
					Static234.aClass2_Sub5_48.method176(anIntArray333[--anInt4908] == 0 ? 0 : 1, Static234.aClass2_Sub5_48.aClass6_Sub14_1);
					Static329.method4407();
					return;
				}
				if (arg0 == 6029) {
					Static234.aClass2_Sub5_48.method176(anIntArray333[--anInt4908], Static234.aClass2_Sub5_48.aClass6_Sub12_1);
					Static329.method4407();
					return;
				}
				if (arg0 == 6030) {
					Static234.aClass2_Sub5_48.method176(anIntArray333[--anInt4908] == 0 ? 0 : 1, Static234.aClass2_Sub5_48.aClass6_Sub10_1);
					Static329.method4407();
					Static566.method7765();
					return;
				}
				if (arg0 == 6031) {
					local175 = anIntArray333[--anInt4908];
					if (local175 < 0 || local175 > 5) {
						local175 = 2;
					}
					Static317.method4257(false, local175);
					return;
				}
				if (arg0 == 6032) {
					Static234.aClass2_Sub5_48.method176(anIntArray333[--anInt4908], Static234.aClass2_Sub5_48.aClass6_Sub21_1);
					Static234.aClass2_Sub5_48.method176(0, Static234.aClass2_Sub5_48.aClass6_Sub7_1);
					Static329.method4407();
					Static266.aBoolean292 = false;
					return;
				}
				if (arg0 == 6033) {
					Static234.aClass2_Sub5_48.method176(anIntArray333[--anInt4908], Static234.aClass2_Sub5_48.aClass6_Sub20_1);
					Static329.method4407();
					return;
				}
				if (arg0 == 6034) {
					Static234.aClass2_Sub5_48.method176(anIntArray333[--anInt4908] == 1 ? 1 : 0, Static234.aClass2_Sub5_48.aClass6_Sub25_1);
					Static329.method4407();
					Static45.method741();
					Static266.aBoolean292 = false;
					return;
				}
				if (arg0 == 6035) {
					local175 = Static234.aClass2_Sub5_48.aClass6_Sub13_2.method3763();
					Static234.aClass2_Sub5_48.method176(anIntArray333[--anInt4908] == 1 ? 1 : local175, Static234.aClass2_Sub5_48.aClass6_Sub13_1);
					Static566.method7765();
					Static422.method5643();
					return;
				}
				if (arg0 == 6036) {
					Static234.aClass2_Sub5_48.method176(anIntArray333[--anInt4908], Static234.aClass2_Sub5_48.aClass6_Sub5_1);
					Static329.method4407();
					Static555.aBoolean676 = true;
					return;
				}
				if (arg0 == 6037) {
					Static234.aClass2_Sub5_48.method176(anIntArray333[--anInt4908], Static234.aClass2_Sub5_48.aClass6_Sub22_4);
					Static329.method4407();
					Static266.aBoolean292 = false;
					return;
				}
				if (arg0 == 6038) {
					local175 = anIntArray333[--anInt4908];
					local776 = Static234.aClass2_Sub5_48.aClass6_Sub22_1.method7291();
					if (local175 != local776 && Static489.anInt1781 == Static363.anInt5741) {
						if (!Static569.method7798(Static324.anInt5145)) {
							if (local776 == 0) {
								Static565.method7740(Static489.anInt1781, Static539.aClass380_121, local175);
								Static151.method2243();
								Static446.aBoolean675 = false;
							} else if (local175 == 0) {
								Static109.method1616();
								Static446.aBoolean675 = false;
							} else {
								Static53.method846(local175);
							}
						}
						Static234.aClass2_Sub5_48.method176(local175, Static234.aClass2_Sub5_48.aClass6_Sub22_1);
						Static329.method4407();
						Static266.aBoolean292 = false;
					}
					return;
				}
				if (arg0 == 6039) {
					local175 = anIntArray333[--anInt4908];
					if (local175 > 255 || local175 < 0) {
						local175 = 0;
					}
					if (local175 != Static234.aClass2_Sub5_48.aClass6_Sub1_1.method127()) {
						Static234.aClass2_Sub5_48.method176(local175, Static234.aClass2_Sub5_48.aClass6_Sub1_1);
						Static329.method4407();
						Static266.aBoolean292 = false;
					}
					return;
				}
				if (arg0 == 6040) {
					local175 = anIntArray333[--anInt4908];
					if (local175 != Static234.aClass2_Sub5_48.aClass6_Sub27_1.method8300()) {
						Static234.aClass2_Sub5_48.method176(local175, Static234.aClass2_Sub5_48.aClass6_Sub27_1);
						Static329.method4407();
						Static266.aBoolean292 = false;
						Static541.method7472();
					}
					return;
				}
			} else if (arg0 < 6200) {
				if (arg0 == 6101) {
					anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub3_1.method753();
					return;
				}
				if (arg0 == 6102) {
					anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub13_2.method3763() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6103) {
					anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub18_1.method5409() == 2 ? 1 : 0;
					return;
				}
				if (arg0 == 6105) {
					anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub4_1.method2457() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6107) {
					anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub12_1.method3734();
					return;
				}
				if (arg0 == 6108) {
					anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub16_1.method4321() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6110) {
					anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub23_1.method7411() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6111) {
					anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub24_1.method7575();
					return;
				}
				if (arg0 == 6112) {
					anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub17_1.method4403() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6114) {
					anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub15_1.method4218() == 2 ? 1 : 0;
					return;
				}
				if (arg0 == 6115) {
					anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub6_1.method2780() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6116) {
					anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub11_2.method3433();
					return;
				}
				if (arg0 == 6117) {
					anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub2_1.method252() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6118) {
					anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub22_5.method7291();
					return;
				}
				if (arg0 == 6119) {
					anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub22_3.method7291();
					return;
				}
				if (arg0 == 6120) {
					anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub22_2.method7291();
					return;
				}
				if (arg0 == 6123) {
					anIntArray333[anInt4908++] = Static500.method6906();
					return;
				}
				if (arg0 == 6124) {
					anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub11_1.method3433();
					return;
				}
				if (arg0 == 6125) {
					anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub9_1.method3047();
					return;
				}
				if (arg0 == 6127) {
					anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub8_1.method2927() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6128) {
					anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub14_1.method4184() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6129) {
					anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub12_1.method3734();
					return;
				}
				if (arg0 == 6130) {
					anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub10_1.method3108() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6131) {
					anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub21_2.method7280();
					return;
				}
				if (arg0 == 6132) {
					anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub21_1.method7280();
					return;
				}
				if (arg0 == 6133) {
					anIntArray333[anInt4908++] = Static452.aClass226_6.aBoolean416 && !Static452.aClass226_6.aBoolean415 ? 1 : 0;
					return;
				}
				if (arg0 == 6135) {
					anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub20_1.method7255();
					return;
				}
				if (arg0 == 6136) {
					anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub25_1.method8110() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6138) {
					anIntArray333[anInt4908++] = Static560.method7665(200, Static234.aClass2_Sub5_48.aClass6_Sub21_2.method7280());
					return;
				}
				if (arg0 == 6139) {
					anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub5_1.method2473();
					return;
				}
				if (arg0 == 6142) {
					anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub22_4.method7291();
					return;
				}
				if (arg0 == 6143) {
					anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub22_1.method7291();
					return;
				}
				if (arg0 == 6144) {
					anIntArray333[anInt4908++] = Static389.aBoolean445 ? 1 : 0;
					return;
				}
				if (arg0 == 6145) {
					anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub1_1.method127();
					return;
				}
				if (arg0 == 6146) {
					anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub27_1.method8300();
					return;
				}
			} else if (arg0 < 6300) {
				if (arg0 == 6200) {
					anInt4908 -= 2;
					Static417.aShort89 = (short) anIntArray333[anInt4908];
					if (Static417.aShort89 <= 0) {
						Static417.aShort89 = 256;
					}
					Static123.aShort27 = (short) anIntArray333[anInt4908 + 1];
					if (Static123.aShort27 <= 0) {
						Static123.aShort27 = 205;
					}
					return;
				}
				if (arg0 == 6201) {
					anInt4908 -= 2;
					Static8.aShort2 = (short) anIntArray333[anInt4908];
					if (Static8.aShort2 <= 0) {
						Static8.aShort2 = 256;
					}
					Static57.aShort18 = (short) anIntArray333[anInt4908 + 1];
					if (Static57.aShort18 <= 0) {
						Static57.aShort18 = 320;
					}
					return;
				}
				if (arg0 == 6202) {
					anInt4908 -= 4;
					Static516.aShort90 = (short) anIntArray333[anInt4908];
					if (Static516.aShort90 <= 0) {
						Static516.aShort90 = 1;
					}
					Static340.aShort57 = (short) anIntArray333[anInt4908 + 1];
					if (Static340.aShort57 <= 0) {
						Static340.aShort57 = 32767;
					} else if (Static340.aShort57 < Static516.aShort90) {
						Static340.aShort57 = Static516.aShort90;
					}
					Static431.aShort91 = (short) anIntArray333[anInt4908 + 2];
					if (Static431.aShort91 <= 0) {
						Static431.aShort91 = 1;
					}
					Static2.aShort1 = (short) anIntArray333[anInt4908 + 3];
					if (Static2.aShort1 <= 0) {
						Static2.aShort1 = 32767;
						return;
					}
					if (Static2.aShort1 < Static431.aShort91) {
						Static2.aShort1 = Static431.aShort91;
					}
					return;
				}
				if (arg0 == 6203) {
					Static40.method644(Static352.aClass261_7.anInt6622, 0, 0, false, Static352.aClass261_7.anInt6595);
					anIntArray333[anInt4908++] = Static621.anInt9968;
					anIntArray333[anInt4908++] = Static93.anInt1717;
					return;
				}
				if (arg0 == 6204) {
					anIntArray333[anInt4908++] = Static8.aShort2;
					anIntArray333[anInt4908++] = Static57.aShort18;
					return;
				}
				if (arg0 == 6205) {
					anIntArray333[anInt4908++] = Static417.aShort89;
					anIntArray333[anInt4908++] = Static123.aShort27;
					return;
				}
			} else if (arg0 < 6400) {
				if (arg0 == 6300) {
					anIntArray333[anInt4908++] = (int) (Static476.method6413() / 60000L);
					return;
				}
				if (arg0 == 6301) {
					anIntArray333[anInt4908++] = (int) (Static476.method6413() / 86400000L) - 11745;
					return;
				}
				if (arg0 == 6302) {
					anInt4908 -= 3;
					local175 = anIntArray333[anInt4908];
					local776 = anIntArray333[anInt4908 + 1];
					local97 = anIntArray333[anInt4908 + 2];
					aCalendar1.clear();
					aCalendar1.set(11, 12);
					aCalendar1.set(local97, local776, local175);
					local103 = (int) (aCalendar1.getTime().getTime() / 86400000L) - 11745;
					if (local97 < 1970) {
						local103--;
					}
					anIntArray333[anInt4908++] = local103;
					return;
				}
				if (arg0 == 6303) {
					aCalendar1.clear();
					aCalendar1.setTime(new Date(Static476.method6413()));
					anIntArray333[anInt4908++] = aCalendar1.get(1);
					return;
				}
				if (arg0 == 6304) {
					local175 = anIntArray333[--anInt4908];
					local1496 = true;
					if (local175 < 0) {
						local1496 = (local175 + 1) % 4 == 0;
					} else if (local175 < 1582) {
						local1496 = local175 % 4 == 0;
					} else if (local175 % 4 != 0) {
						local1496 = false;
					} else if (local175 % 100 != 0) {
						local1496 = true;
					} else if (local175 % 400 != 0) {
						local1496 = false;
					}
					anIntArray333[anInt4908++] = local1496 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6500) {
				if (arg0 == 6405) {
					anIntArray333[anInt4908++] = Static377.method5064() ? 1 : 0;
					return;
				}
				if (arg0 == 6406) {
					anIntArray333[anInt4908++] = Static239.method3350() ? 1 : 0;
					return;
				}
			} else if (arg0 < 6600) {
				if (arg0 == 6500) {
					if (Static324.anInt5145 == 7 && Static324.anInt5144 == 0 && Static66.anInt10109 == 0) {
						if (Static527.aBoolean651) {
							anIntArray333[anInt4908++] = 0;
							return;
						}
						if (Static525.aLong170 > Static476.method6413() - 1000L) {
							anIntArray333[anInt4908++] = 1;
							return;
						}
						Static527.aBoolean651 = true;
						local52 = Static464.method6285(Static251.aClass131_1, Static340.aClass179_69);
						local52.aClass2_Sub22_Sub2_2.method8552(Static608.anInt9791);
						Static528.method7295(local52);
						anIntArray333[anInt4908++] = 0;
						return;
					}
					anIntArray333[anInt4908++] = 1;
					return;
				}
				@Pc(6809) Class317 local6809;
				@Pc(6776) Class89_Sub1 local6776;
				if (arg0 == 6501) {
					local6776 = Static578.method7893();
					if (local6776 != null) {
						anIntArray333[anInt4908++] = local6776.anInt2240;
						anIntArray333[anInt4908++] = local6776.anInt2233;
						aStringArray25[anInt4906++] = local6776.aString19;
						local6809 = local6776.method1829();
						anIntArray333[anInt4908++] = local6809.anInt8578;
						aStringArray25[anInt4906++] = local6809.aString101;
						anIntArray333[anInt4908++] = local6776.anInt2234;
						anIntArray333[anInt4908++] = local6776.anInt2236;
						aStringArray25[anInt4906++] = local6776.aString20;
						return;
					}
					anIntArray333[anInt4908++] = -1;
					anIntArray333[anInt4908++] = 0;
					aStringArray25[anInt4906++] = "";
					anIntArray333[anInt4908++] = 0;
					aStringArray25[anInt4906++] = "";
					anIntArray333[anInt4908++] = 0;
					anIntArray333[anInt4908++] = 0;
					aStringArray25[anInt4906++] = "";
					return;
				}
				if (arg0 == 6502) {
					local6776 = Static533.method7366();
					if (local6776 != null) {
						anIntArray333[anInt4908++] = local6776.anInt2240;
						anIntArray333[anInt4908++] = local6776.anInt2233;
						aStringArray25[anInt4906++] = local6776.aString19;
						local6809 = local6776.method1829();
						anIntArray333[anInt4908++] = local6809.anInt8578;
						aStringArray25[anInt4906++] = local6809.aString101;
						anIntArray333[anInt4908++] = local6776.anInt2234;
						anIntArray333[anInt4908++] = local6776.anInt2236;
						aStringArray25[anInt4906++] = local6776.aString20;
						return;
					}
					anIntArray333[anInt4908++] = -1;
					anIntArray333[anInt4908++] = 0;
					aStringArray25[anInt4906++] = "";
					anIntArray333[anInt4908++] = 0;
					aStringArray25[anInt4906++] = "";
					anIntArray333[anInt4908++] = 0;
					anIntArray333[anInt4908++] = 0;
					aStringArray25[anInt4906++] = "";
					return;
				}
				if (arg0 == 6503) {
					local175 = anIntArray333[--anInt4908];
					local89 = aStringArray25[--anInt4906];
					if (Static324.anInt5145 == 7 && Static324.anInt5144 == 0 && Static66.anInt10109 == 0) {
						anIntArray333[anInt4908++] = Static33.method588(local175, local89) ? 1 : 0;
						return;
					}
					anIntArray333[anInt4908++] = 0;
					return;
				}
				if (arg0 == 6506) {
					local175 = anIntArray333[--anInt4908];
					@Pc(7136) Class89_Sub1 local7136 = Static56.method4530(local175);
					if (local7136 != null) {
						anIntArray333[anInt4908++] = local7136.anInt2233;
						aStringArray25[anInt4906++] = local7136.aString19;
						@Pc(7160) Class317 local7160 = local7136.method1829();
						anIntArray333[anInt4908++] = local7160.anInt8578;
						aStringArray25[anInt4906++] = local7160.aString101;
						anIntArray333[anInt4908++] = local7136.anInt2234;
						anIntArray333[anInt4908++] = local7136.anInt2236;
						aStringArray25[anInt4906++] = local7136.aString20;
						return;
					}
					anIntArray333[anInt4908++] = -1;
					aStringArray25[anInt4906++] = "";
					anIntArray333[anInt4908++] = 0;
					aStringArray25[anInt4906++] = "";
					anIntArray333[anInt4908++] = 0;
					anIntArray333[anInt4908++] = 0;
					aStringArray25[anInt4906++] = "";
					return;
				}
				if (arg0 == 6507) {
					anInt4908 -= 4;
					local175 = anIntArray333[anInt4908];
					local1496 = anIntArray333[anInt4908 + 1] == 1;
					local97 = anIntArray333[anInt4908 + 2];
					local2107 = anIntArray333[anInt4908 + 3] == 1;
					Static283.method6306(local97, local175, local1496, local2107);
					return;
				}
				if (arg0 == 6508) {
					Static6.method108();
					return;
				}
				if (arg0 == 6509) {
					if (Static324.anInt5145 != 7) {
						return;
					}
					Static196.aBoolean242 = anIntArray333[--anInt4908] == 1;
					return;
				}
				if (arg0 == 6510) {
					anIntArray333[anInt4908++] = Static534.anInt8759;
					return;
				}
			} else if (arg0 >= 6700) {
				if (arg0 < 6800 && Static298.aClass113_4 == Static130.aClass113_1) {
					if (arg0 == 6700) {
						local175 = Static606.aClass118_47.method2602();
						if (Static38.anInt777 != -1) {
							local175++;
						}
						anIntArray333[anInt4908++] = local175;
						return;
					}
					if (arg0 == 6701) {
						local175 = anIntArray333[--anInt4908];
						if (Static38.anInt777 != -1) {
							if (local175 == 0) {
								anIntArray333[anInt4908++] = Static38.anInt777;
								return;
							}
							local175--;
						}
						@Pc(7408) Class2_Sub9 local7408 = (Class2_Sub9) Static606.aClass118_47.method2596();
						while (local175-- > 0) {
							local7408 = (Class2_Sub9) Static606.aClass118_47.method2597();
						}
						anIntArray333[anInt4908++] = local7408.anInt2171;
						return;
					}
					if (arg0 == 6702) {
						local175 = anIntArray333[--anInt4908];
						if (Static559.aClass261ArrayArray2[local175] == null) {
							aStringArray25[anInt4906++] = "";
							return;
						}
						local89 = Static559.aClass261ArrayArray2[local175][0].aString91;
						if (local89 == null) {
							aStringArray25[anInt4906++] = "";
							return;
						}
						aStringArray25[anInt4906++] = local89.substring(0, local89.indexOf(58));
						return;
					}
					if (arg0 == 6703) {
						local175 = anIntArray333[--anInt4908];
						if (Static559.aClass261ArrayArray2[local175] == null) {
							anIntArray333[anInt4908++] = 0;
							return;
						}
						anIntArray333[anInt4908++] = Static559.aClass261ArrayArray2[local175].length;
						return;
					}
					if (arg0 == 6704) {
						anInt4908 -= 2;
						local175 = anIntArray333[anInt4908];
						local776 = anIntArray333[anInt4908 + 1];
						if (Static559.aClass261ArrayArray2[local175] == null) {
							aStringArray25[anInt4906++] = "";
							return;
						}
						local181 = Static559.aClass261ArrayArray2[local175][local776].aString91;
						if (local181 == null) {
							aStringArray25[anInt4906++] = "";
							return;
						}
						aStringArray25[anInt4906++] = local181;
						return;
					}
					if (arg0 == 6705) {
						anInt4908 -= 2;
						local175 = anIntArray333[anInt4908];
						local776 = anIntArray333[anInt4908 + 1];
						if (Static559.aClass261ArrayArray2[local175] == null) {
							anIntArray333[anInt4908++] = 0;
							return;
						}
						anIntArray333[anInt4908++] = Static559.aClass261ArrayArray2[local175][local776].anInt6652;
						return;
					}
					if (arg0 == 6706) {
						return;
					}
					if (arg0 == 6707) {
						anInt4908 -= 3;
						local175 = anIntArray333[anInt4908];
						local776 = anIntArray333[anInt4908 + 1];
						local97 = anIntArray333[anInt4908 + 2];
						Static139.method2125(local97, "", 1, local175 << 16 | local776);
						return;
					}
					if (arg0 == 6708) {
						anInt4908 -= 3;
						local175 = anIntArray333[anInt4908];
						local776 = anIntArray333[anInt4908 + 1];
						local97 = anIntArray333[anInt4908 + 2];
						Static139.method2125(local97, "", 2, local175 << 16 | local776);
						return;
					}
					if (arg0 == 6709) {
						anInt4908 -= 3;
						local175 = anIntArray333[anInt4908];
						local776 = anIntArray333[anInt4908 + 1];
						local97 = anIntArray333[anInt4908 + 2];
						Static139.method2125(local97, "", 3, local175 << 16 | local776);
						return;
					}
					if (arg0 == 6710) {
						anInt4908 -= 3;
						local175 = anIntArray333[anInt4908];
						local776 = anIntArray333[anInt4908 + 1];
						local97 = anIntArray333[anInt4908 + 2];
						Static139.method2125(local97, "", 4, local175 << 16 | local776);
						return;
					}
					if (arg0 == 6711) {
						anInt4908 -= 3;
						local175 = anIntArray333[anInt4908];
						local776 = anIntArray333[anInt4908 + 1];
						local97 = anIntArray333[anInt4908 + 2];
						Static139.method2125(local97, "", 5, local175 << 16 | local776);
						return;
					}
					if (arg0 == 6712) {
						anInt4908 -= 3;
						local175 = anIntArray333[anInt4908];
						local776 = anIntArray333[anInt4908 + 1];
						local97 = anIntArray333[anInt4908 + 2];
						Static139.method2125(local97, "", 6, local175 << 16 | local776);
						return;
					}
					if (arg0 == 6713) {
						anInt4908 -= 3;
						local175 = anIntArray333[anInt4908];
						local776 = anIntArray333[anInt4908 + 1];
						local97 = anIntArray333[anInt4908 + 2];
						Static139.method2125(local97, "", 7, local175 << 16 | local776);
						return;
					}
					if (arg0 == 6714) {
						anInt4908 -= 3;
						local175 = anIntArray333[anInt4908];
						local776 = anIntArray333[anInt4908 + 1];
						local97 = anIntArray333[anInt4908 + 2];
						Static139.method2125(local97, "", 8, local175 << 16 | local776);
						return;
					}
					if (arg0 == 6715) {
						anInt4908 -= 3;
						local175 = anIntArray333[anInt4908];
						local776 = anIntArray333[anInt4908 + 1];
						local97 = anIntArray333[anInt4908 + 2];
						Static139.method2125(local97, "", 9, local175 << 16 | local776);
						return;
					}
					if (arg0 == 6716) {
						anInt4908 -= 3;
						local175 = anIntArray333[anInt4908];
						local776 = anIntArray333[anInt4908 + 1];
						local97 = anIntArray333[anInt4908 + 2];
						Static139.method2125(local97, "", 10, local175 << 16 | local776);
						return;
					}
					if (arg0 == 6717) {
						anInt4908 -= 3;
						local175 = anIntArray333[anInt4908];
						local776 = anIntArray333[anInt4908 + 1];
						local97 = anIntArray333[anInt4908 + 2];
						@Pc(7996) Class261 local7996 = Static98.method1508(local175 << 16 | local776, local97);
						Static618.method8289();
						@Pc(8001) Class2_Sub41 local8001 = Static76.method1071(local7996);
						Static404.method5471(local8001.method6880(), local7996, local8001.anInt8112);
						return;
					}
				} else if (arg0 < 6900) {
					@Pc(8029) Class172 local8029;
					if (arg0 == 6800) {
						local175 = anIntArray333[--anInt4908];
						local8029 = Static599.aClass197_4.method4161(local175);
						if (local8029.aString42 == null) {
							aStringArray25[anInt4906++] = "";
							return;
						}
						aStringArray25[anInt4906++] = local8029.aString42;
						return;
					}
					if (arg0 == 6801) {
						local175 = anIntArray333[--anInt4908];
						local8029 = Static599.aClass197_4.method4161(local175);
						anIntArray333[anInt4908++] = local8029.anInt4332;
						return;
					}
					if (arg0 == 6802) {
						local175 = anIntArray333[--anInt4908];
						local8029 = Static599.aClass197_4.method4161(local175);
						anIntArray333[anInt4908++] = local8029.anInt4343;
						return;
					}
					if (arg0 == 6803) {
						local175 = anIntArray333[--anInt4908];
						local8029 = Static599.aClass197_4.method4161(local175);
						anIntArray333[anInt4908++] = local8029.anInt4330;
						return;
					}
					if (arg0 == 6804) {
						anInt4908 -= 2;
						local175 = anIntArray333[anInt4908];
						local776 = anIntArray333[anInt4908 + 1];
						@Pc(8151) Class238 local8151 = Static339.aClass66_1.method1439(local776);
						if (local8151.method5153()) {
							aStringArray25[anInt4906++] = Static599.aClass197_4.method4161(local175).method3770(local776, local8151.aString83);
							return;
						}
						anIntArray333[anInt4908++] = Static599.aClass197_4.method4161(local175).method3773(local776, local8151.anInt6043);
						return;
					}
				} else if (arg0 < 7000) {
					if (arg0 == 6900) {
						anIntArray333[anInt4908++] = Static416.aBoolean461 && !Static463.aBoolean554 ? 1 : 0;
						return;
					}
					if (arg0 == 6901) {
						anIntArray333[anInt4908++] = Static440.anInt7073;
						return;
					}
					if (arg0 == 6902) {
						anIntArray333[anInt4908++] = Static368.anInt5826;
						return;
					}
					if (arg0 == 6903) {
						anIntArray333[anInt4908++] = Static100.anInt1889;
						return;
					}
					if (arg0 == 6904) {
						anIntArray333[anInt4908++] = Static228.anInt3706;
						return;
					}
					if (arg0 == 6905) {
						local83 = "";
						if (Static224.aClass108_4 != null) {
							if (Static224.aClass108_4.anObject6 == null) {
								local83 = Static579.method6867(Static224.aClass108_4.anInt2765);
							} else {
								local83 = (String) Static224.aClass108_4.anObject6;
							}
						}
						aStringArray25[anInt4906++] = local83;
						return;
					}
					if (arg0 == 6906) {
						anIntArray333[anInt4908++] = Static110.anInt1988;
						return;
					}
					if (arg0 == 6907) {
						anIntArray333[anInt4908++] = Static156.anInt2812;
						return;
					}
					if (arg0 == 6908) {
						anIntArray333[anInt4908++] = Static432.anInt7005;
						return;
					}
					if (arg0 == 6909) {
						anIntArray333[anInt4908++] = Static432.aBoolean527 ? 1 : 0;
						return;
					}
					if (arg0 == 6910) {
						anIntArray333[anInt4908++] = Static429.anInt6738;
						return;
					}
					if (arg0 == 6911) {
						anIntArray333[anInt4908++] = Static513.anInt8560;
						return;
					}
					if (arg0 == 6912) {
						anIntArray333[anInt4908++] = Static518.anInt8595;
						return;
					}
				} else if (arg0 < 7100) {
					if (arg0 == 7000) {
						local175 = Static251.method3437();
						anIntArray333[anInt4908++] = Static471.anInt7510 = Static234.aClass2_Sub5_48.aClass6_Sub21_2.method7280();
						anIntArray333[anInt4908++] = local175;
						Static566.method7765();
						Static329.method4407();
						Static266.aBoolean292 = false;
						return;
					}
					if (arg0 == 7001) {
						Static558.method7640();
						Static566.method7765();
						Static329.method4407();
						Static266.aBoolean292 = false;
						return;
					}
					if (arg0 == 7002) {
						Static206.method2918();
						Static566.method7765();
						Static329.method4407();
						Static266.aBoolean292 = false;
						return;
					}
					if (arg0 == 7003) {
						Static418.method5593();
						Static566.method7765();
						Static329.method4407();
						Static266.aBoolean292 = false;
						return;
					}
					if (arg0 == 7004) {
						Static55.method858();
						Static566.method7765();
						Static329.method4407();
						Static266.aBoolean292 = false;
						return;
					}
					if (arg0 == 7005) {
						Static234.aClass2_Sub5_48.method176(0, Static234.aClass2_Sub5_48.aClass6_Sub7_1);
						Static329.method4407();
						Static266.aBoolean292 = false;
						return;
					}
					if (arg0 == 7006) {
						if (Static471.anInt7510 == 2) {
							Static279.aBoolean311 = true;
							return;
						}
						if (Static471.anInt7510 == 1) {
							Static630.aBoolean742 = true;
							return;
						}
						if (Static471.anInt7510 == 3) {
							Static644.aBoolean749 = true;
						}
						return;
					}
					if (arg0 == 7007) {
						anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub7_1.method2869();
						return;
					}
				} else if (arg0 < 7200) {
					if (arg0 == 7100) {
						anInt4908 -= 2;
						local175 = anIntArray333[anInt4908];
						local776 = anIntArray333[anInt4908 + 1];
						if (local175 != -1) {
							if (local776 > 255) {
								local776 = 255;
							} else if (local776 < 0) {
								local776 = 0;
							}
							Static59.method903(local175, local776, false);
						}
						return;
					}
					if (arg0 == 7101) {
						local175 = anIntArray333[--anInt4908];
						if (local175 != -1) {
							Static183.method2678(local175);
						}
						return;
					}
					if (arg0 == 7102) {
						local175 = anIntArray333[--anInt4908];
						if (local175 != -1) {
							Static157.method7239(local175);
						}
						return;
					}
					if (arg0 == 7103) {
						anIntArray333[anInt4908++] = Static630.method8442("jagtheora") ? 1 : 0;
						return;
					}
				} else if (arg0 < 7300) {
					if (arg0 == 7201) {
						anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub4_1.method2458() ? 1 : 0;
						return;
					}
					if (arg0 == 7202) {
						anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub23_1.method7408() ? 1 : 0;
						return;
					}
					if (arg0 == 7203) {
						anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub24_1.method7572() ? 1 : 0;
						return;
					}
					if (arg0 == 7204) {
						anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub15_1.method4217() ? 1 : 0;
						return;
					}
					if (arg0 == 7205) {
						anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub11_1.method3434() && Static192.aClass95_4.method6995() ? 1 : 0;
						return;
					}
					if (arg0 == 7206) {
						anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub19_1.method7185() ? 1 : 0;
						return;
					}
					if (arg0 == 7207) {
						anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub9_1.method3049() ? 1 : 0;
						return;
					}
					if (arg0 == 7208) {
						anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub8_1.method2928() && Static192.aClass95_4.method6944() ? 1 : 0;
						return;
					}
					if (arg0 == 7209) {
						anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub10_1.method3107() ? 1 : 0;
						return;
					}
					if (arg0 == 7210) {
						anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub25_1.method8109() ? 1 : 0;
						return;
					}
					if (arg0 == 7211) {
						anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub5_1.method2471() ? 1 : 0;
						return;
					}
					if (arg0 == 7212) {
						anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub6_1.method2779() ? 1 : 0;
						return;
					}
					if (arg0 == 7213) {
						anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub27_1.method8299() ? 1 : 0;
						return;
					}
				} else if (arg0 < 7400) {
					if (arg0 == 7301) {
						local175 = anIntArray333[--anInt4908];
						anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub4_1.method8573(local175);
						return;
					}
					if (arg0 == 7302) {
						local175 = anIntArray333[--anInt4908];
						anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub23_1.method8573(local175);
						return;
					}
					if (arg0 == 7303) {
						local175 = anIntArray333[--anInt4908];
						anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub24_1.method8573(local175);
						return;
					}
					if (arg0 == 7304) {
						local175 = anIntArray333[--anInt4908];
						anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub15_1.method8573(local175);
						return;
					}
					if (arg0 == 7305) {
						local175 = anIntArray333[--anInt4908];
						if (!Static192.aClass95_4.method6995()) {
							anIntArray333[anInt4908++] = 3;
							return;
						}
						anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub11_1.method8573(local175);
						return;
					}
					if (arg0 == 7306) {
						local175 = anIntArray333[--anInt4908];
						anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub19_1.method8573(local175);
						return;
					}
					if (arg0 == 7307) {
						local175 = anIntArray333[--anInt4908];
						anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub9_1.method8573(local175);
						return;
					}
					if (arg0 == 7308) {
						local175 = anIntArray333[--anInt4908];
						if (!Static192.aClass95_4.method6944()) {
							anIntArray333[anInt4908++] = 3;
							return;
						}
						anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub8_1.method8573(local175);
						return;
					}
					if (arg0 == 7309) {
						local175 = anIntArray333[--anInt4908];
						anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub10_1.method8573(local175);
						return;
					}
					if (arg0 == 7310) {
						local175 = anIntArray333[--anInt4908];
						anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub25_1.method8573(local175);
						return;
					}
					if (arg0 == 7311) {
						local175 = anIntArray333[--anInt4908];
						anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub5_1.method8573(local175);
						return;
					}
					if (arg0 == 7312) {
						local175 = anIntArray333[--anInt4908];
						anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub6_1.method8573(local175);
						return;
					}
					if (arg0 == 7313) {
						local175 = anIntArray333[--anInt4908];
						anIntArray333[anInt4908++] = Static234.aClass2_Sub5_48.aClass6_Sub27_1.method8573(local175);
						return;
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(C)I")
	private static int method4143(@OriginalArg(0) char arg0) {
		return Static436.method5991(arg0) ? 1 : 0;
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "()V")
	public static void method4144() {
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "(I)V")
	private static void method4145(@OriginalArg(0) int arg0) {
		@Pc(3) Class261 local3 = Static357.method4826(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class261[] local13 = Static8.aClass261ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class261[] local19 = Static559.aClass261ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static8.aClass261ArrayArray1[local9] = new Class261[local22];
			Static653.method5395(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static653.method5395(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method4146(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static165.anInt5949 == 0 && (Static416.aBoolean461 && !Static463.aBoolean554 || Static32.aBoolean58)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static434.aClass271_47.method5972(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static434.aClass271_47.method5972(0).length());
		} else if (local11.startsWith(Static434.aClass271_48.method5972(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static434.aClass271_48.method5972(0).length());
		} else if (local11.startsWith(Static434.aClass271_49.method5972(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static434.aClass271_49.method5972(0).length());
		} else if (local11.startsWith(Static434.aClass271_50.method5972(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static434.aClass271_50.method5972(0).length());
		} else if (local11.startsWith(Static434.aClass271_51.method5972(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static434.aClass271_51.method5972(0).length());
		} else if (local11.startsWith(Static434.aClass271_52.method5972(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static434.aClass271_52.method5972(0).length());
		} else if (local11.startsWith(Static434.aClass271_53.method5972(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static434.aClass271_53.method5972(0).length());
		} else if (local11.startsWith(Static434.aClass271_54.method5972(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static434.aClass271_54.method5972(0).length());
		} else if (local11.startsWith(Static434.aClass271_55.method5972(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static434.aClass271_55.method5972(0).length());
		} else if (local11.startsWith(Static434.aClass271_56.method5972(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static434.aClass271_56.method5972(0).length());
		} else if (local11.startsWith(Static434.aClass271_57.method5972(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static434.aClass271_57.method5972(0).length());
		} else if (local11.startsWith(Class271.lb.method5972(0))) {
			local13 = 11;
			arg0 = arg0.substring(Class271.lb.method5972(0).length());
		} else if (Static483.anInt7694 != 0) {
			if (local11.startsWith(Static434.aClass271_47.method5972(Static483.anInt7694))) {
				local13 = 0;
				arg0 = arg0.substring(Static434.aClass271_47.method5972(Static483.anInt7694).length());
			} else if (local11.startsWith(Static434.aClass271_48.method5972(Static483.anInt7694))) {
				local13 = 1;
				arg0 = arg0.substring(Static434.aClass271_48.method5972(Static483.anInt7694).length());
			} else if (local11.startsWith(Static434.aClass271_49.method5972(Static483.anInt7694))) {
				local13 = 2;
				arg0 = arg0.substring(Static434.aClass271_49.method5972(Static483.anInt7694).length());
			} else if (local11.startsWith(Static434.aClass271_50.method5972(Static483.anInt7694))) {
				local13 = 3;
				arg0 = arg0.substring(Static434.aClass271_50.method5972(Static483.anInt7694).length());
			} else if (local11.startsWith(Static434.aClass271_51.method5972(Static483.anInt7694))) {
				local13 = 4;
				arg0 = arg0.substring(Static434.aClass271_51.method5972(Static483.anInt7694).length());
			} else if (local11.startsWith(Static434.aClass271_52.method5972(Static483.anInt7694))) {
				local13 = 5;
				arg0 = arg0.substring(Static434.aClass271_52.method5972(Static483.anInt7694).length());
			} else if (local11.startsWith(Static434.aClass271_53.method5972(Static483.anInt7694))) {
				local13 = 6;
				arg0 = arg0.substring(Static434.aClass271_53.method5972(Static483.anInt7694).length());
			} else if (local11.startsWith(Static434.aClass271_54.method5972(Static483.anInt7694))) {
				local13 = 7;
				arg0 = arg0.substring(Static434.aClass271_54.method5972(Static483.anInt7694).length());
			} else if (local11.startsWith(Static434.aClass271_55.method5972(Static483.anInt7694))) {
				local13 = 8;
				arg0 = arg0.substring(Static434.aClass271_55.method5972(Static483.anInt7694).length());
			} else if (local11.startsWith(Static434.aClass271_56.method5972(Static483.anInt7694))) {
				local13 = 9;
				arg0 = arg0.substring(Static434.aClass271_56.method5972(Static483.anInt7694).length());
			} else if (local11.startsWith(Static434.aClass271_57.method5972(Static483.anInt7694))) {
				local13 = 10;
				arg0 = arg0.substring(Static434.aClass271_57.method5972(Static483.anInt7694).length());
			} else if (local11.startsWith(Class271.lb.method5972(Static483.anInt7694))) {
				local13 = 11;
				arg0 = arg0.substring(Class271.lb.method5972(Static483.anInt7694).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static434.aClass271_58.method5972(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static434.aClass271_58.method5972(0).length());
		} else if (local11.startsWith(Static434.aClass271_59.method5972(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static434.aClass271_59.method5972(0).length());
		} else if (local11.startsWith(Static434.aClass271_60.method5972(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static434.aClass271_60.method5972(0).length());
		} else if (local11.startsWith(Static434.aClass271_61.method5972(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static434.aClass271_61.method5972(0).length());
		} else if (local11.startsWith(Static434.aClass271_62.method5972(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static434.aClass271_62.method5972(0).length());
		} else if (Static483.anInt7694 != 0) {
			if (local11.startsWith(Static434.aClass271_58.method5972(Static483.anInt7694))) {
				local451 = 1;
				arg0 = arg0.substring(Static434.aClass271_58.method5972(Static483.anInt7694).length());
			} else if (local11.startsWith(Static434.aClass271_59.method5972(Static483.anInt7694))) {
				local451 = 2;
				arg0 = arg0.substring(Static434.aClass271_59.method5972(Static483.anInt7694).length());
			} else if (local11.startsWith(Static434.aClass271_60.method5972(Static483.anInt7694))) {
				local451 = 3;
				arg0 = arg0.substring(Static434.aClass271_60.method5972(Static483.anInt7694).length());
			} else if (local11.startsWith(Static434.aClass271_61.method5972(Static483.anInt7694))) {
				local451 = 4;
				arg0 = arg0.substring(Static434.aClass271_61.method5972(Static483.anInt7694).length());
			} else if (local11.startsWith(Static434.aClass271_62.method5972(Static483.anInt7694))) {
				local451 = 5;
				arg0 = arg0.substring(Static434.aClass271_62.method5972(Static483.anInt7694).length());
			}
		}
		@Pc(641) Class2_Sub40 local641 = Static464.method6285(Static251.aClass131_1, Static351.aClass179_71);
		local641.aClass2_Sub22_Sub2_2.method8537(0);
		@Pc(650) int local650 = local641.aClass2_Sub22_Sub2_2.anInt10247;
		local641.aClass2_Sub22_Sub2_2.method8537(local13);
		local641.aClass2_Sub22_Sub2_2.method8537(local451);
		Static621.method8308(local641.aClass2_Sub22_Sub2_2, arg0);
		local641.aClass2_Sub22_Sub2_2.method8514(local641.aClass2_Sub22_Sub2_2.anInt10247 - local650);
		Static528.method7295(local641);
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "(IZ)V")
	public static void method4147() {
	}

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "(I)V")
	private static void method4148(@OriginalArg(0) int arg0) {
		@Pc(3) Class261 local3 = Static357.method4826(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class261[] local13 = Static8.aClass261ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class261[] local19 = Static559.aClass261ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static8.aClass261ArrayArray1[local9] = new Class261[local22];
			Static653.method5395(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static653.method5395(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}
}
