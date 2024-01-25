import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static483 {

	@OriginalMember(owner = "client!rba", name = "k", descriptor = "Lclient!sh;")
	public static Class191 aClass191_1;

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "Lclient!mr;")
	public static final Class223 aClass223_50 = new Class223();

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(ILjava/lang/String;ILclient!kw;)Lclient!tn;")
	public static Class324 method7199(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class5_Sub2 arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg0);
		OpenGL.glShaderSourceARB(local6, arg1);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static208.anIntArray531, 0);
		if (Static208.anIntArray531[0] == 0) {
			if (Static208.anIntArray531[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static208.anIntArray531, 1);
			if (Static208.anIntArray531[1] > 1) {
				@Pc(47) byte[] local47 = new byte[Static208.anIntArray531[1]];
				OpenGL.glGetInfoLogARB(local6, Static208.anIntArray531[1], Static208.anIntArray531, 0, local47, 0);
				System.out.println(new String(local47));
			}
			if (Static208.anIntArray531[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class324(arg2, local6, arg0);
	}

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "(B)V")
	public static void method7200() {
		if (Static211.aString42.toLowerCase().indexOf("microsoft") != -1) {
			Static361.anIntArray410[192] = 58;
			Static361.anIntArray410[222] = 59;
			Static361.anIntArray410[221] = 43;
			Static361.anIntArray410[219] = 42;
			Static361.anIntArray410[189] = 26;
			Static361.anIntArray410[190] = 72;
			Static361.anIntArray410[223] = 28;
			Static361.anIntArray410[188] = 71;
			Static361.anIntArray410[220] = 74;
			Static361.anIntArray410[187] = 27;
			Static361.anIntArray410[186] = 57;
			Static361.anIntArray410[191] = 73;
			return;
		}
		Static361.anIntArray410[44] = 71;
		Static361.anIntArray410[91] = 42;
		Static361.anIntArray410[45] = 26;
		Static361.anIntArray410[59] = 57;
		Static361.anIntArray410[46] = 72;
		Static361.anIntArray410[92] = 74;
		Static361.anIntArray410[47] = 73;
		Static361.anIntArray410[61] = 27;
		if (Static211.aMethod2 == null) {
			Static361.anIntArray410[222] = 59;
			Static361.anIntArray410[192] = 58;
		} else {
			Static361.anIntArray410[222] = 58;
			Static361.anIntArray410[520] = 59;
			Static361.anIntArray410[192] = 28;
		}
		Static361.anIntArray410[93] = 43;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(IZLjava/lang/Object;)[B")
	public static byte[] method7202(@OriginalArg(1) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg1;
			return arg0 ? Static381.method6149(local18) : local18;
		} else if (arg1 instanceof Class57) {
			@Pc(32) Class57 local32 = (Class57) arg1;
			return local32.method1860();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
