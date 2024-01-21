import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!ia", name = "x", descriptor = "I")
	public static int anInt1398;

	@OriginalMember(owner = "client!ia", name = "D", descriptor = "[Lclient!hd;")
	public static Class1_Sub1_Sub6_Sub1[] aClass1_Sub1_Sub6_Sub1Array3;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "Lclient!ba;")
	public static Class5 aClass5_34 = new Class5(64);

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "[I")
	public static int[] anIntArray164 = new int[2000];

	@OriginalMember(owner = "client!ia", name = "q", descriptor = "Lclient!gd;")
	private static Class23 aClass23_723 = Static15.method178("Username: ");

	@OriginalMember(owner = "client!ia", name = "r", descriptor = "Lclient!gd;")
	public static Class23 aClass23_724 = aClass23_723;

	@OriginalMember(owner = "client!ia", name = "s", descriptor = "Lclient!gd;")
	public static Class23 aClass23_725 = Static15.method178("redstone1");

	@OriginalMember(owner = "client!ia", name = "t", descriptor = "I")
	public static int anInt1396 = 0;

	@OriginalMember(owner = "client!ia", name = "u", descriptor = "Lclient!gd;")
	public static Class23 aClass23_726 = Static15.method178("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!ia", name = "y", descriptor = "Lclient!gd;")
	private static Class23 aClass23_728 = Static15.method178("wishes to duel with you)3");

	@OriginalMember(owner = "client!ia", name = "v", descriptor = "Lclient!gd;")
	public static Class23 aClass23_727 = aClass23_728;

	@OriginalMember(owner = "client!ia", name = "w", descriptor = "I")
	public static int anInt1397 = 0;

	@OriginalMember(owner = "client!ia", name = "z", descriptor = "Lclient!gd;")
	private static Class23 aClass23_729 = Static15.method178("Your profile will be transferred in:");

	@OriginalMember(owner = "client!ia", name = "A", descriptor = "Lclient!gd;")
	private static Class23 aClass23_730 = Static15.method178("Drop");

	@OriginalMember(owner = "client!ia", name = "B", descriptor = "Lclient!gd;")
	public static Class23 aClass23_731 = Static15.method178("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!ia", name = "C", descriptor = "Lclient!gd;")
	public static Class23 aClass23_732 = aClass23_729;

	@OriginalMember(owner = "client!ia", name = "F", descriptor = "Lclient!gd;")
	public static Class23 aClass23_733 = Static15.method178("blaugr-Un:");

	@OriginalMember(owner = "client!ia", name = "G", descriptor = "I")
	public static int anInt1400 = 0;

	@OriginalMember(owner = "client!ia", name = "H", descriptor = "Lclient!gd;")
	public static Class23 aClass23_734 = aClass23_730;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZ)Lclient!gd;")
	public static Class23 method866() {
		@Pc(12) Class23 local12 = new Class23();
		local12.aByteArray4 = new byte[100];
		local12.anInt965 = 0;
		return local12;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
	public static void method867() {
		Static107.method1818();
		if (Static98.anInt2537 != 10) {
			return;
		}
		@Pc(22) int local22 = Static111.anInt2890 - 202;
		@Pc(24) int local24 = Static65.anInt1963;
		@Pc(28) int local28 = Static74.anInt1803 - 171;
		if (Static64.anInt1940 == 0) {
			if (local24 == 1 && local22 >= 25 && local22 <= 175 && local28 >= 100 && local28 <= 140) {
				Static64.anInt1940 = 3;
				Static27.anInt852 = 0;
			}
			if (local24 == 1 && local22 >= 185 && local22 <= 335 && local28 >= 100 && local28 <= 140) {
				Static64.anInt1940 = 2;
				Static27.anInt852 = 0;
				Static76.aClass23_1214 = Static108.aClass23_1641;
				Static76.aClass23_1216 = Static107.aClass23_1592;
				Static76.aClass23_1211 = Static108.aClass23_1659;
				return;
			}
			return;
		}
		if (Static64.anInt1940 == 2) {
			@Pc(124) byte local124 = 60;
			@Pc(125) int local125 = local124 + 30;
			if (local24 == 1 && local28 >= 75 && local28 < 90) {
				Static27.anInt852 = 0;
			}
			local125 += 15;
			if (local24 == 1 && local28 >= 90 && local28 < 105) {
				Static27.anInt852 = 1;
			}
			local125 += 15;
			if (local24 == 1 && local22 >= 25 && local22 <= 175 && local28 >= 130 && local28 <= 170) {
				Static76.aClass23_1212 = Static76.aClass23_1212.method532().method514();
				Static73.method1308(Static64.aClass23_1105, Static108.aClass23_1655, Static108.aClass23_1660);
				Static89.method1524(20);
				return;
			}
			if (local24 == 1 && local22 >= 185 && local22 <= 335 && local28 >= 130 && local28 <= 170) {
				Static76.aClass23_1218 = Static76.aClass23_1213;
				Static64.anInt1940 = 0;
				Static76.aClass23_1212 = Static76.aClass23_1213;
			}
			while (true) {
				@Pc(239) boolean local239;
				label138: do {
					while (Static21.method344()) {
						local239 = false;
						for (@Pc(241) int local241 = 0; local241 < Static94.aClass23_1395.method525(); local241++) {
							if (Static15.anInt324 == Static94.aClass23_1395.method519(local241)) {
								local239 = true;
								break;
							}
						}
						if (Static27.anInt852 != 0) {
							continue label138;
						}
						if (Static115.anInt2953 == 85 && Static76.aClass23_1212.method525() > 0) {
							Static76.aClass23_1212 = Static76.aClass23_1212.method512(0, Static76.aClass23_1212.method525() - 1);
						}
						if (Static115.anInt2953 == 84 || Static115.anInt2953 == 80) {
							Static27.anInt852 = 1;
						}
						if (local239 && Static76.aClass23_1212.method525() < 12) {
							Static76.aClass23_1212 = Static76.aClass23_1212.method545(Static15.anInt324);
						}
					}
					return;
				} while (Static27.anInt852 != 1);
				if (Static115.anInt2953 == 85 && Static76.aClass23_1218.method525() > 0) {
					Static76.aClass23_1218 = Static76.aClass23_1218.method512(0, Static76.aClass23_1218.method525() - 1);
				}
				if (Static115.anInt2953 == 84 || Static115.anInt2953 == 80) {
					Static27.anInt852 = 0;
				}
				if (local239 && Static76.aClass23_1218.method525() < 20) {
					Static76.aClass23_1218 = Static76.aClass23_1218.method545(Static15.anInt324);
				}
			}
		}
		if (Static64.anInt1940 != 3 || local24 != 1 || local22 < 105 || local22 > 255 || local28 < 130 || local28 > 170) {
			return;
		}
		Static64.anInt1940 = 0;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I[IZBI)V")
	public static void method868(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		Static7.aClass34_8.method1138();
		Static100.aClass1_Sub1_Sub6_Sub3_21.method1194(0, 0);
		if (arg2) {
			if (arg1[arg3] != -1) {
				if (arg3 == 0) {
					Static33.aClass1_Sub1_Sub6_Sub3_8.method1194(22, 10);
				}
				if (arg3 == 1) {
					Static69.aClass1_Sub1_Sub6_Sub3_19.method1194(54, 8);
				}
				if (arg3 == 2) {
					Static69.aClass1_Sub1_Sub6_Sub3_19.method1194(82, 8);
				}
				if (arg3 == 3) {
					Static37.aClass1_Sub1_Sub6_Sub3_12.method1194(110, 8);
				}
				if (arg3 == 4) {
					Static33.aClass1_Sub1_Sub6_Sub3_9.method1194(153, 8);
				}
				if (arg3 == 5) {
					Static33.aClass1_Sub1_Sub6_Sub3_9.method1194(181, 8);
				}
				if (arg3 == 6) {
					Static9.aClass1_Sub1_Sub6_Sub3_1.method1194(209, 9);
				}
			}
			if (arg1[0] != -1 && arg0 != 0) {
				Static55.aClass1_Sub1_Sub6_Sub3Array6[0].method1194(29, 13);
			}
			if (arg1[1] != -1 && arg0 != 1) {
				Static55.aClass1_Sub1_Sub6_Sub3Array6[1].method1194(53, 11);
			}
			if (arg1[2] != -1 && arg0 != 2) {
				Static55.aClass1_Sub1_Sub6_Sub3Array6[2].method1194(82, 11);
			}
			if (arg1[3] != -1 && arg0 != 3) {
				Static55.aClass1_Sub1_Sub6_Sub3Array6[3].method1194(115, 12);
			}
			if (arg1[4] != -1 && arg0 != 4) {
				Static55.aClass1_Sub1_Sub6_Sub3Array6[4].method1194(153, 13);
			}
			if (arg1[5] != -1 && arg0 != 5) {
				Static55.aClass1_Sub1_Sub6_Sub3Array6[5].method1194(180, 11);
			}
			if (arg1[6] != -1 && arg0 != 6) {
				Static55.aClass1_Sub1_Sub6_Sub3Array6[6].method1194(208, 13);
			}
		}
		Static75.aClass34_56.method1138();
		Static102.aClass1_Sub1_Sub6_Sub3_22.method1194(0, 0);
		if (arg2) {
			if (arg1[arg3] != -1) {
				if (arg3 == 7) {
					Static108.aClass1_Sub1_Sub6_Sub3_23.method1194(42, 0);
				}
				if (arg3 == 8) {
					Static96.aClass1_Sub1_Sub6_Sub3_17.method1194(74, 0);
				}
				if (arg3 == 9) {
					Static96.aClass1_Sub1_Sub6_Sub3_17.method1194(102, 0);
				}
				if (arg3 == 10) {
					Static49.aClass1_Sub1_Sub6_Sub3_14.method1194(130, 1);
				}
				if (arg3 == 11) {
					Static34.aClass1_Sub1_Sub6_Sub3_10.method1194(173, 0);
				}
				if (arg3 == 12) {
					Static34.aClass1_Sub1_Sub6_Sub3_10.method1194(201, 0);
				}
				if (arg3 == 13) {
					Static41.aClass1_Sub1_Sub6_Sub3_13.method1194(229, 0);
				}
			}
			if (arg1[8] != -1 && arg0 != 8) {
				Static55.aClass1_Sub1_Sub6_Sub3Array6[7].method1194(74, 2);
			}
			if (arg1[9] != -1 && arg0 != 9) {
				Static55.aClass1_Sub1_Sub6_Sub3Array6[8].method1194(102, 3);
			}
			if (arg1[10] != -1 && arg0 != 10) {
				Static55.aClass1_Sub1_Sub6_Sub3Array6[9].method1194(137, 4);
			}
			if (arg1[11] != -1 && arg0 != 11) {
				Static55.aClass1_Sub1_Sub6_Sub3Array6[10].method1194(174, 2);
			}
			if (arg1[12] != -1 && arg0 != 12) {
				Static55.aClass1_Sub1_Sub6_Sub3Array6[11].method1194(201, 2);
			}
			if (arg1[13] != -1 && arg0 != 13) {
				Static55.aClass1_Sub1_Sub6_Sub3Array6[12].method1194(226, 2);
			}
		}
		try {
			@Pc(353) Graphics local353 = Static26.aCanvas1.getGraphics();
			Static7.aClass34_8.method1144(160, local353, 516);
			Static75.aClass34_56.method1144(466, local353, 496);
		} catch (@Pc(367) Exception local367) {
			Static26.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)V")
	public static void method869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static76.aClass1_Sub5_Sub1_2.method731(114);
		Static76.aClass1_Sub5_Sub1_2.method689(arg1);
		Static76.aClass1_Sub5_Sub1_2.method708(arg0);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)Lclient!ve;")
	public static Class1_Sub1_Sub18 method871(@OriginalArg(1) int arg0) {
		@Pc(6) Class1_Sub1_Sub18 local6 = (Class1_Sub1_Sub18) Static9.aClass5_7.method98((long) arg0);
		if (local6 != null) {
			return local6;
		}
		local6 = Static41.method892(Static20.aClass55_12, Static69.aClass55_30, arg0);
		if (local6 != null) {
			Static9.aClass5_7.method97(local6, (long) arg0);
		}
		return local6;
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)V")
	public static void method873() {
		aClass23_732 = null;
		aClass23_727 = null;
		aClass23_734 = null;
		aClass23_724 = null;
		aClass23_730 = null;
		aClass23_726 = null;
		aClass23_725 = null;
		aClass23_729 = null;
		aClass5_34 = null;
		aClass23_728 = null;
		anIntArray164 = null;
		aClass23_731 = null;
		aClass23_723 = null;
		aClass23_733 = null;
		aClass1_Sub1_Sub6_Sub1Array3 = null;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!rb;B)V")
	public static void method874(@OriginalArg(0) Class55 arg0) {
		Static113.aClass55_41 = arg0;
		Static68.anInt391 = Static113.aClass55_41.method1865(16);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IBII)I")
	public static int method875(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 179) {
			arg1 /= 2;
		}
		if (arg2 > 192) {
			arg1 /= 2;
		}
		if (arg2 > 217) {
			arg1 /= 2;
		}
		if (arg2 > 243) {
			arg1 /= 2;
		}
		return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
	}
}
