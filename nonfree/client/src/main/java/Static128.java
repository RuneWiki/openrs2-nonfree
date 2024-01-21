import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "Lclient!ai;")
	private static Class6 aClass6_853 = Static38.method685("Please wait)3)3)3");

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "Lclient!ai;")
	public static Class6 aClass6_854 = Static38.method685("Okay");

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
	public static volatile int anInt2950 = 0;

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "Lclient!ai;")
	public static Class6 aClass6_855 = aClass6_853;

	@OriginalMember(owner = "client!pe", name = "n", descriptor = "Lclient!ai;")
	public static Class6 aClass6_856 = null;

	@OriginalMember(owner = "client!pe", name = "o", descriptor = "[J")
	public static long[] aLongArray5 = new long[100];

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!c;Lclient!ai;Lclient!ai;I)Lclient!ta;")
	public static Class2_Sub3_Sub2_Sub3 method1968(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class6 arg1, @OriginalArg(2) Class6 arg2) {
		@Pc(17) int local17 = arg0.method1602(arg2);
		@Pc(23) int local23 = arg0.method1600(local17, arg1);
		return Static130.method2012(local23, arg0, local17);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
	public static void method1969() {
		aClass6_855 = null;
		aClass6_853 = null;
		aClass6_856 = null;
		aClass6_854 = null;
		aLongArray5 = null;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)V")
	public static void method1972(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static113.anInt2752 != 0 && Static113.anInt2752 != 3 || Static19.anInt509 != 1) {
			return;
		}
		@Pc(27) int local27 = Static155.anInt3959 - arg0 - 25;
		@Pc(33) int local33 = Static5.anInt84 - arg1 - 5;
		if (local27 < 0 || local33 < 0 || local27 >= 146 || local33 >= 151) {
			return;
		}
		local33 -= 75;
		local27 -= 73;
		@Pc(58) int local58 = Static46.anInt1324 + Static154.anInt3559 & 0x7FF;
		@Pc(62) int local62 = Class2_Sub3_Sub2_Sub2.anIntArray208[local58];
		@Pc(66) int local66 = Class2_Sub3_Sub2_Sub2.anIntArray207[local58];
		@Pc(74) int local74 = (Static36.anInt1028 + 256) * local62 >> 8;
		@Pc(82) int local82 = (Static36.anInt1028 + 256) * local66 >> 8;
		@Pc(92) int local92 = local33 * local74 + local27 * local82 >> 11;
		@Pc(102) int local102 = local82 * local33 - local27 * local74 >> 11;
		@Pc(109) int local109 = local92 + Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2674 >> 7;
		@Pc(117) int local117 = Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2672 - local102 >> 7;
		@Pc(137) boolean local137 = Static74.method1151(local109, 0, 0, local117, 0, 1, 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray221[0], 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray223[0], true);
		if (!local137) {
			return;
		}
		Static66.aClass2_Sub13_Sub1_2.method1416(local27);
		Static66.aClass2_Sub13_Sub1_2.method1416(local33);
		Static66.aClass2_Sub13_Sub1_2.method1428(Static154.anInt3559);
		Static66.aClass2_Sub13_Sub1_2.method1416(57);
		Static66.aClass2_Sub13_Sub1_2.method1416(Static46.anInt1324);
		Static66.aClass2_Sub13_Sub1_2.method1416(Static36.anInt1028);
		Static66.aClass2_Sub13_Sub1_2.method1416(89);
		Static66.aClass2_Sub13_Sub1_2.method1428(Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2674);
		Static66.aClass2_Sub13_Sub1_2.method1428(Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2672);
		Static66.aClass2_Sub13_Sub1_2.method1416(Static54.anInt1439);
		Static66.aClass2_Sub13_Sub1_2.method1416(63);
		return;
	}
}
