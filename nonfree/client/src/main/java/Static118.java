import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!oh", name = "n", descriptor = "[S")
	public static short[] aShortArray22;

	@OriginalMember(owner = "client!oh", name = "t", descriptor = "[I")
	public static int[] anIntArray284;

	@OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
	public static int anInt2685 = 0;

	@OriginalMember(owner = "client!oh", name = "l", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1150 = Static51.method932("me");

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILclient!je;)V")
	public static void method1903(@OriginalArg(1) Applet_Sub1 arg0) {
		if (Static133.aBoolean132) {
			Static99.method1643(arg0);
			return;
		}
		if (Static40.anInt976 == 1 && Static62.anInt1534 >= 715 && Static40.anInt977 >= 453) {
			Static155.aBoolean149 = !Static155.aBoolean149;
			if (Static155.aBoolean149) {
				Static138.method2181();
			} else {
				Static36.method761(Static95.aClass10_949, Static97.aClass10_966, Static170.aClass29_Sub1_51);
			}
		}
		if (Static49.anInt1185 == 5) {
			return;
		}
		Static46.anInt1145++;
		if (Static49.anInt1185 != 10) {
			return;
		}
		if (Static111.anInt2520 != 2 && Static130.anInt2891 == 0) {
			if (Static40.anInt976 == 1 && Static62.anInt1534 >= 5 && Static62.anInt1534 <= 105 && Static40.anInt977 >= 463 && Static40.anInt977 <= 498) {
				method1905();
				return;
			}
			if (Static129.aClass5_1 != null) {
				method1905();
			}
		}
		@Pc(118) int local118 = Static40.anInt976;
		@Pc(120) int local120 = Static62.anInt1534;
		@Pc(122) int local122 = Static40.anInt977;
		if (Static20.anInt499 == 0) {
			if (local118 == 1 && local120 >= 227 && local120 <= 377 && local122 >= 271 && local122 <= 311) {
				Static70.anInt1677 = 0;
				Static20.anInt499 = 3;
			}
			@Pc(174) boolean local174 = false;
			if (Static174.anInt3740 != 0) {
				while (Static75.method1259()) {
					if (Static64.anInt1577 == 84) {
						local174 = true;
						break;
					}
				}
			}
			if (local174 || local118 == 1 && local120 >= 387 && local120 <= 537 && local122 >= 271 && local122 <= 311) {
				Static20.anInt499 = 2;
				Static95.aClass10_947 = Static36.aClass10_425;
				Static95.aClass10_940 = Static174.aClass10_1594;
				Static95.aClass10_948 = Static36.aClass10_450;
				Static70.anInt1677 = 0;
			}
		} else if (Static20.anInt499 == 2) {
			@Pc(241) short local241 = 231;
			@Pc(242) int local242 = local241 + 30;
			if (local118 == 1 && local122 >= 246 && local122 < 261) {
				Static70.anInt1677 = 0;
			}
			local242 += 15;
			if (local118 == 1 && local122 >= 261 && local122 < 276) {
				Static70.anInt1677 = 1;
			}
			local242 += 15;
			if (local118 == 1 && local120 >= 227 && local120 <= 377 && local122 >= 301 && local122 <= 341) {
				Static95.aClass10_951 = Static95.aClass10_951.method364().method361();
				if (Static95.aClass10_951.method340() == 0) {
					Static160.method2426(Static77.aClass10_783, Static36.aClass10_433, Static36.aClass10_426);
				} else if (Static95.aClass10_945.method340() == 0) {
					Static160.method2426(Static10.aClass10_132, Static36.aClass10_444, Static36.aClass10_436);
				} else {
					Static160.method2426(Static119.aClass10_1169, Static36.aClass10_441, Static36.aClass10_455);
					Static45.method870(20);
				}
			} else {
				if (local118 == 1 && local120 >= 387 && local120 <= 537 && local122 >= 301 && local122 <= 341) {
					Static20.anInt499 = 0;
					Static95.aClass10_945 = Static95.aClass10_949;
					Static95.aClass10_951 = Static95.aClass10_949;
				}
				while (true) {
					@Pc(396) boolean local396;
					label238: do {
						while (Static75.method1259()) {
							local396 = false;
							for (@Pc(398) int local398 = 0; local398 < Static19.aClass10_229.method340(); local398++) {
								if (Static149.anInt3227 == Static19.aClass10_229.method357(local398)) {
									local396 = true;
									break;
								}
							}
							if (Static70.anInt1677 != 0) {
								continue label238;
							}
							if (Static64.anInt1577 == 85 && Static95.aClass10_951.method340() > 0) {
								Static95.aClass10_951 = Static95.aClass10_951.method353(0, Static95.aClass10_951.method340() - 1);
							}
							if (Static64.anInt1577 == 84 || Static64.anInt1577 == 80) {
								Static70.anInt1677 = 1;
							}
							if (local396 && Static95.aClass10_951.method340() < 12) {
								Static95.aClass10_951 = Static95.aClass10_951.method354(Static149.anInt3227);
							}
						}
						return;
					} while (Static70.anInt1677 != 1);
					if (Static64.anInt1577 == 85 && Static95.aClass10_945.method340() > 0) {
						Static95.aClass10_945 = Static95.aClass10_945.method353(0, Static95.aClass10_945.method340() - 1);
					}
					if (Static64.anInt1577 == 84 || Static64.anInt1577 == 80) {
						Static70.anInt1677 = 0;
					}
					if (Static174.anInt3740 != 0 && Static64.anInt1577 == 84) {
						Static95.aClass10_951 = Static95.aClass10_951.method364().method361();
						if (Static95.aClass10_951.method340() == 0) {
							Static160.method2426(Static77.aClass10_783, Static36.aClass10_433, Static36.aClass10_426);
							return;
						}
						if (Static95.aClass10_945.method340() == 0) {
							Static160.method2426(Static10.aClass10_132, Static36.aClass10_444, Static36.aClass10_436);
							return;
						}
						Static160.method2426(Static119.aClass10_1169, Static36.aClass10_441, Static36.aClass10_455);
						Static45.method870(20);
						return;
					}
					if (local396 && Static95.aClass10_945.method340() < 20) {
						Static95.aClass10_945 = Static95.aClass10_945.method354(Static149.anInt3227);
					}
				}
			}
		} else if (Static20.anInt499 == 3 && local118 == 1 && local120 >= 307 && local120 <= 457 && local122 >= 301 && local122 <= 341) {
			Static20.anInt499 = 0;
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
	private static void method1905() {
		try {
			if (Static129.aClass5_1 == null) {
				Static129.aClass5_1 = new Class5(Static57.aClass63_4, Static3.method36(new Class10[] { Static169.aClass10_1569, Static63.aClass10_684, Static66.aClass10_697 }).method369());
			} else {
				@Pc(32) byte[] local32 = Static129.aClass5_1.method169();
				if (local32 != null) {
					@Pc(39) Class2_Sub11 local39 = new Class2_Sub11(local32);
					Static5.anInt123 = local39.method1456();
					Static141.aClass8Array1 = new Class8[Static5.anInt123];
					for (@Pc(48) int local48 = 0; local48 < Static5.anInt123; local48++) {
						@Pc(58) Class8 local58 = Static141.aClass8Array1[local48] = new Class8();
						@Pc(62) int local62 = local39.method1456();
						local58.anInt502 = local62 & 0x7FFF;
						local58.aBoolean17 = (local62 & 0x8000) != 0;
						local58.aClass10_241 = local39.method1452();
						local58.anInt501 = local39.method1455();
						local58.anInt498 = local48;
						local58.anInt497 = Static133.method2122(local58.aClass10_241);
					}
					Static178.method2701(Static151.anIntArray343, Static167.anIntArray221, Static141.aClass8Array1, 0, Static141.aClass8Array1.length - 1);
					Static129.aClass5_1 = null;
					Static133.aBoolean132 = true;
				}
			}
		} catch (@Pc(128) Exception local128) {
			local128.printStackTrace();
			Static129.aClass5_1 = null;
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1907(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(10) Class2_Sub19 local10 = (Class2_Sub19) Static158.aClass12_13.method384();
		@Pc(12) Class2_Sub19 local12 = null;
		while (local10 != null) {
			if (arg4 == local10.anInt3000 && arg0 == local10.anInt2993 && arg7 == local10.anInt2998 && arg6 == local10.anInt3001) {
				local12 = local10;
				break;
			}
			local10 = (Class2_Sub19) Static158.aClass12_13.method381();
		}
		if (local12 == null) {
			local12 = new Class2_Sub19();
			local12.anInt2998 = arg7;
			local12.anInt3001 = arg6;
			local12.anInt3000 = arg4;
			local12.anInt2993 = arg0;
			Static106.method1722(local12);
			Static158.aClass12_13.method382(local12);
		}
		local12.anInt2994 = arg2;
		local12.anInt2990 = arg3;
		local12.anInt2992 = arg1;
		local12.anInt2996 = arg5;
		local12.anInt3003 = arg8;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IBI)V")
	public static void method1908(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static141.aClass2_Sub11_Sub1_3.method1495(48);
		Static141.aClass2_Sub11_Sub1_3.method1457(arg0);
		Static141.aClass2_Sub11_Sub1_3.method1445(arg1);
	}

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V")
	public static void method1909() {
		aClass10_1150 = null;
		anIntArray284 = null;
		aShortArray22 = null;
		Class62.anIntArray283 = null;
	}

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)V")
	public static void method1910() {
		while (true) {
			@Pc(12) Class12 local12 = Static34.aClass12_4;
			@Pc(19) Class2_Sub4 local19;
			synchronized (Static34.aClass12_4) {
				local19 = (Class2_Sub4) Static90.aClass12_7.method385();
			}
			if (local19 == null) {
				return;
			}
			local19.aClass29_Sub1_12.method1046(false, (int) local19.aLong139, local19.aClass83_1, local19.aByteArray6);
		}
	}
}
