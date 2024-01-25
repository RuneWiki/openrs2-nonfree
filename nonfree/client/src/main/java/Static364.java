import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!nu", name = "g", descriptor = "Lclient!rw;")
	public static final Class297 aClass297_11 = new Class297(9, 2);

	@OriginalMember(owner = "client!nu", name = "r", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_200 = new Class235(54, 6);

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(BILclient!ok;Ljava/lang/String;)Lclient!kfa;")
	public static Class189 method4918(@OriginalArg(1) int arg0, @OriginalArg(2) Class134_Sub2 arg1, @OriginalArg(3) String arg2) {
		@Pc(11) long local11 = OpenGL.glCreateShaderObjectARB(arg0);
		OpenGL.glShaderSourceARB(local11, arg2);
		OpenGL.glCompileShaderARB(local11);
		OpenGL.glGetObjectParameterivARB(local11, 35713, Static7.anIntArray11, 0);
		if (Static7.anIntArray11[0] == 0) {
			if (Static7.anIntArray11[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local11, 35716, Static7.anIntArray11, 1);
			if (Static7.anIntArray11[1] > 1) {
				@Pc(55) byte[] local55 = new byte[Static7.anIntArray11[1]];
				OpenGL.glGetInfoLogARB(local11, Static7.anIntArray11[1], Static7.anIntArray11, 0, local55, 0);
				System.out.println(new String(local55));
			}
			if (Static7.anIntArray11[0] == 0) {
				OpenGL.glDeleteObjectARB(local11);
				return null;
			}
		}
		return new Class189(arg1, local11, arg0);
	}

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "(B)V")
	public static void method4919() {
		Static228.anInt4297 = -1;
		Static66.anInt1351 = -1;
		Static509.anInt5326 = 0;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(Lclient!pu;I)V")
	public static void method4921(@OriginalArg(0) Class270 arg0) {
		Static424.aClass270_91 = arg0;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(ZLjava/lang/Object;II)[B")
	public static byte[] method4922(@OriginalArg(1) Object arg0, @OriginalArg(3) int arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg0;
			return Static175.method7479(arg1, local18);
		} else if (arg0 instanceof Class18) {
			@Pc(30) Class18 local30 = (Class18) arg0;
			return local30.method270(arg1);
		} else {
			throw new IllegalArgumentException();
		}
	}
}
