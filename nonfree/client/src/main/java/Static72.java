import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!cia", name = "g", descriptor = "Lclient!mn;")
	public static Class225 aClass225_2;

	@OriginalMember(owner = "client!cia", name = "d", descriptor = "[I")
	public static final int[] anIntArray99 = new int[] { 1, 4, 1, 2 };

	@OriginalMember(owner = "client!cia", name = "e", descriptor = "[I")
	public static final int[] anIntArray100 = new int[1];

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "([BILclient!sb;I)Lclient!jr;")
	public static Class176 method1001(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class95_Sub3_Sub2 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null || arg0.length == 0) {
			return null;
		}
		@Pc(13) long local13 = OpenGL.glCreateShaderObjectARB(arg2);
		OpenGL.glShaderSourceRawARB(local13, arg0);
		OpenGL.glCompileShaderARB(local13);
		OpenGL.glGetObjectParameterivARB(local13, 35713, Static543.anIntArray608, 0);
		if (Static543.anIntArray608[0] == 0) {
			if (Static543.anIntArray608[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local13, 35716, Static543.anIntArray608, 1);
			if (Static543.anIntArray608[1] > 1) {
				@Pc(57) byte[] local57 = new byte[Static543.anIntArray608[1]];
				OpenGL.glGetInfoLogARB(local13, Static543.anIntArray608[1], Static543.anIntArray608, 0, local57, 0);
				System.out.println(new String(local57));
			}
			if (Static543.anIntArray608[0] == 0) {
				OpenGL.glDeleteObjectARB(local13);
				return null;
			}
		}
		return new Class176(arg1, local13, arg2);
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(II)I")
	public static int method1002(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(I[J[Ljava/lang/Object;)V")
	public static void method1003(@OriginalArg(1) long[] arg0, @OriginalArg(2) Object[] arg1) {
		Static81.method1116(0, arg1, arg0.length - 1, arg0);
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method1005(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static380.method5070("%0a", arg0, "\n"));
	}
}
