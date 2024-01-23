import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "a", descriptor = "I")
	public static int anInt1 = 35632;

	@OriginalMember(owner = "client!a", name = "b", descriptor = "[I")
	private static int[] anIntArray1 = new int[2];

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!a;")
	public static Class1 method1(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(1) GL local1 = Static116.aGL1;
		@Pc(5) int local5 = local1.glCreateShaderObjectARB(arg1);
		local1.glShaderSourceARB(local5, 1, new String[] { arg0 }, new int[] { arg0.length() }, 0);
		local1.glCompileShaderARB(local5);
		local1.glGetObjectParameterivARB(local5, 35713, anIntArray1, 0);
		if (anIntArray1[0] == 0) {
			if (anIntArray1[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			local1.glGetObjectParameterivARB(local5, 35716, anIntArray1, 1);
			if (anIntArray1[1] > 1) {
				@Pc(59) byte[] local59 = new byte[anIntArray1[1]];
				local1.glGetInfoLogARB(local5, anIntArray1[1], anIntArray1, 0, local59, 0);
				System.out.println(new String(local59));
			}
			if (anIntArray1[0] == 0) {
				local1.glDeleteObjectARB(local5);
				return null;
			}
		}
		return new Class1(local5, arg1);
	}
}
