import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "n", descriptor = "[I")
	public static int[] anIntArray1 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!a", name = "o", descriptor = "I")
	public static int anInt10 = 2;

	@OriginalMember(owner = "client!a", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString3 = "wave:";

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)V")
	public static void method9(@OriginalArg(1) int arg0) {
		for (@Pc(16) Class1 local16 = Static154.aClass142_13.method3534(); local16 != null; local16 = Static154.aClass142_13.method3530()) {
			if ((long) arg0 == (local16.aLong214 >> 48 & 0xFFFFL)) {
				local16.method4779();
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIZIIII)V")
	public static void method10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14;
		@Pc(44) int local44;
		if (Static306.anInt5423 == 0) {
			@Pc(10) int local10 = Static280.anInt5070;
			@Pc(12) int local12 = Static130.anInt2601;
			local14 = Static126.anInt1742;
			@Pc(28) int local28 = (arg2 - arg3) * (local12 - local10) / arg1 + local10;
			@Pc(30) int local30 = Static187.anInt3579;
			local44 = (arg5 - arg4) * (local30 - local14) / arg0 + local14;
			if (Static133.aBoolean168 && (Static102.anInt2065 & 0x40) != 0) {
				@Pc(83) Class66 local83 = Static296.method4522(Static104.anInt2090, Static312.anInt5732);
				if (local83 == null) {
					Static301.method4558();
				} else {
					Static309.method4707(local28, Static196.anInt3698, " ->", Static148.aString164, (short) 10, 0L, local44);
				}
			} else {
				if (Static118.anInt2486 == 1) {
					Static309.method4707(local28, -1, "", Static280.aString300, (short) 6, 0L, local44);
				}
				Static309.method4707(local28, -1, "", Static33.aString36, (short) 28, 0L, local44);
			}
		}
		@Pc(100) long local100 = -1L;
		for (local14 = 0; local14 < Static70.anInt1489; local14++) {
			@Pc(113) long local113 = Static31.aLongArray4[local14];
			@Pc(120) int local120 = (int) local113 >> 29 & 0x3;
			@Pc(127) int local127 = (int) local113 >> 7 & 0x7F;
			local44 = (int) local113 & 0x7F;
			@Pc(139) int local139 = (int) (local113 >>> 32) & Integer.MAX_VALUE;
			if (local100 != local113) {
				local100 = local113;
				@Pc(244) int local244;
				if (local120 == 2 && Static56.method985(Static65.anInt1300, local44, local127, local113)) {
					@Pc(160) Class71 local160 = Static255.method4052(local139);
					if (local160.anIntArray209 != null) {
						local160 = local160.method2039();
					}
					if (local160 == null) {
						continue;
					}
					if (Static306.anInt5423 == 1) {
						Static309.method4707(local44, Static280.anInt5078, Static272.aString340 + " -> <col=00ffff>" + local160.aString135, Static35.aString222, (short) 24, local113, local127);
					} else if (Static133.aBoolean168) {
						@Pc(185) Class1_Sub2_Sub17 local185 = Static277.anInt4994 == -1 ? null : Static30.method498(Static277.anInt4994);
						if ((Static102.anInt2065 & 0x4) != 0 && (local185 == null || local160.method2036(Static277.anInt4994, local185.anInt4543) != local185.anInt4543)) {
							Static309.method4707(local44, Static196.anInt3698, Static88.aString106 + " -> <col=00ffff>" + local160.aString135, Static148.aString164, (short) 60, local113, local127);
						}
					} else {
						@Pc(232) String[] local232 = local160.aStringArray19;
						if (Static225.aBoolean286) {
							local232 = Static143.method2466(local232);
						}
						if (local232 != null) {
							for (local244 = 4; local244 >= 0; local244--) {
								if (local232[local244] != null) {
									@Pc(260) int local260 = -1;
									@Pc(262) short local262 = 0;
									if (local244 == local160.anInt2381) {
										local260 = local160.anInt2363;
									}
									if (local244 == 0) {
										local262 = 22;
									}
									if (local244 == local160.anInt2350) {
										local260 = local160.anInt2390;
									}
									if (local244 == 1) {
										local262 = 44;
									}
									if (local244 == 2) {
										local262 = 40;
									}
									if (local244 == 3) {
										local262 = 33;
									}
									if (local244 == 4) {
										local262 = 1010;
									}
									Static309.method4707(local44, local260, "<col=00ffff>" + local160.aString135, local232[local244], local262, local113, local127);
								}
							}
						}
						Static309.method4707(local44, Static40.anInt5334, "<col=00ffff>" + local160.aString135, Static296.aString320, (short) 1012, (long) local160.anInt2388, local127);
					}
				}
				@Pc(502) int local502;
				@Pc(513) int local513;
				@Pc(461) int local461;
				@Pc(463) int local463;
				@Pc(476) Class15_Sub5_Sub1 local476;
				@Pc(581) Class15_Sub5_Sub2 local581;
				if (local120 == 1) {
					@Pc(389) Class15_Sub5_Sub1 local389 = Static83.aClass15_Sub5_Sub1Array1[local139];
					if ((local389.aClass99_1.anInt3050 & 0x1) == 0 && (local389.anInt5559 & 0x7F) == 0 && (local389.anInt5557 & 0x7F) == 0 || (local389.aClass99_1.anInt3050 & 0x1) == 1 && (local389.anInt5559 & 0x7F) == 64 && (local389.anInt5557 & 0x7F) == 64) {
						local244 = local389.anInt5557 - (local389.aClass99_1.anInt3050 - 1) * 64;
						local461 = local389.anInt5559 + 64 - local389.aClass99_1.anInt3050 * 64;
						for (local463 = 0; local463 < Static85.anInt1689; local463++) {
							local476 = Static83.aClass15_Sub5_Sub1Array1[Static104.anIntArray178[local463]];
							if (local476 != null && !local476.aBoolean377 && local389 != local476 && local476.aBoolean370) {
								local502 = local476.anInt5559 + 64 - local476.aClass99_1.anInt3050 * 64;
								local513 = local476.anInt5557 + 64 - local476.aClass99_1.anInt3050 * 64;
								if (local502 >= local461 && local476.aClass99_1.anInt3050 <= local389.aClass99_1.anInt3050 - (local502 - local461 >> 7) && local244 <= local513 && local476.aClass99_1.anInt3050 <= local389.aClass99_1.anInt3050 - (local513 - local244 >> 7)) {
									Static309.method4703(local44, Static104.anIntArray178[local463], local476.aClass99_1, local127);
									local476.aBoolean377 = true;
								}
							}
						}
						for (local463 = 0; local463 < Static304.anInt5394; local463++) {
							local581 = Static17.aClass15_Sub5_Sub2Array1[Static275.anIntArray440[local463]];
							if (local581 != null && !local581.aBoolean377 && local581.aBoolean370) {
								local502 = local581.anInt5559 - (local581.method4702() - 1) * 64;
								local513 = local581.anInt5557 - (local581.method4702() - 1) * 64;
								if (local502 >= local461 && local581.method4702() <= local389.aClass99_1.anInt3050 - (local502 - local461 >> 7) && local244 <= local513 && local581.method4702() <= local389.aClass99_1.anInt3050 - (local513 - local244 >> 7)) {
									Static77.method1511(Static275.anIntArray440[local463], local127, local581, local44);
									local581.aBoolean377 = true;
								}
							}
						}
					}
					if (local389.aBoolean377) {
						continue;
					}
					Static309.method4703(local44, local139, local389.aClass99_1, local127);
					local389.aBoolean377 = true;
				}
				if (local120 == 0) {
					@Pc(686) Class15_Sub5_Sub2 local686 = Static17.aClass15_Sub5_Sub2Array1[local139];
					if ((local686.anInt5559 & 0x7F) == 64 && (local686.anInt5557 & 0x7F) == 64) {
						local461 = local686.anInt5559 - (local686.method4702() - 1) * 64;
						local244 = local686.anInt5557 + 64 - local686.method4702() * 64;
						for (local463 = 0; local463 < Static85.anInt1689; local463++) {
							local476 = Static83.aClass15_Sub5_Sub1Array1[Static104.anIntArray178[local463]];
							if (local476 != null && !local476.aBoolean377 && local476.aBoolean370) {
								local502 = local476.anInt5559 - (local476.aClass99_1.anInt3050 - 1) * 64;
								local513 = local476.anInt5557 - (local476.aClass99_1.anInt3050 - 1) * 64;
								if (local502 >= local461 && local476.aClass99_1.anInt3050 <= local686.method4702() - (local502 - local461 >> 7) && local244 <= local513 && local476.aClass99_1.anInt3050 <= local686.method4702() - (local513 - local244 >> 7)) {
									Static309.method4703(local44, Static104.anIntArray178[local463], local476.aClass99_1, local127);
									local476.aBoolean377 = true;
								}
							}
						}
						for (local463 = 0; local463 < Static304.anInt5394; local463++) {
							local581 = Static17.aClass15_Sub5_Sub2Array1[Static275.anIntArray440[local463]];
							if (local581 != null && !local581.aBoolean377 && local581 != local686 && local581.aBoolean370) {
								local502 = local581.anInt5559 + 64 - local581.method4702() * 64;
								local513 = local581.anInt5557 + 64 - local581.method4702() * 64;
								if (local461 <= local502 && local581.method4702() <= local686.method4702() - (local502 - local461 >> 7) && local244 <= local513 && local581.method4702() <= local686.method4702() - (local513 - local244 >> 7)) {
									Static77.method1511(Static275.anIntArray440[local463], local127, local581, local44);
									local581.aBoolean377 = true;
								}
							}
						}
					}
					if (local686.aBoolean377) {
						continue;
					}
					Static77.method1511(local139, local127, local686, local44);
					local686.aBoolean377 = true;
				}
				if (local120 == 3) {
					@Pc(965) Class59 local965 = Static270.aClass59ArrayArrayArray1[Static65.anInt1300][local44][local127];
					if (local965 != null) {
						for (@Pc(972) Class1_Sub2_Sub14 local972 = (Class1_Sub2_Sub14) local965.method1708(); local972 != null; local972 = (Class1_Sub2_Sub14) local965.method1710()) {
							local244 = local972.aClass15_Sub1_1.anInt339;
							@Pc(983) Class102 local983 = Static49.method909(local244);
							if (Static306.anInt5423 == 1) {
								Static309.method4707(local44, Static280.anInt5078, Static272.aString340 + " -> <col=ff9040>" + local983.aString181, Static35.aString222, (short) 48, (long) local244, local127);
							} else if (Static133.aBoolean168) {
								@Pc(1027) Class1_Sub2_Sub17 local1027 = Static277.anInt4994 == -1 ? null : Static30.method498(Static277.anInt4994);
								if ((Static102.anInt2065 & 0x1) != 0 && (local1027 == null || local983.method2783(local1027.anInt4543, Static277.anInt4994) != local1027.anInt4543)) {
									Static309.method4707(local44, Static196.anInt3698, Static88.aString106 + " -> <col=ff9040>" + local983.aString181, Static148.aString164, (short) 1, (long) local244, local127);
								}
							} else {
								@Pc(1086) String[] local1086 = local983.aStringArray24;
								if (Static225.aBoolean286) {
									local1086 = Static143.method2466(local1086);
								}
								for (local502 = 4; local502 >= 0; local502--) {
									if (local1086 != null && local1086[local502] != null) {
										@Pc(1108) int local1108 = -1;
										@Pc(1110) byte local1110 = 0;
										if (local983.anInt3168 == local502) {
											local1108 = local983.anInt3199;
										}
										if (local502 == 0) {
											local1110 = 18;
										}
										if (local983.anInt3206 == local502) {
											local1108 = local983.anInt3205;
										}
										if (local502 == 1) {
											local1110 = 8;
										}
										if (local502 == 2) {
											local1110 = 57;
										}
										if (local502 == 3) {
											local1110 = 17;
										}
										if (local502 == 4) {
											local1110 = 3;
										}
										Static309.method4707(local44, local1108, "<col=ff9040>" + local983.aString181, local1086[local502], local1110, (long) local244, local127);
									}
								}
								Static309.method4707(local44, Static40.anInt5334, "<col=ff9040>" + local983.aString181, Static296.aString320, (short) 1002, (long) local244, local127);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)Lclient!li;")
	public static Class1_Sub2_Sub9 method12(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub9 local10 = (Class1_Sub2_Sub9) Static98.aClass148_6.method3600((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static32.aClass121_67.method3115(26, arg0);
		local10 = new Class1_Sub2_Sub9();
		if (local25 != null) {
			local10.method2754(new Class1_Sub14(local25));
		}
		Static98.aClass148_6.method3602(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(I)V")
	public static void method13() {
		Static162.anInt3171 = 0;
		Static63.aByte18 = 0;
		Static12.anInt176 = 0;
		Static52.aBoolean381 = false;
		Static28.anInt497 = -1;
		Static196.anInt3703 = 0;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void method14(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		@Pc(20) int local20 = Static140.aClass1_Sub2_Sub6_3.method4020(arg1, 250);
		@Pc(33) int local33 = Static140.aClass1_Sub2_Sub6_3.method4025(arg1, 250) * 13;
		if (Static156.aBoolean211) {
			Static119.method2129(6, 6, local20 + 4 + 4, 4 + 4 + local33, 0);
			Static119.method2135(6, 6, local20 + 4 + 4, 4 + 4 + local33, 16777215);
		} else {
			Static25.method385(6, 6, local20 + 8, local33 - -4 + 4, 0);
			Static25.method402(6, 6, local20 + 8, local33 + 4 - -4, 16777215);
		}
		Static140.aClass1_Sub2_Sub6_3.method4004(arg1, 10, 10, local20, local33, 16777215, -1, 1, 1, 0);
		Static86.method1605(6, 6, local20 + 4 + 4, local33 + 8);
		if (!arg0) {
			Static62.method1135(10, local20, 10, local33);
		} else if (Static156.aBoolean211) {
			Static156.method2662();
		} else {
			try {
				@Pc(169) Graphics local169 = Static127.aCanvas1.getGraphics();
				Static94.aClass58_3.method2967(local169);
			} catch (@Pc(177) Exception local177) {
				Static127.aCanvas1.repaint();
			}
		}
	}
}
