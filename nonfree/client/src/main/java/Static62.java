import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!ek", name = "U", descriptor = "[Lclient!s;")
	public static Class115_Sub1[] aClass115_Sub1Array2;

	@OriginalMember(owner = "client!ek", name = "Q", descriptor = "[I")
	public static int[] anIntArray119 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!ek", name = "V", descriptor = "Ljava/lang/String;")
	public static String aString102 = "yellow:";

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZI)V")
	public static void method1196() {
		if (Static140.anInt3388 != -1) {
			Static15.method253(Static140.anInt3388);
		}
		for (@Pc(15) Class1_Sub5 local15 = (Class1_Sub5) Static204.aClass140_13.method4012(); local15 != null; local15 = (Class1_Sub5) Static204.aClass140_13.method4013()) {
			Static263.method4207(local15, true);
		}
		Static140.anInt3388 = -1;
		Static204.aClass140_13 = new Class140(8);
		Static21.method405();
		Static140.anInt3388 = Static228.anInt5019;
		Static249.method4058(false);
		Static112.method2258();
		Static15.method254(Static140.anInt3388);
		Static266.anInt5558 = -1;
		Static141.method1835(Static216.anInt4749);
		Static83.aClass9_Sub1_Sub1_1 = new Class9_Sub1_Sub1();
		Static83.aClass9_Sub1_Sub1_1.anInt479 = 3000;
		Static83.aClass9_Sub1_Sub1_1.anInt427 = 3000;
		if (Static68.anInt1404 == 0) {
			Static100.method2095(Static24.aClass51_10);
			Static168.method2918(10);
			return;
		}
		if (Static61.anInt1682 == 2) {
			Static110.anInt2935 = Static111.anInt2947 << 7;
			Static174.anInt4003 = Static34.anInt969 << 7;
		} else {
			Static83.method1671();
		}
		Static154.method3010();
		Static168.method2918(28);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IZILclient!s;Lclient!s;)I")
	public static int method1197(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class115_Sub1 arg2, @OriginalArg(4) Class115_Sub1 arg3) {
		if (arg0 == 1) {
			@Pc(11) int local11 = arg3.anInt4591;
			@Pc(14) int local14 = arg2.anInt4591;
			if (!arg1) {
				if (local11 == -1) {
					local11 = 2001;
				}
				if (local14 == -1) {
					local14 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg0 == 2) {
			return Static244.method3991(arg2.method3479().aString15, Static135.anInt3311, arg3.method3479().aString15);
		} else if (arg0 == 3) {
			if (arg3.aString324.equals("-")) {
				if (arg2.aString324.equals("-")) {
					return 0;
				} else if (arg1) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg2.aString324.equals("-")) {
				return arg1 ? 1 : -1;
			} else {
				return Static244.method3991(arg2.aString324, Static135.anInt3311, arg3.aString324);
			}
		} else if (arg0 == 4) {
			if (arg3.method3476()) {
				return arg2.method3476() ? 0 : 1;
			} else if (arg2.method3476()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 5) {
			if (arg3.method3475()) {
				return arg2.method3475() ? 0 : 1;
			} else if (arg2.method3475()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 6) {
			if (arg3.method3471()) {
				return arg2.method3471() ? 0 : 1;
			} else if (arg2.method3471()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 != 7) {
			return arg3.anInt4598 - arg2.anInt4598;
		} else if (arg3.method3466()) {
			return arg2.method3466() ? 0 : 1;
		} else if (arg2.method3466()) {
			return -1;
		} else {
			return 0;
		}
	}
}
