import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!gba", name = "d", descriptor = "J")
	public static long aLong105;

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray15 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "(III)I")
	public static int method3444(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14;
		if (arg0 > arg1) {
			local14 = arg1;
			arg1 = arg0;
			arg0 = local14;
		}
		while (arg0 != 0) {
			local14 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local14;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Lclient!qo;IB)V")
	public static void method3446(@OriginalArg(0) Class60_Sub1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg0.anIntArray256 == null) {
			return;
		}
		@Pc(16) int local16 = arg0.anIntArray256[arg1 + 1];
		if (local16 != arg0.aClass104_8.method9032()) {
			arg0.aClass104_8.method9028(local16, arg0.aClass104_8.method9031());
			arg0.anInt4880 = arg0.anInt4879;
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(III)V")
	public static void method3447(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class6_Sub2_Sub4 local11 = Static602.method8315((long) arg0, 5);
		local11.method2040();
		local11.anInt2111 = arg1;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(ILclient!ml;Ljava/lang/String;I)Lclient!uk;")
	public static Class362 method3448(@OriginalArg(0) int arg0, @OriginalArg(1) Class75_Sub3 arg1, @OriginalArg(2) String arg2) {
		@Pc(16) long local16 = OpenGL.glCreateShaderObjectARB(arg0);
		OpenGL.glShaderSourceARB(local16, arg2);
		OpenGL.glCompileShaderARB(local16);
		OpenGL.glGetObjectParameterivARB(local16, 35713, Static24.anIntArray18, 0);
		if (Static24.anIntArray18[0] == 0) {
			if (Static24.anIntArray18[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local16, 35716, Static24.anIntArray18, 1);
			if (Static24.anIntArray18[1] > 1) {
				@Pc(64) byte[] local64 = new byte[Static24.anIntArray18[1]];
				OpenGL.glGetInfoLogARB(local16, Static24.anIntArray18[1], Static24.anIntArray18, 0, local64, 0);
				System.out.println(new String(local64));
			}
			if (Static24.anIntArray18[0] == 0) {
				OpenGL.glDeleteObjectARB(local16);
				return null;
			}
		}
		return new Class362(arg1, local16, arg0);
	}
}
