import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!f", name = "j", descriptor = "I")
	public static int anInt2680;

	@OriginalMember(owner = "client!f", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString29;

	@OriginalMember(owner = "client!f", name = "c", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_51 = new Class268(100, -2);

	@OriginalMember(owner = "client!f", name = "i", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_52 = new Class268(43, 4);

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILjava/lang/String;Lclient!wh;B)Lclient!wj;")
	public static Class375 method2295(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class100_Sub3 arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg0);
		OpenGL.glShaderSourceARB(local6, arg1);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static628.anIntArray634, 0);
		if (Static628.anIntArray634[0] == 0) {
			if (Static628.anIntArray634[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static628.anIntArray634, 1);
			if (Static628.anIntArray634[1] > 1) {
				@Pc(50) byte[] local50 = new byte[Static628.anIntArray634[1]];
				OpenGL.glGetInfoLogARB(local6, Static628.anIntArray634[1], Static628.anIntArray634, 0, local50, 0);
				System.out.println(new String(local50));
			}
			if (Static628.anIntArray634[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class375(arg2, local6, arg0);
	}
}
