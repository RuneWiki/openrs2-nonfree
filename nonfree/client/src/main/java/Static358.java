import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "[I")
	private static final int[] anIntArray506 = new int[2];

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!ks;[Lclient!qg;)Lclient!wg;")
	public static Class219 method5932(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) Class170[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg1.length; local1++) {
			if (arg1[local1] == null || arg1[local1].anInt5176 <= 0) {
				return null;
			}
		}
		@Pc(21) opengl local21 = arg0.anOpengl1;
		@Pc(24) int local24 = local21.glCreateProgramObjectARB();
		@Pc(26) int local26;
		for (local26 = 0; local26 < arg1.length; local26++) {
			local21.glAttachObjectARB(local24, arg1[local26].anInt5176);
		}
		local21.glLinkProgramARB(local24);
		local21.glGetObjectParameterivARB(local24, 35714, anIntArray506, 0);
		if (anIntArray506[0] == 0) {
			if (anIntArray506[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			local21.glGetObjectParameterivARB(local24, 35716, anIntArray506, 1);
			if (anIntArray506[1] > 1) {
				@Pc(75) byte[] local75 = new byte[anIntArray506[1]];
				local21.glGetInfoLogARB(local24, anIntArray506[1], anIntArray506, 0, local75, 0);
				System.out.println(new String(local75));
			}
			if (anIntArray506[0] == 0) {
				for (local26 = 0; local26 < arg1.length; local26++) {
					local21.glDetachObjectARB(local24, arg1[local26].anInt5176);
				}
				local21.glDeleteObjectARB(local24);
				return null;
			}
		}
		return new Class219(arg0, local24, arg1);
	}
}
