import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!oe", name = "bb", descriptor = "Lclient!me;")
	public static Class6_Sub2_Sub2_Sub4 aClass6_Sub2_Sub2_Sub4_3;

	@OriginalMember(owner = "client!oe", name = "gb", descriptor = "Lclient!pb;")
	public static Class40 aClass40_26;

	@OriginalMember(owner = "client!oe", name = "hb", descriptor = "I")
	public static int anInt2108;

	@OriginalMember(owner = "client!oe", name = "ab", descriptor = "Lclient!le;")
	public static Class36 aClass36_24 = new Class36(64);

	@OriginalMember(owner = "client!oe", name = "cb", descriptor = "J")
	public static long aLong74 = 0L;

	@OriginalMember(owner = "client!oe", name = "db", descriptor = "Lclient!rc;")
	public static Class55 aClass55_857 = Static34.method846("backvmid1");

	@OriginalMember(owner = "client!oe", name = "eb", descriptor = "Lclient!rc;")
	private static Class55 aClass55_858 = Static34.method846("Your profile will be transferred in:");

	@OriginalMember(owner = "client!oe", name = "fb", descriptor = "I")
	public static int anInt2107 = -1;

	@OriginalMember(owner = "client!oe", name = "ib", descriptor = "Lclient!rc;")
	public static Class55 aClass55_859 = Static34.method846(" ");

	@OriginalMember(owner = "client!oe", name = "jb", descriptor = "[Z")
	public static boolean[] aBooleanArray9 = new boolean[5];

	@OriginalMember(owner = "client!oe", name = "kb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_860 = aClass55_858;

	@OriginalMember(owner = "client!oe", name = "lb", descriptor = "I")
	public static int anInt2109 = 0;

	@OriginalMember(owner = "client!oe", name = "mb", descriptor = "I")
	public static int anInt2110 = 1;

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)V")
	public static void method1421() {
		Static101.anIntArray284 = new int[104];
		Static13.aByteArrayArrayArray4 = new byte[4][104][104];
		Static35.anIntArray83 = new int[104];
		Static31.anIntArrayArray3 = new int[105][105];
		Static110.anInt3162 = 99;
		Static110.anIntArray299 = new int[104];
		Static54.aByteArrayArrayArray9 = new byte[4][104][104];
		Static9.anIntArray28 = new int[104];
		Static106.aByteArrayArrayArray14 = new byte[4][105][105];
		Static20.aByteArrayArrayArray6 = new byte[4][104][104];
		Static20.aByteArrayArrayArray7 = new byte[4][104][104];
		Static51.anIntArray158 = new int[104];
		Static14.anIntArrayArrayArray2 = new int[4][105][105];
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(B)V")
	public static void method1422() {
		aClass55_860 = null;
		aClass36_24 = null;
		aClass40_26 = null;
		aClass55_858 = null;
		aClass55_859 = null;
		aClass6_Sub2_Sub2_Sub4_3 = null;
		aBooleanArray9 = null;
		aClass55_857 = null;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZILclient!fb;)Z")
	public static boolean method1423(@OriginalArg(1) boolean arg0, @OriginalArg(3) Class20 arg1) {
		return Static76.method1521(arg0, arg1);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)Lclient!rc;")
	public static Class55 method1424(@OriginalArg(0) int arg0) {
		@Pc(9) Class55 local9 = Static58.method1196(arg0);
		for (@Pc(15) int local15 = local9.method1674() - 3; local15 > 0; local15 -= 3) {
			local9 = Static89.method1698(new Class55[] { local9.method1671(0, local15), Static26.aClass55_872, local9.method1673(local15) });
		}
		if (local9.method1674() > 8) {
			local9 = Static89.method1698(new Class55[] { Static44.aClass55_1153, local9.method1671(0, local9.method1674() - 8), Static83.aClass55_958, Static45.aClass55_563, local9, Static10.aClass55_248 });
		} else if (local9.method1674() > 4) {
			local9 = Static89.method1698(new Class55[] { Static58.aClass55_678, local9.method1671(0, local9.method1674() - 4), Static112.aClass55_1347, Static45.aClass55_563, local9, Static10.aClass55_248 });
		}
		return Static89.method1698(new Class55[] { aClass55_859, local9 });
	}

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "(B)V")
	public static void method1425() {
		if (Static58.anInt1746 != 0) {
			return;
		}
		Static76.aClass55Array20[0] = Static34.aClass55_512;
		Static10.anIntArray43[0] = 1005;
		Static94.anInt2645 = 1;
		if (Static76.anInt2217 != -1) {
			Static19.anInt948 = -1;
			Static11.anInt699 = -1;
			Static105.method1988(Static27.anInt1358, 765, Static76.anInt2217, 0, 0, 503, Static58.anInt1741, 0);
			Static103.anInt3042 = Static11.anInt699;
			Static100.anInt2945 = Static19.anInt948;
			return;
		}
		Static56.method1176();
		Static19.anInt948 = -1;
		Static11.anInt699 = -1;
		if (Static58.anInt1741 > 4 && Static27.anInt1358 > 4 && Static58.anInt1741 < 516 && Static27.anInt1358 < 338) {
			if (Static13.anInt800 == -1) {
				Static85.method1635();
			} else {
				Static105.method1988(Static27.anInt1358, 516, Static13.anInt800, 0, 4, 338, Static58.anInt1741, 4);
			}
		}
		Static103.anInt3042 = Static11.anInt699;
		Static11.anInt699 = -1;
		@Pc(96) boolean local96 = false;
		Static100.anInt2945 = Static19.anInt948;
		Static19.anInt948 = -1;
		if (Static58.anInt1741 > 553 && Static27.anInt1358 > 205 && Static58.anInt1741 < 743 && Static27.anInt1358 < 466) {
			if (Static14.anInt804 != -1) {
				Static105.method1988(Static27.anInt1358, 743, Static14.anInt804, 1, 553, 466, Static58.anInt1741, 205);
			} else if (Static100.anIntArray277[Static112.anInt3228] != -1) {
				Static105.method1988(Static27.anInt1358, 743, Static100.anIntArray277[Static112.anInt3228], 1, 553, 466, Static58.anInt1741, 205);
			}
		}
		if (Static13.anInt795 != Static19.anInt948) {
			Static13.anInt795 = Static19.anInt948;
			Static63.aBoolean89 = true;
		}
		Static19.anInt948 = -1;
		if (Static33.anInt1267 != Static11.anInt699) {
			Static63.aBoolean89 = true;
			Static33.anInt1267 = Static11.anInt699;
		}
		Static11.anInt699 = -1;
		if (Static58.anInt1741 > 17 && Static27.anInt1358 > 357 && Static58.anInt1741 < 496 && Static27.anInt1358 < 453) {
			if (Static1.anInt3 != -1) {
				Static105.method1988(Static27.anInt1358, 496, Static1.anInt3, 2, 17, 453, Static58.anInt1741, 357);
			} else if (Static39.anInt1691 != -1) {
				Static105.method1988(Static27.anInt1358, 496, Static39.anInt1691, 3, 17, 453, Static58.anInt1741, 357);
			} else if (Static27.anInt1358 < 434 && Static58.anInt1741 < 426) {
				Static46.method2066(Static58.anInt1741 - 17, Static27.anInt1358 + -357);
			}
		}
		if ((Static1.anInt3 != -1 || Static39.anInt1691 != -1) && Static19.anInt948 != Static29.anInt1152) {
			Static72.aBoolean99 = true;
			Static29.anInt1152 = Static19.anInt948;
		}
		if ((Static1.anInt3 != -1 || Static39.anInt1691 != -1) && Static11.anInt699 != Static59.anInt1819) {
			Static59.anInt1819 = Static11.anInt699;
			Static72.aBoolean99 = true;
		}
		while (!local96) {
			local96 = true;
			for (@Pc(272) int local272 = 0; local272 < Static94.anInt2645 - 1; local272++) {
				if (Static10.anIntArray43[local272] < 1000 && Static10.anIntArray43[local272 + 1] > 1000) {
					local96 = false;
					@Pc(294) Class55 local294 = Static76.aClass55Array20[local272];
					Static76.aClass55Array20[local272] = Static76.aClass55Array20[local272 + 1];
					Static76.aClass55Array20[local272 + 1] = local294;
					@Pc(312) int local312 = Static10.anIntArray43[local272];
					Static10.anIntArray43[local272] = Static10.anIntArray43[local272 + 1];
					Static10.anIntArray43[local272 + 1] = local312;
					@Pc(330) int local330 = Static107.anIntArray290[local272];
					Static107.anIntArray290[local272] = Static107.anIntArray290[local272 + 1];
					Static107.anIntArray290[local272 + 1] = local330;
					@Pc(348) int local348 = Static77.anIntArray216[local272];
					Static77.anIntArray216[local272] = Static77.anIntArray216[local272 + 1];
					Static77.anIntArray216[local272 + 1] = local348;
					@Pc(366) int local366 = Static52.anIntArray160[local272];
					Static52.anIntArray160[local272] = Static52.anIntArray160[local272 + 1];
					Static52.anIntArray160[local272 + 1] = local366;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZLclient!md;BIIZI)V")
	public static void method1426(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class40_Sub1 arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) long local10 = (long) (arg3 + (arg5 << 16));
		@Pc(16) Class6_Sub2_Sub9 local16 = (Class6_Sub2_Sub9) Static20.aClass38_11.method1183(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class6_Sub2_Sub9) Static34.aClass38_17.method1183(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class6_Sub2_Sub9) Static78.aClass38_24.method1183(local10);
		if (local16 == null) {
			if (!arg0) {
				local16 = (Class6_Sub2_Sub9) Static88.aClass38_36.method1183(local10);
				if (local16 != null) {
					return;
				}
			}
			local16 = new Class6_Sub2_Sub9();
			local16.anInt2482 = arg4;
			local16.aByte2 = arg2;
			local16.aClass40_Sub1_31 = arg1;
			if (arg0) {
				Static20.aClass38_11.method1184(local16, local10);
				Static91.anInt2532++;
			} else {
				Static57.aClass11_2.method461(local16);
				Static78.aClass38_24.method1184(local16, local10);
				Static8.anInt376++;
			}
		} else if (arg0) {
			local16.method2094();
			Static20.aClass38_11.method1184(local16, local10);
			Static91.anInt2532++;
			Static8.anInt376--;
		}
	}
}
