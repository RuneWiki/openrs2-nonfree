import jaggl.OpenGL;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!oba", name = "j", descriptor = "I")
	public static int anInt7465;

	@OriginalMember(owner = "client!oba", name = "k", descriptor = "I")
	public static int anInt7466;

	@OriginalMember(owner = "client!oba", name = "l", descriptor = "I")
	public static int anInt7467;

	@OriginalMember(owner = "client!oba", name = "m", descriptor = "I")
	public static int anInt7468;

	@OriginalMember(owner = "client!oba", name = "h", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray6 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

	@OriginalMember(owner = "client!oba", name = "i", descriptor = "J")
	public static long aLong186 = 0L;

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IILclient!wha;B)J")
	public static long method6162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface27 arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = Long.MIN_VALUE;
		@Pc(14) Class352 local14 = Static437.aClass199_3.method5342(arg2.method8342());
		@Pc(44) long local44 = (long) ((arg0 | 0x800000) << 7 | arg1 | arg2.method8343() << 14 | arg2.method8337() << 20);
		if (local14.anInt10102 == 0) {
			local44 |= local7;
		}
		if (local14.anInt10124 == 1) {
			local44 |= local5;
		}
		return local44 | (long) arg2.method8342() << 32;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lclient!nv;ILjava/lang/String;Z)Lclient!w;")
	public static Class362 method6163(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg1);
		OpenGL.glShaderSourceARB(local6, arg2);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static426.anIntArray425, 0);
		if (Static426.anIntArray425[0] == 0) {
			if (Static426.anIntArray425[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static426.anIntArray425, 1);
			if (Static426.anIntArray425[1] > 1) {
				@Pc(42) byte[] local42 = new byte[Static426.anIntArray425[1]];
				OpenGL.glGetInfoLogARB(local6, Static426.anIntArray425[1], Static426.anIntArray425, 0, local42, 0);
				System.out.println(new String(local42));
			}
			if (Static426.anIntArray425[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class362(arg0, local6, arg1);
	}
}
