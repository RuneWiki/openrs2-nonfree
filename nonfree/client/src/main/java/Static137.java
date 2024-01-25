import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
	public static int anInt2139;

	@OriginalMember(owner = "client!gl", name = "f", descriptor = "[Lclient!hm;")
	public static Class107[] aClass107Array1;

	@OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
	public static int anInt2141;

	@OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
	public static int anInt2142 = 0;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)V")
	public static void method1747() {
		Static282.aClass77_36.method1394();
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IB)I")
	public static int method1748(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)Z")
	public static boolean method1749(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static170.aBoolean282) {
			return false;
		}
		@Pc(18) int local18 = arg0 >> 16;
		@Pc(22) int local22 = arg0 & 0xFFFF;
		if (Static45.aClass107ArrayArray1[local18] == null || Static45.aClass107ArrayArray1[local18][local22] == null) {
			return false;
		}
		@Pc(40) Class107 local40 = Static45.aClass107ArrayArray1[local18][local22];
		@Pc(51) Class1_Sub10 local51;
		if (arg1 == -1 && local40.anInt2598 == 0) {
			for (local51 = (Class1_Sub10) Static57.aClass14_3.method203(); local51 != null; local51 = (Class1_Sub10) Static57.aClass14_3.method208()) {
				if (local51.anInt1057 == 10 || local51.anInt1057 == 1004 || local51.anInt1057 == 11 || local51.anInt1057 == 20 || local51.anInt1057 == 51) {
					for (@Pc(86) Class107 local86 = Static55.method754(local51.anInt1058); local86 != null; local86 = Static130.method1647(local86)) {
						if (local86.anInt2660 == local40.anInt2660) {
							return true;
						}
					}
				}
			}
		} else {
			for (local51 = (Class1_Sub10) Static57.aClass14_3.method203(); local51 != null; local51 = (Class1_Sub10) Static57.aClass14_3.method208()) {
				if (local51.anInt1052 == arg1 && local40.anInt2660 == local51.anInt1058 && (local51.anInt1057 == 10 || local51.anInt1057 == 1004 || local51.anInt1057 == 11 || local51.anInt1057 == 20 || local51.anInt1057 == 51)) {
					return true;
				}
			}
		}
		return false;
	}
}
