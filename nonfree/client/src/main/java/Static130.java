import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "[I")
	private static int[] anIntArray222 = new int[2];

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "([Lclient!ef;)Lclient!jj;")
	public static Class84 method2141(@OriginalArg(0) Class41[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			if (arg0[local1] == null || arg0[local1].anInt1363 <= 0) {
				return null;
			}
		}
		@Pc(20) GL local20 = Static251.aGL1;
		@Pc(23) int local23 = local20.glCreateProgramObjectARB();
		@Pc(25) int local25;
		for (local25 = 0; local25 < arg0.length; local25++) {
			local20.glAttachObjectARB(local23, arg0[local25].anInt1363);
		}
		local20.glLinkProgramARB(local23);
		local20.glGetObjectParameterivARB(local23, 35714, anIntArray222, 0);
		if (anIntArray222[0] == 0) {
			if (anIntArray222[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			local20.glGetObjectParameterivARB(local23, 35716, anIntArray222, 1);
			if (anIntArray222[1] > 1) {
				@Pc(74) byte[] local74 = new byte[anIntArray222[1]];
				local20.glGetInfoLogARB(local23, anIntArray222[1], anIntArray222, 0, local74, 0);
				System.out.println(new String(local74));
			}
			if (anIntArray222[0] == 0) {
				for (local25 = 0; local25 < arg0.length; local25++) {
					local20.glDetachObjectARB(local23, arg0[local25].anInt1363);
				}
				local20.glDeleteObjectARB(local23);
				return null;
			}
		}
		return new Class84(local23, arg0);
	}
}
