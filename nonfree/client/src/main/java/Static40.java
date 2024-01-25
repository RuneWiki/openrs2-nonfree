import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "[I")
	private static final int[] anIntArray70 = new int[2];

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!mi;[Lclient!wi;)Lclient!cd;")
	public static Class37 method645(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) Class247[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg1.length; local1++) {
			if (arg1[local1] == null || arg1[local1].anInt6436 <= 0) {
				return null;
			}
		}
		@Pc(21) opengl local21 = arg0.anOpengl1;
		@Pc(24) int local24 = local21.glCreateProgramObjectARB();
		@Pc(26) int local26;
		for (local26 = 0; local26 < arg1.length; local26++) {
			local21.glAttachObjectARB(local24, arg1[local26].anInt6436);
		}
		local21.glLinkProgramARB(local24);
		local21.glGetObjectParameterivARB(local24, 35714, anIntArray70, 0);
		if (anIntArray70[0] == 0) {
			if (anIntArray70[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			local21.glGetObjectParameterivARB(local24, 35716, anIntArray70, 1);
			if (anIntArray70[1] > 1) {
				@Pc(75) byte[] local75 = new byte[anIntArray70[1]];
				local21.glGetInfoLogARB(local24, anIntArray70[1], anIntArray70, 0, local75, 0);
				System.out.println(new String(local75));
			}
			if (anIntArray70[0] == 0) {
				for (local26 = 0; local26 < arg1.length; local26++) {
					local21.glDetachObjectARB(local24, arg1[local26].anInt6436);
				}
				local21.glDeleteObjectARB(local24);
				return null;
			}
		}
		return new Class37(arg0, local24, arg1);
	}
}
