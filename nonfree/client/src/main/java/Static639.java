import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static639 {

	@OriginalMember(owner = "client!vja", name = "f", descriptor = "I")
	public static int anInt10355;

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(CI)Z")
	public static boolean method8741(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(BLclient!kf;)I")
	public static int method8742(@OriginalArg(1) Class2_Sub1_Sub1_Sub3_Sub2 arg0) {
		@Pc(8) Class91 local8 = arg0.aClass91_1;
		if (local8.anIntArray140 != null) {
			local8 = local8.method2036(Static659.aClass363_3);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(23) int local23 = local8.anInt2355;
		@Pc(27) Class389 local27 = arg0.method4317();
		if (arg0.anInt5112 == -1 || arg0.aBoolean331) {
			local23 = local8.anInt2357;
		} else if (local27.anInt10709 == arg0.anInt5112 || local27.anInt10722 == arg0.anInt5112 || local27.anInt10714 == arg0.anInt5112 || local27.anInt10688 == arg0.anInt5112) {
			local23 = local8.anInt2327;
		} else if (local27.anInt10710 == arg0.anInt5112 || arg0.anInt5112 == local27.anInt10697 || local27.anInt10730 == arg0.anInt5112 || arg0.anInt5112 == local27.anInt10723) {
			local23 = local8.anInt2342;
		}
		return local23;
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(ILclient!pq;Ljava/lang/String;I)Lclient!hh;")
	public static Class142 method8744(@OriginalArg(0) int arg0, @OriginalArg(1) Class132_Sub3 arg1, @OriginalArg(2) String arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg0);
		OpenGL.glShaderSourceARB(local6, arg2);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static83.anIntArray90, 0);
		if (Static83.anIntArray90[0] == 0) {
			if (Static83.anIntArray90[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static83.anIntArray90, 1);
			if (Static83.anIntArray90[1] > 1) {
				@Pc(47) byte[] local47 = new byte[Static83.anIntArray90[1]];
				OpenGL.glGetInfoLogARB(local6, Static83.anIntArray90[1], Static83.anIntArray90, 0, local47, 0);
				System.out.println(new String(local47));
			}
			if (Static83.anIntArray90[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class142(arg1, local6, arg0);
	}
}
