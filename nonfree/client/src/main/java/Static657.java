import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static657 {

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
	public static int anInt10586;

	@OriginalMember(owner = "client!wf", name = "f", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_104 = new Class305(4, -1);

	@OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
	public static int anInt10590 = -1;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(B[BILclient!jc;)Lclient!via;")
	public static Class370 method8803(@OriginalArg(1) byte[] arg0, @OriginalArg(3) Class65_Sub2_Sub2 arg1) {
		if (arg0 == null) {
			return null;
		}
		@Pc(9) int local9 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local9);
		OpenGL.glProgramRawARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static78.anIntArray65, 0);
		if (Static78.anIntArray65[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class370(arg1, 34336, local9);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
