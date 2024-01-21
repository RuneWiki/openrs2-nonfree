import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!lc", name = "W", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!lc", name = "T", descriptor = "Lclient!je;")
	private static Class40 aClass40_248 = Static69.method1231("glow1:");

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "Lclient!je;")
	public static Class40 aClass40_244 = aClass40_248;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
	public static int anInt364 = 1;

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "Lclient!uf;")
	public static Class77 aClass77_5 = new Class77(32);

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "Lclient!je;")
	public static Class40 aClass40_245 = aClass40_248;

	@OriginalMember(owner = "client!lc", name = "v", descriptor = "Lclient!je;")
	private static Class40 aClass40_247 = Static69.method1231("Login server offline)3");

	@OriginalMember(owner = "client!lc", name = "q", descriptor = "Lclient!je;")
	public static Class40 aClass40_246 = aClass40_247;

	@OriginalMember(owner = "client!lc", name = "Q", descriptor = "I")
	public static int anInt395 = 0;

	@OriginalMember(owner = "client!lc", name = "U", descriptor = "[I")
	public static int[] anIntArray56 = new int[2000];

	@OriginalMember(owner = "client!lc", name = "V", descriptor = "Lclient!je;")
	public static Class40 aClass40_249 = Static69.method1231("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!lc", name = "X", descriptor = "Lclient!ob;")
	public static Class55 aClass55_18 = new Class55(64);

	@OriginalMember(owner = "client!lc", name = "Y", descriptor = "I")
	public static int anInt398 = 0;

	@OriginalMember(owner = "client!lc", name = "Z", descriptor = "I")
	public static int anInt399 = 0;

	@OriginalMember(owner = "client!lc", name = "ab", descriptor = "Lclient!je;")
	public static Class40 aClass40_250 = Static69.method1231("Lade Sprites )2 ");

	@OriginalMember(owner = "client!lc", name = "bb", descriptor = "Z")
	public static boolean aBoolean34 = false;

	@OriginalMember(owner = "client!lc", name = "cb", descriptor = "[I")
	public static int[] anIntArray57 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZLclient!fd;Lclient!fd;I)Lclient!mc;")
	public static Class2_Sub1_Sub6 method277(@OriginalArg(0) int arg0, @OriginalArg(2) Class24 arg1, @OriginalArg(3) Class24 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) int[] local12 = arg2.method1929(arg0);
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(29) byte[] local29 = arg2.method1922(arg0, local12[local14]);
			if (local29 == null) {
				local7 = false;
			} else {
				@Pc(49) int local49 = local29[1] & 0xFF | (local29[0] & 0xFF) << 8;
				@Pc(57) byte[] local57 = arg1.method1922(local49, 0);
				if (local57 == null) {
					local7 = false;
				}
			}
		}
		if (!local7) {
			return null;
		}
		try {
			return new Class2_Sub1_Sub6(arg2, arg1, arg0, false);
		} catch (@Pc(91) Exception local91) {
			return null;
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)V")
	public static void method279() {
		aClass55_18 = null;
		anIntArray57 = null;
		aByteArrayArrayArray2 = null;
		aClass40_245 = null;
		anIntArray56 = null;
		aClass40_249 = null;
		aClass40_246 = null;
		aClass40_247 = null;
		aClass40_244 = null;
		aClass40_248 = null;
		aClass77_5 = null;
		aClass40_250 = null;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "([Lclient!kc;ZI)V")
	public static void method280(@OriginalArg(0) Class2_Sub13[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(14) int local14 = 0; local14 < arg0.length; local14++) {
			@Pc(20) Class2_Sub13 local20 = arg0[local14];
			if (local20 != null) {
				if (local20.anInt1583 == 0) {
					if (local20.aClass2_Sub13Array2 != null) {
						method280(local20.aClass2_Sub13Array2, arg1);
					}
					@Pc(41) Class2_Sub11 local41 = (Class2_Sub11) Static61.aClass77_6.method2034((long) local20.anInt1560);
					if (local41 != null) {
						Static74.method627(arg1, local41.anInt1313);
					}
				}
				@Pc(60) Class2_Sub7 local60;
				if (arg1 == 0 && local20.anObjectArray21 != null) {
					local60 = new Class2_Sub7();
					local60.anObjectArray1 = local20.anObjectArray21;
					local60.aClass2_Sub13_4 = local20;
					Static58.method1028(local60);
				}
				if (arg1 == 1 && local20.anObjectArray18 != null) {
					if (local20.anInt1578 >= 0) {
						@Pc(87) Class2_Sub13 local87 = Static55.method972(local20.anInt1560);
						if (local87 == null || local87.aClass2_Sub13Array2 == null || local87.aClass2_Sub13Array2.length <= local20.anInt1578 || local20 != local87.aClass2_Sub13Array2[local20.anInt1578]) {
							continue;
						}
					}
					local60 = new Class2_Sub7();
					local60.aClass2_Sub13_4 = local20;
					local60.anObjectArray1 = local20.anObjectArray18;
					Static58.method1028(local60);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)Z")
	public static boolean method283(@OriginalArg(0) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "(I)V")
	public static void method289() {
		if (!Static8.aBoolean21) {
			Static83.anIntArray236[0] = 1005;
			Static45.aClass40Array4[0] = Static60.aClass40_823;
			Static57.anInt1500 = 1;
			Static25.aClass40Array1[0] = Static43.aClass40_568;
		}
		if (Static92.anInt2332 != -1) {
			Static119.method2008(Static92.anInt2332);
		}
		for (@Pc(37) int local37 = 0; local37 < Static70.anInt1897; local37++) {
			if (Static64.aBooleanArray17[local37]) {
				Static84.aBooleanArray21[local37] = true;
			}
			Static50.aBooleanArray12[local37] = Static64.aBooleanArray17[local37];
			Static64.aBooleanArray17[local37] = false;
		}
		Static127.anInt2943 = Static28.anInt704;
		Static110.anInt1824 = -1;
		Static20.anInt632 = -1;
		Static101.aClass2_Sub13_13 = null;
		if (Static92.anInt2332 != -1) {
			Static70.anInt1897 = 0;
			Static123.method2068(0, Static92.anInt2332, 0, -1, 0, 0, 765, 503);
		}
		Static6.method1689();
		Static37.method681();
		if (Static8.aBoolean21) {
			Static105.method1824();
		} else if (Static20.anInt632 != -1) {
			Static75.method1247(Static110.anInt1824, Static20.anInt632);
		}
		if (anInt395 == 3) {
			for (@Pc(109) int local109 = 0; local109 < Static70.anInt1897; local109++) {
				if (Static50.aBooleanArray12[local109]) {
					Static6.method1699(Static60.anIntArray168[local109], Static24.anIntArray376[local109], Static46.anIntArray131[local109], Static117.anIntArray323[local109], 16711935, 128);
				} else if (Static84.aBooleanArray21[local109]) {
					Static6.method1699(Static60.anIntArray168[local109], Static24.anIntArray376[local109], Static46.anIntArray131[local109], Static117.anIntArray323[local109], 16711680, 128);
				}
			}
		}
		Static76.method1263(Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt1788, Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt1792, Static49.anInt1315, Static105.anInt2531);
		Static49.anInt1315 = 0;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZ)Lclient!ue;")
	public static Class2_Sub1_Sub14 method291(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub1_Sub14 local10 = (Class2_Sub1_Sub14) Static97.aClass55_76.method1410((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static88.aClass24_25.method1931(arg0, 13);
		local10 = new Class2_Sub1_Sub14();
		local10.anInt2813 = arg0;
		if (local20 != null) {
			local10.method2029(new Class2_Sub9(local20));
		}
		Static97.aClass55_76.method1411((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!fd;ILclient!fd;)V")
	public static void method293(@OriginalArg(0) Class24 arg0, @OriginalArg(2) Class24 arg1) {
		Static110.aClass24_20 = arg1;
		Static61.aClass24_18 = arg0;
	}
}
