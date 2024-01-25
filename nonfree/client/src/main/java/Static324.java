import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!lj", name = "I", descriptor = "Lclient!cd;")
	public static Class12 aClass12_1;

	@OriginalMember(owner = "client!lj", name = "q", descriptor = "I")
	public static int anInt5141 = 0;

	@OriginalMember(owner = "client!lj", name = "v", descriptor = "I")
	public static int anInt5144 = 0;

	@OriginalMember(owner = "client!lj", name = "w", descriptor = "I")
	public static int anInt5145 = 0;

	@OriginalMember(owner = "client!lj", name = "y", descriptor = "I")
	public static final int anInt5147 = 1403;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ljava/lang/String;BIZI)V")
	public static void method4331(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static346.method4638(arg0, arg1, false, arg3, arg2, null);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILjava/lang/String;Lclient!ep;I)Lclient!sea;")
	public static Class315 method4332(@OriginalArg(1) String arg0, @OriginalArg(2) Class95_Sub1 arg1) {
		@Pc(14) int local14 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local14);
		OpenGL.glProgramStringARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static72.anIntArray100, 0);
		if (Static72.anIntArray100[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class315(arg1, 34336, local14);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
