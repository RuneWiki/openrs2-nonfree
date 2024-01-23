import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
	public static int anInt4483;

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
	public static int anInt4481 = 0;

	@OriginalMember(owner = "client!qh", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString226 = "Loaded update list";

	@OriginalMember(owner = "client!qh", name = "D", descriptor = "[I")
	public static int[] anIntArray367 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!qh", name = "zb", descriptor = "[I")
	public static int[] anIntArray373 = new int[] { 0, 0, 6, 0, 2, 0, 0, 0, 0, 0, 0, 0, 8, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 6, 11, 0, 0, 20, 0, 0, 0, 9, 0, 0, 0, 6, 14, -2, 3, 0, 10, -2, 0, 0, -1, 28, 17, 7, 6, 6, 0, 0, 0, 14, 10, 0, -2, -2, 5, 0, 0, 3, 8, 7, 5, 0, 2, 0, 0, 0, -2, -1, 0, 0, 0, 0, 0, 3, 4, 0, 5, 0, 7, -2, 3, 0, 0, -1, 0, 0, 0, 0, 6, 0, 0, 1, 5, 0, 8, -1, 0, 0, 3, 0, 0, 12, 6, 0, -1, 0, 0, -1, 0, 0, 4, 0, 0, 7, 0, -1, 3, -2, 0, 0, 0, 0, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 1, 0, 12, -2, 0, 0, 15, 0, 0, 0, 0, 3, 0, 0, 8, 0, 0, 3, 8, -1, 0, 0, 6, -2, 8, 0, 0, 0, 0, 0, 12, -1, 6, 0, 0, 1, 8, 2, 0, 0, 0, 0, 0, 2, 0, 0, -1, 0, 0, 1, 0, 4, 0, -2, 0, 0, 0, 0, 6, 0, 10, 8, -1, 0, 0, 0, 0, 0, 0, 1, 8, 15, 0, 10, -2, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1, -2, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 12, 0, -2, 0, -1, 0, 0, 2, 0, 2, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IBIII)V")
	public static void method3636(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(6) Class2_Sub23 local6;
		for (local6 = (Class2_Sub23) Static238.aClass1_24.method13(); local6 != null; local6 = (Class2_Sub23) Static238.aClass1_24.method9()) {
			Static17.method358(arg2, arg1, local6, arg3, arg0);
		}
		@Pc(35) byte local35;
		@Pc(40) Class70 local40;
		@Pc(122) int local122;
		for (local6 = (Class2_Sub23) Static143.aClass1_12.method13(); local6 != null; local6 = (Class2_Sub23) Static143.aClass1_12.method9()) {
			local35 = 1;
			local40 = local6.aClass36_Sub3_Sub1_1.method4104();
			if (local40.anInt2124 == local6.aClass36_Sub3_Sub1_1.anInt5138) {
				local35 = 0;
			} else if (local6.aClass36_Sub3_Sub1_1.anInt5138 == local40.anInt2096 || local6.aClass36_Sub3_Sub1_1.anInt5138 == local40.anInt2116 || local40.anInt2092 == local6.aClass36_Sub3_Sub1_1.anInt5138 || local40.anInt2106 == local6.aClass36_Sub3_Sub1_1.anInt5138) {
				local35 = 2;
			} else if (local40.anInt2097 == local6.aClass36_Sub3_Sub1_1.anInt5138 || local6.aClass36_Sub3_Sub1_1.anInt5138 == local40.anInt2113 || local40.anInt2093 == local6.aClass36_Sub3_Sub1_1.anInt5138 || local40.anInt2122 == local6.aClass36_Sub3_Sub1_1.anInt5138) {
				local35 = 3;
			}
			if (local6.anInt4654 != local35) {
				local122 = Static34.method1663(local6.aClass36_Sub3_Sub1_1);
				if (local122 != local6.anInt4657) {
					if (local6.aClass2_Sub5_Sub2_1 != null) {
						Static43.aClass2_Sub5_Sub1_1.method404(local6.aClass2_Sub5_Sub2_1);
						local6.aClass2_Sub5_Sub2_1 = null;
					}
					local6.anInt4657 = local122;
				}
				local6.anInt4654 = local35;
			}
			local6.anInt4650 = local6.aClass36_Sub3_Sub1_1.anInt5093;
			local6.anInt4663 = local6.aClass36_Sub3_Sub1_1.anInt5093 + local6.aClass36_Sub3_Sub1_1.method4097() * 64;
			local6.anInt4651 = local6.aClass36_Sub3_Sub1_1.anInt5109;
			local6.anInt4662 = local6.aClass36_Sub3_Sub1_1.anInt5109 + local6.aClass36_Sub3_Sub1_1.method4097() * 64;
			Static17.method358(arg2, arg1, local6, arg3, arg0);
		}
		for (local6 = (Class2_Sub23) Static259.aClass79_21.method1992(); local6 != null; local6 = (Class2_Sub23) Static259.aClass79_21.method1991()) {
			local35 = 1;
			local40 = local6.aClass36_Sub3_Sub2_2.method4104();
			if (local6.aClass36_Sub3_Sub2_2.anInt5138 == local40.anInt2124) {
				local35 = 0;
			} else if (local6.aClass36_Sub3_Sub2_2.anInt5138 == local40.anInt2096 || local6.aClass36_Sub3_Sub2_2.anInt5138 == local40.anInt2116 || local6.aClass36_Sub3_Sub2_2.anInt5138 == local40.anInt2092 || local40.anInt2106 == local6.aClass36_Sub3_Sub2_2.anInt5138) {
				local35 = 2;
			} else if (local40.anInt2097 == local6.aClass36_Sub3_Sub2_2.anInt5138 || local40.anInt2113 == local6.aClass36_Sub3_Sub2_2.anInt5138 || local6.aClass36_Sub3_Sub2_2.anInt5138 == local40.anInt2093 || local40.anInt2122 == local6.aClass36_Sub3_Sub2_2.anInt5138) {
				local35 = 3;
			}
			if (local35 != local6.anInt4654) {
				local122 = Static247.method3967(local6.aClass36_Sub3_Sub2_2);
				if (local122 != local6.anInt4657) {
					if (local6.aClass2_Sub5_Sub2_1 != null) {
						Static43.aClass2_Sub5_Sub1_1.method404(local6.aClass2_Sub5_Sub2_1);
						local6.aClass2_Sub5_Sub2_1 = null;
					}
					local6.anInt4657 = local122;
				}
				local6.anInt4654 = local35;
			}
			local6.anInt4650 = local6.aClass36_Sub3_Sub2_2.anInt5093;
			local6.anInt4663 = local6.aClass36_Sub3_Sub2_2.anInt5093 + local6.aClass36_Sub3_Sub2_2.method4097() * 64;
			local6.anInt4651 = local6.aClass36_Sub3_Sub2_2.anInt5109;
			local6.anInt4662 = local6.aClass36_Sub3_Sub2_2.anInt5109 + local6.aClass36_Sub3_Sub2_2.method4097() * 64;
			Static17.method358(arg2, arg1, local6, arg3, arg0);
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(CILjava/lang/String;)[Ljava/lang/String;")
	public static String[] method3644(@OriginalArg(0) char arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = Static268.method4461(arg0, arg1);
		@Pc(14) int local14 = 0;
		@Pc(19) String[] local19 = new String[local12 + 1];
		for (@Pc(21) int local21 = 0; local21 < local12; local21++) {
			@Pc(26) int local26;
			for (local26 = local14; arg1.charAt(local26) != arg0; local26++) {
			}
			local19[local7++] = arg1.substring(local14, local26);
			local14 = local26 + 1;
		}
		local19[local12] = arg1.substring(local14);
		return local19;
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)V")
	public static void method3645() {
		if (Static198.anIntArray344 != null && Static201.anIntArray347 != null) {
			return;
		}
		Static201.anIntArray347 = new int[256];
		Static198.anIntArray344 = new int[256];
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(27) double local27 = (double) local15 / 255.0D * 6.283185307179586D;
			Static198.anIntArray344[local15] = (int) (Math.sin(local27) * 4096.0D);
			Static201.anIntArray347[local15] = (int) (Math.cos(local27) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIZIII)V")
	public static void method3647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		anInt4483 = arg1;
		Static97.anInt2181 = arg0;
		Static295.anInt6138 = arg5;
		Static62.anInt1380 = arg4;
		Static131.anInt2690 = arg2;
		if (arg3 && Static62.anInt1380 >= 100) {
			Static271.anInt5632 = anInt4483 * 128 + 64;
			Static255.anInt5182 = Static131.anInt2690 * 128 + 64;
			Static133.anInt2729 = Static99.method1894(Static208.anInt4335, Static255.anInt5182, Static271.anInt5632) - Static97.anInt2181;
		}
		Static101.anInt6027 = 2;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZ)Lclient!hj;")
	public static Class70 method3653(@OriginalArg(0) int arg0) {
		@Pc(10) Class70 local10 = (Class70) Static112.aClass46_17.method1074((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static288.aClass84_125.method2127(arg0, 32);
		local10 = new Class70();
		if (local22 != null) {
			local10.method1833(new Class2_Sub26(local22));
		}
		local10.method1836();
		Static112.aClass46_17.method1071(local10, (long) arg0);
		return local10;
	}
}
