import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!s", name = "Y", descriptor = "[Lclient!rf;")
	public static Class4_Sub1_Sub7_Sub2[] aClass4_Sub1_Sub7_Sub2Array11;

	@OriginalMember(owner = "client!s", name = "S", descriptor = "I")
	public static int anInt3441 = -1;

	@OriginalMember(owner = "client!s", name = "db", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1272 = Static177.method3050("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

	@OriginalMember(owner = "client!s", name = "T", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1268 = aClass46_1272;

	@OriginalMember(owner = "client!s", name = "V", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1269 = Static177.method3050("Fertigkeit)2");

	@OriginalMember(owner = "client!s", name = "ab", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1270 = Static177.method3050("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!s", name = "bb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1271 = Static177.method3050("au");

	@OriginalMember(owner = "client!s", name = "fb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1273 = Static177.method3050(")1j");

	@OriginalMember(owner = "client!s", name = "gb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1274 = Static177.method3050("floorshadows");

	@OriginalMember(owner = "client!s", name = "ib", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1275 = Static177.method3050("<)4col> x");

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(II)Lclient!md;")
	public static Class4_Sub1_Sub14 method2590(@OriginalArg(1) int arg0) {
		@Pc(12) Class4_Sub1_Sub14 local12 = (Class4_Sub1_Sub14) Static107.aClass66_37.method2225((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static13.aClass62_Sub1_12.method2878(arg0, 0);
		if (local22 == null) {
			return null;
		}
		local12 = new Class4_Sub1_Sub14();
		@Pc(35) Class4_Sub11 local35 = new Class4_Sub11(local22);
		local35.anInt1597 = local35.aByteArray19.length - 2;
		@Pc(46) int local46 = local35.method1252();
		@Pc(61) int local61 = local35.aByteArray19.length - local46 - 12 - 2;
		local35.anInt1597 = local61;
		@Pc(68) int local68 = local35.method1263();
		local12.anInt2668 = local35.method1252();
		local12.anInt2671 = local35.method1252();
		local12.anInt2670 = local35.method1252();
		local12.anInt2667 = local35.method1252();
		@Pc(92) int local92 = local35.method1253();
		@Pc(103) int local103;
		@Pc(109) int local109;
		if (local92 > 0) {
			local12.aClass20Array1 = new Class20[local92];
			for (local103 = 0; local103 < local92; local103++) {
				local109 = local35.method1252();
				@Pc(116) Class20 local116 = new Class20(Static117.method2132(local109));
				local12.aClass20Array1[local103] = local116;
				while (local109-- > 0) {
					@Pc(127) int local127 = local35.method1263();
					@Pc(131) int local131 = local35.method1263();
					local116.method499((long) local127, new Class4_Sub18(local131));
				}
			}
		}
		local35.anInt1597 = 0;
		local103 = 0;
		local12.aClass46_984 = local35.method1246();
		local12.aClass46Array20 = new Class46[local68];
		local12.anIntArray250 = new int[local68];
		local12.anIntArray249 = new int[local68];
		while (local61 > local35.anInt1597) {
			local109 = local35.method1252();
			if (local109 == 3) {
				local12.aClass46Array20[local103] = local35.method1247();
			} else if (local109 >= 100 || local109 == 21 || local109 == 38 || local109 == 39) {
				local12.anIntArray249[local103] = local35.method1253();
			} else {
				local12.anIntArray249[local103] = local35.method1263();
			}
			local12.anIntArray250[local103++] = local109;
		}
		Static107.aClass66_37.method2222(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!s", name = "f", descriptor = "(I)V")
	public static void method2591() {
		Static186.aClass66_50.method2218();
		Static149.aClass66_45.method2218();
		Static163.aClass66_46.method2218();
		Static91.aClass66_36.method2218();
		Static147.aClass66_11.method2218();
	}
}
