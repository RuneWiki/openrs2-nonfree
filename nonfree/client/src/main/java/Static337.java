import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
	public static final int anInt6204 = -1;

	@OriginalMember(owner = "client!mk", name = "f", descriptor = "[I")
	public static final int[] anIntArray428 = new int[13];

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(BLclient!qj;ILjava/lang/String;)Lclient!af;")
	public static Class10 method5151(@OriginalArg(1) Class100_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg1);
		OpenGL.glShaderSourceARB(local6, arg2);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static143.anIntArray700, 0);
		if (Static143.anIntArray700[0] == 0) {
			if (Static143.anIntArray700[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static143.anIntArray700, 1);
			if (Static143.anIntArray700[1] > 1) {
				@Pc(52) byte[] local52 = new byte[Static143.anIntArray700[1]];
				OpenGL.glGetInfoLogARB(local6, Static143.anIntArray700[1], Static143.anIntArray700, 0, local52, 0);
				System.out.println(new String(local52));
			}
			if (Static143.anIntArray700[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class10(arg0, local6, arg1);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZII)I")
	public static int method5153(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(26) int local26 = ((arg1 & 0xFF00FF) * arg0 & 0xFF00FF00 | arg0 * (arg1 & 0xFF00) & 0xFF0000) >>> 8;
		@Pc(31) int local31 = 255 - arg0;
		return local26 + (((arg2 & 0xFF00FF) * local31 & 0xFF00FF00 | local31 * (arg2 & 0xFF00) & 0xFF0000) >>> 8);
	}
}
