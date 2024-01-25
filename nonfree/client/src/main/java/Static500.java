import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static500 {

	@OriginalMember(owner = "client!qu", name = "p", descriptor = "Lclient!sj;")
	public static Class10 aClass10_9;

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(BLclient!gda;Ljava/awt/Canvas;Lclient!d;I)Lclient!ha;")
	public static Class100 method6961(@OriginalArg(1) Class126 arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) Interface7 arg2, @OriginalArg(4) int arg3) {
		if (!Static264.method4287()) {
			throw new RuntimeException("");
		} else if (Static472.method6674("jaggl")) {
			@Pc(28) OpenGL local28 = new OpenGL();
			@Pc(46) long local46 = local28.init(arg1, 8, 8, 8, 24, 0, arg3);
			if (local46 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(66) Class100_Sub1_Sub2 local66 = new Class100_Sub1_Sub2(local28, arg1, local46, arg2, arg0, arg3);
			local66.method7891();
			return local66;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIIIIILclient!oi;)V")
	public static void method6962(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) Class4_Sub1_Sub1_Sub2 arg3) {
		Static489.method6888(arg3.aByte139, 256, arg1, arg2, arg3.anInt9803, arg3.anInt9805, arg0, 256, 0);
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILjava/lang/String;ILclient!vf;)Lclient!lo;")
	public static Class224 method6963(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class100_Sub3 arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg0);
		OpenGL.glShaderSourceARB(local6, arg1);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static363.anIntArray343, 0);
		if (Static363.anIntArray343[0] == 0) {
			if (Static363.anIntArray343[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static363.anIntArray343, 1);
			if (Static363.anIntArray343[1] > 1) {
				@Pc(53) byte[] local53 = new byte[Static363.anIntArray343[1]];
				OpenGL.glGetInfoLogARB(local6, Static363.anIntArray343[1], Static363.anIntArray343, 0, local53, 0);
				System.out.println(new String(local53));
			}
			if (Static363.anIntArray343[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class224(arg2, local6, arg0);
	}
}
