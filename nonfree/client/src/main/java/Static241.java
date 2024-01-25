import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "[I")
	private static final int[] anIntArray535 = new int[2];

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!qi;[Lclient!fg;)Lclient!nn;")
	public static Class163 method3891(@OriginalArg(0) Class82_Sub2 arg0, @OriginalArg(1) Class73[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg1.length; local1++) {
			if (arg1[local1] == null || arg1[local1].anInt1793 <= 0) {
				return null;
			}
		}
		@Pc(21) opengl local21 = arg0.anOpengl2;
		@Pc(24) int local24 = local21.glCreateProgramObjectARB();
		@Pc(26) int local26;
		for (local26 = 0; local26 < arg1.length; local26++) {
			local21.glAttachObjectARB(local24, arg1[local26].anInt1793);
		}
		local21.glLinkProgramARB(local24);
		local21.glGetObjectParameterivARB(local24, 35714, anIntArray535, 0);
		if (anIntArray535[0] == 0) {
			if (anIntArray535[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			local21.glGetObjectParameterivARB(local24, 35716, anIntArray535, 1);
			if (anIntArray535[1] > 1) {
				@Pc(75) byte[] local75 = new byte[anIntArray535[1]];
				local21.glGetInfoLogARB(local24, anIntArray535[1], anIntArray535, 0, local75, 0);
				System.out.println(new String(local75));
			}
			if (anIntArray535[0] == 0) {
				for (local26 = 0; local26 < arg1.length; local26++) {
					local21.glDetachObjectARB(local24, arg1[local26].anInt1793);
				}
				local21.glDeleteObjectARB(local24);
				return null;
			}
		}
		return new Class163(arg0, local24, arg1);
	}
}
