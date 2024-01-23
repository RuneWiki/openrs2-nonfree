import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!si", name = "c", descriptor = "[I")
	private static int[] anIntArray441 = new int[2];

	@OriginalMember(owner = "client!si", name = "a", descriptor = "([Lclient!sm;)Lclient!si;")
	public static Class158 method3937(@OriginalArg(0) Class160[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			if (arg0[local1] == null || arg0[local1].anInt4909 <= 0) {
				return null;
			}
		}
		@Pc(20) GL local20 = Static60.aGL1;
		@Pc(23) int local23 = local20.glCreateProgramObjectARB();
		@Pc(25) int local25;
		for (local25 = 0; local25 < arg0.length; local25++) {
			local20.glAttachObjectARB(local23, arg0[local25].anInt4909);
		}
		local20.glLinkProgramARB(local23);
		local20.glGetObjectParameterivARB(local23, 35714, anIntArray441, 0);
		if (anIntArray441[0] == 0) {
			if (anIntArray441[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			local20.glGetObjectParameterivARB(local23, 35716, anIntArray441, 1);
			if (anIntArray441[1] > 1) {
				@Pc(74) byte[] local74 = new byte[anIntArray441[1]];
				local20.glGetInfoLogARB(local23, anIntArray441[1], anIntArray441, 0, local74, 0);
				System.out.println(new String(local74));
			}
			if (anIntArray441[0] == 0) {
				for (local25 = 0; local25 < arg0.length; local25++) {
					local20.glDetachObjectARB(local23, arg0[local25].anInt4909);
				}
				local20.glDeleteObjectARB(local23);
				return null;
			}
		}
		return new Class158(local23, arg0);
	}
}
