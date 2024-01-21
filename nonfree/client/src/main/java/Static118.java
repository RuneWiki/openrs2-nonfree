import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!vc", name = "u", descriptor = "[I")
	public static int[] anIntArray388;

	@OriginalMember(owner = "client!vc", name = "P", descriptor = "Lclient!gd;")
	public static Class27 aClass27_44;

	@OriginalMember(owner = "client!vc", name = "Fb", descriptor = "Lclient!we;")
	public static Class62 aClass62_25;

	@OriginalMember(owner = "client!vc", name = "Jb", descriptor = "Lclient!ud;")
	public static Class77 aClass77_11;

	@OriginalMember(owner = "client!vc", name = "B", descriptor = "Lclient!na;")
	public static Class53 aClass53_1363 = Static109.method1737("Wen m-Ochten Sie hinzuf-Ugen?");

	@OriginalMember(owner = "client!vc", name = "ib", descriptor = "Lclient!na;")
	private static Class53 aClass53_1371 = Static109.method1737("Members only world");

	@OriginalMember(owner = "client!vc", name = "E", descriptor = "Lclient!na;")
	public static Class53 aClass53_1364 = aClass53_1371;

	@OriginalMember(owner = "client!vc", name = "K", descriptor = "Lclient!na;")
	public static Class53 aClass53_1365 = Static109.method1737("Loading)3)3)3");

	@OriginalMember(owner = "client!vc", name = "R", descriptor = "Lclient!na;")
	private static Class53 aClass53_1366 = Static109.method1737("green:");

	@OriginalMember(owner = "client!vc", name = "W", descriptor = "Lclient!na;")
	public static Class53 aClass53_1367 = aClass53_1366;

	@OriginalMember(owner = "client!vc", name = "Nb", descriptor = "Lclient!na;")
	private static Class53 aClass53_1376 = Static109.method1737("Enter message to send to ");

	@OriginalMember(owner = "client!vc", name = "X", descriptor = "Lclient!na;")
	public static Class53 aClass53_1368 = aClass53_1376;

	@OriginalMember(owner = "client!vc", name = "Z", descriptor = "I")
	public static int anInt2752 = 0;

	@OriginalMember(owner = "client!vc", name = "Mb", descriptor = "Lclient!na;")
	private static Class53 aClass53_1375 = Static109.method1737("Please wait)3)3)3");

	@OriginalMember(owner = "client!vc", name = "eb", descriptor = "Lclient!na;")
	public static Class53 aClass53_1369 = aClass53_1375;

	@OriginalMember(owner = "client!vc", name = "gb", descriptor = "Lclient!na;")
	public static Class53 aClass53_1370 = aClass53_1366;

	@OriginalMember(owner = "client!vc", name = "jb", descriptor = "Lclient!na;")
	private static Class53 aClass53_1372 = Static109.method1737("Please remove ");

	@OriginalMember(owner = "client!vc", name = "kb", descriptor = "Lclient!na;")
	public static Class53 aClass53_1373 = aClass53_1372;

	@OriginalMember(owner = "client!vc", name = "lb", descriptor = "I")
	public static int anInt2757 = 0;

	@OriginalMember(owner = "client!vc", name = "pb", descriptor = "Lclient!na;")
	public static Class53 aClass53_1374 = Static109.method1737("scrollen:");

	@OriginalMember(owner = "client!vc", name = "Qb", descriptor = "Lclient!na;")
	public static Class53 aClass53_1377 = aClass53_1375;

	@OriginalMember(owner = "client!vc", name = "Tb", descriptor = "Lclient!na;")
	public static Class53 aClass53_1378 = aClass53_1372;

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "(I)V")
	public static void method1882() {
		if (Static45.aBoolean47 && Static72.anInt1813 != Static90.anInt2123) {
			Static21.method388(Static101.anInt2381, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray185[0], Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray181[0], Static72.anInt1813, Static15.anInt339);
		} else if (Static72.anInt1813 != Static122.anInt2837) {
			Static122.anInt2837 = Static72.anInt1813;
			Static41.method840(Static72.anInt1813);
		}
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(IB)Lclient!ka;")
	public static Class3_Sub1_Sub7 method1885(@OriginalArg(0) int arg0) {
		@Pc(12) Class3_Sub1_Sub7 local12 = (Class3_Sub1_Sub7) Static9.aClass75_6.method1728((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static103.aClass62_Sub1_15.method1512(arg0, 0);
		if (local22 == null) {
			return null;
		}
		local12 = new Class3_Sub1_Sub7();
		@Pc(35) Class3_Sub7 local35 = new Class3_Sub7(local22);
		local35.anInt964 = local35.aByteArray15.length - 12;
		@Pc(46) int local46 = local35.method638();
		@Pc(48) int local48 = 0;
		local12.anInt1540 = local35.method602();
		local12.anInt1537 = local35.method602();
		local12.anInt1539 = local35.method602();
		local12.anInt1533 = local35.method602();
		local12.anIntArray190 = new int[local46];
		local12.aClass53Array12 = new Class53[local46];
		local35.anInt964 = 0;
		local12.anIntArray189 = new int[local46];
		while (local35.anInt964 < local35.aByteArray15.length - 12) {
			@Pc(94) int local94 = local35.method602();
			if (local94 == 3) {
				local12.aClass53Array12[local48] = local35.method605();
			} else if (local94 >= 100 || local94 == 21 || local94 == 38 || local94 == 39) {
				local12.anIntArray189[local48] = local35.method647();
			} else {
				local12.anIntArray189[local48] = local35.method638();
			}
			local12.anIntArray190[local48++] = local94;
		}
		Static9.aClass75_6.method1730(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILclient!jf;IIB)V")
	public static void method1889(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub4_Sub1_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 == Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1 || Static36.anInt1122 >= 400) {
			return;
		}
		@Pc(55) Class53 local55;
		if (arg1.anInt1503 == 0) {
			local55 = Static103.method1689(new Class53[] { arg1.aClass53_668, Static21.method384(Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1489, arg1.anInt1489), Static22.aClass53_272, Static76.aClass53_846, Static108.method1725(arg1.anInt1489), Static46.aClass53_1436 });
		} else {
			local55 = Static103.method1689(new Class53[] { arg1.aClass53_668, Static22.aClass53_272, Static93.aClass53_1067, Static108.method1725(arg1.anInt1503), Static46.aClass53_1436 });
		}
		@Pc(135) int local135;
		if (Static91.anInt2201 == 1) {
			Static59.method1075(5, Static94.aClass53_1084, Static103.method1689(new Class53[] { Static5.aClass53_81, Static106.aClass53_1222, local55 }), arg0, arg2, arg3);
		} else if (!Static117.aBoolean119) {
			for (local135 = 4; local135 >= 0; local135--) {
				if (Static45.aClass53Array10[local135] != null) {
					@Pc(147) int local147 = 0;
					@Pc(149) short local149 = 0;
					if (Static45.aClass53Array10[local135].method1274(Static99.aClass53_1140)) {
						if (Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1489 < arg1.anInt1489) {
							local149 = 2000;
						}
						if (Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1506 != 0 && arg1.anInt1506 != 0) {
							if (Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1506 == arg1.anInt1506) {
								local149 = 2000;
							} else {
								local149 = 0;
							}
						}
					} else if (Static66.aBooleanArray8[local135]) {
						local149 = 2000;
					}
					if (local135 == 0) {
						local147 = local149 + 7;
					}
					if (local135 == 1) {
						local147 = local149 + 26;
					}
					if (local135 == 2) {
						local147 = local149 + 1;
					}
					if (local135 == 3) {
						local147 = local149 + 21;
					}
					if (local135 == 4) {
						local147 = local149 + 44;
					}
					Static59.method1075(local147, Static45.aClass53Array10[local135], Static103.method1689(new Class53[] { Static25.aClass53_333, local55 }), arg0, arg2, arg3);
				}
			}
		} else if ((Static104.anInt2535 & 0x8) == 8) {
			Static59.method1075(52, Static57.aClass53_672, Static103.method1689(new Class53[] { Static102.aClass53_1162, Static106.aClass53_1222, local55 }), arg0, arg2, arg3);
		}
		for (local135 = 0; local135 < Static36.anInt1122; local135++) {
			if (Static18.anIntArray48[local135] == 57) {
				Static99.aClass53Array17[local135] = Static103.method1689(new Class53[] { Static96.aClass53_666, Static76.aClass53_854, Static25.aClass53_333, local55 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "(I)V")
	public static void method1891() {
		while (true) {
			if (Static62.aClass3_Sub7_Sub1_2.method655(Static37.anInt2211) >= 27) {
				@Pc(14) int local14 = Static62.aClass3_Sub7_Sub1_2.method661(15);
				if (local14 != 32767) {
					@Pc(19) boolean local19 = false;
					if (Static44.aClass3_Sub1_Sub4_Sub1_Sub1Array1[local14] == null) {
						local19 = true;
						Static44.aClass3_Sub1_Sub4_Sub1_Sub1Array1[local14] = new Class3_Sub1_Sub4_Sub1_Sub1();
					}
					@Pc(35) Class3_Sub1_Sub4_Sub1_Sub1 local35 = Static44.aClass3_Sub1_Sub4_Sub1_Sub1Array1[local14];
					Static18.anIntArray49[Static20.anInt693++] = local14;
					local35.anInt1455 = Static27.anInt843;
					@Pc(51) int local51 = Static62.aClass3_Sub7_Sub1_2.method661(1);
					if (local51 == 1) {
						Static5.anIntArray19[Static107.anInt2462++] = local14;
					}
					@Pc(69) int local69 = Static83.anIntArray268[Static62.aClass3_Sub7_Sub1_2.method661(3)];
					if (local19) {
						local35.anInt1426 = local69;
					}
					@Pc(79) int local79 = Static62.aClass3_Sub7_Sub1_2.method661(5);
					if (local79 > 15) {
						local79 -= 32;
					}
					local35.aClass3_Sub1_Sub1_1 = Static101.method1666(Static62.aClass3_Sub7_Sub1_2.method661(13));
					@Pc(100) int local100 = Static62.aClass3_Sub7_Sub1_2.method661(5);
					if (local100 > 15) {
						local100 -= 32;
					}
					@Pc(109) int local109 = Static62.aClass3_Sub7_Sub1_2.method661(1);
					local35.anInt1440 = local35.aClass3_Sub1_Sub1_1.anInt143;
					local35.anInt1414 = local35.aClass3_Sub1_Sub1_1.anInt124;
					local35.anInt1446 = local35.aClass3_Sub1_Sub1_1.anInt115;
					local35.anInt1438 = local35.aClass3_Sub1_Sub1_1.anInt138;
					local35.anInt1441 = local35.aClass3_Sub1_Sub1_1.anInt135;
					local35.anInt1437 = local35.aClass3_Sub1_Sub1_1.anInt126;
					local35.anInt1453 = local35.aClass3_Sub1_Sub1_1.anInt137;
					local35.anInt1428 = local35.aClass3_Sub1_Sub1_1.anInt127;
					local35.anInt1449 = local35.aClass3_Sub1_Sub1_1.anInt134;
					if (local35.anInt1438 == 0) {
						local35.anInt1426 = 0;
					}
					local35.method1032(local79 + Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray185[0], local109 == 1, local100 + Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray181[0]);
					continue;
				}
			}
			Static62.aClass3_Sub7_Sub1_2.method659();
			return;
		}
	}

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "(I)V")
	public static void method1901() {
		aClass53_1375 = null;
		aClass27_44 = null;
		anIntArray388 = null;
		aClass53_1376 = null;
		aClass53_1374 = null;
		aClass53_1377 = null;
		aClass53_1364 = null;
		aClass53_1367 = null;
		aClass53_1370 = null;
		aClass53_1373 = null;
		aClass53_1378 = null;
		aClass53_1369 = null;
		aClass53_1372 = null;
		aClass53_1371 = null;
		aClass53_1363 = null;
		aClass77_11 = null;
		aClass53_1368 = null;
		aClass53_1365 = null;
		aClass53_1366 = null;
		aClass62_25 = null;
	}

	@OriginalMember(owner = "client!vc", name = "k", descriptor = "(I)V")
	public static void method1907() {
		Static62.aClass3_Sub7_Sub1_2.method658();
		@Pc(18) int local18 = Static62.aClass3_Sub7_Sub1_2.method661(8);
		@Pc(27) int local27;
		if (Static20.anInt693 > local18) {
			for (local27 = local18; local27 < Static20.anInt693; local27++) {
				Static119.anIntArray46[Static101.anInt2376++] = Static18.anIntArray49[local27];
			}
		}
		if (Static20.anInt693 < local18) {
			throw new RuntimeException("gnpov1");
		}
		Static20.anInt693 = 0;
		for (local27 = 0; local27 < local18; local27++) {
			@Pc(65) int local65 = Static18.anIntArray49[local27];
			@Pc(69) Class3_Sub1_Sub4_Sub1_Sub1 local69 = Static44.aClass3_Sub1_Sub4_Sub1_Sub1Array1[local65];
			@Pc(74) int local74 = Static62.aClass3_Sub7_Sub1_2.method661(1);
			if (local74 == 0) {
				Static18.anIntArray49[Static20.anInt693++] = local65;
				local69.anInt1455 = Static27.anInt843;
			} else {
				@Pc(94) int local94 = Static62.aClass3_Sub7_Sub1_2.method661(2);
				if (local94 == 0) {
					Static18.anIntArray49[Static20.anInt693++] = local65;
					local69.anInt1455 = Static27.anInt843;
					Static5.anIntArray19[Static107.anInt2462++] = local65;
				} else {
					@Pc(136) int local136;
					@Pc(146) int local146;
					if (local94 == 1) {
						Static18.anIntArray49[Static20.anInt693++] = local65;
						local69.anInt1455 = Static27.anInt843;
						local136 = Static62.aClass3_Sub7_Sub1_2.method661(3);
						local69.method1031(false, local136);
						local146 = Static62.aClass3_Sub7_Sub1_2.method661(1);
						if (local146 == 1) {
							Static5.anIntArray19[Static107.anInt2462++] = local65;
						}
					} else if (local94 == 2) {
						Static18.anIntArray49[Static20.anInt693++] = local65;
						local69.anInt1455 = Static27.anInt843;
						local136 = Static62.aClass3_Sub7_Sub1_2.method661(3);
						local69.method1031(true, local136);
						local146 = Static62.aClass3_Sub7_Sub1_2.method661(3);
						local69.method1031(true, local146);
						@Pc(200) int local200 = Static62.aClass3_Sub7_Sub1_2.method661(1);
						if (local200 == 1) {
							Static5.anIntArray19[Static107.anInt2462++] = local65;
						}
					} else if (local94 == 3) {
						Static119.anIntArray46[Static101.anInt2376++] = local65;
					}
				}
			}
		}
	}
}
