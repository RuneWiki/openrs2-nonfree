import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!sc", name = "N", descriptor = "I")
	public static int anInt3631;

	@OriginalMember(owner = "client!sc", name = "O", descriptor = "Lclient!bc;")
	public static Class1 aClass1_28;

	@OriginalMember(owner = "client!sc", name = "X", descriptor = "Lclient!ce;")
	public static Class15 aClass15_1;

	@OriginalMember(owner = "client!sc", name = "hb", descriptor = "I")
	public static int anInt3644;

	@OriginalMember(owner = "client!sc", name = "ib", descriptor = "Lclient!a;")
	public static Class1_Sub1 aClass1_Sub1_26;

	@OriginalMember(owner = "client!sc", name = "M", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1402 = Static120.method1824(" )2> ");

	@OriginalMember(owner = "client!sc", name = "V", descriptor = "Lclient!af;")
	public static final Class5 aClass5_50 = new Class5(64);

	@OriginalMember(owner = "client!sc", name = "Y", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1403 = Static120.method1824("Too many connections from your address)3");

	@OriginalMember(owner = "client!sc", name = "Z", descriptor = "I")
	public static int anInt3639 = 0;

	@OriginalMember(owner = "client!sc", name = "cb", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1404 = aClass80_1403;

	@OriginalMember(owner = "client!sc", name = "db", descriptor = "I")
	public static int anInt3642 = 1;

	@OriginalMember(owner = "client!sc", name = "eb", descriptor = "I")
	public static int anInt3643 = -2;

	@OriginalMember(owner = "client!sc", name = "fb", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1405 = Static120.method1824("Konfig geladen)3");

	@OriginalMember(owner = "client!sc", name = "gb", descriptor = "Z")
	public static boolean aBoolean147 = false;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(III)V")
	public static void method2625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static86.aBoolean69 = true;
		Static20.anInt501 = arg0;
		Static2.anInt82 = arg1;
		Static51.anInt1132 = arg2;
		Static103.anInt2178 = -1;
		Static125.anInt2695 = -1;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIII)V")
	public static void method2626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 128 || arg0 < 128 || arg2 > 13056 || arg0 > 13056) {
			Static13.anInt316 = -1;
			Static168.anInt3762 = -1;
			return;
		}
		@Pc(34) int local34 = Static50.method742(Static153.anInt673, arg0, arg2) - arg1;
		@Pc(38) int local38 = Class3_Sub1_Sub4_Sub2.anIntArray188[Static165.anInt3680];
		@Pc(42) int local42 = Class3_Sub1_Sub4_Sub2.anIntArray190[Static165.anInt3680];
		@Pc(46) int local46 = local34 - Static149.anInt3350;
		@Pc(50) int local50 = arg2 - Static56.anInt1216;
		@Pc(54) int local54 = Class3_Sub1_Sub4_Sub2.anIntArray190[Static163.anInt3648];
		@Pc(58) int local58 = arg0 - Static86.anInt1786;
		@Pc(62) int local62 = Class3_Sub1_Sub4_Sub2.anIntArray188[Static163.anInt3648];
		@Pc(72) int local72 = local50 * local54 + local58 * local62 >> 16;
		@Pc(83) int local83 = local54 * local58 - local62 * local50 >> 16;
		@Pc(85) int local85 = local72;
		@Pc(95) int local95 = local42 * local46 - local83 * local38 >> 16;
		@Pc(109) int local109 = local38 * local46 + local83 * local42 >> 16;
		if (local109 >= 50) {
			Static13.anInt316 = (local95 << 9) / local109 + 167;
			Static168.anInt3762 = (local85 << 9) / local109 + 256;
		} else {
			Static13.anInt316 = -1;
			Static168.anInt3762 = -1;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZI)Lclient!ac;")
	public static Class3_Sub1_Sub1 method2627(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub1_Sub1 local10 = (Class3_Sub1_Sub1) Static94.aClass5_28.method139((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static18.aClass1_2.method60(Static190.method3093(arg0), Static133.method2041(arg0));
		local10 = new Class3_Sub1_Sub1();
		local10.anInt167 = arg0;
		if (local24 != null) {
			local10.method115(new Class3_Sub17(local24));
		}
		local10.method118();
		if (local10.aBoolean16) {
			local10.anInt134 = 0;
			local10.aBoolean14 = false;
		}
		Static94.aClass5_28.method145(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(JI)V")
	public static void method2628(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < Static133.anInt2865; local20++) {
			if (arg0 == Static47.aLongArray4[local20]) {
				Static133.anInt2865--;
				for (@Pc(38) int local38 = local20; local38 < Static133.anInt2865; local38++) {
					Static47.aLongArray4[local38] = Static47.aLongArray4[local38 + 1];
					Static170.aClass80Array28[local38] = Static170.aClass80Array28[local38 + 1];
				}
				Static168.anInt3770 = Static31.anInt747;
				Static146.aClass3_Sub17_Sub1_3.method2146(47);
				Static146.aClass3_Sub17_Sub1_3.method2112(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V")
	public static void method2630() {
		if (Static31.aClass78_1 != null) {
			Static31.aClass78_1.method2417();
			Static31.aClass78_1 = null;
		}
		Static77.method1272();
		Static111.method1722();
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Static32.aClass82Array11[local17].method2513();
		}
		System.gc();
		Static128.method1942();
		Static124.aBoolean108 = false;
		Static151.anInt3396 = -1;
		Static36.method573();
		Static132.method2019(10);
	}
}
