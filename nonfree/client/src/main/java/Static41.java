import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!gb", name = "G", descriptor = "Lclient!de;")
	public static Class1_Sub1_Sub4_Sub1 aClass1_Sub1_Sub4_Sub1_53;

	@OriginalMember(owner = "client!gb", name = "I", descriptor = "[I")
	public static int[] anIntArray472;

	@OriginalMember(owner = "client!gb", name = "K", descriptor = "Z")
	public static boolean aBoolean241;

	@OriginalMember(owner = "client!gb", name = "O", descriptor = "I")
	public static int anInt3022;

	@OriginalMember(owner = "client!gb", name = "A", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1506 = Static108.method1915("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!gb", name = "B", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1507 = Static108.method1915("ams");

	@OriginalMember(owner = "client!gb", name = "C", descriptor = "Z")
	public static boolean aBoolean240 = false;

	@OriginalMember(owner = "client!gb", name = "J", descriptor = "I")
	public static final int anInt3018 = 5063219;

	@OriginalMember(owner = "client!gb", name = "Q", descriptor = "I")
	public static int anInt3024 = 0;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
	public static void method2105() {
		aClass39_1506 = null;
		aClass39_1507 = null;
		anIntArray472 = null;
		aClass1_Sub1_Sub4_Sub1_53 = null;
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(II)Lclient!a;")
	public static Class1_Sub1_Sub1 method2106(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static102.aClass1_Sub1_Sub1ArrayArray1[local7] == null || Static102.aClass1_Sub1_Sub1ArrayArray1[local7][local11] == null) {
			@Pc(25) boolean local25 = Static71.method1248(local7);
			if (!local25) {
				return null;
			}
		}
		return Static102.aClass1_Sub1_Sub1ArrayArray1[local7][local11];
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(B)V")
	public static void method2107() {
		Static79.aClass1_Sub18_Sub1_3.method2193();
		@Pc(9) int local9 = Static79.aClass1_Sub18_Sub1_3.method2199(8);
		@Pc(14) int local14;
		if (Static20.anInt731 > local9) {
			for (local14 = local9; local14 < Static20.anInt731; local14++) {
				Static79.anIntArray384[Static53.anInt1465++] = Static51.anIntArray192[local14];
			}
		}
		if (Static20.anInt731 < local9) {
			throw new RuntimeException("gnpov1");
		}
		Static20.anInt731 = 0;
		for (local14 = 0; local14 < local9; local14++) {
			@Pc(60) int local60 = Static51.anIntArray192[local14];
			@Pc(64) Class1_Sub1_Sub2_Sub1_Sub1 local64 = Static114.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local60];
			@Pc(69) int local69 = Static79.aClass1_Sub18_Sub1_3.method2199(1);
			if (local69 == 0) {
				Static51.anIntArray192[Static20.anInt731++] = local60;
				local64.anInt2514 = Static45.anInt1256;
			} else {
				@Pc(92) int local92 = Static79.aClass1_Sub18_Sub1_3.method2199(2);
				if (local92 == 0) {
					Static51.anIntArray192[Static20.anInt731++] = local60;
					local64.anInt2514 = Static45.anInt1256;
					Static117.anIntArray460[Static94.anInt2224++] = local60;
				} else {
					@Pc(139) int local139;
					@Pc(149) int local149;
					if (local92 == 1) {
						Static51.anIntArray192[Static20.anInt731++] = local60;
						local64.anInt2514 = Static45.anInt1256;
						local139 = Static79.aClass1_Sub18_Sub1_3.method2199(3);
						local64.method1799(local139, false);
						local149 = Static79.aClass1_Sub18_Sub1_3.method2199(1);
						if (local149 == 1) {
							Static117.anIntArray460[Static94.anInt2224++] = local60;
						}
					} else if (local92 == 2) {
						Static51.anIntArray192[Static20.anInt731++] = local60;
						local64.anInt2514 = Static45.anInt1256;
						local139 = Static79.aClass1_Sub18_Sub1_3.method2199(3);
						local64.method1799(local139, true);
						local149 = Static79.aClass1_Sub18_Sub1_3.method2199(3);
						local64.method1799(local149, true);
						@Pc(205) int local205 = Static79.aClass1_Sub18_Sub1_3.method2199(1);
						if (local205 == 1) {
							Static117.anIntArray460[Static94.anInt2224++] = local60;
						}
					} else if (local92 == 3) {
						Static79.anIntArray384[Static53.anInt1465++] = local60;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IB)V")
	public static void method2108(@OriginalArg(0) int arg0) {
		if (arg0 == Static1.anInt62) {
			return;
		}
		if (Static1.anInt62 == 0) {
			Static66.method1190();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static18.anInt617 = 0;
			Static92.anInt2169 = 0;
			Static95.anInt2898 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static91.aClass74_4 != null) {
			Static91.aClass74_4.method2047();
			Static91.aClass74_4 = null;
		}
		if (Static1.anInt62 == 25 || Static1.anInt62 == 40) {
			Static116.method1993();
			Static15.method1510();
		}
		if (Static1.anInt62 == 25) {
			Static8.anInt433 = 1;
			Static16.anInt2475 = 1;
			Static108.anInt2757 = 0;
			Static72.anInt1811 = 0;
			Static76.anInt1919 = 0;
		}
		if (arg0 == 35) {
			Static2.method59();
			Static40.method704();
			if (Static52.aClass6_13 == null) {
				Static52.aClass6_13 = Static64.method1143(Static16.aCanvas10, 765, 503);
			}
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static52.aClass6_13 = null;
			Static2.method59();
			Static127.method2200(Static16.aCanvas10, Static9.aClass62_Sub1_73, Static4.aClass62_Sub1_7);
		}
		if (arg0 == 25 || arg0 == 30 || arg0 == 40) {
			Static52.aClass6_13 = null;
			Static40.method704();
			Static43.method766(Static4.aClass62_Sub1_7, Static16.aCanvas10);
		}
		Static119.aBoolean234 = true;
		Static1.anInt62 = arg0;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIII)V")
	public static void method2109(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(9) Class1_Sub6 local9 = (Class1_Sub6) Static120.aClass31_69.method1000(); local9 != null; local9 = (Class1_Sub6) Static120.aClass31_69.method1003()) {
			if (local9.anInt757 != -1 || local9.anIntArray111 != null) {
				@Pc(21) int local21 = 0;
				if (local9.anInt768 < arg2) {
					local21 = arg2 - local9.anInt768;
				} else if (arg2 < local9.anInt760) {
					local21 = local9.anInt760 - arg2;
				}
				if (local9.anInt753 < arg0) {
					local21 += arg0 - local9.anInt753;
				} else if (local9.anInt759 > arg0) {
					local21 += local9.anInt759 - arg0;
				}
				if (local21 - 64 > local9.anInt755 || Static86.anInt2059 == 0 || arg1 != local9.anInt762) {
					if (local9.aClass1_Sub8_Sub1_1 != null) {
						Static19.aClass1_Sub8_Sub3_1.method1634(local9.aClass1_Sub8_Sub1_1);
						local9.aClass1_Sub8_Sub1_1 = null;
					}
					if (local9.aClass1_Sub8_Sub1_2 != null) {
						Static19.aClass1_Sub8_Sub3_1.method1634(local9.aClass1_Sub8_Sub1_2);
						local9.aClass1_Sub8_Sub1_2 = null;
					}
				} else {
					local21 -= 64;
					if (local21 < 0) {
						local21 = 0;
					}
					@Pc(141) int local141 = (local9.anInt755 - local21) * Static86.anInt2059 / local9.anInt755;
					if (local9.aClass1_Sub8_Sub1_1 != null) {
						local9.aClass1_Sub8_Sub1_1.method953(local141);
					} else if (local9.anInt757 >= 0) {
						@Pc(153) Class51 local153 = Static134.method1393(Static103.aClass62_Sub1_66, local9.anInt757, 0);
						if (local153 != null) {
							@Pc(160) Class1_Sub16_Sub1 local160 = local153.method1392().method1564(Static93.aClass24_1);
							@Pc(165) Class1_Sub8_Sub1 local165 = Static131.method948(local160, local141);
							local165.method923(-1);
							Static19.aClass1_Sub8_Sub3_1.method1640(local165);
							local9.aClass1_Sub8_Sub1_1 = local165;
						}
					}
					if (local9.aClass1_Sub8_Sub1_2 != null) {
						local9.aClass1_Sub8_Sub1_2.method953(local141);
						if (!local9.aClass1_Sub8_Sub1_2.method2133()) {
							local9.aClass1_Sub8_Sub1_2 = null;
						}
					} else if (local9.anIntArray111 != null && (local9.anInt769 -= arg3) <= 0) {
						@Pc(205) int local205 = (int) ((double) local9.anIntArray111.length * Math.random());
						@Pc(213) Class51 local213 = Static134.method1393(Static103.aClass62_Sub1_66, local9.anIntArray111[local205], 0);
						if (local213 != null) {
							@Pc(220) Class1_Sub16_Sub1 local220 = local213.method1392().method1564(Static93.aClass24_1);
							@Pc(225) Class1_Sub8_Sub1 local225 = Static131.method948(local220, local141);
							local225.method923(0);
							Static19.aClass1_Sub8_Sub3_1.method1640(local225);
							local9.aClass1_Sub8_Sub1_2 = local225;
							local9.anInt769 = (int) (Math.random() * (double) (local9.anInt758 - local9.anInt752)) + local9.anInt752;
						}
					}
				}
			}
		}
	}
}
