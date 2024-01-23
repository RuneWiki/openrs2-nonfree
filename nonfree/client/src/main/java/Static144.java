import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!ld", name = "o", descriptor = "Lclient!jd;")
	public static Class84 aClass84_58;

	@OriginalMember(owner = "client!ld", name = "p", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
	public static int anInt3118 = 1;

	@OriginalMember(owner = "client!ld", name = "j", descriptor = "Lclient!ec;")
	public static Class46 aClass46_23 = new Class46(2);

	@OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
	public static int anInt3120 = 0;

	@OriginalMember(owner = "client!ld", name = "m", descriptor = "Lclient!ec;")
	public static Class46 aClass46_24 = new Class46(4);

	@OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
	public static int anInt3122 = 127;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!pa;Lclient!pa;IIZ)I")
	public static int method2547(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		if (arg2 == 1) {
			@Pc(10) int local10 = arg1.anInt4117;
			@Pc(13) int local13 = arg0.anInt4117;
			if (!arg3) {
				if (local10 == -1) {
					local10 = 2001;
				}
				if (local13 == -1) {
					local13 = 2001;
				}
			}
			return local10 - local13;
		} else if (arg2 == 2) {
			return Static75.method1377(arg0.method3348().aString65, arg1.method3348().aString65, Static206.anInt4309);
		} else if (arg2 == 3) {
			if (arg1.aString206.equals("-")) {
				if (arg0.aString206.equals("-")) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg0.aString206.equals("-")) {
				return arg3 ? 1 : -1;
			} else {
				return Static75.method1377(arg0.aString206, arg1.aString206, Static206.anInt4309);
			}
		} else if (arg2 == 4) {
			return arg1.method3342() ? (arg0.method3342() ? 0 : 1) : (arg0.method3342() ? -1 : 0);
		} else if (arg2 == 5) {
			return arg1.method3345() ? (arg0.method3345() ? 0 : 1) : arg0.method3345() ? -1 : 0;
		} else if (arg2 == 6) {
			return arg1.method3343() ? (arg0.method3343() ? 0 : 1) : (arg0.method3343() ? -1 : 0);
		} else if (arg2 == 7) {
			return arg1.method3346() ? (arg0.method3346() ? 0 : 1) : (arg0.method3346() ? -1 : 0);
		} else {
			return arg1.anInt4132 - arg0.anInt4132;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public static void method2548() {
		Static4.method120();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static98.aClass52Array1[local8].method1243();
		}
		System.gc();
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)I")
	public static int method2549(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return 0;
		}
		@Pc(19) Class2_Sub18 local19 = (Class2_Sub18) Static50.aClass79_4.method2002((long) arg0);
		if (local19 == null) {
			return Static253.method4071(arg0).anInt2404;
		}
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < local19.anIntArray289.length; local31++) {
			if (local19.anIntArray289[local31] == -1) {
				local29++;
			}
		}
		return local29 + Static253.method4071(arg0).anInt2404 - local19.anIntArray289.length;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ICI)C")
	public static char method2552(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		if (arg1 >= 'À' && arg1 <= 'ÿ') {
			if (arg1 >= 'À' && arg1 <= 'Æ') {
				return 'A';
			}
			if (arg1 == 'Ç') {
				return 'C';
			}
			if (arg1 >= 'È' && arg1 <= 'Ë') {
				return 'E';
			}
			if (arg1 >= 'Ì' && arg1 <= 'Ï') {
				return 'I';
			}
			if (arg1 == 'Ñ' && arg0 != 0) {
				return 'N';
			}
			if (arg1 >= 'Ò' && arg1 <= 'Ö') {
				return 'O';
			}
			if (arg1 >= 'Ù' && arg1 <= 'Ü') {
				return 'U';
			}
			if (arg1 == 'Ý') {
				return 'Y';
			}
			if (arg1 == 'ß') {
				return 's';
			}
			if (arg1 >= 'à' && arg1 <= 'æ') {
				return 'a';
			}
			if (arg1 == 'ç') {
				return 'c';
			}
			if (arg1 >= 'è' && arg1 <= 'ë') {
				return 'e';
			}
			if (arg1 >= 'ì' && arg1 <= 'ï') {
				return 'i';
			}
			if (arg1 == 'ñ' && arg0 != 0) {
				return 'n';
			}
			if (arg1 >= 'ò' && arg1 <= 'ö') {
				return 'o';
			}
			if (arg1 >= 'ù' && arg1 <= 'ü') {
				return 'u';
			}
			if (arg1 == 'ý' || arg1 == 'ÿ') {
				return 'y';
			}
		}
		if (arg1 == 'Œ') {
			return 'O';
		} else if (arg1 == 'œ') {
			return 'o';
		} else if (arg1 == 'Ÿ') {
			return 'Y';
		} else {
			return arg1;
		}
	}
}
