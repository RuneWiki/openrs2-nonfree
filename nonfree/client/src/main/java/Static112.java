import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static112 {

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "B")
	public static byte aByte25;

	@OriginalMember(owner = "client!gr", name = "e", descriptor = "Lclient!jd;")
	public static Class13 aClass13_7;

	@OriginalMember(owner = "client!gr", name = "f", descriptor = "Lclient!bh;")
	public static Class21 aClass21_1;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIIIII)V", line = 18)
	public static void method2379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Class25_Sub1.anInt675 <= arg0 && Class61.anInt1835 >= arg2 && arg5 >= Class2_Sub40.anInt6819 && arg1 <= Class2_Sub20.anInt2951) {
			if (arg3 == 1) {
				Static363.method4488(arg0, arg2, arg5, arg1, arg4);
			} else {
				Static48.method1549(arg3, arg0, arg1, arg4, arg2, arg5);
			}
		} else if (arg3 == 1) {
			Static221.method4124(arg2, arg5, arg4, arg1, arg0);
		} else {
			Static173.method3402(arg1, arg3, arg5, arg2, arg0, arg4);
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V", line = 67)
	public static void method2380() {
		if (Static200.aString33.toLowerCase().indexOf("microsoft") != -1) {
			Class2_Sub26_Sub1.anIntArray285[191] = 73;
			Class2_Sub26_Sub1.anIntArray285[221] = 43;
			Class2_Sub26_Sub1.anIntArray285[222] = 59;
			Class2_Sub26_Sub1.anIntArray285[188] = 71;
			Class2_Sub26_Sub1.anIntArray285[186] = 57;
			Class2_Sub26_Sub1.anIntArray285[219] = 42;
			Class2_Sub26_Sub1.anIntArray285[189] = 26;
			Class2_Sub26_Sub1.anIntArray285[223] = 28;
			Class2_Sub26_Sub1.anIntArray285[190] = 72;
			Class2_Sub26_Sub1.anIntArray285[187] = 27;
			Class2_Sub26_Sub1.anIntArray285[192] = 58;
			Class2_Sub26_Sub1.anIntArray285[220] = 74;
			return;
		}
		Class2_Sub26_Sub1.anIntArray285[59] = 57;
		Class2_Sub26_Sub1.anIntArray285[45] = 26;
		Class2_Sub26_Sub1.anIntArray285[47] = 73;
		Class2_Sub26_Sub1.anIntArray285[93] = 43;
		Class2_Sub26_Sub1.anIntArray285[46] = 72;
		Class2_Sub26_Sub1.anIntArray285[44] = 71;
		Class2_Sub26_Sub1.anIntArray285[91] = 42;
		if (Static200.aMethod1 == null) {
			Class2_Sub26_Sub1.anIntArray285[192] = 58;
			Class2_Sub26_Sub1.anIntArray285[222] = 59;
		} else {
			Class2_Sub26_Sub1.anIntArray285[520] = 59;
			Class2_Sub26_Sub1.anIntArray285[222] = 58;
			Class2_Sub26_Sub1.anIntArray285[192] = 28;
		}
		Class2_Sub26_Sub1.anIntArray285[92] = 74;
		Class2_Sub26_Sub1.anIntArray285[61] = 27;
	}
}
