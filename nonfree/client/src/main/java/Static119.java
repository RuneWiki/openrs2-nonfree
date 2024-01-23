import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!lh", name = "A", descriptor = "Lclient!tg;")
	public static Class64 aClass64_25;

	@OriginalMember(owner = "client!lh", name = "y", descriptor = "I")
	public static int anInt4278 = 0;

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(IIIII)V")
	public static void method3319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static96.method1612(arg2, arg1, arg3 + arg2, arg0 + arg1);
		Static96.method1623(arg2, arg1, arg3, arg0, 0);
		if (Static129.anInt2903 < 100) {
			return;
		}
		if (Static11.aClass1_Sub2_Sub1_1 == null || arg3 != Static11.aClass1_Sub2_Sub1_1.anInt2634 || Static11.aClass1_Sub2_Sub1_1.anInt2641 != arg0) {
			@Pc(50) Class1_Sub2_Sub1_Sub1 local50 = new Class1_Sub2_Sub1_Sub1(arg3, arg0);
			Static96.method1625(local50.anIntArray157, arg3, arg0);
			Static67.method1164(Static3.anInt75, 0, 0, arg0, arg3, 0, 0, Static87.anInt2017);
			Static11.aClass1_Sub2_Sub1_1 = local50;
			Static210.aClass19_1.method885();
		}
		Static11.aClass1_Sub2_Sub1_1.method2067(arg2, arg1);
		@Pc(82) int local82 = Static93.anInt2067 * arg3 / Static3.anInt75 + arg2;
		@Pc(90) int local90 = Static195.anInt2640 * arg0 / Static87.anInt2017 + arg1;
		@Pc(96) int local96 = arg3 * Static23.anInt599 / Static3.anInt75;
		@Pc(102) int local102 = Static93.anInt2064 * arg0 / Static87.anInt2017;
		Static96.method1621(local82, local90, local96, local102, 16711680, 128);
		Static96.method1633(local82, local90, local96, local102, 16711680);
		if (Static198.anInt4218 <= 0 || Static198.anInt4218 % 10 >= 5) {
			return;
		}
		for (@Pc(134) Class1_Sub23 local134 = (Class1_Sub23) Static5.aClass105_18.method3120(); local134 != null; local134 = (Class1_Sub23) Static5.aClass105_18.method3109()) {
			if (local134.anInt3915 == Static25.anInt627) {
				@Pc(153) int local153 = arg3 * local134.anInt3913 / Static3.anInt75 + arg2;
				@Pc(163) int local163 = arg1 + local134.anInt3914 * arg0 / Static87.anInt2017;
				Static96.method1623(local153 - 2, local163 - 2, 4, 4, 16776960);
			}
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method3321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static54.method933(arg1)) {
			Static108.aClass71Array1 = null;
			Static218.method1762(arg6, arg0, arg5, arg7, arg2, -1, arg3, Static64.aClass71ArrayArray1[arg1], arg4);
			if (Static108.aClass71Array1 != null) {
				Static218.method1762(Static227.anInt4778, Static224.anInt4694, arg5, arg7, arg2, -1412584499, arg3, Static108.aClass71Array1, arg4);
				Static108.aClass71Array1 = null;
			}
		} else if (arg3 == -1) {
			for (@Pc(24) int local24 = 0; local24 < 100; local24++) {
				Static73.aBooleanArray10[local24] = true;
			}
		} else {
			Static73.aBooleanArray10[arg3] = true;
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZI)Z")
	public static boolean method3322(@OriginalArg(1) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}
}
