import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
	public static int anInt3999;

	@OriginalMember(owner = "client!uc", name = "m", descriptor = "I")
	public static int anInt4002;

	@OriginalMember(owner = "client!uc", name = "p", descriptor = "Lclient!ga;")
	public static Class30 aClass30_59;

	@OriginalMember(owner = "client!uc", name = "q", descriptor = "Lclient!ig;")
	public static Class30_Sub1 aClass30_Sub1_17;

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1522 = Static169.method2903("Hierhin gehen");

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1523 = Static169.method2903("<col=ff0000>");

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1524 = Static169.method2903("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1525 = Static169.method2903(")3");

	@OriginalMember(owner = "client!uc", name = "j", descriptor = "[I")
	public static int[] anIntArray547 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!uc", name = "k", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1526 = Static169.method2903("Members object");

	@OriginalMember(owner = "client!uc", name = "l", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1527 = Static169.method2903("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
	public static int anInt4004 = 0;

	@OriginalMember(owner = "client!uc", name = "r", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1528 = aClass23_1526;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
	public static void method2821() {
		aClass23_1524 = null;
		aClass23_1528 = null;
		aClass23_1523 = null;
		aClass30_Sub1_17 = null;
		aClass23_1522 = null;
		aClass30_59 = null;
		aClass23_1525 = null;
		aClass23_1527 = null;
		anIntArray547 = null;
		aClass23_1526 = null;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIILclient!ga;)Z")
	public static boolean method2822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class30 arg2) {
		@Pc(11) byte[] local11 = arg2.method1301(arg0, arg1);
		if (local11 == null) {
			return false;
		} else {
			Static92.method1615(local11);
			return true;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)Lclient!nb;")
	public static Class1_Sub1_Sub12_Sub1 method2823() {
		@Pc(11) Class1_Sub1_Sub12_Sub1 local11 = new Class1_Sub1_Sub12_Sub1();
		local11.anInt2797 = Static62.anInt1654;
		local11.anInt2802 = Static59.anIntArray226[0];
		local11.anInt2799 = Static47.anIntArray152[0];
		local11.anInt2798 = Static27.anIntArray109[0];
		@Pc(37) byte[] local37 = Static1.aByteArrayArray1[0];
		local11.anInt2800 = Static71.anInt1936;
		local11.anInt2801 = Static103.anIntArray346[0];
		@Pc(51) int local51 = local11.anInt2798 * local11.anInt2799;
		local11.anIntArray374 = new int[local51];
		for (@Pc(57) int local57 = 0; local57 < local51; local57++) {
			local11.anIntArray374[local57] = Static14.anIntArray63[local37[local57] & 0xFF];
		}
		Static54.method996();
		return local11;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZLclient!ed;)V")
	public static void method2824(@OriginalArg(1) Class23 arg0) {
		if (Static129.anInt3382 >= 2) {
			if (arg0.method644(Static149.aClass23_1421)) {
				System.gc();
			}
			if (arg0.method644(Static167.aClass23_1564)) {
				Static49.method913();
			}
			if (arg0.method644(Static68.aClass23_656)) {
				Static31.aBoolean45 = true;
			}
			if (arg0.method644(Static19.aClass23_231)) {
				Static31.aBoolean45 = false;
			}
			if (arg0.method644(Static48.aClass23_494)) {
				for (@Pc(42) int local42 = 0; local42 < 4; local42++) {
					for (@Pc(46) int local46 = 1; local46 < 103; local46++) {
						for (@Pc(50) int local50 = 1; local50 < 103; local50++) {
							Static132.aClass69Array3[local42].anIntArrayArray33[local46][local50] = 0;
						}
					}
				}
			}
			if (arg0.method634(Static135.aClass23_1276) && Static73.anInt2024 != 0) {
				Static125.method2229(arg0.method632(6).method658());
			}
			if (arg0.method644(Static94.aClass23_925) && Static73.anInt2024 == 2) {
				throw new RuntimeException();
			}
			if (arg0.method634(Static5.aClass23_1664)) {
				Static20.anInt670 = arg0.method632(12).method641().method658();
				Static73.method1339(Static149.method2571(new Class23[] { Static4.aClass23_105, Static27.method498(Static20.anInt670) }), null, 0);
			}
			if (arg0.method644(Static57.aClass23_594)) {
				Static109.aBoolean136 = true;
			}
		}
		Static25.aClass1_Sub8_Sub1_1.method919(66);
		Static25.aClass1_Sub8_Sub1_1.method862(arg0.method642() - 1);
		Static25.aClass1_Sub8_Sub1_1.method858(arg0.method632(2));
	}
}
