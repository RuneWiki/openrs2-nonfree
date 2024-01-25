import jaggl.OpenGL;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!uf", name = "p", descriptor = "Z")
	public static boolean aBoolean571;

	@OriginalMember(owner = "client!uf", name = "o", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_249 = new Class67(87, -2);

	@OriginalMember(owner = "client!uf", name = "r", descriptor = "[[I")
	public static final int[][] anIntArrayArray48 = new int[128][128];

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
	public static void method5245() {
		if (Static289.anInt4838 == 2) {
			Static45.anInt669 = 96;
			return;
		}
		try {
			@Pc(27) Method local27 = Runtime.class.getMethod("maxMemory");
			if (local27 != null) {
				try {
					@Pc(31) Runtime local31 = Runtime.getRuntime();
					@Pc(37) Long local37 = (Long) local27.invoke(local31, (Object[]) null);
					Static45.anInt669 = (int) (local37 / 1048576L) + 1;
				} catch (@Pc(47) Throwable local47) {
				}
			}
		} catch (@Pc(49) Exception local49) {
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/lang/String;BLclient!ih;I)Lclient!kt;")
	public static Class143 method5251(@OriginalArg(0) String arg0, @OriginalArg(2) Class117_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg2);
		OpenGL.glShaderSourceARB(local6, arg0);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static101.anIntArray136, 0);
		if (Static101.anIntArray136[0] == 0) {
			if (Static101.anIntArray136[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static101.anIntArray136, 1);
			if (Static101.anIntArray136[1] > 1) {
				@Pc(58) byte[] local58 = new byte[Static101.anIntArray136[1]];
				OpenGL.glGetInfoLogARB(local6, Static101.anIntArray136[1], Static101.anIntArray136, 0, local58, 0);
				System.out.println(new String(local58));
			}
			if (Static101.anIntArray136[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class143(arg1, local6, arg2);
	}
}
