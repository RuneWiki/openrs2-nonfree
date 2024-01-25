import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!ql", name = "I", descriptor = "I")
	public static int anInt5704;

	@OriginalMember(owner = "client!ql", name = "z", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_73 = new Class84("scroll:", "scrollen:", "déroulement:", "rolagem:");

	@OriginalMember(owner = "client!ql", name = "C", descriptor = "[Lclient!e;")
	public static final Class61[] aClass61Array1 = new Class61[16];

	@OriginalMember(owner = "client!ql", name = "F", descriptor = "I")
	public static int anInt5702 = 0;

	@OriginalMember(owner = "client!ql", name = "H", descriptor = "[J")
	public static final long[] aLongArray7 = new long[32];

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IZ)I")
	public static int method4586(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Ljava/lang/String;Lclient!ht;IB)Lclient!lo;")
	public static Class149 method4587(@OriginalArg(0) String arg0, @OriginalArg(1) Class109_Sub1 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg2);
		OpenGL.glShaderSourceARB(local6, arg0);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static176.anIntArray271, 0);
		if (Static176.anIntArray271[0] == 0) {
			if (Static176.anIntArray271[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static176.anIntArray271, 1);
			if (Static176.anIntArray271[1] > 1) {
				@Pc(50) byte[] local50 = new byte[Static176.anIntArray271[1]];
				OpenGL.glGetInfoLogARB(local6, Static176.anIntArray271[1], Static176.anIntArray271, 0, local50, 0);
				System.out.println(new String(local50));
			}
			if (Static176.anIntArray271[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class149(arg1, local6, arg2);
	}
}
