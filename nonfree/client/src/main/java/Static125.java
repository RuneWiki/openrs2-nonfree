import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
	public static int anInt1642;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "Z")
	public static boolean aBoolean60 = false;

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
	public static int anInt1641 = 0;

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "Lclient!qe;")
	public static Class78 aClass78_364 = Static199.method3560("weiss:");

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "[J")
	public static long[] aLongArray5 = new long[32];

	@OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
	public static int anInt1645 = 0;

	@OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
	public static int anInt1646 = -1;

	@OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
	public static int anInt1648 = 0;

	@OriginalMember(owner = "client!ma", name = "m", descriptor = "[I")
	public static int[] anIntArray278 = new int[200];

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)V")
	public static void method1281(@OriginalArg(1) int arg0) {
		if (arg0 == Static226.anInt4903) {
			return;
		}
		if (Static226.anInt4903 == 0) {
			Static216.method3747();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static179.anInt4186 = 0;
			Static150.anInt3424 = 0;
			Static38.anInt715 = 0;
			Static158.anInt3655 = -4;
		}
		if (arg0 != 20 && arg0 != 40 && Static49.aClass105_1 != null) {
			Static49.aClass105_1.method3695();
			Static49.aClass105_1 = null;
		}
		if (arg0 == 25) {
			Static157.anInt3622 = 1;
			Static175.anInt4043 = 0;
			Static144.anInt3273 = 0;
			Static103.anInt2274 = 0;
			Static29.anInt532 = 1;
			Static110.method1908();
		}
		if (arg0 == 5) {
			Static208.method3658(Static215.aClass72_Sub1_33);
		} else {
			Static196.method3546();
		}
		@Pc(102) boolean local102 = arg0 == 5 || arg0 == 8 || arg0 == 10;
		@Pc(120) boolean local120 = Static226.anInt4903 == 5 || Static226.anInt4903 == 8 || Static226.anInt4903 == 10 || Static226.anInt4903 == 28;
		if (local102 != local120) {
			if (local102) {
				Static162.anInt3745 = Static175.anInt4036;
				if (Static89.anInt1999 == 0) {
					Static145.method2571();
				} else {
					Static113.method1932(Static90.aClass72_Sub1_17, Static175.anInt4036, 255);
				}
				Static34.method423(false);
			} else {
				Static145.method2571();
				Static34.method423(true);
			}
		}
		if (arg0 == 8) {
			arg0 = Static207.method3655();
		}
		Static226.anInt4903 = arg0;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V")
	public static void method1282() {
		if (Static112.aClass47_1 == null) {
			return;
		}
		try {
			@Pc(17) byte[] local17 = Static112.aClass47_1.method1623();
			if (local17 != null) {
				@Pc(24) Class2_Sub23 local24 = new Class2_Sub23(local17);
				Static162.anInt3744 = local24.method2095();
				Static132.aClass9Array1 = new Class9[Static162.anInt3744];
				for (@Pc(33) int local33 = 0; local33 < Static162.anInt3744; local33++) {
					@Pc(43) Class9 local43 = Static132.aClass9Array1[local33] = new Class9();
					@Pc(47) int local47 = local24.method2095();
					local43.anInt322 = local47 & 0x7FFF;
					local43.aBoolean9 = (local47 & 0x8000) != 0;
					local43.aClass78_47 = local24.method2115();
					local43.anInt323 = local24.method2104();
					local43.anInt320 = local33;
					local43.anInt318 = Static223.method3924(local24.method2095());
				}
				Static69.method1123(0, Static132.aClass9Array1, Static132.aClass9Array1.length - 1);
				Static112.aClass47_1 = null;
			}
		} catch (@Pc(104) Exception local104) {
			local104.printStackTrace();
			Static112.aClass47_1 = null;
		}
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)V")
	public static void method1284() {
		for (@Pc(3) int local3 = 0; local3 < Static50.anInt908; local3++) {
			@Pc(9) int local9 = Static79.anIntArray286[local3];
			@Pc(13) Class5_Sub2_Sub1 local13 = Static95.aClass5_Sub2_Sub1Array1[local9];
			if (local13 != null) {
				Static204.method3621(local13.aClass2_Sub3_Sub9_1.anInt1284, local13);
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
	public static void method1285() {
		Static70.method2259(Static227.aClass64_17);
		Static225.anInt4887++;
		if (Static79.aBoolean63 && Static226.aBoolean213) {
			@Pc(31) int local31 = Static81.anInt1744;
			local31 -= Static148.anInt3382;
			if (local31 < Static202.anInt4530) {
				local31 = Static202.anInt4530;
			}
			if (Static202.anInt4530 + Static223.aClass64_14.anInt3040 < local31 - -Static227.aClass64_17.anInt3040) {
				local31 = Static223.aClass64_14.anInt3040 + Static202.anInt4530 - Static227.aClass64_17.anInt3040;
			}
			@Pc(72) int local72 = local31 - Static75.anInt1622;
			@Pc(74) int local74 = Static44.anInt806;
			@Pc(77) int local77 = Static227.aClass64_17.anInt3048;
			local74 -= Static114.anInt2545;
			@Pc(89) int local89 = local31 + Static223.aClass64_14.anInt3046 - Static202.anInt4530;
			if (local74 < Static4.anInt119) {
				local74 = Static4.anInt119;
			}
			if (Static4.anInt119 + Static223.aClass64_14.anInt3021 < Static227.aClass64_17.anInt3021 + local74) {
				local74 = Static4.anInt119 + Static223.aClass64_14.anInt3021 - Static227.aClass64_17.anInt3021;
			}
			@Pc(121) int local121 = local74 - anInt1646;
			if (Static227.aClass64_17.anInt3073 < Static225.anInt4887 && (local121 > local77 || -local77 > local121 || local72 > local77 || -local77 > local72)) {
				Static60.aBoolean39 = true;
			}
			@Pc(152) int local152 = Static223.aClass64_14.anInt3037 + local74 - Static4.anInt119;
			@Pc(161) Class2_Sub1 local161;
			if (Static227.aClass64_17.anObjectArray3 != null && Static60.aBoolean39) {
				local161 = new Class2_Sub1();
				local161.anInt43 = local89;
				local161.anObjectArray1 = Static227.aClass64_17.anObjectArray3;
				local161.anInt41 = local152;
				local161.aClass64_1 = Static227.aClass64_17;
				Static50.method649(local161);
			}
			if (Static78.anInt1709 == 0) {
				if (Static60.aBoolean39) {
					if (Static227.aClass64_17.anObjectArray21 != null) {
						local161 = new Class2_Sub1();
						local161.aClass64_1 = Static227.aClass64_17;
						local161.anObjectArray1 = Static227.aClass64_17.anObjectArray21;
						local161.anInt41 = local152;
						local161.aClass64_2 = Static156.aClass64_12;
						local161.anInt43 = local89;
						Static50.method649(local161);
					}
					if (Static156.aClass64_12 != null && Static36.method477(Static227.aClass64_17) != null) {
						Static161.aClass2_Sub23_Sub1_5.method2155(49);
						Static161.aClass2_Sub23_Sub1_5.method2139(Static156.aClass64_12.anInt3044);
						Static161.aClass2_Sub23_Sub1_5.method2119(Static156.aClass64_12.anInt2993);
						Static161.aClass2_Sub23_Sub1_5.method2119(Static227.aClass64_17.anInt2993);
						Static161.aClass2_Sub23_Sub1_5.method2109(Static227.aClass64_17.anInt3044);
					}
				} else if ((Static152.anInt3472 == 1 || Static97.method1688(Static138.anInt3182 - 1)) && Static138.anInt3182 > 2) {
					Static75.method1257();
				} else if (Static138.anInt3182 > 0) {
					Static70.method2260(Static138.anInt3182 - 1);
				}
				Static227.aClass64_17 = null;
			}
		} else if (Static225.anInt4887 > 1) {
			Static227.aClass64_17 = null;
		}
	}
}
