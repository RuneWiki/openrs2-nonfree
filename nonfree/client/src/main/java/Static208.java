import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "[I")
	private static int[] anIntArray376 = new int[2];

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "([Lclient!fc;)Lclient!qb;")
	public static Class134 method3314(@OriginalArg(0) Class43[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			if (arg0[local1] == null || arg0[local1].anInt1516 <= 0) {
				return null;
			}
		}
		@Pc(20) GL local20 = Static277.aGL1;
		@Pc(23) int local23 = local20.glCreateProgramObjectARB();
		@Pc(25) int local25;
		for (local25 = 0; local25 < arg0.length; local25++) {
			local20.glAttachObjectARB(local23, arg0[local25].anInt1516);
		}
		local20.glLinkProgramARB(local23);
		local20.glGetObjectParameterivARB(local23, 35714, anIntArray376, 0);
		if (anIntArray376[0] == 0) {
			if (anIntArray376[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			local20.glGetObjectParameterivARB(local23, 35716, anIntArray376, 1);
			if (anIntArray376[1] > 1) {
				@Pc(74) byte[] local74 = new byte[anIntArray376[1]];
				local20.glGetInfoLogARB(local23, anIntArray376[1], anIntArray376, 0, local74, 0);
				System.out.println(new String(local74));
			}
			if (anIntArray376[0] == 0) {
				for (local25 = 0; local25 < arg0.length; local25++) {
					local20.glDetachObjectARB(local23, arg0[local25].anInt1516);
				}
				local20.glDeleteObjectARB(local23);
				return null;
			}
		}
		return new Class134(local23, arg0);
	}
}
