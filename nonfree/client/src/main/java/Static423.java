import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!re", name = "e", descriptor = "I")
	public static int anInt78;

	@OriginalMember(owner = "client!re", name = "b", descriptor = "Lclient!h;")
	public static final Class125 aClass125_3 = new Class125(64);

	@OriginalMember(owner = "client!re", name = "d", descriptor = "[I")
	public static final int[] anIntArray12 = new int[32];

	@OriginalMember(owner = "client!re", name = "f", descriptor = "I")
	public static int anInt79 = 0;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIII)V")
	public static void method209(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg2 - arg4;
		@Pc(14) int local14 = arg4 + arg5;
		for (@Pc(16) int local16 = arg5; local16 < local14; local16++) {
			Static118.method2461(Static228.anIntArrayArray46[local16], arg0, arg3, arg1);
		}
		for (@Pc(32) int local32 = arg2; local32 > local10; local32--) {
			Static118.method2461(Static228.anIntArrayArray46[local32], arg0, arg3, arg1);
		}
		@Pc(51) int local51 = arg0 - arg4;
		@Pc(55) int local55 = arg4 + arg1;
		for (@Pc(62) int local62 = local14; local62 <= local10; local62++) {
			@Pc(68) int[] local68 = Static228.anIntArrayArray46[local62];
			Static118.method2461(local68, local55, arg3, arg1);
			Static118.method2461(local68, arg0, arg3, local51);
		}
	}
}
