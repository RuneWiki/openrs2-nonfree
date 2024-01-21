import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "Lclient!qd;")
	public static Class65 aClass65_16 = new Class65();

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "Lclient!ch;")
	public static Class14 aClass14_172 = new Class14(20);

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
	public static int anInt3436 = 500;

	@OriginalMember(owner = "client!sg", name = "h", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2008 = Static107.method1838("");

	@OriginalMember(owner = "client!sg", name = "i", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2009 = Static107.method1838("sl_flags");

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
	public static void method2365() {
		aClass28_2008 = null;
		aClass14_172 = null;
		aClass28_2009 = null;
		aClass65_16 = null;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)V")
	public static void method2366() {
		while (true) {
			@Pc(12) Class65 local12 = Static67.aClass65_4;
			@Pc(19) Class2_Sub7 local19;
			synchronized (Static67.aClass65_4) {
				local19 = (Class2_Sub7) aClass65_16.method2118();
			}
			if (local19 == null) {
				return;
			}
			local19.aClass40_Sub1_33.method1797(false, local19.aClass32_2, local19.aByteArray12, (int) local19.aLong145);
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(BLclient!gg;)Z")
	public static boolean method2367(@OriginalArg(1) Class28 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static92.anInt2333; local16++) {
			if (arg0.method1140(Static127.aClass28Array42[local16])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!gg;I)I")
	public static int method2368(@OriginalArg(0) Class28 arg0) {
		if (Static22.anInt739 == 1) {
			return 7;
		} else if (arg0.method1132(Static125.aClass28_1739)) {
			return 1;
		} else if (arg0.method1132(Static9.aClass28_325)) {
			return 1;
		} else if (arg0.method1132(Static69.aClass28_1090)) {
			return 2;
		} else if (arg0.method1132(Static93.aClass28_1397)) {
			return 2;
		} else if (arg0.method1132(Static125.aClass28_1732)) {
			return 3;
		} else if (arg0.method1132(Static150.aClass28_1976)) {
			return 4;
		} else if (arg0.method1132(Static173.aClass28_2282)) {
			return 4;
		} else if (arg0.method1132(Static47.aClass28_947)) {
			return 5;
		} else if (arg0.method1132(Static13.aClass28_406)) {
			return 6;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZI)I")
	public static int method2369(@OriginalArg(1) int arg0) {
		return arg0 >> 17 & 0x7;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "()V")
	public static void method2370() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < Static152.anInt3423; local1++) {
			for (local4 = 0; local4 < Static178.anInt3959; local4++) {
				for (local7 = 0; local7 < Static13.anInt587; local7++) {
					Static133.aClass2_Sub14ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static149.anInt3357; local4++) {
			for (local7 = 0; local7 < Static149.anIntArray316[local4]; local7++) {
				Static149.aClass54ArrayArray1[local4][local7] = null;
			}
			Static149.anIntArray316[local4] = 0;
		}
		for (local7 = 0; local7 < Static84.anInt2128; local7++) {
			Static58.aClass43Array37[local7] = null;
		}
		Static84.anInt2128 = 0;
		for (@Pc(69) int local69 = 0; local69 < Static159.aClass43Array105.length; local69++) {
			Static159.aClass43Array105[local69] = null;
		}
	}
}
