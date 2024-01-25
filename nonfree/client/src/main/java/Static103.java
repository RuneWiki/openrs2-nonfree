import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!fa", name = "F", descriptor = "I")
	public static int anInt1877 = 0;

	@OriginalMember(owner = "client!fa", name = "J", descriptor = "Lclient!qh;")
	public static final Class208 aClass208_1 = new Class208();

	@OriginalMember(owner = "client!fa", name = "K", descriptor = "[I")
	public static final int[] anIntArray143 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ljava/lang/String;IILclient!ug;)Lclient!sl;")
	public static Class228 method1539(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class135_Sub2 arg2) {
		@Pc(11) long local11 = OpenGL.glCreateShaderObjectARB(arg1);
		OpenGL.glShaderSourceARB(local11, arg0);
		OpenGL.glCompileShaderARB(local11);
		OpenGL.glGetObjectParameterivARB(local11, 35713, Static451.anIntArray569, 0);
		if (Static451.anIntArray569[0] == 0) {
			if (Static451.anIntArray569[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local11, 35716, Static451.anIntArray569, 1);
			if (Static451.anIntArray569[1] > 1) {
				@Pc(49) byte[] local49 = new byte[Static451.anIntArray569[1]];
				OpenGL.glGetInfoLogARB(local11, Static451.anIntArray569[1], Static451.anIntArray569, 0, local49, 0);
				System.out.println(new String(local49));
			}
			if (Static451.anIntArray569[0] == 0) {
				OpenGL.glDeleteObjectARB(local11);
				return null;
			}
		}
		return new Class228(arg2, local11, arg1);
	}
}
