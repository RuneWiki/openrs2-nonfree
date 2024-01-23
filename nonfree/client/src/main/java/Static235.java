import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!qm", name = "m", descriptor = "Lclient!nk;")
	public static Class121 aClass121_129;

	@OriginalMember(owner = "client!qm", name = "r", descriptor = "[I")
	public static int[] anIntArray468;

	@OriginalMember(owner = "client!qm", name = "y", descriptor = "Lclient!hi;")
	public static Class66 aClass66_49;

	@OriginalMember(owner = "client!qm", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString317 = "Allocated memory";

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)Lclient!jc;")
	public static Class1_Sub2_Sub7 method4486(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub2_Sub7 local10 = (Class1_Sub2_Sub7) Static282.aClass148_13.method3600((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(23) byte[] local23;
		if (arg0 < 32768) {
			local23 = Static11.aClass121_8.method3115(1, arg0);
		} else {
			local23 = Static251.aClass121_110.method3115(1, arg0 & 0x7FFF);
		}
		local10 = new Class1_Sub2_Sub7();
		if (local23 != null) {
			local10.method2218(new Class1_Sub14(local23));
		}
		if (arg0 >= 32768) {
			local10.method2225();
		}
		Static282.aClass148_13.method3602(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "(I)V")
	public static void method4488() {
		Static103.method1865(Static5.aClass66_1);
		Static130.anInt2593++;
		if (Static232.aBoolean291 && Static221.aBoolean283) {
			@Pc(26) int local26 = Static247.anInt4467;
			local26 -= Static240.anInt4354;
			if (local26 < Static51.anInt1016) {
				local26 = Static51.anInt1016;
			}
			if (Static51.anInt1016 + Static309.aClass66_50.anInt2204 < local26 - -Static5.aClass66_1.anInt2204) {
				local26 = Static51.anInt1016 + Static309.aClass66_50.anInt2204 - Static5.aClass66_1.anInt2204;
			}
			@Pc(65) int local65 = local26 - Static200.anInt3846;
			@Pc(73) int local73 = Static222.anInt4105;
			@Pc(81) int local81 = Static309.aClass66_50.anInt2191 + local26 - Static51.anInt1016;
			@Pc(84) int local84 = Static5.aClass66_1.anInt2184;
			local73 -= Static145.anInt2885;
			if (local73 < Static108.anInt2254) {
				local73 = Static108.anInt2254;
			}
			if (Static309.aClass66_50.anInt2207 + Static108.anInt2254 < local73 + Static5.aClass66_1.anInt2207) {
				local73 = Static108.anInt2254 + Static309.aClass66_50.anInt2207 - Static5.aClass66_1.anInt2207;
			}
			@Pc(124) int local124 = local73 + Static309.aClass66_50.anInt2216 - Static108.anInt2254;
			@Pc(128) int local128 = local73 - Static33.anInt566;
			if (Static130.anInt2593 > Static5.aClass66_1.anInt2196 && (local84 < local65 || -local84 > local65 || local84 < local128 || -local84 > local128)) {
				Static95.aBoolean104 = true;
			}
			@Pc(176) Class1_Sub10 local176;
			if (Static5.aClass66_1.anObjectArray20 != null && Static95.aBoolean104) {
				local176 = new Class1_Sub10();
				local176.anInt950 = local81;
				local176.anInt947 = local124;
				local176.aClass66_10 = Static5.aClass66_1;
				local176.anObjectArray1 = Static5.aClass66_1.anObjectArray20;
				Static194.method3152(local176);
			}
			if (Static281.anInt5089 == 0) {
				if (Static95.aBoolean104) {
					if (Static5.aClass66_1.anObjectArray4 != null) {
						local176 = new Class1_Sub10();
						local176.aClass66_9 = Static227.aClass66_35;
						local176.aClass66_10 = Static5.aClass66_1;
						local176.anObjectArray1 = Static5.aClass66_1.anObjectArray4;
						local176.anInt950 = local81;
						local176.anInt947 = local124;
						Static194.method3152(local176);
					}
					if (Static227.aClass66_35 != null && Static37.method682(Static5.aClass66_1) != null) {
						Static127.aClass1_Sub14_Sub1_3.method1408(217);
						Static127.aClass1_Sub14_Sub1_3.method1351(Static227.aClass66_35.anInt2157);
						Static127.aClass1_Sub14_Sub1_3.method1338(Static227.aClass66_35.anInt2178);
						Static127.aClass1_Sub14_Sub1_3.method1342(Static5.aClass66_1.anInt2157);
						Static127.aClass1_Sub14_Sub1_3.method1341(Static5.aClass66_1.anInt2178);
					}
				} else if ((Static287.anInt5144 == 1 || Static214.method3358(Static110.anInt2281 - 1)) && Static110.anInt2281 > 2) {
					Static301.method4557();
				} else if (Static110.anInt2281 > 0) {
					Static258.method4086();
				}
				Static5.aClass66_1 = null;
			}
		} else if (Static130.anInt2593 > 1) {
			Static5.aClass66_1 = null;
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIIZI)V")
	public static void method4490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = arg2 + 1;
		Static273.method4257(arg3, Static183.anIntArrayArray26[arg2], arg4, arg1);
		@Pc(18) int local18 = arg0 - 1;
		Static273.method4257(arg3, Static183.anIntArrayArray26[arg0], arg4, arg1);
		for (@Pc(25) int local25 = local5; local25 <= local18; local25++) {
			@Pc(32) int[] local32 = Static183.anIntArrayArray26[local25];
			local32[arg3] = local32[arg1] = arg4;
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZIIIIII)V")
	public static void method4491(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static288.anInt5161 = arg5;
		Static90.anInt1746 = arg2;
		Static84.anInt1665 = arg1;
		Static307.anInt5433 = arg3;
		Static73.anInt1539 = arg4;
		if (arg0 && Static84.anInt1665 >= 100) {
			Static233.anInt4252 = Static307.anInt5433 * 128 + 64;
			Static94.anInt3434 = Static90.anInt1746 * 128 + 64;
			Static306.anInt5420 = Static69.method4275(Static233.anInt4252, Static65.anInt1300, Static94.anInt3434) - Static288.anInt5161;
		}
		Static167.anInt3292 = 2;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIBII)V")
	public static void method4492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= Static98.anInt2007 && arg2 <= Static213.anInt4452) {
			@Pc(23) int local23 = Static226.method3512(arg1, Static29.anInt517, Static11.anInt170);
			@Pc(31) int local31 = Static226.method3512(arg0, Static29.anInt517, Static11.anInt170);
			Static100.method1813(local31, arg3, local23, arg2);
		}
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(II)V")
	public static void method4494(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub2_Sub11 local12 = Static5.method35(arg0, 6);
		local12.method2873();
	}
}
