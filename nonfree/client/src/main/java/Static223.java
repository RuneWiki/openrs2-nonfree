import jaggl.OpenGL;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!ku", name = "v", descriptor = "[I")
	public static final int[] anIntArray418 = new int[14];

	@OriginalMember(owner = "client!ku", name = "x", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_69 = new Class27(12, 7);

	@OriginalMember(owner = "client!ku", name = "D", descriptor = "Lclient!je;")
	public static final Class127 aClass127_12 = new Class127(6, 0, 4, 2);

	@OriginalMember(owner = "client!ku", name = "E", descriptor = "Lclient!s;")
	public static final Class217 aClass217_94 = new Class217(39, 12);

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public static boolean method3363(@OriginalArg(0) String arg0) {
		return Static185.method4363(arg0);
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(ILclient!da;ILjava/lang/String;)Lclient!rs;")
	public static Class214 method3364(@OriginalArg(0) int arg0, @OriginalArg(1) Class50_Sub1 arg1, @OriginalArg(3) String arg2) {
		@Pc(11) long local11 = OpenGL.glCreateShaderObjectARB(arg0);
		OpenGL.glShaderSourceARB(local11, arg2);
		OpenGL.glCompileShaderARB(local11);
		OpenGL.glGetObjectParameterivARB(local11, 35713, Static399.anIntArray659, 0);
		if (Static399.anIntArray659[0] == 0) {
			if (Static399.anIntArray659[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local11, 35716, Static399.anIntArray659, 1);
			if (Static399.anIntArray659[1] > 1) {
				@Pc(50) byte[] local50 = new byte[Static399.anIntArray659[1]];
				OpenGL.glGetInfoLogARB(local11, Static399.anIntArray659[1], Static399.anIntArray659, 0, local50, 0);
				System.out.println(new String(local50));
			}
			if (Static399.anIntArray659[0] == 0) {
				OpenGL.glDeleteObjectARB(local11);
				return null;
			}
		}
		return new Class214(arg1, local11, arg0);
	}

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "(B)V")
	public static void method3365() {
		try {
			@Pc(12) Method local12 = Runtime.class.getMethod("availableProcessors");
			if (local12 != null) {
				try {
					@Pc(16) Runtime local16 = Runtime.getRuntime();
					@Pc(22) Integer local22 = (Integer) local12.invoke(local16, (Object[]) null);
					Static298.anInt5167 = local22;
				} catch (@Pc(27) Throwable local27) {
				}
			}
		} catch (@Pc(29) Exception local29) {
		}
	}
}
