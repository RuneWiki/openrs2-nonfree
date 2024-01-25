import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static103 {

	@OriginalMember(owner = "client!ds", name = "W", descriptor = "Lclient!rw;")
	public static Class298 aClass298_1;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IB)V")
	public static void method1968(@OriginalArg(0) int arg0) {
		if (arg0 == 37) {
			Static572.aFloat201 = 3.0F;
		} else if (arg0 == 50) {
			Static572.aFloat201 = 4.0F;
		} else if (arg0 == 75) {
			Static572.aFloat201 = 6.0F;
		} else if (arg0 == 100) {
			Static572.aFloat201 = 8.0F;
		} else if (arg0 == 200) {
			Static572.aFloat201 = 16.0F;
		}
		Static465.anInt8867 = -1;
		Static465.anInt8867 = -1;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)V")
	public static void method1976() {
		if (Static82.aBoolean174) {
			return;
		}
		Static82.aBoolean174 = true;
		Static521.aBoolean651 = true;
		if (Static455.aClass4_Sub35_Sub1_1.aBoolean674) {
			Static155.aFloat73 = (int) Static155.aFloat73 + 47 & 0xFFFFFFF0;
		} else {
			Static1.aFloat107 += (12.0F - Static1.aFloat107) / 2.0F;
		}
	}
}
