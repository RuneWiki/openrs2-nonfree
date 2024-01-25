import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
	public static int anInt4137;

	@OriginalMember(owner = "client!kf", name = "s", descriptor = "Lclient!tu;")
	public static final Class229 aClass229_27 = new Class229();

	@OriginalMember(owner = "client!kf", name = "u", descriptor = "I")
	public static int anInt4136 = 0;

	@OriginalMember(owner = "client!kf", name = "w", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_144 = new Class184(51, 5);

	@OriginalMember(owner = "client!kf", name = "x", descriptor = "I")
	public static int anInt4138 = -1;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)Z")
	public static boolean method3387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!gk;IILjava/lang/String;)Lclient!go;")
	public static Class86 method3388(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg1);
		OpenGL.glShaderSourceARB(local6, arg2);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static129.anIntArray223, 0);
		if (Static129.anIntArray223[0] == 0) {
			if (Static129.anIntArray223[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static129.anIntArray223, 1);
			if (Static129.anIntArray223[1] > 1) {
				@Pc(52) byte[] local52 = new byte[Static129.anIntArray223[1]];
				OpenGL.glGetInfoLogARB(local6, Static129.anIntArray223[1], Static129.anIntArray223, 0, local52, 0);
				System.out.println(new String(local52));
			}
			if (Static129.anIntArray223[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class86(arg0, local6, arg1);
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(III)V")
	public static void method3389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static293.anInt3444 = arg1 - Static210.anInt7505;
		Static336.anInt6190 = arg0 - Static210.anInt7496;
	}
}
