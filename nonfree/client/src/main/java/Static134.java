import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!eg", name = "j", descriptor = "Lclient!uq;")
	public static Class362 aClass362_30;

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "Lclient!fea;")
	public static final Class112 aClass112_9 = new Class112();

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "([BLclient!sha;BI)Lclient!mca;")
	public static Class224 method2251(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class95_Sub1_Sub1 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null || arg0.length == 0) {
			return null;
		}
		@Pc(13) long local13 = OpenGL.glCreateShaderObjectARB(arg2);
		OpenGL.glShaderSourceRawARB(local13, arg0);
		OpenGL.glCompileShaderARB(local13);
		OpenGL.glGetObjectParameterivARB(local13, 35713, Static440.anIntArray389, 0);
		if (Static440.anIntArray389[0] == 0) {
			if (Static440.anIntArray389[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local13, 35716, Static440.anIntArray389, 1);
			if (Static440.anIntArray389[1] > 1) {
				@Pc(57) byte[] local57 = new byte[Static440.anIntArray389[1]];
				OpenGL.glGetInfoLogARB(local13, Static440.anIntArray389[1], Static440.anIntArray389, 0, local57, 0);
				System.out.println(new String(local57));
			}
			if (Static440.anIntArray389[0] == 0) {
				OpenGL.glDeleteObjectARB(local13);
				return null;
			}
		}
		return new Class224(arg1, local13, arg2);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIZIII)I")
	public static int method2253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg1 & 0x3;
		if ((arg4 & 0x1) == 1) {
			@Pc(21) int local21 = arg3;
			arg3 = arg0;
			arg0 = local21;
		}
		if (local8 == 0) {
			return arg5;
		} else if (local8 == 1) {
			return arg2;
		} else if (local8 == 2) {
			return 7 + 1 - arg5 - arg3;
		} else {
			return 1 + 7 - arg0 - arg2;
		}
	}
}
