import java.awt.event.ActionEvent;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!la", name = "e", descriptor = "I")
	public static int anInt1575;

	@OriginalMember(owner = "client!la", name = "j", descriptor = "Lclient!of;")
	public static Class1_Sub17 aClass1_Sub17_43;

	@OriginalMember(owner = "client!la", name = "q", descriptor = "I")
	public static int anInt1581;

	@OriginalMember(owner = "client!la", name = "y", descriptor = "I")
	public static int anInt1585;

	@OriginalMember(owner = "client!la", name = "z", descriptor = "Lclient!kb;")
	public static Class41 aClass41_10;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "I")
	public static int anInt1572 = -1;

	@OriginalMember(owner = "client!la", name = "v", descriptor = "Lclient!af;")
	private static Class5 aClass5_800 = Static45.method1937("Error connecting to server)3");

	@OriginalMember(owner = "client!la", name = "c", descriptor = "Lclient!af;")
	public static Class5 aClass5_797 = aClass5_800;

	@OriginalMember(owner = "client!la", name = "k", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!la", name = "m", descriptor = "I")
	public static volatile int anInt1579 = 0;

	@OriginalMember(owner = "client!la", name = "t", descriptor = "Lclient!af;")
	private static Class5 aClass5_799 = Static45.method1937("Unable to find ");

	@OriginalMember(owner = "client!la", name = "r", descriptor = "Lclient!af;")
	public static Class5 aClass5_798 = aClass5_799;

	@OriginalMember(owner = "client!la", name = "B", descriptor = "I")
	public static int anInt1586 = 0;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III[Lclient!of;IIZII)V")
	public static void method1205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub17[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		for (@Pc(20) int local20 = 0; local20 < arg3.length; local20++) {
			@Pc(26) Class1_Sub17 local26 = arg3[local20];
			if (local26 != null && (!local26.aBoolean89 || local26.anInt2271 == 0 || local26.aBoolean78 || Static6.method221(local26) != 0 || local26 == Static64.aClass1_Sub17_42) && arg2 == local26.anInt2292 && (!local26.aBoolean89 || !Static24.method540(local26))) {
				@Pc(68) int local68 = arg1 + local26.anInt2279;
				@Pc(73) int local73 = local26.anInt2267 + arg5;
				if (Static72.aClass1_Sub17_45 == local26) {
					Static73.anInt1686 = local73;
					Static76.aBoolean62 = true;
					Static20.anInt653 = local68;
				}
				@Pc(88) int local88;
				@Pc(92) int local92;
				@Pc(94) int local94;
				@Pc(90) int local90;
				@Pc(168) int local168;
				if (local26.anInt2271 == 2) {
					local88 = arg7;
					local90 = arg4;
					local92 = arg6;
					local94 = arg0;
				} else {
					@Pc(131) int local131;
					@Pc(119) int local119;
					if (local26.anInt2271 == 9) {
						local119 = local73;
						local131 = local68;
						@Pc(149) int local149 = local26.anInt2305 + local68;
						if (local68 > local149) {
							local131 = local149;
							local149 = local68;
						}
						local149++;
						local168 = local26.anInt2293 + local73;
						if (local73 > local168) {
							local119 = local168;
							local168 = local73;
						}
						local92 = arg6 >= local119 ? arg6 : local119;
						local94 = local149 < arg0 ? local149 : arg0;
						local168++;
						local88 = local131 > arg7 ? local131 : arg7;
						local90 = arg4 <= local168 ? arg4 : local168;
					} else {
						local88 = local68 <= arg7 ? arg7 : local68;
						local92 = local73 > arg6 ? local73 : arg6;
						local119 = local26.anInt2293 + local73;
						local90 = local119 < arg4 ? local119 : arg4;
						local131 = local26.anInt2305 + local68;
						local94 = arg0 > local131 ? local131 : arg0;
					}
				}
				if (!local26.aBoolean89 || local88 < local94 && local90 > local92) {
					if (local26.anInt2291 == 1337) {
						Static119.method2161(local26);
					} else if (local26.anInt2291 == 1338) {
						Static47.method833(local68, local73);
					} else {
						if (local26.anInt2271 == 0) {
							if (!local26.aBoolean89 && Static24.method540(local26) && local26 != aClass1_Sub17_43) {
								continue;
							}
							method1205(local94, local68 - local26.anInt2245, local26.anInt2248, arg3, local90, local73 - local26.anInt2273, local92, local88);
							if (local26.aClass1_Sub17Array1 != null) {
								method1205(local94, local68 - local26.anInt2245, local26.anInt2248, local26.aClass1_Sub17Array1, local90, local73 - local26.anInt2273, local92, local88);
							}
							@Pc(321) Class1_Sub5 local321 = (Class1_Sub5) Static66.aClass7_14.method287((long) local26.anInt2248);
							if (local321 != null) {
								Static117.method2221(local92, local90, local94, local321.anInt862, local73, local68, local88);
							}
						}
						if (local26.aBoolean89) {
							@Pc(362) boolean local362;
							if (local88 <= Static98.anInt2407 && Static97.anInt2395 >= local92 && Static98.anInt2407 < local94 && local90 > Static97.anInt2395) {
								local362 = true;
							} else {
								local362 = false;
							}
							@Pc(368) boolean local368 = false;
							@Pc(370) boolean local370 = false;
							if (Static12.anInt3243 == 1 && Static9.anInt280 >= local88 && local92 <= Static97.anInt2390 && local94 > Static9.anInt280 && local90 > Static97.anInt2390) {
								local368 = true;
							}
							if (Static85.anInt2157 == 1 && local362) {
								local370 = true;
							}
							if (local368) {
								Static71.method1229(local26, Static9.anInt280 - local68, Static97.anInt2390 + -local73);
							}
							if (Static72.aClass1_Sub17_45 != null && local26 != Static72.aClass1_Sub17_45 && local362 && Static78.method1369(Static6.method221(local26))) {
								Static3.aClass1_Sub17_5 = local26;
							}
							if (Static64.aClass1_Sub17_42 == local26) {
								Static109.anInt2694 = local73;
								Static38.anInt974 = local68;
								Static93.aBoolean90 = true;
							}
							if (local26.aBoolean78) {
								@Pc(453) Class1_Sub6 local453;
								if (local362 && Static120.anInt1843 != 0 && local26.anObjectArray7 != null) {
									local453 = new Class1_Sub6();
									local453.anObjectArray1 = local26.anObjectArray7;
									local453.anInt973 = Static120.anInt1843;
									local453.aClass1_Sub17_26 = local26;
									Static8.aClass53_3.method1449(local453);
								}
								if (Static72.aClass1_Sub17_45 != null || Static69.aBoolean48) {
									local370 = false;
									local362 = false;
									local368 = false;
								}
								if (!local26.aBoolean88 && local368) {
									local26.aBoolean88 = true;
									if (local26.anObjectArray23 != null) {
										local453 = new Class1_Sub6();
										local453.anInt973 = Static97.anInt2390 - local73;
										local453.anObjectArray1 = local26.anObjectArray23;
										local453.anInt978 = Static9.anInt280 - local68;
										local453.aClass1_Sub17_26 = local26;
										Static8.aClass53_3.method1449(local453);
									}
								}
								if (local26.aBoolean88 && local370 && local26.anObjectArray9 != null) {
									local453 = new Class1_Sub6();
									local453.anObjectArray1 = local26.anObjectArray9;
									local453.anInt978 = Static98.anInt2407 - local68;
									local453.aClass1_Sub17_26 = local26;
									local453.anInt973 = Static97.anInt2395 - local73;
									Static8.aClass53_3.method1449(local453);
								}
								if (local26.aBoolean88 && !local370) {
									local26.aBoolean88 = false;
									if (local26.anObjectArray20 != null) {
										local453 = new Class1_Sub6();
										local453.anInt978 = Static98.anInt2407 - local68;
										local453.anObjectArray1 = local26.anObjectArray20;
										local453.anInt973 = Static97.anInt2395 - local73;
										local453.aClass1_Sub17_26 = local26;
										Static11.aClass53_5.method1449(local453);
									}
								}
								if (local370 && local26.anObjectArray14 != null) {
									local453 = new Class1_Sub6();
									local453.anInt973 = Static97.anInt2395 - local73;
									local453.aClass1_Sub17_26 = local26;
									local453.anObjectArray1 = local26.anObjectArray14;
									local453.anInt978 = Static98.anInt2407 - local68;
									Static8.aClass53_3.method1449(local453);
								}
								if (!local26.aBoolean81 && local362) {
									local26.aBoolean81 = true;
									if (local26.anObjectArray16 != null) {
										local453 = new Class1_Sub6();
										local453.anInt973 = Static97.anInt2395 - local73;
										local453.anInt978 = Static98.anInt2407 - local68;
										local453.anObjectArray1 = local26.anObjectArray16;
										local453.aClass1_Sub17_26 = local26;
										Static8.aClass53_3.method1449(local453);
									}
								}
								if (local26.aBoolean81 && local362 && local26.anObjectArray13 != null) {
									local453 = new Class1_Sub6();
									local453.aClass1_Sub17_26 = local26;
									local453.anInt978 = Static98.anInt2407 - local68;
									local453.anObjectArray1 = local26.anObjectArray13;
									local453.anInt973 = Static97.anInt2395 - local73;
									Static8.aClass53_3.method1449(local453);
								}
								if (local26.aBoolean81 && !local362) {
									local26.aBoolean81 = false;
									if (local26.anObjectArray6 != null) {
										local453 = new Class1_Sub6();
										local453.aClass1_Sub17_26 = local26;
										local453.anObjectArray1 = local26.anObjectArray6;
										local453.anInt973 = Static97.anInt2395 - local73;
										local453.anInt978 = Static98.anInt2407 - local68;
										Static11.aClass53_5.method1449(local453);
									}
								}
								if (local26.anObjectArray3 != null) {
									local453 = new Class1_Sub6();
									local453.aClass1_Sub17_26 = local26;
									local453.anObjectArray1 = local26.anObjectArray3;
									Static122.aClass53_16.method1449(local453);
								}
								if (Static23.aBoolean23 && local26.anObjectArray26 != null) {
									local453 = new Class1_Sub6();
									local453.aClass1_Sub17_26 = local26;
									local453.anObjectArray1 = local26.anObjectArray26;
									Static8.aClass53_3.method1449(local453);
								}
								@Pc(807) int local807;
								@Pc(809) int local809;
								@Pc(825) Class1_Sub6 local825;
								if (local26.anObjectArray8 != null && Static98.anInt2411 > local26.anInt2311) {
									if (local26.anIntArray345 == null || Static98.anInt2411 - local26.anInt2311 > 32) {
										local453 = new Class1_Sub6();
										local453.aClass1_Sub17_26 = local26;
										local453.anObjectArray1 = local26.anObjectArray8;
										Static8.aClass53_3.method1449(local453);
									} else {
										label388: for (local168 = local26.anInt2311; local168 < Static98.anInt2411; local168++) {
											local807 = Static100.anIntArray379[local168 & 0x1F];
											for (local809 = 0; local809 < local26.anIntArray345.length; local809++) {
												if (local26.anIntArray345[local809] == local807) {
													local825 = new Class1_Sub6();
													local825.aClass1_Sub17_26 = local26;
													local825.anObjectArray1 = local26.anObjectArray8;
													Static8.aClass53_3.method1449(local825);
													break label388;
												}
											}
										}
									}
									local26.anInt2311 = Static98.anInt2411;
								}
								if (local26.anObjectArray15 != null && Static9.anInt284 > local26.anInt2257) {
									if (local26.anIntArray343 == null || Static9.anInt284 - local26.anInt2257 > 32) {
										local453 = new Class1_Sub6();
										local453.aClass1_Sub17_26 = local26;
										local453.anObjectArray1 = local26.anObjectArray15;
										Static8.aClass53_3.method1449(local453);
									} else {
										label364: for (local168 = local26.anInt2257; local168 < Static9.anInt284; local168++) {
											local807 = Static36.anIntArray164[local168 & 0x1F];
											for (local809 = 0; local809 < local26.anIntArray343.length; local809++) {
												if (local26.anIntArray343[local809] == local807) {
													local825 = new Class1_Sub6();
													local825.anObjectArray1 = local26.anObjectArray15;
													local825.aClass1_Sub17_26 = local26;
													Static8.aClass53_3.method1449(local825);
													break label364;
												}
											}
										}
									}
									local26.anInt2257 = Static9.anInt284;
								}
								if (local26.anObjectArray5 != null && local26.anInt2246 < Static116.anInt2899) {
									if (local26.anIntArray349 == null || Static116.anInt2899 - local26.anInt2246 > 32) {
										local453 = new Class1_Sub6();
										local453.anObjectArray1 = local26.anObjectArray5;
										local453.aClass1_Sub17_26 = local26;
										Static8.aClass53_3.method1449(local453);
									} else {
										label340: for (local168 = local26.anInt2246; local168 < Static116.anInt2899; local168++) {
											local807 = Static54.anIntArray215[local168 & 0x1F];
											for (local809 = 0; local809 < local26.anIntArray349.length; local809++) {
												if (local807 == local26.anIntArray349[local809]) {
													local825 = new Class1_Sub6();
													local825.aClass1_Sub17_26 = local26;
													local825.anObjectArray1 = local26.anObjectArray5;
													Static8.aClass53_3.method1449(local825);
													break label340;
												}
											}
										}
									}
									local26.anInt2246 = Static116.anInt2899;
								}
								if (local26.anInt2263 < Static59.anInt1397 && local26.anObjectArray21 != null) {
									local453 = new Class1_Sub6();
									local453.anObjectArray1 = local26.anObjectArray21;
									local453.aClass1_Sub17_26 = local26;
									Static8.aClass53_3.method1449(local453);
								}
								if (local26.anInt2263 < Static83.anInt2119 && local26.anObjectArray24 != null) {
									local453 = new Class1_Sub6();
									local453.anObjectArray1 = local26.anObjectArray24;
									local453.aClass1_Sub17_26 = local26;
									Static8.aClass53_3.method1449(local453);
								}
								if (local26.anInt2263 < Static120.anInt1845 && local26.anObjectArray11 != null) {
									local453 = new Class1_Sub6();
									local453.anObjectArray1 = local26.anObjectArray11;
									local453.aClass1_Sub17_26 = local26;
									Static8.aClass53_3.method1449(local453);
								}
								if (Static127.anInt3246 > local26.anInt2263 && local26.anObjectArray25 != null) {
									local453 = new Class1_Sub6();
									local453.anObjectArray1 = local26.anObjectArray25;
									local453.aClass1_Sub17_26 = local26;
									Static8.aClass53_3.method1449(local453);
								}
								local26.anInt2263 = Static60.anInt1441;
								if (local26.anObjectArray10 != null) {
									for (local168 = 0; local168 < Static40.anInt1050; local168++) {
										@Pc(1148) Class1_Sub6 local1148 = new Class1_Sub6();
										local1148.aClass1_Sub17_26 = local26;
										local1148.anInt982 = Static2.anIntArray13[local168];
										local1148.anInt985 = Static47.anIntArray194[local168];
										local1148.anObjectArray1 = local26.anObjectArray10;
										Static8.aClass53_3.method1449(local1148);
									}
								}
							}
						}
						if (!local26.aBoolean89) {
							if ((local26.anInt2285 >= 0 || local26.anInt2272 != 0) && Static98.anInt2407 >= local88 && local92 <= Static97.anInt2395 && Static98.anInt2407 < local94 && local90 > Static97.anInt2395) {
								if (local26.anInt2285 < 0) {
									aClass1_Sub17_43 = local26;
								} else {
									aClass1_Sub17_43 = arg3[local26.anInt2285];
								}
							}
							if (local26.anInt2271 == 8 && Static98.anInt2407 >= local88 && Static97.anInt2395 >= local92 && Static98.anInt2407 < local94 && local90 > Static97.anInt2395) {
								Static117.aClass1_Sub17_74 = local26;
							}
							if (local26.anInt2270 > local26.anInt2293) {
								Static87.method2232(local26, local68 + local26.anInt2305, Static97.anInt2395, local73, local26.anInt2270, local26.anInt2293, Static98.anInt2407);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V")
	public static void method1206() {
		for (@Pc(3) int local3 = -1; local3 < Static111.anInt2739; local3++) {
			@Pc(11) int local11;
			if (local3 == -1) {
				local11 = 2047;
			} else {
				local11 = Static77.anIntArray299[local3];
			}
			@Pc(21) Class1_Sub3_Sub4_Sub2_Sub1 local21 = Static17.aClass1_Sub3_Sub4_Sub2_Sub1Array1[local11];
			if (local21 != null) {
				Static36.method681(1, local21);
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IB)Z")
	public static boolean method1207(@OriginalArg(0) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
	public static void method1208() {
		aClass1_Sub17_43 = null;
		aClass5_799 = null;
		aClass5_798 = null;
		aCalendar1 = null;
		aClass5_800 = null;
		aClass41_10 = null;
		aClass5_797 = null;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!oc;BLjava/lang/Object;)V")
	public static void method1209(@OriginalArg(0) Class55 arg0, @OriginalArg(2) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg0.anEventQueue1.peekEvent() != null; local11++) {
			Static70.method1226(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}
}
