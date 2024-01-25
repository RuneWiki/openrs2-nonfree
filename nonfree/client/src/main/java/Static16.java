import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
	public static int anInt309;

	@OriginalMember(owner = "client!aj", name = "j", descriptor = "[Lclient!f;")
	public static Class14[] aClass14Array4;

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "[I")
	public static final int[] anIntArray19 = new int[1];

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "Lclient!bs;")
	public static final Class40 aClass40_1 = new Class40();

	@OriginalMember(owner = "client!aj", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString4 = null;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILclient!hfa;III)Z")
	public static boolean method242(@OriginalArg(0) int arg0, @OriginalArg(1) Class41_Sub2_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static279.aBoolean733) {
			return false;
		} else if (Static328.anInt5532 < 100) {
			return false;
		} else if (Static238.method3671(arg0, arg2, arg3)) {
			@Pc(24) int local24 = arg0 << Static315.anInt5369;
			@Pc(28) int local28 = arg3 << Static315.anInt5369;
			@Pc(38) int local38 = Static68.aClass34Array1[arg2].method6525(arg3, arg0) - 1;
			@Pc(44) int local44 = arg1.method7844() + local38;
			if (arg1.aShort141 == 1) {
				if (!Static591.method7907(local24, local24, local38, local24, local28, local28 + Static467.anInt7776, local28, local44, local44)) {
					return false;
				} else if (Static591.method7907(local24, local24, local38, local24, local28 + Static467.anInt7776, Static467.anInt7776 + local28, local28, local38, local44)) {
					Static490.anInt7997++;
					return true;
				} else {
					return false;
				}
			} else if (arg1.aShort141 == 2) {
				if (!Static591.method7907(local24, local24, local38, local24 + Static467.anInt7776, local28 - -Static467.anInt7776, local28 + Static467.anInt7776, Static467.anInt7776 + local28, local44, local44)) {
					return false;
				} else if (Static591.method7907(Static467.anInt7776 + local24, local24, local38, local24 + Static467.anInt7776, Static467.anInt7776 + local28, local28 + Static467.anInt7776, Static467.anInt7776 + local28, local44, local38)) {
					Static490.anInt7997++;
					return true;
				} else {
					return false;
				}
			} else if (arg1.aShort141 == 4) {
				if (!Static591.method7907(Static467.anInt7776 + local24, local24 + Static467.anInt7776, local38, local24 + Static467.anInt7776, local28, local28 + Static467.anInt7776, local28, local44, local44)) {
					return false;
				} else if (Static591.method7907(Static467.anInt7776 + local24, local24 + Static467.anInt7776, local38, local24 + Static467.anInt7776, Static467.anInt7776 + local28, Static467.anInt7776 + local28, local28, local38, local44)) {
					Static490.anInt7997++;
					return true;
				} else {
					return false;
				}
			} else if (arg1.aShort141 == 8) {
				if (!Static591.method7907(local24, local24, local38, local24 + Static467.anInt7776, local28, local28, local28, local44, local44)) {
					return false;
				} else if (Static591.method7907(local24 + Static467.anInt7776, local24, local38, local24 + Static467.anInt7776, local28, local28, local28, local44, local38)) {
					Static490.anInt7997++;
					return true;
				} else {
					return false;
				}
			} else if (arg1.aShort141 == 16) {
				if (Static136.method2670(local44, Static323.anInt5468 + local28, Static323.anInt5468, Static323.anInt5468, local38, local24)) {
					Static490.anInt7997++;
					return true;
				} else {
					return false;
				}
			} else if (arg1.aShort141 == 32) {
				if (Static136.method2670(local44, local28 + Static323.anInt5468, Static323.anInt5468, Static323.anInt5468, local38, Static323.anInt5468 + local24)) {
					Static490.anInt7997++;
					return true;
				} else {
					return false;
				}
			} else if (arg1.aShort141 == 64) {
				if (Static136.method2670(local44, local28, Static323.anInt5468, Static323.anInt5468, local38, Static323.anInt5468 + local24)) {
					Static490.anInt7997++;
					return true;
				} else {
					return false;
				}
			} else if (arg1.aShort141 != 128) {
				return true;
			} else if (Static136.method2670(local44, local28, Static323.anInt5468, Static323.anInt5468, local38, local24)) {
				Static490.anInt7997++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
