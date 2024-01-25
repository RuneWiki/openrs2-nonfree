import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
	public static int anInt6401;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "[I")
	public static final int[] anIntArray396 = new int[250];

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIZIIII)V")
	public static void method4927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg1 - arg4;
		@Pc(14) int local14 = arg4 + arg6;
		for (@Pc(16) int local16 = arg6; local16 < local14; local16++) {
			Static298.method3891(arg0, arg2, Static106.anIntArrayArray46[local16], arg5);
		}
		for (@Pc(40) int local40 = arg1; local40 > local10; local40--) {
			Static298.method3891(arg0, arg2, Static106.anIntArrayArray46[local40], arg5);
		}
		@Pc(59) int local59 = arg0 - arg4;
		@Pc(63) int local63 = arg2 + arg4;
		for (@Pc(65) int local65 = local14; local65 <= local10; local65++) {
			@Pc(71) int[] local71 = Static106.anIntArrayArray46[local65];
			Static298.method3891(local63, arg2, local71, arg5);
			Static298.method3891(local59, local63, local71, arg3);
			Static298.method3891(arg0, local59, local71, arg5);
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!od;Ljava/lang/String;IB)Lclient!dd;")
	public static Class48 method4928(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) String arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static414.anIntArray450, 0);
		if (Static414.anIntArray450[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class48(arg0, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
