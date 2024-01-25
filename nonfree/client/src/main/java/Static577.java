import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static577 {

	@OriginalMember(owner = "client!to", name = "nb", descriptor = "I")
	public static int anInt9443;

	@OriginalMember(owner = "client!to", name = "Fc", descriptor = "F")
	public static float aFloat193;

	@OriginalMember(owner = "client!to", name = "Cc", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_218 = new Class359(78, 6);

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IBLclient!ck;Ljava/lang/String;)Lclient!l;")
	public static Class206 method7970(@OriginalArg(0) int arg0, @OriginalArg(2) Class65_Sub1 arg1, @OriginalArg(3) String arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg0);
		OpenGL.glShaderSourceARB(local6, arg2);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static315.anIntArray127, 0);
		if (Static315.anIntArray127[0] == 0) {
			if (Static315.anIntArray127[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static315.anIntArray127, 1);
			if (Static315.anIntArray127[1] > 1) {
				@Pc(55) byte[] local55 = new byte[Static315.anIntArray127[1]];
				OpenGL.glGetInfoLogARB(local6, Static315.anIntArray127[1], Static315.anIntArray127, 0, local55, 0);
				System.out.println(new String(local55));
			}
			if (Static315.anIntArray127[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class206(arg1, local6, arg0);
	}

	@OriginalMember(owner = "client!to", name = "d", descriptor = "(B)V")
	public static void method7979() {
		Static245.anInt780 = 1;
		Static270.anInt4979 = -1;
		if (Static360.aString55 == null) {
			Static221.method8979(35);
		} else {
			@Pc(20) Class5_Sub41 local20 = new Class5_Sub41(Static353.method5337(Static352.method8968(Static360.aString55)));
			@Pc(24) long local24 = local20.method7823();
			Static288.aLong136 = local20.method7823();
			Static430.method58("", Static142.method2492(local24), true);
		}
	}
}
