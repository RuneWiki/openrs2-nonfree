import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_61 = new Class306("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method4469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class255 local7 = Static242.aClass255ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class63 local13 = local7.aClass63_3; local13 != null; local13 = local13.aClass63_1) {
			@Pc(17) Class49_Sub2 local17 = local13.aClass49_Sub2_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort117 == arg1 && local17.aShort116 == arg2) {
				Static158.method2475(local17);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(BLclient!uq;ILjava/lang/String;)Lclient!qj;")
	public static Class248 method4470(@OriginalArg(1) Class122_Sub3 arg0, @OriginalArg(3) String arg1) {
		@Pc(10) int local10 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local10);
		OpenGL.glProgramStringARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static538.anIntArray839, 0);
		if (Static538.anIntArray839[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class248(arg0, 34336, local10);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
