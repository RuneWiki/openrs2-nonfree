import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!ar", name = "j", descriptor = "Lclient!aa;")
	public static Class2 aClass2_3;

	@OriginalMember(owner = "client!ar", name = "e", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_9 = new Class214(42, 7);

	@OriginalMember(owner = "client!ar", name = "k", descriptor = "I")
	public static int anInt304 = 0;

	@OriginalMember(owner = "client!ar", name = "l", descriptor = "I")
	public static int anInt305 = 10;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILclient!bt;Ljava/lang/String;I)Lclient!bn;")
	public static Class27 method256(@OriginalArg(1) Class30_Sub1 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg2);
		OpenGL.glShaderSourceARB(local6, arg1);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static376.anIntArray530, 0);
		if (Static376.anIntArray530[0] == 0) {
			if (Static376.anIntArray530[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static376.anIntArray530, 1);
			if (Static376.anIntArray530[1] > 1) {
				@Pc(48) byte[] local48 = new byte[Static376.anIntArray530[1]];
				OpenGL.glGetInfoLogARB(local6, Static376.anIntArray530[1], Static376.anIntArray530, 0, local48, 0);
				System.out.println(new String(local48));
			}
			if (Static376.anIntArray530[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class27(arg0, local6, arg2);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIB)V")
	public static void method258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static323.aClass235_5 == Static332.aClass235_6) {
			if (!Static258.method3306(1, 0, arg0, -2, arg1, false, 0, 1)) {
				Static258.method3306(1, 0, arg0, -3, arg1, false, 0, 1);
			}
		} else if (!Static258.method3306(1, 0, arg0, -3, arg1, false, 0, 1)) {
			Static258.method3306(1, 0, arg0, -2, arg1, false, 0, 1);
		}
	}
}
