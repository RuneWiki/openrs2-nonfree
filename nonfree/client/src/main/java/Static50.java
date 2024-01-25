import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_8 = new Class254();

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
	public static int anInt823 = 0;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!od;I[Lclient!lv;)Lclient!kh;")
	public static Class136 method734(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(2) Class153[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			if (arg1[local7] == null || arg1[local7].aLong121 <= 0L) {
				return null;
			}
		}
		@Pc(34) long local34 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(36) int local36 = 0; local36 < arg1.length; local36++) {
			OpenGL.glAttachObjectARB(local34, arg1[local36].aLong121);
		}
		OpenGL.glLinkProgramARB(local34);
		OpenGL.glGetObjectParameterivARB(local34, 35714, Static79.anIntArray71, 0);
		if (Static79.anIntArray71[0] == 0) {
			if (Static79.anIntArray71[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local34, 35716, Static79.anIntArray71, 1);
			if (Static79.anIntArray71[1] > 1) {
				@Pc(91) byte[] local91 = new byte[Static79.anIntArray71[1]];
				OpenGL.glGetInfoLogARB(local34, Static79.anIntArray71[1], Static79.anIntArray71, 0, local91, 0);
				System.out.println(new String(local91));
			}
			if (Static79.anIntArray71[0] == 0) {
				for (@Pc(115) int local115 = 0; local115 < arg1.length; local115++) {
					OpenGL.glDetachObjectARB(local34, arg1[local115].aLong121);
				}
				OpenGL.glDeleteObjectARB(local34);
				return null;
			}
		}
		return new Class136(arg0, local34, arg1);
	}
}
