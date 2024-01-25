import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!cea", name = "R", descriptor = "F")
	public static float aFloat27;

	@OriginalMember(owner = "client!cea", name = "M", descriptor = "Lclient!efa;")
	public static final Class90 aClass90_3 = new Class90(32);

	@OriginalMember(owner = "client!cea", name = "O", descriptor = "Z")
	public static boolean aBoolean62 = false;

	@OriginalMember(owner = "client!cea", name = "P", descriptor = "Lclient!ps;")
	public static Class273 aClass273_1 = null;

	@OriginalMember(owner = "client!cea", name = "Q", descriptor = "Lclient!mb;")
	public static final Class220 aClass220_2 = new Class220();

	@OriginalMember(owner = "client!cea", name = "T", descriptor = "I")
	public static int anInt1123 = -1;

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(BLjava/lang/String;Lclient!uca;I)Lclient!g;")
	public static Class118 method1063(@OriginalArg(1) String arg0, @OriginalArg(2) Class162_Sub3 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) long local14 = OpenGL.glCreateShaderObjectARB(arg2);
		OpenGL.glShaderSourceARB(local14, arg0);
		OpenGL.glCompileShaderARB(local14);
		OpenGL.glGetObjectParameterivARB(local14, 35713, Static71.anIntArray337, 0);
		if (Static71.anIntArray337[0] == 0) {
			if (Static71.anIntArray337[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local14, 35716, Static71.anIntArray337, 1);
			if (Static71.anIntArray337[1] > 1) {
				@Pc(58) byte[] local58 = new byte[Static71.anIntArray337[1]];
				OpenGL.glGetInfoLogARB(local14, Static71.anIntArray337[1], Static71.anIntArray337, 0, local58, 0);
				System.out.println(new String(local58));
			}
			if (Static71.anIntArray337[0] == 0) {
				OpenGL.glDeleteObjectARB(local14);
				return null;
			}
		}
		return new Class118(arg1, local14, arg2);
	}
}
