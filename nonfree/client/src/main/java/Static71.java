import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "Lclient!ba;")
	public static Class7 aClass7_1;

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!mb", name = "n", descriptor = "Lclient!ea;")
	public static Class20 aClass20_35;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "Lclient!ec;")
	private static Class22 aClass22_514 = Static60.method1113("Loaded wordpack");

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
	public static int anInt1906 = 0;

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "Lclient!ec;")
	private static Class22 aClass22_515 = Static60.method1113("Loaded interfaces");

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "Lclient!ec;")
	public static Class22 aClass22_516 = Static60.method1113(")2");

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "Lclient!ec;")
	private static Class22 aClass22_520 = Static60.method1113("Loading title screen )2 ");

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "Lclient!ec;")
	public static Class22 aClass22_517 = aClass22_520;

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "Lclient!ja;")
	public static Class33 aClass33_24 = new Class33(200);

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "Lclient!ec;")
	public static Class22 aClass22_518 = aClass22_514;

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "Lclient!ec;")
	public static Class22 aClass22_519 = aClass22_515;

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
	private static int anInt1911 = 0;

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "Lclient!ec;")
	public static Class22 aClass22_521 = Static60.method1113("blaugr-Un:");

	@OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
	public static int anInt1912 = 0;

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "Lclient!ec;")
	private static Class22 aClass22_523 = Static60.method1113("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!mb", name = "u", descriptor = "Lclient!ec;")
	public static Class22 aClass22_522 = aClass22_523;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIBI)I")
	public static int method1178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) int local17 = 256 - arg1;
		return ((arg0 & 0xFF00FF) * arg1 + (arg2 & 0xFF00FF) * local17 & 0xFF00FF00) + (arg1 * (arg0 & 0xFF00) + local17 * (arg2 & 0xFF00) & 0xFF0000) >> 8;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!ea;ZLclient!ea;Lclient!ea;Lclient!ea;)V")
	public static void method1179(@OriginalArg(0) Class20 arg0, @OriginalArg(2) Class20 arg1, @OriginalArg(3) Class20 arg2, @OriginalArg(4) Class20 arg3) {
		Static4.aClass20_5 = arg2;
		aClass20_35 = arg3;
		Static133.aClass20_63 = arg1;
		Static10.aClass20_8 = arg0;
		Static65.aClass4_Sub7ArrayArray1 = new Class4_Sub7[aClass20_35.method595()][];
		Static76.aBooleanArray14 = new boolean[aClass20_35.method595()];
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "([Lclient!f;IIIIIIII)V")
	public static void method1180(@OriginalArg(0) Class4_Sub7[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class4_Sub7 local13 = arg0[local7];
			if (local13 != null && (!local13.aBoolean79 || local13.anInt743 == 0 || local13.aBoolean78 || Static124.method1890(local13) != 0 || local13 == Static97.aClass4_Sub7_13) && local13.anInt802 == arg7 && (!local13.aBoolean79 || !Static98.method1667(local13))) {
				@Pc(54) int local54 = arg1 + local13.anInt785;
				@Pc(59) int local59 = local13.anInt796 + arg5;
				if (local13 == Static133.aClass4_Sub7_16) {
					Static93.aBoolean224 = true;
					Static105.anInt2642 = local54;
					Static52.anInt1488 = local59;
				}
				@Pc(76) int local76;
				@Pc(82) int local82;
				@Pc(78) int local78;
				@Pc(80) int local80;
				@Pc(120) int local120;
				if (local13.anInt743 == 2) {
					local76 = arg2;
					local78 = arg4;
					local80 = arg6;
					local82 = arg3;
				} else {
					@Pc(95) int local95;
					@Pc(122) int local122;
					if (local13.anInt743 == 9) {
						@Pc(93) int local93 = local13.anInt773 + local54;
						local95 = local54;
						if (local93 < local54) {
							local95 = local93;
							local93 = local54;
						}
						local76 = arg2 >= local95 ? arg2 : local95;
						local120 = local13.anInt753 + local59;
						local122 = local59;
						local93++;
						local78 = arg4 > local93 ? local93 : arg4;
						if (local59 > local120) {
							local122 = local120;
							local120 = local59;
						}
						local120++;
						local80 = local120 >= arg6 ? arg6 : local120;
						local82 = arg3 >= local122 ? arg3 : local122;
					} else {
						local82 = arg3 >= local59 ? arg3 : local59;
						local76 = arg2 < local54 ? local54 : arg2;
						local95 = local13.anInt773 + local54;
						local78 = local95 >= arg4 ? arg4 : local95;
						local122 = local13.anInt753 + local59;
						local80 = local122 >= arg6 ? arg6 : local122;
					}
				}
				if (!local13.aBoolean79 || local78 > local76 && local80 > local82) {
					if (local13.anInt793 == 1337) {
						Static110.method1772(local13);
					} else if (local13.anInt793 == 1338) {
						Static1.method2(local54, local59);
					} else {
						if (local13.anInt743 == 0) {
							if (!local13.aBoolean79 && Static98.method1667(local13) && Static43.aClass4_Sub7_10 != local13) {
								continue;
							}
							method1180(arg0, local54 - local13.anInt791, local76, local82, local78, local59 - local13.anInt806, local80, local13.anInt738);
							if (local13.aClass4_Sub7Array1 != null) {
								method1180(local13.aClass4_Sub7Array1, local54 - local13.anInt791, local76, local82, local78, local59 - local13.anInt806, local80, local13.anInt738);
							}
							@Pc(307) Class4_Sub21 local307 = (Class4_Sub21) Static90.aClass81_11.method2010((long) local13.anInt738);
							if (local307 != null) {
								Static106.method1750(local307.anInt2939, local76, local82, local80, local59, local78, local54);
							}
						}
						if (local13.aBoolean79) {
							@Pc(324) boolean local324 = false;
							@Pc(346) boolean local346;
							if (local76 <= Static72.anInt1914 && local82 <= Static117.anInt2876 && Static72.anInt1914 < local78 && Static117.anInt2876 < local80) {
								local346 = true;
							} else {
								local346 = false;
							}
							if (Static72.anInt1920 == 1 && local346) {
								local324 = true;
							}
							@Pc(361) boolean local361 = false;
							if (Static65.anInt1845 == 1 && local76 <= Static8.anInt2382 && local82 <= Static55.anInt1118 && Static8.anInt2382 < local78 && Static55.anInt1118 < local80) {
								local361 = true;
							}
							if (local361) {
								Static14.method276(local13, Static55.anInt1118 - local59, Static8.anInt2382 + -local54);
							}
							if (Static133.aClass4_Sub7_16 != null && Static133.aClass4_Sub7_16 != local13 && local346 && Static97.method1659(Static124.method1890(local13))) {
								Static103.aClass4_Sub7_14 = local13;
							}
							if (local13 == Static97.aClass4_Sub7_13) {
								Static92.anInt2522 = local54;
								Static23.aBoolean57 = true;
								Static115.anInt2835 = local59;
							}
							if (local13.aBoolean78) {
								@Pc(441) Class4_Sub3 local441;
								if (local346 && Static59.anInt1766 != 0 && local13.anObjectArray25 != null) {
									local441 = new Class4_Sub3();
									local441.anObjectArray1 = local13.anObjectArray25;
									local441.anInt211 = Static59.anInt1766;
									local441.aClass4_Sub7_3 = local13;
									Static9.aClass82_2.method2028(local441);
								}
								if (Static133.aClass4_Sub7_16 != null || Static30.aClass4_Sub7_6 != null || Static22.aBoolean250) {
									local346 = false;
									local361 = false;
									local324 = false;
								}
								if (!local13.aBoolean75 && local361) {
									local13.aBoolean75 = true;
									if (local13.anObjectArray24 != null) {
										local441 = new Class4_Sub3();
										local441.anInt207 = Static8.anInt2382 - local54;
										local441.aClass4_Sub7_3 = local13;
										local441.anObjectArray1 = local13.anObjectArray24;
										local441.anInt211 = Static55.anInt1118 - local59;
										Static9.aClass82_2.method2028(local441);
									}
								}
								if (local13.aBoolean75 && local324 && local13.anObjectArray21 != null) {
									local441 = new Class4_Sub3();
									local441.aClass4_Sub7_3 = local13;
									local441.anObjectArray1 = local13.anObjectArray21;
									local441.anInt211 = Static117.anInt2876 - local59;
									local441.anInt207 = Static72.anInt1914 - local54;
									Static9.aClass82_2.method2028(local441);
								}
								if (local13.aBoolean75 && !local324) {
									local13.aBoolean75 = false;
									if (local13.anObjectArray18 != null) {
										local441 = new Class4_Sub3();
										local441.anInt207 = Static72.anInt1914 - local54;
										local441.anInt211 = Static117.anInt2876 - local59;
										local441.aClass4_Sub7_3 = local13;
										local441.anObjectArray1 = local13.anObjectArray18;
										Static66.aClass82_6.method2028(local441);
									}
								}
								if (local324 && local13.anObjectArray9 != null) {
									local441 = new Class4_Sub3();
									local441.anInt207 = Static72.anInt1914 - local54;
									local441.anObjectArray1 = local13.anObjectArray9;
									local441.aClass4_Sub7_3 = local13;
									local441.anInt211 = Static117.anInt2876 - local59;
									Static9.aClass82_2.method2028(local441);
								}
								if (!local13.aBoolean77 && local346) {
									local13.aBoolean77 = true;
									if (local13.anObjectArray22 != null) {
										local441 = new Class4_Sub3();
										local441.anObjectArray1 = local13.anObjectArray22;
										local441.aClass4_Sub7_3 = local13;
										local441.anInt207 = Static72.anInt1914 - local54;
										local441.anInt211 = Static117.anInt2876 - local59;
										Static9.aClass82_2.method2028(local441);
									}
								}
								if (local13.aBoolean77 && local346 && local13.anObjectArray19 != null) {
									local441 = new Class4_Sub3();
									local441.anObjectArray1 = local13.anObjectArray19;
									local441.anInt211 = Static117.anInt2876 - local59;
									local441.anInt207 = Static72.anInt1914 - local54;
									local441.aClass4_Sub7_3 = local13;
									Static9.aClass82_2.method2028(local441);
								}
								if (local13.aBoolean77 && !local346) {
									local13.aBoolean77 = false;
									if (local13.anObjectArray8 != null) {
										local441 = new Class4_Sub3();
										local441.anObjectArray1 = local13.anObjectArray8;
										local441.aClass4_Sub7_3 = local13;
										local441.anInt207 = Static72.anInt1914 - local54;
										local441.anInt211 = Static117.anInt2876 - local59;
										Static66.aClass82_6.method2028(local441);
									}
								}
								if (local13.anObjectArray6 != null) {
									local441 = new Class4_Sub3();
									local441.aClass4_Sub7_3 = local13;
									local441.anObjectArray1 = local13.anObjectArray6;
									Static92.aClass82_8.method2028(local441);
								}
								@Pc(784) int local784;
								@Pc(786) int local786;
								@Pc(798) Class4_Sub3 local798;
								if (local13.anObjectArray15 != null && anInt1911 > local13.anInt763) {
									if (local13.anIntArray88 == null || anInt1911 - local13.anInt763 > 32) {
										local441 = new Class4_Sub3();
										local441.anObjectArray1 = local13.anObjectArray15;
										local441.aClass4_Sub7_3 = local13;
										Static9.aClass82_2.method2028(local441);
									} else {
										label368: for (local120 = local13.anInt763; local120 < anInt1911; local120++) {
											local784 = Static98.anIntArray283[local120 & 0x1F];
											for (local786 = 0; local786 < local13.anIntArray88.length; local786++) {
												if (local784 == local13.anIntArray88[local786]) {
													local798 = new Class4_Sub3();
													local798.aClass4_Sub7_3 = local13;
													local798.anObjectArray1 = local13.anObjectArray15;
													Static9.aClass82_2.method2028(local798);
													break label368;
												}
											}
										}
									}
									local13.anInt763 = anInt1911;
								}
								if (local13.anObjectArray4 != null && local13.anInt735 < Static60.anInt1787) {
									if (local13.anIntArray82 == null || Static60.anInt1787 - local13.anInt735 > 32) {
										local441 = new Class4_Sub3();
										local441.aClass4_Sub7_3 = local13;
										local441.anObjectArray1 = local13.anObjectArray4;
										Static9.aClass82_2.method2028(local441);
									} else {
										label348: for (local120 = local13.anInt735; local120 < Static60.anInt1787; local120++) {
											local784 = Static9.anIntArray17[local120 & 0x1F];
											for (local786 = 0; local786 < local13.anIntArray82.length; local786++) {
												if (local13.anIntArray82[local786] == local784) {
													local798 = new Class4_Sub3();
													local798.anObjectArray1 = local13.anObjectArray4;
													local798.aClass4_Sub7_3 = local13;
													Static9.aClass82_2.method2028(local798);
													break label348;
												}
											}
										}
									}
									local13.anInt735 = Static60.anInt1787;
								}
								if (local13.anObjectArray7 != null && Static72.anInt1918 > local13.anInt776) {
									if (local13.anIntArray91 == null || Static72.anInt1918 - local13.anInt776 > 32) {
										local441 = new Class4_Sub3();
										local441.aClass4_Sub7_3 = local13;
										local441.anObjectArray1 = local13.anObjectArray7;
										Static9.aClass82_2.method2028(local441);
									} else {
										label328: for (local120 = local13.anInt776; local120 < Static72.anInt1918; local120++) {
											local784 = Static61.anIntArray174[local120 & 0x1F];
											for (local786 = 0; local786 < local13.anIntArray91.length; local786++) {
												if (local784 == local13.anIntArray91[local786]) {
													local798 = new Class4_Sub3();
													local798.anObjectArray1 = local13.anObjectArray7;
													local798.aClass4_Sub7_3 = local13;
													Static9.aClass82_2.method2028(local798);
													break label328;
												}
											}
										}
									}
									local13.anInt776 = Static72.anInt1918;
								}
								if (Static13.anInt285 > local13.anInt807 && local13.anObjectArray11 != null) {
									local441 = new Class4_Sub3();
									local441.aClass4_Sub7_3 = local13;
									local441.anObjectArray1 = local13.anObjectArray11;
									Static9.aClass82_2.method2028(local441);
								}
								if (local13.anInt807 < Static2.anInt14 && local13.anObjectArray10 != null) {
									local441 = new Class4_Sub3();
									local441.aClass4_Sub7_3 = local13;
									local441.anObjectArray1 = local13.anObjectArray10;
									Static9.aClass82_2.method2028(local441);
								}
								if (Static1.anInt4 > local13.anInt807 && local13.anObjectArray12 != null) {
									local441 = new Class4_Sub3();
									local441.anObjectArray1 = local13.anObjectArray12;
									local441.aClass4_Sub7_3 = local13;
									Static9.aClass82_2.method2028(local441);
								}
								if (local13.anInt807 < Static88.anInt2354 && local13.anObjectArray17 != null) {
									local441 = new Class4_Sub3();
									local441.anObjectArray1 = local13.anObjectArray17;
									local441.aClass4_Sub7_3 = local13;
									Static9.aClass82_2.method2028(local441);
								}
								local13.anInt807 = Static96.anInt2513;
								if (local13.anObjectArray3 != null) {
									for (local120 = 0; local120 < Static45.anInt1278; local120++) {
										@Pc(1118) Class4_Sub3 local1118 = new Class4_Sub3();
										local1118.aClass4_Sub7_3 = local13;
										local1118.anInt204 = Static60.anIntArray173[local120];
										local1118.anInt210 = Static9.anIntArray16[local120];
										local1118.anObjectArray1 = local13.anObjectArray3;
										Static9.aClass82_2.method2028(local1118);
									}
								}
							}
						}
						if (!local13.aBoolean79) {
							if (Static133.aClass4_Sub7_16 != null || Static30.aClass4_Sub7_6 != null || Static22.aBoolean250) {
								return;
							}
							if ((local13.anInt742 >= 0 || local13.anInt786 != 0) && Static72.anInt1914 >= local76 && local82 <= Static117.anInt2876 && local78 > Static72.anInt1914 && Static117.anInt2876 < local80) {
								if (local13.anInt742 < 0) {
									Static43.aClass4_Sub7_10 = local13;
								} else {
									Static43.aClass4_Sub7_10 = arg0[local13.anInt742];
								}
							}
							if (local13.anInt743 == 8 && Static72.anInt1914 >= local76 && local82 <= Static117.anInt2876 && Static72.anInt1914 < local78 && local80 > Static117.anInt2876) {
								Static58.aClass4_Sub7_12 = local13;
							}
							if (local13.anInt781 > local13.anInt753) {
								Static72.method1184(local59, local13, Static117.anInt2876, local13.anInt773 + local54, local13.anInt753, Static72.anInt1914, local13.anInt781);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)Z")
	public static boolean method1181() {
		if (Static120.aClass6_4 == null) {
			return false;
		}
		@Pc(150) int local150;
		try {
			@Pc(13) int local13 = Static120.aClass6_4.method135();
			if (local13 == 0) {
				return false;
			}
			if (Static72.anInt1915 == -1) {
				Static120.aClass6_4.method134(0, Static133.aClass4_Sub11_Sub1_3.aByteArray9, 1);
				Static133.aClass4_Sub11_Sub1_3.anInt1099 = 0;
				Static72.anInt1915 = Static133.aClass4_Sub11_Sub1_3.method746();
				Static96.anInt2463 = Static39.anIntArray112[Static72.anInt1915];
				local13--;
			}
			if (Static96.anInt2463 == -1) {
				if (local13 <= 0) {
					return false;
				}
				local13--;
				Static120.aClass6_4.method134(0, Static133.aClass4_Sub11_Sub1_3.aByteArray9, 1);
				Static96.anInt2463 = Static133.aClass4_Sub11_Sub1_3.aByteArray9[0] & 0xFF;
			}
			if (Static96.anInt2463 == -2) {
				if (local13 <= 1) {
					return false;
				}
				local13 -= 2;
				Static120.aClass6_4.method134(0, Static133.aClass4_Sub11_Sub1_3.aByteArray9, 2);
				Static133.aClass4_Sub11_Sub1_3.anInt1099 = 0;
				Static96.anInt2463 = Static133.aClass4_Sub11_Sub1_3.method718();
			}
			if (local13 < Static96.anInt2463) {
				return false;
			}
			Static133.aClass4_Sub11_Sub1_3.anInt1099 = 0;
			Static120.aClass6_4.method134(0, Static133.aClass4_Sub11_Sub1_3.aByteArray9, Static96.anInt2463);
			Static30.anInt708 = 0;
			Static30.anInt713 = Static133.anInt3142;
			Static133.anInt3142 = Static10.anInt206;
			Static10.anInt206 = Static72.anInt1915;
			@Pc(140) int local140;
			if (Static72.anInt1915 == 27) {
				local140 = Static133.aClass4_Sub11_Sub1_3.method705();
				Static11.anInt2982 = local140;
				Static18.method359(local140);
				Static53.method1006(Static11.anInt2982);
				for (local150 = 0; local150 < 100; local150++) {
					Static122.aBooleanArray7[local150] = true;
				}
				Static72.anInt1915 = -1;
				return true;
			}
			@Pc(203) int local203;
			@Pc(230) int local230;
			@Pc(236) int local236;
			@Pc(186) Class4_Sub7 local186;
			@Pc(251) int local251;
			if (Static72.anInt1915 == 106) {
				local140 = Static133.aClass4_Sub11_Sub1_3.method725();
				local150 = Static133.aClass4_Sub11_Sub1_3.method718();
				if (local140 >= 0) {
					local186 = Static106.method1749(local140);
				} else {
					local186 = null;
				}
				if (local140 < -70000) {
					local150 += 32768;
				}
				if (local186 != null) {
					for (local203 = 0; local203 < local186.anIntArray89.length; local203++) {
						local186.anIntArray89[local203] = 0;
						local186.anIntArray83[local203] = 0;
					}
				}
				Static84.method1492(local150);
				local203 = Static133.aClass4_Sub11_Sub1_3.method718();
				for (local230 = 0; local230 < local203; local230++) {
					local236 = Static133.aClass4_Sub11_Sub1_3.method716();
					if (local236 == 255) {
						local236 = Static133.aClass4_Sub11_Sub1_3.method696();
					}
					local251 = Static133.aClass4_Sub11_Sub1_3.method711();
					if (local186 != null && local186.anIntArray89.length > local230) {
						local186.anIntArray89[local230] = local251;
						local186.anIntArray83[local230] = local236;
					}
					Static31.method527(local150, local230, local236, local251 - 1);
				}
				if (local186 != null) {
					Static110.method1772(local186);
				}
				Static68.method345();
				Static9.anIntArray17[Static60.anInt1787++ & 0x1F] = local150 & 0x7FFF;
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 42) {
				Static88.anInt2348 = Static96.anInt2463 / 8;
				for (local140 = 0; local140 < Static88.anInt2348; local140++) {
					Static85.aLongArray5[local140] = Static133.aClass4_Sub11_Sub1_3.method714();
					Static58.aClass22Array14[local140] = Static8.method1575(Static85.aLongArray5[local140]);
				}
				Static72.anInt1915 = -1;
				Static2.anInt14 = Static96.anInt2513;
				return true;
			}
			if (Static72.anInt1915 == 210) {
				local140 = Static133.aClass4_Sub11_Sub1_3.method696();
				local150 = Static133.aClass4_Sub11_Sub1_3.method711();
				local186 = Static106.method1749(local140);
				if (local186.anInt752 != 2 || local186.anInt794 != local150) {
					local186.anInt752 = 2;
					local186.anInt794 = local150;
					Static110.method1772(local186);
				}
				Static72.anInt1915 = -1;
				return true;
			}
			@Pc(414) int local414;
			@Pc(418) Class4_Sub7 local418;
			if (Static72.anInt1915 == 92) {
				local140 = Static133.aClass4_Sub11_Sub1_3.method718();
				if (local140 == 65535) {
					local140 = -1;
				}
				local150 = Static133.aClass4_Sub11_Sub1_3.method725();
				local414 = Static133.aClass4_Sub11_Sub1_3.method712();
				local418 = Static106.method1749(local150);
				@Pc(435) Class4_Sub1_Sub8 local435;
				if (local418.aBoolean79) {
					local418.anInt759 = local414;
					local418.anInt769 = local140;
					local435 = Static123.method2000(local140);
					local418.anInt808 = local435.anInt1469;
					local418.anInt772 = local435.anInt1449;
					local418.anInt777 = local435.anInt1445;
					local418.anInt741 = local435.anInt1436;
					local418.anInt775 = local435.anInt1477;
					if (local418.anInt773 > 0) {
						local418.anInt772 = local418.anInt772 * 32 / local418.anInt773;
					}
					local418.anInt795 = local435.anInt1438;
					Static110.method1772(local418);
				} else if (local140 == -1) {
					Static72.anInt1915 = -1;
					local418.anInt752 = 0;
					return true;
				} else {
					local435 = Static123.method2000(local140);
					local418.anInt772 = local435.anInt1449 * 100 / local414;
					local418.anInt808 = local435.anInt1469;
					local418.anInt752 = 4;
					local418.anInt775 = local435.anInt1477;
					local418.anInt794 = local140;
					Static110.method1772(local418);
				}
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 175) {
				for (local140 = 0; local140 < Static44.aClass4_Sub1_Sub3_Sub2_Sub1Array1.length; local140++) {
					if (Static44.aClass4_Sub1_Sub3_Sub2_Sub1Array1[local140] != null) {
						Static44.aClass4_Sub1_Sub3_Sub2_Sub1Array1[local140].anInt2474 = -1;
					}
				}
				for (local150 = 0; local150 < Static12.aClass4_Sub1_Sub3_Sub2_Sub2Array1.length; local150++) {
					if (Static12.aClass4_Sub1_Sub3_Sub2_Sub2Array1[local150] != null) {
						Static12.aClass4_Sub1_Sub3_Sub2_Sub2Array1[local150].anInt2474 = -1;
					}
				}
				Static72.anInt1915 = -1;
				return true;
			}
			@Pc(571) Class22 local571;
			if (Static72.anInt1915 == 89) {
				local571 = Static133.aClass4_Sub11_Sub1_3.method742();
				@Pc(578) Object[] local578 = new Object[local571.method449() + 1];
				for (local414 = local571.method449() - 1; local414 >= 0; local414--) {
					if (local571.method469(local414) == 115) {
						local578[local414 + 1] = Static133.aClass4_Sub11_Sub1_3.method742();
					} else {
						local578[local414 + 1] = Integer.valueOf(Static133.aClass4_Sub11_Sub1_3.method725());
					}
				}
				local578[0] = Integer.valueOf(Static133.aClass4_Sub11_Sub1_3.method725());
				@Pc(632) Class4_Sub3 local632 = new Class4_Sub3();
				local632.anObjectArray1 = local578;
				Static133.method2036(local632);
				Static72.anInt1915 = -1;
				return true;
			}
			@Pc(673) long local673;
			@Pc(667) boolean local667;
			@Pc(665) Class22 local665;
			if (Static72.anInt1915 == 238) {
				local571 = Static133.aClass4_Sub11_Sub1_3.method742();
				if (local571.method475(Static95.aClass22_536)) {
					local665 = local571.method450(0, local571.method476(Static129.aClass22_949));
					local667 = false;
					local673 = local665.method468();
					for (local236 = 0; local236 < Static88.anInt2348; local236++) {
						if (local673 == Static85.aLongArray5[local236]) {
							local667 = true;
							break;
						}
					}
					if (!local667 && Static79.anInt2177 == 0) {
						Static65.method1153(Static66.aClass22_495, 4, local665);
					}
				} else if (local571.method475(Static87.aClass22_660)) {
					local667 = false;
					local665 = local571.method450(0, local571.method476(Static129.aClass22_949));
					local673 = local665.method468();
					for (local236 = 0; local236 < Static88.anInt2348; local236++) {
						if (Static85.aLongArray5[local236] == local673) {
							local667 = true;
							break;
						}
					}
					if (!local667 && Static79.anInt2177 == 0) {
						Static65.method1153(Static99.aClass22_763, 8, local665);
					}
				} else if (local571.method475(Static14.aClass22_119)) {
					local665 = local571.method450(0, local571.method476(Static129.aClass22_949));
					local667 = false;
					local673 = local665.method468();
					for (local236 = 0; local236 < Static88.anInt2348; local236++) {
						if (Static85.aLongArray5[local236] == local673) {
							local667 = true;
							break;
						}
					}
					if (!local667 && Static79.anInt2177 == 0) {
						@Pc(957) Class22 local957 = local571.method450(local571.method476(Static129.aClass22_949) + 1, local571.method449() + -9);
						Static65.method1153(local957, 8, local665);
					}
				} else if (local571.method475(Static78.aClass22_575)) {
					local665 = local571.method450(0, local571.method476(Static129.aClass22_949));
					local673 = local665.method468();
					local667 = false;
					for (local236 = 0; local236 < Static88.anInt2348; local236++) {
						if (local673 == Static85.aLongArray5[local236]) {
							local667 = true;
							break;
						}
					}
					if (!local667 && Static79.anInt2177 == 0) {
						Static65.method1153(Static64.aClass22_485, 10, local665);
					}
				} else if (local571.method475(Static23.aClass22_161)) {
					local665 = local571.method450(0, local571.method476(Static23.aClass22_161));
					Static65.method1153(local665, 11, Static64.aClass22_485);
				} else if (local571.method475(Static54.aClass22_391)) {
					local665 = local571.method450(0, local571.method476(Static54.aClass22_391));
					if (Static79.anInt2177 == 0) {
						Static65.method1153(local665, 12, Static64.aClass22_485);
					}
				} else if (local571.method475(Static122.aClass22_344)) {
					local665 = local571.method450(0, local571.method476(Static122.aClass22_344));
					if (Static79.anInt2177 == 0) {
						Static65.method1153(local665, 13, Static64.aClass22_485);
					}
				} else {
					Static65.method1153(local571, 0, Static64.aClass22_485);
				}
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 188) {
				Static75.method1271();
				Static72.anInt1915 = -1;
				return false;
			}
			@Pc(1111) int local1111;
			@Pc(1158) int local1158;
			@Pc(1212) int local1212;
			@Pc(988) long local988;
			@Pc(1118) int local1118;
			if (Static72.anInt1915 == 184) {
				local988 = Static133.aClass4_Sub11_Sub1_3.method714();
				local414 = Static133.aClass4_Sub11_Sub1_3.method718();
				local203 = Static133.aClass4_Sub11_Sub1_3.method719();
				@Pc(1002) Class22 local1002 = Static8.method1575(local988).method473();
				for (local236 = 0; local236 < Static2.anInt9; local236++) {
					if (local988 == Static29.aLongArray1[local236]) {
						if (local414 != Static75.anIntArray199[local236]) {
							Static75.anIntArray199[local236] = local414;
							if (local414 > 0) {
								Static65.method1153(Static44.method856(new Class22[] { local1002, Static35.aClass22_245 }), 5, Static64.aClass22_485);
							}
							if (local414 == 0) {
								Static65.method1153(Static44.method856(new Class22[] { local1002, Static79.aClass22_616 }), 5, Static64.aClass22_485);
							}
						}
						Static5.anIntArray6[local236] = local203;
						local1002 = null;
						break;
					}
				}
				if (local1002 != null && Static2.anInt9 < 200) {
					Static29.aLongArray1[Static2.anInt9] = local988;
					Static12.aClass22Array1[Static2.anInt9] = local1002;
					Static75.anIntArray199[Static2.anInt9] = local414;
					Static5.anIntArray6[Static2.anInt9] = local203;
					Static2.anInt9++;
				}
				Static2.anInt14 = Static96.anInt2513;
				local1111 = Static2.anInt9;
				while (local1111 > 0) {
					local1111--;
					@Pc(1116) boolean local1116 = true;
					for (local1118 = 0; local1118 < local1111; local1118++) {
						if (Static75.anIntArray199[local1118] != Static72.anInt1919 && Static75.anIntArray199[local1118 + 1] == Static72.anInt1919 || Static75.anIntArray199[local1118] == 0 && Static75.anIntArray199[local1118 + 1] != 0) {
							local1116 = false;
							local1158 = Static75.anIntArray199[local1118];
							Static75.anIntArray199[local1118] = Static75.anIntArray199[local1118 + 1];
							Static75.anIntArray199[local1118 + 1] = local1158;
							@Pc(1176) Class22 local1176 = Static12.aClass22Array1[local1118];
							Static12.aClass22Array1[local1118] = Static12.aClass22Array1[local1118 + 1];
							Static12.aClass22Array1[local1118 + 1] = local1176;
							@Pc(1194) long local1194 = Static29.aLongArray1[local1118];
							Static29.aLongArray1[local1118] = Static29.aLongArray1[local1118 + 1];
							Static29.aLongArray1[local1118 + 1] = local1194;
							local1212 = Static5.anIntArray6[local1118];
							Static5.anIntArray6[local1118] = Static5.anIntArray6[local1118 + 1];
							Static5.anIntArray6[local1118 + 1] = local1212;
						}
					}
					if (local1116) {
						break;
					}
				}
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 212) {
				local140 = Static133.aClass4_Sub11_Sub1_3.method696();
				Static76.aClass12_8 = Static130.aClass17_4.method388(local140);
				Static72.anInt1915 = -1;
				return true;
			}
			@Pc(1285) long local1285;
			@Pc(1301) long local1301;
			if (Static72.anInt1915 == 68) {
				local988 = Static133.aClass4_Sub11_Sub1_3.method714();
				Static133.aClass4_Sub11_Sub1_3.method731();
				local673 = Static133.aClass4_Sub11_Sub1_3.method714();
				@Pc(1280) boolean local1280 = false;
				local1285 = Static133.aClass4_Sub11_Sub1_3.method718();
				@Pc(1290) long local1290 = (long) Static133.aClass4_Sub11_Sub1_3.method704();
				local1118 = Static133.aClass4_Sub11_Sub1_3.method719();
				local1301 = (local1285 << 32) + local1290;
				for (@Pc(1303) int local1303 = 0; local1303 < 100; local1303++) {
					if (Static61.aLongArray3[local1303] == local1301) {
						local1280 = true;
						break;
					}
				}
				if (local1118 <= 1) {
					for (local1212 = 0; local1212 < Static88.anInt2348; local1212++) {
						if (local988 == Static85.aLongArray5[local1212]) {
							local1280 = true;
							break;
						}
					}
				}
				if (!local1280 && Static79.anInt2177 == 0) {
					Static61.aLongArray3[Static41.anInt1132] = local1301;
					Static41.anInt1132 = (Static41.anInt1132 + 1) % 100;
					@Pc(1361) Class22 local1361 = Static81.method1393(Static107.method1754(Static133.aClass4_Sub11_Sub1_3).method467());
					if (local1118 == 2 || local1118 == 3) {
						Static79.method1433(Static44.method856(new Class22[] { Static122.aClass22_342, Static8.method1575(local988).method473() }), 9, local1361, Static8.method1575(local673).method473());
					} else if (local1118 == 1) {
						Static79.method1433(Static44.method856(new Class22[] { Static120.aClass22_909, Static8.method1575(local988).method473() }), 9, local1361, Static8.method1575(local673).method473());
					} else {
						Static79.method1433(Static8.method1575(local988).method473(), 9, local1361, Static8.method1575(local673).method473());
					}
				}
				Static72.anInt1915 = -1;
				return true;
			}
			@Pc(1470) Class4_Sub21 local1470;
			if (Static72.anInt1915 == 111) {
				local140 = Static133.aClass4_Sub11_Sub1_3.method707();
				local150 = Static133.aClass4_Sub11_Sub1_3.method705();
				local414 = Static133.aClass4_Sub11_Sub1_3.method736();
				local1470 = (Class4_Sub21) Static90.aClass81_11.method2010((long) local414);
				if (local1470 != null) {
					Static112.method1794(local1470.anInt2939 != local150, local1470);
				}
				Static66.method1158(local140, local150, local414);
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 38) {
				local140 = Static133.aClass4_Sub11_Sub1_3.method738();
				local150 = Static133.aClass4_Sub11_Sub1_3.method725();
				local414 = Static133.aClass4_Sub11_Sub1_3.method738();
				local418 = Static106.method1749(local150);
				local230 = local140 + local418.anInt765;
				local236 = local418.anInt751 + local414;
				if (local230 != local418.anInt785 || local236 != local418.anInt796) {
					local418.anInt796 = local236;
					local418.anInt785 = local230;
					Static110.method1772(local418);
				}
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 73) {
				Static2.anInt10 = Static133.aClass4_Sub11_Sub1_3.method719();
				Static2.anInt12 = Static133.aClass4_Sub11_Sub1_3.method719();
				Static37.anInt896 = Static133.aClass4_Sub11_Sub1_3.method719();
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 41) {
				local140 = Static133.aClass4_Sub11_Sub1_3.method725();
				local665 = Static133.aClass4_Sub11_Sub1_3.method742();
				local186 = Static106.method1749(local140);
				if (!local665.method481(local186.aClass22_201)) {
					local186.aClass22_201 = local665;
					Static110.method1772(local186);
				}
				Static72.anInt1915 = -1;
				return true;
			}
			@Pc(1616) Class4_Sub7 local1616;
			if (Static72.anInt1915 == 59) {
				local140 = Static133.aClass4_Sub11_Sub1_3.method725();
				local1616 = Static106.method1749(local140);
				local1616.anInt752 = 3;
				local1616.anInt794 = Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.aClass21_2.method443();
				Static110.method1772(local1616);
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 195 || Static72.anInt1915 == 138 || Static72.anInt1915 == 164 || Static72.anInt1915 == 103 || Static72.anInt1915 == 120 || Static72.anInt1915 == 82 || Static72.anInt1915 == 32 || Static72.anInt1915 == 26 || Static72.anInt1915 == 147 || Static72.anInt1915 == 150 || Static72.anInt1915 == 105) {
				Static66.method1156();
				Static72.anInt1915 = -1;
				return true;
			}
			@Pc(1697) Class22 local1697;
			if (Static72.anInt1915 == 77) {
				local988 = Static133.aClass4_Sub11_Sub1_3.method714();
				local1697 = Static81.method1393(Static107.method1754(Static133.aClass4_Sub11_Sub1_3).method467());
				Static65.method1153(local1697, 6, Static8.method1575(local988).method473());
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 142) {
				local140 = Static133.aClass4_Sub11_Sub1_3.method715();
				local150 = Static133.aClass4_Sub11_Sub1_3.method696();
				local186 = Static106.method1749(local150);
				if (local186.anInt749 != local140 || local140 == -1) {
					local186.anInt788 = 0;
					local186.anInt749 = local140;
					local186.anInt747 = 0;
					Static110.method1772(local186);
				}
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 108) {
				Static68.method345();
				Static3.anInt27 = Static133.aClass4_Sub11_Sub1_3.method738();
				Static72.anInt1915 = -1;
				Static88.anInt2354 = Static96.anInt2513;
				return true;
			}
			if (Static72.anInt1915 == 137) {
				Static48.anInt1298 = Static133.aClass4_Sub11_Sub1_3.method711() * 30;
				Static88.anInt2354 = Static96.anInt2513;
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 110) {
				Static50.anInt1408 = Static133.aClass4_Sub11_Sub1_3.method719();
				Static72.anInt1915 = -1;
				Static2.anInt14 = Static96.anInt2513;
				return true;
			}
			if (Static72.anInt1915 == 36) {
				Static35.method571();
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 119) {
				Static12.method167(Static133.aClass4_Sub11_Sub1_3);
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 254) {
				local140 = Static133.aClass4_Sub11_Sub1_3.method696();
				local1616 = Static106.method1749(local140);
				for (local414 = 0; local414 < local1616.anIntArray89.length; local414++) {
					local1616.anIntArray89[local414] = -1;
					local1616.anIntArray89[local414] = 0;
				}
				Static110.method1772(local1616);
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 122) {
				Static4.anInt78 = Static133.aClass4_Sub11_Sub1_3.method719();
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 134) {
				Static39.anInt971 = 0;
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 171) {
				local140 = Static133.aClass4_Sub11_Sub1_3.method718();
				local150 = Static133.aClass4_Sub11_Sub1_3.method705();
				local414 = Static133.aClass4_Sub11_Sub1_3.method705();
				local203 = Static133.aClass4_Sub11_Sub1_3.method725();
				@Pc(1911) Class4_Sub7 local1911 = Static106.method1749(local203);
				if (local1911.anInt775 != local150 || local1911.anInt808 != local140 || local1911.anInt772 != local414) {
					local1911.anInt808 = local140;
					local1911.anInt772 = local414;
					local1911.anInt775 = local150;
					Static110.method1772(local1911);
				}
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 169) {
				Static4.method39(true);
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 213) {
				for (local140 = 0; local140 < Static50.anInt1412; local140++) {
					@Pc(1964) Class4_Sub1_Sub7 local1964 = Static48.method903(local140);
					if (local1964 != null && local1964.anInt1404 == 0) {
						Static12.anIntArray19[local140] = 0;
						Static23.anIntArray61[local140] = 0;
					}
				}
				Static68.method345();
				anInt1911 += 32;
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 208) {
				Static68.method345();
				local140 = Static133.aClass4_Sub11_Sub1_3.method722();
				local150 = Static133.aClass4_Sub11_Sub1_3.method725();
				local414 = Static133.aClass4_Sub11_Sub1_3.method722();
				Static14.anIntArray39[local140] = local150;
				Static115.anIntArray308[local140] = local414;
				Static43.anIntArray130[local140] = 1;
				for (local203 = 0; local203 < 98; local203++) {
					if (local150 >= Class72.anIntArray307[local203]) {
						Static43.anIntArray130[local140] = local203 + 2;
					}
				}
				Static61.anIntArray174[Static72.anInt1918++ & 0x1F] = local140;
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 55) {
				Static19.aBoolean53 = true;
				Static69.anInt1879 = Static133.aClass4_Sub11_Sub1_3.method719();
				Static88.anInt2362 = Static133.aClass4_Sub11_Sub1_3.method719();
				Static119.anInt2901 = Static133.aClass4_Sub11_Sub1_3.method718();
				Static66.anInt1851 = Static133.aClass4_Sub11_Sub1_3.method719();
				Static74.anInt1969 = Static133.aClass4_Sub11_Sub1_3.method719();
				if (Static74.anInt1969 >= 100) {
					Static42.anInt885 = Static88.anInt2362 * 128 + 64;
					Static87.anInt2318 = Static69.anInt1879 * 128 + 64;
					Static60.anInt1788 = Static69.method1173(Static37.anInt895, Static87.anInt2318, Static42.anInt885) - Static119.anInt2901;
				}
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 190) {
				for (local140 = 0; local140 < Static23.anIntArray61.length; local140++) {
					if (Static23.anIntArray61[local140] != Static12.anIntArray19[local140]) {
						Static23.anIntArray61[local140] = Static12.anIntArray19[local140];
						Static93.method1624(local140);
						Static98.anIntArray283[anInt1911++ & 0x1F] = local140;
					}
				}
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 161) {
				local140 = Static133.aClass4_Sub11_Sub1_3.method696();
				local150 = Static133.aClass4_Sub11_Sub1_3.method718();
				if (local150 == 65535) {
					local150 = -1;
				}
				local414 = Static133.aClass4_Sub11_Sub1_3.method712();
				local203 = Static133.aClass4_Sub11_Sub1_3.method718();
				if (local203 == 65535) {
					local203 = -1;
				}
				for (local230 = local150; local230 <= local203; local230++) {
					@Pc(2227) long local2227 = ((long) local140 << 32) + ((long) local230);
					@Pc(2232) Class4 local2232 = Static96.aClass81_12.method2010(local2227);
					if (local2232 != null) {
						local2232.method1999();
					}
					Static96.aClass81_12.method2015(local2227, new Class4_Sub9(local414));
				}
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 124) {
				if (Static11.anInt2982 != -1) {
					Static130.method2006(Static11.anInt2982, 0);
				}
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 39) {
				Static16.anInt377 = Static133.aClass4_Sub11_Sub1_3.method716();
				Static37.anInt901 = Static133.aClass4_Sub11_Sub1_3.method719();
				for (local140 = Static37.anInt901; local140 < Static37.anInt901 + 8; local140++) {
					for (local150 = Static16.anInt377; local150 < Static16.anInt377 + 8; local150++) {
						if (Static19.aClass82ArrayArrayArray1[Static37.anInt895][local140][local150] != null) {
							Static19.aClass82ArrayArrayArray1[Static37.anInt895][local140][local150] = null;
							Static132.method2019(local150, local140);
						}
					}
				}
				for (@Pc(2333) Class4_Sub5 local2333 = (Class4_Sub5) Static39.aClass82_4.method2025(); local2333 != null; local2333 = (Class4_Sub5) Static39.aClass82_4.method2023()) {
					if (local2333.anInt531 >= Static37.anInt901 && Static37.anInt901 + 8 > local2333.anInt531 && Static16.anInt377 <= local2333.anInt542 && local2333.anInt542 < Static16.anInt377 + 8 && local2333.anInt529 == Static37.anInt895) {
						local2333.anInt537 = 0;
					}
				}
				Static72.anInt1915 = -1;
				return true;
			}
			@Pc(2422) int local2422;
			if (Static72.anInt1915 == 222) {
				local988 = Static133.aClass4_Sub11_Sub1_3.method714();
				local673 = Static133.aClass4_Sub11_Sub1_3.method718();
				local1285 = Static133.aClass4_Sub11_Sub1_3.method704();
				@Pc(2412) long local2412 = (local673 << 32) + local1285;
				@Pc(2414) boolean local2414 = false;
				local251 = Static133.aClass4_Sub11_Sub1_3.method719();
				for (local2422 = 0; local2422 < 100; local2422++) {
					if (Static61.aLongArray3[local2422] == local2412) {
						local2414 = true;
						break;
					}
				}
				if (local251 <= 1) {
					for (@Pc(2449) int local2449 = 0; local2449 < Static88.anInt2348; local2449++) {
						if (local988 == Static85.aLongArray5[local2449]) {
							local2414 = true;
							break;
						}
					}
				}
				if (!local2414 && Static79.anInt2177 == 0) {
					Static61.aLongArray3[Static41.anInt1132] = local2412;
					Static41.anInt1132 = (Static41.anInt1132 + 1) % 100;
					@Pc(2490) Class22 local2490 = Static81.method1393(Static107.method1754(Static133.aClass4_Sub11_Sub1_3).method467());
					if (local251 == 2 || local251 == 3) {
						Static65.method1153(local2490, 7, Static44.method856(new Class22[] { Static122.aClass22_342, Static8.method1575(local988).method473() }));
					} else if (local251 == 1) {
						Static65.method1153(local2490, 7, Static44.method856(new Class22[] { Static120.aClass22_909, Static8.method1575(local988).method473() }));
					} else {
						Static65.method1153(local2490, 3, Static8.method1575(local988).method473());
					}
				}
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 207) {
				local140 = Static133.aClass4_Sub11_Sub1_3.method705();
				Static39.method622(local140);
				Static9.anIntArray17[Static60.anInt1787++ & 0x1F] = local140 & 0x7FFF;
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 99) {
				local140 = Static133.aClass4_Sub11_Sub1_3.method718();
				local150 = Static133.aClass4_Sub11_Sub1_3.method719();
				local414 = Static133.aClass4_Sub11_Sub1_3.method718();
				Static4.method40(local140, local414, local150);
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 244) {
				local140 = Static133.aClass4_Sub11_Sub1_3.method711();
				local150 = Static133.aClass4_Sub11_Sub1_3.method725();
				Static12.anIntArray19[local140] = local150;
				if (Static23.anIntArray61[local140] != local150) {
					Static23.anIntArray61[local140] = local150;
					Static93.method1624(local140);
				}
				Static98.anIntArray283[anInt1911++ & 0x1F] = local140;
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 209) {
				local140 = Static133.aClass4_Sub11_Sub1_3.method705();
				local150 = Static133.aClass4_Sub11_Sub1_3.method725();
				local186 = Static106.method1749(local150);
				if (local186 != null && local186.anInt743 == 0) {
					if (local140 > local186.anInt781 - local186.anInt753) {
						local140 = local186.anInt781 - local186.anInt753;
					}
					if (local140 < 0) {
						local140 = 0;
					}
					if (local140 != local186.anInt806) {
						local186.anInt806 = local140;
						Static110.method1772(local186);
					}
				}
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 201) {
				local140 = Static133.aClass4_Sub11_Sub1_3.method705();
				@Pc(2731) byte local2731 = Static133.aClass4_Sub11_Sub1_3.method731();
				Static12.anIntArray19[local140] = local2731;
				if (local2731 != Static23.anIntArray61[local140]) {
					Static23.anIntArray61[local140] = local2731;
					Static93.method1624(local140);
				}
				Static98.anIntArray283[anInt1911++ & 0x1F] = local140;
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 232) {
				Static104.anInt2634 = Static133.aClass4_Sub11_Sub1_3.method719();
				if (Static104.anInt2634 == 1) {
					Static66.anInt1863 = Static133.aClass4_Sub11_Sub1_3.method718();
				}
				if (Static104.anInt2634 >= 2 && Static104.anInt2634 <= 6) {
					if (Static104.anInt2634 == 2) {
						Static18.anInt500 = 64;
						Static115.anInt2840 = 64;
					}
					if (Static104.anInt2634 == 3) {
						Static115.anInt2840 = 0;
						Static18.anInt500 = 64;
					}
					if (Static104.anInt2634 == 4) {
						Static115.anInt2840 = 128;
						Static18.anInt500 = 64;
					}
					if (Static104.anInt2634 == 5) {
						Static115.anInt2840 = 64;
						Static18.anInt500 = 0;
					}
					if (Static104.anInt2634 == 6) {
						Static18.anInt500 = 128;
						Static115.anInt2840 = 64;
					}
					Static104.anInt2634 = 2;
					Static122.anInt1376 = Static133.aClass4_Sub11_Sub1_3.method718();
					Static85.anInt2258 = Static133.aClass4_Sub11_Sub1_3.method718();
					Static91.anInt2418 = Static133.aClass4_Sub11_Sub1_3.method719();
				}
				if (Static104.anInt2634 == 10) {
					Static65.anInt1848 = Static133.aClass4_Sub11_Sub1_3.method718();
				}
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 160) {
				Static19.aBoolean53 = false;
				for (local140 = 0; local140 < 5; local140++) {
					Static29.aBooleanArray1[local140] = false;
				}
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 2) {
				local140 = Static133.aClass4_Sub11_Sub1_3.method725();
				local150 = Static133.aClass4_Sub11_Sub1_3.method718();
				if (local140 >= 0) {
					local186 = Static106.method1749(local140);
				} else {
					local186 = null;
				}
				if (local140 < -70000) {
					local150 += 32768;
				}
				while (Static133.aClass4_Sub11_Sub1_3.anInt1099 < Static96.anInt2463) {
					local203 = Static133.aClass4_Sub11_Sub1_3.method692();
					local230 = Static133.aClass4_Sub11_Sub1_3.method718();
					local236 = 0;
					if (local230 != 0) {
						local236 = Static133.aClass4_Sub11_Sub1_3.method719();
						if (local236 == 255) {
							local236 = Static133.aClass4_Sub11_Sub1_3.method725();
						}
					}
					if (local186 != null && local203 >= 0 && local186.anIntArray89.length > local203) {
						local186.anIntArray89[local203] = local230;
						local186.anIntArray83[local203] = local236;
					}
					Static31.method527(local150, local203, local236, local230 - 1);
				}
				if (local186 != null) {
					Static110.method1772(local186);
				}
				Static68.method345();
				Static9.anIntArray17[Static60.anInt1787++ & 0x1F] = local150 & 0x7FFF;
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 239) {
				local140 = Static133.aClass4_Sub11_Sub1_3.method712();
				local150 = Static133.aClass4_Sub11_Sub1_3.method706();
				local414 = Static133.aClass4_Sub11_Sub1_3.method718();
				local418 = Static106.method1749(local140);
				Static72.anInt1915 = -1;
				local418.anInt740 = local150 + (local414 << 16);
				return true;
			}
			if (Static72.anInt1915 == 74) {
				Static75.method1274();
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 51) {
				Static92.method1616(Static96.anInt2463, Static133.aClass4_Sub11_Sub1_3, Static130.aClass17_4);
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 10) {
				local140 = Static133.aClass4_Sub11_Sub1_3.method706();
				if (local140 == 65535) {
					local140 = -1;
				}
				Static84.method1495(local140);
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 112) {
				local140 = Static133.aClass4_Sub11_Sub1_3.method705();
				if (local140 == 65535) {
					local140 = -1;
				}
				local150 = Static133.aClass4_Sub11_Sub1_3.method704();
				Static33.method548(local140, local150);
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 94) {
				local140 = Static133.aClass4_Sub11_Sub1_3.method722();
				local150 = Static133.aClass4_Sub11_Sub1_3.method722();
				local1697 = Static133.aClass4_Sub11_Sub1_3.method742();
				if (local140 >= 1 && local140 <= 8) {
					if (local1697.method480(Static75.aClass22_558)) {
						local1697 = null;
					}
					Static33.aClass22Array6[local140 - 1] = local1697;
					Static38.aBooleanArray3[local140 - 1] = local150 == 0;
				}
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 25) {
				local140 = Static133.aClass4_Sub11_Sub1_3.method718();
				local150 = Static133.aClass4_Sub11_Sub1_3.method725();
				local186 = Static106.method1749(local150);
				if (local186.anInt752 != 1 || local140 != local186.anInt794) {
					local186.anInt794 = local140;
					local186.anInt752 = 1;
					Static110.method1772(local186);
				}
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 224) {
				local140 = Static96.anInt2463 + Static133.aClass4_Sub11_Sub1_3.anInt1099;
				local150 = Static133.aClass4_Sub11_Sub1_3.method718();
				local414 = Static133.aClass4_Sub11_Sub1_3.method718();
				if (local150 != Static11.anInt2982) {
					Static11.anInt2982 = local150;
					Static18.method359(Static11.anInt2982);
					Static53.method1006(Static11.anInt2982);
					for (local203 = 0; local203 < 100; local203++) {
						Static122.aBooleanArray7[local203] = true;
					}
				}
				while (local414-- > 0) {
					local203 = Static133.aClass4_Sub11_Sub1_3.method725();
					local230 = Static133.aClass4_Sub11_Sub1_3.method718();
					local236 = Static133.aClass4_Sub11_Sub1_3.method719();
					@Pc(3268) Class4_Sub21 local3268 = (Class4_Sub21) Static90.aClass81_11.method2010((long) local203);
					if (local3268 != null && local3268.anInt2939 != local230) {
						Static112.method1794(true, local3268);
						local3268 = null;
					}
					if (local3268 == null) {
						local3268 = Static66.method1158(local236, local230, local203);
					}
					local3268.aBoolean263 = true;
				}
				for (local1470 = (Class4_Sub21) Static90.aClass81_11.method2017(); local1470 != null; local1470 = (Class4_Sub21) Static90.aClass81_11.method2013()) {
					if (local1470.aBoolean263) {
						local1470.aBoolean263 = false;
					} else {
						Static112.method1794(true, local1470);
					}
				}
				Static96.aClass81_12 = new Class81(512);
				while (local140 > Static133.aClass4_Sub11_Sub1_3.anInt1099) {
					local230 = Static133.aClass4_Sub11_Sub1_3.method725();
					local236 = Static133.aClass4_Sub11_Sub1_3.method718();
					local251 = Static133.aClass4_Sub11_Sub1_3.method718();
					local1111 = Static133.aClass4_Sub11_Sub1_3.method725();
					for (local1118 = local236; local1118 <= local251; local1118++) {
						local1301 = ((long) local230 << 32) + (long) local1118;
						Static96.aClass81_12.method2015(local1301, new Class4_Sub9(local1111));
					}
				}
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 4) {
				Static1.anInt4 = Static96.anInt2513;
				local988 = Static133.aClass4_Sub11_Sub1_3.method714();
				if (local988 == 0L) {
					Static105.aClass22_780 = null;
					Static92.aClass4_Sub8Array1 = null;
					Static72.anInt1915 = -1;
					Static109.aClass22_70 = null;
					Static133.anInt3150 = 0;
					return true;
				}
				local673 = Static133.aClass4_Sub11_Sub1_3.method714();
				Static109.aClass22_70 = Static8.method1575(local673);
				Static105.aClass22_780 = Static8.method1575(local988);
				Static84.aByte5 = Static133.aClass4_Sub11_Sub1_3.method731();
				local230 = Static133.aClass4_Sub11_Sub1_3.method719();
				if (local230 == 255) {
					Static72.anInt1915 = -1;
					return true;
				}
				@Pc(3448) Class4_Sub8[] local3448 = new Class4_Sub8[100];
				Static133.anInt3150 = local230;
				for (local251 = 0; local251 < Static133.anInt3150; local251++) {
					local3448[local251] = new Class4_Sub8();
					local3448[local251].aLong99 = Static133.aClass4_Sub11_Sub1_3.method714();
					local3448[local251].aClass22_214 = Static8.method1575(local3448[local251].aLong99);
					local3448[local251].anInt822 = Static133.aClass4_Sub11_Sub1_3.method718();
					local3448[local251].aByte1 = Static133.aClass4_Sub11_Sub1_3.method731();
					if (Static80.aLong68 == local3448[local251].aLong99) {
						Static126.aByte8 = local3448[local251].aByte1;
					}
				}
				local1158 = Static133.anInt3150;
				while (local1158 > 0) {
					local1158--;
					@Pc(3516) boolean local3516 = true;
					for (local2422 = 0; local2422 < local1158; local2422++) {
						if (local3448[local2422].aClass22_214.method447(local3448[local2422 + 1].aClass22_214) > 0) {
							local3516 = false;
							@Pc(3542) Class4_Sub8 local3542 = local3448[local2422];
							local3448[local2422] = local3448[local2422 + 1];
							local3448[local2422 + 1] = local3542;
						}
					}
					if (local3516) {
						break;
					}
				}
				Static92.aClass4_Sub8Array1 = local3448;
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 247) {
				local140 = Static133.aClass4_Sub11_Sub1_3.method719();
				local150 = Static133.aClass4_Sub11_Sub1_3.method719();
				local414 = Static133.aClass4_Sub11_Sub1_3.method719();
				local203 = Static133.aClass4_Sub11_Sub1_3.method719();
				Static29.aBooleanArray1[local140] = true;
				Static95.anIntArray196[local140] = local150;
				Static103.anIntArray292[local140] = local414;
				Static122.anIntArray142[local140] = local203;
				Static14.anIntArray41[local140] = 0;
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 33) {
				Static37.anInt901 = Static133.aClass4_Sub11_Sub1_3.method707();
				Static16.anInt377 = Static133.aClass4_Sub11_Sub1_3.method716();
				while (Static133.aClass4_Sub11_Sub1_3.anInt1099 < Static96.anInt2463) {
					Static72.anInt1915 = Static133.aClass4_Sub11_Sub1_3.method719();
					Static66.method1156();
				}
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 197) {
				Static68.method345();
				Static114.anInt2819 = Static133.aClass4_Sub11_Sub1_3.method719();
				Static72.anInt1915 = -1;
				Static88.anInt2354 = Static96.anInt2513;
				return true;
			}
			if (Static72.anInt1915 == 76) {
				Static19.aBoolean53 = true;
				Static72.anInt1923 = Static133.aClass4_Sub11_Sub1_3.method719();
				Static32.anInt825 = Static133.aClass4_Sub11_Sub1_3.method719();
				Static50.anInt1411 = Static133.aClass4_Sub11_Sub1_3.method718();
				Static78.anInt2051 = Static133.aClass4_Sub11_Sub1_3.method719();
				Static65.anInt1844 = Static133.aClass4_Sub11_Sub1_3.method719();
				if (Static65.anInt1844 >= 100) {
					local140 = Static72.anInt1923 * 128 + 64;
					local150 = Static32.anInt825 * 128 + 64;
					local414 = Static69.method1173(Static37.anInt895, local140, local150) - Static50.anInt1411;
					local230 = local414 - Static60.anInt1788;
					local236 = local150 - Static42.anInt885;
					local203 = local140 - Static87.anInt2318;
					local251 = (int) Math.sqrt((double) (local203 * local203 + local236 * local236));
					Static39.anInt957 = (int) (Math.atan2((double) local230, (double) local251) * 325.949D) & 0x7FF;
					Static96.anInt2480 = (int) (-325.949D * Math.atan2((double) local203, (double) local236)) & 0x7FF;
					if (Static39.anInt957 < 128) {
						Static39.anInt957 = 128;
					}
					if (Static39.anInt957 > 383) {
						Static39.anInt957 = 383;
					}
				}
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 237) {
				local140 = Static133.aClass4_Sub11_Sub1_3.method725();
				@Pc(3806) Class4_Sub21 local3806 = (Class4_Sub21) Static90.aClass81_11.method2010((long) local140);
				if (local3806 != null) {
					Static112.method1794(true, local3806);
				}
				if (Static43.aClass4_Sub7_9 != null) {
					Static110.method1772(Static43.aClass4_Sub7_9);
					Static43.aClass4_Sub7_9 = null;
				}
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 130) {
				@Pc(3837) boolean local3837 = Static133.aClass4_Sub11_Sub1_3.method719() == 1;
				local150 = Static133.aClass4_Sub11_Sub1_3.method736();
				local186 = Static106.method1749(local150);
				if (local186.aBoolean71 != local3837) {
					local186.aBoolean71 = local3837;
					Static110.method1772(local186);
				}
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 46) {
				local988 = Static133.aClass4_Sub11_Sub1_3.method714();
				local414 = Static133.aClass4_Sub11_Sub1_3.method718();
				@Pc(3886) byte local3886 = Static133.aClass4_Sub11_Sub1_3.method731();
				local667 = false;
				if ((local988 & Long.MIN_VALUE) != 0L) {
					local667 = true;
				}
				if (local667) {
					if (Static133.anInt3150 == 0) {
						Static72.anInt1915 = -1;
						return true;
					}
					local988 &= Long.MAX_VALUE;
					for (local236 = 0; Static133.anInt3150 > local236 && (Static92.aClass4_Sub8Array1[local236].aLong99 != local988 || local414 != Static92.aClass4_Sub8Array1[local236].anInt822); local236++) {
					}
					if (Static133.anInt3150 > local236) {
						while (local236 < Static133.anInt3150 - 1) {
							Static92.aClass4_Sub8Array1[local236] = Static92.aClass4_Sub8Array1[local236 + 1];
							local236++;
						}
						Static133.anInt3150--;
						Static92.aClass4_Sub8Array1[Static133.anInt3150] = null;
					}
				} else {
					@Pc(3902) Class4_Sub8 local3902 = new Class4_Sub8();
					local3902.aLong99 = local988;
					local3902.aClass22_214 = Static8.method1575(local3902.aLong99);
					local3902.anInt822 = local414;
					local3902.aByte1 = local3886;
					for (local251 = Static133.anInt3150 - 1; local251 >= 0; local251--) {
						local1111 = Static92.aClass4_Sub8Array1[local251].aClass22_214.method447(local3902.aClass22_214);
						if (local1111 == 0) {
							Static92.aClass4_Sub8Array1[local251].anInt822 = local414;
							Static92.aClass4_Sub8Array1[local251].aByte1 = local3886;
							if (local988 == Static80.aLong68) {
								Static126.aByte8 = local3886;
							}
							Static1.anInt4 = Static96.anInt2513;
							Static72.anInt1915 = -1;
							return true;
						}
						if (local1111 < 0) {
							break;
						}
					}
					if (Static133.anInt3150 >= Static92.aClass4_Sub8Array1.length) {
						Static72.anInt1915 = -1;
						return true;
					}
					for (local1111 = Static133.anInt3150 - 1; local1111 > local251; local1111--) {
						Static92.aClass4_Sub8Array1[local1111 + 1] = Static92.aClass4_Sub8Array1[local1111];
					}
					if (Static133.anInt3150 == 0) {
						Static92.aClass4_Sub8Array1 = new Class4_Sub8[100];
					}
					Static92.aClass4_Sub8Array1[local251 + 1] = local3902;
					if (local988 == Static80.aLong68) {
						Static126.aByte8 = local3886;
					}
					Static133.anInt3150++;
				}
				Static1.anInt4 = Static96.anInt2513;
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 45) {
				local140 = Static133.aClass4_Sub11_Sub1_3.method722();
				local150 = Static133.aClass4_Sub11_Sub1_3.method716();
				local414 = Static133.aClass4_Sub11_Sub1_3.method707();
				Static37.anInt895 = local140 >> 1;
				Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.method1610(local414, (local140 & 0x1) == 1, local150);
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 5) {
				local140 = Static133.aClass4_Sub11_Sub1_3.method718();
				local414 = local140 >> 10 & 0x1F;
				local150 = Static133.aClass4_Sub11_Sub1_3.method696();
				local230 = local140 & 0x1F;
				local203 = local140 >> 5 & 0x1F;
				@Pc(4183) Class4_Sub7 local4183 = Static106.method1749(local150);
				local236 = (local203 << 11) + (local414 << 19) + (local230 << 3);
				if (local4183.anInt754 != local236) {
					local4183.anInt754 = local236;
					Static110.method1772(local4183);
				}
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 231) {
				Static4.method39(false);
				Static72.anInt1915 = -1;
				return true;
			}
			if (Static72.anInt1915 == 115) {
				Static16.anInt377 = Static133.aClass4_Sub11_Sub1_3.method716();
				Static37.anInt901 = Static133.aClass4_Sub11_Sub1_3.method707();
				Static72.anInt1915 = -1;
				return true;
			}
			Static91.method1588(null, "T1 - " + Static72.anInt1915 + "," + Static133.anInt3142 + "," + Static30.anInt713 + " - " + Static96.anInt2463);
			Static75.method1271();
		} catch (@Pc(4267) IOException local4267) {
			Static54.method1025();
		} catch (@Pc(4271) Exception local4271) {
			@Pc(4312) String local4312 = "T2 - " + Static72.anInt1915 + "," + Static133.anInt3142 + "," + Static30.anInt713 + " - " + Static96.anInt2463 + "," + (Static59.anInt1769 + Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray280[0]) + "," + (Static98.anInt2584 + Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anIntArray277[0]) + " - ";
			for (local150 = 0; Static96.anInt2463 > local150 && local150 < 50; local150++) {
				local4312 = local4312 + Static133.aClass4_Sub11_Sub1_3.aByteArray9[local150] + ",";
			}
			Static91.method1588(local4271, local4312);
			Static75.method1271();
		}
		return true;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
	public static void method1182() {
		aClass33_24 = null;
		aClass20_35 = null;
		aClass22_515 = null;
		aClass22_516 = null;
		aClass7_1 = null;
		aClass22_521 = null;
		aClass22_522 = null;
		aByteArrayArrayArray3 = null;
		aClass22_520 = null;
		aClass22_514 = null;
		aClass22_517 = null;
		aClass22_523 = null;
		aClass22_519 = null;
		aClass22_518 = null;
	}
}
