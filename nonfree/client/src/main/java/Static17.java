import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!dd", name = "F", descriptor = "Lclient!lc;")
	public static Class31 aClass31_261 = Static56.method1206("headicons_hint");

	@OriginalMember(owner = "client!dd", name = "K", descriptor = "Z")
	public static boolean aBoolean51 = false;

	@OriginalMember(owner = "client!dd", name = "M", descriptor = "I")
	public static int anInt792 = -1;

	@OriginalMember(owner = "client!dd", name = "P", descriptor = "Lclient!lc;")
	public static Class31 aClass31_262 = Static56.method1206("@yel@World");

	@OriginalMember(owner = "client!dd", name = "Q", descriptor = "Lclient!lc;")
	public static Class31 aClass31_263 = Static56.method1206("@gre@World");

	@OriginalMember(owner = "client!dd", name = "T", descriptor = "Z")
	public static boolean aBoolean52 = true;

	@OriginalMember(owner = "client!dd", name = "V", descriptor = "I")
	public static int anInt796 = 0;

	@OriginalMember(owner = "client!dd", name = "X", descriptor = "[J")
	public static long[] aLongArray3 = new long[32];

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IILclient!lc;III)V")
	public static void method523(@OriginalArg(1) int arg0, @OriginalArg(2) Class31 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static59.anInt2044 >= 500) {
			return;
		}
		Static85.aClass31Array14[Static59.anInt2044] = arg1;
		Static63.anIntArray296[Static59.anInt2044] = arg2;
		Static64.anIntArray85[Static59.anInt2044] = arg3;
		Static55.anIntArray274[Static59.anInt2044] = arg4;
		Static64.anIntArray84[Static59.anInt2044] = arg0;
		Static59.anInt2044++;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIZ)Lclient!lc;")
	public static Class31 method524(@OriginalArg(1) int arg0) {
		@Pc(3) int local3 = 1;
		@Pc(21) int local21 = arg0 / 10;
		while (local21 != 0) {
			local21 /= 10;
			local3++;
		}
		@Pc(32) int local32 = local3;
		if (arg0 < 0) {
			local32 = local3 + 1;
		}
		@Pc(43) byte[] local43 = new byte[local32];
		if (arg0 < 0) {
			local43[0] = 45;
		}
		for (@Pc(67) int local67 = 0; local67 < local3; local67++) {
			@Pc(73) int local73 = arg0 % 10;
			if (local73 < 0) {
				local73 = -local73;
			}
			arg0 /= 10;
			if (local73 > 9) {
				local73 += 39;
			}
			local43[local32 - local67 - 1] = (byte) (local73 + 48);
		}
		@Pc(110) Class31 local110 = new Class31();
		local110.anInt1901 = local32;
		local110.aByteArray17 = local43;
		return local110;
	}

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)V")
	public static void method526() {
		Static38.aClass17_58.method782();
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!wd;BII[Lclient!vb;[B)V")
	public static void method527(@OriginalArg(0) Class64 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class60[] arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(15) Class2_Sub6 local15 = new Class2_Sub6(arg4);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local15.method646();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(29) int local29 = 0;
			while (true) {
				@Pc(33) int local33 = local15.method646();
				if (local33 == 0) {
					break;
				}
				local29 += local33 - 1;
				@Pc(45) int local45 = local29 & 0x3F;
				@Pc(51) int local51 = local29 >> 6 & 0x3F;
				@Pc(55) int local55 = local29 >> 12;
				@Pc(59) int local59 = local15.method665();
				@Pc(63) int local63 = local59 >> 2;
				@Pc(67) int local67 = local59 & 0x3;
				@Pc(71) int local71 = arg1 + local45;
				@Pc(75) int local75 = arg2 + local51;
				if (local75 > 0 && local71 > 0 && local75 < 103 && local71 < 103) {
					@Pc(95) int local95 = local55;
					if ((Static34.aByteArrayArrayArray17[1][local75][local71] & 0x2) == 2) {
						local95 = local55 - 1;
					}
					@Pc(109) Class60 local109 = null;
					if (local95 >= 0) {
						local109 = arg3[local95];
					}
					Static91.method1544(arg0, local67, local109, local17, local71, local75, local55, local63);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
	public static void method528() {
		Static95.anInt2558 = 0;
		@Pc(154) int local154;
		for (@Pc(18) int local18 = -1; local18 < Static49.anInt2696 + Static21.anInt1007; local18++) {
			@Pc(32) Class2_Sub1_Sub4_Sub6 local32;
			if (local18 == -1) {
				local32 = Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1;
			} else if (Static21.anInt1007 > local18) {
				local32 = Static102.aClass2_Sub1_Sub4_Sub6_Sub1Array3[Static78.anIntArray322[local18]];
			} else {
				local32 = Static93.aClass2_Sub1_Sub4_Sub6_Sub2Array1[Static57.anIntArray383[local18 - Static21.anInt1007]];
			}
			if (local32 != null && local32.method1270()) {
				@Pc(62) Class2_Sub1_Sub8 local62;
				if (local32 instanceof Class2_Sub1_Sub4_Sub6_Sub2) {
					local62 = ((Class2_Sub1_Sub4_Sub6_Sub2) local32).aClass2_Sub1_Sub8_1;
					if (local62.anIntArray271 != null) {
						local62 = local62.method1189();
					}
					if (local62 == null) {
						continue;
					}
				}
				if (Static21.anInt1007 <= local18) {
					local62 = ((Class2_Sub1_Sub4_Sub6_Sub2) local32).aClass2_Sub1_Sub8_1;
					if (local62.anInt1862 >= 0 && local62.anInt1862 < Static56.aClass2_Sub1_Sub3_Sub2Array7.length) {
						Static14.method420(local32.anInt2028 + 15, local32);
						if (Static31.anInt1271 > -1) {
							Static56.aClass2_Sub1_Sub3_Sub2Array7[local62.anInt1862].method469(Static31.anInt1271 - 12, Static10.anInt372 - 30);
						}
					}
					if (Static62.anInt2116 == 1 && Static61.anInt2099 == Static57.anIntArray383[local18 - Static21.anInt1007] && Static49.anInt2694 % 20 < 10) {
						Static14.method420(local32.anInt2028 + 15, local32);
						if (Static31.anInt1271 > -1) {
							Static39.aClass2_Sub1_Sub3_Sub2Array4[0].method469(Static31.anInt1271 - 12, Static10.anInt372 + -28);
						}
					}
				} else {
					local154 = 30;
					@Pc(157) Class2_Sub1_Sub4_Sub6_Sub1 local157 = (Class2_Sub1_Sub4_Sub6_Sub1) local32;
					if (local157.anInt1712 != -1 || local157.anInt1723 != -1) {
						Static14.method420(local32.anInt2028 + 15, local32);
						if (Static31.anInt1271 > -1) {
							if (local157.anInt1712 != -1) {
								Static42.aClass2_Sub1_Sub3_Sub2Array5[local157.anInt1712].method469(Static31.anInt1271 - 12, Static10.anInt372 - 30);
								local154 += 25;
							}
							if (local157.anInt1723 != -1) {
								Static56.aClass2_Sub1_Sub3_Sub2Array7[local157.anInt1723].method469(Static31.anInt1271 - 12, -local154 + Static10.anInt372);
								local154 += 25;
							}
						}
					}
					if (local18 >= 0 && Static62.anInt2116 == 10 && Static78.anIntArray322[local18] == Static51.anInt1780) {
						Static14.method420(local32.anInt2028 + 15, local32);
						if (Static31.anInt1271 > -1) {
							Static39.aClass2_Sub1_Sub3_Sub2Array4[1].method469(Static31.anInt1271 - 12, Static10.anInt372 - local154);
						}
					}
				}
				if (local32.aClass31_708 != null && (Static21.anInt1007 <= local18 || Static78.anInt2283 == 0 || Static78.anInt2283 == 3 || Static78.anInt2283 == 1 && Static59.method1282(((Class2_Sub1_Sub4_Sub6_Sub1) local32).aClass31_612))) {
					Static14.method420(local32.anInt2028, local32);
					if (Static31.anInt1271 > -1 && Static88.anInt2350 > Static95.anInt2558) {
						Static88.anIntArray334[Static95.anInt2558] = Static69.aClass2_Sub1_Sub3_Sub3_5.method961(local32.aClass31_708) / 2;
						Static88.anIntArray333[Static95.anInt2558] = Static69.aClass2_Sub1_Sub3_Sub3_5.anInt1392;
						Static88.anIntArray335[Static95.anInt2558] = Static31.anInt1271;
						Static88.anIntArray330[Static95.anInt2558] = Static10.anInt372;
						Static88.anIntArray332[Static95.anInt2558] = local32.anInt2004;
						Static88.anIntArray329[Static95.anInt2558] = local32.anInt2012;
						Static88.anIntArray331[Static95.anInt2558] = local32.anInt1981;
						Static88.aClass31Array10[Static95.anInt2558] = local32.aClass31_708;
						Static95.anInt2558++;
					}
				}
				if (Static49.anInt2694 < local32.anInt2021) {
					Static14.method420(local32.anInt2028 + 15, local32);
					if (Static31.anInt1271 > -1) {
						local154 = local32.anInt1993 * 30 / local32.anInt2002;
						if (local154 > 30) {
							local154 = 30;
						}
						Static81.method1646(Static31.anInt1271 - 15, Static10.anInt372 + -3, local154, 5, 65280);
						Static81.method1646(Static31.anInt1271 + local154 - 15, Static10.anInt372 + -3, 30 - local154, 5, 16711680);
					}
				}
				for (local154 = 0; local154 < 4; local154++) {
					if (local32.anIntArray283[local154] > Static49.anInt2694) {
						Static14.method420(local32.anInt2028 / 2, local32);
						if (Static31.anInt1271 > -1) {
							if (local154 == 1) {
								Static10.anInt372 -= 20;
							}
							if (local154 == 2) {
								Static31.anInt1271 -= 15;
								Static10.anInt372 -= 10;
							}
							if (local154 == 3) {
								Static31.anInt1271 += 15;
								Static10.anInt372 -= 10;
							}
							Static11.aClass2_Sub1_Sub3_Sub2Array3[local32.anIntArray284[local154]].method469(Static31.anInt1271 - 12, Static10.anInt372 + -12);
							Static28.aClass2_Sub1_Sub3_Sub3_3.method962(Static89.method1499(local32.anIntArray282[local154]), Static31.anInt1271, Static10.anInt372 + 4, 0);
							Static28.aClass2_Sub1_Sub3_Sub3_3.method962(Static89.method1499(local32.anIntArray282[local154]), Static31.anInt1271 - 1, Static10.anInt372 + 3, 16777215);
						}
					}
				}
			}
		}
		for (@Pc(504) int local504 = 0; local504 < Static95.anInt2558; local504++) {
			local154 = Static88.anIntArray335[local504];
			@Pc(514) int local514 = Static88.anIntArray334[local504];
			@Pc(518) int local518 = Static88.anIntArray330[local504];
			@Pc(520) boolean local520 = true;
			@Pc(524) int local524 = Static88.anIntArray333[local504];
			while (local520) {
				local520 = false;
				for (@Pc(530) int local530 = 0; local530 < local504; local530++) {
					if (local518 + 2 > Static88.anIntArray330[local530] + -Static88.anIntArray333[local530] && Static88.anIntArray330[local530] + 2 > -local524 + local518 && local154 - local514 < Static88.anIntArray334[local530] + Static88.anIntArray335[local530] && local154 + local514 > Static88.anIntArray335[local530] + -Static88.anIntArray334[local530] && Static88.anIntArray330[local530] - Static88.anIntArray333[local530] < local518) {
						local518 = Static88.anIntArray330[local530] - Static88.anIntArray333[local530];
						local520 = true;
					}
				}
			}
			Static31.anInt1271 = Static88.anIntArray335[local504];
			Static10.anInt372 = Static88.anIntArray330[local504] = local518;
			@Pc(627) Class31 local627 = Static88.aClass31Array10[local504];
			if (Static12.anInt537 == 0) {
				@Pc(650) int local650 = 16776960;
				if (Static88.anIntArray332[local504] < 6) {
					local650 = Static25.anIntArray123[Static88.anIntArray332[local504]];
				}
				if (Static88.anIntArray332[local504] == 6) {
					local650 = Static78.anInt2278 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static88.anIntArray332[local504] == 7) {
					local650 = Static78.anInt2278 % 20 >= 10 ? 65535 : 255;
				}
				if (Static88.anIntArray332[local504] == 8) {
					local650 = Static78.anInt2278 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(720) int local720;
				if (Static88.anIntArray332[local504] == 9) {
					local720 = 150 - Static88.anIntArray331[local504];
					if (local720 < 50) {
						local650 = local720 * 1280 + 16711680;
					} else if (local720 < 100) {
						local650 = 16776960 - (local720 - 50) * 327680;
					} else if (local720 < 150) {
						local650 = local720 * 5 + 64780;
					}
				}
				if (Static88.anIntArray332[local504] == 10) {
					local720 = 150 - Static88.anIntArray331[local504];
					if (local720 < 50) {
						local650 = local720 * 5 + 16711680;
					} else if (local720 < 100) {
						local650 = 16711935 - (local720 - 50) * 327680;
					} else if (local720 < 150) {
						local650 = (local720 - 100) * 327680 + 255 - (local720 - 100) * 5;
					}
				}
				if (Static88.anIntArray332[local504] == 11) {
					local720 = 150 - Static88.anIntArray331[local504];
					if (local720 < 50) {
						local650 = 16777215 - local720 * 327685;
					} else if (local720 < 100) {
						local650 = (local720 - 50) * 327685 + 65280;
					} else if (local720 < 150) {
						local650 = 32768000 + 16777215 - local720 * 327680;
					}
				}
				if (Static88.anIntArray329[local504] == 0) {
					Static69.aClass2_Sub1_Sub3_Sub3_5.method962(local627, Static31.anInt1271, Static10.anInt372 + 1, 0);
					Static69.aClass2_Sub1_Sub3_Sub3_5.method962(local627, Static31.anInt1271, Static10.anInt372, local650);
				}
				if (Static88.anIntArray329[local504] == 1) {
					Static69.aClass2_Sub1_Sub3_Sub3_5.method953(local627, Static31.anInt1271, Static10.anInt372 + 1, 0, Static78.anInt2278);
					Static69.aClass2_Sub1_Sub3_Sub3_5.method953(local627, Static31.anInt1271, Static10.anInt372, local650, Static78.anInt2278);
				}
				if (Static88.anIntArray329[local504] == 2) {
					Static69.aClass2_Sub1_Sub3_Sub3_5.method963(local627, Static31.anInt1271, Static10.anInt372 + 1, 0, Static78.anInt2278);
					Static69.aClass2_Sub1_Sub3_Sub3_5.method963(local627, Static31.anInt1271, Static10.anInt372, local650, Static78.anInt2278);
				}
				if (Static88.anIntArray329[local504] == 3) {
					Static69.aClass2_Sub1_Sub3_Sub3_5.method965(local627, Static31.anInt1271, Static10.anInt372 + 1, 0, Static78.anInt2278, 150 - Static88.anIntArray331[local504]);
					Static69.aClass2_Sub1_Sub3_Sub3_5.method965(local627, Static31.anInt1271, Static10.anInt372, local650, Static78.anInt2278, 150 - Static88.anIntArray331[local504]);
				}
				@Pc(991) int local991;
				if (Static88.anIntArray329[local504] == 4) {
					local720 = Static69.aClass2_Sub1_Sub3_Sub3_5.method961(local627);
					local991 = (150 - Static88.anIntArray331[local504]) * (local720 + 100) / 150;
					Static81.method1637(Static31.anInt1271 - 50, 0, Static31.anInt1271 + 50, 334);
					Static69.aClass2_Sub1_Sub3_Sub3_5.method954(local627, Static31.anInt1271 + 50 - local991, Static10.anInt372 + 1, 0);
					Static69.aClass2_Sub1_Sub3_Sub3_5.method954(local627, Static31.anInt1271 + 50 - local991, Static10.anInt372, local650);
					Static81.method1642();
				}
				if (Static88.anIntArray329[local504] == 5) {
					local720 = 150 - Static88.anIntArray331[local504];
					local991 = 0;
					if (local720 < 25) {
						local991 = local720 - 25;
					} else if (local720 > 125) {
						local991 = local720 - 125;
					}
					Static81.method1637(0, Static10.anInt372 - Static69.aClass2_Sub1_Sub3_Sub3_5.anInt1392 - 1, 512, Static10.anInt372 + 5);
					Static69.aClass2_Sub1_Sub3_Sub3_5.method962(local627, Static31.anInt1271, local991 + Static10.anInt372 + 1, 0);
					Static69.aClass2_Sub1_Sub3_Sub3_5.method962(local627, Static31.anInt1271, Static10.anInt372 + local991, local650);
					Static81.method1642();
				}
			} else {
				Static69.aClass2_Sub1_Sub3_Sub3_5.method962(local627, Static31.anInt1271, Static10.anInt372 + 1, 0);
				Static69.aClass2_Sub1_Sub3_Sub3_5.method962(local627, Static31.anInt1271, Static10.anInt372, 16776960);
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(Z)V")
	public static void method529() {
		if (Static13.aClass12_1 != null) {
			@Pc(7) Class12 local7 = Static13.aClass12_1;
			synchronized (Static13.aClass12_1) {
				Static13.aClass12_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "(I)V")
	public static void method530() {
		@Pc(7) int local7 = Static25.anInt1109;
		@Pc(9) int local9 = Static100.anInt2717;
		@Pc(11) int local11 = Static15.anInt650;
		@Pc(13) int local13 = Static93.anInt2522;
		Static81.method1646(local7, local9, local11, local13, 6116423);
		Static81.method1646(local7 + 1, local9 + 1, local11 - 2, 16, 0);
		Static81.method1635(local7 + 1, local9 + 18, local11 - 2, local13 + -19, 0);
		Static69.aClass2_Sub1_Sub3_Sub3_5.method954(Static13.aClass31_183, local7 + 3, local9 + 14, 6116423);
		@Pc(64) int local64 = Static61.anInt2102;
		@Pc(66) int local66 = Static85.anInt2508;
		if (Static64.anInt601 == 0) {
			local64 -= 4;
			local66 -= 4;
		}
		if (Static64.anInt601 == 1) {
			local66 -= 553;
			local64 -= 205;
		}
		if (Static64.anInt601 == 2) {
			local64 -= 357;
			local66 -= 17;
		}
		for (@Pc(87) int local87 = 0; local87 < Static59.anInt2044; local87++) {
			@Pc(102) int local102 = (Static59.anInt2044 - local87 - 1) * 15 + local9 + 31;
			@Pc(104) int local104 = 16777215;
			if (local7 < local66 && local66 < local11 + local7 && local64 > local102 - 13 && local102 + 3 > local64) {
				local104 = 16776960;
			}
			Static69.aClass2_Sub1_Sub3_Sub3_5.method959(Static85.aClass31Array14[local87], local7 + 3, local102, local104, true);
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)V")
	public static void method531() {
		aClass31_263 = null;
		aClass31_261 = null;
		aLongArray3 = null;
		aClass31_262 = null;
	}
}
