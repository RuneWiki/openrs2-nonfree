import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static515 {

	@OriginalMember(owner = "client!vn", name = "x", descriptor = "I")
	public static int anInt3809;

	@OriginalMember(owner = "client!vn", name = "y", descriptor = "Lclient!ha;")
	public static Class35 aClass35_19;

	@OriginalMember(owner = "client!vn", name = "w", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_88 = new Class239(47, 4);

	@OriginalMember(owner = "client!vn", name = "z", descriptor = "I")
	public static int anInt3810 = 0;

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)I")
	public static int method3361() {
		if ((double) Static201.aFloat6 == 3.0D) {
			return 37;
		} else if ((double) Static201.aFloat6 == 4.0D) {
			return 50;
		} else if ((double) Static201.aFloat6 == 6.0D) {
			return 75;
		} else if ((double) Static201.aFloat6 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Ljava/lang/String;Lclient!os;II)Lclient!vt;")
	public static Class305 method3365(@OriginalArg(0) String arg0, @OriginalArg(1) Class39_Sub3 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg2);
		OpenGL.glShaderSourceARB(local6, arg0);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static57.anIntArray445, 0);
		if (Static57.anIntArray445[0] == 0) {
			if (Static57.anIntArray445[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static57.anIntArray445, 1);
			if (Static57.anIntArray445[1] > 1) {
				@Pc(47) byte[] local47 = new byte[Static57.anIntArray445[1]];
				OpenGL.glGetInfoLogARB(local6, Static57.anIntArray445[1], Static57.anIntArray445, 0, local47, 0);
				System.out.println(new String(local47));
			}
			if (Static57.anIntArray445[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class305(arg1, local6, arg2);
	}
}
