import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!hd", name = "vb", descriptor = "I")
	public static int anInt1395;

	@OriginalMember(owner = "client!hd", name = "Bb", descriptor = "I")
	public static int anInt1396;

	@OriginalMember(owner = "client!hd", name = "sb", descriptor = "Lclient!a;")
	public static Class1 aClass1_1373 = Static94.method1596(":duelreq:");

	@OriginalMember(owner = "client!hd", name = "ub", descriptor = "[Lclient!wb;")
	public static Class68[] aClass68Array1 = new Class68[13];

	@OriginalMember(owner = "client!hd", name = "Ab", descriptor = "Lclient!a;")
	private static Class1 aClass1_1376 = Static94.method1596("scroll:");

	@OriginalMember(owner = "client!hd", name = "wb", descriptor = "Lclient!a;")
	public static Class1 aClass1_1374 = aClass1_1376;

	@OriginalMember(owner = "client!hd", name = "xb", descriptor = "Lclient!cb;")
	public static Class11 aClass11_13 = new Class11(64);

	@OriginalMember(owner = "client!hd", name = "yb", descriptor = "Lclient!a;")
	private static Class1 aClass1_1375 = Static94.method1596("Enter name:");

	@OriginalMember(owner = "client!hd", name = "Eb", descriptor = "Lclient!a;")
	public static Class1 aClass1_1377 = aClass1_1375;

	@OriginalMember(owner = "client!hd", name = "Fb", descriptor = "Lclient!a;")
	public static Class1 aClass1_1378 = Static94.method1596("@yel@*V");

	@OriginalMember(owner = "client!hd", name = "Jb", descriptor = "I")
	public static int anInt1402 = 0;

	@OriginalMember(owner = "client!hd", name = "Kb", descriptor = "I")
	public static int anInt1403 = 0;

	@OriginalMember(owner = "client!hd", name = "Pb", descriptor = "Lclient!a;")
	public static Class1 aClass1_1379 = Static94.method1596(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!hd", name = "Rb", descriptor = "Lclient!a;")
	private static Class1 aClass1_1381 = Static94.method1596("From");

	@OriginalMember(owner = "client!hd", name = "Qb", descriptor = "Lclient!a;")
	public static Class1 aClass1_1380 = aClass1_1381;

	@OriginalMember(owner = "client!hd", name = "Vb", descriptor = "Lclient!a;")
	private static Class1 aClass1_1385 = Static94.method1596("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!hd", name = "Sb", descriptor = "Lclient!a;")
	public static Class1 aClass1_1382 = aClass1_1385;

	@OriginalMember(owner = "client!hd", name = "Tb", descriptor = "Lclient!a;")
	private static Class1 aClass1_1383 = Static94.method1596("Error connecting to server)3");

	@OriginalMember(owner = "client!hd", name = "Ub", descriptor = "Lclient!a;")
	public static Class1 aClass1_1384 = aClass1_1383;

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(Z)V")
	public static void method959() {
		aClass1_1383 = null;
		aClass1_1377 = null;
		aClass1_1373 = null;
		aClass1_1381 = null;
		aClass1_1385 = null;
		aClass1_1378 = null;
		aClass1_1374 = null;
		aClass68Array1 = null;
		aClass1_1380 = null;
		aClass1_1376 = null;
		aClass1_1384 = null;
		aClass11_13 = null;
		aClass1_1379 = null;
		aClass1_1382 = null;
		aClass1_1375 = null;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIBIII)Z")
	public static boolean method960(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		return Static113.method1524(arg0) ? Static17.method496(arg2, 0, 0, 0, -1, arg1, arg3, 0, Static98.aClass2_Sub1_Sub14ArrayArray1[arg0]) : false;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IILclient!fe;)V")
	public static void method961(@OriginalArg(2) Class2_Sub3_Sub1 arg0) {
		while (true) {
			@Pc(14) Class2_Sub11 local14 = (Class2_Sub11) Static89.aClass46_9.method1435();
			if (local14 == null) {
				return;
			}
			@Pc(19) boolean local19 = false;
			for (@Pc(21) int local21 = 0; local21 < local14.anInt2545; local21++) {
				if (local14.aClass18Array2[local21] != null) {
					if (local14.aClass18Array2[local21].anInt1028 == 2) {
						local14.anIntArray314[local21] = -5;
					}
					if (local14.aClass18Array2[local21].anInt1028 == 0) {
						local19 = true;
					}
				}
				if (local14.aClass18Array1[local21] != null) {
					if (local14.aClass18Array1[local21].anInt1028 == 2) {
						local14.anIntArray314[local21] = -6;
					}
					if (local14.aClass18Array1[local21].anInt1028 == 0) {
						local19 = true;
					}
				}
			}
			if (local19) {
				return;
			}
			arg0.method841(205);
			arg0.method788(0);
			@Pc(98) int local98 = arg0.anInt1168;
			arg0.method829(local14.anInt2547);
			for (@Pc(105) int local105 = 0; local105 < local14.anInt2545; local105++) {
				if (local14.anIntArray314[local105] == 0) {
					try {
						@Pc(129) int local129 = local14.anIntArray313[local105];
						@Pc(138) Field local138;
						@Pc(142) int local142;
						if (local129 == 0) {
							local138 = (Field) local14.aClass18Array2[local105].anObject3;
							local142 = local138.getInt(null);
							arg0.method788(0);
							arg0.method829(local142);
						} else if (local129 == 1) {
							local138 = (Field) local14.aClass18Array2[local105].anObject3;
							local138.setInt(null, local14.anIntArray315[local105]);
							arg0.method788(0);
						} else if (local129 == 2) {
							local138 = (Field) local14.aClass18Array2[local105].anObject3;
							local142 = local138.getModifiers();
							arg0.method788(0);
							arg0.method829(local142);
						}
						@Pc(215) Method local215;
						if (local129 == 3) {
							local215 = (Method) local14.aClass18Array1[local105].anObject3;
							@Pc(240) byte[][] local240 = local14.aByteArrayArrayArray7[local105];
							@Pc(244) Object[] local244 = new Object[local240.length];
							for (@Pc(246) int local246 = 0; local246 < local240.length; local246++) {
								@Pc(258) ObjectInputStream local258 = new ObjectInputStream(new ByteArrayInputStream(local240[local246]));
								local244[local246] = local258.readObject();
							}
							@Pc(277) Object local277 = local215.invoke(null, local244);
							if (local277 == null) {
								arg0.method788(0);
							} else if (local277 instanceof Number) {
								arg0.method788(1);
								arg0.method804(((Number) local277).longValue());
							} else if (local277 instanceof Class1) {
								arg0.method788(2);
								arg0.method828((Class1) local277);
							} else {
								arg0.method788(4);
							}
						} else if (local129 == 4) {
							local215 = (Method) local14.aClass18Array1[local105].anObject3;
							local142 = local215.getModifiers();
							arg0.method788(0);
							arg0.method829(local142);
						}
					} catch (@Pc(320) ClassNotFoundException local320) {
						arg0.method788(-10);
					} catch (@Pc(326) InvalidClassException local326) {
						arg0.method788(-11);
					} catch (@Pc(332) StreamCorruptedException local332) {
						arg0.method788(-12);
					} catch (@Pc(338) OptionalDataException local338) {
						arg0.method788(-13);
					} catch (@Pc(344) IllegalAccessException local344) {
						arg0.method788(-14);
					} catch (@Pc(350) IllegalArgumentException local350) {
						arg0.method788(-15);
					} catch (@Pc(356) InvocationTargetException local356) {
						arg0.method788(-16);
					} catch (@Pc(362) SecurityException local362) {
						arg0.method788(-17);
					} catch (@Pc(368) IOException local368) {
						arg0.method788(-18);
					} catch (@Pc(374) NullPointerException local374) {
						arg0.method788(-19);
					} catch (@Pc(380) Exception local380) {
						arg0.method788(-20);
					} catch (@Pc(386) Throwable local386) {
						arg0.method788(-21);
					}
				} else {
					arg0.method788(local14.anIntArray314[local105]);
				}
			}
			arg0.method796(local98);
			arg0.method802(arg0.anInt1168 - local98);
			local14.method1820();
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)I")
	public static int method962(@OriginalArg(0) int arg0) {
		@Pc(3) Class2_Sub1_Sub6 local3 = Static62.method1298(arg0);
		@Pc(15) int local15 = local3.anInt1136;
		@Pc(18) int local18 = local3.anInt1127;
		@Pc(21) int local21 = local3.anInt1134;
		@Pc(27) int local27 = Class4_Sub1.anIntArray40[local15 - local21];
		return Static94.anIntArray295[local18] >> local21 & local27;
	}

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)V")
	public static void method963() {
		Static34.aClass11_11.method435();
		Static112.aClass11_28.method435();
	}

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "(I)V")
	public static void method964() {
		while (Static62.method1297()) {
			if (Static111.anInt2784 != -1 && Static111.anInt2784 == Static111.anInt2781) {
				if (Static96.anInt2469 == 85 && Static111.aClass1_2890.method10() > 0) {
					Static111.aClass1_2890 = Static111.aClass1_2890.method19(0, Static111.aClass1_2890.method10() - 1);
				}
				if ((Static95.method1611(Static98.anInt2514) || Static98.anInt2514 == 32) && Static111.aClass1_2890.method10() < 12) {
					Static111.aClass1_2890 = Static111.aClass1_2890.method21(Static98.anInt2514);
				}
			} else {
				@Pc(119) int local119;
				if (Static32.aBoolean54) {
					if (Static96.anInt2469 == 85 && Static111.aClass1_2897.method10() > 0) {
						Static111.aClass1_2897 = Static111.aClass1_2897.method19(0, Static111.aClass1_2897.method10() - 1);
						Static87.aBoolean137 = true;
					}
					if (Static2.method121(Static98.anInt2514) && Static111.aClass1_2897.method10() < 80) {
						Static111.aClass1_2897 = Static111.aClass1_2897.method21(Static98.anInt2514);
						Static87.aBoolean137 = true;
					}
					if (Static96.anInt2469 == 84) {
						Static32.aBoolean54 = false;
						Static87.aBoolean137 = true;
						@Pc(867) long local867;
						if (Static65.anInt1941 == 1) {
							local867 = Static111.aClass1_2897.method9();
							Static64.method1329(local867);
						}
						if (Static65.anInt1941 == 2 && Static51.anInt1703 > 0) {
							local867 = Static111.aClass1_2897.method9();
							Static55.method488(local867);
						}
						if (Static65.anInt1941 == 3 && Static111.aClass1_2897.method10() > 0) {
							Static59.aClass2_Sub3_Sub1_2.method841(207);
							Static59.aClass2_Sub3_Sub1_2.method788(0);
							local119 = Static59.aClass2_Sub3_Sub1_2.anInt1168;
							Static59.aClass2_Sub3_Sub1_2.method804(Static31.aLong31);
							Static4.method194(Static111.aClass1_2897, Static59.aClass2_Sub3_Sub1_2);
							Static59.aClass2_Sub3_Sub1_2.method802(Static59.aClass2_Sub3_Sub1_2.anInt1168 - local119);
							if (Static6.anInt409 == 2) {
								Static6.anInt409 = 1;
								Static13.aBoolean20 = true;
								Static59.aClass2_Sub3_Sub1_2.method841(32);
								Static59.aClass2_Sub3_Sub1_2.method788(Static63.anInt1889);
								Static59.aClass2_Sub3_Sub1_2.method788(Static6.anInt409);
								Static59.aClass2_Sub3_Sub1_2.method788(Static96.anInt2420);
							}
						}
						if (Static65.anInt1941 == 4 && Static71.anInt1968 < 100) {
							local867 = Static111.aClass1_2897.method9();
							Static27.method727(local867);
						}
						if (Static65.anInt1941 == 5 && Static71.anInt1968 > 0) {
							local867 = Static111.aClass1_2897.method9();
							Static50.method1107(local867);
						}
					}
				} else if (Static95.anInt2396 == 1) {
					if (Static96.anInt2469 == 85 && Static111.aClass1_2886.method10() > 0) {
						Static111.aClass1_2886 = Static111.aClass1_2886.method19(0, Static111.aClass1_2886.method10() - 1);
						Static87.aBoolean137 = true;
					}
					if (Static111.method1804(Static98.anInt2514) && Static111.aClass1_2886.method10() < 10) {
						Static111.aClass1_2886 = Static111.aClass1_2886.method21(Static98.anInt2514);
						Static87.aBoolean137 = true;
					}
					if (Static96.anInt2469 == 84) {
						if (Static111.aClass1_2886.method10() > 0) {
							local119 = 0;
							if (Static111.aClass1_2886.method33()) {
								local119 = Static111.aClass1_2886.method3();
							}
							Static59.aClass2_Sub3_Sub1_2.method841(238);
							Static59.aClass2_Sub3_Sub1_2.method829(local119);
						}
						Static87.aBoolean137 = true;
						Static95.anInt2396 = 0;
					}
				} else if (Static95.anInt2396 == 2) {
					if (Static96.anInt2469 == 85 && Static111.aClass1_2886.method10() > 0) {
						Static111.aClass1_2886 = Static111.aClass1_2886.method19(0, Static111.aClass1_2886.method10() - 1);
						Static87.aBoolean137 = true;
					}
					if ((Static95.method1611(Static98.anInt2514) || Static98.anInt2514 == 32) && Static111.aClass1_2886.method10() < 12) {
						Static111.aClass1_2886 = Static111.aClass1_2886.method21(Static98.anInt2514);
						Static87.aBoolean137 = true;
					}
					if (Static96.anInt2469 == 84) {
						if (Static111.aClass1_2886.method10() > 0) {
							Static59.aClass2_Sub3_Sub1_2.method841(86);
							Static59.aClass2_Sub3_Sub1_2.method804(Static111.aClass1_2886.method9());
						}
						Static95.anInt2396 = 0;
						Static87.aBoolean137 = true;
					}
				} else if (Static95.anInt2396 == 3) {
					if (Static96.anInt2469 == 85 && Static111.aClass1_2886.method10() > 0) {
						Static111.aClass1_2886 = Static111.aClass1_2886.method19(0, Static111.aClass1_2886.method10() - 1);
						Static87.aBoolean137 = true;
					}
					if (Static2.method121(Static98.anInt2514) && Static111.aClass1_2886.method10() < 40) {
						Static111.aClass1_2886 = Static111.aClass1_2886.method21(Static98.anInt2514);
						Static87.aBoolean137 = true;
					}
				} else if (Static72.anInt1978 == -1 && Static37.anInt1369 == -1) {
					if (Static96.anInt2469 == 85 && Static111.aClass1_2894.method10() > 0) {
						Static111.aClass1_2894 = Static111.aClass1_2894.method19(0, Static111.aClass1_2894.method10() - 1);
						Static87.aBoolean137 = true;
					}
					if (Static2.method121(Static98.anInt2514) && Static111.aClass1_2894.method10() < 80) {
						Static111.aClass1_2894 = Static111.aClass1_2894.method21(Static98.anInt2514);
						Static87.aBoolean137 = true;
					}
					if (Static96.anInt2469 == 84 && Static111.aClass1_2894.method10() > 0) {
						if (Static32.anInt1240 == 2) {
							if (Static111.aClass1_2894.method5(Static94.aClass1_2469)) {
								Static98.method1659();
							}
							if (Static111.aClass1_2894.method5(Static20.aClass1_838)) {
								Static32.aBoolean55 = true;
							}
							if (Static111.aClass1_2894.method5(Static100.aClass1_2676)) {
								Static32.aBoolean55 = false;
							}
							if (Static111.aClass1_2894.method5(Static25.aClass1_995)) {
								for (local119 = 0; local119 < 4; local119++) {
									for (@Pc(292) int local292 = 1; local292 < 103; local292++) {
										for (@Pc(296) int local296 = 1; local296 < 103; local296++) {
											Static84.aClass5Array1[local119].anIntArrayArray3[local292][local296] = 0;
										}
									}
								}
							}
							if (Static111.aClass1_2894.method5(Static83.aClass1_2340) && Static73.anInt1985 == 2) {
								throw new RuntimeException();
							}
							if (Static111.aClass1_2894.method5(Static6.aClass1_291)) {
								Static31.aBoolean52 = true;
							}
						}
						if (Static111.aClass1_2894.method26(Static60.aClass1_1852)) {
							Static59.aClass2_Sub3_Sub1_2.method841(248);
							Static59.aClass2_Sub3_Sub1_2.method788(Static111.aClass1_2894.method10() - 1);
							Static59.aClass2_Sub3_Sub1_2.method828(Static111.aClass1_2894.method1(2));
						} else {
							@Pc(349) byte local349 = 0;
							@Pc(357) Class1 local357 = Static111.aClass1_2894.method30();
							@Pc(359) byte local359 = 0;
							if (local357.method26(Static80.aClass1_2266)) {
								local359 = 0;
								Static111.aClass1_2894 = Static111.aClass1_2894.method1(Static80.aClass1_2266.method10());
							} else if (local357.method26(Static8.aClass1_425)) {
								Static111.aClass1_2894 = Static111.aClass1_2894.method1(Static8.aClass1_425.method10());
								local359 = 1;
							} else if (local357.method26(Static2.aClass1_260)) {
								local359 = 2;
								Static111.aClass1_2894 = Static111.aClass1_2894.method1(Static2.aClass1_260.method10());
							} else if (local357.method26(Static76.aClass1_2143)) {
								local359 = 3;
								Static111.aClass1_2894 = Static111.aClass1_2894.method1(Static76.aClass1_2143.method10());
							} else if (local357.method26(Static1.aClass1_8)) {
								local359 = 4;
								Static111.aClass1_2894 = Static111.aClass1_2894.method1(Static1.aClass1_8.method10());
							} else if (local357.method26(Static69.aClass1_2921)) {
								Static111.aClass1_2894 = Static111.aClass1_2894.method1(Static69.aClass1_2921.method10());
								local359 = 5;
							} else if (local357.method26(Static72.aClass1_2041)) {
								local359 = 6;
								Static111.aClass1_2894 = Static111.aClass1_2894.method1(Static72.aClass1_2041.method10());
							} else if (local357.method26(Static64.aClass1_1966)) {
								local359 = 7;
								Static111.aClass1_2894 = Static111.aClass1_2894.method1(Static64.aClass1_1966.method10());
							} else if (local357.method26(Static93.aClass1_2465)) {
								local359 = 8;
								Static111.aClass1_2894 = Static111.aClass1_2894.method1(Static93.aClass1_2465.method10());
							} else if (local357.method26(Static84.aClass1_2365)) {
								local359 = 9;
								Static111.aClass1_2894 = Static111.aClass1_2894.method1(Static84.aClass1_2365.method10());
							} else if (local357.method26(Static83.aClass1_2334)) {
								Static111.aClass1_2894 = Static111.aClass1_2894.method1(Static83.aClass1_2334.method10());
								local359 = 10;
							} else if (local357.method26(Static85.aClass1_2367)) {
								Static111.aClass1_2894 = Static111.aClass1_2894.method1(Static85.aClass1_2367.method10());
								local359 = 11;
							}
							local357 = Static111.aClass1_2894.method30();
							if (local357.method26(Static77.aClass1_2155)) {
								local349 = 1;
								Static111.aClass1_2894 = Static111.aClass1_2894.method1(Static77.aClass1_2155.method10());
							} else if (local357.method26(Static103.aClass1_2703)) {
								local349 = 2;
								Static111.aClass1_2894 = Static111.aClass1_2894.method1(Static103.aClass1_2703.method10());
							} else if (local357.method26(Static53.aClass1_1820)) {
								Static111.aClass1_2894 = Static111.aClass1_2894.method1(Static53.aClass1_1820.method10());
								local349 = 3;
							} else if (local357.method26(aClass1_1374)) {
								local349 = 4;
								Static111.aClass1_2894 = Static111.aClass1_2894.method1(aClass1_1374.method10());
							} else if (local357.method26(Static90.aClass1_2442)) {
								local349 = 5;
								Static111.aClass1_2894 = Static111.aClass1_2894.method1(Static90.aClass1_2442.method10());
							}
							Static59.aClass2_Sub3_Sub1_2.method841(75);
							Static59.aClass2_Sub3_Sub1_2.method788(0);
							@Pc(650) int local650 = Static59.aClass2_Sub3_Sub1_2.anInt1168;
							Static59.aClass2_Sub3_Sub1_2.method788(local359);
							Static59.aClass2_Sub3_Sub1_2.method788(local349);
							Static4.method194(Static111.aClass1_2894, Static59.aClass2_Sub3_Sub1_2);
							Static59.aClass2_Sub3_Sub1_2.method802(Static59.aClass2_Sub3_Sub1_2.anInt1168 - local650);
							if (Static63.anInt1889 == 2) {
								Static13.aBoolean20 = true;
								Static63.anInt1889 = 3;
								Static59.aClass2_Sub3_Sub1_2.method841(32);
								Static59.aClass2_Sub3_Sub1_2.method788(Static63.anInt1889);
								Static59.aClass2_Sub3_Sub1_2.method788(Static6.anInt409);
								Static59.aClass2_Sub3_Sub1_2.method788(Static96.anInt2420);
							}
						}
						Static87.aBoolean137 = true;
						Static111.aClass1_2894 = Static111.aClass1_2898;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "(I)V")
	public static void method965() {
		@Pc(11) int local11 = Static32.anInt1230;
		@Pc(13) int local13 = Static5.anInt404;
		@Pc(15) int local15 = Static17.anInt772;
		@Pc(17) int local17 = Static77.anInt2065;
		Static92.method1120(local11, local15, local17, local13, 6116423);
		Static92.method1120(local11 + 1, local15 + 1, local17 - 2, 16, 0);
		Static92.method1129(local11 + 1, local15 + 18, local17 - 2, local13 + -19, 0);
		Static97.aClass2_Sub1_Sub2_Sub1_3.method375(Static83.aClass1_2338, local11 + 3, local15 + 14, 6116423);
		@Pc(63) int local63 = Static22.anInt930;
		@Pc(65) int local65 = Static84.anInt2248;
		if (Static18.anInt835 == 0) {
			local63 -= 4;
			local65 -= 4;
		}
		if (Static18.anInt835 == 1) {
			local65 -= 205;
			local63 -= 553;
		}
		if (Static18.anInt835 == 2) {
			local65 -= 357;
			local63 -= 17;
		}
		for (@Pc(83) int local83 = 0; local83 < Static37.anInt1346; local83++) {
			@Pc(98) int local98 = (Static37.anInt1346 - local83 - 1) * 15 + local15 + 31;
			@Pc(100) int local100 = 16777215;
			if (local63 > local11 && local11 + local17 > local63 && local65 > local98 - 13 && local98 + 3 > local65) {
				local100 = 16776960;
			}
			Static97.aClass2_Sub1_Sub2_Sub1_3.method368(Static84.aClass1Array20[local83], local11 + 3, local98, local100, true);
		}
	}
}
