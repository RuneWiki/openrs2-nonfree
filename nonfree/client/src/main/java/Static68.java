import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!nb", name = "V", descriptor = "I")
	public static int anInt1994 = 0;

	@OriginalMember(owner = "client!nb", name = "X", descriptor = "I")
	public static int anInt1995 = 500;

	@OriginalMember(owner = "client!nb", name = "gb", descriptor = "Lclient!ke;")
	private static Class39 aClass39_887 = Static2.method66("M");

	@OriginalMember(owner = "client!nb", name = "Z", descriptor = "Lclient!ke;")
	public static Class39 aClass39_885 = aClass39_887;

	@OriginalMember(owner = "client!nb", name = "pb", descriptor = "Lclient!ke;")
	private static Class39 aClass39_890 = Static2.method66("Please wait )2 attempting to reestablish");

	@OriginalMember(owner = "client!nb", name = "ab", descriptor = "Lclient!ke;")
	public static Class39 aClass39_886 = aClass39_890;

	@OriginalMember(owner = "client!nb", name = "cb", descriptor = "Z")
	public static boolean aBoolean97 = false;

	@OriginalMember(owner = "client!nb", name = "nb", descriptor = "Lclient!ke;")
	private static Class39 aClass39_889 = Static2.method66("Choose Option");

	@OriginalMember(owner = "client!nb", name = "hb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_888 = aClass39_889;

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "(I)V")
	public static void method1429() {
		aClass39_887 = null;
		aClass39_885 = null;
		aClass39_889 = null;
		aClass39_886 = null;
		aClass39_890 = null;
		aClass39_888 = null;
	}

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "(I)V")
	public static void method1430() {
		Static85.aClass54_24.method1635();
	}

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "(B)[Lclient!uc;")
	public static Class2_Sub1_Sub4_Sub3[] method1432() {
		@Pc(12) Class2_Sub1_Sub4_Sub3[] local12 = new Class2_Sub1_Sub4_Sub3[Static92.anInt2392];
		for (@Pc(14) int local14 = 0; local14 < Static92.anInt2392; local14++) {
			@Pc(23) Class2_Sub1_Sub4_Sub3 local23 = local12[local14] = new Class2_Sub1_Sub4_Sub3();
			local23.anInt2731 = Static76.anInt2102;
			local23.anInt2730 = Static56.anInt1612;
			local23.anInt2728 = Static83.anIntArray297[local14];
			local23.anInt2732 = Static10.anIntArray34[local14];
			local23.anInt2733 = Static95.anIntArray314[local14];
			local23.anInt2729 = Static30.anIntArray94[local14];
			local23.anIntArray331 = Static46.anIntArray179;
			local23.aByteArray24 = Static51.aByteArrayArray10[local14];
		}
		Static89.method1677();
		return local12;
	}

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "(B)V")
	public static void method1435() {
		Static51.aClass2_Sub5_Sub1_4.method1299();
		@Pc(11) int local11 = Static51.aClass2_Sub5_Sub1_4.method1309(1);
		if (local11 == 0) {
			return;
		}
		@Pc(22) int local22 = Static51.aClass2_Sub5_Sub1_4.method1309(2);
		if (local22 == 0) {
			Static39.anIntArray167[Static60.anInt1626++] = 2047;
			return;
		}
		@Pc(51) int local51;
		@Pc(61) int local61;
		if (local22 == 1) {
			local51 = Static51.aClass2_Sub5_Sub1_4.method1309(3);
			Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.method2070(local51, false);
			local61 = Static51.aClass2_Sub5_Sub1_4.method1309(1);
			if (local61 == 1) {
				Static39.anIntArray167[Static60.anInt1626++] = 2047;
			}
			return;
		}
		@Pc(103) int local103;
		if (local22 == 2) {
			local51 = Static51.aClass2_Sub5_Sub1_4.method1309(3);
			Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.method2070(local51, true);
			local61 = Static51.aClass2_Sub5_Sub1_4.method1309(3);
			Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.method2070(local61, true);
			local103 = Static51.aClass2_Sub5_Sub1_4.method1309(1);
			if (local103 == 1) {
				Static39.anIntArray167[Static60.anInt1626++] = 2047;
			}
		} else if (local22 == 3) {
			local51 = Static51.aClass2_Sub5_Sub1_4.method1309(1);
			if (local51 == 1) {
				Static39.anIntArray167[Static60.anInt1626++] = 2047;
			}
			Static18.anInt560 = Static51.aClass2_Sub5_Sub1_4.method1309(2);
			local61 = Static51.aClass2_Sub5_Sub1_4.method1309(7);
			local103 = Static51.aClass2_Sub5_Sub1_4.method1309(1);
			@Pc(158) int local158 = Static51.aClass2_Sub5_Sub1_4.method1309(7);
			Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.method2066(local103 == 1, local61, local158);
		}
	}
}
