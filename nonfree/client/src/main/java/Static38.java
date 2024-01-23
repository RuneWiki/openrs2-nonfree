import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!co", name = "o", descriptor = "I")
	public static int anInt950;

	@OriginalMember(owner = "client!co", name = "k", descriptor = "I")
	public static int anInt947 = 0;

	@OriginalMember(owner = "client!co", name = "m", descriptor = "[I")
	public static int[] anIntArray120 = new int[2];

	@OriginalMember(owner = "client!co", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString54 = "Loaded input handler";

	@OriginalMember(owner = "client!co", name = "w", descriptor = "I")
	public static int anInt957 = 0;

	@OriginalMember(owner = "client!co", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString55 = " has logged in.";

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Z)V")
	public static void method796(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static7.aClass1_Sub2ArrayArrayArray1 = Static86.aClass1_Sub2ArrayArrayArray3;
			Static46.anIntArrayArrayArray1 = Static222.anIntArrayArrayArray12;
			Static111.aClass1_Sub28ArrayArray1 = Static183.aClass1_Sub28ArrayArray2;
		} else {
			Static7.aClass1_Sub2ArrayArrayArray1 = Static151.aClass1_Sub2ArrayArrayArray4;
			Static46.anIntArrayArrayArray1 = Static299.anIntArrayArrayArray14;
			Static111.aClass1_Sub28ArrayArray1 = Static261.aClass1_Sub28ArrayArray3;
		}
		Static155.anInt3493 = Static7.aClass1_Sub2ArrayArrayArray1.length;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIBILclient!o;II)Lclient!o;")
	public static Class2_Sub1 method797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) long local8 = (long) arg2;
		@Pc(14) Class2_Sub1 local14 = (Class2_Sub1) Static293.aClass89_51.method2268(local8);
		if (local14 == null) {
			@Pc(22) Class2_Sub3 local22 = Static30.method658(Static112.aClass168_84, arg2);
			if (local22 == null) {
				return null;
			}
			local14 = local22.method651(64, 768, -50, -10, -50);
			Static293.aClass89_51.method2272(local8, local14);
		}
		@Pc(43) int local43 = arg3.method575();
		@Pc(46) int local46 = arg3.method558();
		@Pc(49) int local49 = arg3.method573();
		@Pc(52) int local52 = arg3.method549();
		local14 = local14.method564(true, true, true);
		if (arg5 != 0) {
			local14.method556(arg5);
		}
		@Pc(105) int local105;
		if (Static294.aBoolean367) {
			@Pc(146) Class2_Sub1_Sub1 local146 = (Class2_Sub1_Sub1) local14;
			if (arg4 != Static93.method1576(local49 + arg0, arg1 + local43, Static185.anInt4085) || Static93.method1576(arg0 + local52, local46 + arg1, Static185.anInt4085) != arg4) {
				for (local105 = 0; local105 < local146.anInt79; local105++) {
					local146.anIntArray9[local105] += Static93.method1576(arg0 + local146.anIntArray4[local105], local146.anIntArray6[local105] - -arg1, Static185.anInt4085) - arg4;
				}
				local146.aClass165_4.aBoolean331 = false;
				local146.aClass77_1.aBoolean154 = false;
			}
		} else {
			@Pc(72) Class2_Sub1_Sub2 local72 = (Class2_Sub1_Sub2) local14;
			if (arg4 != Static93.method1576(local49 + arg0, local43 + arg1, Static185.anInt4085) || Static93.method1576(local52 + arg0, arg1 - -local46, Static185.anInt4085) != arg4) {
				for (local105 = 0; local105 < local72.anInt704; local105++) {
					local72.anIntArray60[local105] += Static93.method1576(local72.anIntArray67[local105] + arg0, local72.anIntArray61[local105] - -arg1, Static185.anInt4085) - arg4;
				}
				local72.aBoolean41 = false;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIII)V")
	public static void method798(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(12) int local12 = -arg1;
		@Pc(20) int local20 = -1;
		@Pc(28) int local28 = Static131.method2259(Static310.anInt6206, arg2 + arg1, Static170.anInt3814);
		@Pc(39) int local39 = Static131.method2259(Static310.anInt6206, arg2 - arg1, Static170.anInt3814);
		Static98.method3942(local28, Static121.anIntArrayArray33[arg3], arg0, local39);
		while (local7 < local9) {
			local20 += 2;
			local12 += local20;
			@Pc(75) int local75;
			@Pc(79) int local79;
			@Pc(95) int local95;
			@Pc(104) int local104;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local75 = arg3 - local9;
				local79 = local9 + arg3;
				if (Static206.anInt4449 <= local79 && Static90.anInt2088 >= local75) {
					local95 = Static131.method2259(Static310.anInt6206, arg2 + local7, Static170.anInt3814);
					local104 = Static131.method2259(Static310.anInt6206, arg2 - local7, Static170.anInt3814);
					if (local79 <= Static90.anInt2088) {
						Static98.method3942(local95, Static121.anIntArrayArray33[local79], arg0, local104);
					}
					if (Static206.anInt4449 <= local75) {
						Static98.method3942(local95, Static121.anIntArrayArray33[local75], arg0, local104);
					}
				}
			}
			local7++;
			local75 = arg3 - local7;
			local79 = local7 + arg3;
			if (local79 >= Static206.anInt4449 && local75 <= Static90.anInt2088) {
				local95 = Static131.method2259(Static310.anInt6206, local9 + arg2, Static170.anInt3814);
				local104 = Static131.method2259(Static310.anInt6206, arg2 - local9, Static170.anInt3814);
				if (Static90.anInt2088 >= local79) {
					Static98.method3942(local95, Static121.anIntArrayArray33[local79], arg0, local104);
				}
				if (local75 >= Static206.anInt4449) {
					Static98.method3942(local95, Static121.anIntArrayArray33[local75], arg0, local104);
				}
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "d", descriptor = "(I)V")
	public static void method799() {
		if (Static253.anInt5118 == 0 || Static253.anInt5118 == 5) {
			return;
		}
		try {
			if (++Static171.anInt3850 > 2000) {
				if (Static5.aClass104_5 != null) {
					Static5.aClass104_5.method2571();
					Static5.aClass104_5 = null;
				}
				if (Static297.anInt5910 >= 1) {
					Static271.anInt5421 = -5;
					Static253.anInt5118 = 0;
					return;
				}
				Static297.anInt5910++;
				Static171.anInt3850 = 0;
				Static253.anInt5118 = 1;
				if (Static188.anInt4156 == Static265.anInt5307) {
					Static188.anInt4156 = Static277.anInt5551;
				} else {
					Static188.anInt4156 = Static265.anInt5307;
				}
			}
			if (Static253.anInt5118 == 1) {
				Static315.aClass47_8 = Static142.aClass112_2.method2889(Static44.aString59, Static188.anInt4156);
				Static253.anInt5118 = 2;
			}
			if (Static253.anInt5118 == 2) {
				if (Static315.aClass47_8.anInt1417 == 2) {
					throw new IOException();
				}
				if (Static315.aClass47_8.anInt1417 != 1) {
					return;
				}
				Static5.aClass104_5 = new Class104((Socket) Static315.aClass47_8.anObject2, Static142.aClass112_2);
				Static315.aClass47_8 = null;
				@Pc(102) long local102 = Static22.aLong33 = Static247.method3809(Static161.aString215);
				Static2.aClass1_Sub14_Sub1_1.anInt3000 = 0;
				Static2.aClass1_Sub14_Sub1_1.method2191(14);
				@Pc(116) int local116 = (int) (local102 >> 16 & 0x1FL);
				Static2.aClass1_Sub14_Sub1_1.method2191(local116);
				Static5.aClass104_5.method2579(Static2.aClass1_Sub14_Sub1_1.aByteArray55, 2);
				if (Static114.aClass15_1 != null) {
					Static114.aClass15_1.method1249();
				}
				if (Static157.aClass15_2 != null) {
					Static157.aClass15_2.method1249();
				}
				@Pc(144) int local144 = Static5.aClass104_5.method2573();
				if (Static114.aClass15_1 != null) {
					Static114.aClass15_1.method1249();
				}
				if (Static157.aClass15_2 != null) {
					Static157.aClass15_2.method1249();
				}
				if (local144 != 0) {
					Static253.anInt5118 = 0;
					Static271.anInt5421 = local144;
					Static5.aClass104_5.method2571();
					Static5.aClass104_5 = null;
					return;
				}
				Static253.anInt5118 = 3;
			}
			if (Static253.anInt5118 == 3) {
				if (Static5.aClass104_5.method2581() < 8) {
					return;
				}
				@Pc(183) int[] local183 = new int[4];
				Static5.aClass104_5.method2574(Static140.aClass1_Sub14_Sub1_2.aByteArray55, 0, 8);
				Static140.aClass1_Sub14_Sub1_2.anInt3000 = 0;
				Static10.aLong8 = Static140.aClass1_Sub14_Sub1_2.method2213();
				local183[3] = (int) Static10.aLong8;
				local183[1] = (int) (Math.random() * 9.9999999E7D);
				local183[2] = (int) (Static10.aLong8 >> 32);
				Static2.aClass1_Sub14_Sub1_1.anInt3000 = 0;
				local183[0] = (int) (Math.random() * 9.9999999E7D);
				Static2.aClass1_Sub14_Sub1_1.method2191(10);
				Static2.aClass1_Sub14_Sub1_1.method2236(local183[0]);
				Static2.aClass1_Sub14_Sub1_1.method2236(local183[1]);
				Static2.aClass1_Sub14_Sub1_1.method2236(local183[2]);
				Static2.aClass1_Sub14_Sub1_1.method2236(local183[3]);
				Static2.aClass1_Sub14_Sub1_1.method2193(Static247.method3809(Static161.aString215));
				Static2.aClass1_Sub14_Sub1_1.method2188(Static68.aString88);
				Static2.aClass1_Sub14_Sub1_1.method2231(Static65.aBigInteger1, Static142.aBigInteger2);
				Static183.aClass1_Sub14_Sub1_3.anInt3000 = 0;
				if (Static96.anInt2212 == 40) {
					Static183.aClass1_Sub14_Sub1_3.method2191(18);
				} else {
					Static183.aClass1_Sub14_Sub1_3.method2191(16);
				}
				Static183.aClass1_Sub14_Sub1_3.method2208(Static2.aClass1_Sub14_Sub1_1.anInt3000 + Static34.method690(Static210.aString313) + 163);
				Static183.aClass1_Sub14_Sub1_3.method2236(551);
				Static183.aClass1_Sub14_Sub1_3.method2191(Static22.anInt613);
				Static183.aClass1_Sub14_Sub1_3.method2191(Static245.aBoolean315 ? 1 : 0);
				Static183.aClass1_Sub14_Sub1_3.method2191(1);
				Static183.aClass1_Sub14_Sub1_3.method2191(Static217.method3458());
				Static183.aClass1_Sub14_Sub1_3.method2208(anInt950);
				Static183.aClass1_Sub14_Sub1_3.method2208(Static270.anInt5412);
				Static183.aClass1_Sub14_Sub1_3.method2191(Static309.anInt6196);
				Static315.method4761(Static183.aClass1_Sub14_Sub1_3);
				Static183.aClass1_Sub14_Sub1_3.method2188(Static210.aString313);
				Static183.aClass1_Sub14_Sub1_3.method2236(Static23.anInt656);
				Static183.aClass1_Sub14_Sub1_3.method2236(Static70.method1177());
				Static123.aBoolean162 = true;
				Static183.aClass1_Sub14_Sub1_3.method2208(Static241.anInt5007);
				Static183.aClass1_Sub14_Sub1_3.method2236(Static149.aClass168_112.method4064());
				Static183.aClass1_Sub14_Sub1_3.method2236(Static31.aClass168_25.method4064());
				Static183.aClass1_Sub14_Sub1_3.method2236(Static197.aClass168_145.method4064());
				Static183.aClass1_Sub14_Sub1_3.method2236(Static57.aClass168_212.method4064());
				Static183.aClass1_Sub14_Sub1_3.method2236(Static281.aClass168_98.method4064());
				Static183.aClass1_Sub14_Sub1_3.method2236(Static124.aClass168_93.method4064());
				Static183.aClass1_Sub14_Sub1_3.method2236(Static310.aClass168_209.method4064());
				Static183.aClass1_Sub14_Sub1_3.method2236(Static112.aClass168_84.method4064());
				Static183.aClass1_Sub14_Sub1_3.method2236(Static277.aClass168_188.method4064());
				Static183.aClass1_Sub14_Sub1_3.method2236(Static65.aClass168_50.method4064());
				Static183.aClass1_Sub14_Sub1_3.method2236(Static122.aClass168_91.method4064());
				Static183.aClass1_Sub14_Sub1_3.method2236(Static27.aClass168_148.method4064());
				Static183.aClass1_Sub14_Sub1_3.method2236(Static208.aClass168_154.method4064());
				Static183.aClass1_Sub14_Sub1_3.method2236(Static41.aClass168_34.method4064());
				Static183.aClass1_Sub14_Sub1_3.method2236(Static53.aClass168_41.method4064());
				Static183.aClass1_Sub14_Sub1_3.method2236(Static207.aClass168_152.method4064());
				Static183.aClass1_Sub14_Sub1_3.method2236(Static262.aClass168_178.method4064());
				Static183.aClass1_Sub14_Sub1_3.method2236(Static188.aClass168_139.method4064());
				Static183.aClass1_Sub14_Sub1_3.method2236(Static183.aClass168_134.method4064());
				Static183.aClass1_Sub14_Sub1_3.method2236(Static37.aClass168_30.method4064());
				Static183.aClass1_Sub14_Sub1_3.method2236(Static197.aClass168_144.method4064());
				Static183.aClass1_Sub14_Sub1_3.method2236(Static2.aClass168_4.method4064());
				Static183.aClass1_Sub14_Sub1_3.method2236(Static87.aClass168_66.method4064());
				Static183.aClass1_Sub14_Sub1_3.method2236(Static280.aClass168_191.method4064());
				Static183.aClass1_Sub14_Sub1_3.method2236(Static106.aClass168_81.method4064());
				Static183.aClass1_Sub14_Sub1_3.method2236(Static54.aClass168_42.method4064());
				Static183.aClass1_Sub14_Sub1_3.method2236(Static100.aClass168_78.method4064());
				Static183.aClass1_Sub14_Sub1_3.method2236(Static11.aClass168_13.method4064());
				Static183.aClass1_Sub14_Sub1_3.method2236(Static90.aClass168_71.method4064());
				Static183.aClass1_Sub14_Sub1_3.method2201(Static2.aClass1_Sub14_Sub1_1.anInt3000, Static2.aClass1_Sub14_Sub1_1.aByteArray55);
				Static5.aClass104_5.method2579(Static183.aClass1_Sub14_Sub1_3.aByteArray55, Static183.aClass1_Sub14_Sub1_3.anInt3000);
				Static2.aClass1_Sub14_Sub1_1.method2258(local183);
				for (@Pc(553) int local553 = 0; local553 < 4; local553++) {
					local183[local553] += 50;
				}
				Static140.aClass1_Sub14_Sub1_2.method2258(local183);
				Static253.anInt5118 = 4;
			}
			if (Static253.anInt5118 == 4) {
				if (Static5.aClass104_5.method2581() < 1) {
					return;
				}
				@Pc(589) int local589 = Static5.aClass104_5.method2573();
				if (local589 == 21) {
					Static253.anInt5118 = 7;
				} else if (local589 == 29) {
					Static253.anInt5118 = 10;
				} else if (local589 == 1) {
					Static253.anInt5118 = 5;
					Static271.anInt5421 = local589;
					return;
				} else if (local589 == 2) {
					Static253.anInt5118 = 8;
				} else if (local589 == 15) {
					Static271.anInt5421 = local589;
					Static253.anInt5118 = 0;
					return;
				} else if (local589 == 23 && Static297.anInt5910 < 1) {
					Static253.anInt5118 = 1;
					Static297.anInt5910++;
					Static171.anInt3850 = 0;
					Static5.aClass104_5.method2571();
					Static5.aClass104_5 = null;
					return;
				} else {
					Static253.anInt5118 = 0;
					Static271.anInt5421 = local589;
					Static5.aClass104_5.method2571();
					Static5.aClass104_5 = null;
					return;
				}
			}
			if (Static253.anInt5118 == 6) {
				Static2.aClass1_Sub14_Sub1_1.anInt3000 = 0;
				Static2.aClass1_Sub14_Sub1_1.method2252(17);
				Static5.aClass104_5.method2579(Static2.aClass1_Sub14_Sub1_1.aByteArray55, Static2.aClass1_Sub14_Sub1_1.anInt3000);
				Static253.anInt5118 = 4;
				return;
			}
			label292: {
				if (Static253.anInt5118 != 7) {
					if (Static253.anInt5118 == 10) {
						if (Static5.aClass104_5.method2581() >= 1) {
							Static161.anInt3536 = Static5.aClass104_5.method2573();
							Static271.anInt5421 = 29;
							Static253.anInt5118 = 0;
							Static5.aClass104_5.method2571();
							Static5.aClass104_5 = null;
							return;
						}
						return;
					}
					if (Static253.anInt5118 != 8) {
						break label292;
					}
					if (Static5.aClass104_5.method2581() >= 14) {
						Static5.aClass104_5.method2574(Static140.aClass1_Sub14_Sub1_2.aByteArray55, 0, 14);
						Static140.aClass1_Sub14_Sub1_2.anInt3000 = 0;
						Static77.anInt1764 = Static140.aClass1_Sub14_Sub1_2.method2199();
						Static265.anInt5313 = Static140.aClass1_Sub14_Sub1_2.method2199();
						Static50.aBoolean16 = Static140.aClass1_Sub14_Sub1_2.method2199() == 1;
						Static159.aBoolean228 = Static140.aClass1_Sub14_Sub1_2.method2199() == 1;
						Static257.aBoolean323 = Static140.aClass1_Sub14_Sub1_2.method2199() == 1;
						Static80.aBoolean125 = Static140.aClass1_Sub14_Sub1_2.method2199() == 1;
						Static143.aBoolean212 = Static140.aClass1_Sub14_Sub1_2.method2199() == 1;
						Static62.anInt1348 = Static140.aClass1_Sub14_Sub1_2.method2244();
						Static247.aBoolean316 = Static140.aClass1_Sub14_Sub1_2.method2199() == 1;
						Static160.aBoolean229 = Static140.aClass1_Sub14_Sub1_2.method2199() == 1;
						Static228.method3617(Static160.aBoolean229);
						Static197.method3141(Static160.aBoolean229);
						Static63.method1124(Static160.aBoolean229);
						if (!Static245.aBoolean315) {
							if (Static50.aBoolean16 && !Static257.aBoolean323 || Static247.aBoolean316) {
								try {
									Static317.method295(Static142.aClass112_2.anApplet1, "zap");
								} catch (@Pc(874) Throwable local874) {
								}
							} else {
								try {
									Static317.method295(Static142.aClass112_2.anApplet1, "unzap");
								} catch (@Pc(884) Throwable local884) {
								}
							}
						}
						try {
							Static317.method295(Static142.aClass112_2.anApplet1, "loggedin");
						} catch (@Pc(892) Throwable local892) {
						}
						Static281.anInt2783 = Static140.aClass1_Sub14_Sub1_2.method2261();
						Static188.anInt4164 = Static140.aClass1_Sub14_Sub1_2.method2244();
						Static253.anInt5118 = 9;
						break label292;
					}
					return;
				}
				if (Static5.aClass104_5.method2581() >= 1) {
					Static193.anInt4251 = Static5.aClass104_5.method2573() * 60 + 180;
					Static271.anInt5421 = 21;
					Static253.anInt5118 = 0;
					Static5.aClass104_5.method2571();
					Static5.aClass104_5 = null;
					return;
				}
				return;
			}
			if (Static253.anInt5118 == 9) {
				if (Static5.aClass104_5.method2581() >= Static188.anInt4164) {
					Static140.aClass1_Sub14_Sub1_2.anInt3000 = 0;
					Static5.aClass104_5.method2574(Static140.aClass1_Sub14_Sub1_2.aByteArray55, 0, Static188.anInt4164);
					Static253.anInt5118 = 0;
					Static271.anInt5421 = 2;
					Static117.method3398();
					Static288.anInt5790 = -1;
					Static206.method3269(false);
					Static281.anInt2783 = -1;
					return;
				}
				return;
			}
		} catch (@Pc(944) IOException local944) {
			if (Static5.aClass104_5 != null) {
				Static5.aClass104_5.method2571();
				Static5.aClass104_5 = null;
			}
			if (Static297.anInt5910 >= 1) {
				Static253.anInt5118 = 0;
				Static271.anInt5421 = -4;
			} else {
				Static171.anInt3850 = 0;
				Static253.anInt5118 = 1;
				Static297.anInt5910++;
				if (Static265.anInt5307 == Static188.anInt4156) {
					Static188.anInt4156 = Static277.anInt5551;
				} else {
					Static188.anInt4156 = Static265.anInt5307;
				}
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "([ILclient!fc;Z[I[I)V")
	public static void method800(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class2_Sub4_Sub1 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			@Pc(20) int local20 = arg0[local12];
			@Pc(24) int local24 = arg3[local12];
			@Pc(28) int local28 = arg2[local12];
			@Pc(30) int local30 = 0;
			while (local24 != 0 && local30 < arg1.aClass36Array3.length) {
				if ((local24 & 0x1) != 0) {
					if (local20 == -1) {
						arg1.aClass36Array3[local30] = null;
					} else {
						@Pc(65) Class32 local65 = Static202.method3231(local20);
						@Pc(68) int local68 = local65.anInt972;
						@Pc(73) Class36 local73 = arg1.aClass36Array3[local30];
						if (local73 != null) {
							if (local73.anInt1069 == local20) {
								if (local68 == 0) {
									local73 = arg1.aClass36Array3[local30] = null;
								} else if (local68 == 1) {
									local73.anInt1066 = 0;
									local73.anInt1064 = 1;
									local73.anInt1067 = local28;
									local73.anInt1065 = 0;
									local73.anInt1068 = 0;
									Static154.method2507(false, arg1.anInt2846, arg1.anInt2794, 0, local65);
								} else if (local68 == 2) {
									local73.anInt1065 = 0;
								}
							} else if (local65.anInt967 >= Static202.method3231(local73.anInt1069).anInt967) {
								local73 = arg1.aClass36Array3[local30] = null;
							}
						}
						if (local73 == null) {
							local73 = arg1.aClass36Array3[local30] = new Class36();
							local73.anInt1069 = local20;
							local73.anInt1064 = 1;
							local73.anInt1066 = 0;
							local73.anInt1068 = 0;
							local73.anInt1067 = local28;
							local73.anInt1065 = 0;
							Static154.method2507(false, arg1.anInt2846, arg1.anInt2794, 0, local65);
						}
					}
				}
				local30++;
				local24 >>>= 0x1;
			}
		}
	}
}
