import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static52 {

	@OriginalMember(owner = "client!bka", name = "G", descriptor = "Lclient!gga;")
	public static Class124 aClass124_14;

	@OriginalMember(owner = "client!bka", name = "A", descriptor = "Z")
	public static boolean aBoolean63 = false;

	@OriginalMember(owner = "client!bka", name = "b", descriptor = "(II)Lclient!hia;")
	public static Class144 method1053(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static331.aFloat187 == 3.0D) {
				return Static463.aClass144_5;
			}
			if ((double) Static331.aFloat187 == 4.0D) {
				return Static489.aClass144_7;
			}
			if ((double) Static331.aFloat187 == 6.0D) {
				return Static122.aClass144_1;
			}
			if ((double) Static331.aFloat187 >= 8.0D) {
				return Static125.aClass144_2;
			}
		} else if (arg0 == 1) {
			if ((double) Static331.aFloat187 == 3.0D) {
				return Static122.aClass144_1;
			}
			if ((double) Static331.aFloat187 == 4.0D) {
				return Static125.aClass144_2;
			}
			if ((double) Static331.aFloat187 == 6.0D) {
				return Static474.aClass144_6;
			}
			if ((double) Static331.aFloat187 >= 8.0D) {
				return Static565.aClass144_8;
			}
		} else if (arg0 == 2) {
			if ((double) Static331.aFloat187 == 3.0D) {
				return Static474.aClass144_6;
			}
			if ((double) Static331.aFloat187 == 4.0D) {
				return Static565.aClass144_8;
			}
			if ((double) Static331.aFloat187 == 6.0D) {
				return Static391.aClass144_4;
			}
			if ((double) Static331.aFloat187 >= 8.0D) {
				return Static377.aClass144_3;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!bka", name = "f", descriptor = "(I)V")
	public static void method1056() {
		Static458.anImage12 = null;
		Static368.aFont2 = null;
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(IIB)Z")
	public static boolean method1059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
