import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!qe", name = "yb", descriptor = "Lclient!ba;")
	public static Class11 aClass11_14;

	@OriginalMember(owner = "client!qe", name = "Bb", descriptor = "I")
	public static int anInt3182;

	@OriginalMember(owner = "client!qe", name = "Ib", descriptor = "I")
	public static int anInt3185;

	@OriginalMember(owner = "client!qe", name = "xb", descriptor = "Lclient!wd;")
	public static final Class97 aClass97_18 = new Class97(4096);

	@OriginalMember(owner = "client!qe", name = "Lb", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1518 = Static187.method3089("Started 3d library");

	@OriginalMember(owner = "client!qe", name = "zb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1510 = aClass92_1518;

	@OriginalMember(owner = "client!qe", name = "Ab", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1511 = Static187.method3089("headicons_prayer");

	@OriginalMember(owner = "client!qe", name = "Cb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1512 = Static187.method3089(":duelstake:");

	@OriginalMember(owner = "client!qe", name = "Db", descriptor = "I")
	public static int anInt3183 = 0;

	@OriginalMember(owner = "client!qe", name = "Eb", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1513 = Static187.method3089("red:");

	@OriginalMember(owner = "client!qe", name = "Fb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1514 = Static187.method3089("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!qe", name = "Mb", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1519 = Static187.method3089("This world is running a closed Beta)3");

	@OriginalMember(owner = "client!qe", name = "Hb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1515 = aClass92_1519;

	@OriginalMember(owner = "client!qe", name = "Ob", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1521 = Static187.method3089("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!qe", name = "Jb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1516 = aClass92_1521;

	@OriginalMember(owner = "client!qe", name = "Kb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1517 = aClass92_1513;

	@OriginalMember(owner = "client!qe", name = "Qb", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1523 = Static187.method3089(" from your ignore list first)3");

	@OriginalMember(owner = "client!qe", name = "Nb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1520 = aClass92_1523;

	@OriginalMember(owner = "client!qe", name = "Pb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1522 = aClass92_1513;

	@OriginalMember(owner = "client!qe", name = "Rb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1524 = Static187.method3089("details)3dat");

	@OriginalMember(owner = "client!qe", name = "Sb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1525 = Static187.method3089("Passwort: ");

	@OriginalMember(owner = "client!qe", name = "Tb", descriptor = "I")
	public static int anInt3186 = 0;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIILclient!ag;III)V")
	public static void method2348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class7 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(1) long local1 = 0L;
		if (arg2 == 0) {
			local1 = Static133.method1972(arg4, arg5, arg0);
		}
		if (arg2 == 1) {
			local1 = Static49.method871(arg4, arg5, arg0);
		}
		if (arg2 == 2) {
			local1 = Static175.method2876(arg4, arg5, arg0);
		}
		if (arg2 == 3) {
			local1 = Static85.method1283(arg4, arg5, arg0);
		}
		if (local1 == 0L) {
			return;
		}
		@Pc(60) int local60 = Integer.MAX_VALUE & (int) (local1 >>> 32);
		@Pc(67) int local67 = (int) local1 >> 20 & 0x3;
		@Pc(71) Class1_Sub3_Sub5 local71 = Static154.method2362(local60);
		@Pc(78) int local78 = (int) local1 >> 14 & 0x1F;
		if (arg2 == 0) {
			Static77.method1169(arg4, arg5, arg0);
			if (local71.anInt1420 != 0) {
				arg3.method134(local71.aBoolean87, arg5, local67, arg0, local78);
			}
		}
		if (arg2 == 1) {
			Static9.method2347(arg4, arg5, arg0);
		}
		if (arg2 == 2) {
			Static84.method1275(arg4, arg5, arg0);
			if (local71.anInt1420 != 0 && arg5 + local71.anInt1399 < 104 && local71.anInt1399 + arg0 < 104 && arg5 + local71.anInt1408 < 104 && local71.anInt1408 + arg0 < 104) {
				arg3.method126(local71.anInt1399, local67, local71.anInt1408, arg5, arg0, local71.aBoolean87);
			}
		}
		if (arg2 == 3) {
			Static15.method259(arg4, arg5, arg0);
			if (local71.anInt1420 == 1) {
				arg3.method137(arg5, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "j", descriptor = "(I)V")
	public static void method2349() {
		try {
			if (Static72.anInt1619 == 0) {
				if (Static27.aClass57_1 != null) {
					Static27.aClass57_1.method1672();
					Static27.aClass57_1 = null;
				}
				Static72.anInt1619 = 1;
				Static1.anInt56 = 0;
				Static38.aBoolean68 = false;
				Static107.aClass65_5 = null;
			}
			if (Static72.anInt1619 == 1) {
				if (Static107.aClass65_5 == null) {
					Static107.aClass65_5 = Static169.aClass24_4.method555(Static23.anInt561, Static109.aString5);
				}
				if (Static107.aClass65_5.anInt2681 == 2) {
					throw new IOException();
				}
				if (Static107.aClass65_5.anInt2681 == 1) {
					Static27.aClass57_1 = new Class57((Socket) Static107.aClass65_5.anObject3, Static169.aClass24_4);
					Static72.anInt1619 = 2;
					Static107.aClass65_5 = null;
				}
			}
			if (Static72.anInt1619 == 2) {
				@Pc(75) long local75 = Static59.aLong64 = Static88.aClass92_813.method3217();
				Static38.aClass1_Sub14_Sub1_3.anInt4061 = 0;
				@Pc(85) int local85 = (int) (local75 >> 16 & 0x1FL);
				Static38.aClass1_Sub14_Sub1_3.method3024(14);
				Static38.aClass1_Sub14_Sub1_3.method3024(local85);
				Static27.aClass57_1.method1673(Static38.aClass1_Sub14_Sub1_3.aByteArray49, 2);
				Static18.aClass1_Sub14_Sub1_2.anInt4061 = 0;
				Static72.anInt1619 = 3;
			}
			@Pc(122) int local122;
			if (Static72.anInt1619 == 3) {
				if (Static65.aClass15_2 != null) {
					Static65.aClass15_2.method2613();
				}
				if (Static42.aClass15_3 != null) {
					Static42.aClass15_3.method2613();
				}
				local122 = Static27.aClass57_1.method1668();
				if (Static65.aClass15_2 != null) {
					Static65.aClass15_2.method2613();
				}
				if (Static42.aClass15_3 != null) {
					Static42.aClass15_3.method2613();
				}
				if (local122 != 0) {
					Static45.method809(local122);
					return;
				}
				Static18.aClass1_Sub14_Sub1_2.anInt4061 = 0;
				Static72.anInt1619 = 4;
			}
			if (Static72.anInt1619 == 4) {
				if (Static18.aClass1_Sub14_Sub1_2.anInt4061 < 8) {
					local122 = Static27.aClass57_1.method1674();
					if (8 - Static18.aClass1_Sub14_Sub1_2.anInt4061 < local122) {
						local122 = 8 - Static18.aClass1_Sub14_Sub1_2.anInt4061;
					}
					if (local122 > 0) {
						Static27.aClass57_1.method1671(Static18.aClass1_Sub14_Sub1_2.anInt4061, Static18.aClass1_Sub14_Sub1_2.aByteArray49, local122);
						Static18.aClass1_Sub14_Sub1_2.anInt4061 += local122;
					}
				}
				if (Static18.aClass1_Sub14_Sub1_2.anInt4061 == 8) {
					Static18.aClass1_Sub14_Sub1_2.anInt4061 = 0;
					Static171.aLong196 = Static18.aClass1_Sub14_Sub1_2.method3057();
					Static72.anInt1619 = 5;
				}
			}
			if (Static72.anInt1619 == 5) {
				Static38.aClass1_Sub14_Sub1_3.anInt4061 = 0;
				@Pc(217) int[] local217 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static171.aLong196 >> 32), (int) Static171.aLong196 };
				Static38.aClass1_Sub14_Sub1_3.method3024(10);
				Static38.aClass1_Sub14_Sub1_3.method3032(local217[0]);
				Static38.aClass1_Sub14_Sub1_3.method3032(local217[1]);
				Static38.aClass1_Sub14_Sub1_3.method3032(local217[2]);
				Static38.aClass1_Sub14_Sub1_3.method3032(local217[3]);
				Static38.aClass1_Sub14_Sub1_3.method3016(Static88.aClass92_813.method3217());
				Static38.aClass1_Sub14_Sub1_3.method3018(Static88.aClass92_811);
				Static38.aClass1_Sub14_Sub1_3.method3038(Static168.aBigInteger2, Static85.aBigInteger1);
				Static18.aClass1_Sub14_Sub1_1.anInt4061 = 0;
				if (Static31.anInt748 == 40) {
					Static18.aClass1_Sub14_Sub1_1.method3024(18);
				} else {
					Static18.aClass1_Sub14_Sub1_1.method3024(16);
				}
				Static18.aClass1_Sub14_Sub1_1.method3024(Static38.aClass1_Sub14_Sub1_3.anInt4061 + Static114.method1703(Static124.aClass92_1222) + 129);
				Static18.aClass1_Sub14_Sub1_1.method3032(492);
				Static18.aClass1_Sub14_Sub1_1.method3024(Static111.aBoolean141 ? 1 : 0);
				Static62.method1001(Static18.aClass1_Sub14_Sub1_1);
				Static18.aClass1_Sub14_Sub1_1.method3018(Static124.aClass92_1222);
				Static18.aClass1_Sub14_Sub1_1.method3032(Static70.anInt1590);
				Static18.aClass1_Sub14_Sub1_1.method3032(Static76.aClass3_Sub1_9.anInt4310);
				Static18.aClass1_Sub14_Sub1_1.method3032(Static88.aClass3_Sub1_11.anInt4310);
				Static18.aClass1_Sub14_Sub1_1.method3032(Static107.aClass3_Sub1_16.anInt4310);
				Static18.aClass1_Sub14_Sub1_1.method3032(Static105.aClass3_Sub1_14.anInt4310);
				Static18.aClass1_Sub14_Sub1_1.method3032(Static140.aClass3_Sub1_20.anInt4310);
				Static18.aClass1_Sub14_Sub1_1.method3032(Static99.aClass3_Sub1_24.anInt4310);
				Static18.aClass1_Sub14_Sub1_1.method3032(Static166.aClass3_Sub1_23.anInt4310);
				Static18.aClass1_Sub14_Sub1_1.method3032(Static106.aClass3_Sub1_15.anInt4310);
				Static18.aClass1_Sub14_Sub1_1.method3032(Static71.aClass3_Sub1_8.anInt4310);
				Static18.aClass1_Sub14_Sub1_1.method3032(Static119.aClass3_Sub1_19.anInt4310);
				Static18.aClass1_Sub14_Sub1_1.method3032(Static109.aClass3_Sub1_17.anInt4310);
				Static18.aClass1_Sub14_Sub1_1.method3032(Static79.aClass3_Sub1_10.anInt4310);
				Static18.aClass1_Sub14_Sub1_1.method3032(Static39.aClass3_Sub1_5.anInt4310);
				Static18.aClass1_Sub14_Sub1_1.method3032(Static7.aClass3_Sub1_3.anInt4310);
				Static18.aClass1_Sub14_Sub1_1.method3032(Static119.aClass3_Sub1_18.anInt4310);
				Static18.aClass1_Sub14_Sub1_1.method3032(Static207.aClass3_Sub1_28.anInt4310);
				Static18.aClass1_Sub14_Sub1_1.method3032(Static146.aClass3_Sub1_21.anInt4310);
				Static18.aClass1_Sub14_Sub1_1.method3032(Static104.aClass3_Sub1_13.anInt4310);
				Static18.aClass1_Sub14_Sub1_1.method3032(Static3.aClass3_Sub1_27.anInt4310);
				Static18.aClass1_Sub14_Sub1_1.method3032(Static189.aClass3_Sub1_26.anInt4310);
				Static18.aClass1_Sub14_Sub1_1.method3032(Static36.aClass3_Sub1_4.anInt4310);
				Static18.aClass1_Sub14_Sub1_1.method3032(Static66.aClass3_Sub1_7.anInt4310);
				Static18.aClass1_Sub14_Sub1_1.method3032(Static49.aClass3_Sub1_6.anInt4310);
				Static18.aClass1_Sub14_Sub1_1.method3032(Static5.aClass3_Sub1_2.anInt4310);
				Static18.aClass1_Sub14_Sub1_1.method3037(Static38.aClass1_Sub14_Sub1_3.aByteArray49, Static38.aClass1_Sub14_Sub1_3.anInt4061);
				Static27.aClass57_1.method1673(Static18.aClass1_Sub14_Sub1_1.aByteArray49, Static18.aClass1_Sub14_Sub1_1.anInt4061);
				Static38.aClass1_Sub14_Sub1_3.method3073(local217);
				for (@Pc(496) int local496 = 0; local496 < 4; local496++) {
					local217[local496] += 50;
				}
				Static18.aClass1_Sub14_Sub1_2.method3073(local217);
				Static72.anInt1619 = 6;
			}
			if (Static72.anInt1619 == 6 && Static27.aClass57_1.method1674() > 0) {
				local122 = Static27.aClass57_1.method1668();
				if (local122 == 21 && Static31.anInt748 == 20) {
					Static72.anInt1619 = 7;
				} else if (local122 == 2) {
					Static72.anInt1619 = 9;
				} else if (local122 == 15 && Static31.anInt748 == 40) {
					Static147.method2195();
					return;
				} else if (local122 == 23 && Static97.anInt2039 < 1) {
					Static72.anInt1619 = 0;
					Static97.anInt2039++;
				} else {
					Static45.method809(local122);
					return;
				}
			}
			if (Static72.anInt1619 == 7 && Static27.aClass57_1.method1674() > 0) {
				Static98.anInt2072 = (Static27.aClass57_1.method1668() + 3) * 60;
				Static72.anInt1619 = 8;
			}
			if (Static72.anInt1619 == 8) {
				Static1.anInt56 = 0;
				Static1.method45(Static61.aClass92_600, Static62.aClass92_603, Static208.method787(new Class92[] { Static49.method872(Static98.anInt2072 / 60), Static180.aClass92_2052 }));
				if (--Static98.anInt2072 <= 0) {
					Static72.anInt1619 = 0;
				}
			} else {
				if (Static72.anInt1619 == 9 && Static27.aClass57_1.method1674() >= 9) {
					Static4.anInt101 = Static27.aClass57_1.method1668();
					Static103.anInt2230 = Static27.aClass57_1.method1668();
					Static58.aBoolean95 = Static27.aClass57_1.method1668() == 1;
					Static32.anInt769 = Static27.aClass57_1.method1668();
					Static32.anInt769 <<= 0x8;
					Static32.anInt769 += Static27.aClass57_1.method1668();
					Static95.anInt2004 = Static27.aClass57_1.method1668();
					Static27.aClass57_1.method1671(0, Static18.aClass1_Sub14_Sub1_2.aByteArray49, 1);
					Static18.aClass1_Sub14_Sub1_2.anInt4061 = 0;
					Static177.anInt3812 = Static18.aClass1_Sub14_Sub1_2.method3071();
					Static27.aClass57_1.method1671(0, Static18.aClass1_Sub14_Sub1_2.aByteArray49, 2);
					Static18.aClass1_Sub14_Sub1_2.anInt4061 = 0;
					Static63.anInt3562 = Static18.aClass1_Sub14_Sub1_2.method3023();
					Static72.anInt1619 = 10;
				}
				if (Static72.anInt1619 != 10) {
					Static1.anInt56++;
					if (Static1.anInt56 > 2000) {
						if (Static97.anInt2039 < 1) {
							Static97.anInt2039++;
							Static72.anInt1619 = 0;
							if (Static23.anInt561 == Static160.anInt3336) {
								Static23.anInt561 = Static200.anInt4360;
							} else {
								Static23.anInt561 = Static160.anInt3336;
							}
						} else {
							Static45.method809(-3);
						}
					}
				} else if (Static27.aClass57_1.method1674() >= Static63.anInt3562) {
					Static18.aClass1_Sub14_Sub1_2.anInt4061 = 0;
					Static27.aClass57_1.method1671(0, Static18.aClass1_Sub14_Sub1_2.aByteArray49, Static63.anInt3562);
					Static96.method1388();
					Static183.anInt3928 = -1;
					Static117.method1731(false);
					Static177.anInt3812 = -1;
				}
			}
		} catch (@Pc(793) IOException local793) {
			if (Static97.anInt2039 < 1) {
				Static97.anInt2039++;
				if (Static160.anInt3336 == Static23.anInt561) {
					Static23.anInt561 = Static200.anInt4360;
				} else {
					Static23.anInt561 = Static160.anInt3336;
				}
				Static72.anInt1619 = 0;
			} else {
				Static45.method809(-2);
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIB)I")
	public static int method2351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg0 * 57 + arg1;
		@Pc(20) int local20 = local14 << 13 ^ local14;
		@Pc(34) int local34 = Integer.MAX_VALUE & local20 * (local20 * 15731 * local20 + 789221) + 1376312589;
		return local34 >> 19 & 0xFF;
	}
}
