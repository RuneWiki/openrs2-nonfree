import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!fia", name = "u", descriptor = "Ljava/lang/Object;")
	public static Object anObject8;

	@OriginalMember(owner = "client!fia", name = "n", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_41 = new Class218(94, 6);

	@OriginalMember(owner = "client!fia", name = "r", descriptor = "Z")
	public static boolean aBoolean323 = false;

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(Lclient!ck;[BIB)Lclient!ju;")
	public static Class168 method3327(@OriginalArg(0) Class33_Sub1_Sub1 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null || arg1.length == 0) {
			return null;
		}
		@Pc(16) long local16 = OpenGL.glCreateShaderObjectARB(arg2);
		OpenGL.glShaderSourceRawARB(local16, arg1);
		OpenGL.glCompileShaderARB(local16);
		OpenGL.glGetObjectParameterivARB(local16, 35713, Static277.anIntArray342, 0);
		if (Static277.anIntArray342[0] == 0) {
			if (Static277.anIntArray342[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local16, 35716, Static277.anIntArray342, 1);
			if (Static277.anIntArray342[1] > 1) {
				@Pc(57) byte[] local57 = new byte[Static277.anIntArray342[1]];
				OpenGL.glGetInfoLogARB(local16, Static277.anIntArray342[1], Static277.anIntArray342, 0, local57, 0);
				System.out.println(new String(local57));
			}
			if (Static277.anIntArray342[0] == 0) {
				OpenGL.glDeleteObjectARB(local16);
				return null;
			}
		}
		return new Class168(arg0, local16, arg2);
	}

	@OriginalMember(owner = "client!fia", name = "d", descriptor = "(II)I")
	public static int method3330(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
