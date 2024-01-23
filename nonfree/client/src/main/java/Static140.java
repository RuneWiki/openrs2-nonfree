import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "Lclient!ak;")
	public static Class7 aClass7_121;

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "F")
	public static float aFloat77;

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "[I")
	public static int[] anIntArray315;

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString91 = "Allocating memory";

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "[I")
	public static int[] anIntArray316 = new int[2];

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
	public static int anInt2624 = 0;

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "Lclient!db;")
	public static Class31 aClass31_23 = new Class31(4);

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BI)V")
	public static void method2197() {
		Static289.anInt5738 = -1;
		Static17.aBoolean34 = false;
		Static186.anInt3480 = 0;
		Static279.anInt5596 = -1;
		Static262.aClass7_210 = null;
		Static151.anInt2792 = 2;
		Static137.anInt3867 = 1;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!ak;B)V")
	public static void method2198(@OriginalArg(0) Class7 arg0) {
		Static170.aClass7_140 = arg0;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIILclient!j;Lclient!j;IIJ)V")
	public static void method2199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class6 arg4, @OriginalArg(5) Class6 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class125 local8 = new Class125();
		local8.aLong118 = arg8;
		local8.anInt3529 = arg1 * 128 + 64;
		local8.anInt3530 = arg2 * 128 + 64;
		local8.anInt3537 = arg3;
		local8.aClass6_8 = arg4;
		local8.aClass6_7 = arg5;
		local8.anInt3531 = arg6;
		local8.anInt3535 = arg7;
		for (@Pc(42) int local42 = arg0; local42 >= 0; local42--) {
			if (Static130.aClass1_Sub19ArrayArrayArray1[local42][arg1][arg2] == null) {
				Static130.aClass1_Sub19ArrayArrayArray1[local42][arg1][arg2] = new Class1_Sub19(local42, arg1, arg2);
			}
		}
		Static130.aClass1_Sub19ArrayArrayArray1[arg0][arg1][arg2].aClass125_1 = local8;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
	public static void method2200() {
		Static14.aClass31_3.method855();
		Static11.aClass31_1.method855();
		Static134.aClass31_22.method855();
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)Z")
	public static boolean method2202(@OriginalArg(1) int arg0) {
		@Pc(5) Class152_Sub1 local5 = Static207.method3232(arg0);
		if (local5 == null) {
			return false;
		} else if (Static127.anInt2419 == 1 || Static127.anInt2419 == 2 || Static243.anInt5013 == 2) {
			Static102.anInt1933 = local5.anInt5090;
			if (Static243.anInt5013 != 0) {
				Static254.anInt5889 = Static102.anInt1933 + 50000;
				Static89.anInt1687 = Static102.anInt1933 + 40000;
				Static52.anInt1108 = Static89.anInt1687;
			}
			Static286.aString169 = local5.aString171;
			return true;
		} else {
			@Pc(56) String local56 = "";
			@Pc(58) String local58 = "";
			if (Static243.anInt5013 != 0) {
				local56 = ":" + (local5.anInt5090 + 7000);
			}
			if (Static266.aString179 != null) {
				local58 = "/p=" + Static266.aString179;
			}
			@Pc(130) String local130 = "http://" + local5.aString171 + local56 + "/l=" + Static282.anInt5857 + "/a=" + Static129.anInt3918 + local58 + "/j" + (Static49.aBoolean90 ? "1" : "0") + ",o" + (Static286.aBoolean392 ? "1" : "0") + ",a2,m" + (Static149.aBoolean196 ? "1" : "0");
			try {
				Static95.aClient1.getAppletContext().showDocument(new URL(local130), "_self");
				return true;
			} catch (@Pc(140) Exception local140) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "(B)V")
	public static void method2203() {
		Static204.aClass31_30.method850();
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIIII)V")
	public static void method2204(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12;
		@Pc(26) int local26;
		if (Static282.anInt5856 == 0) {
			@Pc(6) int local6 = Static77.anInt1560;
			@Pc(8) int local8 = Static211.anInt958;
			@Pc(10) int local10 = Static150.anInt2786;
			local12 = Static17.anInt409;
			local26 = local12 + (arg2 - arg1) * (local10 - local12) / arg4;
			@Pc(40) int local40 = local6 + (arg3 - arg0) * (local8 - local6) / arg5;
			if (Static75.aBoolean115 && (Static14.anInt367 & 0x40) != 0) {
				@Pc(52) Class127 local52 = Static241.method3829(Static278.anInt5569, Static197.anInt3818);
				if (local52 == null) {
					Static247.method3873();
				} else {
					Static166.method2533(Static222.aString150, local26, local40, " ->", (short) 40, Static162.anInt2993, 0L);
				}
			} else {
				if (Static107.anInt1994 == 1) {
					Static166.method2533(Static38.aString23, local26, local40, "", (short) 32, -1, 0L);
				}
				Static166.method2533(Static118.aString71, local26, local40, "", (short) 14, -1, 0L);
			}
		}
		@Pc(99) long local99 = -1L;
		for (local12 = 0; local12 < Static270.anInt5412; local12++) {
			@Pc(116) long local116 = Static158.aLongArray8[local12];
			@Pc(123) int local123 = (int) local116 >> 7 & 0x7F;
			local26 = (int) local116 & 0x7F;
			@Pc(135) int local135 = (int) local116 >> 29 & 0x3;
			@Pc(142) int local142 = (int) (local116 >>> 32) & Integer.MAX_VALUE;
			if (local99 != local116) {
				local99 = local116;
				@Pc(261) int local261;
				if (local135 == 2 && Static277.method4261(Static159.anInt2978, local26, local123, local116)) {
					@Pc(162) Class104 local162 = Static35.method636(local142);
					if (local162.anIntArray350 != null) {
						local162 = local162.method2355();
					}
					if (local162 == null) {
						continue;
					}
					if (Static282.anInt5856 == 1) {
						Static166.method2533(Static149.aString96, local123, local26, Static196.aString132 + " -> <col=00ffff>" + local162.aString97, (short) 28, Static180.anInt3325, local116);
					} else if (Static75.aBoolean115) {
						@Pc(192) Class1_Sub2_Sub20 local192 = Static26.anInt574 == -1 ? null : Static47.method4517(Static26.anInt574);
						if ((Static14.anInt367 & 0x4) != 0 && (local192 == null || local162.method2359(local192.anInt5559, Static26.anInt574) != local192.anInt5559)) {
							Static166.method2533(Static222.aString150, local123, local26, Static54.aString32 + " -> <col=00ffff>" + local162.aString97, (short) 42, Static162.anInt2993, local116);
						}
					} else {
						@Pc(249) String[] local249 = local162.aStringArray13;
						if (Static244.aBoolean389) {
							local249 = Static184.method2765(local249);
						}
						if (local249 != null) {
							for (local261 = 4; local261 >= 0; local261--) {
								if (local249[local261] != null) {
									@Pc(272) short local272 = 0;
									if (local261 == 0) {
										local272 = 6;
									}
									@Pc(280) int local280 = -1;
									if (local261 == 1) {
										local272 = 25;
									}
									if (local261 == 2) {
										local272 = 48;
									}
									if (local261 == 3) {
										local272 = 33;
									}
									if (local261 == 4) {
										local272 = 1007;
									}
									if (local261 == local162.anInt2830) {
										local280 = local162.anInt2811;
									}
									if (local261 == local162.anInt2813) {
										local280 = local162.anInt2842;
									}
									Static166.method2533(local249[local261], local123, local26, "<col=00ffff>" + local162.aString97, local272, local280, local116);
								}
							}
						}
						Static166.method2533(Static179.aString114, local123, local26, "<col=00ffff>" + local162.aString97, (short) 1001, Static210.anInt4227, (long) local162.anInt2819);
					}
				}
				@Pc(514) int local514;
				@Pc(503) int local503;
				@Pc(454) int local454;
				@Pc(468) int local468;
				@Pc(481) Class6_Sub6_Sub1 local481;
				@Pc(581) Class6_Sub6_Sub2 local581;
				if (local135 == 1) {
					@Pc(401) Class6_Sub6_Sub1 local401 = Static211.aClass6_Sub6_Sub1Array2[local142];
					if ((local401.aClass19_1.anInt629 & 0x1) == 0 && (local401.anInt4562 & 0x7F) == 0 && (local401.anInt4569 & 0x7F) == 0 || (local401.aClass19_1.anInt629 & 0x1) == 1 && (local401.anInt4562 & 0x7F) == 64 && (local401.anInt4569 & 0x7F) == 64) {
						local454 = local401.anInt4562 + 64 - local401.aClass19_1.anInt629 * 64;
						local261 = local401.anInt4569 + 64 - local401.aClass19_1.anInt629 * 64;
						for (local468 = 0; local468 < Static293.anInt5831; local468++) {
							local481 = Static211.aClass6_Sub6_Sub1Array2[Static75.anIntArray178[local468]];
							if (local481 != null && !local481.aBoolean341 && local481 != local401 && local481.aBoolean339) {
								local503 = local481.anInt4569 + 64 - local481.aClass19_1.anInt629 * 64;
								local514 = local481.anInt4562 - (local481.aClass19_1.anInt629 - 1) * 64;
								if (local454 <= local514 && local401.aClass19_1.anInt629 - (local514 - local454 >> 7) >= local481.aClass19_1.anInt629 && local503 >= local261 && local481.aClass19_1.anInt629 <= local401.aClass19_1.anInt629 - (local503 - local261 >> 7)) {
									Static207.method3228(local123, local26, Static75.anIntArray178[local468], local481.aClass19_1);
									local481.aBoolean341 = true;
								}
							}
						}
						for (local468 = 0; local468 < Static241.anInt4977; local468++) {
							local581 = Static77.aClass6_Sub6_Sub2Array1[Static143.anIntArray331[local468]];
							if (local581 != null && !local581.aBoolean341 && local581.aBoolean339) {
								local514 = local581.anInt4562 + 64 - local581.method3509() * 64;
								local503 = local581.anInt4569 - (local581.method3509() - 1) * 64;
								if (local454 <= local514 && local581.method3509() <= local401.aClass19_1.anInt629 - (local514 - local454 >> 7) && local503 >= local261 && local581.method3509() <= local401.aClass19_1.anInt629 - (local503 - local261 >> 7)) {
									Static41.method754(local123, local581, local26, Static143.anIntArray331[local468]);
									local581.aBoolean341 = true;
								}
							}
						}
					}
					if (local401.aBoolean341) {
						continue;
					}
					Static207.method3228(local123, local26, local142, local401.aClass19_1);
					local401.aBoolean341 = true;
				}
				if (local135 == 0) {
					@Pc(698) Class6_Sub6_Sub2 local698 = Static77.aClass6_Sub6_Sub2Array1[local142];
					if ((local698.anInt4562 & 0x7F) == 64 && (local698.anInt4569 & 0x7F) == 64) {
						local454 = local698.anInt4562 + 64 - local698.method3509() * 64;
						local261 = local698.anInt4569 + 64 - local698.method3509() * 64;
						for (local468 = 0; local468 < Static293.anInt5831; local468++) {
							local481 = Static211.aClass6_Sub6_Sub1Array2[Static75.anIntArray178[local468]];
							if (local481 != null && !local481.aBoolean341 && local481.aBoolean339) {
								local514 = local481.anInt4562 + 64 - local481.aClass19_1.anInt629 * 64;
								local503 = local481.anInt4569 - (local481.aClass19_1.anInt629 - 1) * 64;
								if (local514 >= local454 && local481.aClass19_1.anInt629 <= local698.method3509() - (local514 - local454 >> 7) && local503 >= local261 && local481.aClass19_1.anInt629 <= local698.method3509() - (local503 - local261 >> 7)) {
									Static207.method3228(local123, local26, Static75.anIntArray178[local468], local481.aClass19_1);
									local481.aBoolean341 = true;
								}
							}
						}
						for (local468 = 0; local468 < Static241.anInt4977; local468++) {
							local581 = Static77.aClass6_Sub6_Sub2Array1[Static143.anIntArray331[local468]];
							if (local581 != null && !local581.aBoolean341 && local581 != local698 && local581.aBoolean339) {
								local514 = local581.anInt4562 + 64 - local581.method3509() * 64;
								local503 = local581.anInt4569 + 64 - local581.method3509() * 64;
								if (local514 >= local454 && local581.method3509() <= local698.method3509() - (local514 - local454 >> 7) && local503 >= local261 && local581.method3509() <= local698.method3509() - (local503 - local261 >> 7)) {
									Static41.method754(local123, local581, local26, Static143.anIntArray331[local468]);
									local581.aBoolean341 = true;
								}
							}
						}
					}
					if (local698.aBoolean341) {
						continue;
					}
					Static41.method754(local123, local698, local26, local142);
					local698.aBoolean341 = true;
				}
				if (local135 == 3) {
					@Pc(984) Class69 local984 = Static4.aClass69ArrayArrayArray1[Static159.anInt2978][local26][local123];
					if (local984 != null) {
						for (@Pc(993) Class1_Sub2_Sub5 local993 = (Class1_Sub2_Sub5) local984.method1632(); local993 != null; local993 = (Class1_Sub2_Sub5) local984.method1635()) {
							local261 = local993.aClass6_Sub7_1.anInt4998;
							@Pc(1004) Class120 local1004 = Static183.method4458(local261);
							if (Static282.anInt5856 == 1) {
								Static166.method2533(Static149.aString96, local123, local26, Static196.aString132 + " -> <col=ff9040>" + local1004.aString113, (short) 35, Static180.anInt3325, (long) local261);
							} else if (Static75.aBoolean115) {
								@Pc(1185) Class1_Sub2_Sub20 local1185 = Static26.anInt574 == -1 ? null : Static47.method4517(Static26.anInt574);
								if ((Static14.anInt367 & 0x1) != 0 && (local1185 == null || local1004.method2683(local1185.anInt5559, Static26.anInt574) != local1185.anInt5559)) {
									Static166.method2533(Static222.aString150, local123, local26, Static54.aString32 + " -> <col=ff9040>" + local1004.aString113, (short) 1, Static162.anInt2993, (long) local261);
								}
							} else {
								@Pc(1044) String[] local1044 = local1004.aStringArray16;
								if (Static244.aBoolean389) {
									local1044 = Static184.method2765(local1044);
								}
								for (local514 = 4; local514 >= 0; local514--) {
									if (local1044 != null && local1044[local514] != null) {
										@Pc(1070) byte local1070 = 0;
										if (local514 == 0) {
											local1070 = 4;
										}
										@Pc(1078) int local1078 = -1;
										if (local514 == 1) {
											local1070 = 5;
										}
										if (local514 == 2) {
											local1070 = 37;
										}
										if (local514 == local1004.anInt3261) {
											local1078 = local1004.anInt3315;
										}
										if (local1004.anInt3310 == local514) {
											local1078 = local1004.anInt3287;
										}
										if (local514 == 3) {
											local1070 = 23;
										}
										if (local514 == 4) {
											local1070 = 39;
										}
										Static166.method2533(local1044[local514], local123, local26, "<col=ff9040>" + local1004.aString113, local1070, local1078, (long) local261);
									}
								}
								Static166.method2533(Static179.aString114, local123, local26, "<col=ff9040>" + local1004.aString113, (short) 1002, Static210.anInt4227, (long) local261);
							}
						}
					}
				}
			}
		}
	}
}
