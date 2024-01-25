import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(ILclient!ag;B[B)Lclient!oba;")
	public static Class212 method3373(@OriginalArg(1) Class9_Sub1_Sub1 arg0, @OriginalArg(3) byte[] arg1) {
		if (arg1 == null) {
			return null;
		}
		@Pc(9) int local9 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local9);
		OpenGL.glProgramRawARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static284.anIntArray402, 0);
		if (Static284.anIntArray402[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class212(arg0, 34336, local9);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(II)I")
	public static int method3374(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}
