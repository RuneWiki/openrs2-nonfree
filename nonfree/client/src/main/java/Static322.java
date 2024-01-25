import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!um", name = "b", descriptor = "I")
	public static int anInt6101 = 0;

	@OriginalMember(owner = "client!um", name = "f", descriptor = "[I")
	public static final int[] anIntArray525 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!um", name = "g", descriptor = "I")
	public static int anInt6105 = 0;

	@OriginalMember(owner = "client!um", name = "i", descriptor = "I")
	public static int anInt6107 = 0;

	@OriginalMember(owner = "client!um", name = "j", descriptor = "Z")
	public static boolean aBoolean457 = true;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(CI)Z")
	public static boolean method5425(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Z)V")
	public static void method5426() {
		for (@Pc(6) Class63_Sub5 local6 = (Class63_Sub5) Static337.aClass24_6.method619(); local6 != null; local6 = (Class63_Sub5) Static337.aClass24_6.method627()) {
			local6.method4120();
		}
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(I)V")
	public static void method5428() {
		Static293.method4971(25);
		Static247.method3557();
		System.gc();
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIIIII)V")
	public static void method5429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg5 - arg1;
		@Pc(14) int local14 = arg1 + arg3;
		for (@Pc(16) int local16 = arg3; local16 < local14; local16++) {
			Static247.method3552(arg0, arg2, Static332.anIntArrayArray56[local16], arg4);
		}
		@Pc(39) int local39 = arg4 - arg1;
		for (@Pc(41) int local41 = arg5; local41 > local10; local41--) {
			Static247.method3552(arg0, arg2, Static332.anIntArrayArray56[local41], arg4);
		}
		@Pc(67) int local67 = arg1 + arg2;
		for (@Pc(69) int local69 = local14; local69 <= local10; local69++) {
			@Pc(75) int[] local75 = Static332.anIntArrayArray56[local69];
			Static247.method3552(arg0, arg2, local75, local67);
			Static247.method3552(arg0, local39, local75, arg4);
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!ra;ILclient!ra;)V")
	public static void method5430(@OriginalArg(0) Class170 arg0, @OriginalArg(2) Class170 arg1) {
		Static129.aClass170_54 = arg0;
		Static208.aClass170_76 = arg1;
		Static208.aClass170_76.method4575(34);
	}
}
