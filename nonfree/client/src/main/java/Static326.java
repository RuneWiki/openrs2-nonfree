import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!no", name = "J", descriptor = "Lclient!jc;")
	public static final Class145 aClass145_6 = new Class145();

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(BLclient!kda;)V")
	public static void method5319(@OriginalArg(1) Class160 arg0) {
		Static409.aClass160_83 = arg0;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ILjava/lang/String;BLclient!te;)Lclient!kh;")
	public static Class162 method5320(@OriginalArg(1) String arg0, @OriginalArg(3) Class9_Sub3 arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static310.anIntArray420, 0);
		if (Static310.anIntArray420[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class162(arg1, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IIBIIII)V")
	public static void method5321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = arg5 - arg4;
		@Pc(20) int local20 = arg1 + arg4;
		for (@Pc(22) int local22 = arg1; local22 < local20; local22++) {
			Static227.method7421(arg0, arg2, arg3, Static81.anIntArrayArray25[local22]);
		}
		for (@Pc(42) int local42 = arg5; local42 > local15; local42--) {
			Static227.method7421(arg0, arg2, arg3, Static81.anIntArrayArray25[local42]);
		}
		@Pc(65) int local65 = arg3 - arg4;
		@Pc(69) int local69 = arg4 + arg0;
		for (@Pc(71) int local71 = local20; local71 <= local15; local71++) {
			@Pc(77) int[] local77 = Static81.anIntArrayArray25[local71];
			Static227.method7421(arg0, arg2, local69, local77);
			Static227.method7421(local65, arg2, arg3, local77);
		}
	}
}
