import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!dn", name = "j", descriptor = "Lclient!gi;")
	private static Class93 aClass93_4;

	@OriginalMember(owner = "client!dn", name = "k", descriptor = "[I")
	private static int[] anIntArray93;

	@OriginalMember(owner = "client!dn", name = "p", descriptor = "Lclient!jh;")
	private static Class133 aClass133_1;

	@OriginalMember(owner = "client!dn", name = "q", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray13;

	@OriginalMember(owner = "client!dn", name = "x", descriptor = "Lclient!gi;")
	private static Class93 aClass93_5;

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
	private static int anInt1248 = 0;

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "[[I")
	private static final int[][] anIntArrayArray36 = new int[5][5000];

	@OriginalMember(owner = "client!dn", name = "g", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray12 = new String[1000];

	@OriginalMember(owner = "client!dn", name = "i", descriptor = "[I")
	private static final int[] anIntArray92 = new int[1000];

	@OriginalMember(owner = "client!dn", name = "l", descriptor = "[I")
	private static final int[] anIntArray94 = new int[5];

	@OriginalMember(owner = "client!dn", name = "m", descriptor = "[Lclient!df;")
	private static final Class50[] aClass50Array1 = new Class50[50];

	@OriginalMember(owner = "client!dn", name = "r", descriptor = "I")
	private static int anInt1252 = 0;

	@OriginalMember(owner = "client!dn", name = "w", descriptor = "I")
	private static int anInt1257 = 0;

	@OriginalMember(owner = "client!dn", name = "z", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray14 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!dn", name = "A", descriptor = "Lclient!of;")
	public static final Class188 aClass188_16 = new Class188(4);

	@OriginalMember(owner = "client!dn", name = "B", descriptor = "[I")
	private static final int[] anIntArray95 = new int[3];

	@OriginalMember(owner = "client!dn", name = "C", descriptor = "I")
	private static int anInt1259 = 0;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!ib;)V")
	public static void method1143(@OriginalArg(0) Class2_Sub18 arg0) {
		method1147(arg0, 200000);
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V")
	public static void method1144(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static195.method2779(arg0)) {
			return;
		}
		@Pc(12) Class93[] local12 = Static188.aClass93ArrayArray4[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class93 local19 = local12[local14];
			if (local19.anObjectArray3 != null) {
				@Pc(26) Class2_Sub18 local26 = new Class2_Sub18();
				local26.aClass93_10 = local19;
				local26.anObjectArray33 = local19.anObjectArray3;
				method1147(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!aa;I)V")
	private static void method1145(@OriginalArg(0) Class2_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		anInt1257 = 0;
		anInt1252 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray5;
		@Pc(11) int[] local11 = arg0.anIntArray4;
		@Pc(13) byte local13 = -1;
		anInt1248 = 0;
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
						method1149(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method1152(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray92[anInt1257++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray92[anInt1257++] = Static63.aClass120_2.anIntArray259[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static63.aClass120_2.method2533(anIntArray92[--anInt1257], local54);
					} else if (local31 == 3) {
						aStringArray12[anInt1252++] = arg0.aStringArray1[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt1257 -= 2;
						if (anIntArray92[anInt1257] != anIntArray92[anInt1257 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt1257 -= 2;
						if (anIntArray92[anInt1257] == anIntArray92[anInt1257 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt1257 -= 2;
						if (anIntArray92[anInt1257] < anIntArray92[anInt1257 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt1257 -= 2;
						if (anIntArray92[anInt1257] > anIntArray92[anInt1257 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt1248 == 0) {
							return;
						}
						@Pc(216) Class50 local216 = aClass50Array1[--anInt1248];
						arg0 = local216.aClass2_Sub1_Sub1_1;
						local8 = arg0.anIntArray5;
						local11 = arg0.anIntArray4;
						local5 = local216.anInt1157;
						anIntArray93 = local216.anIntArray87;
						aStringArray13 = local216.aStringArray11;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray92[anInt1257++] = Static63.aClass120_2.method2526(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static63.aClass120_2.method2528(anIntArray92[--anInt1257], local54);
					} else if (local31 == 31) {
						anInt1257 -= 2;
						if (anIntArray92[anInt1257] <= anIntArray92[anInt1257 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt1257 -= 2;
						if (anIntArray92[anInt1257] >= anIntArray92[anInt1257 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray92[anInt1257++] = anIntArray93[local11[local5]];
					} else if (local31 == 34) {
						anIntArray93[local11[local5]] = anIntArray92[--anInt1257];
					} else if (local31 == 35) {
						aStringArray12[anInt1252++] = aStringArray13[local11[local5]];
					} else if (local31 == 36) {
						aStringArray13[local11[local5]] = aStringArray12[--anInt1252];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt1252 -= local54;
						@Pc(400) String local400 = Static125.method2636(aStringArray12, local54, anInt1252);
						aStringArray12[anInt1252++] = local400;
					} else if (local31 == 38) {
						anInt1257--;
					} else if (local31 == 39) {
						anInt1252--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class2_Sub1_Sub1 local436 = Static246.method3416(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt30];
							@Pc(450) String[] local450 = new String[local436.anInt34];
							for (local452 = 0; local452 < local436.anInt29; local452++) {
								local446[local452] = anIntArray92[anInt1257 + local452 - local436.anInt29];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt28; local471++) {
								local450[local471] = aStringArray12[anInt1252 + local471 - local436.anInt28];
							}
							anInt1257 -= local436.anInt29;
							anInt1252 -= local436.anInt28;
							@Pc(502) Class50 local502 = new Class50();
							local502.aClass2_Sub1_Sub1_1 = arg0;
							local502.anInt1157 = local5;
							local502.anIntArray87 = anIntArray93;
							local502.aStringArray11 = aStringArray13;
							if (anInt1248 >= aClass50Array1.length) {
								throw new RuntimeException();
							}
							aClass50Array1[anInt1248++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray5;
							local11 = local436.anIntArray4;
							local5 = -1;
							anIntArray93 = local446;
							aStringArray13 = local450;
						} else if (local31 == 42) {
							anIntArray92[anInt1257++] = Static388.anIntArray542[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static388.anIntArray542[local54] = anIntArray92[--anInt1257];
							Static390.method5419(local54);
							Static410.aBoolean468 |= Static203.aBooleanArray15[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray92[--anInt1257];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray94[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray36[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray92[--anInt1257];
							if (local603 < 0 || local603 >= anIntArray94[local54]) {
								throw new RuntimeException();
							}
							anIntArray92[anInt1257++] = anIntArrayArray36[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt1257 -= 2;
							local603 = anIntArray92[anInt1257];
							if (local603 < 0 || local603 >= anIntArray94[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray36[local54][local603] = anIntArray92[anInt1257 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static308.aStringArray51[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray12[anInt1252++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static308.aStringArray51[local54] = aStringArray12[--anInt1252];
							Static347.method4901(local54);
						} else if (local31 == 51) {
							@Pc(774) Class220 local774 = arg0.aClass220Array1[local11[local5]];
							@Pc(787) Class2_Sub5 local787 = (Class2_Sub5) local774.method5099((long) anIntArray92[--anInt1257]);
							if (local787 != null) {
								local5 += local787.anInt603;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(855) StringBuffer local855;
			if (arg0.aString1 == null) {
				local855 = new StringBuffer(30);
				local855.append("CS2: ").append(arg0.aLong401).append(" ");
				for (local603 = anInt1248 - 1; local603 >= 0; local603--) {
					local855.append("v: ").append(aClass50Array1[local603].aClass2_Sub1_Sub1_1.aLong401).append(" ");
				}
				local855.append("op: ").append(local13);
				Static22.method402(local837, local855.toString());
			} else {
				Static172.method2536("Clientscript error in: " + arg0.aString1);
				local855 = new StringBuffer(30);
				local855.append("Clientscript error in: ").append(arg0.aString1).append("\n");
				for (local603 = anInt1248 - 1; local603 >= 0; local603--) {
					local855.append("via: ").append(aClass50Array1[local603].aClass2_Sub1_Sub1_1.aString1).append("\n");
				}
				local855.append("Op: ").append(local13).append("\n");
				@Pc(895) String local895 = local837.getMessage();
				if (local895 != null && local895.length() > 0) {
					local855.append("Message: ").append(local895).append("\n");
				}
				Static22.method402(local837, local855.toString());
				Static338.method3179(local855.toString());
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!gf;II)V")
	public static void method1146(@OriginalArg(0) Class91 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class2_Sub1_Sub1 local5 = Static457.method6199(arg2, arg0, arg1);
		if (local5 == null) {
			return;
		}
		anIntArray93 = new int[local5.anInt30];
		aStringArray13 = new String[local5.anInt34];
		if (local5.aClass91_1 == Static86.aClass91_3 || local5.aClass91_1 == Static94.aClass91_13 || local5.aClass91_1 == Static265.aClass91_10) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static415.aClass93_18 != null) {
				local30 = Static415.aClass93_18.anInt2460;
				local32 = Static415.aClass93_18.anInt2448;
			}
			anIntArray93[0] = Static196.aClass126_1.method5366() - local30;
			anIntArray93[1] = Static196.aClass126_1.method5364() - local32;
		}
		method1145(local5, 200000);
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!ib;I)V")
	private static void method1147(@OriginalArg(0) Class2_Sub18 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray33;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class2_Sub1_Sub1 local12 = Static246.method3416(local8);
		if (local12 == null) {
			return;
		}
		anIntArray93 = new int[local12.anInt30];
		@Pc(21) int local21 = 0;
		aStringArray13 = new String[local12.anInt34];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt3059;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt3061;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass93_10 == null ? -1 : arg0.aClass93_10.anInt2508;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt3062;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass93_10 == null ? -1 : arg0.aClass93_10.anInt2424;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass93_9 == null ? -1 : arg0.aClass93_9.anInt2508;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass93_9 == null ? -1 : arg0.aClass93_9.anInt2424;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt3066;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt3064;
				}
				anIntArray93[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString29;
				}
				aStringArray13[local27++] = local135;
			}
		}
		anInt1259 = arg0.anInt3069;
		method1145(local12, arg1);
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(I)Ljava/lang/String;")
	private static String method1148(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar1.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar1.get(5);
		@Pc(20) int local20 = aCalendar1.get(2);
		@Pc(24) int local24 = aCalendar1.get(1);
		return local16 + "-" + aStringArray14[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IZ)V")
	private static void method1149(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class93 local137;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(35) Class93 local35;
		@Pc(158) Class93 local158;
		@Pc(210) Class93 local210;
		@Pc(13) int local13;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt1257 -= 3;
				local13 = anIntArray92[anInt1257];
				local19 = anIntArray92[anInt1257 + 1];
				local25 = anIntArray92[anInt1257 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static160.method2380(local13);
				if (local35.aClass93Array1 == null) {
					local35.aClass93Array1 = new Class93[local25 + 1];
				}
				if (local35.aClass93Array1.length <= local25) {
					@Pc(54) Class93[] local54 = new Class93[local25 + 1];
					for (local56 = 0; local56 < local35.aClass93Array1.length; local56++) {
						local54[local56] = local35.aClass93Array1[local56];
					}
					local35.aClass93Array1 = local54;
				}
				if (local25 > 0 && local35.aClass93Array1[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class93 local99 = new Class93();
				local99.anInt2494 = local19;
				local99.anInt2426 = local99.anInt2508 = local35.anInt2508;
				local99.anInt2424 = local25;
				local35.aClass93Array1[local25] = local99;
				if (arg1) {
					aClass93_5 = local99;
				} else {
					aClass93_4 = local99;
				}
				Static383.method5263(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass93_5 : aClass93_4;
				if (local137.anInt2424 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static160.method2380(local137.anInt2508);
				local158.aClass93Array1[local137.anInt2424] = null;
				Static383.method5263(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static160.method2380(anIntArray92[--anInt1257]);
				local137.aClass93Array1 = null;
				Static383.method5263(local137);
				return;
			}
			if (arg0 == 200) {
				anInt1257 -= 2;
				local13 = anIntArray92[anInt1257];
				local19 = anIntArray92[anInt1257 + 1];
				local210 = Static34.method566(local19, local13);
				if (local210 != null && local19 != -1) {
					anIntArray92[anInt1257++] = 1;
					if (arg1) {
						aClass93_5 = local210;
						return;
					}
					aClass93_4 = local210;
					return;
				}
				anIntArray92[anInt1257++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray92[--anInt1257];
				local158 = Static160.method2380(local13);
				if (local158 != null) {
					anIntArray92[anInt1257++] = 1;
					if (arg1) {
						aClass93_5 = local158;
						return;
					}
					aClass93_4 = local158;
					return;
				}
				anIntArray92[anInt1257++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray92[--anInt1257];
				method1151(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray92[--anInt1257];
				method1150(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt1257 -= 2;
					local13 = anIntArray92[anInt1257];
					local19 = anIntArray92[anInt1257 + 1];
					for (local25 = 0; local25 < Static179.anIntArray265.length; local25++) {
						if (Static179.anIntArray265[local25] == local13) {
							Static127.aClass11_Sub5_Sub2_Sub1_2.aClass26_1.method511(local19, local25, Static421.aClass174_2);
							return;
						}
					}
					for (local353 = 0; local353 < Static350.anIntArray517.length; local353++) {
						if (Static350.anIntArray517[local353] == local13) {
							Static127.aClass11_Sub5_Sub2_Sub1_2.aClass26_1.method511(local19, local353, Static421.aClass174_2);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt1257 -= 2;
					local13 = anIntArray92[anInt1257];
					local19 = anIntArray92[anInt1257 + 1];
					Static127.aClass11_Sub5_Sub2_Sub1_2.aClass26_1.method509(local19, local13);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray92[--anInt1257] != 0;
					Static127.aClass11_Sub5_Sub2_Sub1_2.aClass26_1.method508(local412);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1488) String local1488;
				@Pc(1101) String local1101;
				if (arg0 >= 1100 && arg0 < 1200 || !(arg0 < 2100 || arg0 >= 2200)) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static160.method2380(anIntArray92[--anInt1257]);
					} else {
						local137 = arg1 ? aClass93_5 : aClass93_4;
					}
					if (arg0 == 1100) {
						anInt1257 -= 2;
						local137.anInt2451 = anIntArray92[anInt1257];
						if (local137.anInt2451 > local137.anInt2472 - local137.anInt2436) {
							local137.anInt2451 = local137.anInt2472 - local137.anInt2436;
						}
						if (local137.anInt2451 < 0) {
							local137.anInt2451 = 0;
						}
						local137.anInt2435 = anIntArray92[anInt1257 + 1];
						if (local137.anInt2435 > local137.anInt2450 - local137.anInt2495) {
							local137.anInt2435 = local137.anInt2450 - local137.anInt2495;
						}
						if (local137.anInt2435 < 0) {
							local137.anInt2435 = 0;
						}
						Static383.method5263(local137);
						if (local137.anInt2424 == -1) {
							Static414.method5690(local137.anInt2508);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt2439 = anIntArray92[--anInt1257];
						Static383.method5263(local137);
						if (local137.anInt2424 == -1) {
							Static91.method1395(local137.anInt2508);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean151 = anIntArray92[--anInt1257] == 1;
						Static383.method5263(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt2485 = anIntArray92[--anInt1257];
						Static383.method5263(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt2505 = anIntArray92[--anInt1257];
						Static383.method5263(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray92[--anInt1257];
						if (local137.anInt2467 != local19) {
							local137.anInt2467 = local19;
							Static383.method5263(local137);
						}
						if (local137.anInt2424 == -1) {
							Static462.method3624(local137.anInt2508);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt2501 = anIntArray92[--anInt1257];
						Static383.method5263(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean153 = anIntArray92[--anInt1257] == 1;
						Static383.method5263(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt2431 = 1;
						local137.anInt2512 = anIntArray92[--anInt1257];
						Static383.method5263(local137);
						if (local137.anInt2424 == -1) {
							Static401.method5620(local137.anInt2508);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt1257 -= 6;
						local137.anInt2502 = anIntArray92[anInt1257];
						local137.anInt2491 = anIntArray92[anInt1257 + 1];
						local137.anInt2462 = anIntArray92[anInt1257 + 2];
						local137.anInt2474 = anIntArray92[anInt1257 + 3];
						local137.anInt2465 = anIntArray92[anInt1257 + 4];
						local137.anInt2483 = anIntArray92[anInt1257 + 5];
						Static383.method5263(local137);
						if (local137.anInt2424 == -1) {
							Static104.method1542(local137.anInt2508);
							Static112.method1863(local137.anInt2508);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray92[--anInt1257];
						if (local137.anInt2428 != local19) {
							local137.anInt2428 = local19;
							local137.anInt2438 = 0;
							local137.anInt2455 = 1;
							local137.anInt2433 = 0;
							Static383.method5263(local137);
						}
						if (local137.anInt2424 == -1) {
							Static462.method3623(local137.anInt2508);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean157 = anIntArray92[--anInt1257] == 1;
						Static383.method5263(local137);
						return;
					}
					if (arg0 == 1112) {
						local1101 = aStringArray12[--anInt1252];
						if (!local1101.equals(local137.aString24)) {
							local137.aString24 = local1101;
							Static383.method5263(local137);
						}
						if (local137.anInt2424 == -1) {
							Static384.method5267(local137.anInt2508);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt2446 = anIntArray92[--anInt1257];
						Static383.method5263(local137);
						if (local137.anInt2424 == -1) {
							Static146.method2222(local137.anInt2508);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt1257 -= 3;
						local137.anInt2473 = anIntArray92[anInt1257];
						local137.anInt2427 = anIntArray92[anInt1257 + 1];
						local137.anInt2497 = anIntArray92[anInt1257 + 2];
						Static383.method5263(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean162 = anIntArray92[--anInt1257] == 1;
						Static383.method5263(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt2432 = anIntArray92[--anInt1257];
						Static383.method5263(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt2506 = anIntArray92[--anInt1257];
						Static383.method5263(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean161 = anIntArray92[--anInt1257] == 1;
						Static383.method5263(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean147 = anIntArray92[--anInt1257] == 1;
						Static383.method5263(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt1257 -= 2;
						local137.anInt2472 = anIntArray92[anInt1257];
						local137.anInt2450 = anIntArray92[anInt1257 + 1];
						Static383.method5263(local137);
						if (local137.anInt2494 == 0) {
							Static189.method2742(false, local137);
						}
						return;
					}
					if (arg0 == 1121) {
						anInt1257 -= 2;
						local137.anInt2498 = (short) anIntArray92[anInt1257];
						local137.anInt2484 = (short) anIntArray92[anInt1257 + 1];
						Static383.method5263(local137);
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean159 = anIntArray92[--anInt1257] == 1;
						Static383.method5263(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt2483 = anIntArray92[--anInt1257];
						Static383.method5263(local137);
						if (local137.anInt2424 == -1) {
							Static104.method1542(local137.anInt2508);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray92[--anInt1257];
						local137.aBoolean148 = local19 == 1;
						Static383.method5263(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt1257 -= 2;
						local137.anInt2493 = anIntArray92[anInt1257];
						local137.anInt2470 = anIntArray92[anInt1257 + 1];
						Static383.method5263(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt2458 = anIntArray92[--anInt1257];
						Static383.method5263(local137);
						return;
					}
					@Pc(1454) Class198 local1454;
					if (arg0 == 1127) {
						anInt1257 -= 2;
						local19 = anIntArray92[anInt1257];
						local25 = anIntArray92[anInt1257 + 1];
						local1454 = Static275.aClass235_1.method5382(local19);
						if (local25 != local1454.anInt5653) {
							local137.method2123(local19, local25);
							return;
						}
						local137.method2125(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray92[--anInt1257];
						local1488 = aStringArray12[--anInt1252];
						local1454 = Static275.aClass235_1.method5382(local19);
						if (!local1454.aString55.equals(local1488)) {
							local137.method2115(local19, local1488);
							return;
						}
						local137.method2125(local19);
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2290) int local2290;
					if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
						if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
							if (arg0 >= 2000) {
								arg0 -= 1000;
								local137 = Static160.method2380(anIntArray92[--anInt1257]);
							} else {
								local137 = arg1 ? aClass93_5 : aClass93_4;
							}
							local1101 = aStringArray12[--anInt1252];
							@Pc(2369) int[] local2369 = null;
							if (local1101.length() > 0 && local1101.charAt(local1101.length() - 1) == 'Y') {
								local353 = anIntArray92[--anInt1257];
								if (local353 > 0) {
									local2369 = new int[local353];
									while (local353-- > 0) {
										local2369[local353] = anIntArray92[--anInt1257];
									}
								}
								local1101 = local1101.substring(0, local1101.length() - 1);
							}
							@Pc(2421) Object[] local2421 = new Object[local1101.length() + 1];
							for (local2290 = local2421.length - 1; local2290 >= 1; local2290--) {
								if (local1101.charAt(local2290 - 1) == 's') {
									local2421[local2290] = aStringArray12[--anInt1252];
								} else {
									local2421[local2290] = Integer.valueOf(anIntArray92[--anInt1257]);
								}
							}
							local56 = anIntArray92[--anInt1257];
							if (local56 == -1) {
								local2421 = null;
							} else {
								local2421[0] = Integer.valueOf(local56);
							}
							if (arg0 == 1400) {
								local137.anObjectArray31 = local2421;
							} else if (arg0 == 1401) {
								local137.anObjectArray32 = local2421;
							} else if (arg0 == 1402) {
								local137.anObjectArray13 = local2421;
							} else if (arg0 == 1403) {
								local137.anObjectArray6 = local2421;
							} else if (arg0 == 1404) {
								local137.anObjectArray7 = local2421;
							} else if (arg0 == 1405) {
								local137.anObjectArray14 = local2421;
							} else if (arg0 == 1406) {
								local137.anObjectArray8 = local2421;
							} else if (arg0 == 1407) {
								local137.anObjectArray12 = local2421;
								local137.lb = local2369;
							} else if (arg0 == 1408) {
								local137.anObjectArray24 = local2421;
							} else if (arg0 == 1409) {
								local137.anObjectArray10 = local2421;
							} else if (arg0 == 1410) {
								local137.anObjectArray22 = local2421;
							} else if (arg0 == 1411) {
								local137.anObjectArray20 = local2421;
							} else if (arg0 == 1412) {
								local137.anObjectArray27 = local2421;
							} else if (arg0 == 1414) {
								local137.anObjectArray9 = local2421;
								local137.anIntArray206 = local2369;
							} else if (arg0 == 1415) {
								local137.anObjectArray16 = local2421;
								local137.anIntArray201 = local2369;
							} else if (arg0 == 1416) {
								local137.anObjectArray29 = local2421;
							} else if (arg0 == 1417) {
								local137.anObjectArray11 = local2421;
							} else if (arg0 == 1418) {
								local137.anObjectArray28 = local2421;
							} else if (arg0 == 1419) {
								local137.anObjectArray21 = local2421;
							} else if (arg0 == 1420) {
								local137.anObjectArray19 = local2421;
							} else if (arg0 == 1421) {
								local137.anObjectArray30 = local2421;
							} else if (arg0 == 1422) {
								local137.anObjectArray25 = local2421;
							} else if (arg0 == 1423) {
								local137.anObjectArray17 = local2421;
							} else if (arg0 == 1424) {
								local137.anObjectArray15 = local2421;
							} else if (arg0 == 1425) {
								local137.anObjectArray2 = local2421;
							} else if (arg0 == 1426) {
								local137.anObjectArray23 = local2421;
							} else if (arg0 == 1427) {
								local137.anObjectArray18 = local2421;
							} else if (arg0 == 1428) {
								local137.anObjectArray5 = local2421;
								local137.anIntArray199 = local2369;
							} else if (arg0 == 1429) {
								local137.anObjectArray4 = local2421;
								local137.anIntArray203 = local2369;
							} else if (arg0 == 1430) {
								local137.anObjectArray26 = local2421;
							}
							local137.aBoolean158 = true;
							return;
						}
						if (arg0 < 1600) {
							local137 = arg1 ? aClass93_5 : aClass93_4;
							if (arg0 == 1500) {
								anIntArray92[anInt1257++] = local137.anInt2460;
								return;
							}
							if (arg0 == 1501) {
								anIntArray92[anInt1257++] = local137.anInt2448;
								return;
							}
							if (arg0 == 1502) {
								anIntArray92[anInt1257++] = local137.anInt2436;
								return;
							}
							if (arg0 == 1503) {
								anIntArray92[anInt1257++] = local137.anInt2495;
								return;
							}
							if (arg0 == 1504) {
								anIntArray92[anInt1257++] = local137.aBoolean160 ? 1 : 0;
								return;
							}
							if (arg0 == 1505) {
								anIntArray92[anInt1257++] = local137.anInt2426;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static345.method4859(local137);
								anIntArray92[anInt1257++] = local158 == null ? -1 : local158.anInt2508;
								return;
							}
						} else {
							@Pc(3017) Class198 local3017;
							if (arg0 < 1700) {
								local137 = arg1 ? aClass93_5 : aClass93_4;
								if (arg0 == 1600) {
									anIntArray92[anInt1257++] = local137.anInt2451;
									return;
								}
								if (arg0 == 1601) {
									anIntArray92[anInt1257++] = local137.anInt2435;
									return;
								}
								if (arg0 == 1602) {
									aStringArray12[anInt1252++] = local137.aString24;
									return;
								}
								if (arg0 == 1603) {
									anIntArray92[anInt1257++] = local137.anInt2472;
									return;
								}
								if (arg0 == 1604) {
									anIntArray92[anInt1257++] = local137.anInt2450;
									return;
								}
								if (arg0 == 1605) {
									anIntArray92[anInt1257++] = local137.anInt2483;
									return;
								}
								if (arg0 == 1606) {
									anIntArray92[anInt1257++] = local137.anInt2462;
									return;
								}
								if (arg0 == 1607) {
									anIntArray92[anInt1257++] = local137.anInt2465;
									return;
								}
								if (arg0 == 1608) {
									anIntArray92[anInt1257++] = local137.anInt2474;
									return;
								}
								if (arg0 == 1609) {
									anIntArray92[anInt1257++] = local137.anInt2485;
									return;
								}
								if (arg0 == 1610) {
									anIntArray92[anInt1257++] = local137.anInt2502;
									return;
								}
								if (arg0 == 1611) {
									anIntArray92[anInt1257++] = local137.anInt2491;
									return;
								}
								if (arg0 == 1612) {
									anIntArray92[anInt1257++] = local137.anInt2467;
									return;
								}
								if (arg0 == 1613) {
									local19 = anIntArray92[--anInt1257];
									local3017 = Static275.aClass235_1.method5382(local19);
									if (local3017.method4491()) {
										aStringArray12[anInt1252++] = local137.method2121(local19, local3017.aString55);
										return;
									}
									anIntArray92[anInt1257++] = local137.method2118(local3017.anInt5653, local19);
									return;
								}
							} else if (arg0 < 1800) {
								local137 = arg1 ? aClass93_5 : aClass93_4;
								if (arg0 == 1700) {
									anIntArray92[anInt1257++] = local137.anInt2488;
									return;
								}
								if (arg0 == 1701) {
									if (local137.anInt2488 != -1) {
										anIntArray92[anInt1257++] = local137.anInt2466;
										return;
									}
									anIntArray92[anInt1257++] = 0;
									return;
								}
								if (arg0 == 1702) {
									anIntArray92[anInt1257++] = local137.anInt2424;
									return;
								}
							} else if (arg0 < 1900) {
								local137 = arg1 ? aClass93_5 : aClass93_4;
								if (arg0 == 1800) {
									anIntArray92[anInt1257++] = Static53.method860(local137).method5901();
									return;
								}
								if (arg0 == 1801) {
									local19 = anIntArray92[--anInt1257];
									local19--;
									if (local137.aStringArray28 != null && local19 < local137.aStringArray28.length && local137.aStringArray28[local19] != null) {
										aStringArray12[anInt1252++] = local137.aStringArray28[local19];
										return;
									}
									aStringArray12[anInt1252++] = "";
									return;
								}
								if (arg0 == 1802) {
									if (local137.aString21 == null) {
										aStringArray12[anInt1252++] = "";
										return;
									}
									aStringArray12[anInt1252++] = local137.aString21;
									return;
								}
							} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
								if (arg0 >= 2000) {
									local137 = Static160.method2380(anIntArray92[--anInt1257]);
									arg0 -= 1000;
								} else {
									local137 = arg1 ? aClass93_5 : aClass93_4;
								}
								if (anInt1259 >= 10) {
									throw new RuntimeException("C29xx-1");
								}
								if (arg0 == 1927) {
									if (local137.anObjectArray18 == null) {
										return;
									}
									@Pc(3254) Class2_Sub18 local3254 = new Class2_Sub18();
									local3254.aClass93_10 = local137;
									local3254.anObjectArray33 = local137.anObjectArray18;
									local3254.anInt3069 = anInt1259 + 1;
									Static406.aClass181_46.method3973(local3254);
									return;
								}
							} else if (arg0 < 2600) {
								local137 = Static160.method2380(anIntArray92[--anInt1257]);
								if (arg0 == 2500) {
									anIntArray92[anInt1257++] = local137.anInt2460;
									return;
								}
								if (arg0 == 2501) {
									anIntArray92[anInt1257++] = local137.anInt2448;
									return;
								}
								if (arg0 == 2502) {
									anIntArray92[anInt1257++] = local137.anInt2436;
									return;
								}
								if (arg0 == 2503) {
									anIntArray92[anInt1257++] = local137.anInt2495;
									return;
								}
								if (arg0 == 2504) {
									anIntArray92[anInt1257++] = local137.aBoolean160 ? 1 : 0;
									return;
								}
								if (arg0 == 2505) {
									anIntArray92[anInt1257++] = local137.anInt2426;
									return;
								}
								if (arg0 == 1506) {
									local158 = Static345.method4859(local137);
									anIntArray92[anInt1257++] = local158 == null ? -1 : local158.anInt2508;
									return;
								}
							} else if (arg0 < 2700) {
								local137 = Static160.method2380(anIntArray92[--anInt1257]);
								if (arg0 == 2600) {
									anIntArray92[anInt1257++] = local137.anInt2451;
									return;
								}
								if (arg0 == 2601) {
									anIntArray92[anInt1257++] = local137.anInt2435;
									return;
								}
								if (arg0 == 2602) {
									aStringArray12[anInt1252++] = local137.aString24;
									return;
								}
								if (arg0 == 2603) {
									anIntArray92[anInt1257++] = local137.anInt2472;
									return;
								}
								if (arg0 == 2604) {
									anIntArray92[anInt1257++] = local137.anInt2450;
									return;
								}
								if (arg0 == 2605) {
									anIntArray92[anInt1257++] = local137.anInt2483;
									return;
								}
								if (arg0 == 2606) {
									anIntArray92[anInt1257++] = local137.anInt2462;
									return;
								}
								if (arg0 == 2607) {
									anIntArray92[anInt1257++] = local137.anInt2465;
									return;
								}
								if (arg0 == 2608) {
									anIntArray92[anInt1257++] = local137.anInt2474;
									return;
								}
								if (arg0 == 2609) {
									anIntArray92[anInt1257++] = local137.anInt2485;
									return;
								}
								if (arg0 == 2610) {
									anIntArray92[anInt1257++] = local137.anInt2502;
									return;
								}
								if (arg0 == 2611) {
									anIntArray92[anInt1257++] = local137.anInt2491;
									return;
								}
								if (arg0 == 2612) {
									anIntArray92[anInt1257++] = local137.anInt2467;
									return;
								}
							} else {
								@Pc(3751) Class2_Sub9 local3751;
								@Pc(3649) Class2_Sub9 local3649;
								if (arg0 < 2800) {
									if (arg0 == 2700) {
										local137 = Static160.method2380(anIntArray92[--anInt1257]);
										anIntArray92[anInt1257++] = local137.anInt2488;
										return;
									}
									if (arg0 == 2701) {
										local137 = Static160.method2380(anIntArray92[--anInt1257]);
										if (local137.anInt2488 != -1) {
											anIntArray92[anInt1257++] = local137.anInt2466;
											return;
										}
										anIntArray92[anInt1257++] = 0;
										return;
									}
									if (arg0 == 2702) {
										local13 = anIntArray92[--anInt1257];
										local3649 = (Class2_Sub9) Static394.aClass220_45.method5099((long) local13);
										if (local3649 != null) {
											anIntArray92[anInt1257++] = 1;
											return;
										}
										anIntArray92[anInt1257++] = 0;
										return;
									}
									if (arg0 == 2703) {
										local137 = Static160.method2380(anIntArray92[--anInt1257]);
										if (local137.aClass93Array1 == null) {
											anIntArray92[anInt1257++] = 0;
											return;
										}
										local19 = local137.aClass93Array1.length;
										for (local25 = 0; local25 < local137.aClass93Array1.length; local25++) {
											if (local137.aClass93Array1[local25] == null) {
												local19 = local25;
												break;
											}
										}
										anIntArray92[anInt1257++] = local19;
										return;
									}
									if (arg0 == 2704 || arg0 == 2705) {
										anInt1257 -= 2;
										local13 = anIntArray92[anInt1257];
										local19 = anIntArray92[anInt1257 + 1];
										local3751 = (Class2_Sub9) Static394.aClass220_45.method5099((long) local13);
										if (local3751 != null && local3751.anInt1143 == local19) {
											anIntArray92[anInt1257++] = 1;
											return;
										}
										anIntArray92[anInt1257++] = 0;
										return;
									}
								} else if (arg0 < 2900) {
									local137 = Static160.method2380(anIntArray92[--anInt1257]);
									if (arg0 == 2800) {
										anIntArray92[anInt1257++] = Static53.method860(local137).method5901();
										return;
									}
									if (arg0 == 2801) {
										local19 = anIntArray92[--anInt1257];
										local19--;
										if (local137.aStringArray28 != null && local19 < local137.aStringArray28.length && local137.aStringArray28[local19] != null) {
											aStringArray12[anInt1252++] = local137.aStringArray28[local19];
											return;
										}
										aStringArray12[anInt1252++] = "";
										return;
									}
									if (arg0 == 2802) {
										if (local137.aString21 == null) {
											aStringArray12[anInt1252++] = "";
											return;
										}
										aStringArray12[anInt1252++] = local137.aString21;
										return;
									}
								} else {
									@Pc(3888) String local3888;
									if (arg0 < 3200) {
										if (arg0 == 3100) {
											local3888 = aStringArray12[--anInt1252];
											Static172.method2536(local3888);
											return;
										}
										if (arg0 == 3101) {
											anInt1257 -= 2;
											Static16.method4091(Static127.aClass11_Sub5_Sub2_Sub1_2, anIntArray92[anInt1257 + 1], anIntArray92[anInt1257]);
											return;
										}
										if (arg0 == 3103) {
											Static86.method1338();
											return;
										}
										if (arg0 == 3104) {
											local3888 = aStringArray12[--anInt1252];
											local19 = 0;
											if (Static117.method1916(local3888)) {
												local19 = Static389.method5412(local3888);
											}
											Static164.method2403(Static74.aClass208_16);
											Static389.aClass2_Sub17_Sub1_2.method6170(local19);
											return;
										}
										if (arg0 == 3105) {
											local3888 = aStringArray12[--anInt1252];
											Static164.method2403(Static344.aClass208_80);
											Static389.aClass2_Sub17_Sub1_2.method6172(local3888.length() + 1);
											Static389.aClass2_Sub17_Sub1_2.method6151(local3888);
											return;
										}
										if (arg0 == 3106) {
											local3888 = aStringArray12[--anInt1252];
											Static164.method2403(Static191.aClass208_53);
											Static389.aClass2_Sub17_Sub1_2.method6172(local3888.length() + 1);
											Static389.aClass2_Sub17_Sub1_2.method6151(local3888);
											return;
										}
										if (arg0 == 3107) {
											local13 = anIntArray92[--anInt1257];
											local1101 = aStringArray12[--anInt1252];
											Static81.method1196(local1101, local13);
											return;
										}
										if (arg0 == 3108) {
											anInt1257 -= 3;
											local13 = anIntArray92[anInt1257];
											local19 = anIntArray92[anInt1257 + 1];
											local25 = anIntArray92[anInt1257 + 2];
											local35 = Static160.method2380(local25);
											Static306.method4379(local19, local35, local13);
											return;
										}
										if (arg0 == 3109) {
											anInt1257 -= 2;
											local13 = anIntArray92[anInt1257];
											local19 = anIntArray92[anInt1257 + 1];
											local210 = arg1 ? aClass93_5 : aClass93_4;
											Static306.method4379(local19, local210, local13);
											return;
										}
										if (arg0 == 3110) {
											local13 = anIntArray92[--anInt1257];
											Static164.method2403(Static401.aClass208_98);
											Static389.aClass2_Sub17_Sub1_2.method6130(local13);
											return;
										}
										if (arg0 == 3111) {
											anInt1257 -= 2;
											local13 = anIntArray92[anInt1257];
											local19 = anIntArray92[anInt1257 + 1];
											local3751 = (Class2_Sub9) Static394.aClass220_45.method5099((long) local13);
											if (local3751 != null) {
												Static343.method2399(local3751.anInt1143 != local19, local3751, true);
											}
											Static220.method3068(true, local19, 3, local13);
											return;
										}
										if (arg0 == 3112) {
											anInt1257--;
											local13 = anIntArray92[anInt1257];
											local3649 = (Class2_Sub9) Static394.aClass220_45.method5099((long) local13);
											if (local3649 != null && local3649.anInt1142 == 3) {
												Static343.method2399(true, local3649, true);
											}
											return;
										}
										if (arg0 == 3113) {
											Static262.method3689(aStringArray12[--anInt1252]);
											return;
										}
										if (arg0 == 3114) {
											anInt1257 -= 2;
											local13 = anIntArray92[anInt1257];
											local19 = anIntArray92[anInt1257 + 1];
											local1488 = aStringArray12[--anInt1252];
											Static94.method4447("", "", local1488, local13, local19);
											return;
										}
									} else if (arg0 < 3300) {
										if (arg0 == 3200) {
											anInt1257 -= 3;
											Static448.method6077(255, anIntArray92[anInt1257 + 1], anIntArray92[anInt1257], anIntArray92[anInt1257 + 2]);
											return;
										}
										if (arg0 == 3201) {
											Static361.method5095(anIntArray92[--anInt1257], 50, 255);
											return;
										}
										if (arg0 == 3202) {
											anInt1257 -= 2;
											Static328.method4680(anIntArray92[anInt1257 + 1], anIntArray92[anInt1257], 255);
											return;
										}
										if (arg0 == 3203) {
											anInt1257 -= 4;
											Static448.method6077(anIntArray92[anInt1257 + 3], anIntArray92[anInt1257 + 1], anIntArray92[anInt1257], anIntArray92[anInt1257 + 2]);
											return;
										}
										if (arg0 == 3204) {
											anInt1257 -= 3;
											Static361.method5095(anIntArray92[anInt1257], anIntArray92[anInt1257 + 2], anIntArray92[anInt1257 + 1]);
											return;
										}
										if (arg0 == 3205) {
											anInt1257 -= 3;
											Static328.method4680(anIntArray92[anInt1257 + 1], anIntArray92[anInt1257], anIntArray92[anInt1257 + 2]);
											return;
										}
										if (arg0 == 3206) {
											anInt1257 -= 4;
											Static401.method5618(anIntArray92[anInt1257 + 2], anIntArray92[anInt1257 + 3], anIntArray92[anInt1257 + 1], anIntArray92[anInt1257]);
											return;
										}
									} else if (arg0 < 3400) {
										if (arg0 == 3300) {
											anIntArray92[anInt1257++] = Static277.anInt5022;
											return;
										}
										if (arg0 == 3301) {
											anInt1257 -= 2;
											local13 = anIntArray92[anInt1257];
											local19 = anIntArray92[anInt1257 + 1];
											anIntArray92[anInt1257++] = Static260.method3681(local19, false, local13);
											return;
										}
										if (arg0 == 3302) {
											anInt1257 -= 2;
											local13 = anIntArray92[anInt1257];
											local19 = anIntArray92[anInt1257 + 1];
											anIntArray92[anInt1257++] = Static79.method1185(local19, local13, false);
											return;
										}
										if (arg0 == 3303) {
											anInt1257 -= 2;
											local13 = anIntArray92[anInt1257];
											local19 = anIntArray92[anInt1257 + 1];
											anIntArray92[anInt1257++] = Static338.method3181(local19, false, local13);
											return;
										}
										if (arg0 == 3304) {
											local13 = anIntArray92[--anInt1257];
											anIntArray92[anInt1257++] = Static106.aClass245_1.method5648(local13).anInt4234;
											return;
										}
										if (arg0 == 3305) {
											local13 = anIntArray92[--anInt1257];
											anIntArray92[anInt1257++] = Static13.anIntArray34[local13];
											return;
										}
										if (arg0 == 3306) {
											local13 = anIntArray92[--anInt1257];
											anIntArray92[anInt1257++] = Static322.anIntArray484[local13];
											return;
										}
										if (arg0 == 3307) {
											local13 = anIntArray92[--anInt1257];
											anIntArray92[anInt1257++] = Static194.anIntArray279[local13];
											return;
										}
										if (arg0 == 3308) {
											@Pc(4605) byte local4605 = Static127.aClass11_Sub5_Sub2_Sub1_2.aByte101;
											local19 = (Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7626 >> 7) + Static386.anInt7205;
											local25 = (Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7622 >> 7) + Static153.anInt2798;
											anIntArray92[anInt1257++] = (local4605 << 28) + (local19 << 14) + local25;
											return;
										}
										if (arg0 == 3309) {
											local13 = anIntArray92[--anInt1257];
											anIntArray92[anInt1257++] = local13 >> 14 & 0x3FFF;
											return;
										}
										if (arg0 == 3310) {
											local13 = anIntArray92[--anInt1257];
											anIntArray92[anInt1257++] = local13 >> 28;
											return;
										}
										if (arg0 == 3311) {
											local13 = anIntArray92[--anInt1257];
											anIntArray92[anInt1257++] = local13 & 0x3FFF;
											return;
										}
										if (arg0 == 3312) {
											anIntArray92[anInt1257++] = Static183.aBoolean205 ? 1 : 0;
											return;
										}
										if (arg0 == 3313) {
											anInt1257 -= 2;
											local13 = anIntArray92[anInt1257];
											local19 = anIntArray92[anInt1257 + 1];
											anIntArray92[anInt1257++] = Static260.method3681(local19, true, local13);
											return;
										}
										if (arg0 == 3314) {
											anInt1257 -= 2;
											local13 = anIntArray92[anInt1257];
											local19 = anIntArray92[anInt1257 + 1];
											anIntArray92[anInt1257++] = Static79.method1185(local19, local13, true);
											return;
										}
										if (arg0 == 3315) {
											anInt1257 -= 2;
											local13 = anIntArray92[anInt1257];
											local19 = anIntArray92[anInt1257 + 1];
											anIntArray92[anInt1257++] = Static338.method3181(local19, true, local13);
											return;
										}
										if (arg0 == 3316) {
											if (Static81.anInt1300 >= 2) {
												anIntArray92[anInt1257++] = Static81.anInt1300;
												return;
											}
											anIntArray92[anInt1257++] = 0;
											return;
										}
										if (arg0 == 3317) {
											anIntArray92[anInt1257++] = Static292.anInt5209;
											return;
										}
										if (arg0 == 3318) {
											anIntArray92[anInt1257++] = Static163.aClass263_3.anInt7387;
											return;
										}
										if (arg0 == 3321) {
											anIntArray92[anInt1257++] = Static104.anInt1682;
											return;
										}
										if (arg0 == 3322) {
											anIntArray92[anInt1257++] = Static361.anInt6411;
											return;
										}
										if (arg0 == 3323) {
											if (Static211.anInt3616 >= 5 && Static211.anInt3616 <= 9) {
												anIntArray92[anInt1257++] = 1;
												return;
											}
											anIntArray92[anInt1257++] = 0;
											return;
										}
										if (arg0 == 3324) {
											if (Static211.anInt3616 >= 5 && Static211.anInt3616 <= 9) {
												anIntArray92[anInt1257++] = Static211.anInt3616;
												return;
											}
											anIntArray92[anInt1257++] = 0;
											return;
										}
										if (arg0 == 3325) {
											anIntArray92[anInt1257++] = Static354.aBoolean431 ? 1 : 0;
											return;
										}
										if (arg0 == 3326) {
											anIntArray92[anInt1257++] = Static127.aClass11_Sub5_Sub2_Sub1_2.anInt2410;
											return;
										}
										if (arg0 == 3327) {
											anIntArray92[anInt1257++] = Static127.aClass11_Sub5_Sub2_Sub1_2.aClass26_1.aBoolean22 ? 1 : 0;
											return;
										}
										if (arg0 == 3329) {
											anIntArray92[anInt1257++] = Static46.aBoolean36 ? 1 : 0;
											return;
										}
										if (arg0 == 3330) {
											local13 = anIntArray92[--anInt1257];
											anIntArray92[anInt1257++] = Static302.method4312(local13);
											return;
										}
										if (arg0 == 3331) {
											anInt1257 -= 2;
											local13 = anIntArray92[anInt1257];
											local19 = anIntArray92[anInt1257 + 1];
											anIntArray92[anInt1257++] = Static451.method5762(false, local19, local13);
											return;
										}
										if (arg0 == 3332) {
											anInt1257 -= 2;
											local13 = anIntArray92[anInt1257];
											local19 = anIntArray92[anInt1257 + 1];
											anIntArray92[anInt1257++] = Static451.method5762(true, local19, local13);
											return;
										}
										if (arg0 == 3333) {
											anIntArray92[anInt1257++] = Static199.anInt3422;
											return;
										}
										if (arg0 == 3335) {
											anIntArray92[anInt1257++] = Static80.anInt6195;
											return;
										}
										if (arg0 == 3336) {
											anInt1257 -= 4;
											local13 = anIntArray92[anInt1257];
											local19 = anIntArray92[anInt1257 + 1];
											local25 = anIntArray92[anInt1257 + 2];
											local353 = anIntArray92[anInt1257 + 3];
											local13 += local19 << 14;
											local13 += local25 << 28;
											local13 += local353;
											anIntArray92[anInt1257++] = local13;
											return;
										}
										if (arg0 == 3337) {
											anIntArray92[anInt1257++] = Static451.anInt7181;
											return;
										}
										if (arg0 == 3338) {
											anIntArray92[anInt1257++] = Static135.method1391();
											return;
										}
										if (arg0 == 3339) {
											anIntArray92[anInt1257++] = Static358.aBoolean503 ? 1 : 0;
											return;
										}
										if (arg0 == 3340) {
											anIntArray92[anInt1257++] = Static159.aBoolean182 ? 1 : 0;
											return;
										}
										if (arg0 == 3341) {
											anIntArray92[anInt1257++] = Static179.aBoolean201 ? 1 : 0;
											return;
										}
									} else if (arg0 < 3500) {
										@Pc(5261) Class221 local5261;
										if (arg0 == 3400) {
											anInt1257 -= 2;
											local13 = anIntArray92[anInt1257];
											local19 = anIntArray92[anInt1257 + 1];
											local5261 = Static384.aClass162_1.method3228(local13);
											aStringArray12[anInt1252++] = local5261.method5114(local19);
											return;
										}
										if (arg0 == 3408) {
											anInt1257 -= 4;
											local13 = anIntArray92[anInt1257];
											local19 = anIntArray92[anInt1257 + 1];
											local25 = anIntArray92[anInt1257 + 2];
											local353 = anIntArray92[anInt1257 + 3];
											@Pc(5307) Class221 local5307 = Static384.aClass162_1.method3228(local25);
											if (local5307.aChar4 == local13 && local5307.aChar5 == local19) {
												if (local19 == 115) {
													aStringArray12[anInt1252++] = local5307.method5114(local353);
													return;
												}
												anIntArray92[anInt1257++] = local5307.method5109(local353);
												return;
											}
											throw new RuntimeException("C3408-1");
										}
										if (arg0 == 3409) {
											anInt1257 -= 3;
											local13 = anIntArray92[anInt1257];
											local19 = anIntArray92[anInt1257 + 1];
											local25 = anIntArray92[anInt1257 + 2];
											if (local19 == -1) {
												throw new RuntimeException("C3409-2");
											}
											@Pc(5383) Class221 local5383 = Static384.aClass162_1.method3228(local19);
											if (local5383.aChar5 != local13) {
												throw new RuntimeException("C3409-1");
											}
											anIntArray92[anInt1257++] = local5383.method5113(local25) ? 1 : 0;
											return;
										}
										if (arg0 == 3410) {
											local13 = anIntArray92[--anInt1257];
											local1101 = aStringArray12[--anInt1252];
											if (local13 == -1) {
												throw new RuntimeException("C3410-2");
											}
											local5261 = Static384.aClass162_1.method3228(local13);
											if (local5261.aChar5 != 's') {
												throw new RuntimeException("C3410-1");
											}
											anIntArray92[anInt1257++] = local5261.method5117(local1101) ? 1 : 0;
											return;
										}
										if (arg0 == 3411) {
											local13 = anIntArray92[--anInt1257];
											@Pc(5481) Class221 local5481 = Static384.aClass162_1.method3228(local13);
											anIntArray92[anInt1257++] = local5481.aClass220_36.method5103();
											return;
										}
									} else if (arg0 < 3700) {
										if (arg0 == 3600) {
											if (Static130.anInt2196 == 0) {
												anIntArray92[anInt1257++] = -2;
												return;
											}
											if (Static130.anInt2196 == 1) {
												anIntArray92[anInt1257++] = -1;
												return;
											}
											anIntArray92[anInt1257++] = Static259.anInt4591;
											return;
										}
										if (arg0 == 3601) {
											local13 = anIntArray92[--anInt1257];
											if (Static130.anInt2196 == 2 && local13 < Static259.anInt4591) {
												aStringArray12[anInt1252++] = Static449.aStringArray67[local13];
												if (Static197.aStringArray41[local13] != null) {
													aStringArray12[anInt1252++] = Static197.aStringArray41[local13];
													return;
												}
												aStringArray12[anInt1252++] = "";
												return;
											}
											aStringArray12[anInt1252++] = "";
											aStringArray12[anInt1252++] = "";
											return;
										}
										if (arg0 == 3602) {
											local13 = anIntArray92[--anInt1257];
											if (Static130.anInt2196 == 2 && local13 < Static259.anInt4591) {
												anIntArray92[anInt1257++] = Static110.anIntArray137[local13];
												return;
											}
											anIntArray92[anInt1257++] = 0;
											return;
										}
										if (arg0 == 3603) {
											local13 = anIntArray92[--anInt1257];
											if (Static130.anInt2196 == 2 && local13 < Static259.anInt4591) {
												anIntArray92[anInt1257++] = Static142.anIntArray222[local13];
												return;
											}
											anIntArray92[anInt1257++] = 0;
											return;
										}
										if (arg0 == 3604) {
											local3888 = aStringArray12[--anInt1252];
											local19 = anIntArray92[--anInt1257];
											Static252.method3491(local3888, local19);
											return;
										}
										if (arg0 == 3605) {
											local3888 = aStringArray12[--anInt1252];
											Static207.method2915(local3888);
											return;
										}
										if (arg0 == 3606) {
											local3888 = aStringArray12[--anInt1252];
											Static345.method4860(local3888);
											return;
										}
										if (arg0 == 3607) {
											local3888 = aStringArray12[--anInt1252];
											Static224.method3091(false, local3888);
											return;
										}
										if (arg0 == 3608) {
											local3888 = aStringArray12[--anInt1252];
											Static178.method2592(local3888);
											return;
										}
										if (arg0 == 3609) {
											local3888 = aStringArray12[--anInt1252];
											if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
												local3888 = local3888.substring(7);
											}
											anIntArray92[anInt1257++] = Static267.method3707(local3888) ? 1 : 0;
											return;
										}
										if (arg0 == 3610) {
											local13 = anIntArray92[--anInt1257];
											if (Static130.anInt2196 == 2 && local13 < Static259.anInt4591) {
												aStringArray12[anInt1252++] = Static142.aStringArray30[local13];
												return;
											}
											aStringArray12[anInt1252++] = "";
											return;
										}
										if (arg0 == 3611) {
											if (Static242.aString35 != null) {
												aStringArray12[anInt1252++] = Static213.method3020(Static242.aString35);
												return;
											}
											aStringArray12[anInt1252++] = "";
											return;
										}
										if (arg0 == 3612) {
											if (Static242.aString35 != null) {
												anIntArray92[anInt1257++] = Static6.anInt110;
												return;
											}
											anIntArray92[anInt1257++] = 0;
											return;
										}
										if (arg0 == 3613) {
											local13 = anIntArray92[--anInt1257];
											if (Static242.aString35 != null && local13 < Static6.anInt110) {
												aStringArray12[anInt1252++] = Static57.aClass29Array1[local13].aString6;
												return;
											}
											aStringArray12[anInt1252++] = "";
											return;
										}
										if (arg0 == 3614) {
											local13 = anIntArray92[--anInt1257];
											if (Static242.aString35 != null && local13 < Static6.anInt110) {
												anIntArray92[anInt1257++] = Static57.aClass29Array1[local13].anInt607;
												return;
											}
											anIntArray92[anInt1257++] = 0;
											return;
										}
										if (arg0 == 3615) {
											local13 = anIntArray92[--anInt1257];
											if (Static242.aString35 != null && local13 < Static6.anInt110) {
												anIntArray92[anInt1257++] = Static57.aClass29Array1[local13].aByte1;
												return;
											}
											anIntArray92[anInt1257++] = 0;
											return;
										}
										if (arg0 == 3616) {
											anIntArray92[anInt1257++] = Static251.aByte63;
											return;
										}
										if (arg0 == 3617) {
											local3888 = aStringArray12[--anInt1252];
											Static448.method6074(local3888);
											return;
										}
										if (arg0 == 3618) {
											anIntArray92[anInt1257++] = Static369.aByte81;
											return;
										}
										if (arg0 == 3619) {
											local3888 = aStringArray12[--anInt1252];
											Static263.method3693(local3888);
											return;
										}
										if (arg0 == 3620) {
											Static260.method3680();
											return;
										}
										if (arg0 == 3621) {
											if (Static130.anInt2196 == 0) {
												anIntArray92[anInt1257++] = -1;
												return;
											}
											anIntArray92[anInt1257++] = Static127.anInt2142;
											return;
										}
										if (arg0 == 3622) {
											local13 = anIntArray92[--anInt1257];
											if (Static130.anInt2196 != 0 && local13 < Static127.anInt2142) {
												aStringArray12[anInt1252++] = Static268.aStringArray47[local13];
												if (Static80.aStringArray58[local13] != null) {
													aStringArray12[anInt1252++] = Static80.aStringArray58[local13];
													return;
												}
												aStringArray12[anInt1252++] = "";
												return;
											}
											aStringArray12[anInt1252++] = "";
											aStringArray12[anInt1252++] = "";
											return;
										}
										if (arg0 == 3623) {
											local3888 = aStringArray12[--anInt1252];
											if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
												local3888 = local3888.substring(7);
											}
											anIntArray92[anInt1257++] = Static27.method463(local3888) ? 1 : 0;
											return;
										}
										if (arg0 == 3624) {
											local13 = anIntArray92[--anInt1257];
											if (Static57.aClass29Array1 != null && local13 < Static6.anInt110 && Static57.aClass29Array1[local13].aString4.equalsIgnoreCase(Static127.aClass11_Sub5_Sub2_Sub1_2.aString20)) {
												anIntArray92[anInt1257++] = 1;
												return;
											}
											anIntArray92[anInt1257++] = 0;
											return;
										}
										if (arg0 == 3625) {
											if (Static321.aString58 != null) {
												aStringArray12[anInt1252++] = Static321.aString58;
												return;
											}
											aStringArray12[anInt1252++] = "";
											return;
										}
										if (arg0 == 3626) {
											local13 = anIntArray92[--anInt1257];
											if (Static242.aString35 != null && local13 < Static6.anInt110) {
												aStringArray12[anInt1252++] = Static57.aClass29Array1[local13].aString7;
												return;
											}
											aStringArray12[anInt1252++] = "";
											return;
										}
										if (arg0 == 3627) {
											local13 = anIntArray92[--anInt1257];
											if (Static130.anInt2196 == 2 && local13 >= 0 && local13 < Static259.anInt4591) {
												anIntArray92[anInt1257++] = Static217.aBooleanArray18[local13] ? 1 : 0;
												return;
											}
											anIntArray92[anInt1257++] = 0;
											return;
										}
										if (arg0 == 3628) {
											local3888 = aStringArray12[--anInt1252];
											if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
												local3888 = local3888.substring(7);
											}
											anIntArray92[anInt1257++] = Static329.method4685(local3888);
											return;
										}
										if (arg0 == 3629) {
											anIntArray92[anInt1257++] = Static293.anInt5251;
											return;
										}
										if (arg0 == 3630) {
											local3888 = aStringArray12[--anInt1252];
											Static224.method3091(true, local3888);
											return;
										}
										if (arg0 == 3631) {
											local13 = anIntArray92[--anInt1257];
											anIntArray92[anInt1257++] = Static398.aBooleanArray22[local13] ? 1 : 0;
											return;
										}
										if (arg0 == 3632) {
											local13 = anIntArray92[--anInt1257];
											if (Static242.aString35 != null && local13 < Static6.anInt110) {
												aStringArray12[anInt1252++] = Static57.aClass29Array1[local13].aString4;
												return;
											}
											aStringArray12[anInt1252++] = "";
											return;
										}
										if (arg0 == 3633) {
											local13 = anIntArray92[--anInt1257];
											if (Static130.anInt2196 != 0 && local13 < Static127.anInt2142) {
												aStringArray12[anInt1252++] = Static296.aStringArray49[local13];
												return;
											}
											aStringArray12[anInt1252++] = "";
											return;
										}
									} else if (arg0 < 4000) {
										if (arg0 == 3903) {
											local13 = anIntArray92[--anInt1257];
											anIntArray92[anInt1257++] = Static2.aClass197Array1[local13].method4469();
											return;
										}
										if (arg0 == 3904) {
											local13 = anIntArray92[--anInt1257];
											anIntArray92[anInt1257++] = Static2.aClass197Array1[local13].anInt5623;
											return;
										}
										if (arg0 == 3905) {
											local13 = anIntArray92[--anInt1257];
											anIntArray92[anInt1257++] = Static2.aClass197Array1[local13].anInt5626;
											return;
										}
										if (arg0 == 3906) {
											local13 = anIntArray92[--anInt1257];
											anIntArray92[anInt1257++] = Static2.aClass197Array1[local13].anInt5620;
											return;
										}
										if (arg0 == 3907) {
											local13 = anIntArray92[--anInt1257];
											anIntArray92[anInt1257++] = Static2.aClass197Array1[local13].anInt5625;
											return;
										}
										if (arg0 == 3908) {
											local13 = anIntArray92[--anInt1257];
											anIntArray92[anInt1257++] = Static2.aClass197Array1[local13].anInt5622;
											return;
										}
										if (arg0 == 3910) {
											local13 = anIntArray92[--anInt1257];
											local19 = Static2.aClass197Array1[local13].method4468();
											anIntArray92[anInt1257++] = local19 == 0 ? 1 : 0;
											return;
										}
										if (arg0 == 3911) {
											local13 = anIntArray92[--anInt1257];
											local19 = Static2.aClass197Array1[local13].method4468();
											anIntArray92[anInt1257++] = local19 == 2 ? 1 : 0;
											return;
										}
										if (arg0 == 3912) {
											local13 = anIntArray92[--anInt1257];
											local19 = Static2.aClass197Array1[local13].method4468();
											anIntArray92[anInt1257++] = local19 == 5 ? 1 : 0;
											return;
										}
										if (arg0 == 3913) {
											local13 = anIntArray92[--anInt1257];
											local19 = Static2.aClass197Array1[local13].method4468();
											anIntArray92[anInt1257++] = local19 == 1 ? 1 : 0;
											return;
										}
									} else if (arg0 < 4100) {
										if (arg0 == 4000) {
											anInt1257 -= 2;
											local13 = anIntArray92[anInt1257];
											local19 = anIntArray92[anInt1257 + 1];
											anIntArray92[anInt1257++] = local13 + local19;
											return;
										}
										if (arg0 == 4001) {
											anInt1257 -= 2;
											local13 = anIntArray92[anInt1257];
											local19 = anIntArray92[anInt1257 + 1];
											anIntArray92[anInt1257++] = local13 - local19;
											return;
										}
										if (arg0 == 4002) {
											anInt1257 -= 2;
											local13 = anIntArray92[anInt1257];
											local19 = anIntArray92[anInt1257 + 1];
											anIntArray92[anInt1257++] = local13 * local19;
											return;
										}
										if (arg0 == 4003) {
											anInt1257 -= 2;
											local13 = anIntArray92[anInt1257];
											local19 = anIntArray92[anInt1257 + 1];
											anIntArray92[anInt1257++] = local13 / local19;
											return;
										}
										if (arg0 == 4004) {
											local13 = anIntArray92[--anInt1257];
											anIntArray92[anInt1257++] = (int) (Math.random() * (double) local13);
											return;
										}
										if (arg0 == 4005) {
											local13 = anIntArray92[--anInt1257];
											anIntArray92[anInt1257++] = (int) (Math.random() * (double) (local13 + 1));
											return;
										}
										if (arg0 == 4006) {
											anInt1257 -= 5;
											local13 = anIntArray92[anInt1257];
											local19 = anIntArray92[anInt1257 + 1];
											local25 = anIntArray92[anInt1257 + 2];
											local353 = anIntArray92[anInt1257 + 3];
											local2290 = anIntArray92[anInt1257 + 4];
											anIntArray92[anInt1257++] = local13 + (local19 - local13) * (local2290 - local25) / (local353 - local25);
											return;
										}
										@Pc(6991) long local6991;
										@Pc(6984) long local6984;
										if (arg0 == 4007) {
											anInt1257 -= 2;
											local6984 = anIntArray92[anInt1257];
											local6991 = anIntArray92[anInt1257 + 1];
											anIntArray92[anInt1257++] = (int) (local6984 + local6984 * local6991 / 100L);
											return;
										}
										if (arg0 == 4008) {
											anInt1257 -= 2;
											local13 = anIntArray92[anInt1257];
											local19 = anIntArray92[anInt1257 + 1];
											anIntArray92[anInt1257++] = local13 | 0x1 << local19;
											return;
										}
										if (arg0 == 4009) {
											anInt1257 -= 2;
											local13 = anIntArray92[anInt1257];
											local19 = anIntArray92[anInt1257 + 1];
											anIntArray92[anInt1257++] = local13 & -(0x1 << local19) - 1;
											return;
										}
										if (arg0 == 4010) {
											anInt1257 -= 2;
											local13 = anIntArray92[anInt1257];
											local19 = anIntArray92[anInt1257 + 1];
											anIntArray92[anInt1257++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
											return;
										}
										if (arg0 == 4011) {
											anInt1257 -= 2;
											local13 = anIntArray92[anInt1257];
											local19 = anIntArray92[anInt1257 + 1];
											anIntArray92[anInt1257++] = local13 % local19;
											return;
										}
										if (arg0 == 4012) {
											anInt1257 -= 2;
											local13 = anIntArray92[anInt1257];
											local19 = anIntArray92[anInt1257 + 1];
											if (local13 == 0) {
												anIntArray92[anInt1257++] = 0;
												return;
											}
											anIntArray92[anInt1257++] = (int) Math.pow((double) local13, (double) local19);
											return;
										}
										if (arg0 == 4013) {
											anInt1257 -= 2;
											local13 = anIntArray92[anInt1257];
											local19 = anIntArray92[anInt1257 + 1];
											if (local13 == 0) {
												anIntArray92[anInt1257++] = 0;
												return;
											}
											if (local19 == 0) {
												anIntArray92[anInt1257++] = Integer.MAX_VALUE;
												return;
											}
											anIntArray92[anInt1257++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
											return;
										}
										if (arg0 == 4014) {
											anInt1257 -= 2;
											local13 = anIntArray92[anInt1257];
											local19 = anIntArray92[anInt1257 + 1];
											anIntArray92[anInt1257++] = local13 & local19;
											return;
										}
										if (arg0 == 4015) {
											anInt1257 -= 2;
											local13 = anIntArray92[anInt1257];
											local19 = anIntArray92[anInt1257 + 1];
											anIntArray92[anInt1257++] = local13 | local19;
											return;
										}
										if (arg0 == 4016) {
											anInt1257 -= 2;
											local13 = anIntArray92[anInt1257];
											local19 = anIntArray92[anInt1257 + 1];
											anIntArray92[anInt1257++] = local13 < local19 ? local13 : local19;
											return;
										}
										if (arg0 == 4017) {
											anInt1257 -= 2;
											local13 = anIntArray92[anInt1257];
											local19 = anIntArray92[anInt1257 + 1];
											anIntArray92[anInt1257++] = local13 > local19 ? local13 : local19;
											return;
										}
										if (arg0 == 4018) {
											anInt1257 -= 3;
											local6984 = anIntArray92[anInt1257];
											local6991 = anIntArray92[anInt1257 + 1];
											@Pc(7372) long local7372 = (long) anIntArray92[anInt1257 + 2];
											anIntArray92[anInt1257++] = (int) (local6984 * local7372 / local6991);
											return;
										}
									} else if (arg0 < 4200) {
										if (arg0 == 4100) {
											local3888 = aStringArray12[--anInt1252];
											local19 = anIntArray92[--anInt1257];
											aStringArray12[anInt1252++] = local3888 + local19;
											return;
										}
										if (arg0 == 4101) {
											anInt1252 -= 2;
											local3888 = aStringArray12[anInt1252];
											local1101 = aStringArray12[anInt1252 + 1];
											aStringArray12[anInt1252++] = local3888 + local1101;
											return;
										}
										if (arg0 == 4102) {
											local3888 = aStringArray12[--anInt1252];
											local19 = anIntArray92[--anInt1257];
											aStringArray12[anInt1252++] = local3888 + Static412.method5671(local19);
											return;
										}
										if (arg0 == 4103) {
											local3888 = aStringArray12[--anInt1252];
											aStringArray12[anInt1252++] = local3888.toLowerCase();
											return;
										}
										if (arg0 == 4104) {
											aStringArray12[anInt1252++] = method1148(anIntArray92[--anInt1257]);
											return;
										}
										if (arg0 == 4105) {
											anInt1252 -= 2;
											local3888 = aStringArray12[anInt1252];
											local1101 = aStringArray12[anInt1252 + 1];
											if (Static127.aClass11_Sub5_Sub2_Sub1_2.aClass26_1 != null && Static127.aClass11_Sub5_Sub2_Sub1_2.aClass26_1.aBoolean22) {
												aStringArray12[anInt1252++] = local1101;
												return;
											}
											aStringArray12[anInt1252++] = local3888;
											return;
										}
										if (arg0 == 4106) {
											local13 = anIntArray92[--anInt1257];
											aStringArray12[anInt1252++] = Integer.toString(local13);
											return;
										}
										if (arg0 == 4107) {
											anInt1252 -= 2;
											anIntArray92[anInt1257++] = Static228.method4888(aStringArray12[anInt1252 + 1], Static80.anInt6195, aStringArray12[anInt1252]);
											return;
										}
										@Pc(7655) Class15 local7655;
										if (arg0 == 4108) {
											local3888 = aStringArray12[--anInt1252];
											anInt1257 -= 2;
											local19 = anIntArray92[anInt1257];
											local25 = anIntArray92[anInt1257 + 1];
											local7655 = Static457.method6198(Static336.aClass171_71, local25);
											anIntArray92[anInt1257++] = local7655.method327(Static179.aClass41Array3, local19, local3888);
											return;
										}
										if (arg0 == 4109) {
											local3888 = aStringArray12[--anInt1252];
											anInt1257 -= 2;
											local19 = anIntArray92[anInt1257];
											local25 = anIntArray92[anInt1257 + 1];
											local7655 = Static457.method6198(Static336.aClass171_71, local25);
											anIntArray92[anInt1257++] = local7655.method322(Static179.aClass41Array3, local19, local3888);
											return;
										}
										if (arg0 == 4110) {
											anInt1252 -= 2;
											local3888 = aStringArray12[anInt1252];
											local1101 = aStringArray12[anInt1252 + 1];
											if (anIntArray92[--anInt1257] == 1) {
												aStringArray12[anInt1252++] = local3888;
												return;
											}
											aStringArray12[anInt1252++] = local1101;
											return;
										}
										if (arg0 == 4111) {
											local3888 = aStringArray12[--anInt1252];
											aStringArray12[anInt1252++] = Static461.method6254(local3888);
											return;
										}
										if (arg0 == 4112) {
											local3888 = aStringArray12[--anInt1252];
											local19 = anIntArray92[--anInt1257];
											if (local19 == -1) {
												throw new RuntimeException("null char");
											}
											aStringArray12[anInt1252++] = local3888 + (char) local19;
											return;
										}
										if (arg0 == 4113) {
											local13 = anIntArray92[--anInt1257];
											anIntArray92[anInt1257++] = Static78.method1178((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4114) {
											local13 = anIntArray92[--anInt1257];
											anIntArray92[anInt1257++] = Static194.method2778((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4115) {
											local13 = anIntArray92[--anInt1257];
											anIntArray92[anInt1257++] = Static245.method3414((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4116) {
											local13 = anIntArray92[--anInt1257];
											anIntArray92[anInt1257++] = Static425.method5820((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4117) {
											local3888 = aStringArray12[--anInt1252];
											if (local3888 != null) {
												anIntArray92[anInt1257++] = local3888.length();
												return;
											}
											anIntArray92[anInt1257++] = 0;
											return;
										}
										if (arg0 == 4118) {
											local3888 = aStringArray12[--anInt1252];
											anInt1257 -= 2;
											local19 = anIntArray92[anInt1257];
											local25 = anIntArray92[anInt1257 + 1];
											aStringArray12[anInt1252++] = local3888.substring(local19, local25);
											return;
										}
										if (arg0 == 4119) {
											local3888 = aStringArray12[--anInt1252];
											@Pc(8018) StringBuffer local8018 = new StringBuffer(local3888.length());
											@Pc(8020) boolean local8020 = false;
											for (local353 = 0; local353 < local3888.length(); local353++) {
												@Pc(8027) char local8027 = local3888.charAt(local353);
												if (local8027 == '<') {
													local8020 = true;
												} else if (local8027 == '>') {
													local8020 = false;
												} else if (!local8020) {
													local8018.append(local8027);
												}
											}
											aStringArray12[anInt1252++] = local8018.toString();
											return;
										}
										if (arg0 == 4120) {
											local3888 = aStringArray12[--anInt1252];
											anInt1257 -= 2;
											local19 = anIntArray92[anInt1257];
											local25 = anIntArray92[anInt1257 + 1];
											anIntArray92[anInt1257++] = local3888.indexOf(local19, local25);
											return;
										}
										if (arg0 == 4121) {
											anInt1252 -= 2;
											local3888 = aStringArray12[anInt1252];
											local1101 = aStringArray12[anInt1252 + 1];
											local25 = anIntArray92[--anInt1257];
											anIntArray92[anInt1257++] = local3888.indexOf(local1101, local25);
											return;
										}
										if (arg0 == 4122) {
											local13 = anIntArray92[--anInt1257];
											anIntArray92[anInt1257++] = Character.toLowerCase((char) local13);
											return;
										}
										if (arg0 == 4123) {
											local13 = anIntArray92[--anInt1257];
											anIntArray92[anInt1257++] = Character.toUpperCase((char) local13);
											return;
										}
										if (arg0 == 4124) {
											local412 = anIntArray92[--anInt1257] != 0;
											local19 = anIntArray92[--anInt1257];
											aStringArray12[anInt1252++] = Static64.method1050((long) local19, Static80.anInt6195, local412, 0);
											return;
										}
										if (arg0 == 4125) {
											local3888 = aStringArray12[--anInt1252];
											local19 = anIntArray92[--anInt1257];
											@Pc(8241) Class15 local8241 = Static457.method6198(Static336.aClass171_71, local19);
											anIntArray92[anInt1257++] = local8241.method323(local3888, Static179.aClass41Array3);
											return;
										}
									} else if (arg0 < 4300) {
										if (arg0 == 4200) {
											local13 = anIntArray92[--anInt1257];
											aStringArray12[anInt1252++] = Static413.aClass271_2.method6193(local13).aString65;
											return;
										}
										@Pc(8303) Class218 local8303;
										if (arg0 == 4201) {
											anInt1257 -= 2;
											local13 = anIntArray92[anInt1257];
											local19 = anIntArray92[anInt1257 + 1];
											local8303 = Static413.aClass271_2.method6193(local13);
											if (local19 >= 1 && local19 <= 5 && local8303.aStringArray61[local19 - 1] != null) {
												aStringArray12[anInt1252++] = local8303.aStringArray61[local19 - 1];
												return;
											}
											aStringArray12[anInt1252++] = "";
											return;
										}
										if (arg0 == 4202) {
											anInt1257 -= 2;
											local13 = anIntArray92[anInt1257];
											local19 = anIntArray92[anInt1257 + 1];
											local8303 = Static413.aClass271_2.method6193(local13);
											if (local19 >= 1 && local19 <= 5 && local8303.aStringArray60[local19 - 1] != null) {
												aStringArray12[anInt1252++] = local8303.aStringArray60[local19 - 1];
												return;
											}
											aStringArray12[anInt1252++] = "";
											return;
										}
										if (arg0 == 4203) {
											local13 = anIntArray92[--anInt1257];
											anIntArray92[anInt1257++] = Static413.aClass271_2.method6193(local13).anInt6309;
											return;
										}
										if (arg0 == 4204) {
											local13 = anIntArray92[--anInt1257];
											anIntArray92[anInt1257++] = Static413.aClass271_2.method6193(local13).anInt6274 == 1 ? 1 : 0;
											return;
										}
										@Pc(8466) Class218 local8466;
										if (arg0 == 4205) {
											local13 = anIntArray92[--anInt1257];
											local8466 = Static413.aClass271_2.method6193(local13);
											if (local8466.anInt6302 == -1 && local8466.lb >= 0) {
												anIntArray92[anInt1257++] = local8466.lb;
												return;
											}
											anIntArray92[anInt1257++] = local13;
											return;
										}
										if (arg0 == 4206) {
											local13 = anIntArray92[--anInt1257];
											local8466 = Static413.aClass271_2.method6193(local13);
											if (local8466.anInt6302 >= 0 && local8466.lb >= 0) {
												anIntArray92[anInt1257++] = local8466.lb;
												return;
											}
											anIntArray92[anInt1257++] = local13;
											return;
										}
										if (arg0 == 4207) {
											local13 = anIntArray92[--anInt1257];
											anIntArray92[anInt1257++] = Static413.aClass271_2.method6193(local13).aBoolean434 ? 1 : 0;
											return;
										}
										if (arg0 == 4208) {
											anInt1257 -= 2;
											local13 = anIntArray92[anInt1257];
											local19 = anIntArray92[anInt1257 + 1];
											local3017 = Static275.aClass235_1.method5382(local19);
											if (local3017.method4491()) {
												aStringArray12[anInt1252++] = Static413.aClass271_2.method6193(local13).method5003(local3017.aString55, local19);
												return;
											}
											anIntArray92[anInt1257++] = Static413.aClass271_2.method6193(local13).method5010(local3017.anInt5653, local19);
											return;
										}
										if (arg0 == 4209) {
											anInt1257 -= 2;
											local13 = anIntArray92[anInt1257];
											local19 = anIntArray92[anInt1257 + 1] - 1;
											local8303 = Static413.aClass271_2.method6193(local13);
											if (local8303.anInt6269 == local19) {
												anIntArray92[anInt1257++] = local8303.anInt6277;
												return;
											}
											if (local8303.anInt6276 == local19) {
												anIntArray92[anInt1257++] = local8303.anInt6263;
												return;
											}
											anIntArray92[anInt1257++] = -1;
											return;
										}
										if (arg0 == 4210) {
											local3888 = aStringArray12[--anInt1252];
											local19 = anIntArray92[--anInt1257];
											Static13.method313(local3888, local19 == 1);
											anIntArray92[anInt1257++] = Static249.anInt4280;
											return;
										}
										if (arg0 == 4211) {
											if (Static166.aShortArray44 != null && Static222.anInt3732 < Static249.anInt4280) {
												anIntArray92[anInt1257++] = Static166.aShortArray44[Static222.anInt3732++] & 0xFFFF;
												return;
											}
											anIntArray92[anInt1257++] = -1;
											return;
										}
										if (arg0 == 4212) {
											Static222.anInt3732 = 0;
											return;
										}
									} else if (arg0 < 4400) {
										if (arg0 == 4300) {
											anInt1257 -= 2;
											local13 = anIntArray92[anInt1257];
											local19 = anIntArray92[anInt1257 + 1];
											local3017 = Static275.aClass235_1.method5382(local19);
											if (local3017.method4491()) {
												aStringArray12[anInt1252++] = Static227.aClass54_2.method1128(local13).method1891(local19, local3017.aString55);
												return;
											}
											anIntArray92[anInt1257++] = Static227.aClass54_2.method1128(local13).method1890(local19, local3017.anInt5653);
											return;
										}
									} else if (arg0 < 4500) {
										if (arg0 == 4400) {
											anInt1257 -= 2;
											local13 = anIntArray92[anInt1257];
											local19 = anIntArray92[anInt1257 + 1];
											local3017 = Static275.aClass235_1.method5382(local19);
											if (local3017.method4491()) {
												aStringArray12[anInt1252++] = Static249.aClass39_2.method748(local13).method4324(local3017.aString55, local19);
												return;
											}
											anIntArray92[anInt1257++] = Static249.aClass39_2.method748(local13).method4308(local3017.anInt5653, local19);
											return;
										}
									} else if (arg0 < 4600) {
										if (arg0 == 4500) {
											anInt1257 -= 2;
											local13 = anIntArray92[anInt1257];
											local19 = anIntArray92[anInt1257 + 1];
											local3017 = Static275.aClass235_1.method5382(local19);
											if (local3017.method4491()) {
												aStringArray12[anInt1252++] = Static236.aClass55_1.method1135(local13).method1121(local3017.aString55, local19);
												return;
											}
											anIntArray92[anInt1257++] = Static236.aClass55_1.method1135(local13).method1117(local19, local3017.anInt5653);
											return;
										}
									} else if (arg0 < 4700 && arg0 == 4600) {
										local13 = anIntArray92[--anInt1257];
										@Pc(8967) Class101 local8967 = Static257.aClass262_1.method5913(local13);
										if (local8967.anIntArray225 != null && local8967.anIntArray225.length > 0) {
											local25 = 0;
											local353 = local8967.anIntArray224[0];
											for (local2290 = 1; local2290 < local8967.anIntArray225.length; local2290++) {
												if (local8967.anIntArray224[local2290] > local353) {
													local25 = local2290;
													local353 = local8967.anIntArray224[local2290];
												}
											}
											anIntArray92[anInt1257++] = local8967.anIntArray225[local25];
											return;
										}
										anIntArray92[anInt1257++] = local8967.anInt2646;
										return;
									}
								}
							}
						}
					} else {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static160.method2380(anIntArray92[--anInt1257]);
						} else {
							local137 = arg1 ? aClass93_5 : aClass93_4;
						}
						if (arg0 == 1300) {
							local19 = anIntArray92[--anInt1257] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method2129(aStringArray12[--anInt1252], local19);
								return;
							}
							anInt1252--;
							return;
						}
						if (arg0 == 1301) {
							anInt1257 -= 2;
							local19 = anIntArray92[anInt1257];
							local25 = anIntArray92[anInt1257 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass93_6 = null;
								return;
							}
							local137.aClass93_6 = Static34.method566(local25, local19);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray92[--anInt1257];
							if (local19 != Static313.anInt5628 && local19 != Static247.anInt4260 && local19 != Static271.anInt4926) {
								return;
							}
							local137.anInt2457 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt2453 = anIntArray92[--anInt1257];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt2452 = anIntArray92[--anInt1257];
							return;
						}
						if (arg0 == 1305) {
							local137.aString21 = aStringArray12[--anInt1252];
							return;
						}
						if (arg0 == 1306) {
							local137.aString22 = aStringArray12[--anInt1252];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray28 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt2482 = anIntArray92[--anInt1257];
							local137.anInt2437 = anIntArray92[--anInt1257];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray92[--anInt1257];
							local25 = anIntArray92[--anInt1257];
							if (local25 >= 1 && local25 <= 10) {
								local137.method2126(local25 - 1, local19);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString23 = aStringArray12[--anInt1252];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt2503 = anIntArray92[--anInt1257];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt1257 -= 3;
								local19 = anIntArray92[anInt1257] - 1;
								local25 = anIntArray92[anInt1257 + 1];
								local353 = anIntArray92[anInt1257 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt1257 -= 2;
								local19 = 10;
								local25 = anIntArray92[anInt1257];
								local353 = anIntArray92[anInt1257 + 1];
							}
							if (local137.aByteArray29 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray29 = new byte[11];
								local137.aByteArray28 = new byte[11];
								local137.anIntArray200 = new int[11];
							}
							local137.aByteArray29[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean149 = false;
								for (local2290 = 0; local2290 < local137.aByteArray29.length; local2290++) {
									if (local137.aByteArray29[local2290] != 0) {
										local137.aBoolean149 = true;
										break;
									}
								}
							} else {
								local137.aBoolean149 = true;
							}
							local137.aByteArray28[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt2422 = anIntArray92[--anInt1257];
							return;
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static160.method2380(anIntArray92[--anInt1257]);
					} else {
						local137 = arg1 ? aClass93_5 : aClass93_4;
					}
					Static383.method5263(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt1257 -= 2;
						local19 = anIntArray92[anInt1257];
						local25 = anIntArray92[anInt1257 + 1];
						if (local137.anInt2424 == -1) {
							Static247.method3424(local137.anInt2508);
							Static104.method1542(local137.anInt2508);
							Static112.method1863(local137.anInt2508);
						}
						if (local19 == -1) {
							local137.anInt2431 = 1;
							local137.anInt2512 = -1;
							local137.anInt2488 = -1;
							return;
						}
						local137.anInt2488 = local19;
						local137.anInt2466 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean154 = true;
						} else {
							local137.aBoolean154 = false;
						}
						@Pc(1630) Class218 local1630 = Static413.aClass271_2.method6193(local19);
						local137.anInt2462 = local1630.anInt6303;
						local137.anInt2474 = local1630.anInt6288;
						local137.anInt2465 = local1630.anInt6278;
						local137.anInt2502 = local1630.anInt6262;
						local137.anInt2491 = local1630.anInt6275;
						local137.anInt2483 = local1630.anInt6318;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt2434 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt2434 = 1;
						} else {
							local137.anInt2434 = 2;
						}
						if (local137.anInt2479 > 0) {
							local137.anInt2483 = local137.anInt2483 * 32 / local137.anInt2479;
							return;
						}
						if (local137.anInt2481 > 0) {
							local137.anInt2483 = local137.anInt2483 * 32 / local137.anInt2481;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt2431 = 2;
						local137.anInt2512 = anIntArray92[--anInt1257];
						if (local137.anInt2424 == -1) {
							Static401.method5620(local137.anInt2508);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt2431 = 3;
						local137.anInt2512 = -1;
						if (local137.anInt2424 == -1) {
							Static401.method5620(local137.anInt2508);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt2431 = 6;
						local137.anInt2512 = anIntArray92[--anInt1257];
						if (local137.anInt2424 == -1) {
							Static401.method5620(local137.anInt2508);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt2431 = 5;
						local137.anInt2512 = anIntArray92[--anInt1257];
						if (local137.anInt2424 == -1) {
							Static401.method5620(local137.anInt2508);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt1257 -= 4;
						local137.anInt2454 = anIntArray92[anInt1257];
						local137.anInt2492 = anIntArray92[anInt1257 + 1];
						local137.anInt2468 = anIntArray92[anInt1257 + 2];
						local137.anInt2499 = anIntArray92[anInt1257 + 3];
						Static383.method5263(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt1257 -= 2;
						local137.anInt2445 = anIntArray92[anInt1257];
						local137.anInt2429 = anIntArray92[anInt1257 + 1];
						Static383.method5263(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt1257 -= 4;
						local137.anInt2512 = anIntArray92[anInt1257];
						local137.anInt2496 = anIntArray92[anInt1257 + 1];
						if (anIntArray92[anInt1257 + 2] == 1) {
							local137.anInt2431 = 9;
						} else {
							local137.anInt2431 = 8;
						}
						if (anIntArray92[anInt1257 + 3] == 1) {
							local137.aBoolean154 = true;
						} else {
							local137.aBoolean154 = false;
						}
						if (local137.anInt2424 == -1) {
							Static401.method5620(local137.anInt2508);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt2431 = 5;
						local137.anInt2512 = Static94.anInt5592;
						local137.anInt2496 = 0;
						if (local137.anInt2424 == -1) {
							Static401.method5620(local137.anInt2508);
						}
						return;
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static160.method2380(anIntArray92[--anInt1257]);
				} else {
					local137 = arg1 ? aClass93_5 : aClass93_4;
				}
				if (arg0 == 1000) {
					anInt1257 -= 4;
					local137.anInt2444 = anIntArray92[anInt1257];
					local137.anInt2507 = anIntArray92[anInt1257 + 1];
					local19 = anIntArray92[anInt1257 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray92[anInt1257 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte40 = (byte) local19;
					local137.aByte43 = (byte) local25;
					Static383.method5263(local137);
					Static460.method6245(local137);
					if (local137.anInt2424 == -1) {
						Static233.method3183(local137.anInt2508);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt1257 -= 4;
					local137.anInt2481 = anIntArray92[anInt1257];
					local137.anInt2504 = anIntArray92[anInt1257 + 1];
					local137.anInt2479 = 0;
					local137.anInt2441 = 0;
					local19 = anIntArray92[anInt1257 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray92[anInt1257 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte42 = (byte) local19;
					local137.aByte41 = (byte) local25;
					Static383.method5263(local137);
					Static460.method6245(local137);
					if (local137.anInt2494 == 0) {
						Static189.method2742(false, local137);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(620) boolean local620 = anIntArray92[--anInt1257] == 1;
					if (local137.aBoolean160 != local620) {
						local137.aBoolean160 = local620;
						Static383.method5263(local137);
					}
					if (local137.anInt2424 == -1) {
						Static48.method742(local137.anInt2508);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt1257 -= 2;
					local137.anInt2471 = anIntArray92[anInt1257];
					local137.anInt2478 = anIntArray92[anInt1257 + 1];
					Static383.method5263(local137);
					Static460.method6245(local137);
					if (local137.anInt2494 == 0) {
						Static189.method2742(false, local137);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean150 = anIntArray92[--anInt1257] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(I)V")
	private static void method1150(@OriginalArg(0) int arg0) {
		@Pc(3) Class93 local3 = Static160.method2380(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class93[] local13 = Static118.aClass93ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class93[] local19 = Static188.aClass93ArrayArray4[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static118.aClass93ArrayArray1[local9] = new Class93[local22];
			Static472.method5024(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static472.method5024(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "(I)V")
	private static void method1151(@OriginalArg(0) int arg0) {
		@Pc(3) Class93 local3 = Static160.method2380(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class93[] local13 = Static118.aClass93ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class93[] local19 = Static188.aClass93ArrayArray4[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static118.aClass93ArrayArray1[local9] = new Class93[local22];
			Static472.method5024(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static472.method5024(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(IZ)V")
	private static void method1152(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(157) int local157;
		@Pc(1313) boolean local1313;
		@Pc(89) int local89;
		@Pc(75) String local75;
		@Pc(192) int local192;
		@Pc(95) int local95;
		@Pc(81) String local81;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray92[anInt1257++] = Static381.anInt6606;
				return;
			}
			if (arg0 == 5001) {
				anInt1257 -= 3;
				Static381.anInt6606 = anIntArray92[anInt1257];
				Static424.aClass259_3 = Static96.method1426(anIntArray92[anInt1257 + 1]);
				if (Static424.aClass259_3 == null) {
					Static424.aClass259_3 = Static259.aClass259_2;
				}
				Static436.anInt7343 = anIntArray92[anInt1257 + 2];
				Static164.method2403(Static398.aClass208_95);
				Static389.aClass2_Sub17_Sub1_2.method6172(Static381.anInt6606);
				Static389.aClass2_Sub17_Sub1_2.method6172(Static424.aClass259_3.anInt7305);
				Static389.aClass2_Sub17_Sub1_2.method6172(Static436.anInt7343);
				return;
			}
			if (arg0 == 5002) {
				anInt1252 -= 2;
				local75 = aStringArray12[anInt1252];
				local81 = aStringArray12[anInt1252 + 1];
				anInt1257 -= 2;
				local89 = anIntArray92[anInt1257];
				local95 = anIntArray92[anInt1257 + 1];
				if (local81 == null) {
					local81 = "";
				}
				if (local81.length() > 80) {
					local81 = local81.substring(0, 80);
				}
				Static164.method2403(Static314.aClass208_75);
				Static389.aClass2_Sub17_Sub1_2.method6172(Static380.method5246(local75) + Static380.method5246(local81) + 2);
				Static389.aClass2_Sub17_Sub1_2.method6151(local75);
				Static389.aClass2_Sub17_Sub1_2.method6172(local89 - 1);
				Static389.aClass2_Sub17_Sub1_2.method6172(local95);
				Static389.aClass2_Sub17_Sub1_2.method6151(local81);
				return;
			}
			if (arg0 == 5003) {
				local157 = anIntArray92[--anInt1257];
				local81 = null;
				if (local157 < 100) {
					local81 = Static283.aStringArray48[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray12[anInt1252++] = local81;
				return;
			}
			if (arg0 == 5004) {
				local157 = anIntArray92[--anInt1257];
				local192 = -1;
				if (local157 < 100 && Static283.aStringArray48[local157] != null) {
					local192 = Static12.anIntArray24[local157];
				}
				anIntArray92[anInt1257++] = local192;
				return;
			}
			if (arg0 == 5005) {
				if (Static424.aClass259_3 == null) {
					anIntArray92[anInt1257++] = -1;
					return;
				}
				anIntArray92[anInt1257++] = Static424.aClass259_3.anInt7305;
				return;
			}
			if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
				local75 = aStringArray12[--anInt1252];
				method1155(local75, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt1252 -= 2;
				local75 = aStringArray12[anInt1252];
				local81 = aStringArray12[anInt1252 + 1];
				if (Static81.anInt1300 != 0 || (!Static3.aBoolean3 || Static203.aBoolean230) && !Static46.aBoolean36) {
					Static164.method2403(Static288.aClass208_67);
					Static389.aClass2_Sub17_Sub1_2.method6172(0);
					local89 = Static389.aClass2_Sub17_Sub1_2.anInt7523;
					Static389.aClass2_Sub17_Sub1_2.method6151(local75);
					Static349.method4922(Static389.aClass2_Sub17_Sub1_2, local81);
					Static389.aClass2_Sub17_Sub1_2.method6131(Static389.aClass2_Sub17_Sub1_2.anInt7523 - local89);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local157 = anIntArray92[--anInt1257];
				local81 = null;
				if (local157 < 100) {
					local81 = Static191.aStringArray40[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray12[anInt1252++] = local81;
				return;
			}
			if (arg0 == 5011) {
				local157 = anIntArray92[--anInt1257];
				local81 = null;
				if (local157 < 100) {
					local81 = Static156.aStringArray35[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray12[anInt1252++] = local81;
				return;
			}
			if (arg0 == 5012) {
				local157 = anIntArray92[--anInt1257];
				local192 = -1;
				if (local157 < 100) {
					local192 = Static415.anIntArray578[local157];
				}
				anIntArray92[anInt1257++] = local192;
				return;
			}
			if (arg0 == 5015) {
				if (Static127.aClass11_Sub5_Sub2_Sub1_2 == null || Static127.aClass11_Sub5_Sub2_Sub1_2.aString19 == null) {
					local75 = Static448.aString72;
				} else {
					local75 = Static127.aClass11_Sub5_Sub2_Sub1_2.method2112();
				}
				aStringArray12[anInt1252++] = local75;
				return;
			}
			if (arg0 == 5016) {
				anIntArray92[anInt1257++] = Static436.anInt7343;
				return;
			}
			if (arg0 == 5017) {
				anIntArray92[anInt1257++] = Static122.anInt2065;
				return;
			}
			if (arg0 == 5018) {
				local157 = anIntArray92[--anInt1257];
				local192 = 0;
				if (local157 < 100 && Static283.aStringArray48[local157] != null) {
					local192 = Static297.anIntArray454[local157];
				}
				anIntArray92[anInt1257++] = local192;
				return;
			}
			if (arg0 == 5019) {
				local157 = anIntArray92[--anInt1257];
				local81 = null;
				if (local157 < 100) {
					local81 = Static174.aStringArray36[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray12[anInt1252++] = local81;
				return;
			}
			if (arg0 == 5020) {
				if (Static127.aClass11_Sub5_Sub2_Sub1_2 == null || Static127.aClass11_Sub5_Sub2_Sub1_2.aString19 == null) {
					local75 = Static448.aString72;
				} else {
					local75 = Static127.aClass11_Sub5_Sub2_Sub1_2.method2105();
				}
				aStringArray12[anInt1252++] = local75;
				return;
			}
			if (arg0 == 5050) {
				local157 = anIntArray92[--anInt1257];
				aStringArray12[anInt1252++] = Static235.aClass72_1.method1445(local157).aString64;
				return;
			}
			@Pc(589) Class2_Sub1_Sub16 local589;
			if (arg0 == 5051) {
				local157 = anIntArray92[--anInt1257];
				local589 = Static235.aClass72_1.method1445(local157);
				if (local589.anIntArray502 == null) {
					anIntArray92[anInt1257++] = 0;
					return;
				}
				anIntArray92[anInt1257++] = local589.anIntArray502.length;
				return;
			}
			if (arg0 == 5052) {
				anInt1257 -= 2;
				local157 = anIntArray92[anInt1257];
				local192 = anIntArray92[anInt1257 + 1];
				@Pc(634) Class2_Sub1_Sub16 local634 = Static235.aClass72_1.method1445(local157);
				local95 = local634.anIntArray502[local192];
				anIntArray92[anInt1257++] = local95;
				return;
			}
			if (arg0 == 5053) {
				local157 = anIntArray92[--anInt1257];
				local589 = Static235.aClass72_1.method1445(local157);
				if (local589.anIntArray501 == null) {
					anIntArray92[anInt1257++] = 0;
					return;
				}
				anIntArray92[anInt1257++] = local589.anIntArray501.length;
				return;
			}
			if (arg0 == 5054) {
				anInt1257 -= 2;
				local157 = anIntArray92[anInt1257];
				local192 = anIntArray92[anInt1257 + 1];
				anIntArray92[anInt1257++] = Static235.aClass72_1.method1445(local157).anIntArray501[local192];
				return;
			}
			if (arg0 == 5055) {
				local157 = anIntArray92[--anInt1257];
				aStringArray12[anInt1252++] = Static230.aClass179_2.method3930(local157).method45();
				return;
			}
			if (arg0 == 5056) {
				local157 = anIntArray92[--anInt1257];
				@Pc(760) Class2_Sub1_Sub2 local760 = Static230.aClass179_2.method3930(local157);
				if (local760.anIntArray7 == null) {
					anIntArray92[anInt1257++] = 0;
					return;
				}
				anIntArray92[anInt1257++] = local760.anIntArray7.length;
				return;
			}
			if (arg0 == 5057) {
				anInt1257 -= 2;
				local157 = anIntArray92[anInt1257];
				local192 = anIntArray92[anInt1257 + 1];
				anIntArray92[anInt1257++] = Static230.aClass179_2.method3930(local157).anIntArray7[local192];
				return;
			}
			if (arg0 == 5058) {
				aClass133_1 = new Class133();
				aClass133_1.anInt3381 = anIntArray92[--anInt1257];
				aClass133_1.aClass2_Sub1_Sub2_1 = Static230.aClass179_2.method3930(aClass133_1.anInt3381);
				aClass133_1.anIntArray282 = new int[aClass133_1.aClass2_Sub1_Sub2_1.method49()];
				return;
			}
			if (arg0 == 5059) {
				Static164.method2403(Static158.aClass208_41);
				Static389.aClass2_Sub17_Sub1_2.method6172(0);
				local157 = Static389.aClass2_Sub17_Sub1_2.anInt7523;
				Static389.aClass2_Sub17_Sub1_2.method6172(0);
				Static389.aClass2_Sub17_Sub1_2.method6130(aClass133_1.anInt3381);
				aClass133_1.aClass2_Sub1_Sub2_1.method52(aClass133_1.anIntArray282, Static389.aClass2_Sub17_Sub1_2);
				Static389.aClass2_Sub17_Sub1_2.method6131(Static389.aClass2_Sub17_Sub1_2.anInt7523 - local157);
				return;
			}
			if (arg0 == 5060) {
				local75 = aStringArray12[--anInt1252];
				Static164.method2403(Static195.aClass208_54);
				Static389.aClass2_Sub17_Sub1_2.method6172(0);
				local192 = Static389.aClass2_Sub17_Sub1_2.anInt7523;
				Static389.aClass2_Sub17_Sub1_2.method6151(local75);
				Static389.aClass2_Sub17_Sub1_2.method6130(aClass133_1.anInt3381);
				aClass133_1.aClass2_Sub1_Sub2_1.method52(aClass133_1.anIntArray282, Static389.aClass2_Sub17_Sub1_2);
				Static389.aClass2_Sub17_Sub1_2.method6131(Static389.aClass2_Sub17_Sub1_2.anInt7523 - local192);
				return;
			}
			if (arg0 == 5061) {
				Static164.method2403(Static158.aClass208_41);
				Static389.aClass2_Sub17_Sub1_2.method6172(0);
				local157 = Static389.aClass2_Sub17_Sub1_2.anInt7523;
				Static389.aClass2_Sub17_Sub1_2.method6172(1);
				Static389.aClass2_Sub17_Sub1_2.method6130(aClass133_1.anInt3381);
				aClass133_1.aClass2_Sub1_Sub2_1.method52(aClass133_1.anIntArray282, Static389.aClass2_Sub17_Sub1_2);
				Static389.aClass2_Sub17_Sub1_2.method6131(Static389.aClass2_Sub17_Sub1_2.anInt7523 - local157);
				return;
			}
			if (arg0 == 5062) {
				anInt1257 -= 2;
				local157 = anIntArray92[anInt1257];
				local192 = anIntArray92[anInt1257 + 1];
				anIntArray92[anInt1257++] = Static235.aClass72_1.method1445(local157).aCharArray4[local192];
				return;
			}
			if (arg0 == 5063) {
				anInt1257 -= 2;
				local157 = anIntArray92[anInt1257];
				local192 = anIntArray92[anInt1257 + 1];
				anIntArray92[anInt1257++] = Static235.aClass72_1.method1445(local157).aCharArray5[local192];
				return;
			}
			if (arg0 == 5064) {
				anInt1257 -= 2;
				local157 = anIntArray92[anInt1257];
				local192 = anIntArray92[anInt1257 + 1];
				if (local192 == -1) {
					anIntArray92[anInt1257++] = -1;
					return;
				}
				anIntArray92[anInt1257++] = Static235.aClass72_1.method1445(local157).method4778((char) local192);
				return;
			}
			if (arg0 == 5065) {
				anInt1257 -= 2;
				local157 = anIntArray92[anInt1257];
				local192 = anIntArray92[anInt1257 + 1];
				if (local192 == -1) {
					anIntArray92[anInt1257++] = -1;
					return;
				}
				anIntArray92[anInt1257++] = Static235.aClass72_1.method1445(local157).method4777((char) local192);
				return;
			}
			if (arg0 == 5066) {
				local157 = anIntArray92[--anInt1257];
				anIntArray92[anInt1257++] = Static230.aClass179_2.method3930(local157).method49();
				return;
			}
			if (arg0 == 5067) {
				anInt1257 -= 2;
				local157 = anIntArray92[anInt1257];
				local192 = anIntArray92[anInt1257 + 1];
				local89 = Static230.aClass179_2.method3930(local157).method44(local192).anInt763;
				anIntArray92[anInt1257++] = local89;
				return;
			}
			if (arg0 == 5068) {
				anInt1257 -= 2;
				local157 = anIntArray92[anInt1257];
				local192 = anIntArray92[anInt1257 + 1];
				aClass133_1.anIntArray282[local157] = local192;
				return;
			}
			if (arg0 == 5069) {
				anInt1257 -= 2;
				local157 = anIntArray92[anInt1257];
				local192 = anIntArray92[anInt1257 + 1];
				aClass133_1.anIntArray282[local157] = local192;
				return;
			}
			if (arg0 == 5070) {
				anInt1257 -= 3;
				local157 = anIntArray92[anInt1257];
				local192 = anIntArray92[anInt1257 + 1];
				local89 = anIntArray92[anInt1257 + 2];
				@Pc(1265) Class2_Sub1_Sub2 local1265 = Static230.aClass179_2.method3930(local157);
				if (local1265.method44(local192).anInt763 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray92[anInt1257++] = local1265.method51(local192, local89);
				return;
			}
			if (arg0 == 5071) {
				local75 = aStringArray12[--anInt1252];
				local1313 = anIntArray92[--anInt1257] == 1;
				Static418.method5752(local75, local1313);
				anIntArray92[anInt1257++] = Static249.anInt4280;
				return;
			}
			if (arg0 == 5072) {
				if (Static166.aShortArray44 != null && Static222.anInt3732 < Static249.anInt4280) {
					anIntArray92[anInt1257++] = Static166.aShortArray44[Static222.anInt3732++] & 0xFFFF;
					return;
				}
				anIntArray92[anInt1257++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static222.anInt3732 = 0;
				return;
			}
			if (arg0 == 5074) {
				Static164.method2403(Static158.aClass208_41);
				Static389.aClass2_Sub17_Sub1_2.method6172(0);
				local157 = Static389.aClass2_Sub17_Sub1_2.anInt7523;
				Static389.aClass2_Sub17_Sub1_2.method6172(2);
				Static389.aClass2_Sub17_Sub1_2.method6130(aClass133_1.anInt3381);
				aClass133_1.aClass2_Sub1_Sub2_1.method52(aClass133_1.anIntArray282, Static389.aClass2_Sub17_Sub1_2);
				Static389.aClass2_Sub17_Sub1_2.method6131(Static389.aClass2_Sub17_Sub1_2.anInt7523 - local157);
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static161.aClass115_1.method2374(86)) {
					anIntArray92[anInt1257++] = 1;
					return;
				}
				anIntArray92[anInt1257++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static161.aClass115_1.method2374(82)) {
					anIntArray92[anInt1257++] = 1;
					return;
				}
				anIntArray92[anInt1257++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static161.aClass115_1.method2374(81)) {
					anIntArray92[anInt1257++] = 1;
					return;
				}
				anIntArray92[anInt1257++] = 0;
				return;
			}
		} else {
			@Pc(2691) int local2691;
			@Pc(1965) boolean local1965;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static2.method28(anIntArray92[--anInt1257]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray92[anInt1257++] = Static433.method5872();
					return;
				}
				if (arg0 == 5205) {
					Static67.method1060(anIntArray92[--anInt1257], -1, -1, false);
					return;
				}
				@Pc(1554) Class2_Sub1_Sub14 local1554;
				if (arg0 == 5206) {
					local157 = anIntArray92[--anInt1257];
					local1554 = Static5.method5388(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					if (local1554 == null) {
						anIntArray92[anInt1257++] = -1;
						return;
					}
					anIntArray92[anInt1257++] = local1554.anInt5743;
					return;
				}
				@Pc(1587) Class2_Sub1_Sub14 local1587;
				if (arg0 == 5207) {
					local1587 = Static5.method5389(anIntArray92[--anInt1257]);
					if (local1587 != null && local1587.aString56 != null) {
						aStringArray12[anInt1252++] = local1587.aString56;
						return;
					}
					aStringArray12[anInt1252++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray92[anInt1257++] = Static279.anInt5040;
					anIntArray92[anInt1257++] = Static410.anInt7046;
					return;
				}
				if (arg0 == 5209) {
					anIntArray92[anInt1257++] = Static204.anInt3501 + Static5.anInt6721;
					anIntArray92[anInt1257++] = Static180.anInt3183 + Static5.anInt6729;
					return;
				}
				if (arg0 == 5210) {
					local157 = anIntArray92[--anInt1257];
					local1554 = Static5.method5389(local157);
					if (local1554 == null) {
						anIntArray92[anInt1257++] = 0;
						anIntArray92[anInt1257++] = 0;
						return;
					}
					anIntArray92[anInt1257++] = local1554.anInt5748 >> 14 & 0x3FFF;
					anIntArray92[anInt1257++] = local1554.anInt5748 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local157 = anIntArray92[--anInt1257];
					local1554 = Static5.method5389(local157);
					if (local1554 == null) {
						anIntArray92[anInt1257++] = 0;
						anIntArray92[anInt1257++] = 0;
						return;
					}
					anIntArray92[anInt1257++] = local1554.anInt5753 - local1554.anInt5746;
					anIntArray92[anInt1257++] = local1554.anInt5751 - local1554.anInt5741;
					return;
				}
				@Pc(1777) Class2_Sub16 local1777;
				if (arg0 == 5212) {
					local1777 = Static113.method1868();
					if (local1777 == null) {
						anIntArray92[anInt1257++] = -1;
						anIntArray92[anInt1257++] = -1;
						return;
					}
					anIntArray92[anInt1257++] = local1777.anInt2880;
					local192 = local1777.anInt2883 << 28 | local1777.anInt2879 + Static5.anInt6721 << 14 | local1777.anInt2882 + Static5.anInt6729;
					anIntArray92[anInt1257++] = local192;
					return;
				}
				if (arg0 == 5213) {
					local1777 = Static20.method388();
					if (local1777 == null) {
						anIntArray92[anInt1257++] = -1;
						anIntArray92[anInt1257++] = -1;
						return;
					}
					anIntArray92[anInt1257++] = local1777.anInt2880;
					local192 = local1777.anInt2883 << 28 | local1777.anInt2879 + Static5.anInt6721 << 14 | local1777.anInt2882 + Static5.anInt6729;
					anIntArray92[anInt1257++] = local192;
					return;
				}
				@Pc(1925) boolean local1925;
				if (arg0 == 5214) {
					local157 = anIntArray92[--anInt1257];
					local1554 = Static308.method4421();
					if (local1554 != null) {
						local1925 = local1554.method4552(local157 & 0x3FFF, local157 >> 14 & 0x3FFF, local157 >> 28 & 0x3, anIntArray95);
						if (local1925) {
							Static458.method6240(anIntArray95[2], anIntArray95[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt1257 -= 2;
					local157 = anIntArray92[anInt1257];
					local192 = anIntArray92[anInt1257 + 1];
					@Pc(1963) Class71 local1963 = Static5.method5395(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					local1965 = false;
					for (@Pc(1970) Class2_Sub1_Sub14 local1970 = (Class2_Sub1_Sub14) local1963.method1431(); local1970 != null; local1970 = (Class2_Sub1_Sub14) local1963.method1428()) {
						if (local1970.anInt5743 == local192) {
							local1965 = true;
							break;
						}
					}
					if (local1965) {
						anIntArray92[anInt1257++] = 1;
						return;
					}
					anIntArray92[anInt1257++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local157 = anIntArray92[--anInt1257];
					local1554 = Static5.method5389(local157);
					if (local1554 == null) {
						anIntArray92[anInt1257++] = -1;
						return;
					}
					anIntArray92[anInt1257++] = local1554.anInt5744;
					return;
				}
				if (arg0 == 5220) {
					anIntArray92[anInt1257++] = Static382.anInt6617 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local157 = anIntArray92[--anInt1257];
					Static458.method6240(local157 & 0x3FFF, local157 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1587 = Static308.method4421();
					if (local1587 != null) {
						local1313 = local1587.method4554(anIntArray95, Static204.anInt3501 + Static5.anInt6721, Static180.anInt3183 + Static5.anInt6729);
						if (local1313) {
							anIntArray92[anInt1257++] = anIntArray95[1];
							anIntArray92[anInt1257++] = anIntArray95[2];
							return;
						}
						anIntArray92[anInt1257++] = -1;
						anIntArray92[anInt1257++] = -1;
						return;
					}
					anIntArray92[anInt1257++] = -1;
					anIntArray92[anInt1257++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt1257 -= 2;
					local157 = anIntArray92[anInt1257];
					local192 = anIntArray92[anInt1257 + 1];
					Static67.method1060(local157, local192 >> 14 & 0x3FFF, local192 & 0x3FFF, false);
					return;
				}
				if (arg0 == 5224) {
					local157 = anIntArray92[--anInt1257];
					local1554 = Static308.method4421();
					if (local1554 != null) {
						local1925 = local1554.method4552(local157 & 0x3FFF, local157 >> 14 & 0x3FFF, local157 >> 28 & 0x3, anIntArray95);
						if (local1925) {
							anIntArray92[anInt1257++] = anIntArray95[1];
							anIntArray92[anInt1257++] = anIntArray95[2];
							return;
						}
						anIntArray92[anInt1257++] = -1;
						anIntArray92[anInt1257++] = -1;
						return;
					}
					anIntArray92[anInt1257++] = -1;
					anIntArray92[anInt1257++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local157 = anIntArray92[--anInt1257];
					local1554 = Static308.method4421();
					if (local1554 != null) {
						local1925 = local1554.method4554(anIntArray95, local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
						if (local1925) {
							anIntArray92[anInt1257++] = anIntArray95[1];
							anIntArray92[anInt1257++] = anIntArray95[2];
							return;
						}
						anIntArray92[anInt1257++] = -1;
						anIntArray92[anInt1257++] = -1;
						return;
					}
					anIntArray92[anInt1257++] = -1;
					anIntArray92[anInt1257++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static416.method4069(anIntArray92[--anInt1257]);
					return;
				}
				if (arg0 == 5227) {
					anInt1257 -= 2;
					local157 = anIntArray92[anInt1257];
					local192 = anIntArray92[anInt1257 + 1];
					Static67.method1060(local157, local192 >> 14 & 0x3FFF, local192 & 0x3FFF, true);
					return;
				}
				if (arg0 == 5228) {
					Static414.aBoolean470 = anIntArray92[--anInt1257] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray92[anInt1257++] = Static414.aBoolean470 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local157 = anIntArray92[--anInt1257];
					Static452.method847(local157);
					return;
				}
				@Pc(2483) Class2 local2483;
				if (arg0 == 5231) {
					anInt1257 -= 2;
					local157 = anIntArray92[anInt1257];
					local1313 = anIntArray92[anInt1257 + 1] == 1;
					if (Static139.aClass220_15 != null) {
						local2483 = Static139.aClass220_15.method5099((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method6260();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class2();
							Static139.aClass220_15.method5104(local2483, (long) local157);
						}
					}
					return;
				}
				@Pc(2525) Class2 local2525;
				if (arg0 == 5232) {
					local157 = anIntArray92[--anInt1257];
					if (Static139.aClass220_15 != null) {
						local2525 = Static139.aClass220_15.method5099((long) local157);
						anIntArray92[anInt1257++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray92[anInt1257++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt1257 -= 2;
					local157 = anIntArray92[anInt1257];
					local1313 = anIntArray92[anInt1257 + 1] == 1;
					if (Static86.aClass220_4 != null) {
						local2483 = Static86.aClass220_4.method5099((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method6260();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class2();
							Static86.aClass220_4.method5104(local2483, (long) local157);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local157 = anIntArray92[--anInt1257];
					if (Static86.aClass220_4 != null) {
						local2525 = Static86.aClass220_4.method5099((long) local157);
						anIntArray92[anInt1257++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray92[anInt1257++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray92[anInt1257++] = Static5.aClass2_Sub1_Sub14_2 == null ? -1 : Static5.aClass2_Sub1_Sub14_2.anInt5743;
					return;
				}
				if (arg0 == 5236) {
					anInt1257 -= 2;
					local157 = anIntArray92[anInt1257];
					local192 = anIntArray92[anInt1257 + 1];
					local89 = local192 >> 14 & 0x3FFF;
					local95 = local192 & 0x3FFF;
					local2691 = Static265.method3559(local157, local89, local95);
					if (local2691 < 0) {
						anIntArray92[anInt1257++] = -1;
						return;
					}
					anIntArray92[anInt1257++] = local2691;
					return;
				}
				if (arg0 == 5237) {
					Static238.method3233();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt1257 -= 2;
					local157 = anIntArray92[anInt1257];
					local192 = anIntArray92[anInt1257 + 1];
					Static291.method4115(false, local192, local157, 3);
					anIntArray92[anInt1257++] = Static50.aFrame1 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static50.aFrame1 != null) {
						Static291.method4115(false, -1, -1, Static434.aClass165_Sub1_1.anInt4206);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2775) Class151[] local2775 = Static9.method5074();
					anIntArray92[anInt1257++] = local2775.length;
					return;
				}
				if (arg0 == 5303) {
					local157 = anIntArray92[--anInt1257];
					@Pc(2799) Class151[] local2799 = Static9.method5074();
					anIntArray92[anInt1257++] = local2799[local157].anInt3724;
					anIntArray92[anInt1257++] = local2799[local157].anInt3725;
					return;
				}
				if (arg0 == 5305) {
					local157 = Static434.aClass165_Sub1_1.anInt4212;
					local192 = Static434.aClass165_Sub1_1.anInt4211;
					local89 = -1;
					@Pc(2836) Class151[] local2836 = Static9.method5074();
					for (local2691 = 0; local2691 < local2836.length; local2691++) {
						@Pc(2843) Class151 local2843 = local2836[local2691];
						if (local2843.anInt3724 == local157 && local2843.anInt3725 == local192) {
							local89 = local2691;
							break;
						}
					}
					anIntArray92[anInt1257++] = local89;
					return;
				}
				if (arg0 == 5306) {
					anIntArray92[anInt1257++] = Static235.method3217();
					return;
				}
				if (arg0 == 5307) {
					local157 = anIntArray92[--anInt1257];
					if (local157 >= 1 && local157 <= 2) {
						Static291.method4115(false, -1, -1, local157);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray92[anInt1257++] = Static434.aClass165_Sub1_1.anInt4206;
					return;
				}
				if (arg0 == 5309) {
					local157 = anIntArray92[--anInt1257];
					if (local157 >= 1 && local157 <= 2) {
						Static434.aClass165_Sub1_1.anInt4206 = local157;
						Static434.aClass165_Sub1_1.method3400(Static138.aClass194_2);
						return;
					}
					return;
				}
			} else {
				@Pc(3351) String local3351;
				if (arg0 < 5500) {
					if (arg0 == 5400) {
						anInt1252 -= 2;
						local75 = aStringArray12[anInt1252];
						local81 = aStringArray12[anInt1252 + 1];
						local89 = anIntArray92[--anInt1257];
						Static164.method2403(Static56.aClass208_13);
						Static389.aClass2_Sub17_Sub1_2.method6172(Static380.method5246(local75) + Static380.method5246(local81) + 1);
						Static389.aClass2_Sub17_Sub1_2.method6151(local75);
						Static389.aClass2_Sub17_Sub1_2.method6151(local81);
						Static389.aClass2_Sub17_Sub1_2.method6172(local89);
						return;
					}
					if (arg0 == 5401) {
						anInt1257 -= 2;
						Static63.aShortArray96[anIntArray92[anInt1257]] = (short) Static293.method4160(anIntArray92[anInt1257 + 1]);
						Static413.aClass271_2.method6194();
						Static413.aClass271_2.method6203();
						Static227.aClass54_2.method1124();
						Static323.method4576();
						return;
					}
					if (arg0 == 5405) {
						anInt1257 -= 2;
						local157 = anIntArray92[anInt1257];
						local192 = anIntArray92[anInt1257 + 1];
						if (local157 >= 0 && local157 < 2) {
							Static43.anIntArrayArrayArray3[local157] = new int[local192 << 1][4];
						}
						return;
					}
					if (arg0 == 5406) {
						anInt1257 -= 7;
						local157 = anIntArray92[anInt1257];
						local192 = anIntArray92[anInt1257 + 1] << 1;
						local89 = anIntArray92[anInt1257 + 2];
						local95 = anIntArray92[anInt1257 + 3];
						local2691 = anIntArray92[anInt1257 + 4];
						@Pc(3111) int local3111 = anIntArray92[anInt1257 + 5];
						@Pc(3117) int local3117 = anIntArray92[anInt1257 + 6];
						if (local157 >= 0 && local157 < 2 && Static43.anIntArrayArrayArray3[local157] != null && local192 >= 0 && local192 < Static43.anIntArrayArrayArray3[local157].length) {
							Static43.anIntArrayArrayArray3[local157][local192] = new int[] { (local89 >> 14 & 0x3FFF) << 7, local95, (local89 & 0x3FFF) << 7, local3117 };
							Static43.anIntArrayArrayArray3[local157][local192 + 1] = new int[] { (local2691 >> 14 & 0x3FFF) << 7, local3111, (local2691 & 0x3FFF) << 7 };
						}
						return;
					}
					if (arg0 == 5407) {
						local157 = Static43.anIntArrayArrayArray3[anIntArray92[--anInt1257]].length >> 1;
						anIntArray92[anInt1257++] = local157;
						return;
					}
					if (arg0 == 5411) {
						if (Static50.aFrame1 != null) {
							Static291.method4115(false, -1, -1, Static434.aClass165_Sub1_1.anInt4206);
						}
						if (Static393.aFrame2 != null) {
							Static331.method4731();
							System.exit(0);
							return;
						}
						local75 = Static147.aString26 == null ? Static47.method735() : Static147.aString26;
						Static87.method1366(Static138.aClass194_2, Static404.anInt2752 == 1, local75, false);
						return;
					}
					if (arg0 == 5419) {
						local75 = "";
						if (Static81.aClass136_1 != null) {
							if (Static81.aClass136_1.anObject10 == null) {
								local75 = Static184.method2674(Static81.aClass136_1.anInt3420);
							} else {
								local75 = (String) Static81.aClass136_1.anObject10;
							}
						}
						aStringArray12[anInt1252++] = local75;
						return;
					}
					if (arg0 == 5420) {
						anIntArray92[anInt1257++] = Static307.anInt5537 == 3 ? 1 : 0;
						return;
					}
					if (arg0 == 5421) {
						if (Static50.aFrame1 != null) {
							Static291.method4115(false, -1, -1, Static434.aClass165_Sub1_1.anInt4206);
						}
						local75 = aStringArray12[--anInt1252];
						local1313 = anIntArray92[--anInt1257] == 1;
						local3351 = Static47.method735() + local75;
						Static87.method1366(Static138.aClass194_2, Static404.anInt2752 == 1, local3351, local1313);
						return;
					}
					if (arg0 == 5422) {
						anInt1252 -= 2;
						local75 = aStringArray12[anInt1252];
						local81 = aStringArray12[anInt1252 + 1];
						local89 = anIntArray92[--anInt1257];
						if (local75.length() > 0) {
							if (Static58.aStringArray10 == null) {
								Static58.aStringArray10 = new String[Static223.anIntArray343[Static10.aClass200_1.anInt5771]];
							}
							Static58.aStringArray10[local89] = local75;
						}
						if (local81.length() > 0) {
							if (Static347.aStringArray56 == null) {
								Static347.aStringArray56 = new String[Static223.anIntArray343[Static10.aClass200_1.anInt5771]];
							}
							Static347.aStringArray56[local89] = local81;
						}
						return;
					}
					if (arg0 == 5423) {
						System.out.println(aStringArray12[--anInt1252]);
						return;
					}
					if (arg0 == 5424) {
						anInt1257 -= 11;
						Static175.anInt3111 = anIntArray92[anInt1257];
						Static47.anInt760 = anIntArray92[anInt1257 + 1];
						Static23.anInt7093 = anIntArray92[anInt1257 + 2];
						Static393.anInt6776 = anIntArray92[anInt1257 + 3];
						Static59.anInt6509 = anIntArray92[anInt1257 + 4];
						Static369.anInt6487 = anIntArray92[anInt1257 + 5];
						Static89.anInt1086 = anIntArray92[anInt1257 + 6];
						Static201.anInt3440 = anIntArray92[anInt1257 + 7];
						Static285.anInt5128 = anIntArray92[anInt1257 + 8];
						Static153.anInt2799 = anIntArray92[anInt1257 + 9];
						Static239.anInt4035 = anIntArray92[anInt1257 + 10];
						Static446.aClass171_101.method3666(Static59.anInt6509);
						Static446.aClass171_101.method3666(Static369.anInt6487);
						Static446.aClass171_101.method3666(Static89.anInt1086);
						Static446.aClass171_101.method3666(Static201.anInt3440);
						Static446.aClass171_101.method3666(Static285.anInt5128);
						Static211.aClass41_9 = null;
						Static86.aClass41_3 = null;
						Static436.aClass41_18 = null;
						Static191.aClass41_7 = null;
						Static340.aClass41_16 = null;
						Static99.aClass41_4 = null;
						Static300.aClass41_15 = null;
						Static134.aClass41_6 = null;
						Static237.aBoolean264 = true;
						return;
					}
					if (arg0 == 5425) {
						Static86.method1340();
						Static237.aBoolean264 = false;
						return;
					}
					if (arg0 == 5426) {
						anInt1257 -= 2;
						Static447.anInt7439 = anIntArray92[anInt1257];
						Static385.anInt6687 = anIntArray92[anInt1257 + 1];
						return;
					}
					if (arg0 == 5427) {
						anInt1257 -= 2;
						Static229.anInt3813 = anIntArray92[anInt1257 + 1];
						return;
					}
					if (arg0 == 5428) {
						anInt1257 -= 2;
						local157 = anIntArray92[anInt1257];
						local192 = anIntArray92[anInt1257 + 1];
						anIntArray92[anInt1257++] = Static50.method774(local192, local157) ? 1 : 0;
						return;
					}
					if (arg0 == 5429) {
						Static254.method3553(aStringArray12[--anInt1252], false, false);
						return;
					}
					if (arg0 == 5430) {
						try {
							Static471.method4356(Static138.aClass194_2.anApplet1, "accountcreated");
							return;
						} catch (@Pc(3646) Throwable local3646) {
							return;
						}
					}
				} else if (arg0 < 5600) {
					if (arg0 == 5500) {
						anInt1257 -= 4;
						local157 = anIntArray92[anInt1257];
						local192 = anIntArray92[anInt1257 + 1];
						local89 = anIntArray92[anInt1257 + 2];
						local95 = anIntArray92[anInt1257 + 3];
						Static295.method4187((local157 & 0x3FFF) - Static153.anInt2798, (local157 >> 14 & 0x3FFF) - Static386.anInt7205, local192, local95, local89, false);
						return;
					}
					if (arg0 == 5501) {
						anInt1257 -= 4;
						local157 = anIntArray92[anInt1257];
						local192 = anIntArray92[anInt1257 + 1];
						local89 = anIntArray92[anInt1257 + 2];
						local95 = anIntArray92[anInt1257 + 3];
						Static158.method2342((local157 & 0x3FFF) - Static153.anInt2798, local95, local192, (local157 >> 14 & 0x3FFF) - Static386.anInt7205, local89);
						return;
					}
					if (arg0 == 5502) {
						anInt1257 -= 6;
						local157 = anIntArray92[anInt1257];
						if (local157 >= 2) {
							throw new RuntimeException();
						}
						Static273.anInt4956 = local157;
						local192 = anIntArray92[anInt1257 + 1];
						if (local192 + 1 >= Static43.anIntArrayArrayArray3[Static273.anInt4956].length >> 1) {
							throw new RuntimeException();
						}
						Static204.anInt3496 = local192;
						Static346.anInt6132 = 0;
						Static118.anInt2008 = anIntArray92[anInt1257 + 2];
						Static384.anInt6628 = anIntArray92[anInt1257 + 3];
						local89 = anIntArray92[anInt1257 + 4];
						if (local89 >= 2) {
							throw new RuntimeException();
						}
						Static220.anInt3722 = local89;
						local95 = anIntArray92[anInt1257 + 5];
						if (local95 + 1 >= Static43.anIntArrayArrayArray3[Static220.anInt3722].length >> 1) {
							throw new RuntimeException();
						}
						Static269.anInt2104 = local95;
						Static25.anInt7273 = 3;
						return;
					}
					if (arg0 == 5503) {
						Static410.method5652();
						return;
					}
					if (arg0 == 5504) {
						anInt1257 -= 2;
						Static196.method2784(anIntArray92[anInt1257], anIntArray92[anInt1257 + 1]);
						return;
					}
					if (arg0 == 5505) {
						anIntArray92[anInt1257++] = (int) Static234.aFloat30 >> 3;
						return;
					}
					if (arg0 == 5506) {
						anIntArray92[anInt1257++] = (int) Static37.aFloat9 >> 3;
						return;
					}
					if (arg0 == 5507) {
						Static366.method5131();
						return;
					}
					if (arg0 == 5508) {
						Static161.method2389();
						return;
					}
					if (arg0 == 5509) {
						Static206.method2913();
						return;
					}
					if (arg0 == 5510) {
						Static275.method3929();
						return;
					}
					if (arg0 == 5511) {
						local157 = anIntArray92[--anInt1257];
						local192 = local157 >> 14 & 0x3FFF;
						local89 = local157 & 0x3FFF;
						local192 -= Static386.anInt7205;
						if (local192 < 0) {
							local192 = 0;
						} else if (local192 >= Static234.anInt3949) {
							local192 = Static234.anInt3949;
						}
						local89 -= Static153.anInt2798;
						if (local89 < 0) {
							local89 = 0;
						} else if (local89 >= Static371.anInt6492) {
							local89 = Static371.anInt6492;
						}
						Static188.anInt6693 = (local192 << 7) + 64;
						Static235.anInt3979 = (local89 << 7) + 64;
						Static25.anInt7273 = 4;
						return;
					}
					if (arg0 == 5512) {
						Static68.method1064();
						return;
					}
				} else if (arg0 < 5700) {
					if (arg0 == 5600) {
						anInt1252 -= 2;
						local75 = aStringArray12[anInt1252];
						local81 = aStringArray12[anInt1252 + 1];
						local89 = anIntArray92[--anInt1257];
						if (Static433.anInt7309 != 2) {
							return;
						}
						if (Static129.anInt2192 == 0 && Static54.anInt992 == 0) {
							Static448.aString72 = local75;
							Static205.aString31 = local81;
							Static199.anInt3422 = local89;
							Static274.method3920(5);
							return;
						}
						return;
					}
					if (arg0 == 5601) {
						Static117.method1919();
						return;
					}
					if (arg0 == 5602) {
						if (Static129.anInt2192 == 0) {
							Static259.anInt4592 = -2;
							Static20.anInt412 = -2;
						}
						return;
					}
					if (arg0 == 5603) {
						anInt1257 -= 4;
						if (Static433.anInt7309 != 2) {
							return;
						}
						if (Static129.anInt2192 == 0 && Static54.anInt992 == 0) {
							Static362.method5100(anIntArray92[anInt1257 + 3], anIntArray92[anInt1257], anIntArray92[anInt1257 + 2], anIntArray92[anInt1257 + 1]);
							return;
						}
						return;
					}
					if (arg0 == 5604) {
						anInt1252--;
						if (Static433.anInt7309 != 2) {
							return;
						}
						if (Static129.anInt2192 == 0 && Static54.anInt992 == 0) {
							Static406.method5645(Static71.method1107(aStringArray12[anInt1252]));
							return;
						}
						return;
					}
					if (arg0 == 5605) {
						anInt1252 -= 2;
						if (Static433.anInt7309 != 2) {
							return;
						}
						if (Static129.anInt2192 == 0 && Static54.anInt992 == 0) {
							Static303.method3587(false, aStringArray12[anInt1252 + 1], Static71.method1107(aStringArray12[anInt1252]));
							return;
						}
						return;
					}
					if (arg0 == 5606) {
						if (Static54.anInt992 == 0) {
							Static298.anInt5371 = -2;
						}
						return;
					}
					if (arg0 == 5607) {
						anIntArray92[anInt1257++] = Static20.anInt412;
						return;
					}
					if (arg0 == 5608) {
						anIntArray92[anInt1257++] = Static461.anInt7749;
						return;
					}
					if (arg0 == 5609) {
						anIntArray92[anInt1257++] = Static298.anInt5371;
						return;
					}
					if (arg0 == 5610) {
						for (local157 = 0; local157 < 5; local157++) {
							aStringArray12[anInt1252++] = Static374.aStringArray62.length > local157 ? Static213.method3020(Static374.aStringArray62[local157]) : "";
						}
						Static374.aStringArray62 = null;
						return;
					}
					if (arg0 == 5611) {
						anIntArray92[anInt1257++] = Static353.anInt6219;
						return;
					}
					if (arg0 == 5612) {
						local157 = anIntArray92[--anInt1257];
						if (Static433.anInt7309 != 6) {
							return;
						}
						if (Static129.anInt2192 == 0 && Static54.anInt992 == 0) {
							if (Static339.aClass66_2 != null) {
								Static339.aClass66_2.method1388();
								Static339.aClass66_2 = null;
							}
							Static199.anInt3422 = local157;
							Static274.method3920(8);
							return;
						}
						return;
					}
					if (arg0 == 5613) {
						anIntArray92[anInt1257++] = Static20.anInt412;
						return;
					}
					if (arg0 == 5615) {
						anInt1252 -= 2;
						local75 = aStringArray12[anInt1252];
						local81 = aStringArray12[anInt1252 + 1];
						if (Static433.anInt7309 != 2) {
							return;
						}
						if (Static129.anInt2192 == 0 && Static54.anInt992 == 0) {
							if (Static339.aClass66_2 != null) {
								Static339.aClass66_2.method1388();
								Static339.aClass66_2 = null;
							}
							Static448.aString72 = local75;
							Static205.aString31 = local81;
							Static274.method3920(4);
							return;
						}
						return;
					}
					if (arg0 == 5616) {
						Static360.method5072(false);
						return;
					}
					if (arg0 == 5617) {
						anIntArray92[anInt1257++] = Static259.anInt4592;
						return;
					}
					if (arg0 == 5618) {
						local157 = anIntArray92[--anInt1257];
						Static119.method1942(false, local157);
						return;
					}
					if (arg0 == 5619) {
						local157 = anIntArray92[--anInt1257];
						Static119.method1942(true, local157);
						return;
					}
					if (arg0 == 5620) {
						Static16.method4090();
						if (Static13.aString2 != "" && Static13.aString2 != "") {
							anIntArray92[anInt1257++] = 1;
							return;
						}
						anIntArray92[anInt1257++] = 0;
						return;
					}
					if (arg0 == 5621) {
						anInt1252 -= 2;
						if (Static433.anInt7309 != 2) {
							return;
						}
						if (Static129.anInt2192 == 0 && Static54.anInt992 == 0) {
							Static303.method3587(true, aStringArray12[anInt1252 + 1], Static71.method1107(aStringArray12[anInt1252]));
							return;
						}
						return;
					}
					if (arg0 == 5622) {
						@Pc(4436) Class136 local4436 = Static138.aClass194_2.method4405(false, "3");
						while (local4436.anInt3418 == 0) {
							Static167.method6157(1L);
						}
						if (local4436.anInt3418 == 2) {
							throw new RuntimeException("Error opening file");
						}
						@Pc(4456) Class213 local4456 = (Class213) local4436.anObject10;
						if (local4456.method4948().exists()) {
							@Pc(4466) Class2_Sub17 local4466 = new Class2_Sub17(50);
							try {
								local4456.method4947(50, local4466.aByteArray94, 0);
							} catch (@Pc(4475) IOException local4475) {
							}
						}
						try {
							local4456.method4946();
							return;
						} catch (@Pc(4481) Exception local4481) {
							return;
						}
					}
				} else if (arg0 < 6100) {
					if (arg0 == 6001) {
						local157 = anIntArray92[--anInt1257];
						if (local157 < 1) {
							local157 = 1;
						}
						if (local157 > 4) {
							local157 = 4;
						}
						Static434.aClass165_Sub1_1.anInt4210 = local157;
						Static61.method978();
						Static434.aClass165_Sub1_1.method3400(Static138.aClass194_2);
						Static214.aBoolean244 = false;
						return;
					}
					if (arg0 == 6002) {
						Static434.aClass165_Sub1_1.method3399(anIntArray92[--anInt1257] == 1);
						Static61.method978();
						Static120.method1949();
						Static434.aClass165_Sub1_1.method3400(Static138.aClass194_2);
						Static214.aBoolean244 = false;
						return;
					}
					if (arg0 == 6003) {
						Static434.aClass165_Sub1_1.aBoolean298 = anIntArray92[--anInt1257] == 1;
						Static120.method1949();
						Static434.aClass165_Sub1_1.method3400(Static138.aClass194_2);
						Static214.aBoolean244 = false;
						return;
					}
					if (arg0 == 6005) {
						Static434.aClass165_Sub1_1.aBoolean303 = anIntArray92[--anInt1257] == 1;
						Static61.method978();
						Static434.aClass165_Sub1_1.method3400(Static138.aClass194_2);
						Static214.aBoolean244 = false;
						return;
					}
					if (arg0 == 6006) {
						Static434.aClass165_Sub1_1.aBoolean294 = anIntArray92[--anInt1257] == 1;
						Static257.aClass75_8.method5949(!Static434.aClass165_Sub1_1.aBoolean294);
						Static434.aClass165_Sub1_1.method3400(Static138.aClass194_2);
						Static214.aBoolean244 = false;
						return;
					}
					if (arg0 == 6007) {
						Static434.aClass165_Sub1_1.anInt4215 = anIntArray92[--anInt1257];
						Static434.aClass165_Sub1_1.method3400(Static138.aClass194_2);
						Static214.aBoolean244 = false;
						return;
					}
					if (arg0 == 6008) {
						Static434.aClass165_Sub1_1.aBoolean292 = anIntArray92[--anInt1257] == 1;
						Static434.aClass165_Sub1_1.method3400(Static138.aClass194_2);
						Static214.aBoolean244 = false;
						return;
					}
					if (arg0 == 6009) {
						Static434.aClass165_Sub1_1.aBoolean295 = anIntArray92[--anInt1257] == 1;
						Static61.method978();
						Static434.aClass165_Sub1_1.method3400(Static138.aClass194_2);
						Static214.aBoolean244 = false;
						return;
					}
					if (arg0 == 6010) {
						Static434.aClass165_Sub1_1.aBoolean293 = anIntArray92[--anInt1257] == 1;
						Static434.aClass165_Sub1_1.method3400(Static138.aClass194_2);
						Static214.aBoolean244 = false;
						return;
					}
					if (arg0 == 6011) {
						local157 = anIntArray92[--anInt1257];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static434.aClass165_Sub1_1.method3391(Static404.anInt2752, local157);
						Static61.method978();
						Static434.aClass165_Sub1_1.method3400(Static138.aClass194_2);
						Static214.aBoolean244 = false;
						return;
					}
					if (arg0 == 6012) {
						Static434.aClass165_Sub1_1.method3388(anIntArray92[--anInt1257] == 1, Static404.anInt2752);
						Static465.method5995();
						Static366.method5130();
						Static434.aClass165_Sub1_1.method3400(Static138.aClass194_2);
						Static214.aBoolean244 = false;
						return;
					}
					if (arg0 == 6014) {
						Static434.aClass165_Sub1_1.aBoolean307 = anIntArray92[--anInt1257] == 1;
						Static61.method978();
						Static434.aClass165_Sub1_1.method3400(Static138.aClass194_2);
						Static214.aBoolean244 = false;
						return;
					}
					if (arg0 == 6015) {
						Static434.aClass165_Sub1_1.aBoolean305 = anIntArray92[--anInt1257] == 1;
						Static61.method978();
						Static434.aClass165_Sub1_1.method3400(Static138.aClass194_2);
						Static214.aBoolean244 = false;
						return;
					}
					if (arg0 == 6016) {
						local157 = anIntArray92[--anInt1257];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static434.aClass165_Sub1_1.anInt4201 = local157;
						Static357.method5001(Static404.anInt2752);
						Static434.aClass165_Sub1_1.method3400(Static138.aClass194_2);
						return;
					}
					if (arg0 == 6017) {
						Static434.aClass165_Sub1_1.aBoolean306 = anIntArray92[--anInt1257] == 1;
						Static392.method5432();
						Static434.aClass165_Sub1_1.method3400(Static138.aClass194_2);
						Static214.aBoolean244 = false;
						return;
					}
					if (arg0 == 6018) {
						local157 = anIntArray92[--anInt1257];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static434.aClass165_Sub1_1.anInt4205 = local157;
						Static434.aClass165_Sub1_1.method3400(Static138.aClass194_2);
						Static214.aBoolean244 = false;
						return;
					}
					if (arg0 == 6019) {
						local157 = anIntArray92[--anInt1257];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 255) {
							local157 = 255;
						}
						if (local157 != Static434.aClass165_Sub1_1.anInt4208) {
							if (Static434.aClass165_Sub1_1.anInt4208 == 0 && Static323.anInt5772 != -1) {
								Static124.method1968(Static323.anInt5772, Static431.aClass171_95, local157);
								Static235.aBoolean262 = false;
							} else if (local157 == 0) {
								Static95.method1417();
								Static235.aBoolean262 = false;
							} else {
								Static305.method171(local157);
							}
							Static434.aClass165_Sub1_1.anInt4208 = local157;
						}
						Static434.aClass165_Sub1_1.method3400(Static138.aClass194_2);
						Static214.aBoolean244 = false;
						return;
					}
					if (arg0 == 6020) {
						local157 = anIntArray92[--anInt1257];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static434.aClass165_Sub1_1.anInt4202 = local157;
						Static434.aClass165_Sub1_1.method3400(Static138.aClass194_2);
						Static214.aBoolean244 = false;
						return;
					}
					if (arg0 == 6021) {
						Static434.aClass165_Sub1_1.aBoolean308 = anIntArray92[--anInt1257] == 1;
						Static120.method1949();
						return;
					}
					if (arg0 == 6023) {
						local157 = anIntArray92[--anInt1257];
						local1313 = false;
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 2) {
							local157 = 2;
						}
						if (Static170.anInt3068 < 96) {
							local157 = 0;
							local1313 = true;
						}
						Static108.method1792(local157);
						Static434.aClass165_Sub1_1.method3400(Static138.aClass194_2);
						Static214.aBoolean244 = false;
						anIntArray92[anInt1257++] = local1313 ? 0 : 1;
						return;
					}
					if (arg0 == 6024) {
						local157 = anIntArray92[--anInt1257];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static434.aClass165_Sub1_1.anInt4196 = local157;
						Static434.aClass165_Sub1_1.method3400(Static138.aClass194_2);
						return;
					}
					if (arg0 == 6025) {
						local157 = anIntArray92[--anInt1257];
						if (local157 < 0 || local157 > Static278.method3967(Static170.anInt3068)) {
							local157 = 0;
						}
						Static434.aClass165_Sub1_1.anInt4200 = local157;
						Static434.aClass165_Sub1_1.method3400(Static138.aClass194_2);
						Static214.aBoolean244 = false;
						return;
					}
					if (arg0 == 6027) {
						local157 = anIntArray92[--anInt1257];
						if (local157 < 0 || local157 > 1) {
							local157 = 0;
						}
						Static172.method2532(local157 == 1);
						return;
					}
					if (arg0 == 6028) {
						Static434.aClass165_Sub1_1.aBoolean304 = anIntArray92[--anInt1257] != 0;
						Static434.aClass165_Sub1_1.method3400(Static138.aClass194_2);
						return;
					}
					if (arg0 == 6029) {
						Static434.aClass165_Sub1_1.anInt4215 = anIntArray92[--anInt1257];
						Static434.aClass165_Sub1_1.method3400(Static138.aClass194_2);
						return;
					}
					if (arg0 == 6030) {
						Static434.aClass165_Sub1_1.aBoolean301 = anIntArray92[--anInt1257] != 0;
						Static434.aClass165_Sub1_1.method3400(Static138.aClass194_2);
						Static61.method978();
						return;
					}
					if (arg0 == 6031) {
						local157 = anIntArray92[--anInt1257];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static357.method5001(local157);
						return;
					}
					if (arg0 == 6032) {
						local157 = anIntArray92[--anInt1257];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static434.aClass165_Sub1_1.anInt4193 = local157;
						Static434.aClass165_Sub1_1.method3400(Static138.aClass194_2);
						Static214.aBoolean244 = false;
						return;
					}
					if (arg0 == 6033) {
						local157 = anIntArray92[--anInt1257];
						if (local157 < 0 || local157 > 4) {
							local157 = 2;
						}
						Static434.aClass165_Sub1_1.anInt4214 = local157;
						Static434.aClass165_Sub1_1.method3400(Static138.aClass194_2);
						return;
					}
					if (arg0 == 6034) {
						Static434.aClass165_Sub1_1.aBoolean297 = anIntArray92[--anInt1257] == 1;
						Static434.aClass165_Sub1_1.method3400(Static138.aClass194_2);
						Static465.method5995();
						Static214.aBoolean244 = false;
						return;
					}
					if (arg0 == 6035) {
						Static434.aClass165_Sub1_1.aBoolean309 = anIntArray92[--anInt1257] == 1;
						Static61.method978();
						Static120.method1949();
						return;
					}
				} else if (arg0 < 6200) {
					if (arg0 == 6101) {
						anIntArray92[anInt1257++] = Static434.aClass165_Sub1_1.anInt4210;
						return;
					}
					if (arg0 == 6102) {
						anIntArray92[anInt1257++] = Static434.aClass165_Sub1_1.method3395(Static404.anInt2752) ? 1 : 0;
						return;
					}
					if (arg0 == 6103) {
						anIntArray92[anInt1257++] = Static434.aClass165_Sub1_1.aBoolean298 ? 1 : 0;
						return;
					}
					if (arg0 == 6105) {
						anIntArray92[anInt1257++] = Static434.aClass165_Sub1_1.aBoolean303 ? 1 : 0;
						return;
					}
					if (arg0 == 6106) {
						anIntArray92[anInt1257++] = Static434.aClass165_Sub1_1.aBoolean294 ? 1 : 0;
						return;
					}
					if (arg0 == 6107) {
						anIntArray92[anInt1257++] = Static434.aClass165_Sub1_1.anInt4215;
						return;
					}
					if (arg0 == 6108) {
						anIntArray92[anInt1257++] = Static434.aClass165_Sub1_1.aBoolean292 ? 1 : 0;
						return;
					}
					if (arg0 == 6109) {
						anIntArray92[anInt1257++] = Static434.aClass165_Sub1_1.aBoolean295 ? 1 : 0;
						return;
					}
					if (arg0 == 6110) {
						anIntArray92[anInt1257++] = Static434.aClass165_Sub1_1.aBoolean293 ? 1 : 0;
						return;
					}
					if (arg0 == 6111) {
						anIntArray92[anInt1257++] = Static434.aClass165_Sub1_1.method3392(Static404.anInt2752);
						return;
					}
					if (arg0 == 6112) {
						anIntArray92[anInt1257++] = Static434.aClass165_Sub1_1.method3390(Static404.anInt2752) ? 1 : 0;
						return;
					}
					if (arg0 == 6114) {
						anIntArray92[anInt1257++] = Static434.aClass165_Sub1_1.aBoolean307 ? 1 : 0;
						return;
					}
					if (arg0 == 6115) {
						anIntArray92[anInt1257++] = Static434.aClass165_Sub1_1.aBoolean305 ? 1 : 0;
						return;
					}
					if (arg0 == 6116) {
						anIntArray92[anInt1257++] = Static434.aClass165_Sub1_1.anInt4201;
						return;
					}
					if (arg0 == 6117) {
						anIntArray92[anInt1257++] = Static434.aClass165_Sub1_1.aBoolean306 ? 1 : 0;
						return;
					}
					if (arg0 == 6118) {
						anIntArray92[anInt1257++] = Static434.aClass165_Sub1_1.anInt4205;
						return;
					}
					if (arg0 == 6119) {
						anIntArray92[anInt1257++] = Static434.aClass165_Sub1_1.anInt4208;
						return;
					}
					if (arg0 == 6120) {
						anIntArray92[anInt1257++] = Static434.aClass165_Sub1_1.anInt4202;
						return;
					}
					if (arg0 == 6121) {
						anIntArray92[anInt1257++] = Static257.aClass75_8.method5978() ? 1 : 0;
						return;
					}
					if (arg0 == 6123) {
						anIntArray92[anInt1257++] = Static109.method1801();
						return;
					}
					if (arg0 == 6124) {
						anIntArray92[anInt1257++] = Static434.aClass165_Sub1_1.anInt4196;
						return;
					}
					if (arg0 == 6125) {
						anIntArray92[anInt1257++] = Static434.aClass165_Sub1_1.anInt4200;
						return;
					}
					if (arg0 == 6126) {
						anIntArray92[anInt1257++] = Static257.aClass75_8.method5999() ? 1 : 0;
						return;
					}
					if (arg0 == 6127) {
						anIntArray92[anInt1257++] = Static434.aClass165_Sub1_1.aBoolean296 ? 1 : 0;
						return;
					}
					if (arg0 == 6128) {
						anIntArray92[anInt1257++] = Static434.aClass165_Sub1_1.aBoolean304 ? 1 : 0;
						return;
					}
					if (arg0 == 6129) {
						anIntArray92[anInt1257++] = Static434.aClass165_Sub1_1.anInt4215;
						return;
					}
					if (arg0 == 6130) {
						anIntArray92[anInt1257++] = Static434.aClass165_Sub1_1.aBoolean301 ? 1 : 0;
						return;
					}
					if (arg0 == 6131) {
						anIntArray92[anInt1257++] = Static404.anInt2752;
						return;
					}
					if (arg0 == 6132) {
						anIntArray92[anInt1257++] = Static434.aClass165_Sub1_1.anInt4193;
						return;
					}
					if (arg0 == 6133) {
						anIntArray92[anInt1257++] = Static307.anInt5537 == 1 || Static307.anInt5537 == 4 ? 1 : 0;
						return;
					}
					if (arg0 == 6134) {
						anIntArray92[anInt1257++] = Static278.method3967(Static170.anInt3068);
						return;
					}
					if (arg0 == 6135) {
						anIntArray92[anInt1257++] = Static434.aClass165_Sub1_1.anInt4214;
						return;
					}
					if (arg0 == 6136) {
						anIntArray92[anInt1257++] = Static434.aClass165_Sub1_1.aBoolean297 ? 1 : 0;
						return;
					}
					if (arg0 == 6137) {
						@Pc(5871) boolean local5871 = true;
						try {
							local5871 = jagmisc.getTotalPhysicalMemory() > 268435456L;
						} catch (@Pc(5881) Throwable local5881) {
						}
						anIntArray92[anInt1257++] = local5871 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6300) {
					if (arg0 == 6200) {
						anInt1257 -= 2;
						Static120.aShort19 = (short) anIntArray92[anInt1257];
						if (Static120.aShort19 <= 0) {
							Static120.aShort19 = 256;
						}
						Static68.aShort6 = (short) anIntArray92[anInt1257 + 1];
						if (Static68.aShort6 <= 0) {
							Static68.aShort6 = 205;
						}
						return;
					}
					if (arg0 == 6201) {
						anInt1257 -= 2;
						Static281.aShort63 = (short) anIntArray92[anInt1257];
						if (Static281.aShort63 <= 0) {
							Static281.aShort63 = 256;
						}
						Static431.aShort105 = (short) anIntArray92[anInt1257 + 1];
						if (Static431.aShort105 <= 0) {
							Static431.aShort105 = 320;
						}
						return;
					}
					if (arg0 == 6202) {
						anInt1257 -= 4;
						Static35.aShort1 = (short) anIntArray92[anInt1257];
						if (Static35.aShort1 <= 0) {
							Static35.aShort1 = 1;
						}
						Static392.aShort86 = (short) anIntArray92[anInt1257 + 1];
						if (Static392.aShort86 <= 0) {
							Static392.aShort86 = 32767;
						} else if (Static392.aShort86 < Static35.aShort1) {
							Static392.aShort86 = Static35.aShort1;
						}
						Static202.aShort42 = (short) anIntArray92[anInt1257 + 2];
						if (Static202.aShort42 <= 0) {
							Static202.aShort42 = 1;
						}
						Static263.aShort70 = (short) anIntArray92[anInt1257 + 3];
						if (Static263.aShort70 <= 0) {
							Static263.aShort70 = 32767;
							return;
						}
						if (Static263.aShort70 < Static202.aShort42) {
							Static263.aShort70 = Static202.aShort42;
						}
						return;
					}
					if (arg0 == 6203) {
						Static268.method3719(Static35.aClass93_3.anInt2495, false, 0, Static35.aClass93_3.anInt2436, 0);
						anIntArray92[anInt1257++] = Static6.anInt109;
						anIntArray92[anInt1257++] = Static189.anInt3336;
						return;
					}
					if (arg0 == 6204) {
						anIntArray92[anInt1257++] = Static281.aShort63;
						anIntArray92[anInt1257++] = Static431.aShort105;
						return;
					}
					if (arg0 == 6205) {
						anIntArray92[anInt1257++] = Static120.aShort19;
						anIntArray92[anInt1257++] = Static68.aShort6;
						return;
					}
				} else if (arg0 < 6400) {
					if (arg0 == 6300) {
						anIntArray92[anInt1257++] = (int) (Static432.method5870() / 60000L);
						return;
					}
					if (arg0 == 6301) {
						anIntArray92[anInt1257++] = (int) (Static432.method5870() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6302) {
						anInt1257 -= 3;
						local157 = anIntArray92[anInt1257];
						local192 = anIntArray92[anInt1257 + 1];
						local89 = anIntArray92[anInt1257 + 2];
						aCalendar1.clear();
						aCalendar1.set(11, 12);
						aCalendar1.set(local89, local192, local157);
						local95 = (int) (aCalendar1.getTime().getTime() / 86400000L) - 11745;
						if (local89 < 1970) {
							local95--;
						}
						anIntArray92[anInt1257++] = local95;
						return;
					}
					if (arg0 == 6303) {
						aCalendar1.clear();
						aCalendar1.setTime(new Date(Static432.method5870()));
						anIntArray92[anInt1257++] = aCalendar1.get(1);
						return;
					}
					if (arg0 == 6304) {
						local157 = anIntArray92[--anInt1257];
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
						anIntArray92[anInt1257++] = local1313 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6500) {
					if (arg0 == 6405) {
						anIntArray92[anInt1257++] = Static376.method5235() ? 1 : 0;
						return;
					}
					if (arg0 == 6406) {
						anIntArray92[anInt1257++] = Static253.method3539() ? 1 : 0;
						return;
					}
				} else if (arg0 < 6600) {
					if (arg0 == 6500) {
						if (Static433.anInt7309 == 6 && Static129.anInt2192 == 0 && Static54.anInt992 == 0) {
							if (Static397.aBoolean462) {
								anIntArray92[anInt1257++] = 0;
								return;
							}
							if (Static368.aLong402 > Static432.method5870() - 1000L) {
								anIntArray92[anInt1257++] = 1;
								return;
							}
							Static397.aBoolean462 = true;
							Static164.method2403(Static358.aClass208_103);
							Static389.aClass2_Sub17_Sub1_2.method6170(Static305.anInt166);
							anIntArray92[anInt1257++] = 0;
							return;
						}
						anIntArray92[anInt1257++] = 1;
						return;
					}
					@Pc(6414) Class184 local6414;
					@Pc(6381) Class65_Sub1 local6381;
					if (arg0 == 6501) {
						local6381 = Static251.method3487();
						if (local6381 != null) {
							anIntArray92[anInt1257++] = local6381.anInt1486;
							anIntArray92[anInt1257++] = local6381.anInt1477;
							aStringArray12[anInt1252++] = local6381.aString11;
							local6414 = local6381.method1364();
							anIntArray92[anInt1257++] = local6414.anInt5127;
							aStringArray12[anInt1252++] = local6414.aString42;
							anIntArray92[anInt1257++] = local6381.anInt1480;
							anIntArray92[anInt1257++] = local6381.anInt1485;
							aStringArray12[anInt1252++] = local6381.aString10;
							return;
						}
						anIntArray92[anInt1257++] = -1;
						anIntArray92[anInt1257++] = 0;
						aStringArray12[anInt1252++] = "";
						anIntArray92[anInt1257++] = 0;
						aStringArray12[anInt1252++] = "";
						anIntArray92[anInt1257++] = 0;
						anIntArray92[anInt1257++] = 0;
						aStringArray12[anInt1252++] = "";
						return;
					}
					if (arg0 == 6502) {
						local6381 = Static172.method2529();
						if (local6381 != null) {
							anIntArray92[anInt1257++] = local6381.anInt1486;
							anIntArray92[anInt1257++] = local6381.anInt1477;
							aStringArray12[anInt1252++] = local6381.aString11;
							local6414 = local6381.method1364();
							anIntArray92[anInt1257++] = local6414.anInt5127;
							aStringArray12[anInt1252++] = local6414.aString42;
							anIntArray92[anInt1257++] = local6381.anInt1480;
							anIntArray92[anInt1257++] = local6381.anInt1485;
							aStringArray12[anInt1252++] = local6381.aString10;
							return;
						}
						anIntArray92[anInt1257++] = -1;
						anIntArray92[anInt1257++] = 0;
						aStringArray12[anInt1252++] = "";
						anIntArray92[anInt1257++] = 0;
						aStringArray12[anInt1252++] = "";
						anIntArray92[anInt1257++] = 0;
						anIntArray92[anInt1257++] = 0;
						aStringArray12[anInt1252++] = "";
						return;
					}
					if (arg0 == 6503) {
						local157 = anIntArray92[--anInt1257];
						local81 = aStringArray12[--anInt1252];
						if (Static433.anInt7309 == 6 && Static129.anInt2192 == 0 && Static54.anInt992 == 0) {
							anIntArray92[anInt1257++] = Static465.method5967(local157, local81) ? 1 : 0;
							return;
						}
						anIntArray92[anInt1257++] = 0;
						return;
					}
					if (arg0 == 6504) {
						Static434.aClass165_Sub1_1.anInt4197 = anIntArray92[--anInt1257];
						Static434.aClass165_Sub1_1.method3400(Static138.aClass194_2);
						return;
					}
					if (arg0 == 6505) {
						anIntArray92[anInt1257++] = Static434.aClass165_Sub1_1.anInt4197;
						return;
					}
					if (arg0 == 6506) {
						local157 = anIntArray92[--anInt1257];
						@Pc(6771) Class65_Sub1 local6771 = Static262.method3690(local157);
						if (local6771 != null) {
							anIntArray92[anInt1257++] = local6771.anInt1477;
							aStringArray12[anInt1252++] = local6771.aString11;
							@Pc(6795) Class184 local6795 = local6771.method1364();
							anIntArray92[anInt1257++] = local6795.anInt5127;
							aStringArray12[anInt1252++] = local6795.aString42;
							anIntArray92[anInt1257++] = local6771.anInt1480;
							anIntArray92[anInt1257++] = local6771.anInt1485;
							aStringArray12[anInt1252++] = local6771.aString10;
							return;
						}
						anIntArray92[anInt1257++] = -1;
						aStringArray12[anInt1252++] = "";
						anIntArray92[anInt1257++] = 0;
						aStringArray12[anInt1252++] = "";
						anIntArray92[anInt1257++] = 0;
						anIntArray92[anInt1257++] = 0;
						aStringArray12[anInt1252++] = "";
						return;
					}
					if (arg0 == 6507) {
						anInt1257 -= 4;
						local157 = anIntArray92[anInt1257];
						local1313 = anIntArray92[anInt1257 + 1] == 1;
						local89 = anIntArray92[anInt1257 + 2];
						local1965 = anIntArray92[anInt1257 + 3] == 1;
						Static16.method4086(local1313, local89, local157, local1965);
						return;
					}
					if (arg0 == 6508) {
						Static92.method1400();
						return;
					}
					if (arg0 == 6509) {
						if (Static433.anInt7309 != 6) {
							return;
						}
						Static373.aBoolean444 = anIntArray92[--anInt1257] == 1;
						return;
					}
				} else if (arg0 < 6700) {
					if (arg0 == 6600) {
						Static434.aClass165_Sub1_1.aBoolean290 = anIntArray92[--anInt1257] == 1;
						Static434.aClass165_Sub1_1.method3400(Static138.aClass194_2);
						return;
					}
					if (arg0 == 6601) {
						anIntArray92[anInt1257++] = Static434.aClass165_Sub1_1.aBoolean290 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6800 && Static141.aClass127_7 == Static369.aClass127_5) {
					if (arg0 == 6700) {
						local157 = Static394.aClass220_45.method5103();
						if (Static103.anInt5365 != -1) {
							local157++;
						}
						anIntArray92[anInt1257++] = local157;
						return;
					}
					if (arg0 == 6701) {
						local157 = anIntArray92[--anInt1257];
						if (Static103.anInt5365 != -1) {
							if (local157 == 0) {
								anIntArray92[anInt1257++] = Static103.anInt5365;
								return;
							}
							local157--;
						}
						@Pc(7070) Class2_Sub9 local7070 = (Class2_Sub9) Static394.aClass220_45.method5096();
						while (local157-- > 0) {
							local7070 = (Class2_Sub9) Static394.aClass220_45.method5098();
						}
						anIntArray92[anInt1257++] = local7070.anInt1143;
						return;
					}
					if (arg0 == 6702) {
						local157 = anIntArray92[--anInt1257];
						if (Static188.aClass93ArrayArray4[local157] == null) {
							aStringArray12[anInt1252++] = "";
							return;
						}
						local81 = Static188.aClass93ArrayArray4[local157][0].aString25;
						if (local81 == null) {
							aStringArray12[anInt1252++] = "";
							return;
						}
						aStringArray12[anInt1252++] = local81.substring(0, local81.indexOf(58));
						return;
					}
					if (arg0 == 6703) {
						local157 = anIntArray92[--anInt1257];
						if (Static188.aClass93ArrayArray4[local157] == null) {
							anIntArray92[anInt1257++] = 0;
							return;
						}
						anIntArray92[anInt1257++] = Static188.aClass93ArrayArray4[local157].length;
						return;
					}
					if (arg0 == 6704) {
						anInt1257 -= 2;
						local157 = anIntArray92[anInt1257];
						local192 = anIntArray92[anInt1257 + 1];
						if (Static188.aClass93ArrayArray4[local157] == null) {
							aStringArray12[anInt1252++] = "";
							return;
						}
						local3351 = Static188.aClass93ArrayArray4[local157][local192].aString25;
						if (local3351 == null) {
							aStringArray12[anInt1252++] = "";
							return;
						}
						aStringArray12[anInt1252++] = local3351;
						return;
					}
					if (arg0 == 6705) {
						anInt1257 -= 2;
						local157 = anIntArray92[anInt1257];
						local192 = anIntArray92[anInt1257 + 1];
						if (Static188.aClass93ArrayArray4[local157] == null) {
							anIntArray92[anInt1257++] = 0;
							return;
						}
						anIntArray92[anInt1257++] = Static188.aClass93ArrayArray4[local157][local192].anInt2500;
						return;
					}
					if (arg0 == 6706) {
						return;
					}
					if (arg0 == 6707) {
						anInt1257 -= 3;
						local157 = anIntArray92[anInt1257];
						local192 = anIntArray92[anInt1257 + 1];
						local89 = anIntArray92[anInt1257 + 2];
						Static254.method3555(local89, 1, local157 << 16 | local192, "");
						return;
					}
					if (arg0 == 6708) {
						anInt1257 -= 3;
						local157 = anIntArray92[anInt1257];
						local192 = anIntArray92[anInt1257 + 1];
						local89 = anIntArray92[anInt1257 + 2];
						Static254.method3555(local89, 2, local157 << 16 | local192, "");
						return;
					}
					if (arg0 == 6709) {
						anInt1257 -= 3;
						local157 = anIntArray92[anInt1257];
						local192 = anIntArray92[anInt1257 + 1];
						local89 = anIntArray92[anInt1257 + 2];
						Static254.method3555(local89, 3, local157 << 16 | local192, "");
						return;
					}
					if (arg0 == 6710) {
						anInt1257 -= 3;
						local157 = anIntArray92[anInt1257];
						local192 = anIntArray92[anInt1257 + 1];
						local89 = anIntArray92[anInt1257 + 2];
						Static254.method3555(local89, 4, local157 << 16 | local192, "");
						return;
					}
					if (arg0 == 6711) {
						anInt1257 -= 3;
						local157 = anIntArray92[anInt1257];
						local192 = anIntArray92[anInt1257 + 1];
						local89 = anIntArray92[anInt1257 + 2];
						Static254.method3555(local89, 5, local157 << 16 | local192, "");
						return;
					}
					if (arg0 == 6712) {
						anInt1257 -= 3;
						local157 = anIntArray92[anInt1257];
						local192 = anIntArray92[anInt1257 + 1];
						local89 = anIntArray92[anInt1257 + 2];
						Static254.method3555(local89, 6, local157 << 16 | local192, "");
						return;
					}
					if (arg0 == 6713) {
						anInt1257 -= 3;
						local157 = anIntArray92[anInt1257];
						local192 = anIntArray92[anInt1257 + 1];
						local89 = anIntArray92[anInt1257 + 2];
						Static254.method3555(local89, 7, local157 << 16 | local192, "");
						return;
					}
					if (arg0 == 6714) {
						anInt1257 -= 3;
						local157 = anIntArray92[anInt1257];
						local192 = anIntArray92[anInt1257 + 1];
						local89 = anIntArray92[anInt1257 + 2];
						Static254.method3555(local89, 8, local157 << 16 | local192, "");
						return;
					}
					if (arg0 == 6715) {
						anInt1257 -= 3;
						local157 = anIntArray92[anInt1257];
						local192 = anIntArray92[anInt1257 + 1];
						local89 = anIntArray92[anInt1257 + 2];
						Static254.method3555(local89, 9, local157 << 16 | local192, "");
						return;
					}
					if (arg0 == 6716) {
						anInt1257 -= 3;
						local157 = anIntArray92[anInt1257];
						local192 = anIntArray92[anInt1257 + 1];
						local89 = anIntArray92[anInt1257 + 2];
						Static254.method3555(local89, 10, local157 << 16 | local192, "");
						return;
					}
					if (arg0 == 6717) {
						anInt1257 -= 3;
						local157 = anIntArray92[anInt1257];
						local192 = anIntArray92[anInt1257 + 1];
						local89 = anIntArray92[anInt1257 + 2];
						@Pc(7658) Class93 local7658 = Static34.method566(local89, local157 << 16 | local192);
						Static465.method5985();
						@Pc(7663) Class2_Sub45 local7663 = Static53.method860(local7658);
						Static181.method2418(local7663.anInt7334, local7663.method5901(), local7658);
						return;
					}
				} else if (arg0 < 6900) {
					@Pc(7691) Class203 local7691;
					if (arg0 == 6800) {
						local157 = anIntArray92[--anInt1257];
						local7691 = Static54.aClass84_2.method1953(local157);
						if (local7691.aString62 == null) {
							aStringArray12[anInt1252++] = "";
							return;
						}
						aStringArray12[anInt1252++] = local7691.aString62;
						return;
					}
					if (arg0 == 6801) {
						local157 = anIntArray92[--anInt1257];
						local7691 = Static54.aClass84_2.method1953(local157);
						anIntArray92[anInt1257++] = local7691.anInt5962;
						return;
					}
					if (arg0 == 6802) {
						local157 = anIntArray92[--anInt1257];
						local7691 = Static54.aClass84_2.method1953(local157);
						anIntArray92[anInt1257++] = local7691.anInt5968;
						return;
					}
					if (arg0 == 6803) {
						local157 = anIntArray92[--anInt1257];
						local7691 = Static54.aClass84_2.method1953(local157);
						anIntArray92[anInt1257++] = local7691.anInt5975;
						return;
					}
					if (arg0 == 6804) {
						anInt1257 -= 2;
						local157 = anIntArray92[anInt1257];
						local192 = anIntArray92[anInt1257 + 1];
						@Pc(7813) Class198 local7813 = Static275.aClass235_1.method5382(local192);
						if (local7813.method4491()) {
							aStringArray12[anInt1252++] = Static54.aClass84_2.method1953(local157).method4734(local192, local7813.aString55);
							return;
						}
						anIntArray92[anInt1257++] = Static54.aClass84_2.method1953(local157).method4738(local192, local7813.anInt5653);
						return;
					}
				} else if (arg0 < 7000) {
					if (arg0 == 6900) {
						anIntArray92[anInt1257++] = Static3.aBoolean3 && !Static203.aBoolean230 ? 1 : 0;
						return;
					}
					if (arg0 == 6901) {
						anIntArray92[anInt1257++] = Static362.anInt6420;
						return;
					}
					if (arg0 == 6902) {
						anIntArray92[anInt1257++] = Static188.anInt6691;
						return;
					}
					if (arg0 == 6903) {
						anIntArray92[anInt1257++] = Static204.anInt3499;
						return;
					}
					if (arg0 == 6904) {
						anIntArray92[anInt1257++] = Static41.anInt661;
						return;
					}
					if (arg0 == 6905) {
						local75 = "";
						if (Static81.aClass136_1 != null) {
							if (Static81.aClass136_1.anObject10 == null) {
								local75 = Static184.method2674(Static81.aClass136_1.anInt3420);
							} else {
								local75 = (String) Static81.aClass136_1.anObject10;
							}
						}
						aStringArray12[anInt1252++] = local75;
						return;
					}
					if (arg0 == 6906) {
						anIntArray92[anInt1257++] = Static163.anInt2920;
						return;
					}
					if (arg0 == 6907) {
						anIntArray92[anInt1257++] = Static184.anInt3243;
						return;
					}
					if (arg0 == 6908) {
						anIntArray92[anInt1257++] = Static130.anInt2195;
						return;
					}
					if (arg0 == 6909) {
						anIntArray92[anInt1257++] = Static65.aBoolean64 ? 1 : 0;
						return;
					}
					if (arg0 == 6910) {
						anIntArray92[anInt1257++] = Static292.anInt5208;
						return;
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "()V")
	public static void method1153() {
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method1155(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static81.anInt1300 == 0 && (Static3.aBoolean3 && !Static203.aBoolean230 || Static46.aBoolean36)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static440.aClass231_127.method5261(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static440.aClass231_127.method5261(0).length());
		} else if (local11.startsWith(Static123.aClass231_43.method5261(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static123.aClass231_43.method5261(0).length());
		} else if (local11.startsWith(Static419.aClass231_117.method5261(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static419.aClass231_117.method5261(0).length());
		} else if (local11.startsWith(Static10.aClass231_1.method5261(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static10.aClass231_1.method5261(0).length());
		} else if (local11.startsWith(Static387.aClass231_112.method5261(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static387.aClass231_112.method5261(0).length());
		} else if (local11.startsWith(Static198.aClass231_66.method5261(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static198.aClass231_66.method5261(0).length());
		} else if (local11.startsWith(Static272.aClass231_85.method5261(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static272.aClass231_85.method5261(0).length());
		} else if (local11.startsWith(Static173.aClass231_61.method5261(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static173.aClass231_61.method5261(0).length());
		} else if (local11.startsWith(Static104.aClass231_36.method5261(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static104.aClass231_36.method5261(0).length());
		} else if (local11.startsWith(Static332.aClass231_101.method5261(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static332.aClass231_101.method5261(0).length());
		} else if (local11.startsWith(Static378.aClass231_124.method5261(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static378.aClass231_124.method5261(0).length());
		} else if (local11.startsWith(Static162.aClass231_59.method5261(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static162.aClass231_59.method5261(0).length());
		} else if (Static80.anInt6195 != 0) {
			if (local11.startsWith(Static440.aClass231_127.method5261(Static80.anInt6195))) {
				local13 = 0;
				arg0 = arg0.substring(Static440.aClass231_127.method5261(Static80.anInt6195).length());
			} else if (local11.startsWith(Static123.aClass231_43.method5261(Static80.anInt6195))) {
				local13 = 1;
				arg0 = arg0.substring(Static123.aClass231_43.method5261(Static80.anInt6195).length());
			} else if (local11.startsWith(Static419.aClass231_117.method5261(Static80.anInt6195))) {
				local13 = 2;
				arg0 = arg0.substring(Static419.aClass231_117.method5261(Static80.anInt6195).length());
			} else if (local11.startsWith(Static10.aClass231_1.method5261(Static80.anInt6195))) {
				local13 = 3;
				arg0 = arg0.substring(Static10.aClass231_1.method5261(Static80.anInt6195).length());
			} else if (local11.startsWith(Static387.aClass231_112.method5261(Static80.anInt6195))) {
				local13 = 4;
				arg0 = arg0.substring(Static387.aClass231_112.method5261(Static80.anInt6195).length());
			} else if (local11.startsWith(Static198.aClass231_66.method5261(Static80.anInt6195))) {
				local13 = 5;
				arg0 = arg0.substring(Static198.aClass231_66.method5261(Static80.anInt6195).length());
			} else if (local11.startsWith(Static272.aClass231_85.method5261(Static80.anInt6195))) {
				local13 = 6;
				arg0 = arg0.substring(Static272.aClass231_85.method5261(Static80.anInt6195).length());
			} else if (local11.startsWith(Static173.aClass231_61.method5261(Static80.anInt6195))) {
				local13 = 7;
				arg0 = arg0.substring(Static173.aClass231_61.method5261(Static80.anInt6195).length());
			} else if (local11.startsWith(Static104.aClass231_36.method5261(Static80.anInt6195))) {
				local13 = 8;
				arg0 = arg0.substring(Static104.aClass231_36.method5261(Static80.anInt6195).length());
			} else if (local11.startsWith(Static332.aClass231_101.method5261(Static80.anInt6195))) {
				local13 = 9;
				arg0 = arg0.substring(Static332.aClass231_101.method5261(Static80.anInt6195).length());
			} else if (local11.startsWith(Static378.aClass231_124.method5261(Static80.anInt6195))) {
				local13 = 10;
				arg0 = arg0.substring(Static378.aClass231_124.method5261(Static80.anInt6195).length());
			} else if (local11.startsWith(Static162.aClass231_59.method5261(Static80.anInt6195))) {
				local13 = 11;
				arg0 = arg0.substring(Static162.aClass231_59.method5261(Static80.anInt6195).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static19.aClass231_8.method5261(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static19.aClass231_8.method5261(0).length());
		} else if (local11.startsWith(Static326.aClass231_100.method5261(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static326.aClass231_100.method5261(0).length());
		} else if (local11.startsWith(Static51.aClass231_18.method5261(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static51.aClass231_18.method5261(0).length());
		} else if (local11.startsWith(Static69.aClass231_24.method5261(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static69.aClass231_24.method5261(0).length());
		} else if (local11.startsWith(Static135.aClass231_29.method5261(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static135.aClass231_29.method5261(0).length());
		} else if (Static80.anInt6195 != 0) {
			if (local11.startsWith(Static19.aClass231_8.method5261(Static80.anInt6195))) {
				local451 = 1;
				arg0 = arg0.substring(Static19.aClass231_8.method5261(Static80.anInt6195).length());
			} else if (local11.startsWith(Static326.aClass231_100.method5261(Static80.anInt6195))) {
				local451 = 2;
				arg0 = arg0.substring(Static326.aClass231_100.method5261(Static80.anInt6195).length());
			} else if (local11.startsWith(Static51.aClass231_18.method5261(Static80.anInt6195))) {
				local451 = 3;
				arg0 = arg0.substring(Static51.aClass231_18.method5261(Static80.anInt6195).length());
			} else if (local11.startsWith(Static69.aClass231_24.method5261(Static80.anInt6195))) {
				local451 = 4;
				arg0 = arg0.substring(Static69.aClass231_24.method5261(Static80.anInt6195).length());
			} else if (local11.startsWith(Static135.aClass231_29.method5261(Static80.anInt6195))) {
				local451 = 5;
				arg0 = arg0.substring(Static135.aClass231_29.method5261(Static80.anInt6195).length());
			}
		}
		Static164.method2403(Static4.aClass208_3);
		Static389.aClass2_Sub17_Sub1_2.method6172(0);
		@Pc(646) int local646 = Static389.aClass2_Sub17_Sub1_2.anInt7523;
		if (arg1 == 5021) {
			Static389.aClass2_Sub17_Sub1_2.method6172(1);
		} else if (arg1 == 5022) {
			Static389.aClass2_Sub17_Sub1_2.method6172(2);
		} else {
			Static389.aClass2_Sub17_Sub1_2.method6172(0);
		}
		Static389.aClass2_Sub17_Sub1_2.method6172(local13);
		Static389.aClass2_Sub17_Sub1_2.method6172(local451);
		Static349.method4922(Static389.aClass2_Sub17_Sub1_2, arg0);
		Static389.aClass2_Sub17_Sub1_2.method6131(Static389.aClass2_Sub17_Sub1_2.anInt7523 - local646);
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(IZ)V")
	public static void method1156() {
	}
}
