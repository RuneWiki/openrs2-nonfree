import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
	public static int anInt1517 = 35632;

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "[I")
	private static int[] anIntArray144 = new int[2];

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!fc;")
	public static Class43 method1263(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(1) GL local1 = Static277.aGL1;
		@Pc(5) int local5 = local1.glCreateShaderObjectARB(arg1);
		local1.glShaderSourceARB(local5, 1, new String[] { arg0 }, new int[] { arg0.length() }, 0);
		local1.glCompileShaderARB(local5);
		local1.glGetObjectParameterivARB(local5, 35713, anIntArray144, 0);
		if (anIntArray144[0] == 0) {
			if (anIntArray144[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			local1.glGetObjectParameterivARB(local5, 35716, anIntArray144, 1);
			if (anIntArray144[1] > 1) {
				@Pc(59) byte[] local59 = new byte[anIntArray144[1]];
				local1.glGetInfoLogARB(local5, anIntArray144[1], anIntArray144, 0, local59, 0);
				System.out.println(new String(local59));
			}
			if (anIntArray144[0] == 0) {
				local1.glDeleteObjectARB(local5);
				return null;
			}
		}
		return new Class43(local5, arg1);
	}
}
