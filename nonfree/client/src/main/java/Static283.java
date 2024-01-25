import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(B[BLclient!rda;I)Lclient!de;")
	public static Class84 method4153(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class57_Sub3_Sub1 arg1) {
		if (arg0 == null) {
			return null;
		}
		@Pc(10) int local10 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local10);
		OpenGL.glProgramRawARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static372.anIntArray486, 0);
		if (Static372.anIntArray486[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class84(arg1, 34336, local10);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
