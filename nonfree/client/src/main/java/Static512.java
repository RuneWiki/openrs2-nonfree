import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static512 {

	@OriginalMember(owner = "client!qda", name = "jb", descriptor = "[I")
	public static int[] anIntArray476;

	@OriginalMember(owner = "client!qda", name = "bb", descriptor = "Lclient!iu;")
	public static Class181 aClass181_11;

	@OriginalMember(owner = "client!qda", name = "D", descriptor = "F")
	public static float aFloat162;

	@OriginalMember(owner = "client!qda", name = "W", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_86 = new Class286(38, 3);

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(Lclient!lt;ZI[B)Lclient!uw;")
	public static Class378 method7314(@OriginalArg(0) Class67_Sub1_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		if (arg2 == null || arg2.length == 0) {
			return null;
		}
		@Pc(23) long local23 = OpenGL.glCreateShaderObjectARB(arg1);
		OpenGL.glShaderSourceRawARB(local23, arg2);
		OpenGL.glCompileShaderARB(local23);
		OpenGL.glGetObjectParameterivARB(local23, 35713, Static369.anIntArray352, 0);
		if (Static369.anIntArray352[0] == 0) {
			if (Static369.anIntArray352[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local23, 35716, Static369.anIntArray352, 1);
			if (Static369.anIntArray352[1] > 1) {
				@Pc(68) byte[] local68 = new byte[Static369.anIntArray352[1]];
				OpenGL.glGetInfoLogARB(local23, Static369.anIntArray352[1], Static369.anIntArray352, 0, local68, 0);
				System.out.println(new String(local68));
			}
			if (Static369.anIntArray352[0] == 0) {
				OpenGL.glDeleteObjectARB(local23);
				return null;
			}
		}
		return new Class378(arg0, local23, arg1);
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(IIIIIBILclient!ha;)V")
	public static void method7317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) Class67 arg4) {
		arg4.method7696(arg1, arg3, arg0, arg2, -10660793);
		arg4.method7696(arg1 + 1, 16, arg0 - 2, arg2 + 1, -16777216);
		arg4.method7647(-16777216, arg1 + 1, arg2 + 18, arg3 - 19, arg0 + -2);
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(III)Lclient!nt;")
	public static Class262 method7319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static584.aClass262ArrayArrayArray2[arg0][arg1][arg2] == null) {
			@Pc(33) boolean local33 = Static584.aClass262ArrayArrayArray2[0][arg1][arg2] != null && Static584.aClass262ArrayArrayArray2[0][arg1][arg2].aClass262_1 != null;
			if (local33 && arg0 >= Static241.anInt4521 - 1) {
				return null;
			}
			Static306.method4660(arg0, arg1, arg2);
		}
		return Static584.aClass262ArrayArrayArray2[arg0][arg1][arg2];
	}
}
