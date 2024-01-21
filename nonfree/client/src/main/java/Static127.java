import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!vf", name = "y", descriptor = "Lclient!b;")
	public static Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_16;

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "Lclient!sb;")
	public static Class65 aClass65_44 = new Class65(512);

	@OriginalMember(owner = "client!vf", name = "m", descriptor = "Lclient!je;")
	public static Class1_Sub12_Sub1 aClass1_Sub12_Sub1_2 = new Class1_Sub12_Sub1(5000);

	@OriginalMember(owner = "client!vf", name = "n", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1691 = Static106.method1849("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!vf", name = "w", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1697 = Static106.method1849("New User");

	@OriginalMember(owner = "client!vf", name = "o", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1692 = aClass66_1697;

	@OriginalMember(owner = "client!vf", name = "p", descriptor = "J")
	public static volatile long aLong128 = 0L;

	@OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
	public static int anInt2905 = 0;

	@OriginalMember(owner = "client!vf", name = "s", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1694 = Static106.method1849("Your profile will be transferred in:");

	@OriginalMember(owner = "client!vf", name = "r", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1693 = aClass66_1694;

	@OriginalMember(owner = "client!vf", name = "t", descriptor = "[I")
	public static int[] anIntArray495 = new int[25];

	@OriginalMember(owner = "client!vf", name = "u", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1695 = Static106.method1849("mapback");

	@OriginalMember(owner = "client!vf", name = "v", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1696 = Static106.method1849("Please enter your username)3");

	@OriginalMember(owner = "client!vf", name = "x", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1698 = aClass66_1696;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method2023(@OriginalArg(0) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static131.anInt2689 > 0) {
			local21 = Static86.aByteArrayArray7[--Static131.anInt2689];
			Static86.aByteArrayArray7[Static131.anInt2689] = null;
			return local21;
		} else if (arg0 == 5000 && Static105.anInt2597 > 0) {
			local21 = Static124.aByteArrayArray10[--Static105.anInt2597];
			Static124.aByteArrayArray10[Static105.anInt2597] = null;
			return local21;
		} else if (arg0 == 30000 && Static49.anInt1515 > 0) {
			local21 = Static77.aByteArrayArray6[--Static49.anInt1515];
			Static77.aByteArrayArray6[Static49.anInt1515] = null;
			return local21;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
	public static void method2024() {
		anIntArray495 = null;
		aClass66_1693 = null;
		aClass66_1692 = null;
		aClass66_1697 = null;
		aClass65_44 = null;
		aClass66_1694 = null;
		aClass66_1691 = null;
		aClass1_Sub1_Sub2_Sub1_16 = null;
		aClass66_1698 = null;
		aClass66_1695 = null;
		aClass66_1696 = null;
		aClass1_Sub12_Sub1_2 = null;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLclient!sf;Lclient!sf;)V")
	public static void method2025(@OriginalArg(1) Class5 arg0, @OriginalArg(2) Class5 arg1) {
		Static74.aClass5_61 = arg1;
		Static36.aClass5_29 = arg0;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIB)I")
	public static int method2026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(46) int local46 = Static70.method542(arg0 + 45365, 4, arg1 + 91923) + (Static70.method542(arg0 - -10294, 2, arg1 + 37821) - 128 >> 1) + (Static70.method542(arg0, 1, arg1) + -128 >> 2) - 128;
		local46 = (int) ((double) local46 * 0.3D) + 35;
		if (local46 < 10) {
			local46 = 10;
		} else if (local46 > 60) {
			local46 = 60;
		}
		return local46;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIZII)Lclient!b;")
	public static Class1_Sub1_Sub2_Sub1 method2027(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(23) long local23 = ((long) arg4 << 40) + ((long) arg1 << 16) + (long) arg0 + ((long) arg3 << 38);
		@Pc(31) Class1_Sub1_Sub2_Sub1 local31;
		if (!arg2) {
			local31 = (Class1_Sub1_Sub2_Sub1) Static89.aClass60_71.method1745(local23);
			if (local31 != null) {
				return local31;
			}
		}
		@Pc(39) Class1_Sub1_Sub6 local39 = Static20.method496(arg0);
		if (arg1 > 1 && local39.anIntArray235 != null) {
			@Pc(47) int local47 = -1;
			for (@Pc(49) int local49 = 0; local49 < 10; local49++) {
				if (arg1 >= local39.anIntArray236[local49] && local39.anIntArray236[local49] != 0) {
					local47 = local39.anIntArray235[local49];
				}
			}
			if (local47 != -1) {
				local39 = Static20.method496(local47);
			}
		}
		@Pc(85) Class1_Sub1_Sub1_Sub6 local85 = local39.method1085(1);
		if (local85 == null) {
			return null;
		}
		@Pc(91) Class1_Sub1_Sub2_Sub1 local91 = null;
		if (local39.anInt1536 != -1) {
			local91 = method2027(local39.anInt1557, 10, true, 1, 0);
			if (local91 == null) {
				return null;
			}
		}
		@Pc(110) int[] local110 = Static115.anIntArray395;
		@Pc(112) int local112 = Static115.anInt2366;
		@Pc(114) int local114 = Static115.anInt2371;
		@Pc(117) int[] local117 = new int[4];
		Static115.method1667(local117);
		local31 = new Class1_Sub1_Sub2_Sub1(36, 32);
		Static115.method1674(local31.anIntArray44, 36, 32);
		Static115.method1663();
		Static91.method1689();
		Static91.method1681(16, 16);
		@Pc(138) int local138 = local39.anInt1568;
		if (arg2) {
			local138 = (int) ((double) local138 * 1.5D);
		} else if (arg3 == 2) {
			local138 = (int) ((double) local138 * 1.04D);
		}
		Static91.aBoolean100 = false;
		@Pc(168) int local168 = local138 * Class1_Sub1_Sub2_Sub4.anIntArray399[local39.anInt1551] >> 16;
		@Pc(177) int local177 = Class1_Sub1_Sub2_Sub4.anIntArray397[local39.anInt1551] * local138 >> 16;
		local85.method1338();
		local85.method1344(local39.anInt1541, local39.anInt1574, local39.anInt1551, local39.anInt1562, local168 + local85.anInt2699 / 2 + local39.anInt1534, local177 - -local39.anInt1534);
		if (arg3 >= 1) {
			local31.method232(1);
		}
		if (arg3 >= 2) {
			local31.method232(16777215);
		}
		if (arg4 != 0) {
			local31.method248(arg4);
		}
		Static115.method1674(local31.anIntArray44, 36, 32);
		if (local39.anInt1536 != -1) {
			local91.method250(0, 0);
		}
		if (!arg2 && (local39.anInt1543 == 1 || arg1 != 1) && arg1 != -1) {
			Static97.aClass1_Sub1_Sub2_Sub2_Sub1_2.method790(Static132.method2045(arg1), 0, 9, 16776960, 1);
		}
		if (!arg2) {
			Static89.aClass60_71.method1741(local23, local31);
		}
		Static115.method1674(local110, local112, local114);
		Static115.method1677(local117);
		Static91.method1689();
		Static91.aBoolean100 = true;
		return local31;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIBI)I")
	public static int method2028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if ((arg1 & 0x1) == 1) {
			@Pc(10) int local10 = arg4;
			arg4 = arg5;
			arg5 = local10;
		}
		@Pc(22) int local22 = arg2 & 0x3;
		if (local22 == 0) {
			return arg3;
		} else if (local22 == 1) {
			return arg0;
		} else if (local22 == 2) {
			return 8 - arg3 - arg4;
		} else {
			return 7 + 1 - arg0 - arg5;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IZ)V")
	public static void method2029(@OriginalArg(0) int arg0) {
		if (!Static51.method1090(arg0)) {
			return;
		}
		@Pc(18) Class1_Sub10[] local18 = Static100.aClass1_Sub10ArrayArray1[arg0];
		for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
			@Pc(26) Class1_Sub10 local26 = local18[local20];
			if (local26 != null) {
				local26.anInt1366 = 0;
				local26.anInt1379 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IZI)Lclient!he;")
	public static Class1_Sub10 method2030(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class1_Sub10 local7 = Static38.method2002(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass1_Sub10Array2 == null || local7.aClass1_Sub10Array2.length <= arg1) {
			return null;
		} else {
			return local7.aClass1_Sub10Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V")
	public static void method2031() {
		for (@Pc(14) int local14 = -1; local14 < Static111.anInt2653; local14++) {
			@Pc(24) int local24;
			if (local14 == -1) {
				local24 = 2047;
			} else {
				local24 = Static51.anIntArray239[local14];
			}
			@Pc(32) Class1_Sub1_Sub1_Sub5_Sub2 local32 = Static85.aClass1_Sub1_Sub1_Sub5_Sub2Array1[local24];
			if (local32 != null) {
				Static118.method1951(1, local32);
			}
		}
	}
}
