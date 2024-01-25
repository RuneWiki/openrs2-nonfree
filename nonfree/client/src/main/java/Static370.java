import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "[[Lclient!mq;")
	public static Class217[][] aClass217ArrayArray1;

	@OriginalMember(owner = "client!oba", name = "d", descriptor = "[I")
	public static int[] anIntArray501;

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method5496(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		Static397.method5822();
		Static145.method2750();
		Static429.method6077();
		Static498.method6714(arg1, arg0);
		Static381.method5635();
		Static424.method6051(Static4.aClass43_1);
		Static39.method724(Static4.aClass43_1);
		Static560.method7464(Static171.aClass246_84, Static4.aClass43_1);
		Static582.method7701();
		Static151.method2790(Static90.aClass46Array4);
		Static121.method2508();
		Static385.method5693();
		if (Static246.anInt4542 == 3) {
			Static113.method2374(4);
		} else if (Static246.anInt4542 == 7) {
			Static113.method2374(8);
		} else if (Static246.anInt4542 == 10) {
			Static113.method2374(11);
		} else if (Static246.anInt4542 == 1 || Static246.anInt4542 == 2) {
			Static551.method7382();
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lclient!jq;II[B)Lclient!pm;")
	public static Class263 method5497(@OriginalArg(0) Class43_Sub1_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg1);
		OpenGL.glShaderSourceRawARB(local6, arg2);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static460.anIntArray584, 0);
		if (Static460.anIntArray584[0] == 0) {
			if (Static460.anIntArray584[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static460.anIntArray584, 1);
			if (Static460.anIntArray584[1] > 1) {
				@Pc(54) byte[] local54 = new byte[Static460.anIntArray584[1]];
				OpenGL.glGetInfoLogARB(local6, Static460.anIntArray584[1], Static460.anIntArray584, 0, local54, 0);
				System.out.println(new String(local54));
			}
			if (Static460.anIntArray584[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class263(arg0, local6, arg1);
	}
}
