import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!w", name = "db", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1666 = Static33.method650("Too many connections from your address)3");

	@OriginalMember(owner = "client!w", name = "K", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1658 = aClass56_1666;

	@OriginalMember(owner = "client!w", name = "N", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1659 = Static33.method650("Could not complete login)3");

	@OriginalMember(owner = "client!w", name = "O", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1660 = Static33.method650("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!w", name = "P", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1661 = Static33.method650(":tradereq:");

	@OriginalMember(owner = "client!w", name = "rb", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1670 = Static33.method650("Examine");

	@OriginalMember(owner = "client!w", name = "R", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1662 = aClass56_1670;

	@OriginalMember(owner = "client!w", name = "ab", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1665 = Static33.method650("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!w", name = "W", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1663 = aClass56_1665;

	@OriginalMember(owner = "client!w", name = "Y", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1664 = Static33.method650("@whi@");

	@OriginalMember(owner = "client!w", name = "eb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1667 = aClass56_1659;

	@OriginalMember(owner = "client!w", name = "lb", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1669 = Static33.method650("Close");

	@OriginalMember(owner = "client!w", name = "jb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1668 = aClass56_1669;

	@OriginalMember(owner = "client!w", name = "tb", descriptor = "I")
	public static int anInt3045 = 0;

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V")
	public static void method1971() {
		aClass56_1668 = null;
		aClass56_1661 = null;
		aClass56_1665 = null;
		aClass56_1659 = null;
		aClass56_1663 = null;
		aClass56_1662 = null;
		aClass56_1667 = null;
		aClass56_1664 = null;
		aClass56_1658 = null;
		aClass56_1670 = null;
		aClass56_1660 = null;
		aClass56_1669 = null;
		aClass56_1666 = null;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(B[B)[B")
	public static byte[] method1972(@OriginalArg(1) byte[] arg0) {
		@Pc(14) int local14 = arg0.length;
		@Pc(17) byte[] local17 = new byte[local14];
		Static128.method140(arg0, 0, local17, 0, local14);
		return local17;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(BZLclient!de;)V")
	public static void method1974(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class17 arg1) {
		if (Static64.aClass17_3 != null) {
			try {
				Static64.aClass17_3.method498();
			} catch (@Pc(8) Exception local8) {
			}
			Static64.aClass17_3 = null;
		}
		Static64.aClass17_3 = arg1;
		Static15.method321(arg0);
		Static65.aClass3_Sub2_4 = null;
		Static56.anInt1586 = 0;
		Static51.aClass3_Sub1_Sub14_1 = null;
		Static5.aClass3_Sub2_1.anInt413 = 0;
		while (true) {
			@Pc(33) Class3_Sub1_Sub14 local33 = (Class3_Sub1_Sub14) Static92.aClass2_9.method10();
			if (local33 == null) {
				while (true) {
					local33 = (Class3_Sub1_Sub14) Static87.aClass2_8.method10();
					if (local33 == null) {
						if (Static40.aByte2 != 0) {
							try {
								@Pc(85) Class3_Sub2 local85 = new Class3_Sub2(4);
								local85.method303(4);
								local85.method303(Static40.aByte2);
								local85.method289(0);
								Static64.aClass17_3.method493(local85.aByteArray7, 4);
							} catch (@Pc(106) IOException local106) {
								try {
									Static64.aClass17_3.method498();
								} catch (@Pc(111) Exception local111) {
								}
								Static64.aClass17_3 = null;
								Static31.anInt923++;
							}
						}
						Static46.anInt2268 = 0;
						Static63.aLong47 = Static38.method694();
						return;
					}
					Static5.aClass68_1.method1734(local33);
					Static93.aClass2_10.method12(local33, local33.aLong94);
					Static81.anInt2164++;
					Static22.anInt685--;
				}
			}
			Static109.aClass2_5.method12(local33, local33.aLong94);
			Static50.anInt1438++;
			Static19.anInt591--;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!tb;Ljava/awt/Component;Lclient!tb;I)V")
	public static void method1975(@OriginalArg(0) Class44 arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) Class44 arg2) {
		if (Static106.aBoolean122) {
			return;
		}
		Static50.aClass30_8 = Static11.method235(503, arg1, 765);
		Static50.aClass30_8.method813();
		Static6.method1486();
		@Pc(24) byte[] local24 = arg2.method1131(Static11.aClass56_172, Static66.aClass56_266);
		Static97.aClass3_Sub1_Sub1_Sub2_5 = new Class3_Sub1_Sub1_Sub2(local24, arg1);
		Static19.aClass3_Sub1_Sub1_Sub2_2 = Static97.aClass3_Sub1_Sub1_Sub2_5.method948();
		Static30.aClass3_Sub1_Sub1_Sub4_20 = Static17.method347(Static80.aClass56_1158, arg0, Static66.aClass56_266);
		Static19.aClass3_Sub1_Sub1_Sub4_12 = Static17.method347(Static40.aClass56_616, arg0, Static66.aClass56_266);
		Static23.aClass3_Sub1_Sub1_Sub4_15 = Static17.method347(Static42.aClass56_676, arg0, Static66.aClass56_266);
		Static117.aClass3_Sub1_Sub1_Sub4Array61 = Static124.method1994(arg0, Static66.aClass56_266, Static23.aClass56_344);
		Static44.aClass3_Sub1_Sub1_Sub4Array26 = Static124.method1994(arg0, Static66.aClass56_266, Static105.aClass56_1434);
		Static41.anIntArray75 = new int[256];
		for (@Pc(68) int local68 = 0; local68 < 64; local68++) {
			Static41.anIntArray75[local68] = local68 * 262144;
		}
		for (@Pc(84) int local84 = 0; local84 < 64; local84++) {
			Static41.anIntArray75[local84 + 64] = local84 * 1024 + 16711680;
		}
		for (@Pc(102) int local102 = 0; local102 < 64; local102++) {
			Static41.anIntArray75[local102 + 128] = local102 * 4 + 16776960;
		}
		for (@Pc(123) int local123 = 0; local123 < 64; local123++) {
			Static41.anIntArray75[local123 + 192] = 16777215;
		}
		Static73.anIntArray166 = new int[256];
		for (@Pc(142) int local142 = 0; local142 < 64; local142++) {
			Static73.anIntArray166[local142] = local142 * 1024;
		}
		for (@Pc(156) int local156 = 0; local156 < 64; local156++) {
			Static73.anIntArray166[local156 + 64] = local156 * 4 + 65280;
		}
		for (@Pc(176) int local176 = 0; local176 < 64; local176++) {
			Static73.anIntArray166[local176 + 128] = local176 * 262144 + 65535;
		}
		for (@Pc(195) int local195 = 0; local195 < 64; local195++) {
			Static73.anIntArray166[local195 + 192] = 16777215;
		}
		Static75.anIntArray175 = new int[256];
		for (@Pc(212) int local212 = 0; local212 < 64; local212++) {
			Static75.anIntArray175[local212] = local212 * 4;
		}
		for (@Pc(228) int local228 = 0; local228 < 64; local228++) {
			Static75.anIntArray175[local228 + 64] = local228 * 262144 + 255;
		}
		for (@Pc(247) int local247 = 0; local247 < 64; local247++) {
			Static75.anIntArray175[local247 + 128] = local247 * 1024 + 16711935;
		}
		for (@Pc(267) int local267 = 0; local267 < 64; local267++) {
			Static75.anIntArray175[local267 + 192] = 16777215;
		}
		Static65.anIntArray144 = new int[32768];
		Static118.anIntArray308 = new int[32768];
		Static50.anIntArray98 = new int[256];
		Static71.method1306(null);
		Static97.anInt2545 = 0;
		Static66.aClass56_262 = Static66.aClass56_266;
		Static49.anIntArray102 = new int[32768];
		if (Static24.anInt703 == 0) {
			Static76.aBoolean92 = true;
		} else {
			Static76.aBoolean92 = false;
		}
		Static86.anIntArray196 = new int[32768];
		Static29.aBoolean46 = false;
		Static66.aClass56_271 = Static66.aClass56_266;
		if (Static76.aBoolean92) {
			Static22.method489();
		} else {
			Static106.method1756(Static100.aClass44_Sub1_65, Static30.aClass56_494, Static66.aClass56_266);
		}
		Static15.method321(false);
		Static80.aBoolean98 = true;
		Static106.aBoolean122 = true;
		Static97.aClass3_Sub1_Sub1_Sub2_5.method958(0, 0);
		Static19.aClass3_Sub1_Sub1_Sub2_2.method958(382, 0);
		Static30.aClass3_Sub1_Sub1_Sub4_20.method1504(382 - Static30.aClass3_Sub1_Sub1_Sub4_20.anInt2250 / 2, 18);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIII)I")
	public static int method1976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = arg1 & arg0 - 1;
		@Pc(13) int local13 = arg1 / arg0;
		@Pc(17) int local17 = arg2 / arg0;
		@Pc(23) int local23 = arg2 & arg0 - 1;
		@Pc(28) int local28 = Static16.method340(local13, local17);
		@Pc(39) int local39 = Static16.method340(local13 + 1, local17);
		@Pc(46) int local46 = Static16.method340(local13, local17 + 1);
		@Pc(55) int local55 = Static16.method340(local13 + 1, local17 + 1);
		@Pc(62) int local62 = Static36.method679(local9, arg0, local39, local28);
		@Pc(69) int local69 = Static36.method679(local9, arg0, local55, local46);
		return Static36.method679(local23, arg0, local69, local62);
	}
}
