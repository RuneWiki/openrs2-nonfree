import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!dp", name = "m", descriptor = "Z")
	public static boolean aBoolean191;

	@OriginalMember(owner = "client!dp", name = "g", descriptor = "I")
	public static int anInt2383 = 0;

	@OriginalMember(owner = "client!dp", name = "h", descriptor = "I")
	public static int anInt2384 = -1;

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
	public static void method1998() {
		Static39.aClass69_7.method1904();
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lclient!tk;[BII)Lclient!dc;")
	public static Class66 method1999(@OriginalArg(0) Class13_Sub3_Sub1 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null || arg1.length == 0) {
			return null;
		}
		@Pc(21) long local21 = OpenGL.glCreateShaderObjectARB(arg2);
		OpenGL.glShaderSourceRawARB(local21, arg1);
		OpenGL.glCompileShaderARB(local21);
		OpenGL.glGetObjectParameterivARB(local21, 35713, Static426.anIntArray477, 0);
		if (Static426.anIntArray477[0] == 0) {
			if (Static426.anIntArray477[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local21, 35716, Static426.anIntArray477, 1);
			if (Static426.anIntArray477[1] > 1) {
				@Pc(57) byte[] local57 = new byte[Static426.anIntArray477[1]];
				OpenGL.glGetInfoLogARB(local21, Static426.anIntArray477[1], Static426.anIntArray477, 0, local57, 0);
				System.out.println(new String(local57));
			}
			if (Static426.anIntArray477[0] == 0) {
				OpenGL.glDeleteObjectARB(local21);
				return null;
			}
		}
		return new Class66(arg0, local21, arg2);
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(BI)V")
	public static void method2001() {
		Static39.aClass69_7.method1910(50);
	}
}
