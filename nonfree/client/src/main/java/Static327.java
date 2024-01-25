import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!lo", name = "R", descriptor = "[I")
	public static final int[] anIntArray306 = new int[6];

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILclient!ac;ZLjava/lang/String;)Lclient!v;")
	public static Class349 method5481(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub1 arg1, @OriginalArg(3) String arg2) {
		@Pc(11) long local11 = OpenGL.glCreateShaderObjectARB(arg0);
		OpenGL.glShaderSourceARB(local11, arg2);
		OpenGL.glCompileShaderARB(local11);
		OpenGL.glGetObjectParameterivARB(local11, 35713, Static201.anIntArray352, 0);
		if (Static201.anIntArray352[0] == 0) {
			if (Static201.anIntArray352[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local11, 35716, Static201.anIntArray352, 1);
			if (Static201.anIntArray352[1] > 1) {
				@Pc(49) byte[] local49 = new byte[Static201.anIntArray352[1]];
				OpenGL.glGetInfoLogARB(local11, Static201.anIntArray352[1], Static201.anIntArray352, 0, local49, 0);
				System.out.println(new String(local49));
			}
			if (Static201.anIntArray352[0] == 0) {
				OpenGL.glDeleteObjectARB(local11);
				return null;
			}
		}
		return new Class349(arg1, local11, arg0);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(II)Lclient!mu;")
	public static Class212 method5482(@OriginalArg(1) int arg0) {
		@Pc(8) Class212[] local8 = Static10.method498();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class212 local16 = local8[local10];
			if (local16.anInt6969 == arg0) {
				return local16;
			}
		}
		return null;
	}
}
