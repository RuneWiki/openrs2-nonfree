import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "[I")
	public static final int[] anIntArray278 = new int[4];

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_86 = new Class200(94, -2);

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_87 = new Class200(17, -1);

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_88 = new Class200(32, 10);

	@OriginalMember(owner = "client!ie", name = "j", descriptor = "[I")
	public static final int[] anIntArray279 = new int[500];

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)V")
	public static void method3734() {
		@Pc(1) Class69 local1 = Static248.aClass69_25;
		synchronized (Static248.aClass69_25) {
			Static248.aClass69_25.method1910(5);
		}
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)V")
	public static void method3736() {
		if (Static368.aClass48Array1 == null) {
			Static368.aClass48Array1 = Static58.method1310();
			Static247.aClass48_23 = Static368.aClass48Array1[0];
			Static96.aLong65 = Static48.method1203();
		}
		if (Static113.aClass23_1 == null) {
			Static439.method6316();
		}
		@Pc(25) Class48 local25 = Static247.aClass48_23;
		@Pc(28) int local28 = Static422.method6162();
		if (Static247.aClass48_23 == local25) {
			Static649.aString113 = Static247.aClass48_23.aClass345_1.method7951(Static496.anInt7407);
			if (Static247.aClass48_23.aBoolean131) {
				Static57.anInt1432 = (Static247.aClass48_23.anInt1435 - Static247.aClass48_23.anInt1437) * local28 / 100 + Static247.aClass48_23.anInt1437;
			}
			if (Static247.aClass48_23.aBoolean130) {
				Static649.aString113 = Static649.aString113 + Static57.anInt1432 + "%";
			}
		} else if (Static58.aClass48_22 == Static247.aClass48_23) {
			Static113.aClass23_1 = null;
			Static213.method3541(3);
		} else {
			Static649.aString113 = local25.aClass345_2.method7951(Static496.anInt7407);
			Static57.anInt1432 = local25.anInt1435;
			if (Static247.aClass48_23.aBoolean130) {
				Static649.aString113 = Static649.aString113 + local25.anInt1435 + "%";
			}
			if (Static247.aClass48_23.aBoolean131 || local25.aBoolean131) {
				Static96.aLong65 = Static48.method1203();
			}
		}
		if (Static113.aClass23_1 == null) {
			return;
		}
		Static113.aClass23_1.method621(Static96.aLong65, Static247.aClass48_23, Static57.anInt1432, Static649.aString113);
		if (Static519.anInterface16Array1 == null) {
			return;
		}
		for (@Pc(130) int local130 = Static405.anInt6895 + 1; local130 < Static519.anInterface16Array1.length; local130++) {
			if (Static519.anInterface16Array1[local130].method6302() >= 100 && local130 - 1 == Static405.anInt6895 && Static454.anInt7416 >= 1 && Static113.aClass23_1.method620()) {
				try {
					Static519.anInterface16Array1[local130].method6298();
				} catch (@Pc(162) Exception local162) {
					Static519.anInterface16Array1 = null;
					break;
				}
				Static113.aClass23_1.method623(Static519.anInterface16Array1[local130]);
				Static405.anInt6895++;
				if (Static405.anInt6895 >= Static519.anInterface16Array1.length - 1 && Static519.anInterface16Array1.length > 1) {
					Static405.anInt6895 = Static509.aClass88_1.method2103() ? 0 : -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!sl;I)Lclient!th;")
	public static Class330 method3737(@OriginalArg(0) Class2_Sub17 arg0) {
		@Pc(7) Class330 local7 = new Class330();
		local7.anInt8838 = arg0.method2825();
		local7.aClass2_Sub7_Sub16_1 = Static327.aClass344_1.method7949(local7.anInt8838);
		return local7;
	}
}
