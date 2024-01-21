import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!t", name = "z", descriptor = "Lclient!c;")
	public static Class14 aClass14_32;

	@OriginalMember(owner = "client!t", name = "A", descriptor = "Lclient!wc;")
	public static Class1_Sub2_Sub8_Sub5 aClass1_Sub2_Sub8_Sub5_41;

	@OriginalMember(owner = "client!t", name = "C", descriptor = "Lclient!nf;")
	public static Class69_Sub1 aClass69_Sub1_162;

	@OriginalMember(owner = "client!t", name = "I", descriptor = "I")
	public static int anInt4669;

	@OriginalMember(owner = "client!t", name = "J", descriptor = "Lclient!ac;")
	public static Class3 aClass3_32;

	@OriginalMember(owner = "client!t", name = "q", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1323 = Static81.method1507("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!t", name = "u", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1324 = Static81.method1507("::noclip");

	@OriginalMember(owner = "client!t", name = "E", descriptor = "Lclient!rh;")
	public static final Class1_Sub7_Sub1 aClass1_Sub7_Sub1_34 = new Class1_Sub7_Sub1(5000);

	@OriginalMember(owner = "client!t", name = "F", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1325 = Static81.method1507("Hier wechseln");

	@OriginalMember(owner = "client!t", name = "G", descriptor = "Lclient!l;")
	public static final Class57 aClass57_45 = new Class57(32);

	@OriginalMember(owner = "client!t", name = "H", descriptor = "[J")
	public static final long[] aLongArray40 = new long[1000];

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(B)V")
	public static void method3550() {
		Static104.anIntArray191 = new int[104];
		Static116.anIntArray205 = new int[104];
		Static195.aByteArrayArrayArray13 = new byte[4][104][104];
		Static80.anInt1917 = 99;
		Static191.anIntArrayArrayArray11 = new int[4][105][105];
		Static85.anIntArray287 = new int[104];
		Static144.aByteArrayArrayArray8 = new byte[4][104][104];
		Static177.aByteArrayArrayArray12 = new byte[4][104][104];
		Static136.aByteArrayArrayArray7 = new byte[4][105][105];
		Static189.anIntArray366 = new int[104];
		Static71.anIntArray148 = new int[104];
		Static27.aByteArrayArrayArray1 = new byte[4][104][104];
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(II)Z")
	public static boolean method3551(@OriginalArg(0) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(BI)V")
	public static void method3552(@OriginalArg(1) int arg0) {
		Static137.anInt3096 = arg0;
		Static70.anInt3206 = 50;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIII)V")
	public static void method3554(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) int local5 = 0;
		@Pc(8) int local8 = -arg3;
		@Pc(14) int local14 = arg3;
		@Pc(22) int local22 = Static177.method3022(Static63.anInt1608, arg3 + arg0, Static63.anInt1595);
		@Pc(24) int local24 = -1;
		@Pc(33) int local33 = Static177.method3022(Static63.anInt1608, arg0 - arg3, Static63.anInt1595);
		Static39.method731(Static98.anIntArrayArray16[arg1], local33, local22, arg2);
		while (local14 > local5) {
			local24 += 2;
			local8 += local24;
			@Pc(58) int local58;
			@Pc(68) int local68;
			@Pc(91) int local91;
			@Pc(100) int local100;
			if (local8 > 0) {
				local14--;
				local58 = arg1 - local14;
				local8 -= local14 << 1;
				local68 = local14 + arg1;
				if (local68 >= Static13.anInt308 && Static52.anInt1338 >= local58) {
					local91 = Static177.method3022(Static63.anInt1608, arg0 + local5, Static63.anInt1595);
					local100 = Static177.method3022(Static63.anInt1608, arg0 - local5, Static63.anInt1595);
					if (local68 <= Static52.anInt1338) {
						Static39.method731(Static98.anIntArrayArray16[local68], local100, local91, arg2);
					}
					if (Static13.anInt308 <= local58) {
						Static39.method731(Static98.anIntArrayArray16[local58], local100, local91, arg2);
					}
				}
			}
			local5++;
			local58 = arg1 - local5;
			local68 = local5 + arg1;
			if (local68 >= Static13.anInt308 && local58 <= Static52.anInt1338) {
				local91 = Static177.method3022(Static63.anInt1608, arg0 + local14, Static63.anInt1595);
				local100 = Static177.method3022(Static63.anInt1608, arg0 - local14, Static63.anInt1595);
				if (Static52.anInt1338 >= local68) {
					Static39.method731(Static98.anIntArrayArray16[local68], local100, local91, arg2);
				}
				if (Static13.anInt308 <= local58) {
					Static39.method731(Static98.anIntArrayArray16[local58], local100, local91, arg2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "c", descriptor = "(II)V")
	public static void method3555(@OriginalArg(1) int arg0) {
		if (arg0 == -3) {
			Static167.method2843(Static69.aClass24_502, Static177.aClass24_1130, Static2.aClass24_31);
		} else if (arg0 == -2) {
			Static167.method2843(Static69.aClass24_522, Static7.aClass24_47, Static69.aClass24_500);
		} else if (arg0 == -1) {
			Static167.method2843(Static69.aClass24_484, Static177.aClass24_1135, Static9.aClass24_75);
		} else if (arg0 == 3) {
			Static167.method2843(Static69.aClass24_490, Static41.aClass24_364, Static69.aClass24_507);
		} else if (arg0 == 4) {
			Static167.method2843(Static69.aClass24_487, Static48.aClass24_301, Static112.aClass24_734);
		} else if (arg0 == 5) {
			Static167.method2843(Static69.aClass24_492, Static74.aClass24_548, Static170.aClass24_1087);
		} else if (arg0 == 6) {
			Static167.method2843(Static69.aClass24_497, Static18.aClass24_1117, Static177.aClass24_1141);
		} else if (arg0 == 7) {
			Static167.method2843(Static69.aClass24_489, Static18.aClass24_1118, Static72.aClass24_528);
		} else if (arg0 == 8) {
			Static167.method2843(Static69.aClass24_509, Static102.aClass24_682, Static185.aClass24_1197);
		} else if (arg0 == 9) {
			Static167.method2843(Static69.aClass24_501, Static125.aClass24_830, Static103.aClass24_691);
		} else if (arg0 == 10) {
			Static167.method2843(Static69.aClass24_515, Static136.aClass24_914, Static185.aClass24_1194);
		} else if (arg0 == 11) {
			Static167.method2843(Static69.aClass24_483, Static190.aClass24_1221, Static178.aClass24_1149);
		} else if (arg0 == 12) {
			Static167.method2843(Static69.aClass24_498, Static42.aClass24_266, Static101.aClass24_674);
		} else if (arg0 == 13) {
			Static167.method2843(Static69.aClass24_511, Static177.aClass24_1133, Static58.aClass24_389);
		} else if (arg0 == 14) {
			Static167.method2843(Static69.aClass24_513, Static173.aClass24_1107, Static156.aClass24_1007);
		} else if (arg0 == 16) {
			Static167.method2843(Static69.aClass24_503, Static137.aClass24_923, Static29.aClass24_195);
		} else if (arg0 == 17) {
			Static167.method2843(Static69.aClass24_512, Static98.aClass24_658, Static132.aClass24_888);
		} else if (arg0 == 18) {
			Static167.method2843(Static69.aClass24_518, Static40.aClass24_253, Static60.aClass24_1059);
		} else if (arg0 == 19) {
			Static167.method2843(Static18.aClass24_1116, Static70.aClass24_945, Static212.aClass24_1330);
		} else if (arg0 == 20) {
			Static167.method2843(Static69.aClass24_514, Static177.aClass24_1137, Static144.aClass24_953);
		} else if (arg0 == 22) {
			Static167.method2843(Static69.aClass24_506, Static162.aClass24_1048, Static147.aClass24_970);
		} else if (arg0 == 23) {
			Static167.method2843(Static69.aClass24_486, Static173.aClass24_1103, Static174.aClass24_1119);
		} else if (arg0 == 24) {
			Static167.method2843(Static69.aClass24_493, Static186.aClass24_207, Static208.aClass24_1308);
		} else if (arg0 == 25) {
			Static167.method2843(Static69.aClass24_505, Static177.aClass24_1132, Static44.aClass24_274);
		} else if (arg0 == 26) {
			Static167.method2843(Static69.aClass24_517, Static16.aClass24_120, Static45.aClass24_289);
		} else if (arg0 == 27) {
			Static167.method2843(Static69.aClass24_499, Static191.aClass24_1225, Static69.aClass24_521);
		} else {
			Static167.method2843(Static69.aClass24_519, Static177.aClass24_1134, Static103.aClass24_692);
		}
		Static57.method1099(10);
	}
}
