import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "[I")
	private static int[] anIntArray152 = new int[2];

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "([Lclient!vg;)Lclient!fg;")
	public static Class53 method1249(@OriginalArg(0) Class185[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			if (arg0[local1] == null || arg0[local1].anInt5849 <= 0) {
				return null;
			}
		}
		@Pc(20) GL local20 = Static283.aGL1;
		@Pc(23) int local23 = local20.glCreateProgramObjectARB();
		@Pc(25) int local25;
		for (local25 = 0; local25 < arg0.length; local25++) {
			local20.glAttachObjectARB(local23, arg0[local25].anInt5849);
		}
		local20.glLinkProgramARB(local23);
		local20.glGetObjectParameterivARB(local23, 35714, anIntArray152, 0);
		if (anIntArray152[0] == 0) {
			if (anIntArray152[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			local20.glGetObjectParameterivARB(local23, 35716, anIntArray152, 1);
			if (anIntArray152[1] > 1) {
				@Pc(74) byte[] local74 = new byte[anIntArray152[1]];
				local20.glGetInfoLogARB(local23, anIntArray152[1], anIntArray152, 0, local74, 0);
				System.out.println(new String(local74));
			}
			if (anIntArray152[0] == 0) {
				for (local25 = 0; local25 < arg0.length; local25++) {
					local20.glDetachObjectARB(local23, arg0[local25].anInt5849);
				}
				local20.glDeleteObjectARB(local23);
				return null;
			}
		}
		return new Class53(local23, arg0);
	}
}
