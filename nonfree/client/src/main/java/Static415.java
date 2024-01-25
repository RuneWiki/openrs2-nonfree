import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!um", name = "a", descriptor = "Lclient!um;")
	public static Class243 aClass243_237;

	@OriginalMember(owner = "client!um", name = "F", descriptor = "I")
	public static int anInt6927;

	@OriginalMember(owner = "client!um", name = "I", descriptor = "[[B")
	public static byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!um", name = "J", descriptor = "[[B")
	public static byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!um", name = "P", descriptor = "[I")
	public static int[] anIntArray471;

	@OriginalMember(owner = "client!um", name = "i", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_182 = new Class129(105, 8);

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIIIII)V")
	public static void method5479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg4 - arg0;
		@Pc(14) int local14 = arg1 + arg0;
		for (@Pc(16) int local16 = arg1; local16 < local14; local16++) {
			Static291.method3606(arg3, Static133.anIntArrayArray15[local16], arg5, arg2);
		}
		for (@Pc(44) int local44 = arg4; local44 > local10; local44--) {
			Static291.method3606(arg3, Static133.anIntArrayArray15[local44], arg5, arg2);
		}
		@Pc(63) int local63 = arg3 - arg0;
		@Pc(67) int local67 = arg0 + arg2;
		for (@Pc(69) int local69 = local14; local69 <= local10; local69++) {
			@Pc(75) int[] local75 = Static133.anIntArrayArray15[local69];
			Static291.method3606(local67, local75, arg5, arg2);
			Static291.method3606(arg3, local75, arg5, local63);
		}
	}
}
