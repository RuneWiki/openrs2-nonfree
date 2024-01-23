import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
	public static int anInt5848 = 35632;

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "[I")
	private static int[] anIntArray605 = new int[2];

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!vg;")
	public static Class185 method4802(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(1) GL local1 = Static283.aGL1;
		@Pc(5) int local5 = local1.glCreateShaderObjectARB(arg1);
		local1.glShaderSourceARB(local5, 1, new String[] { arg0 }, new int[] { arg0.length() }, 0);
		local1.glCompileShaderARB(local5);
		local1.glGetObjectParameterivARB(local5, 35713, anIntArray605, 0);
		if (anIntArray605[0] == 0) {
			if (anIntArray605[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			local1.glGetObjectParameterivARB(local5, 35716, anIntArray605, 1);
			if (anIntArray605[1] > 1) {
				@Pc(59) byte[] local59 = new byte[anIntArray605[1]];
				local1.glGetInfoLogARB(local5, anIntArray605[1], anIntArray605, 0, local59, 0);
				System.out.println(new String(local59));
			}
			if (anIntArray605[0] == 0) {
				local1.glDeleteObjectARB(local5);
				return null;
			}
		}
		return new Class185(local5, arg1);
	}
}
