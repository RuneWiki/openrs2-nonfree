import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "[I")
	public static final int[] anIntArray4 = new int[1];

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_3 = new Class129(92, 7);

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_1 = new Class194(66, 3);

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/lang/String;BILclient!tt;)Lclient!ds;")
	public static Class54 method41(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class200_Sub2 arg2) {
		@Pc(11) long local11 = OpenGL.glCreateShaderObjectARB(arg1);
		OpenGL.glShaderSourceARB(local11, arg0);
		OpenGL.glCompileShaderARB(local11);
		OpenGL.glGetObjectParameterivARB(local11, 35713, Static119.anIntArray221, 0);
		if (Static119.anIntArray221[0] == 0) {
			if (Static119.anIntArray221[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local11, 35716, Static119.anIntArray221, 1);
			if (Static119.anIntArray221[1] > 1) {
				@Pc(53) byte[] local53 = new byte[Static119.anIntArray221[1]];
				OpenGL.glGetInfoLogARB(local11, Static119.anIntArray221[1], Static119.anIntArray221, 0, local53, 0);
				System.out.println(new String(local53));
			}
			if (Static119.anIntArray221[0] == 0) {
				OpenGL.glDeleteObjectARB(local11);
				return null;
			}
		}
		return new Class54(arg2, local11, arg1);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)I")
	public static int method42(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}
}
