import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!ck", name = "F", descriptor = "I")
	public static int anInt1177;

	@OriginalMember(owner = "client!ck", name = "E", descriptor = "I")
	public static int anInt1176 = 0;

	@OriginalMember(owner = "client!ck", name = "P", descriptor = "I")
	public static int anInt1185 = 0;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZI[BLclient!hp;)Lclient!ne;")
	public static Class234 method1093(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class134_Sub1_Sub1 arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg0);
		OpenGL.glShaderSourceRawARB(local6, arg1);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static44.anIntArray88, 0);
		if (Static44.anIntArray88[0] == 0) {
			if (Static44.anIntArray88[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static44.anIntArray88, 1);
			if (Static44.anIntArray88[1] > 1) {
				@Pc(50) byte[] local50 = new byte[Static44.anIntArray88[1]];
				OpenGL.glGetInfoLogARB(local6, Static44.anIntArray88[1], Static44.anIntArray88, 0, local50, 0);
				System.out.println(new String(local50));
			}
			if (Static44.anIntArray88[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class234(arg2, local6, arg0);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIB)V")
	public static void method1094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		for (@Pc(11) int local11 = arg4; local11 <= arg0; local11++) {
			Static433.method6039(arg2, arg3, Static171.anIntArrayArray79[local11], arg1);
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method1095(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = arg0.charAt(local12) + (local10 << 5) - local10;
		}
		return local10;
	}
}
