import java.awt.Graphics;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!ja", name = "Fc", descriptor = "I")
	public static int anInt1331;

	@OriginalMember(owner = "client!ja", name = "Gc", descriptor = "I")
	public static int anInt1332;

	@OriginalMember(owner = "client!ja", name = "Pc", descriptor = "I")
	public static int anInt1339;

	@OriginalMember(owner = "client!ja", name = "Tc", descriptor = "Z")
	public static boolean aBoolean75;

	@OriginalMember(owner = "client!ja", name = "Zc", descriptor = "J")
	public static long aLong37;

	@OriginalMember(owner = "client!ja", name = "Kc", descriptor = "Lclient!v;")
	public static Class62 aClass62_564 = method753("Titelbild geladen)3");

	@OriginalMember(owner = "client!ja", name = "Vc", descriptor = "Lclient!v;")
	private static Class62 aClass62_565 = method753("Enter message to send to ");

	@OriginalMember(owner = "client!ja", name = "ad", descriptor = "I")
	public static int anInt1346 = -1;

	@OriginalMember(owner = "client!ja", name = "ed", descriptor = "Lclient!v;")
	public static Class62 aClass62_566 = method753("blaugr\u001c1n:");

	@OriginalMember(owner = "client!ja", name = "hd", descriptor = "Lclient!v;")
	public static Class62 aClass62_567 = aClass62_565;

	@OriginalMember(owner = "client!ja", name = "id", descriptor = "Lclient!v;")
	public static Class62 aClass62_568 = method753("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!ja", name = "vd", descriptor = "Lclient!v;")
	private static Class62 aClass62_571 = method753("Cancel");

	@OriginalMember(owner = "client!ja", name = "jd", descriptor = "Lclient!v;")
	public static Class62 aClass62_569 = aClass62_571;

	@OriginalMember(owner = "client!ja", name = "td", descriptor = "[[I")
	public static int[][] anIntArrayArray11 = new int[104][104];

	@OriginalMember(owner = "client!ja", name = "k", descriptor = "(I)V")
	public static void method749() {
		try {
			@Pc(6) Graphics local6 = Static44.aCanvas1.getGraphics();
			Static44.aClass9_24.method686(local6, 550, 4);
		} catch (@Pc(14) Exception local14) {
			Static44.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "(B)I")
	public static int method750() {
		return Static59.anInt1621++;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!rd;Lclient!ne;ZI)V")
	public static void method751(@OriginalArg(0) Class42_Sub1 arg0, @OriginalArg(1) Class46 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) byte[] local7 = null;
		@Pc(9) Class24 local9 = Static44.aClass24_37;
		synchronized (Static44.aClass24_37) {
			for (@Pc(16) Class3_Sub11 local16 = (Class3_Sub11) Static44.aClass24_37.method534(); local16 != null; local16 = (Class3_Sub11) Static44.aClass24_37.method525()) {
				if (local16.aLong81 == (long) arg2 && local16.aClass46_4 == arg1 && local16.anInt2177 == 0) {
					local7 = local16.aByteArray19;
					break;
				}
			}
		}
		if (local7 == null) {
			@Pc(68) byte[] local68 = arg1.method1179(arg2);
			arg0.method1524(arg2, local68, true, arg1);
		} else {
			arg0.method1524(arg2, local7, true, arg1);
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZZ)V")
	public static void method752(@OriginalArg(0) boolean arg0) {
		if (Static94.aClass41_4 == null) {
			return;
		}
		try {
			@Pc(16) Class3_Sub8 local16 = new Class3_Sub8(4);
			local16.method1806(arg0 ? 2 : 3);
			local16.method1794(0);
			Static94.aClass41_4.method1033(local16.aByteArray26, 4);
		} catch (@Pc(37) IOException local37) {
			try {
				Static94.aClass41_4.method1025();
			} catch (@Pc(42) Exception local42) {
			}
			Static17.anInt2844++;
			Static94.aClass41_4 = null;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILjava/lang/String;)Lclient!v;")
	public static Class62 method753(@OriginalArg(1) String arg0) {
		@Pc(6) byte[] local6 = arg0.getBytes();
		@Pc(9) int local9 = local6.length;
		@Pc(13) Class62 local13 = new Class62();
		local13.aByteArray25 = new byte[local9];
		@Pc(24) int local24 = 0;
		while (local9 > local24) {
			@Pc(32) int local32 = local6[local24++] & 0xFF;
			if (local32 <= 45 && local32 >= 40) {
				if (local24 >= local9) {
					break;
				}
				@Pc(65) int local65 = local6[local24++] & 0xFF;
				local13.aByteArray25[local13.anInt2649++] = (byte) (local65 + local32 * 43 - 48 - 1720);
			} else {
				local13.aByteArray25[local13.anInt2649++] = (byte) local32;
			}
		}
		local13.method1689();
		return local13.method1695();
	}

	@OriginalMember(owner = "client!ja", name = "l", descriptor = "(I)Z")
	public static boolean method754() {
		return Static55.aClass38_1 != null;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!fe;B)V")
	public static void method755(@OriginalArg(0) Class3_Sub1_Sub6 arg0) {
		@Pc(8) int local8 = arg0.anInt917;
		@Pc(75) int local75;
		if ((local8 < 1 || local8 > 100) && (local8 < 701 || local8 > 800)) {
			if (local8 >= 101 && local8 <= 200 || local8 >= 801 && local8 <= 900) {
				if (local8 <= 800) {
					local8 -= 101;
				} else {
					local8 -= 701;
				}
				local75 = Static24.anInt762;
				if (Static31.anInt984 != 2) {
					local75 = 0;
				}
				if (local75 <= local8) {
					arg0.aClass62_386 = Static41.aClass62_513;
					arg0.anInt921 = 0;
				} else {
					if (Static58.anIntArray167[local8] == 0) {
						arg0.aClass62_386 = Static49.method782(new Class62[] { Static63.aClass62_1079, Static19.aClass62_1285 });
					} else if (Static58.anIntArray167[local8] >= 5000) {
						if (Static89.anInt2414 == Static58.anIntArray167[local8]) {
							arg0.aClass62_386 = Static49.method782(new Class62[] { Static64.aClass62_769, Static99.aClass62_1208, Static99.method1662(Static58.anIntArray167[local8] - 5000) });
						} else {
							arg0.aClass62_386 = Static49.method782(new Class62[] { Static40.aClass62_502, Static99.aClass62_1208, Static99.method1662(Static58.anIntArray167[local8] - 5000) });
						}
					} else if (Static58.anIntArray167[local8] == Static89.anInt2414) {
						arg0.aClass62_386 = Static49.method782(new Class62[] { Static64.aClass62_769, Static12.aClass62_167, Static99.method1662(Static58.anIntArray167[local8]) });
					} else {
						arg0.aClass62_386 = Static49.method782(new Class62[] { Static40.aClass62_502, Static12.aClass62_167, Static99.method1662(Static58.anIntArray167[local8]) });
					}
					arg0.anInt921 = 1;
				}
			} else if (local8 == 203) {
				local75 = Static24.anInt762;
				if (Static31.anInt984 != 2) {
					local75 = 0;
				}
				arg0.anInt927 = local75 * 15 + 20;
				if (arg0.anInt927 <= arg0.anInt934) {
					arg0.anInt927 = arg0.anInt934 + 1;
				}
			} else if (local8 >= 401 && local8 <= 500) {
				local8 -= 401;
				if (local8 == 0 && Static31.anInt984 == 0) {
					arg0.anInt921 = 0;
					arg0.aClass62_386 = Static13.aClass62_175;
				} else if (local8 == 1 && Static31.anInt984 == 0) {
					arg0.aClass62_386 = Static95.aClass62_1153;
					arg0.anInt921 = 0;
				} else {
					local75 = Static20.anInt704;
					if (Static31.anInt984 == 0) {
						local75 = 0;
					}
					if (local8 >= local75) {
						arg0.aClass62_386 = Static41.aClass62_513;
						arg0.anInt921 = 0;
					} else {
						arg0.aClass62_386 = Static19.method1855(Static108.aLongArray35[local8]).method1681();
						arg0.anInt921 = 1;
					}
				}
			} else if (local8 == 503) {
				arg0.anInt927 = Static20.anInt704 * 15 + 20;
				if (arg0.anInt934 >= arg0.anInt927) {
					arg0.anInt927 = arg0.anInt934 + 1;
				}
			} else if (local8 == 327) {
				arg0.anInt911 = 150;
				arg0.anInt891 = (int) (Math.sin((double) Static12.anInt451 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt936 = 0;
				arg0.anInt904 = 5;
			} else if (local8 == 324) {
				if (Static81.anInt2181 == -1) {
					Static81.anInt2181 = arg0.anInt888;
					Static72.anInt1954 = arg0.anInt883;
				}
				if (Static46.aClass53_2.aBoolean121) {
					arg0.anInt888 = Static81.anInt2181;
				} else {
					arg0.anInt888 = Static72.anInt1954;
				}
			} else if (local8 == 325) {
				if (Static81.anInt2181 == -1) {
					Static72.anInt1954 = arg0.anInt883;
					Static81.anInt2181 = arg0.anInt888;
				}
				if (Static46.aClass53_2.aBoolean121) {
					arg0.anInt888 = Static72.anInt1954;
				} else {
					arg0.anInt888 = Static81.anInt2181;
				}
			} else if (local8 == 600) {
				arg0.aClass62_386 = Static49.method782(new Class62[] { Static41.aClass62_514, Static53.aClass62_616 });
			} else if (local8 == 620) {
				if (Static48.anInt1373 < 1) {
					arg0.aClass62_386 = Static41.aClass62_513;
				} else if (Static51.aBoolean139) {
					arg0.aClass62_386 = Static63.aClass62_1071;
					arg0.anInt907 = 16711680;
				} else {
					arg0.aClass62_386 = Static54.aClass62_1239;
					arg0.anInt907 = 16777215;
				}
			}
		} else if (local8 == 1 && Static31.anInt984 == 0) {
			arg0.anInt921 = 0;
			arg0.aClass62_386 = Static91.aClass62_1099;
		} else if (local8 == 1 && Static31.anInt984 == 1) {
			arg0.aClass62_386 = Static96.aClass62_1172;
			arg0.anInt921 = 0;
		} else if (local8 == 2 && Static31.anInt984 != 2) {
			arg0.anInt921 = 0;
			arg0.aClass62_386 = Static95.aClass62_1153;
		} else {
			if (local8 > 700) {
				local8 -= 601;
			} else {
				local8--;
			}
			local75 = Static24.anInt762;
			if (Static31.anInt984 != 2) {
				local75 = 0;
			}
			if (local75 <= local8) {
				arg0.aClass62_386 = Static41.aClass62_513;
				arg0.anInt921 = 0;
			} else {
				arg0.aClass62_386 = Static64.aClass62Array10[local8];
				arg0.anInt921 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!v;IBLclient!v;)V")
	public static void method757(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class62 arg2) {
		if (arg1 == 0 && Static41.anInt1213 != -1) {
			Static79.anInt2109 = 0;
			Static63.aClass62_1076 = arg2;
		}
		if (Static5.anInt200 == -1) {
			Static86.aBoolean137 = true;
		}
		for (@Pc(28) int local28 = 99; local28 > 0; local28--) {
			Static56.anIntArray123[local28] = Static56.anIntArray123[local28 - 1];
			Static7.aClass62Array2[local28] = Static7.aClass62Array2[local28 - 1];
			Static7.aClass62Array1[local28] = Static7.aClass62Array1[local28 - 1];
		}
		Static56.anIntArray123[0] = arg1;
		Static7.aClass62Array2[0] = arg0;
		Static7.aClass62Array1[0] = arg2;
	}

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "(B)V")
	public static void method758() {
		aClass62_565 = null;
		aClass62_564 = null;
		aClass62_567 = null;
		aClass62_568 = null;
		aClass62_571 = null;
		anIntArrayArray11 = null;
		aClass62_566 = null;
		aClass62_569 = null;
	}
}
