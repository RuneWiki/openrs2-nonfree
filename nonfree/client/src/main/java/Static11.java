import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!b", name = "ob", descriptor = "Lclient!ff;")
	public static Class24 aClass24_1;

	@OriginalMember(owner = "client!b", name = "gb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_364 = Static107.method1838("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!b", name = "kb", descriptor = "Lclient!gg;")
	private static Class28 aClass28_365 = Static107.method1838("Loading )2 please wait)3");

	@OriginalMember(owner = "client!b", name = "lb", descriptor = "[Z")
	public static boolean[] aBooleanArray7 = new boolean[100];

	@OriginalMember(owner = "client!b", name = "mb", descriptor = "[Lclient!gg;")
	public static Class28[] aClass28Array7 = new Class28[1000];

	@OriginalMember(owner = "client!b", name = "qb", descriptor = "I")
	public static final int anInt532 = 0;

	@OriginalMember(owner = "client!b", name = "tb", descriptor = "I")
	public static int anInt535 = 0;

	@OriginalMember(owner = "client!b", name = "ub", descriptor = "Lclient!gg;")
	public static Class28 aClass28_366 = Static107.method1838("m");

	@OriginalMember(owner = "client!b", name = "vb", descriptor = "[J")
	public static long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!b", name = "xb", descriptor = "I")
	public static int anInt537 = 0;

	@OriginalMember(owner = "client!b", name = "yb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_367 = aClass28_365;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IILclient!dg;III)V")
	public static void method347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub4_Sub6 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class2_Sub6 local7 = new Class2_Sub6();
		local7.anInt621 = arg4 * 128;
		local7.anIntArray40 = arg2.anIntArray81;
		local7.anInt632 = arg2.anInt1038;
		@Pc(23) int local23 = arg2.anInt1050;
		local7.anInt626 = arg2.anInt1020;
		local7.anInt629 = arg1 * 128;
		local7.anInt622 = arg2.anInt1042 * 128;
		local7.anInt628 = arg3;
		local7.anInt627 = arg2.anInt1034;
		@Pc(48) int local48 = arg2.anInt1037;
		if (arg0 == 1 || arg0 == 3) {
			local48 = arg2.anInt1050;
			local23 = arg2.anInt1037;
		}
		local7.anInt625 = (arg4 + local48) * 128;
		local7.anInt623 = (local23 + arg1) * 128;
		if (arg2.anIntArray82 != null) {
			local7.aClass2_Sub4_Sub6_1 = arg2;
			local7.method403();
		}
		Static80.aClass65_6.method2116(local7);
		if (local7.anIntArray40 != null) {
			local7.anInt631 = (int) (Math.random() * (double) (local7.anInt632 - local7.anInt627)) + local7.anInt627;
		}
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(B)V")
	public static void method348() {
		aLongArray3 = null;
		aClass28Array7 = null;
		aClass28_366 = null;
		aClass28_364 = null;
		aBooleanArray7 = null;
		aClass24_1 = null;
		aClass28_365 = null;
		aClass28_367 = null;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIBI)I")
	public static int method350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg0;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg0;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!jc;IILclient!jc;B)Lclient!th;")
	public static Class2_Sub4_Sub3_Sub2_Sub1 method351(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class40 arg3) {
		return Static108.method1851(arg0, arg2, arg1) ? Static129.method2084(arg3.method1771(arg2, arg1)) : null;
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V")
	public static void method352() {
		Static84.anInt2126 = 0;
		Static83.anInt2114 = 0;
		Static100.method1767();
		Static163.method2526();
		Static123.method2009();
		@Pc(25) int local25;
		for (@Pc(19) int local19 = 0; local19 < Static84.anInt2126; local19++) {
			local25 = Static115.anIntArray262[local19];
			if (Static55.aClass2_Sub4_Sub1_Sub1_Sub1Array1[local25].anInt1650 != Static156.anInt3491) {
				Static55.aClass2_Sub4_Sub1_Sub1_Sub1Array1[local25].aClass2_Sub4_Sub4_1 = null;
				Static55.aClass2_Sub4_Sub1_Sub1_Sub1Array1[local25] = null;
			}
		}
		if (Static151.aClass2_Sub2_Sub1_3.anInt2385 != Static103.anInt2571) {
			throw new RuntimeException("gnp1 pos:" + Static151.aClass2_Sub2_Sub1_3.anInt2385 + " psize:" + Static103.anInt2571);
		}
		for (local25 = 0; local25 < Static29.anInt884; local25++) {
			if (Static55.aClass2_Sub4_Sub1_Sub1_Sub1Array1[Static129.anIntArray274[local25]] == null) {
				throw new RuntimeException("gnp2 pos:" + local25 + " size:" + Static29.anInt884);
			}
		}
	}
}
