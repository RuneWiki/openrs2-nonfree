import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
	public static int anInt1483;

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_29 = new Class45("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_28 = new Class252(73, -1);

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_30 = new Class45("slide:", "gleiten:", "glissement:", "deslizamento:");

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
	public static int anInt1482 = 503;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!mh;ILjava/lang/String;B)Lclient!nt;")
	public static Class205 method1520(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg1);
		OpenGL.glShaderSourceARB(local6, arg2);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static238.anIntArray355, 0);
		if (Static238.anIntArray355[0] == 0) {
			if (Static238.anIntArray355[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static238.anIntArray355, 1);
			if (Static238.anIntArray355[1] > 1) {
				@Pc(52) byte[] local52 = new byte[Static238.anIntArray355[1]];
				OpenGL.glGetInfoLogARB(local6, Static238.anIntArray355[1], Static238.anIntArray355, 0, local52, 0);
				System.out.println(new String(local52));
			}
			if (Static238.anIntArray355[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class205(arg0, local6, arg1);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZB)V")
	public static void method1522(@OriginalArg(1) byte arg0) {
		if (Static314.aByteArrayArrayArray12 == null) {
			Static314.aByteArrayArrayArray12 = new byte[4][Static237.anInt4563][Static373.anInt6694];
		}
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(24) int local24 = 0; local24 < Static237.anInt4563; local24++) {
				for (@Pc(28) int local28 = 0; local28 < Static373.anInt6694; local28++) {
					Static314.aByteArrayArrayArray12[local14][local24][local28] = arg0;
				}
			}
		}
	}
}
