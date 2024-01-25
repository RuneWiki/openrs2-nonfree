import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "[Z")
	public static boolean[] aBooleanArray15;

	@OriginalMember(owner = "client!lc", name = "o", descriptor = "Lclient!uj;")
	public static Class14_Sub19_Sub4 aClass14_Sub19_Sub4_3;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "Z")
	public static boolean aBoolean233 = false;

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "Lclient!sa;")
	public static Class14_Sub30 aClass14_Sub30_1 = null;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/String;BIII)V")
	public static void method3390(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class146 local8 = Static70.method1717(arg1, arg3);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray20 != null) {
			@Pc(18) Class14_Sub15 local18 = new Class14_Sub15();
			local18.aString83 = arg0;
			local18.anInt2255 = arg2;
			local18.anObjectArray3 = local8.anObjectArray20;
			local18.aClass146_22 = local8;
			Static10.method223(local18);
		}
		@Pc(35) boolean local35 = true;
		if (local8.anInt4198 > 0) {
			local35 = Static3.method107(local8);
		}
		if (!local35 || !Static42.method1040(local8).method2583(arg2 - 1)) {
			return;
		}
		if (arg2 == 1) {
			Static164.aClass14_Sub4_Sub2_3.method2557(28);
			Static164.aClass14_Sub4_Sub2_3.method2541(arg1);
			Static164.aClass14_Sub4_Sub2_3.method2509(arg3);
		}
		if (arg2 == 2) {
			Static164.aClass14_Sub4_Sub2_3.method2557(9);
			Static164.aClass14_Sub4_Sub2_3.method2541(arg1);
			Static164.aClass14_Sub4_Sub2_3.method2509(arg3);
		}
		if (arg2 == 3) {
			Static164.aClass14_Sub4_Sub2_3.method2557(60);
			Static164.aClass14_Sub4_Sub2_3.method2541(arg1);
			Static164.aClass14_Sub4_Sub2_3.method2509(arg3);
		}
		if (arg2 == 4) {
			Static164.aClass14_Sub4_Sub2_3.method2557(107);
			Static164.aClass14_Sub4_Sub2_3.method2541(arg1);
			Static164.aClass14_Sub4_Sub2_3.method2509(arg3);
		}
		if (arg2 == 5) {
			Static164.aClass14_Sub4_Sub2_3.method2557(172);
			Static164.aClass14_Sub4_Sub2_3.method2541(arg1);
			Static164.aClass14_Sub4_Sub2_3.method2509(arg3);
		}
		if (arg2 == 6) {
			Static164.aClass14_Sub4_Sub2_3.method2557(127);
			Static164.aClass14_Sub4_Sub2_3.method2541(arg1);
			Static164.aClass14_Sub4_Sub2_3.method2509(arg3);
		}
		if (arg2 == 7) {
			Static164.aClass14_Sub4_Sub2_3.method2557(185);
			Static164.aClass14_Sub4_Sub2_3.method2541(arg1);
			Static164.aClass14_Sub4_Sub2_3.method2509(arg3);
		}
		if (arg2 == 8) {
			Static164.aClass14_Sub4_Sub2_3.method2557(228);
			Static164.aClass14_Sub4_Sub2_3.method2541(arg1);
			Static164.aClass14_Sub4_Sub2_3.method2509(arg3);
		}
		if (arg2 == 9) {
			Static164.aClass14_Sub4_Sub2_3.method2557(149);
			Static164.aClass14_Sub4_Sub2_3.method2541(arg1);
			Static164.aClass14_Sub4_Sub2_3.method2509(arg3);
		}
		if (arg2 == 10) {
			Static164.aClass14_Sub4_Sub2_3.method2557(29);
			Static164.aClass14_Sub4_Sub2_3.method2541(arg1);
			Static164.aClass14_Sub4_Sub2_3.method2509(arg3);
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BCI)C")
	public static char method3392(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 'À' && arg0 <= 'ÿ') {
			if (arg0 >= 'À' && arg0 <= 'Æ') {
				return 'A';
			}
			if (arg0 == 'Ç') {
				return 'C';
			}
			if (arg0 >= 'È' && arg0 <= 'Ë') {
				return 'E';
			}
			if (arg0 >= 'Ì' && arg0 <= 'Ï') {
				return 'I';
			}
			if (arg0 == 'Ñ' && arg1 != 0) {
				return 'N';
			}
			if (arg0 >= 'Ò' && arg0 <= 'Ö') {
				return 'O';
			}
			if (arg0 >= 'Ù' && arg0 <= 'Ü') {
				return 'U';
			}
			if (arg0 == 'Ý') {
				return 'Y';
			}
			if (arg0 == 'ß') {
				return 's';
			}
			if (arg0 >= 'à' && arg0 <= 'æ') {
				return 'a';
			}
			if (arg0 == 'ç') {
				return 'c';
			}
			if (arg0 >= 'è' && arg0 <= 'ë') {
				return 'e';
			}
			if (arg0 >= 'ì' && arg0 <= 'ï') {
				return 'i';
			}
			if (arg0 == 'ñ' && arg1 != 0) {
				return 'n';
			}
			if (arg0 >= 'ò' && arg0 <= 'ö') {
				return 'o';
			}
			if (arg0 >= 'ù' && arg0 <= 'ü') {
				return 'u';
			}
			if (arg0 == 'ý' || arg0 == 'ÿ') {
				return 'y';
			}
		}
		if (arg0 == 'Œ') {
			return 'O';
		} else if (arg0 == 'œ') {
			return 'o';
		} else if (arg0 == 'Ÿ') {
			return 'Y';
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V")
	public static void method3395() {
		if (Static12.anInt244 == 2) {
			Static127.anInt2786 = 96;
			return;
		}
		try {
			@Pc(22) Method local22 = Runtime.class.getMethod("maxMemory");
			if (local22 != null) {
				try {
					@Pc(26) Runtime local26 = Runtime.getRuntime();
					@Pc(32) Long local32 = (Long) local22.invoke(local26, (Object[]) null);
					Static127.anInt2786 = (int) (local32 / 1048576L) + 1;
				} catch (@Pc(42) Throwable local42) {
				}
			}
		} catch (@Pc(44) Exception local44) {
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIII)V")
	public static void method3397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		for (@Pc(10) Class1_Sub4 local10 = (Class1_Sub4) Static242.aClass126_5.method3389(); local10 != null; local10 = (Class1_Sub4) Static242.aClass126_5.method3394()) {
			if (local10.anInt1448 <= Static153.anInt3257) {
				local10.method5701();
			} else {
				Static279.method4728(arg3 >> 1, (local10.anInt1449 << 7) + 64, arg2 >> 1, local10.anInt1451 * 2, (local10.anInt1447 << 7) + 64);
				Static164.aClass30_5.method5584(local10.aString58, 0, arg0 + Static316.anIntArray309[1], arg1 + Static316.anIntArray309[0], local10.anInt1454 | 0xFF000000);
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method3402(@OriginalArg(0) String arg0) {
		if (Static198.aClass195Array1 != null) {
			Static164.aClass14_Sub4_Sub2_3.method2557(120);
			Static164.aClass14_Sub4_Sub2_3.method2538(Static333.method5739(arg0));
			Static164.aClass14_Sub4_Sub2_3.method2527(arg0);
		}
	}
}
