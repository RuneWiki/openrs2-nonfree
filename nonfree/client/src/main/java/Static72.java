import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "[I")
	private static int[] anIntArray126 = new int[2];

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "([Lclient!mo;)Lclient!fe;")
	public static Class51 method1419(@OriginalArg(0) Class113[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			if (arg0[local1] == null || arg0[local1].anInt3426 <= 0) {
				return null;
			}
		}
		@Pc(20) GL local20 = Static71.aGL1;
		@Pc(23) int local23 = local20.glCreateProgramObjectARB();
		@Pc(25) int local25;
		for (local25 = 0; local25 < arg0.length; local25++) {
			local20.glAttachObjectARB(local23, arg0[local25].anInt3426);
		}
		local20.glLinkProgramARB(local23);
		local20.glGetObjectParameterivARB(local23, 35714, anIntArray126, 0);
		if (anIntArray126[0] == 0) {
			if (anIntArray126[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			local20.glGetObjectParameterivARB(local23, 35716, anIntArray126, 1);
			if (anIntArray126[1] > 1) {
				@Pc(74) byte[] local74 = new byte[anIntArray126[1]];
				local20.glGetInfoLogARB(local23, anIntArray126[1], anIntArray126, 0, local74, 0);
				System.out.println(new String(local74));
			}
			if (anIntArray126[0] == 0) {
				for (local25 = 0; local25 < arg0.length; local25++) {
					local20.glDetachObjectARB(local23, arg0[local25].anInt3426);
				}
				local20.glDeleteObjectARB(local23);
				return null;
			}
		}
		return new Class51(local23, arg0);
	}
}
