import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static505 {

	@OriginalMember(owner = "client!rba", name = "d", descriptor = "[Z")
	public static boolean[] aBooleanArray62;

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_101 = new Class341(64, 2);

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "I")
	public static int anInt10359 = 0;

	@OriginalMember(owner = "client!rba", name = "c", descriptor = "Lclient!vb;")
	public static final Class368 aClass368_20 = new Class368(7, 5);

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(IILclient!fc;[B)Lclient!fo;")
	public static Class110 method8950(@OriginalArg(1) int arg0, @OriginalArg(2) Class101_Sub1_Sub1 arg1, @OriginalArg(3) byte[] arg2) {
		if (arg2 == null || arg2.length == 0) {
			return null;
		}
		@Pc(24) long local24 = OpenGL.glCreateShaderObjectARB(arg0);
		OpenGL.glShaderSourceRawARB(local24, arg2);
		OpenGL.glCompileShaderARB(local24);
		OpenGL.glGetObjectParameterivARB(local24, 35713, Static586.anIntArray519, 0);
		if (Static586.anIntArray519[0] == 0) {
			if (Static586.anIntArray519[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local24, 35716, Static586.anIntArray519, 1);
			if (Static586.anIntArray519[1] > 1) {
				@Pc(65) byte[] local65 = new byte[Static586.anIntArray519[1]];
				OpenGL.glGetInfoLogARB(local24, Static586.anIntArray519[1], Static586.anIntArray519, 0, local65, 0);
				System.out.println(new String(local65));
			}
			if (Static586.anIntArray519[0] == 0) {
				OpenGL.glDeleteObjectARB(local24);
				return null;
			}
		}
		return new Class110(arg1, local24, arg0);
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(ILjava/lang/String;C)I")
	public static int method8952(@OriginalArg(1) String arg0, @OriginalArg(2) char arg1) {
		@Pc(5) int local5 = 0;
		@Pc(8) int local8 = arg0.length();
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (arg0.charAt(local10) == arg1) {
				local5++;
			}
		}
		return local5;
	}
}
