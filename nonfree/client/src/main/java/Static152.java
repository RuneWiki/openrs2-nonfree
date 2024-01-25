import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!ffa", name = "h", descriptor = "Lclient!wu;")
	public static Class384 aClass384_39;

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I[BLclient!laa;B)Lclient!ow;")
	public static Class266 method2212(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class126_Sub2_Sub1 arg1) {
		if (arg0 == null) {
			return null;
		}
		@Pc(14) int local14 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local14);
		OpenGL.glProgramRawARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static314.anIntArray490, 0);
		if (Static314.anIntArray490[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class266(arg1, 34336, local14);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
