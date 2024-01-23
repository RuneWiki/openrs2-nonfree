import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
	public static int anInt1200 = 35632;

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "[I")
	private static int[] anIntArray91 = new int[2];

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!ec;")
	public static Class43 method991(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(1) GL local1 = Static94.aGL1;
		@Pc(5) int local5 = local1.glCreateShaderObjectARB(arg1);
		local1.glShaderSourceARB(local5, 1, new String[] { arg0 }, new int[] { arg0.length() }, 0);
		local1.glCompileShaderARB(local5);
		local1.glGetObjectParameterivARB(local5, 35713, anIntArray91, 0);
		if (anIntArray91[0] == 0) {
			if (anIntArray91[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			local1.glGetObjectParameterivARB(local5, 35716, anIntArray91, 1);
			if (anIntArray91[1] > 1) {
				@Pc(59) byte[] local59 = new byte[anIntArray91[1]];
				local1.glGetInfoLogARB(local5, anIntArray91[1], anIntArray91, 0, local59, 0);
				System.out.println(new String(local59));
			}
			if (anIntArray91[0] == 0) {
				local1.glDeleteObjectARB(local5);
				return null;
			}
		}
		return new Class43(local5, arg1);
	}
}
