import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "Lclient!mt;")
	public static Class227 aClass227_1;

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "Lclient!em;")
	public static final Class83 aClass83_25 = new Class83(40, 6);

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V")
	public static void method754() {
		Static288.aClass91_22.method2275();
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(I[BILclient!tba;)Lclient!tu;")
	public static Class327 method756(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) Class78_Sub1_Sub2 arg2) {
		@Pc(11) long local11 = OpenGL.glCreateShaderObjectARB(arg0);
		OpenGL.glShaderSourceRawARB(local11, arg1);
		OpenGL.glCompileShaderARB(local11);
		OpenGL.glGetObjectParameterivARB(local11, 35713, Static381.anIntArray398, 0);
		if (Static381.anIntArray398[0] == 0) {
			if (Static381.anIntArray398[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local11, 35716, Static381.anIntArray398, 1);
			if (Static381.anIntArray398[1] > 1) {
				@Pc(50) byte[] local50 = new byte[Static381.anIntArray398[1]];
				OpenGL.glGetInfoLogARB(local11, Static381.anIntArray398[1], Static381.anIntArray398, 0, local50, 0);
				System.out.println(new String(local50));
			}
			if (Static381.anIntArray398[0] == 0) {
				OpenGL.glDeleteObjectARB(local11);
				return null;
			}
		}
		return new Class327(arg2, local11, arg0);
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)[Lclient!ts;")
	public static Class325[] method757() {
		return new Class325[] { Static122.aClass325_1, Static122.aClass325_2, Static122.aClass325_3, Static122.aClass325_4, Static122.aClass325_5, Static122.aClass325_6, Static122.aClass325_7, Static122.aClass325_8, Static122.aClass325_9, Static122.aClass325_10, Static122.aClass325_11, Static122.aClass325_12, Static122.aClass325_13, Static122.aClass325_14 };
	}
}
