import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!qo", name = "H", descriptor = "I")
	public static int anInt5563;

	@OriginalMember(owner = "client!qo", name = "E", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_85 = new Class142(" ", ": ", " ", " ");

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILclient!ih;[Lclient!kt;)Lclient!re;")
	public static Class218 method4474(@OriginalArg(1) Class117_Sub1 arg0, @OriginalArg(2) Class143[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			if (arg1[local7] == null || arg1[local7].aLong130 <= 0L) {
				return null;
			}
		}
		@Pc(37) long local37 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(39) int local39 = 0; local39 < arg1.length; local39++) {
			OpenGL.glAttachObjectARB(local37, arg1[local39].aLong130);
		}
		OpenGL.glLinkProgramARB(local37);
		OpenGL.glGetObjectParameterivARB(local37, 35714, Static79.anIntArray119, 0);
		if (Static79.anIntArray119[0] == 0) {
			if (Static79.anIntArray119[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local37, 35716, Static79.anIntArray119, 1);
			if (Static79.anIntArray119[1] > 1) {
				@Pc(88) byte[] local88 = new byte[Static79.anIntArray119[1]];
				OpenGL.glGetInfoLogARB(local37, Static79.anIntArray119[1], Static79.anIntArray119, 0, local88, 0);
				System.out.println(new String(local88));
			}
			if (Static79.anIntArray119[0] == 0) {
				for (@Pc(109) int local109 = 0; local109 < arg1.length; local109++) {
					OpenGL.glDetachObjectARB(local37, arg1[local109].aLong130);
				}
				OpenGL.glDeleteObjectARB(local37);
				return null;
			}
		}
		return new Class218(arg0, local37, arg1);
	}
}
