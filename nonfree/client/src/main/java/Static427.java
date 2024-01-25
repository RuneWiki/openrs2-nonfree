import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!qf", name = "o", descriptor = "[I")
	public static int[] anIntArray456;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!kfa;IILjava/lang/String;)Lclient!afa;")
	public static Class11 method6369(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg1);
		OpenGL.glShaderSourceARB(local6, arg2);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static531.anIntArray551, 0);
		if (Static531.anIntArray551[0] == 0) {
			if (Static531.anIntArray551[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static531.anIntArray551, 1);
			if (Static531.anIntArray551[1] > 1) {
				@Pc(52) byte[] local52 = new byte[Static531.anIntArray551[1]];
				OpenGL.glGetInfoLogARB(local6, Static531.anIntArray551[1], Static531.anIntArray551, 0, local52, 0);
				System.out.println(new String(local52));
			}
			if (Static531.anIntArray551[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class11(arg0, local6, arg1);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(BLclient!sj;)V")
	public static void method6370(@OriginalArg(1) Class4_Sub13_Sub2 arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static124.anInt2827; local12++) {
			@Pc(18) int local18 = Static442.anIntArray491[local12];
			@Pc(22) Class21_Sub1_Sub1_Sub1_Sub2 local22 = Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[local18];
			@Pc(26) int local26 = arg0.method7004();
			if ((local26 & 0x8) != 0) {
				local26 += arg0.method7004() << 8;
			}
			if ((local26 & 0x1000) != 0) {
				local26 += arg0.method7004() << 16;
			}
			Static369.method7617(local22, arg0, local26, local18);
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)Z")
	public static boolean method6372(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static83.method1772(arg1, arg0) || Static109.method2013(arg1, arg0);
	}
}
