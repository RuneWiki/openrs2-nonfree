import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!uq", name = "d", descriptor = "[I")
	public static int[] anIntArray463 = new int[2];

	@OriginalMember(owner = "client!uq", name = "g", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_166 = new Class119("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

	@OriginalMember(owner = "client!uq", name = "h", descriptor = "[I")
	public static final int[] anIntArray464 = new int[32];

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIIIBIII)V")
	public static void method5405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static69.method1137(arg5)) {
			if (Static46.aClass124ArrayArray1[arg5] == null) {
				Static54.method921(arg3, arg4, arg7, arg6, -1, Static87.aClass124ArrayArray7[arg5], arg1, arg0, arg2);
			} else {
				Static54.method921(arg3, arg4, arg7, arg6, -1, Static46.aClass124ArrayArray1[arg5], arg1, arg0, arg2);
			}
		} else if (arg2 == -1) {
			for (@Pc(20) int local20 = 0; local20 < 100; local20++) {
				Static369.aBooleanArray23[local20] = true;
			}
		} else {
			Static369.aBooleanArray23[arg2] = true;
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ljava/lang/String;IILclient!ur;)Lclient!pi;")
	public static Class188 method5407(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class34_Sub2 arg2) {
		@Pc(14) long local14 = OpenGL.glCreateShaderObjectARB(arg1);
		OpenGL.glShaderSourceARB(local14, arg0);
		OpenGL.glCompileShaderARB(local14);
		OpenGL.glGetObjectParameterivARB(local14, 35713, Static426.anIntArray487, 0);
		if (Static426.anIntArray487[0] == 0) {
			if (Static426.anIntArray487[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local14, 35716, Static426.anIntArray487, 1);
			if (Static426.anIntArray487[1] > 1) {
				@Pc(56) byte[] local56 = new byte[Static426.anIntArray487[1]];
				OpenGL.glGetInfoLogARB(local14, Static426.anIntArray487[1], Static426.anIntArray487, 0, local56, 0);
				System.out.println(new String(local56));
			}
			if (Static426.anIntArray487[0] == 0) {
				OpenGL.glDeleteObjectARB(local14);
				return null;
			}
		}
		return new Class188(arg2, local14, arg1);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!ah;B)V")
	public static void method5408(@OriginalArg(0) Class1_Sub3 arg0) {
		if (Static359.aClass169ArrayArrayArray5 == null) {
			return;
		}
		@Pc(8) Interface8 local8 = null;
		if (arg0.anInt125 == 0) {
			local8 = (Interface8) Static337.method4524(arg0.anInt127, arg0.anInt126, arg0.anInt121);
		}
		if (arg0.anInt125 == 1) {
			local8 = (Interface8) Static165.method2380(arg0.anInt127, arg0.anInt126, arg0.anInt121);
		}
		if (arg0.anInt125 == 2) {
			local8 = (Interface8) Static364.method2862(arg0.anInt127, arg0.anInt126, arg0.anInt121, mh.class);
		}
		if (arg0.anInt125 == 3) {
			local8 = (Interface8) Static231.method3312(arg0.anInt127, arg0.anInt126, arg0.anInt121);
		}
		if (local8 == null) {
			arg0.anInt117 = 0;
			arg0.anInt116 = 0;
			arg0.anInt123 = -1;
		} else {
			arg0.anInt123 = local8.method4623();
			arg0.anInt117 = local8.method4617();
			arg0.anInt116 = local8.method4620();
		}
	}
}
