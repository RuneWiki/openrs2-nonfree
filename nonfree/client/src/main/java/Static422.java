import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!rs", name = "s", descriptor = "Lclient!iaa;")
	public static Class130 aClass130_8;

	@OriginalMember(owner = "client!rs", name = "r", descriptor = "I")
	public static int anInt7365 = 0;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!te;[Lclient!we;I)Lclient!gda;")
	public static Class99 method6283(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) Class315[] arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] == null || arg1[local5].aLong238 <= 0L) {
				return null;
			}
		}
		@Pc(30) long local30 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(32) int local32 = 0; local32 < arg1.length; local32++) {
			OpenGL.glAttachObjectARB(local30, arg1[local32].aLong238);
		}
		OpenGL.glLinkProgramARB(local30);
		OpenGL.glGetObjectParameterivARB(local30, 35714, Static8.anIntArray15, 0);
		if (Static8.anIntArray15[0] == 0) {
			if (Static8.anIntArray15[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local30, 35716, Static8.anIntArray15, 1);
			if (Static8.anIntArray15[1] > 1) {
				@Pc(84) byte[] local84 = new byte[Static8.anIntArray15[1]];
				OpenGL.glGetInfoLogARB(local30, Static8.anIntArray15[1], Static8.anIntArray15, 0, local84, 0);
				System.out.println(new String(local84));
			}
			if (Static8.anIntArray15[0] == 0) {
				for (@Pc(105) int local105 = 0; local105 < arg1.length; local105++) {
					OpenGL.glDetachObjectARB(local30, arg1[local105].aLong238);
				}
				OpenGL.glDeleteObjectARB(local30);
				return null;
			}
		}
		return new Class99(arg0, local30, arg1);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IBI)Z")
	public static boolean method6288(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
	}
}
