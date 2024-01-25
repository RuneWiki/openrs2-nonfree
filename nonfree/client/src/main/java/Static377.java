import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!w", name = "a", descriptor = "[I")
	private static final int[] anIntArray580 = new int[2];

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!ic;[Lclient!hr;)Lclient!w;")
	public static Class242 method5963(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) Class101[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg1.length; local1++) {
			if (arg1[local1] == null || arg1[local1].anInt2948 <= 0) {
				return null;
			}
		}
		@Pc(21) opengl local21 = arg0.anOpengl2;
		@Pc(24) int local24 = local21.glCreateProgramObjectARB();
		@Pc(26) int local26;
		for (local26 = 0; local26 < arg1.length; local26++) {
			local21.glAttachObjectARB(local24, arg1[local26].anInt2948);
		}
		local21.glLinkProgramARB(local24);
		local21.glGetObjectParameterivARB(local24, 35714, anIntArray580, 0);
		if (anIntArray580[0] == 0) {
			if (anIntArray580[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			local21.glGetObjectParameterivARB(local24, 35716, anIntArray580, 1);
			if (anIntArray580[1] > 1) {
				@Pc(75) byte[] local75 = new byte[anIntArray580[1]];
				local21.glGetInfoLogARB(local24, anIntArray580[1], anIntArray580, 0, local75, 0);
				System.out.println(new String(local75));
			}
			if (anIntArray580[0] == 0) {
				for (local26 = 0; local26 < arg1.length; local26++) {
					local21.glDetachObjectARB(local24, arg1[local26].anInt2948);
				}
				local21.glDeleteObjectARB(local24);
				return null;
			}
		}
		return new Class242(arg0, local24, arg1);
	}
}
