import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!vi", name = "n", descriptor = "F")
	public static float aFloat54;

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "Lclient!ec;")
	public static Class46 aClass46_40 = new Class46(30);

	@OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
	public static int anInt5822 = 0;

	@OriginalMember(owner = "client!vi", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString277 = "Please remove ";

	@OriginalMember(owner = "client!vi", name = "q", descriptor = "I")
	public static int anInt5823 = 0;

	@OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
	public static int anInt5824 = 0;

	@OriginalMember(owner = "client!vi", name = "s", descriptor = "Lclient!a;")
	public static Class1 aClass1_33 = new Class1();

	@OriginalMember(owner = "client!vi", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString278 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V")
	public static void method4654() {
		Static186.aClass46_31.method1079();
		Static144.aClass46_24.method1079();
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIIIII)V")
	public static void method4655(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static140.anInt3023 = 0;
		@Pc(5) int local5;
		@Pc(620) int local620;
		@Pc(243) int local243;
		@Pc(106) int local106;
		@Pc(147) int local147;
		@Pc(194) int local194;
		@Pc(617) int local617;
		for (local5 = -1; local5 < Static68.anInt1507 + Static71.anInt1550; local5++) {
			@Pc(27) Class36_Sub3 local27;
			if (local5 == -1) {
				local27 = Static111.aClass36_Sub3_Sub2_1;
			} else if (local5 < Static68.anInt1507) {
				local27 = Static212.aClass36_Sub3_Sub2Array1[Static33.anIntArray50[local5]];
			} else {
				local27 = Static201.aClass36_Sub3_Sub1Array1[Static9.anIntArray12[local5 - Static68.anInt1507]];
			}
			if (local27 != null && local27.method4099()) {
				@Pc(58) Class33 local58;
				if (local27 instanceof Class36_Sub3_Sub1) {
					local58 = ((Class36_Sub3_Sub1) local27).aClass33_1;
					if (local58.anIntArray55 != null) {
						local58 = local58.method719();
					}
					if (local58 == null) {
						continue;
					}
				}
				@Pc(325) int local325;
				if (Static68.anInt1507 <= local5) {
					local58 = ((Class36_Sub3_Sub1) local27).aClass33_1;
					if (local58.anIntArray55 != null) {
						local58 = local58.method719();
					}
					if (local58.anInt867 >= 0 && Static61.aClass2_Sub3_Sub1Array7.length > local58.anInt867) {
						if (local58.anInt891 == -1) {
							local106 = local27.method4101() + 15;
						} else {
							local106 = local58.anInt891 + 15;
						}
						Static271.method4528(arg4 >> 1, local106, arg2, arg3 >> 1, arg0, local27);
						if (Static202.anInt4222 > -1) {
							Static61.aClass2_Sub3_Sub1Array7[local58.anInt867].method4367(Static202.anInt4222 + arg5 - 12, Static243.anInt3774 + arg1 + -30);
						}
					}
					@Pc(145) Class180[] local145 = Static289.aClass180Array1;
					for (local147 = 0; local147 < local145.length; local147++) {
						@Pc(155) Class180 local155 = local145[local147];
						if (local155 != null && local155.anInt5905 == 1 && Static9.anIntArray12[local5 - Static68.anInt1507] == local155.anInt5897 && Static148.anInt3168 % 20 < 10) {
							if (local58.anInt891 == -1) {
								local194 = local27.method4101() + 15;
							} else {
								local194 = local58.anInt891 + 15;
							}
							Static271.method4528(arg4 >> 1, local194, arg2, arg3 >> 1, arg0, local27);
							if (Static202.anInt4222 > -1) {
								Static106.aClass2_Sub3_Sub1Array6[local155.anInt5904].method4367(Static202.anInt4222 + arg5 - 12, arg1 - (-Static243.anInt3774 + 28));
							}
						}
					}
				} else {
					@Pc(241) Class36_Sub3_Sub2 local241 = (Class36_Sub3_Sub2) local27;
					local243 = 30;
					if (local241.anInt5175 != -1 || local241.anInt5150 != -1) {
						Static271.method4528(arg4 >> 1, local27.method4101() + 15, arg2, arg3 >> 1, arg0, local27);
						if (Static202.anInt4222 > -1) {
							if (local241.anInt5175 != -1) {
								Static286.aClass2_Sub3_Sub1Array11[local241.anInt5175].method4367(Static202.anInt4222 + arg5 - 12, Static243.anInt3774 + -30 + arg1);
								local243 += 25;
							}
							if (local241.anInt5150 != -1) {
								Static61.aClass2_Sub3_Sub1Array7[local241.anInt5150].method4367(Static202.anInt4222 + arg5 - 12, -local243 + Static243.anInt3774 + arg1);
								local243 += 25;
							}
						}
					}
					if (local5 >= 0) {
						@Pc(323) Class180[] local323 = Static289.aClass180Array1;
						for (local325 = 0; local325 < local323.length; local325++) {
							@Pc(333) Class180 local333 = local323[local325];
							if (local333 != null && local333.anInt5905 == 10 && Static33.anIntArray50[local5] == local333.anInt5897) {
								Static271.method4528(arg4 >> 1, local27.method4101() + 15, arg2, arg3 >> 1, arg0, local27);
								if (Static202.anInt4222 > -1) {
									Static106.aClass2_Sub3_Sub1Array6[local333.anInt5904].method4367(Static202.anInt4222 + arg5 - 12, arg1 - -Static243.anInt3774 + -local243);
								}
							}
						}
					}
				}
				if (local27.aString248 != null && (Static68.anInt1507 <= local5 || Static169.anInt3576 == 0 || Static169.anInt3576 == 3 || Static169.anInt3576 == 1 && Static264.method4419(((Class36_Sub3_Sub2) local27).aString249))) {
					Static271.method4528(arg4 >> 1, local27.method4101(), arg2, arg3 >> 1, arg0, local27);
					if (Static202.anInt4222 > -1 && Static129.anInt2675 > Static140.anInt3023) {
						Static129.anIntArray181[Static140.anInt3023] = Static153.aClass2_Sub3_Sub5_1.method3325(local27.aString248) / 2;
						Static129.anIntArray178[Static140.anInt3023] = Static153.aClass2_Sub3_Sub5_1.anInt4070;
						Static129.anIntArray180[Static140.anInt3023] = Static202.anInt4222;
						Static129.anIntArray177[Static140.anInt3023] = Static243.anInt3774;
						Static129.anIntArray176[Static140.anInt3023] = local27.anInt5139;
						Static129.anIntArray182[Static140.anInt3023] = local27.anInt5148;
						Static129.anIntArray179[Static140.anInt3023] = local27.anInt5066;
						Static129.aStringArray11[Static140.anInt3023] = local27.aString248;
						Static140.anInt3023++;
					}
				}
				if (Static148.anInt3168 < local27.anInt5065) {
					@Pc(488) Class2_Sub3_Sub1 local488 = Static197.aClass2_Sub3_Sub1Array8[1];
					@Pc(492) Class2_Sub3_Sub1 local492 = Static197.aClass2_Sub3_Sub1Array8[0];
					if (local27 instanceof Class36_Sub3_Sub1) {
						@Pc(504) Class36_Sub3_Sub1 local504 = (Class36_Sub3_Sub1) local27;
						@Pc(514) Class2_Sub3_Sub1[] local514 = (Class2_Sub3_Sub1[]) Static75.aClass46_11.method1074((long) local504.aClass33_1.anInt882);
						if (local514 == null) {
							local514 = Static56.method1091(local504.aClass33_1.anInt882, Static201.aClass84_85);
							if (local514 != null) {
								Static75.aClass46_11.method1071(local514, (long) local504.aClass33_1.anInt882);
							}
						}
						@Pc(537) Class33 local537 = local504.aClass33_1;
						if (local514 != null && local514.length == 2) {
							local488 = local514[1];
							local492 = local514[0];
						}
						if (local537.anInt891 == -1) {
							local147 = local27.method4101();
						} else {
							local147 = local537.anInt891;
						}
					} else {
						local147 = local27.method4101();
					}
					Static271.method4528(arg4 >> 1, local147 + local492.anInt5462 + 10, arg2, arg3 >> 1, arg0, local27);
					if (Static202.anInt4222 > -1) {
						local325 = arg5 + Static202.anInt4222 - (local492.anInt5453 >> 1);
						local194 = arg1 + Static243.anInt3774 - 3;
						local492.method4367(local325, local194);
						local617 = local492.anInt5453 * local27.anInt5135 / 255;
						local620 = local492.anInt5462;
						if (Static60.aBoolean106) {
							Static94.method1754(local325, local194, local325 + local617, local620 + local194);
						} else {
							Static160.method2789(local325, local194, local617 + local325, local620 + local194);
						}
						local488.method4367(local325, local194);
						if (Static60.aBoolean106) {
							Static94.method1752(arg5, arg1, arg5 + arg4, arg1 + arg3);
						} else {
							Static160.method2781(arg5, arg1, arg4 + arg5, arg3 + arg1);
						}
					}
				}
				for (local243 = 0; local243 < 4; local243++) {
					if (local27.anIntArray467[local243] > Static148.anInt3168) {
						if (local27 instanceof Class36_Sub3_Sub1) {
							@Pc(687) Class36_Sub3_Sub1 local687 = (Class36_Sub3_Sub1) local27;
							@Pc(690) Class33 local690 = local687.aClass33_1;
							if (local690.anInt891 == -1) {
								local106 = local27.method4101() / 2;
							} else {
								local106 = local690.anInt891 / 2;
							}
						} else {
							local106 = local27.method4101() / 2;
						}
						Static271.method4528(arg4 >> 1, local106, arg2, arg3 >> 1, arg0, local27);
						if (Static202.anInt4222 > -1) {
							if (local243 == 1) {
								Static243.anInt3774 -= 20;
							}
							if (local243 == 2) {
								Static243.anInt3774 -= 10;
								Static202.anInt4222 -= 15;
							}
							if (local243 == 3) {
								Static243.anInt3774 -= 10;
								Static202.anInt4222 += 15;
							}
							Static77.aClass2_Sub3_Sub1Array5[local27.anIntArray464[local243]].method4367(Static202.anInt4222 + arg5 - 12, Static243.anInt3774 + -12 + arg1);
							Static162.aClass2_Sub3_Sub5_2.method3308(Integer.toString(local27.anIntArray466[local243]), Static202.anInt4222 + arg5 - 1, arg1 - (-Static243.anInt3774 + -3), 16777215, 0);
						}
					}
				}
			}
		}
		for (local5 = 0; local5 < Static140.anInt3023; local5++) {
			@Pc(827) int local827 = Static129.anIntArray180[local5];
			local243 = Static129.anIntArray177[local5];
			local147 = Static129.anIntArray178[local5];
			local106 = Static129.anIntArray181[local5];
			@Pc(841) boolean local841 = true;
			while (local841) {
				local841 = false;
				for (local194 = 0; local194 < local5; local194++) {
					if (Static129.anIntArray177[local194] - Static129.anIntArray178[local194] < local243 + 2 && Static129.anIntArray177[local194] + 2 > -local147 + local243 && Static129.anIntArray181[local194] + Static129.anIntArray180[local194] > local827 + -local106 && local106 + local827 > Static129.anIntArray180[local194] + -Static129.anIntArray181[local194] && local243 > Static129.anIntArray177[local194] - Static129.anIntArray178[local194]) {
						local841 = true;
						local243 = Static129.anIntArray177[local194] - Static129.anIntArray178[local194];
					}
				}
			}
			Static202.anInt4222 = Static129.anIntArray180[local5];
			Static243.anInt3774 = Static129.anIntArray177[local5] = local243;
			@Pc(948) String local948 = Static129.aStringArray11[local5];
			if (Static157.anInt3296 == 0) {
				local617 = 16776960;
				if (Static129.anIntArray176[local5] < 6) {
					local617 = Static234.anIntArray436[Static129.anIntArray176[local5]];
				}
				if (Static129.anIntArray176[local5] == 6) {
					local617 = Static213.anInt4460 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static129.anIntArray176[local5] == 7) {
					local617 = Static213.anInt4460 % 20 >= 10 ? 65535 : 255;
				}
				if (Static129.anIntArray176[local5] == 8) {
					local617 = Static213.anInt4460 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Static129.anIntArray176[local5] == 9) {
					local620 = 150 - Static129.anIntArray179[local5];
					if (local620 < 50) {
						local617 = local620 * 1280 + 16711680;
					} else if (local620 < 100) {
						local617 = 16776960 - (local620 - 50) * 327680;
					} else if (local620 < 150) {
						local617 = (local620 - 100) * 5 + 65280;
					}
				}
				if (Static129.anIntArray176[local5] == 10) {
					local620 = 150 - Static129.anIntArray179[local5];
					if (local620 < 50) {
						local617 = local620 * 5 + 16711680;
					} else if (local620 < 100) {
						local617 = 16711935 + 16384000 - local620 * 327680;
					} else if (local620 < 150) {
						local617 = (local620 - 100) * 327680 + 255 + 500 - local620 * 5;
					}
				}
				if (Static129.anIntArray176[local5] == 11) {
					local620 = 150 - Static129.anIntArray179[local5];
					if (local620 < 50) {
						local617 = 16777215 - local620 * 327685;
					} else if (local620 < 100) {
						local617 = (local620 - 50) * 327685 + 65280;
					} else if (local620 < 150) {
						local617 = 32768000 + 16777215 - local620 * 327680;
					}
				}
				if (Static129.anIntArray182[local5] == 0) {
					Static153.aClass2_Sub3_Sub5_1.method3308(local948, Static202.anInt4222 + arg5, Static243.anInt3774 + arg1, local617, 0);
				}
				if (Static129.anIntArray182[local5] == 1) {
					Static153.aClass2_Sub3_Sub5_1.method3312(local948, Static202.anInt4222 + arg5, Static243.anInt3774 + arg1, local617, Static213.anInt4460);
				}
				if (Static129.anIntArray182[local5] == 2) {
					Static153.aClass2_Sub3_Sub5_1.method3326(local948, Static202.anInt4222 + arg5, Static243.anInt3774 + arg1, local617, Static213.anInt4460);
				}
				if (Static129.anIntArray182[local5] == 3) {
					Static153.aClass2_Sub3_Sub5_1.method3310(local948, Static202.anInt4222 + arg5, Static243.anInt3774 + arg1, local617, Static213.anInt4460, 150 - Static129.anIntArray179[local5]);
				}
				if (Static129.anIntArray182[local5] == 4) {
					local620 = (150 - Static129.anIntArray179[local5]) * (Static153.aClass2_Sub3_Sub5_1.method3325(local948) + 100) / 150;
					if (Static60.aBoolean106) {
						Static94.method1754(arg5 + Static202.anInt4222 - 50, arg1, arg5 + Static202.anInt4222 + 50, arg3 + arg1);
					} else {
						Static160.method2789(Static202.anInt4222 + arg5 - 50, arg1, Static202.anInt4222 + arg5 + 50, arg1 + arg3);
					}
					Static153.aClass2_Sub3_Sub5_1.method3317(local948, Static202.anInt4222 + arg5 + 50 - local620, arg1 - -Static243.anInt3774, local617, 0);
					if (Static60.aBoolean106) {
						Static94.method1752(arg5, arg1, arg5 + arg4, arg1 - -arg3);
					} else {
						Static160.method2781(arg5, arg1, arg5 + arg4, arg3 + arg1);
					}
				}
				if (Static129.anIntArray182[local5] == 5) {
					local620 = 150 - Static129.anIntArray179[local5];
					if (Static60.aBoolean106) {
						Static94.method1754(arg5, Static243.anInt3774 + arg1 - Static153.aClass2_Sub3_Sub5_1.anInt4070 - 1, arg4 + arg5, Static243.anInt3774 + arg1 + 5);
					} else {
						Static160.method2789(arg5, arg1 + Static243.anInt3774 - Static153.aClass2_Sub3_Sub5_1.anInt4070 - 1, arg4 + arg5, arg1 + Static243.anInt3774 + 5);
					}
					@Pc(1431) int local1431 = 0;
					if (local620 < 25) {
						local1431 = local620 - 25;
					} else if (local620 > 125) {
						local1431 = local620 - 125;
					}
					Static153.aClass2_Sub3_Sub5_1.method3308(local948, Static202.anInt4222 + arg5, local1431 + Static243.anInt3774 + arg1, local617, 0);
					if (Static60.aBoolean106) {
						Static94.method1752(arg5, arg1, arg5 + arg4, arg1 + arg3);
					} else {
						Static160.method2781(arg5, arg1, arg5 + arg4, arg3 + arg1);
					}
				}
			} else {
				Static153.aClass2_Sub3_Sub5_1.method3308(local948, arg5 + Static202.anInt4222, arg1 + Static243.anInt3774, 16776960, 0);
			}
		}
	}
}
