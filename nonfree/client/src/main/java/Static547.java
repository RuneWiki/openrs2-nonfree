import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static547 {

	@OriginalMember(owner = "client!ti", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray61 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!ti", name = "m", descriptor = "[F")
	public static final float[] aFloatArray78 = new float[4];

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Ljava/lang/String;Lclient!ep;BI)Lclient!ee;")
	public static Class83 method7553(@OriginalArg(0) String arg0, @OriginalArg(1) Class95_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg2);
		OpenGL.glShaderSourceARB(local6, arg0);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static12.anIntArray34, 0);
		if (Static12.anIntArray34[0] == 0) {
			if (Static12.anIntArray34[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static12.anIntArray34, 1);
			if (Static12.anIntArray34[1] > 1) {
				@Pc(47) byte[] local47 = new byte[Static12.anIntArray34[1]];
				OpenGL.glGetInfoLogARB(local6, Static12.anIntArray34[1], Static12.anIntArray34, 0, local47, 0);
				System.out.println(new String(local47));
			}
			if (Static12.anIntArray34[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class83(arg1, local6, arg2);
	}

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "(B)V")
	public static void method7554() {
		Static361.aClass95_9.method6941(Static469.aClass177_2);
		Static361.aClass95_9.DA(Static415.anInt6464, Static578.anInt9401, Static237.anInt3891, Static116.anInt2103);
	}
}
