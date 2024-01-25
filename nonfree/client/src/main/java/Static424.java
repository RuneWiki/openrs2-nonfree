import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static424 {

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "([BLclient!hl;II)Lclient!qv;")
	public static Class286 method7421(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class5_Sub2_Sub2 arg1) {
		if (arg0 == null) {
			return null;
		}
		@Pc(9) int local9 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local9);
		OpenGL.glProgramRawARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static8.anIntArray11, 0);
		if (Static8.anIntArray11[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class286(arg1, 34336, local9);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
