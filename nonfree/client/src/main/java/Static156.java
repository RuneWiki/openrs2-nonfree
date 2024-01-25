import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!ip", name = "d", descriptor = "I")
	public static int anInt2793;

	@OriginalMember(owner = "client!ip", name = "n", descriptor = "Lclient!bc;")
	public static Class22 aClass22_5;

	@OriginalMember(owner = "client!ip", name = "u", descriptor = "Lclient!ii;")
	public static Class111 aClass111_6;

	@OriginalMember(owner = "client!ip", name = "e", descriptor = "Lclient!ef;")
	public static final Class68 aClass68_10 = new Class68(0, 4);

	@OriginalMember(owner = "client!ip", name = "o", descriptor = "Z")
	public static boolean aBoolean213 = false;

	@OriginalMember(owner = "client!ip", name = "t", descriptor = "I")
	public static int anInt2803 = -1;

	@OriginalMember(owner = "client!ip", name = "v", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_50 = new Class57("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method2401(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		Static229.method3783(Static19.aClass244_6);
		Static23.aClass3_Sub5_Sub1_1.method2791(Static269.method4260(arg1) + 1);
		Static23.aClass3_Sub5_Sub1_1.method2791(arg0);
		Static23.aClass3_Sub5_Sub1_1.method2768(arg1);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!vr;BIILclient!np;Lclient!qo;ILclient!ii;)V")
	public static void method2402(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class155 arg3, @OriginalArg(5) Class196 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class111 arg6) {
		@Pc(23) int local23 = arg0.anInt6280 - arg1 / 2 - 5;
		@Pc(27) int local27 = arg5 + 2;
		if (arg4.anInt4997 != 0) {
			arg3.method4954(arg6.method2357() * arg2 + arg5 + 1 - local27, local27, arg1 + 10, local23, arg4.anInt4997);
		}
		if (arg4.anInt5010 != 0) {
			arg3.method4885(arg5 + arg6.method2357() * arg2 + 1 - local27, arg4.anInt5010, arg1 + 10, local27, local23);
		}
		@Pc(80) int local80 = arg4.anInt5012;
		if (arg0.aBoolean490 && arg4.anInt5014 != -1) {
			local80 = arg4.anInt5014;
		}
		for (@Pc(92) int local92 = 0; local92 < arg2; local92++) {
			@Pc(98) String local98 = Static84.aStringArray13[local92];
			if (local92 < arg2 - 1) {
				local98 = local98.substring(0, local98.length() - 4);
			}
			arg6.method2360(arg3, local98, arg0.anInt6280, arg5, local80);
			arg5 += arg6.method2357();
		}
	}

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "(B)V")
	public static void method2406() {
		if (Static193.anInt3497 == 0 || Static193.anInt3497 == 5) {
			return;
		}
		try {
			if (++Static142.anInt2709 > 2000) {
				if (Static12.aClass145_2 != null) {
					Static12.aClass145_2.method3136();
					Static12.aClass145_2 = null;
				}
				if (Static281.anInt4933 >= 1) {
					Static158.anInt2849 = -5;
					Static193.anInt3497 = 0;
					return;
				}
				Static281.anInt4933++;
				if (Static303.anInt5267 == Static269.anInt4741) {
					Static269.anInt4741 = Static174.anInt3041;
				} else {
					Static269.anInt4741 = Static303.anInt5267;
				}
				Static142.anInt2709 = 0;
				Static193.anInt3497 = 1;
			}
			if (Static193.anInt3497 == 1) {
				Static89.aClass133_9 = Static61.aClass156_1.method3642(Static200.aString35, Static269.anInt4741);
				Static193.anInt3497 = 2;
			}
			@Pc(114) int local114;
			if (Static193.anInt3497 == 2) {
				if (Static89.aClass133_9.anInt3257 == 2) {
					throw new IOException();
				}
				if (Static89.aClass133_9.anInt3257 != 1) {
					return;
				}
				Static12.aClass145_2 = new Class145((Socket) Static89.aClass133_9.anObject3, Static61.aClass156_1);
				Static89.aClass133_9 = null;
				@Pc(104) long local104 = Static304.aLong124 = Static21.method260(Static27.aString6);
				Static23.aClass3_Sub5_Sub1_1.anInt3121 = 0;
				local114 = (int) (local104 >> 16 & 0x1FL);
				Static23.aClass3_Sub5_Sub1_1.method2791(Static56.aClass76_1.anInt1930);
				Static23.aClass3_Sub5_Sub1_1.method2791(local114);
				Static12.aClass145_2.method3143(2, Static23.aClass3_Sub5_Sub1_1.aByteArray42);
				if (Static25.aClass119_1 != null) {
					Static25.aClass119_1.method4983();
				}
				if (Static275.aClass119_2 != null) {
					Static275.aClass119_2.method4983();
				}
				@Pc(144) int local144 = Static12.aClass145_2.method3137();
				if (Static25.aClass119_1 != null) {
					Static25.aClass119_1.method4983();
				}
				if (Static275.aClass119_2 != null) {
					Static275.aClass119_2.method4983();
				}
				if (local144 != 0) {
					Static158.anInt2849 = local144;
					Static193.anInt3497 = 0;
					Static12.aClass145_2.method3136();
					Static12.aClass145_2 = null;
					return;
				}
				Static193.anInt3497 = 3;
			}
			if (Static193.anInt3497 == 3) {
				if (Static12.aClass145_2.method3139() < 8) {
					return;
				}
				Static12.aClass145_2.method3141(0, Static26.aClass3_Sub5_Sub1_2.aByteArray42, 8);
				Static26.aClass3_Sub5_Sub1_2.anInt3121 = 0;
				Static73.aLong44 = Static26.aClass3_Sub5_Sub1_2.method2741();
				@Pc(203) Class3_Sub5 local203 = new Class3_Sub5(70);
				@Pc(206) int[] local206 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static73.aLong44 >> 32), (int) Static73.aLong44 };
				local203.method2791(10);
				local203.method2782(local206[0]);
				local203.method2782(local206[1]);
				local203.method2782(local206[2]);
				local203.method2782(local206[3]);
				local203.method2760(Static21.method260(Static27.aString6));
				local203.method2768(Static20.aString2);
				local203.method2769(Static102.aBigInteger3, Static318.aBigInteger4);
				Static23.aClass3_Sub5_Sub1_1.anInt3121 = 0;
				if (Static348.anInt4439 == 40) {
					Static23.aClass3_Sub5_Sub1_1.method2791(Static56.aClass76_5.anInt1930);
				} else {
					Static23.aClass3_Sub5_Sub1_1.method2791(Static56.aClass76_3.anInt1930);
				}
				Static23.aClass3_Sub5_Sub1_1.method2749(0);
				local114 = Static23.aClass3_Sub5_Sub1_1.anInt3121;
				Static23.aClass3_Sub5_Sub1_1.method2782(577);
				Static23.aClass3_Sub5_Sub1_1.method2791(Static21.anInt261);
				Static23.aClass3_Sub5_Sub1_1.method2791(Static200.method3135());
				Static23.aClass3_Sub5_Sub1_1.method2749(Static199.anInt3567);
				Static23.aClass3_Sub5_Sub1_1.method2749(Static207.anInt2251);
				Static23.aClass3_Sub5_Sub1_1.method2791(Static164.aClass154_Sub1_1.anInt6058);
				Static68.method1156(Static23.aClass3_Sub5_Sub1_1);
				Static23.aClass3_Sub5_Sub1_1.method2768(Static368.aString57);
				Static23.aClass3_Sub5_Sub1_1.method2782(Static68.anInt1341);
				@Pc(343) Class3_Sub5 local343 = Static164.aClass154_Sub1_1.method5399();
				Static23.aClass3_Sub5_Sub1_1.method2791(local343.anInt3121);
				Static23.aClass3_Sub5_Sub1_1.method2742(local343.aByteArray42, local343.anInt3121);
				Static47.aBoolean45 = true;
				Static23.aClass3_Sub5_Sub1_1.method2749(Static204.anInt4957);
				Static23.aClass3_Sub5_Sub1_1.method2782(Static171.aClass20_43.method240());
				Static23.aClass3_Sub5_Sub1_1.method2782(Static338.aClass20_87.method240());
				Static23.aClass3_Sub5_Sub1_1.method2782(Static32.aClass20_14.method240());
				Static23.aClass3_Sub5_Sub1_1.method2782(Static4.aClass20_1.method240());
				Static23.aClass3_Sub5_Sub1_1.method2782(Static389.aClass20_98.method240());
				Static23.aClass3_Sub5_Sub1_1.method2782(Static179.aClass20_44.method240());
				Static23.aClass3_Sub5_Sub1_1.method2782(Static103.aClass20_26.method240());
				Static23.aClass3_Sub5_Sub1_1.method2782(Static299.aClass20_73.method240());
				Static23.aClass3_Sub5_Sub1_1.method2782(Static77.aClass20_19.method240());
				Static23.aClass3_Sub5_Sub1_1.method2782(Static116.aClass20_34.method240());
				Static23.aClass3_Sub5_Sub1_1.method2782(Static86.aClass20_21.method240());
				Static23.aClass3_Sub5_Sub1_1.method2782(Static352.aClass20_93.method240());
				Static23.aClass3_Sub5_Sub1_1.method2782(Static104.aClass20_28.method240());
				Static23.aClass3_Sub5_Sub1_1.method2782(Static368.aClass20_95.method240());
				Static23.aClass3_Sub5_Sub1_1.method2782(Static246.aClass20_57.method240());
				Static23.aClass3_Sub5_Sub1_1.method2782(Static278.aClass20_63.method240());
				Static23.aClass3_Sub5_Sub1_1.method2782(Static103.aClass20_25.method240());
				Static23.aClass3_Sub5_Sub1_1.method2782(Static289.aClass20_70.method240());
				Static23.aClass3_Sub5_Sub1_1.method2782(Static370.aClass20_96.method240());
				Static23.aClass3_Sub5_Sub1_1.method2782(Static109.aClass20_32.method240());
				Static23.aClass3_Sub5_Sub1_1.method2782(Static198.aClass20_50.method240());
				Static23.aClass3_Sub5_Sub1_1.method2782(Static340.aClass20_88.method240());
				Static23.aClass3_Sub5_Sub1_1.method2782(Static32.aClass20_15.method240());
				Static23.aClass3_Sub5_Sub1_1.method2782(Static270.aClass20_92.method240());
				Static23.aClass3_Sub5_Sub1_1.method2782(Static205.aClass20_8.method240());
				Static23.aClass3_Sub5_Sub1_1.method2782(Static229.aClass20_53.method240());
				Static23.aClass3_Sub5_Sub1_1.method2782(Static188.aClass20_47.method240());
				Static23.aClass3_Sub5_Sub1_1.method2782(Static122.aClass20_35.method240());
				Static23.aClass3_Sub5_Sub1_1.method2782(Static142.aClass20_40.method240());
				Static23.aClass3_Sub5_Sub1_1.method2742(local203.aByteArray42, local203.anInt3121);
				Static23.aClass3_Sub5_Sub1_1.method2783(Static23.aClass3_Sub5_Sub1_1.anInt3121 - local114);
				Static12.aClass145_2.method3143(Static23.aClass3_Sub5_Sub1_1.anInt3121, Static23.aClass3_Sub5_Sub1_1.aByteArray42);
				Static23.aClass3_Sub5_Sub1_1.method851(local206);
				for (@Pc(585) int local585 = 0; local585 < 4; local585++) {
					local206[local585] += 50;
				}
				Static26.aClass3_Sub5_Sub1_2.method851(local206);
				Static193.anInt3497 = 4;
			}
			@Pc(619) int local619;
			if (Static193.anInt3497 == 4) {
				if (Static12.aClass145_2.method3139() < 1) {
					return;
				}
				local619 = Static12.aClass145_2.method3137();
				if (local619 == 21) {
					Static193.anInt3497 = 7;
				} else if (local619 == 29) {
					Static193.anInt3497 = 11;
				} else if (local619 == 1) {
					Static193.anInt3497 = 5;
					Static158.anInt2849 = local619;
					return;
				} else if (local619 == 2) {
					Static193.anInt3497 = 8;
				} else if (local619 == 15) {
					Static203.anInt3616 = -2;
					Static193.anInt3497 = 12;
				} else if (local619 == 23 && Static281.anInt4933 < 1) {
					Static281.anInt4933++;
					Static142.anInt2709 = 0;
					Static193.anInt3497 = 1;
					Static12.aClass145_2.method3136();
					Static12.aClass145_2 = null;
					return;
				} else {
					Static158.anInt2849 = local619;
					Static193.anInt3497 = 0;
					Static12.aClass145_2.method3136();
					Static12.aClass145_2 = null;
					return;
				}
			}
			if (Static193.anInt3497 == 6) {
				Static23.aClass3_Sub5_Sub1_1.anInt3121 = 0;
				Static23.aClass3_Sub5_Sub1_1.method856(Static56.aClass76_4.anInt1930);
				Static12.aClass145_2.method3143(Static23.aClass3_Sub5_Sub1_1.anInt3121, Static23.aClass3_Sub5_Sub1_1.aByteArray42);
				Static193.anInt3497 = 4;
			} else if (Static193.anInt3497 == 7) {
				if (Static12.aClass145_2.method3139() >= 1) {
					Static294.anInt5085 = (Static12.aClass145_2.method3137() + 3) * 60;
					Static193.anInt3497 = 0;
					Static158.anInt2849 = 21;
					Static12.aClass145_2.method3136();
					Static12.aClass145_2 = null;
				}
			} else if (Static193.anInt3497 != 11) {
				if (Static193.anInt3497 == 8) {
					if (Static12.aClass145_2.method3139() < 13) {
						return;
					}
					Static12.aClass145_2.method3141(0, Static26.aClass3_Sub5_Sub1_2.aByteArray42, 13);
					Static26.aClass3_Sub5_Sub1_2.anInt3121 = 0;
					Static315.anInt5429 = Static26.aClass3_Sub5_Sub1_2.method2739();
					Static257.anInt4620 = Static26.aClass3_Sub5_Sub1_2.method2739();
					Static246.aBoolean345 = Static26.aClass3_Sub5_Sub1_2.method2739() == 1;
					Static345.aBoolean446 = Static26.aClass3_Sub5_Sub1_2.method2739() == 1;
					Static282.aBoolean390 = Static26.aClass3_Sub5_Sub1_2.method2739() == 1;
					Static348.aBoolean347 = Static26.aClass3_Sub5_Sub1_2.method2739() == 1;
					Static376.anInt6265 = Static26.aClass3_Sub5_Sub1_2.method2767();
					Static220.aBoolean317 = Static26.aClass3_Sub5_Sub1_2.method2739() == 1;
					Static241.aBoolean330 = Static26.aClass3_Sub5_Sub1_2.method2739() == 1;
					Static97.aClass217_4.method4998(Static241.aBoolean330);
					Static176.aClass78_3.method1643(Static241.aBoolean330);
					Static90.aClass83_2.method1722(Static241.aBoolean330);
					if (Static246.aBoolean345 && !Static282.aBoolean390 || Static220.aBoolean317) {
						try {
							Static398.method1714(Static61.aClass156_1.anApplet1, "zap");
						} catch (@Pc(903) Throwable local903) {
							if (Static1.aBoolean3) {
								try {
									Static61.aClass156_1.anApplet1.getAppletContext().showDocument(new URL(Static61.aClass156_1.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(919) Exception local919) {
								}
							}
						}
					} else {
						try {
							Static398.method1714(Static61.aClass156_1.anApplet1, "unzap");
						} catch (@Pc(929) Throwable local929) {
						}
					}
					if (Static291.aClass171_5 == Static238.aClass171_4) {
						try {
							Static398.method1714(Static61.aClass156_1.anApplet1, "loggedin");
						} catch (@Pc(941) Throwable local941) {
						}
					}
					Static193.anInt3497 = 10;
				}
				if (Static193.anInt3497 == 10) {
					if (Static26.aClass3_Sub5_Sub1_2.method853()) {
						if (Static12.aClass145_2.method3139() < 1) {
							return;
						}
						Static12.aClass145_2.method3141(Static26.aClass3_Sub5_Sub1_2.anInt3121 + 2, Static26.aClass3_Sub5_Sub1_2.aByteArray42, 1);
					}
					Static296.aClass234_104 = Static230.method3808()[Static26.aClass3_Sub5_Sub1_2.method855()];
					Static203.anInt3616 = Static26.aClass3_Sub5_Sub1_2.method2767();
					Static193.anInt3497 = 9;
				}
				if (Static193.anInt3497 == 9) {
					if (Static12.aClass145_2.method3139() >= Static203.anInt3616) {
						Static12.aClass145_2.method3141(0, Static26.aClass3_Sub5_Sub1_2.aByteArray42, Static203.anInt3616);
						Static26.aClass3_Sub5_Sub1_2.anInt3121 = 0;
						Static158.anInt2849 = 2;
						local619 = Static203.anInt3616;
						Static193.anInt3497 = 0;
						Static214.method3328();
						Static316.method4834(Static26.aClass3_Sub5_Sub1_2);
						Static1.anInt10 = -1;
						Static236.method3899(false);
						if (Static26.aClass3_Sub5_Sub1_2.anInt3121 != local619) {
							throw new RuntimeException("lswp pos:" + Static26.aClass3_Sub5_Sub1_2.anInt3121 + " psize:" + local619);
						}
						Static296.aClass234_104 = null;
					}
				} else if (Static193.anInt3497 == 12) {
					if (Static203.anInt3616 == -2) {
						if (Static12.aClass145_2.method3139() < 2) {
							return;
						}
						Static12.aClass145_2.method3141(0, Static26.aClass3_Sub5_Sub1_2.aByteArray42, 2);
						Static26.aClass3_Sub5_Sub1_2.anInt3121 = 0;
						Static203.anInt3616 = Static26.aClass3_Sub5_Sub1_2.method2767();
					}
					if (Static12.aClass145_2.method3139() >= Static203.anInt3616) {
						Static12.aClass145_2.method3141(0, Static26.aClass3_Sub5_Sub1_2.aByteArray42, Static203.anInt3616);
						Static26.aClass3_Sub5_Sub1_2.anInt3121 = 0;
						Static193.anInt3497 = 0;
						local619 = Static203.anInt3616;
						Static158.anInt2849 = 15;
						Static368.method5521();
						Static316.method4834(Static26.aClass3_Sub5_Sub1_2);
						if (Static26.aClass3_Sub5_Sub1_2.anInt3121 != local619) {
							throw new RuntimeException("lswpr pos:" + Static26.aClass3_Sub5_Sub1_2.anInt3121 + " psize:" + local619);
						}
						Static296.aClass234_104 = null;
					}
				}
			} else if (Static12.aClass145_2.method3139() >= 1) {
				Static355.anInt5982 = Static12.aClass145_2.method3137();
				Static158.anInt2849 = 29;
				Static193.anInt3497 = 0;
				Static12.aClass145_2.method3136();
				Static12.aClass145_2 = null;
			}
		} catch (@Pc(1137) IOException local1137) {
			if (Static12.aClass145_2 != null) {
				Static12.aClass145_2.method3136();
				Static12.aClass145_2 = null;
			}
			if (Static281.anInt4933 >= 1) {
				Static158.anInt2849 = -4;
				Static193.anInt3497 = 0;
			} else {
				Static281.anInt4933++;
				Static142.anInt2709 = 0;
				Static193.anInt3497 = 1;
				if (Static303.anInt5267 == Static269.anInt4741) {
					Static269.anInt4741 = Static174.anInt3041;
				} else {
					Static269.anInt4741 = Static303.anInt5267;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!oa;Z)V")
	public static void method2409(@OriginalArg(0) Class28_Sub1_Sub1_Sub2 arg0) {
		@Pc(16) Class3_Sub10 local16 = (Class3_Sub10) Static332.aClass44_32.method942((long) arg0.anInt4373);
		if (local16 == null) {
			Static329.method5022(arg0.anIntArray490[0], 0, arg0, arg0.aByte73, null, arg0.anIntArray491[0], null);
		} else {
			local16.method1310();
		}
	}
}
