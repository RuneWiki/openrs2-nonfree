import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!rd", name = "A", descriptor = "[Lclient!c;")
	public static Class1_Sub3_Sub4_Sub1[] aClass1_Sub3_Sub4_Sub1Array2 = new Class1_Sub3_Sub4_Sub1[4];

	@OriginalMember(owner = "client!rd", name = "D", descriptor = "Lclient!af;")
	public static Class5 aClass5_1336 = Static45.method1937(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!rd", name = "Db", descriptor = "Lclient!af;")
	private static Class5 aClass5_1343 = Static45.method1937("M");

	@OriginalMember(owner = "client!rd", name = "H", descriptor = "Lclient!af;")
	public static Class5 aClass5_1337 = aClass5_1343;

	@OriginalMember(owner = "client!rd", name = "T", descriptor = "Lclient!af;")
	private static Class5 aClass5_1339 = Static45.method1937("Take");

	@OriginalMember(owner = "client!rd", name = "N", descriptor = "Lclient!af;")
	public static Class5 aClass5_1338 = aClass5_1339;

	@OriginalMember(owner = "client!rd", name = "Y", descriptor = "Lclient!af;")
	private static Class5 aClass5_1340 = Static45.method1937("Hidden");

	@OriginalMember(owner = "client!rd", name = "fb", descriptor = "Lclient!af;")
	public static Class5 aClass5_1341 = aClass5_1343;

	@OriginalMember(owner = "client!rd", name = "ob", descriptor = "Lclient!af;")
	public static Class5 aClass5_1342 = Static45.method1937("(U0a )2 via: ");

	@OriginalMember(owner = "client!rd", name = "ub", descriptor = "I")
	public static int anInt2953 = 2;

	@OriginalMember(owner = "client!rd", name = "Fb", descriptor = "Lclient!af;")
	private static Class5 aClass5_1344 = Static45.method1937("Bad session id)3");

	@OriginalMember(owner = "client!rd", name = "Ob", descriptor = "Lclient!af;")
	public static Class5 aClass5_1345 = aClass5_1344;

	@OriginalMember(owner = "client!rd", name = "Qb", descriptor = "Lclient!af;")
	public static Class5 aClass5_1346 = Static45.method1937("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!rd", name = "Sb", descriptor = "Lclient!af;")
	public static Class5 aClass5_1347 = aClass5_1340;

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V")
	public static void method2057() {
		aClass5_1340 = null;
		aClass5_1337 = null;
		aClass5_1344 = null;
		aClass5_1341 = null;
		aClass5_1346 = null;
		aClass5_1343 = null;
		aClass5_1336 = null;
		aClass5_1338 = null;
		aClass5_1347 = null;
		aClass5_1339 = null;
		aClass1_Sub3_Sub4_Sub1Array2 = null;
		aClass5_1342 = null;
		aClass5_1345 = null;
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)V")
	public static void method2063() {
		Static117.aClass28_86.method792();
		Static54.aClass28_35.method792();
		Static2.aClass28_5.method792();
		Static21.aClass28_19.method792();
	}

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "(II)Lclient!bc;")
	public static Class1_Sub3_Sub3 method2083(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub3_Sub3 local12 = (Class1_Sub3_Sub3) Static109.aClass28_71.method796((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static10.aClass41_Sub1_1.method1710(arg0, 0);
		if (local22 == null) {
			return null;
		}
		local12 = new Class1_Sub3_Sub3();
		@Pc(35) Class1_Sub20 local35 = new Class1_Sub20(local22);
		@Pc(37) int local37 = 0;
		local35.anInt2951 = local35.aByteArray36.length - 12;
		@Pc(48) int local48 = local35.method2094();
		local12.anInt308 = local35.method2087();
		local12.anInt314 = local35.method2087();
		local12.anInt312 = local35.method2087();
		local12.anInt307 = local35.method2087();
		local35.anInt2951 = 0;
		local12.aClass5_163 = local35.method2085();
		local12.anIntArray41 = new int[local48];
		local12.aClass5Array3 = new Class5[local48];
		local12.anIntArray42 = new int[local48];
		while (local35.anInt2951 < local35.aByteArray36.length - 12) {
			@Pc(94) int local94 = local35.method2087();
			if (local94 == 3) {
				local12.aClass5Array3[local37] = local35.method2101();
			} else if (local94 >= 100 || local94 == 21 || local94 == 38 || local94 == 39) {
				local12.anIntArray41[local37] = local35.method2053();
			} else {
				local12.anIntArray41[local37] = local35.method2094();
			}
			local12.anIntArray42[local37++] = local94;
		}
		Static109.aClass28_71.method789(local12, (long) arg0);
		return local12;
	}
}
