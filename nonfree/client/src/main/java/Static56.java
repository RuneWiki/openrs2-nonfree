import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!cca", name = "k", descriptor = "Lclient!nba;")
	public static Class222 aClass222_1;

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IILjava/lang/String;Lclient!ji;)Lclient!kk;")
	public static Class185 method1328(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class15_Sub3 arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg0);
		OpenGL.glShaderSourceARB(local6, arg1);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static377.anIntArray471, 0);
		if (Static377.anIntArray471[0] == 0) {
			if (Static377.anIntArray471[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static377.anIntArray471, 1);
			if (Static377.anIntArray471[1] > 1) {
				@Pc(50) byte[] local50 = new byte[Static377.anIntArray471[1]];
				OpenGL.glGetInfoLogARB(local6, Static377.anIntArray471[1], Static377.anIntArray471, 0, local50, 0);
				System.out.println(new String(local50));
			}
			if (Static377.anIntArray471[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class185(arg2, local6, arg0);
	}

	@OriginalMember(owner = "client!cca", name = "d", descriptor = "(III)V")
	public static void method1329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class125 local7 = Static580.aClass125ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 != null && local7.aClass2_Sub1_1 != null) {
			local7.aClass2_Sub1_1 = null;
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(BIIII)V")
	public static void method1330(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static87.anInt6919 / (float) Static87.anInt6925;
		@Pc(11) int local11 = arg2;
		@Pc(13) int local13 = arg0;
		if (local9 < 1.0F) {
			local13 = (int) (local9 * (float) arg2);
		} else {
			local11 = (int) ((float) arg0 / local9);
		}
		@Pc(39) int local39 = arg3 - (arg0 - local13) / 2;
		@Pc(48) int local48 = arg1 - (arg2 - local11) / 2;
		Static185.anInt3726 = local48 * Static87.anInt6925 / local11;
		Static18.anInt597 = Static87.anInt6919 - local39 * Static87.anInt6919 / local13;
		Static423.anInt8217 = -1;
		Static593.anInt10380 = -1;
		Static293.method4983();
	}
}
