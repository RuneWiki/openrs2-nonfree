import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
	public static int anInt540;

	@OriginalMember(owner = "client!bn", name = "f", descriptor = "Lclient!dp;")
	public static Class53 aClass53_25;

	@OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
	public static int anInt542 = 20;

	@OriginalMember(owner = "client!bn", name = "n", descriptor = "Z")
	public static boolean aBoolean38 = false;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IBI)V")
	public static void method462(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = Static62.anInt1130 * arg0 >> 8;
		if (arg1 == -1 && !Static40.aBoolean54) {
			Static298.method5106();
		} else if (arg1 != -1 && (arg1 != Static253.anInt4718 || !Static60.method985()) && local5 != 0 && !Static40.aBoolean54) {
			Static18.method290(arg1, local5, Static244.aClass53_116);
		}
		Static253.anInt4718 = arg1;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIII)V")
	public static void method465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class6_Sub2_Sub8 local8 = Static239.method5786(11, arg2);
		local8.method2648();
		local8.anInt2511 = arg1;
		local8.anInt2507 = arg0;
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(B)V")
	public static void method471() {
		@Pc(5) Class70 local5 = Static30.aClass70_18;
		synchronized (Static30.aClass70_18) {
			Static30.aClass70_18.method1405();
		}
		local5 = Static340.aClass70_19;
		synchronized (Static340.aClass70_19) {
			Static340.aClass70_19.method1405();
		}
		local5 = Static227.aClass70_76;
		synchronized (Static227.aClass70_76) {
			Static227.aClass70_76.method1405();
		}
		local5 = Static183.aClass70_61;
		synchronized (Static183.aClass70_61) {
			Static183.aClass70_61.method1405();
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IILjava/lang/String;II)V")
	public static void method474(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class132 local8 = Static6.method131(arg3, arg0);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray19 != null) {
			@Pc(18) Class6_Sub15 local18 = new Class6_Sub15();
			local18.aClass132_5 = local8;
			local18.aString70 = arg1;
			local18.anInt1915 = arg2;
			local18.anObjectArray2 = local8.anObjectArray19;
			Static140.method2654(local18);
		}
		@Pc(35) boolean local35 = true;
		if (local8.anInt3539 > 0) {
			local35 = Static352.method5772(local8);
		}
		if (!local35 || !Static43.method751(local8).method4580(arg2 - 1)) {
			return;
		}
		if (arg2 == 1) {
			Static131.aClass6_Sub10_Sub1_2.method2886(166);
			Static131.aClass6_Sub10_Sub1_2.method3976(arg3);
			Static131.aClass6_Sub10_Sub1_2.method4025(arg0);
		}
		if (arg2 == 2) {
			Static131.aClass6_Sub10_Sub1_2.method2886(102);
			Static131.aClass6_Sub10_Sub1_2.method3976(arg3);
			Static131.aClass6_Sub10_Sub1_2.method4025(arg0);
		}
		if (arg2 == 3) {
			Static131.aClass6_Sub10_Sub1_2.method2886(144);
			Static131.aClass6_Sub10_Sub1_2.method3976(arg3);
			Static131.aClass6_Sub10_Sub1_2.method4025(arg0);
		}
		if (arg2 == 4) {
			Static131.aClass6_Sub10_Sub1_2.method2886(123);
			Static131.aClass6_Sub10_Sub1_2.method3976(arg3);
			Static131.aClass6_Sub10_Sub1_2.method4025(arg0);
		}
		if (arg2 == 5) {
			Static131.aClass6_Sub10_Sub1_2.method2886(63);
			Static131.aClass6_Sub10_Sub1_2.method3976(arg3);
			Static131.aClass6_Sub10_Sub1_2.method4025(arg0);
		}
		if (arg2 == 6) {
			Static131.aClass6_Sub10_Sub1_2.method2886(199);
			Static131.aClass6_Sub10_Sub1_2.method3976(arg3);
			Static131.aClass6_Sub10_Sub1_2.method4025(arg0);
		}
		if (arg2 == 7) {
			Static131.aClass6_Sub10_Sub1_2.method2886(3);
			Static131.aClass6_Sub10_Sub1_2.method3976(arg3);
			Static131.aClass6_Sub10_Sub1_2.method4025(arg0);
		}
		if (arg2 == 8) {
			Static131.aClass6_Sub10_Sub1_2.method2886(6);
			Static131.aClass6_Sub10_Sub1_2.method3976(arg3);
			Static131.aClass6_Sub10_Sub1_2.method4025(arg0);
		}
		if (arg2 == 9) {
			Static131.aClass6_Sub10_Sub1_2.method2886(229);
			Static131.aClass6_Sub10_Sub1_2.method3976(arg3);
			Static131.aClass6_Sub10_Sub1_2.method4025(arg0);
		}
		if (arg2 == 10) {
			Static131.aClass6_Sub10_Sub1_2.method2886(203);
			Static131.aClass6_Sub10_Sub1_2.method3976(arg3);
			Static131.aClass6_Sub10_Sub1_2.method4025(arg0);
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(CI)Z")
	public static boolean method475(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
