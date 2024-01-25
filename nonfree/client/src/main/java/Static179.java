import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
	public static int anInt3583;

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
	public static int anInt3584 = -1;

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
	public static int anInt3587 = 0;

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "Z")
	public static boolean aBoolean273 = false;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method3069(@OriginalArg(1) String arg0) {
		return Static184.aHashtable2.containsKey(arg0);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IBI)V")
	public static void method3070(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub7_Sub2 local8 = Static188.method3210(5, arg1);
		local8.method925();
		local8.anInt852 = arg0;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!bi;BILjava/lang/String;)Lclient!pf;")
	public static Class268 method3071(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg1);
		OpenGL.glShaderSourceARB(local6, arg2);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static375.anIntArray419, 0);
		if (Static375.anIntArray419[0] == 0) {
			if (Static375.anIntArray419[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static375.anIntArray419, 1);
			if (Static375.anIntArray419[1] > 1) {
				@Pc(58) byte[] local58 = new byte[Static375.anIntArray419[1]];
				OpenGL.glGetInfoLogARB(local6, Static375.anIntArray419[1], Static375.anIntArray419, 0, local58, 0);
				System.out.println(new String(local58));
			}
			if (Static375.anIntArray419[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class268(arg0, local6, arg1);
	}
}
