import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!es", name = "M", descriptor = "Z")
	public static boolean aBoolean133 = false;

	@OriginalMember(owner = "client!es", name = "P", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_59 = new Class151("Self", "Mich", "Moi", "Eu");

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IIBIIIII)V")
	public static void method1463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(16) int local16 = Static63.method971(Static74.anInt1413, arg6, Static149.anInt7384);
		@Pc(22) int local22 = Static63.method971(Static74.anInt1413, arg5, Static149.anInt7384);
		@Pc(28) int local28 = Static63.method971(Static271.anInt4271, arg2, Static13.anInt263);
		@Pc(34) int local34 = Static63.method971(Static271.anInt4271, arg3, Static13.anInt263);
		@Pc(42) int local42 = Static63.method971(Static74.anInt1413, arg6 + arg4, Static149.anInt7384);
		@Pc(51) int local51 = Static63.method971(Static74.anInt1413, arg5 - arg4, Static149.anInt7384);
		for (@Pc(53) int local53 = local16; local53 < local42; local53++) {
			Static298.method3891(local34, local28, Static106.anIntArrayArray46[local53], arg1);
		}
		for (@Pc(73) int local73 = local22; local73 > local51; local73--) {
			Static298.method3891(local34, local28, Static106.anIntArrayArray46[local73], arg1);
		}
		@Pc(97) int local97 = Static63.method971(Static271.anInt4271, arg4 + arg2, Static13.anInt263);
		@Pc(106) int local106 = Static63.method971(Static271.anInt4271, arg3 - arg4, Static13.anInt263);
		for (@Pc(108) int local108 = local42; local108 <= local51; local108++) {
			@Pc(114) int[] local114 = Static106.anIntArrayArray46[local108];
			Static298.method3891(local97, local28, local114, arg1);
			Static298.method3891(local106, local97, local114, arg0);
			Static298.method3891(local34, local106, local114, arg1);
		}
	}

	@OriginalMember(owner = "client!es", name = "e", descriptor = "(I)V")
	public static void method1464() {
		Static38.aClass128_9.V(Static354.anInt5870, Static336.aClass106_Sub1_1.aBoolean474 ? Static121.anInt2075 + 256 << 0 : -1, 256);
	}

	@OriginalMember(owner = "client!es", name = "f", descriptor = "(I)V")
	public static void method1466() {
		Static434.aClass55_2 = new Class55(8);
		Static109.anInt1929 = 0;
		for (@Pc(21) Class13_Sub2 local21 = (Class13_Sub2) Static358.aClass227_5.method4827(); local21 != null; local21 = (Class13_Sub2) Static358.aClass227_5.method4834()) {
			local21.method705();
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IIIIBII)V")
	public static void method1467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg1 - arg2;
		@Pc(15) int local15 = arg5 + arg2;
		for (@Pc(17) int local17 = arg5; local17 < local15; local17++) {
			Static298.method3891(arg3, arg0, Static106.anIntArrayArray46[local17], arg4);
		}
		@Pc(35) int local35 = arg3 - arg2;
		for (@Pc(37) int local37 = arg1; local37 > local10; local37--) {
			Static298.method3891(arg3, arg0, Static106.anIntArrayArray46[local37], arg4);
		}
		@Pc(59) int local59 = arg2 + arg0;
		for (@Pc(61) int local61 = local15; local61 <= local10; local61++) {
			@Pc(67) int[] local67 = Static106.anIntArrayArray46[local61];
			Static298.method3891(local59, arg0, local67, arg4);
			Static298.method3891(arg3, local35, local67, arg4);
		}
	}
}
