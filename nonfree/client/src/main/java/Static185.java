import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(BIILclient!bda;)J")
	public static long method3034(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface2 arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = Long.MIN_VALUE;
		@Pc(14) Class330 local14 = Static370.aClass284_3.method6915(arg2.method7500());
		@Pc(44) long local44 = (long) ((arg2.method7495() | 0x10000) << 14 | arg0 | arg1 << 7 | arg2.method7496() << 20);
		if (local14.anInt9228 == 0) {
			local44 |= local7;
		}
		if (local14.anInt9217 == 1) {
			local44 |= local5;
		}
		return local44 | (long) arg2.method7500() << 32;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I[BILclient!hj;)Lclient!ws;")
	public static Class382 method3035(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) Class82_Sub3_Sub1 arg2) {
		if (arg1 == null || arg1.length == 0) {
			return null;
		}
		@Pc(13) long local13 = OpenGL.glCreateShaderObjectARB(arg0);
		OpenGL.glShaderSourceRawARB(local13, arg1);
		OpenGL.glCompileShaderARB(local13);
		OpenGL.glGetObjectParameterivARB(local13, 35713, Static477.anIntArray496, 0);
		if (Static477.anIntArray496[0] == 0) {
			if (Static477.anIntArray496[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local13, 35716, Static477.anIntArray496, 1);
			if (Static477.anIntArray496[1] > 1) {
				@Pc(66) byte[] local66 = new byte[Static477.anIntArray496[1]];
				OpenGL.glGetInfoLogARB(local13, Static477.anIntArray496[1], Static477.anIntArray496, 0, local66, 0);
				System.out.println(new String(local66));
			}
			if (Static477.anIntArray496[0] == 0) {
				OpenGL.glDeleteObjectARB(local13);
				return null;
			}
		}
		return new Class382(arg2, local13, arg0);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)I")
	public static int method3036(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(15) int local15 = local9 ^ local9 << 13;
		@Pc(34) int local34 = local15 * (local15 * 15731 * local15 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local34 >> 19 & 0xFF;
	}
}
