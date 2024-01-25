import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString20 = "";

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
	public static int anInt2307 = 0;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
	public static void method1859() {
		Static365.aClass77_47.method1395();
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZLclient!tj;IILclient!tj;)I")
	public static int method1860(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class239_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class239_Sub1 arg3) {
		@Pc(11) int local11;
		@Pc(14) int local14;
		if (arg2 == 1) {
			local11 = arg3.anInt6349;
			local14 = arg1.anInt6349;
			if (!arg0) {
				if (local14 == -1) {
					local14 = 2001;
				}
				if (local11 == -1) {
					local11 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg2 == 2) {
			return Static345.method4492(Static63.anInt981, arg1.method5134().aString19, arg3.method5134().aString19);
		} else if (arg2 == 3) {
			if (arg3.aString66.equals("-")) {
				if (arg1.aString66.equals("-")) {
					return 0;
				} else if (arg0) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg1.aString66.equals("-")) {
				return arg0 ? 1 : -1;
			} else {
				return Static345.method4492(Static63.anInt981, arg1.aString66, arg3.aString66);
			}
		} else if (arg2 == 4) {
			if (arg3.method5130()) {
				return arg1.method5130() ? 0 : 1;
			} else if (arg1.method5130()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 5) {
			if (arg3.method5124()) {
				return arg1.method5124() ? 0 : 1;
			} else if (arg1.method5124()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 6) {
			if (arg3.method5131()) {
				return arg1.method5131() ? 0 : 1;
			} else if (arg1.method5131()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 7) {
			if (arg3.method5128()) {
				return arg1.method5128() ? 0 : 1;
			} else if (arg1.method5128()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 8) {
			local11 = arg3.anInt6359;
			local14 = arg1.anInt6359;
			if (arg0) {
				if (local14 == 1000) {
					local14 = -1;
				}
				if (local11 == 1000) {
					local11 = -1;
				}
			} else {
				if (local14 == -1) {
					local14 = 1000;
				}
				if (local11 == -1) {
					local11 = 1000;
				}
			}
			return local11 - local14;
		} else {
			return arg3.anInt6362 - arg1.anInt6362;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method1861(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < anInt2307; local16++) {
			if (arg0.equalsIgnoreCase(Static108.aStringArray10[local16])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static94.aClass11_Sub1_Sub3_Sub2_1.aString32);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)V")
	public static void method1862(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		Static212.anInt3924 = -1;
		Static436.anInt6898 = 1;
		Static130.method1657(arg0, arg1);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIB)Z")
	public static boolean method1863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x70000) != 0 | Static344.method4573(arg0, arg1) || Static180.method2596(arg0, arg1);
	}
}
