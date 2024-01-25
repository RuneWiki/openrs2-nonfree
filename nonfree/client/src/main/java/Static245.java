import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "Lclient!uf;")
	public static final Class326 aClass326_18 = new Class326(8);

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_80 = new Class319(70, -1);

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BLjava/lang/String;Lclient!ag;I)Lclient!vk;")
	public static Class344 method3978(@OriginalArg(1) String arg0, @OriginalArg(2) Class12_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(11) long local11 = OpenGL.glCreateShaderObjectARB(arg2);
		OpenGL.glShaderSourceARB(local11, arg0);
		OpenGL.glCompileShaderARB(local11);
		OpenGL.glGetObjectParameterivARB(local11, 35713, Static434.anIntArray504, 0);
		if (Static434.anIntArray504[0] == 0) {
			if (Static434.anIntArray504[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local11, 35716, Static434.anIntArray504, 1);
			if (Static434.anIntArray504[1] > 1) {
				@Pc(55) byte[] local55 = new byte[Static434.anIntArray504[1]];
				OpenGL.glGetInfoLogARB(local11, Static434.anIntArray504[1], Static434.anIntArray504, 0, local55, 0);
				System.out.println(new String(local55));
			}
			if (Static434.anIntArray504[0] == 0) {
				OpenGL.glDeleteObjectARB(local11);
				return null;
			}
		}
		return new Class344(arg1, local11, arg2);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IB)V")
	public static void method3979(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub3_Sub1 local12 = Static374.method5445(7, arg0);
		local12.method488();
	}
}
