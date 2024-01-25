import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!raa", name = "n", descriptor = "[B")
	public static final byte[] aByteArray88 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!raa", name = "C", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray39 = new String[100];

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(Lclient!up;I)Z")
	public static boolean method6069(@OriginalArg(0) Interface17 arg0) {
		@Pc(18) Class288 local18 = Static365.aClass194_6.method5084(arg0.method7172());
		if (local18.anInt8366 == -1) {
			return true;
		} else {
			@Pc(31) Class140 local31 = Static198.aClass165_3.method4290(local18.anInt8366);
			return local31.anInt4440 == -1 ? true : local31.method3854();
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(IILclient!te;Ljava/lang/String;)Lclient!we;")
	public static Class315 method6070(@OriginalArg(1) int arg0, @OriginalArg(2) Class9_Sub3 arg1, @OriginalArg(3) String arg2) {
		@Pc(11) long local11 = OpenGL.glCreateShaderObjectARB(arg0);
		OpenGL.glShaderSourceARB(local11, arg2);
		OpenGL.glCompileShaderARB(local11);
		OpenGL.glGetObjectParameterivARB(local11, 35713, Static268.anIntArray368, 0);
		if (Static268.anIntArray368[0] == 0) {
			if (Static268.anIntArray368[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local11, 35716, Static268.anIntArray368, 1);
			if (Static268.anIntArray368[1] > 1) {
				@Pc(49) byte[] local49 = new byte[Static268.anIntArray368[1]];
				OpenGL.glGetInfoLogARB(local11, Static268.anIntArray368[1], Static268.anIntArray368, 0, local49, 0);
				System.out.println(new String(local49));
			}
			if (Static268.anIntArray368[0] == 0) {
				OpenGL.glDeleteObjectARB(local11);
				return null;
			}
		}
		return new Class315(arg1, local11, arg0);
	}
}
