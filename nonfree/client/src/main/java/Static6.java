import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "[[I")
	public static int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)Lclient!fg;")
	public static Class2_Sub10 method62() {
		if (Static20.aClass238_21 == null || Static113.aClass42_3 == null) {
			return null;
		}
		for (@Pc(24) Class2_Sub10 local24 = (Class2_Sub10) Static113.aClass42_3.method840(); local24 != null; local24 = (Class2_Sub10) Static113.aClass42_3.method840()) {
			@Pc(32) Class212 local32 = Static20.aClass195_3.method4816(local24.anInt2183);
			if (local32 != null && local32.aBoolean438 && local32.method5244(Static20.anInterface4_2)) {
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
	public static void method63() {
		if (!Static192.method3515()) {
			return;
		}
		if (Static389.aStringArray45 == null) {
			Static354.method5613();
		}
		Static97.aBooleanArray11 = new boolean[100];
		Static255.aBoolean361 = true;
		Static64.anInt1440 = 0;
		Static183.anIntArray292 = new int[100];
		Static313.anIntArray502 = new int[100];
		Static212.anIntArray312 = new int[100];
		for (@Pc(35) int local35 = 0; local35 < 100; local35++) {
			Static313.anIntArray502[local35] = (int) ((double) Static7.anInt157 * Math.random());
			Static212.anIntArray312[local35] = (int) (Math.random() * 350.0D);
			Static183.anIntArray292[local35] = (int) (Math.random() * 102.0D);
			Static97.aBooleanArray11[local35] = Math.random() < 0.5D;
		}
		try {
			Static42.aClipboard1 = Static12.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(79) Exception local79) {
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BIIIIII)V")
	public static void method64(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = Static97.anInt2139;
		@Pc(9) int[] local9 = Static321.anIntArray512;
		Static161.anInt3318 = 0;
		@Pc(22) byte local22 = Static339.method5448() == 2 ? (byte) Static87.anInt1878 : 1;
		@Pc(84) int local84;
		@Pc(89) int local89;
		@Pc(287) int local287;
		@Pc(465) int local465;
		@Pc(580) int local580;
		@Pc(336) int local336;
		@Pc(698) int local698;
		@Pc(523) int local523;
		label434: for (@Pc(24) int local24 = 0; local24 < local7 + Static123.anInt5933; local24++) {
			@Pc(28) Class197 local28 = null;
			@Pc(41) Class1_Sub2_Sub1 local41;
			if (local7 > local24) {
				local41 = Static42.aClass1_Sub2_Sub1_Sub1Array1[local9[local24]];
			} else {
				local41 = Static223.aClass1_Sub2_Sub1_Sub2Array1[Static373.anIntArray577[local24 - local7]];
				local28 = ((Class1_Sub2_Sub1_Sub2) local41).aClass197_1;
				if (local28.anIntArray468 != null) {
					local28 = local28.method4832(Static179.aClass115_1);
					if (local28 == null) {
						continue;
					}
				}
			}
			if (local41.anInt5372 >= 0) {
				if (Static116.aByteArrayArrayArray2 != null && Static182.aClass1_Sub2_Sub1_Sub1_1.aByte73 < local41.aByte73) {
					for (local84 = local41.aShort95; local84 <= local41.aShort97; local84++) {
						for (local89 = local41.aShort96; local89 <= local41.aShort94; local89++) {
							if (Static116.aByteArrayArrayArray2[local41.aByte73][local84][local89] == local22) {
								continue label434;
							}
						}
					}
				}
				Static238.method4242(local41.method4795(), arg3 >> 1, arg1 >> 1, local41);
				if (Static128.anIntArray211[0] >= 0) {
					if (local41.aString51 != null && (local24 >= local7 || Static23.anInt353 == 0 || Static23.anInt353 == 3 || Static23.anInt353 == 1 && Static67.method1228(((Class1_Sub2_Sub1_Sub1) local41).aString12)) && Static65.anInt1466 > Static161.anInt3318) {
						Static65.anIntArray108[Static161.anInt3318] = Static121.aClass24_10.method325(local41.aString51) / 2;
						Static65.anIntArray103[Static161.anInt3318] = Static128.anIntArray211[0];
						Static65.anIntArray107[Static161.anInt3318] = Static128.anIntArray211[1];
						Static65.anIntArray104[Static161.anInt3318] = local41.anInt5386;
						Static65.anIntArray105[Static161.anInt3318] = local41.anInt5422;
						Static65.anIntArray106[Static161.anInt3318] = local41.anInt5397;
						Static65.aStringArray8[Static161.anInt3318] = local41.aString51;
						Static161.anInt3318++;
					}
					@Pc(226) Class27 local226 = Static260.aClass27Array43[0];
					local89 = arg2 + Static128.anIntArray211[1] - Math.max(Static121.aClass24_10.anInt424, local226.method5327());
					@Pc(255) Class27 local255;
					@Pc(348) int local348;
					if (!local41.aBoolean395 && Static339.anInt6265 < local41.anInt5385) {
						local255 = Static260.aClass27Array43[1];
						if (local41 instanceof Class1_Sub2_Sub1_Sub2) {
							@Pc(261) Class1_Sub2_Sub1_Sub2 local261 = (Class1_Sub2_Sub1_Sub2) local41;
							@Pc(270) Class27[] local270 = (Class27[]) Static263.aClass41_59.method823((long) local261.aClass197_1.anInt5507);
							if (local270 == null) {
								@Pc(279) Class128[] local279 = Static399.method3369(Static324.aClass83_116, local261.aClass197_1.anInt5507);
								if (local279 != null) {
									local270 = new Class27[local279.length];
									for (local287 = 0; local287 < local279.length; local287++) {
										local270[local287] = Static383.aClass48_9.method2527(local279[local287]);
									}
									Static263.aClass41_59.method832((long) local261.aClass197_1.anInt5507, local270);
								}
							}
							if (local270 != null && local270.length == 2) {
								local226 = local270[0];
								local255 = local270[1];
							}
						}
						local336 = Static128.anIntArray211[0] + arg0 - (local226.method5320() >> 1);
						local226.method5318(local336, local89);
						local348 = local226.method5320() * local41.anInt5384 / 255;
						if (local41.anInt5384 > 0 && local348 < 2) {
							local348 = 2;
						}
						Static383.aClass48_9.method2452(local336, local89, local336 + local348, local89 + local226.method5327());
						local255.method5318(local336, local89);
						Static383.aClass48_9.method2496(arg0, arg2, arg3 + arg0, arg1 + arg2);
					}
					local89 -= 2;
					if (!local41.aBoolean395) {
						if (local41.anInt5412 > Static339.anInt6265) {
							local255 = Static291.aClass27Array49[local41.aBoolean396 ? 2 : 0];
							@Pc(415) Class27 local415 = Static291.aClass27Array49[local41.aBoolean396 ? 3 : 1];
							if (local41 instanceof Class1_Sub2_Sub1_Sub2) {
								local348 = local28.anInt5497;
								if (local348 == -1) {
									local348 = local41.method4799().anInt6441;
								}
							} else {
								local348 = local41.method4799().anInt6441;
							}
							if (local348 != -1) {
								@Pc(450) Class27[] local450 = (Class27[]) Static189.aClass41_3.method823((long) local348);
								if (local450 == null) {
									@Pc(457) Class128[] local457 = Static399.method3369(Static324.aClass83_116, local348);
									if (local457 != null) {
										local450 = new Class27[local457.length];
										for (local465 = 0; local465 < local457.length; local465++) {
											local450[local465] = Static383.aClass48_9.method2527(local457[local465]);
										}
										Static189.aClass41_3.method832((long) local348, local450);
									}
								}
								if (local450 != null && local450.length == 4) {
									local255 = local450[local41.aBoolean396 ? 2 : 0];
									local415 = local450[local41.aBoolean396 ? 3 : 1];
								}
							}
							local523 = local41.anInt5412 - Static339.anInt6265;
							if (local523 <= local41.anInt5419) {
								local287 = local255.method5320();
							} else {
								local523 -= local41.anInt5419;
								local465 = local41.anInt5380 == 0 ? 0 : (local41.anInt5371 - local523) / local41.anInt5380 * local41.anInt5380;
								local287 = local255.method5320() * local465 / local41.anInt5371;
							}
							local465 = local255.method5327();
							local89 -= local465;
							local580 = Static128.anIntArray211[0] + arg0 - (local255.method5320() >> 1);
							local255.method5318(local580, local89);
							Static383.aClass48_9.method2452(local580, local89, local580 + local287, local465 + local89);
							local415.method5318(local580, local89);
							Static383.aClass48_9.method2496(arg0, arg2, arg0 + arg3, arg2 + arg1);
							local89 -= 2;
						}
						if (local7 > local24) {
							@Pc(652) Class1_Sub2_Sub1_Sub1 local652 = (Class1_Sub2_Sub1_Sub1) local41;
							if (local652.anInt978 != -1) {
								local89 -= 25;
								Static168.aClass27Array29[local652.anInt978].method5318(arg0 + Static128.anIntArray211[0] - 12, local89);
								local89 -= 2;
							}
							if (local652.anInt945 != -1) {
								local89 -= 25;
								Static178.aClass27Array31[local652.anInt945].method5318(Static128.anIntArray211[0] + arg0 - 12, local89);
								local89 -= 2;
							}
						} else if (local28.anInt5504 >= 0 && Static178.aClass27Array31.length > local28.anInt5504) {
							local89 -= 25;
							local255 = Static178.aClass27Array31[local28.anInt5504];
							local255.method5318(Static128.anIntArray211[0] + arg0 - (local255.method5320() >> 1), local89);
							local89 -= 2;
						}
					}
					@Pc(700) Class247[] local700;
					@Pc(708) Class247 local708;
					@Pc(731) Class27 local731;
					if (!(local41 instanceof Class1_Sub2_Sub1_Sub1)) {
						local698 = 0;
						local700 = Static16.aClass247Array1;
						for (local348 = 0; local348 < local700.length; local348++) {
							local708 = local700[local348];
							if (local708 != null && local708.anInt6960 == 1 && local708.anInt6955 == Static373.anIntArray577[local24 - local7]) {
								local731 = Static94.aClass27Array12[local708.anInt6956];
								if (local731.method5327() > local698) {
									local698 = local731.method5327();
								}
								if (Static339.anInt6265 % 20 < 10) {
									local731.method5318(Static128.anIntArray211[0] + arg0 - 12, -local731.method5327() + local89);
								}
							}
						}
						if (local698 > 0) {
						}
					} else if (local24 >= 0) {
						local698 = 0;
						local700 = Static16.aClass247Array1;
						for (local348 = 0; local348 < local700.length; local348++) {
							local708 = local700[local348];
							if (local708 != null && local708.anInt6960 == 10 && local9[local24] == local708.anInt6955) {
								local731 = Static94.aClass27Array12[local708.anInt6956];
								if (local731.method5327() > local698) {
									local698 = local731.method5327();
								}
								local731.method5318(Static128.anIntArray211[0] + arg0 - 12, -local731.method5327() + local89);
							}
						}
						if (local698 > 0) {
						}
					}
					for (local698 = 0; local698 < 4; local698++) {
						if (local41.anIntArray463[local698] > Static339.anInt6265) {
							local336 = local41.method4795() / 2;
							Static238.method4242(local336, arg3 >> 1, arg1 >> 1, local41);
							if (Static128.anIntArray211[0] > -1) {
								if (local698 == 1) {
									Static128.anIntArray211[1] -= 20;
								}
								if (local698 == 2) {
									Static128.anIntArray211[1] -= 10;
									Static128.anIntArray211[0] -= 15;
								}
								if (local698 == 3) {
									Static128.anIntArray211[1] -= 10;
									Static128.anIntArray211[0] += 15;
								}
								Static2.aClass27Array63[local41.anIntArray464[local698]].method5318(arg0 + Static128.anIntArray211[0] - 12, Static128.anIntArray211[1] + -12 + arg2);
								Static135.aClass44_3.method4644(-1, 0, Static128.anIntArray211[1] + arg2 + 3, Static128.anIntArray211[0] + -1 + arg0, Integer.toString(local41.anIntArray462[local698]));
							}
						}
					}
				}
			}
		}
		@Pc(1003) int local1003;
		for (@Pc(997) int local997 = 0; local997 < Static299.anInt5582; local997++) {
			local1003 = Static315.anIntArray506[local997];
			@Pc(1010) Class1_Sub2_Sub1 local1010;
			if (local1003 < 2048) {
				local1010 = Static42.aClass1_Sub2_Sub1_Sub1Array1[local1003];
			} else {
				local1010 = Static223.aClass1_Sub2_Sub1_Sub2Array1[local1003 - 2048];
			}
			local89 = Static372.anIntArray575[local997];
			@Pc(1031) Class1_Sub2_Sub1 local1031;
			if (local89 >= 2048) {
				local1031 = Static223.aClass1_Sub2_Sub1_Sub2Array1[local89 - 2048];
			} else {
				local1031 = Static42.aClass1_Sub2_Sub1_Sub1Array1[local89];
			}
			Static250.method4357(--local1010.anInt5388, arg3, arg0, local1010, arg2, local1031, arg1);
		}
		local1003 = Static121.aClass24_10.anInt424 + Static121.aClass24_10.anInt418 + 2;
		for (local84 = 0; local84 < Static161.anInt3318; local84++) {
			local89 = Static65.anIntArray103[local84];
			local698 = Static65.anIntArray107[local84];
			local336 = Static65.anIntArray108[local84];
			@Pc(1084) boolean local1084 = true;
			while (local1084) {
				local1084 = false;
				for (local523 = 0; local523 < local84; local523++) {
					if (Static65.anIntArray107[local523] - local1003 < local698 + 2 && local698 - local1003 < Static65.anIntArray107[local523] + 2 && Static65.anIntArray108[local523] + Static65.anIntArray103[local523] > -local336 + local89 && local336 + local89 > -Static65.anIntArray108[local523] + Static65.anIntArray103[local523] && Static65.anIntArray107[local523] - local1003 < local698) {
						local1084 = true;
						local698 = Static65.anIntArray107[local523] - local1003;
					}
				}
			}
			Static65.anIntArray107[local84] = local698;
			@Pc(1171) String local1171 = Static65.aStringArray8[local84];
			if (Static35.anInt618 == 0) {
				local287 = 16776960;
				if (Static65.anIntArray104[local84] < 6) {
					local287 = Static214.anIntArray315[Static65.anIntArray104[local84]];
				}
				if (Static65.anIntArray104[local84] == 6) {
					local287 = Static87.anInt1878 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static65.anIntArray104[local84] == 7) {
					local287 = Static87.anInt1878 % 20 < 10 ? 255 : 65535;
				}
				if (Static65.anIntArray104[local84] == 8) {
					local287 = Static87.anInt1878 % 20 < 10 ? 45056 : 8454016;
				}
				if (Static65.anIntArray104[local84] == 9) {
					local465 = 150 - Static65.anIntArray106[local84];
					if (local465 < 50) {
						local287 = local465 * 1280 + 16711680;
					} else if (local465 < 100) {
						local287 = 33160960 - local465 * 327680;
					} else if (local465 < 150) {
						local287 = local465 * 5 + 65280 - 500;
					}
				}
				if (Static65.anIntArray104[local84] == 10) {
					local465 = 150 - Static65.anIntArray106[local84];
					if (local465 < 50) {
						local287 = local465 * 5 + 16711680;
					} else if (local465 < 100) {
						local287 = 33095935 - local465 * 327680;
					} else if (local465 < 150) {
						local287 = (local465 - 100) * 327680 + 255 - (local465 - 100) * 5;
					}
				}
				if (Static65.anIntArray104[local84] == 11) {
					local465 = 150 - Static65.anIntArray106[local84];
					if (local465 < 50) {
						local287 = 16777215 - local465 * 327685;
					} else if (local465 < 100) {
						local287 = local465 * 327685 - 16318970;
					} else if (local465 < 150) {
						local287 = 32768000 + 16777215 - local465 * 327680;
					}
				}
				local465 = local287 | 0xFF000000;
				if (Static65.anIntArray105[local84] == 0) {
					Static180.aClass44_4.method4644(local465, -16777216, arg2 + local698, arg0 + local89, local1171);
				}
				if (Static65.anIntArray105[local84] == 1) {
					Static180.aClass44_4.method4650(local1171, Static87.anInt1878, local89 + arg0, local698 + arg2, local465);
				}
				if (Static65.anIntArray105[local84] == 2) {
					Static180.aClass44_4.method4649(local698 + arg2, arg0 + local89, local1171, local465, Static87.anInt1878);
				}
				if (Static65.anIntArray105[local84] == 3) {
					Static180.aClass44_4.method4659(local1171, arg0 + local89, Static87.anInt1878, local698 + arg2, -Static65.anIntArray106[local84] + 150, local465);
				}
				if (Static65.anIntArray105[local84] == 4) {
					local580 = (150 - Static65.anIntArray106[local84]) * (Static121.aClass24_10.method325(local1171) + 100) / 150;
					Static383.aClass48_9.method2452(local89 + arg0 - 50, arg2, arg0 + local89 + 50, arg1 + arg2);
					Static180.aClass44_4.method4652(-16777216, local698 + arg2, arg0 + 50 - (-local89 - -local580), local465, local1171);
					Static383.aClass48_9.method2496(arg0, arg2, arg3 + arg0, arg2 + arg1);
				}
				if (Static65.anIntArray105[local84] == 5) {
					local580 = 150 - Static65.anIntArray106[local84];
					@Pc(1563) int local1563 = 0;
					if (local580 < 25) {
						local1563 = local580 - 25;
					} else if (local580 > 125) {
						local1563 = local580 - 125;
					}
					@Pc(1589) int local1589 = Static121.aClass24_10.anInt418 + Static121.aClass24_10.anInt424;
					Static383.aClass48_9.method2452(arg0, arg2 + local698 - local1589 - 1, arg3 + arg0, arg2 + local698 + 5);
					Static180.aClass44_4.method4644(local465, -16777216, local1563 + local698 + arg2, local89 + arg0, local1171);
					Static383.aClass48_9.method2496(arg0, arg2, arg0 + arg3, arg1 + arg2);
				}
			} else {
				Static180.aClass44_4.method4644(-256, -16777216, arg2 + local698, local89 + arg0, local1171);
			}
		}
	}
}
