import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!bf;[Lclient!cg;)Lclient!oa;", line = 23)
	public static Class166 method4242(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) Class35[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg1.length; local1++) {
			if (arg1[local1] == null || arg1[local1].anInt1009 <= 0) {
				return null;
			}
		}
		@Pc(21) opengl local21 = arg0.anOpengl1;
		@Pc(24) int local24 = local21.glCreateProgramObjectARB();
		@Pc(26) int local26;
		for (local26 = 0; local26 < arg1.length; local26++) {
			local21.glAttachObjectARB(local24, arg1[local26].anInt1009);
		}
		local21.glLinkProgramARB(local24);
		local21.glGetObjectParameterivARB(local24, 35714, Class166.anIntArray293, 0);
		if (Class166.anIntArray293[0] == 0) {
			if (Class166.anIntArray293[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			local21.glGetObjectParameterivARB(local24, 35716, Class166.anIntArray293, 1);
			if (Class166.anIntArray293[1] > 1) {
				@Pc(75) byte[] local75 = new byte[Class166.anIntArray293[1]];
				local21.glGetInfoLogARB(local24, Class166.anIntArray293[1], Class166.anIntArray293, 0, local75, 0);
				System.out.println(new String(local75));
			}
			if (Class166.anIntArray293[0] == 0) {
				for (local26 = 0; local26 < arg1.length; local26++) {
					local21.glDetachObjectARB(local24, arg1[local26].anInt1009);
				}
				local21.glDeleteObjectARB(local24);
				return null;
			}
		}
		return new Class166(arg0, local24, arg1);
	}
}
