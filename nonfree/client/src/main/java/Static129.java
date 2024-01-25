import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!et", name = "e", descriptor = "[I")
	public static int[] anIntArray132;

	@OriginalMember(owner = "client!et", name = "j", descriptor = "[I")
	public static final int[] anIntArray133 = new int[4096];

	@OriginalMember(owner = "client!et", name = "l", descriptor = "Lclient!jb;")
	public static final Class161 aClass161_5 = new Class161(1);

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(B)V")
	public static void method2314() {
		if (Static301.aBoolean426) {
			return;
		}
		Static521.aBoolean651 = true;
		Static301.aBoolean426 = true;
		if (Static455.aClass4_Sub35_Sub1_1.aBoolean674) {
			Static189.aFloat83 = (int) Static189.aFloat83 + 191 & 0xFFFFFF80;
		} else {
			Static15.aFloat37 += (24.0F - Static15.aFloat37) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V")
	public static void method2315() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static584.aClass134Array1[local7] = null;
		}
		Static488.anInt9251 = 0;
	}
}
