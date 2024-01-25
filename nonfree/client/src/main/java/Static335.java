import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!mba", name = "U", descriptor = "F")
	public static float aFloat186;

	@OriginalMember(owner = "client!mba", name = "Q", descriptor = "[C")
	public static final char[] aCharArray5 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!de;")
	public static RuntimeException_Sub1 method5568(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString17 = local12.aString17 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IZZII)V")
	public static void method5569(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		Static466.method6966(arg3, arg1, arg0, 0, Static199.aClass153_Sub1Array1.length - 1, arg2);
		Static408.anInt7671 = 0;
		Static412.aClass3_Sub14_2 = null;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lclient!eq;BILjava/lang/String;)Lclient!ci;")
	public static Class45 method5570(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg1);
		OpenGL.glShaderSourceARB(local6, arg2);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static366.anIntArray76, 0);
		if (Static366.anIntArray76[0] == 0) {
			if (Static366.anIntArray76[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static366.anIntArray76, 1);
			if (Static366.anIntArray76[1] > 1) {
				@Pc(54) byte[] local54 = new byte[Static366.anIntArray76[1]];
				OpenGL.glGetInfoLogARB(local6, Static366.anIntArray76[1], Static366.anIntArray76, 0, local54, 0);
				System.out.println(new String(local54));
			}
			if (Static366.anIntArray76[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class45(arg0, local6, arg1);
	}

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "(IZ)Z")
	public static boolean method5572(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}
}
