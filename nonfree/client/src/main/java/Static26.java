import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!d", name = "e", descriptor = "I")
	public static int anInt719;

	@OriginalMember(owner = "client!d", name = "g", descriptor = "Lclient!sd;")
	private static Class73 aClass73_414 = Static122.method531("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!d", name = "a", descriptor = "Lclient!sd;")
	public static Class73 aClass73_412 = aClass73_414;

	@OriginalMember(owner = "client!d", name = "b", descriptor = "Lclient!sd;")
	public static Class73 aClass73_413 = Static122.method531("blinken1:");

	@OriginalMember(owner = "client!d", name = "f", descriptor = "I")
	public static int anInt720 = -1;

	@OriginalMember(owner = "client!d", name = "h", descriptor = "[Z")
	public static boolean[] aBooleanArray2 = new boolean[5];

	@OriginalMember(owner = "client!d", name = "i", descriptor = "Lclient!sd;")
	public static Class73 aClass73_415 = Static122.method531("sl_arrows");

	@OriginalMember(owner = "client!d", name = "k", descriptor = "Lclient!sd;")
	public static Class73 aClass73_416 = Static122.method531("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!d", name = "a", descriptor = "([BB)[B")
	public static byte[] method549(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class3_Sub12 local8 = new Class3_Sub12(arg0);
		@Pc(12) int local12 = local8.method1354();
		@Pc(18) int local18 = local8.method1373();
		if (local18 < 0 || Static98.anInt2193 != 0 && Static98.anInt2193 < local18) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(42) byte[] local42 = new byte[local18];
			local8.method1374(local42, local18);
			return local42;
		} else {
			@Pc(54) int local54 = local8.method1373();
			if (local54 < 0 || Static98.anInt2193 != 0 && Static98.anInt2193 < local54) {
				throw new RuntimeException();
			}
			@Pc(75) byte[] local75 = new byte[local54];
			if (local12 == 1) {
				Static1.method6(local75, local54, arg0, local18);
			} else {
				Static108.aClass18_1.method573(local75, local8);
			}
			return local75;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Lclient!cg;")
	public static Class3_Sub1_Sub6 method550(@OriginalArg(1) int arg0) {
		@Pc(12) Class3_Sub1_Sub6 local12 = (Class3_Sub1_Sub6) Static109.aClass7_18.method183((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(27) byte[] local27 = Static117.aClass13_Sub1_13.method348(arg0, 0);
		if (local27 == null) {
			return null;
		}
		local12 = new Class3_Sub1_Sub6();
		@Pc(40) Class3_Sub12 local40 = new Class3_Sub12(local27);
		@Pc(42) int local42 = 0;
		local40.anInt1793 = local40.aByteArray16.length - 12;
		@Pc(53) int local53 = local40.method1373();
		local12.anInt624 = local40.method1359();
		local12.anInt627 = local40.method1359();
		local12.anInt622 = local40.method1359();
		local12.anInt619 = local40.method1359();
		local40.anInt1793 = 0;
		local12.aClass73_376 = local40.method1368();
		local12.aClass73Array6 = new Class73[local53];
		local12.anIntArray65 = new int[local53];
		local12.anIntArray66 = new int[local53];
		while (local40.aByteArray16.length - 12 > local40.anInt1793) {
			@Pc(103) int local103 = local40.method1359();
			if (local103 == 3) {
				local12.aClass73Array6[local42] = local40.method1390();
			} else if (local103 >= 100 || local103 == 21 || local103 == 38 || local103 == 39) {
				local12.anIntArray65[local42] = local40.method1354();
			} else {
				local12.anIntArray65[local42] = local40.method1373();
			}
			local12.anIntArray66[local42++] = local103;
		}
		Static109.aClass7_18.method186(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!d", name = "d", descriptor = "(I)V")
	public static void method553() {
		Static69.aClass16_6 = new Class16(32);
	}

	@OriginalMember(owner = "client!d", name = "f", descriptor = "(I)V")
	public static void method556() {
		if (Static85.aBoolean127 && Static147.anInt3309 != Static33.anInt830) {
			Static53.method2793(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray329[0], Static147.anInt3309, Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray326[0], anInt719, Static54.anInt1286);
		} else if (Static90.anInt2027 != Static147.anInt3309) {
			Static90.anInt2027 = Static147.anInt3309;
			Static29.method572(Static147.anInt3309);
		}
	}

	@OriginalMember(owner = "client!d", name = "g", descriptor = "(I)V")
	public static void method557() {
		aClass73_413 = null;
		aClass73_412 = null;
		aClass73_415 = null;
		aBooleanArray2 = null;
		aClass73_414 = null;
		aClass73_416 = null;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIII)V")
	public static void method558(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static68.anInt1580 = 0;
		@Pc(74) int local74;
		for (@Pc(5) int local5 = -1; local5 < Static6.anInt158 + Static86.anInt1943; local5++) {
			@Pc(24) Class3_Sub1_Sub4_Sub7 local24;
			if (local5 == -1) {
				local24 = Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1;
			} else if (local5 < Static6.anInt158) {
				local24 = Static162.aClass3_Sub1_Sub4_Sub7_Sub1Array1[Static47.anIntArray184[local5]];
			} else {
				local24 = Static112.aClass3_Sub1_Sub4_Sub7_Sub2Array1[Static52.anIntArray132[local5 - Static6.anInt158]];
			}
			if (local24 != null && local24.method2274()) {
				@Pc(54) Class3_Sub1_Sub10 local54;
				if (local24 instanceof Class3_Sub1_Sub4_Sub7_Sub2) {
					local54 = ((Class3_Sub1_Sub4_Sub7_Sub2) local24).aClass3_Sub1_Sub10_1;
					if (local54.anIntArray174 != null) {
						local54 = local54.method1201();
					}
					if (local54 == null) {
						continue;
					}
				}
				if (Static6.anInt158 <= local5) {
					local54 = ((Class3_Sub1_Sub4_Sub7_Sub2) local24).aClass3_Sub1_Sub10_1;
					if (local54.anIntArray174 != null) {
						local54 = local54.method1201();
					}
					if (local54.anInt1573 >= 0 && local54.anInt1573 < Static108.aClass3_Sub1_Sub3_Sub4Array9.length) {
						Static131.method2172(local24, 15 - local24.aShort32);
						if (Static46.anInt1059 > -1) {
							Static108.aClass3_Sub1_Sub3_Sub4Array9[local54.anInt1573].method2321(Static46.anInt1059 + arg1 - 12, arg2 + -30 - -anInt720);
						}
					}
					if (Static160.anInt3497 == 1 && Static91.anInt2032 == Static52.anIntArray132[local5 - Static6.anInt158] && Static44.anInt1024 % 20 < 10) {
						Static131.method2172(local24, 15 - local24.aShort32);
						if (Static46.anInt1059 > -1) {
							Static141.aClass3_Sub1_Sub3_Sub4Array10[0].method2321(Static46.anInt1059 + arg1 - 12, arg2 + -28 - -anInt720);
						}
					}
				} else {
					local74 = 30;
					@Pc(77) Class3_Sub1_Sub4_Sub7_Sub1 local77 = (Class3_Sub1_Sub4_Sub7_Sub1) local24;
					if (local77.anInt2699 != -1 || local77.anInt2697 != -1) {
						Static131.method2172(local24, 15 - local24.aShort32);
						if (Static46.anInt1059 > -1) {
							if (local77.anInt2699 != -1) {
								Static100.aClass3_Sub1_Sub3_Sub4Array7[local77.anInt2699].method2321(arg1 + Static46.anInt1059 - 12, arg2 - (-anInt720 - -30));
								local74 += 25;
							}
							if (local77.anInt2697 != -1) {
								Static108.aClass3_Sub1_Sub3_Sub4Array9[local77.anInt2697].method2321(Static46.anInt1059 + arg1 - 12, arg2 + anInt720 - local74);
								local74 += 25;
							}
						}
					}
					if (local5 >= 0 && Static160.anInt3497 == 10 && Static47.anIntArray184[local5] == Static71.anInt1633) {
						Static131.method2172(local24, 15 - local24.aShort32);
						if (Static46.anInt1059 > -1) {
							Static141.aClass3_Sub1_Sub3_Sub4Array10[1].method2321(arg1 + Static46.anInt1059 - 12, -local74 + anInt720 + arg2);
						}
					}
				}
				if (local24.aClass73_1747 != null && (local5 >= Static6.anInt158 || Static28.anInt749 == 0 || Static28.anInt749 == 3 || Static28.anInt749 == 1 && Static76.method1296(((Class3_Sub1_Sub4_Sub7_Sub1) local24).aClass73_1521))) {
					Static131.method2172(local24, -local24.aShort32);
					if (Static46.anInt1059 > -1 && Static141.anInt3245 > Static68.anInt1580) {
						Static141.anIntArray343[Static68.anInt1580] = Static113.aClass3_Sub1_Sub3_Sub1_Sub1_2.method1062(local24.aClass73_1747) / 2;
						Static141.anIntArray341[Static68.anInt1580] = Static113.aClass3_Sub1_Sub3_Sub1_Sub1_2.anInt1397;
						Static141.anIntArray340[Static68.anInt1580] = Static46.anInt1059;
						Static141.anIntArray344[Static68.anInt1580] = anInt720;
						Static141.anIntArray342[Static68.anInt1580] = local24.anInt3147;
						Static141.anIntArray339[Static68.anInt1580] = local24.anInt3178;
						Static141.anIntArray345[Static68.anInt1580] = local24.anInt3170;
						Static141.aClass73Array22[Static68.anInt1580] = local24.aClass73_1747;
						Static68.anInt1580++;
					}
				}
				if (Static44.anInt1024 < local24.anInt3137) {
					Static131.method2172(local24, 15 - local24.aShort32);
					if (Static46.anInt1059 > -1) {
						local74 = local24.anInt3186 * 30 / local24.anInt3150;
						if (local74 > 30) {
							local74 = 30;
						}
						Static15.method2297(arg1 + Static46.anInt1059 - 15, anInt720 + arg2 + -3, local74, 5, 65280);
						Static15.method2297(Static46.anInt1059 + arg1 + local74 - 15, anInt720 + arg2 - 3, 30 - local74, 5, 16711680);
					}
				}
				for (local74 = 0; local74 < 4; local74++) {
					if (local24.anIntArray324[local74] > Static44.anInt1024) {
						Static131.method2172(local24, -local24.aShort32 / 2);
						if (Static46.anInt1059 > -1) {
							if (local74 == 1) {
								anInt720 -= 20;
							}
							if (local74 == 2) {
								Static46.anInt1059 -= 15;
								anInt720 -= 10;
							}
							if (local74 == 3) {
								Static46.anInt1059 += 15;
								anInt720 -= 10;
							}
							Static173.aClass3_Sub1_Sub3_Sub4Array11[local24.anIntArray327[local74]].method2321(Static46.anInt1059 + arg1 - 12, arg2 - (-anInt720 + 12));
							Static142.aClass3_Sub1_Sub3_Sub1_Sub1_5.method1072(Static154.method2485(local24.anIntArray328[local74]), arg1 + Static46.anInt1059 - 1, anInt720 + arg2 - -3, 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(559) int local559 = 0; local559 < Static68.anInt1580; local559++) {
			local74 = Static141.anIntArray340[local559];
			@Pc(569) int local569 = Static141.anIntArray344[local559];
			@Pc(573) int local573 = Static141.anIntArray343[local559];
			@Pc(575) boolean local575 = true;
			@Pc(579) int local579 = Static141.anIntArray341[local559];
			while (local575) {
				local575 = false;
				for (@Pc(585) int local585 = 0; local585 < local559; local585++) {
					if (Static141.anIntArray344[local585] - Static141.anIntArray341[local585] < local569 - -2 && Static141.anIntArray344[local585] + 2 > local569 - local579 && local74 - local573 < Static141.anIntArray340[local585] + Static141.anIntArray343[local585] && local573 + local74 > Static141.anIntArray340[local585] + -Static141.anIntArray343[local585] && Static141.anIntArray344[local585] - Static141.anIntArray341[local585] < local569) {
						local569 = Static141.anIntArray344[local585] - Static141.anIntArray341[local585];
						local575 = true;
					}
				}
			}
			Static46.anInt1059 = Static141.anIntArray340[local559];
			anInt720 = Static141.anIntArray344[local559] = local569;
			@Pc(685) Class73 local685 = Static141.aClass73Array22[local559];
			if (Static118.anInt3947 == 0) {
				@Pc(703) int local703 = 16776960;
				if (Static141.anIntArray342[local559] < 6) {
					local703 = Static102.anIntArray230[Static141.anIntArray342[local559]];
				}
				if (Static141.anIntArray342[local559] == 6) {
					local703 = Static100.anInt2225 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static141.anIntArray342[local559] == 7) {
					local703 = Static100.anInt2225 % 20 >= 10 ? 65535 : 255;
				}
				if (Static141.anIntArray342[local559] == 8) {
					local703 = Static100.anInt2225 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(776) int local776;
				if (Static141.anIntArray342[local559] == 9) {
					local776 = 150 - Static141.anIntArray345[local559];
					if (local776 < 50) {
						local703 = local776 * 1280 + 16711680;
					} else if (local776 < 100) {
						local703 = 16384000 + 16776960 - local776 * 327680;
					} else if (local776 < 150) {
						local703 = (local776 - 100) * 5 + 65280;
					}
				}
				if (Static141.anIntArray342[local559] == 10) {
					local776 = 150 - Static141.anIntArray345[local559];
					if (local776 < 50) {
						local703 = local776 * 5 + 16711680;
					} else if (local776 < 100) {
						local703 = 16711935 + 16384000 - local776 * 327680;
					} else if (local776 < 150) {
						local703 = local776 * 327680 + 500 - local776 * 5 - 32767745;
					}
				}
				if (Static141.anIntArray342[local559] == 11) {
					local776 = 150 - Static141.anIntArray345[local559];
					if (local776 < 50) {
						local703 = 16777215 - local776 * 327685;
					} else if (local776 < 100) {
						local703 = local776 * 327685 + 65280 - 16384250;
					} else if (local776 < 150) {
						local703 = 16777215 - (local776 - 100) * 327680;
					}
				}
				if (Static141.anIntArray339[local559] == 0) {
					Static113.aClass3_Sub1_Sub3_Sub1_Sub1_2.method1072(local685, Static46.anInt1059 + arg1, anInt720 + arg2, local703, 0);
				}
				if (Static141.anIntArray339[local559] == 1) {
					Static113.aClass3_Sub1_Sub3_Sub1_Sub1_2.method1076(local685, arg1 + Static46.anInt1059, arg2 - -anInt720, local703, Static100.anInt2225);
				}
				if (Static141.anIntArray339[local559] == 2) {
					Static113.aClass3_Sub1_Sub3_Sub1_Sub1_2.method1058(local685, Static46.anInt1059 + arg1, arg2 - -anInt720, local703, Static100.anInt2225);
				}
				if (Static141.anIntArray339[local559] == 3) {
					Static113.aClass3_Sub1_Sub3_Sub1_Sub1_2.method1078(local685, Static46.anInt1059 + arg1, anInt720 + arg2, local703, Static100.anInt2225, 150 - Static141.anIntArray345[local559]);
				}
				if (Static141.anIntArray339[local559] == 4) {
					local776 = (150 - Static141.anIntArray345[local559]) * (Static113.aClass3_Sub1_Sub3_Sub1_Sub1_2.method1062(local685) - -100) / 150;
					Static15.method2301(arg1 + Static46.anInt1059 - 50, arg2, arg1 + Static46.anInt1059 + 50, arg3 + arg2);
					Static113.aClass3_Sub1_Sub3_Sub1_Sub1_2.method1069(local685, Static46.anInt1059 + arg1 + 50 - local776, anInt720 + arg2, local703, 0);
					Static15.method2296(arg1, arg2, arg1 + arg0, arg2 + arg3);
				}
				if (Static141.anIntArray339[local559] == 5) {
					@Pc(1067) int local1067 = 0;
					local776 = 150 - Static141.anIntArray345[local559];
					if (local776 < 25) {
						local1067 = local776 - 25;
					} else if (local776 > 125) {
						local1067 = local776 - 125;
					}
					Static15.method2301(arg1, anInt720 + arg2 - Static113.aClass3_Sub1_Sub3_Sub1_Sub1_2.anInt1397 - 1, arg0 + arg1, arg2 + anInt720 + 5);
					Static113.aClass3_Sub1_Sub3_Sub1_Sub1_2.method1072(local685, arg1 + Static46.anInt1059, local1067 + arg2 - -anInt720, local703, 0);
					Static15.method2296(arg1, arg2, arg1 + arg0, arg2 - -arg3);
				}
			} else {
				Static113.aClass3_Sub1_Sub3_Sub1_Sub1_2.method1072(local685, Static46.anInt1059 + arg1, arg2 - -anInt720, 16776960, 0);
			}
		}
	}
}
