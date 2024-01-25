import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static519 {

	@OriginalMember(owner = "client!si", name = "ab", descriptor = "Lclient!fd;")
	public static Class103 aClass103_44;

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(III)V")
	public static void method7550(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class3_Sub7_Sub5 local13 = Static138.method2377(15, 0);
		local13.method1474();
		local13.anInt1720 = arg0;
		local13.anInt1728 = arg1;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
	public static void method7551() {
		Static511.aClass82_16.xa(((float) Static32.aClass3_Sub41_3.aClass7_Sub24_1.method7021() * 0.1F + 0.7F) * 1.1523438F);
		Static511.aClass82_16.ZA(Static569.anInt9378, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		Static511.aClass82_16.L(Static95.anInt1911, -1, 0);
		Static511.aClass82_16.method6145(Static429.aClass141_2);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ILjava/lang/String;ILclient!dw;)Lclient!ie;")
	public static Class158 method7555(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class82_Sub1 arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg0);
		OpenGL.glShaderSourceARB(local6, arg1);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static103.anIntArray135, 0);
		if (Static103.anIntArray135[0] == 0) {
			if (Static103.anIntArray135[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static103.anIntArray135, 1);
			if (Static103.anIntArray135[1] > 1) {
				@Pc(47) byte[] local47 = new byte[Static103.anIntArray135[1]];
				OpenGL.glGetInfoLogARB(local6, Static103.anIntArray135[1], Static103.anIntArray135, 0, local47, 0);
				System.out.println(new String(local47));
			}
			if (Static103.anIntArray135[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class158(arg2, local6, arg0);
	}

	@OriginalMember(owner = "client!si", name = "c", descriptor = "(III)Z")
	public static boolean method7558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}
}
