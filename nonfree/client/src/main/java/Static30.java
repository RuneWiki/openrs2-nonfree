import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!br", name = "K", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!br", name = "V", descriptor = "I")
	public static int anInt822;

	@OriginalMember(owner = "client!br", name = "S", descriptor = "I")
	public static int anInt819 = 1;

	@OriginalMember(owner = "client!br", name = "T", descriptor = "I")
	public static int anInt820 = -1;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IIIIIIII)V")
	public static void method749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg6 + arg1;
		@Pc(15) int local15 = arg3 - arg1;
		for (@Pc(17) int local17 = arg6; local17 < local10; local17++) {
			Static247.method3552(arg0, arg2, Static332.anIntArrayArray56[local17], arg4);
		}
		@Pc(37) int local37 = arg1 + arg2;
		@Pc(45) int local45 = arg4 - arg1;
		for (@Pc(47) int local47 = arg3; local47 > local15; local47--) {
			Static247.method3552(arg0, arg2, Static332.anIntArrayArray56[local47], arg4);
		}
		for (@Pc(69) int local69 = local10; local69 <= local15; local69++) {
			@Pc(75) int[] local75 = Static332.anIntArrayArray56[local69];
			Static247.method3552(arg0, arg2, local75, local37);
			Static247.method3552(arg5, local37, local75, local45);
			Static247.method3552(arg0, local45, local75, arg4);
		}
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(IIB)V")
	public static void method751(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class27 local15 = Static140.method2608(arg0);
		@Pc(18) int local18 = local15.anInt828;
		@Pc(21) int local21 = local15.anInt833;
		@Pc(24) int local24 = local15.anInt826;
		@Pc(31) int local31 = Class107.anIntArray216[local24 - local21];
		if (arg1 < 0 || arg1 > local31) {
			arg1 = 0;
		}
		local31 <<= local21;
		Static112.method2250(local18, ~local31 & Static69.anIntArray80[local18] | local31 & arg1 << local21);
	}

	@OriginalMember(owner = "client!br", name = "i", descriptor = "(I)V")
	public static void method752() {
		Static26.aClass66_4.method1933();
	}
}
