import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!js", name = "d", descriptor = "[Lclient!i;")
	public static Class151[] aClass151Array2;

	@OriginalMember(owner = "client!js", name = "e", descriptor = "[Lclient!eh;")
	public static Class91[] aClass91Array2;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "I")
	public static int anInt4297 = 0;

	@OriginalMember(owner = "client!js", name = "b", descriptor = "[Lclient!at;")
	public static final Class20[] aClass20Array1 = new Class20[2048];

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(BIZ)Lclient!ge;")
	public static Class2_Sub16 method3663(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(17) long local17 = (long) (arg0 | (arg1 ? Integer.MIN_VALUE : 0));
		return (Class2_Sub16) Static61.aClass90_3.method1685(local17);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!kd;[Lclient!oh;B)Lclient!ro;")
	public static Class301 method3665(@OriginalArg(0) Class162_Sub1_Sub2 arg0, @OriginalArg(1) Class254[] arg1) {
		for (@Pc(15) int local15 = 0; local15 < arg1.length; local15++) {
			if (arg1[local15] == null || arg1[local15].aLong173 <= 0L) {
				return null;
			}
		}
		@Pc(43) long local43 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(45) int local45 = 0; local45 < arg1.length; local45++) {
			OpenGL.glAttachObjectARB(local43, arg1[local45].aLong173);
		}
		OpenGL.glLinkProgramARB(local43);
		OpenGL.glGetObjectParameterivARB(local43, 35714, Static404.anIntArray424, 0);
		if (Static404.anIntArray424[0] == 0) {
			if (Static404.anIntArray424[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local43, 35716, Static404.anIntArray424, 1);
			if (Static404.anIntArray424[1] > 1) {
				@Pc(94) byte[] local94 = new byte[Static404.anIntArray424[1]];
				OpenGL.glGetInfoLogARB(local43, Static404.anIntArray424[1], Static404.anIntArray424, 0, local94, 0);
				System.out.println(new String(local94));
			}
			if (Static404.anIntArray424[0] == 0) {
				for (@Pc(115) int local115 = 0; local115 < arg1.length; local115++) {
					OpenGL.glDetachObjectARB(local43, arg1[local115].aLong173);
				}
				OpenGL.glDeleteObjectARB(local43);
				return null;
			}
		}
		return new Class301(arg0, local43, arg1);
	}
}
