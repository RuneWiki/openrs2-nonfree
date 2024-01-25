import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "[I")
	private static int[] anIntArray284;

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray19;

	@OriginalMember(owner = "client!hd", name = "s", descriptor = "Lclient!et;")
	private static Class91 aClass91_6;

	@OriginalMember(owner = "client!hd", name = "u", descriptor = "Lclient!gk;")
	private static Class115 aClass115_1;

	@OriginalMember(owner = "client!hd", name = "v", descriptor = "Lclient!et;")
	private static Class91 aClass91_7;

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "[I")
	private static final int[] anIntArray285 = new int[5];

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "[Lclient!fg;")
	private static final Class101[] aClass101Array1 = new Class101[50];

	@OriginalMember(owner = "client!hd", name = "l", descriptor = "I")
	private static int anInt3445 = 0;

	@OriginalMember(owner = "client!hd", name = "n", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!hd", name = "o", descriptor = "[I")
	private static final int[] anIntArray286 = new int[1000];

	@OriginalMember(owner = "client!hd", name = "t", descriptor = "[[I")
	private static final int[][] anIntArrayArray38 = new int[5][5000];

	@OriginalMember(owner = "client!hd", name = "w", descriptor = "I")
	private static int anInt3450 = 0;

	@OriginalMember(owner = "client!hd", name = "x", descriptor = "I")
	private static int anInt3451 = 0;

	@OriginalMember(owner = "client!hd", name = "y", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray20 = new String[1000];

	@OriginalMember(owner = "client!hd", name = "z", descriptor = "Lclient!sw;")
	public static final Class277 aClass277_29 = new Class277(4);

	@OriginalMember(owner = "client!hd", name = "A", descriptor = "[I")
	private static final int[] anIntArray287 = new int[3];

	@OriginalMember(owner = "client!hd", name = "B", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray21 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!hd", name = "C", descriptor = "I")
	private static int anInt3452 = 0;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
	public static void method3206(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static278.method4887(arg0)) {
			return;
		}
		@Pc(12) Class91[] local12 = Static511.aClass91ArrayArray2[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class91 local19 = local12[local14];
			if (local19.anObjectArray16 != null) {
				@Pc(26) Class1_Sub10 local26 = new Class1_Sub10();
				local26.aClass91_2 = local19;
				local26.anObjectArray4 = local19.anObjectArray16;
				method3208(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!eba;)V")
	public static void method3207(@OriginalArg(0) Class1_Sub10 arg0) {
		method3208(arg0, 200000);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!eba;I)V")
	private static void method3208(@OriginalArg(0) Class1_Sub10 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray4;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class1_Sub2_Sub13 local12 = Static69.method1691(local8);
		if (local12 == null) {
			return;
		}
		anIntArray284 = new int[local12.anInt6708];
		@Pc(21) int local21 = 0;
		aStringArray19 = new String[local12.anInt6707];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt2116;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt2120;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass91_2 == null ? -1 : arg0.aClass91_2.anInt2368;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt2114;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass91_2 == null ? -1 : arg0.aClass91_2.anInt2395;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass91_3 == null ? -1 : arg0.aClass91_3.anInt2368;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass91_3 == null ? -1 : arg0.aClass91_3.anInt2395;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt2122;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt2121;
				}
				anIntArray284[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString44;
				}
				aStringArray19[local27++] = local135;
			}
		}
		anInt3452 = arg0.anInt2112;
		method3217(local12, arg1);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZ)V")
	private static void method3210(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class91 local137;
		@Pc(19) int local19;
		@Pc(56) int local56;
		@Pc(25) int local25;
		@Pc(158) Class91 local158;
		@Pc(35) Class91 local35;
		@Pc(210) Class91 local210;
		@Pc(13) int local13;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt3450 -= 3;
				local13 = anIntArray286[anInt3450];
				local19 = anIntArray286[anInt3450 + 1];
				local25 = anIntArray286[anInt3450 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static384.method6156(local13);
				if (local35.lb == null) {
					local35.lb = new Class91[local25 + 1];
				}
				if (local35.lb.length <= local25) {
					@Pc(54) Class91[] local54 = new Class91[local25 + 1];
					for (local56 = 0; local56 < local35.lb.length; local56++) {
						local54[local56] = local35.lb[local56];
					}
					local35.lb = local54;
				}
				if (local25 > 0 && local35.lb[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class91 local99 = new Class91();
				local99.anInt2452 = local19;
				local99.anInt2375 = local99.anInt2368 = local35.anInt2368;
				local99.anInt2395 = local25;
				local35.lb[local25] = local99;
				if (arg1) {
					aClass91_6 = local99;
				} else {
					aClass91_7 = local99;
				}
				Static243.method4316(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass91_6 : aClass91_7;
				if (local137.anInt2395 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static384.method6156(local137.anInt2368);
				local158.lb[local137.anInt2395] = null;
				Static243.method4316(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static384.method6156(anIntArray286[--anInt3450]);
				local137.lb = null;
				Static243.method4316(local137);
				return;
			}
			if (arg0 == 200) {
				anInt3450 -= 2;
				local13 = anIntArray286[anInt3450];
				local19 = anIntArray286[anInt3450 + 1];
				local210 = Static429.method6657(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray286[anInt3450++] = 1;
					if (arg1) {
						aClass91_6 = local210;
						return;
					}
					aClass91_7 = local210;
					return;
				}
				anIntArray286[anInt3450++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray286[--anInt3450];
				local158 = Static384.method6156(local13);
				if (local158 != null) {
					anIntArray286[anInt3450++] = 1;
					if (arg1) {
						aClass91_6 = local158;
						return;
					}
					aClass91_7 = local158;
					return;
				}
				anIntArray286[anInt3450++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray286[--anInt3450];
				method3214(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray286[--anInt3450];
				method3211(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt3450 -= 2;
					local13 = anIntArray286[anInt3450];
					local19 = anIntArray286[anInt3450 + 1];
					for (local25 = 0; local25 < Static511.anIntArray783.length; local25++) {
						if (Static511.anIntArray783[local25] == local13) {
							Static107.aClass20_Sub1_Sub1_Sub1_1.aClass225_1.method5968(local25, Static10.aClass179_1, local19);
							return;
						}
					}
					for (local353 = 0; local353 < Static356.anIntArray402.length; local353++) {
						if (Static356.anIntArray402[local353] == local13) {
							Static107.aClass20_Sub1_Sub1_Sub1_1.aClass225_1.method5968(local353, Static10.aClass179_1, local19);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt3450 -= 2;
					local13 = anIntArray286[anInt3450];
					local19 = anIntArray286[anInt3450 + 1];
					Static107.aClass20_Sub1_Sub1_Sub1_1.aClass225_1.method5974(local13, local19);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray286[--anInt3450] != 0;
					Static107.aClass20_Sub1_Sub1_Sub1_1.aClass225_1.method5971(local412);
					return;
				}
			} else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static384.method6156(anIntArray286[--anInt3450]);
				} else {
					local137 = arg1 ? aClass91_6 : aClass91_7;
				}
				if (arg0 == 1000) {
					anInt3450 -= 4;
					local137.anInt2386 = anIntArray286[anInt3450];
					local137.anInt2372 = anIntArray286[anInt3450 + 1];
					local19 = anIntArray286[anInt3450 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray286[anInt3450 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte41 = (byte) local19;
					local137.aByte38 = (byte) local25;
					Static243.method4316(local137);
					Static492.method7558(local137);
					if (local137.anInt2395 == -1) {
						Static413.method6507(local137.anInt2368);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt3450 -= 4;
					local137.anInt2400 = anIntArray286[anInt3450];
					local137.anInt2397 = anIntArray286[anInt3450 + 1];
					local137.anInt2416 = 0;
					local137.anInt2454 = 0;
					local19 = anIntArray286[anInt3450 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray286[anInt3450 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte40 = (byte) local19;
					local137.aByte39 = (byte) local25;
					Static243.method4316(local137);
					Static492.method7558(local137);
					if (local137.anInt2452 == 0) {
						Static64.method1611(local137, false);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(620) boolean local620 = anIntArray286[--anInt3450] == 1;
					if (local137.aBoolean201 != local620) {
						local137.aBoolean201 = local620;
						Static243.method4316(local137);
					}
					if (local137.anInt2395 == -1) {
						Static183.method3547(local137.anInt2368);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt3450 -= 2;
					local137.anInt2422 = anIntArray286[anInt3450];
					local137.anInt2392 = anIntArray286[anInt3450 + 1];
					Static243.method4316(local137);
					Static492.method7558(local137);
					if (local137.anInt2452 == 0) {
						Static64.method1611(local137, false);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean197 = anIntArray286[--anInt3450] == 1;
					return;
				}
			} else {
				@Pc(1488) String local1488;
				@Pc(1101) String local1101;
				if (arg0 >= 1100 && arg0 < 1200 || !(arg0 < 2100 || arg0 >= 2200)) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static384.method6156(anIntArray286[--anInt3450]);
					} else {
						local137 = arg1 ? aClass91_6 : aClass91_7;
					}
					if (arg0 == 1100) {
						anInt3450 -= 2;
						local137.anInt2449 = anIntArray286[anInt3450];
						if (local137.anInt2449 > local137.anInt2446 - local137.anInt2399) {
							local137.anInt2449 = local137.anInt2446 - local137.anInt2399;
						}
						if (local137.anInt2449 < 0) {
							local137.anInt2449 = 0;
						}
						local137.anInt2406 = anIntArray286[anInt3450 + 1];
						if (local137.anInt2406 > local137.anInt2444 - local137.anInt2378) {
							local137.anInt2406 = local137.anInt2444 - local137.anInt2378;
						}
						if (local137.anInt2406 < 0) {
							local137.anInt2406 = 0;
						}
						Static243.method4316(local137);
						if (local137.anInt2395 == -1) {
							Static451.method6969(local137.anInt2368);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt2394 = anIntArray286[--anInt3450];
						Static243.method4316(local137);
						if (local137.anInt2395 == -1) {
							Static289.method5095(local137.anInt2368);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean199 = anIntArray286[--anInt3450] == 1;
						Static243.method4316(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt2439 = anIntArray286[--anInt3450];
						Static243.method4316(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt2371 = anIntArray286[--anInt3450];
						Static243.method4316(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray286[--anInt3450];
						if (local137.anInt2382 != local19) {
							local137.anInt2382 = local19;
							Static243.method4316(local137);
						}
						if (local137.anInt2395 == -1) {
							Static323.method5571(local137.anInt2368);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt2437 = anIntArray286[--anInt3450];
						Static243.method4316(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean196 = anIntArray286[--anInt3450] == 1;
						Static243.method4316(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt2405 = 1;
						local137.anInt2401 = anIntArray286[--anInt3450];
						Static243.method4316(local137);
						if (local137.anInt2395 == -1) {
							Static420.method6574(local137.anInt2368);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt3450 -= 6;
						local137.anInt2412 = anIntArray286[anInt3450];
						local137.anInt2380 = anIntArray286[anInt3450 + 1];
						local137.anInt2448 = anIntArray286[anInt3450 + 2];
						local137.anInt2366 = anIntArray286[anInt3450 + 3];
						local137.anInt2430 = anIntArray286[anInt3450 + 4];
						local137.anInt2426 = anIntArray286[anInt3450 + 5];
						Static243.method4316(local137);
						if (local137.anInt2395 == -1) {
							Static204.method3806(local137.anInt2368);
							Static134.method2550(local137.anInt2368);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray286[--anInt3450];
						if (local137.anInt2424 != local19) {
							local137.anInt2424 = local19;
							local137.anInt2369 = 0;
							local137.anInt2381 = 1;
							local137.anInt2393 = 0;
							Static243.method4316(local137);
						}
						if (local137.anInt2395 == -1) {
							Static470.method6220(local137.anInt2368);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean203 = anIntArray286[--anInt3450] == 1;
						Static243.method4316(local137);
						return;
					}
					if (arg0 == 1112) {
						local1101 = aStringArray20[--anInt3445];
						if (!local1101.equals(local137.aString51)) {
							local137.aString51 = local1101;
							Static243.method4316(local137);
						}
						if (local137.anInt2395 == -1) {
							Static404.method6438(local137.anInt2368);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt2443 = anIntArray286[--anInt3450];
						Static243.method4316(local137);
						if (local137.anInt2395 == -1) {
							Static6.method369(local137.anInt2368);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt3450 -= 3;
						local137.anInt2447 = anIntArray286[anInt3450];
						local137.anInt2384 = anIntArray286[anInt3450 + 1];
						local137.anInt2402 = anIntArray286[anInt3450 + 2];
						Static243.method4316(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean198 = anIntArray286[--anInt3450] == 1;
						Static243.method4316(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt2408 = anIntArray286[--anInt3450];
						Static243.method4316(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt2428 = anIntArray286[--anInt3450];
						Static243.method4316(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean208 = anIntArray286[--anInt3450] == 1;
						Static243.method4316(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean194 = anIntArray286[--anInt3450] == 1;
						Static243.method4316(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt3450 -= 2;
						local137.anInt2446 = anIntArray286[anInt3450];
						local137.anInt2444 = anIntArray286[anInt3450 + 1];
						Static243.method4316(local137);
						if (local137.anInt2452 == 0) {
							Static64.method1611(local137, false);
						}
						return;
					}
					if (arg0 == 1121) {
						anInt3450 -= 2;
						local137.anInt2404 = (short) anIntArray286[anInt3450];
						local137.anInt2438 = (short) anIntArray286[anInt3450 + 1];
						Static243.method4316(local137);
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean204 = anIntArray286[--anInt3450] == 1;
						Static243.method4316(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt2426 = anIntArray286[--anInt3450];
						Static243.method4316(local137);
						if (local137.anInt2395 == -1) {
							Static204.method3806(local137.anInt2368);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray286[--anInt3450];
						local137.aBoolean202 = local19 == 1;
						Static243.method4316(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt3450 -= 2;
						local137.anInt2413 = anIntArray286[anInt3450];
						local137.anInt2442 = anIntArray286[anInt3450 + 1];
						Static243.method4316(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt2364 = anIntArray286[--anInt3450];
						Static243.method4316(local137);
						return;
					}
					@Pc(1454) Class53 local1454;
					if (arg0 == 1127) {
						anInt3450 -= 2;
						local19 = anIntArray286[anInt3450];
						local25 = anIntArray286[anInt3450 + 1];
						local1454 = Static440.aClass266_1.method6930(local19);
						if (local25 != local1454.anInt1685) {
							local137.method2275(local25, local19);
							return;
						}
						local137.method2283(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray286[--anInt3450];
						local1488 = aStringArray20[--anInt3445];
						local1454 = Static440.aClass266_1.method6930(local19);
						if (!local1454.aString31.equals(local1488)) {
							local137.method2286(local1488, local19);
							return;
						}
						local137.method2283(local19);
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2290) int local2290;
					if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static384.method6156(anIntArray286[--anInt3450]);
						} else {
							local137 = arg1 ? aClass91_6 : aClass91_7;
						}
						if (arg0 == 1300) {
							local19 = anIntArray286[--anInt3450] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method2282(local19, aStringArray20[--anInt3445]);
								return;
							}
							anInt3445--;
							return;
						}
						if (arg0 == 1301) {
							anInt3450 -= 2;
							local19 = anIntArray286[anInt3450];
							local25 = anIntArray286[anInt3450 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass91_4 = null;
								return;
							}
							local137.aClass91_4 = Static429.method6657(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray286[--anInt3450];
							if (local19 != Static65.anInt1634 && local19 != Static252.anInt4903 && local19 != Static31.anInt8141) {
								return;
							}
							local137.anInt2389 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt2435 = anIntArray286[--anInt3450];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt2440 = anIntArray286[--anInt3450];
							return;
						}
						if (arg0 == 1305) {
							local137.aString54 = aStringArray20[--anInt3445];
							return;
						}
						if (arg0 == 1306) {
							local137.aString52 = aStringArray20[--anInt3445];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray13 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt2417 = anIntArray286[--anInt3450];
							local137.anInt2431 = anIntArray286[--anInt3450];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray286[--anInt3450];
							local25 = anIntArray286[--anInt3450];
							if (local25 >= 1 && local25 <= 10) {
								local137.method2285(local25 - 1, local19);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString53 = aStringArray20[--anInt3445];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt2421 = anIntArray286[--anInt3450];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt3450 -= 3;
								local19 = anIntArray286[anInt3450] - 1;
								local25 = anIntArray286[anInt3450 + 1];
								local353 = anIntArray286[anInt3450 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt3450 -= 2;
								local19 = 10;
								local25 = anIntArray286[anInt3450];
								local353 = anIntArray286[anInt3450 + 1];
							}
							if (local137.aByteArray31 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray31 = new byte[11];
								local137.aByteArray32 = new byte[11];
								local137.anIntArray181 = new int[11];
							}
							local137.aByteArray31[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean209 = false;
								for (local2290 = 0; local2290 < local137.aByteArray31.length; local2290++) {
									if (local137.aByteArray31[local2290] != 0) {
										local137.aBoolean209 = true;
										break;
									}
								}
							} else {
								local137.aBoolean209 = true;
							}
							local137.aByteArray32[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt2420 = anIntArray286[--anInt3450];
							return;
						}
					} else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static384.method6156(anIntArray286[--anInt3450]);
						} else {
							local137 = arg1 ? aClass91_6 : aClass91_7;
						}
						local1101 = aStringArray20[--anInt3445];
						@Pc(2369) int[] local2369 = null;
						if (local1101.length() > 0 && local1101.charAt(local1101.length() - 1) == 'Y') {
							local353 = anIntArray286[--anInt3450];
							if (local353 > 0) {
								local2369 = new int[local353];
								while (local353-- > 0) {
									local2369[local353] = anIntArray286[--anInt3450];
								}
							}
							local1101 = local1101.substring(0, local1101.length() - 1);
						}
						@Pc(2421) Object[] local2421 = new Object[local1101.length() + 1];
						for (local2290 = local2421.length - 1; local2290 >= 1; local2290--) {
							if (local1101.charAt(local2290 - 1) == 's') {
								local2421[local2290] = aStringArray20[--anInt3445];
							} else {
								local2421[local2290] = Integer.valueOf(anIntArray286[--anInt3450]);
							}
						}
						local56 = anIntArray286[--anInt3450];
						if (local56 == -1) {
							local2421 = null;
						} else {
							local2421[0] = Integer.valueOf(local56);
						}
						if (arg0 == 1400) {
							local137.anObjectArray23 = local2421;
						} else if (arg0 == 1401) {
							local137.anObjectArray28 = local2421;
						} else if (arg0 == 1402) {
							local137.anObjectArray35 = local2421;
						} else if (arg0 == 1403) {
							local137.anObjectArray10 = local2421;
						} else if (arg0 == 1404) {
							local137.anObjectArray31 = local2421;
						} else if (arg0 == 1405) {
							local137.anObjectArray32 = local2421;
						} else if (arg0 == 1406) {
							local137.anObjectArray18 = local2421;
						} else if (arg0 == 1407) {
							local137.anObjectArray6 = local2421;
							local137.anIntArray180 = local2369;
						} else if (arg0 == 1408) {
							local137.anObjectArray22 = local2421;
						} else if (arg0 == 1409) {
							local137.anObjectArray30 = local2421;
						} else if (arg0 == 1410) {
							local137.anObjectArray12 = local2421;
						} else if (arg0 == 1411) {
							local137.anObjectArray7 = local2421;
						} else if (arg0 == 1412) {
							local137.anObjectArray27 = local2421;
						} else if (arg0 == 1414) {
							local137.anObjectArray19 = local2421;
							local137.anIntArray190 = local2369;
						} else if (arg0 == 1415) {
							local137.anObjectArray34 = local2421;
							local137.anIntArray183 = local2369;
						} else if (arg0 == 1416) {
							local137.anObjectArray11 = local2421;
						} else if (arg0 == 1417) {
							local137.anObjectArray29 = local2421;
						} else if (arg0 == 1418) {
							local137.anObjectArray17 = local2421;
						} else if (arg0 == 1419) {
							local137.anObjectArray24 = local2421;
						} else if (arg0 == 1420) {
							local137.anObjectArray21 = local2421;
						} else if (arg0 == 1421) {
							local137.anObjectArray33 = local2421;
						} else if (arg0 == 1422) {
							local137.anObjectArray25 = local2421;
						} else if (arg0 == 1423) {
							local137.anObjectArray15 = local2421;
						} else if (arg0 == 1424) {
							local137.anObjectArray26 = local2421;
						} else if (arg0 == 1425) {
							local137.anObjectArray8 = local2421;
						} else if (arg0 == 1426) {
							local137.anObjectArray13 = local2421;
						} else if (arg0 == 1427) {
							local137.anObjectArray9 = local2421;
						} else if (arg0 == 1428) {
							local137.anObjectArray5 = local2421;
							local137.anIntArray188 = local2369;
						} else if (arg0 == 1429) {
							local137.anObjectArray20 = local2421;
							local137.anIntArray187 = local2369;
						} else if (arg0 == 1430) {
							local137.anObjectArray14 = local2421;
						}
						local137.aBoolean200 = true;
						return;
					} else if (arg0 < 1600) {
						local137 = arg1 ? aClass91_6 : aClass91_7;
						if (arg0 == 1500) {
							anIntArray286[anInt3450++] = local137.anInt2423;
							return;
						}
						if (arg0 == 1501) {
							anIntArray286[anInt3450++] = local137.anInt2409;
							return;
						}
						if (arg0 == 1502) {
							anIntArray286[anInt3450++] = local137.anInt2399;
							return;
						}
						if (arg0 == 1503) {
							anIntArray286[anInt3450++] = local137.anInt2378;
							return;
						}
						if (arg0 == 1504) {
							anIntArray286[anInt3450++] = local137.aBoolean201 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray286[anInt3450++] = local137.anInt2375;
							return;
						}
						if (arg0 == 1506) {
							local158 = Static68.method1682(local137);
							anIntArray286[anInt3450++] = local158 == null ? -1 : local158.anInt2368;
							return;
						}
					} else {
						@Pc(3017) Class53 local3017;
						if (arg0 < 1700) {
							local137 = arg1 ? aClass91_6 : aClass91_7;
							if (arg0 == 1600) {
								anIntArray286[anInt3450++] = local137.anInt2449;
								return;
							}
							if (arg0 == 1601) {
								anIntArray286[anInt3450++] = local137.anInt2406;
								return;
							}
							if (arg0 == 1602) {
								aStringArray20[anInt3445++] = local137.aString51;
								return;
							}
							if (arg0 == 1603) {
								anIntArray286[anInt3450++] = local137.anInt2446;
								return;
							}
							if (arg0 == 1604) {
								anIntArray286[anInt3450++] = local137.anInt2444;
								return;
							}
							if (arg0 == 1605) {
								anIntArray286[anInt3450++] = local137.anInt2426;
								return;
							}
							if (arg0 == 1606) {
								anIntArray286[anInt3450++] = local137.anInt2448;
								return;
							}
							if (arg0 == 1607) {
								anIntArray286[anInt3450++] = local137.anInt2430;
								return;
							}
							if (arg0 == 1608) {
								anIntArray286[anInt3450++] = local137.anInt2366;
								return;
							}
							if (arg0 == 1609) {
								anIntArray286[anInt3450++] = local137.anInt2439;
								return;
							}
							if (arg0 == 1610) {
								anIntArray286[anInt3450++] = local137.anInt2412;
								return;
							}
							if (arg0 == 1611) {
								anIntArray286[anInt3450++] = local137.anInt2380;
								return;
							}
							if (arg0 == 1612) {
								anIntArray286[anInt3450++] = local137.anInt2382;
								return;
							}
							if (arg0 == 1613) {
								local19 = anIntArray286[--anInt3450];
								local3017 = Static440.aClass266_1.method6930(local19);
								if (local3017.method1652()) {
									aStringArray20[anInt3445++] = local137.method2284(local19, local3017.aString31);
									return;
								}
								anIntArray286[anInt3450++] = local137.method2281(local19, local3017.anInt1685);
								return;
							}
						} else if (arg0 < 1800) {
							local137 = arg1 ? aClass91_6 : aClass91_7;
							if (arg0 == 1700) {
								anIntArray286[anInt3450++] = local137.anInt2391;
								return;
							}
							if (arg0 == 1701) {
								if (local137.anInt2391 != -1) {
									anIntArray286[anInt3450++] = local137.anInt2434;
									return;
								}
								anIntArray286[anInt3450++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray286[anInt3450++] = local137.anInt2395;
								return;
							}
						} else if (arg0 < 1900) {
							local137 = arg1 ? aClass91_6 : aClass91_7;
							if (arg0 == 1800) {
								anIntArray286[anInt3450++] = Static63.method1580(local137).method1741();
								return;
							}
							if (arg0 == 1801) {
								local19 = anIntArray286[--anInt3450];
								local19--;
								if (local137.aStringArray13 != null && local19 < local137.aStringArray13.length && local137.aStringArray13[local19] != null) {
									aStringArray20[anInt3445++] = local137.aStringArray13[local19];
									return;
								}
								aStringArray20[anInt3445++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local137.aString54 == null) {
									aStringArray20[anInt3445++] = "";
									return;
								}
								aStringArray20[anInt3445++] = local137.aString54;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local137 = Static384.method6156(anIntArray286[--anInt3450]);
								arg0 -= 1000;
							} else {
								local137 = arg1 ? aClass91_6 : aClass91_7;
							}
							if (anInt3452 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local137.anObjectArray9 == null) {
									return;
								}
								@Pc(3254) Class1_Sub10 local3254 = new Class1_Sub10();
								local3254.aClass91_2 = local137;
								local3254.anObjectArray4 = local137.anObjectArray9;
								local3254.anInt2112 = anInt3452 + 1;
								Static282.aClass295_21.method7533(local3254);
								return;
							}
						} else if (arg0 < 2600) {
							local137 = Static384.method6156(anIntArray286[--anInt3450]);
							if (arg0 == 2500) {
								anIntArray286[anInt3450++] = local137.anInt2423;
								return;
							}
							if (arg0 == 2501) {
								anIntArray286[anInt3450++] = local137.anInt2409;
								return;
							}
							if (arg0 == 2502) {
								anIntArray286[anInt3450++] = local137.anInt2399;
								return;
							}
							if (arg0 == 2503) {
								anIntArray286[anInt3450++] = local137.anInt2378;
								return;
							}
							if (arg0 == 2504) {
								anIntArray286[anInt3450++] = local137.aBoolean201 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray286[anInt3450++] = local137.anInt2375;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static68.method1682(local137);
								anIntArray286[anInt3450++] = local158 == null ? -1 : local158.anInt2368;
								return;
							}
						} else if (arg0 < 2700) {
							local137 = Static384.method6156(anIntArray286[--anInt3450]);
							if (arg0 == 2600) {
								anIntArray286[anInt3450++] = local137.anInt2449;
								return;
							}
							if (arg0 == 2601) {
								anIntArray286[anInt3450++] = local137.anInt2406;
								return;
							}
							if (arg0 == 2602) {
								aStringArray20[anInt3445++] = local137.aString51;
								return;
							}
							if (arg0 == 2603) {
								anIntArray286[anInt3450++] = local137.anInt2446;
								return;
							}
							if (arg0 == 2604) {
								anIntArray286[anInt3450++] = local137.anInt2444;
								return;
							}
							if (arg0 == 2605) {
								anIntArray286[anInt3450++] = local137.anInt2426;
								return;
							}
							if (arg0 == 2606) {
								anIntArray286[anInt3450++] = local137.anInt2448;
								return;
							}
							if (arg0 == 2607) {
								anIntArray286[anInt3450++] = local137.anInt2430;
								return;
							}
							if (arg0 == 2608) {
								anIntArray286[anInt3450++] = local137.anInt2366;
								return;
							}
							if (arg0 == 2609) {
								anIntArray286[anInt3450++] = local137.anInt2439;
								return;
							}
							if (arg0 == 2610) {
								anIntArray286[anInt3450++] = local137.anInt2412;
								return;
							}
							if (arg0 == 2611) {
								anIntArray286[anInt3450++] = local137.anInt2380;
								return;
							}
							if (arg0 == 2612) {
								anIntArray286[anInt3450++] = local137.anInt2382;
								return;
							}
						} else {
							@Pc(3751) Class1_Sub35 local3751;
							@Pc(3649) Class1_Sub35 local3649;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local137 = Static384.method6156(anIntArray286[--anInt3450]);
									anIntArray286[anInt3450++] = local137.anInt2391;
									return;
								}
								if (arg0 == 2701) {
									local137 = Static384.method6156(anIntArray286[--anInt3450]);
									if (local137.anInt2391 != -1) {
										anIntArray286[anInt3450++] = local137.anInt2434;
										return;
									}
									anIntArray286[anInt3450++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local13 = anIntArray286[--anInt3450];
									local3649 = (Class1_Sub35) Static362.aClass230_45.method6144((long) local13);
									if (local3649 != null) {
										anIntArray286[anInt3450++] = 1;
										return;
									}
									anIntArray286[anInt3450++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local137 = Static384.method6156(anIntArray286[--anInt3450]);
									if (local137.lb == null) {
										anIntArray286[anInt3450++] = 0;
										return;
									}
									local19 = local137.lb.length;
									for (local25 = 0; local25 < local137.lb.length; local25++) {
										if (local137.lb[local25] == null) {
											local19 = local25;
											break;
										}
									}
									anIntArray286[anInt3450++] = local19;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt3450 -= 2;
									local13 = anIntArray286[anInt3450];
									local19 = anIntArray286[anInt3450 + 1];
									local3751 = (Class1_Sub35) Static362.aClass230_45.method6144((long) local13);
									if (local3751 != null && local3751.anInt5502 == local19) {
										anIntArray286[anInt3450++] = 1;
										return;
									} else {
										anIntArray286[anInt3450++] = 0;
										return;
									}
								}
							} else if (arg0 < 2900) {
								local137 = Static384.method6156(anIntArray286[--anInt3450]);
								if (arg0 == 2800) {
									anIntArray286[anInt3450++] = Static63.method1580(local137).method1741();
									return;
								}
								if (arg0 == 2801) {
									local19 = anIntArray286[--anInt3450];
									local19--;
									if (local137.aStringArray13 != null && local19 < local137.aStringArray13.length && local137.aStringArray13[local19] != null) {
										aStringArray20[anInt3445++] = local137.aStringArray13[local19];
										return;
									}
									aStringArray20[anInt3445++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local137.aString54 == null) {
										aStringArray20[anInt3445++] = "";
										return;
									}
									aStringArray20[anInt3445++] = local137.aString54;
									return;
								}
							} else {
								@Pc(3888) String local3888;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local3888 = aStringArray20[--anInt3445];
										Static484.method7507(local3888);
										return;
									}
									if (arg0 == 3101) {
										anInt3450 -= 2;
										Static399.method6375(Static107.aClass20_Sub1_Sub1_Sub1_1, anIntArray286[anInt3450 + 1], anIntArray286[anInt3450]);
										return;
									}
									if (arg0 == 3103) {
										Static536.method8132();
										return;
									}
									if (arg0 == 3104) {
										local3888 = aStringArray20[--anInt3445];
										local19 = 0;
										if (Static453.method6978(local3888)) {
											local19 = Static302.method8211(local3888);
										}
										Static216.method3997(Static238.aClass252_69);
										Static259.aClass1_Sub17_Sub2_1.method4489(local19);
										return;
									}
									if (arg0 == 3105) {
										local3888 = aStringArray20[--anInt3445];
										Static216.method3997(Static45.aClass252_19);
										Static259.aClass1_Sub17_Sub2_1.method4451(local3888.length() + 1);
										Static259.aClass1_Sub17_Sub2_1.method4464(local3888);
										return;
									}
									if (arg0 == 3106) {
										local3888 = aStringArray20[--anInt3445];
										Static216.method3997(Static201.aClass252_59);
										Static259.aClass1_Sub17_Sub2_1.method4451(local3888.length() + 1);
										Static259.aClass1_Sub17_Sub2_1.method4464(local3888);
										return;
									}
									if (arg0 == 3107) {
										local13 = anIntArray286[--anInt3450];
										local1101 = aStringArray20[--anInt3445];
										Static505.method5589(local1101, local13);
										return;
									}
									if (arg0 == 3108) {
										anInt3450 -= 3;
										local13 = anIntArray286[anInt3450];
										local19 = anIntArray286[anInt3450 + 1];
										local25 = anIntArray286[anInt3450 + 2];
										local35 = Static384.method6156(local25);
										Static131.method2485(local19, local13, local35);
										return;
									}
									if (arg0 == 3109) {
										anInt3450 -= 2;
										local13 = anIntArray286[anInt3450];
										local19 = anIntArray286[anInt3450 + 1];
										local210 = arg1 ? aClass91_6 : aClass91_7;
										Static131.method2485(local19, local13, local210);
										return;
									}
									if (arg0 == 3110) {
										local13 = anIntArray286[--anInt3450];
										Static216.method3997(Static473.aClass252_127);
										Static259.aClass1_Sub17_Sub2_1.method4473(local13);
										return;
									}
									if (arg0 == 3111) {
										anInt3450 -= 2;
										local13 = anIntArray286[anInt3450];
										local19 = anIntArray286[anInt3450 + 1];
										local3751 = (Class1_Sub35) Static362.aClass230_45.method6144((long) local13);
										if (local3751 != null) {
											Static537.method8142(local3751, true, local3751.anInt5502 != local19);
										}
										Static198.method3755(local19, local13, true, 3);
										return;
									}
									if (arg0 == 3112) {
										anInt3450--;
										local13 = anIntArray286[anInt3450];
										local3649 = (Class1_Sub35) Static362.aClass230_45.method6144((long) local13);
										if (local3649 != null && local3649.anInt5499 == 3) {
											Static537.method8142(local3649, true, true);
										}
										return;
									}
									if (arg0 == 3113) {
										Static260.method4696(aStringArray20[--anInt3445]);
										return;
									}
									if (arg0 == 3114) {
										anInt3450 -= 2;
										local13 = anIntArray286[anInt3450];
										local19 = anIntArray286[anInt3450 + 1];
										local1488 = aStringArray20[--anInt3445];
										Static229.method4129(local1488, local13, "", local19, "");
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt3450 -= 3;
										Static394.method6253(anIntArray286[anInt3450], 255, anIntArray286[anInt3450 + 1], anIntArray286[anInt3450 + 2]);
										return;
									}
									if (arg0 == 3201) {
										Static460.method7025(255, 50, anIntArray286[--anInt3450]);
										return;
									}
									if (arg0 == 3202) {
										anInt3450 -= 2;
										Static91.method7967(anIntArray286[anInt3450 + 1], anIntArray286[anInt3450], 255);
										return;
									}
									if (arg0 == 3203) {
										anInt3450 -= 4;
										Static394.method6253(anIntArray286[anInt3450], anIntArray286[anInt3450 + 3], anIntArray286[anInt3450 + 1], anIntArray286[anInt3450 + 2]);
										return;
									}
									if (arg0 == 3204) {
										anInt3450 -= 3;
										Static460.method7025(anIntArray286[anInt3450 + 1], anIntArray286[anInt3450 + 2], anIntArray286[anInt3450]);
										return;
									}
									if (arg0 == 3205) {
										anInt3450 -= 3;
										Static91.method7967(anIntArray286[anInt3450 + 1], anIntArray286[anInt3450], anIntArray286[anInt3450 + 2]);
										return;
									}
									if (arg0 == 3206) {
										anInt3450 -= 4;
										Static363.method5895(anIntArray286[anInt3450 + 2], anIntArray286[anInt3450 + 1], anIntArray286[anInt3450 + 3], anIntArray286[anInt3450]);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray286[anInt3450++] = Static445.anInt7791;
										return;
									}
									if (arg0 == 3301) {
										anInt3450 -= 2;
										local13 = anIntArray286[anInt3450];
										local19 = anIntArray286[anInt3450 + 1];
										anIntArray286[anInt3450++] = Static487.method7511(false, local19, local13);
										return;
									}
									if (arg0 == 3302) {
										anInt3450 -= 2;
										local13 = anIntArray286[anInt3450];
										local19 = anIntArray286[anInt3450 + 1];
										anIntArray286[anInt3450++] = Static389.method6230(local19, local13, false);
										return;
									}
									if (arg0 == 3303) {
										anInt3450 -= 2;
										local13 = anIntArray286[anInt3450];
										local19 = anIntArray286[anInt3450 + 1];
										anIntArray286[anInt3450++] = Static94.method1973(local13, false, local19);
										return;
									}
									if (arg0 == 3304) {
										local13 = anIntArray286[--anInt3450];
										anIntArray286[anInt3450++] = Static409.aClass257_1.method6645(local13).anInt3123;
										return;
									}
									if (arg0 == 3305) {
										local13 = anIntArray286[--anInt3450];
										anIntArray286[anInt3450++] = Static347.anIntArray621[local13];
										return;
									}
									if (arg0 == 3306) {
										local13 = anIntArray286[--anInt3450];
										anIntArray286[anInt3450++] = Static75.anIntArray121[local13];
										return;
									}
									if (arg0 == 3307) {
										local13 = anIntArray286[--anInt3450];
										anIntArray286[anInt3450++] = Static451.anIntArray730[local13];
										return;
									}
									if (arg0 == 3308) {
										@Pc(4605) byte local4605 = Static107.aClass20_Sub1_Sub1_Sub1_1.aByte108;
										local19 = (Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8954 >> 7) + Static538.anInt9485;
										local25 = (Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8949 >> 7) + Static282.anInt5380;
										anIntArray286[anInt3450++] = (local4605 << 28) + (local19 << 14) + local25;
										return;
									}
									if (arg0 == 3309) {
										local13 = anIntArray286[--anInt3450];
										anIntArray286[anInt3450++] = local13 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local13 = anIntArray286[--anInt3450];
										anIntArray286[anInt3450++] = local13 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local13 = anIntArray286[--anInt3450];
										anIntArray286[anInt3450++] = local13 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray286[anInt3450++] = Static343.aBoolean696 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt3450 -= 2;
										local13 = anIntArray286[anInt3450];
										local19 = anIntArray286[anInt3450 + 1];
										anIntArray286[anInt3450++] = Static487.method7511(true, local19, local13);
										return;
									}
									if (arg0 == 3314) {
										anInt3450 -= 2;
										local13 = anIntArray286[anInt3450];
										local19 = anIntArray286[anInt3450 + 1];
										anIntArray286[anInt3450++] = Static389.method6230(local19, local13, true);
										return;
									}
									if (arg0 == 3315) {
										anInt3450 -= 2;
										local13 = anIntArray286[anInt3450];
										local19 = anIntArray286[anInt3450 + 1];
										anIntArray286[anInt3450++] = Static94.method1973(local13, true, local19);
										return;
									}
									if (arg0 == 3316) {
										if (Static378.anInt6739 >= 2) {
											anIntArray286[anInt3450++] = Static378.anInt6739;
											return;
										}
										anIntArray286[anInt3450++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray286[anInt3450++] = Static396.anInt6970;
										return;
									}
									if (arg0 == 3318) {
										anIntArray286[anInt3450++] = Class216.lb.anInt6291;
										return;
									}
									if (arg0 == 3321) {
										anIntArray286[anInt3450++] = Static308.anInt5928;
										return;
									}
									if (arg0 == 3322) {
										anIntArray286[anInt3450++] = Static36.anInt1095;
										return;
									}
									if (arg0 == 3323) {
										if (Static516.anInt9148 >= 5 && Static516.anInt9148 <= 9) {
											anIntArray286[anInt3450++] = 1;
											return;
										}
										anIntArray286[anInt3450++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static516.anInt9148 >= 5 && Static516.anInt9148 <= 9) {
											anIntArray286[anInt3450++] = Static516.anInt9148;
											return;
										}
										anIntArray286[anInt3450++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray286[anInt3450++] = Static132.aBoolean231 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray286[anInt3450++] = Static107.aClass20_Sub1_Sub1_Sub1_1.anInt668;
										return;
									}
									if (arg0 == 3327) {
										anIntArray286[anInt3450++] = Static107.aClass20_Sub1_Sub1_Sub1_1.aClass225_1.aBoolean493 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray286[anInt3450++] = Static394.aBoolean512 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local13 = anIntArray286[--anInt3450];
										anIntArray286[anInt3450++] = Static439.method6819(local13);
										return;
									}
									if (arg0 == 3331) {
										anInt3450 -= 2;
										local13 = anIntArray286[anInt3450];
										local19 = anIntArray286[anInt3450 + 1];
										anIntArray286[anInt3450++] = Static434.method6716(local13, false, local19);
										return;
									}
									if (arg0 == 3332) {
										anInt3450 -= 2;
										local13 = anIntArray286[anInt3450];
										local19 = anIntArray286[anInt3450 + 1];
										anIntArray286[anInt3450++] = Static434.method6716(local13, true, local19);
										return;
									}
									if (arg0 == 3333) {
										anIntArray286[anInt3450++] = Static361.anInt6516;
										return;
									}
									if (arg0 == 3335) {
										anIntArray286[anInt3450++] = Static544.anInt7853;
										return;
									}
									if (arg0 == 3336) {
										anInt3450 -= 4;
										local13 = anIntArray286[anInt3450];
										local19 = anIntArray286[anInt3450 + 1];
										local25 = anIntArray286[anInt3450 + 2];
										local353 = anIntArray286[anInt3450 + 3];
										local13 += local19 << 14;
										local13 += local25 << 28;
										local13 += local353;
										anIntArray286[anInt3450++] = local13;
										return;
									}
									if (arg0 == 3337) {
										anIntArray286[anInt3450++] = Static27.anInt767;
										return;
									}
									if (arg0 == 3338) {
										anIntArray286[anInt3450++] = Static353.method5815();
										return;
									}
									if (arg0 == 3339) {
										anIntArray286[anInt3450++] = Static360.aBoolean481 ? 1 : 0;
										return;
									}
									if (arg0 == 3340) {
										anIntArray286[anInt3450++] = Static87.aBoolean160 ? 1 : 0;
										return;
									}
									if (arg0 == 3341) {
										anIntArray286[anInt3450++] = Static327.aBoolean463 ? 1 : 0;
										return;
									}
									if (arg0 == 3342) {
										anIntArray286[anInt3450++] = Static10.aClass99_1.method6618();
										return;
									}
									if (arg0 == 3343) {
										anIntArray286[anInt3450++] = Static10.aClass99_1.method6619();
										return;
									}
									if (arg0 == 3344) {
										aStringArray20[anInt3445++] = Static544.method6943();
										return;
									}
									if (arg0 == 3345) {
										aStringArray20[anInt3445++] = Static72.method1701();
										return;
									}
									if (arg0 == 3346) {
										anIntArray286[anInt3450++] = Static401.method6523();
										return;
									}
									if (arg0 == 3347) {
										anIntArray286[anInt3450++] = Static450.anInt7887;
										return;
									}
								} else if (arg0 < 3500) {
									@Pc(5340) Class153 local5340;
									if (arg0 == 3400) {
										anInt3450 -= 2;
										local13 = anIntArray286[anInt3450];
										local19 = anIntArray286[anInt3450 + 1];
										local5340 = Static286.aClass249_1.method6540(local13);
										aStringArray20[anInt3445++] = local5340.method4162(local19);
										return;
									}
									if (arg0 == 3408) {
										anInt3450 -= 4;
										local13 = anIntArray286[anInt3450];
										local19 = anIntArray286[anInt3450 + 1];
										local25 = anIntArray286[anInt3450 + 2];
										local353 = anIntArray286[anInt3450 + 3];
										@Pc(5386) Class153 local5386 = Static286.aClass249_1.method6540(local25);
										if (local5386.aChar3 == local13 && local5386.aChar4 == local19) {
											if (local19 == 115) {
												aStringArray20[anInt3445++] = local5386.method4162(local353);
												return;
											}
											anIntArray286[anInt3450++] = local5386.method4168(local353);
											return;
										}
										throw new RuntimeException("C3408-1");
									}
									if (arg0 == 3409) {
										anInt3450 -= 3;
										local13 = anIntArray286[anInt3450];
										local19 = anIntArray286[anInt3450 + 1];
										local25 = anIntArray286[anInt3450 + 2];
										if (local19 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(5462) Class153 local5462 = Static286.aClass249_1.method6540(local19);
										if (local5462.aChar4 != local13) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray286[anInt3450++] = local5462.method4163(local25) ? 1 : 0;
										return;
									}
									if (arg0 == 3410) {
										local13 = anIntArray286[--anInt3450];
										local1101 = aStringArray20[--anInt3445];
										if (local13 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local5340 = Static286.aClass249_1.method6540(local13);
										if (local5340.aChar4 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray286[anInt3450++] = local5340.method4166(local1101) ? 1 : 0;
										return;
									}
									if (arg0 == 3411) {
										local13 = anIntArray286[--anInt3450];
										@Pc(5560) Class153 local5560 = Static286.aClass249_1.method6540(local13);
										anIntArray286[anInt3450++] = local5560.aClass230_27.method6138();
										return;
									}
								} else if (arg0 < 3700) {
									if (arg0 == 3600) {
										if (Static181.anInt3813 == 0) {
											anIntArray286[anInt3450++] = -2;
											return;
										}
										if (Static181.anInt3813 == 1) {
											anIntArray286[anInt3450++] = -1;
											return;
										}
										anIntArray286[anInt3450++] = Static330.anInt6194;
										return;
									}
									if (arg0 == 3601) {
										local13 = anIntArray286[--anInt3450];
										if (Static181.anInt3813 == 2 && local13 < Static330.anInt6194) {
											aStringArray20[anInt3445++] = Static163.aStringArray18[local13];
											if (Static223.aStringArray23[local13] != null) {
												aStringArray20[anInt3445++] = Static223.aStringArray23[local13];
												return;
											}
											aStringArray20[anInt3445++] = "";
											return;
										}
										aStringArray20[anInt3445++] = "";
										aStringArray20[anInt3445++] = "";
										return;
									}
									if (arg0 == 3602) {
										local13 = anIntArray286[--anInt3450];
										if (Static181.anInt3813 == 2 && local13 < Static330.anInt6194) {
											anIntArray286[anInt3450++] = Static462.anIntArray734[local13];
											return;
										}
										anIntArray286[anInt3450++] = 0;
										return;
									}
									if (arg0 == 3603) {
										local13 = anIntArray286[--anInt3450];
										if (Static181.anInt3813 == 2 && local13 < Static330.anInt6194) {
											anIntArray286[anInt3450++] = Static296.anIntArray695[local13];
											return;
										}
										anIntArray286[anInt3450++] = 0;
										return;
									}
									if (arg0 == 3604) {
										local3888 = aStringArray20[--anInt3445];
										local19 = anIntArray286[--anInt3450];
										Static77.method1770(local3888, local19);
										return;
									}
									if (arg0 == 3605) {
										local3888 = aStringArray20[--anInt3445];
										Static29.method806(local3888);
										return;
									}
									if (arg0 == 3606) {
										local3888 = aStringArray20[--anInt3445];
										Static160.method7803(local3888);
										return;
									}
									if (arg0 == 3607) {
										local3888 = aStringArray20[--anInt3445];
										Static480.method7472(false, local3888);
										return;
									}
									if (arg0 == 3608) {
										local3888 = aStringArray20[--anInt3445];
										Static438.method6793(local3888);
										return;
									}
									if (arg0 == 3609) {
										local3888 = aStringArray20[--anInt3445];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray286[anInt3450++] = Static164.method2935(local3888) ? 1 : 0;
										return;
									}
									if (arg0 == 3610) {
										local13 = anIntArray286[--anInt3450];
										if (Static181.anInt3813 == 2 && local13 < Static330.anInt6194) {
											aStringArray20[anInt3445++] = Static467.aStringArray33[local13];
											return;
										}
										aStringArray20[anInt3445++] = "";
										return;
									}
									if (arg0 == 3611) {
										if (Static81.aString35 != null) {
											aStringArray20[anInt3445++] = Static520.method7933(Static81.aString35);
											return;
										}
										aStringArray20[anInt3445++] = "";
										return;
									}
									if (arg0 == 3612) {
										if (Static81.aString35 != null) {
											anIntArray286[anInt3450++] = Static246.anInt4721;
											return;
										}
										anIntArray286[anInt3450++] = 0;
										return;
									}
									if (arg0 == 3613) {
										local13 = anIntArray286[--anInt3450];
										if (Static81.aString35 != null && local13 < Static246.anInt4721) {
											aStringArray20[anInt3445++] = Static161.aClass181Array1[local13].aString128;
											return;
										}
										aStringArray20[anInt3445++] = "";
										return;
									}
									if (arg0 == 3614) {
										local13 = anIntArray286[--anInt3450];
										if (Static81.aString35 != null && local13 < Static246.anInt4721) {
											anIntArray286[anInt3450++] = Static161.aClass181Array1[local13].anInt5549;
											return;
										}
										anIntArray286[anInt3450++] = 0;
										return;
									}
									if (arg0 == 3615) {
										local13 = anIntArray286[--anInt3450];
										if (Static81.aString35 != null && local13 < Static246.anInt4721) {
											anIntArray286[anInt3450++] = Static161.aClass181Array1[local13].aByte69;
											return;
										}
										anIntArray286[anInt3450++] = 0;
										return;
									}
									if (arg0 == 3616) {
										anIntArray286[anInt3450++] = Static294.aByte71;
										return;
									}
									if (arg0 == 3617) {
										local3888 = aStringArray20[--anInt3445];
										Static141.method2639(local3888);
										return;
									}
									if (arg0 == 3618) {
										anIntArray286[anInt3450++] = Static104.aByte113;
										return;
									}
									if (arg0 == 3619) {
										local3888 = aStringArray20[--anInt3445];
										Static234.method4191(local3888);
										return;
									}
									if (arg0 == 3620) {
										Static139.method2616();
										return;
									}
									if (arg0 == 3621) {
										if (Static181.anInt3813 == 0) {
											anIntArray286[anInt3450++] = -1;
											return;
										}
										anIntArray286[anInt3450++] = Static508.anInt8897;
										return;
									}
									if (arg0 == 3622) {
										local13 = anIntArray286[--anInt3450];
										if (Static181.anInt3813 != 0 && local13 < Static508.anInt8897) {
											aStringArray20[anInt3445++] = Static537.aStringArray44[local13];
											if (Static515.aStringArray38[local13] != null) {
												aStringArray20[anInt3445++] = Static515.aStringArray38[local13];
												return;
											}
											aStringArray20[anInt3445++] = "";
											return;
										}
										aStringArray20[anInt3445++] = "";
										aStringArray20[anInt3445++] = "";
										return;
									}
									if (arg0 == 3623) {
										local3888 = aStringArray20[--anInt3445];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray286[anInt3450++] = Static505.method5588(local3888) ? 1 : 0;
										return;
									}
									if (arg0 == 3624) {
										local13 = anIntArray286[--anInt3450];
										if (Static161.aClass181Array1 != null && local13 < Static246.anInt4721 && Static161.aClass181Array1[local13].aString131.equalsIgnoreCase(Static107.aClass20_Sub1_Sub1_Sub1_1.aString13)) {
											anIntArray286[anInt3450++] = 1;
											return;
										}
										anIntArray286[anInt3450++] = 0;
										return;
									}
									if (arg0 == 3625) {
										if (Static172.aString73 != null) {
											aStringArray20[anInt3445++] = Static172.aString73;
											return;
										}
										aStringArray20[anInt3445++] = "";
										return;
									}
									if (arg0 == 3626) {
										local13 = anIntArray286[--anInt3450];
										if (Static81.aString35 != null && local13 < Static246.anInt4721) {
											aStringArray20[anInt3445++] = Static161.aClass181Array1[local13].aString127;
											return;
										}
										aStringArray20[anInt3445++] = "";
										return;
									}
									if (arg0 == 3627) {
										local13 = anIntArray286[--anInt3450];
										if (Static181.anInt3813 == 2 && local13 >= 0 && local13 < Static330.anInt6194) {
											anIntArray286[anInt3450++] = Static232.aBooleanArray14[local13] ? 1 : 0;
											return;
										}
										anIntArray286[anInt3450++] = 0;
										return;
									}
									if (arg0 == 3628) {
										local3888 = aStringArray20[--anInt3445];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray286[anInt3450++] = Static336.method5673(local3888);
										return;
									}
									if (arg0 == 3629) {
										anIntArray286[anInt3450++] = Static402.anInt7080;
										return;
									}
									if (arg0 == 3630) {
										local3888 = aStringArray20[--anInt3445];
										Static480.method7472(true, local3888);
										return;
									}
									if (arg0 == 3631) {
										local13 = anIntArray286[--anInt3450];
										anIntArray286[anInt3450++] = Static214.aBooleanArray13[local13] ? 1 : 0;
										return;
									}
									if (arg0 == 3632) {
										local13 = anIntArray286[--anInt3450];
										if (Static81.aString35 != null && local13 < Static246.anInt4721) {
											aStringArray20[anInt3445++] = Static161.aClass181Array1[local13].aString131;
											return;
										}
										aStringArray20[anInt3445++] = "";
										return;
									}
									if (arg0 == 3633) {
										local13 = anIntArray286[--anInt3450];
										if (Static181.anInt3813 != 0 && local13 < Static508.anInt8897) {
											aStringArray20[anInt3445++] = Static322.aStringArray29[local13];
											return;
										}
										aStringArray20[anInt3445++] = "";
										return;
									}
								} else if (arg0 < 4000) {
									if (arg0 == 3903) {
										local13 = anIntArray286[--anInt3450];
										anIntArray286[anInt3450++] = Static538.aClass42Array1[local13].method1408();
										return;
									}
									if (arg0 == 3904) {
										local13 = anIntArray286[--anInt3450];
										anIntArray286[anInt3450++] = Static538.aClass42Array1[local13].anInt1332;
										return;
									}
									if (arg0 == 3905) {
										local13 = anIntArray286[--anInt3450];
										anIntArray286[anInt3450++] = Static538.aClass42Array1[local13].anInt1334;
										return;
									}
									if (arg0 == 3906) {
										local13 = anIntArray286[--anInt3450];
										anIntArray286[anInt3450++] = Static538.aClass42Array1[local13].anInt1336;
										return;
									}
									if (arg0 == 3907) {
										local13 = anIntArray286[--anInt3450];
										anIntArray286[anInt3450++] = Static538.aClass42Array1[local13].anInt1329;
										return;
									}
									if (arg0 == 3908) {
										local13 = anIntArray286[--anInt3450];
										anIntArray286[anInt3450++] = Static538.aClass42Array1[local13].anInt1335;
										return;
									}
									if (arg0 == 3910) {
										local13 = anIntArray286[--anInt3450];
										local19 = Static538.aClass42Array1[local13].method1409();
										anIntArray286[anInt3450++] = local19 == 0 ? 1 : 0;
										return;
									}
									if (arg0 == 3911) {
										local13 = anIntArray286[--anInt3450];
										local19 = Static538.aClass42Array1[local13].method1409();
										anIntArray286[anInt3450++] = local19 == 2 ? 1 : 0;
										return;
									}
									if (arg0 == 3912) {
										local13 = anIntArray286[--anInt3450];
										local19 = Static538.aClass42Array1[local13].method1409();
										anIntArray286[anInt3450++] = local19 == 5 ? 1 : 0;
										return;
									}
									if (arg0 == 3913) {
										local13 = anIntArray286[--anInt3450];
										local19 = Static538.aClass42Array1[local13].method1409();
										anIntArray286[anInt3450++] = local19 == 1 ? 1 : 0;
										return;
									}
								} else if (arg0 < 4100) {
									if (arg0 == 4000) {
										anInt3450 -= 2;
										local13 = anIntArray286[anInt3450];
										local19 = anIntArray286[anInt3450 + 1];
										anIntArray286[anInt3450++] = local13 + local19;
										return;
									}
									if (arg0 == 4001) {
										anInt3450 -= 2;
										local13 = anIntArray286[anInt3450];
										local19 = anIntArray286[anInt3450 + 1];
										anIntArray286[anInt3450++] = local13 - local19;
										return;
									}
									if (arg0 == 4002) {
										anInt3450 -= 2;
										local13 = anIntArray286[anInt3450];
										local19 = anIntArray286[anInt3450 + 1];
										anIntArray286[anInt3450++] = local13 * local19;
										return;
									}
									if (arg0 == 4003) {
										anInt3450 -= 2;
										local13 = anIntArray286[anInt3450];
										local19 = anIntArray286[anInt3450 + 1];
										anIntArray286[anInt3450++] = local13 / local19;
										return;
									}
									if (arg0 == 4004) {
										local13 = anIntArray286[--anInt3450];
										anIntArray286[anInt3450++] = (int) (Math.random() * (double) local13);
										return;
									}
									if (arg0 == 4005) {
										local13 = anIntArray286[--anInt3450];
										anIntArray286[anInt3450++] = (int) (Math.random() * (double) (local13 + 1));
										return;
									}
									if (arg0 == 4006) {
										anInt3450 -= 5;
										local13 = anIntArray286[anInt3450];
										local19 = anIntArray286[anInt3450 + 1];
										local25 = anIntArray286[anInt3450 + 2];
										local353 = anIntArray286[anInt3450 + 3];
										local2290 = anIntArray286[anInt3450 + 4];
										anIntArray286[anInt3450++] = local13 + (local19 - local13) * (local2290 - local25) / (local353 - local25);
										return;
									}
									@Pc(7070) long local7070;
									@Pc(7063) long local7063;
									if (arg0 == 4007) {
										anInt3450 -= 2;
										local7063 = anIntArray286[anInt3450];
										local7070 = anIntArray286[anInt3450 + 1];
										anIntArray286[anInt3450++] = (int) (local7063 + local7063 * local7070 / 100L);
										return;
									}
									if (arg0 == 4008) {
										anInt3450 -= 2;
										local13 = anIntArray286[anInt3450];
										local19 = anIntArray286[anInt3450 + 1];
										anIntArray286[anInt3450++] = local13 | 0x1 << local19;
										return;
									}
									if (arg0 == 4009) {
										anInt3450 -= 2;
										local13 = anIntArray286[anInt3450];
										local19 = anIntArray286[anInt3450 + 1];
										anIntArray286[anInt3450++] = local13 & -(0x1 << local19) - 1;
										return;
									}
									if (arg0 == 4010) {
										anInt3450 -= 2;
										local13 = anIntArray286[anInt3450];
										local19 = anIntArray286[anInt3450 + 1];
										anIntArray286[anInt3450++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
										return;
									}
									if (arg0 == 4011) {
										anInt3450 -= 2;
										local13 = anIntArray286[anInt3450];
										local19 = anIntArray286[anInt3450 + 1];
										anIntArray286[anInt3450++] = local13 % local19;
										return;
									}
									if (arg0 == 4012) {
										anInt3450 -= 2;
										local13 = anIntArray286[anInt3450];
										local19 = anIntArray286[anInt3450 + 1];
										if (local13 == 0) {
											anIntArray286[anInt3450++] = 0;
											return;
										}
										anIntArray286[anInt3450++] = (int) Math.pow((double) local13, (double) local19);
										return;
									}
									if (arg0 == 4013) {
										anInt3450 -= 2;
										local13 = anIntArray286[anInt3450];
										local19 = anIntArray286[anInt3450 + 1];
										if (local13 == 0) {
											anIntArray286[anInt3450++] = 0;
											return;
										}
										if (local19 == 0) {
											anIntArray286[anInt3450++] = Integer.MAX_VALUE;
											return;
										}
										anIntArray286[anInt3450++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
										return;
									}
									if (arg0 == 4014) {
										anInt3450 -= 2;
										local13 = anIntArray286[anInt3450];
										local19 = anIntArray286[anInt3450 + 1];
										anIntArray286[anInt3450++] = local13 & local19;
										return;
									}
									if (arg0 == 4015) {
										anInt3450 -= 2;
										local13 = anIntArray286[anInt3450];
										local19 = anIntArray286[anInt3450 + 1];
										anIntArray286[anInt3450++] = local13 | local19;
										return;
									}
									if (arg0 == 4016) {
										anInt3450 -= 2;
										local13 = anIntArray286[anInt3450];
										local19 = anIntArray286[anInt3450 + 1];
										anIntArray286[anInt3450++] = local13 < local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4017) {
										anInt3450 -= 2;
										local13 = anIntArray286[anInt3450];
										local19 = anIntArray286[anInt3450 + 1];
										anIntArray286[anInt3450++] = local13 > local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4018) {
										anInt3450 -= 3;
										local7063 = anIntArray286[anInt3450];
										local7070 = anIntArray286[anInt3450 + 1];
										@Pc(7451) long local7451 = (long) anIntArray286[anInt3450 + 2];
										anIntArray286[anInt3450++] = (int) (local7063 * local7451 / local7070);
										return;
									}
								} else if (arg0 < 4200) {
									if (arg0 == 4100) {
										local3888 = aStringArray20[--anInt3445];
										local19 = anIntArray286[--anInt3450];
										aStringArray20[anInt3445++] = local3888 + local19;
										return;
									}
									if (arg0 == 4101) {
										anInt3445 -= 2;
										local3888 = aStringArray20[anInt3445];
										local1101 = aStringArray20[anInt3445 + 1];
										aStringArray20[anInt3445++] = local3888 + local1101;
										return;
									}
									if (arg0 == 4102) {
										local3888 = aStringArray20[--anInt3445];
										local19 = anIntArray286[--anInt3450];
										aStringArray20[anInt3445++] = local3888 + Static154.method2825(local19);
										return;
									}
									if (arg0 == 4103) {
										local3888 = aStringArray20[--anInt3445];
										aStringArray20[anInt3445++] = local3888.toLowerCase();
										return;
									}
									if (arg0 == 4104) {
										aStringArray20[anInt3445++] = method3215(anIntArray286[--anInt3450]);
										return;
									}
									if (arg0 == 4105) {
										anInt3445 -= 2;
										local3888 = aStringArray20[anInt3445];
										local1101 = aStringArray20[anInt3445 + 1];
										if (Static107.aClass20_Sub1_Sub1_Sub1_1.aClass225_1 != null && Static107.aClass20_Sub1_Sub1_Sub1_1.aClass225_1.aBoolean493) {
											aStringArray20[anInt3445++] = local1101;
											return;
										}
										aStringArray20[anInt3445++] = local3888;
										return;
									}
									if (arg0 == 4106) {
										local13 = anIntArray286[--anInt3450];
										aStringArray20[anInt3445++] = Integer.toString(local13);
										return;
									}
									if (arg0 == 4107) {
										anInt3445 -= 2;
										anIntArray286[anInt3450++] = Static291.method5106(aStringArray20[anInt3445], aStringArray20[anInt3445 + 1], Static544.anInt7853);
										return;
									}
									@Pc(7734) Class96 local7734;
									if (arg0 == 4108) {
										local3888 = aStringArray20[--anInt3445];
										anInt3450 -= 2;
										local19 = anIntArray286[anInt3450];
										local25 = anIntArray286[anInt3450 + 1];
										local7734 = Static363.method5898(local25, Static61.aClass69_18);
										anIntArray286[anInt3450++] = local7734.method2374(local3888, Static62.aClass104Array15, local19);
										return;
									}
									if (arg0 == 4109) {
										local3888 = aStringArray20[--anInt3445];
										anInt3450 -= 2;
										local19 = anIntArray286[anInt3450];
										local25 = anIntArray286[anInt3450 + 1];
										local7734 = Static363.method5898(local25, Static61.aClass69_18);
										anIntArray286[anInt3450++] = local7734.method2367(local19, Static62.aClass104Array15, local3888);
										return;
									}
									if (arg0 == 4110) {
										anInt3445 -= 2;
										local3888 = aStringArray20[anInt3445];
										local1101 = aStringArray20[anInt3445 + 1];
										if (anIntArray286[--anInt3450] == 1) {
											aStringArray20[anInt3445++] = local3888;
											return;
										}
										aStringArray20[anInt3445++] = local1101;
										return;
									}
									if (arg0 == 4111) {
										local3888 = aStringArray20[--anInt3445];
										aStringArray20[anInt3445++] = Static22.method606(local3888);
										return;
									}
									if (arg0 == 4112) {
										local3888 = aStringArray20[--anInt3445];
										local19 = anIntArray286[--anInt3450];
										if (local19 == -1) {
											throw new RuntimeException("null char");
										}
										aStringArray20[anInt3445++] = local3888 + (char) local19;
										return;
									}
									if (arg0 == 4113) {
										local13 = anIntArray286[--anInt3450];
										anIntArray286[anInt3450++] = Static378.method6050((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4114) {
										local13 = anIntArray286[--anInt3450];
										anIntArray286[anInt3450++] = Static141.method2642((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4115) {
										local13 = anIntArray286[--anInt3450];
										anIntArray286[anInt3450++] = Static81.method1807((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4116) {
										local13 = anIntArray286[--anInt3450];
										anIntArray286[anInt3450++] = Static181.method3531((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4117) {
										local3888 = aStringArray20[--anInt3445];
										if (local3888 != null) {
											anIntArray286[anInt3450++] = local3888.length();
											return;
										}
										anIntArray286[anInt3450++] = 0;
										return;
									}
									if (arg0 == 4118) {
										local3888 = aStringArray20[--anInt3445];
										anInt3450 -= 2;
										local19 = anIntArray286[anInt3450];
										local25 = anIntArray286[anInt3450 + 1];
										aStringArray20[anInt3445++] = local3888.substring(local19, local25);
										return;
									}
									if (arg0 == 4119) {
										local3888 = aStringArray20[--anInt3445];
										@Pc(8097) StringBuffer local8097 = new StringBuffer(local3888.length());
										@Pc(8099) boolean local8099 = false;
										for (local353 = 0; local353 < local3888.length(); local353++) {
											@Pc(8106) char local8106 = local3888.charAt(local353);
											if (local8106 == '<') {
												local8099 = true;
											} else if (local8106 == '>') {
												local8099 = false;
											} else if (!local8099) {
												local8097.append(local8106);
											}
										}
										aStringArray20[anInt3445++] = local8097.toString();
										return;
									}
									if (arg0 == 4120) {
										local3888 = aStringArray20[--anInt3445];
										anInt3450 -= 2;
										local19 = anIntArray286[anInt3450];
										local25 = anIntArray286[anInt3450 + 1];
										anIntArray286[anInt3450++] = local3888.indexOf(local19, local25);
										return;
									}
									if (arg0 == 4121) {
										anInt3445 -= 2;
										local3888 = aStringArray20[anInt3445];
										local1101 = aStringArray20[anInt3445 + 1];
										local25 = anIntArray286[--anInt3450];
										anIntArray286[anInt3450++] = local3888.indexOf(local1101, local25);
										return;
									}
									if (arg0 == 4122) {
										local13 = anIntArray286[--anInt3450];
										anIntArray286[anInt3450++] = Character.toLowerCase((char) local13);
										return;
									}
									if (arg0 == 4123) {
										local13 = anIntArray286[--anInt3450];
										anIntArray286[anInt3450++] = Character.toUpperCase((char) local13);
										return;
									}
									if (arg0 == 4124) {
										local412 = anIntArray286[--anInt3450] != 0;
										local19 = anIntArray286[--anInt3450];
										aStringArray20[anInt3445++] = Static405.method6457((long) local19, local412, Static544.anInt7853, 0);
										return;
									}
									if (arg0 == 4125) {
										local3888 = aStringArray20[--anInt3445];
										local19 = anIntArray286[--anInt3450];
										@Pc(8320) Class96 local8320 = Static363.method5898(local19, Static61.aClass69_18);
										anIntArray286[anInt3450++] = local8320.method2373(local3888, Static62.aClass104Array15);
										return;
									}
								} else if (arg0 < 4300) {
									if (arg0 == 4200) {
										local13 = anIntArray286[--anInt3450];
										aStringArray20[anInt3445++] = Static181.aClass316_1.method8107(local13).aString121;
										return;
									}
									@Pc(8382) Class180 local8382;
									if (arg0 == 4201) {
										anInt3450 -= 2;
										local13 = anIntArray286[anInt3450];
										local19 = anIntArray286[anInt3450 + 1];
										local8382 = Static181.aClass316_1.method8107(local13);
										if (local19 >= 1 && local19 <= 5 && local8382.aStringArray26[local19 - 1] != null) {
											aStringArray20[anInt3445++] = local8382.aStringArray26[local19 - 1];
											return;
										}
										aStringArray20[anInt3445++] = "";
										return;
									}
									if (arg0 == 4202) {
										anInt3450 -= 2;
										local13 = anIntArray286[anInt3450];
										local19 = anIntArray286[anInt3450 + 1];
										local8382 = Static181.aClass316_1.method8107(local13);
										if (local19 >= 1 && local19 <= 5 && local8382.aStringArray27[local19 - 1] != null) {
											aStringArray20[anInt3445++] = local8382.aStringArray27[local19 - 1];
											return;
										}
										aStringArray20[anInt3445++] = "";
										return;
									}
									if (arg0 == 4203) {
										local13 = anIntArray286[--anInt3450];
										anIntArray286[anInt3450++] = Static181.aClass316_1.method8107(local13).anInt5393;
										return;
									}
									if (arg0 == 4204) {
										local13 = anIntArray286[--anInt3450];
										anIntArray286[anInt3450++] = Static181.aClass316_1.method8107(local13).anInt5433 == 1 ? 1 : 0;
										return;
									}
									@Pc(8545) Class180 local8545;
									if (arg0 == 4205) {
										local13 = anIntArray286[--anInt3450];
										local8545 = Static181.aClass316_1.method8107(local13);
										if (local8545.anInt5450 == -1 && local8545.anInt5401 >= 0) {
											anIntArray286[anInt3450++] = local8545.anInt5401;
											return;
										}
										anIntArray286[anInt3450++] = local13;
										return;
									}
									if (arg0 == 4206) {
										local13 = anIntArray286[--anInt3450];
										local8545 = Static181.aClass316_1.method8107(local13);
										if (local8545.anInt5450 >= 0 && local8545.anInt5401 >= 0) {
											anIntArray286[anInt3450++] = local8545.anInt5401;
											return;
										}
										anIntArray286[anInt3450++] = local13;
										return;
									}
									if (arg0 == 4207) {
										local13 = anIntArray286[--anInt3450];
										anIntArray286[anInt3450++] = Static181.aClass316_1.method8107(local13).aBoolean410 ? 1 : 0;
										return;
									}
									if (arg0 == 4208) {
										anInt3450 -= 2;
										local13 = anIntArray286[anInt3450];
										local19 = anIntArray286[anInt3450 + 1];
										local3017 = Static440.aClass266_1.method6930(local19);
										if (local3017.method1652()) {
											aStringArray20[anInt3445++] = Static181.aClass316_1.method8107(local13).method4972(local3017.aString31, local19);
											return;
										}
										anIntArray286[anInt3450++] = Static181.aClass316_1.method8107(local13).method4971(local3017.anInt1685, local19);
										return;
									}
									if (arg0 == 4209) {
										anInt3450 -= 2;
										local13 = anIntArray286[anInt3450];
										local19 = anIntArray286[anInt3450 + 1] - 1;
										local8382 = Static181.aClass316_1.method8107(local13);
										if (local8382.anInt5452 == local19) {
											anIntArray286[anInt3450++] = local8382.anInt5431;
											return;
										}
										if (local8382.anInt5412 == local19) {
											anIntArray286[anInt3450++] = local8382.anInt5403;
											return;
										}
										anIntArray286[anInt3450++] = -1;
										return;
									}
									if (arg0 == 4210) {
										local3888 = aStringArray20[--anInt3445];
										local19 = anIntArray286[--anInt3450];
										Static47.method5111(local19 == 1, local3888);
										anIntArray286[anInt3450++] = Static219.anInt4316;
										return;
									}
									if (arg0 == 4211) {
										if (Static517.aShortArray148 != null && Static315.anInt6002 < Static219.anInt4316) {
											anIntArray286[anInt3450++] = Static517.aShortArray148[Static315.anInt6002++] & 0xFFFF;
											return;
										}
										anIntArray286[anInt3450++] = -1;
										return;
									}
									if (arg0 == 4212) {
										Static315.anInt6002 = 0;
										return;
									}
								} else if (arg0 < 4400) {
									if (arg0 == 4300) {
										anInt3450 -= 2;
										local13 = anIntArray286[anInt3450];
										local19 = anIntArray286[anInt3450 + 1];
										local3017 = Static440.aClass266_1.method6930(local19);
										if (local3017.method1652()) {
											aStringArray20[anInt3445++] = Static358.aClass95_1.method2362(local13).method7373(local3017.aString31, local19);
											return;
										}
										anIntArray286[anInt3450++] = Static358.aClass95_1.method2362(local13).method7378(local3017.anInt1685, local19);
										return;
									}
								} else if (arg0 < 4500) {
									if (arg0 == 4400) {
										anInt3450 -= 2;
										local13 = anIntArray286[anInt3450];
										local19 = anIntArray286[anInt3450 + 1];
										local3017 = Static440.aClass266_1.method6930(local19);
										if (local3017.method1652()) {
											aStringArray20[anInt3445++] = Static398.aClass18_4.method609(local13).method1615(local19, local3017.aString31);
											return;
										}
										anIntArray286[anInt3450++] = Static398.aClass18_4.method609(local13).method1628(local19, local3017.anInt1685);
										return;
									}
								} else if (arg0 < 4600) {
									if (arg0 == 4500) {
										anInt3450 -= 2;
										local13 = anIntArray286[anInt3450];
										local19 = anIntArray286[anInt3450 + 1];
										local3017 = Static440.aClass266_1.method6930(local19);
										if (local3017.method1652()) {
											aStringArray20[anInt3445++] = Static99.aClass141_1.method3830(local13).method3690(local3017.aString31, local19);
											return;
										}
										anIntArray286[anInt3450++] = Static99.aClass141_1.method3830(local13).method3687(local19, local3017.anInt1685);
										return;
									}
								} else if (arg0 < 4700 && arg0 == 4600) {
									local13 = anIntArray286[--anInt3450];
									@Pc(9046) Class299 local9046 = Static398.aClass167_1.method4607(local13);
									if (local9046.anIntArray773 != null && local9046.anIntArray773.length > 0) {
										local25 = 0;
										local353 = local9046.anIntArray771[0];
										for (local2290 = 1; local2290 < local9046.anIntArray773.length; local2290++) {
											if (local9046.anIntArray771[local2290] > local353) {
												local25 = local2290;
												local353 = local9046.anIntArray771[local2290];
											}
										}
										anIntArray286[anInt3450++] = local9046.anIntArray773[local25];
										return;
									}
									anIntArray286[anInt3450++] = local9046.anInt8833;
									return;
								}
							}
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static384.method6156(anIntArray286[--anInt3450]);
					} else {
						local137 = arg1 ? aClass91_6 : aClass91_7;
					}
					Static243.method4316(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt3450 -= 2;
						local19 = anIntArray286[anInt3450];
						local25 = anIntArray286[anInt3450 + 1];
						if (local137.anInt2395 == -1) {
							Static533.method8112(local137.anInt2368);
							Static204.method3806(local137.anInt2368);
							Static134.method2550(local137.anInt2368);
						}
						if (local19 == -1) {
							local137.anInt2405 = 1;
							local137.anInt2401 = -1;
							local137.anInt2391 = -1;
							return;
						}
						local137.anInt2391 = local19;
						local137.anInt2434 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean195 = true;
						} else {
							local137.aBoolean195 = false;
						}
						@Pc(1630) Class180 local1630 = Static181.aClass316_1.method8107(local19);
						local137.anInt2448 = local1630.anInt5436;
						local137.anInt2366 = local1630.anInt5425;
						local137.anInt2430 = local1630.anInt5445;
						local137.anInt2412 = local1630.anInt5402;
						local137.anInt2380 = local1630.anInt5447;
						local137.anInt2426 = local1630.anInt5422;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt2451 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt2451 = 1;
						} else {
							local137.anInt2451 = 2;
						}
						if (local137.anInt2416 > 0) {
							local137.anInt2426 = local137.anInt2426 * 32 / local137.anInt2416;
							return;
						}
						if (local137.anInt2400 > 0) {
							local137.anInt2426 = local137.anInt2426 * 32 / local137.anInt2400;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt2405 = 2;
						local137.anInt2401 = anIntArray286[--anInt3450];
						if (local137.anInt2395 == -1) {
							Static420.method6574(local137.anInt2368);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt2405 = 3;
						local137.anInt2401 = -1;
						if (local137.anInt2395 == -1) {
							Static420.method6574(local137.anInt2368);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt2405 = 6;
						local137.anInt2401 = anIntArray286[--anInt3450];
						if (local137.anInt2395 == -1) {
							Static420.method6574(local137.anInt2368);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt2405 = 5;
						local137.anInt2401 = anIntArray286[--anInt3450];
						if (local137.anInt2395 == -1) {
							Static420.method6574(local137.anInt2368);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt3450 -= 4;
						local137.anInt2418 = anIntArray286[anInt3450];
						local137.anInt2365 = anIntArray286[anInt3450 + 1];
						local137.anInt2450 = anIntArray286[anInt3450 + 2];
						local137.anInt2415 = anIntArray286[anInt3450 + 3];
						Static243.method4316(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt3450 -= 2;
						local137.anInt2387 = anIntArray286[anInt3450];
						local137.anInt2388 = anIntArray286[anInt3450 + 1];
						Static243.method4316(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt3450 -= 4;
						local137.anInt2401 = anIntArray286[anInt3450];
						local137.anInt2455 = anIntArray286[anInt3450 + 1];
						if (anIntArray286[anInt3450 + 2] == 1) {
							local137.anInt2405 = 9;
						} else {
							local137.anInt2405 = 8;
						}
						if (anIntArray286[anInt3450 + 3] == 1) {
							local137.aBoolean195 = true;
						} else {
							local137.aBoolean195 = false;
						}
						if (local137.anInt2395 == -1) {
							Static420.method6574(local137.anInt2368);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt2405 = 5;
						local137.anInt2401 = Static16.anInt9513;
						local137.anInt2455 = 0;
						if (local137.anInt2395 == -1) {
							Static420.method6574(local137.anInt2368);
						}
						return;
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
	private static void method3211(@OriginalArg(0) int arg0) {
		@Pc(3) Class91 local3 = Static384.method6156(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class91[] local13 = Static465.aClass91ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class91[] local19 = Static511.aClass91ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static465.aClass91ArrayArray1[local9] = new Class91[local22];
			Static556.method7041(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static556.method7041(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(IZ)V")
	public static void method3212() {
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method3213(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static378.anInt6739 == 0 && (Static498.aBoolean656 && !Static353.aBoolean479 || Static394.aBoolean512)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static58.aClass45_28.method1474(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static58.aClass45_28.method1474(0).length());
		} else if (local11.startsWith(Static19.aClass45_11.method1474(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static19.aClass45_11.method1474(0).length());
		} else if (local11.startsWith(Static284.aClass45_83.method1474(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static284.aClass45_83.method1474(0).length());
		} else if (local11.startsWith(Static220.aClass45_64.method1474(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static220.aClass45_64.method1474(0).length());
		} else if (local11.startsWith(Static116.aClass45_43.method1474(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static116.aClass45_43.method1474(0).length());
		} else if (local11.startsWith(Static512.aClass45_133.method1474(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static512.aClass45_133.method1474(0).length());
		} else if (local11.startsWith(Static78.aClass45_33.method1474(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static78.aClass45_33.method1474(0).length());
		} else if (local11.startsWith(Static113.aClass45_40.method1474(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static113.aClass45_40.method1474(0).length());
		} else if (local11.startsWith(Static263.aClass45_73.method1474(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static263.aClass45_73.method1474(0).length());
		} else if (local11.startsWith(Static524.aClass45_135.method1474(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static524.aClass45_135.method1474(0).length());
		} else if (local11.startsWith(Static484.aClass45_126.method1474(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static484.aClass45_126.method1474(0).length());
		} else if (local11.startsWith(Static22.aClass45_12.method1474(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static22.aClass45_12.method1474(0).length());
		} else if (Static544.anInt7853 != 0) {
			if (local11.startsWith(Static58.aClass45_28.method1474(Static544.anInt7853))) {
				local13 = 0;
				arg0 = arg0.substring(Static58.aClass45_28.method1474(Static544.anInt7853).length());
			} else if (local11.startsWith(Static19.aClass45_11.method1474(Static544.anInt7853))) {
				local13 = 1;
				arg0 = arg0.substring(Static19.aClass45_11.method1474(Static544.anInt7853).length());
			} else if (local11.startsWith(Static284.aClass45_83.method1474(Static544.anInt7853))) {
				local13 = 2;
				arg0 = arg0.substring(Static284.aClass45_83.method1474(Static544.anInt7853).length());
			} else if (local11.startsWith(Static220.aClass45_64.method1474(Static544.anInt7853))) {
				local13 = 3;
				arg0 = arg0.substring(Static220.aClass45_64.method1474(Static544.anInt7853).length());
			} else if (local11.startsWith(Static116.aClass45_43.method1474(Static544.anInt7853))) {
				local13 = 4;
				arg0 = arg0.substring(Static116.aClass45_43.method1474(Static544.anInt7853).length());
			} else if (local11.startsWith(Static512.aClass45_133.method1474(Static544.anInt7853))) {
				local13 = 5;
				arg0 = arg0.substring(Static512.aClass45_133.method1474(Static544.anInt7853).length());
			} else if (local11.startsWith(Static78.aClass45_33.method1474(Static544.anInt7853))) {
				local13 = 6;
				arg0 = arg0.substring(Static78.aClass45_33.method1474(Static544.anInt7853).length());
			} else if (local11.startsWith(Static113.aClass45_40.method1474(Static544.anInt7853))) {
				local13 = 7;
				arg0 = arg0.substring(Static113.aClass45_40.method1474(Static544.anInt7853).length());
			} else if (local11.startsWith(Static263.aClass45_73.method1474(Static544.anInt7853))) {
				local13 = 8;
				arg0 = arg0.substring(Static263.aClass45_73.method1474(Static544.anInt7853).length());
			} else if (local11.startsWith(Static524.aClass45_135.method1474(Static544.anInt7853))) {
				local13 = 9;
				arg0 = arg0.substring(Static524.aClass45_135.method1474(Static544.anInt7853).length());
			} else if (local11.startsWith(Static484.aClass45_126.method1474(Static544.anInt7853))) {
				local13 = 10;
				arg0 = arg0.substring(Static484.aClass45_126.method1474(Static544.anInt7853).length());
			} else if (local11.startsWith(Static22.aClass45_12.method1474(Static544.anInt7853))) {
				local13 = 11;
				arg0 = arg0.substring(Static22.aClass45_12.method1474(Static544.anInt7853).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static266.aClass45_74.method1474(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static266.aClass45_74.method1474(0).length());
		} else if (local11.startsWith(Static39.aClass45_21.method1474(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static39.aClass45_21.method1474(0).length());
		} else if (local11.startsWith(Static187.aClass45_57.method1474(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static187.aClass45_57.method1474(0).length());
		} else if (local11.startsWith(Static103.aClass45_37.method1474(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static103.aClass45_37.method1474(0).length());
		} else if (local11.startsWith(Static60.aClass45_30.method1474(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static60.aClass45_30.method1474(0).length());
		} else if (Static544.anInt7853 != 0) {
			if (local11.startsWith(Static266.aClass45_74.method1474(Static544.anInt7853))) {
				local451 = 1;
				arg0 = arg0.substring(Static266.aClass45_74.method1474(Static544.anInt7853).length());
			} else if (local11.startsWith(Static39.aClass45_21.method1474(Static544.anInt7853))) {
				local451 = 2;
				arg0 = arg0.substring(Static39.aClass45_21.method1474(Static544.anInt7853).length());
			} else if (local11.startsWith(Static187.aClass45_57.method1474(Static544.anInt7853))) {
				local451 = 3;
				arg0 = arg0.substring(Static187.aClass45_57.method1474(Static544.anInt7853).length());
			} else if (local11.startsWith(Static103.aClass45_37.method1474(Static544.anInt7853))) {
				local451 = 4;
				arg0 = arg0.substring(Static103.aClass45_37.method1474(Static544.anInt7853).length());
			} else if (local11.startsWith(Static60.aClass45_30.method1474(Static544.anInt7853))) {
				local451 = 5;
				arg0 = arg0.substring(Static60.aClass45_30.method1474(Static544.anInt7853).length());
			}
		}
		Static216.method3997(Static227.aClass252_64);
		Static259.aClass1_Sub17_Sub2_1.method4451(0);
		@Pc(646) int local646 = Static259.aClass1_Sub17_Sub2_1.anInt4872;
		if (arg1 == 5021) {
			Static259.aClass1_Sub17_Sub2_1.method4451(1);
		} else {
			Static259.aClass1_Sub17_Sub2_1.method4451(0);
		}
		Static259.aClass1_Sub17_Sub2_1.method4451(local13);
		Static259.aClass1_Sub17_Sub2_1.method4451(local451);
		Static469.method7145(arg0, Static259.aClass1_Sub17_Sub2_1);
		Static259.aClass1_Sub17_Sub2_1.method4441(Static259.aClass1_Sub17_Sub2_1.anInt4872 - local646);
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V")
	private static void method3214(@OriginalArg(0) int arg0) {
		@Pc(3) Class91 local3 = Static384.method6156(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class91[] local13 = Static465.aClass91ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class91[] local19 = Static511.aClass91ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static465.aClass91ArrayArray1[local9] = new Class91[local22];
			Static556.method7041(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static556.method7041(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)Ljava/lang/String;")
	private static String method3215(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar1.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar1.get(5);
		@Pc(20) int local20 = aCalendar1.get(2);
		@Pc(24) int local24 = aCalendar1.get(1);
		return local16 + "-" + aStringArray21[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!jr;II)V")
	public static void method3216(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class1_Sub2_Sub13 local5 = Static519.method1984(arg0, arg1, arg2);
		if (local5 == null) {
			return;
		}
		anIntArray284 = new int[local5.anInt6708];
		aStringArray19 = new String[local5.anInt6707];
		if (local5.aClass155_20 == Static91.aClass155_26 || local5.aClass155_20 == Static59.aClass155_1 || local5.aClass155_20 == Static410.aClass155_22) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static267.aClass91_9 != null) {
				local30 = Static267.aClass91_9.anInt2423;
				local32 = Static267.aClass91_9.anInt2409;
			}
			anIntArray284[0] = Static10.aClass99_1.method6618() - local30;
			anIntArray284[1] = Static10.aClass99_1.method6619() - local32;
		}
		method3217(local5, 200000);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!pj;I)V")
	private static void method3217(@OriginalArg(0) Class1_Sub2_Sub13 arg0, @OriginalArg(1) int arg1) {
		anInt3450 = 0;
		anInt3445 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray651;
		@Pc(11) int[] local11 = arg0.anIntArray652;
		@Pc(13) byte local13 = -1;
		anInt3451 = 0;
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
						method3210(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method3218(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray286[anInt3450++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray286[anInt3450++] = Static417.aClass10_1.anIntArray29[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static417.aClass10_1.method526(anIntArray286[--anInt3450], local54);
					} else if (local31 == 3) {
						aStringArray20[anInt3445++] = arg0.aStringArray30[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt3450 -= 2;
						if (anIntArray286[anInt3450] != anIntArray286[anInt3450 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt3450 -= 2;
						if (anIntArray286[anInt3450] == anIntArray286[anInt3450 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt3450 -= 2;
						if (anIntArray286[anInt3450] < anIntArray286[anInt3450 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt3450 -= 2;
						if (anIntArray286[anInt3450] > anIntArray286[anInt3450 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt3451 == 0) {
							return;
						}
						@Pc(216) Class101 local216 = aClass101Array1[--anInt3451];
						arg0 = local216.aClass1_Sub2_Sub13_1;
						local8 = arg0.anIntArray651;
						local11 = arg0.anIntArray652;
						local5 = local216.anInt2626;
						anIntArray284 = local216.anIntArray231;
						aStringArray19 = local216.aStringArray16;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray286[anInt3450++] = Static417.aClass10_1.method523(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static417.aClass10_1.method530(local54, anIntArray286[--anInt3450]);
					} else if (local31 == 31) {
						anInt3450 -= 2;
						if (anIntArray286[anInt3450] <= anIntArray286[anInt3450 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt3450 -= 2;
						if (anIntArray286[anInt3450] >= anIntArray286[anInt3450 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray286[anInt3450++] = anIntArray284[local11[local5]];
					} else if (local31 == 34) {
						anIntArray284[local11[local5]] = anIntArray286[--anInt3450];
					} else if (local31 == 35) {
						aStringArray20[anInt3445++] = aStringArray19[local11[local5]];
					} else if (local31 == 36) {
						aStringArray19[local11[local5]] = aStringArray20[--anInt3445];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt3445 -= local54;
						@Pc(400) String local400 = Static16.method8196(local54, anInt3445, aStringArray20);
						aStringArray20[anInt3445++] = local400;
					} else if (local31 == 38) {
						anInt3450--;
					} else if (local31 == 39) {
						anInt3445--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class1_Sub2_Sub13 local436 = Static69.method1691(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt6708];
							@Pc(450) String[] local450 = new String[local436.anInt6707];
							for (local452 = 0; local452 < local436.anInt6705; local452++) {
								local446[local452] = anIntArray286[anInt3450 + local452 - local436.anInt6705];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt6706; local471++) {
								local450[local471] = aStringArray20[anInt3445 + local471 - local436.anInt6706];
							}
							anInt3450 -= local436.anInt6705;
							anInt3445 -= local436.anInt6706;
							@Pc(502) Class101 local502 = new Class101();
							local502.aClass1_Sub2_Sub13_1 = arg0;
							local502.anInt2626 = local5;
							local502.anIntArray231 = anIntArray284;
							local502.aStringArray16 = aStringArray19;
							if (anInt3451 >= aClass101Array1.length) {
								throw new RuntimeException();
							}
							aClass101Array1[anInt3451++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray651;
							local11 = local436.anIntArray652;
							local5 = -1;
							anIntArray284 = local446;
							aStringArray19 = local450;
						} else if (local31 == 42) {
							anIntArray286[anInt3450++] = Static540.anIntArray837[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static540.anIntArray837[local54] = anIntArray286[--anInt3450];
							Static504.method7717(local54);
							Static502.aBoolean668 |= Static137.aBooleanArray4[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray286[--anInt3450];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray285[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray38[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray286[--anInt3450];
							if (local603 < 0 || local603 >= anIntArray285[local54]) {
								throw new RuntimeException();
							}
							anIntArray286[anInt3450++] = anIntArrayArray38[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt3450 -= 2;
							local603 = anIntArray286[anInt3450];
							if (local603 < 0 || local603 >= anIntArray285[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray38[local54][local603] = anIntArray286[anInt3450 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static83.aStringArray36[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray20[anInt3445++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static83.aStringArray36[local54] = aStringArray20[--anInt3445];
							Static150.method2791(local54);
						} else if (local31 == 51) {
							@Pc(774) Class230 local774 = arg0.aClass230Array1[local11[local5]];
							@Pc(787) Class1_Sub14 local787 = (Class1_Sub14) local774.method6144((long) anIntArray286[--anInt3450]);
							if (local787 != null) {
								local5 += local787.anInt2795;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(855) StringBuffer local855;
			if (arg0.aString162 == null) {
				local855 = new StringBuffer(30);
				local855.append("CS2: ").append(arg0.aLong251).append(" ");
				for (local603 = anInt3451 - 1; local603 >= 0; local603--) {
					local855.append("v: ").append(aClass101Array1[local603].aClass1_Sub2_Sub13_1.aLong251).append(" ");
				}
				local855.append("op: ").append(local13);
				Static25.method773(local837, local855.toString());
			} else {
				Static484.method7507("Clientscript error in: " + arg0.aString162);
				local855 = new StringBuffer(30);
				local855.append("Clientscript error in: ").append(arg0.aString162).append("\n");
				for (local603 = anInt3451 - 1; local603 >= 0; local603--) {
					local855.append("via: ").append(aClass101Array1[local603].aClass1_Sub2_Sub13_1.aString162).append("\n");
				}
				local855.append("Op: ").append(local13).append("\n");
				@Pc(895) String local895 = local837.getMessage();
				if (local895 != null && local895.length() > 0) {
					local855.append("Message: ").append(local895).append("\n");
				}
				Static25.method773(local837, local855.toString());
				Static465.method7070(local855.toString());
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(IZ)V")
	private static void method3218(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(157) int local157;
		@Pc(691) int local691;
		@Pc(89) int local89;
		@Pc(95) int local95;
		@Pc(1375) boolean local1375;
		@Pc(163) String local163;
		@Pc(81) String local81;
		@Pc(75) String local75;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray286[anInt3450++] = Static78.anInt1854;
				return;
			}
			if (arg0 == 5001) {
				anInt3450 -= 3;
				Static78.anInt1854 = anIntArray286[anInt3450];
				Static392.aClass121_4 = Static262.method4709(anIntArray286[anInt3450 + 1]);
				if (Static392.aClass121_4 == null) {
					Static392.aClass121_4 = Static188.aClass121_2;
				}
				Static16.anInt9498 = anIntArray286[anInt3450 + 2];
				Static216.method3997(Static13.aClass252_5);
				Static259.aClass1_Sub17_Sub2_1.method4451(Static78.anInt1854);
				Static259.aClass1_Sub17_Sub2_1.method4451(Static392.aClass121_4.anInt3423);
				Static259.aClass1_Sub17_Sub2_1.method4451(Static16.anInt9498);
				return;
			}
			if (arg0 == 5002) {
				anInt3445 -= 2;
				local75 = aStringArray20[anInt3445];
				local81 = aStringArray20[anInt3445 + 1];
				anInt3450 -= 2;
				local89 = anIntArray286[anInt3450];
				local95 = anIntArray286[anInt3450 + 1];
				if (local81 == null) {
					local81 = "";
				}
				if (local81.length() > 80) {
					local81 = local81.substring(0, 80);
				}
				Static216.method3997(Static428.aClass252_113);
				Static259.aClass1_Sub17_Sub2_1.method4451(Static115.method2266(local75) + Static115.method2266(local81) + 2);
				Static259.aClass1_Sub17_Sub2_1.method4464(local75);
				Static259.aClass1_Sub17_Sub2_1.method4451(local89 - 1);
				Static259.aClass1_Sub17_Sub2_1.method4451(local95);
				Static259.aClass1_Sub17_Sub2_1.method4464(local81);
				return;
			}
			@Pc(161) Class315 local161;
			if (arg0 == 5003) {
				local157 = anIntArray286[--anInt3450];
				local161 = Static147.method2755(local157);
				local163 = "";
				if (local161 != null && local161.aString212 != null) {
					local163 = local161.aString212;
				}
				aStringArray20[anInt3445++] = local163;
				return;
			}
			if (arg0 == 5004) {
				local157 = anIntArray286[--anInt3450];
				local161 = Static147.method2755(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt9394;
				}
				anIntArray286[anInt3450++] = local89;
				return;
			}
			if (arg0 == 5005) {
				if (Static392.aClass121_4 == null) {
					anIntArray286[anInt3450++] = -1;
					return;
				}
				anIntArray286[anInt3450++] = Static392.aClass121_4.anInt3423;
				return;
			}
			if (arg0 == 5008 || arg0 == 5021) {
				local75 = aStringArray20[--anInt3445];
				method3213(local75, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt3445 -= 2;
				local75 = aStringArray20[anInt3445];
				local81 = aStringArray20[anInt3445 + 1];
				if (Static378.anInt6739 != 0 || (!Static498.aBoolean656 || Static353.aBoolean479) && !Static394.aBoolean512) {
					Static216.method3997(Static77.aClass252_36);
					Static259.aClass1_Sub17_Sub2_1.method4451(0);
					local89 = Static259.aClass1_Sub17_Sub2_1.anInt4872;
					Static259.aClass1_Sub17_Sub2_1.method4464(local75);
					Static469.method7145(local81, Static259.aClass1_Sub17_Sub2_1);
					Static259.aClass1_Sub17_Sub2_1.method4441(Static259.aClass1_Sub17_Sub2_1.anInt4872 - local89);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local157 = anIntArray286[--anInt3450];
				local161 = Static147.method2755(local157);
				local163 = "";
				if (local161 != null && local161.aString211 != null) {
					local163 = local161.aString211;
				}
				aStringArray20[anInt3445++] = local163;
				return;
			}
			if (arg0 == 5011) {
				local157 = anIntArray286[--anInt3450];
				local161 = Static147.method2755(local157);
				local163 = "";
				if (local161 != null && local161.aString213 != null) {
					local163 = local161.aString213;
				}
				aStringArray20[anInt3445++] = local163;
				return;
			}
			if (arg0 == 5012) {
				local157 = anIntArray286[--anInt3450];
				local161 = Static147.method2755(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt9388;
				}
				anIntArray286[anInt3450++] = local89;
				return;
			}
			if (arg0 == 5015) {
				if (Static107.aClass20_Sub1_Sub1_Sub1_1 == null || Static107.aClass20_Sub1_Sub1_Sub1_1.aString12 == null) {
					local75 = Static309.aString140;
				} else {
					local75 = Static107.aClass20_Sub1_Sub1_Sub1_1.method724();
				}
				aStringArray20[anInt3445++] = local75;
				return;
			}
			if (arg0 == 5016) {
				anIntArray286[anInt3450++] = Static16.anInt9498;
				return;
			}
			if (arg0 == 5017) {
				anIntArray286[anInt3450++] = Static83.method7763();
				return;
			}
			if (arg0 == 5018) {
				local157 = anIntArray286[--anInt3450];
				local161 = Static147.method2755(local157);
				local89 = 0;
				if (local161 != null) {
					local89 = local161.anInt9391;
				}
				anIntArray286[anInt3450++] = local89;
				return;
			}
			if (arg0 == 5019) {
				local157 = anIntArray286[--anInt3450];
				local161 = Static147.method2755(local157);
				local163 = "";
				if (local161 != null && local161.aString210 != null) {
					local163 = local161.aString210;
				}
				aStringArray20[anInt3445++] = local163;
				return;
			}
			if (arg0 == 5020) {
				if (Static107.aClass20_Sub1_Sub1_Sub1_1 == null || Static107.aClass20_Sub1_Sub1_Sub1_1.aString12 == null) {
					local75 = Static309.aString140;
				} else {
					local75 = Static107.aClass20_Sub1_Sub1_Sub1_1.method725();
				}
				aStringArray20[anInt3445++] = local75;
				return;
			}
			if (arg0 == 5023) {
				local157 = anIntArray286[--anInt3450];
				local161 = Static147.method2755(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt9390;
				}
				anIntArray286[anInt3450++] = local89;
				return;
			}
			if (arg0 == 5024) {
				local157 = anIntArray286[--anInt3450];
				local161 = Static147.method2755(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt9395;
				}
				anIntArray286[anInt3450++] = local89;
				return;
			}
			if (arg0 == 5050) {
				local157 = anIntArray286[--anInt3450];
				aStringArray20[anInt3445++] = Static429.aClass5_1.method375(local157).aString5;
				return;
			}
			@Pc(651) Class1_Sub2_Sub1 local651;
			if (arg0 == 5051) {
				local157 = anIntArray286[--anInt3450];
				local651 = Static429.aClass5_1.method375(local157);
				if (local651.anIntArray20 == null) {
					anIntArray286[anInt3450++] = 0;
					return;
				}
				anIntArray286[anInt3450++] = local651.anIntArray20.length;
				return;
			}
			if (arg0 == 5052) {
				anInt3450 -= 2;
				local157 = anIntArray286[anInt3450];
				local691 = anIntArray286[anInt3450 + 1];
				@Pc(696) Class1_Sub2_Sub1 local696 = Static429.aClass5_1.method375(local157);
				local95 = local696.anIntArray20[local691];
				anIntArray286[anInt3450++] = local95;
				return;
			}
			if (arg0 == 5053) {
				local157 = anIntArray286[--anInt3450];
				local651 = Static429.aClass5_1.method375(local157);
				if (local651.anIntArray21 == null) {
					anIntArray286[anInt3450++] = 0;
					return;
				}
				anIntArray286[anInt3450++] = local651.anIntArray21.length;
				return;
			}
			if (arg0 == 5054) {
				anInt3450 -= 2;
				local157 = anIntArray286[anInt3450];
				local691 = anIntArray286[anInt3450 + 1];
				anIntArray286[anInt3450++] = Static429.aClass5_1.method375(local157).anIntArray21[local691];
				return;
			}
			if (arg0 == 5055) {
				local157 = anIntArray286[--anInt3450];
				aStringArray20[anInt3445++] = Static221.aClass41_1.method1404(local157).method5431();
				return;
			}
			if (arg0 == 5056) {
				local157 = anIntArray286[--anInt3450];
				@Pc(822) Class1_Sub2_Sub11 local822 = Static221.aClass41_1.method1404(local157);
				if (local822.anIntArray467 == null) {
					anIntArray286[anInt3450++] = 0;
					return;
				}
				anIntArray286[anInt3450++] = local822.anIntArray467.length;
				return;
			}
			if (arg0 == 5057) {
				anInt3450 -= 2;
				local157 = anIntArray286[anInt3450];
				local691 = anIntArray286[anInt3450 + 1];
				anIntArray286[anInt3450++] = Static221.aClass41_1.method1404(local157).anIntArray467[local691];
				return;
			}
			if (arg0 == 5058) {
				aClass115_1 = new Class115();
				aClass115_1.anInt3092 = anIntArray286[--anInt3450];
				aClass115_1.aClass1_Sub2_Sub11_1 = Static221.aClass41_1.method1404(aClass115_1.anInt3092);
				aClass115_1.anIntArray265 = new int[aClass115_1.aClass1_Sub2_Sub11_1.method5425()];
				return;
			}
			if (arg0 == 5059) {
				Static216.method3997(Static70.aClass252_35);
				Static259.aClass1_Sub17_Sub2_1.method4451(0);
				local157 = Static259.aClass1_Sub17_Sub2_1.anInt4872;
				Static259.aClass1_Sub17_Sub2_1.method4451(0);
				Static259.aClass1_Sub17_Sub2_1.method4473(aClass115_1.anInt3092);
				aClass115_1.aClass1_Sub2_Sub11_1.method5421(Static259.aClass1_Sub17_Sub2_1, aClass115_1.anIntArray265);
				Static259.aClass1_Sub17_Sub2_1.method4441(Static259.aClass1_Sub17_Sub2_1.anInt4872 - local157);
				return;
			}
			if (arg0 == 5060) {
				local75 = aStringArray20[--anInt3445];
				Static216.method3997(Static427.aClass252_111);
				Static259.aClass1_Sub17_Sub2_1.method4451(0);
				local691 = Static259.aClass1_Sub17_Sub2_1.anInt4872;
				Static259.aClass1_Sub17_Sub2_1.method4464(local75);
				Static259.aClass1_Sub17_Sub2_1.method4473(aClass115_1.anInt3092);
				aClass115_1.aClass1_Sub2_Sub11_1.method5421(Static259.aClass1_Sub17_Sub2_1, aClass115_1.anIntArray265);
				Static259.aClass1_Sub17_Sub2_1.method4441(Static259.aClass1_Sub17_Sub2_1.anInt4872 - local691);
				return;
			}
			if (arg0 == 5061) {
				Static216.method3997(Static70.aClass252_35);
				Static259.aClass1_Sub17_Sub2_1.method4451(0);
				local157 = Static259.aClass1_Sub17_Sub2_1.anInt4872;
				Static259.aClass1_Sub17_Sub2_1.method4451(1);
				Static259.aClass1_Sub17_Sub2_1.method4473(aClass115_1.anInt3092);
				aClass115_1.aClass1_Sub2_Sub11_1.method5421(Static259.aClass1_Sub17_Sub2_1, aClass115_1.anIntArray265);
				Static259.aClass1_Sub17_Sub2_1.method4441(Static259.aClass1_Sub17_Sub2_1.anInt4872 - local157);
				return;
			}
			if (arg0 == 5062) {
				anInt3450 -= 2;
				local157 = anIntArray286[anInt3450];
				local691 = anIntArray286[anInt3450 + 1];
				anIntArray286[anInt3450++] = Static429.aClass5_1.method375(local157).aCharArray2[local691];
				return;
			}
			if (arg0 == 5063) {
				anInt3450 -= 2;
				local157 = anIntArray286[anInt3450];
				local691 = anIntArray286[anInt3450 + 1];
				anIntArray286[anInt3450++] = Static429.aClass5_1.method375(local157).aCharArray3[local691];
				return;
			}
			if (arg0 == 5064) {
				anInt3450 -= 2;
				local157 = anIntArray286[anInt3450];
				local691 = anIntArray286[anInt3450 + 1];
				if (local691 == -1) {
					anIntArray286[anInt3450++] = -1;
					return;
				}
				anIntArray286[anInt3450++] = Static429.aClass5_1.method375(local157).method425((char) local691);
				return;
			}
			if (arg0 == 5065) {
				anInt3450 -= 2;
				local157 = anIntArray286[anInt3450];
				local691 = anIntArray286[anInt3450 + 1];
				if (local691 == -1) {
					anIntArray286[anInt3450++] = -1;
					return;
				}
				anIntArray286[anInt3450++] = Static429.aClass5_1.method375(local157).method429((char) local691);
				return;
			}
			if (arg0 == 5066) {
				local157 = anIntArray286[--anInt3450];
				anIntArray286[anInt3450++] = Static221.aClass41_1.method1404(local157).method5425();
				return;
			}
			if (arg0 == 5067) {
				anInt3450 -= 2;
				local157 = anIntArray286[anInt3450];
				local691 = anIntArray286[anInt3450 + 1];
				local89 = Static221.aClass41_1.method1404(local157).method5419(local691).anInt4526;
				anIntArray286[anInt3450++] = local89;
				return;
			}
			if (arg0 == 5068) {
				anInt3450 -= 2;
				local157 = anIntArray286[anInt3450];
				local691 = anIntArray286[anInt3450 + 1];
				aClass115_1.anIntArray265[local157] = local691;
				return;
			}
			if (arg0 == 5069) {
				anInt3450 -= 2;
				local157 = anIntArray286[anInt3450];
				local691 = anIntArray286[anInt3450 + 1];
				aClass115_1.anIntArray265[local157] = local691;
				return;
			}
			if (arg0 == 5070) {
				anInt3450 -= 3;
				local157 = anIntArray286[anInt3450];
				local691 = anIntArray286[anInt3450 + 1];
				local89 = anIntArray286[anInt3450 + 2];
				@Pc(1327) Class1_Sub2_Sub11 local1327 = Static221.aClass41_1.method1404(local157);
				if (local1327.method5419(local691).anInt4526 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray286[anInt3450++] = local1327.method5423(local691, local89);
				return;
			}
			if (arg0 == 5071) {
				local75 = aStringArray20[--anInt3445];
				local1375 = anIntArray286[--anInt3450] == 1;
				Static415.method6537(local1375, local75);
				anIntArray286[anInt3450++] = Static219.anInt4316;
				return;
			}
			if (arg0 == 5072) {
				if (Static517.aShortArray148 != null && Static315.anInt6002 < Static219.anInt4316) {
					anIntArray286[anInt3450++] = Static517.aShortArray148[Static315.anInt6002++] & 0xFFFF;
					return;
				}
				anIntArray286[anInt3450++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static315.anInt6002 = 0;
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static25.aClass241_1.method6303(86)) {
					anIntArray286[anInt3450++] = 1;
					return;
				}
				anIntArray286[anInt3450++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static25.aClass241_1.method6303(82)) {
					anIntArray286[anInt3450++] = 1;
					return;
				}
				anIntArray286[anInt3450++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static25.aClass241_1.method6303(81)) {
					anIntArray286[anInt3450++] = 1;
					return;
				}
				anIntArray286[anInt3450++] = 0;
				return;
			}
		} else {
			@Pc(2712) int local2712;
			@Pc(1986) boolean local1986;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static382.method6135(anIntArray286[--anInt3450]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray286[anInt3450++] = Static458.method7007();
					return;
				}
				if (arg0 == 5205) {
					Static348.method5764(false, anIntArray286[--anInt3450], -1, -1);
					return;
				}
				@Pc(1575) Class1_Sub2_Sub12 local1575;
				if (arg0 == 5206) {
					local157 = anIntArray286[--anInt3450];
					local1575 = Static335.method4559(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					if (local1575 == null) {
						anIntArray286[anInt3450++] = -1;
						return;
					}
					anIntArray286[anInt3450++] = local1575.anInt6324;
					return;
				}
				@Pc(1608) Class1_Sub2_Sub12 local1608;
				if (arg0 == 5207) {
					local1608 = Static335.method4570(anIntArray286[--anInt3450]);
					if (local1608 != null && local1608.aString154 != null) {
						aStringArray20[anInt3445++] = local1608.aString154;
						return;
					}
					aStringArray20[anInt3445++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray286[anInt3450++] = Static516.anInt9149;
					anIntArray286[anInt3450++] = Static386.anInt8112;
					return;
				}
				if (arg0 == 5209) {
					anIntArray286[anInt3450++] = Static64.anInt1610 + Static335.anInt4941;
					anIntArray286[anInt3450++] = Static32.anInt1050 + Static335.anInt4935;
					return;
				}
				if (arg0 == 5210) {
					local157 = anIntArray286[--anInt3450];
					local1575 = Static335.method4570(local157);
					if (local1575 == null) {
						anIntArray286[anInt3450++] = 0;
						anIntArray286[anInt3450++] = 0;
						return;
					}
					anIntArray286[anInt3450++] = local1575.anInt6308 >> 14 & 0x3FFF;
					anIntArray286[anInt3450++] = local1575.anInt6308 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local157 = anIntArray286[--anInt3450];
					local1575 = Static335.method4570(local157);
					if (local1575 == null) {
						anIntArray286[anInt3450++] = 0;
						anIntArray286[anInt3450++] = 0;
						return;
					}
					anIntArray286[anInt3450++] = local1575.anInt6311 - local1575.anInt6310;
					anIntArray286[anInt3450++] = local1575.anInt6312 - local1575.anInt6314;
					return;
				}
				@Pc(1798) Class1_Sub51 local1798;
				if (arg0 == 5212) {
					local1798 = Static507.method7748();
					if (local1798 == null) {
						anIntArray286[anInt3450++] = -1;
						anIntArray286[anInt3450++] = -1;
						return;
					}
					anIntArray286[anInt3450++] = local1798.anInt9566;
					local691 = local1798.anInt9568 << 28 | local1798.anInt9571 + Static335.anInt4941 << 14 | local1798.anInt9569 + Static335.anInt4935;
					anIntArray286[anInt3450++] = local691;
					return;
				}
				if (arg0 == 5213) {
					local1798 = Static184.method3551();
					if (local1798 == null) {
						anIntArray286[anInt3450++] = -1;
						anIntArray286[anInt3450++] = -1;
						return;
					}
					anIntArray286[anInt3450++] = local1798.anInt9566;
					local691 = local1798.anInt9568 << 28 | local1798.anInt9571 + Static335.anInt4941 << 14 | local1798.anInt9569 + Static335.anInt4935;
					anIntArray286[anInt3450++] = local691;
					return;
				}
				@Pc(1946) boolean local1946;
				if (arg0 == 5214) {
					local157 = anIntArray286[--anInt3450];
					local1575 = Static27.method796();
					if (local1575 != null) {
						local1946 = local1575.method5741(anIntArray287, local157 >> 14 & 0x3FFF, local157 & 0x3FFF, local157 >> 28 & 0x3);
						if (local1946) {
							Static193.method3688(anIntArray287[1], anIntArray287[2]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt3450 -= 2;
					local157 = anIntArray286[anInt3450];
					local691 = anIntArray286[anInt3450 + 1];
					@Pc(1984) Class259 local1984 = Static335.method4558(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					local1986 = false;
					for (@Pc(1991) Class1_Sub2_Sub12 local1991 = (Class1_Sub2_Sub12) local1984.method6652(); local1991 != null; local1991 = (Class1_Sub2_Sub12) local1984.method6654()) {
						if (local1991.anInt6324 == local691) {
							local1986 = true;
							break;
						}
					}
					if (local1986) {
						anIntArray286[anInt3450++] = 1;
						return;
					}
					anIntArray286[anInt3450++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local157 = anIntArray286[--anInt3450];
					local1575 = Static335.method4570(local157);
					if (local1575 == null) {
						anIntArray286[anInt3450++] = -1;
						return;
					}
					anIntArray286[anInt3450++] = local1575.anInt6319;
					return;
				}
				if (arg0 == 5220) {
					anIntArray286[anInt3450++] = Static224.anInt4343 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local157 = anIntArray286[--anInt3450];
					Static193.method3688(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1608 = Static27.method796();
					if (local1608 != null) {
						local1375 = local1608.method5737(anIntArray287, Static64.anInt1610 + Static335.anInt4941, Static32.anInt1050 + Static335.anInt4935);
						if (local1375) {
							anIntArray286[anInt3450++] = anIntArray287[1];
							anIntArray286[anInt3450++] = anIntArray287[2];
							return;
						}
						anIntArray286[anInt3450++] = -1;
						anIntArray286[anInt3450++] = -1;
						return;
					}
					anIntArray286[anInt3450++] = -1;
					anIntArray286[anInt3450++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt3450 -= 2;
					local157 = anIntArray286[anInt3450];
					local691 = anIntArray286[anInt3450 + 1];
					Static348.method5764(false, local157, local691 >> 14 & 0x3FFF, local691 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local157 = anIntArray286[--anInt3450];
					local1575 = Static27.method796();
					if (local1575 != null) {
						local1946 = local1575.method5741(anIntArray287, local157 >> 14 & 0x3FFF, local157 & 0x3FFF, local157 >> 28 & 0x3);
						if (local1946) {
							anIntArray286[anInt3450++] = anIntArray287[1];
							anIntArray286[anInt3450++] = anIntArray287[2];
							return;
						}
						anIntArray286[anInt3450++] = -1;
						anIntArray286[anInt3450++] = -1;
						return;
					}
					anIntArray286[anInt3450++] = -1;
					anIntArray286[anInt3450++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local157 = anIntArray286[--anInt3450];
					local1575 = Static27.method796();
					if (local1575 != null) {
						local1946 = local1575.method5737(anIntArray287, local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
						if (local1946) {
							anIntArray286[anInt3450++] = anIntArray287[1];
							anIntArray286[anInt3450++] = anIntArray287[2];
							return;
						}
						anIntArray286[anInt3450++] = -1;
						anIntArray286[anInt3450++] = -1;
						return;
					}
					anIntArray286[anInt3450++] = -1;
					anIntArray286[anInt3450++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static349.method5784(anIntArray286[--anInt3450]);
					return;
				}
				if (arg0 == 5227) {
					anInt3450 -= 2;
					local157 = anIntArray286[anInt3450];
					local691 = anIntArray286[anInt3450 + 1];
					Static348.method5764(true, local157, local691 >> 14 & 0x3FFF, local691 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Static443.aBoolean572 = anIntArray286[--anInt3450] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray286[anInt3450++] = Static443.aBoolean572 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local157 = anIntArray286[--anInt3450];
					Static279.method2789(local157);
					return;
				}
				@Pc(2504) Class1 local2504;
				if (arg0 == 5231) {
					anInt3450 -= 2;
					local157 = anIntArray286[anInt3450];
					local1375 = anIntArray286[anInt3450 + 1] == 1;
					if (Static169.aClass230_21 != null) {
						local2504 = Static169.aClass230_21.method6144((long) local157);
						if (local2504 != null && !local1375) {
							local2504.method8239();
							return;
						}
						if (local2504 == null && local1375) {
							local2504 = new Class1();
							Static169.aClass230_21.method6139((long) local157, local2504);
						}
					}
					return;
				}
				@Pc(2546) Class1 local2546;
				if (arg0 == 5232) {
					local157 = anIntArray286[--anInt3450];
					if (Static169.aClass230_21 != null) {
						local2546 = Static169.aClass230_21.method6144((long) local157);
						anIntArray286[anInt3450++] = local2546 == null ? 0 : 1;
						return;
					}
					anIntArray286[anInt3450++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt3450 -= 2;
					local157 = anIntArray286[anInt3450];
					local1375 = anIntArray286[anInt3450 + 1] == 1;
					if (Static344.aClass230_36 != null) {
						local2504 = Static344.aClass230_36.method6144((long) local157);
						if (local2504 != null && !local1375) {
							local2504.method8239();
							return;
						}
						if (local2504 == null && local1375) {
							local2504 = new Class1();
							Static344.aClass230_36.method6139((long) local157, local2504);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local157 = anIntArray286[--anInt3450];
					if (Static344.aClass230_36 != null) {
						local2546 = Static344.aClass230_36.method6144((long) local157);
						anIntArray286[anInt3450++] = local2546 == null ? 0 : 1;
						return;
					}
					anIntArray286[anInt3450++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray286[anInt3450++] = Static335.aClass1_Sub2_Sub12_3 == null ? -1 : Static335.aClass1_Sub2_Sub12_3.anInt6324;
					return;
				}
				if (arg0 == 5236) {
					anInt3450 -= 2;
					local157 = anIntArray286[anInt3450];
					local691 = anIntArray286[anInt3450 + 1];
					local89 = local691 >> 14 & 0x3FFF;
					local95 = local691 & 0x3FFF;
					local2712 = Static329.method5608(local95, local157, local89);
					if (local2712 < 0) {
						anIntArray286[anInt3450++] = -1;
						return;
					}
					anIntArray286[anInt3450++] = local2712;
					return;
				}
				if (arg0 == 5237) {
					Static31.method7280();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt3450 -= 2;
					local157 = anIntArray286[anInt3450];
					local691 = anIntArray286[anInt3450 + 1];
					Static487.method7514(3, local691, local157, false);
					anIntArray286[anInt3450++] = Static189.aFrame1 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static189.aFrame1 != null) {
						Static487.method7514(Static286.aClass1_Sub15_Sub1_1.anInt7031, -1, -1, false);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2796) Class270[] local2796 = Static290.method5101();
					anIntArray286[anInt3450++] = local2796.length;
					return;
				}
				if (arg0 == 5303) {
					local157 = anIntArray286[--anInt3450];
					@Pc(2820) Class270[] local2820 = Static290.method5101();
					anIntArray286[anInt3450++] = local2820[local157].anInt7897;
					anIntArray286[anInt3450++] = local2820[local157].anInt7894;
					return;
				}
				if (arg0 == 5305) {
					local157 = Static286.aClass1_Sub15_Sub1_1.anInt7035;
					local691 = Static286.aClass1_Sub15_Sub1_1.anInt7038;
					local89 = -1;
					@Pc(2857) Class270[] local2857 = Static290.method5101();
					for (local2712 = 0; local2712 < local2857.length; local2712++) {
						@Pc(2864) Class270 local2864 = local2857[local2712];
						if (local2864.anInt7897 == local157 && local2864.anInt7894 == local691) {
							local89 = local2712;
							break;
						}
					}
					anIntArray286[anInt3450++] = local89;
					return;
				}
				if (arg0 == 5306) {
					anIntArray286[anInt3450++] = Static226.method4065();
					return;
				}
				if (arg0 == 5307) {
					local157 = anIntArray286[--anInt3450];
					if (local157 >= 1 && local157 <= 2) {
						Static487.method7514(local157, -1, -1, false);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray286[anInt3450++] = Static286.aClass1_Sub15_Sub1_1.anInt7031;
					return;
				}
				if (arg0 == 5309) {
					local157 = anIntArray286[--anInt3450];
					if (local157 >= 1 && local157 <= 2) {
						Static286.aClass1_Sub15_Sub1_1.anInt7031 = local157;
						Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
						return;
					}
					return;
				}
			} else if (arg0 < 5500) {
				if (arg0 == 5400) {
					anInt3445 -= 2;
					local75 = aStringArray20[anInt3445];
					local81 = aStringArray20[anInt3445 + 1];
					local89 = anIntArray286[--anInt3450];
					Static216.method3997(Static251.aClass252_71);
					Static259.aClass1_Sub17_Sub2_1.method4451(Static115.method2266(local75) + Static115.method2266(local81) + 1);
					Static259.aClass1_Sub17_Sub2_1.method4464(local75);
					Static259.aClass1_Sub17_Sub2_1.method4464(local81);
					Static259.aClass1_Sub17_Sub2_1.method4451(local89);
					return;
				}
				if (arg0 == 5401) {
					anInt3450 -= 2;
					Static193.aShortArray71[anIntArray286[anInt3450]] = (short) Static264.method8226(anIntArray286[anInt3450 + 1]);
					Static181.aClass316_1.method8110();
					Static181.aClass316_1.method8105();
					Static358.aClass95_1.method2363();
					Static402.method6385();
					return;
				}
				if (arg0 == 5405) {
					anInt3450 -= 2;
					local157 = anIntArray286[anInt3450];
					local691 = anIntArray286[anInt3450 + 1];
					if (local157 >= 0 && local157 < 2) {
						Static26.anIntArrayArrayArray7[local157] = new int[local691 << 1][4];
					}
					return;
				}
				if (arg0 == 5406) {
					anInt3450 -= 7;
					local157 = anIntArray286[anInt3450];
					local691 = anIntArray286[anInt3450 + 1] << 1;
					local89 = anIntArray286[anInt3450 + 2];
					local95 = anIntArray286[anInt3450 + 3];
					local2712 = anIntArray286[anInt3450 + 4];
					@Pc(3132) int local3132 = anIntArray286[anInt3450 + 5];
					@Pc(3138) int local3138 = anIntArray286[anInt3450 + 6];
					if (local157 >= 0 && local157 < 2 && Static26.anIntArrayArrayArray7[local157] != null && local691 >= 0 && local691 < Static26.anIntArrayArrayArray7[local157].length) {
						Static26.anIntArrayArrayArray7[local157][local691] = new int[] { (local89 >> 14 & 0x3FFF) << 7, local95, (local89 & 0x3FFF) << 7, local3138 };
						Static26.anIntArrayArrayArray7[local157][local691 + 1] = new int[] { (local2712 >> 14 & 0x3FFF) << 7, local3132, (local2712 & 0x3FFF) << 7 };
					}
					return;
				}
				if (arg0 == 5407) {
					local157 = Static26.anIntArrayArrayArray7[anIntArray286[--anInt3450]].length >> 1;
					anIntArray286[anInt3450++] = local157;
					return;
				}
				if (arg0 == 5411) {
					if (Static189.aFrame1 != null) {
						Static487.method7514(Static286.aClass1_Sub15_Sub1_1.anInt7031, -1, -1, false);
					}
					if (Static306.aFrame2 != null) {
						Static141.method2640();
						System.exit(0);
						return;
					}
					local75 = Static290.aString130 == null ? Static445.method6905() : Static290.aString130;
					Static427.method6646(Static449.anInt7876 == 1, Static473.aClass229_14, local75, false);
					return;
				}
				if (arg0 == 5419) {
					local75 = "";
					if (Static399.aClass311_7 != null) {
						if (Static399.aClass311_7.anObject17 == null) {
							local75 = Static341.method5721(Static399.aClass311_7.anInt9168);
						} else {
							local75 = (String) Static399.aClass311_7.anObject17;
						}
					}
					aStringArray20[anInt3445++] = local75;
					return;
				}
				if (arg0 == 5420) {
					anIntArray286[anInt3450++] = Static380.anInt6743 == 3 ? 1 : 0;
					return;
				}
				if (arg0 == 5421) {
					if (Static189.aFrame1 != null) {
						Static487.method7514(Static286.aClass1_Sub15_Sub1_1.anInt7031, -1, -1, false);
					}
					local75 = aStringArray20[--anInt3445];
					local1375 = anIntArray286[--anInt3450] == 1;
					local163 = Static445.method6905() + local75;
					Static427.method6646(Static449.anInt7876 == 1, Static473.aClass229_14, local163, local1375);
					return;
				}
				if (arg0 == 5422) {
					anInt3445 -= 2;
					local75 = aStringArray20[anInt3445];
					local81 = aStringArray20[anInt3445 + 1];
					local89 = anIntArray286[--anInt3450];
					if (local75.length() > 0) {
						if (Static520.aStringArray39 == null) {
							Static520.aStringArray39 = new String[Static501.anIntArray831[Static332.aClass250_4.anInt7314]];
						}
						Static520.aStringArray39[local89] = local75;
					}
					if (local81.length() > 0) {
						if (Static486.aStringArray35 == null) {
							Static486.aStringArray35 = new String[Static501.anIntArray831[Static332.aClass250_4.anInt7314]];
						}
						Static486.aStringArray35[local89] = local81;
					}
					return;
				}
				if (arg0 == 5423) {
					System.out.println(aStringArray20[--anInt3445]);
					return;
				}
				if (arg0 == 5424) {
					anInt3450 -= 11;
					Static99.anInt2113 = anIntArray286[anInt3450];
					Static56.anInt1415 = anIntArray286[anInt3450 + 1];
					Static164.anInt3165 = anIntArray286[anInt3450 + 2];
					Static287.anInt7766 = anIntArray286[anInt3450 + 3];
					Static221.anInt4329 = anIntArray286[anInt3450 + 4];
					Static279.anInt2976 = anIntArray286[anInt3450 + 5];
					Static441.anInt7710 = anIntArray286[anInt3450 + 6];
					Static386.anInt8111 = anIntArray286[anInt3450 + 7];
					Static395.anInt6944 = anIntArray286[anInt3450 + 8];
					Static105.anInt2235 = anIntArray286[anInt3450 + 9];
					Static494.anInt8656 = anIntArray286[anInt3450 + 10];
					Static46.aClass69_14.method1896(Static221.anInt4329);
					Static46.aClass69_14.method1896(Static279.anInt2976);
					Static46.aClass69_14.method1896(Static441.anInt7710);
					Static46.aClass69_14.method1896(Static386.anInt8111);
					Static46.aClass69_14.method1896(Static395.anInt6944);
					Static304.aClass104_21 = null;
					Static179.aClass104_16 = null;
					Static296.aClass104_23 = null;
					Static508.aClass104_26 = null;
					Static448.aClass104_24 = null;
					Static198.aClass104_18 = null;
					Static63.aClass104_7 = null;
					Static542.aClass104_27 = null;
					Static242.aBoolean356 = true;
					return;
				}
				if (arg0 == 5425) {
					Static15.method527();
					Static242.aBoolean356 = false;
					return;
				}
				if (arg0 == 5426) {
					anInt3450 -= 2;
					Static449.anInt7879 = anIntArray286[anInt3450];
					Static92.anInt2926 = anIntArray286[anInt3450 + 1];
					return;
				}
				if (arg0 == 5427) {
					anInt3450 -= 2;
					Class1_Sub2_Sub1.anInt228 = anIntArray286[anInt3450 + 1];
					return;
				}
				if (arg0 == 5428) {
					anInt3450 -= 2;
					local157 = anIntArray286[anInt3450];
					local691 = anIntArray286[anInt3450 + 1];
					anIntArray286[anInt3450++] = Static167.method3163(local691, local157) ? 1 : 0;
					return;
				}
				if (arg0 == 5429) {
					Static141.method2638(false, aStringArray20[--anInt3445], false);
					return;
				}
				if (arg0 == 5430) {
					try {
						Static558.method7782("accountcreated", Static473.aClass229_14.anApplet1);
						return;
					} catch (@Pc(3667) Throwable local3667) {
						return;
					}
				}
				if (arg0 == 5431) {
					try {
						Static558.method7782("accountcreatestarted", Static473.aClass229_14.anApplet1);
						return;
					} catch (@Pc(3679) Throwable local3679) {
						return;
					}
				}
			} else if (arg0 < 5600) {
				if (arg0 == 5500) {
					anInt3450 -= 4;
					local157 = anIntArray286[anInt3450];
					local691 = anIntArray286[anInt3450 + 1];
					local89 = anIntArray286[anInt3450 + 2];
					local95 = anIntArray286[anInt3450 + 3];
					Static437.method4251((local157 & 0x3FFF) - Static282.anInt5380, local89, (local157 >> 14 & 0x3FFF) - Static538.anInt9485, false, local691, local95);
					return;
				}
				if (arg0 == 5501) {
					anInt3450 -= 4;
					local157 = anIntArray286[anInt3450];
					local691 = anIntArray286[anInt3450 + 1];
					local89 = anIntArray286[anInt3450 + 2];
					local95 = anIntArray286[anInt3450 + 3];
					Static446.method6922(local89, (local157 >> 14 & 0x3FFF) - Static538.anInt9485, local95, local691, (local157 & 0x3FFF) - Static282.anInt5380);
					return;
				}
				if (arg0 == 5502) {
					anInt3450 -= 6;
					local157 = anIntArray286[anInt3450];
					if (local157 >= 2) {
						throw new RuntimeException();
					}
					Static261.anInt5069 = local157;
					local691 = anIntArray286[anInt3450 + 1];
					if (local691 + 1 >= Static26.anIntArrayArrayArray7[Static261.anInt5069].length >> 1) {
						throw new RuntimeException();
					}
					Static523.anInt9228 = local691;
					Static333.anInt6232 = 0;
					Static543.anInt9603 = anIntArray286[anInt3450 + 2];
					Static375.anInt8464 = anIntArray286[anInt3450 + 3];
					local89 = anIntArray286[anInt3450 + 4];
					if (local89 >= 2) {
						throw new RuntimeException();
					}
					Static76.anInt1815 = local89;
					local95 = anIntArray286[anInt3450 + 5];
					if (local95 + 1 >= Static26.anIntArrayArrayArray7[Static76.anInt1815].length >> 1) {
						throw new RuntimeException();
					}
					Static150.anInt2984 = local95;
					Static170.anInt3418 = 3;
					return;
				}
				if (arg0 == 5503) {
					Static476.method7401();
					return;
				}
				if (arg0 == 5504) {
					anInt3450 -= 2;
					Static302.method8220(anIntArray286[anInt3450 + 1], anIntArray286[anInt3450]);
					return;
				}
				if (arg0 == 5505) {
					anIntArray286[anInt3450++] = (int) Static49.aFloat29 >> 3;
					return;
				}
				if (arg0 == 5506) {
					anIntArray286[anInt3450++] = (int) Static135.aFloat193 >> 3;
					return;
				}
				if (arg0 == 5507) {
					Static331.method5626();
					return;
				}
				if (arg0 == 5508) {
					Static316.method5452();
					return;
				}
				if (arg0 == 5509) {
					Static191.method8122();
					return;
				}
				if (arg0 == 5510) {
					Static419.method6569();
					return;
				}
				if (arg0 == 5511) {
					local157 = anIntArray286[--anInt3450];
					local691 = local157 >> 14 & 0x3FFF;
					local89 = local157 & 0x3FFF;
					local691 -= Static538.anInt9485;
					if (local691 < 0) {
						local691 = 0;
					} else if (local691 >= Static237.anInt4563) {
						local691 = Static237.anInt4563;
					}
					local89 -= Static282.anInt5380;
					if (local89 < 0) {
						local89 = 0;
					} else if (local89 >= Static373.anInt6694) {
						local89 = Static373.anInt6694;
					}
					Static341.anInt6297 = (local691 << 7) + 64;
					Static181.anInt3812 = (local89 << 7) + 64;
					Static170.anInt3418 = 4;
					return;
				}
				if (arg0 == 5512) {
					Static441.method6830();
					return;
				}
			} else if (arg0 < 5700) {
				if (arg0 == 5600) {
					anInt3445 -= 2;
					local75 = aStringArray20[anInt3445];
					local81 = aStringArray20[anInt3445 + 1];
					local89 = anIntArray286[--anInt3450];
					if (Static186.anInt3863 != 2) {
						return;
					}
					if (Static121.anInt2498 == 0 && Static186.anInt3864 == 0) {
						Static309.aString140 = local75;
						Static150.aString62 = local81;
						Static361.anInt6516 = local89;
						Static506.method7745(5);
						return;
					}
					return;
				}
				if (arg0 == 5601) {
					Static350.method5791();
					return;
				}
				if (arg0 == 5602) {
					if (Static121.anInt2498 == 0) {
						Static67.anInt1733 = -2;
						Static358.anInt6481 = -2;
					}
					return;
				}
				if (arg0 == 5603) {
					anInt3450 -= 4;
					if (Static186.anInt3863 != 2) {
						return;
					}
					if (Static121.anInt2498 == 0 && Static186.anInt3864 == 0) {
						Static76.method1747(anIntArray286[anInt3450], anIntArray286[anInt3450 + 3], anIntArray286[anInt3450 + 1], anIntArray286[anInt3450 + 2]);
						return;
					}
					return;
				}
				if (arg0 == 5604) {
					anInt3445--;
					if (Static186.anInt3863 != 2) {
						return;
					}
					if (Static121.anInt2498 == 0 && Static186.anInt3864 == 0) {
						Static352.method5801(Static140.method2622(aStringArray20[anInt3445]));
						return;
					}
					return;
				}
				if (arg0 == 5605) {
					anInt3445 -= 2;
					if (Static186.anInt3863 != 2) {
						return;
					}
					if (Static121.anInt2498 == 0 && Static186.anInt3864 == 0) {
						Static530.method8094(false, Static140.method2622(aStringArray20[anInt3445]), aStringArray20[anInt3445 + 1]);
						return;
					}
					return;
				}
				if (arg0 == 5606) {
					if (Static186.anInt3864 == 0) {
						Static121.anInt2497 = -2;
					}
					return;
				}
				if (arg0 == 5607) {
					anIntArray286[anInt3450++] = Static358.anInt6481;
					return;
				}
				if (arg0 == 5608) {
					anIntArray286[anInt3450++] = Static481.anInt6920;
					return;
				}
				if (arg0 == 5609) {
					anIntArray286[anInt3450++] = Static121.anInt2497;
					return;
				}
				if (arg0 == 5610) {
					for (local157 = 0; local157 < 5; local157++) {
						aStringArray20[anInt3445++] = Static192.aStringArray3.length > local157 ? Static520.method7933(Static192.aStringArray3[local157]) : "";
					}
					Static192.aStringArray3 = null;
					return;
				}
				if (arg0 == 5611) {
					anIntArray286[anInt3450++] = Static433.anInt7516;
					return;
				}
				if (arg0 == 5612) {
					local157 = anIntArray286[--anInt3450];
					if (Static186.anInt3863 != 6) {
						return;
					}
					if (Static121.anInt2498 == 0 && Static186.anInt3864 == 0) {
						if (Static200.aClass134_2 != null) {
							Static200.aClass134_2.method8116();
							Static200.aClass134_2 = null;
						}
						Static361.anInt6516 = local157;
						Static506.method7745(8);
						return;
					}
					return;
				}
				if (arg0 == 5613) {
					anIntArray286[anInt3450++] = Static358.anInt6481;
					return;
				}
				if (arg0 == 5615) {
					anInt3445 -= 2;
					local75 = aStringArray20[anInt3445];
					local81 = aStringArray20[anInt3445 + 1];
					if (Static186.anInt3863 != 2) {
						return;
					}
					if (Static121.anInt2498 == 0 && Static186.anInt3864 == 0) {
						if (Static200.aClass134_2 != null) {
							Static200.aClass134_2.method8116();
							Static200.aClass134_2 = null;
						}
						Static309.aString140 = local75;
						Static150.aString62 = local81;
						Static506.method7745(4);
						return;
					}
					return;
				}
				if (arg0 == 5616) {
					Static406.method6459(false);
					return;
				}
				if (arg0 == 5617) {
					anIntArray286[anInt3450++] = Static67.anInt1733;
					return;
				}
				if (arg0 == 5618) {
					local157 = anIntArray286[--anInt3450];
					Static408.method6498(false, local157);
					return;
				}
				if (arg0 == 5619) {
					local157 = anIntArray286[--anInt3450];
					Static408.method6498(true, local157);
					return;
				}
				if (arg0 == 5620) {
					Static453.method6979();
					if (Static260.aString112 != "" && Static260.aString112 != "") {
						anIntArray286[anInt3450++] = 1;
						return;
					}
					anIntArray286[anInt3450++] = 0;
					return;
				}
				if (arg0 == 5621) {
					anInt3445 -= 2;
					if (Static186.anInt3863 != 2) {
						return;
					}
					if (Static121.anInt2498 == 0 && Static186.anInt3864 == 0) {
						Static530.method8094(true, Static140.method2622(aStringArray20[anInt3445]), aStringArray20[anInt3445 + 1]);
						return;
					}
					return;
				}
				if (arg0 == 5622) {
					@Pc(4469) Class311 local4469 = Static473.aClass229_14.method6071("3", false);
					while (local4469.anInt9169 == 0) {
						Static265.method3147(1L);
					}
					if (local4469.anInt9169 == 2) {
						throw new RuntimeException("Error opening file");
					}
					@Pc(4489) Class208 local4489 = (Class208) local4469.anObject17;
					if (local4489.method5700().exists()) {
						@Pc(4499) Class1_Sub17 local4499 = new Class1_Sub17(50);
						try {
							local4489.method5701(0, local4499.aByteArray58, 50);
						} catch (@Pc(4508) IOException local4508) {
						}
					}
					try {
						local4489.method5704();
						return;
					} catch (@Pc(4514) Exception local4514) {
						return;
					}
				}
				if (arg0 == 5623) {
					if (Static396.aString177 != null) {
						anIntArray286[anInt3450++] = 1;
						return;
					}
					anIntArray286[anInt3450++] = 0;
					return;
				}
			} else if (arg0 < 6100) {
				if (arg0 == 6001) {
					local157 = anIntArray286[--anInt3450];
					if (local157 < 1) {
						local157 = 1;
					}
					if (local157 > 4) {
						local157 = 4;
					}
					Static286.aClass1_Sub15_Sub1_1.anInt7045 = local157;
					Static473.method7370();
					Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
					Static473.aBoolean625 = false;
					return;
				}
				if (arg0 == 6002) {
					Static286.aClass1_Sub15_Sub1_1.method6380(anIntArray286[--anInt3450] == 1);
					Static473.method7370();
					Static441.method6824();
					Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
					Static473.aBoolean625 = false;
					return;
				}
				if (arg0 == 6003) {
					Static286.aClass1_Sub15_Sub1_1.aBoolean537 = anIntArray286[--anInt3450] == 1;
					Static441.method6824();
					Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
					Static473.aBoolean625 = false;
					return;
				}
				if (arg0 == 6005) {
					Static286.aClass1_Sub15_Sub1_1.aBoolean531 = anIntArray286[--anInt3450] == 1;
					Static473.method7370();
					Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
					Static473.aBoolean625 = false;
					return;
				}
				if (arg0 == 6006) {
					Static286.aClass1_Sub15_Sub1_1.aBoolean533 = anIntArray286[--anInt3450] == 1;
					Static455.aClass4_11.method7160(!Static286.aClass1_Sub15_Sub1_1.aBoolean533);
					Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
					Static473.aBoolean625 = false;
					return;
				}
				if (arg0 == 6007) {
					Static286.aClass1_Sub15_Sub1_1.anInt7034 = anIntArray286[--anInt3450];
					Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
					Static473.aBoolean625 = false;
					return;
				}
				if (arg0 == 6008) {
					Static286.aClass1_Sub15_Sub1_1.aBoolean536 = anIntArray286[--anInt3450] == 1;
					Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
					Static473.aBoolean625 = false;
					return;
				}
				if (arg0 == 6009) {
					Static286.aClass1_Sub15_Sub1_1.aBoolean525 = anIntArray286[--anInt3450] == 1;
					Static473.method7370();
					Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
					Static473.aBoolean625 = false;
					return;
				}
				if (arg0 == 6010) {
					Static286.aClass1_Sub15_Sub1_1.aBoolean530 = anIntArray286[--anInt3450] == 1;
					Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
					Static473.aBoolean625 = false;
					return;
				}
				if (arg0 == 6011) {
					local157 = anIntArray286[--anInt3450];
					if (local157 < 0 || local157 > 2) {
						local157 = 0;
					}
					Static286.aClass1_Sub15_Sub1_1.method6360(local157, Static449.anInt7876);
					Static473.method7370();
					Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
					Static473.aBoolean625 = false;
					return;
				}
				if (arg0 == 6012) {
					Static286.aClass1_Sub15_Sub1_1.method6363(Static449.anInt7876, anIntArray286[--anInt3450] == 1);
					Static449.method6959();
					Static22.method601();
					Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
					Static473.aBoolean625 = false;
					return;
				}
				if (arg0 == 6014) {
					Static286.aClass1_Sub15_Sub1_1.aBoolean532 = anIntArray286[--anInt3450] == 1;
					Static473.method7370();
					Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
					Static473.aBoolean625 = false;
					return;
				}
				if (arg0 == 6015) {
					Static286.aClass1_Sub15_Sub1_1.aBoolean523 = anIntArray286[--anInt3450] == 1;
					Static473.method7370();
					Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
					Static473.aBoolean625 = false;
					return;
				}
				if (arg0 == 6016) {
					local157 = anIntArray286[--anInt3450];
					if (local157 < 0 || local157 > 2) {
						local157 = 0;
					}
					Static286.aClass1_Sub15_Sub1_1.anInt7032 = local157;
					Static124.method2356(Static449.anInt7876);
					Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
					return;
				}
				if (arg0 == 6017) {
					Static286.aClass1_Sub15_Sub1_1.aBoolean521 = anIntArray286[--anInt3450] == 1;
					Static525.method8029();
					Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
					Static473.aBoolean625 = false;
					return;
				}
				if (arg0 == 6018) {
					local157 = anIntArray286[--anInt3450];
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 127) {
						local157 = 127;
					}
					Static286.aClass1_Sub15_Sub1_1.anInt7030 = local157;
					Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
					Static473.aBoolean625 = false;
					return;
				}
				if (arg0 == 6019) {
					local157 = anIntArray286[--anInt3450];
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 255) {
						local157 = 255;
					}
					if (local157 != Static286.aClass1_Sub15_Sub1_1.anInt7042) {
						if (Static286.aClass1_Sub15_Sub1_1.anInt7042 == 0 && Static261.anInt5068 != -1) {
							Static127.method2441(local157, Static261.anInt5068, Static521.aClass69_96);
							Static410.aBoolean568 = false;
						} else if (local157 == 0) {
							Static70.method1697();
							Static410.aBoolean568 = false;
						} else {
							Static69.method1694(local157);
						}
						Static286.aClass1_Sub15_Sub1_1.anInt7042 = local157;
					}
					Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
					Static473.aBoolean625 = false;
					return;
				}
				if (arg0 == 6020) {
					local157 = anIntArray286[--anInt3450];
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 127) {
						local157 = 127;
					}
					Static286.aClass1_Sub15_Sub1_1.anInt7037 = local157;
					Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
					Static473.aBoolean625 = false;
					return;
				}
				if (arg0 == 6021) {
					Static286.aClass1_Sub15_Sub1_1.aBoolean539 = anIntArray286[--anInt3450] == 1;
					Static441.method6824();
					return;
				}
				if (arg0 == 6023) {
					local157 = anIntArray286[--anInt3450];
					local1375 = false;
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 2) {
						local157 = 2;
					}
					if (Static520.anInt9181 < 96) {
						local157 = 0;
						local1375 = true;
					}
					Static511.method7828(local157);
					Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
					Static473.aBoolean625 = false;
					anIntArray286[anInt3450++] = local1375 ? 0 : 1;
					return;
				}
				if (arg0 == 6024) {
					local157 = anIntArray286[--anInt3450];
					if (local157 < 0 || local157 > 2) {
						local157 = 0;
					}
					Static286.aClass1_Sub15_Sub1_1.anInt7029 = local157;
					Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
					return;
				}
				if (arg0 == 6025) {
					local157 = anIntArray286[--anInt3450];
					if (local157 < 0 || local157 > Static427.method6649(Static520.anInt9181)) {
						local157 = 0;
					}
					Static286.aClass1_Sub15_Sub1_1.anInt7036 = local157;
					Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
					Static473.aBoolean625 = false;
					return;
				}
				if (arg0 == 6027) {
					local157 = anIntArray286[--anInt3450];
					if (local157 < 0 || local157 > 1) {
						local157 = 0;
					}
					Static164.method2944(local157 == 1);
					return;
				}
				if (arg0 == 6028) {
					Static286.aClass1_Sub15_Sub1_1.aBoolean535 = anIntArray286[--anInt3450] != 0;
					Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
					return;
				}
				if (arg0 == 6029) {
					Static286.aClass1_Sub15_Sub1_1.anInt7034 = anIntArray286[--anInt3450];
					Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
					return;
				}
				if (arg0 == 6030) {
					Static286.aClass1_Sub15_Sub1_1.aBoolean534 = anIntArray286[--anInt3450] != 0;
					Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
					Static473.method7370();
					return;
				}
				if (arg0 == 6031) {
					local157 = anIntArray286[--anInt3450];
					if (local157 < 0 || local157 > 5) {
						local157 = 2;
					}
					Static124.method2356(local157);
					return;
				}
				if (arg0 == 6032) {
					local157 = anIntArray286[--anInt3450];
					if (local157 < 0 || local157 > 5) {
						local157 = 2;
					}
					Static286.aClass1_Sub15_Sub1_1.anInt7039 = local157;
					Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
					Static473.aBoolean625 = false;
					return;
				}
				if (arg0 == 6033) {
					local157 = anIntArray286[--anInt3450];
					if (local157 < 0 || local157 > 4) {
						local157 = 2;
					}
					Static286.aClass1_Sub15_Sub1_1.anInt7051 = local157;
					Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
					return;
				}
				if (arg0 == 6034) {
					Static286.aClass1_Sub15_Sub1_1.aBoolean527 = anIntArray286[--anInt3450] == 1;
					Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
					Static449.method6959();
					Static473.aBoolean625 = false;
					return;
				}
				if (arg0 == 6035) {
					Static286.aClass1_Sub15_Sub1_1.aBoolean542 = anIntArray286[--anInt3450] == 1;
					Static473.method7370();
					Static441.method6824();
					return;
				}
			} else if (arg0 < 6200) {
				if (arg0 == 6101) {
					anIntArray286[anInt3450++] = Static286.aClass1_Sub15_Sub1_1.anInt7045;
					return;
				}
				if (arg0 == 6102) {
					anIntArray286[anInt3450++] = Static286.aClass1_Sub15_Sub1_1.method6371(Static449.anInt7876) ? 1 : 0;
					return;
				}
				if (arg0 == 6103) {
					anIntArray286[anInt3450++] = Static286.aClass1_Sub15_Sub1_1.aBoolean537 ? 1 : 0;
					return;
				}
				if (arg0 == 6105) {
					anIntArray286[anInt3450++] = Static286.aClass1_Sub15_Sub1_1.aBoolean531 ? 1 : 0;
					return;
				}
				if (arg0 == 6106) {
					anIntArray286[anInt3450++] = Static286.aClass1_Sub15_Sub1_1.aBoolean533 ? 1 : 0;
					return;
				}
				if (arg0 == 6107) {
					anIntArray286[anInt3450++] = Static286.aClass1_Sub15_Sub1_1.anInt7034;
					return;
				}
				if (arg0 == 6108) {
					anIntArray286[anInt3450++] = Static286.aClass1_Sub15_Sub1_1.aBoolean536 ? 1 : 0;
					return;
				}
				if (arg0 == 6109) {
					anIntArray286[anInt3450++] = Static286.aClass1_Sub15_Sub1_1.aBoolean525 ? 1 : 0;
					return;
				}
				if (arg0 == 6110) {
					anIntArray286[anInt3450++] = Static286.aClass1_Sub15_Sub1_1.aBoolean530 ? 1 : 0;
					return;
				}
				if (arg0 == 6111) {
					anIntArray286[anInt3450++] = Static286.aClass1_Sub15_Sub1_1.method6358(Static449.anInt7876);
					return;
				}
				if (arg0 == 6112) {
					anIntArray286[anInt3450++] = Static286.aClass1_Sub15_Sub1_1.method6361(Static449.anInt7876) ? 1 : 0;
					return;
				}
				if (arg0 == 6114) {
					anIntArray286[anInt3450++] = Static286.aClass1_Sub15_Sub1_1.aBoolean532 ? 1 : 0;
					return;
				}
				if (arg0 == 6115) {
					anIntArray286[anInt3450++] = Static286.aClass1_Sub15_Sub1_1.aBoolean523 ? 1 : 0;
					return;
				}
				if (arg0 == 6116) {
					anIntArray286[anInt3450++] = Static286.aClass1_Sub15_Sub1_1.anInt7032;
					return;
				}
				if (arg0 == 6117) {
					anIntArray286[anInt3450++] = Static286.aClass1_Sub15_Sub1_1.aBoolean521 ? 1 : 0;
					return;
				}
				if (arg0 == 6118) {
					anIntArray286[anInt3450++] = Static286.aClass1_Sub15_Sub1_1.anInt7030;
					return;
				}
				if (arg0 == 6119) {
					anIntArray286[anInt3450++] = Static286.aClass1_Sub15_Sub1_1.anInt7042;
					return;
				}
				if (arg0 == 6120) {
					anIntArray286[anInt3450++] = Static286.aClass1_Sub15_Sub1_1.anInt7037;
					return;
				}
				if (arg0 == 6121) {
					anIntArray286[anInt3450++] = Static455.aClass4_11.method7183() ? 1 : 0;
					return;
				}
				if (arg0 == 6123) {
					anIntArray286[anInt3450++] = Static421.method6581();
					return;
				}
				if (arg0 == 6124) {
					anIntArray286[anInt3450++] = Static286.aClass1_Sub15_Sub1_1.anInt7029;
					return;
				}
				if (arg0 == 6125) {
					anIntArray286[anInt3450++] = Static286.aClass1_Sub15_Sub1_1.anInt7036;
					return;
				}
				if (arg0 == 6126) {
					anIntArray286[anInt3450++] = Static455.aClass4_11.method7209() ? 1 : 0;
					return;
				}
				if (arg0 == 6127) {
					anIntArray286[anInt3450++] = Static286.aClass1_Sub15_Sub1_1.aBoolean520 ? 1 : 0;
					return;
				}
				if (arg0 == 6128) {
					anIntArray286[anInt3450++] = Static286.aClass1_Sub15_Sub1_1.aBoolean535 ? 1 : 0;
					return;
				}
				if (arg0 == 6129) {
					anIntArray286[anInt3450++] = Static286.aClass1_Sub15_Sub1_1.anInt7034;
					return;
				}
				if (arg0 == 6130) {
					anIntArray286[anInt3450++] = Static286.aClass1_Sub15_Sub1_1.aBoolean534 ? 1 : 0;
					return;
				}
				if (arg0 == 6131) {
					anIntArray286[anInt3450++] = Static449.anInt7876;
					return;
				}
				if (arg0 == 6132) {
					anIntArray286[anInt3450++] = Static286.aClass1_Sub15_Sub1_1.anInt7039;
					return;
				}
				if (arg0 == 6133) {
					anIntArray286[anInt3450++] = Static380.anInt6743 == 1 || Static380.anInt6743 == 4 ? 1 : 0;
					return;
				}
				if (arg0 == 6134) {
					anIntArray286[anInt3450++] = Static427.method6649(Static520.anInt9181);
					return;
				}
				if (arg0 == 6135) {
					anIntArray286[anInt3450++] = Static286.aClass1_Sub15_Sub1_1.anInt7051;
					return;
				}
				if (arg0 == 6136) {
					anIntArray286[anInt3450++] = Static286.aClass1_Sub15_Sub1_1.aBoolean527 ? 1 : 0;
					return;
				}
				if (arg0 == 6137) {
					@Pc(5927) boolean local5927 = true;
					try {
						local5927 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(5937) Throwable local5937) {
					}
					anIntArray286[anInt3450++] = local5927 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6300) {
				if (arg0 == 6200) {
					anInt3450 -= 2;
					Static297.aShort66 = (short) anIntArray286[anInt3450];
					if (Static297.aShort66 <= 0) {
						Static297.aShort66 = 256;
					}
					Static481.aShort88 = (short) anIntArray286[anInt3450 + 1];
					if (Static481.aShort88 <= 0) {
						Static481.aShort88 = 205;
					}
					return;
				}
				if (arg0 == 6201) {
					anInt3450 -= 2;
					Static419.aShort95 = (short) anIntArray286[anInt3450];
					if (Static419.aShort95 <= 0) {
						Static419.aShort95 = 256;
					}
					Static402.aShort90 = (short) anIntArray286[anInt3450 + 1];
					if (Static402.aShort90 <= 0) {
						Static402.aShort90 = 320;
					}
					return;
				}
				if (arg0 == 6202) {
					anInt3450 -= 4;
					Static262.aShort58 = (short) anIntArray286[anInt3450];
					if (Static262.aShort58 <= 0) {
						Static262.aShort58 = 1;
					}
					Static107.aShort25 = (short) anIntArray286[anInt3450 + 1];
					if (Static107.aShort25 <= 0) {
						Static107.aShort25 = 32767;
					} else if (Static107.aShort25 < Static262.aShort58) {
						Static107.aShort25 = Static262.aShort58;
					}
					Static532.aShort127 = (short) anIntArray286[anInt3450 + 2];
					if (Static532.aShort127 <= 0) {
						Static532.aShort127 = 1;
					}
					Static543.aShort129 = (short) anIntArray286[anInt3450 + 3];
					if (Static543.aShort129 <= 0) {
						Static543.aShort129 = 32767;
						return;
					}
					if (Static543.aShort129 < Static532.aShort127) {
						Static543.aShort129 = Static532.aShort127;
					}
					return;
				}
				if (arg0 == 6203) {
					Static320.method5479(Static400.aClass91_12.anInt2378, false, 0, Static400.aClass91_12.anInt2399, 0);
					anIntArray286[anInt3450++] = Static519.anInt2068;
					anIntArray286[anInt3450++] = Static369.anInt6640;
					return;
				}
				if (arg0 == 6204) {
					anIntArray286[anInt3450++] = Static419.aShort95;
					anIntArray286[anInt3450++] = Static402.aShort90;
					return;
				}
				if (arg0 == 6205) {
					anIntArray286[anInt3450++] = Static297.aShort66;
					anIntArray286[anInt3450++] = Static481.aShort88;
					return;
				}
			} else if (arg0 < 6400) {
				if (arg0 == 6300) {
					anIntArray286[anInt3450++] = (int) (Static110.method2222() / 60000L);
					return;
				}
				if (arg0 == 6301) {
					anIntArray286[anInt3450++] = (int) (Static110.method2222() / 86400000L) - 11745;
					return;
				}
				if (arg0 == 6302) {
					anInt3450 -= 3;
					local157 = anIntArray286[anInt3450];
					local691 = anIntArray286[anInt3450 + 1];
					local89 = anIntArray286[anInt3450 + 2];
					aCalendar1.clear();
					aCalendar1.set(11, 12);
					aCalendar1.set(local89, local691, local157);
					local95 = (int) (aCalendar1.getTime().getTime() / 86400000L) - 11745;
					if (local89 < 1970) {
						local95--;
					}
					anIntArray286[anInt3450++] = local95;
					return;
				}
				if (arg0 == 6303) {
					aCalendar1.clear();
					aCalendar1.setTime(new Date(Static110.method2222()));
					anIntArray286[anInt3450++] = aCalendar1.get(1);
					return;
				}
				if (arg0 == 6304) {
					local157 = anIntArray286[--anInt3450];
					local1375 = true;
					if (local157 < 0) {
						local1375 = (local157 + 1) % 4 == 0;
					} else if (local157 < 1582) {
						local1375 = local157 % 4 == 0;
					} else if (local157 % 4 != 0) {
						local1375 = false;
					} else if (local157 % 100 != 0) {
						local1375 = true;
					} else if (local157 % 400 != 0) {
						local1375 = false;
					}
					anIntArray286[anInt3450++] = local1375 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6500) {
				if (arg0 == 6405) {
					anIntArray286[anInt3450++] = Static175.method3237() ? 1 : 0;
					return;
				}
				if (arg0 == 6406) {
					anIntArray286[anInt3450++] = Static6.method372() ? 1 : 0;
					return;
				}
			} else if (arg0 < 6600) {
				if (arg0 == 6500) {
					if (Static186.anInt3863 == 6 && Static121.anInt2498 == 0 && Static186.anInt3864 == 0) {
						if (Static42.aBoolean101) {
							anIntArray286[anInt3450++] = 0;
							return;
						}
						if (Static62.aLong39 > Static110.method2222() - 1000L) {
							anIntArray286[anInt3450++] = 1;
							return;
						}
						Static42.aBoolean101 = true;
						Static216.method3997(Static463.aClass252_123);
						Static259.aClass1_Sub17_Sub2_1.method4489(Static75.anInt1799);
						anIntArray286[anInt3450++] = 0;
						return;
					}
					anIntArray286[anInt3450++] = 1;
					return;
				}
				@Pc(6470) Class211 local6470;
				@Pc(6437) Class38_Sub1 local6437;
				if (arg0 == 6501) {
					local6437 = Static328.method5597();
					if (local6437 != null) {
						anIntArray286[anInt3450++] = local6437.anInt5576;
						anIntArray286[anInt3450++] = local6437.anInt5571;
						aStringArray20[anInt3445++] = local6437.aString133;
						local6470 = local6437.method5119();
						anIntArray286[anInt3450++] = local6470.anInt6295;
						aStringArray20[anInt3445++] = local6470.aString151;
						anIntArray286[anInt3450++] = local6437.anInt5568;
						anIntArray286[anInt3450++] = local6437.anInt5577;
						aStringArray20[anInt3445++] = local6437.aString132;
						return;
					}
					anIntArray286[anInt3450++] = -1;
					anIntArray286[anInt3450++] = 0;
					aStringArray20[anInt3445++] = "";
					anIntArray286[anInt3450++] = 0;
					aStringArray20[anInt3445++] = "";
					anIntArray286[anInt3450++] = 0;
					anIntArray286[anInt3450++] = 0;
					aStringArray20[anInt3445++] = "";
					return;
				}
				if (arg0 == 6502) {
					local6437 = Static114.method2240();
					if (local6437 != null) {
						anIntArray286[anInt3450++] = local6437.anInt5576;
						anIntArray286[anInt3450++] = local6437.anInt5571;
						aStringArray20[anInt3445++] = local6437.aString133;
						local6470 = local6437.method5119();
						anIntArray286[anInt3450++] = local6470.anInt6295;
						aStringArray20[anInt3445++] = local6470.aString151;
						anIntArray286[anInt3450++] = local6437.anInt5568;
						anIntArray286[anInt3450++] = local6437.anInt5577;
						aStringArray20[anInt3445++] = local6437.aString132;
						return;
					}
					anIntArray286[anInt3450++] = -1;
					anIntArray286[anInt3450++] = 0;
					aStringArray20[anInt3445++] = "";
					anIntArray286[anInt3450++] = 0;
					aStringArray20[anInt3445++] = "";
					anIntArray286[anInt3450++] = 0;
					anIntArray286[anInt3450++] = 0;
					aStringArray20[anInt3445++] = "";
					return;
				}
				if (arg0 == 6503) {
					local157 = anIntArray286[--anInt3450];
					local81 = aStringArray20[--anInt3445];
					if (Static186.anInt3863 == 6 && Static121.anInt2498 == 0 && Static186.anInt3864 == 0) {
						anIntArray286[anInt3450++] = Static360.method5866(local81, local157) ? 1 : 0;
						return;
					}
					anIntArray286[anInt3450++] = 0;
					return;
				}
				if (arg0 == 6504) {
					Static286.aClass1_Sub15_Sub1_1.anInt7033 = anIntArray286[--anInt3450];
					Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
					return;
				}
				if (arg0 == 6505) {
					anIntArray286[anInt3450++] = Static286.aClass1_Sub15_Sub1_1.anInt7033;
					return;
				}
				if (arg0 == 6506) {
					local157 = anIntArray286[--anInt3450];
					@Pc(6827) Class38_Sub1 local6827 = Static430.method8163(local157);
					if (local6827 != null) {
						anIntArray286[anInt3450++] = local6827.anInt5571;
						aStringArray20[anInt3445++] = local6827.aString133;
						@Pc(6851) Class211 local6851 = local6827.method5119();
						anIntArray286[anInt3450++] = local6851.anInt6295;
						aStringArray20[anInt3445++] = local6851.aString151;
						anIntArray286[anInt3450++] = local6827.anInt5568;
						anIntArray286[anInt3450++] = local6827.anInt5577;
						aStringArray20[anInt3445++] = local6827.aString132;
						return;
					}
					anIntArray286[anInt3450++] = -1;
					aStringArray20[anInt3445++] = "";
					anIntArray286[anInt3450++] = 0;
					aStringArray20[anInt3445++] = "";
					anIntArray286[anInt3450++] = 0;
					anIntArray286[anInt3450++] = 0;
					aStringArray20[anInt3445++] = "";
					return;
				}
				if (arg0 == 6507) {
					anInt3450 -= 4;
					local157 = anIntArray286[anInt3450];
					local1375 = anIntArray286[anInt3450 + 1] == 1;
					local89 = anIntArray286[anInt3450 + 2];
					local1986 = anIntArray286[anInt3450 + 3] == 1;
					Static302.method8214(local157, local1986, local1375, local89);
					return;
				}
				if (arg0 == 6508) {
					Static75.method1732();
					return;
				}
				if (arg0 == 6509) {
					if (Static186.anInt3863 != 6) {
						return;
					}
					Static19.aBoolean21 = anIntArray286[--anInt3450] == 1;
					return;
				}
				if (arg0 == 6510) {
					anIntArray286[anInt3450++] = Static460.anInt7963;
					return;
				}
			} else if (arg0 < 6700) {
				if (arg0 == 6600) {
					Static286.aClass1_Sub15_Sub1_1.aBoolean528 = anIntArray286[--anInt3450] == 1;
					Static286.aClass1_Sub15_Sub1_1.method6376(Static473.aClass229_14);
					return;
				}
				if (arg0 == 6601) {
					anIntArray286[anInt3450++] = Static286.aClass1_Sub15_Sub1_1.aBoolean528 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6800 && Static362.aClass174_9 == Static483.aClass174_10) {
				if (arg0 == 6700) {
					local157 = Static362.aClass230_45.method6138();
					if (Static328.anInt6167 != -1) {
						local157++;
					}
					anIntArray286[anInt3450++] = local157;
					return;
				}
				if (arg0 == 6701) {
					local157 = anIntArray286[--anInt3450];
					if (Static328.anInt6167 != -1) {
						if (local157 == 0) {
							anIntArray286[anInt3450++] = Static328.anInt6167;
							return;
						}
						local157--;
					}
					@Pc(7138) Class1_Sub35 local7138 = (Class1_Sub35) Static362.aClass230_45.method6137();
					while (local157-- > 0) {
						local7138 = (Class1_Sub35) Static362.aClass230_45.method6140();
					}
					anIntArray286[anInt3450++] = local7138.anInt5502;
					return;
				}
				if (arg0 == 6702) {
					local157 = anIntArray286[--anInt3450];
					if (Static511.aClass91ArrayArray2[local157] == null) {
						aStringArray20[anInt3445++] = "";
						return;
					}
					local81 = Static511.aClass91ArrayArray2[local157][0].aString50;
					if (local81 == null) {
						aStringArray20[anInt3445++] = "";
						return;
					}
					aStringArray20[anInt3445++] = local81.substring(0, local81.indexOf(58));
					return;
				}
				if (arg0 == 6703) {
					local157 = anIntArray286[--anInt3450];
					if (Static511.aClass91ArrayArray2[local157] == null) {
						anIntArray286[anInt3450++] = 0;
						return;
					}
					anIntArray286[anInt3450++] = Static511.aClass91ArrayArray2[local157].length;
					return;
				}
				if (arg0 == 6704) {
					anInt3450 -= 2;
					local157 = anIntArray286[anInt3450];
					local691 = anIntArray286[anInt3450 + 1];
					if (Static511.aClass91ArrayArray2[local157] == null) {
						aStringArray20[anInt3445++] = "";
						return;
					}
					local163 = Static511.aClass91ArrayArray2[local157][local691].aString50;
					if (local163 == null) {
						aStringArray20[anInt3445++] = "";
						return;
					}
					aStringArray20[anInt3445++] = local163;
					return;
				}
				if (arg0 == 6705) {
					anInt3450 -= 2;
					local157 = anIntArray286[anInt3450];
					local691 = anIntArray286[anInt3450 + 1];
					if (Static511.aClass91ArrayArray2[local157] == null) {
						anIntArray286[anInt3450++] = 0;
						return;
					}
					anIntArray286[anInt3450++] = Static511.aClass91ArrayArray2[local157][local691].anInt2410;
					return;
				}
				if (arg0 == 6706) {
					return;
				}
				if (arg0 == 6707) {
					anInt3450 -= 3;
					local157 = anIntArray286[anInt3450];
					local691 = anIntArray286[anInt3450 + 1];
					local89 = anIntArray286[anInt3450 + 2];
					Static465.method7075(1, "", local157 << 16 | local691, local89);
					return;
				}
				if (arg0 == 6708) {
					anInt3450 -= 3;
					local157 = anIntArray286[anInt3450];
					local691 = anIntArray286[anInt3450 + 1];
					local89 = anIntArray286[anInt3450 + 2];
					Static465.method7075(2, "", local157 << 16 | local691, local89);
					return;
				}
				if (arg0 == 6709) {
					anInt3450 -= 3;
					local157 = anIntArray286[anInt3450];
					local691 = anIntArray286[anInt3450 + 1];
					local89 = anIntArray286[anInt3450 + 2];
					Static465.method7075(3, "", local157 << 16 | local691, local89);
					return;
				}
				if (arg0 == 6710) {
					anInt3450 -= 3;
					local157 = anIntArray286[anInt3450];
					local691 = anIntArray286[anInt3450 + 1];
					local89 = anIntArray286[anInt3450 + 2];
					Static465.method7075(4, "", local157 << 16 | local691, local89);
					return;
				}
				if (arg0 == 6711) {
					anInt3450 -= 3;
					local157 = anIntArray286[anInt3450];
					local691 = anIntArray286[anInt3450 + 1];
					local89 = anIntArray286[anInt3450 + 2];
					Static465.method7075(5, "", local157 << 16 | local691, local89);
					return;
				}
				if (arg0 == 6712) {
					anInt3450 -= 3;
					local157 = anIntArray286[anInt3450];
					local691 = anIntArray286[anInt3450 + 1];
					local89 = anIntArray286[anInt3450 + 2];
					Static465.method7075(6, "", local157 << 16 | local691, local89);
					return;
				}
				if (arg0 == 6713) {
					anInt3450 -= 3;
					local157 = anIntArray286[anInt3450];
					local691 = anIntArray286[anInt3450 + 1];
					local89 = anIntArray286[anInt3450 + 2];
					Static465.method7075(7, "", local157 << 16 | local691, local89);
					return;
				}
				if (arg0 == 6714) {
					anInt3450 -= 3;
					local157 = anIntArray286[anInt3450];
					local691 = anIntArray286[anInt3450 + 1];
					local89 = anIntArray286[anInt3450 + 2];
					Static465.method7075(8, "", local157 << 16 | local691, local89);
					return;
				}
				if (arg0 == 6715) {
					anInt3450 -= 3;
					local157 = anIntArray286[anInt3450];
					local691 = anIntArray286[anInt3450 + 1];
					local89 = anIntArray286[anInt3450 + 2];
					Static465.method7075(9, "", local157 << 16 | local691, local89);
					return;
				}
				if (arg0 == 6716) {
					anInt3450 -= 3;
					local157 = anIntArray286[anInt3450];
					local691 = anIntArray286[anInt3450 + 1];
					local89 = anIntArray286[anInt3450 + 2];
					Static465.method7075(10, "", local157 << 16 | local691, local89);
					return;
				}
				if (arg0 == 6717) {
					anInt3450 -= 3;
					local157 = anIntArray286[anInt3450];
					local691 = anIntArray286[anInt3450 + 1];
					local89 = anIntArray286[anInt3450 + 2];
					@Pc(7726) Class91 local7726 = Static429.method6657(local157 << 16 | local691, local89);
					Static417.method6564();
					@Pc(7731) Class1_Sub9 local7731 = Static63.method1580(local7726);
					Static37.method1113(local7731.method1741(), local7731.anInt1812, local7726);
					return;
				}
			} else if (arg0 < 6900) {
				@Pc(7759) Class65 local7759;
				if (arg0 == 6800) {
					local157 = anIntArray286[--anInt3450];
					local7759 = Static193.aClass32_2.method1129(local157);
					if (local7759.aString37 == null) {
						aStringArray20[anInt3445++] = "";
						return;
					}
					aStringArray20[anInt3445++] = local7759.aString37;
					return;
				}
				if (arg0 == 6801) {
					local157 = anIntArray286[--anInt3450];
					local7759 = Static193.aClass32_2.method1129(local157);
					anIntArray286[anInt3450++] = local7759.anInt1903;
					return;
				}
				if (arg0 == 6802) {
					local157 = anIntArray286[--anInt3450];
					local7759 = Static193.aClass32_2.method1129(local157);
					anIntArray286[anInt3450++] = local7759.anInt1920;
					return;
				}
				if (arg0 == 6803) {
					local157 = anIntArray286[--anInt3450];
					local7759 = Static193.aClass32_2.method1129(local157);
					anIntArray286[anInt3450++] = local7759.anInt1915;
					return;
				}
				if (arg0 == 6804) {
					anInt3450 -= 2;
					local157 = anIntArray286[anInt3450];
					local691 = anIntArray286[anInt3450 + 1];
					@Pc(7881) Class53 local7881 = Static440.aClass266_1.method6930(local691);
					if (local7881.method1652()) {
						aStringArray20[anInt3445++] = Static193.aClass32_2.method1129(local157).method1820(local691, local7881.aString31);
						return;
					}
					anIntArray286[anInt3450++] = Static193.aClass32_2.method1129(local157).method1824(local7881.anInt1685, local691);
					return;
				}
			} else if (arg0 < 7000) {
				if (arg0 == 6900) {
					anIntArray286[anInt3450++] = Static498.aBoolean656 && !Static353.aBoolean479 ? 1 : 0;
					return;
				}
				if (arg0 == 6901) {
					anIntArray286[anInt3450++] = Static538.anInt9478;
					return;
				}
				if (arg0 == 6902) {
					anIntArray286[anInt3450++] = Static472.anInt8397;
					return;
				}
				if (arg0 == 6903) {
					anIntArray286[anInt3450++] = Static210.anInt4145;
					return;
				}
				if (arg0 == 6904) {
					anIntArray286[anInt3450++] = Static531.anInt9392;
					return;
				}
				if (arg0 == 6905) {
					local75 = "";
					if (Static399.aClass311_7 != null) {
						if (Static399.aClass311_7.anObject17 == null) {
							local75 = Static341.method5721(Static399.aClass311_7.anInt9168);
						} else {
							local75 = (String) Static399.aClass311_7.anObject17;
						}
					}
					aStringArray20[anInt3445++] = local75;
					return;
				}
				if (arg0 == 6906) {
					anIntArray286[anInt3450++] = Static421.anInt7327;
					return;
				}
				if (arg0 == 6907) {
					anIntArray286[anInt3450++] = Static79.anInt1856;
					return;
				}
				if (arg0 == 6908) {
					anIntArray286[anInt3450++] = Static226.anInt4369;
					return;
				}
				if (arg0 == 6909) {
					anIntArray286[anInt3450++] = Static250.aBoolean368 ? 1 : 0;
					return;
				}
				if (arg0 == 6910) {
					anIntArray286[anInt3450++] = Static172.anInt3437;
					return;
				}
			} else if (arg0 < 7100) {
				if (arg0 == 7000) {
					local157 = Static286.aClass1_Sub15_Sub1_1.method6364();
					anIntArray286[anInt3450++] = Static286.aClass1_Sub15_Sub1_1.anInt7064 = Static449.anInt7876;
					anIntArray286[anInt3450++] = local157;
					Static473.method7370();
					return;
				}
				if (arg0 == 7001) {
					Static286.aClass1_Sub15_Sub1_1.method6382();
					Static473.method7370();
					return;
				}
				if (arg0 == 7002) {
					Static286.aClass1_Sub15_Sub1_1.method6368();
					Static473.method7370();
					return;
				}
				if (arg0 == 7003) {
					Static286.aClass1_Sub15_Sub1_1.method6374();
					Static473.method7370();
					return;
				}
				if (arg0 == 7004) {
					Static286.aClass1_Sub15_Sub1_1.method6365();
					Static473.method7370();
					return;
				}
				if (arg0 == 7005) {
					Static286.aClass1_Sub15_Sub1_1.anInt7048 = 0;
					return;
				}
				if (arg0 == 7006) {
					if (Static286.aClass1_Sub15_Sub1_1.anInt7064 == 2) {
						Static286.aClass1_Sub15_Sub1_1.aBoolean541 = true;
						return;
					}
					if (Static286.aClass1_Sub15_Sub1_1.anInt7064 == 1) {
						Static286.aClass1_Sub15_Sub1_1.aBoolean540 = true;
						return;
					}
					if (Static286.aClass1_Sub15_Sub1_1.anInt7064 == 3) {
						Static286.aClass1_Sub15_Sub1_1.aBoolean538 = true;
					}
					return;
				}
				if (arg0 == 7007) {
					anIntArray286[anInt3450++] = Static286.aClass1_Sub15_Sub1_1.anInt7048;
					return;
				}
				if (arg0 == 7008) {
					if (Static449.anInt7876 == 0 && Static520.anInt9181 < 96) {
						anIntArray286[anInt3450++] = 2;
						return;
					}
					anIntArray286[anInt3450++] = 4;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "()V")
	public static void method3219() {
	}
}
