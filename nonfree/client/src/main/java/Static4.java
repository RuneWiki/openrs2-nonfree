import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
	public static int anInt74 = 35632;

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "[I")
	private static int[] anIntArray6 = new int[2];

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!ae;")
	public static Class5 method51(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(1) GL local1 = Static178.aGL1;
		@Pc(5) int local5 = local1.glCreateShaderObjectARB(arg1);
		local1.glShaderSourceARB(local5, 1, new String[] { arg0 }, new int[] { arg0.length() }, 0);
		local1.glCompileShaderARB(local5);
		local1.glGetObjectParameterivARB(local5, 35713, anIntArray6, 0);
		if (anIntArray6[0] == 0) {
			if (anIntArray6[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			local1.glGetObjectParameterivARB(local5, 35716, anIntArray6, 1);
			if (anIntArray6[1] > 1) {
				@Pc(59) byte[] local59 = new byte[anIntArray6[1]];
				local1.glGetInfoLogARB(local5, anIntArray6[1], anIntArray6, 0, local59, 0);
				System.out.println(new String(local59));
			}
			if (anIntArray6[0] == 0) {
				local1.glDeleteObjectARB(local5);
				return null;
			}
		}
		return new Class5(local5, arg1);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "()V")
	public static void method52() {
		anIntArray6 = null;
	}
}
