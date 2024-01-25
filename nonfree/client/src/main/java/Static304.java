import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
	public static int anInt5479 = -1;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IBLclient!tj;ILclient!ha;)V")
	public static void method4642(@OriginalArg(2) Class357 arg0, @OriginalArg(4) Class67 arg1) {
		Static335.aClass357_28.method8403();
		if (Static32.aBoolean41) {
			return;
		}
		for (@Pc(22) Class3_Sub12 local22 = (Class3_Sub12) arg0.method8391(); local22 != null; local22 = (Class3_Sub12) arg0.method8392()) {
			@Pc(30) Class105 local30 = Static654.aClass98_4.method2452(local22.anInt950);
			if (Static223.method3522(local30)) {
				@Pc(42) boolean local42 = Static161.method2559(arg1, local30, local22);
				if (local42) {
					Static103.method1357(local30, arg1, local22);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Ljava/lang/String;IILclient!gia;)Lclient!gda;")
	public static Class127 method4645(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class67_Sub2 arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg1);
		OpenGL.glShaderSourceARB(local6, arg0);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static109.anIntArray107, 0);
		if (Static109.anIntArray107[0] == 0) {
			if (Static109.anIntArray107[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static109.anIntArray107, 1);
			if (Static109.anIntArray107[1] > 1) {
				@Pc(51) byte[] local51 = new byte[Static109.anIntArray107[1]];
				OpenGL.glGetInfoLogARB(local6, Static109.anIntArray107[1], Static109.anIntArray107, 0, local51, 0);
				System.out.println(new String(local51));
			}
			if (Static109.anIntArray107[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class127(arg2, local6, arg1);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(III[BIIBI[B)V")
	public static void method4647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg4 >> 2);
		@Pc(15) int local15 = -(arg4 & 0x3);
		for (@Pc(18) int local18 = -arg5; local18 < 0; local18++) {
			@Pc(28) int local28;
			for (@Pc(24) int local24 = local10; local24 < 0; local24++) {
				local28 = arg1++;
				arg7[local28] += arg3[arg0++];
				@Pc(40) int local40 = arg1++;
				arg7[local40] += arg3[arg0++];
				@Pc(52) int local52 = arg1++;
				arg7[local52] += arg3[arg0++];
				@Pc(64) int local64 = arg1++;
				arg7[local64] += arg3[arg0++];
			}
			for (@Pc(81) int local81 = local15; local81 < 0; local81++) {
				local28 = arg1++;
				arg7[local28] += arg3[arg0++];
			}
			arg0 += arg6;
			arg1 += arg2;
		}
		if (115 != 115) {
			anInt5479 = -127;
		}
	}
}
