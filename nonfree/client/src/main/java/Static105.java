import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
	public static int anInt2845;

	@OriginalMember(owner = "client!sd", name = "v", descriptor = "I")
	public static int anInt2856;

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "Lclient!he;")
	public static Class26 aClass26_1533 = Static6.method100("rot:");

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "Lclient!he;")
	public static Class26 aClass26_1534 = Static6.method100("(U3");

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "Lclient!ec;")
	public static Class17 aClass17_19 = new Class17(512);

	@OriginalMember(owner = "client!sd", name = "y", descriptor = "Lclient!he;")
	private static Class26 aClass26_1538 = Static6.method100("yellow:");

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "Lclient!he;")
	public static Class26 aClass26_1535 = aClass26_1538;

	@OriginalMember(owner = "client!sd", name = "o", descriptor = "Lclient!he;")
	public static Class26 aClass26_1536 = aClass26_1538;

	@OriginalMember(owner = "client!sd", name = "q", descriptor = "Lclient!he;")
	public static Class26 aClass26_1537 = Static6.method100("<img=1>");

	@OriginalMember(owner = "client!sd", name = "z", descriptor = "I")
	public static int anInt2858 = -1;

	@OriginalMember(owner = "client!sd", name = "B", descriptor = "[J")
	public static long[] aLongArray8 = new long[200];

	@OriginalMember(owner = "client!sd", name = "F", descriptor = "Lclient!he;")
	private static Class26 aClass26_1540 = Static6.method100("Please enter your password)3");

	@OriginalMember(owner = "client!sd", name = "D", descriptor = "Lclient!he;")
	public static Class26 aClass26_1539 = aClass26_1540;

	@OriginalMember(owner = "client!sd", name = "E", descriptor = "I")
	public static int anInt2860 = 0;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "([BI)V")
	public static void method1947(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class3_Sub11 local10 = new Class3_Sub11(arg0);
		local10.anInt1562 = arg0.length - 2;
		Static78.anInt2101 = local10.method974();
		Static51.anIntArray157 = new int[Static78.anInt2101];
		Static57.anIntArray169 = new int[Static78.anInt2101];
		Static46.anIntArray148 = new int[Static78.anInt2101];
		Static117.aByteArrayArray19 = new byte[Static78.anInt2101][];
		Static58.anIntArray173 = new int[Static78.anInt2101];
		local10.anInt1562 = arg0.length - Static78.anInt2101 * 8 - 7;
		Static88.anInt2448 = local10.method974();
		Static53.anInt1619 = local10.method974();
		@Pc(70) int local70 = (local10.method981() & 0xFF) + 1;
		for (@Pc(72) int local72 = 0; local72 < Static78.anInt2101; local72++) {
			Static57.anIntArray169[local72] = local10.method974();
		}
		for (@Pc(86) int local86 = 0; local86 < Static78.anInt2101; local86++) {
			Static58.anIntArray173[local86] = local10.method974();
		}
		for (@Pc(100) int local100 = 0; local100 < Static78.anInt2101; local100++) {
			Static51.anIntArray157[local100] = local10.method974();
		}
		for (@Pc(114) int local114 = 0; local114 < Static78.anInt2101; local114++) {
			Static46.anIntArray148[local114] = local10.method974();
		}
		local10.anInt1562 = arg0.length - (local70 - 1) * 3 - Static78.anInt2101 * 8 - 7;
		Static110.anIntArray351 = new int[local70];
		for (@Pc(152) int local152 = 1; local152 < local70; local152++) {
			Static110.anIntArray351[local152] = local10.method1013();
			if (Static110.anIntArray351[local152] == 0) {
				Static110.anIntArray351[local152] = 1;
			}
		}
		local10.anInt1562 = 0;
		for (@Pc(181) int local181 = 0; local181 < Static78.anInt2101; local181++) {
			@Pc(187) int local187 = Static51.anIntArray157[local181];
			@Pc(191) int local191 = Static46.anIntArray148[local181];
			@Pc(195) int local195 = local191 * local187;
			@Pc(198) byte[] local198 = new byte[local195];
			Static117.aByteArrayArray19[local181] = local198;
			@Pc(206) int local206 = local10.method981();
			@Pc(210) int local210;
			if (local206 == 0) {
				for (local210 = 0; local210 < local195; local210++) {
					local198[local210] = local10.method994();
				}
			} else if (local206 == 1) {
				for (local210 = 0; local210 < local187; local210++) {
					for (@Pc(235) int local235 = 0; local235 < local191; local235++) {
						local198[local187 * local235 + local210] = local10.method994();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)Z")
	public static boolean method1948() {
		try {
			if (Static70.anInt1540 == 2) {
				if (Static3.aClass3_Sub19_1 == null) {
					Static3.aClass3_Sub19_1 = Static138.method1786(Static110.aClass16_136, Static108.anInt2897, Static40.anInt1261);
					if (Static3.aClass3_Sub19_1 == null) {
						return false;
					}
				}
				if (Static33.aClass81_1 == null) {
					Static33.aClass81_1 = new Class81(Static101.aClass16_125, Static115.aClass16_139);
				}
				if (Static1.aClass3_Sub3_Sub1_1.method223(Static33.aClass81_1, Static3.aClass3_Sub19_1, Static35.aClass16_53)) {
					Static1.aClass3_Sub3_Sub1_1.method227();
					Static1.aClass3_Sub3_Sub1_1.method232(Static63.anInt1933);
					Static1.aClass3_Sub3_Sub1_1.method229(Static3.aClass3_Sub19_1, Static42.aBoolean71);
					Static3.aClass3_Sub19_1 = null;
					Static110.aClass16_136 = null;
					Static33.aClass81_1 = null;
					Static70.anInt1540 = 0;
					return true;
				}
			}
		} catch (@Pc(65) Exception local65) {
			local65.printStackTrace();
			Static1.aClass3_Sub3_Sub1_1.method230();
			Static33.aClass81_1 = null;
			Static110.aClass16_136 = null;
			Static70.anInt1540 = 0;
			Static3.aClass3_Sub19_1 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
	public static void method1949() {
		aClass26_1539 = null;
		aLongArray8 = null;
		aClass26_1535 = null;
		aClass26_1536 = null;
		aClass26_1533 = null;
		aClass26_1534 = null;
		aClass26_1537 = null;
		aClass26_1538 = null;
		aClass17_19 = null;
		aClass26_1540 = null;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(B)V")
	public static void method1950() {
		@Pc(1) Object local1 = Static18.anObject1;
		synchronized (Static18.anObject1) {
			if (Static16.anInt419 == 0) {
				Static67.aClass75_4.method2174(new Class49(), 5);
			}
			Static16.anInt419 = 600;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IBLclient!d;I)V")
	public static void method1951(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub1_Sub5_Sub1_Sub1 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg1.anInt2738 && arg2 != -1) {
			@Pc(68) int local68 = Static111.method2009(arg2).anInt3102;
			if (local68 == 1) {
				arg1.anInt2737 = 0;
				arg1.anInt2708 = 0;
				arg1.anInt2695 = arg0;
				arg1.anInt2704 = 0;
			}
			if (local68 == 2) {
				arg1.anInt2737 = 0;
			}
		} else if (arg2 == -1 || arg1.anInt2738 == -1 || Static111.method2009(arg2).anInt3113 >= Static111.method2009(arg1.anInt2738).anInt3113) {
			arg1.anInt2737 = 0;
			arg1.anInt2738 = arg2;
			arg1.anInt2708 = 0;
			arg1.anInt2704 = 0;
			arg1.anInt2706 = arg1.anInt2699;
			arg1.anInt2695 = arg0;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(III[Lclient!he;)Lclient!he;")
	public static Class26 method1952(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class26[] arg2) {
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < arg0; local14++) {
			if (arg2[arg1 + local14] == null) {
				arg2[local14 + arg1] = Static86.aClass26_1195;
			}
			local12 += arg2[arg1 + local14].anInt1345;
		}
		@Pc(49) byte[] local49 = new byte[local12];
		@Pc(51) int local51 = 0;
		@Pc(61) Class26 local61;
		for (@Pc(53) int local53 = 0; local53 < arg0; local53++) {
			local61 = arg2[local53 + arg1];
			Static135.method733(local61.aByteArray7, 0, local49, local51, local61.anInt1345);
			local51 += local61.anInt1345;
		}
		local61 = new Class26();
		local61.anInt1345 = local12;
		local61.aByteArray7 = local49;
		return local61;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!eb;I)V")
	public static void method1953(@OriginalArg(0) int arg0, @OriginalArg(1) Class16_Sub1 arg1) {
		if (Static100.aClass3_Sub11_36 == null) {
			Static17.method272(0, 255, null, (byte) 0, 255, true);
			Static15.aClass16_Sub1Array1[arg0] = arg1;
		} else {
			Static100.aClass3_Sub11_36.anInt1562 = arg0 * 8 + 5;
			@Pc(16) int local16 = Static100.aClass3_Sub11_36.method984();
			@Pc(20) int local20 = Static100.aClass3_Sub11_36.method984();
			arg1.method580(local20, local16);
		}
	}
}
