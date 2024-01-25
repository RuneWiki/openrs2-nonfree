import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!nv", name = "u", descriptor = "Lclient!jo;")
	public static Class168 aClass168_86;

	@OriginalMember(owner = "client!nv", name = "z", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!nv", name = "v", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_76 = new Class181(14, 11);

	@OriginalMember(owner = "client!nv", name = "y", descriptor = "[[I")
	public static final int[][] anIntArrayArray47 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!nfa;[BBI)Lclient!uaa;")
	public static Class311 method5768(@OriginalArg(0) Class9_Sub3_Sub2 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg1 == null) {
			return null;
		}
		@Pc(14) int local14 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local14);
		OpenGL.glProgramRawARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static572.anIntArray830, 0);
		if (Static572.anIntArray830[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class311(arg0, 34336, local14);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
