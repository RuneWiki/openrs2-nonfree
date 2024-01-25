import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!iw", name = "Nb", descriptor = "I")
	public static final int anInt4211 = 1403;

	@OriginalMember(owner = "client!iw", name = "l", descriptor = "(B)V")
	public static void method3707() {
		Static55.anIntArray54 = null;
		Static624.anIntArray572 = null;
		Static347.anIntArray355 = null;
		Static8.aBoolean1 = false;
		Static159.anIntArray138 = null;
		Static458.anIntArray446 = null;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(B[BLclient!og;I)Lclient!ut;")
	public static Class362 method3709(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class143_Sub1_Sub2 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null || arg0.length == 0) {
			return null;
		}
		@Pc(13) long local13 = OpenGL.glCreateShaderObjectARB(arg2);
		OpenGL.glShaderSourceRawARB(local13, arg0);
		OpenGL.glCompileShaderARB(local13);
		OpenGL.glGetObjectParameterivARB(local13, 35713, Static297.anIntArray49, 0);
		if (Static297.anIntArray49[0] == 0) {
			if (Static297.anIntArray49[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local13, 35716, Static297.anIntArray49, 1);
			if (Static297.anIntArray49[1] > 1) {
				@Pc(62) byte[] local62 = new byte[Static297.anIntArray49[1]];
				OpenGL.glGetInfoLogARB(local13, Static297.anIntArray49[1], Static297.anIntArray49, 0, local62, 0);
				System.out.println(new String(local62));
			}
			if (Static297.anIntArray49[0] == 0) {
				OpenGL.glDeleteObjectARB(local13);
				return null;
			}
		}
		return new Class362(arg1, local13, arg2);
	}
}
