import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static646 {

	@OriginalMember(owner = "client!vs", name = "p", descriptor = "[F")
	public static final float[] aFloatArray77 = new float[2];

	@OriginalMember(owner = "client!vs", name = "s", descriptor = "I")
	public static int anInt10162 = 0;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IB[BLclient!nv;)Lclient!pj;")
	public static Class284 method8603(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class33_Sub2_Sub1 arg2) {
		if (arg1 == null || arg1.length == 0) {
			return null;
		}
		@Pc(13) long local13 = OpenGL.glCreateShaderObjectARB(arg0);
		OpenGL.glShaderSourceRawARB(local13, arg1);
		OpenGL.glCompileShaderARB(local13);
		OpenGL.glGetObjectParameterivARB(local13, 35713, Static554.anIntArray565, 0);
		if (Static554.anIntArray565[0] == 0) {
			if (Static554.anIntArray565[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local13, 35716, Static554.anIntArray565, 1);
			if (Static554.anIntArray565[1] > 1) {
				@Pc(56) byte[] local56 = new byte[Static554.anIntArray565[1]];
				OpenGL.glGetInfoLogARB(local13, Static554.anIntArray565[1], Static554.anIntArray565, 0, local56, 0);
				System.out.println(new String(local56));
			}
			if (Static554.anIntArray565[0] == 0) {
				OpenGL.glDeleteObjectARB(local13);
				return null;
			}
		}
		return new Class284(arg2, local13, arg0);
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V")
	public static void method8605() {
		Static281.aClass163_25 = new Class163();
	}
}
