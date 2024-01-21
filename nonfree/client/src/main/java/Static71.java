import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!n", name = "db", descriptor = "I")
	public static int anInt1610;

	@OriginalMember(owner = "client!n", name = "eb", descriptor = "I")
	public static int anInt1611;

	@OriginalMember(owner = "client!n", name = "hb", descriptor = "Lclient!jd;")
	public static Class37 aClass37_25;

	@OriginalMember(owner = "client!n", name = "nb", descriptor = "Lclient!pc;")
	public static Class58 aClass58_4;

	@OriginalMember(owner = "client!n", name = "ab", descriptor = "Lclient!dd;")
	public static Class19 aClass19_59 = new Class19(64);

	@OriginalMember(owner = "client!n", name = "cb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1015 = Static69.method1153("Classic");

	@OriginalMember(owner = "client!n", name = "ib", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1016 = Static69.method1153("Name eingeben:");

	@OriginalMember(owner = "client!n", name = "mb", descriptor = "Lclient!uc;")
	public static Class1_Sub6_Sub1 aClass1_Sub6_Sub1_3 = new Class1_Sub6_Sub1(5000);

	@OriginalMember(owner = "client!n", name = "ob", descriptor = "I")
	public static int anInt1617 = -1;

	@OriginalMember(owner = "client!n", name = "pb", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1017 = Static69.method1153("Could not complete login)3");

	@OriginalMember(owner = "client!n", name = "qb", descriptor = "I")
	public static int anInt1618 = 0;

	@OriginalMember(owner = "client!n", name = "rb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1018 = Static69.method1153("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!n", name = "sb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1019 = aClass64_1017;

	@OriginalMember(owner = "client!n", name = "tb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1020 = Static69.method1153("auf der Hautpseite)3");

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!rd;Lclient!rd;ZI)V")
	public static void method1178(@OriginalArg(0) Class64 arg0, @OriginalArg(1) Class64 arg1, @OriginalArg(3) int arg2) {
		if (Static101.anInt2272 == -1) {
			Static116.aBoolean166 = true;
		}
		if (arg2 == 0 && Static6.anInt322 != -1) {
			Static17.anInt576 = 0;
			Static48.aClass64_1637 = arg1;
		}
		for (@Pc(26) int local26 = 99; local26 > 0; local26--) {
			Static22.anIntArray85[local26] = Static22.anIntArray85[local26 - 1];
			Static22.aClass64Array8[local26] = Static22.aClass64Array8[local26 - 1];
			Static120.aClass64Array19[local26] = Static120.aClass64Array19[local26 - 1];
		}
		Static22.anIntArray85[0] = arg2;
		Static22.aClass64Array8[0] = arg0;
		Static120.aClass64Array19[0] = arg1;
	}

	@OriginalMember(owner = "client!n", name = "f", descriptor = "(I)V")
	public static void method1180() {
		aClass64_1018 = null;
		aClass64_1020 = null;
		aClass64_1015 = null;
		aClass19_59 = null;
		aClass64_1016 = null;
		aClass58_4 = null;
		aClass1_Sub6_Sub1_3 = null;
		aClass37_25 = null;
		aClass64_1017 = null;
		aClass64_1019 = null;
	}

	@OriginalMember(owner = "client!n", name = "g", descriptor = "(I)V")
	public static void method1181() {
		if (Static23.anInt702 > 0) {
			Static14.method293();
		} else {
			Static10.method258(40);
			Static95.aClass27_4 = Static14.aClass27_1;
			Static14.aClass27_1 = null;
		}
	}
}
