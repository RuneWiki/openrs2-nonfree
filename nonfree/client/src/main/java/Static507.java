import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static507 {

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILjava/lang/String;Lclient!uja;I)Lclient!dma;")
	public static Class87 method7183(@OriginalArg(1) String arg0, @OriginalArg(2) Class145_Sub3 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg2);
		OpenGL.glShaderSourceARB(local6, arg0);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static109.anIntArray139, 0);
		if (Static109.anIntArray139[0] == 0) {
			if (Static109.anIntArray139[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static109.anIntArray139, 1);
			if (Static109.anIntArray139[1] > 1) {
				@Pc(56) byte[] local56 = new byte[Static109.anIntArray139[1]];
				OpenGL.glGetInfoLogARB(local6, Static109.anIntArray139[1], Static109.anIntArray139, 0, local56, 0);
				System.out.println(new String(local56));
			}
			if (Static109.anIntArray139[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class87(arg1, local6, arg2);
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(III)Z")
	public static boolean method7185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
