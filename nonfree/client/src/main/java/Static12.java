import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!c", name = "k", descriptor = "[Lclient!nb;")
	public static Class3_Sub1_Sub5_Sub4[] aClass3_Sub1_Sub5_Sub4Array4;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "Lclient!na;")
	public static Class53 aClass53_115 = Static109.method1737("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!c", name = "h", descriptor = "Z")
	public static boolean aBoolean18 = false;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "I")
	public static int anInt316 = 0;

	@OriginalMember(owner = "client!c", name = "j", descriptor = "[S")
	public static short[] aShortArray5 = new short[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486 };

	@OriginalMember(owner = "client!c", name = "m", descriptor = "I")
	public static volatile int anInt318 = -1;

	@OriginalMember(owner = "client!c", name = "u", descriptor = "Lclient!na;")
	public static Class53 aClass53_116 = Static109.method1737("und haben es deaktiviert)3 Klicken Sie auf der");

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IILclient!vb;ILclient!vb;B[Ljava/lang/Object;)V")
	public static void method188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub15 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub1_Sub15 arg4, @OriginalArg(6) Object[] arg5) {
		@Pc(11) int local11 = (Integer) arg5[0];
		@Pc(15) Class3_Sub1_Sub7 local15 = Static118.method1885(local11);
		if (local15 == null) {
			return;
		}
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = -1;
		@Pc(24) int local24 = 0;
		@Pc(35) int[] local35 = local15.anIntArray190;
		@Pc(38) int[] local38 = local15.anIntArray189;
		@Pc(40) byte local40 = -1;
		try {
			Static16.aClass53Array5 = new Class53[local15.anInt1537];
			Static90.anIntArray276 = new int[local15.anInt1540];
			@Pc(50) int local50 = 0;
			@Pc(52) int local52 = 0;
			@Pc(67) int local67;
			for (@Pc(54) int local54 = 1; local54 < arg5.length; local54++) {
				if (arg5[local54] instanceof Integer) {
					local67 = (Integer) arg5[local54];
					if (local67 == -2147483647) {
						local67 = arg3;
					}
					if (local67 == -2147483646) {
						local67 = arg1;
					}
					if (local67 == -2147483645) {
						local67 = arg2 == null ? -1 : arg2.anInt2686;
					}
					if (local67 == -2147483644) {
						local67 = arg0;
					}
					if (local67 == -2147483643) {
						local67 = arg2 == null ? -1 : arg2.anInt2693;
					}
					if (local67 == -2147483642) {
						local67 = arg4 == null ? -1 : arg4.anInt2686;
					}
					if (local67 == -2147483641) {
						local67 = arg4 == null ? -1 : arg4.anInt2693;
					}
					Static90.anIntArray276[local52++] = local67;
				} else if (arg5[local54] instanceof Class53) {
					Static16.aClass53Array5[local50++] = (Class53) arg5[local54];
				}
			}
			local67 = 0;
			label1248: while (true) {
				local67++;
				if (local67 > 200000) {
					throw new RuntimeException("slow");
				}
				local22++;
				@Pc(173) int local173 = local35[local22];
				@Pc(718) int local718;
				@Pc(592) int local592;
				@Pc(571) int local571;
				@Pc(713) int local713;
				@Pc(529) Class53 local529;
				if (local173 < 100) {
					if (local173 == 0) {
						Static119.anIntArray47[local24++] = local38[local22];
						continue;
					}
					@Pc(201) int local201;
					if (local173 == 1) {
						local201 = local38[local22];
						Static119.anIntArray47[local24++] = Static13.anIntArray31[local201];
						continue;
					}
					if (local173 == 2) {
						local201 = local38[local22];
						local24--;
						Static13.anIntArray31[local201] = Static119.anIntArray47[local24];
						continue;
					}
					if (local173 == 3) {
						Static32.aClass53Array7[local20++] = local15.aClass53Array12[local22];
						continue;
					}
					if (local173 == 6) {
						local22 += local38[local22];
						continue;
					}
					if (local173 == 7) {
						local24 -= 2;
						if (Static119.anIntArray47[local24] != Static119.anIntArray47[local24 + 1]) {
							local22 += local38[local22];
						}
						continue;
					}
					if (local173 == 8) {
						local24 -= 2;
						if (Static119.anIntArray47[local24 + 1] == Static119.anIntArray47[local24]) {
							local22 += local38[local22];
						}
						continue;
					}
					if (local173 == 9) {
						local24 -= 2;
						if (Static119.anIntArray47[local24] < Static119.anIntArray47[local24 + 1]) {
							local22 += local38[local22];
						}
						continue;
					}
					if (local173 == 10) {
						local24 -= 2;
						if (Static119.anIntArray47[local24 + 1] < Static119.anIntArray47[local24]) {
							local22 += local38[local22];
						}
						continue;
					}
					if (local173 == 21) {
						if (Static98.anInt2331 == 0) {
							return;
						}
						@Pc(354) Class59 local354 = Static107.aClass59Array1[--Static98.anInt2331];
						local22 = local354.anInt2108;
						local15 = local354.aClass3_Sub1_Sub7_1;
						Static16.aClass53Array5 = local354.aClass53Array15;
						local35 = local15.anIntArray190;
						local38 = local15.anIntArray189;
						Static90.anIntArray276 = local354.anIntArray275;
						continue;
					}
					if (local173 == 25) {
						local201 = local38[local22];
						Static119.anIntArray47[local24++] = Static70.method1202(local201);
						continue;
					}
					if (local173 == 27) {
						local201 = local38[local22];
						local24--;
						Static98.method1635(Static119.anIntArray47[local24], local201);
						continue;
					}
					if (local173 == 31) {
						local24 -= 2;
						if (Static119.anIntArray47[local24 + 1] >= Static119.anIntArray47[local24]) {
							local22 += local38[local22];
						}
						continue;
					}
					if (local173 == 32) {
						local24 -= 2;
						if (Static119.anIntArray47[local24] >= Static119.anIntArray47[local24 + 1]) {
							local22 += local38[local22];
						}
						continue;
					}
					if (local173 == 33) {
						Static119.anIntArray47[local24++] = Static90.anIntArray276[local38[local22]];
						continue;
					}
					@Pc(475) int local475;
					if (local173 == 34) {
						local475 = local38[local22];
						local24--;
						Static90.anIntArray276[local475] = Static119.anIntArray47[local24];
						continue;
					}
					if (local173 == 35) {
						Static32.aClass53Array7[local20++] = Static16.aClass53Array5[local38[local22]];
						continue;
					}
					if (local173 == 36) {
						local475 = local38[local22];
						local20--;
						Static16.aClass53Array5[local475] = Static32.aClass53Array7[local20];
						continue;
					}
					if (local173 == 37) {
						local201 = local38[local22];
						local20 -= local201;
						local529 = Static90.method1467(Static32.aClass53Array7, local20, local201);
						Static32.aClass53Array7[local20++] = local529;
						continue;
					}
					if (local173 == 38) {
						local24--;
						continue;
					}
					if (local173 == 39) {
						local20--;
						continue;
					}
					if (local173 == 40) {
						local201 = local38[local22];
						@Pc(561) Class3_Sub1_Sub7 local561 = Static118.method1885(local201);
						@Pc(565) int[] local565 = new int[local561.anInt1540];
						@Pc(569) Class53[] local569 = new Class53[local561.anInt1537];
						for (local571 = 0; local571 < local561.anInt1539; local571++) {
							local565[local571] = Static119.anIntArray47[local24 + local571 - local561.anInt1539];
						}
						for (local592 = 0; local592 < local561.anInt1533; local592++) {
							local569[local592] = Static32.aClass53Array7[local20 + local592 - local561.anInt1533];
						}
						local24 -= local561.anInt1539;
						local20 -= local561.anInt1533;
						@Pc(630) Class59 local630 = new Class59();
						local630.aClass53Array15 = Static16.aClass53Array5;
						local630.anIntArray275 = Static90.anIntArray276;
						local630.aClass3_Sub1_Sub7_1 = local15;
						local630.anInt2108 = local22;
						local15 = local561;
						Static107.aClass59Array1[Static98.anInt2331++] = local630;
						local22 = -1;
						Static90.anIntArray276 = local565;
						local35 = local561.anIntArray190;
						Static16.aClass53Array5 = local569;
						local38 = local561.anIntArray189;
						continue;
					}
					if (local173 == 42) {
						Static119.anIntArray47[local24++] = Static51.anIntArray163[local38[local22]];
						continue;
					}
					if (local173 == 43) {
						local475 = local38[local22];
						local24--;
						Static51.anIntArray163[local475] = Static119.anIntArray47[local24];
						continue;
					}
					if (local173 == 44) {
						local201 = local38[local22] >> 16;
						local713 = local38[local22] & 0xFFFF;
						local24--;
						local718 = Static119.anIntArray47[local24];
						if (local718 >= 0 && local718 <= 5000) {
							@Pc(731) byte local731 = -1;
							Static3.anIntArray4[local201] = local718;
							if (local713 == 105) {
								local731 = 0;
							}
							local571 = 0;
							while (true) {
								if (local718 <= local571) {
									continue label1248;
								}
								Static25.anIntArrayArray5[local201][local571] = local731;
								local571++;
							}
						}
						throw new RuntimeException();
					}
					if (local173 == 45) {
						local201 = local38[local22];
						local24--;
						local713 = Static119.anIntArray47[local24];
						if (local713 >= 0 && local713 < Static3.anIntArray4[local201]) {
							Static119.anIntArray47[local24++] = Static25.anIntArrayArray5[local201][local713];
							continue;
						}
						throw new RuntimeException();
					}
					if (local173 == 46) {
						local24 -= 2;
						local201 = local38[local22];
						local713 = Static119.anIntArray47[local24];
						if (local713 >= 0 && local713 < Static3.anIntArray4[local201]) {
							Static25.anIntArrayArray5[local201][local713] = Static119.anIntArray47[local24 + 1];
							continue;
						}
						throw new RuntimeException();
					}
				}
				@Pc(836) boolean local836;
				if (local38[local22] == 1) {
					local836 = true;
				} else {
					local836 = false;
				}
				@Pc(998) Class3_Sub1_Sub15 local998;
				@Pc(861) int local861;
				@Pc(905) int local905;
				if (local173 < 1000) {
					if (local173 == 100) {
						local24 -= 3;
						local713 = Static119.anIntArray47[local24];
						local861 = Static119.anIntArray47[local24 + 2];
						local718 = Static119.anIntArray47[local24 + 1];
						if (local718 == 0) {
							throw new RuntimeException();
						}
						@Pc(880) Class3_Sub1_Sub15 local880 = Static30.method666(local713);
						if (local880.aClass3_Sub1_Sub15Array2 == null) {
							local880.aClass3_Sub1_Sub15Array2 = new Class3_Sub1_Sub15[local861 + 1];
						}
						if (local880.aClass3_Sub1_Sub15Array2.length <= local861) {
							@Pc(903) Class3_Sub1_Sub15[] local903 = new Class3_Sub1_Sub15[local861 + 1];
							for (local905 = 0; local905 < local880.aClass3_Sub1_Sub15Array2.length; local905++) {
								local903[local905] = local880.aClass3_Sub1_Sub15Array2[local905];
							}
							local880.aClass3_Sub1_Sub15Array2 = local903;
						}
						if (local861 > 0 && local880.aClass3_Sub1_Sub15Array2[local861 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local861 - 1));
						}
						@Pc(953) Class3_Sub1_Sub15 local953 = new Class3_Sub1_Sub15();
						local953.aBoolean112 = true;
						local953.anInt2707 = local718;
						local953.anInt2704 = local953.anInt2686 = local880.anInt2686;
						local953.anInt2693 = local861;
						local880.aClass3_Sub1_Sub15Array2[local861] = local953;
						if (local836) {
							Static5.aClass3_Sub1_Sub15_1 = local953;
						} else {
							Static18.aClass3_Sub1_Sub15_3 = local953;
						}
						Static3.method48(local880);
						continue;
					}
					if (local173 == 101) {
						local998 = local836 ? Static5.aClass3_Sub1_Sub15_1 : Static18.aClass3_Sub1_Sub15_3;
						@Pc(1003) Class3_Sub1_Sub15 local1003 = Static30.method666(local998.anInt2686);
						local1003.aClass3_Sub1_Sub15Array2[local998.anInt2693] = null;
						Static3.method48(local1003);
						continue;
					}
					if (local173 == 102) {
						local24--;
						local998 = Static30.method666(Static119.anIntArray47[local24]);
						local998.aClass3_Sub1_Sub15Array2 = null;
						Static3.method48(local998);
						continue;
					}
					if (local173 == 200) {
						local24 -= 2;
						local713 = Static119.anIntArray47[local24];
						local718 = Static119.anIntArray47[local24 + 1];
						@Pc(1055) Class3_Sub1_Sub15 local1055 = Static38.method782(local718, local713);
						if (local1055 != null && local718 != -1) {
							Static119.anIntArray47[local24++] = 1;
							if (local836) {
								Static5.aClass3_Sub1_Sub15_1 = local1055;
							} else {
								Static18.aClass3_Sub1_Sub15_3 = local1055;
							}
							continue;
						}
						Static119.anIntArray47[local24++] = 0;
						continue;
					}
				} else if (local173 >= 1000 && local173 < 1100 || local173 >= 2000 && local173 < 2100) {
					if (local173 >= 2000) {
						local24--;
						local998 = Static30.method666(Static119.anIntArray47[local24]);
						local173 -= 1000;
					} else {
						local998 = local836 ? Static5.aClass3_Sub1_Sub15_1 : Static18.aClass3_Sub1_Sub15_3;
					}
					Static3.method48(local998);
					if (local173 == 1000) {
						local24 -= 2;
						local998.anInt2677 = Static119.anIntArray47[local24];
						local998.anInt2708 = Static119.anIntArray47[local24 + 1];
						continue;
					}
					if (local173 == 1001) {
						local24 -= 2;
						local998.anInt2727 = Static119.anIntArray47[local24];
						local998.anInt2703 = Static119.anIntArray47[local24 + 1];
						continue;
					}
					if (local173 == 1003) {
						local24--;
						local998.aBoolean113 = Static119.anIntArray47[local24] == 1;
						continue;
					}
				} else if (local173 >= 1100 && local173 < 1200 || local173 >= 2100 && local173 < 2200) {
					if (local173 >= 2000) {
						local24--;
						local998 = Static30.method666(Static119.anIntArray47[local24]);
						local173 -= 1000;
					} else {
						local998 = local836 ? Static5.aClass3_Sub1_Sub15_1 : Static18.aClass3_Sub1_Sub15_3;
					}
					Static3.method48(local998);
					if (local173 == 1100) {
						local24 -= 2;
						local998.anInt2691 = Static119.anIntArray47[local24];
						if (local998.anInt2691 > local998.anInt2705 - local998.anInt2727) {
							local998.anInt2691 = local998.anInt2705 - local998.anInt2727;
						}
						if (local998.anInt2691 < 0) {
							local998.anInt2691 = 0;
						}
						local998.anInt2724 = Static119.anIntArray47[local24 + 1];
						if (local998.anInt2724 > local998.anInt2669 - local998.anInt2703) {
							local998.anInt2724 = local998.anInt2669 - local998.anInt2703;
						}
						if (local998.anInt2724 < 0) {
							local998.anInt2724 = 0;
						}
						continue;
					}
					if (local173 == 1101) {
						local24--;
						local998.anInt2672 = Static119.anIntArray47[local24];
						continue;
					}
					if (local173 == 1102) {
						local24--;
						local998.aBoolean121 = Static119.anIntArray47[local24] == 1;
						continue;
					}
					if (local173 == 1103) {
						local24--;
						local998.anInt2720 = Static119.anIntArray47[local24];
						continue;
					}
					if (local173 == 1104) {
						local24--;
						local998.anInt2665 = Static119.anIntArray47[local24];
						continue;
					}
					if (local173 == 1105) {
						local24--;
						local998.anInt2675 = Static119.anIntArray47[local24];
						continue;
					}
					if (local173 == 1106) {
						local24--;
						local998.anInt2662 = Static119.anIntArray47[local24];
						continue;
					}
					if (local173 == 1107) {
						local24--;
						local998.aBoolean114 = Static119.anIntArray47[local24] == 1;
						continue;
					}
					if (local173 == 1108) {
						local998.anInt2700 = 1;
						local24--;
						local998.anInt2721 = Static119.anIntArray47[local24];
						continue;
					}
					if (local173 == 1109) {
						local24 -= 6;
						local998.anInt2689 = Static119.anIntArray47[local24];
						local998.anInt2674 = Static119.anIntArray47[local24 + 1];
						local998.anInt2723 = Static119.anIntArray47[local24 + 2];
						local998.anInt2717 = Static119.anIntArray47[local24 + 3];
						local998.anInt2706 = Static119.anIntArray47[local24 + 4];
						local998.anInt2690 = Static119.anIntArray47[local24 + 5];
						continue;
					}
					if (local173 == 1110) {
						local24--;
						local998.anInt2716 = Static119.anIntArray47[local24];
						continue;
					}
					if (local173 == 1111) {
						local24--;
						local998.aBoolean116 = Static119.anIntArray47[local24] == 1;
						continue;
					}
					if (local173 == 1112) {
						local20--;
						local998.aClass53_1346 = Static32.aClass53Array7[local20];
						continue;
					}
					if (local173 == 1113) {
						local24--;
						local998.anInt2666 = Static119.anIntArray47[local24];
						continue;
					}
					if (local173 == 1114) {
						local24 -= 3;
						local998.anInt2729 = Static119.anIntArray47[local24];
						local998.anInt2714 = Static119.anIntArray47[local24 + 1];
						local998.anInt2687 = Static119.anIntArray47[local24 + 2];
						continue;
					}
					if (local173 == 1115) {
						local24--;
						local998.aBoolean120 = Static119.anIntArray47[local24] == 1;
						continue;
					}
					if (local173 == 1116) {
						local24--;
						local998.anInt2710 = Static119.anIntArray47[local24];
						continue;
					}
					if (local173 == 1117) {
						local24--;
						local998.anInt2699 = Static119.anIntArray47[local24];
						continue;
					}
					if (local173 == 1118) {
						local24--;
						local998.aBoolean118 = Static119.anIntArray47[local24] == 1;
						continue;
					}
					if (local173 == 1119) {
						local24--;
						local998.aBoolean122 = Static119.anIntArray47[local24] == 1;
						continue;
					}
					if (local173 == 1120) {
						local24 -= 2;
						local998.anInt2705 = Static119.anIntArray47[local24];
						local998.anInt2669 = Static119.anIntArray47[local24 + 1];
						continue;
					}
				} else if (local173 >= 1200 && local173 < 1300 || !(local173 < 2200 || local173 >= 2300)) {
					if (local173 >= 2000) {
						local173 -= 1000;
						local24--;
						local998 = Static30.method666(Static119.anIntArray47[local24]);
					} else {
						local998 = local836 ? Static5.aClass3_Sub1_Sub15_1 : Static18.aClass3_Sub1_Sub15_3;
					}
					Static3.method48(local998);
					if (local173 == 1200) {
						local24 -= 2;
						local861 = Static119.anIntArray47[local24 + 1];
						local718 = Static119.anIntArray47[local24];
						local998.anInt2681 = local718;
						local998.anInt2713 = local861;
						@Pc(4253) Class3_Sub1_Sub8 local4253 = Static2.method38(local718);
						local998.anInt2723 = local4253.anInt1603;
						local998.anInt2717 = local4253.anInt1577;
						local998.anInt2690 = local4253.anInt1598;
						if (local998.anInt2727 > 0) {
							local998.anInt2690 = local998.anInt2690 * 32 / local998.anInt2727;
						}
						local998.anInt2689 = local4253.anInt1591;
						local998.anInt2674 = local4253.anInt1604;
						local998.anInt2706 = local4253.anInt1596;
						continue;
					}
					if (local173 == 1201) {
						local998.anInt2700 = 2;
						local24--;
						local998.anInt2721 = Static119.anIntArray47[local24];
						continue;
					}
					if (local173 == 1202) {
						local998.anInt2700 = 3;
						local998.anInt2721 = Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.aClass34_1.method882();
						continue;
					}
				} else if ((local173 < 1300 || local173 >= 1400) && (local173 < 2300 || local173 >= 2400)) {
					@Pc(1744) Class53 local1744;
					if (local173 >= 1400 && local173 < 1500 || local173 >= 2400 && local173 < 2500) {
						if (local173 < 2000) {
							local998 = local836 ? Static5.aClass3_Sub1_Sub15_1 : Static18.aClass3_Sub1_Sub15_3;
						} else {
							local24--;
							local998 = Static30.method666(Static119.anIntArray47[local24]);
							local173 -= 1000;
						}
						local20--;
						local1744 = Static32.aClass53Array7[local20];
						@Pc(1751) Object[] local1751 = new Object[local1744.method1294() + 1];
						for (local571 = local1751.length - 1; local571 >= 1; local571--) {
							if (local1744.method1258(local571 - 1) == 115) {
								local20--;
								local1751[local571] = Static32.aClass53Array7[local20];
							} else {
								local24--;
								local1751[local571] = Integer.valueOf(Static119.anIntArray47[local24]);
							}
						}
						local24--;
						local592 = Static119.anIntArray47[local24];
						if (local592 == -1) {
							local1751 = null;
						} else {
							local1751[0] = Integer.valueOf(local592);
						}
						if (local173 == 1416) {
							local998.anObjectArray18 = local1751;
						}
						if (local173 == 1410) {
							local998.anObjectArray13 = local1751;
						}
						if (local173 == 1412) {
							local998.anObjectArray15 = local1751;
						}
						if (local173 == 1408) {
							local998.anObjectArray20 = local1751;
						}
						if (local173 == 1402) {
							local998.anObjectArray4 = local1751;
						}
						if (local173 == 1417) {
							local998.anObjectArray16 = local1751;
						}
						local998.aBoolean117 = true;
						if (local173 == 1406) {
							local998.anObjectArray14 = local1751;
						}
						if (local173 == 1401) {
							local998.anObjectArray3 = local1751;
						}
						if (local173 == 1405) {
							local998.anObjectArray6 = local1751;
						}
						if (local173 == 1414) {
							local998.anObjectArray5 = local1751;
						}
						if (local173 == 1415) {
							local998.anObjectArray17 = local1751;
						}
						if (local173 == 1403) {
							local998.anObjectArray21 = local1751;
						}
						if (local173 == 1411) {
							local998.anObjectArray12 = local1751;
						}
						if (local173 == 1404) {
							local998.anObjectArray10 = local1751;
						}
						if (local173 == 1400) {
							local998.anObjectArray19 = local1751;
						}
						if (local173 == 1409) {
							local998.anObjectArray11 = local1751;
						}
						if (local173 == 1407) {
							local998.anObjectArray9 = local1751;
						}
						if (local173 == 1413) {
							local998.anObjectArray8 = local1751;
						}
						continue;
					}
					if (local173 < 1600) {
						local998 = local836 ? Static5.aClass3_Sub1_Sub15_1 : Static18.aClass3_Sub1_Sub15_3;
						if (local173 == 1500) {
							Static119.anIntArray47[local24++] = local998.anInt2677;
							continue;
						}
						if (local173 == 1501) {
							Static119.anIntArray47[local24++] = local998.anInt2708;
							continue;
						}
						if (local173 == 1502) {
							Static119.anIntArray47[local24++] = local998.anInt2727;
							continue;
						}
						if (local173 == 1503) {
							Static119.anIntArray47[local24++] = local998.anInt2703;
							continue;
						}
						if (local173 == 1504) {
							Static119.anIntArray47[local24++] = local998.aBoolean113 ? 1 : 0;
							continue;
						}
						if (local173 == 1505) {
							Static119.anIntArray47[local24++] = local998.anInt2704;
							continue;
						}
					} else if (local173 < 1700) {
						local998 = local836 ? Static5.aClass3_Sub1_Sub15_1 : Static18.aClass3_Sub1_Sub15_3;
						if (local173 == 1600) {
							Static119.anIntArray47[local24++] = local998.anInt2691;
							continue;
						}
						if (local173 == 1601) {
							Static119.anIntArray47[local24++] = local998.anInt2724;
							continue;
						}
						if (local173 == 1602) {
							Static32.aClass53Array7[local20++] = local998.aClass53_1346;
							continue;
						}
						if (local173 == 1603) {
							Static119.anIntArray47[local24++] = local998.anInt2705;
							continue;
						}
						if (local173 == 1604) {
							Static119.anIntArray47[local24++] = local998.anInt2669;
							continue;
						}
						if (local173 == 1605) {
							Static119.anIntArray47[local24++] = local998.anInt2690;
							continue;
						}
					} else if (local173 < 1800) {
						local998 = local836 ? Static5.aClass3_Sub1_Sub15_1 : Static18.aClass3_Sub1_Sub15_3;
						if (local173 == 1700) {
							Static119.anIntArray47[local24++] = local998.anInt2681;
							continue;
						}
						if (local173 == 1701) {
							if (local998.anInt2681 == -1) {
								Static119.anIntArray47[local24++] = 0;
							} else {
								Static119.anIntArray47[local24++] = local998.anInt2713;
							}
							continue;
						}
						if (local173 == 1702) {
							Static119.anIntArray47[local24++] = local998.anInt2693;
							continue;
						}
					} else if (local173 < 1900) {
						local998 = local836 ? Static5.aClass3_Sub1_Sub15_1 : Static18.aClass3_Sub1_Sub15_3;
						if (local173 == 1800) {
							Static119.anIntArray47[local24++] = Static63.method1114(Static50.method1914(local998));
							continue;
						}
					} else if (local173 < 2600) {
						local24--;
						local998 = Static30.method666(Static119.anIntArray47[local24]);
						if (local173 == 2500) {
							Static119.anIntArray47[local24++] = local998.anInt2677;
							continue;
						}
						if (local173 == 2501) {
							Static119.anIntArray47[local24++] = local998.anInt2708;
							continue;
						}
						if (local173 == 2502) {
							Static119.anIntArray47[local24++] = local998.anInt2727;
							continue;
						}
						if (local173 == 2503) {
							Static119.anIntArray47[local24++] = local998.anInt2703;
							continue;
						}
						if (local173 == 2504) {
							Static119.anIntArray47[local24++] = local998.aBoolean113 ? 1 : 0;
							continue;
						}
						if (local173 == 2505) {
							Static119.anIntArray47[local24++] = local998.anInt2704;
							continue;
						}
					} else if (local173 < 2700) {
						local24--;
						local998 = Static30.method666(Static119.anIntArray47[local24]);
						if (local173 == 2600) {
							Static119.anIntArray47[local24++] = local998.anInt2691;
							continue;
						}
						if (local173 == 2601) {
							Static119.anIntArray47[local24++] = local998.anInt2724;
							continue;
						}
						if (local173 == 2602) {
							Static32.aClass53Array7[local20++] = local998.aClass53_1346;
							continue;
						}
						if (local173 == 2603) {
							Static119.anIntArray47[local24++] = local998.anInt2705;
							continue;
						}
						if (local173 == 2604) {
							Static119.anIntArray47[local24++] = local998.anInt2669;
							continue;
						}
						if (local173 == 2605) {
							Static119.anIntArray47[local24++] = local998.anInt2690;
							continue;
						}
					} else if (local173 < 2800) {
						local24--;
						local998 = Static30.method666(Static119.anIntArray47[local24]);
						if (local173 == 2700) {
							Static119.anIntArray47[local24++] = local998.anInt2681;
							continue;
						}
						if (local173 == 2701) {
							if (local998.anInt2681 == -1) {
								Static119.anIntArray47[local24++] = 0;
							} else {
								Static119.anIntArray47[local24++] = local998.anInt2713;
							}
							continue;
						}
					} else if (local173 < 2900) {
						local24--;
						local998 = Static30.method666(Static119.anIntArray47[local24]);
						if (local173 == 2800) {
							Static119.anIntArray47[local24++] = Static63.method1114(Static50.method1914(local998));
							continue;
						}
					} else if (local173 < 3200) {
						if (local173 == 3100) {
							local20--;
							local529 = Static32.aClass53Array7[local20];
							Static73.method1234(0, Static5.aClass53_78, local529);
							continue;
						}
						if (local173 == 3101) {
							local24 -= 2;
							Static35.method758(Static119.anIntArray47[local24], Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1, Static119.anIntArray47[local24 + 1]);
							continue;
						}
						if (local173 == 3102) {
							local24--;
							local713 = Static119.anIntArray47[local24];
							if (local713 >= 0 && local713 < Static60.anIntArray194.length && Static60.anIntArray194[local713] != -1) {
								aBoolean18 = true;
								Static22.anInt713 = local713;
								Static36.aBoolean40 = true;
							}
							continue;
						}
						if (local173 == 3103) {
							Static86.method1435();
							continue;
						}
					} else if (local173 < 3300) {
						if (local173 == 3200) {
							local24 -= 3;
							Static124.method1966(Static119.anIntArray47[local24], Static119.anIntArray47[local24 + 1], Static119.anIntArray47[local24 + 2]);
							continue;
						}
						if (local173 == 3201) {
							local24--;
							Static99.method1645(Static119.anIntArray47[local24]);
							continue;
						}
						if (local173 == 3202) {
							local24 -= 2;
							Static29.method663(Static119.anIntArray47[local24 + 1], Static119.anIntArray47[local24]);
							continue;
						}
					} else if (local173 < 3400) {
						if (local173 == 3300) {
							Static119.anIntArray47[local24++] = Static27.anInt843;
							continue;
						}
						if (local173 == 3301) {
							local24 -= 2;
							local713 = Static119.anIntArray47[local24];
							local718 = Static119.anIntArray47[local24 + 1];
							Static119.anIntArray47[local24++] = Static103.method1688(local718, local713);
							continue;
						}
						if (local173 == 3302) {
							local24 -= 2;
							local713 = Static119.anIntArray47[local24];
							local718 = Static119.anIntArray47[local24 + 1];
							Static119.anIntArray47[local24++] = Static87.method1451(local718, local713);
							continue;
						}
						if (local173 == 3303) {
							local24 -= 2;
							local713 = Static119.anIntArray47[local24];
							local718 = Static119.anIntArray47[local24 + 1];
							Static119.anIntArray47[local24++] = Static32.method702(local718, local713);
							continue;
						}
						if (local173 == 3304) {
							local24--;
							local713 = Static119.anIntArray47[local24];
							Static119.anIntArray47[local24++] = Static81.method1419(local713).anInt2415;
							continue;
						}
						if (local173 == 3305) {
							local24--;
							local713 = Static119.anIntArray47[local24];
							Static119.anIntArray47[local24++] = Static97.anIntArray311[local713];
							continue;
						}
						if (local173 == 3306) {
							local24--;
							local713 = Static119.anIntArray47[local24];
							Static119.anIntArray47[local24++] = Static9.anIntArray21[local713];
							continue;
						}
						if (local173 == 3307) {
							local24--;
							local713 = Static119.anIntArray47[local24];
							Static119.anIntArray47[local24++] = Static108.anIntArray329[local713];
							continue;
						}
						if (local173 == 3308) {
							local861 = (Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1427 >> 7) + Static4.anInt145;
							local718 = (Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1424 >> 7) + Static80.anInt2029;
							local713 = Static72.anInt1813;
							Static119.anIntArray47[local24++] = local861 + (local713 << 28) + (local718 << 14);
							continue;
						}
						if (local173 == 3309) {
							local24--;
							local713 = Static119.anIntArray47[local24];
							Static119.anIntArray47[local24++] = local713 >> 14 & 0x3FFF;
							continue;
						}
						if (local173 == 3310) {
							local24--;
							local713 = Static119.anIntArray47[local24];
							Static119.anIntArray47[local24++] = local713 >> 28;
							continue;
						}
						if (local173 == 3311) {
							local24--;
							local713 = Static119.anIntArray47[local24];
							Static119.anIntArray47[local24++] = local713 & 0x3FFF;
							continue;
						}
						if (local173 == 3312) {
							Static119.anIntArray47[local24++] = Static123.aBoolean129 ? 1 : 0;
							continue;
						}
						if (local173 == 3313) {
							local24 -= 2;
							local713 = Static119.anIntArray47[local24] + 32768;
							local718 = Static119.anIntArray47[local24 + 1];
							Static119.anIntArray47[local24++] = Static103.method1688(local718, local713);
							continue;
						}
						if (local173 == 3314) {
							local24 -= 2;
							local713 = Static119.anIntArray47[local24] + 32768;
							local718 = Static119.anIntArray47[local24 + 1];
							Static119.anIntArray47[local24++] = Static87.method1451(local718, local713);
							continue;
						}
						if (local173 == 3315) {
							local24 -= 2;
							local713 = Static119.anIntArray47[local24] + 32768;
							local718 = Static119.anIntArray47[local24 + 1];
							Static119.anIntArray47[local24++] = Static32.method702(local718, local713);
							continue;
						}
					} else if (local173 < 3700) {
						if (local173 == 3600) {
							if (Static44.anInt1256 == 0) {
								Static119.anIntArray47[local24++] = -2;
							} else if (Static44.anInt1256 == 1) {
								Static119.anIntArray47[local24++] = -1;
							} else {
								Static119.anIntArray47[local24++] = Static68.anInt1724;
							}
							continue;
						}
						if (local173 == 3601) {
							local24--;
							local713 = Static119.anIntArray47[local24];
							if (Static44.anInt1256 == 2 && Static68.anInt1724 > local713) {
								Static32.aClass53Array7[local20++] = Static52.aClass53Array11[local713];
								continue;
							}
							Static32.aClass53Array7[local20++] = Static5.aClass53_78;
							continue;
						}
						if (local173 == 3602) {
							local24--;
							local713 = Static119.anIntArray47[local24];
							if (Static44.anInt1256 == 2 && Static68.anInt1724 > local713) {
								Static119.anIntArray47[local24++] = Static120.anIntArray405[local713];
								continue;
							}
							Static119.anIntArray47[local24++] = 0;
							continue;
						}
						if (local173 == 3603) {
							local24--;
							local713 = Static119.anIntArray47[local24];
							if (Static44.anInt1256 == 2 && Static68.anInt1724 > local713) {
								Static119.anIntArray47[local24++] = Static75.anIntArray250[local713];
								continue;
							}
							Static119.anIntArray47[local24++] = 0;
							continue;
						}
						if (local173 == 3604) {
							local24--;
							local718 = Static119.anIntArray47[local24];
							local20--;
							local529 = Static32.aClass53Array7[local20];
							Static5.method118(local718, local529);
							continue;
						}
					} else if (local173 < 4100) {
						if (local173 == 4000) {
							local24 -= 2;
							local718 = Static119.anIntArray47[local24 + 1];
							local713 = Static119.anIntArray47[local24];
							Static119.anIntArray47[local24++] = local718 + local713;
							continue;
						}
						if (local173 == 4001) {
							local24 -= 2;
							local713 = Static119.anIntArray47[local24];
							local718 = Static119.anIntArray47[local24 + 1];
							Static119.anIntArray47[local24++] = local713 - local718;
							continue;
						}
						if (local173 == 4002) {
							local24 -= 2;
							local713 = Static119.anIntArray47[local24];
							local718 = Static119.anIntArray47[local24 + 1];
							Static119.anIntArray47[local24++] = local718 * local713;
							continue;
						}
						if (local173 == 4003) {
							local24 -= 2;
							local713 = Static119.anIntArray47[local24];
							local718 = Static119.anIntArray47[local24 + 1];
							Static119.anIntArray47[local24++] = local713 / local718;
							continue;
						}
						if (local173 == 4004) {
							local24--;
							local713 = Static119.anIntArray47[local24];
							Static119.anIntArray47[local24++] = (int) (Math.random() * (double) local713);
							continue;
						}
						if (local173 == 4005) {
							local24--;
							local713 = Static119.anIntArray47[local24];
							Static119.anIntArray47[local24++] = (int) (Math.random() * (double) (local713 + 1));
							continue;
						}
						if (local173 == 4006) {
							local24 -= 5;
							local713 = Static119.anIntArray47[local24];
							local718 = Static119.anIntArray47[local24 + 1];
							local861 = Static119.anIntArray47[local24 + 2];
							local571 = Static119.anIntArray47[local24 + 3];
							local592 = Static119.anIntArray47[local24 + 4];
							Static119.anIntArray47[local24++] = local713 + (local592 - local861) * (local718 - local713) / (local571 - local861);
							continue;
						}
						if (local173 == 4007) {
							local24 -= 2;
							local713 = Static119.anIntArray47[local24];
							local718 = Static119.anIntArray47[local24 + 1];
							Static119.anIntArray47[local24++] = local713 * local718 / 100 + local713;
							continue;
						}
						if (local173 == 4008) {
							local24 -= 2;
							local718 = Static119.anIntArray47[local24 + 1];
							local713 = Static119.anIntArray47[local24];
							Static119.anIntArray47[local24++] = 0x1 << local718 | local713;
							continue;
						}
						if (local173 == 4009) {
							local24 -= 2;
							local718 = Static119.anIntArray47[local24 + 1];
							local713 = Static119.anIntArray47[local24];
							Static119.anIntArray47[local24++] = local713 & -(0x1 << local718) - 1;
							continue;
						}
						if (local173 == 4010) {
							local24 -= 2;
							local713 = Static119.anIntArray47[local24];
							local718 = Static119.anIntArray47[local24 + 1];
							Static119.anIntArray47[local24++] = (0x1 << local718 & local713) == 0 ? 0 : 1;
							continue;
						}
						if (local173 == 4011) {
							local24 -= 2;
							local713 = Static119.anIntArray47[local24];
							local718 = Static119.anIntArray47[local24 + 1];
							Static119.anIntArray47[local24++] = local713 % local718;
							continue;
						}
						if (local173 == 4012) {
							local24 -= 2;
							local718 = Static119.anIntArray47[local24 + 1];
							local713 = Static119.anIntArray47[local24];
							if (local713 == 0) {
								Static119.anIntArray47[local24++] = 0;
							} else {
								Static119.anIntArray47[local24++] = (int) Math.pow((double) local713, (double) local718);
							}
							continue;
						}
						if (local173 == 4013) {
							local24 -= 2;
							local713 = Static119.anIntArray47[local24];
							local718 = Static119.anIntArray47[local24 + 1];
							if (local713 == 0) {
								Static119.anIntArray47[local24++] = 0;
							} else if (local718 == 0) {
								Static119.anIntArray47[local24++] = Integer.MAX_VALUE;
							} else {
								Static119.anIntArray47[local24++] = (int) Math.pow((double) local713, 1.0D / (double) local718);
							}
							continue;
						}
						if (local173 == 4014) {
							local24 -= 2;
							local713 = Static119.anIntArray47[local24];
							local718 = Static119.anIntArray47[local24 + 1];
							Static119.anIntArray47[local24++] = local718 & local713;
							continue;
						}
						if (local173 == 4015) {
							local24 -= 2;
							local713 = Static119.anIntArray47[local24];
							local718 = Static119.anIntArray47[local24 + 1];
							Static119.anIntArray47[local24++] = local718 | local713;
							continue;
						}
					} else if (local173 < 4200) {
						if (local173 == 4100) {
							local20--;
							local529 = Static32.aClass53Array7[local20];
							local24--;
							local718 = Static119.anIntArray47[local24];
							Static32.aClass53Array7[local20++] = Static103.method1689(new Class53[] { local529, Static108.method1725(local718) });
							continue;
						}
						if (local173 == 4101) {
							local20 -= 2;
							local1744 = Static32.aClass53Array7[local20 + 1];
							local529 = Static32.aClass53Array7[local20];
							Static32.aClass53Array7[local20++] = Static103.method1689(new Class53[] { local529, local1744 });
							continue;
						}
						if (local173 == 4102) {
							local24--;
							local718 = Static119.anIntArray47[local24];
							local20--;
							local529 = Static32.aClass53Array7[local20];
							Static32.aClass53Array7[local20++] = Static103.method1689(new Class53[] { local529, Static46.method1965(local718) });
							continue;
						}
						if (local173 == 4103) {
							local20--;
							local529 = Static32.aClass53Array7[local20];
							Static32.aClass53Array7[local20++] = local529.method1269();
							continue;
						}
						if (local173 == 4104) {
							local24--;
							local713 = Static119.anIntArray47[local24];
							@Pc(3625) long local3625 = (long) local713 * 86400000L + 1014768000000L;
							Static78.aCalendar1.setTime(new Date(local3625));
							local571 = Static78.aCalendar1.get(5);
							local592 = Static78.aCalendar1.get(2);
							local905 = Static78.aCalendar1.get(1);
							Static32.aClass53Array7[local20++] = Static103.method1689(new Class53[] { Static108.method1725(local571), Static86.aClass53_982, Static23.aClass53Array6[local592], Static86.aClass53_982, Static108.method1725(local905) });
							continue;
						}
						if (local173 == 4105) {
							local20 -= 2;
							local1744 = Static32.aClass53Array7[local20 + 1];
							local529 = Static32.aClass53Array7[local20];
							if (Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.aClass34_1 != null && Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.aClass34_1.aBoolean45) {
								Static32.aClass53Array7[local20++] = local1744;
								continue;
							}
							Static32.aClass53Array7[local20++] = local529;
							continue;
						}
						if (local173 == 4106) {
							local24--;
							local713 = Static119.anIntArray47[local24];
							Static32.aClass53Array7[local20++] = Static108.method1725(local713);
							continue;
						}
						if (local173 == 4107) {
							local20 -= 2;
							Static119.anIntArray47[local24++] = Static32.aClass53Array7[local20].method1285(Static32.aClass53Array7[local20 + 1]);
							continue;
						}
						@Pc(3784) byte[] local3784;
						@Pc(3789) Class3_Sub1_Sub5_Sub2 local3789;
						if (local173 == 4108) {
							local24 -= 2;
							local20--;
							local529 = Static32.aClass53Array7[local20];
							local861 = Static119.anIntArray47[local24 + 1];
							local718 = Static119.anIntArray47[local24];
							local3784 = Static45.aClass62_Sub1_8.method1512(local861, 0);
							local3789 = new Class3_Sub1_Sub5_Sub2(local3784);
							Static119.anIntArray47[local24++] = local3789.method736(local529, local718);
							continue;
						}
						if (local173 == 4109) {
							local24 -= 2;
							local861 = Static119.anIntArray47[local24 + 1];
							local20--;
							local529 = Static32.aClass53Array7[local20];
							local718 = Static119.anIntArray47[local24];
							local3784 = Static45.aClass62_Sub1_8.method1512(local861, 0);
							local3789 = new Class3_Sub1_Sub5_Sub2(local3784);
							Static119.anIntArray47[local24++] = local3789.method750(local529, local718);
							continue;
						}
						if (local173 == 4110) {
							local20 -= 2;
							local529 = Static32.aClass53Array7[local20];
							local1744 = Static32.aClass53Array7[local20 + 1];
							local24--;
							if (Static119.anIntArray47[local24] == 1) {
								Static32.aClass53Array7[local20++] = local529;
							} else {
								Static32.aClass53Array7[local20++] = local1744;
							}
							continue;
						}
					} else if (local173 < 4300) {
						if (local173 == 4200) {
							local24--;
							local713 = Static119.anIntArray47[local24];
							Static32.aClass53Array7[local20++] = Static2.method38(local713).aClass53_706;
							continue;
						}
						@Pc(3261) Class3_Sub1_Sub8 local3261;
						if (local173 == 4201) {
							local24 -= 2;
							local713 = Static119.anIntArray47[local24];
							local718 = Static119.anIntArray47[local24 + 1];
							local3261 = Static2.method38(local713);
							if (local718 >= 1 && local718 <= 5 && local3261.aClass53Array14[local718 - 1] != null) {
								Static32.aClass53Array7[local20++] = local3261.aClass53Array14[local718 - 1];
								continue;
							}
							Static32.aClass53Array7[local20++] = Static5.aClass53_78;
							continue;
						}
						if (local173 == 4202) {
							local24 -= 2;
							local713 = Static119.anIntArray47[local24];
							local718 = Static119.anIntArray47[local24 + 1];
							local3261 = Static2.method38(local713);
							if (local718 >= 1 && local718 <= 5 && local3261.aClass53Array13[local718 - 1] != null) {
								Static32.aClass53Array7[local20++] = local3261.aClass53Array13[local718 - 1];
								continue;
							}
							Static32.aClass53Array7[local20++] = Static5.aClass53_78;
							continue;
						}
						if (local173 == 4203) {
							local24--;
							local713 = Static119.anIntArray47[local24];
							Static119.anIntArray47[local24++] = Static2.method38(local713).anInt1606;
							continue;
						}
						if (local173 == 4204) {
							local24--;
							local713 = Static119.anIntArray47[local24];
							Static119.anIntArray47[local24++] = Static2.method38(local713).anInt1587 == 1 ? 1 : 0;
							continue;
						}
						@Pc(3406) Class3_Sub1_Sub8 local3406;
						if (local173 == 4205) {
							local24--;
							local713 = Static119.anIntArray47[local24];
							local3406 = Static2.method38(local713);
							if (local3406.anInt1608 == -1 && local3406.anInt1584 >= 0) {
								Static119.anIntArray47[local24++] = local3406.anInt1584;
								continue;
							}
							Static119.anIntArray47[local24++] = local713;
							continue;
						}
						if (local173 == 4206) {
							local24--;
							local713 = Static119.anIntArray47[local24];
							local3406 = Static2.method38(local713);
							if (local3406.anInt1608 >= 0 && local3406.anInt1584 >= 0) {
								Static119.anIntArray47[local24++] = local3406.anInt1584;
								continue;
							}
							Static119.anIntArray47[local24++] = local713;
							continue;
						}
						if (local173 == 4207) {
							local24--;
							local713 = Static119.anIntArray47[local24];
							Static119.anIntArray47[local24++] = Static2.method38(local713).aBoolean57 ? 1 : 0;
							continue;
						}
					}
				} else {
					if (local173 >= 2000) {
						local173 -= 1000;
						local24--;
						local998 = Static30.method666(Static119.anIntArray47[local24]);
					} else {
						local998 = local836 ? Static5.aClass3_Sub1_Sub15_1 : Static18.aClass3_Sub1_Sub15_3;
					}
					if (local173 == 1300) {
						local24--;
						local718 = Static119.anIntArray47[local24] - 1;
						if (local718 >= 0 && local718 <= 9) {
							local20--;
							local998.method1856(Static32.aClass53Array7[local20], local718);
							continue;
						}
						local20--;
						continue;
					}
					if (local173 == 1301) {
						local24 -= 2;
						local718 = Static119.anIntArray47[local24];
						local861 = Static119.anIntArray47[local24 + 1];
						local998.aClass3_Sub1_Sub15_5 = Static38.method782(local861, local718);
						continue;
					}
					if (local173 == 1302) {
						local24--;
						local998.aBoolean111 = Static119.anIntArray47[local24] == 1;
						continue;
					}
					if (local173 == 1303) {
						local24--;
						local998.anInt2684 = Static119.anIntArray47[local24];
						continue;
					}
					if (local173 == 1304) {
						local24--;
						local998.anInt2718 = Static119.anIntArray47[local24];
						continue;
					}
					if (local173 == 1305) {
						local20--;
						local998.aClass53_1353 = Static32.aClass53Array7[local20];
						continue;
					}
					if (local173 == 1306) {
						local20--;
						local998.aClass53_1356 = Static32.aClass53Array7[local20];
						continue;
					}
				}
				Static10.method172("CS2 - nosuchop:" + local173, null);
				return;
			}
		} catch (@Pc(4412) Exception local4412) {
			Static10.method172("CS2 - scr:" + local15.aLong94 + " op:" + local40, local4412);
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V")
	public static void method191() {
		aShortArray5 = null;
		aClass53_116 = null;
		aClass53_115 = null;
		aClass3_Sub1_Sub5_Sub4Array4 = null;
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(I)V")
	public static void method192() {
		for (@Pc(7) int local7 = 0; local7 < Static107.anInt2462; local7++) {
			@Pc(13) int local13 = Static5.anIntArray19[local7];
			@Pc(17) Class3_Sub1_Sub4_Sub1_Sub2 local17 = Static10.aClass3_Sub1_Sub4_Sub1_Sub2Array1[local13];
			@Pc(21) int local21 = Static62.aClass3_Sub7_Sub1_2.method647();
			if ((local21 & 0x2) != 0) {
				local21 += Static62.aClass3_Sub7_Sub1_2.method647() << 8;
			}
			Static52.method954(local13, local21, local17);
		}
	}

	@OriginalMember(owner = "client!c", name = "f", descriptor = "(I)V")
	public static void method194() {
		Static95.aClass75_62.method1724();
	}

	@OriginalMember(owner = "client!c", name = "g", descriptor = "(I)V")
	public static void method195() {
		if (Static119.anInt444 != 0 && Static119.anInt444 != 3 || Static73.anInt1832 != 1) {
			return;
		}
		@Pc(18) int local18 = Static56.anInt1504 - 575;
		@Pc(22) int local22 = Static54.anInt2854 - 9;
		if (local18 < 0 || local22 < 0 || local18 >= 146 || local22 >= 151) {
			return;
		}
		local18 -= 73;
		local22 -= 75;
		@Pc(45) int local45 = Static50.anInt2790 + Static87.anInt2099 & 0x7FF;
		@Pc(49) int local49 = Class3_Sub1_Sub5_Sub1.anIntArray86[local45];
		@Pc(53) int local53 = Class3_Sub1_Sub5_Sub1.anIntArray84[local45];
		@Pc(61) int local61 = (Static7.anInt197 + 256) * local49 >> 8;
		@Pc(69) int local69 = (Static7.anInt197 + 256) * local53 >> 8;
		@Pc(80) int local80 = local61 * local22 + local18 * local69 >> 11;
		@Pc(87) int local87 = local80 + Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1424 >> 7;
		@Pc(98) int local98 = local69 * local22 - local61 * local18 >> 11;
		@Pc(105) int local105 = Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1427 - local98 >> 7;
		@Pc(125) boolean local125 = Static16.method242(local105, 0, 0, true, 1, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray185[0], local87, 0, 0, 0, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray181[0]);
		if (!local125) {
			return;
		}
		Static115.aClass3_Sub7_Sub1_3.method625(local18);
		Static115.aClass3_Sub7_Sub1_3.method625(local22);
		Static115.aClass3_Sub7_Sub1_3.method622(Static87.anInt2099);
		Static115.aClass3_Sub7_Sub1_3.method625(57);
		Static115.aClass3_Sub7_Sub1_3.method625(Static50.anInt2790);
		Static115.aClass3_Sub7_Sub1_3.method625(Static7.anInt197);
		Static115.aClass3_Sub7_Sub1_3.method625(89);
		Static115.aClass3_Sub7_Sub1_3.method622(Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1424);
		Static115.aClass3_Sub7_Sub1_3.method622(Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1427);
		Static115.aClass3_Sub7_Sub1_3.method625(Static22.anInt716);
		Static115.aClass3_Sub7_Sub1_3.method625(63);
		return;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)Lclient!be;")
	public static Class3_Sub1_Sub2 method200(@OriginalArg(0) int arg0) {
		@Pc(6) Class3_Sub1_Sub2 local6 = (Class3_Sub1_Sub2) Static66.aClass75_45.method1728((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static107.aClass62_24.method1512(6, arg0);
		local6 = new Class3_Sub1_Sub2();
		local6.anInt295 = arg0;
		if (local20 != null) {
			local6.method163(new Class3_Sub7(local20));
		}
		local6.method173();
		if (local6.aBoolean15) {
			local6.aBoolean10 = false;
			local6.aBoolean17 = false;
		}
		Static66.aClass75_45.method1730(local6, (long) arg0);
		return local6;
	}
}
