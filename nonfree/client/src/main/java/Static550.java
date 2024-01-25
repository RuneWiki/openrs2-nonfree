import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static550 {

	@OriginalMember(owner = "client!vc", name = "k", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "Lclient!rb;")
	public static final Class276 aClass276_3 = new Class276("WIP", 2);

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!qi;I[BI)Lclient!mn;")
	public static Class217 method7485(@OriginalArg(0) Class12_Sub2_Sub2 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(11) long local11 = OpenGL.glCreateShaderObjectARB(arg2);
		OpenGL.glShaderSourceRawARB(local11, arg1);
		OpenGL.glCompileShaderARB(local11);
		OpenGL.glGetObjectParameterivARB(local11, 35713, Static314.anIntArray364, 0);
		if (Static314.anIntArray364[0] == 0) {
			if (Static314.anIntArray364[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local11, 35716, Static314.anIntArray364, 1);
			if (Static314.anIntArray364[1] > 1) {
				@Pc(55) byte[] local55 = new byte[Static314.anIntArray364[1]];
				OpenGL.glGetInfoLogARB(local11, Static314.anIntArray364[1], Static314.anIntArray364, 0, local55, 0);
				System.out.println(new String(local55));
			}
			if (Static314.anIntArray364[0] == 0) {
				OpenGL.glDeleteObjectARB(local11);
				return null;
			}
		}
		return new Class217(arg0, local11, arg2);
	}

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)I")
	public static int method7487() {
		return Static137.aClass260_1.method5791();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!dn;B)I")
	public static int method7488(@OriginalArg(0) Class74 arg0) {
		if (arg0 == Static167.aClass74_2) {
			return 9216;
		} else if (Static499.aClass74_4 == arg0) {
			return 34065;
		} else if (arg0 == Static361.aClass74_3) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
